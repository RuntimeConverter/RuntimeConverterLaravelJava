package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Loader.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Exception.classes.InvalidResourceException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Exception.classes.NotFoundResourceException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.classes.MessageCatalogue;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Loader.classes.IcuResFileLoader;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/Loader/IcuDatFileLoader.php

*/

public class IcuDatFileLoader extends IcuResFileLoader {

    public IcuDatFileLoader(RuntimeEnv env, Object... args) {
        super(env);
    }

    public IcuDatFileLoader(NoConstructor n) {
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
        ReferenceContainer rb = new BasicReferenceContainer(null);
        Object e = null;
        ReferenceContainer messages = new BasicReferenceContainer(null);
        Object catalogue = null;
        if (!NamespaceGlobal.stream_is_local
                .env(env)
                .call(toStringR(resource, env) + ".dat")
                .getBool()) {
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

        if (!function_file_exists.f.env(env).call(toStringR(resource, env) + ".dat").getBool()) {
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
            rb.setObject(
                    env.createNew(ZVal.resolveClassAlias(env, "ResourceBundle"), locale, resource));
        } catch (ConvertedException convertedException309) {
            if (convertedException309.instanceOf(PHPException.class, "Exception")) {
                e = convertedException309.getObject();
                rb.setObject(ZVal.getNull());
            } else {
                throw convertedException309;
            }
        }

        if (!ZVal.isTrue(rb.getObject())) {
            throw ZVal.getException(
                    env,
                    new InvalidResourceException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Cannot load resource \"%s\"", resource)
                                    .value()));

        } else if (NamespaceGlobal.intl_is_failure
                .env(env)
                .call(env.callMethod(rb.getObject(), "getErrorCode", IcuDatFileLoader.class))
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidResourceException(
                            env,
                            env.callMethod(
                                    rb.getObject(), "getErrorMessage", IcuDatFileLoader.class),
                            env.callMethod(
                                    rb.getObject(), "getErrorCode", IcuDatFileLoader.class)));
        }

        messages.setObject(
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences().add(0, rb),
                        "flatten",
                        IcuDatFileLoader.class,
                        rb.getObject()));
        catalogue = new MessageCatalogue(env, locale);
        env.callMethod(
                catalogue,
                new RuntimeArgsWithReferences().add(0, messages),
                "add",
                IcuDatFileLoader.class,
                messages.getObject(),
                domain);
        if (function_class_exists
                .f
                .env(env)
                .call("Symfony\\Component\\Config\\Resource\\FileResource")
                .getBool()) {
            env.callMethod(
                    catalogue,
                    "addResource",
                    IcuDatFileLoader.class,
                    env.createNew(
                            ZVal.resolveClassAlias(env, "FileResource"),
                            toStringR(resource, env) + ".dat"));
        }

        return ZVal.assign(catalogue);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\Loader\\IcuDatFileLoader";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends IcuResFileLoader.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Translation\\Loader\\IcuDatFileLoader")
                    .setLookup(
                            IcuDatFileLoader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/translation/Loader/IcuDatFileLoader.php")
                    .addInterface("Symfony\\Component\\Translation\\Loader\\LoaderInterface")
                    .addExtendsClass("Symfony\\Component\\Translation\\Loader\\IcuResFileLoader")
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
