package com.project.convertedCode.includes.vendor.psy.psysh.src.Command.ListCommand;

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

 vendor/psy/psysh/src/Command/ListCommand/FunctionEnumerator.php

*/

public class file_FunctionEnumerator_php implements RuntimeIncludable {

    public static final file_FunctionEnumerator_php instance = new file_FunctionEnumerator_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2779 scope = new Scope2779();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2779 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named FunctionEnumerator was here in the source code
        env.addManualClassLoad("Psy\\Command\\ListCommand\\FunctionEnumerator");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/psy/psysh/src/Command/ListCommand")
                    .setFile("/vendor/psy/psysh/src/Command/ListCommand/FunctionEnumerator.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2779 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
