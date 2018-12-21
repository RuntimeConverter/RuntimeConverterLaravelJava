package com.project.convertedCode.globalNamespace.namespaces.Psy.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.Configuration;
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
import com.project.convertedCode.globalNamespace.namespaces.JakubOnderka.namespaces.PhpConsoleHighlighter.classes.Highlighter;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/ConsoleColorFactory.php

*/

public class ConsoleColorFactory extends RuntimeClassBase {

    public Object colorMode = null;

    public ConsoleColorFactory(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ConsoleColorFactory.class) {
            this.__construct(env, args);
        }
    }

    public ConsoleColorFactory(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "colorMode")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object colorMode = assignParameter(args, 0, false);
        this.colorMode = colorMode;
        return null;
    }

    @ConvertedMethod
    public Object getConsoleColor(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(this.colorMode, "===", Configuration.CONST_COLOR_MODE_AUTO)) {
            return ZVal.assign(this.getDefaultConsoleColor(env));

        } else if (ZVal.strictEqualityCheck(
                this.colorMode, "===", Configuration.CONST_COLOR_MODE_FORCED)) {
            return ZVal.assign(this.getForcedConsoleColor(env));

        } else if (ZVal.strictEqualityCheck(
                this.colorMode, "===", Configuration.CONST_COLOR_MODE_DISABLED)) {
            return ZVal.assign(this.getDisabledConsoleColor(env));
        }

        return null;
    }

    @ConvertedMethod
    private Object getDefaultConsoleColor(RuntimeEnv env, Object... args) {
        Object color = null;
        color = new ConsoleColor(env);
        env.callMethod(
                color,
                "addTheme",
                ConsoleColorFactory.class,
                Highlighter.CONST_LINE_NUMBER,
                ZVal.arrayFromList("blue"));
        env.callMethod(
                color,
                "addTheme",
                ConsoleColorFactory.class,
                Highlighter.CONST_TOKEN_KEYWORD,
                ZVal.arrayFromList("yellow"));
        env.callMethod(
                color,
                "addTheme",
                ConsoleColorFactory.class,
                Highlighter.CONST_TOKEN_STRING,
                ZVal.arrayFromList("green"));
        env.callMethod(
                color,
                "addTheme",
                ConsoleColorFactory.class,
                Highlighter.CONST_TOKEN_COMMENT,
                ZVal.arrayFromList("dark_gray"));
        return ZVal.assign(color);
    }

    @ConvertedMethod
    private Object getForcedConsoleColor(RuntimeEnv env, Object... args) {
        Object color = null;
        color = this.getDefaultConsoleColor(env);
        env.callMethod(color, "setForceStyle", ConsoleColorFactory.class, true);
        return ZVal.assign(color);
    }

    @ConvertedMethod
    private Object getDisabledConsoleColor(RuntimeEnv env, Object... args) {
        Object color = null;
        color = new ConsoleColor(env);
        env.callMethod(
                color,
                "addTheme",
                ConsoleColorFactory.class,
                Highlighter.CONST_TOKEN_STRING,
                ZVal.arrayFromList("none"));
        env.callMethod(
                color,
                "addTheme",
                ConsoleColorFactory.class,
                Highlighter.CONST_TOKEN_COMMENT,
                ZVal.arrayFromList("none"));
        env.callMethod(
                color,
                "addTheme",
                ConsoleColorFactory.class,
                Highlighter.CONST_TOKEN_KEYWORD,
                ZVal.arrayFromList("none"));
        env.callMethod(
                color,
                "addTheme",
                ConsoleColorFactory.class,
                Highlighter.CONST_TOKEN_DEFAULT,
                ZVal.arrayFromList("none"));
        env.callMethod(
                color,
                "addTheme",
                ConsoleColorFactory.class,
                Highlighter.CONST_TOKEN_HTML,
                ZVal.arrayFromList("none"));
        env.callMethod(
                color,
                "addTheme",
                ConsoleColorFactory.class,
                Highlighter.CONST_ACTUAL_LINE_MARK,
                ZVal.arrayFromList("none"));
        env.callMethod(
                color,
                "addTheme",
                ConsoleColorFactory.class,
                Highlighter.CONST_LINE_NUMBER,
                ZVal.arrayFromList("none"));
        return ZVal.assign(color);
    }

    public static final Object CONST_class = "Psy\\ConsoleColorFactory";

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
                    .setName("Psy\\ConsoleColorFactory")
                    .setLookup(
                            ConsoleColorFactory.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("colorMode")
                    .setFilename("vendor/psy/psysh/src/ConsoleColorFactory.php")
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
