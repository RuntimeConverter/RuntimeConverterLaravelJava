package com.project.convertedCode.includes.vendor.paragonie.random_compat.lib;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/paragonie/random_compat/lib/error_polyfill.php

*/

public class file_error_polyfill_php implements RuntimeIncludable {

    public static final file_error_polyfill_php instance = new file_error_polyfill_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2248 scope = new Scope2248();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2248 scope)
            throws IncludeEventException {
        if (!function_class_exists.f.env(env).call("Error", false).getBool()) {
            // Conversion Note: class named Error was here in the source code
            env.addManualClassLoad("Error");
        }

        if (!function_class_exists.f.env(env).call("TypeError", false).getBool()) {
            if (NamespaceGlobal.is_subclass_of.env(env).call("Error", "Exception").getBool()) {
                // Conversion Note: class named TypeError was here in the source code
                env.addManualClassLoad("TypeError");

            } else {
                // Conversion Note: class named TypeError was here in the source code
                env.addManualClassLoad("TypeError");
            }
        }
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/paragonie/random_compat/lib")
                    .setFile("/vendor/paragonie/random_compat/lib/error_polyfill.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2248 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
