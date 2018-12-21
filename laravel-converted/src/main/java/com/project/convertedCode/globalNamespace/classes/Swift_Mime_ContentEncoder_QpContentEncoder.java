package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_ContentEncoder;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.classes.Swift_Encoder_QpEncoder;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/ContentEncoder/QpContentEncoder.php

*/

public class Swift_Mime_ContentEncoder_QpContentEncoder extends Swift_Encoder_QpEncoder
        implements Swift_Mime_ContentEncoder {

    public Object dotEscape = null;

    public Swift_Mime_ContentEncoder_QpContentEncoder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Mime_ContentEncoder_QpContentEncoder.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Mime_ContentEncoder_QpContentEncoder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "charStream", typeHint = "Swift_CharacterStream")
    @ConvertedParameter(
        index = 1,
        name = "filter",
        typeHint = "Swift_StreamFilter",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "dotEscape",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object charStream = assignParameter(args, 0, false);
        Object filter = assignParameter(args, 1, true);
        if (null == filter) {
            filter = ZVal.getNull();
        }
        Object dotEscape = assignParameter(args, 2, true);
        if (null == dotEscape) {
            dotEscape = false;
        }
        this.dotEscape = dotEscape;
        super.__construct(env, charStream, filter);
        return null;
    }

    @ConvertedMethod
    public Object __sleep(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.arrayFromList("charStream", "filter", "dotEscape"));
    }

    @ConvertedMethod
    protected Object getSafeMapShareId(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(function_get_class.f.env(env).call(this).value(), env)
                        + toStringR(ZVal.isTrue(this.dotEscape) ? ".dotEscape" : "", env));
    }

    @ConvertedMethod
    protected Object initSafeMap(RuntimeEnv env, Object... args) {
        super.initSafeMap(env);
        if (ZVal.isTrue(this.dotEscape)) {
            arrayActionR(
                    ArrayAction.UNSET, new ReferenceClassProperty(this, "safeMap", env), env, 46);
        }

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
        Object newLineLength = null;
        Object b = null;
        Object thisLineLength = null;
        Object prepend = null;
        Object i = null;
        Object lineLen = null;
        ReferenceContainer size = new BasicReferenceContainer(null);
        Object moreBytes = null;
        ReferenceContainer bytes = new BasicReferenceContainer(null);
        Object enc = null;
        Object currentLine = null;
        if (ZVal.toBool(ZVal.isGreaterThan(maxLineLength, '>', 76))
                || ZVal.toBool(ZVal.isLessThanOrEqualTo(maxLineLength, "<=", 0))) {
            maxLineLength = 76;
        }

        thisLineLength = ZVal.subtract(maxLineLength, firstLineOffset);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("charStream").value(),
                "flushContents",
                Swift_Mime_ContentEncoder_QpContentEncoder.class);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("charStream").value(),
                "importByteStream",
                Swift_Mime_ContentEncoder_QpContentEncoder.class,
                os);
        currentLine = "";
        prepend = "";
        size.setObject(ZVal.assign(lineLen = 0));
        runtimeConverterBreakCount = 0;
        while (ZVal.strictNotEqualityCheck(
                false,
                "!==",
                bytes.setObject(
                        env.callMethod(
                                this,
                                "nextSequence",
                                Swift_Mime_ContentEncoder_QpContentEncoder.class)))) {
            if (ZVal.isset(toObjectR(this).accessProp(this, env).name("filter").value())) {
                runtimeConverterBreakCount = 0;
                while (ZVal.isTrue(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("filter").value(),
                                "shouldBuffer",
                                Swift_Mime_ContentEncoder_QpContentEncoder.class,
                                bytes.getObject()))) {
                    if (ZVal.strictEqualityCheck(
                            false,
                            "===",
                            moreBytes =
                                    env.callMethod(
                                            this,
                                            "nextSequence",
                                            Swift_Mime_ContentEncoder_QpContentEncoder.class,
                                            1))) {
                        break;
                    }

                    runtimeConverterBreakCount = 0;
                    for (ZPair zpairResult1525 : ZVal.getIterable(moreBytes, env, true)) {
                        b = ZVal.assign(zpairResult1525.getValue());
                        bytes.arrayAppend(env).set(b);
                    }
                }

                bytes.setObject(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("filter").value(),
                                "filter",
                                Swift_Mime_ContentEncoder_QpContentEncoder.class,
                                bytes.getObject()));
            }

            enc =
                    env.callMethod(
                            this,
                            new RuntimeArgsWithReferences().add(1, size),
                            "encodeByteSequence",
                            Swift_Mime_ContentEncoder_QpContentEncoder.class,
                            bytes.getObject(),
                            size.getObject());
            i = function_strpos.f.env(env).call(enc, "=0D=0A").value();
            newLineLength =
                    ZVal.add(
                            lineLen,
                            ZVal.strictEqualityCheck(false, "===", i) ? size.getObject() : i);
            if (ZVal.toBool(currentLine)
                    && ZVal.toBool(
                            ZVal.isGreaterThanOrEqualTo(newLineLength, ">=", thisLineLength))) {
                env.callMethod(
                        is,
                        "write",
                        Swift_Mime_ContentEncoder_QpContentEncoder.class,
                        toStringR(prepend, env)
                                + toStringR(
                                        env.callMethod(
                                                this,
                                                "standardize",
                                                Swift_Mime_ContentEncoder_QpContentEncoder.class,
                                                currentLine),
                                        env));
                currentLine = "";
                prepend = "=\r\n";
                thisLineLength = ZVal.assign(maxLineLength);
                lineLen = 0;
            }

            currentLine = toStringR(currentLine, env) + toStringR(enc, env);
            if (ZVal.strictEqualityCheck(false, "===", i)) {
                lineLen = ZAssignment.add("+=", lineLen, size.getObject());

            } else {
                lineLen =
                        ZVal.subtract(
                                ZVal.subtract(
                                        size.getObject(),
                                        NamespaceGlobal.strrpos
                                                .env(env)
                                                .call(enc, "=0D=0A")
                                                .value()),
                                6);
            }
        }

        if (function_strlen.f.env(env).call(currentLine).getBool()) {
            env.callMethod(
                    is,
                    "write",
                    Swift_Mime_ContentEncoder_QpContentEncoder.class,
                    toStringR(prepend, env)
                            + toStringR(
                                    env.callMethod(
                                            this,
                                            "standardize",
                                            Swift_Mime_ContentEncoder_QpContentEncoder.class,
                                            currentLine),
                                    env));
        }

        return null;
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return "quoted-printable";
    }

    public static final Object CONST_class = "Swift_Mime_ContentEncoder_QpContentEncoder";

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
                    .setName("Swift_Mime_ContentEncoder_QpContentEncoder")
                    .setLookup(
                            Swift_Mime_ContentEncoder_QpContentEncoder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("charStream", "dotEscape", "filter", "safeMap")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/ContentEncoder/QpContentEncoder.php")
                    .addInterface("Swift_Mime_ContentEncoder")
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
