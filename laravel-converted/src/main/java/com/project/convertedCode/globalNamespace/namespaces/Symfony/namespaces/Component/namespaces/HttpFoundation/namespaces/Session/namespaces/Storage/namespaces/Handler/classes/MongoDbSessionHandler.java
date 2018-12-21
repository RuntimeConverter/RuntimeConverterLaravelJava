package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.namespaces.Handler.classes.AbstractSessionHandler;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeClasses.mongodb.UTCDateTime;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import java.lang.Class;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.mongodb.Binary;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/Session/Storage/Handler/MongoDbSessionHandler.php

*/

public class MongoDbSessionHandler extends AbstractSessionHandler {

    public Object mongo = null;

    public Object collection = null;

    public Object options = null;

    public MongoDbSessionHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MongoDbSessionHandler.class) {
            this.__construct(env, args);
        }
    }

    public MongoDbSessionHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mongo", typeHint = "MongoDB\\Client")
    @ConvertedParameter(index = 1, name = "options", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object mongo = assignParameter(args, 0, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 1, false));
        if (ZVal.toBool(!arrayActionR(ArrayAction.ISSET, options, env, "database"))
                || ZVal.toBool(!arrayActionR(ArrayAction.ISSET, options, env, "collection"))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "You must provide the \"database\" and \"collection\" option for MongoDBSessionHandler"));
        }

        this.mongo = mongo;
        this.options =
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair("id_field", "_id"),
                                        new ZPair("data_field", "data"),
                                        new ZPair("time_field", "time"),
                                        new ZPair("expiry_field", "expires_at")),
                                options.getObject())
                        .value();
        return null;
    }

    @ConvertedMethod
    public Object close(RuntimeEnv env, Object... args) {
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    protected Object doDestroy(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        env.callMethod(
                this.getCollection(env),
                "deleteOne",
                MongoDbSessionHandler.class,
                ZVal.newArray(
                        new ZPair(
                                new ReferenceClassProperty(this, "options", env)
                                        .arrayGet(env, "id_field"),
                                sessionId)));
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "maxlifetime")
    public Object gc(RuntimeEnv env, Object... args) {
        Object maxlifetime = assignParameter(args, 0, false);
        env.callMethod(
                this.getCollection(env),
                "deleteMany",
                MongoDbSessionHandler.class,
                ZVal.newArray(
                        new ZPair(
                                new ReferenceClassProperty(this, "options", env)
                                        .arrayGet(env, "expiry_field"),
                                ZVal.newArray(new ZPair("$lt", new UTCDateTime(env))))));
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    @ConvertedParameter(index = 1, name = "data")
    protected Object doWrite(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        Object expiry = null;
        Object fields = null;
        expiry =
                new UTCDateTime(
                        env,
                        ZVal.multiply(
                                ZVal.add(
                                        NamespaceGlobal.time.env(env).call().value(),
                                        ZVal.toLong(
                                                function_ini_get
                                                        .f
                                                        .env(env)
                                                        .call("session.gc_maxlifetime")
                                                        .value())),
                                1000));
        fields =
                ZVal.newArray(
                        new ZPair(
                                new ReferenceClassProperty(this, "options", env)
                                        .arrayGet(env, "time_field"),
                                new UTCDateTime(env)),
                        new ZPair(
                                new ReferenceClassProperty(this, "options", env)
                                        .arrayGet(env, "expiry_field"),
                                expiry),
                        new ZPair(
                                new ReferenceClassProperty(this, "options", env)
                                        .arrayGet(env, "data_field"),
                                new Binary(env, data, 2)));
        env.callMethod(
                this.getCollection(env),
                "updateOne",
                MongoDbSessionHandler.class,
                ZVal.newArray(
                        new ZPair(
                                new ReferenceClassProperty(this, "options", env)
                                        .arrayGet(env, "id_field"),
                                sessionId)),
                ZVal.newArray(new ZPair("$set", fields)),
                ZVal.newArray(new ZPair("upsert", true)));
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    @ConvertedParameter(index = 1, name = "data")
    public Object updateTimestamp(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        ReferenceContainer options = new BasicReferenceContainer(null);
        Object methodName = null;
        Object expiry = null;
        expiry =
                new UTCDateTime(
                        env,
                        ZVal.multiply(
                                ZVal.add(
                                        NamespaceGlobal.time.env(env).call().value(),
                                        ZVal.toLong(
                                                function_ini_get
                                                        .f
                                                        .env(env)
                                                        .call("session.gc_maxlifetime")
                                                        .value())),
                                1000));
        if (ZVal.isTrue(ZVal.checkInstanceType(this.mongo, (Class) null, "MongoDB\\Client", env))) {
            methodName = "updateOne";
            options.setObject(ZVal.newArray());

        } else {
            methodName = "update";
            options.setObject(ZVal.newArray(new ZPair("multiple", false)));
        }

        env.callMethod(
                this.getCollection(env),
                new RuntimeArgsWithReferences().add(2, options),
                toStringR(methodName, env),
                MongoDbSessionHandler.class,
                ZVal.newArray(
                        new ZPair(
                                new ReferenceClassProperty(this, "options", env)
                                        .arrayGet(env, "id_field"),
                                sessionId)),
                ZVal.newArray(
                        new ZPair(
                                "$set",
                                ZVal.newArray(
                                        new ZPair(
                                                new ReferenceClassProperty(this, "options", env)
                                                        .arrayGet(env, "time_field"),
                                                new UTCDateTime(env)),
                                        new ZPair(
                                                new ReferenceClassProperty(this, "options", env)
                                                        .arrayGet(env, "expiry_field"),
                                                expiry)))),
                options.getObject());
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    protected Object doRead(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        ReferenceContainer dbData = new BasicReferenceContainer(null);
        dbData.setObject(
                env.callMethod(
                        this.getCollection(env),
                        "findOne",
                        MongoDbSessionHandler.class,
                        ZVal.newArray(
                                new ZPair(
                                        new ReferenceClassProperty(this, "options", env)
                                                .arrayGet(env, "id_field"),
                                        sessionId),
                                new ZPair(
                                        new ReferenceClassProperty(this, "options", env)
                                                .arrayGet(env, "expiry_field"),
                                        ZVal.newArray(new ZPair("$gte", new UTCDateTime(env)))))));
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", dbData.getObject())) {
            return "";
        }

        return ZVal.assign(
                env.callMethod(
                        dbData.arrayGet(
                                env,
                                new ReferenceClassProperty(this, "options", env)
                                        .arrayGet(env, "data_field")),
                        "getData",
                        MongoDbSessionHandler.class));
    }

    @ConvertedMethod
    private Object getCollection(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.collection)) {
            this.collection =
                    env.callMethod(
                            this.mongo,
                            "selectCollection",
                            MongoDbSessionHandler.class,
                            new ReferenceClassProperty(this, "options", env)
                                    .arrayGet(env, "database"),
                            new ReferenceClassProperty(this, "options", env)
                                    .arrayGet(env, "collection"));
        }

        return ZVal.assign(this.collection);
    }

    @ConvertedMethod
    protected Object getMongo(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.mongo);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\Handler\\MongoDbSessionHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends AbstractSessionHandler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\Handler\\MongoDbSessionHandler")
                    .setLookup(
                            MongoDbSessionHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "collection",
                            "igbinaryEmptyData",
                            "mongo",
                            "newSessionId",
                            "options",
                            "prefetchData",
                            "prefetchId",
                            "sessionName")
                    .setFilename(
                            "vendor/symfony/http-foundation/Session/Storage/Handler/MongoDbSessionHandler.php")
                    .addInterface("SessionHandlerInterface")
                    .addInterface("SessionUpdateTimestampHandlerInterface")
                    .addExtendsClass(
                            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\Handler\\AbstractSessionHandler")
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
