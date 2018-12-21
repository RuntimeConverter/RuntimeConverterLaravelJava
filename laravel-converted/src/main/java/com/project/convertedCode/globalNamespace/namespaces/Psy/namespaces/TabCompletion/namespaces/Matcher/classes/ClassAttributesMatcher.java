package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.nativeClasses.exceptions.ReflectionException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes.AbstractMatcher;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/TabCompletion/Matcher/ClassAttributesMatcher.php

*/

public class ClassAttributesMatcher extends AbstractMatcher {

    public ClassAttributesMatcher(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ClassAttributesMatcher(NoConstructor n) {
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
                                "/vendor/psy/psysh/src/TabCompletion/Matcher/ClassAttributesMatcher.php");
        Object tokens = assignParameter(args, 0, false);
        Object info = assignParameter(args, 1, true);
        if (null == info) {
            info = ZVal.newArray();
        }
        Object input = null;
        Object re = null;
        Object firstToken = null;
        Object reflection = null;
        Object vars = null;
        Object _pClass = null;
        input = env.callMethod(this, "getInput", ClassAttributesMatcher.class, tokens);
        firstToken = function_array_pop.f.env(env).call(tokens).value();
        if (ZVal.isTrue(runtimeStaticObject.tokenIs(env, firstToken, CONST_T_STRING))) {
            function_array_pop.f.env(env).call(tokens);
        }

        _pClass =
                env.callMethod(this, "getNamespaceAndClass", ClassAttributesMatcher.class, tokens);
        try {
            reflection = new ReflectionClass(env, _pClass);
        } catch (ConvertedException convertedException201) {
            if (convertedException201.instanceOf(
                    ReflectionException.class, "ReflectionException")) {
                re = convertedException201.getObject();
                return ZVal.assign(ZVal.newArray());
            } else {
                throw convertedException201;
            }
        }

        vars =
                function_array_merge
                        .f
                        .env(env)
                        .call(
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
                                                    @ConvertedParameter(index = 0, name = "var")
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object var =
                                                                assignParameter(args, 0, false);
                                                        return ZVal.assign(
                                                                "$" + toStringR(var, env));
                                                    }
                                                },
                                                function_array_keys
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                env.callMethod(
                                                                        reflection,
                                                                        "getStaticProperties",
                                                                        ClassAttributesMatcher
                                                                                .class))
                                                        .value())
                                        .value(),
                                function_array_keys
                                        .f
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        reflection,
                                                        "getConstants",
                                                        ClassAttributesMatcher.class))
                                        .value())
                        .value();
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
                                    @ConvertedParameter(index = 0, name = "name")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object name = assignParameter(args, 0, false);
                                        Object chunks = null;
                                        Object className = null;
                                        Object _pClass = null;
                                        _pClass = this.contextReferences.getCapturedValue("class");
                                        chunks =
                                                function_explode
                                                        .f
                                                        .env(env)
                                                        .call("\\", _pClass)
                                                        .value();
                                        className =
                                                function_array_pop.f.env(env).call(chunks).value();
                                        return ZVal.assign(
                                                toStringR(className, env)
                                                        + "::"
                                                        + toStringR(name, env));
                                    }
                                }.use("class", _pClass),
                                function_array_filter
                                        .f
                                        .env(env)
                                        .call(
                                                vars,
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Psy\\TabCompletion\\Matcher",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(index = 0, name = "var")
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object var =
                                                                assignParameter(args, 0, false);
                                                        Object input = null;
                                                        input =
                                                                this.contextReferences
                                                                        .getCapturedValue("input");
                                                        return ZVal.assign(
                                                                AbstractMatcher.runtimeStaticObject
                                                                        .startsWith(
                                                                                env, input, var));
                                                    }
                                                }.use("input", input))
                                        .value())
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
        SwitchEnumType80 switchVariable80 =
                ZVal.getEnum(
                        true,
                        SwitchEnumType80.DEFAULT_CASE,
                        SwitchEnumType80.DYNAMIC_TYPE_296,
                        ZVal.toBool(
                                        runtimeStaticObject.tokenIs(
                                                env, prevToken, CONST_T_DOUBLE_COLON))
                                && ZVal.toBool(
                                        runtimeStaticObject.tokenIs(env, token, CONST_T_STRING)),
                        SwitchEnumType80.DYNAMIC_TYPE_297,
                        runtimeStaticObject.tokenIs(env, token, CONST_T_DOUBLE_COLON));
        switch (switchVariable80) {
            case DYNAMIC_TYPE_296:
            case DYNAMIC_TYPE_297:
                return ZVal.assign(true);
        }
        ;
        return ZVal.assign(false);
    }

    public static final Object CONST_class = "Psy\\TabCompletion\\Matcher\\ClassAttributesMatcher";

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
                    .setName("Psy\\TabCompletion\\Matcher\\ClassAttributesMatcher")
                    .setLookup(
                            ClassAttributesMatcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/psy/psysh/src/TabCompletion/Matcher/ClassAttributesMatcher.php")
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

    private enum SwitchEnumType80 {
        DYNAMIC_TYPE_296,
        DYNAMIC_TYPE_297,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
