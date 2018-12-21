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

 vendor/nesbot/carbon/src/Carbon/Lang/sk.php

*/

public class file_sk_php implements RuntimeIncludable {

    public static final file_sk_php instance = new file_sk_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1999 scope = new Scope1999();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1999 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", "rok|:count roky|:count rokov"),
                                new ZPair("y", "rok|:count roky|:count rokov"),
                                new ZPair("month", "mesiac|:count mesiace|:count mesiacov"),
                                new ZPair("m", "mesiac|:count mesiace|:count mesiacov"),
                                new ZPair(
                                        "week",
                                        "t\u00FD\u017Ede\u0148|:count t\u00FD\u017Edne|:count t\u00FD\u017Ed\u0148ov"),
                                new ZPair(
                                        "w",
                                        "t\u00FD\u017Ede\u0148|:count t\u00FD\u017Edne|:count t\u00FD\u017Ed\u0148ov"),
                                new ZPair("day", "de\u0148|:count dni|:count dn\u00ED"),
                                new ZPair("d", "de\u0148|:count dni|:count dn\u00ED"),
                                new ZPair("hour", "hodinu|:count hodiny|:count hod\u00EDn"),
                                new ZPair("h", "hodinu|:count hodiny|:count hod\u00EDn"),
                                new ZPair(
                                        "minute",
                                        "min\u00FAtu|:count min\u00FAty|:count min\u00FAt"),
                                new ZPair(
                                        "min", "min\u00FAtu|:count min\u00FAty|:count min\u00FAt"),
                                new ZPair("second", "sekundu|:count sekundy|:count sek\u00FAnd"),
                                new ZPair("s", "sekundu|:count sekundy|:count sek\u00FAnd"),
                                new ZPair("ago", "pred :time"),
                                new ZPair("from_now", "za :time"),
                                new ZPair("after", "o :time nesk\u00F4r"),
                                new ZPair("before", ":time predt\u00FDm"),
                                new ZPair("year_ago", "rokom|:count rokmi|:count rokmi"),
                                new ZPair("month_ago", "mesiacom|:count mesiacmi|:count mesiacmi"),
                                new ZPair(
                                        "week_ago",
                                        "t\u00FD\u017Ed\u0148om|:count t\u00FD\u017Ed\u0148ami|:count t\u00FD\u017Ed\u0148ami"),
                                new ZPair(
                                        "day_ago", "d\u0148om|:count d\u0148ami|:count d\u0148ami"),
                                new ZPair("hour_ago", "hodinou|:count hodinami|:count hodinami"),
                                new ZPair(
                                        "minute_ago",
                                        "min\u00FAtou|:count min\u00FAtami|:count min\u00FAtami"),
                                new ZPair(
                                        "second_ago",
                                        "sekundou|:count sekundami|:count sekundami"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/sk.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1999 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
