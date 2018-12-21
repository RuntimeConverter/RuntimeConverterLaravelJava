package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.FormatterInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Formatter/MongoDBFormatter.php

*/

public class MongoDBFormatter extends RuntimeClassBase implements FormatterInterface {

    public Object exceptionTraceAsString = null;

    public Object maxNestingLevel = null;

    public MongoDBFormatter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MongoDBFormatter.class) {
            this.__construct(env, args);
        }
    }

    public MongoDBFormatter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "maxNestingLevel",
        defaultValue = "3",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 1,
        name = "exceptionTraceAsString",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object maxNestingLevel = assignParameter(args, 0, true);
        if (null == maxNestingLevel) {
            maxNestingLevel = 3;
        }
        Object exceptionTraceAsString = assignParameter(args, 1, true);
        if (null == exceptionTraceAsString) {
            exceptionTraceAsString = true;
        }
        this.maxNestingLevel = NamespaceGlobal.max.env(env).call(maxNestingLevel, 0).value();
        this.exceptionTraceAsString = ZVal.toBool(exceptionTraceAsString);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object format(RuntimeEnv env, Object... args) {
        Object record = assignParameter(args, 0, false);
        return ZVal.assign(this.formatArray(env, record));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "records", typeHint = "array")
    public Object formatBatch(RuntimeEnv env, Object... args) {
        ReferenceContainer records = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object record = null;
        Object key = null;
        for (ZPair zpairResult756 : ZVal.getIterable(records.getObject(), env, false)) {
            key = ZVal.assign(zpairResult756.getKey());
            record = ZVal.assign(zpairResult756.getValue());
            records.arrayAccess(env, key).set(this.format(env, record));
        }

        return ZVal.assign(records.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "nestingLevel",
        defaultValue = "0",
        defaultValueType = "number"
    )
    protected Object formatArray(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object nestingLevel = assignParameter(args, 1, true);
        if (null == nestingLevel) {
            nestingLevel = 0;
        }
        Object name = null;
        Object value = null;
        if (ZVal.toBool(ZVal.equalityCheck(this.maxNestingLevel, 0))
                || ZVal.toBool(
                        ZVal.isLessThanOrEqualTo(nestingLevel, "<=", this.maxNestingLevel))) {
            for (ZPair zpairResult757 : ZVal.getIterable(record.getObject(), env, false)) {
                name = ZVal.assign(zpairResult757.getKey());
                value = ZVal.assign(zpairResult757.getValue());
                if (ZVal.isTrue(ZVal.checkInstanceType(value, DateTime.class, "DateTime"))) {
                    record.arrayAccess(env, name)
                            .set(this.formatDate(env, value, ZVal.add(nestingLevel, 1)));

                } else if (ZVal.isTrue(
                        ZVal.checkInstanceType(value, PHPException.class, "Exception"))) {
                    record.arrayAccess(env, name)
                            .set(this.formatException(env, value, ZVal.add(nestingLevel, 1)));

                } else if (function_is_array.f.env(env).call(value).getBool()) {
                    record.arrayAccess(env, name)
                            .set(this.formatArray(env, value, ZVal.add(nestingLevel, 1)));

                } else if (function_is_object.f.env(env).call(value).getBool()) {
                    record.arrayAccess(env, name)
                            .set(this.formatObject(env, value, ZVal.add(nestingLevel, 1)));
                }
            }

        } else {
            record.setObject("[...]");
        }

        return ZVal.assign(record.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(index = 1, name = "nestingLevel")
    protected Object formatObject(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object nestingLevel = assignParameter(args, 1, false);
        ReferenceContainer objectVars = new BasicReferenceContainer(null);
        objectVars.setObject(NamespaceGlobal.get_object_vars.env(env).call(value).value());
        objectVars.arrayAccess(env, "class").set(function_get_class.f.env(env).call(value).value());
        return ZVal.assign(this.formatArray(env, objectVars.getObject(), nestingLevel));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exception", typeHint = "Exception")
    @ConvertedParameter(index = 1, name = "nestingLevel")
    protected Object formatException(RuntimeEnv env, Object... args) {
        Object exception = assignParameter(args, 0, false);
        Object nestingLevel = assignParameter(args, 1, false);
        ReferenceContainer formattedException = new BasicReferenceContainer(null);
        formattedException.setObject(
                ZVal.newArray(
                        new ZPair("class", function_get_class.f.env(env).call(exception).value()),
                        new ZPair(
                                "message",
                                env.callMethod(exception, "getMessage", MongoDBFormatter.class)),
                        new ZPair(
                                "code",
                                env.callMethod(exception, "getCode", MongoDBFormatter.class)),
                        new ZPair(
                                "file",
                                toStringR(
                                                env.callMethod(
                                                        exception,
                                                        "getFile",
                                                        MongoDBFormatter.class),
                                                env)
                                        + ":"
                                        + toStringR(
                                                env.callMethod(
                                                        exception,
                                                        "getLine",
                                                        MongoDBFormatter.class),
                                                env))));
        if (ZVal.strictEqualityCheck(this.exceptionTraceAsString, "===", true)) {
            formattedException
                    .arrayAccess(env, "trace")
                    .set(env.callMethod(exception, "getTraceAsString", MongoDBFormatter.class));

        } else {
            formattedException
                    .arrayAccess(env, "trace")
                    .set(env.callMethod(exception, "getTrace", MongoDBFormatter.class));
        }

        return ZVal.assign(this.formatArray(env, formattedException.getObject(), nestingLevel));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", typeHint = "DateTime")
    @ConvertedParameter(index = 1, name = "nestingLevel")
    protected Object formatDate(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object nestingLevel = assignParameter(args, 1, false);
        return ZVal.assign(
                env.createNew(
                        ZVal.resolveClassAlias(env, "MongoDate"),
                        env.callMethod(value, "getTimestamp", MongoDBFormatter.class)));
    }

    public static final Object CONST_class = "Monolog\\Formatter\\MongoDBFormatter";

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
                    .setName("Monolog\\Formatter\\MongoDBFormatter")
                    .setLookup(
                            MongoDBFormatter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("exceptionTraceAsString", "maxNestingLevel")
                    .setFilename(
                            "vendor/monolog/monolog/src/Monolog/Formatter/MongoDBFormatter.php")
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
