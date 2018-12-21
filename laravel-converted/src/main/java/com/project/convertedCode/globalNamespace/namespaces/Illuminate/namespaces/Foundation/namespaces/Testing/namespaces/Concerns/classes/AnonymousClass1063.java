package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Testing.namespaces.Concerns.classes;

import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Exception.classes.NotFoundHttpException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Debug.classes.ExceptionHandler;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.classes.Application;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Testing/Concerns/InteractsWithExceptionHandling.php

*/

public class AnonymousClass1063 extends RuntimeClassBase implements ExceptionHandler {

    public Object except = null;

    public Object originalHandler = null;

    public AnonymousClass1063(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AnonymousClass1063.class) {
            this.__construct(env, args);
        }
    }

    public AnonymousClass1063(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "originalHandler")
    @ConvertedParameter(index = 1, name = "except", defaultValue = "", defaultValueType = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object originalHandler = assignParameter(args, 0, false);
        Object except = assignParameter(args, 1, true);
        if (null == except) {
            except = ZVal.newArray();
        }
        this.except = except;
        this.originalHandler = originalHandler;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Exception")
    public Object report(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "e", typeHint = "Exception")
    public Object render(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object e = assignParameter(args, 1, false);
        Object _pClass = null;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        e,
                        NotFoundHttpException.class,
                        "Symfony\\Component\\HttpKernel\\Exception\\NotFoundHttpException"))) {
            throw ZVal.getException(
                    env,
                    new NotFoundHttpException(
                            env,
                            toStringR(
                                            env.callMethod(
                                                    request, "method", AnonymousClass1063.class),
                                            env)
                                    + " "
                                    + toStringR(
                                            env.callMethod(
                                                    request, "url", AnonymousClass1063.class),
                                            env),
                            ZVal.getNull(),
                            env.callMethod(e, "getCode", AnonymousClass1063.class)));
        }

        for (ZPair zpairResult430 : ZVal.getIterable(this.except, env, true)) {
            _pClass = ZVal.assign(zpairResult430.getValue());
            if (ZVal.isTrue(ZVal.checkInstanceTypeMatch(e, _pClass))) {
                return ZVal.assign(
                        env.callMethod(
                                this.originalHandler,
                                "render",
                                AnonymousClass1063.class,
                                request,
                                e));
            }
        }

        throw ZVal.getException(env, e);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "output")
    @ConvertedParameter(index = 1, name = "e", typeHint = "Exception")
    public Object renderForConsole(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        Object e = assignParameter(args, 1, false);
        env.callMethod(
                new Application(env), "renderException", AnonymousClass1063.class, e, output);
        return null;
    }

    public static final Object CONST_class =
            "Illuminate\\Foundation\\Testing\\Concerns\\AnonymousClass1063";

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
                    .setName("Illuminate\\Foundation\\Testing\\Concerns\\AnonymousClass1063")
                    .setLookup(
                            AnonymousClass1063.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("except", "originalHandler")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Testing/Concerns/InteractsWithExceptionHandling.php")
                    .addInterface("Illuminate\\Contracts\\Debug\\ExceptionHandler")
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
