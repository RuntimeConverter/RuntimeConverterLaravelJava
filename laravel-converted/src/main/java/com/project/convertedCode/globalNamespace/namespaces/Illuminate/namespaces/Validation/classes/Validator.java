package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Validation.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Validation.classes.ImplicitRule;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sscanf;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_combine;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.ReadOnlyReferenceContainer;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Fluent;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.MessageBag;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeZone;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pad;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_intersect;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_intersect_key;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Validation.namespaces.Rules.classes.Unique;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Validation.classes.Rule;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.project.convertedCode.globalNamespace.functions.collect;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.classes.File;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reduce;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Validation.classes.ValidationException;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Validation.classes.ValidationRuleParser;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeInterface;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_scalar;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.nativeFunctions.filter.function_filter_var;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff_key;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_replace;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Carbon;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Validation.classes.ValidationData;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge_recursive;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.classes.UploadedFile;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_bool;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Validation.namespaces.Rules.classes.Exists;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Validation/Validator.php

*/

public class Validator extends RuntimeClassBase
        implements com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Contracts
                .namespaces
                .Validation
                .classes
                .Validator {

    public Object translator = null;

    public Object container = null;

    public Object presenceVerifier = null;

    public Object failedRules = ZVal.newArray();

    public Object messages = null;

    public Object data = null;

    public Object initialRules = null;

    public Object rules = null;

    public Object currentRule = null;

    public Object implicitAttributes = ZVal.newArray();

    public Object after = ZVal.newArray();

    public Object customMessages = ZVal.newArray();

    public Object fallbackMessages = ZVal.newArray();

    public Object customAttributes = ZVal.newArray();

    public Object customValues = ZVal.newArray();

    public Object extensions = ZVal.newArray();

    public Object replacers = ZVal.newArray();

    public Object fileRules =
            ZVal.arrayFromList(
                    "File",
                    "Image",
                    "Mimes",
                    "Mimetypes",
                    "Min",
                    "Max",
                    "Size",
                    "Between",
                    "Dimensions");

    public Object implicitRules =
            ZVal.arrayFromList(
                    "Required",
                    "Filled",
                    "RequiredWith",
                    "RequiredWithAll",
                    "RequiredWithout",
                    "RequiredWithoutAll",
                    "RequiredIf",
                    "RequiredUnless",
                    "Accepted",
                    "Present");

    public Object dependentRules =
            ZVal.arrayFromList(
                    "RequiredWith",
                    "RequiredWithAll",
                    "RequiredWithout",
                    "RequiredWithoutAll",
                    "RequiredIf",
                    "RequiredUnless",
                    "Confirmed",
                    "Same",
                    "Different",
                    "Unique",
                    "Before",
                    "After",
                    "BeforeOrEqual",
                    "AfterOrEqual",
                    "Gt",
                    "Lt",
                    "Gte",
                    "Lte");

    public Object sizeRules =
            ZVal.arrayFromList("Size", "Between", "Min", "Max", "Gt", "Lt", "Gte", "Lte");

    public Object numericRules = ZVal.arrayFromList("Numeric", "Integer");

    public Validator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Validator.class) {
            this.__construct(env, args);
        }
    }

    public Validator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "translator",
        typeHint = "Illuminate\\Contracts\\Translation\\Translator"
    )
    @ConvertedParameter(index = 1, name = "data", typeHint = "array")
    @ConvertedParameter(index = 2, name = "rules", typeHint = "array")
    @ConvertedParameter(
        index = 3,
        name = "messages",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 4,
        name = "customAttributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object translator = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        Object rules = assignParameter(args, 2, false);
        Object messages = assignParameter(args, 3, true);
        if (null == messages) {
            messages = ZVal.newArray();
        }
        Object customAttributes = assignParameter(args, 4, true);
        if (null == customAttributes) {
            customAttributes = ZVal.newArray();
        }
        this.initialRules = rules;
        this.translator = translator;
        this.customMessages = messages;
        this.data = this.parseData(env, data);
        this.customAttributes = customAttributes;
        this.setRules(env, rules);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    public Object parseData(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        Object value = null;
        ReferenceContainer newData = new BasicReferenceContainer(null);
        Object key = null;
        newData.setObject(ZVal.newArray());
        for (ZPair zpairResult629 : ZVal.getIterable(data, env, false)) {
            key = ZVal.assign(zpairResult629.getKey());
            value = ZVal.assign(zpairResult629.getValue());
            if (function_is_array.f.env(env).call(value).getBool()) {
                value = this.parseData(env, value);
            }

            if (ZVal.isTrue(Str.runtimeStaticObject.contains(env, key, "."))) {
                newData.arrayAccess(
                                env, function_str_replace.f.env(env).call(".", "->", key).value())
                        .set(value);

            } else {
                newData.arrayAccess(env, key).set(value);
            }
        }

        return ZVal.assign(newData.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    public Object after(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Validation")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Validation/Validator.php");
        Object callback = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "after", env)
                .arrayAppend(env)
                .set(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Validation",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                Object callback = null;
                                callback = this.contextReferences.getCapturedValue("callback");
                                return ZVal.assign(
                                        function_call_user_func_array
                                                .f
                                                .env(env)
                                                .addReferenceArgs(
                                                        new RuntimeArgsWithInfo(args, this))
                                                .call(
                                                        callback,
                                                        ZVal.newArray(
                                                                new ZPair(0, _closureThisVar)))
                                                .value());
                            }
                        }.use("callback", callback));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object passes(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object rule = null;
        Object rules = null;
        Object attribute = null;
        Object after = null;
        this.messages = new MessageBag(env);
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult630 : ZVal.getIterable(this.rules, env, false)) {
            attribute = ZVal.assign(zpairResult630.getKey());
            rules = ZVal.assign(zpairResult630.getValue());
            attribute = function_str_replace.f.env(env).call("\\.", "->", attribute).value();
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult631 : ZVal.getIterable(rules, env, true)) {
                rule = ZVal.assign(zpairResult631.getValue());
                this.validateAttribute(env, attribute, rule);
                if (ZVal.isTrue(this.shouldStopValidating(env, attribute))) {
                    break;
                }
            }
        }

        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult632 : ZVal.getIterable(this.after, env, true)) {
            after = ZVal.assign(zpairResult632.getValue());
            function_call_user_func
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                    .call(after);
        }

        return ZVal.assign(env.callMethod(this.messages, "isEmpty", Validator.class));
    }

    @ConvertedMethod
    public Object fails(RuntimeEnv env, Object... args) {
        return ZVal.assign(!ZVal.isTrue(this.passes(env)));
    }

    @ConvertedMethod
    public Object validate(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Validation")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Validation/Validator.php");
        Object data = null;
        if (ZVal.isTrue(this.fails(env))) {
            throw ZVal.getException(env, new ValidationException(env, this));
        }

        data = collect.f.env(env).call(this.getData(env)).value();
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                data,
                                "only",
                                Validator.class,
                                env.callMethod(
                                        env.callMethod(
                                                env.callMethod(
                                                        collect.f
                                                                .env(env)
                                                                .call(this.getRules(env))
                                                                .value(),
                                                        "keys",
                                                        Validator.class),
                                                "map",
                                                Validator.class,
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Illuminate\\Validation",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(index = 0, name = "rule")
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object rule =
                                                                assignParameter(args, 0, false);
                                                        return ZVal.assign(
                                                                handleReturnReference(
                                                                                function_explode
                                                                                        .f
                                                                                        .env(env)
                                                                                        .call(
                                                                                                ".",
                                                                                                rule)
                                                                                        .value())
                                                                        .arrayGet(env, 0));
                                                    }
                                                }),
                                        "unique",
                                        Validator.class)),
                        "toArray",
                        Validator.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "rule")
    protected Object validateAttribute(RuntimeEnv env, Object... args) {
        ReferenceContainer attribute = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object rule = assignParameter(args, 1, false);
        Object runtimeTempArrayResult96 = null;
        Object validatable = null;
        Object method = null;
        Object keys = null;
        ReferenceContainer parameters = new BasicReferenceContainer(null);
        ReferenceContainer value = new BasicReferenceContainer(null);
        this.currentRule = rule;
        ZVal.list(
                runtimeTempArrayResult96 =
                        ValidationRuleParser.runtimeStaticObject.parse(env, rule),
                (rule = listGet(runtimeTempArrayResult96, 0, env)),
                (parameters.setObject(listGet(runtimeTempArrayResult96, 1, env))));
        if (ZVal.equalityCheck(rule, "")) {
            return null;
        }

        if (ZVal.toBool(keys = this.getExplicitKeys(env, attribute.getObject()))
                && ZVal.toBool(this.dependsOnOtherFields(env, rule))) {
            parameters.setObject(
                    this.replaceAsterisksInParameters(env, parameters.getObject(), keys));
        }

        value.setObject(this.getValue(env, attribute.getObject()));
        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.checkInstanceType(
                                                value.getObject(),
                                                UploadedFile.class,
                                                "Symfony\\Component\\HttpFoundation\\File\\UploadedFile"))
                                && ZVal.toBool(
                                        !ZVal.isTrue(
                                                env.callMethod(
                                                        value.getObject(),
                                                        "isValid",
                                                        Validator.class))))
                && ZVal.toBool(
                        this.hasRule(
                                env,
                                attribute.getObject(),
                                function_array_merge
                                        .f
                                        .env(env)
                                        .call(this.fileRules, this.implicitRules)
                                        .value()))) {
            return ZVal.assign(
                    this.addFailure(env, attribute.getObject(), "uploaded", ZVal.newArray()));
        }

        validatable = this.isValidatable(env, rule, attribute.getObject(), value.getObject());
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        rule, Rule.class, "Illuminate\\Contracts\\Validation\\Rule"))) {
            return ZVal.assign(
                    ZVal.isTrue(validatable)
                            ? this.validateUsingCustomRule(
                                    env, attribute.getObject(), value.getObject(), rule)
                            : ZVal.getNull());
        }

        method = ZVal.assign("validate" + toStringR(rule, env));
        if (ZVal.toBool(validatable)
                && ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        this,
                                        new RuntimeArgsWithReferences()
                                                .add(0, attribute)
                                                .add(1, value)
                                                .add(2, parameters)
                                                .add(3, new ReadOnlyReferenceContainer(this)),
                                        toStringR(method, env),
                                        Validator.class,
                                        attribute.getObject(),
                                        value.getObject(),
                                        parameters.getObject(),
                                        this)))) {
            this.addFailure(env, attribute.getObject(), rule, parameters.getObject());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rule")
    protected Object dependsOnOtherFields(RuntimeEnv env, Object... args) {
        Object rule = assignParameter(args, 0, false);
        return ZVal.assign(function_in_array.f.env(env).call(rule, this.dependentRules).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    protected Object getExplicitKeys(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        ReferenceContainer keys = new BasicReferenceContainer(null);
        Object pattern = null;
        pattern =
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                "\\*",
                                "([^\\.]+)",
                                NamespaceGlobal.preg_quote
                                        .env(env)
                                        .call(this.getPrimaryAttribute(env, attribute), "/")
                                        .value())
                        .value();
        if (function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, keys))
                .call("/^" + toStringR(pattern, env) + "/", attribute, keys.getObject())
                .getBool()) {
            function_array_shift.f.env(env).call(keys.getObject());
            return ZVal.assign(keys.getObject());
        }

        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    protected Object getPrimaryAttribute(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object unparsed = null;
        Object parsed = null;
        for (ZPair zpairResult633 : ZVal.getIterable(this.implicitAttributes, env, false)) {
            unparsed = ZVal.assign(zpairResult633.getKey());
            parsed = ZVal.assign(zpairResult633.getValue());
            if (function_in_array.f.env(env).call(attribute, parsed).getBool()) {
                return ZVal.assign(unparsed);
            }
        }

        return ZVal.assign(attribute);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters", typeHint = "array")
    @ConvertedParameter(index = 1, name = "keys", typeHint = "array")
    protected Object replaceAsterisksInParameters(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Validation")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Validation/Validator.php");
        Object parameters = assignParameter(args, 0, false);
        Object keys = assignParameter(args, 1, false);
        return ZVal.assign(
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Validation",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "field")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object field = assignParameter(args, 0, false);
                                        Object keys = null;
                                        keys = this.contextReferences.getCapturedValue("keys");
                                        return ZVal.assign(
                                                NamespaceGlobal.vsprintf
                                                        .env(env)
                                                        .call(
                                                                function_str_replace
                                                                        .f
                                                                        .env(env)
                                                                        .call("*", "%s", field)
                                                                        .value(),
                                                                keys)
                                                        .value());
                                    }
                                }.use("keys", keys),
                                parameters)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rule")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "value")
    protected Object isValidatable(RuntimeEnv env, Object... args) {
        Object rule = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, false);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                this.presentOrRuleIsImplicit(
                                                                        env, rule, attribute,
                                                                        value))
                                                        && ZVal.toBool(
                                                                this.passesOptionalCheck(
                                                                        env, attribute)))
                                        && ZVal.toBool(
                                                this.isNotNullIfMarkedAsNullable(
                                                        env, rule, attribute)))
                        && ZVal.toBool(
                                this.hasNotFailedPreviousRuleIfPresenceRule(env, rule, attribute)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rule")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "value")
    protected Object presentOrRuleIsImplicit(RuntimeEnv env, Object... args) {
        Object rule = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, false);
        if (ZVal.toBool(function_is_string.f.env(env).call(value).value())
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                function_trim.f.env(env).call(value).value(), "===", ""))) {
            return ZVal.assign(this.isImplicit(env, rule));
        }

        return ZVal.assign(
                ZVal.toBool(this.validatePresent(env, attribute, value))
                        || ZVal.toBool(this.isImplicit(env, rule)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rule")
    protected Object isImplicit(RuntimeEnv env, Object... args) {
        Object rule = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.checkInstanceType(
                                        rule,
                                        ImplicitRule.class,
                                        "Illuminate\\Contracts\\Validation\\ImplicitRule"))
                        || ZVal.toBool(
                                function_in_array
                                        .f
                                        .env(env)
                                        .call(rule, this.implicitRules)
                                        .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    protected Object passesOptionalCheck(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object data = null;
        if (!ZVal.isTrue(this.hasRule(env, attribute, ZVal.arrayFromList("Sometimes")))) {
            return ZVal.assign(true);
        }

        data =
                ValidationData.runtimeStaticObject.initializeAndGatherData(
                        env, attribute, this.data);
        return ZVal.assign(
                ZVal.toBool(function_array_key_exists.f.env(env).call(attribute, data).value())
                        || ZVal.toBool(
                                function_array_key_exists
                                        .f
                                        .env(env)
                                        .call(attribute, this.data)
                                        .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rule")
    @ConvertedParameter(index = 1, name = "attribute")
    protected Object isNotNullIfMarkedAsNullable(RuntimeEnv env, Object... args) {
        Object rule = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        if (ZVal.toBool(this.isImplicit(env, rule))
                || ZVal.toBool(
                        !ZVal.isTrue(
                                this.hasRule(env, attribute, ZVal.arrayFromList("Nullable"))))) {
            return ZVal.assign(true);
        }

        return ZVal.assign(
                !function_is_null
                        .f
                        .env(env)
                        .call(Arr.runtimeStaticObject.get(env, this.data, attribute, 0))
                        .getBool());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rule")
    @ConvertedParameter(index = 1, name = "attribute")
    protected Object hasNotFailedPreviousRuleIfPresenceRule(RuntimeEnv env, Object... args) {
        Object rule = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        return ZVal.assign(
                function_in_array
                                .f
                                .env(env)
                                .call(rule, ZVal.arrayFromList("Unique", "Exists"))
                                .getBool()
                        ? !ZVal.isTrue(
                                env.callMethod(this.messages, "has", Validator.class, attribute))
                        : true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "rule")
    protected Object validateUsingCustomRule(RuntimeEnv env, Object... args) {
        ReferenceContainer attribute = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object value = assignParameter(args, 1, false);
        Object rule = assignParameter(args, 2, false);
        if (!ZVal.isTrue(
                env.callMethod(rule, "passes", Validator.class, attribute.getObject(), value))) {
            new ReferenceClassProperty(this, "failedRules", env)
                    .arrayAccess(
                            env,
                            attribute.getObject(),
                            function_get_class.f.env(env).call(rule).value())
                    .set(ZVal.newArray());
            env.callMethod(
                    this.messages,
                    new RuntimeArgsWithReferences().add(0, attribute),
                    "add",
                    Validator.class,
                    attribute.getObject(),
                    this.makeReplacements(
                            env,
                            env.callMethod(rule, "message", Validator.class),
                            attribute.getObject(),
                            function_get_class.f.env(env).call(rule).value(),
                            ZVal.newArray()));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    protected Object shouldStopValidating(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.hasRule(env, attribute, ZVal.arrayFromList("Bail")))) {
            return ZVal.assign(env.callMethod(this.messages, "has", Validator.class, attribute));
        }

        if (ZVal.toBool(
                        arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "failedRules", env),
                                env,
                                attribute))
                && ZVal.toBool(
                        function_array_key_exists
                                .f
                                .env(env)
                                .call(
                                        "uploaded",
                                        new ReferenceClassProperty(this, "failedRules", env)
                                                .arrayGet(env, attribute))
                                .value())) {
            return ZVal.assign(true);
        }

        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(this.hasRule(env, attribute, this.implicitRules))
                                        && ZVal.toBool(
                                                arrayActionR(
                                                        ArrayAction.ISSET,
                                                        new ReferenceClassProperty(
                                                                this, "failedRules", env),
                                                        env,
                                                        attribute)))
                        && ZVal.toBool(
                                function_array_intersect
                                        .f
                                        .env(env)
                                        .call(
                                                function_array_keys
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                new ReferenceClassProperty(
                                                                                this,
                                                                                "failedRules",
                                                                                env)
                                                                        .arrayGet(env, attribute))
                                                        .value(),
                                                this.implicitRules)
                                        .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "rule")
    @ConvertedParameter(index = 2, name = "parameters")
    protected Object addFailure(RuntimeEnv env, Object... args) {
        ReferenceContainer attribute = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object rule = assignParameter(args, 1, false);
        Object parameters = assignParameter(args, 2, false);
        env.callMethod(
                this.messages,
                new RuntimeArgsWithReferences().add(0, attribute),
                "add",
                Validator.class,
                attribute.getObject(),
                this.makeReplacements(
                        env,
                        this.getMessage(env, attribute.getObject(), rule),
                        attribute.getObject(),
                        rule,
                        parameters));
        new ReferenceClassProperty(this, "failedRules", env)
                .arrayAccess(env, attribute.getObject(), rule)
                .set(parameters);
        return null;
    }

    @ConvertedMethod
    public Object valid(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.messages)) {
            this.passes(env);
        }

        return ZVal.assign(
                function_array_diff_key
                        .f
                        .env(env)
                        .call(this.data, this.attributesThatHaveMessages(env))
                        .value());
    }

    @ConvertedMethod
    public Object invalid(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.messages)) {
            this.passes(env);
        }

        return ZVal.assign(
                function_array_intersect_key
                        .f
                        .env(env)
                        .call(this.data, this.attributesThatHaveMessages(env))
                        .value());
    }

    @ConvertedMethod
    protected Object attributesThatHaveMessages(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Validation")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Validation/Validator.php");
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                collect.f
                                                        .env(env)
                                                        .call(
                                                                env.callMethod(
                                                                        this.messages(env),
                                                                        "toArray",
                                                                        Validator.class))
                                                        .value(),
                                                "map",
                                                Validator.class,
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Illuminate\\Validation",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(index = 0, name = "message")
                                                    @ConvertedParameter(index = 1, name = "key")
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object message =
                                                                assignParameter(args, 0, false);
                                                        Object key =
                                                                assignParameter(args, 1, false);
                                                        return ZVal.assign(
                                                                handleReturnReference(
                                                                                function_explode
                                                                                        .f
                                                                                        .env(env)
                                                                                        .call(
                                                                                                ".",
                                                                                                key)
                                                                                        .value())
                                                                        .arrayGet(env, 0));
                                                    }
                                                }),
                                        "unique",
                                        Validator.class),
                                "flip",
                                Validator.class),
                        "all",
                        Validator.class));
    }

    @ConvertedMethod
    public Object failed(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.failedRules);
    }

    @ConvertedMethod
    public Object messages(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.messages)) {
            this.passes(env);
        }

        return ZVal.assign(this.messages);
    }

    @ConvertedMethod
    public Object errors(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.messages(env));
    }

    @ConvertedMethod
    public Object getMessageBag(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.messages(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "rules")
    public Object hasRule(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object rules = assignParameter(args, 1, false);
        return ZVal.assign(
                !function_is_null.f.env(env).call(this.getRule(env, attribute, rules)).getBool());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "rules")
    protected Object getRule(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object rules = assignParameter(args, 1, false);
        Object rule = null;
        Object parameters = null;
        Object runtimeTempArrayResult97 = null;
        if (!function_array_key_exists.f.env(env).call(attribute, this.rules).getBool()) {
            return null;
        }

        rules = ZVal.assign(rToArrayCast(rules));
        for (ZPair zpairResult634 :
                ZVal.getIterable(
                        new ReferenceClassProperty(this, "rules", env).arrayGet(env, attribute),
                        env,
                        true)) {
            rule = ZVal.assign(zpairResult634.getValue());
            ZVal.list(
                    runtimeTempArrayResult97 =
                            ValidationRuleParser.runtimeStaticObject.parse(env, rule),
                    (rule = listGet(runtimeTempArrayResult97, 0, env)),
                    (parameters = listGet(runtimeTempArrayResult97, 1, env)));
            if (function_in_array.f.env(env).call(rule, rules).getBool()) {
                return ZVal.assign(ZVal.newArray(new ZPair(0, rule), new ZPair(1, parameters)));
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object attributes(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getData(env));
    }

    @ConvertedMethod
    public Object getData(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.data);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    public Object setData(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        this.data = this.parseData(env, data);
        this.setRules(env, this.initialRules);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    protected Object getValue(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        return ZVal.assign(Arr.runtimeStaticObject.get(env, this.data, attribute));
    }

    @ConvertedMethod
    public Object getRules(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.rules);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rules", typeHint = "array")
    public Object setRules(RuntimeEnv env, Object... args) {
        Object rules = assignParameter(args, 0, false);
        this.initialRules = rules;
        this.rules = ZVal.newArray();
        this.addRules(env, rules);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rules")
    public Object addRules(RuntimeEnv env, Object... args) {
        Object rules = assignParameter(args, 0, false);
        Object response = null;
        response =
                env.callMethod(
                        new ValidationRuleParser(env, this.data),
                        "explode",
                        Validator.class,
                        rules);
        this.rules =
                function_array_merge_recursive
                        .f
                        .env(env)
                        .call(
                                this.rules,
                                toObjectR(response).accessProp(this, env).name("rules").value())
                        .value();
        this.implicitAttributes =
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                this.implicitAttributes,
                                toObjectR(response)
                                        .accessProp(this, env)
                                        .name("implicitAttributes")
                                        .value())
                        .value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "rules")
    @ConvertedParameter(index = 2, name = "callback", typeHint = "callable")
    public Object sometimes(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object rules = assignParameter(args, 1, false);
        Object callback = assignParameter(args, 2, false);
        Object payload = null;
        Object key = null;
        payload = new Fluent(env, this.getData(env));
        if (function_call_user_func
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                .call(callback, payload)
                .getBool()) {
            for (ZPair zpairResult635 : ZVal.getIterable(rToArrayCast(attribute), env, true)) {
                key = ZVal.assign(zpairResult635.getValue());
                this.addRules(env, ZVal.newArray(new ZPair(key, rules)));
            }
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "extensions", typeHint = "array")
    public Object addExtensions(RuntimeEnv env, Object... args) {
        Object extensions = assignParameter(args, 0, false);
        Object keys = null;
        if (ZVal.isTrue(extensions)) {
            keys =
                    function_array_map
                            .f
                            .env(env)
                            .call(
                                    "\\Illuminate\\Support\\Str::snake",
                                    function_array_keys.f.env(env).call(extensions).value())
                            .value();
            extensions =
                    function_array_combine
                            .f
                            .env(env)
                            .call(keys, function_array_values.f.env(env).call(extensions).value())
                            .value();
        }

        this.extensions = function_array_merge.f.env(env).call(this.extensions, extensions).value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "extensions", typeHint = "array")
    public Object addImplicitExtensions(RuntimeEnv env, Object... args) {
        Object extensions = assignParameter(args, 0, false);
        Object extension = null;
        Object rule = null;
        this.addExtensions(env, extensions);
        for (ZPair zpairResult636 : ZVal.getIterable(extensions, env, false)) {
            rule = ZVal.assign(zpairResult636.getKey());
            extension = ZVal.assign(zpairResult636.getValue());
            new ReferenceClassProperty(this, "implicitRules", env)
                    .arrayAppend(env)
                    .set(Str.runtimeStaticObject.studly(env, rule));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "extensions", typeHint = "array")
    public Object addDependentExtensions(RuntimeEnv env, Object... args) {
        Object extensions = assignParameter(args, 0, false);
        Object extension = null;
        Object rule = null;
        this.addExtensions(env, extensions);
        for (ZPair zpairResult637 : ZVal.getIterable(extensions, env, false)) {
            rule = ZVal.assign(zpairResult637.getKey());
            extension = ZVal.assign(zpairResult637.getValue());
            new ReferenceClassProperty(this, "dependentRules", env)
                    .arrayAppend(env)
                    .set(Str.runtimeStaticObject.studly(env, rule));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rule")
    @ConvertedParameter(index = 1, name = "extension")
    public Object addExtension(RuntimeEnv env, Object... args) {
        Object rule = assignParameter(args, 0, false);
        Object extension = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "extensions", env)
                .arrayAccess(env, Str.runtimeStaticObject.snake(env, rule))
                .set(extension);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rule")
    @ConvertedParameter(index = 1, name = "extension")
    public Object addImplicitExtension(RuntimeEnv env, Object... args) {
        Object rule = assignParameter(args, 0, false);
        Object extension = assignParameter(args, 1, false);
        this.addExtension(env, rule, extension);
        new ReferenceClassProperty(this, "implicitRules", env)
                .arrayAppend(env)
                .set(Str.runtimeStaticObject.studly(env, rule));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rule")
    @ConvertedParameter(index = 1, name = "extension")
    public Object addDependentExtension(RuntimeEnv env, Object... args) {
        Object rule = assignParameter(args, 0, false);
        Object extension = assignParameter(args, 1, false);
        this.addExtension(env, rule, extension);
        new ReferenceClassProperty(this, "dependentRules", env)
                .arrayAppend(env)
                .set(Str.runtimeStaticObject.studly(env, rule));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "replacers", typeHint = "array")
    public Object addReplacers(RuntimeEnv env, Object... args) {
        Object replacers = assignParameter(args, 0, false);
        Object keys = null;
        if (ZVal.isTrue(replacers)) {
            keys =
                    function_array_map
                            .f
                            .env(env)
                            .call(
                                    "\\Illuminate\\Support\\Str::snake",
                                    function_array_keys.f.env(env).call(replacers).value())
                            .value();
            replacers =
                    function_array_combine
                            .f
                            .env(env)
                            .call(keys, function_array_values.f.env(env).call(replacers).value())
                            .value();
        }

        this.replacers = function_array_merge.f.env(env).call(this.replacers, replacers).value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rule")
    @ConvertedParameter(index = 1, name = "replacer")
    public Object addReplacer(RuntimeEnv env, Object... args) {
        Object rule = assignParameter(args, 0, false);
        Object replacer = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "replacers", env)
                .arrayAccess(env, Str.runtimeStaticObject.snake(env, rule))
                .set(replacer);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messages", typeHint = "array")
    public Object setCustomMessages(RuntimeEnv env, Object... args) {
        Object messages = assignParameter(args, 0, false);
        this.customMessages =
                function_array_merge.f.env(env).call(this.customMessages, messages).value();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes", typeHint = "array")
    public Object setAttributeNames(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, false);
        this.customAttributes = attributes;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "customAttributes", typeHint = "array")
    public Object addCustomAttributes(RuntimeEnv env, Object... args) {
        Object customAttributes = assignParameter(args, 0, false);
        this.customAttributes =
                function_array_merge
                        .f
                        .env(env)
                        .call(this.customAttributes, customAttributes)
                        .value();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values", typeHint = "array")
    public Object setValueNames(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, false);
        this.customValues = values;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "customValues", typeHint = "array")
    public Object addCustomValues(RuntimeEnv env, Object... args) {
        Object customValues = assignParameter(args, 0, false);
        this.customValues =
                function_array_merge.f.env(env).call(this.customValues, customValues).value();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messages", typeHint = "array")
    public Object setFallbackMessages(RuntimeEnv env, Object... args) {
        Object messages = assignParameter(args, 0, false);
        this.fallbackMessages = messages;
        return null;
    }

    @ConvertedMethod
    public Object getPresenceVerifier(RuntimeEnv env, Object... args) {
        if (!ZVal.isset(this.presenceVerifier)) {
            throw ZVal.getException(
                    env, new RuntimeException(env, "Presence verifier has not been set."));
        }

        return ZVal.assign(this.presenceVerifier);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connection")
    protected Object getPresenceVerifierFor(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Validation")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Validation/Validator.php");
        Object connection = assignParameter(args, 0, false);
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                this.getPresenceVerifier(env),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Validation",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "verifier")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object verifier = assignParameter(args, 0, false);
                                        Object connection = null;
                                        connection =
                                                this.contextReferences.getCapturedValue(
                                                        "connection");
                                        env.callMethod(
                                                verifier,
                                                "setConnection",
                                                Validator.class,
                                                connection);
                                        return null;
                                    }
                                }.use("connection", connection))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "presenceVerifier",
        typeHint = "Illuminate\\Validation\\PresenceVerifierInterface"
    )
    public Object setPresenceVerifier(RuntimeEnv env, Object... args) {
        Object presenceVerifier = assignParameter(args, 0, false);
        this.presenceVerifier = presenceVerifier;
        return null;
    }

    @ConvertedMethod
    public Object getTranslator(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.translator);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "translator",
        typeHint = "Illuminate\\Contracts\\Translation\\Translator"
    )
    public Object setTranslator(RuntimeEnv env, Object... args) {
        Object translator = assignParameter(args, 0, false);
        this.translator = translator;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Illuminate\\Contracts\\Container\\Container"
    )
    public Object setContainer(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        this.container = container;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rule")
    @ConvertedParameter(index = 1, name = "parameters")
    protected Object callExtension(RuntimeEnv env, Object... args) {
        Object rule = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        Object callback = null;
        callback =
                ZVal.assign(
                        new ReferenceClassProperty(this, "extensions", env).arrayGet(env, rule));
        if (function_is_callable.f.env(env).call(callback).getBool()) {
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(callback, parameters)
                            .value());

        } else if (function_is_string.f.env(env).call(callback).getBool()) {
            return ZVal.assign(this.callClassBasedExtension(env, callback, parameters));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    @ConvertedParameter(index = 1, name = "parameters")
    protected Object callClassBasedExtension(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        Object method = null;
        Object runtimeTempArrayResult98 = null;
        Object _pClass = null;
        ZVal.list(
                runtimeTempArrayResult98 =
                        Str.runtimeStaticObject.parseCallback(env, callback, "validate"),
                (_pClass = listGet(runtimeTempArrayResult98, 0, env)),
                (method = listGet(runtimeTempArrayResult98, 1, env)));
        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                env.callMethod(
                                                        this.container,
                                                        "make",
                                                        Validator.class,
                                                        _pClass)),
                                        new ZPair(1, method)),
                                parameters)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        Object rule = null;
        rule =
                Str.runtimeStaticObject.snake(
                        env, function_substr.f.env(env).call(method, 8).value());
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "extensions", env),
                env,
                rule)) {
            return ZVal.assign(this.callExtension(env, rule, parameters));
        }

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

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "rule")
    protected Object getMessage(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object rule = assignParameter(args, 1, false);
        Object lowerRule = null;
        Object customKey = null;
        Object inlineMessage = null;
        Object customMessage = null;
        Object ternaryExpressionTemp = null;
        Object value = null;
        Object key = null;
        inlineMessage = this.getInlineMessage(env, attribute, rule);
        if (!function_is_null.f.env(env).call(inlineMessage).getBool()) {
            return ZVal.assign(inlineMessage);
        }

        lowerRule = Str.runtimeStaticObject.snake(env, rule);
        customMessage =
                this.getCustomMessageFromTranslator(
                        env,
                        customKey =
                                ZVal.assign(
                                        "validation.custom."
                                                + toStringR(attribute, env)
                                                + "."
                                                + toStringR(lowerRule, env)));
        if (ZVal.strictNotEqualityCheck(customMessage, "!==", customKey)) {
            return ZVal.assign(customMessage);

        } else if (function_in_array.f.env(env).call(rule, this.sizeRules).getBool()) {
            return ZVal.assign(this.getSizeMessage(env, attribute, rule));
        }

        key = ZVal.assign("validation." + toStringR(lowerRule, env));
        if (ZVal.notEqualityCheck(
                key, value = env.callMethod(this.translator, "trans", Validator.class, key))) {
            return ZVal.assign(value);
        }

        return ZVal.assign(
                ZVal.isTrue(
                                ternaryExpressionTemp =
                                        this.getFromLocalArray(
                                                env, attribute, lowerRule, this.fallbackMessages))
                        ? ternaryExpressionTemp
                        : key);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "rule")
    protected Object getInlineMessage(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object rule = assignParameter(args, 1, false);
        ReferenceContainer inlineEntry = new BasicReferenceContainer(null);
        inlineEntry.setObject(
                this.getFromLocalArray(env, attribute, Str.runtimeStaticObject.snake(env, rule)));
        return ZVal.assign(
                ZVal.toBool(function_is_array.f.env(env).call(inlineEntry.getObject()).value())
                                && ZVal.toBool(
                                        function_in_array
                                                .f
                                                .env(env)
                                                .call(rule, this.sizeRules)
                                                .value())
                        ? inlineEntry.arrayGet(env, this.getAttributeType(env, attribute))
                        : inlineEntry.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "lowerRule")
    @ConvertedParameter(
        index = 2,
        name = "source",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object getFromLocalArray(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object lowerRule = assignParameter(args, 1, false);
        ReferenceContainer source = new BasicReferenceContainer(assignParameter(args, 2, true));
        if (null == source.getObject()) {
            source.setObject(ZVal.getNull());
        }
        Object sourceKey = null;
        Object keys = null;
        Object ternaryExpressionTemp = null;
        Object key = null;
        source.setObject(
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = source.getObject())
                                ? ternaryExpressionTemp
                                : this.customMessages));
        keys =
                ZVal.newArray(
                        new ZPair(0, toStringR(attribute, env) + "." + toStringR(lowerRule, env)),
                        new ZPair(1, lowerRule));
        for (ZPair zpairResult2366 : ZVal.getIterable(keys, env, true)) {
            key = ZVal.assign(zpairResult2366.getValue());
            for (ZPair zpairResult2367 :
                    ZVal.getIterable(
                            function_array_keys.f.env(env).call(source.getObject()).value(),
                            env,
                            true)) {
                sourceKey = ZVal.assign(zpairResult2367.getValue());
                if (ZVal.isTrue(Str.runtimeStaticObject.is(env, sourceKey, key))) {
                    return ZVal.assign(source.arrayGet(env, sourceKey));
                }
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    protected Object getCustomMessageFromTranslator(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object shortKey = null;
        Object message = null;
        if (ZVal.strictNotEqualityCheck(
                message = env.callMethod(this.translator, "trans", Validator.class, key),
                "!==",
                key)) {
            return ZVal.assign(message);
        }

        shortKey =
                function_preg_replace.f.env(env).call("/^validation\\.custom\\./", "", key).value();
        return ZVal.assign(
                this.getWildcardCustomMessages(
                        env,
                        Arr.runtimeStaticObject.dot(
                                env,
                                rToArrayCast(
                                        env.callMethod(
                                                this.translator,
                                                "trans",
                                                Validator.class,
                                                "validation.custom"))),
                        shortKey,
                        key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messages")
    @ConvertedParameter(index = 1, name = "search")
    @ConvertedParameter(index = 2, name = "default")
    protected Object getWildcardCustomMessages(RuntimeEnv env, Object... args) {
        Object messages = assignParameter(args, 0, false);
        Object search = assignParameter(args, 1, false);
        Object _pDefault = assignParameter(args, 2, false);
        Object message = null;
        Object key = null;
        for (ZPair zpairResult2368 : ZVal.getIterable(messages, env, false)) {
            key = ZVal.assign(zpairResult2368.getKey());
            message = ZVal.assign(zpairResult2368.getValue());
            if (ZVal.toBool(ZVal.strictEqualityCheck(search, "===", key))
                    || ZVal.toBool(
                            ZVal.toBool(
                                            Str.runtimeStaticObject.contains(
                                                    env, key, ZVal.arrayFromList("*")))
                                    && ZVal.toBool(Str.runtimeStaticObject.is(env, key, search)))) {
                return ZVal.assign(message);
            }
        }

        return ZVal.assign(_pDefault);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "rule")
    protected Object getSizeMessage(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object rule = assignParameter(args, 1, false);
        Object lowerRule = null;
        Object type = null;
        Object key = null;
        lowerRule = Str.runtimeStaticObject.snake(env, rule);
        type = this.getAttributeType(env, attribute);
        key = ZVal.assign("validation." + toStringR(lowerRule, env) + "." + toStringR(type, env));
        return ZVal.assign(env.callMethod(this.translator, "trans", Validator.class, key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    protected Object getAttributeType(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.hasRule(env, attribute, this.numericRules))) {
            return "numeric";

        } else if (ZVal.isTrue(this.hasRule(env, attribute, ZVal.arrayFromList("Array")))) {
            return "array";

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        this.getValue(env, attribute),
                        UploadedFile.class,
                        "Symfony\\Component\\HttpFoundation\\File\\UploadedFile"))) {
            return "file";
        }

        return "string";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rule")
    @ConvertedParameter(index = 3, name = "parameters")
    public Object makeReplacements(RuntimeEnv env, Object... args) {
        ReferenceContainer message = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer attribute = new BasicReferenceContainer(assignParameter(args, 1, false));
        ReferenceContainer rule = new BasicReferenceContainer(assignParameter(args, 2, false));
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 3, false));
        Object replacer = null;
        message.setObject(
                this.replaceAttributePlaceholder(
                        env,
                        message.getObject(),
                        this.getDisplayableAttribute(env, attribute.getObject())));
        message.setObject(
                this.replaceInputPlaceholder(env, message.getObject(), attribute.getObject()));
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "replacers", env),
                env,
                Str.runtimeStaticObject.snake(env, rule.getObject()))) {
            return ZVal.assign(
                    this.callReplacer(
                            env,
                            message.getObject(),
                            attribute.getObject(),
                            Str.runtimeStaticObject.snake(env, rule.getObject()),
                            parameters.getObject(),
                            this));

        } else if (function_method_exists
                .f
                .env(env)
                .call(this, replacer = ZVal.assign("replace" + toStringR(rule.getObject(), env)))
                .getBool()) {
            return ZVal.assign(
                    env.callMethod(
                            this,
                            new RuntimeArgsWithReferences()
                                    .add(0, message)
                                    .add(1, attribute)
                                    .add(2, rule)
                                    .add(3, parameters),
                            toStringR(replacer, env),
                            Validator.class,
                            message.getObject(),
                            attribute.getObject(),
                            rule.getObject(),
                            parameters.getObject()));
        }

        return ZVal.assign(message.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    public Object getDisplayableAttribute(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object expectedAttributes = null;
        Object primaryAttribute = null;
        Object line = null;
        Object name = null;
        primaryAttribute = this.getPrimaryAttribute(env, attribute);
        expectedAttributes =
                ZVal.assign(
                        ZVal.notEqualityCheck(attribute, primaryAttribute)
                                ? ZVal.newArray(
                                        new ZPair(0, attribute), new ZPair(1, primaryAttribute))
                                : ZVal.newArray(new ZPair(0, attribute)));
        for (ZPair zpairResult2369 : ZVal.getIterable(expectedAttributes, env, true)) {
            name = ZVal.assign(zpairResult2369.getValue());
            if (arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "customAttributes", env),
                    env,
                    name)) {
                return ZVal.assign(
                        new ReferenceClassProperty(this, "customAttributes", env)
                                .arrayGet(env, name));
            }

            if (ZVal.isTrue(line = this.getAttributeFromTranslations(env, name))) {
                return ZVal.assign(line);
            }
        }

        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "implicitAttributes", env),
                env,
                primaryAttribute)) {
            return ZVal.assign(attribute);
        }

        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call("_", " ", Str.runtimeStaticObject.snake(env, attribute))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object getAttributeFromTranslations(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                Arr.runtimeStaticObject.get(
                        env,
                        env.callMethod(
                                this.translator, "trans", Validator.class, "validation.attributes"),
                        name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "value")
    protected Object replaceAttributePlaceholder(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                ZVal.arrayFromList(":attribute", ":ATTRIBUTE", ":Attribute"),
                                ZVal.newArray(
                                        new ZPair(0, value),
                                        new ZPair(1, Str.runtimeStaticObject.upper(env, value)),
                                        new ZPair(2, Str.runtimeStaticObject.ucfirst(env, value))),
                                message)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "attribute")
    protected Object replaceInputPlaceholder(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object actualValue = null;
        actualValue = this.getValue(env, attribute);
        if (ZVal.toBool(function_is_scalar.f.env(env).call(actualValue).value())
                || ZVal.toBool(function_is_null.f.env(env).call(actualValue).value())) {
            message = function_str_replace.f.env(env).call(":input", actualValue, message).value();
        }

        return ZVal.assign(message);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    public Object getDisplayableValue(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object line = null;
        Object key = null;
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "customValues", env),
                env,
                attribute,
                value)) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "customValues", env)
                            .arrayGet(env, attribute, value));
        }

        key =
                ZVal.assign(
                        "validation.values."
                                + toStringR(attribute, env)
                                + "."
                                + toStringR(value, env));
        if (ZVal.strictNotEqualityCheck(
                line = env.callMethod(this.translator, "trans", Validator.class, key),
                "!==",
                key)) {
            return ZVal.assign(line);
        }

        return ZVal.assign(value);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values", typeHint = "array")
    protected Object getAttributeList(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, false);
        ReferenceContainer attributes = new BasicReferenceContainer(null);
        Object value = null;
        Object key = null;
        attributes.setObject(ZVal.newArray());
        for (ZPair zpairResult2370 : ZVal.getIterable(values, env, false)) {
            key = ZVal.assign(zpairResult2370.getKey());
            value = ZVal.assign(zpairResult2370.getValue());
            attributes.arrayAccess(env, key).set(this.getDisplayableAttribute(env, value));
        }

        return ZVal.assign(attributes.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rule")
    @ConvertedParameter(index = 3, name = "parameters")
    @ConvertedParameter(index = 4, name = "validator")
    protected Object callReplacer(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object rule = assignParameter(args, 2, false);
        Object parameters = assignParameter(args, 3, false);
        Object validator = assignParameter(args, 4, false);
        Object callback = null;
        callback =
                ZVal.assign(new ReferenceClassProperty(this, "replacers", env).arrayGet(env, rule));
        if (ZVal.isTrue(ZVal.checkInstanceType(callback, Closure.class, "Closure"))) {
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    callback,
                                    function_func_get_args
                                            .f
                                            .env(env)
                                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                            .call()
                                            .value())
                            .value());

        } else if (function_is_string.f.env(env).call(callback).getBool()) {
            return ZVal.assign(
                    this.callClassBasedReplacer(
                            env, callback, message, attribute, rule, parameters, validator));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    @ConvertedParameter(index = 1, name = "message")
    @ConvertedParameter(index = 2, name = "attribute")
    @ConvertedParameter(index = 3, name = "rule")
    @ConvertedParameter(index = 4, name = "parameters")
    @ConvertedParameter(index = 5, name = "validator")
    protected Object callClassBasedReplacer(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, false);
        Object attribute = assignParameter(args, 2, false);
        Object rule = assignParameter(args, 3, false);
        Object parameters = assignParameter(args, 4, false);
        Object validator = assignParameter(args, 5, false);
        Object runtimeTempArrayResult236 = null;
        Object method = null;
        Object _pClass = null;
        ZVal.list(
                runtimeTempArrayResult236 =
                        Str.runtimeStaticObject.parseCallback(env, callback, "replace"),
                (_pClass = listGet(runtimeTempArrayResult236, 0, env)),
                (method = listGet(runtimeTempArrayResult236, 1, env)));
        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                env.callMethod(
                                                        this.container,
                                                        "make",
                                                        Validator.class,
                                                        _pClass)),
                                        new ZPair(1, method)),
                                function_array_slice
                                        .f
                                        .env(env)
                                        .call(
                                                function_func_get_args
                                                        .f
                                                        .env(env)
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithInfo(args, this))
                                                        .call()
                                                        .value(),
                                                1)
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rule")
    @ConvertedParameter(index = 3, name = "parameters")
    protected Object replaceBetween(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object rule = assignParameter(args, 2, false);
        Object parameters = assignParameter(args, 3, false);
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(ZVal.arrayFromList(":min", ":max"), parameters, message)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rule")
    @ConvertedParameter(index = 3, name = "parameters")
    protected Object replaceDateFormat(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object rule = assignParameter(args, 2, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 3, false));
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(":format", parameters.arrayGet(env, 0), message)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rule")
    @ConvertedParameter(index = 3, name = "parameters")
    protected Object replaceDifferent(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object rule = assignParameter(args, 2, false);
        Object parameters = assignParameter(args, 3, false);
        return ZVal.assign(this.replaceSame(env, message, attribute, rule, parameters));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rule")
    @ConvertedParameter(index = 3, name = "parameters")
    protected Object replaceDigits(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object rule = assignParameter(args, 2, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 3, false));
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(":digits", parameters.arrayGet(env, 0), message)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rule")
    @ConvertedParameter(index = 3, name = "parameters")
    protected Object replaceDigitsBetween(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object rule = assignParameter(args, 2, false);
        Object parameters = assignParameter(args, 3, false);
        return ZVal.assign(this.replaceBetween(env, message, attribute, rule, parameters));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rule")
    @ConvertedParameter(index = 3, name = "parameters")
    protected Object replaceMin(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object rule = assignParameter(args, 2, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 3, false));
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(":min", parameters.arrayGet(env, 0), message)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rule")
    @ConvertedParameter(index = 3, name = "parameters")
    protected Object replaceMax(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object rule = assignParameter(args, 2, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 3, false));
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(":max", parameters.arrayGet(env, 0), message)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rule")
    @ConvertedParameter(index = 3, name = "parameters")
    protected Object replaceIn(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object rule = assignParameter(args, 2, false);
        Object parameters = assignParameter(args, 3, false);
        ReferenceContainer parameter = new BasicReferenceContainer(null);
        for (ZPair zpairResult2371 : ZVal.getIterable(parameters, env, true)) {
            parameter = zpairResult2371;
            parameter.setObject(this.getDisplayableValue(env, attribute, parameter.getObject()));
        }

        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                ":values",
                                NamespaceGlobal.implode.env(env).call(", ", parameters).value(),
                                message)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rule")
    @ConvertedParameter(index = 3, name = "parameters")
    protected Object replaceNotIn(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object rule = assignParameter(args, 2, false);
        Object parameters = assignParameter(args, 3, false);
        return ZVal.assign(this.replaceIn(env, message, attribute, rule, parameters));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rule")
    @ConvertedParameter(index = 3, name = "parameters")
    protected Object replaceInArray(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object rule = assignParameter(args, 2, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 3, false));
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                ":other",
                                this.getDisplayableAttribute(env, parameters.arrayGet(env, 0)),
                                message)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rule")
    @ConvertedParameter(index = 3, name = "parameters")
    protected Object replaceMimetypes(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object rule = assignParameter(args, 2, false);
        Object parameters = assignParameter(args, 3, false);
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                ":values",
                                NamespaceGlobal.implode.env(env).call(", ", parameters).value(),
                                message)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rule")
    @ConvertedParameter(index = 3, name = "parameters")
    protected Object replaceMimes(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object rule = assignParameter(args, 2, false);
        Object parameters = assignParameter(args, 3, false);
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                ":values",
                                NamespaceGlobal.implode.env(env).call(", ", parameters).value(),
                                message)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rule")
    @ConvertedParameter(index = 3, name = "parameters")
    protected Object replaceRequiredWith(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object rule = assignParameter(args, 2, false);
        Object parameters = assignParameter(args, 3, false);
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                ":values",
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(" / ", this.getAttributeList(env, parameters))
                                        .value(),
                                message)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rule")
    @ConvertedParameter(index = 3, name = "parameters")
    protected Object replaceRequiredWithAll(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object rule = assignParameter(args, 2, false);
        Object parameters = assignParameter(args, 3, false);
        return ZVal.assign(this.replaceRequiredWith(env, message, attribute, rule, parameters));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rule")
    @ConvertedParameter(index = 3, name = "parameters")
    protected Object replaceRequiredWithout(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object rule = assignParameter(args, 2, false);
        Object parameters = assignParameter(args, 3, false);
        return ZVal.assign(this.replaceRequiredWith(env, message, attribute, rule, parameters));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rule")
    @ConvertedParameter(index = 3, name = "parameters")
    protected Object replaceRequiredWithoutAll(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object rule = assignParameter(args, 2, false);
        Object parameters = assignParameter(args, 3, false);
        return ZVal.assign(this.replaceRequiredWith(env, message, attribute, rule, parameters));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rule")
    @ConvertedParameter(index = 3, name = "parameters")
    protected Object replaceSize(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object rule = assignParameter(args, 2, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 3, false));
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(":size", parameters.arrayGet(env, 0), message)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rule")
    @ConvertedParameter(index = 3, name = "parameters")
    protected Object replaceGt(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object rule = assignParameter(args, 2, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 3, false));
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                ":value",
                                this.getSize(
                                        env,
                                        parameters.arrayGet(env, 0),
                                        this.getValue(env, parameters.arrayGet(env, 0))),
                                message)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rule")
    @ConvertedParameter(index = 3, name = "parameters")
    protected Object replaceLt(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object rule = assignParameter(args, 2, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 3, false));
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                ":value",
                                this.getSize(
                                        env,
                                        parameters.arrayGet(env, 0),
                                        this.getValue(env, parameters.arrayGet(env, 0))),
                                message)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rule")
    @ConvertedParameter(index = 3, name = "parameters")
    protected Object replaceGte(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object rule = assignParameter(args, 2, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 3, false));
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                ":value",
                                this.getSize(
                                        env,
                                        parameters.arrayGet(env, 0),
                                        this.getValue(env, parameters.arrayGet(env, 0))),
                                message)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rule")
    @ConvertedParameter(index = 3, name = "parameters")
    protected Object replaceLte(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object rule = assignParameter(args, 2, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 3, false));
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                ":value",
                                this.getSize(
                                        env,
                                        parameters.arrayGet(env, 0),
                                        this.getValue(env, parameters.arrayGet(env, 0))),
                                message)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rule")
    @ConvertedParameter(index = 3, name = "parameters")
    protected Object replaceRequiredIf(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object rule = assignParameter(args, 2, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 3, false));
        parameters
                .arrayAccess(env, 1)
                .set(
                        this.getDisplayableValue(
                                env,
                                parameters.arrayGet(env, 0),
                                Arr.runtimeStaticObject.get(
                                        env, this.data, parameters.arrayGet(env, 0))));
        parameters
                .arrayAccess(env, 0)
                .set(this.getDisplayableAttribute(env, parameters.arrayGet(env, 0)));
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                ZVal.arrayFromList(":other", ":value"),
                                parameters.getObject(),
                                message)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rule")
    @ConvertedParameter(index = 3, name = "parameters")
    protected Object replaceRequiredUnless(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object rule = assignParameter(args, 2, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 3, false));
        Object other = null;
        ReferenceContainer values = new BasicReferenceContainer(null);
        Object value = null;
        other = this.getDisplayableAttribute(env, parameters.arrayGet(env, 0));
        values.setObject(ZVal.newArray());
        for (ZPair zpairResult2372 :
                ZVal.getIterable(
                        function_array_slice.f.env(env).call(parameters.getObject(), 1).value(),
                        env,
                        true)) {
            value = ZVal.assign(zpairResult2372.getValue());
            values.arrayAppend(env)
                    .set(this.getDisplayableValue(env, parameters.arrayGet(env, 0), value));
        }

        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                ZVal.arrayFromList(":other", ":values"),
                                ZVal.newArray(
                                        new ZPair(0, other),
                                        new ZPair(
                                                1,
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(", ", values.getObject())
                                                        .value())),
                                message)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rule")
    @ConvertedParameter(index = 3, name = "parameters")
    protected Object replaceSame(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object rule = assignParameter(args, 2, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 3, false));
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                ":other",
                                this.getDisplayableAttribute(env, parameters.arrayGet(env, 0)),
                                message)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rule")
    @ConvertedParameter(index = 3, name = "parameters")
    protected Object replaceBefore(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object rule = assignParameter(args, 2, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 3, false));
        if (!NamespaceGlobal.strtotime.env(env).call(parameters.arrayGet(env, 0)).getBool()) {
            return ZVal.assign(
                    function_str_replace
                            .f
                            .env(env)
                            .call(
                                    ":date",
                                    this.getDisplayableAttribute(env, parameters.arrayGet(env, 0)),
                                    message)
                            .value());
        }

        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(":date", parameters.arrayGet(env, 0), message)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rule")
    @ConvertedParameter(index = 3, name = "parameters")
    protected Object replaceBeforeOrEqual(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object rule = assignParameter(args, 2, false);
        Object parameters = assignParameter(args, 3, false);
        return ZVal.assign(this.replaceBefore(env, message, attribute, rule, parameters));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rule")
    @ConvertedParameter(index = 3, name = "parameters")
    protected Object replaceAfter(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object rule = assignParameter(args, 2, false);
        Object parameters = assignParameter(args, 3, false);
        return ZVal.assign(this.replaceBefore(env, message, attribute, rule, parameters));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rule")
    @ConvertedParameter(index = 3, name = "parameters")
    protected Object replaceAfterOrEqual(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object rule = assignParameter(args, 2, false);
        Object parameters = assignParameter(args, 3, false);
        return ZVal.assign(this.replaceBefore(env, message, attribute, rule, parameters));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "attribute")
    @ConvertedParameter(index = 2, name = "rule")
    @ConvertedParameter(index = 3, name = "parameters")
    protected Object replaceDimensions(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object rule = assignParameter(args, 2, false);
        Object parameters = assignParameter(args, 3, false);
        Object value = null;
        Object key = null;
        parameters = this.parseNamedParameters(env, parameters);
        if (function_is_array.f.env(env).call(parameters).getBool()) {
            for (ZPair zpairResult2373 : ZVal.getIterable(parameters, env, false)) {
                key = ZVal.assign(zpairResult2373.getKey());
                value = ZVal.assign(zpairResult2373.getValue());
                message =
                        function_str_replace
                                .f
                                .env(env)
                                .call(":" + toStringR(key, env), value, message)
                                .value();
            }
        }

        return ZVal.assign(message);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    public Object validateAccepted(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object acceptable = null;
        acceptable =
                ZVal.newArray(
                        new ZPair(0, "yes"),
                        new ZPair(1, "on"),
                        new ZPair(2, "1"),
                        new ZPair(3, 1),
                        new ZPair(4, true),
                        new ZPair(5, "true"));
        return ZVal.assign(
                ZVal.toBool(this.validateRequired(env, attribute, value))
                        && ZVal.toBool(
                                function_in_array
                                        .f
                                        .env(env)
                                        .call(value, acceptable, true)
                                        .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    public Object validateActiveUrl(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object e = null;
        Object url = null;
        if (!function_is_string.f.env(env).call(value).getBool()) {
            return ZVal.assign(false);
        }

        if (ZVal.isTrue(url = NamespaceGlobal.parse_url.env(env).call(value, 1).value())) {
            try {
                return ZVal.assign(
                        ZVal.isGreaterThan(
                                function_count
                                        .f
                                        .env(env)
                                        .call(
                                                NamespaceGlobal.dns_get_record
                                                        .env(env)
                                                        .call(
                                                                url,
                                                                ZVal.toLong(1)
                                                                        | ZVal.toLong(134217728))
                                                        .value())
                                        .value(),
                                '>',
                                0));
            } catch (ConvertedException convertedException65) {
                if (convertedException65.instanceOf(PHPException.class, "Exception")) {
                    e = convertedException65.getObject();
                    return ZVal.assign(false);
                } else {
                    throw convertedException65;
                }
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object validateBail(RuntimeEnv env, Object... args) {
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateBefore(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object parameters = assignParameter(args, 2, false);
        this.requireParameterCount(env, 1, parameters, "before");
        return ZVal.assign(this.compareDates(env, attribute, value, parameters, "<"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateBeforeOrEqual(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object parameters = assignParameter(args, 2, false);
        this.requireParameterCount(env, 1, parameters, "before_or_equal");
        return ZVal.assign(this.compareDates(env, attribute, value, parameters, "<="));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateAfter(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object parameters = assignParameter(args, 2, false);
        this.requireParameterCount(env, 1, parameters, "after");
        return ZVal.assign(this.compareDates(env, attribute, value, parameters, ">"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateAfterOrEqual(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object parameters = assignParameter(args, 2, false);
        this.requireParameterCount(env, 1, parameters, "after_or_equal");
        return ZVal.assign(this.compareDates(env, attribute, value, parameters, ">="));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    @ConvertedParameter(index = 3, name = "operator")
    protected Object compareDates(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 2, false));
        Object operator = assignParameter(args, 3, false);
        Object date = null;
        Object format = null;
        if (ZVal.toBool(
                        ZVal.toBool(!function_is_string.f.env(env).call(value).getBool())
                                && ZVal.toBool(
                                        !function_is_numeric.f.env(env).call(value).getBool()))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        value, DateTimeInterface.class, "DateTimeInterface")))) {
            return ZVal.assign(false);
        }

        if (ZVal.isTrue(format = this.getDateFormat(env, attribute))) {
            return ZVal.assign(
                    this.checkDateTimeOrder(
                            env, format, value, parameters.arrayGet(env, 0), operator));
        }

        if (!ZVal.isTrue(date = this.getDateTimestamp(env, parameters.arrayGet(env, 0)))) {
            date = this.getDateTimestamp(env, this.getValue(env, parameters.arrayGet(env, 0)));
        }

        return ZVal.assign(this.compare(env, this.getDateTimestamp(env, value), date, operator));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    protected Object getDateFormat(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        ReferenceContainer result = new BasicReferenceContainer(null);
        if (ZVal.isTrue(result.setObject(this.getRule(env, attribute, "DateFormat")))) {
            return ZVal.assign(result.arrayGet(env, 1, 0));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object getDateTimestamp(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object date = null;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(value, DateTimeInterface.class, "DateTimeInterface"))) {
            return ZVal.assign(env.callMethod(value, "getTimestamp", Validator.class));
        }

        if (ZVal.isTrue(this.isTestingRelativeDateTime(env, value))) {
            date = this.getDateTime(env, value);
            if (!function_is_null.f.env(env).call(date).getBool()) {
                return ZVal.assign(env.callMethod(date, "getTimestamp", Validator.class));
            }
        }

        return ZVal.assign(NamespaceGlobal.strtotime.env(env).call(value).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "format")
    @ConvertedParameter(index = 1, name = "first")
    @ConvertedParameter(index = 2, name = "second")
    @ConvertedParameter(index = 3, name = "operator")
    protected Object checkDateTimeOrder(RuntimeEnv env, Object... args) {
        Object format = assignParameter(args, 0, false);
        Object first = assignParameter(args, 1, false);
        Object second = assignParameter(args, 2, false);
        Object operator = assignParameter(args, 3, false);
        Object firstDate = null;
        Object secondDate = null;
        firstDate = this.getDateTimeWithOptionalFormat(env, format, first);
        if (!ZVal.isTrue(secondDate = this.getDateTimeWithOptionalFormat(env, format, second))) {
            secondDate =
                    this.getDateTimeWithOptionalFormat(env, format, this.getValue(env, second));
        }

        return ZVal.assign(
                ZVal.toBool(ZVal.toBool(firstDate) && ZVal.toBool(secondDate))
                        && ZVal.toBool(this.compare(env, firstDate, secondDate, operator)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "format")
    @ConvertedParameter(index = 1, name = "value")
    protected Object getDateTimeWithOptionalFormat(RuntimeEnv env, Object... args) {
        Object format = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object date = null;
        if (ZVal.isTrue(
                date =
                        DateTime.runtimeStaticObject.createFromFormat(
                                env, "!" + toStringR(format, env), value))) {
            return ZVal.assign(date);
        }

        return ZVal.assign(this.getDateTime(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object getDateTime(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object e = null;
        try {
            if (ZVal.isTrue(this.isTestingRelativeDateTime(env, value))) {
                return ZVal.assign(new Carbon(env, value));
            }

            return ZVal.assign(new DateTime(env, value));
        } catch (ConvertedException convertedException66) {
            if (convertedException66.instanceOf(PHPException.class, "Exception")) {
                e = convertedException66.getObject();
            } else {
                throw convertedException66;
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object isTestingRelativeDateTime(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(Carbon.runtimeStaticObject.hasTestNow(env))
                                        && ZVal.toBool(
                                                function_is_string.f.env(env).call(value).value()))
                        && ZVal.toBool(
                                ZVal.toBool(ZVal.strictEqualityCheck(value, "===", "now"))
                                        || ZVal.toBool(
                                                Carbon.runtimeStaticObject.hasRelativeKeywords(
                                                        env, value))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    public Object validateAlpha(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.toBool(function_is_string.f.env(env).call(value).value())
                        && ZVal.toBool(
                                function_preg_match
                                        .f
                                        .env(env)
                                        .call("/^[\\pL\\pM]+$/u", value)
                                        .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    public Object validateAlphaDash(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        if (ZVal.toBool(!function_is_string.f.env(env).call(value).getBool())
                && ZVal.toBool(!function_is_numeric.f.env(env).call(value).getBool())) {
            return ZVal.assign(false);
        }

        return ZVal.assign(
                ZVal.isGreaterThan(
                        function_preg_match
                                .f
                                .env(env)
                                .call("/^[\\pL\\pM\\pN_-]+$/u", value)
                                .value(),
                        '>',
                        0));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    public Object validateAlphaNum(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        if (ZVal.toBool(!function_is_string.f.env(env).call(value).getBool())
                && ZVal.toBool(!function_is_numeric.f.env(env).call(value).getBool())) {
            return ZVal.assign(false);
        }

        return ZVal.assign(
                ZVal.isGreaterThan(
                        function_preg_match.f.env(env).call("/^[\\pL\\pM\\pN]+$/u", value).value(),
                        '>',
                        0));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    public Object validateArray(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(function_is_array.f.env(env).call(value).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateBetween(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 2, false));
        Object size = null;
        this.requireParameterCount(env, 2, parameters.getObject(), "between");
        size = this.getSize(env, attribute, value);
        return ZVal.assign(
                ZVal.toBool(ZVal.isGreaterThanOrEqualTo(size, ">=", parameters.arrayGet(env, 0)))
                        && ZVal.toBool(
                                ZVal.isLessThanOrEqualTo(size, "<=", parameters.arrayGet(env, 1))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    public Object validateBoolean(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object acceptable = null;
        acceptable =
                ZVal.newArray(
                        new ZPair(0, true),
                        new ZPair(1, false),
                        new ZPair(2, 0),
                        new ZPair(3, 1),
                        new ZPair(4, "0"),
                        new ZPair(5, "1"));
        return ZVal.assign(function_in_array.f.env(env).call(value, acceptable, true).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    public Object validateConfirmed(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(
                this.validateSame(
                        env,
                        attribute,
                        value,
                        ZVal.newArray(new ZPair(0, toStringR(attribute, env) + "_confirmation"))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    public Object validateDate(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        ReferenceContainer date = new BasicReferenceContainer(null);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(value, DateTimeInterface.class, "DateTimeInterface"))) {
            return ZVal.assign(true);
        }

        if (ZVal.toBool(
                        ZVal.toBool(!function_is_string.f.env(env).call(value).getBool())
                                && ZVal.toBool(
                                        !function_is_numeric.f.env(env).call(value).getBool()))
                || ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                NamespaceGlobal.strtotime.env(env).call(value).value(),
                                "===",
                                false))) {
            return ZVal.assign(false);
        }

        date.setObject(NamespaceGlobal.date_parse.env(env).call(value).value());
        return ZVal.assign(
                NamespaceGlobal.checkdate
                        .env(env)
                        .call(
                                date.arrayGet(env, "month"),
                                date.arrayGet(env, "day"),
                                date.arrayGet(env, "year"))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateDateFormat(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 2, false));
        Object date = null;
        Object format = null;
        this.requireParameterCount(env, 1, parameters.getObject(), "date_format");
        if (ZVal.toBool(!function_is_string.f.env(env).call(value).getBool())
                && ZVal.toBool(!function_is_numeric.f.env(env).call(value).getBool())) {
            return ZVal.assign(false);
        }

        format = ZVal.assign(parameters.arrayGet(env, 0));
        date =
                DateTime.runtimeStaticObject.createFromFormat(
                        env, "!" + toStringR(format, env), value);
        return ZVal.assign(
                ZVal.toBool(date)
                        && ZVal.toBool(
                                ZVal.equalityCheck(
                                        env.callMethod(date, "format", Validator.class, format),
                                        value)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateDateEquals(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object parameters = assignParameter(args, 2, false);
        this.requireParameterCount(env, 1, parameters, "date_equals");
        return ZVal.assign(this.compareDates(env, attribute, value, parameters, "="));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateDifferent(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object parameters = assignParameter(args, 2, false);
        Object other = null;
        Object parameter = null;
        this.requireParameterCount(env, 1, parameters, "different");
        for (ZPair zpairResult2374 : ZVal.getIterable(parameters, env, true)) {
            parameter = ZVal.assign(zpairResult2374.getValue());
            other = Arr.runtimeStaticObject.get(env, this.data, parameter);
            if (ZVal.toBool(function_is_null.f.env(env).call(other).value())
                    || ZVal.toBool(ZVal.strictEqualityCheck(value, "===", other))) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateDigits(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 2, false));
        this.requireParameterCount(env, 1, parameters.getObject(), "digits");
        return ZVal.assign(
                ZVal.toBool(!function_preg_match.f.env(env).call("/[^0-9]/", value).getBool())
                        && ZVal.toBool(
                                ZVal.equalityCheck(
                                        function_strlen
                                                .f
                                                .env(env)
                                                .call(toStringR(value, env))
                                                .value(),
                                        parameters.arrayGet(env, 0))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateDigitsBetween(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 2, false));
        Object length = null;
        this.requireParameterCount(env, 2, parameters.getObject(), "digits_between");
        length = function_strlen.f.env(env).call(toStringR(value, env)).value();
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(
                                                !function_preg_match
                                                        .f
                                                        .env(env)
                                                        .call("/[^0-9]/", value)
                                                        .getBool())
                                        && ZVal.toBool(
                                                ZVal.isGreaterThanOrEqualTo(
                                                        length, ">=", parameters.arrayGet(env, 0))))
                        && ZVal.toBool(
                                ZVal.isLessThanOrEqualTo(
                                        length, "<=", parameters.arrayGet(env, 1))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateDimensions(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object parameters = assignParameter(args, 2, false);
        Object sizeDetails = null;
        Object runtimeTempArrayResult237 = null;
        Object width = null;
        Object height = null;
        if (ZVal.toBool(this.isValidFileInstance(env, value))
                && ZVal.toBool(
                        ZVal.equalityCheck(
                                env.callMethod(value, "getClientMimeType", Validator.class),
                                "image/svg+xml"))) {
            return ZVal.assign(true);
        }

        if (ZVal.toBool(!ZVal.isTrue(this.isValidFileInstance(env, value)))
                || ZVal.toBool(
                        !ZVal.isTrue(
                                sizeDetails =
                                        NamespaceGlobal.getimagesize
                                                .env(env)
                                                .call(
                                                        env.callMethod(
                                                                value,
                                                                "getRealPath",
                                                                Validator.class))
                                                .value()))) {
            return ZVal.assign(false);
        }

        this.requireParameterCount(env, 1, parameters, "dimensions");
        ZVal.list(
                runtimeTempArrayResult237 = sizeDetails,
                (width = listGet(runtimeTempArrayResult237, 0, env)),
                (height = listGet(runtimeTempArrayResult237, 1, env)));
        parameters = this.parseNamedParameters(env, parameters);
        if (ZVal.toBool(this.failsBasicDimensionChecks(env, parameters, width, height))
                || ZVal.toBool(this.failsRatioCheck(env, parameters, width, height))) {
            return ZVal.assign(false);
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters")
    @ConvertedParameter(index = 1, name = "width")
    @ConvertedParameter(index = 2, name = "height")
    protected Object failsBasicDimensionChecks(RuntimeEnv env, Object... args) {
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        Object width = assignParameter(args, 1, false);
        Object height = assignParameter(args, 2, false);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                ZVal.toBool(
                                                                                ZVal.toBool(
                                                                                                ZVal
                                                                                                                .toBool(
                                                                                                                        arrayActionR(
                                                                                                                                ArrayAction
                                                                                                                                        .ISSET,
                                                                                                                                parameters,
                                                                                                                                env,
                                                                                                                                "width"))
                                                                                                        && ZVal
                                                                                                                .toBool(
                                                                                                                        ZVal
                                                                                                                                .notEqualityCheck(
                                                                                                                                        parameters
                                                                                                                                                .arrayGet(
                                                                                                                                                        env,
                                                                                                                                                        "width"),
                                                                                                                                        width)))
                                                                                        || ZVal
                                                                                                .toBool(
                                                                                                        ZVal
                                                                                                                        .toBool(
                                                                                                                                arrayActionR(
                                                                                                                                        ArrayAction
                                                                                                                                                .ISSET,
                                                                                                                                        parameters,
                                                                                                                                        env,
                                                                                                                                        "min_width"))
                                                                                                                && ZVal
                                                                                                                        .toBool(
                                                                                                                                ZVal
                                                                                                                                        .isGreaterThan(
                                                                                                                                                parameters
                                                                                                                                                        .arrayGet(
                                                                                                                                                                env,
                                                                                                                                                                "min_width"),
                                                                                                                                                '>',
                                                                                                                                                width))))
                                                                        || ZVal.toBool(
                                                                                ZVal.toBool(
                                                                                                arrayActionR(
                                                                                                        ArrayAction
                                                                                                                .ISSET,
                                                                                                        parameters,
                                                                                                        env,
                                                                                                        "max_width"))
                                                                                        && ZVal
                                                                                                .toBool(
                                                                                                        ZVal
                                                                                                                .isLessThan(
                                                                                                                        parameters
                                                                                                                                .arrayGet(
                                                                                                                                        env,
                                                                                                                                        "max_width"),
                                                                                                                        '<',
                                                                                                                        width))))
                                                        || ZVal.toBool(
                                                                ZVal.toBool(
                                                                                arrayActionR(
                                                                                        ArrayAction
                                                                                                .ISSET,
                                                                                        parameters,
                                                                                        env,
                                                                                        "height"))
                                                                        && ZVal.toBool(
                                                                                ZVal
                                                                                        .notEqualityCheck(
                                                                                                parameters
                                                                                                        .arrayGet(
                                                                                                                env,
                                                                                                                "height"),
                                                                                                height))))
                                        || ZVal.toBool(
                                                ZVal.toBool(
                                                                arrayActionR(
                                                                        ArrayAction.ISSET,
                                                                        parameters,
                                                                        env,
                                                                        "min_height"))
                                                        && ZVal.toBool(
                                                                ZVal.isGreaterThan(
                                                                        parameters.arrayGet(
                                                                                env, "min_height"),
                                                                        '>',
                                                                        height))))
                        || ZVal.toBool(
                                ZVal.toBool(
                                                arrayActionR(
                                                        ArrayAction.ISSET,
                                                        parameters,
                                                        env,
                                                        "max_height"))
                                        && ZVal.toBool(
                                                ZVal.isLessThan(
                                                        parameters.arrayGet(env, "max_height"),
                                                        '<',
                                                        height))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters")
    @ConvertedParameter(index = 1, name = "width")
    @ConvertedParameter(index = 2, name = "height")
    protected Object failsRatioCheck(RuntimeEnv env, Object... args) {
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        Object width = assignParameter(args, 1, false);
        Object height = assignParameter(args, 2, false);
        Object runtimeTempArrayResult238 = null;
        Object precision = null;
        Object numerator = null;
        Object denominator = null;
        if (!arrayActionR(ArrayAction.ISSET, parameters, env, "ratio")) {
            return ZVal.assign(false);
        }

        ZVal.list(
                runtimeTempArrayResult238 =
                        function_array_replace
                                .f
                                .env(env)
                                .call(
                                        ZVal.arrayFromList(1, 1),
                                        function_array_filter
                                                .f
                                                .env(env)
                                                .call(
                                                        function_sscanf
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        parameters.arrayGet(
                                                                                env, "ratio"),
                                                                        "%f/%d")
                                                                .value())
                                                .value())
                                .value(),
                (numerator = listGet(runtimeTempArrayResult238, 0, env)),
                (denominator = listGet(runtimeTempArrayResult238, 1, env)));
        precision = ZVal.divide(1, NamespaceGlobal.max.env(env).call(width, height).value());
        return ZVal.assign(
                ZVal.isGreaterThan(
                        NamespaceGlobal.abs
                                .env(env)
                                .call(
                                        ZVal.subtract(
                                                ZVal.divide(numerator, denominator),
                                                ZVal.divide(width, height)))
                                .value(),
                        '>',
                        precision));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateDistinct(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Validation/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Validation/Concerns/ValidatesAttributes.php");
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object parameters = assignParameter(args, 2, false);
        Object data = null;
        Object pattern = null;
        Object attributeName = null;
        Object attributeData = null;
        attributeName = this.getPrimaryAttribute(env, attribute);
        attributeData =
                ValidationData.runtimeStaticObject.extractDataFromPath(
                        env,
                        ValidationData.runtimeStaticObject.getLeadingExplicitAttributePath(
                                env, attributeName),
                        this.data);
        pattern =
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                "\\*",
                                "[^.]+",
                                NamespaceGlobal.preg_quote
                                        .env(env)
                                        .call(attributeName, "#")
                                        .value())
                        .value();
        data =
                Arr.runtimeStaticObject.where(
                        env,
                        Arr.runtimeStaticObject.dot(env, attributeData),
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Validation\\Concerns",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "value")
                            @ConvertedParameter(index = 1, name = "key")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object value = assignParameter(args, 0, false);
                                Object key = assignParameter(args, 1, false);
                                Object pattern = null;
                                Object attribute = null;
                                pattern = this.contextReferences.getCapturedValue("pattern");
                                attribute = this.contextReferences.getCapturedValue("attribute");
                                return ZVal.assign(
                                        ZVal.toBool(ZVal.notEqualityCheck(key, attribute))
                                                && ZVal.toBool(
                                                        ZVal.toBool(
                                                                function_preg_match
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                "#^"
                                                                                        + toStringR(
                                                                                                pattern,
                                                                                                env)
                                                                                        + "\\z#u",
                                                                                key)
                                                                        .value())));
                            }
                        }.use("pattern", pattern).use("attribute", attribute));
        if (function_in_array.f.env(env).call("ignore_case", parameters).getBool()) {
            return ZVal.isEmpty(
                    NamespaceGlobal.preg_grep
                            .env(env)
                            .call(
                                    "/^"
                                            + toStringR(
                                                    NamespaceGlobal.preg_quote
                                                            .env(env)
                                                            .call(value, "/")
                                                            .value(),
                                                    env)
                                            + "$/iu",
                                    data)
                            .value());
        }

        return ZVal.assign(
                !function_in_array
                        .f
                        .env(env)
                        .call(value, function_array_values.f.env(env).call(data).value())
                        .getBool());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    public Object validateEmail(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        function_filter_var.f.env(env).call(value, 274).value(), "!==", false));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateExists(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 2, false));
        Object runtimeTempArrayResult239 = null;
        Object expected = null;
        Object column = null;
        Object connection = null;
        Object table = null;
        this.requireParameterCount(env, 1, parameters.getObject(), "exists");
        ZVal.list(
                runtimeTempArrayResult239 = this.parseTable(env, parameters.arrayGet(env, 0)),
                (connection = listGet(runtimeTempArrayResult239, 0, env)),
                (table = listGet(runtimeTempArrayResult239, 1, env)));
        column = this.getQueryColumn(env, parameters.getObject(), attribute);
        expected =
                ZVal.assign(
                        function_is_array.f.env(env).call(value).getBool()
                                ? function_count.f.env(env).call(value).value()
                                : 1);
        return ZVal.assign(
                ZVal.isGreaterThanOrEqualTo(
                        this.getExistCount(
                                env, connection, table, column, value, parameters.getObject()),
                        ">=",
                        expected));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connection")
    @ConvertedParameter(index = 1, name = "table")
    @ConvertedParameter(index = 2, name = "column")
    @ConvertedParameter(index = 3, name = "value")
    @ConvertedParameter(index = 4, name = "parameters")
    protected Object getExistCount(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        Object table = assignParameter(args, 1, false);
        Object column = assignParameter(args, 2, false);
        Object value = assignParameter(args, 3, false);
        Object parameters = assignParameter(args, 4, false);
        Object verifier = null;
        Object extra = null;
        verifier = this.getPresenceVerifierFor(env, connection);
        extra =
                this.getExtraConditions(
                        env,
                        function_array_values
                                .f
                                .env(env)
                                .call(function_array_slice.f.env(env).call(parameters, 2).value())
                                .value());
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        this.currentRule, Exists.class, "Illuminate\\Validation\\Rules\\Exists"))) {
            extra =
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    extra,
                                    env.callMethod(
                                            this.currentRule, "queryCallbacks", Validator.class))
                            .value();
        }

        return ZVal.assign(
                function_is_array.f.env(env).call(value).getBool()
                        ? env.callMethod(
                                verifier,
                                "getMultiCount",
                                Validator.class,
                                table,
                                column,
                                value,
                                extra)
                        : env.callMethod(
                                verifier,
                                "getCount",
                                Validator.class,
                                table,
                                column,
                                value,
                                ZVal.getNull(),
                                ZVal.getNull(),
                                extra));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateUnique(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 2, false));
        Object column = null;
        Object verifier = null;
        Object extra = null;
        Object connection = null;
        Object id = null;
        Object runtimeTempArrayResult242 = null;
        Object table = null;
        Object runtimeTempArrayResult241 = null;
        Object runtimeTempArrayResult240 = null;
        Object idColumn = null;
        this.requireParameterCount(env, 1, parameters.getObject(), "unique");
        ZVal.list(
                runtimeTempArrayResult240 = this.parseTable(env, parameters.arrayGet(env, 0)),
                (connection = listGet(runtimeTempArrayResult240, 0, env)),
                (table = listGet(runtimeTempArrayResult240, 1, env)));
        column = this.getQueryColumn(env, parameters.getObject(), attribute);
        ZVal.list(
                runtimeTempArrayResult241 =
                        ZVal.newArray(new ZPair(0, ZVal.getNull()), new ZPair(1, ZVal.getNull())),
                (idColumn = listGet(runtimeTempArrayResult241, 0, env)),
                (id = listGet(runtimeTempArrayResult241, 1, env)));
        if (arrayActionR(ArrayAction.ISSET, parameters, env, 2)) {
            ZVal.list(
                    runtimeTempArrayResult242 = this.getUniqueIds(env, parameters.getObject()),
                    (idColumn = listGet(runtimeTempArrayResult242, 0, env)),
                    (id = listGet(runtimeTempArrayResult242, 1, env)));
        }

        verifier = this.getPresenceVerifierFor(env, connection);
        extra = this.getUniqueExtra(env, parameters.getObject());
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        this.currentRule, Unique.class, "Illuminate\\Validation\\Rules\\Unique"))) {
            extra =
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    extra,
                                    env.callMethod(
                                            this.currentRule, "queryCallbacks", Validator.class))
                            .value();
        }

        return ZVal.assign(
                ZVal.equalityCheck(
                        env.callMethod(
                                verifier,
                                "getCount",
                                Validator.class,
                                table,
                                column,
                                value,
                                id,
                                idColumn,
                                extra),
                        0));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters")
    protected Object getUniqueIds(RuntimeEnv env, Object... args) {
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        Object ternaryExpressionTemp = null;
        Object idColumn = null;
        idColumn =
                ZVal.assign(
                        ZVal.isDefined(ternaryExpressionTemp = parameters.arrayGet(env, 3))
                                ? ternaryExpressionTemp
                                : "id");
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(0, idColumn),
                        new ZPair(1, this.prepareUniqueId(env, parameters.arrayGet(env, 2)))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    protected Object prepareUniqueId(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        ReferenceContainer matches = new BasicReferenceContainer(null);
        if (function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call("/\\[(.*)\\]/", id, matches.getObject())
                .getBool()) {
            id = this.getValue(env, matches.arrayGet(env, 1));
        }

        if (ZVal.equalityCheck(NamespaceGlobal.strtolower.env(env).call(id).value(), "null")) {
            id = ZVal.getNull();
        }

        if (ZVal.strictNotEqualityCheck(
                function_filter_var.f.env(env).call(id, 257).value(), "!==", false)) {
            id = ZVal.assign(ZVal.toLong(id));
        }

        return ZVal.assign(id);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters")
    protected Object getUniqueExtra(RuntimeEnv env, Object... args) {
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        if (arrayActionR(ArrayAction.ISSET, parameters, env, 4)) {
            return ZVal.assign(
                    this.getExtraConditions(
                            env,
                            function_array_slice
                                    .f
                                    .env(env)
                                    .call(parameters.getObject(), 4)
                                    .value()));
        }

        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    protected Object parseTable(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isTrue(Str.runtimeStaticObject.contains(env, table, "."))
                        ? function_explode.f.env(env).call(".", table, 2).value()
                        : ZVal.newArray(new ZPair(0, ZVal.getNull()), new ZPair(1, table)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters")
    @ConvertedParameter(index = 1, name = "attribute")
    protected Object getQueryColumn(RuntimeEnv env, Object... args) {
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        Object attribute = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.toBool(arrayActionR(ArrayAction.ISSET, parameters, env, 1))
                                && ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                parameters.arrayGet(env, 1), "!==", "NULL"))
                        ? parameters.arrayGet(env, 1)
                        : this.guessColumnForQuery(env, attribute));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    public Object guessColumnForQuery(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object last = null;
        if (ZVal.toBool(
                        function_in_array
                                .f
                                .env(env)
                                .call(
                                        attribute,
                                        Arr.runtimeStaticObject.collapse(
                                                env, this.implicitAttributes))
                                .value())
                && ZVal.toBool(
                        !function_is_numeric
                                .f
                                .env(env)
                                .call(
                                        last =
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .functions
                                                        .last
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                function_explode
                                                                        .f
                                                                        .env(env)
                                                                        .call(".", attribute)
                                                                        .value())
                                                        .value())
                                .getBool())) {
            return ZVal.assign(last);
        }

        return ZVal.assign(attribute);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "segments", typeHint = "array")
    protected Object getExtraConditions(RuntimeEnv env, Object... args) {
        ReferenceContainer segments = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer extra = new BasicReferenceContainer(null);
        Object count = null;
        Object i = null;
        extra.setObject(ZVal.newArray());
        count = function_count.f.env(env).call(segments.getObject()).value();
        for (i = 0; ZVal.isLessThan(i, '<', count); i = ZAssignment.add("+=", i, 2)) {
            extra.arrayAccess(env, segments.arrayGet(env, i))
                    .set(segments.arrayGet(env, ZVal.add(i, 1)));
        }

        return ZVal.assign(extra.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    public Object validateFile(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(this.isValidFileInstance(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    public Object validateFilled(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        if (ZVal.isTrue(Arr.runtimeStaticObject.has(env, this.data, attribute))) {
            return ZVal.assign(this.validateRequired(env, attribute, value));
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateGt(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 2, false));
        Object comparedToValue = null;
        this.requireParameterCount(env, 1, parameters.getObject(), "gt");
        comparedToValue = this.getValue(env, parameters.arrayGet(env, 0));
        this.shouldBeNumeric(env, attribute, "Gt");
        if (ZVal.toBool(function_is_null.f.env(env).call(comparedToValue).value())
                && ZVal.toBool(
                        ZVal.toBool(function_is_numeric.f.env(env).call(value).value())
                                && ZVal.toBool(
                                        function_is_numeric
                                                .f
                                                .env(env)
                                                .call(parameters.arrayGet(env, 0))
                                                .value()))) {
            return ZVal.assign(
                    ZVal.isGreaterThan(
                            this.getSize(env, attribute, value), '>', parameters.arrayGet(env, 0)));
        }

        this.requireSameType(env, value, comparedToValue);
        return ZVal.assign(
                ZVal.isGreaterThan(
                        this.getSize(env, attribute, value),
                        '>',
                        this.getSize(env, attribute, comparedToValue)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateLt(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 2, false));
        Object comparedToValue = null;
        this.requireParameterCount(env, 1, parameters.getObject(), "lt");
        comparedToValue = this.getValue(env, parameters.arrayGet(env, 0));
        this.shouldBeNumeric(env, attribute, "Lt");
        if (ZVal.toBool(function_is_null.f.env(env).call(comparedToValue).value())
                && ZVal.toBool(
                        ZVal.toBool(function_is_numeric.f.env(env).call(value).value())
                                && ZVal.toBool(
                                        function_is_numeric
                                                .f
                                                .env(env)
                                                .call(parameters.arrayGet(env, 0))
                                                .value()))) {
            return ZVal.assign(
                    ZVal.isLessThan(
                            this.getSize(env, attribute, value), '<', parameters.arrayGet(env, 0)));
        }

        this.requireSameType(env, value, comparedToValue);
        return ZVal.assign(
                ZVal.isLessThan(
                        this.getSize(env, attribute, value),
                        '<',
                        this.getSize(env, attribute, comparedToValue)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateGte(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 2, false));
        Object comparedToValue = null;
        this.requireParameterCount(env, 1, parameters.getObject(), "gte");
        comparedToValue = this.getValue(env, parameters.arrayGet(env, 0));
        this.shouldBeNumeric(env, attribute, "Gte");
        if (ZVal.toBool(function_is_null.f.env(env).call(comparedToValue).value())
                && ZVal.toBool(
                        ZVal.toBool(function_is_numeric.f.env(env).call(value).value())
                                && ZVal.toBool(
                                        function_is_numeric
                                                .f
                                                .env(env)
                                                .call(parameters.arrayGet(env, 0))
                                                .value()))) {
            return ZVal.assign(
                    ZVal.isGreaterThanOrEqualTo(
                            this.getSize(env, attribute, value),
                            ">=",
                            parameters.arrayGet(env, 0)));
        }

        this.requireSameType(env, value, comparedToValue);
        return ZVal.assign(
                ZVal.isGreaterThanOrEqualTo(
                        this.getSize(env, attribute, value),
                        ">=",
                        this.getSize(env, attribute, comparedToValue)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateLte(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 2, false));
        Object comparedToValue = null;
        this.requireParameterCount(env, 1, parameters.getObject(), "lte");
        comparedToValue = this.getValue(env, parameters.arrayGet(env, 0));
        this.shouldBeNumeric(env, attribute, "Lte");
        if (ZVal.toBool(function_is_null.f.env(env).call(comparedToValue).value())
                && ZVal.toBool(
                        ZVal.toBool(function_is_numeric.f.env(env).call(value).value())
                                && ZVal.toBool(
                                        function_is_numeric
                                                .f
                                                .env(env)
                                                .call(parameters.arrayGet(env, 0))
                                                .value()))) {
            return ZVal.assign(
                    ZVal.isLessThanOrEqualTo(
                            this.getSize(env, attribute, value),
                            "<=",
                            parameters.arrayGet(env, 0)));
        }

        this.requireSameType(env, value, comparedToValue);
        return ZVal.assign(
                ZVal.isLessThanOrEqualTo(
                        this.getSize(env, attribute, value),
                        "<=",
                        this.getSize(env, attribute, comparedToValue)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    public Object validateImage(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(
                this.validateMimes(
                        env,
                        attribute,
                        value,
                        ZVal.arrayFromList("jpeg", "png", "gif", "bmp", "svg")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateIn(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object parameters = assignParameter(args, 2, false);
        Object element = null;
        if (ZVal.toBool(function_is_array.f.env(env).call(value).value())
                && ZVal.toBool(this.hasRule(env, attribute, "Array"))) {
            for (ZPair zpairResult2375 : ZVal.getIterable(value, env, true)) {
                element = ZVal.assign(zpairResult2375.getValue());
                if (function_is_array.f.env(env).call(element).getBool()) {
                    return ZVal.assign(false);
                }
            }

            return ZVal.assign(
                    ZVal.equalityCheck(
                            function_count
                                    .f
                                    .env(env)
                                    .call(
                                            function_array_diff
                                                    .f
                                                    .env(env)
                                                    .call(value, parameters)
                                                    .value())
                                    .value(),
                            0));
        }

        return ZVal.assign(
                ZVal.toBool(!function_is_array.f.env(env).call(value).getBool())
                        && ZVal.toBool(
                                function_in_array
                                        .f
                                        .env(env)
                                        .call(toStringR(value, env), parameters)
                                        .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateInArray(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Validation/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Validation/Concerns/ValidatesAttributes.php");
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 2, false));
        Object otherValues = null;
        Object explicitPath = null;
        Object attributeData = null;
        this.requireParameterCount(env, 1, parameters.getObject(), "in_array");
        explicitPath =
                ValidationData.runtimeStaticObject.getLeadingExplicitAttributePath(
                        env, parameters.arrayGet(env, 0));
        attributeData =
                ValidationData.runtimeStaticObject.extractDataFromPath(
                        env, explicitPath, this.data);
        otherValues =
                Arr.runtimeStaticObject.where(
                        env,
                        Arr.runtimeStaticObject.dot(env, attributeData),
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Validation\\Concerns",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "value")
                            @ConvertedParameter(index = 1, name = "key")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object value = assignParameter(args, 0, false);
                                Object key = assignParameter(args, 1, false);
                                ReferenceContainer parameters = new BasicReferenceContainer(null);
                                parameters =
                                        this.contextReferences.getReferenceContainer("parameters");
                                return ZVal.assign(
                                        Str.runtimeStaticObject.is(
                                                env, parameters.arrayGet(env, 0), key));
                            }
                        }.use("parameters", parameters));
        return ZVal.assign(function_in_array.f.env(env).call(value, otherValues).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    public Object validateInteger(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        function_filter_var.f.env(env).call(value, 257).value(), "!==", false));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    public Object validateIp(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        function_filter_var.f.env(env).call(value, 275).value(), "!==", false));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    public Object validateIpv4(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        function_filter_var.f.env(env).call(value, 275, 1048576).value(),
                        "!==",
                        false));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    public Object validateIpv6(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        function_filter_var.f.env(env).call(value, 275, 2097152).value(),
                        "!==",
                        false));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    public Object validateJson(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        if (ZVal.toBool(!function_is_scalar.f.env(env).call(value).getBool())
                && ZVal.toBool(
                        !function_method_exists.f.env(env).call(value, "__toString").getBool())) {
            return ZVal.assign(false);
        }

        NamespaceGlobal.json_decode.env(env).call(value);
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        NamespaceGlobal.json_last_error.env(env).call().value(), "===", 0));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateMax(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 2, false));
        this.requireParameterCount(env, 1, parameters.getObject(), "max");
        if (ZVal.toBool(
                        ZVal.checkInstanceType(
                                value,
                                UploadedFile.class,
                                "Symfony\\Component\\HttpFoundation\\File\\UploadedFile"))
                && ZVal.toBool(!ZVal.isTrue(env.callMethod(value, "isValid", Validator.class)))) {
            return ZVal.assign(false);
        }

        return ZVal.assign(
                ZVal.isLessThanOrEqualTo(
                        this.getSize(env, attribute, value), "<=", parameters.arrayGet(env, 0)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateMimes(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object parameters = assignParameter(args, 2, false);
        if (!ZVal.isTrue(this.isValidFileInstance(env, value))) {
            return ZVal.assign(false);
        }

        if (ZVal.isTrue(this.shouldBlockPhpUpload(env, value, parameters))) {
            return ZVal.assign(false);
        }

        return ZVal.assign(
                ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        env.callMethod(value, "getPath", Validator.class),
                                        "!==",
                                        ""))
                        && ZVal.toBool(
                                function_in_array
                                        .f
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        value, "guessExtension", Validator.class),
                                                parameters)
                                        .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateMimetypes(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object parameters = assignParameter(args, 2, false);
        if (!ZVal.isTrue(this.isValidFileInstance(env, value))) {
            return ZVal.assign(false);
        }

        if (ZVal.isTrue(this.shouldBlockPhpUpload(env, value, parameters))) {
            return ZVal.assign(false);
        }

        return ZVal.assign(
                ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        env.callMethod(value, "getPath", Validator.class),
                                        "!==",
                                        ""))
                        && ZVal.toBool(
                                ZVal.toBool(
                                                function_in_array
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                env.callMethod(
                                                                        value,
                                                                        "getMimeType",
                                                                        Validator.class),
                                                                parameters)
                                                        .value())
                                        || ZVal.toBool(
                                                function_in_array
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                toStringR(
                                                                                handleReturnReference(
                                                                                                function_explode
                                                                                                        .f
                                                                                                        .env(
                                                                                                                env)
                                                                                                        .call(
                                                                                                                "/",
                                                                                                                env
                                                                                                                        .callMethod(
                                                                                                                                value,
                                                                                                                                "getMimeType",
                                                                                                                                Validator
                                                                                                                                        .class))
                                                                                                        .value())
                                                                                        .arrayGet(
                                                                                                env,
                                                                                                0),
                                                                                env)
                                                                        + "/*",
                                                                parameters)
                                                        .value())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(index = 1, name = "parameters")
    protected Object shouldBlockPhpUpload(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        Object phpExtensions = null;
        if (function_in_array.f.env(env).call("php", parameters).getBool()) {
            return ZVal.assign(false);
        }

        phpExtensions = ZVal.arrayFromList("php", "php3", "php4", "php5", "phtml");
        return ZVal.assign(
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        value,
                                        UploadedFile.class,
                                        "Symfony\\Component\\HttpFoundation\\File\\UploadedFile"))
                        ? function_in_array
                                .f
                                .env(env)
                                .call(
                                        function_trim
                                                .f
                                                .env(env)
                                                .call(
                                                        NamespaceGlobal.strtolower
                                                                .env(env)
                                                                .call(
                                                                        env.callMethod(
                                                                                value,
                                                                                "getClientOriginalExtension",
                                                                                Validator.class))
                                                                .value())
                                                .value(),
                                        phpExtensions)
                                .value()
                        : function_in_array
                                .f
                                .env(env)
                                .call(
                                        function_trim
                                                .f
                                                .env(env)
                                                .call(
                                                        NamespaceGlobal.strtolower
                                                                .env(env)
                                                                .call(
                                                                        env.callMethod(
                                                                                value,
                                                                                "getExtension",
                                                                                Validator.class))
                                                                .value())
                                                .value(),
                                        phpExtensions)
                                .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateMin(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 2, false));
        this.requireParameterCount(env, 1, parameters.getObject(), "min");
        return ZVal.assign(
                ZVal.isGreaterThanOrEqualTo(
                        this.getSize(env, attribute, value), ">=", parameters.arrayGet(env, 0)));
    }

    @ConvertedMethod
    public Object validateNullable(RuntimeEnv env, Object... args) {
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateNotIn(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object parameters = assignParameter(args, 2, false);
        return ZVal.assign(!ZVal.isTrue(this.validateIn(env, attribute, value, parameters)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    public Object validateNumeric(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(function_is_numeric.f.env(env).call(value).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    public Object validatePresent(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(Arr.runtimeStaticObject.has(env, this.data, attribute));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateRegex(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 2, false));
        if (ZVal.toBool(!function_is_string.f.env(env).call(value).getBool())
                && ZVal.toBool(!function_is_numeric.f.env(env).call(value).getBool())) {
            return ZVal.assign(false);
        }

        this.requireParameterCount(env, 1, parameters.getObject(), "regex");
        return ZVal.assign(
                ZVal.isGreaterThan(
                        function_preg_match
                                .f
                                .env(env)
                                .call(parameters.arrayGet(env, 0), value)
                                .value(),
                        '>',
                        0));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateNotRegex(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 2, false));
        if (ZVal.toBool(!function_is_string.f.env(env).call(value).getBool())
                && ZVal.toBool(!function_is_numeric.f.env(env).call(value).getBool())) {
            return ZVal.assign(false);
        }

        this.requireParameterCount(env, 1, parameters.getObject(), "not_regex");
        return ZVal.assign(
                ZVal.isLessThan(
                        function_preg_match
                                .f
                                .env(env)
                                .call(parameters.arrayGet(env, 0), value)
                                .value(),
                        '<',
                        1));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    public Object validateRequired(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        if (function_is_null.f.env(env).call(value).getBool()) {
            return ZVal.assign(false);

        } else if (ZVal.toBool(function_is_string.f.env(env).call(value).value())
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                function_trim.f.env(env).call(value).value(), "===", ""))) {
            return ZVal.assign(false);

        } else if (ZVal.toBool(
                        ZVal.toBool(function_is_array.f.env(env).call(value).value())
                                || ZVal.toBool(
                                        ZVal.checkInstanceType(
                                                value, Countable.class, "Countable")))
                && ZVal.toBool(
                        ZVal.isLessThan(function_count.f.env(env).call(value).value(), '<', 1))) {
            return ZVal.assign(false);

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        value, File.class, "Symfony\\Component\\HttpFoundation\\File\\File"))) {
            return ZVal.assign(
                    ZVal.strictNotEqualityCheck(
                            toStringR(env.callMethod(value, "getPath", Validator.class), env),
                            "!==",
                            ""));
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateRequiredIf(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 2, false));
        Object other = null;
        Object values = null;
        this.requireParameterCount(env, 2, parameters.getObject(), "required_if");
        other = Arr.runtimeStaticObject.get(env, this.data, parameters.arrayGet(env, 0));
        values = function_array_slice.f.env(env).call(parameters.getObject(), 1).value();
        if (function_is_bool.f.env(env).call(other).getBool()) {
            values = this.convertValuesToBoolean(env, values);
        }

        if (function_in_array.f.env(env).call(other, values).getBool()) {
            return ZVal.assign(this.validateRequired(env, attribute, value));
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values")
    protected Object convertValuesToBoolean(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Validation/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Validation/Concerns/ValidatesAttributes.php");
        Object values = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Validation\\Concerns",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "value")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object value = assignParameter(args, 0, false);
                                        if (ZVal.strictEqualityCheck(value, "===", "true")) {
                                            return ZVal.assign(true);

                                        } else if (ZVal.strictEqualityCheck(
                                                value, "===", "false")) {
                                            return ZVal.assign(false);
                                        }

                                        return ZVal.assign(value);
                                    }
                                },
                                values)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateRequiredUnless(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 2, false));
        Object data = null;
        Object values = null;
        this.requireParameterCount(env, 2, parameters.getObject(), "required_unless");
        data = Arr.runtimeStaticObject.get(env, this.data, parameters.arrayGet(env, 0));
        values = function_array_slice.f.env(env).call(parameters.getObject(), 1).value();
        if (!function_in_array.f.env(env).call(data, values).getBool()) {
            return ZVal.assign(this.validateRequired(env, attribute, value));
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateRequiredWith(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object parameters = assignParameter(args, 2, false);
        if (!ZVal.isTrue(this.allFailingRequired(env, parameters))) {
            return ZVal.assign(this.validateRequired(env, attribute, value));
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateRequiredWithAll(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object parameters = assignParameter(args, 2, false);
        if (!ZVal.isTrue(this.anyFailingRequired(env, parameters))) {
            return ZVal.assign(this.validateRequired(env, attribute, value));
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateRequiredWithout(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object parameters = assignParameter(args, 2, false);
        if (ZVal.isTrue(this.anyFailingRequired(env, parameters))) {
            return ZVal.assign(this.validateRequired(env, attribute, value));
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateRequiredWithoutAll(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object parameters = assignParameter(args, 2, false);
        if (ZVal.isTrue(this.allFailingRequired(env, parameters))) {
            return ZVal.assign(this.validateRequired(env, attribute, value));
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes", typeHint = "array")
    protected Object anyFailingRequired(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, false);
        Object key = null;
        for (ZPair zpairResult2376 : ZVal.getIterable(attributes, env, true)) {
            key = ZVal.assign(zpairResult2376.getValue());
            if (!ZVal.isTrue(this.validateRequired(env, key, this.getValue(env, key)))) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes", typeHint = "array")
    protected Object allFailingRequired(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, false);
        Object key = null;
        for (ZPair zpairResult2377 : ZVal.getIterable(attributes, env, true)) {
            key = ZVal.assign(zpairResult2377.getValue());
            if (ZVal.isTrue(this.validateRequired(env, key, this.getValue(env, key)))) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateSame(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 2, false));
        Object other = null;
        this.requireParameterCount(env, 1, parameters.getObject(), "same");
        other = Arr.runtimeStaticObject.get(env, this.data, parameters.arrayGet(env, 0));
        return ZVal.assign(ZVal.strictEqualityCheck(value, "===", other));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "parameters")
    public Object validateSize(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 2, false));
        this.requireParameterCount(env, 1, parameters.getObject(), "size");
        return ZVal.assign(
                ZVal.equalityCheck(
                        this.getSize(env, attribute, value), parameters.arrayGet(env, 0)));
    }

    @ConvertedMethod
    public Object validateSometimes(RuntimeEnv env, Object... args) {
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    public Object validateString(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(function_is_string.f.env(env).call(value).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    public Object validateTimezone(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object e = null;
        try {
            new DateTimeZone(env, value);
        } catch (ConvertedException convertedException67) {
            if (convertedException67.instanceOf(PHPException.class, "Exception")) {
                e = convertedException67.getObject();
                return ZVal.assign(false);
            } else if (convertedException67.instanceOf(Throwable.class, "Throwable")) {
                e = convertedException67.getObject();
                return ZVal.assign(false);
            } else {
                throw convertedException67;
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    public Object validateUrl(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object pattern = null;
        if (!function_is_string.f.env(env).call(value).getBool()) {
            return ZVal.assign(false);
        }

        pattern = ZVal.getResourceAsString("stringLiterals/stringLiteral3600.txt");
        return ZVal.assign(
                ZVal.isGreaterThan(
                        function_preg_match.f.env(env).call(pattern, value).value(), '>', 0));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    protected Object getSize(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object hasNumeric = null;
        hasNumeric = this.hasRule(env, attribute, this.numericRules);
        if (ZVal.toBool(function_is_numeric.f.env(env).call(value).value())
                && ZVal.toBool(hasNumeric)) {
            return ZVal.assign(value);

        } else if (function_is_array.f.env(env).call(value).getBool()) {
            return ZVal.assign(function_count.f.env(env).call(value).value());

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        value, File.class, "Symfony\\Component\\HttpFoundation\\File\\File"))) {
            return ZVal.assign(
                    ZVal.divide(env.callMethod(value, "getSize", Validator.class), 1024));
        }

        return ZVal.assign(NamespaceGlobal.mb_strlen.env(env).call(value).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object isValidFileInstance(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        if (ZVal.toBool(
                        ZVal.checkInstanceType(
                                value,
                                UploadedFile.class,
                                "Symfony\\Component\\HttpFoundation\\File\\UploadedFile"))
                && ZVal.toBool(!ZVal.isTrue(env.callMethod(value, "isValid", Validator.class)))) {
            return ZVal.assign(false);
        }

        return ZVal.assign(
                ZVal.checkInstanceType(
                        value, File.class, "Symfony\\Component\\HttpFoundation\\File\\File"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "first")
    @ConvertedParameter(index = 1, name = "second")
    @ConvertedParameter(index = 2, name = "operator")
    protected Object compare(RuntimeEnv env, Object... args) {
        Object first = assignParameter(args, 0, false);
        Object second = assignParameter(args, 1, false);
        Object operator = assignParameter(args, 2, false);
        SwitchEnumType32 switchVariable32 =
                ZVal.getEnum(
                        operator,
                        SwitchEnumType32.DEFAULT_CASE,
                        SwitchEnumType32.RESERVED_CHARS_1115609411_STRING__,
                        "<",
                        SwitchEnumType32.RESERVED_CHARS_1788072159_STRING__,
                        ">",
                        SwitchEnumType32.RESERVED_CHARS_323734037_STRING___,
                        "<=",
                        SwitchEnumType32.RESERVED_CHARS_432618066_STRING___,
                        ">=",
                        SwitchEnumType32.RESERVED_CHARS_604335150_STRING__,
                        "=");
        switch (switchVariable32) {
            case RESERVED_CHARS_1115609411_STRING__:
                return ZVal.assign(ZVal.isLessThan(first, '<', second));
            case RESERVED_CHARS_1788072159_STRING__:
                return ZVal.assign(ZVal.isGreaterThan(first, '>', second));
            case RESERVED_CHARS_323734037_STRING___:
                return ZVal.assign(ZVal.isLessThanOrEqualTo(first, "<=", second));
            case RESERVED_CHARS_432618066_STRING___:
                return ZVal.assign(ZVal.isGreaterThanOrEqualTo(first, ">=", second));
            case RESERVED_CHARS_604335150_STRING__:
                return ZVal.assign(ZVal.equalityCheck(first, second));
            case DEFAULT_CASE:
                throw ZVal.getException(env, new InvalidArgumentException(env));
        }
        ;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters")
    protected Object parseNamedParameters(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Validation/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Validation/Concerns/ValidatesAttributes.php");
        Object parameters = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_reduce
                        .f
                        .env(env)
                        .call(
                                parameters,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Validation\\Concerns",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "result")
                                    @ConvertedParameter(index = 1, name = "item")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        ReferenceContainer result =
                                                new BasicReferenceContainer(
                                                        assignParameter(args, 0, false));
                                        Object item = assignParameter(args, 1, false);
                                        Object runtimeTempArrayResult243 = null;
                                        Object value = null;
                                        Object key = null;
                                        ZVal.list(
                                                runtimeTempArrayResult243 =
                                                        function_array_pad
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        function_explode
                                                                                .f
                                                                                .env(env)
                                                                                .call("=", item, 2)
                                                                                .value(),
                                                                        2,
                                                                        ZVal.getNull())
                                                                .value(),
                                                (key = listGet(runtimeTempArrayResult243, 0, env)),
                                                (value =
                                                        listGet(
                                                                runtimeTempArrayResult243,
                                                                1,
                                                                env)));
                                        result.arrayAccess(env, key).set(value);
                                        return ZVal.assign(result.getObject());
                                    }
                                })
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "count")
    @ConvertedParameter(index = 1, name = "parameters")
    @ConvertedParameter(index = 2, name = "rule")
    protected Object requireParameterCount(RuntimeEnv env, Object... args) {
        Object count = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        Object rule = assignParameter(args, 2, false);
        if (ZVal.isLessThan(function_count.f.env(env).call(parameters).value(), '<', count)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Validation rule "
                                    + toStringR(rule, env)
                                    + " requires at least "
                                    + toStringR(count, env)
                                    + " parameters."));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "first")
    @ConvertedParameter(index = 1, name = "second")
    protected Object requireSameType(RuntimeEnv env, Object... args) {
        Object first = assignParameter(args, 0, false);
        Object second = assignParameter(args, 1, false);
        if (ZVal.notEqualityCheck(
                NamespaceGlobal.gettype.env(env).call(first).value(),
                NamespaceGlobal.gettype.env(env).call(second).value())) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "The values under comparison must be of the same type"));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "rule")
    protected Object shouldBeNumeric(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        Object rule = assignParameter(args, 1, false);
        if (function_is_numeric.f.env(env).call(this.getValue(env, attribute)).getBool()) {
            new ReferenceClassProperty(this, "numericRules", env).arrayAppend(env).set(rule);
        }

        return null;
    }

    public static final Object CONST_class = "Illuminate\\Validation\\Validator";

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
                    .setName("Illuminate\\Validation\\Validator")
                    .setLookup(
                            Validator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "after",
                            "container",
                            "currentRule",
                            "customAttributes",
                            "customMessages",
                            "customValues",
                            "data",
                            "dependentRules",
                            "extensions",
                            "failedRules",
                            "fallbackMessages",
                            "fileRules",
                            "implicitAttributes",
                            "implicitRules",
                            "initialRules",
                            "messages",
                            "numericRules",
                            "presenceVerifier",
                            "replacers",
                            "rules",
                            "sizeRules",
                            "translator")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Validation/Validator.php")
                    .addInterface("Illuminate\\Contracts\\Validation\\Validator")
                    .addInterface("Illuminate\\Contracts\\Support\\MessageProvider")
                    .addTrait("Illuminate\\Validation\\Concerns\\FormatsMessages")
                    .addTrait("Illuminate\\Validation\\Concerns\\ValidatesAttributes")
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

    private enum SwitchEnumType32 {
        RESERVED_CHARS_1115609411_STRING__,
        RESERVED_CHARS_1788072159_STRING__,
        RESERVED_CHARS_323734037_STRING___,
        RESERVED_CHARS_432618066_STRING___,
        RESERVED_CHARS_604335150_STRING__,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
