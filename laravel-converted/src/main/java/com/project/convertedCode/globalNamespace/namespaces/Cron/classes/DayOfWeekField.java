package com.project.convertedCode.globalNamespace.namespaces.Cron.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Cron.classes.AbstractField;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_range;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/dragonmantank/cron-expression/src/Cron/DayOfWeekField.php

*/

public class DayOfWeekField extends AbstractField {

    public Object nthRange = null;

    public DayOfWeekField(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.rangeStart = 0;
        this.rangeEnd = 7;
        this.literals =
                ZVal.newArray(
                        new ZPair(1, "MON"),
                        new ZPair(2, "TUE"),
                        new ZPair(3, "WED"),
                        new ZPair(4, "THU"),
                        new ZPair(5, "FRI"),
                        new ZPair(6, "SAT"),
                        new ZPair(7, "SUN"));
        if (this.getClass() == DayOfWeekField.class) {
            this.__construct(env, args);
        }
    }

    public DayOfWeekField(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        this.nthRange = function_range.f.env(env).call(1, 5).value();
        super.__construct(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "date", typeHint = "DateTime")
    @ConvertedParameter(index = 1, name = "value")
    public Object isSatisfiedBy(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object date = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object nth = null;
        ReferenceContainer dayCount = new BasicReferenceContainer(null);
        Object weekday = null;
        Object format = null;
        Object currentMonth = null;
        ReferenceContainer lastDayOfMonth = new BasicReferenceContainer(null);
        Object fieldValue = null;
        Object currentYear = null;
        Object tdate = null;
        Object runtimeTempArrayResult3 = null;
        ReferenceContainer currentDay = new BasicReferenceContainer(null);
        Object tdateClone = null;
        ReferenceContainer parts = new BasicReferenceContainer(null);
        if (ZVal.equalityCheck(value, "?")) {
            return ZVal.assign(true);
        }

        value = env.callMethod(this, "convertLiterals", DayOfWeekField.class, value);
        currentYear = env.callMethod(date, "format", DayOfWeekField.class, "Y");
        currentMonth = env.callMethod(date, "format", DayOfWeekField.class, "m");
        lastDayOfMonth.setObject(env.callMethod(date, "format", DayOfWeekField.class, "t"));
        if (function_strpos.f.env(env).call(value, "L").getBool()) {
            weekday =
                    function_str_replace
                            .f
                            .env(env)
                            .call(
                                    "7",
                                    "0",
                                    function_substr
                                            .f
                                            .env(env)
                                            .call(
                                                    value,
                                                    0,
                                                    function_strpos
                                                            .f
                                                            .env(env)
                                                            .call(value, "L")
                                                            .value())
                                            .value())
                            .value();
            tdate = ZVal.assign(((RuntimeClassInterface) date).phpClone(env));
            env.callMethod(
                    tdate,
                    "setDate",
                    DayOfWeekField.class,
                    currentYear,
                    currentMonth,
                    lastDayOfMonth.getObject());
            runtimeConverterBreakCount = 0;
            while (ZVal.notEqualityCheck(
                    env.callMethod(tdate, "format", DayOfWeekField.class, "w"), weekday)) {
                tdateClone = new DateTime(env);
                tdate =
                        env.callMethod(
                                env.callMethod(
                                        tdateClone,
                                        "setTimezone",
                                        DayOfWeekField.class,
                                        env.callMethod(tdate, "getTimezone", DayOfWeekField.class)),
                                "setDate",
                                DayOfWeekField.class,
                                currentYear,
                                currentMonth,
                                ZVal.preDecrement(lastDayOfMonth));
            }

            return ZVal.assign(
                    ZVal.equalityCheck(
                            env.callMethod(date, "format", DayOfWeekField.class, "j"),
                            lastDayOfMonth.getObject()));
        }

        if (function_strpos.f.env(env).call(value, "#").getBool()) {
            ZVal.list(
                    runtimeTempArrayResult3 = function_explode.f.env(env).call("#", value).value(),
                    (weekday = listGet(runtimeTempArrayResult3, 0, env)),
                    (nth = listGet(runtimeTempArrayResult3, 1, env)));
            if (!function_is_numeric.f.env(env).call(nth).getBool()) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                "Hashed weekdays must be numeric, "
                                        + toStringR(nth, env)
                                        + " given"));

            } else {
                nth = ZVal.assign(ZVal.toLong(nth));
            }

            if (ZVal.strictEqualityCheck(weekday, "===", "0")) {
                weekday = 7;
            }

