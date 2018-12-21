package com.project.convertedCode.includes.vendor.vlucas.phpdotenv.src.Exception;

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

 vendor/vlucas/phpdotenv/src/Exception/ValidationException.php

*/

public class file_ValidationException_php implements RuntimeIncludable {

    public static final file_ValidationException_php instance = new file_ValidationException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3731 scope = new Scope3731();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3731 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named ValidationException was here in the source code
        env.addManualClassLoad("Dotenv\\Exception\\ValidationException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/vlucas/phpdotenv/src/Exception")
                    .setFile("/vendor/vlucas/phpdotenv/src/Exception/ValidationException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3731 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
