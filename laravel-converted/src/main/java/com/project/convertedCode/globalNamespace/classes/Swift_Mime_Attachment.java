package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_SimpleMimeEntity;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/Attachment.php

*/

public class Swift_Mime_Attachment extends Swift_Mime_SimpleMimeEntity {

    public Object mimeTypes = ZVal.newArray();

    public Swift_Mime_Attachment(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Mime_Attachment.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Mime_Attachment(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "headers", typeHint = "Swift_Mime_SimpleHeaderSet")
    @ConvertedParameter(index = 1, name = "encoder", typeHint = "Swift_Mime_ContentEncoder")
    @ConvertedParameter(index = 2, name = "cache", typeHint = "Swift_KeyCache")
    @ConvertedParameter(index = 3, name = "idGenerator", typeHint = "Swift_IdGenerator")
    @ConvertedParameter(
        index = 4,
        name = "mimeTypes",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object headers = assignParameter(args, 0, false);
        Object encoder = assignParameter(args, 1, false);
        Object cache = assignParameter(args, 2, false);
        Object idGenerator = assignParameter(args, 3, false);
        Object mimeTypes = assignParameter(args, 4, true);
        if (null == mimeTypes) {
            mimeTypes = ZVal.newArray();
        }
        super.__construct(env, headers, encoder, cache, idGenerator);
        this.setDisposition(env, "attachment");
        env.callMethod(
                this, "setContentType", Swift_Mime_Attachment.class, "application/octet-stream");
        this.mimeTypes = mimeTypes;
        return null;
    }

    @ConvertedMethod
    public Object getNestingLevel(RuntimeEnv env, Object... args) {
        return ZVal.assign(CONST_LEVEL_MIXED);
    }

    @ConvertedMethod
    public Object getDisposition(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this,
                        "getHeaderFieldModel",
                        Swift_Mime_Attachment.class,
                        "Content-Disposition"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "disposition")
    public Object setDisposition(RuntimeEnv env, Object... args) {
        Object disposition = assignParameter(args, 0, false);
        if (!ZVal.isTrue(
                env.callMethod(
                        this,
                        "setHeaderFieldModel",
                        Swift_Mime_Attachment.class,
                        "Content-Disposition",
                        disposition))) {
            env.callMethod(
                    env.callMethod(this, "getHeaders", Swift_Mime_Attachment.class),
                    "addParameterizedHeader",
                    Swift_Mime_Attachment.class,
                    "Content-Disposition",
                    disposition);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getFilename(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this,
                        "getHeaderParameter",
                        Swift_Mime_Attachment.class,
                        "Content-Disposition",
                        "filename"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filename")
    public Object setFilename(RuntimeEnv env, Object... args) {
        Object filename = assignParameter(args, 0, false);
        env.callMethod(
                this,
                "setHeaderParameter",
                Swift_Mime_Attachment.class,
                "Content-Disposition",
                "filename",
                filename);
        env.callMethod(
                this,
                "setHeaderParameter",
                Swift_Mime_Attachment.class,
                "Content-Type",
                "name",
                filename);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getSize(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this,
                        "getHeaderParameter",
                        Swift_Mime_Attachment.class,
                        "Content-Disposition",
                        "size"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "size")
    public Object setSize(RuntimeEnv env, Object... args) {
        Object size = assignParameter(args, 0, false);
        env.callMethod(
                this,
                "setHeaderParameter",
                Swift_Mime_Attachment.class,
                "Content-Disposition",
                "size",
                size);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file", typeHint = "Swift_FileStream")
    @ConvertedParameter(
        index = 1,
        name = "contentType",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setFile(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        Object contentType = assignParameter(args, 1, true);
        if (null == contentType) {
            contentType = ZVal.getNull();
        }
        Object extension = null;
        this.setFilename(
                env,
                NamespaceGlobal.basename
                        .env(env)
                        .call(env.callMethod(file, "getPath", Swift_Mime_Attachment.class))
                        .value());
        env.callMethod(this, "setBody", Swift_Mime_Attachment.class, file, contentType);
        if (!ZVal.isset(contentType)) {
            extension =
                    NamespaceGlobal.strtolower
                            .env(env)
                            .call(
                                    function_substr
                                            .f
                                            .env(env)
                                            .call(
                                                    env.callMethod(
                                                            file,
                                                            "getPath",
                                                            Swift_Mime_Attachment.class),
                                                    ZVal.add(
                                                            NamespaceGlobal.strrpos
                                                                    .env(env)
                                                                    .call(
                                                                            env.callMethod(
                                                                                    file,
                                                                                    "getPath",
                                                                                    Swift_Mime_Attachment
                                                                                            .class),
                                                                            ".")
                                                                    .value(),
                                                            1))
                                            .value())
                            .value();
            if (function_array_key_exists.f.env(env).call(extension, this.mimeTypes).getBool()) {
                env.callMethod(
                        this,
                        "setContentType",
                        Swift_Mime_Attachment.class,
                        new ReferenceClassProperty(this, "mimeTypes", env)
                                .arrayGet(env, extension));
            }
        }

        return ZVal.assign(this);
    }

    public static final Object CONST_class = "Swift_Mime_Attachment";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends Swift_Mime_SimpleMimeEntity.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Mime_Attachment")
                    .setLookup(
                            Swift_Mime_Attachment.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "alternativePartOrder",
                            "body",
                            "boundary",
                            "cache",
                            "cacheKey",
                            "children",
                            "compositeRanges",
                            "compoundLevelFilters",
                            "encoder",
                            "headers",
                            "id",
                            "idGenerator",
                            "immediateChildren",
                            "maxLineLength",
                            "mimeTypes",
                            "nestingLevel",
                            "userContentType")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/Attachment.php")
                    .addInterface("Swift_Mime_CharsetObserver")
                    .addInterface("Swift_Mime_EncodingObserver")
                    .addExtendsClass("Swift_Mime_SimpleMimeEntity")
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
