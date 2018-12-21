package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Validation.namespaces.Rules.classes;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Validation/Rules/DatabaseRule.php

*/

public class DatabaseRule {

    public static final Object CONST_class = "Illuminate\\Validation\\Rules\\DatabaseRule";

    private static class Scope154 implements UpdateRuntimeScopeInterface {

        Object _thisVarAlias;
        Object column;
        Object value;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("column", this.column);
            stack.setVariable("value", this.value);
        }

        public void updateScope(RuntimeStack stack) {

            this._thisVarAlias = stack.getVariable("this");
            this.column = stack.getVariable("column");
            this.value = stack.getVariable("value");
        }
    }
}
