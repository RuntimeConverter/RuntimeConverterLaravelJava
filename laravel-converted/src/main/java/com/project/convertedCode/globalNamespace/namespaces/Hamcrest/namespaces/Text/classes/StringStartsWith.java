package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Text.classes;

import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Text.classes.SubstringMatcher;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Text/StringStartsWith.php

*/

public class StringStartsWith extends SubstringMatcher {

    public StringStartsWith(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == StringStartsWith.class) {
            this.__construct(env, args);
        }
    }

    public StringStartsWith(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "substring")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object substring = assignParameter(args, 0, false);
        super.__construct(env, substring);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    protected Object evalSubstringOf(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        function_substr
                                .f
                                .env(env)
                                .call(
                                        string,
                                        0,
                                        function_strlen
                                                .f
                                                .env(env)
                                                .call(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("_substring")
                                                                .value())
                                                .value())
                                .value(),
                        "===",
                        toObjectR(this).accessProp(this, env).name("_substring").value()));
    }

    @ConvertedMethod
    protected Object relationship(RuntimeEnv env, Object... args) {
        return "starting with";
    }

    public static final Object CONST_class = "Hamcrest\\Text\\StringStartsWith";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends SubstringMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "substring")
        public Object startsWith(RuntimeEnv env, Object... args) {
            Object substring = assignParameter(args, 0, false);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Hamcrest
                            .namespaces
                            .Text
                            .classes
                            .StringStartsWith(env, substring));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Text\\StringStartsWith")
                    .setLookup(
                            StringStartsWith.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_expectedSubtype", "_expectedType", "_substring")
                    .setFilename(
                            "vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Text/StringStartsWith.php")
                    .addInterface("Hamcrest\\Matcher")
                    .addInterface("Hamcrest\\SelfDescribing")
                    .addExtendsClass("Hamcrest\\Text\\SubstringMatcher")
                    .addExtendsClass("Hamcrest\\TypeSafeMatcher")
                    .addExtendsClass("Hamcrest\\BaseMatcher")
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
