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

 vendor/nesbot/carbon/src/Carbon/Lang/sq.php

*/

public class file_sq_php implements RuntimeIncludable {

    public static final file_sq_php instance = new file_sq_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2001 scope = new Scope2001();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2001 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", "1 vit|:count vjet"),
                                new ZPair("y", "1 vit|:count vjet"),
                                new ZPair("month", "1 muaj|:count muaj"),
                                new ZPair("m", "1 muaj|:count muaj"),
                                new ZPair("week", "1 jav\u00EB|:count jav\u00EB"),
                                new ZPair("w", "1 jav\u00EB|:count jav\u00EB"),
                                new ZPair("day", "1 dit\u00EB|:count dit\u00EB"),
                                new ZPair("d", "1 dit\u00EB|:count dit\u00EB"),
                                new ZPair("hour", "1 or\u00EB|:count or\u00EB"),
                                new ZPair("h", "1 or\u00EB|:count or\u00EB"),
                                new ZPair("minute", "1 minut\u00EB|:count minuta"),
                                new ZPair("min", "1 minut\u00EB|:count minuta"),
                                new ZPair("second", "1 sekond\u00EB|:count sekonda"),
                                new ZPair("s", "1 sekond\u00EB|:count sekonda"),
                                new ZPair("ago", ":time m\u00EB par\u00EB"),
                                new ZPair("from_now", ":time nga tani"),
                                new ZPair("after", ":time pas"),
                                new ZPair("before", ":time para"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/sq.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2001 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
