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

 vendor/nesbot/carbon/src/Carbon/Lang/sl.php

*/

public class file_sl_php implements RuntimeIncludable {

    public static final file_sl_php instance = new file_sl_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2000 scope = new Scope2000();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2000 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", ":count leto|:count leti|:count leta|:count let"),
                                new ZPair("y", ":count leto|:count leti|:count leta|:count let"),
                                new ZPair(
                                        "month",
                                        ":count mesec|:count meseca|:count mesece|:count mesecev"),
                                new ZPair(
                                        "m",
                                        ":count mesec|:count meseca|:count mesece|:count mesecev"),
                                new ZPair(
                                        "week",
                                        ":count teden|:count tedna|:count tedne|:count tednov"),
                                new ZPair(
                                        "w",
                                        ":count teden|:count tedna|:count tedne|:count tednov"),
                                new ZPair("day", ":count dan|:count dni|:count dni|:count dni"),
                                new ZPair("d", ":count dan|:count dni|:count dni|:count dni"),
                                new ZPair("hour", ":count uro|:count uri|:count ure|:count ur"),
                                new ZPair("h", ":count uro|:count uri|:count ure|:count ur"),
                                new ZPair(
                                        "minute",
                                        ":count minuto|:count minuti|:count minute|:count minut"),
                                new ZPair(
                                        "min",
                                        ":count minuto|:count minuti|:count minute|:count minut"),
                                new ZPair(
                                        "second",
                                        ":count sekundo|:count sekundi|:count sekunde|:count sekund"),
                                new ZPair(
                                        "s",
                                        ":count sekundo|:count sekundi|:count sekunde|:count sekund"),
                                new ZPair(
                                        "year_ago",
                                        ":count letom|:count leti|:count leti|:count leti"),
                                new ZPair(
                                        "month_ago",
                                        ":count mesecem|:count meseci|:count meseci|:count meseci"),
                                new ZPair(
                                        "week_ago",
                                        ":count tednom|:count tednoma|:count tedni|:count tedni"),
                                new ZPair(
                                        "day_ago",
                                        ":count dnem|:count dnevoma|:count dnevi|:count dnevi"),
                                new ZPair(
                                        "hour_ago",
                                        ":count uro|:count urama|:count urami|:count urami"),
                                new ZPair(
                                        "minute_ago",
                                        ":count minuto|:count minutama|:count minutami|:count minutami"),
                                new ZPair(
                                        "second_ago",
                                        ":count sekundo|:count sekundama|:count sekundami|:count sekundami"),
                                new ZPair("ago", "pred :time"),
                                new ZPair("from_now", "\u010Dez :time"),
                                new ZPair("after", "\u010Dez :time"),
                                new ZPair("before", "pred :time"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/sl.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2000 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
