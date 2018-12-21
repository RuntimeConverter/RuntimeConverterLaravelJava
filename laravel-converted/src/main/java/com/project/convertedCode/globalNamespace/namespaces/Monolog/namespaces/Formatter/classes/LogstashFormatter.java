package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.NormalizerFormatter;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Formatter/LogstashFormatter.php

*/

public class LogstashFormatter extends NormalizerFormatter {

    public Object systemName = null;

    public Object applicationName = null;

    public Object extraPrefix = null;

    public Object contextPrefix = null;

    public Object version = null;

    public LogstashFormatter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == LogstashFormatter.class) {
            this.__construct(env, args);
        }
    }

    public LogstashFormatter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "applicationName")
    @ConvertedParameter(
        index = 1,
        name = "systemName",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "extraPrefix",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 3, name = "contextPrefix")
    @ConvertedParameter(index = 4, name = "version")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object applicationName = assignParameter(args, 0, false);
        Object systemName = assignParameter(args, 1, true);
        if (null == systemName) {
            systemName = ZVal.getNull();
        }
        Object extraPrefix = assignParameter(args, 2, true);
        if (null == extraPrefix) {
            extraPrefix = ZVal.getNull();
        }
        Object contextPrefix = assignParameter(args, 3, true);
        if (null == contextPrefix) {
            contextPrefix = "ctxt_";
        }
        Object version = assignParameter(args, 4, true);
        if (null == version) {
            version = CONST_V0;
        }
        Object ternaryExpressionTemp = null;
        super.__construct(env, "Y-m-d\\TH:i:s.uP");
        this.systemName =
                ZVal.isTrue(ternaryExpressionTemp = systemName)
                        ? ternaryExpressionTemp
                        : NamespaceGlobal.gethostname.env(env).call().value();
        this.applicationName = applicationName;
        this.extraPrefix = extraPrefix;
        this.contextPrefix = contextPrefix;
        this.version = version;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object format(RuntimeEnv env, Object... args) {
        Object record = assignParameter(args, 0, false);
        Object message = null;
        record = super.format(env, record);
        if (ZVal.strictEqualityCheck(this.version, "===", CONST_V1)) {
            message = this.formatV1(env, record);

        } else {
            message = this.formatV0(env, record);
        }

        return ZVal.assign(
                toStringR(env.callMethod(this, "toJson", LogstashFormatter.class, message), env)
                        + "\n");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object formatV0(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object val = null;
        ReferenceContainer message = new BasicReferenceContainer(null);
        Object key = null;
        if (arrayActionR(ArrayAction.EMPTY, record, env, "datetime")) {
            record.arrayAccess(env, "datetime")
                    .set(NamespaceGlobal.gmdate.env(env).call("c").value());
        }

        message.setObject(
                ZVal.newArray(
                        new ZPair("@timestamp", record.arrayGet(env, "datetime")),
                        new ZPair("@source", this.systemName),
                        new ZPair("@fields", ZVal.newArray())));
        if (arrayActionR(ArrayAction.ISSET, record, env, "message")) {
            message.arrayAccess(env, "@message").set(record.arrayGet(env, "message"));
        }

        if (arrayActionR(ArrayAction.ISSET, record, env, "channel")) {
            message.arrayAccess(env, "@tags")
                    .set(ZVal.newArray(new ZPair(0, record.arrayGet(env, "channel"))));
            message.arrayAccess(env, "@fields", "channel").set(record.arrayGet(env, "channel"));
        }

        if (arrayActionR(ArrayAction.ISSET, record, env, "level")) {
            message.arrayAccess(env, "@fields", "level").set(record.arrayGet(env, "level"));
        }

        if (ZVal.isTrue(this.applicationName)) {
            message.arrayAccess(env, "@type").set(this.applicationName);
        }

        if (arrayActionR(ArrayAction.ISSET, record, env, "extra", "server")) {
            message.arrayAccess(env, "@source_host").set(record.arrayGet(env, "extra", "server"));
        }

        if (arrayActionR(ArrayAction.ISSET, record, env, "extra", "url")) {
            message.arrayAccess(env, "@source_path").set(record.arrayGet(env, "extra", "url"));
        }

        if (!arrayActionR(ArrayAction.EMPTY, record, env, "extra")) {
            for (ZPair zpairResult752 :
                    ZVal.getIterable(record.arrayGet(env, "extra"), env, false)) {
                key = ZVal.assign(zpairResult752.getKey());
                val = ZVal.assign(zpairResult752.getValue());
                message.arrayAccess(
                                env,
                                "@fields",
                                toStringR(this.extraPrefix, env) + toStringR(key, env))
                        .set(val);
            }
        }

        if (!arrayActionR(ArrayAction.EMPTY, record, env, "context")) {
            for (ZPair zpairResult753 :
                    ZVal.getIterable(record.arrayGet(env, "context"), env, false)) {
                key = ZVal.assign(zpairResult753.getKey());
                val = ZVal.assign(zpairResult753.getValue());
                message.arrayAccess(
                                env,
                                "@fields",
                                toStringR(this.contextPrefix, env) + toStringR(key, env))
                        .set(val);
            }
        }

        return ZVal.assign(message.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object formatV1(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object val = null;
        ReferenceContainer message = new BasicReferenceContainer(null);
        Object key = null;
        if (arrayActionR(ArrayAction.EMPTY, record, env, "datetime")) {
            record.arrayAccess(env, "datetime")
                    .set(NamespaceGlobal.gmdate.env(env).call("c").value());
        }

        message.setObject(
                ZVal.newArray(
                        new ZPair("@timestamp", record.arrayGet(env, "datetime")),
                        new ZPair("@version", 1),
                        new ZPair("host", this.systemName)));
        if (arrayActionR(ArrayAction.ISSET, record, env, "message")) {
            message.arrayAccess(env, "message").set(record.arrayGet(env, "message"));
        }

        if (arrayActionR(ArrayAction.ISSET, record, env, "channel")) {
            message.arrayAccess(env, "type").set(record.arrayGet(env, "channel"));
            message.arrayAccess(env, "channel").set(record.arrayGet(env, "channel"));
        }

        if (arrayActionR(ArrayAction.ISSET, record, env, "level_name")) {
            message.arrayAccess(env, "level").set(record.arrayGet(env, "level_name"));
        }

        if (ZVal.isTrue(this.applicationName)) {
            message.arrayAccess(env, "type").set(this.applicationName);
        }

        if (!arrayActionR(ArrayAction.EMPTY, record, env, "extra")) {
            for (ZPair zpairResult754 :
                    ZVal.getIterable(record.arrayGet(env, "extra"), env, false)) {
                key = ZVal.assign(zpairResult754.getKey());
                val = ZVal.assign(zpairResult754.getValue());
                message.arrayAccess(env, toStringR(this.extraPrefix, env) + toStringR(key, env))
                        .set(val);
            }
        }

        if (!arrayActionR(ArrayAction.EMPTY, record, env, "context")) {
            for (ZPair zpairResult755 :
                    ZVal.getIterable(record.arrayGet(env, "context"), env, false)) {
                key = ZVal.assign(zpairResult755.getKey());
                val = ZVal.assign(zpairResult755.getValue());
                message.arrayAccess(env, toStringR(this.contextPrefix, env) + toStringR(key, env))
                        .set(val);
            }
        }

        return ZVal.assign(message.getObject());
    }

    public static final Object CONST_V0 = 0;

    public static final Object CONST_V1 = 1;

    public static final Object CONST_class = "Monolog\\Formatter\\LogstashFormatter";

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
                    .setName("Monolog\\Formatter\\LogstashFormatter")
                    .setLookup(
                            LogstashFormatter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "applicationName",
                            "contextPrefix",
                            "dateFormat",
                            "extraPrefix",
                            "systemName",
                            "version")
                    .setFilename(
                            "vendor/monolog/monolog/src/Monolog/Formatter/LogstashFormatter.php")
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
