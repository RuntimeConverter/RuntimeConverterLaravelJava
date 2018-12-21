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

 vendor/nesbot/carbon/src/Carbon/Lang/fa.php

*/

public class file_fa_php implements RuntimeIncludable {

    public static final file_fa_php instance = new file_fa_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1969 scope = new Scope1969();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1969 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", ":count \u0633\u0627\u0644"),
                                new ZPair("y", ":count \u0633\u0627\u0644"),
                                new ZPair("month", ":count \u0645\u0627\u0647"),
                                new ZPair("m", ":count \u0645\u0627\u0647"),
                                new ZPair("week", ":count \u0647\u0641\u062A\u0647"),
                                new ZPair("w", ":count \u0647\u0641\u062A\u0647"),
                                new ZPair("day", ":count \u0631\u0648\u0632"),
                                new ZPair("d", ":count \u0631\u0648\u0632"),
                                new ZPair("hour", ":count \u0633\u0627\u0639\u062A"),
                                new ZPair("h", ":count \u0633\u0627\u0639\u062A"),
                                new ZPair("minute", ":count \u062F\u0642\u06CC\u0642\u0647"),
                                new ZPair("min", ":count \u062F\u0642\u06CC\u0642\u0647"),
                                new ZPair("second", ":count \u062B\u0627\u0646\u06CC\u0647"),
                                new ZPair("s", ":count \u062B\u0627\u0646\u06CC\u0647"),
                                new ZPair("ago", ":time \u067E\u06CC\u0634"),
                                new ZPair("from_now", ":time \u0628\u0639\u062F"),
                                new ZPair("after", ":time \u067E\u0633 \u0627\u0632"),
                                new ZPair("before", ":time \u067E\u06CC\u0634 \u0627\u0632"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/fa.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1969 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
