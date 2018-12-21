package com.project.convertedCode.includes.vendor.swiftmailer.swiftmailer.lib.classes.Swift.Mime.ContentEncoder;

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

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/ContentEncoder/Base64ContentEncoder.php

*/

public class file_Base64ContentEncoder_php implements RuntimeIncludable {

    public static final file_Base64ContentEncoder_php instance =
            new file_Base64ContentEncoder_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3041 scope = new Scope3041();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3041 scope)
            throws IncludeEventException {
        // Conversion Note: class named Swift_Mime_ContentEncoder_Base64ContentEncoder was here in
        // the source code
        env.addManualClassLoad("Swift_Mime_ContentEncoder_Base64ContentEncoder");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/ContentEncoder")
                    .setFile(
                            "/vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/ContentEncoder/Base64ContentEncoder.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3041 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
