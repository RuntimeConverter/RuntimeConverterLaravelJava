package com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Comment.classes.Doc;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeInterfaces.JsonSerializable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Comment.php

*/

public class Comment extends RuntimeClassBase implements JsonSerializable {

    public Object text = null;

    public Object line = null;

    public Object filePos = null;

    public Object tokenPos = null;

    public Comment(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Comment.class) {
            this.__construct(env, args);
        }
    }

    public Comment(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "text", typeHint = "string")
    @ConvertedParameter(index = 1, name = "startLine", typeHint = "int")
    @ConvertedParameter(index = 2, name = "startFilePos", typeHint = "int")
    @ConvertedParameter(index = 3, name = "startTokenPos", typeHint = "int")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object text = assignParameter(args, 0, false);
        Object startLine = assignParameter(args, 1, true);
        if (null == startLine) {
            startLine = -1;
        }
        Object startFilePos = assignParameter(args, 2, true);
        if (null == startFilePos) {
            startFilePos = -1;
        }
        Object startTokenPos = assignParameter(args, 3, true);
        if (null == startTokenPos) {
            startTokenPos = -1;
        }
        this.text = text;
        this.line = startLine;
        this.filePos = startFilePos;
        this.tokenPos = startTokenPos;
        return null;
    }

    @ConvertedMethod
    public Object getText(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.text);
    }

    @ConvertedMethod
    public Object getLine(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.line);
    }

    @ConvertedMethod
    public Object getFilePos(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.filePos);
    }

    @ConvertedMethod
    public Object getTokenPos(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.tokenPos);
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.text);
    }

    @ConvertedMethod
    public Object getReformattedText(RuntimeEnv env, Object... args) {
        Object newlinePos = null;
        Object prefixLen = null;
        Object text = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        Object removeLen = null;
        text = function_trim.f.env(env).call(this.text).value();
        newlinePos = function_strpos.f.env(env).call(text, "\n").value();
        if (ZVal.strictEqualityCheck(false, "===", newlinePos)) {
            return ZVal.assign(text);

        } else if (function_preg_match
                .f
                .env(env)
                .call("((*BSR_ANYCRLF)(*ANYCRLF)^.*(?:\\R\\s+\\*.*)+$)", text)
                .getBool()) {
            return ZVal.assign(
                    function_preg_replace.f.env(env).call("(^\\s+\\*)m", " *", this.text).value());

        } else if (ZVal.toBool(
                        function_preg_match
                                .f
                                .env(env)
                                .call("(^/\\*\\*?\\s*[\\r\\n])", text)
                                .value())
                && ZVal.toBool(
                        function_preg_match
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                                .call("(\\n(\\s*)\\*/$)", text, matches.getObject())
                                .value())) {
            return ZVal.assign(
                    function_preg_replace
                            .f
                            .env(env)
                            .call(
                                    "(^"
                                            + toStringR(
                                                    NamespaceGlobal.preg_quote
                                                            .env(env)
                                                            .call(matches.arrayGet(env, 1))
                                                            .value(),
                                                    env)
                                            + ")m",
                                    "",
                                    text)
                            .value());

        } else if (function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call("(^/\\*\\*?\\s*(?!\\s))", text, matches.getObject())
                .getBool()) {
            prefixLen =
                    this.getShortestWhitespacePrefixLen(
                            env,
                            function_substr.f.env(env).call(text, ZVal.add(newlinePos, 1)).value());
            removeLen =
                    ZVal.subtract(
                            prefixLen,
                            function_strlen.f.env(env).call(matches.arrayGet(env, 0)).value());
            return ZVal.assign(
                    function_preg_replace
                            .f
                            .env(env)
                            .call("(^\\s{" + toStringR(removeLen, env) + "})m", "", text)
                            .value());
        }

        return ZVal.assign(text);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "str", typeHint = "string")
    private Object getShortestWhitespacePrefixLen(RuntimeEnv env, Object... args) {
        Object str = assignParameter(args, 0, false);
        Object shortestPrefixLen = null;
        Object line = null;
        Object prefixLen = null;
        Object lines = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        lines = function_explode.f.env(env).call("\n", str).value();
        shortestPrefixLen = function_constant.get(env, "INF");
        for (ZPair zpairResult846 : ZVal.getIterable(lines, env, true)) {
            line = ZVal.assign(zpairResult846.getValue());
            function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call("(^\\s*)", line, matches.getObject());
            prefixLen = function_strlen.f.env(env).call(matches.arrayGet(env, 0)).value();
            if (ZVal.isLessThan(prefixLen, '<', shortestPrefixLen)) {
                shortestPrefixLen = ZVal.assign(prefixLen);
            }
        }

        return ZVal.assign(shortestPrefixLen);
    }

    @ConvertedMethod
    public Object jsonSerialize(RuntimeEnv env, Object... args) {
        Object type = null;
        type =
                ZVal.assign(
                        ZVal.isTrue(
                                        ZVal.checkInstanceType(
                                                this, Doc.class, "PhpParser\\Comment\\Doc"))
                                ? "Comment_Doc"
                                : "Comment");
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("nodeType", type),
                        new ZPair("text", this.text),
                        new ZPair("line", this.line),
                        new ZPair("filePos", this.filePos),
                        new ZPair("tokenPos", this.tokenPos)));
    }

    public static final Object CONST_class = "PhpParser\\Comment";

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
                    .setName("PhpParser\\Comment")
                    .setLookup(
                            Comment.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("filePos", "line", "text", "tokenPos")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Comment.php")
                    .addInterface("JsonSerializable")
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
