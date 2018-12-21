package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_ContentEncoder;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/ContentEncoder/PlainContentEncoder.php

*/

public class Swift_Mime_ContentEncoder_PlainContentEncoder extends RuntimeClassBase
        implements Swift_Mime_ContentEncoder {

    public Object name = null;

    public Object canonical = null;

    public Swift_Mime_ContentEncoder_PlainContentEncoder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Mime_ContentEncoder_PlainContentEncoder.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Mime_ContentEncoder_PlainContentEncoder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "canonical",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object canonical = assignParameter(args, 1, true);
        if (null == canonical) {
            canonical = false;
        }
        this.name = name;
        this.canonical = canonical;
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
        if (ZVal.isTrue(this.canonical)) {
            string = this.canonicalize(env, string);
        }

        return ZVal.assign(this.safeWordwrap(env, string, maxLineLength, "\r\n"));
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
        Object leftOver = null;
        Object toencode = null;
        Object lastLinePos = null;
        Object bytes = null;
        Object wrapped = null;
        leftOver = "";
        while (ZVal.strictNotEqualityCheck(
                false,
                "!==",
                bytes =
                        env.callMethod(
                                os,
                                "read",
                                Swift_Mime_ContentEncoder_PlainContentEncoder.class,
                                8192))) {
            toencode = toStringR(leftOver, env) + toStringR(bytes, env);
            if (ZVal.isTrue(this.canonical)) {
                toencode = this.canonicalize(env, toencode);
            }

            wrapped = this.safeWordwrap(env, toencode, maxLineLength, "\r\n");
            lastLinePos = NamespaceGlobal.strrpos.env(env).call(wrapped, "\r\n").value();
            leftOver = function_substr.f.env(env).call(wrapped, lastLinePos).value();
            wrapped = function_substr.f.env(env).call(wrapped, 0, lastLinePos).value();
            env.callMethod(
                    is, "write", Swift_Mime_ContentEncoder_PlainContentEncoder.class, wrapped);
        }

        if (function_strlen.f.env(env).call(leftOver).getBool()) {
            env.callMethod(
                    is, "write", Swift_Mime_ContentEncoder_PlainContentEncoder.class, leftOver);
        }

        return null;
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.name);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "charset")
    public Object charsetChanged(RuntimeEnv env, Object... args) {
        Object charset = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    @ConvertedParameter(
        index = 1,
        name = "length",
        defaultValue = "75",
        defaultValueType = "number"
    )
    @ConvertedParameter(index = 2, name = "le")
    private Object safeWordwrap(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        Object length = assignParameter(args, 1, true);
        if (null == length) {
            length = 75;
        }
        Object le = assignParameter(args, 2, true);
        if (null == le) {
            le = "\r\n";
        }
        Object chunks = null;
        Object chunk = null;
        ReferenceContainer lines = new BasicReferenceContainer(null);
        Object originalLines = null;
        ReferenceContainer lineCount = new BasicReferenceContainer(null);
        Object originalLine = null;
        ReferenceContainer currentLine = new BasicReferenceContainer(null);
        if (ZVal.isGreaterThanOrEqualTo(0, ">=", length)) {
            return ZVal.assign(string);
        }

        originalLines = function_explode.f.env(env).call(le, string).value();
        lines.setObject(ZVal.newArray());
        lineCount.setObject(0);
        for (ZPair zpairResult1523 : ZVal.getIterable(originalLines, env, true)) {
            originalLine = ZVal.assign(zpairResult1523.getValue());
            lines.arrayAppend(env).set("");
            currentLine =
                    new ArrayDimensionReference(lines.getObject(), ZVal.postIncrement(lineCount));
            chunks = NamespaceGlobal.preg_split.env(env).call("/(?<=\\s)/", originalLine).value();
            for (ZPair zpairResult1524 : ZVal.getIterable(chunks, env, true)) {
                chunk = ZVal.assign(zpairResult1524.getValue());
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
                                                                + toStringR(chunk, env))
                                                .value(),
                                        '>',
                                        length))) {
                    lines.arrayAppend(env).set("");
                    currentLine =
                            new ArrayDimensionReference(
                                    lines.getObject(), ZVal.postIncrement(lineCount));
                }

                currentLine.setObject(
                        toStringR(currentLine.getObject(), env) + toStringR(chunk, env));
            }
        }

        return ZVal.assign(
                NamespaceGlobal.implode.env(env).call("\r\n", lines.getObject()).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    private Object canonicalize(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                ZVal.arrayFromList("\r\n", "\r", "\n"),
                                ZVal.arrayFromList("\n", "\n", "\r\n"),
                                string)
                        .value());
    }

    public static final Object CONST_class = "Swift_Mime_ContentEncoder_PlainContentEncoder";

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
                    .setName("Swift_Mime_ContentEncoder_PlainContentEncoder")
                    .setLookup(
                            Swift_Mime_ContentEncoder_PlainContentEncoder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("canonical", "name")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/ContentEncoder/PlainContentEncoder.php")
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
