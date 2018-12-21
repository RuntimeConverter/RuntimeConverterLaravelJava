package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.zh_TW.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_extension_loaded;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/zh_TW/Text.php

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

    public static final Object CONST_class = "Faker\\Provider\\zh_TW\\Text";

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
            for (ZPair zpairResult137 :
                    ZVal.getIterable(
                            NamespaceGlobal.preg_split
                                    .env(env)
                                    .call(
                                            "//u",
                                            function_str_replace
                                                    .f
                                                    .env(env)
                                                    .call("\n", "", text)
                                                    .value())
                                    .value(),
                            env,
                            true)) {
                _pChar = ZVal.assign(zpairResult137.getValue());
                if (!ZVal.isEmpty(_pChar)) {
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
                            ? NamespaceGlobal.mb_strlen
                                    .env(env)
                                    .call(
                                            text,
                                            env.getRequestStaticProperties(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .Faker
                                                                    .namespaces
                                                                    .Provider
                                                                    .namespaces
                                                                    .zh_TW
                                                                    .classes
                                                                    .Text
                                                                    .RequestStaticProperties
                                                                    .class)
                                                    .encoding)
                                    .value()
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
                                                            .zh_TW
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
            Object mbAvailable = null;
            ReferenceContainer chars = new BasicReferenceContainer(null);
            mbAvailable = function_extension_loaded.f.env(env).call("mbstring").value();
            if (ZVal.isTrue(mbAvailable)) {
                last =
                        NamespaceGlobal.mb_substr
                                .env(env)
                                .call(
                                        text,
                                        ZVal.subtract(
                                                NamespaceGlobal.mb_strlen
                                                        .env(env)
                                                        .call(
                                                                text,
                                                                env.getRequestStaticProperties(
                                                                                com.project
                                                                                        .convertedCode
                                                                                        .globalNamespace
                                                                                        .namespaces
                                                                                        .Faker
                                                                                        .namespaces
                                                                                        .Provider
                                                                                        .namespaces
                                                                                        .zh_TW
                                                                                        .classes
                                                                                        .Text
                                                                                        .RequestStaticProperties
                                                                                        .class)
                                                                        .encoding)
                                                        .value(),
                                                1),
                                        1,
                                        env.getRequestStaticProperties(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Faker
                                                                .namespaces
                                                                .Provider
                                                                .namespaces
                                                                .zh_TW
                                                                .classes
                                                                .Text
                                                                .RequestStaticProperties
                                                                .class)
                                                .encoding)
                                .value();

            } else {
                chars.setObject(
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Text.class)
                                .method("utf8Encoding")
                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                .call(text)
                                .value());
                last =
                        ZVal.assign(
                                chars.arrayGet(
                                        env,
                                        ZVal.subtract(
                                                function_count
                                                        .f
                                                        .env(env)
                                                        .call(chars.getObject())
                                                        .value(),
                                                1)));
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
                                                    .zh_TW
                                                    .classes
                                                    .Text
                                                    .RequestStaticProperties
                                                    .class)
                                    .notEndPunct)
                    .getBool()) {
                if (ZVal.isTrue(mbAvailable)) {
                    text =
                            NamespaceGlobal.mb_substr
                                    .env(env)
                                    .call(
                                            text,
                                            0,
                                            ZVal.subtract(
                                                    NamespaceGlobal.mb_strlen
                                                            .env(env)
                                                            .call(
                                                                    text,
                                                                    env.getRequestStaticProperties(
                                                                                    com.project
                                                                                            .convertedCode
                                                                                            .globalNamespace
                                                                                            .namespaces
                                                                                            .Faker
                                                                                            .namespaces
                                                                                            .Provider
                                                                                            .namespaces
                                                                                            .zh_TW
                                                                                            .classes
                                                                                            .Text
                                                                                            .RequestStaticProperties
                                                                                            .class)
                                                                            .encoding)
                                                            .value(),
                                                    1),
                                            env.getRequestStaticProperties(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .Faker
                                                                    .namespaces
                                                                    .Provider
                                                                    .namespaces
                                                                    .zh_TW
                                                                    .classes
                                                                    .Text
                                                                    .RequestStaticProperties
                                                                    .class)
                                                    .encoding)
                                    .value();

                } else {
                    function_array_pop.f.env(env).call(chars.getObject());
                    text = NamespaceGlobal.implode.env(env).call("", chars.getObject()).value();
                }
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
                                                                    .zh_TW
                                                                    .classes
                                                                    .Text
                                                                    .RequestStaticProperties
                                                                    .class)
                                                    .endPunct)
                                    .getBool()
                            ? text
                            : toStringR(text, env) + "\u3002");
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "text")
        protected Object utf8Encoding(RuntimeEnv env, Object... args) {
            Object text = assignParameter(args, 0, false);
            Object ord = null;
            Object countChars = null;
            Object temp = null;
            ReferenceContainer i = new BasicReferenceContainer(null);
            ReferenceContainer encoding = new BasicReferenceContainer(null);
            ReferenceContainer chars = new BasicReferenceContainer(null);
            encoding.setObject(ZVal.newArray());
            chars.setObject(NamespaceGlobal.str_split.env(env).call(text).value());
            countChars = function_count.f.env(env).call(chars.getObject()).value();
            for (i.setObject(0);
                    ZVal.isLessThan(i.getObject(), '<', countChars);
                    i.setObject(ZVal.increment(i.getObject()))) {
                temp = ZVal.assign(chars.arrayGet(env, i.getObject()));
                ord = NamespaceGlobal.ord.env(env).call(chars.arrayGet(env, i.getObject())).value();
                SwitchEnumType15 switchVariable15 =
                        ZVal.getEnum(
                                true,
                                SwitchEnumType15.DEFAULT_CASE,
                                SwitchEnumType15.DYNAMIC_TYPE_51,
                                ZVal.isGreaterThan(ord, '>', 251),
                                SwitchEnumType15.DYNAMIC_TYPE_52,
                                ZVal.isGreaterThan(ord, '>', 247),
                                SwitchEnumType15.DYNAMIC_TYPE_53,
                                ZVal.isGreaterThan(ord, '>', 239),
                                SwitchEnumType15.DYNAMIC_TYPE_54,
                                ZVal.isGreaterThan(ord, '>', 223),
                                SwitchEnumType15.DYNAMIC_TYPE_55,
                                ZVal.isGreaterThan(ord, '>', 191));
                switch (switchVariable15) {
                    case DYNAMIC_TYPE_51:
                        temp =
                                toStringR(temp, env)
                                        + toStringR(chars.arrayGet(env, ZVal.preIncrement(i)), env);
                    case DYNAMIC_TYPE_52:
                        temp =
                                toStringR(temp, env)
                                        + toStringR(chars.arrayGet(env, ZVal.preIncrement(i)), env);
                    case DYNAMIC_TYPE_53:
                        temp =
                                toStringR(temp, env)
                                        + toStringR(chars.arrayGet(env, ZVal.preIncrement(i)), env);
                    case DYNAMIC_TYPE_54:
                        temp =
                                toStringR(temp, env)
                                        + toStringR(chars.arrayGet(env, ZVal.preIncrement(i)), env);
                    case DYNAMIC_TYPE_55:
                        temp =
                                toStringR(temp, env)
                                        + toStringR(chars.arrayGet(env, ZVal.preIncrement(i)), env);
                }
                ;
                encoding.arrayAppend(env).set(temp);
            }

            return ZVal.assign(encoding.getObject());
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

        public Object baseText = ZVal.getResourceAsString("stringLiterals/stringLiteral632.txt");

        public Object encoding = "UTF-8";
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\zh_TW\\Text")
                    .setLookup(
                            Text.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("consecutiveWords", "explodedText", "generator", "unique")
                    .setStaticPropertyNames(
                            "baseText",
                            "encoding",
                            "endPunct",
                            "notBeginPunct",
                            "notEndPunct",
                            "separator",
                            "separatorLen")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/zh_TW/Text.php")
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

    private enum SwitchEnumType15 {
        DYNAMIC_TYPE_51,
        DYNAMIC_TYPE_52,
        DYNAMIC_TYPE_53,
        DYNAMIC_TYPE_54,
        DYNAMIC_TYPE_55,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
