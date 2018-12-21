package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.VarDumper.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes.VarCloner;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.Caster;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/VarDumper/Cloner.php

*/

public class Cloner extends VarCloner {

    public Cloner(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.filter = 0;
        if (this.getClass() == Cloner.class) {
            this.__construct(env, args);
        }
    }

    public Cloner(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "var")
    @ConvertedParameter(index = 1, name = "filter", defaultValue = "0", defaultValueType = "number")
    public Object cloneVar(RuntimeEnv env, Object... args) {
        Object var = assignParameter(args, 0, false);
        Object filter = assignParameter(args, 1, true);
        if (null == filter) {
            filter = 0;
        }
        this.filter = filter;
        return ZVal.assign(super.cloneVar(env, var, filter));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "stub",
        typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
    )
    @ConvertedParameter(index = 1, name = "isNested")
    protected Object castResource(RuntimeEnv env, Object... args) {
        Object stub = assignParameter(args, 0, false);
        Object isNested = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.isTrue(ZVal.toLong(Caster.CONST_EXCLUDE_VERBOSE) & ZVal.toLong(this.filter))
                        ? ZVal.newArray()
                        : super.castResource(env, stub, isNested));
    }

    public static final Object CONST_class = "Psy\\VarDumper\\Cloner";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends VarCloner.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\VarDumper\\Cloner")
                    .setLookup(
                            Cloner.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "casters",
                            "classInfo",
                            "filter",
                            "filter",
                            "maxItems",
                            "maxString",
                            "minDepth",
                            "prevErrorHandler")
                    .setFilename("vendor/psy/psysh/src/VarDumper/Cloner.php")
                    .addInterface("Symfony\\Component\\VarDumper\\Cloner\\ClonerInterface")
                    .addExtendsClass("Symfony\\Component\\VarDumper\\Cloner\\VarCloner")
                    .addExtendsClass("Symfony\\Component\\VarDumper\\Cloner\\AbstractCloner")
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
