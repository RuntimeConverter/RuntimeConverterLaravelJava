package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Text.classes;

import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Text.classes.StringContainsIgnoringCase;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Text.classes.SubstringMatcher;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Text/StringContains.php

*/

public class StringContains extends SubstringMatcher {

    public StringContains(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == StringContains.class) {
            this.__construct(env, args);
        }
    }

    public StringContains(NoConstructor n) {
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
    public Object ignoringCase(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new StringContainsIgnoringCase(
                        env, toObjectR(this).accessProp(this, env).name("_substring").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    protected Object evalSubstringOf(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        false,
                        "!==",
                        function_strpos
                                .f
                                .env(env)
                                .call(
                                        toStringR(item, env),
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("_substring")
                                                .value())
                                .value()));
    }

    @ConvertedMethod
    protected Object relationship(RuntimeEnv env, Object... args) {
        return "containing";
    }

    public static final Object CONST_class = "Hamcrest\\Text\\StringContains";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends SubstringMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "substring")
        public Object containsString(RuntimeEnv env, Object... args) {
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
                            .StringContains(env, substring));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Text\\StringContains")
                    .setLookup(
                            StringContains.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_expectedSubtype", "_expectedType", "_substring")
                    .setFilename(
                            "vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Text/StringContains.php")
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
