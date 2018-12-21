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

public class assertAttributeContains extends FunctionBaseRegular {

    public static assertAttributeContains f = new assertAttributeContains();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "needle")
    @ConvertedParameter(index = 1, name = "haystackAttributeName", typeHint = "string")
    @ConvertedParameter(index = 2, name = "haystackClassOrObject")
    @ConvertedParameter(index = 3, name = "message", typeHint = "string")
    @ConvertedParameter(
        index = 4,
        name = "ignoreCase",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "checkForObjectIdentity",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "checkForNonObjectIdentity",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object needle = assignParameter(args, 0, false);
        Object haystackAttributeName = assignParameter(args, 1, false);
        Object haystackClassOrObject = assignParameter(args, 2, false);
        Object message = assignParameter(args, 3, true);
        if (null == message) {
            message = "";
        }
        Object ignoreCase = assignParameter(args, 4, true);
        if (null == ignoreCase) {
            ignoreCase = false;
        }
        Object checkForObjectIdentity = assignParameter(args, 5, true);
        if (null == checkForObjectIdentity) {
            checkForObjectIdentity = true;
        }
        Object checkForNonObjectIdentity = assignParameter(args, 6, true);
        if (null == checkForNonObjectIdentity) {
            checkForNonObjectIdentity = false;
        }
        Assert.runtimeStaticObject.assertAttributeContains(
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
