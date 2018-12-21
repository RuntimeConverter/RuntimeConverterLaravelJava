package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Exceptions.classes.HttpResponseException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Jsonable;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Arrayable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.HeaderBag;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeInterfaces.JsonSerializable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Http/JsonResponse.php

*/

public class JsonResponse
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Symfony
                .namespaces
                .Component
                .namespaces
                .HttpFoundation
                .classes
                .JsonResponse {

    public Object original = null;

    public Object exception = null;

    public JsonResponse(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == JsonResponse.class) {
            this.__construct(env, args);
        }
    }

    public JsonResponse(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "data",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "status",
        defaultValue = "200",
        defaultValueType = "number"
    )
    @ConvertedParameter(index = 2, name = "headers", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 3,
        name = "options",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, true);
        if (null == data) {
            data = ZVal.getNull();
        }
        Object status = assignParameter(args, 1, true);
        if (null == status) {
            status = 200;
        }
        Object headers = assignParameter(args, 2, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        Object options = assignParameter(args, 3, true);
        if (null == options) {
            options = 0;
        }
        toObjectR(this).accessProp(this, env).name("encodingOptions").set(options);
        super.__construct(env, data, status, headers);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object withCallback(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        return ZVal.assign(env.callMethod(this, "setCallback", JsonResponse.class, callback));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "assoc",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "depth",
        defaultValue = "512",
        defaultValueType = "number"
    )
    public Object getData(RuntimeEnv env, Object... args) {
        Object assoc = assignParameter(args, 0, true);
        if (null == assoc) {
            assoc = false;
        }
        Object depth = assignParameter(args, 1, true);
        if (null == depth) {
            depth = 512;
        }
        return ZVal.assign(
                NamespaceGlobal.json_decode
                        .env(env)
                        .call(
                                toObjectR(this).accessProp(this, env).name("data").value(),
                                assoc,
                                depth)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", defaultValue = "", defaultValueType = "array")
    public Object setData(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        this.original = data;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        data, Jsonable.class, "Illuminate\\Contracts\\Support\\Jsonable"))) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("data")
                    .set(
                            env.callMethod(
                                    data,
                                    "toJson",
                                    JsonResponse.class,
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("encodingOptions")
                                            .value()));

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(data, JsonSerializable.class, "JsonSerializable"))) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("data")
                    .set(
                            NamespaceGlobal.json_encode
                                    .env(env)
                                    .call(
                                            env.callMethod(
                                                    data, "jsonSerialize", JsonResponse.class),
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("encodingOptions")
                                                    .value())
                                    .value());

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        data, Arrayable.class, "Illuminate\\Contracts\\Support\\Arrayable"))) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("data")
                    .set(
                            NamespaceGlobal.json_encode
                                    .env(env)
                                    .call(
                                            env.callMethod(data, "toArray", JsonResponse.class),
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("encodingOptions")
                                                    .value())
                                    .value());

        } else {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("data")
                    .set(
                            NamespaceGlobal.json_encode
                                    .env(env)
                                    .call(
                                            data,
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("encodingOptions")
                                                    .value())
                                    .value());
        }

        if (!ZVal.isTrue(
                this.hasValidJson(env, NamespaceGlobal.json_last_error.env(env).call().value()))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, NamespaceGlobal.json_last_error_msg.env(env).call().value()));
        }

        return ZVal.assign(env.callMethod(this, "update", JsonResponse.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "jsonError")
    protected Object hasValidJson(RuntimeEnv env, Object... args) {
        Object jsonError = assignParameter(args, 0, false);
        if (ZVal.strictEqualityCheck(jsonError, "===", 0)) {
            return ZVal.assign(true);
        }

        return ZVal.assign(
                ZVal.toBool(this.hasEncodingOption(env, 512))
                        && ZVal.toBool(
                                function_in_array
                                        .f
                                        .env(env)
                                        .call(
                                                jsonError,
                                                ZVal.newArray(
                                                        new ZPair(0, 6),
                                                        new ZPair(1, 7),
                                                        new ZPair(2, 8)))
                                        .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options")
    public Object setEncodingOptions(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, false);
        toObjectR(this).accessProp(this, env).name("encodingOptions").set(ZVal.toLong(options));
        return ZVal.assign(this.setData(env, this.getData(env)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "option")
    public Object hasEncodingOption(RuntimeEnv env, Object... args) {
        Object option = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(
                        ZVal.toLong(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("encodingOptions")
                                                .value())
                                & ZVal.toLong(option)));
    }

    @ConvertedMethod
    public Object status(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "getStatusCode", JsonResponse.class));
    }

    @ConvertedMethod
    public Object content(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "getContent", JsonResponse.class));
    }

    @ConvertedMethod
    public Object getOriginalContent(RuntimeEnv env, Object... args) {
        Object original = null;
        original = ZVal.assign(this.original);
        return ZVal.assign(
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        original,
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Http
                                                .classes
                                                .JsonResponse
                                                .class,
                                        "Illuminate\\Http\\JsonResponse"))
                        ? env.callMethod(
                                original, toStringR("getOriginalContent", env), JsonResponse.class)
                        : original);
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
    public Object header(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, false);
        Object replace = assignParameter(args, 2, true);
        if (null == replace) {
            replace = true;
        }
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("headers").value(),
                "set",
                JsonResponse.class,
                key,
                values,
                replace);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "headers")
    public Object withHeaders(RuntimeEnv env, Object... args) {
        Object headers = assignParameter(args, 0, false);
        Object value = null;
        Object key = null;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        headers,
                        HeaderBag.class,
                        "Symfony\\Component\\HttpFoundation\\HeaderBag"))) {
            headers = env.callMethod(headers, "all", JsonResponse.class);
        }

        for (ZPair zpairResult2317 : ZVal.getIterable(headers, env, false)) {
            key = ZVal.assign(zpairResult2317.getKey());
            value = ZVal.assign(zpairResult2317.getValue());
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("headers").value(),
                    "set",
                    JsonResponse.class,
                    key,
                    value);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "cookie")
    public Object cookie(RuntimeEnv env, Object... args) {
        Object cookie = assignParameter(args, 0, false);
        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(
                                ZVal.newArray(new ZPair(0, this), new ZPair(1, "withCookie")),
                                function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "cookie")
    public Object withCookie(RuntimeEnv env, Object... args) {
        Object cookie = assignParameter(args, 0, false);
        if (ZVal.toBool(function_is_string.f.env(env).call(cookie).value())
                && ZVal.toBool(function_function_exists.f.env(env).call("cookie").value())) {
            cookie =
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    "cookie",
                                    function_func_get_args
                                            .f
                                            .env(env)
                                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                            .call()
                                            .value())
                            .value();
        }

        env.callMethod(
                toObjectR(this).accessProp(this, env).name("headers").value(),
                "setCookie",
                JsonResponse.class,
                cookie);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Exception")
    public Object withException(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        this.exception = e;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object throwResponse(RuntimeEnv env, Object... args) {
        throw ZVal.getException(env, new HttpResponseException(env, this));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        ReferenceContainer method = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object parameters = assignParameter(args, 1, false);
        Object macro = null;
        if (!ZVal.isTrue(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, JsonResponse.class)
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
                                                .Http
                                                .classes
                                                .JsonResponse
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
                                            JsonResponse.class,
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

    public static final Object CONST_class = "Illuminate\\Http\\JsonResponse";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Symfony
                    .namespaces
                    .Component
                    .namespaces
                    .HttpFoundation
                    .classes
                    .JsonResponse
                    .RuntimeStaticCompanion {

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
                                    .Http
                                    .classes
                                    .JsonResponse
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
                            JsonResponse.class,
                            ZVal.toLong(256) | ZVal.toLong(512));
            for (ZPair zpairResult2318 : ZVal.getIterable(methods, env, true)) {
                method = ZVal.assign(zpairResult2318.getValue());
                env.callMethod(method, "setAccessible", JsonResponse.class, true);
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, JsonResponse.class)
                        .method("macro")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                toObjectR(method).accessProp(this, env).name("name").value(),
                                env.callMethod(method, "invoke", JsonResponse.class, mixin))
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
                                            .Http
                                            .classes
                                            .JsonResponse
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
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, JsonResponse.class)
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
                                                    .Http
                                                    .classes
                                                    .JsonResponse
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
                                                                        .Http
                                                                        .classes
                                                                        .JsonResponse
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
                                                            .Http
                                                            .classes
                                                            .JsonResponse
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
                    .setName("Illuminate\\Http\\JsonResponse")
                    .setLookup(
                            JsonResponse.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "callback",
                            "charset",
                            "content",
                            "data",
                            "encodingOptions",
                            "exception",
                            "headers",
                            "original",
                            "statusCode",
                            "statusText",
                            "version")
                    .setStaticPropertyNames("macros")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Http/JsonResponse.php")
                    .addTrait("Illuminate\\Http\\ResponseTrait")
                    .addTrait("Illuminate\\Support\\Traits\\Macroable")
                    .addExtendsClass("Symfony\\Component\\HttpFoundation\\JsonResponse")
                    .addExtendsClass("Symfony\\Component\\HttpFoundation\\Response")
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
