package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Polyfill.namespaces.Mbstring.classes.Mbstring;
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

 vendor/symfony/polyfill-mbstring/bootstrap.php

*/

public class mb_detect_order extends FunctionBaseRegular {

    public static mb_detect_order f = new mb_detect_order();

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "encodingList",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object encodingList = assignParameter(args, 0, true);
        if (null == encodingList) {
            encodingList = ZVal.getNull();
        }
        return ZVal.assign(Mbstring.runtimeStaticObject.mb_detect_order(env, encodingList));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/symfony/polyfill-mbstring")
                .setFile("/vendor/symfony/polyfill-mbstring/bootstrap.php");
    }
}
