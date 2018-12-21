package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.cs_CZ.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/cs_CZ/Text.php

*/

public class Text
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .Text {

    public Text(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Text.class) {
            this.__construct(env, args);
        }
    }

    public Text(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "maxNbChars",
        defaultValue = "200",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 1,
        name = "indexSize",
        defaultValue = "2",
        defaultValueType = "number"
    )
    public Object realText(RuntimeEnv env, Object... args) {
        Object maxNbChars = assignParameter(args, 0, true);
        if (null == maxNbChars) {
            maxNbChars = 200;
        }
        Object indexSize = assignParameter(args, 1, true);
        if (null == indexSize) {
            indexSize = 2;
        }
        Object text = null;
        text = super.realText(env, maxNbChars, indexSize);
        text = function_str_replace.f.env(env).call("\u201E", "", text).value();
        return ZVal.assign(function_str_replace.f.env(env).call("\u201C", "", text).value());
    }

    public static final Object CONST_class = "Faker\\Provider\\cs_CZ\\Text";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Faker
                    .namespaces
                    .Provider
                    .classes
                    .Text
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object baseText = ZVal.getResourceAsString("stringLiterals/stringLiteral254.txt");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\cs_CZ\\Text")
                    .setLookup(
                            Text.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("consecutiveWords", "explodedText", "generator", "unique")
                    .setStaticPropertyNames("baseText")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/cs_CZ/Text.php")
                    .addExtendsClass("Faker\\Provider\\Text")
                    .addExtendsClass("Faker\\Provider\\Base")
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
