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

 vendor/nesbot/carbon/src/Carbon/Lang/dv_MV.php

*/

public class file_dv_MV_php implements RuntimeIncludable {

    public static final file_dv_MV_php instance = new file_dv_MV_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1962 scope = new Scope1962();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1962 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        "year",
                                        "{0}\u0787\u07A6\u0780\u07A6\u0783\u07AC\u0787\u07B0|[1,Inf]:count \u0787\u07A6\u0780\u07A6\u0783\u07AA"),
                                new ZPair(
                                        "y",
                                        "{0}\u0787\u07A6\u0780\u07A6\u0783\u07AC\u0787\u07B0|[1,Inf]:count \u0787\u07A6\u0780\u07A6\u0783\u07AA"),
                                new ZPair(
                                        "month",
                                        "{0}\u0789\u07A6\u0787\u07B0\u0790\u07A6\u0783\u07AC\u0787\u07B0|[1,Inf]:count \u0789\u07A6\u0790\u07B0"),
                                new ZPair(
                                        "m",
                                        "{0}\u0789\u07A6\u0787\u07B0\u0790\u07A6\u0783\u07AC\u0787\u07B0|[1,Inf]:count \u0789\u07A6\u0790\u07B0"),
                                new ZPair(
                                        "week",
                                        "{0}\u0780\u07A6\u078A\u07B0\u078C\u07A7\u0787\u07AC\u0787\u07B0|[1,Inf]:count \u0780\u07A6\u078A\u07B0\u078C\u07A7"),
                                new ZPair(
                                        "w",
                                        "{0}\u0780\u07A6\u078A\u07B0\u078C\u07A7\u0787\u07AC\u0787\u07B0|[1,Inf]:count \u0780\u07A6\u078A\u07B0\u078C\u07A7"),
                                new ZPair(
                                        "day",
                                        "{0}\u078B\u07AA\u0788\u07A6\u0790\u07B0|[1,Inf]:count \u078B\u07AA\u0788\u07A6\u0790\u07B0"),
                                new ZPair(
                                        "d",
                                        "{0}\u078B\u07AA\u0788\u07A6\u0790\u07B0|[1,Inf]:count \u078B\u07AA\u0788\u07A6\u0790\u07B0"),
                                new ZPair(
                                        "hour",
                                        "{0}\u078E\u07A6\u0791\u07A8\u0787\u07A8\u0783\u07AC\u0787\u07B0|[1,Inf]:count \u078E\u07A6\u0791\u07A8"),
                                new ZPair(
                                        "h",
                                        "{0}\u078E\u07A6\u0791\u07A8\u0787\u07A8\u0783\u07AC\u0787\u07B0|[1,Inf]:count \u078E\u07A6\u0791\u07A8"),
                                new ZPair(
                                        "minute",
                                        "{0}\u0789\u07A8\u0782\u07AC\u0793\u07AC\u0787\u07B0|[1,Inf]:count \u0789\u07A8\u0782\u07AC\u0793\u07B0"),
                                new ZPair(
                                        "min",
                                        "{0}\u0789\u07A8\u0782\u07AC\u0793\u07AC\u0787\u07B0|[1,Inf]:count \u0789\u07A8\u0782\u07AC\u0793\u07B0"),
                                new ZPair(
                                        "second",
                                        "{0}\u0790\u07A8\u0786\u07AA\u0782\u07B0\u078C\u07AC\u0787\u07B0|[1,Inf]:count \u0790\u07A8\u0786\u07AA\u0782\u07B0\u078C\u07AA"),
                                new ZPair(
                                        "s",
                                        "{0}\u0790\u07A8\u0786\u07AA\u0782\u07B0\u078C\u07AC\u0787\u07B0|[1,Inf]:count \u0790\u07A8\u0786\u07AA\u0782\u07B0\u078C\u07AA"),
                                new ZPair("ago", ":time \u0786\u07AA\u0783\u07A8\u0782\u07B0"),
                                new ZPair("from_now", ":time \u078A\u07A6\u0780\u07AA\u0782\u07B0"),
                                new ZPair("after", ":time \u078A\u07A6\u0780\u07AA\u0782\u07B0"),
                                new ZPair("before", ":time \u0786\u07AA\u0783\u07A8"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon/src/Carbon/Lang")
                    .setFile("/vendor/nesbot/carbon/src/Carbon/Lang/dv_MV.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1962 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
