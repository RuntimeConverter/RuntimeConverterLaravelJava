package com.project.convertedCode.includes.vendor.nikic.php_parser.lib.PhpParser.Node.Stmt.TraitUseAdaptation;

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

 vendor/nikic/php-parser/lib/PhpParser/Node/Stmt/TraitUseAdaptation/Alias.php

*/

public class file_Alias_php implements RuntimeIncludable {

    public static final file_Alias_php instance = new file_Alias_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2202 scope = new Scope2202();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2202 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named Alias was here in the source code
        env.addManualClassLoad("PhpParser\\Node\\Stmt\\TraitUseAdaptation\\Alias");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nikic/php-parser/lib/PhpParser/Node/Stmt/TraitUseAdaptation")
                    .setFile(
                            "/vendor/nikic/php-parser/lib/PhpParser/Node/Stmt/TraitUseAdaptation/Alias.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2202 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
