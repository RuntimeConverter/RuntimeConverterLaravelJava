package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes;

import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.array.function_ksort;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.IteratorAggregate;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.HeaderUtils;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.ArrayIterator;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/HeaderBag.php

*/

public class HeaderBag extends RuntimeClassBase implements IteratorAggregate, Countable {

    public Object headers = ZVal.newArray();

    public Object cacheControl = ZVal.newArray();

    public HeaderBag(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == HeaderBag.class) {
            this.__construct(env, args);
        }
    }

    public HeaderBag(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object headers = assignParameter(args, 0, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        Object values = null;
        Object key = null;
        for (ZPair zpairResult1850 : ZVal.getIterable(headers, env, false)) {
            key = ZVal.assign(zpairResult1850.getKey());
            values = ZVal.assign(zpairResult1850.getValue());
            this.set(env, key, values);
        }

        return null;
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        Object headers = null;
        Object max = null;
        Object values = null;
        Object name = null;
        Object value = null;
        Object content = null;
        if (!ZVal.isTrue(headers = this.all(env))) {
            return "";
        }

        function_ksort.f.env(env).call(headers);
        max =
                ZVal.add(
                        NamespaceGlobal.max
                                .env(env)
                                .call(
                                        function_array_map
                                                .f
                                                .env(env)
                                                .call(
                                                        "strlen",
                                                        function_array_keys
                                                                .f
                                                                .env(env)
                                                                .call(headers)
                                                                .value())
                                                .value())
                                .value(),
                        1);
        content = "";
        for (ZPair zpairResult1851 : ZVal.getIterable(headers, env, false)) {
            name = ZVal.assign(zpairResult1851.getKey());
            values = ZVal.assign(zpairResult1851.getValue());
            name = NamespaceGlobal.ucwords.env(env).call(name, "-").value();
            for (ZPair zpairResult1852 : ZVal.getIterable(values, env, true)) {
                value = ZVal.assign(zpairResult1852.getValue());
                content =
                        toStringR(content, env)
                                + toStringR(
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "%-" + toStringR(max, env) + "s %s\r\n",
                                                        toStringR(name, env) + ":",
                                                        value)
                                                .value(),
                                        env);
            }
        }

        return ZVal.assign(content);
    }

    @ConvertedMethod
    public Object all(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.headers);
    }

    @ConvertedMethod
    public Object keys(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_array_keys.f.env(env).call(this.all(env)).value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object replace(RuntimeEnv env, Object... args) {
        Object headers = assignParameter(args, 0, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        this.headers = ZVal.newArray();
        this.add(env, headers);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "headers", typeHint = "array")
    public Object add(RuntimeEnv env, Object... args) {
        Object headers = assignParameter(args, 0, false);
        Object values = null;
        Object key = null;
        for (ZPair zpairResult1853 : ZVal.getIterable(headers, env, false)) {
            key = ZVal.assign(zpairResult1853.getKey());
            values = ZVal.assign(zpairResult1853.getValue());
            this.set(env, key, values);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "first",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object get(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        Object first = assignParameter(args, 2, true);
        if (null == first) {
            first = true;
        }
        ReferenceContainer headers = new BasicReferenceContainer(null);
        key =
                function_str_replace
                        .f
                        .env(env)
                        .call("_", "-", NamespaceGlobal.strtolower.env(env).call(key).value())
                        .value();
        headers.setObject(this.all(env));
        if (!function_array_key_exists.f.env(env).call(key, headers.getObject()).getBool()) {
            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", _pDefault)) {
                return ZVal.assign(ZVal.isTrue(first) ? ZVal.getNull() : ZVal.newArray());
            }

            return ZVal.assign(
                    ZVal.isTrue(first) ? _pDefault : ZVal.newArray(new ZPair(0, _pDefault)));
        }

        if (ZVal.isTrue(first)) {
            return ZVal.assign(
                    function_count.f.env(env).call(headers.arrayGet(env, key)).getBool()
                            ? headers.arrayGet(env, key, 0)
                            : _pDefault);
        }

        return ZVal.assign(headers.arrayGet(env, key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "values")
    @ConvertedParameter(
        index = 2,
        name = "replace",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object set(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, false);
        Object replace = assignParameter(args, 2, true);
        if (null == replace) {
            replace = true;
        }
        key =
                function_str_replace
                        .f
                        .env(env)
                        .call("_", "-", NamespaceGlobal.strtolower.env(env).call(key).value())
                        .value();
        if (function_is_array.f.env(env).call(values).getBool()) {
            values = function_array_values.f.env(env).call(values).value();
            if (ZVal.toBool(ZVal.strictEqualityCheck(true, "===", replace))
                    || ZVal.toBool(
                            !arrayActionR(
                                    ArrayAction.ISSET,
                                    new ReferenceClassProperty(this, "headers", env),
                                    env,
                                    key))) {
                new ReferenceClassProperty(this, "headers", env).arrayAccess(env, key).set(values);

            } else {
                new ReferenceClassProperty(this, "headers", env)
                        .arrayAccess(env, key)
                        .set(
                                function_array_merge
                                        .f
                                        .env(env)
                                        .call(
                                                new ReferenceClassProperty(this, "headers", env)
                                                        .arrayGet(env, key),
                                                values)
                                        .value());
            }

        } else {
            if (ZVal.toBool(ZVal.strictEqualityCheck(true, "===", replace))
                    || ZVal.toBool(
                            !arrayActionR(
                                    ArrayAction.ISSET,
                                    new ReferenceClassProperty(this, "headers", env),
                                    env,
                                    key))) {
                new ReferenceClassProperty(this, "headers", env)
                        .arrayAccess(env, key)
                        .set(ZVal.newArray(new ZPair(0, values)));

            } else {
                new ReferenceClassProperty(this, "headers", env).arrayAppend(env, key).set(values);
            }
        }

        if (ZVal.strictEqualityCheck("cache-control", "===", key)) {
            this.cacheControl =
                    this.parseCacheControl(
                            env,
                            NamespaceGlobal.implode
                                    .env(env)
                                    .call(
                                            ", ",
                                            new ReferenceClassProperty(this, "headers", env)
                                                    .arrayGet(env, key))
                                    .value());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object has(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_key_exists
                        .f
                        .env(env)
                        .call(
                                function_str_replace
                                        .f
                                        .env(env)
                                        .call(
                                                "_",
                                                "-",
                                                NamespaceGlobal.strtolower
                                                        .env(env)
                                                        .call(key)
                                                        .value())
                                        .value(),
                                this.all(env))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object contains(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(
                function_in_array
                        .f
                        .env(env)
                        .call(value, this.get(env, key, ZVal.getNull(), false))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object remove(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        key =
                function_str_replace
                        .f
                        .env(env)
                        .call("_", "-", NamespaceGlobal.strtolower.env(env).call(key).value())
                        .value();
        arrayActionR(ArrayAction.UNSET, new ReferenceClassProperty(this, "headers", env), env, key);
        if (ZVal.strictEqualityCheck("cache-control", "===", key)) {
            this.cacheControl = ZVal.newArray();
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "default",
        typeHint = "DateTime",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getDate(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        Object date = null;
        Object value = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", value = this.get(env, key))) {
            return ZVal.assign(_pDefault);
        }

        if (ZVal.strictEqualityCheck(
                false,
                "===",
                date =
                        DateTime.runtimeStaticObject.createFromFormat(
                                env, "D, d M Y H:i:s O", value))) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("The %s HTTP header is not parseable (%s).", key, value)
                                    .value()));
        }

        return ZVal.assign(date);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "value",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object addCacheControlDirective(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, true);
        if (null == value) {
            value = true;
        }
        new ReferenceClassProperty(this, "cacheControl", env).arrayAccess(env, key).set(value);
        this.set(env, "Cache-Control", this.getCacheControlHeader(env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object hasCacheControlDirective(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_key_exists.f.env(env).call(key, this.cacheControl).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object getCacheControlDirective(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_key_exists.f.env(env).call(key, this.cacheControl).getBool()
                        ? new ReferenceClassProperty(this, "cacheControl", env).arrayGet(env, key)
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object removeCacheControlDirective(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        arrayActionR(
                ArrayAction.UNSET, new ReferenceClassProperty(this, "cacheControl", env), env, key);
        this.set(env, "Cache-Control", this.getCacheControlHeader(env));
        return null;
    }

    @ConvertedMethod
    public Object getIterator(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ArrayIterator(env, this.headers));
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_count.f.env(env).call(this.headers).value());
    }

    @ConvertedMethod
    protected Object getCacheControlHeader(RuntimeEnv env, Object... args) {
        function_ksort.f.env(env).call(this.cacheControl);
        return ZVal.assign(HeaderUtils.runtimeStaticObject.toString(env, this.cacheControl, ","));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "header")
    protected Object parseCacheControl(RuntimeEnv env, Object... args) {
        Object header = assignParameter(args, 0, false);
        Object parts = null;
        parts = HeaderUtils.runtimeStaticObject.split(env, header, ",=");
        return ZVal.assign(HeaderUtils.runtimeStaticObject.combine(env, parts));
    }

    public static final Object CONST_class = "Symfony\\Component\\HttpFoundation\\HeaderBag";

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
                    .setName("Symfony\\Component\\HttpFoundation\\HeaderBag")
                    .setLookup(
                            HeaderBag.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("cacheControl", "headers")
                    .setFilename("vendor/symfony/http-foundation/HeaderBag.php")
                    .addInterface("IteratorAggregate")
                    .addInterface("Traversable")
                    .addInterface("Countable")
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
