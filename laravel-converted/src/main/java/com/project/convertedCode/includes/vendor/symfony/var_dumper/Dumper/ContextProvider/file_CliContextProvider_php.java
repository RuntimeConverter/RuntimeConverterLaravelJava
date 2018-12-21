package com.project.convertedCode.includes.vendor.symfony.var_dumper.Dumper.ContextProvider;

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

 vendor/symfony/var-dumper/Dumper/ContextProvider/CliContextProvider.php

*/

public class file_CliContextProvider_php implements RuntimeIncludable {

    public static final file_CliContextProvider_php instance = new file_CliContextProvider_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3700 scope = new Scope3700();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3700 scope)
            throws IncludeEventException {

        // Conversion Note: class named CliContextProvider was here in the source code
        env.addManualClassLoad(
                "Symfony\\Component\\VarDumper\\Dumper\\ContextProvider\\CliContextProvider");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/var-dumper/Dumper/ContextProvider")
                    .setFile(
                            "/vendor/symfony/var-dumper/Dumper/ContextProvider/CliContextProvider.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3700 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
