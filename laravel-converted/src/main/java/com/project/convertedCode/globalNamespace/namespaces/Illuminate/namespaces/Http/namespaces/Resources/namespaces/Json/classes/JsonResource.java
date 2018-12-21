package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Resources.namespaces.Json.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Routing.classes.UrlRoutable;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Resources.classes.PotentiallyMissing;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.ArrayAccess;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Container.classes.Container;
import com.project.convertedCode.globalNamespace.functions.transform;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Responsable;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Arrayable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Resources.namespaces.Json.classes.AnonymousResourceCollection;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Resources.classes.MissingValue;
import com.runtimeconverter.runtime.nativeInterfaces.JsonSerializable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Resources.namespaces.Json.classes.ResourceResponse;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_num_args;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Resources.classes.MergeValue;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Collection;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;
import static com.runtimeconverter.runtime.ZVal.assignParameterVarArgs;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Http/Resources/Json/JsonResource.php

*/

public class JsonResource extends RuntimeClassBase
        implements ArrayAccess, JsonSerializable, Responsable, UrlRoutable {

    public Object resource = null;

    public Object with = ZVal.newArray();

    public Object additional = ZVal.newArray();

    public JsonResource(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == JsonResource.class) {
            this.__construct(env, args);
        }
    }

    public JsonResource(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        this.resource = resource;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object resolve(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, true);
        if (null == request) {
            request = ZVal.getNull();
        }
        Object data = null;
        Object ternaryExpressionTemp = null;
        data =
                this.toArray(
                        env,
                        request =
                                ZVal.assign(
                                        ZVal.isTrue(ternaryExpressionTemp = request)
                                                ? ternaryExpressionTemp
                                                : env.callMethod(
                                                        Container.runtimeStaticObject.getInstance(
                                                                env),
                                                        "make",
                                                        JsonResource.class,
                                                        "request")));
        if (function_is_array.f.env(env).call(data).getBool()) {
            data = ZVal.assign(data);

        } else if (ZVal.toBool(
                        ZVal.checkInstanceType(
                                data, Arrayable.class, "Illuminate\\Contracts\\Support\\Arrayable"))
                || ZVal.toBool(
                        ZVal.checkInstanceType(
                                data, Collection.class, "Illuminate\\Support\\Collection"))) {
            data = env.callMethod(data, "toArray", JsonResource.class);

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(data, JsonSerializable.class, "JsonSerializable"))) {
            data = env.callMethod(data, "jsonSerialize", JsonResource.class);
        }

        return ZVal.assign(this.filter(env, rToArrayCast(data)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    public Object toArray(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this.resource, "toArray", JsonResource.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    public Object with(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        return ZVal.assign(this.with);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    public Object additional(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        this.additional = data;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "response")
    public Object withResponse(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object response = assignParameter(args, 1, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object response(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, true);
        if (null == request) {
            request = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                this.toResponse(
                        env,
                        ZVal.isTrue(ternaryExpressionTemp = request)
                                ? ternaryExpressionTemp
                                : env.callMethod(
                                        Container.runtimeStaticObject.getInstance(env),
                                        "make",
                                        JsonResource.class,
                                        "request")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    public Object toResponse(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        new ResourceResponse(env, this),
                        "toResponse",
                        JsonResource.class,
                        request));
    }

    @ConvertedMethod
    public Object jsonSerialize(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                this.resolve(
                        env,
                        env.callMethod(
                                Container.runtimeStaticObject.getInstance(env),
                                "make",
                                JsonResource.class,
                                "request")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    protected Object filter(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        ReferenceContainer data = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object numericKeys = null;
        ReferenceContainer index = new BasicReferenceContainer(null);
        Object value = null;
        Object key = null;
        index.setObject(-1);
        numericKeys =
                ZVal.strictEqualityCheck(
                        function_array_values.f.env(env).call(data.getObject()).value(),
                        "===",
                        data.getObject());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult2334 : ZVal.getIterable(data.getObject(), env, false)) {
            key = ZVal.assign(zpairResult2334.getKey());
            value = ZVal.assign(zpairResult2334.getValue());
            index.setObject(ZVal.increment(index.getObject()));
            if (function_is_array.f.env(env).call(value).getBool()) {
                data.arrayAccess(env, key).set(this.filter(env, value));
                continue;
            }

            if (ZVal.toBool(function_is_numeric.f.env(env).call(key).value())
                    && ZVal.toBool(
                            ZVal.checkInstanceType(
                                    value,
                                    MergeValue.class,
                                    "Illuminate\\Http\\Resources\\MergeValue"))) {
                return ZVal.assign(
                        this.merge(
                                env,
                                data.getObject(),
                                index.getObject(),
                                this.filter(
                                        env,
                                        toObjectR(value)
                                                .accessProp(this, env)
                                                .name("data")
                                                .value()),
                                numericKeys));
            }

            if (ZVal.toBool(
                            ZVal.checkInstanceType(
                                    value,
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Http
                                            .namespaces
                                            .Resources
                                            .namespaces
                                            .Json
                                            .classes
                                            .JsonResource
                                            .class,
                                    "Illuminate\\Http\\Resources\\Json\\JsonResource"))
                    && ZVal.toBool(
                            function_is_null
                                    .f
                                    .env(env)
                                    .call(
                                            toObjectR(value)
                                                    .accessProp(this, env)
                                                    .name("resource")
                                                    .value())
                                    .value())) {
                data.arrayAccess(env, key).set(ZVal.getNull());
            }
        }

        return ZVal.assign(this.removeMissingValues(env, data.getObject(), numericKeys));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    @ConvertedParameter(index = 1, name = "index")
    @ConvertedParameter(index = 2, name = "merge")
    @ConvertedParameter(index = 3, name = "numericKeys")
    protected Object merge(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        Object index = assignParameter(args, 1, false);
        Object merge = assignParameter(args, 2, false);
        Object numericKeys = assignParameter(args, 3, false);
        if (ZVal.isTrue(numericKeys)) {
            return ZVal.assign(
                    this.removeMissingValues(
                            env,
                            function_array_merge
                                    .f
                                    .env(env)
                                    .call(
                                            function_array_merge
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            function_array_slice
                                                                    .f
                                                                    .env(env)
                                                                    .call(data, 0, index, true)
                                                                    .value(),
                                                            merge)
                                                    .value(),
                                            this.filter(
                                                    env,
                                                    function_array_values
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    function_array_slice
                                                                            .f
                                                                            .env(env)
                                                                            .call(
                                                                                    data,
                                                                                    ZVal.add(
                                                                                            index,
                                                                                            1),
                                                                                    ZVal.getNull(),
                                                                                    true)
                                                                            .value())
                                                            .value()))
                                    .value(),
                            numericKeys));
        }

        return ZVal.assign(
                this.removeMissingValues(
                        env,
                        ZVal.add(
                                ZVal.add(
                                        function_array_slice
                                                .f
                                                .env(env)
                                                .call(data, 0, index, true)
                                                .value(),
                                        merge),
                                this.filter(
                                        env,
                                        function_array_slice
                                                .f
                                                .env(env)
                                                .call(
                                                        data,
                                                        ZVal.add(index, 1),
                                                        ZVal.getNull(),
                                                        true)
                                                .value()))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    @ConvertedParameter(
        index = 1,
        name = "numericKeys",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object removeMissingValues(RuntimeEnv env, Object... args) {
        ReferenceContainer data = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object numericKeys = assignParameter(args, 1, true);
        if (null == numericKeys) {
            numericKeys = false;
        }
        Object value = null;
        Object key = null;
        for (ZPair zpairResult2335 : ZVal.getIterable(data.getObject(), env, false)) {
            key = ZVal.assign(zpairResult2335.getKey());
            value = ZVal.assign(zpairResult2335.getValue());
            if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.checkInstanceType(
                                                    value,
                                                    PotentiallyMissing.class,
                                                    "Illuminate\\Http\\Resources\\PotentiallyMissing"))
                                    && ZVal.toBool(
                                            env.callMethod(value, "isMissing", JsonResource.class)))
                    || ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.toBool(
                                                            ZVal.checkInstanceType(
                                                                    value,
                                                                    com.project
                                                                            .convertedCode
                                                                            .globalNamespace
                                                                            .namespaces
                                                                            .Illuminate
                                                                            .namespaces
                                                                            .Http
                                                                            .namespaces
                                                                            .Resources
                                                                            .namespaces
                                                                            .Json
                                                                            .classes
                                                                            .JsonResource
                                                                            .class,
                                                                    "Illuminate\\Http\\Resources\\Json\\JsonResource"))
                                                    && ZVal.toBool(
                                                            ZVal.checkInstanceType(
                                                                    toObjectR(value)
                                                                            .accessProp(this, env)
                                                                            .name("resource")
                                                                            .value(),
                                                                    PotentiallyMissing.class,
                                                                    "Illuminate\\Http\\Resources\\PotentiallyMissing")))
                                    && ZVal.toBool(
                                            env.callMethod(
                                                    value, "isMissing", JsonResource.class)))) {
                arrayActionR(ArrayAction.UNSET, data, env, key);
            }
        }

        return ZVal.assign(
                ZVal.toBool(!ZVal.isEmpty(data.getObject()))
                                && ZVal.toBool(
                                        function_is_numeric
                                                .f
                                                .env(env)
                                                .call(
                                                        handleReturnReference(
                                                                        function_array_keys
                                                                                .f
                                                                                .env(env)
                                                                                .call(
                                                                                        data
                                                                                                .getObject())
                                                                                .value())
                                                                .arrayGet(env, 0))
                                                .value())
                        ? function_array_values.f.env(env).call(data.getObject()).value()
                        : data.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "condition")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(
        index = 2,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object when(RuntimeEnv env, Object... args) {
        Object condition = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object _pDefault = assignParameter(args, 2, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        if (ZVal.isTrue(condition)) {
            return ZVal.assign(
                    com.project
                            .convertedCode
                            .globalNamespace
                            .functions
                            .value
                            .f
                            .env(env)
                            .call(value)
                            .value());
        }

        return ZVal.assign(
                ZVal.strictEqualityCheck(
                                function_func_num_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value(),
                                "===",
                                3)
                        ? com.project
                                .convertedCode
                                .globalNamespace
                                .functions
                                .value
                                .f
                                .env(env)
                                .call(_pDefault)
                                .value()
                        : new MissingValue(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "condition")
    @ConvertedParameter(index = 1, name = "value")
    protected Object mergeWhen(RuntimeEnv env, Object... args) {
        Object condition = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.isTrue(condition)
                        ? new MergeValue(
                                env,
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .functions
                                        .value
                                        .f
                                        .env(env)
                                        .call(value)
                                        .value())
                        : new MissingValue(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes")
    protected Object attributes(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, false);
        return ZVal.assign(
                new MergeValue(
                        env,
                        Arr.runtimeStaticObject.only(
                                env,
                                env.callMethod(this.resource, "toArray", JsonResource.class),
                                attributes)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "relationship")
    @ConvertedParameter(
        index = 1,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object whenLoaded(RuntimeEnv env, Object... args) {
        Object relationship = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        Object _pDefault = assignParameter(args, 2, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        if (ZVal.isLessThan(
                function_func_num_args
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call()
                        .value(),
                '<',
                3)) {
            _pDefault = new MissingValue(env);
        }

        if (!ZVal.isTrue(
                env.callMethod(
                        this.resource, "relationLoaded", JsonResource.class, relationship))) {
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
                    toObjectR(this.resource).accessProp(this, env).name(relationship).value());
        }

        if (ZVal.strictEqualityCheck(
                toObjectR(this.resource).accessProp(this, env).name(relationship).value(),
                "===",
                ZVal.getNull())) {
            return ZVal.assign(ZVal.getNull());
        }

        return ZVal.assign(
                com.project
                        .convertedCode
                        .globalNamespace
                        .functions
                        .value
                        .f
                        .env(env)
                        .call(value)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(
        index = 2,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object whenPivotLoaded(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object _pDefault = assignParameter(args, 2, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
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
            _pDefault = new MissingValue(env);
        }

        return ZVal.assign(
                this.when(
                        env,
                        PackedVaradicArgs.unpack(
                                ZVal.toBool(
                                                toObjectR(this.resource)
                                                        .accessProp(this, env)
                                                        .name("pivot")
                                                        .value())
                                        && ZVal.toBool(
                                                ZVal.toBool(
                                                                ZVal.checkInstanceTypeMatch(
                                                                        toObjectR(this.resource)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("pivot")
                                                                                .value(),
                                                                        table))
                                                        || ZVal.toBool(
                                                                ZVal.strictEqualityCheck(
                                                                        env.callMethod(
                                                                                toObjectR(
                                                                                                this
                                                                                                        .resource)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name(
                                                                                                "pivot")
                                                                                        .value(),
                                                                                "getTable",
                                                                                JsonResource.class),
                                                                        "===",
                                                                        table))),
                                new PackedVaradicArgs(
                                        ZVal.newArray(
                                                new ZPair(0, value), new ZPair(1, _pDefault))))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "callable")
    @ConvertedParameter(
        index = 2,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object transform(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        Object _pDefault = assignParameter(args, 2, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        return ZVal.assign(
                transform
                        .f
                        .env(env)
                        .call(
                                value,
                                callback,
                                ZVal.strictEqualityCheck(
                                                function_func_num_args
                                                        .f
                                                        .env(env)
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithInfo(args, this))
                                                        .call()
                                                        .value(),
                                                "===",
                                                3)
                                        ? _pDefault
                                        : new MissingValue(env))
                        .value());
    }

    @ConvertedMethod
    public Object getRouteKey(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.resource, "getRouteKey", JsonResource.class));
    }

    @ConvertedMethod
    public Object getRouteKeyName(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.resource, "getRouteKeyName", JsonResource.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object resolveRouteBinding(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        throw ZVal.getException(
                env,
                new PHPException(
                        env, "Resources may not be implicitly resolved from route bindings."));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    public Object offsetExists(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_key_exists.f.env(env).call(offset, this.resource).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    public Object offsetGet(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        return ZVal.assign(new ReferenceClassProperty(this, "resource", env).arrayGet(env, offset));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    @ConvertedParameter(index = 1, name = "value")
    public Object offsetSet(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "resource", env).arrayAccess(env, offset).set(value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    public Object offsetUnset(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        arrayActionR(
                ArrayAction.UNSET, new ReferenceClassProperty(this, "resource", env), env, offset);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object __isset(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isset(toObjectR(this.resource).accessProp(this, env).name(key).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object __unset(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        toObjectR(this.resource).accessProp(this, env).name(key).set(null);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object __get(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(toObjectR(this.resource).accessProp(this, env).name(key).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        this.resource,
                        new RuntimeArgsWithReferences(),
                        toStringR(method, env),
                        JsonResource.class,
                        PackedVaradicArgs.unpack(new PackedVaradicArgs(parameters))));
    }

    public static final Object CONST_class = "Illuminate\\Http\\Resources\\Json\\JsonResource";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "parameters")
        public Object make(RuntimeEnv env, Object... args) {
            Object parameters = assignParameterVarArgs(args, 0);
            return ZVal.assign(
                    env.createNewWithLateStaticBindings(
                            this, PackedVaradicArgs.unpack(new PackedVaradicArgs(parameters))));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "resource")
        public Object collection(RuntimeEnv env, Object... args) {
            Object resource = assignParameter(args, 0, false);
            return ZVal.assign(
                    new AnonymousResourceCollection(
                            env,
                            resource,
                            NamespaceGlobal.get_called_class.env(env).call().value()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object wrap(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Http
                                            .namespaces
                                            .Resources
                                            .namespaces
                                            .Json
                                            .classes
                                            .JsonResource
                                            .RequestStaticProperties
                                            .class)
                            .wrap =
                    value;
            return null;
        }

        @ConvertedMethod
        public Object withoutWrapping(RuntimeEnv env, Object... args) {
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Http
                                            .namespaces
                                            .Resources
                                            .namespaces
                                            .Json
                                            .classes
                                            .JsonResource
                                            .RequestStaticProperties
                                            .class)
                            .wrap =
                    ZVal.getNull();
            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object wrap = "data";
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Http\\Resources\\Json\\JsonResource")
                    .setLookup(
                            JsonResource.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("additional", "resource", "with")
                    .setStaticPropertyNames("wrap")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Http/Resources/Json/JsonResource.php")
                    .addInterface("ArrayAccess")
                    .addInterface("JsonSerializable")
                    .addInterface("Illuminate\\Contracts\\Support\\Responsable")
                    .addInterface("Illuminate\\Contracts\\Routing\\UrlRoutable")
                    .addTrait("Illuminate\\Http\\Resources\\ConditionallyLoadsAttributes")
                    .addTrait("Illuminate\\Http\\Resources\\DelegatesToResource")
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
