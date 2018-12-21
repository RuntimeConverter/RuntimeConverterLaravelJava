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

 vendor/nesbot/carbon/src/Carbon/Lang/pl.php

*/

public class file_pl_php implements RuntimeIncludable {

    public static final file_pl_php instance = new file_pl_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1993 scope = new Scope1993();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1993 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", "1 rok|:count lata|:count lat"),
                                new ZPair("y", "1 rok|:count lata|:count lat"),
                                new ZPair(
                                        "month",
                                        "1 miesi\u0105c|:count miesi\u0105ce|:count miesi\u0119cy"),
                                new ZPair(
                                        "m",
                                        "1 miesi\u0105c|:count miesi\u0105ce|:count miesi\u0119cy"),
                                new ZPair("week", "1 tydzie\u0144|:count tygodnie|:count tygodni"),
                                new ZPair("w", "1 tydzie\u0144|:count tygodnie|:count tygodni"),
                                new ZPair("day", "1 dzie\u0144|:count dni|:count dni"),
                                new ZPair("d", "1 dzie\u0144|:count dni|:count dni"),
                                new ZPair("hour", "1 godzina|:count godziny|:count godzin"),
                                new ZPair("h", "1 godzina|:count godziny|:count godzin"),
                                new ZPair("minute", "1 minuta|:count minuty|:count minut"),
                                new ZPair("min", "1 minuta|:count minuty|:count minut"),
                                new ZPair("second", "1 sekunda|:count sekundy|:count sekund"),
                                new ZPair("s", "1 sekunda|:count sekundy|:count sekund"),
                                new ZPair("ago", ":time temu"),
                                new ZPair("from_now", ":time od teraz"),
                                new ZPair("after", ":time po"),
                                new ZPair("before", ":time przed"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/pl.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1993 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
