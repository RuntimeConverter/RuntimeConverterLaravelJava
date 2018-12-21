package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.exceptions.ReflectionException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
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
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/TabCompletion/Matcher/ClassMethodsMatcher.php

*/

public class ClassMethodsMatcher extends AbstractMatcher {

    public ClassMethodsMatcher(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ClassMethodsMatcher(NoConstructor n) {
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
                                "/vendor/psy/psysh/src/TabCompletion/Matcher/ClassMethodsMatcher.php");
        ReferenceContainer tokens = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object info = assignParameter(args, 1, true);
        if (null == info) {
            info = ZVal.newArray();
        }
        Object input = null;
        Object re = null;
        Object firstToken = null;
        Object reflection = null;
        Object methods = null;
        Object _pClass = null;
        input = env.callMethod(this, "getInput", ClassMethodsMatcher.class, tokens.getObject());
        firstToken = function_array_pop.f.env(env).call(tokens.getObject()).value();
        if (ZVal.isTrue(runtimeStaticObject.tokenIs(env, firstToken, CONST_T_STRING))) {
            function_array_pop.f.env(env).call(tokens.getObject());
        }

        _pClass =
                env.callMethod(
                        this,
                        "getNamespaceAndClass",
                        ClassMethodsMatcher.class,
                        tokens.getObject());
        try {
            reflection = new ReflectionClass(env, _pClass);
        } catch (ConvertedException convertedException203) {
            if (convertedException203.instanceOf(
                    ReflectionException.class, "ReflectionException")) {
                re = convertedException203.getObject();
                return ZVal.assign(ZVal.newArray());
            } else {
                throw convertedException203;
            }
        }

        if (ZVal.isTrue(runtimeStaticObject.needCompleteClass(env, tokens.arrayGet(env, 1)))) {
            methods = env.callMethod(reflection, "getMethods", ClassMethodsMatcher.class);

        } else {
            methods = env.callMethod(reflection, "getMethods", ClassMethodsMatcher.class, 1);
        }

        methods =
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
                                    @ConvertedParameter(
                                        index = 0,
                                        name = "method",
                                        typeHint = "ReflectionMethod"
                                    )
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object method = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                env.callMethod(
                                                        method,
                                                        "getName",
                                                        ClassMethodsMatcher.class));
                                    }
                                },
                                methods)
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
                                                methods,
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Psy\\TabCompletion\\Matcher",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(index = 0, name = "method")
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object method =
                                                                assignParameter(args, 0, false);
                                                        Object input = null;
                                                        input =
                                                                this.contextReferences
                                                                        .getCapturedValue("input");
                                                        return ZVal.assign(
                                                                AbstractMatcher.runtimeStaticObject
                                                                        .startsWith(
                                                                                env, input,
                                                                                method));
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
        SwitchEnumType81 switchVariable81 =
                ZVal.getEnum(
                        true,
                        SwitchEnumType81.DEFAULT_CASE,
                        SwitchEnumType81.DYNAMIC_TYPE_298,
                        ZVal.toBool(
                                        runtimeStaticObject.tokenIs(
                                                env, prevToken, CONST_T_DOUBLE_COLON))
                                && ZVal.toBool(
                                        runtimeStaticObject.tokenIs(env, token, CONST_T_STRING)),
                        SwitchEnumType81.DYNAMIC_TYPE_299,
                        runtimeStaticObject.tokenIs(env, token, CONST_T_DOUBLE_COLON));
        switch (switchVariable81) {
            case DYNAMIC_TYPE_298:
            case DYNAMIC_TYPE_299:
                return ZVal.assign(true);
        }
        ;
        return ZVal.assign(false);
    }

    public static final Object CONST_class = "Psy\\TabCompletion\\Matcher\\ClassMethodsMatcher";

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
                    .setName("Psy\\TabCompletion\\Matcher\\ClassMethodsMatcher")
                    .setLookup(
                            ClassMethodsMatcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/psy/psysh/src/TabCompletion/Matcher/ClassMethodsMatcher.php")
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

    private enum SwitchEnumType81 {
        DYNAMIC_TYPE_298,
        DYNAMIC_TYPE_299,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
