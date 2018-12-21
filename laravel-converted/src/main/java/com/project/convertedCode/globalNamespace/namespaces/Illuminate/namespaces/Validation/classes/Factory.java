package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Validation.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Validation.classes.Validator;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Validation/Factory.php

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
                .Validation
                .classes
                .Factory {

    public Object translator = null;

    public Object verifier = null;

    public Object container = null;

    public Object extensions = ZVal.newArray();

    public Object implicitExtensions = ZVal.newArray();

    public Object dependentExtensions = ZVal.newArray();

    public Object replacers = ZVal.newArray();

    public Object fallbackMessages = ZVal.newArray();

    public Object resolver = null;

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
        name = "translator",
        typeHint = "Illuminate\\Contracts\\Translation\\Translator"
    )
    @ConvertedParameter(
        index = 1,
        name = "container",
        typeHint = "Illuminate\\Contracts\\Container\\Container",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object translator = assignParameter(args, 0, false);
        Object container = assignParameter(args, 1, true);
        if (null == container) {
            container = ZVal.getNull();
        }
        this.container = container;
        this.translator = translator;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
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
    public Object make(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        Object rules = assignParameter(args, 1, false);
        Object messages = assignParameter(args, 2, true);
        if (null == messages) {
            messages = ZVal.newArray();
        }
        Object customAttributes = assignParameter(args, 3, true);
        if (null == customAttributes) {
            customAttributes = ZVal.newArray();
        }
        Object validator = null;
        validator = this.resolve(env, data, rules, messages, customAttributes);
        if (!function_is_null.f.env(env).call(this.verifier).getBool()) {
            env.callMethod(validator, "setPresenceVerifier", Factory.class, this.verifier);
        }

        if (!function_is_null.f.env(env).call(this.container).getBool()) {
            env.callMethod(validator, "setContainer", Factory.class, this.container);
        }

        this.addExtensions(env, validator);
        return ZVal.assign(validator);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
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
        Object data = assignParameter(args, 0, false);
        Object rules = assignParameter(args, 1, false);
        Object messages = assignParameter(args, 2, true);
        if (null == messages) {
            messages = ZVal.newArray();
        }
        Object customAttributes = assignParameter(args, 3, true);
        if (null == customAttributes) {
            customAttributes = ZVal.newArray();
        }
        return ZVal.assign(
                env.callMethod(
                        this.make(env, data, rules, messages, customAttributes),
                        "validate",
                        Factory.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    @ConvertedParameter(index = 1, name = "rules", typeHint = "array")
    @ConvertedParameter(index = 2, name = "messages", typeHint = "array")
    @ConvertedParameter(index = 3, name = "customAttributes", typeHint = "array")
    protected Object resolve(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        Object rules = assignParameter(args, 1, false);
        Object messages = assignParameter(args, 2, false);
        Object customAttributes = assignParameter(args, 3, false);
        if (function_is_null.f.env(env).call(this.resolver).getBool()) {
            return ZVal.assign(
                    new Validator(env, this.translator, data, rules, messages, customAttributes));
        }

        return ZVal.assign(
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(
                                this.resolver,
                                this.translator,
                                data,
                                rules,
                                messages,
                                customAttributes)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "validator",
        typeHint = "Illuminate\\Validation\\Validator"
    )
    protected Object addExtensions(RuntimeEnv env, Object... args) {
        Object validator = assignParameter(args, 0, false);
        env.callMethod(validator, "addExtensions", Factory.class, this.extensions);
        env.callMethod(validator, "addImplicitExtensions", Factory.class, this.implicitExtensions);
        env.callMethod(
                validator, "addDependentExtensions", Factory.class, this.dependentExtensions);
        env.callMethod(validator, "addReplacers", Factory.class, this.replacers);
        env.callMethod(validator, "setFallbackMessages", Factory.class, this.fallbackMessages);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rule")
    @ConvertedParameter(index = 1, name = "extension")
    @ConvertedParameter(
        index = 2,
        name = "message",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object extend(RuntimeEnv env, Object... args) {
        Object rule = assignParameter(args, 0, false);
        Object extension = assignParameter(args, 1, false);
        Object message = assignParameter(args, 2, true);
        if (null == message) {
            message = ZVal.getNull();
        }
        new ReferenceClassProperty(this, "extensions", env).arrayAccess(env, rule).set(extension);
        if (ZVal.isTrue(message)) {
            new ReferenceClassProperty(this, "fallbackMessages", env)
                    .arrayAccess(env, Str.runtimeStaticObject.snake(env, rule))
                    .set(message);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rule")
    @ConvertedParameter(index = 1, name = "extension")
    @ConvertedParameter(
        index = 2,
        name = "message",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object extendImplicit(RuntimeEnv env, Object... args) {
        Object rule = assignParameter(args, 0, false);
        Object extension = assignParameter(args, 1, false);
        Object message = assignParameter(args, 2, true);
        if (null == message) {
            message = ZVal.getNull();
        }
        new ReferenceClassProperty(this, "implicitExtensions", env)
                .arrayAccess(env, rule)
                .set(extension);
        if (ZVal.isTrue(message)) {
            new ReferenceClassProperty(this, "fallbackMessages", env)
                    .arrayAccess(env, Str.runtimeStaticObject.snake(env, rule))
                    .set(message);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rule")
    @ConvertedParameter(index = 1, name = "extension")
    @ConvertedParameter(
        index = 2,
        name = "message",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object extendDependent(RuntimeEnv env, Object... args) {
        Object rule = assignParameter(args, 0, false);
        Object extension = assignParameter(args, 1, false);
        Object message = assignParameter(args, 2, true);
        if (null == message) {
            message = ZVal.getNull();
        }
        new ReferenceClassProperty(this, "dependentExtensions", env)
                .arrayAccess(env, rule)
                .set(extension);
        if (ZVal.isTrue(message)) {
            new ReferenceClassProperty(this, "fallbackMessages", env)
                    .arrayAccess(env, Str.runtimeStaticObject.snake(env, rule))
                    .set(message);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rule")
    @ConvertedParameter(index = 1, name = "replacer")
    public Object replacer(RuntimeEnv env, Object... args) {
        Object rule = assignParameter(args, 0, false);
        Object replacer = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "replacers", env).arrayAccess(env, rule).set(replacer);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resolver", typeHint = "Closure")
    public Object resolver(RuntimeEnv env, Object... args) {
        Object resolver = assignParameter(args, 0, false);
        this.resolver = resolver;
        return null;
    }

    @ConvertedMethod
    public Object getTranslator(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.translator);
    }

    @ConvertedMethod
    public Object getPresenceVerifier(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.verifier);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "presenceVerifier",
        typeHint = "Illuminate\\Validation\\PresenceVerifierInterface"
    )
    public Object setPresenceVerifier(RuntimeEnv env, Object... args) {
        Object presenceVerifier = assignParameter(args, 0, false);
        this.verifier = presenceVerifier;
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Validation\\Factory";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Validation\\Factory")
                    .setLookup(
                            Factory.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "container",
                            "dependentExtensions",
                            "extensions",
                            "fallbackMessages",
                            "implicitExtensions",
                            "replacers",
                            "resolver",
                            "translator",
                            "verifier")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Validation/Factory.php")
                    .addInterface("Illuminate\\Contracts\\Validation\\Factory")
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
