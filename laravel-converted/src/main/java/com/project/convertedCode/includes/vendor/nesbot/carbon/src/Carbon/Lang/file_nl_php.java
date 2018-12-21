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

 vendor/nesbot/carbon/src/Carbon/Lang/nl.php

*/

public class file_nl_php implements RuntimeIncludable {

    public static final file_nl_php instance = new file_nl_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1991 scope = new Scope1991();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1991 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", ":count jaar"),
                                new ZPair("y", ":count jaar"),
                                new ZPair("month", "1 maand|:count maanden"),
                                new ZPair("m", "1 maand|:count maanden"),
                                new ZPair("week", "1 week|:count weken"),
                                new ZPair("w", "1 week|:count weken"),
                                new ZPair("day", "1 dag|:count dagen"),
                                new ZPair("d", "1 dag|:count dagen"),
                                new ZPair("hour", ":count uur"),
                                new ZPair("h", ":count uur"),
                                new ZPair("minute", "1 minuut|:count minuten"),
                                new ZPair("min", "1 minuut|:count minuten"),
                                new ZPair("second", "1 seconde|:count seconden"),
                                new ZPair("s", "1 seconde|:count seconden"),
                                new ZPair("ago", ":time geleden"),
                                new ZPair("from_now", "over :time"),
                                new ZPair("after", ":time later"),
                                new ZPair("before", ":time eerder"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/nl.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1991 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
