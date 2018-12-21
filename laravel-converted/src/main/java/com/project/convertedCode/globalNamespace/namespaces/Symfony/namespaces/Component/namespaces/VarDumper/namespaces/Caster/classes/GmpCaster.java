package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.Caster;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.ConstStub;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Caster/GmpCaster.php

*/

public class GmpCaster extends RuntimeClassBase {

    public GmpCaster(RuntimeEnv env, Object... args) {
        super(env);
    }

    public GmpCaster(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Symfony\\Component\\VarDumper\\Caster\\GmpCaster";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "gmp", typeHint = "GMP")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        @ConvertedParameter(index = 4, name = "filter")
        public Object castGmp(RuntimeEnv env, Object... args) {
            Object gmp = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object filter = assignParameter(args, 4, false);
            a.arrayAccess(env, toStringR(Caster.CONST_PREFIX_VIRTUAL, env) + "value")
                    .set(
                            new ConstStub(
                                    env,
                                    com.runtimeconverter.runtime.ZVal.functionNotFound("gmp_strval")
                                            .env(env)
                                            .call(gmp)
                                            .value(),
                                    com.runtimeconverter.runtime.ZVal.functionNotFound("gmp_strval")
                                            .env(env)
                                            .call(gmp)
                                            .value()));
            return ZVal.assign(a.getObject());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\VarDumper\\Caster\\GmpCaster")
                    .setLookup(
                            GmpCaster.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/var-dumper/Caster/GmpCaster.php")
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
