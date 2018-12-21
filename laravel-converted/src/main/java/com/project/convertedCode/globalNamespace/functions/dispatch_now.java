package com.project.convertedCode.globalNamespace.functions;

import com.project.convertedCode.globalNamespace.functions.app;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Bus.classes.Dispatcher;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/helpers.php

*/

public class dispatch_now extends FunctionBaseRegular {

    public static dispatch_now f = new dispatch_now();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job")
    @ConvertedParameter(
        index = 1,
        name = "handler",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        Object handler = assignParameter(args, 1, true);
        if (null == handler) {
            handler = ZVal.getNull();
        }
        return ZVal.assign(
                env.callMethod(
                        app.f.env(env).call(Dispatcher.CONST_class).value(),
                        "dispatchNow",
                        dispatch_now.class,
                        job,
                        handler));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Foundation")
                .setFile("/vendor/laravel/framework/src/Illuminate/Foundation/helpers.php");
    }
}
