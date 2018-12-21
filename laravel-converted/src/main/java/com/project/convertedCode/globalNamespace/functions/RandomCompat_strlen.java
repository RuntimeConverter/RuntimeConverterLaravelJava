package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.functions.mb_strlen;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.nativeClasses.errors.TypeError;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/paragonie/random_compat/lib/byte_safe_strings.php

*/

public class RandomCompat_strlen extends FunctionBaseRegular {

    public static RandomCompat_strlen f = new RandomCompat_strlen();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "binary_string")
    public Object call(RuntimeEnv env, Object... args) {
        Object binary_string = assignParameter(args, 0, false);
        if (!function_is_string.f.env(env).call(binary_string).getBool()) {
            throw ZVal.getException(
                    env, new TypeError(env, "RandomCompat_strlen() expects a string"));
        }

        return ZVal.assign(ZVal.toLong(mb_strlen.f.env(env).call(binary_string, "8bit").value()));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/paragonie/random_compat/lib")
                .setFile("/vendor/paragonie/random_compat/lib/byte_safe_strings.php");
    }
}
