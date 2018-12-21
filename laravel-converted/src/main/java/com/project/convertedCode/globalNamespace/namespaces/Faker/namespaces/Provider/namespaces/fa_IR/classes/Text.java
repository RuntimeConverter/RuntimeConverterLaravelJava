package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.fa_IR.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/fa_IR/Text.php

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
        int runtimeConverterContinueCount;
        Object maxNbChars = assignParameter(args, 0, true);
        if (null == maxNbChars) {
            maxNbChars = 200;
        }
        Object indexSize = assignParameter(args, 1, true);
        if (null == indexSize) {
            indexSize = 2;
        }
        ReferenceContainer result = new BasicReferenceContainer(null);
        Object next = null;
        ReferenceContainer words = new BasicReferenceContainer(null);
        ReferenceContainer currentWords = new BasicReferenceContainer(null);
        Object resultLength = null;
        Object word = null;
        if (ZVal.isLessThan(maxNbChars, '<', 10)) {
            throw ZVal.getException(
                    env, new InvalidArgumentException(env, "maxNbChars must be at least 10"));
        }

        if (ZVal.isLessThan(indexSize, '<', 1)) {
            throw ZVal.getException(
                    env, new InvalidArgumentException(env, "indexSize must be at least 1"));
        }

        if (ZVal.isGreaterThan(indexSize, '>', 5)) {
            throw ZVal.getException(
                    env, new InvalidArgumentException(env, "indexSize must be at most 5"));
        }

        words.setObject(env.callMethod(this, "getConsecutiveWords", Text.class, indexSize));
        result.setObject(ZVal.newArray());
        resultLength = 0;
        next =
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Text.class)
                        .method("randomKey")
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(0, words))
                        .call(words.getObject())
                        .value();
        runtimeConverterContinueCount = 0;
        while (ZVal.toBool(ZVal.isLessThan(resultLength, '<', maxNbChars))
                && ZVal.toBool(arrayActionR(ArrayAction.ISSET, words, env, next))) {
            word =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Text.class)
                            .method("randomElement")
                            .addReferenceArgs(
                                    new RuntimeArgsWithReferences()
                                            .add(
                                                    0,
                                                    new ArrayDimensionReference(
                                                            words.getObject(), next)))
                            .call(words.arrayGet(env, next))
                            .value();
            currentWords.setObject(function_explode.f.env(env).call(" ", next).value());
            currentWords.arrayAppend(env).set(word);
            function_array_shift.f.env(env).call(currentWords.getObject());
            next = NamespaceGlobal.implode.env(env).call(" ", currentWords.getObject()).value();
            if (ZVal.toBool(ZVal.equalityCheck(resultLength, 0))
                    && ZVal.toBool(
                            !function_preg_match
                                    .f
                                    .env(env)
                                    .call("/^[\\x{0600}-\\x{06FF}]/u", word)
                                    .getBool())) {
                continue;
            }

            result.arrayAppend(env).set(word);
            resultLength =
                    ZAssignment.add(
                            "+=",
                            resultLength,
                            ZVal.add(function_strlen.f.env(env).call(word).value(), 1));
        }

        function_array_pop.f.env(env).call(result.getObject());
        result.setObject(NamespaceGlobal.implode.env(env).call(" ", result.getObject()).value());
        return ZVal.assign(toStringR(result.getObject(), env) + ".");
    }

    public static final Object CONST_class = "Faker\\Provider\\fa_IR\\Text";

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

        public Object baseText = ZVal.getResourceAsString("stringLiterals/stringLiteral368.txt");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\fa_IR\\Text")
                    .setLookup(
                            Text.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("consecutiveWords", "explodedText", "generator", "unique")
                    .setStaticPropertyNames("baseText")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/fa_IR/Text.php")
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
