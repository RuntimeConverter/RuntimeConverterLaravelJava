package com.project.convertedCode.globalNamespace.namespaces.Laravel.namespaces.Tinker.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_flip;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.Caster;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_intersect_key;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/tinker/src/TinkerCaster.php

*/

public class TinkerCaster extends RuntimeClassBase {

    public TinkerCaster(RuntimeEnv env, Object... args) {
        super(env);
    }

    public TinkerCaster(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Laravel\\Tinker\\TinkerCaster";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "app")
        public Object castApplication(RuntimeEnv env, Object... args) {
            Object app = assignParameter(args, 0, false);
            Object val = null;
            Object e = null;
            Object property = null;
            ReferenceContainer results = new BasicReferenceContainer(null);
            results.setObject(ZVal.newArray());
            for (ZPair zpairResult654 :
                    ZVal.getIterable(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Laravel
                                                    .namespaces
                                                    .Tinker
                                                    .classes
                                                    .TinkerCaster
                                                    .RequestStaticProperties
                                                    .class)
                                    .appProperties,
                            env,
                            true)) {
                property = ZVal.assign(zpairResult654.getValue());
                try {
                    val = env.callMethod(app, toStringR(property, env), TinkerCaster.class);
                    if (!function_is_null.f.env(env).call(val).getBool()) {
                        results.arrayAccess(
                                        env,
                                        toStringR(Caster.CONST_PREFIX_VIRTUAL, env)
                                                + toStringR(property, env))
                                .set(val);
                    }

                } catch (ConvertedException convertedException72) {
                    if (convertedException72.instanceOf(PHPException.class, "Exception")) {
                        e = convertedException72.getObject();
                    } else {
                        throw convertedException72;
                    }
                }
            }

            return ZVal.assign(results.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "collection")
        public Object castCollection(RuntimeEnv env, Object... args) {
            Object collection = assignParameter(args, 0, false);
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    toStringR(Caster.CONST_PREFIX_VIRTUAL, env) + "all",
                                    env.callMethod(collection, "all", TinkerCaster.class))));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "model")
        public Object castModel(RuntimeEnv env, Object... args) {
            Object model = assignParameter(args, 0, false);
            ReferenceContainer visible = new BasicReferenceContainer(null);
            Object attributes = null;
            Object ternaryExpressionTemp = null;
            ReferenceContainer results = new BasicReferenceContainer(null);
            Object value = null;
            Object key = null;
            attributes =
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    env.callMethod(model, "getAttributes", TinkerCaster.class),
                                    env.callMethod(model, "getRelations", TinkerCaster.class))
                            .value();
            visible.setObject(
                    function_array_flip
                            .f
                            .env(env)
                            .call(
                                    ZVal.isTrue(
                                                    ternaryExpressionTemp =
                                                            env.callMethod(
                                                                    model,
                                                                    "getVisible",
                                                                    TinkerCaster.class))
                                            ? ternaryExpressionTemp
                                            : function_array_diff
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            function_array_keys
                                                                    .f
                                                                    .env(env)
                                                                    .call(attributes)
                                                                    .value(),
                                                            env.callMethod(
                                                                    model,
                                                                    "getHidden",
                                                                    TinkerCaster.class))
                                                    .value())
                            .value());
            results.setObject(ZVal.newArray());
            for (ZPair zpairResult655 :
                    ZVal.getIterable(
                            function_array_intersect_key
                                    .f
                                    .env(env)
                                    .call(attributes, visible.getObject())
                                    .value(),
                            env,
                            false)) {
                key = ZVal.assign(zpairResult655.getKey());
                value = ZVal.assign(zpairResult655.getValue());
                results.arrayAccess(
                                env,
                                toStringR(
                                                arrayActionR(ArrayAction.ISSET, visible, env, key)
                                                        ? Caster.CONST_PREFIX_VIRTUAL
                                                        : Caster.CONST_PREFIX_PROTECTED,
                                                env)
                                        + toStringR(key, env))
                        .set(value);
            }

            return ZVal.assign(results.getObject());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object appProperties =
                ZVal.arrayFromList(
                        "configurationIsCached",
                        "environment",
                        "environmentFile",
                        "isLocal",
                        "routesAreCached",
                        "runningUnitTests",
                        "version",
                        "path",
                        "basePath",
                        "configPath",
                        "databasePath",
                        "langPath",
                        "publicPath",
                        "storagePath",
                        "bootstrapPath");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Laravel\\Tinker\\TinkerCaster")
                    .setLookup(
                            TinkerCaster.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("appProperties")
                    .setFilename("vendor/laravel/tinker/src/TinkerCaster.php")
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
