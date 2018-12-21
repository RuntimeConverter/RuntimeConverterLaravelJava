package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Text.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes.AnyOf;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.BaseMatcher;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes.IsNull;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Text/IsEmptyString.php

*/

public class IsEmptyString extends BaseMatcher {

    public Object _empty = null;

    public IsEmptyString(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IsEmptyString.class) {
            this.__construct(env, args);
        }
    }

    public IsEmptyString(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "empty",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object empty = assignParameter(args, 0, true);
        if (null == empty) {
            empty = true;
        }
        this._empty = empty;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    public Object matches(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isTrue(this._empty)
                        ? ZVal.strictEqualityCheck(item, "===", "")
                        : ZVal.toBool(function_is_string.f.env(env).call(item).value())
                                && ZVal.toBool(ZVal.strictNotEqualityCheck(item, "!==", "")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "description", typeHint = "Hamcrest\\Description")
    public Object describeTo(RuntimeEnv env, Object... args) {
        Object description = assignParameter(args, 0, false);
        env.callMethod(
                description,
                "appendText",
                IsEmptyString.class,
                ZVal.isTrue(this._empty) ? "an empty string" : "a non-empty string");
        return null;
    }

    public static final Object CONST_class = "Hamcrest\\Text\\IsEmptyString";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends BaseMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object isEmptyString(RuntimeEnv env, Object... args) {
            if (!ZVal.isTrue(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Hamcrest
                                            .namespaces
                                            .Text
                                            .classes
                                            .IsEmptyString
                                            .RequestStaticProperties
                                            .class)
                            ._INSTANCE)) {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Hamcrest
                                                .namespaces
                                                .Text
                                                .classes
                                                .IsEmptyString
                                                .RequestStaticProperties
                                                .class)
                                ._INSTANCE =
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Hamcrest
                                .namespaces
                                .Text
                                .classes
                                .IsEmptyString(env, true);
            }

            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Hamcrest
                                            .namespaces
                                            .Text
                                            .classes
                                            .IsEmptyString
                                            .RequestStaticProperties
                                            .class)
                            ._INSTANCE);
        }

        @ConvertedMethod
        public Object isEmptyOrNullString(RuntimeEnv env, Object... args) {
            if (!ZVal.isTrue(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Hamcrest
                                            .namespaces
                                            .Text
                                            .classes
                                            .IsEmptyString
                                            .RequestStaticProperties
                                            .class)
                            ._NULL_OR_EMPTY_INSTANCE)) {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Hamcrest
                                                .namespaces
                                                .Text
                                                .classes
                                                .IsEmptyString
                                                .RequestStaticProperties
                                                .class)
                                ._NULL_OR_EMPTY_INSTANCE =
                        AnyOf.runtimeStaticObject.anyOf(
                                env,
                                IsNull.runtimeStaticObject.nullValue(env),
                                runtimeStaticObject.isEmptyString(env));
            }

            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Hamcrest
                                            .namespaces
                                            .Text
                                            .classes
                                            .IsEmptyString
                                            .RequestStaticProperties
                                            .class)
                            ._NULL_OR_EMPTY_INSTANCE);
        }

        @ConvertedMethod
        public Object isNonEmptyString(RuntimeEnv env, Object... args) {
            if (!ZVal.isTrue(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Hamcrest
                                            .namespaces
                                            .Text
                                            .classes
                                            .IsEmptyString
                                            .RequestStaticProperties
                                            .class)
                            ._NOT_INSTANCE)) {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Hamcrest
                                                .namespaces
                                                .Text
                                                .classes
                                                .IsEmptyString
                                                .RequestStaticProperties
                                                .class)
                                ._NOT_INSTANCE =
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Hamcrest
                                .namespaces
                                .Text
                                .classes
                                .IsEmptyString(env, false);
            }

            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Hamcrest
                                            .namespaces
                                            .Text
                                            .classes
                                            .IsEmptyString
                                            .RequestStaticProperties
                                            .class)
                            ._NOT_INSTANCE);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object _INSTANCE = null;

        public Object _NULL_OR_EMPTY_INSTANCE = null;

        public Object _NOT_INSTANCE = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Text\\IsEmptyString")
                    .setLookup(
                            IsEmptyString.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_empty")
                    .setStaticPropertyNames("_INSTANCE", "_NOT_INSTANCE", "_NULL_OR_EMPTY_INSTANCE")
                    .setFilename(
                            "vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Text/IsEmptyString.php")
                    .addInterface("Hamcrest\\Matcher")
                    .addInterface("Hamcrest\\SelfDescribing")
                    .addExtendsClass("Hamcrest\\BaseMatcher")
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
