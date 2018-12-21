package com.project.convertedCode.includes.vendor.jakub_onderka.php_console_color.src.JakubOnderka.PhpConsoleColor;

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

 vendor/jakub-onderka/php-console-color/src/JakubOnderka/PhpConsoleColor/ConsoleColor.php

*/

public class file_ConsoleColor_php implements RuntimeIncludable {

    public static final file_ConsoleColor_php instance = new file_ConsoleColor_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope867 scope = new Scope867();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope867 scope)
            throws IncludeEventException {

        // Conversion Note: class named ConsoleColor was here in the source code
        env.addManualClassLoad("JakubOnderka\\PhpConsoleColor\\ConsoleColor");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir(
                            "/vendor/jakub-onderka/php-console-color/src/JakubOnderka/PhpConsoleColor")
                    .setFile(
                            "/vendor/jakub-onderka/php-console-color/src/JakubOnderka/PhpConsoleColor/ConsoleColor.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope867 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
