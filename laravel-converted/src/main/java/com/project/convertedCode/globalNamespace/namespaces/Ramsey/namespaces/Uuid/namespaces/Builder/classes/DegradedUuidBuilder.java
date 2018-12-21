package com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Builder.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.classes.DegradedUuid;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Builder.classes.UuidBuilderInterface;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/ramsey/uuid/src/Builder/DegradedUuidBuilder.php

*/

public class DegradedUuidBuilder extends RuntimeClassBase implements UuidBuilderInterface {

    public Object converter = null;

    public DegradedUuidBuilder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DegradedUuidBuilder.class) {
            this.__construct(env, args);
        }
    }

    public DegradedUuidBuilder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "converter",
        typeHint = "Ramsey\\Uuid\\Converter\\NumberConverterInterface"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object converter = assignParameter(args, 0, false);
        this.converter = converter;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "codec", typeHint = "Ramsey\\Uuid\\Codec\\CodecInterface")
    @ConvertedParameter(index = 1, name = "fields", typeHint = "array")
    public Object build(RuntimeEnv env, Object... args) {
        Object codec = assignParameter(args, 0, false);
        Object fields = assignParameter(args, 1, false);
        return ZVal.assign(new DegradedUuid(env, fields, this.converter, codec));
    }

    public static final Object CONST_class = "Ramsey\\Uuid\\Builder\\DegradedUuidBuilder";

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
                    .setName("Ramsey\\Uuid\\Builder\\DegradedUuidBuilder")
                    .setLookup(
                            DegradedUuidBuilder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("converter")
                    .setFilename("vendor/ramsey/uuid/src/Builder/DegradedUuidBuilder.php")
                    .addInterface("Ramsey\\Uuid\\Builder\\UuidBuilderInterface")
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
