package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.BaseMatcher;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Core/IsTypeOf.php

*/

public class IsTypeOf extends BaseMatcher {

    public Object _theType = null;

    public IsTypeOf(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IsTypeOf.class) {
            this.__construct(env, args);
        }
    }

    public IsTypeOf(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "theType")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object theType = assignParameter(args, 0, false);
        this._theType = NamespaceGlobal.strtolower.env(env).call(theType).value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    public Object matches(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.equalityCheck(
                        NamespaceGlobal.strtolower
                                .env(env)
                                .call(NamespaceGlobal.gettype.env(env).call(item).value())
                                .value(),
                        this._theType));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "description", typeHint = "Hamcrest\\Description")
    public Object describeTo(RuntimeEnv env, Object... args) {
        Object description = assignParameter(args, 0, false);
        env.callMethod(
                description,
                "appendText",
                IsTypeOf.class,
                runtimeStaticObject.getTypeDescription(env, this._theType));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    @ConvertedParameter(index = 1, name = "description", typeHint = "Hamcrest\\Description")
    public Object describeMismatch(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        Object description = assignParameter(args, 1, false);
        if (ZVal.strictEqualityCheck(item, "===", ZVal.getNull())) {
            env.callMethod(description, "appendText", IsTypeOf.class, "was null");

        } else {
            env.callMethod(
                    env.callMethod(
                            env.callMethod(
                                    env.callMethod(
                                            description, "appendText", IsTypeOf.class, "was "),
                                    "appendText",
                                    IsTypeOf.class,
                                    runtimeStaticObject.getTypeDescription(
                                            env,
                                            NamespaceGlobal.strtolower
                                                    .env(env)
                                                    .call(
                                                            NamespaceGlobal.gettype
                                                                    .env(env)
                                                                    .call(item)
                                                                    .value())
                                                    .value())),
                            "appendText",
                            IsTypeOf.class,
                            " "),
                    "appendValue",
                    IsTypeOf.class,
                    item);
        }

        return null;
    }

    public static final Object CONST_class = "Hamcrest\\Core\\IsTypeOf";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends BaseMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "type")
        public Object getTypeDescription(RuntimeEnv env, Object... args) {
            Object type = assignParameter(args, 0, false);
            if (ZVal.equalityCheck(type, "null")) {
                return "null";
            }

            return ZVal.assign(
                    toStringR(
                                    ZVal.strictEqualityCheck(
                                                    function_strpos
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    "aeiou",
                                                                    function_substr
                                                                            .f
                                                                            .env(env)
                                                                            .call(type, 0, 1)
                                                                            .value())
                                                            .value(),
                                                    "===",
                                                    false)
                                            ? "a "
                                            : "an ",
                                    env)
                            + toStringR(type, env));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "theType")
        public Object typeOf(RuntimeEnv env, Object... args) {
            Object theType = assignParameter(args, 0, false);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Hamcrest
                            .namespaces
                            .Core
                            .classes
                            .IsTypeOf(env, theType));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Core\\IsTypeOf")
                    .setLookup(
                            IsTypeOf.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_theType")
                    .setFilename("vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Core/IsTypeOf.php")
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
