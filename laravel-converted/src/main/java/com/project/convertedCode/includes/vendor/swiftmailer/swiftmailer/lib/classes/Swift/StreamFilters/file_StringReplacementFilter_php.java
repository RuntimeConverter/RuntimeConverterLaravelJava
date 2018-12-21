package com.project.convertedCode.includes.vendor.swiftmailer.swiftmailer.lib.classes.Swift.StreamFilters;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/StreamFilters/StringReplacementFilter.php

*/

public class file_StringReplacementFilter_php implements RuntimeIncludable {

    public static final file_StringReplacementFilter_php instance =
            new file_StringReplacementFilter_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3108 scope = new Scope3108();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3108 scope)
            throws IncludeEventException {
        // Conversion Note: class named Swift_StreamFilters_StringReplacementFilter was here in the
        // source code
        env.addManualClassLoad("Swift_StreamFilters_StringReplacementFilter");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/swiftmailer/swiftmailer/lib/classes/Swift/StreamFilters")
                    .setFile(
                            "/vendor/swiftmailer/swiftmailer/lib/classes/Swift/StreamFilters/StringReplacementFilter.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3108 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
