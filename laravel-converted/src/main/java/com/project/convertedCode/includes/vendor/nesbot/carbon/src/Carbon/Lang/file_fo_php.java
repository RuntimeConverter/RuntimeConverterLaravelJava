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

 vendor/nesbot/carbon/src/Carbon/Lang/fo.php

*/

public class file_fo_php implements RuntimeIncludable {

    public static final file_fo_php instance = new file_fo_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1971 scope = new Scope1971();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1971 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", "1 \u00E1r|:count \u00E1r"),
                                new ZPair("y", "1 \u00E1r|:count \u00E1r"),
                                new ZPair("month", "1 m\u00E1na\u00F0ur|:count m\u00E1na\u00F0ir"),
                                new ZPair("m", "1 m\u00E1na\u00F0ur|:count m\u00E1na\u00F0ir"),
                                new ZPair("week", "1 vika|:count vikur"),
                                new ZPair("w", "1 vika|:count vikur"),
                                new ZPair("day", "1 dag|:count dagar"),
                                new ZPair("d", "1 dag|:count dagar"),
                                new ZPair("hour", "1 t\u00EDmi|:count t\u00EDmar"),
                                new ZPair("h", "1 t\u00EDmi|:count t\u00EDmar"),
                                new ZPair("minute", "1 minutt|:count minuttir"),
                                new ZPair("min", "1 minutt|:count minuttir"),
                                new ZPair("second", "1 sekund|:count sekundir"),
                                new ZPair("s", "1 sekund|:count sekundir"),
                                new ZPair("ago", ":time s\u00ED\u00F0an"),
                                new ZPair("from_now", "um :time"),
                                new ZPair("after", ":time aftan\u00E1"),
                                new ZPair("before", ":time \u00E1\u00F0renn"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/fo.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1971 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
