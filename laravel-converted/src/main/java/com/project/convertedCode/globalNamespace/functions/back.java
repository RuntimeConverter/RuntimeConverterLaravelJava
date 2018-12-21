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

public class back extends FunctionBaseRegular {

    public static back f = new back();

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "status",
        defaultValue = "302",
        defaultValueType = "number"
    )
    @ConvertedParameter(index = 1, name = "headers", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 2,
        name = "fallback",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object status = assignParameter(args, 0, true);
        if (null == status) {
            status = 302;
        }
        Object headers = assignParameter(args, 1, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        Object fallback = assignParameter(args, 2, true);
        if (null == fallback) {
            fallback = false;
        }
        return ZVal.assign(
                env.callMethod(
                        app.f.env(env).call("redirect").value(),
                        "back",
                        back.class,
                        status,
                        headers,
                        fallback));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Foundation")
                .setFile("/vendor/laravel/framework/src/Illuminate/Foundation/helpers.php");
    }
}
