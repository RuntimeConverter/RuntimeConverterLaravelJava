package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.NormalizerFormatter;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_scalar;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_bool;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Formatter/LineFormatter.php

*/

public class LineFormatter extends NormalizerFormatter {

    public Object format = null;

    public Object allowInlineLineBreaks = null;

    public Object ignoreEmptyContextAndExtra = null;

    public Object includeStacktraces = null;

    public LineFormatter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == LineFormatter.class) {
            this.__construct(env, args);
        }
    }

    public LineFormatter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "format",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "dateFormat",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "allowInlineLineBreaks",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "ignoreEmptyContextAndExtra",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object format = assignParameter(args, 0, true);
        if (null == format) {
            format = ZVal.getNull();
        }
        Object dateFormat = assignParameter(args, 1, true);
        if (null == dateFormat) {
            dateFormat = ZVal.getNull();
        }
        Object allowInlineLineBreaks = assignParameter(args, 2, true);
        if (null == allowInlineLineBreaks) {
            allowInlineLineBreaks = false;
        }
        Object ignoreEmptyContextAndExtra = assignParameter(args, 3, true);
        if (null == ignoreEmptyContextAndExtra) {
            ignoreEmptyContextAndExtra = false;
        }
        Object ternaryExpressionTemp = null;
        this.format =
                ZVal.isTrue(ternaryExpressionTemp = format)
                        ? ternaryExpressionTemp
                        : ClassConstantUtils.getConstantValueLateStatic(env, this, "SIMPLE_FORMAT");
        this.allowInlineLineBreaks = allowInlineLineBreaks;
        this.ignoreEmptyContextAndExtra = ignoreEmptyContextAndExtra;
        super.__construct(env, dateFormat);
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
        if (ZVal.isTrue(this.includeStacktraces)) {
            this.allowInlineLineBreaks = true;
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "allow",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object allowInlineLineBreaks(RuntimeEnv env, Object... args) {
        Object allow = assignParameter(args, 0, true);
        if (null == allow) {
            allow = true;
        }
        this.allowInlineLineBreaks = allow;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "ignore",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object ignoreEmptyContextAndExtra(RuntimeEnv env, Object... args) {
        Object ignore = assignParameter(args, 0, true);
        if (null == ignore) {
            ignore = true;
        }
        this.ignoreEmptyContextAndExtra = ignore;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object format(RuntimeEnv env, Object... args) {
        Object record = assignParameter(args, 0, false);
        Object output = null;
        Object val = null;
        Object var = null;
        ReferenceContainer vars = new BasicReferenceContainer(null);
        vars.setObject(super.format(env, record));
        output = ZVal.assign(this.format);
        for (ZPair zpairResult748 : ZVal.getIterable(vars.arrayGet(env, "extra"), env, false)) {
            var = ZVal.assign(zpairResult748.getKey());
            val = ZVal.assign(zpairResult748.getValue());
            if (ZVal.strictNotEqualityCheck(
                    false,
                    "!==",
                    function_strpos
                            .f
                            .env(env)
                            .call(output, "%extra." + toStringR(var, env) + "%")
                            .value())) {
                output =
                        function_str_replace
                                .f
                                .env(env)
                                .call(
                                        "%extra." + toStringR(var, env) + "%",
                                        this.stringify(env, val),
                                        output)
                                .value();
                arrayActionR(ArrayAction.UNSET, vars, env, "extra", var);
            }
        }

        for (ZPair zpairResult749 : ZVal.getIterable(vars.arrayGet(env, "context"), env, false)) {
            var = ZVal.assign(zpairResult749.getKey());
            val = ZVal.assign(zpairResult749.getValue());
            if (ZVal.strictNotEqualityCheck(
                    false,
                    "!==",
                    function_strpos
                            .f
                            .env(env)
                            .call(output, "%context." + toStringR(var, env) + "%")
                            .value())) {
                output =
                        function_str_replace
                                .f
                                .env(env)
                                .call(
                                        "%context." + toStringR(var, env) + "%",
                                        this.stringify(env, val),
                                        output)
                                .value();
                arrayActionR(ArrayAction.UNSET, vars, env, "context", var);
            }
        }

        if (ZVal.isTrue(this.ignoreEmptyContextAndExtra)) {
            if (arrayActionR(ArrayAction.EMPTY, vars, env, "context")) {
                arrayActionR(ArrayAction.UNSET, vars, env, "context");
                output = function_str_replace.f.env(env).call("%context%", "", output).value();
            }

            if (arrayActionR(ArrayAction.EMPTY, vars, env, "extra")) {
                arrayActionR(ArrayAction.UNSET, vars, env, "extra");
                output = function_str_replace.f.env(env).call("%extra%", "", output).value();
            }
        }

        for (ZPair zpairResult750 : ZVal.getIterable(vars.getObject(), env, false)) {
            var = ZVal.assign(zpairResult750.getKey());
            val = ZVal.assign(zpairResult750.getValue());
            if (ZVal.strictNotEqualityCheck(
                    false,
                    "!==",
                    function_strpos
                            .f
                            .env(env)
                            .call(output, "%" + toStringR(var, env) + "%")
                            .value())) {
                output =
                        function_str_replace
                                .f
                                .env(env)
                                .call(
                                        "%" + toStringR(var, env) + "%",
                                        this.stringify(env, val),
                                        output)
                                .value();
            }
        }

        if (ZVal.strictNotEqualityCheck(
                false, "!==", function_strpos.f.env(env).call(output, "%").value())) {
            output =
                    function_preg_replace
                            .f
                            .env(env)
                            .call("/%(?:extra|context)\\..+?%/", "", output)
                            .value();
        }

        return ZVal.assign(output);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "records", typeHint = "array")
    public Object formatBatch(RuntimeEnv env, Object... args) {
        Object records = assignParameter(args, 0, false);
        Object record = null;
        Object message = null;
        message = "";
        for (ZPair zpairResult751 : ZVal.getIterable(records, env, true)) {
            record = ZVal.assign(zpairResult751.getValue());
            message = toStringR(message, env) + toStringR(this.format(env, record), env);
        }

        return ZVal.assign(message);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object stringify(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(this.replaceNewlines(env, this.convertToString(env, value)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e")
    protected Object normalizeException(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        Object str = null;
        Object previousText = null;
        Object previous = null;
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

        previousText = "";
        if (ZVal.isTrue(previous = env.callMethod(e, "getPrevious", LineFormatter.class))) {
            do {
                previousText =
                        toStringR(previousText, env)
                                + ", "
                                + toStringR(
                                        function_get_class.f.env(env).call(previous).value(), env)
                                + "(code: "
                                + toStringR(
                                        env.callMethod(previous, "getCode", LineFormatter.class),
                                        env)
                                + "): "
                                + toStringR(
                                        env.callMethod(previous, "getMessage", LineFormatter.class),
                                        env)
                                + " at "
                                + toStringR(
                                        env.callMethod(previous, "getFile", LineFormatter.class),
                                        env)
                                + ":"
                                + toStringR(
                                        env.callMethod(previous, "getLine", LineFormatter.class),
                                        env);

            } while (ZVal.isTrue(
                    previous = env.callMethod(previous, "getPrevious", LineFormatter.class)));
        }

        str =
                "[object] ("
                        + toStringR(function_get_class.f.env(env).call(e).value(), env)
                        + "(code: "
                        + toStringR(env.callMethod(e, "getCode", LineFormatter.class), env)
                        + "): "
                        + toStringR(env.callMethod(e, "getMessage", LineFormatter.class), env)
                        + " at "
                        + toStringR(env.callMethod(e, "getFile", LineFormatter.class), env)
                        + ":"
                        + toStringR(env.callMethod(e, "getLine", LineFormatter.class), env)
                        + toStringR(previousText, env)
                        + ")";
        if (ZVal.isTrue(this.includeStacktraces)) {
            str =
                    toStringR(str, env)
                            + "\n[stacktrace]\n"
                            + toStringR(
                                    env.callMethod(e, "getTraceAsString", LineFormatter.class), env)
                            + "\n";
        }

        return ZVal.assign(str);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    protected Object convertToString(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        if (ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", data))
                || ZVal.toBool(function_is_bool.f.env(env).call(data).value())) {
            return ZVal.assign(NamespaceGlobal.var_export.env(env).call(data, true).value());
        }

        if (function_is_scalar.f.env(env).call(data).getBool()) {
            return ZVal.assign(toStringR(data, env));
        }

        if (NamespaceGlobal.version_compare.env(env).call("7.2.11-dev", "5.4.0", ">=").getBool()) {
            return ZVal.assign(env.callMethod(this, "toJson", LineFormatter.class, data, true));
        }

        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call("\\/", "/", NamespaceGlobal.json_encode.env(env).call(data).value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "str")
    protected Object replaceNewlines(RuntimeEnv env, Object... args) {
        Object str = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.allowInlineLineBreaks)) {
            if (ZVal.strictEqualityCheck(
                    0, "===", function_strpos.f.env(env).call(str, "{").value())) {
                return ZVal.assign(
                        function_str_replace
                                .f
                                .env(env)
                                .call(
                                        ZVal.arrayFromList("\\r", "\\n"),
                                        ZVal.arrayFromList("\r", "\n"),
                                        str)
                                .value());
            }

            return ZVal.assign(str);
        }

        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(ZVal.arrayFromList("\r\n", "\r", "\n"), " ", str)
                        .value());
    }

    public static final Object CONST_SIMPLE_FORMAT =
            "[%datetime%] %channel%.%level_name%: %message% %context% %extra%\n";

    public static final Object CONST_class = "Monolog\\Formatter\\LineFormatter";

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
                    .setName("Monolog\\Formatter\\LineFormatter")
                    .setLookup(
                            LineFormatter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "allowInlineLineBreaks",
                            "dateFormat",
                            "format",
                            "ignoreEmptyContextAndExtra",
                            "includeStacktraces")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Formatter/LineFormatter.php")
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
