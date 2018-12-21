package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Swift_IoException;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fread;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Swift_KeyCache;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_file;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.project.convertedCode.globalNamespace.classes.Swift_SwiftException;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fwrite;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/KeyCache/DiskKeyCache.php

*/

public class Swift_KeyCache_DiskKeyCache extends RuntimeClassBase implements Swift_KeyCache {

    public Object stream = null;

    public Object path = null;

    public Object keys = ZVal.newArray();

    public Swift_KeyCache_DiskKeyCache(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_KeyCache_DiskKeyCache.class) {
            this.__construct(env, args);
        }
    }

    public Swift_KeyCache_DiskKeyCache(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stream", typeHint = "Swift_KeyCache_KeyCacheInputStream")
    @ConvertedParameter(index = 1, name = "path")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object stream = assignParameter(args, 0, false);
        Object path = assignParameter(args, 1, false);
        this.stream = stream;
        this.path = path;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nsKey")
    @ConvertedParameter(index = 1, name = "itemKey")
    @ConvertedParameter(index = 2, name = "string")
    @ConvertedParameter(index = 3, name = "mode")
    public Object setString(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object nsKey = assignParameter(args, 0, false);
        Object itemKey = assignParameter(args, 1, false);
        Object string = assignParameter(args, 2, false);
        Object mode = assignParameter(args, 3, false);
        Object fp = null;
        this.prepareCache(env, nsKey);
        SwitchEnumType99 switchVariable99 =
                ZVal.getEnum(
                        mode,
                        SwitchEnumType99.DEFAULT_CASE,
                        SwitchEnumType99.DYNAMIC_TYPE_343,
                        CONST_MODE_WRITE,
                        SwitchEnumType99.DYNAMIC_TYPE_344,
                        CONST_MODE_APPEND);
        switch (switchVariable99) {
            case DYNAMIC_TYPE_343:
                fp = this.getHandle(env, nsKey, itemKey, CONST_POSITION_START);
                break;
            case DYNAMIC_TYPE_344:
                fp = this.getHandle(env, nsKey, itemKey, CONST_POSITION_END);
                break;
            case DEFAULT_CASE:
                throw ZVal.getException(
                        env,
                        new Swift_SwiftException(
                                env,
                                "Invalid mode ["
                                        + toStringR(mode, env)
                                        + "] used to set nsKey="
                                        + toStringR(nsKey, env)
                                        + ", itemKey="
                                        + toStringR(itemKey, env)));
        }
        ;
        function_fwrite.f.env(env).call(fp, string);
        this.freeHandle(env, nsKey, itemKey);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nsKey")
    @ConvertedParameter(index = 1, name = "itemKey")
    @ConvertedParameter(index = 2, name = "os", typeHint = "Swift_OutputByteStream")
    @ConvertedParameter(index = 3, name = "mode")
    public Object importFromByteStream(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object nsKey = assignParameter(args, 0, false);
        Object itemKey = assignParameter(args, 1, false);
        Object os = assignParameter(args, 2, false);
        Object mode = assignParameter(args, 3, false);
        Object bytes = null;
        Object fp = null;
        this.prepareCache(env, nsKey);
        SwitchEnumType100 switchVariable100 =
                ZVal.getEnum(
                        mode,
                        SwitchEnumType100.DEFAULT_CASE,
                        SwitchEnumType100.DYNAMIC_TYPE_345,
                        CONST_MODE_WRITE,
                        SwitchEnumType100.DYNAMIC_TYPE_346,
                        CONST_MODE_APPEND);
        switch (switchVariable100) {
            case DYNAMIC_TYPE_345:
                fp = this.getHandle(env, nsKey, itemKey, CONST_POSITION_START);
                break;
            case DYNAMIC_TYPE_346:
                fp = this.getHandle(env, nsKey, itemKey, CONST_POSITION_END);
                break;
            case DEFAULT_CASE:
                throw ZVal.getException(
                        env,
                        new Swift_SwiftException(
                                env,
                                "Invalid mode ["
                                        + toStringR(mode, env)
                                        + "] used to set nsKey="
                                        + toStringR(nsKey, env)
                                        + ", itemKey="
                                        + toStringR(itemKey, env)));
        }
        ;
        runtimeConverterBreakCount = 0;
        while (ZVal.strictNotEqualityCheck(
                false,
                "!==",
                bytes = env.callMethod(os, "read", Swift_KeyCache_DiskKeyCache.class, 8192))) {
            function_fwrite.f.env(env).call(fp, bytes);
        }

        this.freeHandle(env, nsKey, itemKey);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nsKey")
    @ConvertedParameter(index = 1, name = "itemKey")
    @ConvertedParameter(
        index = 2,
        name = "writeThrough",
        typeHint = "Swift_InputByteStream",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getInputByteStream(RuntimeEnv env, Object... args) {
        Object nsKey = assignParameter(args, 0, false);
        Object itemKey = assignParameter(args, 1, false);
        Object writeThrough = assignParameter(args, 2, true);
        if (null == writeThrough) {
            writeThrough = ZVal.getNull();
        }
        Object is = null;
        is = ZVal.assign(((RuntimeClassInterface) this.stream).phpClone(env));
        env.callMethod(is, "setKeyCache", Swift_KeyCache_DiskKeyCache.class, this);
        env.callMethod(is, "setNsKey", Swift_KeyCache_DiskKeyCache.class, nsKey);
        env.callMethod(is, "setItemKey", Swift_KeyCache_DiskKeyCache.class, itemKey);
        if (ZVal.isset(writeThrough)) {
            env.callMethod(
                    is, "setWriteThroughStream", Swift_KeyCache_DiskKeyCache.class, writeThrough);
        }

        return ZVal.assign(is);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nsKey")
    @ConvertedParameter(index = 1, name = "itemKey")
    public Object getString(RuntimeEnv env, Object... args) {
        Object nsKey = assignParameter(args, 0, false);
        Object itemKey = assignParameter(args, 1, false);
        Object str = null;
        Object bytes = null;
        Object fp = null;
        this.prepareCache(env, nsKey);
        if (ZVal.isTrue(this.hasKey(env, nsKey, itemKey))) {
            fp = this.getHandle(env, nsKey, itemKey, CONST_POSITION_START);
            str = "";
            while (ZVal.toBool(!NamespaceGlobal.feof.env(env).call(fp).getBool())
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    false,
                                    "!==",
                                    bytes = function_fread.f.env(env).call(fp, 8192).value()))) {
                str = toStringR(str, env) + toStringR(bytes, env);
            }

            this.freeHandle(env, nsKey, itemKey);
            return ZVal.assign(str);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nsKey")
    @ConvertedParameter(index = 1, name = "itemKey")
    @ConvertedParameter(index = 2, name = "is", typeHint = "Swift_InputByteStream")
    public Object exportToByteStream(RuntimeEnv env, Object... args) {
        Object nsKey = assignParameter(args, 0, false);
        Object itemKey = assignParameter(args, 1, false);
        Object is = assignParameter(args, 2, false);
        Object bytes = null;
        Object fp = null;
        if (ZVal.isTrue(this.hasKey(env, nsKey, itemKey))) {
            fp = this.getHandle(env, nsKey, itemKey, CONST_POSITION_START);
            while (ZVal.toBool(!NamespaceGlobal.feof.env(env).call(fp).getBool())
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    false,
                                    "!==",
                                    bytes = function_fread.f.env(env).call(fp, 8192).value()))) {
                env.callMethod(is, "write", Swift_KeyCache_DiskKeyCache.class, bytes);
            }

            this.freeHandle(env, nsKey, itemKey);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nsKey")
    @ConvertedParameter(index = 1, name = "itemKey")
    public Object hasKey(RuntimeEnv env, Object... args) {
        Object nsKey = assignParameter(args, 0, false);
        Object itemKey = assignParameter(args, 1, false);
        return ZVal.assign(
                function_is_file
                        .f
                        .env(env)
                        .call(
                                toStringR(this.path, env)
                                        + "/"
                                        + toStringR(nsKey, env)
                                        + "/"
                                        + toStringR(itemKey, env))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nsKey")
    @ConvertedParameter(index = 1, name = "itemKey")
    public Object clearKey(RuntimeEnv env, Object... args) {
        Object nsKey = assignParameter(args, 0, false);
        Object itemKey = assignParameter(args, 1, false);
        if (ZVal.isTrue(this.hasKey(env, nsKey, itemKey))) {
            this.freeHandle(env, nsKey, itemKey);
            NamespaceGlobal.unlink
                    .env(env)
                    .call(
                            toStringR(this.path, env)
                                    + "/"
                                    + toStringR(nsKey, env)
                                    + "/"
                                    + toStringR(itemKey, env));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nsKey")
    public Object clearAll(RuntimeEnv env, Object... args) {
        Object nsKey = assignParameter(args, 0, false);
        Object _null = null;
        Object itemKey = null;
        if (function_array_key_exists.f.env(env).call(nsKey, this.keys).getBool()) {
            for (ZPair zpairResult1511 :
                    ZVal.getIterable(
                            new ReferenceClassProperty(this, "keys", env).arrayGet(env, nsKey),
                            env,
                            false)) {
                itemKey = ZVal.assign(zpairResult1511.getKey());
                _null = ZVal.assign(zpairResult1511.getValue());
                this.clearKey(env, nsKey, itemKey);
            }

            if (function_is_dir
                    .f
                    .env(env)
                    .call(toStringR(this.path, env) + "/" + toStringR(nsKey, env))
                    .getBool()) {
                NamespaceGlobal.rmdir
                        .env(env)
                        .call(toStringR(this.path, env) + "/" + toStringR(nsKey, env));
            }

            arrayActionR(
                    ArrayAction.UNSET, new ReferenceClassProperty(this, "keys", env), env, nsKey);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nsKey")
    private Object prepareCache(RuntimeEnv env, Object... args) {
        Object nsKey = assignParameter(args, 0, false);
        Object cacheDir = null;
        cacheDir = toStringR(this.path, env) + "/" + toStringR(nsKey, env);
        if (!function_is_dir.f.env(env).call(cacheDir).getBool()) {
            if (!NamespaceGlobal.mkdir.env(env).call(cacheDir).getBool()) {
                throw ZVal.getException(
                        env,
                        new Swift_IoException(
                                env,
                                "Failed to create cache directory " + toStringR(cacheDir, env)));
            }

            new ReferenceClassProperty(this, "keys", env)
                    .arrayAccess(env, nsKey)
                    .set(ZVal.newArray());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nsKey")
    @ConvertedParameter(index = 1, name = "itemKey")
    @ConvertedParameter(index = 2, name = "position")
    private Object getHandle(RuntimeEnv env, Object... args) {
        Object nsKey = assignParameter(args, 0, false);
        Object itemKey = assignParameter(args, 1, false);
        Object position = assignParameter(args, 2, false);
        Object openMode = null;
        Object fp = null;
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "keys", env),
                env,
                nsKey,
                itemKey)) {
            openMode = ZVal.assign(ZVal.isTrue(this.hasKey(env, nsKey, itemKey)) ? "r+b" : "w+b");
            fp =
                    function_fopen
                            .f
                            .env(env)
                            .call(
                                    toStringR(this.path, env)
                                            + "/"
                                            + toStringR(nsKey, env)
                                            + "/"
                                            + toStringR(itemKey, env),
                                    openMode)
                            .value();
            new ReferenceClassProperty(this, "keys", env).arrayAccess(env, nsKey, itemKey).set(fp);
        }

        if (ZVal.equalityCheck(CONST_POSITION_START, position)) {
            NamespaceGlobal.fseek
                    .env(env)
                    .call(
                            new ReferenceClassProperty(this, "keys", env)
                                    .arrayGet(env, nsKey, itemKey),
                            0,
                            0);

        } else if (ZVal.equalityCheck(CONST_POSITION_END, position)) {
            NamespaceGlobal.fseek
                    .env(env)
                    .call(
                            new ReferenceClassProperty(this, "keys", env)
                                    .arrayGet(env, nsKey, itemKey),
                            0,
                            2);
        }

        return ZVal.assign(
                new ReferenceClassProperty(this, "keys", env).arrayGet(env, nsKey, itemKey));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nsKey")
    @ConvertedParameter(index = 1, name = "itemKey")
    private Object freeHandle(RuntimeEnv env, Object... args) {
        Object nsKey = assignParameter(args, 0, false);
        Object itemKey = assignParameter(args, 1, false);
        Object fp = null;
        fp = this.getHandle(env, nsKey, itemKey, CONST_POSITION_CURRENT);
        function_fclose.f.env(env).call(fp);
        new ReferenceClassProperty(this, "keys", env)
                .arrayAccess(env, nsKey, itemKey)
                .set(ZVal.getNull());
        return null;
    }

    @ConvertedMethod
    public Object __destruct(RuntimeEnv env, Object... args) {
        Object _null = null;
        Object nsKey = null;
        for (ZPair zpairResult1512 : ZVal.getIterable(this.keys, env, false)) {
            nsKey = ZVal.assign(zpairResult1512.getKey());
            _null = ZVal.assign(zpairResult1512.getValue());
            this.clearAll(env, nsKey);
        }

        return null;
    }

    public static final Object CONST_POSITION_START = 0;

    public static final Object CONST_POSITION_END = 1;

    public static final Object CONST_POSITION_CURRENT = 2;

    public static final Object CONST_class = "Swift_KeyCache_DiskKeyCache";

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
                    .setName("Swift_KeyCache_DiskKeyCache")
                    .setLookup(
                            Swift_KeyCache_DiskKeyCache.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("keys", "path", "stream")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/KeyCache/DiskKeyCache.php")
                    .addInterface("Swift_KeyCache")
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

    private enum SwitchEnumType99 {
        DYNAMIC_TYPE_343,
        DYNAMIC_TYPE_344,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType100 {
        DYNAMIC_TYPE_345,
        DYNAMIC_TYPE_346,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
