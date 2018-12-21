package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Swift_KeyCache;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/KeyCache/NullKeyCache.php

*/

public class Swift_KeyCache_NullKeyCache extends RuntimeClassBase implements Swift_KeyCache {

    public Swift_KeyCache_NullKeyCache(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Swift_KeyCache_NullKeyCache(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nsKey")
    @ConvertedParameter(index = 1, name = "itemKey")
    @ConvertedParameter(index = 2, name = "string")
    @ConvertedParameter(index = 3, name = "mode")
    public Object setString(RuntimeEnv env, Object... args) {
        Object nsKey = assignParameter(args, 0, false);
        Object itemKey = assignParameter(args, 1, false);
        Object string = assignParameter(args, 2, false);
        Object mode = assignParameter(args, 3, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nsKey")
    @ConvertedParameter(index = 1, name = "itemKey")
    @ConvertedParameter(index = 2, name = "os", typeHint = "Swift_OutputByteStream")
    @ConvertedParameter(index = 3, name = "mode")
    public Object importFromByteStream(RuntimeEnv env, Object... args) {
        Object nsKey = assignParameter(args, 0, false);
        Object itemKey = assignParameter(args, 1, false);
        Object os = assignParameter(args, 2, false);
        Object mode = assignParameter(args, 3, false);
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
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nsKey")
    @ConvertedParameter(index = 1, name = "itemKey")
    public Object getString(RuntimeEnv env, Object... args) {
        Object nsKey = assignParameter(args, 0, false);
        Object itemKey = assignParameter(args, 1, false);
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
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nsKey")
    @ConvertedParameter(index = 1, name = "itemKey")
    public Object hasKey(RuntimeEnv env, Object... args) {
        Object nsKey = assignParameter(args, 0, false);
        Object itemKey = assignParameter(args, 1, false);
        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nsKey")
    @ConvertedParameter(index = 1, name = "itemKey")
    public Object clearKey(RuntimeEnv env, Object... args) {
        Object nsKey = assignParameter(args, 0, false);
        Object itemKey = assignParameter(args, 1, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nsKey")
    public Object clearAll(RuntimeEnv env, Object... args) {
        Object nsKey = assignParameter(args, 0, false);
        return null;
    }

    public static final Object CONST_class = "Swift_KeyCache_NullKeyCache";

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
                    .setName("Swift_KeyCache_NullKeyCache")
                    .setLookup(
                            Swift_KeyCache_NullKeyCache.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/KeyCache/NullKeyCache.php")
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
}
