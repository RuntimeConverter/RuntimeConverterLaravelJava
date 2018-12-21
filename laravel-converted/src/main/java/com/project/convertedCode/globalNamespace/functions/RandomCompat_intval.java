package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.nativeClasses.errors.TypeError;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_float;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/paragonie/random_compat/lib/cast_to_int.php

*/

public class RandomCompat_intval extends FunctionBaseRegular {

    public static RandomCompat_intval f = new RandomCompat_intval();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "number")
    @ConvertedParameter(
        index = 1,
        name = "fail_open",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object number = assignParameter(args, 0, false);
        Object fail_open = assignParameter(args, 1, true);
        if (null == fail_open) {
            fail_open = false;
        }
        if (ZVal.toBool(function_is_int.f.env(env).call(number).value())
                || ZVal.toBool(function_is_float.f.env(env).call(number).value())) {
            number = ZAssignment.add("+=", number, 0);

        } else if (function_is_numeric.f.env(env).call(number).getBool()) {
            number = ZAssignment.add("+=", number, 0);
        }

        if (ZVal.toBool(
                        ZVal.toBool(function_is_float.f.env(env).call(number).value())
                                && ZVal.toBool(
                                        ZVal.isGreaterThan(
                                                number, '>', ~ZVal.toLong(9223372036854775807L))))
                && ZVal.toBool(ZVal.isLessThan(number, '<', 9223372036854775807L))) {
            number = ZVal.assign(ZVal.toLong(number));
        }

        if (function_is_int.f.env(env).call(number).getBool()) {
            return ZVal.assign(ZVal.toLong(number));

        } else if (!ZVal.isTrue(fail_open)) {
            throw ZVal.getException(env, new TypeError(env, "Expected an integer."));
        }

        return ZVal.assign(number);
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/paragonie/random_compat/lib")
                .setFile("/vendor/paragonie/random_compat/lib/cast_to_int.php");
    }
}
