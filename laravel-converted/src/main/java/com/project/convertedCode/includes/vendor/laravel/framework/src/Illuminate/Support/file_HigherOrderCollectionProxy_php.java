package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Support;

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

 vendor/laravel/framework/src/Illuminate/Support/HigherOrderCollectionProxy.php

*/

public class file_HigherOrderCollectionProxy_php implements RuntimeIncludable {

    public static final file_HigherOrderCollectionProxy_php instance =
            new file_HigherOrderCollectionProxy_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1609 scope = new Scope1609();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1609 scope)
            throws IncludeEventException {

        // Conversion Note: class named HigherOrderCollectionProxy was here in the source code
        env.addManualClassLoad("Illuminate\\Support\\HigherOrderCollectionProxy");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Support/HigherOrderCollectionProxy.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1609 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
