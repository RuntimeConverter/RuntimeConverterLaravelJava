package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes.CombinableMatcher;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest.php

*/

public class either extends FunctionBaseRegular {

    public static either f = new either();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "matcher", typeHint = "Hamcrest\\Matcher")
    public Object call(RuntimeEnv env, Object... args) {
        Object matcher = assignParameter(args, 0, false);
        return ZVal.assign(CombinableMatcher.runtimeStaticObject.either(env, matcher));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/hamcrest/hamcrest-php/hamcrest")
                .setFile("/vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest.php");
    }
}
