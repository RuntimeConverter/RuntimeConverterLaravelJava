package com.project.convertedCode.includes.vendor.composer;

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

 vendor/composer/autoload_real.php

*/

public class file_autoload_real_php implements RuntimeIncludable {

    public static final file_autoload_real_php instance = new file_autoload_real_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope236 scope = new Scope236();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope236 scope)
            throws IncludeEventException {
        // Conversion Note: class named ComposerAutoloaderInitd1518bf2342e63421aef0615412c1b88 was
        // here in the source code
        env.addManualClassLoad("ComposerAutoloaderInitd1518bf2342e63421aef0615412c1b88");
        // a function named composerRequired1518bf2342e63421aef0615412c1b88 was defined here with
        // PHP code
        env.addManualFunctionLoad("composerRequired1518bf2342e63421aef0615412c1b88");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/composer")
                    .setFile("/vendor/composer/autoload_real.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope236 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
