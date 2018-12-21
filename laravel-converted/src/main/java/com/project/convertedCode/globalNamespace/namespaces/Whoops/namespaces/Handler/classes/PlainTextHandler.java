package com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_integer;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_get_length;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_get_clean;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_start;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_clean;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Handler.classes.Handler;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_num_args;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Psr.namespaces.Log.classes.LoggerInterface;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/filp/whoops/src/Whoops/Handler/PlainTextHandler.php

*/

public class PlainTextHandler extends Handler {

    public Object logger = null;

    public Object dumper = null;

    public Object addTraceToOutput = true;

    public Object addTraceFunctionArgsToOutput = false;

    public Object traceFunctionArgsOutputLimit = 1024;

    public Object loggerOnly = false;

    public PlainTextHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PlainTextHandler.class) {
            this.__construct(env, args);
        }
    }

    public PlainTextHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "logger",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object logger = assignParameter(args, 0, true);
        if (null == logger) {
            logger = ZVal.getNull();
        }
        this.setLogger(env, logger);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "logger",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setLogger(RuntimeEnv env, Object... args) {
        Object logger = assignParameter(args, 0, true);
        if (null == logger) {
            logger = ZVal.getNull();
        }
        if (!ZVal.toBool(function_is_null.f.env(env).call(logger).value())
                || ZVal.toBool(
                        ZVal.checkInstanceType(
                                logger, LoggerInterface.class, "Psr\\Log\\LoggerInterface"))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Argument to "
                                    + toStringR("PlainTextHandler::setLogger", env)
                                    + " must be a valid Logger Interface (aka. Monolog), "
                                    + toStringR(
                                            function_get_class.f.env(env).call(logger).value(), env)
                                    + " given."));
        }

        this.logger = logger;
        return null;
    }

    @ConvertedMethod
    public Object getLogger(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.logger);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dumper", typeHint = "callable")
    public Object setDumper(RuntimeEnv env, Object... args) {
        Object dumper = assignParameter(args, 0, false);
        this.dumper = dumper;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "addTraceToOutput",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object addTraceToOutput(RuntimeEnv env, Object... args) {
        Object addTraceToOutput = assignParameter(args, 0, true);
        if (null == addTraceToOutput) {
            addTraceToOutput = ZVal.getNull();
        }
        if (ZVal.equalityCheck(
                function_func_num_args
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call()
                        .value(),
                0)) {
            return ZVal.assign(this.addTraceToOutput);
        }

        this.addTraceToOutput = ZVal.toBool(addTraceToOutput);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "addTraceFunctionArgsToOutput",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object addTraceFunctionArgsToOutput(RuntimeEnv env, Object... args) {
        Object addTraceFunctionArgsToOutput = assignParameter(args, 0, true);
        if (null == addTraceFunctionArgsToOutput) {
            addTraceFunctionArgsToOutput = ZVal.getNull();
        }
        if (ZVal.equalityCheck(
                function_func_num_args
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call()
                        .value(),
                0)) {
            return ZVal.assign(this.addTraceFunctionArgsToOutput);
        }

        if (!function_is_integer.f.env(env).call(addTraceFunctionArgsToOutput).getBool()) {
            this.addTraceFunctionArgsToOutput = ZVal.toBool(addTraceFunctionArgsToOutput);

        } else {
            this.addTraceFunctionArgsToOutput = addTraceFunctionArgsToOutput;
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "traceFunctionArgsOutputLimit")
    public Object setTraceFunctionArgsOutputLimit(RuntimeEnv env, Object... args) {
        Object traceFunctionArgsOutputLimit = assignParameter(args, 0, false);
        this.traceFunctionArgsOutputLimit = ZVal.toLong(traceFunctionArgsOutputLimit);
        return null;
    }

    @ConvertedMethod
    public Object generateResponse(RuntimeEnv env, Object... args) {
        Object exception = null;
        exception = env.callMethod(this, "getException", PlainTextHandler.class);
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%s: %s in file %s on line %d%s\n",
                                function_get_class.f.env(env).call(exception).value(),
                                env.callMethod(exception, "getMessage", PlainTextHandler.class),
                                env.callMethod(exception, "getFile", PlainTextHandler.class),
                                env.callMethod(exception, "getLine", PlainTextHandler.class),
                                this.getTraceOutput(env))
                        .value());
    }

    @ConvertedMethod
    public Object getTraceFunctionArgsOutputLimit(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.traceFunctionArgsOutputLimit);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "loggerOnly",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object loggerOnly(RuntimeEnv env, Object... args) {
        Object loggerOnly = assignParameter(args, 0, true);
        if (null == loggerOnly) {
            loggerOnly = ZVal.getNull();
        }
        if (ZVal.equalityCheck(
                function_func_num_args
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call()
                        .value(),
                0)) {
            return ZVal.assign(this.loggerOnly);
        }

        this.loggerOnly = ZVal.toBool(loggerOnly);
        return null;
    }

    @ConvertedMethod
    private Object canOutput(RuntimeEnv env, Object... args) {
        return ZVal.assign(!ZVal.isTrue(this.loggerOnly(env)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "frame", typeHint = "Whoops\\Exception\\Frame")
    @ConvertedParameter(index = 1, name = "line")
    private Object getFrameArgsOutput(RuntimeEnv env, Object... args) {
        Object frame = assignParameter(args, 0, false);
        Object line = assignParameter(args, 1, false);
        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                this.addTraceFunctionArgsToOutput(env), "===", false))
                || ZVal.toBool(
                        ZVal.isLessThan(this.addTraceFunctionArgsToOutput(env), '<', line))) {
            return "";
        }

        function_ob_start.f.env(env).call();
        this.dump(env, env.callMethod(frame, "getArgs", PlainTextHandler.class));
        if (ZVal.isGreaterThan(
                function_ob_get_length.f.env(env).call().value(),
                '>',
                this.getTraceFunctionArgsOutputLimit(env))) {
            function_ob_clean.f.env(env).call();
            return ZVal.assign(
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "\n%sArguments dump length greater than %d Bytes. Discarded.",
                                    CONST_VAR_DUMP_PREFIX,
                                    this.getTraceFunctionArgsOutputLimit(env))
                            .value());
        }

        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "\n%s",
                                function_preg_replace
                                        .f
                                        .env(env)
                                        .call(
                                                "/^/m",
                                                CONST_VAR_DUMP_PREFIX,
                                                function_ob_get_clean.f.env(env).call().value())
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "var")
    protected Object dump(RuntimeEnv env, Object... args) {
        Object var = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.dumper)) {
            function_call_user_func
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                    .call(this.dumper, var);

        } else {
            NamespaceGlobal.var_dump.env(env).call(var);
        }

        return null;
    }

    @ConvertedMethod
    private Object getTraceOutput(RuntimeEnv env, Object... args) {
        Object template = null;
        Object frames = null;
        Object response = null;
        ReferenceContainer line = new BasicReferenceContainer(null);
        Object inspector = null;
        Object _pClass = null;
        Object frame = null;
        if (!ZVal.isTrue(this.addTraceToOutput(env))) {
            return "";
        }

        inspector = env.callMethod(this, "getInspector", PlainTextHandler.class);
        frames = env.callMethod(inspector, "getFrames", PlainTextHandler.class);
        response = "\nStack trace:";
        line.setObject(1);
        for (ZPair zpairResult45 : ZVal.getIterable(frames, env, true)) {
            frame = ZVal.assign(zpairResult45.getValue());
            _pClass = env.callMethod(frame, "getClass", PlainTextHandler.class);
            template = "\n%3d. %s->%s() %s:%d%s";
            if (!ZVal.isTrue(_pClass)) {
                template = "\n%3d. %s%s() %s:%d%s";
            }

            response =
                    toStringR(response, env)
                            + toStringR(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    template,
                                                    line.getObject(),
                                                    _pClass,
                                                    env.callMethod(
                                                            frame,
                                                            "getFunction",
                                                            PlainTextHandler.class),
                                                    env.callMethod(
                                                            frame,
                                                            "getFile",
                                                            PlainTextHandler.class),
                                                    env.callMethod(
                                                            frame,
                                                            "getLine",
                                                            PlainTextHandler.class),
                                                    this.getFrameArgsOutput(
                                                            env, frame, line.getObject()))
                                            .value(),
                                    env);
            line.setObject(ZVal.increment(line.getObject()));
        }

        return ZVal.assign(response);
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        Object response = null;
        response = this.generateResponse(env);
        if (ZVal.isTrue(this.getLogger(env))) {
            env.callMethod(this.getLogger(env), "error", PlainTextHandler.class, response);
        }

        if (!ZVal.isTrue(this.canOutput(env))) {
            return ZVal.assign(Handler.CONST_DONE);
        }

        env.echo(response);
        return ZVal.assign(Handler.CONST_QUIT);
    }

    @ConvertedMethod
    public Object contentType(RuntimeEnv env, Object... args) {
        return "text/plain";
    }

    public static final Object CONST_VAR_DUMP_PREFIX = "   | ";

    public static final Object CONST_class = "Whoops\\Handler\\PlainTextHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Handler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Whoops\\Handler\\PlainTextHandler")
                    .setLookup(
                            PlainTextHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "addTraceFunctionArgsToOutput",
                            "addTraceToOutput",
                            "dumper",
                            "exception",
                            "inspector",
                            "logger",
                            "loggerOnly",
                            "run",
                            "traceFunctionArgsOutputLimit")
                    .setFilename("vendor/filp/whoops/src/Whoops/Handler/PlainTextHandler.php")
                    .addInterface("Whoops\\Handler\\HandlerInterface")
                    .addExtendsClass("Whoops\\Handler\\Handler")
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
