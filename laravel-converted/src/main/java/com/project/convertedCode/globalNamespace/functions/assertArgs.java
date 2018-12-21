package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/grammar/rebuildParsers.php

*/

public class assertArgs extends FunctionBaseRegular {

    public static assertArgs f = new assertArgs();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "num")
    @ConvertedParameter(index = 1, name = "args")
    @ConvertedParameter(index = 2, name = "name")
    public Object call(RuntimeEnv env, Object... args) {
        Object num = assignParameter(args, 0, false);
        Object ___args = assignParameter(args, 1, false);
        Object name = assignParameter(args, 2, false);
        if (ZVal.notEqualityCheck(num, function_count.f.env(env).call(___args).value())) {
            env.exit("Wrong argument count for " + toStringR(name, env) + "().");
        }

        return null;
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/nikic/php-parser/grammar")
                .setFile("/vendor/nikic/php-parser/grammar/rebuildParsers.php");
    }
}
