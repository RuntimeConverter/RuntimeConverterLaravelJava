package com.project.convertedCode.includes.vendor.nesbot.carbon.src.Carbon.Lang;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nesbot/carbon/src/Carbon/Lang/ca.php

*/

public class file_ca_php implements RuntimeIncludable {

    public static final file_ca_php instance = new file_ca_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1958 scope = new Scope1958();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1958 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", "1 any|:count anys"),
                                new ZPair("y", "1 any|:count anys"),
                                new ZPair("month", "1 mes|:count mesos"),
                                new ZPair("m", "1 mes|:count mesos"),
                                new ZPair("week", "1 setmana|:count setmanes"),
                                new ZPair("w", "1 setmana|:count setmanes"),
                                new ZPair("day", "1 dia|:count dies"),
                                new ZPair("d", "1 dia|:count dies"),
                                new ZPair("hour", "1 hora|:count hores"),
                                new ZPair("h", "1 hora|:count hores"),
                                new ZPair("minute", "1 minut|:count minuts"),
                                new ZPair("min", "1 minut|:count minuts"),
                                new ZPair("second", "1 segon|:count segons"),
                                new ZPair("s", "1 segon|:count segons"),
                                new ZPair("ago", "fa :time"),
                                new ZPair("from_now", "dins de :time"),
                                new ZPair("after", ":time despr\u00E9s"),
                                new ZPair("before", ":time abans"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/ca.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1958 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
