package com.project.convertedCode.includes.vendor.nunomaduro.collision.src.Contracts;

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

 vendor/nunomaduro/collision/src/Contracts/ArgumentFormatter.php

*/

public class file_ArgumentFormatter_php implements RuntimeIncludable {

    public static final file_ArgumentFormatter_php instance = new file_ArgumentFormatter_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2237 scope = new Scope2237();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2237 scope)
            throws IncludeEventException {

        // Conversion Note: class named ArgumentFormatter was here in the source code
        env.addManualClassLoad("NunoMaduro\\Collision\\Contracts\\ArgumentFormatter");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nunomaduro/collision/src/Contracts")
                    .setFile("/vendor/nunomaduro/collision/src/Contracts/ArgumentFormatter.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2237 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
