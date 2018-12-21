package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Debug.classes.Dumper;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameterVarArgs;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/helpers.php

*/

public class dd extends FunctionBaseRegular {

    public static dd f = new dd();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args")
    public Object call(RuntimeEnv env, Object... args) {
        Object ___args = assignParameterVarArgs(args, 0);
        Object x = null;
        for (ZPair zpairResult599 : ZVal.getIterable(___args, env, true)) {
            x = ZVal.assign(zpairResult599.getValue());
            env.callMethod(new Dumper(env), "dump", dd.class, x);
        }

        env.exit(1);
        return null;
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                .setFile("/vendor/laravel/framework/src/Illuminate/Support/helpers.php");
    }
}
