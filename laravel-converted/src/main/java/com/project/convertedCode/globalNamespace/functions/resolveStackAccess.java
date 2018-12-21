package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
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

 vendor/nikic/php-parser/grammar/rebuildParsers.php

*/

public class resolveStackAccess extends FunctionBaseRegular {

    public static resolveStackAccess f = new resolveStackAccess();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    public Object call(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        code =
                function_preg_replace
                        .f
                        .env(env)
                        .call("/\\$\\d+/", "$this->semStack[$0]", code)
                        .value();
        code = function_preg_replace.f.env(env).call("/#(\\d+)/", "$$1", code).value();
        return ZVal.assign(code);
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/nikic/php-parser/grammar")
                .setFile("/vendor/nikic/php-parser/grammar/rebuildParsers.php");
    }
}
