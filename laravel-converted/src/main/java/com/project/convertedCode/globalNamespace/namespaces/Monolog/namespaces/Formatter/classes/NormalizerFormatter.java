package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeClasses.soap.SoapFault;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.FormatterInterface;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_walk_recursive;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_scalar;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeInterfaces.JsonSerializable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_float;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Formatter/NormalizerFormatter.php

*/

public class NormalizerFormatter extends RuntimeClassBase implements FormatterInterface {

    public Object dateFormat = null;

    public NormalizerFormatter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == NormalizerFormatter.class) {
            this.__construct(env, args);
        }
    }

    public NormalizerFormatter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "dateFormat",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object dateFormat = assignParameter(args, 0, true);
        if (null == dateFormat) {
            dateFormat = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.dateFormat =
                ZVal.isTrue(ternaryExpressionTemp = dateFormat)
                        ? ternaryExpressionTemp
                        : ClassConstantUtils.getConstantValueLateStatic(env, this, "SIMPLE_DATE");
        if (!function_function_exists.f.env(env).call("json_encode").getBool()) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            "PHP's json extension is required to use Monolog's NormalizerFormatter"));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object format(RuntimeEnv env, Object... args) {
        Object record = assignParameter(args, 0, false);
        return ZVal.assign(this.normalize(env, record));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "records", typeHint = "array")
    public Object formatBatch(RuntimeEnv env, Object... args) {
        ReferenceContainer records = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object record = null;
        Object key = null;
        for (ZPair zpairResult758 : ZVal.getIterable(records.getObject(), env, false)) {
            key = ZVal.assign(zpairResult758.getKey());
            record = ZVal.assign(zpairResult758.getValue());
            records.arrayAccess(env, key).set(this.format(env, record));
        }

        return ZVal.assign(records.getObject());
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
        if (ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", data))
                || ZVal.toBool(function_is_scalar.f.env(env).call(data).value())) {
            if (function_is_float.f.env(env).call(data).getBool()) {
                if (NamespaceGlobal.is_infinite.env(env).call(data).getBool()) {
                    return ZVal.assign(
                            toStringR(ZVal.isGreaterThan(data, '>', 0) ? "" : "-", env) + "INF");
                }

                if (NamespaceGlobal.is_nan.env(env).call(data).getBool()) {
                    return "NaN";
                }
            }

            return ZVal.assign(data);
        }

        if (function_is_array.f.env(env).call(data).getBool()) {
            normalized.setObject(ZVal.newArray());
            count.setObject(1);
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult759 : ZVal.getIterable(data, env, false)) {
                key = ZVal.assign(zpairResult759.getKey());
                value = ZVal.assign(zpairResult759.getValue());
                if (ZVal.isGreaterThanOrEqualTo(ZVal.postIncrement(count), ">=", 1000)) {
                    normalized
                            .arrayAccess(env, "...")
                            .set(
                                    "Over 1000 items ("
                                            + toStringR(
                                                    function_count.f.env(env).call(data).value(),
                                                    env)
                                            + " total), aborting normalization");
                    break;
                }

                normalized.arrayAccess(env, key).set(this.normalize(env, value));
            }

            return ZVal.assign(normalized.getObject());
        }

        if (ZVal.isTrue(ZVal.checkInstanceType(data, DateTime.class, "DateTime"))) {
            return ZVal.assign(
                    env.callMethod(data, "format", NormalizerFormatter.class, this.dateFormat));
        }

        if (function_is_object.f.env(env).call(data).getBool()) {
            if (ZVal.toBool(ZVal.checkInstanceType(data, PHPException.class, "Exception"))
                    || ZVal.toBool(
                            ZVal.toBool(ZVal.isGreaterThan(70211, '>', 70000))
                                    && ZVal.toBool(
                                            ZVal.checkInstanceType(
                                                    data, Throwable.class, "Throwable")))) {
                return ZVal.assign(this.normalizeException(env, data));
            }

            if (ZVal.toBool(function_method_exists.f.env(env).call(data, "__toString").value())
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    ZVal.checkInstanceType(
                                            data, JsonSerializable.class, "JsonSerializable")))) {
                value = env.callMethod(data, "__toString", NormalizerFormatter.class);

            } else {
                value = this.toJson(env, data, true);
            }

            return ZVal.assign(
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "[object] (%s: %s)",
                                    function_get_class.f.env(env).call(data).value(), value)
                            .value());
        }

        if (function_is_resource.f.env(env).call(data).getBool()) {
            return ZVal.assign(
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "[resource] (%s)",
                                    NamespaceGlobal.get_resource_type.env(env).call(data).value())
                            .value());
        }

        return ZVal.assign(
                "[unknown("
                        + toStringR(NamespaceGlobal.gettype.env(env).call(data).value(), env)
                        + ")]");
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
                        new ZPair(
                                "message",
                                env.callMethod(e, "getMessage", NormalizerFormatter.class)),
                        new ZPair("code", env.callMethod(e, "getCode", NormalizerFormatter.class)),
                        new ZPair(
                                "file",
                                toStringR(
                                                env.callMethod(
                                                        e, "getFile", NormalizerFormatter.class),
                                                env)
                                        + ":"
                                        + toStringR(
                                                env.callMethod(
                                                        e, "getLine", NormalizerFormatter.class),
                                                env))));
        if (ZVal.isTrue(ZVal.checkInstanceType(e, SoapFault.class, "SoapFault"))) {
            if (ZVal.isset(toObjectR(e).accessProp(this, env).name("faultcode").value())) {
                data.arrayAccess(env, "faultcode")
                        .set(toObjectR(e).accessProp(this, env).name("faultcode").value());
            }

            if (ZVal.isset(toObjectR(e).accessProp(this, env).name("faultactor").value())) {
                data.arrayAccess(env, "faultactor")
                        .set(toObjectR(e).accessProp(this, env).name("faultactor").value());
            }

            if (ZVal.isset(toObjectR(e).accessProp(this, env).name("detail").value())) {
                data.arrayAccess(env, "detail")
                        .set(toObjectR(e).accessProp(this, env).name("detail").value());
            }
        }

        trace = env.callMethod(e, "getTrace", NormalizerFormatter.class);
        for (ZPair zpairResult760 : ZVal.getIterable(trace, env, true)) {
            frame.setObject(ZVal.assign(zpairResult760.getValue()));
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
                data.arrayAppend(env, "trace")
                        .set(this.toJson(env, this.normalize(env, frame.getObject()), true));
            }
        }

        if (ZVal.isTrue(previous = env.callMethod(e, "getPrevious", NormalizerFormatter.class))) {
            data.arrayAccess(env, "previous").set(this.normalizeException(env, previous));
        }

        return ZVal.assign(data.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    @ConvertedParameter(
        index = 1,
        name = "ignoreErrors",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object toJson(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        Object ignoreErrors = assignParameter(args, 1, true);
        if (null == ignoreErrors) {
            ignoreErrors = false;
        }
        Object json = null;
        if (ZVal.isTrue(ignoreErrors)) {
            return ZVal.assign(this.jsonEncode(env, data));
        }

        json = this.jsonEncode(env, data);
        if (ZVal.strictEqualityCheck(json, "===", false)) {
            json =
                    this.handleJsonError(
                            env, NamespaceGlobal.json_last_error.env(env).call().value(), data);
        }

        return ZVal.assign(json);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    private Object jsonEncode(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        if (NamespaceGlobal.version_compare.env(env).call("7.2.11-dev", "5.4.0", ">=").getBool()) {
            return ZVal.assign(
                    NamespaceGlobal.json_encode
                            .env(env)
                            .call(data, ZVal.toLong(64) | ZVal.toLong(256))
                            .value());
        }

        return ZVal.assign(NamespaceGlobal.json_encode.env(env).call(data).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    @ConvertedParameter(index = 1, name = "data")
    private Object handleJsonError(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        ReferenceContainer data = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object json = null;
        if (ZVal.strictNotEqualityCheck(code, "!==", 5)) {
            this.throwEncodeError(env, code, data.getObject());
        }

        if (function_is_string.f.env(env).call(data.getObject()).getBool()) {
            env.callMethod(
                    this,
                    new RuntimeArgsWithReferences().add(0, data),
                    "detectAndCleanUtf8",
                    NormalizerFormatter.class,
                    data.getObject());

        } else if (function_is_array.f.env(env).call(data.getObject()).getBool()) {
            function_array_walk_recursive
                    .f
                    .env(env)
                    .call(
                            data.getObject(),
                            ZVal.newArray(new ZPair(0, this), new ZPair(1, "detectAndCleanUtf8")));

        } else {
            this.throwEncodeError(env, code, data.getObject());
        }

        json = this.jsonEncode(env, data.getObject());
        if (ZVal.strictEqualityCheck(json, "===", false)) {
            this.throwEncodeError(
                    env, NamespaceGlobal.json_last_error.env(env).call().value(), data.getObject());
        }

        return ZVal.assign(json);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    @ConvertedParameter(index = 1, name = "data")
    private Object throwEncodeError(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object code = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        Object msg = null;
        SwitchEnumType38 switchVariable38 =
                ZVal.getEnum(
                        code,
                        SwitchEnumType38.DEFAULT_CASE,
                        SwitchEnumType38.DYNAMIC_TYPE_111,
                        1,
                        SwitchEnumType38.DYNAMIC_TYPE_112,
                        2,
                        SwitchEnumType38.DYNAMIC_TYPE_113,
                        3,
                        SwitchEnumType38.DYNAMIC_TYPE_114,
                        5);
        switch (switchVariable38) {
            case DYNAMIC_TYPE_111:
                msg = "Maximum stack depth exceeded";
                break;
            case DYNAMIC_TYPE_112:
                msg = "Underflow or the modes mismatch";
                break;
            case DYNAMIC_TYPE_113:
                msg = "Unexpected control character found";
                break;
            case DYNAMIC_TYPE_114:
                msg = "Malformed UTF-8 characters, possibly incorrectly encoded";
                break;
            case DEFAULT_CASE:
                msg = "Unknown error";
        }
        ;
        throw ZVal.getException(
                env,
                new RuntimeException(
                        env,
                        "JSON encoding failed: "
                                + toStringR(msg, env)
                                + ". Encoding: "
                                + toStringR(
                                        NamespaceGlobal.var_export
                                                .env(env)
                                                .call(data, true)
                                                .value(),
                                        env)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    public Object detectAndCleanUtf8(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/monolog/monolog/src/Monolog/Formatter")
                        .setFile(
                                "/vendor/monolog/monolog/src/Monolog/Formatter/NormalizerFormatter.php");
        ReferenceContainer data = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        if (ZVal.toBool(function_is_string.f.env(env).call(data.getObject()).value())
                && ZVal.toBool(
                        !function_preg_match.f.env(env).call("//u", data.getObject()).getBool())) {
            data.setObject(
                    NamespaceGlobal.preg_replace_callback
                            .env(env)
                            .call(
                                    "/[\\x80-\\xFF]+/",
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Monolog\\Formatter",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(index = 0, name = "m")
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            ReferenceContainer m =
                                                    new BasicReferenceContainer(
                                                            assignParameter(args, 0, false));
                                            return ZVal.assign(
                                                    NamespaceGlobal.utf8_encode
                                                            .env(env)
                                                            .call(m.arrayGet(env, 0))
                                                            .value());
                                        }
                                    },
                                    data.getObject())
                            .value());
            data.setObject(
                    function_str_replace
                            .f
                            .env(env)
                            .call(
                                    ZVal.arrayFromList(
                                            "\u00A4", "\u00A6", "\u00A8", "\u00B4", "\u00B8",
                                            "\u00BC", "\u00BD", "\u00BE"),
                                    ZVal.arrayFromList(
                                            "\u20AC", "\u0160", "\u0161", "\u017D", "\u017E",
                                            "\u0152", "\u0153", "\u0178"),
                                    data.getObject())
                            .value());
        }

        return null;
    }

    public Object detectAndCleanUtf8(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    public static final Object CONST_SIMPLE_DATE = "Y-m-d H:i:s";

    public static final Object CONST_class = "Monolog\\Formatter\\NormalizerFormatter";

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
                    .setName("Monolog\\Formatter\\NormalizerFormatter")
                    .setLookup(
                            NormalizerFormatter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("dateFormat")
                    .setFilename(
                            "vendor/monolog/monolog/src/Monolog/Formatter/NormalizerFormatter.php")
                    .addInterface("Monolog\\Formatter\\FormatterInterface")
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

    private enum SwitchEnumType38 {
        DYNAMIC_TYPE_111,
        DYNAMIC_TYPE_112,
        DYNAMIC_TYPE_113,
        DYNAMIC_TYPE_114,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
