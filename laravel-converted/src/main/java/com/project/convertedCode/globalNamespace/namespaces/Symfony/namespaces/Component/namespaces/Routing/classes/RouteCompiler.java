package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match_all;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reverse;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes.CompiledRoute;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes.RouteCompilerInterface;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.DomainException;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
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

 vendor/symfony/routing/RouteCompiler.php

*/

public class RouteCompiler extends RuntimeClassBase implements RouteCompilerInterface {

    public RouteCompiler(RuntimeEnv env, Object... args) {
        super(env);
    }

    public RouteCompiler(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_REGEX_DELIMITER = "#";

    public static final Object CONST_SEPARATORS = "/,;.:-_~+*=@|";

    public static final Object CONST_VARIABLE_MAXIMUM_LENGTH = 32;

    public static final Object CONST_class = "Symfony\\Component\\Routing\\RouteCompiler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "route",
            typeHint = "Symfony\\Component\\Routing\\Route"
        )
        public Object compile(RuntimeEnv env, Object... args) {
            Object route = assignParameter(args, 0, false);
            Object variables = null;
            Object staticPrefix = null;
            Object hostVariables = null;
            Object hostTokens = null;
            Object pathParam = null;
            ReferenceContainer result = new BasicReferenceContainer(null);
            Object path = null;
            Object regex = null;
            Object pathVariables = null;
            Object host = null;
            Object tokens = null;
            Object hostRegex = null;
            hostVariables = ZVal.newArray();
            variables = ZVal.newArray();
            hostRegex = ZVal.getNull();
            hostTokens = ZVal.newArray();
            if (ZVal.strictNotEqualityCheck(
                    "", "!==", host = env.callMethod(route, "getHost", RouteCompiler.class))) {
                result.setObject(runtimeStaticObject.compilePattern(env, route, host, true));
                hostVariables = ZVal.assign(result.arrayGet(env, "variables"));
                variables = ZVal.assign(hostVariables);
                hostTokens = ZVal.assign(result.arrayGet(env, "tokens"));
                hostRegex = ZVal.assign(result.arrayGet(env, "regex"));
            }

            path = env.callMethod(route, "getPath", RouteCompiler.class);
            result.setObject(runtimeStaticObject.compilePattern(env, route, path, false));
            staticPrefix = ZVal.assign(result.arrayGet(env, "staticPrefix"));
            pathVariables = ZVal.assign(result.arrayGet(env, "variables"));
            for (ZPair zpairResult2094 : ZVal.getIterable(pathVariables, env, true)) {
                pathParam = ZVal.assign(zpairResult2094.getValue());
                if (ZVal.strictEqualityCheck("_fragment", "===", pathParam)) {
                    throw ZVal.getException(
                            env,
                            new InvalidArgumentException(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "Route pattern \"%s\" cannot contain \"_fragment\" as a path parameter.",
                                                    env.callMethod(
                                                            route, "getPath", RouteCompiler.class))
                                            .value()));
                }
            }

