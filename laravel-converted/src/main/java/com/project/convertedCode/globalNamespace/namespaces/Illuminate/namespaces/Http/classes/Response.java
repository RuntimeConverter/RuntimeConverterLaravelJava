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
import com.runtimeconverter.runtime.nativeClasses.spl.misc.ArrayObject;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Renderable;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Arrayable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.HeaderBag;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeInterfaces.JsonSerializable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
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

 vendor/laravel/framework/src/Illuminate/Http/Response.php

*/

public class Response
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
                .Response {

    public Object original = null;

    public Object exception = null;

    public Response(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Response.class) {
            this.__construct(env, args);
        }
    }

    public Response(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content")
    public Object setContent(RuntimeEnv env, Object... args) {
        Object content = assignParameter(args, 0, false);
        this.original = content;
        if (ZVal.isTrue(this.shouldBeJson(env, content))) {
            this.header(env, "Content-Type", "application/json");
            content = this.morphToJson(env, content);

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        content, Renderable.class, "Illuminate\\Contracts\\Support\\Renderable"))) {
            content = env.callMethod(content, "render", Response.class);
        }

        super.setContent(env, content);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content")
    protected Object shouldBeJson(RuntimeEnv env, Object... args) {
        Object content = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                ZVal.toBool(
                                                                                ZVal
                                                                                        .checkInstanceType(
                                                                                                content,
                                                                                                Arrayable
                                                                                                        .class,
                                                                                                "Illuminate\\Contracts\\Support\\Arrayable"))
                                                                        || ZVal.toBool(
                                                                                ZVal
                                                                                        .checkInstanceType(
                                                                                                content,
                                                                                                Jsonable
                                                                                                        .class,
                                                                                                "Illuminate\\Contracts\\Support\\Jsonable")))
                                                        || ZVal.toBool(
                                                                ZVal.checkInstanceType(
                                                                        content,
                                                                        ArrayObject.class,
                                                                        "ArrayObject")))
                                        || ZVal.toBool(
                                                ZVal.checkInstanceType(
                                                        content,
                                                        JsonSerializable.class,
                                                        "JsonSerializable")))
                        || ZVal.toBool(function_is_array.f.env(env).call(content).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content")
    protected Object morphToJson(RuntimeEnv env, Object... args) {
        Object content = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        content, Jsonable.class, "Illuminate\\Contracts\\Support\\Jsonable"))) {
            return ZVal.assign(env.callMethod(content, "toJson", Response.class));

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        content, Arrayable.class, "Illuminate\\Contracts\\Support\\Arrayable"))) {
            return ZVal.assign(
                    NamespaceGlobal.json_encode
                            .env(env)
                            .call(env.callMethod(content, "toArray", Response.class))
                            .value());
        }

        return ZVal.assign(NamespaceGlobal.json_encode.env(env).call(content).value());
    }

    @ConvertedMethod
    public Object status(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "getStatusCode", Response.class));
    }

    @ConvertedMethod
    public Object content(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "getContent", Response.class));
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
                                                .Response
                                                .class,
                                        "Illuminate\\Http\\Response"))
                        ? env.callMethod(
                                original, toStringR("getOriginalContent", env), Response.class)
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
                Response.class,
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
            headers = env.callMethod(headers, "all", Response.class);
        }

        for (ZPair zpairResult2336 : ZVal.getIterable(headers, env, false)) {
            key = ZVal.assign(zpairResult2336.getKey());
            value = ZVal.assign(zpairResult2336.getValue());
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("headers").value(),
                    "set",
                    Response.class,
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
                Response.class,
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
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Response.class)
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
                                                .Response
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
                                            Response.class,
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

    public static final Object CONST_class = "Illuminate\\Http\\Response";

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
                    .Response
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
                                    .Response
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
                            Response.class,
                            ZVal.toLong(256) | ZVal.toLong(512));
            for (ZPair zpairResult2337 : ZVal.getIterable(methods, env, true)) {
                method = ZVal.assign(zpairResult2337.getValue());
                env.callMethod(method, "setAccessible", Response.class, true);
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Response.class)
                        .method("macro")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                toObjectR(method).accessProp(this, env).name("name").value(),
                                env.callMethod(method, "invoke", Response.class, mixin))
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
                                            .Response
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
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Response.class)
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
                                                    .Response
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
                                                                        .Response
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
                                                            .Response
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
                    .setName("Illuminate\\Http\\Response")
                    .setLookup(
                            Response.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "charset",
                            "content",
                            "exception",
                            "headers",
                            "original",
                            "statusCode",
                            "statusText",
                            "version")
                    .setStaticPropertyNames("macros")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Http/Response.php")
                    .addTrait("Illuminate\\Http\\ResponseTrait")
                    .addTrait("Illuminate\\Support\\Traits\\Macroable")
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
