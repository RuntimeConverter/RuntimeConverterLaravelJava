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

public class mb_substr_count extends FunctionBaseRegular {

    public static mb_substr_count f = new mb_substr_count();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "haystack")
    @ConvertedParameter(index = 1, name = "needle")
    @ConvertedParameter(
        index = 2,
        name = "enc",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object haystack = assignParameter(args, 0, false);
        Object needle = assignParameter(args, 1, false);
        Object enc = assignParameter(args, 2, true);
        if (null == enc) {
            enc = ZVal.getNull();
        }
        return ZVal.assign(
                Mbstring.runtimeStaticObject.mb_substr_count(env, haystack, needle, enc));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/symfony/polyfill-mbstring")
                .setFile("/vendor/symfony/polyfill-mbstring/bootstrap.php");
    }
}
