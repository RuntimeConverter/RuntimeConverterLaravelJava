package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Translation.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Translation/MessageSelector.php

*/

public class MessageSelector extends RuntimeClassBase {

    public MessageSelector(RuntimeEnv env, Object... args) {
        super(env);
    }

    public MessageSelector(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "line")
    @ConvertedParameter(index = 1, name = "number")
    @ConvertedParameter(index = 2, name = "locale")
    public Object choose(RuntimeEnv env, Object... args) {
        Object line = assignParameter(args, 0, false);
        Object number = assignParameter(args, 1, false);
        Object locale = assignParameter(args, 2, false);
        Object pluralIndex = null;
        Object value = null;
        ReferenceContainer segments = new BasicReferenceContainer(null);
        segments.setObject(function_explode.f.env(env).call("|", line).value());
        if (ZVal.strictNotEqualityCheck(
                value = this.extract(env, segments.getObject(), number), "!==", ZVal.getNull())) {
            return ZVal.assign(function_trim.f.env(env).call(value).value());
        }

        segments.setObject(this.stripConditions(env, segments.getObject()));
        pluralIndex = this.getPluralIndex(env, locale, number);
        if (ZVal.toBool(
                        ZVal.equalityCheck(
                                function_count.f.env(env).call(segments.getObject()).value(), 1))
                || ZVal.toBool(!arrayActionR(ArrayAction.ISSET, segments, env, pluralIndex))) {
            return ZVal.assign(segments.arrayGet(env, 0));
        }

        return ZVal.assign(segments.arrayGet(env, pluralIndex));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "segments")
    @ConvertedParameter(index = 1, name = "number")
    private Object extract(RuntimeEnv env, Object... args) {
        Object segments = assignParameter(args, 0, false);
        Object number = assignParameter(args, 1, false);
        Object line = null;
        Object part = null;
        for (ZPair zpairResult603 : ZVal.getIterable(segments, env, true)) {
            part = ZVal.assign(zpairResult603.getValue());
            if (!function_is_null
                    .f
                    .env(env)
                    .call(line = this.extractFromString(env, part, number))
                    .getBool()) {
                return ZVal.assign(line);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "part")
    @ConvertedParameter(index = 1, name = "number")
    private Object extractFromString(RuntimeEnv env, Object... args) {
        Object part = assignParameter(args, 0, false);
        Object number = assignParameter(args, 1, false);
        Object condition = null;
        Object runtimeTempArrayResult84 = null;
        Object from = null;
        Object to = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        Object value = null;
        function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call("/^[\\{\\[]([^\\[\\]\\{\\}]*)[\\}\\]](.*)/s", part, matches.getObject());
        if (ZVal.strictNotEqualityCheck(
                function_count.f.env(env).call(matches.getObject()).value(), "!==", 3)) {
            return null;
        }

        condition = ZVal.assign(matches.arrayGet(env, 1));
        value = ZVal.assign(matches.arrayGet(env, 2));
        if (ZVal.isTrue(Str.runtimeStaticObject.contains(env, condition, ","))) {
            ZVal.list(
                    runtimeTempArrayResult84 =
                            function_explode.f.env(env).call(",", condition, 2).value(),
                    (from = listGet(runtimeTempArrayResult84, 0, env)),
                    (to = listGet(runtimeTempArrayResult84, 1, env)));
            if (ZVal.toBool(ZVal.equalityCheck(to, "*"))
                    && ZVal.toBool(ZVal.isGreaterThanOrEqualTo(number, ">=", from))) {
                return ZVal.assign(value);

            } else if (ZVal.toBool(ZVal.equalityCheck(from, "*"))
                    && ZVal.toBool(ZVal.isLessThanOrEqualTo(number, "<=", to))) {
                return ZVal.assign(value);

            } else if (ZVal.toBool(ZVal.isGreaterThanOrEqualTo(number, ">=", from))
                    && ZVal.toBool(ZVal.isLessThanOrEqualTo(number, "<=", to))) {
                return ZVal.assign(value);
            }
        }

        return ZVal.assign(ZVal.equalityCheck(condition, number) ? value : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "segments")
    private Object stripConditions(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Translation")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Translation/MessageSelector.php");
        Object segments = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                collect.f.env(env).call(segments).value(),
                                "map",
                                MessageSelector.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Translation",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "part")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object part = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                function_preg_replace
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "/^[\\{\\[]([^\\[\\]\\{\\}]*)[\\}\\]]/",
                                                                "",
                                                                part)
                                                        .value());
                                    }
                                }),
                        "all",
                        MessageSelector.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    @ConvertedParameter(index = 1, name = "number")
    public Object getPluralIndex(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, false);
        Object number = assignParameter(args, 1, false);
        SwitchEnumType30 switchVariable30 =
                ZVal.getEnum(
                        locale,
                        SwitchEnumType30.DEFAULT_CASE,
                        SwitchEnumType30.STRING_az,
                        "az",
                        SwitchEnumType30.STRING_az_AZ,
                        "az_AZ",
                        SwitchEnumType30.STRING_bo,
                        "bo",
                        SwitchEnumType30.STRING_bo_CN,
                        "bo_CN",
                        SwitchEnumType30.STRING_bo_IN,
                        "bo_IN",
                        SwitchEnumType30.STRING_dz,
                        "dz",
                        SwitchEnumType30.STRING_dz_BT,
                        "dz_BT",
                        SwitchEnumType30.STRING_id,
                        "id",
                        SwitchEnumType30.STRING_id_ID,
                        "id_ID",
                        SwitchEnumType30.STRING_ja,
                        "ja",
                        SwitchEnumType30.STRING_ja_JP,
                        "ja_JP",
                        SwitchEnumType30.STRING_jv,
                        "jv",
                        SwitchEnumType30.STRING_ka,
                        "ka",
                        SwitchEnumType30.STRING_ka_GE,
                        "ka_GE",
                        SwitchEnumType30.STRING_km,
                        "km",
                        SwitchEnumType30.STRING_km_KH,
                        "km_KH",
                        SwitchEnumType30.STRING_kn,
                        "kn",
                        SwitchEnumType30.STRING_kn_IN,
                        "kn_IN",
                        SwitchEnumType30.STRING_ko,
                        "ko",
                        SwitchEnumType30.STRING_ko_KR,
                        "ko_KR",
                        SwitchEnumType30.STRING_ms,
                        "ms",
                        SwitchEnumType30.STRING_ms_MY,
                        "ms_MY",
                        SwitchEnumType30.STRING_th,
                        "th",
                        SwitchEnumType30.STRING_th_TH,
                        "th_TH",
                        SwitchEnumType30.STRING_tr,
                        "tr",
                        SwitchEnumType30.STRING_tr_CY,
                        "tr_CY",
                        SwitchEnumType30.STRING_tr_TR,
                        "tr_TR",
                        SwitchEnumType30.STRING_vi,
                        "vi",
                        SwitchEnumType30.STRING_vi_VN,
                        "vi_VN",
                        SwitchEnumType30.STRING_zh,
                        "zh",
                        SwitchEnumType30.STRING_zh_CN,
                        "zh_CN",
                        SwitchEnumType30.STRING_zh_HK,
                        "zh_HK",
                        SwitchEnumType30.STRING_zh_SG,
                        "zh_SG",
                        SwitchEnumType30.STRING_zh_TW,
                        "zh_TW",
                        SwitchEnumType30.STRING_af,
                        "af",
                        SwitchEnumType30.STRING_af_ZA,
                        "af_ZA",
                        SwitchEnumType30.STRING_bn,
                        "bn",
                        SwitchEnumType30.STRING_bn_BD,
                        "bn_BD",
                        SwitchEnumType30.STRING_bn_IN,
                        "bn_IN",
                        SwitchEnumType30.STRING_bg,
                        "bg",
                        SwitchEnumType30.STRING_bg_BG,
                        "bg_BG",
                        SwitchEnumType30.STRING_ca,
                        "ca",
                        SwitchEnumType30.STRING_ca_AD,
                        "ca_AD",
                        SwitchEnumType30.STRING_ca_ES,
                        "ca_ES",
                        SwitchEnumType30.STRING_ca_FR,
                        "ca_FR",
                        SwitchEnumType30.STRING_ca_IT,
                        "ca_IT",
                        SwitchEnumType30.STRING_da,
                        "da",
                        SwitchEnumType30.STRING_da_DK,
                        "da_DK",
                        SwitchEnumType30.STRING_de,
                        "de",
                        SwitchEnumType30.STRING_de_AT,
                        "de_AT",
                        SwitchEnumType30.STRING_de_BE,
                        "de_BE",
                        SwitchEnumType30.STRING_de_CH,
                        "de_CH",
                        SwitchEnumType30.STRING_de_DE,
                        "de_DE",
                        SwitchEnumType30.STRING_de_LI,
                        "de_LI",
                        SwitchEnumType30.STRING_de_LU,
                        "de_LU",
                        SwitchEnumType30.STRING_el,
                        "el",
                        SwitchEnumType30.STRING_el_CY,
                        "el_CY",
                        SwitchEnumType30.STRING_el_GR,
                        "el_GR",
                        SwitchEnumType30.STRING_en,
                        "en",
                        SwitchEnumType30.STRING_en_AG,
                        "en_AG",
                        SwitchEnumType30.STRING_en_AU,
                        "en_AU",
                        SwitchEnumType30.STRING_en_BW,
                        "en_BW",
                        SwitchEnumType30.STRING_en_CA,
                        "en_CA",
                        SwitchEnumType30.STRING_en_DK,
                        "en_DK",
                        SwitchEnumType30.STRING_en_GB,
                        "en_GB",
                        SwitchEnumType30.STRING_en_HK,
                        "en_HK",
                        SwitchEnumType30.STRING_en_IE,
                        "en_IE",
                        SwitchEnumType30.STRING_en_IN,
                        "en_IN",
                        SwitchEnumType30.STRING_en_NG,
                        "en_NG",
                        SwitchEnumType30.STRING_en_NZ,
                        "en_NZ",
                        SwitchEnumType30.STRING_en_PH,
                        "en_PH",
                        SwitchEnumType30.STRING_en_SG,
                        "en_SG",
                        SwitchEnumType30.STRING_en_US,
                        "en_US",
                        SwitchEnumType30.STRING_en_ZA,
                        "en_ZA",
                        SwitchEnumType30.STRING_en_ZM,
                        "en_ZM",
                        SwitchEnumType30.STRING_en_ZW,
                        "en_ZW",
                        SwitchEnumType30.STRING_eo,
                        "eo",
                        SwitchEnumType30.STRING_eo_US,
                        "eo_US",
                        SwitchEnumType30.STRING_es,
                        "es",
                        SwitchEnumType30.STRING_es_AR,
                        "es_AR",
                        SwitchEnumType30.STRING_es_BO,
                        "es_BO",
                        SwitchEnumType30.STRING_es_CL,
                        "es_CL",
                        SwitchEnumType30.STRING_es_CO,
                        "es_CO",
                        SwitchEnumType30.STRING_es_CR,
                        "es_CR",
                        SwitchEnumType30.STRING_es_CU,
                        "es_CU",
                        SwitchEnumType30.STRING_es_DO,
                        "es_DO",
                        SwitchEnumType30.STRING_es_EC,
                        "es_EC",
                        SwitchEnumType30.STRING_es_ES,
                        "es_ES",
                        SwitchEnumType30.STRING_es_GT,
                        "es_GT",
                        SwitchEnumType30.STRING_es_HN,
                        "es_HN",
                        SwitchEnumType30.STRING_es_MX,
                        "es_MX",
                        SwitchEnumType30.STRING_es_NI,
                        "es_NI",
                        SwitchEnumType30.STRING_es_PA,
                        "es_PA",
                        SwitchEnumType30.STRING_es_PE,
                        "es_PE",
                        SwitchEnumType30.STRING_es_PR,
                        "es_PR",
                        SwitchEnumType30.STRING_es_PY,
                        "es_PY",
                        SwitchEnumType30.STRING_es_SV,
                        "es_SV",
                        SwitchEnumType30.STRING_es_US,
                        "es_US",
                        SwitchEnumType30.STRING_es_UY,
                        "es_UY",
                        SwitchEnumType30.STRING_es_VE,
                        "es_VE",
                        SwitchEnumType30.STRING_et,
                        "et",
                        SwitchEnumType30.STRING_et_EE,
                        "et_EE",
                        SwitchEnumType30.STRING_eu,
                        "eu",
                        SwitchEnumType30.STRING_eu_ES,
                        "eu_ES",
                        SwitchEnumType30.STRING_eu_FR,
                        "eu_FR",
                        SwitchEnumType30.STRING_fa,
                        "fa",
                        SwitchEnumType30.STRING_fa_IR,
                        "fa_IR",
                        SwitchEnumType30.STRING_fi,
                        "fi",
                        SwitchEnumType30.STRING_fi_FI,
                        "fi_FI",
                        SwitchEnumType30.STRING_fo,
                        "fo",
                        SwitchEnumType30.STRING_fo_FO,
                        "fo_FO",
                        SwitchEnumType30.STRING_fur,
                        "fur",
                        SwitchEnumType30.STRING_fur_IT,
                        "fur_IT",
                        SwitchEnumType30.STRING_fy,
                        "fy",
                        SwitchEnumType30.STRING_fy_DE,
                        "fy_DE",
                        SwitchEnumType30.STRING_fy_NL,
                        "fy_NL",
                        SwitchEnumType30.STRING_gl,
                        "gl",
                        SwitchEnumType30.STRING_gl_ES,
                        "gl_ES",
                        SwitchEnumType30.STRING_gu,
                        "gu",
                        SwitchEnumType30.STRING_gu_IN,
                        "gu_IN",
                        SwitchEnumType30.STRING_ha,
                        "ha",
                        SwitchEnumType30.STRING_ha_NG,
                        "ha_NG",
                        SwitchEnumType30.STRING_he,
                        "he",
                        SwitchEnumType30.STRING_he_IL,
                        "he_IL",
                        SwitchEnumType30.STRING_hu,
                        "hu",
                        SwitchEnumType30.STRING_hu_HU,
                        "hu_HU",
                        SwitchEnumType30.STRING_is,
                        "is",
                        SwitchEnumType30.STRING_is_IS,
                        "is_IS",
                        SwitchEnumType30.STRING_it,
                        "it",
                        SwitchEnumType30.STRING_it_CH,
                        "it_CH",
                        SwitchEnumType30.STRING_it_IT,
                        "it_IT",
                        SwitchEnumType30.STRING_ku,
                        "ku",
                        SwitchEnumType30.STRING_ku_TR,
                        "ku_TR",
                        SwitchEnumType30.STRING_lb,
                        "lb",
                        SwitchEnumType30.STRING_lb_LU,
                        "lb_LU",
                        SwitchEnumType30.STRING_ml,
                        "ml",
                        SwitchEnumType30.STRING_ml_IN,
                        "ml_IN",
                        SwitchEnumType30.STRING_mn,
                        "mn",
                        SwitchEnumType30.STRING_mn_MN,
                        "mn_MN",
                        SwitchEnumType30.STRING_mr,
                        "mr",
                        SwitchEnumType30.STRING_mr_IN,
                        "mr_IN",
                        SwitchEnumType30.STRING_nah,
                        "nah",
                        SwitchEnumType30.STRING_nb,
                        "nb",
                        SwitchEnumType30.STRING_nb_NO,
                        "nb_NO",
                        SwitchEnumType30.STRING_ne,
                        "ne",
                        SwitchEnumType30.STRING_ne_NP,
                        "ne_NP",
                        SwitchEnumType30.STRING_nl,
                        "nl",
                        SwitchEnumType30.STRING_nl_AW,
                        "nl_AW",
                        SwitchEnumType30.STRING_nl_BE,
                        "nl_BE",
                        SwitchEnumType30.STRING_nl_NL,
                        "nl_NL",
                        SwitchEnumType30.STRING_nn,
                        "nn",
                        SwitchEnumType30.STRING_nn_NO,
                        "nn_NO",
                        SwitchEnumType30.STRING_no,
                        "no",
                        SwitchEnumType30.STRING_om,
                        "om",
                        SwitchEnumType30.STRING_om_ET,
                        "om_ET",
                        SwitchEnumType30.STRING_om_KE,
                        "om_KE",
                        SwitchEnumType30.STRING_or,
                        "or",
                        SwitchEnumType30.STRING_or_IN,
                        "or_IN",
                        SwitchEnumType30.STRING_pa,
                        "pa",
                        SwitchEnumType30.STRING_pa_IN,
                        "pa_IN",
                        SwitchEnumType30.STRING_pa_PK,
                        "pa_PK",
                        SwitchEnumType30.STRING_pap,
                        "pap",
                        SwitchEnumType30.STRING_pap_AN,
                        "pap_AN",
                        SwitchEnumType30.STRING_pap_AW,
                        "pap_AW",
                        SwitchEnumType30.STRING_pap_CW,
                        "pap_CW",
                        SwitchEnumType30.STRING_ps,
                        "ps",
                        SwitchEnumType30.STRING_ps_AF,
                        "ps_AF",
                        SwitchEnumType30.STRING_pt,
                        "pt",
                        SwitchEnumType30.STRING_pt_BR,
                        "pt_BR",
                        SwitchEnumType30.STRING_pt_PT,
                        "pt_PT",
                        SwitchEnumType30.STRING_so,
                        "so",
                        SwitchEnumType30.STRING_so_DJ,
                        "so_DJ",
                        SwitchEnumType30.STRING_so_ET,
                        "so_ET",
                        SwitchEnumType30.STRING_so_KE,
                        "so_KE",
                        SwitchEnumType30.STRING_so_SO,
                        "so_SO",
                        SwitchEnumType30.STRING_sq,
                        "sq",
                        SwitchEnumType30.STRING_sq_AL,
                        "sq_AL",
                        SwitchEnumType30.STRING_sq_MK,
                        "sq_MK",
                        SwitchEnumType30.STRING_sv,
                        "sv",
                        SwitchEnumType30.STRING_sv_FI,
                        "sv_FI",
                        SwitchEnumType30.STRING_sv_SE,
                        "sv_SE",
                        SwitchEnumType30.STRING_sw,
                        "sw",
                        SwitchEnumType30.STRING_sw_KE,
                        "sw_KE",
                        SwitchEnumType30.STRING_sw_TZ,
                        "sw_TZ",
                        SwitchEnumType30.STRING_ta,
                        "ta",
                        SwitchEnumType30.STRING_ta_IN,
                        "ta_IN",
                        SwitchEnumType30.STRING_ta_LK,
                        "ta_LK",
                        SwitchEnumType30.STRING_te,
                        "te",
                        SwitchEnumType30.STRING_te_IN,
                        "te_IN",
                        SwitchEnumType30.STRING_tk,
                        "tk",
                        SwitchEnumType30.STRING_tk_TM,
                        "tk_TM",
                        SwitchEnumType30.STRING_ur,
                        "ur",
                        SwitchEnumType30.STRING_ur_IN,
                        "ur_IN",
                        SwitchEnumType30.STRING_ur_PK,
                        "ur_PK",
                        SwitchEnumType30.STRING_zu,
                        "zu",
                        SwitchEnumType30.STRING_zu_ZA,
                        "zu_ZA",
                        SwitchEnumType30.STRING_am,
                        "am",
                        SwitchEnumType30.STRING_am_ET,
                        "am_ET",
                        SwitchEnumType30.STRING_bh,
                        "bh",
                        SwitchEnumType30.STRING_fil,
                        "fil",
                        SwitchEnumType30.STRING_fil_PH,
                        "fil_PH",
                        SwitchEnumType30.STRING_fr,
                        "fr",
                        SwitchEnumType30.STRING_fr_BE,
                        "fr_BE",
                        SwitchEnumType30.STRING_fr_CA,
                        "fr_CA",
                        SwitchEnumType30.STRING_fr_CH,
                        "fr_CH",
                        SwitchEnumType30.STRING_fr_FR,
                        "fr_FR",
                        SwitchEnumType30.STRING_fr_LU,
                        "fr_LU",
                        SwitchEnumType30.STRING_gun,
                        "gun",
                        SwitchEnumType30.STRING_hi,
                        "hi",
                        SwitchEnumType30.STRING_hi_IN,
                        "hi_IN",
                        SwitchEnumType30.STRING_hy,
                        "hy",
                        SwitchEnumType30.STRING_hy_AM,
                        "hy_AM",
                        SwitchEnumType30.STRING_ln,
                        "ln",
                        SwitchEnumType30.STRING_ln_CD,
                        "ln_CD",
                        SwitchEnumType30.STRING_mg,
                        "mg",
                        SwitchEnumType30.STRING_mg_MG,
                        "mg_MG",
                        SwitchEnumType30.STRING_nso,
                        "nso",
                        SwitchEnumType30.STRING_nso_ZA,
                        "nso_ZA",
                        SwitchEnumType30.STRING_ti,
                        "ti",
                        SwitchEnumType30.STRING_ti_ER,
                        "ti_ER",
                        SwitchEnumType30.STRING_ti_ET,
                        "ti_ET",
                        SwitchEnumType30.STRING_wa,
                        "wa",
                        SwitchEnumType30.STRING_wa_BE,
                        "wa_BE",
                        SwitchEnumType30.STRING_xbr,
                        "xbr",
                        SwitchEnumType30.STRING_be,
                        "be",
                        SwitchEnumType30.STRING_be_BY,
                        "be_BY",
                        SwitchEnumType30.STRING_bs,
                        "bs",
                        SwitchEnumType30.STRING_bs_BA,
                        "bs_BA",
                        SwitchEnumType30.STRING_hr,
                        "hr",
                        SwitchEnumType30.STRING_hr_HR,
                        "hr_HR",
                        SwitchEnumType30.STRING_ru,
                        "ru",
                        SwitchEnumType30.STRING_ru_RU,
                        "ru_RU",
                        SwitchEnumType30.STRING_ru_UA,
                        "ru_UA",
                        SwitchEnumType30.STRING_sr,
                        "sr",
                        SwitchEnumType30.STRING_sr_ME,
                        "sr_ME",
                        SwitchEnumType30.STRING_sr_RS,
                        "sr_RS",
                        SwitchEnumType30.STRING_uk,
                        "uk",
                        SwitchEnumType30.STRING_uk_UA,
                        "uk_UA",
                        SwitchEnumType30.STRING_cs,
                        "cs",
                        SwitchEnumType30.STRING_cs_CZ,
                        "cs_CZ",
                        SwitchEnumType30.STRING_sk,
                        "sk",
                        SwitchEnumType30.STRING_sk_SK,
                        "sk_SK",
                        SwitchEnumType30.STRING_ga,
                        "ga",
                        SwitchEnumType30.STRING_ga_IE,
                        "ga_IE",
                        SwitchEnumType30.STRING_lt,
                        "lt",
                        SwitchEnumType30.STRING_lt_LT,
                        "lt_LT",
                        SwitchEnumType30.STRING_sl,
                        "sl",
                        SwitchEnumType30.STRING_sl_SI,
                        "sl_SI",
                        SwitchEnumType30.STRING_mk,
                        "mk",
                        SwitchEnumType30.STRING_mk_MK,
                        "mk_MK",
                        SwitchEnumType30.STRING_mt,
                        "mt",
                        SwitchEnumType30.STRING_mt_MT,
                        "mt_MT",
                        SwitchEnumType30.STRING_lv,
                        "lv",
                        SwitchEnumType30.STRING_lv_LV,
                        "lv_LV",
                        SwitchEnumType30.STRING_pl,
                        "pl",
                        SwitchEnumType30.STRING_pl_PL,
                        "pl_PL",
                        SwitchEnumType30.STRING_cy,
                        "cy",
                        SwitchEnumType30.STRING_cy_GB,
                        "cy_GB",
                        SwitchEnumType30.STRING_ro,
                        "ro",
                        SwitchEnumType30.STRING_ro_RO,
                        "ro_RO",
                        SwitchEnumType30.STRING_ar,
                        "ar",
                        SwitchEnumType30.STRING_ar_AE,
                        "ar_AE",
                        SwitchEnumType30.STRING_ar_BH,
                        "ar_BH",
                        SwitchEnumType30.STRING_ar_DZ,
                        "ar_DZ",
                        SwitchEnumType30.STRING_ar_EG,
                        "ar_EG",
                        SwitchEnumType30.STRING_ar_IN,
                        "ar_IN",
                        SwitchEnumType30.STRING_ar_IQ,
                        "ar_IQ",
                        SwitchEnumType30.STRING_ar_JO,
                        "ar_JO",
                        SwitchEnumType30.STRING_ar_KW,
                        "ar_KW",
                        SwitchEnumType30.STRING_ar_LB,
                        "ar_LB",
                        SwitchEnumType30.STRING_ar_LY,
                        "ar_LY",
                        SwitchEnumType30.STRING_ar_MA,
                        "ar_MA",
                        SwitchEnumType30.STRING_ar_OM,
                        "ar_OM",
                        SwitchEnumType30.STRING_ar_QA,
                        "ar_QA",
                        SwitchEnumType30.STRING_ar_SA,
                        "ar_SA",
                        SwitchEnumType30.STRING_ar_SD,
                        "ar_SD",
                        SwitchEnumType30.STRING_ar_SS,
                        "ar_SS",
                        SwitchEnumType30.STRING_ar_SY,
                        "ar_SY",
                        SwitchEnumType30.STRING_ar_TN,
                        "ar_TN",
                        SwitchEnumType30.STRING_ar_YE,
                        "ar_YE");
        switch (switchVariable30) {
            case STRING_az:
            case STRING_az_AZ:
            case STRING_bo:
            case STRING_bo_CN:
            case STRING_bo_IN:
            case STRING_dz:
            case STRING_dz_BT:
            case STRING_id:
            case STRING_id_ID:
            case STRING_ja:
            case STRING_ja_JP:
            case STRING_jv:
            case STRING_ka:
            case STRING_ka_GE:
            case STRING_km:
            case STRING_km_KH:
            case STRING_kn:
            case STRING_kn_IN:
            case STRING_ko:
            case STRING_ko_KR:
            case STRING_ms:
            case STRING_ms_MY:
            case STRING_th:
            case STRING_th_TH:
            case STRING_tr:
            case STRING_tr_CY:
            case STRING_tr_TR:
            case STRING_vi:
            case STRING_vi_VN:
            case STRING_zh:
            case STRING_zh_CN:
            case STRING_zh_HK:
            case STRING_zh_SG:
            case STRING_zh_TW:
                return 0;
            case STRING_af:
            case STRING_af_ZA:
            case STRING_bn:
            case STRING_bn_BD:
            case STRING_bn_IN:
            case STRING_bg:
            case STRING_bg_BG:
            case STRING_ca:
            case STRING_ca_AD:
            case STRING_ca_ES:
            case STRING_ca_FR:
            case STRING_ca_IT:
            case STRING_da:
            case STRING_da_DK:
            case STRING_de:
            case STRING_de_AT:
            case STRING_de_BE:
            case STRING_de_CH:
            case STRING_de_DE:
            case STRING_de_LI:
            case STRING_de_LU:
            case STRING_el:
            case STRING_el_CY:
            case STRING_el_GR:
            case STRING_en:
            case STRING_en_AG:
            case STRING_en_AU:
            case STRING_en_BW:
            case STRING_en_CA:
            case STRING_en_DK:
            case STRING_en_GB:
            case STRING_en_HK:
            case STRING_en_IE:
            case STRING_en_IN:
            case STRING_en_NG:
            case STRING_en_NZ:
            case STRING_en_PH:
            case STRING_en_SG:
            case STRING_en_US:
            case STRING_en_ZA:
            case STRING_en_ZM:
            case STRING_en_ZW:
            case STRING_eo:
            case STRING_eo_US:
            case STRING_es:
            case STRING_es_AR:
            case STRING_es_BO:
            case STRING_es_CL:
            case STRING_es_CO:
            case STRING_es_CR:
            case STRING_es_CU:
            case STRING_es_DO:
            case STRING_es_EC:
            case STRING_es_ES:
            case STRING_es_GT:
            case STRING_es_HN:
            case STRING_es_MX:
            case STRING_es_NI:
            case STRING_es_PA:
            case STRING_es_PE:
            case STRING_es_PR:
            case STRING_es_PY:
            case STRING_es_SV:
            case STRING_es_US:
            case STRING_es_UY:
            case STRING_es_VE:
            case STRING_et:
            case STRING_et_EE:
            case STRING_eu:
            case STRING_eu_ES:
            case STRING_eu_FR:
            case STRING_fa:
            case STRING_fa_IR:
            case STRING_fi:
            case STRING_fi_FI:
            case STRING_fo:
            case STRING_fo_FO:
            case STRING_fur:
            case STRING_fur_IT:
            case STRING_fy:
            case STRING_fy_DE:
            case STRING_fy_NL:
            case STRING_gl:
            case STRING_gl_ES:
            case STRING_gu:
            case STRING_gu_IN:
            case STRING_ha:
            case STRING_ha_NG:
            case STRING_he:
            case STRING_he_IL:
            case STRING_hu:
            case STRING_hu_HU:
            case STRING_is:
            case STRING_is_IS:
            case STRING_it:
            case STRING_it_CH:
            case STRING_it_IT:
            case STRING_ku:
            case STRING_ku_TR:
            case STRING_lb:
            case STRING_lb_LU:
            case STRING_ml:
            case STRING_ml_IN:
            case STRING_mn:
            case STRING_mn_MN:
            case STRING_mr:
            case STRING_mr_IN:
            case STRING_nah:
            case STRING_nb:
            case STRING_nb_NO:
            case STRING_ne:
            case STRING_ne_NP:
            case STRING_nl:
            case STRING_nl_AW:
            case STRING_nl_BE:
            case STRING_nl_NL:
            case STRING_nn:
            case STRING_nn_NO:
            case STRING_no:
            case STRING_om:
            case STRING_om_ET:
            case STRING_om_KE:
            case STRING_or:
            case STRING_or_IN:
            case STRING_pa:
            case STRING_pa_IN:
            case STRING_pa_PK:
            case STRING_pap:
            case STRING_pap_AN:
            case STRING_pap_AW:
            case STRING_pap_CW:
            case STRING_ps:
            case STRING_ps_AF:
            case STRING_pt:
            case STRING_pt_BR:
            case STRING_pt_PT:
            case STRING_so:
            case STRING_so_DJ:
            case STRING_so_ET:
            case STRING_so_KE:
            case STRING_so_SO:
            case STRING_sq:
            case STRING_sq_AL:
            case STRING_sq_MK:
            case STRING_sv:
            case STRING_sv_FI:
            case STRING_sv_SE:
            case STRING_sw:
            case STRING_sw_KE:
            case STRING_sw_TZ:
            case STRING_ta:
            case STRING_ta_IN:
            case STRING_ta_LK:
            case STRING_te:
            case STRING_te_IN:
            case STRING_tk:
            case STRING_tk_TM:
            case STRING_ur:
            case STRING_ur_IN:
            case STRING_ur_PK:
            case STRING_zu:
            case STRING_zu_ZA:
                return ZVal.assign(ZVal.equalityCheck(number, 1) ? 0 : 1);
            case STRING_am:
            case STRING_am_ET:
            case STRING_bh:
            case STRING_fil:
            case STRING_fil_PH:
            case STRING_fr:
            case STRING_fr_BE:
            case STRING_fr_CA:
            case STRING_fr_CH:
            case STRING_fr_FR:
            case STRING_fr_LU:
            case STRING_gun:
            case STRING_hi:
            case STRING_hi_IN:
            case STRING_hy:
            case STRING_hy_AM:
            case STRING_ln:
            case STRING_ln_CD:
            case STRING_mg:
            case STRING_mg_MG:
            case STRING_nso:
            case STRING_nso_ZA:
            case STRING_ti:
            case STRING_ti_ER:
            case STRING_ti_ET:
            case STRING_wa:
            case STRING_wa_BE:
            case STRING_xbr:
                return ZVal.assign(
                        ZVal.toBool(ZVal.equalityCheck(number, 0))
                                        || ZVal.toBool(ZVal.equalityCheck(number, 1))
                                ? 0
                                : 1);
            case STRING_be:
            case STRING_be_BY:
            case STRING_bs:
            case STRING_bs_BA:
            case STRING_hr:
            case STRING_hr_HR:
            case STRING_ru:
            case STRING_ru_RU:
            case STRING_ru_UA:
            case STRING_sr:
            case STRING_sr_ME:
            case STRING_sr_RS:
            case STRING_uk:
            case STRING_uk_UA:
                return ZVal.assign(
                        ZVal.toBool(ZVal.equalityCheck(ZVal.modulus(number, 10), 1))
                                        && ZVal.toBool(
                                                ZVal.notEqualityCheck(
                                                        ZVal.modulus(number, 100), 11))
                                ? 0
                                : ZVal.toBool(
                                                        ZVal.toBool(
                                                                        ZVal.isGreaterThanOrEqualTo(
                                                                                ZVal.modulus(
                                                                                        number, 10),
                                                                                ">=",
                                                                                2))
                                                                && ZVal.toBool(
                                                                        ZVal.isLessThanOrEqualTo(
                                                                                ZVal.modulus(
                                                                                        number, 10),
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
                                                                        ZVal.isGreaterThanOrEqualTo(
                                                                                ZVal.modulus(
                                                                                        number,
                                                                                        100),
                                                                                ">=",
                                                                                20)))
                                        ? 1
                                        : 2);
            case STRING_cs:
            case STRING_cs_CZ:
            case STRING_sk:
            case STRING_sk_SK:
                return ZVal.assign(
                        ZVal.equalityCheck(number, 1)
                                ? 0
                                : ZVal.toBool(ZVal.isGreaterThanOrEqualTo(number, ">=", 2))
                                                && ZVal.toBool(
                                                        ZVal.isLessThanOrEqualTo(number, "<=", 4))
                                        ? 1
                                        : 2);
            case STRING_ga:
            case STRING_ga_IE:
                return ZVal.assign(
                        ZVal.equalityCheck(number, 1) ? 0 : ZVal.equalityCheck(number, 2) ? 1 : 2);
            case STRING_lt:
            case STRING_lt_LT:
                return ZVal.assign(
                        ZVal.toBool(ZVal.equalityCheck(ZVal.modulus(number, 10), 1))
                                        && ZVal.toBool(
                                                ZVal.notEqualityCheck(
                                                        ZVal.modulus(number, 100), 11))
                                ? 0
                                : ZVal.toBool(
                                                        ZVal.isGreaterThanOrEqualTo(
                                                                ZVal.modulus(number, 10), ">=", 2))
                                                && ZVal.toBool(
                                                        ZVal.toBool(
                                                                        ZVal.isLessThan(
                                                                                ZVal.modulus(
                                                                                        number,
                                                                                        100),
                                                                                '<',
                                                                                10))
                                                                || ZVal.toBool(
                                                                        ZVal.isGreaterThanOrEqualTo(
                                                                                ZVal.modulus(
                                                                                        number,
                                                                                        100),
                                                                                ">=",
                                                                                20)))
                                        ? 1
                                        : 2);
            case STRING_sl:
            case STRING_sl_SI:
                return ZVal.assign(
                        ZVal.equalityCheck(ZVal.modulus(number, 100), 1)
                                ? 0
                                : ZVal.equalityCheck(ZVal.modulus(number, 100), 2)
                                        ? 1
                                        : ZVal.toBool(
                                                                ZVal.equalityCheck(
                                                                        ZVal.modulus(number, 100),
                                                                        3))
                                                        || ZVal.toBool(
                                                                ZVal.equalityCheck(
                                                                        ZVal.modulus(number, 100),
                                                                        4))
                                                ? 2
                                                : 3);
            case STRING_mk:
            case STRING_mk_MK:
                return ZVal.assign(ZVal.equalityCheck(ZVal.modulus(number, 10), 1) ? 0 : 1);
            case STRING_mt:
            case STRING_mt_MT:
                return ZVal.assign(
                        ZVal.equalityCheck(number, 1)
                                ? 0
                                : ZVal.toBool(ZVal.equalityCheck(number, 0))
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
                                                                        ZVal.modulus(number, 100),
                                                                        '>',
                                                                        10))
                                                        && ZVal.toBool(
                                                                ZVal.isLessThan(
                                                                        ZVal.modulus(number, 100),
                                                                        '<',
                                                                        20))
                                                ? 2
                                                : 3);
            case STRING_lv:
            case STRING_lv_LV:
                return ZVal.assign(
                        ZVal.equalityCheck(number, 0)
                                ? 0
                                : ZVal.toBool(ZVal.equalityCheck(ZVal.modulus(number, 10), 1))
                                                && ZVal.toBool(
                                                        ZVal.notEqualityCheck(
                                                                ZVal.modulus(number, 100), 11))
                                        ? 1
                                        : 2);
            case STRING_pl:
            case STRING_pl_PL:
                return ZVal.assign(
                        ZVal.equalityCheck(number, 1)
                                ? 0
                                : ZVal.toBool(
                                                        ZVal.toBool(
                                                                        ZVal.isGreaterThanOrEqualTo(
                                                                                ZVal.modulus(
                                                                                        number, 10),
                                                                                ">=",
                                                                                2))
                                                                && ZVal.toBool(
                                                                        ZVal.isLessThanOrEqualTo(
                                                                                ZVal.modulus(
                                                                                        number, 10),
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
            case STRING_cy_GB:
                return ZVal.assign(
                        ZVal.equalityCheck(number, 1)
                                ? 0
                                : ZVal.equalityCheck(number, 2)
                                        ? 1
                                        : ZVal.toBool(ZVal.equalityCheck(number, 8))
                                                        || ZVal.toBool(
                                                                ZVal.equalityCheck(number, 11))
                                                ? 2
                                                : 3);
            case STRING_ro:
            case STRING_ro_RO:
                return ZVal.assign(
                        ZVal.equalityCheck(number, 1)
                                ? 0
                                : ZVal.toBool(ZVal.equalityCheck(number, 0))
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
            case STRING_ar_AE:
            case STRING_ar_BH:
            case STRING_ar_DZ:
            case STRING_ar_EG:
            case STRING_ar_IN:
            case STRING_ar_IQ:
            case STRING_ar_JO:
            case STRING_ar_KW:
            case STRING_ar_LB:
            case STRING_ar_LY:
            case STRING_ar_MA:
            case STRING_ar_OM:
            case STRING_ar_QA:
            case STRING_ar_SA:
            case STRING_ar_SD:
            case STRING_ar_SS:
            case STRING_ar_SY:
            case STRING_ar_TN:
            case STRING_ar_YE:
                return ZVal.assign(
                        ZVal.equalityCheck(number, 0)
                                ? 0
                                : ZVal.equalityCheck(number, 1)
                                        ? 1
                                        : ZVal.equalityCheck(number, 2)
                                                ? 2
                                                : ZVal.toBool(
                                                                        ZVal.isGreaterThanOrEqualTo(
                                                                                ZVal.modulus(
                                                                                        number,
                                                                                        100),
                                                                                ">=",
                                                                                3))
                                                                && ZVal.toBool(
                                                                        ZVal.isLessThanOrEqualTo(
                                                                                ZVal.modulus(
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

    public static final Object CONST_class = "Illuminate\\Translation\\MessageSelector";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Translation\\MessageSelector")
                    .setLookup(
                            MessageSelector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Translation/MessageSelector.php")
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

    private enum SwitchEnumType30 {
        STRING_az,
        STRING_az_AZ,
        STRING_bo,
        STRING_bo_CN,
        STRING_bo_IN,
        STRING_dz,
        STRING_dz_BT,
        STRING_id,
        STRING_id_ID,
        STRING_ja,
        STRING_ja_JP,
        STRING_jv,
        STRING_ka,
        STRING_ka_GE,
        STRING_km,
        STRING_km_KH,
        STRING_kn,
        STRING_kn_IN,
        STRING_ko,
        STRING_ko_KR,
        STRING_ms,
        STRING_ms_MY,
        STRING_th,
        STRING_th_TH,
        STRING_tr,
        STRING_tr_CY,
        STRING_tr_TR,
        STRING_vi,
        STRING_vi_VN,
        STRING_zh,
        STRING_zh_CN,
        STRING_zh_HK,
        STRING_zh_SG,
        STRING_zh_TW,
        STRING_af,
        STRING_af_ZA,
        STRING_bn,
        STRING_bn_BD,
        STRING_bn_IN,
        STRING_bg,
        STRING_bg_BG,
        STRING_ca,
        STRING_ca_AD,
        STRING_ca_ES,
        STRING_ca_FR,
        STRING_ca_IT,
        STRING_da,
        STRING_da_DK,
        STRING_de,
        STRING_de_AT,
        STRING_de_BE,
        STRING_de_CH,
        STRING_de_DE,
        STRING_de_LI,
        STRING_de_LU,
        STRING_el,
        STRING_el_CY,
        STRING_el_GR,
        STRING_en,
        STRING_en_AG,
        STRING_en_AU,
        STRING_en_BW,
        STRING_en_CA,
        STRING_en_DK,
        STRING_en_GB,
        STRING_en_HK,
        STRING_en_IE,
        STRING_en_IN,
        STRING_en_NG,
        STRING_en_NZ,
        STRING_en_PH,
        STRING_en_SG,
        STRING_en_US,
        STRING_en_ZA,
        STRING_en_ZM,
        STRING_en_ZW,
        STRING_eo,
        STRING_eo_US,
        STRING_es,
        STRING_es_AR,
        STRING_es_BO,
        STRING_es_CL,
        STRING_es_CO,
        STRING_es_CR,
        STRING_es_CU,
        STRING_es_DO,
        STRING_es_EC,
        STRING_es_ES,
        STRING_es_GT,
        STRING_es_HN,
        STRING_es_MX,
        STRING_es_NI,
        STRING_es_PA,
        STRING_es_PE,
        STRING_es_PR,
        STRING_es_PY,
        STRING_es_SV,
        STRING_es_US,
        STRING_es_UY,
        STRING_es_VE,
        STRING_et,
        STRING_et_EE,
        STRING_eu,
        STRING_eu_ES,
        STRING_eu_FR,
        STRING_fa,
        STRING_fa_IR,
        STRING_fi,
        STRING_fi_FI,
        STRING_fo,
        STRING_fo_FO,
        STRING_fur,
        STRING_fur_IT,
        STRING_fy,
        STRING_fy_DE,
        STRING_fy_NL,
        STRING_gl,
        STRING_gl_ES,
        STRING_gu,
        STRING_gu_IN,
        STRING_ha,
        STRING_ha_NG,
        STRING_he,
        STRING_he_IL,
        STRING_hu,
        STRING_hu_HU,
        STRING_is,
        STRING_is_IS,
        STRING_it,
        STRING_it_CH,
        STRING_it_IT,
        STRING_ku,
        STRING_ku_TR,
        STRING_lb,
        STRING_lb_LU,
        STRING_ml,
        STRING_ml_IN,
        STRING_mn,
        STRING_mn_MN,
        STRING_mr,
        STRING_mr_IN,
        STRING_nah,
        STRING_nb,
        STRING_nb_NO,
        STRING_ne,
        STRING_ne_NP,
        STRING_nl,
        STRING_nl_AW,
        STRING_nl_BE,
        STRING_nl_NL,
        STRING_nn,
        STRING_nn_NO,
        STRING_no,
        STRING_om,
        STRING_om_ET,
        STRING_om_KE,
        STRING_or,
        STRING_or_IN,
        STRING_pa,
        STRING_pa_IN,
        STRING_pa_PK,
        STRING_pap,
        STRING_pap_AN,
        STRING_pap_AW,
        STRING_pap_CW,
        STRING_ps,
        STRING_ps_AF,
        STRING_pt,
        STRING_pt_BR,
        STRING_pt_PT,
        STRING_so,
        STRING_so_DJ,
        STRING_so_ET,
        STRING_so_KE,
        STRING_so_SO,
        STRING_sq,
        STRING_sq_AL,
        STRING_sq_MK,
        STRING_sv,
        STRING_sv_FI,
        STRING_sv_SE,
        STRING_sw,
        STRING_sw_KE,
        STRING_sw_TZ,
        STRING_ta,
        STRING_ta_IN,
        STRING_ta_LK,
        STRING_te,
        STRING_te_IN,
        STRING_tk,
        STRING_tk_TM,
        STRING_ur,
        STRING_ur_IN,
        STRING_ur_PK,
        STRING_zu,
        STRING_zu_ZA,
        STRING_am,
        STRING_am_ET,
        STRING_bh,
        STRING_fil,
        STRING_fil_PH,
        STRING_fr,
        STRING_fr_BE,
        STRING_fr_CA,
        STRING_fr_CH,
        STRING_fr_FR,
        STRING_fr_LU,
        STRING_gun,
        STRING_hi,
        STRING_hi_IN,
        STRING_hy,
        STRING_hy_AM,
        STRING_ln,
        STRING_ln_CD,
        STRING_mg,
        STRING_mg_MG,
        STRING_nso,
        STRING_nso_ZA,
        STRING_ti,
        STRING_ti_ER,
        STRING_ti_ET,
        STRING_wa,
        STRING_wa_BE,
        STRING_xbr,
        STRING_be,
        STRING_be_BY,
        STRING_bs,
        STRING_bs_BA,
        STRING_hr,
        STRING_hr_HR,
        STRING_ru,
        STRING_ru_RU,
        STRING_ru_UA,
        STRING_sr,
        STRING_sr_ME,
        STRING_sr_RS,
        STRING_uk,
        STRING_uk_UA,
        STRING_cs,
        STRING_cs_CZ,
        STRING_sk,
        STRING_sk_SK,
        STRING_ga,
        STRING_ga_IE,
        STRING_lt,
        STRING_lt_LT,
        STRING_sl,
        STRING_sl_SI,
        STRING_mk,
        STRING_mk_MK,
        STRING_mt,
        STRING_mt_MT,
        STRING_lv,
        STRING_lv_LV,
        STRING_pl,
        STRING_pl_PL,
        STRING_cy,
        STRING_cy_GB,
        STRING_ro,
        STRING_ro_RO,
        STRING_ar,
        STRING_ar_AE,
        STRING_ar_BH,
        STRING_ar_DZ,
        STRING_ar_EG,
        STRING_ar_IN,
        STRING_ar_IQ,
        STRING_ar_JO,
        STRING_ar_KW,
        STRING_ar_LB,
        STRING_ar_LY,
        STRING_ar_MA,
        STRING_ar_OM,
        STRING_ar_QA,
        STRING_ar_SA,
        STRING_ar_SD,
        STRING_ar_SS,
        STRING_ar_SY,
        STRING_ar_TN,
        STRING_ar_YE,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
