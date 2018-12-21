package com.project.convertedCode.globalNamespace.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_Attachment;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/EmbeddedFile.php

*/

public class Swift_Mime_EmbeddedFile extends Swift_Mime_Attachment {

    public Swift_Mime_EmbeddedFile(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Mime_EmbeddedFile.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Mime_EmbeddedFile(NoConstructor n) {
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
        super.__construct(env, headers, encoder, cache, idGenerator, mimeTypes);
        env.callMethod(this, "setDisposition", Swift_Mime_EmbeddedFile.class, "inline");
        env.callMethod(
                this,
                "setId",
                Swift_Mime_EmbeddedFile.class,
                env.callMethod(this, "getId", Swift_Mime_EmbeddedFile.class));
        return null;
    }

    @ConvertedMethod
    public Object getNestingLevel(RuntimeEnv env, Object... args) {
        return ZVal.assign(CONST_LEVEL_RELATED);
    }

    public static final Object CONST_class = "Swift_Mime_EmbeddedFile";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends Swift_Mime_Attachment.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Mime_EmbeddedFile")
                    .setLookup(
                            Swift_Mime_EmbeddedFile.class,
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
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/EmbeddedFile.php")
                    .addInterface("Swift_Mime_CharsetObserver")
                    .addInterface("Swift_Mime_EncodingObserver")
                    .addExtendsClass("Swift_Mime_Attachment")
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
