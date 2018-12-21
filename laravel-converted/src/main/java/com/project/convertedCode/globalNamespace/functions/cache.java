package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.functions.app;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_reset;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.array.function_key;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/helpers.php

*/

public class cache extends FunctionBaseRegular {

    public static cache f = new cache();

    @ConvertedMethod
    public Object call(RuntimeEnv env, Object... args) {
        ReferenceContainer arguments = new BasicReferenceContainer(null);
        Object ternaryExpressionTemp = null;
        arguments.setObject(
                function_func_get_args
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call()
                        .value());
        if (ZVal.isEmpty(arguments.getObject())) {
            return ZVal.assign(app.f.env(env).call("cache").value());
        }

        if (function_is_string.f.env(env).call(arguments.arrayGet(env, 0)).getBool()) {
            return ZVal.assign(
                    env.callMethod(
                            app.f.env(env).call("cache").value(),
                            "get",
                            cache.class,
                            arguments.arrayGet(env, 0),
                            ZVal.isDefined(ternaryExpressionTemp = arguments.arrayGet(env, 1))
                                    ? ternaryExpressionTemp
                                    : ZVal.getNull()));
        }

        if (!function_is_array.f.env(env).call(arguments.arrayGet(env, 0)).getBool()) {
            throw ZVal.getException(
                    env,
                    new PHPException(
                            env,
                            "When setting a value in the cache, you must pass an array of key / value pairs."));
        }

        if (!arrayActionR(ArrayAction.ISSET, arguments, env, 1)) {
            throw ZVal.getException(
                    env,
                    new PHPException(
                            env,
                            "You must specify an expiration time when setting a value in the cache."));
        }

        return ZVal.assign(
                env.callMethod(
                        app.f.env(env).call("cache").value(),
                        "put",
                        cache.class,
                        function_key.f.env(env).call(arguments.arrayGet(env, 0)).value(),
                        function_reset.f.env(env).call(arguments.arrayGet(env, 0)).value(),
                        arguments.arrayGet(env, 1)));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Foundation")
                .setFile("/vendor/laravel/framework/src/Illuminate/Foundation/helpers.php");
    }
}
