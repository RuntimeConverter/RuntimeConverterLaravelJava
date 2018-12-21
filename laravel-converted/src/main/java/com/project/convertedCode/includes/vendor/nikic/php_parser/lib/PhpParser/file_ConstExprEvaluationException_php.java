package com.project.convertedCode.includes.vendor.nikic.php_parser.lib.PhpParser;

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

 vendor/nikic/php-parser/lib/PhpParser/ConstExprEvaluationException.php

*/

public class file_ConstExprEvaluationException_php implements RuntimeIncludable {

    public static final file_ConstExprEvaluationException_php instance =
            new file_ConstExprEvaluationException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2034 scope = new Scope2034();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2034 scope)
            throws IncludeEventException {

        // Conversion Note: class named ConstExprEvaluationException was here in the source code
        env.addManualClassLoad("PhpParser\\ConstExprEvaluationException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nikic/php-parser/lib/PhpParser")
                    .setFile(
                            "/vendor/nikic/php-parser/lib/PhpParser/ConstExprEvaluationException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2034 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
