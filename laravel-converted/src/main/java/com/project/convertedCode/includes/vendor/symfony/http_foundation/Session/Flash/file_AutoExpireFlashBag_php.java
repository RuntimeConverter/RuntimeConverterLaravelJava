package com.project.convertedCode.includes.vendor.symfony.http_foundation.Session.Flash;

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

 vendor/symfony/http-foundation/Session/Flash/AutoExpireFlashBag.php

*/

public class file_AutoExpireFlashBag_php implements RuntimeIncludable {

    public static final file_AutoExpireFlashBag_php instance = new file_AutoExpireFlashBag_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3360 scope = new Scope3360();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3360 scope)
            throws IncludeEventException {

        // Conversion Note: class named AutoExpireFlashBag was here in the source code
        env.addManualClassLoad(
                "Symfony\\Component\\HttpFoundation\\Session\\Flash\\AutoExpireFlashBag");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/http-foundation/Session/Flash")
                    .setFile(
                            "/vendor/symfony/http-foundation/Session/Flash/AutoExpireFlashBag.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3360 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
