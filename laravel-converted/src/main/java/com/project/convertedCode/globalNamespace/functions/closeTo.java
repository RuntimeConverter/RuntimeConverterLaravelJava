package com.project.convertedCode.globalNamespace.functions;

import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Number.classes.IsCloseTo;
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

public class closeTo extends FunctionBaseRegular {

    public static closeTo f = new closeTo();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(index = 1, name = "delta")
    public Object call(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object delta = assignParameter(args, 1, false);
        return ZVal.assign(IsCloseTo.runtimeStaticObject.closeTo(env, value, delta));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/hamcrest/hamcrest-php/hamcrest")
                .setFile("/vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest.php");
    }
}
