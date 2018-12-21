package com.project.convertedCode.includes.vendor.league.flysystem.src.Plugin;

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

 vendor/league/flysystem/src/Plugin/ListFiles.php

*/

public class file_ListFiles_php implements RuntimeIncludable {

    public static final file_ListFiles_php instance = new file_ListFiles_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1730 scope = new Scope1730();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1730 scope)
            throws IncludeEventException {

        // Conversion Note: class named ListFiles was here in the source code
        env.addManualClassLoad("League\\Flysystem\\Plugin\\ListFiles");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/league/flysystem/src/Plugin")
                    .setFile("/vendor/league/flysystem/src/Plugin/ListFiles.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1730 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
