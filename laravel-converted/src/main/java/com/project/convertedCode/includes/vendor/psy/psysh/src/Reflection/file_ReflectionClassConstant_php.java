package com.project.convertedCode.includes.vendor.psy.psysh.src.Reflection;

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

 vendor/psy/psysh/src/Reflection/ReflectionClassConstant.php

*/

public class file_ReflectionClassConstant_php implements RuntimeIncludable {

    public static final file_ReflectionClassConstant_php instance =
            new file_ReflectionClassConstant_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2836 scope = new Scope2836();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2836 scope)
            throws IncludeEventException {

        // Conversion Note: class named ReflectionClassConstant was here in the source code
        env.addManualClassLoad("Psy\\Reflection\\ReflectionClassConstant");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/psy/psysh/src/Reflection")
                    .setFile("/vendor/psy/psysh/src/Reflection/ReflectionClassConstant.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2836 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
