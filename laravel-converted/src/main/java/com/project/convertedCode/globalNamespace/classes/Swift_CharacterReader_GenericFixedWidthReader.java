package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.classes.Swift_CharacterReader;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/CharacterReader/GenericFixedWidthReader.php

*/

public class Swift_CharacterReader_GenericFixedWidthReader extends RuntimeClassBase
        implements Swift_CharacterReader {

    public Object width = null;

    public Swift_CharacterReader_GenericFixedWidthReader(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_CharacterReader_GenericFixedWidthReader.class) {
            this.__construct(env, args);
        }
    }

    public Swift_CharacterReader_GenericFixedWidthReader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "width")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object width = assignParameter(args, 0, false);
        this.width = width;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    @ConvertedParameter(index = 1, name = "startOffset")
    @ConvertedParameter(index = 2, name = "currentMap")
    @ConvertedParameter(index = 3, name = "ignoredChars")
    public Object getCharPositions(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        Object string = assignParameter(args, 0, false);
        Object startOffset = assignParameter(args, 1, false);
        ReferenceContainer currentMap =
                assignParameterRef(runtimePassByReferenceArgs, args, 2, false);
        ReferenceContainer ignoredChars =
                assignParameterRef(runtimePassByReferenceArgs, args, 3, false);
        Object strlen = null;
        Object ignored = null;
        strlen = function_strlen.f.env(env).call(string).value();
        ignored = ZVal.modulus(strlen, this.width);
        ignoredChars.setObject(
                ZVal.assign(
                        ZVal.isTrue(ignored)
                                ? function_substr
                                        .f
                                        .env(env)
                                        .call(string, ZVal.minusSign(ignored))
                                        .value()
                                : ""));
        currentMap.setObject(ZVal.assign(this.width));
        return ZVal.assign(ZVal.divide(ZVal.subtract(strlen, ignored), this.width));
    }

    public Object getCharPositions(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    public Object getMapType(RuntimeEnv env, Object... args) {
        return ZVal.assign(CONST_MAP_TYPE_FIXED_LEN);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bytes")
    @ConvertedParameter(index = 1, name = "size")
    public Object validateByteSequence(RuntimeEnv env, Object... args) {
        Object bytes = assignParameter(args, 0, false);
        Object size = assignParameter(args, 1, false);
        Object needed = null;
        needed = ZVal.subtract(this.width, size);
        return ZVal.assign(ZVal.isGreaterThan(needed, '>', -1) ? needed : -1);
    }

    @ConvertedMethod
    public Object getInitialByteSize(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.width);
    }

    public static final Object CONST_class = "Swift_CharacterReader_GenericFixedWidthReader";

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
                    .setName("Swift_CharacterReader_GenericFixedWidthReader")
                    .setLookup(
                            Swift_CharacterReader_GenericFixedWidthReader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("width")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/CharacterReader/GenericFixedWidthReader.php")
                    .addInterface("Swift_CharacterReader")
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
