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

 vendor/nesbot/carbon/src/Carbon/Lang/kk.php

*/

public class file_kk_php implements RuntimeIncludable {

    public static final file_kk_php instance = new file_kk_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1983 scope = new Scope1983();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1983 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", ":count \u0436\u044B\u043B"),
                                new ZPair("y", ":count \u0436\u044B\u043B"),
                                new ZPair("month", ":count \u0430\u0439"),
                                new ZPair("m", ":count \u0430\u0439"),
                                new ZPair("week", ":count \u0430\u043F\u0442\u0430"),
                                new ZPair("w", ":count \u0430\u043F\u0442\u0430"),
                                new ZPair("day", ":count \u043A\u04AF\u043D"),
                                new ZPair("d", ":count \u043A\u04AF\u043D"),
                                new ZPair("hour", ":count \u0441\u0430\u0493\u0430\u0442"),
                                new ZPair("h", ":count \u0441\u0430\u0493\u0430\u0442"),
                                new ZPair("minute", ":count \u043C\u0438\u043D\u0443\u0442"),
                                new ZPair("min", ":count \u043C\u0438\u043D\u0443\u0442"),
                                new ZPair("second", ":count \u0441\u0435\u043A\u0443\u043D\u0434"),
                                new ZPair("s", ":count \u0441\u0435\u043A\u0443\u043D\u0434"),
                                new ZPair("ago", ":time \u0431\u04B1\u0440\u044B\u043D"),
                                new ZPair("from_now", ":time \u043A\u0435\u0439\u0456\u043D"),
                                new ZPair("after", ":time \u043A\u0435\u0439\u0456\u043D"),
                                new ZPair("before", ":time \u0431\u04B1\u0440\u044B\u043D"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/kk.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1983 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
