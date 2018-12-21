package com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.classes.Uuid;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Exception.classes.UnsatisfiedDependencyException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Exception.classes.UnsupportedOperationException;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/ramsey/uuid/src/DegradedUuid.php

*/

public class DegradedUuid extends Uuid {

    public DegradedUuid(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DegradedUuid.class) {
            this.__construct(env, args);
        }
    }

    public DegradedUuid(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getDateTime(RuntimeEnv env, Object... args) {
        Object unixTime = null;
        Object time = null;
        Object ts = null;
        if (ZVal.notEqualityCheck(env.callMethod(this, "getVersion", DegradedUuid.class), 1)) {
            throw ZVal.getException(
                    env, new UnsupportedOperationException(env, "Not a time-based UUID"));
        }

        time =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("converter").value(),
                        "fromHex",
                        DegradedUuid.class,
                        env.callMethod(this, "getTimestampHex", DegradedUuid.class));
        ts = env.createNew(ZVal.resolveClassAlias(env, "Moontoast\\Math\\BigNumber"), time, 20);
        env.callMethod(ts, "subtract", DegradedUuid.class, "122192928000000000");
        env.callMethod(ts, "divide", DegradedUuid.class, "10000000.0");
        env.callMethod(ts, "round", DegradedUuid.class);
        unixTime = env.callMethod(ts, "getValue", DegradedUuid.class);
        return ZVal.assign(new DateTime(env, "@" + toStringR(unixTime, env)));
    }

    @ConvertedMethod
    public Object getFields(RuntimeEnv env, Object... args) {
        throw ZVal.getException(
                env,
                new UnsatisfiedDependencyException(
                        env,
                        "Cannot call "
                                + toStringR("DegradedUuid::getFields", env)
                                + " on a 32-bit system, since some "
                                + "values overflow the system max integer value"
                                + "; consider calling getFieldsHex instead"));
    }

    @ConvertedMethod
    public Object getNode(RuntimeEnv env, Object... args) {
        throw ZVal.getException(
                env,
                new UnsatisfiedDependencyException(
                        env,
                        "Cannot call "
                                + toStringR("DegradedUuid::getNode", env)
                                + " on a 32-bit system, since node "
                                + "is an unsigned 48-bit integer and can overflow the system "
                                + "max integer value"
                                + "; consider calling getNodeHex instead"));
    }

    @ConvertedMethod
    public Object getTimeLow(RuntimeEnv env, Object... args) {
        throw ZVal.getException(
                env,
                new UnsatisfiedDependencyException(
                        env,
                        "Cannot call "
                                + toStringR("DegradedUuid::getTimeLow", env)
                                + " on a 32-bit system, since time_low "
                                + "is an unsigned 32-bit integer and can overflow the system "
                                + "max integer value"
                                + "; consider calling getTimeLowHex instead"));
    }

    @ConvertedMethod
    public Object getTimestamp(RuntimeEnv env, Object... args) {
        if (ZVal.notEqualityCheck(env.callMethod(this, "getVersion", DegradedUuid.class), 1)) {
            throw ZVal.getException(
                    env, new UnsupportedOperationException(env, "Not a time-based UUID"));
        }

        throw ZVal.getException(
                env,
                new UnsatisfiedDependencyException(
                        env,
                        "Cannot call "
                                + toStringR("DegradedUuid::getTimestamp", env)
                                + " on a 32-bit system, since timestamp "
                                + "is an unsigned 60-bit integer and can overflow the system "
                                + "max integer value"
                                + "; consider calling getTimestampHex instead"));
    }

    public static final Object CONST_class = "Ramsey\\Uuid\\DegradedUuid";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Uuid.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Ramsey\\Uuid\\DegradedUuid")
                    .setLookup(
                            DegradedUuid.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("codec", "converter", "fields")
                    .setFilename("vendor/ramsey/uuid/src/DegradedUuid.php")
                    .addInterface("Ramsey\\Uuid\\UuidInterface")
                    .addInterface("JsonSerializable")
                    .addInterface("Serializable")
                    .addExtendsClass("Ramsey\\Uuid\\Uuid")
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
