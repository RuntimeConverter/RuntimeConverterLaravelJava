package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Polyfill.namespaces.Php72.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_get_clean;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_start;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/polyfill-php72/Php72.php

*/

public final class Php72 extends RuntimeClassBase {

    public Php72(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Php72(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Symfony\\Polyfill\\Php72\\Php72";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "s")
        public Object utf8_encode(RuntimeEnv env, Object... args) {
            int runtimeConverterBreakCount;
            ReferenceContainer s = new BasicReferenceContainer(assignParameter(args, 0, false));
            Object len = null;
            ReferenceContainer i = new BasicReferenceContainer(null);
            ReferenceContainer j = new BasicReferenceContainer(null);
            s.setObject(toStringR(s.getObject(), env) + toStringR(s.getObject(), env));
            len = function_strlen.f.env(env).call(s.getObject()).value();
            runtimeConverterBreakCount = 0;
            for (i.setObject(ZVal.toLong(len) >> ZVal.toLong(1)), j.setObject(0);
                    ZVal.isLessThan(i.getObject(), '<', len);
                    i.setObject(ZVal.increment(i.getObject())),
                            j.setObject(ZVal.increment(j.getObject()))) {
                SwitchEnumType131 switchVariable131 =
                        ZVal.getEnum(
                                true,
                                SwitchEnumType131.DEFAULT_CASE,
                                SwitchEnumType131.DYNAMIC_TYPE_391,
                                ZVal.isLessThan(
                                        s.arrayGet(env, i.getObject()),
                                        '<',
                                        ZVal.base64Decode("gA==")),
                                SwitchEnumType131.DYNAMIC_TYPE_392,
                                ZVal.isLessThan(
                                        s.arrayGet(env, i.getObject()),
                                        '<',
                                        ZVal.base64Decode("wA==")));
                switch (switchVariable131) {
                    case DYNAMIC_TYPE_391:
                        s.arrayAccess(env, j.getObject()).set(s.arrayGet(env, i.getObject()));
                        break;
                    case DYNAMIC_TYPE_392:
                        s.arrayAccess(env, j.getObject()).set(ZVal.base64Decode("wg=="));
                        s.arrayAccess(env, ZVal.preIncrement(j))
                                .set(s.arrayGet(env, i.getObject()));
                        break;
                    case DEFAULT_CASE:
                        s.arrayAccess(env, j.getObject()).set(ZVal.base64Decode("ww=="));
                        s.arrayAccess(env, ZVal.preIncrement(j))
                                .set(
                                        NamespaceGlobal.chr
                                                .env(env)
                                                .call(
                                                        ZVal.subtract(
                                                                NamespaceGlobal.ord
                                                                        .env(env)
                                                                        .call(
                                                                                s.arrayGet(
                                                                                        env,
                                                                                        i
                                                                                                .getObject()))
                                                                        .value(),
                                                                64))
                                                .value());
                        break;
                }
                ;
            }

            return ZVal.assign(
                    function_substr.f.env(env).call(s.getObject(), 0, j.getObject()).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "s")
        public Object utf8_decode(RuntimeEnv env, Object... args) {
            int runtimeConverterBreakCount;
            ReferenceContainer s = new BasicReferenceContainer(assignParameter(args, 0, false));
            Object c = null;
            Object len = null;
            ReferenceContainer i = new BasicReferenceContainer(null);
            ReferenceContainer j = new BasicReferenceContainer(null);
            s.setObject(ZVal.assign(toStringR(s.getObject(), env)));
            len = function_strlen.f.env(env).call(s.getObject()).value();
            runtimeConverterBreakCount = 0;
            for (i.setObject(0), j.setObject(0);
                    ZVal.isLessThan(i.getObject(), '<', len);
                    i.setObject(ZVal.increment(i.getObject())),
                            j.setObject(ZVal.increment(j.getObject()))) {
                SwitchEnumType132 switchVariable132 =
                        ZVal.getEnum(
                                ZVal.toLong(s.arrayGet(env, i.getObject()))
                                        & ZVal.toLong(ZVal.base64Decode("8A==")),
                                SwitchEnumType132.DEFAULT_CASE,
                                SwitchEnumType132.DYNAMIC_TYPE_393,
                                ZVal.base64Decode("wA=="),
                                SwitchEnumType132.DYNAMIC_TYPE_394,
                                ZVal.base64Decode("0A=="),
                                SwitchEnumType132.DYNAMIC_TYPE_395,
                                ZVal.base64Decode("8A=="),
                                SwitchEnumType132.DYNAMIC_TYPE_396,
                                ZVal.base64Decode("4A=="));
                switch (switchVariable132) {
                    case DYNAMIC_TYPE_393:
                    case DYNAMIC_TYPE_394:
                        c =
                                ZVal.toLong(
                                                ZVal.toLong(
                                                                NamespaceGlobal.ord
                                                                        .env(env)
                                                                        .call(
                                                                                ZVal.toLong(
                                                                                                s
                                                                                                        .arrayGet(
                                                                                                                env,
                                                                                                                i
                                                                                                                        .getObject()))
                                                                                        & ZVal
                                                                                                .toLong(
                                                                                                        "\u001F"))
                                                                        .value())
                                                        << ZVal.toLong(6))
                                        | ZVal.toLong(
                                                NamespaceGlobal.ord
                                                        .env(env)
                                                        .call(
                                                                ZVal.toLong(
                                                                                s.arrayGet(
                                                                                        env,
                                                                                        ZVal
                                                                                                .preIncrement(
                                                                                                        i)))
                                                                        & ZVal.toLong("?"))
                                                        .value());
                        s.arrayAccess(env, j.getObject())
                                .set(
                                        ZVal.isLessThan(c, '<', 256)
                                                ? NamespaceGlobal.chr.env(env).call(c).value()
                                                : "?");
                        break;
                    case DYNAMIC_TYPE_395:
                        i.setObject(ZVal.increment(i.getObject()));
                    case DYNAMIC_TYPE_396:
                        s.arrayAccess(env, j.getObject()).set("?");
                        i.setObject(ZAssignment.add("+=", i.getObject(), 2));
                        break;
                    case DEFAULT_CASE:
                        s.arrayAccess(env, j.getObject()).set(s.arrayGet(env, i.getObject()));
                }
                ;
            }

            return ZVal.assign(
                    function_substr.f.env(env).call(s.getObject(), 0, j.getObject()).value());
        }

        @ConvertedMethod
        public Object php_os_family(RuntimeEnv env, Object... args) {
            ReferenceContainer map = new BasicReferenceContainer(null);
            if (ZVal.strictEqualityCheck("\\", "===", "/")) {
                return "Windows";
            }

            map.setObject(
                    ZVal.newArray(
                            new ZPair("Darwin", "Darwin"),
                            new ZPair("DragonFly", "BSD"),
                            new ZPair("FreeBSD", "BSD"),
                            new ZPair("NetBSD", "BSD"),
                            new ZPair("OpenBSD", "BSD"),
                            new ZPair("Linux", "Linux"),
                            new ZPair("SunOS", "Solaris")));
            return ZVal.assign(
                    arrayActionR(ArrayAction.ISSET, map, env, "Linux")
                            ? map.arrayGet(env, "Linux")
                            : "Unknown");
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "object")
        public Object spl_object_id(RuntimeEnv env, Object... args) {
            Object _object = assignParameter(args, 0, false);
            Object hash = null;
            if (ZVal.strictEqualityCheck(
                    ZVal.getNull(),
                    "===",
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Polyfill
                                            .namespaces
                                            .Php72
                                            .classes
                                            .Php72
                                            .RequestStaticProperties
                                            .class)
                            .hashMask)) {
                runtimeStaticObject.initHashMask(env);
            }

            if (ZVal.strictEqualityCheck(
                    ZVal.getNull(),
                    "===",
                    hash = NamespaceGlobal.spl_object_hash.env(env).call(_object).value())) {
                return null;
            }

            return ZVal.assign(
                    ZVal.toLong(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Symfony
                                                            .namespaces
                                                            .Polyfill
                                                            .namespaces
                                                            .Php72
                                                            .classes
                                                            .Php72
                                                            .RequestStaticProperties
                                                            .class)
                                            .hashMask)
                            ^ ZVal.toLong(
                                    NamespaceGlobal.hexdec
                                            .env(env)
                                            .call(
                                                    function_substr
                                                            .f
                                                            .env(env)
                                                            .call(hash, ZVal.subtract(16, 8), 8)
                                                            .value())
                                            .value()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "stream")
        @ConvertedParameter(
            index = 1,
            name = "enable",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object sapi_windows_vt100_support(RuntimeEnv env, Object... args) {
            Object stream = assignParameter(args, 0, false);
            Object enable = assignParameter(args, 1, true);
            if (null == enable) {
                enable = ZVal.getNull();
            }
            Object stdin = null;
            ReferenceContainer meta = new BasicReferenceContainer(null);
            if (!function_is_resource.f.env(env).call(stream).getBool()) {
                NamespaceGlobal.trigger_error
                        .env(env)
                        .call(
                                "sapi_windows_vt100_support() expects parameter 1 to be resource, "
                                        + toStringR(
                                                NamespaceGlobal.gettype
                                                        .env(env)
                                                        .call(stream)
                                                        .value(),
                                                env)
                                        + " given",
                                512);
                return ZVal.assign(false);
            }

            meta.setObject(NamespaceGlobal.stream_get_meta_data.env(env).call(stream).value());
            if (ZVal.strictNotEqualityCheck("STDIO", "!==", meta.arrayGet(env, "stream_type"))) {
                NamespaceGlobal.trigger_error
                        .env(env)
                        .call(
                                "sapi_windows_vt100_support() was not able to analyze the specified stream",
                                512);
                return ZVal.assign(false);
            }

            if (ZVal.toBool(ZVal.strictEqualityCheck(false, "===", enable))
                    || ZVal.toBool(!ZVal.isTrue(runtimeStaticObject.stream_isatty(env, stream)))) {
                return ZVal.assign(false);
            }

            meta.setObject(
                    function_array_map.f.env(env).call("strtolower", meta.getObject()).value());
            stdin =
                    ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            "php://stdin", "===", meta.arrayGet(env, "uri")))
                            || ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            "php://fd/0", "===", meta.arrayGet(env, "uri")));
            return ZVal.assign(
                    ZVal.toBool(!ZVal.isTrue(stdin))
                            && ZVal.toBool(
                                    ZVal.toBool(
                                                    ZVal.toBool(
                                                                    ZVal.strictNotEqualityCheck(
                                                                            false,
                                                                            "!==",
                                                                            NamespaceGlobal.getenv
                                                                                    .env(env)
                                                                                    .call("ANSICON")
                                                                                    .value()))
                                                            || ZVal.toBool(
                                                                    ZVal.strictEqualityCheck(
                                                                            "ON",
                                                                            "===",
                                                                            NamespaceGlobal.getenv
                                                                                    .env(env)
                                                                                    .call(
                                                                                            "ConEmuANSI")
                                                                                    .value())))
                                            || ZVal.toBool(
                                                    ZVal.strictEqualityCheck(
                                                            "xterm",
                                                            "===",
                                                            NamespaceGlobal.getenv
                                                                    .env(env)
                                                                    .call("TERM")
                                                                    .value()))));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "stream")
        public Object stream_isatty(RuntimeEnv env, Object... args) {
            Object stream = assignParameter(args, 0, false);
            ReferenceContainer stat = new BasicReferenceContainer(null);
            if (!function_is_resource.f.env(env).call(stream).getBool()) {
                NamespaceGlobal.trigger_error
                        .env(env)
                        .call(
                                "stream_isatty() expects parameter 1 to be resource, "
                                        + toStringR(
                                                NamespaceGlobal.gettype
                                                        .env(env)
                                                        .call(stream)
                                                        .value(),
                                                env)
                                        + " given",
                                512);
                return ZVal.assign(false);
            }

            if (ZVal.strictEqualityCheck("\\", "===", "/")) {
                stat.setObject(NamespaceGlobal.fstat.env(env).call(stream).value());
                return ZVal.assign(
                        ZVal.isTrue(stat.getObject())
                                ? ZVal.strictEqualityCheck(
                                        8192,
                                        "===",
                                        ZVal.toLong(stat.arrayGet(env, "mode"))
                                                & ZVal.toLong(61440))
                                : false);
            }

            return ZVal.assign(
                    ZVal.toBool(function_function_exists.f.env(env).call("posix_isatty").value())
                            && ZVal.toBool(
                                    NamespaceGlobal.posix_isatty.env(env).call(stream).value()));
        }

