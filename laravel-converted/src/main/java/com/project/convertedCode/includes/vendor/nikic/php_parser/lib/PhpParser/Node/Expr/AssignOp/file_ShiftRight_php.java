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

 vendor/nikic/php-parser/lib/PhpParser/Node/Expr/AssignOp/ShiftRight.php

*/

public class file_ShiftRight_php implements RuntimeIncludable {

    public static final file_ShiftRight_php instance = new file_ShiftRight_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2068 scope = new Scope2068();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2068 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named ShiftRight was here in the source code
        env.addManualClassLoad("PhpParser\\Node\\Expr\\AssignOp\\ShiftRight");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nikic/php-parser/lib/PhpParser/Node/Expr/AssignOp")
                    .setFile(
                            "/vendor/nikic/php-parser/lib/PhpParser/Node/Expr/AssignOp/ShiftRight.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2068 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
