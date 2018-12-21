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

 vendor/nesbot/carbon/src/Carbon/Lang/fi.php

*/

public class file_fi_php implements RuntimeIncludable {

    public static final file_fi_php instance = new file_fi_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1970 scope = new Scope1970();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1970 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", "1 vuosi|:count vuotta"),
                                new ZPair("y", "1 vuosi|:count vuotta"),
                                new ZPair("month", "1 kuukausi|:count kuukautta"),
                                new ZPair("m", "1 kuukausi|:count kuukautta"),
                                new ZPair("week", "1 viikko|:count viikkoa"),
                                new ZPair("w", "1 viikko|:count viikkoa"),
                                new ZPair("day", "1 p\u00E4iv\u00E4|:count p\u00E4iv\u00E4\u00E4"),
                                new ZPair("d", "1 p\u00E4iv\u00E4|:count p\u00E4iv\u00E4\u00E4"),
                                new ZPair("hour", "1 tunti|:count tuntia"),
                                new ZPair("h", "1 tunti|:count tuntia"),
                                new ZPair("minute", "1 minuutti|:count minuuttia"),
                                new ZPair("min", "1 minuutti|:count minuuttia"),
                                new ZPair("second", "1 sekunti|:count sekuntia"),
                                new ZPair("s", "1 sekunti|:count sekuntia"),
                                new ZPair("ago", ":time sitten"),
                                new ZPair("from_now", ":time t\u00E4st\u00E4 hetkest\u00E4"),
                                new ZPair("after", ":time sen j\u00E4lkeen"),
                                new ZPair("before", ":time ennen"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/fi.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1970 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