        @ConvertedMethod
        private Object initHashMask(RuntimeEnv env, Object... args) {
            int runtimeConverterBreakCount;
            Object obFuncs = null;
            Object obj = null;
            ReferenceContainer frame = new BasicReferenceContainer(null);
            obj = ZVal.assign(toObjectR(ZVal.newArray()));
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Polyfill
                                            .namespaces
                                            .Php72
                                            .classes
                                            .Php72
                                            .RequestStaticProperties
                                            .class)
                            .hashMask =
                    -1;
            obFuncs =
                    ZVal.arrayFromList(
                            "ob_clean",
                            "ob_end_clean",
                            "ob_flush",
                            "ob_end_flush",
                            "ob_get_contents",
                            "ob_get_flush");
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult1990 :
                    ZVal.getIterable(
                            NamespaceGlobal.debug_backtrace
                                    .env(env)
                                    .call(
                                            ZVal.isGreaterThanOrEqualTo(70211, ">=", 50400)
                                                    ? 2
                                                    : false)
                                    .value(),
                            env,
                            true)) {
                frame.setObject(ZVal.assign(zpairResult1990.getValue()));
                if (ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                arrayActionR(
                                                                        ArrayAction.ISSET,
                                                                        frame,
                                                                        env,
                                                                        "function",
                                                                        0))
                                                        && ZVal.toBool(
                                                                !arrayActionR(
                                                                        ArrayAction.ISSET,
                                                                        frame,
                                                                        env,
                                                                        "class")))
                                        && ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        "o",
                                                        "===",
                                                        frame.arrayGet(env, "function", 0))))
                        && ZVal.toBool(
                                function_in_array
                                        .f
                                        .env(env)
                                        .call(frame.arrayGet(env, "function"), obFuncs)
                                        .value())) {
                    frame.arrayAccess(env, "line").set(0);
                    break;
                }
            }

            if (!arrayActionR(ArrayAction.EMPTY, frame, env, "line")) {
                function_ob_start.f.env(env).call();
                NamespaceGlobal.debug_zval_dump.env(env).call(obj);
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Polyfill
                                                .namespaces
                                                .Php72
                                                .classes
                                                .Php72
                                                .RequestStaticProperties
                                                .class)
                                .hashMask =
                        ZVal.toLong(
                                function_substr
                                        .f
                                        .env(env)
                                        .call(function_ob_get_clean.f.env(env).call().value(), 17)
                                        .value());
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
                                            .Php72
                                            .classes
                                            .Php72
                                            .RequestStaticProperties
                                            .class)
                            .hashMask =
                    ZAssignment.xor(
                            "^=",
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Symfony
                                                    .namespaces
                                                    .Polyfill
                                                    .namespaces
                                                    .Php72
                                                    .classes
                                                    .Php72
                                                    .RequestStaticProperties
                                                    .class)
                                    .hashMask,
                            NamespaceGlobal.hexdec
                                    .env(env)
                                    .call(
                                            function_substr
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            NamespaceGlobal.spl_object_hash
                                                                    .env(env)
                                                                    .call(obj)
                                                                    .value(),
                                                            ZVal.subtract(16, 8),
                                                            8)
                                                    .value())
                                    .value());
            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object hashMask = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Polyfill\\Php72\\Php72")
                    .setLookup(
                            Php72.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("hashMask")
                    .setFilename("vendor/symfony/polyfill-php72/Php72.php")
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

    private enum SwitchEnumType131 {
        DYNAMIC_TYPE_391,
        DYNAMIC_TYPE_392,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType132 {
        DYNAMIC_TYPE_393,
        DYNAMIC_TYPE_394,
        DYNAMIC_TYPE_395,
        DYNAMIC_TYPE_396,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
