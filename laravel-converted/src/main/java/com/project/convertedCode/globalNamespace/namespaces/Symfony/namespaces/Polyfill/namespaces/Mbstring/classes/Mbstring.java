package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Polyfill.namespaces.Mbstring.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_walk_recursive;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_scalar;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.math.function_floor;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/polyfill-mbstring/Mbstring.php

*/

public final class Mbstring extends RuntimeClassBase {

    public Mbstring(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Mbstring(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_MB_CASE_FOLD = 9223372036854775807L;

    public static final Object CONST_class = "Symfony\\Polyfill\\Mbstring\\Mbstring";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "s")
        @ConvertedParameter(index = 1, name = "toEncoding")
        @ConvertedParameter(
            index = 2,
            name = "fromEncoding",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object mb_convert_encoding(RuntimeEnv env, Object... args) {
            Object s = assignParameter(args, 0, false);
            Object toEncoding = assignParameter(args, 1, false);
            Object fromEncoding = assignParameter(args, 2, true);
            if (null == fromEncoding) {
                fromEncoding = ZVal.getNull();
            }
            if (ZVal.toBool(function_is_array.f.env(env).call(fromEncoding).value())
                    || ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    false,
                                    "!==",
                                    function_strpos.f.env(env).call(fromEncoding, ",").value()))) {
                fromEncoding = runtimeStaticObject.mb_detect_encoding(env, s, fromEncoding);

            } else {
                fromEncoding = runtimeStaticObject.getEncoding(env, fromEncoding);
            }

            toEncoding = runtimeStaticObject.getEncoding(env, toEncoding);
            if (ZVal.strictEqualityCheck("BASE64", "===", fromEncoding)) {
                s = NamespaceGlobal.base64_decode.env(env).call(s).value();
                fromEncoding = ZVal.assign(toEncoding);
            }

            if (ZVal.strictEqualityCheck("BASE64", "===", toEncoding)) {
                return ZVal.assign(NamespaceGlobal.base64_encode.env(env).call(s).value());
            }

            if (ZVal.toBool(ZVal.strictEqualityCheck("HTML-ENTITIES", "===", toEncoding))
                    || ZVal.toBool(ZVal.strictEqualityCheck("HTML", "===", toEncoding))) {
                if (ZVal.toBool(ZVal.strictEqualityCheck("HTML-ENTITIES", "===", fromEncoding))
                        || ZVal.toBool(ZVal.strictEqualityCheck("HTML", "===", fromEncoding))) {
                    fromEncoding = "Windows-1252";
                }

                if (ZVal.strictNotEqualityCheck("UTF-8", "!==", fromEncoding)) {
                    s =
                            NamespaceGlobal.iconv
                                    .env(env)
                                    .call(fromEncoding, "UTF-8//IGNORE", s)
                                    .value();
                }

                return ZVal.assign(
                        NamespaceGlobal.preg_replace_callback
                                .env(env)
                                .call(
                                        "/[\\x80-\\xFF]+/",
                                        ZVal.newArray(
                                                new ZPair(0, "Mbstring"),
                                                new ZPair(1, "html_encoding_callback")),
                                        s)
                                .value());
            }

            if (ZVal.strictEqualityCheck("HTML-ENTITIES", "===", fromEncoding)) {
                s = NamespaceGlobal.html_entity_decode.env(env).call(s, 2, "UTF-8").value();
                fromEncoding = "UTF-8";
            }

            return ZVal.assign(
                    NamespaceGlobal.iconv
                            .env(env)
                            .call(fromEncoding, toStringR(toEncoding, env) + "//IGNORE", s)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "toEncoding")
        @ConvertedParameter(index = 1, name = "fromEncoding")
        @ConvertedParameter(
            index = 2,
            name = "a",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 3,
            name = "b",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 4,
            name = "c",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 5,
            name = "d",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 6,
            name = "e",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 7,
            name = "f",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object mb_convert_variables(
                RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/symfony/polyfill-mbstring")
                            .setFile("/vendor/symfony/polyfill-mbstring/Mbstring.php");
            Object toEncoding = assignParameter(args, 0, false);
            Object fromEncoding = assignParameter(args, 1, false);
            ReferenceContainer a = assignParameterRef(runtimePassByReferenceArgs, args, 2, true);
            if (null == a.getObject()) {
                a.setObject(ZVal.getNull());
            }
            ReferenceContainer b = assignParameterRef(runtimePassByReferenceArgs, args, 3, true);
            if (null == b.getObject()) {
                b.setObject(ZVal.getNull());
            }
            ReferenceContainer c = assignParameterRef(runtimePassByReferenceArgs, args, 4, true);
            if (null == c.getObject()) {
                c.setObject(ZVal.getNull());
            }
            ReferenceContainer d = assignParameterRef(runtimePassByReferenceArgs, args, 5, true);
            if (null == d.getObject()) {
                d.setObject(ZVal.getNull());
            }
            ReferenceContainer e = assignParameterRef(runtimePassByReferenceArgs, args, 6, true);
            if (null == e.getObject()) {
                e.setObject(ZVal.getNull());
            }
            ReferenceContainer f = assignParameterRef(runtimePassByReferenceArgs, args, 7, true);
            if (null == f.getObject()) {
                f.setObject(ZVal.getNull());
            }
            Object vars = null;
            ReferenceContainer ok = new BasicReferenceContainer(null);
            vars =
                    ZVal.newArray(
                            new ZPair(0, a.getObject()),
                            new ZPair(1, b.getObject()),
                            new ZPair(2, c.getObject()),
                            new ZPair(3, d.getObject()),
                            new ZPair(4, e.getObject()),
                            new ZPair(5, f.getObject()));
            ok.setObject(true);
            function_array_walk_recursive
                    .f
                    .env(env)
                    .call(
                            vars,
                            new Closure(
                                    env,
                                    runtimeConverterFunctionClassConstants,
                                    "Symfony\\Polyfill\\Mbstring",
                                    this) {
                                @Override
                                @ConvertedMethod
                                @ConvertedParameter(index = 0, name = "v")
                                public Object run(
                                        RuntimeEnv env,
                                        Object thisvar,
                                        PassByReferenceArgs runtimePassByReferenceArgs,
                                        Object... args) {
                                    ReferenceContainer v =
                                            assignParameterRef(
                                                    runtimePassByReferenceArgs, args, 0, false);
                                    Object toEncoding = null;
                                    Object fromEncoding = null;
                                    ReferenceContainer ok = new BasicReferenceContainer(null);
                                    toEncoding =
                                            this.contextReferences.getCapturedValue("toEncoding");
                                    fromEncoding =
                                            this.contextReferences.getCapturedValue("fromEncoding");
                                    ok = this.contextReferences.getReferenceContainer("ok");
                                    if (ZVal.strictEqualityCheck(
                                            false,
                                            "===",
                                            v.setObject(
                                                    com.project.convertedCode.globalNamespace
                                                            .namespaces.Symfony.namespaces.Polyfill
                                                            .namespaces.Mbstring.classes.Mbstring
                                                            .runtimeStaticObject
                                                            .mb_convert_encoding(
                                                                    env,
                                                                    v.getObject(),
                                                                    toEncoding,
                                                                    fromEncoding)))) {
                                        ok.setObject(false);
                                    }

                                    return null;
                                }
                            }.useRef("ok", ok)
                                    .use("toEncoding", toEncoding)
                                    .use("fromEncoding", fromEncoding));
            return ZVal.assign(ZVal.isTrue(ok.getObject()) ? fromEncoding : false);
        }

        public Object mb_convert_variables(RuntimeEnv env, Object... args) {
            throw new TemporaryStubFunctionException();
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "s")
        public Object mb_decode_mimeheader(RuntimeEnv env, Object... args) {
            Object s = assignParameter(args, 0, false);
            return ZVal.assign(
                    NamespaceGlobal.iconv_mime_decode
                            .env(env)
                            .call(
                                    s,
                                    2,
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Symfony
                                                            .namespaces
                                                            .Polyfill
                                                            .namespaces
                                                            .Mbstring
                                                            .classes
                                                            .Mbstring
                                                            .RequestStaticProperties
                                                            .class)
                                            .internalEncoding)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "s")
        @ConvertedParameter(
            index = 1,
            name = "charset",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 2,
            name = "transferEncoding",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 3,
            name = "linefeed",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 4,
            name = "indent",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object mb_encode_mimeheader(RuntimeEnv env, Object... args) {
            Object s = assignParameter(args, 0, false);
            Object charset = assignParameter(args, 1, true);
            if (null == charset) {
                charset = ZVal.getNull();
            }
            Object transferEncoding = assignParameter(args, 2, true);
            if (null == transferEncoding) {
                transferEncoding = ZVal.getNull();
            }
            Object linefeed = assignParameter(args, 3, true);
            if (null == linefeed) {
                linefeed = ZVal.getNull();
            }
            Object indent = assignParameter(args, 4, true);
            if (null == indent) {
                indent = ZVal.getNull();
            }
            NamespaceGlobal.trigger_error
                    .env(env)
                    .call(
                            "mb_encode_mimeheader() is bugged. Please use iconv_mime_encode() instead",
                            512);
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "s")
        @ConvertedParameter(index = 1, name = "convmap")
        @ConvertedParameter(
            index = 2,
            name = "encoding",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object mb_decode_numericentity(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/symfony/polyfill-mbstring")
                            .setFile("/vendor/symfony/polyfill-mbstring/Mbstring.php");
            Object s = assignParameter(args, 0, false);
            ReferenceContainer convmap =
                    new BasicReferenceContainer(assignParameter(args, 1, false));
            Object encoding = assignParameter(args, 2, true);
            if (null == encoding) {
                encoding = ZVal.getNull();
            }
            Object cnt = null;
            Object i = null;
            if (ZVal.toBool(
                            ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", s))
                                    && ZVal.toBool(
                                            !function_is_scalar.f.env(env).call(s).getBool()))
                    && ZVal.toBool(
                            !ZVal.toBool(function_is_object.f.env(env).call(s).value())
                                    && ZVal.toBool(
                                            function_method_exists
                                                    .f
                                                    .env(env)
                                                    .call(s, "__toString")
                                                    .value()))) {
                NamespaceGlobal.trigger_error
                        .env(env)
                        .call(
                                "mb_decode_numericentity() expects parameter 1 to be string, "
                                        + toStringR(
                                                NamespaceGlobal.gettype.env(env).call(s).value(),
                                                env)
                                        + " given",
                                512);
                return ZVal.assign(ZVal.getNull());
            }

            if (ZVal.toBool(!function_is_array.f.env(env).call(convmap.getObject()).getBool())
                    || ZVal.toBool(!ZVal.isTrue(convmap.getObject()))) {
                return ZVal.assign(false);
            }

            if (ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", encoding))
                    && ZVal.toBool(!function_is_scalar.f.env(env).call(encoding).getBool())) {
                NamespaceGlobal.trigger_error
                        .env(env)
                        .call(
                                "mb_decode_numericentity() expects parameter 3 to be string, "
                                        + toStringR(
                                                NamespaceGlobal.gettype.env(env).call(s).value(),
                                                env)
                                        + " given",
                                512);
                return "";
            }

            s = ZVal.assign(toStringR(s, env));
            if (ZVal.strictEqualityCheck("", "===", s)) {
                return "";
            }

            encoding = runtimeStaticObject.getEncoding(env, encoding);
            if (ZVal.strictEqualityCheck("UTF-8", "===", encoding)) {
                encoding = ZVal.getNull();
                if (!function_preg_match.f.env(env).call("//u", s).getBool()) {
                    s = NamespaceGlobal.iconv.env(env).call("UTF-8", "UTF-8//IGNORE", s).value();
                }

            } else {
                s = NamespaceGlobal.iconv.env(env).call(encoding, "UTF-8//IGNORE", s).value();
            }

            cnt =
                    ZVal.multiply(
                            function_floor
                                    .f
                                    .env(env)
                                    .call(
                                            ZVal.divide(
                                                    function_count
                                                            .f
                                                            .env(env)
                                                            .call(convmap.getObject())
                                                            .value(),
                                                    4))
                                    .value(),
                            4);
            for (i = 0; ZVal.isLessThan(i, '<', cnt); i = ZAssignment.add("+=", i, 4)) {
                convmap.arrayAccess(env, i)
                        .set(
                                ZAssignment.add(
                                        "+=",
                                        convmap.arrayGet(env, i),
                                        convmap.arrayGet(env, ZVal.add(i, 2))));
                convmap.arrayAccess(env, ZVal.add(i, 1))
                        .set(
                                ZAssignment.add(
                                        "+=",
                                        convmap.arrayGet(env, ZVal.add(i, 1)),
                                        convmap.arrayGet(env, ZVal.add(i, 2))));
            }

            s =
                    NamespaceGlobal.preg_replace_callback
                            .env(env)
                            .call(
                                    "/&#(?:0*([0-9]+)|x0*([0-9a-fA-F]+))(?!&);?/",
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Symfony\\Polyfill\\Mbstring",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(
                                            index = 0,
                                            name = "m",
                                            typeHint = "array"
                                        )
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            ReferenceContainer m =
                                                    new BasicReferenceContainer(
                                                            assignParameter(args, 0, false));
                                            ReferenceContainer convmap =
                                                    new BasicReferenceContainer(null);
                                            Object c = null;
                                            Object cnt = null;
                                            Object i = null;
                                            convmap =
                                                    this.contextReferences.getReferenceContainer(
                                                            "convmap");
                                            cnt = this.contextReferences.getCapturedValue("cnt");
                                            c =
                                                    ZVal.assign(
                                                            arrayActionR(
                                                                            ArrayAction.ISSET,
                                                                            m,
                                                                            env,
                                                                            2)
                                                                    ? ZVal.toLong(
                                                                            NamespaceGlobal.hexdec
                                                                                    .env(env)
                                                                                    .call(
                                                                                            m
                                                                                                    .arrayGet(
                                                                                                            env,
                                                                                                            2))
                                                                                    .value())
                                                                    : m.arrayGet(env, 1));
                                            for (i = 0;
                                                    ZVal.isLessThan(i, '<', cnt);
                                                    i = ZAssignment.add("+=", i, 4)) {
                                                if (ZVal.toBool(
                                                                ZVal.isGreaterThanOrEqualTo(
                                                                        c,
                                                                        ">=",
                                                                        convmap.arrayGet(env, i)))
                                                        && ZVal.toBool(
                                                                ZVal.isLessThanOrEqualTo(
                                                                        c,
                                                                        "<=",
                                                                        convmap.arrayGet(
                                                                                env,
                                                                                ZVal.add(i, 1))))) {
                                                    return ZVal.assign(
                                                            com.project.convertedCode
                                                                    .globalNamespace.namespaces
                                                                    .Symfony.namespaces.Polyfill
                                                                    .namespaces.Mbstring.classes
                                                                    .Mbstring.runtimeStaticObject
                                                                    .mb_chr(
                                                                            env,
                                                                            ZVal.subtract(
                                                                                    c,
                                                                                    convmap
                                                                                            .arrayGet(
                                                                                                    env,
                                                                                                    ZVal
                                                                                                            .add(
                                                                                                                    i,
                                                                                                                    2)))));
                                                }
                                            }

                                            return ZVal.assign(m.arrayGet(env, 0));
                                        }
                                    }.use("convmap", convmap).use("cnt", cnt),
                                    s)
                            .value();
            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", encoding)) {
                return ZVal.assign(s);
            }

            return ZVal.assign(
                    NamespaceGlobal.iconv
                            .env(env)
                            .call("UTF-8", toStringR(encoding, env) + "//IGNORE", s)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "s")
        @ConvertedParameter(index = 1, name = "convmap")
        @ConvertedParameter(
            index = 2,
            name = "encoding",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 3,
            name = "is_hex",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object mb_encode_numericentity(RuntimeEnv env, Object... args) {
            int runtimeConverterContinueCount;
            ReferenceContainer s = new BasicReferenceContainer(assignParameter(args, 0, false));
            ReferenceContainer convmap =
                    new BasicReferenceContainer(assignParameter(args, 1, false));
            Object encoding = assignParameter(args, 2, true);
            if (null == encoding) {
                encoding = ZVal.getNull();
            }
            Object is_hex = assignParameter(args, 3, true);
            if (null == is_hex) {
                is_hex = false;
            }
            Object c = null;
            Object cnt = null;
            Object i = null;
            Object j = null;
            Object uchr = null;
            Object result = null;
            Object cOffset = null;
            Object len = null;
            Object ulen = null;
            ReferenceContainer ulenMask = new BasicReferenceContainer(null);
            if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.strictNotEqualityCheck(
                                                    ZVal.getNull(), "!==", s.getObject()))
                                    && ZVal.toBool(
                                            !function_is_scalar
                                                    .f
                                                    .env(env)
                                                    .call(s.getObject())
                                                    .getBool()))
                    && ZVal.toBool(
                            !ZVal.toBool(function_is_object.f.env(env).call(s.getObject()).value())
                                    && ZVal.toBool(
                                            function_method_exists
                                                    .f
                                                    .env(env)
                                                    .call(s.getObject(), "__toString")
                                                    .value()))) {
                NamespaceGlobal.trigger_error
                        .env(env)
                        .call(
                                "mb_encode_numericentity() expects parameter 1 to be string, "
                                        + toStringR(
                                                NamespaceGlobal.gettype
                                                        .env(env)
                                                        .call(s.getObject())
                                                        .value(),
                                                env)
                                        + " given",
                                512);
                return ZVal.assign(ZVal.getNull());
            }

