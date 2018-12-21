package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.NormalizerFormatter;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractProcessingHandler;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import java.lang.Class;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/MongoDBHandler.php

*/

public class MongoDBHandler extends AbstractProcessingHandler {

    public Object mongoCollection = null;

    public MongoDBHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MongoDBHandler.class) {
            this.__construct(env, args);
        }
    }

    public MongoDBHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mongo")
    @ConvertedParameter(index = 1, name = "database")
    @ConvertedParameter(index = 2, name = "collection")
    @ConvertedParameter(index = 3, name = "level")
    @ConvertedParameter(
        index = 4,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object mongo = assignParameter(args, 0, false);
        Object database = assignParameter(args, 1, false);
        Object collection = assignParameter(args, 2, false);
        Object level = assignParameter(args, 3, true);
        if (null == level) {
            level = Logger.CONST_DEBUG;
        }
        Object bubble = assignParameter(args, 4, true);
        if (null == bubble) {
            bubble = true;
        }
        if (!ZVal.toBool(
                        ZVal.toBool(ZVal.checkInstanceType(mongo, (Class) null, "MongoClient", env))
                                || ZVal.toBool(
                                        ZVal.checkInstanceType(mongo, (Class) null, "Mongo", env)))
                || ZVal.toBool(
                        ZVal.checkInstanceType(mongo, (Class) null, "MongoDB\\Client", env))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "MongoClient, Mongo or MongoDB\\Client instance required"));
        }

        this.mongoCollection =
                env.callMethod(
                        mongo, "selectCollection", MongoDBHandler.class, database, collection);
        super.__construct(env, level, bubble);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object write(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        this.mongoCollection, (Class) null, "MongoDB\\Collection", env))) {
            env.callMethod(
                    this.mongoCollection,
                    "insertOne",
                    MongoDBHandler.class,
                    record.arrayGet(env, "formatted"));

        } else {
            env.callMethod(
                    this.mongoCollection,
                    "save",
                    MongoDBHandler.class,
                    record.arrayGet(env, "formatted"));
        }

        return null;
    }

    @ConvertedMethod
    protected Object getDefaultFormatter(RuntimeEnv env, Object... args) {
        return ZVal.assign(new NormalizerFormatter(env));
    }

    public static final Object CONST_class = "Monolog\\Handler\\MongoDBHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends AbstractProcessingHandler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Handler\\MongoDBHandler")
                    .setLookup(
                            MongoDBHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bubble", "formatter", "level", "mongoCollection", "processors")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/MongoDBHandler.php")
                    .addInterface("Monolog\\Handler\\HandlerInterface")
                    .addExtendsClass("Monolog\\Handler\\AbstractProcessingHandler")
                    .addExtendsClass("Monolog\\Handler\\AbstractHandler")
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
