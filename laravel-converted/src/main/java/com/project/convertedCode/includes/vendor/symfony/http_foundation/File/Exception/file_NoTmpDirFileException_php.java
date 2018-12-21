package com.project.convertedCode.includes.vendor.symfony.http_foundation.File.Exception;

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

 vendor/symfony/http-foundation/File/Exception/NoTmpDirFileException.php

*/

public class file_NoTmpDirFileException_php implements RuntimeIncludable {

    public static final file_NoTmpDirFileException_php instance =
            new file_NoTmpDirFileException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3329 scope = new Scope3329();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3329 scope)
            throws IncludeEventException {

        // Conversion Note: class named NoTmpDirFileException was here in the source code
        env.addManualClassLoad(
                "Symfony\\Component\\HttpFoundation\\File\\Exception\\NoTmpDirFileException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/http-foundation/File/Exception")
                    .setFile(
                            "/vendor/symfony/http-foundation/File/Exception/NoTmpDirFileException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3329 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
