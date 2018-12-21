package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.functions.filled;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/helpers.php

*/

public class transform extends FunctionBaseRegular {

    public static transform f = new transform();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "callable")
    @ConvertedParameter(
        index = 2,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        ReferenceContainer value = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object callback = assignParameter(args, 1, false);
        Object _pDefault = assignParameter(args, 2, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        if (filled.f.env(env).call(value.getObject()).getBool()) {
            return ZVal.assign(
                    env.callFunctionDynamic(
                                    callback,
                                    new RuntimeArgsWithReferences().add(0, value),
                                    value.getObject())
                            .value());
        }

        if (function_is_callable.f.env(env).call(_pDefault).getBool()) {
            return ZVal.assign(
                    env.callFunctionDynamic(
                                    _pDefault,
                                    new RuntimeArgsWithReferences().add(0, value),
                                    value.getObject())
                            .value());
        }

        return ZVal.assign(_pDefault);
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                .setFile("/vendor/laravel/framework/src/Illuminate/Support/helpers.php");
    }
}
