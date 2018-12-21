package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
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
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_defined_functions;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/TabCompletion/Matcher/FunctionsMatcher.php

*/

public class FunctionsMatcher extends AbstractMatcher {

    public FunctionsMatcher(RuntimeEnv env, Object... args) {
        super(env);
    }

    public FunctionsMatcher(NoConstructor n) {
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
                                "/vendor/psy/psysh/src/TabCompletion/Matcher/FunctionsMatcher.php");
        Object tokens = assignParameter(args, 0, false);
        Object info = assignParameter(args, 1, true);
        if (null == info) {
            info = ZVal.newArray();
        }
        Object func = null;
        ReferenceContainer functions = new BasicReferenceContainer(null);
        Object allFunctions = null;
        func = env.callMethod(this, "getInput", FunctionsMatcher.class, tokens);
        functions.setObject(function_get_defined_functions.f.env(env).call().value());
        allFunctions =
                function_array_merge
                        .f
                        .env(env)
                        .call(functions.arrayGet(env, "user"), functions.arrayGet(env, "internal"))
                        .value();
        return ZVal.assign(
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                allFunctions,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Psy\\TabCompletion\\Matcher",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "function")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object function = assignParameter(args, 0, false);
                                        Object func = null;
                                        func = this.contextReferences.getCapturedValue("func");
                                        return ZVal.assign(
                                                AbstractMatcher.runtimeStaticObject.startsWith(
                                                        env, func, function));
                                    }
                                }.use("func", func))
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
        SwitchEnumType85 switchVariable85 =
                ZVal.getEnum(
                        true,
                        SwitchEnumType85.DEFAULT_CASE,
                        SwitchEnumType85.DYNAMIC_TYPE_311,
                        runtimeStaticObject.tokenIs(env, prevToken, CONST_T_NEW),
                        SwitchEnumType85.DYNAMIC_TYPE_312,
                        runtimeStaticObject.hasToken(
                                env,
                                ZVal.newArray(
                                        new ZPair(0, CONST_T_OPEN_TAG),
                                        new ZPair(1, CONST_T_STRING)),
                                token),
                        SwitchEnumType85.DYNAMIC_TYPE_313,
                        runtimeStaticObject.isOperator(env, token));
        switch (switchVariable85) {
            case DYNAMIC_TYPE_311:
                return ZVal.assign(false);
            case DYNAMIC_TYPE_312:
            case DYNAMIC_TYPE_313:
                return ZVal.assign(true);
        }
        ;
        return ZVal.assign(false);
    }

    public static final Object CONST_class = "Psy\\TabCompletion\\Matcher\\FunctionsMatcher";

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
                    .setName("Psy\\TabCompletion\\Matcher\\FunctionsMatcher")
                    .setLookup(
                            FunctionsMatcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/psy/psysh/src/TabCompletion/Matcher/FunctionsMatcher.php")
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

    private enum SwitchEnumType85 {
        DYNAMIC_TYPE_311,
        DYNAMIC_TYPE_312,
        DYNAMIC_TYPE_313,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
