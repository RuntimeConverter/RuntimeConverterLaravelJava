package com.project.convertedCode.globalNamespace.functions;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Htmlable;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/helpers.php

*/

public class e extends FunctionBaseRegular {

    public static e f = new e();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(
        index = 1,
        name = "doubleEncode",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object doubleEncode = assignParameter(args, 1, true);
        if (null == doubleEncode) {
            doubleEncode = true;
        }
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        value, Htmlable.class, "Illuminate\\Contracts\\Support\\Htmlable"))) {
            return ZVal.assign(env.callMethod(value, "toHtml", e.class));
        }

        return ZVal.assign(
                NamespaceGlobal.htmlspecialchars
                        .env(env)
                        .call(value, 3, "UTF-8", doubleEncode)
                        .value());
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                .setFile("/vendor/laravel/framework/src/Illuminate/Support/helpers.php");
    }
}
