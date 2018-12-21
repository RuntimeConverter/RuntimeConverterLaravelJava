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

 vendor/vlucas/phpdotenv/src/Exception/InvalidFileException.php

*/

public class file_InvalidFileException_php implements RuntimeIncludable {

    public static final file_InvalidFileException_php instance =
            new file_InvalidFileException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3729 scope = new Scope3729();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3729 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named InvalidFileException was here in the source code
        env.addManualClassLoad("Dotenv\\Exception\\InvalidFileException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/vlucas/phpdotenv/src/Exception")
                    .setFile("/vendor/vlucas/phpdotenv/src/Exception/InvalidFileException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3729 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
