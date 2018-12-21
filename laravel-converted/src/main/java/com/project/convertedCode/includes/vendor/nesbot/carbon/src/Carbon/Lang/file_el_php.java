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

 vendor/nesbot/carbon/src/Carbon/Lang/el.php

*/

public class file_el_php implements RuntimeIncludable {

    public static final file_el_php instance = new file_el_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1963 scope = new Scope1963();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1963 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        "year",
                                        "1 \u03C7\u03C1\u03CC\u03BD\u03BF\u03C2|:count \u03C7\u03C1\u03CC\u03BD\u03B9\u03B1"),
                                new ZPair(
                                        "y",
                                        "1 \u03C7\u03C1\u03CC\u03BD\u03BF\u03C2|:count \u03C7\u03C1\u03CC\u03BD\u03B9\u03B1"),
                                new ZPair(
                                        "month",
                                        "1 \u03BC\u03AE\u03BD\u03B1\u03C2|:count \u03BC\u03AE\u03BD\u03B5\u03C2"),
                                new ZPair(
                                        "m",
                                        "1 \u03BC\u03AE\u03BD\u03B1\u03C2|:count \u03BC\u03AE\u03BD\u03B5\u03C2"),
                                new ZPair(
                                        "week",
                                        "1 \u03B5\u03B2\u03B4\u03BF\u03BC\u03AC\u03B4\u03B1|:count \u03B5\u03B2\u03B4\u03BF\u03BC\u03AC\u03B4\u03B5\u03C2"),
                                new ZPair(
                                        "w",
                                        "1 \u03B5\u03B2\u03B4\u03BF\u03BC\u03AC\u03B4\u03B1|:count \u03B5\u03B2\u03B4\u03BF\u03BC\u03AC\u03B4\u03B5\u03C2"),
                                new ZPair(
                                        "day",
                                        "1 \u03BC\u03AD\u03C1\u03B1|:count \u03BC\u03AD\u03C1\u03B5\u03C2"),
                                new ZPair(
                                        "d",
                                        "1 \u03BC\u03AD\u03C1\u03B1|:count \u03BC\u03AD\u03C1\u03B5\u03C2"),
                                new ZPair(
                                        "hour",
                                        "1 \u03CE\u03C1\u03B1|:count \u03CE\u03C1\u03B5\u03C2"),
                                new ZPair(
                                        "h",
                                        "1 \u03CE\u03C1\u03B1|:count \u03CE\u03C1\u03B5\u03C2"),
                                new ZPair(
                                        "minute",
                                        "1 \u03BB\u03B5\u03C0\u03C4\u03CC|:count \u03BB\u03B5\u03C0\u03C4\u03AC"),
                                new ZPair(
                                        "min",
                                        "1 \u03BB\u03B5\u03C0\u03C4\u03CC|:count \u03BB\u03B5\u03C0\u03C4\u03AC"),
                                new ZPair(
                                        "second",
                                        "1 \u03B4\u03B5\u03C5\u03C4\u03B5\u03C1\u03CC\u03BB\u03B5\u03C0\u03C4\u03BF|:count \u03B4\u03B5\u03C5\u03C4\u03B5\u03C1\u03CC\u03BB\u03B5\u03C0\u03C4\u03B1"),
                                new ZPair(
                                        "s",
                                        "1 \u03B4\u03B5\u03C5\u03C4\u03B5\u03C1\u03CC\u03BB\u03B5\u03C0\u03C4\u03BF|:count \u03B4\u03B5\u03C5\u03C4\u03B5\u03C1\u03CC\u03BB\u03B5\u03C0\u03C4\u03B1"),
                                new ZPair(
                                        "ago", "\u03C0\u03C1\u03B9\u03BD \u03B1\u03C0\u03CC :time"),
                                new ZPair(
                                        "from_now",
                                        "\u03C3\u03B5 :time \u03B1\u03C0\u03CC \u03C4\u03CE\u03C1\u03B1"),
                                new ZPair("after", ":time \u03BC\u03B5\u03C4\u03AC"),
                                new ZPair("before", ":time \u03C0\u03C1\u03B9\u03BD"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/el.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1963 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
