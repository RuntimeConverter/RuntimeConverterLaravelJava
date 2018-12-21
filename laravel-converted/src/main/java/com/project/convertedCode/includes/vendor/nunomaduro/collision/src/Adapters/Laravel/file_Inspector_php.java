package com.project.convertedCode.includes.vendor.nunomaduro.collision.src.Adapters.Laravel;

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

 vendor/nunomaduro/collision/src/Adapters/Laravel/Inspector.php

*/

public class file_Inspector_php implements RuntimeIncludable {

    public static final file_Inspector_php instance = new file_Inspector_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2233 scope = new Scope2233();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2233 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named Inspector was here in the source code
        env.addManualClassLoad("NunoMaduro\\Collision\\Adapters\\Laravel\\Inspector");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nunomaduro/collision/src/Adapters/Laravel")
                    .setFile("/vendor/nunomaduro/collision/src/Adapters/Laravel/Inspector.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2233 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
