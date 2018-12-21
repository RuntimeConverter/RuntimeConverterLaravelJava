package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Facade;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.functions.storage_path;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Filesystem.classes.Filesystem;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/Facades/Storage.php

*/

public class Storage extends Facade {

    public Storage(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Storage(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Illuminate\\Support\\Facades\\Storage";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Facade.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "disk",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object fake(RuntimeEnv env, Object... args) {
            Object disk = assignParameter(args, 0, true);
            if (null == disk) {
                disk = ZVal.getNull();
            }
            Object root = null;
            Object ternaryExpressionTemp = null;
            disk =
                    ZVal.assign(
                            ZVal.isTrue(ternaryExpressionTemp = disk)
                                    ? ternaryExpressionTemp
                                    : env.callMethod(
                                            env.getRequestStaticPropertiesReference(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .Illuminate
                                                                    .namespaces
                                                                    .Support
                                                                    .namespaces
                                                                    .Facades
                                                                    .classes
                                                                    .Storage
                                                                    .RequestStaticProperties
                                                                    .class,
                                                            "app")
                                                    .arrayGet(env, "config"),
                                            "get",
                                            Storage.class,
                                            "filesystems.default"));
            env.callMethod(
                    new Filesystem(env),
                    "cleanDirectory",
                    Storage.class,
                    root =
                            storage_path
                                    .f
                                    .env(env)
                                    .call("framework/testing/disks/" + toStringR(disk, env))
                                    .value());
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Storage.class)
                    .method("set")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            disk,
                            com.project.convertedCode.globalNamespace.namespaces.Illuminate
                                    .namespaces.Support.namespaces.Facades.classes.Storage
                                    .runtimeStaticObject.callUnknownStaticMethod(
                                    env,
                                    "createLocalDriver",
                                    new RuntimeArgsWithReferences(),
                                    ZVal.newArray(new ZPair("root", root))))
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "disk",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object persistentFake(RuntimeEnv env, Object... args) {
            Object disk = assignParameter(args, 0, true);
            if (null == disk) {
                disk = ZVal.getNull();
            }
            Object ternaryExpressionTemp = null;
            disk =
                    ZVal.assign(
                            ZVal.isTrue(ternaryExpressionTemp = disk)
                                    ? ternaryExpressionTemp
                                    : env.callMethod(
                                            env.getRequestStaticPropertiesReference(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .Illuminate
                                                                    .namespaces
                                                                    .Support
                                                                    .namespaces
                                                                    .Facades
                                                                    .classes
                                                                    .Storage
                                                                    .RequestStaticProperties
                                                                    .class,
                                                            "app")
                                                    .arrayGet(env, "config"),
                                            "get",
                                            Storage.class,
                                            "filesystems.default"));
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Storage.class)
                    .method("set")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            disk,
                            com.project.convertedCode.globalNamespace.namespaces.Illuminate
                                    .namespaces.Support.namespaces.Facades.classes.Storage
                                    .runtimeStaticObject.callUnknownStaticMethod(
                                    env,
                                    "createLocalDriver",
                                    new RuntimeArgsWithReferences(),
                                    ZVal.newArray(
                                            new ZPair(
                                                    "root",
                                                    storage_path
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    "framework/testing/disks/"
                                                                            + toStringR(disk, env))
                                                            .value()))))
                    .value();
            return null;
        }

        @ConvertedMethod
        protected Object getFacadeAccessor(RuntimeEnv env, Object... args) {
            return "filesystem";
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Support\\Facades\\Storage")
                    .setLookup(
                            Storage.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Support/Facades/Storage.php")
                    .addExtendsClass("Illuminate\\Support\\Facades\\Facade")
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
