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

 vendor/nesbot/carbon/src/Carbon/Lang/km.php

*/

public class file_km_php implements RuntimeIncludable {

    public static final file_km_php instance = new file_km_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1984 scope = new Scope1984();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1984 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", ":count \u1786\u17D2\u1793\u17B6\u17C6"),
                                new ZPair("y", ":count \u1786\u17D2\u1793\u17B6\u17C6"),
                                new ZPair("month", ":count \u1781\u17C2"),
                                new ZPair("m", ":count \u1781\u17C2"),
                                new ZPair(
                                        "week",
                                        ":count \u179F\u1794\u17D2\u178A\u17B6\u17A0\u17CD"),
                                new ZPair("w", ":count \u179F\u1794\u17D2\u178A\u17B6\u17A0\u17CD"),
                                new ZPair("day", ":count \u1790\u17D2\u1784\u17C3"),
                                new ZPair("d", ":count \u1790\u17D2\u1784\u17C3"),
                                new ZPair("hour", ":count \u1798\u17C9\u17C4\u1784"),
                                new ZPair("h", ":count \u1798\u17C9\u17C4\u1784"),
                                new ZPair("minute", ":count \u1793\u17B6\u1791\u17B8"),
                                new ZPair("min", ":count \u1793\u17B6\u1791\u17B8"),
                                new ZPair("second", ":count \u179C\u17B7\u1793\u17B6\u1791\u17B8"),
                                new ZPair("s", ":count \u179C\u17B7\u1793\u17B6\u1791\u17B8"),
                                new ZPair("ago", ":time\u1798\u17BB\u1793"),
                                new ZPair(
                                        "from_now",
                                        ":time\u1796\u17B8\u200B\u17A5\u17A1\u17BC\u179C"),
                                new ZPair(
                                        "after",
                                        "\u1793\u17C5\u200B\u1780\u17D2\u179A\u17C4\u1799 :time"),
                                new ZPair(
                                        "before", "\u1793\u17C5\u200B\u1798\u17BB\u1793 :time"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/km.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1984 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
