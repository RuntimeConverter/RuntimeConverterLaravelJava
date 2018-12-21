package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes.Stub;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Caster/TraceStub.php

*/

public class TraceStub extends Stub {

    public Object keepArgs = null;

    public Object sliceOffset = null;

    public Object sliceLength = null;

    public Object numberingOffset = null;

    public TraceStub(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TraceStub.class) {
            this.__construct(env, args);
        }
    }

    public TraceStub(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "trace", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "keepArgs",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "sliceOffset",
        typeHint = "int",
        defaultValue = "0",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 3,
        name = "sliceLength",
        typeHint = "int",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "numberingOffset",
        typeHint = "int",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object trace = assignParameter(args, 0, false);
        Object keepArgs = assignParameter(args, 1, true);
        if (null == keepArgs) {
            keepArgs = true;
        }
        Object sliceOffset = assignParameter(args, 2, true);
        if (null == sliceOffset) {
            sliceOffset = 0;
        }
        Object sliceLength = assignParameter(args, 3, true);
        if (null == sliceLength) {
            sliceLength = ZVal.getNull();
        }
        Object numberingOffset = assignParameter(args, 4, true);
        if (null == numberingOffset) {
            numberingOffset = 0;
        }
        toObjectR(this).accessProp(this, env).name("value").set(trace);
        this.keepArgs = keepArgs;
        this.sliceOffset = sliceOffset;
        this.sliceLength = sliceLength;
        this.numberingOffset = numberingOffset;
        return null;
    }

    public static final Object CONST_class = "Symfony\\Component\\VarDumper\\Caster\\TraceStub";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Stub.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\VarDumper\\Caster\\TraceStub")
                    .setLookup(
                            TraceStub.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "attr",
                            "class",
                            "cut",
                            "handle",
                            "keepArgs",
                            "numberingOffset",
                            "position",
                            "refCount",
                            "sliceLength",
                            "sliceOffset",
                            "type",
                            "value")
                    .setFilename("vendor/symfony/var-dumper/Caster/TraceStub.php")
                    .addInterface("Serializable")
                    .addExtendsClass("Symfony\\Component\\VarDumper\\Cloner\\Stub")
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
