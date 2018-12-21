package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.HigherOrderCollectionProxy;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_splice;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.ArrayAccess;
import com.runtimeconverter.runtime.nativeInterfaces.IteratorAggregate;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_sum;
import com.runtimeconverter.runtime.nativeClasses.stdClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_key;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Arrayable;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_combine;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.ReadOnlyReferenceContainer;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_reset;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.CachingIterator;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pad;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_intersect;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_krsort;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_intersect_key;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reduce;
import com.runtimeconverter.runtime.nativeFunctions.array.function_asort;
import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_udiff;
import com.runtimeconverter.runtime.nativeFunctions.array.function_ksort;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reverse;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_flip;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Jsonable;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff_ukey;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_search;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff_assoc;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeInterfaces.Traversable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.project.convertedCode.globalNamespace.functions.value;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.project.convertedCode.globalNamespace.functions.data_get;
import com.runtimeconverter.runtime.nativeInterfaces.JsonSerializable;
import com.runtimeconverter.runtime.nativeFunctions.array.function_range;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff_key;
import com.runtimeconverter.runtime.nativeFunctions.array.function_uasort;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Debug.classes.Dumper;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff_uassoc;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_bool;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_num_args;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.ArrayIterator;
import com.runtimeconverter.runtime.nativeFunctions.array.function_arsort;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;
import static com.runtimeconverter.runtime.ZVal.assignParameterVarArgs;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/Collection.php

*/

