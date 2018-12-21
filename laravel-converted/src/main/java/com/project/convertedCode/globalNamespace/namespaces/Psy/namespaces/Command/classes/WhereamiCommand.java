package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.Configuration;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match_all;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.ConsoleColorFactory;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reverse;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.file.function_getcwd;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import com.project.convertedCode.globalNamespace.namespaces.JakubOnderka.namespaces.PhpConsoleHighlighter.classes.Highlighter;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Output.classes.ShellOutput;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.RuntimeStack;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes.Command;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Command/WhereamiCommand.php

*/

public class WhereamiCommand extends Command {

    public Object colorMode = null;

    public Object backtrace = null;

    public WhereamiCommand(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == WhereamiCommand.class) {
            this.__construct(env, args);
        }
    }

    public WhereamiCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "colorMode",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object colorMode = assignParameter(args, 0, true);
        if (null == colorMode) {
            colorMode = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.colorMode =
                ZVal.isTrue(ternaryExpressionTemp = colorMode)
                        ? ternaryExpressionTemp
                        : Configuration.CONST_COLOR_MODE_AUTO;
        this.backtrace = NamespaceGlobal.debug_backtrace.env(env).call(2).value();
        super.__construct(env);
        return null;
    }

    @ConvertedMethod
    protected Object configure(RuntimeEnv env, Object... args) {
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(this, "setName", WhereamiCommand.class, "whereami"),
                                "setDefinition",
                                WhereamiCommand.class,
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                new InputOption(
                                                        env,
                                                        "num",
                                                        "n",
                                                        InputOption.CONST_VALUE_OPTIONAL,
                                                        "Number of lines before and after.",
                                                        "5")))),
                        "setDescription",
                        WhereamiCommand.class,
                        "Show where you are in the code."),
                "setHelp",
                WhereamiCommand.class,
                "Show where you are in the code.\n\nOptionally, include how many lines before and after you want to display.\n\ne.g.\n<return>> whereami </return>\n<return>> whereami -n10</return>");
        return null;
    }

    @ConvertedMethod
    protected Object trace(RuntimeEnv env, Object... args) {
        Object stackFrame = null;
        for (ZPair zpairResult1385 :
                ZVal.getIterable(
                        function_array_reverse.f.env(env).call(this.backtrace).value(),
                        env,
                        true)) {
            stackFrame = ZVal.assign(zpairResult1385.getValue());
            if (ZVal.isTrue(
                    env.callMethod(this, "isDebugCall", WhereamiCommand.class, stackFrame))) {
                return ZVal.assign(stackFrame);
            }
        }

        return ZVal.assign(function_end.f.env(env).call(this.backtrace).value());
    }

    @ConvertedMethod
    protected Object fileInfo(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope172 scope = new Scope172();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/psy/psysh/src/Command")
                            .setFile("/vendor/psy/psysh/src/Command/WhereamiCommand.php");
            scope.file = null;
            scope.stackFrame = new BasicReferenceContainer(null);
            scope.line = null;
            scope.matches = new BasicReferenceContainer(null);
            scope.stackFrame.setObject(this.trace(env));
            if (function_preg_match
                    .f
                    .env(env)
                    .call("/eval\\(/", scope.stackFrame.arrayGet(env, "file"))
                    .getBool()) {
                function_preg_match_all
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(2, scope.matches))
                        .call(
                                "/([^\\(]+)\\((\\d+)/",
                                scope.stackFrame.arrayGet(env, "file"),
                                scope.matches.getObject());
                scope.file = ZVal.assign(scope.matches.arrayGet(env, 1, 0));
                scope.line = ZVal.assign(ZVal.toLong(scope.matches.arrayGet(env, 2, 0)));

            } else {
                scope.file = ZVal.assign(scope.stackFrame.arrayGet(env, "file"));
                scope.line = ZVal.assign(scope.stackFrame.arrayGet(env, "line"));
            }

            throw new IncludeEventException(
                    ZVal.assign(function_compact.f.env(env).call(stack, "file", "line").value()));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "input",
        typeHint = "Symfony\\Component\\Console\\Input\\InputInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    protected Object execute(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object output = assignParameter(args, 1, false);
        Object factory = null;
        Object highlighter = null;
        Object contents = null;
        Object num = null;
        Object colors = null;
        ReferenceContainer info = new BasicReferenceContainer(null);
        info.setObject(this.fileInfo(env));
        num = env.callMethod(input, "getOption", WhereamiCommand.class, "num");
        factory = new ConsoleColorFactory(env, this.colorMode);
        colors = env.callMethod(factory, "getConsoleColor", WhereamiCommand.class);
        highlighter = new Highlighter(env, colors);
        contents = function_file_get_contents.f.env(env).call(info.arrayGet(env, "file")).value();
        env.callMethod(output, "startPaging", WhereamiCommand.class);
        env.callMethod(output, "writeln", WhereamiCommand.class, "");
        env.callMethod(
                output,
                "writeln",
                WhereamiCommand.class,
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "From <info>%s:%s</info>:",
                                this.replaceCwd(env, info.arrayGet(env, "file")),
                                info.arrayGet(env, "line"))
                        .value());
        env.callMethod(output, "writeln", WhereamiCommand.class, "");
        env.callMethod(
                output,
                "write",
                WhereamiCommand.class,
                env.callMethod(
                        highlighter,
                        "getCodeSnippet",
                        WhereamiCommand.class,
                        contents,
                        info.arrayGet(env, "line"),
                        num,
                        num),
                ShellOutput.CONST_OUTPUT_RAW);
        env.callMethod(output, "stopPaging", WhereamiCommand.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    private Object replaceCwd(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        Object cwd = null;
        cwd = function_getcwd.f.env(env).call().value();
        if (ZVal.strictEqualityCheck(cwd, "===", false)) {
            return ZVal.assign(file);
        }

        cwd =
                toStringR(function_rtrim.f.env(env).call(cwd, "/").value(), env)
                        + toStringR("/", env);
        return ZVal.assign(
                function_preg_replace
                        .f
                        .env(env)
                        .call(
                                "/^"
                                        + toStringR(
                                                NamespaceGlobal.preg_quote
                                                        .env(env)
                                                        .call(cwd, "/")
                                                        .value(),
                                                env)
                                        + "/",
                                "",
                                file)
                        .value());
    }

    public static final Object CONST_class = "Psy\\Command\\WhereamiCommand";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Command.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "stackFrame", typeHint = "array")
        private Object isDebugCall(RuntimeEnv env, Object... args) {
            ReferenceContainer stackFrame =
                    new BasicReferenceContainer(assignParameter(args, 0, false));
            Object function = null;
            Object _pClass = null;
            _pClass =
                    ZVal.assign(
                            arrayActionR(ArrayAction.ISSET, stackFrame, env, "class")
                                    ? stackFrame.arrayGet(env, "class")
                                    : ZVal.getNull());
            function =
                    ZVal.assign(
                            arrayActionR(ArrayAction.ISSET, stackFrame, env, "function")
                                    ? stackFrame.arrayGet(env, "function")
                                    : ZVal.getNull());
            return ZVal.assign(
                    ZVal.toBool(
                                    ZVal.toBool(
                                                    ZVal.strictEqualityCheck(
                                                            _pClass, "===", ZVal.getNull()))
                                            && ZVal.toBool(
                                                    ZVal.strictEqualityCheck(
                                                            function, "===", "Psy\\debug")))
                            || ZVal.toBool(
                                    ZVal.toBool(
                                                    ZVal.strictEqualityCheck(
                                                            _pClass, "===", "Psy\\Shell"))
                                            && ZVal.toBool(
                                                    function_in_array
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    function,
                                                                    ZVal.arrayFromList(
                                                                            "__construct", "debug"))
                                                            .value())));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Command\\WhereamiCommand")
                    .setLookup(
                            WhereamiCommand.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "aliases",
                            "application",
                            "applicationDefinitionMerged",
                            "applicationDefinitionMergedWithArgs",
                            "backtrace",
                            "code",
                            "colorMode",
                            "definition",
                            "description",
                            "help",
                            "helperSet",
                            "hidden",
                            "ignoreValidationErrors",
                            "name",
                            "processTitle",
                            "synopsis",
                            "usages")
                    .setFilename("vendor/psy/psysh/src/Command/WhereamiCommand.php")
                    .addExtendsClass("Psy\\Command\\Command")
                    .addExtendsClass("Symfony\\Component\\Console\\Command\\Command")
                    .get();

    @Override
    public ReflectionClassData getRuntimeConverterReflectionData() {
        return runtimeConverterReflectionData;
    }

    @Override
    public Object converterRuntimeCallExtended(
            RuntimeEnv env,
            String method,
            Class<?> caller,
            PassByReferenceArgs passByReferenceArgs,
            Object... args) {
        return RuntimeClassBase.converterRuntimeCallExtendedWithDataStatic(
                this,
                runtimeConverterReflectionData,
                env,
                method,
                caller,
                passByReferenceArgs,
                args);
    }

    private static class Scope172 implements UpdateRuntimeScopeInterface {

        Object file;
        ReferenceContainer stackFrame;
        Object line;
        Object _thisVarAlias;
        ReferenceContainer matches;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("file", this.file);
            stack.setVariable("stackFrame", this.stackFrame);
            stack.setVariable("line", this.line);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("matches", this.matches);
        }

        public void updateScope(RuntimeStack stack) {

            this.file = stack.getVariable("file");
            this.stackFrame = ZVal.getStackReference(stack.getVariable("stackFrame"));
            this.line = stack.getVariable("line");
            this._thisVarAlias = stack.getVariable("this");
            this.matches = ZVal.getStackReference(stack.getVariable("matches"));
        }
    }
}
