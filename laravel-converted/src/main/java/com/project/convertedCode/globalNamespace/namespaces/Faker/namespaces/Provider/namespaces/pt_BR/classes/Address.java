package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.pt_BR.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/pt_BR/Address.php

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

    public static final Object CONST_class = "Faker\\Provider\\pt_BR\\Address";

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
                                                            .pt_BR
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .streetPrefix)
                            .value());
        }

        @ConvertedMethod
        public Object cityPrefix(RuntimeEnv env, Object... args) {
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
                                                            .pt_BR
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .cityPrefix)
                            .value());
        }

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
                                                                            .pt_BR
                                                                            .classes
                                                                            .Address
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .secondaryAddressFormats)
                                            .value())
                            .value());
        }

        @ConvertedMethod
        public Object state(RuntimeEnv env, Object... args) {
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
                                                            .pt_BR
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .state)
                            .value());
        }

        @ConvertedMethod
        public Object stateAbbr(RuntimeEnv env, Object... args) {
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
                                                            .pt_BR
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .stateAbbr)
                            .value());
        }

        @ConvertedMethod
        public Object region(RuntimeEnv env, Object... args) {
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
                                                            .pt_BR
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .region)
                            .value());
        }

        @ConvertedMethod
        public Object regionAbbr(RuntimeEnv env, Object... args) {
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
                                                            .pt_BR
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .regionAbbr)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object cityPrefix = ZVal.arrayFromList("S\u00E3o", "Porto", "Vila", "Santa");

        public Object citySuffix = ZVal.arrayFromList("do Norte", "do Leste", "do Sul", "d'Oeste");

        public Object streetPrefix =
                ZVal.arrayFromList("Av.", "Avenida", "R.", "Rua", "Travessa", "Largo");

        public Object buildingNumber = ZVal.arrayFromList("#####", "####", "###", "##", "#");

        public Object postcode = ZVal.arrayFromList("#####-###");

        public Object state =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Acre",
                                    "Alagoas",
                                    "Amap\u00E1",
                                    "Amazonas",
                                    "Bahia",
                                    "Cear\u00E1",
                                    "Distrito Federal",
                                    "Esp\u00EDrito Santo",
                                    "Goi\u00E1s",
                                    "Maranh\u00E3o",
                                    "Mato Grosso",
                                    "Mato Grosso do Sul",
                                    "Minas Gerais",
                                    "Par\u00E1",
                                    "Para\u00EDba",
                                    "Paran\u00E1",
                                    "Pernambuco",
                                    "Piau\u00ED",
                                    "Rio de Janeiro",
                                    "Rio Grande do Norte",
                                    "Rio Grande do Sul",
                                    "Rond\u00F4nia",
                                    "Roraima",
                                    "Santa Catarina",
                                    "S\u00E3o Paulo",
                                    "Sergipe",
                                    "Tocantins");
                        });

        public Object stateAbbr =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA",
                                    "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN",
                                    "RS", "RO", "RR", "SC", "SP", "SE", "TO");
                        });

        public Object region =
                ZVal.arrayFromList("Centro-Oeste", "Nordeste", "Norte", "Sudeste", "Sul");

        public Object regionAbbr = ZVal.arrayFromList("CO", "N", "NE", "SE", "S");

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
                                    "Est\u00F4nia",
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
                                    "Let\u00F4nia",
                                    "Lib\u00E9ria",
                                    "L\u00EDbia",
                                    "Liechtenstein",
                                    "Litu\u00E2nia",
                                    "Luxemburgo",
                                    "L\u00EDbano",
                                    "Maced\u00F4nia",
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
                                    "M\u00F4naco",
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
                                    "Pol\u00F4nia",
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
                                    "San Crist\u00F5vao e Neves",
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

        public Object cityFormats =
                ZVal.arrayFromList(
                        "{{cityPrefix}} {{firstName}} {{citySuffix}}",
                        "{{cityPrefix}} {{firstName}}",
                        "{{firstName}} {{citySuffix}}",
                        "{{lastName}} {{citySuffix}}");

        public Object streetNameFormats =
                ZVal.arrayFromList(
                        "{{streetPrefix}} {{firstName}}",
                        "{{streetPrefix}} {{lastName}}",
                        "{{streetPrefix}} {{firstName}} {{lastName}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList(
                        "{{streetName}}, {{buildingNumber}}",
                        "{{streetName}}, {{buildingNumber}}. {{secondaryAddress}}");

        public Object addressFormats =
                ZVal.arrayFromList("{{postcode}}, {{streetAddress}}\n{{city}} - {{stateAbbr}}");

        public Object secondaryAddressFormats =
                ZVal.arrayFromList(
                        "Bloco A",
                        "Bloco B",
                        "Bloco C",
                        "Bc. # Ap. ##",
                        "Bc. ## Ap. ##",
                        "#\u00BA Andar",
                        "##\u00BA Andar",
                        "###\u00BA Andar",
                        "Apto #",
                        "Apto ##",
                        "Apto ###",
                        "Apto ####",
                        "F",
                        "Fundos",
                        "Anexo");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\pt_BR\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "buildingNumber",
                            "cityFormats",
                            "cityPrefix",
                            "citySuffix",
                            "country",
                            "postcode",
                            "region",
                            "regionAbbr",
                            "secondaryAddressFormats",
                            "state",
                            "stateAbbr",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetPrefix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/pt_BR/Address.php")
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
