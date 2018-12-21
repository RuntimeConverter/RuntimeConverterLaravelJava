package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Profiler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Profiler.classes.ProfilerStorageInterface;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.FilesystemIterator;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.RecursiveDirectoryIterator;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fread;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Profiler.classes.Profile;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_file;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.RecursiveIteratorIterator;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/Profiler/FileProfilerStorage.php

*/

public class FileProfilerStorage extends RuntimeClassBase implements ProfilerStorageInterface {

    public Object folder = null;

    public FileProfilerStorage(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FileProfilerStorage.class) {
            this.__construct(env, args);
        }
    }

    public FileProfilerStorage(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dsn", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object dsn = assignParameter(args, 0, false);
        if (ZVal.strictNotEqualityCheck(
                0, "!==", function_strpos.f.env(env).call(dsn, "file:").value())) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Please check your configuration. You are trying to use FileStorage with an invalid dsn \"%s\". The expected format is \"file:/path/to/the/storage/folder\".",
                                            dsn)
                                    .value()));
        }

        this.folder = function_substr.f.env(env).call(dsn, 5).value();
        if (ZVal.toBool(
                        ZVal.toBool(!function_is_dir.f.env(env).call(this.folder).getBool())
                                && ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                false,
                                                "===",
                                                NamespaceGlobal.mkdir
                                                        .env(env)
                                                        .call(this.folder, 511, true)
                                                        .value())))
                && ZVal.toBool(!function_is_dir.f.env(env).call(this.folder).getBool())) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Unable to create the storage directory (%s).",
                                            this.folder)
                                    .value()));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ip")
    @ConvertedParameter(index = 1, name = "url")
    @ConvertedParameter(index = 2, name = "limit")
    @ConvertedParameter(index = 3, name = "method")
    @ConvertedParameter(
        index = 4,
        name = "start",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "end",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "statusCode",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object find(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object ip = assignParameter(args, 0, false);
        Object url = assignParameter(args, 1, false);
        Object limit = assignParameter(args, 2, false);
        Object method = assignParameter(args, 3, false);
        Object start = assignParameter(args, 4, true);
        if (null == start) {
            start = ZVal.getNull();
        }
        Object end = assignParameter(args, 5, true);
        if (null == end) {
            end = ZVal.getNull();
        }
        Object statusCode = assignParameter(args, 6, true);
        if (null == statusCode) {
            statusCode = ZVal.getNull();
        }
        Object csvToken = null;
        Object csvIp = null;
        Object line = null;
        Object values = null;
        Object csvMethod = null;
        ReferenceContainer result = new BasicReferenceContainer(null);
        Object csvStatusCode = null;
        Object runtimeTempArrayResult202 = null;
        Object csvUrl = null;
        Object file = null;
        Object csvParent = null;
        Object csvTime = null;
        file = this.getIndexFilename(env);
        if (!function_file_exists.f.env(env).call(file).getBool()) {
            return ZVal.assign(ZVal.newArray());
        }

        file = function_fopen.f.env(env).call(file, "r").value();
        NamespaceGlobal.fseek.env(env).call(file, 0, 2);
        result.setObject(ZVal.newArray());
        runtimeConverterContinueCount = 0;
        while (ZVal.toBool(
                        ZVal.isLessThan(
                                function_count.f.env(env).call(result.getObject()).value(),
                                '<',
                                limit))
                && ZVal.toBool(line = this.readLineFromFile(env, file))) {
            values = NamespaceGlobal.str_getcsv.env(env).call(line).value();
            ZVal.list(
                    runtimeTempArrayResult202 = values,
                    (csvToken = listGet(runtimeTempArrayResult202, 0, env)),
                    (csvIp = listGet(runtimeTempArrayResult202, 1, env)),
                    (csvMethod = listGet(runtimeTempArrayResult202, 2, env)),
                    (csvUrl = listGet(runtimeTempArrayResult202, 3, env)),
                    (csvTime = listGet(runtimeTempArrayResult202, 4, env)),
                    (csvParent = listGet(runtimeTempArrayResult202, 5, env)),
                    (csvStatusCode = listGet(runtimeTempArrayResult202, 6, env)));
            csvTime = ZVal.assign(ZVal.toLong(csvTime));
            if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.toBool(
                                                            ZVal.toBool(ip)
                                                                    && ZVal.toBool(
                                                                            ZVal
                                                                                    .strictEqualityCheck(
                                                                                            false,
                                                                                            "===",
                                                                                            function_strpos
                                                                                                    .f
                                                                                                    .env(
                                                                                                            env)
                                                                                                    .call(
                                                                                                            csvIp,
                                                                                                            ip)
                                                                                                    .value())))
                                                    || ZVal.toBool(
                                                            ZVal.toBool(url)
                                                                    && ZVal.toBool(
                                                                            ZVal
                                                                                    .strictEqualityCheck(
                                                                                            false,
                                                                                            "===",
                                                                                            function_strpos
                                                                                                    .f
                                                                                                    .env(
                                                                                                            env)
                                                                                                    .call(
                                                                                                            csvUrl,
                                                                                                            url)
                                                                                                    .value()))))
                                    || ZVal.toBool(
                                            ZVal.toBool(method)
                                                    && ZVal.toBool(
                                                            ZVal.strictEqualityCheck(
                                                                    false,
                                                                    "===",
                                                                    function_strpos
                                                                            .f
                                                                            .env(env)
                                                                            .call(csvMethod, method)
                                                                            .value()))))
                    || ZVal.toBool(
                            ZVal.toBool(statusCode)
                                    && ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    false,
                                                    "===",
                                                    function_strpos
                                                            .f
                                                            .env(env)
                                                            .call(csvStatusCode, statusCode)
                                                            .value())))) {
                continue;
            }

            if (ZVal.toBool(!ZVal.isEmpty(start))
                    && ZVal.toBool(ZVal.isLessThan(csvTime, '<', start))) {
                continue;
            }

            if (ZVal.toBool(!ZVal.isEmpty(end))
                    && ZVal.toBool(ZVal.isGreaterThan(csvTime, '>', end))) {
                continue;
            }

            result.arrayAccess(env, csvToken)
                    .set(
                            ZVal.newArray(
                                    new ZPair("token", csvToken),
                                    new ZPair("ip", csvIp),
                                    new ZPair("method", csvMethod),
                                    new ZPair("url", csvUrl),
                                    new ZPair("time", csvTime),
                                    new ZPair("parent", csvParent),
                                    new ZPair("status_code", csvStatusCode)));
        }

        function_fclose.f.env(env).call(file);
        return ZVal.assign(function_array_values.f.env(env).call(result.getObject()).value());
    }

    @ConvertedMethod
    public Object purge(RuntimeEnv env, Object... args) {
        Object iterator = null;
        Object file = null;
        Object flags = null;
        flags = ZVal.assign(4096);
        iterator = new RecursiveDirectoryIterator(env, this.folder, flags);
        iterator = new RecursiveIteratorIterator(env, iterator, 2);
        for (ZPair zpairResult1979 : ZVal.getIterable(iterator, env, true)) {
            file = ZVal.assign(zpairResult1979.getValue());
            if (function_is_file.f.env(env).call(file).getBool()) {
                NamespaceGlobal.unlink.env(env).call(file);

            } else {
                NamespaceGlobal.rmdir.env(env).call(file);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token")
    public Object read(RuntimeEnv env, Object... args) {
        Object token = assignParameter(args, 0, false);
        Object file = null;
        if (ZVal.toBool(!ZVal.isTrue(token))
                || ZVal.toBool(
                        !function_file_exists
                                .f
                                .env(env)
                                .call(file = this.getFilename(env, token))
                                .getBool())) {
            return null;
        }

        return ZVal.assign(
                this.createProfileFromData(
                        env,
                        token,
                        function_unserialize
                                .f
                                .env(env)
                                .call(function_file_get_contents.f.env(env).call(file).value())
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "profile",
        typeHint = "Symfony\\Component\\HttpKernel\\Profiler\\Profile"
    )
    public Object write(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/http-kernel/Profiler")
                        .setFile("/vendor/symfony/http-kernel/Profiler/FileProfilerStorage.php");
        Object profile = assignParameter(args, 0, false);
        Object profileIndexed = null;
        Object file = null;
        Object data = null;
        Object profileToken = null;
        Object childrenToken = null;
        Object parentToken = null;
        Object dir = null;
        file =
                this.getFilename(
                        env, env.callMethod(profile, "getToken", FileProfilerStorage.class));
        profileIndexed = function_is_file.f.env(env).call(file).value();
        if (!ZVal.isTrue(profileIndexed)) {
            dir = function_dirname.f.env(env).call(file).value();
            if (ZVal.toBool(
                            ZVal.toBool(!function_is_dir.f.env(env).call(dir).getBool())
                                    && ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    false,
                                                    "===",
                                                    NamespaceGlobal.mkdir
                                                            .env(env)
                                                            .call(dir, 511, true)
                                                            .value())))
                    && ZVal.toBool(!function_is_dir.f.env(env).call(dir).getBool())) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("Unable to create the storage directory (%s).", dir)
                                        .value()));
            }
        }

        profileToken = env.callMethod(profile, "getToken", FileProfilerStorage.class);
        parentToken =
                ZVal.assign(
                        ZVal.strictNotEqualityCheck(
                                        env.callMethod(
                                                profile,
                                                "getParentToken",
                                                FileProfilerStorage.class),
                                        "!==",
                                        profileToken)
                                ? env.callMethod(
                                        profile, "getParentToken", FileProfilerStorage.class)
                                : ZVal.getNull());
        childrenToken =
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                function_array_map
                                        .f
                                        .env(env)
                                        .call(
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Symfony\\Component\\HttpKernel\\Profiler",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(
                                                        index = 0,
                                                        name = "p",
                                                        typeHint =
                                                                "Symfony\\Component\\HttpKernel\\Profiler\\Profile"
                                                    )
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object p = assignParameter(args, 0, false);
                                                        Object profileToken = null;
                                                        profileToken =
                                                                this.contextReferences
                                                                        .getCapturedValue(
                                                                                "profileToken");
                                                        return ZVal.assign(
                                                                ZVal.strictNotEqualityCheck(
                                                                                profileToken,
                                                                                "!==",
                                                                                env.callMethod(
                                                                                        p,
                                                                                        "getToken",
                                                                                        FileProfilerStorage
                                                                                                .class))
                                                                        ? env.callMethod(
                                                                                p,
                                                                                "getToken",
                                                                                FileProfilerStorage
                                                                                        .class)
                                                                        : ZVal.getNull());
                                                    }
                                                }.use("profileToken", profileToken),
                                                env.callMethod(
                                                        profile,
                                                        "getChildren",
                                                        FileProfilerStorage.class))
                                        .value())
                        .value();
        data =
                ZVal.newArray(
                        new ZPair("token", profileToken),
                        new ZPair("parent", parentToken),
                        new ZPair("children", childrenToken),
                        new ZPair(
                                "data",
                                env.callMethod(
                                        profile, "getCollectors", FileProfilerStorage.class)),
                        new ZPair(
                                "ip", env.callMethod(profile, "getIp", FileProfilerStorage.class)),
                        new ZPair(
                                "method",
                                env.callMethod(profile, "getMethod", FileProfilerStorage.class)),
                        new ZPair(
                                "url",
                                env.callMethod(profile, "getUrl", FileProfilerStorage.class)),
                        new ZPair(
                                "time",
                                env.callMethod(profile, "getTime", FileProfilerStorage.class)),
                        new ZPair(
                                "status_code",
                                env.callMethod(
                                        profile, "getStatusCode", FileProfilerStorage.class)));
        if (ZVal.strictEqualityCheck(
                false,
                "===",
                NamespaceGlobal.file_put_contents
                        .env(env)
                        .call(file, function_serialize.f.env(env).call(data).value())
                        .value())) {
            return ZVal.assign(false);
        }

        if (!ZVal.isTrue(profileIndexed)) {
            if (ZVal.strictEqualityCheck(
                    false,
                    "===",
                    file =
                            function_fopen
                                    .f
                                    .env(env)
                                    .call(this.getIndexFilename(env), "a")
                                    .value())) {
                return ZVal.assign(false);
            }

            NamespaceGlobal.fputcsv
                    .env(env)
                    .call(
                            file,
                            ZVal.newArray(
                                    new ZPair(
                                            0,
                                            env.callMethod(
                                                    profile,
                                                    "getToken",
                                                    FileProfilerStorage.class)),
                                    new ZPair(
                                            1,
                                            env.callMethod(
                                                    profile, "getIp", FileProfilerStorage.class)),
                                    new ZPair(
                                            2,
                                            env.callMethod(
                                                    profile,
                                                    "getMethod",
                                                    FileProfilerStorage.class)),
                                    new ZPair(
                                            3,
                                            env.callMethod(
                                                    profile, "getUrl", FileProfilerStorage.class)),
                                    new ZPair(
                                            4,
                                            env.callMethod(
                                                    profile, "getTime", FileProfilerStorage.class)),
                                    new ZPair(
                                            5,
                                            env.callMethod(
                                                    profile,
                                                    "getParentToken",
                                                    FileProfilerStorage.class)),
                                    new ZPair(
                                            6,
                                            env.callMethod(
                                                    profile,
                                                    "getStatusCode",
                                                    FileProfilerStorage.class))));
            function_fclose.f.env(env).call(file);
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token")
    protected Object getFilename(RuntimeEnv env, Object... args) {
        Object token = assignParameter(args, 0, false);
        Object folderB = null;
        Object folderA = null;
        folderA = function_substr.f.env(env).call(token, -2, 2).value();
        folderB = function_substr.f.env(env).call(token, -4, 2).value();
        return ZVal.assign(
                toStringR(this.folder, env)
                        + "/"
                        + toStringR(folderA, env)
                        + "/"
                        + toStringR(folderB, env)
                        + "/"
                        + toStringR(token, env));
    }

    @ConvertedMethod
    protected Object getIndexFilename(RuntimeEnv env, Object... args) {
        return ZVal.assign(toStringR(this.folder, env) + "/index.csv");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    protected Object readLineFromFile(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        Object file = assignParameter(args, 0, false);
        Object upTo = null;
        Object chunkSize = null;
        Object line = null;
        Object position = null;
        Object buffer = null;
        line = "";
        position = NamespaceGlobal.ftell.env(env).call(file).value();
        if (ZVal.strictEqualityCheck(0, "===", position)) {
            return null;
        }

        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        while (ZVal.isTrue(true)) {
            chunkSize = NamespaceGlobal.min.env(env).call(position, 1024).value();
            position = ZAssignment.subtract("-=", position, chunkSize);
            NamespaceGlobal.fseek.env(env).call(file, position);
            if (ZVal.strictEqualityCheck(0, "===", chunkSize)) {
                break;
            }

            buffer = function_fread.f.env(env).call(file, chunkSize).value();
            if (ZVal.strictEqualityCheck(
                    false,
                    "===",
                    upTo = NamespaceGlobal.strrpos.env(env).call(buffer, "\n").value())) {
                line = toStringR(buffer, env) + toStringR(line, env);
                continue;
            }

            position = ZAssignment.add("+=", position, upTo);
            line =
                    toStringR(
                                    function_substr
                                            .f
                                            .env(env)
                                            .call(buffer, ZVal.add(upTo, 1))
                                            .value(),
                                    env)
                            + toStringR(line, env);
            NamespaceGlobal.fseek
                    .env(env)
                    .call(file, NamespaceGlobal.max.env(env).call(0, position).value(), 0);
            if (ZVal.strictNotEqualityCheck("", "!==", line)) {
                break;
            }
        }

        return ZVal.assign(ZVal.strictEqualityCheck("", "===", line) ? ZVal.getNull() : line);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token")
    @ConvertedParameter(index = 1, name = "data")
    @ConvertedParameter(
        index = 2,
        name = "parent",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object createProfileFromData(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object token = assignParameter(args, 0, false);
        ReferenceContainer data = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object parent = assignParameter(args, 2, true);
        if (null == parent) {
            parent = ZVal.getNull();
        }
        Object file = null;
        Object profile = null;
        profile = new Profile(env, token);
        env.callMethod(profile, "setIp", FileProfilerStorage.class, data.arrayGet(env, "ip"));
        env.callMethod(
                profile, "setMethod", FileProfilerStorage.class, data.arrayGet(env, "method"));
        env.callMethod(profile, "setUrl", FileProfilerStorage.class, data.arrayGet(env, "url"));
        env.callMethod(profile, "setTime", FileProfilerStorage.class, data.arrayGet(env, "time"));
        env.callMethod(
                profile,
                "setStatusCode",
                FileProfilerStorage.class,
                data.arrayGet(env, "status_code"));
        env.callMethod(
                profile, "setCollectors", FileProfilerStorage.class, data.arrayGet(env, "data"));
        if (ZVal.toBool(!ZVal.isTrue(parent)) && ZVal.toBool(data.arrayGet(env, "parent"))) {
            parent = this.read(env, data.arrayGet(env, "parent"));
        }

        if (ZVal.isTrue(parent)) {
            env.callMethod(profile, "setParent", FileProfilerStorage.class, parent);
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1980 : ZVal.getIterable(data.arrayGet(env, "children"), env, true)) {
            token = ZVal.assign(zpairResult1980.getValue());
            if (ZVal.toBool(!ZVal.isTrue(token))
                    || ZVal.toBool(
                            !function_file_exists
                                    .f
                                    .env(env)
                                    .call(file = this.getFilename(env, token))
                                    .getBool())) {
                continue;
            }

            env.callMethod(
                    profile,
                    "addChild",
                    FileProfilerStorage.class,
                    this.createProfileFromData(
                            env,
                            token,
                            function_unserialize
                                    .f
                                    .env(env)
                                    .call(function_file_get_contents.f.env(env).call(file).value())
                                    .value(),
                            profile));
        }

        return ZVal.assign(profile);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\Profiler\\FileProfilerStorage";

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
                    .setName("Symfony\\Component\\HttpKernel\\Profiler\\FileProfilerStorage")
                    .setLookup(
                            FileProfilerStorage.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("folder")
                    .setFilename("vendor/symfony/http-kernel/Profiler/FileProfilerStorage.php")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\Profiler\\ProfilerStorageInterface")
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
