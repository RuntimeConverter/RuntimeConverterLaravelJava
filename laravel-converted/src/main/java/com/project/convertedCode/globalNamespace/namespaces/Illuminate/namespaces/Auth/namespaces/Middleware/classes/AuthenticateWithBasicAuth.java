package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Middleware.classes;

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
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Auth/Middleware/AuthenticateWithBasicAuth.php

*/

public class AuthenticateWithBasicAuth extends RuntimeClassBase {

    public Object auth = null;

    public AuthenticateWithBasicAuth(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AuthenticateWithBasicAuth.class) {
            this.__construct(env, args);
        }
    }

    public AuthenticateWithBasicAuth(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "auth", typeHint = "Illuminate\\Contracts\\Auth\\Factory")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object auth = assignParameter(args, 0, false);
        this.auth = auth;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "next", typeHint = "Closure")
    @ConvertedParameter(
        index = 2,
        name = "guard",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object handle(RuntimeEnv env, Object... args) {
        ReferenceContainer request = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object next = assignParameter(args, 1, false);
        Object guard = assignParameter(args, 2, true);
        if (null == guard) {
            guard = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isTrue(
                                ternaryExpressionTemp =
                                        env.callMethod(
                                                env.callMethod(
                                                        this.auth,
                                                        "guard",
                                                        AuthenticateWithBasicAuth.class,
                                                        guard),
                                                "basic",
                                                AuthenticateWithBasicAuth.class))
                        ? ternaryExpressionTemp
                        : env.callFunctionDynamic(
                                        next,
                                        new RuntimeArgsWithReferences().add(0, request),
                                        request.getObject())
                                .value());
    }

    public static final Object CONST_class =
            "Illuminate\\Auth\\Middleware\\AuthenticateWithBasicAuth";

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
                    .setName("Illuminate\\Auth\\Middleware\\AuthenticateWithBasicAuth")
                    .setLookup(
                            AuthenticateWithBasicAuth.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("auth")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Auth/Middleware/AuthenticateWithBasicAuth.php")
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
