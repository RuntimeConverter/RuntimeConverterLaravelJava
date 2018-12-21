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

 vendor/nesbot/carbon/src/Carbon/Lang/es.php

*/

public class file_es_php implements RuntimeIncludable {

    public static final file_es_php instance = new file_es_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1966 scope = new Scope1966();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1966 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", "1 a\u00F1o|:count a\u00F1os"),
                                new ZPair("y", "1 a\u00F1o|:count a\u00F1os"),
                                new ZPair("month", "1 mes|:count meses"),
                                new ZPair("m", "1 mes|:count meses"),
                                new ZPair("week", "1 semana|:count semanas"),
                                new ZPair("w", "1 semana|:count semanas"),
                                new ZPair("day", "1 d\u00EDa|:count d\u00EDas"),
                                new ZPair("d", "1 d\u00EDa|:count d\u00EDas"),
                                new ZPair("hour", "1 hora|:count horas"),
                                new ZPair("h", "1 hora|:count horas"),
                                new ZPair("minute", "1 minuto|:count minutos"),
                                new ZPair("min", "1 minuto|:count minutos"),
                                new ZPair("second", "1 segundo|:count segundos"),
                                new ZPair("s", "1 segundo|:count segundos"),
                                new ZPair("ago", "hace :time"),
                                new ZPair("from_now", "dentro de :time"),
                                new ZPair("after", ":time despu\u00E9s"),
                                new ZPair("before", ":time antes"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/es.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1966 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
