package com.project.convertedCode.includes.vendor.dnoegel.php_xdg_base_dir.src;

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

 vendor/dnoegel/php-xdg-base-dir/src/Xdg.php

*/

public class file_Xdg_php implements RuntimeIncludable {

    public static final file_Xdg_php instance = new file_Xdg_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope238 scope = new Scope238();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope238 scope)
            throws IncludeEventException {

        // Conversion Note: class named Xdg was here in the source code
        env.addManualClassLoad("XdgBaseDir\\Xdg");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/dnoegel/php-xdg-base-dir/src")
                    .setFile("/vendor/dnoegel/php-xdg-base-dir/src/Xdg.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope238 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
