package com.project.convertedCode.includes.vendor.swiftmailer.swiftmailer.lib.classes.Swift.Plugins.Pop;

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

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/Pop/Pop3Exception.php

*/

public class file_Pop3Exception_php implements RuntimeIncludable {

    public static final file_Pop3Exception_php instance = new file_Pop3Exception_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3082 scope = new Scope3082();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3082 scope)
            throws IncludeEventException {
        // Conversion Note: class named Swift_Plugins_Pop_Pop3Exception was here in the source code
        env.addManualClassLoad("Swift_Plugins_Pop_Pop3Exception");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/Pop")
                    .setFile(
                            "/vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/Pop/Pop3Exception.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3082 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
