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

 vendor/nesbot/carbon/src/Carbon/Lang/hu.php

*/

public class file_hu_php implements RuntimeIncludable {

    public static final file_hu_php instance = new file_hu_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1977 scope = new Scope1977();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1977 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", ":count \u00E9v"),
                                new ZPair("y", ":count \u00E9v"),
                                new ZPair("month", ":count h\u00F3nap"),
                                new ZPair("m", ":count h\u00F3nap"),
                                new ZPair("week", ":count h\u00E9t"),
                                new ZPair("w", ":count h\u00E9t"),
                                new ZPair("day", ":count nap"),
                                new ZPair("d", ":count nap"),
                                new ZPair("hour", ":count \u00F3ra"),
                                new ZPair("h", ":count \u00F3ra"),
                                new ZPair("minute", ":count perc"),
                                new ZPair("min", ":count perc"),
                                new ZPair("second", ":count m\u00E1sodperc"),
                                new ZPair("s", ":count m\u00E1sodperc"),
                                new ZPair("ago", ":time"),
                                new ZPair("from_now", ":time m\u00FAlva"),
                                new ZPair("after", ":time k\u00E9s\u0151bb"),
                                new ZPair("before", ":time kor\u00E1bban"),
                                new ZPair("year_ago", ":count \u00E9ve"),
                                new ZPair("month_ago", ":count h\u00F3napja"),
                                new ZPair("week_ago", ":count hete"),
                                new ZPair("day_ago", ":count napja"),
                                new ZPair("hour_ago", ":count \u00F3r\u00E1ja"),
                                new ZPair("minute_ago", ":count perce"),
                                new ZPair("second_ago", ":count m\u00E1sodperce"),
                                new ZPair("year_after", ":count \u00E9vvel"),
                                new ZPair("month_after", ":count h\u00F3nappal"),
                                new ZPair("week_after", ":count h\u00E9ttel"),
                                new ZPair("day_after", ":count nappal"),
                                new ZPair("hour_after", ":count \u00F3r\u00E1val"),
                                new ZPair("minute_after", ":count perccel"),
                                new ZPair("second_after", ":count m\u00E1sodperccel"),
                                new ZPair("year_before", ":count \u00E9vvel"),
                                new ZPair("month_before", ":count h\u00F3nappal"),
                                new ZPair("week_before", ":count h\u00E9ttel"),
                                new ZPair("day_before", ":count nappal"),
                                new ZPair("hour_before", ":count \u00F3r\u00E1val"),
                                new ZPair("minute_before", ":count perccel"),
                                new ZPair("second_before", ":count m\u00E1sodperccel"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/hu.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1977 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
