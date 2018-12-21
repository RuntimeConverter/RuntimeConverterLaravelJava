package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.ja_JP.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/ja_JP/Text.php

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

    public static final Object CONST_class = "Faker\\Provider\\ja_JP\\Text";

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

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "text")
        protected Object explode(RuntimeEnv env, Object... args) {
            Object text = assignParameter(args, 0, false);
            Object _pChar = null;
            ReferenceContainer chars = new BasicReferenceContainer(null);
            chars.setObject(ZVal.newArray());
            for (ZPair zpairResult130 :
                    ZVal.getIterable(
                            NamespaceGlobal.preg_split
                                    .env(env)
                                    .call(
                                            "//u",
                                            function_preg_replace
                                                    .f
                                                    .env(env)
                                                    .call("/\\s+/", "", text)
                                                    .value())
                                    .value(),
                            env,
                            true)) {
                _pChar = ZVal.assign(zpairResult130.getValue());
                if (ZVal.strictNotEqualityCheck(_pChar, "!==", "")) {
                    chars.arrayAppend(env).set(_pChar);
                }
            }

            return ZVal.assign(chars.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "text")
        protected Object strlen(RuntimeEnv env, Object... args) {
            Object text = assignParameter(args, 0, false);
            return ZVal.assign(
                    function_function_exists.f.env(env).call("mb_strlen").getBool()
                            ? NamespaceGlobal.mb_strlen.env(env).call(text, "UTF-8").value()
                            : function_count
                                    .f
                                    .env(env)
                                    .call(
                                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                                            env, this, Text.class)
                                                    .method("explode")
                                                    .addReferenceArgs(
                                                            new RuntimeArgsWithReferences())
                                                    .call(text)
                                                    .value())
                                    .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "word")
        protected Object validStart(RuntimeEnv env, Object... args) {
            Object word = assignParameter(args, 0, false);
            return ZVal.assign(
                    !function_in_array
                            .f
                            .env(env)
                            .call(
                                    word,
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Faker
                                                            .namespaces
                                                            .Provider
                                                            .namespaces
                                                            .ja_JP
                                                            .classes
                                                            .Text
                                                            .RequestStaticProperties
                                                            .class)
                                            .notBeginPunct)
                            .getBool());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "text")
        protected Object appendEnd(RuntimeEnv env, Object... args) {
            Object text = assignParameter(args, 0, false);
            Object last = null;
            Object chars = null;
            if (function_function_exists.f.env(env).call("mb_substr").getBool()) {
                last =
                        NamespaceGlobal.mb_substr
                                .env(env)
                                .call(
                                        text,
                                        0,
                                        ZVal.subtract(
                                                NamespaceGlobal.mb_strlen
                                                        .env(env)
                                                        .call(text)
                                                        .value(),
                                                1),
                                        "UTF-8")
                                .value();

            } else {
                chars =
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Text.class)
                                .method("split")
                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                .call(text)
                                .value();
                last = function_end.f.env(env).call(chars).value();
            }

            if (function_in_array
                    .f
                    .env(env)
                    .call(
                            last,
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Faker
                                                    .namespaces
                                                    .Provider
                                                    .namespaces
                                                    .ja_JP
                                                    .classes
                                                    .Text
                                                    .RequestStaticProperties
                                                    .class)
                                    .notEndPunct)
                    .getBool()) {
                text = function_preg_replace.f.env(env).call("/.$/u", "", text).value();
            }

            return ZVal.assign(
                    function_in_array
                                    .f
                                    .env(env)
                                    .call(
                                            last,
                                            env.getRequestStaticProperties(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .Faker
                                                                    .namespaces
                                                                    .Provider
                                                                    .namespaces
                                                                    .ja_JP
                                                                    .classes
                                                                    .Text
                                                                    .RequestStaticProperties
                                                                    .class)
                                                    .endPunct)
                                    .getBool()
                            ? text
                            : toStringR(text, env) + "\u3002");
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object separator = "";

        public Object separatorLen = 0;

        public Object notEndPunct =
                ZVal.arrayFromList(
                        "\u3001", "\u300C", "\u300E", "\u30FC", "\uFF0C", "\uFF1A", "\uFF1B");

        public Object endPunct =
                ZVal.arrayFromList("\u3002", "\u300D", "\u300F", "\uFF01", "\uFF1F");

        public Object notBeginPunct =
                ZVal.arrayFromList(
                        "\u3001", "\u3002", "\u300D", "\u300F", "\uFF01", "\uFF1F", "\u30FC",
                        "\uFF0C", "\uFF1A", "\uFF1B");

        public Object baseText = ZVal.getResourceAsString("stringLiterals/stringLiteral454.txt");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\ja_JP\\Text")
                    .setLookup(
                            Text.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("consecutiveWords", "explodedText", "generator", "unique")
                    .setStaticPropertyNames(
                            "baseText",
                            "endPunct",
                            "notBeginPunct",
                            "notEndPunct",
                            "separator",
                            "separatorLen")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/ja_JP/Text.php")
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
