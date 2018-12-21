package com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Generator.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Generator.classes.TimeGeneratorInterface;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/ramsey/uuid/src/Generator/PeclUuidTimeGenerator.php

*/

public class PeclUuidTimeGenerator extends RuntimeClassBase implements TimeGeneratorInterface {

    public PeclUuidTimeGenerator(RuntimeEnv env, Object... args) {
        super(env);
    }

    public PeclUuidTimeGenerator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "clockSeq",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object generate(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, true);
        if (null == node) {
            node = ZVal.getNull();
        }
        Object clockSeq = assignParameter(args, 1, true);
        if (null == clockSeq) {
            clockSeq = ZVal.getNull();
        }
        Object uuid = null;
        uuid =
                com.runtimeconverter.runtime.ZVal.functionNotFound("uuid_create")
                        .env(env)
                        .call(function_constant.get(env, "UUID_TYPE_TIME"))
                        .value();
        return ZVal.assign(
                com.runtimeconverter.runtime.ZVal.functionNotFound("uuid_parse")
                        .env(env)
                        .call(uuid)
                        .value());
    }

    public static final Object CONST_class = "Ramsey\\Uuid\\Generator\\PeclUuidTimeGenerator";

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
                    .setName("Ramsey\\Uuid\\Generator\\PeclUuidTimeGenerator")
                    .setLookup(
                            PeclUuidTimeGenerator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/ramsey/uuid/src/Generator/PeclUuidTimeGenerator.php")
                    .addInterface("Ramsey\\Uuid\\Generator\\TimeGeneratorInterface")
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
