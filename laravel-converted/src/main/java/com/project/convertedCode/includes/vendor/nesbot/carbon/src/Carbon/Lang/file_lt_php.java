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

 vendor/nesbot/carbon/src/Carbon/Lang/lt.php

*/

public class file_lt_php implements RuntimeIncludable {

    public static final file_lt_php instance = new file_lt_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1986 scope = new Scope1986();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1986 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", ":count metus|:count metus|:count met\u0173"),
                                new ZPair("y", ":count metus|:count metus|:count met\u0173"),
                                new ZPair(
                                        "month",
                                        ":count m\u0117nes\u012F|:count m\u0117nesius|:count m\u0117nesi\u0173"),
                                new ZPair(
                                        "m",
                                        ":count m\u0117nes\u012F|:count m\u0117nesius|:count m\u0117nesi\u0173"),
                                new ZPair(
                                        "week",
                                        ":count savait\u0119|:count savaites|:count savai\u010Di\u0173"),
                                new ZPair(
                                        "w",
                                        ":count savait\u0119|:count savaites|:count savai\u010Di\u0173"),
                                new ZPair(
                                        "day", ":count dien\u0105|:count dienas|:count dien\u0173"),
                                new ZPair("d", ":count dien\u0105|:count dienas|:count dien\u0173"),
                                new ZPair(
                                        "hour",
                                        ":count valand\u0105|:count valandas|:count valand\u0173"),
                                new ZPair(
                                        "h",
                                        ":count valand\u0105|:count valandas|:count valand\u0173"),
                                new ZPair(
                                        "minute",
                                        ":count minut\u0119|:count minutes|:count minu\u010Di\u0173"),
                                new ZPair(
                                        "min",
                                        ":count minut\u0119|:count minutes|:count minu\u010Di\u0173"),
                                new ZPair(
                                        "second",
                                        ":count sekund\u0119|:count sekundes|:count sekund\u017Ei\u0173"),
                                new ZPair(
                                        "s",
                                        ":count sekund\u0119|:count sekundes|:count sekund\u017Ei\u0173"),
                                new ZPair(
                                        "second_from_now",
                                        ":count sekund\u0117s|:count sekund\u017Ei\u0173|:count sekund\u017Ei\u0173"),
                                new ZPair(
                                        "minute_from_now",
                                        ":count minut\u0117s|:count minu\u010Di\u0173|:count minu\u010Di\u0173"),
                                new ZPair(
                                        "hour_from_now",
                                        ":count valandos|:count valand\u0173|:count valand\u0173"),
                                new ZPair(
                                        "day_from_now",
                                        ":count dienos|:count dien\u0173|:count dien\u0173"),
                                new ZPair(
                                        "week_from_now",
                                        ":count savait\u0117s|:count savai\u010Di\u0173|:count savai\u010Di\u0173"),
                                new ZPair(
                                        "month_from_now",
                                        ":count m\u0117nesio|:count m\u0117nesi\u0173|:count m\u0117nesi\u0173"),
                                new ZPair("year_from_now", ":count met\u0173"),
                                new ZPair("ago", "prie\u0161 :time"),
                                new ZPair("from_now", "u\u017E :time"),
                                new ZPair("after", "po :time"),
                                new ZPair("before", ":time nuo dabar"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/lt.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1986 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
