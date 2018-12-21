package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Processor.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Processor/MercurialProcessor.php

*/

public class MercurialProcessor extends RuntimeClassBase {

    public Object level = null;

    public MercurialProcessor(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MercurialProcessor.class) {
            this.__construct(env, args);
        }
    }

    public MercurialProcessor(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, true);
        if (null == level) {
            level = Logger.CONST_DEBUG;
        }
        this.level = Logger.runtimeStaticObject.toMonologLevel(env, level);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object __invoke(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (ZVal.isLessThan(record.arrayGet(env, "level"), '<', this.level)) {
            return ZVal.assign(record.getObject());
        }

        record.arrayAccess(env, "extra", "hg").set(runtimeStaticObject.getMercurialInfo(env));
        return ZVal.assign(record.getObject());
    }

    public static final Object CONST_class = "Monolog\\Processor\\MercurialProcessor";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        private Object getMercurialInfo(RuntimeEnv env, Object... args) {
            ReferenceContainer result = new BasicReferenceContainer(null);
            if (ZVal.isTrue(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Monolog
                                            .namespaces
                                            .Processor
                                            .classes
                                            .MercurialProcessor
                                            .RequestStaticProperties
                                            .class)
                            .cache)) {
                return ZVal.assign(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Monolog
                                                .namespaces
                                                .Processor
                                                .classes
                                                .MercurialProcessor
                                                .RequestStaticProperties
                                                .class)
                                .cache);
            }

            result.setObject(
                    function_explode
                            .f
                            .env(env)
                            .call(
                                    " ",
                                    function_trim
                                            .f
                                            .env(env)
                                            .call(NamespaceGlobal.shell_exec.call(env, "hg id -nb"))
                                            .value())
                            .value());
            if (ZVal.isGreaterThanOrEqualTo(
                    function_count.f.env(env).call(result.getObject()).value(), ">=", 3)) {
                return ZVal.assign(
                        env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Monolog
                                                        .namespaces
                                                        .Processor
                                                        .classes
                                                        .MercurialProcessor
                                                        .RequestStaticProperties
                                                        .class)
                                        .cache =
                                ZVal.newArray(
                                        new ZPair("branch", result.arrayGet(env, 1)),
                                        new ZPair("revision", result.arrayGet(env, 2))));
            }

            return ZVal.assign(
                    env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Monolog
                                                    .namespaces
                                                    .Processor
                                                    .classes
                                                    .MercurialProcessor
                                                    .RequestStaticProperties
                                                    .class)
                                    .cache =
                            ZVal.newArray());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object cache = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Processor\\MercurialProcessor")
                    .setLookup(
                            MercurialProcessor.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("level")
                    .setStaticPropertyNames("cache")
                    .setFilename(
                            "vendor/monolog/monolog/src/Monolog/Processor/MercurialProcessor.php")
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
