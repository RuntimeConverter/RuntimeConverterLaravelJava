package com.project.convertedCode.globalNamespace.namespaces.Psy.functions;

import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/functions.php

*/

public class sh extends FunctionBaseRegular {

    public static sh f = new sh();

    @ConvertedMethod
    public Object call(RuntimeEnv env, Object... args) {
        return "extract(\\Psy\\debug(get_defined_vars(), isset($this) ? $this : @get_called_class()));";
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/psy/psysh/src")
                .setFile("/vendor/psy/psysh/src/functions.php");
    }
}
