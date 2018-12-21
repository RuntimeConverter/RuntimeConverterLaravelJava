package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Translation.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.NamespacedItemResolver;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Translation.classes.MessageSelector;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Collection;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Translation/Translator.php

*/

public class Translator extends NamespacedItemResolver
        implements com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Contracts
                .namespaces
                .Translation
                .classes
                .Translator {

    public Object loader = null;

    public Object locale = null;

    public Object fallback = null;

    public Object loaded = ZVal.newArray();

    public Object selector = null;

    public Translator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Translator.class) {
            this.__construct(env, args);
        }
    }

    public Translator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "loader",
        typeHint = "Illuminate\\Contracts\\Translation\\Loader"
    )
    @ConvertedParameter(index = 1, name = "locale")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object loader = assignParameter(args, 0, false);
        Object locale = assignParameter(args, 1, false);
        this.loader = loader;
        this.locale = locale;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "locale",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object hasForLocale(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object locale = assignParameter(args, 1, true);
        if (null == locale) {
            locale = ZVal.getNull();
        }
        return ZVal.assign(this.has(env, key, locale, false));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "locale",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "fallback",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object has(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object locale = assignParameter(args, 1, true);
        if (null == locale) {
            locale = ZVal.getNull();
        }
        Object fallback = assignParameter(args, 2, true);
        if (null == fallback) {
            fallback = true;
        }
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        this.get(env, key, ZVal.newArray(), locale, fallback), "!==", key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "replace",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "locale",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object trans(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object replace = assignParameter(args, 1, true);
        if (null == replace) {
            replace = ZVal.newArray();
        }
        Object locale = assignParameter(args, 2, true);
        if (null == locale) {
            locale = ZVal.getNull();
        }
        return ZVal.assign(this.get(env, key, replace, locale));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "replace",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "locale",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "fallback",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object get(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object key = assignParameter(args, 0, false);
        Object replace = assignParameter(args, 1, true);
        if (null == replace) {
            replace = ZVal.newArray();
        }
        Object locale = assignParameter(args, 2, true);
        if (null == locale) {
            locale = ZVal.getNull();
        }
        Object fallback = assignParameter(args, 3, true);
        if (null == fallback) {
            fallback = true;
        }
        Object item = null;
        Object runtimeTempArrayResult85 = null;
        Object locales = null;
        Object line = null;
        Object namespace = null;
        Object ternaryExpressionTemp = null;
        Object group = null;
        ZVal.list(
                runtimeTempArrayResult85 = this.parseKey(env, key),
                (namespace = listGet(runtimeTempArrayResult85, 0, env)),
                (group = listGet(runtimeTempArrayResult85, 1, env)),
                (item = listGet(runtimeTempArrayResult85, 2, env)));
        locales =
                ZVal.assign(
                        ZVal.isTrue(fallback)
                                ? this.localeArray(env, locale)
                                : ZVal.newArray(
                                        new ZPair(
                                                0,
                                                ZVal.isTrue(ternaryExpressionTemp = locale)
                                                        ? ternaryExpressionTemp
                                                        : this.locale)));
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult604 : ZVal.getIterable(locales, env, true)) {
            locale = ZVal.assign(zpairResult604.getValue());
            if (!function_is_null
                    .f
                    .env(env)
                    .call(line = this.getLine(env, namespace, group, locale, item, replace))
                    .getBool()) {
                break;
            }
        }

        if (ZVal.isset(line)) {
            return ZVal.assign(line);
        }

        return ZVal.assign(key);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "replace",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "locale",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getFromJson(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object replace = assignParameter(args, 1, true);
        if (null == replace) {
            replace = ZVal.newArray();
        }
        Object locale = assignParameter(args, 2, true);
        if (null == locale) {
            locale = ZVal.getNull();
        }
        Object line = null;
        Object ternaryExpressionTemp = null;
        Object fallback = null;
        locale =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = locale)
                                ? ternaryExpressionTemp
                                : this.locale);
        this.load(env, "*", "*", locale);
        line =
                ZVal.assign(
                        ZVal.isDefined(
                                        ternaryExpressionTemp =
                                                new ReferenceClassProperty(this, "loaded", env)
                                                        .arrayGet(env, "*", "*", locale, key))
                                ? ternaryExpressionTemp
                                : ZVal.getNull());
        if (!ZVal.isset(line)) {
            fallback = this.get(env, key, replace, locale);
            if (ZVal.strictNotEqualityCheck(fallback, "!==", key)) {
                return ZVal.assign(fallback);
            }
        }

        return ZVal.assign(
                this.makeReplacements(
                        env,
                        ZVal.isTrue(ternaryExpressionTemp = line) ? ternaryExpressionTemp : key,
                        replace));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "number")
    @ConvertedParameter(
        index = 2,
        name = "replace",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 3,
        name = "locale",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object transChoice(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object number = assignParameter(args, 1, false);
        Object replace = assignParameter(args, 2, true);
        if (null == replace) {
            replace = ZVal.newArray();
        }
        Object locale = assignParameter(args, 3, true);
        if (null == locale) {
            locale = ZVal.getNull();
        }
        return ZVal.assign(this.choice(env, key, number, replace, locale));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "number")
    @ConvertedParameter(
        index = 2,
        name = "replace",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 3,
        name = "locale",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object choice(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object number = assignParameter(args, 1, false);
        ReferenceContainer replace = new BasicReferenceContainer(assignParameter(args, 2, true));
        if (null == replace.getObject()) {
            replace.setObject(ZVal.newArray());
        }
        Object locale = assignParameter(args, 3, true);
        if (null == locale) {
            locale = ZVal.getNull();
        }
        Object line = null;
        line = this.get(env, key, replace.getObject(), locale = this.localeForChoice(env, locale));
        if (ZVal.toBool(function_is_array.f.env(env).call(number).value())
                || ZVal.toBool(ZVal.checkInstanceType(number, Countable.class, "Countable"))) {
            number = function_count.f.env(env).call(number).value();
        }

        replace.arrayAccess(env, "count").set(number);
        return ZVal.assign(
                this.makeReplacements(
                        env,
                        env.callMethod(
                                this.getSelector(env),
                                "choose",
                                Translator.class,
                                line,
                                number,
                                locale),
                        replace.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    protected Object localeForChoice(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isTrue(
                                ternaryExpressionTemp =
                                        ZVal.isTrue(ternaryExpressionTemp = locale)
                                                ? ternaryExpressionTemp
                                                : this.locale)
                        ? ternaryExpressionTemp
                        : this.fallback);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "namespace")
    @ConvertedParameter(index = 1, name = "group")
    @ConvertedParameter(index = 2, name = "locale")
    @ConvertedParameter(index = 3, name = "item")
    @ConvertedParameter(index = 4, name = "replace", typeHint = "array")
    protected Object getLine(RuntimeEnv env, Object... args) {
        Object namespace = assignParameter(args, 0, false);
        Object group = assignParameter(args, 1, false);
        Object locale = assignParameter(args, 2, false);
        Object item = assignParameter(args, 3, false);
        Object replace = assignParameter(args, 4, false);
        Object line = null;
        this.load(env, namespace, group, locale);
        line =
                Arr.runtimeStaticObject.get(
                        env,
                        new ReferenceClassProperty(this, "loaded", env)
                                .arrayGet(env, namespace, group, locale),
                        item);
        if (function_is_string.f.env(env).call(line).getBool()) {
            return ZVal.assign(this.makeReplacements(env, line, replace));

        } else if (ZVal.toBool(function_is_array.f.env(env).call(line).value())
                && ZVal.toBool(
                        ZVal.isGreaterThan(function_count.f.env(env).call(line).value(), '>', 0))) {
            return ZVal.assign(line);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "line")
    @ConvertedParameter(index = 1, name = "replace", typeHint = "array")
    protected Object makeReplacements(RuntimeEnv env, Object... args) {
        Object line = assignParameter(args, 0, false);
        Object replace = assignParameter(args, 1, false);
        Object value = null;
        Object key = null;
        if (ZVal.isEmpty(replace)) {
            return ZVal.assign(line);
        }

        replace = this.sortReplacements(env, replace);
        for (ZPair zpairResult605 : ZVal.getIterable(replace, env, false)) {
            key = ZVal.assign(zpairResult605.getKey());
            value = ZVal.assign(zpairResult605.getValue());
            line =
                    function_str_replace
                            .f
                            .env(env)
                            .call(
                                    ZVal.newArray(
                                            new ZPair(0, ":" + toStringR(key, env)),
                                            new ZPair(
                                                    1,
                                                    ":"
                                                            + toStringR(
                                                                    Str.runtimeStaticObject.upper(
                                                                            env, key),
                                                                    env)),
                                            new ZPair(
                                                    2,
                                                    ":"
                                                            + toStringR(
                                                                    Str.runtimeStaticObject.ucfirst(
                                                                            env, key),
                                                                    env))),
                                    ZVal.newArray(
                                            new ZPair(0, value),
                                            new ZPair(1, Str.runtimeStaticObject.upper(env, value)),
                                            new ZPair(
                                                    2,
                                                    Str.runtimeStaticObject.ucfirst(env, value))),
                                    line)
                            .value();
        }

        return ZVal.assign(line);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "replace", typeHint = "array")
    protected Object sortReplacements(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Translation")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Translation/Translator.php");
        Object replace = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                new Collection(env, replace),
                                "sortBy",
                                Translator.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Translation",
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
                                        return ZVal.assign(
                                                ZVal.multiply(
                                                        NamespaceGlobal.mb_strlen
                                                                .env(env)
                                                                .call(key)
                                                                .value(),
                                                        -1));
                                    }
                                }),
                        "all",
                        Translator.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "lines", typeHint = "array")
    @ConvertedParameter(index = 1, name = "locale")
    @ConvertedParameter(index = 2, name = "namespace")
    public Object addLines(RuntimeEnv env, Object... args) {
        Object lines = assignParameter(args, 0, false);
        Object locale = assignParameter(args, 1, false);
        Object namespace = assignParameter(args, 2, true);
        if (null == namespace) {
            namespace = "*";
        }
        Object item = null;
        Object runtimeTempArrayResult86 = null;
        Object value = null;
        Object key = null;
        Object group = null;
        for (ZPair zpairResult606 : ZVal.getIterable(lines, env, false)) {
            key = ZVal.assign(zpairResult606.getKey());
            value = ZVal.assign(zpairResult606.getValue());
            ZVal.list(
                    runtimeTempArrayResult86 =
                            function_explode.f.env(env).call(".", key, 2).value(),
                    (group = listGet(runtimeTempArrayResult86, 0, env)),
                    (item = listGet(runtimeTempArrayResult86, 1, env)));
            Arr.runtimeStaticObject.set(
                    env,
                    new RuntimeArgsWithReferences()
                            .add(0, new ReferenceClassProperty(this, "loaded", env)),
                    this.loaded,
                    toStringR(namespace, env)
                            + "."
                            + toStringR(group, env)
                            + "."
                            + toStringR(locale, env)
                            + "."
                            + toStringR(item, env),
                    value);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "namespace")
    @ConvertedParameter(index = 1, name = "group")
    @ConvertedParameter(index = 2, name = "locale")
    public Object load(RuntimeEnv env, Object... args) {
        Object namespace = assignParameter(args, 0, false);
        Object group = assignParameter(args, 1, false);
        Object locale = assignParameter(args, 2, false);
        Object lines = null;
        if (ZVal.isTrue(this.isLoaded(env, namespace, group, locale))) {
            return null;
        }

        lines = env.callMethod(this.loader, "load", Translator.class, locale, group, namespace);
        new ReferenceClassProperty(this, "loaded", env)
                .arrayAccess(env, namespace, group, locale)
                .set(lines);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "namespace")
    @ConvertedParameter(index = 1, name = "group")
    @ConvertedParameter(index = 2, name = "locale")
    protected Object isLoaded(RuntimeEnv env, Object... args) {
        Object namespace = assignParameter(args, 0, false);
        Object group = assignParameter(args, 1, false);
        Object locale = assignParameter(args, 2, false);
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "loaded", env),
                        env,
                        namespace,
                        group,
                        locale));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "namespace")
    @ConvertedParameter(index = 1, name = "hint")
    public Object addNamespace(RuntimeEnv env, Object... args) {
        Object namespace = assignParameter(args, 0, false);
        Object hint = assignParameter(args, 1, false);
        env.callMethod(this.loader, "addNamespace", Translator.class, namespace, hint);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object addJsonPath(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        env.callMethod(this.loader, "addJsonPath", Translator.class, path);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object parseKey(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        ReferenceContainer segments = new BasicReferenceContainer(null);
        segments.setObject(super.parseKey(env, key));
        if (function_is_null.f.env(env).call(segments.arrayGet(env, 0)).getBool()) {
            segments.arrayAccess(env, 0).set("*");
        }

        return ZVal.assign(segments.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    protected Object localeArray(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                ZVal.isTrue(ternaryExpressionTemp = locale)
                                                        ? ternaryExpressionTemp
                                                        : this.locale),
                                        new ZPair(1, this.fallback)))
                        .value());
    }

    @ConvertedMethod
    public Object getSelector(RuntimeEnv env, Object... args) {
        if (!ZVal.isset(this.selector)) {
            this.selector = new MessageSelector(env);
        }

        return ZVal.assign(this.selector);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "selector",
        typeHint = "Illuminate\\Translation\\MessageSelector"
    )
    public Object setSelector(RuntimeEnv env, Object... args) {
        Object selector = assignParameter(args, 0, false);
        this.selector = selector;
        return null;
    }

    @ConvertedMethod
    public Object getLoader(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.loader);
    }

    @ConvertedMethod
    public Object locale(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getLocale(env));
    }

    @ConvertedMethod
    public Object getLocale(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.locale);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    public Object setLocale(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, false);
        this.locale = locale;
        return null;
    }

    @ConvertedMethod
    public Object getFallback(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.fallback);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fallback")
    public Object setFallback(RuntimeEnv env, Object... args) {
        Object fallback = assignParameter(args, 0, false);
        this.fallback = fallback;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "loaded", typeHint = "array")
    public Object setLoaded(RuntimeEnv env, Object... args) {
        Object loaded = assignParameter(args, 0, false);
        this.loaded = loaded;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        ReferenceContainer method = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object parameters = assignParameter(args, 1, false);
        Object macro = null;
        if (!ZVal.isTrue(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Translator.class)
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
                                                .Translation
                                                .classes
                                                .Translator
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
                                            Translator.class,
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

    public static final Object CONST_class = "Illuminate\\Translation\\Translator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends NamespacedItemResolver.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

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
                                    .Translation
                                    .classes
                                    .Translator
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
                            Translator.class,
                            ZVal.toLong(256) | ZVal.toLong(512));
            for (ZPair zpairResult2364 : ZVal.getIterable(methods, env, true)) {
                method = ZVal.assign(zpairResult2364.getValue());
                env.callMethod(method, "setAccessible", Translator.class, true);
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Translator.class)
                        .method("macro")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                toObjectR(method).accessProp(this, env).name("name").value(),
                                env.callMethod(method, "invoke", Translator.class, mixin))
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
                                            .Translation
                                            .classes
                                            .Translator
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
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Translator.class)
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
                                                    .Translation
                                                    .classes
                                                    .Translator
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
                                                                        .Translation
                                                                        .classes
                                                                        .Translator
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
                                                            .Translation
                                                            .classes
                                                            .Translator
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

        public Object macros = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Translation\\Translator")
                    .setLookup(
                            Translator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "fallback", "loaded", "loader", "locale", "parsed", "selector")
                    .setStaticPropertyNames("macros")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Translation/Translator.php")
                    .addInterface("Illuminate\\Contracts\\Translation\\Translator")
                    .addTrait("Illuminate\\Support\\Traits\\Macroable")
                    .addExtendsClass("Illuminate\\Support\\NamespacedItemResolver")
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
