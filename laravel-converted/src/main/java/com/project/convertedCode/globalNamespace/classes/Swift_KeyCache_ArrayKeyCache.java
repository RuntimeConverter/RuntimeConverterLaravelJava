package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Swift_SwiftException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Swift_KeyCache;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/KeyCache/ArrayKeyCache.php

*/

public class Swift_KeyCache_ArrayKeyCache extends RuntimeClassBase implements Swift_KeyCache {

    public Object contents = ZVal.newArray();

    public Object stream = null;

    public Swift_KeyCache_ArrayKeyCache(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_KeyCache_ArrayKeyCache.class) {
            this.__construct(env, args);
        }
    }

    public Swift_KeyCache_ArrayKeyCache(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stream", typeHint = "Swift_KeyCache_KeyCacheInputStream")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object stream = assignParameter(args, 0, false);
        this.stream = stream;
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
        this.prepareCache(env, nsKey);
        SwitchEnumType97 switchVariable97 =
                ZVal.getEnum(
                        mode,
                        SwitchEnumType97.DEFAULT_CASE,
                        SwitchEnumType97.DYNAMIC_TYPE_339,
                        CONST_MODE_WRITE,
                        SwitchEnumType97.DYNAMIC_TYPE_340,
                        CONST_MODE_APPEND);
        switch (switchVariable97) {
            case DYNAMIC_TYPE_339:
                new ReferenceClassProperty(this, "contents", env)
                        .arrayAccess(env, nsKey, itemKey)
                        .set(string);
                break;
            case DYNAMIC_TYPE_340:
                if (!ZVal.isTrue(this.hasKey(env, nsKey, itemKey))) {
                    new ReferenceClassProperty(this, "contents", env)
                            .arrayAccess(env, nsKey, itemKey)
                            .set("");
                }

                new ReferenceClassProperty(this, "contents", env)
                        .arrayAccess(env, nsKey, itemKey)
                        .set(
                                toStringR(
                                                new ReferenceClassProperty(this, "contents", env)
                                                        .arrayGet(env, nsKey, itemKey),
                                                env)
                                        + toStringR(string, env));
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
        this.prepareCache(env, nsKey);
        SwitchEnumType98 switchVariable98 =
                ZVal.getEnum(
                        mode,
                        SwitchEnumType98.DEFAULT_CASE,
                        SwitchEnumType98.DYNAMIC_TYPE_341,
                        CONST_MODE_WRITE,
                        SwitchEnumType98.DYNAMIC_TYPE_342,
                        CONST_MODE_APPEND);
        switch (switchVariable98) {
            case DYNAMIC_TYPE_341:
                this.clearKey(env, nsKey, itemKey);
            case DYNAMIC_TYPE_342:
                if (!ZVal.isTrue(this.hasKey(env, nsKey, itemKey))) {
                    new ReferenceClassProperty(this, "contents", env)
                            .arrayAccess(env, nsKey, itemKey)
                            .set("");
                }

                runtimeConverterBreakCount = 0;
                while (ZVal.strictNotEqualityCheck(
                        false,
                        "!==",
                        bytes =
                                env.callMethod(
                                        os, "read", Swift_KeyCache_ArrayKeyCache.class, 8192))) {
                    new ReferenceClassProperty(this, "contents", env)
                            .arrayAccess(env, nsKey, itemKey)
                            .set(
                                    toStringR(
                                                    new ReferenceClassProperty(
                                                                    this, "contents", env)
                                                            .arrayGet(env, nsKey, itemKey),
                                                    env)
                                            + toStringR(bytes, env));
                }

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
        env.callMethod(is, "setKeyCache", Swift_KeyCache_ArrayKeyCache.class, this);
        env.callMethod(is, "setNsKey", Swift_KeyCache_ArrayKeyCache.class, nsKey);
        env.callMethod(is, "setItemKey", Swift_KeyCache_ArrayKeyCache.class, itemKey);
        if (ZVal.isset(writeThrough)) {
            env.callMethod(
                    is, "setWriteThroughStream", Swift_KeyCache_ArrayKeyCache.class, writeThrough);
        }

        return ZVal.assign(is);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nsKey")
    @ConvertedParameter(index = 1, name = "itemKey")
    public Object getString(RuntimeEnv env, Object... args) {
        Object nsKey = assignParameter(args, 0, false);
        Object itemKey = assignParameter(args, 1, false);
        this.prepareCache(env, nsKey);
        if (ZVal.isTrue(this.hasKey(env, nsKey, itemKey))) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "contents", env)
                            .arrayGet(env, nsKey, itemKey));
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
        this.prepareCache(env, nsKey);
        env.callMethod(
                is,
                "write",
                Swift_KeyCache_ArrayKeyCache.class,
                this.getString(env, nsKey, itemKey));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nsKey")
    @ConvertedParameter(index = 1, name = "itemKey")
    public Object hasKey(RuntimeEnv env, Object... args) {
        Object nsKey = assignParameter(args, 0, false);
        Object itemKey = assignParameter(args, 1, false);
        this.prepareCache(env, nsKey);
        return ZVal.assign(
                function_array_key_exists
                        .f
                        .env(env)
                        .call(
                                itemKey,
                                new ReferenceClassProperty(this, "contents", env)
                                        .arrayGet(env, nsKey))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nsKey")
    @ConvertedParameter(index = 1, name = "itemKey")
    public Object clearKey(RuntimeEnv env, Object... args) {
        Object nsKey = assignParameter(args, 0, false);
        Object itemKey = assignParameter(args, 1, false);
        arrayActionR(
                ArrayAction.UNSET,
                new ReferenceClassProperty(this, "contents", env),
                env,
                nsKey,
                itemKey);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nsKey")
    public Object clearAll(RuntimeEnv env, Object... args) {
        Object nsKey = assignParameter(args, 0, false);
        arrayActionR(
                ArrayAction.UNSET, new ReferenceClassProperty(this, "contents", env), env, nsKey);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nsKey")
    private Object prepareCache(RuntimeEnv env, Object... args) {
        Object nsKey = assignParameter(args, 0, false);
        if (!function_array_key_exists.f.env(env).call(nsKey, this.contents).getBool()) {
            new ReferenceClassProperty(this, "contents", env)
                    .arrayAccess(env, nsKey)
                    .set(ZVal.newArray());
        }

        return null;
    }

    public static final Object CONST_class = "Swift_KeyCache_ArrayKeyCache";

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
                    .setName("Swift_KeyCache_ArrayKeyCache")
                    .setLookup(
                            Swift_KeyCache_ArrayKeyCache.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("contents", "stream")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/KeyCache/ArrayKeyCache.php")
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

    private enum SwitchEnumType97 {
        DYNAMIC_TYPE_339,
        DYNAMIC_TYPE_340,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType98 {
        DYNAMIC_TYPE_341,
        DYNAMIC_TYPE_342,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
