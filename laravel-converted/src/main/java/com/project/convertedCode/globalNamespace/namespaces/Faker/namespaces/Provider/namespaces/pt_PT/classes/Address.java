package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.pt_PT.classes;

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

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/pt_PT/Address.php

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
    public Object city(RuntimeEnv env, Object... args) {
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
                                                                .pt_PT
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "cities")))
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
                                                        .pt_PT
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .cities)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\pt_PT\\Address";

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
        public Object secondaryAddress(RuntimeEnv env, Object... args) {
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
                                                                            .pt_PT
                                                                            .classes
                                                                            .Address
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .secondaryAddressFormats)
                                            .value())
                            .value());
        }

        @ConvertedMethod
        public Object streetPrefix(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
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
                                                            .pt_PT
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .streetPrefix)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object streetPrefix =
                ZVal.arrayFromList("Av.", "Avenida", "R.", "Rua", "Travessa", "Largo");

        public Object streetNameFormats =
                ZVal.arrayFromList(
                        "{{streetPrefix}} {{lastName}}",
                        "{{streetPrefix}} {{firstName}} {{lastName}}",
                        "{{streetPrefix}} St. {{firstName}} {{lastName}}",
                        "{{streetPrefix}} S\u00E3o. {{firstName}}",
                        "{{streetPrefix}} de {{lastName}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList(
                        "{{streetName}}",
                        "{{streetName}}, {{buildingNumber}}",
                        "{{streetName}}, {{buildingNumber}}, {{secondaryAddress}}");

        public Object addressFormats =
                ZVal.arrayFromList("{{streetAddress}} {{postcode}} {{city}}");

        public Object cities =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Abrantes",
                                    "Agualva-Cac\u00E9m",
                                    "\u00C1gueda",
                                    "Albufeira",
                                    "Alc\u00E1cer do Sal",
                                    "Alcoba\u00E7a",
                                    "Almada",
                                    "Almeirim",
                                    "Alverca do Ribatejo",
                                    "Amadora",
                                    "Amarante",
                                    "Amora",
                                    "Anadia",
                                    "Angra do Hero\u00EDsmo",
                                    "Aveiro",
                                    "Barcelos",
                                    "Barreiro",
                                    "Beja",
                                    "Braga",
                                    "Bragan\u00E7a",
                                    "Caldas da Rainha",
                                    "Camara de Lobos",
                                    "Cantanhede",
                                    "Cartaxo",
                                    "Castelo Branco",
                                    "Chaves",
                                    "Coimbra",
                                    "Covilh\u00E3",
                                    "Elvas",
                                    "Entroncamento",
                                    "Ermesinde",
                                    "Esmoriz",
                                    "Espinho",
                                    "Esposende",
                                    "Estarreja",
                                    "Estremoz",
                                    "\u00C9vora",
                                    "Fafe",
                                    "Faro",
                                    "F\u00E1tima",
                                    "Felgueiras",
                                    "Fi\u00E3es",
                                    "Figueira da Foz",
                                    "Freamunde",
                                    "Funchal",
                                    "Fund\u00E3o",
                                    "Gafanha da Nazar\u00E9",
                                    "Gondomar",
                                    "Gouveia",
                                    "Guarda",
                                    "Guimar\u00E3es",
                                    "Horta",
                                    "\u00CDlhavo",
                                    "Lagoa",
                                    "Lagos",
                                    "Lamego",
                                    "Leiria",
                                    "Lisboa",
                                    "Lixa",
                                    "Loul\u00E9",
                                    "Loures",
                                    "Lourosa",
                                    "Macedo de Cavaleiros",
                                    "Machico",
                                    "Maia",
                                    "Mangualde",
                                    "Marco de Canaveses",
                                    "Marinha Grande",
                                    "Matosinhos",
                                    "Mealhada",
                                    "Miranda do Douro",
                                    "Mirandela",
                                    "Montemor-o-Novo",
                                    "Montijo",
                                    "Moura",
                                    "Odivelas",
                                    "Olh\u00E3o da Restaura\u00E7\u00E3o",
                                    "Oliveira de Azem\u00E9is",
                                    "Oliveira do Hospital",
                                    "Our\u00E9m",
                                    "Ovar",
                                    "Pa\u00E7os de Ferreira",
                                    "Paredes",
                                    "Penafiel",
                                    "Peniche",
                                    "Peso da R\u00E9gua",
                                    "Pinhel",
                                    "Pombal",
                                    "Ponta Delgada",
                                    "Ponte de Sor",
                                    "Portalegre",
                                    "Portim\u00E3o",
                                    "Porto",
                                    "Porto Santo",
                                    "P\u00F3voa de Santa Iria",
                                    "P\u00F3voa de Varzim",
                                    "Quarteira",
                                    "Queluz",
                                    "Ribeira Grande",
                                    "Rio Maior",
                                    "Rio Tinto",
                                    "Sacav\u00E9m",
                                    "Santa Comba D\u00E3o",
                                    "Santa Cruz",
                                    "Santa Maria da Feira",
                                    "Santana",
                                    "Santar\u00E9m",
                                    "Santiago do Cac\u00E9m",
                                    "Santo Tirso",
                                    "S\u00E3o Jo\u00E3o da Madeira",
                                    "S\u00E3o Mamede de Infesta",
                                    "Seia",
                                    "Seixal",
                                    "Set\u00FAbal",
                                    "Silves",
                                    "Sines",
                                    "Tarouca",
                                    "Tavira",
                                    "Tomar",
                                    "Tondela",
                                    "Torres Novas",
                                    "Torres Vedras",
                                    "Valbom",
                                    "Vale de Cambra",
                                    "Valongo",
                                    "Valpa\u00E7os",
                                    "Vendas Novas",
                                    "Viana do Castelo",
                                    "Vila do Conde",
                                    "Vila Franca de Xira",
                                    "Vila Nova de Famalic\u00E3o",
                                    "Vila Nova de Foz C\u00F4a",
                                    "Vila Nova de Gaia",
                                    "Vila Praia da Vit\u00F3ria",
                                    "Vila Real",
                                    "Vila Real de Santo Ant\u00F3nio",
                                    "Viseu",
                                    "Vizela");
                        });

        public Object postcode =
                ZVal.arrayFromList(
                        "%##0-###",
                        "%##0",
                        "%##1-###",
                        "%##1",
                        "%##4-###",
                        "%##4",
                        "%##5-###",
                        "%##5",
                        "%##9-###",
                        "%##9");

        public Object buildingNumber =
                ZVal.arrayFromList("n\u00BA %", "n\u00BA %%", "n\u00BA %%%", "%", "%#", "%##");

        public Object secondaryAddressFormats =
                ZVal.arrayFromList(
                        "Bloco %",
                        "Bl. %",
                        "%\u00BA Dir.",
                        "%#\u00BA Dir.",
                        "%\u00BA Dr.",
                        "%#\u00BA Dr.",
                        "%\u00BA Esq.",
                        "%#\u00BA Esq.",
                        "%\u00BA Eq.",
                        "%#\u00BA Eq.");

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Afeganist\u00E3o",
                                    "\u00C1frica do Sul",
                                    "Alb\u00E2nia",
                                    "Alemanha",
                                    "Andorra",
                                    "Angola",
                                    "Antigua e Barbuda",
                                    "Arabia Saudita",
                                    "Arg\u00E9lia",
                                    "Argentina",
                                    "Arm\u00EAnia",
                                    "Austr\u00E1lia",
                                    "\u00C1ustria",
                                    "Azerbaij\u00E3o",
                                    "Bahamas",
                                    "Bangladesh",
                                    "Barbados",
                                    "Barein",
                                    "Belize",
                                    "Benin",
                                    "Bielorr\u00FAssia",
                                    "Birm\u00E2nia",
                                    "Bol\u00EDvia",
                                    "B\u00F3snia e Herzegovina",
                                    "Botsuana",
                                    "Brasil",
                                    "Brunei",
                                    "Bulg\u00E1ria",
                                    "Burkina Faso",
                                    "Burundi",
                                    "But\u00E3o",
                                    "B\u00E9lgica",
                                    "Cabo Verde",
                                    "Camboja",
                                    "Camar\u00F5es",
                                    "Canad\u00E1",
                                    "Cazaquist\u00E3o",
                                    "Chad",
                                    "Chile",
                                    "China",
                                    "Chipre",
                                    "Col\u00F4mbia",
                                    "Comoras",
                                    "Congo",
                                    "Cor\u00E9ia do Norte",
                                    "Cor\u00E9ia do Sul",
                                    "Costa Rica",
                                    "Costa do Marfim",
                                    "Cro\u00E1cia",
                                    "Cuba",
                                    "Dinamarca",
                                    "Djibouti",
                                    "Dom\u00EAnica",
                                    "Equador",
                                    "Egito",
                                    "El Salvador",
                                    "Emirados \u00C1rabes Unidos",
                                    "Eritrea",
                                    "Eslov\u00E1quia",
                                    "Eslov\u00EAnia",
                                    "Espanha",
                                    "Estados Unidos da Am\u00E9rica",
                                    "Est\u00F3nia",
                                    "Eti\u00F3pia",
                                    "Filipinas",
                                    "Finl\u00E2ndia",
                                    "Fiji",
                                    "Fran\u00E7a",
                                    "Gab\u00E3o",
                                    "G\u00E2mbia",
                                    "Georgia",
                                    "Gana",
                                    "Granada",
                                    "Gr\u00E9cia",
                                    "Guatemala",
                                    "Guin\u00E9 Equatorial",
                                    "Guin\u00E9 Bissau",
                                    "Guiana",
                                    "Haiti",
                                    "Honduras",
                                    "Hungria",
                                    "\u00CDndia",
                                    "Indon\u00E9sia",
                                    "Iraque",
                                    "Irlanda",
                                    "Ir\u00E3",
                                    "Isl\u00E2ndia",
                                    "Ilhas Marshall",
                                    "Ilhas Maur\u00EDcio",
                                    "Ilhas Salom\u00E3o",
                                    "Ilhas Samoa",
                                    "Israel",
                                    "It\u00E1lia",
                                    "Jamaica",
                                    "Jap\u00E3o",
                                    "Jord\u00E2nia",
                                    "Kiribati",
                                    "Kwait",
                                    "Laos",
                                    "Lesoto",
                                    "Let\u00F3nia",
                                    "Lib\u00E9ria",
                                    "L\u00EDbia",
                                    "Liechtenstein",
                                    "Litu\u00E2nia",
                                    "Luxemburgo",
                                    "L\u00EDbano",
                                    "Maced\u00F3nia",
                                    "Madagascar",
                                    "Mal\u00E1sia",
                                    "Malau\u00ED",
                                    "Maldivas",
                                    "Mali",
                                    "Malta",
                                    "Marrocos",
                                    "Maurit\u00E2nia",
                                    "Micron\u00E9sia",
                                    "Mold\u00E1via",
                                    "Mong\u00F3lia",
                                    "Montenegro",
                                    "Mo\u00E7ambique",
                                    "M\u00E9xico",
                                    "M\u00F3naco",
                                    "Nam\u00EDbia",
                                    "Nauru",
                                    "Nepal",
                                    "Nicar\u00E1gua",
                                    "Nig\u00E9ria",
                                    "Noruega",
                                    "Nova Guin\u00E9",
                                    "Nova Zel\u00E2ndia",
                                    "N\u00EDger",
                                    "Om\u00E3",
                                    "Qatar",
                                    "Qu\u00EAnia",
                                    "Quirguist\u00E3o",
                                    "Paquist\u00E3o",
                                    "Palaos",
                                    "Panam\u00E1",
                                    "Papua Nova Guin\u00E9",
                                    "Paraguai",
                                    "Pa\u00EDses Baixos",
                                    "Peru",
                                    "Pol\u00F3nia",
                                    "Portugal",
                                    "Reino Unido",
                                    "Reino Unido da Gr\u00E3 Bretanha e Irlanda do Norte",
                                    "Rep\u00FAblica Centroafricana",
                                    "Rep\u00FAblica Checa",
                                    "Rep\u00FAblica Democr\u00E1tica do Congo",
                                    "Rep\u00FAblica Dominicana",
                                    "Ruanda",
                                    "Rom\u00EAnia",
                                    "R\u00FAssia",
                                    "S\u00E3o Cristov\u00E3o e Neves",
                                    "San Marino",
                                    "S\u00E3o Vicente e as Granadinas",
                                    "Santa Luzia",
                                    "S\u00E3o Tom\u00E9 e Pr\u00EDncipe",
                                    "Senegal",
                                    "S\u00E9rvia",
                                    "Seychelles",
                                    "Serra Leoa",
                                    "Singapura",
                                    "S\u00EDria",
                                    "Som\u00E1lia",
                                    "Sri Lanka",
                                    "Suazil\u00E2ndia",
                                    "Sud\u00E3o",
                                    "Su\u00E9cia",
                                    "Sui\u00E7a",
                                    "Suriname",
                                    "Tail\u00E2ndia",
                                    "Tanz\u00E2nia",
                                    "Tajiquist\u00E3o",
                                    "Timor Leste",
                                    "Togo",
                                    "Tonga",
                                    "Trinidad e Tobago",
                                    "Turcomenist\u00E3o",
                                    "Turquia",
                                    "Tuvalu",
                                    "Tun\u00EDsia",
                                    "Ucr\u00E2nia",
                                    "Uganda",
                                    "Uruguai",
                                    "Uzbequist\u00E3o",
                                    "Vaticano",
                                    "Vanuatu",
                                    "Venezuela",
                                    "Vietn\u00E3",
                                    "Yemen",
                                    "Z\u00E2mbia",
                                    "Zimb\u00E1bue");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\pt_PT\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "buildingNumber",
                            "cities",
                            "country",
                            "postcode",
                            "secondaryAddressFormats",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetPrefix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/pt_PT/Address.php")
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
