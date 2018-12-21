package com.project.convertedCode.includes.vendor.jakub_onderka.php_console_highlighter.examples;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.JakubOnderka.namespaces.PhpConsoleColor.classes.ConsoleColor;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.JakubOnderka.namespaces.PhpConsoleHighlighter.classes.Highlighter;
import static com.runtimeconverter.runtime.ZVal.toStringR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/jakub-onderka/php-console-highlighter/examples/whole_file.php

*/

public class file_whole_file_php implements RuntimeIncludable {

    public static final file_whole_file_php instance = new file_whole_file_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope870 scope = new Scope870();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope870 scope)
            throws IncludeEventException {
        // Namespace import was here
        // Namespace import was here
        env.include(
                toStringR(
                                env.addRootFilesystemPrefix(
                                        "/vendor/jakub-onderka/php-console-highlighter/examples"),
                                env)
                        + "/../vendor/autoload.php",
                stack,
                this,
                true,
                false);
        scope.highlighter = new Highlighter(env, new ConsoleColor(env));
        scope.fileContent =
                function_file_get_contents
                        .f
                        .env(env)
                        .call(
                                env.addRootFilesystemPrefix(
                                        "/vendor/jakub-onderka/php-console-highlighter/examples/whole_file.php"))
                        .value();
        env.echo(
                env.callMethod(
                        scope.highlighter,
                        "getWholeFile",
                        file_whole_file_php.class,
                        scope.fileContent));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/jakub-onderka/php-console-highlighter/examples")
                    .setFile(
                            "/vendor/jakub-onderka/php-console-highlighter/examples/whole_file.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope870 implements UpdateRuntimeScopeInterface {

        Object highlighter;
        Object fileContent;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("highlighter", this.highlighter);
            stack.setVariable("fileContent", this.fileContent);
        }

        public void updateScope(RuntimeStack stack) {

            this.highlighter = stack.getVariable("highlighter");
            this.fileContent = stack.getVariable("fileContent");
        }
    }
}
