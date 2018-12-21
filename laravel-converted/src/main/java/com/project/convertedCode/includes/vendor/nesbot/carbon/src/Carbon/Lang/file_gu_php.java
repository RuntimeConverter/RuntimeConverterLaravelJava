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

 vendor/nesbot/carbon/src/Carbon/Lang/gu.php

*/

public class file_gu_php implements RuntimeIncludable {

    public static final file_gu_php instance = new file_gu_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1974 scope = new Scope1974();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1974 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        "year",
                                        "1 \u0AB5\u0AB0\u0ACD\u0AB7|:count \u0AB5\u0AB0\u0ACD\u0AB7\u0ACB"),
                                new ZPair(
                                        "y",
                                        "1\u0AB5\u0AB0\u0ACD\u0AB7|:count\u0AB5\u0AB0\u0ACD\u0AB7\u0ACB"),
                                new ZPair(
                                        "month",
                                        "1 \u0AAE\u0AB9\u0ABF\u0AA8\u0ACB|:count \u0AAE\u0AB9\u0ABF\u0AA8\u0ABE"),
                                new ZPair(
                                        "m",
                                        "1\u0AAE\u0AB9\u0ABF\u0AA8\u0ACB|:count\u0AAE\u0AB9\u0ABF\u0AA8\u0ABE"),
                                new ZPair(
                                        "week",
                                        "1 \u0A85\u0AA0\u0AB5\u0ABE\u0AA1\u0ABF\u0AAF\u0AC1\u0A82|:count \u0A85\u0AA0\u0AB5\u0ABE\u0AA1\u0ABF\u0AAF\u0ABE"),
                                new ZPair("w", "1\u0A85\u0AA0.|:count\u0A85\u0AA0."),
                                new ZPair(
                                        "day",
                                        "1 \u0AA6\u0ABF\u0AB5\u0AB8|:count \u0AA6\u0ABF\u0AB5\u0AB8\u0ACB"),
                                new ZPair("d", "1\u0AA6\u0ABF.|:count\u0AA6\u0ABF."),
                                new ZPair(
                                        "hour",
                                        "1 \u0A95\u0AB2\u0ABE\u0A95|:count \u0A95\u0AB2\u0ABE\u0A95\u0ACB"),
                                new ZPair("h", "1\u0A95.|:count\u0A95."),
                                new ZPair(
                                        "minute",
                                        "1 \u0AAE\u0ABF\u0AA8\u0ABF\u0A9F|:count \u0AAE\u0ABF\u0AA8\u0ABF\u0A9F"),
                                new ZPair("min", "1\u0AAE\u0ABF.|:count\u0AAE\u0ABF."),
                                new ZPair(
                                        "second",
                                        "1 \u0AB8\u0AC7\u0A95\u0AC7\u0AA8\u0ACD\u0AA1|:count \u0AB8\u0AC7\u0A95\u0AC7\u0AA8\u0ACD\u0AA1"),
                                new ZPair("s", "1\u0AB8\u0AC7.|:count\u0AB8\u0AC7."),
                                new ZPair("ago", ":time \u0AAA\u0AB9\u0AC7\u0AB2\u0ABE"),
                                new ZPair(
                                        "from_now",
                                        ":time \u0A85\u0AA4\u0ACD\u0AAF\u0ABE\u0AB0\u0AA5\u0AC0"),
                                new ZPair("after", ":time \u0AAA\u0A9B\u0AC0"),
                                new ZPair("before", ":time \u0AAA\u0AB9\u0AC7\u0AB2\u0ABE"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/gu.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1974 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
