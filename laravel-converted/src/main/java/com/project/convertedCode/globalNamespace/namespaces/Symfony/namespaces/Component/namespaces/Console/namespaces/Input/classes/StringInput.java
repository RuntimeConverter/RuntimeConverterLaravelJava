package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.ArgvInput;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Input/StringInput.php

*/

public class StringInput extends ArgvInput {

    public StringInput(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == StringInput.class) {
            this.__construct(env, args);
        }
    }

    public StringInput(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "input", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        super.__construct(env, ZVal.newArray());
        env.callMethod(this, "setTokens", StringInput.class, this.tokenize(env, input));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "input")
    private Object tokenize(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object cursor = null;
        Object length = null;
        ReferenceContainer match = new BasicReferenceContainer(null);
        ReferenceContainer tokens = new BasicReferenceContainer(null);
        tokens.setObject(ZVal.newArray());
        length = function_strlen.f.env(env).call(input).value();
        cursor = 0;
        while (ZVal.isLessThan(cursor, '<', length)) {
            if (function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, match))
                    .call("/\\s+/A", input, match.getObject(), ZVal.getNull(), cursor)
                    .getBool()) {

            } else if (function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, match))
                    .call(
                            "/([^=\"'\\s]+?)(=?)("
                                    + toStringR(CONST_REGEX_QUOTED_STRING, env)
                                    + "+)/A",
                            input,
                            match.getObject(),
                            ZVal.getNull(),
                            cursor)
                    .getBool()) {
                tokens.arrayAppend(env)
                        .set(
                                toStringR(match.arrayGet(env, 1), env)
                                        + toStringR(match.arrayGet(env, 2), env)
                                        + toStringR(
                                                NamespaceGlobal.stripcslashes
                                                        .env(env)
                                                        .call(
                                                                function_str_replace
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                ZVal.arrayFromList(
                                                                                        "\"'",
                                                                                        "'\"", "''",
                                                                                        "\"\""),
                                                                                "",
                                                                                function_substr
                                                                                        .f
                                                                                        .env(env)
                                                                                        .call(
                                                                                                match
                                                                                                        .arrayGet(
                                                                                                                env,
                                                                                                                3),
                                                                                                1,
                                                                                                ZVal
                                                                                                        .subtract(
                                                                                                                function_strlen
                                                                                                                        .f
                                                                                                                        .env(
                                                                                                                                env)
                                                                                                                        .call(
                                                                                                                                match
                                                                                                                                        .arrayGet(
                                                                                                                                                env,
                                                                                                                                                3))
                                                                                                                        .value(),
                                                                                                                2))
                                                                                        .value())
                                                                        .value())
                                                        .value(),
                                                env));

            } else if (function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, match))
                    .call(
                            "/" + toStringR(CONST_REGEX_QUOTED_STRING, env) + "/A",
                            input,
                            match.getObject(),
                            ZVal.getNull(),
                            cursor)
                    .getBool()) {
                tokens.arrayAppend(env)
                        .set(
                                NamespaceGlobal.stripcslashes
                                        .env(env)
                                        .call(
                                                function_substr
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                match.arrayGet(env, 0),
                                                                1,
                                                                ZVal.subtract(
                                                                        function_strlen
                                                                                .f
                                                                                .env(env)
                                                                                .call(
                                                                                        match
                                                                                                .arrayGet(
                                                                                                        env,
                                                                                                        0))
                                                                                .value(),
                                                                        2))
                                                        .value())
                                        .value());

            } else if (function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, match))
                    .call(
                            "/" + toStringR(CONST_REGEX_STRING, env) + "/A",
                            input,
                            match.getObject(),
                            ZVal.getNull(),
                            cursor)
                    .getBool()) {
                tokens.arrayAppend(env)
                        .set(
                                NamespaceGlobal.stripcslashes
                                        .env(env)
                                        .call(match.arrayGet(env, 1))
                                        .value());

            } else {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Unable to parse input near \"... %s ...\"",
                                                function_substr
                                                        .f
                                                        .env(env)
                                                        .call(input, cursor, 10)
                                                        .value())
                                        .value()));
            }

            cursor =
                    ZAssignment.add(
                            "+=",
                            cursor,
                            function_strlen.f.env(env).call(match.arrayGet(env, 0)).value());
        }

        return ZVal.assign(tokens.getObject());
    }

    public static final Object CONST_REGEX_STRING = "([^\\s]+?)(?:\\s|(?<!\\\\)\"|(?<!\\\\)'|$)";

    public static final Object CONST_REGEX_QUOTED_STRING =
            "(?:\"([^\"\\\\]*(?:\\\\.[^\"\\\\]*)*)\"|'([^'\\\\]*(?:\\\\.[^'\\\\]*)*)')";

    public static final Object CONST_class = "Symfony\\Component\\Console\\Input\\StringInput";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ArgvInput.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Input\\StringInput")
                    .setLookup(
                            StringInput.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "arguments",
                            "definition",
                            "interactive",
                            "options",
                            "parsed",
                            "stream",
                            "tokens")
                    .setFilename("vendor/symfony/console/Input/StringInput.php")
                    .addInterface("Symfony\\Component\\Console\\Input\\InputInterface")
                    .addInterface("Symfony\\Component\\Console\\Input\\StreamableInputInterface")
                    .addExtendsClass("Symfony\\Component\\Console\\Input\\ArgvInput")
                    .addExtendsClass("Symfony\\Component\\Console\\Input\\Input")
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
