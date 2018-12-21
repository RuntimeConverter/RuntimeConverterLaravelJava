package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Processor.classes;

import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_scalar;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Processor/PsrLogMessageProcessor.php

*/

public class PsrLogMessageProcessor extends RuntimeClassBase {

    public PsrLogMessageProcessor(RuntimeEnv env, Object... args) {
        super(env);
    }

    public PsrLogMessageProcessor(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object __invoke(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object val = null;
        ReferenceContainer replacements = new BasicReferenceContainer(null);
        Object key = null;
        if (ZVal.strictEqualityCheck(
                false,
                "===",
                function_strpos.f.env(env).call(record.arrayGet(env, "message"), "{").value())) {
            return ZVal.assign(record.getObject());
        }

        replacements.setObject(ZVal.newArray());
        for (ZPair zpairResult817 : ZVal.getIterable(record.arrayGet(env, "context"), env, false)) {
            key = ZVal.assign(zpairResult817.getKey());
            val = ZVal.assign(zpairResult817.getValue());
            if (ZVal.toBool(
                            ZVal.toBool(function_is_null.f.env(env).call(val).value())
                                    || ZVal.toBool(function_is_scalar.f.env(env).call(val).value()))
                    || ZVal.toBool(
                            ZVal.toBool(function_is_object.f.env(env).call(val).value())
                                    && ZVal.toBool(
                                            function_method_exists
                                                    .f
                                                    .env(env)
                                                    .call(val, "__toString")
                                                    .value()))) {
                replacements.arrayAccess(env, "{" + toStringR(key, env) + "}").set(val);

            } else if (function_is_object.f.env(env).call(val).getBool()) {
                replacements
                        .arrayAccess(env, "{" + toStringR(key, env) + "}")
                        .set(
                                "[object "
                                        + toStringR(
                                                function_get_class.f.env(env).call(val).value(),
                                                env)
                                        + "]");

            } else {
                replacements
                        .arrayAccess(env, "{" + toStringR(key, env) + "}")
                        .set(
                                "["
                                        + toStringR(
                                                NamespaceGlobal.gettype.env(env).call(val).value(),
                                                env)
                                        + "]");
            }
        }

        record.arrayAccess(env, "message")
                .set(
                        NamespaceGlobal.strtr
                                .env(env)
                                .call(record.arrayGet(env, "message"), replacements.getObject())
                                .value());
        return ZVal.assign(record.getObject());
    }

    public static final Object CONST_class = "Monolog\\Processor\\PsrLogMessageProcessor";

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
                    .setName("Monolog\\Processor\\PsrLogMessageProcessor")
                    .setLookup(
                            PsrLogMessageProcessor.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/monolog/monolog/src/Monolog/Processor/PsrLogMessageProcessor.php")
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
