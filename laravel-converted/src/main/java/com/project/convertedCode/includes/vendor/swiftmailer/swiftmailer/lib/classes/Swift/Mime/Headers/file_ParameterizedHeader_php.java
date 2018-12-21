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

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/Headers/ParameterizedHeader.php

*/

public class file_ParameterizedHeader_php implements RuntimeIncludable {

    public static final file_ParameterizedHeader_php instance = new file_ParameterizedHeader_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3059 scope = new Scope3059();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3059 scope)
            throws IncludeEventException {
        // Conversion Note: class named Swift_Mime_Headers_ParameterizedHeader was here in the
        // source code
        env.addManualClassLoad("Swift_Mime_Headers_ParameterizedHeader");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/Headers")
                    .setFile(
                            "/vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/Headers/ParameterizedHeader.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3059 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
