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

 vendor/symfony/var-dumper/Caster/XmlResourceCaster.php

*/

public class file_XmlResourceCaster_php implements RuntimeIncludable {

    public static final file_XmlResourceCaster_php instance = new file_XmlResourceCaster_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3686 scope = new Scope3686();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3686 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named XmlResourceCaster was here in the source code
        env.addManualClassLoad("Symfony\\Component\\VarDumper\\Caster\\XmlResourceCaster");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/var-dumper/Caster")
                    .setFile("/vendor/symfony/var-dumper/Caster/XmlResourceCaster.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3686 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
