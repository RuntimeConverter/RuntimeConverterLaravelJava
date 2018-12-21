package com.project.convertedCode.includes.vendor.swiftmailer.swiftmailer.lib.classes.Swift.Transport.Esmtp.Auth;

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

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/Esmtp/Auth/PlainAuthenticator.php

*/

public class file_PlainAuthenticator_php implements RuntimeIncludable {

    public static final file_PlainAuthenticator_php instance = new file_PlainAuthenticator_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3116 scope = new Scope3116();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3116 scope)
            throws IncludeEventException {
        // Conversion Note: class named Swift_Transport_Esmtp_Auth_PlainAuthenticator was here in
        // the source code
        env.addManualClassLoad("Swift_Transport_Esmtp_Auth_PlainAuthenticator");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir(
                            "/vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/Esmtp/Auth")
                    .setFile(
                            "/vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/Esmtp/Auth/PlainAuthenticator.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3116 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
