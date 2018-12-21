package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.classes.UuidFactory;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reverse;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.string.function_random_bytes;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Pluralizer;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Generator.classes.CombGenerator;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Codec.classes.TimestampFirstCombCodec;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.classes.Uuid;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/Str.php

*/

public class Str extends RuntimeClassBase {

    public Str(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Str(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        ReferenceContainer method = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object parameters = assignParameter(args, 1, false);
        Object macro = null;
        if (!ZVal.isTrue(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Str.class)
                        .method("hasMacro")
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(0, method))
                        .call(method.getObject())
                        .value())) {
            throw ZVal.getException(
                    env,
                    new BadMethodCallException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Method %s::%s does not exist.",
                                            ClassConstantUtils.getConstantValueLateStatic(
                                                    env, this, "class"),
                                            method.getObject())
                                    .value()));
        }

        macro =
                ZVal.assign(
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Support
                                                .classes
                                                .Str
                                                .RequestStaticProperties
                                                .class,
                                        "macros")
                                .arrayGet(env, method.getObject()));
        if (ZVal.isTrue(ZVal.checkInstanceType(macro, Closure.class, "Closure"))) {
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    env.callMethod(
                                            macro,
                                            "bindTo",
                                            Str.class,
                                            this,
                                            ClassConstantUtils.getConstantValueLateStatic(
                                                    env, this, "class")),
                                    parameters)
                            .value());
        }

        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(macro, parameters)
                        .value());
    }

    public static final Object CONST_class = "Illuminate\\Support\\Str";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "subject")
        @ConvertedParameter(index = 1, name = "search")
        public Object after(RuntimeEnv env, Object... args) {
            Object subject = assignParameter(args, 0, false);
            Object search = assignParameter(args, 1, false);
            return ZVal.assign(
                    ZVal.strictEqualityCheck(search, "===", "")
                            ? subject
                            : handleReturnReference(
                                            function_array_reverse
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            function_explode
                                                                    .f
                                                                    .env(env)
                                                                    .call(search, subject, 2)
                                                                    .value())
                                                    .value())
                                    .arrayGet(env, 0));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "language")
        public Object ascii(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object language = assignParameter(args, 1, true);
            if (null == language) {
                language = "en";
            }
            Object val = null;
            ReferenceContainer languageSpecific = new BasicReferenceContainer(null);
            Object key = null;
            languageSpecific.setObject(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Str.class)
                            .method("languageSpecificCharsArray")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(language)
                            .value());
            if (!function_is_null.f.env(env).call(languageSpecific.getObject()).getBool()) {
                value =
                        function_str_replace
                                .f
                                .env(env)
                                .call(
                                        languageSpecific.arrayGet(env, 0),
                                        languageSpecific.arrayGet(env, 1),
                                        value)
                                .value();
            }

            for (ZPair zpairResult584 :
                    ZVal.getIterable(
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Str.class)
                                    .method("charsArray")
                                    .call()
                                    .value(),
                            env,
                            false)) {
                key = ZVal.assign(zpairResult584.getKey());
                val = ZVal.assign(zpairResult584.getValue());
                value = function_str_replace.f.env(env).call(val, key, value).value();
            }

            return ZVal.assign(
                    function_preg_replace.f.env(env).call("/[^\\x20-\\x7E]/u", "", value).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "subject")
        @ConvertedParameter(index = 1, name = "search")
        public Object before(RuntimeEnv env, Object... args) {
            Object subject = assignParameter(args, 0, false);
            Object search = assignParameter(args, 1, false);
            return ZVal.assign(
                    ZVal.strictEqualityCheck(search, "===", "")
                            ? subject
                            : handleReturnReference(
                                            function_explode
                                                    .f
                                                    .env(env)
                                                    .call(search, subject)
                                                    .value())
                                    .arrayGet(env, 0));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object camel(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            if (arrayActionR(
                    ArrayAction.ISSET,
                    env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Illuminate
                                    .namespaces
                                    .Support
                                    .classes
                                    .Str
                                    .RequestStaticProperties
                                    .class,
                            "camelCache"),
                    env,
                    value)) {
                return ZVal.assign(
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Support
                                                .classes
                                                .Str
                                                .RequestStaticProperties
                                                .class,
                                        "camelCache")
                                .arrayGet(env, value));
            }

            return ZVal.assign(
                    env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Support
                                            .classes
                                            .Str
                                            .RequestStaticProperties
                                            .class,
                                    "camelCache")
                            .arrayAccess(env, value)
                            .set(
                                    NamespaceGlobal.lcfirst
                                            .env(env)
                                            .call(
                                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                    env, this, Str.class)
                                                            .method("studly")
                                                            .addReferenceArgs(
                                                                    new RuntimeArgsWithReferences())
                                                            .call(value)
                                                            .value())
                                            .value()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "haystack")
        @ConvertedParameter(index = 1, name = "needles")
        public Object contains(RuntimeEnv env, Object... args) {
            Object haystack = assignParameter(args, 0, false);
            Object needles = assignParameter(args, 1, false);
            Object needle = null;
            for (ZPair zpairResult585 : ZVal.getIterable(rToArrayCast(needles), env, true)) {
                needle = ZVal.assign(zpairResult585.getValue());
                if (ZVal.toBool(ZVal.strictNotEqualityCheck(needle, "!==", ""))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        NamespaceGlobal.mb_strpos
                                                .env(env)
                                                .call(haystack, needle)
                                                .value(),
                                        "!==",
                                        false))) {
                    return ZVal.assign(true);
                }
            }

            return ZVal.assign(false);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "haystack")
        @ConvertedParameter(index = 1, name = "needles")
        public Object endsWith(RuntimeEnv env, Object... args) {
            Object haystack = assignParameter(args, 0, false);
            Object needles = assignParameter(args, 1, false);
            Object needle = null;
            for (ZPair zpairResult586 : ZVal.getIterable(rToArrayCast(needles), env, true)) {
                needle = ZVal.assign(zpairResult586.getValue());
                if (ZVal.strictEqualityCheck(
                        function_substr
                                .f
                                .env(env)
                                .call(
                                        haystack,
                                        ZVal.minusSign(
                                                function_strlen.f.env(env).call(needle).value()))
                                .value(),
                        "===",
                        toStringR(needle, env))) {
                    return ZVal.assign(true);
                }
            }

            return ZVal.assign(false);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "cap")
        public Object finish(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object cap = assignParameter(args, 1, false);
            Object quoted = null;
            quoted = NamespaceGlobal.preg_quote.env(env).call(cap, "/").value();
            return ZVal.assign(
                    toStringR(
                                    function_preg_replace
                                            .f
                                            .env(env)
                                            .call(
                                                    "/(?:" + toStringR(quoted, env) + ")+$/u",
                                                    "",
                                                    value)
                                            .value(),
                                    env)
                            + toStringR(cap, env));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "pattern")
        @ConvertedParameter(index = 1, name = "value")
        public Object is(RuntimeEnv env, Object... args) {
            Object pattern = assignParameter(args, 0, false);
            Object value = assignParameter(args, 1, false);
            Object patterns = null;
            patterns = Arr.runtimeStaticObject.wrap(env, pattern);
            if (ZVal.isEmpty(patterns)) {
                return ZVal.assign(false);
            }

            for (ZPair zpairResult587 : ZVal.getIterable(patterns, env, true)) {
                pattern = ZVal.assign(zpairResult587.getValue());
                if (ZVal.equalityCheck(pattern, value)) {
                    return ZVal.assign(true);
                }

                pattern = NamespaceGlobal.preg_quote.env(env).call(pattern, "#").value();
                pattern = function_str_replace.f.env(env).call("\\*", ".*", pattern).value();
                if (ZVal.strictEqualityCheck(
                        function_preg_match
                                .f
                                .env(env)
                                .call("#^" + toStringR(pattern, env) + "\\z#u", value)
                                .value(),
                        "===",
                        1)) {
                    return ZVal.assign(true);
                }
            }

            return ZVal.assign(false);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object kebab(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Str.class)
                            .method("snake")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(value, "-")
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(
            index = 1,
            name = "encoding",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object length(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object encoding = assignParameter(args, 1, true);
            if (null == encoding) {
                encoding = ZVal.getNull();
            }
            if (ZVal.isTrue(encoding)) {
                return ZVal.assign(
                        NamespaceGlobal.mb_strlen.env(env).call(value, encoding).value());
            }

            return ZVal.assign(NamespaceGlobal.mb_strlen.env(env).call(value).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(
            index = 1,
            name = "limit",
            defaultValue = "100",
            defaultValueType = "number"
        )
        @ConvertedParameter(index = 2, name = "end")
        public Object limit(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object limit = assignParameter(args, 1, true);
            if (null == limit) {
                limit = 100;
            }
            Object end = assignParameter(args, 2, true);
            if (null == end) {
                end = "...";
            }
            if (ZVal.isLessThanOrEqualTo(
                    NamespaceGlobal.mb_strwidth.env(env).call(value, "UTF-8").value(),
                    "<=",
                    limit)) {
                return ZVal.assign(value);
            }

            return ZVal.assign(
                    toStringR(
                                    function_rtrim
                                            .f
                                            .env(env)
                                            .call(
                                                    NamespaceGlobal.mb_strimwidth
                                                            .env(env)
                                                            .call(value, 0, limit, "", "UTF-8")
                                                            .value())
                                            .value(),
                                    env)
                            + toStringR(end, env));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object lower(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            return ZVal.assign(NamespaceGlobal.mb_strtolower.env(env).call(value, "UTF-8").value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(
            index = 1,
            name = "words",
            defaultValue = "100",
            defaultValueType = "number"
        )
        @ConvertedParameter(index = 2, name = "end")
        public Object words(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object words = assignParameter(args, 1, true);
            if (null == words) {
                words = 100;
            }
            Object end = assignParameter(args, 2, true);
            if (null == end) {
                end = "...";
            }
            ReferenceContainer matches = new BasicReferenceContainer(null);
            function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call(
                            "/^\\s*+(?:\\S++\\s*+){1," + toStringR(words, env) + "}/u",
                            value,
                            matches.getObject());
            if (ZVal.toBool(!arrayActionR(ArrayAction.ISSET, matches, env, 0))
                    || ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Str.class)
                                            .method("length")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(value)
                                            .value(),
                                    "===",
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Str.class)
                                            .method("length")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(matches.arrayGet(env, 0))
                                            .value()))) {
                return ZVal.assign(value);
            }

            return ZVal.assign(
                    toStringR(function_rtrim.f.env(env).call(matches.arrayGet(env, 0)).value(), env)
                            + toStringR(end, env));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "callback")
        @ConvertedParameter(
            index = 1,
            name = "default",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object parseCallback(RuntimeEnv env, Object... args) {
            Object callback = assignParameter(args, 0, false);
            Object _pDefault = assignParameter(args, 1, true);
            if (null == _pDefault) {
                _pDefault = ZVal.getNull();
            }
            return ZVal.assign(
                    ZVal.isTrue(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Str.class)
                                            .method("contains")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(callback, "@")
                                            .value())
                            ? function_explode.f.env(env).call("@", callback, 2).value()
                            : ZVal.newArray(new ZPair(0, callback), new ZPair(1, _pDefault)));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(
            index = 1,
            name = "count",
            defaultValue = "2",
            defaultValueType = "number"
        )
        public Object plural(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object count = assignParameter(args, 1, true);
            if (null == count) {
                count = 2;
            }
            return ZVal.assign(Pluralizer.runtimeStaticObject.plural(env, value, count));
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "length",
            defaultValue = "16",
            defaultValueType = "number"
        )
        public Object random(RuntimeEnv env, Object... args) {
            Object length = assignParameter(args, 0, true);
            if (null == length) {
                length = 16;
            }
            Object string = null;
            Object size = null;
            Object len = null;
            Object bytes = null;
            string = "";
            while (ZVal.isLessThan(
                    len = function_strlen.f.env(env).call(string).value(), '<', length)) {
                size = ZVal.subtract(length, len);
                bytes = function_random_bytes.f.env(env).call(size).value();
                string =
                        toStringR(string, env)
                                + toStringR(
                                        function_substr
                                                .f
                                                .env(env)
                                                .call(
                                                        function_str_replace
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        ZVal.arrayFromList(
                                                                                "/", "+", "="),
                                                                        "",
                                                                        NamespaceGlobal
                                                                                .base64_encode
                                                                                .env(env)
                                                                                .call(bytes)
                                                                                .value())
                                                                .value(),
                                                        0,
                                                        size)
                                                .value(),
                                        env);
            }

            return ZVal.assign(string);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "search")
        @ConvertedParameter(index = 1, name = "replace", typeHint = "array")
        @ConvertedParameter(index = 2, name = "subject")
        public Object replaceArray(RuntimeEnv env, Object... args) {
            Object search = assignParameter(args, 0, false);
            Object replace = assignParameter(args, 1, false);
            Object subject = assignParameter(args, 2, false);
            Object value = null;
            for (ZPair zpairResult588 : ZVal.getIterable(replace, env, true)) {
                value = ZVal.assign(zpairResult588.getValue());
                subject =
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Str.class)
                                .method("replaceFirst")
                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                .call(search, value, subject)
                                .value();
            }

            return ZVal.assign(subject);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "search")
        @ConvertedParameter(index = 1, name = "replace")
        @ConvertedParameter(index = 2, name = "subject")
        public Object replaceFirst(RuntimeEnv env, Object... args) {
            Object search = assignParameter(args, 0, false);
            Object replace = assignParameter(args, 1, false);
            Object subject = assignParameter(args, 2, false);
            Object position = null;
            if (ZVal.equalityCheck(search, "")) {
                return ZVal.assign(subject);
            }

            position = function_strpos.f.env(env).call(subject, search).value();
            if (ZVal.strictNotEqualityCheck(position, "!==", false)) {
                return ZVal.assign(
                        NamespaceGlobal.substr_replace
                                .env(env)
                                .call(
                                        subject,
                                        replace,
                                        position,
                                        function_strlen.f.env(env).call(search).value())
                                .value());
            }

            return ZVal.assign(subject);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "search")
        @ConvertedParameter(index = 1, name = "replace")
        @ConvertedParameter(index = 2, name = "subject")
        public Object replaceLast(RuntimeEnv env, Object... args) {
            Object search = assignParameter(args, 0, false);
            Object replace = assignParameter(args, 1, false);
            Object subject = assignParameter(args, 2, false);
            Object position = null;
            position = NamespaceGlobal.strrpos.env(env).call(subject, search).value();
            if (ZVal.strictNotEqualityCheck(position, "!==", false)) {
                return ZVal.assign(
                        NamespaceGlobal.substr_replace
                                .env(env)
                                .call(
                                        subject,
                                        replace,
                                        position,
                                        function_strlen.f.env(env).call(search).value())
                                .value());
            }

            return ZVal.assign(subject);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "prefix")
        public Object start(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object prefix = assignParameter(args, 1, false);
            Object quoted = null;
            quoted = NamespaceGlobal.preg_quote.env(env).call(prefix, "/").value();
            return ZVal.assign(
                    toStringR(prefix, env)
                            + toStringR(
                                    function_preg_replace
                                            .f
                                            .env(env)
                                            .call(
                                                    "/^(?:" + toStringR(quoted, env) + ")+/u",
                                                    "",
                                                    value)
                                            .value(),
                                    env));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object upper(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            return ZVal.assign(NamespaceGlobal.mb_strtoupper.env(env).call(value, "UTF-8").value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object title(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            return ZVal.assign(
                    NamespaceGlobal.mb_convert_case.env(env).call(value, 2, "UTF-8").value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object singular(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            return ZVal.assign(Pluralizer.runtimeStaticObject.singular(env, value));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "title")
        @ConvertedParameter(index = 1, name = "separator")
        @ConvertedParameter(index = 2, name = "language")
        public Object slug(RuntimeEnv env, Object... args) {
            Object title = assignParameter(args, 0, false);
            Object separator = assignParameter(args, 1, true);
            if (null == separator) {
                separator = "-";
            }
            Object language = assignParameter(args, 2, true);
            if (null == language) {
                language = "en";
            }
            Object flip = null;
            title =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Str.class)
                            .method("ascii")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(title, language)
                            .value();
            flip = ZVal.assign(ZVal.equalityCheck(separator, "-") ? "_" : "-");
            title =
                    function_preg_replace
                            .f
                            .env(env)
                            .call(
                                    "!["
                                            + toStringR(
                                                    NamespaceGlobal.preg_quote
                                                            .env(env)
                                                            .call(flip)
                                                            .value(),
                                                    env)
                                            + "]+!u",
                                    separator,
                                    title)
                            .value();
            title =
                    function_str_replace
                            .f
                            .env(env)
                            .call(
                                    "@",
                                    toStringR(separator, env) + "at" + toStringR(separator, env),
                                    title)
                            .value();
            title =
                    function_preg_replace
                            .f
                            .env(env)
                            .call(
                                    "![^"
                                            + toStringR(
                                                    NamespaceGlobal.preg_quote
                                                            .env(env)
                                                            .call(separator)
                                                            .value(),
                                                    env)
                                            + "\\pL\\pN\\s]+!u",
                                    "",
                                    NamespaceGlobal.mb_strtolower.env(env).call(title).value())
                            .value();
            title =
                    function_preg_replace
                            .f
                            .env(env)
                            .call(
                                    "!["
                                            + toStringR(
                                                    NamespaceGlobal.preg_quote
                                                            .env(env)
                                                            .call(separator)
                                                            .value(),
                                                    env)
                                            + "\\s]+!u",
                                    separator,
                                    title)
                            .value();
            return ZVal.assign(function_trim.f.env(env).call(title, separator).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "delimiter")
        public Object snake(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object delimiter = assignParameter(args, 1, true);
            if (null == delimiter) {
                delimiter = "_";
            }
            Object key = null;
            key = ZVal.assign(value);
            if (arrayActionR(
                    ArrayAction.ISSET,
                    env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Illuminate
                                    .namespaces
                                    .Support
                                    .classes
                                    .Str
                                    .RequestStaticProperties
                                    .class,
                            "snakeCache"),
                    env,
                    key,
                    delimiter)) {
                return ZVal.assign(
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Support
                                                .classes
                                                .Str
                                                .RequestStaticProperties
                                                .class,
                                        "snakeCache")
                                .arrayGet(env, key, delimiter));
            }

            if (!NamespaceGlobal.ctype_lower.env(env).call(value).getBool()) {
                value =
                        function_preg_replace
                                .f
                                .env(env)
                                .call(
                                        "/\\s+/u",
                                        "",
                                        NamespaceGlobal.ucwords.env(env).call(value).value())
                                .value();
                value =
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Str.class)
                                .method("lower")
                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                .call(
                                        function_preg_replace
                                                .f
                                                .env(env)
                                                .call(
                                                        "/(.)(?=[A-Z])/u",
                                                        "$1" + toStringR(delimiter, env),
                                                        value)
                                                .value())
                                .value();
            }

            return ZVal.assign(
                    env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Support
                                            .classes
                                            .Str
                                            .RequestStaticProperties
                                            .class,
                                    "snakeCache")
                            .arrayAccess(env, key, delimiter)
                            .set(value));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "haystack")
        @ConvertedParameter(index = 1, name = "needles")
        public Object startsWith(RuntimeEnv env, Object... args) {
            Object haystack = assignParameter(args, 0, false);
            Object needles = assignParameter(args, 1, false);
            Object needle = null;
            for (ZPair zpairResult589 : ZVal.getIterable(rToArrayCast(needles), env, true)) {
                needle = ZVal.assign(zpairResult589.getValue());
                if (ZVal.toBool(ZVal.strictNotEqualityCheck(needle, "!==", ""))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        function_substr
                                                .f
                                                .env(env)
                                                .call(
                                                        haystack,
                                                        0,
                                                        function_strlen
                                                                .f
                                                                .env(env)
                                                                .call(needle)
                                                                .value())
                                                .value(),
                                        "===",
                                        toStringR(needle, env)))) {
                    return ZVal.assign(true);
                }
            }

            return ZVal.assign(false);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object studly(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object key = null;
            key = ZVal.assign(value);
            if (arrayActionR(
                    ArrayAction.ISSET,
                    env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Illuminate
                                    .namespaces
                                    .Support
                                    .classes
                                    .Str
                                    .RequestStaticProperties
                                    .class,
                            "studlyCache"),
                    env,
                    key)) {
                return ZVal.assign(
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Support
                                                .classes
                                                .Str
                                                .RequestStaticProperties
                                                .class,
                                        "studlyCache")
                                .arrayGet(env, key));
            }

            value =
                    NamespaceGlobal.ucwords
                            .env(env)
                            .call(
                                    function_str_replace
                                            .f
                                            .env(env)
                                            .call(ZVal.arrayFromList("-", "_"), " ", value)
                                            .value())
                            .value();
            return ZVal.assign(
                    env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Support
                                            .classes
                                            .Str
                                            .RequestStaticProperties
                                            .class,
                                    "studlyCache")
                            .arrayAccess(env, key)
                            .set(function_str_replace.f.env(env).call(" ", "", value).value()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "string")
        @ConvertedParameter(index = 1, name = "start")
        @ConvertedParameter(
            index = 2,
            name = "length",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object substr(RuntimeEnv env, Object... args) {
            Object string = assignParameter(args, 0, false);
            Object start = assignParameter(args, 1, false);
            Object length = assignParameter(args, 2, true);
            if (null == length) {
                length = ZVal.getNull();
            }
            return ZVal.assign(
                    NamespaceGlobal.mb_substr
                            .env(env)
                            .call(string, start, length, "UTF-8")
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "string")
        public Object ucfirst(RuntimeEnv env, Object... args) {
            Object string = assignParameter(args, 0, false);
            return ZVal.assign(
                    toStringR(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Str.class)
                                            .method("upper")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(
                                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                    env, this, Str.class)
                                                            .method("substr")
                                                            .addReferenceArgs(
                                                                    new RuntimeArgsWithReferences())
                                                            .call(string, 0, 1)
                                                            .value())
                                            .value(),
                                    env)
                            + toStringR(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Str.class)
                                            .method("substr")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(string, 1)
                                            .value(),
                                    env));
        }

        @ConvertedMethod
        public Object uuid(RuntimeEnv env, Object... args) {
            return ZVal.assign(Uuid.runtimeStaticObject.uuid4(env));
        }

        @ConvertedMethod
        public Object orderedUuid(RuntimeEnv env, Object... args) {
            Object factory = null;
            factory = new UuidFactory(env);
            env.callMethod(
                    factory,
                    "setRandomGenerator",
                    Str.class,
                    new CombGenerator(
                            env,
                            env.callMethod(factory, "getRandomGenerator", Str.class),
                            env.callMethod(factory, "getNumberConverter", Str.class)));
            env.callMethod(
                    factory,
                    "setCodec",
                    Str.class,
                    new TimestampFirstCombCodec(
                            env, env.callMethod(factory, "getUuidBuilder", Str.class)));
            return ZVal.assign(env.callMethod(factory, "uuid4", Str.class));
        }

        @ConvertedMethod
        protected Object charsArray(RuntimeEnv env, Object... args) {
            ReferenceContainer charsArray = new BasicReferenceContainer(null);
            charsArray = env.getInlineStatic(9, null);
            if (ZVal.isset(charsArray.getObject())) {
                return ZVal.assign(charsArray.getObject());
            }

            return ZVal.assign(
                    charsArray.setObject(
                            ZVal.arrayFromLambdaExpression(
                                    /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                    () -> {
                                        return ZVal.newArray(
                                                new ZPair(
                                                        "0",
                                                        ZVal.arrayFromList(
                                                                "\u00B0", "\u2080", "\u06F0",
                                                                "\uFF10")),
                                                new ZPair(
                                                        "1",
                                                        ZVal.arrayFromList(
                                                                "\u00B9", "\u2081", "\u06F1",
                                                                "\uFF11")),
                                                new ZPair(
                                                        "2",
                                                        ZVal.arrayFromList(
                                                                "\u00B2", "\u2082", "\u06F2",
                                                                "\uFF12")),
                                                new ZPair(
                                                        "3",
                                                        ZVal.arrayFromList(
                                                                "\u00B3", "\u2083", "\u06F3",
                                                                "\uFF13")),
                                                new ZPair(
                                                        "4",
                                                        ZVal.arrayFromList(
                                                                "\u2074", "\u2084", "\u06F4",
                                                                "\u0664", "\uFF14")),
                                                new ZPair(
                                                        "5",
                                                        ZVal.arrayFromList(
                                                                "\u2075", "\u2085", "\u06F5",
                                                                "\u0665", "\uFF15")),
                                                new ZPair(
                                                        "6",
                                                        ZVal.arrayFromList(
                                                                "\u2076", "\u2086", "\u06F6",
                                                                "\u0666", "\uFF16")),
                                                new ZPair(
                                                        "7",
                                                        ZVal.arrayFromList(
                                                                "\u2077", "\u2087", "\u06F7",
                                                                "\uFF17")),
                                                new ZPair(
                                                        "8",
                                                        ZVal.arrayFromList(
                                                                "\u2078", "\u2088", "\u06F8",
                                                                "\uFF18")),
                                                new ZPair(
                                                        "9",
                                                        ZVal.arrayFromList(
                                                                "\u2079", "\u2089", "\u06F9",
                                                                "\uFF19")),
                                                new ZPair(
                                                        "a",
                                                        ZVal.arrayFromLambdaExpression(
                                                                /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                                                () -> {
                                                                    return ZVal.arrayFromList(
                                                                            "\u00E0", "\u00E1",
                                                                            "\u1EA3", "\u00E3",
                                                                            "\u1EA1", "\u0103",
                                                                            "\u1EAF", "\u1EB1",
                                                                            "\u1EB3", "\u1EB5",
                                                                            "\u1EB7", "\u00E2",
                                                                            "\u1EA5", "\u1EA7",
                                                                            "\u1EA9", "\u1EAB",
                                                                            "\u1EAD", "\u0101",
                                                                            "\u0105", "\u00E5",
                                                                            "\u03B1", "\u03AC",
                                                                            "\u1F00", "\u1F01",
                                                                            "\u1F02", "\u1F03",
                                                                            "\u1F04", "\u1F05",
                                                                            "\u1F06", "\u1F07",
                                                                            "\u1F80", "\u1F81",
                                                                            "\u1F82", "\u1F83",
                                                                            "\u1F84", "\u1F85",
                                                                            "\u1F86", "\u1F87",
                                                                            "\u1F70", "\u03AC",
                                                                            "\u1FB0", "\u1FB1",
                                                                            "\u1FB2", "\u1FB3",
                                                                            "\u1FB4", "\u1FB6",
                                                                            "\u1FB7", "\u0430",
                                                                            "\u0623", "\u1021",
                                                                            "\u102C", "\u102B",
                                                                            "\u01FB", "\u01CE",
                                                                            "\u00AA", "\u10D0",
                                                                            "\u0905", "\u0627",
                                                                            "\uFF41", "\u00E4");
                                                                })),
                                                new ZPair(
                                                        "b",
                                                        ZVal.arrayFromList(
                                                                "\u0431", "\u03B2", "\u0628",
                                                                "\u1017", "\u10D1", "\uFF42")),
                                                new ZPair(
                                                        "c",
                                                        ZVal.arrayFromList(
                                                                "\u00E7", "\u0107", "\u010D",
                                                                "\u0109", "\u010B", "\uFF43")),
                                                new ZPair(
                                                        "d",
                                                        ZVal.arrayFromList(
                                                                "\u010F", "\u00F0", "\u0111",
                                                                "\u018C", "\u0221", "\u0256",
                                                                "\u0257", "\u1D6D", "\u1D81",
                                                                "\u1D91", "\u0434", "\u03B4",
                                                                "\u062F", "\u0636", "\u100D",
                                                                "\u1012", "\u10D3", "\uFF44")),
                                                new ZPair(
                                                        "e",
                                                        ZVal.arrayFromLambdaExpression(
                                                                /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                                                () -> {
                                                                    return ZVal.arrayFromList(
                                                                            "\u00E9", "\u00E8",
                                                                            "\u1EBB", "\u1EBD",
                                                                            "\u1EB9", "\u00EA",
                                                                            "\u1EBF", "\u1EC1",
                                                                            "\u1EC3", "\u1EC5",
                                                                            "\u1EC7", "\u00EB",
                                                                            "\u0113", "\u0119",
                                                                            "\u011B", "\u0115",
                                                                            "\u0117", "\u03B5",
                                                                            "\u03AD", "\u1F10",
                                                                            "\u1F11", "\u1F12",
                                                                            "\u1F13", "\u1F14",
                                                                            "\u1F15", "\u1F72",
                                                                            "\u03AD", "\u0435",
                                                                            "\u0451", "\u044D",
                                                                            "\u0454", "\u0259",
                                                                            "\u1027", "\u1031",
                                                                            "\u1032", "\u10D4",
                                                                            "\u090F", "\u0625",
                                                                            "\u0626", "\uFF45");
                                                                })),
                                                new ZPair(
                                                        "f",
                                                        ZVal.arrayFromList(
                                                                "\u0444", "\u03C6", "\u0641",
                                                                "\u0192", "\u10E4", "\uFF46")),
                                                new ZPair(
                                                        "g",
                                                        ZVal.arrayFromList(
                                                                "\u011D", "\u011F", "\u0121",
                                                                "\u0123", "\u0433", "\u0491",
                                                                "\u03B3", "\u1002", "\u10D2",
                                                                "\u06AF", "\uFF47")),
                                                new ZPair(
                                                        "h",
                                                        ZVal.arrayFromList(
                                                                "\u0125", "\u0127", "\u03B7",
                                                                "\u03AE", "\u062D", "\u0647",
                                                                "\u101F", "\u103E", "\u10F0",
                                                                "\uFF48")),
                                                new ZPair(
                                                        "i",
                                                        ZVal.arrayFromLambdaExpression(
                                                                /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                                                () -> {
                                                                    return ZVal.arrayFromList(
                                                                            "\u00ED",
                                                                            "\u00EC",
                                                                            "\u1EC9",
                                                                            "\u0129",
                                                                            "\u1ECB",
                                                                            "\u00EE",
                                                                            "\u00EF",
                                                                            "\u012B",
                                                                            "\u012D",
                                                                            "\u012F",
                                                                            "\u0131",
                                                                            "\u03B9",
                                                                            "\u03AF",
                                                                            "\u03CA",
                                                                            "\u0390",
                                                                            "\u1F30",
                                                                            "\u1F31",
                                                                            "\u1F32",
                                                                            "\u1F33",
                                                                            "\u1F34",
                                                                            "\u1F35",
                                                                            "\u1F36",
                                                                            "\u1F37",
                                                                            "\u1F76",
                                                                            "\u03AF",
                                                                            "\u1FD0",
                                                                            "\u1FD1",
                                                                            "\u1FD2",
                                                                            "\u0390",
                                                                            "\u1FD6",
                                                                            "\u1FD7",
                                                                            "\u0456",
                                                                            "\u0457",
                                                                            "\u0438",
                                                                            "\u1023",
                                                                            "\u102D",
                                                                            "\u102E",
                                                                            "\u100A\u103A",
                                                                            "\u01D0",
                                                                            "\u10D8",
                                                                            "\u0907",
                                                                            "\u06CC",
                                                                            "\uFF49");
                                                                })),
                                                new ZPair(
                                                        "j",
                                                        ZVal.arrayFromList(
                                                                "\u0135", "\u0458", "\u0408",
                                                                "\u10EF", "\u062C", "\uFF4A")),
                                                new ZPair(
                                                        "k",
                                                        ZVal.arrayFromList(
                                                                "\u0137", "\u0138", "\u043A",
                                                                "\u03BA", "\u0136", "\u0642",
                                                                "\u0643", "\u1000", "\u10D9",
                                                                "\u10E5", "\u06A9", "\uFF4B")),
                                                new ZPair(
                                                        "l",
                                                        ZVal.arrayFromList(
                                                                "\u0142", "\u013E", "\u013A",
                                                                "\u013C", "\u0140", "\u043B",
                                                                "\u03BB", "\u0644", "\u101C",
                                                                "\u10DA", "\uFF4C")),
                                                new ZPair(
                                                        "m",
                                                        ZVal.arrayFromList(
                                                                "\u043C", "\u03BC", "\u0645",
                                                                "\u1019", "\u10DB", "\uFF4D")),
                                                new ZPair(
                                                        "n",
                                                        ZVal.arrayFromList(
                                                                "\u00F1", "\u0144", "\u0148",
                                                                "\u0146", "\u0149", "\u014B",
                                                                "\u03BD", "\u043D", "\u0646",
                                                                "\u1014", "\u10DC", "\uFF4E")),
                                                new ZPair(
                                                        "o",
                                                        ZVal.arrayFromLambdaExpression(
                                                                /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                                                () -> {
                                                                    return ZVal.arrayFromList(
                                                                            "\u00F3",
                                                                            "\u00F2",
                                                                            "\u1ECF",
                                                                            "\u00F5",
                                                                            "\u1ECD",
                                                                            "\u00F4",
                                                                            "\u1ED1",
                                                                            "\u1ED3",
                                                                            "\u1ED5",
                                                                            "\u1ED7",
                                                                            "\u1ED9",
                                                                            "\u01A1",
                                                                            "\u1EDB",
                                                                            "\u1EDD",
                                                                            "\u1EDF",
                                                                            "\u1EE1",
                                                                            "\u1EE3",
                                                                            "\u00F8",
                                                                            "\u014D",
                                                                            "\u0151",
                                                                            "\u014F",
                                                                            "\u03BF",
                                                                            "\u1F40",
                                                                            "\u1F41",
                                                                            "\u1F42",
                                                                            "\u1F43",
                                                                            "\u1F44",
                                                                            "\u1F45",
                                                                            "\u1F78",
                                                                            "\u03CC",
                                                                            "\u043E",
                                                                            "\u0648",
                                                                            "\u03B8",
                                                                            "\u102D\u102F",
                                                                            "\u01D2",
                                                                            "\u01FF",
                                                                            "\u00BA",
                                                                            "\u10DD",
                                                                            "\u0913",
                                                                            "\uFF4F",
                                                                            "\u00F6");
                                                                })),
                                                new ZPair(
                                                        "p",
                                                        ZVal.arrayFromList(
                                                                "\u043F", "\u03C0", "\u1015",
                                                                "\u10DE", "\u067E", "\uFF50")),
                                                new ZPair(
                                                        "q",
                                                        ZVal.arrayFromList("\u10E7", "\uFF51")),
                                                new ZPair(
                                                        "r",
                                                        ZVal.arrayFromList(
                                                                "\u0155", "\u0159", "\u0157",
                                                                "\u0440", "\u03C1", "\u0631",
                                                                "\u10E0", "\uFF52")),
                                                new ZPair(
                                                        "s",
                                                        ZVal.arrayFromList(
                                                                "\u015B", "\u0161", "\u015F",
                                                                "\u0441", "\u03C3", "\u0219",
                                                                "\u03C2", "\u0633", "\u0635",
                                                                "\u1005", "\u017F", "\u10E1",
                                                                "\uFF53")),
                                                new ZPair(
                                                        "t",
                                                        ZVal.arrayFromList(
                                                                "\u0165", "\u0163", "\u0442",
                                                                "\u03C4", "\u021B", "\u062A",
                                                                "\u0637", "\u100B", "\u1010",
                                                                "\u0167", "\u10D7", "\u10E2",
                                                                "\uFF54")),
                                                new ZPair(
                                                        "u",
                                                        ZVal.arrayFromLambdaExpression(
                                                                /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                                                () -> {
                                                                    return ZVal.arrayFromList(
                                                                            "\u00FA", "\u00F9",
                                                                            "\u1EE7", "\u0169",
                                                                            "\u1EE5", "\u01B0",
                                                                            "\u1EE9", "\u1EEB",
                                                                            "\u1EED", "\u1EEF",
                                                                            "\u1EF1", "\u00FB",
                                                                            "\u016B", "\u016F",
                                                                            "\u0171", "\u016D",
                                                                            "\u0173", "\u00B5",
                                                                            "\u0443", "\u1009",
                                                                            "\u102F", "\u1030",
                                                                            "\u01D4", "\u01D6",
                                                                            "\u01D8", "\u01DA",
                                                                            "\u01DC", "\u10E3",
                                                                            "\u0909", "\uFF55",
                                                                            "\u045E", "\u00FC");
                                                                })),
                                                new ZPair(
                                                        "v",
                                                        ZVal.arrayFromList(
                                                                "\u0432", "\u10D5", "\u03D0",
                                                                "\uFF56")),
                                                new ZPair(
                                                        "w",
                                                        ZVal.arrayFromList(
                                                                "\u0175", "\u03C9", "\u03CE",
                                                                "\u101D", "\u103D", "\uFF57")),
                                                new ZPair(
                                                        "x",
                                                        ZVal.arrayFromList(
                                                                "\u03C7", "\u03BE", "\uFF58")),
                                                new ZPair(
                                                        "y",
                                                        ZVal.arrayFromList(
                                                                "\u00FD", "\u1EF3", "\u1EF7",
                                                                "\u1EF9", "\u1EF5", "\u00FF",
                                                                "\u0177", "\u0439", "\u044B",
                                                                "\u03C5", "\u03CB", "\u03CD",
                                                                "\u03B0", "\u064A", "\u101A",
                                                                "\uFF59")),
                                                new ZPair(
                                                        "z",
                                                        ZVal.arrayFromList(
                                                                "\u017A", "\u017E", "\u017C",
                                                                "\u0437", "\u03B6", "\u0632",
                                                                "\u1007", "\u10D6", "\uFF5A")),
                                                new ZPair(
                                                        "aa",
                                                        ZVal.arrayFromList(
                                                                "\u0639", "\u0906", "\u0622")),
                                                new ZPair(
                                                        "ae",
                                                        ZVal.arrayFromList("\u00E6", "\u01FD")),
                                                new ZPair("ai", ZVal.arrayFromList("\u0910")),
                                                new ZPair(
                                                        "ch",
                                                        ZVal.arrayFromList(
                                                                "\u0447", "\u10E9", "\u10ED",
                                                                "\u0686")),
                                                new ZPair(
                                                        "dj",
                                                        ZVal.arrayFromList("\u0452", "\u0111")),
                                                new ZPair(
                                                        "dz",
                                                        ZVal.arrayFromList("\u045F", "\u10EB")),
                                                new ZPair("ei", ZVal.arrayFromList("\u090D")),
                                                new ZPair(
                                                        "gh",
                                                        ZVal.arrayFromList("\u063A", "\u10E6")),
                                                new ZPair("ii", ZVal.arrayFromList("\u0908")),
                                                new ZPair("ij", ZVal.arrayFromList("\u0133")),
                                                new ZPair(
                                                        "kh",
                                                        ZVal.arrayFromList(
                                                                "\u0445", "\u062E", "\u10EE")),
                                                new ZPair("lj", ZVal.arrayFromList("\u0459")),
                                                new ZPair("nj", ZVal.arrayFromList("\u045A")),
                                                new ZPair(
                                                        "oe",
                                                        ZVal.arrayFromList(
                                                                "\u00F6", "\u0153", "\u0624")),
                                                new ZPair("oi", ZVal.arrayFromList("\u0911")),
                                                new ZPair("oii", ZVal.arrayFromList("\u0912")),
                                                new ZPair("ps", ZVal.arrayFromList("\u03C8")),
                                                new ZPair(
                                                        "sh",
                                                        ZVal.arrayFromList(
                                                                "\u0448", "\u10E8", "\u0634")),
                                                new ZPair("shch", ZVal.arrayFromList("\u0449")),
                                                new ZPair("ss", ZVal.arrayFromList("\u00DF")),
                                                new ZPair("sx", ZVal.arrayFromList("\u015D")),
                                                new ZPair(
                                                        "th",
                                                        ZVal.arrayFromList(
                                                                "\u00FE", "\u03D1", "\u062B",
                                                                "\u0630", "\u0638")),
                                                new ZPair(
                                                        "ts",
                                                        ZVal.arrayFromList(
                                                                "\u0446", "\u10EA", "\u10EC")),
                                                new ZPair("ue", ZVal.arrayFromList("\u00FC")),
                                                new ZPair("uu", ZVal.arrayFromList("\u090A")),
                                                new ZPair("ya", ZVal.arrayFromList("\u044F")),
                                                new ZPair("yu", ZVal.arrayFromList("\u044E")),
                                                new ZPair(
                                                        "zh",
                                                        ZVal.arrayFromList(
                                                                "\u0436", "\u10DF", "\u0698")),
                                                new ZPair("(c)", ZVal.arrayFromList("\u00A9")),
                                                new ZPair(
                                                        "A",
                                                        ZVal.arrayFromLambdaExpression(
                                                                /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                                                () -> {
                                                                    return ZVal.arrayFromList(
                                                                            "\u00C1", "\u00C0",
                                                                            "\u1EA2", "\u00C3",
                                                                            "\u1EA0", "\u0102",
                                                                            "\u1EAE", "\u1EB0",
                                                                            "\u1EB2", "\u1EB4",
                                                                            "\u1EB6", "\u00C2",
                                                                            "\u1EA4", "\u1EA6",
                                                                            "\u1EA8", "\u1EAA",
                                                                            "\u1EAC", "\u00C5",
                                                                            "\u0100", "\u0104",
                                                                            "\u0391", "\u0386",
                                                                            "\u1F08", "\u1F09",
                                                                            "\u1F0A", "\u1F0B",
                                                                            "\u1F0C", "\u1F0D",
                                                                            "\u1F0E", "\u1F0F",
                                                                            "\u1F88", "\u1F89",
                                                                            "\u1F8A", "\u1F8B",
                                                                            "\u1F8C", "\u1F8D",
                                                                            "\u1F8E", "\u1F8F",
                                                                            "\u1FB8", "\u1FB9",
                                                                            "\u1FBA", "\u0386",
                                                                            "\u1FBC", "\u0410",
                                                                            "\u01FA", "\u01CD",
                                                                            "\uFF21", "\u00C4");
                                                                })),
                                                new ZPair(
                                                        "B",
                                                        ZVal.arrayFromList(
                                                                "\u0411", "\u0392", "\u092C",
                                                                "\uFF22")),
                                                new ZPair(
                                                        "C",
                                                        ZVal.arrayFromList(
                                                                "\u00C7", "\u0106", "\u010C",
                                                                "\u0108", "\u010A", "\uFF23")),
                                                new ZPair(
                                                        "D",
                                                        ZVal.arrayFromList(
                                                                "\u010E", "\u00D0", "\u0110",
                                                                "\u0189", "\u018A", "\u018B",
                                                                "\u1D05", "\u1D06", "\u0414",
                                                                "\u0394", "\uFF24")),
                                                new ZPair(
                                                        "E",
                                                        ZVal.arrayFromLambdaExpression(
                                                                /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                                                () -> {
                                                                    return ZVal.arrayFromList(
                                                                            "\u00C9", "\u00C8",
                                                                            "\u1EBA", "\u1EBC",
                                                                            "\u1EB8", "\u00CA",
                                                                            "\u1EBE", "\u1EC0",
                                                                            "\u1EC2", "\u1EC4",
                                                                            "\u1EC6", "\u00CB",
                                                                            "\u0112", "\u0118",
                                                                            "\u011A", "\u0114",
                                                                            "\u0116", "\u0395",
                                                                            "\u0388", "\u1F18",
                                                                            "\u1F19", "\u1F1A",
                                                                            "\u1F1B", "\u1F1C",
                                                                            "\u1F1D", "\u0388",
                                                                            "\u1FC8", "\u0415",
                                                                            "\u0401", "\u042D",
                                                                            "\u0404", "\u018F",
                                                                            "\uFF25");
                                                                })),
                                                new ZPair(
                                                        "F",
                                                        ZVal.arrayFromList(
                                                                "\u0424", "\u03A6", "\uFF26")),
                                                new ZPair(
                                                        "G",
                                                        ZVal.arrayFromList(
                                                                "\u011E", "\u0120", "\u0122",
                                                                "\u0413", "\u0490", "\u0393",
                                                                "\uFF27")),
                                                new ZPair(
                                                        "H",
                                                        ZVal.arrayFromList(
                                                                "\u0397", "\u0389", "\u0126",
                                                                "\uFF28")),
                                                new ZPair(
                                                        "I",
                                                        ZVal.arrayFromLambdaExpression(
                                                                /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                                                () -> {
                                                                    return ZVal.arrayFromList(
                                                                            "\u00CD", "\u00CC",
                                                                            "\u1EC8", "\u0128",
                                                                            "\u1ECA", "\u00CE",
                                                                            "\u00CF", "\u012A",
                                                                            "\u012C", "\u012E",
                                                                            "\u0130", "\u0399",
                                                                            "\u038A", "\u03AA",
                                                                            "\u1F38", "\u1F39",
                                                                            "\u1F3B", "\u1F3C",
                                                                            "\u1F3D", "\u1F3E",
                                                                            "\u1F3F", "\u1FD8",
                                                                            "\u1FD9", "\u1FDA",
                                                                            "\u038A", "\u0418",
                                                                            "\u0406", "\u0407",
                                                                            "\u01CF", "\u03D2",
                                                                            "\uFF29");
                                                                })),
                                                new ZPair("J", ZVal.arrayFromList("\uFF2A")),
                                                new ZPair(
                                                        "K",
                                                        ZVal.arrayFromList(
                                                                "\u041A", "\u039A", "\uFF2B")),
                                                new ZPair(
                                                        "L",
                                                        ZVal.arrayFromList(
                                                                "\u0139", "\u0141", "\u041B",
                                                                "\u039B", "\u013B", "\u013D",
                                                                "\u013F", "\u0932", "\uFF2C")),
                                                new ZPair(
                                                        "M",
                                                        ZVal.arrayFromList(
                                                                "\u041C", "\u039C", "\uFF2D")),
                                                new ZPair(
                                                        "N",
                                                        ZVal.arrayFromList(
                                                                "\u0143", "\u00D1", "\u0147",
                                                                "\u0145", "\u014A", "\u041D",
                                                                "\u039D", "\uFF2E")),
                                                new ZPair(
                                                        "O",
                                                        ZVal.arrayFromLambdaExpression(
                                                                /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                                                () -> {
                                                                    return ZVal.arrayFromList(
                                                                            "\u00D3", "\u00D2",
                                                                            "\u1ECE", "\u00D5",
                                                                            "\u1ECC", "\u00D4",
                                                                            "\u1ED0", "\u1ED2",
                                                                            "\u1ED4", "\u1ED6",
                                                                            "\u1ED8", "\u01A0",
                                                                            "\u1EDA", "\u1EDC",
                                                                            "\u1EDE", "\u1EE0",
                                                                            "\u1EE2", "\u00D8",
                                                                            "\u014C", "\u0150",
                                                                            "\u014E", "\u039F",
                                                                            "\u038C", "\u1F48",
                                                                            "\u1F49", "\u1F4A",
                                                                            "\u1F4B", "\u1F4C",
                                                                            "\u1F4D", "\u1FF8",
                                                                            "\u038C", "\u041E",
                                                                            "\u0398", "\u04E8",
                                                                            "\u01D1", "\u01FE",
                                                                            "\uFF2F", "\u00D6");
                                                                })),
                                                new ZPair(
                                                        "P",
                                                        ZVal.arrayFromList(
                                                                "\u041F", "\u03A0", "\uFF30")),
                                                new ZPair("Q", ZVal.arrayFromList("\uFF31")),
                                                new ZPair(
                                                        "R",
                                                        ZVal.arrayFromList(
                                                                "\u0158", "\u0154", "\u0420",
                                                                "\u03A1", "\u0156", "\uFF32")),
                                                new ZPair(
                                                        "S",
                                                        ZVal.arrayFromList(
                                                                "\u015E", "\u015C", "\u0218",
                                                                "\u0160", "\u015A", "\u0421",
                                                                "\u03A3", "\uFF33")),
                                                new ZPair(
                                                        "T",
                                                        ZVal.arrayFromList(
                                                                "\u0164", "\u0162", "\u0166",
                                                                "\u021A", "\u0422", "\u03A4",
                                                                "\uFF34")),
                                                new ZPair(
                                                        "U",
                                                        ZVal.arrayFromLambdaExpression(
                                                                /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                                                () -> {
                                                                    return ZVal.arrayFromList(
                                                                            "\u00DA", "\u00D9",
                                                                            "\u1EE6", "\u0168",
                                                                            "\u1EE4", "\u01AF",
                                                                            "\u1EE8", "\u1EEA",
                                                                            "\u1EEC", "\u1EEE",
                                                                            "\u1EF0", "\u00DB",
                                                                            "\u016A", "\u016E",
                                                                            "\u0170", "\u016C",
                                                                            "\u0172", "\u0423",
                                                                            "\u01D3", "\u01D5",
                                                                            "\u01D7", "\u01D9",
                                                                            "\u01DB", "\uFF35",
                                                                            "\u040E", "\u00DC");
                                                                })),
                                                new ZPair(
                                                        "V",
                                                        ZVal.arrayFromList("\u0412", "\uFF36")),
                                                new ZPair(
                                                        "W",
                                                        ZVal.arrayFromList(
                                                                "\u03A9", "\u038F", "\u0174",
                                                                "\uFF37")),
                                                new ZPair(
                                                        "X",
                                                        ZVal.arrayFromList(
                                                                "\u03A7", "\u039E", "\uFF38")),
                                                new ZPair(
                                                        "Y",
                                                        ZVal.arrayFromList(
                                                                "\u00DD", "\u1EF2", "\u1EF6",
                                                                "\u1EF8", "\u1EF4", "\u0178",
                                                                "\u1FE8", "\u1FE9", "\u1FEA",
                                                                "\u038E", "\u042B", "\u0419",
                                                                "\u03A5", "\u03AB", "\u0176",
                                                                "\uFF39")),
                                                new ZPair(
                                                        "Z",
                                                        ZVal.arrayFromList(
                                                                "\u0179", "\u017D", "\u017B",
                                                                "\u0417", "\u0396", "\uFF3A")),
                                                new ZPair(
                                                        "AE",
                                                        ZVal.arrayFromList("\u00C6", "\u01FC")),
                                                new ZPair("Ch", ZVal.arrayFromList("\u0427")),
                                                new ZPair("Dj", ZVal.arrayFromList("\u0402")),
                                                new ZPair("Dz", ZVal.arrayFromList("\u040F")),
                                                new ZPair("Gx", ZVal.arrayFromList("\u011C")),
                                                new ZPair("Hx", ZVal.arrayFromList("\u0124")),
                                                new ZPair("Ij", ZVal.arrayFromList("\u0132")),
                                                new ZPair("Jx", ZVal.arrayFromList("\u0134")),
                                                new ZPair("Kh", ZVal.arrayFromList("\u0425")),
                                                new ZPair("Lj", ZVal.arrayFromList("\u0409")),
                                                new ZPair("Nj", ZVal.arrayFromList("\u040A")),
                                                new ZPair("Oe", ZVal.arrayFromList("\u0152")),
                                                new ZPair("Ps", ZVal.arrayFromList("\u03A8")),
                                                new ZPair("Sh", ZVal.arrayFromList("\u0428")),
                                                new ZPair("Shch", ZVal.arrayFromList("\u0429")),
                                                new ZPair("Ss", ZVal.arrayFromList("\u1E9E")),
                                                new ZPair("Th", ZVal.arrayFromList("\u00DE")),
                                                new ZPair("Ts", ZVal.arrayFromList("\u0426")),
                                                new ZPair("Ya", ZVal.arrayFromList("\u042F")),
                                                new ZPair("Yu", ZVal.arrayFromList("\u042E")),
                                                new ZPair("Zh", ZVal.arrayFromList("\u0416")),
                                                new ZPair(
                                                        " ",
                                                        ZVal.arrayFromList(
                                                                "\u00A0", "\u2000", "\u2001",
                                                                "\u2002", "\u2003", "\u2004",
                                                                "\u2005", "\u2006", "\u2007",
                                                                "\u2008", "\u2009", "\u200A",
                                                                "\u202F", "\u205F", "\u3000",
                                                                "\uFFA0")));
                                    })));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "language")
        protected Object languageSpecificCharsArray(RuntimeEnv env, Object... args) {
            Object language = assignParameter(args, 0, false);
            ReferenceContainer languageSpecific = new BasicReferenceContainer(null);
            Object ternaryExpressionTemp = null;
            languageSpecific = env.getInlineStatic(10, null);
            if (!ZVal.isset(languageSpecific.getObject())) {
                languageSpecific.setObject(
                        ZVal.newArray(
                                new ZPair(
                                        "bg",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        ZVal.arrayFromList(
                                                                "\u0445", "\u0425", "\u0449",
                                                                "\u0429", "\u044A", "\u042A",
                                                                "\u044C", "\u042C")),
                                                new ZPair(
                                                        1,
                                                        ZVal.arrayFromList(
                                                                "h", "H", "sht", "SHT", "a",
                                                                "\u0410", "y", "Y")))),
                                new ZPair(
                                        "de",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        ZVal.arrayFromList(
                                                                "\u00E4", "\u00F6", "\u00FC",
                                                                "\u00C4", "\u00D6", "\u00DC")),
                                                new ZPair(
                                                        1,
                                                        ZVal.arrayFromList(
                                                                "ae", "oe", "ue", "AE", "OE",
                                                                "UE"))))));
            }

            return ZVal.assign(
                    ZVal.isDefined(ternaryExpressionTemp = languageSpecific.arrayGet(env, language))
                            ? ternaryExpressionTemp
                            : ZVal.getNull());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        @ConvertedParameter(index = 1, name = "macro")
        public Object macro(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            Object macro = assignParameter(args, 1, false);
            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Illuminate
                                    .namespaces
                                    .Support
                                    .classes
                                    .Str
                                    .RequestStaticProperties
                                    .class,
                            "macros")
                    .arrayAccess(env, name)
                    .set(macro);
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "mixin")
        public Object mixin(RuntimeEnv env, Object... args) {
            Object mixin = assignParameter(args, 0, false);
            Object method = null;
            Object methods = null;
            methods =
                    env.callMethod(
                            new ReflectionClass(env, mixin),
                            "getMethods",
                            Str.class,
                            ZVal.toLong(256) | ZVal.toLong(512));
            for (ZPair zpairResult2363 : ZVal.getIterable(methods, env, true)) {
                method = ZVal.assign(zpairResult2363.getValue());
                env.callMethod(method, "setAccessible", Str.class, true);
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Str.class)
                        .method("macro")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                toObjectR(method).accessProp(this, env).name("name").value(),
                                env.callMethod(method, "invoke", Str.class, mixin))
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        public Object hasMacro(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            return ZVal.assign(
                    arrayActionR(
                            ArrayAction.ISSET,
                            env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Support
                                            .classes
                                            .Str
                                            .RequestStaticProperties
                                            .class,
                                    "macros"),
                            env,
                            name));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "method")
        @ConvertedParameter(index = 1, name = "parameters")
        public Object __callStatic(RuntimeEnv env, Object... args) {
            Object method = assignParameter(args, 0, false);
            Object parameters = assignParameter(args, 1, false);
            if (!ZVal.isTrue(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Str.class)
                            .method("hasMacro")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(method)
                            .value())) {
                throw ZVal.getException(
                        env,
                        new BadMethodCallException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Method %s::%s does not exist.",
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "class"),
                                                method)
                                        .value()));
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Illuminate
                                                    .namespaces
                                                    .Support
                                                    .classes
                                                    .Str
                                                    .RequestStaticProperties
                                                    .class,
                                            "macros")
                                    .arrayGet(env, method),
                            Closure.class,
                            "Closure"))) {
                return ZVal.assign(
                        function_call_user_func_array
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(
                                        Closure.runtimeStaticObject.bind(
                                                env,
                                                env.getRequestStaticPropertiesReference(
                                                                com.project
                                                                        .convertedCode
                                                                        .globalNamespace
                                                                        .namespaces
                                                                        .Illuminate
                                                                        .namespaces
                                                                        .Support
                                                                        .classes
                                                                        .Str
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "macros")
                                                        .arrayGet(env, method),
                                                ZVal.getNull(),
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "class")),
                                        parameters)
                                .value());
            }

            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    env.getRequestStaticPropertiesReference(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Illuminate
                                                            .namespaces
                                                            .Support
                                                            .classes
                                                            .Str
                                                            .RequestStaticProperties
                                                            .class,
                                                    "macros")
                                            .arrayGet(env, method),
                                    parameters)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object snakeCache = ZVal.newArray();

        public Object camelCache = ZVal.newArray();

        public Object studlyCache = ZVal.newArray();

        public Object macros = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Support\\Str")
                    .setLookup(
                            Str.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("camelCache", "macros", "snakeCache", "studlyCache")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Support/Str.php")
                    .addTrait("Illuminate\\Support\\Traits\\Macroable")
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
