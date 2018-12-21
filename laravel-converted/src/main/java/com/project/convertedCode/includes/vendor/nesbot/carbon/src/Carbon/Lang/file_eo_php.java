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

 vendor/nesbot/carbon/src/Carbon/Lang/eo.php

*/

public class file_eo_php implements RuntimeIncludable {

    public static final file_eo_php instance = new file_eo_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1965 scope = new Scope1965();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1965 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", "1 jaro|:count jaroj"),
                                new ZPair("y", "1 jaro|:count jaroj"),
                                new ZPair("month", "1 monato|:count monatoj"),
                                new ZPair("m", "1 monato|:count monatoj"),
                                new ZPair("week", "1 semajno|:count semajnoj"),
                                new ZPair("w", "1 semajno|:count semajnoj"),
                                new ZPair("day", "1 tago|:count tagoj"),
                                new ZPair("d", "1 tago|:count tagoj"),
                                new ZPair("hour", "1 horo|:count horoj"),
                                new ZPair("h", "1 horo|:count horoj"),
                                new ZPair("minute", "1 minuto|:count minutoj"),
                                new ZPair("min", "1 minuto|:count minutoj"),
                                new ZPair("second", "1 sekundo|:count sekundoj"),
                                new ZPair("s", "1 sekundo|:count sekundoj"),
                                new ZPair("ago", "anta\u016D :time"),
                                new ZPair("from_now", "je :time"),
                                new ZPair("after", ":time poste"),
                                new ZPair("before", ":time anta\u016De"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/eo.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1965 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
