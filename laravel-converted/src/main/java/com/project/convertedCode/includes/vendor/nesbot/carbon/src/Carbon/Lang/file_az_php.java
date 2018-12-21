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

 vendor/nesbot/carbon/src/Carbon/Lang/az.php

*/

public class file_az_php implements RuntimeIncludable {

    public static final file_az_php instance = new file_az_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1955 scope = new Scope1955();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1955 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", ":count il"),
                                new ZPair("y", ":count il"),
                                new ZPair("month", ":count ay"),
                                new ZPair("m", ":count ay"),
                                new ZPair("week", ":count h\u0259ft\u0259"),
                                new ZPair("w", ":count h\u0259ft\u0259"),
                                new ZPair("day", ":count g\u00FCn"),
                                new ZPair("d", ":count g\u00FCn"),
                                new ZPair("hour", ":count saat"),
                                new ZPair("h", ":count saat"),
                                new ZPair("minute", ":count d\u0259qiq\u0259"),
                                new ZPair("min", ":count d\u0259qiq\u0259"),
                                new ZPair("second", ":count saniy\u0259"),
                                new ZPair("s", ":count saniy\u0259"),
                                new ZPair("ago", ":time \u0259vv\u0259l"),
                                new ZPair("from_now", ":time sonra"),
                                new ZPair("after", ":time sonra"),
                                new ZPair("before", ":time \u0259vv\u0259l"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/az.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1955 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
