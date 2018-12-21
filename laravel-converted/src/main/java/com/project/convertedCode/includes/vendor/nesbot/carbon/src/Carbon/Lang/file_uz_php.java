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

 vendor/nesbot/carbon/src/Carbon/Lang/uz.php

*/

public class file_uz_php implements RuntimeIncludable {

    public static final file_uz_php instance = new file_uz_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2012 scope = new Scope2012();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2012 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", ":count yil"),
                                new ZPair("y", ":count yil"),
                                new ZPair("month", ":count oy"),
                                new ZPair("m", ":count oy"),
                                new ZPair("week", ":count hafta"),
                                new ZPair("w", ":count hafta"),
                                new ZPair("day", ":count kun"),
                                new ZPair("d", ":count kun"),
                                new ZPair("hour", ":count soat"),
                                new ZPair("h", ":count soat"),
                                new ZPair("minute", ":count daqiqa"),
                                new ZPair("min", ":count daq"),
                                new ZPair("second", ":count soniya"),
                                new ZPair("s", ":count s"),
                                new ZPair("ago", ":time avval"),
                                new ZPair("from_now", ":time dan keyin"),
                                new ZPair("after", ":time keyin"),
                                new ZPair("before", ":time oldin"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/uz.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2012 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
