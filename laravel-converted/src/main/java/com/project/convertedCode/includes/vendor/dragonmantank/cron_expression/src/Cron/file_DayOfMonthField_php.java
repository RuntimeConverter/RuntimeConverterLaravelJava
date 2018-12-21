package com.project.convertedCode.includes.vendor.dragonmantank.cron_expression.src.Cron;

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

 vendor/dragonmantank/cron-expression/src/Cron/DayOfMonthField.php

*/

public class file_DayOfMonthField_php implements RuntimeIncludable {

    public static final file_DayOfMonthField_php instance = new file_DayOfMonthField_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope248 scope = new Scope248();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope248 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named DayOfMonthField was here in the source code
        env.addManualClassLoad("Cron\\DayOfMonthField");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/dragonmantank/cron-expression/src/Cron")
                    .setFile("/vendor/dragonmantank/cron-expression/src/Cron/DayOfMonthField.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope248 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
