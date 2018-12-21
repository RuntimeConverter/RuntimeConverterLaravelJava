package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.fr_CA.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/fr_CA/Address.php

*/

public class Address
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .namespaces
                .fr_FR
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

    public static final Object CONST_class = "Faker\\Provider\\fr_CA\\Address";

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
                    .namespaces
                    .fr_FR
                    .classes
                    .Address
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

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
                                                            .fr_CA
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .cityPrefix)
                            .value());
        }

        @ConvertedMethod
        public Object citySuffix(RuntimeEnv env, Object... args) {
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
                                                            .fr_CA
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .citySuffix)
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
                                                                            .fr_CA
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
                                                            .fr_CA
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
                                                            .fr_CA
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .stateAbbr)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object cityPrefix = ZVal.arrayFromList("Saint-", "Sainte-", "St-", "Ste-");

        public Object citySuffix =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "-des-Sables",
                                    "-sur-Mer",
                                    "-des-Neiges",
                                    "-des-Sept-Douleurs",
                                    "-du-Portage",
                                    "-du-Loup",
                                    "-des-Lacs",
                                    "-de-Lessard",
                                    "-de-Kamourasca",
                                    "-de-T\u00E9miscouata",
                                    "-de-Ladri\u00E8re",
                                    "-de-Rimouski",
                                    "-de-Rivi\u00E8re-du-Loup",
                                    "-du-Lac",
                                    "-du-Ha! Ha!",
                                    "-du-Lac-Long",
                                    "-de-Rioux",
                                    "-du-Squatec",
                                    "-de-M\u00E9tis",
                                    "-d'Ixworth",
                                    "-de-la-Croix",
                                    "-de-Matane",
                                    "-du-Lac-Humqui",
                                    "-de-M\u00E9rici",
                                    "-de-la-Pocati\u00E8re",
                                    "-sur-le-Lac",
                                    "-de-Lorette",
                                    "-du-Lac-Saint-Jean",
                                    "-de-Bourget",
                                    "-de-Falardeau",
                                    "-les-Plaines",
                                    "-de-Sales",
                                    "-de-Taillon",
                                    "-de-Milot",
                                    "-du-Nord",
                                    "-aux-Coudres",
                                    "-des-Anges",
                                    "-de-Desmaures",
                                    "-les-Neiges",
                                    "-de-l'\u00CEle-d'Orl\u00E9ans",
                                    "-de-Valcartier",
                                    "-de-Portneuf",
                                    "-du-Cap-Tourmente",
                                    "-des-Carri\u00E8res",
                                    "-des-Caps",
                                    "-de-Beaupr\u00E9",
                                    "-de-Laval",
                                    "-de-la-Jacques-Cartier",
                                    "-d'Auvergne",
                                    "-de-Monteauban",
                                    "-du-Mont-Carmel",
                                    "-des-Monts",
                                    "-de-Maskinong\u00E9",
                                    "-de-Caxton",
                                    "-des-Gr\u00E8s",
                                    "-le-Grand",
                                    "-de-Vincennes",
                                    "-du-Parc",
                                    "-de-Champlain",
                                    "-de-M\u00E9kinac",
                                    "-de-Pr\u00E9mont",
                                    "-de-la-P\u00E9rade",
                                    "-de-Batiscan",
                                    "-Ouest",
                                    "-Est",
                                    "-Sud",
                                    "-Nord",
                                    "-des-Bois",
                                    "-de-Woburn",
                                    "-de-Brompton",
                                    "-de-Bolton",
                                    "-de-Windsor",
                                    "-de-Clifton",
                                    "-de-Paquette",
                                    "-de-la-Rochelle",
                                    "-de-Hatley",
                                    "-de-Whitton",
                                    "-de-Bellevue",
                                    "-de-Buckland",
                                    "-des-Pins",
                                    "-du-Rosaire",
                                    "-d'Issoudun",
                                    "-de-J\u00E9sus",
                                    "-d'Irlande",
                                    "-de-l'Isle-aux-Grues",
                                    "-de-Tilly",
                                    "-de-Lellis",
                                    "-de-Bellechasse",
                                    "-de-Lessard",
                                    "-de-L'Islet",
                                    "-de-Lotbini\u00E8re",
                                    "-de-Beauce",
                                    "-de-Forsyth",
                                    "-de-Panet",
                                    "-de-la-Rivi\u00E8re-du-Sud",
                                    "-de-Dorset",
                                    "-de-Shenley",
                                    "-de-Leeds",
                                    "-de-Wolfestown",
                                    "-de-Joly",
                                    "-de-Br\u00E9beuf",
                                    "-de-Coleraine",
                                    "-des-\u00C9rables",
                                    "-Breteni\u00E8res",
                                    "-de-Lauzon",
                                    "-de-Standon",
                                    "-de-Gonzague",
                                    "-de-Beaurivage",
                                    "-de-Dorchester",
                                    "-de-Cranbourne",
                                    "-de-Broughton",
                                    "-de-la-Rivi\u00E8re-du-Sud",
                                    "-des-Aulnaies",
                                    "-les-Mines",
                                    "-de-Lotbini\u00E8re",
                                    "-de-Patton",
                                    "-sur-Rivi\u00E8re-du-Sud",
                                    "-de-Beauregard",
                                    "-de-Watford");
                        });

        public Object cityFormats =
                ZVal.arrayFromList(
                        "{{cityPrefix}}{{firstName}}{{citySuffix}}", "{{cityPrefix}}{{firstName}}");

        public Object buildingNumber = ZVal.arrayFromList("#####", "####", "###", "##", "#");

        public Object streetSuffix =
                ZVal.arrayFromList(
                        "Autoroute", "Avenue", "Boulevard", "Chemin", "Route", "Rue", "Pont");

        public Object postcode = ZVal.arrayFromList("?#? #?#", "?#?#?#");

        public Object streetNameFormats =
                ZVal.arrayFromList(
                        "{{streetSuffix}} {{firstName}}", "{{streetSuffix}} {{lastName}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList(
                        "{{buildingNumber}} {{streetName}}",
                        "{{buildingNumber}} {{streetName}} {{secondaryAddress}}");

        public Object addressFormats =
                ZVal.arrayFromList("{{streetAddress}}, {{city}}, {{stateAbbr}} {{postcode}}");

        public Object secondaryAddressFormats =
                ZVal.arrayFromList("Apt. ###", "Suite ###", "Bureau ###");

        public Object state =
                ZVal.arrayFromList(
                        "Alberta",
                        "Colombie-Brittanique",
                        "Manitoba",
                        "Nouveau-Brunswick",
                        "Terre-Neuve-et-Labrador",
                        "Nouvelle-\u00C9cosse",
                        "Ontario",
                        "\u00CEle-du-Prince-\u00C9douard",
                        "Qu\u00E9bec",
                        "Saskatchewan");

        public Object stateAbbr =
                ZVal.arrayFromList("AB", "BC", "MB", "NB", "NL", "NS", "ON", "PE", "QC", "SK");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\fr_CA\\Address")
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
                            "postcode",
                            "secondaryAddressFormats",
                            "state",
                            "stateAbbr",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetSuffix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/fr_CA/Address.php")
                    .addExtendsClass("Faker\\Provider\\fr_FR\\Address")
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
