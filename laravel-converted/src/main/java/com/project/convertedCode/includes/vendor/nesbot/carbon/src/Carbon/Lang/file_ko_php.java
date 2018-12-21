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

 vendor/nesbot/carbon/src/Carbon/Lang/ko.php

*/

public class file_ko_php implements RuntimeIncludable {

    public static final file_ko_php instance = new file_ko_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1985 scope = new Scope1985();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1985 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", ":count \uB144"),
                                new ZPair("y", ":count \uB144"),
                                new ZPair("month", ":count \uAC1C\uC6D4"),
                                new ZPair("m", ":count \uAC1C\uC6D4"),
                                new ZPair("week", ":count \uC8FC\uC77C"),
                                new ZPair("w", ":count \uC8FC\uC77C"),
                                new ZPair("day", ":count \uC77C"),
                                new ZPair("d", ":count \uC77C"),
                                new ZPair("hour", ":count \uC2DC\uAC04"),
                                new ZPair("h", ":count \uC2DC\uAC04"),
                                new ZPair("minute", ":count \uBD84"),
                                new ZPair("min", ":count \uBD84"),
                                new ZPair("second", ":count \uCD08"),
                                new ZPair("s", ":count \uCD08"),
                                new ZPair("ago", ":time \uC804"),
                                new ZPair("from_now", ":time \uD6C4"),
                                new ZPair("after", ":time \uB4A4"),
                                new ZPair("before", ":time \uC55E"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/ko.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1985 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
