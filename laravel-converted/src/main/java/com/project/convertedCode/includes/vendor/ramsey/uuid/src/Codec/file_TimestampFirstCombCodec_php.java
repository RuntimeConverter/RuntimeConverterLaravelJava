package com.project.convertedCode.includes.vendor.ramsey.uuid.src.Codec;

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

 vendor/ramsey/uuid/src/Codec/TimestampFirstCombCodec.php

*/

public class file_TimestampFirstCombCodec_php implements RuntimeIncludable {

    public static final file_TimestampFirstCombCodec_php instance =
            new file_TimestampFirstCombCodec_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2884 scope = new Scope2884();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2884 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named TimestampFirstCombCodec was here in the source code
        env.addManualClassLoad("Ramsey\\Uuid\\Codec\\TimestampFirstCombCodec");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/ramsey/uuid/src/Codec")
                    .setFile("/vendor/ramsey/uuid/src/Codec/TimestampFirstCombCodec.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2884 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
