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

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/CharacterReader.php

*/

public interface Swift_CharacterReader {

    public static final Object CONST_MAP_TYPE_INVALID = 1;

    public static final Object CONST_MAP_TYPE_FIXED_LEN = 2;

    public static final Object CONST_MAP_TYPE_POSITIONS = 3;

    public static final Object CONST_class = "Swift_CharacterReader";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    @ConvertedParameter(index = 1, name = "startOffset")
    @ConvertedParameter(index = 2, name = "currentMap")
    @ConvertedParameter(index = 3, name = "ignoredChars")
    public Object getCharPositions(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args);

    @ConvertedMethod
    public Object getMapType(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bytes")
    @ConvertedParameter(index = 1, name = "size")
    public Object validateByteSequence(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getInitialByteSize(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_CharacterReader")
                    .setLookup(Swift_CharacterReader.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/CharacterReader.php")
                    .get();
}
