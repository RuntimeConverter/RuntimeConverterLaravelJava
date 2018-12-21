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

 vendor/nesbot/carbon/src/Carbon/Lang/he.php

*/

public class file_he_php implements RuntimeIncludable {

    public static final file_he_php instance = new file_he_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1975 scope = new Scope1975();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1975 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        "year",
                                        "\u05E9\u05E0\u05D4|{2}\u05E9\u05E0\u05EA\u05D9\u05D9\u05DD|:count \u05E9\u05E0\u05D9\u05DD"),
                                new ZPair(
                                        "y",
                                        "\u05E9\u05E0\u05D4|{2}\u05E9\u05E0\u05EA\u05D9\u05D9\u05DD|:count \u05E9\u05E0\u05D9\u05DD"),
                                new ZPair(
                                        "month",
                                        "\u05D7\u05D5\u05D3\u05E9|{2}\u05D7\u05D5\u05D3\u05E9\u05D9\u05D9\u05DD|:count \u05D7\u05D5\u05D3\u05E9\u05D9\u05DD"),
                                new ZPair(
                                        "m",
                                        "\u05D7\u05D5\u05D3\u05E9|{2}\u05D7\u05D5\u05D3\u05E9\u05D9\u05D9\u05DD|:count \u05D7\u05D5\u05D3\u05E9\u05D9\u05DD"),
                                new ZPair(
                                        "week",
                                        "\u05E9\u05D1\u05D5\u05E2|{2}\u05E9\u05D1\u05D5\u05E2\u05D9\u05D9\u05DD|:count \u05E9\u05D1\u05D5\u05E2\u05D5\u05EA"),
                                new ZPair(
                                        "w",
                                        "\u05E9\u05D1\u05D5\u05E2|{2}\u05E9\u05D1\u05D5\u05E2\u05D9\u05D9\u05DD|:count \u05E9\u05D1\u05D5\u05E2\u05D5\u05EA"),
                                new ZPair(
                                        "day",
                                        "\u05D9\u05D5\u05DD|{2}\u05D9\u05D5\u05DE\u05D9\u05D9\u05DD|:count \u05D9\u05DE\u05D9\u05DD"),
                                new ZPair(
                                        "d",
                                        "\u05D9\u05D5\u05DD|{2}\u05D9\u05D5\u05DE\u05D9\u05D9\u05DD|:count \u05D9\u05DE\u05D9\u05DD"),
                                new ZPair(
                                        "hour",
                                        "\u05E9\u05E2\u05D4|{2}\u05E9\u05E2\u05EA\u05D9\u05D9\u05DD|:count \u05E9\u05E2\u05D5\u05EA"),
                                new ZPair(
                                        "h",
                                        "\u05E9\u05E2\u05D4|{2}\u05E9\u05E2\u05EA\u05D9\u05D9\u05DD|:count \u05E9\u05E2\u05D5\u05EA"),
                                new ZPair(
                                        "minute",
                                        "\u05D3\u05E7\u05D4|{2}\u05D3\u05E7\u05D5\u05EA\u05D9\u05D9\u05DD|:count \u05D3\u05E7\u05D5\u05EA"),
                                new ZPair(
                                        "min",
                                        "\u05D3\u05E7\u05D4|{2}\u05D3\u05E7\u05D5\u05EA\u05D9\u05D9\u05DD|:count \u05D3\u05E7\u05D5\u05EA"),
                                new ZPair(
                                        "second",
                                        "\u05E9\u05E0\u05D9\u05D4|:count \u05E9\u05E0\u05D9\u05D5\u05EA"),
                                new ZPair(
                                        "s",
                                        "\u05E9\u05E0\u05D9\u05D4|:count \u05E9\u05E0\u05D9\u05D5\u05EA"),
                                new ZPair("ago", "\u05DC\u05E4\u05E0\u05D9 :time"),
                                new ZPair("from_now", "\u05D1\u05E2\u05D5\u05D3 :time"),
                                new ZPair("after", "\u05D0\u05D7\u05E8\u05D9 :time"),
                                new ZPair("before", "\u05DC\u05E4\u05E0\u05D9 :time"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/he.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1975 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
