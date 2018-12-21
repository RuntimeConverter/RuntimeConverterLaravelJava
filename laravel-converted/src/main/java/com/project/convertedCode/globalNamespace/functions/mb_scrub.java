package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.functions.mb_internal_encoding;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.functions.mb_convert_encoding;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/polyfill-mbstring/bootstrap.php

*/

public class mb_scrub extends FunctionBaseRegular {

    public static mb_scrub f = new mb_scrub();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "s")
    @ConvertedParameter(
        index = 1,
        name = "enc",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object s = assignParameter(args, 0, false);
        Object enc = assignParameter(args, 1, true);
        if (null == enc) {
            enc = ZVal.getNull();
        }
        enc =
                ZVal.assign(
                        ZVal.strictEqualityCheck(ZVal.getNull(), "===", enc)
                                ? mb_internal_encoding.f.env(env).call().value()
                                : enc);
        return ZVal.assign(mb_convert_encoding.f.env(env).call(s, enc, enc).value());
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/symfony/polyfill-mbstring")
                .setFile("/vendor/symfony/polyfill-mbstring/bootstrap.php");
    }
}
