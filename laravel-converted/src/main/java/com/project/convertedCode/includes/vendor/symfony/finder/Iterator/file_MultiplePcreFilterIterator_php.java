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

 vendor/symfony/finder/Iterator/MultiplePcreFilterIterator.php

*/

public class file_MultiplePcreFilterIterator_php implements RuntimeIncludable {

    public static final file_MultiplePcreFilterIterator_php instance =
            new file_MultiplePcreFilterIterator_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3306 scope = new Scope3306();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3306 scope)
            throws IncludeEventException {

        // Conversion Note: class named MultiplePcreFilterIterator was here in the source code
        env.addManualClassLoad("Symfony\\Component\\Finder\\Iterator\\MultiplePcreFilterIterator");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/finder/Iterator")
                    .setFile("/vendor/symfony/finder/Iterator/MultiplePcreFilterIterator.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3306 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
