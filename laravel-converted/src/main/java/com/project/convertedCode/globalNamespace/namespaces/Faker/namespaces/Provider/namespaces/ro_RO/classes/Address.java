package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.ro_RO.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/ro_RO/Address.php

*/

public class Address
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .Address {

    public Address(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Address.class) {
            this.__construct(env, args);
        }
    }

    public Address(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object cityName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
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
                                                                .ro_RO
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "cityNames")))
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
                                                        .ro_RO
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .cityNames)
                        .value());
    }

    @ConvertedMethod
    public Object blockSegment(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
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
                                                                .ro_RO
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "blockSegment")))
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
                                                        .ro_RO
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .blockSegment)
                        .value());
    }

    @ConvertedMethod
    public Object streetPrefix(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
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
                                                                .ro_RO
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "streetPrefix")))
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
                                                        .ro_RO
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .streetPrefix)
                        .value());
    }

    @ConvertedMethod
    public Object streetPlainName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
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
                                                                .ro_RO
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "streetPlainName")))
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
                                                        .ro_RO
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .streetPlainName)
                        .value());
    }

    @ConvertedMethod
    public Object streetName(RuntimeEnv env, Object... args) {
        Object format = null;
        format =
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
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
                                                                .ro_RO
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "streetNameFormats")))
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
                                                        .ro_RO
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .streetNameFormats)
                        .value();
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        Address.class,
                        format));
    }

    @ConvertedMethod
    public Object county(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
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
                                                                .ro_RO
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "counties")))
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
                                                        .ro_RO
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .counties)
                        .value());
    }

    @ConvertedMethod
    public Object address(RuntimeEnv env, Object... args) {
        Object format = null;
        format =
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
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
                                                                .ro_RO
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "addressFormats")))
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
                                                        .ro_RO
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .addressFormats)
                        .value();
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        Address.class,
                        format));
    }

    @ConvertedMethod
    public Object streetAddress(RuntimeEnv env, Object... args) {
        Object format = null;
        format =
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
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
                                                                .ro_RO
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "streetAddressFormats")))
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
                                                        .ro_RO
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .streetAddressFormats)
                        .value();
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        Address.class,
                        format));
    }

    public static final Object CONST_class = "Faker\\Provider\\ro_RO\\Address";

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
                    .Address
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object block(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                            .method("numerify")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Address.class)
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
                                                                            .namespaces
                                                                            .ro_RO
                                                                            .classes
                                                                            .Address
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .block)
                                            .value())
                            .value());
        }

        @ConvertedMethod
        public Object floor(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                            .method("numerify")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Address.class)
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
                                                                            .namespaces
                                                                            .ro_RO
                                                                            .classes
                                                                            .Address
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .floor)
                                            .value())
                            .value());
        }

        @ConvertedMethod
        public Object apartmentNumber(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                            .method("numerify")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Address.class)
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
                                                                            .namespaces
                                                                            .ro_RO
                                                                            .classes
                                                                            .Address
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .apartmentNumber)
                                            .value())
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object buildingNumber = ZVal.arrayFromList("###", "##", "#", "#/#", "#A", "#B");

        public Object apartmentNumber = ZVal.arrayFromList("#", "##");

        public Object floor = ZVal.arrayFromList("#", "##");

        public Object block = ZVal.arrayFromList("#", "##", "A", "B", "C", "D");

        public Object blockSegment = ZVal.arrayFromList("A", "B", "C", "D");

        public Object streetPrefix =
                ZVal.arrayFromList("Str.", "B-dul.", "Aleea", "Splaiul", "Calea", "P-\u021Ba");

        public Object streetPlainName =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Eroilor",
                                    "Independen\u021Bei",
                                    "Memorandumului",
                                    "Unirii",
                                    "1 Decembrie",
                                    "Mihai Viteazul",
                                    "Mircea cel B\u0103tr\u00E2n",
                                    "Vlad \u021Aepe\u0219",
                                    "Traian",
                                    "Decebal",
                                    "Horea",
                                    "Clo\u0219ca",
                                    "Cri\u0219an",
                                    "Louis Pasteur",
                                    "Albert Einstein",
                                    "Franklin Delano Rosevelt",
                                    "J.J Rousseau",
                                    "Petrache Poenaru",
                                    "Henri Coand\u0103",
                                    "Constantin Br\u00E2ncu\u0219i",
                                    "Aurel Vlaicu",
                                    "Ion Creang\u0103",
                                    "Mihai Eminescu",
                                    "Cire\u0219ilor",
                                    "Frasinului",
                                    "Salc\u00E2milor",
                                    "Br\u0103du\u021Bului",
                                    "Frunzi\u0219ului",
                                    "Castanilor",
                                    "Mesteac\u0103nului",
                                    "Florilor",
                                    "P\u0103durii",
                                    "Piersicului",
                                    "Croitorilor",
                                    "Me\u0219terilor",
                                    "Zidarilor",
                                    "P\u0103curari",
                                    "Muncii",
                                    "\u00CEnv\u0103\u021B\u0103torului",
                                    "Jiului",
                                    "Bega",
                                    "Some\u0219",
                                    "F\u0103get",
                                    "Sinaia",
                                    "Herculane",
                                    "Padi\u0219");
                        });

        public Object postcode = ZVal.arrayFromList("######");

        public Object cityNames =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Abrud",
                                    "Adjud",
                                    "Agnita",
                                    "Aiud",
                                    "Alba Iulia",
                                    "Ale\u0219d",
                                    "Alexandria",
                                    "Amara",
                                    "Anina",
                                    "Aninoasa",
                                    "Arad",
                                    "Ardud",
                                    "Avrig",
                                    "Azuga",
                                    "Babadag",
                                    "B\u0103beni",
                                    "Bac\u0103u",
                                    "Baia de Aram\u0103",
                                    "Baia de Arie\u0219",
                                    "Baia Mare",
                                    "Baia Sprie",
                                    "B\u0103icoi",
                                    "B\u0103ile Govora",
                                    "B\u0103ile Herculane",
                                    "B\u0103ile Ol\u0103ne\u0219ti",
                                    "B\u0103ile Tu\u0219nad",
                                    "B\u0103ile\u0219ti",
                                    "B\u0103lan",
                                    "B\u0103lce\u0219ti",
                                    "Bal\u0219",
                                    "B\u0103neasa",
                                    "Baraolt",
                                    "B\u00E2rlad",
                                    "Bechet",
                                    "Beclean",
                                    "Beiu\u0219",
                                    "Berbe\u0219ti",
                                    "Bere\u0219ti",
                                    "Bicaz",
                                    "Bistri\u021Ba",
                                    "Blaj",
                                    "Boc\u0219a",
                                    "Bolde\u0219ti-Sc\u0103eni",
                                    "Bolintin-Vale",
                                    "Bor\u0219a",
                                    "Borsec",
                                    "Boto\u0219ani",
                                    "Brad",
                                    "Bragadiru",
                                    "Br\u0103ila",
                                    "Bra\u0219ov",
                                    "Breaza",
                                    "Brezoi",
                                    "Bro\u0219teni",
                                    "Bucecea",
                                    "Bucure\u0219ti",
                                    "Bude\u0219ti",
                                    "Buftea",
                                    "Buhu\u0219i",
                                    "Bumbe\u0219ti-Jiu",
                                    "Bu\u0219teni",
                                    "Buz\u0103u",
                                    "Buzia\u0219",
                                    "Cajvana",
                                    "Calafat",
                                    "C\u0103lan",
                                    "C\u0103l\u0103ra\u0219i",
                                    "C\u0103lim\u0103ne\u0219ti",
                                    "C\u00E2mpeni",
                                    "C\u00E2mpia Turzii",
                                    "C\u00E2mpina",
                                    "C\u00E2mpulung Moldovenesc",
                                    "C\u00E2mpulung",
                                    "Caracal",
                                    "Caransebe\u0219",
                                    "Carei",
                                    "Cavnic",
                                    "C\u0103z\u0103ne\u0219ti",
                                    "Cehu Silvaniei",
                                    "Cernavod\u0103",
                                    "Chi\u0219ineu-Cri\u0219",
                                    "Chitila",
                                    "Ciacova",
                                    "Cisn\u0103die",
                                    "Cluj-Napoca",
                                    "Codlea",
                                    "Com\u0103ne\u0219ti",
                                    "Comarnic",
                                    "Constan\u021Ba",
                                    "Cop\u0219a Mic\u0103",
                                    "Corabia",
                                    "Coste\u0219ti",
                                    "Covasna",
                                    "Craiova",
                                    "Cristuru Secuiesc",
                                    "Cugir",
                                    "Curtea de Arge\u0219",
                                    "Curtici",
                                    "D\u0103buleni",
                                    "Darabani",
                                    "D\u0103rm\u0103ne\u0219ti",
                                    "Dej",
                                    "Deta",
                                    "Deva",
                                    "Dolhasca",
                                    "Dorohoi",
                                    "Dr\u0103g\u0103ne\u0219ti-Olt",
                                    "Dr\u0103g\u0103\u0219ani",
                                    "Dragomire\u0219ti",
                                    "Drobeta-Turnu Severin",
                                    "Dumbr\u0103veni",
                                    "Eforie",
                                    "F\u0103g\u0103ra\u0219",
                                    "F\u0103get",
                                    "F\u0103lticeni",
                                    "F\u0103urei",
                                    "Fete\u0219ti",
                                    "Fieni",
                                    "Fierbin\u021Bi-T\u00E2rg",
                                    "Filia\u0219i",
                                    "Fl\u0103m\u00E2nzi",
                                    "Foc\u0219ani",
                                    "Frasin",
                                    "Fundulea",
                                    "G\u0103e\u0219ti",
                                    "Gala\u021Bi",
                                    "G\u0103taia",
                                    "Geoagiu",
                                    "Gheorgheni",
                                    "Gherla",
                                    "Ghimbav",
                                    "Giurgiu",
                                    "Gura Humorului",
                                    "H\u00E2rl\u0103u",
                                    "H\u00E2r\u0219ova",
                                    "Ha\u021Beg",
                                    "Horezu",
                                    "Huedin",
                                    "Hunedoara",
                                    "Hu\u0219i",
                                    "Ianca",
                                    "Ia\u0219i",
                                    "Iernut",
                                    "Ineu",
                                    "\u00CEnsur\u0103\u021Bei",
                                    "\u00CEntorsura Buz\u0103ului",
                                    "Isaccea",
                                    "Jibou",
                                    "Jimbolia",
                                    "Lehliu Gar\u0103",
                                    "Lipova",
                                    "Liteni",
                                    "Livada",
                                    "Ludu\u0219",
                                    "Lugoj",
                                    "Lupeni",
                                    "M\u0103cin",
                                    "M\u0103gurele",
                                    "Mangalia",
                                    "M\u0103r\u0103\u0219e\u0219ti",
                                    "Marghita",
                                    "Medgidia",
                                    "Media\u0219",
                                    "Miercurea Ciuc",
                                    "Miercurea Nirajului",
                                    "Miercurea Sibiului",
                                    "Mih\u0103ile\u0219ti",
                                    "Mili\u0219\u0103u\u021Bi",
                                    "Mioveni",
                                    "Mizil",
                                    "Moine\u0219ti",
                                    "Moldova Nou\u0103",
                                    "Moreni",
                                    "Motru",
                                    "Murfatlar",
                                    "Murgeni",
                                    "N\u0103dlac",
                                    "N\u0103s\u0103ud",
                                    "N\u0103vodari",
                                    "Negre\u0219ti",
                                    "Negre\u0219ti-Oa\u0219",
                                    "Negru Vod\u0103",
                                    "Nehoiu",
                                    "Novaci",
                                    "Nucet",
                                    "Ocna Mure\u0219",
                                    "Ocna Sibiului",
                                    "Ocnele Mari",
                                    "Odobe\u0219ti",
                                    "Odorheiu Secuiesc",
                                    "Olteni\u021Ba",
                                    "One\u0219ti",
                                    "Oradea",
                                    "Or\u0103\u0219tie",
                                    "Oravi\u021Ba",
                                    "Or\u0219ova",
                                    "O\u021Belu Ro\u0219u",
                                    "Otopeni",
                                    "Ovidiu",
                                    "Panciu",
                                    "P\u00E2ncota",
                                    "Pantelimon",
                                    "Pa\u0219cani",
                                    "P\u0103t\u00E2rlagele",
                                    "Pecica",
                                    "Petrila",
                                    "Petro\u0219ani",
                                    "Piatra Neam\u021B",
                                    "Piatra-Olt",
                                    "Pite\u0219ti",
                                    "Ploie\u0219ti",
                                    "Plopeni",
                                    "Podu Iloaiei",
                                    "Pogoanele",
                                    "Pope\u0219ti-Leordeni",
                                    "Potcoava",
                                    "Predeal",
                                    "Pucioasa",
                                    "R\u0103cari",
                                    "R\u0103d\u0103u\u021Bi",
                                    "R\u00E2mnicu S\u0103rat",
                                    "R\u00E2\u0219nov",
                                    "Reca\u0219",
                                    "Reghin",
                                    "Re\u0219i\u021Ba",
                                    "Roman",
                                    "Ro\u0219iorii de Vede",
                                    "Rovinari",
                                    "Roznov",
                                    "Rupea",
                                    "S\u0103cele",
                                    "S\u0103cueni",
                                    "Salcea",
                                    "S\u0103li\u0219te",
                                    "S\u0103li\u0219tea de Sus",
                                    "Salonta",
                                    "S\u00E2ngeorgiu de P\u0103dure",
                                    "S\u00E2ngeorz-B\u0103i",
                                    "S\u00E2nnicolau Mare",
                                    "S\u00E2ntana",
                                    "S\u0103rma\u0219u",
                                    "Satu Mare",
                                    "S\u0103veni",
                                    "Scornice\u0219ti",
                                    "Sebe\u0219",
                                    "Sebi\u0219",
                                    "Segarcea",
                                    "Seini",
                                    "Sf\u00E2ntu Gheorghe",
                                    "Sibiu",
                                    "Sighetu Marma\u021Biei",
                                    "Sighi\u0219oara",
                                    "Simeria",
                                    "\u0218imleu Silvaniei",
                                    "Sinaia",
                                    "Siret",
                                    "Sl\u0103nic",
                                    "Sl\u0103nic-Moldova",
                                    "Slatina",
                                    "Slobozia",
                                    "Solca",
                                    "\u0218omcuta Mare",
                                    "Sovata",
                                    "\u0218tef\u0103ne\u0219ti, Arge\u0219",
                                    "\u0218tef\u0103ne\u0219ti, Boto\u0219ani",
                                    "\u0218tei",
                                    "Strehaia",
                                    "Suceava",
                                    "Sulina",
                                    "T\u0103lmaciu",
                                    "\u021A\u0103nd\u0103rei",
                                    "T\u00E2rgovi\u0219te",
                                    "T\u00E2rgu Bujor",
                                    "T\u00E2rgu C\u0103rbune\u0219ti",
                                    "T\u00E2rgu Frumos",
                                    "T\u00E2rgu Jiu",
                                    "T\u00E2rgu L\u0103pu\u0219",
                                    "T\u00E2rgu Mure\u0219",
                                    "T\u00E2rgu Neam\u021B",
                                    "T\u00E2rgu Ocna",
                                    "T\u00E2rgu Secuiesc",
                                    "T\u00E2rn\u0103veni",
                                    "T\u0103\u0219nad",
                                    "T\u0103u\u021Bii-M\u0103gher\u0103u\u0219",
                                    "Techirghiol",
                                    "Tecuci",
                                    "Teiu\u0219",
                                    "\u021Aicleni",
                                    "Timi\u0219oara",
                                    "Tismana",
                                    "Titu",
                                    "Topli\u021Ba",
                                    "Topoloveni",
                                    "Tulcea",
                                    "Turceni",
                                    "Turda",
                                    "Turnu M\u0103gurele",
                                    "Ulmeni",
                                    "Ungheni",
                                    "Uricani",
                                    "Urla\u021Bi",
                                    "Urziceni",
                                    "Valea lui Mihai",
                                    "V\u0103lenii de Munte",
                                    "V\u00E2nju Mare",
                                    "Va\u0219c\u0103u",
                                    "Vaslui",
                                    "Vatra Dornei",
                                    "Vicovu de Sus",
                                    "Victoria",
                                    "Videle",
                                    "Vi\u0219eu de Sus",
                                    "Vl\u0103hi\u021Ba",
                                    "Voluntari",
                                    "Vulcan",
                                    "Zal\u0103u",
                                    "Z\u0103rne\u0219ti",
                                    "Zimnicea",
                                    "Zlatna");
                        });

        public Object counties =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Alba",
                                    "Arad",
                                    "Arge\u0219",
                                    "Bac\u0103u",
                                    "Bihor",
                                    "Bistri\u021Ba N\u0103s\u0103ud",
                                    "Boto\u0219ani",
                                    "Br\u0103ila",
                                    "Bra\u0219ov",
                                    "Bucure\u0219ti",
                                    "Buz\u0103u",
                                    "C\u0103l\u0103ra\u0219i",
                                    "Cara\u0219-Severin",
                                    "Cluj",
                                    "Constan\u021Ba",
                                    "Covasna",
                                    "D\u00E2mbovi\u021Ba",
                                    "Dolj",
                                    "Gala\u021Bi",
                                    "Giurgiu",
                                    "Gorj",
                                    "Harghita",
                                    "Hunedoara",
                                    "Ialomi\u021Ba",
                                    "Ia\u0219i",
                                    "Ilfov",
                                    "Maramure\u021B",
                                    "Mehedin\u021Bi",
                                    "Mure\u0219",
                                    "Neam\u021B",
                                    "Olt",
                                    "Prahova",
                                    "S\u0103laj",
                                    "Satu Mare",
                                    "Sibiu",
                                    "Suceava",
                                    "Teleorman",
                                    "Timi\u0219",
                                    "Tulcea",
                                    "V\u00E2lcea",
                                    "Vaslui",
                                    "Vrancea");
                        });

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Afganistan",
                                    "Africa de Sud",
                                    "Albania",
                                    "Algeria",
                                    "Andorra",
                                    "Angola",
                                    "Antigua \u0219i Barbuda",
                                    "Arabia Saudit\u0103",
                                    "Argentina",
                                    "Armenia",
                                    "Australia",
                                    "Austria",
                                    "Azerbaidjan",
                                    "Bahamas",
                                    "Bahrain",
                                    "Bangladesh",
                                    "Barbados",
                                    "Belarus",
                                    "Belgia",
                                    "Belize",
                                    "Benin",
                                    "Bhutan",
                                    "Birmania",
                                    "Bolivia",
                                    "Bosnia \u0219i Her\u021Begovina",
                                    "Botswana",
                                    "Brazilia",
                                    "Brunei",
                                    "Bulgaria",
                                    "Burkina Faso",
                                    "Burundi",
                                    "Cambodgia",
                                    "Camerun",
                                    "Canada",
                                    "Capul Verde",
                                    "Cehia",
                                    "Republica Centrafrican\u0103",
                                    "Chile",
                                    "Republica Popular\u0103 Chinez\u0103",
                                    "Ciad",
                                    "Cipru",
                                    "Columbia",
                                    "Comore",
                                    "Republica Democrat\u0103 Congo",
                                    "Republica Congo",
                                    "Coreea de Nord",
                                    "Coreea de Sud",
                                    "Costa Rica",
                                    "Coasta de Filde\u0219",
                                    "Croa\u021Bia",
                                    "Cuba",
                                    "Danemarca",
                                    "Djibouti",
                                    "Dominica",
                                    "Republica Dominican\u0103",
                                    "Ecuador",
                                    "Egipt",
                                    "El Salvador",
                                    "Elve\u021Bia",
                                    "Emiratele Arabe Unite",
                                    "Eritreea",
                                    "Estonia",
                                    "Etiopia",
                                    "Fiji",
                                    "Filipine",
                                    "Finlanda",
                                    "Fran\u021Ba",
                                    "Gabon",
                                    "Gambia",
                                    "Georgia",
                                    "Germania",
                                    "Ghana",
                                    "Grecia",
                                    "Grenada",
                                    "Guatemala",
                                    "Guineea",
                                    "Guineea-Bissau",
                                    "Guineea Ecuatorial\u0103",
                                    "Guyana",
                                    "Haiti",
                                    "Honduras",
                                    "India",
                                    "Indonezia",
                                    "Iordania",
                                    "Irak",
                                    "Iran",
                                    "Republica Irlanda",
                                    "Islanda",
                                    "Israel",
                                    "Italia",
                                    "Jamaica",
                                    "Japonia",
                                    "Kazahstan",
                                    "Kenya",
                                    "Kirghizstan",
                                    "Kiribati",
                                    "Kuweit",
                                    "Laos",
                                    "Lesotho",
                                    "Letonia",
                                    "Liban",
                                    "Liberia",
                                    "Libia",
                                    "Liechtenstein",
                                    "Lituania",
                                    "Luxemburg",
                                    "Republica Macedonia",
                                    "Madagascar",
                                    "Malawi",
                                    "Malaezia",
                                    "Maldive",
                                    "Mali",
                                    "Malta",
                                    "Maroc",
                                    "Insulele Marshall",
                                    "Mauritania",
                                    "Mauritius",
                                    "Mexic",
                                    "Statele Federate ale Microneziei",
                                    "Republica Moldova",
                                    "Monaco",
                                    "Mongolia",
                                    "Mozambic",
                                    "Muntenegru",
                                    "Namibia",
                                    "Nauru",
                                    "Nepal",
                                    "Nicaragua",
                                    "Niger",
                                    "Nigeria",
                                    "Norvegia",
                                    "Noua Zeeland\u0103",
                                    "Olanda",
                                    "Oman",
                                    "Pakistan",
                                    "Palau",
                                    "Panama",
                                    "Papua Noua Guinee",
                                    "Paraguay",
                                    "Peru",
                                    "Polonia",
                                    "Portugalia",
                                    "Qatar",
                                    "Regatul Unit",
                                    "Rom\u00E2nia",
                                    "Rusia",
                                    "Rwanda",
                                    "Samoa",
                                    "San Marino",
                                    "S\u00E3o Tom\u00E9 \u0219i Pr\u00EDncipe",
                                    "S\u00E3o Tom\u00E9 e Pr\u00EDncipe",
                                    "Senegal",
                                    "Serbia",
                                    "Seychelles",
                                    "Sf\u00E2nta Lucia",
                                    "Sf\u00E2ntul Cristofor \u0219i Nevis",
                                    "Saint Vincent and the Grenadines",
                                    "Sierra Leone",
                                    "Singapore",
                                    "Siria",
                                    "Slovacia",
                                    "Slovenia",
                                    "Insulele Solomon",
                                    "Somalia",
                                    "Spania",
                                    "Sri Lanka",
                                    "Statele Unite ale Americii",
                                    "Sudan",
                                    "Sudanul de Sud",
                                    "Suedia",
                                    "Surinam",
                                    "Swaziland",
                                    "Tadjikistan",
                                    "Tanzania",
                                    "Thailanda",
                                    "Timorul de Est",
                                    "Togo",
                                    "Tonga",
                                    "Trinidad-Tobago",
                                    "Tunisia",
                                    "Turcia",
                                    "Turkmenistan",
                                    "Tuvalu",
                                    "Ucraina",
                                    "Uganda",
                                    "Ungaria",
                                    "Uruguay",
                                    "Uzbekistan",
                                    "Vanuatu",
                                    "Vatican",
                                    "Venezuela",
                                    "Vietnam",
                                    "Yemen",
                                    "Zambia",
                                    "Zimbabwe");
                        });

        public Object cityFormats = ZVal.arrayFromList("{{cityName}}", "Mun. {{cityName}}");

        public Object streetNameFormats =
                ZVal.arrayFromList("{{streetPrefix}} {{streetPlainName}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList(
                        "{{streetName}} {{buildingNumber}}",
                        "{{streetName}} {{buildingNumber}}",
                        "{{streetName}} {{buildingNumber}}",
                        "{{streetName}} nr. {{buildingNumber}}, bl. {{block}}, ap. {{apartmentNumber}}",
                        "{{streetName}} nr. {{buildingNumber}}, bl. {{block}}, et. {{floor}}, ap. {{apartmentNumber}}",
                        "{{streetName}} nr. {{buildingNumber}}, bl. {{block}}, sc. {{blockSegment}}, et. {{floor}}, ap. {{apartmentNumber}}");

        public Object addressFormats =
                ZVal.arrayFromList("{{streetAddress}}, {{city}}, {{county}}, CP {{postcode}}");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\ro_RO\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "apartmentNumber",
                            "block",
                            "blockSegment",
                            "buildingNumber",
                            "cityFormats",
                            "cityNames",
                            "counties",
                            "country",
                            "floor",
                            "postcode",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetPlainName",
                            "streetPrefix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/ro_RO/Address.php")
                    .addExtendsClass("Faker\\Provider\\Address")
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
