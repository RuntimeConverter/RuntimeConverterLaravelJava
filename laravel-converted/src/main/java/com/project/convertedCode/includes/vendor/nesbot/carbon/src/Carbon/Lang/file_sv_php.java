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

 vendor/nesbot/carbon/src/Carbon/Lang/sv.php

*/

public class file_sv_php implements RuntimeIncludable {

    public static final file_sv_php instance = new file_sv_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2007 scope = new Scope2007();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2007 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", "1 \u00E5r|:count \u00E5r"),
                                new ZPair("y", "1 \u00E5r|:count \u00E5r"),
                                new ZPair("month", "1 m\u00E5nad|:count m\u00E5nader"),
                                new ZPair("m", "1 m\u00E5nad|:count m\u00E5nader"),
                                new ZPair("week", "1 vecka|:count veckor"),
                                new ZPair("w", "1 vecka|:count veckor"),
                                new ZPair("day", "1 dag|:count dagar"),
                                new ZPair("d", "1 dag|:count dagar"),
                                new ZPair("hour", "1 timme|:count timmar"),
                                new ZPair("h", "1 timme|:count timmar"),
                                new ZPair("minute", "1 minut|:count minuter"),
                                new ZPair("min", "1 minut|:count minuter"),
                                new ZPair("second", "1 sekund|:count sekunder"),
                                new ZPair("s", "1 sekund|:count sekunder"),
                                new ZPair("ago", ":time sedan"),
                                new ZPair("from_now", "om :time"),
                                new ZPair("after", ":time efter"),
                                new ZPair("before", ":time f\u00F6re"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/sv.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2007 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
