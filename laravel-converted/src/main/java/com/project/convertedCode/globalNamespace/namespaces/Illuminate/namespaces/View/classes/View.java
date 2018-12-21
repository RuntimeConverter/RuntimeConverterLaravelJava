package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.View.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.ArrayAccess;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Renderable;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Arrayable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.MessageProvider;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.MessageBag;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/View/View.php

*/

public class View extends RuntimeClassBase
        implements ArrayAccess,
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
                        .View {

    public Object factory = null;

    public Object engine = null;

    public Object view = null;

    public Object data = null;

    public Object path = null;

    public View(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == View.class) {
            this.__construct(env, args);
        }
    }

    public View(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "factory", typeHint = "Illuminate\\View\\Factory")
    @ConvertedParameter(
        index = 1,
        name = "engine",
        typeHint = "Illuminate\\Contracts\\View\\Engine"
    )
    @ConvertedParameter(index = 2, name = "view")
    @ConvertedParameter(index = 3, name = "path")
    @ConvertedParameter(index = 4, name = "data", defaultValue = "", defaultValueType = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object factory = assignParameter(args, 0, false);
        Object engine = assignParameter(args, 1, false);
        Object view = assignParameter(args, 2, false);
        Object path = assignParameter(args, 3, false);
        Object data = assignParameter(args, 4, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        this.view = view;
        this.path = path;
        this.engine = engine;
        this.factory = factory;
        this.data =
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        data,
                                        Arrayable.class,
                                        "Illuminate\\Contracts\\Support\\Arrayable"))
                        ? env.callMethod(data, "toArray", View.class)
                        : rToArrayCast(data);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "callback",
        typeHint = "callable",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object render(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object e = null;
        Object contents = null;
        Object response = null;
        try {
            contents = this.renderContents(env);
            response =
                    ZVal.assign(
                            ZVal.isset(callback)
                                    ? function_call_user_func
                                            .f
                                            .env(env)
                                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                            .call(callback, this, contents)
                                            .value()
                                    : ZVal.getNull());
            env.callMethod(this.factory, "flushStateIfDoneRendering", View.class);
            return ZVal.assign(
                    !function_is_null.f.env(env).call(response).getBool() ? response : contents);
        } catch (ConvertedException convertedException70) {
            if (convertedException70.instanceOf(PHPException.class, "Exception")) {
                e = convertedException70.getObject();
                env.callMethod(this.factory, "flushState", View.class);
                throw ZVal.getException(env, e);
            } else if (convertedException70.instanceOf(Throwable.class, "Throwable")) {
                e = convertedException70.getObject();
                env.callMethod(this.factory, "flushState", View.class);
                throw ZVal.getException(env, e);
            } else {
                throw convertedException70;
            }
        }
    }

    @ConvertedMethod
    protected Object renderContents(RuntimeEnv env, Object... args) {
        Object contents = null;
        env.callMethod(this.factory, "incrementRender", View.class);
        env.callMethod(this.factory, "callComposer", View.class, this);
        contents = this.getContents(env);
        env.callMethod(this.factory, "decrementRender", View.class);
        return ZVal.assign(contents);
    }

    @ConvertedMethod
    protected Object getContents(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(this.engine, "get", View.class, this.path, this.gatherData(env)));
    }

    @ConvertedMethod
    protected Object gatherData(RuntimeEnv env, Object... args) {
        ReferenceContainer data = new BasicReferenceContainer(null);
        Object value = null;
        Object key = null;
        data.setObject(
                function_array_merge
                        .f
                        .env(env)
                        .call(env.callMethod(this.factory, "getShared", View.class), this.data)
                        .value());
        for (ZPair zpairResult649 : ZVal.getIterable(data.getObject(), env, false)) {
            key = ZVal.assign(zpairResult649.getKey());
            value = ZVal.assign(zpairResult649.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            value,
                            Renderable.class,
                            "Illuminate\\Contracts\\Support\\Renderable"))) {
                data.arrayAccess(env, key).set(env.callMethod(value, "render", View.class));
            }
        }

        return ZVal.assign(data.getObject());
    }

    @ConvertedMethod
    public Object renderSections(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/View")
                        .setFile("/vendor/laravel/framework/src/Illuminate/View/View.php");
        return ZVal.assign(
                this.render(
                        env,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\View",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                return ZVal.assign(
                                        env.callMethod(
                                                View.this.factory, "getSections", View.class));
                            }
                        }));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object with(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        if (function_is_array.f.env(env).call(key).getBool()) {
            this.data = function_array_merge.f.env(env).call(this.data, key).value();

        } else {
            new ReferenceClassProperty(this, "data", env).arrayAccess(env, key).set(value);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "view")
    @ConvertedParameter(
        index = 2,
        name = "data",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object nest(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object view = assignParameter(args, 1, false);
        Object data = assignParameter(args, 2, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        return ZVal.assign(
                this.with(env, key, env.callMethod(this.factory, "make", View.class, view, data)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "provider")
    public Object withErrors(RuntimeEnv env, Object... args) {
        Object provider = assignParameter(args, 0, false);
        this.with(env, "errors", this.formatErrors(env, provider));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "provider")
    protected Object formatErrors(RuntimeEnv env, Object... args) {
        Object provider = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        provider,
                                        MessageProvider.class,
                                        "Illuminate\\Contracts\\Support\\MessageProvider"))
                        ? env.callMethod(provider, "getMessageBag", View.class)
                        : new MessageBag(env, rToArrayCast(provider)));
    }

    @ConvertedMethod
    public Object name(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getName(env));
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.view);
    }

    @ConvertedMethod
    public Object getData(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.data);
    }

    @ConvertedMethod
    public Object getPath(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.path);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object setPath(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        this.path = path;
        return null;
    }

    @ConvertedMethod
    public Object getFactory(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.factory);
    }

    @ConvertedMethod
    public Object getEngine(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.engine);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object offsetExists(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(function_array_key_exists.f.env(env).call(key, this.data).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object offsetGet(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(new ReferenceClassProperty(this, "data", env).arrayGet(env, key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object offsetSet(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        this.with(env, key, value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object offsetUnset(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        arrayActionR(ArrayAction.UNSET, new ReferenceClassProperty(this, "data", env), env, key);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object __get(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return new ArrayDimensionReference(this.data, key);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object __set(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        this.with(env, key, value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object __isset(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "data", env),
                        env,
                        key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object __unset(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        arrayActionR(ArrayAction.UNSET, new ReferenceClassProperty(this, "data", env), env, key);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        ReferenceContainer method = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 1, false));
        if (ZVal.isTrue(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, View.class)
                        .method("hasMacro")
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(0, method))
                        .call(method.getObject())
                        .value())) {
            return ZVal.assign(
                    env.callMethod(
                            this,
                            "macroCall",
                            View.class,
                            method.getObject(),
                            parameters.getObject()));
        }

        if (!ZVal.isTrue(Str.runtimeStaticObject.startsWith(env, method.getObject(), "with"))) {
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

        return ZVal.assign(
                this.with(
                        env,
                        Str.runtimeStaticObject.camel(
                                env,
                                function_substr.f.env(env).call(method.getObject(), 4).value()),
                        parameters.arrayGet(env, 0)));
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.render(env));
    }

    public static final Object CONST_class = "Illuminate\\View\\View";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

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
                                    .View
                                    .classes
                                    .View
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
                            View.class,
                            ZVal.toLong(256) | ZVal.toLong(512));
            for (ZPair zpairResult2382 : ZVal.getIterable(methods, env, true)) {
                method = ZVal.assign(zpairResult2382.getValue());
                env.callMethod(method, "setAccessible", View.class, true);
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, View.class)
                        .method("macro")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                toObjectR(method).accessProp(this, env).name("name").value(),
                                env.callMethod(method, "invoke", View.class, mixin))
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
                                            .View
                                            .classes
                                            .View
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
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, View.class)
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
                                                    .View
                                                    .classes
                                                    .View
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
                                                                        .View
                                                                        .classes
                                                                        .View
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
                                                            .View
                                                            .classes
                                                            .View
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
                    .setName("Illuminate\\View\\View")
                    .setLookup(
                            View.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("data", "engine", "factory", "path", "view")
                    .setStaticPropertyNames("macros")
                    .setFilename("vendor/laravel/framework/src/Illuminate/View/View.php")
                    .addInterface("ArrayAccess")
                    .addInterface("Illuminate\\Contracts\\View\\View")
                    .addInterface("Illuminate\\Contracts\\Support\\Renderable")
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
