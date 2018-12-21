package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Polyfill.namespaces.Ctype.classes.Ctype;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/polyfill-ctype/bootstrap.php

*/

public class ctype_cntrl extends FunctionBaseRegular {

    public static ctype_cntrl f = new ctype_cntrl();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "text")
    public Object call(RuntimeEnv env, Object... args) {
        Object text = assignParameter(args, 0, false);
        return ZVal.assign(Ctype.runtimeStaticObject.ctype_cntrl(env, text));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/symfony/polyfill-ctype")
                .setFile("/vendor/symfony/polyfill-ctype/bootstrap.php");
    }
}
