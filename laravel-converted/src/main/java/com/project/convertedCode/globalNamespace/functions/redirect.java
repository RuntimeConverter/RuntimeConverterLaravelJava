package com.project.convertedCode.globalNamespace.functions;

import com.project.convertedCode.globalNamespace.functions.app;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
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

public class redirect extends FunctionBaseRegular {

    public static redirect f = new redirect();

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "to",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "status",
        defaultValue = "302",
        defaultValueType = "number"
    )
    @ConvertedParameter(index = 2, name = "headers", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 3,
        name = "secure",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object to = assignParameter(args, 0, true);
        if (null == to) {
            to = ZVal.getNull();
        }
        Object status = assignParameter(args, 1, true);
        if (null == status) {
            status = 302;
        }
        Object headers = assignParameter(args, 2, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        Object secure = assignParameter(args, 3, true);
        if (null == secure) {
            secure = ZVal.getNull();
        }
        if (function_is_null.f.env(env).call(to).getBool()) {
            return ZVal.assign(app.f.env(env).call("redirect").value());
        }

        return ZVal.assign(
                env.callMethod(
                        app.f.env(env).call("redirect").value(),
                        "to",
                        redirect.class,
                        to,
                        status,
                        headers,
                        secure));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Foundation")
                .setFile("/vendor/laravel/framework/src/Illuminate/Foundation/helpers.php");
    }
}
