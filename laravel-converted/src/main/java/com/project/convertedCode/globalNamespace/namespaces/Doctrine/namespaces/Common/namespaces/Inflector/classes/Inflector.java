package com.project.convertedCode.globalNamespace.namespaces.Doctrine.namespaces.Common.namespaces.Inflector.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_flip;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/doctrine/inflector/lib/Doctrine/Common/Inflector/Inflector.php

*/

public class Inflector extends RuntimeClassBase {

    public Inflector(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Inflector(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Doctrine\\Common\\Inflector\\Inflector";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "word", typeHint = "string")
        public Object tableize(RuntimeEnv env, Object... args) {
            Object word = assignParameter(args, 0, false);
            return ZVal.assign(
                    NamespaceGlobal.strtolower
                            .env(env)
                            .call(
                                    function_preg_replace
                                            .f
                                            .env(env)
                                            .call("~(?<=\\w)([A-Z])~", "_$1", word)
                                            .value())
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "word", typeHint = "string")
        public Object classify(RuntimeEnv env, Object... args) {
            Object word = assignParameter(args, 0, false);
            return ZVal.assign(
                    function_str_replace
                            .f
                            .env(env)
                            .call(
                                    ZVal.arrayFromList(" ", "_", "-"),
                                    "",
                                    NamespaceGlobal.ucwords.env(env).call(word, " _-").value())
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "word", typeHint = "string")
        public Object camelize(RuntimeEnv env, Object... args) {
            Object word = assignParameter(args, 0, false);
            return ZVal.assign(
                    NamespaceGlobal.lcfirst
                            .env(env)
                            .call(runtimeStaticObject.classify(env, word))
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "string", typeHint = "string")
        @ConvertedParameter(index = 1, name = "delimiters", typeHint = "string")
        public Object ucwords(RuntimeEnv env, Object... args) {
            Object string = assignParameter(args, 0, false);
            Object delimiters = assignParameter(args, 1, true);
            if (null == delimiters) {
                delimiters = " \n\t\r\u0000\u000B-";
            }
            return ZVal.assign(NamespaceGlobal.ucwords.env(env).call(string, delimiters).value());
        }

        @ConvertedMethod
        public Object reset(RuntimeEnv env, Object... args) {
            Object val = null;
            Object key = null;
            if (ZVal.isEmpty(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Doctrine
                                            .namespaces
                                            .Common
                                            .namespaces
                                            .Inflector
                                            .classes
                                            .Inflector
                                            .RequestStaticProperties
                                            .class)
                            .initialState)) {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Doctrine
                                                .namespaces
                                                .Common
                                                .namespaces
                                                .Inflector
                                                .classes
                                                .Inflector
                                                .RequestStaticProperties
                                                .class)
                                .initialState =
                        NamespaceGlobal.get_class_vars.env(env).call("Inflector").value();
                return null;
            }

            for (ZPair zpairResult10 :
                    ZVal.getIterable(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Doctrine
                                                    .namespaces
                                                    .Common
                                                    .namespaces
                                                    .Inflector
                                                    .classes
                                                    .Inflector
                                                    .RequestStaticProperties
                                                    .class)
                                    .initialState,
                            env,
                            false)) {
                key = ZVal.assign(zpairResult10.getKey());
                val = ZVal.assign(zpairResult10.getValue());
                if (ZVal.strictNotEqualityCheck(key, "!==", "initialState")) {
                    env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Doctrine
                                            .namespaces
                                            .Common
                                            .namespaces
                                            .Inflector
                                            .classes
                                            .Inflector
                                            .RequestStaticProperties
                                            .class,
                                    key)
                            .setObject(val);
                }
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "type", typeHint = "string")
        @ConvertedParameter(index = 1, name = "rules", typeHint = "iterable")
        @ConvertedParameter(
            index = 2,
            name = "reset",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object rules(RuntimeEnv env, Object... args) {
            int runtimeConverterContinueCount;
            Object type = assignParameter(args, 0, false);
            ReferenceContainer rules = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object reset = assignParameter(args, 2, true);
            if (null == reset) {
                reset = false;
            }
            Object pattern = null;
            Object rule = null;
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult11 : ZVal.getIterable(rules.getObject(), env, false)) {
                rule = ZVal.assign(zpairResult11.getKey());
                pattern = ZVal.assign(zpairResult11.getValue());
                if (!function_is_array.f.env(env).call(pattern).getBool()) {
                    continue;
                }

                if (ZVal.isTrue(reset)) {
                    env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Doctrine
                                            .namespaces
                                            .Common
                                            .namespaces
                                            .Inflector
                                            .classes
                                            .Inflector
                                            .RequestStaticProperties
                                            .class,
                                    type)
                            .arrayAccess(env, rule)
                            .set(pattern);

                } else {
                    env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Doctrine
                                            .namespaces
                                            .Common
                                            .namespaces
                                            .Inflector
                                            .classes
                                            .Inflector
                                            .RequestStaticProperties
                                            .class,
                                    type)
                            .arrayAccess(env, rule)
                            .set(
                                    ZVal.strictEqualityCheck(rule, "===", "uninflected")
                                            ? function_array_merge
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            pattern,
                                                            env.getRequestStaticPropertiesReference(
                                                                            com.project
                                                                                    .convertedCode
                                                                                    .globalNamespace
                                                                                    .namespaces
                                                                                    .Doctrine
                                                                                    .namespaces
                                                                                    .Common
                                                                                    .namespaces
                                                                                    .Inflector
                                                                                    .classes
                                                                                    .Inflector
                                                                                    .RequestStaticProperties
                                                                                    .class,
                                                                            type)
                                                                    .arrayGet(env, rule))
                                                    .value()
                                            : ZVal.add(
                                                    pattern,
                                                    env.getRequestStaticPropertiesReference(
                                                                    com.project
                                                                            .convertedCode
                                                                            .globalNamespace
                                                                            .namespaces
                                                                            .Doctrine
                                                                            .namespaces
                                                                            .Common
                                                                            .namespaces
                                                                            .Inflector
                                                                            .classes
                                                                            .Inflector
                                                                            .RequestStaticProperties
                                                                            .class,
                                                                    type)
                                                            .arrayGet(env, rule)));
                }

                arrayActionR(ArrayAction.UNSET, rules, env, rule);
                arrayActionR(
                        ArrayAction.UNSET,
                        env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Doctrine
                                        .namespaces
                                        .Common
                                        .namespaces
                                        .Inflector
                                        .classes
                                        .Inflector
                                        .RequestStaticProperties
                                        .class,
                                type),
                        env,
                        "cache"
                                + toStringR(
                                        NamespaceGlobal.ucfirst.env(env).call(rule).value(), env));
                if (arrayActionR(
                        ArrayAction.ISSET,
                        env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Doctrine
                                        .namespaces
                                        .Common
                                        .namespaces
                                        .Inflector
                                        .classes
                                        .Inflector
                                        .RequestStaticProperties
                                        .class,
                                type),
                        env,
                        "merged",
                        rule)) {
                    arrayActionR(
                            ArrayAction.UNSET,
                            env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Doctrine
                                            .namespaces
                                            .Common
                                            .namespaces
                                            .Inflector
                                            .classes
                                            .Inflector
                                            .RequestStaticProperties
                                            .class,
                                    type),
                            env,
                            "merged",
                            rule);
                }

                if (ZVal.strictEqualityCheck(type, "===", "plural")) {
                    env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Doctrine
                                            .namespaces
                                            .Common
                                            .namespaces
                                            .Inflector
                                            .classes
                                            .Inflector
                                            .RequestStaticProperties
                                            .class,
                                    "cache")
                            .arrayAccess(env, "pluralize")
                            .set(
                                    env.getRequestStaticPropertiesReference(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Doctrine
                                                            .namespaces
                                                            .Common
                                                            .namespaces
                                                            .Inflector
                                                            .classes
                                                            .Inflector
                                                            .RequestStaticProperties
                                                            .class,
                                                    "cache")
                                            .arrayAccess(env, "tableize")
                                            .set(ZVal.newArray()));

                } else if (ZVal.strictEqualityCheck(type, "===", "singular")) {
                    env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Doctrine
                                            .namespaces
                                            .Common
                                            .namespaces
                                            .Inflector
                                            .classes
                                            .Inflector
                                            .RequestStaticProperties
                                            .class,
                                    "cache")
                            .arrayAccess(env, "singularize")
                            .set(ZVal.newArray());
                }
            }

            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Doctrine
                                    .namespaces
                                    .Common
                                    .namespaces
                                    .Inflector
                                    .classes
                                    .Inflector
                                    .RequestStaticProperties
                                    .class,
                            type)
                    .arrayAccess(env, "rules")
                    .set(
                            ZVal.add(
                                    rules.getObject(),
                                    env.getRequestStaticPropertiesReference(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Doctrine
                                                            .namespaces
                                                            .Common
                                                            .namespaces
                                                            .Inflector
                                                            .classes
                                                            .Inflector
                                                            .RequestStaticProperties
                                                            .class,
                                                    type)
                                            .arrayGet(env, "rules")));
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "word", typeHint = "string")
        public Object pluralize(RuntimeEnv env, Object... args) {
            ReferenceContainer word = new BasicReferenceContainer(assignParameter(args, 0, false));
            Object rule = null;
            ReferenceContainer regs = new BasicReferenceContainer(null);
            Object replacement = null;
            if (arrayActionR(
                    ArrayAction.ISSET,
                    env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Doctrine
                                    .namespaces
                                    .Common
                                    .namespaces
                                    .Inflector
                                    .classes
                                    .Inflector
                                    .RequestStaticProperties
                                    .class,
                            "cache"),
                    env,
                    "pluralize",
                    word.getObject())) {
                return ZVal.assign(
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Doctrine
                                                .namespaces
                                                .Common
                                                .namespaces
                                                .Inflector
                                                .classes
                                                .Inflector
                                                .RequestStaticProperties
                                                .class,
                                        "cache")
                                .arrayGet(env, "pluralize", word.getObject()));
            }

            if (!arrayActionR(
                    ArrayAction.ISSET,
                    env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Doctrine
                                    .namespaces
                                    .Common
                                    .namespaces
                                    .Inflector
                                    .classes
                                    .Inflector
                                    .RequestStaticProperties
                                    .class,
                            "plural"),
                    env,
                    "merged",
                    "irregular")) {
                env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Doctrine
                                        .namespaces
                                        .Common
                                        .namespaces
                                        .Inflector
                                        .classes
                                        .Inflector
                                        .RequestStaticProperties
                                        .class,
                                "plural")
                        .arrayAccess(env, "merged", "irregular")
                        .set(
                                env.getRequestStaticPropertiesReference(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Doctrine
                                                        .namespaces
                                                        .Common
                                                        .namespaces
                                                        .Inflector
                                                        .classes
                                                        .Inflector
                                                        .RequestStaticProperties
                                                        .class,
                                                "plural")
                                        .arrayGet(env, "irregular"));
            }

            if (!arrayActionR(
                    ArrayAction.ISSET,
                    env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Doctrine
                                    .namespaces
                                    .Common
                                    .namespaces
                                    .Inflector
                                    .classes
                                    .Inflector
                                    .RequestStaticProperties
                                    .class,
                            "plural"),
                    env,
                    "merged",
                    "uninflected")) {
                env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Doctrine
                                        .namespaces
                                        .Common
                                        .namespaces
                                        .Inflector
                                        .classes
                                        .Inflector
                                        .RequestStaticProperties
                                        .class,
                                "plural")
                        .arrayAccess(env, "merged", "uninflected")
                        .set(
                                function_array_merge
                                        .f
                                        .env(env)
                                        .call(
                                                env.getRequestStaticPropertiesReference(
                                                                com.project
                                                                        .convertedCode
                                                                        .globalNamespace
                                                                        .namespaces
                                                                        .Doctrine
                                                                        .namespaces
                                                                        .Common
                                                                        .namespaces
                                                                        .Inflector
                                                                        .classes
                                                                        .Inflector
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "plural")
                                                        .arrayGet(env, "uninflected"),
                                                env.getRequestStaticProperties(
                                                                com.project
                                                                        .convertedCode
                                                                        .globalNamespace
                                                                        .namespaces
                                                                        .Doctrine
                                                                        .namespaces
                                                                        .Common
                                                                        .namespaces
                                                                        .Inflector
                                                                        .classes
                                                                        .Inflector
                                                                        .RequestStaticProperties
                                                                        .class)
                                                        .uninflected)
                                        .value());
            }

            if (ZVal.toBool(
                            !arrayActionR(
                                    ArrayAction.ISSET,
                                    env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Doctrine
                                                    .namespaces
                                                    .Common
                                                    .namespaces
                                                    .Inflector
                                                    .classes
                                                    .Inflector
                                                    .RequestStaticProperties
                                                    .class,
                                            "plural"),
                                    env,
                                    "cacheUninflected"))
                    || ZVal.toBool(
                            !arrayActionR(
                                    ArrayAction.ISSET,
                                    env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Doctrine
                                                    .namespaces
                                                    .Common
                                                    .namespaces
                                                    .Inflector
                                                    .classes
                                                    .Inflector
                                                    .RequestStaticProperties
                                                    .class,
                                            "plural"),
                                    env,
                                    "cacheIrregular"))) {
                env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Doctrine
                                        .namespaces
                                        .Common
                                        .namespaces
                                        .Inflector
                                        .classes
                                        .Inflector
                                        .RequestStaticProperties
                                        .class,
                                "plural")
                        .arrayAccess(env, "cacheUninflected")
                        .set(
                                "(?:"
                                        + toStringR(
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(
                                                                "|",
                                                                env.getRequestStaticPropertiesReference(
                                                                                com.project
                                                                                        .convertedCode
                                                                                        .globalNamespace
                                                                                        .namespaces
                                                                                        .Doctrine
                                                                                        .namespaces
                                                                                        .Common
                                                                                        .namespaces
                                                                                        .Inflector
                                                                                        .classes
                                                                                        .Inflector
                                                                                        .RequestStaticProperties
                                                                                        .class,
                                                                                "plural")
                                                                        .arrayGet(
                                                                                env,
                                                                                "merged",
                                                                                "uninflected"))
                                                        .value(),
                                                env)
                                        + ")");
                env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Doctrine
                                        .namespaces
                                        .Common
                                        .namespaces
                                        .Inflector
                                        .classes
                                        .Inflector
                                        .RequestStaticProperties
                                        .class,
                                "plural")
                        .arrayAccess(env, "cacheIrregular")
                        .set(
                                "(?:"
                                        + toStringR(
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(
                                                                "|",
                                                                function_array_keys
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                env.getRequestStaticPropertiesReference(
                                                                                                com.project
                                                                                                        .convertedCode
                                                                                                        .globalNamespace
                                                                                                        .namespaces
                                                                                                        .Doctrine
                                                                                                        .namespaces
                                                                                                        .Common
                                                                                                        .namespaces
                                                                                                        .Inflector
                                                                                                        .classes
                                                                                                        .Inflector
                                                                                                        .RequestStaticProperties
                                                                                                        .class,
                                                                                                "plural")
                                                                                        .arrayGet(
                                                                                                env,
                                                                                                "merged",
                                                                                                "irregular"))
                                                                        .value())
                                                        .value(),
                                                env)
                                        + ")");
            }

            if (function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, regs))
                    .call(
                            "/(.*)\\b("
                                    + toStringR(
                                            env.getRequestStaticPropertiesReference(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .Doctrine
                                                                    .namespaces
                                                                    .Common
                                                                    .namespaces
                                                                    .Inflector
                                                                    .classes
                                                                    .Inflector
                                                                    .RequestStaticProperties
                                                                    .class,
                                                            "plural")
                                                    .arrayGet(env, "cacheIrregular"),
                                            env)
                                    + ")$/i",
                            word.getObject(),
                            regs.getObject())
                    .getBool()) {
                env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Doctrine
                                        .namespaces
                                        .Common
                                        .namespaces
                                        .Inflector
                                        .classes
                                        .Inflector
                                        .RequestStaticProperties
                                        .class,
                                "cache")
                        .arrayAccess(env, "pluralize", word.getObject())
                        .set(
                                toStringR(regs.arrayGet(env, 1), env)
                                        + toStringR(word.arrayGet(env, 0), env)
                                        + toStringR(
                                                function_substr
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                env.getRequestStaticPropertiesReference(
                                                                                com.project
                                                                                        .convertedCode
                                                                                        .globalNamespace
                                                                                        .namespaces
                                                                                        .Doctrine
                                                                                        .namespaces
                                                                                        .Common
                                                                                        .namespaces
                                                                                        .Inflector
                                                                                        .classes
                                                                                        .Inflector
                                                                                        .RequestStaticProperties
                                                                                        .class,
                                                                                "plural")
                                                                        .arrayGet(
                                                                                env,
                                                                                "merged",
                                                                                "irregular",
                                                                                NamespaceGlobal
                                                                                        .strtolower
                                                                                        .env(env)
                                                                                        .call(
                                                                                                regs
                                                                                                        .arrayGet(
                                                                                                                env,
                                                                                                                2))
                                                                                        .value()),
                                                                1)
                                                        .value(),
                                                env));
                return ZVal.assign(
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Doctrine
                                                .namespaces
                                                .Common
                                                .namespaces
                                                .Inflector
                                                .classes
                                                .Inflector
                                                .RequestStaticProperties
                                                .class,
                                        "cache")
                                .arrayGet(env, "pluralize", word.getObject()));
            }

            if (function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, regs))
                    .call(
                            "/^("
                                    + toStringR(
                                            env.getRequestStaticPropertiesReference(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .Doctrine
                                                                    .namespaces
                                                                    .Common
                                                                    .namespaces
                                                                    .Inflector
                                                                    .classes
                                                                    .Inflector
                                                                    .RequestStaticProperties
                                                                    .class,
                                                            "plural")
                                                    .arrayGet(env, "cacheUninflected"),
                                            env)
                                    + ")$/i",
                            word.getObject(),
                            regs.getObject())
                    .getBool()) {
                env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Doctrine
                                        .namespaces
                                        .Common
                                        .namespaces
                                        .Inflector
                                        .classes
                                        .Inflector
                                        .RequestStaticProperties
                                        .class,
                                "cache")
                        .arrayAccess(env, "pluralize", word.getObject())
                        .set(word.getObject());
                return ZVal.assign(word.getObject());
            }

            for (ZPair zpairResult12 :
                    ZVal.getIterable(
                            env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Doctrine
                                                    .namespaces
                                                    .Common
                                                    .namespaces
                                                    .Inflector
                                                    .classes
                                                    .Inflector
                                                    .RequestStaticProperties
                                                    .class,
                                            "plural")
                                    .arrayGet(env, "rules"),
                            env,
                            false)) {
                rule = ZVal.assign(zpairResult12.getKey());
                replacement = ZVal.assign(zpairResult12.getValue());
                if (function_preg_match.f.env(env).call(rule, word.getObject()).getBool()) {
                    env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Doctrine
                                            .namespaces
                                            .Common
                                            .namespaces
                                            .Inflector
                                            .classes
                                            .Inflector
                                            .RequestStaticProperties
                                            .class,
                                    "cache")
                            .arrayAccess(env, "pluralize", word.getObject())
                            .set(
                                    function_preg_replace
                                            .f
                                            .env(env)
                                            .call(rule, replacement, word.getObject())
                                            .value());
                    return ZVal.assign(
                            env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Doctrine
                                                    .namespaces
                                                    .Common
                                                    .namespaces
                                                    .Inflector
                                                    .classes
                                                    .Inflector
                                                    .RequestStaticProperties
                                                    .class,
                                            "cache")
                                    .arrayGet(env, "pluralize", word.getObject()));
                }
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "word", typeHint = "string")
        public Object singularize(RuntimeEnv env, Object... args) {
            ReferenceContainer word = new BasicReferenceContainer(assignParameter(args, 0, false));
            Object rule = null;
            ReferenceContainer regs = new BasicReferenceContainer(null);
            Object replacement = null;
            if (arrayActionR(
                    ArrayAction.ISSET,
                    env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Doctrine
                                    .namespaces
                                    .Common
                                    .namespaces
                                    .Inflector
                                    .classes
                                    .Inflector
                                    .RequestStaticProperties
                                    .class,
                            "cache"),
                    env,
                    "singularize",
                    word.getObject())) {
                return ZVal.assign(
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Doctrine
                                                .namespaces
                                                .Common
                                                .namespaces
                                                .Inflector
                                                .classes
                                                .Inflector
                                                .RequestStaticProperties
                                                .class,
                                        "cache")
                                .arrayGet(env, "singularize", word.getObject()));
            }

            if (!arrayActionR(
                    ArrayAction.ISSET,
                    env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Doctrine
                                    .namespaces
                                    .Common
                                    .namespaces
                                    .Inflector
                                    .classes
                                    .Inflector
                                    .RequestStaticProperties
                                    .class,
                            "singular"),
                    env,
                    "merged",
                    "uninflected")) {
                env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Doctrine
                                        .namespaces
                                        .Common
                                        .namespaces
                                        .Inflector
                                        .classes
                                        .Inflector
                                        .RequestStaticProperties
                                        .class,
                                "singular")
                        .arrayAccess(env, "merged", "uninflected")
                        .set(
                                function_array_merge
                                        .f
                                        .env(env)
                                        .call(
                                                env.getRequestStaticPropertiesReference(
                                                                com.project
                                                                        .convertedCode
                                                                        .globalNamespace
                                                                        .namespaces
                                                                        .Doctrine
                                                                        .namespaces
                                                                        .Common
                                                                        .namespaces
                                                                        .Inflector
                                                                        .classes
                                                                        .Inflector
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "singular")
                                                        .arrayGet(env, "uninflected"),
                                                env.getRequestStaticProperties(
                                                                com.project
                                                                        .convertedCode
                                                                        .globalNamespace
                                                                        .namespaces
                                                                        .Doctrine
                                                                        .namespaces
                                                                        .Common
                                                                        .namespaces
                                                                        .Inflector
                                                                        .classes
                                                                        .Inflector
                                                                        .RequestStaticProperties
                                                                        .class)
                                                        .uninflected)
                                        .value());
            }

            if (!arrayActionR(
                    ArrayAction.ISSET,
                    env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Doctrine
                                    .namespaces
                                    .Common
                                    .namespaces
                                    .Inflector
                                    .classes
                                    .Inflector
                                    .RequestStaticProperties
                                    .class,
                            "singular"),
                    env,
                    "merged",
                    "irregular")) {
                env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Doctrine
                                        .namespaces
                                        .Common
                                        .namespaces
                                        .Inflector
                                        .classes
                                        .Inflector
                                        .RequestStaticProperties
                                        .class,
                                "singular")
                        .arrayAccess(env, "merged", "irregular")
                        .set(
                                function_array_merge
                                        .f
                                        .env(env)
                                        .call(
                                                env.getRequestStaticPropertiesReference(
                                                                com.project
                                                                        .convertedCode
                                                                        .globalNamespace
                                                                        .namespaces
                                                                        .Doctrine
                                                                        .namespaces
                                                                        .Common
                                                                        .namespaces
                                                                        .Inflector
                                                                        .classes
                                                                        .Inflector
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "singular")
                                                        .arrayGet(env, "irregular"),
                                                function_array_flip
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                env.getRequestStaticPropertiesReference(
                                                                                com.project
                                                                                        .convertedCode
                                                                                        .globalNamespace
                                                                                        .namespaces
                                                                                        .Doctrine
                                                                                        .namespaces
                                                                                        .Common
                                                                                        .namespaces
                                                                                        .Inflector
                                                                                        .classes
                                                                                        .Inflector
                                                                                        .RequestStaticProperties
                                                                                        .class,
                                                                                "plural")
                                                                        .arrayGet(env, "irregular"))
                                                        .value())
                                        .value());
            }

            if (ZVal.toBool(
                            !arrayActionR(
                                    ArrayAction.ISSET,
                                    env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Doctrine
                                                    .namespaces
                                                    .Common
                                                    .namespaces
                                                    .Inflector
                                                    .classes
                                                    .Inflector
                                                    .RequestStaticProperties
                                                    .class,
                                            "singular"),
                                    env,
                                    "cacheUninflected"))
                    || ZVal.toBool(
                            !arrayActionR(
                                    ArrayAction.ISSET,
                                    env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Doctrine
                                                    .namespaces
                                                    .Common
                                                    .namespaces
                                                    .Inflector
                                                    .classes
                                                    .Inflector
                                                    .RequestStaticProperties
                                                    .class,
                                            "singular"),
                                    env,
                                    "cacheIrregular"))) {
                env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Doctrine
                                        .namespaces
                                        .Common
                                        .namespaces
                                        .Inflector
                                        .classes
                                        .Inflector
                                        .RequestStaticProperties
                                        .class,
                                "singular")
                        .arrayAccess(env, "cacheUninflected")
                        .set(
                                "(?:"
                                        + toStringR(
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(
                                                                "|",
                                                                env.getRequestStaticPropertiesReference(
                                                                                com.project
                                                                                        .convertedCode
                                                                                        .globalNamespace
                                                                                        .namespaces
                                                                                        .Doctrine
                                                                                        .namespaces
                                                                                        .Common
                                                                                        .namespaces
                                                                                        .Inflector
                                                                                        .classes
                                                                                        .Inflector
                                                                                        .RequestStaticProperties
                                                                                        .class,
                                                                                "singular")
                                                                        .arrayGet(
                                                                                env,
                                                                                "merged",
                                                                                "uninflected"))
                                                        .value(),
                                                env)
                                        + ")");
                env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Doctrine
                                        .namespaces
                                        .Common
                                        .namespaces
                                        .Inflector
                                        .classes
                                        .Inflector
                                        .RequestStaticProperties
                                        .class,
                                "singular")
                        .arrayAccess(env, "cacheIrregular")
                        .set(
                                "(?:"
                                        + toStringR(
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(
                                                                "|",
                                                                function_array_keys
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                env.getRequestStaticPropertiesReference(
                                                                                                com.project
                                                                                                        .convertedCode
                                                                                                        .globalNamespace
                                                                                                        .namespaces
                                                                                                        .Doctrine
                                                                                                        .namespaces
                                                                                                        .Common
                                                                                                        .namespaces
                                                                                                        .Inflector
                                                                                                        .classes
                                                                                                        .Inflector
                                                                                                        .RequestStaticProperties
                                                                                                        .class,
                                                                                                "singular")
                                                                                        .arrayGet(
                                                                                                env,
                                                                                                "merged",
                                                                                                "irregular"))
                                                                        .value())
                                                        .value(),
                                                env)
                                        + ")");
            }

            if (function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, regs))
                    .call(
                            "/(.*)\\b("
                                    + toStringR(
                                            env.getRequestStaticPropertiesReference(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .Doctrine
                                                                    .namespaces
                                                                    .Common
                                                                    .namespaces
                                                                    .Inflector
                                                                    .classes
                                                                    .Inflector
                                                                    .RequestStaticProperties
                                                                    .class,
                                                            "singular")
                                                    .arrayGet(env, "cacheIrregular"),
                                            env)
                                    + ")$/i",
                            word.getObject(),
                            regs.getObject())
                    .getBool()) {
                env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Doctrine
                                        .namespaces
                                        .Common
                                        .namespaces
                                        .Inflector
                                        .classes
                                        .Inflector
                                        .RequestStaticProperties
                                        .class,
                                "cache")
                        .arrayAccess(env, "singularize", word.getObject())
                        .set(
                                toStringR(regs.arrayGet(env, 1), env)
                                        + toStringR(word.arrayGet(env, 0), env)
                                        + toStringR(
                                                function_substr
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                env.getRequestStaticPropertiesReference(
                                                                                com.project
                                                                                        .convertedCode
                                                                                        .globalNamespace
                                                                                        .namespaces
                                                                                        .Doctrine
                                                                                        .namespaces
                                                                                        .Common
                                                                                        .namespaces
                                                                                        .Inflector
                                                                                        .classes
                                                                                        .Inflector
                                                                                        .RequestStaticProperties
                                                                                        .class,
                                                                                "singular")
                                                                        .arrayGet(
                                                                                env,
                                                                                "merged",
                                                                                "irregular",
                                                                                NamespaceGlobal
                                                                                        .strtolower
                                                                                        .env(env)
                                                                                        .call(
                                                                                                regs
                                                                                                        .arrayGet(
                                                                                                                env,
                                                                                                                2))
                                                                                        .value()),
                                                                1)
                                                        .value(),
                                                env));
                return ZVal.assign(
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Doctrine
                                                .namespaces
                                                .Common
                                                .namespaces
                                                .Inflector
                                                .classes
                                                .Inflector
                                                .RequestStaticProperties
                                                .class,
                                        "cache")
                                .arrayGet(env, "singularize", word.getObject()));
            }

            if (function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, regs))
                    .call(
                            "/^("
                                    + toStringR(
                                            env.getRequestStaticPropertiesReference(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .Doctrine
                                                                    .namespaces
                                                                    .Common
                                                                    .namespaces
                                                                    .Inflector
                                                                    .classes
                                                                    .Inflector
                                                                    .RequestStaticProperties
                                                                    .class,
                                                            "singular")
                                                    .arrayGet(env, "cacheUninflected"),
                                            env)
                                    + ")$/i",
                            word.getObject(),
                            regs.getObject())
                    .getBool()) {
                env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Doctrine
                                        .namespaces
                                        .Common
                                        .namespaces
                                        .Inflector
                                        .classes
                                        .Inflector
                                        .RequestStaticProperties
                                        .class,
                                "cache")
                        .arrayAccess(env, "singularize", word.getObject())
                        .set(word.getObject());
                return ZVal.assign(word.getObject());
            }

            for (ZPair zpairResult13 :
                    ZVal.getIterable(
                            env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Doctrine
                                                    .namespaces
                                                    .Common
                                                    .namespaces
                                                    .Inflector
                                                    .classes
                                                    .Inflector
                                                    .RequestStaticProperties
                                                    .class,
                                            "singular")
                                    .arrayGet(env, "rules"),
                            env,
                            false)) {
                rule = ZVal.assign(zpairResult13.getKey());
                replacement = ZVal.assign(zpairResult13.getValue());
                if (function_preg_match.f.env(env).call(rule, word.getObject()).getBool()) {
                    env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Doctrine
                                            .namespaces
                                            .Common
                                            .namespaces
                                            .Inflector
                                            .classes
                                            .Inflector
                                            .RequestStaticProperties
                                            .class,
                                    "cache")
                            .arrayAccess(env, "singularize", word.getObject())
                            .set(
                                    function_preg_replace
                                            .f
                                            .env(env)
                                            .call(rule, replacement, word.getObject())
                                            .value());
                    return ZVal.assign(
                            env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Doctrine
                                                    .namespaces
                                                    .Common
                                                    .namespaces
                                                    .Inflector
                                                    .classes
                                                    .Inflector
                                                    .RequestStaticProperties
                                                    .class,
                                            "cache")
                                    .arrayGet(env, "singularize", word.getObject()));
                }
            }

            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Doctrine
                                    .namespaces
                                    .Common
                                    .namespaces
                                    .Inflector
                                    .classes
                                    .Inflector
                                    .RequestStaticProperties
                                    .class,
                            "cache")
                    .arrayAccess(env, "singularize", word.getObject())
                    .set(word.getObject());
            return ZVal.assign(word.getObject());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object plural =
                ZVal.newArray(
                        new ZPair(
                                "rules",
                                ZVal.newArray(
                                        new ZPair("/(s)tatus$/i", "\\1\\2tatuses"),
                                        new ZPair("/(quiz)$/i", "\\1zes"),
                                        new ZPair("/^(ox)$/i", "\\1\\2en"),
                                        new ZPair("/([m|l])ouse$/i", "\\1ice"),
                                        new ZPair("/(matr|vert|ind)(ix|ex)$/i", "\\1ices"),
                                        new ZPair("/(x|ch|ss|sh)$/i", "\\1es"),
                                        new ZPair("/([^aeiouy]|qu)y$/i", "\\1ies"),
                                        new ZPair("/(hive|gulf)$/i", "\\1s"),
                                        new ZPair("/(?:([^f])fe|([lr])f)$/i", "\\1\\2ves"),
                                        new ZPair("/sis$/i", "ses"),
                                        new ZPair("/([ti])um$/i", "\\1a"),
                                        new ZPair("/(c)riterion$/i", "\\1riteria"),
                                        new ZPair("/(p)erson$/i", "\\1eople"),
                                        new ZPair("/(m)an$/i", "\\1en"),
                                        new ZPair("/(c)hild$/i", "\\1hildren"),
                                        new ZPair("/(f)oot$/i", "\\1eet"),
                                        new ZPair(
                                                "/(buffal|her|potat|tomat|volcan)o$/i",
                                                "\\1\\2oes"),
                                        new ZPair(
                                                "/(alumn|bacill|cact|foc|fung|nucle|radi|stimul|syllab|termin|vir)us$/i",
                                                "\\1i"),
                                        new ZPair("/us$/i", "uses"),
                                        new ZPair("/(alias)$/i", "\\1es"),
                                        new ZPair("/(analys|ax|cris|test|thes)is$/i", "\\1es"),
                                        new ZPair("/s$/", "s"),
                                        new ZPair("/^$/", ""),
                                        new ZPair("/$/", "s"))),
                        new ZPair(
                                "uninflected",
                                ZVal.arrayFromList(
                                        ".*[nrlm]ese",
                                        ".*deer",
                                        ".*fish",
                                        ".*measles",
                                        ".*ois",
                                        ".*pox",
                                        ".*sheep",
                                        "people",
                                        "cookie",
                                        "police")),
                        new ZPair(
                                "irregular",
                                ZVal.newArray(
                                        new ZPair("atlas", "atlases"),
                                        new ZPair("axe", "axes"),
                                        new ZPair("beef", "beefs"),
                                        new ZPair("brother", "brothers"),
                                        new ZPair("cafe", "cafes"),
                                        new ZPair("chateau", "chateaux"),
                                        new ZPair("niveau", "niveaux"),
                                        new ZPair("child", "children"),
                                        new ZPair("cookie", "cookies"),
                                        new ZPair("corpus", "corpuses"),
                                        new ZPair("cow", "cows"),
                                        new ZPair("criterion", "criteria"),
                                        new ZPair("curriculum", "curricula"),
                                        new ZPair("demo", "demos"),
                                        new ZPair("domino", "dominoes"),
                                        new ZPair("echo", "echoes"),
                                        new ZPair("foot", "feet"),
                                        new ZPair("fungus", "fungi"),
                                        new ZPair("ganglion", "ganglions"),
                                        new ZPair("genie", "genies"),
                                        new ZPair("genus", "genera"),
                                        new ZPair("goose", "geese"),
                                        new ZPair("graffito", "graffiti"),
                                        new ZPair("hippopotamus", "hippopotami"),
                                        new ZPair("hoof", "hoofs"),
                                        new ZPair("human", "humans"),
                                        new ZPair("iris", "irises"),
                                        new ZPair("larva", "larvae"),
                                        new ZPair("leaf", "leaves"),
                                        new ZPair("loaf", "loaves"),
                                        new ZPair("man", "men"),
                                        new ZPair("medium", "media"),
                                        new ZPair("memorandum", "memoranda"),
                                        new ZPair("money", "monies"),
                                        new ZPair("mongoose", "mongooses"),
                                        new ZPair("motto", "mottoes"),
                                        new ZPair("move", "moves"),
                                        new ZPair("mythos", "mythoi"),
                                        new ZPair("niche", "niches"),
                                        new ZPair("nucleus", "nuclei"),
                                        new ZPair("numen", "numina"),
                                        new ZPair("occiput", "occiputs"),
                                        new ZPair("octopus", "octopuses"),
                                        new ZPair("opus", "opuses"),
                                        new ZPair("ox", "oxen"),
                                        new ZPair("passerby", "passersby"),
                                        new ZPair("penis", "penises"),
                                        new ZPair("person", "people"),
                                        new ZPair("plateau", "plateaux"),
                                        new ZPair("runner-up", "runners-up"),
                                        new ZPair("sex", "sexes"),
                                        new ZPair("soliloquy", "soliloquies"),
                                        new ZPair("son-in-law", "sons-in-law"),
                                        new ZPair("syllabus", "syllabi"),
                                        new ZPair("testis", "testes"),
                                        new ZPair("thief", "thieves"),
                                        new ZPair("tooth", "teeth"),
                                        new ZPair("tornado", "tornadoes"),
                                        new ZPair("trilby", "trilbys"),
                                        new ZPair("turf", "turfs"),
                                        new ZPair("valve", "valves"),
                                        new ZPair("volcano", "volcanoes"))));

        public Object singular =
                ZVal.newArray(
                        new ZPair(
                                "rules",
                                ZVal.newArray(
                                        new ZPair("/(s)tatuses$/i", "\\1\\2tatus"),
                                        new ZPair("/^(.*)(menu)s$/i", "\\1\\2"),
                                        new ZPair("/(quiz)zes$/i", "\\1"),
                                        new ZPair("/(matr)ices$/i", "\\1ix"),
                                        new ZPair("/(vert|ind)ices$/i", "\\1ex"),
                                        new ZPair("/^(ox)en/i", "\\1"),
                                        new ZPair("/(alias)(es)*$/i", "\\1"),
                                        new ZPair("/(buffal|her|potat|tomat|volcan)oes$/i", "\\1o"),
                                        new ZPair(
                                                "/(alumn|bacill|cact|foc|fung|nucle|radi|stimul|syllab|termin|viri?)i$/i",
                                                "\\1us"),
                                        new ZPair("/([ftw]ax)es/i", "\\1"),
                                        new ZPair("/(analys|ax|cris|test|thes)es$/i", "\\1is"),
                                        new ZPair("/(shoe|slave)s$/i", "\\1"),
                                        new ZPair("/(o)es$/i", "\\1"),
                                        new ZPair("/ouses$/", "ouse"),
                                        new ZPair("/([^a])uses$/", "\\1us"),
                                        new ZPair("/([m|l])ice$/i", "\\1ouse"),
                                        new ZPair("/(x|ch|ss|sh)es$/i", "\\1"),
                                        new ZPair("/(m)ovies$/i", "\\1\\2ovie"),
                                        new ZPair("/(s)eries$/i", "\\1\\2eries"),
                                        new ZPair("/([^aeiouy]|qu)ies$/i", "\\1y"),
                                        new ZPair("/([lr])ves$/i", "\\1f"),
                                        new ZPair("/(tive)s$/i", "\\1"),
                                        new ZPair("/(hive)s$/i", "\\1"),
                                        new ZPair("/(drive)s$/i", "\\1"),
                                        new ZPair("/(dive)s$/i", "\\1"),
                                        new ZPair("/(olive)s$/i", "\\1"),
                                        new ZPair("/([^fo])ves$/i", "\\1fe"),
                                        new ZPair("/(^analy)ses$/i", "\\1sis"),
                                        new ZPair(
                                                "/(analy|diagno|^ba|(p)arenthe|(p)rogno|(s)ynop|(t)he)ses$/i",
                                                "\\1\\2sis"),
                                        new ZPair("/(c)riteria$/i", "\\1riterion"),
                                        new ZPair("/([ti])a$/i", "\\1um"),
                                        new ZPair("/(p)eople$/i", "\\1\\2erson"),
                                        new ZPair("/(m)en$/i", "\\1an"),
                                        new ZPair("/(c)hildren$/i", "\\1\\2hild"),
                                        new ZPair("/(f)eet$/i", "\\1oot"),
                                        new ZPair("/(n)ews$/i", "\\1\\2ews"),
                                        new ZPair("/eaus$/", "eau"),
                                        new ZPair("/^(.*us)$/", "\\1"),
                                        new ZPair("/s$/i", ""))),
                        new ZPair(
                                "uninflected",
                                ZVal.arrayFromList(
                                        ".*[nrlm]ese",
                                        ".*deer",
                                        ".*fish",
                                        ".*measles",
                                        ".*ois",
                                        ".*pox",
                                        ".*sheep",
                                        ".*ss",
                                        "data",
                                        "police",
                                        "pants",
                                        "clothes")),
                        new ZPair(
                                "irregular",
                                ZVal.newArray(
                                        new ZPair("abuses", "abuse"),
                                        new ZPair("avalanches", "avalanche"),
                                        new ZPair("caches", "cache"),
                                        new ZPair("criteria", "criterion"),
                                        new ZPair("curves", "curve"),
                                        new ZPair("emphases", "emphasis"),
                                        new ZPair("foes", "foe"),
                                        new ZPair("geese", "goose"),
                                        new ZPair("graves", "grave"),
                                        new ZPair("hoaxes", "hoax"),
                                        new ZPair("media", "medium"),
                                        new ZPair("neuroses", "neurosis"),
                                        new ZPair("waves", "wave"),
                                        new ZPair("oases", "oasis"),
                                        new ZPair("valves", "valve"))));

        public Object uninflected =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    ".*?media",
                                    "Amoyese",
                                    "audio",
                                    "bison",
                                    "Borghese",
                                    "bream",
                                    "breeches",
                                    "britches",
                                    "buffalo",
                                    "cantus",
                                    "carp",
                                    "chassis",
                                    "clippers",
                                    "cod",
                                    "coitus",
                                    "compensation",
                                    "Congoese",
                                    "contretemps",
                                    "coreopsis",
                                    "corps",
                                    "data",
                                    "debris",
                                    "deer",
                                    "diabetes",
                                    "djinn",
                                    "education",
                                    "eland",
                                    "elk",
                                    "emoji",
                                    "equipment",
                                    "evidence",
                                    "Faroese",
                                    "feedback",
                                    "fish",
                                    "flounder",
                                    "Foochowese",
                                    "Furniture",
                                    "furniture",
                                    "gallows",
                                    "Genevese",
                                    "Genoese",
                                    "Gilbertese",
                                    "gold",
                                    "headquarters",
                                    "herpes",
                                    "hijinks",
                                    "Hottentotese",
                                    "information",
                                    "innings",
                                    "jackanapes",
                                    "jedi",
                                    "Kiplingese",
                                    "knowledge",
                                    "Kongoese",
                                    "love",
                                    "Lucchese",
                                    "Luggage",
                                    "mackerel",
                                    "Maltese",
                                    "metadata",
                                    "mews",
                                    "moose",
                                    "mumps",
                                    "Nankingese",
                                    "news",
                                    "nexus",
                                    "Niasese",
                                    "nutrition",
                                    "offspring",
                                    "Pekingese",
                                    "Piedmontese",
                                    "pincers",
                                    "Pistoiese",
                                    "plankton",
                                    "pliers",
                                    "pokemon",
                                    "police",
                                    "Portuguese",
                                    "proceedings",
                                    "rabies",
                                    "rain",
                                    "rhinoceros",
                                    "rice",
                                    "salmon",
                                    "Sarawakese",
                                    "scissors",
                                    "sea[- ]bass",
                                    "series",
                                    "Shavese",
                                    "shears",
                                    "sheep",
                                    "siemens",
                                    "species",
                                    "staff",
                                    "swine",
                                    "traffic",
                                    "trousers",
                                    "trout",
                                    "tuna",
                                    "us",
                                    "Vermontese",
                                    "Wenchowese",
                                    "wheat",
                                    "whiting",
                                    "wildebeest",
                                    "Yengeese");
                        });

        public Object cache = ZVal.newArray();

        public Object initialState = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Doctrine\\Common\\Inflector\\Inflector")
                    .setLookup(
                            Inflector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames(
                            "cache", "initialState", "plural", "singular", "uninflected")
                    .setFilename(
                            "vendor/doctrine/inflector/lib/Doctrine/Common/Inflector/Inflector.php")
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
