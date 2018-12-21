package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.classes;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.classes.DatabaseNotificationCollection;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.Model;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Notifications/DatabaseNotification.php

*/

public class DatabaseNotification extends Model {

    public DatabaseNotification(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.incrementing = false;
        this.table = "notifications";
        this.guarded = ZVal.newArray();
        this.casts = ZVal.newArray(new ZPair("data", "array"), new ZPair("read_at", "datetime"));
        if (this.getClass() == DatabaseNotification.class) {
            this.__construct(env, args);
        }
    }

    public DatabaseNotification(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object notifiable(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "morphTo", DatabaseNotification.class));
    }

    @ConvertedMethod
    public Object markAsRead(RuntimeEnv env, Object... args) {
        if (function_is_null
                .f
                .env(env)
                .call(toObjectR(this).accessProp(this, env).name("read_at").value())
                .getBool()) {
            env.callMethod(
                    env.callMethod(
                            this,
                            "forceFill",
                            DatabaseNotification.class,
                            ZVal.newArray(
                                    new ZPair(
                                            "read_at",
                                            env.callMethod(
                                                    this,
                                                    "freshTimestamp",
                                                    DatabaseNotification.class)))),
                    "save",
                    DatabaseNotification.class);
        }

        return null;
    }

    @ConvertedMethod
    public Object markAsUnread(RuntimeEnv env, Object... args) {
        if (!function_is_null
                .f
                .env(env)
                .call(toObjectR(this).accessProp(this, env).name("read_at").value())
                .getBool()) {
            env.callMethod(
                    env.callMethod(
                            this,
                            "forceFill",
                            DatabaseNotification.class,
                            ZVal.newArray(new ZPair("read_at", ZVal.getNull()))),
                    "save",
                    DatabaseNotification.class);
        }

        return null;
    }

    @ConvertedMethod
    public Object read(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        toObjectR(this).accessProp(this, env).name("read_at").value(),
                        "!==",
                        ZVal.getNull()));
    }

    @ConvertedMethod
    public Object unread(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        toObjectR(this).accessProp(this, env).name("read_at").value(),
                        "===",
                        ZVal.getNull()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "models",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object newCollection(RuntimeEnv env, Object... args) {
        Object models = assignParameter(args, 0, true);
        if (null == models) {
            models = ZVal.newArray();
        }
        return ZVal.assign(new DatabaseNotificationCollection(env, models));
    }

    public static final Object CONST_class = "Illuminate\\Notifications\\DatabaseNotification";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Model.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Notifications\\DatabaseNotification")
                    .setLookup(
                            DatabaseNotification.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "appends",
                            "attributes",
                            "casts",
                            "casts",
                            "changes",
                            "connection",
                            "dateFormat",
                            "dates",
                            "dispatchesEvents",
                            "exists",
                            "fillable",
                            "guarded",
                            "guarded",
                            "hidden",
                            "incrementing",
                            "incrementing",
                            "keyType",
                            "observables",
                            "original",
                            "perPage",
                            "primaryKey",
                            "relations",
                            "table",
                            "table",
                            "timestamps",
                            "touches",
                            "visible",
                            "wasRecentlyCreated",
                            "with",
                            "withCount")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Notifications/DatabaseNotification.php")
                    .addInterface("ArrayAccess")
                    .addInterface("Illuminate\\Contracts\\Support\\Arrayable")
                    .addInterface("Illuminate\\Contracts\\Support\\Jsonable")
                    .addInterface("JsonSerializable")
                    .addInterface("Illuminate\\Contracts\\Queue\\QueueableEntity")
                    .addInterface("Illuminate\\Contracts\\Routing\\UrlRoutable")
                    .addExtendsClass("Illuminate\\Database\\Eloquent\\Model")
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
