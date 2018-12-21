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

public class mb_detect_encoding extends FunctionBaseRegular {

    public static mb_detect_encoding f = new mb_detect_encoding();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "str")
    @ConvertedParameter(
        index = 1,
        name = "encodingList",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "strict",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object str = assignParameter(args, 0, false);
        Object encodingList = assignParameter(args, 1, true);
        if (null == encodingList) {
            encodingList = ZVal.getNull();
        }
        Object strict = assignParameter(args, 2, true);
        if (null == strict) {
            strict = false;
        }
        return ZVal.assign(
                Mbstring.runtimeStaticObject.mb_detect_encoding(env, str, encodingList, strict));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/symfony/polyfill-mbstring")
                .setFile("/vendor/symfony/polyfill-mbstring/bootstrap.php");
    }
}
