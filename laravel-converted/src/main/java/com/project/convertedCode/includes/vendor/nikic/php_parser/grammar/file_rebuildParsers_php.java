package com.project.convertedCode.includes.vendor.nikic.php_parser.grammar;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.project.convertedCode.globalNamespace.functions.removeTrailingWhitespace;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.project.convertedCode.globalNamespace.functions.resolveStackAccess;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_flip;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.RuntimeStack;
import com.project.convertedCode.globalNamespace.functions.resolveNodes;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import com.project.convertedCode.globalNamespace.functions.resolveMacros;
import com.project.convertedCode.globalNamespace.functions.ensureDirExists;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/grammar/rebuildParsers.php

*/

public class file_rebuildParsers_php implements RuntimeIncludable {

    public static final file_rebuildParsers_php instance = new file_rebuildParsers_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2017 scope = new Scope2017();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2017 scope)
            throws IncludeEventException {
        scope.grammarFileToName =
                ZVal.newArray(
                        new ZPair(
                                toStringR(
                                                env.addRootFilesystemPrefix(
                                                        "/vendor/nikic/php-parser/grammar"),
                                                env)
                                        + "/php5.y",
                                "Php5"),
                        new ZPair(
                                toStringR(
                                                env.addRootFilesystemPrefix(
                                                        "/vendor/nikic/php-parser/grammar"),
                                                env)
                                        + "/php7.y",
                                "Php7"));
        scope.tokensFile =
                toStringR(env.addRootFilesystemPrefix("/vendor/nikic/php-parser/grammar"), env)
                        + "/tokens.y";
        scope.tokensTemplate =
                toStringR(env.addRootFilesystemPrefix("/vendor/nikic/php-parser/grammar"), env)
                        + "/tokens.template";
        scope.skeletonFile =
                toStringR(env.addRootFilesystemPrefix("/vendor/nikic/php-parser/grammar"), env)
                        + "/parser.template";
        scope.tmpGrammarFile =
                toStringR(env.addRootFilesystemPrefix("/vendor/nikic/php-parser/grammar"), env)
                        + "/tmp_parser.phpy";
        scope.tmpResultFile =
                toStringR(env.addRootFilesystemPrefix("/vendor/nikic/php-parser/grammar"), env)
                        + "/tmp_parser.php";
        scope.resultDir =
                toStringR(env.addRootFilesystemPrefix("/vendor/nikic/php-parser/grammar"), env)
                        + "/../lib/PhpParser/Parser";
        scope.tokensResultsFile = toStringR(scope.resultDir, env) + "/Tokens.php";
        scope.kmyacc =
                toStringR(env.addRootFilesystemPrefix("/vendor/nikic/php-parser/grammar"), env)
                        + "/kmyacc.exe";
        if (!function_file_exists.f.env(env).call(scope.kmyacc).getBool()) {
            scope.kmyacc = "kmyacc";
        }

        scope.options.setObject(function_array_flip.f.env(env).call(scope.argv).value());
        scope.optionDebug =
                ZVal.assign(arrayActionR(ArrayAction.ISSET, scope.options, env, "--debug"));
        scope.optionKeepTmpGrammar =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, scope.options, env, "--keep-tmp-grammar"));
        env.defineConstant(
                null,
                "LIB",
                "(?(DEFINE)\n    (?<singleQuotedString>'[^\\\\']*+(?:\\\\.[^\\\\']*+)*+')\n    (?<doubleQuotedString>\"[^\\\\\"]*+(?:\\\\.[^\\\\\"]*+)*+\")\n    (?<string>(?&singleQuotedString)|(?&doubleQuotedString))\n    (?<comment>/\\*[^*]*+(?:\\*(?!/)[^*]*+)*+\\*/)\n    (?<code>\\{[^'\"/{}]*+(?:(?:(?&string)|(?&comment)|(?&code)|/)[^'\"/{}]*+)*+})\n)");

        env.defineConstant(
                null, "PARAMS", "\\[(?<params>[^[\\]]*+(?:\\[(?&params)\\][^[\\]]*+)*+)\\]");

        env.defineConstant(null, "ARGS", "\\((?<args>[^()]*+(?:\\((?&args)\\)[^()]*+)*+)\\)");

        scope.tokens = function_file_get_contents.f.env(env).call(scope.tokensFile).value();
        for (ZPair zpairResult837 : ZVal.getIterable(scope.grammarFileToName, env, false)) {
            scope.grammarFile = ZVal.assign(zpairResult837.getKey());
            scope.name = ZVal.assign(zpairResult837.getValue());
            env.echo("Building temporary " + toStringR(scope.name, env) + " grammar file.\n");
            scope.grammarCode =
                    function_file_get_contents.f.env(env).call(scope.grammarFile).value();
            scope.grammarCode =
                    function_str_replace
                            .f
                            .env(env)
                            .call("%tokens", scope.tokens, scope.grammarCode)
                            .value();
            scope.grammarCode = resolveNodes.f.env(env).call(scope.grammarCode).value();
            scope.grammarCode = resolveMacros.f.env(env).call(scope.grammarCode).value();
            scope.grammarCode = resolveStackAccess.f.env(env).call(scope.grammarCode).value();
            NamespaceGlobal.file_put_contents
                    .env(env)
                    .call(scope.tmpGrammarFile, scope.grammarCode);
            scope.additionalArgs = ZVal.assign(ZVal.isTrue(scope.optionDebug) ? "-t -v" : "");
            env.echo("Building " + toStringR(scope.name, env) + " parser.\n");
            scope.output =
                    function_trim
                            .f
                            .env(env)
                            .call(
                                    NamespaceGlobal.shell_exec
                                            .env(env)
                                            .call(
                                                    toStringR(scope.kmyacc, env)
                                                            + " "
                                                            + toStringR(scope.additionalArgs, env)
                                                            + " -l -m "
                                                            + toStringR(scope.skeletonFile, env)
                                                            + " -p "
                                                            + toStringR(scope.name, env)
                                                            + " "
                                                            + toStringR(scope.tmpGrammarFile, env)
                                                            + " 2>&1")
                                            .value())
                            .value();
            env.echo("Output: \"" + toStringR(scope.output, env) + "\"\n");
            scope.resultCode =
                    function_file_get_contents.f.env(env).call(scope.tmpResultFile).value();
            scope.resultCode = removeTrailingWhitespace.f.env(env).call(scope.resultCode).value();
            ensureDirExists.f.env(env).call(scope.resultDir);
            NamespaceGlobal.file_put_contents
                    .env(env)
                    .call(
                            toStringR(scope.resultDir, env)
                                    + "/"
                                    + toStringR(scope.name, env)
                                    + ".php",
                            scope.resultCode);
            NamespaceGlobal.unlink.env(env).call(scope.tmpResultFile);
            env.echo("Building token definition.\n");
            scope.output =
                    function_trim
                            .f
                            .env(env)
                            .call(
                                    NamespaceGlobal.shell_exec
                                            .env(env)
                                            .call(
                                                    toStringR(scope.kmyacc, env)
                                                            + " -l -m "
                                                            + toStringR(scope.tokensTemplate, env)
                                                            + " "
                                                            + toStringR(scope.tmpGrammarFile, env)
                                                            + " 2>&1")
                                            .value())
                            .value();
            com.runtimeconverter.runtime.ZVal.functionNotFound("_pAssert")
                    .env(env)
                    .call(ZVal.strictEqualityCheck(scope.output, "===", ""));
            NamespaceGlobal.rename.env(env).call(scope.tmpResultFile, scope.tokensResultsFile);
            if (!ZVal.isTrue(scope.optionKeepTmpGrammar)) {
                NamespaceGlobal.unlink.env(env).call(scope.tmpGrammarFile);
            }
        }

        // a function named resolveNodes was defined here with PHP code
        env.addManualFunctionLoad("resolveNodes");
        // a function named resolveMacros was defined here with PHP code
        env.addManualFunctionLoad("resolveMacros");
        // a function named assertArgs was defined here with PHP code
        env.addManualFunctionLoad("assertArgs");
        // a function named resolveStackAccess was defined here with PHP code
        env.addManualFunctionLoad("resolveStackAccess");
        // a function named removeTrailingWhitespace was defined here with PHP code
        env.addManualFunctionLoad("removeTrailingWhitespace");
        // a function named ensureDirExists was defined here with PHP code
        env.addManualFunctionLoad("ensureDirExists");
        // a function named regex was defined here with PHP code
        env.addManualFunctionLoad("regex");
        // a function named magicSplit was defined here with PHP code
        env.addManualFunctionLoad("magicSplit");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nikic/php-parser/grammar")
                    .setFile("/vendor/nikic/php-parser/grammar/rebuildParsers.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2017 implements UpdateRuntimeScopeInterface {

        Object optionDebug;
        Object kmyacc;
        Object tokensFile;
        Object resultCode;
        Object grammarFileToName;
        Object tmpGrammarFile;
        Object tokensResultsFile;
        Object optionKeepTmpGrammar;
        Object argv;
        Object additionalArgs;
        Object grammarCode;
        Object output;
        Object skeletonFile;
        Object tmpResultFile;
        ReferenceContainer options;
        Object name;
        Object grammarFile;
        Object tokens;
        Object resultDir;
        Object tokensTemplate;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("optionDebug", this.optionDebug);
            stack.setVariable("kmyacc", this.kmyacc);
            stack.setVariable("tokensFile", this.tokensFile);
            stack.setVariable("resultCode", this.resultCode);
            stack.setVariable("grammarFileToName", this.grammarFileToName);
            stack.setVariable("tmpGrammarFile", this.tmpGrammarFile);
            stack.setVariable("tokensResultsFile", this.tokensResultsFile);
            stack.setVariable("optionKeepTmpGrammar", this.optionKeepTmpGrammar);
            stack.setVariable("argv", this.argv);
            stack.setVariable("additionalArgs", this.additionalArgs);
            stack.setVariable("grammarCode", this.grammarCode);
            stack.setVariable("output", this.output);
            stack.setVariable("skeletonFile", this.skeletonFile);
            stack.setVariable("tmpResultFile", this.tmpResultFile);
            stack.setVariable("options", this.options);
            stack.setVariable("name", this.name);
            stack.setVariable("grammarFile", this.grammarFile);
            stack.setVariable("tokens", this.tokens);
            stack.setVariable("resultDir", this.resultDir);
            stack.setVariable("tokensTemplate", this.tokensTemplate);
        }

        public void updateScope(RuntimeStack stack) {

            this.optionDebug = stack.getVariable("optionDebug");
            this.kmyacc = stack.getVariable("kmyacc");
            this.tokensFile = stack.getVariable("tokensFile");
            this.resultCode = stack.getVariable("resultCode");
            this.grammarFileToName = stack.getVariable("grammarFileToName");
            this.tmpGrammarFile = stack.getVariable("tmpGrammarFile");
            this.tokensResultsFile = stack.getVariable("tokensResultsFile");
            this.optionKeepTmpGrammar = stack.getVariable("optionKeepTmpGrammar");
            this.argv = stack.getVariable("argv");
            this.additionalArgs = stack.getVariable("additionalArgs");
            this.grammarCode = stack.getVariable("grammarCode");
            this.output = stack.getVariable("output");
            this.skeletonFile = stack.getVariable("skeletonFile");
            this.tmpResultFile = stack.getVariable("tmpResultFile");
            this.options = ZVal.getStackReference(stack.getVariable("options"));
            this.name = stack.getVariable("name");
            this.grammarFile = stack.getVariable("grammarFile");
            this.tokens = stack.getVariable("tokens");
            this.resultDir = stack.getVariable("resultDir");
            this.tokensTemplate = stack.getVariable("tokensTemplate");
        }
    }
}
