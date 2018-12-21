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

 vendor/nesbot/carbon/src/Carbon/Lang/lv.php

*/

public class file_lv_php implements RuntimeIncludable {

    public static final file_lv_php instance = new file_lv_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1987 scope = new Scope1987();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1987 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", "0 gadiem|:count gada|:count gadiem"),
                                new ZPair("y", "0 gadiem|:count gada|:count gadiem"),
                                new ZPair(
                                        "month",
                                        "0 m\u0113ne\u0161iem|:count m\u0113ne\u0161a|:count m\u0113ne\u0161iem"),
                                new ZPair(
                                        "m",
                                        "0 m\u0113ne\u0161iem|:count m\u0113ne\u0161a|:count m\u0113ne\u0161iem"),
                                new ZPair(
                                        "week",
                                        "0 ned\u0113\u013C\u0101m|:count ned\u0113\u013Cas|:count ned\u0113\u013C\u0101m"),
                                new ZPair(
                                        "w",
                                        "0 ned\u0113\u013C\u0101m|:count ned\u0113\u013Cas|:count ned\u0113\u013C\u0101m"),
                                new ZPair("day", "0 dien\u0101m|:count dienas|:count dien\u0101m"),
                                new ZPair("d", "0 dien\u0101m|:count dienas|:count dien\u0101m"),
                                new ZPair(
                                        "hour",
                                        "0 stund\u0101m|:count stundas|:count stund\u0101m"),
                                new ZPair("h", "0 stund\u0101m|:count stundas|:count stund\u0101m"),
                                new ZPair(
                                        "minute",
                                        "0 min\u016Bt\u0113m|:count min\u016Btes|:count min\u016Bt\u0113m"),
                                new ZPair(
                                        "min",
                                        "0 min\u016Bt\u0113m|:count min\u016Btes|:count min\u016Bt\u0113m"),
                                new ZPair(
                                        "second",
                                        "0 sekund\u0113m|:count sekundes|:count sekund\u0113m"),
                                new ZPair(
                                        "s",
                                        "0 sekund\u0113m|:count sekundes|:count sekund\u0113m"),
                                new ZPair("ago", "pirms :time"),
                                new ZPair("from_now", "p\u0113c :time"),
                                new ZPair("after", ":time v\u0113l\u0101k"),
                                new ZPair("before", ":time pirms"),
                                new ZPair("year_after", "0 gadus|:count gadu|:count gadus"),
                                new ZPair(
                                        "month_after",
                                        "0 m\u0113ne\u0161us|:count m\u0113nesi|:count m\u0113ne\u0161us"),
                                new ZPair(
                                        "week_after",
                                        "0 ned\u0113\u013Cas|:count ned\u0113\u013Cu|:count ned\u0113\u013Cas"),
                                new ZPair("day_after", "0 dienas|:count dienu|:count dienas"),
                                new ZPair("hour_after", "0 stundas|:count stundu|:count stundas"),
                                new ZPair(
                                        "minute_after",
                                        "0 min\u016Btes|:count min\u016Bti|:count min\u016Btes"),
                                new ZPair(
                                        "second_after",
                                        "0 sekundes|:count sekundi|:count sekundes"),
                                new ZPair("year_before", "0 gadus|:count gadu|:count gadus"),
                                new ZPair(
                                        "month_before",
                                        "0 m\u0113ne\u0161us|:count m\u0113nesi|:count m\u0113ne\u0161us"),
                                new ZPair(
                                        "week_before",
                                        "0 ned\u0113\u013Cas|:count ned\u0113\u013Cu|:count ned\u0113\u013Cas"),
                                new ZPair("day_before", "0 dienas|:count dienu|:count dienas"),
                                new ZPair("hour_before", "0 stundas|:count stundu|:count stundas"),
                                new ZPair(
                                        "minute_before",
                                        "0 min\u016Btes|:count min\u016Bti|:count min\u016Btes"),
                                new ZPair(
                                        "second_before",
                                        "0 sekundes|:count sekundi|:count sekundes"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/lv.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1987 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
