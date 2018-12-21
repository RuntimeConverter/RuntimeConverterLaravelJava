package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_bool;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/helpers.php

*/

public class blank extends FunctionBaseRegular {

    public static blank f = new blank();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object call(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        if (function_is_null.f.env(env).call(value).getBool()) {
            return ZVal.assign(true);
        }

        if (function_is_string.f.env(env).call(value).getBool()) {
            return ZVal.assign(
                    ZVal.strictEqualityCheck(
                            function_trim.f.env(env).call(value).value(), "===", ""));
        }

        if (ZVal.toBool(function_is_numeric.f.env(env).call(value).value())
                || ZVal.toBool(function_is_bool.f.env(env).call(value).value())) {
            return ZVal.assign(false);
        }

        if (ZVal.isTrue(ZVal.checkInstanceType(value, Countable.class, "Countable"))) {
            return ZVal.assign(
                    ZVal.strictEqualityCheck(
                            function_count.f.env(env).call(value).value(), "===", 0));
        }

        return ZVal.isEmpty(value);
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                .setFile("/vendor/laravel/framework/src/Illuminate/Support/helpers.php");
    }
}
