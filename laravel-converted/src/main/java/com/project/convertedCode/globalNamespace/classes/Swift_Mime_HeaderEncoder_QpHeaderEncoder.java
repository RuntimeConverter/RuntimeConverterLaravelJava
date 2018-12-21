package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.array.function_range;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.classes.Swift_Encoder_QpEncoder;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_HeaderEncoder;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/HeaderEncoder/QpHeaderEncoder.php

*/

public class Swift_Mime_HeaderEncoder_QpHeaderEncoder extends Swift_Encoder_QpEncoder
        implements Swift_Mime_HeaderEncoder {

    public Swift_Mime_HeaderEncoder_QpHeaderEncoder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Mime_HeaderEncoder_QpHeaderEncoder.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Mime_HeaderEncoder_QpHeaderEncoder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "charStream", typeHint = "Swift_CharacterStream")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object charStream = assignParameter(args, 0, false);
        super.__construct(env, charStream);
        return null;
    }

    @ConvertedMethod
    protected Object initSafeMap(RuntimeEnv env, Object... args) {
        Object _pByte = null;
        for (ZPair zpairResult1526 :
                ZVal.getIterable(
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        function_range.f.env(env).call(97, 122).value(),
                                        function_range.f.env(env).call(65, 90).value(),
                                        function_range.f.env(env).call(48, 57).value(),
                                        ZVal.arrayFromList(32, 33, 42, 43, 45, 47))
                                .value(),
                        env,
                        true)) {
            _pByte = ZVal.assign(zpairResult1526.getValue());
            new ReferenceClassProperty(this, "safeMap", env)
                    .arrayAccess(env, _pByte)
                    .set(NamespaceGlobal.chr.env(env).call(_pByte).value());
        }

        return null;
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return "Q";
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
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                ZVal.arrayFromList(" ", "=20", "=\r\n"),
                                ZVal.arrayFromList("_", "_", "\r\n"),
                                super.encodeString(env, string, firstLineOffset, maxLineLength))
                        .value());
    }

    public static final Object CONST_class = "Swift_Mime_HeaderEncoder_QpHeaderEncoder";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends Swift_Encoder_QpEncoder.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Mime_HeaderEncoder_QpHeaderEncoder")
                    .setLookup(
                            Swift_Mime_HeaderEncoder_QpHeaderEncoder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("charStream", "filter", "safeMap")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/HeaderEncoder/QpHeaderEncoder.php")
                    .addInterface("Swift_Mime_HeaderEncoder")
                    .addInterface("Swift_Encoder")
                    .addInterface("Swift_Mime_CharsetObserver")
                    .addExtendsClass("Swift_Encoder_QpEncoder")
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
