package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.classes.Swift_IoException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fread;
import com.project.convertedCode.globalNamespace.classes.Swift_ByteStream_AbstractFilterableInputStream;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Swift_FileStream;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fwrite;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/ByteStream/FileByteStream.php

*/

public class Swift_ByteStream_FileByteStream extends Swift_ByteStream_AbstractFilterableInputStream
        implements Swift_FileStream {

    public Object offset = 0;

    public Object path = null;

    public Object mode = null;

    public Object reader = null;

    public Object writer = null;

    public Object seekable = ZVal.getNull();

    public Swift_ByteStream_FileByteStream(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_ByteStream_FileByteStream.class) {
            this.__construct(env, args);
        }
    }

    public Swift_ByteStream_FileByteStream(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(
        index = 1,
        name = "writable",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object writable = assignParameter(args, 1, true);
        if (null == writable) {
            writable = false;
        }
        if (ZVal.isEmpty(path)) {
            throw ZVal.getException(env, new Swift_IoException(env, "The path cannot be empty"));
        }

        this.path = path;
        this.mode = ZVal.isTrue(writable) ? "w+b" : "rb";
        return null;
    }

    @ConvertedMethod
    public Object getPath(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.path);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "length")
    public Object read(RuntimeEnv env, Object... args) {
        Object length = assignParameter(args, 0, false);
        Object bytes = null;
        Object fp = null;
        fp = this.getReadHandle(env);
        if (!NamespaceGlobal.feof.env(env).call(fp).getBool()) {
            bytes = function_fread.f.env(env).call(fp, length).value();
            this.offset = NamespaceGlobal.ftell.env(env).call(fp).value();
            if (ZVal.toBool(ZVal.strictEqualityCheck("", "===", bytes))
                    && ZVal.toBool(NamespaceGlobal.feof.env(env).call(fp).value())) {
                this.resetReadHandle(env);
                return ZVal.assign(false);
            }

            return ZVal.assign(bytes);
        }

        this.resetReadHandle(env);
        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "byteOffset")
    public Object setReadPointer(RuntimeEnv env, Object... args) {
        Object byteOffset = assignParameter(args, 0, false);
        if (ZVal.isset(this.reader)) {
            this.seekReadStreamToPosition(env, byteOffset);
        }

        this.offset = byteOffset;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bytes")
    protected Object doCommit(RuntimeEnv env, Object... args) {
        Object bytes = assignParameter(args, 0, false);
        function_fwrite.f.env(env).call(this.getWriteHandle(env), bytes);
        this.resetReadHandle(env);
        return null;
    }

    @ConvertedMethod
    protected Object flush(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    private Object getReadHandle(RuntimeEnv env, Object... args) {
        Object pointer = null;
        if (!ZVal.isset(this.reader)) {
            pointer = function_fopen.f.env(env).call(this.path, "rb").value();
            if (!ZVal.isTrue(pointer)) {
                throw ZVal.getException(
                        env,
                        new Swift_IoException(
                                env,
                                "Unable to open file for reading ["
                                        + toStringR(this.path, env)
                                        + "]"));
            }

            this.reader = pointer;
            if (ZVal.notEqualityCheck(0, this.offset)) {
                this.getReadStreamSeekableStatus(env);
                this.seekReadStreamToPosition(env, this.offset);
            }
        }

        return ZVal.assign(this.reader);
    }

    @ConvertedMethod
    private Object getWriteHandle(RuntimeEnv env, Object... args) {
        if (!ZVal.isset(this.writer)) {
            if (!ZVal.isTrue(
                    this.writer = function_fopen.f.env(env).call(this.path, this.mode).value())) {
                throw ZVal.getException(
                        env,
                        new Swift_IoException(
                                env,
                                "Unable to open file for writing ["
                                        + toStringR(this.path, env)
                                        + "]"));
            }
        }

        return ZVal.assign(this.writer);
    }

    @ConvertedMethod
    private Object resetReadHandle(RuntimeEnv env, Object... args) {
        if (ZVal.isset(this.reader)) {
            function_fclose.f.env(env).call(this.reader);
            this.reader = ZVal.getNull();
        }

        return null;
    }

    @ConvertedMethod
    private Object getReadStreamSeekableStatus(RuntimeEnv env, Object... args) {
        ReferenceContainer metas = new BasicReferenceContainer(null);
        metas.setObject(NamespaceGlobal.stream_get_meta_data.env(env).call(this.reader).value());
        this.seekable = metas.arrayGet(env, "seekable");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    private Object seekReadStreamToPosition(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        Object currentPos = null;
        Object toDiscard = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.seekable)) {
            this.getReadStreamSeekableStatus(env);
        }

        if (ZVal.strictEqualityCheck(false, "===", this.seekable)) {
            currentPos = NamespaceGlobal.ftell.env(env).call(this.reader).value();
            if (ZVal.isLessThan(currentPos, '<', offset)) {
                toDiscard = ZVal.subtract(offset, currentPos);
                function_fread.f.env(env).call(this.reader, toDiscard);
                return null;
            }

            this.copyReadStream(env);
        }

        NamespaceGlobal.fseek.env(env).call(this.reader, offset, 0);
        return null;
    }

    @ConvertedMethod
    private Object copyReadStream(RuntimeEnv env, Object... args) {
        Object source = null;
        Object currentPos = null;
        Object tmpFile = null;
        if (ZVal.isTrue(
                tmpFile =
                        function_fopen
                                .f
                                .env(env)
                                .call("php://temp/maxmemory:4096", "w+b")
                                .value())) {

        } else if (ZVal.toBool(
                        ZVal.toBool(
                                        function_function_exists
                                                .f
                                                .env(env)
                                                .call("sys_get_temp_dir")
                                                .value())
                                && ZVal.toBool(
                                        NamespaceGlobal.is_writable
                                                .env(env)
                                                .call(
                                                        NamespaceGlobal.sys_get_temp_dir
                                                                .env(env)
                                                                .call()
                                                                .value())
                                                .value()))
                && ZVal.toBool(tmpFile = NamespaceGlobal.tmpfile.env(env).call().value())) {

        } else {
            throw ZVal.getException(
                    env,
                    new Swift_IoException(
                            env,
                            "Unable to copy the file to make it seekable, sys_temp_dir is not writable, php://memory not available"));
        }

        currentPos = NamespaceGlobal.ftell.env(env).call(this.reader).value();
        function_fclose.f.env(env).call(this.reader);
        source = function_fopen.f.env(env).call(this.path, "rb").value();
        if (!ZVal.isTrue(source)) {
            throw ZVal.getException(
                    env,
                    new Swift_IoException(
                            env,
                            "Unable to open file for copying [" + toStringR(this.path, env) + "]"));
        }

        NamespaceGlobal.fseek.env(env).call(tmpFile, 0, 0);
        while (!NamespaceGlobal.feof.env(env).call(source).getBool()) {
            function_fwrite
                    .f
                    .env(env)
                    .call(tmpFile, function_fread.f.env(env).call(source, 4096).value());
        }

        NamespaceGlobal.fseek.env(env).call(tmpFile, currentPos, 0);
        function_fclose.f.env(env).call(source);
        this.reader = tmpFile;
        return null;
    }

    public static final Object CONST_class = "Swift_ByteStream_FileByteStream";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends Swift_ByteStream_AbstractFilterableInputStream.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_ByteStream_FileByteStream")
                    .setLookup(
                            Swift_ByteStream_FileByteStream.class,
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
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/ByteStream/FileByteStream.php")
                    .addInterface("Swift_FileStream")
                    .addInterface("Swift_OutputByteStream")
                    .addInterface("Swift_InputByteStream")
                    .addInterface("Swift_Filterable")
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
