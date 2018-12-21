package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes;

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
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes.Base;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/Text.php

*/

public abstract class Text extends Base {

    public Object explodedText = null;

    public Object consecutiveWords = ZVal.newArray();

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
        ReferenceContainer next = new BasicReferenceContainer(null);
        ReferenceContainer words = new BasicReferenceContainer(null);
        ReferenceContainer currentWords = new BasicReferenceContainer(null);
        Object resultLength = null;
        ReferenceContainer word = new BasicReferenceContainer(null);
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

        words.setObject(this.getConsecutiveWords(env, indexSize));
        result.setObject(ZVal.newArray());
        resultLength = 0;
        next.setObject(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Text.class)
                        .method("randomKey")
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(0, words))
                        .call(words.getObject())
                        .value());
        runtimeConverterContinueCount = 0;
        while (ZVal.toBool(ZVal.isLessThan(resultLength, '<', maxNbChars))
                && ZVal.toBool(arrayActionR(ArrayAction.ISSET, words, env, next.getObject()))) {
            word.setObject(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Text.class)
                            .method("randomElement")
                            .addReferenceArgs(
                                    new RuntimeArgsWithReferences()
                                            .add(
                                                    0,
                                                    new ArrayDimensionReference(
                                                            words.getObject(), next.getObject())))
                            .call(words.arrayGet(env, next.getObject()))
                            .value());
            currentWords.setObject(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Text.class)
                            .method("explode")
                            .addReferenceArgs(new RuntimeArgsWithReferences().add(0, next))
                            .call(next.getObject())
                            .value());
            currentWords.arrayAppend(env).set(word.getObject());
            function_array_shift.f.env(env).call(currentWords.getObject());
            next.setObject(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Text.class)
                            .method("implode")
                            .addReferenceArgs(new RuntimeArgsWithReferences().add(0, currentWords))
                            .call(currentWords.getObject())
                            .value());
            if (ZVal.toBool(ZVal.equalityCheck(resultLength, 0))
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Text.class)
                                            .method("validStart")
                                            .addReferenceArgs(
                                                    new RuntimeArgsWithReferences().add(0, word))
                                            .call(word.getObject())
                                            .value()))) {
                continue;
            }

            result.arrayAppend(env).set(word.getObject());
            resultLength =
                    ZAssignment.add(
                            "+=",
                            resultLength,
                            ZVal.add(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Text.class)
                                            .method("strlen")
                                            .addReferenceArgs(
                                                    new RuntimeArgsWithReferences().add(0, word))
                                            .call(word.getObject())
                                            .value(),
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Faker
                                                            .namespaces
                                                            .Provider
                                                            .classes
                                                            .Text
                                                            .RequestStaticProperties
                                                            .class)
                                            .separatorLen));
        }

        function_array_pop.f.env(env).call(result.getObject());
        result.setObject(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Text.class)
                        .method("implode")
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(0, result))
                        .call(result.getObject())
                        .value());
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Text.class)
                        .method("appendEnd")
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(0, result))
                        .call(result.getObject())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "indexSize")
    protected Object getConsecutiveWords(RuntimeEnv env, Object... args) {
        Object indexSize = assignParameter(args, 0, false);
        Object stringIndex = null;
        ReferenceContainer parts = new BasicReferenceContainer(null);
        ReferenceContainer words = new BasicReferenceContainer(null);
        Object count = null;
        ReferenceContainer index = new BasicReferenceContainer(null);
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object word = null;
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "consecutiveWords", env),
                env,
                indexSize)) {
            parts.setObject(this.getExplodedText(env));
            words.setObject(ZVal.newArray());
            index.setObject(ZVal.newArray());
            for (i.setObject(0);
                    ZVal.isLessThan(i.getObject(), '<', indexSize);
                    i.setObject(ZVal.increment(i.getObject()))) {
                index.arrayAppend(env)
                        .set(function_array_shift.f.env(env).call(parts.getObject()).value());
            }

            for (i.setObject(0), count = function_count.f.env(env).call(parts.getObject()).value();
                    ZVal.isLessThan(i.getObject(), '<', count);
                    i.setObject(ZVal.increment(i.getObject()))) {
                stringIndex =
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Text.class)
                                .method("implode")
                                .addReferenceArgs(new RuntimeArgsWithReferences().add(0, index))
                                .call(index.getObject())
                                .value();
                if (!arrayActionR(ArrayAction.ISSET, words, env, stringIndex)) {
                    words.arrayAccess(env, stringIndex).set(ZVal.newArray());
                }

                word = ZVal.assign(parts.arrayGet(env, i.getObject()));
                words.arrayAppend(env, stringIndex).set(word);
                function_array_shift.f.env(env).call(index.getObject());
                index.arrayAppend(env).set(word);
            }

            new ReferenceClassProperty(this, "consecutiveWords", env)
                    .arrayAccess(env, indexSize)
                    .set(words.getObject());
        }

        return ZVal.assign(
                new ReferenceClassProperty(this, "consecutiveWords", env).arrayGet(env, indexSize));
    }

    @ConvertedMethod
    protected Object getExplodedText(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        if (ZVal.strictEqualityCheck(this.explodedText, "===", ZVal.getNull())) {
            this.explodedText =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Text.class)
                            .method("explode")
                            .addReferenceArgs(
                                    rLastRefArgs =
                                            new RuntimeArgsWithReferences()
                                                    .add(
                                                            0,
                                                            handleReturnReference(
                                                                    function_preg_replace
                                                                            .f
                                                                            .env(env)
                                                                            .call(
                                                                                    "/\\s+/u",
                                                                                    " ",
                                                                                    env
                                                                                            .getRequestStaticProperties(
                                                                                                    com.project
                                                                                                            .convertedCode
                                                                                                            .globalNamespace
                                                                                                            .namespaces
                                                                                                            .Faker
                                                                                                            .namespaces
                                                                                                            .Provider
                                                                                                            .classes
                                                                                                            .Text
                                                                                                            .RequestStaticProperties
                                                                                                            .class)
                                                                                            .baseText)
                                                                            .value())))
                            .call(rLastRefArgs.get(0))
                            .value();
        }

        return ZVal.assign(this.explodedText);
    }

    public static final Object CONST_class = "Faker\\Provider\\Text";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Base.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "text")
        protected Object explode(RuntimeEnv env, Object... args) {
            Object text = assignParameter(args, 0, false);
            return ZVal.assign(
                    function_explode
                            .f
                            .env(env)
                            .call(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Faker
                                                            .namespaces
                                                            .Provider
                                                            .classes
                                                            .Text
                                                            .RequestStaticProperties
                                                            .class)
                                            .separator,
                                    text)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "words")
        protected Object implode(RuntimeEnv env, Object... args) {
            Object words = assignParameter(args, 0, false);
            return ZVal.assign(
                    NamespaceGlobal.implode
                            .env(env)
                            .call(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Faker
                                                            .namespaces
                                                            .Provider
                                                            .classes
                                                            .Text
                                                            .RequestStaticProperties
                                                            .class)
                                            .separator,
                                    words)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "text")
        protected Object strlen(RuntimeEnv env, Object... args) {
            Object text = assignParameter(args, 0, false);
            return ZVal.assign(
                    function_function_exists.f.env(env).call("mb_strlen").getBool()
                            ? NamespaceGlobal.mb_strlen.env(env).call(text, "UTF-8").value()
                            : function_strlen.f.env(env).call(text).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "word")
        protected Object validStart(RuntimeEnv env, Object... args) {
            Object word = assignParameter(args, 0, false);
            Object isValid = null;
            isValid = true;
            if (ZVal.isTrue(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Faker
                                            .namespaces
                                            .Provider
                                            .classes
                                            .Text
                                            .RequestStaticProperties
                                            .class)
                            .textStartsWithUppercase)) {
                isValid = function_preg_match.f.env(env).call("/^\\p{Lu}/u", word).value();
            }

            return ZVal.assign(isValid);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "text")
        protected Object appendEnd(RuntimeEnv env, Object... args) {
            Object text = assignParameter(args, 0, false);
            return ZVal.assign(
                    toStringR(function_rtrim.f.env(env).call(text, ",\u2014 ").value(), env) + ".");
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object baseText = "";

        public Object separator = " ";

        public Object separatorLen = 1;

        public Object textStartsWithUppercase = true;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\Text")
                    .setLookup(
                            Text.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("consecutiveWords", "explodedText", "generator", "unique")
                    .setStaticPropertyNames(
                            "baseText", "separator", "separatorLen", "textStartsWithUppercase")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/Text.php")
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
