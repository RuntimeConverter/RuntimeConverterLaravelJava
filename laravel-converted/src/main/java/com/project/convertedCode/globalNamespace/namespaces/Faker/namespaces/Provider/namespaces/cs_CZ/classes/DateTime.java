package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.cs_CZ.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/cs_CZ/DateTime.php

*/

public class DateTime
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .DateTime {

    public DateTime(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DateTime.class) {
            this.__construct(env, args);
        }
    }

    public DateTime(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object formattedDate(RuntimeEnv env, Object... args) {
        Object format = null;
        format =
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, DateTime.class)
                        .method("randomElement")
                        .addReferenceArgs(
                                new RuntimeArgsWithReferences()
                                        .add(
                                                0,
                                                env.getRequestStaticPropertiesReference(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Faker
                                                                .namespaces
                                                                .Provider
                                                                .namespaces
                                                                .cs_CZ
                                                                .classes
                                                                .DateTime
                                                                .RequestStaticProperties
                                                                .class,
                                                        "formattedDateFormat")))
                        .call(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Faker
                                                        .namespaces
                                                        .Provider
                                                        .namespaces
                                                        .cs_CZ
                                                        .classes
                                                        .DateTime
                                                        .RequestStaticProperties
                                                        .class)
                                        .formattedDateFormat)
                        .value();
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        DateTime.class,
                        format));
    }

    public static final Object CONST_class = "Faker\\Provider\\cs_CZ\\DateTime";

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
                    .DateTime
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "max")
        public Object monthName(RuntimeEnv env, Object... args) {
            Object max = assignParameter(args, 0, true);
            if (null == max) {
                max = "now";
            }
            return ZVal.assign(
                    env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Faker
                                            .namespaces
                                            .Provider
                                            .namespaces
                                            .cs_CZ
                                            .classes
                                            .DateTime
                                            .RequestStaticProperties
                                            .class,
                                    "months")
                            .arrayGet(
                                    env,
                                    ZVal.subtract(
                                            com.project.convertedCode.globalNamespace.namespaces
                                                    .Faker.namespaces.Provider.classes.DateTime
                                                    .runtimeStaticObject.month(env, max),
                                            1)));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "max")
        public Object monthNameGenitive(RuntimeEnv env, Object... args) {
            Object max = assignParameter(args, 0, true);
            if (null == max) {
                max = "now";
            }
            return ZVal.assign(
                    env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Faker
                                            .namespaces
                                            .Provider
                                            .namespaces
                                            .cs_CZ
                                            .classes
                                            .DateTime
                                            .RequestStaticProperties
                                            .class,
                                    "monthsGenitive")
                            .arrayGet(
                                    env,
                                    ZVal.subtract(
                                            com.project.convertedCode.globalNamespace.namespaces
                                                    .Faker.namespaces.Provider.classes.DateTime
                                                    .runtimeStaticObject.month(env, max),
                                            1)));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "max")
        public Object dayOfWeek(RuntimeEnv env, Object... args) {
            Object max = assignParameter(args, 0, true);
            if (null == max) {
                max = "now";
            }
            return ZVal.assign(
                    env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Faker
                                            .namespaces
                                            .Provider
                                            .namespaces
                                            .cs_CZ
                                            .classes
                                            .DateTime
                                            .RequestStaticProperties
                                            .class,
                                    "days")
                            .arrayGet(
                                    env,
                                    env.callMethod(
                                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                                            env, this, DateTime.class)
                                                    .method("dateTime")
                                                    .addReferenceArgs(
                                                            new RuntimeArgsWithReferences())
                                                    .call(max)
                                                    .value(),
                                            "format",
                                            DateTime.class,
                                            "w")));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "max")
        public Object dayOfMonth(RuntimeEnv env, Object... args) {
            Object max = assignParameter(args, 0, true);
            if (null == max) {
                max = "now";
            }
            return ZVal.assign(
                    env.callMethod(
                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                            env, this, DateTime.class)
                                    .method("dateTime")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(max)
                                    .value(),
                            "format",
                            DateTime.class,
                            "j"));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object days =
                ZVal.arrayFromList(
                        "ned\u011Ble",
                        "pond\u011Bl\u00ED",
                        "\u00FAter\u00FD",
                        "st\u0159eda",
                        "\u010Dtvrtek",
                        "p\u00E1tek",
                        "sobota");

        public Object months =
                ZVal.arrayFromList(
                        "leden",
                        "\u00FAnor",
                        "b\u0159ezen",
                        "duben",
                        "kv\u011Bten",
                        "\u010Derven",
                        "\u010Dervenec",
                        "srpen",
                        "z\u00E1\u0159\u00ED",
                        "\u0159\u00EDjen",
                        "listopad",
                        "prosinec");

        public Object monthsGenitive =
                ZVal.arrayFromList(
                        "ledna",
                        "\u00FAnora",
                        "b\u0159ezna",
                        "dubna",
                        "kv\u011Btna",
                        "\u010Dervna",
                        "\u010Dervence",
                        "srpna",
                        "z\u00E1\u0159\u00ED",
                        "\u0159\u00EDjna",
                        "listopadu",
                        "prosince");

        public Object formattedDateFormat =
                ZVal.arrayFromList("{{dayOfMonth}}. {{monthNameGenitive}} {{year}}");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\cs_CZ\\DateTime")
                    .setLookup(
                            DateTime.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "days", "formattedDateFormat", "months", "monthsGenitive")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/cs_CZ/DateTime.php")
                    .addExtendsClass("Faker\\Provider\\DateTime")
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
