package com.project.convertedCode.globalNamespace.functions;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
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

public class str_limit extends FunctionBaseRegular {

    public static str_limit f = new str_limit();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(
        index = 1,
        name = "limit",
        defaultValue = "100",
        defaultValueType = "number"
    )
    @ConvertedParameter(index = 2, name = "end")
    public Object call(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object limit = assignParameter(args, 1, true);
        if (null == limit) {
            limit = 100;
        }
        Object end = assignParameter(args, 2, true);
        if (null == end) {
            end = "...";
        }
        return ZVal.assign(Str.runtimeStaticObject.limit(env, value, limit, end));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                .setFile("/vendor/laravel/framework/src/Illuminate/Support/helpers.php");
    }
}
