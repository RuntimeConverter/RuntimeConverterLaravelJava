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

 vendor/nesbot/carbon/src/Carbon/Lang/ka.php

*/

public class file_ka_php implements RuntimeIncludable {

    public static final file_ka_php instance = new file_ka_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1982 scope = new Scope1982();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1982 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", ":count \u10EC\u10DA\u10D8\u10E1"),
                                new ZPair("y", ":count \u10EC\u10DA\u10D8\u10E1"),
                                new ZPair("month", ":count \u10D7\u10D5\u10D8\u10E1"),
                                new ZPair("m", ":count \u10D7\u10D5\u10D8\u10E1"),
                                new ZPair("week", ":count \u10D9\u10D5\u10D8\u10E0\u10D8\u10E1"),
                                new ZPair("w", ":count \u10D9\u10D5\u10D8\u10E0\u10D8\u10E1"),
                                new ZPair("day", ":count \u10D3\u10E6\u10D8\u10E1"),
                                new ZPair("d", ":count \u10D3\u10E6\u10D8\u10E1"),
                                new ZPair("hour", ":count \u10E1\u10D0\u10D0\u10D7\u10D8\u10E1"),
                                new ZPair("h", ":count \u10E1\u10D0\u10D0\u10D7\u10D8\u10E1"),
                                new ZPair("minute", ":count \u10EC\u10E3\u10D7\u10D8\u10E1"),
                                new ZPair("min", ":count \u10EC\u10E3\u10D7\u10D8\u10E1"),
                                new ZPair("second", ":count \u10EC\u10D0\u10DB\u10D8\u10E1"),
                                new ZPair("s", ":count \u10EC\u10D0\u10DB\u10D8\u10E1"),
                                new ZPair("ago", ":time \u10E3\u10D9\u10D0\u10DC"),
                                new ZPair("from_now", ":time \u10E8\u10D4\u10DB\u10D3\u10D4\u10D2"),
                                new ZPair("after", ":time \u10E8\u10D4\u10DB\u10D3\u10D4\u10D2"),
                                new ZPair("before", ":time \u10E3\u10D9\u10D0\u10DC"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/ka.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1982 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
