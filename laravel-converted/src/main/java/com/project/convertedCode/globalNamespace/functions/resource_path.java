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

public class resource_path extends FunctionBaseRegular {

    public static resource_path f = new resource_path();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object call(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, true);
        if (null == path) {
            path = "";
        }
        return ZVal.assign(
                env.callMethod(
                        app.f.env(env).call().value(), "resourcePath", resource_path.class, path));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Foundation")
                .setFile("/vendor/laravel/framework/src/Illuminate/Foundation/helpers.php");
    }
}
