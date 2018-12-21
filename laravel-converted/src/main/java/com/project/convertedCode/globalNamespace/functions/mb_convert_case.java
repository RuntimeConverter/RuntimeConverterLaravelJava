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

public class mb_convert_case extends FunctionBaseRegular {

    public static mb_convert_case f = new mb_convert_case();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "s")
    @ConvertedParameter(index = 1, name = "mode")
    @ConvertedParameter(
        index = 2,
        name = "enc",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object s = assignParameter(args, 0, false);
        Object mode = assignParameter(args, 1, false);
        Object enc = assignParameter(args, 2, true);
        if (null == enc) {
            enc = ZVal.getNull();
        }
        return ZVal.assign(Mbstring.runtimeStaticObject.mb_convert_case(env, s, mode, enc));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/symfony/polyfill-mbstring")
                .setFile("/vendor/symfony/polyfill-mbstring/bootstrap.php");
    }
}
