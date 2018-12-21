package com.project.convertedCode.globalNamespace.namespaces.Cron.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Cron.classes.AbstractField;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeZone;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/dragonmantank/cron-expression/src/Cron/HoursField.php

*/

public class HoursField extends AbstractField {

    public HoursField(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.rangeStart = 0;
        this.rangeEnd = 23;
        if (this.getClass() == HoursField.class) {
            this.__construct(env, args);
        }
    }

    public HoursField(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "date", typeHint = "DateTime")
    @ConvertedParameter(index = 1, name = "value")
    public Object isSatisfiedBy(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "isSatisfied",
                        HoursField.class,
                        env.callMethod(date, "format", HoursField.class, "H"),
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
    @ConvertedParameter(
        index = 2,
        name = "parts",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object increment(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object date = assignParameter(args, 0, false);
        Object invert = assignParameter(args, 1, true);
        if (null == invert) {
            invert = false;
        }
        Object parts = assignParameter(args, 2, true);
        if (null == parts) {
            parts = ZVal.getNull();
        }
        ReferenceContainer hours = new BasicReferenceContainer(null);
        Object current_hour = null;
        Object hour = null;
        Object timezone = null;
        Object part = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object position = null;
        if (ZVal.toBool(function_is_null.f.env(env).call(parts).value())
                || ZVal.toBool(ZVal.equalityCheck(parts, "*"))) {
            timezone = env.callMethod(date, "getTimezone", HoursField.class);
            env.callMethod(date, "setTimezone", HoursField.class, new DateTimeZone(env, "UTC"));
            if (ZVal.isTrue(invert)) {
                env.callMethod(date, "modify", HoursField.class, "-1 hour");

            } else {
                env.callMethod(date, "modify", HoursField.class, "+1 hour");
            }

            env.callMethod(date, "setTimezone", HoursField.class, timezone);
            env.callMethod(
                    date,
                    "setTime",
                    HoursField.class,
                    env.callMethod(date, "format", HoursField.class, "H"),
                    ZVal.isTrue(invert) ? 59 : 0);
            return ZVal.assign(this);
        }

        parts =
                ZVal.assign(
                        ZVal.strictNotEqualityCheck(
                                        function_strpos.f.env(env).call(parts, ",").value(),
                                        "!==",
                                        false)
                                ? function_explode.f.env(env).call(",", parts).value()
                                : ZVal.newArray(new ZPair(0, parts)));
        hours.setObject(ZVal.newArray());
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult23 : ZVal.getIterable(parts, env, true)) {
            part = ZVal.assign(zpairResult23.getValue());
            hours.setObject(
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    hours.getObject(),
                                    env.callMethod(
                                            this,
                                            "getRangeForExpression",
                                            HoursField.class,
                                            part,
                                            23))
                            .value());
        }

        current_hour = env.callMethod(date, "format", HoursField.class, "H");
        position =
                ZVal.assign(
                        ZVal.isTrue(invert)
                                ? ZVal.subtract(
                                        function_count.f.env(env).call(hours.getObject()).value(),
                                        1)
                                : 0);
        if (ZVal.isGreaterThan(function_count.f.env(env).call(hours.getObject()).value(), '>', 1)) {
            runtimeConverterBreakCount = 0;
            for (i.setObject(0);
                    ZVal.isLessThan(
                            i.getObject(),
                            '<',
                            ZVal.subtract(
                                    function_count.f.env(env).call(hours.getObject()).value(), 1));
                    i.setObject(ZVal.increment(i.getObject()))) {
                if (ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(!ZVal.isTrue(invert))
                                                        && ZVal.toBool(
                                                                ZVal.isGreaterThanOrEqualTo(
                                                                        current_hour,
                                                                        ">=",
                                                                        hours.arrayGet(
                                                                                env,
                                                                                i.getObject()))))
                                        && ZVal.toBool(
                                                ZVal.isLessThan(
                                                        current_hour,
                                                        '<',
                                                        hours.arrayGet(
                                                                env, ZVal.add(i.getObject(), 1)))))
                        || ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(invert)
                                                        && ZVal.toBool(
                                                                ZVal.isGreaterThan(
                                                                        current_hour,
                                                                        '>',
                                                                        hours.arrayGet(
                                                                                env,
                                                                                i.getObject()))))
                                        && ZVal.toBool(
                                                ZVal.isLessThanOrEqualTo(
                                                        current_hour,
                                                        "<=",
                                                        hours.arrayGet(
                                                                env,
                                                                ZVal.add(i.getObject(), 1)))))) {
                    position =
                            ZVal.assign(
                                    ZVal.isTrue(invert)
                                            ? i.getObject()
                                            : ZVal.add(i.getObject(), 1));
                    break;
                }
            }
        }

        hour = ZVal.assign(hours.arrayGet(env, position));
        if (ZVal.toBool(
                        ZVal.toBool(!ZVal.isTrue(invert))
                                && ZVal.toBool(
                                        ZVal.isGreaterThanOrEqualTo(
                                                env.callMethod(
                                                        date, "format", HoursField.class, "H"),
                                                ">=",
                                                hour)))
                || ZVal.toBool(
                        ZVal.toBool(invert)
                                && ZVal.toBool(
                                        ZVal.isLessThanOrEqualTo(
                                                env.callMethod(
                                                        date, "format", HoursField.class, "H"),
                                                "<=",
                                                hour)))) {
            env.callMethod(
                    date,
                    "modify",
                    HoursField.class,
                    toStringR(ZVal.isTrue(invert) ? "-" : "+", env) + "1 day");
            env.callMethod(
                    date,
                    "setTime",
                    HoursField.class,
                    ZVal.isTrue(invert) ? 23 : 0,
                    ZVal.isTrue(invert) ? 59 : 0);

        } else {
            env.callMethod(date, "setTime", HoursField.class, hour, ZVal.isTrue(invert) ? 59 : 0);
        }

        return ZVal.assign(this);
    }

    public static final Object CONST_class = "Cron\\HoursField";

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
                    .setName("Cron\\HoursField")
                    .setLookup(
                            HoursField.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "fullRange",
                            "literals",
                            "rangeEnd",
                            "rangeEnd",
                            "rangeStart",
                            "rangeStart")
                    .setFilename("vendor/dragonmantank/cron-expression/src/Cron/HoursField.php")
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
