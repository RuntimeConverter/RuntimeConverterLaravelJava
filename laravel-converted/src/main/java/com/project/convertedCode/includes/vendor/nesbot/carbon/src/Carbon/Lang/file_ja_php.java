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

 vendor/nesbot/carbon/src/Carbon/Lang/ja.php

*/

public class file_ja_php implements RuntimeIncludable {

    public static final file_ja_php instance = new file_ja_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1981 scope = new Scope1981();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1981 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", ":count\u5E74"),
                                new ZPair("y", ":count\u5E74"),
                                new ZPair("month", ":count\u30F6\u6708"),
                                new ZPair("m", ":count\u30F6\u6708"),
                                new ZPair("week", ":count\u9031\u9593"),
                                new ZPair("w", ":count\u9031\u9593"),
                                new ZPair("day", ":count\u65E5"),
                                new ZPair("d", ":count\u65E5"),
                                new ZPair("hour", ":count\u6642\u9593"),
                                new ZPair("h", ":count\u6642\u9593"),
                                new ZPair("minute", ":count\u5206"),
                                new ZPair("min", ":count\u5206"),
                                new ZPair("second", ":count\u79D2"),
                                new ZPair("s", ":count\u79D2"),
                                new ZPair("ago", ":time\u524D"),
                                new ZPair("from_now", "\u4ECA\u304B\u3089:time"),
                                new ZPair("after", ":time\u5F8C"),
                                new ZPair("before", ":time\u524D"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/ja.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1981 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
