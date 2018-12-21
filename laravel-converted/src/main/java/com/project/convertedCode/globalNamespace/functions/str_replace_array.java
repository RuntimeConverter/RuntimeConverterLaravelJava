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

public class str_replace_array extends FunctionBaseRegular {

    public static str_replace_array f = new str_replace_array();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "search")
    @ConvertedParameter(index = 1, name = "replace", typeHint = "array")
    @ConvertedParameter(index = 2, name = "subject")
    public Object call(RuntimeEnv env, Object... args) {
        Object search = assignParameter(args, 0, false);
        Object replace = assignParameter(args, 1, false);
        Object subject = assignParameter(args, 2, false);
        return ZVal.assign(Str.runtimeStaticObject.replaceArray(env, search, replace, subject));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                .setFile("/vendor/laravel/framework/src/Illuminate/Support/helpers.php");
    }
}
