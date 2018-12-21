package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Log.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Jsonable;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Arrayable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Log.namespaces.Events.classes.MessageLogged;
import com.project.convertedCode.globalNamespace.namespaces.Psr.namespaces.Log.classes.LoggerInterface;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Log/Logger.php

*/

public class Logger extends RuntimeClassBase implements LoggerInterface {

    public Object logger = null;

    public Object dispatcher = null;

    public Logger(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Logger.class) {
            this.__construct(env, args);
        }
    }

    public Logger(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "logger", typeHint = "Psr\\Log\\LoggerInterface")
    @ConvertedParameter(
        index = 1,
        name = "dispatcher",
        typeHint = "Illuminate\\Contracts\\Events\\Dispatcher",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object logger = assignParameter(args, 0, false);
        Object dispatcher = assignParameter(args, 1, true);
        if (null == dispatcher) {
            dispatcher = ZVal.getNull();
        }
        this.logger = logger;
        this.dispatcher = dispatcher;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object emergency(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        this.writeLog(env, "emergency", message, context);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object alert(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        this.writeLog(env, "alert", message, context);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object critical(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        this.writeLog(env, "critical", message, context);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object error(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        this.writeLog(env, "error", message, context);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object warning(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        this.writeLog(env, "warning", message, context);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object notice(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        this.writeLog(env, "notice", message, context);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object info(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        this.writeLog(env, "info", message, context);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object debug(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        this.writeLog(env, "debug", message, context);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    @ConvertedParameter(index = 1, name = "message")
    @ConvertedParameter(
        index = 2,
        name = "context",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object log(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, false);
        Object context = assignParameter(args, 2, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        this.writeLog(env, level, message, context);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    @ConvertedParameter(index = 1, name = "message")
    @ConvertedParameter(
        index = 2,
        name = "context",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object write(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, false);
        Object context = assignParameter(args, 2, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        this.writeLog(env, level, message, context);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    @ConvertedParameter(index = 1, name = "message")
    @ConvertedParameter(index = 2, name = "context")
    protected Object writeLog(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, false);
        ReferenceContainer message = new BasicReferenceContainer(assignParameter(args, 1, false));
        ReferenceContainer context = new BasicReferenceContainer(assignParameter(args, 2, false));
        this.fireLogEvent(
                env,
                level,
                message.setObject(this.formatMessage(env, message.getObject())),
                context.getObject());
        env.callMethod(
                this.logger,
                new RuntimeArgsWithReferences().add(0, message).add(1, context),
                toStringR(level, env),
                Logger.class,
                message.getObject(),
                context.getObject());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    public Object listen(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        if (!ZVal.isset(this.dispatcher)) {
            throw ZVal.getException(
                    env, new RuntimeException(env, "Events dispatcher has not been set."));
        }

        env.callMethod(
                this.dispatcher, "listen", Logger.class, MessageLogged.CONST_class, callback);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    @ConvertedParameter(index = 1, name = "message")
    @ConvertedParameter(
        index = 2,
        name = "context",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    protected Object fireLogEvent(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, false);
        Object context = assignParameter(args, 2, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        if (ZVal.isset(this.dispatcher)) {
            env.callMethod(
                    this.dispatcher,
                    "dispatch",
                    Logger.class,
                    new MessageLogged(env, level, message, context));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    protected Object formatMessage(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        if (function_is_array.f.env(env).call(message).getBool()) {
            return ZVal.assign(NamespaceGlobal.var_export.env(env).call(message, true).value());

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        message, Jsonable.class, "Illuminate\\Contracts\\Support\\Jsonable"))) {
            return ZVal.assign(env.callMethod(message, "toJson", Logger.class));

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        message, Arrayable.class, "Illuminate\\Contracts\\Support\\Arrayable"))) {
            return ZVal.assign(
                    NamespaceGlobal.var_export
                            .env(env)
                            .call(env.callMethod(message, "toArray", Logger.class), true)
                            .value());
        }

        return ZVal.assign(message);
    }

    @ConvertedMethod
    public Object getLogger(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.logger);
    }

    @ConvertedMethod
    public Object getEventDispatcher(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.dispatcher);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "dispatcher",
        typeHint = "Illuminate\\Contracts\\Events\\Dispatcher"
    )
    public Object setEventDispatcher(RuntimeEnv env, Object... args) {
        Object dispatcher = assignParameter(args, 0, false);
        this.dispatcher = dispatcher;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        this.logger,
                        new RuntimeArgsWithReferences(),
                        toStringR(method, env),
                        Logger.class,
                        PackedVaradicArgs.unpack(new PackedVaradicArgs(parameters))));
    }

    public static final Object CONST_class = "Illuminate\\Log\\Logger";

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
                    .setName("Illuminate\\Log\\Logger")
                    .setLookup(
                            Logger.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("dispatcher", "logger")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Log/Logger.php")
                    .addInterface("Psr\\Log\\LoggerInterface")
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
