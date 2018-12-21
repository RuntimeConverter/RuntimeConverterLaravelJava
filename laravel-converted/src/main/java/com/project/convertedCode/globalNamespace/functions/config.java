package com.project.convertedCode.globalNamespace.functions;

import com.project.convertedCode.globalNamespace.functions.app;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
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

public class config extends FunctionBaseRegular {

    public static config f = new config();

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "key",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, true);
        if (null == key) {
            key = ZVal.getNull();
        }
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        if (function_is_null.f.env(env).call(key).getBool()) {
            return ZVal.assign(app.f.env(env).call("config").value());
        }

        if (function_is_array.f.env(env).call(key).getBool()) {
            return ZVal.assign(
                    env.callMethod(
                            app.f.env(env).call("config").value(), "set", config.class, key));
        }

        return ZVal.assign(
                env.callMethod(
                        app.f.env(env).call("config").value(),
                        "get",
                        config.class,
                        key,
                        _pDefault));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Foundation")
                .setFile("/vendor/laravel/framework/src/Illuminate/Foundation/helpers.php");
    }
}
