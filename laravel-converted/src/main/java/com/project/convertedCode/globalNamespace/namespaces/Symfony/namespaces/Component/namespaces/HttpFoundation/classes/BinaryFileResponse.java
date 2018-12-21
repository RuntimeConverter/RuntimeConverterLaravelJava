package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.spl.files.SplFileInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.Response;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.namespaces.Exception.classes.FileException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.HeaderUtils;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.classes.File;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/BinaryFileResponse.php

*/

public class BinaryFileResponse extends Response {

    public Object file = null;

    public Object offset = null;

    public Object maxlen = null;

    public Object deleteFileAfterSend = false;

    public BinaryFileResponse(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == BinaryFileResponse.class) {
            this.__construct(env, args);
        }
    }

    public BinaryFileResponse(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    @ConvertedParameter(
        index = 1,
        name = "status",
        typeHint = "int",
        defaultValue = "200",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 2,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 3,
        name = "public",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "contentDisposition",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "autoEtag",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "autoLastModified",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        Object status = assignParameter(args, 1, true);
        if (null == status) {
            status = 200;
        }
        Object headers = assignParameter(args, 2, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        Object _pPublic = assignParameter(args, 3, true);
        if (null == _pPublic) {
            _pPublic = true;
        }
        Object contentDisposition = assignParameter(args, 4, true);
        if (null == contentDisposition) {
            contentDisposition = ZVal.getNull();
        }
        Object autoEtag = assignParameter(args, 5, true);
        if (null == autoEtag) {
            autoEtag = false;
        }
        Object autoLastModified = assignParameter(args, 6, true);
        if (null == autoLastModified) {
            autoLastModified = true;
        }
        super.__construct(env, ZVal.getNull(), status, headers);
        this.setFile(env, file, contentDisposition, autoEtag, autoLastModified);
        if (ZVal.isTrue(_pPublic)) {
            env.callMethod(this, "setPublic", BinaryFileResponse.class);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    @ConvertedParameter(
        index = 1,
        name = "contentDisposition",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "autoEtag",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "autoLastModified",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object setFile(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        Object contentDisposition = assignParameter(args, 1, true);
        if (null == contentDisposition) {
            contentDisposition = ZVal.getNull();
        }
        Object autoEtag = assignParameter(args, 2, true);
        if (null == autoEtag) {
            autoEtag = false;
        }
        Object autoLastModified = assignParameter(args, 3, true);
        if (null == autoLastModified) {
            autoLastModified = true;
        }
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        file, File.class, "Symfony\\Component\\HttpFoundation\\File\\File"))) {
            if (ZVal.isTrue(ZVal.checkInstanceType(file, SplFileInfo.class, "SplFileInfo"))) {
                file = new File(env, env.callMethod(file, "getPathname", BinaryFileResponse.class));

            } else {
                file = new File(env, toStringR(file, env));
            }
        }

        if (!ZVal.isTrue(env.callMethod(file, "isReadable", BinaryFileResponse.class))) {
            throw ZVal.getException(env, new FileException(env, "File must be readable."));
        }

        this.file = file;
        if (ZVal.isTrue(autoEtag)) {
            this.setAutoEtag(env);
        }

        if (ZVal.isTrue(autoLastModified)) {
            this.setAutoLastModified(env);
        }

        if (ZVal.isTrue(contentDisposition)) {
            this.setContentDisposition(env, contentDisposition);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getFile(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.file);
    }

    @ConvertedMethod
    public Object setAutoLastModified(RuntimeEnv env, Object... args) {
        env.callMethod(
                this,
                "setLastModified",
                BinaryFileResponse.class,
                DateTime.runtimeStaticObject.createFromFormat(
                        env, "U", env.callMethod(this.file, "getMTime", BinaryFileResponse.class)));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object setAutoEtag(RuntimeEnv env, Object... args) {
        env.callMethod(
                this,
                "setEtag",
                BinaryFileResponse.class,
                NamespaceGlobal.base64_encode
                        .env(env)
                        .call(
                                NamespaceGlobal.hash_file
                                        .env(env)
                                        .call(
                                                "sha256",
                                                env.callMethod(
                                                        this.file,
                                                        "getPathname",
                                                        BinaryFileResponse.class),
                                                true)
                                        .value())
                        .value());
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "disposition")
    @ConvertedParameter(index = 1, name = "filename")
    @ConvertedParameter(index = 2, name = "filenameFallback")
    public Object setContentDisposition(RuntimeEnv env, Object... args) {
        Object disposition = assignParameter(args, 0, false);
        Object filename = assignParameter(args, 1, true);
        if (null == filename) {
            filename = "";
        }
        Object filenameFallback = assignParameter(args, 2, true);
        if (null == filenameFallback) {
            filenameFallback = "";
        }
        Object filenameLength = null;
        Object dispositionHeader = null;
        Object _pChar = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object ternaryExpressionTemp = null;
        Object encoding = null;
        if (ZVal.strictEqualityCheck("", "===", filename)) {
            filename = env.callMethod(this.file, "getFilename", BinaryFileResponse.class);
        }

        if (ZVal.toBool(ZVal.strictEqualityCheck("", "===", filenameFallback))
                && ZVal.toBool(
                        ZVal.toBool(
                                        !function_preg_match
                                                .f
                                                .env(env)
                                                .call("/^[\\x20-\\x7e]*$/", filename)
                                                .getBool())
                                || ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                false,
                                                "!==",
                                                function_strpos
                                                        .f
                                                        .env(env)
                                                        .call(filename, "%")
                                                        .value())))) {
            encoding =
                    ZVal.assign(
                            ZVal.isTrue(
                                            ternaryExpressionTemp =
                                                    NamespaceGlobal.mb_detect_encoding
                                                            .env(env)
                                                            .call(filename, ZVal.getNull(), true)
                                                            .value())
                                    ? ternaryExpressionTemp
                                    : "8bit");
            for (i.setObject(0),
                            filenameLength =
                                    NamespaceGlobal.mb_strlen
                                            .env(env)
                                            .call(filename, encoding)
                                            .value();
                    ZVal.isLessThan(i.getObject(), '<', filenameLength);
                    i.setObject(ZVal.increment(i.getObject()))) {
                _pChar =
                        NamespaceGlobal.mb_substr
                                .env(env)
                                .call(filename, i.getObject(), 1, encoding)
                                .value();
                if (ZVal.toBool(
                                ZVal.toBool(ZVal.strictEqualityCheck("%", "===", _pChar))
                                        || ZVal.toBool(
                                                ZVal.isLessThan(
                                                        NamespaceGlobal.ord
                                                                .env(env)
                                                                .call(_pChar)
                                                                .value(),
                                                        '<',
                                                        32)))
                        || ZVal.toBool(
                                ZVal.isGreaterThan(
                                        NamespaceGlobal.ord.env(env).call(_pChar).value(),
                                        '>',
                                        126))) {
                    filenameFallback = toStringR(filenameFallback, env) + "_";

                } else {
                    filenameFallback = toStringR(filenameFallback, env) + toStringR(_pChar, env);
                }
            }
        }

        dispositionHeader =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("headers").value(),
                        "makeDisposition",
                        BinaryFileResponse.class,
                        disposition,
                        filename,
                        filenameFallback);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("headers").value(),
                "set",
                BinaryFileResponse.class,
                "Content-Disposition",
                dispositionHeader);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    public Object prepare(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object request = assignParameter(args, 0, false);
        Object start = null;
        Object range = null;
        Object ternaryExpressionTemp = null;
        Object type = null;
        Object pathPrefix = null;
        Object path = null;
        Object mappings = null;
        Object fileSize = null;
        Object parts = null;
        Object location = null;
        Object end = null;
        Object runtimeTempArrayResult188 = null;
        if (!ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("headers").value(),
                        "has",
                        BinaryFileResponse.class,
                        "Content-Type"))) {
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("headers").value(),
                    "set",
                    BinaryFileResponse.class,
                    "Content-Type",
                    ZVal.isTrue(
                                    ternaryExpressionTemp =
                                            env.callMethod(
                                                    this.file,
                                                    "getMimeType",
                                                    BinaryFileResponse.class))
                            ? ternaryExpressionTemp
                            : "application/octet-stream");
        }

        if (ZVal.strictNotEqualityCheck(
                "HTTP/1.0",
                "!==",
                env.callMethod(
                        toObjectR(request).accessProp(this, env).name("server").value(),
                        "get",
                        BinaryFileResponse.class,
                        "SERVER_PROTOCOL"))) {
            env.callMethod(this, "setProtocolVersion", BinaryFileResponse.class, "1.1");
        }

        env.callMethod(this, "ensureIEOverSSLCompatibility", BinaryFileResponse.class, request);
        this.offset = 0;
        this.maxlen = -1;
        if (ZVal.strictEqualityCheck(
                false,
                "===",
                fileSize = env.callMethod(this.file, "getSize", BinaryFileResponse.class))) {
            return ZVal.assign(this);
        }

        env.callMethod(
                toObjectR(this).accessProp(this, env).name("headers").value(),
                "set",
                BinaryFileResponse.class,
                "Content-Length",
                fileSize);
        if (!ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("headers").value(),
                        "has",
                        BinaryFileResponse.class,
                        "Accept-Ranges"))) {
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("headers").value(),
                    "set",
                    BinaryFileResponse.class,
                    "Accept-Ranges",
                    ZVal.isTrue(
                                    env.callMethod(
                                            request,
                                            "isMethodSafe",
                                            BinaryFileResponse.class,
                                            false))
                            ? "bytes"
                            : "none");
        }

        if (ZVal.toBool(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .HttpFoundation
                                                .classes
                                                .BinaryFileResponse
                                                .RequestStaticProperties
                                                .class)
                                .trustXSendfileTypeHeader)
                && ZVal.toBool(
                        env.callMethod(
                                toObjectR(request).accessProp(this, env).name("headers").value(),
                                "has",
                                BinaryFileResponse.class,
                                "X-Sendfile-Type"))) {
            type =
                    env.callMethod(
                            toObjectR(request).accessProp(this, env).name("headers").value(),
                            "get",
                            BinaryFileResponse.class,
                            "X-Sendfile-Type");
            path = env.callMethod(this.file, "getRealPath", BinaryFileResponse.class);
            if (ZVal.strictEqualityCheck(false, "===", path)) {
                path = env.callMethod(this.file, "getPathname", BinaryFileResponse.class);
            }

            if (ZVal.strictEqualityCheck(
                    "x-accel-redirect",
                    "===",
                    NamespaceGlobal.strtolower.env(env).call(type).value())) {
                parts =
                        HeaderUtils.runtimeStaticObject.split(
                                env,
                                env.callMethod(
                                        toObjectR(request)
                                                .accessProp(this, env)
                                                .name("headers")
                                                .value(),
                                        "get",
                                        BinaryFileResponse.class,
                                        "X-Accel-Mapping",
                                        ""),
                                ",=");
                mappings = HeaderUtils.runtimeStaticObject.combine(env, parts);
                runtimeConverterBreakCount = 0;
                for (ZPair zpairResult1844 : ZVal.getIterable(mappings, env, false)) {
                    pathPrefix = ZVal.assign(zpairResult1844.getKey());
                    location = ZVal.assign(zpairResult1844.getValue());
                    if (ZVal.strictEqualityCheck(
                            function_substr
                                    .f
                                    .env(env)
                                    .call(
                                            path,
                                            0,
                                            function_strlen.f.env(env).call(pathPrefix).value())
                                    .value(),
                            "===",
                            pathPrefix)) {
                        path =
                                toStringR(location, env)
                                        + toStringR(
                                                function_substr
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                path,
                                                                function_strlen
                                                                        .f
                                                                        .env(env)
                                                                        .call(pathPrefix)
                                                                        .value())
                                                        .value(),
                                                env);
                        break;
                    }
                }
            }

            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("headers").value(),
                    "set",
                    BinaryFileResponse.class,
                    type,
                    path);
            this.maxlen = 0;

        } else if (ZVal.isTrue(
                env.callMethod(
                        toObjectR(request).accessProp(this, env).name("headers").value(),
                        "has",
                        BinaryFileResponse.class,
                        "Range"))) {
            if (ZVal.toBool(
                            !ZVal.isTrue(
                                    env.callMethod(
                                            toObjectR(request)
                                                    .accessProp(this, env)
                                                    .name("headers")
                                                    .value(),
                                            "has",
                                            BinaryFileResponse.class,
                                            "If-Range")))
                    || ZVal.toBool(
                            this.hasValidIfRangeHeader(
                                    env,
                                    env.callMethod(
                                            toObjectR(request)
                                                    .accessProp(this, env)
                                                    .name("headers")
                                                    .value(),
                                            "get",
                                            BinaryFileResponse.class,
                                            "If-Range")))) {
                range =
                        env.callMethod(
                                toObjectR(request).accessProp(this, env).name("headers").value(),
                                "get",
                                BinaryFileResponse.class,
                                "Range");
                ZVal.list(
                        runtimeTempArrayResult188 =
                                ZVal.add(
                                        function_explode
                                                .f
                                                .env(env)
                                                .call(
                                                        "-",
                                                        function_substr
                                                                .f
                                                                .env(env)
                                                                .call(range, 6)
                                                                .value(),
                                                        2)
                                                .value(),
                                        ZVal.arrayFromList(0)),
                        (start = listGet(runtimeTempArrayResult188, 0, env)),
                        (end = listGet(runtimeTempArrayResult188, 1, env)));
                end =
                        ZVal.assign(
                                ZVal.strictEqualityCheck("", "===", end)
                                        ? ZVal.subtract(fileSize, 1)
                                        : ZVal.toLong(end));
                if (ZVal.strictEqualityCheck("", "===", start)) {
                    start = ZVal.subtract(fileSize, end);
                    end = ZVal.subtract(fileSize, 1);

                } else {
                    start = ZVal.assign(ZVal.toLong(start));
                }

                if (ZVal.isLessThanOrEqualTo(start, "<=", end)) {
                    if (ZVal.toBool(ZVal.isLessThan(start, '<', 0))
                            || ZVal.toBool(
                                    ZVal.isGreaterThan(end, '>', ZVal.subtract(fileSize, 1)))) {
                        env.callMethod(this, "setStatusCode", BinaryFileResponse.class, 416);
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("headers").value(),
                                "set",
                                BinaryFileResponse.class,
                                "Content-Range",
                                function_sprintf.f.env(env).call("bytes */%s", fileSize).value());

                    } else if (ZVal.toBool(ZVal.strictNotEqualityCheck(0, "!==", start))
                            || ZVal.toBool(
                                    ZVal.strictNotEqualityCheck(
                                            end, "!==", ZVal.subtract(fileSize, 1)))) {
                        this.maxlen =
                                ZVal.isLessThan(end, '<', fileSize)
                                        ? ZVal.add(ZVal.subtract(end, start), 1)
                                        : -1;
                        this.offset = start;
                        env.callMethod(this, "setStatusCode", BinaryFileResponse.class, 206);
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("headers").value(),
                                "set",
                                BinaryFileResponse.class,
                                "Content-Range",
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("bytes %s-%s/%s", start, end, fileSize)
                                        .value());
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("headers").value(),
                                "set",
                                BinaryFileResponse.class,
                                "Content-Length",
                                ZVal.add(ZVal.subtract(end, start), 1));
                    }
                }
            }
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "header")
    private Object hasValidIfRangeHeader(RuntimeEnv env, Object... args) {
        Object header = assignParameter(args, 0, false);
        Object lastModified = null;
        if (ZVal.strictEqualityCheck(
                env.callMethod(this, "getEtag", BinaryFileResponse.class), "===", header)) {
            return ZVal.assign(true);
        }

        if (ZVal.strictEqualityCheck(
                ZVal.getNull(),
                "===",
                lastModified = env.callMethod(this, "getLastModified", BinaryFileResponse.class))) {
            return ZVal.assign(false);
        }

        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        toStringR(
                                        env.callMethod(
                                                lastModified,
                                                "format",
                                                BinaryFileResponse.class,
                                                "D, d M Y H:i:s"),
                                        env)
                                + " GMT",
                        "===",
                        header));
    }

    @ConvertedMethod
    public Object sendContent(RuntimeEnv env, Object... args) {
        Object file = null;
        Object out = null;
        if (!ZVal.isTrue(env.callMethod(this, "isSuccessful", BinaryFileResponse.class))) {
            return ZVal.assign(super.sendContent(env));
        }

        if (ZVal.strictEqualityCheck(0, "===", this.maxlen)) {
            return ZVal.assign(this);
        }

        out = function_fopen.f.env(env).call("php://output", "wb").value();
        file =
                function_fopen
                        .f
                        .env(env)
                        .call(
                                env.callMethod(this.file, "getPathname", BinaryFileResponse.class),
                                "rb")
                        .value();
        NamespaceGlobal.stream_copy_to_stream.env(env).call(file, out, this.maxlen, this.offset);
        function_fclose.f.env(env).call(out);
        function_fclose.f.env(env).call(file);
        if (ZVal.isTrue(this.deleteFileAfterSend)) {
            NamespaceGlobal.unlink
                    .env(env)
                    .call(env.callMethod(this.file, "getPathname", BinaryFileResponse.class));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content")
    public Object setContent(RuntimeEnv env, Object... args) {
        Object content = assignParameter(args, 0, false);
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", content)) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env, "The content cannot be set on a BinaryFileResponse instance."));
        }

        return null;
    }

    @ConvertedMethod
    public Object getContent(RuntimeEnv env, Object... args) {
        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "shouldDelete",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object deleteFileAfterSend(RuntimeEnv env, Object... args) {
        Object shouldDelete = assignParameter(args, 0, true);
        if (null == shouldDelete) {
            shouldDelete = true;
        }
        this.deleteFileAfterSend = shouldDelete;
        return ZVal.assign(this);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\BinaryFileResponse";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Response.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "file",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 1,
            name = "status",
            defaultValue = "200",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 2,
            name = "headers",
            defaultValue = "",
            defaultValueType = "array"
        )
        @ConvertedParameter(
            index = 3,
            name = "public",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 4,
            name = "contentDisposition",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 5,
            name = "autoEtag",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 6,
            name = "autoLastModified",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        public Object create(RuntimeEnv env, Object... args) {
            Object file = assignParameter(args, 0, true);
            if (null == file) {
                file = ZVal.getNull();
            }
            Object status = assignParameter(args, 1, true);
            if (null == status) {
                status = 200;
            }
            Object headers = assignParameter(args, 2, true);
            if (null == headers) {
                headers = ZVal.newArray();
            }
            Object _pPublic = assignParameter(args, 3, true);
            if (null == _pPublic) {
                _pPublic = true;
            }
            Object contentDisposition = assignParameter(args, 4, true);
            if (null == contentDisposition) {
                contentDisposition = ZVal.getNull();
            }
            Object autoEtag = assignParameter(args, 5, true);
            if (null == autoEtag) {
                autoEtag = false;
            }
            Object autoLastModified = assignParameter(args, 6, true);
            if (null == autoLastModified) {
                autoLastModified = true;
            }
            return ZVal.assign(
                    env.createNewWithLateStaticBindings(
                            this,
                            file,
                            status,
                            headers,
                            _pPublic,
                            contentDisposition,
                            autoEtag,
                            autoLastModified));
        }

        @ConvertedMethod
        public Object trustXSendfileTypeHeader(RuntimeEnv env, Object... args) {
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .HttpFoundation
                                            .classes
                                            .BinaryFileResponse
                                            .RequestStaticProperties
                                            .class)
                            .trustXSendfileTypeHeader =
                    true;
            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object trustXSendfileTypeHeader = false;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpFoundation\\BinaryFileResponse")
                    .setLookup(
                            BinaryFileResponse.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "charset",
                            "content",
                            "deleteFileAfterSend",
                            "file",
                            "headers",
                            "maxlen",
                            "offset",
                            "statusCode",
                            "statusText",
                            "version")
                    .setStaticPropertyNames("trustXSendfileTypeHeader")
                    .setFilename("vendor/symfony/http-foundation/BinaryFileResponse.php")
                    .addExtendsClass("Symfony\\Component\\HttpFoundation\\Response")
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
