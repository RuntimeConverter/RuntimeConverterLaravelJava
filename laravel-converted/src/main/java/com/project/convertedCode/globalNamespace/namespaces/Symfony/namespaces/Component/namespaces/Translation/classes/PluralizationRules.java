package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/PluralizationRules.php

*/

public class PluralizationRules extends RuntimeClassBase {

    public PluralizationRules(RuntimeEnv env, Object... args) {
        super(env);
    }

    public PluralizationRules(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Symfony\\Component\\Translation\\PluralizationRules";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "number")
        @ConvertedParameter(index = 1, name = "locale")
        public Object get(RuntimeEnv env, Object... args) {
            Object number = assignParameter(args, 0, false);
            Object locale = assignParameter(args, 1, false);
            Object _pReturn = null;
            if (ZVal.strictEqualityCheck("pt_BR", "===", locale)) {
                locale = "xbr";
            }

            if (ZVal.isGreaterThan(function_strlen.f.env(env).call(locale).value(), '>', 3)) {
                locale =
                        function_substr
                                .f
                                .env(env)
                                .call(
                                        locale,
                                        0,
                                        ZVal.minusSign(
                                                function_strlen
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                NamespaceGlobal.strrchr
                                                                        .env(env)
                                                                        .call(locale, "_")
                                                                        .value())
                                                        .value()))
                                .value();
            }

            if (arrayActionR(
                    ArrayAction.ISSET,
                    env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Symfony
                                    .namespaces
                                    .Component
                                    .namespaces
                                    .Translation
                                    .classes
                                    .PluralizationRules
                                    .RequestStaticProperties
                                    .class,
                            "rules"),
                    env,
                    locale)) {
                _pReturn =
                        function_call_user_func
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(
                                        env.getRequestStaticPropertiesReference(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Symfony
                                                                .namespaces
                                                                .Component
                                                                .namespaces
                                                                .Translation
                                                                .classes
                                                                .PluralizationRules
                                                                .RequestStaticProperties
                                                                .class,
                                                        "rules")
                                                .arrayGet(env, locale),
                                        number)
                                .value();
                if (ZVal.toBool(!function_is_int.f.env(env).call(_pReturn).getBool())
                        || ZVal.toBool(ZVal.isLessThan(_pReturn, '<', 0))) {
                    return 0;
                }

                return ZVal.assign(_pReturn);
            }

