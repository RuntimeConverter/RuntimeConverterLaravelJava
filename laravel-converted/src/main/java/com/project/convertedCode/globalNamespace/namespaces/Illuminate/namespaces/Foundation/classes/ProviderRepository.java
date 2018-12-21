package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/ProviderRepository.php

*/

public class ProviderRepository extends RuntimeClassBase {

    public Object app = null;

    public Object files = null;

    public Object manifestPath = null;

    public ProviderRepository(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ProviderRepository.class) {
            this.__construct(env, args);
        }
    }

    public ProviderRepository(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "app",
        typeHint = "Illuminate\\Contracts\\Foundation\\Application"
    )
    @ConvertedParameter(index = 1, name = "files", typeHint = "Illuminate\\Filesystem\\Filesystem")
    @ConvertedParameter(index = 2, name = "manifestPath")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object app = assignParameter(args, 0, false);
        Object files = assignParameter(args, 1, false);
        Object manifestPath = assignParameter(args, 2, false);
        this.app = app;
        this.files = files;
        this.manifestPath = manifestPath;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "providers", typeHint = "array")
    public Object load(RuntimeEnv env, Object... args) {
        Object providers = assignParameter(args, 0, false);
        Object provider = null;
        ReferenceContainer manifest = new BasicReferenceContainer(null);
        Object events = null;
        manifest.setObject(this.loadManifest(env));
        if (ZVal.isTrue(this.shouldRecompile(env, manifest.getObject(), providers))) {
            manifest.setObject(this.compileManifest(env, providers));
        }

        for (ZPair zpairResult421 : ZVal.getIterable(manifest.arrayGet(env, "when"), env, false)) {
            provider = ZVal.assign(zpairResult421.getKey());
            events = ZVal.assign(zpairResult421.getValue());
            this.registerLoadEvents(env, provider, events);
        }

        for (ZPair zpairResult422 : ZVal.getIterable(manifest.arrayGet(env, "eager"), env, true)) {
            provider = ZVal.assign(zpairResult422.getValue());
            env.callMethod(this.app, "register", ProviderRepository.class, provider);
        }

        env.callMethod(
                this.app,
                "addDeferredServices",
                ProviderRepository.class,
                manifest.arrayGet(env, "deferred"));
        return null;
    }

    @ConvertedMethod
    public Object loadManifest(RuntimeEnv env, Object... args) {
        Object manifest = null;
        if (ZVal.isTrue(
                env.callMethod(
                        this.files, "exists", ProviderRepository.class, this.manifestPath))) {
            manifest =
                    env.callMethod(
                            this.files, "getRequire", ProviderRepository.class, this.manifestPath);
            if (ZVal.isTrue(manifest)) {
                return ZVal.assign(
                        function_array_merge
                                .f
                                .env(env)
                                .call(ZVal.newArray(new ZPair("when", ZVal.newArray())), manifest)
                                .value());
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "manifest")
    @ConvertedParameter(index = 1, name = "providers")
    public Object shouldRecompile(RuntimeEnv env, Object... args) {
        ReferenceContainer manifest = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object providers = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.toBool(function_is_null.f.env(env).call(manifest.getObject()).value())
                        || ZVal.toBool(
                                ZVal.notEqualityCheck(
                                        manifest.arrayGet(env, "providers"), providers)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "provider")
    @ConvertedParameter(index = 1, name = "events", typeHint = "array")
    protected Object registerLoadEvents(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Foundation")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/ProviderRepository.php");
        Object provider = assignParameter(args, 0, false);
        Object events = assignParameter(args, 1, false);
        if (ZVal.isLessThan(function_count.f.env(env).call(events).value(), '<', 1)) {
            return null;
        }

        env.callMethod(
                env.callMethod(this.app, "make", ProviderRepository.class, "events"),
                "listen",
                ProviderRepository.class,
                events,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Foundation",
                        this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object provider = null;
                        provider = this.contextReferences.getCapturedValue("provider");
                        env.callMethod(
                                ProviderRepository.this.app,
                                "register",
                                ProviderRepository.class,
                                provider);
                        return null;
                    }
                }.use("provider", provider));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "providers")
    protected Object compileManifest(RuntimeEnv env, Object... args) {
        Object providers = assignParameter(args, 0, false);
        Object instance = null;
        Object provider = null;
        ReferenceContainer manifest = new BasicReferenceContainer(null);
        Object service = null;
        manifest.setObject(this.freshManifest(env, providers));
        for (ZPair zpairResult423 : ZVal.getIterable(providers, env, true)) {
            provider = ZVal.assign(zpairResult423.getValue());
            instance = this.createProvider(env, provider);
            if (ZVal.isTrue(env.callMethod(instance, "isDeferred", ProviderRepository.class))) {
                for (ZPair zpairResult424 :
                        ZVal.getIterable(
                                env.callMethod(instance, "provides", ProviderRepository.class),
                                env,
                                true)) {
                    service = ZVal.assign(zpairResult424.getValue());
                    manifest.arrayAccess(env, "deferred", service).set(provider);
                }

                manifest.arrayAccess(env, "when", provider)
                        .set(env.callMethod(instance, "when", ProviderRepository.class));

            } else {
                manifest.arrayAppend(env, "eager").set(provider);
            }
        }

        return ZVal.assign(this.writeManifest(env, manifest.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "providers", typeHint = "array")
    protected Object freshManifest(RuntimeEnv env, Object... args) {
        Object providers = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("providers", providers),
                        new ZPair("eager", ZVal.newArray()),
                        new ZPair("deferred", ZVal.newArray())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "manifest")
    public Object writeManifest(RuntimeEnv env, Object... args) {
        Object manifest = assignParameter(args, 0, false);
        if (!NamespaceGlobal.is_writable
                .env(env)
                .call(function_dirname.f.env(env).call(this.manifestPath).value())
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new PHPException(
                            env, "The bootstrap/cache directory must be present and writable."));
        }

        env.callMethod(
                this.files,
                "put",
                ProviderRepository.class,
                this.manifestPath,
                "<?php return "
                        + toStringR(
                                NamespaceGlobal.var_export.env(env).call(manifest, true).value(),
                                env)
                        + ";");
        return ZVal.assign(
                function_array_merge
                        .f
                        .env(env)
                        .call(ZVal.newArray(new ZPair("when", ZVal.newArray())), manifest)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "provider")
    public Object createProvider(RuntimeEnv env, Object... args) {
        Object provider = assignParameter(args, 0, false);
        return ZVal.assign(env.createNew(provider, this.app));
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\ProviderRepository";

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
                    .setName("Illuminate\\Foundation\\ProviderRepository")
                    .setLookup(
                            ProviderRepository.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "files", "manifestPath")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/ProviderRepository.php")
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
