package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Hashing.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Manager;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Hashing.classes.BcryptHasher;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Hashing.classes.Hasher;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Hashing.classes.ArgonHasher;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Hashing/HashManager.php

*/

public class HashManager extends Manager implements Hasher {

    public HashManager(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == HashManager.class) {
            this.__construct(env, args);
        }
    }

    public HashManager(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object createBcryptDriver(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                new BcryptHasher(
                        env,
                        ZVal.isDefined(
                                        ternaryExpressionTemp =
                                                new ReferenceClassProperty(this, "app", env)
                                                        .arrayGet(env, "config", "hashing.bcrypt"))
                                ? ternaryExpressionTemp
                                : ZVal.newArray()));
    }

    @ConvertedMethod
    public Object createArgonDriver(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                new ArgonHasher(
                        env,
                        ZVal.isDefined(
                                        ternaryExpressionTemp =
                                                new ReferenceClassProperty(this, "app", env)
                                                        .arrayGet(env, "config", "hashing.argon"))
                                ? ternaryExpressionTemp
                                : ZVal.newArray()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "hashedValue")
    public Object info(RuntimeEnv env, Object... args) {
        Object hashedValue = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this, "driver", HashManager.class),
                        "info",
                        HashManager.class,
                        hashedValue));
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
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this, "driver", HashManager.class),
                        "make",
                        HashManager.class,
                        value,
                        options));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(index = 1, name = "hashedValue")
    @ConvertedParameter(
        index = 2,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object check(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object hashedValue = assignParameter(args, 1, false);
        Object options = assignParameter(args, 2, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this, "driver", HashManager.class),
                        "check",
                        HashManager.class,
                        value,
                        hashedValue,
                        options));
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
                env.callMethod(
                        env.callMethod(this, "driver", HashManager.class),
                        "needsRehash",
                        HashManager.class,
                        hashedValue,
                        options));
    }

    @ConvertedMethod
    public Object getDefaultDriver(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        new ReferenceClassProperty(this, "app", env)
                                                .arrayGet(env, "config", "hashing.driver"))
                        ? ternaryExpressionTemp
                        : "bcrypt");
    }

    public static final Object CONST_class = "Illuminate\\Hashing\\HashManager";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Manager.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Hashing\\HashManager")
                    .setLookup(
                            HashManager.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "customCreators", "drivers")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Hashing/HashManager.php")
                    .addInterface("Illuminate\\Contracts\\Hashing\\Hasher")
                    .addExtendsClass("Illuminate\\Support\\Manager")
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
