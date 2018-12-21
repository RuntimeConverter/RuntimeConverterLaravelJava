package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Polyfill.namespaces.Php72.classes.Php72;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/polyfill-php72/bootstrap.php

*/

public class sapi_windows_vt100_support extends FunctionBaseRegular {

    public static sapi_windows_vt100_support f = new sapi_windows_vt100_support();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stream")
    @ConvertedParameter(
        index = 1,
        name = "enable",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object stream = assignParameter(args, 0, false);
        Object enable = assignParameter(args, 1, true);
        if (null == enable) {
            enable = ZVal.getNull();
        }
        return ZVal.assign(
                Php72.runtimeStaticObject.sapi_windows_vt100_support(env, stream, enable));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/symfony/polyfill-php72")
                .setFile("/vendor/symfony/polyfill-php72/bootstrap.php");
    }
}
