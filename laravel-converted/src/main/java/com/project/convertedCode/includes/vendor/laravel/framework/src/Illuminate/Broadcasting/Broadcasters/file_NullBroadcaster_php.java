package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Broadcasting.Broadcasters;

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

 vendor/laravel/framework/src/Illuminate/Broadcasting/Broadcasters/NullBroadcaster.php

*/

public class file_NullBroadcaster_php implements RuntimeIncludable {

    public static final file_NullBroadcaster_php instance = new file_NullBroadcaster_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope917 scope = new Scope917();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope917 scope)
            throws IncludeEventException {

        // Conversion Note: class named NullBroadcaster was here in the source code
        env.addManualClassLoad("Illuminate\\Broadcasting\\Broadcasters\\NullBroadcaster");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Broadcasting/Broadcasters")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Broadcasting/Broadcasters/NullBroadcaster.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope917 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
