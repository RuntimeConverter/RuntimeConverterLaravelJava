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

 vendor/nesbot/carbon/src/Carbon/Lang/mn.php

*/

public class file_mn_php implements RuntimeIncludable {

    public static final file_mn_php instance = new file_mn_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1989 scope = new Scope1989();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1989 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", ":count \u0436\u0438\u043B"),
                                new ZPair("y", ":count \u0436\u0438\u043B"),
                                new ZPair("month", ":count \u0441\u0430\u0440"),
                                new ZPair("m", ":count \u0441\u0430\u0440"),
                                new ZPair(
                                        "week",
                                        ":count \u0434\u043E\u043B\u043E\u043E \u0445\u043E\u043D\u043E\u0433"),
                                new ZPair(
                                        "w",
                                        ":count \u0434\u043E\u043B\u043E\u043E \u0445\u043E\u043D\u043E\u0433"),
                                new ZPair("day", ":count \u04E9\u0434\u04E9\u0440"),
                                new ZPair("d", ":count \u04E9\u0434\u04E9\u0440"),
                                new ZPair("hour", ":count \u0446\u0430\u0433"),
                                new ZPair("h", ":count\u0446"),
                                new ZPair("minute", ":count \u043C\u0438\u043D\u0443\u0442"),
                                new ZPair("min", ":count\u043C"),
                                new ZPair("second", ":count \u0441\u0435\u043A\u0443\u043D\u0434"),
                                new ZPair("s", ":count\u0441"),
                                new ZPair("ago", ":time\u043D \u04E9\u043C\u043D\u04E9"),
                                new ZPair("year_ago", ":count \u0436\u0438\u043B\u0438\u0439"),
                                new ZPair("month_ago", ":count \u0441\u0430\u0440\u044B"),
                                new ZPair(
                                        "day_ago",
                                        ":count \u0445\u043E\u043D\u043E\u0433\u0438\u0439"),
                                new ZPair("hour_ago", ":count \u0446\u0430\u0433\u0438\u0439"),
                                new ZPair(
                                        "minute_ago",
                                        ":count \u043C\u0438\u043D\u0443\u0442\u044B"),
                                new ZPair(
                                        "second_ago",
                                        ":count \u0441\u0435\u043A\u0443\u043D\u0434\u044B"),
                                new ZPair(
                                        "from_now",
                                        "\u043E\u0434\u043E\u043E\u0433\u043E\u043E\u0441 :time"),
                                new ZPair(
                                        "year_from_now",
                                        ":count \u0436\u0438\u043B\u0438\u0439\u043D \u0434\u0430\u0440\u0430\u0430"),
                                new ZPair(
                                        "month_from_now",
                                        ":count \u0441\u0430\u0440\u044B\u043D \u0434\u0430\u0440\u0430\u0430"),
                                new ZPair(
                                        "day_from_now",
                                        ":count \u0445\u043E\u043D\u043E\u0433\u0438\u0439\u043D \u0434\u0430\u0440\u0430\u0430"),
                                new ZPair(
                                        "hour_from_now",
                                        ":count \u0446\u0430\u0433\u0438\u0439\u043D \u0434\u0430\u0440\u0430\u0430"),
                                new ZPair(
                                        "minute_from_now",
                                        ":count \u043C\u0438\u043D\u0443\u0442\u044B\u043D \u0434\u0430\u0440\u0430\u0430"),
                                new ZPair(
                                        "second_from_now",
                                        ":count \u0441\u0435\u043A\u0443\u043D\u0434\u044B\u043D \u0434\u0430\u0440\u0430\u0430"),
                                new ZPair("after", ":time\u043D \u0434\u0430\u0440\u0430\u0430"),
                                new ZPair("year_after", ":count \u0436\u0438\u043B\u0438\u0439"),
                                new ZPair("month_after", ":count \u0441\u0430\u0440\u044B"),
                                new ZPair(
                                        "day_after",
                                        ":count \u0445\u043E\u043D\u043E\u0433\u0438\u0439"),
                                new ZPair("hour_after", ":count \u0446\u0430\u0433\u0438\u0439"),
                                new ZPair(
                                        "minute_after",
                                        ":count \u043C\u0438\u043D\u0443\u0442\u044B"),
                                new ZPair(
                                        "second_after",
                                        ":count \u0441\u0435\u043A\u0443\u043D\u0434\u044B"),
                                new ZPair("before", ":time\u043D \u04E9\u043C\u043D\u04E9"),
                                new ZPair("year_before", ":count \u0436\u0438\u043B\u0438\u0439"),
                                new ZPair("month_before", ":count \u0441\u0430\u0440\u044B"),
                                new ZPair(
                                        "day_before",
                                        ":count \u0445\u043E\u043D\u043E\u0433\u0438\u0439"),
                                new ZPair("hour_before", ":count \u0446\u0430\u0433\u0438\u0439"),
                                new ZPair(
                                        "minute_before",
                                        ":count \u043C\u0438\u043D\u0443\u0442\u044B"),
                                new ZPair(
                                        "second_before",
                                        ":count \u0441\u0435\u043A\u0443\u043D\u0434\u044B"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/mn.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1989 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
