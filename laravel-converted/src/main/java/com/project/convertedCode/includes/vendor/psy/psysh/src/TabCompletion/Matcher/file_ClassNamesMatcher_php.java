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

 vendor/psy/psysh/src/TabCompletion/Matcher/ClassNamesMatcher.php

*/

public class file_ClassNamesMatcher_php implements RuntimeIncludable {

    public static final file_ClassNamesMatcher_php instance = new file_ClassNamesMatcher_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2851 scope = new Scope2851();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2851 scope)
            throws IncludeEventException {

        // Conversion Note: class named ClassNamesMatcher was here in the source code
        env.addManualClassLoad("Psy\\TabCompletion\\Matcher\\ClassNamesMatcher");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/psy/psysh/src/TabCompletion/Matcher")
                    .setFile("/vendor/psy/psysh/src/TabCompletion/Matcher/ClassNamesMatcher.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2851 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
