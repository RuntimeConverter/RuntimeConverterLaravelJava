package com.project.convertedCode.globalNamespace.namespaces.Whoops.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Handler.classes.CallbackHandler;
import com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Handler.classes.HandlerInterface;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reverse;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Util.classes.SystemFacade;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.http.function_header;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Exception.classes.Inspector;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Exception.classes.ErrorException;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Util.classes.Misc;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Handler.classes.Handler;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Whoops.classes.RunInterface;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_num_args;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/filp/whoops/src/Whoops/Run.php

*/

public final class Run extends RuntimeClassBase implements RunInterface {

    public Object isRegistered = null;

    public Object allowQuit = true;

    public Object sendOutput = true;

    public Object sendHttpCode = 500;

    public Object handlerStack = ZVal.newArray();

    public Object silencedPatterns = ZVal.newArray();

    public Object system = null;

    public Object canThrowExceptions = true;

    public Run(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Run.class) {
            this.__construct(env, args);
        }
    }

    public Run(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "system",
        typeHint = "Whoops\\Util\\SystemFacade",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object system = assignParameter(args, 0, true);
        if (null == system) {
            system = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.system =
                ZVal.isTrue(ternaryExpressionTemp = system)
                        ? ternaryExpressionTemp
                        : new SystemFacade(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "handler")
    public Object pushHandler(RuntimeEnv env, Object... args) {
        Object handler = assignParameter(args, 0, false);
        if (function_is_callable.f.env(env).call(handler).getBool()) {
            handler = new CallbackHandler(env, handler);
        }

        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        handler, HandlerInterface.class, "Whoops\\Handler\\HandlerInterface"))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Argument to "
                                    + toStringR("Run::pushHandler", env)
                                    + " must be a callable, or instance of "
                                    + "Whoops\\Handler\\HandlerInterface"));
        }

        new ReferenceClassProperty(this, "handlerStack", env).arrayAppend(env).set(handler);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object popHandler(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_array_pop.f.env(env).call(this.handlerStack).value());
    }

    @ConvertedMethod
    public Object getHandlers(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.handlerStack);
    }

    @ConvertedMethod
    public Object clearHandlers(RuntimeEnv env, Object... args) {
        this.handlerStack = ZVal.newArray();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exception")
    private Object getInspector(RuntimeEnv env, Object... args) {
        Object exception = assignParameter(args, 0, false);
        return ZVal.assign(new Inspector(env, exception));
    }

    @ConvertedMethod
    public Object register(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.isRegistered)) {
            function_class_exists.f.env(env).call("\\Whoops\\Exception\\ErrorException");
            function_class_exists.f.env(env).call("\\Whoops\\Exception\\FrameCollection");
            function_class_exists.f.env(env).call("\\Whoops\\Exception\\Frame");
            function_class_exists.f.env(env).call("\\Whoops\\Exception\\Inspector");
            env.callMethod(
                    this.system,
                    "setErrorHandler",
                    Run.class,
                    ZVal.newArray(new ZPair(0, this), new ZPair(1, CONST_ERROR_HANDLER)));
            env.callMethod(
                    this.system,
                    "setExceptionHandler",
                    Run.class,
                    ZVal.newArray(new ZPair(0, this), new ZPair(1, CONST_EXCEPTION_HANDLER)));
            env.callMethod(
                    this.system,
                    "registerShutdownFunction",
                    Run.class,
                    ZVal.newArray(new ZPair(0, this), new ZPair(1, CONST_SHUTDOWN_HANDLER)));
            this.isRegistered = true;
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object unregister(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.isRegistered)) {
            env.callMethod(this.system, "restoreExceptionHandler", Run.class);
            env.callMethod(this.system, "restoreErrorHandler", Run.class);
            this.isRegistered = false;
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "exit",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object allowQuit(RuntimeEnv env, Object... args) {
        Object exit = assignParameter(args, 0, true);
        if (null == exit) {
            exit = ZVal.getNull();
        }
        if (ZVal.equalityCheck(
                function_func_num_args
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call()
                        .value(),
                0)) {
            return ZVal.assign(this.allowQuit);
        }

        return ZVal.assign(this.allowQuit = ZVal.toBool(exit));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "patterns")
    @ConvertedParameter(
        index = 1,
        name = "levels",
        defaultValue = "10240",
        defaultValueType = "number"
    )
    public Object silenceErrorsInPaths(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/filp/whoops/src/Whoops")
                        .setFile("/vendor/filp/whoops/src/Whoops/Run.php");
        Object patterns = assignParameter(args, 0, false);
        Object levels = assignParameter(args, 1, true);
        if (null == levels) {
            levels = 10240;
        }
        this.silencedPatterns =
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                this.silencedPatterns,
                                function_array_map
                                        .f
                                        .env(env)
                                        .call(
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Whoops",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(index = 0, name = "pattern")
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object pattern =
                                                                assignParameter(args, 0, false);
                                                        Object levels = null;
                                                        levels =
                                                                this.contextReferences
                                                                        .getCapturedValue("levels");
                                                        return ZVal.assign(
                                                                ZVal.newArray(
                                                                        new ZPair(
                                                                                "pattern", pattern),
                                                                        new ZPair(
                                                                                "levels", levels)));
                                                    }
                                                }.use("levels", levels),
                                                rToArrayCast(patterns))
                                        .value())
                        .value();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getSilenceErrorsInPaths(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.silencedPatterns);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "code",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object sendHttpCode(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, true);
        if (null == code) {
            code = ZVal.getNull();
        }
        if (ZVal.equalityCheck(
                function_func_num_args
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call()
                        .value(),
                0)) {
            return ZVal.assign(this.sendHttpCode);
        }

        if (!ZVal.isTrue(code)) {
            return ZVal.assign(this.sendHttpCode = false);
        }

        if (ZVal.strictEqualityCheck(code, "===", true)) {
            code = 500;
        }

        if (ZVal.toBool(ZVal.isLessThan(code, '<', 400))
                || ZVal.toBool(ZVal.isLessThanOrEqualTo(600, "<=", code))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Invalid status code '"
                                    + toStringR(code, env)
                                    + "', must be 4xx or 5xx"));
        }

        return ZVal.assign(this.sendHttpCode = code);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "send",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object writeToOutput(RuntimeEnv env, Object... args) {
        Object send = assignParameter(args, 0, true);
        if (null == send) {
            send = ZVal.getNull();
        }
        if (ZVal.equalityCheck(
                function_func_num_args
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call()
                        .value(),
                0)) {
            return ZVal.assign(this.sendOutput);
        }

        return ZVal.assign(this.sendOutput = ZVal.toBool(send));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exception")
    public Object handleException(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object exception = assignParameter(args, 0, false);
        Object output = null;
        Object handler = null;
        Object handlerContentType = null;
        Object handlerResponse = null;
        Object inspector = null;
        Object willQuit = null;
        inspector = this.getInspector(env, exception);
        env.callMethod(this.system, "startOutputBuffering", Run.class);
        handlerResponse = ZVal.getNull();
        handlerContentType = ZVal.getNull();
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult59 :
                ZVal.getIterable(
                        function_array_reverse.f.env(env).call(this.handlerStack).value(),
                        env,
                        true)) {
            handler = ZVal.assign(zpairResult59.getValue());
            env.callMethod(handler, "setRun", Run.class, this);
            env.callMethod(handler, "setInspector", Run.class, inspector);
            env.callMethod(handler, "setException", Run.class, exception);
            handlerResponse = env.callMethod(handler, "handle", Run.class, exception);
            handlerContentType =
                    ZVal.assign(
                            function_method_exists.f.env(env).call(handler, "contentType").getBool()
                                    ? env.callMethod(handler, "contentType", Run.class)
                                    : ZVal.getNull());
            if (function_in_array
                    .f
                    .env(env)
                    .call(
                            handlerResponse,
                            ZVal.newArray(
                                    new ZPair(0, Handler.CONST_LAST_HANDLER),
                                    new ZPair(1, Handler.CONST_QUIT)))
                    .getBool()) {
                break;
            }
        }

        willQuit =
                ZVal.toBool(ZVal.equalityCheck(handlerResponse, Handler.CONST_QUIT))
                        && ZVal.toBool(this.allowQuit(env));
        output = env.callMethod(this.system, "cleanOutputBuffer", Run.class);
        if (ZVal.isTrue(this.writeToOutput(env))) {
            if (ZVal.isTrue(willQuit)) {
                runtimeConverterBreakCount = 0;
                while (ZVal.isGreaterThan(
                        env.callMethod(this.system, "getOutputBufferLevel", Run.class), '>', 0)) {
                    env.callMethod(this.system, "endOutputBuffering", Run.class);
                }

                if (ZVal.toBool(Misc.runtimeStaticObject.canSendHeaders(env))
                        && ZVal.toBool(handlerContentType)) {
                    function_header
                            .f
                            .env(env)
                            .call("Content-Type: " + toStringR(handlerContentType, env));
                }
            }

            this.writeToOutputNow(env, output);
        }

        if (ZVal.isTrue(willQuit)) {
            env.callMethod(this.system, "flushOutputBuffer", Run.class);
            env.callMethod(this.system, "stopExecution", Run.class, 1);
        }

        return ZVal.assign(output);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    @ConvertedParameter(index = 1, name = "message")
    @ConvertedParameter(
        index = 2,
        name = "file",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "line",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object handleError(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, false);
        Object file = assignParameter(args, 2, true);
        if (null == file) {
            file = ZVal.getNull();
        }
        Object line = assignParameter(args, 3, true);
        if (null == line) {
            line = ZVal.getNull();
        }
        Object exception = null;
        ReferenceContainer entry = new BasicReferenceContainer(null);
        Object levelMatches = null;
        Object pathMatches = null;
        if (ZVal.isTrue(
                ZVal.toLong(level)
                        & ZVal.toLong(
                                env.callMethod(
                                        this.system, "getErrorReportingLevel", Run.class)))) {
            for (ZPair zpairResult60 : ZVal.getIterable(this.silencedPatterns, env, true)) {
                entry.setObject(ZVal.assign(zpairResult60.getValue()));
                pathMatches =
                        ZVal.assign(
                                ZVal.toBool(
                                        function_preg_match
                                                .f
                                                .env(env)
                                                .call(entry.arrayGet(env, "pattern"), file)
                                                .value()));
                levelMatches = ZVal.toLong(level) & ZVal.toLong(entry.arrayGet(env, "levels"));
                if (ZVal.toBool(pathMatches) && ZVal.toBool(levelMatches)) {
                    return ZVal.assign(true);
                }
            }

            exception = new ErrorException(env, message, level, level, file, line);
            if (ZVal.isTrue(this.canThrowExceptions)) {
                throw ZVal.getException(env, exception);

            } else {
                this.handleException(env, exception);
            }

            return ZVal.assign(true);
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object handleShutdown(RuntimeEnv env, Object... args) {
        ReferenceContainer error = new BasicReferenceContainer(null);
        this.canThrowExceptions = false;
        error.setObject(env.callMethod(this.system, "getLastError", Run.class));
        if (ZVal.toBool(error.getObject())
                && ZVal.toBool(
                        Misc.runtimeStaticObject.isLevelFatal(env, error.arrayGet(env, "type")))) {
            this.handleError(
                    env,
                    error.arrayGet(env, "type"),
                    error.arrayGet(env, "message"),
                    error.arrayGet(env, "file"),
                    error.arrayGet(env, "line"));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "output")
    private Object writeToOutputNow(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        if (ZVal.toBool(this.sendHttpCode(env))
                && ZVal.toBool(Misc.runtimeStaticObject.canSendHeaders(env))) {
            env.callMethod(this.system, "setHttpResponseCode", Run.class, this.sendHttpCode(env));
        }

        env.echo(output);
        return ZVal.assign(this);
    }

    public static final Object CONST_class = "Whoops\\Run";

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
                    .setName("Whoops\\Run")
                    .setLookup(
                            Run.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "allowQuit",
                            "canThrowExceptions",
                            "handlerStack",
                            "isRegistered",
                            "sendHttpCode",
                            "sendOutput",
                            "silencedPatterns",
                            "system")
                    .setFilename("vendor/filp/whoops/src/Whoops/Run.php")
                    .addInterface("Whoops\\RunInterface")
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
