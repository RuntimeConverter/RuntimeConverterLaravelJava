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

 vendor/nesbot/carbon/src/Carbon/Lang/ur.php

*/

public class file_ur_php implements RuntimeIncludable {

    public static final file_ur_php instance = new file_ur_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2011 scope = new Scope2011();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2011 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", ":count \u0633\u0627\u0644"),
                                new ZPair("month", ":count \u0645\u0627\u0647"),
                                new ZPair("week", ":count \u06C1\u0641\u062A\u06D2"),
                                new ZPair("day", ":count \u0631\u0648\u0632"),
                                new ZPair("hour", ":count \u06AF\u06BE\u0646\u0679\u06D2"),
                                new ZPair("minute", ":count \u0645\u0646\u0679"),
                                new ZPair("second", ":count \u0633\u06CC\u06A9\u0646\u0688"),
                                new ZPair("ago", ":time \u067E\u06C1\u0644\u06D2"),
                                new ZPair("from_now", ":time \u0628\u0639\u062F"),
                                new ZPair("after", ":time \u0628\u0639\u062F"),
                                new ZPair("before", ":time \u067E\u06C1\u0644\u06D2"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/ur.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2011 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
