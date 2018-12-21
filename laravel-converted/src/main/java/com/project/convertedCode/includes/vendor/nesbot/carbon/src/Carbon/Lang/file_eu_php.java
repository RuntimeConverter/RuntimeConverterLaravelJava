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

 vendor/nesbot/carbon/src/Carbon/Lang/eu.php

*/

public class file_eu_php implements RuntimeIncludable {

    public static final file_eu_php instance = new file_eu_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1968 scope = new Scope1968();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1968 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", "Urte 1|:count urte"),
                                new ZPair("y", "Urte 1|:count urte"),
                                new ZPair("month", "Hile 1|:count hile"),
                                new ZPair("m", "Hile 1|:count hile"),
                                new ZPair("week", "Aste 1|:count aste"),
                                new ZPair("w", "Aste 1|:count aste"),
                                new ZPair("day", "Egun 1|:count egun"),
                                new ZPair("d", "Egun 1|:count egun"),
                                new ZPair("hour", "Ordu 1|:count ordu"),
                                new ZPair("h", "Ordu 1|:count ordu"),
                                new ZPair("minute", "Minutu 1|:count minutu"),
                                new ZPair("min", "Minutu 1|:count minutu"),
                                new ZPair("second", "Segundu 1|:count segundu"),
                                new ZPair("s", "Segundu 1|:count segundu"),
                                new ZPair("ago", "Orain dela :time"),
                                new ZPair("from_now", ":time barru"),
                                new ZPair("after", ":time geroago"),
                                new ZPair("before", ":time lehenago"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/eu.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1968 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
