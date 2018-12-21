package com.project.convertedCode.includes.vendor.paragonie.random_compat.lib;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_define;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/paragonie/random_compat/lib/random_bytes_dev_urandom.php

*/

public class file_random_bytes_dev_urandom_php implements RuntimeIncludable {

    public static final file_random_bytes_dev_urandom_php instance =
            new file_random_bytes_dev_urandom_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2251 scope = new Scope2251();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2251 scope)
            throws IncludeEventException {
        if (!function_defined.f.env(env).call("RANDOM_COMPAT_READ_BUFFER").getBool()) {
            function_define.f.env(env).call("RANDOM_COMPAT_READ_BUFFER", 8);
        }

        if (!function_is_callable.f.env(env).call("random_bytes").getBool()) {
            // a function named random_bytes was defined here with PHP code
            env.addManualFunctionLoad("random_bytes");
        }
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/paragonie/random_compat/lib")
                    .setFile("/vendor/paragonie/random_compat/lib/random_bytes_dev_urandom.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2251 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
