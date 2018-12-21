package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Routing.Exceptions;

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

 vendor/laravel/framework/src/Illuminate/Routing/Exceptions/InvalidSignatureException.php

*/

public class file_InvalidSignatureException_php implements RuntimeIncludable {

    public static final file_InvalidSignatureException_php instance =
            new file_InvalidSignatureException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1518 scope = new Scope1518();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1518 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named InvalidSignatureException was here in the source code
        env.addManualClassLoad("Illuminate\\Routing\\Exceptions\\InvalidSignatureException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Routing/Exceptions")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Routing/Exceptions/InvalidSignatureException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1518 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
