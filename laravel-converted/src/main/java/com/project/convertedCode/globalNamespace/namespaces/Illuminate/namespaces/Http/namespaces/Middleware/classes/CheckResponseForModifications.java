package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Middleware.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.Response;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Http/Middleware/CheckResponseForModifications.php

*/

public class CheckResponseForModifications extends RuntimeClassBase {

    public CheckResponseForModifications(RuntimeEnv env, Object... args) {
        super(env);
    }

    public CheckResponseForModifications(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "next", typeHint = "Closure")
    public Object handle(RuntimeEnv env, Object... args) {
        ReferenceContainer request = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object next = assignParameter(args, 1, false);
        Object response = null;
        response =
                env.callFunctionDynamic(
                                next,
                                new RuntimeArgsWithReferences().add(0, request),
                                request.getObject())
                        .value();
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        response,
                        Response.class,
                        "Symfony\\Component\\HttpFoundation\\Response"))) {
            env.callMethod(
                    response,
                    "isNotModified",
                    CheckResponseForModifications.class,
                    request.getObject());
        }

        return ZVal.assign(response);
    }

    public static final Object CONST_class =
            "Illuminate\\Http\\Middleware\\CheckResponseForModifications";

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
                    .setName("Illuminate\\Http\\Middleware\\CheckResponseForModifications")
                    .setLookup(
                            CheckResponseForModifications.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Http/Middleware/CheckResponseForModifications.php")
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
