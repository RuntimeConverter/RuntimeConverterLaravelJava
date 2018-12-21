package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.functions.data_set;
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

 vendor/laravel/framework/src/Illuminate/Support/helpers.php

*/

public class data_fill extends FunctionBaseExtended {

    public static data_fill f = new data_fill();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "target")
    @ConvertedParameter(index = 1, name = "key")
    @ConvertedParameter(index = 2, name = "value")
    public Object call(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer target = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        Object key = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, false);
        return ZVal.assign(
                data_set.f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(0, target))
                        .call(target.getObject(), key, value, false)
                        .value());
    }

    public Object data_fill(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                .setFile("/vendor/laravel/framework/src/Illuminate/Support/helpers.php");
    }
}
