package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.functions.app;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.Factory;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/helpers.php

*/

public class factory extends FunctionBaseRegular {

    public static factory f = new factory();

    @ConvertedMethod
    public Object call(RuntimeEnv env, Object... args) {
        Object factory = null;
        ReferenceContainer arguments = new BasicReferenceContainer(null);
        Object ternaryExpressionTemp = null;
        factory = app.f.env(env).call(Factory.CONST_class).value();
        arguments.setObject(
                function_func_get_args
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call()
                        .value());
        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, arguments, env, 1))
                && ZVal.toBool(
                        function_is_string.f.env(env).call(arguments.arrayGet(env, 1)).value())) {
            return ZVal.assign(
                    env.callMethod(
                            env.callMethod(
                                    factory,
                                    "of",
                                    factory.class,
                                    arguments.arrayGet(env, 0),
                                    arguments.arrayGet(env, 1)),
                            "times",
                            factory.class,
                            ZVal.isDefined(ternaryExpressionTemp = arguments.arrayGet(env, 2))
                                    ? ternaryExpressionTemp
                                    : ZVal.getNull()));

        } else if (arrayActionR(ArrayAction.ISSET, arguments, env, 1)) {
            return ZVal.assign(
                    env.callMethod(
                            env.callMethod(
                                    factory, "of", factory.class, arguments.arrayGet(env, 0)),
                            "times",
                            factory.class,
                            arguments.arrayGet(env, 1)));
        }

        return ZVal.assign(
                env.callMethod(factory, "of", factory.class, arguments.arrayGet(env, 0)));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Foundation")
                .setFile("/vendor/laravel/framework/src/Illuminate/Foundation/helpers.php");
    }
}
