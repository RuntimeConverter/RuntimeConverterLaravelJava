package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/helpers.php

*/

public class class_basename extends FunctionBaseRegular {

    public static class_basename f = new class_basename();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    public Object call(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        _pClass =
                ZVal.assign(
                        function_is_object.f.env(env).call(_pClass).getBool()
                                ? function_get_class.f.env(env).call(_pClass).value()
                                : _pClass);
        return ZVal.assign(
                NamespaceGlobal.basename
                        .env(env)
                        .call(function_str_replace.f.env(env).call("\\", "/", _pClass).value())
                        .value());
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                .setFile("/vendor/laravel/framework/src/Illuminate/Support/helpers.php");
    }
}
