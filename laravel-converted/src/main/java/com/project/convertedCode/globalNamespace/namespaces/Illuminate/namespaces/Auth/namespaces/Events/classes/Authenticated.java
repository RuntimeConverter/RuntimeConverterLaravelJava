package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Events.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import java.lang.Class;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Auth/Events/Authenticated.php

*/

public class Authenticated extends RuntimeClassBase {

    public Object user = null;

    public Authenticated(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Authenticated.class) {
            this.__construct(env, args);
        }
    }

    public Authenticated(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "user")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object user = assignParameter(args, 0, false);
        this.user = user;
        return null;
    }

    @ConvertedMethod
    public Object __sleep(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Queue")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Queue/SerializesModels.php");
        Object property = null;
        Object properties = null;
        properties =
                env.callMethod(
                        new ReflectionClass(env, this), "getProperties", Authenticated.class);
        for (ZPair zpairResult2255 : ZVal.getIterable(properties, env, true)) {
            property = ZVal.assign(zpairResult2255.getValue());
            env.callMethod(
                    property,
                    "setValue",
                    Authenticated.class,
                    this,
                    this.getSerializedPropertyValue(env, this.getPropertyValue(env, property)));
        }

        return ZVal.assign(
                function_array_values
                        .f
                        .env(env)
                        .call(
                                function_array_filter
                                        .f
                                        .env(env)
                                        .call(
                                                function_array_map
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                new Closure(
                                                                        env,
                                                                        runtimeConverterFunctionClassConstants,
                                                                        "Illuminate\\Queue",
                                                                        this) {
                                                                    @Override
                                                                    @ConvertedMethod
                                                                    @ConvertedParameter(
                                                                        index = 0,
                                                                        name = "p"
                                                                    )
                                                                    public Object run(
                                                                            RuntimeEnv env,
                                                                            Object thisvar,
                                                                            PassByReferenceArgs
                                                                                    runtimePassByReferenceArgs,
                                                                            Object... args) {
                                                                        Object p =
                                                                                assignParameter(
                                                                                        args, 0,
                                                                                        false);
                                                                        return ZVal.assign(
                                                                                ZVal.isTrue(
                                                                                                env
                                                                                                        .callMethod(
                                                                                                                p,
                                                                                                                "isStatic",
                                                                                                                Authenticated
                                                                                                                        .class))
                                                                                        ? ZVal
                                                                                                .getNull()
                                                                                        : env
                                                                                                .callMethod(
                                                                                                        p,
                                                                                                        "getName",
                                                                                                        Authenticated
                                                                                                                .class));
                                                                    }
                                                                },
                                                                properties)
                                                        .value())
                                        .value())
                        .value());
    }

    @ConvertedMethod
    public Object __wakeup(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object property = null;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult2256 :
                ZVal.getIterable(
                        env.callMethod(
                                new ReflectionClass(env, this),
                                "getProperties",
                                Authenticated.class),
                        env,
                        true)) {
            property = ZVal.assign(zpairResult2256.getValue());
            if (ZVal.isTrue(env.callMethod(property, "isStatic", Authenticated.class))) {
                continue;
            }

            env.callMethod(
                    property,
                    "setValue",
                    Authenticated.class,
                    this,
                    this.getRestoredPropertyValue(env, this.getPropertyValue(env, property)));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "property", typeHint = "ReflectionProperty")
    protected Object getPropertyValue(RuntimeEnv env, Object... args) {
        Object property = assignParameter(args, 0, false);
        env.callMethod(property, "setAccessible", Authenticated.class, true);
        return ZVal.assign(env.callMethod(property, "getValue", Authenticated.class, this));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object getSerializedPropertyValue(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        if (ZVal.isTrue(ZVal.checkInstanceType(value, (Class) null, "QueueableCollection", env))) {
            return ZVal.assign(
                    env.createNew(
                            ZVal.resolveClassAlias(env, "ModelIdentifier"),
                            env.callMethod(value, "getQueueableClass", Authenticated.class),
                            env.callMethod(value, "getQueueableIds", Authenticated.class),
                            env.callMethod(value, "getQueueableRelations", Authenticated.class),
                            env.callMethod(value, "getQueueableConnection", Authenticated.class)));
        }

        if (ZVal.isTrue(ZVal.checkInstanceType(value, (Class) null, "QueueableEntity", env))) {
            return ZVal.assign(
                    env.createNew(
                            ZVal.resolveClassAlias(env, "ModelIdentifier"),
                            function_get_class.f.env(env).call(value).value(),
                            env.callMethod(value, "getQueueableId", Authenticated.class),
                            env.callMethod(value, "getQueueableRelations", Authenticated.class),
                            env.callMethod(value, "getQueueableConnection", Authenticated.class)));
        }

        return ZVal.assign(value);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object getRestoredPropertyValue(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        if (!ZVal.isTrue(ZVal.checkInstanceType(value, (Class) null, "ModelIdentifier", env))) {
            return ZVal.assign(value);
        }

        return ZVal.assign(
                function_is_array
                                .f
                                .env(env)
                                .call(toObjectR(value).accessProp(this, env).name("id").value())
                                .getBool()
                        ? this.restoreCollection(env, value)
                        : this.restoreModel(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object restoreCollection(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        if (ZVal.toBool(!toObjectR(value).accessProp(this, env).name("class").getBool())
                || ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                function_count
                                        .f
                                        .env(env)
                                        .call(
                                                toObjectR(value)
                                                        .accessProp(this, env)
                                                        .name("id")
                                                        .value())
                                        .value(),
                                "===",
                                0))) {
            return ZVal.assign(env.createNew(ZVal.resolveClassAlias(env, "EloquentCollection")));
        }

        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                this.getQueryForModelRestoration(
                                        env,
                                        env.callMethod(
                                                env.createNew(
                                                        toObjectR(value)
                                                                .accessProp(this, env)
                                                                .name("class")
                                                                .value()),
                                                "setConnection",
                                                Authenticated.class,
                                                toObjectR(value)
                                                        .accessProp(this, env)
                                                        .name("connection")
                                                        .value()),
                                        toObjectR(value).accessProp(this, env).name("id").value()),
                                "useWritePdo",
                                Authenticated.class),
                        "get",
                        Authenticated.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object restoreModel(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        this.getQueryForModelRestoration(
                                                env,
                                                env.callMethod(
                                                        env.createNew(
                                                                toObjectR(value)
                                                                        .accessProp(this, env)
                                                                        .name("class")
                                                                        .value()),
                                                        "setConnection",
                                                        Authenticated.class,
                                                        toObjectR(value)
                                                                .accessProp(this, env)
                                                                .name("connection")
                                                                .value()),
                                                toObjectR(value)
                                                        .accessProp(this, env)
                                                        .name("id")
                                                        .value()),
                                        "useWritePdo",
                                        Authenticated.class),
                                "firstOrFail",
                                Authenticated.class),
                        "load",
                        Authenticated.class,
                        ZVal.isDefined(
                                        ternaryExpressionTemp =
                                                toObjectR(value)
                                                        .accessProp(this, env)
                                                        .name("relations")
                                                        .value())
                                ? ternaryExpressionTemp
                                : ZVal.newArray()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "model")
    @ConvertedParameter(index = 1, name = "ids")
    protected Object getQueryForModelRestoration(RuntimeEnv env, Object... args) {
        Object model = assignParameter(args, 0, false);
        Object ids = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(model, "newQueryForRestoration", Authenticated.class, ids));
    }

    public static final Object CONST_class = "Illuminate\\Auth\\Events\\Authenticated";

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
                    .setName("Illuminate\\Auth\\Events\\Authenticated")
                    .setLookup(
                            Authenticated.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("user")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Auth/Events/Authenticated.php")
                    .addTrait("Illuminate\\Queue\\SerializesModels")
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
