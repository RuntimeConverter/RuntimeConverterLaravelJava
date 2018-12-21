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

 vendor/nesbot/carbon/src/Carbon/Lang/bn.php

*/

public class file_bn_php implements RuntimeIncludable {

    public static final file_bn_php instance = new file_bn_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1957 scope = new Scope1957();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1957 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        "year",
                                        "\u09E7 \u09AC\u099B\u09B0|:count \u09AC\u099B\u09B0"),
                                new ZPair(
                                        "y", "\u09E7 \u09AC\u099B\u09B0|:count \u09AC\u099B\u09B0"),
                                new ZPair(
                                        "month",
                                        "\u09E7 \u09AE\u09BE\u09B8|:count \u09AE\u09BE\u09B8"),
                                new ZPair(
                                        "m", "\u09E7 \u09AE\u09BE\u09B8|:count \u09AE\u09BE\u09B8"),
                                new ZPair(
                                        "week",
                                        "\u09E7 \u09B8\u09AA\u09CD\u09A4\u09BE\u09B9|:count \u09B8\u09AA\u09CD\u09A4\u09BE\u09B9"),
                                new ZPair(
                                        "w",
                                        "\u09E7 \u09B8\u09AA\u09CD\u09A4\u09BE\u09B9|:count \u09B8\u09AA\u09CD\u09A4\u09BE\u09B9"),
                                new ZPair(
                                        "day",
                                        "\u09E7 \u09A6\u09BF\u09A8|:count \u09A6\u09BF\u09A8"),
                                new ZPair(
                                        "d", "\u09E7 \u09A6\u09BF\u09A8|:count \u09A6\u09BF\u09A8"),
                                new ZPair(
                                        "hour",
                                        "\u09E7 \u0998\u09A8\u09CD\u099F\u09BE|:count \u0998\u09A8\u09CD\u099F\u09BE"),
                                new ZPair(
                                        "h",
                                        "\u09E7 \u0998\u09A8\u09CD\u099F\u09BE|:count \u0998\u09A8\u09CD\u099F\u09BE"),
                                new ZPair(
                                        "minute",
                                        "\u09E7 \u09AE\u09BF\u09A8\u09BF\u099F|:count \u09AE\u09BF\u09A8\u09BF\u099F"),
                                new ZPair(
                                        "min",
                                        "\u09E7 \u09AE\u09BF\u09A8\u09BF\u099F|:count \u09AE\u09BF\u09A8\u09BF\u099F"),
                                new ZPair(
                                        "second",
                                        "\u09E7 \u09B8\u09C7\u0995\u09C7\u09A8\u09CD\u09A1|:count \u09B8\u09C7\u0995\u09C7\u09A8\u09CD\u09A1"),
                                new ZPair(
                                        "s",
                                        "\u09E7 \u09B8\u09C7\u0995\u09C7\u09A8\u09CD\u09A1|:count \u09B8\u09C7\u0995\u09C7\u09A8\u09CD\u09A1"),
                                new ZPair("ago", ":time \u09AA\u09C2\u09B0\u09CD\u09AC\u09C7"),
                                new ZPair(
                                        "from_now",
                                        "\u098F\u0996\u09A8 \u09A5\u09C7\u0995\u09C7 :time"),
                                new ZPair("after", ":time \u09AA\u09B0\u09C7"),
                                new ZPair("before", ":time \u0986\u0997\u09C7"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/bn.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1957 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
