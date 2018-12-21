package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_ContentEncoder;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/ContentEncoder/QpContentEncoderProxy.php

*/

public class Swift_Mime_ContentEncoder_QpContentEncoderProxy extends RuntimeClassBase
        implements Swift_Mime_ContentEncoder {

    public Object safeEncoder = null;

    public Object nativeEncoder = null;

    public Object charset = null;

    public Swift_Mime_ContentEncoder_QpContentEncoderProxy(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Mime_ContentEncoder_QpContentEncoderProxy.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Mime_ContentEncoder_QpContentEncoderProxy(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "safeEncoder",
        typeHint = "Swift_Mime_ContentEncoder_QpContentEncoder"
    )
    @ConvertedParameter(
        index = 1,
        name = "nativeEncoder",
        typeHint = "Swift_Mime_ContentEncoder_NativeQpContentEncoder"
    )
    @ConvertedParameter(index = 2, name = "charset")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object safeEncoder = assignParameter(args, 0, false);
        Object nativeEncoder = assignParameter(args, 1, false);
        Object charset = assignParameter(args, 2, false);
        this.safeEncoder = safeEncoder;
        this.nativeEncoder = nativeEncoder;
        this.charset = charset;
        return null;
    }

    @ConvertedMethod
    public Object __clone(RuntimeEnv env, Object... args) {
        this.safeEncoder = ((RuntimeClassInterface) this.safeEncoder).phpClone(env);
        this.nativeEncoder = ((RuntimeClassInterface) this.nativeEncoder).phpClone(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "charset")
    public Object charsetChanged(RuntimeEnv env, Object... args) {
        Object charset = assignParameter(args, 0, false);
        this.charset = charset;
        env.callMethod(
                this.safeEncoder,
                "charsetChanged",
                Swift_Mime_ContentEncoder_QpContentEncoderProxy.class,
                charset);
        return null;
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
        env.callMethod(
                this.getEncoder(env),
                "encodeByteStream",
                Swift_Mime_ContentEncoder_QpContentEncoderProxy.class,
                os,
                is,
                firstLineOffset,
                maxLineLength);
        return null;
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return "quoted-printable";
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
        return ZVal.assign(
                env.callMethod(
                        this.getEncoder(env),
                        "encodeString",
                        Swift_Mime_ContentEncoder_QpContentEncoderProxy.class,
                        string,
                        firstLineOffset,
                        maxLineLength));
    }

    @ConvertedMethod
    private Object getEncoder(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck("utf-8", "===", this.charset)
                        ? this.nativeEncoder
                        : this.safeEncoder);
    }

    public static final Object CONST_class = "Swift_Mime_ContentEncoder_QpContentEncoderProxy";

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
                    .setName("Swift_Mime_ContentEncoder_QpContentEncoderProxy")
                    .setLookup(
                            Swift_Mime_ContentEncoder_QpContentEncoderProxy.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("charset", "nativeEncoder", "safeEncoder")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/ContentEncoder/QpContentEncoderProxy.php")
                    .addInterface("Swift_Mime_ContentEncoder")
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
