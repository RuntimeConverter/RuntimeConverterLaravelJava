package com.project.convertedCode.includes.vendor.symfony.http_foundation.Session.Storage;

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

 vendor/symfony/http-foundation/Session/Storage/MockArraySessionStorage.php

*/

public class file_MockArraySessionStorage_php implements RuntimeIncludable {

    public static final file_MockArraySessionStorage_php instance =
            new file_MockArraySessionStorage_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3377 scope = new Scope3377();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3377 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named MockArraySessionStorage was here in the source code
        env.addManualClassLoad(
                "Symfony\\Component\\HttpFoundation\\Session\\Storage\\MockArraySessionStorage");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/http-foundation/Session/Storage")
                    .setFile(
                            "/vendor/symfony/http-foundation/Session/Storage/MockArraySessionStorage.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3377 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
