package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes;

import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.IteratorAggregate;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.filter.function_filter_var;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_replace;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.ArrayIterator;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/ParameterBag.php

*/

public class ParameterBag extends RuntimeClassBase implements IteratorAggregate, Countable {

    public Object parameters = null;

    public ParameterBag(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ParameterBag.class) {
            this.__construct(env, args);
        }
    }

    public ParameterBag(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "parameters",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object parameters = assignParameter(args, 0, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        this.parameters = parameters;
        return null;
    }

    @ConvertedMethod
    public Object all(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.parameters);
    }

    @ConvertedMethod
    public Object keys(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_array_keys.f.env(env).call(this.parameters).value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "parameters",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object replace(RuntimeEnv env, Object... args) {
        Object parameters = assignParameter(args, 0, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        this.parameters = parameters;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "parameters",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object add(RuntimeEnv env, Object... args) {
        Object parameters = assignParameter(args, 0, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        this.parameters =
                function_array_replace.f.env(env).call(this.parameters, parameters).value();
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
    public Object get(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        return ZVal.assign(
                function_array_key_exists.f.env(env).call(key, this.parameters).getBool()
                        ? new ReferenceClassProperty(this, "parameters", env).arrayGet(env, key)
                        : _pDefault);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object set(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "parameters", env).arrayAccess(env, key).set(value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object has(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(function_array_key_exists.f.env(env).call(key, this.parameters).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object remove(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        arrayActionR(
                ArrayAction.UNSET, new ReferenceClassProperty(this, "parameters", env), env, key);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "default")
    public Object getAlpha(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = "";
        }
        return ZVal.assign(
                function_preg_replace
                        .f
                        .env(env)
                        .call("/[^[:alpha:]]/", "", this.get(env, key, _pDefault))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "default")
    public Object getAlnum(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = "";
        }
        return ZVal.assign(
                function_preg_replace
                        .f
                        .env(env)
                        .call("/[^[:alnum:]]/", "", this.get(env, key, _pDefault))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "default")
    public Object getDigits(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = "";
        }
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                ZVal.arrayFromList("-", "+"),
                                "",
                                this.filter(env, key, _pDefault, 519))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object getInt(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = 0;
        }
        return ZVal.assign(ZVal.toLong(this.get(env, key, _pDefault)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object getBoolean(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = false;
        }
        return ZVal.assign(this.filter(env, key, _pDefault, 258));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 2, name = "filter")
    @ConvertedParameter(index = 3, name = "options", defaultValue = "", defaultValueType = "array")
    public Object filter(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        Object filter = assignParameter(args, 2, true);
        if (null == filter) {
            filter = 516;
        }
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 3, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        Object value = null;
        value = this.get(env, key, _pDefault);
        if (ZVal.toBool(!function_is_array.f.env(env).call(options.getObject()).getBool())
                && ZVal.toBool(options.getObject())) {
            options.setObject(ZVal.newArray(new ZPair("flags", options.getObject())));
        }

        if (ZVal.toBool(function_is_array.f.env(env).call(value).value())
                && ZVal.toBool(!arrayActionR(ArrayAction.ISSET, options, env, "flags"))) {
            options.arrayAccess(env, "flags").set(16777216);
        }

        return ZVal.assign(
                function_filter_var.f.env(env).call(value, filter, options.getObject()).value());
    }

    @ConvertedMethod
    public Object getIterator(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ArrayIterator(env, this.parameters));
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_count.f.env(env).call(this.parameters).value());
    }

    public static final Object CONST_class = "Symfony\\Component\\HttpFoundation\\ParameterBag";

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
                    .setName("Symfony\\Component\\HttpFoundation\\ParameterBag")
                    .setLookup(
                            ParameterBag.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("parameters")
                    .setFilename("vendor/symfony/http-foundation/ParameterBag.php")
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
