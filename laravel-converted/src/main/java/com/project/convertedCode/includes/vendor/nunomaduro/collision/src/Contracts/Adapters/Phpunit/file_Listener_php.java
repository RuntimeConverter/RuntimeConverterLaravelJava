package com.project.convertedCode.includes.vendor.nunomaduro.collision.src.Contracts.Adapters.Phpunit;

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

 vendor/nunomaduro/collision/src/Contracts/Adapters/Phpunit/Listener.php

*/

public class file_Listener_php implements RuntimeIncludable {

    public static final file_Listener_php instance = new file_Listener_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2236 scope = new Scope2236();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2236 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named Listener was here in the source code
        env.addManualClassLoad("NunoMaduro\\Collision\\Contracts\\Adapters\\Phpunit\\Listener");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nunomaduro/collision/src/Contracts/Adapters/Phpunit")
                    .setFile(
                            "/vendor/nunomaduro/collision/src/Contracts/Adapters/Phpunit/Listener.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2236 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
