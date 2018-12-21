package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Testing.namespaces.Concerns.classes;

import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Testing/Concerns/MocksApplicationServices.php

*/

public class MocksApplicationServices {

    public static final Object CONST_class =
            "Illuminate\\Foundation\\Testing\\Concerns\\MocksApplicationServices";

    private static class Scope139 implements UpdateRuntimeScopeInterface {

        Object instance;
        Object channels;
        Object notifiable;
        Object _thisVarAlias;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("instance", this.instance);
            stack.setVariable("channels", this.channels);
            stack.setVariable("notifiable", this.notifiable);
            stack.setVariable("this", this._thisVarAlias);
        }

        public void updateScope(RuntimeStack stack) {

            this.instance = stack.getVariable("instance");
            this.channels = stack.getVariable("channels");
            this.notifiable = stack.getVariable("notifiable");
            this._thisVarAlias = stack.getVariable("this");
        }
    }
}
