package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.NormalizerFormatter;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeInterfaces.Traversable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_walk;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Formatter/JsonFormatter.php

*/

public class JsonFormatter extends NormalizerFormatter {

    public Object batchMode = null;

    public Object appendNewline = null;

    public Object includeStacktraces = false;

    public JsonFormatter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == JsonFormatter.class) {
            this.__construct(env, args);
        }
    }

    public JsonFormatter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "batchMode")
    @ConvertedParameter(
        index = 1,
        name = "appendNewline",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object batchMode = assignParameter(args, 0, true);
        if (null == batchMode) {
            batchMode = CONST_BATCH_MODE_JSON;
        }
        Object appendNewline = assignParameter(args, 1, true);
        if (null == appendNewline) {
            appendNewline = true;
        }
        this.batchMode = batchMode;
        this.appendNewline = appendNewline;
        return null;
    }

    @ConvertedMethod
    public Object getBatchMode(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.batchMode);
    }

    @ConvertedMethod
    public Object isAppendingNewlines(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.appendNewline);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object format(RuntimeEnv env, Object... args) {
        Object record = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(
                                env.callMethod(
                                        this,
                                        "toJson",
                                        JsonFormatter.class,
                                        this.normalize(env, record),
                                        true),
                                env)
                        + toStringR(ZVal.isTrue(this.appendNewline) ? "\n" : "", env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "records", typeHint = "array")
    public Object formatBatch(RuntimeEnv env, Object... args) {
        Object records = assignParameter(args, 0, false);
        SwitchEnumType37 switchVariable37 =
                ZVal.getEnum(
                        this.batchMode,
                        SwitchEnumType37.DEFAULT_CASE,
                        SwitchEnumType37.DYNAMIC_TYPE_109,
                        ClassConstantUtils.getConstantValueLateStatic(
                                env, this, "BATCH_MODE_NEWLINES"),
                        SwitchEnumType37.DYNAMIC_TYPE_110,
                        ClassConstantUtils.getConstantValueLateStatic(
                                env, this, "BATCH_MODE_JSON"));
        switch (switchVariable37) {
            case DYNAMIC_TYPE_109:
                return ZVal.assign(this.formatBatchNewlines(env, records));
            case DYNAMIC_TYPE_110:
            case DEFAULT_CASE:
                return ZVal.assign(this.formatBatchJson(env, records));
        }
        ;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "include",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object includeStacktraces(RuntimeEnv env, Object... args) {
        Object include = assignParameter(args, 0, true);
        if (null == include) {
            include = true;
        }
        this.includeStacktraces = include;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "records", typeHint = "array")
    protected Object formatBatchJson(RuntimeEnv env, Object... args) {
        Object records = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this, "toJson", JsonFormatter.class, this.normalize(env, records), true));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "records", typeHint = "array")
    protected Object formatBatchNewlines(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/monolog/monolog/src/Monolog/Formatter")
                        .setFile("/vendor/monolog/monolog/src/Monolog/Formatter/JsonFormatter.php");
        Object records = assignParameter(args, 0, false);
        Object instance = null;
        Object oldNewline = null;
        instance = ZVal.assign(this);
        oldNewline = ZVal.assign(this.appendNewline);
        this.appendNewline = false;
        function_array_walk
                .f
                .env(env)
                .call(
                        records,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Monolog\\Formatter",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "value")
                            @ConvertedParameter(index = 1, name = "key")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                ReferenceContainer value =
                                        assignParameterRef(
                                                runtimePassByReferenceArgs, args, 0, false);
                                Object key = assignParameter(args, 1, false);
                                Object instance = null;
                                instance = this.contextReferences.getCapturedValue("instance");
                                value.setObject(
                                        env.callMethod(
                                                instance,
                                                "format",
                                                JsonFormatter.class,
                                                value.getObject()));
                                return null;
                            }
                        }.use("instance", instance));
        this.appendNewline = oldNewline;
        return ZVal.assign(NamespaceGlobal.implode.env(env).call("\n", records).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    protected Object normalize(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object data = assignParameter(args, 0, false);
        ReferenceContainer normalized = new BasicReferenceContainer(null);
        ReferenceContainer count = new BasicReferenceContainer(null);
        Object value = null;
        Object key = null;
        if (ZVal.toBool(function_is_array.f.env(env).call(data).value())
                || ZVal.toBool(ZVal.checkInstanceType(data, Traversable.class, "Traversable"))) {
            normalized.setObject(ZVal.newArray());
            count.setObject(1);
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult746 : ZVal.getIterable(data, env, false)) {
                key = ZVal.assign(zpairResult746.getKey());
                value = ZVal.assign(zpairResult746.getValue());
                if (ZVal.isGreaterThanOrEqualTo(ZVal.postIncrement(count), ">=", 1000)) {
                    normalized
                            .arrayAccess(env, "...")
                            .set("Over 1000 items, aborting normalization");
                    break;
                }

                normalized.arrayAccess(env, key).set(this.normalize(env, value));
            }

            return ZVal.assign(normalized.getObject());
        }

        if (ZVal.toBool(ZVal.checkInstanceType(data, PHPException.class, "Exception"))
                || ZVal.toBool(ZVal.checkInstanceType(data, Throwable.class, "Throwable"))) {
            return ZVal.assign(this.normalizeException(env, data));
        }

        return ZVal.assign(data);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e")
    protected Object normalizeException(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        Object trace = null;
        ReferenceContainer data = new BasicReferenceContainer(null);
        Object previous = null;
        ReferenceContainer frame = new BasicReferenceContainer(null);
        if (ZVal.toBool(!ZVal.isTrue(ZVal.checkInstanceType(e, PHPException.class, "Exception")))
                && ZVal.toBool(
                        !ZVal.isTrue(ZVal.checkInstanceType(e, Throwable.class, "Throwable")))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Exception/Throwable expected, got "
                                    + toStringR(
                                            NamespaceGlobal.gettype.env(env).call(e).value(), env)
                                    + " / "
                                    + toStringR(
                                            function_get_class.f.env(env).call(e).value(), env)));
        }

        data.setObject(
                ZVal.newArray(
                        new ZPair("class", function_get_class.f.env(env).call(e).value()),
                        new ZPair("message", env.callMethod(e, "getMessage", JsonFormatter.class)),
                        new ZPair("code", env.callMethod(e, "getCode", JsonFormatter.class)),
                        new ZPair(
                                "file",
                                toStringR(env.callMethod(e, "getFile", JsonFormatter.class), env)
                                        + ":"
                                        + toStringR(
                                                env.callMethod(e, "getLine", JsonFormatter.class),
                                                env))));
        if (ZVal.isTrue(this.includeStacktraces)) {
            trace = env.callMethod(e, "getTrace", JsonFormatter.class);
            for (ZPair zpairResult747 : ZVal.getIterable(trace, env, true)) {
                frame.setObject(ZVal.assign(zpairResult747.getValue()));
                if (arrayActionR(ArrayAction.ISSET, frame, env, "file")) {
                    data.arrayAppend(env, "trace")
                            .set(
                                    toStringR(frame.arrayGet(env, "file"), env)
                                            + ":"
                                            + toStringR(frame.arrayGet(env, "line"), env));

                } else if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, frame, env, "function"))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        frame.arrayGet(env, "function"), "===", "{closure}"))) {
                    data.arrayAppend(env, "trace").set(frame.arrayGet(env, "function"));

                } else {
                    data.arrayAppend(env, "trace").set(this.normalize(env, frame.getObject()));
                }
            }
        }

        if (ZVal.isTrue(previous = env.callMethod(e, "getPrevious", JsonFormatter.class))) {
            data.arrayAccess(env, "previous").set(this.normalizeException(env, previous));
        }

        return ZVal.assign(data.getObject());
    }

    public static final Object CONST_BATCH_MODE_JSON = 1;

    public static final Object CONST_BATCH_MODE_NEWLINES = 2;

    public static final Object CONST_class = "Monolog\\Formatter\\JsonFormatter";

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
                    .setName("Monolog\\Formatter\\JsonFormatter")
                    .setLookup(
                            JsonFormatter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "appendNewline", "batchMode", "dateFormat", "includeStacktraces")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Formatter/JsonFormatter.php")
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

    private enum SwitchEnumType37 {
        DYNAMIC_TYPE_109,
        DYNAMIC_TYPE_110,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
