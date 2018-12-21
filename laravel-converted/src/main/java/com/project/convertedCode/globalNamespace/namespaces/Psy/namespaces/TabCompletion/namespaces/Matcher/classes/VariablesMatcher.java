package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes.AbstractContextAwareMatcher;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes.AbstractMatcher;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/TabCompletion/Matcher/VariablesMatcher.php

*/

public class VariablesMatcher extends AbstractContextAwareMatcher {

    public VariablesMatcher(RuntimeEnv env, Object... args) {
        super(env);
    }

    public VariablesMatcher(NoConstructor n) {
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
                                "/vendor/psy/psysh/src/TabCompletion/Matcher/VariablesMatcher.php");
        Object tokens = assignParameter(args, 0, false);
        Object info = assignParameter(args, 1, true);
        if (null == info) {
            info = ZVal.newArray();
        }
        Object var = null;
        var =
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                "$",
                                "",
                                env.callMethod(this, "getInput", VariablesMatcher.class, tokens))
                        .value();
        return ZVal.assign(
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                function_array_keys
                                        .f
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        this,
                                                        "getVariables",
                                                        VariablesMatcher.class))
                                        .value(),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Psy\\TabCompletion\\Matcher",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "variable")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object variable = assignParameter(args, 0, false);
                                        Object var = null;
                                        var = this.contextReferences.getCapturedValue("var");
                                        return ZVal.assign(
                                                AbstractMatcher.runtimeStaticObject.startsWith(
                                                        env, var, variable));
                                    }
                                }.use("var", var))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens", typeHint = "array")
    public Object hasMatched(RuntimeEnv env, Object... args) {
        Object tokens = assignParameter(args, 0, false);
        Object token = null;
        token = function_array_pop.f.env(env).call(tokens).value();
        SwitchEnumType91 switchVariable91 =
                ZVal.getEnum(
                        true,
                        SwitchEnumType91.DEFAULT_CASE,
                        SwitchEnumType91.DYNAMIC_TYPE_325,
                        runtimeStaticObject.hasToken(
                                env,
                                ZVal.newArray(
                                        new ZPair(0, CONST_T_OPEN_TAG),
                                        new ZPair(1, CONST_T_VARIABLE)),
                                token),
                        SwitchEnumType91.DYNAMIC_TYPE_326,
                        ZVal.toBool(function_is_string.f.env(env).call(token).value())
                                && ZVal.toBool(ZVal.strictEqualityCheck(token, "===", "$")),
                        SwitchEnumType91.DYNAMIC_TYPE_327,
                        runtimeStaticObject.isOperator(env, token));
        switch (switchVariable91) {
            case DYNAMIC_TYPE_325:
            case DYNAMIC_TYPE_326:
            case DYNAMIC_TYPE_327:
                return ZVal.assign(true);
        }
        ;
        return ZVal.assign(false);
    }

    public static final Object CONST_class = "Psy\\TabCompletion\\Matcher\\VariablesMatcher";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends AbstractContextAwareMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\TabCompletion\\Matcher\\VariablesMatcher")
                    .setLookup(
                            VariablesMatcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("context")
                    .setFilename("vendor/psy/psysh/src/TabCompletion/Matcher/VariablesMatcher.php")
                    .addInterface("Psy\\ContextAware")
                    .addExtendsClass("Psy\\TabCompletion\\Matcher\\AbstractContextAwareMatcher")
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

    private enum SwitchEnumType91 {
        DYNAMIC_TYPE_325,
        DYNAMIC_TYPE_326,
        DYNAMIC_TYPE_327,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
