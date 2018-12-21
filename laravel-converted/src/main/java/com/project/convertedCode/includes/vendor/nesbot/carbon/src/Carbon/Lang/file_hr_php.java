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

 vendor/nesbot/carbon/src/Carbon/Lang/hr.php

*/

public class file_hr_php implements RuntimeIncludable {

    public static final file_hr_php instance = new file_hr_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1976 scope = new Scope1976();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1976 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", ":count godinu|:count godine|:count godina"),
                                new ZPair("y", ":count godinu|:count godine|:count godina"),
                                new ZPair("month", ":count mjesec|:count mjeseca|:count mjeseci"),
                                new ZPair("m", ":count mjesec|:count mjeseca|:count mjeseci"),
                                new ZPair("week", ":count tjedan|:count tjedna|:count tjedana"),
                                new ZPair("w", ":count tjedan|:count tjedna|:count tjedana"),
                                new ZPair("day", ":count dan|:count dana|:count dana"),
                                new ZPair("d", ":count dan|:count dana|:count dana"),
                                new ZPair("hour", ":count sat|:count sata|:count sati"),
                                new ZPair("h", ":count sat|:count sata|:count sati"),
                                new ZPair("minute", ":count minutu|:count minute |:count minuta"),
                                new ZPair("min", ":count minutu|:count minute |:count minuta"),
                                new ZPair("second", ":count sekundu|:count sekunde|:count sekundi"),
                                new ZPair("s", ":count sekundu|:count sekunde|:count sekundi"),
                                new ZPair("ago", "prije :time"),
                                new ZPair("from_now", "za :time"),
                                new ZPair("after", "za :time"),
                                new ZPair("before", "prije :time"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/hr.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1976 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
