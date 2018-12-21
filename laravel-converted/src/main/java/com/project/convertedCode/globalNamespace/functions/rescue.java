package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.project.convertedCode.globalNamespace.functions.report;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.functions.value;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/helpers.php

*/

public class rescue extends FunctionBaseRegular {

    public static rescue f = new rescue();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "callable")
    @ConvertedParameter(
        index = 1,
        name = "rescue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        Object rescue = assignParameter(args, 1, true);
        if (null == rescue) {
            rescue = ZVal.getNull();
        }
        Object e = null;
        try {
            return ZVal.assign(
                    env.callFunctionDynamic(callback, new RuntimeArgsWithReferences()).value());
        } catch (ConvertedException convertedException44) {
            if (convertedException44.instanceOf(Throwable.class, "Throwable")) {
                e = convertedException44.getObject();
                report.f.env(env).call(e);
                return ZVal.assign(value.f.env(env).call(rescue).value());
            } else {
                throw convertedException44;
            }
        }
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Foundation")
                .setFile("/vendor/laravel/framework/src/Illuminate/Foundation/helpers.php");
    }
}
