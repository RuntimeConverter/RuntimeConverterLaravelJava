package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Validation.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.project.convertedCode.globalNamespace.functions.head;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Validation.classes.ClosureValidationRule;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Validation.classes.ValidationData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Validation.namespaces.Rules.classes.Exists;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Validation.namespaces.Rules.classes.Unique;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Validation.classes.Rule;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Validation/ValidationRuleParser.php

*/

public class ValidationRuleParser extends RuntimeClassBase {

    public Object data = null;

    public Object implicitAttributes = ZVal.newArray();

    public ValidationRuleParser(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ValidationRuleParser.class) {
            this.__construct(env, args);
        }
    }

    public ValidationRuleParser(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        this.data = data;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rules")
    public Object explode(RuntimeEnv env, Object... args) {
        Object rules = assignParameter(args, 0, false);
        this.implicitAttributes = ZVal.newArray();
        rules = this.explodeRules(env, rules);
        return ZVal.assign(
                toObjectR(
                        ZVal.newArray(
                                new ZPair("rules", rules),
                                new ZPair("implicitAttributes", this.implicitAttributes))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rules")
    protected Object explodeRules(RuntimeEnv env, Object... args) {
        ReferenceContainer rules = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object rule = null;
        Object key = null;
        for (ZPair zpairResult625 : ZVal.getIterable(rules.getObject(), env, false)) {
            key = ZVal.assign(zpairResult625.getKey());
            rule = ZVal.assign(zpairResult625.getValue());
            if (ZVal.isTrue(Str.runtimeStaticObject.contains(env, key, "*"))) {
                rules.setObject(
                        this.explodeWildcardRules(
                                env, rules.getObject(), key, ZVal.newArray(new ZPair(0, rule))));
                arrayActionR(ArrayAction.UNSET, rules, env, key);

            } else {
                rules.arrayAccess(env, key).set(this.explodeExplicitRule(env, rule));
            }
        }

        return ZVal.assign(rules.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rule")
    protected Object explodeExplicitRule(RuntimeEnv env, Object... args) {
        Object rule = assignParameter(args, 0, false);
        if (function_is_string.f.env(env).call(rule).getBool()) {
            return ZVal.assign(function_explode.f.env(env).call("|", rule).value());

        } else if (function_is_object.f.env(env).call(rule).getBool()) {
            return ZVal.assign(ZVal.newArray(new ZPair(0, this.prepareRule(env, rule))));
        }

        return ZVal.assign(
                function_array_map
                        .f
                        .env(env)
                        .call(ZVal.newArray(new ZPair(0, this), new ZPair(1, "prepareRule")), rule)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rule")
    protected Object prepareRule(RuntimeEnv env, Object... args) {
        Object rule = assignParameter(args, 0, false);
        if (ZVal.isTrue(ZVal.checkInstanceType(rule, Closure.class, "Closure"))) {
            rule = new ClosureValidationRule(env, rule);
        }

        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.toBool(
                                                        !function_is_object
                                                                .f
                                                                .env(env)
                                                                .call(rule)
                                                                .getBool())
                                                || ZVal.toBool(
                                                        ZVal.checkInstanceType(
                                                                rule,
                                                                Rule.class,
                                                                "Illuminate\\Contracts\\Validation\\Rule")))
                                || ZVal.toBool(
                                        ZVal.toBool(
                                                        ZVal.checkInstanceType(
                                                                rule,
                                                                Exists.class,
                                                                "Illuminate\\Validation\\Rules\\Exists"))
                                                && ZVal.toBool(
                                                        env.callMethod(
                                                                rule,
                                                                "queryCallbacks",
                                                                ValidationRuleParser.class))))
                || ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.checkInstanceType(
                                                rule,
                                                Unique.class,
                                                "Illuminate\\Validation\\Rules\\Unique"))
                                && ZVal.toBool(
                                        env.callMethod(
                                                rule,
                                                "queryCallbacks",
                                                ValidationRuleParser.class)))) {
            return ZVal.assign(rule);
        }

        return ZVal.assign(toStringR(rule, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "results")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rules")
    protected Object explodeWildcardRules(RuntimeEnv env, Object... args) {
        Object results = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object rules = assignParameter(args, 2, false);
        Object data = null;
        Object pattern = null;
        Object rule = null;
        Object value = null;
        Object key = null;
        pattern =
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                "\\*",
                                "[^\\.]*",
                                NamespaceGlobal.preg_quote.env(env).call(attribute).value())
                        .value();
        data =
                ValidationData.runtimeStaticObject.initializeAndGatherData(
                        env, attribute, this.data);
        for (ZPair zpairResult626 : ZVal.getIterable(data, env, false)) {
            key = ZVal.assign(zpairResult626.getKey());
            value = ZVal.assign(zpairResult626.getValue());
            if (ZVal.toBool(Str.runtimeStaticObject.startsWith(env, key, attribute))
                    || ZVal.toBool(
                            ZVal.toBool(
                                    function_preg_match
                                            .f
                                            .env(env)
                                            .call("/^" + toStringR(pattern, env) + "\\z/", key)
                                            .value()))) {
                for (ZPair zpairResult627 : ZVal.getIterable(rToArrayCast(rules), env, true)) {
                    rule = ZVal.assign(zpairResult627.getValue());
                    new ReferenceClassProperty(this, "implicitAttributes", env)
                            .arrayAppend(env, attribute)
                            .set(key);
                    results = this.mergeRules(env, results, key, rule);
                }
            }
        }

        return ZVal.assign(results);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "results")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rules", defaultValue = "", defaultValueType = "array")
    public Object mergeRules(RuntimeEnv env, Object... args) {
        Object results = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object rules = assignParameter(args, 2, true);
        if (null == rules) {
            rules = ZVal.newArray();
        }
        Object innerRules = null;
        Object innerAttribute = null;
        if (function_is_array.f.env(env).call(attribute).getBool()) {
            for (ZPair zpairResult628 : ZVal.getIterable(rToArrayCast(attribute), env, false)) {
                innerAttribute = ZVal.assign(zpairResult628.getKey());
                innerRules = ZVal.assign(zpairResult628.getValue());
                results = this.mergeRulesForAttribute(env, results, innerAttribute, innerRules);
            }

            return ZVal.assign(results);
        }

        return ZVal.assign(this.mergeRulesForAttribute(env, results, attribute, rules));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "results")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rules")
    protected Object mergeRulesForAttribute(RuntimeEnv env, Object... args) {
        ReferenceContainer results = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object attribute = assignParameter(args, 1, false);
        Object rules = assignParameter(args, 2, false);
        Object merge = null;
        merge =
                head.f
                        .env(env)
                        .call(this.explodeRules(env, ZVal.newArray(new ZPair(0, rules))))
                        .value();
        results.arrayAccess(env, attribute)
                .set(
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        arrayActionR(ArrayAction.ISSET, results, env, attribute)
                                                ? this.explodeExplicitRule(
                                                        env, results.arrayGet(env, attribute))
                                                : ZVal.newArray(),
                                        merge)
                                .value());
        return ZVal.assign(results.getObject());
    }

    public static final Object CONST_class = "Illuminate\\Validation\\ValidationRuleParser";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "rules")
        public Object parse(RuntimeEnv env, Object... args) {
            ReferenceContainer rules = new BasicReferenceContainer(assignParameter(args, 0, false));
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            rules.getObject(),
                            Rule.class,
                            "Illuminate\\Contracts\\Validation\\Rule"))) {
                return ZVal.assign(
                        ZVal.newArray(
                                new ZPair(0, rules.getObject()), new ZPair(1, ZVal.newArray())));
            }

            if (function_is_array.f.env(env).call(rules.getObject()).getBool()) {
                rules.setObject(
                        StaticMethodUtils.accessUnknownLateStaticMethod(
                                        env, this, ValidationRuleParser.class)
                                .method("parseArrayRule")
                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                .call(rules.getObject())
                                .value());

            } else {
                rules.setObject(
                        StaticMethodUtils.accessUnknownLateStaticMethod(
                                        env, this, ValidationRuleParser.class)
                                .method("parseStringRule")
                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                .call(rules.getObject())
                                .value());
            }

            rules.arrayAccess(env, 0)
                    .set(
                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                            env, this, ValidationRuleParser.class)
                                    .method("normalizeRule")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(rules.arrayGet(env, 0))
                                    .value());
            return ZVal.assign(rules.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "rules", typeHint = "array")
        protected Object parseArrayRule(RuntimeEnv env, Object... args) {
            Object rules = assignParameter(args, 0, false);
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    0,
                                    Str.runtimeStaticObject.studly(
                                            env,
                                            function_trim
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            Arr.runtimeStaticObject.get(
                                                                    env, rules, 0))
                                                    .value())),
                            new ZPair(1, function_array_slice.f.env(env).call(rules, 1).value())));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "rules")
        protected Object parseStringRule(RuntimeEnv env, Object... args) {
            Object rules = assignParameter(args, 0, false);
            Object runtimeTempArrayResult95 = null;
            Object parameter = null;
            Object parameters = null;
            parameters = ZVal.newArray();
            if (ZVal.strictNotEqualityCheck(
                    function_strpos.f.env(env).call(rules, ":").value(), "!==", false)) {
                ZVal.list(
                        runtimeTempArrayResult95 =
                                function_explode.f.env(env).call(":", rules, 2).value(),
                        (rules = listGet(runtimeTempArrayResult95, 0, env)),
                        (parameter = listGet(runtimeTempArrayResult95, 1, env)));
                parameters =
                        StaticMethodUtils.accessUnknownLateStaticMethod(
                                        env, this, ValidationRuleParser.class)
                                .method("parseParameters")
                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                .call(rules, parameter)
                                .value();
            }

            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    0,
                                    Str.runtimeStaticObject.studly(
                                            env, function_trim.f.env(env).call(rules).value())),
                            new ZPair(1, parameters)));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "rule")
        @ConvertedParameter(index = 1, name = "parameter")
        protected Object parseParameters(RuntimeEnv env, Object... args) {
            Object rule = assignParameter(args, 0, false);
            Object parameter = assignParameter(args, 1, false);
            rule = NamespaceGlobal.strtolower.env(env).call(rule).value();
            if (function_in_array
                    .f
                    .env(env)
                    .call(rule, ZVal.arrayFromList("regex", "not_regex", "notregex"), true)
                    .getBool()) {
                return ZVal.assign(ZVal.newArray(new ZPair(0, parameter)));
            }

            return ZVal.assign(NamespaceGlobal.str_getcsv.env(env).call(parameter).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "rule")
        protected Object normalizeRule(RuntimeEnv env, Object... args) {
            Object rule = assignParameter(args, 0, false);
            SwitchEnumType31 switchVariable31 =
                    ZVal.getEnum(
                            rule,
                            SwitchEnumType31.DEFAULT_CASE,
                            SwitchEnumType31.STRING_Int,
                            "Int",
                            SwitchEnumType31.STRING_Bool,
                            "Bool");
            switch (switchVariable31) {
                case STRING_Int:
                    return "Integer";
                case STRING_Bool:
                    return "Boolean";
                case DEFAULT_CASE:
                    return ZVal.assign(rule);
            }
            ;
            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Validation\\ValidationRuleParser")
                    .setLookup(
                            ValidationRuleParser.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("data", "implicitAttributes")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Validation/ValidationRuleParser.php")
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

    private enum SwitchEnumType31 {
        STRING_Int,
        STRING_Bool,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
