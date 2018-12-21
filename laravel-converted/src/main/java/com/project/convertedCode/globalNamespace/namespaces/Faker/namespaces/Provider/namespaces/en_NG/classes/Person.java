package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.en_NG.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/en_NG/Person.php

*/

public class Person
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .Person {

    public Person(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Person.class) {
            this.__construct(env, args);
        }
    }

    public Person(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Faker\\Provider\\en_NG\\Person";

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
                    .Person
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object maleNameFormats =
                ZVal.arrayFromList(
                        "{{firstNameMale}} {{lastName}}",
                        "{{firstNameMale}} {{firstNameMale}} {{lastName}}");

        public Object femaleNameFormats =
                ZVal.arrayFromList(
                        "{{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{firstNameFemale}} {{lastName}}");

        public Object firstNameMale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Abimbola",
                                    "Abisola",
                                    "Abisoye",
                                    "Adeboye",
                                    "Adedayo",
                                    "Adegoke",
                                    "Akande",
                                    "Akanni",
                                    "Alade",
                                    "Ayinde",
                                    "Azubuike",
                                    "Banji",
                                    "Bankole",
                                    "Buchi",
                                    "Bukola",
                                    "Chinedu",
                                    "Chisom",
                                    "Chukwu",
                                    "Damilare",
                                    "Damilola",
                                    "Danjuma",
                                    "Ebiowei",
                                    "Emeka",
                                    "Emmanuel",
                                    "Esse",
                                    "Funmilade",
                                    "Funmilayo",
                                    "Gbeminiyi",
                                    "Gbemisola",
                                    "Habiba",
                                    "Ifeanyichukwu",
                                    "Ikenna",
                                    "Ikhidie",
                                    "Ireti",
                                    "Jadesola",
                                    "Johnson",
                                    "Kayode",
                                    "Kemi",
                                    "Kubra",
                                    "Kubura",
                                    "Lolade",
                                    "Makinwa",
                                    "Mohammed",
                                    "Musa",
                                    "Muyiwa",
                                    "Nnamdi",
                                    "Olaide",
                                    "Olufunmi",
                                    "Olumide",
                                    "Oluwunmi",
                                    "Onoriode",
                                    "Remilekun",
                                    "Rotimi",
                                    "Shade",
                                    "Shalewa",
                                    "Sname",
                                    "Tari",
                                    "Temitope",
                                    "Titilope",
                                    "Tobiloba",
                                    "Toke",
                                    "Tomiloba",
                                    "Tope",
                                    "Uzodimma",
                                    "Wale",
                                    "Yakubu",
                                    "Yusuf",
                                    "Yusuf");
                        });

        public Object firstNameFemale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Adaugo",
                                    "Akunna",
                                    "Aminat",
                                    "Aminu",
                                    "Augustina",
                                    "Ayebatari",
                                    "Cherechi",
                                    "Chiamaka",
                                    "Chimamanda",
                                    "Chinyere",
                                    "Chizoba",
                                    "Ebiere",
                                    "Efe",
                                    "Fatima",
                                    "Ifeoma",
                                    "Ifunanya",
                                    "Isioma",
                                    "Jolayemi",
                                    "Lola",
                                    "Obioma",
                                    "Omawunmi",
                                    "Omolara",
                                    "Onome",
                                    "Rasheedah",
                                    "Sekinat",
                                    "Simisola",
                                    "Sumayyah",
                                    "Titi",
                                    "Titilayo",
                                    "Toluwani",
                                    "Zainab");
                        });

        public Object lastName =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Abiodun",
                                    "Abiola",
                                    "Abodunrin",
                                    "Abosede",
                                    "Adaobi",
                                    "Adebayo",
                                    "Adegboye",
                                    "Adegoke",
                                    "Ademayowa",
                                    "Ademola",
                                    "Adeniyan",
                                    "Adeoluwa",
                                    "Aderinsola",
                                    "Aderonke",
                                    "Adesina",
                                    "Adewale",
                                    "Adewale",
                                    "Adewale",
                                    "Adewunmi",
                                    "Adewura",
                                    "Adeyemo",
                                    "Afolabi",
                                    "Afunku",
                                    "Agboola",
                                    "Agboola",
                                    "Agnes",
                                    "Aigbiniode",
                                    "Ajakaiye",
                                    "Ajose-adeogun",
                                    "Akeem-omosanya",
                                    "Akerele",
                                    "Akintade",
                                    "Aligbe",
                                    "Amaechi",
                                    "Aminat",
                                    "Aremu",
                                    "Atanda",
                                    "Ayisat",
                                    "Ayobami",
                                    "Ayomide",
                                    "Ayomide",
                                    "Babalola",
                                    "Babatunde",
                                    "Balogun",
                                    "Bamisebi",
                                    "Bello",
                                    "Busari",
                                    "Chibike",
                                    "Chibuike",
                                    "Chidinma",
                                    "Chidozie",
                                    "Christian",
                                    "Clare",
                                    "David",
                                    "David",
                                    "Ebubechukwu",
                                    "Egbochukwu",
                                    "Ehigiator",
                                    "Ekwueme",
                                    "Elebiyo",
                                    "Elizabeth",
                                    "Elizabeth",
                                    "Elizabeth",
                                    "Emmanuel",
                                    "Emmanuel",
                                    "Esther",
                                    "Funmilayo",
                                    "Gbadamosi",
                                    "Gbogboade",
                                    "Grace",
                                    "Habeeb",
                                    "Hanifat",
                                    "Isaac",
                                    "Ismail",
                                    "Isokun",
                                    "Isreal",
                                    "Iyalla",
                                    "Jamiu",
                                    "Jimoh",
                                    "Joshua",
                                    "Justina",
                                    "Katherine",
                                    "Kayode",
                                    "Kayode",
                                    "Kimberly",
                                    "Ladega",
                                    "Latifat",
                                    "Lawal",
                                    "Leonard",
                                    "Makuachukwu",
                                    "Maryam",
                                    "Maryjane",
                                    "Mayowa",
                                    "Miracle",
                                    "Mobolaji",
                                    "Mogbadunade",
                                    "Motalo",
                                    "Muinat",
                                    "Mukaram",
                                    "Mustapha",
                                    "Mutiat",
                                    "Ndukwu",
                                    "Ngozi",
                                    "Nojeem",
                                    "Nwachukwu",
                                    "Nwogu",
                                    "Nwuzor",
                                    "Obiageli",
                                    "Obianuju",
                                    "Odunayo",
                                    "Odunayo",
                                    "Ogunbanwo",
                                    "Ogunwande",
                                    "Okonkwo",
                                    "Okunola",
                                    "Oladeji",
                                    "Oladimeji",
                                    "Olaoluwa",
                                    "Olasunkanmi",
                                    "Olasunkanmi-fasayo",
                                    "Olawale",
                                    "Olubukola",
                                    "Olubunmi",
                                    "Olufeyikemi",
                                    "Olumide",
                                    "Olutola",
                                    "Oluwakemi",
                                    "Oluwanisola",
                                    "Oluwaseun",
                                    "Oluwaseyi",
                                    "Oluwashina",
                                    "Oluwatosin",
                                    "Omobolaji",
                                    "Omobolanle",
                                    "Omolara",
                                    "Omowale",
                                    "Onohinosen",
                                    "Onose",
                                    "Onyinyechukwu",
                                    "Opeyemi",
                                    "Osuagwu",
                                    "Oyebola",
                                    "Oyelude",
                                    "Oyinkansola",
                                    "Peter",
                                    "Sabdat",
                                    "Saheed",
                                    "Salami",
                                    "Samuel",
                                    "Sanusi",
                                    "Sarah",
                                    "Segunmaru",
                                    "Sekinat",
                                    "Sulaimon",
                                    "Sylvester",
                                    "Taiwo",
                                    "Tamunoemi",
                                    "Tella",
                                    "Temitope",
                                    "Tolulope",
                                    "Uchechi",
                                    "Wasiu",
                                    "Wilcox",
                                    "Wuraola",
                                    "Yaqub",
                                    "Yussuf");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\en_NG\\Person")
                    .setLookup(
                            Person.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "femaleNameFormats",
                            "firstNameFemale",
                            "firstNameMale",
                            "lastName",
                            "maleNameFormats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/en_NG/Person.php")
                    .addExtendsClass("Faker\\Provider\\Person")
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
