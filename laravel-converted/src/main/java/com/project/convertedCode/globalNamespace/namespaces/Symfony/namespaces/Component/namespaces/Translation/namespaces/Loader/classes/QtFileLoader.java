package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Loader.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMXPath;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Loader.classes.LoaderInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Exception.classes.InvalidResourceException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Exception.classes.NotFoundResourceException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.classes.MessageCatalogue;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/Loader/QtFileLoader.php

*/

public class QtFileLoader extends RuntimeClassBase implements LoaderInterface {

    public QtFileLoader(RuntimeEnv env, Object... args) {
        super(env);
    }

    public QtFileLoader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    @ConvertedParameter(index = 1, name = "locale")
    @ConvertedParameter(index = 2, name = "domain")
    public Object load(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        Object locale = assignParameter(args, 1, false);
        Object domain = assignParameter(args, 2, true);
        if (null == domain) {
            domain = "messages";
        }
        Object translationValue = null;
        Object xpath = null;
        Object dom = null;
        Object nodes = null;
        Object e = null;
        Object translations = null;
        Object translation = null;
        Object catalogue = null;
        Object internalErrors = null;
        if (!NamespaceGlobal.stream_is_local.env(env).call(resource).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidResourceException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("This is not a local file \"%s\".", resource)
                                    .value()));
        }

        if (!function_file_exists.f.env(env).call(resource).getBool()) {
            throw ZVal.getException(
                    env,
                    new NotFoundResourceException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("File \"%s\" not found.", resource)
                                    .value()));
        }

        try {
            dom =
                    StaticMethodUtils.getStaticBaseClass(
                                    ZVal.resolveClassAlias(env, "XmlUtils"), env)
                            .callUnknownStaticMethod(
                                    env, "loadFile", new RuntimeArgsWithReferences(), resource);
        } catch (ConvertedException convertedException311) {
            if (convertedException311.instanceOf(
                    InvalidArgumentException.class, "InvalidArgumentException")) {
                e = convertedException311.getObject();
                throw ZVal.getException(
                        env,
                        new InvalidResourceException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("Unable to load \"%s\".", resource)
                                        .value(),
                                env.callMethod(e, "getCode", QtFileLoader.class),
                                e));
            } else {
                throw convertedException311;
            }
        }

        internalErrors = NamespaceGlobal.libxml_use_internal_errors.env(env).call(true).value();
        NamespaceGlobal.libxml_clear_errors.env(env).call();
        xpath = new DOMXPath(env, dom);
        nodes =
                env.callMethod(
                        xpath,
                        "evaluate",
                        QtFileLoader.class,
                        "//TS/context/name[text()=\"" + toStringR(domain, env) + "\"]");
        catalogue = new MessageCatalogue(env, locale);
        if (ZVal.equalityCheck(1, toObjectR(nodes).accessProp(this, env).name("length").value())) {
            translations =
                    env.callMethod(
                            toObjectR(env.callMethod(nodes, "item", QtFileLoader.class, 0))
                                    .accessProp(this, env)
                                    .name("nextSibling")
                                    .getObject()
                                    .accessProp(this, env)
                                    .name("parentNode")
                                    .getObject()
                                    .accessProp(this, env)
                                    .name("parentNode")
                                    .value(),
                            "getElementsByTagName",
                            QtFileLoader.class,
                            "message");
            for (ZPair zpairResult2144 : ZVal.getIterable(translations, env, true)) {
                translation = ZVal.assign(zpairResult2144.getValue());
                translationValue =
                        ZVal.assign(
                                toStringR(
                                        toObjectR(
                                                        env.callMethod(
                                                                env.callMethod(
                                                                        translation,
                                                                        "getElementsByTagName",
                                                                        QtFileLoader.class,
                                                                        "translation"),
                                                                "item",
                                                                QtFileLoader.class,
                                                                0))
                                                .accessProp(this, env)
                                                .name("nodeValue")
                                                .value(),
                                        env));
                if (!ZVal.isEmpty(translationValue)) {
                    env.callMethod(
                            catalogue,
                            "set",
                            QtFileLoader.class,
                            toStringR(
                                    toObjectR(
                                                    env.callMethod(
                                                            env.callMethod(
                                                                    translation,
                                                                    "getElementsByTagName",
                                                                    QtFileLoader.class,
                                                                    "source"),
                                                            "item",
                                                            QtFileLoader.class,
                                                            0))
                                            .accessProp(this, env)
                                            .name("nodeValue")
                                            .value(),
                                    env),
                            translationValue,
                            domain);
                }

                translation =
                        ZVal.assign(
                                toObjectR(translation)
                                        .accessProp(this, env)
                                        .name("nextSibling")
                                        .value());
            }

            if (function_class_exists
                    .f
                    .env(env)
                    .call("Symfony\\Component\\Config\\Resource\\FileResource")
                    .getBool()) {
                env.callMethod(
                        catalogue,
                        "addResource",
                        QtFileLoader.class,
                        env.createNew(ZVal.resolveClassAlias(env, "FileResource"), resource));
            }
        }

        NamespaceGlobal.libxml_use_internal_errors.env(env).call(internalErrors);
        return ZVal.assign(catalogue);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\Loader\\QtFileLoader";

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
                    .setName("Symfony\\Component\\Translation\\Loader\\QtFileLoader")
                    .setLookup(
                            QtFileLoader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/translation/Loader/QtFileLoader.php")
                    .addInterface("Symfony\\Component\\Translation\\Loader\\LoaderInterface")
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
