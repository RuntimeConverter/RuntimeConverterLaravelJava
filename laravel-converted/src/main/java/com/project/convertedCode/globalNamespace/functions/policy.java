package com.project.convertedCode.globalNamespace.functions;

import com.project.convertedCode.globalNamespace.functions.app;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Auth.namespaces.Access.classes.Gate;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/helpers.php

*/

public class policy extends FunctionBaseRegular {

    public static policy f = new policy();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    public Object call(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        app.f.env(env).call(Gate.CONST_class).value(),
                        "getPolicyFor",
                        policy.class,
                        _pClass));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Foundation")
                .setFile("/vendor/laravel/framework/src/Illuminate/Foundation/helpers.php");
    }
}
