package com.project.convertedCode.globalNamespace.namespaces.JakubOnderka.namespaces.PhpConsoleHighlighter.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.nativeFunctions.array.function_key;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/jakub-onderka/php-console-highlighter/src/JakubOnderka/PhpConsoleHighlighter/Highlighter.php

*/

public class Highlighter extends RuntimeClassBase {

    public Object color = null;

    public Object defaultTheme =
            ZVal.newArray(
                    new ZPair(CONST_TOKEN_STRING, "red"),
                    new ZPair(CONST_TOKEN_COMMENT, "yellow"),
                    new ZPair(CONST_TOKEN_KEYWORD, "green"),
                    new ZPair(CONST_TOKEN_DEFAULT, "default"),
                    new ZPair(CONST_TOKEN_HTML, "cyan"),
                    new ZPair(CONST_ACTUAL_LINE_MARK, "red"),
                    new ZPair(CONST_LINE_NUMBER, "dark_gray"));

    public Highlighter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Highlighter.class) {
            this.__construct(env, args);
        }
    }

    public Highlighter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "color",
        typeHint = "JakubOnderka\\PhpConsoleColor\\ConsoleColor"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object color = assignParameter(args, 0, false);
        Object name = null;
        Object styles = null;
        this.color = color;
        for (ZPair zpairResult183 : ZVal.getIterable(this.defaultTheme, env, false)) {
            name = ZVal.assign(zpairResult183.getKey());
            styles = ZVal.assign(zpairResult183.getValue());
            if (!ZVal.isTrue(env.callMethod(this.color, "hasTheme", Highlighter.class, name))) {
                env.callMethod(this.color, "addTheme", Highlighter.class, name, styles);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "source")
    @ConvertedParameter(index = 1, name = "lineNumber")
    @ConvertedParameter(
        index = 2,
        name = "linesBefore",
        defaultValue = "2",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 3,
        name = "linesAfter",
        defaultValue = "2",
        defaultValueType = "number"
    )
    public Object getCodeSnippet(RuntimeEnv env, Object... args) {
        Object source = assignParameter(args, 0, false);
        Object lineNumber = assignParameter(args, 1, false);
        Object linesBefore = assignParameter(args, 2, true);
        if (null == linesBefore) {
            linesBefore = 2;
        }
        Object linesAfter = assignParameter(args, 3, true);
        if (null == linesAfter) {
            linesAfter = 2;
        }
        Object preserveKeys = null;
        Object offset = null;
        Object length = null;
        Object lines = null;
        Object tokenLines = null;
        tokenLines = this.getHighlightedLines(env, source);
        offset = ZVal.subtract(ZVal.subtract(lineNumber, linesBefore), 1);
        offset = NamespaceGlobal.max.env(env).call(offset, 0).value();
        length = ZVal.add(ZVal.add(linesAfter, linesBefore), 1);
        tokenLines =
                function_array_slice
                        .f
                        .env(env)
                        .call(tokenLines, offset, length, preserveKeys = true)
                        .value();
        lines = this.colorLines(env, tokenLines);
        return ZVal.assign(this.lineNumbers(env, lines, lineNumber));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "source")
    public Object getWholeFile(RuntimeEnv env, Object... args) {
        Object source = assignParameter(args, 0, false);
        Object lines = null;
        Object tokenLines = null;
        tokenLines = this.getHighlightedLines(env, source);
        lines = this.colorLines(env, tokenLines);
        return ZVal.assign(NamespaceGlobal.implode.env(env).call("\n", lines).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "source")
    public Object getWholeFileWithLineNumbers(RuntimeEnv env, Object... args) {
        Object source = assignParameter(args, 0, false);
        Object lines = null;
        Object tokenLines = null;
        tokenLines = this.getHighlightedLines(env, source);
        lines = this.colorLines(env, tokenLines);
        return ZVal.assign(this.lineNumbers(env, lines));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "source")
    private Object getHighlightedLines(RuntimeEnv env, Object... args) {
        Object source = assignParameter(args, 0, false);
        Object tokens = null;
        source =
                function_str_replace
                        .f
                        .env(env)
                        .call(ZVal.arrayFromList("\r\n", "\r"), "\n", source)
                        .value();
        tokens = this.tokenize(env, source);
        return ZVal.assign(this.splitToLines(env, tokens));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "source")
    private Object tokenize(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object source = assignParameter(args, 0, false);
        ReferenceContainer output = new BasicReferenceContainer(null);
        Object newType = null;
        Object currentType = null;
        Object tokens = null;
        Object buffer = null;
        ReferenceContainer token = new BasicReferenceContainer(null);
        tokens = NamespaceGlobal.token_get_all.env(env).call(source).value();
        output.setObject(ZVal.newArray());
        currentType = ZVal.getNull();
        buffer = "";
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult184 : ZVal.getIterable(tokens, env, true)) {
            token.setObject(ZVal.assign(zpairResult184.getValue()));
            if (function_is_array.f.env(env).call(token.getObject()).getBool()) {
                SwitchEnumType19 switchVariable19 =
                        ZVal.getEnum(
                                token.arrayGet(env, 0),
                                SwitchEnumType19.DEFAULT_CASE,
                                SwitchEnumType19.DYNAMIC_TYPE_63,
                                321,
                                SwitchEnumType19.DYNAMIC_TYPE_64,
                                377,
                                SwitchEnumType19.DYNAMIC_TYPE_65,
                                378,
                                SwitchEnumType19.DYNAMIC_TYPE_66,
                                322,
                                SwitchEnumType19.DYNAMIC_TYPE_67,
                                323,
                                SwitchEnumType19.DYNAMIC_TYPE_68,
                                382,
                                SwitchEnumType19.DYNAMIC_TYPE_69,
                                379,
                                SwitchEnumType19.DYNAMIC_TYPE_70,
                                380,
                                SwitchEnumType19.DYNAMIC_TYPE_71,
                                381,
                                SwitchEnumType19.DYNAMIC_TYPE_72,
                                319,
                                SwitchEnumType19.DYNAMIC_TYPE_73,
                                320,
                                SwitchEnumType19.DYNAMIC_TYPE_74,
                                372,
                                SwitchEnumType19.DYNAMIC_TYPE_75,
                                371,
                                SwitchEnumType19.DYNAMIC_TYPE_76,
                                375,
                                SwitchEnumType19.DYNAMIC_TYPE_77,
                                318,
                                SwitchEnumType19.DYNAMIC_TYPE_78,
                                317,
                                SwitchEnumType19.DYNAMIC_TYPE_79,
                                389,
                                SwitchEnumType19.DYNAMIC_TYPE_80,
                                370,
                                SwitchEnumType19.DYNAMIC_TYPE_81,
                                373,
                                SwitchEnumType19.DYNAMIC_TYPE_82,
                                376);
                switch (switchVariable19) {
                    case DYNAMIC_TYPE_63:
                        newType = ZVal.assign(CONST_TOKEN_HTML);
                        break;
                    case DYNAMIC_TYPE_64:
                    case DYNAMIC_TYPE_65:
                        newType = ZVal.assign(CONST_TOKEN_COMMENT);
                        break;
                    case DYNAMIC_TYPE_66:
                    case DYNAMIC_TYPE_67:
                        newType = ZVal.assign(CONST_TOKEN_STRING);
                        break;
                    case DYNAMIC_TYPE_68:
                        break;
                    case DYNAMIC_TYPE_69:
                    case DYNAMIC_TYPE_70:
                    case DYNAMIC_TYPE_71:
                    case DYNAMIC_TYPE_72:
                    case DYNAMIC_TYPE_73:
                    case DYNAMIC_TYPE_74:
                    case DYNAMIC_TYPE_75:
                    case DYNAMIC_TYPE_76:
                    case DYNAMIC_TYPE_77:
                    case DYNAMIC_TYPE_78:
                    case DYNAMIC_TYPE_79:
                    case DYNAMIC_TYPE_80:
                    case DYNAMIC_TYPE_81:
                    case DYNAMIC_TYPE_82:
                        newType = ZVal.assign(CONST_TOKEN_DEFAULT);
                        break;
                    case DEFAULT_CASE:
                        if (ZVal.toBool(function_defined.f.env(env).call("T_TRAIT_C").value())
                                && ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                token.arrayGet(env, 0), "===", 374))) {
                            newType = ZVal.assign(CONST_TOKEN_DEFAULT);

                        } else {
                            newType = ZVal.assign(CONST_TOKEN_KEYWORD);
                        }
                }
                ;

            } else {
                newType =
                        ZVal.assign(
                                ZVal.strictEqualityCheck(token.getObject(), "===", "\"")
                                        ? CONST_TOKEN_STRING
                                        : CONST_TOKEN_KEYWORD);
            }

            if (ZVal.strictEqualityCheck(currentType, "===", ZVal.getNull())) {
                currentType = ZVal.assign(newType);
            }

            if (ZVal.notEqualityCheck(currentType, newType)) {
                output.arrayAppend(env)
                        .set(ZVal.newArray(new ZPair(0, currentType), new ZPair(1, buffer)));
                buffer = "";
                currentType = ZVal.assign(newType);
            }

            buffer =
                    toStringR(buffer, env)
                            + toStringR(
                                    function_is_array.f.env(env).call(token.getObject()).getBool()
                                            ? token.arrayGet(env, 1)
                                            : token.getObject(),
                                    env);
        }

        if (ZVal.isset(newType)) {
            output.arrayAppend(env).set(ZVal.newArray(new ZPair(0, newType), new ZPair(1, buffer)));
        }

        return ZVal.assign(output.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens", typeHint = "array")
    private Object splitToLines(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object tokens = assignParameter(args, 0, false);
        ReferenceContainer line = new BasicReferenceContainer(null);
        Object tokenLine = null;
        Object count = null;
        ReferenceContainer lines = new BasicReferenceContainer(null);
        ReferenceContainer token = new BasicReferenceContainer(null);
        lines.setObject(ZVal.newArray());
        line.setObject(ZVal.newArray());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult185 : ZVal.getIterable(tokens, env, true)) {
            token.setObject(ZVal.assign(zpairResult185.getValue()));
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult186 :
                    ZVal.getIterable(
                            function_explode.f.env(env).call("\n", token.arrayGet(env, 1)).value(),
                            env,
                            false)) {
                count = ZVal.assign(zpairResult186.getKey());
                tokenLine = ZVal.assign(zpairResult186.getValue());
                if (ZVal.isGreaterThan(count, '>', 0)) {
                    lines.arrayAppend(env).set(line.getObject());
                    line.setObject(ZVal.newArray());
                }

                if (ZVal.strictEqualityCheck(tokenLine, "===", "")) {
                    continue;
                }

                line.arrayAppend(env)
                        .set(
                                ZVal.newArray(
                                        new ZPair(0, token.arrayGet(env, 0)),
                                        new ZPair(1, tokenLine)));
            }
        }

        lines.arrayAppend(env).set(line.getObject());
        return ZVal.assign(lines.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokenLines", typeHint = "array")
    private Object colorLines(RuntimeEnv env, Object... args) {
        Object tokenLines = assignParameter(args, 0, false);
        Object runtimeTempArrayResult7 = null;
        Object line = null;
        Object tokenLine = null;
        ReferenceContainer lines = new BasicReferenceContainer(null);
        Object tokenType = null;
        Object tokenValue = null;
        Object lineCount = null;
        Object token = null;
        lines.setObject(ZVal.newArray());
        for (ZPair zpairResult187 : ZVal.getIterable(tokenLines, env, false)) {
            lineCount = ZVal.assign(zpairResult187.getKey());
            tokenLine = ZVal.assign(zpairResult187.getValue());
            line = "";
            for (ZPair zpairResult188 : ZVal.getIterable(tokenLine, env, true)) {
                token = ZVal.assign(zpairResult188.getValue());
                ZVal.list(
                        runtimeTempArrayResult7 = token,
                        (tokenType = listGet(runtimeTempArrayResult7, 0, env)),
                        (tokenValue = listGet(runtimeTempArrayResult7, 1, env)));
                if (ZVal.isTrue(
                        env.callMethod(this.color, "hasTheme", Highlighter.class, tokenType))) {
                    line =
                            toStringR(line, env)
                                    + toStringR(
                                            env.callMethod(
                                                    this.color,
                                                    "apply",
                                                    Highlighter.class,
                                                    tokenType,
                                                    tokenValue),
                                            env);

                } else {
                    line = toStringR(line, env) + toStringR(tokenValue, env);
                }
            }

            lines.arrayAccess(env, lineCount).set(line);
        }

        return ZVal.assign(lines.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "lines", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "markLine",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    private Object lineNumbers(RuntimeEnv env, Object... args) {
        Object lines = assignParameter(args, 0, false);
        Object markLine = assignParameter(args, 1, true);
        if (null == markLine) {
            markLine = ZVal.getNull();
        }
        Object snippet = null;
        Object lineStrlen = null;
        Object line = null;
        Object i = null;
        function_end.f.env(env).call(lines);
        lineStrlen =
                function_strlen
                        .f
                        .env(env)
                        .call(ZVal.add(function_key.f.env(env).call(lines).value(), 1))
                        .value();
        snippet = "";
        for (ZPair zpairResult189 : ZVal.getIterable(lines, env, false)) {
            i = ZVal.assign(zpairResult189.getKey());
            line = ZVal.assign(zpairResult189.getValue());
            if (ZVal.strictNotEqualityCheck(markLine, "!==", ZVal.getNull())) {
                snippet =
                        toStringR(snippet, env)
                                + toStringR(
                                        ZVal.strictEqualityCheck(markLine, "===", ZVal.add(i, 1))
                                                ? env.callMethod(
                                                        this.color,
                                                        "apply",
                                                        Highlighter.class,
                                                        CONST_ACTUAL_LINE_MARK,
                                                        "  > ")
                                                : "    ",
                                        env);
            }

            snippet =
                    toStringR(snippet, env)
                            + toStringR(
                                    env.callMethod(
                                            this.color,
                                            "apply",
                                            Highlighter.class,
                                            CONST_LINE_NUMBER,
                                            toStringR(
                                                            NamespaceGlobal.str_pad
                                                                    .env(env)
                                                                    .call(
                                                                            ZVal.add(i, 1),
                                                                            lineStrlen,
                                                                            " ",
                                                                            0)
                                                                    .value(),
                                                            env)
                                                    + "| "),
                                    env);
            snippet = toStringR(snippet, env) + toStringR(line, env) + toStringR("\n", env);
        }

        return ZVal.assign(snippet);
    }

    public static final Object CONST_TOKEN_DEFAULT = "token_default";

    public static final Object CONST_TOKEN_COMMENT = "token_comment";

    public static final Object CONST_TOKEN_STRING = "token_string";

    public static final Object CONST_TOKEN_HTML = "token_html";

    public static final Object CONST_TOKEN_KEYWORD = "token_keyword";

    public static final Object CONST_ACTUAL_LINE_MARK = "actual_line_mark";

    public static final Object CONST_LINE_NUMBER = "line_number";

    public static final Object CONST_class = "JakubOnderka\\PhpConsoleHighlighter\\Highlighter";

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
                    .setName("JakubOnderka\\PhpConsoleHighlighter\\Highlighter")
                    .setLookup(
                            Highlighter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("color", "defaultTheme")
                    .setFilename(
                            "vendor/jakub-onderka/php-console-highlighter/src/JakubOnderka/PhpConsoleHighlighter/Highlighter.php")
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

    private enum SwitchEnumType19 {
        DYNAMIC_TYPE_63,
        DYNAMIC_TYPE_64,
        DYNAMIC_TYPE_65,
        DYNAMIC_TYPE_66,
        DYNAMIC_TYPE_67,
        DYNAMIC_TYPE_68,
        DYNAMIC_TYPE_69,
        DYNAMIC_TYPE_70,
        DYNAMIC_TYPE_71,
        DYNAMIC_TYPE_72,
        DYNAMIC_TYPE_73,
        DYNAMIC_TYPE_74,
        DYNAMIC_TYPE_75,
        DYNAMIC_TYPE_76,
        DYNAMIC_TYPE_77,
        DYNAMIC_TYPE_78,
        DYNAMIC_TYPE_79,
        DYNAMIC_TYPE_80,
        DYNAMIC_TYPE_81,
        DYNAMIC_TYPE_82,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
