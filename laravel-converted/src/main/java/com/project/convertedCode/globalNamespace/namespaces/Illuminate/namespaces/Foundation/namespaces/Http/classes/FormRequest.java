package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Http.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Validation.classes.ValidationException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Access.classes.AuthorizationException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.classes.Request;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Validation.classes.Factory;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Validation.classes.ValidatesWhenResolved;
import com.runtimeconverter.runtime.RuntimeStack;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Http/FormRequest.php

*/

public class FormRequest extends Request implements ValidatesWhenResolved {

    public Object container = null;

    public Object redirector = null;

    public Object redirect = null;

    public Object redirectRoute = null;

    public Object redirectAction = null;

    public Object errorBag = "default";

    public FormRequest(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FormRequest.class) {
            this.__construct(env, args);
        }
    }

    public FormRequest(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    protected Object getValidatorInstance(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope138 scope = new Scope138();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Http")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Foundation/Http/FormRequest.php");
            scope.factory = null;
            scope.validator = null;
            scope.factory =
                    env.callMethod(this.container, "make", FormRequest.class, Factory.CONST_class);
            if (function_method_exists
                    .f
                    .env(env)
                    .call(scope._thisVarAlias, "validator")
                    .getBool()) {
                scope.validator =
                        env.callMethod(
                                this.container,
                                "call",
                                FormRequest.class,
                                ZVal.newArray(
                                        new ZPair(0, scope._thisVarAlias),
                                        new ZPair(1, "validator")),
                                function_compact.f.env(env).call(stack, "factory").value());

            } else {
                scope.validator = this.createDefaultValidator(env, scope.factory);
            }

            if (function_method_exists
                    .f
                    .env(env)
                    .call(scope._thisVarAlias, "withValidator")
                    .getBool()) {
                env.callMethod(
                        scope._thisVarAlias, "withValidator", FormRequest.class, scope.validator);
            }

            throw new IncludeEventException(ZVal.assign(scope.validator));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "factory",
        typeHint = "Illuminate\\Contracts\\Validation\\Factory"
    )
    protected Object createDefaultValidator(RuntimeEnv env, Object... args) {
        Object factory = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        factory,
                        "make",
                        FormRequest.class,
                        this.validationData(env),
                        env.callMethod(
                                this.container,
                                "call",
                                FormRequest.class,
                                ZVal.newArray(new ZPair(0, this), new ZPair(1, "rules"))),
                        this.messages(env),
                        this.attributes(env)));
    }

    @ConvertedMethod
    protected Object validationData(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "all", FormRequest.class));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "validator",
        typeHint = "Illuminate\\Contracts\\Validation\\Validator"
    )
    protected Object failedValidation(RuntimeEnv env, Object... args) {
        Object validator = assignParameter(args, 0, false);
        throw ZVal.getException(
                env,
                env.callMethod(
                        env.callMethod(
                                new ValidationException(env, validator),
                                "errorBag",
                                FormRequest.class,
                                this.errorBag),
                        "redirectTo",
                        FormRequest.class,
                        this.getRedirectUrl(env)));
    }

    @ConvertedMethod
    protected Object getRedirectUrl(RuntimeEnv env, Object... args) {
        Object url = null;
        url = env.callMethod(this.redirector, "getUrlGenerator", FormRequest.class);
        if (ZVal.isTrue(this.redirect)) {
            return ZVal.assign(env.callMethod(url, "to", FormRequest.class, this.redirect));

        } else if (ZVal.isTrue(this.redirectRoute)) {
            return ZVal.assign(env.callMethod(url, "route", FormRequest.class, this.redirectRoute));

        } else if (ZVal.isTrue(this.redirectAction)) {
            return ZVal.assign(
                    env.callMethod(url, "action", FormRequest.class, this.redirectAction));
        }

        return ZVal.assign(env.callMethod(url, "previous", FormRequest.class));
    }

    @ConvertedMethod
    protected Object passesAuthorization(RuntimeEnv env, Object... args) {
        if (function_method_exists.f.env(env).call(this, "authorize").getBool()) {
            return ZVal.assign(
                    env.callMethod(
                            this.container,
                            "call",
                            FormRequest.class,
                            ZVal.newArray(new ZPair(0, this), new ZPair(1, "authorize"))));
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    protected Object failedAuthorization(RuntimeEnv env, Object... args) {
        throw ZVal.getException(
                env, new AuthorizationException(env, "This action is unauthorized."));
    }

    @ConvertedMethod
    public Object validated(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Http")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Http/FormRequest.php");
        Object rules = null;
        rules =
                env.callMethod(
                        this.container,
                        "call",
                        FormRequest.class,
                        ZVal.newArray(new ZPair(0, this), new ZPair(1, "rules")));
        return ZVal.assign(
                env.callMethod(
                        this,
                        "only",
                        FormRequest.class,
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                env.callMethod(
                                                        collect.f.env(env).call(rules).value(),
                                                        "keys",
                                                        FormRequest.class),
                                                "map",
                                                FormRequest.class,
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Illuminate\\Foundation\\Http",
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
                                        FormRequest.class),
                                "toArray",
                                FormRequest.class)));
    }

    @ConvertedMethod
    public Object messages(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    public Object attributes(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "redirector",
        typeHint = "Illuminate\\Routing\\Redirector"
    )
    public Object setRedirector(RuntimeEnv env, Object... args) {
        Object redirector = assignParameter(args, 0, false);
        this.redirector = redirector;
        return ZVal.assign(this);
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
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object validateResolved(RuntimeEnv env, Object... args) {
        Object instance = null;
        this.prepareForValidation(env);
        if (!ZVal.isTrue(this.passesAuthorization(env))) {
            this.failedAuthorization(env);
        }

        instance = this.getValidatorInstance(env);
        if (!ZVal.isTrue(env.callMethod(instance, "passes", FormRequest.class))) {
            this.failedValidation(env, instance);
        }

        return null;
    }

    @ConvertedMethod
    protected Object prepareForValidation(RuntimeEnv env, Object... args) {
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Http\\FormRequest";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Request.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Foundation\\Http\\FormRequest")
                    .setLookup(
                            FormRequest.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "acceptableContentTypes",
                            "attributes",
                            "basePath",
                            "baseUrl",
                            "charsets",
                            "container",
                            "content",
                            "convertedFiles",
                            "cookies",
                            "defaultLocale",
                            "encodings",
                            "errorBag",
                            "files",
                            "format",
                            "headers",
                            "isForwardedValid",
                            "isHostValid",
                            "json",
                            "languages",
                            "locale",
                            "method",
                            "pathInfo",
                            "query",
                            "redirect",
                            "redirectAction",
                            "redirectRoute",
                            "redirector",
                            "request",
                            "requestUri",
                            "routeResolver",
                            "server",
                            "session",
                            "userResolver")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Http/FormRequest.php")
                    .addInterface("Illuminate\\Contracts\\Validation\\ValidatesWhenResolved")
                    .addInterface("Illuminate\\Contracts\\Support\\Arrayable")
                    .addInterface("ArrayAccess")
                    .addTrait("Illuminate\\Validation\\ValidatesWhenResolvedTrait")
                    .addExtendsClass("Illuminate\\Http\\Request")
                    .addExtendsClass("Symfony\\Component\\HttpFoundation\\Request")
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

    private static class Scope138 implements UpdateRuntimeScopeInterface {

        Object factory;
        Object _thisVarAlias;
        Object validator;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("factory", this.factory);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("validator", this.validator);
        }

        public void updateScope(RuntimeStack stack) {

            this.factory = stack.getVariable("factory");
            this._thisVarAlias = stack.getVariable("this");
            this.validator = stack.getVariable("validator");
        }
    }
}
