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

 vendor/nesbot/carbon/src/Carbon/Lang/mk.php

*/

public class file_mk_php implements RuntimeIncludable {

    public static final file_mk_php instance = new file_mk_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1988 scope = new Scope1988();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1988 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        "year",
                                        "1 \u0433\u043E\u0434\u0438\u043D\u0430|:count \u0433\u043E\u0434\u0438\u043D\u0438"),
                                new ZPair(
                                        "month",
                                        "1 \u043C\u0435\u0441\u0435\u0446|:count \u043C\u0435\u0441\u0435\u0446\u0438"),
                                new ZPair(
                                        "week",
                                        "1 \u0441\u0435\u0434\u043C\u0438\u0446\u0430|:count \u0441\u0435\u0434\u043C\u0438\u0446\u0438"),
                                new ZPair(
                                        "day",
                                        "1 \u0434\u0435\u043D|:count \u0434\u0435\u043D\u0430"),
                                new ZPair(
                                        "hour",
                                        "1 \u0447\u0430\u0441|:count \u0447\u0430\u0441\u0430"),
                                new ZPair(
                                        "minute",
                                        "1 \u043C\u0438\u043D\u0443\u0442\u0430|:count \u043C\u0438\u043D\u0443\u0442\u0438"),
                                new ZPair(
                                        "second",
                                        "1 \u0441\u0435\u043A\u0443\u043D\u0434\u0430|:count \u0441\u0435\u043A\u0443\u043D\u0434\u0438"),
                                new ZPair("ago", "\u043F\u0440\u0435\u0434 :time"),
                                new ZPair(
                                        "from_now", ":time \u043E\u0434 \u0441\u0435\u0433\u0430"),
                                new ZPair("after", "\u043F\u043E :time"),
                                new ZPair("before", "\u043F\u0440\u0435\u0434 :time"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/mk.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1988 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
