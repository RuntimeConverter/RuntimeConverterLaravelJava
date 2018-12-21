package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.functions.mb_internal_encoding;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.classes.Swift_Encoder_Base64Encoder;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_HeaderEncoder;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.functions.mb_encode_mimeheader;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/HeaderEncoder/Base64HeaderEncoder.php

*/

public class Swift_Mime_HeaderEncoder_Base64HeaderEncoder extends Swift_Encoder_Base64Encoder
        implements Swift_Mime_HeaderEncoder {

    public Swift_Mime_HeaderEncoder_Base64HeaderEncoder(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Swift_Mime_HeaderEncoder_Base64HeaderEncoder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return "B";
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
    @ConvertedParameter(index = 3, name = "charset")
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
        Object charset = assignParameter(args, 3, true);
        if (null == charset) {
            charset = "utf-8";
        }
        Object old = null;
        Object newstring = null;
        if (ZVal.strictEqualityCheck(
                "iso-2022-jp", "===", NamespaceGlobal.strtolower.env(env).call(charset).value())) {
            old = mb_internal_encoding.f.env(env).call().value();
            mb_internal_encoding.f.env(env).call("utf-8");
            newstring =
                    mb_encode_mimeheader
                            .f
                            .env(env)
                            .call(string, charset, this.getName(env), "\r\n")
                            .value();
            mb_internal_encoding.f.env(env).call(old);
            return ZVal.assign(newstring);
        }

        return ZVal.assign(super.encodeString(env, string, firstLineOffset, maxLineLength));
    }

    public static final Object CONST_class = "Swift_Mime_HeaderEncoder_Base64HeaderEncoder";

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
                    .setName("Swift_Mime_HeaderEncoder_Base64HeaderEncoder")
                    .setLookup(
                            Swift_Mime_HeaderEncoder_Base64HeaderEncoder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/HeaderEncoder/Base64HeaderEncoder.php")
                    .addInterface("Swift_Mime_HeaderEncoder")
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
