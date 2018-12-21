package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.functions.value;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/helpers.php

*/

public class object_get extends FunctionBaseRegular {

    public static object_get f = new object_get();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "object")
    @ConvertedParameter(index = 1, name = "key")
    @ConvertedParameter(
        index = 2,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object _object = assignParameter(args, 0, false);
        Object key = assignParameter(args, 1, false);
        Object _pDefault = assignParameter(args, 2, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        Object segment = null;
        if (ZVal.toBool(function_is_null.f.env(env).call(key).value())
                || ZVal.toBool(
                        ZVal.equalityCheck(function_trim.f.env(env).call(key).value(), ""))) {
            return ZVal.assign(_object);
        }

        for (ZPair zpairResult600 :
                ZVal.getIterable(function_explode.f.env(env).call(".", key).value(), env, true)) {
            segment = ZVal.assign(zpairResult600.getValue());
            if (ZVal.toBool(!function_is_object.f.env(env).call(_object).getBool())
                    || ZVal.toBool(
                            !ZVal.isset(
                                    toObjectR(_object)
                                            .accessProp(this, env)
                                            .name(segment)
                                            .value()))) {
                return ZVal.assign(value.f.env(env).call(_pDefault).value());
            }

            _object = ZVal.assign(toObjectR(_object).accessProp(this, env).name(segment).value());
        }

        return ZVal.assign(_object);
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                .setFile("/vendor/laravel/framework/src/Illuminate/Support/helpers.php");
    }
}
