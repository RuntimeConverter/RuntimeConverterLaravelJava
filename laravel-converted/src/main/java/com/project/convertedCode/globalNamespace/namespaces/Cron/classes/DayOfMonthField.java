package com.project.convertedCode.globalNamespace.namespaces.Cron.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Cron.classes.AbstractField;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/dragonmantank/cron-expression/src/Cron/DayOfMonthField.php

*/

public class DayOfMonthField extends AbstractField {

    public DayOfMonthField(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.rangeStart = 1;
        this.rangeEnd = 31;
        if (this.getClass() == DayOfMonthField.class) {
            this.__construct(env, args);
        }
    }

    public DayOfMonthField(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "date", typeHint = "DateTime")
    @ConvertedParameter(index = 1, name = "value")
    public Object isSatisfiedBy(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object targetDay = null;
        Object fieldValue = null;
        if (ZVal.equalityCheck(value, "?")) {
            return ZVal.assign(true);
        }

        fieldValue = env.callMethod(date, "format", DayOfMonthField.class, "d");
        if (ZVal.equalityCheck(value, "L")) {
            return ZVal.assign(
                    ZVal.equalityCheck(
                            fieldValue,
                            env.callMethod(date, "format", DayOfMonthField.class, "t")));
        }

        if (function_strpos.f.env(env).call(value, "W").getBool()) {
            targetDay =
                    function_substr
                            .f
                            .env(env)
                            .call(value, 0, function_strpos.f.env(env).call(value, "W").value())
                            .value();
            return ZVal.assign(
                    ZVal.equalityCheck(
                            env.callMethod(date, "format", DayOfMonthField.class, "j"),
                            env.callMethod(
                                    runtimeStaticObject.getNearestWeekday(
                                            env,
                                            env.callMethod(
                                                    date, "format", DayOfMonthField.class, "Y"),
                                            env.callMethod(
                                                    date, "format", DayOfMonthField.class, "m"),
                                            targetDay),
                                    "format",
                                    DayOfMonthField.class,
                                    "j")));
        }

        return ZVal.assign(
                env.callMethod(
                        this,
                        "isSatisfied",
                        DayOfMonthField.class,
                        env.callMethod(date, "format", DayOfMonthField.class, "d"),
                        value));
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
            env.callMethod(date, "modify", DayOfMonthField.class, "previous day");
            env.callMethod(date, "setTime", DayOfMonthField.class, 23, 59);

        } else {
            env.callMethod(date, "modify", DayOfMonthField.class, "next day");
            env.callMethod(date, "setTime", DayOfMonthField.class, 0, 0);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object validate(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object basicChecks = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        basicChecks = super.validate(env, value);
        if (ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                function_strpos.f.env(env).call(value, ",").value(), "!==", false))
                && ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                function_strpos.f.env(env).call(value, "W").value(),
                                                "!==",
                                                false))
                                || ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                function_strpos.f.env(env).call(value, "L").value(),
                                                "!==",
                                                false)))) {
            return ZVal.assign(false);
        }

        if (!ZVal.isTrue(basicChecks)) {
            if (ZVal.strictEqualityCheck(value, "===", "L")) {
                return ZVal.assign(true);
            }

            if (function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call("/^(.*)W$/", value, matches.getObject())
                    .getBool()) {
                return ZVal.assign(this.validate(env, matches.arrayGet(env, 1)));
            }

            return ZVal.assign(false);
        }

        return ZVal.assign(basicChecks);
    }

    public static final Object CONST_class = "Cron\\DayOfMonthField";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractField.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "currentYear")
        @ConvertedParameter(index = 1, name = "currentMonth")
        @ConvertedParameter(index = 2, name = "targetDay")
        private Object getNearestWeekday(RuntimeEnv env, Object... args) {
            Object currentYear = assignParameter(args, 0, false);
            Object currentMonth = assignParameter(args, 1, false);
            Object targetDay = assignParameter(args, 2, false);
            Object currentWeekday = null;
            Object adjusted = null;
            Object i = null;
            Object lastDayOfMonth = null;
            Object tday = null;
            Object target = null;
            tday = NamespaceGlobal.str_pad.env(env).call(targetDay, 2, "0", 0).value();
            target =
                    DateTime.runtimeStaticObject.createFromFormat(
                            env,
                            "Y-m-d",
                            toStringR(currentYear, env)
                                    + "-"
                                    + toStringR(currentMonth, env)
                                    + "-"
                                    + toStringR(tday, env));
            currentWeekday =
                    ZVal.assign(
                            ZVal.toLong(
                                    env.callMethod(target, "format", DayOfMonthField.class, "N")));
            if (ZVal.isLessThan(currentWeekday, '<', 6)) {
                return ZVal.assign(target);
            }

            lastDayOfMonth = env.callMethod(target, "format", DayOfMonthField.class, "t");
            for (ZPair zpairResult22 :
                    ZVal.getIterable(ZVal.arrayFromList(-1, 1, -2, 2), env, true)) {
                i = ZVal.assign(zpairResult22.getValue());
                adjusted = ZVal.add(targetDay, i);
                if (ZVal.toBool(ZVal.isGreaterThan(adjusted, '>', 0))
                        && ZVal.toBool(ZVal.isLessThanOrEqualTo(adjusted, "<=", lastDayOfMonth))) {
                    env.callMethod(
                            target,
                            "setDate",
                            DayOfMonthField.class,
                            currentYear,
                            currentMonth,
                            adjusted);
                    if (ZVal.toBool(
                                    ZVal.isLessThan(
                                            env.callMethod(
                                                    target, "format", DayOfMonthField.class, "N"),
                                            '<',
                                            6))
                            && ZVal.toBool(
                                    ZVal.equalityCheck(
                                            env.callMethod(
                                                    target, "format", DayOfMonthField.class, "m"),
                                            currentMonth))) {
                        return ZVal.assign(target);
                    }
                }
            }

            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Cron\\DayOfMonthField")
                    .setLookup(
                            DayOfMonthField.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "fullRange",
                            "literals",
                            "rangeEnd",
                            "rangeEnd",
                            "rangeStart",
                            "rangeStart")
                    .setFilename(
                            "vendor/dragonmantank/cron-expression/src/Cron/DayOfMonthField.php")
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
