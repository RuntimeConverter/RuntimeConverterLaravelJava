package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes.AbstractContextAwareMatcher;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes.AbstractMatcher;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/TabCompletion/Matcher/ObjectAttributesMatcher.php

*/

public class ObjectAttributesMatcher extends AbstractContextAwareMatcher {

    public ObjectAttributesMatcher(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ObjectAttributesMatcher(NoConstructor n) {
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
                                "/vendor/psy/psysh/src/TabCompletion/Matcher/ObjectAttributesMatcher.php");
        Object tokens = assignParameter(args, 0, false);
        Object info = assignParameter(args, 1, true);
        if (null == info) {
            info = ZVal.newArray();
        }
        Object input = null;
        Object firstToken = null;
        Object e = null;
        ReferenceContainer objectToken = new BasicReferenceContainer(null);
        Object objectName = null;
        Object _object = null;
        input = env.callMethod(this, "getInput", ObjectAttributesMatcher.class, tokens);
        firstToken = function_array_pop.f.env(env).call(tokens).value();
        if (ZVal.isTrue(runtimeStaticObject.tokenIs(env, firstToken, CONST_T_STRING))) {
            function_array_pop.f.env(env).call(tokens);
        }

        objectToken.setObject(function_array_pop.f.env(env).call(tokens).value());
        if (!function_is_array.f.env(env).call(objectToken.getObject()).getBool()) {
            return ZVal.assign(ZVal.newArray());
        }

        objectName =
                function_str_replace.f.env(env).call("$", "", objectToken.arrayGet(env, 1)).value();
        try {
            _object =
                    env.callMethod(this, "getVariable", ObjectAttributesMatcher.class, objectName);
        } catch (ConvertedException convertedException205) {
            if (convertedException205.instanceOf(
                    InvalidArgumentException.class, "InvalidArgumentException")) {
                e = convertedException205.getObject();
                return ZVal.assign(ZVal.newArray());
            } else {
                throw convertedException205;
            }
        }

        if (!function_is_object.f.env(env).call(_object).getBool()) {
            return ZVal.assign(ZVal.newArray());
        }

        return ZVal.assign(
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                function_array_keys
                                        .f
                                        .env(env)
                                        .call(
                                                NamespaceGlobal.get_class_vars
                                                        .env(env)
                                                        .call(
                                                                function_get_class
                                                                        .f
                                                                        .env(env)
                                                                        .call(_object)
                                                                        .value())
                                                        .value())
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
        SwitchEnumType89 switchVariable89 =
                ZVal.getEnum(
                        true,
                        SwitchEnumType89.DEFAULT_CASE,
                        SwitchEnumType89.DYNAMIC_TYPE_321,
                        runtimeStaticObject.tokenIs(env, token, CONST_T_OBJECT_OPERATOR),
                        SwitchEnumType89.DYNAMIC_TYPE_322,
                        runtimeStaticObject.tokenIs(env, prevToken, CONST_T_OBJECT_OPERATOR));
        switch (switchVariable89) {
            case DYNAMIC_TYPE_321:
            case DYNAMIC_TYPE_322:
                return ZVal.assign(true);
        }
        ;
        return ZVal.assign(false);
    }

    public static final Object CONST_class = "Psy\\TabCompletion\\Matcher\\ObjectAttributesMatcher";

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
                    .setName("Psy\\TabCompletion\\Matcher\\ObjectAttributesMatcher")
                    .setLookup(
                            ObjectAttributesMatcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("context")
                    .setFilename(
                            "vendor/psy/psysh/src/TabCompletion/Matcher/ObjectAttributesMatcher.php")
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

    private enum SwitchEnumType89 {
        DYNAMIC_TYPE_321,
        DYNAMIC_TYPE_322,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
