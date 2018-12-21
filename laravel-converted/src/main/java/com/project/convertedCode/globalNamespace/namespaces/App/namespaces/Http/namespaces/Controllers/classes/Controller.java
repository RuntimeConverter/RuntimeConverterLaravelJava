package com.project.convertedCode.globalNamespace.namespaces.App.namespaces.Http.namespaces.Controllers.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Validation.classes.ValidationException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Validation.classes.Factory;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Auth.namespaces.Access.classes.Gate;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Bus.classes.Dispatcher;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.functions.app;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.functions.class_basename;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 app/Http/Controllers/Controller.php

*/

public class Controller
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Routing
                .classes
                .Controller {

    public Controller(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Controller(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ability")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object authorize(RuntimeEnv env, Object... args) {
        Object ability = assignParameter(args, 0, false);
        Object arguments = assignParameter(args, 1, true);
        if (null == arguments) {
            arguments = ZVal.newArray();
        }
        Object runtimeTempArrayResult226 = null;
        ZVal.list(
                runtimeTempArrayResult226 = this.parseAbilityAndArguments(env, ability, arguments),
                (ability = listGet(runtimeTempArrayResult226, 0, env)),
                (arguments = listGet(runtimeTempArrayResult226, 1, env)));
        return ZVal.assign(
                env.callMethod(
                        app.f.env(env).call(Gate.CONST_class).value(),
                        "authorize",
                        Controller.class,
                        ability,
                        arguments));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "user")
    @ConvertedParameter(index = 1, name = "ability")
    @ConvertedParameter(
        index = 2,
        name = "arguments",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object authorizeForUser(RuntimeEnv env, Object... args) {
        Object user = assignParameter(args, 0, false);
        Object ability = assignParameter(args, 1, false);
        Object arguments = assignParameter(args, 2, true);
        if (null == arguments) {
            arguments = ZVal.newArray();
        }
        Object runtimeTempArrayResult227 = null;
        ZVal.list(
                runtimeTempArrayResult227 = this.parseAbilityAndArguments(env, ability, arguments),
                (ability = listGet(runtimeTempArrayResult227, 0, env)),
                (arguments = listGet(runtimeTempArrayResult227, 1, env)));
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                app.f.env(env).call(Gate.CONST_class).value(),
                                "forUser",
                                Controller.class,
                                user),
                        "authorize",
                        Controller.class,
                        ability,
                        arguments));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ability")
    @ConvertedParameter(index = 1, name = "arguments")
    protected Object parseAbilityAndArguments(RuntimeEnv env, Object... args) {
        Object ability = assignParameter(args, 0, false);
        Object arguments = assignParameter(args, 1, false);
        Object method = null;
        if (ZVal.toBool(function_is_string.f.env(env).call(ability).value())
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                function_strpos.f.env(env).call(ability, "\\").value(),
                                "===",
                                false))) {
            return ZVal.assign(ZVal.newArray(new ZPair(0, ability), new ZPair(1, arguments)));
        }

        method =
                ZVal.assign(
                        handleReturnReference(
                                        NamespaceGlobal.debug_backtrace.env(env).call(2, 3).value())
                                .arrayGet(env, 2, "function"));
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(0, this.normalizeGuessedAbilityName(env, method)),
                        new ZPair(1, ability)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ability")
    protected Object normalizeGuessedAbilityName(RuntimeEnv env, Object... args) {
        Object ability = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        ReferenceContainer map = new BasicReferenceContainer(null);
        map.setObject(this.resourceAbilityMap(env));
        return ZVal.assign(
                ZVal.isDefined(ternaryExpressionTemp = map.arrayGet(env, ability))
                        ? ternaryExpressionTemp
                        : ability);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "model")
    @ConvertedParameter(
        index = 1,
        name = "parameter",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 3,
        name = "request",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object authorizeResource(RuntimeEnv env, Object... args) {
        Object model = assignParameter(args, 0, false);
        Object parameter = assignParameter(args, 1, true);
        if (null == parameter) {
            parameter = ZVal.getNull();
        }
        Object options = assignParameter(args, 2, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object request = assignParameter(args, 3, true);
        if (null == request) {
            request = ZVal.getNull();
        }
        Object modelName = null;
        Object method = null;
        Object methods = null;
        Object ternaryExpressionTemp = null;
        Object middlewareName = null;
        Object ability = null;
        ReferenceContainer middleware = new BasicReferenceContainer(null);
        parameter =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = parameter)
                                ? ternaryExpressionTemp
                                : Str.runtimeStaticObject.snake(
                                        env, class_basename.f.env(env).call(model).value()));
        middleware.setObject(ZVal.newArray());
        for (ZPair zpairResult2253 : ZVal.getIterable(this.resourceAbilityMap(env), env, false)) {
            method = ZVal.assign(zpairResult2253.getKey());
            ability = ZVal.assign(zpairResult2253.getValue());
            modelName =
                    ZVal.assign(
                            function_in_array
                                            .f
                                            .env(env)
                                            .call(method, this.resourceMethodsWithoutModels(env))
                                            .getBool()
                                    ? model
                                    : parameter);
            middleware
                    .arrayAppend(
                            env, "can:" + toStringR(ability, env) + "," + toStringR(modelName, env))
                    .set(method);
        }

        for (ZPair zpairResult2254 : ZVal.getIterable(middleware.getObject(), env, false)) {
            middlewareName = ZVal.assign(zpairResult2254.getKey());
            methods = ZVal.assign(zpairResult2254.getValue());
            env.callMethod(
                    env.callMethod(this, "middleware", Controller.class, middlewareName, options),
                    "only",
                    Controller.class,
                    methods);
        }

        return null;
    }

    @ConvertedMethod
    protected Object resourceAbilityMap(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("show", "view"),
                        new ZPair("create", "create"),
                        new ZPair("store", "create"),
                        new ZPair("edit", "update"),
                        new ZPair("update", "update"),
                        new ZPair("destroy", "delete")));
    }

    @ConvertedMethod
    protected Object resourceMethodsWithoutModels(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.arrayFromList("index", "create", "store"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job")
    protected Object dispatch(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        app.f.env(env).call(Dispatcher.CONST_class).value(),
                        "dispatch",
                        Controller.class,
                        job));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job")
    public Object dispatchNow(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        app.f.env(env).call(Dispatcher.CONST_class).value(),
                        "dispatchNow",
                        Controller.class,
                        job));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "validator")
    @ConvertedParameter(
        index = 1,
        name = "request",
        typeHint = "Illuminate\\Http\\Request",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object validateWith(RuntimeEnv env, Object... args) {
        Object validator = assignParameter(args, 0, false);
        Object request = assignParameter(args, 1, true);
        if (null == request) {
            request = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        request =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = request)
                                ? ternaryExpressionTemp
                                : com.project
                                        .convertedCode
                                        .globalNamespace
                                        .functions
                                        .request
                                        .f
                                        .env(env)
                                        .call()
                                        .value());
        if (function_is_array.f.env(env).call(validator).getBool()) {
            validator =
                    env.callMethod(
                            this.getValidationFactory(env),
                            "make",
                            Controller.class,
                            env.callMethod(request, "all", Controller.class),
                            validator);
        }

        env.callMethod(validator, "validate", Controller.class);
        return ZVal.assign(
                this.extractInputFromRules(
                        env, request, env.callMethod(validator, "getRules", Controller.class)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    @ConvertedParameter(index = 1, name = "rules", typeHint = "array")
    @ConvertedParameter(
        index = 2,
        name = "messages",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 3,
        name = "customAttributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object validate(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object rules = assignParameter(args, 1, false);
        Object messages = assignParameter(args, 2, true);
        if (null == messages) {
            messages = ZVal.newArray();
        }
        Object customAttributes = assignParameter(args, 3, true);
        if (null == customAttributes) {
            customAttributes = ZVal.newArray();
        }
        env.callMethod(
                env.callMethod(
                        this.getValidationFactory(env),
                        "make",
                        Controller.class,
                        env.callMethod(request, "all", Controller.class),
                        rules,
                        messages,
                        customAttributes),
                "validate",
                Controller.class);
        return ZVal.assign(this.extractInputFromRules(env, request, rules));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    @ConvertedParameter(index = 1, name = "rules", typeHint = "array")
    protected Object extractInputFromRules(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Validation")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Validation/ValidatesRequests.php");
        Object request = assignParameter(args, 0, false);
        Object rules = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        request,
                        "only",
                        Controller.class,
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                env.callMethod(
                                                        collect.f.env(env).call(rules).value(),
                                                        "keys",
                                                        Controller.class),
                                                "map",
                                                Controller.class,
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Illuminate\\Foundation\\Validation",
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
                                        Controller.class),
                                "toArray",
                                Controller.class)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "errorBag")
    @ConvertedParameter(index = 1, name = "request", typeHint = "Illuminate\\Http\\Request")
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
    public Object validateWithBag(RuntimeEnv env, Object... args) {
        Object errorBag = assignParameter(args, 0, false);
        Object request = assignParameter(args, 1, false);
        Object rules = assignParameter(args, 2, false);
        Object messages = assignParameter(args, 3, true);
        if (null == messages) {
            messages = ZVal.newArray();
        }
        Object customAttributes = assignParameter(args, 4, true);
        if (null == customAttributes) {
            customAttributes = ZVal.newArray();
        }
        Object e = null;
        try {
            return ZVal.assign(this.validate(env, request, rules, messages, customAttributes));
        } catch (ConvertedException convertedException1) {
            if (convertedException1.instanceOf(
                    ValidationException.class, "Illuminate\\Validation\\ValidationException")) {
                e = convertedException1.getObject();
                toObjectR(e).accessProp(this, env).name("errorBag").set(errorBag);
                throw ZVal.getException(env, e);
            } else {
                throw convertedException1;
            }
        }
    }

    @ConvertedMethod
    protected Object getValidationFactory(RuntimeEnv env, Object... args) {
        return ZVal.assign(app.f.env(env).call(Factory.CONST_class).value());
    }

    public static final Object CONST_class = "App\\Http\\Controllers\\Controller";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Illuminate
                    .namespaces
                    .Routing
                    .classes
                    .Controller
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("App\\Http\\Controllers\\Controller")
                    .setLookup(
                            Controller.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("middleware")
                    .setFilename("app/Http/Controllers/Controller.php")
                    .addTrait("Illuminate\\Foundation\\Auth\\Access\\AuthorizesRequests")
                    .addTrait("Illuminate\\Foundation\\Bus\\DispatchesJobs")
                    .addTrait("Illuminate\\Foundation\\Validation\\ValidatesRequests")
                    .addExtendsClass("Illuminate\\Routing\\Controller")
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
