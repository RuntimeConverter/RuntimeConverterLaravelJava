package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Log.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Psr.namespaces.Log.classes.LogLevel;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeInterface;
import com.project.convertedCode.globalNamespace.namespaces.Psr.namespaces.Log.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.runtimeconverter.runtime.nativeFunctions.date.function_date;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Psr.namespaces.Log.classes.AbstractLogger;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_scalar;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fwrite;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/Log/Logger.php

*/

public class Logger extends AbstractLogger {

    public Object minLevelIndex = null;

    public Object formatter = null;

    public Object handle = null;

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
    @ConvertedParameter(
        index = 0,
        name = "minLevel",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 1, name = "output")
    @ConvertedParameter(
        index = 2,
        name = "formatter",
        typeHint = "callable",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object minLevel = assignParameter(args, 0, true);
        if (null == minLevel) {
            minLevel = ZVal.getNull();
        }
        Object output = assignParameter(args, 1, true);
        if (null == output) {
            output = "php://stderr";
        }
        Object formatter = assignParameter(args, 2, true);
        if (null == formatter) {
            formatter = ZVal.getNull();
        }
        ReferenceContainer _ENV = new BasicReferenceContainer(null);
        ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
        Object ternaryExpressionTemp = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", minLevel)) {
            minLevel = ZVal.assign(LogLevel.CONST_WARNING);
            if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, _ENV, env, "SHELL_VERBOSITY"))
                    || ZVal.toBool(
                            arrayActionR(ArrayAction.ISSET, _SERVER, env, "SHELL_VERBOSITY"))) {
                switch (ZVal.toInt(
                        ZVal.toLong(
                                arrayActionR(ArrayAction.ISSET, _ENV, env, "SHELL_VERBOSITY")
                                        ? _ENV.arrayGet(env, "SHELL_VERBOSITY")
                                        : _SERVER.arrayGet(env, "SHELL_VERBOSITY")))) {
                    case -1:
                        minLevel = ZVal.assign(LogLevel.CONST_ERROR);
                        break;
                    case 1:
                        minLevel = ZVal.assign(LogLevel.CONST_NOTICE);
                        break;
                    case 2:
                        minLevel = ZVal.assign(LogLevel.CONST_INFO);
                        break;
                    case 3:
                        minLevel = ZVal.assign(LogLevel.CONST_DEBUG);
                        break;
                }
                ;
            }
        }

        if (!arrayActionR(
                ArrayAction.ISSET,
                env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Symfony
                                .namespaces
                                .Component
                                .namespaces
                                .HttpKernel
                                .namespaces
                                .Log
                                .classes
                                .Logger
                                .RequestStaticProperties
                                .class,
                        "levels"),
                env,
                minLevel)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("The log level \"%s\" does not exist.", minLevel)
                                    .value()));
        }

        this.minLevelIndex =
                env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Symfony
                                        .namespaces
                                        .Component
                                        .namespaces
                                        .HttpKernel
                                        .namespaces
                                        .Log
                                        .classes
                                        .Logger
                                        .RequestStaticProperties
                                        .class,
                                "levels")
                        .arrayGet(env, minLevel);
        this.formatter =
                ZVal.isTrue(ternaryExpressionTemp = formatter)
                        ? ternaryExpressionTemp
                        : ZVal.newArray(new ZPair(0, this), new ZPair(1, "format"));
        if (ZVal.strictEqualityCheck(
                false,
                "===",
                this.handle =
                        function_is_resource.f.env(env).call(output).getBool()
                                ? output
                                : function_fopen.f.env(env).call(output, "a").value())) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Unable to open \"%s\".", output)
                                    .value()));
        }

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
        ReferenceContainer level = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer message = new BasicReferenceContainer(assignParameter(args, 1, false));
        ReferenceContainer context = new BasicReferenceContainer(assignParameter(args, 2, true));
        if (null == context.getObject()) {
            context.setObject(ZVal.newArray());
        }
        Object formatter = null;
        if (!arrayActionR(
                ArrayAction.ISSET,
                env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Symfony
                                .namespaces
                                .Component
                                .namespaces
                                .HttpKernel
                                .namespaces
                                .Log
                                .classes
                                .Logger
                                .RequestStaticProperties
                                .class,
                        "levels"),
                env,
                level.getObject())) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("The log level \"%s\" does not exist.", level.getObject())
                                    .value()));
        }

        if (ZVal.isLessThan(
                env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Symfony
                                        .namespaces
                                        .Component
                                        .namespaces
                                        .HttpKernel
                                        .namespaces
                                        .Log
                                        .classes
                                        .Logger
                                        .RequestStaticProperties
                                        .class,
                                "levels")
                        .arrayGet(env, level.getObject()),
                '<',
                this.minLevelIndex)) {
            return null;
        }

        formatter = ZVal.assign(this.formatter);
        function_fwrite
                .f
                .env(env)
                .call(
                        this.handle,
                        env.callFunctionDynamic(
                                        formatter,
                                        new RuntimeArgsWithReferences()
                                                .add(0, level)
                                                .add(1, message)
                                                .add(2, context),
                                        level.getObject(),
                                        message.getObject(),
                                        context.getObject())
                                .value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level", typeHint = "string")
    @ConvertedParameter(index = 1, name = "message", typeHint = "string")
    @ConvertedParameter(index = 2, name = "context", typeHint = "array")
    private Object format(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, false);
        Object context = assignParameter(args, 2, false);
        Object val = null;
        ReferenceContainer replacements = new BasicReferenceContainer(null);
        Object key = null;
        if (ZVal.strictNotEqualityCheck(
                false, "!==", function_strpos.f.env(env).call(message, "{").value())) {
            replacements.setObject(ZVal.newArray());
            for (ZPair zpairResult1978 : ZVal.getIterable(context, env, false)) {
                key = ZVal.assign(zpairResult1978.getKey());
                val = ZVal.assign(zpairResult1978.getValue());
                if (ZVal.toBool(
                                ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", val))
                                        || ZVal.toBool(
                                                function_is_scalar.f.env(env).call(val).value()))
                        || ZVal.toBool(
                                ZVal.toBool(function_is_object.f.env(env).call(val).value())
                                        && ZVal.toBool(
                                                function_method_exists
                                                        .f
                                                        .env(env)
                                                        .call(val, "__toString")
                                                        .value()))) {
                    replacements.arrayAccess(env, "{" + toStringR(key, env) + "}").set(val);

                } else if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                val, DateTimeInterface.class, "DateTimeInterface"))) {
                    replacements
                            .arrayAccess(env, "{" + toStringR(key, env) + "}")
                            .set(env.callMethod(val, "format", Logger.class, "Y-m-d\\TH:i:sP"));

                } else if (function_is_object.f.env(env).call(val).getBool()) {
                    replacements
                            .arrayAccess(env, "{" + toStringR(key, env) + "}")
                            .set(
                                    "[object "
                                            + toStringR(
                                                    function_get_class.f.env(env).call(val).value(),
                                                    env)
                                            + "]");

                } else {
                    replacements
                            .arrayAccess(env, "{" + toStringR(key, env) + "}")
                            .set(
                                    "["
                                            + toStringR(
                                                    NamespaceGlobal.gettype
                                                            .env(env)
                                                            .call(val)
                                                            .value(),
                                                    env)
                                            + "]");
                }
            }

            message =
                    NamespaceGlobal.strtr.env(env).call(message, replacements.getObject()).value();
        }

        return ZVal.assign(
                toStringR(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "%s [%s] %s",
                                                function_date
                                                        .f
                                                        .env(env)
                                                        .call("Y-m-d\\TH:i:sP")
                                                        .value(),
                                                level,
                                                message)
                                        .value(),
                                env)
                        + toStringR("\n", env));
    }

    public static final Object CONST_class = "Symfony\\Component\\HttpKernel\\Log\\Logger";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractLogger.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object levels =
                ZVal.newArray(
                        new ZPair(LogLevel.CONST_DEBUG, 0),
                        new ZPair(LogLevel.CONST_INFO, 1),
                        new ZPair(LogLevel.CONST_NOTICE, 2),
                        new ZPair(LogLevel.CONST_WARNING, 3),
                        new ZPair(LogLevel.CONST_ERROR, 4),
                        new ZPair(LogLevel.CONST_CRITICAL, 5),
                        new ZPair(LogLevel.CONST_ALERT, 6),
                        new ZPair(LogLevel.CONST_EMERGENCY, 7));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\Log\\Logger")
                    .setLookup(
                            Logger.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("formatter", "handle", "minLevelIndex")
                    .setStaticPropertyNames("levels")
                    .setFilename("vendor/symfony/http-kernel/Log/Logger.php")
                    .addInterface("Psr\\Log\\LoggerInterface")
                    .addExtendsClass("Psr\\Log\\AbstractLogger")
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
