package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Formatter.classes;

import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Formatter.classes.OutputFormatterStyleStack;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match_all;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Formatter.classes.OutputFormatterStyle;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Formatter.classes.OutputFormatterInterface;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Formatter/OutputFormatter.php

*/

public class OutputFormatter extends RuntimeClassBase implements OutputFormatterInterface {

    public Object decorated = null;

    public Object styles = ZVal.newArray();

    public Object styleStack = null;

    public OutputFormatter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == OutputFormatter.class) {
            this.__construct(env, args);
        }
    }

    public OutputFormatter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "decorated",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "styles",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object decorated = assignParameter(args, 0, true);
        if (null == decorated) {
            decorated = false;
        }
        Object styles = assignParameter(args, 1, true);
        if (null == styles) {
            styles = ZVal.newArray();
        }
        Object name = null;
        Object style = null;
        this.decorated = decorated;
        this.setStyle(env, "error", new OutputFormatterStyle(env, "white", "red"));
        this.setStyle(env, "info", new OutputFormatterStyle(env, "green"));
        this.setStyle(env, "comment", new OutputFormatterStyle(env, "yellow"));
        this.setStyle(env, "question", new OutputFormatterStyle(env, "black", "cyan"));
        for (ZPair zpairResult1681 : ZVal.getIterable(styles, env, false)) {
            name = ZVal.assign(zpairResult1681.getKey());
            style = ZVal.assign(zpairResult1681.getValue());
            this.setStyle(env, name, style);
        }

        this.styleStack = new OutputFormatterStyleStack(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "decorated")
    public Object setDecorated(RuntimeEnv env, Object... args) {
        Object decorated = assignParameter(args, 0, false);
        this.decorated = ZVal.toBool(decorated);
        return null;
    }

    @ConvertedMethod
    public Object isDecorated(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.decorated);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "style",
        typeHint = "Symfony\\Component\\Console\\Formatter\\OutputFormatterStyleInterface"
    )
    public Object setStyle(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object style = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "styles", env)
                .arrayAccess(env, NamespaceGlobal.strtolower.env(env).call(name).value())
                .set(style);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object hasStyle(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "styles", env),
                        env,
                        NamespaceGlobal.strtolower.env(env).call(name).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object getStyle(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        if (!ZVal.isTrue(this.hasStyle(env, name))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf.f.env(env).call("Undefined style: %s", name).value()));
        }

        return ZVal.assign(
                new ReferenceClassProperty(this, "styles", env)
                        .arrayGet(env, NamespaceGlobal.strtolower.env(env).call(name).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    public Object format(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        ReferenceContainer message = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object offset = null;
        ReferenceContainer match = new BasicReferenceContainer(null);
        Object i = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        Object output = null;
        Object pos = null;
        Object tagRegex = null;
        Object style = null;
        ReferenceContainer text = new BasicReferenceContainer(null);
        Object tag = null;
        Object open = null;
        message.setObject(ZVal.assign(toStringR(message.getObject(), env)));
        offset = 0;
        output = "";
        tagRegex = "[a-z][a-z0-9,_=;-]*+";
        function_preg_match_all
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call(
                        "#<(("
                                + toStringR(tagRegex, env)
                                + ") | /("
                                + toStringR(tagRegex, env)
                                + ")?)>#ix",
                        message.getObject(),
                        matches.getObject(),
                        256);
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1682 : ZVal.getIterable(matches.arrayGet(env, 0), env, false)) {
            i = ZVal.assign(zpairResult1682.getKey());
            match.setObject(ZVal.assign(zpairResult1682.getValue()));
            pos = ZVal.assign(match.arrayGet(env, 1));
            text.setObject(ZVal.assign(match.arrayGet(env, 0)));
            if (ZVal.toBool(ZVal.notEqualityCheck(0, pos))
                    && ZVal.toBool(
                            ZVal.equalityCheck(
                                    "\\", message.arrayGet(env, ZVal.subtract(pos, 1))))) {
                continue;
            }

            output =
                    toStringR(output, env)
                            + toStringR(
                                    this.applyCurrentStyle(
                                            env,
                                            function_substr
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            message.getObject(),
                                                            offset,
                                                            ZVal.subtract(pos, offset))
                                                    .value()),
                                    env);
            offset = ZVal.add(pos, function_strlen.f.env(env).call(text.getObject()).value());
            if (ZVal.isTrue(open = ZVal.notEqualityCheck("/", text.arrayGet(env, 1)))) {
                tag = ZVal.assign(matches.arrayGet(env, 1, i, 0));

            } else {
                tag =
                        ZVal.assign(
                                arrayActionR(ArrayAction.ISSET, matches, env, 3, i, 0)
                                        ? matches.arrayGet(env, 3, i, 0)
                                        : "");
            }

            if (ZVal.toBool(!ZVal.isTrue(open)) && ZVal.toBool(!ZVal.isTrue(tag))) {
                env.callMethod(this.styleStack, "pop", OutputFormatter.class);

            } else if (ZVal.strictEqualityCheck(
                    false,
                    "===",
                    style =
                            this.createStyleFromString(
                                    env, NamespaceGlobal.strtolower.env(env).call(tag).value()))) {
                output =
                        toStringR(output, env)
                                + toStringR(this.applyCurrentStyle(env, text.getObject()), env);

            } else if (ZVal.isTrue(open)) {
                env.callMethod(this.styleStack, "push", OutputFormatter.class, style);

            } else {
                env.callMethod(this.styleStack, "pop", OutputFormatter.class, style);
            }
        }

        output =
                toStringR(output, env)
                        + toStringR(
                                this.applyCurrentStyle(
                                        env,
                                        function_substr
                                                .f
                                                .env(env)
                                                .call(message.getObject(), offset)
                                                .value()),
                                env);
        if (ZVal.strictNotEqualityCheck(
                false, "!==", function_strpos.f.env(env).call(output, "\u0000").value())) {
            return ZVal.assign(
                    NamespaceGlobal.strtr
                            .env(env)
                            .call(
                                    output,
                                    ZVal.newArray(new ZPair("\u0000", "\\"), new ZPair("\\<", "<")))
                            .value());
        }

        return ZVal.assign(function_str_replace.f.env(env).call("\\<", "<", output).value());
    }

    @ConvertedMethod
    public Object getStyleStack(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.styleStack);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string", typeHint = "string")
    private Object createStyleFromString(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        ReferenceContainer match = new BasicReferenceContainer(null);
        ReferenceContainer options = new BasicReferenceContainer(null);
        Object style = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        Object option = null;
        if (arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "styles", env), env, string)) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "styles", env).arrayGet(env, string));
        }

        if (!function_preg_match_all
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call("/([^=]+)=([^;]+)(;|$)/", string, matches.getObject(), 2)
                .getBool()) {
            return ZVal.assign(false);
        }

        style = new OutputFormatterStyle(env);
        for (ZPair zpairResult1683 : ZVal.getIterable(matches.getObject(), env, true)) {
            match.setObject(ZVal.assign(zpairResult1683.getValue()));
            function_array_shift.f.env(env).call(match.getObject());
            if (ZVal.equalityCheck("fg", match.arrayGet(env, 0))) {
                env.callMethod(
                        style, "setForeground", OutputFormatter.class, match.arrayGet(env, 1));

            } else if (ZVal.equalityCheck("bg", match.arrayGet(env, 0))) {
                env.callMethod(
                        style, "setBackground", OutputFormatter.class, match.arrayGet(env, 1));

            } else if (ZVal.strictEqualityCheck("options", "===", match.arrayGet(env, 0))) {
                function_preg_match_all
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(2, options))
                        .call("([^,;]+)", match.arrayGet(env, 1), options.getObject());
                options.setObject(
                        function_array_shift.f.env(env).call(options.getObject()).value());
                for (ZPair zpairResult1684 : ZVal.getIterable(options.getObject(), env, true)) {
                    option = ZVal.assign(zpairResult1684.getValue());
                    env.callMethod(style, "setOption", OutputFormatter.class, option);
                }

            } else {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(style);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "text", typeHint = "string")
    private Object applyCurrentStyle(RuntimeEnv env, Object... args) {
        Object text = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(this.isDecorated(env))
                                && ZVal.toBool(
                                        ZVal.isGreaterThan(
                                                function_strlen.f.env(env).call(text).value(),
                                                '>',
                                                0))
                        ? env.callMethod(
                                env.callMethod(
                                        this.styleStack, "getCurrent", OutputFormatter.class),
                                "apply",
                                OutputFormatter.class,
                                text)
                        : text);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Console\\Formatter\\OutputFormatter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "text")
        public Object escape(RuntimeEnv env, Object... args) {
            Object text = assignParameter(args, 0, false);
            text = function_preg_replace.f.env(env).call("/([^\\\\]?)</", "$1\\<", text).value();
            return ZVal.assign(runtimeStaticObject.escapeTrailingBackslash(env, text));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "text")
        public Object escapeTrailingBackslash(RuntimeEnv env, Object... args) {
            Object text = assignParameter(args, 0, false);
            Object len = null;
            if (ZVal.strictEqualityCheck(
                    "\\", "===", function_substr.f.env(env).call(text, -1).value())) {
                len = function_strlen.f.env(env).call(text).value();
                text = function_rtrim.f.env(env).call(text, "\\").value();
                text = function_str_replace.f.env(env).call("\u0000", "", text).value();
                text =
                        toStringR(text, env)
                                + toStringR(
                                        function_str_repeat
                                                .f
                                                .env(env)
                                                .call(
                                                        "\u0000",
                                                        ZVal.subtract(
                                                                len,
                                                                function_strlen
                                                                        .f
                                                                        .env(env)
                                                                        .call(text)
                                                                        .value()))
                                                .value(),
                                        env);
            }

            return ZVal.assign(text);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Formatter\\OutputFormatter")
                    .setLookup(
                            OutputFormatter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("decorated", "styleStack", "styles")
                    .setFilename("vendor/symfony/console/Formatter/OutputFormatter.php")
                    .addInterface(
                            "Symfony\\Component\\Console\\Formatter\\OutputFormatterInterface")
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
