package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_ContentEncoder;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/ContentEncoder/NativeQpContentEncoder.php

*/

public class Swift_Mime_ContentEncoder_NativeQpContentEncoder extends RuntimeClassBase
        implements Swift_Mime_ContentEncoder {

    public Object charset = null;

    public Swift_Mime_ContentEncoder_NativeQpContentEncoder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Mime_ContentEncoder_NativeQpContentEncoder.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Mime_ContentEncoder_NativeQpContentEncoder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "charset",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object charset = assignParameter(args, 0, true);
        if (null == charset) {
            charset = ZVal.getNull();
        }
        this.charset = ZVal.isTrue(charset) ? charset : "utf-8";
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "charset")
    public Object charsetChanged(RuntimeEnv env, Object... args) {
        Object charset = assignParameter(args, 0, false);
        this.charset = charset;
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
        Object string = null;
        Object bytes = null;
        if (ZVal.strictNotEqualityCheck("utf-8", "!==", this.charset)) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Charset \"%s\" not supported. NativeQpContentEncoder only supports \"utf-8\"",
                                            this.charset)
                                    .value()));
        }

        string = "";
        while (ZVal.strictNotEqualityCheck(
                false,
                "!==",
                bytes =
                        env.callMethod(
                                os,
                                "read",
                                Swift_Mime_ContentEncoder_NativeQpContentEncoder.class,
                                8192))) {
            string = toStringR(string, env) + toStringR(bytes, env);
        }

        env.callMethod(
                is,
                "write",
                Swift_Mime_ContentEncoder_NativeQpContentEncoder.class,
                this.encodeString(env, string));
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
        if (ZVal.strictNotEqualityCheck("utf-8", "!==", this.charset)) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Charset \"%s\" not supported. NativeQpContentEncoder only supports \"utf-8\"",
                                            this.charset)
                                    .value()));
        }

        return ZVal.assign(
                this.standardize(
                        env,
                        NamespaceGlobal.quoted_printable_encode.env(env).call(string).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    protected Object standardize(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object string = assignParameter(args, 0, false);
        string =
                function_preg_replace
                        .f
                        .env(env)
                        .call("~=0D(?!=0A)|(?<!=0D)=0A~", "=0D=0A", string)
                        .value();
        string =
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                ZVal.arrayFromList("\t=0D=0A", " =0D=0A", "=0D=0A"),
                                ZVal.arrayFromList("=09\r\n", "=20\r\n", "\r\n"),
                                string)
                        .value();
        switch (ZVal.toInt(
                NamespaceGlobal.ord
                        .env(env)
                        .call(function_substr.f.env(env).call(string, -1).value())
                        .value())) {
            case 9:
                string = NamespaceGlobal.substr_replace.env(env).call(string, "=09", -1).value();
                break;
            case 32:
                string = NamespaceGlobal.substr_replace.env(env).call(string, "=20", -1).value();
                break;
        }
        ;
        return ZVal.assign(string);
    }

    public static final Object CONST_class = "Swift_Mime_ContentEncoder_NativeQpContentEncoder";

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
                    .setName("Swift_Mime_ContentEncoder_NativeQpContentEncoder")
                    .setLookup(
                            Swift_Mime_ContentEncoder_NativeQpContentEncoder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("charset")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/ContentEncoder/NativeQpContentEncoder.php")
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
