package com.project.convertedCode.includes.vendor.symfony.http_foundation.Session.Storage.Handler;

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

 vendor/symfony/http-foundation/Session/Storage/Handler/MigratingSessionHandler.php

*/

public class file_MigratingSessionHandler_php implements RuntimeIncludable {

    public static final file_MigratingSessionHandler_php instance =
            new file_MigratingSessionHandler_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3369 scope = new Scope3369();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3369 scope)
            throws IncludeEventException {

        // Conversion Note: class named MigratingSessionHandler was here in the source code
        env.addManualClassLoad(
                "Symfony\\Component\\HttpFoundation\\Session\\Storage\\Handler\\MigratingSessionHandler");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/http-foundation/Session/Storage/Handler")
                    .setFile(
                            "/vendor/symfony/http-foundation/Session/Storage/Handler/MigratingSessionHandler.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3369 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
