package com.project.convertedCode.includes.vendor.swiftmailer.swiftmailer.lib.classes.Swift.Transport.Esmtp;

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

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/Esmtp/SmtpUtf8Handler.php

*/

public class file_SmtpUtf8Handler_php implements RuntimeIncludable {

    public static final file_SmtpUtf8Handler_php instance = new file_SmtpUtf8Handler_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3121 scope = new Scope3121();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3121 scope)
            throws IncludeEventException {
        // Conversion Note: class named Swift_Transport_Esmtp_SmtpUtf8Handler was here in the source
        // code
        env.addManualClassLoad("Swift_Transport_Esmtp_SmtpUtf8Handler");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/Esmtp")
                    .setFile(
                            "/vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/Esmtp/SmtpUtf8Handler.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3121 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
