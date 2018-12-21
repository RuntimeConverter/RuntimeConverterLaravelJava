package com.project.convertedCode.includes.vendor.nikic.php_parser.lib.PhpParser.Node.Scalar.MagicConst;

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

 vendor/nikic/php-parser/lib/PhpParser/Node/Scalar/MagicConst/Trait_.php

*/

public class file_Trait__php implements RuntimeIncludable {

    public static final file_Trait__php instance = new file_Trait__php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2160 scope = new Scope2160();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2160 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named Trait_ was here in the source code
        env.addManualClassLoad("PhpParser\\Node\\Scalar\\MagicConst\\Trait_");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nikic/php-parser/lib/PhpParser/Node/Scalar/MagicConst")
                    .setFile(
                            "/vendor/nikic/php-parser/lib/PhpParser/Node/Scalar/MagicConst/Trait_.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2160 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
