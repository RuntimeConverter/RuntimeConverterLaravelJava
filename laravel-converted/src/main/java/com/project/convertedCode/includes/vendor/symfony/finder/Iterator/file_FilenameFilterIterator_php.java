package com.project.convertedCode.includes.vendor.symfony.finder.Iterator;

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

 vendor/symfony/finder/Iterator/FilenameFilterIterator.php

*/

public class file_FilenameFilterIterator_php implements RuntimeIncludable {

    public static final file_FilenameFilterIterator_php instance =
            new file_FilenameFilterIterator_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3305 scope = new Scope3305();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3305 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named FilenameFilterIterator was here in the source code
        env.addManualClassLoad("Symfony\\Component\\Finder\\Iterator\\FilenameFilterIterator");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/finder/Iterator")
                    .setFile("/vendor/symfony/finder/Iterator/FilenameFilterIterator.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3305 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
