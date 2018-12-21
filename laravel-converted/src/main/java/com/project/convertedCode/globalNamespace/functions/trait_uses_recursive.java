package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_uses;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
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

public class trait_uses_recursive extends FunctionBaseRegular {

    public static trait_uses_recursive f = new trait_uses_recursive();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "trait")
    public Object call(RuntimeEnv env, Object... args) {
        Object trait = assignParameter(args, 0, false);
        Object traits = null;
        traits = function_class_uses.f.env(env).call(trait).value();
        for (ZPair zpairResult602 : ZVal.getIterable(traits, env, true)) {
            trait = ZVal.assign(zpairResult602.getValue());
            traits =
                    ZAssignment.add(
                            "+=",
                            traits,
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .functions
                                    .trait_uses_recursive
                                    .f
                                    .env(env)
                                    .call(trait)
                                    .value());
        }

        return ZVal.assign(traits);
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                .setFile("/vendor/laravel/framework/src/Illuminate/Support/helpers.php");
    }
}
