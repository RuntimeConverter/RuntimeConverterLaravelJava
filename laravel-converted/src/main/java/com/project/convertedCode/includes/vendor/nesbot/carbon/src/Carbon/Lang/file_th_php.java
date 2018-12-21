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

 vendor/nesbot/carbon/src/Carbon/Lang/th.php

*/

public class file_th_php implements RuntimeIncludable {

    public static final file_th_php instance = new file_th_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2008 scope = new Scope2008();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2008 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", ":count \u0E1B\u0E35"),
                                new ZPair("y", ":count \u0E1B\u0E35"),
                                new ZPair("month", ":count \u0E40\u0E14\u0E37\u0E2D\u0E19"),
                                new ZPair("m", ":count \u0E40\u0E14\u0E37\u0E2D\u0E19"),
                                new ZPair(
                                        "week",
                                        ":count \u0E2A\u0E31\u0E1B\u0E14\u0E32\u0E2B\u0E4C"),
                                new ZPair("w", ":count \u0E2A\u0E31\u0E1B\u0E14\u0E32\u0E2B\u0E4C"),
                                new ZPair("day", ":count \u0E27\u0E31\u0E19"),
                                new ZPair("d", ":count \u0E27\u0E31\u0E19"),
                                new ZPair(
                                        "hour",
                                        ":count \u0E0A\u0E31\u0E48\u0E27\u0E42\u0E21\u0E07"),
                                new ZPair("h", ":count \u0E0A\u0E31\u0E48\u0E27\u0E42\u0E21\u0E07"),
                                new ZPair("minute", ":count \u0E19\u0E32\u0E17\u0E35"),
                                new ZPair("min", ":count \u0E19\u0E32\u0E17\u0E35"),
                                new ZPair("second", ":count \u0E27\u0E34\u0E19\u0E32\u0E17\u0E35"),
                                new ZPair("s", ":count \u0E27\u0E34\u0E19\u0E32\u0E17\u0E35"),
                                new ZPair("ago", ":time\u0E17\u0E35\u0E48\u0E41\u0E25\u0E49\u0E27"),
                                new ZPair(
                                        "from_now",
                                        ":time\u0E15\u0E48\u0E2D\u0E08\u0E32\u0E01\u0E19\u0E35\u0E49"),
                                new ZPair(
                                        "after",
                                        ":time\u0E2B\u0E25\u0E31\u0E07\u0E08\u0E32\u0E01\u0E19\u0E35\u0E49"),
                                new ZPair("before", ":time\u0E01\u0E48\u0E2D\u0E19"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/th.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2008 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
