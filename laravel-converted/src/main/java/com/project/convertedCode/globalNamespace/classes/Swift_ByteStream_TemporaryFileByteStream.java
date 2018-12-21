package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.project.convertedCode.globalNamespace.classes.Swift_IoException;
import com.project.convertedCode.globalNamespace.classes.Swift_ByteStream_FileByteStream;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/ByteStream/TemporaryFileByteStream.php

*/

public class Swift_ByteStream_TemporaryFileByteStream extends Swift_ByteStream_FileByteStream {

    public Swift_ByteStream_TemporaryFileByteStream(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_ByteStream_TemporaryFileByteStream.class) {
            this.__construct(env, args);
        }
    }

    public Swift_ByteStream_TemporaryFileByteStream(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        Object filePath = null;
        filePath =
                NamespaceGlobal.tempnam
                        .env(env)
                        .call(
                                NamespaceGlobal.sys_get_temp_dir.env(env).call().value(),
                                "FileByteStream")
                        .value();
        if (ZVal.strictEqualityCheck(false, "===", filePath)) {
            throw ZVal.getException(
                    env, new Swift_IoException(env, "Failed to retrieve temporary file name."));
        }

        super.__construct(env, filePath, true);
        return null;
    }

    @ConvertedMethod
    public Object getContent(RuntimeEnv env, Object... args) {
        Object content = null;
        if (ZVal.strictEqualityCheck(
                false,
                "===",
                content =
                        function_file_get_contents
                                .f
                                .env(env)
                                .call(
                                        env.callMethod(
                                                this,
                                                "getPath",
                                                Swift_ByteStream_TemporaryFileByteStream.class))
                                .value())) {
            throw ZVal.getException(
                    env, new Swift_IoException(env, "Failed to get temporary file content."));
        }

        return ZVal.assign(content);
    }

    @ConvertedMethod
    public Object __destruct(RuntimeEnv env, Object... args) {
        if (function_file_exists
                .f
                .env(env)
                .call(
                        env.callMethod(
                                this, "getPath", Swift_ByteStream_TemporaryFileByteStream.class))
                .getBool()) {
            NamespaceGlobal.unlink
                    .env(env)
                    .call(
                            env.callMethod(
                                    this,
                                    "getPath",
                                    Swift_ByteStream_TemporaryFileByteStream.class))
                    .value();
        }

        return null;
    }

    public static final Object CONST_class = "Swift_ByteStream_TemporaryFileByteStream";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends Swift_ByteStream_FileByteStream.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_ByteStream_TemporaryFileByteStream")
                    .setLookup(
                            Swift_ByteStream_TemporaryFileByteStream.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "filters",
                            "mirrors",
                            "mode",
                            "offset",
                            "path",
                            "reader",
                            "seekable",
                            "sequence",
                            "writeBuffer",
                            "writer")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/ByteStream/TemporaryFileByteStream.php")
                    .addInterface("Swift_FileStream")
                    .addInterface("Swift_OutputByteStream")
                    .addInterface("Swift_InputByteStream")
                    .addInterface("Swift_Filterable")
                    .addExtendsClass("Swift_ByteStream_FileByteStream")
                    .addExtendsClass("Swift_ByteStream_AbstractFilterableInputStream")
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
