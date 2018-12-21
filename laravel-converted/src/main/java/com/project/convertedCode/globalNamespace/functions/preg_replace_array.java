package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/helpers.php

*/

public class preg_replace_array extends FunctionBaseRegular {

    public static preg_replace_array f = new preg_replace_array();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pattern")
    @ConvertedParameter(index = 1, name = "replacements", typeHint = "array")
    @ConvertedParameter(index = 2, name = "subject")
    public Object call(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Support/helpers.php");
        Object pattern = assignParameter(args, 0, false);
        ReferenceContainer replacements =
                new BasicReferenceContainer(assignParameter(args, 1, false));
        Object subject = assignParameter(args, 2, false);
        return ZVal.assign(
                NamespaceGlobal.preg_replace_callback
                        .env(env)
                        .call(
                                pattern,
                                new Closure(env, runtimeConverterFunctionClassConstants, "", this) {
                                    @Override
                                    @ConvertedMethod
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        ReferenceContainer replacements =
                                                new BasicReferenceContainer(null);
                                        Object value = null;
                                        Object key = null;
                                        replacements =
                                                this.contextReferences.getReferenceContainer(
                                                        "replacements");
                                        for (ZPair zpairResult601 :
                                                ZVal.getIterable(
                                                        replacements.getObject(), env, false)) {
                                            key = ZVal.assign(zpairResult601.getKey());
                                            value = ZVal.assign(zpairResult601.getValue());
                                            return ZVal.assign(
                                                    function_array_shift
                                                            .f
                                                            .env(env)
                                                            .call(replacements.getObject())
                                                            .value());
                                        }

                                        return null;
                                    }
                                }.useRef("replacements", replacements),
                                subject)
                        .value());
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                .setFile("/vendor/laravel/framework/src/Illuminate/Support/helpers.php");
    }
}
