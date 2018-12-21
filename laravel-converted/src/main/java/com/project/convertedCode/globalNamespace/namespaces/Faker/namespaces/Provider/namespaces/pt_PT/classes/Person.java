package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.pt_PT.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/pt_PT/Person.php

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

    public static final Object CONST_class = "Faker\\Provider\\pt_PT\\Person";

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
        public Object taxpayerIdentificationNumber(RuntimeEnv env, Object... args) {
            Object firstEightDigits = null;
            Object lastDigit = null;
            firstEightDigits =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
                            .method("numerify")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Person.class)
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
                                                                            .Person
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .firstEightDigitsFormat)
                                            .value())
                            .value();
            lastDigit =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
                            .method("dvCalcMod11")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(firstEightDigits)
                            .value();
            return ZVal.assign(toStringR(firstEightDigits, env) + toStringR(lastDigit, env));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "number")
        public Object dvCalcMod11(RuntimeEnv env, Object... args) {
            Object number = assignParameter(args, 0, false);
            Object res = null;
            ReferenceContainer numbers = new BasicReferenceContainer(null);
            ReferenceContainer i = new BasicReferenceContainer(null);
            Object sum = null;
            ReferenceContainer factor = new BasicReferenceContainer(null);
            ReferenceContainer partial = new BasicReferenceContainer(null);
            Object base = null;
            Object digit = null;
            base = 9;
            sum = 0;
            factor.setObject(2);
            for (i.setObject(function_strlen.f.env(env).call(number).value());
                    ZVal.isGreaterThan(i.getObject(), '>', 0);
                    i.setObject(ZVal.decrement(i.getObject()))) {
                numbers.arrayAccess(env, i.getObject())
                        .set(
                                function_substr
                                        .f
                                        .env(env)
                                        .call(number, ZVal.subtract(i.getObject(), 1), 1)
                                        .value());
                partial.arrayAccess(env, i.getObject())
                        .set(
                                ZVal.multiply(
                                        numbers.arrayGet(env, i.getObject()), factor.getObject()));
                sum = ZAssignment.add("+=", sum, partial.arrayGet(env, i.getObject()));
                if (ZVal.equalityCheck(factor.getObject(), base)) {
                    factor.setObject(1);
                }

                factor.setObject(ZVal.increment(factor.getObject()));
            }

            res = ZVal.modulus(sum, 11);
            if (ZVal.toBool(ZVal.equalityCheck(res, 0))
                    || ZVal.toBool(ZVal.equalityCheck(res, 1))) {
                digit = 0;

            } else {
                digit = ZVal.subtract(11, res);
            }

            return ZVal.assign(digit);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object maleNameFormats =
                ZVal.arrayFromList(
                        "{{firstNameMale}} {{lastName}}",
                        "{{firstNameMale}} {{lastName}} {{lastName}}",
                        "{{firstNameMale}} {{lastName}} de {{lastName}}",
                        "{{firstNameMale}} {{firstNameMale}} {{lastName}}",
                        "{{firstNameMale}} {{firstNameMale}} de {{lastName}}",
                        "{{firstNameMale}} {{firstNameMale}} {{lastName}} {{lastName}}",
                        "{{firstNameMale}} {{firstNameMale}} {{lastName}} de {{lastName}}",
                        "{{firstNameMale}} {{firstNameMale}} {{lastName}} {{lastName}} {{lastName}}");

        public Object femaleNameFormats =
                ZVal.arrayFromList(
                        "{{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{lastName}} {{lastName}}",
                        "{{firstNameFemale}} {{lastName}} de {{lastName}}",
                        "{{firstNameFemale}} {{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{firstNameFemale}} de {{lastName}}",
                        "{{firstNameFemale}} {{firstNameFemale}} {{lastName}} {{lastName}}",
                        "{{firstNameFemale}} {{firstNameFemale}} {{lastName}} de {{lastName}}",
                        "{{firstNameFemale}} {{firstNameFemale}} {{lastName}} {{lastName}} {{lastName}}");

        public Object titleMale =
                ZVal.arrayFromList("Sr.", "Dr.", "Exmo.", "Eng.", "Eng.\u00BA", "Ex.", "Ex\u00BA");

        public Object titleFemale =
                ZVal.arrayFromList("Sra.", "Dra.", "Exma", "Eng.\u00AA", "Ex\u00AA");

        public Object firstEightDigitsFormat =
                ZVal.arrayFromList(
                        "1#######",
                        "2#######",
                        "3#######",
                        "45######",
                        "5#######",
                        "6#######",
                        "70######",
                        "71######",
                        "72######",
                        "77######",
                        "79######",
                        "8#######",
                        "90######",
                        "98######",
                        "99######");

        public Object firstNameMale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Rodrigo",
                                    "Jo\u00E3o",
                                    "Martim",
                                    "Afonso",
                                    "Tom\u00E1s",
                                    "Gon\u00E7alo",
                                    "Francisco",
                                    "Tiago",
                                    "Diogo",
                                    "Guilherme",
                                    "Pedro",
                                    "Miguel",
                                    "Rafael",
                                    "Gabriel",
                                    "Santiago",
                                    "Dinis",
                                    "David",
                                    "Duarte",
                                    "Jos\u00E9",
                                    "Sim\u00E3o",
                                    "Daniel",
                                    "Lucas",
                                    "Gustavo",
                                    "Andr\u00E9",
                                    "Denis",
                                    "Salvador",
                                    "Ant\u00F3nio",
                                    "Vasco",
                                    "Henrique",
                                    "Louren\u00E7o",
                                    "Manuel",
                                    "Eduardo",
                                    "Bernardo",
                                    "Leandro",
                                    "Lu\u00EDs",
                                    "Diego",
                                    "Leonardo",
                                    "Alexandre",
                                    "R\u00FAben",
                                    "Mateus",
                                    "Ricardo",
                                    "Vicente",
                                    "Filipe",
                                    "Bruno",
                                    "Nuno",
                                    "Carlos",
                                    "Rui",
                                    "Hugo",
                                    "Samuel",
                                    "\u00C1lvaro",
                                    "Matias",
                                    "F\u00E1bio",
                                    "Ivo",
                                    "Paulo",
                                    "Jorge",
                                    "Xavier",
                                    "Marco",
                                    "Isaac",
                                    "Ra\u00FAl",
                                    "Benjamim",
                                    "Renato",
                                    "Artur",
                                    "M\u00E1rio",
                                    "Frederico",
                                    "Cristiano",
                                    "Ivan",
                                    "S\u00E9rgio",
                                    "Micael",
                                    "V\u00EDtor",
                                    "Edgar",
                                    "Kevin",
                                    "Joaquim",
                                    "Igor",
                                    "\u00C2ngelo",
                                    "Enzo",
                                    "Valentim",
                                    "Fl\u00E1vio",
                                    "Joel",
                                    "Fernando",
                                    "Sebasti\u00E3o",
                                    "Tom\u00E9",
                                    "C\u00E9sar",
                                    "Cl\u00E1udio",
                                    "Nelson",
                                    "Lisandro",
                                    "Jaime",
                                    "Gil",
                                    "Mauro",
                                    "Sandro",
                                    "H\u00E9lder",
                                    "Matheus",
                                    "William",
                                    "Gaspar",
                                    "M\u00E1rcio",
                                    "Martinho",
                                    "Emanuel",
                                    "Marcos",
                                    "Telmo",
                                    "Davi",
                                    "Wilson");
                        });

        public Object firstNameFemale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Maria",
                                    "Leonor",
                                    "Matilde",
                                    "Mariana",
                                    "Ana",
                                    "Beatriz",
                                    "In\u00EAs",
                                    "Lara",
                                    "Carolina",
                                    "Margarida",
                                    "Joana",
                                    "Sofia",
                                    "Diana",
                                    "Francisca",
                                    "Laura",
                                    "Sara",
                                    "Madalena",
                                    "Rita",
                                    "Mafalda",
                                    "Catarina",
                                    "Luana",
                                    "Marta",
                                    "\u00CDris",
                                    "Alice",
                                    "Bianca",
                                    "Constan\u00E7a",
                                    "Gabriela",
                                    "Eva",
                                    "Clara",
                                    "Bruna",
                                    "Daniela",
                                    "Iara",
                                    "Filipa",
                                    "Vit\u00F3ria",
                                    "Ariana",
                                    "Let\u00EDcia",
                                    "B\u00E1rbara",
                                    "Camila",
                                    "Rafaela",
                                    "Carlota",
                                    "Yara",
                                    "N\u00FAria",
                                    "Raquel",
                                    "Ema",
                                    "Helena",
                                    "Benedita",
                                    "\u00C9rica",
                                    "Isabel",
                                    "Nicole",
                                    "Lia",
                                    "Al\u00EDcia",
                                    "Mara",
                                    "J\u00E9ssica",
                                    "Soraia",
                                    "J\u00FAlia",
                                    "Luna",
                                    "Vict\u00F3ria",
                                    "Lu\u00EDsa",
                                    "Teresa",
                                    "Miriam",
                                    "Adriana",
                                    "Melissa",
                                    "Andreia",
                                    "Juliana",
                                    "Alexandra",
                                    "Yasmin",
                                    "Tatiana",
                                    "Leticia",
                                    "Luciana",
                                    "Eduarda",
                                    "Cl\u00E1udia",
                                    "D\u00E9bora",
                                    "Fabiana",
                                    "Renata",
                                    "Kyara",
                                    "Kelly",
                                    "Irina",
                                    "M\u00E9lanie",
                                    "N\u00E1dia",
                                    "Cristiana",
                                    "Liliana",
                                    "Patr\u00EDcia",
                                    "Vera",
                                    "Doriana",
                                    "\u00C2ngela",
                                    "Mia",
                                    "Erica",
                                    "M\u00F3nica",
                                    "Isabela",
                                    "Salom\u00E9",
                                    "C\u00E1tia",
                                    "Ver\u00F3nica",
                                    "Violeta",
                                    "Lorena",
                                    "\u00C9rika",
                                    "Vanessa",
                                    "Iris",
                                    "Anna",
                                    "Viviane",
                                    "Rebeca",
                                    "Neuza");
                        });

        public Object lastName =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Abreu",
                                    "Almeida",
                                    "Alves",
                                    "Amaral",
                                    "Amorim",
                                    "Andrade",
                                    "Anjos",
                                    "Antunes",
                                    "Ara\u00FAjo",
                                    "Assun\u00E7\u00E3o",
                                    "Azevedo",
                                    "Baptista",
                                    "Barbosa",
                                    "Barros",
                                    "Batista",
                                    "Borges",
                                    "Branco",
                                    "Brito",
                                    "Campos",
                                    "Cardoso",
                                    "Carneiro",
                                    "Carvalho",
                                    "Castro",
                                    "Coelho",
                                    "Correia",
                                    "Costa",
                                    "Cruz",
                                    "Cunha",
                                    "Domingues",
                                    "Esteves",
                                    "Faria",
                                    "Fernandes",
                                    "Ferreira",
                                    "Figueiredo",
                                    "Fonseca",
                                    "Freitas",
                                    "Garcia",
                                    "Gaspar",
                                    "Gomes",
                                    "Gon\u00E7alves",
                                    "Guerreiro",
                                    "Henriques",
                                    "Jesus",
                                    "Leal",
                                    "Leite",
                                    "Lima",
                                    "Lopes",
                                    "Loureiro",
                                    "Louren\u00E7o",
                                    "Macedo",
                                    "Machado",
                                    "Magalh\u00E3es",
                                    "Maia",
                                    "Marques",
                                    "Martins",
                                    "Matias",
                                    "Matos",
                                    "Melo",
                                    "Mendes",
                                    "Miranda",
                                    "Monteiro",
                                    "Morais",
                                    "Moreira",
                                    "Mota",
                                    "Moura",
                                    "Nascimento",
                                    "Neto",
                                    "Neves",
                                    "Nogueira",
                                    "Nunes",
                                    "Oliveira",
                                    "Pacheco",
                                    "Paiva",
                                    "Pereira",
                                    "Pinheiro",
                                    "Pinho",
                                    "Pinto",
                                    "Pires",
                                    "Ramos",
                                    "Reis",
                                    "Ribeiro",
                                    "Rocha",
                                    "Rodrigues",
                                    "Santos",
                                    "Silva",
                                    "Sim\u00F5es",
                                    "Soares",
                                    "Sousa",
                                    "S\u00E1",
                                    "Tavares",
                                    "Teixeira",
                                    "Torres",
                                    "Valente",
                                    "Vaz",
                                    "Vicente",
                                    "Vieira");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\pt_PT\\Person")
                    .setLookup(
                            Person.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "femaleNameFormats",
                            "firstEightDigitsFormat",
                            "firstNameFemale",
                            "firstNameMale",
                            "lastName",
                            "maleNameFormats",
                            "titleFemale",
                            "titleMale")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/pt_PT/Person.php")
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
