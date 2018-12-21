package com.project.convertedCode.includes.vendor;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.ComposerAutoloaderInitd1518bf2342e63421aef0615412c1b88;
import static com.runtimeconverter.runtime.ZVal.toStringR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/autoload.php

*/

public class file_autoload_php implements RuntimeIncludable {

    public static final file_autoload_php instance = new file_autoload_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope230 scope = new Scope230();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope230 scope)
            throws IncludeEventException {
        env.include(
                toStringR(env.addRootFilesystemPrefix("/vendor"), env)
                        + "/composer/autoload_real.php",
                stack,
                this,
                true,
                true);
        throw new IncludeEventException(
                ZVal.assign(
                        ComposerAutoloaderInitd1518bf2342e63421aef0615412c1b88.runtimeStaticObject
                                .getLoader(env)));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants().setDir("/vendor").setFile("/vendor/autoload.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope230 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
