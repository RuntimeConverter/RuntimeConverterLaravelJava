package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.FormatterInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Formatter/FlowdockFormatter.php

*/

public class FlowdockFormatter extends RuntimeClassBase implements FormatterInterface {

    public Object source = null;

    public Object sourceEmail = null;

    public FlowdockFormatter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FlowdockFormatter.class) {
            this.__construct(env, args);
        }
    }

    public FlowdockFormatter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "source")
    @ConvertedParameter(index = 1, name = "sourceEmail")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object source = assignParameter(args, 0, false);
        Object sourceEmail = assignParameter(args, 1, false);
        this.source = source;
        this.sourceEmail = sourceEmail;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object format(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object subject = null;
        Object value = null;
        ReferenceContainer tags = new BasicReferenceContainer(null);
        tags.setObject(
                ZVal.newArray(
                        new ZPair(0, "#logs"),
                        new ZPair(
                                1,
                                "#"
                                        + toStringR(
                                                NamespaceGlobal.strtolower
                                                        .env(env)
                                                        .call(record.arrayGet(env, "level_name"))
                                                        .value(),
                                                env)),
                        new ZPair(2, "#" + toStringR(record.arrayGet(env, "channel"), env))));
        for (ZPair zpairResult738 : ZVal.getIterable(record.arrayGet(env, "extra"), env, true)) {
            value = ZVal.assign(zpairResult738.getValue());
            tags.arrayAppend(env).set("#" + toStringR(value, env));
        }

        subject =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "in %s: %s - %s",
                                this.source,
                                record.arrayGet(env, "level_name"),
                                this.getShortMessage(env, record.arrayGet(env, "message")))
                        .value();
        record.arrayAccess(env, "flowdock")
                .set(
                        ZVal.newArray(
                                new ZPair("source", this.source),
                                new ZPair("from_address", this.sourceEmail),
                                new ZPair("subject", subject),
                                new ZPair("content", record.arrayGet(env, "message")),
                                new ZPair("tags", tags.getObject()),
                                new ZPair("project", this.source)));
        return ZVal.assign(record.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "records", typeHint = "array")
    public Object formatBatch(RuntimeEnv env, Object... args) {
        Object records = assignParameter(args, 0, false);
        ReferenceContainer formatted = new BasicReferenceContainer(null);
        Object record = null;
        formatted.setObject(ZVal.newArray());
        for (ZPair zpairResult739 : ZVal.getIterable(records, env, true)) {
            record = ZVal.assign(zpairResult739.getValue());
            formatted.arrayAppend(env).set(this.format(env, record));
        }

        return ZVal.assign(formatted.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    public Object getShortMessage(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        ReferenceContainer hasMbString = new BasicReferenceContainer(null);
        Object maxLength = null;
        hasMbString = env.getInlineStatic(13, null);
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", hasMbString.getObject())) {
            hasMbString.setObject(function_function_exists.f.env(env).call("mb_strlen").value());
        }

        maxLength = 45;
        if (ZVal.isTrue(hasMbString.getObject())) {
            if (ZVal.isGreaterThan(
                    NamespaceGlobal.mb_strlen.env(env).call(message, "UTF-8").value(),
                    '>',
                    maxLength)) {
                message =
                        toStringR(
                                        NamespaceGlobal.mb_substr
                                                .env(env)
                                                .call(
                                                        message,
                                                        0,
                                                        ZVal.subtract(maxLength, 4),
                                                        "UTF-8")
                                                .value(),
                                        env)
                                + " ...";
            }

        } else {
            if (ZVal.isGreaterThan(
                    function_strlen.f.env(env).call(message).value(), '>', maxLength)) {
                message =
                        toStringR(
                                        function_substr
                                                .f
                                                .env(env)
                                                .call(message, 0, ZVal.subtract(maxLength, 4))
                                                .value(),
                                        env)
                                + " ...";
            }
        }

        return ZVal.assign(message);
    }

    public static final Object CONST_class = "Monolog\\Formatter\\FlowdockFormatter";

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
                    .setName("Monolog\\Formatter\\FlowdockFormatter")
                    .setLookup(
                            FlowdockFormatter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("source", "sourceEmail")
                    .setFilename(
                            "vendor/monolog/monolog/src/Monolog/Formatter/FlowdockFormatter.php")
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
}
