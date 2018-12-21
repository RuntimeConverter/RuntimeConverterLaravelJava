package com.project.convertedCode.includes.vendor.filp.whoops.src.Whoops.Util;

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

 vendor/filp/whoops/src/Whoops/Util/SystemFacade.php

*/

public class file_SystemFacade_php implements RuntimeIncludable {

    public static final file_SystemFacade_php instance = new file_SystemFacade_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope350 scope = new Scope350();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope350 scope)
            throws IncludeEventException {

        // Conversion Note: class named SystemFacade was here in the source code
        env.addManualClassLoad("Whoops\\Util\\SystemFacade");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/filp/whoops/src/Whoops/Util")
                    .setFile("/vendor/filp/whoops/src/Whoops/Util/SystemFacade.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope350 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
