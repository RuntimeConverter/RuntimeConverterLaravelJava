package com.project.convertedCode.includes.vendor.ramsey.uuid.src.Exception;

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

 vendor/ramsey/uuid/src/Exception/UnsatisfiedDependencyException.php

*/

public class file_UnsatisfiedDependencyException_php implements RuntimeIncludable {

    public static final file_UnsatisfiedDependencyException_php instance =
            new file_UnsatisfiedDependencyException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2895 scope = new Scope2895();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2895 scope)
            throws IncludeEventException {

        // Conversion Note: class named UnsatisfiedDependencyException was here in the source code
        env.addManualClassLoad("Ramsey\\Uuid\\Exception\\UnsatisfiedDependencyException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/ramsey/uuid/src/Exception")
                    .setFile(
                            "/vendor/ramsey/uuid/src/Exception/UnsatisfiedDependencyException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2895 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
