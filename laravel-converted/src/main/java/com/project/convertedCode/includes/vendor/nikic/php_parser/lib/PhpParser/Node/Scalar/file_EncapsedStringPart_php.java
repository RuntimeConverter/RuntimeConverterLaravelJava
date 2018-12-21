package com.project.convertedCode.includes.vendor.nikic.php_parser.lib.PhpParser.Node.Scalar;

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

 vendor/nikic/php-parser/lib/PhpParser/Node/Scalar/EncapsedStringPart.php

*/

public class file_EncapsedStringPart_php implements RuntimeIncludable {

    public static final file_EncapsedStringPart_php instance = new file_EncapsedStringPart_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2150 scope = new Scope2150();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2150 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named EncapsedStringPart was here in the source code
        env.addManualClassLoad("PhpParser\\Node\\Scalar\\EncapsedStringPart");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nikic/php-parser/lib/PhpParser/Node/Scalar")
                    .setFile(
                            "/vendor/nikic/php-parser/lib/PhpParser/Node/Scalar/EncapsedStringPart.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2150 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
