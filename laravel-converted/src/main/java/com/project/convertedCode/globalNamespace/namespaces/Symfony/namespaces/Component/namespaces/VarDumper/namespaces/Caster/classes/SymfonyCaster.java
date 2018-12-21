package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.Caster;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Caster/SymfonyCaster.php

*/

public class SymfonyCaster extends RuntimeClassBase {

    public SymfonyCaster(RuntimeEnv env, Object... args) {
        super(env);
    }

    public SymfonyCaster(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Symfony\\Component\\VarDumper\\Caster\\SymfonyCaster";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "request",
            typeHint = "Symfony\\Component\\HttpFoundation\\Request"
        )
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castRequest(RuntimeEnv env, Object... args) {
            Object request = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object getter = null;
            Object prop = null;
            Object clone = null;
            clone = ZVal.getNull();
            for (ZPair zpairResult2206 :
                    ZVal.getIterable(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Symfony
                                                    .namespaces
                                                    .Component
                                                    .namespaces
                                                    .VarDumper
                                                    .namespaces
                                                    .Caster
                                                    .classes
                                                    .SymfonyCaster
                                                    .RequestStaticProperties
                                                    .class)
                                    .requestGetters,
                            env,
                            false)) {
                prop = ZVal.assign(zpairResult2206.getKey());
                getter = ZVal.assign(zpairResult2206.getValue());
                if (ZVal.strictEqualityCheck(
                        ZVal.getNull(),
                        "===",
                        a.arrayGet(
                                env,
                                toStringR(Caster.CONST_PREFIX_PROTECTED, env)
                                        + toStringR(prop, env)))) {
                    if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", clone)) {
                        clone = ZVal.assign(((RuntimeClassInterface) request).phpClone(env));
                    }

                    a.arrayAccess(
                                    env,
                                    toStringR(Caster.CONST_PREFIX_VIRTUAL, env)
                                            + toStringR(prop, env))
                            .set(
                                    env.callMethod(
                                            clone, toStringR(getter, env), SymfonyCaster.class));
                }
            }

            return ZVal.assign(a.getObject());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object requestGetters =
                ZVal.newArray(
                        new ZPair("pathInfo", "getPathInfo"),
                        new ZPair("requestUri", "getRequestUri"),
                        new ZPair("baseUrl", "getBaseUrl"),
                        new ZPair("basePath", "getBasePath"),
                        new ZPair("method", "getMethod"),
                        new ZPair("format", "getRequestFormat"));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\VarDumper\\Caster\\SymfonyCaster")
                    .setLookup(
                            SymfonyCaster.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("requestGetters")
                    .setFilename("vendor/symfony/var-dumper/Caster/SymfonyCaster.php")
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
