package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_num_args;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.classes.VarDumper;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;
import static com.runtimeconverter.runtime.ZVal.assignParameterVarArgs;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Resources/functions/dump.php

*/

public class dump extends FunctionBaseRegular {

    public static dump f = new dump();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "var")
    @ConvertedParameter(index = 1, name = "moreVars")
    public Object call(RuntimeEnv env, Object... args) {
        Object var = assignParameter(args, 0, false);
        Object moreVars = assignParameterVarArgs(args, 1);
        VarDumper.runtimeStaticObject.dump(env, var);
        for (ZPair zpairResult2228 : ZVal.getIterable(moreVars, env, true)) {
            var = ZVal.assign(zpairResult2228.getValue());
            VarDumper.runtimeStaticObject.dump(env, var);
        }

        if (ZVal.isLessThan(
                1,
                '<',
                function_func_num_args
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call()
                        .value())) {
            return ZVal.assign(
                    function_func_get_args
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call()
                            .value());
        }

        return ZVal.assign(var);
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/symfony/var-dumper/Resources/functions")
                .setFile("/vendor/symfony/var-dumper/Resources/functions/dump.php");
    }
}
