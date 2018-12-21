package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.nativeClasses.date.DateTimeImmutable;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_Headers_AbstractHeader;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/Headers/DateHeader.php

*/

public class Swift_Mime_Headers_DateHeader extends Swift_Mime_Headers_AbstractHeader {

    public Object dateTime = null;

    public Swift_Mime_Headers_DateHeader(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Mime_Headers_DateHeader.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Mime_Headers_DateHeader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        env.callMethod(this, "setFieldName", Swift_Mime_Headers_DateHeader.class, name);
        return null;
    }

    @ConvertedMethod
    public Object getFieldType(RuntimeEnv env, Object... args) {
        return ZVal.assign(CONST_TYPE_DATE);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "model")
    public Object setFieldBodyModel(RuntimeEnv env, Object... args) {
        Object model = assignParameter(args, 0, false);
        this.setDateTime(env, model);
        return null;
    }

    @ConvertedMethod
    public Object getFieldBodyModel(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getDateTime(env));
    }

    @ConvertedMethod
    public Object getDateTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.dateTime);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dateTime", typeHint = "DateTimeInterface")
    public Object setDateTime(RuntimeEnv env, Object... args) {
        Object dateTime = assignParameter(args, 0, false);
        Object immutable = null;
        env.callMethod(
                this,
                "clearCachedValueIf",
                Swift_Mime_Headers_DateHeader.class,
                ZVal.notEqualityCheck(
                        env.callMethod(this, "getCachedValue", Swift_Mime_Headers_DateHeader.class),
                        env.callMethod(
                                dateTime,
                                "format",
                                Swift_Mime_Headers_DateHeader.class,
                                "D, d M Y H:i:s O")));
        if (ZVal.isTrue(ZVal.checkInstanceType(dateTime, DateTime.class, "DateTime"))) {
            immutable =
                    new DateTimeImmutable(
                            env,
                            "@"
                                    + toStringR(
                                            env.callMethod(
                                                    dateTime,
                                                    "getTimestamp",
                                                    Swift_Mime_Headers_DateHeader.class),
                                            env));
            dateTime =
                    env.callMethod(
                            immutable,
                            "setTimezone",
                            Swift_Mime_Headers_DateHeader.class,
                            env.callMethod(
                                    dateTime, "getTimezone", Swift_Mime_Headers_DateHeader.class));
        }

        this.dateTime = dateTime;
        return null;
    }

    @ConvertedMethod
    public Object getFieldBody(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(
                env.callMethod(this, "getCachedValue", Swift_Mime_Headers_DateHeader.class))) {
            if (ZVal.isset(this.dateTime)) {
                env.callMethod(
                        this,
                        "setCachedValue",
                        Swift_Mime_Headers_DateHeader.class,
                        env.callMethod(
                                this.dateTime,
                                "format",
                                Swift_Mime_Headers_DateHeader.class,
                                "D, d M Y H:i:s O"));
            }
        }

        return ZVal.assign(
                env.callMethod(this, "getCachedValue", Swift_Mime_Headers_DateHeader.class));
    }

    public static final Object CONST_class = "Swift_Mime_Headers_DateHeader";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends Swift_Mime_Headers_AbstractHeader.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Mime_Headers_DateHeader")
                    .setLookup(
                            Swift_Mime_Headers_DateHeader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "cachedValue",
                            "charset",
                            "dateTime",
                            "encoder",
                            "lang",
                            "lineLength",
                            "name")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/Headers/DateHeader.php")
                    .addInterface("Swift_Mime_Header")
                    .addExtendsClass("Swift_Mime_Headers_AbstractHeader")
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
