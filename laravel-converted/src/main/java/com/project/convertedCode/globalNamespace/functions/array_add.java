package com.project.convertedCode.globalNamespace.functions;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/helpers.php

*/

public class array_add extends FunctionBaseRegular {

    public static array_add f = new array_add();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "array")
    @ConvertedParameter(index = 1, name = "key")
    @ConvertedParameter(index = 2, name = "value")
    public Object call(RuntimeEnv env, Object... args) {
        Object array = assignParameter(args, 0, false);
        Object key = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, false);
        return ZVal.assign(Arr.runtimeStaticObject.add(env, array, key, value));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                .setFile("/vendor/laravel/framework/src/Illuminate/Support/helpers.php");
    }
}
