package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes;

import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_scalar;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.NormalizerFormatter;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Formatter/HtmlFormatter.php

*/

public class HtmlFormatter extends NormalizerFormatter {

    public Object logLevels =
            ZVal.newArray(
                    new ZPair(Logger.CONST_DEBUG, "#cccccc"),
                    new ZPair(Logger.CONST_INFO, "#468847"),
                    new ZPair(Logger.CONST_NOTICE, "#3a87ad"),
                    new ZPair(Logger.CONST_WARNING, "#c09853"),
                    new ZPair(Logger.CONST_ERROR, "#f0ad4e"),
                    new ZPair(Logger.CONST_CRITICAL, "#FF7708"),
                    new ZPair(Logger.CONST_ALERT, "#C12A19"),
                    new ZPair(Logger.CONST_EMERGENCY, "#000000"));

    public HtmlFormatter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == HtmlFormatter.class) {
            this.__construct(env, args);
        }
    }

    public HtmlFormatter(NoConstructor n) {
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
        super.__construct(env, dateFormat);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "th")
    @ConvertedParameter(index = 1, name = "td")
    @ConvertedParameter(
        index = 2,
        name = "escapeTd",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    protected Object addRow(RuntimeEnv env, Object... args) {
        Object th = assignParameter(args, 0, false);
        Object td = assignParameter(args, 1, true);
        if (null == td) {
            td = " ";
        }
        Object escapeTd = assignParameter(args, 2, true);
        if (null == escapeTd) {
            escapeTd = true;
        }
        th = NamespaceGlobal.htmlspecialchars.env(env).call(th, 0, "UTF-8").value();
        if (ZVal.isTrue(escapeTd)) {
            td =
                    "<pre>"
                            + toStringR(
                                    NamespaceGlobal.htmlspecialchars
                                            .env(env)
                                            .call(td, 0, "UTF-8")
                                            .value(),
                                    env)
                            + "</pre>";
        }

        return ZVal.assign(
                toStringR(
                                "<tr style=\"padding: 4px;spacing: 0;text-align: left;\">\n<th style=\"background: #cccccc\" width=\"100px\">"
                                        + toStringR(th, env)
                                        + ":</th>\n<td style=\"padding: 4px;spacing: 0;text-align: left;background: #eeeeee\">",
                                env)
                        + toStringR(td, env)
                        + "</td>\n</tr>");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "title")
    @ConvertedParameter(index = 1, name = "level")
    protected Object addTitle(RuntimeEnv env, Object... args) {
        Object title = assignParameter(args, 0, false);
        Object level = assignParameter(args, 1, false);
        title = NamespaceGlobal.htmlspecialchars.env(env).call(title, 0, "UTF-8").value();
        return ZVal.assign(
                "<h1 style=\"background: "
                        + toStringR(
                                new ReferenceClassProperty(this, "logLevels", env)
                                        .arrayGet(env, level),
                                env)
                        + ";color: #ffffff;padding: 5px;\" class=\"monolog-output\">"
                        + toStringR(title, env)
                        + "</h1>");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object format(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object output = null;
        Object embeddedTable = null;
        Object value = null;
        Object key = null;
        output =
                this.addTitle(
                        env, record.arrayGet(env, "level_name"), record.arrayGet(env, "level"));
        output =
                toStringR(output, env)
                        + "<table cellspacing=\"1\" width=\"100%\" class=\"monolog-output\">";
        output =
                toStringR(output, env)
                        + toStringR(
                                this.addRow(
                                        env,
                                        "Message",
                                        toStringR(record.arrayGet(env, "message"), env)),
                                env);
        output =
                toStringR(output, env)
                        + toStringR(
                                this.addRow(
                                        env,
                                        "Time",
                                        env.callMethod(
                                                record.arrayGet(env, "datetime"),
                                                "format",
                                                HtmlFormatter.class,
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("dateFormat")
                                                        .value())),
                                env);
        output =
                toStringR(output, env)
                        + toStringR(
                                this.addRow(env, "Channel", record.arrayGet(env, "channel")), env);
        if (ZVal.isTrue(record.arrayGet(env, "context"))) {
            embeddedTable = "<table cellspacing=\"1\" width=\"100%\">";
            for (ZPair zpairResult743 :
                    ZVal.getIterable(record.arrayGet(env, "context"), env, false)) {
                key = ZVal.assign(zpairResult743.getKey());
                value = ZVal.assign(zpairResult743.getValue());
                embeddedTable =
                        toStringR(embeddedTable, env)
                                + toStringR(
                                        this.addRow(env, key, this.convertToString(env, value)),
                                        env);
            }

            embeddedTable = toStringR(embeddedTable, env) + "</table>";
            output =
                    toStringR(output, env)
                            + toStringR(this.addRow(env, "Context", embeddedTable, false), env);
        }

        if (ZVal.isTrue(record.arrayGet(env, "extra"))) {
            embeddedTable = "<table cellspacing=\"1\" width=\"100%\">";
            for (ZPair zpairResult744 :
                    ZVal.getIterable(record.arrayGet(env, "extra"), env, false)) {
                key = ZVal.assign(zpairResult744.getKey());
                value = ZVal.assign(zpairResult744.getValue());
                embeddedTable =
                        toStringR(embeddedTable, env)
                                + toStringR(
                                        this.addRow(env, key, this.convertToString(env, value)),
                                        env);
            }

            embeddedTable = toStringR(embeddedTable, env) + "</table>";
            output =
                    toStringR(output, env)
                            + toStringR(this.addRow(env, "Extra", embeddedTable, false), env);
        }

        return ZVal.assign(toStringR(output, env) + "</table>");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "records", typeHint = "array")
    public Object formatBatch(RuntimeEnv env, Object... args) {
        Object records = assignParameter(args, 0, false);
        Object record = null;
        Object message = null;
        message = "";
        for (ZPair zpairResult745 : ZVal.getIterable(records, env, true)) {
            record = ZVal.assign(zpairResult745.getValue());
            message = toStringR(message, env) + toStringR(this.format(env, record), env);
        }

        return ZVal.assign(message);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    protected Object convertToString(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        if (ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", data))
                || ZVal.toBool(function_is_scalar.f.env(env).call(data).value())) {
            return ZVal.assign(toStringR(data, env));
        }

        data = env.callMethod(this, "normalize", HtmlFormatter.class, data);
        if (NamespaceGlobal.version_compare.env(env).call("7.2.11-dev", "5.4.0", ">=").getBool()) {
            return ZVal.assign(
                    NamespaceGlobal.json_encode
                            .env(env)
                            .call(
                                    data,
                                    ZVal.toLong(ZVal.toLong(128) | ZVal.toLong(64))
                                            | ZVal.toLong(256))
                            .value());
        }

        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call("\\/", "/", NamespaceGlobal.json_encode.env(env).call(data).value())
                        .value());
    }

    public static final Object CONST_class = "Monolog\\Formatter\\HtmlFormatter";

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
                    .setName("Monolog\\Formatter\\HtmlFormatter")
                    .setLookup(
                            HtmlFormatter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("dateFormat", "logLevels")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Formatter/HtmlFormatter.php")
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
