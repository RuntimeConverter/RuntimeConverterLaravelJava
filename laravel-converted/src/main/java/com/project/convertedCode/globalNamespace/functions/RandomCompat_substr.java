package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.functions.RandomCompat_strlen;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.nativeClasses.errors.TypeError;
import com.project.convertedCode.globalNamespace.functions.mb_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/paragonie/random_compat/lib/byte_safe_strings.php

*/

public class RandomCompat_substr extends FunctionBaseRegular {

    public static RandomCompat_substr f = new RandomCompat_substr();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "binary_string")
    @ConvertedParameter(index = 1, name = "start")
    @ConvertedParameter(
        index = 2,
        name = "length",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object binary_string = assignParameter(args, 0, false);
        Object start = assignParameter(args, 1, false);
        Object length = assignParameter(args, 2, true);
        if (null == length) {
            length = ZVal.getNull();
        }
        if (!function_is_string.f.env(env).call(binary_string).getBool()) {
            throw ZVal.getException(
                    env,
                    new TypeError(env, "RandomCompat_substr(): First argument should be a string"));
        }

        if (!function_is_int.f.env(env).call(start).getBool()) {
            throw ZVal.getException(
                    env,
                    new TypeError(
                            env, "RandomCompat_substr(): Second argument should be an integer"));
        }

        if (ZVal.strictEqualityCheck(length, "===", ZVal.getNull())) {
            length =
                    ZVal.subtract(
                            RandomCompat_strlen.f.env(env).call(binary_string).value(), start);

        } else if (!function_is_int.f.env(env).call(length).getBool()) {
            throw ZVal.getException(
                    env,
                    new TypeError(
                            env,
                            "RandomCompat_substr(): Third argument should be an integer, or omitted"));
        }

        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                start,
                                "===",
                                RandomCompat_strlen.f.env(env).call(binary_string).value()))
                && ZVal.toBool(ZVal.strictEqualityCheck(length, "===", 0))) {
            return "";
        }

        if (ZVal.isGreaterThan(
                start, '>', RandomCompat_strlen.f.env(env).call(binary_string).value())) {
            return "";
        }

        return ZVal.assign(
                toStringR(
                        mb_substr
                                .f
                                .env(env)
                                .call(
                                        toStringR(binary_string, env),
                                        ZVal.toLong(start),
                                        ZVal.toLong(length),
                                        "8bit")
                                .value(),
                        env));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/paragonie/random_compat/lib")
                .setFile("/vendor/paragonie/random_compat/lib/byte_safe_strings.php");
    }
}
