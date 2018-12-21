package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/helpers.php

*/

public class ___env extends FunctionBaseRegular {

    public static ___env f = new ___env();

    @ConvertedMethod(name = "env")
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        Object valueLength = null;
        ReferenceContainer value = new BasicReferenceContainer(null);
        value.setObject(NamespaceGlobal.getenv.env(env).call(key).value());
        if (ZVal.strictEqualityCheck(value.getObject(), "===", false)) {
            return ZVal.assign(
                    com.project
                            .convertedCode
                            .globalNamespace
                            .functions
                            .value
                            .f
                            .env(env)
                            .call(_pDefault)
                            .value());
        }

        switch (toStringR(NamespaceGlobal.strtolower.env(env).call(value.getObject()).value())) {
            case "true":
            case "(true)":
                return ZVal.assign(true);
            case "false":
            case "(false)":
                return ZVal.assign(false);
            case "empty":
            case "(empty)":
                return "";
            case "null":
            case "(null)":
                return null;
        }
        ;
        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.isGreaterThan(
                                                valueLength =
                                                        function_strlen
                                                                .f
                                                                .env(env)
                                                                .call(value.getObject())
                                                                .value(),
                                                '>',
                                                1))
                                && ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                value.arrayGet(env, 0), "===", "\"")))
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                value.arrayGet(env, ZVal.subtract(valueLength, 1)), "===", "\""))) {
            return ZVal.assign(function_substr.f.env(env).call(value.getObject(), 1, -1).value());
        }

        return ZVal.assign(value.getObject());
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                .setFile("/vendor/laravel/framework/src/Illuminate/Support/helpers.php");
    }
}
