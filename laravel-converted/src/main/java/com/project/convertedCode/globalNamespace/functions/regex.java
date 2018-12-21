package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/grammar/rebuildParsers.php

*/

public class regex extends FunctionBaseRegular {

    public static regex f = new regex();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "regex")
    public Object call(RuntimeEnv env, Object... args) {
        Object regex = assignParameter(args, 0, false);
        return ZVal.assign(
                "~"
                        + toStringR(function_constant.get(env, "LIB"), env)
                        + "(?:"
                        + toStringR(
                                function_str_replace.f.env(env).call("~", "\\~", regex).value(),
                                env)
                        + ")~");
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/nikic/php-parser/grammar")
                .setFile("/vendor/nikic/php-parser/grammar/rebuildParsers.php");
    }
}
