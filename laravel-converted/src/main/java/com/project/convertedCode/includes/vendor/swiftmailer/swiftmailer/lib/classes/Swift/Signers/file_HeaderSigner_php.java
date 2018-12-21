package com.project.convertedCode.includes.vendor.swiftmailer.swiftmailer.lib.classes.Swift.Signers;

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

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Signers/HeaderSigner.php

*/

public class file_HeaderSigner_php implements RuntimeIncludable {

    public static final file_HeaderSigner_php instance = new file_HeaderSigner_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3100 scope = new Scope3100();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3100 scope)
            throws IncludeEventException {
        // Conversion Note: class named Swift_Signers_HeaderSigner was here in the source code
        env.addManualClassLoad("Swift_Signers_HeaderSigner");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/swiftmailer/swiftmailer/lib/classes/Swift/Signers")
                    .setFile(
                            "/vendor/swiftmailer/swiftmailer/lib/classes/Swift/Signers/HeaderSigner.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3100 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
