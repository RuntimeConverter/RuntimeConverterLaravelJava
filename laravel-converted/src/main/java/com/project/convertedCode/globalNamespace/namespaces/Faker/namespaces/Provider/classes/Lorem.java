package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes.Base;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/Lorem.php

*/

public class Lorem extends Base {

    public Lorem(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Lorem.class) {
            this.__construct(env, args);
        }
    }

    public Lorem(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Faker\\Provider\\Lorem";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Base.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object word(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Lorem.class)
                            .method("randomElement")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
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
                                                            .Lorem
                                                            .RequestStaticProperties
                                                            .class)
                                            .wordList)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "nb", defaultValue = "3", defaultValueType = "number")
        @ConvertedParameter(
            index = 1,
            name = "asText",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object words(RuntimeEnv env, Object... args) {
            Object nb = assignParameter(args, 0, true);
            if (null == nb) {
                nb = 3;
            }
            Object asText = assignParameter(args, 1, true);
            if (null == asText) {
                asText = false;
            }
            ReferenceContainer words = new BasicReferenceContainer(null);
            ReferenceContainer i = new BasicReferenceContainer(null);
            words.setObject(ZVal.newArray());
            for (i.setObject(0);
                    ZVal.isLessThan(i.getObject(), '<', nb);
                    i.setObject(ZVal.increment(i.getObject()))) {
                words.arrayAppend(env)
                        .set(
                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, Lorem.class)
                                        .method("word")
                                        .call()
                                        .value());
            }

            return ZVal.assign(
                    ZVal.isTrue(asText)
                            ? NamespaceGlobal.implode.env(env).call(" ", words.getObject()).value()
                            : words.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "nbWords",
            defaultValue = "6",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 1,
            name = "variableNbWords",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        public Object sentence(RuntimeEnv env, Object... args) {
            Object nbWords = assignParameter(args, 0, true);
            if (null == nbWords) {
                nbWords = 6;
            }
            Object variableNbWords = assignParameter(args, 1, true);
            if (null == variableNbWords) {
                variableNbWords = true;
            }
            ReferenceContainer words = new BasicReferenceContainer(null);
            if (ZVal.isLessThanOrEqualTo(nbWords, "<=", 0)) {
                return "";
            }

            if (ZVal.isTrue(variableNbWords)) {
                nbWords = runtimeStaticObject.randomizeNbElements(env, nbWords);
            }

            words.setObject(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Lorem.class)
                            .method("words")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(nbWords)
                            .value());
            words.arrayAccess(env, 0)
                    .set(NamespaceGlobal.ucwords.env(env).call(words.arrayGet(env, 0)).value());
            return ZVal.assign(
                    toStringR(
                                    NamespaceGlobal.implode
                                            .env(env)
                                            .call(words.getObject(), " ")
                                            .value(),
                                    env)
                            + ".");
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "nb", defaultValue = "3", defaultValueType = "number")
        @ConvertedParameter(
            index = 1,
            name = "asText",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object sentences(RuntimeEnv env, Object... args) {
            Object nb = assignParameter(args, 0, true);
            if (null == nb) {
                nb = 3;
            }
            Object asText = assignParameter(args, 1, true);
            if (null == asText) {
                asText = false;
            }
            ReferenceContainer sentences = new BasicReferenceContainer(null);
            ReferenceContainer i = new BasicReferenceContainer(null);
            sentences.setObject(ZVal.newArray());
            for (i.setObject(0);
                    ZVal.isLessThan(i.getObject(), '<', nb);
                    i.setObject(ZVal.increment(i.getObject()))) {
                sentences
                        .arrayAppend(env)
                        .set(
                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, Lorem.class)
                                        .method("sentence")
                                        .call()
                                        .value());
            }

            return ZVal.assign(
                    ZVal.isTrue(asText)
                            ? NamespaceGlobal.implode
                                    .env(env)
                                    .call(" ", sentences.getObject())
                                    .value()
                            : sentences.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "nbSentences",
            defaultValue = "3",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 1,
            name = "variableNbSentences",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        public Object paragraph(RuntimeEnv env, Object... args) {
            Object nbSentences = assignParameter(args, 0, true);
            if (null == nbSentences) {
                nbSentences = 3;
            }
            Object variableNbSentences = assignParameter(args, 1, true);
            if (null == variableNbSentences) {
                variableNbSentences = true;
            }
            if (ZVal.isLessThanOrEqualTo(nbSentences, "<=", 0)) {
                return "";
            }

            if (ZVal.isTrue(variableNbSentences)) {
                nbSentences = runtimeStaticObject.randomizeNbElements(env, nbSentences);
            }

            return ZVal.assign(
                    NamespaceGlobal.implode
                            .env(env)
                            .call(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Lorem.class)
                                            .method("sentences")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(nbSentences)
                                            .value(),
                                    " ")
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "nb", defaultValue = "3", defaultValueType = "number")
        @ConvertedParameter(
            index = 1,
            name = "asText",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object paragraphs(RuntimeEnv env, Object... args) {
            Object nb = assignParameter(args, 0, true);
            if (null == nb) {
                nb = 3;
            }
            Object asText = assignParameter(args, 1, true);
            if (null == asText) {
                asText = false;
            }
            ReferenceContainer i = new BasicReferenceContainer(null);
            ReferenceContainer paragraphs = new BasicReferenceContainer(null);
            paragraphs.setObject(ZVal.newArray());
            for (i.setObject(0);
                    ZVal.isLessThan(i.getObject(), '<', nb);
                    i.setObject(ZVal.increment(i.getObject()))) {
                paragraphs
                        .arrayAppend(env)
                        .set(
                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, Lorem.class)
                                        .method("paragraph")
                                        .call()
                                        .value());
            }

            return ZVal.assign(
                    ZVal.isTrue(asText)
                            ? NamespaceGlobal.implode
                                    .env(env)
                                    .call("\n\n", paragraphs.getObject())
                                    .value()
                            : paragraphs.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "maxNbChars",
            defaultValue = "200",
            defaultValueType = "number"
        )
        public Object text(RuntimeEnv env, Object... args) {
            Object maxNbChars = assignParameter(args, 0, true);
            if (null == maxNbChars) {
                maxNbChars = 200;
            }
            Object size = null;
            ReferenceContainer text = new BasicReferenceContainer(null);
            Object type = null;
            Object word = null;
            if (ZVal.isLessThan(maxNbChars, '<', 5)) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env, "text() can only generate text of at least 5 characters"));
            }

            type =
                    ZVal.assign(
                            ZVal.isLessThan(maxNbChars, '<', 25)
                                    ? "word"
                                    : ZVal.isLessThan(maxNbChars, '<', 100)
                                            ? "sentence"
                                            : "paragraph");
            text.setObject(ZVal.newArray());
            while (ZVal.isEmpty(text.getObject())) {
                size = 0;
                while (ZVal.isLessThan(size, '<', maxNbChars)) {
                    word =
                            toStringR(ZVal.isTrue(size) ? " " : "", env)
                                    + toStringR(
                                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                                            env, this, Lorem.class)
                                                    .method(type)
                                                    .call()
                                                    .value(),
                                            env);
                    text.arrayAppend(env).set(word);
                    size =
                            ZAssignment.add(
                                    "+=", size, function_strlen.f.env(env).call(word).value());
                }

                function_array_pop.f.env(env).call(text.getObject());
            }

            if (ZVal.strictEqualityCheck(type, "===", "word")) {
                text.arrayAccess(env, 0)
                        .set(NamespaceGlobal.ucwords.env(env).call(text.arrayGet(env, 0)).value());
                text.arrayAccess(
                                env,
                                ZVal.subtract(
                                        function_count.f.env(env).call(text.getObject()).value(),
                                        1))
                        .set(
                                toStringR(
                                                text.arrayGet(
                                                        env,
                                                        ZVal.subtract(
                                                                function_count
                                                                        .f
                                                                        .env(env)
                                                                        .call(text.getObject())
                                                                        .value(),
                                                                1)),
                                                env)
                                        + ".");
            }

            return ZVal.assign(NamespaceGlobal.implode.env(env).call(text.getObject(), "").value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "nbElements")
        protected Object randomizeNbElements(RuntimeEnv env, Object... args) {
            Object nbElements = assignParameter(args, 0, false);
            return ZVal.assign(
                    ZVal.add(
                            ZVal.toLong(
                                    ZVal.divide(
                                            ZVal.multiply(
                                                    nbElements,
                                                    NamespaceGlobal.mt_rand
                                                            .env(env)
                                                            .call(60, 140)
                                                            .value()),
                                            100)),
                            1));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object wordList =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "alias",
                                    "consequatur",
                                    "aut",
                                    "perferendis",
                                    "sit",
                                    "voluptatem",
                                    "accusantium",
                                    "doloremque",
                                    "aperiam",
                                    "eaque",
                                    "ipsa",
                                    "quae",
                                    "ab",
                                    "illo",
                                    "inventore",
                                    "veritatis",
                                    "et",
                                    "quasi",
                                    "architecto",
                                    "beatae",
                                    "vitae",
                                    "dicta",
                                    "sunt",
                                    "explicabo",
                                    "aspernatur",
                                    "aut",
                                    "odit",
                                    "aut",
                                    "fugit",
                                    "sed",
                                    "quia",
                                    "consequuntur",
                                    "magni",
                                    "dolores",
                                    "eos",
                                    "qui",
                                    "ratione",
                                    "voluptatem",
                                    "sequi",
                                    "nesciunt",
                                    "neque",
                                    "dolorem",
                                    "ipsum",
                                    "quia",
                                    "dolor",
                                    "sit",
                                    "amet",
                                    "consectetur",
                                    "adipisci",
                                    "velit",
                                    "sed",
                                    "quia",
                                    "non",
                                    "numquam",
                                    "eius",
                                    "modi",
                                    "tempora",
                                    "incidunt",
                                    "ut",
                                    "labore",
                                    "et",
                                    "dolore",
                                    "magnam",
                                    "aliquam",
                                    "quaerat",
                                    "voluptatem",
                                    "ut",
                                    "enim",
                                    "ad",
                                    "minima",
                                    "veniam",
                                    "quis",
                                    "nostrum",
                                    "exercitationem",
                                    "ullam",
                                    "corporis",
                                    "nemo",
                                    "enim",
                                    "ipsam",
                                    "voluptatem",
                                    "quia",
                                    "voluptas",
                                    "sit",
                                    "suscipit",
                                    "laboriosam",
                                    "nisi",
                                    "ut",
                                    "aliquid",
                                    "ex",
                                    "ea",
                                    "commodi",
                                    "consequatur",
                                    "quis",
                                    "autem",
                                    "vel",
                                    "eum",
                                    "iure",
                                    "reprehenderit",
                                    "qui",
                                    "in",
                                    "ea",
                                    "voluptate",
                                    "velit",
                                    "esse",
                                    "quam",
                                    "nihil",
                                    "molestiae",
                                    "et",
                                    "iusto",
                                    "odio",
                                    "dignissimos",
                                    "ducimus",
                                    "qui",
                                    "blanditiis",
                                    "praesentium",
                                    "laudantium",
                                    "totam",
                                    "rem",
                                    "voluptatum",
                                    "deleniti",
                                    "atque",
                                    "corrupti",
                                    "quos",
                                    "dolores",
                                    "et",
                                    "quas",
                                    "molestias",
                                    "excepturi",
                                    "sint",
                                    "occaecati",
                                    "cupiditate",
                                    "non",
                                    "provident",
                                    "sed",
                                    "ut",
                                    "perspiciatis",
                                    "unde",
                                    "omnis",
                                    "iste",
                                    "natus",
                                    "error",
                                    "similique",
                                    "sunt",
                                    "in",
                                    "culpa",
                                    "qui",
                                    "officia",
                                    "deserunt",
                                    "mollitia",
                                    "animi",
                                    "id",
                                    "est",
                                    "laborum",
                                    "et",
                                    "dolorum",
                                    "fuga",
                                    "et",
                                    "harum",
                                    "quidem",
                                    "rerum",
                                    "facilis",
                                    "est",
                                    "et",
                                    "expedita",
                                    "distinctio",
                                    "nam",
                                    "libero",
                                    "tempore",
                                    "cum",
                                    "soluta",
                                    "nobis",
                                    "est",
                                    "eligendi",
                                    "optio",
                                    "cumque",
                                    "nihil",
                                    "impedit",
                                    "quo",
                                    "porro",
                                    "quisquam",
                                    "est",
                                    "qui",
                                    "minus",
                                    "id",
                                    "quod",
                                    "maxime",
                                    "placeat",
                                    "facere",
                                    "possimus",
                                    "omnis",
                                    "voluptas",
                                    "assumenda",
                                    "est",
                                    "omnis",
                                    "dolor",
                                    "repellendus",
                                    "temporibus",
                                    "autem",
                                    "quibusdam",
                                    "et",
                                    "aut",
                                    "consequatur",
                                    "vel",
                                    "illum",
                                    "qui",
                                    "dolorem",
                                    "eum",
                                    "fugiat",
                                    "quo",
                                    "voluptas",
                                    "nulla",
                                    "pariatur",
                                    "at",
                                    "vero",
                                    "eos",
                                    "et",
                                    "accusamus",
                                    "officiis",
                                    "debitis",
                                    "aut",
                                    "rerum",
                                    "necessitatibus",
                                    "saepe",
                                    "eveniet",
                                    "ut",
                                    "et",
                                    "voluptates",
                                    "repudiandae",
                                    "sint",
                                    "et",
                                    "molestiae",
                                    "non",
                                    "recusandae",
                                    "itaque",
                                    "earum",
                                    "rerum",
                                    "hic",
                                    "tenetur",
                                    "a",
                                    "sapiente",
                                    "delectus",
                                    "ut",
                                    "aut",
                                    "reiciendis",
                                    "voluptatibus",
                                    "maiores",
                                    "doloribus",
                                    "asperiores",
                                    "repellat");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\Lorem")
                    .setLookup(
                            Lorem.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("wordList")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/Lorem.php")
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
