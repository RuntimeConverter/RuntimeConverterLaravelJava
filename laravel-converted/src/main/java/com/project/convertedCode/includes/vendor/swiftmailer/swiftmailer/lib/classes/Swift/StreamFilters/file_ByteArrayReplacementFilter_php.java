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

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/StreamFilters/ByteArrayReplacementFilter.php

*/

public class file_ByteArrayReplacementFilter_php implements RuntimeIncludable {

    public static final file_ByteArrayReplacementFilter_php instance =
            new file_ByteArrayReplacementFilter_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3107 scope = new Scope3107();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3107 scope)
            throws IncludeEventException {
        // Conversion Note: class named Swift_StreamFilters_ByteArrayReplacementFilter was here in
        // the source code
        env.addManualClassLoad("Swift_StreamFilters_ByteArrayReplacementFilter");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/swiftmailer/swiftmailer/lib/classes/Swift/StreamFilters")
                    .setFile(
                            "/vendor/swiftmailer/swiftmailer/lib/classes/Swift/StreamFilters/ByteArrayReplacementFilter.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3107 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
