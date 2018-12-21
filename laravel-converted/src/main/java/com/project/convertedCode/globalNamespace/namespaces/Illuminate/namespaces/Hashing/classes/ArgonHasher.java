package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Hashing.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Hashing.classes.AbstractHasher;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Hashing.classes.Hasher;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Hashing/ArgonHasher.php

*/

public class ArgonHasher extends AbstractHasher implements Hasher {

    public Object memory = 1024;

    public Object time = 2;

    public Object threads = 2;

    public ArgonHasher(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ArgonHasher.class) {
            this.__construct(env, args);
        }
    }

    public ArgonHasher(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 0, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        Object ternaryExpressionTemp = null;
        this.time =
                ZVal.isDefined(ternaryExpressionTemp = options.arrayGet(env, "time"))
                        ? ternaryExpressionTemp
                        : this.time;
        this.memory =
                ZVal.isDefined(ternaryExpressionTemp = options.arrayGet(env, "memory"))
                        ? ternaryExpressionTemp
                        : this.memory;
        this.threads =
                ZVal.isDefined(ternaryExpressionTemp = options.arrayGet(env, "threads"))
                        ? ternaryExpressionTemp
                        : this.threads;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(
        index = 1,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object make(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object options = assignParameter(args, 1, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object hash = null;
        hash =
                NamespaceGlobal.password_hash
                        .env(env)
                        .call(
                                value,
                                function_constant.get(env, "PASSWORD_ARGON2I"),
                                ZVal.newArray(
                                        new ZPair("memory_cost", this.memory(env, options)),
                                        new ZPair("time_cost", this.time(env, options)),
                                        new ZPair("threads", this.threads(env, options))))
                        .value();
        if (ZVal.strictEqualityCheck(hash, "===", false)) {
            throw ZVal.getException(
                    env, new RuntimeException(env, "Argon2 hashing not supported."));
        }

        return ZVal.assign(hash);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "hashedValue")
    @ConvertedParameter(
        index = 1,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object needsRehash(RuntimeEnv env, Object... args) {
        Object hashedValue = assignParameter(args, 0, false);
        Object options = assignParameter(args, 1, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        return ZVal.assign(
                NamespaceGlobal.password_needs_rehash
                        .env(env)
                        .call(
                                hashedValue,
                                function_constant.get(env, "PASSWORD_ARGON2I"),
                                ZVal.newArray(
                                        new ZPair("memory_cost", this.memory(env, options)),
                                        new ZPair("time_cost", this.time(env, options)),
                                        new ZPair("threads", this.threads(env, options))))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "memory", typeHint = "int")
    public Object setMemory(RuntimeEnv env, Object... args) {
        Object memory = assignParameter(args, 0, false);
        this.memory = memory;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "time", typeHint = "int")
    public Object setTime(RuntimeEnv env, Object... args) {
        Object time = assignParameter(args, 0, false);
        this.time = time;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "threads", typeHint = "int")
    public Object setThreads(RuntimeEnv env, Object... args) {
        Object threads = assignParameter(args, 0, false);
        this.threads = threads;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options", typeHint = "array")
    protected Object memory(RuntimeEnv env, Object... args) {
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(ternaryExpressionTemp = options.arrayGet(env, "memory"))
                        ? ternaryExpressionTemp
                        : this.memory);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options", typeHint = "array")
    protected Object time(RuntimeEnv env, Object... args) {
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(ternaryExpressionTemp = options.arrayGet(env, "time"))
                        ? ternaryExpressionTemp
                        : this.time);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options", typeHint = "array")
    protected Object threads(RuntimeEnv env, Object... args) {
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(ternaryExpressionTemp = options.arrayGet(env, "threads"))
                        ? ternaryExpressionTemp
                        : this.threads);
    }

    public static final Object CONST_class = "Illuminate\\Hashing\\ArgonHasher";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractHasher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Hashing\\ArgonHasher")
                    .setLookup(
                            ArgonHasher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("memory", "threads", "time")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Hashing/ArgonHasher.php")
                    .addInterface("Illuminate\\Contracts\\Hashing\\Hasher")
                    .addExtendsClass("Illuminate\\Hashing\\AbstractHasher")
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
