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
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/DependencyInjection/TranslationDumperPass.php

*/

public class TranslationDumperPass extends RuntimeClassBase {

    public Object writerServiceId = null;

    public Object dumperTag = null;

    public TranslationDumperPass(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TranslationDumperPass.class) {
            this.__construct(env, args);
        }
    }

    public TranslationDumperPass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "writerServiceId", typeHint = "string")
    @ConvertedParameter(index = 1, name = "dumperTag", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object writerServiceId = assignParameter(args, 0, true);
        if (null == writerServiceId) {
            writerServiceId = "translation.writer";
        }
        Object dumperTag = assignParameter(args, 1, true);
        if (null == dumperTag) {
            dumperTag = "translation.dumper";
        }
        this.writerServiceId = writerServiceId;
        this.dumperTag = dumperTag;
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
                        TranslationDumperPass.class,
                        this.writerServiceId))) {
            return null;
        }

        definition =
                env.callMethod(
                        container,
                        "getDefinition",
                        TranslationDumperPass.class,
                        this.writerServiceId);
        for (ZPair zpairResult2111 :
                ZVal.getIterable(
                        env.callMethod(
                                container,
                                "findTaggedServiceIds",
                                TranslationDumperPass.class,
                                this.dumperTag,
                                true),
                        env,
                        false)) {
            id = ZVal.assign(zpairResult2111.getKey());
            attributes.setObject(ZVal.assign(zpairResult2111.getValue()));
            env.callMethod(
                    definition,
                    "addMethodCall",
                    TranslationDumperPass.class,
                    "addDumper",
                    ZVal.newArray(
                            new ZPair(0, attributes.arrayGet(env, 0, "alias")),
                            new ZPair(
                                    1,
                                    env.createNew(ZVal.resolveClassAlias(env, "Reference"), id))));
        }

        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\DependencyInjection\\TranslationDumperPass";

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
                            "Symfony\\Component\\Translation\\DependencyInjection\\TranslationDumperPass")
                    .setLookup(
                            TranslationDumperPass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("dumperTag", "writerServiceId")
                    .setFilename(
                            "vendor/symfony/translation/DependencyInjection/TranslationDumperPass.php")
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
