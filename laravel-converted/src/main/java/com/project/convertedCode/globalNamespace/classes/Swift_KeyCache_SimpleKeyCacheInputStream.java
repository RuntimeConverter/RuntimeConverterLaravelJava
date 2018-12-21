package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Swift_KeyCache;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.classes.Swift_KeyCache_KeyCacheInputStream;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/KeyCache/SimpleKeyCacheInputStream.php

*/

public class Swift_KeyCache_SimpleKeyCacheInputStream extends RuntimeClassBase
        implements Swift_KeyCache_KeyCacheInputStream {

    public Object keyCache = null;

    public Object nsKey = null;

    public Object itemKey = null;

    public Object writeThrough = ZVal.getNull();

    public Swift_KeyCache_SimpleKeyCacheInputStream(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Swift_KeyCache_SimpleKeyCacheInputStream(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keyCache", typeHint = "Swift_KeyCache")
    public Object setKeyCache(RuntimeEnv env, Object... args) {
        Object keyCache = assignParameter(args, 0, false);
        this.keyCache = keyCache;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "is", typeHint = "Swift_InputByteStream")
    public Object setWriteThroughStream(RuntimeEnv env, Object... args) {
        Object is = assignParameter(args, 0, false);
        this.writeThrough = is;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bytes")
    @ConvertedParameter(
        index = 1,
        name = "is",
        typeHint = "Swift_InputByteStream",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object write(RuntimeEnv env, Object... args) {
        Object bytes = assignParameter(args, 0, false);
        Object is = assignParameter(args, 1, true);
        if (null == is) {
            is = ZVal.getNull();
        }
        env.callMethod(
                this.keyCache,
                "setString",
                Swift_KeyCache_SimpleKeyCacheInputStream.class,
                this.nsKey,
                this.itemKey,
                bytes,
                Swift_KeyCache.CONST_MODE_APPEND);
        if (ZVal.isset(is)) {
            env.callMethod(is, "write", Swift_KeyCache_SimpleKeyCacheInputStream.class, bytes);
        }

        if (ZVal.isset(this.writeThrough)) {
            env.callMethod(
                    this.writeThrough,
                    "write",
                    Swift_KeyCache_SimpleKeyCacheInputStream.class,
                    bytes);
        }

        return null;
    }

    @ConvertedMethod
    public Object commit(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "is", typeHint = "Swift_InputByteStream")
    public Object bind(RuntimeEnv env, Object... args) {
        Object is = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "is", typeHint = "Swift_InputByteStream")
    public Object unbind(RuntimeEnv env, Object... args) {
        Object is = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    public Object flushBuffers(RuntimeEnv env, Object... args) {
        env.callMethod(
                this.keyCache,
                "clearKey",
                Swift_KeyCache_SimpleKeyCacheInputStream.class,
                this.nsKey,
                this.itemKey);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nsKey")
    public Object setNsKey(RuntimeEnv env, Object... args) {
        Object nsKey = assignParameter(args, 0, false);
        this.nsKey = nsKey;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "itemKey")
    public Object setItemKey(RuntimeEnv env, Object... args) {
        Object itemKey = assignParameter(args, 0, false);
        this.itemKey = itemKey;
        return null;
    }

    @ConvertedMethod
    public Object __clone(RuntimeEnv env, Object... args) {
        this.writeThrough = ZVal.getNull();
        return null;
    }

    public static final Object CONST_class = "Swift_KeyCache_SimpleKeyCacheInputStream";

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
                    .setName("Swift_KeyCache_SimpleKeyCacheInputStream")
                    .setLookup(
                            Swift_KeyCache_SimpleKeyCacheInputStream.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("itemKey", "keyCache", "nsKey", "writeThrough")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/KeyCache/SimpleKeyCacheInputStream.php")
                    .addInterface("Swift_KeyCache_KeyCacheInputStream")
                    .addInterface("Swift_InputByteStream")
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
