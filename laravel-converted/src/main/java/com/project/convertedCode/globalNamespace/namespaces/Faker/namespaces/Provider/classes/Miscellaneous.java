package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes.Base;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/Miscellaneous.php

*/

public class Miscellaneous extends Base {

    public Miscellaneous(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Miscellaneous.class) {
            this.__construct(env, args);
        }
    }

    public Miscellaneous(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Faker\\Provider\\Miscellaneous";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Base.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod(name = "boolean")
        @ConvertedParameter(
            index = 0,
            name = "chanceOfGettingTrue",
            defaultValue = "50",
            defaultValueType = "number"
        )
        public Object _pBoolean(RuntimeEnv env, Object... args) {
            Object chanceOfGettingTrue = assignParameter(args, 0, true);
            if (null == chanceOfGettingTrue) {
                chanceOfGettingTrue = 50;
            }
            return ZVal.assign(
                    ZVal.isLessThanOrEqualTo(
                            NamespaceGlobal.mt_rand.env(env).call(1, 100).value(),
                            "<=",
                            chanceOfGettingTrue));
        }

        @ConvertedMethod
        public Object md5(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    NamespaceGlobal.md5
                            .env(env)
                            .call(NamespaceGlobal.mt_rand.env(env).call().value())
                            .value());
        }

        @ConvertedMethod
        public Object sha1(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    NamespaceGlobal.sha1
                            .env(env)
                            .call(NamespaceGlobal.mt_rand.env(env).call().value())
                            .value());
        }

        @ConvertedMethod
        public Object sha256(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    NamespaceGlobal.hash
                            .env(env)
                            .call("sha256", NamespaceGlobal.mt_rand.env(env).call().value())
                            .value());
        }

        @ConvertedMethod
        public Object locale(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Miscellaneous.class)
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
                                                            .classes
                                                            .Miscellaneous
                                                            .RequestStaticProperties
                                                            .class)
                                            .localeData)
                            .value());
        }

        @ConvertedMethod
        public Object countryCode(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Miscellaneous.class)
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
                                                            .classes
                                                            .Miscellaneous
                                                            .RequestStaticProperties
                                                            .class)
                                            .countryCode)
                            .value());
        }

        @ConvertedMethod
        public Object countryISOAlpha3(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Miscellaneous.class)
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
                                                            .classes
                                                            .Miscellaneous
                                                            .RequestStaticProperties
                                                            .class)
                                            .countryISOAlpha3)
                            .value());
        }

        @ConvertedMethod
        public Object languageCode(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Miscellaneous.class)
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
                                                            .classes
                                                            .Miscellaneous
                                                            .RequestStaticProperties
                                                            .class)
                                            .languageCode)
                            .value());
        }

        @ConvertedMethod
        public Object currencyCode(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Miscellaneous.class)
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
                                                            .classes
                                                            .Miscellaneous
                                                            .RequestStaticProperties
                                                            .class)
                                            .currencyCode)
                            .value());
        }

        @ConvertedMethod
        public Object emoji(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    NamespaceGlobal.json_decode
                            .env(env)
                            .call(
                                    "\""
                                            + toStringR(
                                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                    env, this, Miscellaneous.class)
                                                            .method("randomElement")
                                                            .addReferenceArgs(
                                                                    new RuntimeArgsWithReferences())
                                                            .call(
                                                                    env.getRequestStaticProperties(
                                                                                    com.project
                                                                                            .convertedCode
                                                                                            .globalNamespace
                                                                                            .namespaces
                                                                                            .Faker
                                                                                            .namespaces
                                                                                            .Provider
                                                                                            .classes
                                                                                            .Miscellaneous
                                                                                            .RequestStaticProperties
                                                                                            .class)
                                                                            .emoji)
                                                            .value(),
                                                    env)
                                            + "\"")
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object emoji =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\\uD83D\\uDE00",
                                    "\\uD83D\\uDE01",
                                    "\\uD83D\\uDE02",
                                    "\\uD83D\\uDE03",
                                    "\\uD83D\\uDE04",
                                    "\\uD83D\\uDE05",
                                    "\\uD83D\\uDE06",
                                    "\\uD83D\\uDE07",
                                    "\\uD83D\\uDE08",
                                    "\\uD83D\\uDE09",
                                    "\\uD83D\\uDE0A",
                                    "\\uD83D\\uDE0B",
                                    "\\uD83D\\uDE0C",
                                    "\\uD83D\\uDE0D",
                                    "\\uD83D\\uDE0E",
                                    "\\uD83D\\uDE0F",
                                    "\\uD83D\\uDE10",
                                    "\\uD83D\\uDE11",
                                    "\\uD83D\\uDE12",
                                    "\\uD83D\\uDE13",
                                    "\\uD83D\\uDE14",
                                    "\\uD83D\\uDE15",
                                    "\\uD83D\\uDE16",
                                    "\\uD83D\\uDE17",
                                    "\\uD83D\\uDE18",
                                    "\\uD83D\\uDE19",
                                    "\\uD83D\\uDE1A",
                                    "\\uD83D\\uDE1B",
                                    "\\uD83D\\uDE1C",
                                    "\\uD83D\\uDE1D",
                                    "\\uD83D\\uDE1E",
                                    "\\uD83D\\uDE1F",
                                    "\\uD83D\\uDE20",
                                    "\\uD83D\\uDE21",
                                    "\\uD83D\\uDE22",
                                    "\\uD83D\\uDE23",
                                    "\\uD83D\\uDE24",
                                    "\\uD83D\\uDE25",
                                    "\\uD83D\\uDE26",
                                    "\\uD83D\\uDE27",
                                    "\\uD83D\\uDE28",
                                    "\\uD83D\\uDE29",
                                    "\\uD83D\\uDE2A",
                                    "\\uD83D\\uDE2B",
                                    "\\uD83D\\uDE2C",
                                    "\\uD83D\\uDE2D",
                                    "\\uD83D\\uDE2E",
                                    "\\uD83D\\uDE2F",
                                    "\\uD83D\\uDE30",
                                    "\\uD83D\\uDE31",
                                    "\\uD83D\\uDE32",
                                    "\\uD83D\\uDE33",
                                    "\\uD83D\\uDE34",
                                    "\\uD83D\\uDE35",
                                    "\\uD83D\\uDE36",
                                    "\\uD83D\\uDE37");
                        });

        public Object languageCode =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "aa", "ab", "ae", "af", "ak", "am", "an", "ar", "as", "av",
                                    "ay", "az", "ba", "be", "bg", "bh", "bi", "bm", "bn", "bo",
                                    "br", "bs", "ca", "ce", "ch", "co", "cr", "cs", "cu", "cv",
                                    "cy", "da", "de", "dv", "dz", "ee", "el", "en", "eo", "es",
                                    "et", "eu", "fa", "ff", "fi", "fj", "fo", "fr", "fy", "ga",
                                    "gd", "gl", "gn", "gu", "gv", "ha", "he", "hi", "ho", "hr",
                                    "ht", "hu", "hy", "hz", "ia", "id", "ie", "ig", "ii", "ik",
                                    "io", "is", "it", "iu", "ja", "jv", "ka", "kg", "ki", "kj",
                                    "kk", "kl", "km", "kn", "ko", "kr", "ks", "ku", "kv", "kw",
                                    "ky", "la", "lb", "lg", "li", "ln", "lo", "lt", "lu", "lv",
                                    "mg", "mh", "mi", "mk", "ml", "mn", "mr", "ms", "mt", "my",
                                    "na", "nb", "nd", "ne", "ng", "nl", "nn", "no", "nr", "nv",
                                    "ny", "oc", "oj", "om", "or", "os", "pa", "pi", "pl", "ps",
                                    "pt", "qu", "rm", "rn", "ro", "ru", "rw", "sa", "sc", "sd",
                                    "se", "sg", "si", "sk", "sl", "sm", "sn", "so", "sq", "sr",
                                    "ss", "st", "su", "sv", "sw", "ta", "te", "tg", "th", "ti",
                                    "tk", "tl", "tn", "to", "tr", "ts", "tt", "tw", "ty", "ug",
                                    "uk", "ur", "uz", "ve", "vi", "vo", "wa", "wo", "xh", "yi",
                                    "yo", "za", "zh", "zu");
                        });

        public Object countryCode =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR",
                                    "AS", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE",
                                    "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ",
                                    "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CC", "CD",
                                    "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR",
                                    "CU", "CV", "CW", "CX", "CY", "CZ", "DE", "DJ", "DK", "DM",
                                    "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI",
                                    "FJ", "FK", "FM", "FO", "FR", "GA", "GB", "GD", "GE", "GF",
                                    "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS",
                                    "GT", "GU", "GW", "GY", "HK", "HM", "HN", "HR", "HT", "HU",
                                    "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IR", "IS", "IT",
                                    "JE", "JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN",
                                    "KP", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK",
                                    "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME",
                                    "MF", "MG", "MH", "MK", "ML", "MM", "MN", "MO", "MP", "MQ",
                                    "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA",
                                    "NC", "NE", "NF", "NG", "NI", "NL", "NO", "NP", "NR", "NU",
                                    "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM",
                                    "PN", "PR", "PS", "PT", "PW", "PY", "QA", "RE", "RO", "RS",
                                    "RU", "RW", "SA", "SB", "SC", "SD", "SE", "SG", "SH", "SI",
                                    "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV",
                                    "SX", "SY", "SZ", "TC", "TD", "TF", "TG", "TH", "TJ", "TK",
                                    "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA",
                                    "UG", "UM", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VI",
                                    "VN", "VU", "WF", "WS", "YE", "YT", "ZA", "ZM", "ZW");
                        });

        public Object countryISOAlpha3 =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "ABW", "AFG", "AGO", "AIA", "ALA", "ALB", "AND", "ARE", "ARG",
                                    "ARM", "ASM", "ATA", "ATF", "ATG", "AUS", "AUT", "AZE", "BDI",
                                    "BEL", "BEN", "BES", "BFA", "BGD", "BGR", "BHR", "BHS", "BIH",
                                    "BLM", "BLR", "BLZ", "BMU", "BOL", "BRA", "BRB", "BRN", "BTN",
                                    "BVT", "BWA", "CAF", "CAN", "CCK", "CHE", "CHL", "CHN", "CIV",
                                    "CMR", "COD", "COG", "COK", "COL", "COM", "CPV", "CRI", "CUB",
                                    "CUW", "CXR", "CYM", "CYP", "CZE", "DEU", "DJI", "DMA", "DNK",
                                    "DOM", "DZA", "ECU", "EGY", "ERI", "ESH", "ESP", "EST", "ETH",
                                    "FIN", "FJI", "FLK", "FRA", "FRO", "FSM", "GAB", "GBR", "GEO",
                                    "GGY", "GHA", "GIB", "GIN", "GLP", "GMB", "GNB", "GNQ", "GRC",
                                    "GRD", "GRL", "GTM", "GUF", "GUM", "GUY", "HKG", "HMD", "HND",
                                    "HRV", "HTI", "HUN", "IDN", "IMN", "IND", "IOT", "IRL", "IRN",
                                    "IRQ", "ISL", "ISR", "ITA", "JAM", "JEY", "JOR", "JPN", "KAZ",
                                    "KEN", "KGZ", "KHM", "KIR", "KNA", "KOR", "KWT", "LAO", "LBN",
                                    "LBR", "LBY", "LCA", "LIE", "LKA", "LSO", "LTU", "LUX", "LVA",
                                    "MAC", "MAF", "MAR", "MCO", "MDA", "MDG", "MDV", "MEX", "MHL",
                                    "MKD", "MLI", "MLT", "MMR", "MNE", "MNG", "MNP", "MOZ", "MRT",
                                    "MSR", "MTQ", "MUS", "MWI", "MYS", "MYT", "NAM", "NCL", "NER",
                                    "NFK", "NGA", "NIC", "NIU", "NLD", "NOR", "NPL", "NRU", "NZL",
                                    "OMN", "PAK", "PAN", "PCN", "PER", "PHL", "PLW", "PNG", "POL",
                                    "PRI", "PRK", "PRT", "PRY", "PSE", "PYF", "QAT", "REU", "ROU",
                                    "RUS", "RWA", "SAU", "SDN", "SEN", "SGP", "SGS", "SHN", "SJM",
                                    "SLB", "SLE", "SLV", "SMR", "SOM", "SPM", "SRB", "SSD", "STP",
                                    "SUR", "SVK", "SVN", "SWE", "SWZ", "SXM", "SYC", "SYR", "TCA",
                                    "TCD", "TGO", "THA", "TJK", "TKL", "TKM", "TLS", "TON", "TTO",
                                    "TUN", "TUR", "TUV", "TWN", "TZA", "UGA", "UKR", "UMI", "URY",
                                    "USA", "UZB", "VAT", "VCT", "VEN", "VGB", "VIR", "VNM", "VUT",
                                    "WLF", "WSM", "YEM", "ZAF", "ZMB", "ZWE");
                        });

        public Object localeData =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "aa_DJ", "aa_ER", "aa_ET", "af_NA", "af_ZA", "ak_GH", "am_ET",
                                    "ar_AE", "ar_BH", "ar_DZ", "ar_EG", "ar_IQ", "ar_JO", "ar_KW",
                                    "ar_LB", "ar_LY", "ar_MA", "ar_OM", "ar_QA", "ar_SA", "ar_SD",
                                    "ar_SY", "ar_TN", "ar_YE", "as_IN", "az_AZ", "be_BY", "bg_BG",
                                    "bn_BD", "bn_IN", "bo_CN", "bo_IN", "bs_BA", "byn_ER", "ca_ES",
                                    "cch_NG", "cs_CZ", "cy_GB", "da_DK", "de_AT", "de_BE", "de_CH",
                                    "de_DE", "de_LI", "de_LU", "dv_MV", "dz_BT", "ee_GH", "ee_TG",
                                    "el_CY", "el_GR", "en_AS", "en_AU", "en_BE", "en_BW", "en_BZ",
                                    "en_CA", "en_GB", "en_GU", "en_HK", "en_IE", "en_IN", "en_JM",
                                    "en_MH", "en_MP", "en_MT", "en_NA", "en_NZ", "en_PH", "en_PK",
                                    "en_SG", "en_TT", "en_UM", "en_US", "en_VI", "en_ZA", "en_ZW",
                                    "es_AR", "es_BO", "es_CL", "es_CO", "es_CR", "es_DO", "es_EC",
                                    "es_ES", "es_GT", "es_HN", "es_MX", "es_NI", "es_PA", "es_PE",
                                    "es_PR", "es_PY", "es_SV", "es_US", "es_UY", "es_VE", "et_EE",
                                    "eu_ES", "fa_AF", "fa_IR", "fi_FI", "fil_PH", "fo_FO", "fr_BE",
                                    "fr_CA", "fr_CH", "fr_FR", "fr_LU", "fr_MC", "fr_SN", "fur_IT",
                                    "ga_IE", "gaa_GH", "gez_ER", "gez_ET", "gl_ES", "gsw_CH",
                                    "gu_IN", "gv_GB", "ha_GH", "ha_NE", "ha_NG", "ha_SD", "haw_US",
                                    "he_IL", "hi_IN", "hr_HR", "hu_HU", "hy_AM", "id_ID", "ig_NG",
                                    "ii_CN", "is_IS", "it_CH", "it_IT", "ja_JP", "ka_GE", "kaj_NG",
                                    "kam_KE", "kcg_NG", "kfo_CI", "kk_KZ", "kl_GL", "km_KH",
                                    "kn_IN", "ko_KR", "kok_IN", "kpe_GN", "kpe_LR", "ku_IQ",
                                    "ku_IR", "ku_SY", "ku_TR", "kw_GB", "ky_KG", "ln_CD", "ln_CG",
                                    "lo_LA", "lt_LT", "lv_LV", "mk_MK", "ml_IN", "mn_CN", "mn_MN",
                                    "mr_IN", "ms_BN", "ms_MY", "mt_MT", "my_MM", "nb_NO", "nds_DE",
                                    "ne_IN", "ne_NP", "nl_BE", "nl_NL", "nn_NO", "nr_ZA", "nso_ZA",
                                    "ny_MW", "oc_FR", "om_ET", "om_KE", "or_IN", "pa_IN", "pa_PK",
                                    "pl_PL", "ps_AF", "pt_BR", "pt_PT", "ro_MD", "ro_RO", "ru_RU",
                                    "ru_UA", "rw_RW", "sa_IN", "se_FI", "se_NO", "sh_BA", "sh_CS",
                                    "sh_YU", "si_LK", "sid_ET", "sk_SK", "sl_SI", "so_DJ", "so_ET",
                                    "so_KE", "so_SO", "sq_AL", "sr_BA", "sr_CS", "sr_ME", "sr_RS",
                                    "sr_YU", "ss_SZ", "ss_ZA", "st_LS", "st_ZA", "sv_FI", "sv_SE",
                                    "sw_KE", "sw_TZ", "syr_SY", "ta_IN", "te_IN", "tg_TJ", "th_TH",
                                    "ti_ER", "ti_ET", "tig_ER", "tn_ZA", "to_TO", "tr_TR", "trv_TW",
                                    "ts_ZA", "tt_RU", "ug_CN", "uk_UA", "ur_IN", "ur_PK", "uz_AF",
                                    "uz_UZ", "ve_ZA", "vi_VN", "wal_ET", "wo_SN", "xh_ZA", "yo_NG",
                                    "zh_CN", "zh_HK", "zh_MO", "zh_SG", "zh_TW", "zu_ZA");
                        });

        public Object currencyCode =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG",
                                    "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND",
                                    "BOB", "BRL", "BSD", "BTN", "BWP", "BYN", "BZD", "CAD", "CDF",
                                    "CHF", "CLP", "CNY", "COP", "CRC", "CUC", "CUP", "CVE", "CZK",
                                    "DJF", "DKK", "DOP", "DZD", "EGP", "ERN", "ETB", "EUR", "FJD",
                                    "FKP", "GBP", "GEL", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD",
                                    "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "INR", "IQD",
                                    "IRR", "ISK", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF",
                                    "KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD",
                                    "LSL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP",
                                    "MRO", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN",
                                    "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP",
                                    "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR",
                                    "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SRD",
                                    "SSP", "STD", "SVC", "SYP", "SZL", "THB", "TJS", "TMT", "TND",
                                    "TOP", "TRY", "TTD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU",
                                    "UZS", "VEF", "VND", "VUV", "WST", "XAF", "XCD", "XOF", "XPF",
                                    "YER", "ZAR", "ZMW", "ZWL");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\Miscellaneous")
                    .setLookup(
                            Miscellaneous.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "countryCode",
                            "countryISOAlpha3",
                            "currencyCode",
                            "emoji",
                            "languageCode",
                            "localeData")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/Miscellaneous.php")
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