            SwitchEnumType140 switchVariable140 =
                    ZVal.getEnum(
                            locale,
                            SwitchEnumType140.DEFAULT_CASE,
                            SwitchEnumType140.STRING_az,
                            "az",
                            SwitchEnumType140.STRING_bo,
                            "bo",
                            SwitchEnumType140.STRING_dz,
                            "dz",
                            SwitchEnumType140.STRING_id,
                            "id",
                            SwitchEnumType140.STRING_ja,
                            "ja",
                            SwitchEnumType140.STRING_jv,
                            "jv",
                            SwitchEnumType140.STRING_ka,
                            "ka",
                            SwitchEnumType140.STRING_km,
                            "km",
                            SwitchEnumType140.STRING_kn,
                            "kn",
                            SwitchEnumType140.STRING_ko,
                            "ko",
                            SwitchEnumType140.STRING_ms,
                            "ms",
                            SwitchEnumType140.STRING_th,
                            "th",
                            SwitchEnumType140.STRING_tr,
                            "tr",
                            SwitchEnumType140.STRING_vi,
                            "vi",
                            SwitchEnumType140.STRING_zh,
                            "zh",
                            SwitchEnumType140.STRING_af,
                            "af",
                            SwitchEnumType140.STRING_bn,
                            "bn",
                            SwitchEnumType140.STRING_bg,
                            "bg",
                            SwitchEnumType140.STRING_ca,
                            "ca",
                            SwitchEnumType140.STRING_da,
                            "da",
                            SwitchEnumType140.STRING_de,
                            "de",
                            SwitchEnumType140.STRING_el,
                            "el",
                            SwitchEnumType140.STRING_en,
                            "en",
                            SwitchEnumType140.STRING_eo,
                            "eo",
                            SwitchEnumType140.STRING_es,
                            "es",
                            SwitchEnumType140.STRING_et,
                            "et",
                            SwitchEnumType140.STRING_eu,
                            "eu",
                            SwitchEnumType140.STRING_fa,
                            "fa",
                            SwitchEnumType140.STRING_fi,
                            "fi",
                            SwitchEnumType140.STRING_fo,
                            "fo",
                            SwitchEnumType140.STRING_fur,
                            "fur",
                            SwitchEnumType140.STRING_fy,
                            "fy",
                            SwitchEnumType140.STRING_gl,
                            "gl",
                            SwitchEnumType140.STRING_gu,
                            "gu",
                            SwitchEnumType140.STRING_ha,
                            "ha",
                            SwitchEnumType140.STRING_he,
                            "he",
                            SwitchEnumType140.STRING_hu,
                            "hu",
                            SwitchEnumType140.STRING_is,
                            "is",
                            SwitchEnumType140.STRING_it,
                            "it",
                            SwitchEnumType140.STRING_ku,
                            "ku",
                            SwitchEnumType140.STRING_lb,
                            "lb",
                            SwitchEnumType140.STRING_ml,
                            "ml",
                            SwitchEnumType140.STRING_mn,
                            "mn",
                            SwitchEnumType140.STRING_mr,
                            "mr",
                            SwitchEnumType140.STRING_nah,
                            "nah",
                            SwitchEnumType140.STRING_nb,
                            "nb",
                            SwitchEnumType140.STRING_ne,
                            "ne",
                            SwitchEnumType140.STRING_nl,
                            "nl",
                            SwitchEnumType140.STRING_nn,
                            "nn",
                            SwitchEnumType140.STRING_no,
                            "no",
                            SwitchEnumType140.STRING_oc,
                            "oc",
                            SwitchEnumType140.STRING_om,
                            "om",
                            SwitchEnumType140.STRING_or,
                            "or",
                            SwitchEnumType140.STRING_pa,
                            "pa",
                            SwitchEnumType140.STRING_pap,
                            "pap",
                            SwitchEnumType140.STRING_ps,
                            "ps",
                            SwitchEnumType140.STRING_pt,
                            "pt",
                            SwitchEnumType140.STRING_so,
                            "so",
                            SwitchEnumType140.STRING_sq,
                            "sq",
                            SwitchEnumType140.STRING_sv,
                            "sv",
                            SwitchEnumType140.STRING_sw,
                            "sw",
                            SwitchEnumType140.STRING_ta,
                            "ta",
                            SwitchEnumType140.STRING_te,
                            "te",
                            SwitchEnumType140.STRING_tk,
                            "tk",
                            SwitchEnumType140.STRING_ur,
                            "ur",
                            SwitchEnumType140.STRING_zu,
                            "zu",
                            SwitchEnumType140.STRING_am,
                            "am",
                            SwitchEnumType140.STRING_bh,
                            "bh",
                            SwitchEnumType140.STRING_fil,
                            "fil",
                            SwitchEnumType140.STRING_fr,
                            "fr",
                            SwitchEnumType140.STRING_gun,
                            "gun",
                            SwitchEnumType140.STRING_hi,
                            "hi",
                            SwitchEnumType140.STRING_hy,
                            "hy",
                            SwitchEnumType140.STRING_ln,
                            "ln",
                            SwitchEnumType140.STRING_mg,
                            "mg",
                            SwitchEnumType140.STRING_nso,
                            "nso",
                            SwitchEnumType140.STRING_xbr,
                            "xbr",
                            SwitchEnumType140.STRING_ti,
                            "ti",
                            SwitchEnumType140.STRING_wa,
                            "wa",
                            SwitchEnumType140.STRING_be,
                            "be",
                            SwitchEnumType140.STRING_bs,
                            "bs",
                            SwitchEnumType140.STRING_hr,
                            "hr",
                            SwitchEnumType140.STRING_ru,
                            "ru",
                            SwitchEnumType140.STRING_sr,
                            "sr",
                            SwitchEnumType140.STRING_uk,
                            "uk",
                            SwitchEnumType140.STRING_cs,
                            "cs",
                            SwitchEnumType140.STRING_sk,
                            "sk",
                            SwitchEnumType140.STRING_ga,
                            "ga",
                            SwitchEnumType140.STRING_lt,
                            "lt",
                            SwitchEnumType140.STRING_sl,
                            "sl",
                            SwitchEnumType140.STRING_mk,
                            "mk",
                            SwitchEnumType140.STRING_mt,
                            "mt",
                            SwitchEnumType140.STRING_lv,
                            "lv",
                            SwitchEnumType140.STRING_pl,
                            "pl",
                            SwitchEnumType140.STRING_cy,
                            "cy",
                            SwitchEnumType140.STRING_ro,
                            "ro",
                            SwitchEnumType140.STRING_ar,
                            "ar");
            switch (switchVariable140) {
                case STRING_az:
                case STRING_bo:
                case STRING_dz:
                case STRING_id:
                case STRING_ja:
                case STRING_jv:
                case STRING_ka:
                case STRING_km:
                case STRING_kn:
                case STRING_ko:
                case STRING_ms:
                case STRING_th:
                case STRING_tr:
                case STRING_vi:
                case STRING_zh:
                    return 0;
                case STRING_af:
                case STRING_bn:
                case STRING_bg:
                case STRING_ca:
                case STRING_da:
                case STRING_de:
                case STRING_el:
                case STRING_en:
                case STRING_eo:
                case STRING_es:
                case STRING_et:
                case STRING_eu:
                case STRING_fa:
                case STRING_fi:
                case STRING_fo:
                case STRING_fur:
                case STRING_fy:
                case STRING_gl:
                case STRING_gu:
                case STRING_ha:
                case STRING_he:
                case STRING_hu:
                case STRING_is:
                case STRING_it:
                case STRING_ku:
                case STRING_lb:
                case STRING_ml:
                case STRING_mn:
                case STRING_mr:
                case STRING_nah:
                case STRING_nb:
                case STRING_ne:
                case STRING_nl:
                case STRING_nn:
                case STRING_no:
                case STRING_oc:
                case STRING_om:
                case STRING_or:
                case STRING_pa:
                case STRING_pap:
                case STRING_ps:
                case STRING_pt:
                case STRING_so:
                case STRING_sq:
                case STRING_sv:
                case STRING_sw:
                case STRING_ta:
                case STRING_te:
                case STRING_tk:
                case STRING_ur:
                case STRING_zu:
                    return ZVal.assign(ZVal.equalityCheck(1, number) ? 0 : 1);
                case STRING_am:
                case STRING_bh:
                case STRING_fil:
                case STRING_fr:
                case STRING_gun:
                case STRING_hi:
                case STRING_hy:
                case STRING_ln:
                case STRING_mg:
                case STRING_nso:
                case STRING_xbr:
                case STRING_ti:
                case STRING_wa:
                    return ZVal.assign(
                            ZVal.toBool(ZVal.equalityCheck(0, number))
                                            || ZVal.toBool(ZVal.equalityCheck(1, number))
                                    ? 0
                                    : 1);
                case STRING_be:
                case STRING_bs:
                case STRING_hr:
                case STRING_ru:
                case STRING_sr:
                case STRING_uk:
                    return ZVal.assign(
                            ZVal.toBool(ZVal.equalityCheck(1, ZVal.modulus(number, 10)))
                                            && ZVal.toBool(
                                                    ZVal.notEqualityCheck(
                                                            11, ZVal.modulus(number, 100)))
                                    ? 0
                                    : ZVal.toBool(
                                                            ZVal.toBool(
                                                                            ZVal
                                                                                    .isGreaterThanOrEqualTo(
                                                                                            ZVal
                                                                                                    .modulus(
                                                                                                            number,
                                                                                                            10),
                                                                                            ">=",
                                                                                            2))
                                                                    && ZVal.toBool(
                                                                            ZVal
                                                                                    .isLessThanOrEqualTo(
                                                                                            ZVal
                                                                                                    .modulus(
                                                                                                            number,
                                                                                                            10),
                                                                                            "<=",
                                                                                            4)))
                                                    && ZVal.toBool(
                                                            ZVal.toBool(
                                                                            ZVal.isLessThan(
                                                                                    ZVal.modulus(
                                                                                            number,
                                                                                            100),
                                                                                    '<',
                                                                                    10))
                                                                    || ZVal.toBool(
                                                                            ZVal
                                                                                    .isGreaterThanOrEqualTo(
                                                                                            ZVal
                                                                                                    .modulus(
                                                                                                            number,
                                                                                                            100),
                                                                                            ">=",
                                                                                            20)))
                                            ? 1
                                            : 2);
                case STRING_cs:
                case STRING_sk:
                    return ZVal.assign(
                            ZVal.equalityCheck(1, number)
                                    ? 0
                                    : ZVal.toBool(ZVal.isGreaterThanOrEqualTo(number, ">=", 2))
                                                    && ZVal.toBool(
                                                            ZVal.isLessThanOrEqualTo(
                                                                    number, "<=", 4))
                                            ? 1
                                            : 2);
                case STRING_ga:
                    return ZVal.assign(
                            ZVal.equalityCheck(1, number)
                                    ? 0
                                    : ZVal.equalityCheck(2, number) ? 1 : 2);
                case STRING_lt:
                    return ZVal.assign(
                            ZVal.toBool(ZVal.equalityCheck(1, ZVal.modulus(number, 10)))
                                            && ZVal.toBool(
                                                    ZVal.notEqualityCheck(
                                                            11, ZVal.modulus(number, 100)))
                                    ? 0
                                    : ZVal.toBool(
                                                            ZVal.isGreaterThanOrEqualTo(
                                                                    ZVal.modulus(number, 10),
                                                                    ">=",
                                                                    2))
                                                    && ZVal.toBool(
                                                            ZVal.toBool(
                                                                            ZVal.isLessThan(
                                                                                    ZVal.modulus(
                                                                                            number,
                                                                                            100),
                                                                                    '<',
                                                                                    10))
                                                                    || ZVal.toBool(
                                                                            ZVal
                                                                                    .isGreaterThanOrEqualTo(
                                                                                            ZVal
                                                                                                    .modulus(
                                                                                                            number,
                                                                                                            100),
                                                                                            ">=",
                                                                                            20)))
                                            ? 1
                                            : 2);
                case STRING_sl:
                    return ZVal.assign(
                            ZVal.equalityCheck(1, ZVal.modulus(number, 100))
                                    ? 0
                                    : ZVal.equalityCheck(2, ZVal.modulus(number, 100))
                                            ? 1
                                            : ZVal.toBool(
                                                                    ZVal.equalityCheck(
                                                                            3,
                                                                            ZVal.modulus(
                                                                                    number, 100)))
                                                            || ZVal.toBool(
                                                                    ZVal.equalityCheck(
                                                                            4,
                                                                            ZVal.modulus(
                                                                                    number, 100)))
                                                    ? 2
                                                    : 3);
                case STRING_mk:
                    return ZVal.assign(ZVal.equalityCheck(1, ZVal.modulus(number, 10)) ? 0 : 1);
                case STRING_mt:
                    return ZVal.assign(
                            ZVal.equalityCheck(1, number)
                                    ? 0
                                    : ZVal.toBool(ZVal.equalityCheck(0, number))
                                                    || ZVal.toBool(
                                                            ZVal.toBool(
                                                                            ZVal.isGreaterThan(
                                                                                    ZVal.modulus(
                                                                                            number,
                                                                                            100),
                                                                                    '>',
                                                                                    1))
                                                                    && ZVal.toBool(
                                                                            ZVal.isLessThan(
                                                                                    ZVal.modulus(
                                                                                            number,
                                                                                            100),
                                                                                    '<',
                                                                                    11)))
                                            ? 1
                                            : ZVal.toBool(
                                                                    ZVal.isGreaterThan(
                                                                            ZVal.modulus(
                                                                                    number, 100),
                                                                            '>',
                                                                            10))
                                                            && ZVal.toBool(
                                                                    ZVal.isLessThan(
                                                                            ZVal.modulus(
                                                                                    number, 100),
                                                                            '<',
                                                                            20))
                                                    ? 2
                                                    : 3);
                case STRING_lv:
                    return ZVal.assign(
                            ZVal.equalityCheck(0, number)
                                    ? 0
                                    : ZVal.toBool(ZVal.equalityCheck(1, ZVal.modulus(number, 10)))
                                                    && ZVal.toBool(
                                                            ZVal.notEqualityCheck(
                                                                    11, ZVal.modulus(number, 100)))
                                            ? 1
                                            : 2);
                case STRING_pl:
                    return ZVal.assign(
                            ZVal.equalityCheck(1, number)
                                    ? 0
                                    : ZVal.toBool(
                                                            ZVal.toBool(
                                                                            ZVal
                                                                                    .isGreaterThanOrEqualTo(
                                                                                            ZVal
                                                                                                    .modulus(
                                                                                                            number,
                                                                                                            10),
                                                                                            ">=",
                                                                                            2))
                                                                    && ZVal.toBool(
                                                                            ZVal
                                                                                    .isLessThanOrEqualTo(
                                                                                            ZVal
                                                                                                    .modulus(
                                                                                                            number,
                                                                                                            10),
                                                                                            "<=",
                                                                                            4)))
                                                    && ZVal.toBool(
                                                            ZVal.toBool(
                                                                            ZVal.isLessThan(
                                                                                    ZVal.modulus(
                                                                                            number,
                                                                                            100),
                                                                                    '<',
                                                                                    12))
                                                                    || ZVal.toBool(
                                                                            ZVal.isGreaterThan(
                                                                                    ZVal.modulus(
                                                                                            number,
                                                                                            100),
                                                                                    '>',
                                                                                    14)))
                                            ? 1
                                            : 2);
                case STRING_cy:
                    return ZVal.assign(
                            ZVal.equalityCheck(1, number)
                                    ? 0
                                    : ZVal.equalityCheck(2, number)
                                            ? 1
                                            : ZVal.toBool(ZVal.equalityCheck(8, number))
                                                            || ZVal.toBool(
                                                                    ZVal.equalityCheck(11, number))
                                                    ? 2
                                                    : 3);
                case STRING_ro:
                    return ZVal.assign(
                            ZVal.equalityCheck(1, number)
                                    ? 0
                                    : ZVal.toBool(ZVal.equalityCheck(0, number))
                                                    || ZVal.toBool(
                                                            ZVal.toBool(
                                                                            ZVal.isGreaterThan(
                                                                                    ZVal.modulus(
                                                                                            number,
                                                                                            100),
                                                                                    '>',
                                                                                    0))
                                                                    && ZVal.toBool(
                                                                            ZVal.isLessThan(
                                                                                    ZVal.modulus(
                                                                                            number,
                                                                                            100),
                                                                                    '<',
                                                                                    20)))
                                            ? 1
                                            : 2);
                case STRING_ar:
                    return ZVal.assign(
                            ZVal.equalityCheck(0, number)
                                    ? 0
                                    : ZVal.equalityCheck(1, number)
                                            ? 1
                                            : ZVal.equalityCheck(2, number)
                                                    ? 2
                                                    : ZVal.toBool(
                                                                            ZVal
                                                                                    .isGreaterThanOrEqualTo(
                                                                                            ZVal
                                                                                                    .modulus(
                                                                                                            number,
                                                                                                            100),
                                                                                            ">=",
                                                                                            3))
                                                                    && ZVal.toBool(
                                                                            ZVal
                                                                                    .isLessThanOrEqualTo(
                                                                                            ZVal
                                                                                                    .modulus(
                                                                                                            number,
                                                                                                            100),
                                                                                            "<=",
                                                                                            10))
                                                            ? 3
                                                            : ZVal.toBool(
                                                                                    ZVal
                                                                                            .isGreaterThanOrEqualTo(
                                                                                                    ZVal
                                                                                                            .modulus(
                                                                                                                    number,
                                                                                                                    100),
                                                                                                    ">=",
                                                                                                    11))
                                                                            && ZVal.toBool(
                                                                                    ZVal
                                                                                            .isLessThanOrEqualTo(
                                                                                                    ZVal
                                                                                                            .modulus(
                                                                                                                    number,
                                                                                                                    100),
                                                                                                    "<=",
                                                                                                    99))
                                                                    ? 4
                                                                    : 5);
                case DEFAULT_CASE:
                    return 0;
            }
            ;
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "rule", typeHint = "callable")
        @ConvertedParameter(index = 1, name = "locale")
        public Object set(RuntimeEnv env, Object... args) {
            Object rule = assignParameter(args, 0, false);
            Object locale = assignParameter(args, 1, false);
            if (ZVal.strictEqualityCheck("pt_BR", "===", locale)) {
                locale = "xbr";
            }

            if (ZVal.isGreaterThan(function_strlen.f.env(env).call(locale).value(), '>', 3)) {
                locale =
                        function_substr
                                .f
                                .env(env)
                                .call(
                                        locale,
                                        0,
                                        ZVal.minusSign(
                                                function_strlen
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                NamespaceGlobal.strrchr
                                                                        .env(env)
                                                                        .call(locale, "_")
                                                                        .value())
                                                        .value()))
                                .value();
            }

            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Symfony
                                    .namespaces
                                    .Component
                                    .namespaces
                                    .Translation
                                    .classes
                                    .PluralizationRules
                                    .RequestStaticProperties
                                    .class,
                            "rules")
                    .arrayAccess(env, locale)
                    .set(rule);
            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object rules = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Translation\\PluralizationRules")
                    .setLookup(
                            PluralizationRules.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("rules")
                    .setFilename("vendor/symfony/translation/PluralizationRules.php")
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

    private enum SwitchEnumType140 {
        STRING_az,
        STRING_bo,
        STRING_dz,
        STRING_id,
        STRING_ja,
        STRING_jv,
        STRING_ka,
        STRING_km,
        STRING_kn,
        STRING_ko,
        STRING_ms,
        STRING_th,
        STRING_tr,
        STRING_vi,
        STRING_zh,
        STRING_af,
        STRING_bn,
        STRING_bg,
        STRING_ca,
        STRING_da,
        STRING_de,
        STRING_el,
        STRING_en,
        STRING_eo,
        STRING_es,
        STRING_et,
        STRING_eu,
        STRING_fa,
        STRING_fi,
        STRING_fo,
        STRING_fur,
        STRING_fy,
        STRING_gl,
        STRING_gu,
        STRING_ha,
        STRING_he,
        STRING_hu,
        STRING_is,
        STRING_it,
        STRING_ku,
        STRING_lb,
        STRING_ml,
        STRING_mn,
        STRING_mr,
        STRING_nah,
        STRING_nb,
        STRING_ne,
        STRING_nl,
        STRING_nn,
        STRING_no,
        STRING_oc,
        STRING_om,
        STRING_or,
        STRING_pa,
        STRING_pap,
        STRING_ps,
        STRING_pt,
        STRING_so,
        STRING_sq,
        STRING_sv,
        STRING_sw,
        STRING_ta,
        STRING_te,
        STRING_tk,
        STRING_ur,
        STRING_zu,
        STRING_am,
        STRING_bh,
        STRING_fil,
        STRING_fr,
        STRING_gun,
        STRING_hi,
        STRING_hy,
        STRING_ln,
        STRING_mg,
        STRING_nso,
        STRING_xbr,
        STRING_ti,
        STRING_wa,
        STRING_be,
        STRING_bs,
        STRING_hr,
        STRING_ru,
        STRING_sr,
        STRING_uk,
        STRING_cs,
        STRING_sk,
        STRING_ga,
        STRING_lt,
        STRING_sl,
        STRING_mk,
        STRING_mt,
        STRING_lv,
        STRING_pl,
        STRING_cy,
        STRING_ro,
        STRING_ar,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
