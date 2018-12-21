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

 vendor/symfony/var-dumper/Caster/EnumStub.php

*/

public class EnumStub extends Stub {

    public Object dumpKeys = true;

    public EnumStub(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == EnumStub.class) {
            this.__construct(env, args);
        }
    }

    public EnumStub(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "dumpKeys",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, false);
        Object dumpKeys = assignParameter(args, 1, true);
        if (null == dumpKeys) {
            dumpKeys = true;
        }
        toObjectR(this).accessProp(this, env).name("value").set(values);
        this.dumpKeys = dumpKeys;
        return null;
    }

    public static final Object CONST_class = "Symfony\\Component\\VarDumper\\Caster\\EnumStub";

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
                    .setName("Symfony\\Component\\VarDumper\\Caster\\EnumStub")
                    .setLookup(
                            EnumStub.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "attr",
                            "class",
                            "cut",
                            "dumpKeys",
                            "handle",
                            "position",
                            "refCount",
                            "type",
                            "value")
                    .setFilename("vendor/symfony/var-dumper/Caster/EnumStub.php")
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
