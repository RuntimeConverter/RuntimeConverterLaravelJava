package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Processor.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Processor/UidProcessor.php

*/

public class UidProcessor extends RuntimeClassBase {

    public Object uid = null;

    public UidProcessor(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == UidProcessor.class) {
            this.__construct(env, args);
        }
    }

    public UidProcessor(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "length", defaultValue = "7", defaultValueType = "number")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object length = assignParameter(args, 0, true);
        if (null == length) {
            length = 7;
        }
        if (ZVal.toBool(
                        ZVal.toBool(!function_is_int.f.env(env).call(length).getBool())
                                || ZVal.toBool(ZVal.isGreaterThan(length, '>', 32)))
                || ZVal.toBool(ZVal.isLessThan(length, '<', 1))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "The uid length must be an integer between 1 and 32"));
        }

        this.uid =
                function_substr
                        .f
                        .env(env)
                        .call(
                                NamespaceGlobal.hash
                                        .env(env)
                                        .call(
                                                "md5",
                                                NamespaceGlobal.uniqid
                                                        .env(env)
                                                        .call("", true)
                                                        .value())
                                        .value(),
                                0,
                                length)
                        .value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object __invoke(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        record.arrayAccess(env, "extra", "uid").set(this.uid);
        return ZVal.assign(record.getObject());
    }

    @ConvertedMethod
    public Object getUid(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.uid);
    }

    public static final Object CONST_class = "Monolog\\Processor\\UidProcessor";

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
                    .setName("Monolog\\Processor\\UidProcessor")
                    .setLookup(
                            UidProcessor.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("uid")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Processor/UidProcessor.php")
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
