package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.namespaces.Formatter.classes.PassthroughFormatter;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Webmozart.namespaces.Assert.classes.Assert;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/reflection-docblock/src/DocBlock/Serializer.php

*/

public class Serializer extends RuntimeClassBase {

    public Object indentString = " ";

    public Object indent = 0;

    public Object isFirstLineIndented = true;

    public Object lineLength = ZVal.getNull();

    public Object tagFormatter = ZVal.getNull();

    public Serializer(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Serializer.class) {
            this.__construct(env, args);
        }
    }

    public Serializer(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "indent", defaultValue = "0", defaultValueType = "number")
    @ConvertedParameter(index = 1, name = "indentString")
    @ConvertedParameter(
        index = 2,
        name = "indentFirstLine",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "lineLength",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "tagFormatter",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object indent = assignParameter(args, 0, true);
        if (null == indent) {
            indent = 0;
        }
        Object indentString = assignParameter(args, 1, true);
        if (null == indentString) {
            indentString = " ";
        }
        Object indentFirstLine = assignParameter(args, 2, true);
        if (null == indentFirstLine) {
            indentFirstLine = true;
        }
        Object lineLength = assignParameter(args, 3, true);
        if (null == lineLength) {
            lineLength = ZVal.getNull();
        }
        Object tagFormatter = assignParameter(args, 4, true);
        if (null == tagFormatter) {
            tagFormatter = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        Assert.runtimeStaticObject.integer(env, indent);
        Assert.runtimeStaticObject.string(env, indentString);
        Assert.runtimeStaticObject._pBoolean(env, indentFirstLine);
        Assert.runtimeStaticObject.callUnknownStaticMethod(
                env, "nullOrInteger", new RuntimeArgsWithReferences(), lineLength);
        Assert.runtimeStaticObject.callUnknownStaticMethod(
                env,
                "nullOrIsInstanceOf",
                new RuntimeArgsWithReferences(),
                tagFormatter,
                "phpDocumentor\\Reflection\\DocBlock\\Tags\\Formatter");
        this.indent = indent;
        this.indentString = indentString;
        this.isFirstLineIndented = indentFirstLine;
        this.lineLength = lineLength;
        this.tagFormatter =
                ZVal.isTrue(ternaryExpressionTemp = tagFormatter)
                        ? ternaryExpressionTemp
                        : new PassthroughFormatter(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "docblock",
        typeHint = "phpDocumentor\\Reflection\\DocBlock"
    )
    public Object getDocComment(RuntimeEnv env, Object... args) {
        Object docblock = assignParameter(args, 0, false);
        Object indent = null;
        Object comment = null;
        Object text = null;
        Object firstIndent = null;
        Object wrapLength = null;
        indent = function_str_repeat.f.env(env).call(this.indentString, this.indent).value();
        firstIndent = ZVal.assign(ZVal.isTrue(this.isFirstLineIndented) ? indent : "");
        wrapLength =
                ZVal.assign(
                        ZVal.isTrue(this.lineLength)
                                ? ZVal.subtract(
                                        ZVal.subtract(
                                                this.lineLength,
                                                function_strlen.f.env(env).call(indent).value()),
                                        3)
                                : ZVal.getNull());
        text =
                this.removeTrailingSpaces(
                        env,
                        indent,
                        this.addAsterisksForEachLine(
                                env,
                                indent,
                                this.getSummaryAndDescriptionTextBlock(env, docblock, wrapLength)));
        comment = ZVal.assign(toStringR(firstIndent, env) + "/**\n");
        if (ZVal.isTrue(text)) {
            comment =
                    toStringR(comment, env)
                            + toStringR(
                                    toStringR(indent, env) + " * " + toStringR(text, env) + "\n",
                                    env);
            comment = toStringR(comment, env) + toStringR(toStringR(indent, env) + " *\n", env);
        }

        comment = this.addTagBlock(env, docblock, wrapLength, indent, comment);
        comment = toStringR(comment, env) + toStringR(indent, env) + " */";
        return ZVal.assign(comment);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "indent")
    @ConvertedParameter(index = 1, name = "text")
    private Object removeTrailingSpaces(RuntimeEnv env, Object... args) {
        Object indent = assignParameter(args, 0, false);
        Object text = assignParameter(args, 1, false);
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                "\n" + toStringR(indent, env) + " * \n",
                                "\n" + toStringR(indent, env) + " *\n",
                                text)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "indent")
    @ConvertedParameter(index = 1, name = "text")
    private Object addAsterisksForEachLine(RuntimeEnv env, Object... args) {
        Object indent = assignParameter(args, 0, false);
        Object text = assignParameter(args, 1, false);
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call("\n", "\n" + toStringR(indent, env) + " * ", text)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "docblock",
        typeHint = "phpDocumentor\\Reflection\\DocBlock"
    )
    @ConvertedParameter(index = 1, name = "wrapLength")
    private Object getSummaryAndDescriptionTextBlock(RuntimeEnv env, Object... args) {
        Object docblock = assignParameter(args, 0, false);
        Object wrapLength = assignParameter(args, 1, false);
        Object text = null;
        text =
                toStringR(env.callMethod(docblock, "getSummary", Serializer.class), env)
                        + toStringR(
                                ZVal.isTrue(
                                                toStringR(
                                                        env.callMethod(
                                                                docblock,
                                                                "getDescription",
                                                                Serializer.class),
                                                        env))
                                        ? "\n\n"
                                                + toStringR(
                                                        env.callMethod(
                                                                docblock,
                                                                "getDescription",
                                                                Serializer.class),
                                                        env)
                                        : "",
                                env);
        if (ZVal.strictNotEqualityCheck(wrapLength, "!==", ZVal.getNull())) {
            text = NamespaceGlobal.wordwrap.env(env).call(text, wrapLength).value();
            return ZVal.assign(text);
        }

        return ZVal.assign(text);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "docblock",
        typeHint = "phpDocumentor\\Reflection\\DocBlock"
    )
    @ConvertedParameter(index = 1, name = "wrapLength")
    @ConvertedParameter(index = 2, name = "indent")
    @ConvertedParameter(index = 3, name = "comment")
    private Object addTagBlock(RuntimeEnv env, Object... args) {
        Object docblock = assignParameter(args, 0, false);
        Object wrapLength = assignParameter(args, 1, false);
        Object indent = assignParameter(args, 2, false);
        Object comment = assignParameter(args, 3, false);
        Object tagText = null;
        Object tag = null;
        for (ZPair zpairResult928 :
                ZVal.getIterable(
                        env.callMethod(docblock, "getTags", Serializer.class), env, true)) {
            tag = ZVal.assign(zpairResult928.getValue());
            tagText = env.callMethod(this.tagFormatter, "format", Serializer.class, tag);
            if (ZVal.strictNotEqualityCheck(wrapLength, "!==", ZVal.getNull())) {
                tagText = NamespaceGlobal.wordwrap.env(env).call(tagText, wrapLength).value();
            }

            tagText =
                    function_str_replace
                            .f
                            .env(env)
                            .call("\n", "\n" + toStringR(indent, env) + " * ", tagText)
                            .value();
            comment =
                    toStringR(comment, env)
                            + toStringR(
                                    toStringR(indent, env) + " * " + toStringR(tagText, env) + "\n",
                                    env);
        }

        return ZVal.assign(comment);
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\DocBlock\\Serializer";

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
                    .setName("phpDocumentor\\Reflection\\DocBlock\\Serializer")
                    .setLookup(
                            Serializer.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "indent",
                            "indentString",
                            "isFirstLineIndented",
                            "lineLength",
                            "tagFormatter")
                    .setFilename(
                            "vendor/phpdocumentor/reflection-docblock/src/DocBlock/Serializer.php")
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
