package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Swift_Mime_EmbeddedFile;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.classes.Swift_ByteStream_FileByteStream;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Swift_DependencyContainer;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/EmbeddedFile.php

*/

public class Swift_EmbeddedFile extends Swift_Mime_EmbeddedFile {

    public Swift_EmbeddedFile(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_EmbeddedFile.class) {
            this.__construct(env, args);
        }
    }

    public Swift_EmbeddedFile(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "data",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "filename",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "contentType",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, true);
        if (null == data) {
            data = ZVal.getNull();
        }
        Object filename = assignParameter(args, 1, true);
        if (null == filename) {
            filename = ZVal.getNull();
        }
        Object contentType = assignParameter(args, 2, true);
        if (null == contentType) {
            contentType = ZVal.getNull();
        }
        function_call_user_func_array
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                .call(
                        ZVal.newArray(
                                new ZPair(0, this),
                                new ZPair(1, "Swift_Mime_EmbeddedFile::__construct")),
                        env.callMethod(
                                Swift_DependencyContainer.runtimeStaticObject.getInstance(env),
                                "createDependenciesFor",
                                Swift_EmbeddedFile.class,
                                "mime.embeddedfile"));
        env.callMethod(this, "setBody", Swift_EmbeddedFile.class, data);
        env.callMethod(this, "setFilename", Swift_EmbeddedFile.class, filename);
        if (ZVal.isTrue(contentType)) {
            env.callMethod(this, "setContentType", Swift_EmbeddedFile.class, contentType);
        }

        return null;
    }

    public static final Object CONST_class = "Swift_EmbeddedFile";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends Swift_Mime_EmbeddedFile.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "path")
        public Object fromPath(RuntimeEnv env, Object... args) {
            Object path = assignParameter(args, 0, false);
            return ZVal.assign(
                    env.callMethod(
                            new com.project
                                    .convertedCode
                                    .globalNamespace
                                    .classes
                                    .Swift_EmbeddedFile(env),
                            "setFile",
                            Swift_EmbeddedFile.class,
                            new Swift_ByteStream_FileByteStream(env, path)));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_EmbeddedFile")
                    .setLookup(
                            Swift_EmbeddedFile.class,
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
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/EmbeddedFile.php")
                    .addInterface("Swift_Mime_CharsetObserver")
                    .addInterface("Swift_Mime_EncodingObserver")
                    .addExtendsClass("Swift_Mime_EmbeddedFile")
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
