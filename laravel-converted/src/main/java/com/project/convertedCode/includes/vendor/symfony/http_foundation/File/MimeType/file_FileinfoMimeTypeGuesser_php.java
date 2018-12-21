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

 vendor/symfony/http-foundation/File/MimeType/FileinfoMimeTypeGuesser.php

*/

public class file_FileinfoMimeTypeGuesser_php implements RuntimeIncludable {

    public static final file_FileinfoMimeTypeGuesser_php instance =
            new file_FileinfoMimeTypeGuesser_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3337 scope = new Scope3337();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3337 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Namespace import was here
        // Conversion Note: class named FileinfoMimeTypeGuesser was here in the source code
        env.addManualClassLoad(
                "Symfony\\Component\\HttpFoundation\\File\\MimeType\\FileinfoMimeTypeGuesser");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/http-foundation/File/MimeType")
                    .setFile(
                            "/vendor/symfony/http-foundation/File/MimeType/FileinfoMimeTypeGuesser.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3337 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