            weekday = env.callMethod(this, "convertLiterals", DayOfWeekField.class, weekday);
            if (ZVal.toBool(ZVal.isLessThan(weekday, '<', 0))
                    || ZVal.toBool(ZVal.isGreaterThan(weekday, '>', 7))) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                "Weekday must be a value between 0 and 7. "
                                        + toStringR(weekday, env)
                                        + " given"));
            }

            if (!function_in_array.f.env(env).call(nth, this.nthRange).getBool()) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                "There are never more than 5 or less than 1 of a given weekday in a month, "
                                        + toStringR(nth, env)
                                        + " given"));
            }

            if (ZVal.notEqualityCheck(
                    env.callMethod(date, "format", DayOfWeekField.class, "N"), weekday)) {
                return ZVal.assign(false);
            }

            tdate = ZVal.assign(((RuntimeClassInterface) date).phpClone(env));
            env.callMethod(tdate, "setDate", DayOfWeekField.class, currentYear, currentMonth, 1);
            dayCount.setObject(0);
            currentDay.setObject(1);
            runtimeConverterBreakCount = 0;
            while (ZVal.isLessThan(
                    currentDay.getObject(), '<', ZVal.add(lastDayOfMonth.getObject(), 1))) {
                if (ZVal.equalityCheck(
                        env.callMethod(tdate, "format", DayOfWeekField.class, "N"), weekday)) {
                    if (ZVal.isGreaterThanOrEqualTo(ZVal.preIncrement(dayCount), ">=", nth)) {
                        break;
                    }
                }

                env.callMethod(
                        tdate,
                        "setDate",
                        DayOfWeekField.class,
                        currentYear,
                        currentMonth,
                        ZVal.preIncrement(currentDay));
            }

            return ZVal.assign(
                    ZVal.equalityCheck(
                            env.callMethod(date, "format", DayOfWeekField.class, "j"),
                            currentDay.getObject()));
        }

        if (function_strpos.f.env(env).call(value, "-").getBool()) {
            parts.setObject(function_explode.f.env(env).call("-", value).value());
            if (ZVal.equalityCheck(parts.arrayGet(env, 0), "7")) {
                parts.arrayAccess(env, 0).set("0");

            } else if (ZVal.equalityCheck(parts.arrayGet(env, 1), "0")) {
                parts.arrayAccess(env, 1).set("7");
            }

            value = NamespaceGlobal.implode.env(env).call("-", parts.getObject()).value();
        }

        format =
                ZVal.assign(
                        function_in_array
                                        .f
                                        .env(env)
                                        .call(
                                                7,
                                                NamespaceGlobal.str_split
                                                        .env(env)
                                                        .call(value)
                                                        .value())
                                        .getBool()
                                ? "N"
                                : "w");
        fieldValue = env.callMethod(date, "format", DayOfWeekField.class, format);
        return ZVal.assign(
                env.callMethod(this, "isSatisfied", DayOfWeekField.class, fieldValue, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "date", typeHint = "DateTime")
    @ConvertedParameter(
        index = 1,
        name = "invert",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object increment(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, false);
        Object invert = assignParameter(args, 1, true);
        if (null == invert) {
            invert = false;
        }
        if (ZVal.isTrue(invert)) {
            env.callMethod(date, "modify", DayOfWeekField.class, "-1 day");
            env.callMethod(date, "setTime", DayOfWeekField.class, 23, 59, 0);

        } else {
            env.callMethod(date, "modify", DayOfWeekField.class, "+1 day");
            env.callMethod(date, "setTime", DayOfWeekField.class, 0, 0, 0);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object validate(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        ReferenceContainer chunks = new BasicReferenceContainer(null);
        Object basicChecks = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        basicChecks = super.validate(env, value);
        if (!ZVal.isTrue(basicChecks)) {
            if (ZVal.strictNotEqualityCheck(
                    function_strpos.f.env(env).call(value, "#").value(), "!==", false)) {
                chunks.setObject(function_explode.f.env(env).call("#", value).value());
                chunks.arrayAccess(env, 0)
                        .set(
                                env.callMethod(
                                        this,
                                        "convertLiterals",
                                        DayOfWeekField.class,
                                        chunks.arrayGet(env, 0)));
                if (ZVal.toBool(
                                ZVal.toBool(super.validate(env, chunks.arrayGet(env, 0)))
                                        && ZVal.toBool(
                                                function_is_numeric
                                                        .f
                                                        .env(env)
                                                        .call(chunks.arrayGet(env, 1))
                                                        .value()))
                        && ZVal.toBool(
                                function_in_array
                                        .f
                                        .env(env)
                                        .call(chunks.arrayGet(env, 1), this.nthRange)
                                        .value())) {
                    return ZVal.assign(true);
                }
            }

            if (function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call("/^(.*)L$/", value, matches.getObject())
                    .getBool()) {
                return ZVal.assign(this.validate(env, matches.arrayGet(env, 1)));
            }

            return ZVal.assign(false);
        }

        return ZVal.assign(basicChecks);
    }

    public static final Object CONST_class = "Cron\\DayOfWeekField";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractField.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Cron\\DayOfWeekField")
                    .setLookup(
                            DayOfWeekField.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "fullRange",
                            "literals",
                            "literals",
                            "nthRange",
                            "rangeEnd",
                            "rangeEnd",
                            "rangeStart",
                            "rangeStart")
                    .setFilename("vendor/dragonmantank/cron-expression/src/Cron/DayOfWeekField.php")
                    .addInterface("Cron\\FieldInterface")
                    .addExtendsClass("Cron\\AbstractField")
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
