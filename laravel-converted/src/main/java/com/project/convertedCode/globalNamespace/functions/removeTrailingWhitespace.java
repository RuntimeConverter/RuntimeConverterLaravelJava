package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/grammar/rebuildParsers.php

*/

public class removeTrailingWhitespace extends FunctionBaseRegular {

    public static removeTrailingWhitespace f = new removeTrailingWhitespace();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    public Object call(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        Object lines = null;
        lines = function_explode.f.env(env).call("\n", code).value();
        lines = function_array_map.f.env(env).call("rtrim", lines).value();
        return ZVal.assign(NamespaceGlobal.implode.env(env).call("\n", lines).value());
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/nikic/php-parser/grammar")
                .setFile("/vendor/nikic/php-parser/grammar/rebuildParsers.php");
    }
}
