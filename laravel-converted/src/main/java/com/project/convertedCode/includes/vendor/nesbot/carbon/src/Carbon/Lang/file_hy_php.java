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

 vendor/nesbot/carbon/src/Carbon/Lang/hy.php

*/

public class file_hy_php implements RuntimeIncludable {

    public static final file_hy_php instance = new file_hy_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1978 scope = new Scope1978();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1978 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("year", ":count \u057F\u0561\u0580\u056B"),
                                new ZPair("y", ":count\u057F"),
                                new ZPair("month", ":count \u0561\u0574\u056B\u057D"),
                                new ZPair("m", ":count\u0561\u0574"),
                                new ZPair("week", ":count \u0577\u0561\u0562\u0561\u0569"),
                                new ZPair("w", ":count\u0577"),
                                new ZPair("day", ":count \u0585\u0580"),
                                new ZPair("d", ":count\u0585\u0580"),
                                new ZPair("hour", ":count \u056A\u0561\u0574"),
                                new ZPair("h", ":count\u056A"),
                                new ZPair("minute", ":count \u0580\u0578\u057A\u0565"),
                                new ZPair("min", ":count\u0580"),
                                new ZPair(
                                        "second",
                                        ":count \u057E\u0561\u0580\u056F\u0575\u0561\u0576"),
                                new ZPair("s", ":count\u057E\u0580\u056F"),
                                new ZPair("ago", ":time \u0561\u057C\u0561\u057B"),
                                new ZPair(
                                        "from_now",
                                        ":time \u0576\u0565\u0580\u056F\u0561 \u057A\u0561\u0570\u056B\u0581"),
                                new ZPair("after", ":time \u0570\u0565\u057F\u0578"),
                                new ZPair("before", ":time \u0561\u057C\u0561\u057B"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/hy.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1978 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
