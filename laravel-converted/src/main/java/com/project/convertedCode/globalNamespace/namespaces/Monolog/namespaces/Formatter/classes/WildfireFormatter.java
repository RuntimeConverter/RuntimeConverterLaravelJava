package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.NormalizerFormatter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_reset;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Formatter/WildfireFormatter.php

*/

public class WildfireFormatter extends NormalizerFormatter {

    public Object logLevels =
            ZVal.newArray(
                    new ZPair(Logger.CONST_DEBUG, "LOG"),
                    new ZPair(Logger.CONST_INFO, "INFO"),
                    new ZPair(Logger.CONST_NOTICE, "INFO"),
                    new ZPair(Logger.CONST_WARNING, "WARN"),
                    new ZPair(Logger.CONST_ERROR, "ERROR"),
                    new ZPair(Logger.CONST_CRITICAL, "ERROR"),
                    new ZPair(Logger.CONST_ALERT, "ERROR"),
                    new ZPair(Logger.CONST_EMERGENCY, "ERROR"));

    public WildfireFormatter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == WildfireFormatter.class) {
            this.__construct(env, args);
        }
    }

    public WildfireFormatter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object format(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object file = null;
        Object line = null;
        Object handleError = null;
        Object json = null;
        Object label = null;
        ReferenceContainer message = new BasicReferenceContainer(null);
        Object type = null;
        file = ZVal.assign(line = "");
        if (arrayActionR(ArrayAction.ISSET, record, env, "extra", "file")) {
            file = ZVal.assign(record.arrayGet(env, "extra", "file"));
            arrayActionR(ArrayAction.UNSET, record, env, "extra", "file");
        }

        if (arrayActionR(ArrayAction.ISSET, record, env, "extra", "line")) {
            line = ZVal.assign(record.arrayGet(env, "extra", "line"));
            arrayActionR(ArrayAction.UNSET, record, env, "extra", "line");
        }

        record.setObject(this.normalize(env, record.getObject()));
        message.setObject(ZVal.newArray(new ZPair("message", record.arrayGet(env, "message"))));
        handleError = false;
        if (ZVal.isTrue(record.arrayGet(env, "context"))) {
            message.arrayAccess(env, "context").set(record.arrayGet(env, "context"));
            handleError = true;
        }

        if (ZVal.isTrue(record.arrayGet(env, "extra"))) {
            message.arrayAccess(env, "extra").set(record.arrayGet(env, "extra"));
            handleError = true;
        }

        if (ZVal.strictEqualityCheck(
                function_count.f.env(env).call(message.getObject()).value(), "===", 1)) {
            message.setObject(function_reset.f.env(env).call(message.getObject()).value());
        }

        if (arrayActionR(ArrayAction.ISSET, record, env, "context", CONST_TABLE)) {
            type = "TABLE";
            label =
                    toStringR(record.arrayGet(env, "channel"), env)
                            + ": "
                            + toStringR(record.arrayGet(env, "message"), env);
            message.setObject(ZVal.assign(record.arrayGet(env, "context", CONST_TABLE)));

        } else {
            type =
                    ZVal.assign(
                            new ReferenceClassProperty(this, "logLevels", env)
                                    .arrayGet(env, record.arrayGet(env, "level")));
            label = ZVal.assign(record.arrayGet(env, "channel"));
        }

        json =
                env.callMethod(
                        this,
                        "toJson",
                        WildfireFormatter.class,
                        ZVal.newArray(
                                new ZPair(
                                        0,
                                        ZVal.newArray(
                                                new ZPair("Type", type),
                                                new ZPair("File", file),
                                                new ZPair("Line", line),
                                                new ZPair("Label", label))),
                                new ZPair(1, message.getObject())),
                        handleError);
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call("%s|%s|", function_strlen.f.env(env).call(json).value(), json)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "records", typeHint = "array")
    public Object formatBatch(RuntimeEnv env, Object... args) {
        Object records = assignParameter(args, 0, false);
        throw ZVal.getException(
                env,
                new BadMethodCallException(
                        env, "Batch formatting does not make sense for the WildfireFormatter"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    protected Object normalize(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        if (ZVal.toBool(function_is_object.f.env(env).call(data).value())
                && ZVal.toBool(
                        !ZVal.isTrue(ZVal.checkInstanceType(data, DateTime.class, "DateTime")))) {
            return ZVal.assign(data);
        }

        return ZVal.assign(super.normalize(env, data));
    }

    public static final Object CONST_TABLE = "table";

    public static final Object CONST_class = "Monolog\\Formatter\\WildfireFormatter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends NormalizerFormatter.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Formatter\\WildfireFormatter")
                    .setLookup(
                            WildfireFormatter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("dateFormat", "logLevels")
                    .setFilename(
                            "vendor/monolog/monolog/src/Monolog/Formatter/WildfireFormatter.php")
                    .addInterface("Monolog\\Formatter\\FormatterInterface")
                    .addExtendsClass("Monolog\\Formatter\\NormalizerFormatter")
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
