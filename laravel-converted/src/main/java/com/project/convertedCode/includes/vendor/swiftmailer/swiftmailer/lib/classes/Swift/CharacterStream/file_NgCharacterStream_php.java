package com.project.convertedCode.includes.vendor.swiftmailer.swiftmailer.lib.classes.Swift.CharacterStream;

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

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/CharacterStream/NgCharacterStream.php

*/

public class file_NgCharacterStream_php implements RuntimeIncludable {

    public static final file_NgCharacterStream_php instance = new file_NgCharacterStream_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2994 scope = new Scope2994();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2994 scope)
            throws IncludeEventException {
        // Conversion Note: class named Swift_CharacterStream_NgCharacterStream was here in the
        // source code
        env.addManualClassLoad("Swift_CharacterStream_NgCharacterStream");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/swiftmailer/swiftmailer/lib/classes/Swift/CharacterStream")
                    .setFile(
                            "/vendor/swiftmailer/swiftmailer/lib/classes/Swift/CharacterStream/NgCharacterStream.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2994 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
