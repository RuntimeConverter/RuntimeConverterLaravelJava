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

 vendor/nesbot/carbon/src/Carbon/Lang/da.php

*/

public class file_da_php implements RuntimeIncludable {

    public static final file_da_php instance = new file_da_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1960 scope = new Scope1960();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1960 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", "1 \u00E5r|:count \u00E5r"),
                                new ZPair("y", "1 \u00E5r|:count \u00E5r"),
                                new ZPair("month", "1 m\u00E5ned|:count m\u00E5neder"),
                                new ZPair("m", "1 m\u00E5ned|:count m\u00E5neder"),
                                new ZPair("week", "1 uge|:count uger"),
                                new ZPair("w", "1 uge|:count uger"),
                                new ZPair("day", "1 dag|:count dage"),
                                new ZPair("d", "1 dag|:count dage"),
                                new ZPair("hour", "1 time|:count timer"),
                                new ZPair("h", "1 time|:count timer"),
                                new ZPair("minute", "1 minut|:count minutter"),
                                new ZPair("min", "1 minut|:count minutter"),
                                new ZPair("second", "1 sekund|:count sekunder"),
                                new ZPair("s", "1 sekund|:count sekunder"),
                                new ZPair("ago", ":time siden"),
                                new ZPair("from_now", "om :time"),
                                new ZPair("after", ":time efter"),
                                new ZPair("before", ":time f\u00F8r"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/da.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1960 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
