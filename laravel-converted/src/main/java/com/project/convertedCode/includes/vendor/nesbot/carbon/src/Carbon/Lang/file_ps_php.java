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

 vendor/nesbot/carbon/src/Carbon/Lang/ps.php

*/

public class file_ps_php implements RuntimeIncludable {

    public static final file_ps_php instance = new file_ps_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1994 scope = new Scope1994();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1994 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        "year",
                                        "1 \u06A9\u0627\u0644|:count \u06A9\u0627\u0644\u0647"),
                                new ZPair(
                                        "y", "1\u06A9\u0627\u0644|:count\u06A9\u0627\u0644\u0647"),
                                new ZPair(
                                        "month",
                                        "1 \u0645\u064A\u0627\u0634\u062A|:count \u0645\u064A\u0627\u0634\u062A\u064A"),
                                new ZPair(
                                        "m",
                                        "1\u0645\u064A\u0627\u0634\u062A|:count\u0645\u064A\u0627\u0634\u062A\u064A"),
                                new ZPair(
                                        "week",
                                        "1 \u0627\u0648\u0646\u06CD|:count \u0627\u0648\u0646\u06CD"),
                                new ZPair(
                                        "w",
                                        "1\u0627\u0648\u0646\u06CD|:count\u0627\u0648\u0646\u06CD"),
                                new ZPair(
                                        "day",
                                        "1 \u0648\u0631\u0681|:count \u0648\u0631\u0681\u064A"),
                                new ZPair(
                                        "d", "1\u0648\u0631\u0681|:count\u0648\u0631\u0681\u064A"),
                                new ZPair(
                                        "hour",
                                        "1 \u0633\u0627\u0639\u062A|:count \u0633\u0627\u0639\u062A\u0647"),
                                new ZPair(
                                        "h",
                                        "1\u0633\u0627\u0639\u062A|:count\u0633\u0627\u0639\u062A\u0647"),
                                new ZPair(
                                        "minute",
                                        "1 \u062F\u0642\u064A\u0642\u0647|:count \u062F\u0642\u064A\u0642\u06D0"),
                                new ZPair(
                                        "min",
                                        "1\u062F\u0642\u064A\u0642\u0647|:count\u062F\u0642\u064A\u0642\u06D0"),
                                new ZPair(
                                        "second",
                                        "1 \u062B\u0627\u0646\u064A\u0647|:count \u062B\u0627\u0646\u064A\u06D0"),
                                new ZPair(
                                        "s",
                                        "1\u062B\u0627\u0646\u064A\u0647|:count\u062B\u0627\u0646\u064A\u06D0"),
                                new ZPair("ago", ":time \u062F\u0645\u062E\u0647"),
                                new ZPair(
                                        "from_now",
                                        ":time \u0644\u0647 \u0627\u0648\u0633 \u0685\u062E\u0647"),
                                new ZPair("after", ":time \u0648\u0631\u0648\u0633\u062A\u0647"),
                                new ZPair("before", ":time \u062F\u0645\u062E\u0647"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/ps.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1994 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
