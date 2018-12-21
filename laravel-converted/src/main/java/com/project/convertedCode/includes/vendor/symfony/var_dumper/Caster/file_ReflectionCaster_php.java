package com.project.convertedCode.includes.vendor.symfony.var_dumper.Caster;

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

 vendor/symfony/var-dumper/Caster/ReflectionCaster.php

*/

public class file_ReflectionCaster_php implements RuntimeIncludable {

    public static final file_ReflectionCaster_php instance = new file_ReflectionCaster_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3679 scope = new Scope3679();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3679 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named ReflectionCaster was here in the source code
        env.addManualClassLoad("Symfony\\Component\\VarDumper\\Caster\\ReflectionCaster");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/var-dumper/Caster")
                    .setFile("/vendor/symfony/var-dumper/Caster/ReflectionCaster.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3679 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
