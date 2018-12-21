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

 vendor/nesbot/carbon/src/Carbon/Lang/ar_Shakl.php

*/

public class file_ar_Shakl_php implements RuntimeIncludable {

    public static final file_ar_Shakl_php instance = new file_ar_Shakl_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1954 scope = new Scope1954();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1954 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        "year",
                                        "[0,1] \u0633\u064E\u0646\u064E\u0629|{2} \u0633\u064E\u0646\u064E\u062A\u064E\u064A\u0652\u0646|[3,10]:count \u0633\u064E\u0646\u064E\u0648\u064E\u0627\u062A|[11,Inf]:count \u0633\u064E\u0646\u064E\u0629"),
                                new ZPair(
                                        "y",
                                        "[0,1] \u0633\u064E\u0646\u064E\u0629|{2} \u0633\u064E\u0646\u064E\u062A\u064E\u064A\u0652\u0646|[3,10]:count \u0633\u064E\u0646\u064E\u0648\u064E\u0627\u062A|[11,Inf]:count \u0633\u064E\u0646\u064E\u0629"),
                                new ZPair(
                                        "month",
                                        "[0,1] \u0634\u064E\u0647\u0652\u0631\u064E|{2} \u0634\u064E\u0647\u0652\u0631\u064E\u064A\u0652\u0646|[3,10]:count \u0623\u064E\u0634\u0652\u0647\u064F\u0631|[11,Inf]:count \u0634\u064E\u0647\u0652\u0631\u064E"),
                                new ZPair(
                                        "m",
                                        "[0,1] \u0634\u064E\u0647\u0652\u0631\u064E|{2} \u0634\u064E\u0647\u0652\u0631\u064E\u064A\u0652\u0646|[3,10]:count \u0623\u064E\u0634\u0652\u0647\u064F\u0631|[11,Inf]:count \u0634\u064E\u0647\u0652\u0631\u064E"),
                                new ZPair(
                                        "week",
                                        "[0,1] \u0623\u064F\u0633\u0652\u0628\u064F\u0648\u0639|{2} \u0623\u064F\u0633\u0652\u0628\u064F\u0648\u0639\u064E\u064A\u0652\u0646|[3,10]:count \u0623\u064E\u0633\u064E\u0627\u0628\u0650\u064A\u0639|[11,Inf]:count \u0623\u064F\u0633\u0652\u0628\u064F\u0648\u0639"),
                                new ZPair(
                                        "w",
                                        "[0,1] \u0623\u064F\u0633\u0652\u0628\u064F\u0648\u0639|{2} \u0623\u064F\u0633\u0652\u0628\u064F\u0648\u0639\u064E\u064A\u0652\u0646|[3,10]:count \u0623\u064E\u0633\u064E\u0627\u0628\u0650\u064A\u0639|[11,Inf]:count \u0623\u064F\u0633\u0652\u0628\u064F\u0648\u0639"),
                                new ZPair(
                                        "day",
                                        "[0,1] \u064A\u064E\u0648\u0652\u0645|{2} \u064A\u064E\u0648\u0652\u0645\u064E\u064A\u0652\u0646|[3,10]:count \u0623\u064E\u064A\u0651\u064E\u0627\u0645|[11,Inf] \u064A\u064E\u0648\u0652\u0645"),
                                new ZPair(
                                        "d",
                                        "[0,1] \u064A\u064E\u0648\u0652\u0645|{2} \u064A\u064E\u0648\u0652\u0645\u064E\u064A\u0652\u0646|[3,10]:count \u0623\u064E\u064A\u0651\u064E\u0627\u0645|[11,Inf] \u064A\u064E\u0648\u0652\u0645"),
                                new ZPair(
                                        "hour",
                                        "[0,1] \u0633\u064E\u0627\u0639\u064E\u0629|{2} \u0633\u064E\u0627\u0639\u064E\u062A\u064E\u064A\u0652\u0646|[3,10]:count \u0633\u064E\u0627\u0639\u064E\u0627\u062A|[11,Inf]:count \u0633\u064E\u0627\u0639\u064E\u0629"),
                                new ZPair(
                                        "h",
                                        "[0,1] \u0633\u064E\u0627\u0639\u064E\u0629|{2} \u0633\u064E\u0627\u0639\u064E\u062A\u064E\u064A\u0652\u0646|[3,10]:count \u0633\u064E\u0627\u0639\u064E\u0627\u062A|[11,Inf]:count \u0633\u064E\u0627\u0639\u064E\u0629"),
                                new ZPair(
                                        "minute",
                                        "[0,1] \u062F\u064E\u0642\u0650\u064A\u0642\u064E\u0629|{2} \u062F\u064E\u0642\u0650\u064A\u0642\u064E\u062A\u064E\u064A\u0652\u0646|[3,10]:count \u062F\u064E\u0642\u064E\u0627\u0626\u0650\u0642|[11,Inf]:count \u062F\u064E\u0642\u0650\u064A\u0642\u064E\u0629"),
                                new ZPair(
                                        "min",
                                        "[0,1] \u062F\u064E\u0642\u0650\u064A\u0642\u064E\u0629|{2} \u062F\u064E\u0642\u0650\u064A\u0642\u064E\u062A\u064E\u064A\u0652\u0646|[3,10]:count \u062F\u064E\u0642\u064E\u0627\u0626\u0650\u0642|[11,Inf]:count \u062F\u064E\u0642\u0650\u064A\u0642\u064E\u0629"),
                                new ZPair(
                                        "second",
                                        "[0,1] \u062B\u064E\u0627\u0646\u0650\u064A\u064E\u0629|{2} \u062B\u064E\u0627\u0646\u0650\u064A\u064E\u062A\u064E\u064A\u0652\u0646|[3,10]:count \u062B\u064E\u0648\u064E\u0627\u0646|[11,Inf]:count \u062B\u064E\u0627\u0646\u0650\u064A\u064E\u0629"),
                                new ZPair(
                                        "s",
                                        "[0,1] \u062B\u064E\u0627\u0646\u0650\u064A\u064E\u0629|{2} \u062B\u064E\u0627\u0646\u0650\u064A\u064E\u062A\u064E\u064A\u0652\u0646|[3,10]:count \u062B\u064E\u0648\u064E\u0627\u0646|[11,Inf]:count \u062B\u064E\u0627\u0646\u0650\u064A\u064E\u0629"),
                                new ZPair("ago", "\u0645\u064F\u0646\u0652\u0630\u064F :time"),
                                new ZPair(
                                        "from_now",
                                        "\u0645\u0650\u0646\u064E \u0627\u0644\u0652\u0622\u0646 :time"),
                                new ZPair("after", "\u0628\u064E\u0639\u0652\u062F\u064E :time"),
                                new ZPair(
                                        "before", "\u0642\u064E\u0628\u0652\u0644\u064E :time"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/ar_Shakl.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1954 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
