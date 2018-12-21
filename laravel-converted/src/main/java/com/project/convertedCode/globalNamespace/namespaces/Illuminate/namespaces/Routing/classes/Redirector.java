package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.classes.RedirectResponse;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
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

 vendor/laravel/framework/src/Illuminate/Routing/Redirector.php

*/

public class Redirector extends RuntimeClassBase {

    public Object generator = null;

    public Object session = null;

    public Redirector(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Redirector.class) {
            this.__construct(env, args);
        }
    }

    public Redirector(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "generator",
        typeHint = "Illuminate\\Routing\\UrlGenerator"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object generator = assignParameter(args, 0, false);
        this.generator = generator;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "status",
        defaultValue = "302",
        defaultValueType = "number"
    )
    public Object home(RuntimeEnv env, Object... args) {
        Object status = assignParameter(args, 0, true);
        if (null == status) {
            status = 302;
        }
        return ZVal.assign(
                this.to(
                        env,
                        env.callMethod(this.generator, "route", Redirector.class, "home"),
                        status));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "status",
        defaultValue = "302",
        defaultValueType = "number"
    )
    @ConvertedParameter(index = 1, name = "headers", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 2,
        name = "fallback",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object back(RuntimeEnv env, Object... args) {
        Object status = assignParameter(args, 0, true);
        if (null == status) {
            status = 302;
        }
        Object headers = assignParameter(args, 1, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        Object fallback = assignParameter(args, 2, true);
        if (null == fallback) {
            fallback = false;
        }
        return ZVal.assign(
                this.createRedirect(
                        env,
                        env.callMethod(this.generator, "previous", Redirector.class, fallback),
                        status,
                        headers));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "status",
        defaultValue = "302",
        defaultValueType = "number"
    )
    @ConvertedParameter(index = 1, name = "headers", defaultValue = "", defaultValueType = "array")
    public Object refresh(RuntimeEnv env, Object... args) {
        Object status = assignParameter(args, 0, true);
        if (null == status) {
            status = 302;
        }
        Object headers = assignParameter(args, 1, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        return ZVal.assign(
                this.to(
                        env,
                        env.callMethod(
                                env.callMethod(this.generator, "getRequest", Redirector.class),
                                "path",
                                Redirector.class),
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
    public Object guest(RuntimeEnv env, Object... args) {
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
        env.callMethod(
                this.session,
                "put",
                Redirector.class,
                "url.intended",
                env.callMethod(this.generator, "full", Redirector.class));
        return ZVal.assign(this.to(env, path, status, headers, secure));
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
    public Object intended(RuntimeEnv env, Object... args) {
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
        Object path = null;
        path = env.callMethod(this.session, "pull", Redirector.class, "url.intended", _pDefault);
        return ZVal.assign(this.to(env, path, status, headers, secure));
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
    public Object to(RuntimeEnv env, Object... args) {
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
                this.createRedirect(
                        env,
                        env.callMethod(
                                this.generator,
                                "to",
                                Redirector.class,
                                path,
                                ZVal.newArray(),
                                secure),
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
    public Object away(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object status = assignParameter(args, 1, true);
        if (null == status) {
            status = 302;
        }
        Object headers = assignParameter(args, 2, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        return ZVal.assign(this.createRedirect(env, path, status, headers));
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
    public Object secure(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object status = assignParameter(args, 1, true);
        if (null == status) {
            status = 302;
        }
        Object headers = assignParameter(args, 2, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        return ZVal.assign(this.to(env, path, status, headers, true));
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
    public Object route(RuntimeEnv env, Object... args) {
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
                this.to(
                        env,
                        env.callMethod(
                                this.generator, "route", Redirector.class, route, parameters),
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
    public Object action(RuntimeEnv env, Object... args) {
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
                this.to(
                        env,
                        env.callMethod(
                                this.generator, "action", Redirector.class, action, parameters),
                        status,
                        headers));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "status")
    @ConvertedParameter(index = 2, name = "headers")
    protected Object createRedirect(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Routing/Redirector.php");
        Object path = assignParameter(args, 0, false);
        Object status = assignParameter(args, 1, false);
        Object headers = assignParameter(args, 2, false);
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                new RedirectResponse(env, path, status, headers),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Routing",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "redirect")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object redirect = assignParameter(args, 0, false);
                                        if (ZVal.isset(Redirector.this.session)) {
                                            env.callMethod(
                                                    redirect,
                                                    "setSession",
                                                    Redirector.class,
                                                    Redirector.this.session);
                                        }

                                        env.callMethod(
                                                redirect,
                                                "setRequest",
                                                Redirector.class,
                                                env.callMethod(
                                                        Redirector.this.generator,
                                                        "getRequest",
                                                        Redirector.class));
                                        return null;
                                    }
                                })
                        .value());
    }

    @ConvertedMethod
    public Object getUrlGenerator(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.generator);
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
        Object parameters = assignParameter(args, 1, false);
        Object macro = null;
        if (!ZVal.isTrue(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Redirector.class)
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
                                                .Redirector
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
                                            Redirector.class,
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

    public static final Object CONST_class = "Illuminate\\Routing\\Redirector";

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
                                    .Redirector
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
                            Redirector.class,
                            ZVal.toLong(256) | ZVal.toLong(512));
            for (ZPair zpairResult2353 : ZVal.getIterable(methods, env, true)) {
                method = ZVal.assign(zpairResult2353.getValue());
                env.callMethod(method, "setAccessible", Redirector.class, true);
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Redirector.class)
                        .method("macro")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                toObjectR(method).accessProp(this, env).name("name").value(),
                                env.callMethod(method, "invoke", Redirector.class, mixin))
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
                                            .Redirector
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
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Redirector.class)
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
                                                    .Redirector
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
                                                                        .Redirector
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
                                                            .Redirector
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
                    .setName("Illuminate\\Routing\\Redirector")
                    .setLookup(
                            Redirector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "session")
                    .setStaticPropertyNames("macros")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Routing/Redirector.php")
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
