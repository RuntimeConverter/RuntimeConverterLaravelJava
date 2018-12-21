package com.project.convertedCode.includes.vendor.swiftmailer.swiftmailer.lib.classes.Swift.Encoder;

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

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Encoder/Rfc2231Encoder.php

*/

public class file_Rfc2231Encoder_php implements RuntimeIncludable {

    public static final file_Rfc2231Encoder_php instance = new file_Rfc2231Encoder_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3002 scope = new Scope3002();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3002 scope)
            throws IncludeEventException {
        // Conversion Note: class named Swift_Encoder_Rfc2231Encoder was here in the source code
        env.addManualClassLoad("Swift_Encoder_Rfc2231Encoder");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/swiftmailer/swiftmailer/lib/classes/Swift/Encoder")
                    .setFile(
                            "/vendor/swiftmailer/swiftmailer/lib/classes/Swift/Encoder/Rfc2231Encoder.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3002 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
