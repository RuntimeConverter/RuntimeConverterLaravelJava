package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.namespaces.StringManipulation.namespaces.Pass.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Generator/StringManipulation/Pass/RemoveBuiltinMethodsThatAreFinalPass.php

*/

public class RemoveBuiltinMethodsThatAreFinalPass extends RuntimeClassBase {

    public Object methods =
            ZVal.newArray(new ZPair("__wakeup", "/public function __wakeup\\(\\)\\s+\\{.*?\\}/sm"));

    public RemoveBuiltinMethodsThatAreFinalPass(RuntimeEnv env, Object... args) {
        super(env);
    }

    public RemoveBuiltinMethodsThatAreFinalPass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    @ConvertedParameter(
        index = 1,
        name = "config",
        typeHint = "Mockery\\Generator\\MockConfiguration"
    )
    public Object apply(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        Object config = assignParameter(args, 1, false);
        Object method = null;
        Object target = null;
        target =
                env.callMethod(
                        config, "getTargetClass", RemoveBuiltinMethodsThatAreFinalPass.class);
        if (!ZVal.isTrue(target)) {
            return ZVal.assign(code);
        }

        for (ZPair zpairResult719 :
                ZVal.getIterable(
                        env.callMethod(
                                target, "getMethods", RemoveBuiltinMethodsThatAreFinalPass.class),
                        env,
                        true)) {
            method = ZVal.assign(zpairResult719.getValue());
            if (ZVal.toBool(
                            env.callMethod(
                                    method, "isFinal", RemoveBuiltinMethodsThatAreFinalPass.class))
                    && ZVal.toBool(
                            arrayActionR(
                                    ArrayAction.ISSET,
                                    new ReferenceClassProperty(this, "methods", env),
                                    env,
                                    env.callMethod(
                                            method,
                                            "getName",
                                            RemoveBuiltinMethodsThatAreFinalPass.class)))) {
                code =
                        function_preg_replace
                                .f
                                .env(env)
                                .call(
                                        new ReferenceClassProperty(this, "methods", env)
                                                .arrayGet(
                                                        env,
                                                        env.callMethod(
                                                                method,
                                                                "getName",
                                                                RemoveBuiltinMethodsThatAreFinalPass
                                                                        .class)),
                                        "",
                                        code)
                                .value();
            }
        }

        return ZVal.assign(code);
    }

    public static final Object CONST_class =
            "Mockery\\Generator\\StringManipulation\\Pass\\RemoveBuiltinMethodsThatAreFinalPass";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Mockery\\Generator\\StringManipulation\\Pass\\RemoveBuiltinMethodsThatAreFinalPass")
                    .setLookup(
                            RemoveBuiltinMethodsThatAreFinalPass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("methods")
                    .setFilename(
                            "vendor/mockery/mockery/library/Mockery/Generator/StringManipulation/Pass/RemoveBuiltinMethodsThatAreFinalPass.php")
                    .get();

    @Override
    public ReflectionClassData getRuntimeConverterReflectionData() {
        return runtimeConverterReflectionData;
    }

    @Override
    public Object converterRuntimeCallExtended(
            RuntimeEnv env,
            String method,
            Class<?> caller,
            PassByReferenceArgs passByReferenceArgs,
            Object... args) {
        return RuntimeClassBase.converterRuntimeCallExtendedWithDataStatic(
                this,
                runtimeConverterReflectionData,
                env,
                method,
                caller,
                passByReferenceArgs,
                args);
    }
}
