package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.BaseMatcher;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/TypeSafeMatcher.php

*/

public abstract class TypeSafeMatcher extends BaseMatcher {

    public Object _expectedType = null;

    public Object _expectedSubtype = null;

    public TypeSafeMatcher(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TypeSafeMatcher.class) {
            this.__construct(env, args);
        }
    }

    public TypeSafeMatcher(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expectedType")
    @ConvertedParameter(
        index = 1,
        name = "expectedSubtype",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object expectedType = assignParameter(args, 0, false);
        Object expectedSubtype = assignParameter(args, 1, true);
        if (null == expectedSubtype) {
            expectedSubtype = ZVal.getNull();
        }
        this._expectedType = expectedType;
        this._expectedSubtype = expectedSubtype;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    public final Object matches(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(this._isSafeType(env, item))
                        && ZVal.toBool(
                                env.callMethod(
                                        this, "matchesSafely", TypeSafeMatcher.class, item)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    @ConvertedParameter(index = 1, name = "mismatchDescription", typeHint = "Hamcrest\\Description")
    public final Object describeMismatch(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        Object mismatchDescription = assignParameter(args, 1, false);
        if (!ZVal.isTrue(this._isSafeType(env, item))) {
            super.describeMismatch(env, item, mismatchDescription);

        } else {
            env.callMethod(
                    this,
                    "describeMismatchSafely",
                    TypeSafeMatcher.class,
                    item,
                    mismatchDescription);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    private Object _isSafeType(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        SwitchEnumType18 switchVariable18 =
                ZVal.getEnum(
                        this._expectedType,
                        SwitchEnumType18.DEFAULT_CASE,
                        SwitchEnumType18.DYNAMIC_TYPE_56,
                        CONST_TYPE_ANY,
                        SwitchEnumType18.DYNAMIC_TYPE_57,
                        CONST_TYPE_STRING,
                        SwitchEnumType18.DYNAMIC_TYPE_58,
                        CONST_TYPE_NUMERIC,
                        SwitchEnumType18.DYNAMIC_TYPE_59,
                        CONST_TYPE_ARRAY,
                        SwitchEnumType18.DYNAMIC_TYPE_60,
                        CONST_TYPE_OBJECT,
                        SwitchEnumType18.DYNAMIC_TYPE_61,
                        CONST_TYPE_RESOURCE,
                        SwitchEnumType18.DYNAMIC_TYPE_62,
                        CONST_TYPE_BOOLEAN);
        switch (switchVariable18) {
            case DYNAMIC_TYPE_56:
                return ZVal.assign(true);
            case DYNAMIC_TYPE_57:
                return ZVal.assign(
                        ZVal.toBool(function_is_string.f.env(env).call(value).value())
                                || ZVal.toBool(function_is_numeric.f.env(env).call(value).value()));
            case DYNAMIC_TYPE_58:
                return ZVal.assign(
                        ZVal.toBool(function_is_numeric.f.env(env).call(value).value())
                                || ZVal.toBool(function_is_string.f.env(env).call(value).value()));
            case DYNAMIC_TYPE_59:
                return ZVal.assign(function_is_array.f.env(env).call(value).value());
            case DYNAMIC_TYPE_60:
                return ZVal.assign(
                        ZVal.toBool(function_is_object.f.env(env).call(value).value())
                                && ZVal.toBool(
                                        ZVal.toBool(
                                                        ZVal.strictEqualityCheck(
                                                                this._expectedSubtype,
                                                                "===",
                                                                ZVal.getNull()))
                                                || ZVal.toBool(
                                                        ZVal.checkInstanceTypeMatch(
                                                                value, this._expectedSubtype))));
            case DYNAMIC_TYPE_61:
                return ZVal.assign(
                        ZVal.toBool(function_is_resource.f.env(env).call(value).value())
                                && ZVal.toBool(
                                        ZVal.toBool(
                                                        ZVal.strictEqualityCheck(
                                                                this._expectedSubtype,
                                                                "===",
                                                                ZVal.getNull()))
                                                || ZVal.toBool(
                                                        ZVal.equalityCheck(
                                                                NamespaceGlobal.get_resource_type
                                                                        .env(env)
                                                                        .call(value)
                                                                        .value(),
                                                                this._expectedSubtype))));
            case DYNAMIC_TYPE_62:
                return ZVal.assign(true);
            case DEFAULT_CASE:
                return ZVal.assign(true);
        }
        ;
        return null;
    }

    public static final Object CONST_TYPE_ANY = 0;

    public static final Object CONST_TYPE_STRING = 1;

    public static final Object CONST_TYPE_NUMERIC = 2;

    public static final Object CONST_TYPE_ARRAY = 3;

    public static final Object CONST_TYPE_OBJECT = 4;

    public static final Object CONST_TYPE_RESOURCE = 5;

    public static final Object CONST_TYPE_BOOLEAN = 6;

    public static final Object CONST_class = "Hamcrest\\TypeSafeMatcher";

    @ConvertedMethod()
    public abstract Object describeTo(RuntimeEnv env, Object... args);

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends BaseMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\TypeSafeMatcher")
                    .setLookup(
                            TypeSafeMatcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_expectedSubtype", "_expectedType")
                    .setFilename(
                            "vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/TypeSafeMatcher.php")
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

    private enum SwitchEnumType18 {
        DYNAMIC_TYPE_56,
        DYNAMIC_TYPE_57,
        DYNAMIC_TYPE_58,
        DYNAMIC_TYPE_59,
        DYNAMIC_TYPE_60,
        DYNAMIC_TYPE_61,
        DYNAMIC_TYPE_62,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