            if (ZVal.toBool(!function_is_array.f.env(env).call(convmap.getObject()).getBool())
                    || ZVal.toBool(!ZVal.isTrue(convmap.getObject()))) {
                return ZVal.assign(false);
            }

            if (ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", encoding))
                    && ZVal.toBool(!function_is_scalar.f.env(env).call(encoding).getBool())) {
                NamespaceGlobal.trigger_error
                        .env(env)
                        .call(
                                "mb_encode_numericentity() expects parameter 3 to be string, "
                                        + toStringR(
                                                NamespaceGlobal.gettype
                                                        .env(env)
                                                        .call(s.getObject())
                                                        .value(),
                                                env)
                                        + " given",
                                512);
                return ZVal.assign(ZVal.getNull());
            }

            if (ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", is_hex))
                    && ZVal.toBool(!function_is_scalar.f.env(env).call(is_hex).getBool())) {
                NamespaceGlobal.trigger_error
                        .env(env)
                        .call(
                                "mb_encode_numericentity() expects parameter 4 to be boolean, "
                                        + toStringR(
                                                NamespaceGlobal.gettype
                                                        .env(env)
                                                        .call(s.getObject())
                                                        .value(),
                                                env)
                                        + " given",
                                512);
                return ZVal.assign(ZVal.getNull());
            }

