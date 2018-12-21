package com.project.convertedCode.globalNamespace.functions;

import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes.IsNot;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest.php

*/

public class not extends FunctionBaseRegular {

    public static not f = new not();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object call(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(IsNot.runtimeStaticObject.not(env, value));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/hamcrest/hamcrest-php/hamcrest")
                .setFile("/vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest.php");
    }
}
