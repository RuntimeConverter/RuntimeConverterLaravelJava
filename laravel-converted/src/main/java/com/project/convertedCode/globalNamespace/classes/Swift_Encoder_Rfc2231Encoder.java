package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
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
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Encoder/Rfc2231Encoder.php

*/

public class Swift_Encoder_Rfc2231Encoder extends RuntimeClassBase implements Swift_Encoder {

    public Object charStream = null;

    public Swift_Encoder_Rfc2231Encoder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Encoder_Rfc2231Encoder.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Encoder_Rfc2231Encoder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "charStream", typeHint = "Swift_CharacterStream")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object charStream = assignParameter(args, 0, false);
        this.charStream = charStream;
        return null;
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
        Object thisLineLength = null;
        Object encodedChar = null;
        Object _pChar = null;
        ReferenceContainer lines = new BasicReferenceContainer(null);
        ReferenceContainer lineCount = new BasicReferenceContainer(null);
        ReferenceContainer currentLine = new BasicReferenceContainer(null);
        lines.setObject(ZVal.newArray());
        lineCount.setObject(0);
        lines.arrayAppend(env).set("");
        currentLine = new ArrayDimensionReference(lines.getObject(), ZVal.postIncrement(lineCount));
        if (ZVal.isGreaterThanOrEqualTo(0, ">=", maxLineLength)) {
            maxLineLength = 75;
        }

        env.callMethod(this.charStream, "flushContents", Swift_Encoder_Rfc2231Encoder.class);
        env.callMethod(this.charStream, "importString", Swift_Encoder_Rfc2231Encoder.class, string);
        thisLineLength = ZVal.subtract(maxLineLength, firstLineOffset);
        while (ZVal.strictNotEqualityCheck(
                false,
                "!==",
                _pChar =
                        env.callMethod(
                                this.charStream, "read", Swift_Encoder_Rfc2231Encoder.class, 4))) {
            encodedChar = NamespaceGlobal.rawurlencode.env(env).call(_pChar).value();
            if (ZVal.toBool(
                            ZVal.notEqualityCheck(
                                    0,
                                    function_strlen
                                            .f
                                            .env(env)
                                            .call(currentLine.getObject())
                                            .value()))
                    && ZVal.toBool(
                            ZVal.isGreaterThan(
                                    function_strlen
                                            .f
                                            .env(env)
                                            .call(
                                                    toStringR(currentLine.getObject(), env)
                                                            + toStringR(encodedChar, env))
                                            .value(),
                                    '>',
                                    thisLineLength))) {
                lines.arrayAppend(env).set("");
                currentLine =
                        new ArrayDimensionReference(
                                lines.getObject(), ZVal.postIncrement(lineCount));
                thisLineLength = ZVal.assign(maxLineLength);
            }

            currentLine.setObject(
                    toStringR(currentLine.getObject(), env) + toStringR(encodedChar, env));
        }

        return ZVal.assign(
                NamespaceGlobal.implode.env(env).call("\r\n", lines.getObject()).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "charset")
    public Object charsetChanged(RuntimeEnv env, Object... args) {
        Object charset = assignParameter(args, 0, false);
        env.callMethod(
                this.charStream, "setCharacterSet", Swift_Encoder_Rfc2231Encoder.class, charset);
        return null;
    }

    @ConvertedMethod
    public Object __clone(RuntimeEnv env, Object... args) {
        this.charStream = ((RuntimeClassInterface) this.charStream).phpClone(env);
        return null;
    }

    public static final Object CONST_class = "Swift_Encoder_Rfc2231Encoder";

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
                    .setName("Swift_Encoder_Rfc2231Encoder")
                    .setLookup(
                            Swift_Encoder_Rfc2231Encoder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("charStream")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Encoder/Rfc2231Encoder.php")
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
