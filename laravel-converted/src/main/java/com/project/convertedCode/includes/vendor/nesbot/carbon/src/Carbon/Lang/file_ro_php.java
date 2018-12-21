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

 vendor/nesbot/carbon/src/Carbon/Lang/ro.php

*/

public class file_ro_php implements RuntimeIncludable {

    public static final file_ro_php instance = new file_ro_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1997 scope = new Scope1997();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1997 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", "un an|:count ani|:count ani"),
                                new ZPair("y", "un an|:count ani|:count ani"),
                                new ZPair("month", "o lun\u0103|:count luni|:count luni"),
                                new ZPair("m", "o lun\u0103|:count luni|:count luni"),
                                new ZPair(
                                        "week",
                                        "o s\u0103pt\u0103m\u00E2n\u0103|:count s\u0103pt\u0103m\u00E2ni|:count s\u0103pt\u0103m\u00E2ni"),
                                new ZPair(
                                        "w",
                                        "o s\u0103pt\u0103m\u00E2n\u0103|:count s\u0103pt\u0103m\u00E2ni|:count s\u0103pt\u0103m\u00E2ni"),
                                new ZPair("day", "o zi|:count zile|:count zile"),
                                new ZPair("d", "o zi|:count zile|:count zile"),
                                new ZPair("hour", "o or\u0103|:count ore|:count ore"),
                                new ZPair("h", "o or\u0103|:count ore|:count ore"),
                                new ZPair("minute", "un minut|:count minute|:count minute"),
                                new ZPair("min", "un minut|:count minute|:count minute"),
                                new ZPair("second", "o secund\u0103|:count secunde|:count secunde"),
                                new ZPair("s", "o secund\u0103|:count secunde|:count secunde"),
                                new ZPair("ago", "acum :time"),
                                new ZPair("from_now", ":time de acum"),
                                new ZPair("after", "peste :time"),
                                new ZPair("before", "acum :time"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/ro.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1997 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
