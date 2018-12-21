package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_rand;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.ArrayAccess;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_intersect_key;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Collection;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.runtimeconverter.runtime.nativeFunctions.array.function_sort;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_ksort;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reverse;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_flip;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.project.convertedCode.globalNamespace.functions.value;
import com.runtimeconverter.runtime.nativeFunctions.array.function_usort;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.project.convertedCode.globalNamespace.functions.data_get;
import com.runtimeconverter.runtime.nativeFunctions.array.function_shuffle;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;
import static com.runtimeconverter.runtime.ZVal.assignParameterVarArgs;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/Arr.php

*/

public class Arr extends RuntimeClassBase {

    public Arr(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Arr(NoConstructor n) {
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
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Arr.class)
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
                                                .Arr
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
                                            Arr.class,
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

    public static final Object CONST_class = "Illuminate\\Support\\Arr";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object accessible(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            return ZVal.assign(
                    ZVal.toBool(function_is_array.f.env(env).call(value).value())
                            || ZVal.toBool(
                                    ZVal.checkInstanceType(
                                            value, ArrayAccess.class, "ArrayAccess")));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        @ConvertedParameter(index = 1, name = "key")
        @ConvertedParameter(index = 2, name = "value")
        public Object add(RuntimeEnv env, Object... args) {
            ReferenceContainer array = new BasicReferenceContainer(assignParameter(args, 0, false));
            Object key = assignParameter(args, 1, false);
            Object value = assignParameter(args, 2, false);
            if (function_is_null
                    .f
                    .env(env)
                    .call(
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Arr.class)
                                    .method("get")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(array.getObject(), key)
                                    .value())
                    .getBool()) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Arr.class)
                        .method("set")
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(0, array))
                        .call(array.getObject(), key, value)
                        .value();
            }

            return ZVal.assign(array.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        public Object collapse(RuntimeEnv env, Object... args) {
            int runtimeConverterContinueCount;
            Object array = assignParameter(args, 0, false);
            Object values = null;
            Object results = null;
            results = ZVal.newArray();
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult543 : ZVal.getIterable(array, env, true)) {
                values = ZVal.assign(zpairResult543.getValue());
                if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                values, Collection.class, "Illuminate\\Support\\Collection"))) {
                    values = env.callMethod(values, "all", Arr.class);

                } else if (!function_is_array.f.env(env).call(values).getBool()) {
                    continue;
                }

                results = function_array_merge.f.env(env).call(results, values).value();
            }

            return ZVal.assign(results);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "arrays")
        public Object crossJoin(RuntimeEnv env, Object... args) {
            Object arrays = assignParameterVarArgs(args, 0);
            ReferenceContainer product = new BasicReferenceContainer(null);
            Object item = null;
            Object array = null;
            Object index = null;
            Object results = null;
            ReferenceContainer append = new BasicReferenceContainer(null);
            results = ZVal.newArray(new ZPair(0, ZVal.newArray()));
            for (ZPair zpairResult544 : ZVal.getIterable(arrays, env, false)) {
                index = ZVal.assign(zpairResult544.getKey());
                array = ZVal.assign(zpairResult544.getValue());
                append.setObject(ZVal.newArray());
                for (ZPair zpairResult545 : ZVal.getIterable(results, env, true)) {
                    product.setObject(ZVal.assign(zpairResult545.getValue()));
                    for (ZPair zpairResult546 : ZVal.getIterable(array, env, true)) {
                        item = ZVal.assign(zpairResult546.getValue());
                        product.arrayAccess(env, index).set(item);
                        append.arrayAppend(env).set(product.getObject());
                    }
                }

                results = ZVal.assign(append.getObject());
            }

            return ZVal.assign(results);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        public Object divide(RuntimeEnv env, Object... args) {
            Object array = assignParameter(args, 0, false);
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(0, function_array_keys.f.env(env).call(array).value()),
                            new ZPair(1, function_array_values.f.env(env).call(array).value())));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        @ConvertedParameter(index = 1, name = "prepend")
        public Object dot(RuntimeEnv env, Object... args) {
            Object array = assignParameter(args, 0, false);
            Object prepend = assignParameter(args, 1, true);
            if (null == prepend) {
                prepend = "";
            }
            ReferenceContainer results = new BasicReferenceContainer(null);
            Object value = null;
            Object key = null;
            results.setObject(ZVal.newArray());
            for (ZPair zpairResult547 : ZVal.getIterable(array, env, false)) {
                key = ZVal.assign(zpairResult547.getKey());
                value = ZVal.assign(zpairResult547.getValue());
                if (ZVal.toBool(function_is_array.f.env(env).call(value).value())
                        && ZVal.toBool(!ZVal.isEmpty(value))) {
                    results.setObject(
                            function_array_merge
                                    .f
                                    .env(env)
                                    .call(
                                            results.getObject(),
                                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                                            env, this, Arr.class)
                                                    .method("dot")
                                                    .addReferenceArgs(
                                                            new RuntimeArgsWithReferences())
                                                    .call(
                                                            value,
                                                            toStringR(prepend, env)
                                                                    + toStringR(key, env)
                                                                    + ".")
                                                    .value())
                                    .value());

                } else {
                    results.arrayAccess(env, toStringR(prepend, env) + toStringR(key, env))
                            .set(value);
                }
            }

            return ZVal.assign(results.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        @ConvertedParameter(index = 1, name = "keys")
        public Object except(RuntimeEnv env, Object... args) {
            ReferenceContainer array = new BasicReferenceContainer(assignParameter(args, 0, false));
            Object keys = assignParameter(args, 1, false);
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Arr.class)
                    .method("forget")
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(0, array))
                    .call(array.getObject(), keys)
                    .value();
            return ZVal.assign(array.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        @ConvertedParameter(index = 1, name = "key")
        public Object exists(RuntimeEnv env, Object... args) {
            Object array = assignParameter(args, 0, false);
            Object key = assignParameter(args, 1, false);
            if (ZVal.isTrue(ZVal.checkInstanceType(array, ArrayAccess.class, "ArrayAccess"))) {
                return ZVal.assign(env.callMethod(array, "offsetExists", Arr.class, key));
            }

            return ZVal.assign(function_array_key_exists.f.env(env).call(key, array).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        @ConvertedParameter(
            index = 1,
            name = "callback",
            typeHint = "callable",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 2,
            name = "default",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object first(RuntimeEnv env, Object... args) {
            Object array = assignParameter(args, 0, false);
            Object callback = assignParameter(args, 1, true);
            if (null == callback) {
                callback = ZVal.getNull();
            }
            Object _pDefault = assignParameter(args, 2, true);
            if (null == _pDefault) {
                _pDefault = ZVal.getNull();
            }
            Object item = null;
            Object value = null;
            Object key = null;
            if (function_is_null.f.env(env).call(callback).getBool()) {
                if (ZVal.isEmpty(array)) {
                    return ZVal.assign(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .functions
                                    .value
                                    .f
                                    .env(env)
                                    .call(_pDefault)
                                    .value());
                }

                for (ZPair zpairResult548 : ZVal.getIterable(array, env, true)) {
                    item = ZVal.assign(zpairResult548.getValue());
                    return ZVal.assign(item);
                }
            }

            for (ZPair zpairResult549 : ZVal.getIterable(array, env, false)) {
                key = ZVal.assign(zpairResult549.getKey());
                value = ZVal.assign(zpairResult549.getValue());
                if (function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(callback, value, key)
                        .getBool()) {
                    return ZVal.assign(value);
                }
            }

            return ZVal.assign(
                    com.project
                            .convertedCode
                            .globalNamespace
                            .functions
                            .value
                            .f
                            .env(env)
                            .call(_pDefault)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        @ConvertedParameter(
            index = 1,
            name = "callback",
            typeHint = "callable",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 2,
            name = "default",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object last(RuntimeEnv env, Object... args) {
            Object array = assignParameter(args, 0, false);
            Object callback = assignParameter(args, 1, true);
            if (null == callback) {
                callback = ZVal.getNull();
            }
            Object _pDefault = assignParameter(args, 2, true);
            if (null == _pDefault) {
                _pDefault = ZVal.getNull();
            }
            if (function_is_null.f.env(env).call(callback).getBool()) {
                return ZVal.assign(
                        ZVal.isEmpty(array)
                                ? value.f.env(env).call(_pDefault).value()
                                : function_end.f.env(env).call(array).value());
            }

            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Arr.class)
                            .method("first")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    function_array_reverse.f.env(env).call(array, true).value(),
                                    callback,
                                    _pDefault)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        @ConvertedParameter(index = 1, name = "depth")
        public Object flatten(RuntimeEnv env, Object... args) {
            Object array = assignParameter(args, 0, false);
            Object depth = assignParameter(args, 1, true);
            if (null == depth) {
                depth = function_constant.get(env, "INF");
            }
            ReferenceContainer result = new BasicReferenceContainer(null);
            Object item = null;
            result.setObject(ZVal.newArray());
            for (ZPair zpairResult550 : ZVal.getIterable(array, env, true)) {
                item = ZVal.assign(zpairResult550.getValue());
                item =
                        ZVal.assign(
                                ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        item,
                                                        Collection.class,
                                                        "Illuminate\\Support\\Collection"))
                                        ? env.callMethod(item, "all", Arr.class)
                                        : item);
                if (!function_is_array.f.env(env).call(item).getBool()) {
                    result.arrayAppend(env).set(item);

                } else if (ZVal.strictEqualityCheck(depth, "===", 1)) {
                    result.setObject(
                            function_array_merge
                                    .f
                                    .env(env)
                                    .call(
                                            result.getObject(),
                                            function_array_values.f.env(env).call(item).value())
                                    .value());

                } else {
                    result.setObject(
                            function_array_merge
                                    .f
                                    .env(env)
                                    .call(
                                            result.getObject(),
                                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                                            env, this, Arr.class)
                                                    .method("flatten")
                                                    .addReferenceArgs(
                                                            new RuntimeArgsWithReferences())
                                                    .call(item, ZVal.subtract(depth, 1))
                                                    .value())
                                    .value());
                }
            }

            return ZVal.assign(result.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        @ConvertedParameter(index = 1, name = "keys")
        public Object forget(
                RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
            int runtimeConverterContinueCount;
            ReferenceContainer array =
                    assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
            Object keys = assignParameter(args, 1, false);
            ReferenceContainer original = new BasicReferenceContainer(null);
            Object part = null;
            Object parts = null;
            Object key = null;
            original = array;
            keys = ZVal.assign(rToArrayCast(keys));
            if (ZVal.strictEqualityCheck(function_count.f.env(env).call(keys).value(), "===", 0)) {
                return null;
            }

            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult551 : ZVal.getIterable(keys, env, true)) {
                key = ZVal.assign(zpairResult551.getValue());
                if (ZVal.isTrue(
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Arr.class)
                                .method("exists")
                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                .call(array.getObject(), key)
                                .value())) {
                    arrayActionR(ArrayAction.UNSET, array, env, key);
                    continue;
                }

                parts = function_explode.f.env(env).call(".", key).value();
                array = original;
                runtimeConverterContinueCount = 0;
                while (ZVal.isGreaterThan(function_count.f.env(env).call(parts).value(), '>', 1)) {
                    part = function_array_shift.f.env(env).call(parts).value();
                    if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, array, env, part))
                            && ZVal.toBool(
                                    function_is_array
                                            .f
                                            .env(env)
                                            .call(array.arrayGet(env, part))
                                            .value())) {
                        array = new ArrayDimensionReference(array.getObject(), part);

                    } else {
                        runtimeConverterContinueCount = 2;
                        runtimeConverterContinueCount--;
                        continue;
                    }
                }

                arrayActionR(
                        ArrayAction.UNSET,
                        array,
                        env,
                        function_array_shift.f.env(env).call(parts).value());
            }

            return null;
        }

        public Object forget(RuntimeEnv env, Object... args) {
            throw new TemporaryStubFunctionException();
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        @ConvertedParameter(index = 1, name = "key")
        @ConvertedParameter(
            index = 2,
            name = "default",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object get(RuntimeEnv env, Object... args) {
            ReferenceContainer array = new BasicReferenceContainer(assignParameter(args, 0, false));
            Object key = assignParameter(args, 1, false);
            Object _pDefault = assignParameter(args, 2, true);
            if (null == _pDefault) {
                _pDefault = ZVal.getNull();
            }
            Object segment = null;
            Object ternaryExpressionTemp = null;
            if (!ZVal.isTrue(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Arr.class)
                            .method("accessible")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(array.getObject())
                            .value())) {
                return ZVal.assign(value.f.env(env).call(_pDefault).value());
            }

            if (function_is_null.f.env(env).call(key).getBool()) {
                return ZVal.assign(array.getObject());
            }

            if (ZVal.isTrue(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Arr.class)
                            .method("exists")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(array.getObject(), key)
                            .value())) {
                return ZVal.assign(array.arrayGet(env, key));
            }

            if (ZVal.strictEqualityCheck(
                    function_strpos.f.env(env).call(key, ".").value(), "===", false)) {
                return ZVal.assign(
                        ZVal.isDefined(ternaryExpressionTemp = array.arrayGet(env, key))
                                ? ternaryExpressionTemp
                                : value.f.env(env).call(_pDefault).value());
            }

            for (ZPair zpairResult552 :
                    ZVal.getIterable(
                            function_explode.f.env(env).call(".", key).value(), env, true)) {
                segment = ZVal.assign(zpairResult552.getValue());
                if (ZVal.toBool(
                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, Arr.class)
                                        .method("accessible")
                                        .addReferenceArgs(new RuntimeArgsWithReferences())
                                        .call(array.getObject())
                                        .value())
                        && ZVal.toBool(
                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, Arr.class)
                                        .method("exists")
                                        .addReferenceArgs(new RuntimeArgsWithReferences())
                                        .call(array.getObject(), segment)
                                        .value())) {
                    array.setObject(ZVal.assign(array.arrayGet(env, segment)));

                } else {
                    return ZVal.assign(value.f.env(env).call(_pDefault).value());
                }
            }

            return ZVal.assign(array.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        @ConvertedParameter(index = 1, name = "keys")
        public Object has(RuntimeEnv env, Object... args) {
            int runtimeConverterContinueCount;
            Object array = assignParameter(args, 0, false);
            Object keys = assignParameter(args, 1, false);
            Object segment = null;
            ReferenceContainer subKeyArray = new BasicReferenceContainer(null);
            Object key = null;
            if (function_is_null.f.env(env).call(keys).getBool()) {
                return ZVal.assign(false);
            }

            keys = ZVal.assign(rToArrayCast(keys));
            if (!ZVal.isTrue(array)) {
                return ZVal.assign(false);
            }

            if (ZVal.strictEqualityCheck(keys, "===", ZVal.newArray())) {
                return ZVal.assign(false);
            }

            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult553 : ZVal.getIterable(keys, env, true)) {
                key = ZVal.assign(zpairResult553.getValue());
                subKeyArray.setObject(ZVal.assign(array));
                if (ZVal.isTrue(
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Arr.class)
                                .method("exists")
                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                .call(array, key)
                                .value())) {
                    continue;
                }

                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult554 :
                        ZVal.getIterable(
                                function_explode.f.env(env).call(".", key).value(), env, true)) {
                    segment = ZVal.assign(zpairResult554.getValue());
                    if (ZVal.toBool(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Arr.class)
                                            .method("accessible")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(subKeyArray.getObject())
                                            .value())
                            && ZVal.toBool(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Arr.class)
                                            .method("exists")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(subKeyArray.getObject(), segment)
                                            .value())) {
                        subKeyArray.setObject(ZVal.assign(subKeyArray.arrayGet(env, segment)));

                    } else {
                        return ZVal.assign(false);
                    }
                }
            }

            return ZVal.assign(true);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array", typeHint = "array")
        public Object isAssoc(RuntimeEnv env, Object... args) {
            Object array = assignParameter(args, 0, false);
            Object keys = null;
            keys = function_array_keys.f.env(env).call(array).value();
            return ZVal.assign(
                    ZVal.strictNotEqualityCheck(
                            function_array_keys.f.env(env).call(keys).value(), "!==", keys));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        @ConvertedParameter(index = 1, name = "keys")
        public Object only(RuntimeEnv env, Object... args) {
            Object array = assignParameter(args, 0, false);
            Object keys = assignParameter(args, 1, false);
            return ZVal.assign(
                    function_array_intersect_key
                            .f
                            .env(env)
                            .call(
                                    array,
                                    function_array_flip.f.env(env).call(rToArrayCast(keys)).value())
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        @ConvertedParameter(index = 1, name = "value")
        @ConvertedParameter(
            index = 2,
            name = "key",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object pluck(RuntimeEnv env, Object... args) {
            Object array = assignParameter(args, 0, false);
            Object value = assignParameter(args, 1, false);
            Object key = assignParameter(args, 2, true);
            if (null == key) {
                key = ZVal.getNull();
            }
            Object runtimeTempArrayResult82 = null;
            Object item = null;
            Object itemValue = null;
            ReferenceContainer results = new BasicReferenceContainer(null);
            Object itemKey = null;
            results.setObject(ZVal.newArray());
            ZVal.list(
                    runtimeTempArrayResult82 =
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Arr.class)
                                    .method("explodePluckParameters")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(value, key)
                                    .value(),
                    (value = listGet(runtimeTempArrayResult82, 0, env)),
                    (key = listGet(runtimeTempArrayResult82, 1, env)));
            for (ZPair zpairResult555 : ZVal.getIterable(array, env, true)) {
                item = ZVal.assign(zpairResult555.getValue());
                itemValue = data_get.f.env(env).call(item, value).value();
                if (function_is_null.f.env(env).call(key).getBool()) {
                    results.arrayAppend(env).set(itemValue);

                } else {
                    itemKey = data_get.f.env(env).call(item, key).value();
                    if (ZVal.toBool(function_is_object.f.env(env).call(itemKey).value())
                            && ZVal.toBool(
                                    function_method_exists
                                            .f
                                            .env(env)
                                            .call(itemKey, "__toString")
                                            .value())) {
                        itemKey = ZVal.assign(toStringR(itemKey, env));
                    }

                    results.arrayAccess(env, itemKey).set(itemValue);
                }
            }

            return ZVal.assign(results.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "key")
        protected Object explodePluckParameters(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object key = assignParameter(args, 1, false);
            value =
                    ZVal.assign(
                            function_is_string.f.env(env).call(value).getBool()
                                    ? function_explode.f.env(env).call(".", value).value()
                                    : value);
            key =
                    ZVal.assign(
                            ZVal.toBool(function_is_null.f.env(env).call(key).value())
                                            || ZVal.toBool(
                                                    function_is_array.f.env(env).call(key).value())
                                    ? key
                                    : function_explode.f.env(env).call(".", key).value());
            return ZVal.assign(ZVal.newArray(new ZPair(0, value), new ZPair(1, key)));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        @ConvertedParameter(index = 1, name = "value")
        @ConvertedParameter(
            index = 2,
            name = "key",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object prepend(RuntimeEnv env, Object... args) {
            Object array = assignParameter(args, 0, false);
            Object value = assignParameter(args, 1, false);
            Object key = assignParameter(args, 2, true);
            if (null == key) {
                key = ZVal.getNull();
            }
            if (function_is_null.f.env(env).call(key).getBool()) {
                function_array_unshift.f.env(env).call(array, value);

            } else {
                array = ZVal.add(ZVal.newArray(new ZPair(key, value)), array);
            }

            return ZVal.assign(array);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        @ConvertedParameter(index = 1, name = "key")
        @ConvertedParameter(
            index = 2,
            name = "default",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object pull(
                RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
            ReferenceContainer array =
                    assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
            Object key = assignParameter(args, 1, false);
            Object _pDefault = assignParameter(args, 2, true);
            if (null == _pDefault) {
                _pDefault = ZVal.getNull();
            }
            Object value = null;
            value =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Arr.class)
                            .method("get")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(array.getObject(), key, _pDefault)
                            .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Arr.class)
                    .method("forget")
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(0, array))
                    .call(array.getObject(), key)
                    .value();
            return ZVal.assign(value);
        }

        public Object pull(RuntimeEnv env, Object... args) {
            throw new TemporaryStubFunctionException();
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        @ConvertedParameter(
            index = 1,
            name = "number",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object random(RuntimeEnv env, Object... args) {
            ReferenceContainer array = new BasicReferenceContainer(assignParameter(args, 0, false));
            Object number = assignParameter(args, 1, true);
            if (null == number) {
                number = ZVal.getNull();
            }
            Object requested = null;
            Object keys = null;
            Object count = null;
            ReferenceContainer results = new BasicReferenceContainer(null);
            Object key = null;
            requested =
                    ZVal.assign(function_is_null.f.env(env).call(number).getBool() ? 1 : number);
            count = function_count.f.env(env).call(array.getObject()).value();
            if (ZVal.isGreaterThan(requested, '>', count)) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                "You requested "
                                        + toStringR(requested, env)
                                        + " items, but there are only "
                                        + toStringR(count, env)
                                        + " items available."));
            }

            if (function_is_null.f.env(env).call(number).getBool()) {
                return ZVal.assign(
                        array.arrayGet(
                                env,
                                function_array_rand.f.env(env).call(array.getObject()).value()));
            }

            if (ZVal.strictEqualityCheck(ZVal.toLong(number), "===", 0)) {
                return ZVal.assign(ZVal.newArray());
            }

            keys = function_array_rand.f.env(env).call(array.getObject(), number).value();
            results.setObject(ZVal.newArray());
            for (ZPair zpairResult556 : ZVal.getIterable(rToArrayCast(keys), env, true)) {
                key = ZVal.assign(zpairResult556.getValue());
                results.arrayAppend(env).set(array.arrayGet(env, key));
            }

            return ZVal.assign(results.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        @ConvertedParameter(index = 1, name = "key")
        @ConvertedParameter(index = 2, name = "value")
        public Object set(
                RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
            ReferenceContainer array =
                    assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
            Object key = assignParameter(args, 1, false);
            Object value = assignParameter(args, 2, false);
            Object keys = null;
            if (function_is_null.f.env(env).call(key).getBool()) {
                return ZVal.assign(array.setObject(ZVal.assign(value)));
            }

            keys = function_explode.f.env(env).call(".", key).value();
            while (ZVal.isGreaterThan(function_count.f.env(env).call(keys).value(), '>', 1)) {
                key = function_array_shift.f.env(env).call(keys).value();
                if (ZVal.toBool(!arrayActionR(ArrayAction.ISSET, array, env, key))
                        || ZVal.toBool(
                                !function_is_array
                                        .f
                                        .env(env)
                                        .call(array.arrayGet(env, key))
                                        .getBool())) {
                    array.arrayAccess(env, key).set(ZVal.newArray());
                }

                array = new ArrayDimensionReference(array.getObject(), key);
            }

            array.arrayAccess(env, function_array_shift.f.env(env).call(keys).value()).set(value);
            return ZVal.assign(array.getObject());
        }

        public Object set(RuntimeEnv env, Object... args) {
            throw new TemporaryStubFunctionException();
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        @ConvertedParameter(
            index = 1,
            name = "seed",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object shuffle(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                            .setFile("/vendor/laravel/framework/src/Illuminate/Support/Arr.php");
            Object array = assignParameter(args, 0, false);
            Object seed = assignParameter(args, 1, true);
            if (null == seed) {
                seed = ZVal.getNull();
            }
            if (function_is_null.f.env(env).call(seed).getBool()) {
                function_shuffle.f.env(env).call(array);

            } else {
                NamespaceGlobal.srand.env(env).call(seed);
                function_usort
                        .f
                        .env(env)
                        .call(
                                array,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Support",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        return ZVal.assign(
                                                NamespaceGlobal.rand.env(env).call(-1, 1).value());
                                    }
                                });
            }

            return ZVal.assign(array);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        @ConvertedParameter(
            index = 1,
            name = "callback",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object sort(RuntimeEnv env, Object... args) {
            Object array = assignParameter(args, 0, false);
            Object callback = assignParameter(args, 1, true);
            if (null == callback) {
                callback = ZVal.getNull();
            }
            return ZVal.assign(
                    env.callMethod(
                            env.callMethod(
                                    Collection.runtimeStaticObject.make(env, array),
                                    "sortBy",
                                    Arr.class,
                                    callback),
                            "all",
                            Arr.class));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        public Object sortRecursive(RuntimeEnv env, Object... args) {
            Object array = assignParameter(args, 0, false);
            ReferenceContainer value = new BasicReferenceContainer(null);
            for (ZPair zpairResult557 : ZVal.getIterable(array, env, true)) {
                value = zpairResult557;
                if (function_is_array.f.env(env).call(value.getObject()).getBool()) {
                    value.setObject(
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Arr.class)
                                    .method("sortRecursive")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(value.getObject())
                                    .value());
                }
            }

            if (ZVal.isTrue(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Arr.class)
                            .method("isAssoc")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(array)
                            .value())) {
                function_ksort.f.env(env).call(array);

            } else {
                function_sort.f.env(env).call(array);
            }

            return ZVal.assign(array);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        @ConvertedParameter(index = 1, name = "callback", typeHint = "callable")
        public Object where(RuntimeEnv env, Object... args) {
            Object array = assignParameter(args, 0, false);
            Object callback = assignParameter(args, 1, false);
            return ZVal.assign(function_array_filter.f.env(env).call(array, callback, 1).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object wrap(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            if (function_is_null.f.env(env).call(value).getBool()) {
                return ZVal.assign(ZVal.newArray());
            }

            return ZVal.assign(
                    !function_is_array.f.env(env).call(value).getBool()
                            ? ZVal.newArray(new ZPair(0, value))
                            : value);
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
                                    .Arr
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
                            Arr.class,
                            ZVal.toLong(256) | ZVal.toLong(512));
            for (ZPair zpairResult2359 : ZVal.getIterable(methods, env, true)) {
                method = ZVal.assign(zpairResult2359.getValue());
                env.callMethod(method, "setAccessible", Arr.class, true);
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Arr.class)
                        .method("macro")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                toObjectR(method).accessProp(this, env).name("name").value(),
                                env.callMethod(method, "invoke", Arr.class, mixin))
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
                                            .Arr
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
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Arr.class)
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
                                                    .Arr
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
                                                                        .Arr
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
                                                            .Arr
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
                    .setName("Illuminate\\Support\\Arr")
                    .setLookup(
                            Arr.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("macros")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Support/Arr.php")
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
