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

 vendor/jakub-onderka/php-console-color/src/JakubOnderka/PhpConsoleColor/InvalidStyleException.php

*/

public class file_InvalidStyleException_php implements RuntimeIncludable {

    public static final file_InvalidStyleException_php instance =
            new file_InvalidStyleException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope868 scope = new Scope868();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope868 scope)
            throws IncludeEventException {

        // Conversion Note: class named InvalidStyleException was here in the source code
        env.addManualClassLoad("JakubOnderka\\PhpConsoleColor\\InvalidStyleException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir(
                            "/vendor/jakub-onderka/php-console-color/src/JakubOnderka/PhpConsoleColor")
                    .setFile(
                            "/vendor/jakub-onderka/php-console-color/src/JakubOnderka/PhpConsoleColor/InvalidStyleException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope868 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
