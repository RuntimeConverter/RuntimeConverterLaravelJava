package com.project.convertedCode.globalNamespace.namespaces.Cron.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Cron.classes.FieldFactory;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeImmutable;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeZone;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import java.lang.Class;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/dragonmantank/cron-expression/src/Cron/CronExpression.php

*/

public class CronExpression extends RuntimeClassBase {

    public Object cronParts = null;

    public Object fieldFactory = null;

    public Object maxIterationCount = 1000;

    public CronExpression(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CronExpression.class) {
            this.__construct(env, args);
        }
    }

    public CronExpression(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    @ConvertedParameter(index = 1, name = "fieldFactory", typeHint = "Cron\\FieldFactory")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        Object fieldFactory = assignParameter(args, 1, false);
        this.fieldFactory = fieldFactory;
        this.setExpression(env, expression);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object setExpression(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object part = null;
        Object position = null;
        this.cronParts = NamespaceGlobal.preg_split.env(env).call("/\\s/", value, -1, 1).value();
        if (ZVal.isLessThan(function_count.f.env(env).call(this.cronParts).value(), '<', 5)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, toStringR(value, env) + " is not a valid CRON expression"));
        }

        for (ZPair zpairResult18 : ZVal.getIterable(this.cronParts, env, false)) {
            position = ZVal.assign(zpairResult18.getKey());
            part = ZVal.assign(zpairResult18.getValue());
            this.setPart(env, position, part);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "position")
    @ConvertedParameter(index = 1, name = "value")
    public Object setPart(RuntimeEnv env, Object... args) {
        Object position = assignParameter(args, 0, false);
        ReferenceContainer value = new BasicReferenceContainer(assignParameter(args, 1, false));
        if (!ZVal.isTrue(
                env.callMethod(
                        env.callMethod(
                                this.fieldFactory, "getField", CronExpression.class, position),
                        new RuntimeArgsWithReferences().add(0, value),
                        "validate",
                        CronExpression.class,
                        value.getObject()))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Invalid CRON field value "
                                    + toStringR(value.getObject(), env)
                                    + " at position "
                                    + toStringR(position, env)));
        }

        new ReferenceClassProperty(this, "cronParts", env)
                .arrayAccess(env, position)
                .set(value.getObject());
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "maxIterationCount")
    public Object setMaxIterationCount(RuntimeEnv env, Object... args) {
        Object maxIterationCount = assignParameter(args, 0, false);
        this.maxIterationCount = maxIterationCount;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "currentTime")
    @ConvertedParameter(index = 1, name = "nth", defaultValue = "0", defaultValueType = "number")
    @ConvertedParameter(
        index = 2,
        name = "allowCurrentDate",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "timeZone",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getNextRunDate(RuntimeEnv env, Object... args) {
        Object currentTime = assignParameter(args, 0, true);
        if (null == currentTime) {
            currentTime = "now";
        }
        Object nth = assignParameter(args, 1, true);
        if (null == nth) {
            nth = 0;
        }
        Object allowCurrentDate = assignParameter(args, 2, true);
        if (null == allowCurrentDate) {
            allowCurrentDate = false;
        }
        Object timeZone = assignParameter(args, 3, true);
        if (null == timeZone) {
            timeZone = ZVal.getNull();
        }
        return ZVal.assign(
                this.getRunDate(env, currentTime, nth, false, allowCurrentDate, timeZone));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "currentTime")
    @ConvertedParameter(index = 1, name = "nth", defaultValue = "0", defaultValueType = "number")
    @ConvertedParameter(
        index = 2,
        name = "allowCurrentDate",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "timeZone",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getPreviousRunDate(RuntimeEnv env, Object... args) {
        Object currentTime = assignParameter(args, 0, true);
        if (null == currentTime) {
            currentTime = "now";
        }
        Object nth = assignParameter(args, 1, true);
        if (null == nth) {
            nth = 0;
        }
        Object allowCurrentDate = assignParameter(args, 2, true);
        if (null == allowCurrentDate) {
            allowCurrentDate = false;
        }
        Object timeZone = assignParameter(args, 3, true);
        if (null == timeZone) {
            timeZone = ZVal.getNull();
        }
        return ZVal.assign(
                this.getRunDate(env, currentTime, nth, true, allowCurrentDate, timeZone));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "total")
    @ConvertedParameter(index = 1, name = "currentTime")
    @ConvertedParameter(
        index = 2,
        name = "invert",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "allowCurrentDate",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "timeZone",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getMultipleRunDates(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object total = assignParameter(args, 0, false);
        Object currentTime = assignParameter(args, 1, true);
        if (null == currentTime) {
            currentTime = "now";
        }
        Object invert = assignParameter(args, 2, true);
        if (null == invert) {
            invert = false;
        }
        Object allowCurrentDate = assignParameter(args, 3, true);
        if (null == allowCurrentDate) {
            allowCurrentDate = false;
        }
        Object timeZone = assignParameter(args, 4, true);
        if (null == timeZone) {
            timeZone = ZVal.getNull();
        }
        Object e = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        ReferenceContainer matches = new BasicReferenceContainer(null);
        matches.setObject(ZVal.newArray());
        runtimeConverterBreakCount = 0;
        for (i.setObject(0);
                ZVal.isLessThan(
                        i.getObject(), '<', NamespaceGlobal.max.env(env).call(0, total).value());
                i.setObject(ZVal.increment(i.getObject()))) {
            try {
                matches.arrayAppend(env)
                        .set(
                                this.getRunDate(
                                        env,
                                        currentTime,
                                        i.getObject(),
                                        invert,
                                        allowCurrentDate,
                                        timeZone));
            } catch (ConvertedException convertedException3) {
                if (convertedException3.instanceOf(RuntimeException.class, "RuntimeException")) {
                    e = convertedException3.getObject();
                    break;
                } else {
                    throw convertedException3;
                }
            }
        }

        return ZVal.assign(matches.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "part",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getExpression(RuntimeEnv env, Object... args) {
        Object part = assignParameter(args, 0, true);
        if (null == part) {
            part = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", part)) {
            return ZVal.assign(NamespaceGlobal.implode.env(env).call(" ", this.cronParts).value());

        } else if (function_array_key_exists.f.env(env).call(part, this.cronParts).getBool()) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "cronParts", env).arrayGet(env, part));
        }

        return ZVal.assign(ZVal.getNull());
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getExpression(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "currentTime")
    @ConvertedParameter(
        index = 1,
        name = "timeZone",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object isDue(RuntimeEnv env, Object... args) {
        Object currentTime = assignParameter(args, 0, true);
        if (null == currentTime) {
            currentTime = "now";
        }
        Object timeZone = assignParameter(args, 1, true);
        if (null == timeZone) {
            timeZone = ZVal.getNull();
        }
        Object e = null;
        timeZone = this.determineTimeZone(env, currentTime, timeZone);
        if (ZVal.strictEqualityCheck("now", "===", currentTime)) {
            currentTime = new DateTime(env);

        } else if (ZVal.isTrue(ZVal.checkInstanceType(currentTime, DateTime.class, "DateTime"))) {

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        currentTime, DateTimeImmutable.class, "DateTimeImmutable"))) {
            currentTime =
                    DateTime.runtimeStaticObject.createFromFormat(
                            env,
                            "U",
                            env.callMethod(currentTime, "format", CronExpression.class, "U"));

        } else {
            currentTime = new DateTime(env, currentTime);
        }

        env.callMethod(
                currentTime, "setTimeZone", CronExpression.class, new DateTimeZone(env, timeZone));
        currentTime =
                DateTime.runtimeStaticObject.createFromFormat(
                        env,
                        "Y-m-d H:i",
                        env.callMethod(currentTime, "format", CronExpression.class, "Y-m-d H:i"));
        try {
            return ZVal.assign(
                    ZVal.strictEqualityCheck(
                            env.callMethod(
                                    this.getNextRunDate(env, currentTime, 0, true),
                                    "getTimestamp",
                                    CronExpression.class),
                            "===",
                            env.callMethod(currentTime, "getTimestamp", CronExpression.class)));
        } catch (ConvertedException convertedException4) {
            if (convertedException4.instanceOf(PHPException.class, "Exception")) {
                e = convertedException4.getObject();
                return ZVal.assign(false);
            } else {
                throw convertedException4;
            }
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "currentTime",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 1, name = "nth", defaultValue = "0", defaultValueType = "number")
    @ConvertedParameter(
        index = 2,
        name = "invert",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "allowCurrentDate",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "timeZone",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object getRunDate(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        Object currentTime = assignParameter(args, 0, true);
        if (null == currentTime) {
            currentTime = ZVal.getNull();
        }
        ReferenceContainer nth = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == nth.getObject()) {
            nth.setObject(0);
        }
        Object invert = assignParameter(args, 2, true);
        if (null == invert) {
            invert = false;
        }
        Object allowCurrentDate = assignParameter(args, 3, true);
        if (null == allowCurrentDate) {
            allowCurrentDate = false;
        }
        Object timeZone = assignParameter(args, 4, true);
        if (null == timeZone) {
            timeZone = ZVal.getNull();
        }
        Object listPart = null;
        Object satisfied = null;
        Object part = null;
        Object currentDate = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object ternaryExpressionTemp = null;
        Object nextRun = null;
        Object field = null;
        ReferenceContainer parts = new BasicReferenceContainer(null);
        Object position = null;
        ReferenceContainer fields = new BasicReferenceContainer(null);
        timeZone = this.determineTimeZone(env, currentTime, timeZone);
        if (ZVal.isTrue(ZVal.checkInstanceType(currentTime, DateTime.class, "DateTime"))) {
            currentDate = ZVal.assign(((RuntimeClassInterface) currentTime).phpClone(env));

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        currentTime, DateTimeImmutable.class, "DateTimeImmutable"))) {
            currentDate =
                    DateTime.runtimeStaticObject.createFromFormat(
                            env,
                            "U",
                            env.callMethod(currentTime, "format", CronExpression.class, "U"));

        } else {
            currentDate =
                    new DateTime(
                            env,
                            ZVal.isTrue(ternaryExpressionTemp = currentTime)
                                    ? ternaryExpressionTemp
                                    : "now");
        }

        env.callMethod(
                currentDate, "setTimeZone", CronExpression.class, new DateTimeZone(env, timeZone));
        env.callMethod(
                currentDate,
                "setTime",
                CronExpression.class,
                env.callMethod(currentDate, "format", CronExpression.class, "H"),
                env.callMethod(currentDate, "format", CronExpression.class, "i"),
                0);
        nextRun = ZVal.assign(((RuntimeClassInterface) currentDate).phpClone(env));
        nth.setObject(ZVal.assign(ZVal.toLong(nth.getObject())));
        parts.setObject(ZVal.newArray());
        fields.setObject(ZVal.newArray());
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult19 :
                ZVal.getIterable(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Cron
                                                .classes
                                                .CronExpression
                                                .RequestStaticProperties
                                                .class)
                                .order,
                        env,
                        true)) {
            position = ZVal.assign(zpairResult19.getValue());
            part = this.getExpression(env, position);
            if (ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", part))
                    || ZVal.toBool(ZVal.strictEqualityCheck("*", "===", part))) {
                continue;
            }

            parts.arrayAccess(env, position).set(part);
            fields.arrayAccess(env, position)
                    .set(
                            env.callMethod(
                                    this.fieldFactory, "getField", CronExpression.class, position));
        }

        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (i.setObject(0);
                ZVal.isLessThan(i.getObject(), '<', this.maxIterationCount);
                i.setObject(ZVal.increment(i.getObject()))) {
            runtimeConverterBreakCount = 0;
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult20 : ZVal.getIterable(parts.getObject(), env, false)) {
                position = ZVal.assign(zpairResult20.getKey());
                part = ZVal.assign(zpairResult20.getValue());
                satisfied = false;
                field = ZVal.assign(fields.arrayGet(env, position));
                if (ZVal.strictEqualityCheck(
                        function_strpos.f.env(env).call(part, ",").value(), "===", false)) {
                    satisfied =
                            env.callMethod(
                                    field, "isSatisfiedBy", CronExpression.class, nextRun, part);

                } else {
                    runtimeConverterBreakCount = 0;
                    runtimeConverterContinueCount = 0;
                    for (ZPair zpairResult21 :
                            ZVal.getIterable(
                                    function_array_map
                                            .f
                                            .env(env)
                                            .call(
                                                    "trim",
                                                    function_explode
                                                            .f
                                                            .env(env)
                                                            .call(",", part)
                                                            .value())
                                            .value(),
                                    env,
                                    true)) {
                        listPart = ZVal.assign(zpairResult21.getValue());
                        if (ZVal.isTrue(
                                env.callMethod(
                                        field,
                                        "isSatisfiedBy",
                                        CronExpression.class,
                                        nextRun,
                                        listPart))) {
                            satisfied = true;
                            break;
                        }
                    }
                }

                if (!ZVal.isTrue(satisfied)) {
                    env.callMethod(field, "increment", CronExpression.class, nextRun, invert, part);
                    runtimeConverterContinueCount = 2;
                    runtimeConverterContinueCount--;
                    continue;
                }
            }

            if (ZVal.toBool(
                            ZVal.toBool(!ZVal.isTrue(allowCurrentDate))
                                    && ZVal.toBool(ZVal.equalityCheck(nextRun, currentDate)))
                    || ZVal.toBool(ZVal.isGreaterThan(ZVal.preDecrement(nth), '>', -1))) {
                env.callMethod(
                        env.callMethod(this.fieldFactory, "getField", CronExpression.class, 0),
                        "increment",
                        CronExpression.class,
                        nextRun,
                        invert,
                        arrayActionR(ArrayAction.ISSET, parts, env, 0)
                                ? parts.arrayGet(env, 0)
                                : ZVal.getNull());
                continue;
            }

            return ZVal.assign(nextRun);
        }

        throw ZVal.getException(env, new RuntimeException(env, "Impossible CRON expression"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "currentTime")
    @ConvertedParameter(index = 1, name = "timeZone")
    protected Object determineTimeZone(RuntimeEnv env, Object... args) {
        Object currentTime = assignParameter(args, 0, false);
        Object timeZone = assignParameter(args, 1, false);
        if (!function_is_null.f.env(env).call(timeZone).getBool()) {
            return ZVal.assign(timeZone);
        }

        if (ZVal.isTrue(ZVal.checkInstanceType(currentTime, (Class) null, "Datetime", env))) {
            return ZVal.assign(
                    env.callMethod(
                            env.callMethod(currentTime, "getTimeZone", CronExpression.class),
                            "getName",
                            CronExpression.class));
        }

        return ZVal.assign(NamespaceGlobal.date_default_timezone_get.env(env).call().value());
    }

    public static final Object CONST_MINUTE = 0;

    public static final Object CONST_HOUR = 1;

    public static final Object CONST_DAY = 2;

    public static final Object CONST_MONTH = 3;

    public static final Object CONST_WEEKDAY = 4;

    public static final Object CONST_YEAR = 5;

    public static final Object CONST_class = "Cron\\CronExpression";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expression")
        @ConvertedParameter(
            index = 1,
            name = "fieldFactory",
            typeHint = "Cron\\FieldFactory",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object factory(RuntimeEnv env, Object... args) {
            Object expression = assignParameter(args, 0, false);
            Object fieldFactory = assignParameter(args, 1, true);
            if (null == fieldFactory) {
                fieldFactory = ZVal.getNull();
            }
            ReferenceContainer mappings = new BasicReferenceContainer(null);
            Object ternaryExpressionTemp = null;
            mappings.setObject(
                    ZVal.newArray(
                            new ZPair("@yearly", "0 0 1 1 *"),
                            new ZPair("@annually", "0 0 1 1 *"),
                            new ZPair("@monthly", "0 0 1 * *"),
                            new ZPair("@weekly", "0 0 * * 0"),
                            new ZPair("@daily", "0 0 * * *"),
                            new ZPair("@hourly", "0 * * * *")));
            if (arrayActionR(ArrayAction.ISSET, mappings, env, expression)) {
                expression = ZVal.assign(mappings.arrayGet(env, expression));
            }

            return ZVal.assign(
                    env.createNewWithLateStaticBindings(
                            this,
                            expression,
                            ZVal.isTrue(ternaryExpressionTemp = fieldFactory)
                                    ? ternaryExpressionTemp
                                    : new FieldFactory(env)));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expression")
        public Object isValidExpression(RuntimeEnv env, Object... args) {
            Object expression = assignParameter(args, 0, false);
            Object e = null;
            try {
                runtimeStaticObject.factory(env, expression);
            } catch (ConvertedException convertedException5) {
                if (convertedException5.instanceOf(
                        InvalidArgumentException.class, "InvalidArgumentException")) {
                    e = convertedException5.getObject();
                    return ZVal.assign(false);
                } else {
                    throw convertedException5;
                }
            }

            return ZVal.assign(true);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object order =
                ZVal.newArray(
                        new ZPair(0, CONST_YEAR),
                        new ZPair(1, CONST_MONTH),
                        new ZPair(2, CONST_DAY),
                        new ZPair(3, CONST_WEEKDAY),
                        new ZPair(4, CONST_HOUR),
                        new ZPair(5, CONST_MINUTE));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Cron\\CronExpression")
                    .setLookup(
                            CronExpression.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("cronParts", "fieldFactory", "maxIterationCount")
                    .setStaticPropertyNames("order")
                    .setFilename("vendor/dragonmantank/cron-expression/src/Cron/CronExpression.php")
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
