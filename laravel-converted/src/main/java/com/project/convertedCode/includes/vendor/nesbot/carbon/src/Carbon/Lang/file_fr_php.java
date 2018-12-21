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

 vendor/nesbot/carbon/src/Carbon/Lang/fr.php

*/

public class file_fr_php implements RuntimeIncludable {

    public static final file_fr_php instance = new file_fr_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1972 scope = new Scope1972();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1972 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", "1 an|:count ans"),
                                new ZPair("y", "1 an|:count ans"),
                                new ZPair("month", ":count mois"),
                                new ZPair("m", ":count mois"),
                                new ZPair("week", "1 semaine|:count semaines"),
                                new ZPair("w", "1 sem.|:count sem."),
                                new ZPair("day", "1 jour|:count jours"),
                                new ZPair("d", "1 j.|:count j."),
                                new ZPair("hour", "1 heure|:count heures"),
                                new ZPair("h", "1 h|:count h."),
                                new ZPair("minute", "1 minute|:count minutes"),
                                new ZPair("min", "1 min.|:count min."),
                                new ZPair("second", "1 seconde|:count secondes"),
                                new ZPair("s", "1 sec.|:count sec."),
                                new ZPair("ago", "il y a :time"),
                                new ZPair("from_now", "dans :time"),
                                new ZPair("after", ":time apr\u00E8s"),
                                new ZPair("before", ":time avant"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/fr.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1972 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
