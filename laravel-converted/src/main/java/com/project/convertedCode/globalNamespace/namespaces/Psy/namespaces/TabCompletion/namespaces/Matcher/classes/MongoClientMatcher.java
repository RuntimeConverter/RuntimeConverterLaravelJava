package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
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

 vendor/psy/psysh/src/TabCompletion/Matcher/MongoClientMatcher.php

*/

public class MongoClientMatcher extends AbstractContextAwareMatcher {

    public MongoClientMatcher(RuntimeEnv env, Object... args) {
        super(env);
    }

    public MongoClientMatcher(NoConstructor n) {
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
                                "/vendor/psy/psysh/src/TabCompletion/Matcher/MongoClientMatcher.php");
        Object tokens = assignParameter(args, 0, false);
        Object info = assignParameter(args, 1, true);
        if (null == info) {
            info = ZVal.newArray();
        }
        Object input = null;
        Object firstToken = null;
        ReferenceContainer objectToken = new BasicReferenceContainer(null);
        Object objectName = null;
        ReferenceContainer list = new BasicReferenceContainer(null);
        Object _object = null;
        input = env.callMethod(this, "getInput", MongoClientMatcher.class, tokens);
        firstToken = function_array_pop.f.env(env).call(tokens).value();
        if (ZVal.isTrue(runtimeStaticObject.tokenIs(env, firstToken, CONST_T_STRING))) {
            function_array_pop.f.env(env).call(tokens);
        }

        objectToken.setObject(function_array_pop.f.env(env).call(tokens).value());
        objectName =
                function_str_replace.f.env(env).call("$", "", objectToken.arrayGet(env, 1)).value();
        _object = env.callMethod(this, "getVariable", MongoClientMatcher.class, objectName);
        if (!ZVal.isTrue(ZVal.checkInstanceType(_object, (Class) null, "MongoClient", env))) {
            return ZVal.assign(ZVal.newArray());
        }

        list.setObject(env.callMethod(_object, "listDBs", MongoClientMatcher.class));
        return ZVal.assign(
                function_array_filter
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
                                                    @ConvertedParameter(index = 0, name = "info")
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        ReferenceContainer info =
                                                                new BasicReferenceContainer(
                                                                        assignParameter(
                                                                                args, 0, false));
                                                        return ZVal.assign(
                                                                info.arrayGet(env, "name"));
                                                    }
                                                },
                                                list.arrayGet(env, "databases"))
                                        .value(),
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
        SwitchEnumType87 switchVariable87 =
                ZVal.getEnum(
                        true,
                        SwitchEnumType87.DEFAULT_CASE,
                        SwitchEnumType87.DYNAMIC_TYPE_317,
                        runtimeStaticObject.tokenIs(env, token, CONST_T_OBJECT_OPERATOR),
                        SwitchEnumType87.DYNAMIC_TYPE_318,
                        runtimeStaticObject.tokenIs(env, prevToken, CONST_T_OBJECT_OPERATOR));
        switch (switchVariable87) {
            case DYNAMIC_TYPE_317:
            case DYNAMIC_TYPE_318:
                return ZVal.assign(true);
        }
        ;
        return ZVal.assign(false);
    }

    public static final Object CONST_class = "Psy\\TabCompletion\\Matcher\\MongoClientMatcher";

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
                    .setName("Psy\\TabCompletion\\Matcher\\MongoClientMatcher")
                    .setLookup(
                            MongoClientMatcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("context")
                    .setFilename(
                            "vendor/psy/psysh/src/TabCompletion/Matcher/MongoClientMatcher.php")
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

    private enum SwitchEnumType87 {
        DYNAMIC_TYPE_317,
        DYNAMIC_TYPE_318,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
