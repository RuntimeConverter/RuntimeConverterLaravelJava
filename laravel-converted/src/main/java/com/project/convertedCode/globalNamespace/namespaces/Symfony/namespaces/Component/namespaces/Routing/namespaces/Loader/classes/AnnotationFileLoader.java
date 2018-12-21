package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Loader.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes.RouteCollection;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/routing/Loader/AnnotationFileLoader.php

*/

public class AnnotationFileLoader extends RuntimeClassBase {

    public Object loader = null;

    public AnnotationFileLoader(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AnnotationFileLoader.class) {
            this.__construct(env, args);
        }
    }

    public AnnotationFileLoader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "locator",
        typeHint = "Symfony\\Component\\Config\\FileLocatorInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "loader",
        typeHint = "Symfony\\Component\\Routing\\Loader\\AnnotationClassLoader"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object locator = assignParameter(args, 0, false);
        Object loader = assignParameter(args, 1, false);
        if (!function_function_exists.f.env(env).call("token_get_all").getBool()) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            "The Tokenizer extension is required for the routing annotation loaders."));
        }

        StaticMethodUtils.getStaticBaseClass(ZVal.resolveClassAlias(env, "parent"), env)
                .callUnknownStaticMethod(
                        env, "__construct", new RuntimeArgsWithReferences(), locator);
        this.loader = loader;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    @ConvertedParameter(
        index = 1,
        name = "type",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object load(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = ZVal.getNull();
        }
        Object path = null;
        Object collection = null;
        Object _pClass = null;
        path =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("locator").value(),
                        "locate",
                        AnnotationFileLoader.class,
                        file);
        collection = new RouteCollection(env);
        if (ZVal.isTrue(_pClass = this.findClass(env, path))) {
            env.callMethod(
                    collection,
                    "addResource",
                    AnnotationFileLoader.class,
                    env.createNew(ZVal.resolveClassAlias(env, "FileResource"), path));
            env.callMethod(
                    collection,
                    "addCollection",
                    AnnotationFileLoader.class,
                    env.callMethod(this.loader, "load", AnnotationFileLoader.class, _pClass, type));
        }

        NamespaceGlobal.gc_mem_caches.env(env).call();
        return ZVal.assign(collection);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    @ConvertedParameter(
        index = 1,
        name = "type",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object supports(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = ZVal.getNull();
        }
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(function_is_string.f.env(env).call(resource).value())
                                        && ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        "php",
                                                        "===",
                                                        NamespaceGlobal.pathinfo
                                                                .env(env)
                                                                .call(resource, 4)
                                                                .value())))
                        && ZVal.toBool(
                                ZVal.toBool(!ZVal.isTrue(type))
                                        || ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        "annotation", "===", type))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    protected Object findClass(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        Object file = assignParameter(args, 0, false);
        Object skipClassToken = null;
        Object namespace = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        ReferenceContainer tokens = new BasicReferenceContainer(null);
        ReferenceContainer j = new BasicReferenceContainer(null);
        Object _pClass = null;
        ReferenceContainer token = new BasicReferenceContainer(null);
        _pClass = false;
        namespace = false;
        tokens.setObject(
                NamespaceGlobal.token_get_all
                        .env(env)
                        .call(function_file_get_contents.f.env(env).call(file).value())
                        .value());
        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                1,
                                "===",
                                function_count.f.env(env).call(tokens.getObject()).value()))
                && ZVal.toBool(ZVal.strictEqualityCheck(321, "===", tokens.arrayGet(env, 0, 0)))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "The file \"%s\" does not contain PHP code. Did you forgot to add the \"<?php\" start tag at the beginning of the file?",
                                            file)
                                    .value()));
        }

        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (i.setObject(0);
                arrayActionR(ArrayAction.ISSET, tokens, env, i.getObject());
                i.setObject(ZVal.increment(i.getObject()))) {
            token.setObject(ZVal.assign(tokens.arrayGet(env, i.getObject())));
            if (!arrayActionR(ArrayAction.ISSET, token, env, 1)) {
                continue;
            }

            if (ZVal.toBool(ZVal.strictEqualityCheck(true, "===", _pClass))
                    && ZVal.toBool(ZVal.strictEqualityCheck(319, "===", token.arrayGet(env, 0)))) {
                return ZVal.assign(
                        toStringR(namespace, env) + "\\" + toStringR(token.arrayGet(env, 1), env));
            }

            if (ZVal.toBool(ZVal.strictEqualityCheck(true, "===", namespace))
                    && ZVal.toBool(ZVal.strictEqualityCheck(319, "===", token.arrayGet(env, 0)))) {
                namespace = ZVal.assign(token.arrayGet(env, 1));
                runtimeConverterBreakCount = 0;
                runtimeConverterContinueCount = 0;
                while (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET, tokens, env, ZVal.preIncrement(i), 1))
                        && ZVal.toBool(
                                function_in_array
                                        .f
                                        .env(env)
                                        .call(
                                                tokens.arrayGet(env, i.getObject(), 0),
                                                ZVal.newArray(new ZPair(0, 390), new ZPair(1, 319)))
                                        .value())) {
                    namespace =
                            toStringR(namespace, env)
                                    + toStringR(tokens.arrayGet(env, i.getObject(), 1), env);
                }

                token.setObject(ZVal.assign(tokens.arrayGet(env, i.getObject())));
            }

            if (ZVal.strictEqualityCheck(361, "===", token.arrayGet(env, 0))) {
                skipClassToken = false;
                runtimeConverterBreakCount = 0;
                runtimeConverterContinueCount = 0;
                for (j.setObject(ZVal.subtract(i.getObject(), 1));
                        ZVal.isGreaterThan(j.getObject(), '>', 0);
                        j.setObject(ZVal.decrement(j.getObject()))) {
                    if (!arrayActionR(ArrayAction.ISSET, tokens, env, j.getObject(), 1)) {
                        break;
                    }

                    if (ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            387, "===", tokens.arrayGet(env, j.getObject(), 0)))
                            || ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            305, "===", tokens.arrayGet(env, j.getObject(), 0)))) {
                        skipClassToken = true;
                        break;

                    } else if (!function_in_array
                            .f
                            .env(env)
                            .call(
                                    tokens.arrayGet(env, j.getObject(), 0),
                                    ZVal.newArray(
                                            new ZPair(0, 382),
                                            new ZPair(1, 378),
                                            new ZPair(2, 377)))
                            .getBool()) {
                        break;
                    }
                }

                if (!ZVal.isTrue(skipClassToken)) {
                    _pClass = true;
                }
            }

            if (ZVal.strictEqualityCheck(388, "===", token.arrayGet(env, 0))) {
                namespace = true;
            }
        }

        return ZVal.assign(false);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Routing\\Loader\\AnnotationFileLoader";

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
                    .setName("Symfony\\Component\\Routing\\Loader\\AnnotationFileLoader")
                    .setLookup(
                            AnnotationFileLoader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("loader")
                    .setFilename("vendor/symfony/routing/Loader/AnnotationFileLoader.php")
                    .addExtendsClass("Symfony\\Component\\Config\\Loader\\FileLoader")
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
