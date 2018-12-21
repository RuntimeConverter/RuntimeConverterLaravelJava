package com.project.convertedCode.globalNamespace.functions;

import com.project.convertedCode.globalNamespace.functions.app;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameterVarArgs;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/helpers.php

*/

public class event extends FunctionBaseRegular {

    public static event f = new event();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args")
    public Object call(RuntimeEnv env, Object... args) {
        Object ___args = assignParameterVarArgs(args, 0);
        return ZVal.assign(
                env.callMethod(
                        app.f.env(env).call("events").value(),
                        "dispatch",
                        event.class,
                        PackedVaradicArgs.unpack(new PackedVaradicArgs(___args))));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Foundation")
                .setFile("/vendor/laravel/framework/src/Illuminate/Foundation/helpers.php");
    }
}
