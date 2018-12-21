package com.project.convertedCode.includes.vendor.symfony.var_dumper.Resources.functions;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Resources/functions/dump.php

*/

public class file_dump_php implements RuntimeIncludable {

    public static final file_dump_php instance = new file_dump_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3708 scope = new Scope3708();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3708 scope)
            throws IncludeEventException {
        // Namespace import was here
        if (function_function_exists.functionHasBeenDefined(env, "dump")) {
            env.addManualFunctionLoad("dump");
        }
        if (function_function_exists.functionHasBeenDefined(env, "dd")) {
            env.addManualFunctionLoad("dd");
        }
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/var-dumper/Resources/functions")
                    .setFile("/vendor/symfony/var-dumper/Resources/functions/dump.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3708 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
