package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/HigherOrderCollectionProxy.php

*/

public class HigherOrderCollectionProxy extends RuntimeClassBase {

    public Object collection = null;

    public Object method = null;

    public HigherOrderCollectionProxy(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == HigherOrderCollectionProxy.class) {
            this.__construct(env, args);
        }
    }

    public HigherOrderCollectionProxy(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "collection",
        typeHint = "Illuminate\\Support\\Collection"
    )
    @ConvertedParameter(index = 1, name = "method")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object collection = assignParameter(args, 0, false);
        Object method = assignParameter(args, 1, false);
        this.method = method;
        this.collection = collection;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object __get(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Support/HigherOrderCollectionProxy.php");
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this.collection,
                        new RuntimeArgsWithReferences(),
                        toStringR(this.method, env),
                        HigherOrderCollectionProxy.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Support",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "value")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                ReferenceContainer value =
                                        new BasicReferenceContainer(
                                                assignParameter(args, 0, false));
                                Object key = null;
                                key = this.contextReferences.getCapturedValue("key");
                                return ZVal.assign(
                                        function_is_array
                                                        .f
                                                        .env(env)
                                                        .call(value.getObject())
                                                        .getBool()
                                                ? value.arrayGet(env, key)
                                                : toObjectR(value.getObject())
                                                        .accessProp(this, env)
                                                        .name(key)
                                                        .value());
                            }
                        }.use("key", key)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Support/HigherOrderCollectionProxy.php");
        Object method = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        this.collection,
                        new RuntimeArgsWithReferences(),
                        toStringR(this.method, env),
                        HigherOrderCollectionProxy.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Support",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "value")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object value = assignParameter(args, 0, false);
                                Object method = null;
                                Object parameters = null;
                                method = this.contextReferences.getCapturedValue("method");
                                parameters = this.contextReferences.getCapturedValue("parameters");
                                return ZVal.assign(
                                        env.callMethod(
                                                value,
                                                new RuntimeArgsWithReferences(),
                                                toStringR(method, env),
                                                HigherOrderCollectionProxy.class,
                                                PackedVaradicArgs.unpack(
                                                        new PackedVaradicArgs(parameters))));
                            }
                        }.use("method", method).use("parameters", parameters)));
    }

    public static final Object CONST_class = "Illuminate\\Support\\HigherOrderCollectionProxy";

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
                    .setName("Illuminate\\Support\\HigherOrderCollectionProxy")
                    .setLookup(
                            HigherOrderCollectionProxy.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("collection", "method")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Support/HigherOrderCollectionProxy.php")
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
