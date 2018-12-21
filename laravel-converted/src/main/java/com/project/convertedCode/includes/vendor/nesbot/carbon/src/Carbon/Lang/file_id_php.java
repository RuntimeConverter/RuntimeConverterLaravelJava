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

 vendor/nesbot/carbon/src/Carbon/Lang/id.php

*/

public class file_id_php implements RuntimeIncludable {

    public static final file_id_php instance = new file_id_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1979 scope = new Scope1979();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1979 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", ":count tahun"),
                                new ZPair("y", ":count tahun"),
                                new ZPair("month", ":count bulan"),
                                new ZPair("m", ":count bulan"),
                                new ZPair("week", ":count minggu"),
                                new ZPair("w", ":count minggu"),
                                new ZPair("day", ":count hari"),
                                new ZPair("d", ":count hari"),
                                new ZPair("hour", ":count jam"),
                                new ZPair("h", ":count jam"),
                                new ZPair("minute", ":count menit"),
                                new ZPair("min", ":count menit"),
                                new ZPair("second", ":count detik"),
                                new ZPair("s", ":count detik"),
                                new ZPair("ago", ":time yang lalu"),
                                new ZPair("from_now", ":time dari sekarang"),
                                new ZPair("after", ":time setelah"),
                                new ZPair("before", ":time sebelum"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/id.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1979 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
