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

 vendor/nesbot/carbon/src/Carbon/Lang/en.php

*/

public class file_en_php implements RuntimeIncludable {

    public static final file_en_php instance = new file_en_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1964 scope = new Scope1964();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1964 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", "1 year|:count years"),
                                new ZPair("y", "1yr|:countyrs"),
                                new ZPair("month", "1 month|:count months"),
                                new ZPair("m", "1mo|:countmos"),
                                new ZPair("week", "1 week|:count weeks"),
                                new ZPair("w", "1w|:countw"),
                                new ZPair("day", "1 day|:count days"),
                                new ZPair("d", "1d|:countd"),
                                new ZPair("hour", "1 hour|:count hours"),
                                new ZPair("h", "1h|:counth"),
                                new ZPair("minute", "1 minute|:count minutes"),
                                new ZPair("min", "1m|:countm"),
                                new ZPair("second", "1 second|:count seconds"),
                                new ZPair("s", "1s|:counts"),
                                new ZPair("ago", ":time ago"),
                                new ZPair("from_now", ":time from now"),
                                new ZPair("after", ":time after"),
                                new ZPair("before", ":time before"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/en.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1964 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
