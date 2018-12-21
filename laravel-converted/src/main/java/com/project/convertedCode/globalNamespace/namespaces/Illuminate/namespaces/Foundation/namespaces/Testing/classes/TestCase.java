package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Testing.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Testing.classes.DatabaseTransactions;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Testing.classes.TestResponse;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Testing.classes.WithFaker;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Testing.classes.WithoutMiddleware;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Debug.classes.ExceptionHandler;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Testing.namespaces.Constraints.classes.HasInDatabase;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_property_exists;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Testing.namespaces.Constraints.classes.SoftDeletedInDatabase;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Testing.classes.DatabaseMigrations;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Application;
import com.project.convertedCode.globalNamespace.functions.collect;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Facade;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Validation.classes.ValidationException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_flip;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.classes.Mockery;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.LogicalNot;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Testing.classes.WithoutEvents;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_replace;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Carbon;
import com.project.convertedCode.globalNamespace.functions.class_uses_recursive;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.classes.UploadedFile;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Testing.classes.RefreshDatabase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.Model;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.functions.config;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Testing/TestCase.php

*/

public abstract class TestCase
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .PHPUnit
                .namespaces
                .Framework
                .classes
                .TestCase {

    public Object app = null;

    public Object afterApplicationCreatedCallbacks = ZVal.newArray();

    public Object beforeApplicationDestroyedCallbacks = ZVal.newArray();

    public Object setUpHasRun = false;

    public Object defaultHeaders = ZVal.newArray();

    public Object serverVariables = ZVal.newArray();

    public Object followRedirects = false;

    public Object originalExceptionHandler = null;

    public Object firedEvents = ZVal.newArray();

    public Object firedModelEvents = ZVal.newArray();

    public Object dispatchedJobs = ZVal.newArray();

    public Object dispatchedNotifications = ZVal.newArray();

    public TestCase(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TestCase.class) {
            this.__construct(env, args);
        }
    }

    public TestCase(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    protected Object setUp(RuntimeEnv env, Object... args) {
        Object callback = null;
        if (!ZVal.isTrue(this.app)) {
            this.refreshApplication(env);
        }

        this.setUpTraits(env);
        for (ZPair zpairResult444 :
                ZVal.getIterable(this.afterApplicationCreatedCallbacks, env, true)) {
            callback = ZVal.assign(zpairResult444.getValue());
            function_call_user_func
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                    .call(callback);
        }

        Facade.runtimeStaticObject.clearResolvedInstances(env);
        Model.runtimeStaticObject.setEventDispatcher(
                env, new ReferenceClassProperty(this, "app", env).arrayGet(env, "events"));
        this.setUpHasRun = true;
        return null;
    }

    @ConvertedMethod
    protected Object refreshApplication(RuntimeEnv env, Object... args) {
        this.app = env.callMethod(this, "createApplication", TestCase.class);
        return null;
    }

    @ConvertedMethod
    protected Object setUpTraits(RuntimeEnv env, Object... args) {
        ReferenceContainer uses = new BasicReferenceContainer(null);
        uses.setObject(
                function_array_flip
                        .f
                        .env(env)
                        .call(
                                class_uses_recursive
                                        .f
                                        .env(env)
                                        .call(
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "class"))
                                        .value())
                        .value());
        if (arrayActionR(ArrayAction.ISSET, uses, env, RefreshDatabase.CONST_class)) {
            env.callMethod(this, "refreshDatabase", TestCase.class);
        }

        if (arrayActionR(ArrayAction.ISSET, uses, env, DatabaseMigrations.CONST_class)) {
            env.callMethod(this, "runDatabaseMigrations", TestCase.class);
        }

        if (arrayActionR(ArrayAction.ISSET, uses, env, DatabaseTransactions.CONST_class)) {
            env.callMethod(this, "beginDatabaseTransaction", TestCase.class);
        }

        if (arrayActionR(ArrayAction.ISSET, uses, env, WithoutMiddleware.CONST_class)) {
            env.callMethod(this, "disableMiddlewareForAllTests", TestCase.class);
        }

        if (arrayActionR(ArrayAction.ISSET, uses, env, WithoutEvents.CONST_class)) {
            env.callMethod(this, "disableEventsForAllTests", TestCase.class);
        }

        if (arrayActionR(ArrayAction.ISSET, uses, env, WithFaker.CONST_class)) {
            env.callMethod(this, "setUpFaker", TestCase.class);
        }

        return ZVal.assign(uses.getObject());
    }

    @ConvertedMethod
    protected Object tearDown(RuntimeEnv env, Object... args) {
        Object container = null;
        Object callback = null;
        if (ZVal.isTrue(this.app)) {
            for (ZPair zpairResult445 :
                    ZVal.getIterable(this.beforeApplicationDestroyedCallbacks, env, true)) {
                callback = ZVal.assign(zpairResult445.getValue());
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(callback);
            }

            env.callMethod(this.app, "flush", TestCase.class);
            this.app = ZVal.getNull();
        }

        this.setUpHasRun = false;
        if (function_property_exists.f.env(env).call(this, "serverVariables").getBool()) {
            this.serverVariables = ZVal.newArray();
        }

        if (function_property_exists.f.env(env).call(this, "defaultHeaders").getBool()) {
            this.defaultHeaders = ZVal.newArray();
        }

        if (function_class_exists.f.env(env).call("Mockery").getBool()) {
            if (ZVal.isTrue(container = Mockery.runtimeStaticObject.getContainer(env))) {
                env.callMethod(
                        this,
                        "addToAssertionCount",
                        TestCase.class,
                        env.callMethod(container, "mockery_getExpectationCount", TestCase.class));
            }

            Mockery.runtimeStaticObject.close(env);
        }

        if (function_class_exists.f.env(env).call(Carbon.CONST_class).getBool()) {
            Carbon.runtimeStaticObject.setTestNow(env);
        }

        this.afterApplicationCreatedCallbacks = ZVal.newArray();
        this.beforeApplicationDestroyedCallbacks = ZVal.newArray();
        Application.runtimeStaticObject.forgetBootstrappers(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "callable")
    public Object afterApplicationCreated(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "afterApplicationCreatedCallbacks", env)
                .arrayAppend(env)
                .set(callback);
        if (ZVal.isTrue(this.setUpHasRun)) {
            function_call_user_func
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                    .call(callback);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "callable")
    protected Object beforeApplicationDestroyed(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "beforeApplicationDestroyedCallbacks", env)
                .arrayAppend(env)
                .set(callback);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    @ConvertedParameter(index = 1, name = "instance")
    protected Object swap(RuntimeEnv env, Object... args) {
        Object _pAbstract = assignParameter(args, 0, false);
        Object instance = assignParameter(args, 1, false);
        return ZVal.assign(this.instance(env, _pAbstract, instance));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    @ConvertedParameter(index = 1, name = "instance")
    protected Object instance(RuntimeEnv env, Object... args) {
        Object _pAbstract = assignParameter(args, 0, false);
        Object instance = assignParameter(args, 1, false);
        env.callMethod(this.app, "instance", TestCase.class, _pAbstract, instance);
        return ZVal.assign(instance);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "headers", typeHint = "array")
    public Object withHeaders(RuntimeEnv env, Object... args) {
        Object headers = assignParameter(args, 0, false);
        this.defaultHeaders =
                function_array_merge.f.env(env).call(this.defaultHeaders, headers).value();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    @ConvertedParameter(index = 1, name = "value", typeHint = "string")
    public Object withHeader(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "defaultHeaders", env).arrayAccess(env, name).set(value);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object flushHeaders(RuntimeEnv env, Object... args) {
        this.defaultHeaders = ZVal.newArray();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "server", typeHint = "array")
    public Object withServerVariables(RuntimeEnv env, Object... args) {
        Object server = assignParameter(args, 0, false);
        this.serverVariables = server;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "middleware",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object withoutMiddleware(RuntimeEnv env, Object... args) {
        Object middleware = assignParameter(args, 0, true);
        if (null == middleware) {
            middleware = ZVal.getNull();
        }
        Object _pAbstract = null;
        if (function_is_null.f.env(env).call(middleware).getBool()) {
            env.callMethod(this.app, "instance", TestCase.class, "middleware.disable", true);
            return ZVal.assign(this);
        }

        for (ZPair zpairResult2309 : ZVal.getIterable(rToArrayCast(middleware), env, true)) {
            _pAbstract = ZVal.assign(zpairResult2309.getValue());
            env.callMethod(
                    this.app,
                    "instance",
                    TestCase.class,
                    _pAbstract,
                    env
                            .createNew( // Conversion Note: class named AnonymousClass3544 was here
                                        // in the source code
                                    env.addManualClassLoad(
                                            "Illuminate\\Foundation\\Testing\\Concerns\\AnonymousClass3544")));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "middleware",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object withMiddleware(RuntimeEnv env, Object... args) {
        Object middleware = assignParameter(args, 0, true);
        if (null == middleware) {
            middleware = ZVal.getNull();
        }
        Object _pAbstract = null;
        if (function_is_null.f.env(env).call(middleware).getBool()) {
            arrayActionR(
                    ArrayAction.UNSET,
                    new ReferenceClassProperty(this, "app", env),
                    env,
                    "middleware.disable");
            return ZVal.assign(this);
        }

        for (ZPair zpairResult2310 : ZVal.getIterable(rToArrayCast(middleware), env, true)) {
            _pAbstract = ZVal.assign(zpairResult2310.getValue());
            arrayActionR(
                    ArrayAction.UNSET,
                    new ReferenceClassProperty(this, "app", env),
                    env,
                    _pAbstract);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object followingRedirects(RuntimeEnv env, Object... args) {
        this.followRedirects = true;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "url", typeHint = "string")
    public Object from(RuntimeEnv env, Object... args) {
        Object url = assignParameter(args, 0, false);
        return ZVal.assign(this.withHeader(env, "referer", url));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    @ConvertedParameter(
        index = 1,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object get(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        Object headers = assignParameter(args, 1, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        Object server = null;
        server = this.transformHeadersToServerVars(env, headers);
        return ZVal.assign(
                this.call(
                        env,
                        "GET",
                        uri,
                        ZVal.newArray(),
                        ZVal.newArray(),
                        ZVal.newArray(),
                        server));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    @ConvertedParameter(
        index = 1,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object getJson(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        Object headers = assignParameter(args, 1, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        return ZVal.assign(this.json(env, "GET", uri, ZVal.newArray(), headers));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    @ConvertedParameter(
        index = 1,
        name = "data",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object post(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        Object headers = assignParameter(args, 2, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        Object server = null;
        server = this.transformHeadersToServerVars(env, headers);
        return ZVal.assign(
                this.call(env, "POST", uri, data, ZVal.newArray(), ZVal.newArray(), server));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    @ConvertedParameter(
        index = 1,
        name = "data",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object postJson(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        Object headers = assignParameter(args, 2, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        return ZVal.assign(this.json(env, "POST", uri, data, headers));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    @ConvertedParameter(
        index = 1,
        name = "data",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object put(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        Object headers = assignParameter(args, 2, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        Object server = null;
        server = this.transformHeadersToServerVars(env, headers);
        return ZVal.assign(
                this.call(env, "PUT", uri, data, ZVal.newArray(), ZVal.newArray(), server));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    @ConvertedParameter(
        index = 1,
        name = "data",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object putJson(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        Object headers = assignParameter(args, 2, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        return ZVal.assign(this.json(env, "PUT", uri, data, headers));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    @ConvertedParameter(
        index = 1,
        name = "data",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object patch(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        Object headers = assignParameter(args, 2, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        Object server = null;
        server = this.transformHeadersToServerVars(env, headers);
        return ZVal.assign(
                this.call(env, "PATCH", uri, data, ZVal.newArray(), ZVal.newArray(), server));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    @ConvertedParameter(
        index = 1,
        name = "data",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object patchJson(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        Object headers = assignParameter(args, 2, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        return ZVal.assign(this.json(env, "PATCH", uri, data, headers));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    @ConvertedParameter(
        index = 1,
        name = "data",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object delete(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        Object headers = assignParameter(args, 2, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        Object server = null;
        server = this.transformHeadersToServerVars(env, headers);
        return ZVal.assign(
                this.call(env, "DELETE", uri, data, ZVal.newArray(), ZVal.newArray(), server));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    @ConvertedParameter(
        index = 1,
        name = "data",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object deleteJson(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        Object headers = assignParameter(args, 2, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        return ZVal.assign(this.json(env, "DELETE", uri, data, headers));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "uri")
    @ConvertedParameter(
        index = 2,
        name = "data",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 3,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object json(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object uri = assignParameter(args, 1, false);
        ReferenceContainer data = new BasicReferenceContainer(assignParameter(args, 2, true));
        if (null == data.getObject()) {
            data.setObject(ZVal.newArray());
        }
        Object headers = assignParameter(args, 3, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        Object files = null;
        Object content = null;
        files =
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences().add(0, data),
                        "extractFilesFromDataArray",
                        TestCase.class,
                        data.getObject());
        content = NamespaceGlobal.json_encode.env(env).call(data.getObject()).value();
        headers =
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair(
                                                "CONTENT_LENGTH",
                                                NamespaceGlobal.mb_strlen
                                                        .env(env)
                                                        .call(content, "8bit")
                                                        .value()),
                                        new ZPair("CONTENT_TYPE", "application/json"),
                                        new ZPair("Accept", "application/json")),
                                headers)
                        .value();
        return ZVal.assign(
                this.call(
                        env,
                        method,
                        uri,
                        ZVal.newArray(),
                        ZVal.newArray(),
                        files,
                        this.transformHeadersToServerVars(env, headers),
                        content));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "uri")
    @ConvertedParameter(
        index = 2,
        name = "parameters",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 3, name = "cookies", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(index = 4, name = "files", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(index = 5, name = "server", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 6,
        name = "content",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object uri = assignParameter(args, 1, false);
        ReferenceContainer parameters = new BasicReferenceContainer(assignParameter(args, 2, true));
        if (null == parameters.getObject()) {
            parameters.setObject(ZVal.newArray());
        }
        Object cookies = assignParameter(args, 3, true);
        if (null == cookies) {
            cookies = ZVal.newArray();
        }
        Object files = assignParameter(args, 4, true);
        if (null == files) {
            files = ZVal.newArray();
        }
        Object server = assignParameter(args, 5, true);
        if (null == server) {
            server = ZVal.newArray();
        }
        Object content = assignParameter(args, 6, true);
        if (null == content) {
            content = ZVal.getNull();
        }
        Object request = null;
        Object symfonyRequest = null;
        Object kernel = null;
        Object response = null;
        kernel =
                env.callMethod(
                        this.app,
                        "make",
                        TestCase.class,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Illuminate
                                .namespaces
                                .Contracts
                                .namespaces
                                .Http
                                .classes
                                .Kernel
                                .CONST_class);
        files =
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                files,
                                env.callMethod(
                                        this,
                                        new RuntimeArgsWithReferences().add(0, parameters),
                                        "extractFilesFromDataArray",
                                        TestCase.class,
                                        parameters.getObject()))
                        .value();
        symfonyRequest =
                com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component
                        .namespaces.HttpFoundation.classes.Request.runtimeStaticObject.create(
                        env,
                        this.prepareUrlForRequest(env, uri),
                        method,
                        parameters.getObject(),
                        cookies,
                        files,
                        function_array_replace
                                .f
                                .env(env)
                                .call(this.serverVariables, server)
                                .value(),
                        content);
        response =
                env.callMethod(
                        kernel,
                        "handle",
                        TestCase.class,
                        request =
                                com.project.convertedCode.globalNamespace.namespaces.Illuminate
                                        .namespaces.Http.classes.Request.runtimeStaticObject
                                        .createFromBase(env, symfonyRequest));
        if (ZVal.isTrue(this.followRedirects)) {
            response = this.followRedirects(env, response);
        }

        env.callMethod(kernel, "terminate", TestCase.class, request, response);
        return ZVal.assign(this.createTestResponse(env, response));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    protected Object prepareUrlForRequest(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        if (ZVal.isTrue(Str.runtimeStaticObject.startsWith(env, uri, "/"))) {
            uri = function_substr.f.env(env).call(uri, 1).value();
        }

        if (!ZVal.isTrue(Str.runtimeStaticObject.startsWith(env, uri, "http"))) {
            uri =
                    toStringR(config.f.env(env).call("app.url").value(), env)
                            + "/"
                            + toStringR(uri, env);
        }

        return ZVal.assign(function_trim.f.env(env).call(uri, "/").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "headers", typeHint = "array")
    protected Object transformHeadersToServerVars(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Testing/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Testing/Concerns/MakesHttpRequests.php");
        Object headers = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                collect.f
                                        .env(env)
                                        .call(
                                                function_array_merge
                                                        .f
                                                        .env(env)
                                                        .call(this.defaultHeaders, headers)
                                                        .value())
                                        .value(),
                                "mapWithKeys",
                                TestCase.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Foundation\\Testing\\Concerns",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "value")
                                    @ConvertedParameter(index = 1, name = "name")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object value = assignParameter(args, 0, false);
                                        Object name = assignParameter(args, 1, false);
                                        name =
                                                NamespaceGlobal.strtr
                                                        .env(env)
                                                        .call(
                                                                NamespaceGlobal.strtoupper
                                                                        .env(env)
                                                                        .call(name)
                                                                        .value(),
                                                                "-",
                                                                "_")
                                                        .value();
                                        return ZVal.assign(
                                                ZVal.newArray(
                                                        new ZPair(
                                                                TestCase.this.formatServerHeaderKey(
                                                                        env, name),
                                                                value)));
                                    }
                                }),
                        "all",
                        TestCase.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object formatServerHeaderKey(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        if (ZVal.toBool(
                        ZVal.toBool(
                                        !ZVal.isTrue(
                                                Str.runtimeStaticObject.startsWith(
                                                        env, name, "HTTP_")))
                                && ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(name, "!==", "CONTENT_TYPE")))
                && ZVal.toBool(ZVal.strictNotEqualityCheck(name, "!==", "REMOTE_ADDR"))) {
            return ZVal.assign("HTTP_" + toStringR(name, env));
        }

        return ZVal.assign(name);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    protected Object extractFilesFromDataArray(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer data = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        ReferenceContainer files = new BasicReferenceContainer(null);
        ReferenceContainer value = new BasicReferenceContainer(null);
        Object key = null;
        files.setObject(ZVal.newArray());
        for (ZPair zpairResult2311 : ZVal.getIterable(data.getObject(), env, false)) {
            key = ZVal.assign(zpairResult2311.getKey());
            value.setObject(ZVal.assign(zpairResult2311.getValue()));
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            value.getObject(),
                            UploadedFile.class,
                            "Symfony\\Component\\HttpFoundation\\File\\UploadedFile"))) {
                files.arrayAccess(env, key).set(value.getObject());
                arrayActionR(ArrayAction.UNSET, data, env, key);
            }

            if (function_is_array.f.env(env).call(value.getObject()).getBool()) {
                files.arrayAccess(env, key)
                        .set(
                                env.callMethod(
                                        this,
                                        new RuntimeArgsWithReferences().add(0, value),
                                        "extractFilesFromDataArray",
                                        TestCase.class,
                                        value.getObject()));
                data.arrayAccess(env, key).set(value.getObject());
            }
        }

        return ZVal.assign(files.getObject());
    }

    public Object extractFilesFromDataArray(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "response")
    protected Object followRedirects(RuntimeEnv env, Object... args) {
        Object response = assignParameter(args, 0, false);
        while (ZVal.isTrue(env.callMethod(response, "isRedirect", TestCase.class))) {
            response =
                    this.get(
                            env,
                            env.callMethod(
                                    toObjectR(response)
                                            .accessProp(this, env)
                                            .name("headers")
                                            .value(),
                                    "get",
                                    TestCase.class,
                                    "Location"));
        }

        this.followRedirects = false;
        return ZVal.assign(response);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "response")
    protected Object createTestResponse(RuntimeEnv env, Object... args) {
        Object response = assignParameter(args, 0, false);
        return ZVal.assign(TestResponse.runtimeStaticObject.fromBaseResponse(env, response));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "user",
        typeHint = "Illuminate\\Contracts\\Auth\\Authenticatable"
    )
    @ConvertedParameter(
        index = 1,
        name = "driver",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object actingAs(RuntimeEnv env, Object... args) {
        Object user = assignParameter(args, 0, false);
        Object driver = assignParameter(args, 1, true);
        if (null == driver) {
            driver = ZVal.getNull();
        }
        this.be(env, user, driver);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "user",
        typeHint = "Illuminate\\Contracts\\Auth\\Authenticatable"
    )
    @ConvertedParameter(
        index = 1,
        name = "driver",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object be(RuntimeEnv env, Object... args) {
        Object user = assignParameter(args, 0, false);
        Object driver = assignParameter(args, 1, true);
        if (null == driver) {
            driver = ZVal.getNull();
        }
        env.callMethod(
                env.callMethod(
                        new ReferenceClassProperty(this, "app", env).arrayGet(env, "auth"),
                        "guard",
                        TestCase.class,
                        driver),
                "setUser",
                TestCase.class,
                user);
        env.callMethod(
                new ReferenceClassProperty(this, "app", env).arrayGet(env, "auth"),
                "shouldUse",
                TestCase.class,
                driver);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "guard",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object assertAuthenticated(RuntimeEnv env, Object... args) {
        Object guard = assignParameter(args, 0, true);
        if (null == guard) {
            guard = ZVal.getNull();
        }
        env.callMethod(
                this,
                "assertTrue",
                TestCase.class,
                this.isAuthenticated(env, guard),
                "The user is not authenticated");
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "guard",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object assertGuest(RuntimeEnv env, Object... args) {
        Object guard = assignParameter(args, 0, true);
        if (null == guard) {
            guard = ZVal.getNull();
        }
        env.callMethod(
                this,
                "assertFalse",
                TestCase.class,
                this.isAuthenticated(env, guard),
                "The user is authenticated");
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "guard",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object isAuthenticated(RuntimeEnv env, Object... args) {
        Object guard = assignParameter(args, 0, true);
        if (null == guard) {
            guard = ZVal.getNull();
        }
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(this.app, "make", TestCase.class, "auth"),
                                "guard",
                                TestCase.class,
                                guard),
                        "check",
                        TestCase.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "user")
    @ConvertedParameter(
        index = 1,
        name = "guard",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object assertAuthenticatedAs(RuntimeEnv env, Object... args) {
        Object user = assignParameter(args, 0, false);
        Object guard = assignParameter(args, 1, true);
        if (null == guard) {
            guard = ZVal.getNull();
        }
        Object expected = null;
        expected =
                env.callMethod(
                        env.callMethod(
                                env.callMethod(this.app, "make", TestCase.class, "auth"),
                                "guard",
                                TestCase.class,
                                guard),
                        "user",
                        TestCase.class);
        env.callMethod(
                this,
                "assertNotNull",
                TestCase.class,
                expected,
                "The current user is not authenticated.");
        env.callMethod(
                this,
                "assertInstanceOf",
                TestCase.class,
                function_get_class.f.env(env).call(expected).value(),
                user,
                "The currently authenticated user is not who was expected");
        env.callMethod(
                this,
                "assertSame",
                TestCase.class,
                env.callMethod(expected, "getAuthIdentifier", TestCase.class),
                env.callMethod(user, "getAuthIdentifier", TestCase.class),
                "The currently authenticated user is not who was expected");
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "credentials", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "guard",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object assertCredentials(RuntimeEnv env, Object... args) {
        Object credentials = assignParameter(args, 0, false);
        Object guard = assignParameter(args, 1, true);
        if (null == guard) {
            guard = ZVal.getNull();
        }
        env.callMethod(
                this,
                "assertTrue",
                TestCase.class,
                this.hasCredentials(env, credentials, guard),
                "The given credentials are invalid.");
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "credentials", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "guard",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object assertInvalidCredentials(RuntimeEnv env, Object... args) {
        Object credentials = assignParameter(args, 0, false);
        Object guard = assignParameter(args, 1, true);
        if (null == guard) {
            guard = ZVal.getNull();
        }
        env.callMethod(
                this,
                "assertFalse",
                TestCase.class,
                this.hasCredentials(env, credentials, guard),
                "The given credentials are valid.");
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "credentials", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "guard",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object hasCredentials(RuntimeEnv env, Object... args) {
        Object credentials = assignParameter(args, 0, false);
        Object guard = assignParameter(args, 1, true);
        if (null == guard) {
            guard = ZVal.getNull();
        }
        Object provider = null;
        Object user = null;
        provider =
                env.callMethod(
                        env.callMethod(
                                env.callMethod(this.app, "make", TestCase.class, "auth"),
                                "guard",
                                TestCase.class,
                                guard),
                        "getProvider",
                        TestCase.class);
        user = env.callMethod(provider, "retrieveByCredentials", TestCase.class, credentials);
        return ZVal.assign(
                ZVal.toBool(user)
                        && ZVal.toBool(
                                env.callMethod(
                                        provider,
                                        "validateCredentials",
                                        TestCase.class,
                                        user,
                                        credentials)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
    @ConvertedParameter(
        index = 1,
        name = "parameters",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object artisan(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        return ZVal.assign(
                env.callMethod(
                        new ReferenceClassProperty(this, "app", env)
                                .arrayGet(
                                        env,
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Contracts
                                                .namespaces
                                                .Console
                                                .classes
                                                .Kernel
                                                .CONST_class),
                        "call",
                        TestCase.class,
                        command,
                        parameters));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    @ConvertedParameter(index = 1, name = "data", typeHint = "array")
    @ConvertedParameter(
        index = 2,
        name = "connection",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object assertDatabaseHas(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        Object connection = assignParameter(args, 2, true);
        if (null == connection) {
            connection = ZVal.getNull();
        }
        env.callMethod(
                this,
                "assertThat",
                TestCase.class,
                table,
                new HasInDatabase(env, this.getConnection(env, connection), data));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    @ConvertedParameter(index = 1, name = "data", typeHint = "array")
    @ConvertedParameter(
        index = 2,
        name = "connection",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object assertDatabaseMissing(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        Object connection = assignParameter(args, 2, true);
        if (null == connection) {
            connection = ZVal.getNull();
        }
        Object constraint = null;
        constraint =
                new LogicalNot(
                        env, new HasInDatabase(env, this.getConnection(env, connection), data));
        env.callMethod(this, "assertThat", TestCase.class, table, constraint);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    @ConvertedParameter(index = 1, name = "data", typeHint = "array")
    @ConvertedParameter(
        index = 2,
        name = "connection",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object assertSoftDeleted(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        Object connection = assignParameter(args, 2, true);
        if (null == connection) {
            connection = ZVal.getNull();
        }
        env.callMethod(
                this,
                "assertThat",
                TestCase.class,
                table,
                new SoftDeletedInDatabase(env, this.getConnection(env, connection), data));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "connection",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object getConnection(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, true);
        if (null == connection) {
            connection = ZVal.getNull();
        }
        Object database = null;
        Object ternaryExpressionTemp = null;
        database = env.callMethod(this.app, "make", TestCase.class, "db");
        connection =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = connection)
                                ? ternaryExpressionTemp
                                : env.callMethod(database, "getDefaultConnection", TestCase.class));
        return ZVal.assign(env.callMethod(database, "connection", TestCase.class, connection));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    public Object seed(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, true);
        if (null == _pClass) {
            _pClass = "DatabaseSeeder";
        }
        this.artisan(env, "db:seed", ZVal.newArray(new ZPair("--class", _pClass)));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    protected Object withExceptionHandling(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.originalExceptionHandler)) {
            env.callMethod(
                    this.app,
                    "instance",
                    TestCase.class,
                    ExceptionHandler.CONST_class,
                    this.originalExceptionHandler);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exceptions", typeHint = "array")
    protected Object handleExceptions(RuntimeEnv env, Object... args) {
        Object exceptions = assignParameter(args, 0, false);
        return ZVal.assign(this.withoutExceptionHandling(env, exceptions));
    }

    @ConvertedMethod
    protected Object handleValidationExceptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                this.handleExceptions(
                        env, ZVal.newArray(new ZPair(0, ValidationException.CONST_class))));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "except",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    protected Object withoutExceptionHandling(RuntimeEnv env, Object... args) {
        Object except = assignParameter(args, 0, true);
        if (null == except) {
            except = ZVal.newArray();
        }
        if (ZVal.equalityCheck(this.originalExceptionHandler, ZVal.getNull())) {
            this.originalExceptionHandler =
                    com.project
                            .convertedCode
                            .globalNamespace
                            .functions
                            .app
                            .f
                            .env(env)
                            .call(ExceptionHandler.CONST_class)
                            .value();
        }

        env.callMethod(
                this.app,
                "instance",
                TestCase.class,
                ExceptionHandler.CONST_class,
                env
                        .createNew( // Conversion Note: class named AnonymousClass3545 was here in
                                    // the source code
                                env.addManualClassLoad(
                                        "Illuminate\\Foundation\\Testing\\Concerns\\AnonymousClass3545"),
                                this.originalExceptionHandler,
                                except));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    public Object withSession(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        this.session(env, data);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    public Object session(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        Object value = null;
        Object key = null;
        this.startSession(env);
        for (ZPair zpairResult2313 : ZVal.getIterable(data, env, false)) {
            key = ZVal.assign(zpairResult2313.getKey());
            value = ZVal.assign(zpairResult2313.getValue());
            env.callMethod(
                    new ReferenceClassProperty(this, "app", env).arrayGet(env, "session"),
                    "put",
                    TestCase.class,
                    key,
                    value);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    protected Object startSession(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(
                env.callMethod(
                        new ReferenceClassProperty(this, "app", env).arrayGet(env, "session"),
                        "isStarted",
                        TestCase.class))) {
            env.callMethod(
                    new ReferenceClassProperty(this, "app", env).arrayGet(env, "session"),
                    "start",
                    TestCase.class);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object flushSession(RuntimeEnv env, Object... args) {
        this.startSession(env);
        env.callMethod(
                new ReferenceClassProperty(this, "app", env).arrayGet(env, "session"),
                "flush",
                TestCase.class);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "events")
    public Object expectsEvents(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Testing/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Testing/Concerns/MocksApplicationServices.php");
        Object events = assignParameter(args, 0, false);
        events =
                ZVal.assign(
                        function_is_array.f.env(env).call(events).getBool()
                                ? events
                                : function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value());
        this.withoutEvents(env);
        this.beforeApplicationDestroyed(
                env,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Foundation\\Testing\\Concerns",
                        this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object fired = null;
                        Object eventsNotFired = null;
                        Object events = null;
                        events = this.contextReferences.getCapturedValue("events");
                        fired = TestCase.this.getFiredEvents(env, events);
                        env.callMethod(
                                _closureThisVar,
                                "assertEmpty",
                                TestCase.class,
                                eventsNotFired =
                                        function_array_diff.f.env(env).call(events, fired).value(),
                                "These expected events were not fired: ["
                                        + toStringR(
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(", ", eventsNotFired)
                                                        .value(),
                                                env)
                                        + "]");
                        return null;
                    }
                }.use("events", events));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "events")
    public Object doesntExpectEvents(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Testing/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Testing/Concerns/MocksApplicationServices.php");
        Object events = assignParameter(args, 0, false);
        events =
                ZVal.assign(
                        function_is_array.f.env(env).call(events).getBool()
                                ? events
                                : function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value());
        this.withoutEvents(env);
        this.beforeApplicationDestroyed(
                env,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Foundation\\Testing\\Concerns",
                        this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object fired = null;
                        Object events = null;
                        events = this.contextReferences.getCapturedValue("events");
                        env.callMethod(
                                _closureThisVar,
                                "assertEmpty",
                                TestCase.class,
                                fired = TestCase.this.getFiredEvents(env, events),
                                "These unexpected events were fired: ["
                                        + toStringR(
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(", ", fired)
                                                        .value(),
                                                env)
                                        + "]");
                        return null;
                    }
                }.use("events", events));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    protected Object withoutEvents(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Testing/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Testing/Concerns/MocksApplicationServices.php");
        Object mock = null;
        mock =
                env.callMethod(
                        Mockery.runtimeStaticObject.mock(
                                env,
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Illuminate
                                        .namespaces
                                        .Contracts
                                        .namespaces
                                        .Events
                                        .classes
                                        .Dispatcher
                                        .CONST_class),
                        "shouldIgnoreMissing",
                        TestCase.class);
        env.callMethod(
                env.callMethod(mock, "shouldReceive", TestCase.class, "fire", "dispatch"),
                "andReturnUsing",
                TestCase.class,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Foundation\\Testing\\Concerns",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "called")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object called = assignParameter(args, 0, false);
                        new ReferenceClassProperty(_closureThisVar, "firedEvents", env)
                                .arrayAppend(env)
                                .set(called);
                        return null;
                    }
                });
        env.callMethod(this.app, "instance", TestCase.class, "events", mock);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "events", typeHint = "array")
    protected Object getFiredEvents(RuntimeEnv env, Object... args) {
        Object events = assignParameter(args, 0, false);
        return ZVal.assign(this.getDispatched(env, events, this.firedEvents));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "jobs")
    protected Object expectsJobs(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Testing/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Testing/Concerns/MocksApplicationServices.php");
        Object jobs = assignParameter(args, 0, false);
        jobs =
                ZVal.assign(
                        function_is_array.f.env(env).call(jobs).getBool()
                                ? jobs
                                : function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value());
        this.withoutJobs(env);
        this.beforeApplicationDestroyed(
                env,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Foundation\\Testing\\Concerns",
                        this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object dispatched = null;
                        Object jobsNotDispatched = null;
                        Object jobs = null;
                        jobs = this.contextReferences.getCapturedValue("jobs");
                        dispatched = TestCase.this.getDispatchedJobs(env, jobs);
                        env.callMethod(
                                _closureThisVar,
                                "assertEmpty",
                                TestCase.class,
                                jobsNotDispatched =
                                        function_array_diff
                                                .f
                                                .env(env)
                                                .call(jobs, dispatched)
                                                .value(),
                                "These expected jobs were not dispatched: ["
                                        + toStringR(
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(", ", jobsNotDispatched)
                                                        .value(),
                                                env)
                                        + "]");
                        return null;
                    }
                }.use("jobs", jobs));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "jobs")
    protected Object doesntExpectJobs(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Testing/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Testing/Concerns/MocksApplicationServices.php");
        Object jobs = assignParameter(args, 0, false);
        jobs =
                ZVal.assign(
                        function_is_array.f.env(env).call(jobs).getBool()
                                ? jobs
                                : function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value());
        this.withoutJobs(env);
        this.beforeApplicationDestroyed(
                env,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Foundation\\Testing\\Concerns",
                        this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object dispatched = null;
                        Object jobs = null;
                        jobs = this.contextReferences.getCapturedValue("jobs");
                        env.callMethod(
                                _closureThisVar,
                                "assertEmpty",
                                TestCase.class,
                                dispatched = TestCase.this.getDispatchedJobs(env, jobs),
                                "These unexpected jobs were dispatched: ["
                                        + toStringR(
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(", ", dispatched)
                                                        .value(),
                                                env)
                                        + "]");
                        return null;
                    }
                }.use("jobs", jobs));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    protected Object withoutJobs(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Testing/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Testing/Concerns/MocksApplicationServices.php");
        Object mock = null;
        mock =
                Mockery.runtimeStaticObject.mock(
                        env,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Illuminate
                                .namespaces
                                .Contracts
                                .namespaces
                                .Bus
                                .classes
                                .Dispatcher
                                .CONST_class);
        env.callMethod(
                env.callMethod(mock, "shouldReceive", TestCase.class, "dispatch", "dispatchNow"),
                "andReturnUsing",
                TestCase.class,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Foundation\\Testing\\Concerns",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "dispatched")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object dispatched = assignParameter(args, 0, false);
                        new ReferenceClassProperty(_closureThisVar, "dispatchedJobs", env)
                                .arrayAppend(env)
                                .set(dispatched);
                        return null;
                    }
                });
        env.callMethod(
                this.app,
                "instance",
                TestCase.class,
                com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Illuminate
                        .namespaces
                        .Contracts
                        .namespaces
                        .Bus
                        .classes
                        .Dispatcher
                        .CONST_class,
                mock);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "jobs", typeHint = "array")
    protected Object getDispatchedJobs(RuntimeEnv env, Object... args) {
        Object jobs = assignParameter(args, 0, false);
        return ZVal.assign(this.getDispatched(env, jobs, this.dispatchedJobs));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "classes", typeHint = "array")
    @ConvertedParameter(index = 1, name = "dispatched", typeHint = "array")
    protected Object getDispatched(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Testing/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Testing/Concerns/MocksApplicationServices.php");
        Object classes = assignParameter(args, 0, false);
        Object dispatched = assignParameter(args, 1, false);
        return ZVal.assign(
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                classes,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Foundation\\Testing\\Concerns",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "class")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object _pClass = assignParameter(args, 0, false);
                                        Object dispatched = null;
                                        dispatched =
                                                this.contextReferences.getCapturedValue(
                                                        "dispatched");
                                        return ZVal.assign(
                                                TestCase.this.wasDispatched(
                                                        env, _pClass, dispatched));
                                    }
                                }.use("dispatched", dispatched))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "needle")
    @ConvertedParameter(index = 1, name = "haystack", typeHint = "array")
    protected Object wasDispatched(RuntimeEnv env, Object... args) {
        Object needle = assignParameter(args, 0, false);
        Object haystack = assignParameter(args, 1, false);
        Object dispatched = null;
        for (ZPair zpairResult2314 : ZVal.getIterable(haystack, env, true)) {
            dispatched = ZVal.assign(zpairResult2314.getValue());
            if (ZVal.toBool(
                            ZVal.toBool(function_is_string.f.env(env).call(dispatched).value())
                                    && ZVal.toBool(
                                            ZVal.toBool(
                                                            ZVal.strictEqualityCheck(
                                                                    dispatched, "===", needle))
                                                    || ZVal.toBool(
                                                            NamespaceGlobal.is_subclass_of
                                                                    .env(env)
                                                                    .call(dispatched, needle)
                                                                    .value())))
                    || ZVal.toBool(ZVal.checkInstanceTypeMatch(dispatched, needle))) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    protected Object withoutNotifications(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Testing/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Testing/Concerns/MocksApplicationServices.php");
        Object mock = null;
        mock =
                Mockery.runtimeStaticObject.mock(
                        env,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Illuminate
                                .namespaces
                                .Contracts
                                .namespaces
                                .Notifications
                                .classes
                                .Dispatcher
                                .CONST_class);
        env.callMethod(
                env.callMethod(mock, "shouldReceive", TestCase.class, "send"),
                "andReturnUsing",
                TestCase.class,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Foundation\\Testing\\Concerns",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "notifiable")
                    @ConvertedParameter(index = 1, name = "instance")
                    @ConvertedParameter(
                        index = 2,
                        name = "channels",
                        defaultValue = "",
                        defaultValueType = "array"
                    )
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ContextConstants runtimeConverterFunctionClassConstants =
                                new ContextConstants()
                                        .setDir(
                                                "/vendor/laravel/framework/src/Illuminate/Foundation/Testing/Concerns")
                                        .setFile(
                                                "/vendor/laravel/framework/src/Illuminate/Foundation/Testing/Concerns/MocksApplicationServices.php");
                        RuntimeStack stack = new RuntimeStack();
                        stack.setupGlobals(env);
                        Scope140 scope = new Scope140();
                        stack.pushScope(scope);
                        scope._thisVarAlias = this;
                        try {
                            Object _closureThisVar = this.getClosureThisVar();
                            scope.notifiable = assignParameter(args, 0, false);
                            scope.instance = assignParameter(args, 1, false);
                            scope.channels = assignParameter(args, 2, true);
                            if (null == scope.channels) {
                                scope.channels = ZVal.newArray();
                            }
                            new ReferenceClassProperty(
                                            _closureThisVar, "dispatchedNotifications", env)
                                    .arrayAppend(env)
                                    .set(
                                            function_compact
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            stack,
                                                            "notifiable",
                                                            "instance",
                                                            "channels")
                                                    .value());
                            throw new IncludeEventException(null);
                        } catch (IncludeEventException runtimeConverterIncludeException) {
                            return runtimeConverterIncludeException.returnValue;
                        }
                    }
                });
        env.callMethod(
                this.app,
                "instance",
                TestCase.class,
                com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Illuminate
                        .namespaces
                        .Contracts
                        .namespaces
                        .Notifications
                        .classes
                        .Dispatcher
                        .CONST_class,
                mock);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "notifiable")
    @ConvertedParameter(index = 1, name = "notification")
    protected Object expectsNotification(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Testing/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Testing/Concerns/MocksApplicationServices.php");
        Object notifiable = assignParameter(args, 0, false);
        Object notification = assignParameter(args, 1, false);
        this.withoutNotifications(env);
        this.beforeApplicationDestroyed(
                env,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Foundation\\Testing\\Concerns",
                        this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object notification = null;
                        ReferenceContainer dispatched = new BasicReferenceContainer(null);
                        Object notified = null;
                        Object notifiable = null;
                        notification = this.contextReferences.getCapturedValue("notification");
                        notifiable = this.contextReferences.getCapturedValue("notifiable");
                        for (ZPair zpairResult2315 :
                                ZVal.getIterable(
                                        TestCase.this.dispatchedNotifications, env, true)) {
                            dispatched.setObject(ZVal.assign(zpairResult2315.getValue()));
                            notified = ZVal.assign(dispatched.arrayGet(env, "notifiable"));
                            if (ZVal.toBool(
                                            ZVal.toBool(
                                                            ZVal.strictEqualityCheck(
                                                                    notified, "===", notifiable))
                                                    || ZVal.toBool(
                                                            ZVal.equalityCheck(
                                                                    env.callMethod(
                                                                            notified,
                                                                            "getKey",
                                                                            TestCase.class),
                                                                    env.callMethod(
                                                                            notifiable,
                                                                            "getKey",
                                                                            TestCase.class))))
                                    && ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    function_get_class
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    dispatched.arrayGet(
                                                                            env, "instance"))
                                                            .value(),
                                                    "===",
                                                    notification))) {
                                return ZVal.assign(_closureThisVar);
                            }
                        }

                        env.callMethod(
                                _closureThisVar,
                                "fail",
                                TestCase.class,
                                "The following expected notification were not dispatched: ["
                                        + toStringR(notification, env)
                                        + "]");
                        return null;
                    }
                }.use("notification", notification).use("notifiable", notifiable));
        return ZVal.assign(this);
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Testing\\TestCase";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .PHPUnit
                    .namespaces
                    .Framework
                    .classes
                    .TestCase
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Foundation\\Testing\\TestCase")
                    .setLookup(
                            TestCase.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "afterApplicationCreatedCallbacks",
                            "app",
                            "backupGlobals",
                            "backupGlobalsBlacklist",
                            "backupStaticAttributes",
                            "backupStaticAttributesBlacklist",
                            "beStrictAboutChangesToGlobalState",
                            "beforeApplicationDestroyedCallbacks",
                            "customComparators",
                            "data",
                            "dataName",
                            "defaultHeaders",
                            "dependencies",
                            "dependencyInput",
                            "dispatchedJobs",
                            "dispatchedNotifications",
                            "doesNotPerformAssertions",
                            "expectedException",
                            "expectedExceptionCode",
                            "expectedExceptionMessage",
                            "expectedExceptionMessageRegExp",
                            "firedEvents",
                            "firedModelEvents",
                            "followRedirects",
                            "groups",
                            "inIsolation",
                            "iniSettings",
                            "locale",
                            "mockObjectGenerator",
                            "mockObjects",
                            "name",
                            "numAssertions",
                            "originalExceptionHandler",
                            "output",
                            "outputBufferingActive",
                            "outputBufferingLevel",
                            "outputCallback",
                            "outputExpectedRegex",
                            "outputExpectedString",
                            "preserveGlobalState",
                            "prophet",
                            "registerMockObjectsFromTestArgumentsRecursively",
                            "result",
                            "runClassInSeparateProcess",
                            "runTestInSeparateProcess",
                            "serverVariables",
                            "setUpHasRun",
                            "snapshot",
                            "status",
                            "statusMessage",
                            "testResult",
                            "useErrorHandler",
                            "warnings")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Testing/TestCase.php")
                    .addInterface("PHPUnit\\Framework\\Test")
                    .addInterface("Countable")
                    .addInterface("PHPUnit\\Framework\\SelfDescribing")
                    .addTrait("Illuminate\\Foundation\\Testing\\Concerns\\InteractsWithContainer")
                    .addTrait("Illuminate\\Foundation\\Testing\\Concerns\\MakesHttpRequests")
                    .addTrait(
                            "Illuminate\\Foundation\\Testing\\Concerns\\InteractsWithAuthentication")
                    .addTrait("Illuminate\\Foundation\\Testing\\Concerns\\InteractsWithConsole")
                    .addTrait("Illuminate\\Foundation\\Testing\\Concerns\\InteractsWithDatabase")
                    .addTrait(
                            "Illuminate\\Foundation\\Testing\\Concerns\\InteractsWithExceptionHandling")
                    .addTrait("Illuminate\\Foundation\\Testing\\Concerns\\InteractsWithSession")
                    .addTrait("Illuminate\\Foundation\\Testing\\Concerns\\MocksApplicationServices")
                    .addExtendsClass("PHPUnit\\Framework\\TestCase")
                    .addExtendsClass("PHPUnit\\Framework\\Assert")
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

    private static class Scope140 implements UpdateRuntimeScopeInterface {

        Object instance;
        Object channels;
        Object notifiable;
        Object _thisVarAlias;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("instance", this.instance);
            stack.setVariable("channels", this.channels);
            stack.setVariable("notifiable", this.notifiable);
            stack.setVariable("this", this._thisVarAlias);
        }

        public void updateScope(RuntimeStack stack) {

            this.instance = stack.getVariable("instance");
            this.channels = stack.getVariable("channels");
            this.notifiable = stack.getVariable("notifiable");
            this._thisVarAlias = stack.getVariable("this");
        }
    }
}
