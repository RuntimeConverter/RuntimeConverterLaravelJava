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

public class assertJsonFileNotEqualsJsonFile extends FunctionBaseRegular {

    public static assertJsonFileNotEqualsJsonFile f = new assertJsonFileNotEqualsJsonFile();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expectedFile", typeHint = "string")
    @ConvertedParameter(index = 1, name = "actualFile", typeHint = "string")
    @ConvertedParameter(index = 2, name = "message", typeHint = "string")
    public Object call(RuntimeEnv env, Object... args) {
        Object expectedFile = assignParameter(args, 0, false);
        Object actualFile = assignParameter(args, 1, false);
        Object message = assignParameter(args, 2, true);
        if (null == message) {
            message = "";
        }
        Assert.runtimeStaticObject.assertJsonFileNotEqualsJsonFile(
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
