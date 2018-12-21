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

 vendor/nesbot/carbon/src/Carbon/Lang/sr.php

*/

public class file_sr_php implements RuntimeIncludable {

    public static final file_sr_php instance = new file_sr_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2002 scope = new Scope2002();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2002 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", ":count godina|:count godine|:count godina"),
                                new ZPair("y", ":count godina|:count godine|:count godina"),
                                new ZPair("month", ":count mesec|:count meseca|:count meseci"),
                                new ZPair("m", ":count mesec|:count meseca|:count meseci"),
                                new ZPair("week", ":count nedelja|:count nedelje|:count nedelja"),
                                new ZPair("w", ":count nedelja|:count nedelje|:count nedelja"),
                                new ZPair("day", ":count dan|:count dana|:count dana"),
                                new ZPair("d", ":count dan|:count dana|:count dana"),
                                new ZPair("hour", ":count sat|:count sata|:count sati"),
                                new ZPair("h", ":count sat|:count sata|:count sati"),
                                new ZPair("minute", ":count minut|:count minuta |:count minuta"),
                                new ZPair("min", ":count minut|:count minuta |:count minuta"),
                                new ZPair("second", ":count sekund|:count sekunde|:count sekunde"),
                                new ZPair("s", ":count sekund|:count sekunde|:count sekunde"),
                                new ZPair("ago", "pre :time"),
                                new ZPair("from_now", ":time od sada"),
                                new ZPair("after", "nakon :time"),
                                new ZPair("before", "pre :time"),
                                new ZPair(
                                        "year_from_now",
                                        "{1,21,31,41,51} :count godinu|{2,3,4,22,23,24,32,33,34,42,43,44,52,53,54} :count godine|[5,Inf[ :count godina"),
                                new ZPair(
                                        "year_ago",
                                        "{1,21,31,41,51} :count godinu|{2,3,4,22,23,24,32,33,34,42,43,44,52,53,54} :count godine|[5,Inf[ :count godina"),
                                new ZPair(
                                        "week_from_now",
                                        "{1} :count nedelju|{2,3,4} :count nedelje|[5,Inf[ :count nedelja"),
                                new ZPair(
                                        "week_ago",
                                        "{1} :count nedelju|{2,3,4} :count nedelje|[5,Inf[ :count nedelja"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/sr.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2002 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
