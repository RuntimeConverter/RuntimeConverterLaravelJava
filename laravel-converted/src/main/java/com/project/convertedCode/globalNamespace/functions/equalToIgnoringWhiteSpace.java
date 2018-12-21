package com.project.convertedCode.globalNamespace.functions;

import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Text.classes.IsEqualIgnoringWhiteSpace;
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

public class equalToIgnoringWhiteSpace extends FunctionBaseRegular {

    public static equalToIgnoringWhiteSpace f = new equalToIgnoringWhiteSpace();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    public Object call(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        return ZVal.assign(
                IsEqualIgnoringWhiteSpace.runtimeStaticObject.equalToIgnoringWhiteSpace(
                        env, string));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/hamcrest/hamcrest-php/hamcrest")
                .setFile("/vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest.php");
    }
}
