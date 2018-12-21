package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.MailHandler;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.LineFormatter;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/NativeMailerHandler.php

*/

public class NativeMailerHandler extends MailHandler {

    public Object to = null;

    public Object subject = null;

    public Object headers = ZVal.newArray();

    public Object parameters = ZVal.newArray();

    public Object maxColumnWidth = null;

    public Object contentType = "text/plain";

    public Object encoding = "utf-8";

    public NativeMailerHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == NativeMailerHandler.class) {
            this.__construct(env, args);
        }
    }

    public NativeMailerHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "to")
    @ConvertedParameter(index = 1, name = "subject")
    @ConvertedParameter(index = 2, name = "from")
    @ConvertedParameter(index = 3, name = "level")
    @ConvertedParameter(
        index = 4,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "maxColumnWidth",
        defaultValue = "70",
        defaultValueType = "number"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object to = assignParameter(args, 0, false);
        Object subject = assignParameter(args, 1, false);
        Object from = assignParameter(args, 2, false);
        Object level = assignParameter(args, 3, true);
        if (null == level) {
            level = Logger.CONST_ERROR;
        }
        Object bubble = assignParameter(args, 4, true);
        if (null == bubble) {
            bubble = true;
        }
        Object maxColumnWidth = assignParameter(args, 5, true);
        if (null == maxColumnWidth) {
            maxColumnWidth = 70;
        }
        super.__construct(env, level, bubble);
        this.to =
                function_is_array.f.env(env).call(to).getBool()
                        ? to
                        : ZVal.newArray(new ZPair(0, to));
        this.subject = subject;
        this.addHeader(env, function_sprintf.f.env(env).call("From: %s", from).value());
        this.maxColumnWidth = maxColumnWidth;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "headers")
    public Object addHeader(RuntimeEnv env, Object... args) {
        Object headers = assignParameter(args, 0, false);
        Object header = null;
        for (ZPair zpairResult791 : ZVal.getIterable(rToArrayCast(headers), env, true)) {
            header = ZVal.assign(zpairResult791.getValue());
            if (ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    function_strpos.f.env(env).call(header, "\n").value(),
                                    "!==",
                                    false))
                    || ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    function_strpos.f.env(env).call(header, "\r").value(),
                                    "!==",
                                    false))) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                "Headers can not contain newline characters for security reasons"));
            }

            new ReferenceClassProperty(this, "headers", env).arrayAppend(env).set(header);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters")
    public Object addParameter(RuntimeEnv env, Object... args) {
        Object parameters = assignParameter(args, 0, false);
        this.parameters =
                function_array_merge
                        .f
                        .env(env)
                        .call(this.parameters, rToArrayCast(parameters))
                        .value();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content")
    @ConvertedParameter(index = 1, name = "records", typeHint = "array")
    protected Object send(RuntimeEnv env, Object... args) {
        Object content = assignParameter(args, 0, false);
        Object records = assignParameter(args, 1, false);
        Object headers = null;
        Object subject = null;
        Object to = null;
        Object parameters = null;
        Object subjectFormatter = null;
        content = NamespaceGlobal.wordwrap.env(env).call(content, this.maxColumnWidth).value();
        headers =
                function_ltrim
                        .f
                        .env(env)
                        .call(
                                toStringR(
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call("\r\n", this.headers)
                                                        .value(),
                                                env)
                                        + "\r\n",
                                "\r\n")
                        .value();
        headers =
                toStringR(headers, env)
                        + "Content-type: "
                        + toStringR(this.getContentType(env), env)
                        + "; charset="
                        + toStringR(this.getEncoding(env), env)
                        + "\r\n";
        if (ZVal.toBool(ZVal.equalityCheck(this.getContentType(env), "text/html"))
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                false,
                                "===",
                                function_strpos
                                        .f
                                        .env(env)
                                        .call(headers, "MIME-Version:")
                                        .value()))) {
            headers = toStringR(headers, env) + "MIME-Version: 1.0" + "\r\n";
        }

        subject = ZVal.assign(this.subject);
        if (ZVal.isTrue(records)) {
            subjectFormatter = new LineFormatter(env, this.subject);
            subject =
                    env.callMethod(
                            subjectFormatter,
                            "format",
                            NativeMailerHandler.class,
                            env.callMethod(
                                    this, "getHighestRecord", NativeMailerHandler.class, records));
        }

        parameters = NamespaceGlobal.implode.env(env).call(" ", this.parameters).value();
        for (ZPair zpairResult792 : ZVal.getIterable(this.to, env, true)) {
            to = ZVal.assign(zpairResult792.getValue());
            NamespaceGlobal.mail.env(env).call(to, subject, content, headers, parameters);
        }

        return null;
    }

    @ConvertedMethod
    public Object getContentType(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.contentType);
    }

    @ConvertedMethod
    public Object getEncoding(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.encoding);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "contentType")
    public Object setContentType(RuntimeEnv env, Object... args) {
        Object contentType = assignParameter(args, 0, false);
        if (ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                function_strpos.f.env(env).call(contentType, "\n").value(),
                                "!==",
                                false))
                || ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                function_strpos.f.env(env).call(contentType, "\r").value(),
                                "!==",
                                false))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "The content type can not contain newline characters to prevent email header injection"));
        }

        this.contentType = contentType;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "encoding")
    public Object setEncoding(RuntimeEnv env, Object... args) {
        Object encoding = assignParameter(args, 0, false);
        if (ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                function_strpos.f.env(env).call(encoding, "\n").value(),
                                "!==",
                                false))
                || ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                function_strpos.f.env(env).call(encoding, "\r").value(),
                                "!==",
                                false))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "The encoding can not contain newline characters to prevent email header injection"));
        }

        this.encoding = encoding;
        return ZVal.assign(this);
    }

    public static final Object CONST_class = "Monolog\\Handler\\NativeMailerHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends MailHandler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Handler\\NativeMailerHandler")
                    .setLookup(
                            NativeMailerHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bubble",
                            "contentType",
                            "encoding",
                            "formatter",
                            "headers",
                            "level",
                            "maxColumnWidth",
                            "parameters",
                            "processors",
                            "subject",
                            "to")
                    .setFilename(
                            "vendor/monolog/monolog/src/Monolog/Handler/NativeMailerHandler.php")
                    .addInterface("Monolog\\Handler\\HandlerInterface")
                    .addExtendsClass("Monolog\\Handler\\MailHandler")
                    .addExtendsClass("Monolog\\Handler\\AbstractProcessingHandler")
                    .addExtendsClass("Monolog\\Handler\\AbstractHandler")
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
