package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.Collection;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Notifications/DatabaseNotificationCollection.php

*/

public class DatabaseNotificationCollection extends Collection {

    public DatabaseNotificationCollection(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DatabaseNotificationCollection.class) {
            this.__construct(env, args);
        }
    }

    public DatabaseNotificationCollection(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object markAsRead(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Notifications")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Notifications/DatabaseNotificationCollection.php");
        env.callMethod(
                this,
                "each",
                DatabaseNotificationCollection.class,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Notifications",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "notification")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object notification = assignParameter(args, 0, false);
                        env.callMethod(
                                notification, "markAsRead", DatabaseNotificationCollection.class);
                        return null;
                    }
                });
        return null;
    }

    @ConvertedMethod
    public Object markAsUnread(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Notifications")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Notifications/DatabaseNotificationCollection.php");
        env.callMethod(
                this,
                "each",
                DatabaseNotificationCollection.class,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Notifications",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "notification")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object notification = assignParameter(args, 0, false);
                        env.callMethod(
                                notification, "markAsUnread", DatabaseNotificationCollection.class);
                        return null;
                    }
                });
        return null;
    }

    public static final Object CONST_class =
            "Illuminate\\Notifications\\DatabaseNotificationCollection";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Collection.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Notifications\\DatabaseNotificationCollection")
                    .setLookup(
                            DatabaseNotificationCollection.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("items")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Notifications/DatabaseNotificationCollection.php")
                    .addInterface("Illuminate\\Contracts\\Queue\\QueueableCollection")
                    .addInterface("ArrayAccess")
                    .addInterface("Illuminate\\Contracts\\Support\\Arrayable")
                    .addInterface("Countable")
                    .addInterface("IteratorAggregate")
                    .addInterface("Traversable")
                    .addInterface("Illuminate\\Contracts\\Support\\Jsonable")
                    .addInterface("JsonSerializable")
                    .addExtendsClass("Illuminate\\Database\\Eloquent\\Collection")
                    .addExtendsClass("Illuminate\\Support\\Collection")
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
