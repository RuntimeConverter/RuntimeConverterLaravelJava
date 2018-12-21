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

 vendor/symfony/translation/Extractor/AbstractFileExtractor.php

*/

public class file_AbstractFileExtractor_php implements RuntimeIncludable {

    public static final file_AbstractFileExtractor_php instance =
            new file_AbstractFileExtractor_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3623 scope = new Scope3623();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3623 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named AbstractFileExtractor was here in the source code
        env.addManualClassLoad("Symfony\\Component\\Translation\\Extractor\\AbstractFileExtractor");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/translation/Extractor")
                    .setFile("/vendor/symfony/translation/Extractor/AbstractFileExtractor.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3623 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
