package com.project.convertedCode.includes.vendor.jakub_onderka.php_console_highlighter.src.JakubOnderka.PhpConsoleHighlighter;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/jakub-onderka/php-console-highlighter/src/JakubOnderka/PhpConsoleHighlighter/Highlighter.php

*/

public class file_Highlighter_php implements RuntimeIncludable {

    public static final file_Highlighter_php instance = new file_Highlighter_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope872 scope = new Scope872();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope872 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named Highlighter was here in the source code
        env.addManualClassLoad("JakubOnderka\\PhpConsoleHighlighter\\Highlighter");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir(
                            "/vendor/jakub-onderka/php-console-highlighter/src/JakubOnderka/PhpConsoleHighlighter")
                    .setFile(
                            "/vendor/jakub-onderka/php-console-highlighter/src/JakubOnderka/PhpConsoleHighlighter/Highlighter.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope872 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
