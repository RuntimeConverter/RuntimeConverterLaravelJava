package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.functions.magicSplit;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/grammar/rebuildParsers.php

*/

public class resolveNodes extends FunctionBaseRegular {

    public static resolveNodes f = new resolveNodes();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    public Object call(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/nikic/php-parser/grammar")
                        .setFile("/vendor/nikic/php-parser/grammar/rebuildParsers.php");
        Object code = assignParameter(args, 0, false);
        return ZVal.assign(
                NamespaceGlobal.preg_replace_callback
                        .env(env)
                        .call(
                                "~\\b(?<name>[A-Z][a-zA-Z_\\\\]++)\\s*"
                                        + toStringR(function_constant.get(env, "PARAMS"), env)
                                        + "~",
                                new Closure(env, runtimeConverterFunctionClassConstants, "", this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "matches")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        ReferenceContainer matches =
                                                new BasicReferenceContainer(
                                                        assignParameter(args, 0, false));
                                        Object paramCode = null;
                                        Object param = null;
                                        Object params = null;
                                        matches.arrayAccess(env, "params")
                                                .set(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .functions
                                                                .resolveNodes
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        matches.arrayGet(
                                                                                env, "params"))
                                                                .value());
                                        params =
                                                magicSplit
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "(?:"
                                                                        + toStringR(
                                                                                function_constant
                                                                                        .get(
                                                                                                env,
                                                                                                "PARAMS"),
                                                                                env)
                                                                        + "|"
                                                                        + toStringR(
                                                                                function_constant
                                                                                        .get(
                                                                                                env,
                                                                                                "ARGS"),
                                                                                env)
                                                                        + ")(*SKIP)(*FAIL)|,",
                                                                matches.arrayGet(env, "params"))
                                                        .value();
                                        paramCode = "";
                                        for (ZPair zpairResult838 :
                                                ZVal.getIterable(params, env, true)) {
                                            param = ZVal.assign(zpairResult838.getValue());
                                            paramCode =
                                                    toStringR(paramCode, env)
                                                            + toStringR(param, env)
                                                            + ", ";
                                        }

                                        return ZVal.assign(
                                                "new "
                                                        + toStringR(
                                                                matches.arrayGet(env, "name"), env)
                                                        + "("
                                                        + toStringR(paramCode, env)
                                                        + "attributes())");
                                    }
                                },
                                code)
                        .value());
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/nikic/php-parser/grammar")
                .setFile("/vendor/nikic/php-parser/grammar/rebuildParsers.php");
    }
}
