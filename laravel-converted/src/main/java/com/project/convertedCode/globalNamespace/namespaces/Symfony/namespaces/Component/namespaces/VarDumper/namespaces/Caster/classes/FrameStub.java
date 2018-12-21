package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes;

import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.EnumStub;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
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

 vendor/symfony/var-dumper/Caster/FrameStub.php

*/

public class FrameStub extends EnumStub {

    public Object keepArgs = null;

    public Object inTraceStub = null;

    public FrameStub(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FrameStub.class) {
            this.__construct(env, args);
        }
    }

    public FrameStub(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "frame", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "keepArgs",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "inTraceStub",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object frame = assignParameter(args, 0, false);
        Object keepArgs = assignParameter(args, 1, true);
        if (null == keepArgs) {
            keepArgs = true;
        }
        Object inTraceStub = assignParameter(args, 2, true);
        if (null == inTraceStub) {
            inTraceStub = false;
        }
        toObjectR(this).accessProp(this, env).name("value").set(frame);
        this.keepArgs = keepArgs;
        this.inTraceStub = inTraceStub;
        return null;
    }

    public static final Object CONST_class = "Symfony\\Component\\VarDumper\\Caster\\FrameStub";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends EnumStub.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\VarDumper\\Caster\\FrameStub")
                    .setLookup(
                            FrameStub.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "attr",
                            "class",
                            "cut",
                            "dumpKeys",
                            "handle",
                            "inTraceStub",
                            "keepArgs",
                            "position",
                            "refCount",
                            "type",
                            "value")
                    .setFilename("vendor/symfony/var-dumper/Caster/FrameStub.php")
                    .addInterface("Serializable")
                    .addExtendsClass("Symfony\\Component\\VarDumper\\Caster\\EnumStub")
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
