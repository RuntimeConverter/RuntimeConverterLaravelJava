package com.project.convertedCode.globalNamespace.namespaces.JakubOnderka.namespaces.PhpConsoleColor.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.project.convertedCode.globalNamespace.namespaces.JakubOnderka.namespaces.PhpConsoleColor.classes.InvalidStyleException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/jakub-onderka/php-console-color/src/JakubOnderka/PhpConsoleColor/ConsoleColor.php

*/

public class ConsoleColor extends RuntimeClassBase {

    public Object isSupported = null;

    public Object forceStyle = false;

    public Object styles =
            ZVal.newArray(
                    new ZPair("none", ZVal.getNull()),
                    new ZPair("bold", "1"),
                    new ZPair("dark", "2"),
                    new ZPair("italic", "3"),
                    new ZPair("underline", "4"),
                    new ZPair("blink", "5"),
                    new ZPair("reverse", "7"),
                    new ZPair("concealed", "8"),
                    new ZPair("default", "39"),
                    new ZPair("black", "30"),
                    new ZPair("red", "31"),
                    new ZPair("green", "32"),
                    new ZPair("yellow", "33"),
                    new ZPair("blue", "34"),
                    new ZPair("magenta", "35"),
                    new ZPair("cyan", "36"),
                    new ZPair("light_gray", "37"),
                    new ZPair("dark_gray", "90"),
                    new ZPair("light_red", "91"),
                    new ZPair("light_green", "92"),
                    new ZPair("light_yellow", "93"),
                    new ZPair("light_blue", "94"),
                    new ZPair("light_magenta", "95"),
                    new ZPair("light_cyan", "96"),
                    new ZPair("white", "97"),
                    new ZPair("bg_default", "49"),
                    new ZPair("bg_black", "40"),
                    new ZPair("bg_red", "41"),
                    new ZPair("bg_green", "42"),
                    new ZPair("bg_yellow", "43"),
                    new ZPair("bg_blue", "44"),
                    new ZPair("bg_magenta", "45"),
                    new ZPair("bg_cyan", "46"),
                    new ZPair("bg_light_gray", "47"),
                    new ZPair("bg_dark_gray", "100"),
                    new ZPair("bg_light_red", "101"),
                    new ZPair("bg_light_green", "102"),
                    new ZPair("bg_light_yellow", "103"),
                    new ZPair("bg_light_blue", "104"),
                    new ZPair("bg_light_magenta", "105"),
                    new ZPair("bg_light_cyan", "106"),
                    new ZPair("bg_white", "107"));

    public Object themes = ZVal.newArray();

