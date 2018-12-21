package com.project.convertedCode.includes.vendor.vlucas.phpdotenv.src;

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

 vendor/vlucas/phpdotenv/src/Dotenv.php

*/

public class file_Dotenv_php implements RuntimeIncludable {

    public static final file_Dotenv_php instance = new file_Dotenv_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3726 scope = new Scope3726();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3726 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named Dotenv was here in the source code
        env.addManualClassLoad("Dotenv\\Dotenv");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/vlucas/phpdotenv/src")
                    .setFile("/vendor/vlucas/phpdotenv/src/Dotenv.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3726 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