            variables = function_array_merge.f.env(env).call(variables, pathVariables).value();
            tokens = ZVal.assign(result.arrayGet(env, "tokens"));
            regex = ZVal.assign(result.arrayGet(env, "regex"));
            return ZVal.assign(
                    new CompiledRoute(
                            env,
                            staticPrefix,
                            regex,
                            tokens,
                            pathVariables,
                            hostRegex,
                            hostTokens,
                            hostVariables,
                            function_array_unique.f.env(env).call(variables).value()));
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "route",
            typeHint = "Symfony\\Component\\Routing\\Route"
        )
        @ConvertedParameter(index = 1, name = "pattern")
        @ConvertedParameter(index = 2, name = "isHost")
        private Object compilePattern(RuntimeEnv env, Object... args) {
            int runtimeConverterBreakCount;
            Object route = assignParameter(args, 0, false);
            Object pattern = assignParameter(args, 1, false);
            Object isHost = assignParameter(args, 2, false);
            Object regexp = null;
            ReferenceContainer variables = new BasicReferenceContainer(null);
            Object varName = null;
            ReferenceContainer match = new BasicReferenceContainer(null);
            ReferenceContainer i = new BasicReferenceContainer(null);
            ReferenceContainer precedingChar = new BasicReferenceContainer(null);
            Object precedingText = null;
            Object nextSeparator = null;
            ReferenceContainer matches = new BasicReferenceContainer(null);
            ReferenceContainer token = new BasicReferenceContainer(null);
            Object pos = null;
            Object useUtf8 = null;
            Object defaultSeparator = null;
            Object nbToken = null;
            ReferenceContainer tokens = new BasicReferenceContainer(null);
            Object needsUtf8 = null;
            Object isSeparator = null;
            Object firstOptional = null;
            Object followingPattern = null;
            tokens.setObject(ZVal.newArray());
            variables.setObject(ZVal.newArray());
            matches.setObject(ZVal.newArray());
            pos = 0;
            defaultSeparator = ZVal.assign(ZVal.isTrue(isHost) ? "." : "/");
            useUtf8 = function_preg_match.f.env(env).call("//u", pattern).value();
            needsUtf8 = env.callMethod(route, "getOption", RouteCompiler.class, "utf8");
            if (ZVal.toBool(ZVal.toBool(!ZVal.isTrue(needsUtf8)) && ZVal.toBool(useUtf8))
                    && ZVal.toBool(
                            function_preg_match
                                    .f
                                    .env(env)
                                    .call("/[\\x80-\\xFF]/", pattern)
                                    .value())) {
                throw ZVal.getException(
                        env,
                        new LogicException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Cannot use UTF-8 route patterns without setting the \"utf8\" option for route \"%s\".",
                                                env.callMethod(
                                                        route, "getPath", RouteCompiler.class))
                                        .value()));
            }

            if (ZVal.toBool(!ZVal.isTrue(useUtf8)) && ZVal.toBool(needsUtf8)) {
                throw ZVal.getException(
                        env,
                        new LogicException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Cannot mix UTF-8 requirements with non-UTF-8 pattern \"%s\".",
                                                pattern)
                                        .value()));
            }

            function_preg_match_all
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call(
                            "#\\{\\w+\\}#",
                            pattern,
                            matches.getObject(),
                            ZVal.toLong(256) | ZVal.toLong(2));
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult2095 : ZVal.getIterable(matches.getObject(), env, true)) {
                match.setObject(ZVal.assign(zpairResult2095.getValue()));
                varName = function_substr.f.env(env).call(match.arrayGet(env, 0, 0), 1, -1).value();
                precedingText =
                        function_substr
                                .f
                                .env(env)
                                .call(pattern, pos, ZVal.subtract(match.arrayGet(env, 0, 1), pos))
                                .value();
                pos =
                        ZVal.add(
                                match.arrayGet(env, 0, 1),
                                function_strlen.f.env(env).call(match.arrayGet(env, 0, 0)).value());
                if (!function_strlen.f.env(env).call(precedingText).getBool()) {
                    precedingChar.setObject("");

                } else if (ZVal.isTrue(useUtf8)) {
                    function_preg_match
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithReferences().add(2, precedingChar))
                            .call("/.$/u", precedingText, precedingChar.getObject());
                    precedingChar.setObject(ZVal.assign(precedingChar.arrayGet(env, 0)));

                } else {
                    precedingChar.setObject(
                            function_substr.f.env(env).call(precedingText, -1).value());
                }

                isSeparator =
                        ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                "", "!==", precedingChar.getObject()))
                                && ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                false,
                                                "!==",
                                                function_strpos
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                ClassConstantUtils
                                                                        .getConstantValueLateStatic(
                                                                                env,
                                                                                this,
                                                                                "SEPARATORS"),
                                                                precedingChar.getObject())
                                                        .value()));
                if (function_preg_match.f.env(env).call("/^\\d/", varName).getBool()) {
                    throw ZVal.getException(
                            env,
                            new DomainException(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "Variable name \"%s\" cannot start with a digit in route pattern \"%s\". Please use a different name.",
                                                    varName, pattern)
                                            .value()));
                }

                if (function_in_array.f.env(env).call(varName, variables.getObject()).getBool()) {
                    throw ZVal.getException(
                            env,
                            new LogicException(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "Route pattern \"%s\" cannot reference variable name \"%s\" more than once.",
                                                    pattern, varName)
                                            .value()));
                }

                if (ZVal.isGreaterThan(
                        function_strlen.f.env(env).call(varName).value(),
                        '>',
                        CONST_VARIABLE_MAXIMUM_LENGTH)) {
                    throw ZVal.getException(
                            env,
                            new DomainException(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "Variable name \"%s\" cannot be longer than %s characters in route pattern \"%s\". Please use a shorter name.",
                                                    varName, CONST_VARIABLE_MAXIMUM_LENGTH, pattern)
                                            .value()));
                }

                if (ZVal.toBool(isSeparator)
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        precedingText, "!==", precedingChar.getObject()))) {
                    tokens.arrayAppend(env)
                            .set(
                                    ZVal.newArray(
                                            new ZPair(0, "text"),
                                            new ZPair(
                                                    1,
                                                    function_substr
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    precedingText,
                                                                    0,
                                                                    ZVal.minusSign(
                                                                            function_strlen
                                                                                    .f
                                                                                    .env(env)
                                                                                    .call(
                                                                                            precedingChar
                                                                                                    .getObject())
                                                                                    .value()))
                                                            .value())));

                } else if (ZVal.toBool(!ZVal.isTrue(isSeparator))
                        && ZVal.toBool(
                                ZVal.isGreaterThan(
                                        function_strlen.f.env(env).call(precedingText).value(),
                                        '>',
                                        0))) {
                    tokens.arrayAppend(env)
                            .set(ZVal.newArray(new ZPair(0, "text"), new ZPair(1, precedingText)));
                }

                regexp = env.callMethod(route, "getRequirement", RouteCompiler.class, varName);
                if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", regexp)) {
                    followingPattern =
                            ZVal.assign(
                                    toStringR(
                                            function_substr.f.env(env).call(pattern, pos).value(),
                                            env));
                    nextSeparator =
                            runtimeStaticObject.findNextSeparator(env, followingPattern, useUtf8);
                    regexp =
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "[^%s%s]+",
                                            NamespaceGlobal.preg_quote
                                                    .env(env)
                                                    .call(defaultSeparator, CONST_REGEX_DELIMITER)
                                                    .value(),
                                            ZVal.toBool(
                                                                    ZVal.strictNotEqualityCheck(
                                                                            defaultSeparator,
                                                                            "!==",
                                                                            nextSeparator))
                                                            && ZVal.toBool(
                                                                    ZVal.strictNotEqualityCheck(
                                                                            "",
                                                                            "!==",
                                                                            nextSeparator))
                                                    ? NamespaceGlobal.preg_quote
                                                            .env(env)
                                                            .call(
                                                                    nextSeparator,
                                                                    CONST_REGEX_DELIMITER)
                                                            .value()
                                                    : "")
                                    .value();
                    if (ZVal.toBool(
                                    ZVal.toBool(
                                                    ZVal.strictNotEqualityCheck(
                                                            "", "!==", nextSeparator))
                                            && ZVal.toBool(
                                                    !function_preg_match
                                                            .f
                                                            .env(env)
                                                            .call("#^\\{\\w+\\}#", followingPattern)
                                                            .getBool()))
                            || ZVal.toBool(ZVal.strictEqualityCheck("", "===", followingPattern))) {
                        regexp = toStringR(regexp, env) + "+";
                    }

                } else {
                    if (!function_preg_match.f.env(env).call("//u", regexp).getBool()) {
                        useUtf8 = false;

                    } else if (ZVal.toBool(!ZVal.isTrue(needsUtf8))
                            && ZVal.toBool(
                                    function_preg_match
                                            .f
                                            .env(env)
                                            .call(
                                                    "/[\\x80-\\xFF]|(?<!\\\\)\\\\(?:\\\\\\\\)*+(?-i:X|[pP][\\{CLMNPSZ]|x\\{[A-Fa-f0-9]{3})/",
                                                    regexp)
                                            .value())) {
                        throw ZVal.getException(
                                env,
                                new LogicException(
                                        env,
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "Cannot use UTF-8 route requirements without setting the \"utf8\" option for variable \"%s\" in pattern \"%s\".",
                                                        varName, pattern)
                                                .value()));
                    }

                    if (ZVal.toBool(!ZVal.isTrue(useUtf8)) && ZVal.toBool(needsUtf8)) {
                        throw ZVal.getException(
                                env,
                                new LogicException(
                                        env,
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "Cannot mix UTF-8 requirement with non-UTF-8 charset for variable \"%s\" in pattern \"%s\".",
                                                        varName, pattern)
                                                .value()));
                    }

                    regexp =
                            runtimeStaticObject.transformCapturingGroupsToNonCapturings(
                                    env, regexp);
                }

                tokens.arrayAppend(env)
                        .set(
                                ZVal.newArray(
                                        new ZPair(0, "variable"),
                                        new ZPair(
                                                1,
                                                ZVal.isTrue(isSeparator)
                                                        ? precedingChar.getObject()
                                                        : ""),
                                        new ZPair(2, regexp),
                                        new ZPair(3, varName)));
                variables.arrayAppend(env).set(varName);
            }

            if (ZVal.isLessThan(pos, '<', function_strlen.f.env(env).call(pattern).value())) {
                tokens.arrayAppend(env)
                        .set(
                                ZVal.newArray(
                                        new ZPair(0, "text"),
                                        new ZPair(
                                                1,
                                                function_substr
                                                        .f
                                                        .env(env)
                                                        .call(pattern, pos)
                                                        .value())));
            }

            firstOptional = 9223372036854775807L;
            if (!ZVal.isTrue(isHost)) {
                runtimeConverterBreakCount = 0;
                for (i.setObject(
                                ZVal.subtract(
                                        function_count.f.env(env).call(tokens.getObject()).value(),
                                        1));
                        ZVal.isGreaterThanOrEqualTo(i.getObject(), ">=", 0);
                        i.setObject(ZVal.decrement(i.getObject()))) {
                    token.setObject(ZVal.assign(tokens.arrayGet(env, i.getObject())));
                    if (ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            "variable", "===", token.arrayGet(env, 0)))
                            && ZVal.toBool(
                                    env.callMethod(
                                            route,
                                            "hasDefault",
                                            RouteCompiler.class,
                                            token.arrayGet(env, 3)))) {
                        firstOptional = ZVal.assign(i.getObject());

                    } else {
                        break;
                    }
                }
            }

            regexp = "";
            runtimeConverterBreakCount = 0;
            for (i.setObject(0),
                            nbToken = function_count.f.env(env).call(tokens.getObject()).value();
                    ZVal.isLessThan(i.getObject(), '<', nbToken);
                    i.setObject(ZVal.increment(i.getObject()))) {
                regexp =
                        toStringR(regexp, env)
                                + toStringR(
                                        runtimeStaticObject.computeRegexp(
                                                env,
                                                tokens.getObject(),
                                                i.getObject(),
                                                firstOptional),
                                        env);
            }

            regexp =
                    toStringR(CONST_REGEX_DELIMITER, env)
                            + "^"
                            + toStringR(regexp, env)
                            + "$"
                            + toStringR(CONST_REGEX_DELIMITER, env)
                            + "sD"
                            + toStringR(ZVal.isTrue(isHost) ? "i" : "", env);
            if (ZVal.isTrue(needsUtf8)) {
                regexp = toStringR(regexp, env) + "u";
                runtimeConverterBreakCount = 0;
                for (i.setObject(0),
                                nbToken =
                                        function_count.f.env(env).call(tokens.getObject()).value();
                        ZVal.isLessThan(i.getObject(), '<', nbToken);
                        i.setObject(ZVal.increment(i.getObject()))) {
                    if (ZVal.strictEqualityCheck(
                            "variable", "===", tokens.arrayGet(env, i.getObject(), 0))) {
                        tokens.arrayAppend(env, i.getObject()).set(true);
                    }
                }
            }

            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    "staticPrefix",
                                    runtimeStaticObject.determineStaticPrefix(
                                            env, route, tokens.getObject())),
                            new ZPair("regex", regexp),
                            new ZPair(
                                    "tokens",
                                    function_array_reverse
                                            .f
                                            .env(env)
                                            .call(tokens.getObject())
                                            .value()),
                            new ZPair("variables", variables.getObject())));
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "route",
            typeHint = "Symfony\\Component\\Routing\\Route"
        )
        @ConvertedParameter(index = 1, name = "tokens", typeHint = "array")
        private Object determineStaticPrefix(RuntimeEnv env, Object... args) {
            Object route = assignParameter(args, 0, false);
            ReferenceContainer tokens =
                    new BasicReferenceContainer(assignParameter(args, 1, false));
            Object prefix = null;
            if (ZVal.strictNotEqualityCheck("text", "!==", tokens.arrayGet(env, 0, 0))) {
                return ZVal.assign(
                        ZVal.toBool(
                                                env.callMethod(
                                                        route,
                                                        "hasDefault",
                                                        RouteCompiler.class,
                                                        tokens.arrayGet(env, 0, 3)))
                                        || ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        "/", "===", tokens.arrayGet(env, 0, 1)))
                                ? ""
                                : tokens.arrayGet(env, 0, 1));
            }

            prefix = ZVal.assign(tokens.arrayGet(env, 0, 1));
            if (ZVal.toBool(
                            ZVal.toBool(arrayActionR(ArrayAction.ISSET, tokens, env, 1, 1))
                                    && ZVal.toBool(
                                            ZVal.strictNotEqualityCheck(
                                                    "/", "!==", tokens.arrayGet(env, 1, 1))))
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    false,
                                    "===",
                                    env.callMethod(
                                            route,
                                            "hasDefault",
                                            RouteCompiler.class,
                                            tokens.arrayGet(env, 1, 3))))) {
                prefix = toStringR(prefix, env) + toStringR(tokens.arrayGet(env, 1, 1), env);
            }

            return ZVal.assign(prefix);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "pattern", typeHint = "string")
        @ConvertedParameter(index = 1, name = "useUtf8", typeHint = "bool")
        private Object findNextSeparator(RuntimeEnv env, Object... args) {
            ReferenceContainer pattern =
                    new BasicReferenceContainer(assignParameter(args, 0, false));
            Object useUtf8 = assignParameter(args, 1, false);
            if (ZVal.equalityCheck("", pattern.getObject())) {
                return "";
            }

            if (ZVal.strictEqualityCheck(
                    "",
                    "===",
                    pattern.setObject(
                            function_preg_replace
                                    .f
                                    .env(env)
                                    .call("#\\{\\w+\\}#", "", pattern.getObject())
                                    .value()))) {
                return "";
            }

            if (ZVal.isTrue(useUtf8)) {
                function_preg_match
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(2, pattern))
                        .call("/^./u", pattern.getObject(), pattern.getObject());
            }

            return ZVal.assign(
                    ZVal.strictNotEqualityCheck(
                                    false,
                                    "!==",
                                    function_strpos
                                            .f
                                            .env(env)
                                            .call(
                                                    ClassConstantUtils.getConstantValueLateStatic(
                                                            env, this, "SEPARATORS"),
                                                    pattern.arrayGet(env, 0))
                                            .value())
                            ? pattern.arrayGet(env, 0)
                            : "");
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "tokens", typeHint = "array")
        @ConvertedParameter(index = 1, name = "index", typeHint = "int")
        @ConvertedParameter(index = 2, name = "firstOptional", typeHint = "int")
        private Object computeRegexp(RuntimeEnv env, Object... args) {
            ReferenceContainer tokens =
                    new BasicReferenceContainer(assignParameter(args, 0, false));
            Object index = assignParameter(args, 1, false);
            Object firstOptional = assignParameter(args, 2, false);
            Object regexp = null;
            Object nbTokens = null;
            ReferenceContainer token = new BasicReferenceContainer(null);
            token.setObject(ZVal.assign(tokens.arrayGet(env, index)));
            if (ZVal.strictEqualityCheck("text", "===", token.arrayGet(env, 0))) {
                return ZVal.assign(
                        NamespaceGlobal.preg_quote
                                .env(env)
                                .call(token.arrayGet(env, 1), CONST_REGEX_DELIMITER)
                                .value());

            } else {
                if (ZVal.toBool(ZVal.strictEqualityCheck(0, "===", index))
                        && ZVal.toBool(ZVal.strictEqualityCheck(0, "===", firstOptional))) {
                    return ZVal.assign(
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "%s(?P<%s>%s)?",
                                            NamespaceGlobal.preg_quote
                                                    .env(env)
                                                    .call(
                                                            token.arrayGet(env, 1),
                                                            CONST_REGEX_DELIMITER)
                                                    .value(),
                                            token.arrayGet(env, 3),
                                            token.arrayGet(env, 2))
                                    .value());

                } else {
                    regexp =
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "%s(?P<%s>%s)",
                                            NamespaceGlobal.preg_quote
                                                    .env(env)
                                                    .call(
                                                            token.arrayGet(env, 1),
                                                            CONST_REGEX_DELIMITER)
                                                    .value(),
                                            token.arrayGet(env, 3),
                                            token.arrayGet(env, 2))
                                    .value();
                    if (ZVal.isGreaterThanOrEqualTo(index, ">=", firstOptional)) {
                        regexp = ZVal.assign("(?:" + toStringR(regexp, env));
                        nbTokens = function_count.f.env(env).call(tokens.getObject()).value();
                        if (ZVal.equalityCheck(ZVal.subtract(nbTokens, 1), index)) {
                            regexp =
                                    toStringR(regexp, env)
                                            + toStringR(
                                                    function_str_repeat
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    ")?",
                                                                    ZVal.subtract(
                                                                            ZVal.subtract(
                                                                                    nbTokens,
                                                                                    firstOptional),
                                                                            ZVal
                                                                                            .strictEqualityCheck(
                                                                                                    0,
                                                                                                    "===",
                                                                                                    firstOptional)
                                                                                    ? 1
                                                                                    : 0))
                                                            .value(),
                                                    env);
                        }
                    }

                    return ZVal.assign(regexp);
                }
            }
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "regexp", typeHint = "string")
        private Object transformCapturingGroupsToNonCapturings(RuntimeEnv env, Object... args) {
            int runtimeConverterContinueCount;
            ReferenceContainer regexp =
                    new BasicReferenceContainer(assignParameter(args, 0, false));
            ReferenceContainer i = new BasicReferenceContainer(null);
            runtimeConverterContinueCount = 0;
            for (i.setObject(0);
                    ZVal.isLessThan(
                            i.getObject(),
                            '<',
                            function_strlen.f.env(env).call(regexp.getObject()).value());
                    i.setObject(ZVal.increment(i.getObject()))) {
                if (ZVal.strictEqualityCheck("\\", "===", regexp.arrayGet(env, i.getObject()))) {
                    i.setObject(ZVal.increment(i.getObject()));
                    continue;
                }

                if (ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        "(", "!==", regexp.arrayGet(env, i.getObject())))
                        || ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        regexp,
                                        env,
                                        ZVal.add(i.getObject(), 2)))) {
                    continue;
                }

                if (ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        "*", "===", regexp.arrayGet(env, ZVal.preIncrement(i))))
                        || ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        "?", "===", regexp.arrayGet(env, i.getObject())))) {
                    i.setObject(ZVal.increment(i.getObject()));
                    continue;
                }

                regexp.setObject(
                        NamespaceGlobal.substr_replace
                                .env(env)
                                .call(regexp.getObject(), "?:", i.getObject(), 0)
                                .value());
                i.setObject(ZVal.increment(i.getObject()));
            }

            return ZVal.assign(regexp.getObject());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Routing\\RouteCompiler")
                    .setLookup(
                            RouteCompiler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/routing/RouteCompiler.php")
                    .addInterface("Symfony\\Component\\Routing\\RouteCompilerInterface")
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