    public ConsoleColor(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ConsoleColor.class) {
            this.__construct(env, args);
        }
    }

    public ConsoleColor(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        this.isSupported = this.isSupported(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "style")
    @ConvertedParameter(index = 1, name = "text")
    public Object apply(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/jakub-onderka/php-console-color/src/JakubOnderka/PhpConsoleColor")
                        .setFile(
                                "/vendor/jakub-onderka/php-console-color/src/JakubOnderka/PhpConsoleColor/ConsoleColor.php");
        Object style = assignParameter(args, 0, false);
        Object text = assignParameter(args, 1, false);
        Object s = null;
        ReferenceContainer sequences = new BasicReferenceContainer(null);
        if (ZVal.toBool(!ZVal.isTrue(this.isStyleForced(env)))
                && ZVal.toBool(!ZVal.isTrue(this.isSupported(env)))) {
            return ZVal.assign(text);
        }

        if (function_is_string.f.env(env).call(style).getBool()) {
            style = ZVal.newArray(new ZPair(0, style));
        }

        if (!function_is_array.f.env(env).call(style).getBool()) {
            throw ZVal.getException(
                    env, new InvalidArgumentException(env, "Style must be string or array."));
        }

        sequences.setObject(ZVal.newArray());
        for (ZPair zpairResult179 : ZVal.getIterable(style, env, true)) {
            s = ZVal.assign(zpairResult179.getValue());
            if (arrayActionR(
                    ArrayAction.ISSET, new ReferenceClassProperty(this, "themes", env), env, s)) {
                sequences.setObject(
                        function_array_merge
                                .f
                                .env(env)
                                .call(sequences.getObject(), this.themeSequence(env, s))
                                .value());

            } else {
                if (ZVal.isTrue(this.isValidStyle(env, s))) {
                    sequences.arrayAppend(env).set(this.styleSequence(env, s));

                } else {
                    throw ZVal.getException(env, new InvalidStyleException(env, s));
                }
            }
        }

        sequences.setObject(
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                sequences.getObject(),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "JakubOnderka\\PhpConsoleColor",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "val")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object val = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                ZVal.strictNotEqualityCheck(
                                                        val, "!==", ZVal.getNull()));
                                    }
                                })
                        .value());
        if (ZVal.isEmpty(sequences.getObject())) {
            return ZVal.assign(text);
        }

        return ZVal.assign(
                toStringR(
                                this.escSequence(
                                        env,
                                        NamespaceGlobal.implode
                                                .env(env)
                                                .call(";", sequences.getObject())
                                                .value()),
                                env)
                        + toStringR(text, env)
                        + toStringR(this.escSequence(env, CONST_RESET_STYLE), env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "forceStyle")
    public Object setForceStyle(RuntimeEnv env, Object... args) {
        Object forceStyle = assignParameter(args, 0, false);
        this.forceStyle = ZVal.toBool(forceStyle);
        return null;
    }

    @ConvertedMethod
    public Object isStyleForced(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.forceStyle);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "themes", typeHint = "array")
    public Object setThemes(RuntimeEnv env, Object... args) {
        Object themes = assignParameter(args, 0, false);
        Object name = null;
        Object styles = null;
        this.themes = ZVal.newArray();
        for (ZPair zpairResult180 : ZVal.getIterable(themes, env, false)) {
            name = ZVal.assign(zpairResult180.getKey());
            styles = ZVal.assign(zpairResult180.getValue());
            this.addTheme(env, name, styles);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "styles")
    public Object addTheme(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object styles = assignParameter(args, 1, false);
        Object style = null;
        if (function_is_string.f.env(env).call(styles).getBool()) {
            styles = ZVal.newArray(new ZPair(0, styles));
        }

        if (!function_is_array.f.env(env).call(styles).getBool()) {
            throw ZVal.getException(
                    env, new InvalidArgumentException(env, "Style must be string or array."));
        }

        for (ZPair zpairResult181 : ZVal.getIterable(styles, env, true)) {
            style = ZVal.assign(zpairResult181.getValue());
            if (!ZVal.isTrue(this.isValidStyle(env, style))) {
                throw ZVal.getException(env, new InvalidStyleException(env, style));
            }
        }

        new ReferenceClassProperty(this, "themes", env).arrayAccess(env, name).set(styles);
        return null;
    }

    @ConvertedMethod
    public Object getThemes(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.themes);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object hasTheme(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "themes", env),
                        env,
                        name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object removeTheme(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        arrayActionR(ArrayAction.UNSET, new ReferenceClassProperty(this, "themes", env), env, name);
        return null;
    }

    @ConvertedMethod
    public Object isSupported(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck("/", "===", "\\")) {
            return ZVal.assign(
                    ZVal.toBool(
                                    ZVal.strictNotEqualityCheck(
                                            NamespaceGlobal.getenv.env(env).call("ANSICON").value(),
                                            "!==",
                                            false))
                            || ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            NamespaceGlobal.getenv
                                                    .env(env)
                                                    .call("ConEmuANSI")
                                                    .value(),
                                            "===",
                                            "ON")));
        }

        return ZVal.assign(
                ZVal.toBool(function_function_exists.f.env(env).call("posix_isatty").value())
                        && ZVal.toBool(
                                NamespaceGlobal.posix_isatty
                                        .env(env)
                                        .call(function_constant.get(env, "STDOUT"))
                                        .value()));
    }

    @ConvertedMethod
    public Object are256ColorsSupported(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(ZVal.strictEqualityCheck("/", "===", "/"))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        function_strpos
                                                .f
                                                .env(env)
                                                .call(
                                                        NamespaceGlobal.getenv
                                                                .env(env)
                                                                .call("TERM")
                                                                .value(),
                                                        "256color")
                                                .value(),
                                        "!==",
                                        false)));
    }

    @ConvertedMethod
    public Object getPossibleStyles(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_array_keys.f.env(env).call(this.styles).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    private Object themeSequence(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object style = null;
        ReferenceContainer sequences = new BasicReferenceContainer(null);
        sequences.setObject(ZVal.newArray());
        for (ZPair zpairResult182 :
                ZVal.getIterable(
                        new ReferenceClassProperty(this, "themes", env).arrayGet(env, name),
                        env,
                        true)) {
            style = ZVal.assign(zpairResult182.getValue());
            sequences.arrayAppend(env).set(this.styleSequence(env, style));
        }

        return ZVal.assign(sequences.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "style")
    private Object styleSequence(RuntimeEnv env, Object... args) {
        Object style = assignParameter(args, 0, false);
        Object type = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        Object value = null;
        if (function_array_key_exists.f.env(env).call(style, this.styles).getBool()) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "styles", env).arrayGet(env, style));
        }

        if (!ZVal.isTrue(this.are256ColorsSupported(env))) {
            return ZVal.assign(ZVal.getNull());
        }

        function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call(CONST_COLOR256_REGEXP, style, matches.getObject());
        type =
                ZVal.assign(
                        ZVal.strictEqualityCheck(matches.arrayGet(env, 1), "===", "bg_")
                                ? CONST_BACKGROUND
                                : CONST_FOREGROUND);
        value = ZVal.assign(matches.arrayGet(env, 2));
        return ZVal.assign(toStringR(type, env) + ";5;" + toStringR(value, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "style")
    private Object isValidStyle(RuntimeEnv env, Object... args) {
        Object style = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(function_array_key_exists.f.env(env).call(style, this.styles).value())
                        || ZVal.toBool(
                                function_preg_match
                                        .f
                                        .env(env)
                                        .call(CONST_COLOR256_REGEXP, style)
                                        .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    private Object escSequence(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign("\u001B[" + toStringR(value, env) + "m");
    }

    public static final Object CONST_FOREGROUND = 38;

    public static final Object CONST_BACKGROUND = 48;

    public static final Object CONST_COLOR256_REGEXP = "~^(bg_)?color_([0-9]{1,3})$~";

    public static final Object CONST_RESET_STYLE = 0;

    public static final Object CONST_class = "JakubOnderka\\PhpConsoleColor\\ConsoleColor";

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
                    .setName("JakubOnderka\\PhpConsoleColor\\ConsoleColor")
                    .setLookup(
                            ConsoleColor.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("forceStyle", "isSupported", "styles", "themes")
                    .setFilename(
                            "vendor/jakub-onderka/php-console-color/src/JakubOnderka/PhpConsoleColor/ConsoleColor.php")
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
