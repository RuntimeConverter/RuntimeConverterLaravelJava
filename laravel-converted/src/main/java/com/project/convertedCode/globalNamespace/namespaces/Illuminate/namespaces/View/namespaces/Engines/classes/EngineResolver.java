package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.View.namespaces.Engines.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/View/Engines/EngineResolver.php

*/

public class EngineResolver extends RuntimeClassBase {

    public Object resolvers = ZVal.newArray();

    public Object resolved = ZVal.newArray();

    public EngineResolver(RuntimeEnv env, Object... args) {
        super(env);
    }

    public EngineResolver(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "engine")
    @ConvertedParameter(index = 1, name = "resolver", typeHint = "Closure")
    public Object register(RuntimeEnv env, Object... args) {
        Object engine = assignParameter(args, 0, false);
        Object resolver = assignParameter(args, 1, false);
        arrayActionR(
                ArrayAction.UNSET, new ReferenceClassProperty(this, "resolved", env), env, engine);
        new ReferenceClassProperty(this, "resolvers", env).arrayAccess(env, engine).set(resolver);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "engine")
    public Object resolve(RuntimeEnv env, Object... args) {
        Object engine = assignParameter(args, 0, false);
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "resolved", env),
                env,
                engine)) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "resolved", env).arrayGet(env, engine));
        }

        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "resolvers", env),
                env,
                engine)) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "resolved", env)
                            .arrayAccess(env, engine)
                            .set(
                                    function_call_user_func
                                            .f
                                            .env(env)
                                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                            .call(
                                                    new ReferenceClassProperty(
                                                                    this, "resolvers", env)
                                                            .arrayGet(env, engine))
                                            .value()));
        }

        throw ZVal.getException(
                env,
                new InvalidArgumentException(
                        env, "Engine [" + toStringR(engine, env) + "] not found."));
    }

    public static final Object CONST_class = "Illuminate\\View\\Engines\\EngineResolver";

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
                    .setName("Illuminate\\View\\Engines\\EngineResolver")
                    .setLookup(
                            EngineResolver.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("resolved", "resolvers")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/View/Engines/EngineResolver.php")
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
