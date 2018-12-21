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

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/Esmtp/Auth/CramMd5Authenticator.php

*/

public class file_CramMd5Authenticator_php implements RuntimeIncludable {

    public static final file_CramMd5Authenticator_php instance =
            new file_CramMd5Authenticator_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3113 scope = new Scope3113();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3113 scope)
            throws IncludeEventException {
        // Conversion Note: class named Swift_Transport_Esmtp_Auth_CramMd5Authenticator was here in
        // the source code
        env.addManualClassLoad("Swift_Transport_Esmtp_Auth_CramMd5Authenticator");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir(
                            "/vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/Esmtp/Auth")
                    .setFile(
                            "/vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/Esmtp/Auth/CramMd5Authenticator.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3113 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
