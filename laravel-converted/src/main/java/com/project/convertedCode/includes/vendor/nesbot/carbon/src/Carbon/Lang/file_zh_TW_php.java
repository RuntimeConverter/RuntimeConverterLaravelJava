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

 vendor/nesbot/carbon/src/Carbon/Lang/zh_TW.php

*/

public class file_zh_TW_php implements RuntimeIncludable {

    public static final file_zh_TW_php instance = new file_zh_TW_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2015 scope = new Scope2015();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2015 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", ":count\u5E74"),
                                new ZPair("y", ":count\u5E74"),
                                new ZPair("month", ":count\u6708"),
                                new ZPair("m", ":count\u6708"),
                                new ZPair("week", ":count\u9031"),
                                new ZPair("w", ":count\u9031"),
                                new ZPair("day", ":count\u5929"),
                                new ZPair("d", ":count\u5929"),
                                new ZPair("hour", ":count\u5C0F\u6642"),
                                new ZPair("h", ":count\u5C0F\u6642"),
                                new ZPair("minute", ":count\u5206\u9418"),
                                new ZPair("min", ":count\u5206\u9418"),
                                new ZPair("second", ":count\u79D2"),
                                new ZPair("s", ":count\u79D2"),
                                new ZPair("ago", ":time\u524D"),
                                new ZPair("from_now", "\u8DDD\u73FE\u5728:time"),
                                new ZPair("after", ":time\u5F8C"),
                                new ZPair("before", ":time\u524D"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/zh_TW.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2015 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
