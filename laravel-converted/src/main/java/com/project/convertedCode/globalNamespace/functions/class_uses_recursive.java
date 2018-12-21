package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.ZAssignment;
import com.project.convertedCode.globalNamespace.functions.trait_uses_recursive;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reverse;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_parents;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/helpers.php

*/

public class class_uses_recursive extends FunctionBaseRegular {

    public static class_uses_recursive f = new class_uses_recursive();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    public Object call(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object results = null;
        if (function_is_object.f.env(env).call(_pClass).getBool()) {
            _pClass = function_get_class.f.env(env).call(_pClass).value();
        }

        results = ZVal.newArray();
        for (ZPair zpairResult596 :
                ZVal.getIterable(
                        ZVal.add(
                                function_array_reverse
                                        .f
                                        .env(env)
                                        .call(
                                                function_class_parents
                                                        .f
                                                        .env(env)
                                                        .call(_pClass)
                                                        .value())
                                        .value(),
                                ZVal.newArray(new ZPair(_pClass, _pClass))),
                        env,
                        true)) {
            _pClass = ZVal.assign(zpairResult596.getValue());
            results =
                    ZAssignment.add(
                            "+=", results, trait_uses_recursive.f.env(env).call(_pClass).value());
        }

        return ZVal.assign(function_array_unique.f.env(env).call(results).value());
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                .setFile("/vendor/laravel/framework/src/Illuminate/Support/helpers.php");
    }
}
