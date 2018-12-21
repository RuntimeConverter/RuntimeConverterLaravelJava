package com.project.convertedCode.includes.vendor.league.flysystem.src.Adapter.Polyfill;

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

 vendor/league/flysystem/src/Adapter/Polyfill/StreamedTrait.php

*/

public class file_StreamedTrait_php implements RuntimeIncludable {

    public static final file_StreamedTrait_php instance = new file_StreamedTrait_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1708 scope = new Scope1708();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1708 scope)
            throws IncludeEventException {

        // Conversion Note: class named StreamedTrait was here in the source code
        env.addManualClassLoad("League\\Flysystem\\Adapter\\Polyfill\\StreamedTrait");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/league/flysystem/src/Adapter/Polyfill")
                    .setFile("/vendor/league/flysystem/src/Adapter/Polyfill/StreamedTrait.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1708 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
