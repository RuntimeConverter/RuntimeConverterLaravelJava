package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.NormalizerFormatter;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Formatter/ScalarFormatter.php

*/

public class ScalarFormatter extends NormalizerFormatter {

    public ScalarFormatter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ScalarFormatter.class) {
            this.__construct(env, args);
        }
    }

    public ScalarFormatter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object format(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object value = null;
        Object key = null;
        for (ZPair zpairResult761 : ZVal.getIterable(record.getObject(), env, false)) {
            key = ZVal.assign(zpairResult761.getKey());
            value = ZVal.assign(zpairResult761.getValue());
            record.arrayAccess(env, key).set(this.normalizeValue(env, value));
        }

        return ZVal.assign(record.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object normalizeValue(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object normalized = null;
        normalized = env.callMethod(this, "normalize", ScalarFormatter.class, value);
        if (ZVal.toBool(function_is_array.f.env(env).call(normalized).value())
                || ZVal.toBool(function_is_object.f.env(env).call(normalized).value())) {
            return ZVal.assign(
                    env.callMethod(this, "toJson", ScalarFormatter.class, normalized, true));
        }

        return ZVal.assign(normalized);
    }

    public static final Object CONST_class = "Monolog\\Formatter\\ScalarFormatter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends NormalizerFormatter.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Formatter\\ScalarFormatter")
                    .setLookup(
                            ScalarFormatter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("dateFormat")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Formatter/ScalarFormatter.php")
                    .addInterface("Monolog\\Formatter\\FormatterInterface")
                    .addExtendsClass("Monolog\\Formatter\\NormalizerFormatter")
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
