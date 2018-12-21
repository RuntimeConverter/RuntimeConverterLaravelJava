package com.project.convertedCode.includes.vendor.symfony.translation.Extractor;

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

 vendor/symfony/translation/Extractor/PhpStringTokenParser.php

*/

public class file_PhpStringTokenParser_php implements RuntimeIncludable {

    public static final file_PhpStringTokenParser_php instance =
            new file_PhpStringTokenParser_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3627 scope = new Scope3627();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3627 scope)
            throws IncludeEventException {

        // Conversion Note: class named PhpStringTokenParser was here in the source code
        env.addManualClassLoad("Symfony\\Component\\Translation\\Extractor\\PhpStringTokenParser");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/translation/Extractor")
                    .setFile("/vendor/symfony/translation/Extractor/PhpStringTokenParser.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3627 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
