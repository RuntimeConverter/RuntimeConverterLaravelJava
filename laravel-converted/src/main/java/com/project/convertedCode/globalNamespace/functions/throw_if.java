package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;
import static com.runtimeconverter.runtime.ZVal.assignParameterVarArgs;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/helpers.php

*/

public class throw_if extends FunctionBaseRegular {

    public static throw_if f = new throw_if();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "condition")
    @ConvertedParameter(index = 1, name = "exception")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object call(RuntimeEnv env, Object... args) {
        Object condition = assignParameter(args, 0, false);
        Object exception = assignParameter(args, 1, false);
        Object parameters = assignParameterVarArgs(args, 2);
        if (ZVal.isTrue(condition)) {
            throw ZVal.getException(
                    env,
                    function_is_string.f.env(env).call(exception).getBool()
                            ? env.createNew(
                                    exception,
                                    PackedVaradicArgs.unpack(new PackedVaradicArgs(parameters)))
                            : exception);
        }

        return ZVal.assign(condition);
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                .setFile("/vendor/laravel/framework/src/Illuminate/Support/helpers.php");
    }
}
