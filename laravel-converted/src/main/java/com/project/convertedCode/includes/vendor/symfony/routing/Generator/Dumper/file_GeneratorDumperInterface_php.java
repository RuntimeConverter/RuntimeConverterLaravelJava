package com.project.convertedCode.includes.vendor.symfony.routing.Generator.Dumper;

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

 vendor/symfony/routing/Generator/Dumper/GeneratorDumperInterface.php

*/

public class file_GeneratorDumperInterface_php implements RuntimeIncludable {

    public static final file_GeneratorDumperInterface_php instance =
            new file_GeneratorDumperInterface_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3555 scope = new Scope3555();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3555 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named GeneratorDumperInterface was here in the source code
        env.addManualClassLoad(
                "Symfony\\Component\\Routing\\Generator\\Dumper\\GeneratorDumperInterface");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/routing/Generator/Dumper")
                    .setFile(
                            "/vendor/symfony/routing/Generator/Dumper/GeneratorDumperInterface.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3555 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
