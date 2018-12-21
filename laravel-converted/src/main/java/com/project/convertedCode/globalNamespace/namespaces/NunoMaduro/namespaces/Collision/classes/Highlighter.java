package com.project.convertedCode.globalNamespace.namespaces.NunoMaduro.namespaces.Collision.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.JakubOnderka.namespaces.PhpConsoleColor.classes.ConsoleColor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nunomaduro/collision/src/Highlighter.php

*/

public class Highlighter
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .JakubOnderka
                .namespaces
                .PhpConsoleHighlighter
                .classes
                .Highlighter
        implements com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .NunoMaduro
                .namespaces
                .Collision
                .namespaces
                .Contracts
                .classes
                .Highlighter {

    public Object theme =
            ZVal.newArray(
                    new ZPair(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .JakubOnderka
                                    .namespaces
                                    .PhpConsoleHighlighter
                                    .classes
                                    .Highlighter
                                    .CONST_TOKEN_STRING,
                            ZVal.arrayFromList("light_gray")),
                    new ZPair(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .JakubOnderka
                                    .namespaces
                                    .PhpConsoleHighlighter
                                    .classes
                                    .Highlighter
                                    .CONST_TOKEN_COMMENT,
                            ZVal.arrayFromList("dark_gray", "italic")),
                    new ZPair(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .JakubOnderka
                                    .namespaces
                                    .PhpConsoleHighlighter
                                    .classes
                                    .Highlighter
                                    .CONST_TOKEN_KEYWORD,
                            ZVal.arrayFromList("yellow")),
                    new ZPair(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .JakubOnderka
                                    .namespaces
                                    .PhpConsoleHighlighter
                                    .classes
                                    .Highlighter
                                    .CONST_TOKEN_DEFAULT,
                            ZVal.arrayFromList("default", "bold")),
                    new ZPair(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .JakubOnderka
                                    .namespaces
                                    .PhpConsoleHighlighter
                                    .classes
                                    .Highlighter
                                    .CONST_TOKEN_HTML,
                            ZVal.arrayFromList("blue", "bold")),
                    new ZPair(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .JakubOnderka
                                    .namespaces
                                    .PhpConsoleHighlighter
                                    .classes
                                    .Highlighter
                                    .CONST_ACTUAL_LINE_MARK,
                            ZVal.arrayFromList("bg_red", "bold")),
                    new ZPair(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .JakubOnderka
                                    .namespaces
                                    .PhpConsoleHighlighter
                                    .classes
                                    .Highlighter
                                    .CONST_LINE_NUMBER,
                            ZVal.arrayFromList("dark_gray", "italic")));

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
        typeHint = "JakubOnderka\\PhpConsoleColor\\ConsoleColor",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object color = assignParameter(args, 0, true);
        if (null == color) {
            color = ZVal.getNull();
        }
        Object name = null;
        Object ternaryExpressionTemp = null;
        Object styles = null;
        super.__construct(
                env,
                color =
                        ZVal.assign(
                                ZVal.isTrue(ternaryExpressionTemp = color)
                                        ? ternaryExpressionTemp
                                        : new ConsoleColor(env)));
        for (ZPair zpairResult909 : ZVal.getIterable(this.theme, env, false)) {
            name = ZVal.assign(zpairResult909.getKey());
            styles = ZVal.assign(zpairResult909.getValue());
            env.callMethod(color, "addTheme", Highlighter.class, name, styles);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content", typeHint = "string")
    @ConvertedParameter(index = 1, name = "line", typeHint = "int")
    public Object highlight(RuntimeEnv env, Object... args) {
        Object content = assignParameter(args, 0, false);
        Object line = assignParameter(args, 1, false);
        return ZVal.assign(
                function_rtrim
                        .f
                        .env(env)
                        .call(
                                env.callMethod(
                                        this,
                                        "getCodeSnippet",
                                        Highlighter.class,
                                        content,
                                        line,
                                        4,
                                        4))
                        .value());
    }

    public static final Object CONST_class = "NunoMaduro\\Collision\\Highlighter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .JakubOnderka
                    .namespaces
                    .PhpConsoleHighlighter
                    .classes
                    .Highlighter
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("NunoMaduro\\Collision\\Highlighter")
                    .setLookup(
                            Highlighter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("color", "defaultTheme", "theme")
                    .setFilename("vendor/nunomaduro/collision/src/Highlighter.php")
                    .addInterface("NunoMaduro\\Collision\\Contracts\\Highlighter")
                    .addExtendsClass("JakubOnderka\\PhpConsoleHighlighter\\Highlighter")
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
