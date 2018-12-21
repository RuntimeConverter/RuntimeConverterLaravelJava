package com.project.convertedCode.globalNamespace.functions;

import com.project.convertedCode.globalNamespace.functions.app;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_num_args;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Validation.classes.Factory;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/helpers.php

*/

public class validator extends FunctionBaseRegular {

    public static validator f = new validator();

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "data",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 1,
        name = "rules",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "messages",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 3,
        name = "customAttributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        Object rules = assignParameter(args, 1, true);
        if (null == rules) {
            rules = ZVal.newArray();
        }
        Object messages = assignParameter(args, 2, true);
        if (null == messages) {
            messages = ZVal.newArray();
        }
        Object customAttributes = assignParameter(args, 3, true);
        if (null == customAttributes) {
            customAttributes = ZVal.newArray();
        }
        Object factory = null;
        factory = app.f.env(env).call(Factory.CONST_class).value();
        if (ZVal.strictEqualityCheck(
                function_func_num_args
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call()
                        .value(),
                "===",
                0)) {
            return ZVal.assign(factory);
        }

        return ZVal.assign(
                env.callMethod(
                        factory, "make", validator.class, data, rules, messages, customAttributes));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Foundation")
                .setFile("/vendor/laravel/framework/src/Illuminate/Foundation/helpers.php");
    }
}
