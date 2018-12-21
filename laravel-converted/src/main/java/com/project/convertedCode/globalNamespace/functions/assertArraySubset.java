package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Assert;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
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

 vendor/phpunit/phpunit/src/Framework/Assert/Functions.php

*/

public class assertArraySubset extends FunctionBaseRegular {

    public static assertArraySubset f = new assertArraySubset();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "subset")
    @ConvertedParameter(index = 1, name = "array")
    @ConvertedParameter(
        index = 2,
        name = "strict",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 3, name = "message", typeHint = "string")
    public Object call(RuntimeEnv env, Object... args) {
        Object subset = assignParameter(args, 0, false);
        Object array = assignParameter(args, 1, false);
        Object strict = assignParameter(args, 2, true);
        if (null == strict) {
            strict = false;
        }
        Object message = assignParameter(args, 3, true);
        if (null == message) {
            message = "";
        }
        Assert.runtimeStaticObject.assertArraySubset(
                env,
                PackedVaradicArgs.unpack(
                        new PackedVaradicArgs(
                                function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value())));
        return null;
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/phpunit/phpunit/src/Framework/Assert")
                .setFile("/vendor/phpunit/phpunit/src/Framework/Assert/Functions.php");
    }
}
