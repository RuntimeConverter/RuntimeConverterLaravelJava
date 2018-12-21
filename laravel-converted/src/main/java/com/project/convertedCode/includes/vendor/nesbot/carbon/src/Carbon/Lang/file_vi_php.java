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

 vendor/nesbot/carbon/src/Carbon/Lang/vi.php

*/

public class file_vi_php implements RuntimeIncludable {

    public static final file_vi_php instance = new file_vi_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2013 scope = new Scope2013();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2013 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", ":count n\u0103m"),
                                new ZPair("y", ":count n\u0103m"),
                                new ZPair("month", ":count th\u00E1ng"),
                                new ZPair("m", ":count th\u00E1ng"),
                                new ZPair("week", ":count tu\u1EA7n"),
                                new ZPair("w", ":count tu\u1EA7n"),
                                new ZPair("day", ":count ng\u00E0y"),
                                new ZPair("d", ":count ng\u00E0y"),
                                new ZPair("hour", ":count gi\u1EDD"),
                                new ZPair("h", ":count gi\u1EDD"),
                                new ZPair("minute", ":count ph\u00FAt"),
                                new ZPair("min", ":count ph\u00FAt"),
                                new ZPair("second", ":count gi\u00E2y"),
                                new ZPair("s", ":count gi\u00E2y"),
                                new ZPair("ago", ":time tr\u01B0\u1EDBc"),
                                new ZPair("from_now", ":time t\u1EEB b\u00E2y gi\u1EDD"),
                                new ZPair("after", ":time sau"),
                                new ZPair("before", ":time tr\u01B0\u1EDBc"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/vi.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2013 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
