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

public class mb_get_info extends FunctionBaseRegular {

    public static mb_get_info f = new mb_get_info();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    public Object call(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, true);
        if (null == type) {
            type = "all";
        }
        return ZVal.assign(Mbstring.runtimeStaticObject.mb_get_info(env, type));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/symfony/polyfill-mbstring")
                .setFile("/vendor/symfony/polyfill-mbstring/bootstrap.php");
    }
}
