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

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/Header.php

*/

public interface Swift_Mime_Header {

    public static final Object CONST_TYPE_TEXT = 2;

    public static final Object CONST_TYPE_PARAMETERIZED = 6;

    public static final Object CONST_TYPE_MAILBOX = 8;

    public static final Object CONST_TYPE_DATE = 16;

    public static final Object CONST_TYPE_ID = 32;

    public static final Object CONST_TYPE_PATH = 64;

    public static final Object CONST_class = "Swift_Mime_Header";

    @ConvertedMethod
    public Object getFieldType(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "model")
    public Object setFieldBodyModel(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "charset")
    public Object setCharset(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getFieldBodyModel(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getFieldName(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getFieldBody(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Mime_Header")
                    .setLookup(Swift_Mime_Header.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/Header.php")
                    .get();
}
