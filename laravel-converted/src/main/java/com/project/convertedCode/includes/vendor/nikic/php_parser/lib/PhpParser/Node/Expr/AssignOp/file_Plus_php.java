package com.project.convertedCode.includes.vendor.nikic.php_parser.lib.PhpParser.Node.Expr.AssignOp;

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

 vendor/nikic/php-parser/lib/PhpParser/Node/Expr/AssignOp/Plus.php

*/

public class file_Plus_php implements RuntimeIncludable {

    public static final file_Plus_php instance = new file_Plus_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2065 scope = new Scope2065();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2065 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named Plus was here in the source code
        env.addManualClassLoad("PhpParser\\Node\\Expr\\AssignOp\\Plus");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nikic/php-parser/lib/PhpParser/Node/Expr/AssignOp")
                    .setFile("/vendor/nikic/php-parser/lib/PhpParser/Node/Expr/AssignOp/Plus.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2065 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
