package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Generator.namespaces.Dumper.classes;

import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Generator.namespaces.Dumper.classes.GeneratorDumperInterface;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/routing/Generator/Dumper/GeneratorDumper.php

*/

public abstract class GeneratorDumper extends RuntimeClassBase implements GeneratorDumperInterface {

    public Object routes = null;

    public GeneratorDumper(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == GeneratorDumper.class) {
            this.__construct(env, args);
        }
    }

    public GeneratorDumper(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "routes",
        typeHint = "Symfony\\Component\\Routing\\RouteCollection"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object routes = assignParameter(args, 0, false);
        this.routes = routes;
        return null;
    }

    @ConvertedMethod
    public Object getRoutes(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.routes);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Routing\\Generator\\Dumper\\GeneratorDumper";

    @ConvertedMethod()
    public abstract Object dump(RuntimeEnv env, Object... args);

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
                    .setName("Symfony\\Component\\Routing\\Generator\\Dumper\\GeneratorDumper")
                    .setLookup(
                            GeneratorDumper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("routes")
                    .setFilename("vendor/symfony/routing/Generator/Dumper/GeneratorDumper.php")
                    .addInterface(
                            "Symfony\\Component\\Routing\\Generator\\Dumper\\GeneratorDumperInterface")
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
