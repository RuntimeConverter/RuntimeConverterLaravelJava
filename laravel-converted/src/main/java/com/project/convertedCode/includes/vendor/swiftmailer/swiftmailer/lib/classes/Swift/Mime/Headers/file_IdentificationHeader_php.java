package com.project.convertedCode.includes.vendor.swiftmailer.swiftmailer.lib.classes.Swift.Mime.Headers;

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

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/Headers/IdentificationHeader.php

*/

public class file_IdentificationHeader_php implements RuntimeIncludable {

    public static final file_IdentificationHeader_php instance =
            new file_IdentificationHeader_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3056 scope = new Scope3056();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3056 scope)
            throws IncludeEventException {
        // Namespace import was here
        // Namespace import was here
        // Conversion Note: class named Swift_Mime_Headers_IdentificationHeader was here in the
        // source code
        env.addManualClassLoad("Swift_Mime_Headers_IdentificationHeader");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/Headers")
                    .setFile(
                            "/vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/Headers/IdentificationHeader.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3056 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