            s.setObject(ZVal.assign(toStringR(s.getObject(), env)));
            if (ZVal.strictEqualityCheck("", "===", s.getObject())) {
                return "";
            }

            encoding = runtimeStaticObject.getEncoding(env, encoding);
            if (ZVal.strictEqualityCheck("UTF-8", "===", encoding)) {
                encoding = ZVal.getNull();
                if (!function_preg_match.f.env(env).call("//u", s.getObject()).getBool()) {
                    s.setObject(
                            NamespaceGlobal.iconv
                                    .env(env)
                                    .call("UTF-8", "UTF-8//IGNORE", s.getObject())
                                    .value());
                }

            } else {
                s.setObject(
                        NamespaceGlobal.iconv
                                .env(env)
                                .call(encoding, "UTF-8//IGNORE", s.getObject())
                                .value());
            }

            ulenMask =
                    env.getInlineStatic(
                            30,
                            ZVal.newArray(
                                    new ZPair(ZVal.base64Decode("wA=="), 2),
                                    new ZPair(ZVal.base64Decode("0A=="), 2),
                                    new ZPair(ZVal.base64Decode("4A=="), 3),
                                    new ZPair(ZVal.base64Decode("8A=="), 4)));
            cnt =
                    ZVal.multiply(
                            function_floor
                                    .f
                                    .env(env)
                                    .call(
                                            ZVal.divide(
                                                    function_count
                                                            .f
                                                            .env(env)
                                                            .call(convmap.getObject())
                                                            .value(),
                                                    4))
                                    .value(),
                            4);
            i = 0;
            len = function_strlen.f.env(env).call(s.getObject()).value();
            result = "";
            runtimeConverterContinueCount = 0;
            while (ZVal.isLessThan(i, '<', len)) {
                ulen =
                        ZVal.assign(
                                ZVal.isLessThan(s.arrayGet(env, i), '<', ZVal.base64Decode("gA=="))
                                        ? 1
                                        : ulenMask.arrayGet(
                                                env,
                                                ZVal.toLong(s.arrayGet(env, i))
                                                        & ZVal.toLong(ZVal.base64Decode("8A=="))));
                uchr = function_substr.f.env(env).call(s.getObject(), i, ulen).value();
                i = ZAssignment.add("+=", i, ulen);
                c = runtimeStaticObject.mb_ord(env, uchr);
                runtimeConverterContinueCount = 0;
                for (j = 0; ZVal.isLessThan(j, '<', cnt); j = ZAssignment.add("+=", j, 4)) {
                    if (ZVal.toBool(ZVal.isGreaterThanOrEqualTo(c, ">=", convmap.arrayGet(env, j)))
                            && ZVal.toBool(
                                    ZVal.isLessThanOrEqualTo(
                                            c, "<=", convmap.arrayGet(env, ZVal.add(j, 1))))) {
                        cOffset =
                                ZVal.toLong(ZVal.add(c, convmap.arrayGet(env, ZVal.add(j, 2))))
                                        & ZVal.toLong(convmap.arrayGet(env, ZVal.add(j, 3)));
                        result =
                                toStringR(result, env)
                                        + toStringR(
                                                ZVal.isTrue(is_hex)
                                                        ? function_sprintf
                                                                .f
                                                                .env(env)
                                                                .call("&#x%X;", cOffset)
                                                                .value()
                                                        : "&#" + toStringR(cOffset, env) + ";",
                                                env);
                        runtimeConverterContinueCount = 2;
                        runtimeConverterContinueCount--;
                        continue;
                    }
                }

                result = toStringR(result, env) + toStringR(uchr, env);
            }

            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", encoding)) {
                return ZVal.assign(result);
            }

            return ZVal.assign(
                    NamespaceGlobal.iconv
                            .env(env)
                            .call("UTF-8", toStringR(encoding, env) + "//IGNORE", result)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "s")
        @ConvertedParameter(index = 1, name = "mode")
        @ConvertedParameter(
            index = 2,
            name = "encoding",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object mb_convert_case(RuntimeEnv env, Object... args) {
            ReferenceContainer s = new BasicReferenceContainer(assignParameter(args, 0, false));
            Object mode = assignParameter(args, 1, false);
            Object encoding = assignParameter(args, 2, true);
            if (null == encoding) {
                encoding = ZVal.getNull();
            }
            Object len = null;
            ReferenceContainer nlen = new BasicReferenceContainer(null);
            ReferenceContainer ulen = new BasicReferenceContainer(null);
            ReferenceContainer upper = new BasicReferenceContainer(null);
            ReferenceContainer lower = new BasicReferenceContainer(null);
            Object i = null;
            ReferenceContainer ulenMask = new BasicReferenceContainer(null);
            ReferenceContainer map = new BasicReferenceContainer(null);
            ReferenceContainer uchr = new BasicReferenceContainer(null);
            s.setObject(ZVal.assign(toStringR(s.getObject(), env)));
            if (ZVal.strictEqualityCheck("", "===", s.getObject())) {
                return "";
            }

            encoding = runtimeStaticObject.getEncoding(env, encoding);
            if (ZVal.strictEqualityCheck("UTF-8", "===", encoding)) {
                encoding = ZVal.getNull();
                if (!function_preg_match.f.env(env).call("//u", s.getObject()).getBool()) {
                    s.setObject(
                            NamespaceGlobal.iconv
                                    .env(env)
                                    .call("UTF-8", "UTF-8//IGNORE", s.getObject())
                                    .value());
                }

            } else {
                s.setObject(
                        NamespaceGlobal.iconv
                                .env(env)
                                .call(encoding, "UTF-8//IGNORE", s.getObject())
                                .value());
            }

            if (ZVal.equalityCheck(2, mode)) {
                s.setObject(
                        NamespaceGlobal.preg_replace_callback
                                .env(env)
                                .call(
                                        "/\\b\\p{Ll}/u",
                                        ZVal.newArray(
                                                new ZPair(0, "Mbstring"),
                                                new ZPair(1, "title_case_upper")),
                                        s.getObject())
                                .value());
                s.setObject(
                        NamespaceGlobal.preg_replace_callback
                                .env(env)
                                .call(
                                        "/\\B[\\p{Lu}\\p{Lt}]+/u",
                                        ZVal.newArray(
                                                new ZPair(0, "Mbstring"),
                                                new ZPair(1, "title_case_lower")),
                                        s.getObject())
                                .value());

            } else {
                if (ZVal.equalityCheck(0, mode)) {
                    upper = env.getInlineStatic(31, ZVal.getNull());
                    if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", upper.getObject())) {
                        upper.setObject(runtimeStaticObject.getData(env, "upperCase"));
                    }

                    map.setObject(ZVal.assign(upper.getObject()));

                } else {
                    if (ZVal.strictEqualityCheck(CONST_MB_CASE_FOLD, "===", mode)) {
                        s.setObject(
                                function_str_replace
                                        .f
                                        .env(env)
                                        .call(
                                                env.getRequestStaticPropertiesReference(
                                                                com.project
                                                                        .convertedCode
                                                                        .globalNamespace
                                                                        .namespaces
                                                                        .Symfony
                                                                        .namespaces
                                                                        .Polyfill
                                                                        .namespaces
                                                                        .Mbstring
                                                                        .classes
                                                                        .Mbstring
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "caseFold")
                                                        .arrayGet(env, 0),
                                                env.getRequestStaticPropertiesReference(
                                                                com.project
                                                                        .convertedCode
                                                                        .globalNamespace
                                                                        .namespaces
                                                                        .Symfony
                                                                        .namespaces
                                                                        .Polyfill
                                                                        .namespaces
                                                                        .Mbstring
                                                                        .classes
                                                                        .Mbstring
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "caseFold")
                                                        .arrayGet(env, 1),
                                                s.getObject())
                                        .value());
                    }

                    lower = env.getInlineStatic(32, ZVal.getNull());
                    if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", lower.getObject())) {
                        lower.setObject(runtimeStaticObject.getData(env, "lowerCase"));
                    }

                    map.setObject(ZVal.assign(lower.getObject()));
                }

                ulenMask =
                        env.getInlineStatic(
                                33,
                                ZVal.newArray(
                                        new ZPair(ZVal.base64Decode("wA=="), 2),
                                        new ZPair(ZVal.base64Decode("0A=="), 2),
                                        new ZPair(ZVal.base64Decode("4A=="), 3),
                                        new ZPair(ZVal.base64Decode("8A=="), 4)));
                i = 0;
                len = function_strlen.f.env(env).call(s.getObject()).value();
                while (ZVal.isLessThan(i, '<', len)) {
                    ulen.setObject(
                            ZVal.assign(
                                    ZVal.isLessThan(
                                                    s.arrayGet(env, i),
                                                    '<',
                                                    ZVal.base64Decode("gA=="))
                                            ? 1
                                            : ulenMask.arrayGet(
                                                    env,
                                                    ZVal.toLong(s.arrayGet(env, i))
                                                            & ZVal.toLong(
                                                                    ZVal.base64Decode("8A==")))));
                    uchr.setObject(
                            function_substr
                                    .f
                                    .env(env)
                                    .call(s.getObject(), i, ulen.getObject())
                                    .value());
                    i = ZAssignment.add("+=", i, ulen.getObject());
                    if (arrayActionR(ArrayAction.ISSET, map, env, uchr.getObject())) {
                        uchr.setObject(ZVal.assign(map.arrayGet(env, uchr.getObject())));
                        nlen.setObject(function_strlen.f.env(env).call(uchr.getObject()).value());
                        if (ZVal.equalityCheck(nlen.getObject(), ulen.getObject())) {
                            nlen.setObject(ZVal.assign(i));
                            do {
                                s.arrayAccess(env, ZVal.preDecrement(nlen))
                                        .set(uchr.arrayGet(env, ZVal.preDecrement(ulen)));

                            } while (ZVal.isTrue(ulen.getObject()));

                        } else {
                            s.setObject(
                                    NamespaceGlobal.substr_replace
                                            .env(env)
                                            .call(
                                                    s.getObject(),
                                                    uchr.getObject(),
                                                    ZVal.subtract(i, ulen.getObject()),
                                                    ulen.getObject())
                                            .value());
                            len =
                                    ZAssignment.add(
                                            "+=",
                                            len,
                                            ZVal.subtract(nlen.getObject(), ulen.getObject()));
                            i =
                                    ZAssignment.add(
                                            "+=",
                                            i,
                                            ZVal.subtract(nlen.getObject(), ulen.getObject()));
                        }
                    }
                }
            }

            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", encoding)) {
                return ZVal.assign(s.getObject());
            }

            return ZVal.assign(
                    NamespaceGlobal.iconv
                            .env(env)
                            .call("UTF-8", toStringR(encoding, env) + "//IGNORE", s.getObject())
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "encoding",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object mb_internal_encoding(RuntimeEnv env, Object... args) {
            Object encoding = assignParameter(args, 0, true);
            if (null == encoding) {
                encoding = ZVal.getNull();
            }
            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", encoding)) {
                return ZVal.assign(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Polyfill
                                                .namespaces
                                                .Mbstring
                                                .classes
                                                .Mbstring
                                                .RequestStaticProperties
                                                .class)
                                .internalEncoding);
            }

            encoding = runtimeStaticObject.getEncoding(env, encoding);
            if (ZVal.toBool(ZVal.strictEqualityCheck("UTF-8", "===", encoding))
                    || ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    false,
                                    "!==",
                                    NamespaceGlobal.iconv
                                            .env(env)
                                            .call(encoding, encoding, " ")
                                            .value()))) {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Polyfill
                                                .namespaces
                                                .Mbstring
                                                .classes
                                                .Mbstring
                                                .RequestStaticProperties
                                                .class)
                                .internalEncoding =
                        encoding;
                return ZVal.assign(true);
            }

            return ZVal.assign(false);
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "lang",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object mb_language(RuntimeEnv env, Object... args) {
            Object lang = assignParameter(args, 0, true);
            if (null == lang) {
                lang = ZVal.getNull();
            }
            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", lang)) {
                return ZVal.assign(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Polyfill
                                                .namespaces
                                                .Mbstring
                                                .classes
                                                .Mbstring
                                                .RequestStaticProperties
                                                .class)
                                .language);
            }

            switch (toStringR(lang = NamespaceGlobal.strtolower.env(env).call(lang).value())) {
                case "uni":
                case "neutral":
                    env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Symfony
                                                    .namespaces
                                                    .Polyfill
                                                    .namespaces
                                                    .Mbstring
                                                    .classes
                                                    .Mbstring
                                                    .RequestStaticProperties
                                                    .class)
                                    .language =
                            lang;
                    return ZVal.assign(true);
            }
            ;
            return ZVal.assign(false);
        }

        @ConvertedMethod
        public Object mb_list_encodings(RuntimeEnv env, Object... args) {
            return ZVal.assign(ZVal.arrayFromList("UTF-8"));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "encoding")
        public Object mb_encoding_aliases(RuntimeEnv env, Object... args) {
            Object encoding = assignParameter(args, 0, false);
            switch (toStringR(NamespaceGlobal.strtoupper.env(env).call(encoding).value())) {
                case "UTF8":
                case "UTF-8":
                    return ZVal.assign(ZVal.arrayFromList("utf8"));
            }
            ;
            return ZVal.assign(false);
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "var",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 1,
            name = "encoding",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object mb_check_encoding(RuntimeEnv env, Object... args) {
            Object var = assignParameter(args, 0, true);
            if (null == var) {
                var = ZVal.getNull();
            }
            Object encoding = assignParameter(args, 1, true);
            if (null == encoding) {
                encoding = ZVal.getNull();
            }
            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", encoding)) {
                if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", var)) {
                    return ZVal.assign(false);
                }

                encoding =
                        ZVal.assign(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Symfony
                                                        .namespaces
                                                        .Polyfill
                                                        .namespaces
                                                        .Mbstring
                                                        .classes
                                                        .Mbstring
                                                        .RequestStaticProperties
                                                        .class)
                                        .internalEncoding);
            }

            return ZVal.assign(
                    ZVal.toBool(
                                    runtimeStaticObject.mb_detect_encoding(
                                            env, var, ZVal.newArray(new ZPair(0, encoding))))
                            || ZVal.toBool(
                                    ZVal.strictNotEqualityCheck(
                                            false,
                                            "!==",
                                            NamespaceGlobal.iconv
                                                    .env(env)
                                                    .call(encoding, encoding, var)
                                                    .value())));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "str")
        @ConvertedParameter(
            index = 1,
            name = "encodingList",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 2,
            name = "strict",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object mb_detect_encoding(RuntimeEnv env, Object... args) {
            int runtimeConverterBreakCount;
            Object str = assignParameter(args, 0, false);
            Object encodingList = assignParameter(args, 1, true);
            if (null == encodingList) {
                encodingList = ZVal.getNull();
            }
            Object strict = assignParameter(args, 2, true);
            if (null == strict) {
                strict = false;
            }
            Object enc = null;
            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", encodingList)) {
                encodingList =
                        ZVal.assign(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Symfony
                                                        .namespaces
                                                        .Polyfill
                                                        .namespaces
                                                        .Mbstring
                                                        .classes
                                                        .Mbstring
                                                        .RequestStaticProperties
                                                        .class)
                                        .encodingList);

            } else {
                if (!function_is_array.f.env(env).call(encodingList).getBool()) {
                    encodingList =
                            function_array_map
                                    .f
                                    .env(env)
                                    .call(
                                            "trim",
                                            function_explode
                                                    .f
                                                    .env(env)
                                                    .call(",", encodingList)
                                                    .value())
                                    .value();
                }

                encodingList =
                        function_array_map.f.env(env).call("strtoupper", encodingList).value();
            }

            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult1988 : ZVal.getIterable(encodingList, env, true)) {
                enc = ZVal.assign(zpairResult1988.getValue());
                SwitchEnumType129 switchVariable129 =
                        ZVal.getEnum(
                                enc,
                                SwitchEnumType129.DEFAULT_CASE,
                                SwitchEnumType129.STRING_ASCII,
                                "ASCII",
                                SwitchEnumType129.STRING_UTF8,
                                "UTF8",
                                SwitchEnumType129.STRING_UTF_8,
                                "UTF-8");
                switch (switchVariable129) {
                    case STRING_ASCII:
                        if (!function_preg_match
                                .f
                                .env(env)
                                .call("/[\\x80-\\xFF]/", str)
                                .getBool()) {
                            return ZVal.assign(enc);
                        }

                        break;
                    case STRING_UTF8:
                    case STRING_UTF_8:
                        if (function_preg_match.f.env(env).call("//u", str).getBool()) {
                            return "UTF-8";
                        }

                        break;
                    case DEFAULT_CASE:
                        if (ZVal.strictEqualityCheck(
                                0,
                                "===",
                                NamespaceGlobal.strncmp
                                        .env(env)
                                        .call(enc, "ISO-8859-", 9)
                                        .value())) {
                            return ZVal.assign(enc);
                        }
                }
                ;
            }

            return ZVal.assign(false);
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "encodingList",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object mb_detect_order(RuntimeEnv env, Object... args) {
            Object encodingList = assignParameter(args, 0, true);
            if (null == encodingList) {
                encodingList = ZVal.getNull();
            }
            Object enc = null;
            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", encodingList)) {
                return ZVal.assign(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Polyfill
                                                .namespaces
                                                .Mbstring
                                                .classes
                                                .Mbstring
                                                .RequestStaticProperties
                                                .class)
                                .encodingList);
            }

            if (!function_is_array.f.env(env).call(encodingList).getBool()) {
                encodingList =
                        function_array_map
                                .f
                                .env(env)
                                .call(
                                        "trim",
                                        function_explode.f.env(env).call(",", encodingList).value())
                                .value();
            }

            encodingList = function_array_map.f.env(env).call("strtoupper", encodingList).value();
            for (ZPair zpairResult1989 : ZVal.getIterable(encodingList, env, true)) {
                enc = ZVal.assign(zpairResult1989.getValue());
                SwitchEnumType130 switchVariable130 =
                        ZVal.getEnum(
                                enc,
                                SwitchEnumType130.DEFAULT_CASE,
                                SwitchEnumType130.STRING_ASCII,
                                "ASCII",
                                SwitchEnumType130.STRING_UTF8,
                                "UTF8",
                                SwitchEnumType130.STRING_UTF_8,
                                "UTF-8");
                switch (switchVariable130) {
                    case DEFAULT_CASE:
                        if (NamespaceGlobal.strncmp.env(env).call(enc, "ISO-8859-", 9).getBool()) {
                            return ZVal.assign(false);
                        }

                    case STRING_ASCII:
                    case STRING_UTF8:
                    case STRING_UTF_8:
                }
                ;
            }

            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Polyfill
                                            .namespaces
                                            .Mbstring
                                            .classes
                                            .Mbstring
                                            .RequestStaticProperties
                                            .class)
                            .encodingList =
                    encodingList;
            return ZVal.assign(true);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "s")
        @ConvertedParameter(
            index = 1,
            name = "encoding",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object mb_strlen(RuntimeEnv env, Object... args) {
            Object s = assignParameter(args, 0, false);
            Object encoding = assignParameter(args, 1, true);
            if (null == encoding) {
                encoding = ZVal.getNull();
            }
            encoding = runtimeStaticObject.getEncoding(env, encoding);
            if (ZVal.toBool(ZVal.strictEqualityCheck("CP850", "===", encoding))
                    || ZVal.toBool(ZVal.strictEqualityCheck("ASCII", "===", encoding))) {
                return ZVal.assign(function_strlen.f.env(env).call(s).value());
            }

            return ZVal.assign(NamespaceGlobal.iconv_strlen.env(env).call(s, encoding).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "haystack")
        @ConvertedParameter(index = 1, name = "needle")
        @ConvertedParameter(
            index = 2,
            name = "offset",
            defaultValue = "0",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 3,
            name = "encoding",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object mb_strpos(RuntimeEnv env, Object... args) {
            Object haystack = assignParameter(args, 0, false);
            Object needle = assignParameter(args, 1, false);
            Object offset = assignParameter(args, 2, true);
            if (null == offset) {
                offset = 0;
            }
            Object encoding = assignParameter(args, 3, true);
            if (null == encoding) {
                encoding = ZVal.getNull();
            }
            encoding = runtimeStaticObject.getEncoding(env, encoding);
            if (ZVal.toBool(ZVal.strictEqualityCheck("CP850", "===", encoding))
                    || ZVal.toBool(ZVal.strictEqualityCheck("ASCII", "===", encoding))) {
                return ZVal.assign(
                        function_strpos.f.env(env).call(haystack, needle, offset).value());
            }

            needle = ZVal.assign(toStringR(needle, env));
            if (ZVal.strictEqualityCheck("", "===", needle)) {
                NamespaceGlobal.trigger_error
                        .env(env)
                        .call(toStringR("Mbstring::mb_strpos", env) + ": Empty delimiter", 512);
                return ZVal.assign(false);
            }

            return ZVal.assign(
                    NamespaceGlobal.iconv_strpos
                            .env(env)
                            .call(haystack, needle, offset, encoding)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "haystack")
        @ConvertedParameter(index = 1, name = "needle")
        @ConvertedParameter(
            index = 2,
            name = "offset",
            defaultValue = "0",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 3,
            name = "encoding",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object mb_strrpos(RuntimeEnv env, Object... args) {
            Object haystack = assignParameter(args, 0, false);
            Object needle = assignParameter(args, 1, false);
            Object offset = assignParameter(args, 2, true);
            if (null == offset) {
                offset = 0;
            }
            Object encoding = assignParameter(args, 3, true);
            if (null == encoding) {
                encoding = ZVal.getNull();
            }
            Object pos = null;
            encoding = runtimeStaticObject.getEncoding(env, encoding);
            if (ZVal.toBool(ZVal.strictEqualityCheck("CP850", "===", encoding))
                    || ZVal.toBool(ZVal.strictEqualityCheck("ASCII", "===", encoding))) {
                return ZVal.assign(
                        NamespaceGlobal.strrpos.env(env).call(haystack, needle, offset).value());
            }

            if (ZVal.notEqualityCheck(offset, ZVal.toLong(offset))) {
                offset = 0;

            } else if (ZVal.isTrue(offset = ZVal.assign(ZVal.toLong(offset)))) {
                if (ZVal.isLessThan(offset, '<', 0)) {
                    haystack = runtimeStaticObject.mb_substr(env, haystack, 0, offset, encoding);
                    offset = 0;

                } else {
                    haystack =
                            runtimeStaticObject.mb_substr(
                                    env, haystack, offset, 2147483647L, encoding);
                }
            }

            pos = NamespaceGlobal.iconv_strrpos.env(env).call(haystack, needle, encoding).value();
            return ZVal.assign(
                    ZVal.strictNotEqualityCheck(false, "!==", pos) ? ZVal.add(offset, pos) : false);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "s")
        @ConvertedParameter(
            index = 1,
            name = "encoding",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object mb_strtolower(RuntimeEnv env, Object... args) {
            Object s = assignParameter(args, 0, false);
            Object encoding = assignParameter(args, 1, true);
            if (null == encoding) {
                encoding = ZVal.getNull();
            }
            return ZVal.assign(runtimeStaticObject.mb_convert_case(env, s, 1, encoding));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "s")
        @ConvertedParameter(
            index = 1,
            name = "encoding",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object mb_strtoupper(RuntimeEnv env, Object... args) {
            Object s = assignParameter(args, 0, false);
            Object encoding = assignParameter(args, 1, true);
            if (null == encoding) {
                encoding = ZVal.getNull();
            }
            return ZVal.assign(runtimeStaticObject.mb_convert_case(env, s, 0, encoding));
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "c",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object mb_substitute_character(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, true);
            if (null == c) {
                c = ZVal.getNull();
            }
            if (ZVal.strictEqualityCheck(
                    0, "===", NamespaceGlobal.strcasecmp.env(env).call(c, "none").value())) {
                return ZVal.assign(true);
            }

            return ZVal.assign(
                    ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", c) ? false : "none");
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "s")
        @ConvertedParameter(index = 1, name = "start")
        @ConvertedParameter(
            index = 2,
            name = "length",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 3,
            name = "encoding",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object mb_substr(RuntimeEnv env, Object... args) {
            Object s = assignParameter(args, 0, false);
            Object start = assignParameter(args, 1, false);
            Object length = assignParameter(args, 2, true);
            if (null == length) {
                length = ZVal.getNull();
            }
            Object encoding = assignParameter(args, 3, true);
            if (null == encoding) {
                encoding = ZVal.getNull();
            }
            encoding = runtimeStaticObject.getEncoding(env, encoding);
            if (ZVal.toBool(ZVal.strictEqualityCheck("CP850", "===", encoding))
                    || ZVal.toBool(ZVal.strictEqualityCheck("ASCII", "===", encoding))) {
                return ZVal.assign(
                        function_substr
                                .f
                                .env(env)
                                .call(
                                        s,
                                        start,
                                        ZVal.strictEqualityCheck(ZVal.getNull(), "===", length)
                                                ? 2147483647L
                                                : length)
                                .value());
            }

            if (ZVal.isLessThan(start, '<', 0)) {
                start =
                        ZVal.add(
                                NamespaceGlobal.iconv_strlen.env(env).call(s, encoding).value(),
                                start);
                if (ZVal.isLessThan(start, '<', 0)) {
                    start = 0;
                }
            }

            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", length)) {
                length = 2147483647L;

            } else if (ZVal.isLessThan(length, '<', 0)) {
                length =
                        ZVal.subtract(
                                ZVal.add(
                                        NamespaceGlobal.iconv_strlen
                                                .env(env)
                                                .call(s, encoding)
                                                .value(),
                                        length),
                                start);
                if (ZVal.isLessThan(length, '<', 0)) {
                    return "";
                }
            }

            return ZVal.assign(
                    toStringR(
                            NamespaceGlobal.iconv_substr
                                    .env(env)
                                    .call(s, start, length, encoding)
                                    .value(),
                            env));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "haystack")
        @ConvertedParameter(index = 1, name = "needle")
        @ConvertedParameter(
            index = 2,
            name = "offset",
            defaultValue = "0",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 3,
            name = "encoding",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object mb_stripos(RuntimeEnv env, Object... args) {
            Object haystack = assignParameter(args, 0, false);
            Object needle = assignParameter(args, 1, false);
            Object offset = assignParameter(args, 2, true);
            if (null == offset) {
                offset = 0;
            }
            Object encoding = assignParameter(args, 3, true);
            if (null == encoding) {
                encoding = ZVal.getNull();
            }
            haystack =
                    runtimeStaticObject.mb_convert_case(
                            env, haystack, CONST_MB_CASE_FOLD, encoding);
            needle = runtimeStaticObject.mb_convert_case(env, needle, CONST_MB_CASE_FOLD, encoding);
            return ZVal.assign(
                    runtimeStaticObject.mb_strpos(env, haystack, needle, offset, encoding));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "haystack")
        @ConvertedParameter(index = 1, name = "needle")
        @ConvertedParameter(
            index = 2,
            name = "part",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 3,
            name = "encoding",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object mb_stristr(RuntimeEnv env, Object... args) {
            Object haystack = assignParameter(args, 0, false);
            Object needle = assignParameter(args, 1, false);
            Object part = assignParameter(args, 2, true);
            if (null == part) {
                part = false;
            }
            Object encoding = assignParameter(args, 3, true);
            if (null == encoding) {
                encoding = ZVal.getNull();
            }
            Object pos = null;
            pos = runtimeStaticObject.mb_stripos(env, haystack, needle, 0, encoding);
            return ZVal.assign(runtimeStaticObject.getSubpart(env, pos, part, haystack, encoding));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "haystack")
        @ConvertedParameter(index = 1, name = "needle")
        @ConvertedParameter(
            index = 2,
            name = "part",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 3,
            name = "encoding",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object mb_strrchr(RuntimeEnv env, Object... args) {
            Object haystack = assignParameter(args, 0, false);
            Object needle = assignParameter(args, 1, false);
            Object part = assignParameter(args, 2, true);
            if (null == part) {
                part = false;
            }
            Object encoding = assignParameter(args, 3, true);
            if (null == encoding) {
                encoding = ZVal.getNull();
            }
            Object pos = null;
            encoding = runtimeStaticObject.getEncoding(env, encoding);
            if (ZVal.toBool(ZVal.strictEqualityCheck("CP850", "===", encoding))
                    || ZVal.toBool(ZVal.strictEqualityCheck("ASCII", "===", encoding))) {
                return ZVal.assign(
                        NamespaceGlobal.strrchr.env(env).call(haystack, needle, part).value());
            }

            needle = runtimeStaticObject.mb_substr(env, needle, 0, 1, encoding);
            pos = NamespaceGlobal.iconv_strrpos.env(env).call(haystack, needle, encoding).value();
            return ZVal.assign(runtimeStaticObject.getSubpart(env, pos, part, haystack, encoding));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "haystack")
        @ConvertedParameter(index = 1, name = "needle")
        @ConvertedParameter(
            index = 2,
            name = "part",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 3,
            name = "encoding",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object mb_strrichr(RuntimeEnv env, Object... args) {
            Object haystack = assignParameter(args, 0, false);
            Object needle = assignParameter(args, 1, false);
            Object part = assignParameter(args, 2, true);
            if (null == part) {
                part = false;
            }
            Object encoding = assignParameter(args, 3, true);
            if (null == encoding) {
                encoding = ZVal.getNull();
            }
            Object pos = null;
            needle = runtimeStaticObject.mb_substr(env, needle, 0, 1, encoding);
            pos = runtimeStaticObject.mb_strripos(env, haystack, needle, encoding);
            return ZVal.assign(runtimeStaticObject.getSubpart(env, pos, part, haystack, encoding));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "haystack")
        @ConvertedParameter(index = 1, name = "needle")
        @ConvertedParameter(
            index = 2,
            name = "offset",
            defaultValue = "0",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 3,
            name = "encoding",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object mb_strripos(RuntimeEnv env, Object... args) {
            Object haystack = assignParameter(args, 0, false);
            Object needle = assignParameter(args, 1, false);
            Object offset = assignParameter(args, 2, true);
            if (null == offset) {
                offset = 0;
            }
            Object encoding = assignParameter(args, 3, true);
            if (null == encoding) {
                encoding = ZVal.getNull();
            }
            haystack =
                    runtimeStaticObject.mb_convert_case(
                            env, haystack, CONST_MB_CASE_FOLD, encoding);
            needle = runtimeStaticObject.mb_convert_case(env, needle, CONST_MB_CASE_FOLD, encoding);
            return ZVal.assign(
                    runtimeStaticObject.mb_strrpos(env, haystack, needle, offset, encoding));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "haystack")
        @ConvertedParameter(index = 1, name = "needle")
        @ConvertedParameter(
            index = 2,
            name = "part",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 3,
            name = "encoding",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object mb_strstr(RuntimeEnv env, Object... args) {
            Object haystack = assignParameter(args, 0, false);
            Object needle = assignParameter(args, 1, false);
            Object part = assignParameter(args, 2, true);
            if (null == part) {
                part = false;
            }
            Object encoding = assignParameter(args, 3, true);
            if (null == encoding) {
                encoding = ZVal.getNull();
            }
            Object pos = null;
            pos = function_strpos.f.env(env).call(haystack, needle).value();
            if (ZVal.strictEqualityCheck(false, "===", pos)) {
                return ZVal.assign(false);
            }

            if (ZVal.isTrue(part)) {
                return ZVal.assign(function_substr.f.env(env).call(haystack, 0, pos).value());
            }

            return ZVal.assign(function_substr.f.env(env).call(haystack, pos).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "type")
        public Object mb_get_info(RuntimeEnv env, Object... args) {
            Object type = assignParameter(args, 0, true);
            if (null == type) {
                type = "all";
            }
            ReferenceContainer info = new BasicReferenceContainer(null);
            info.setObject(
                    ZVal.newArray(
                            new ZPair(
                                    "internal_encoding",
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Symfony
                                                            .namespaces
                                                            .Polyfill
                                                            .namespaces
                                                            .Mbstring
                                                            .classes
                                                            .Mbstring
                                                            .RequestStaticProperties
                                                            .class)
                                            .internalEncoding),
                            new ZPair("http_output", "pass"),
                            new ZPair(
                                    "http_output_conv_mimetypes",
                                    "^(text/|application/xhtml\\+xml)"),
                            new ZPair("func_overload", 0),
                            new ZPair("func_overload_list", "no overload"),
                            new ZPair("mail_charset", "UTF-8"),
                            new ZPair("mail_header_encoding", "BASE64"),
                            new ZPair("mail_body_encoding", "BASE64"),
                            new ZPair("illegal_chars", 0),
                            new ZPair("encoding_translation", "Off"),
                            new ZPair(
                                    "language",
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Symfony
                                                            .namespaces
                                                            .Polyfill
                                                            .namespaces
                                                            .Mbstring
                                                            .classes
                                                            .Mbstring
                                                            .RequestStaticProperties
                                                            .class)
                                            .language),
                            new ZPair(
                                    "detect_order",
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Symfony
                                                            .namespaces
                                                            .Polyfill
                                                            .namespaces
                                                            .Mbstring
                                                            .classes
                                                            .Mbstring
                                                            .RequestStaticProperties
                                                            .class)
                                            .encodingList),
                            new ZPair("substitute_character", "none"),
                            new ZPair("strict_detection", "Off")));
            if (ZVal.strictEqualityCheck("all", "===", type)) {
                return ZVal.assign(info.getObject());
            }

            if (arrayActionR(ArrayAction.ISSET, info, env, type)) {
                return ZVal.assign(info.arrayGet(env, type));
            }

            return ZVal.assign(false);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "type")
        public Object mb_http_input(RuntimeEnv env, Object... args) {
            Object type = assignParameter(args, 0, true);
            if (null == type) {
                type = "";
            }
            return ZVal.assign(false);
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "encoding",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object mb_http_output(RuntimeEnv env, Object... args) {
            Object encoding = assignParameter(args, 0, true);
            if (null == encoding) {
                encoding = ZVal.getNull();
            }
            return ZVal.assign(
                    ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", encoding)
                            ? ZVal.strictEqualityCheck("pass", "===", encoding)
                            : "pass");
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "s")
        @ConvertedParameter(
            index = 1,
            name = "encoding",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object mb_strwidth(RuntimeEnv env, Object... args) {
            Object s = assignParameter(args, 0, false);
            Object encoding = assignParameter(args, 1, true);
            if (null == encoding) {
                encoding = ZVal.getNull();
            }
            ReferenceContainer wide = new BasicReferenceContainer(null);
            encoding = runtimeStaticObject.getEncoding(env, encoding);
            if (ZVal.strictNotEqualityCheck("UTF-8", "!==", encoding)) {
                s = NamespaceGlobal.iconv.env(env).call(encoding, "UTF-8//IGNORE", s).value();
            }

            s =
                    function_preg_replace
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithReferences().add(4, wide))
                            .call(
                                    "/[\\x{1100}-\\x{115F}\\x{2329}\\x{232A}\\x{2E80}-\\x{303E}\\x{3040}-\\x{A4CF}\\x{AC00}-\\x{D7A3}\\x{F900}-\\x{FAFF}\\x{FE10}-\\x{FE19}\\x{FE30}-\\x{FE6F}\\x{FF00}-\\x{FF60}\\x{FFE0}-\\x{FFE6}\\x{20000}-\\x{2FFFD}\\x{30000}-\\x{3FFFD}]/u",
                                    "",
                                    s,
                                    -1,
                                    wide.getObject())
                            .value();
            return ZVal.assign(
                    ZVal.add(
                            ZVal.toLong(wide.getObject()) << ZVal.toLong(1),
                            NamespaceGlobal.iconv_strlen.env(env).call(s, "UTF-8").value()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "haystack")
        @ConvertedParameter(index = 1, name = "needle")
        @ConvertedParameter(
            index = 2,
            name = "encoding",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object mb_substr_count(RuntimeEnv env, Object... args) {
            Object haystack = assignParameter(args, 0, false);
            Object needle = assignParameter(args, 1, false);
            Object encoding = assignParameter(args, 2, true);
            if (null == encoding) {
                encoding = ZVal.getNull();
            }
            return ZVal.assign(
                    NamespaceGlobal.substr_count.env(env).call(haystack, needle).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "contents")
        @ConvertedParameter(index = 1, name = "status")
        public Object mb_output_handler(RuntimeEnv env, Object... args) {
            Object contents = assignParameter(args, 0, false);
            Object status = assignParameter(args, 1, false);
            return ZVal.assign(contents);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "code")
        @ConvertedParameter(
            index = 1,
            name = "encoding",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object mb_chr(RuntimeEnv env, Object... args) {
            Object code = assignParameter(args, 0, false);
            Object encoding = assignParameter(args, 1, true);
            if (null == encoding) {
                encoding = ZVal.getNull();
            }
            Object s = null;
            if (ZVal.isGreaterThan(128, '>', code = ZAssignment.modulus("%=", code, 2097152))) {
                s = NamespaceGlobal.chr.env(env).call(code).value();

            } else if (ZVal.isGreaterThan(2048, '>', code)) {
                s =
                        toStringR(
                                        NamespaceGlobal.chr
                                                .env(env)
                                                .call(
                                                        ZVal.toLong(192)
                                                                | ZVal.toLong(
                                                                        ZVal.toLong(code)
                                                                                >> ZVal.toLong(6)))
                                                .value(),
                                        env)
                                + toStringR(
                                        NamespaceGlobal.chr
                                                .env(env)
                                                .call(
                                                        ZVal.toLong(128)
                                                                | ZVal.toLong(
                                                                        ZVal.toLong(code)
                                                                                & ZVal.toLong(63)))
                                                .value(),
                                        env);

            } else if (ZVal.isGreaterThan(65536, '>', code)) {
                s =
                        toStringR(
                                        NamespaceGlobal.chr
                                                .env(env)
                                                .call(
                                                        ZVal.toLong(224)
                                                                | ZVal.toLong(
                                                                        ZVal.toLong(code)
                                                                                >> ZVal.toLong(12)))
                                                .value(),
                                        env)
                                + toStringR(
                                        NamespaceGlobal.chr
                                                .env(env)
                                                .call(
                                                        ZVal.toLong(128)
                                                                | ZVal.toLong(
                                                                        ZVal.toLong(
                                                                                        ZVal.toLong(
                                                                                                        code)
                                                                                                >> ZVal
                                                                                                        .toLong(
                                                                                                                6))
                                                                                & ZVal.toLong(63)))
                                                .value(),
                                        env)
                                + toStringR(
                                        NamespaceGlobal.chr
                                                .env(env)
                                                .call(
                                                        ZVal.toLong(128)
                                                                | ZVal.toLong(
                                                                        ZVal.toLong(code)
                                                                                & ZVal.toLong(63)))
                                                .value(),
                                        env);

            } else {
                s =
                        toStringR(
                                        NamespaceGlobal.chr
                                                .env(env)
                                                .call(
                                                        ZVal.toLong(240)
                                                                | ZVal.toLong(
                                                                        ZVal.toLong(code)
                                                                                >> ZVal.toLong(18)))
                                                .value(),
                                        env)
                                + toStringR(
                                        NamespaceGlobal.chr
                                                .env(env)
                                                .call(
                                                        ZVal.toLong(128)
                                                                | ZVal.toLong(
                                                                        ZVal.toLong(
                                                                                        ZVal.toLong(
                                                                                                        code)
                                                                                                >> ZVal
                                                                                                        .toLong(
                                                                                                                12))
                                                                                & ZVal.toLong(63)))
                                                .value(),
                                        env)
                                + toStringR(
                                        NamespaceGlobal.chr
                                                .env(env)
                                                .call(
                                                        ZVal.toLong(128)
                                                                | ZVal.toLong(
                                                                        ZVal.toLong(
                                                                                        ZVal.toLong(
                                                                                                        code)
                                                                                                >> ZVal
                                                                                                        .toLong(
                                                                                                                6))
                                                                                & ZVal.toLong(63)))
                                                .value(),
                                        env)
                                + toStringR(
                                        NamespaceGlobal.chr
                                                .env(env)
                                                .call(
                                                        ZVal.toLong(128)
                                                                | ZVal.toLong(
                                                                        ZVal.toLong(code)
                                                                                & ZVal.toLong(63)))
                                                .value(),
                                        env);
            }

            if (ZVal.strictNotEqualityCheck(
                    "UTF-8", "!==", encoding = runtimeStaticObject.getEncoding(env, encoding))) {
                s = NamespaceGlobal.mb_convert_encoding.env(env).call(s, encoding, "UTF-8").value();
            }

            return ZVal.assign(s);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "s")
        @ConvertedParameter(
            index = 1,
            name = "encoding",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object mb_ord(RuntimeEnv env, Object... args) {
            ReferenceContainer s = new BasicReferenceContainer(assignParameter(args, 0, false));
            Object encoding = assignParameter(args, 1, true);
            if (null == encoding) {
                encoding = ZVal.getNull();
            }
            Object code = null;
            if (ZVal.strictNotEqualityCheck(
                    "UTF-8", "!==", encoding = runtimeStaticObject.getEncoding(env, encoding))) {
                s.setObject(
                        NamespaceGlobal.mb_convert_encoding
                                .env(env)
                                .call(s.getObject(), "UTF-8", encoding)
                                .value());
            }

            code =
                    ZVal.assign(
                            ZVal.isTrue(
                                            s.setObject(
                                                    NamespaceGlobal.unpack
                                                            .env(env)
                                                            .call(
                                                                    "C*",
                                                                    function_substr
                                                                            .f
                                                                            .env(env)
                                                                            .call(
                                                                                    s.getObject(),
                                                                                    0,
                                                                                    4)
                                                                            .value())
                                                            .value()))
                                    ? s.arrayGet(env, 1)
                                    : 0);
            if (ZVal.isLessThanOrEqualTo(240, "<=", code)) {
                return ZVal.assign(
                        ZVal.subtract(
                                ZVal.add(
                                        ZVal.add(
                                                ZVal.add(
                                                        ZVal.toLong(ZVal.subtract(code, 240))
                                                                << ZVal.toLong(18),
                                                        ZVal.toLong(
                                                                        ZVal.subtract(
                                                                                s.arrayGet(env, 2),
                                                                                128))
                                                                << ZVal.toLong(12)),
                                                ZVal.toLong(ZVal.subtract(s.arrayGet(env, 3), 128))
                                                        << ZVal.toLong(6)),
                                        s.arrayGet(env, 4)),
                                128));
            }

            if (ZVal.isLessThanOrEqualTo(224, "<=", code)) {
                return ZVal.assign(
                        ZVal.subtract(
                                ZVal.add(
                                        ZVal.add(
                                                ZVal.toLong(ZVal.subtract(code, 224))
                                                        << ZVal.toLong(12),
                                                ZVal.toLong(ZVal.subtract(s.arrayGet(env, 2), 128))
                                                        << ZVal.toLong(6)),
                                        s.arrayGet(env, 3)),
                                128));
            }

            if (ZVal.isLessThanOrEqualTo(192, "<=", code)) {
                return ZVal.assign(
                        ZVal.subtract(
                                ZVal.add(
                                        ZVal.toLong(ZVal.subtract(code, 192)) << ZVal.toLong(6),
                                        s.arrayGet(env, 2)),
                                128));
            }

            return ZVal.assign(code);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "pos")
        @ConvertedParameter(index = 1, name = "part")
        @ConvertedParameter(index = 2, name = "haystack")
        @ConvertedParameter(index = 3, name = "encoding")
        private Object getSubpart(RuntimeEnv env, Object... args) {
            Object pos = assignParameter(args, 0, false);
            Object part = assignParameter(args, 1, false);
            Object haystack = assignParameter(args, 2, false);
            Object encoding = assignParameter(args, 3, false);
            if (ZVal.strictEqualityCheck(false, "===", pos)) {
                return ZVal.assign(false);
            }

            if (ZVal.isTrue(part)) {
                return ZVal.assign(runtimeStaticObject.mb_substr(env, haystack, 0, pos, encoding));
            }

            return ZVal.assign(
                    runtimeStaticObject.mb_substr(env, haystack, pos, ZVal.getNull(), encoding));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "m", typeHint = "array")
        private Object html_encoding_callback(RuntimeEnv env, Object... args) {
            int runtimeConverterContinueCount;
            ReferenceContainer m = new BasicReferenceContainer(assignParameter(args, 0, false));
            Object c = null;
            Object entities = null;
            ReferenceContainer i = new BasicReferenceContainer(null);
            i.setObject(1);
            entities = "";
            m.setObject(
                    NamespaceGlobal.unpack
                            .env(env)
                            .call(
                                    "C*",
                                    NamespaceGlobal.htmlentities
                                            .env(env)
                                            .call(m.arrayGet(env, 0), 2, "UTF-8")
                                            .value())
                            .value());
            runtimeConverterContinueCount = 0;
            while (arrayActionR(ArrayAction.ISSET, m, env, i.getObject())) {
                if (ZVal.isGreaterThan(128, '>', m.arrayGet(env, i.getObject()))) {
                    entities =
                            toStringR(entities, env)
                                    + toStringR(
                                            NamespaceGlobal.chr
                                                    .env(env)
                                                    .call(m.arrayGet(env, ZVal.postIncrement(i)))
                                                    .value(),
                                            env);
                    continue;
                }

                if (ZVal.isLessThanOrEqualTo(240, "<=", m.arrayGet(env, i.getObject()))) {
                    c =
                            ZVal.subtract(
                                    ZVal.add(
                                            ZVal.add(
                                                    ZVal.add(
                                                            ZVal.toLong(
                                                                            ZVal.subtract(
                                                                                    m.arrayGet(
                                                                                            env,
                                                                                            ZVal
                                                                                                    .postIncrement(
                                                                                                            i)),
                                                                                    240))
                                                                    << ZVal.toLong(18),
                                                            ZVal.toLong(
                                                                            ZVal.subtract(
                                                                                    m.arrayGet(
                                                                                            env,
                                                                                            ZVal
                                                                                                    .postIncrement(
                                                                                                            i)),
                                                                                    128))
                                                                    << ZVal.toLong(12)),
                                                    ZVal.toLong(
                                                                    ZVal.subtract(
                                                                            m.arrayGet(
                                                                                    env,
                                                                                    ZVal
                                                                                            .postIncrement(
                                                                                                    i)),
                                                                            128))
                                                            << ZVal.toLong(6)),
                                            m.arrayGet(env, ZVal.postIncrement(i))),
                                    128);

                } else if (ZVal.isLessThanOrEqualTo(224, "<=", m.arrayGet(env, i.getObject()))) {
                    c =
                            ZVal.subtract(
                                    ZVal.add(
                                            ZVal.add(
                                                    ZVal.toLong(
                                                                    ZVal.subtract(
                                                                            m.arrayGet(
                                                                                    env,
                                                                                    ZVal
                                                                                            .postIncrement(
                                                                                                    i)),
                                                                            224))
                                                            << ZVal.toLong(12),
                                                    ZVal.toLong(
                                                                    ZVal.subtract(
                                                                            m.arrayGet(
                                                                                    env,
                                                                                    ZVal
                                                                                            .postIncrement(
                                                                                                    i)),
                                                                            128))
                                                            << ZVal.toLong(6)),
                                            m.arrayGet(env, ZVal.postIncrement(i))),
                                    128);

                } else {
                    c =
                            ZVal.subtract(
                                    ZVal.add(
                                            ZVal.toLong(
                                                            ZVal.subtract(
                                                                    m.arrayGet(
                                                                            env,
                                                                            ZVal.postIncrement(i)),
                                                                    192))
                                                    << ZVal.toLong(6),
                                            m.arrayGet(env, ZVal.postIncrement(i))),
                                    128);
                }

                entities = toStringR(entities, env) + "&#" + toStringR(c, env) + ";";
            }

            return ZVal.assign(entities);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "s", typeHint = "array")
        private Object title_case_lower(RuntimeEnv env, Object... args) {
            ReferenceContainer s = new BasicReferenceContainer(assignParameter(args, 0, false));
            return ZVal.assign(
                    runtimeStaticObject.mb_convert_case(env, s.arrayGet(env, 0), 1, "UTF-8"));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "s", typeHint = "array")
        private Object title_case_upper(RuntimeEnv env, Object... args) {
            ReferenceContainer s = new BasicReferenceContainer(assignParameter(args, 0, false));
            return ZVal.assign(
                    runtimeStaticObject.mb_convert_case(env, s.arrayGet(env, 0), 0, "UTF-8"));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "file")
        private Object getData(RuntimeEnv env, Object... args) {
            RuntimeStack stack = new RuntimeStack();
            stack.setupGlobals(env);
            Scope69 scope = new Scope69();
            stack.pushScope(scope);
            scope._thisVarAlias = this;
            try {
                ContextConstants runtimeConverterFunctionClassConstants =
                        new ContextConstants()
                                .setDir("/vendor/symfony/polyfill-mbstring")
                                .setFile("/vendor/symfony/polyfill-mbstring/Mbstring.php");
                scope.file = assignParameter(args, 0, false);
                if (function_file_exists
                        .f
                        .env(env)
                        .call(
                                scope.file =
                                        toStringR(
                                                        env.addRootFilesystemPrefix(
                                                                "/vendor/symfony/polyfill-mbstring"),
                                                        env)
                                                + "/Resources/unidata/"
                                                + toStringR(scope.file, env)
                                                + ".php")
                        .getBool()) {
                    throw new IncludeEventException(
                            ZVal.assign(
                                    env.include(
                                            toStringR(scope.file, env),
                                            stack,
                                            runtimeConverterFunctionClassConstants,
                                            true,
                                            false)));
                }

                throw new IncludeEventException(ZVal.assign(false));
            } catch (IncludeEventException runtimeConverterIncludeException) {
                return runtimeConverterIncludeException.returnValue;
            }
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "encoding")
        private Object getEncoding(RuntimeEnv env, Object... args) {
            Object encoding = assignParameter(args, 0, false);
            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", encoding)) {
                return ZVal.assign(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Polyfill
                                                .namespaces
                                                .Mbstring
                                                .classes
                                                .Mbstring
                                                .RequestStaticProperties
                                                .class)
                                .internalEncoding);
            }

            encoding = NamespaceGlobal.strtoupper.env(env).call(encoding).value();
            if (ZVal.toBool(ZVal.strictEqualityCheck("8BIT", "===", encoding))
                    || ZVal.toBool(ZVal.strictEqualityCheck("BINARY", "===", encoding))) {
                return "CP850";
            }

            if (ZVal.strictEqualityCheck("UTF8", "===", encoding)) {
                return "UTF-8";
            }

            return ZVal.assign(encoding);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object encodingList = ZVal.arrayFromList("ASCII", "UTF-8");

        public Object language = "neutral";

        public Object internalEncoding = "UTF-8";

        public Object caseFold =
                ZVal.newArray(
                        new ZPair(
                                0,
                                ZVal.arrayFromList(
                                        "\u00B5", "\u017F", "\u0345", "\u03C2", "\u03D0", "\u03D1",
                                        "\u03D5", "\u03D6", "\u03F0", "\u03F1", "\u03F5", "\u1E9B",
                                        "\u1FBE")),
                        new ZPair(
                                1,
                                ZVal.arrayFromList(
                                        "\u03BC", "s", "\u03B9", "\u03C3", "\u03B2", "\u03B8",
                                        "\u03C6", "\u03C0", "\u03BA", "\u03C1", "\u03B5", "\u1E61",
                                        "\u03B9")));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Polyfill\\Mbstring\\Mbstring")
                    .setLookup(
                            Mbstring.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames(
                            "caseFold", "encodingList", "internalEncoding", "language")
                    .setFilename("vendor/symfony/polyfill-mbstring/Mbstring.php")
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

    private static class Scope69 implements UpdateRuntimeScopeInterface {

        Object file;
        Object _thisVarAlias;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("file", this.file);
            stack.setVariable("this", this._thisVarAlias);
        }

        public void updateScope(RuntimeStack stack) {

            this.file = stack.getVariable("file");
            this._thisVarAlias = stack.getVariable("this");
        }
    }

    private enum SwitchEnumType129 {
        STRING_ASCII,
        STRING_UTF8,
        STRING_UTF_8,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType130 {
        STRING_ASCII,
        STRING_UTF8,
        STRING_UTF_8,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
