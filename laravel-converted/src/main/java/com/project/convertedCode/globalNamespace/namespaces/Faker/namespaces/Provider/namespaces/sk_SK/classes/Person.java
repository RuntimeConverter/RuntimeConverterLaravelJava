package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.sk_SK.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/sk_SK/Person.php

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
        name = "gender",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object title(RuntimeEnv env, Object... args) {
        Object gender = assignParameter(args, 0, true);
        if (null == gender) {
            gender = ZVal.getNull();
        }
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
                        .method("titleMale")
                        .call()
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "gender",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object lastName(RuntimeEnv env, Object... args) {
        Object gender = assignParameter(args, 0, true);
        if (null == gender) {
            gender = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(
                gender,
                "===",
                ClassConstantUtils.getConstantValueLateStatic(env, this, "GENDER_MALE"))) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
                            .method("lastNameMale")
                            .call()
                            .value());

        } else if (ZVal.strictEqualityCheck(
                gender,
                "===",
                ClassConstantUtils.getConstantValueLateStatic(env, this, "GENDER_FEMALE"))) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
                            .method("lastNameFemale")
                            .call()
                            .value());
        }

        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        Person.class,
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
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
                                                                        .sk_SK
                                                                        .classes
                                                                        .Person
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "lastNameFormat")))
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
                                                                .sk_SK
                                                                .classes
                                                                .Person
                                                                .RequestStaticProperties
                                                                .class)
                                                .lastNameFormat)
                                .value()));
    }

    public static final Object CONST_class = "Faker\\Provider\\sk_SK\\Person";

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
        public Object titleMale(RuntimeEnv env, Object... args) {
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
                                                            .sk_SK
                                                            .classes
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .title)
                            .value());
        }

        @ConvertedMethod
        public Object titleFemale(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
                            .method("titleMale")
                            .call()
                            .value());
        }

        @ConvertedMethod
        public Object lastNameMale(RuntimeEnv env, Object... args) {
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
                                                            .sk_SK
                                                            .classes
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .lastNameMale)
                            .value());
        }

        @ConvertedMethod
        public Object lastNameFemale(RuntimeEnv env, Object... args) {
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
                                                            .sk_SK
                                                            .classes
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .lastNameFemale)
                            .value());
        }

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
                                                            .sk_SK
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

        public Object lastNameFormat = ZVal.arrayFromList("{{lastNameMale}}", "{{lastNameFemale}}");

        public Object maleNameFormats =
                ZVal.arrayFromList(
                        "{{firstNameMale}} {{lastNameMale}}",
                        "{{firstNameMale}} {{lastNameMale}}",
                        "{{firstNameMale}} {{lastNameMale}}",
                        "{{firstNameMale}} {{lastNameMale}}",
                        "{{titleMale}} {{firstNameMale}} {{lastNameMale}}",
                        "{{titleMale}} {{firstNameMale}} {{lastNameMale}} {{suffix}}");

        public Object femaleNameFormats =
                ZVal.arrayFromList(
                        "{{firstNameFemale}} {{lastNameFemale}}",
                        "{{firstNameFemale}} {{lastNameFemale}}",
                        "{{firstNameFemale}} {{lastNameFemale}}",
                        "{{firstNameFemale}} {{lastNameFemale}}",
                        "{{titleFemale}} {{firstNameFemale}} {{lastNameFemale}}",
                        "{{titleFemale}} {{firstNameFemale}} {{lastNameFemale}} {{suffix}}");

        public Object firstNameMale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Drahoslav",
                                    "Sever\u00EDn",
                                    "Alexej",
                                    "Ernest",
                                    "Rastislav",
                                    "Radovan",
                                    "Dobroslav",
                                    "Dalibor",
                                    "Vincent",
                                    "Milo\u0161",
                                    "Timotej",
                                    "Gejza",
                                    "Bohu\u0161",
                                    "Alfonz",
                                    "Ga\u0161par",
                                    "Emil",
                                    "Erik",
                                    "Bla\u017Eej",
                                    "Zdenko",
                                    "Dezider",
                                    "Arp\u00E1d",
                                    "Valent\u00EDn",
                                    "Pravoslav",
                                    "Jarom\u00EDr",
                                    "Roman",
                                    "Matej",
                                    "Frederik",
                                    "Viktor",
                                    "Alexander",
                                    "Radom\u00EDr",
                                    "Alb\u00EDn",
                                    "Bohumil",
                                    "Kazim\u00EDr",
                                    "Fridrich",
                                    "Radoslav",
                                    "Tom\u00E1\u0161",
                                    "Alan",
                                    "Branislav",
                                    "Bruno",
                                    "Gregor",
                                    "Vlastimil",
                                    "Boleslav",
                                    "Eduard",
                                    "Jozef",
                                    "V\u00ED\u0165azoslav",
                                    "Blahoslav",
                                    "Be\u0148adik",
                                    "Adri\u00E1n",
                                    "Gabriel",
                                    "Mari\u00E1n",
                                    "Emanuel",
                                    "Miroslav",
                                    "Benjam\u00EDn",
                                    "Hugo",
                                    "Richard",
                                    "Izidor",
                                    "Zolt\u00E1n",
                                    "Albert",
                                    "Igor",
                                    "J\u00FAlius",
                                    "Ale\u0161",
                                    "Fedor",
                                    "Rudolf",
                                    "Val\u00E9r",
                                    "Marcel",
                                    "Erv\u00EDn",
                                    "Slavom\u00EDr",
                                    "Vojtech",
                                    "Juraj",
                                    "Marek",
                                    "Jaroslav",
                                    "\u017Digmund",
                                    "Flori\u00E1n",
                                    "Roland",
                                    "Pankr\u00E1c",
                                    "Serv\u00E1c",
                                    "Bonif\u00E1c",
                                    "Svetoz\u00E1r",
                                    "Bernard",
                                    "J\u00FAlia",
                                    "Urban",
                                    "Du\u0161an",
                                    "Viliam",
                                    "Ferdinand",
                                    "Norbert",
                                    "R\u00F3bert",
                                    "Medard",
                                    "Zlatko",
                                    "Anton",
                                    "Vasil",
                                    "V\u00EDt",
                                    "Adolf",
                                    "Vratislav",
                                    "Alfr\u00E9d",
                                    "Alojz",
                                    "J\u00E1n",
                                    "Tade\u00E1\u0161",
                                    "Ladislav",
                                    "Peter",
                                    "Pavol",
                                    "Miloslav",
                                    "Prokop",
                                    "Cyril",
                                    "Metod",
                                    "Patrik",
                                    "Oliver",
                                    "Ivan",
                                    "Kamil",
                                    "Henrich",
                                    "Drahom\u00EDr",
                                    "Bohuslav",
                                    "I\u013Eja",
                                    "Daniel",
                                    "Vladim\u00EDr",
                                    "Jakub",
                                    "Kri\u0161tof",
                                    "Ign\u00E1c",
                                    "Gust\u00E1v",
                                    "Jergu\u0161",
                                    "Dominik",
                                    "Oskar",
                                    "Vavrinec",
                                    "\u013Dubom\u00EDr",
                                    "Mojm\u00EDr",
                                    "Leonard",
                                    "Tichom\u00EDr",
                                    "Filip",
                                    "Bartolomej",
                                    "\u013Dudov\u00EDt",
                                    "Samuel",
                                    "August\u00EDn",
                                    "Belo",
                                    "Oleg",
                                    "Bystr\u00EDk",
                                    "Ctibor",
                                    "\u013Dudomil",
                                    "Kon\u0161tant\u00EDn",
                                    "\u013Duboslav",
                                    "Mat\u00FA\u0161",
                                    "M\u00F3ric",
                                    "\u013Dubo\u0161",
                                    "\u013Dubor",
                                    "Vladislav",
                                    "Cypri\u00E1n",
                                    "V\u00E1clav",
                                    "Michal",
                                    "Jarol\u00EDm",
                                    "Arnold",
                                    "Levoslav",
                                    "Franti\u0161ek",
                                    "Dion\u00FDz",
                                    "Maximili\u00E1n",
                                    "Koloman",
                                    "Boris",
                                    "Luk\u00E1\u0161",
                                    "Kristi\u00E1n",
                                    "Vendel\u00EDn",
                                    "Sergej",
                                    "Aurel",
                                    "Demeter",
                                    "Denis",
                                    "Hubert",
                                    "Karol",
                                    "Imrich",
                                    "Ren\u00E9",
                                    "Bohum\u00EDr",
                                    "Teodor",
                                    "Tibor",
                                    "Maro\u0161",
                                    "Martin",
                                    "Sv\u00E4topluk",
                                    "Stanislav",
                                    "Leopold",
                                    "Eugen",
                                    "F\u00E9lix",
                                    "Klement",
                                    "Kornel",
                                    "Milan",
                                    "Vratko",
                                    "Ondrej",
                                    "Andrej",
                                    "Edmund",
                                    "Oldrich",
                                    "Oto",
                                    "Mikul\u00E1\u0161",
                                    "Ambr\u00F3z",
                                    "Rad\u00FAz",
                                    "Bohdan",
                                    "Adam",
                                    "\u0160tefan",
                                    "D\u00E1vid",
                                    "Silvester");
                        });

        public Object firstNameFemale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Alexandra",
                                    "Karina",
                                    "Daniela",
                                    "Andrea",
                                    "Ant\u00F3nia",
                                    "Bohuslava",
                                    "D\u00E1\u0161a",
                                    "Malv\u00EDna",
                                    "Krist\u00EDna",
                                    "Nata\u0161a",
                                    "Bohdana",
                                    "Drahom\u00EDra",
                                    "S\u00E1ra",
                                    "Zora",
                                    "Tamara",
                                    "Ema",
                                    "Tatiana",
                                    "Erika",
                                    "Veronika",
                                    "Ag\u00E1ta",
                                    "Dorota",
                                    "Vanda",
                                    "Zoja",
                                    "Gabriela",
                                    "Perla",
                                    "Ida",
                                    "Liana",
                                    "Miloslava",
                                    "Vlasta",
                                    "L\u00EDvia",
                                    "Eleon\u00F3ra",
                                    "Etela",
                                    "Romana",
                                    "Zlatica",
                                    "Ane\u017Eka",
                                    "Bohumila",
                                    "Franti\u0161ka",
                                    "Angela",
                                    "Matilda",
                                    "Svetlana",
                                    "\u013Dubica",
                                    "Alena",
                                    "So\u0148a",
                                    "Vieroslava",
                                    "Zita",
                                    "Miroslava",
                                    "Irena",
                                    "Milena",
                                    "Estera",
                                    "Just\u00EDna",
                                    "Dana",
                                    "Danica",
                                    "Jela",
                                    "Jaroslava",
                                    "Jarmila",
                                    "Lea",
                                    "Anast\u00E1zia",
                                    "Galina",
                                    "Lesana",
                                    "Herm\u00EDna",
                                    "Monika",
                                    "Ingrida",
                                    "Vikt\u00F3ria",
                                    "Bla\u017Eena",
                                    "\u017Dofia",
                                    "Sofia",
                                    "Gizela",
                                    "Viola",
                                    "Gertr\u00FAda",
                                    "Zina",
                                    "J\u00FAlia",
                                    "Juliana",
                                    "\u017Delm\u00EDra",
                                    "Ela",
                                    "Vanesa",
                                    "Iveta",
                                    "Vilma",
                                    "Petronela",
                                    "\u017Daneta",
                                    "X\u00E9nia",
                                    "Karol\u00EDna",
                                    "Lenka",
                                    "Laura",
                                    "Stanislava",
                                    "Margar\u00E9ta",
                                    "Dobroslava",
                                    "Blanka",
                                    "Val\u00E9ria",
                                    "Paul\u00EDna",
                                    "Sid\u00F3nia",
                                    "Adri\u00E1na",
                                    "Be\u00E1ta",
                                    "Petra",
                                    "Mel\u00E1nia",
                                    "Diana",
                                    "Berta",
                                    "Patr\u00EDcia",
                                    "Lujza",
                                    "Am\u00E1lia",
                                    "Milota",
                                    "Nina",
                                    "Margita",
                                    "Kamila",
                                    "Du\u0161ana",
                                    "Magdal\u00E9na",
                                    "O\u013Ega",
                                    "Anna",
                                    "Hana",
                                    "Bo\u017Eena",
                                    "Marta",
                                    "Libu\u0161a",
                                    "Bo\u017Eidara",
                                    "Dominika",
                                    "Hortenzia",
                                    "Jozef\u00EDna",
                                    "\u0160tef\u00E1nia",
                                    "\u013Dubom\u00EDra",
                                    "Zuzana",
                                    "Darina",
                                    "Marcela",
                                    "Milica",
                                    "Elena",
                                    "Helena",
                                    "L\u00FDdia",
                                    "Anabela",
                                    "Jana",
                                    "Silvia",
                                    "Nikola",
                                    "Ru\u017Eena",
                                    "Nora",
                                    "Drahoslava",
                                    "Linda",
                                    "Melinda",
                                    "Rebeka",
                                    "Roz\u00E1lia",
                                    "Reg\u00EDna",
                                    "Alica",
                                    "Marianna",
                                    "Miriama",
                                    "Martina",
                                    "M\u00E1ria",
                                    "Jolana",
                                    "\u013Dudomila",
                                    "\u013Dudmila",
                                    "Olympia",
                                    "Eug\u00E9nia",
                                    "\u013Duboslava",
                                    "Zdenka",
                                    "Edita",
                                    "Michaela",
                                    "Stela",
                                    "Viera",
                                    "Nat\u00E1lia",
                                    "Eli\u0161ka",
                                    "Brigita",
                                    "Valent\u00EDna",
                                    "Ter\u00E9zia",
                                    "Vladim\u00EDra",
                                    "Hedviga",
                                    "Ur\u0161u\u013Ea",
                                    "Alojza",
                                    "Kvetoslava",
                                    "Sab\u00EDna",
                                    "Dobromila",
                                    "Kl\u00E1ra",
                                    "Simona",
                                    "Aur\u00E9lia",
                                    "Denisa",
                                    "Ren\u00E1ta",
                                    "Irma",
                                    "Agnesa",
                                    "Klaudia",
                                    "Al\u017Ebeta",
                                    "Elv\u00EDra",
                                    "Cec\u00EDlia",
                                    "Em\u00EDlia",
                                    "Katar\u00EDna",
                                    "Henrieta",
                                    "Bibi\u00E1na",
                                    "Barbora",
                                    "Mar\u00EDna",
                                    "Izabela",
                                    "Hilda",
                                    "Ot\u00EDlia",
                                    "Lucia",
                                    "Branislava",
                                    "Bronislava",
                                    "Ivica",
                                    "Alb\u00EDna",
                                    "Korn\u00E9lia",
                                    "Sl\u00E1va",
                                    "Sl\u00E1vka",
                                    "Judita",
                                    "Dagmara",
                                    "Adela",
                                    "Nade\u017Eda",
                                    "Eva",
                                    "Filom\u00E9na",
                                    "Ivana",
                                    "Milada");
                        });

        public Object lastNameMale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Sloboda",
                                    "Novotn\u00FD",
                                    "Ku\u010Dera",
                                    "Vesel\u00FD",
                                    "Hor\u00E1k",
                                    "Marek",
                                    "Pokorn\u00FD",
                                    "Kr\u00E1l",
                                    "R\u016F\u017Ei\u010Dka",
                                    "Zeman",
                                    "Kol\u00E1r",
                                    "Urban",
                                    "Barto\u0161",
                                    "Vl\u010Dek",
                                    "Pol\u00E1k",
                                    "Kopeck\u00FD",
                                    "Kone\u010Dn\u00FD",
                                    "Mal\u00FD",
                                    "Holub",
                                    "Abrah\u00E1m",
                                    "Adam",
                                    "Adamec",
                                    "Alm\u00E1\u0161i",
                                    "Anderle",
                                    "Antal",
                                    "Babka",
                                    "Bahna",
                                    "Bahno",
                                    "Bajnok",
                                    "Bala\u0161a",
                                    "Balog",
                                    "Balogh",
                                    "Bal\u00E1\u017E",
                                    "Baran",
                                    "Baranka",
                                    "Bartovi\u010D",
                                    "Barto\u0161",
                                    "Ba\u010Da",
                                    "Beck",
                                    "Beihofner",
                                    "Bella",
                                    "Beran",
                                    "Bernol\u00E1k",
                                    "Be\u0148o",
                                    "Bicek",
                                    "Bielik",
                                    "Biringer",
                                    "Blaho",
                                    "Bondra",
                                    "Bos\u00E1k",
                                    "Bo\u0161ka",
                                    "Brezina",
                                    "Bug\u00E1r",
                                    "Bu\u0161",
                                    "Chalupka",
                                    "Chud\u00EDk",
                                    "Cyprich",
                                    "C\u00EDger",
                                    "Dacej",
                                    "Danko",
                                    "Debn\u00E1r",
                                    "Dej",
                                    "Dek\u00FD\u0161",
                                    "Dole\u017Eal",
                                    "Dost\u00E1l",
                                    "Do\u010Dolomansk\u00FD",
                                    "Drajna",
                                    "Droppa",
                                    "Dubovsk\u00FD",
                                    "Dudek",
                                    "Dula",
                                    "Dulla",
                                    "Dus\u00EDk",
                                    "Dvon\u010D",
                                    "Dzurjanin",
                                    "D\u00E1vid",
                                    "Fabian",
                                    "Fabi\u00E1n",
                                    "Fajnor",
                                    "Farka\u0161ovsk\u00FD",
                                    "Feldek",
                                    "Fico",
                                    "Filc",
                                    "Filip",
                                    "Finka",
                                    "Ftorek",
                                    "Galis",
                                    "Gallo",
                                    "Ga\u0161par",
                                    "Ga\u0161parovi\u010D",
                                    "Gocn\u00EDk",
                                    "Golonka",
                                    "Gregu\u0161",
                                    "Grzn\u00E1r",
                                    "Habl\u00E1k",
                                    "Hab\u0161uda",
                                    "Halu\u0161ka",
                                    "Hal\u00E1k",
                                    "Hanko",
                                    "Hanzal",
                                    "Hanzel",
                                    "Hanzel",
                                    "Ha\u0161\u010D\u00E1k",
                                    "Heretik",
                                    "He\u010Dko",
                                    "He\u010Dkov\u00E1",
                                    "Hlav\u00E1\u010Dek",
                                    "Hlinka",
                                    "Hochschorner",
                                    "Holub",
                                    "Holuby",
                                    "Horv\u00E1th",
                                    "Hossa",
                                    "Hra\u0161ko",
                                    "Hric",
                                    "Hrmo",
                                    "Hru\u0161ovsk\u00FD",
                                    "Huba",
                                    "Hud\u00E1\u010Dek",
                                    "H\u00E1la",
                                    "Ihna\u010D\u00E1k",
                                    "Jano\u0161ka",
                                    "Janto\u0161ovi\u010D",
                                    "Jan\u00EDk",
                                    "Jonata",
                                    "Jurina",
                                    "Jurinov\u00E1",
                                    "Jur\u00EDk",
                                    "J\u00E1ni",
                                    "J\u00E1no\u0161\u00EDk",
                                    "Kalisk\u00FD",
                                    "Karul",
                                    "Karva\u0161",
                                    "Ken\u00ED\u017E",
                                    "Klapka",
                                    "Klaus",
                                    "Koln\u00EDk",
                                    "Konstantinidis",
                                    "Korec",
                                    "Kostrec",
                                    "Kov\u00E1\u010D",
                                    "Kov\u00E1\u010Dik",
                                    "Koza",
                                    "Kub\u00EDk",
                                    "Ku\u010Dera",
                                    "Labuda",
                                    "Lango\u0161",
                                    "Lep\u0161\u00EDk",
                                    "Lexa",
                                    "Lintner",
                                    "Lubina",
                                    "Luk\u00E1\u010D",
                                    "Lupt\u00E1k",
                                    "L\u00ED\u0161ka",
                                    "Majesk\u00FD",
                                    "Malachovsk\u00FD",
                                    "Mal\u00ED\u0161ek",
                                    "Mari\u00E1n",
                                    "Masaryk",
                                    "Maslo",
                                    "Matia\u0161ko",
                                    "Medve\u010F",
                                    "Menyh\u00E9rt",
                                    "Me\u010Diar",
                                    "Me\u010D\u00ED\u0159",
                                    "Miklo\u0161ko",
                                    "Mikul\u00EDk",
                                    "Miku\u0161",
                                    "Mik\u00FA\u0161",
                                    "Mi\u0161\u00EDk",
                                    "Moj\u017Ei\u0161",
                                    "Mokro\u0161",
                                    "Moln\u00E1r",
                                    "Morav\u010D\u00EDk",
                                    "Musil",
                                    "Mydlo",
                                    "Nagy",
                                    "Nemec",
                                    "Neruda",
                                    "Nezval",
                                    "Nitra",
                                    "Nov\u00E1k",
                                    "N\u00E1b\u011Blek",
                                    "N\u011Bmec",
                                    "Ob\u0161ut",
                                    "Ot\u010Den\u00E1\u0161",
                                    "Pauko",
                                    "Pavlikovsk\u00FD",
                                    "Pav\u00FAk",
                                    "Pa\u0161ek",
                                    "Pa\u0161ka",
                                    "Pa\u0161ko",
                                    "Pelik\u00E1n",
                                    "Petrovick\u00FD",
                                    "Petru\u0161ka",
                                    "Plch",
                                    "Podhradsk\u00E1",
                                    "Podkonick\u00FD",
                                    "Poliak",
                                    "Proch\u00E1zka",
                                    "Pusk\u00E1s",
                                    "Pu\u0161k\u00E1\u0161",
                                    "Ra\u0161i",
                                    "Repisk\u00FD",
                                    "Riszdorfer",
                                    "Roman\u010D\u00EDk",
                                    "Rozenberg",
                                    "Rus",
                                    "Ru\u017Ei\u010Dka",
                                    "R\u00FAfus",
                                    "R\u016F\u017Ei\u010Dka",
                                    "Samson",
                                    "Sedliak",
                                    "Senko",
                                    "Sidor",
                                    "Sklenka",
                                    "Skuteck\u00FD",
                                    "Sla\u0161\u0165an",
                                    "Sloboda",
                                    "Slobodn\u00EDk",
                                    "Slota",
                                    "Slov\u00E1k",
                                    "Smrek",
                                    "Stodola",
                                    "Straka",
                                    "Szab\u00F3",
                                    "S\u00E1mel",
                                    "S\u00FDkora",
                                    "Tatar",
                                    "Tatarka",
                                    "Tat\u00E1r",
                                    "Tat\u00E1rka",
                                    "Timko",
                                    "Tiso",
                                    "Tome\u010Dek",
                                    "Truben",
                                    "Tur\u010Dok",
                                    "T\u00F3th",
                                    "Uram",
                                    "Urbl\u00EDk",
                                    "Vajc\u00EDk",
                                    "Valent",
                                    "Valu\u0161ka",
                                    "Varga",
                                    "Va\u0161\u00ED\u010Dek",
                                    "Vesel",
                                    "Vico",
                                    "Vi\u0161\u0148ovsk\u00FD",
                                    "Vydaren\u00FD",
                                    "Weiss",
                                    "Zima",
                                    "Zimka",
                                    "Zipser",
                                    "Z\u00E1topek",
                                    "Z\u00FAbrik",
                                    "\u010Caplovi\u010D",
                                    "\u010Carnogursk\u00FD",
                                    "\u010Cierny",
                                    "\u010Ea\u010Fo",
                                    "\u010Eurica",
                                    "\u010Euri\u0161",
                                    "\u0160imonovi\u010D",
                                    "\u0160kriniar",
                                    "\u0160ouc",
                                    "\u0160oustal",
                                    "\u0160tefan",
                                    "\u0160tefanka",
                                    "\u0160ulc",
                                    "\u0160urka",
                                    "\u0160vehla",
                                    "\u0160\u0165astn\u00FD");
                        });

        public Object lastNameFemale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Slobodov\u00E1",
                                    "Novotn\u00E1",
                                    "\u010Cierna",
                                    "Ku\u010Derov\u00E1",
                                    "Vesel\u00E1",
                                    "Kraj\u010D\u00EDov\u00E1",
                                    "Nemcov\u00E1",
                                    "Kr\u00E1lov\u00E1",
                                    "R\u016F\u017Ei\u010Dkov\u00E1",
                                    "Fialov\u00E1",
                                    "Zemanov\u00E1",
                                    "Kol\u00E1rov\u00E1",
                                    "Kov\u00E1\u010Dov\u00E1",
                                    "Vl\u010Dkov\u00E1",
                                    "Pol\u00E1kov\u00E1",
                                    "Kopeck\u00E1",
                                    "\u0160imkov\u00E1",
                                    "Kone\u010Dn\u00E1",
                                    "Mal\u00E1",
                                    "Holubov\u00E1",
                                    "Stanekov\u00E1",
                                    "\u0160\u0165astn\u00E1",
                                    "Vargov\u00E1",
                                    "T\u00F3thov\u00E1",
                                    "Horv\u00E1thov\u00E1",
                                    "Bal\u00E1\u017Eov\u00E1",
                                    "Szabov\u00E1",
                                    "Moln\u00E1rov\u00E1",
                                    "Balogov\u00E1",
                                    "Luk\u00E1\u010Dov\u00E1",
                                    "V\u00EDcenov\u00E1",
                                    "Ringl\u00F3ciov\u00E1",
                                    "Popovi\u010Dov\u00E1",
                                    "Hulmanov\u00E1",
                                    "Zelenayov\u00E1",
                                    "Fingerlandov\u00E1",
                                    "Kr\u00E1likov\u00E1",
                                    "Kapustov\u00E1",
                                    "Hantuchov\u00E1",
                                    "Hol\u00E9czyov\u00E1",
                                    "Butv\u00EDnov\u00E1",
                                    "Oslejov\u00E1",
                                    "Radi\u010Dov\u00E1",
                                    "S\u00E1rov\u00E1",
                                    "Sobotkov\u00E1",
                                    "Ka\u017Eim\u00EDrov\u00E1",
                                    "Pl\u0161kov\u00E1",
                                    "Jakubov\u00E1",
                                    "\u0160indlerov\u00E1",
                                    "Ondrejkov\u00E1",
                                    "Slobodn\u00EDkov\u00E1",
                                    "Sadlo\u0148ov\u00E1",
                                    "\u010Cern\u00E1",
                                    "Noskov\u00E1",
                                    "Vir\u010D\u00EDkov\u00E1",
                                    "Tali\u00E1nov\u00E1",
                                    "\u010Cuntalov\u00E1",
                                    "O\u0165apkov\u00E1",
                                    "Zuzulov\u00E1",
                                    "Godolov\u00E1",
                                    "Gonov\u00E1",
                                    "Jan\u010Dov\u00E1",
                                    "Koc\u00FArov\u00E1",
                                    "Svobodov\u00E1",
                                    "Oravcov\u00E1",
                                    "Mur\u00E1rikov\u00E1",
                                    "Holubov\u00E1",
                                    "Kub\u00E1\u0148ov\u00E1",
                                    "Ondri\u0161ov\u00E1",
                                    "\u0160oltisov\u00E1",
                                    "Moln\u00E1rov\u00E1",
                                    "Rezn\u00ED\u010Dkov\u00E1",
                                    "Dubn\u00ED\u010Dkov\u00E1",
                                    "Karol\u010D\u00EDkov\u00E1",
                                    "M\u00E1likov\u00E1",
                                    "Mal\u00EDkov\u00E1",
                                    "Litajov\u00E1",
                                    "Kolrusov\u00E1",
                                    "Ko\u0161\u00EDkov\u00E1",
                                    "Ku\u0161n\u00EDrov\u00E1",
                                    "Kravjarov\u00E1",
                                    "Hotov\u00E1",
                                    "Hajzerov\u00E1",
                                    "Ferjen\u010D\u00EDkov\u00E1",
                                    "Senkov\u00E1",
                                    "Adamcov\u00E1",
                                    "Piro\u0161ov\u00E1",
                                    "\u0160imonov\u00E1",
                                    "Finkov\u00E1",
                                    "Hrd\u00E1",
                                    "Mur\u010Dov\u00E1");
                        });

        public Object title =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Bc.",
                                    "Ing.",
                                    "MUDr.",
                                    "MVDr.",
                                    "Mgr.",
                                    "JUDr.",
                                    "PhDr.",
                                    "RNDr.",
                                    "doc.",
                                    "Dr.",
                                    "BcA.",
                                    "ICDr.",
                                    "Ing.",
                                    "Ing. arch.",
                                    "JUDr.",
                                    "Mgr. art.",
                                    "MSDr.",
                                    "PaedDr.",
                                    "PharmDr.",
                                    "PhDr.",
                                    "PhMr.",
                                    "RNDr.",
                                    "RSDr.",
                                    "ThDr.",
                                    "ThLic.",
                                    "prof.",
                                    "Dr. h. c.");
                        });

        public Object suffix = ZVal.arrayFromList("CSc.", "DrSc.", "DSc.", "Ph.D.", "Th.D.");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\sk_SK\\Person")
                    .setLookup(
                            Person.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "femaleNameFormats",
                            "firstNameFemale",
                            "firstNameMale",
                            "lastNameFemale",
                            "lastNameFormat",
                            "lastNameMale",
                            "maleNameFormats",
                            "suffix",
                            "title")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/sk_SK/Person.php")
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
