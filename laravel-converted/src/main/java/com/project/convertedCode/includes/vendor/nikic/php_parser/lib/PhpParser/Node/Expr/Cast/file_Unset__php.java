package com.project.convertedCode.includes.vendor.nikic.php_parser.lib.PhpParser.Node.Expr.Cast;

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

 vendor/nikic/php-parser/lib/PhpParser/Node/Expr/Cast/Unset_.php

*/

public class file_Unset__php implements RuntimeIncludable {

    public static final file_Unset__php instance = new file_Unset__php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2107 scope = new Scope2107();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2107 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named Unset_ was here in the source code
        env.addManualClassLoad("PhpParser\\Node\\Expr\\Cast\\Unset_");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nikic/php-parser/lib/PhpParser/Node/Expr/Cast")
                    .setFile("/vendor/nikic/php-parser/lib/PhpParser/Node/Expr/Cast/Unset_.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2107 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
