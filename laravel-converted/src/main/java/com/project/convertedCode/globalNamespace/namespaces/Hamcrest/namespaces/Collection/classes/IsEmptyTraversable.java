package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Collection.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.BaseMatcher;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeInterfaces.Traversable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Collection/IsEmptyTraversable.php

*/

public class IsEmptyTraversable extends BaseMatcher {

    public Object _empty = null;

    public IsEmptyTraversable(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IsEmptyTraversable.class) {
            this.__construct(env, args);
        }
    }

    public IsEmptyTraversable(NoConstructor n) {
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
        Object value = null;
        if (!ZVal.isTrue(ZVal.checkInstanceType(item, Traversable.class, "Traversable"))) {
            return ZVal.assign(false);
        }

        for (ZPair zpairResult165 : ZVal.getIterable(item, env, true)) {
            value = ZVal.assign(zpairResult165.getValue());
            return ZVal.assign(!ZVal.isTrue(this._empty));
        }

        return ZVal.assign(this._empty);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "description", typeHint = "Hamcrest\\Description")
    public Object describeTo(RuntimeEnv env, Object... args) {
        Object description = assignParameter(args, 0, false);
        env.callMethod(
                description,
                "appendText",
                IsEmptyTraversable.class,
                ZVal.isTrue(this._empty) ? "an empty traversable" : "a non-empty traversable");
        return null;
    }

    public static final Object CONST_class = "Hamcrest\\Collection\\IsEmptyTraversable";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends BaseMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object emptyTraversable(RuntimeEnv env, Object... args) {
            if (!ZVal.isTrue(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Hamcrest
                                            .namespaces
                                            .Collection
                                            .classes
                                            .IsEmptyTraversable
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
                                                .Collection
                                                .classes
                                                .IsEmptyTraversable
                                                .RequestStaticProperties
                                                .class)
                                ._INSTANCE =
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Hamcrest
                                .namespaces
                                .Collection
                                .classes
                                .IsEmptyTraversable(env);
            }

            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Hamcrest
                                            .namespaces
                                            .Collection
                                            .classes
                                            .IsEmptyTraversable
                                            .RequestStaticProperties
                                            .class)
                            ._INSTANCE);
        }

        @ConvertedMethod
        public Object nonEmptyTraversable(RuntimeEnv env, Object... args) {
            if (!ZVal.isTrue(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Hamcrest
                                            .namespaces
                                            .Collection
                                            .classes
                                            .IsEmptyTraversable
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
                                                .Collection
                                                .classes
                                                .IsEmptyTraversable
                                                .RequestStaticProperties
                                                .class)
                                ._NOT_INSTANCE =
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Hamcrest
                                .namespaces
                                .Collection
                                .classes
                                .IsEmptyTraversable(env, false);
            }

            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Hamcrest
                                            .namespaces
                                            .Collection
                                            .classes
                                            .IsEmptyTraversable
                                            .RequestStaticProperties
                                            .class)
                            ._NOT_INSTANCE);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object _INSTANCE = null;

        public Object _NOT_INSTANCE = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Collection\\IsEmptyTraversable")
                    .setLookup(
                            IsEmptyTraversable.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_empty")
                    .setStaticPropertyNames("_INSTANCE", "_NOT_INSTANCE")
                    .setFilename(
                            "vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Collection/IsEmptyTraversable.php")
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
