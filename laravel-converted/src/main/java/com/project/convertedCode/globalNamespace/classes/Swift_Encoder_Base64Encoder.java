package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Swift_Encoder;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Encoder/Base64Encoder.php

*/

public class Swift_Encoder_Base64Encoder extends RuntimeClassBase implements Swift_Encoder {

    public Swift_Encoder_Base64Encoder(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Swift_Encoder_Base64Encoder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    @ConvertedParameter(
        index = 1,
        name = "firstLineOffset",
        defaultValue = "0",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 2,
        name = "maxLineLength",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object encodeString(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        Object firstLineOffset = assignParameter(args, 1, true);
        if (null == firstLineOffset) {
            firstLineOffset = 0;
        }
        Object maxLineLength = assignParameter(args, 2, true);
        if (null == maxLineLength) {
            maxLineLength = 0;
        }
        Object encodedString = null;
        Object firstLine = null;
        if (ZVal.toBool(ZVal.isGreaterThanOrEqualTo(0, ">=", maxLineLength))
                || ZVal.toBool(ZVal.isLessThan(76, '<', maxLineLength))) {
            maxLineLength = 76;
        }

        encodedString = NamespaceGlobal.base64_encode.env(env).call(string).value();
        firstLine = "";
        if (ZVal.notEqualityCheck(0, firstLineOffset)) {
            firstLine =
                    toStringR(
                                    function_substr
                                            .f
                                            .env(env)
                                            .call(
                                                    encodedString,
                                                    0,
                                                    ZVal.subtract(maxLineLength, firstLineOffset))
                                            .value(),
                                    env)
                            + "\r\n";
            encodedString =
                    function_substr
                            .f
                            .env(env)
                            .call(encodedString, ZVal.subtract(maxLineLength, firstLineOffset))
                            .value();
        }

        return ZVal.assign(
                toStringR(firstLine, env)
                        + toStringR(
                                function_trim
                                        .f
                                        .env(env)
                                        .call(
                                                NamespaceGlobal.chunk_split
                                                        .env(env)
                                                        .call(encodedString, maxLineLength, "\r\n")
                                                        .value())
                                        .value(),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "charset")
    public Object charsetChanged(RuntimeEnv env, Object... args) {
        Object charset = assignParameter(args, 0, false);
        return null;
    }

    public static final Object CONST_class = "Swift_Encoder_Base64Encoder";

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
                    .setName("Swift_Encoder_Base64Encoder")
                    .setLookup(
                            Swift_Encoder_Base64Encoder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Encoder/Base64Encoder.php")
                    .addInterface("Swift_Encoder")
                    .addInterface("Swift_Mime_CharsetObserver")
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
