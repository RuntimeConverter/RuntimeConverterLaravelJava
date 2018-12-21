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

public class mb_substr extends FunctionBaseRegular {

    public static mb_substr f = new mb_substr();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "s")
    @ConvertedParameter(index = 1, name = "start")
    @ConvertedParameter(
        index = 2,
        name = "length",
        defaultValue = "2147483647L",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 3,
        name = "enc",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object s = assignParameter(args, 0, false);
        Object start = assignParameter(args, 1, false);
        Object length = assignParameter(args, 2, true);
        if (null == length) {
            length = 2147483647L;
        }
        Object enc = assignParameter(args, 3, true);
        if (null == enc) {
            enc = ZVal.getNull();
        }
        return ZVal.assign(Mbstring.runtimeStaticObject.mb_substr(env, s, start, length, enc));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/symfony/polyfill-mbstring")
                .setFile("/vendor/symfony/polyfill-mbstring/bootstrap.php");
    }
}
