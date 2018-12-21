package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.namespaces.MimeType.classes;

import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.namespaces.MimeType.classes.MimeTypeExtensionGuesser;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.namespaces.MimeType.classes.ExtensionGuesserInterface;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/File/MimeType/ExtensionGuesser.php

*/

public class ExtensionGuesser extends RuntimeClassBase implements ExtensionGuesserInterface {

    public Object guessers = ZVal.newArray();

    public ExtensionGuesser(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ExtensionGuesser.class) {
            this.__construct(env, args);
        }
    }

    public ExtensionGuesser(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    private Object __construct(RuntimeEnv env, Object... args) {
        this.register(env, new MimeTypeExtensionGuesser(env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "guesser",
        typeHint = "Symfony\\Component\\HttpFoundation\\File\\MimeType\\ExtensionGuesserInterface"
    )
    public Object register(RuntimeEnv env, Object... args) {
        Object guesser = assignParameter(args, 0, false);
        function_array_unshift.f.env(env).call(this.guessers, guesser);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mimeType")
    public Object guess(RuntimeEnv env, Object... args) {
        Object mimeType = assignParameter(args, 0, false);
        Object extension = null;
        Object guesser = null;
        for (ZPair zpairResult1845 : ZVal.getIterable(this.guessers, env, true)) {
            guesser = ZVal.assign(zpairResult1845.getValue());
            if (ZVal.strictNotEqualityCheck(
                    ZVal.getNull(),
                    "!==",
                    extension =
                            env.callMethod(guesser, "guess", ExtensionGuesser.class, mimeType))) {
                return ZVal.assign(extension);
            }
        }

        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\File\\MimeType\\ExtensionGuesser";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object getInstance(RuntimeEnv env, Object... args) {
            if (ZVal.strictEqualityCheck(
                    ZVal.getNull(),
                    "===",
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .HttpFoundation
                                            .namespaces
                                            .File
                                            .namespaces
                                            .MimeType
                                            .classes
                                            .ExtensionGuesser
                                            .RequestStaticProperties
                                            .class)
                            .instance)) {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .HttpFoundation
                                                .namespaces
                                                .File
                                                .namespaces
                                                .MimeType
                                                .classes
                                                .ExtensionGuesser
                                                .RequestStaticProperties
                                                .class)
                                .instance =
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Symfony
                                .namespaces
                                .Component
                                .namespaces
                                .HttpFoundation
                                .namespaces
                                .File
                                .namespaces
                                .MimeType
                                .classes
                                .ExtensionGuesser(env);
            }

            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .HttpFoundation
                                            .namespaces
                                            .File
                                            .namespaces
                                            .MimeType
                                            .classes
                                            .ExtensionGuesser
                                            .RequestStaticProperties
                                            .class)
                            .instance);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object instance = ZVal.getNull();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpFoundation\\File\\MimeType\\ExtensionGuesser")
                    .setLookup(
                            ExtensionGuesser.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("guessers")
                    .setStaticPropertyNames("instance")
                    .setFilename(
                            "vendor/symfony/http-foundation/File/MimeType/ExtensionGuesser.php")
                    .addInterface(
                            "Symfony\\Component\\HttpFoundation\\File\\MimeType\\ExtensionGuesserInterface")
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
