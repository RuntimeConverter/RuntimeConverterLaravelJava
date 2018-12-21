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

 vendor/nesbot/carbon/src/Carbon/Lang/ru.php

*/

public class file_ru_php implements RuntimeIncludable {

    public static final file_ru_php instance = new file_ru_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1998 scope = new Scope1998();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1998 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        "year",
                                        ":count \u0433\u043E\u0434|:count \u0433\u043E\u0434\u0430|:count \u043B\u0435\u0442"),
                                new ZPair(
                                        "y",
                                        ":count \u0433\u043E\u0434|:count \u0433\u043E\u0434\u0430|:count \u043B\u0435\u0442"),
                                new ZPair(
                                        "month",
                                        ":count \u043C\u0435\u0441\u044F\u0446|:count \u043C\u0435\u0441\u044F\u0446\u0430|:count \u043C\u0435\u0441\u044F\u0446\u0435\u0432"),
                                new ZPair(
                                        "m",
                                        ":count \u043C\u0435\u0441\u044F\u0446|:count \u043C\u0435\u0441\u044F\u0446\u0430|:count \u043C\u0435\u0441\u044F\u0446\u0435\u0432"),
                                new ZPair(
                                        "week",
                                        ":count \u043D\u0435\u0434\u0435\u043B\u044E|:count \u043D\u0435\u0434\u0435\u043B\u0438|:count \u043D\u0435\u0434\u0435\u043B\u044C"),
                                new ZPair(
                                        "w",
                                        ":count \u043D\u0435\u0434\u0435\u043B\u044E|:count \u043D\u0435\u0434\u0435\u043B\u0438|:count \u043D\u0435\u0434\u0435\u043B\u044C"),
                                new ZPair(
                                        "day",
                                        ":count \u0434\u0435\u043D\u044C|:count \u0434\u043D\u044F|:count \u0434\u043D\u0435\u0439"),
                                new ZPair(
                                        "d",
                                        ":count \u0434\u0435\u043D\u044C|:count \u0434\u043D\u044F|:count \u0434\u043D\u0435\u0439"),
                                new ZPair(
                                        "hour",
                                        ":count \u0447\u0430\u0441|:count \u0447\u0430\u0441\u0430|:count \u0447\u0430\u0441\u043E\u0432"),
                                new ZPair(
                                        "h",
                                        ":count \u0447\u0430\u0441|:count \u0447\u0430\u0441\u0430|:count \u0447\u0430\u0441\u043E\u0432"),
                                new ZPair(
                                        "minute",
                                        ":count \u043C\u0438\u043D\u0443\u0442\u0443|:count \u043C\u0438\u043D\u0443\u0442\u044B|:count \u043C\u0438\u043D\u0443\u0442"),
                                new ZPair(
                                        "min",
                                        ":count \u043C\u0438\u043D\u0443\u0442\u0443|:count \u043C\u0438\u043D\u0443\u0442\u044B|:count \u043C\u0438\u043D\u0443\u0442"),
                                new ZPair(
                                        "second",
                                        ":count \u0441\u0435\u043A\u0443\u043D\u0434\u0443|:count \u0441\u0435\u043A\u0443\u043D\u0434\u044B|:count \u0441\u0435\u043A\u0443\u043D\u0434"),
                                new ZPair(
                                        "s",
                                        ":count \u0441\u0435\u043A\u0443\u043D\u0434\u0443|:count \u0441\u0435\u043A\u0443\u043D\u0434\u044B|:count \u0441\u0435\u043A\u0443\u043D\u0434"),
                                new ZPair("ago", ":time \u043D\u0430\u0437\u0430\u0434"),
                                new ZPair("from_now", "\u0447\u0435\u0440\u0435\u0437 :time"),
                                new ZPair("after", ":time \u043F\u043E\u0441\u043B\u0435"),
                                new ZPair("before", ":time \u0434\u043E"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/ru.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1998 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
