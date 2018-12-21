package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.es_ES.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/es_ES/Address.php

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

    public static final Object CONST_class = "Faker\\Provider\\es_ES\\Address";

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
                                                            .es_ES
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
                                                            .es_ES
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
                                                                            .es_ES
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
                                                            .es_ES
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .state)
                            .value());
        }

        @ConvertedMethod
        public Object community(RuntimeEnv env, Object... args) {
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
                                                            .es_ES
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .community)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object cityPrefix =
                ZVal.arrayFromList(
                        "San", "Vall", "L'", "Villa", "El", "Los", "La", "Las", "O", "A", "Os",
                        "As");

        public Object citySuffix =
                ZVal.arrayFromList(
                        "del Vall\u00E8s",
                        "del Pened\u00E8s",
                        "del Bages",
                        "de Ulla",
                        "de Lemos",
                        "del Mirador",
                        "de Arriba",
                        "de la Sierra",
                        "del Barco",
                        "de San Pedro",
                        "del Pozo",
                        "del Puerto",
                        "de las Torres",
                        "Alta",
                        "Baja",
                        "Medio");

        public Object buildingNumber = ZVal.arrayFromList("###", "##", "#");

        public Object streetPrefix =
                ZVal.arrayFromList(
                        "Calle",
                        "Avenida",
                        "Plaza",
                        "Paseo",
                        "Ronda",
                        "Traves\u00EDa",
                        "Camino",
                        "Carrer",
                        "Avinguda",
                        "Pla\u00E7a",
                        "Passeig",
                        "Travessera",
                        "R\u00FAa",
                        "Praza",
                        "Ruela",
                        "Cami\u00F1o");

        public Object postcode = ZVal.arrayFromList("#####");

        public Object community =
                ZVal.arrayFromList(
                        "Andaluc\u00EDa",
                        "Arag\u00F3n",
                        "Principado de Asturias",
                        "Illes Balears",
                        "Canarias",
                        "Cantabria",
                        "Castilla y Le\u00F3n",
                        "Castilla - La Mancha",
                        "Catalu\u00F1a",
                        "Comunitat Valenciana",
                        "Extremadura",
                        "Galicia",
                        "Comunidad de Madrid",
                        "Regi\u00F3n de Murcia",
                        "Comunidad Foral de Navarra",
                        "Pa\u00EDs Vasco",
                        "La Rioja",
                        "Ceuta",
                        "Melilla");

        public Object state =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "A Coru\u00F1a",
                                    "\u00C1lava",
                                    "Albacete",
                                    "Alicante",
                                    "Almer\u00EDa",
                                    "Asturias",
                                    "\u00C1vila",
                                    "Badajoz",
                                    "Barcelona",
                                    "Burgos",
                                    "C\u00E1ceres",
                                    "C\u00E1diz",
                                    "Cantabria",
                                    "Castell\u00F3n",
                                    "Ceuta",
                                    "Ciudad Real",
                                    "Cuenca",
                                    "C\u00F3rdoba",
                                    "Girona",
                                    "Granada",
                                    "Guadalajara",
                                    "Guipuzkoa",
                                    "Huelva",
                                    "Huesca",
                                    "Illes Balears",
                                    "Ja\u00E9n",
                                    "La Rioja",
                                    "Las Palmas",
                                    "Le\u00F3n",
                                    "Lleida",
                                    "Lugo",
                                    "M\u00E1laga",
                                    "Madrid",
                                    "Melilla",
                                    "Murcia",
                                    "Navarra",
                                    "Ourense",
                                    "Palencia",
                                    "Pontevedra",
                                    "Salamanca",
                                    "Segovia",
                                    "Sevilla",
                                    "Soria",
                                    "Santa Cruz de Tenerife",
                                    "Tarragona",
                                    "Teruel",
                                    "Toledo",
                                    "Valencia",
                                    "Valladolid",
                                    "Vizcaya",
                                    "Zamora",
                                    "Zaragoza");
                        });

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Afganist\u00E1n",
                                    "Albania",
                                    "Alemania",
                                    "Andorra",
                                    "Angola",
                                    "Antigua y Barbuda",
                                    "Arabia Saud\u00ED",
                                    "Argelia",
                                    "Argentina",
                                    "Armenia",
                                    "Australia",
                                    "Austria",
                                    "Azerbaiy\u00E1n",
                                    "Bahamas",
                                    "Banglad\u00E9s",
                                    "Barbados",
                                    "Bar\u00E9in",
                                    "Belice",
                                    "Ben\u00EDn",
                                    "Bielorrusia",
                                    "Birmania",
                                    "Bolivia",
                                    "Bosnia-Herzegovina",
                                    "Botsuana",
                                    "Brasil",
                                    "Brun\u00E9i Darusalam",
                                    "Bulgaria",
                                    "Burkina Faso",
                                    "Burundi",
                                    "But\u00E1n",
                                    "B\u00E9lgica",
                                    "Cabo Verde",
                                    "Camboya",
                                    "Camer\u00FAn",
                                    "Canad\u00E1",
                                    "Catar",
                                    "Chad",
                                    "Chile",
                                    "China",
                                    "Chipre",
                                    "Ciudad del Vaticano",
                                    "Colombia",
                                    "Comoras",
                                    "Congo",
                                    "Corea del Norte",
                                    "Corea del Sur",
                                    "Costa Rica",
                                    "Costa de Marfil",
                                    "Croacia",
                                    "Cuba",
                                    "Dinamarca",
                                    "Dominica",
                                    "Ecuador",
                                    "Egipto",
                                    "El Salvador",
                                    "Emiratos \u00C1rabes Unidos",
                                    "Eritrea",
                                    "Eslovaquia",
                                    "Eslovenia",
                                    "Espa\u00F1a",
                                    "Estados Unidos de Am\u00E9rica",
                                    "Estonia",
                                    "Etiop\u00EDa",
                                    "Filipinas",
                                    "Finlandia",
                                    "Fiyi",
                                    "Francia",
                                    "Gab\u00F3n",
                                    "Gambia",
                                    "Georgia",
                                    "Ghana",
                                    "Granada",
                                    "Grecia",
                                    "Guatemala",
                                    "Guinea",
                                    "Guinea Ecuatorial",
                                    "Guinea-Bis\u00E1u",
                                    "Guyana",
                                    "Hait\u00ED",
                                    "Honduras",
                                    "Hungr\u00EDa",
                                    "India",
                                    "Indonesia",
                                    "Irak",
                                    "Irlanda",
                                    "Ir\u00E1n",
                                    "Islandia",
                                    "Islas Marshall",
                                    "Islas Salom\u00F3n",
                                    "Israel",
                                    "Italia",
                                    "Jamaica",
                                    "Jap\u00F3n",
                                    "Jordania",
                                    "Kazajist\u00E1n",
                                    "Kenia",
                                    "Kirguist\u00E1n",
                                    "Kiribati",
                                    "Kuwait",
                                    "Laos",
                                    "Lesoto",
                                    "Letonia",
                                    "Liberia",
                                    "Libia",
                                    "Liechtenstein",
                                    "Lituania",
                                    "Luxemburgo",
                                    "L\u00EDbano",
                                    "Macedonia",
                                    "Madagascar",
                                    "Malasia",
                                    "Malaui",
                                    "Maldivas",
                                    "Mali",
                                    "Malta",
                                    "Marruecos",
                                    "Mauricio",
                                    "Mauritania",
                                    "Micronesia",
                                    "Moldavia",
                                    "Mongolia",
                                    "Montenegro",
                                    "Mozambique",
                                    "M\u00E9xico",
                                    "M\u00F3naco",
                                    "Namibia",
                                    "Nauru",
                                    "Nepal",
                                    "Nicaragua",
                                    "Nigeria",
                                    "Noruega",
                                    "Nueva Zelanda",
                                    "N\u00EDger",
                                    "Om\u00E1n",
                                    "Pakist\u00E1n",
                                    "Palaos",
                                    "Panam\u00E1",
                                    "Pap\u00FAa Nueva Guinea",
                                    "Paraguay",
                                    "Pa\u00EDses Bajos",
                                    "Per\u00FA",
                                    "Polonia",
                                    "Portugal",
                                    "Reino Unido",
                                    "Reino Unido de Gran Breta\u00F1a e Irlanda del Norte",
                                    "Rep\u00FAblica Centroafricana",
                                    "Rep\u00FAblica Checa",
                                    "Rep\u00FAblica Democr\u00E1tica del Congo",
                                    "Rep\u00FAblica Dominicana",
                                    "Ruanda",
                                    "Ruman\u00EDa",
                                    "Rusia",
                                    "Samoa",
                                    "San Crist\u00F3bal y Nieves",
                                    "San Marino",
                                    "San Vicente y las Granadinas",
                                    "Santa Luc\u00EDa",
                                    "Santo Tom\u00E9 y Pr\u00EDncipe",
                                    "Senegal",
                                    "Serbia",
                                    "Seychelles",
                                    "Sierra Leona",
                                    "Singapur",
                                    "Siria",
                                    "Somalia",
                                    "Sri Lanka",
                                    "Suazilandia",
                                    "Sud\u00E1frica",
                                    "Sud\u00E1n",
                                    "Suecia",
                                    "Suiza",
                                    "Surinam",
                                    "Tailandia",
                                    "Tanzania",
                                    "Tayikist\u00E1n",
                                    "Timor Oriental",
                                    "Togo",
                                    "Tonga",
                                    "Trinidad y Tobago",
                                    "Turkmenist\u00E1n",
                                    "Turqu\u00EDa",
                                    "Tuvalu",
                                    "T\u00FAnez",
                                    "Ucrania",
                                    "Uganda",
                                    "Uruguay",
                                    "Uzbekist\u00E1n",
                                    "Vanuatu",
                                    "Venezuela",
                                    "Vietnam",
                                    "Yemen",
                                    "Yibuti",
                                    "Zambia",
                                    "Zimbabue");
                        });

        public Object cityFormats =
                ZVal.arrayFromList(
                        "{{cityPrefix}} {{lastName}} {{citySuffix}}",
                        "{{cityPrefix}} {{lastName}}",
                        "{{lastName}} {{citySuffix}}");

        public Object streetNameFormats =
                ZVal.arrayFromList(
                        "{{streetPrefix}} {{firstName}}", "{{streetPrefix}} {{lastName}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList("{{streetName}}, {{buildingNumber}}, {{secondaryAddress}}");

        public Object addressFormats =
                ZVal.arrayFromList("{{streetAddress}}, {{postcode}}, {{city}}");

        public Object secondaryAddressFormats =
                ZVal.arrayFromList(
                        "Bajos",
                        "\u00C1tico #\u00BA",
                        "Entre suelo #\u00BA",
                        "Bajo #\u00BA",
                        "#\u00BA",
                        "#\u00BA A",
                        "#\u00BA B",
                        "#\u00BA C",
                        "#\u00BA D",
                        "#\u00BA E",
                        "#\u00BA F",
                        "##\u00BA A",
                        "##\u00BA B",
                        "##\u00BA C",
                        "##\u00BA D",
                        "##\u00BA E",
                        "##\u00BA F",
                        "#\u00BA #\u00BA",
                        "##\u00BA #\u00BA");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\es_ES\\Address")
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
                            "community",
                            "country",
                            "postcode",
                            "secondaryAddressFormats",
                            "state",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetPrefix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/es_ES/Address.php")
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
