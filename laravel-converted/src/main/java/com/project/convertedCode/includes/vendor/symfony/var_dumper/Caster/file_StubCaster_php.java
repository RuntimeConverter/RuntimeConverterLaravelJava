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

 vendor/symfony/var-dumper/Caster/StubCaster.php

*/

public class file_StubCaster_php implements RuntimeIncludable {

    public static final file_StubCaster_php instance = new file_StubCaster_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3682 scope = new Scope3682();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3682 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named StubCaster was here in the source code
        env.addManualClassLoad("Symfony\\Component\\VarDumper\\Caster\\StubCaster");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/var-dumper/Caster")
                    .setFile("/vendor/symfony/var-dumper/Caster/StubCaster.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3682 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
