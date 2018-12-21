package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.otherProxyClasses.Locale;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.ConstStub;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeImmutable;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.Caster;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_extension_loaded;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Caster/DateCaster.php

*/

public class DateCaster extends RuntimeClassBase {

    public DateCaster(RuntimeEnv env, Object... args) {
        super(env);
    }

    public DateCaster(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_PERIOD_LIMIT = 3;

    public static final Object CONST_class = "Symfony\\Component\\VarDumper\\Caster\\DateCaster";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "d", typeHint = "DateTimeInterface")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        @ConvertedParameter(index = 4, name = "filter")
        public Object castDateTime(RuntimeEnv env, Object... args) {
            Object d = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object filter = assignParameter(args, 4, false);
            Object prefix = null;
            Object location = null;
            Object title = null;
            Object fromNow = null;
            prefix = ZVal.assign(Caster.CONST_PREFIX_VIRTUAL);
            location =
                    env.callMethod(
                            env.callMethod(d, "getTimezone", DateCaster.class),
                            "getLocation",
                            DateCaster.class);
            fromNow = env.callMethod(new DateTime(env), "diff", DateCaster.class, d);
            title =
                    toStringR(env.callMethod(d, "format", DateCaster.class, "l, F j, Y"), env)
                            + "\n"
                            + toStringR(runtimeStaticObject.formatInterval(env, fromNow), env)
                            + " from now"
                            + toStringR(
                                    ZVal.isTrue(location)
                                            ? ZVal.isTrue(
                                                            env.callMethod(
                                                                    d,
                                                                    "format",
                                                                    DateCaster.class,
                                                                    "I"))
                                                    ? "\nDST On"
                                                    : "\nDST Off"
                                            : "",
                                    env);
            a.setObject(ZVal.newArray());
            a.arrayAccess(env, toStringR(prefix, env) + "date")
                    .set(
                            new ConstStub(
                                    env,
                                    runtimeStaticObject.formatDateTime(
                                            env, d, ZVal.isTrue(location) ? " e (P)" : " P"),
                                    title));
            toObjectR(stub)
                    .accessProp(this, env)
                    .name("class")
                    .set(
                            toStringR(
                                            toObjectR(stub)
                                                    .accessProp(this, env)
                                                    .name("class")
                                                    .value(),
                                            env)
                                    + toStringR(
                                            env.callMethod(d, "format", DateCaster.class, " @U"),
                                            env));
            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "interval", typeHint = "DateInterval")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        @ConvertedParameter(index = 4, name = "filter")
        public Object castInterval(RuntimeEnv env, Object... args) {
            ReferenceContainer interval =
                    new BasicReferenceContainer(assignParameter(args, 0, false));
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object filter = assignParameter(args, 4, false);
            Object numberOfSeconds = null;
            Object now = null;
            Object i = null;
            Object title = null;
            now = new DateTimeImmutable(env);
            numberOfSeconds =
                    ZVal.subtract(
                            env.callMethod(
                                    env.callMethod(
                                            now,
                                            new RuntimeArgsWithReferences().add(0, interval),
                                            "add",
                                            DateCaster.class,
                                            interval.getObject()),
                                    "getTimestamp",
                                    DateCaster.class),
                            env.callMethod(now, "getTimestamp", DateCaster.class));
            title =
                    toStringR(
                                    NamespaceGlobal.number_format
                                            .env(env)
                                            .call(numberOfSeconds, 0, ".", " ")
                                            .value(),
                                    env)
                            + "s";
            i =
                    ZVal.newArray(
                            new ZPair(
                                    toStringR(Caster.CONST_PREFIX_VIRTUAL, env) + "interval",
                                    new ConstStub(
                                            env,
                                            runtimeStaticObject.formatInterval(
                                                    env, interval.getObject()),
                                            title)));
            return ZVal.assign(
                    ZVal.isTrue(ZVal.toLong(filter) & ZVal.toLong(Caster.CONST_EXCLUDE_VERBOSE))
                            ? i
                            : ZVal.add(i, a));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "i", typeHint = "DateInterval")
        private Object formatInterval(RuntimeEnv env, Object... args) {
            Object i = assignParameter(args, 0, false);
            Object d = null;
            Object format = null;
            format = "%R ";
            if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    0,
                                                    "===",
                                                    toObjectR(i)
                                                            .accessProp(this, env)
                                                            .name("y")
                                                            .value()))
                                    && ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    0,
                                                    "===",
                                                    toObjectR(i)
                                                            .accessProp(this, env)
                                                            .name("m")
                                                            .value())))
                    && ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.toBool(
                                                            ZVal.isGreaterThanOrEqualTo(
                                                                    toObjectR(i)
                                                                            .accessProp(this, env)
                                                                            .name("h")
                                                                            .value(),
                                                                    ">=",
                                                                    24))
                                                    || ZVal.toBool(
                                                            ZVal.isGreaterThanOrEqualTo(
                                                                    toObjectR(i)
                                                                            .accessProp(this, env)
                                                                            .name("i")
                                                                            .value(),
                                                                    ">=",
                                                                    60)))
                                    || ZVal.toBool(
                                            ZVal.isGreaterThanOrEqualTo(
                                                    toObjectR(i)
                                                            .accessProp(this, env)
                                                            .name("s")
                                                            .value(),
                                                    ">=",
                                                    60)))) {
                i =
                        NamespaceGlobal.date_diff
                                .env(env)
                                .call(
                                        d = new DateTime(env),
                                        NamespaceGlobal.date_add
                                                .env(env)
                                                .call(((RuntimeClassInterface) d).phpClone(env), i)
                                                .value())
                                .value();
                format =
                        toStringR(format, env)
                                + toStringR(
                                        ZVal.isLessThan(
                                                        0,
                                                        '<',
                                                        toObjectR(i)
                                                                .accessProp(this, env)
                                                                .name("days")
                                                                .value())
                                                ? "%ad "
                                                : "",
                                        env);

            } else {
                format =
                        toStringR(format, env)
                                + toStringR(
                                        toObjectR(i).accessProp(this, env).name("y").getBool()
                                                ? "%yy "
                                                : "",
                                        env)
                                + toStringR(
                                        toObjectR(i).accessProp(this, env).name("m").getBool()
                                                ? "%mm "
                                                : "",
                                        env)
                                + toStringR(
                                        toObjectR(i).accessProp(this, env).name("d").getBool()
                                                ? "%dd "
                                                : "",
                                        env);
            }

            format =
                    toStringR(format, env)
                            + toStringR(
                                    ZVal.toBool(
                                                            ZVal.toBool(
                                                                            ZVal.toBool(
                                                                                            toObjectR(
                                                                                                            i)
                                                                                                    .accessProp(
                                                                                                            this,
                                                                                                            env)
                                                                                                    .name(
                                                                                                            "h")
                                                                                                    .value())
                                                                                    || ZVal.toBool(
                                                                                            toObjectR(
                                                                                                            i)
                                                                                                    .accessProp(
                                                                                                            this,
                                                                                                            env)
                                                                                                    .name(
                                                                                                            "i")
                                                                                                    .value()))
                                                                    || ZVal.toBool(
                                                                            toObjectR(i)
                                                                                    .accessProp(
                                                                                            this,
                                                                                            env)
                                                                                    .name("s")
                                                                                    .value()))
                                                    || ZVal.toBool(
                                                            toObjectR(i)
                                                                    .accessProp(this, env)
                                                                    .name("f")
                                                                    .value())
                                            ? "%H:%I:"
                                                    + toStringR(
                                                            runtimeStaticObject.formatSeconds(
                                                                    env,
                                                                    toObjectR(i)
                                                                            .accessProp(this, env)
                                                                            .name("s")
                                                                            .value(),
                                                                    function_substr
                                                                            .f
                                                                            .env(env)
                                                                            .call(
                                                                                    toObjectR(i)
                                                                                            .accessProp(
                                                                                                    this,
                                                                                                    env)
                                                                                            .name(
                                                                                                    "f")
                                                                                            .value(),
                                                                                    2)
                                                                            .value()),
                                                            env)
                                            : "",
                                    env);
            format = ZVal.assign(ZVal.strictEqualityCheck("%R ", "===", format) ? "0s" : format);
            return ZVal.assign(
                    env.callMethod(
                            i,
                            "format",
                            DateCaster.class,
                            function_rtrim.f.env(env).call(format).value()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "timeZone", typeHint = "DateTimeZone")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        @ConvertedParameter(index = 4, name = "filter")
        public Object castTimeZone(RuntimeEnv env, Object... args) {
            Object timeZone = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object filter = assignParameter(args, 4, false);
            Object formatted = null;
            ReferenceContainer location = new BasicReferenceContainer(null);
            Object z = null;
            Object title = null;
            location.setObject(env.callMethod(timeZone, "getLocation", DateCaster.class));
            formatted =
                    env.callMethod(
                            new DateTime(env, "now", timeZone),
                            "format",
                            DateCaster.class,
                            ZVal.isTrue(location.getObject()) ? "e (P)" : "P");
            title =
                    ZVal.assign(
                            ZVal.toBool(location.getObject())
                                            && ZVal.toBool(
                                                    function_extension_loaded
                                                            .f
                                                            .env(env)
                                                            .call("intl")
                                                            .value())
                                    ? Locale.runtimeStaticObject.getDisplayRegion(
                                            env,
                                            "-"
                                                    + toStringR(
                                                            location.arrayGet(env, "country_code"),
                                                            env))
                                    : "");
            z =
                    ZVal.newArray(
                            new ZPair(
                                    toStringR(Caster.CONST_PREFIX_VIRTUAL, env) + "timezone",
                                    new ConstStub(env, formatted, title)));
            return ZVal.assign(
                    ZVal.isTrue(ZVal.toLong(filter) & ZVal.toLong(Caster.CONST_EXCLUDE_VERBOSE))
                            ? z
                            : ZVal.add(z, a));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "p", typeHint = "DatePeriod")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        @ConvertedParameter(index = 4, name = "filter")
        public Object castPeriod(RuntimeEnv env, Object... args) {
            int runtimeConverterBreakCount;
            PassByReferenceArgs rLastRefArgs;
            Object p = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object filter = assignParameter(args, 4, false);
            Object period = null;
            Object d = null;
            Object now = null;
            Object i = null;
            ReferenceContainer dates = new BasicReferenceContainer(null);
            Object end = null;
            dates.setObject(ZVal.newArray());
            if (ZVal.isGreaterThanOrEqualTo(70211, ">=", 70107)) {
                runtimeConverterBreakCount = 0;
                for (ZPair zpairResult2181 :
                        ZVal.getIterable(((RuntimeClassInterface) p).phpClone(env), env, false)) {
                    i = ZVal.assign(zpairResult2181.getKey());
                    d = ZVal.assign(zpairResult2181.getValue());
                    if (ZVal.strictEqualityCheck(CONST_PERIOD_LIMIT, "===", i)) {
                        now = new DateTimeImmutable(env);
                        dates.arrayAppend(env)
                                .set(
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "%s more",
                                                        ZVal.isTrue(
                                                                        end =
                                                                                env.callMethod(
                                                                                        p,
                                                                                        "getEndDate",
                                                                                        DateCaster
                                                                                                .class))
                                                                ? NamespaceGlobal.ceil
                                                                        .env(env)
                                                                        .call(
                                                                                ZVal.divide(
                                                                                        ZVal
                                                                                                .subtract(
                                                                                                        env
                                                                                                                .callMethod(
                                                                                                                        end,
                                                                                                                        "format",
                                                                                                                        DateCaster
                                                                                                                                .class,
                                                                                                                        "U.u"),
                                                                                                        env
                                                                                                                .callMethod(
                                                                                                                        d,
                                                                                                                        "format",
                                                                                                                        DateCaster
                                                                                                                                .class,
                                                                                                                        "U.u")),
                                                                                        ZVal
                                                                                                .subtract(
                                                                                                        env
                                                                                                                .callMethod(
                                                                                                                        env
                                                                                                                                .callMethod(
                                                                                                                                        now,
                                                                                                                                        rLastRefArgs =
                                                                                                                                                new RuntimeArgsWithReferences()
                                                                                                                                                        .add(
                                                                                                                                                                0,
                                                                                                                                                                handleReturnReference(
                                                                                                                                                                        env
                                                                                                                                                                                .callMethod(
                                                                                                                                                                                        p,
                                                                                                                                                                                        "getDateInterval",
                                                                                                                                                                                        DateCaster
                                                                                                                                                                                                .class))),
                                                                                                                                        "add",
                                                                                                                                        DateCaster
                                                                                                                                                .class,
                                                                                                                                        rLastRefArgs
                                                                                                                                                .get(
                                                                                                                                                        0)),
                                                                                                                        "format",
                                                                                                                        DateCaster
                                                                                                                                .class,
                                                                                                                        "U.u"),
                                                                                                        env
                                                                                                                .callMethod(
                                                                                                                        now,
                                                                                                                        "format",
                                                                                                                        DateCaster
                                                                                                                                .class,
                                                                                                                        "U.u"))))
                                                                        .value()
                                                                : ZVal.subtract(
                                                                        toObjectR(p)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("recurrences")
                                                                                .value(),
                                                                        i))
                                                .value());
                        break;
                    }

                    dates.arrayAppend(env)
                            .set(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "%s) %s",
                                                    ZVal.add(i, 1),
                                                    runtimeStaticObject.formatDateTime(env, d))
                                            .value());
                }
            }

            period =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "every %s, from %s (%s) %s",
                                    runtimeStaticObject.formatInterval(
                                            env,
                                            env.callMethod(p, "getDateInterval", DateCaster.class)),
                                    runtimeStaticObject.formatDateTime(
                                            env,
                                            env.callMethod(p, "getStartDate", DateCaster.class)),
                                    toObjectR(p)
                                                    .accessProp(this, env)
                                                    .name("include_start_date")
                                                    .getBool()
                                            ? "included"
                                            : "excluded",
                                    ZVal.isTrue(
                                                    end =
                                                            env.callMethod(
                                                                    p,
                                                                    "getEndDate",
                                                                    DateCaster.class))
                                            ? "to "
                                                    + toStringR(
                                                            runtimeStaticObject.formatDateTime(
                                                                    env, end),
                                                            env)
                                            : "recurring "
                                                    + toStringR(
                                                            toObjectR(p)
                                                                    .accessProp(this, env)
                                                                    .name("recurrences")
                                                                    .value(),
                                                            env)
                                                    + " time/s")
                            .value();
            p =
                    ZVal.newArray(
                            new ZPair(
                                    toStringR(Caster.CONST_PREFIX_VIRTUAL, env) + "period",
                                    new ConstStub(
                                            env,
                                            period,
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call("\n", dates.getObject())
                                                    .value())));
            return ZVal.assign(
                    ZVal.isTrue(ZVal.toLong(filter) & ZVal.toLong(Caster.CONST_EXCLUDE_VERBOSE))
                            ? p
                            : ZVal.add(p, a));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "d", typeHint = "DateTimeInterface")
        @ConvertedParameter(index = 1, name = "extra")
        private Object formatDateTime(RuntimeEnv env, Object... args) {
            Object d = assignParameter(args, 0, false);
            Object extra = assignParameter(args, 1, true);
            if (null == extra) {
                extra = "";
            }
            return ZVal.assign(
                    env.callMethod(
                            d,
                            "format",
                            DateCaster.class,
                            "Y-m-d H:i:"
                                    + toStringR(
                                            runtimeStaticObject.formatSeconds(
                                                    env,
                                                    env.callMethod(
                                                            d, "format", DateCaster.class, "s"),
                                                    env.callMethod(
                                                            d, "format", DateCaster.class, "u")),
                                            env)
                                    + toStringR(extra, env)));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "s")
        @ConvertedParameter(index = 1, name = "us")
        private Object formatSeconds(RuntimeEnv env, Object... args) {
            Object s = assignParameter(args, 0, false);
            Object us = assignParameter(args, 1, false);
            Object len = null;
            Object t = null;
            return ZVal.assign(
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "%02d.%s",
                                    s,
                                    ZVal.strictEqualityCheck(
                                                    0,
                                                    "===",
                                                    len =
                                                            function_strlen
                                                                    .f
                                                                    .env(env)
                                                                    .call(
                                                                            t =
                                                                                    function_rtrim
                                                                                            .f
                                                                                            .env(
                                                                                                    env)
                                                                                            .call(
                                                                                                    us,
                                                                                                    "0")
                                                                                            .value())
                                                                    .value())
                                            ? "0"
                                            : ZVal.isLessThanOrEqualTo(len, "<=", 3)
                                                    ? NamespaceGlobal.str_pad
                                                            .env(env)
                                                            .call(t, 3, "0")
                                                            .value()
                                                    : us)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\VarDumper\\Caster\\DateCaster")
                    .setLookup(
                            DateCaster.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/var-dumper/Caster/DateCaster.php")
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
