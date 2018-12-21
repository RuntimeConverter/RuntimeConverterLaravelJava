package com.project.convertedCode.includes.vendor.swiftmailer.swiftmailer.lib.classes.Swift.CharacterReader;

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

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/CharacterReader/GenericFixedWidthReader.php

*/

public class file_GenericFixedWidthReader_php implements RuntimeIncludable {

    public static final file_GenericFixedWidthReader_php instance =
            new file_GenericFixedWidthReader_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2987 scope = new Scope2987();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2987 scope)
            throws IncludeEventException {
        // Conversion Note: class named Swift_CharacterReader_GenericFixedWidthReader was here in
        // the source code
        env.addManualClassLoad("Swift_CharacterReader_GenericFixedWidthReader");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/swiftmailer/swiftmailer/lib/classes/Swift/CharacterReader")
                    .setFile(
                            "/vendor/swiftmailer/swiftmailer/lib/classes/Swift/CharacterReader/GenericFixedWidthReader.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2987 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
