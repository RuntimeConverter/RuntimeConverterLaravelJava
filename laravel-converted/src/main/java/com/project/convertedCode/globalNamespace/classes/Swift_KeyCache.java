package com.project.convertedCode.globalNamespace.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/KeyCache.php

*/

public interface Swift_KeyCache {

    public static final Object CONST_MODE_WRITE = 1;

    public static final Object CONST_MODE_APPEND = 2;

    public static final Object CONST_class = "Swift_KeyCache";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nsKey")
    @ConvertedParameter(index = 1, name = "itemKey")
    @ConvertedParameter(index = 2, name = "string")
    @ConvertedParameter(index = 3, name = "mode")
    public Object setString(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nsKey")
    @ConvertedParameter(index = 1, name = "itemKey")
    @ConvertedParameter(index = 2, name = "os", typeHint = "Swift_OutputByteStream")
    @ConvertedParameter(index = 3, name = "mode")
    public Object importFromByteStream(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nsKey")
    @ConvertedParameter(index = 1, name = "itemKey")
    @ConvertedParameter(
        index = 2,
        name = "is",
        typeHint = "Swift_InputByteStream",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getInputByteStream(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nsKey")
    @ConvertedParameter(index = 1, name = "itemKey")
    public Object getString(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nsKey")
    @ConvertedParameter(index = 1, name = "itemKey")
    @ConvertedParameter(index = 2, name = "is", typeHint = "Swift_InputByteStream")
    public Object exportToByteStream(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nsKey")
    @ConvertedParameter(index = 1, name = "itemKey")
    public Object hasKey(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nsKey")
    @ConvertedParameter(index = 1, name = "itemKey")
    public Object clearKey(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nsKey")
    public Object clearAll(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_KeyCache")
                    .setLookup(Swift_KeyCache.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/swiftmailer/swiftmailer/lib/classes/Swift/KeyCache.php")
                    .get();
}
