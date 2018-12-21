package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.StreamedResponse;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.classes.JsonResponse;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.BinaryFileResponse;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.classes.Response;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Routing/ResponseFactory.php

*/

public class ResponseFactory extends RuntimeClassBase
        implements com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Contracts
                .namespaces
                .Routing
                .classes
                .ResponseFactory {

    public Object view = null;

    public Object redirector = null;

    public ResponseFactory(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ResponseFactory.class) {
            this.__construct(env, args);
        }
    }

    public ResponseFactory(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "view", typeHint = "Illuminate\\Contracts\\View\\Factory")
    @ConvertedParameter(
        index = 1,
        name = "redirector",
        typeHint = "Illuminate\\Routing\\Redirector"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object view = assignParameter(args, 0, false);
        Object redirector = assignParameter(args, 1, false);
        this.view = view;
        this.redirector = redirector;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content")
    @ConvertedParameter(
        index = 1,
        name = "status",
        defaultValue = "200",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 2,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object make(RuntimeEnv env, Object... args) {
        Object content = assignParameter(args, 0, true);
        if (null == content) {
            content = "";
        }
        Object status = assignParameter(args, 1, true);
        if (null == status) {
            status = 200;
        }
        Object headers = assignParameter(args, 2, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        return ZVal.assign(new Response(env, content, status, headers));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "view")
    @ConvertedParameter(index = 1, name = "data", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 2,
        name = "status",
        defaultValue = "200",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 3,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object view(RuntimeEnv env, Object... args) {
        Object view = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        Object status = assignParameter(args, 2, true);
        if (null == status) {
            status = 200;
        }
        Object headers = assignParameter(args, 3, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        return ZVal.assign(
                this.make(
                        env,
                        env.callMethod(this.view, "make", ResponseFactory.class, view, data),
                        status,
                        headers));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 1,
        name = "status",
        defaultValue = "200",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 2,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 3,
        name = "options",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object json(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, true);
        if (null == data) {
            data = ZVal.newArray();
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
        return ZVal.assign(new JsonResponse(env, data, status, headers, options));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    @ConvertedParameter(index = 1, name = "data", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 2,
        name = "status",
        defaultValue = "200",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 3,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 4,
        name = "options",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object jsonp(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        Object status = assignParameter(args, 2, true);
        if (null == status) {
            status = 200;
        }
        Object headers = assignParameter(args, 3, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        Object options = assignParameter(args, 4, true);
        if (null == options) {
            options = 0;
        }
        return ZVal.assign(
                env.callMethod(
                        this.json(env, data, status, headers, options),
                        "setCallback",
                        ResponseFactory.class,
                        callback));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    @ConvertedParameter(
        index = 1,
        name = "status",
        defaultValue = "200",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 2,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object stream(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        Object status = assignParameter(args, 1, true);
        if (null == status) {
            status = 200;
        }
        Object headers = assignParameter(args, 2, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        return ZVal.assign(new StreamedResponse(env, callback, status, headers));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 3, name = "disposition")
    public Object streamDownload(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object headers = assignParameter(args, 2, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        Object disposition = assignParameter(args, 3, true);
        if (null == disposition) {
            disposition = "attachment";
        }
        Object response = null;
        response = new StreamedResponse(env, callback, 200, headers);
        if (!function_is_null.f.env(env).call(name).getBool()) {
            env.callMethod(
                    toObjectR(response).accessProp(this, env).name("headers").value(),
                    "set",
                    ResponseFactory.class,
                    "Content-Disposition",
                    env.callMethod(
                            toObjectR(response).accessProp(this, env).name("headers").value(),
                            "makeDisposition",
                            ResponseFactory.class,
                            disposition,
                            name,
                            this.fallbackName(env, name)));
        }

        return ZVal.assign(response);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 3, name = "disposition")
    public Object download(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object headers = assignParameter(args, 2, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        Object disposition = assignParameter(args, 3, true);
        if (null == disposition) {
            disposition = "attachment";
        }
        Object response = null;
        response = new BinaryFileResponse(env, file, 200, headers, true, disposition);
        if (!function_is_null.f.env(env).call(name).getBool()) {
            return ZVal.assign(
                    env.callMethod(
                            response,
                            "setContentDisposition",
                            ResponseFactory.class,
                            disposition,
                            name,
                            this.fallbackName(env, name)));
        }

        return ZVal.assign(response);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object fallbackName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call("%", "", Str.runtimeStaticObject.ascii(env, name))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    @ConvertedParameter(
        index = 1,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object file(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        Object headers = assignParameter(args, 1, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        return ZVal.assign(new BinaryFileResponse(env, file, 200, headers));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(
        index = 1,
        name = "status",
        defaultValue = "302",
        defaultValueType = "number"
    )
    @ConvertedParameter(index = 2, name = "headers", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 3,
        name = "secure",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object redirectTo(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object status = assignParameter(args, 1, true);
        if (null == status) {
            status = 302;
        }
        Object headers = assignParameter(args, 2, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        Object secure = assignParameter(args, 3, true);
        if (null == secure) {
            secure = ZVal.getNull();
        }
        return ZVal.assign(
                env.callMethod(
                        this.redirector,
                        "to",
                        ResponseFactory.class,
                        path,
                        status,
                        headers,
                        secure));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "route")
    @ConvertedParameter(
        index = 1,
        name = "parameters",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "status",
        defaultValue = "302",
        defaultValueType = "number"
    )
    @ConvertedParameter(index = 3, name = "headers", defaultValue = "", defaultValueType = "array")
    public Object redirectToRoute(RuntimeEnv env, Object... args) {
        Object route = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        Object status = assignParameter(args, 2, true);
        if (null == status) {
            status = 302;
        }
        Object headers = assignParameter(args, 3, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        return ZVal.assign(
                env.callMethod(
                        this.redirector,
                        "route",
                        ResponseFactory.class,
                        route,
                        parameters,
                        status,
                        headers));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "action")
    @ConvertedParameter(
        index = 1,
        name = "parameters",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "status",
        defaultValue = "302",
        defaultValueType = "number"
    )
    @ConvertedParameter(index = 3, name = "headers", defaultValue = "", defaultValueType = "array")
    public Object redirectToAction(RuntimeEnv env, Object... args) {
        Object action = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        Object status = assignParameter(args, 2, true);
        if (null == status) {
            status = 302;
        }
        Object headers = assignParameter(args, 3, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        return ZVal.assign(
                env.callMethod(
                        this.redirector,
                        "action",
                        ResponseFactory.class,
                        action,
                        parameters,
                        status,
                        headers));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(
        index = 1,
        name = "status",
        defaultValue = "302",
        defaultValueType = "number"
    )
    @ConvertedParameter(index = 2, name = "headers", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 3,
        name = "secure",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object redirectGuest(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object status = assignParameter(args, 1, true);
        if (null == status) {
            status = 302;
        }
        Object headers = assignParameter(args, 2, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        Object secure = assignParameter(args, 3, true);
        if (null == secure) {
            secure = ZVal.getNull();
        }
        return ZVal.assign(
                env.callMethod(
                        this.redirector,
                        "guest",
                        ResponseFactory.class,
                        path,
                        status,
                        headers,
                        secure));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "default")
    @ConvertedParameter(
        index = 1,
        name = "status",
        defaultValue = "302",
        defaultValueType = "number"
    )
    @ConvertedParameter(index = 2, name = "headers", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 3,
        name = "secure",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object redirectToIntended(RuntimeEnv env, Object... args) {
        Object _pDefault = assignParameter(args, 0, true);
        if (null == _pDefault) {
            _pDefault = "/";
        }
        Object status = assignParameter(args, 1, true);
        if (null == status) {
            status = 302;
        }
        Object headers = assignParameter(args, 2, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        Object secure = assignParameter(args, 3, true);
        if (null == secure) {
            secure = ZVal.getNull();
        }
        return ZVal.assign(
                env.callMethod(
                        this.redirector,
                        "intended",
                        ResponseFactory.class,
                        _pDefault,
                        status,
                        headers,
                        secure));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        ReferenceContainer method = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object parameters = assignParameter(args, 1, false);
        Object macro = null;
        if (!ZVal.isTrue(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, ResponseFactory.class)
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
                                                .Routing
                                                .classes
                                                .ResponseFactory
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
                                            ResponseFactory.class,
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

    public static final Object CONST_class = "Illuminate\\Routing\\ResponseFactory";

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
                                    .Routing
                                    .classes
                                    .ResponseFactory
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
                            ResponseFactory.class,
                            ZVal.toLong(256) | ZVal.toLong(512));
            for (ZPair zpairResult2354 : ZVal.getIterable(methods, env, true)) {
                method = ZVal.assign(zpairResult2354.getValue());
                env.callMethod(method, "setAccessible", ResponseFactory.class, true);
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, ResponseFactory.class)
                        .method("macro")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                toObjectR(method).accessProp(this, env).name("name").value(),
                                env.callMethod(method, "invoke", ResponseFactory.class, mixin))
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
                                            .Routing
                                            .classes
                                            .ResponseFactory
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
                                    env, this, ResponseFactory.class)
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
                                                    .Routing
                                                    .classes
                                                    .ResponseFactory
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
                                                                        .Routing
                                                                        .classes
                                                                        .ResponseFactory
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
                                                            .Routing
                                                            .classes
                                                            .ResponseFactory
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
                    .setName("Illuminate\\Routing\\ResponseFactory")
                    .setLookup(
                            ResponseFactory.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("redirector", "view")
                    .setStaticPropertyNames("macros")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Routing/ResponseFactory.php")
                    .addInterface("Illuminate\\Contracts\\Routing\\ResponseFactory")
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
