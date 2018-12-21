package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.DependencyInjection.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/DependencyInjection/TranslationExtractorPass.php

*/

public class TranslationExtractorPass extends RuntimeClassBase {

    public Object extractorServiceId = null;

    public Object extractorTag = null;

    public TranslationExtractorPass(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TranslationExtractorPass.class) {
            this.__construct(env, args);
        }
    }

    public TranslationExtractorPass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "extractorServiceId", typeHint = "string")
    @ConvertedParameter(index = 1, name = "extractorTag", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object extractorServiceId = assignParameter(args, 0, true);
        if (null == extractorServiceId) {
            extractorServiceId = "translation.extractor";
        }
        Object extractorTag = assignParameter(args, 1, true);
        if (null == extractorTag) {
            extractorTag = "translation.extractor";
        }
        this.extractorServiceId = extractorServiceId;
        this.extractorTag = extractorTag;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Symfony\\Component\\DependencyInjection\\ContainerBuilder"
    )
    public Object process(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        Object definition = null;
        ReferenceContainer attributes = new BasicReferenceContainer(null);
        Object id = null;
        if (!ZVal.isTrue(
                env.callMethod(
                        container,
                        "hasDefinition",
                        TranslationExtractorPass.class,
                        this.extractorServiceId))) {
            return null;
        }

        definition =
                env.callMethod(
                        container,
                        "getDefinition",
                        TranslationExtractorPass.class,
                        this.extractorServiceId);
        for (ZPair zpairResult2112 :
                ZVal.getIterable(
                        env.callMethod(
                                container,
                                "findTaggedServiceIds",
                                TranslationExtractorPass.class,
                                this.extractorTag,
                                true),
                        env,
                        false)) {
            id = ZVal.assign(zpairResult2112.getKey());
            attributes.setObject(ZVal.assign(zpairResult2112.getValue()));
            if (!arrayActionR(ArrayAction.ISSET, attributes, env, 0, "alias")) {
                throw ZVal.getException(
                        env,
                        env.createNew(
                                ZVal.resolveClassAlias(env, "RuntimeException"),
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "The alias for the tag \"translation.extractor\" of service \"%s\" must be set.",
                                                id)
                                        .value()));
            }

            env.callMethod(
                    definition,
                    "addMethodCall",
                    TranslationExtractorPass.class,
                    "addExtractor",
                    ZVal.newArray(
                            new ZPair(0, attributes.arrayGet(env, 0, "alias")),
                            new ZPair(
                                    1,
                                    env.createNew(ZVal.resolveClassAlias(env, "Reference"), id))));
        }

        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\DependencyInjection\\TranslationExtractorPass";

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
                            "Symfony\\Component\\Translation\\DependencyInjection\\TranslationExtractorPass")
                    .setLookup(
                            TranslationExtractorPass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("extractorServiceId", "extractorTag")
                    .setFilename(
                            "vendor/symfony/translation/DependencyInjection/TranslationExtractorPass.php")
                    .addInterface("CompilerPassInterface")
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
