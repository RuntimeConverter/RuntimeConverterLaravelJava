package com.project.convertedCode.globalNamespace.namespaces.NunoMaduro.namespaces.Collision.namespaces.Adapters.namespaces.Laravel.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.ExceptionInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.NunoMaduro.namespaces.Collision.namespaces.Contracts.classes.Provider;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.NunoMaduro.namespaces.Collision.namespaces.Adapters.namespaces.Laravel.classes.Inspector;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nunomaduro/collision/src/Adapters/Laravel/ExceptionHandler.php

*/

public class ExceptionHandler extends RuntimeClassBase
        implements com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Contracts
                .namespaces
                .Debug
                .classes
                .ExceptionHandler {

    public Object appExceptionHandler = null;

    public Object app = null;

    public ExceptionHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ExceptionHandler.class) {
            this.__construct(env, args);
        }
    }

    public ExceptionHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "app",
        typeHint = "Illuminate\\Contracts\\Foundation\\Application"
    )
    @ConvertedParameter(
        index = 1,
        name = "appExceptionHandler",
        typeHint = "Illuminate\\Contracts\\Debug\\ExceptionHandler"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object app = assignParameter(args, 0, false);
        Object appExceptionHandler = assignParameter(args, 1, false);
        this.app = app;
        this.appExceptionHandler = appExceptionHandler;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Exception")
    public Object report(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        env.callMethod(this.appExceptionHandler, "report", ExceptionHandler.class, e);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "e", typeHint = "Exception")
    public Object render(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object e = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        this.appExceptionHandler, "render", ExceptionHandler.class, request, e));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "output")
    @ConvertedParameter(index = 1, name = "e", typeHint = "Exception")
    public Object renderForConsole(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        Object e = assignParameter(args, 1, false);
        Object handler = null;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        e,
                        ExceptionInterface.class,
                        "Symfony\\Component\\Console\\Exception\\ExceptionInterface"))) {
            env.callMethod(
                    this.appExceptionHandler,
                    "renderForConsole",
                    ExceptionHandler.class,
                    output,
                    e);

        } else {
            handler =
                    env.callMethod(
                            env.callMethod(
                                    env.callMethod(
                                            env.callMethod(
                                                    this.app,
                                                    "make",
                                                    ExceptionHandler.class,
                                                    Provider.CONST_class),
                                            "register",
                                            ExceptionHandler.class),
                                    "getHandler",
                                    ExceptionHandler.class),
                            "setOutput",
                            ExceptionHandler.class,
                            output);
            env.callMethod(handler, "setInspector", ExceptionHandler.class, new Inspector(env, e));
            env.callMethod(handler, "handle", ExceptionHandler.class);
        }

        return null;
    }

    public static final Object CONST_class =
            "NunoMaduro\\Collision\\Adapters\\Laravel\\ExceptionHandler";

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
                    .setName("NunoMaduro\\Collision\\Adapters\\Laravel\\ExceptionHandler")
                    .setLookup(
                            ExceptionHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "appExceptionHandler")
                    .setFilename(
                            "vendor/nunomaduro/collision/src/Adapters/Laravel/ExceptionHandler.php")
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
