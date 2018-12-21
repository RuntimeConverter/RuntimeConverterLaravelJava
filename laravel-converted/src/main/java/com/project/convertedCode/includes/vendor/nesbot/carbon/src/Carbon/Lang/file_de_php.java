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

 vendor/nesbot/carbon/src/Carbon/Lang/de.php

*/

public class file_de_php implements RuntimeIncludable {

    public static final file_de_php instance = new file_de_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1961 scope = new Scope1961();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1961 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", "1 Jahr|:count Jahre"),
                                new ZPair("y", "1J|:countJ"),
                                new ZPair("month", "1 Monat|:count Monate"),
                                new ZPair("m", "1Mon|:countMon"),
                                new ZPair("week", "1 Woche|:count Wochen"),
                                new ZPair("w", "1Wo|:countWo"),
                                new ZPair("day", "1 Tag|:count Tage"),
                                new ZPair("d", "1Tg|:countTg"),
                                new ZPair("hour", "1 Stunde|:count Stunden"),
                                new ZPair("h", "1Std|:countStd"),
                                new ZPair("minute", "1 Minute|:count Minuten"),
                                new ZPair("min", "1Min|:countMin"),
                                new ZPair("second", "1 Sekunde|:count Sekunden"),
                                new ZPair("s", "1Sek|:countSek"),
                                new ZPair("ago", "vor :time"),
                                new ZPair("from_now", "in :time"),
                                new ZPair("after", ":time sp\u00E4ter"),
                                new ZPair("before", ":time zuvor"),
                                new ZPair("year_from_now", "1 Jahr|:count Jahren"),
                                new ZPair("month_from_now", "1 Monat|:count Monaten"),
                                new ZPair("week_from_now", "1 Woche|:count Wochen"),
                                new ZPair("day_from_now", "1 Tag|:count Tagen"),
                                new ZPair("year_ago", "1 Jahr|:count Jahren"),
                                new ZPair("month_ago", "1 Monat|:count Monaten"),
                                new ZPair("week_ago", "1 Woche|:count Wochen"),
                                new ZPair("day_ago", "1 Tag|:count Tagen"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/de.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1961 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
