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

 vendor/nesbot/carbon/src/Carbon/Lang/cs.php

*/

public class file_cs_php implements RuntimeIncludable {

    public static final file_cs_php instance = new file_cs_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1959 scope = new Scope1959();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1959 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", "1 rok|:count roky|:count let"),
                                new ZPair("y", "1 rok|:count roky|:count let"),
                                new ZPair(
                                        "month",
                                        "1 m\u011Bs\u00EDc|:count m\u011Bs\u00EDce|:count m\u011Bs\u00EDc\u016F"),
                                new ZPair(
                                        "m",
                                        "1 m\u011Bs\u00EDc|:count m\u011Bs\u00EDce|:count m\u011Bs\u00EDc\u016F"),
                                new ZPair(
                                        "week",
                                        "1 t\u00FDden|:count t\u00FDdny|:count t\u00FDdn\u016F"),
                                new ZPair(
                                        "w",
                                        "1 t\u00FDden|:count t\u00FDdny|:count t\u00FDdn\u016F"),
                                new ZPair("day", "1 den|:count dny|:count dn\u00ED"),
                                new ZPair("d", "1 den|:count dny|:count dn\u00ED"),
                                new ZPair("hour", "1 hodinu|:count hodiny|:count hodin"),
                                new ZPair("h", "1 hodinu|:count hodiny|:count hodin"),
                                new ZPair("minute", "1 minutu|:count minuty|:count minut"),
                                new ZPair("min", "1 minutu|:count minuty|:count minut"),
                                new ZPair("second", "1 sekundu|:count sekundy|:count sekund"),
                                new ZPair("s", "1 sekundu|:count sekundy|:count sekund"),
                                new ZPair("ago", ":time nazp\u011Bt"),
                                new ZPair("from_now", "za :time"),
                                new ZPair("after", ":time pozd\u011Bji"),
                                new ZPair("before", ":time p\u0159edt\u00EDm"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/cs.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1959 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
