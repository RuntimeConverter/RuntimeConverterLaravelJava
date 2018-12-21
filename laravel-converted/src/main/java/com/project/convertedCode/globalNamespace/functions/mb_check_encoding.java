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

public class mb_check_encoding extends FunctionBaseRegular {

    public static mb_check_encoding f = new mb_check_encoding();

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "var",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "encoding",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object var = assignParameter(args, 0, true);
        if (null == var) {
            var = ZVal.getNull();
        }
        Object encoding = assignParameter(args, 1, true);
        if (null == encoding) {
            encoding = ZVal.getNull();
        }
        return ZVal.assign(Mbstring.runtimeStaticObject.mb_check_encoding(env, var, encoding));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/symfony/polyfill-mbstring")
                .setFile("/vendor/symfony/polyfill-mbstring/bootstrap.php");
    }
}
