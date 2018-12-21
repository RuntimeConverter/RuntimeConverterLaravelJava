package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.exceptions.ReflectionException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionFunction;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes.AbstractDefaultParametersMatcher;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/TabCompletion/Matcher/FunctionDefaultParametersMatcher.php

*/

public class FunctionDefaultParametersMatcher extends AbstractDefaultParametersMatcher {

    public FunctionDefaultParametersMatcher(RuntimeEnv env, Object... args) {
        super(env);
    }

    public FunctionDefaultParametersMatcher(NoConstructor n) {
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
        Object tokens = assignParameter(args, 0, false);
        Object info = assignParameter(args, 1, true);
        if (null == info) {
            info = ZVal.newArray();
        }
        Object reflection = null;
        ReferenceContainer functionName = new BasicReferenceContainer(null);
        Object e = null;
        Object parameters = null;
        function_array_pop.f.env(env).call(tokens);
        functionName.setObject(function_array_pop.f.env(env).call(tokens).value());
        try {
            reflection = new ReflectionFunction(env, functionName.arrayGet(env, 1));
        } catch (ConvertedException convertedException204) {
            if (convertedException204.instanceOf(
                    ReflectionException.class, "ReflectionException")) {
                e = convertedException204.getObject();
                return ZVal.assign(ZVal.newArray());
            } else {
                throw convertedException204;
            }
        }

        parameters =
                env.callMethod(reflection, "getParameters", FunctionDefaultParametersMatcher.class);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "getDefaultParameterCompletion",
                        FunctionDefaultParametersMatcher.class,
                        parameters));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens", typeHint = "array")
    public Object hasMatched(RuntimeEnv env, Object... args) {
        Object tokens = assignParameter(args, 0, false);
        ReferenceContainer functionName = new BasicReferenceContainer(null);
        Object openBracket = null;
        openBracket = function_array_pop.f.env(env).call(tokens).value();
        if (ZVal.strictNotEqualityCheck(openBracket, "!==", "(")) {
            return ZVal.assign(false);
        }

        functionName.setObject(function_array_pop.f.env(env).call(tokens).value());
        if (!ZVal.isTrue(
                runtimeStaticObject.tokenIs(env, functionName.getObject(), CONST_T_STRING))) {
            return ZVal.assign(false);
        }

        if (!function_function_exists.f.env(env).call(functionName.arrayGet(env, 1)).getBool()) {
            return ZVal.assign(false);
        }

        return ZVal.assign(true);
    }

    public static final Object CONST_class =
            "Psy\\TabCompletion\\Matcher\\FunctionDefaultParametersMatcher";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends AbstractDefaultParametersMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\TabCompletion\\Matcher\\FunctionDefaultParametersMatcher")
                    .setLookup(
                            FunctionDefaultParametersMatcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("context")
                    .setFilename(
                            "vendor/psy/psysh/src/TabCompletion/Matcher/FunctionDefaultParametersMatcher.php")
                    .addInterface("Psy\\ContextAware")
                    .addExtendsClass(
                            "Psy\\TabCompletion\\Matcher\\AbstractDefaultParametersMatcher")
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
}
