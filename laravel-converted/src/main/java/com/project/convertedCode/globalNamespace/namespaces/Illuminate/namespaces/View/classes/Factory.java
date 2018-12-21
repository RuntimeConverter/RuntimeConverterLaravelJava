package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.View.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_get_clean;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Arrayable;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.functions.last;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reverse;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_start;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.HtmlString;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.project.convertedCode.globalNamespace.functions.e;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.View.classes.ViewName;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
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

 vendor/laravel/framework/src/Illuminate/View/Factory.php

*/

public class Factory extends RuntimeClassBase
        implements com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Contracts
                .namespaces
                .View
                .classes
                .Factory {

    public Object engines = null;

    public Object finder = null;

    public Object events = null;

    public Object container = null;

    public Object shared = ZVal.newArray();

    public Object extensions =
            ZVal.newArray(
                    new ZPair("blade.php", "blade"),
                    new ZPair("php", "php"),
                    new ZPair("css", "file"));

    public Object composers = ZVal.newArray();

    public Object renderCount = 0;

    public Object componentStack = ZVal.newArray();

    public Object componentData = ZVal.newArray();

    public Object slots = ZVal.newArray();

    public Object slotStack = ZVal.newArray();

    public Object sections = ZVal.newArray();

    public Object sectionStack = ZVal.newArray();

    public Object loopsStack = ZVal.newArray();

    public Object pushes = ZVal.newArray();

    public Object prepends = ZVal.newArray();

    public Object pushStack = ZVal.newArray();

    public Object translationReplacements = ZVal.newArray();

    public Factory(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Factory.class) {
            this.__construct(env, args);
        }
    }

    public Factory(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "engines",
        typeHint = "Illuminate\\View\\Engines\\EngineResolver"
    )
    @ConvertedParameter(
        index = 1,
        name = "finder",
        typeHint = "Illuminate\\View\\ViewFinderInterface"
    )
    @ConvertedParameter(
        index = 2,
        name = "events",
        typeHint = "Illuminate\\Contracts\\Events\\Dispatcher"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object engines = assignParameter(args, 0, false);
        Object finder = assignParameter(args, 1, false);
        Object events = assignParameter(args, 2, false);
        this.finder = finder;
        this.events = events;
        this.engines = engines;
        this.share(env, "__env", this);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "data", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 2,
        name = "mergeData",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object file(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/View")
                        .setFile("/vendor/laravel/framework/src/Illuminate/View/Factory.php");
        Object path = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        Object mergeData = assignParameter(args, 2, true);
        if (null == mergeData) {
            mergeData = ZVal.newArray();
        }
        data = function_array_merge.f.env(env).call(mergeData, this.parseData(env, data)).value();
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                this.viewInstance(env, path, path, data),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\View",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "view")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object view = assignParameter(args, 0, false);
                                        Factory.this.callCreator(env, view);
                                        return null;
                                    }
                                })
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "view")
    @ConvertedParameter(index = 1, name = "data", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 2,
        name = "mergeData",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object make(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/View")
                        .setFile("/vendor/laravel/framework/src/Illuminate/View/Factory.php");
        Object view = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        Object mergeData = assignParameter(args, 2, true);
        if (null == mergeData) {
            mergeData = ZVal.newArray();
        }
        Object path = null;
        path =
                env.callMethod(
                        this.finder, "find", Factory.class, view = this.normalizeName(env, view));
        data = function_array_merge.f.env(env).call(mergeData, this.parseData(env, data)).value();
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                this.viewInstance(env, view, path, data),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\View",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "view")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object view = assignParameter(args, 0, false);
                                        Factory.this.callCreator(env, view);
                                        return null;
                                    }
                                })
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "views", typeHint = "array")
    @ConvertedParameter(index = 1, name = "data", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 2,
        name = "mergeData",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object first(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/View")
                        .setFile("/vendor/laravel/framework/src/Illuminate/View/Factory.php");
        Object views = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        Object mergeData = assignParameter(args, 2, true);
        if (null == mergeData) {
            mergeData = ZVal.newArray();
        }
        Object view = null;
        view =
                Arr.runtimeStaticObject.first(
                        env,
                        views,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\View",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "view")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                Object view = assignParameter(args, 0, false);
                                return ZVal.assign(Factory.this.exists(env, view));
                            }
                        });
        if (!ZVal.isTrue(view)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "None of the views in the given array exist."));
        }

        return ZVal.assign(this.make(env, view, data, mergeData));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "condition")
    @ConvertedParameter(index = 1, name = "view")
    @ConvertedParameter(index = 2, name = "data", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 3,
        name = "mergeData",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object renderWhen(RuntimeEnv env, Object... args) {
        Object condition = assignParameter(args, 0, false);
        Object view = assignParameter(args, 1, false);
        Object data = assignParameter(args, 2, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        Object mergeData = assignParameter(args, 3, true);
        if (null == mergeData) {
            mergeData = ZVal.newArray();
        }
        if (!ZVal.isTrue(condition)) {
            return "";
        }

        return ZVal.assign(
                env.callMethod(
                        this.make(env, view, this.parseData(env, data), mergeData),
                        "render",
                        Factory.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "view")
    @ConvertedParameter(index = 1, name = "data")
    @ConvertedParameter(index = 2, name = "iterator")
    @ConvertedParameter(index = 3, name = "empty")
    public Object renderEach(RuntimeEnv env, Object... args) {
        Object view = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        Object iterator = assignParameter(args, 2, false);
        Object empty = assignParameter(args, 3, true);
        if (null == empty) {
            empty = "raw|";
        }
        Object result = null;
        Object value = null;
        Object key = null;
        result = "";
        if (ZVal.isGreaterThan(function_count.f.env(env).call(data).value(), '>', 0)) {
            for (ZPair zpairResult645 : ZVal.getIterable(data, env, false)) {
                key = ZVal.assign(zpairResult645.getKey());
                value = ZVal.assign(zpairResult645.getValue());
                result =
                        toStringR(result, env)
                                + toStringR(
                                        env.callMethod(
                                                this.make(
                                                        env,
                                                        view,
                                                        ZVal.newArray(
                                                                new ZPair("key", key),
                                                                new ZPair(iterator, value))),
                                                "render",
                                                Factory.class),
                                        env);
            }

        } else {
            result =
                    ZVal.assign(
                            ZVal.isTrue(Str.runtimeStaticObject.startsWith(env, empty, "raw|"))
                                    ? function_substr.f.env(env).call(empty, 4).value()
                                    : env.callMethod(
                                            this.make(env, empty), "render", Factory.class));
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object normalizeName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(ViewName.runtimeStaticObject.normalize(env, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    protected Object parseData(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        data,
                                        Arrayable.class,
                                        "Illuminate\\Contracts\\Support\\Arrayable"))
                        ? env.callMethod(data, "toArray", Factory.class)
                        : data);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "view")
    @ConvertedParameter(index = 1, name = "path")
    @ConvertedParameter(index = 2, name = "data")
    protected Object viewInstance(RuntimeEnv env, Object... args) {
        Object view = assignParameter(args, 0, false);
        Object path = assignParameter(args, 1, false);
        Object data = assignParameter(args, 2, false);
        return ZVal.assign(
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Illuminate
                        .namespaces
                        .View
                        .classes
                        .View(env, this, this.getEngineFromPath(env, path), view, path, data));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "view")
    public Object exists(RuntimeEnv env, Object... args) {
        Object view = assignParameter(args, 0, false);
        Object e = null;
        try {
            env.callMethod(this.finder, "find", Factory.class, view);
        } catch (ConvertedException convertedException69) {
            if (convertedException69.instanceOf(
                    InvalidArgumentException.class, "InvalidArgumentException")) {
                e = convertedException69.getObject();
                return ZVal.assign(false);
            } else {
                throw convertedException69;
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getEngineFromPath(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object extension = null;
        Object engine = null;
        if (!ZVal.isTrue(extension = this.getExtension(env, path))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Unrecognized extension in file: " + toStringR(path, env)));
        }

        engine =
                ZVal.assign(
                        new ReferenceClassProperty(this, "extensions", env)
                                .arrayGet(env, extension));
        return ZVal.assign(env.callMethod(this.engines, "resolve", Factory.class, engine));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    protected Object getExtension(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/View")
                        .setFile("/vendor/laravel/framework/src/Illuminate/View/Factory.php");
        Object path = assignParameter(args, 0, false);
        Object extensions = null;
        extensions = function_array_keys.f.env(env).call(this.extensions).value();
        return ZVal.assign(
                Arr.runtimeStaticObject.first(
                        env,
                        extensions,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\View",
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
                                Object path = null;
                                path = this.contextReferences.getCapturedValue("path");
                                return ZVal.assign(
                                        Str.runtimeStaticObject.endsWith(
                                                env, path, "." + toStringR(value, env)));
                            }
                        }.use("path", path)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object share(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        Object keys = null;
        keys =
                ZVal.assign(
                        function_is_array.f.env(env).call(key).getBool()
                                ? key
                                : ZVal.newArray(new ZPair(key, value)));
        for (ZPair zpairResult646 : ZVal.getIterable(keys, env, false)) {
            key = ZVal.assign(zpairResult646.getKey());
            value = ZVal.assign(zpairResult646.getValue());
            new ReferenceClassProperty(this, "shared", env).arrayAccess(env, key).set(value);
        }

        return ZVal.assign(value);
    }

    @ConvertedMethod
    public Object incrementRender(RuntimeEnv env, Object... args) {
        this.renderCount = ZVal.increment(this.renderCount);
        return null;
    }

    @ConvertedMethod
    public Object decrementRender(RuntimeEnv env, Object... args) {
        this.renderCount = ZVal.decrement(this.renderCount);
        return null;
    }

    @ConvertedMethod
    public Object doneRendering(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.equalityCheck(this.renderCount, 0));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "location")
    public Object addLocation(RuntimeEnv env, Object... args) {
        Object location = assignParameter(args, 0, false);
        env.callMethod(this.finder, "addLocation", Factory.class, location);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "namespace")
    @ConvertedParameter(index = 1, name = "hints")
    public Object addNamespace(RuntimeEnv env, Object... args) {
        Object namespace = assignParameter(args, 0, false);
        Object hints = assignParameter(args, 1, false);
        env.callMethod(this.finder, "addNamespace", Factory.class, namespace, hints);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "namespace")
    @ConvertedParameter(index = 1, name = "hints")
    public Object prependNamespace(RuntimeEnv env, Object... args) {
        Object namespace = assignParameter(args, 0, false);
        Object hints = assignParameter(args, 1, false);
        env.callMethod(this.finder, "prependNamespace", Factory.class, namespace, hints);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "namespace")
    @ConvertedParameter(index = 1, name = "hints")
    public Object replaceNamespace(RuntimeEnv env, Object... args) {
        ReferenceContainer namespace = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object hints = assignParameter(args, 1, false);
        env.callMethod(
                this.finder,
                new RuntimeArgsWithReferences().add(0, namespace),
                "replaceNamespace",
                Factory.class,
                namespace.getObject(),
                hints);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "extension")
    @ConvertedParameter(index = 1, name = "engine")
    @ConvertedParameter(
        index = 2,
        name = "resolver",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object addExtension(RuntimeEnv env, Object... args) {
        Object extension = assignParameter(args, 0, false);
        Object engine = assignParameter(args, 1, false);
        Object resolver = assignParameter(args, 2, true);
        if (null == resolver) {
            resolver = ZVal.getNull();
        }
        env.callMethod(this.finder, "addExtension", Factory.class, extension);
        if (ZVal.isset(resolver)) {
            env.callMethod(this.engines, "register", Factory.class, engine, resolver);
        }

        arrayActionR(
                ArrayAction.UNSET,
                new ReferenceClassProperty(this, "extensions", env),
                env,
                extension);
        this.extensions =
                function_array_merge
                        .f
                        .env(env)
                        .call(ZVal.newArray(new ZPair(extension, engine)), this.extensions)
                        .value();
        return null;
    }

    @ConvertedMethod
    public Object flushState(RuntimeEnv env, Object... args) {
        this.renderCount = 0;
        this.flushSections(env);
        this.flushStacks(env);
        return null;
    }

    @ConvertedMethod
    public Object flushStateIfDoneRendering(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.doneRendering(env))) {
            this.flushState(env);
        }

        return null;
    }

    @ConvertedMethod
    public Object getExtensions(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.extensions);
    }

    @ConvertedMethod
    public Object getEngineResolver(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.engines);
    }

    @ConvertedMethod
    public Object getFinder(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.finder);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "finder",
        typeHint = "Illuminate\\View\\ViewFinderInterface"
    )
    public Object setFinder(RuntimeEnv env, Object... args) {
        Object finder = assignParameter(args, 0, false);
        this.finder = finder;
        return null;
    }

    @ConvertedMethod
    public Object flushFinderCache(RuntimeEnv env, Object... args) {
        env.callMethod(this.getFinder(env), "flush", Factory.class);
        return null;
    }

    @ConvertedMethod
    public Object getDispatcher(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.events);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "events",
        typeHint = "Illuminate\\Contracts\\Events\\Dispatcher"
    )
    public Object setDispatcher(RuntimeEnv env, Object... args) {
        Object events = assignParameter(args, 0, false);
        this.events = events;
        return null;
    }

    @ConvertedMethod
    public Object getContainer(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.container);
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
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object shared(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        return ZVal.assign(Arr.runtimeStaticObject.get(env, this.shared, key, _pDefault));
    }

    @ConvertedMethod
    public Object getShared(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.shared);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "data",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object startComponent(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        if (function_ob_start.f.env(env).call().getBool()) {
            new ReferenceClassProperty(this, "componentStack", env).arrayAppend(env).set(name);
            new ReferenceClassProperty(this, "componentData", env)
                    .arrayAccess(env, this.currentComponent(env))
                    .set(data);
            new ReferenceClassProperty(this, "slots", env)
                    .arrayAccess(env, this.currentComponent(env))
                    .set(ZVal.newArray());
        }

        return null;
    }

    @ConvertedMethod
    public Object renderComponent(RuntimeEnv env, Object... args) {
        Object name = null;
        name = function_array_pop.f.env(env).call(this.componentStack).value();
        return ZVal.assign(
                env.callMethod(
                        this.make(env, name, this.componentData(env, name)),
                        "render",
                        Factory.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object componentData(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                new ReferenceClassProperty(this, "componentData", env)
                                        .arrayGet(
                                                env,
                                                function_count
                                                        .f
                                                        .env(env)
                                                        .call(this.componentStack)
                                                        .value()),
                                ZVal.newArray(
                                        new ZPair(
                                                "slot",
                                                new HtmlString(
                                                        env,
                                                        function_trim
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        function_ob_get_clean
                                                                                .f
                                                                                .env(env)
                                                                                .call()
                                                                                .value())
                                                                .value()))),
                                new ReferenceClassProperty(this, "slots", env)
                                        .arrayGet(
                                                env,
                                                function_count
                                                        .f
                                                        .env(env)
                                                        .call(this.componentStack)
                                                        .value()))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "content",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object slot(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object content = assignParameter(args, 1, true);
        if (null == content) {
            content = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(
                function_count
                        .f
                        .env(env)
                        .call(
                                function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value())
                        .value(),
                "===",
                2)) {
            new ReferenceClassProperty(this, "slots", env)
                    .arrayAccess(env, this.currentComponent(env), name)
                    .set(content);

        } else {
            if (function_ob_start.f.env(env).call().getBool()) {
                new ReferenceClassProperty(this, "slots", env)
                        .arrayAccess(env, this.currentComponent(env), name)
                        .set("");
                new ReferenceClassProperty(this, "slotStack", env)
                        .arrayAppend(env, this.currentComponent(env))
                        .set(name);
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object endSlot(RuntimeEnv env, Object... args) {
        Object currentSlot = null;
        last.f.env(env).call(this.componentStack);
        currentSlot =
                function_array_pop
                        .f
                        .env(env)
                        .call(
                                new ReferenceClassProperty(this, "slotStack", env)
                                        .arrayGet(env, this.currentComponent(env)))
                        .value();
        new ReferenceClassProperty(this, "slots", env)
                .arrayAccess(env, this.currentComponent(env), currentSlot)
                .set(
                        new HtmlString(
                                env,
                                function_trim
                                        .f
                                        .env(env)
                                        .call(function_ob_get_clean.f.env(env).call().value())
                                        .value()));
        return null;
    }

    @ConvertedMethod
    protected Object currentComponent(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.subtract(function_count.f.env(env).call(this.componentStack).value(), 1));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "views")
    @ConvertedParameter(index = 1, name = "callback")
    public Object creator(RuntimeEnv env, Object... args) {
        Object views = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        Object view = null;
        ReferenceContainer creators = new BasicReferenceContainer(null);
        creators.setObject(ZVal.newArray());
        for (ZPair zpairResult2379 : ZVal.getIterable(rToArrayCast(views), env, true)) {
            view = ZVal.assign(zpairResult2379.getValue());
            creators.arrayAppend(env).set(this.addViewEvent(env, view, callback, "creating: "));
        }

        return ZVal.assign(creators.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "composers", typeHint = "array")
    public Object composers(RuntimeEnv env, Object... args) {
        Object composers = assignParameter(args, 0, false);
        Object registered = null;
        Object callback = null;
        Object views = null;
        registered = ZVal.newArray();
        for (ZPair zpairResult2380 : ZVal.getIterable(composers, env, false)) {
            callback = ZVal.assign(zpairResult2380.getKey());
            views = ZVal.assign(zpairResult2380.getValue());
            registered =
                    function_array_merge
                            .f
                            .env(env)
                            .call(registered, this.composer(env, views, callback))
                            .value();
        }

        return ZVal.assign(registered);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "views")
    @ConvertedParameter(index = 1, name = "callback")
    public Object composer(RuntimeEnv env, Object... args) {
        Object views = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        ReferenceContainer composers = new BasicReferenceContainer(null);
        Object view = null;
        composers.setObject(ZVal.newArray());
        for (ZPair zpairResult2381 : ZVal.getIterable(rToArrayCast(views), env, true)) {
            view = ZVal.assign(zpairResult2381.getValue());
            composers.arrayAppend(env).set(this.addViewEvent(env, view, callback, "composing: "));
        }

        return ZVal.assign(composers.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "view")
    @ConvertedParameter(index = 1, name = "callback")
    @ConvertedParameter(index = 2, name = "prefix")
    protected Object addViewEvent(RuntimeEnv env, Object... args) {
        Object view = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        Object prefix = assignParameter(args, 2, true);
        if (null == prefix) {
            prefix = "composing: ";
        }
        view = this.normalizeName(env, view);
        if (ZVal.isTrue(ZVal.checkInstanceType(callback, Closure.class, "Closure"))) {
            this.addEventListener(env, toStringR(prefix, env) + toStringR(view, env), callback);
            return ZVal.assign(callback);

        } else if (function_is_string.f.env(env).call(callback).getBool()) {
            return ZVal.assign(this.addClassEvent(env, view, callback, prefix));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "view")
    @ConvertedParameter(index = 1, name = "class")
    @ConvertedParameter(index = 2, name = "prefix")
    protected Object addClassEvent(RuntimeEnv env, Object... args) {
        Object view = assignParameter(args, 0, false);
        Object _pClass = assignParameter(args, 1, false);
        Object prefix = assignParameter(args, 2, false);
        Object name = null;
        Object callback = null;
        name = toStringR(prefix, env) + toStringR(view, env);
        callback = this.buildClassEventCallback(env, _pClass, prefix);
        this.addEventListener(env, name, callback);
        return ZVal.assign(callback);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "prefix")
    protected Object buildClassEventCallback(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/View/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/View/Concerns/ManagesEvents.php");
        Object _pClass = assignParameter(args, 0, false);
        Object prefix = assignParameter(args, 1, false);
        Object runtimeTempArrayResult244 = null;
        Object method = null;
        ZVal.list(
                runtimeTempArrayResult244 = this.parseClassEvent(env, _pClass, prefix),
                (_pClass = listGet(runtimeTempArrayResult244, 0, env)),
                (method = listGet(runtimeTempArrayResult244, 1, env)));
        return ZVal.assign(
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\View\\Concerns",
                        this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object method = null;
                        Object _pClass = null;
                        method = this.contextReferences.getCapturedValue("method");
                        _pClass = this.contextReferences.getCapturedValue("class");
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
                                                                        Factory.this.container,
                                                                        "make",
                                                                        Factory.class,
                                                                        _pClass)),
                                                        new ZPair(1, method)),
                                                function_func_get_args
                                                        .f
                                                        .env(env)
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithInfo(args, this))
                                                        .call()
                                                        .value())
                                        .value());
                    }
                }.use("method", method).use("class", _pClass));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "prefix")
    protected Object parseClassEvent(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object prefix = assignParameter(args, 1, false);
        return ZVal.assign(
                Str.runtimeStaticObject.parseCallback(
                        env, _pClass, this.classEventMethodForPrefix(env, prefix)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prefix")
    protected Object classEventMethodForPrefix(RuntimeEnv env, Object... args) {
        Object prefix = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isTrue(Str.runtimeStaticObject.contains(env, prefix, "composing"))
                        ? "compose"
                        : "create");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "callback")
    protected Object addEventListener(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/View/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/View/Concerns/ManagesEvents.php");
        Object name = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        if (ZVal.isTrue(Str.runtimeStaticObject.contains(env, name, "*"))) {
            callback =
                    new Closure(
                            env,
                            runtimeConverterFunctionClassConstants,
                            "Illuminate\\View\\Concerns",
                            this) {
                        @Override
                        @ConvertedMethod
                        @ConvertedParameter(index = 0, name = "name")
                        @ConvertedParameter(index = 1, name = "data", typeHint = "array")
                        public Object run(
                                RuntimeEnv env,
                                Object thisvar,
                                PassByReferenceArgs runtimePassByReferenceArgs,
                                Object... args) {
                            Object name = assignParameter(args, 0, false);
                            ReferenceContainer data =
                                    new BasicReferenceContainer(assignParameter(args, 1, false));
                            Object callback = null;
                            callback = this.contextReferences.getCapturedValue("callback");
                            return ZVal.assign(
                                    env.callFunctionDynamic(
                                                    callback,
                                                    new RuntimeArgsWithReferences()
                                                            .add(
                                                                    0,
                                                                    new ArrayDimensionReference(
                                                                            data.getObject(), 0)),
                                                    data.arrayGet(env, 0))
                                            .value());
                        }
                    }.use("callback", callback);
        }

        env.callMethod(this.events, "listen", Factory.class, name, callback);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "view", typeHint = "Illuminate\\Contracts\\View\\View")
    public Object callComposer(RuntimeEnv env, Object... args) {
        Object view = assignParameter(args, 0, false);
        env.callMethod(
                this.events,
                "dispatch",
                Factory.class,
                "composing: " + toStringR(env.callMethod(view, "name", Factory.class), env),
                ZVal.newArray(new ZPair(0, view)));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "view", typeHint = "Illuminate\\Contracts\\View\\View")
    public Object callCreator(RuntimeEnv env, Object... args) {
        Object view = assignParameter(args, 0, false);
        env.callMethod(
                this.events,
                "dispatch",
                Factory.class,
                "creating: " + toStringR(env.callMethod(view, "name", Factory.class), env),
                ZVal.newArray(new ZPair(0, view)));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "section")
    @ConvertedParameter(
        index = 1,
        name = "content",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object startSection(RuntimeEnv env, Object... args) {
        Object section = assignParameter(args, 0, false);
        Object content = assignParameter(args, 1, true);
        if (null == content) {
            content = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(content, "===", ZVal.getNull())) {
            if (function_ob_start.f.env(env).call().getBool()) {
                new ReferenceClassProperty(this, "sectionStack", env).arrayAppend(env).set(section);
            }

        } else {
            this.extendSection(
                    env,
                    section,
                    ZVal.isTrue(
                                    ZVal.checkInstanceType(
                                            content,
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Illuminate
                                                    .namespaces
                                                    .Contracts
                                                    .namespaces
                                                    .View
                                                    .classes
                                                    .View
                                                    .class,
                                            "Illuminate\\Contracts\\View\\View"))
                            ? content
                            : e.f.env(env).call(content).value());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "section")
    @ConvertedParameter(index = 1, name = "content")
    public Object inject(RuntimeEnv env, Object... args) {
        Object section = assignParameter(args, 0, false);
        Object content = assignParameter(args, 1, false);
        this.startSection(env, section, content);
        return null;
    }

    @ConvertedMethod
    public Object yieldSection(RuntimeEnv env, Object... args) {
        if (ZVal.isEmpty(this.sectionStack)) {
            return "";
        }

        return ZVal.assign(this.yieldContent(env, this.stopSection(env)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "overwrite",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object stopSection(RuntimeEnv env, Object... args) {
        Object overwrite = assignParameter(args, 0, true);
        if (null == overwrite) {
            overwrite = false;
        }
        Object last = null;
        if (ZVal.isEmpty(this.sectionStack)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Cannot end a section without first starting one."));
        }

        last = function_array_pop.f.env(env).call(this.sectionStack).value();
        if (ZVal.isTrue(overwrite)) {
            new ReferenceClassProperty(this, "sections", env)
                    .arrayAccess(env, last)
                    .set(function_ob_get_clean.f.env(env).call().value());

        } else {
            this.extendSection(env, last, function_ob_get_clean.f.env(env).call().value());
        }

        return ZVal.assign(last);
    }

    @ConvertedMethod
    public Object appendSection(RuntimeEnv env, Object... args) {
        Object last = null;
        if (ZVal.isEmpty(this.sectionStack)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Cannot end a section without first starting one."));
        }

        last = function_array_pop.f.env(env).call(this.sectionStack).value();
        if (arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "sections", env), env, last)) {
            new ReferenceClassProperty(this, "sections", env)
                    .arrayAccess(env, last)
                    .set(
                            toStringR(
                                            new ReferenceClassProperty(this, "sections", env)
                                                    .arrayGet(env, last),
                                            env)
                                    + toStringR(
                                            function_ob_get_clean.f.env(env).call().value(), env));

        } else {
            new ReferenceClassProperty(this, "sections", env)
                    .arrayAccess(env, last)
                    .set(function_ob_get_clean.f.env(env).call().value());
        }

        return ZVal.assign(last);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "section")
    @ConvertedParameter(index = 1, name = "content")
    protected Object extendSection(RuntimeEnv env, Object... args) {
        ReferenceContainer section = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object content = assignParameter(args, 1, false);
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "sections", env),
                env,
                section.getObject())) {
            content =
                    function_str_replace
                            .f
                            .env(env)
                            .call(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Factory.class)
                                            .method("parentPlaceholder")
                                            .addReferenceArgs(
                                                    new RuntimeArgsWithReferences().add(0, section))
                                            .call(section.getObject())
                                            .value(),
                                    content,
                                    new ReferenceClassProperty(this, "sections", env)
                                            .arrayGet(env, section.getObject()))
                            .value();
        }

        new ReferenceClassProperty(this, "sections", env)
                .arrayAccess(env, section.getObject())
                .set(content);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "section")
    @ConvertedParameter(index = 1, name = "default")
    public Object yieldContent(RuntimeEnv env, Object... args) {
        ReferenceContainer section = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = "";
        }
        Object sectionContent = null;
        sectionContent =
                ZVal.assign(
                        ZVal.isTrue(
                                        ZVal.checkInstanceType(
                                                _pDefault,
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Illuminate
                                                        .namespaces
                                                        .Contracts
                                                        .namespaces
                                                        .View
                                                        .classes
                                                        .View
                                                        .class,
                                                "Illuminate\\Contracts\\View\\View"))
                                ? _pDefault
                                : e.f.env(env).call(_pDefault).value());
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "sections", env),
                env,
                section.getObject())) {
            sectionContent =
                    ZVal.assign(
                            new ReferenceClassProperty(this, "sections", env)
                                    .arrayGet(env, section.getObject()));
        }

        sectionContent =
                function_str_replace
                        .f
                        .env(env)
                        .call("@@parent", "--parent--holder--", sectionContent)
                        .value();
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                "--parent--holder--",
                                "@parent",
                                function_str_replace
                                        .f
                                        .env(env)
                                        .call(
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Factory.class)
                                                        .method("parentPlaceholder")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences()
                                                                        .add(0, section))
                                                        .call(section.getObject())
                                                        .value(),
                                                "",
                                                sectionContent)
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object hasSection(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(function_array_key_exists.f.env(env).call(name, this.sections).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getSection(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        handleReturnReference(this.getSections(env))
                                                .arrayGet(env, name))
                        ? ternaryExpressionTemp
                        : _pDefault);
    }

    @ConvertedMethod
    public Object getSections(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.sections);
    }

    @ConvertedMethod
    public Object flushSections(RuntimeEnv env, Object... args) {
        this.sections = ZVal.newArray();
        this.sectionStack = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    public Object addLoop(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        Object parent = null;
        Object length = null;
        Object ternaryExpressionTemp = null;
        length =
                ZVal.assign(
                        ZVal.toBool(function_is_array.f.env(env).call(data).value())
                                        || ZVal.toBool(
                                                ZVal.checkInstanceType(
                                                        data, Countable.class, "Countable"))
                                ? function_count.f.env(env).call(data).value()
                                : ZVal.getNull());
        parent = Arr.runtimeStaticObject.last(env, this.loopsStack);
        new ReferenceClassProperty(this, "loopsStack", env)
                .arrayAppend(env)
                .set(
                        ZVal.newArray(
                                new ZPair("iteration", 0),
                                new ZPair("index", 0),
                                new ZPair(
                                        "remaining",
                                        ZVal.isDefined(ternaryExpressionTemp = length)
                                                ? ternaryExpressionTemp
                                                : ZVal.getNull()),
                                new ZPair("count", length),
                                new ZPair("first", true),
                                new ZPair(
                                        "last",
                                        ZVal.isset(length)
                                                ? ZVal.equalityCheck(length, 1)
                                                : ZVal.getNull()),
                                new ZPair(
                                        "depth",
                                        ZVal.add(
                                                function_count
                                                        .f
                                                        .env(env)
                                                        .call(this.loopsStack)
                                                        .value(),
                                                1)),
                                new ZPair(
                                        "parent",
                                        ZVal.isTrue(parent) ? toObjectR(parent) : ZVal.getNull())));
        return null;
    }

    @ConvertedMethod
    public Object incrementLoopIndices(RuntimeEnv env, Object... args) {
        ReferenceContainer loop = new BasicReferenceContainer(null);
        Object index = null;
        loop.setObject(
                ZVal.assign(
                        new ReferenceClassProperty(this, "loopsStack", env)
                                .arrayGet(
                                        env,
                                        index =
                                                ZVal.subtract(
                                                        function_count
                                                                .f
                                                                .env(env)
                                                                .call(this.loopsStack)
                                                                .value(),
                                                        1))));
        new ReferenceClassProperty(this, "loopsStack", env)
                .arrayAccess(env, index)
                .set(
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        new ReferenceClassProperty(this, "loopsStack", env)
                                                .arrayGet(env, index),
                                        ZVal.newArray(
                                                new ZPair(
                                                        "iteration",
                                                        ZVal.add(
                                                                loop.arrayGet(env, "iteration"),
                                                                1)),
                                                new ZPair("index", loop.arrayGet(env, "iteration")),
                                                new ZPair(
                                                        "first",
                                                        ZVal.equalityCheck(
                                                                loop.arrayGet(env, "iteration"),
                                                                0)),
                                                new ZPair(
                                                        "remaining",
                                                        arrayActionR(
                                                                        ArrayAction.ISSET,
                                                                        loop,
                                                                        env,
                                                                        "count")
                                                                ? ZVal.subtract(
                                                                        loop.arrayGet(
                                                                                env, "remaining"),
                                                                        1)
                                                                : ZVal.getNull()),
                                                new ZPair(
                                                        "last",
                                                        arrayActionR(
                                                                        ArrayAction.ISSET,
                                                                        loop,
                                                                        env,
                                                                        "count")
                                                                ? ZVal.equalityCheck(
                                                                        loop.arrayGet(
                                                                                env, "iteration"),
                                                                        ZVal.subtract(
                                                                                loop.arrayGet(
                                                                                        env,
                                                                                        "count"),
                                                                                1))
                                                                : ZVal.getNull())))
                                .value());
        return null;
    }

    @ConvertedMethod
    public Object popLoop(RuntimeEnv env, Object... args) {
        function_array_pop.f.env(env).call(this.loopsStack);
        return null;
    }

    @ConvertedMethod
    public Object getLastLoop(RuntimeEnv env, Object... args) {
        Object last = null;
        if (ZVal.isTrue(last = Arr.runtimeStaticObject.last(env, this.loopsStack))) {
            return ZVal.assign(toObjectR(last));
        }

        return null;
    }

    @ConvertedMethod
    public Object getLoopStack(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.loopsStack);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "section")
    @ConvertedParameter(index = 1, name = "content")
    public Object startPush(RuntimeEnv env, Object... args) {
        Object section = assignParameter(args, 0, false);
        Object content = assignParameter(args, 1, true);
        if (null == content) {
            content = "";
        }
        if (ZVal.strictEqualityCheck(content, "===", "")) {
            if (function_ob_start.f.env(env).call().getBool()) {
                new ReferenceClassProperty(this, "pushStack", env).arrayAppend(env).set(section);
            }

        } else {
            this.extendPush(env, section, content);
        }

        return null;
    }

    @ConvertedMethod
    public Object stopPush(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/View/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/View/Concerns/ManagesStacks.php");
        if (ZVal.isEmpty(this.pushStack)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Cannot end a push stack without first starting one."));
        }

        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                function_array_pop.f.env(env).call(this.pushStack).value(),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\View\\Concerns",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "last")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object last = assignParameter(args, 0, false);
                                        Factory.this.extendPush(
                                                env,
                                                last,
                                                function_ob_get_clean.f.env(env).call().value());
                                        return null;
                                    }
                                })
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "section")
    @ConvertedParameter(index = 1, name = "content")
    protected Object extendPush(RuntimeEnv env, Object... args) {
        Object section = assignParameter(args, 0, false);
        Object content = assignParameter(args, 1, false);
        if (!arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "pushes", env), env, section)) {
            new ReferenceClassProperty(this, "pushes", env)
                    .arrayAccess(env, section)
                    .set(ZVal.newArray());
        }

        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "pushes", env),
                env,
                section,
                this.renderCount)) {
            new ReferenceClassProperty(this, "pushes", env)
                    .arrayAccess(env, section, this.renderCount)
                    .set(content);

        } else {
            new ReferenceClassProperty(this, "pushes", env)
                    .arrayAccess(env, section, this.renderCount)
                    .set(
                            toStringR(
                                            new ReferenceClassProperty(this, "pushes", env)
                                                    .arrayGet(env, section, this.renderCount),
                                            env)
                                    + toStringR(content, env));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "section")
    @ConvertedParameter(index = 1, name = "content")
    public Object startPrepend(RuntimeEnv env, Object... args) {
        Object section = assignParameter(args, 0, false);
        Object content = assignParameter(args, 1, true);
        if (null == content) {
            content = "";
        }
        if (ZVal.strictEqualityCheck(content, "===", "")) {
            if (function_ob_start.f.env(env).call().getBool()) {
                new ReferenceClassProperty(this, "pushStack", env).arrayAppend(env).set(section);
            }

        } else {
            this.extendPrepend(env, section, content);
        }

        return null;
    }

    @ConvertedMethod
    public Object stopPrepend(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/View/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/View/Concerns/ManagesStacks.php");
        if (ZVal.isEmpty(this.pushStack)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Cannot end a prepend operation without first starting one."));
        }

        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                function_array_pop.f.env(env).call(this.pushStack).value(),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\View\\Concerns",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "last")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object last = assignParameter(args, 0, false);
                                        Factory.this.extendPrepend(
                                                env,
                                                last,
                                                function_ob_get_clean.f.env(env).call().value());
                                        return null;
                                    }
                                })
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "section")
    @ConvertedParameter(index = 1, name = "content")
    protected Object extendPrepend(RuntimeEnv env, Object... args) {
        Object section = assignParameter(args, 0, false);
        Object content = assignParameter(args, 1, false);
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "prepends", env),
                env,
                section)) {
            new ReferenceClassProperty(this, "prepends", env)
                    .arrayAccess(env, section)
                    .set(ZVal.newArray());
        }

        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "prepends", env),
                env,
                section,
                this.renderCount)) {
            new ReferenceClassProperty(this, "prepends", env)
                    .arrayAccess(env, section, this.renderCount)
                    .set(content);

        } else {
            new ReferenceClassProperty(this, "prepends", env)
                    .arrayAccess(env, section, this.renderCount)
                    .set(
                            toStringR(content, env)
                                    + toStringR(
                                            new ReferenceClassProperty(this, "prepends", env)
                                                    .arrayGet(env, section, this.renderCount),
                                            env));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "section")
    @ConvertedParameter(index = 1, name = "default")
    public Object yieldPushContent(RuntimeEnv env, Object... args) {
        Object section = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = "";
        }
        Object output = null;
        if (ZVal.toBool(
                        !arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "pushes", env),
                                env,
                                section))
                && ZVal.toBool(
                        !arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "prepends", env),
                                env,
                                section))) {
            return ZVal.assign(_pDefault);
        }

        output = "";
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "prepends", env),
                env,
                section)) {
            output =
                    toStringR(output, env)
                            + toStringR(
                                    NamespaceGlobal.implode
                                            .env(env)
                                            .call(
                                                    function_array_reverse
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    new ReferenceClassProperty(
                                                                                    this,
                                                                                    "prepends",
                                                                                    env)
                                                                            .arrayGet(env, section))
                                                            .value())
                                            .value(),
                                    env);
        }

        if (arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "pushes", env), env, section)) {
            output =
                    toStringR(output, env)
                            + toStringR(
                                    NamespaceGlobal.implode
                                            .env(env)
                                            .call(
                                                    new ReferenceClassProperty(this, "pushes", env)
                                                            .arrayGet(env, section))
                                            .value(),
                                    env);
        }

        return ZVal.assign(output);
    }

    @ConvertedMethod
    public Object flushStacks(RuntimeEnv env, Object... args) {
        this.pushes = ZVal.newArray();
        this.prepends = ZVal.newArray();
        this.pushStack = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "replacements",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object startTranslation(RuntimeEnv env, Object... args) {
        Object replacements = assignParameter(args, 0, true);
        if (null == replacements) {
            replacements = ZVal.newArray();
        }
        function_ob_start.f.env(env).call();
        this.translationReplacements = replacements;
        return null;
    }

    @ConvertedMethod
    public Object renderTranslation(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this.container, "make", Factory.class, "translator"),
                        "getFromJson",
                        Factory.class,
                        function_trim
                                .f
                                .env(env)
                                .call(function_ob_get_clean.f.env(env).call().value())
                                .value(),
                        this.translationReplacements));
    }

    public static final Object CONST_class = "Illuminate\\View\\Factory";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "section")
        public Object parentPlaceholder(RuntimeEnv env, Object... args) {
            Object section = assignParameter(args, 0, true);
            if (null == section) {
                section = "";
            }
            if (!arrayActionR(
                    ArrayAction.ISSET,
                    env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Illuminate
                                    .namespaces
                                    .View
                                    .classes
                                    .Factory
                                    .RequestStaticProperties
                                    .class,
                            "parentPlaceholder"),
                    env,
                    section)) {
                env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Illuminate
                                        .namespaces
                                        .View
                                        .classes
                                        .Factory
                                        .RequestStaticProperties
                                        .class,
                                "parentPlaceholder")
                        .arrayAccess(env, section)
                        .set(
                                "##parent-placeholder-"
                                        + toStringR(
                                                NamespaceGlobal.sha1.env(env).call(section).value(),
                                                env)
                                        + "##");
            }

            return ZVal.assign(
                    env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .View
                                            .classes
                                            .Factory
                                            .RequestStaticProperties
                                            .class,
                                    "parentPlaceholder")
                            .arrayGet(env, section));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object parentPlaceholder = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\View\\Factory")
                    .setLookup(
                            Factory.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "componentData",
                            "componentStack",
                            "composers",
                            "container",
                            "engines",
                            "events",
                            "extensions",
                            "finder",
                            "loopsStack",
                            "prepends",
                            "pushStack",
                            "pushes",
                            "renderCount",
                            "sectionStack",
                            "sections",
                            "shared",
                            "slotStack",
                            "slots",
                            "translationReplacements")
                    .setStaticPropertyNames("parentPlaceholder")
                    .setFilename("vendor/laravel/framework/src/Illuminate/View/Factory.php")
                    .addInterface("Illuminate\\Contracts\\View\\Factory")
                    .addTrait("Illuminate\\View\\Concerns\\ManagesComponents")
                    .addTrait("Illuminate\\View\\Concerns\\ManagesEvents")
                    .addTrait("Illuminate\\View\\Concerns\\ManagesLayouts")
                    .addTrait("Illuminate\\View\\Concerns\\ManagesLoops")
                    .addTrait("Illuminate\\View\\Concerns\\ManagesStacks")
                    .addTrait("Illuminate\\View\\Concerns\\ManagesTranslations")
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
