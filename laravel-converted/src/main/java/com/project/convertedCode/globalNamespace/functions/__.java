package com.project.convertedCode.globalNamespace.functions;

import com.project.convertedCode.globalNamespace.functions.app;
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

 vendor/laravel/framework/src/Illuminate/Foundation/helpers.php

*/

public class __ extends FunctionBaseRegular {

    public static __ f = new __();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "replace", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 2,
        name = "locale",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object replace = assignParameter(args, 1, true);
        if (null == replace) {
            replace = ZVal.newArray();
        }
        Object locale = assignParameter(args, 2, true);
        if (null == locale) {
            locale = ZVal.getNull();
        }
        return ZVal.assign(
                env.callMethod(
                        app.f.env(env).call("translator").value(),
                        "getFromJson",
                        __.class,
                        key,
                        replace,
                        locale));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Foundation")
                .setFile("/vendor/laravel/framework/src/Illuminate/Foundation/helpers.php");
    }
}
