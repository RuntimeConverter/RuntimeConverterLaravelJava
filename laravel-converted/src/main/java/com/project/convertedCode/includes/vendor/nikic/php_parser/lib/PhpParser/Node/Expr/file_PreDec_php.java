package com.project.convertedCode.includes.vendor.nikic.php_parser.lib.PhpParser.Node.Expr;

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

 vendor/nikic/php-parser/lib/PhpParser/Node/Expr/PreDec.php

*/

public class file_PreDec_php implements RuntimeIncludable {

    public static final file_PreDec_php instance = new file_PreDec_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2127 scope = new Scope2127();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2127 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named PreDec was here in the source code
        env.addManualClassLoad("PhpParser\\Node\\Expr\\PreDec");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nikic/php-parser/lib/PhpParser/Node/Expr")
                    .setFile("/vendor/nikic/php-parser/lib/PhpParser/Node/Expr/PreDec.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2127 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
