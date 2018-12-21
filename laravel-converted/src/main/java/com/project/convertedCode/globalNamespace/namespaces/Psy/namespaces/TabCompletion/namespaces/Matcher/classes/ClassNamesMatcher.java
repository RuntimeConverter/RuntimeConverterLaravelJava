package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes.AbstractMatcher;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_declared_classes;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/TabCompletion/Matcher/ClassNamesMatcher.php

*/

public class ClassNamesMatcher extends AbstractMatcher {

    public ClassNamesMatcher(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ClassNamesMatcher(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "info",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object getMatches(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/psy/psysh/src/TabCompletion/Matcher")
                        .setFile(
                                "/vendor/psy/psysh/src/TabCompletion/Matcher/ClassNamesMatcher.php");
        Object tokens = assignParameter(args, 0, false);
        Object info = assignParameter(args, 1, true);
        if (null == info) {
            info = ZVal.newArray();
        }
        Object quotedClass = null;
        ReferenceContainer _pClass = new BasicReferenceContainer(null);
        _pClass.setObject(
                env.callMethod(this, "getNamespaceAndClass", ClassNamesMatcher.class, tokens));
        if (ZVal.toBool(
                        ZVal.isGreaterThan(
                                function_strlen.f.env(env).call(_pClass.getObject()).value(),
                                '>',
                                0))
                && ZVal.toBool(ZVal.strictEqualityCheck(_pClass.arrayGet(env, 0), "===", "\\"))) {
            _pClass.setObject(
                    function_substr
                            .f
                            .env(env)
                            .call(
                                    _pClass.getObject(),
                                    1,
                                    function_strlen.f.env(env).call(_pClass.getObject()).value())
                            .value());
        }

        quotedClass = NamespaceGlobal.preg_quote.env(env).call(_pClass.getObject()).value();
        return ZVal.assign(
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Psy\\TabCompletion\\Matcher",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "className")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object className = assignParameter(args, 0, false);
                                        Object pieces = null;
                                        Object nsPos = null;
                                        Object _pClass = null;
                                        _pClass = this.contextReferences.getCapturedValue("class");
                                        nsPos =
                                                NamespaceGlobal.substr_count
                                                        .env(env)
                                                        .call(_pClass, "\\")
                                                        .value();
                                        pieces =
                                                function_explode
                                                        .f
                                                        .env(env)
                                                        .call("\\", className)
                                                        .value();
                                        return ZVal.assign(
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(
                                                                "\\",
                                                                function_array_slice
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                pieces,
                                                                                nsPos,
                                                                                function_count
                                                                                        .f
                                                                                        .env(env)
                                                                                        .call(
                                                                                                pieces)
                                                                                        .value())
                                                                        .value())
                                                        .value());
                                    }
                                }.use("class", _pClass),
                                function_array_filter
                                        .f
                                        .env(env)
                                        .call(
                                                function_get_declared_classes
                                                        .f
                                                        .env(env)
                                                        .call()
                                                        .value(),
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Psy\\TabCompletion\\Matcher",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(
                                                        index = 0,
                                                        name = "className"
                                                    )
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object className =
                                                                assignParameter(args, 0, false);
                                                        Object quotedClass = null;
                                                        quotedClass =
                                                                this.contextReferences
                                                                        .getCapturedValue(
                                                                                "quotedClass");
                                                        return ZVal.assign(
                                                                AbstractMatcher.runtimeStaticObject
                                                                        .startsWith(
                                                                                env,
                                                                                quotedClass,
                                                                                className));
                                                    }
                                                }.use("quotedClass", quotedClass))
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens", typeHint = "array")
    public Object hasMatched(RuntimeEnv env, Object... args) {
        Object tokens = assignParameter(args, 0, false);
        Object blacklistedTokens = null;
        Object prevToken = null;
        Object token = null;
        token = function_array_pop.f.env(env).call(tokens).value();
        prevToken = function_array_pop.f.env(env).call(tokens).value();
        blacklistedTokens =
                ZVal.newArray(
                        new ZPair(0, CONST_T_INCLUDE),
                        new ZPair(1, CONST_T_INCLUDE_ONCE),
                        new ZPair(2, CONST_T_REQUIRE),
                        new ZPair(3, CONST_T_REQUIRE_ONCE));
        SwitchEnumType82 switchVariable82 =
                ZVal.getEnum(
                        true,
                        SwitchEnumType82.DEFAULT_CASE,
                        SwitchEnumType82.DYNAMIC_TYPE_300,
                        runtimeStaticObject.hasToken(
                                env, ZVal.newArray(new ZPair(0, blacklistedTokens)), token),
                        SwitchEnumType82.DYNAMIC_TYPE_301,
                        runtimeStaticObject.hasToken(
                                env, ZVal.newArray(new ZPair(0, blacklistedTokens)), prevToken),
                        SwitchEnumType82.DYNAMIC_TYPE_302,
                        ZVal.toBool(function_is_string.f.env(env).call(token).value())
                                && ZVal.toBool(ZVal.strictEqualityCheck(token, "===", "$")),
                        SwitchEnumType82.DYNAMIC_TYPE_303,
                        runtimeStaticObject.hasToken(
                                env,
                                ZVal.newArray(
                                        new ZPair(0, CONST_T_NEW),
                                        new ZPair(1, CONST_T_OPEN_TAG),
                                        new ZPair(2, CONST_T_NS_SEPARATOR),
                                        new ZPair(3, CONST_T_STRING)),
                                prevToken),
                        SwitchEnumType82.DYNAMIC_TYPE_304,
                        runtimeStaticObject.hasToken(
                                env,
                                ZVal.newArray(
                                        new ZPair(0, CONST_T_NEW),
                                        new ZPair(1, CONST_T_OPEN_TAG),
                                        new ZPair(2, CONST_T_NS_SEPARATOR)),
                                token),
                        SwitchEnumType82.DYNAMIC_TYPE_305,
                        runtimeStaticObject.hasToken(
                                env,
                                ZVal.newArray(
                                        new ZPair(0, CONST_T_OPEN_TAG),
                                        new ZPair(1, CONST_T_VARIABLE)),
                                token),
                        SwitchEnumType82.DYNAMIC_TYPE_306,
                        runtimeStaticObject.isOperator(env, token));
        switch (switchVariable82) {
            case DYNAMIC_TYPE_300:
            case DYNAMIC_TYPE_301:
            case DYNAMIC_TYPE_302:
                return ZVal.assign(false);
            case DYNAMIC_TYPE_303:
            case DYNAMIC_TYPE_304:
            case DYNAMIC_TYPE_305:
            case DYNAMIC_TYPE_306:
                return ZVal.assign(true);
        }
        ;
        return ZVal.assign(false);
    }

    public static final Object CONST_class = "Psy\\TabCompletion\\Matcher\\ClassNamesMatcher";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\TabCompletion\\Matcher\\ClassNamesMatcher")
                    .setLookup(
                            ClassNamesMatcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/psy/psysh/src/TabCompletion/Matcher/ClassNamesMatcher.php")
                    .addExtendsClass("Psy\\TabCompletion\\Matcher\\AbstractMatcher")
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

    private enum SwitchEnumType82 {
        DYNAMIC_TYPE_300,
        DYNAMIC_TYPE_301,
        DYNAMIC_TYPE_302,
        DYNAMIC_TYPE_303,
        DYNAMIC_TYPE_304,
        DYNAMIC_TYPE_305,
        DYNAMIC_TYPE_306,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
