package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.fr_FR.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Calculator.classes.Luhn;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/fr_FR/Company.php

*/

public class Company
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .Company {

    public Company(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Company.class) {
            this.__construct(env, args);
        }
    }

    public Company(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object catchPhraseNoun(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Company.class)
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
                                                                .fr_FR
                                                                .classes
                                                                .Company
                                                                .RequestStaticProperties
                                                                .class,
                                                        "noun")))
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
                                                        .fr_FR
                                                        .classes
                                                        .Company
                                                        .RequestStaticProperties
                                                        .class)
                                        .noun)
                        .value());
    }

    @ConvertedMethod
    public Object catchPhraseAttribute(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Company.class)
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
                                                                .fr_FR
                                                                .classes
                                                                .Company
                                                                .RequestStaticProperties
                                                                .class,
                                                        "attribute")))
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
                                                        .fr_FR
                                                        .classes
                                                        .Company
                                                        .RequestStaticProperties
                                                        .class)
                                        .attribute)
                        .value());
    }

    @ConvertedMethod
    public Object catchPhraseVerb(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Company.class)
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
                                                                .fr_FR
                                                                .classes
                                                                .Company
                                                                .RequestStaticProperties
                                                                .class,
                                                        "verb")))
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
                                                        .fr_FR
                                                        .classes
                                                        .Company
                                                        .RequestStaticProperties
                                                        .class)
                                        .verb)
                        .value());
    }

    @ConvertedMethod
    public Object catchPhrase(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object catchPhrase = null;
        Object format = null;
        runtimeConverterBreakCount = 0;
        do {
            format =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Company.class)
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
                                                                    .fr_FR
                                                                    .classes
                                                                    .Company
                                                                    .RequestStaticProperties
                                                                    .class,
                                                            "catchPhraseFormats")))
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
                                                            .fr_FR
                                                            .classes
                                                            .Company
                                                            .RequestStaticProperties
                                                            .class)
                                            .catchPhraseFormats)
                            .value();
            catchPhrase =
                    NamespaceGlobal.ucfirst
                            .env(env)
                            .call(
                                    env.callMethod(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("generator")
                                                    .value(),
                                            "parse",
                                            Company.class,
                                            format))
                            .value();
            if (ZVal.isTrue(
                    env.callMethod(this, "isCatchPhraseValid", Company.class, catchPhrase))) {
                break;
            }

        } while (ZVal.isTrue(true));

        return ZVal.assign(catchPhrase);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "formatted",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object siret(RuntimeEnv env, Object... args) {
        Object formatted = assignParameter(args, 0, true);
        if (null == formatted) {
            formatted = true;
        }
        Object siret = null;
        Object nicFormat = null;
        siret = this.siren(env, false);
        nicFormat =
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Company.class)
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
                                                                .fr_FR
                                                                .classes
                                                                .Company
                                                                .RequestStaticProperties
                                                                .class,
                                                        "siretNicFormats")))
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
                                                        .fr_FR
                                                        .classes
                                                        .Company
                                                        .RequestStaticProperties
                                                        .class)
                                        .siretNicFormats)
                        .value();
        siret =
                toStringR(siret, env)
                        + toStringR(
                                env.callMethod(this, "numerify", Company.class, nicFormat), env);
        siret =
                toStringR(siret, env)
                        + toStringR(Luhn.runtimeStaticObject.computeCheckDigit(env, siret), env);
        if (ZVal.isTrue(formatted)) {
            siret =
                    toStringR(function_substr.f.env(env).call(siret, 0, 3).value(), env)
                            + " "
                            + toStringR(function_substr.f.env(env).call(siret, 3, 3).value(), env)
                            + " "
                            + toStringR(function_substr.f.env(env).call(siret, 6, 3).value(), env)
                            + " "
                            + toStringR(function_substr.f.env(env).call(siret, 9, 5).value(), env);
        }

        return ZVal.assign(siret);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "formatted",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object siren(RuntimeEnv env, Object... args) {
        Object formatted = assignParameter(args, 0, true);
        if (null == formatted) {
            formatted = true;
        }
        Object siren = null;
        siren = env.callMethod(this, "numerify", Company.class, "%#######");
        siren =
                toStringR(siren, env)
                        + toStringR(Luhn.runtimeStaticObject.computeCheckDigit(env, siren), env);
        if (ZVal.isTrue(formatted)) {
            siren =
                    toStringR(function_substr.f.env(env).call(siren, 0, 3).value(), env)
                            + " "
                            + toStringR(function_substr.f.env(env).call(siren, 3, 3).value(), env)
                            + " "
                            + toStringR(function_substr.f.env(env).call(siren, 6, 3).value(), env);
        }

        return ZVal.assign(siren);
    }

    public static final Object CONST_class = "Faker\\Provider\\fr_FR\\Company";

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
                    .Company
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "catchPhrase")
        protected Object isCatchPhraseValid(RuntimeEnv env, Object... args) {
            Object catchPhrase = assignParameter(args, 0, false);
            Object beginPos = null;
            Object word = null;
            Object endPos = null;
            for (ZPair zpairResult125 :
                    ZVal.getIterable(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Faker
                                                    .namespaces
                                                    .Provider
                                                    .namespaces
                                                    .fr_FR
                                                    .classes
                                                    .Company
                                                    .RequestStaticProperties
                                                    .class)
                                    .wordsWhichShouldNotAppearTwice,
                            env,
                            true)) {
                word = ZVal.assign(zpairResult125.getValue());
                beginPos = function_strpos.f.env(env).call(catchPhrase, word).value();
                endPos = NamespaceGlobal.strrpos.env(env).call(catchPhrase, word).value();
                if (ZVal.toBool(ZVal.strictNotEqualityCheck(beginPos, "!==", false))
                        && ZVal.toBool(ZVal.notEqualityCheck(beginPos, endPos))) {
                    return ZVal.assign(false);
                }
            }

            return ZVal.assign(true);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object formats =
                ZVal.arrayFromList(
                        "{{lastName}} {{companySuffix}}",
                        "{{lastName}} {{lastName}} {{companySuffix}}",
                        "{{lastName}}",
                        "{{lastName}}");

        public Object catchPhraseFormats =
                ZVal.arrayFromList(
                        "{{catchPhraseNoun}} {{catchPhraseVerb}} {{catchPhraseAttribute}}");

        public Object noun =
                ZVal.arrayFromList(
                        "la s\u00E9curit\u00E9",
                        "le plaisir",
                        "le confort",
                        "la simplicit\u00E9",
                        "l'assurance",
                        "l'art",
                        "le pouvoir",
                        "le droit",
                        "la possibilit\u00E9",
                        "l'avantage",
                        "la libert\u00E9");

        public Object verb =
                ZVal.arrayFromList(
                        "de rouler",
                        "d'avancer",
                        "d'\u00E9voluer",
                        "de changer",
                        "d'innover",
                        "de louer",
                        "d'atteindre vos buts",
                        "de concr\u00E9tiser vos projets");

        public Object attribute =
                ZVal.arrayFromList(
                        "de mani\u00E8re efficace",
                        "plus rapidement",
                        "plus facilement",
                        "plus simplement",
                        "en toute tranquilit\u00E9",
                        "avant-tout",
                        "autrement",
                        "naturellement",
                        "\u00E0 la pointe",
                        "sans soucis",
                        "\u00E0 l'\u00E9tat pur",
                        "\u00E0 sa source",
                        "de mani\u00E8re s\u00FBre",
                        "en toute s\u00E9curit\u00E9");

        public Object companySuffix =
                ZVal.arrayFromList("SA", "S.A.", "SARL", "S.A.R.L.", "SAS", "S.A.S.", "et Fils");

        public Object siretNicFormats = ZVal.arrayFromList("####", "0###", "00#%");

        public Object wordsWhichShouldNotAppearTwice =
                ZVal.arrayFromList("s\u00E9curit\u00E9", "simpl");

        public Object jobTitleFormat =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Agent d'accueil",
                                    "Agent d'enqu\u00EAtes",
                                    "Agent d'entreposage",
                                    "Agent de curage",
                                    "Agro-\u00E9conomiste",
                                    "Aide couvreur",
                                    "Aide \u00E0 domicile",
                                    "Aide-d\u00E9m\u00E9nageur",
                                    "Ambassadeur",
                                    "Analyste t\u00E9l\u00E9matique",
                                    "Animateur d'\u00E9comus\u00E9e",
                                    "Animateur web",
                                    "Appareilleur-gazier",
                                    "Arch\u00E9ologue",
                                    "Armurier d'art",
                                    "Armurier spectacle",
                                    "Artificier spectacle",
                                    "Artiste dramatique",
                                    "Aspigiculteur",
                                    "Assistant de justice",
                                    "Assistant des ventes",
                                    "Assistant logistique",
                                    "Assistant styliste",
                                    "Assurance",
                                    "Auteur-adaptateur",
                                    "Billettiste voyages",
                                    "Brigadier",
                                    "Bruiteur",
                                    "B\u00E2tonnier d'art",
                                    "B\u00FBcheron",
                                    "Cameraman",
                                    "Capitaine de p\u00EAche",
                                    "Carrier",
                                    "Caviste",
                                    "Chansonnier",
                                    "Chanteur",
                                    "Charg\u00E9 de recherche",
                                    "Chasseur-bagagiste",
                                    "Chef de fabrication",
                                    "Chef de scierie",
                                    "Chef des ventes",
                                    "Chef du personnel",
                                    "Chef g\u00E9ographe",
                                    "Chef monteur son",
                                    "Chef porion",
                                    "Chiropraticien",
                                    "Chor\u00E9ologue",
                                    "Chromiste",
                                    "Cintrier-machiniste",
                                    "Clerc hors rang",
                                    "Coach sportif",
                                    "Coffreur b\u00E9ton arm\u00E9",
                                    "Coffreur-ferrailleur",
                                    "Commandant de police",
                                    "Commandant marine",
                                    "Commis de coupe",
                                    "Comptable unique",
                                    "Conception et \u00E9tudes",
                                    "Conducteur de jumbo",
                                    "Conseiller culinaire",
                                    "Conseiller fun\u00E9raire",
                                    "Conseiller relooking",
                                    "Consultant ergonome",
                                    "Contrebassiste",
                                    "Convoyeur garde",
                                    "Copiste offset",
                                    "Corniste",
                                    "Costumier-habilleur",
                                    "Coutelier d'art",
                                    "Cueilleur de cerises",
                                    "C\u00E9ramiste concepteur",
                                    "Danse",
                                    "Danseur",
                                    "Data manager",
                                    "Dee-jay",
                                    "Designer produit",
                                    "Di\u00E9t\u00E9ticien conseil",
                                    "Di\u00E9t\u00E9tique",
                                    "Doreur sur m\u00E9taux",
                                    "D\u00E9corateur-costumier",
                                    "D\u00E9floqueur d'amiante",
                                    "D\u00E9gustateur",
                                    "D\u00E9l\u00E9gu\u00E9 v\u00E9t\u00E9rinaire",
                                    "D\u00E9l\u00E9gu\u00E9 \u00E0 la tutelle",
                                    "D\u00E9samianteur",
                                    "D\u00E9tective",
                                    "D\u00E9veloppeur web",
                                    "Ecotoxicologue",
                                    "Elagueur-botteur",
                                    "Elagueur-grimpeur",
                                    "Elastiqueur",
                                    "Eleveur d'insectes",
                                    "Eleveur de chats",
                                    "Eleveur de volailles",
                                    "Embouteilleur",
                                    "Employ\u00E9 d'accueil",
                                    "Employ\u00E9 d'\u00E9tage",
                                    "Employ\u00E9 de snack-bar",
                                    "Endivier",
                                    "Endocrinologue",
                                    "Epith\u00E9siste",
                                    "Essayeur-retoucheur",
                                    "Etainier",
                                    "Etancheur",
                                    "Etancheur-bardeur",
                                    "Etiqueteur",
                                    "Expert back-office",
                                    "Exploitant de tennis",
                                    "Extraction",
                                    "Facteur",
                                    "Facteur de clavecins",
                                    "Facteur de secteur",
                                    "Fantaisiste",
                                    "Fa\u00E7adier-bardeur",
                                    "Fa\u00E7adier-ravaleur",
                                    "Feutier",
                                    "Finance",
                                    "Flaconneur",
                                    "Foreur p\u00E9trole",
                                    "Formateur d'italien",
                                    "Fossoyeur",
                                    "Fraiseur",
                                    "Fraiseur mouliste",
                                    "Frigoriste maritime",
                                    "Fromager",
                                    "Galeriste",
                                    "Gardien de r\u00E9sidence",
                                    "Gar\u00E7on de chenil",
                                    "Gar\u00E7on de hall",
                                    "Gendarme mobile",
                                    "Guitariste",
                                    "Gyn\u00E9cologue",
                                    "G\u00E9od\u00E9sien",
                                    "G\u00E9ologue prospecteur",
                                    "G\u00E9om\u00E8tre",
                                    "G\u00E9om\u00E8tre du cadastre",
                                    "G\u00E9rant d'h\u00F4tel",
                                    "G\u00E9rant de tutelle",
                                    "G\u00E9riatre",
                                    "Hydroth\u00E9rapie",
                                    "H\u00E9matologue",
                                    "H\u00F4te de caisse",
                                    "Ing\u00E9nieur b\u00E2timent",
                                    "Ing\u00E9nieur du son",
                                    "Ing\u00E9nieur g\u00E9ologue",
                                    "Ing\u00E9nieur g\u00E9om\u00E8tre",
                                    "Ing\u00E9nieur halieute",
                                    "Ing\u00E9nieur logistique",
                                    "Instituteur",
                                    "Jointeur de placage",
                                    "Juge des enfants",
                                    "Juriste financier",
                                    "Kiwiculteur",
                                    "Lexicographe",
                                    "Liftier",
                                    "Litigeur transport",
                                    "Logistique",
                                    "Logop\u00E8de",
                                    "Magicien",
                                    "Manager d'artiste",
                                    "Mannequin d\u00E9tail",
                                    "Maquilleur spectacle",
                                    "Marbrier-poseur",
                                    "Marin grande p\u00EAche",
                                    "Matelassier",
                                    "Ma\u00E7on",
                                    "Ma\u00E7on-fumiste",
                                    "Ma\u00E7onnerie",
                                    "Ma\u00EEtre de ballet",
                                    "Ma\u00EFeuticien",
                                    "Menuisier",
                                    "Miroitier",
                                    "Mod\u00E9liste industriel",
                                    "Moellonneur",
                                    "Moniteur de sport",
                                    "Monteur audiovisuel",
                                    "Monteur de fermettes",
                                    "Monteur de palettes",
                                    "Monteur en si\u00E8ge",
                                    "Monteur prototypiste",
                                    "Monteur-frigoriste",
                                    "Monteur-truquiste",
                                    "Mouleur sable",
                                    "Mouliste drapeur",
                                    "M\u00E9canicien-armurier",
                                    "M\u00E9decin du sport",
                                    "M\u00E9decin scolaire",
                                    "M\u00E9diateur judiciaire",
                                    "M\u00E9diath\u00E9caire",
                                    "Net surfeur surfeuse",
                                    "Oenologue",
                                    "Op\u00E9rateur de plateau",
                                    "Op\u00E9rateur du son",
                                    "Op\u00E9rateur g\u00E9om\u00E8tre",
                                    "Op\u00E9rateur piquage",
                                    "Op\u00E9rateur vid\u00E9o",
                                    "Ouvrier d'abattoir",
                                    "Ouvrier serriste",
                                    "Ouvrier sid\u00E9rurgiste",
                                    "Palefrenier",
                                    "Pal\u00E9ontologue",
                                    "Pareur en abattoir",
                                    "Parfumeur",
                                    "Parqueteur",
                                    "Percepteur",
                                    "Photographe d'art",
                                    "Pilote automobile",
                                    "Pilote de soutireuse",
                                    "Pilote fluvial",
                                    "Piqueur en ganterie",
                                    "Pisteur secouriste",
                                    "Pizza\u00EFolo",
                                    "Plaquiste enduiseur",
                                    "Plasticien",
                                    "Plisseur",
                                    "Poissonnier-traiteur",
                                    "Pontonnier",
                                    "Porion",
                                    "Porteur de hottes",
                                    "Porteur de journaux",
                                    "Portier",
                                    "Poseur de granit",
                                    "Posticheur spectacle",
                                    "Potier",
                                    "Praticien dentaire",
                                    "Praticiens m\u00E9dicaux",
                                    "Premier clerc",
                                    "Preneur de son",
                                    "Primeuriste",
                                    "Professeur d'italien",
                                    "Projeteur b\u00E9ton arm\u00E9",
                                    "Promotion des ventes",
                                    "Pr\u00E9sentateur radio",
                                    "Pyrotechnicien",
                                    "P\u00E9dicure pour bovin",
                                    "P\u00E9dologue",
                                    "P\u00E9dopsychiatre",
                                    "Quincaillier",
                                    "Radio chargeur",
                                    "Ramasseur d'asperges",
                                    "Ramasseur d'endives",
                                    "Ravaleur-ragr\u00E9eur",
                                    "Recherche",
                                    "Recuiseur",
                                    "Relieur-doreur",
                                    "Responsable de salle",
                                    "Responsable t\u00E9l\u00E9coms",
                                    "Revenue Manager",
                                    "Rippeur spectacle",
                                    "Rogneur",
                                    "R\u00E9cup\u00E9rateur",
                                    "R\u00E9dacteur des d\u00E9bats",
                                    "R\u00E9gleur fun\u00E9raire",
                                    "R\u00E9gleur sur tour",
                                    "Sapeur-pompier",
                                    "Scann\u00E9riste",
                                    "Scripte t\u00E9l\u00E9vision",
                                    "Sculpteur sur verre",
                                    "Sc\u00E9nariste",
                                    "Second de cuisine",
                                    "Secr\u00E9taire juridique",
                                    "Semencier",
                                    "Sertisseur",
                                    "Services fun\u00E9raires",
                                    "Solier-moquettiste",
                                    "Sommelier",
                                    "Sophrologue",
                                    "Staffeur",
                                    "Story boarder",
                                    "Stratifieur",
                                    "Stucateur",
                                    "Styliste graphiste",
                                    "Surjeteur-raseur",
                                    "S\u00E9ismologue",
                                    "Technicien agricole",
                                    "Technicien bovin",
                                    "Technicien g\u00E9om\u00E8tre",
                                    "Technicien plateau",
                                    "Technicien \u00E9nergie",
                                    "Terminologue",
                                    "Testeur informatique",
                                    "Toiliste",
                                    "Topographe",
                                    "Tor\u00E9ro",
                                    "Traducteur d'\u00E9dition",
                                    "Traffic manager",
                                    "Trieur de m\u00E9taux",
                                    "Turbinier",
                                    "T\u00E9l\u00E9conseiller",
                                    "T\u00F4lier-traceur",
                                    "Vendeur carreau",
                                    "Vendeur en lingerie",
                                    "Vendeur en meubles",
                                    "Vendeur en \u00E9picerie",
                                    "Verrier d'art",
                                    "Verrier \u00E0 la calotte",
                                    "Verrier \u00E0 la main",
                                    "Verrier \u00E0 main lev\u00E9e",
                                    "Vid\u00E9o-jockey",
                                    "Vitrier");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\fr_FR\\Company")
                    .setLookup(
                            Company.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "attribute",
                            "catchPhraseFormats",
                            "companySuffix",
                            "formats",
                            "jobTitleFormat",
                            "noun",
                            "siretNicFormats",
                            "verb",
                            "wordsWhichShouldNotAppearTwice")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/fr_FR/Company.php")
                    .addExtendsClass("Faker\\Provider\\Company")
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
