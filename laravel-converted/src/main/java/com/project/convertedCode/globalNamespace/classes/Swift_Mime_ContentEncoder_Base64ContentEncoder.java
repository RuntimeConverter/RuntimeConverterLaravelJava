package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZAssignment;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_ContentEncoder;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.classes.Swift_Encoder_Base64Encoder;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/ContentEncoder/Base64ContentEncoder.php

*/

public class Swift_Mime_ContentEncoder_Base64ContentEncoder extends Swift_Encoder_Base64Encoder
        implements Swift_Mime_ContentEncoder {

    public Swift_Mime_ContentEncoder_Base64ContentEncoder(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Swift_Mime_ContentEncoder_Base64ContentEncoder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "os", typeHint = "Swift_OutputByteStream")
    @ConvertedParameter(index = 1, name = "is", typeHint = "Swift_InputByteStream")
    @ConvertedParameter(
        index = 2,
        name = "firstLineOffset",
        defaultValue = "0",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 3,
        name = "maxLineLength",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object encodeByteStream(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object os = assignParameter(args, 0, false);
        Object is = assignParameter(args, 1, false);
        Object firstLineOffset = assignParameter(args, 2, true);
        if (null == firstLineOffset) {
            firstLineOffset = 0;
        }
        Object maxLineLength = assignParameter(args, 3, true);
        if (null == maxLineLength) {
            maxLineLength = 0;
        }
        Object base64ReadBufferRemainderBytes = null;
        Object atEOF = null;
        Object bytesLength = null;
        Object excessBytes = null;
        Object remainingLength = null;
        Object thisMaxLineLength = null;
        Object encodedTransformed = null;
        Object readBytes = null;
        Object remainder = null;
        Object streamTheseBytes = null;
        Object encoded = null;
        if (ZVal.toBool(ZVal.isGreaterThanOrEqualTo(0, ">=", maxLineLength))
                || ZVal.toBool(ZVal.isLessThan(76, '<', maxLineLength))) {
            maxLineLength = 76;
        }

        remainder = 0;
        base64ReadBufferRemainderBytes = ZVal.getNull();
        runtimeConverterBreakCount = 0;
        while (ZVal.isTrue(true)) {
            readBytes =
                    env.callMethod(
                            os, "read", Swift_Mime_ContentEncoder_Base64ContentEncoder.class, 8192);
            atEOF = ZVal.strictEqualityCheck(false, "===", readBytes);
            if (ZVal.isTrue(atEOF)) {
                streamTheseBytes = ZVal.assign(base64ReadBufferRemainderBytes);

            } else {
                streamTheseBytes =
                        toStringR(base64ReadBufferRemainderBytes, env) + toStringR(readBytes, env);
            }

            base64ReadBufferRemainderBytes = ZVal.getNull();
            bytesLength = function_strlen.f.env(env).call(streamTheseBytes).value();
            if (ZVal.strictEqualityCheck(0, "===", bytesLength)) {
                break;
            }

            if (!ZVal.isTrue(atEOF)) {
                excessBytes = ZVal.modulus(bytesLength, 3);
                if (ZVal.strictNotEqualityCheck(0, "!==", excessBytes)) {
                    base64ReadBufferRemainderBytes =
                            function_substr
                                    .f
                                    .env(env)
                                    .call(streamTheseBytes, ZVal.minusSign(excessBytes))
                                    .value();
                    streamTheseBytes =
                            function_substr
                                    .f
                                    .env(env)
                                    .call(
                                            streamTheseBytes,
                                            0,
                                            ZVal.subtract(bytesLength, excessBytes))
                                    .value();
                }
            }

            encoded = NamespaceGlobal.base64_encode.env(env).call(streamTheseBytes).value();
            encodedTransformed = "";
            thisMaxLineLength =
                    ZVal.subtract(ZVal.subtract(maxLineLength, remainder), firstLineOffset);
            runtimeConverterBreakCount = 0;
            while (ZVal.isLessThan(
                    thisMaxLineLength, '<', function_strlen.f.env(env).call(encoded).value())) {
                encodedTransformed =
                        toStringR(encodedTransformed, env)
                                + toStringR(
                                        function_substr
                                                .f
                                                .env(env)
                                                .call(encoded, 0, thisMaxLineLength)
                                                .value(),
                                        env)
                                + "\r\n";
                firstLineOffset = 0;
                encoded = function_substr.f.env(env).call(encoded, thisMaxLineLength).value();
                thisMaxLineLength = ZVal.assign(maxLineLength);
                remainder = 0;
            }

            if (ZVal.isLessThan(
                    0, '<', remainingLength = function_strlen.f.env(env).call(encoded).value())) {
                remainder = ZAssignment.add("+=", remainder, remainingLength);
                encodedTransformed = toStringR(encodedTransformed, env) + toStringR(encoded, env);
                encoded = ZVal.getNull();
            }

            env.callMethod(
                    is,
                    "write",
                    Swift_Mime_ContentEncoder_Base64ContentEncoder.class,
                    encodedTransformed);
            if (ZVal.isTrue(atEOF)) {
                break;
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return "base64";
    }

    public static final Object CONST_class = "Swift_Mime_ContentEncoder_Base64ContentEncoder";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends Swift_Encoder_Base64Encoder.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Mime_ContentEncoder_Base64ContentEncoder")
                    .setLookup(
                            Swift_Mime_ContentEncoder_Base64ContentEncoder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/ContentEncoder/Base64ContentEncoder.php")
                    .addInterface("Swift_Mime_ContentEncoder")
                    .addInterface("Swift_Encoder")
                    .addInterface("Swift_Mime_CharsetObserver")
                    .addExtendsClass("Swift_Encoder_Base64Encoder")
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
