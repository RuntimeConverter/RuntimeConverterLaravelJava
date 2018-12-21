package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.namespaces.Events.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Routing/Events/RouteMatched.php

*/

public class RouteMatched extends RuntimeClassBase {

    public Object route = null;

    public Object request = null;

    public RouteMatched(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RouteMatched.class) {
            this.__construct(env, args);
        }
    }

    public RouteMatched(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "route")
    @ConvertedParameter(index = 1, name = "request")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object route = assignParameter(args, 0, false);
        Object request = assignParameter(args, 1, false);
        this.route = route;
        this.request = request;
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Routing\\Events\\RouteMatched";

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
                    .setName("Illuminate\\Routing\\Events\\RouteMatched")
                    .setLookup(
                            RouteMatched.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("request", "route")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Routing/Events/RouteMatched.php")
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
