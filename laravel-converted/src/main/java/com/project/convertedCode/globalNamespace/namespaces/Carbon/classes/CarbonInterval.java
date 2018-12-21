package com.project.convertedCode.globalNamespace.namespaces.Carbon.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match_all;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeClasses.date.DateInterval;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Carbon.classes.Translator;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ReadOnlyReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.math.function_round;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Carbon.classes.Carbon;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.math.function_floor;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nesbot/carbon/src/Carbon/CarbonInterval.php

*/

public class CarbonInterval extends DateInterval {

    public CarbonInterval(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CarbonInterval.class) {
            this.__construct(env, args);
        }
    }

    public CarbonInterval(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "years", defaultValue = "1", defaultValueType = "number")
    @ConvertedParameter(
        index = 1,
        name = "months",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "weeks",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "days",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "hours",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "minutes",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "seconds",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object years = assignParameter(args, 0, true);
        if (null == years) {
            years = 1;
        }
        Object months = assignParameter(args, 1, true);
        if (null == months) {
            months = ZVal.getNull();
        }
        Object weeks = assignParameter(args, 2, true);
        if (null == weeks) {
            weeks = ZVal.getNull();
        }
        Object days = assignParameter(args, 3, true);
        if (null == days) {
            days = ZVal.getNull();
        }
        Object hours = assignParameter(args, 4, true);
        if (null == hours) {
            hours = ZVal.getNull();
        }
        Object minutes = assignParameter(args, 5, true);
        if (null == minutes) {
            minutes = ZVal.getNull();
        }
        Object seconds = assignParameter(args, 6, true);
        if (null == seconds) {
            seconds = ZVal.getNull();
        }
        Object specDays = null;
        Object spec = null;
        spec = ZVal.assign(years);
        if (ZVal.toBool(
                        ZVal.toBool(!function_is_string.f.env(env).call(spec).getBool())
                                || ZVal.toBool(
                                        NamespaceGlobal.floatval.env(env).call(years).value()))
                || ZVal.toBool(function_preg_match.f.env(env).call("/^[0-9.]/", years).value())) {
            spec =
                    ZVal.assign(
                            ClassConstantUtils.getConstantValueLateStatic(
                                    env, this, "PERIOD_PREFIX"));
            spec =
                    toStringR(spec, env)
                            + toStringR(
                                    ZVal.isGreaterThan(years, '>', 0)
                                            ? toStringR(years, env)
                                                    + toStringR(
                                                            ClassConstantUtils
                                                                    .getConstantValueLateStatic(
                                                                            env,
                                                                            this,
                                                                            "PERIOD_YEARS"),
                                                            env)
                                            : "",
                                    env);
            spec =
                    toStringR(spec, env)
                            + toStringR(
                                    ZVal.isGreaterThan(months, '>', 0)
                                            ? toStringR(months, env)
                                                    + toStringR(
                                                            ClassConstantUtils
                                                                    .getConstantValueLateStatic(
                                                                            env,
                                                                            this,
                                                                            "PERIOD_MONTHS"),
                                                            env)
                                            : "",
                                    env);
            specDays = 0;
            specDays =
                    ZAssignment.add(
                            "+=",
                            specDays,
                            ZVal.isGreaterThan(weeks, '>', 0)
                                    ? ZVal.multiply(weeks, Carbon.CONST_DAYS_PER_WEEK)
                                    : 0);
            specDays = ZAssignment.add("+=", specDays, ZVal.isGreaterThan(days, '>', 0) ? days : 0);
            spec =
                    toStringR(spec, env)
                            + toStringR(
                                    ZVal.isGreaterThan(specDays, '>', 0)
                                            ? toStringR(specDays, env)
                                                    + toStringR(
                                                            ClassConstantUtils
                                                                    .getConstantValueLateStatic(
                                                                            env,
                                                                            this,
                                                                            "PERIOD_DAYS"),
                                                            env)
                                            : "",
                                    env);
            if (ZVal.toBool(
                            ZVal.toBool(ZVal.isGreaterThan(hours, '>', 0))
                                    || ZVal.toBool(ZVal.isGreaterThan(minutes, '>', 0)))
                    || ZVal.toBool(ZVal.isGreaterThan(seconds, '>', 0))) {
                spec =
                        toStringR(spec, env)
                                + toStringR(
                                        ClassConstantUtils.getConstantValueLateStatic(
                                                env, this, "PERIOD_TIME_PREFIX"),
                                        env);
                spec =
                        toStringR(spec, env)
                                + toStringR(
                                        ZVal.isGreaterThan(hours, '>', 0)
                                                ? toStringR(hours, env)
                                                        + toStringR(
                                                                ClassConstantUtils
                                                                        .getConstantValueLateStatic(
                                                                                env,
                                                                                this,
                                                                                "PERIOD_HOURS"),
                                                                env)
                                                : "",
                                        env);
                spec =
                        toStringR(spec, env)
                                + toStringR(
                                        ZVal.isGreaterThan(minutes, '>', 0)
                                                ? toStringR(minutes, env)
                                                        + toStringR(
                                                                ClassConstantUtils
                                                                        .getConstantValueLateStatic(
                                                                                env,
                                                                                this,
                                                                                "PERIOD_MINUTES"),
                                                                env)
                                                : "",
                                        env);
                spec =
                        toStringR(spec, env)
                                + toStringR(
                                        ZVal.isGreaterThan(seconds, '>', 0)
                                                ? toStringR(seconds, env)
                                                        + toStringR(
                                                                ClassConstantUtils
                                                                        .getConstantValueLateStatic(
                                                                                env,
                                                                                this,
                                                                                "PERIOD_SECONDS"),
                                                                env)
                                                : "",
                                        env);
            }

            if (ZVal.strictEqualityCheck(
                    spec,
                    "===",
                    ClassConstantUtils.getConstantValueLateStatic(env, this, "PERIOD_PREFIX"))) {
                spec =
                        toStringR(spec, env)
                                + "0"
                                + toStringR(
                                        ClassConstantUtils.getConstantValueLateStatic(
                                                env, this, "PERIOD_YEARS"),
                                        env);
            }
        }

        super.__construct(env, spec);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object __get(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        SwitchEnumType43 switchVariable43 =
                ZVal.getEnum(
                        name,
                        SwitchEnumType43.DEFAULT_CASE,
                        SwitchEnumType43.STRING_years,
                        "years",
                        SwitchEnumType43.STRING_months,
                        "months",
                        SwitchEnumType43.STRING_dayz,
                        "dayz",
                        SwitchEnumType43.STRING_hours,
                        "hours",
                        SwitchEnumType43.STRING_minutes,
                        "minutes",
                        SwitchEnumType43.STRING_seconds,
                        "seconds",
                        SwitchEnumType43.STRING_weeks,
                        "weeks",
                        SwitchEnumType43.STRING_daysExcludeWeeks,
                        "daysExcludeWeeks",
                        SwitchEnumType43.STRING_dayzExcludeWeeks,
                        "dayzExcludeWeeks");
        switch (switchVariable43) {
            case STRING_years:
                return ZVal.assign(toObjectR(this).accessProp(this, env).name("y").value());
            case STRING_months:
                return ZVal.assign(toObjectR(this).accessProp(this, env).name("m").value());
            case STRING_dayz:
                return ZVal.assign(toObjectR(this).accessProp(this, env).name("d").value());
            case STRING_hours:
                return ZVal.assign(toObjectR(this).accessProp(this, env).name("h").value());
            case STRING_minutes:
                return ZVal.assign(toObjectR(this).accessProp(this, env).name("i").value());
            case STRING_seconds:
                return ZVal.assign(toObjectR(this).accessProp(this, env).name("s").value());
            case STRING_weeks:
                return ZVal.assign(
                        ZVal.toLong(
                                function_floor
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.divide(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("d")
                                                                .value(),
                                                        Carbon.CONST_DAYS_PER_WEEK))
                                        .value()));
            case STRING_daysExcludeWeeks:
            case STRING_dayzExcludeWeeks:
                return ZVal.assign(
                        ZVal.modulus(
                                toObjectR(this).accessProp(this, env).name("d").value(),
                                Carbon.CONST_DAYS_PER_WEEK));
            case DEFAULT_CASE:
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("Unknown getter '%s'", name)
                                        .value()));
        }
        ;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "val")
    public Object __set(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object name = assignParameter(args, 0, false);
        Object val = assignParameter(args, 1, false);
        switch (toStringR(name)) {
            case "years":
                toObjectR(this).accessProp(this, env).name("y").set(val);
                break;
            case "months":
                toObjectR(this).accessProp(this, env).name("m").set(val);
                break;
            case "weeks":
                toObjectR(this)
                        .accessProp(this, env)
                        .name("d")
                        .set(ZVal.multiply(val, Carbon.CONST_DAYS_PER_WEEK));
                break;
            case "dayz":
                toObjectR(this).accessProp(this, env).name("d").set(val);
                break;
            case "hours":
                toObjectR(this).accessProp(this, env).name("h").set(val);
                break;
            case "minutes":
                toObjectR(this).accessProp(this, env).name("i").set(val);
                break;
            case "seconds":
                toObjectR(this).accessProp(this, env).name("s").set(val);
                break;
        }
        ;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "weeks")
    @ConvertedParameter(index = 1, name = "days")
    public Object weeksAndDays(RuntimeEnv env, Object... args) {
        Object weeks = assignParameter(args, 0, false);
        Object days = assignParameter(args, 1, false);
        toObjectR(this)
                .accessProp(this, env)
                .name("dayz")
                .set(ZVal.add(ZVal.multiply(weeks, Carbon.CONST_DAYS_PER_WEEK), days));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "args")
    public Object __call(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object name = assignParameter(args, 0, false);
        ReferenceContainer ___args = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object arg = null;
        arg =
                ZVal.assign(
                        ZVal.strictEqualityCheck(
                                        function_count.f.env(env).call(___args.getObject()).value(),
                                        "===",
                                        0)
                                ? 1
                                : ___args.arrayGet(env, 0));
        switch (toStringR(name)) {
            case "years":
            case "year":
                toObjectR(this).accessProp(this, env).name("years").set(arg);
                break;
            case "months":
            case "month":
                toObjectR(this).accessProp(this, env).name("months").set(arg);
                break;
            case "weeks":
            case "week":
                toObjectR(this)
                        .accessProp(this, env)
                        .name("dayz")
                        .set(ZVal.multiply(arg, Carbon.CONST_DAYS_PER_WEEK));
                break;
            case "days":
            case "dayz":
            case "day":
                toObjectR(this).accessProp(this, env).name("dayz").set(arg);
                break;
            case "hours":
            case "hour":
                toObjectR(this).accessProp(this, env).name("hours").set(arg);
                break;
            case "minutes":
            case "minute":
                toObjectR(this).accessProp(this, env).name("minutes").set(arg);
                break;
            case "seconds":
            case "second":
                toObjectR(this).accessProp(this, env).name("seconds").set(arg);
                break;
        }
        ;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object forHumans(RuntimeEnv env, Object... args) {
        Object unit = null;
        ReferenceContainer parts = new BasicReferenceContainer(null);
        Object count = null;
        Object periods = null;
        periods =
                ZVal.newArray(
                        new ZPair(
                                "year",
                                toObjectR(this).accessProp(this, env).name("years").value()),
                        new ZPair(
                                "month",
                                toObjectR(this).accessProp(this, env).name("months").value()),
                        new ZPair(
                                "week",
                                toObjectR(this).accessProp(this, env).name("weeks").value()),
                        new ZPair(
                                "day",
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("daysExcludeWeeks")
                                        .value()),
                        new ZPair(
                                "hour",
                                toObjectR(this).accessProp(this, env).name("hours").value()),
                        new ZPair(
                                "minute",
                                toObjectR(this).accessProp(this, env).name("minutes").value()),
                        new ZPair(
                                "second",
                                toObjectR(this).accessProp(this, env).name("seconds").value()));
        parts.setObject(ZVal.newArray());
        for (ZPair zpairResult834 : ZVal.getIterable(periods, env, false)) {
            unit = ZVal.assign(zpairResult834.getKey());
            count = ZVal.assign(zpairResult834.getValue());
            if (ZVal.isGreaterThan(count, '>', 0)) {
                parts.arrayAppend(env)
                        .set(
                                env.callMethod(
                                        StaticMethodUtils.accessUnknownLateStaticMethod(
                                                        env, this, CarbonInterval.class)
                                                .method("translator")
                                                .call()
                                                .value(),
                                        "transChoice",
                                        CarbonInterval.class,
                                        unit,
                                        count,
                                        ZVal.newArray(new ZPair(":count", count))));
            }
        }

        return ZVal.assign(NamespaceGlobal.implode.env(env).call(" ", parts.getObject()).value());
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.forHumans(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "interval", typeHint = "DateInterval")
    public Object add(RuntimeEnv env, Object... args) {
        ReferenceContainer interval = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object sign = null;
        sign =
                ZVal.assign(
                        ZVal.strictEqualityCheck(
                                        toObjectR(interval.getObject())
                                                .accessProp(this, env)
                                                .name("invert")
                                                .value(),
                                        "===",
                                        1)
                                ? -1
                                : 1);
        if (ZVal.isTrue(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, CarbonInterval.class)
                        .method("wasCreatedFromDiff")
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(0, interval))
                        .call(interval.getObject())
                        .value())) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("dayz")
                    .set(
                            ZAssignment.add(
                                    "+=",
                                    toObjectR(this).accessProp(this, env).name("dayz").value(),
                                    ZVal.multiply(
                                            toObjectR(interval.getObject())
                                                    .accessProp(this, env)
                                                    .name("days")
                                                    .value(),
                                            sign)));

        } else {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("years")
                    .set(
                            ZAssignment.add(
                                    "+=",
                                    toObjectR(this).accessProp(this, env).name("years").value(),
                                    ZVal.multiply(
                                            toObjectR(interval.getObject())
                                                    .accessProp(this, env)
                                                    .name("y")
                                                    .value(),
                                            sign)));
            toObjectR(this)
                    .accessProp(this, env)
                    .name("months")
                    .set(
                            ZAssignment.add(
                                    "+=",
                                    toObjectR(this).accessProp(this, env).name("months").value(),
                                    ZVal.multiply(
                                            toObjectR(interval.getObject())
                                                    .accessProp(this, env)
                                                    .name("m")
                                                    .value(),
                                            sign)));
            toObjectR(this)
                    .accessProp(this, env)
                    .name("dayz")
                    .set(
                            ZAssignment.add(
                                    "+=",
                                    toObjectR(this).accessProp(this, env).name("dayz").value(),
                                    ZVal.multiply(
                                            toObjectR(interval.getObject())
                                                    .accessProp(this, env)
                                                    .name("d")
                                                    .value(),
                                            sign)));
            toObjectR(this)
                    .accessProp(this, env)
                    .name("hours")
                    .set(
                            ZAssignment.add(
                                    "+=",
                                    toObjectR(this).accessProp(this, env).name("hours").value(),
                                    ZVal.multiply(
                                            toObjectR(interval.getObject())
                                                    .accessProp(this, env)
                                                    .name("h")
                                                    .value(),
                                            sign)));
            toObjectR(this)
                    .accessProp(this, env)
                    .name("minutes")
                    .set(
                            ZAssignment.add(
                                    "+=",
                                    toObjectR(this).accessProp(this, env).name("minutes").value(),
                                    ZVal.multiply(
                                            toObjectR(interval.getObject())
                                                    .accessProp(this, env)
                                                    .name("i")
                                                    .value(),
                                            sign)));
            toObjectR(this)
                    .accessProp(this, env)
                    .name("seconds")
                    .set(
                            ZAssignment.add(
                                    "+=",
                                    toObjectR(this).accessProp(this, env).name("seconds").value(),
                                    ZVal.multiply(
                                            toObjectR(interval.getObject())
                                                    .accessProp(this, env)
                                                    .name("s")
                                                    .value(),
                                            sign)));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object spec(RuntimeEnv env, Object... args) {
        Object date = null;
        Object specString = null;
        Object time = null;
        Object value = null;
        Object key = null;
        date =
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair(
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "PERIOD_YEARS"),
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("y")
                                                        .value()),
                                        new ZPair(
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "PERIOD_MONTHS"),
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("m")
                                                        .value()),
                                        new ZPair(
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "PERIOD_DAYS"),
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("d")
                                                        .value())))
                        .value();
        time =
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair(
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "PERIOD_HOURS"),
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("h")
                                                        .value()),
                                        new ZPair(
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "PERIOD_MINUTES"),
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("i")
                                                        .value()),
                                        new ZPair(
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "PERIOD_SECONDS"),
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("s")
                                                        .value())))
                        .value();
        specString =
                ZVal.assign(
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "PERIOD_PREFIX"));
        for (ZPair zpairResult835 : ZVal.getIterable(date, env, false)) {
            key = ZVal.assign(zpairResult835.getKey());
            value = ZVal.assign(zpairResult835.getValue());
            specString = toStringR(specString, env) + toStringR(value, env) + toStringR(key, env);
        }

        if (ZVal.isGreaterThan(function_count.f.env(env).call(time).value(), '>', 0)) {
            specString =
                    toStringR(specString, env)
                            + toStringR(
                                    ClassConstantUtils.getConstantValueLateStatic(
                                            env, this, "PERIOD_TIME_PREFIX"),
                                    env);
            for (ZPair zpairResult836 : ZVal.getIterable(time, env, false)) {
                key = ZVal.assign(zpairResult836.getKey());
                value = ZVal.assign(zpairResult836.getValue());
                specString =
                        toStringR(specString, env) + toStringR(value, env) + toStringR(key, env);
            }
        }

        return ZVal.assign(
                ZVal.strictEqualityCheck(
                                specString,
                                "===",
                                ClassConstantUtils.getConstantValueLateStatic(
                                        env, this, "PERIOD_PREFIX"))
                        ? "PT0S"
                        : specString);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "interval", typeHint = "DateInterval")
    public Object compare(RuntimeEnv env, Object... args) {
        ReferenceContainer interval = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object current = null;
        Object passed = null;
        current = Carbon.runtimeStaticObject.now(env);
        passed =
                env.callMethod(
                        env.callMethod(current, "copy", CarbonInterval.class),
                        new RuntimeArgsWithReferences().add(0, interval),
                        "add",
                        CarbonInterval.class,
                        interval.getObject());
        env.callMethod(
                current,
                new RuntimeArgsWithReferences().add(0, new ReadOnlyReferenceContainer(this)),
                "add",
                CarbonInterval.class,
                this);
        if (ZVal.isLessThan(current, '<', passed)) {
            return -1;

        } else if (ZVal.isGreaterThan(current, '>', passed)) {
            return 1;
        }

        return 0;
    }

    public static final Object CONST_PERIOD_PREFIX = "P";

    public static final Object CONST_PERIOD_YEARS = "Y";

    public static final Object CONST_PERIOD_MONTHS = "M";

    public static final Object CONST_PERIOD_DAYS = "D";

    public static final Object CONST_PERIOD_TIME_PREFIX = "T";

    public static final Object CONST_PERIOD_HOURS = "H";

    public static final Object CONST_PERIOD_MINUTES = "M";

    public static final Object CONST_PERIOD_SECONDS = "S";

    public static final Object CONST_PHP_DAYS_FALSE = -99999;

    public static final Object CONST_class = "Carbon\\CarbonInterval";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends DateInterval.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "interval", typeHint = "DateInterval")
        private Object wasCreatedFromDiff(RuntimeEnv env, Object... args) {
            Object interval = assignParameter(args, 0, false);
            return ZVal.assign(
                    ZVal.toBool(
                                    ZVal.strictNotEqualityCheck(
                                            toObjectR(interval)
                                                    .accessProp(this, env)
                                                    .name("days")
                                                    .value(),
                                            "!==",
                                            false))
                            && ZVal.toBool(
                                    ZVal.strictNotEqualityCheck(
                                            toObjectR(interval)
                                                    .accessProp(this, env)
                                                    .name("days")
                                                    .value(),
                                            "!==",
                                            ClassConstantUtils.getConstantValueLateStatic(
                                                    env, this, "PHP_DAYS_FALSE"))));
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "years",
            defaultValue = "1",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 1,
            name = "months",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 2,
            name = "weeks",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 3,
            name = "days",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 4,
            name = "hours",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 5,
            name = "minutes",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 6,
            name = "seconds",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object create(RuntimeEnv env, Object... args) {
            Object years = assignParameter(args, 0, true);
            if (null == years) {
                years = 1;
            }
            Object months = assignParameter(args, 1, true);
            if (null == months) {
                months = ZVal.getNull();
            }
            Object weeks = assignParameter(args, 2, true);
            if (null == weeks) {
                weeks = ZVal.getNull();
            }
            Object days = assignParameter(args, 3, true);
            if (null == days) {
                days = ZVal.getNull();
            }
            Object hours = assignParameter(args, 4, true);
            if (null == hours) {
                hours = ZVal.getNull();
            }
            Object minutes = assignParameter(args, 5, true);
            if (null == minutes) {
                minutes = ZVal.getNull();
            }
            Object seconds = assignParameter(args, 6, true);
            if (null == seconds) {
                seconds = ZVal.getNull();
            }
            return ZVal.assign(
                    env.createNewWithLateStaticBindings(
                            this, years, months, weeks, days, hours, minutes, seconds));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        @ConvertedParameter(index = 1, name = "args")
        public Object __callStatic(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            ReferenceContainer ___args =
                    new BasicReferenceContainer(assignParameter(args, 1, false));
            Object arg = null;
            arg =
                    ZVal.assign(
                            ZVal.strictEqualityCheck(
                                            function_count
                                                    .f
                                                    .env(env)
                                                    .call(___args.getObject())
                                                    .value(),
                                            "===",
                                            0)
                                    ? 1
                                    : ___args.arrayGet(env, 0));
            switch (toStringR(name)) {
                case "years":
                case "year":
                    return ZVal.assign(env.createNewWithLateStaticBindings(this, arg));
                case "months":
                case "month":
                    return ZVal.assign(
                            env.createNewWithLateStaticBindings(this, ZVal.getNull(), arg));
                case "weeks":
                case "week":
                    return ZVal.assign(
                            env.createNewWithLateStaticBindings(
                                    this, ZVal.getNull(), ZVal.getNull(), arg));
                case "days":
                case "dayz":
                case "day":
                    return ZVal.assign(
                            env.createNewWithLateStaticBindings(
                                    this, ZVal.getNull(), ZVal.getNull(), ZVal.getNull(), arg));
                case "hours":
                case "hour":
                    return ZVal.assign(
                            env.createNewWithLateStaticBindings(
                                    this,
                                    ZVal.getNull(),
                                    ZVal.getNull(),
                                    ZVal.getNull(),
                                    ZVal.getNull(),
                                    arg));
                case "minutes":
                case "minute":
                    return ZVal.assign(
                            env.createNewWithLateStaticBindings(
                                    this,
                                    ZVal.getNull(),
                                    ZVal.getNull(),
                                    ZVal.getNull(),
                                    ZVal.getNull(),
                                    ZVal.getNull(),
                                    arg));
                case "seconds":
                case "second":
                    return ZVal.assign(
                            env.createNewWithLateStaticBindings(
                                    this,
                                    ZVal.getNull(),
                                    ZVal.getNull(),
                                    ZVal.getNull(),
                                    ZVal.getNull(),
                                    ZVal.getNull(),
                                    ZVal.getNull(),
                                    arg));
            }
            ;
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "intervalDefinition")
        public Object fromString(RuntimeEnv env, Object... args) {
            int runtimeConverterBreakCount;
            Object intervalDefinition = assignParameter(args, 0, false);
            Object hours = null;
            Object months = null;
            Object weeks = null;
            Object minutes = null;
            Object intValue = null;
            Object part = null;
            Object pattern = null;
            Object match = null;
            Object years = null;
            Object fraction = null;
            Object seconds = null;
            Object unit = null;
            Object runtimeTempArrayResult117 = null;
            ReferenceContainer parts = new BasicReferenceContainer(null);
            Object days = null;
            Object value = null;
            if (ZVal.isEmpty(intervalDefinition)) {
                return ZVal.assign(env.createNewWithLateStaticBindings(this, 0));
            }

            years = 0;
            months = 0;
            weeks = 0;
            days = 0;
            hours = 0;
            minutes = 0;
            seconds = 0;
            pattern = "/(\\d+(?:\\.\\d+)?)\\h*([^\\d\\h]*)/i";
            function_preg_match_all
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, parts))
                    .call(pattern, intervalDefinition, parts.getObject(), 2);
            runtimeConverterBreakCount = 0;
            while (ZVal.isTrue(
                    match = function_array_shift.f.env(env).call(parts.getObject()).value())) {
                ZVal.list(
                        runtimeTempArrayResult117 = match,
                        (part = listGet(runtimeTempArrayResult117, 0, env)),
                        (value = listGet(runtimeTempArrayResult117, 1, env)),
                        (unit = listGet(runtimeTempArrayResult117, 2, env)));
                intValue = NamespaceGlobal.intval.env(env).call(value).value();
                fraction =
                        ZVal.subtract(
                                NamespaceGlobal.floatval.env(env).call(value).value(), intValue);
                SwitchEnumType44 switchVariable44 =
                        ZVal.getEnum(
                                NamespaceGlobal.strtolower.env(env).call(unit).value(),
                                SwitchEnumType44.DEFAULT_CASE,
                                SwitchEnumType44.STRING_year,
                                "year",
                                SwitchEnumType44.STRING_years,
                                "years",
                                SwitchEnumType44.STRING_y,
                                "y",
                                SwitchEnumType44.STRING_month,
                                "month",
                                SwitchEnumType44.STRING_months,
                                "months",
                                SwitchEnumType44.STRING_mo,
                                "mo",
                                SwitchEnumType44.STRING_week,
                                "week",
                                SwitchEnumType44.STRING_weeks,
                                "weeks",
                                SwitchEnumType44.STRING_w,
                                "w",
                                SwitchEnumType44.STRING_day,
                                "day",
                                SwitchEnumType44.STRING_days,
                                "days",
                                SwitchEnumType44.STRING_d,
                                "d",
                                SwitchEnumType44.STRING_hour,
                                "hour",
                                SwitchEnumType44.STRING_hours,
                                "hours",
                                SwitchEnumType44.STRING_h,
                                "h",
                                SwitchEnumType44.STRING_minute,
                                "minute",
                                SwitchEnumType44.STRING_minutes,
                                "minutes",
                                SwitchEnumType44.STRING_m,
                                "m",
                                SwitchEnumType44.STRING_second,
                                "second",
                                SwitchEnumType44.STRING_seconds,
                                "seconds",
                                SwitchEnumType44.STRING_s,
                                "s");
                switch (switchVariable44) {
                    case STRING_year:
                    case STRING_years:
                    case STRING_y:
                        years = ZAssignment.add("+=", years, intValue);
                        break;
                    case STRING_month:
                    case STRING_months:
                    case STRING_mo:
                        months = ZAssignment.add("+=", months, intValue);
                        break;
                    case STRING_week:
                    case STRING_weeks:
                    case STRING_w:
                        weeks = ZAssignment.add("+=", weeks, intValue);
                        if (ZVal.notEqualityCheck(fraction, 0)) {
                            parts.arrayAppend(env)
                                    .set(
                                            ZVal.newArray(
                                                    new ZPair(0, ZVal.getNull()),
                                                    new ZPair(
                                                            1,
                                                            ZVal.multiply(
                                                                    fraction,
                                                                    Carbon.CONST_DAYS_PER_WEEK)),
                                                    new ZPair(2, "d")));
                        }

                        break;
                    case STRING_day:
                    case STRING_days:
                    case STRING_d:
                        days = ZAssignment.add("+=", days, intValue);
                        if (ZVal.notEqualityCheck(fraction, 0)) {
                            parts.arrayAppend(env)
                                    .set(
                                            ZVal.newArray(
                                                    new ZPair(0, ZVal.getNull()),
                                                    new ZPair(
                                                            1,
                                                            ZVal.multiply(
                                                                    fraction,
                                                                    Carbon.CONST_HOURS_PER_DAY)),
                                                    new ZPair(2, "h")));
                        }

                        break;
                    case STRING_hour:
                    case STRING_hours:
                    case STRING_h:
                        hours = ZAssignment.add("+=", hours, intValue);
                        if (ZVal.notEqualityCheck(fraction, 0)) {
                            parts.arrayAppend(env)
                                    .set(
                                            ZVal.newArray(
                                                    new ZPair(0, ZVal.getNull()),
                                                    new ZPair(
                                                            1,
                                                            ZVal.multiply(
                                                                    fraction,
                                                                    Carbon.CONST_MINUTES_PER_HOUR)),
                                                    new ZPair(2, "m")));
                        }

                        break;
                    case STRING_minute:
                    case STRING_minutes:
                    case STRING_m:
                        minutes = ZAssignment.add("+=", minutes, intValue);
                        if (ZVal.notEqualityCheck(fraction, 0)) {
                            seconds =
                                    ZAssignment.add(
                                            "+=",
                                            seconds,
                                            function_round
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            ZVal.multiply(
                                                                    fraction,
                                                                    Carbon
                                                                            .CONST_SECONDS_PER_MINUTE))
                                                    .value());
                        }

                        break;
                    case STRING_second:
                    case STRING_seconds:
                    case STRING_s:
                        seconds = ZAssignment.add("+=", seconds, intValue);
                        break;
                    case DEFAULT_CASE:
                        throw ZVal.getException(
                                env,
                                new InvalidArgumentException(
                                        env,
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "Invalid part %s in definition %s",
                                                        part, intervalDefinition)
                                                .value()));
                }
                ;
            }

            return ZVal.assign(
                    env.createNewWithLateStaticBindings(
                            this, years, months, weeks, days, hours, minutes, seconds));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "di", typeHint = "DateInterval")
        public Object instance(RuntimeEnv env, Object... args) {
            Object di = assignParameter(args, 0, false);
            Object instance = null;
            if (ZVal.isTrue(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, CarbonInterval.class)
                            .method("wasCreatedFromDiff")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(di)
                            .value())) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                "Can not instance a DateInterval object created from DateTime::diff()."));
            }

            instance =
                    env.createNewWithLateStaticBindings(
                            this,
                            toObjectR(di).accessProp(this, env).name("y").value(),
                            toObjectR(di).accessProp(this, env).name("m").value(),
                            0,
                            toObjectR(di).accessProp(this, env).name("d").value(),
                            toObjectR(di).accessProp(this, env).name("h").value(),
                            toObjectR(di).accessProp(this, env).name("i").value(),
                            toObjectR(di).accessProp(this, env).name("s").value());
            toObjectR(instance)
                    .accessProp(this, env)
                    .name("invert")
                    .set(toObjectR(di).accessProp(this, env).name("invert").value());
            toObjectR(instance)
                    .accessProp(this, env)
                    .name("days")
                    .set(toObjectR(di).accessProp(this, env).name("days").value());
            return ZVal.assign(instance);
        }

        @ConvertedMethod
        protected Object translator(RuntimeEnv env, Object... args) {
            if (ZVal.strictEqualityCheck(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Carbon
                                            .classes
                                            .CarbonInterval
                                            .RequestStaticProperties
                                            .class)
                            .translator,
                    "===",
                    ZVal.getNull())) {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Carbon
                                                .classes
                                                .CarbonInterval
                                                .RequestStaticProperties
                                                .class)
                                .translator =
                        Translator.runtimeStaticObject.get(env);
            }

            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Carbon
                                            .classes
                                            .CarbonInterval
                                            .RequestStaticProperties
                                            .class)
                            .translator);
        }

        @ConvertedMethod
        public Object getTranslator(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, CarbonInterval.class)
                            .method("translator")
                            .call()
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "translator",
            typeHint = "Symfony\\Component\\Translation\\TranslatorInterface"
        )
        public Object setTranslator(RuntimeEnv env, Object... args) {
            Object translator = assignParameter(args, 0, false);
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Carbon
                                            .classes
                                            .CarbonInterval
                                            .RequestStaticProperties
                                            .class)
                            .translator =
                    translator;
            return null;
        }

        @ConvertedMethod
        public Object getLocale(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    env.callMethod(
                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                            env, this, CarbonInterval.class)
                                    .method("translator")
                                    .call()
                                    .value(),
                            "getLocale",
                            CarbonInterval.class));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "locale")
        public Object setLocale(RuntimeEnv env, Object... args) {
            Object locale = assignParameter(args, 0, false);
            return ZVal.assign(
                    ZVal.strictNotEqualityCheck(
                            env.callMethod(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, CarbonInterval.class)
                                            .method("translator")
                                            .call()
                                            .value(),
                                    "setLocale",
                                    CarbonInterval.class,
                                    locale),
                            "!==",
                            false));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object translator = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Carbon\\CarbonInterval")
                    .setLookup(
                            CarbonInterval.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("translator")
                    .setFilename("vendor/nesbot/carbon/src/Carbon/CarbonInterval.php")
                    .addExtendsClass("DateInterval")
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

    private enum SwitchEnumType43 {
        STRING_years,
        STRING_months,
        STRING_dayz,
        STRING_hours,
        STRING_minutes,
        STRING_seconds,
        STRING_weeks,
        STRING_daysExcludeWeeks,
        STRING_dayzExcludeWeeks,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType44 {
        STRING_year,
        STRING_years,
        STRING_y,
        STRING_month,
        STRING_months,
        STRING_mo,
        STRING_week,
        STRING_weeks,
        STRING_w,
        STRING_day,
        STRING_days,
        STRING_d,
        STRING_hour,
        STRING_hours,
        STRING_h,
        STRING_minute,
        STRING_minutes,
        STRING_m,
        STRING_second,
        STRING_seconds,
        STRING_s,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
