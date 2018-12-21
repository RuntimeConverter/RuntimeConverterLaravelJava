package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.tr_TR.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/tr_TR/Color.php

*/

public class Color
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .Color {

    public Color(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Color.class) {
            this.__construct(env, args);
        }
    }

    public Color(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Faker\\Provider\\tr_TR\\Color";

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
                    .Color
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object safeColorNames =
                ZVal.arrayFromList(
                        "siyah",
                        "k\u0131rm\u0131z\u0131",
                        "sar\u0131",
                        "mavi",
                        "turuncu",
                        "ye\u015Fil",
                        "mor",
                        "g\u00FCm\u00FC\u015F",
                        "gri",
                        "pembe");

        public Object allColorNames =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Alev k\u0131rm\u0131z\u0131s\u0131",
                                    "Alice mavisi",
                                    "Alizarin",
                                    "Altun\u00EE",
                                    "Ametist",
                                    "Armut",
                                    "Akuamarin",
                                    "Asker ye\u015Fili",
                                    "Bak\u0131r",
                                    "Barut",
                                    "Batakl\u0131k ye\u015Fili",
                                    "Bebek mavisi",
                                    "Bej",
                                    "Beyaz",
                                    "Bondi mavisi",
                                    "Bordo",
                                    "Bronz",
                                    "Bu\u011Fday",
                                    "Burgonya",
                                    "Camg\u00F6be\u011Fi",
                                    "\u00C7am ye\u015Fili",
                                    "\u00C7ay ye\u015Fili",
                                    "\u00C7elik mavisi",
                                    "\u00C7ikolata",
                                    "\u00C7ivit",
                                    "Deniz mavisi",
                                    "Deniz ye\u015Fili",
                                    "Devedikeni",
                                    "E\u011Frelti ye\u015Fili",
                                    "Elektrik mavisi",
                                    "Elektrik \u00E7ivit",
                                    "Elektrik lime",
                                    "Elektrik mor",
                                    "Falu k\u0131rm\u0131z\u0131s\u0131",
                                    "Fildi\u015Fi",
                                    "Frans\u0131z g\u00FCl",
                                    "Galibarda",
                                    "Gece mavisi",
                                    "G\u00F6k mavisi",
                                    "Gri",
                                    "Gri-ku\u015Fkonmaz",
                                    "G\u00FCl",
                                    "G\u00FCm\u00FC\u015Fi",
                                    "Haki",
                                    "Hardal",
                                    "Havu\u00E7",
                                    "Horozibi\u011Fi",
                                    "\u0130lkbahar ye\u015Fili",
                                    "\u0130slam ye\u015Fili",
                                    "Kabak",
                                    "Kahverengi",
                                    "Kahverengimsi gri",
                                    "Kamufl\u00E2j ye\u015Fili",
                                    "Karanfil pembesi",
                                    "Karanfil",
                                    "Kardinal",
                                    "Karolina mavisi",
                                    "Kay\u0131s\u0131",
                                    "Kehribar",
                                    "Kestane",
                                    "Keten",
                                    "K\u0131rm\u0131z\u0131",
                                    "K\u0131rm\u0131z\u0131ms\u0131 kahverengi",
                                    "K\u0131rm\u0131z\u0131-menek\u015Fe",
                                    "Kiraz k\u0131rm\u0131z\u0131s\u0131",
                                    "Kobalt",
                                    "Kobalt mavisi",
                                    "Koyu galibarda",
                                    "Koyu haki",
                                    "Koyu kahverengi",
                                    "Koyu kestane",
                                    "Koyu k\u0131rm\u0131z\u0131",
                                    "Koyu k\u0131z\u0131l kahverengi",
                                    "Koyu leylak",
                                    "Koyu magenta",
                                    "Koyu mandalina",
                                    "Koyu mavi",
                                    "Koyu menek\u015Fe",
                                    "Koyu mercan",
                                    "Koyu mor",
                                    "Koyu pastel ye\u015Fil",
                                    "Koyu pembe",
                                    "Koyu \u015Feftali",
                                    "Koyu turkuaz",
                                    "Koyu toz mavi",
                                    "Koyu turkuaz",
                                    "Koyu ye\u015Fil",
                                    "K\u00F6sele",
                                    "Krem",
                                    "Kum kahverengisi",
                                    "Ku\u015Fkonmaz",
                                    "Lacivert",
                                    "Lacivert",
                                    "Lavanta",
                                    "Lavanta mavisi",
                                    "Lavender pembesi",
                                    "Lavender greisi",
                                    "Lavender magenta",
                                    "Lavanta pembesi",
                                    "Lavanta mor",
                                    "Lavanta g\u00FCl",
                                    "Limoni",
                                    "A\u00E7\u0131k Limon",
                                    "Leylak",
                                    "Lime",
                                    "Mandalina",
                                    "Malakit",
                                    "Mavi",
                                    "Menek\u015Fe",
                                    "Menek\u015Fe-patl\u0131can",
                                    "M\u0131s\u0131r",
                                    "Mor",
                                    "Morsalk\u0131m",
                                    "Nane ye\u015Fili",
                                    "Nar",
                                    "Navajo beyaz\u0131",
                                    "Okul otob\u00FCs\u00FC sar\u0131s\u0131",
                                    "Parlak mor",
                                    "Pas",
                                    "Pastel pembe",
                                    "Pastel ye\u015Fili",
                                    "Patl\u0131can",
                                    "Pembe",
                                    "Pembe-turuncu",
                                    "Peygamber \u00E7i\u00E7e\u011Fi",
                                    "Prusya mavisi",
                                    "Safran",
                                    "Safir",
                                    "Sar\u0131ms\u0131 kahverengi",
                                    "Sar\u0131ms\u0131 pembe",
                                    "Sar\u0131",
                                    "Sar\u0131",
                                    "Siyah\u0131ms\u0131 koyu kahverengi",
                                    "Soluk sar\u0131",
                                    "\u015Eeftali",
                                    "\u015Eeftali-turuncu",
                                    "\u015Eeftali-sar\u0131",
                                    "Tar\u00E7\u0131n",
                                    "Teal",
                                    "Toz mavi",
                                    "Turkuaz",
                                    "Turuncumsu sar\u0131",
                                    "Turuncu",
                                    "Turuncumsu sar\u0131",
                                    "Ye\u015Fil",
                                    "Ye\u015Fil-sar\u0131",
                                    "Yonca ye\u015Fili",
                                    "Yosun ye\u015Fili",
                                    "Zeytuni",
                                    "Z\u00FCmr\u00FCt ye\u015Fili",
                                    "Yan\u0131k turuncu",
                                    "Yan\u0131k Toprak",
                                    "Kardinal",
                                    "\u015Earap",
                                    "Celadon",
                                    "Berrak mavi",
                                    "G\u00F6k mavisi",
                                    "G\u00FCl",
                                    "Mercan",
                                    "Mercan K\u0131rm\u0131z\u0131s\u0131",
                                    "K\u0131pk\u0131rm\u0131z\u0131",
                                    "Hile mavisi",
                                    "Alt\u0131n\u0131ms\u0131",
                                    "Soytar\u0131",
                                    "Si\u011Fil otu",
                                    "Holivod k\u0131rm\u0131z\u0131s\u0131",
                                    "S\u0131cak Magenta",
                                    "S\u0131cak pembe",
                                    "Uluslararas\u0131 Klein mavisi",
                                    "Enternasyonal turuncu",
                                    "Ye\u015Fim",
                                    "Orta \u015Farap",
                                    "Orta Mor",
                                    "Da\u011F pembesi",
                                    "A\u015F\u0131 boyas\u0131",
                                    "Eski alt\u0131n",
                                    "Eski iplik",
                                    "Eski Lavanta",
                                    "Eski g\u00FCl",
                                    "Zeytin Kahverengisi",
                                    "Donuk turuncu",
                                    "Papaya",
                                    "Periwinkle",
                                    "Pers mavisi",
                                    "Pers ye\u015Fili",
                                    "Persian lacivert",
                                    "Pers pembesi",
                                    "Persian k\u0131rm\u0131z\u0131s\u0131",
                                    "Pers g\u00FCl\u00FC",
                                    "Ham toprak",
                                    "K\u0131z\u0131l yumurta mavisi",
                                    "Kraliyet mavisi",
                                    "K\u0131rm\u0131z\u0131 \u015Farap",
                                    "K\u0131rm\u0131z\u0131",
                                    "Deniz kabu\u011Fu",
                                    "Ayr\u0131k sar\u0131",
                                    "Vurgun pembe",
                                    "Salamura grisi",
                                    "Tenn\u00E9 (Tawny)",
                                    "K\u00FC\u00E7\u00FCk kara",
                                    "Lacivert",
                                    "Viridian",
                                    "Zinnwaldite");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\tr_TR\\Color")
                    .setLookup(
                            Color.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("allColorNames", "safeColorNames")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/tr_TR/Color.php")
                    .addExtendsClass("Faker\\Provider\\Color")
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
