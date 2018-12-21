package com.project.convertedCode.globalNamespace.functions;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
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

 vendor/laravel/framework/src/Illuminate/Support/helpers.php

*/

public class str_slug extends FunctionBaseRegular {

    public static str_slug f = new str_slug();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "title")
    @ConvertedParameter(index = 1, name = "separator")
    @ConvertedParameter(index = 2, name = "language")
    public Object call(RuntimeEnv env, Object... args) {
        Object title = assignParameter(args, 0, false);
        Object separator = assignParameter(args, 1, true);
        if (null == separator) {
            separator = "-";
        }
        Object language = assignParameter(args, 2, true);
        if (null == language) {
            language = "en";
        }
        return ZVal.assign(Str.runtimeStaticObject.slug(env, title, separator, language));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                .setFile("/vendor/laravel/framework/src/Illuminate/Support/helpers.php");
    }
}
