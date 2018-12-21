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

public class assertEqualXMLStructure extends FunctionBaseRegular {

    public static assertEqualXMLStructure f = new assertEqualXMLStructure();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expectedElement", typeHint = "DOMElement")
    @ConvertedParameter(index = 1, name = "actualElement", typeHint = "DOMElement")
    @ConvertedParameter(
        index = 2,
        name = "checkAttributes",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 3, name = "message", typeHint = "string")
    public Object call(RuntimeEnv env, Object... args) {
        Object expectedElement = assignParameter(args, 0, false);
        Object actualElement = assignParameter(args, 1, false);
        Object checkAttributes = assignParameter(args, 2, true);
        if (null == checkAttributes) {
            checkAttributes = false;
        }
        Object message = assignParameter(args, 3, true);
        if (null == message) {
            message = "";
        }
        Assert.runtimeStaticObject.assertEqualXMLStructure(
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
