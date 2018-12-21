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

public class mb_encode_mimeheader extends FunctionBaseRegular {

    public static mb_encode_mimeheader f = new mb_encode_mimeheader();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "s")
    @ConvertedParameter(
        index = 1,
        name = "charset",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "transferEnc",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "lf",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "indent",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object s = assignParameter(args, 0, false);
        Object charset = assignParameter(args, 1, true);
        if (null == charset) {
            charset = ZVal.getNull();
        }
        Object transferEnc = assignParameter(args, 2, true);
        if (null == transferEnc) {
            transferEnc = ZVal.getNull();
        }
        Object lf = assignParameter(args, 3, true);
        if (null == lf) {
            lf = ZVal.getNull();
        }
        Object indent = assignParameter(args, 4, true);
        if (null == indent) {
            indent = ZVal.getNull();
        }
        return ZVal.assign(
                Mbstring.runtimeStaticObject.mb_encode_mimeheader(
                        env, s, charset, transferEnc, lf, indent));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/symfony/polyfill-mbstring")
                .setFile("/vendor/symfony/polyfill-mbstring/bootstrap.php");
    }
}
