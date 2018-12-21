package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/paragonie/random_compat/lib/random.php

*/

public class random_bytes extends FunctionBaseRegular {

    public static random_bytes f = new random_bytes();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "length")
    public Object call(RuntimeEnv env, Object... args) {
        Object length = assignParameter(args, 0, false);
        length = null;
        throw ZVal.getException(
                env, new PHPException(env, "There is no suitable CSPRNG installed on your system"));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/paragonie/random_compat/lib")
                .setFile("/vendor/paragonie/random_compat/lib/random.php");
    }
}
