package com.project.convertedCode.includes.vendor.psy.psysh.src.TabCompletion.Matcher;

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

 vendor/psy/psysh/src/TabCompletion/Matcher/ClassMethodsMatcher.php

*/

public class file_ClassMethodsMatcher_php implements RuntimeIncludable {

    public static final file_ClassMethodsMatcher_php instance = new file_ClassMethodsMatcher_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2850 scope = new Scope2850();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2850 scope)
            throws IncludeEventException {

        // Conversion Note: class named ClassMethodsMatcher was here in the source code
        env.addManualClassLoad("Psy\\TabCompletion\\Matcher\\ClassMethodsMatcher");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/psy/psysh/src/TabCompletion/Matcher")
                    .setFile("/vendor/psy/psysh/src/TabCompletion/Matcher/ClassMethodsMatcher.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2850 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
