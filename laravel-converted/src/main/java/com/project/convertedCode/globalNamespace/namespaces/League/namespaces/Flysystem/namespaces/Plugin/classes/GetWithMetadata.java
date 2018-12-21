package com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Plugin.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Plugin.classes.AbstractPlugin;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/league/flysystem/src/Plugin/GetWithMetadata.php

*/

public class GetWithMetadata extends AbstractPlugin {

    public GetWithMetadata(RuntimeEnv env, Object... args) {
        super(env);
    }

    public GetWithMetadata(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getMethod(RuntimeEnv env, Object... args) {
        return "getWithMetadata";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "metadata", typeHint = "array")
    public Object handle(RuntimeEnv env, Object... args) {
        ReferenceContainer path = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object metadata = assignParameter(args, 1, false);
        Object method = null;
        Object keys = null;
        Object key = null;
        ReferenceContainer _object = new BasicReferenceContainer(null);
        _object.setObject(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("filesystem").value(),
                        "getMetadata",
                        GetWithMetadata.class,
                        path.getObject()));
        if (!ZVal.isTrue(_object.getObject())) {
            return ZVal.assign(false);
        }

        keys =
                function_array_diff
                        .f
                        .env(env)
                        .call(
                                metadata,
                                function_array_keys.f.env(env).call(_object.getObject()).value())
                        .value();
        for (ZPair zpairResult666 : ZVal.getIterable(keys, env, true)) {
            key = ZVal.assign(zpairResult666.getValue());
            if (!function_method_exists
                    .f
                    .env(env)
                    .call(
                            toObjectR(this).accessProp(this, env).name("filesystem").value(),
                            method =
                                    "get"
                                            + toStringR(
                                                    NamespaceGlobal.ucfirst
                                                            .env(env)
                                                            .call(key)
                                                            .value(),
                                                    env))
                    .getBool()) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env, "Could not fetch metadata: " + toStringR(key, env)));
            }

            _object.arrayAccess(env, key)
                    .set(
                            env.callMethod(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("filesystem")
                                            .value(),
                                    new RuntimeArgsWithReferences().add(0, path),
                                    toStringR(method, env),
                                    GetWithMetadata.class,
                                    path.getObject()));
        }

        return ZVal.assign(_object.getObject());
    }

    public static final Object CONST_class = "League\\Flysystem\\Plugin\\GetWithMetadata";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractPlugin.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("League\\Flysystem\\Plugin\\GetWithMetadata")
                    .setLookup(
                            GetWithMetadata.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("filesystem")
                    .setFilename("vendor/league/flysystem/src/Plugin/GetWithMetadata.php")
                    .addInterface("League\\Flysystem\\PluginInterface")
                    .addExtendsClass("League\\Flysystem\\Plugin\\AbstractPlugin")
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
