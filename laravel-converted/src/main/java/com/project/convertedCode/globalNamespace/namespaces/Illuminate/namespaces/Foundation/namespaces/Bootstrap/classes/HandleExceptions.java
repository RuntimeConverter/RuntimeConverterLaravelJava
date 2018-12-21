package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Bootstrap.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_error_handler;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Debug.classes.ExceptionHandler;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.ConsoleOutput;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_exception_handler;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.errors.ErrorException;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.Exception.classes.FatalThrowableError;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_error_reporting;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.Exception.classes.FatalErrorException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_set;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_register_shutdown_function;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_error_get_last;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Bootstrap/HandleExceptions.php

*/

public class HandleExceptions extends RuntimeClassBase {

    public Object app = null;

    public HandleExceptions(RuntimeEnv env, Object... args) {
        super(env);
    }

    public HandleExceptions(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "app",
        typeHint = "Illuminate\\Contracts\\Foundation\\Application"
    )
    public Object bootstrap(RuntimeEnv env, Object... args) {
        Object app = assignParameter(args, 0, false);
        this.app = app;
        function_error_reporting.f.env(env).call(-1);
        function_set_error_handler
                .f
                .env(env)
                .call(ZVal.newArray(new ZPair(0, this), new ZPair(1, "handleError")));
        function_set_exception_handler
                .f
                .env(env)
                .call(ZVal.newArray(new ZPair(0, this), new ZPair(1, "handleException")));
        function_register_shutdown_function
                .f
                .env(env)
                .call(ZVal.newArray(new ZPair(0, this), new ZPair(1, "handleShutdown")));
        if (!ZVal.isTrue(env.callMethod(app, "environment", HandleExceptions.class, "testing"))) {
            function_ini_set.f.env(env).call("display_errors", "Off");
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    @ConvertedParameter(index = 1, name = "message")
    @ConvertedParameter(index = 2, name = "file")
    @ConvertedParameter(index = 3, name = "line", defaultValue = "0", defaultValueType = "number")
    @ConvertedParameter(index = 4, name = "context", defaultValue = "", defaultValueType = "array")
    public Object handleError(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, false);
        Object file = assignParameter(args, 2, true);
        if (null == file) {
            file = "";
        }
        Object line = assignParameter(args, 3, true);
        if (null == line) {
            line = 0;
        }
        Object context = assignParameter(args, 4, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        if (ZVal.isTrue(
                ZVal.toLong(function_error_reporting.f.env(env).call().value())
                        & ZVal.toLong(level))) {
            throw ZVal.getException(env, new ErrorException(env, message, 0, level, file, line));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e")
    public Object handleException(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        if (!ZVal.isTrue(ZVal.checkInstanceType(e, PHPException.class, "Exception"))) {
            e = new FatalThrowableError(env, e);
        }

        try {
            env.callMethod(this.getExceptionHandler(env), "report", HandleExceptions.class, e);
        } catch (ConvertedException convertedException36) {
            if (convertedException36.instanceOf(PHPException.class, "Exception")) {
                e = convertedException36.getObject();
            } else {
                throw convertedException36;
            }
        }

        if (ZVal.isTrue(env.callMethod(this.app, "runningInConsole", HandleExceptions.class))) {
            this.renderForConsole(env, e);

        } else {
            this.renderHttpResponse(env, e);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Exception")
    protected Object renderForConsole(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        env.callMethod(
                this.getExceptionHandler(env),
                "renderForConsole",
                HandleExceptions.class,
                new ConsoleOutput(env),
                e);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Exception")
    protected Object renderHttpResponse(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        env.callMethod(
                env.callMethod(
                        this.getExceptionHandler(env),
                        "render",
                        HandleExceptions.class,
                        new ReferenceClassProperty(this, "app", env).arrayGet(env, "request"),
                        e),
                "send",
                HandleExceptions.class);
        return null;
    }

    @ConvertedMethod
    public Object handleShutdown(RuntimeEnv env, Object... args) {
        ReferenceContainer error = new BasicReferenceContainer(null);
        if (ZVal.toBool(
                        !function_is_null
                                .f
                                .env(env)
                                .call(
                                        error.setObject(
                                                function_error_get_last.f.env(env).call().value()))
                                .getBool())
                && ZVal.toBool(this.isFatal(env, error.arrayGet(env, "type")))) {
            this.handleException(env, this.fatalExceptionFromError(env, error.getObject(), 0));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "error", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "traceOffset",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object fatalExceptionFromError(RuntimeEnv env, Object... args) {
        ReferenceContainer error = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object traceOffset = assignParameter(args, 1, true);
        if (null == traceOffset) {
            traceOffset = ZVal.getNull();
        }
        return ZVal.assign(
                new FatalErrorException(
                        env,
                        error.arrayGet(env, "message"),
                        error.arrayGet(env, "type"),
                        0,
                        error.arrayGet(env, "file"),
                        error.arrayGet(env, "line"),
                        traceOffset));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    protected Object isFatal(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        return ZVal.assign(
                function_in_array
                        .f
                        .env(env)
                        .call(
                                type,
                                ZVal.newArray(
                                        new ZPair(0, 64),
                                        new ZPair(1, 16),
                                        new ZPair(2, 1),
                                        new ZPair(3, 4)))
                        .value());
    }

    @ConvertedMethod
    protected Object getExceptionHandler(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this.app, "make", HandleExceptions.class, ExceptionHandler.CONST_class));
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Bootstrap\\HandleExceptions";

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
                    .setName("Illuminate\\Foundation\\Bootstrap\\HandleExceptions")
                    .setLookup(
                            HandleExceptions.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Bootstrap/HandleExceptions.php")
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
