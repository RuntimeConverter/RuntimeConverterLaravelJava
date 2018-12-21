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
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/TabCompletion/Matcher/ConstantsMatcher.php

*/

public class ConstantsMatcher extends AbstractMatcher {

    public ConstantsMatcher(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ConstantsMatcher(NoConstructor n) {
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
                                "/vendor/psy/psysh/src/TabCompletion/Matcher/ConstantsMatcher.php");
        Object tokens = assignParameter(args, 0, false);
        Object info = assignParameter(args, 1, true);
        if (null == info) {
            info = ZVal.newArray();
        }
        Object _pConst = null;
        _pConst = env.callMethod(this, "getInput", ConstantsMatcher.class, tokens);
        return ZVal.assign(
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                function_array_keys
                                        .f
                                        .env(env)
                                        .call(
                                                NamespaceGlobal.get_defined_constants
                                                        .env(env)
                                                        .call()
                                                        .value())
                                        .value(),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Psy\\TabCompletion\\Matcher",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "constant")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object constant = assignParameter(args, 0, false);
                                        Object _pConst = null;
                                        _pConst = this.contextReferences.getCapturedValue("const");
                                        return ZVal.assign(
                                                AbstractMatcher.runtimeStaticObject.startsWith(
                                                        env, _pConst, constant));
                                    }
                                }.use("const", _pConst))
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
        SwitchEnumType84 switchVariable84 =
                ZVal.getEnum(
                        true,
                        SwitchEnumType84.DEFAULT_CASE,
                        SwitchEnumType84.DYNAMIC_TYPE_307,
                        runtimeStaticObject.tokenIs(env, prevToken, CONST_T_NEW),
                        SwitchEnumType84.DYNAMIC_TYPE_308,
                        runtimeStaticObject.tokenIs(env, prevToken, CONST_T_NS_SEPARATOR),
                        SwitchEnumType84.DYNAMIC_TYPE_309,
                        runtimeStaticObject.hasToken(
                                env,
                                ZVal.newArray(
                                        new ZPair(0, CONST_T_OPEN_TAG),
                                        new ZPair(1, CONST_T_STRING)),
                                token),
                        SwitchEnumType84.DYNAMIC_TYPE_310,
                        runtimeStaticObject.isOperator(env, token));
        switch (switchVariable84) {
            case DYNAMIC_TYPE_307:
            case DYNAMIC_TYPE_308:
                return ZVal.assign(false);
            case DYNAMIC_TYPE_309:
            case DYNAMIC_TYPE_310:
                return ZVal.assign(true);
        }
        ;
        return ZVal.assign(false);
    }

    public static final Object CONST_class = "Psy\\TabCompletion\\Matcher\\ConstantsMatcher";

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
                    .setName("Psy\\TabCompletion\\Matcher\\ConstantsMatcher")
                    .setLookup(
                            ConstantsMatcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/psy/psysh/src/TabCompletion/Matcher/ConstantsMatcher.php")
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

    private enum SwitchEnumType84 {
        DYNAMIC_TYPE_307,
        DYNAMIC_TYPE_308,
        DYNAMIC_TYPE_309,
        DYNAMIC_TYPE_310,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
