package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Exceptions.classes.HttpResponseException;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.ViewErrorBag;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.HeaderBag;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.MessageProvider;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.MessageBag;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.classes.UploadedFile;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Http/RedirectResponse.php

*/

public class RedirectResponse
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
                .RedirectResponse {

    public Object request = null;

    public Object session = null;

    public Object original = null;

    public Object exception = null;

    public RedirectResponse(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RedirectResponse.class) {
            this.__construct(env, args);
        }
    }

    public RedirectResponse(NoConstructor n) {
        super(n);
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
        Object v = null;
        Object k = null;
        key =
                ZVal.assign(
                        function_is_array.f.env(env).call(key).getBool()
                                ? key
                                : ZVal.newArray(new ZPair(key, value)));
        for (ZPair zpairResult470 : ZVal.getIterable(key, env, false)) {
            k = ZVal.assign(zpairResult470.getKey());
            v = ZVal.assign(zpairResult470.getValue());
            env.callMethod(this.session, "flash", RedirectResponse.class, k, v);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "cookies", typeHint = "array")
    public Object withCookies(RuntimeEnv env, Object... args) {
        Object cookies = assignParameter(args, 0, false);
        Object cookie = null;
        for (ZPair zpairResult471 : ZVal.getIterable(cookies, env, true)) {
            cookie = ZVal.assign(zpairResult471.getValue());
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("headers").value(),
                    "setCookie",
                    RedirectResponse.class,
                    cookie);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "input",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object withInput(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, true);
        if (null == input) {
            input = ZVal.getNull();
        }
        env.callMethod(
                this.session,
                "flashInput",
                RedirectResponse.class,
                this.removeFilesFromInput(
                        env,
                        !function_is_null.f.env(env).call(input).getBool()
                                ? input
                                : env.callMethod(this.request, "input", RedirectResponse.class)));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "input", typeHint = "array")
    protected Object removeFilesFromInput(RuntimeEnv env, Object... args) {
        ReferenceContainer input = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object value = null;
        Object key = null;
        for (ZPair zpairResult472 : ZVal.getIterable(input.getObject(), env, false)) {
            key = ZVal.assign(zpairResult472.getKey());
            value = ZVal.assign(zpairResult472.getValue());
            if (function_is_array.f.env(env).call(value).getBool()) {
                input.arrayAccess(env, key).set(this.removeFilesFromInput(env, value));
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            value,
                            UploadedFile.class,
                            "Symfony\\Component\\HttpFoundation\\File\\UploadedFile"))) {
                arrayActionR(ArrayAction.UNSET, input, env, key);
            }
        }

        return ZVal.assign(input.getObject());
    }

    @ConvertedMethod
    public Object onlyInput(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                this.withInput(
                        env,
                        env.callMethod(
                                this.request,
                                "only",
                                RedirectResponse.class,
                                function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value())));
    }

    @ConvertedMethod
    public Object exceptInput(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                this.withInput(
                        env,
                        env.callMethod(
                                this.request,
                                "except",
                                RedirectResponse.class,
                                function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "provider")
    @ConvertedParameter(index = 1, name = "key")
    public Object withErrors(RuntimeEnv env, Object... args) {
        Object provider = assignParameter(args, 0, false);
        Object key = assignParameter(args, 1, true);
        if (null == key) {
            key = "default";
        }
        Object value = null;
        Object errors = null;
        value = this.parseErrors(env, provider);
        errors =
                env.callMethod(
                        this.session,
                        "get",
                        RedirectResponse.class,
                        "errors",
                        new ViewErrorBag(env));
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        errors, ViewErrorBag.class, "Illuminate\\Support\\ViewErrorBag"))) {
            errors = new ViewErrorBag(env);
        }

        env.callMethod(
                this.session,
                "flash",
                RedirectResponse.class,
                "errors",
                env.callMethod(errors, "put", RedirectResponse.class, key, value));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "provider")
    protected Object parseErrors(RuntimeEnv env, Object... args) {
        Object provider = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        provider,
                        MessageProvider.class,
                        "Illuminate\\Contracts\\Support\\MessageProvider"))) {
            return ZVal.assign(env.callMethod(provider, "getMessageBag", RedirectResponse.class));
        }

        return ZVal.assign(new MessageBag(env, rToArrayCast(provider)));
    }

    @ConvertedMethod
    public Object getOriginalContent(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    public Object getRequest(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.request);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    public Object setRequest(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        this.request = request;
        return null;
    }

    @ConvertedMethod
    public Object getSession(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.session);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "session", typeHint = "Illuminate\\Session\\Store")
    public Object setSession(RuntimeEnv env, Object... args) {
        Object session = assignParameter(args, 0, false);
        this.session = session;
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
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, RedirectResponse.class)
                        .method("hasMacro")
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(0, method))
                        .call(method.getObject())
                        .value())) {
            return ZVal.assign(
                    env.callMethod(
                            this,
                            "macroCall",
                            RedirectResponse.class,
                            method.getObject(),
                            parameters.getObject()));
        }

        if (ZVal.isTrue(Str.runtimeStaticObject.startsWith(env, method.getObject(), "with"))) {
            return ZVal.assign(
                    this.with(
                            env,
                            Str.runtimeStaticObject.snake(
                                    env,
                                    function_substr.f.env(env).call(method.getObject(), 4).value()),
                            parameters.arrayGet(env, 0)));
        }

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

    @ConvertedMethod
    public Object status(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "getStatusCode", RedirectResponse.class));
    }

    @ConvertedMethod
    public Object content(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "getContent", RedirectResponse.class));
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
                RedirectResponse.class,
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
            headers = env.callMethod(headers, "all", RedirectResponse.class);
        }

        for (ZPair zpairResult2319 : ZVal.getIterable(headers, env, false)) {
            key = ZVal.assign(zpairResult2319.getKey());
            value = ZVal.assign(zpairResult2319.getValue());
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("headers").value(),
                    "set",
                    RedirectResponse.class,
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
                RedirectResponse.class,
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

    public static final Object CONST_class = "Illuminate\\Http\\RedirectResponse";

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
                    .RedirectResponse
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
                                    .RedirectResponse
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
                            RedirectResponse.class,
                            ZVal.toLong(256) | ZVal.toLong(512));
            for (ZPair zpairResult2320 : ZVal.getIterable(methods, env, true)) {
                method = ZVal.assign(zpairResult2320.getValue());
                env.callMethod(method, "setAccessible", RedirectResponse.class, true);
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, RedirectResponse.class)
                        .method("macro")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                toObjectR(method).accessProp(this, env).name("name").value(),
                                env.callMethod(method, "invoke", RedirectResponse.class, mixin))
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
                                            .RedirectResponse
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
                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                    env, this, RedirectResponse.class)
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
                                                    .RedirectResponse
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
                                                                        .RedirectResponse
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
                                                            .RedirectResponse
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
                    .setName("Illuminate\\Http\\RedirectResponse")
                    .setLookup(
                            RedirectResponse.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "charset",
                            "content",
                            "exception",
                            "headers",
                            "original",
                            "request",
                            "session",
                            "statusCode",
                            "statusText",
                            "targetUrl",
                            "version")
                    .setStaticPropertyNames("macros")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Http/RedirectResponse.php")
                    .addTrait("Illuminate\\Http\\ResponseTrait")
                    .addTrait("Illuminate\\Support\\Traits\\Macroable")
                    .addExtendsClass("Symfony\\Component\\HttpFoundation\\RedirectResponse")
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
