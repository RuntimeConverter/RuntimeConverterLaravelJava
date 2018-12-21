package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Queue;

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

 vendor/laravel/framework/src/Illuminate/Queue/SerializesAndRestoresModelIdentifiers.php

*/

public class file_SerializesAndRestoresModelIdentifiers_php implements RuntimeIncludable {

    public static final file_SerializesAndRestoresModelIdentifiers_php instance =
            new file_SerializesAndRestoresModelIdentifiers_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1492 scope = new Scope1492();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1492 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Conversion Note: class named SerializesAndRestoresModelIdentifiers was here in the source
        // code
        env.addManualClassLoad("Illuminate\\Queue\\SerializesAndRestoresModelIdentifiers");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Queue")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Queue/SerializesAndRestoresModelIdentifiers.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1492 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
