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

 vendor/nesbot/carbon/src/Carbon/Lang/uk.php

*/

public class file_uk_php implements RuntimeIncludable {

    public static final file_uk_php instance = new file_uk_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2010 scope = new Scope2010();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2010 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        "year",
                                        ":count \u0440\u0456\u043A|:count \u0440\u043E\u043A\u0438|:count \u0440\u043E\u043A\u0456\u0432"),
                                new ZPair(
                                        "y",
                                        ":count \u0440\u0456\u043A|:count \u0440\u043E\u043A\u0438|:count \u0440\u043E\u043A\u0456\u0432"),
                                new ZPair(
                                        "month",
                                        ":count \u043C\u0456\u0441\u044F\u0446\u044C|:count \u043C\u0456\u0441\u044F\u0446\u0456|:count \u043C\u0456\u0441\u044F\u0446\u0456\u0432"),
                                new ZPair(
                                        "m",
                                        ":count \u043C\u0456\u0441\u044F\u0446\u044C|:count \u043C\u0456\u0441\u044F\u0446\u0456|:count \u043C\u0456\u0441\u044F\u0446\u0456\u0432"),
                                new ZPair(
                                        "week",
                                        ":count \u0442\u0438\u0436\u0434\u0435\u043D\u044C|:count \u0442\u0438\u0436\u043D\u0456|:count \u0442\u0438\u0436\u043D\u0456\u0432"),
                                new ZPair(
                                        "w",
                                        ":count \u0442\u0438\u0436\u0434\u0435\u043D\u044C|:count \u0442\u0438\u0436\u043D\u0456|:count \u0442\u0438\u0436\u043D\u0456\u0432"),
                                new ZPair(
                                        "day",
                                        ":count \u0434\u0435\u043D\u044C|:count \u0434\u043D\u0456|:count \u0434\u043D\u0456\u0432"),
                                new ZPair(
                                        "d",
                                        ":count \u0434\u0435\u043D\u044C|:count \u0434\u043D\u0456|:count \u0434\u043D\u0456\u0432"),
                                new ZPair(
                                        "hour",
                                        ":count \u0433\u043E\u0434\u0438\u043D\u0430|:count \u0433\u043E\u0434\u0438\u043D\u0438|:count \u0433\u043E\u0434\u0438\u043D"),
                                new ZPair(
                                        "h",
                                        ":count \u0433\u043E\u0434\u0438\u043D\u0430|:count \u0433\u043E\u0434\u0438\u043D\u0438|:count \u0433\u043E\u0434\u0438\u043D"),
                                new ZPair(
                                        "minute",
                                        ":count \u0445\u0432\u0438\u043B\u0438\u043D\u0443|:count \u0445\u0432\u0438\u043B\u0438\u043D\u0438|:count \u0445\u0432\u0438\u043B\u0438\u043D"),
                                new ZPair(
                                        "min",
                                        ":count \u0445\u0432\u0438\u043B\u0438\u043D\u0443|:count \u0445\u0432\u0438\u043B\u0438\u043D\u0438|:count \u0445\u0432\u0438\u043B\u0438\u043D"),
                                new ZPair(
                                        "second",
                                        ":count \u0441\u0435\u043A\u0443\u043D\u0434\u0443|:count \u0441\u0435\u043A\u0443\u043D\u0434\u0438|:count \u0441\u0435\u043A\u0443\u043D\u0434"),
                                new ZPair(
                                        "s",
                                        ":count \u0441\u0435\u043A\u0443\u043D\u0434\u0443|:count \u0441\u0435\u043A\u0443\u043D\u0434\u0438|:count \u0441\u0435\u043A\u0443\u043D\u0434"),
                                new ZPair("ago", ":time \u0442\u043E\u043C\u0443"),
                                new ZPair("from_now", "\u0447\u0435\u0440\u0435\u0437 :time"),
                                new ZPair("after", ":time \u043F\u0456\u0441\u043B\u044F"),
                                new ZPair("before", ":time \u0434\u043E"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/uk.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2010 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
