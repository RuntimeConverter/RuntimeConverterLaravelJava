package com.project.convertedCode.includes.vendor.paragonie.random_compat;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.functions.random_int;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/paragonie/random_compat/psalm-autoload.php

*/

public class file_psalm_autoload_php implements RuntimeIncludable {

    public static final file_psalm_autoload_php instance = new file_psalm_autoload_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2257 scope = new Scope2257();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2257 scope)
            throws IncludeEventException {
        env.include("lib/byte_safe_strings.php", stack, this, true, true);
        env.include("lib/cast_to_int.php", stack, this, true, true);
        env.include("lib/error_polyfill.php", stack, this, true, true);
        env.include("other/ide_stubs/libsodium.php", stack, this, true, true);
        env.include("lib/random.php", stack, this, true, true);
        scope._pInt = random_int.f.env(env).call(0, 65536).value();
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/paragonie/random_compat")
                    .setFile("/vendor/paragonie/random_compat/psalm-autoload.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2257 implements UpdateRuntimeScopeInterface {

        Object _pInt;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("int", this._pInt);
        }

        public void updateScope(RuntimeStack stack) {

            this._pInt = stack.getVariable("int");
        }
    }
}
