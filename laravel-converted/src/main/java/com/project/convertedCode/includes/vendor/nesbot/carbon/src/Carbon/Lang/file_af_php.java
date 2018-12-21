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

 vendor/nesbot/carbon/src/Carbon/Lang/af.php

*/

public class file_af_php implements RuntimeIncludable {

    public static final file_af_php instance = new file_af_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1952 scope = new Scope1952();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1952 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", "1 jaar|:count jare"),
                                new ZPair("y", "1 jaar|:count jare"),
                                new ZPair("month", "1 maand|:count maande"),
                                new ZPair("m", "1 maand|:count maande"),
                                new ZPair("week", "1 week|:count weke"),
                                new ZPair("w", "1 week|:count weke"),
                                new ZPair("day", "1 dag|:count dae"),
                                new ZPair("d", "1 dag|:count dae"),
                                new ZPair("hour", "1 uur|:count ure"),
                                new ZPair("h", "1 uur|:count ure"),
                                new ZPair("minute", "1 minuut|:count minute"),
                                new ZPair("min", "1 minuut|:count minute"),
                                new ZPair("second", "1 sekond|:count sekondes"),
                                new ZPair("s", "1 sekond|:count sekondes"),
                                new ZPair("ago", ":time terug"),
                                new ZPair("from_now", ":time van nou af"),
                                new ZPair("after", ":time na"),
                                new ZPair("before", ":time voor"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/af.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1952 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
