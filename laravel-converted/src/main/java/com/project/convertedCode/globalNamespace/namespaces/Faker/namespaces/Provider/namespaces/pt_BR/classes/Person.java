package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.pt_BR.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.pt_BR.functions.check_digit;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/pt_BR/Person.php

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

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "formatted",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object cpf(RuntimeEnv env, Object... args) {
        Object formatted = assignParameter(args, 0, true);
        if (null == formatted) {
            formatted = true;
        }
        Object n = null;
        n =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "numerify",
                        Person.class,
                        "#########");
        n = toStringR(n, env) + toStringR(check_digit.f.env(env).call(n).value(), env);
        n = toStringR(n, env) + toStringR(check_digit.f.env(env).call(n).value(), env);
        return ZVal.assign(
                ZVal.isTrue(formatted)
                        ? NamespaceGlobal.vsprintf
                                .env(env)
                                .call(
                                        "%d%d%d.%d%d%d.%d%d%d-%d%d",
                                        NamespaceGlobal.str_split.env(env).call(n).value())
                                .value()
                        : n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "formatted",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object rg(RuntimeEnv env, Object... args) {
        Object formatted = assignParameter(args, 0, true);
        if (null == formatted) {
            formatted = true;
        }
        Object n = null;
        n =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "numerify",
                        Person.class,
                        "########");
        n = toStringR(n, env) + toStringR(check_digit.f.env(env).call(n).value(), env);
        return ZVal.assign(
                ZVal.isTrue(formatted)
                        ? NamespaceGlobal.vsprintf
                                .env(env)
                                .call(
                                        "%d%d.%d%d%d.%d%d%d-%s",
                                        NamespaceGlobal.str_split.env(env).call(n).value())
                                .value()
                        : n);
    }

    public static final Object CONST_class = "Faker\\Provider\\pt_BR\\Person";

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

        @ConvertedMethod
        public Object suffix(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
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
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .suffix)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object maleNameFormats =
                ZVal.arrayFromList(
                        "{{firstNameMale}} {{lastName}}",
                        "{{firstNameMale}} {{firstNameMale}} {{lastName}}",
                        "{{firstNameMale}} {{lastName}} {{lastName}}",
                        "{{titleMale}} {{firstNameMale}} {{lastName}}",
                        "{{titleMale}} {{firstNameMale}} {{firstNameMale}} {{lastName}}",
                        "{{titleMale}} {{firstNameMale}} {{lastName}} {{lastName}}",
                        "{{firstNameMale}} {{lastName}} {{suffix}}",
                        "{{firstNameMale}} {{firstNameMale}} {{lastName}} {{suffix}}",
                        "{{firstNameMale}} {{lastName}} {{lastName}} {{suffix}}",
                        "{{titleMale}} {{firstNameMale}} {{lastName}} {{suffix}}",
                        "{{titleMale}} {{firstNameMale}} {{firstNameMale}} {{lastName}} {{suffix}}",
                        "{{titleMale}} {{firstNameMale}} {{lastName}} {{lastName}} {{suffix}}");

        public Object femaleNameFormats =
                ZVal.arrayFromList(
                        "{{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{lastName}} {{lastName}}",
                        "{{titleFemale}} {{firstNameFemale}} {{lastName}}",
                        "{{titleFemale}} {{firstNameFemale}} {{firstNameFemale}} {{lastName}}",
                        "{{titleFemale}} {{firstNameFemale}} {{lastName}} {{lastName}}",
                        "{{firstNameFemale}} {{lastName}} {{suffix}}",
                        "{{firstNameFemale}} {{firstNameFemale}} {{lastName}} {{suffix}}",
                        "{{firstNameFemale}} {{lastName}} {{lastName}} {{suffix}}",
                        "{{titleFemale}} {{firstNameFemale}} {{lastName}} {{suffix}}",
                        "{{titleFemale}} {{firstNameFemale}} {{firstNameFemale}} {{lastName}} {{suffix}}",
                        "{{titleFemale}} {{firstNameFemale}} {{lastName}} {{lastName}} {{suffix}}");

        public Object firstNameMale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Aaron",
                                    "Adriano",
                                    "Alan",
                                    "Alexandre",
                                    "Alonso",
                                    "Anderson",
                                    "Andres",
                                    "Ant\u00F4nio",
                                    "Benjamin",
                                    "Bruno",
                                    "Camilo",
                                    "Carlos",
                                    "Christian",
                                    "Christopher",
                                    "Crist\u00F3v\u00E3o",
                                    "Daniel",
                                    "Dante",
                                    "David",
                                    "Diego",
                                    "Eduardo",
                                    "Elias",
                                    "Emanuel",
                                    "Emiliano",
                                    "Em\u00EDlio",
                                    "Est\u00EAv\u00E3o",
                                    "Evandro",
                                    "Everton",
                                    "Felipe",
                                    "Fernando",
                                    "Francisco",
                                    "Franco",
                                    "F\u00E1bio",
                                    "Gabriel",
                                    "Gian",
                                    "Guilherme",
                                    "Gustavo",
                                    "Henrique",
                                    "Hernani",
                                    "Hor\u00E1cio",
                                    "Hugo",
                                    "Ian",
                                    "In\u00E1cio",
                                    "Isaac",
                                    "Ivan",
                                    "Jer\u00F4nimo",
                                    "Joaquin",
                                    "Jorge",
                                    "Josu\u00E9",
                                    "Jos\u00E9",
                                    "Jo\u00E3o",
                                    "Kevin",
                                    "Leandro",
                                    "Leonardo",
                                    "Lucas",
                                    "Luciano",
                                    "Luis",
                                    "Manuel",
                                    "Mateus",
                                    "Matias",
                                    "Miguel",
                                    "M\u00E1rio",
                                    "M\u00E1ximo",
                                    "Noel",
                                    "Pablo",
                                    "Paulo",
                                    "Pedro",
                                    "Rafael",
                                    "Ricardo",
                                    "Rodrigo",
                                    "Samuel",
                                    "Santiago",
                                    "Simon",
                                    "S\u00E9rgio",
                                    "Thales",
                                    "Thiago",
                                    "Tom\u00E1s",
                                    "Valentin",
                                    "Vicente",
                                    "Agostinho",
                                    "Demian",
                                    "Giovane",
                                    "J\u00E1como",
                                    "Martinho",
                                    "Maximiano",
                                    "Natal",
                                    "Sebasti\u00E3o",
                                    "Sim\u00E3o",
                                    "Teobaldo",
                                    "Ziraldo");
                        });

        public Object firstNameFemale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Abril",
                                    "Adriana",
                                    "Agustina",
                                    "Alessandra",
                                    "Alexa",
                                    "Allison",
                                    "Alma",
                                    "Amanda",
                                    "Am\u00E9lia",
                                    "Ana",
                                    "Andrea",
                                    "Antonieta",
                                    "Ariadna",
                                    "Ariana",
                                    "Ashley",
                                    "Beatriz",
                                    "Bianca",
                                    "Camila",
                                    "Carla",
                                    "Carolina",
                                    "Catarina",
                                    "Clara",
                                    "Daniela",
                                    "Elizabeth",
                                    "Em\u00EDlia",
                                    "Fabiana",
                                    "F\u00E1tima",
                                    "Gabriela",
                                    "Giovana",
                                    "Helena",
                                    "Irene",
                                    "Isabel",
                                    "Isabella",
                                    "Isadora",
                                    "Ivana",
                                    "Jasmin",
                                    "Joana",
                                    "Josefina",
                                    "Juliana",
                                    "Julieta",
                                    "J\u00FAlia",
                                    "Ketlin",
                                    "Laura",
                                    "Luana",
                                    "Luara",
                                    "Luciana",
                                    "Luna",
                                    "Luzia",
                                    "Madalena",
                                    "Mait\u00EA",
                                    "Malena",
                                    "Manuela",
                                    "Mariana",
                                    "Mel",
                                    "Melissa",
                                    "Mia",
                                    "Micaela",
                                    "Michele",
                                    "Miranda",
                                    "Nat\u00E1lia",
                                    "Nicole",
                                    "Noel\u00ED",
                                    "Norma",
                                    "N\u00E1dia",
                                    "Ol\u00EDvia",
                                    "Ornela",
                                    "Paula",
                                    "Paulina",
                                    "P\u00E2mela",
                                    "Rafaela",
                                    "Rebeca",
                                    "Regina",
                                    "Renata",
                                    "Sabrina",
                                    "Salom\u00E9",
                                    "Samanta",
                                    "Sara",
                                    "Silvana",
                                    "Sofia",
                                    "Sophie",
                                    "Suzana",
                                    "Ta\u00EDs",
                                    "T\u00E1bata",
                                    "Valentina",
                                    "Val\u00E9ria",
                                    "Violeta",
                                    "Vit\u00F3ria",
                                    "Abgail",
                                    "Const\u00E2ncia",
                                    "Hort\u00EAncia",
                                    "Tess\u00E1lia",
                                    "Thalissa");
                        });

        public Object lastName =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Abreu",
                                    "Azevedo",
                                    "Aguiar",
                                    "Arag\u00E3o",
                                    "Assun\u00E7\u00E3o",
                                    "Aranda",
                                    "\u00C1vila",
                                    "Balestero",
                                    "Barreto",
                                    "Barros",
                                    "Batista",
                                    "Bezerra",
                                    "Beltr\u00E3o",
                                    "Benites",
                                    "Bittencourt",
                                    "Branco",
                                    "Bonilha",
                                    "Brito",
                                    "Burgos",
                                    "Caldeira",
                                    "Camacho",
                                    "Campos",
                                    "Carmona",
                                    "Carrara",
                                    "Casanova",
                                    "Chaves",
                                    "Cervantes",
                                    "Cola\u00E7o",
                                    "Cordeiro",
                                    "Corona",
                                    "Correia",
                                    "Cort\u00EAs",
                                    "Cruz",
                                    "D'\u00E1vila",
                                    "Delatorre",
                                    "Delgado",
                                    "Delvalle",
                                    "Dias",
                                    "Domingues",
                                    "Dominato",
                                    "Duarte",
                                    "Escobar",
                                    "Espinoza",
                                    "Esteves",
                                    "Estrada",
                                    "Faria",
                                    "Faro",
                                    "Feliciano",
                                    "Ferminiano",
                                    "Fernandes",
                                    "Ferraz",
                                    "Ferreira",
                                    "Fidalgo",
                                    "Furtado",
                                    "Ferreira",
                                    "Flores",
                                    "Fonseca",
                                    "Franco",
                                    "Fontes",
                                    "Galindo",
                                    "Galhardo",
                                    "Galv\u00E3o",
                                    "Garcia",
                                    "Gil",
                                    "God\u00F3i",
                                    "Gomes",
                                    "Gon\u00E7alves",
                                    "Grego",
                                    "Guerra",
                                    "Gusm\u00E3o",
                                    "Jimenes",
                                    "Leal",
                                    "Leon",
                                    "Lira",
                                    "Lovato",
                                    "Lozano",
                                    "Lutero",
                                    "Madeira",
                                    "Maldonado",
                                    "Mar\u00E9s",
                                    "Marin",
                                    "Marinho",
                                    "Marques",
                                    "Martines",
                                    "Mascarenhas",
                                    "Matias",
                                    "Matos",
                                    "Maia",
                                    "Medina",
                                    "Meireles",
                                    "Mendes",
                                    "Mendon\u00E7a",
                                    "Molina",
                                    "Montenegro",
                                    "Neves",
                                    "Oliveira",
                                    "Ortega",
                                    "Ortiz",
                                    "Quintana",
                                    "Queir\u00F3s",
                                    "Pacheco",
                                    "Padilha",
                                    "Padr\u00E3o",
                                    "Paes",
                                    "Paz",
                                    "Pedrosa",
                                    "Pena",
                                    "Pereira",
                                    "Perez",
                                    "Prado",
                                    "Pontes",
                                    "Quintana",
                                    "Queir\u00F3s",
                                    "Ramires",
                                    "Ramos",
                                    "Rangel",
                                    "Rezende",
                                    "Reis",
                                    "Rico",
                                    "Rios",
                                    "Rivera",
                                    "Rocha",
                                    "Rodrigues",
                                    "Romero",
                                    "Roque",
                                    "Rosa",
                                    "Salas",
                                    "Salazar",
                                    "Sales",
                                    "Salgado",
                                    "Sanches",
                                    "Sandoval",
                                    "Santacruz",
                                    "Santana",
                                    "Santiago",
                                    "Saraiva",
                                    "Sep\u00FAlveda",
                                    "Serna",
                                    "Serra",
                                    "Serrano",
                                    "Soares",
                                    "Solano",
                                    "Soto",
                                    "Tamoio",
                                    "Teles",
                                    "Toledo",
                                    "Torres",
                                    "Uchoa",
                                    "Urias",
                                    "Valdez",
                                    "Val\u00EAncia",
                                    "Valentin",
                                    "Vale",
                                    "Vasques",
                                    "Vega",
                                    "Velasques",
                                    "Verdugo",
                                    "Verdara",
                                    "Vieira",
                                    "Vila",
                                    "Zamana",
                                    "Zambrano",
                                    "Zarago\u00E7a",
                                    "da Cruz",
                                    "da Rosa",
                                    "da Silva",
                                    "das Dores",
                                    "das Neves",
                                    "de Aguiar",
                                    "de Oliveira",
                                    "de Souza");
                        });

        public Object titleMale = ZVal.arrayFromList("Sr.", "Dr.");

        public Object titleFemale = ZVal.arrayFromList("Sra.", "Srta.", "Dr.");

        public Object suffix = ZVal.arrayFromList("Filho", "Neto", "Sobrinho", "Jr.");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\pt_BR\\Person")
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
                            "maleNameFormats",
                            "suffix",
                            "titleFemale",
                            "titleMale")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/pt_BR/Person.php")
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
