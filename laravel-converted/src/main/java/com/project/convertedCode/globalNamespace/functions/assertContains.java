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

public class assertContains extends FunctionBaseRegular {

    public static assertContains f = new assertContains();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "needle")
    @ConvertedParameter(index = 1, name = "haystack")
    @ConvertedParameter(index = 2, name = "message", typeHint = "string")
    @ConvertedParameter(
        index = 3,
        name = "ignoreCase",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "checkForObjectIdentity",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "checkForNonObjectIdentity",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object needle = assignParameter(args, 0, false);
        Object haystack = assignParameter(args, 1, false);
        Object message = assignParameter(args, 2, true);
        if (null == message) {
            message = "";
        }
        Object ignoreCase = assignParameter(args, 3, true);
        if (null == ignoreCase) {
            ignoreCase = false;
        }
        Object checkForObjectIdentity = assignParameter(args, 4, true);
        if (null == checkForObjectIdentity) {
            checkForObjectIdentity = true;
        }
        Object checkForNonObjectIdentity = assignParameter(args, 5, true);
        if (null == checkForNonObjectIdentity) {
            checkForNonObjectIdentity = false;
        }
        Assert.runtimeStaticObject.assertContains(
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
