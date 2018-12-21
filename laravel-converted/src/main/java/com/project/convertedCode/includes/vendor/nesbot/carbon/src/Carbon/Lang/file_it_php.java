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

 vendor/nesbot/carbon/src/Carbon/Lang/it.php

*/

public class file_it_php implements RuntimeIncludable {

    public static final file_it_php instance = new file_it_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1980 scope = new Scope1980();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1980 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", "1 anno|:count anni"),
                                new ZPair("y", "1 anno|:count anni"),
                                new ZPair("month", "1 mese|:count mesi"),
                                new ZPair("m", "1 mese|:count mesi"),
                                new ZPair("week", "1 settimana|:count settimane"),
                                new ZPair("w", "1 settimana|:count settimane"),
                                new ZPair("day", "1 giorno|:count giorni"),
                                new ZPair("d", "1 giorno|:count giorni"),
                                new ZPair("hour", "1 ora|:count ore"),
                                new ZPair("h", "1 ora|:count ore"),
                                new ZPair("minute", "1 minuto|:count minuti"),
                                new ZPair("min", "1 minuto|:count minuti"),
                                new ZPair("second", "1 secondo|:count secondi"),
                                new ZPair("s", "1 secondo|:count secondi"),
                                new ZPair("ago", ":time fa"),
                                new ZPair("from_now", ":time da adesso"),
                                new ZPair("after", ":time dopo"),
                                new ZPair("before", ":time prima"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/it.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1980 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
