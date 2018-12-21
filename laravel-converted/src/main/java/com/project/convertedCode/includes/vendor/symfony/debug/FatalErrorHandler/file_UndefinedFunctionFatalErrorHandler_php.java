package com.project.convertedCode.includes.vendor.symfony.debug.FatalErrorHandler;

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

 vendor/symfony/debug/FatalErrorHandler/UndefinedFunctionFatalErrorHandler.php

*/

public class file_UndefinedFunctionFatalErrorHandler_php implements RuntimeIncludable {

    public static final file_UndefinedFunctionFatalErrorHandler_php instance =
            new file_UndefinedFunctionFatalErrorHandler_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3281 scope = new Scope3281();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3281 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Namespace import was here
        // Conversion Note: class named UndefinedFunctionFatalErrorHandler was here in the source
        // code
        env.addManualClassLoad(
                "Symfony\\Component\\Debug\\FatalErrorHandler\\UndefinedFunctionFatalErrorHandler");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/debug/FatalErrorHandler")
                    .setFile(
                            "/vendor/symfony/debug/FatalErrorHandler/UndefinedFunctionFatalErrorHandler.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3281 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
