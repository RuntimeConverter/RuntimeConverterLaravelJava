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

 vendor/nesbot/carbon/src/Carbon/Lang/tr.php

*/

public class file_tr_php implements RuntimeIncludable {

    public static final file_tr_php instance = new file_tr_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2009 scope = new Scope2009();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2009 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", ":count y\u0131l"),
                                new ZPair("y", ":count y\u0131l"),
                                new ZPair("month", ":count ay"),
                                new ZPair("m", ":count ay"),
                                new ZPair("week", ":count hafta"),
                                new ZPair("w", ":count hafta"),
                                new ZPair("day", ":count g\u00FCn"),
                                new ZPair("d", ":count g\u00FCn"),
                                new ZPair("hour", ":count saat"),
                                new ZPair("h", ":count saat"),
                                new ZPair("minute", ":count dakika"),
                                new ZPair("min", ":count dakika"),
                                new ZPair("second", ":count saniye"),
                                new ZPair("s", ":count saniye"),
                                new ZPair("ago", ":time \u00F6nce"),
                                new ZPair("from_now", ":time sonra"),
                                new ZPair("after", ":time sonra"),
                                new ZPair("before", ":time \u00F6nce"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/tr.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2009 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
