package com.project.convertedCode.includes.vendor.swiftmailer.swiftmailer.lib.classes.Swift.AddressEncoder;

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

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/AddressEncoder/IdnAddressEncoder.php

*/

public class file_IdnAddressEncoder_php implements RuntimeIncludable {

    public static final file_IdnAddressEncoder_php instance = new file_IdnAddressEncoder_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2978 scope = new Scope2978();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2978 scope)
            throws IncludeEventException {
        // Conversion Note: class named Swift_AddressEncoder_IdnAddressEncoder was here in the
        // source code
        env.addManualClassLoad("Swift_AddressEncoder_IdnAddressEncoder");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/swiftmailer/swiftmailer/lib/classes/Swift/AddressEncoder")
                    .setFile(
                            "/vendor/swiftmailer/swiftmailer/lib/classes/Swift/AddressEncoder/IdnAddressEncoder.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2978 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
