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

 vendor/nesbot/carbon/src/Carbon/Lang/ar.php

*/

public class file_ar_php implements RuntimeIncludable {

    public static final file_ar_php instance = new file_ar_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1953 scope = new Scope1953();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1953 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        "year",
                                        "{0}\u0633\u0646\u0629|{1}\u0633\u0646\u0629|{2}\u0633\u0646\u062A\u064A\u0646|[3,10]:count \u0633\u0646\u0648\u0627\u062A|[11,Inf]:count \u0633\u0646\u0629"),
                                new ZPair(
                                        "y",
                                        "{0}\u0633\u0646\u0629|{1}\u0633\u0646\u0629|{2}\u0633\u0646\u062A\u064A\u0646|[3,10]:count \u0633\u0646\u0648\u0627\u062A|[11,Inf]:count \u0633\u0646\u0629"),
                                new ZPair(
                                        "month",
                                        "{0}\u0634\u0647\u0631|{1} \u0634\u0647\u0631|{2}\u0634\u0647\u0631\u064A\u0646|[3,10]:count \u0623\u0634\u0647\u0631|[11,Inf]:count \u0634\u0647\u0631"),
                                new ZPair(
                                        "m",
                                        "{0}\u0634\u0647\u0631|{1} \u0634\u0647\u0631|{2}\u0634\u0647\u0631\u064A\u0646|[3,10]:count \u0623\u0634\u0647\u0631|[11,Inf]:count \u0634\u0647\u0631"),
                                new ZPair(
                                        "week",
                                        "{0}\u0623\u0633\u0628\u0648\u0639|{1}\u0623\u0633\u0628\u0648\u0639|{2}\u0623\u0633\u0628\u0648\u0639\u064A\u0646|[3,10]:count \u0623\u0633\u0627\u0628\u064A\u0639|[11,Inf]:count \u0623\u0633\u0628\u0648\u0639"),
                                new ZPair(
                                        "w",
                                        "{0}\u0623\u0633\u0628\u0648\u0639|{1}\u0623\u0633\u0628\u0648\u0639|{2}\u0623\u0633\u0628\u0648\u0639\u064A\u0646|[3,10]:count \u0623\u0633\u0627\u0628\u064A\u0639|[11,Inf]:count \u0623\u0633\u0628\u0648\u0639"),
                                new ZPair(
                                        "day",
                                        "{0}\u064A\u0648\u0645|{1}\u064A\u0648\u0645|{2}\u064A\u0648\u0645\u064A\u0646|[3,10]:count \u0623\u064A\u0627\u0645|[11,Inf] \u064A\u0648\u0645"),
                                new ZPair(
                                        "d",
                                        "{0}\u064A\u0648\u0645|{1}\u064A\u0648\u0645|{2}\u064A\u0648\u0645\u064A\u0646|[3,10]:count \u0623\u064A\u0627\u0645|[11,Inf] \u064A\u0648\u0645"),
                                new ZPair(
                                        "hour",
                                        "{0}\u0633\u0627\u0639\u0629|{1}\u0633\u0627\u0639\u0629|{2}\u0633\u0627\u0639\u062A\u064A\u0646|[3,10]:count \u0633\u0627\u0639\u0627\u062A|[11,Inf]:count \u0633\u0627\u0639\u0629"),
                                new ZPair(
                                        "h",
                                        "{0}\u0633\u0627\u0639\u0629|{1}\u0633\u0627\u0639\u0629|{2}\u0633\u0627\u0639\u062A\u064A\u0646|[3,10]:count \u0633\u0627\u0639\u0627\u062A|[11,Inf]:count \u0633\u0627\u0639\u0629"),
                                new ZPair(
                                        "minute",
                                        "{0}\u062F\u0642\u064A\u0642\u0629|{1}\u062F\u0642\u064A\u0642\u0629|{2}\u062F\u0642\u064A\u0642\u062A\u064A\u0646|[3,10]:count \u062F\u0642\u0627\u0626\u0642|[11,Inf]:count \u062F\u0642\u064A\u0642\u0629"),
                                new ZPair(
                                        "min",
                                        "{0}\u062F\u0642\u064A\u0642\u0629|{1}\u062F\u0642\u064A\u0642\u0629|{2}\u062F\u0642\u064A\u0642\u062A\u064A\u0646|[3,10]:count \u062F\u0642\u0627\u0626\u0642|[11,Inf]:count \u062F\u0642\u064A\u0642\u0629"),
                                new ZPair(
                                        "second",
                                        "{0}\u062B\u0627\u0646\u064A\u0629|{1}\u062B\u0627\u0646\u064A\u0629|{2}\u062B\u0627\u0646\u064A\u062A\u064A\u0646|[3,10]:count \u062B\u0648\u0627\u0646|[11,Inf]:count \u062B\u0627\u0646\u064A\u0629"),
                                new ZPair(
                                        "s",
                                        "{0}\u062B\u0627\u0646\u064A\u0629|{1}\u062B\u0627\u0646\u064A\u0629|{2}\u062B\u0627\u0646\u064A\u062A\u064A\u0646|[3,10]:count \u062B\u0648\u0627\u0646|[11,Inf]:count \u062B\u0627\u0646\u064A\u0629"),
                                new ZPair("ago", "\u0645\u0646\u0630 :time"),
                                new ZPair(
                                        "from_now", ":time \u0645\u0646 \u0627\u0644\u0622\u0646"),
                                new ZPair("after", "\u0628\u0639\u062F :time"),
                                new ZPair("before", "\u0642\u0628\u0644 :time"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/ar.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1953 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
