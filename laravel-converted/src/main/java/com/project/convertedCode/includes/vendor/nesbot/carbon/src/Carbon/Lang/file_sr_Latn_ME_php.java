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

 vendor/nesbot/carbon/src/Carbon/Lang/sr_Latn_ME.php

*/

public class file_sr_Latn_ME_php implements RuntimeIncludable {

    public static final file_sr_Latn_ME_php instance = new file_sr_Latn_ME_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2005 scope = new Scope2005();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2005 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        "year",
                                        "{2,3,4,22,23,24,32,33,34,42,43,44,52,53,54}:count godine|[0,Inf[ :count godina"),
                                new ZPair("y", ":count g."),
                                new ZPair(
                                        "month",
                                        "{1} :count mjesec|{2,3,4}:count mjeseca|[5,Inf[ :count mjeseci"),
                                new ZPair("m", ":count mj."),
                                new ZPair(
                                        "week",
                                        "{1} :count nedjelja|{2,3,4}:count nedjelje|[5,Inf[ :count nedjelja"),
                                new ZPair("w", ":count ned."),
                                new ZPair("day", "{1,21,31} :count dan|[2,Inf[ :count dana"),
                                new ZPair("d", ":count d."),
                                new ZPair(
                                        "hour",
                                        "{1,21} :count sat|{2,3,4,22,23,24}:count sata|[5,Inf[ :count sati"),
                                new ZPair("h", ":count \u010D."),
                                new ZPair(
                                        "minute",
                                        "{1,21,31,41,51} :count minut|[2,Inf[ :count minuta"),
                                new ZPair("min", ":count min."),
                                new ZPair(
                                        "second",
                                        "{1,21,31,41,51} :count sekund|{2,3,4,22,23,24,32,33,34,42,43,44,52,53,54}:count sekunde|[5,Inf[:count sekundi"),
                                new ZPair("s", ":count sek."),
                                new ZPair("ago", "prije :time"),
                                new ZPair("from_now", "za :time"),
                                new ZPair("after", ":time nakon"),
                                new ZPair("before", ":time prije"),
                                new ZPair(
                                        "year_from_now",
                                        "{1,21,31,41,51} :count godinu|{2,3,4,22,23,24,32,33,34,42,43,44,52,53,54} :count godine|[5,Inf[ :count godina"),
                                new ZPair(
                                        "year_ago",
                                        "{1,21,31,41,51} :count godinu|{2,3,4,22,23,24,32,33,34,42,43,44,52,53,54} :count godine|[5,Inf[ :count godina"),
                                new ZPair(
                                        "week_from_now",
                                        "{1} :count nedjelju|{2,3,4} :count nedjelje|[5,Inf[ :count nedjelja"),
                                new ZPair(
                                        "week_ago",
                                        "{1} :count nedjelju|{2,3,4} :count nedjelje|[5,Inf[ :count nedjelja"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/sr_Latn_ME.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2005 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
