package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_parse_str;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.runtimeconverter.runtime.functions.FunctionBaseExtended;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/polyfill-mbstring/bootstrap.php

*/

public class mb_parse_str extends FunctionBaseExtended {

    public static mb_parse_str f = new mb_parse_str();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "s")
    @ConvertedParameter(index = 1, name = "result", defaultValue = "", defaultValueType = "array")
    public Object call(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        Object s = assignParameter(args, 0, false);
        ReferenceContainer result = assignParameterRef(runtimePassByReferenceArgs, args, 1, true);
        if (null == result.getObject()) {
            result.setObject(ZVal.newArray());
        }
        function_parse_str
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(1, result))
                .call(s, result.getObject());
        return null;
    }

    public Object mb_parse_str(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/symfony/polyfill-mbstring")
                .setFile("/vendor/symfony/polyfill-mbstring/bootstrap.php");
    }
}
