package com.project.convertedCode.includes.vendor.doctrine.lexer.lib.Doctrine.Common.Lexer;

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

 vendor/doctrine/lexer/lib/Doctrine/Common/Lexer/AbstractLexer.php

*/

public class file_AbstractLexer_php implements RuntimeIncludable {

    public static final file_AbstractLexer_php instance = new file_AbstractLexer_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope245 scope = new Scope245();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope245 scope)
            throws IncludeEventException {

        // Conversion Note: class named AbstractLexer was here in the source code
        env.addManualClassLoad("Doctrine\\Common\\Lexer\\AbstractLexer");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/doctrine/lexer/lib/Doctrine/Common/Lexer")
                    .setFile("/vendor/doctrine/lexer/lib/Doctrine/Common/Lexer/AbstractLexer.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope245 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
