package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Collection;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.functions.value;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/helpers.php

*/

public class data_get extends FunctionBaseRegular {

    public static data_get f = new data_get();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "target")
    @ConvertedParameter(index = 1, name = "key")
    @ConvertedParameter(
        index = 2,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        ReferenceContainer target = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object key = assignParameter(args, 1, false);
        Object _pDefault = assignParameter(args, 2, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        Object result = null;
        Object segment = null;
        if (function_is_null.f.env(env).call(key).getBool()) {
            return ZVal.assign(target.getObject());
        }

        key =
                ZVal.assign(
                        function_is_array.f.env(env).call(key).getBool()
                                ? key
                                : function_explode.f.env(env).call(".", key).value());
        while (!function_is_null
                .f
                .env(env)
                .call(segment = function_array_shift.f.env(env).call(key).value())
                .getBool()) {
            if (ZVal.strictEqualityCheck(segment, "===", "*")) {
                if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                target.getObject(),
                                Collection.class,
                                "Illuminate\\Support\\Collection"))) {
                    target.setObject(env.callMethod(target.getObject(), "all", data_get.class));

                } else if (!function_is_array.f.env(env).call(target.getObject()).getBool()) {
                    return ZVal.assign(value.f.env(env).call(_pDefault).value());
                }

                result = Arr.runtimeStaticObject.pluck(env, target.getObject(), key);
                return ZVal.assign(
                        function_in_array.f.env(env).call("*", key).getBool()
                                ? Arr.runtimeStaticObject.collapse(env, result)
                                : result);
            }

            if (ZVal.toBool(Arr.runtimeStaticObject.accessible(env, target.getObject()))
                    && ZVal.toBool(
                            Arr.runtimeStaticObject.exists(env, target.getObject(), segment))) {
                target.setObject(ZVal.assign(target.arrayGet(env, segment)));

            } else if (ZVal.toBool(function_is_object.f.env(env).call(target.getObject()).value())
                    && ZVal.toBool(
                            ZVal.isset(
                                    toObjectR(target.getObject())
                                            .accessProp(this, env)
                                            .name(segment)
                                            .value()))) {
                target.setObject(
                        ZVal.assign(
                                toObjectR(target.getObject())
                                        .accessProp(this, env)
                                        .name(segment)
                                        .value()));

            } else {
                return ZVal.assign(value.f.env(env).call(_pDefault).value());
            }
        }

        return ZVal.assign(target.getObject());
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                .setFile("/vendor/laravel/framework/src/Illuminate/Support/helpers.php");
    }
}