public class Collection extends RuntimeClassBase
        implements ArrayAccess,
                Arrayable,
                Countable,
                IteratorAggregate,
                Jsonable,
                JsonSerializable {

    public Object items = ZVal.newArray();

    public Collection(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Collection.class) {
            this.__construct(env, args);
        }
    }

    public Collection(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "items", defaultValue = "", defaultValueType = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object items = assignParameter(args, 0, true);
        if (null == items) {
            items = ZVal.newArray();
        }
        this.items = this.getArrayableItems(env, items);
        return null;
    }

    @ConvertedMethod
    public Object all(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.items);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object avg(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object count = null;
        if (ZVal.isTrue(count = this.count(env))) {
            return ZVal.assign(ZVal.divide(this.sum(env, callback), count));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object average(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        return ZVal.assign(this.avg(env, callback));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "key",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object median(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, true);
        if (null == key) {
            key = ZVal.getNull();
        }
        Object middle = null;
        Object values = null;
        Object count = null;
        count = this.count(env);
        if (ZVal.equalityCheck(count, 0)) {
            return null;
        }

        values =
                env.callMethod(
                        env.callMethod(
                                ZVal.isset(key) ? this.pluck(env, key) : this,
                                "sort",
                                Collection.class),
                        "values",
                        Collection.class);
        middle = ZVal.assign(ZVal.toLong(ZVal.divide(count, 2)));
        if (ZVal.isTrue(ZVal.modulus(count, 2))) {
            return ZVal.assign(env.callMethod(values, "get", Collection.class, middle));
        }

        return ZVal.assign(
                env.callMethod(
                        env.createNewWithLateStaticBindings(
                                this,
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                env.callMethod(
                                                        values,
                                                        "get",
                                                        Collection.class,
                                                        ZVal.subtract(middle, 1))),
                                        new ZPair(
                                                1,
                                                env.callMethod(
                                                        values, "get", Collection.class, middle)))),
                        "average",
                        Collection.class));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "key",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object mode(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Support/Collection.php");
        Object key = assignParameter(args, 0, true);
        if (null == key) {
            key = ZVal.getNull();
        }
        Object sorted = null;
        Object counts = null;
        Object count = null;
        Object collection = null;
        Object highestValue = null;
        count = this.count(env);
        if (ZVal.equalityCheck(count, 0)) {
            return null;
        }

        collection = ZVal.assign(ZVal.isset(key) ? this.pluck(env, key) : this);
        counts =
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Illuminate
                        .namespaces
                        .Support
                        .classes
                        .Collection(env);
        env.callMethod(
                collection,
                "each",
                Collection.class,
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Support", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "value")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object value = assignParameter(args, 0, false);
                        ReferenceContainer counts = new BasicReferenceContainer(null);
                        counts = this.contextReferences.getReferenceContainer("counts");
                        counts.arrayAccess(env, value)
                                .set(
                                        arrayActionR(ArrayAction.ISSET, counts, env, value)
                                                ? ZVal.add(counts.arrayGet(env, value), 1)
                                                : 1);
                        return null;
                    }
                }.use("counts", counts));
        sorted = env.callMethod(counts, "sort", Collection.class);
        highestValue = env.callMethod(sorted, "last", Collection.class);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                sorted,
                                                "filter",
                                                Collection.class,
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Illuminate\\Support",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(index = 0, name = "value")
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object value =
                                                                assignParameter(args, 0, false);
                                                        Object highestValue = null;
                                                        highestValue =
                                                                this.contextReferences
                                                                        .getCapturedValue(
                                                                                "highestValue");
                                                        return ZVal.assign(
                                                                ZVal.equalityCheck(
                                                                        value, highestValue));
                                                    }
                                                }.use("highestValue", highestValue)),
                                        "sort",
                                        Collection.class),
                                "keys",
                                Collection.class),
                        "all",
                        Collection.class));
    }

    @ConvertedMethod
    public Object collapse(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this, Arr.runtimeStaticObject.collapse(env, this.items)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "operator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object contains(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object operator = assignParameter(args, 1, true);
        if (null == operator) {
            operator = ZVal.getNull();
        }
        Object value = assignParameter(args, 2, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        Object placeholder = null;
        if (ZVal.strictEqualityCheck(
                function_func_num_args
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call()
                        .value(),
                "===",
                1)) {
            if (ZVal.isTrue(this.useAsCallable(env, key))) {
                placeholder = new stdClass(env);
                return ZVal.assign(
                        ZVal.strictNotEqualityCheck(
                                this.first(env, key, placeholder), "!==", placeholder));
            }

            return ZVal.assign(function_in_array.f.env(env).call(key, this.items).value());
        }

        return ZVal.assign(
                this.contains(
                        env,
                        this.operatorForWhere(
                                env,
                                PackedVaradicArgs.unpack(
                                        new PackedVaradicArgs(
                                                function_func_get_args
                                                        .f
                                                        .env(env)
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithInfo(args, this))
                                                        .call()
                                                        .value())))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object containsStrict(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Support/Collection.php");
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(
                function_func_num_args
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call()
                        .value(),
                "===",
                2)) {
            return ZVal.assign(
                    this.contains(
                            env,
                            new Closure(
                                    env,
                                    runtimeConverterFunctionClassConstants,
                                    "Illuminate\\Support",
                                    this) {
                                @Override
                                @ConvertedMethod
                                @ConvertedParameter(index = 0, name = "item")
                                public Object run(
                                        RuntimeEnv env,
                                        Object thisvar,
                                        PassByReferenceArgs runtimePassByReferenceArgs,
                                        Object... args) {
                                    Object item = assignParameter(args, 0, false);
                                    Object value = null;
                                    Object key = null;
                                    value = this.contextReferences.getCapturedValue("value");
                                    key = this.contextReferences.getCapturedValue("key");
                                    return ZVal.assign(
                                            ZVal.strictEqualityCheck(
                                                    data_get.f.env(env).call(item, key).value(),
                                                    "===",
                                                    value));
                                }
                            }.use("value", value).use("key", key)));
        }

        if (ZVal.isTrue(this.useAsCallable(env, key))) {
            return ZVal.assign(!function_is_null.f.env(env).call(this.first(env, key)).getBool());
        }

        return ZVal.assign(function_in_array.f.env(env).call(key, this.items, true).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "lists")
    public Object crossJoin(RuntimeEnv env, Object... args) {
        Object lists = assignParameterVarArgs(args, 0);
        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this,
                        Arr.runtimeStaticObject.crossJoin(
                                env,
                                PackedVaradicArgs.unpack(
                                        this.items,
                                        new PackedVaradicArgs(
                                                function_array_map
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                ZVal.newArray(
                                                                        new ZPair(0, this),
                                                                        new ZPair(
                                                                                1,
                                                                                "getArrayableItems")),
                                                                lists)
                                                        .value())))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args")
    public Object dd(RuntimeEnv env, Object... args) {
        Object ___args = assignParameterVarArgs(args, 0);
        function_call_user_func_array
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                .call(ZVal.newArray(new ZPair(0, this), new ZPair(1, "dump")), ___args);
        env.exit(1);
        return null;
    }

    @ConvertedMethod
    public Object dump(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Support/Collection.php");
        env.callMethod(
                env.callMethod(
                        env.createNewWithLateStaticBindings(
                                this,
                                function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value()),
                        "push",
                        Collection.class,
                        this),
                "each",
                Collection.class,
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Support", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "item")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object item = assignParameter(args, 0, false);
                        env.callMethod(new Dumper(env), "dump", Collection.class, item);
                        return null;
                    }
                });
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "items")
    public Object diff(RuntimeEnv env, Object... args) {
        Object items = assignParameter(args, 0, false);
        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this,
                        function_array_diff
                                .f
                                .env(env)
                                .call(this.items, this.getArrayableItems(env, items))
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "items")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "callable")
    public Object diffUsing(RuntimeEnv env, Object... args) {
        Object items = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this,
                        function_array_udiff
                                .f
                                .env(env)
                                .call(this.items, this.getArrayableItems(env, items), callback)
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "items")
    public Object diffAssoc(RuntimeEnv env, Object... args) {
        Object items = assignParameter(args, 0, false);
        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this,
                        function_array_diff_assoc
                                .f
                                .env(env)
                                .call(this.items, this.getArrayableItems(env, items))
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "items")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "callable")
    public Object diffAssocUsing(RuntimeEnv env, Object... args) {
        Object items = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this,
                        function_array_diff_uassoc
                                .f
                                .env(env)
                                .call(this.items, this.getArrayableItems(env, items), callback)
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "items")
    public Object diffKeys(RuntimeEnv env, Object... args) {
        Object items = assignParameter(args, 0, false);
        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this,
                        function_array_diff_key
                                .f
                                .env(env)
                                .call(this.items, this.getArrayableItems(env, items))
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "items")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "callable")
    public Object diffKeysUsing(RuntimeEnv env, Object... args) {
        Object items = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this,
                        function_array_diff_ukey
                                .f
                                .env(env)
                                .call(this.items, this.getArrayableItems(env, items), callback)
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "callable")
    public Object each(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object callback = assignParameter(args, 0, false);
        ReferenceContainer item = new BasicReferenceContainer(null);
        ReferenceContainer key = new BasicReferenceContainer(null);
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult558 : ZVal.getIterable(this.items, env, false)) {
            key.setObject(ZVal.assign(zpairResult558.getKey()));
            item.setObject(ZVal.assign(zpairResult558.getValue()));
            if (ZVal.strictEqualityCheck(
                    env.callFunctionDynamic(
                                    callback,
                                    new RuntimeArgsWithReferences().add(0, item).add(1, key),
                                    item.getObject(),
                                    key.getObject())
                            .value(),
                    "===",
                    false)) {
                break;
            }
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "callable")
    public Object eachSpread(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Support/Collection.php");
        Object callback = assignParameter(args, 0, false);
        return ZVal.assign(
                this.each(
                        env,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Support",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "chunk")
                            @ConvertedParameter(index = 1, name = "key")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                ReferenceContainer chunk =
                                        new BasicReferenceContainer(
                                                assignParameter(args, 0, false));
                                Object key = assignParameter(args, 1, false);
                                Object callback = null;
                                callback = this.contextReferences.getCapturedValue("callback");
                                chunk.arrayAppend(env).set(key);
                                return ZVal.assign(
                                        env.callFunctionDynamic(
                                                        callback,
                                                        new RuntimeArgsWithReferences(),
                                                        PackedVaradicArgs.unpack(
                                                                new PackedVaradicArgs(
                                                                        chunk.getObject())))
                                                .value());
                            }
                        }.use("callback", callback)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "operator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object every(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object operator = assignParameter(args, 1, true);
        if (null == operator) {
            operator = ZVal.getNull();
        }
        Object value = assignParameter(args, 2, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        ReferenceContainer v = new BasicReferenceContainer(null);
        Object callback = null;
        ReferenceContainer k = new BasicReferenceContainer(null);
        if (ZVal.strictEqualityCheck(
                function_func_num_args
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call()
                        .value(),
                "===",
                1)) {
            callback = this.valueRetriever(env, key);
            for (ZPair zpairResult559 : ZVal.getIterable(this.items, env, false)) {
                k.setObject(ZVal.assign(zpairResult559.getKey()));
                v.setObject(ZVal.assign(zpairResult559.getValue()));
                if (!env.callFunctionDynamic(
                                callback,
                                new RuntimeArgsWithReferences().add(0, v).add(1, k),
                                v.getObject(),
                                k.getObject())
                        .getBool()) {
                    return ZVal.assign(false);
                }
            }

            return ZVal.assign(true);
        }

        return ZVal.assign(
                this.every(
                        env,
                        this.operatorForWhere(
                                env,
                                PackedVaradicArgs.unpack(
                                        new PackedVaradicArgs(
                                                function_func_get_args
                                                        .f
                                                        .env(env)
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithInfo(args, this))
                                                        .call()
                                                        .value())))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys")
    public Object except(RuntimeEnv env, Object... args) {
        Object keys = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        keys,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Illuminate
                                .namespaces
                                .Support
                                .classes
                                .Collection
                                .class,
                        "Illuminate\\Support\\Collection"))) {
            keys = env.callMethod(keys, "all", Collection.class);

        } else if (!function_is_array.f.env(env).call(keys).getBool()) {
            keys =
                    function_func_get_args
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call()
                            .value();
        }

        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this, Arr.runtimeStaticObject.except(env, this.items, keys)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "callback",
        typeHint = "callable",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object filter(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        if (ZVal.isTrue(callback)) {
            return ZVal.assign(
                    env.createNewWithLateStaticBindings(
                            this, Arr.runtimeStaticObject.where(env, this.items, callback)));
        }

        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this, function_array_filter.f.env(env).call(this.items).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "callable")
    @ConvertedParameter(
        index = 2,
        name = "default",
        typeHint = "callable",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object when(RuntimeEnv env, Object... args) {
        ReferenceContainer value = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object callback = assignParameter(args, 1, false);
        Object _pDefault = assignParameter(args, 2, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        if (ZVal.isTrue(value.getObject())) {
            return ZVal.assign(
                    env.callFunctionDynamic(
                                    callback,
                                    new RuntimeArgsWithReferences()
                                            .add(0, new ReadOnlyReferenceContainer(this))
                                            .add(1, value),
                                    this,
                                    value.getObject())
                            .value());

        } else if (ZVal.isTrue(_pDefault)) {
            return ZVal.assign(
                    env.callFunctionDynamic(
                                    _pDefault,
                                    new RuntimeArgsWithReferences()
                                            .add(0, new ReadOnlyReferenceContainer(this))
                                            .add(1, value),
                                    this,
                                    value.getObject())
                            .value());
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "callable")
    @ConvertedParameter(
        index = 2,
        name = "default",
        typeHint = "callable",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object unless(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        Object _pDefault = assignParameter(args, 2, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        return ZVal.assign(this.when(env, !ZVal.isTrue(value), callback, _pDefault));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "operator")
    @ConvertedParameter(
        index = 2,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object where(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object operator = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        return ZVal.assign(
                this.filter(
                        env,
                        this.operatorForWhere(
                                env,
                                PackedVaradicArgs.unpack(
                                        new PackedVaradicArgs(
                                                function_func_get_args
                                                        .f
                                                        .env(env)
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithInfo(args, this))
                                                        .call()
                                                        .value())))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "operator")
    @ConvertedParameter(
        index = 2,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object operatorForWhere(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Support/Collection.php");
        Object key = assignParameter(args, 0, false);
        Object operator = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(
                function_func_num_args
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call()
                        .value(),
                "===",
                2)) {
            value = ZVal.assign(operator);
            operator = "=";
        }

        return ZVal.assign(
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Support", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "item")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ContextConstants runtimeConverterFunctionClassConstants =
                                new ContextConstants()
                                        .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                                        .setFile(
                                                "/vendor/laravel/framework/src/Illuminate/Support/Collection.php");
                        Object item = assignParameter(args, 0, false);
                        Object strings = null;
                        Object retrieved = null;
                        Object value = null;
                        Object key = null;
                        Object operator = null;
                        value = this.contextReferences.getCapturedValue("value");
                        key = this.contextReferences.getCapturedValue("key");
                        operator = this.contextReferences.getCapturedValue("operator");
                        retrieved = data_get.f.env(env).call(item, key).value();
                        strings =
                                function_array_filter
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.newArray(
                                                        new ZPair(0, retrieved),
                                                        new ZPair(1, value)),
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Illuminate\\Support",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(index = 0, name = "value")
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object value =
                                                                assignParameter(args, 0, false);
                                                        return ZVal.assign(
                                                                ZVal.toBool(
                                                                                function_is_string
                                                                                        .f
                                                                                        .env(env)
                                                                                        .call(value)
                                                                                        .value())
                                                                        || ZVal.toBool(
                                                                                ZVal.toBool(
                                                                                                function_is_object
                                                                                                        .f
                                                                                                        .env(
                                                                                                                env)
                                                                                                        .call(
                                                                                                                value)
                                                                                                        .value())
                                                                                        && ZVal
                                                                                                .toBool(
                                                                                                        function_method_exists
                                                                                                                .f
                                                                                                                .env(
                                                                                                                        env)
                                                                                                                .call(
                                                                                                                        value,
                                                                                                                        "__toString")
                                                                                                                .value())));
                                                    }
                                                })
                                        .value();
                        if (ZVal.toBool(
                                        ZVal.isLessThan(
                                                function_count.f.env(env).call(strings).value(),
                                                '<',
                                                2))
                                && ZVal.toBool(
                                        ZVal.equalityCheck(
                                                function_count
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                function_array_filter
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                ZVal.newArray(
                                                                                        new ZPair(
                                                                                                0,
                                                                                                retrieved),
                                                                                        new ZPair(
                                                                                                1,
                                                                                                value)),
                                                                                "is_object")
                                                                        .value())
                                                        .value(),
                                                1))) {
                            return ZVal.assign(
                                    function_in_array
                                            .f
                                            .env(env)
                                            .call(operator, ZVal.arrayFromList("!=", "<>", "!=="))
                                            .value());
                        }

                        SwitchEnumType29 switchVariable29 =
                                ZVal.getEnum(
                                        operator,
                                        SwitchEnumType29.DEFAULT_CASE,
                                        SwitchEnumType29.RESERVED_CHARS_1938861821_STRING__,
                                        "=",
                                        SwitchEnumType29.RESERVED_CHARS_1016112711_STRING___,
                                        "==",
                                        SwitchEnumType29.RESERVED_CHARS_1752664879_STRING___,
                                        "!=",
                                        SwitchEnumType29.RESERVED_CHARS_318179937_STRING___,
                                        "<>",
                                        SwitchEnumType29.RESERVED_CHARS_1048872619_STRING__,
                                        "<",
                                        SwitchEnumType29.RESERVED_CHARS_1060371169_STRING__,
                                        ">",
                                        SwitchEnumType29.RESERVED_CHARS_1963571830_STRING___,
                                        "<=",
                                        SwitchEnumType29.RESERVED_CHARS_1586013422_STRING___,
                                        ">=",
                                        SwitchEnumType29.RESERVED_CHARS_1584217721_STRING____,
                                        "===",
                                        SwitchEnumType29.RESERVED_CHARS_1808332228_STRING____,
                                        "!==");
                        switch (switchVariable29) {
                            case DEFAULT_CASE:
                            case RESERVED_CHARS_1938861821_STRING__:
                            case RESERVED_CHARS_1016112711_STRING___:
                                return ZVal.assign(ZVal.equalityCheck(retrieved, value));
                            case RESERVED_CHARS_1752664879_STRING___:
                            case RESERVED_CHARS_318179937_STRING___:
                                return ZVal.assign(ZVal.notEqualityCheck(retrieved, value));
                            case RESERVED_CHARS_1048872619_STRING__:
                                return ZVal.assign(ZVal.isLessThan(retrieved, '<', value));
                            case RESERVED_CHARS_1060371169_STRING__:
                                return ZVal.assign(ZVal.isGreaterThan(retrieved, '>', value));
                            case RESERVED_CHARS_1963571830_STRING___:
                                return ZVal.assign(
                                        ZVal.isLessThanOrEqualTo(retrieved, "<=", value));
                            case RESERVED_CHARS_1586013422_STRING___:
                                return ZVal.assign(
                                        ZVal.isGreaterThanOrEqualTo(retrieved, ">=", value));
                            case RESERVED_CHARS_1584217721_STRING____:
                                return ZVal.assign(
                                        ZVal.strictEqualityCheck(retrieved, "===", value));
                            case RESERVED_CHARS_1808332228_STRING____:
                                return ZVal.assign(
                                        ZVal.strictNotEqualityCheck(retrieved, "!==", value));
                        }
                        ;
                        return null;
                    }
                }.use("value", value).use("key", key).use("operator", operator));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object whereStrict(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(this.where(env, key, "===", value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "values")
    @ConvertedParameter(
        index = 2,
        name = "strict",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object whereIn(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Support/Collection.php");
        Object key = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, false);
        Object strict = assignParameter(args, 2, true);
        if (null == strict) {
            strict = false;
        }
        values = this.getArrayableItems(env, values);
        return ZVal.assign(
                this.filter(
                        env,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Support",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "item")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object item = assignParameter(args, 0, false);
                                Object values = null;
                                Object strict = null;
                                Object key = null;
                                values = this.contextReferences.getCapturedValue("values");
                                strict = this.contextReferences.getCapturedValue("strict");
                                key = this.contextReferences.getCapturedValue("key");
                                return ZVal.assign(
                                        function_in_array
                                                .f
                                                .env(env)
                                                .call(
                                                        data_get.f.env(env).call(item, key).value(),
                                                        values,
                                                        strict)
                                                .value());
                            }
                        }.use("values", values).use("strict", strict).use("key", key)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "values")
    public Object whereInStrict(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, false);
        return ZVal.assign(this.whereIn(env, key, values, true));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "values")
    @ConvertedParameter(
        index = 2,
        name = "strict",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object whereNotIn(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Support/Collection.php");
        Object key = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, false);
        Object strict = assignParameter(args, 2, true);
        if (null == strict) {
            strict = false;
        }
        values = this.getArrayableItems(env, values);
        return ZVal.assign(
                this.reject(
                        env,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Support",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "item")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object item = assignParameter(args, 0, false);
                                Object values = null;
                                Object strict = null;
                                Object key = null;
                                values = this.contextReferences.getCapturedValue("values");
                                strict = this.contextReferences.getCapturedValue("strict");
                                key = this.contextReferences.getCapturedValue("key");
                                return ZVal.assign(
                                        function_in_array
                                                .f
                                                .env(env)
                                                .call(
                                                        data_get.f.env(env).call(item, key).value(),
                                                        values,
                                                        strict)
                                                .value());
                            }
                        }.use("values", values).use("strict", strict).use("key", key)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "values")
    public Object whereNotInStrict(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, false);
        return ZVal.assign(this.whereNotIn(env, key, values, true));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    public Object whereInstanceOf(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Support/Collection.php");
        Object type = assignParameter(args, 0, false);
        return ZVal.assign(
                this.filter(
                        env,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Support",
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
                                Object type = null;
                                type = this.contextReferences.getCapturedValue("type");
                                return ZVal.assign(ZVal.checkInstanceTypeMatch(value, type));
                            }
                        }.use("type", type)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "callback",
        typeHint = "callable",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object first(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        return ZVal.assign(Arr.runtimeStaticObject.first(env, this.items, callback, _pDefault));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "operator")
    @ConvertedParameter(
        index = 2,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object firstWhere(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object operator = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        return ZVal.assign(
                this.first(
                        env,
                        this.operatorForWhere(
                                env,
                                PackedVaradicArgs.unpack(
                                        new PackedVaradicArgs(
                                                function_func_get_args
                                                        .f
                                                        .env(env)
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithInfo(args, this))
                                                        .call()
                                                        .value())))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "depth")
    public Object flatten(RuntimeEnv env, Object... args) {
        Object depth = assignParameter(args, 0, true);
        if (null == depth) {
            depth = function_constant.get(env, "INF");
        }
        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this, Arr.runtimeStaticObject.flatten(env, this.items, depth)));
    }

    @ConvertedMethod
    public Object flip(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this, function_array_flip.f.env(env).call(this.items).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys")
    public Object forget(RuntimeEnv env, Object... args) {
        Object keys = assignParameter(args, 0, false);
        Object key = null;
        for (ZPair zpairResult560 : ZVal.getIterable(rToArrayCast(keys), env, true)) {
            key = ZVal.assign(zpairResult560.getValue());
            this.offsetUnset(env, key);
        }

        return ZVal.assign(this);
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
        if (ZVal.isTrue(this.offsetExists(env, key))) {
            return ZVal.assign(new ReferenceClassProperty(this, "items", env).arrayGet(env, key));
        }

        return ZVal.assign(value.f.env(env).call(_pDefault).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "groupBy")
    @ConvertedParameter(
        index = 1,
        name = "preserveKeys",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object groupBy(RuntimeEnv env, Object... args) {
        Object groupBy = assignParameter(args, 0, false);
        Object preserveKeys = assignParameter(args, 1, true);
        if (null == preserveKeys) {
            preserveKeys = false;
        }
        Object result = null;
        Object groupKeys = null;
        Object nextGroups = null;
        ReferenceContainer results = new BasicReferenceContainer(null);
        ReferenceContainer value = new BasicReferenceContainer(null);
        ReferenceContainer key = new BasicReferenceContainer(null);
        Object groupKey = null;
        if (function_is_array.f.env(env).call(groupBy).getBool()) {
            nextGroups = ZVal.assign(groupBy);
            groupBy = function_array_shift.f.env(env).call(nextGroups).value();
        }

        groupBy = this.valueRetriever(env, groupBy);
        results.setObject(ZVal.newArray());
        for (ZPair zpairResult561 : ZVal.getIterable(this.items, env, false)) {
            key.setObject(ZVal.assign(zpairResult561.getKey()));
            value.setObject(ZVal.assign(zpairResult561.getValue()));
            groupKeys =
                    env.callFunctionDynamic(
                                    groupBy,
                                    new RuntimeArgsWithReferences().add(0, value).add(1, key),
                                    value.getObject(),
                                    key.getObject())
                            .value();
            if (!function_is_array.f.env(env).call(groupKeys).getBool()) {
                groupKeys = ZVal.newArray(new ZPair(0, groupKeys));
            }

            for (ZPair zpairResult562 : ZVal.getIterable(groupKeys, env, true)) {
                groupKey = ZVal.assign(zpairResult562.getValue());
                groupKey =
                        ZVal.assign(
                                function_is_bool.f.env(env).call(groupKey).getBool()
                                        ? ZVal.toLong(groupKey)
                                        : groupKey);
                if (!function_array_key_exists
                        .f
                        .env(env)
                        .call(groupKey, results.getObject())
                        .getBool()) {
                    results.arrayAccess(env, groupKey)
                            .set(env.createNewWithLateStaticBindings(this));
                }

                env.callMethod(
                        results.arrayGet(env, groupKey),
                        "offsetSet",
                        Collection.class,
                        ZVal.isTrue(preserveKeys) ? key.getObject() : ZVal.getNull(),
                        value.getObject());
            }
        }

        result = env.createNewWithLateStaticBindings(this, results.getObject());
        if (!ZVal.isEmpty(nextGroups)) {
            return ZVal.assign(
                    env.callMethod(
                            toObjectR(result).accessProp(this, env).name("map").value(),
                            "groupBy",
                            Collection.class,
                            nextGroups,
                            preserveKeys));
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keyBy")
    public Object keyBy(RuntimeEnv env, Object... args) {
        Object keyBy = assignParameter(args, 0, false);
        ReferenceContainer item = new BasicReferenceContainer(null);
        Object resolvedKey = null;
        ReferenceContainer results = new BasicReferenceContainer(null);
        ReferenceContainer key = new BasicReferenceContainer(null);
        keyBy = this.valueRetriever(env, keyBy);
        results.setObject(ZVal.newArray());
        for (ZPair zpairResult563 : ZVal.getIterable(this.items, env, false)) {
            key.setObject(ZVal.assign(zpairResult563.getKey()));
            item.setObject(ZVal.assign(zpairResult563.getValue()));
            resolvedKey =
                    env.callFunctionDynamic(
                                    keyBy,
                                    new RuntimeArgsWithReferences().add(0, item).add(1, key),
                                    item.getObject(),
                                    key.getObject())
                            .value();
            if (function_is_object.f.env(env).call(resolvedKey).getBool()) {
                resolvedKey = ZVal.assign(toStringR(resolvedKey, env));
            }

            results.arrayAccess(env, resolvedKey).set(item.getObject());
        }

        return ZVal.assign(env.createNewWithLateStaticBindings(this, results.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object has(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object keys = null;
        Object value = null;
        keys =
                ZVal.assign(
                        function_is_array.f.env(env).call(key).getBool()
                                ? key
                                : function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value());
        for (ZPair zpairResult564 : ZVal.getIterable(keys, env, true)) {
            value = ZVal.assign(zpairResult564.getValue());
            if (!ZVal.isTrue(this.offsetExists(env, value))) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(
        index = 1,
        name = "glue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object implode(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object glue = assignParameter(args, 1, true);
        if (null == glue) {
            glue = ZVal.getNull();
        }
        Object first = null;
        first = this.first(env);
        if (ZVal.toBool(function_is_array.f.env(env).call(first).value())
                || ZVal.toBool(function_is_object.f.env(env).call(first).value())) {
            return ZVal.assign(
                    NamespaceGlobal.implode
                            .env(env)
                            .call(
                                    glue,
                                    env.callMethod(this.pluck(env, value), "all", Collection.class))
                            .value());
        }

        return ZVal.assign(NamespaceGlobal.implode.env(env).call(value, this.items).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "items")
    public Object intersect(RuntimeEnv env, Object... args) {
        Object items = assignParameter(args, 0, false);
        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this,
                        function_array_intersect
                                .f
                                .env(env)
                                .call(this.items, this.getArrayableItems(env, items))
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "items")
    public Object intersectByKeys(RuntimeEnv env, Object... args) {
        Object items = assignParameter(args, 0, false);
        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this,
                        function_array_intersect_key
                                .f
                                .env(env)
                                .call(this.items, this.getArrayableItems(env, items))
                                .value()));
    }

    @ConvertedMethod
    public Object isEmpty(RuntimeEnv env, Object... args) {
        return ZVal.isEmpty(this.items);
    }

    @ConvertedMethod
    public Object isNotEmpty(RuntimeEnv env, Object... args) {
        return ZVal.assign(!ZVal.isTrue(this.isEmpty(env)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object useAsCallable(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(!function_is_string.f.env(env).call(value).getBool())
                        && ZVal.toBool(function_is_callable.f.env(env).call(value).value()));
    }

    @ConvertedMethod
    public Object keys(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this, function_array_keys.f.env(env).call(this.items).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "callback",
        typeHint = "callable",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object last(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        return ZVal.assign(Arr.runtimeStaticObject.last(env, this.items, callback, _pDefault));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(
        index = 1,
        name = "key",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object pluck(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object key = assignParameter(args, 1, true);
        if (null == key) {
            key = ZVal.getNull();
        }
        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this, Arr.runtimeStaticObject.pluck(env, this.items, value, key)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "callable")
    public Object map(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        Object keys = null;
        Object items = null;
        keys = function_array_keys.f.env(env).call(this.items).value();
        items = function_array_map.f.env(env).call(callback, this.items, keys).value();
        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this, function_array_combine.f.env(env).call(keys, items).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "callable")
    public Object mapSpread(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Support/Collection.php");
        Object callback = assignParameter(args, 0, false);
        return ZVal.assign(
                this.map(
                        env,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Support",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "chunk")
                            @ConvertedParameter(index = 1, name = "key")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                ReferenceContainer chunk =
                                        new BasicReferenceContainer(
                                                assignParameter(args, 0, false));
                                Object key = assignParameter(args, 1, false);
                                Object callback = null;
                                callback = this.contextReferences.getCapturedValue("callback");
                                chunk.arrayAppend(env).set(key);
                                return ZVal.assign(
                                        env.callFunctionDynamic(
                                                        callback,
                                                        new RuntimeArgsWithReferences(),
                                                        PackedVaradicArgs.unpack(
                                                                new PackedVaradicArgs(
                                                                        chunk.getObject())))
                                                .value());
                            }
                        }.use("callback", callback)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "callable")
    public Object mapToDictionary(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        ReferenceContainer item = new BasicReferenceContainer(null);
        ReferenceContainer dictionary = new BasicReferenceContainer(null);
        Object value = null;
        Object pair = null;
        ReferenceContainer key = new BasicReferenceContainer(null);
        dictionary.setObject(ZVal.newArray());
        for (ZPair zpairResult565 : ZVal.getIterable(this.items, env, false)) {
            key.setObject(ZVal.assign(zpairResult565.getKey()));
            item.setObject(ZVal.assign(zpairResult565.getValue()));
            pair =
                    env.callFunctionDynamic(
                                    callback,
                                    new RuntimeArgsWithReferences().add(0, item).add(1, key),
                                    item.getObject(),
                                    key.getObject())
                            .value();
            key.setObject(function_key.f.env(env).call(pair).value());
            value = function_reset.f.env(env).call(pair).value();
            if (!arrayActionR(ArrayAction.ISSET, dictionary, env, key.getObject())) {
                dictionary.arrayAccess(env, key.getObject()).set(ZVal.newArray());
            }

            dictionary.arrayAppend(env, key.getObject()).set(value);
        }

        return ZVal.assign(env.createNewWithLateStaticBindings(this, dictionary.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "callable")
    public Object mapToGroups(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        Object groups = null;
        groups = this.mapToDictionary(env, callback);
        return ZVal.assign(
                env.callMethod(
                        groups,
                        "map",
                        Collection.class,
                        ZVal.newArray(new ZPair(0, this), new ZPair(1, "make"))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "callable")
    public Object mapWithKeys(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        ReferenceContainer result = new BasicReferenceContainer(null);
        Object mapValue = null;
        Object mapKey = null;
        Object assoc = null;
        ReferenceContainer value = new BasicReferenceContainer(null);
        ReferenceContainer key = new BasicReferenceContainer(null);
        result.setObject(ZVal.newArray());
        for (ZPair zpairResult566 : ZVal.getIterable(this.items, env, false)) {
            key.setObject(ZVal.assign(zpairResult566.getKey()));
            value.setObject(ZVal.assign(zpairResult566.getValue()));
            assoc =
                    env.callFunctionDynamic(
                                    callback,
                                    new RuntimeArgsWithReferences().add(0, value).add(1, key),
                                    value.getObject(),
                                    key.getObject())
                            .value();
            for (ZPair zpairResult567 : ZVal.getIterable(assoc, env, false)) {
                mapKey = ZVal.assign(zpairResult567.getKey());
                mapValue = ZVal.assign(zpairResult567.getValue());
                result.arrayAccess(env, mapKey).set(mapValue);
            }
        }

        return ZVal.assign(env.createNewWithLateStaticBindings(this, result.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "callable")
    public Object flatMap(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this.map(env, callback), "collapse", Collection.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    public Object mapInto(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Support/Collection.php");
        Object _pClass = assignParameter(args, 0, false);
        return ZVal.assign(
                this.map(
                        env,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Support",
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
                                Object _pClass = null;
                                _pClass = this.contextReferences.getCapturedValue("class");
                                return ZVal.assign(env.createNew(_pClass, value, key));
                            }
                        }.use("class", _pClass)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object max(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Support/Collection.php");
        Object callback = assignParameter(args, 0, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        callback = this.valueRetriever(env, callback);
        return ZVal.assign(
                env.callMethod(
                        this.filter(
                                env,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Support",
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
                                        return ZVal.assign(
                                                !function_is_null.f.env(env).call(value).getBool());
                                    }
                                }),
                        "reduce",
                        Collection.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Support",
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
                                Object result = assignParameter(args, 0, false);
                                ReferenceContainer item =
                                        new BasicReferenceContainer(
                                                assignParameter(args, 1, false));
                                Object callback = null;
                                Object value = null;
                                callback = this.contextReferences.getCapturedValue("callback");
                                value =
                                        env.callFunctionDynamic(
                                                        callback,
                                                        new RuntimeArgsWithReferences()
                                                                .add(0, item),
                                                        item.getObject())
                                                .value();
                                return ZVal.assign(
                                        ZVal.toBool(
                                                                function_is_null
                                                                        .f
                                                                        .env(env)
                                                                        .call(result)
                                                                        .value())
                                                        || ZVal.toBool(
                                                                ZVal.isGreaterThan(
                                                                        value, '>', result))
                                                ? value
                                                : result);
                            }
                        }.use("callback", callback)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "items")
    public Object merge(RuntimeEnv env, Object... args) {
        Object items = assignParameter(args, 0, false);
        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this,
                        function_array_merge
                                .f
                                .env(env)
                                .call(this.items, this.getArrayableItems(env, items))
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values")
    public Object combine(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, false);
        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this,
                        function_array_combine
                                .f
                                .env(env)
                                .call(this.all(env), this.getArrayableItems(env, values))
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "items")
    public Object union(RuntimeEnv env, Object... args) {
        Object items = assignParameter(args, 0, false);
        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this, ZVal.add(this.items, this.getArrayableItems(env, items))));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object min(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Support/Collection.php");
        Object callback = assignParameter(args, 0, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        callback = this.valueRetriever(env, callback);
        return ZVal.assign(
                env.callMethod(
                        this.filter(
                                env,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Support",
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
                                        return ZVal.assign(
                                                !function_is_null.f.env(env).call(value).getBool());
                                    }
                                }),
                        "reduce",
                        Collection.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Support",
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
                                Object result = assignParameter(args, 0, false);
                                ReferenceContainer item =
                                        new BasicReferenceContainer(
                                                assignParameter(args, 1, false));
                                Object callback = null;
                                Object value = null;
                                callback = this.contextReferences.getCapturedValue("callback");
                                value =
                                        env.callFunctionDynamic(
                                                        callback,
                                                        new RuntimeArgsWithReferences()
                                                                .add(0, item),
                                                        item.getObject())
                                                .value();
                                return ZVal.assign(
                                        ZVal.toBool(
                                                                function_is_null
                                                                        .f
                                                                        .env(env)
                                                                        .call(result)
                                                                        .value())
                                                        || ZVal.toBool(
                                                                ZVal.isLessThan(value, '<', result))
                                                ? value
                                                : result);
                            }
                        }.use("callback", callback)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "step")
    @ConvertedParameter(index = 1, name = "offset", defaultValue = "0", defaultValueType = "number")
    public Object nth(RuntimeEnv env, Object... args) {
        Object step = assignParameter(args, 0, false);
        Object offset = assignParameter(args, 1, true);
        if (null == offset) {
            offset = 0;
        }
        ReferenceContainer _pNew = new BasicReferenceContainer(null);
        Object item = null;
        ReferenceContainer position = new BasicReferenceContainer(null);
        _pNew.setObject(ZVal.newArray());
        position.setObject(0);
        for (ZPair zpairResult568 : ZVal.getIterable(this.items, env, true)) {
            item = ZVal.assign(zpairResult568.getValue());
            if (ZVal.strictEqualityCheck(ZVal.modulus(position.getObject(), step), "===", offset)) {
                _pNew.arrayAppend(env).set(item);
            }

            position.setObject(ZVal.increment(position.getObject()));
        }

        return ZVal.assign(env.createNewWithLateStaticBindings(this, _pNew.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys")
    public Object only(RuntimeEnv env, Object... args) {
        Object keys = assignParameter(args, 0, false);
        if (function_is_null.f.env(env).call(keys).getBool()) {
            return ZVal.assign(env.createNewWithLateStaticBindings(this, this.items));
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        keys,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Illuminate
                                .namespaces
                                .Support
                                .classes
                                .Collection
                                .class,
                        "Illuminate\\Support\\Collection"))) {
            keys = env.callMethod(keys, "all", Collection.class);
        }

        keys =
                ZVal.assign(
                        function_is_array.f.env(env).call(keys).getBool()
                                ? keys
                                : function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value());
        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this, Arr.runtimeStaticObject.only(env, this.items, keys)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "page")
    @ConvertedParameter(index = 1, name = "perPage")
    public Object forPage(RuntimeEnv env, Object... args) {
        Object page = assignParameter(args, 0, false);
        Object perPage = assignParameter(args, 1, false);
        Object offset = null;
        offset =
                NamespaceGlobal.max
                        .env(env)
                        .call(0, ZVal.multiply(ZVal.subtract(page, 1), perPage))
                        .value();
        return ZVal.assign(this.slice(env, offset, perPage));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "operator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object partition(RuntimeEnv env, Object... args) {
        ReferenceContainer key = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object operator = assignParameter(args, 1, true);
        if (null == operator) {
            operator = ZVal.getNull();
        }
        Object value = assignParameter(args, 2, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        ReferenceContainer partitions = new BasicReferenceContainer(null);
        ReferenceContainer item = new BasicReferenceContainer(null);
        Object callback = null;
        partitions.setObject(
                ZVal.newArray(
                        new ZPair(0, env.createNewWithLateStaticBindings(this)),
                        new ZPair(1, env.createNewWithLateStaticBindings(this))));
        callback =
                ZVal.assign(
                        ZVal.strictEqualityCheck(
                                        function_func_num_args
                                                .f
                                                .env(env)
                                                .addReferenceArgs(
                                                        new RuntimeArgsWithInfo(args, this))
                                                .call()
                                                .value(),
                                        "===",
                                        1)
                                ? this.valueRetriever(env, key.getObject())
                                : this.operatorForWhere(
                                        env,
                                        PackedVaradicArgs.unpack(
                                                new PackedVaradicArgs(
                                                        function_func_get_args
                                                                .f
                                                                .env(env)
                                                                .addReferenceArgs(
                                                                        new RuntimeArgsWithInfo(
                                                                                args, this))
                                                                .call()
                                                                .value()))));
        for (ZPair zpairResult569 : ZVal.getIterable(this.items, env, false)) {
            key.setObject(ZVal.assign(zpairResult569.getKey()));
            item.setObject(ZVal.assign(zpairResult569.getValue()));
            partitions
                    .arrayAccess(
                            env,
                            ZVal.toLong(
                                    !env.callFunctionDynamic(
                                                    callback,
                                                    new RuntimeArgsWithReferences()
                                                            .add(0, item)
                                                            .add(1, key),
                                                    item.getObject(),
                                                    key.getObject())
                                            .getBool()),
                            key.getObject())
                    .set(item.getObject());
        }

        return ZVal.assign(env.createNewWithLateStaticBindings(this, partitions.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "callable")
    public Object pipe(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callFunctionDynamic(
                                callback,
                                new RuntimeArgsWithReferences()
                                        .add(0, new ReadOnlyReferenceContainer(this)),
                                this)
                        .value());
    }

    @ConvertedMethod
    public Object pop(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_array_pop.f.env(env).call(this.items).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(
        index = 1,
        name = "key",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object prepend(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object key = assignParameter(args, 1, true);
        if (null == key) {
            key = ZVal.getNull();
        }
        this.items = Arr.runtimeStaticObject.prepend(env, this.items, value, key);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object push(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        this.offsetSet(env, ZVal.getNull(), value);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "source")
    public Object concat(RuntimeEnv env, Object... args) {
        Object source = assignParameter(args, 0, false);
        Object result = null;
        Object item = null;
        result = env.createNewWithLateStaticBindings(this, this);
        for (ZPair zpairResult570 : ZVal.getIterable(source, env, true)) {
            item = ZVal.assign(zpairResult570.getValue());
            env.callMethod(result, "push", Collection.class, item);
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object pull(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        return ZVal.assign(
                Arr.runtimeStaticObject.pull(
                        env,
                        new RuntimeArgsWithReferences()
                                .add(0, new ReferenceClassProperty(this, "items", env)),
                        this.items,
                        key,
                        _pDefault));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object put(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        this.offsetSet(env, key, value);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "number",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object random(RuntimeEnv env, Object... args) {
        Object number = assignParameter(args, 0, true);
        if (null == number) {
            number = ZVal.getNull();
        }
        if (function_is_null.f.env(env).call(number).getBool()) {
            return ZVal.assign(Arr.runtimeStaticObject.random(env, this.items));
        }

        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this, Arr.runtimeStaticObject.random(env, this.items, number)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "callable")
    @ConvertedParameter(
        index = 1,
        name = "initial",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object reduce(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        Object initial = assignParameter(args, 1, true);
        if (null == initial) {
            initial = ZVal.getNull();
        }
        return ZVal.assign(
                function_array_reduce.f.env(env).call(this.items, callback, initial).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    public Object reject(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Support/Collection.php");
        Object callback = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.useAsCallable(env, callback))) {
            return ZVal.assign(
                    this.filter(
                            env,
                            new Closure(
                                    env,
                                    runtimeConverterFunctionClassConstants,
                                    "Illuminate\\Support",
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
                                    ReferenceContainer value =
                                            new BasicReferenceContainer(
                                                    assignParameter(args, 0, false));
                                    ReferenceContainer key =
                                            new BasicReferenceContainer(
                                                    assignParameter(args, 1, false));
                                    Object callback = null;
                                    callback = this.contextReferences.getCapturedValue("callback");
                                    return ZVal.assign(
                                            !env.callFunctionDynamic(
                                                            callback,
                                                            new RuntimeArgsWithReferences()
                                                                    .add(0, value)
                                                                    .add(1, key),
                                                            value.getObject(),
                                                            key.getObject())
                                                    .getBool());
                                }
                            }.use("callback", callback)));
        }

        return ZVal.assign(
                this.filter(
                        env,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Support",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "item")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object item = assignParameter(args, 0, false);
                                Object callback = null;
                                callback = this.contextReferences.getCapturedValue("callback");
                                return ZVal.assign(ZVal.notEqualityCheck(item, callback));
                            }
                        }.use("callback", callback)));
    }

    @ConvertedMethod
    public Object reverse(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this, function_array_reverse.f.env(env).call(this.items, true).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(
        index = 1,
        name = "strict",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object search(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object strict = assignParameter(args, 1, true);
        if (null == strict) {
            strict = false;
        }
        Object item = null;
        Object key = null;
        if (!ZVal.isTrue(this.useAsCallable(env, value))) {
            return ZVal.assign(
                    function_array_search.f.env(env).call(value, this.items, strict).value());
        }

        for (ZPair zpairResult571 : ZVal.getIterable(this.items, env, false)) {
            key = ZVal.assign(zpairResult571.getKey());
            item = ZVal.assign(zpairResult571.getValue());
            if (function_call_user_func
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                    .call(value, item, key)
                    .getBool()) {
                return ZVal.assign(key);
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object shift(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_array_shift.f.env(env).call(this.items).value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "seed",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object shuffle(RuntimeEnv env, Object... args) {
        Object seed = assignParameter(args, 0, true);
        if (null == seed) {
            seed = ZVal.getNull();
        }
        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this, Arr.runtimeStaticObject.shuffle(env, this.items, seed)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    @ConvertedParameter(
        index = 1,
        name = "length",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object slice(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        Object length = assignParameter(args, 1, true);
        if (null == length) {
            length = ZVal.getNull();
        }
        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this,
                        function_array_slice
                                .f
                                .env(env)
                                .call(this.items, offset, length, true)
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "numberOfGroups")
    public Object split(RuntimeEnv env, Object... args) {
        Object numberOfGroups = assignParameter(args, 0, false);
        Object groupSize = null;
        if (ZVal.isTrue(this.isEmpty(env))) {
            return ZVal.assign(env.createNewWithLateStaticBindings(this));
        }

        groupSize =
                NamespaceGlobal.ceil
                        .env(env)
                        .call(ZVal.divide(this.count(env), numberOfGroups))
                        .value();
        return ZVal.assign(this.chunk(env, groupSize));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "size")
    public Object chunk(RuntimeEnv env, Object... args) {
        Object size = assignParameter(args, 0, false);
        ReferenceContainer chunks = new BasicReferenceContainer(null);
        Object chunk = null;
        if (ZVal.isLessThanOrEqualTo(size, "<=", 0)) {
            return ZVal.assign(env.createNewWithLateStaticBindings(this));
        }

        chunks.setObject(ZVal.newArray());
        for (ZPair zpairResult572 :
                ZVal.getIterable(
                        NamespaceGlobal.array_chunk.env(env).call(this.items, size, true).value(),
                        env,
                        true)) {
            chunk = ZVal.assign(zpairResult572.getValue());
            chunks.arrayAppend(env).set(env.createNewWithLateStaticBindings(this, chunk));
        }

        return ZVal.assign(env.createNewWithLateStaticBindings(this, chunks.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "callback",
        typeHint = "callable",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object sort(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object items = null;
        items = ZVal.assign(this.items);
        ZVal.ternaryExpression(
                ZVal.isTrue(callback)
                        ? function_uasort.f.env(env).call(items, callback).value()
                        : function_asort.f.env(env).call(items).value());
        return ZVal.assign(env.createNewWithLateStaticBindings(this, items));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    @ConvertedParameter(index = 1, name = "options")
    @ConvertedParameter(
        index = 2,
        name = "descending",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object sortBy(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        Object options = assignParameter(args, 1, true);
        if (null == options) {
            options = 0;
        }
        Object descending = assignParameter(args, 2, true);
        if (null == descending) {
            descending = false;
        }
        ReferenceContainer results = new BasicReferenceContainer(null);
        ReferenceContainer value = new BasicReferenceContainer(null);
        ReferenceContainer key = new BasicReferenceContainer(null);
        results.setObject(ZVal.newArray());
        callback = this.valueRetriever(env, callback);
        for (ZPair zpairResult573 : ZVal.getIterable(this.items, env, false)) {
            key.setObject(ZVal.assign(zpairResult573.getKey()));
            value.setObject(ZVal.assign(zpairResult573.getValue()));
            results.arrayAccess(env, key.getObject())
                    .set(
                            env.callFunctionDynamic(
                                            callback,
                                            new RuntimeArgsWithReferences()
                                                    .add(0, value)
                                                    .add(1, key),
                                            value.getObject(),
                                            key.getObject())
                                    .value());
        }

        ZVal.ternaryExpression(
                ZVal.isTrue(descending)
                        ? function_arsort.f.env(env).call(results.getObject(), options).value()
                        : function_asort.f.env(env).call(results.getObject(), options).value());
        for (ZPair zpairResult574 :
                ZVal.getIterable(
                        function_array_keys.f.env(env).call(results.getObject()).value(),
                        env,
                        true)) {
            key.setObject(ZVal.assign(zpairResult574.getValue()));
            results.arrayAccess(env, key.getObject())
                    .set(
                            new ReferenceClassProperty(this, "items", env)
                                    .arrayGet(env, key.getObject()));
        }

        return ZVal.assign(env.createNewWithLateStaticBindings(this, results.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    @ConvertedParameter(index = 1, name = "options")
    public Object sortByDesc(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        Object options = assignParameter(args, 1, true);
        if (null == options) {
            options = 0;
        }
        return ZVal.assign(this.sortBy(env, callback, options, true));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options")
    @ConvertedParameter(
        index = 1,
        name = "descending",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object sortKeys(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, true);
        if (null == options) {
            options = 0;
        }
        Object descending = assignParameter(args, 1, true);
        if (null == descending) {
            descending = false;
        }
        Object items = null;
        items = ZVal.assign(this.items);
        ZVal.ternaryExpression(
                ZVal.isTrue(descending)
                        ? function_krsort.f.env(env).call(items, options).value()
                        : function_ksort.f.env(env).call(items, options).value());
        return ZVal.assign(env.createNewWithLateStaticBindings(this, items));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options")
    public Object sortKeysDesc(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, true);
        if (null == options) {
            options = 0;
        }
        return ZVal.assign(this.sortKeys(env, options, true));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    @ConvertedParameter(
        index = 1,
        name = "length",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "replacement",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object splice(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        Object length = assignParameter(args, 1, true);
        if (null == length) {
            length = ZVal.getNull();
        }
        Object replacement = assignParameter(args, 2, true);
        if (null == replacement) {
            replacement = ZVal.newArray();
        }
        if (ZVal.strictEqualityCheck(
                function_func_num_args
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call()
                        .value(),
                "===",
                1)) {
            return ZVal.assign(
                    env.createNewWithLateStaticBindings(
                            this,
                            function_array_splice.f.env(env).call(this.items, offset).value()));
        }

        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this,
                        function_array_splice
                                .f
                                .env(env)
                                .call(this.items, offset, length, replacement)
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object sum(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Support/Collection.php");
        Object callback = assignParameter(args, 0, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        if (function_is_null.f.env(env).call(callback).getBool()) {
            return ZVal.assign(function_array_sum.f.env(env).call(this.items).value());
        }

        callback = this.valueRetriever(env, callback);
        return ZVal.assign(
                this.reduce(
                        env,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Support",
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
                                Object result = assignParameter(args, 0, false);
                                ReferenceContainer item =
                                        new BasicReferenceContainer(
                                                assignParameter(args, 1, false));
                                Object callback = null;
                                callback = this.contextReferences.getCapturedValue("callback");
                                return ZVal.assign(
                                        ZVal.add(
                                                result,
                                                env.callFunctionDynamic(
                                                                callback,
                                                                new RuntimeArgsWithReferences()
                                                                        .add(0, item),
                                                                item.getObject())
                                                        .value()));
                            }
                        }.use("callback", callback),
                        0));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "limit")
    public Object take(RuntimeEnv env, Object... args) {
        Object limit = assignParameter(args, 0, false);
        if (ZVal.isLessThan(limit, '<', 0)) {
            return ZVal.assign(
                    this.slice(env, limit, NamespaceGlobal.abs.env(env).call(limit).value()));
        }

        return ZVal.assign(this.slice(env, 0, limit));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "callable")
    public Object tap(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        env.callFunctionDynamic(
                callback,
                new RuntimeArgsWithReferences(),
                env.createNewWithLateStaticBindings(this, this.items));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "callable")
    public Object transform(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        this.items = env.callMethod(this.map(env, callback), "all", Collection.class);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "key",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "strict",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object unique(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Support/Collection.php");
        Object key = assignParameter(args, 0, true);
        if (null == key) {
            key = ZVal.getNull();
        }
        Object strict = assignParameter(args, 1, true);
        if (null == strict) {
            strict = false;
        }
        Object callback = null;
        ReferenceContainer exists = new BasicReferenceContainer(null);
        callback = this.valueRetriever(env, key);
        exists.setObject(ZVal.newArray());
        return ZVal.assign(
                this.reject(
                        env,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Support",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "item")
                            @ConvertedParameter(index = 1, name = "key")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                ReferenceContainer item =
                                        new BasicReferenceContainer(
                                                assignParameter(args, 0, false));
                                ReferenceContainer key =
                                        new BasicReferenceContainer(
                                                assignParameter(args, 1, false));
                                Object callback = null;
                                ReferenceContainer exists = new BasicReferenceContainer(null);
                                Object id = null;
                                Object strict = null;
                                callback = this.contextReferences.getCapturedValue("callback");
                                exists = this.contextReferences.getReferenceContainer("exists");
                                strict = this.contextReferences.getCapturedValue("strict");
                                if (function_in_array
                                        .f
                                        .env(env)
                                        .call(
                                                id =
                                                        env.callFunctionDynamic(
                                                                        callback,
                                                                        new RuntimeArgsWithReferences()
                                                                                .add(0, item)
                                                                                .add(1, key),
                                                                        item.getObject(),
                                                                        key.getObject())
                                                                .value(),
                                                exists.getObject(),
                                                strict)
                                        .getBool()) {
                                    return ZVal.assign(true);
                                }

                                exists.arrayAppend(env).set(id);
                                return null;
                            }
                        }.useRef("exists", exists)
                                .use("callback", callback)
                                .use("strict", strict)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "key",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object uniqueStrict(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, true);
        if (null == key) {
            key = ZVal.getNull();
        }
        return ZVal.assign(this.unique(env, key, true));
    }

    @ConvertedMethod
    public Object values(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this, function_array_values.f.env(env).call(this.items).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object valueRetriever(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Support/Collection.php");
        Object value = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.useAsCallable(env, value))) {
            return ZVal.assign(value);
        }

        return ZVal.assign(
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Support", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "item")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object item = assignParameter(args, 0, false);
                        Object value = null;
                        value = this.contextReferences.getCapturedValue("value");
                        return ZVal.assign(data_get.f.env(env).call(item, value).value());
                    }
                }.use("value", value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "items")
    public Object zip(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Support/Collection.php");
        Object items = assignParameter(args, 0, false);
        Object params = null;
        Object arrayableItems = null;
        arrayableItems =
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Support",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "items")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object items = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                Collection.this.getArrayableItems(env, items));
                                    }
                                },
                                function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value())
                        .value();
        params =
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair(
                                                0,
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
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        return ZVal.assign(
                                                                env.createNewWithLateStaticBindings(
                                                                        this,
                                                                        function_func_get_args
                                                                                .f
                                                                                .env(env)
                                                                                .addReferenceArgs(
                                                                                        new RuntimeArgsWithInfo(
                                                                                                args,
                                                                                                this))
                                                                                .call()
                                                                                .value()));
                                                    }
                                                }),
                                        new ZPair(1, this.items)),
                                arrayableItems)
                        .value();
        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this,
                        function_call_user_func_array
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call("array_map", params)
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "size")
    @ConvertedParameter(index = 1, name = "value")
    public Object pad(RuntimeEnv env, Object... args) {
        Object size = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this, function_array_pad.f.env(env).call(this.items, size, value).value()));
    }

    @ConvertedMethod
    public Object toArray(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Support/Collection.php");
        return ZVal.assign(
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Support",
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
                                        return ZVal.assign(
                                                ZVal.isTrue(
                                                                ZVal.checkInstanceType(
                                                                        value,
                                                                        Arrayable.class,
                                                                        "Illuminate\\Contracts\\Support\\Arrayable"))
                                                        ? env.callMethod(
                                                                value, "toArray", Collection.class)
                                                        : value);
                                    }
                                },
                                this.items)
                        .value());
    }

    @ConvertedMethod
    public Object jsonSerialize(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Support/Collection.php");
        return ZVal.assign(
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Support",
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
                                        if (ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        value,
                                                        JsonSerializable.class,
                                                        "JsonSerializable"))) {
                                            return ZVal.assign(
                                                    env.callMethod(
                                                            value,
                                                            "jsonSerialize",
                                                            Collection.class));

                                        } else if (ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        value,
                                                        Jsonable.class,
                                                        "Illuminate\\Contracts\\Support\\Jsonable"))) {
                                            return ZVal.assign(
                                                    NamespaceGlobal.json_decode
                                                            .env(env)
                                                            .call(
                                                                    env.callMethod(
                                                                            value,
                                                                            "toJson",
                                                                            Collection.class),
                                                                    true)
                                                            .value());

                                        } else if (ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        value,
                                                        Arrayable.class,
                                                        "Illuminate\\Contracts\\Support\\Arrayable"))) {
                                            return ZVal.assign(
                                                    env.callMethod(
                                                            value, "toArray", Collection.class));
                                        }

                                        return ZVal.assign(value);
                                    }
                                },
                                this.items)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "options",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object toJson(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, true);
        if (null == options) {
            options = 0;
        }
        return ZVal.assign(
                NamespaceGlobal.json_encode
                        .env(env)
                        .call(this.jsonSerialize(env), options)
                        .value());
    }

    @ConvertedMethod
    public Object getIterator(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ArrayIterator(env, this.items));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flags")
    public Object getCachingIterator(RuntimeEnv env, Object... args) {
        Object flags = assignParameter(args, 0, true);
        if (null == flags) {
            flags = 1;
        }
        return ZVal.assign(new CachingIterator(env, this.getIterator(env), flags));
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_count.f.env(env).call(this.items).value());
    }

    @ConvertedMethod
    public Object toBase(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Illuminate
                        .namespaces
                        .Support
                        .classes
                        .Collection(env, this));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object offsetExists(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(function_array_key_exists.f.env(env).call(key, this.items).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object offsetGet(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(new ReferenceClassProperty(this, "items", env).arrayGet(env, key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object offsetSet(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        if (function_is_null.f.env(env).call(key).getBool()) {
            new ReferenceClassProperty(this, "items", env).arrayAppend(env).set(value);

        } else {
            new ReferenceClassProperty(this, "items", env).arrayAccess(env, key).set(value);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object offsetUnset(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        arrayActionR(ArrayAction.UNSET, new ReferenceClassProperty(this, "items", env), env, key);
        return null;
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.toJson(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "items")
    protected Object getArrayableItems(RuntimeEnv env, Object... args) {
        Object items = assignParameter(args, 0, false);
        if (function_is_array.f.env(env).call(items).getBool()) {
            return ZVal.assign(items);

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        items,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Illuminate
                                .namespaces
                                .Support
                                .classes
                                .Collection
                                .class,
                        "Illuminate\\Support\\Collection"))) {
            return ZVal.assign(env.callMethod(items, "all", Collection.class));

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        items, Arrayable.class, "Illuminate\\Contracts\\Support\\Arrayable"))) {
            return ZVal.assign(env.callMethod(items, "toArray", Collection.class));

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        items, Jsonable.class, "Illuminate\\Contracts\\Support\\Jsonable"))) {
            return ZVal.assign(
                    NamespaceGlobal.json_decode
                            .env(env)
                            .call(env.callMethod(items, "toJson", Collection.class), true)
                            .value());

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(items, JsonSerializable.class, "JsonSerializable"))) {
            return ZVal.assign(env.callMethod(items, "jsonSerialize", Collection.class));

        } else if (ZVal.isTrue(ZVal.checkInstanceType(items, Traversable.class, "Traversable"))) {
            return ZVal.assign(NamespaceGlobal.iterator_to_array.env(env).call(items).value());
        }

        return ZVal.assign(rToArrayCast(items));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object __get(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        if (!function_in_array
                .f
                .env(env)
                .call(
                        key,
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Support
                                                .classes
                                                .Collection
                                                .RequestStaticProperties
                                                .class)
                                .proxies)
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new PHPException(
                            env,
                            "Property ["
                                    + toStringR(key, env)
                                    + "] does not exist on this collection instance."));
        }

        return ZVal.assign(new HigherOrderCollectionProxy(env, this, key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        ReferenceContainer method = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object parameters = assignParameter(args, 1, false);
        Object macro = null;
        if (!ZVal.isTrue(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Collection.class)
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
                                                .Collection
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
                                            Collection.class,
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

    public static final Object CONST_class = "Illuminate\\Support\\Collection";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "items",
            defaultValue = "",
            defaultValueType = "array"
        )
        public Object make(RuntimeEnv env, Object... args) {
            Object items = assignParameter(args, 0, true);
            if (null == items) {
                items = ZVal.newArray();
            }
            return ZVal.assign(env.createNewWithLateStaticBindings(this, items));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object wrap(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            return ZVal.assign(
                    ZVal.isTrue(
                                    ZVal.checkInstanceType(
                                            value,
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Illuminate
                                                    .namespaces
                                                    .Support
                                                    .classes
                                                    .Collection
                                                    .class,
                                            "Illuminate\\Support\\Collection"))
                            ? env.createNewWithLateStaticBindings(this, value)
                            : env.createNewWithLateStaticBindings(
                                    this, Arr.runtimeStaticObject.wrap(env, value)));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object unwrap(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            return ZVal.assign(
                    ZVal.isTrue(
                                    ZVal.checkInstanceType(
                                            value,
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Illuminate
                                                    .namespaces
                                                    .Support
                                                    .classes
                                                    .Collection
                                                    .class,
                                            "Illuminate\\Support\\Collection"))
                            ? env.callMethod(value, "all", Collection.class)
                            : value);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "number")
        @ConvertedParameter(
            index = 1,
            name = "callback",
            typeHint = "callable",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object times(RuntimeEnv env, Object... args) {
            Object number = assignParameter(args, 0, false);
            Object callback = assignParameter(args, 1, true);
            if (null == callback) {
                callback = ZVal.getNull();
            }
            if (ZVal.isLessThan(number, '<', 1)) {
                return ZVal.assign(env.createNewWithLateStaticBindings(this));
            }

            if (function_is_null.f.env(env).call(callback).getBool()) {
                return ZVal.assign(
                        env.createNewWithLateStaticBindings(
                                this, function_range.f.env(env).call(1, number).value()));
            }

            return ZVal.assign(
                    env.callMethod(
                            env.createNewWithLateStaticBindings(
                                    this, function_range.f.env(env).call(1, number).value()),
                            "map",
                            Collection.class,
                            callback));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "method")
        public Object proxy(RuntimeEnv env, Object... args) {
            Object method = assignParameter(args, 0, false);
            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Illuminate
                                    .namespaces
                                    .Support
                                    .classes
                                    .Collection
                                    .RequestStaticProperties
                                    .class,
                            "proxies")
                    .arrayAppend(env)
                    .set(method);
            return null;
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
                                    .Collection
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
                            Collection.class,
                            ZVal.toLong(256) | ZVal.toLong(512));
            for (ZPair zpairResult2361 : ZVal.getIterable(methods, env, true)) {
                method = ZVal.assign(zpairResult2361.getValue());
                env.callMethod(method, "setAccessible", Collection.class, true);
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Collection.class)
                        .method("macro")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                toObjectR(method).accessProp(this, env).name("name").value(),
                                env.callMethod(method, "invoke", Collection.class, mixin))
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
                                            .Collection
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
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Collection.class)
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
                                                    .Collection
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
                                                                        .Collection
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
                                                            .Collection
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

        public Object proxies =
                ZVal.arrayFromList(
                        "average",
                        "avg",
                        "contains",
                        "each",
                        "every",
                        "filter",
                        "first",
                        "flatMap",
                        "groupBy",
                        "keyBy",
                        "map",
                        "max",
                        "min",
                        "partition",
                        "reject",
                        "sortBy",
                        "sortByDesc",
                        "sum",
                        "unique");

        public Object macros = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Support\\Collection")
                    .setLookup(
                            Collection.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("items")
                    .setStaticPropertyNames("macros", "proxies")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Support/Collection.php")
                    .addInterface("ArrayAccess")
                    .addInterface("Illuminate\\Contracts\\Support\\Arrayable")
                    .addInterface("Countable")
                    .addInterface("IteratorAggregate")
                    .addInterface("Traversable")
                    .addInterface("Illuminate\\Contracts\\Support\\Jsonable")
                    .addInterface("JsonSerializable")
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

    private enum SwitchEnumType29 {
        RESERVED_CHARS_1938861821_STRING__,
        RESERVED_CHARS_1016112711_STRING___,
        RESERVED_CHARS_1752664879_STRING___,
        RESERVED_CHARS_318179937_STRING___,
        RESERVED_CHARS_1048872619_STRING__,
        RESERVED_CHARS_1060371169_STRING__,
        RESERVED_CHARS_1963571830_STRING___,
        RESERVED_CHARS_1586013422_STRING___,
        RESERVED_CHARS_1584217721_STRING____,
        RESERVED_CHARS_1808332228_STRING____,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
