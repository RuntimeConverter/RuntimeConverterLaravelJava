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

 vendor/nesbot/carbon/src/Carbon/Lang/et.php

*/

public class file_et_php implements RuntimeIncludable {

    public static final file_et_php instance = new file_et_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1967 scope = new Scope1967();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1967 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", "1 aasta|:count aastat"),
                                new ZPair("y", "1 aasta|:count aastat"),
                                new ZPair("month", "1 kuu|:count kuud"),
                                new ZPair("m", "1 kuu|:count kuud"),
                                new ZPair("week", "1 n\u00E4dal|:count n\u00E4dalat"),
                                new ZPair("w", "1 n\u00E4dal|:count n\u00E4dalat"),
                                new ZPair("day", "1 p\u00E4ev|:count p\u00E4eva"),
                                new ZPair("d", "1 p\u00E4ev|:count p\u00E4eva"),
                                new ZPair("hour", "1 tund|:count tundi"),
                                new ZPair("h", "1 tund|:count tundi"),
                                new ZPair("minute", "1 minut|:count minutit"),
                                new ZPair("min", "1 minut|:count minutit"),
                                new ZPair("second", "1 sekund|:count sekundit"),
                                new ZPair("s", "1 sekund|:count sekundit"),
                                new ZPair("ago", ":time tagasi"),
                                new ZPair("from_now", ":time p\u00E4rast"),
                                new ZPair("after", ":time p\u00E4rast"),
                                new ZPair("before", ":time enne"),
                                new ZPair("year_from_now", ":count aasta"),
                                new ZPair("month_from_now", ":count kuu"),
                                new ZPair("week_from_now", ":count n\u00E4dala"),
                                new ZPair("day_from_now", ":count p\u00E4eva"),
                                new ZPair("hour_from_now", ":count tunni"),
                                new ZPair("minute_from_now", ":count minuti"),
                                new ZPair("second_from_now", ":count sekundi"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/et.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1967 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
