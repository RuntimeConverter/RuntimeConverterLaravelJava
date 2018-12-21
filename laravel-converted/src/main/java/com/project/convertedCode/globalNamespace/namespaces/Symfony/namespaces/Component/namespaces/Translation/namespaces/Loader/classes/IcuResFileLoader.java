package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Loader.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Exception.classes.InvalidResourceException;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Exception.classes.NotFoundResourceException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Loader.classes.LoaderInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.classes.MessageCatalogue;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import java.lang.Class;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/Loader/IcuResFileLoader.php

*/

public class IcuResFileLoader extends RuntimeClassBase implements LoaderInterface {

    public IcuResFileLoader(RuntimeEnv env, Object... args) {
        super(env);
    }

    public IcuResFileLoader(NoConstructor n) {
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

        if (!function_is_dir.f.env(env).call(resource).getBool()) {
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
        } catch (ConvertedException convertedException310) {
            if (convertedException310.instanceOf(PHPException.class, "Exception")) {
                e = convertedException310.getObject();
                rb.setObject(ZVal.getNull());
            } else {
                throw convertedException310;
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
                .call(env.callMethod(rb.getObject(), "getErrorCode", IcuResFileLoader.class))
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidResourceException(
                            env,
                            env.callMethod(
                                    rb.getObject(), "getErrorMessage", IcuResFileLoader.class),
                            env.callMethod(
                                    rb.getObject(), "getErrorCode", IcuResFileLoader.class)));
        }

        messages.setObject(
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences().add(0, rb),
                        "flatten",
                        IcuResFileLoader.class,
                        rb.getObject()));
        catalogue = new MessageCatalogue(env, locale);
        env.callMethod(
                catalogue,
                new RuntimeArgsWithReferences().add(0, messages),
                "add",
                IcuResFileLoader.class,
                messages.getObject(),
                domain);
        if (function_class_exists
                .f
                .env(env)
                .call("Symfony\\Component\\Config\\Resource\\DirectoryResource")
                .getBool()) {
            env.callMethod(
                    catalogue,
                    "addResource",
                    IcuResFileLoader.class,
                    env.createNew(ZVal.resolveClassAlias(env, "DirectoryResource"), resource));
        }

        return ZVal.assign(catalogue);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rb", typeHint = "ResourceBundle")
    @ConvertedParameter(
        index = 1,
        name = "messages",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "path",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object flatten(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        Object rb = assignParameter(args, 0, false);
        ReferenceContainer messages = assignParameterRef(runtimePassByReferenceArgs, args, 1, true);
        if (null == messages.getObject()) {
            messages.setObject(ZVal.newArray());
        }
        Object path = assignParameter(args, 2, true);
        if (null == path) {
            path = ZVal.getNull();
        }
        Object nodePath = null;
        ReferenceContainer value = new BasicReferenceContainer(null);
        Object key = null;
        for (ZPair zpairResult2142 : ZVal.getIterable(rb, env, false)) {
            key = ZVal.assign(zpairResult2142.getKey());
            value.setObject(ZVal.assign(zpairResult2142.getValue()));
            nodePath =
                    ZVal.assign(
                            ZVal.isTrue(path)
                                    ? toStringR(path, env) + "." + toStringR(key, env)
                                    : key);
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            value.getObject(), (Class) null, "ResourceBundle", env))) {
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences().add(0, value).add(1, messages),
                        "flatten",
                        IcuResFileLoader.class,
                        value.getObject(),
                        messages.getObject(),
                        nodePath);

            } else {
                messages.arrayAccess(env, nodePath).set(value.getObject());
            }
        }

        return ZVal.assign(messages.getObject());
    }

    public Object flatten(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\Loader\\IcuResFileLoader";

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
                    .setName("Symfony\\Component\\Translation\\Loader\\IcuResFileLoader")
                    .setLookup(
                            IcuResFileLoader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/translation/Loader/IcuResFileLoader.php")
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
