package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes.AbstractMatcher;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/TabCompletion/Matcher/KeywordsMatcher.php

*/

public class KeywordsMatcher extends AbstractMatcher {

    public Object keywords =
            ZVal.arrayFromList(
                    "array",
                    "clone",
                    "declare",
                    "die",
                    "echo",
                    "empty",
                    "eval",
                    "exit",
                    "include",
                    "include_once",
                    "isset",
                    "list",
                    "print",
                    "require",
                    "require_once",
                    "unset");

    public Object mandatoryStartKeywords = ZVal.arrayFromList("die", "echo", "print", "unset");

    public KeywordsMatcher(RuntimeEnv env, Object... args) {
        super(env);
    }

    public KeywordsMatcher(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getKeywords(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.keywords);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keyword")
    public Object isKeyword(RuntimeEnv env, Object... args) {
        Object keyword = assignParameter(args, 0, false);
        return ZVal.assign(function_in_array.f.env(env).call(keyword, this.keywords).value());
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
                        .setFile("/vendor/psy/psysh/src/TabCompletion/Matcher/KeywordsMatcher.php");
        Object tokens = assignParameter(args, 0, false);
        Object info = assignParameter(args, 1, true);
        if (null == info) {
            info = ZVal.newArray();
        }
        Object input = null;
        input = env.callMethod(this, "getInput", KeywordsMatcher.class, tokens);
        return ZVal.assign(
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                this.keywords,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Psy\\TabCompletion\\Matcher",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "keyword")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object keyword = assignParameter(args, 0, false);
                                        Object input = null;
                                        input = this.contextReferences.getCapturedValue("input");
                                        return ZVal.assign(
                                                AbstractMatcher.runtimeStaticObject.startsWith(
                                                        env, input, keyword));
                                    }
                                }.use("input", input))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens", typeHint = "array")
    public Object hasMatched(RuntimeEnv env, Object... args) {
        Object tokens = assignParameter(args, 0, false);
        Object prevToken = null;
        Object token = null;
        token = function_array_pop.f.env(env).call(tokens).value();
        prevToken = function_array_pop.f.env(env).call(tokens).value();
        SwitchEnumType86 switchVariable86 =
                ZVal.getEnum(
                        true,
                        SwitchEnumType86.DEFAULT_CASE,
                        SwitchEnumType86.DYNAMIC_TYPE_314,
                        runtimeStaticObject.hasToken(
                                env,
                                ZVal.newArray(
                                        new ZPair(0, CONST_T_OPEN_TAG),
                                        new ZPair(1, CONST_T_VARIABLE)),
                                token),
                        SwitchEnumType86.DYNAMIC_TYPE_315,
                        ZVal.toBool(
                                        runtimeStaticObject.hasToken(
                                                env,
                                                ZVal.newArray(
                                                        new ZPair(0, CONST_T_OPEN_TAG),
                                                        new ZPair(1, CONST_T_VARIABLE)),
                                                prevToken))
                                && ZVal.toBool(
                                        runtimeStaticObject.tokenIs(env, token, CONST_T_STRING)),
                        SwitchEnumType86.DYNAMIC_TYPE_316,
                        runtimeStaticObject.isOperator(env, token));
        switch (switchVariable86) {
            case DYNAMIC_TYPE_314:
            case DYNAMIC_TYPE_315:
            case DYNAMIC_TYPE_316:
                return ZVal.assign(true);
        }
        ;
        return ZVal.assign(false);
    }

    public static final Object CONST_class = "Psy\\TabCompletion\\Matcher\\KeywordsMatcher";

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
                    .setName("Psy\\TabCompletion\\Matcher\\KeywordsMatcher")
                    .setLookup(
                            KeywordsMatcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("keywords", "mandatoryStartKeywords")
                    .setFilename("vendor/psy/psysh/src/TabCompletion/Matcher/KeywordsMatcher.php")
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

    private enum SwitchEnumType86 {
        DYNAMIC_TYPE_314,
        DYNAMIC_TYPE_315,
        DYNAMIC_TYPE_316,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
