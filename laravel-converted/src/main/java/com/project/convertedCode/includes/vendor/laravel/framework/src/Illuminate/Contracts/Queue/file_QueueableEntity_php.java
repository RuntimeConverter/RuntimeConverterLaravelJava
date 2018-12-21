package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Contracts.Queue;

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

 vendor/laravel/framework/src/Illuminate/Contracts/Queue/QueueableEntity.php

*/

public class file_QueueableEntity_php implements RuntimeIncludable {

    public static final file_QueueableEntity_php instance = new file_QueueableEntity_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1043 scope = new Scope1043();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1043 scope)
            throws IncludeEventException {

        // Conversion Note: class named QueueableEntity was here in the source code
        env.addManualClassLoad("Illuminate\\Contracts\\Queue\\QueueableEntity");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Contracts/Queue")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Contracts/Queue/QueueableEntity.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1043 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
