package com.project.convertedCode.globalNamespace.functions;

import com.project.convertedCode.globalNamespace.functions.app;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Cookie.classes.Factory;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/helpers.php

*/

public class cookie extends FunctionBaseRegular {

    public static cookie f = new cookie();

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "minutes",
        defaultValue = "0",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 3,
        name = "path",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "domain",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "secure",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "httpOnly",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 7,
        name = "raw",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 8,
        name = "sameSite",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object value = assignParameter(args, 1, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        Object minutes = assignParameter(args, 2, true);
        if (null == minutes) {
            minutes = 0;
        }
        Object path = assignParameter(args, 3, true);
        if (null == path) {
            path = ZVal.getNull();
        }
        Object domain = assignParameter(args, 4, true);
        if (null == domain) {
            domain = ZVal.getNull();
        }
        Object secure = assignParameter(args, 5, true);
        if (null == secure) {
            secure = false;
        }
        Object httpOnly = assignParameter(args, 6, true);
        if (null == httpOnly) {
            httpOnly = true;
        }
        Object raw = assignParameter(args, 7, true);
        if (null == raw) {
            raw = false;
        }
        Object sameSite = assignParameter(args, 8, true);
        if (null == sameSite) {
            sameSite = ZVal.getNull();
        }
        Object cookie = null;
        cookie = app.f.env(env).call(Factory.CONST_class).value();
        if (function_is_null.f.env(env).call(name).getBool()) {
            return ZVal.assign(cookie);
        }

        return ZVal.assign(
                env.callMethod(
                        cookie,
                        "make",
                        cookie.class,
                        name,
                        value,
                        minutes,
                        path,
                        domain,
                        secure,
                        httpOnly,
                        raw,
                        sameSite));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Foundation")
                .setFile("/vendor/laravel/framework/src/Illuminate/Foundation/helpers.php");
    }
}
