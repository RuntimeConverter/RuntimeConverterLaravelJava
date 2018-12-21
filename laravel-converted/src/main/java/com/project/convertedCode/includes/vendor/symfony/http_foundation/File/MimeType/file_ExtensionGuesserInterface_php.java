package com.project.convertedCode.includes.vendor.symfony.http_foundation.File.MimeType;

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

 vendor/symfony/http-foundation/File/MimeType/ExtensionGuesserInterface.php

*/

public class file_ExtensionGuesserInterface_php implements RuntimeIncludable {

    public static final file_ExtensionGuesserInterface_php instance =
            new file_ExtensionGuesserInterface_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3335 scope = new Scope3335();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3335 scope)
            throws IncludeEventException {

        // Conversion Note: class named ExtensionGuesserInterface was here in the source code
        env.addManualClassLoad(
                "Symfony\\Component\\HttpFoundation\\File\\MimeType\\ExtensionGuesserInterface");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/http-foundation/File/MimeType")
                    .setFile(
                            "/vendor/symfony/http-foundation/File/MimeType/ExtensionGuesserInterface.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3335 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
