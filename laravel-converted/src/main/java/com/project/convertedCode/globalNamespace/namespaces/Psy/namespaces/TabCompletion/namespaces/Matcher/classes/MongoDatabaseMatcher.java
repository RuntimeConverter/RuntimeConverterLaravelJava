package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes.AbstractContextAwareMatcher;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes.AbstractMatcher;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import java.lang.Class;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/TabCompletion/Matcher/MongoDatabaseMatcher.php

*/

public class MongoDatabaseMatcher extends AbstractContextAwareMatcher {

    public MongoDatabaseMatcher(RuntimeEnv env, Object... args) {
        super(env);
    }

    public MongoDatabaseMatcher(NoConstructor n) {
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
                                "/vendor/psy/psysh/src/TabCompletion/Matcher/MongoDatabaseMatcher.php");
        Object tokens = assignParameter(args, 0, false);
        Object info = assignParameter(args, 1, true);
        if (null == info) {
            info = ZVal.newArray();
        }
        Object input = null;
        Object firstToken = null;
        ReferenceContainer objectToken = new BasicReferenceContainer(null);
        Object objectName = null;
        Object _object = null;
        input = env.callMethod(this, "getInput", MongoDatabaseMatcher.class, tokens);
        firstToken = function_array_pop.f.env(env).call(tokens).value();
        if (ZVal.isTrue(runtimeStaticObject.tokenIs(env, firstToken, CONST_T_STRING))) {
            function_array_pop.f.env(env).call(tokens);
        }

        objectToken.setObject(function_array_pop.f.env(env).call(tokens).value());
        objectName =
                function_str_replace.f.env(env).call("$", "", objectToken.arrayGet(env, 1)).value();
        _object = env.callMethod(this, "getVariable", MongoDatabaseMatcher.class, objectName);
        if (!ZVal.isTrue(ZVal.checkInstanceType(_object, (Class) null, "MongoDB", env))) {
            return ZVal.assign(ZVal.newArray());
        }

        return ZVal.assign(
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                env.callMethod(
                                        _object, "getCollectionNames", MongoDatabaseMatcher.class),
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
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object var = assignParameter(args, 0, false);
                                        Object input = null;
                                        input = this.contextReferences.getCapturedValue("input");
                                        return ZVal.assign(
                                                AbstractMatcher.runtimeStaticObject.startsWith(
                                                        env, input, var));
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
        SwitchEnumType88 switchVariable88 =
                ZVal.getEnum(
                        true,
                        SwitchEnumType88.DEFAULT_CASE,
                        SwitchEnumType88.DYNAMIC_TYPE_319,
                        runtimeStaticObject.tokenIs(env, token, CONST_T_OBJECT_OPERATOR),
                        SwitchEnumType88.DYNAMIC_TYPE_320,
                        runtimeStaticObject.tokenIs(env, prevToken, CONST_T_OBJECT_OPERATOR));
        switch (switchVariable88) {
            case DYNAMIC_TYPE_319:
            case DYNAMIC_TYPE_320:
                return ZVal.assign(true);
        }
        ;
        return ZVal.assign(false);
    }

    public static final Object CONST_class = "Psy\\TabCompletion\\Matcher\\MongoDatabaseMatcher";

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
                    .setName("Psy\\TabCompletion\\Matcher\\MongoDatabaseMatcher")
                    .setLookup(
                            MongoDatabaseMatcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("context")
                    .setFilename(
                            "vendor/psy/psysh/src/TabCompletion/Matcher/MongoDatabaseMatcher.php")
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

    private enum SwitchEnumType88 {
        DYNAMIC_TYPE_319,
        DYNAMIC_TYPE_320,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
