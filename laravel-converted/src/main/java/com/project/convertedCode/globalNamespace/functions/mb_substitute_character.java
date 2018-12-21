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

public class mb_substitute_character extends FunctionBaseRegular {

    public static mb_substitute_character f = new mb_substitute_character();

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "char",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object _pChar = assignParameter(args, 0, true);
        if (null == _pChar) {
            _pChar = ZVal.getNull();
        }
        return ZVal.assign(Mbstring.runtimeStaticObject.mb_substitute_character(env, _pChar));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/symfony/polyfill-mbstring")
                .setFile("/vendor/symfony/polyfill-mbstring/bootstrap.php");
    }
}
