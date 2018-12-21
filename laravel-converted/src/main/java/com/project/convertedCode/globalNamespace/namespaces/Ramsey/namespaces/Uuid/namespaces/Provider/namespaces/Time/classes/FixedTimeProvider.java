package com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Provider.namespaces.Time.classes;

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
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Provider.classes.TimeProviderInterface;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/ramsey/uuid/src/Provider/Time/FixedTimeProvider.php

*/

public class FixedTimeProvider extends RuntimeClassBase implements TimeProviderInterface {

    public Object fixedTime = null;

    public FixedTimeProvider(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FixedTimeProvider.class) {
            this.__construct(env, args);
        }
    }

    public FixedTimeProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "timestamp", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object timestamp = assignParameter(args, 0, false);
        if (ZVal.toBool(!function_array_key_exists.f.env(env).call("sec", timestamp).getBool())
                || ZVal.toBool(
                        !function_array_key_exists.f.env(env).call("usec", timestamp).getBool())) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(env, "Array must contain sec and usec keys."));
        }

        this.fixedTime = timestamp;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object setUsec(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "fixedTime", env).arrayAccess(env, "usec").set(value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object setSec(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "fixedTime", env).arrayAccess(env, "sec").set(value);
        return null;
    }

    @ConvertedMethod
    public Object currentTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.fixedTime);
    }

    public static final Object CONST_class = "Ramsey\\Uuid\\Provider\\Time\\FixedTimeProvider";

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
                    .setName("Ramsey\\Uuid\\Provider\\Time\\FixedTimeProvider")
                    .setLookup(
                            FixedTimeProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("fixedTime")
                    .setFilename("vendor/ramsey/uuid/src/Provider/Time/FixedTimeProvider.php")
                    .addInterface("Ramsey\\Uuid\\Provider\\TimeProviderInterface")
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
