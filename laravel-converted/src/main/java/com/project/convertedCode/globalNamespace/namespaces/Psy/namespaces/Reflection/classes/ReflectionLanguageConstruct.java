package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Reflection.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionFunctionAbstract;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Reflection.classes.ReflectionLanguageConstructParameter;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_push;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Reflection/ReflectionLanguageConstruct.php

*/

public class ReflectionLanguageConstruct extends ReflectionFunctionAbstract {

    public Object keyword = null;

    public ReflectionLanguageConstruct(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ReflectionLanguageConstruct.class) {
            this.__construct(env, args);
        }
    }

    public ReflectionLanguageConstruct(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keyword")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object keyword = assignParameter(args, 0, false);
        if (!ZVal.isTrue(runtimeStaticObject.isLanguageConstruct(env, keyword))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Unknown language construct: " + toStringR(keyword, env)));
        }

        this.keyword = keyword;
        return null;
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.keyword);
    }

    @ConvertedMethod
    public Object returnsReference(RuntimeEnv env, Object... args) {
        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object getParameters(RuntimeEnv env, Object... args) {
        Object opts = null;
        Object parameter = null;
        Object params = null;
        params = ZVal.newArray();
        for (ZPair zpairResult1408 :
                ZVal.getIterable(
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Psy
                                                .namespaces
                                                .Reflection
                                                .classes
                                                .ReflectionLanguageConstruct
                                                .RequestStaticProperties
                                                .class,
                                        "languageConstructs")
                                .arrayGet(env, this.keyword),
                        env,
                        false)) {
            parameter = ZVal.assign(zpairResult1408.getKey());
            opts = ZVal.assign(zpairResult1408.getValue());
            function_array_push
                    .f
                    .env(env)
                    .call(
                            params,
                            new ReflectionLanguageConstructParameter(
                                    env, this.keyword, parameter, opts));
        }

        return ZVal.assign(params);
    }

    @ConvertedMethod
    public Object getFileName(RuntimeEnv env, Object... args) {
        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getName(env));
    }

    public static final Object CONST_class = "Psy\\Reflection\\ReflectionLanguageConstruct";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends ReflectionFunctionAbstract.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        public Object export(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            "Not yet implemented because it's unclear what I should do here :)"));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "keyword")
        public Object isLanguageConstruct(RuntimeEnv env, Object... args) {
            Object keyword = assignParameter(args, 0, false);
            return ZVal.assign(
                    function_array_key_exists
                            .f
                            .env(env)
                            .call(
                                    keyword,
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Psy
                                                            .namespaces
                                                            .Reflection
                                                            .classes
                                                            .ReflectionLanguageConstruct
                                                            .RequestStaticProperties
                                                            .class)
                                            .languageConstructs)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object languageConstructs =
                ZVal.newArray(
                        new ZPair(
                                "isset",
                                ZVal.newArray(
                                        new ZPair("var", ZVal.newArray()),
                                        new ZPair(
                                                "...",
                                                ZVal.newArray(
                                                        new ZPair("isOptional", true),
                                                        new ZPair(
                                                                "defaultValue", ZVal.getNull()))))),
                        new ZPair(
                                "unset",
                                ZVal.newArray(
                                        new ZPair("var", ZVal.newArray()),
                                        new ZPair(
                                                "...",
                                                ZVal.newArray(
                                                        new ZPair("isOptional", true),
                                                        new ZPair(
                                                                "defaultValue", ZVal.getNull()))))),
                        new ZPair("empty", ZVal.newArray(new ZPair("var", ZVal.newArray()))),
                        new ZPair(
                                "echo",
                                ZVal.newArray(
                                        new ZPair("arg1", ZVal.newArray()),
                                        new ZPair(
                                                "...",
                                                ZVal.newArray(
                                                        new ZPair("isOptional", true),
                                                        new ZPair(
                                                                "defaultValue", ZVal.getNull()))))),
                        new ZPair("print", ZVal.newArray(new ZPair("arg", ZVal.newArray()))),
                        new ZPair(
                                "die",
                                ZVal.newArray(
                                        new ZPair(
                                                "status",
                                                ZVal.newArray(
                                                        new ZPair("isOptional", true),
                                                        new ZPair("defaultValue", 0))))),
                        new ZPair(
                                "exit",
                                ZVal.newArray(
                                        new ZPair(
                                                "status",
                                                ZVal.newArray(
                                                        new ZPair("isOptional", true),
                                                        new ZPair("defaultValue", 0))))));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Reflection\\ReflectionLanguageConstruct")
                    .setLookup(
                            ReflectionLanguageConstruct.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("keyword")
                    .setStaticPropertyNames("languageConstructs")
                    .setFilename("vendor/psy/psysh/src/Reflection/ReflectionLanguageConstruct.php")
                    .addInterface("Reflector")
                    .addExtendsClass("ReflectionFunctionAbstract")
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
