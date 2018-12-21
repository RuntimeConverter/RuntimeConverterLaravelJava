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

 vendor/nesbot/carbon/src/Carbon/Lang/sr_Cyrl.php

*/

public class file_sr_Cyrl_php implements RuntimeIncludable {

    public static final file_sr_Cyrl_php instance = new file_sr_Cyrl_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2003 scope = new Scope2003();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2003 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        "year",
                                        "{2,3,4,22,23,24,32,33,34,42,43,44,52,53,54}:count \u0433\u043E\u0434\u0438\u043D\u0435|[0,Inf[ :count \u0433\u043E\u0434\u0438\u043D\u0430"),
                                new ZPair("y", ":count \u0433."),
                                new ZPair(
                                        "month",
                                        "{1} :count \u043C\u0435\u0441\u0435\u0446|{2,3,4}:count \u043C\u0435\u0441\u0435\u0446\u0430|[5,Inf[ :count \u043C\u0435\u0441\u0435\u0446\u0438"),
                                new ZPair("m", ":count \u043C."),
                                new ZPair(
                                        "week",
                                        "{1} :count \u043D\u0435\u0434\u0435\u0459\u0430|{2,3,4}:count \u043D\u0435\u0434\u0435\u0459\u0435|[5,Inf[ :count \u043D\u0435\u0434\u0435\u0459\u0430"),
                                new ZPair("w", ":count \u043D\u0435\u0434."),
                                new ZPair(
                                        "day",
                                        "{1,21,31} :count \u0434\u0430\u043D|[2,Inf[ :count \u0434\u0430\u043D\u0430"),
                                new ZPair("d", ":count \u0434."),
                                new ZPair(
                                        "hour",
                                        "{1,21} :count \u0441\u0430\u0442|{2,3,4,22,23,24}:count \u0441\u0430\u0442\u0430|[5,Inf[ :count \u0441\u0430\u0442\u0438"),
                                new ZPair("h", ":count \u0447."),
                                new ZPair(
                                        "minute",
                                        "{1,21,31,41,51} :count \u043C\u0438\u043D\u0443\u0442|[2,Inf[ :count \u043C\u0438\u043D\u0443\u0442\u0430"),
                                new ZPair("min", ":count \u043C\u0438\u043D."),
                                new ZPair(
                                        "second",
                                        "{1,21,31,41,51} :count \u0441\u0435\u043A\u0443\u043D\u0434|{2,3,4,22,23,24,32,33,34,42,43,44,52,53,54}:count \u0441\u0435\u043A\u0443\u043D\u0434\u0435|[5,Inf[:count \u0441\u0435\u043A\u0443\u043D\u0434\u0438"),
                                new ZPair("s", ":count \u0441\u0435\u043A."),
                                new ZPair("ago", "\u043F\u0440\u0435 :time"),
                                new ZPair("from_now", "\u0437\u0430 :time"),
                                new ZPair("after", ":time \u043D\u0430\u043A\u043E\u043D"),
                                new ZPair("before", ":time \u043F\u0440\u0435"),
                                new ZPair(
                                        "year_from_now",
                                        "{1,21,31,41,51} :count \u0433\u043E\u0434\u0438\u043D\u0443|{2,3,4,22,23,24,32,33,34,42,43,44,52,53,54} :count \u0433\u043E\u0434\u0438\u043D\u0435|[5,Inf[ :count \u0433\u043E\u0434\u0438\u043D\u0430"),
                                new ZPair(
                                        "year_ago",
                                        "{1,21,31,41,51} :count \u0433\u043E\u0434\u0438\u043D\u0443|{2,3,4,22,23,24,32,33,34,42,43,44,52,53,54} :count \u0433\u043E\u0434\u0438\u043D\u0435|[5,Inf[ :count \u0433\u043E\u0434\u0438\u043D\u0430"),
                                new ZPair(
                                        "week_from_now",
                                        "{1} :count \u043D\u0435\u0434\u0435\u0459\u0443|{2,3,4} :count \u043D\u0435\u0434\u0435\u0459\u0435|[5,Inf[ :count \u043D\u0435\u0434\u0435\u0459\u0430"),
                                new ZPair(
                                        "week_ago",
                                        "{1} :count \u043D\u0435\u0434\u0435\u0459\u0443|{2,3,4} :count \u043D\u0435\u0434\u0435\u0459\u0435|[5,Inf[ :count \u043D\u0435\u0434\u0435\u0459\u0430"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/sr_Cyrl.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2003 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
