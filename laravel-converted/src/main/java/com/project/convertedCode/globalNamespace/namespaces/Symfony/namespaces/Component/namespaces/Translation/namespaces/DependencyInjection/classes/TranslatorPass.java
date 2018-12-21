package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.DependencyInjection.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/DependencyInjection/TranslatorPass.php

*/

public class TranslatorPass extends RuntimeClassBase {

    public Object translatorServiceId = null;

    public Object readerServiceId = null;

    public Object loaderTag = null;

    public Object debugCommandServiceId = null;

    public Object updateCommandServiceId = null;

    public TranslatorPass(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TranslatorPass.class) {
            this.__construct(env, args);
        }
    }

    public TranslatorPass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "translatorServiceId", typeHint = "string")
    @ConvertedParameter(index = 1, name = "readerServiceId", typeHint = "string")
    @ConvertedParameter(index = 2, name = "loaderTag", typeHint = "string")
    @ConvertedParameter(index = 3, name = "debugCommandServiceId", typeHint = "string")
    @ConvertedParameter(index = 4, name = "updateCommandServiceId", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object translatorServiceId = assignParameter(args, 0, true);
        if (null == translatorServiceId) {
            translatorServiceId = "translator.default";
        }
        Object readerServiceId = assignParameter(args, 1, true);
        if (null == readerServiceId) {
            readerServiceId = "translation.reader";
        }
        Object loaderTag = assignParameter(args, 2, true);
        if (null == loaderTag) {
            loaderTag = "translation.loader";
        }
        Object debugCommandServiceId = assignParameter(args, 3, true);
        if (null == debugCommandServiceId) {
            debugCommandServiceId = "console.command.translation_debug";
        }
        Object updateCommandServiceId = assignParameter(args, 4, true);
        if (null == updateCommandServiceId) {
            updateCommandServiceId = "console.command.translation_update";
        }
        this.translatorServiceId = translatorServiceId;
        this.readerServiceId = readerServiceId;
        this.loaderTag = loaderTag;
        this.debugCommandServiceId = debugCommandServiceId;
        this.updateCommandServiceId = updateCommandServiceId;
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
        ReferenceContainer loaders = new BasicReferenceContainer(null);
        Object formats = null;
        Object format = null;
        ReferenceContainer attributes = new BasicReferenceContainer(null);
        Object definition = null;
        Object id = null;
        ReferenceContainer loaderRefs = new BasicReferenceContainer(null);
        if (!ZVal.isTrue(
                env.callMethod(
                        container,
                        "hasDefinition",
                        TranslatorPass.class,
                        this.translatorServiceId))) {
            return null;
        }

        loaders.setObject(ZVal.newArray());
        loaderRefs.setObject(ZVal.newArray());
        for (ZPair zpairResult2113 :
                ZVal.getIterable(
                        env.callMethod(
                                container,
                                "findTaggedServiceIds",
                                TranslatorPass.class,
                                this.loaderTag,
                                true),
                        env,
                        false)) {
            id = ZVal.assign(zpairResult2113.getKey());
            attributes.setObject(ZVal.assign(zpairResult2113.getValue()));
            loaderRefs
                    .arrayAccess(env, id)
                    .set(env.createNew(ZVal.resolveClassAlias(env, "Reference"), id));
            loaders.arrayAppend(env, id).set(attributes.arrayGet(env, 0, "alias"));
            if (arrayActionR(ArrayAction.ISSET, attributes, env, 0, "legacy-alias")) {
                loaders.arrayAppend(env, id).set(attributes.arrayGet(env, 0, "legacy-alias"));
            }
        }

        if (ZVal.isTrue(
                env.callMethod(
                        container, "hasDefinition", TranslatorPass.class, this.readerServiceId))) {
            definition =
                    env.callMethod(
                            container, "getDefinition", TranslatorPass.class, this.readerServiceId);
            for (ZPair zpairResult2114 : ZVal.getIterable(loaders.getObject(), env, false)) {
                id = ZVal.assign(zpairResult2114.getKey());
                formats = ZVal.assign(zpairResult2114.getValue());
                for (ZPair zpairResult2115 : ZVal.getIterable(formats, env, true)) {
                    format = ZVal.assign(zpairResult2115.getValue());
                    env.callMethod(
                            definition,
                            "addMethodCall",
                            TranslatorPass.class,
                            "addLoader",
                            ZVal.newArray(
                                    new ZPair(0, format),
                                    new ZPair(1, loaderRefs.arrayGet(env, id))));
                }
            }
        }

        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                container,
                                "findDefinition",
                                TranslatorPass.class,
                                this.translatorServiceId),
                        "replaceArgument",
                        TranslatorPass.class,
                        0,
                        StaticMethodUtils.getStaticBaseClass(
                                        ZVal.resolveClassAlias(env, "ServiceLocatorTagPass"), env)
                                .callUnknownStaticMethod(
                                        env,
                                        "register",
                                        new RuntimeArgsWithReferences(),
                                        container,
                                        loaderRefs.getObject())),
                "replaceArgument",
                TranslatorPass.class,
                3,
                loaders.getObject());
        if (!ZVal.isTrue(
                env.callMethod(
                        container, "hasParameter", TranslatorPass.class, "twig.default_path"))) {
            return null;
        }

        if (ZVal.isTrue(
                env.callMethod(
                        container,
                        "hasDefinition",
                        TranslatorPass.class,
                        this.debugCommandServiceId))) {
            env.callMethod(
                    env.callMethod(
                            container,
                            "getDefinition",
                            TranslatorPass.class,
                            this.debugCommandServiceId),
                    "replaceArgument",
                    TranslatorPass.class,
                    4,
                    env.callMethod(
                            container, "getParameter", TranslatorPass.class, "twig.default_path"));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        container,
                        "hasDefinition",
                        TranslatorPass.class,
                        this.updateCommandServiceId))) {
            env.callMethod(
                    env.callMethod(
                            container,
                            "getDefinition",
                            TranslatorPass.class,
                            this.updateCommandServiceId),
                    "replaceArgument",
                    TranslatorPass.class,
                    5,
                    env.callMethod(
                            container, "getParameter", TranslatorPass.class, "twig.default_path"));
        }

        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\DependencyInjection\\TranslatorPass";

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
                    .setName("Symfony\\Component\\Translation\\DependencyInjection\\TranslatorPass")
                    .setLookup(
                            TranslatorPass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "debugCommandServiceId",
                            "loaderTag",
                            "readerServiceId",
                            "translatorServiceId",
                            "updateCommandServiceId")
                    .setFilename(
                            "vendor/symfony/translation/DependencyInjection/TranslatorPass.php")
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
