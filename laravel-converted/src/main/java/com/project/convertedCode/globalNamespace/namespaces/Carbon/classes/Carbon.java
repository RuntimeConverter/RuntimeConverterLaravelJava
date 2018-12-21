package com.project.convertedCode.globalNamespace.namespaces.Carbon.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Carbon.classes.CarbonInterval;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.project.convertedCode.globalNamespace.namespaces.Carbon.classes.Translator;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.nativeFunctions.date.function_microtime;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_combine;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeZone;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.project.convertedCode.globalNamespace.namespaces.Carbon.namespaces.Exceptions.classes.InvalidDateException;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeClasses.date.DatePeriod;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reverse;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeInterface;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nesbot/carbon/src/Carbon/Carbon.php

*/

public class Carbon extends DateTime {

    public Carbon(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Carbon.class) {
            this.__construct(env, args);
        }
    }

    public Carbon(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "time",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "tz",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        ReferenceContainer time = new BasicReferenceContainer(assignParameter(args, 0, true));
        if (null == time.getObject()) {
            time.setObject(ZVal.getNull());
        }
        ReferenceContainer tz = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == tz.getObject()) {
            tz.setObject(ZVal.getNull());
        }
        Object timeStamp = null;
        Object runtimeTempArrayResult115 = null;
        Object dateTime = null;
        Object isNow = null;
        Object microTime = null;
        Object timezone = null;
        Object locale = null;
        Object testInstance = null;
        isNow =
                ZVal.toBool(ZVal.isEmpty(time.getObject()))
                        || ZVal.toBool(ZVal.strictEqualityCheck(time.getObject(), "===", "now"));
        if (ZVal.toBool(
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                                .method("hasTestNow")
                                .call()
                                .value())
                && ZVal.toBool(
                        ZVal.toBool(isNow)
                                || ZVal.toBool(
                                        StaticMethodUtils.accessUnknownLateStaticMethod(
                                                        env, this, Carbon.class)
                                                .method("hasRelativeKeywords")
                                                .addReferenceArgs(
                                                        new RuntimeArgsWithReferences()
                                                                .add(0, time))
                                                .call(time.getObject())
                                                .value()))) {
            testInstance =
                    ZVal.assign(
                            ((RuntimeClassInterface)
                                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                                            env, this, Carbon.class)
                                                    .method("getTestNow")
                                                    .call()
                                                    .value())
                                    .phpClone(env));
            if (ZVal.toBool(ZVal.strictNotEqualityCheck(tz.getObject(), "!==", ZVal.getNull()))
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    tz.getObject(),
                                    "!==",
                                    env.callMethod(
                                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                                            env, this, Carbon.class)
                                                    .method("getTestNow")
                                                    .call()
                                                    .value(),
                                            "getTimezone",
                                            Carbon.class)))) {
                env.callMethod(testInstance, "setTimezone", Carbon.class, tz.getObject());

            } else {
                tz.setObject(env.callMethod(testInstance, "getTimezone", Carbon.class));
            }

            if (ZVal.isTrue(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                            .method("hasRelativeKeywords")
                            .addReferenceArgs(new RuntimeArgsWithReferences().add(0, time))
                            .call(time.getObject())
                            .value())) {
                env.callMethod(testInstance, "modify", Carbon.class, time.getObject());
            }

            time.setObject(
                    env.callMethod(
                            testInstance,
                            "format",
                            Carbon.class,
                            ClassConstantUtils.getConstantValueLateStatic(
                                    env, this, "MOCK_DATETIME_FORMAT")));
        }

        timezone =
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                        .method("safeCreateDateTimeZone")
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(0, tz))
                        .call(tz.getObject())
                        .value();
        if (ZVal.toBool(
                        ZVal.toBool(ZVal.toBool(isNow) && ZVal.toBool(!ZVal.isset(testInstance)))
                                && ZVal.toBool(
                                        StaticMethodUtils.accessUnknownLateStaticMethod(
                                                        env, this, Carbon.class)
                                                .method("isMicrosecondsFallbackEnabled")
                                                .call()
                                                .value()))
                && ZVal.toBool(
                        ZVal.toBool(
                                        NamespaceGlobal.version_compare
                                                .env(env)
                                                .call("7.2.11-dev", "7.1.0-dev", "<")
                                                .value())
                                || ZVal.toBool(
                                        ZVal.toBool(
                                                        NamespaceGlobal.version_compare
                                                                .env(env)
                                                                .call(
                                                                        "7.2.11-dev",
                                                                        "7.1.3-dev",
                                                                        ">=")
                                                                .value())
                                                && ZVal.toBool(
                                                        NamespaceGlobal.version_compare
                                                                .env(env)
                                                                .call(
                                                                        "7.2.11-dev",
                                                                        "7.1.4-dev",
                                                                        "<")
                                                                .value())))) {
            ZVal.list(
                    runtimeTempArrayResult115 =
                            function_explode
                                    .f
                                    .env(env)
                                    .call(" ", function_microtime.f.env(env).call().value())
                                    .value(),
                    (microTime = listGet(runtimeTempArrayResult115, 0, env)),
                    (timeStamp = listGet(runtimeTempArrayResult115, 1, env)));
            dateTime = new DateTime(env, "now", timezone);
            env.callMethod(dateTime, "setTimestamp", Carbon.class, timeStamp);
            time.setObject(
                    toStringR(
                                    env.callMethod(
                                            dateTime,
                                            "format",
                                            Carbon.class,
                                            ClassConstantUtils.getConstantValueLateStatic(
                                                    env, this, "DEFAULT_TO_STRING_FORMAT")),
                                    env)
                            + toStringR(
                                    function_substr.f.env(env).call(microTime, 1, 7).value(), env));
        }

        if (ZVal.strictEqualityCheck(
                function_strpos.f.env(env).call(toStringR(0.1, env), ".").value(), "===", false)) {
            locale = NamespaceGlobal.setlocale.env(env).call(1, "0").value();
            NamespaceGlobal.setlocale.env(env).call(1, "C");
        }

        super.__construct(env, time.getObject(), timezone);
        if (ZVal.isset(locale)) {
            NamespaceGlobal.setlocale.env(env).call(1, locale);
        }

        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                .method("setLastErrors")
                .addReferenceArgs(
                        rLastRefArgs =
                                new RuntimeArgsWithReferences()
                                        .add(
                                                0,
                                                handleReturnReference(
                                                        DateTime.runtimeStaticObject.getLastErrors(
                                                                env))))
                .call(rLastRefArgs.get(0))
                .value();
        return null;
    }

    @ConvertedMethod
    public Object copy(RuntimeEnv env, Object... args) {
        return ZVal.assign(((RuntimeClassInterface) this).phpClone(env));
    }

    @ConvertedMethod
    public Object nowWithSameTz(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                        .method("now")
                        .addReferenceArgs(
                                rLastRefArgs =
                                        new RuntimeArgsWithReferences()
                                                .add(
                                                        0,
                                                        handleReturnReference(
                                                                env.callMethod(
                                                                        this,
                                                                        "getTimezone",
                                                                        Carbon.class))))
                        .call(rLastRefArgs.get(0))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "date",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object resolveCarbon(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        ReferenceContainer date = new BasicReferenceContainer(assignParameter(args, 0, true));
        if (null == date.getObject()) {
            date.setObject(ZVal.getNull());
        }
        if (!ZVal.isTrue(date.getObject())) {
            return ZVal.assign(this.nowWithSameTz(env));
        }

        if (function_is_string.f.env(env).call(date.getObject()).getBool()) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                            .method("parse")
                            .addReferenceArgs(
                                    rLastRefArgs =
                                            new RuntimeArgsWithReferences()
                                                    .add(0, date)
                                                    .add(
                                                            1,
                                                            handleReturnReference(
                                                                    env.callMethod(
                                                                            this,
                                                                            "getTimezone",
                                                                            Carbon.class))))
                            .call(date.getObject(), rLastRefArgs.get(1))
                            .value());
        }

        if (ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        date.getObject(), DateTime.class, "DateTime")))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        date.getObject(),
                                        DateTimeInterface.class,
                                        "DateTimeInterface")))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Expected null, string, DateTime or DateTimeInterface, "
                                    + toStringR(
                                            function_is_object
                                                            .f
                                                            .env(env)
                                                            .call(date.getObject())
                                                            .getBool()
                                                    ? function_get_class
                                                            .f
                                                            .env(env)
                                                            .call(date.getObject())
                                                            .value()
                                                    : NamespaceGlobal.gettype
                                                            .env(env)
                                                            .call(date.getObject())
                                                            .value(),
                                            env)
                                    + " given"));
        }

        return ZVal.assign(
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        date.getObject(),
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Carbon
                                                .classes
                                                .Carbon
                                                .class,
                                        "Carbon\\Carbon"))
                        ? date.getObject()
                        : StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                                .method("instance")
                                .addReferenceArgs(new RuntimeArgsWithReferences().add(0, date))
                                .call(date.getObject())
                                .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object __get(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        ReferenceContainer formats = new BasicReferenceContainer(null);
        formats =
                env.getInlineStatic(
                        16,
                        ZVal.newArray(
                                new ZPair("year", "Y"),
                                new ZPair("yearIso", "o"),
                                new ZPair("month", "n"),
                                new ZPair("day", "j"),
                                new ZPair("hour", "G"),
                                new ZPair("minute", "i"),
                                new ZPair("second", "s"),
                                new ZPair("micro", "u"),
                                new ZPair("dayOfWeek", "w"),
                                new ZPair("dayOfWeekIso", "N"),
                                new ZPair("dayOfYear", "z"),
                                new ZPair("weekOfYear", "W"),
                                new ZPair("daysInMonth", "t"),
                                new ZPair("timestamp", "U")));
        SwitchEnumType41 switchVariable41 =
                ZVal.getEnum(
                        true,
                        SwitchEnumType41.DEFAULT_CASE,
                        SwitchEnumType41.DYNAMIC_TYPE_122,
                        arrayActionR(ArrayAction.ISSET, formats, env, name),
                        SwitchEnumType41.DYNAMIC_TYPE_123,
                        ZVal.strictEqualityCheck(name, "===", "weekOfMonth"),
                        SwitchEnumType41.DYNAMIC_TYPE_124,
                        ZVal.strictEqualityCheck(name, "===", "weekNumberInMonth"),
                        SwitchEnumType41.DYNAMIC_TYPE_125,
                        ZVal.strictEqualityCheck(name, "===", "age"),
                        SwitchEnumType41.DYNAMIC_TYPE_126,
                        ZVal.strictEqualityCheck(name, "===", "quarter"),
                        SwitchEnumType41.DYNAMIC_TYPE_127,
                        ZVal.strictEqualityCheck(name, "===", "offset"),
                        SwitchEnumType41.DYNAMIC_TYPE_128,
                        ZVal.strictEqualityCheck(name, "===", "offsetHours"),
                        SwitchEnumType41.DYNAMIC_TYPE_129,
                        ZVal.strictEqualityCheck(name, "===", "dst"),
                        SwitchEnumType41.DYNAMIC_TYPE_130,
                        ZVal.strictEqualityCheck(name, "===", "local"),
                        SwitchEnumType41.DYNAMIC_TYPE_131,
                        ZVal.strictEqualityCheck(name, "===", "utc"),
                        SwitchEnumType41.RESERVED_CHARS_995231205_MINUS_null,
                        ZVal.toBool(ZVal.strictEqualityCheck(name, "===", "timezone"))
                                || ZVal.toBool(ZVal.strictEqualityCheck(name, "===", "tz")),
                        SwitchEnumType41.RESERVED_CHARS_286252198_MINUS_null,
                        ZVal.toBool(ZVal.strictEqualityCheck(name, "===", "timezoneName"))
                                || ZVal.toBool(ZVal.strictEqualityCheck(name, "===", "tzName")));
        switch (switchVariable41) {
            case DYNAMIC_TYPE_122:
                return ZVal.assign(
                        ZVal.toLong(
                                env.callMethod(
                                        this,
                                        "format",
                                        Carbon.class,
                                        formats.arrayGet(env, name))));
            case DYNAMIC_TYPE_123:
                return ZVal.assign(
                        ZVal.toLong(
                                NamespaceGlobal.ceil
                                        .env(env)
                                        .call(
                                                ZVal.divide(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("day")
                                                                .value(),
                                                        ClassConstantUtils
                                                                .getConstantValueLateStatic(
                                                                        env,
                                                                        this,
                                                                        "DAYS_PER_WEEK")))
                                        .value()));
            case DYNAMIC_TYPE_124:
                return ZVal.assign(
                        ZVal.toLong(
                                NamespaceGlobal.ceil
                                        .env(env)
                                        .call(
                                                ZVal.divide(
                                                        ZVal.subtract(
                                                                ZVal.add(
                                                                        toObjectR(this)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("day")
                                                                                .value(),
                                                                        toObjectR(
                                                                                        env
                                                                                                .callMethod(
                                                                                                        this
                                                                                                                .copy(
                                                                                                                        env),
                                                                                                        "startOfMonth",
                                                                                                        Carbon
                                                                                                                .class))
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("dayOfWeek")
                                                                                .value()),
                                                                1),
                                                        ClassConstantUtils
                                                                .getConstantValueLateStatic(
                                                                        env,
                                                                        this,
                                                                        "DAYS_PER_WEEK")))
                                        .value()));
            case DYNAMIC_TYPE_125:
                return ZVal.assign(this.diffInYears(env));
            case DYNAMIC_TYPE_126:
                return ZVal.assign(
                        ZVal.toLong(
                                NamespaceGlobal.ceil
                                        .env(env)
                                        .call(
                                                ZVal.divide(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("month")
                                                                .value(),
                                                        ClassConstantUtils
                                                                .getConstantValueLateStatic(
                                                                        env,
                                                                        this,
                                                                        "MONTHS_PER_QUARTER")))
                                        .value()));
            case DYNAMIC_TYPE_127:
                return ZVal.assign(env.callMethod(this, "getOffset", Carbon.class));
            case DYNAMIC_TYPE_128:
                return ZVal.assign(
                        ZVal.divide(
                                ZVal.divide(
                                        env.callMethod(this, "getOffset", Carbon.class),
                                        ClassConstantUtils.getConstantValueLateStatic(
                                                env, this, "SECONDS_PER_MINUTE")),
                                ClassConstantUtils.getConstantValueLateStatic(
                                        env, this, "MINUTES_PER_HOUR")));
            case DYNAMIC_TYPE_129:
                return ZVal.assign(
                        ZVal.strictEqualityCheck(
                                env.callMethod(this, "format", Carbon.class, "I"), "===", "1"));
            case DYNAMIC_TYPE_130:
                return ZVal.assign(
                        ZVal.strictEqualityCheck(
                                env.callMethod(this, "getOffset", Carbon.class),
                                "===",
                                env.callMethod(
                                        env.callMethod(
                                                this.copy(env),
                                                "setTimezone",
                                                Carbon.class,
                                                NamespaceGlobal.date_default_timezone_get
                                                        .env(env)
                                                        .call()
                                                        .value()),
                                        "getOffset",
                                        Carbon.class)));
            case DYNAMIC_TYPE_131:
                return ZVal.assign(
                        ZVal.strictEqualityCheck(
                                env.callMethod(this, "getOffset", Carbon.class), "===", 0));
            case RESERVED_CHARS_995231205_MINUS_null:
                return ZVal.assign(env.callMethod(this, "getTimezone", Carbon.class));
            case RESERVED_CHARS_286252198_MINUS_null:
                return ZVal.assign(
                        env.callMethod(
                                env.callMethod(this, "getTimezone", Carbon.class),
                                "getName",
                                Carbon.class));
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
    public Object __isset(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object e = null;
        try {
            this.__get(env, name);
        } catch (ConvertedException convertedException94) {
            if (convertedException94.instanceOf(
                    InvalidArgumentException.class, "InvalidArgumentException")) {
                e = convertedException94.getObject();
                return ZVal.assign(false);
            } else {
                throw convertedException94;
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "value")
    public Object __set(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope45 scope = new Scope45();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/nesbot/carbon/src/Carbon")
                            .setFile("/vendor/nesbot/carbon/src/Carbon/Carbon.php");
            int runtimeConverterBreakCount;
            scope.name = assignParameter(args, 0, false);
            scope.value = assignParameter(args, 1, false);
            scope.month = null;
            scope.hour = null;
            scope.year = null;
            scope.runtimeTempArrayResult116 = null;
            scope.day = null;
            scope.minute = null;
            scope.second = null;
            SwitchEnumType42 switchVariable42 =
                    ZVal.getEnum(
                            scope.name,
                            SwitchEnumType42.DEFAULT_CASE,
                            SwitchEnumType42.STRING_year,
                            "year",
                            SwitchEnumType42.STRING_month,
                            "month",
                            SwitchEnumType42.STRING_day,
                            "day",
                            SwitchEnumType42.STRING_hour,
                            "hour",
                            SwitchEnumType42.STRING_minute,
                            "minute",
                            SwitchEnumType42.STRING_second,
                            "second",
                            SwitchEnumType42.STRING_timestamp,
                            "timestamp",
                            SwitchEnumType42.STRING_timezone,
                            "timezone",
                            SwitchEnumType42.STRING_tz,
                            "tz");
            switch (switchVariable42) {
                case STRING_year:
                case STRING_month:
                case STRING_day:
                case STRING_hour:
                case STRING_minute:
                case STRING_second:
                    ZVal.list(
                            scope.runtimeTempArrayResult116 =
                                    function_explode
                                            .f
                                            .env(env)
                                            .call(
                                                    "-",
                                                    env.callMethod(
                                                            scope._thisVarAlias,
                                                            "format",
                                                            Carbon.class,
                                                            "Y-n-j-G-i-s"))
                                            .value(),
                            (scope.year = listGet(scope.runtimeTempArrayResult116, 0, env)),
                            (scope.month = listGet(scope.runtimeTempArrayResult116, 1, env)),
                            (scope.day = listGet(scope.runtimeTempArrayResult116, 2, env)),
                            (scope.hour = listGet(scope.runtimeTempArrayResult116, 3, env)),
                            (scope.minute = listGet(scope.runtimeTempArrayResult116, 4, env)),
                            (scope.second = listGet(scope.runtimeTempArrayResult116, 5, env)));
                    stack.setVariableVariable(scope, scope.name, false, scope.value);
                    this.setDateTime(
                            env,
                            scope.year,
                            scope.month,
                            scope.day,
                            scope.hour,
                            scope.minute,
                            scope.second);
                    break;
                case STRING_timestamp:
                    super.setTimestamp(env, scope.value);
                    break;
                case STRING_timezone:
                case STRING_tz:
                    this.setTimezone(env, scope.value);
                    break;
                case DEFAULT_CASE:
                    throw ZVal.getException(
                            env,
                            new InvalidArgumentException(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call("Unknown setter '%s'", scope.name)
                                            .value()));
            }
            ;
            throw new IncludeEventException(null);
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object year(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        toObjectR(this).accessProp(this, env).name("year").set(value);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object month(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        toObjectR(this).accessProp(this, env).name("month").set(value);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object day(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        toObjectR(this).accessProp(this, env).name("day").set(value);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object hour(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        toObjectR(this).accessProp(this, env).name("hour").set(value);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object minute(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        toObjectR(this).accessProp(this, env).name("minute").set(value);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object second(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        toObjectR(this).accessProp(this, env).name("second").set(value);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "year")
    @ConvertedParameter(index = 1, name = "month")
    @ConvertedParameter(index = 2, name = "day")
    public Object setDate(RuntimeEnv env, Object... args) {
        Object year = assignParameter(args, 0, false);
        Object month = assignParameter(args, 1, false);
        Object day = assignParameter(args, 2, false);
        env.callMethod(this, "modify", Carbon.class, "+0 day");
        return ZVal.assign(super.setDate(env, year, month, day));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "year")
    @ConvertedParameter(index = 1, name = "month")
    @ConvertedParameter(index = 2, name = "day")
    @ConvertedParameter(index = 3, name = "hour")
    @ConvertedParameter(index = 4, name = "minute")
    @ConvertedParameter(index = 5, name = "second", defaultValue = "0", defaultValueType = "number")
    public Object setDateTime(RuntimeEnv env, Object... args) {
        Object year = assignParameter(args, 0, false);
        Object month = assignParameter(args, 1, false);
        Object day = assignParameter(args, 2, false);
        Object hour = assignParameter(args, 3, false);
        Object minute = assignParameter(args, 4, false);
        Object second = assignParameter(args, 5, true);
        if (null == second) {
            second = 0;
        }
        return ZVal.assign(
                env.callMethod(
                        this.setDate(env, year, month, day),
                        "setTime",
                        Carbon.class,
                        hour,
                        minute,
                        second));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "time")
    public Object setTimeFromTimeString(RuntimeEnv env, Object... args) {
        Object time = assignParameter(args, 0, false);
        if (ZVal.strictEqualityCheck(
                function_strpos.f.env(env).call(time, ":").value(), "===", false)) {
            time = toStringR(time, env) + ":0";
        }

        return ZVal.assign(env.callMethod(this, "modify", Carbon.class, time));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object timestamp(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this, "setTimestamp", Carbon.class, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object timezone(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(this.setTimezone(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object tz(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(this.setTimezone(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object setTimezone(RuntimeEnv env, Object... args) {
        ReferenceContainer value = new BasicReferenceContainer(assignParameter(args, 0, false));
        super.setTimezone(
                env,
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                        .method("safeCreateDateTimeZone")
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(0, value))
                        .call(value.getObject())
                        .value());
        env.callMethod(this, "getTimestamp", Carbon.class);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "format")
    public Object formatLocalized(RuntimeEnv env, Object... args) {
        Object format = assignParameter(args, 0, false);
        Object formatted = null;
        if (ZVal.strictEqualityCheck(
                NamespaceGlobal.strtoupper
                        .env(env)
                        .call(function_substr.f.env(env).call("Linux", 0, 3).value())
                        .value(),
                "===",
                "WIN")) {
            format =
                    function_preg_replace
                            .f
                            .env(env)
                            .call("#(?<!%)((?:%%)*)%e#", "\\1%#d", format)
                            .value();
        }

        formatted =
                NamespaceGlobal.strftime
                        .env(env)
                        .call(
                                format,
                                NamespaceGlobal.strtotime
                                        .env(env)
                                        .call(this.toDateTimeString(env))
                                        .value())
                        .value();
        return ZVal.assign(
                ZVal.isTrue(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Carbon
                                                        .classes
                                                        .Carbon
                                                        .RequestStaticProperties
                                                        .class)
                                        .utf8)
                        ? NamespaceGlobal.utf8_encode.env(env).call(formatted).value()
                        : formatted);
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this,
                        "format",
                        Carbon.class,
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Carbon
                                                .classes
                                                .Carbon
                                                .RequestStaticProperties
                                                .class)
                                .toStringFormat));
    }

    @ConvertedMethod
    public Object toDateString(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "format", Carbon.class, "Y-m-d"));
    }

    @ConvertedMethod
    public Object toFormattedDateString(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "format", Carbon.class, "M j, Y"));
    }

    @ConvertedMethod
    public Object toTimeString(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "format", Carbon.class, "H:i:s"));
    }

    @ConvertedMethod
    public Object toDateTimeString(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "format", Carbon.class, "Y-m-d H:i:s"));
    }

    @ConvertedMethod
    public Object toDayDateTimeString(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "format", Carbon.class, "D, M j, Y g:i A"));
    }

    @ConvertedMethod
    public Object toAtomString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this,
                        "format",
                        Carbon.class,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "ATOM")));
    }

    @ConvertedMethod
    public Object toCookieString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this,
                        "format",
                        Carbon.class,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "COOKIE")));
    }

    @ConvertedMethod
    public Object toIso8601String(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.toAtomString(env));
    }

    @ConvertedMethod
    public Object toRfc822String(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this,
                        "format",
                        Carbon.class,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "RFC822")));
    }

    @ConvertedMethod
    public Object toIso8601ZuluString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this.copy(env), "setTimezone", Carbon.class, "UTC"),
                        "format",
                        Carbon.class,
                        "Y-m-d\\TH:i:s\\Z"));
    }

    @ConvertedMethod
    public Object toRfc850String(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this,
                        "format",
                        Carbon.class,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "RFC850")));
    }

    @ConvertedMethod
    public Object toRfc1036String(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this,
                        "format",
                        Carbon.class,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "RFC1036")));
    }

    @ConvertedMethod
    public Object toRfc1123String(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this,
                        "format",
                        Carbon.class,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "RFC1123")));
    }

    @ConvertedMethod
    public Object toRfc2822String(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this,
                        "format",
                        Carbon.class,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "RFC2822")));
    }

    @ConvertedMethod
    public Object toRfc3339String(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this,
                        "format",
                        Carbon.class,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "RFC3339")));
    }

    @ConvertedMethod
    public Object toRssString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this,
                        "format",
                        Carbon.class,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "RSS")));
    }

    @ConvertedMethod
    public Object toW3cString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this,
                        "format",
                        Carbon.class,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "W3C")));
    }

    @ConvertedMethod
    public Object toRfc7231String(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this.copy(env), "setTimezone", Carbon.class, "GMT"),
                        "format",
                        Carbon.class,
                        ClassConstantUtils.getConstantValueLateStatic(
                                env, this, "RFC7231_FORMAT")));
    }

    @ConvertedMethod
    public Object toArray(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "year", toObjectR(this).accessProp(this, env).name("year").value()),
                        new ZPair(
                                "month",
                                toObjectR(this).accessProp(this, env).name("month").value()),
                        new ZPair("day", toObjectR(this).accessProp(this, env).name("day").value()),
                        new ZPair(
                                "dayOfWeek",
                                toObjectR(this).accessProp(this, env).name("dayOfWeek").value()),
                        new ZPair(
                                "dayOfYear",
                                toObjectR(this).accessProp(this, env).name("dayOfYear").value()),
                        new ZPair(
                                "hour", toObjectR(this).accessProp(this, env).name("hour").value()),
                        new ZPair(
                                "minute",
                                toObjectR(this).accessProp(this, env).name("minute").value()),
                        new ZPair(
                                "second",
                                toObjectR(this).accessProp(this, env).name("second").value()),
                        new ZPair(
                                "micro",
                                toObjectR(this).accessProp(this, env).name("micro").value()),
                        new ZPair(
                                "timestamp",
                                toObjectR(this).accessProp(this, env).name("timestamp").value()),
                        new ZPair(
                                "formatted",
                                env.callMethod(
                                        this,
                                        "format",
                                        Carbon.class,
                                        CONST_DEFAULT_TO_STRING_FORMAT)),
                        new ZPair(
                                "timezone",
                                toObjectR(this).accessProp(this, env).name("timezone").value())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "date")
    public Object eq(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, false);
        return ZVal.assign(ZVal.equalityCheck(this, date));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "date")
    public Object equalTo(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, false);
        return ZVal.assign(this.eq(env, date));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "date")
    public Object ne(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, false);
        return ZVal.assign(!ZVal.isTrue(this.eq(env, date)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "date")
    public Object notEqualTo(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, false);
        return ZVal.assign(this.ne(env, date));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "date")
    public Object gt(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, false);
        return ZVal.assign(ZVal.isGreaterThan(this, '>', date));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "date")
    public Object greaterThan(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, false);
        return ZVal.assign(this.gt(env, date));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "date")
    public Object gte(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, false);
        return ZVal.assign(ZVal.isGreaterThanOrEqualTo(this, ">=", date));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "date")
    public Object greaterThanOrEqualTo(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, false);
        return ZVal.assign(this.gte(env, date));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "date")
    public Object lt(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, false);
        return ZVal.assign(ZVal.isLessThan(this, '<', date));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "date")
    public Object lessThan(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, false);
        return ZVal.assign(this.lt(env, date));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "date")
    public Object lte(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, false);
        return ZVal.assign(ZVal.isLessThanOrEqualTo(this, "<=", date));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "date")
    public Object lessThanOrEqualTo(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, false);
        return ZVal.assign(this.lte(env, date));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "date1")
    @ConvertedParameter(index = 1, name = "date2")
    @ConvertedParameter(
        index = 2,
        name = "equal",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object between(RuntimeEnv env, Object... args) {
        Object date1 = assignParameter(args, 0, false);
        Object date2 = assignParameter(args, 1, false);
        Object equal = assignParameter(args, 2, true);
        if (null == equal) {
            equal = true;
        }
        Object temp = null;
        if (ZVal.isTrue(env.callMethod(date1, "gt", Carbon.class, date2))) {
            temp = ZVal.assign(date1);
            date1 = ZVal.assign(date2);
            date2 = ZVal.assign(temp);
        }

        if (ZVal.isTrue(equal)) {
            return ZVal.assign(
                    ZVal.toBool(this.gte(env, date1)) && ZVal.toBool(this.lte(env, date2)));
        }

        return ZVal.assign(ZVal.toBool(this.gt(env, date1)) && ZVal.toBool(this.lt(env, date2)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "date1")
    @ConvertedParameter(index = 1, name = "date2")
    public Object closest(RuntimeEnv env, Object... args) {
        Object date1 = assignParameter(args, 0, false);
        Object date2 = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.isLessThan(this.diffInSeconds(env, date1), '<', this.diffInSeconds(env, date2))
                        ? date1
                        : date2);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "date1")
    @ConvertedParameter(index = 1, name = "date2")
    public Object farthest(RuntimeEnv env, Object... args) {
        Object date1 = assignParameter(args, 0, false);
        Object date2 = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.isGreaterThan(
                                this.diffInSeconds(env, date1), '>', this.diffInSeconds(env, date2))
                        ? date1
                        : date2);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "date",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object min(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, true);
        if (null == date) {
            date = ZVal.getNull();
        }
        date = this.resolveCarbon(env, date);
        return ZVal.assign(ZVal.isTrue(this.lt(env, date)) ? this : date);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "date",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object minimum(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, true);
        if (null == date) {
            date = ZVal.getNull();
        }
        return ZVal.assign(this.min(env, date));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "date",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object max(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, true);
        if (null == date) {
            date = ZVal.getNull();
        }
        date = this.resolveCarbon(env, date);
        return ZVal.assign(ZVal.isTrue(this.gt(env, date)) ? this : date);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "date",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object maximum(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, true);
        if (null == date) {
            date = ZVal.getNull();
        }
        return ZVal.assign(this.max(env, date));
    }

    @ConvertedMethod
    public Object isWeekday(RuntimeEnv env, Object... args) {
        return ZVal.assign(!ZVal.isTrue(this.isWeekend(env)));
    }

    @ConvertedMethod
    public Object isWeekend(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_in_array
                        .f
                        .env(env)
                        .call(
                                toObjectR(this).accessProp(this, env).name("dayOfWeek").value(),
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Carbon
                                                        .classes
                                                        .Carbon
                                                        .RequestStaticProperties
                                                        .class)
                                        .weekendDays)
                        .value());
    }

    @ConvertedMethod
    public Object isYesterday(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        this.toDateString(env),
                        "===",
                        env.callMethod(
                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, Carbon.class)
                                        .method("yesterday")
                                        .addReferenceArgs(
                                                rLastRefArgs =
                                                        new RuntimeArgsWithReferences()
                                                                .add(
                                                                        0,
                                                                        handleReturnReference(
                                                                                env.callMethod(
                                                                                        this,
                                                                                        "getTimezone",
                                                                                        Carbon
                                                                                                .class))))
                                        .call(rLastRefArgs.get(0))
                                        .value(),
                                "toDateString",
                                Carbon.class)));
    }

    @ConvertedMethod
    public Object isToday(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        this.toDateString(env),
                        "===",
                        env.callMethod(this.nowWithSameTz(env), "toDateString", Carbon.class)));
    }

    @ConvertedMethod
    public Object isTomorrow(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        this.toDateString(env),
                        "===",
                        env.callMethod(
                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, Carbon.class)
                                        .method("tomorrow")
                                        .addReferenceArgs(
                                                rLastRefArgs =
                                                        new RuntimeArgsWithReferences()
                                                                .add(
                                                                        0,
                                                                        handleReturnReference(
                                                                                env.callMethod(
                                                                                        this,
                                                                                        "getTimezone",
                                                                                        Carbon
                                                                                                .class))))
                                        .call(rLastRefArgs.get(0))
                                        .value(),
                                "toDateString",
                                Carbon.class)));
    }

    @ConvertedMethod
    public Object isNextWeek(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        toObjectR(this).accessProp(this, env).name("weekOfYear").value(),
                        "===",
                        toObjectR(env.callMethod(this.nowWithSameTz(env), "addWeek", Carbon.class))
                                .accessProp(this, env)
                                .name("weekOfYear")
                                .value()));
    }

    @ConvertedMethod
    public Object isLastWeek(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        toObjectR(this).accessProp(this, env).name("weekOfYear").value(),
                        "===",
                        toObjectR(env.callMethod(this.nowWithSameTz(env), "subWeek", Carbon.class))
                                .accessProp(this, env)
                                .name("weekOfYear")
                                .value()));
    }

    @ConvertedMethod
    public Object isNextMonth(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        toObjectR(this).accessProp(this, env).name("month").value(),
                        "===",
                        toObjectR(
                                        env.callMethod(
                                                this.nowWithSameTz(env),
                                                "addMonthNoOverflow",
                                                Carbon.class))
                                .accessProp(this, env)
                                .name("month")
                                .value()));
    }

    @ConvertedMethod
    public Object isLastMonth(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        toObjectR(this).accessProp(this, env).name("month").value(),
                        "===",
                        toObjectR(
                                        env.callMethod(
                                                this.nowWithSameTz(env),
                                                "subMonthNoOverflow",
                                                Carbon.class))
                                .accessProp(this, env)
                                .name("month")
                                .value()));
    }

    @ConvertedMethod
    public Object isNextYear(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        toObjectR(this).accessProp(this, env).name("year").value(),
                        "===",
                        toObjectR(env.callMethod(this.nowWithSameTz(env), "addYear", Carbon.class))
                                .accessProp(this, env)
                                .name("year")
                                .value()));
    }

    @ConvertedMethod
    public Object isLastYear(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        toObjectR(this).accessProp(this, env).name("year").value(),
                        "===",
                        toObjectR(env.callMethod(this.nowWithSameTz(env), "subYear", Carbon.class))
                                .accessProp(this, env)
                                .name("year")
                                .value()));
    }

    @ConvertedMethod
    public Object isFuture(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.gt(env, this.nowWithSameTz(env)));
    }

    @ConvertedMethod
    public Object isPast(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.lt(env, this.nowWithSameTz(env)));
    }

    @ConvertedMethod
    public Object isLeapYear(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        env.callMethod(this, "format", Carbon.class, "L"), "===", "1"));
    }

    @ConvertedMethod
    public Object isLongYear(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        toObjectR(
                                        StaticMethodUtils.accessUnknownLateStaticMethod(
                                                        env, this, Carbon.class)
                                                .method("create")
                                                .addReferenceArgs(
                                                        new RuntimeArgsWithReferences()
                                                                .add(
                                                                        0,
                                                                        new ReferenceClassProperty(
                                                                                this, "year", env))
                                                                .add(
                                                                        6,
                                                                        new ReferenceClassProperty(
                                                                                this, "tz", env)))
                                                .call(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("year")
                                                                .value(),
                                                        12,
                                                        28,
                                                        0,
                                                        0,
                                                        0,
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("tz")
                                                                .value())
                                                .value())
                                .accessProp(this, env)
                                .name("weekOfYear")
                                .value(),
                        "===",
                        53));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "format")
    @ConvertedParameter(
        index = 1,
        name = "date",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object isSameAs(RuntimeEnv env, Object... args) {
        Object format = assignParameter(args, 0, false);
        Object date = assignParameter(args, 1, true);
        if (null == date) {
            date = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        date =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = date)
                                ? ternaryExpressionTemp
                                : StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, Carbon.class)
                                        .method("now")
                                        .addReferenceArgs(
                                                new RuntimeArgsWithReferences()
                                                        .add(
                                                                0,
                                                                new ReferenceClassProperty(
                                                                        this, "tz", env)))
                                        .call(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("tz")
                                                        .value())
                                        .value());
        if (ZVal.toBool(!ZVal.isTrue(ZVal.checkInstanceType(date, DateTime.class, "DateTime")))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        date, DateTimeInterface.class, "DateTimeInterface")))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Expected DateTime (or instanceof) object as argument."));
        }

        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        env.callMethod(this, "format", Carbon.class, format),
                        "===",
                        env.callMethod(date, "format", Carbon.class, format)));
    }

    @ConvertedMethod
    public Object isCurrentYear(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.isSameYear(env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "date",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object isSameYear(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, true);
        if (null == date) {
            date = ZVal.getNull();
        }
        return ZVal.assign(this.isSameAs(env, "Y", date));
    }

    @ConvertedMethod
    public Object isCurrentMonth(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.isSameMonth(env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "date",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "ofSameYear",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object isSameMonth(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, true);
        if (null == date) {
            date = ZVal.getNull();
        }
        Object ofSameYear = assignParameter(args, 1, true);
        if (null == ofSameYear) {
            ofSameYear = false;
        }
        return ZVal.assign(this.isSameAs(env, ZVal.isTrue(ofSameYear) ? "Y-m" : "m", date));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "date")
    public Object isSameDay(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, false);
        return ZVal.assign(this.isSameAs(env, "Y-m-d", date));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dayOfWeek")
    public Object isDayOfWeek(RuntimeEnv env, Object... args) {
        Object dayOfWeek = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        toObjectR(this).accessProp(this, env).name("dayOfWeek").value(),
                        "===",
                        dayOfWeek));
    }

    @ConvertedMethod
    public Object isSunday(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        toObjectR(this).accessProp(this, env).name("dayOfWeek").value(),
                        "===",
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "SUNDAY")));
    }

    @ConvertedMethod
    public Object isMonday(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        toObjectR(this).accessProp(this, env).name("dayOfWeek").value(),
                        "===",
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "MONDAY")));
    }

    @ConvertedMethod
    public Object isTuesday(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        toObjectR(this).accessProp(this, env).name("dayOfWeek").value(),
                        "===",
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "TUESDAY")));
    }

    @ConvertedMethod
    public Object isWednesday(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        toObjectR(this).accessProp(this, env).name("dayOfWeek").value(),
                        "===",
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "WEDNESDAY")));
    }

    @ConvertedMethod
    public Object isThursday(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        toObjectR(this).accessProp(this, env).name("dayOfWeek").value(),
                        "===",
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "THURSDAY")));
    }

    @ConvertedMethod
    public Object isFriday(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        toObjectR(this).accessProp(this, env).name("dayOfWeek").value(),
                        "===",
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "FRIDAY")));
    }

    @ConvertedMethod
    public Object isSaturday(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        toObjectR(this).accessProp(this, env).name("dayOfWeek").value(),
                        "===",
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "SATURDAY")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object addCenturies(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                this.addYears(
                        env,
                        ZVal.multiply(
                                ClassConstantUtils.getConstantValueLateStatic(
                                        env, this, "YEARS_PER_CENTURY"),
                                value)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object addCentury(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.addCenturies(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object subCenturies(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(this.addCenturies(env, ZVal.multiply(-1, value)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object subCentury(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.subCenturies(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object addYears(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        if (ZVal.isTrue(env.callMethod(this, "shouldOverflowYears", Carbon.class))) {
            return ZVal.assign(this.addYearsWithOverflow(env, value));
        }

        return ZVal.assign(this.addYearsNoOverflow(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object addYear(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.addYears(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object addYearsNoOverflow(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                this.addMonthsNoOverflow(
                        env,
                        ZVal.multiply(
                                value,
                                ClassConstantUtils.getConstantValueLateStatic(
                                        env, this, "MONTHS_PER_YEAR"))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object addYearNoOverflow(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.addYearsNoOverflow(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object addYearsWithOverflow(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "modify",
                        Carbon.class,
                        toStringR(ZVal.toLong(value), env) + " year"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object addYearWithOverflow(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.addYearsWithOverflow(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object subYears(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(this.addYears(env, ZVal.multiply(-1, value)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object subYear(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.subYears(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object subYearsNoOverflow(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                this.subMonthsNoOverflow(
                        env,
                        ZVal.multiply(
                                value,
                                ClassConstantUtils.getConstantValueLateStatic(
                                        env, this, "MONTHS_PER_YEAR"))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object subYearNoOverflow(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.subYearsNoOverflow(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object subYearsWithOverflow(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                this.subMonthsWithOverflow(
                        env,
                        ZVal.multiply(
                                value,
                                ClassConstantUtils.getConstantValueLateStatic(
                                        env, this, "MONTHS_PER_YEAR"))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object subYearWithOverflow(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.subYearsWithOverflow(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object addQuarters(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                this.addMonths(
                        env,
                        ZVal.multiply(
                                ClassConstantUtils.getConstantValueLateStatic(
                                        env, this, "MONTHS_PER_QUARTER"),
                                value)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object addQuarter(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.addQuarters(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object subQuarters(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(this.addQuarters(env, ZVal.multiply(-1, value)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object subQuarter(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.subQuarters(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object addMonths(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                        .method("shouldOverflowMonths")
                        .call()
                        .value())) {
            return ZVal.assign(this.addMonthsWithOverflow(env, value));
        }

        return ZVal.assign(this.addMonthsNoOverflow(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object addMonth(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.addMonths(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object subMonths(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(this.addMonths(env, ZVal.multiply(-1, value)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object subMonth(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.subMonths(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object addMonthsWithOverflow(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "modify",
                        Carbon.class,
                        toStringR(ZVal.toLong(value), env) + " month"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object addMonthWithOverflow(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.addMonthsWithOverflow(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object subMonthsWithOverflow(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(this.addMonthsWithOverflow(env, ZVal.multiply(-1, value)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object subMonthWithOverflow(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.subMonthsWithOverflow(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object addMonthsNoOverflow(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object day = null;
        day = ZVal.assign(toObjectR(this).accessProp(this, env).name("day").value());
        env.callMethod(this, "modify", Carbon.class, toStringR(ZVal.toLong(value), env) + " month");
        if (ZVal.strictNotEqualityCheck(
                day, "!==", toObjectR(this).accessProp(this, env).name("day").value())) {
            env.callMethod(this, "modify", Carbon.class, "last day of previous month");
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object addMonthNoOverflow(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.addMonthsNoOverflow(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object subMonthsNoOverflow(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(this.addMonthsNoOverflow(env, ZVal.multiply(-1, value)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object subMonthNoOverflow(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.subMonthsNoOverflow(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object addDays(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this, "modify", Carbon.class, toStringR(ZVal.toLong(value), env) + " day"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object addDay(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.addDays(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object subDays(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(this.addDays(env, ZVal.multiply(-1, value)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object subDay(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.subDays(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object addWeekdays(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object t = null;
        t = this.toTimeString(env);
        env.callMethod(
                this, "modify", Carbon.class, toStringR(ZVal.toLong(value), env) + " weekday");
        return ZVal.assign(this.setTimeFromTimeString(env, t));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object addWeekday(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.addWeekdays(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object subWeekdays(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(this.addWeekdays(env, ZVal.multiply(-1, value)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object subWeekday(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.subWeekdays(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object addWeeks(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "modify",
                        Carbon.class,
                        toStringR(ZVal.toLong(value), env) + " week"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object addWeek(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.addWeeks(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object subWeeks(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(this.addWeeks(env, ZVal.multiply(-1, value)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object subWeek(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.subWeeks(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object addHours(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "modify",
                        Carbon.class,
                        toStringR(ZVal.toLong(value), env) + " hour"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object addRealHours(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                this.addRealMinutes(
                        env,
                        ZVal.multiply(
                                value,
                                ClassConstantUtils.getConstantValueLateStatic(
                                        env, this, "MINUTES_PER_HOUR"))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object addHour(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.addHours(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object addRealHour(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.addRealHours(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object subHours(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(this.addHours(env, ZVal.multiply(-1, value)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object subRealHours(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(this.addRealHours(env, ZVal.multiply(-1, value)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object subHour(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.subHours(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object subRealHour(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.subRealHours(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object addMinutes(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "modify",
                        Carbon.class,
                        toStringR(ZVal.toLong(value), env) + " minute"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object addRealMinutes(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                this.addRealSeconds(
                        env,
                        ZVal.multiply(
                                value,
                                ClassConstantUtils.getConstantValueLateStatic(
                                        env, this, "SECONDS_PER_MINUTE"))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object addMinute(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.addMinutes(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object addRealMinute(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.addRealMinutes(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object subMinute(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.subMinutes(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object subRealMinute(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.addRealMinutes(env, ZVal.multiply(-1, value)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object subMinutes(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(this.addMinutes(env, ZVal.multiply(-1, value)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object subRealMinutes(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.subRealMinute(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object addSeconds(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "modify",
                        Carbon.class,
                        toStringR(ZVal.toLong(value), env) + " second"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object addRealSeconds(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "setTimestamp",
                        Carbon.class,
                        ZVal.add(env.callMethod(this, "getTimestamp", Carbon.class), value)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object addSecond(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.addSeconds(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object addRealSecond(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.addRealSeconds(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object subSeconds(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(this.addSeconds(env, ZVal.multiply(-1, value)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object subRealSeconds(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(this.addRealSeconds(env, ZVal.multiply(-1, value)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object subSecond(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.subSeconds(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object subRealSecond(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.subRealSeconds(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "date",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "absolute",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object diffInYears(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, true);
        if (null == date) {
            date = ZVal.getNull();
        }
        Object absolute = assignParameter(args, 1, true);
        if (null == absolute) {
            absolute = true;
        }
        return ZVal.assign(
                ZVal.toLong(
                        env.callMethod(
                                env.callMethod(
                                        this,
                                        "diff",
                                        Carbon.class,
                                        this.resolveCarbon(env, date),
                                        absolute),
                                "format",
                                Carbon.class,
                                "%r%y")));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "date",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "absolute",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object diffInMonths(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, true);
        if (null == date) {
            date = ZVal.getNull();
        }
        Object absolute = assignParameter(args, 1, true);
        if (null == absolute) {
            absolute = true;
        }
        date = this.resolveCarbon(env, date);
        return ZVal.assign(
                ZVal.add(
                        ZVal.multiply(
                                this.diffInYears(env, date, absolute),
                                ClassConstantUtils.getConstantValueLateStatic(
                                        env, this, "MONTHS_PER_YEAR")),
                        ZVal.toLong(
                                env.callMethod(
                                        env.callMethod(this, "diff", Carbon.class, date, absolute),
                                        "format",
                                        Carbon.class,
                                        "%r%m"))));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "date",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "absolute",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object diffInWeeks(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, true);
        if (null == date) {
            date = ZVal.getNull();
        }
        Object absolute = assignParameter(args, 1, true);
        if (null == absolute) {
            absolute = true;
        }
        return ZVal.assign(
                ZVal.toLong(
                        ZVal.divide(
                                this.diffInDays(env, date, absolute),
                                ClassConstantUtils.getConstantValueLateStatic(
                                        env, this, "DAYS_PER_WEEK"))));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "date",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "absolute",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object diffInDays(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, true);
        if (null == date) {
            date = ZVal.getNull();
        }
        Object absolute = assignParameter(args, 1, true);
        if (null == absolute) {
            absolute = true;
        }
        return ZVal.assign(
                ZVal.toLong(
                        env.callMethod(
                                env.callMethod(
                                        this,
                                        "diff",
                                        Carbon.class,
                                        this.resolveCarbon(env, date),
                                        absolute),
                                "format",
                                Carbon.class,
                                "%r%a")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    @ConvertedParameter(
        index = 1,
        name = "date",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "absolute",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object diffInDaysFiltered(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        Object date = assignParameter(args, 1, true);
        if (null == date) {
            date = ZVal.getNull();
        }
        Object absolute = assignParameter(args, 2, true);
        if (null == absolute) {
            absolute = true;
        }
        return ZVal.assign(
                this.diffFiltered(
                        env,
                        CarbonInterval.runtimeStaticObject.callUnknownStaticMethod(env, "day"),
                        callback,
                        date,
                        absolute));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    @ConvertedParameter(
        index = 1,
        name = "date",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "absolute",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object diffInHoursFiltered(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        Object date = assignParameter(args, 1, true);
        if (null == date) {
            date = ZVal.getNull();
        }
        Object absolute = assignParameter(args, 2, true);
        if (null == absolute) {
            absolute = true;
        }
        return ZVal.assign(
                this.diffFiltered(
                        env,
                        CarbonInterval.runtimeStaticObject.callUnknownStaticMethod(env, "hour"),
                        callback,
                        date,
                        absolute));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ci", typeHint = "Carbon\\CarbonInterval")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "Closure")
    @ConvertedParameter(
        index = 2,
        name = "date",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "absolute",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object diffFiltered(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/nesbot/carbon/src/Carbon")
                        .setFile("/vendor/nesbot/carbon/src/Carbon/Carbon.php");
        Object ci = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        Object date = assignParameter(args, 2, true);
        if (null == date) {
            date = ZVal.getNull();
        }
        Object absolute = assignParameter(args, 3, true);
        if (null == absolute) {
            absolute = true;
        }
        Object inverse = null;
        Object period = null;
        Object values = null;
        Object start = null;
        Object end = null;
        Object diff = null;
        start = ZVal.assign(this);
        end = this.resolveCarbon(env, date);
        inverse = false;
        if (ZVal.isLessThan(end, '<', start)) {
            start = ZVal.assign(end);
            end = ZVal.assign(this);
            inverse = true;
        }

        period = new DatePeriod(env, start, ci, end);
        values =
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                NamespaceGlobal.iterator_to_array.env(env).call(period).value(),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Carbon",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(
                                        index = 0,
                                        name = "date",
                                        typeHint = "DateTime"
                                    )
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object date = assignParameter(args, 0, false);
                                        Object callback = null;
                                        callback =
                                                this.contextReferences.getCapturedValue("callback");
                                        return ZVal.assign(
                                                function_call_user_func
                                                        .f
                                                        .env(env)
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithInfo(args, this))
                                                        .call(
                                                                callback,
                                                                com.project.convertedCode
                                                                        .globalNamespace.namespaces
                                                                        .Carbon.classes.Carbon
                                                                        .runtimeStaticObject
                                                                        .instance(env, date))
                                                        .value());
                                    }
                                }.use("callback", callback))
                        .value();
        diff = function_count.f.env(env).call(values).value();
        return ZVal.assign(
                ZVal.toBool(inverse) && ZVal.toBool(!ZVal.isTrue(absolute))
                        ? ZVal.minusSign(diff)
                        : diff);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "date",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "absolute",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object diffInWeekdays(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/nesbot/carbon/src/Carbon")
                        .setFile("/vendor/nesbot/carbon/src/Carbon/Carbon.php");
        Object date = assignParameter(args, 0, true);
        if (null == date) {
            date = ZVal.getNull();
        }
        Object absolute = assignParameter(args, 1, true);
        if (null == absolute) {
            absolute = true;
        }
        return ZVal.assign(
                this.diffInDaysFiltered(
                        env,
                        new Closure(env, runtimeConverterFunctionClassConstants, "Carbon", this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(
                                index = 0,
                                name = "date",
                                typeHint = "Carbon\\Carbon"
                            )
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object date = assignParameter(args, 0, false);
                                return ZVal.assign(env.callMethod(date, "isWeekday", Carbon.class));
                            }
                        },
                        date,
                        absolute));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "date",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "absolute",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object diffInWeekendDays(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/nesbot/carbon/src/Carbon")
                        .setFile("/vendor/nesbot/carbon/src/Carbon/Carbon.php");
        Object date = assignParameter(args, 0, true);
        if (null == date) {
            date = ZVal.getNull();
        }
        Object absolute = assignParameter(args, 1, true);
        if (null == absolute) {
            absolute = true;
        }
        return ZVal.assign(
                this.diffInDaysFiltered(
                        env,
                        new Closure(env, runtimeConverterFunctionClassConstants, "Carbon", this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(
                                index = 0,
                                name = "date",
                                typeHint = "Carbon\\Carbon"
                            )
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object date = assignParameter(args, 0, false);
                                return ZVal.assign(env.callMethod(date, "isWeekend", Carbon.class));
                            }
                        },
                        date,
                        absolute));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "date",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "absolute",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object diffInHours(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, true);
        if (null == date) {
            date = ZVal.getNull();
        }
        Object absolute = assignParameter(args, 1, true);
        if (null == absolute) {
            absolute = true;
        }
        return ZVal.assign(
                ZVal.toLong(
                        ZVal.divide(
                                ZVal.divide(
                                        this.diffInSeconds(env, date, absolute),
                                        ClassConstantUtils.getConstantValueLateStatic(
                                                env, this, "SECONDS_PER_MINUTE")),
                                ClassConstantUtils.getConstantValueLateStatic(
                                        env, this, "MINUTES_PER_HOUR"))));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "date",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "absolute",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object diffInRealHours(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, true);
        if (null == date) {
            date = ZVal.getNull();
        }
        Object absolute = assignParameter(args, 1, true);
        if (null == absolute) {
            absolute = true;
        }
        return ZVal.assign(
                ZVal.toLong(
                        ZVal.divide(
                                ZVal.divide(
                                        this.diffInRealSeconds(env, date, absolute),
                                        ClassConstantUtils.getConstantValueLateStatic(
                                                env, this, "SECONDS_PER_MINUTE")),
                                ClassConstantUtils.getConstantValueLateStatic(
                                        env, this, "MINUTES_PER_HOUR"))));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "date",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "absolute",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object diffInMinutes(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, true);
        if (null == date) {
            date = ZVal.getNull();
        }
        Object absolute = assignParameter(args, 1, true);
        if (null == absolute) {
            absolute = true;
        }
        return ZVal.assign(
                ZVal.toLong(
                        ZVal.divide(
                                this.diffInSeconds(env, date, absolute),
                                ClassConstantUtils.getConstantValueLateStatic(
                                        env, this, "SECONDS_PER_MINUTE"))));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "date",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "absolute",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object diffInRealMinutes(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, true);
        if (null == date) {
            date = ZVal.getNull();
        }
        Object absolute = assignParameter(args, 1, true);
        if (null == absolute) {
            absolute = true;
        }
        return ZVal.assign(
                ZVal.toLong(
                        ZVal.divide(
                                this.diffInRealSeconds(env, date, absolute),
                                ClassConstantUtils.getConstantValueLateStatic(
                                        env, this, "SECONDS_PER_MINUTE"))));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "date",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "absolute",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object diffInSeconds(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, true);
        if (null == date) {
            date = ZVal.getNull();
        }
        Object absolute = assignParameter(args, 1, true);
        if (null == absolute) {
            absolute = true;
        }
        Object diff = null;
        Object value = null;
        diff = env.callMethod(this, "diff", Carbon.class, this.resolveCarbon(env, date));
        value =
                ZVal.add(
                        ZVal.add(
                                ZVal.add(
                                        ZVal.multiply(
                                                ZVal.multiply(
                                                        ZVal.multiply(
                                                                toObjectR(diff)
                                                                        .accessProp(this, env)
                                                                        .name("days")
                                                                        .value(),
                                                                ClassConstantUtils
                                                                        .getConstantValueLateStatic(
                                                                                env,
                                                                                this,
                                                                                "HOURS_PER_DAY")),
                                                        ClassConstantUtils
                                                                .getConstantValueLateStatic(
                                                                        env,
                                                                        this,
                                                                        "MINUTES_PER_HOUR")),
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "SECONDS_PER_MINUTE")),
                                        ZVal.multiply(
                                                ZVal.multiply(
                                                        toObjectR(diff)
                                                                .accessProp(this, env)
                                                                .name("h")
                                                                .value(),
                                                        ClassConstantUtils
                                                                .getConstantValueLateStatic(
                                                                        env,
                                                                        this,
                                                                        "MINUTES_PER_HOUR")),
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "SECONDS_PER_MINUTE"))),
                                ZVal.multiply(
                                        toObjectR(diff).accessProp(this, env).name("i").value(),
                                        ClassConstantUtils.getConstantValueLateStatic(
                                                env, this, "SECONDS_PER_MINUTE"))),
                        toObjectR(diff).accessProp(this, env).name("s").value());
        return ZVal.assign(
                ZVal.toBool(absolute)
                                || ZVal.toBool(
                                        !toObjectR(diff)
                                                .accessProp(this, env)
                                                .name("invert")
                                                .getBool())
                        ? value
                        : ZVal.minusSign(value));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "date",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "absolute",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object diffInRealSeconds(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, true);
        if (null == date) {
            date = ZVal.getNull();
        }
        Object absolute = assignParameter(args, 1, true);
        if (null == absolute) {
            absolute = true;
        }
        Object value = null;
        date = this.resolveCarbon(env, date);
        value =
                ZVal.subtract(
                        env.callMethod(date, "getTimestamp", Carbon.class),
                        env.callMethod(this, "getTimestamp", Carbon.class));
        return ZVal.assign(
                ZVal.isTrue(absolute) ? NamespaceGlobal.abs.env(env).call(value).value() : value);
    }

    @ConvertedMethod
    public Object secondsSinceMidnight(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                this.diffInSeconds(
                        env, env.callMethod(this.copy(env), "startOfDay", Carbon.class)));
    }

    @ConvertedMethod
    public Object secondsUntilEndOfDay(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                this.diffInSeconds(env, env.callMethod(this.copy(env), "endOfDay", Carbon.class)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "other",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "absolute",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "short",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 3, name = "parts", defaultValue = "1", defaultValueType = "number")
    public Object diffForHumans(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer other = new BasicReferenceContainer(assignParameter(args, 0, true));
        if (null == other.getObject()) {
            other.setObject(ZVal.getNull());
        }
        Object absolute = assignParameter(args, 1, true);
        if (null == absolute) {
            absolute = false;
        }
        Object _pShort = assignParameter(args, 2, true);
        if (null == _pShort) {
            _pShort = false;
        }
        Object parts = assignParameter(args, 3, true);
        if (null == parts) {
            parts = 1;
        }
        Object numOfDaysCount = null;
        Object transId = null;
        Object count = null;
        ReferenceContainer diffIntervalData = new BasicReferenceContainer(null);
        Object isFuture = null;
        Object isNow = null;
        Object unit = null;
        Object diffIntervalArray = null;
        Object diffInterval = null;
        ReferenceContainer interval = new BasicReferenceContainer(null);
        Object time = null;
        Object key = null;
        isNow = ZVal.strictEqualityCheck(other.getObject(), "===", ZVal.getNull());
        interval.setObject(ZVal.newArray());
        parts =
                NamespaceGlobal.min
                        .env(env)
                        .call(6, NamespaceGlobal.max.env(env).call(1, ZVal.toLong(parts)).value())
                        .value();
        count = 1;
        unit = ZVal.assign(ZVal.isTrue(_pShort) ? "s" : "second");
        if (ZVal.isTrue(isNow)) {
            other.setObject(this.nowWithSameTz(env));

        } else if (ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        other.getObject(), DateTime.class, "DateTime")))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        other.getObject(),
                                        DateTimeInterface.class,
                                        "DateTimeInterface")))) {
            other.setObject(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                            .method("parse")
                            .addReferenceArgs(new RuntimeArgsWithReferences().add(0, other))
                            .call(other.getObject())
                            .value());
        }

        diffInterval = env.callMethod(this, "diff", Carbon.class, other.getObject());
        diffIntervalArray =
                ZVal.newArray(
                        new ZPair(
                                0,
                                ZVal.newArray(
                                        new ZPair(
                                                "value",
                                                toObjectR(diffInterval)
                                                        .accessProp(this, env)
                                                        .name("y")
                                                        .value()),
                                        new ZPair("unit", "year"),
                                        new ZPair("unitShort", "y"))),
                        new ZPair(
                                1,
                                ZVal.newArray(
                                        new ZPair(
                                                "value",
                                                toObjectR(diffInterval)
                                                        .accessProp(this, env)
                                                        .name("m")
                                                        .value()),
                                        new ZPair("unit", "month"),
                                        new ZPair("unitShort", "m"))),
                        new ZPair(
                                2,
                                ZVal.newArray(
                                        new ZPair(
                                                "value",
                                                toObjectR(diffInterval)
                                                        .accessProp(this, env)
                                                        .name("d")
                                                        .value()),
                                        new ZPair("unit", "day"),
                                        new ZPair("unitShort", "d"))),
                        new ZPair(
                                3,
                                ZVal.newArray(
                                        new ZPair(
                                                "value",
                                                toObjectR(diffInterval)
                                                        .accessProp(this, env)
                                                        .name("h")
                                                        .value()),
                                        new ZPair("unit", "hour"),
                                        new ZPair("unitShort", "h"))),
                        new ZPair(
                                4,
                                ZVal.newArray(
                                        new ZPair(
                                                "value",
                                                toObjectR(diffInterval)
                                                        .accessProp(this, env)
                                                        .name("i")
                                                        .value()),
                                        new ZPair("unit", "minute"),
                                        new ZPair("unitShort", "min"))),
                        new ZPair(
                                5,
                                ZVal.newArray(
                                        new ZPair(
                                                "value",
                                                toObjectR(diffInterval)
                                                        .accessProp(this, env)
                                                        .name("s")
                                                        .value()),
                                        new ZPair("unit", "second"),
                                        new ZPair("unitShort", "s"))));
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult833 : ZVal.getIterable(diffIntervalArray, env, true)) {
            diffIntervalData.setObject(ZVal.assign(zpairResult833.getValue()));
            if (ZVal.isGreaterThan(diffIntervalData.arrayGet(env, "value"), '>', 0)) {
                unit =
                        ZVal.assign(
                                ZVal.isTrue(_pShort)
                                        ? diffIntervalData.arrayGet(env, "unitShort")
                                        : diffIntervalData.arrayGet(env, "unit"));
                count = ZVal.assign(diffIntervalData.arrayGet(env, "value"));
                if (ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        diffIntervalData.arrayGet(env, "unit"), "===", "day"))
                        && ZVal.toBool(
                                ZVal.isGreaterThanOrEqualTo(
                                        count,
                                        ">=",
                                        ClassConstantUtils.getConstantValueLateStatic(
                                                env, this, "DAYS_PER_WEEK")))) {
                    unit = ZVal.assign(ZVal.isTrue(_pShort) ? "w" : "week");
                    count =
                            ZVal.assign(
                                    ZVal.toLong(
                                            ZVal.divide(
                                                    count,
                                                    ClassConstantUtils.getConstantValueLateStatic(
                                                            env, this, "DAYS_PER_WEEK"))));
                    interval.arrayAppend(env)
                            .set(
                                    env.callMethod(
                                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                                            env, this, Carbon.class)
                                                    .method("translator")
                                                    .call()
                                                    .value(),
                                            "transChoice",
                                            Carbon.class,
                                            unit,
                                            count,
                                            ZVal.newArray(new ZPair(":count", count))));
                    numOfDaysCount =
                            ZVal.assign(
                                    ZVal.toLong(
                                            ZVal.subtract(
                                                    diffIntervalData.arrayGet(env, "value"),
                                                    ZVal.multiply(
                                                            count,
                                                            ClassConstantUtils
                                                                    .getConstantValueLateStatic(
                                                                            env,
                                                                            this,
                                                                            "DAYS_PER_WEEK")))));
                    if (ZVal.toBool(ZVal.isGreaterThan(numOfDaysCount, '>', 0))
                            && ZVal.toBool(
                                    ZVal.isLessThan(
                                            function_count
                                                    .f
                                                    .env(env)
                                                    .call(interval.getObject())
                                                    .value(),
                                            '<',
                                            parts))) {
                        unit = ZVal.assign(ZVal.isTrue(_pShort) ? "d" : "day");
                        count = ZVal.assign(numOfDaysCount);
                        interval.arrayAppend(env)
                                .set(
                                        env.callMethod(
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Carbon.class)
                                                        .method("translator")
                                                        .call()
                                                        .value(),
                                                "transChoice",
                                                Carbon.class,
                                                unit,
                                                count,
                                                ZVal.newArray(new ZPair(":count", count))));
                    }

                } else {
                    interval.arrayAppend(env)
                            .set(
                                    env.callMethod(
                                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                                            env, this, Carbon.class)
                                                    .method("translator")
                                                    .call()
                                                    .value(),
                                            "transChoice",
                                            Carbon.class,
                                            unit,
                                            count,
                                            ZVal.newArray(new ZPair(":count", count))));
                }
            }

            if (ZVal.isGreaterThanOrEqualTo(
                    function_count.f.env(env).call(interval.getObject()).value(), ">=", parts)) {
                break;
            }
        }

        if (ZVal.strictEqualityCheck(
                function_count.f.env(env).call(interval.getObject()).value(), "===", 0)) {
            count = 1;
            unit = ZVal.assign(ZVal.isTrue(_pShort) ? "s" : "second");
            interval.arrayAppend(env)
                    .set(
                            env.callMethod(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Carbon.class)
                                            .method("translator")
                                            .call()
                                            .value(),
                                    "transChoice",
                                    Carbon.class,
                                    unit,
                                    count,
                                    ZVal.newArray(new ZPair(":count", count))));
        }

        time = NamespaceGlobal.implode.env(env).call(" ", interval.getObject()).value();
        diffIntervalArray = null;
        interval.setObject(null);
        if (ZVal.isTrue(absolute)) {
            return ZVal.assign(time);
        }

        isFuture =
                ZVal.strictEqualityCheck(
                        toObjectR(diffInterval).accessProp(this, env).name("invert").value(),
                        "===",
                        1);
        transId =
                ZVal.assign(
                        ZVal.isTrue(isNow)
                                ? ZVal.isTrue(isFuture) ? "from_now" : "ago"
                                : ZVal.isTrue(isFuture) ? "after" : "before");
        if (ZVal.strictEqualityCheck(parts, "===", 1)) {
            key = toStringR(unit, env) + "_" + toStringR(transId, env);
            count = ZVal.assign(ZVal.isset(count) ? count : 1);
            if (ZVal.strictNotEqualityCheck(
                    key,
                    "!==",
                    env.callMethod(
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                                    .method("translator")
                                    .call()
                                    .value(),
                            "transChoice",
                            Carbon.class,
                            key,
                            count))) {
                time =
                        env.callMethod(
                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, Carbon.class)
                                        .method("translator")
                                        .call()
                                        .value(),
                                "transChoice",
                                Carbon.class,
                                key,
                                count,
                                ZVal.newArray(new ZPair(":count", count)));
            }
        }

        return ZVal.assign(
                env.callMethod(
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                                .method("translator")
                                .call()
                                .value(),
                        "trans",
                        Carbon.class,
                        transId,
                        ZVal.newArray(new ZPair(":time", time))));
    }

    @ConvertedMethod
    public Object startOfDay(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "modify", Carbon.class, "00:00:00.000000"));
    }

    @ConvertedMethod
    public Object endOfDay(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "modify", Carbon.class, "23.59.59.999999"));
    }

    @ConvertedMethod
    public Object startOfMonth(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this.setDate(
                                env,
                                toObjectR(this).accessProp(this, env).name("year").value(),
                                toObjectR(this).accessProp(this, env).name("month").value(),
                                1),
                        "startOfDay",
                        Carbon.class));
    }

    @ConvertedMethod
    public Object endOfMonth(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this.setDate(
                                env,
                                toObjectR(this).accessProp(this, env).name("year").value(),
                                toObjectR(this).accessProp(this, env).name("month").value(),
                                toObjectR(this).accessProp(this, env).name("daysInMonth").value()),
                        "endOfDay",
                        Carbon.class));
    }

    @ConvertedMethod
    public Object startOfQuarter(RuntimeEnv env, Object... args) {
        Object month = null;
        month =
                ZVal.add(
                        ZVal.multiply(
                                ZVal.subtract(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("quarter")
                                                .value(),
                                        1),
                                ClassConstantUtils.getConstantValueLateStatic(
                                        env, this, "MONTHS_PER_QUARTER")),
                        1);
        return ZVal.assign(
                env.callMethod(
                        this.setDate(
                                env,
                                toObjectR(this).accessProp(this, env).name("year").value(),
                                month,
                                1),
                        "startOfDay",
                        Carbon.class));
    }

    @ConvertedMethod
    public Object endOfQuarter(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                this.startOfQuarter(env),
                                "addMonths",
                                Carbon.class,
                                ZVal.subtract(
                                        ClassConstantUtils.getConstantValueLateStatic(
                                                env, this, "MONTHS_PER_QUARTER"),
                                        1)),
                        "endOfMonth",
                        Carbon.class));
    }

    @ConvertedMethod
    public Object startOfYear(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this.setDate(
                                env,
                                toObjectR(this).accessProp(this, env).name("year").value(),
                                1,
                                1),
                        "startOfDay",
                        Carbon.class));
    }

    @ConvertedMethod
    public Object endOfYear(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this.setDate(
                                env,
                                toObjectR(this).accessProp(this, env).name("year").value(),
                                12,
                                31),
                        "endOfDay",
                        Carbon.class));
    }

    @ConvertedMethod
    public Object startOfDecade(RuntimeEnv env, Object... args) {
        Object year = null;
        year =
                ZVal.subtract(
                        toObjectR(this).accessProp(this, env).name("year").value(),
                        ZVal.modulus(
                                toObjectR(this).accessProp(this, env).name("year").value(),
                                ClassConstantUtils.getConstantValueLateStatic(
                                        env, this, "YEARS_PER_DECADE")));
        return ZVal.assign(
                env.callMethod(this.setDate(env, year, 1, 1), "startOfDay", Carbon.class));
    }

    @ConvertedMethod
    public Object endOfDecade(RuntimeEnv env, Object... args) {
        Object year = null;
        year =
                ZVal.subtract(
                        ZVal.add(
                                ZVal.subtract(
                                        toObjectR(this).accessProp(this, env).name("year").value(),
                                        ZVal.modulus(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("year")
                                                        .value(),
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "YEARS_PER_DECADE"))),
                                ClassConstantUtils.getConstantValueLateStatic(
                                        env, this, "YEARS_PER_DECADE")),
                        1);
        return ZVal.assign(
                env.callMethod(this.setDate(env, year, 12, 31), "endOfDay", Carbon.class));
    }

    @ConvertedMethod
    public Object startOfCentury(RuntimeEnv env, Object... args) {
        Object year = null;
        year =
                ZVal.subtract(
                        toObjectR(this).accessProp(this, env).name("year").value(),
                        ZVal.modulus(
                                ZVal.subtract(
                                        toObjectR(this).accessProp(this, env).name("year").value(),
                                        1),
                                ClassConstantUtils.getConstantValueLateStatic(
                                        env, this, "YEARS_PER_CENTURY")));
        return ZVal.assign(
                env.callMethod(this.setDate(env, year, 1, 1), "startOfDay", Carbon.class));
    }

    @ConvertedMethod
    public Object endOfCentury(RuntimeEnv env, Object... args) {
        Object year = null;
        year =
                ZVal.add(
                        ZVal.subtract(
                                ZVal.subtract(
                                        toObjectR(this).accessProp(this, env).name("year").value(),
                                        1),
                                ZVal.modulus(
                                        ZVal.subtract(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("year")
                                                        .value(),
                                                1),
                                        ClassConstantUtils.getConstantValueLateStatic(
                                                env, this, "YEARS_PER_CENTURY"))),
                        ClassConstantUtils.getConstantValueLateStatic(
                                env, this, "YEARS_PER_CENTURY"));
        return ZVal.assign(
                env.callMethod(this.setDate(env, year, 12, 31), "endOfDay", Carbon.class));
    }

    @ConvertedMethod
    public Object startOfWeek(RuntimeEnv env, Object... args) {
        while (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("dayOfWeek").value(),
                "!==",
                env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Carbon
                                        .classes
                                        .Carbon
                                        .RequestStaticProperties
                                        .class)
                        .weekStartsAt)) {
            this.subDay(env);
        }

        return ZVal.assign(this.startOfDay(env));
    }

    @ConvertedMethod
    public Object endOfWeek(RuntimeEnv env, Object... args) {
        while (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("dayOfWeek").value(),
                "!==",
                env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Carbon
                                        .classes
                                        .Carbon
                                        .RequestStaticProperties
                                        .class)
                        .weekEndsAt)) {
            this.addDay(env);
        }

        return ZVal.assign(this.endOfDay(env));
    }

    @ConvertedMethod
    public Object startOfHour(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this,
                        "setTime",
                        Carbon.class,
                        toObjectR(this).accessProp(this, env).name("hour").value(),
                        0,
                        0));
    }

    @ConvertedMethod
    public Object endOfHour(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this,
                        "setTime",
                        Carbon.class,
                        toObjectR(this).accessProp(this, env).name("hour").value(),
                        59,
                        59));
    }

    @ConvertedMethod
    public Object startOfMinute(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this,
                        "setTime",
                        Carbon.class,
                        toObjectR(this).accessProp(this, env).name("hour").value(),
                        toObjectR(this).accessProp(this, env).name("minute").value(),
                        0));
    }

    @ConvertedMethod
    public Object endOfMinute(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this,
                        "setTime",
                        Carbon.class,
                        toObjectR(this).accessProp(this, env).name("hour").value(),
                        toObjectR(this).accessProp(this, env).name("minute").value(),
                        59));
    }

    @ConvertedMethod
    public Object midDay(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this,
                        "setTime",
                        Carbon.class,
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Carbon
                                                .classes
                                                .Carbon
                                                .RequestStaticProperties
                                                .class)
                                .midDayAt,
                        0,
                        0));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "dayOfWeek",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object next(RuntimeEnv env, Object... args) {
        Object dayOfWeek = assignParameter(args, 0, true);
        if (null == dayOfWeek) {
            dayOfWeek = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(dayOfWeek, "===", ZVal.getNull())) {
            dayOfWeek =
                    ZVal.assign(toObjectR(this).accessProp(this, env).name("dayOfWeek").value());
        }

        return ZVal.assign(
                env.callMethod(
                        this.startOfDay(env),
                        "modify",
                        Carbon.class,
                        "next "
                                + toStringR(
                                        env.getRequestStaticPropertiesReference(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Carbon
                                                                .classes
                                                                .Carbon
                                                                .RequestStaticProperties
                                                                .class,
                                                        "days")
                                                .arrayGet(env, dayOfWeek),
                                        env)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "weekday",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "forward",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    private Object nextOrPreviousDay(RuntimeEnv env, Object... args) {
        Object weekday = assignParameter(args, 0, true);
        if (null == weekday) {
            weekday = true;
        }
        Object forward = assignParameter(args, 1, true);
        if (null == forward) {
            forward = true;
        }
        Object step = null;
        step = ZVal.assign(ZVal.isTrue(forward) ? 1 : -1);
        do {
            this.addDay(env, step);

        } while (ZVal.isTrue(ZVal.isTrue(weekday) ? this.isWeekend(env) : this.isWeekday(env)));

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object nextWeekday(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.nextOrPreviousDay(env));
    }

    @ConvertedMethod
    public Object previousWeekday(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.nextOrPreviousDay(env, true, false));
    }

    @ConvertedMethod
    public Object nextWeekendDay(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.nextOrPreviousDay(env, false));
    }

    @ConvertedMethod
    public Object previousWeekendDay(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.nextOrPreviousDay(env, false, false));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "dayOfWeek",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object previous(RuntimeEnv env, Object... args) {
        Object dayOfWeek = assignParameter(args, 0, true);
        if (null == dayOfWeek) {
            dayOfWeek = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(dayOfWeek, "===", ZVal.getNull())) {
            dayOfWeek =
                    ZVal.assign(toObjectR(this).accessProp(this, env).name("dayOfWeek").value());
        }

        return ZVal.assign(
                env.callMethod(
                        this.startOfDay(env),
                        "modify",
                        Carbon.class,
                        "last "
                                + toStringR(
                                        env.getRequestStaticPropertiesReference(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Carbon
                                                                .classes
                                                                .Carbon
                                                                .RequestStaticProperties
                                                                .class,
                                                        "days")
                                                .arrayGet(env, dayOfWeek),
                                        env)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "dayOfWeek",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object firstOfMonth(RuntimeEnv env, Object... args) {
        Object dayOfWeek = assignParameter(args, 0, true);
        if (null == dayOfWeek) {
            dayOfWeek = ZVal.getNull();
        }
        this.startOfDay(env);
        if (ZVal.strictEqualityCheck(dayOfWeek, "===", ZVal.getNull())) {
            return ZVal.assign(this.day(env, 1));
        }

        return ZVal.assign(
                env.callMethod(
                        this,
                        "modify",
                        Carbon.class,
                        "first "
                                + toStringR(
                                        env.getRequestStaticPropertiesReference(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Carbon
                                                                .classes
                                                                .Carbon
                                                                .RequestStaticProperties
                                                                .class,
                                                        "days")
                                                .arrayGet(env, dayOfWeek),
                                        env)
                                + " of "
                                + toStringR(env.callMethod(this, "format", Carbon.class, "F"), env)
                                + " "
                                + toStringR(
                                        toObjectR(this).accessProp(this, env).name("year").value(),
                                        env)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "dayOfWeek",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object lastOfMonth(RuntimeEnv env, Object... args) {
        Object dayOfWeek = assignParameter(args, 0, true);
        if (null == dayOfWeek) {
            dayOfWeek = ZVal.getNull();
        }
        this.startOfDay(env);
        if (ZVal.strictEqualityCheck(dayOfWeek, "===", ZVal.getNull())) {
            return ZVal.assign(
                    this.day(
                            env,
                            toObjectR(this).accessProp(this, env).name("daysInMonth").value()));
        }

        return ZVal.assign(
                env.callMethod(
                        this,
                        "modify",
                        Carbon.class,
                        "last "
                                + toStringR(
                                        env.getRequestStaticPropertiesReference(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Carbon
                                                                .classes
                                                                .Carbon
                                                                .RequestStaticProperties
                                                                .class,
                                                        "days")
                                                .arrayGet(env, dayOfWeek),
                                        env)
                                + " of "
                                + toStringR(env.callMethod(this, "format", Carbon.class, "F"), env)
                                + " "
                                + toStringR(
                                        toObjectR(this).accessProp(this, env).name("year").value(),
                                        env)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nth")
    @ConvertedParameter(index = 1, name = "dayOfWeek")
    public Object nthOfMonth(RuntimeEnv env, Object... args) {
        Object nth = assignParameter(args, 0, false);
        Object dayOfWeek = assignParameter(args, 1, false);
        Object date = null;
        Object check = null;
        date = env.callMethod(this.copy(env), "firstOfMonth", Carbon.class);
        check = env.callMethod(date, "format", Carbon.class, "Y-m");
        env.callMethod(
                date,
                "modify",
                Carbon.class,
                "+"
                        + toStringR(nth, env)
                        + " "
                        + toStringR(
                                env.getRequestStaticPropertiesReference(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Carbon
                                                        .classes
                                                        .Carbon
                                                        .RequestStaticProperties
                                                        .class,
                                                "days")
                                        .arrayGet(env, dayOfWeek),
                                env));
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                                env.callMethod(date, "format", Carbon.class, "Y-m"), "===", check)
                        ? env.callMethod(this, "modify", Carbon.class, date)
                        : false);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "dayOfWeek",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object firstOfQuarter(RuntimeEnv env, Object... args) {
        Object dayOfWeek = assignParameter(args, 0, true);
        if (null == dayOfWeek) {
            dayOfWeek = ZVal.getNull();
        }
        return ZVal.assign(
                env.callMethod(
                        this.setDate(
                                env,
                                toObjectR(this).accessProp(this, env).name("year").value(),
                                ZVal.subtract(
                                        ZVal.multiply(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("quarter")
                                                        .value(),
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "MONTHS_PER_QUARTER")),
                                        2),
                                1),
                        "firstOfMonth",
                        Carbon.class,
                        dayOfWeek));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "dayOfWeek",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object lastOfQuarter(RuntimeEnv env, Object... args) {
        Object dayOfWeek = assignParameter(args, 0, true);
        if (null == dayOfWeek) {
            dayOfWeek = ZVal.getNull();
        }
        return ZVal.assign(
                env.callMethod(
                        this.setDate(
                                env,
                                toObjectR(this).accessProp(this, env).name("year").value(),
                                ZVal.multiply(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("quarter")
                                                .value(),
                                        ClassConstantUtils.getConstantValueLateStatic(
                                                env, this, "MONTHS_PER_QUARTER")),
                                1),
                        "lastOfMonth",
                        Carbon.class,
                        dayOfWeek));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nth")
    @ConvertedParameter(index = 1, name = "dayOfWeek")
    public Object nthOfQuarter(RuntimeEnv env, Object... args) {
        Object nth = assignParameter(args, 0, false);
        Object dayOfWeek = assignParameter(args, 1, false);
        Object date = null;
        Object year = null;
        Object lastMonth = null;
        date =
                env.callMethod(
                        env.callMethod(this.copy(env), "day", Carbon.class, 1),
                        "month",
                        Carbon.class,
                        ZVal.multiply(
                                toObjectR(this).accessProp(this, env).name("quarter").value(),
                                ClassConstantUtils.getConstantValueLateStatic(
                                        env, this, "MONTHS_PER_QUARTER")));
        lastMonth = ZVal.assign(toObjectR(date).accessProp(this, env).name("month").value());
        year = ZVal.assign(toObjectR(date).accessProp(this, env).name("year").value());
        env.callMethod(
                env.callMethod(date, "firstOfQuarter", Carbon.class),
                "modify",
                Carbon.class,
                "+"
                        + toStringR(nth, env)
                        + " "
                        + toStringR(
                                env.getRequestStaticPropertiesReference(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Carbon
                                                        .classes
                                                        .Carbon
                                                        .RequestStaticProperties
                                                        .class,
                                                "days")
                                        .arrayGet(env, dayOfWeek),
                                env));
        return ZVal.assign(
                ZVal.toBool(
                                        ZVal.isLessThan(
                                                lastMonth,
                                                '<',
                                                toObjectR(date)
                                                        .accessProp(this, env)
                                                        .name("month")
                                                        .value()))
                                || ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                year,
                                                "!==",
                                                toObjectR(date)
                                                        .accessProp(this, env)
                                                        .name("year")
                                                        .value()))
                        ? false
                        : env.callMethod(this, "modify", Carbon.class, date));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "dayOfWeek",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object firstOfYear(RuntimeEnv env, Object... args) {
        Object dayOfWeek = assignParameter(args, 0, true);
        if (null == dayOfWeek) {
            dayOfWeek = ZVal.getNull();
        }
        return ZVal.assign(
                env.callMethod(this.month(env, 1), "firstOfMonth", Carbon.class, dayOfWeek));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "dayOfWeek",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object lastOfYear(RuntimeEnv env, Object... args) {
        Object dayOfWeek = assignParameter(args, 0, true);
        if (null == dayOfWeek) {
            dayOfWeek = ZVal.getNull();
        }
        return ZVal.assign(
                env.callMethod(
                        this.month(
                                env,
                                ClassConstantUtils.getConstantValueLateStatic(
                                        env, this, "MONTHS_PER_YEAR")),
                        "lastOfMonth",
                        Carbon.class,
                        dayOfWeek));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nth")
    @ConvertedParameter(index = 1, name = "dayOfWeek")
    public Object nthOfYear(RuntimeEnv env, Object... args) {
        Object nth = assignParameter(args, 0, false);
        Object dayOfWeek = assignParameter(args, 1, false);
        Object date = null;
        date =
                env.callMethod(
                        env.callMethod(this.copy(env), "firstOfYear", Carbon.class),
                        "modify",
                        Carbon.class,
                        "+"
                                + toStringR(nth, env)
                                + " "
                                + toStringR(
                                        env.getRequestStaticPropertiesReference(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Carbon
                                                                .classes
                                                                .Carbon
                                                                .RequestStaticProperties
                                                                .class,
                                                        "days")
                                                .arrayGet(env, dayOfWeek),
                                        env));
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                                toObjectR(this).accessProp(this, env).name("year").value(),
                                "===",
                                toObjectR(date).accessProp(this, env).name("year").value())
                        ? env.callMethod(this, "modify", Carbon.class, date)
                        : false);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "date",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object average(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, true);
        if (null == date) {
            date = ZVal.getNull();
        }
        return ZVal.assign(
                this.addSeconds(
                        env,
                        ZVal.toLong(
                                ZVal.divide(
                                        this.diffInSeconds(
                                                env, this.resolveCarbon(env, date), false),
                                        2))));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "date",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object isBirthday(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, true);
        if (null == date) {
            date = ZVal.getNull();
        }
        return ZVal.assign(this.isSameAs(env, "md", date));
    }

    @ConvertedMethod
    public Object isLastOfMonth(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        toObjectR(this).accessProp(this, env).name("day").value(),
                        "===",
                        toObjectR(this).accessProp(this, env).name("daysInMonth").value()));
    }

    @ConvertedMethod
    public Object serialize(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_serialize.f.env(env).call(this).value());
    }

    public static final Object CONST_SUNDAY = 0;

    public static final Object CONST_MONDAY = 1;

    public static final Object CONST_TUESDAY = 2;

    public static final Object CONST_WEDNESDAY = 3;

    public static final Object CONST_THURSDAY = 4;

    public static final Object CONST_FRIDAY = 5;

    public static final Object CONST_SATURDAY = 6;

    public static final Object CONST_YEARS_PER_CENTURY = 100;

    public static final Object CONST_YEARS_PER_DECADE = 10;

    public static final Object CONST_MONTHS_PER_YEAR = 12;

    public static final Object CONST_MONTHS_PER_QUARTER = 3;

    public static final Object CONST_WEEKS_PER_YEAR = 52;

    public static final Object CONST_DAYS_PER_WEEK = 7;

    public static final Object CONST_HOURS_PER_DAY = 24;

    public static final Object CONST_MINUTES_PER_HOUR = 60;

    public static final Object CONST_SECONDS_PER_MINUTE = 60;

    public static final Object CONST_RFC7231_FORMAT = "D, d M Y H:i:s \\G\\M\\T";

    public static final Object CONST_DEFAULT_TO_STRING_FORMAT = "Y-m-d H:i:s";

    public static final Object CONST_MOCK_DATETIME_FORMAT = "Y-m-d H:i:s.u";

    public static final Object CONST_class = "Carbon\\Carbon";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends DateTime.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "microsecondsFallback",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        public Object useMicrosecondsFallback(RuntimeEnv env, Object... args) {
            Object microsecondsFallback = assignParameter(args, 0, true);
            if (null == microsecondsFallback) {
                microsecondsFallback = true;
            }
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Carbon
                                            .classes
                                            .Carbon
                                            .RequestStaticProperties
                                            .class)
                            .microsecondsFallback =
                    microsecondsFallback;
            return null;
        }

        @ConvertedMethod
        public Object isMicrosecondsFallbackEnabled(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Carbon
                                            .classes
                                            .Carbon
                                            .RequestStaticProperties
                                            .class)
                            .microsecondsFallback);
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "monthsOverflow",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        public Object useMonthsOverflow(RuntimeEnv env, Object... args) {
            Object monthsOverflow = assignParameter(args, 0, true);
            if (null == monthsOverflow) {
                monthsOverflow = true;
            }
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Carbon
                                            .classes
                                            .Carbon
                                            .RequestStaticProperties
                                            .class)
                            .monthsOverflow =
                    monthsOverflow;
            return null;
        }

        @ConvertedMethod
        public Object resetMonthsOverflow(RuntimeEnv env, Object... args) {
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Carbon
                                            .classes
                                            .Carbon
                                            .RequestStaticProperties
                                            .class)
                            .monthsOverflow =
                    true;
            return null;
        }

        @ConvertedMethod
        public Object shouldOverflowMonths(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Carbon
                                            .classes
                                            .Carbon
                                            .RequestStaticProperties
                                            .class)
                            .monthsOverflow);
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "yearsOverflow",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        public Object useYearsOverflow(RuntimeEnv env, Object... args) {
            Object yearsOverflow = assignParameter(args, 0, true);
            if (null == yearsOverflow) {
                yearsOverflow = true;
            }
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Carbon
                                            .classes
                                            .Carbon
                                            .RequestStaticProperties
                                            .class)
                            .yearsOverflow =
                    yearsOverflow;
            return null;
        }

        @ConvertedMethod
        public Object resetYearsOverflow(RuntimeEnv env, Object... args) {
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Carbon
                                            .classes
                                            .Carbon
                                            .RequestStaticProperties
                                            .class)
                            .yearsOverflow =
                    true;
            return null;
        }

        @ConvertedMethod
        public Object shouldOverflowYears(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Carbon
                                            .classes
                                            .Carbon
                                            .RequestStaticProperties
                                            .class)
                            .yearsOverflow);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "object")
        protected Object safeCreateDateTimeZone(RuntimeEnv env, Object... args) {
            Object _object = assignParameter(args, 0, false);
            Object tz = null;
            Object tzName = null;
            if (ZVal.strictEqualityCheck(_object, "===", ZVal.getNull())) {
                return ZVal.assign(
                        new DateTimeZone(
                                env,
                                NamespaceGlobal.date_default_timezone_get.env(env).call().value()));
            }

            if (ZVal.isTrue(ZVal.checkInstanceType(_object, DateTimeZone.class, "DateTimeZone"))) {
                return ZVal.assign(_object);
            }

            if (function_is_numeric.f.env(env).call(_object).getBool()) {
                tzName =
                        NamespaceGlobal.timezone_name_from_abbr
                                .env(env)
                                .call(ZVal.getNull(), ZVal.multiply(_object, 3600), true)
                                .value();
                if (ZVal.strictEqualityCheck(tzName, "===", false)) {
                    throw ZVal.getException(
                            env,
                            new InvalidArgumentException(
                                    env,
                                    "Unknown or bad timezone (" + toStringR(_object, env) + ")"));
                }

                _object = ZVal.assign(tzName);
            }

            tz = NamespaceGlobal.timezone_open.env(env).call(toStringR(_object, env)).value();
            if (ZVal.strictEqualityCheck(tz, "===", false)) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env, "Unknown or bad timezone (" + toStringR(_object, env) + ")"));
            }

            return ZVal.assign(tz);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "date", typeHint = "DateTime")
        public Object instance(RuntimeEnv env, Object... args) {
            Object date = assignParameter(args, 0, false);
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            date,
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Carbon
                                    .classes
                                    .Carbon
                                    .class,
                            "Carbon\\Carbon"))) {
                return ZVal.assign(((RuntimeClassInterface) date).phpClone(env));
            }

            return ZVal.assign(
                    env.createNewWithLateStaticBindings(
                            this,
                            env.callMethod(date, "format", Carbon.class, "Y-m-d H:i:s.u"),
                            env.callMethod(date, "getTimezone", Carbon.class)));
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "time",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 1,
            name = "tz",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object parse(RuntimeEnv env, Object... args) {
            Object time = assignParameter(args, 0, true);
            if (null == time) {
                time = ZVal.getNull();
            }
            Object tz = assignParameter(args, 1, true);
            if (null == tz) {
                tz = ZVal.getNull();
            }
            return ZVal.assign(env.createNewWithLateStaticBindings(this, time, tz));
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "tz",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object now(RuntimeEnv env, Object... args) {
            Object tz = assignParameter(args, 0, true);
            if (null == tz) {
                tz = ZVal.getNull();
            }
            return ZVal.assign(env.createNewWithLateStaticBindings(this, ZVal.getNull(), tz));
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "tz",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object today(RuntimeEnv env, Object... args) {
            Object tz = assignParameter(args, 0, true);
            if (null == tz) {
                tz = ZVal.getNull();
            }
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                            .method("parse")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call("today", tz)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "tz",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object tomorrow(RuntimeEnv env, Object... args) {
            Object tz = assignParameter(args, 0, true);
            if (null == tz) {
                tz = ZVal.getNull();
            }
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                            .method("parse")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call("tomorrow", tz)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "tz",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object yesterday(RuntimeEnv env, Object... args) {
            Object tz = assignParameter(args, 0, true);
            if (null == tz) {
                tz = ZVal.getNull();
            }
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                            .method("parse")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call("yesterday", tz)
                            .value());
        }

        @ConvertedMethod
        public Object maxValue(RuntimeEnv env, Object... args) {
            if (ZVal.strictEqualityCheck(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Carbon
                                            .classes
                                            .Carbon
                                            .RequestStaticProperties
                                            .class)
                            .PHPIntSize,
                    "===",
                    4)) {
                return ZVal.assign(
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                                .method("createFromTimestamp")
                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                .call(9223372036854775807L)
                                .value());
            }

            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                            .method("create")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(9999, 12, 31, 23, 59, 59)
                            .value());
        }

        @ConvertedMethod
        public Object minValue(RuntimeEnv env, Object... args) {
            if (ZVal.strictEqualityCheck(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Carbon
                                            .classes
                                            .Carbon
                                            .RequestStaticProperties
                                            .class)
                            .PHPIntSize,
                    "===",
                    4)) {
                return ZVal.assign(
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                                .method("createFromTimestamp")
                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                .call(~ZVal.toLong(9223372036854775807L))
                                .value());
            }

            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                            .method("create")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(1, 1, 1, 0, 0, 0)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "year",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 1,
            name = "month",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 2,
            name = "day",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 3,
            name = "hour",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 4,
            name = "minute",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 5,
            name = "second",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 6,
            name = "tz",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object create(RuntimeEnv env, Object... args) {
            Object year = assignParameter(args, 0, true);
            if (null == year) {
                year = ZVal.getNull();
            }
            Object month = assignParameter(args, 1, true);
            if (null == month) {
                month = ZVal.getNull();
            }
            Object day = assignParameter(args, 2, true);
            if (null == day) {
                day = ZVal.getNull();
            }
            Object hour = assignParameter(args, 3, true);
            if (null == hour) {
                hour = ZVal.getNull();
            }
            Object minute = assignParameter(args, 4, true);
            if (null == minute) {
                minute = ZVal.getNull();
            }
            Object second = assignParameter(args, 5, true);
            if (null == second) {
                second = ZVal.getNull();
            }
            Object tz = assignParameter(args, 6, true);
            if (null == tz) {
                tz = ZVal.getNull();
            }
            Object instance = null;
            ReferenceContainer defaults = new BasicReferenceContainer(null);
            Object now = null;
            Object fixYear = null;
            now =
                    ZVal.assign(
                            ZVal.isTrue(
                                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                                            env, this, Carbon.class)
                                                    .method("hasTestNow")
                                                    .call()
                                                    .value())
                                    ? StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Carbon.class)
                                            .method("getTestNow")
                                            .call()
                                            .value()
                                    : StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Carbon.class)
                                            .method("now")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(tz)
                                            .value());
            defaults.setObject(
                    function_array_combine
                            .f
                            .env(env)
                            .call(
                                    ZVal.arrayFromList(
                                            "year", "month", "day", "hour", "minute", "second"),
                                    function_explode
                                            .f
                                            .env(env)
                                            .call(
                                                    "-",
                                                    env.callMethod(
                                                            now,
                                                            "format",
                                                            Carbon.class,
                                                            "Y-n-j-G-i-s"))
                                            .value())
                            .value());
            year =
                    ZVal.assign(
                            ZVal.strictEqualityCheck(year, "===", ZVal.getNull())
                                    ? defaults.arrayGet(env, "year")
                                    : year);
            month =
                    ZVal.assign(
                            ZVal.strictEqualityCheck(month, "===", ZVal.getNull())
                                    ? defaults.arrayGet(env, "month")
                                    : month);
            day =
                    ZVal.assign(
                            ZVal.strictEqualityCheck(day, "===", ZVal.getNull())
                                    ? defaults.arrayGet(env, "day")
                                    : day);
            if (ZVal.strictEqualityCheck(hour, "===", ZVal.getNull())) {
                hour = ZVal.assign(defaults.arrayGet(env, "hour"));
                minute =
                        ZVal.assign(
                                ZVal.strictEqualityCheck(minute, "===", ZVal.getNull())
                                        ? defaults.arrayGet(env, "minute")
                                        : minute);
                second =
                        ZVal.assign(
                                ZVal.strictEqualityCheck(second, "===", ZVal.getNull())
                                        ? defaults.arrayGet(env, "second")
                                        : second);

            } else {
                minute =
                        ZVal.assign(
                                ZVal.strictEqualityCheck(minute, "===", ZVal.getNull())
                                        ? 0
                                        : minute);
                second =
                        ZVal.assign(
                                ZVal.strictEqualityCheck(second, "===", ZVal.getNull())
                                        ? 0
                                        : second);
            }

            fixYear = ZVal.getNull();
            if (ZVal.isLessThan(year, '<', 0)) {
                fixYear = ZVal.assign(year);
                year = 0;

            } else if (ZVal.isGreaterThan(year, '>', 9999)) {
                fixYear = ZVal.subtract(year, 9999);
                year = 9999;
            }

            instance =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                            .method("createFromFormat")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    "Y-n-j G:i:s",
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "%s-%s-%s %s:%02s:%02s",
                                                    year, month, day, hour, minute, second)
                                            .value(),
                                    tz)
                            .value();
            if (ZVal.strictNotEqualityCheck(fixYear, "!==", ZVal.getNull())) {
                env.callMethod(instance, "addYears", Carbon.class, fixYear);
            }

            return ZVal.assign(instance);
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "year",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 1,
            name = "month",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 2,
            name = "day",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 3,
            name = "hour",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 4,
            name = "minute",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 5,
            name = "second",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 6,
            name = "tz",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object createSafe(RuntimeEnv env, Object... args) {
            RuntimeStack stack = new RuntimeStack();
            stack.setupGlobals(env);
            Scope44 scope = new Scope44();
            stack.pushScope(scope);
            try {
                ContextConstants runtimeConverterFunctionClassConstants =
                        new ContextConstants()
                                .setDir("/vendor/nesbot/carbon/src/Carbon")
                                .setFile("/vendor/nesbot/carbon/src/Carbon/Carbon.php");
                scope.year = assignParameter(args, 0, true);
                if (null == scope.year) {
                    scope.year = ZVal.getNull();
                }
                scope.month = assignParameter(args, 1, true);
                if (null == scope.month) {
                    scope.month = ZVal.getNull();
                }
                scope.day = assignParameter(args, 2, true);
                if (null == scope.day) {
                    scope.day = ZVal.getNull();
                }
                scope.hour = assignParameter(args, 3, true);
                if (null == scope.hour) {
                    scope.hour = ZVal.getNull();
                }
                scope.minute = assignParameter(args, 4, true);
                if (null == scope.minute) {
                    scope.minute = ZVal.getNull();
                }
                scope.second = assignParameter(args, 5, true);
                if (null == scope.second) {
                    scope.second = ZVal.getNull();
                }
                scope.tz = assignParameter(args, 6, true);
                if (null == scope.tz) {
                    scope.tz = ZVal.getNull();
                }
                scope.instance = null;
                scope.field = null;
                scope.range = new BasicReferenceContainer(null);
                scope.fields = null;
                scope.fields =
                        ZVal.newArray(
                                new ZPair("year", ZVal.arrayFromList(0, 9999)),
                                new ZPair("month", ZVal.arrayFromList(0, 12)),
                                new ZPair("day", ZVal.arrayFromList(0, 31)),
                                new ZPair("hour", ZVal.arrayFromList(0, 24)),
                                new ZPair("minute", ZVal.arrayFromList(0, 59)),
                                new ZPair("second", ZVal.arrayFromList(0, 59)));
                for (ZPair zpairResult831 : ZVal.getIterable(scope.fields, env, false)) {
                    scope.field = ZVal.assign(zpairResult831.getKey());
                    scope.range.setObject(ZVal.assign(zpairResult831.getValue()));
                    if (ZVal.toBool(
                                    ZVal.strictNotEqualityCheck(
                                            stack.getVariableVariable(scope, scope.field, false),
                                            "!==",
                                            ZVal.getNull()))
                            && ZVal.toBool(
                                    ZVal.toBool(
                                                    ZVal.toBool(
                                                                    !function_is_int
                                                                            .f
                                                                            .env(env)
                                                                            .call(
                                                                                    stack
                                                                                            .getVariableVariable(
                                                                                                    scope,
                                                                                                    scope.field,
                                                                                                    false))
                                                                            .getBool())
                                                            || ZVal.toBool(
                                                                    ZVal.isLessThan(
                                                                            stack
                                                                                    .getVariableVariable(
                                                                                            scope,
                                                                                            scope.field,
                                                                                            false),
                                                                            '<',
                                                                            scope.range.arrayGet(
                                                                                    env, 0))))
                                            || ZVal.toBool(
                                                    ZVal.isGreaterThan(
                                                            stack.getVariableVariable(
                                                                    scope, scope.field, false),
                                                            '>',
                                                            scope.range.arrayGet(env, 1))))) {
                        throw ZVal.getException(
                                env,
                                new InvalidDateException(
                                        env,
                                        scope.field,
                                        stack.getVariableVariable(scope, scope.field, false)));
                    }
                }

                scope.instance =
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                                .method("create")
                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                .call(
                                        scope.year,
                                        scope.month,
                                        scope.day,
                                        scope.hour,
                                        scope.minute,
                                        scope.second,
                                        scope.tz)
                                .value();
                for (ZPair zpairResult832 :
                        ZVal.getIterable(
                                function_array_reverse.f.env(env).call(scope.fields).value(),
                                env,
                                false)) {
                    scope.field = ZVal.assign(zpairResult832.getKey());
                    scope.range.setObject(ZVal.assign(zpairResult832.getValue()));
                    if (ZVal.toBool(
                                    ZVal.strictNotEqualityCheck(
                                            stack.getVariableVariable(scope, scope.field, false),
                                            "!==",
                                            ZVal.getNull()))
                            && ZVal.toBool(
                                    ZVal.toBool(
                                                    !function_is_int
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    stack.getVariableVariable(
                                                                            scope,
                                                                            scope.field,
                                                                            false))
                                                            .getBool())
                                            || ZVal.toBool(
                                                    ZVal.strictNotEqualityCheck(
                                                            stack.getVariableVariable(
                                                                    scope, scope.field, false),
                                                            "!==",
                                                            toObjectR(scope.instance)
                                                                    .accessProp(this, env)
                                                                    .name(scope.field)
                                                                    .value())))) {
                        throw ZVal.getException(
                                env,
                                new InvalidDateException(
                                        env,
                                        scope.field,
                                        stack.getVariableVariable(scope, scope.field, false)));
                    }
                }

                throw new IncludeEventException(ZVal.assign(scope.instance));
            } catch (IncludeEventException runtimeConverterIncludeException) {
                return runtimeConverterIncludeException.returnValue;
            }
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "year",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 1,
            name = "month",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 2,
            name = "day",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 3,
            name = "tz",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object createFromDate(RuntimeEnv env, Object... args) {
            Object year = assignParameter(args, 0, true);
            if (null == year) {
                year = ZVal.getNull();
            }
            Object month = assignParameter(args, 1, true);
            if (null == month) {
                month = ZVal.getNull();
            }
            Object day = assignParameter(args, 2, true);
            if (null == day) {
                day = ZVal.getNull();
            }
            Object tz = assignParameter(args, 3, true);
            if (null == tz) {
                tz = ZVal.getNull();
            }
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                            .method("create")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    year,
                                    month,
                                    day,
                                    ZVal.getNull(),
                                    ZVal.getNull(),
                                    ZVal.getNull(),
                                    tz)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "year",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 1,
            name = "month",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 2,
            name = "day",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 3,
            name = "tz",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object createMidnightDate(RuntimeEnv env, Object... args) {
            Object year = assignParameter(args, 0, true);
            if (null == year) {
                year = ZVal.getNull();
            }
            Object month = assignParameter(args, 1, true);
            if (null == month) {
                month = ZVal.getNull();
            }
            Object day = assignParameter(args, 2, true);
            if (null == day) {
                day = ZVal.getNull();
            }
            Object tz = assignParameter(args, 3, true);
            if (null == tz) {
                tz = ZVal.getNull();
            }
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                            .method("create")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(year, month, day, 0, 0, 0, tz)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "hour",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 1,
            name = "minute",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 2,
            name = "second",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 3,
            name = "tz",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object createFromTime(RuntimeEnv env, Object... args) {
            Object hour = assignParameter(args, 0, true);
            if (null == hour) {
                hour = ZVal.getNull();
            }
            Object minute = assignParameter(args, 1, true);
            if (null == minute) {
                minute = ZVal.getNull();
            }
            Object second = assignParameter(args, 2, true);
            if (null == second) {
                second = ZVal.getNull();
            }
            Object tz = assignParameter(args, 3, true);
            if (null == tz) {
                tz = ZVal.getNull();
            }
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                            .method("create")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    ZVal.getNull(),
                                    ZVal.getNull(),
                                    ZVal.getNull(),
                                    hour,
                                    minute,
                                    second,
                                    tz)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "time")
        @ConvertedParameter(
            index = 1,
            name = "tz",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object createFromTimeString(RuntimeEnv env, Object... args) {
            Object time = assignParameter(args, 0, false);
            Object tz = assignParameter(args, 1, true);
            if (null == tz) {
                tz = ZVal.getNull();
            }
            return ZVal.assign(
                    env.callMethod(
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                                    .method("today")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(tz)
                                    .value(),
                            "setTimeFromTimeString",
                            Carbon.class,
                            time));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "format")
        @ConvertedParameter(index = 1, name = "time")
        @ConvertedParameter(
            index = 2,
            name = "tz",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object createFromFormat(RuntimeEnv env, Object... args) {
            Object format = assignParameter(args, 0, false);
            Object time = assignParameter(args, 1, false);
            Object tz = assignParameter(args, 2, true);
            if (null == tz) {
                tz = ZVal.getNull();
            }
            Object date = null;
            Object instance = null;
            ReferenceContainer lastErrors = new BasicReferenceContainer(null);
            if (ZVal.strictNotEqualityCheck(tz, "!==", ZVal.getNull())) {
                date =
                        DateTime.runtimeStaticObject.createFromFormat(
                                env,
                                format,
                                time,
                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, Carbon.class)
                                        .method("safeCreateDateTimeZone")
                                        .addReferenceArgs(new RuntimeArgsWithReferences())
                                        .call(tz)
                                        .value());

            } else {
                date = DateTime.runtimeStaticObject.createFromFormat(env, format, time);
            }

            lastErrors.setObject(DateTime.runtimeStaticObject.getLastErrors(env));
            if (ZVal.isTrue(ZVal.checkInstanceType(date, DateTime.class, "DateTime"))) {
                instance =
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                                .method("instance")
                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                .call(date)
                                .value();
                StaticMethodUtils.getStaticBaseClass(instance, env)
                        .callUnknownStaticMethod(
                                env,
                                "setLastErrors",
                                new RuntimeArgsWithReferences().add(0, lastErrors),
                                lastErrors.getObject());
                return ZVal.assign(instance);
            }

            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            NamespaceGlobal.implode
                                    .env(env)
                                    .call("\n", lastErrors.arrayGet(env, "errors"))
                                    .value()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "lastErrors", typeHint = "array")
        private Object setLastErrors(RuntimeEnv env, Object... args) {
            Object lastErrors = assignParameter(args, 0, false);
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Carbon
                                            .classes
                                            .Carbon
                                            .RequestStaticProperties
                                            .class)
                            .lastErrors =
                    lastErrors;
            return null;
        }

        @ConvertedMethod
        public Object getLastErrors(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Carbon
                                            .classes
                                            .Carbon
                                            .RequestStaticProperties
                                            .class)
                            .lastErrors);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "timestamp")
        @ConvertedParameter(
            index = 1,
            name = "tz",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object createFromTimestamp(RuntimeEnv env, Object... args) {
            Object timestamp = assignParameter(args, 0, false);
            Object tz = assignParameter(args, 1, true);
            if (null == tz) {
                tz = ZVal.getNull();
            }
            return ZVal.assign(
                    env.callMethod(
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                                    .method("today")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(tz)
                                    .value(),
                            "setTimestamp",
                            Carbon.class,
                            timestamp));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "timestamp")
        @ConvertedParameter(
            index = 1,
            name = "tz",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object createFromTimestampMs(RuntimeEnv env, Object... args) {
            Object timestamp = assignParameter(args, 0, false);
            Object tz = assignParameter(args, 1, true);
            if (null == tz) {
                tz = ZVal.getNull();
            }
            return ZVal.assign(
                    env.callMethod(
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                                    .method("createFromFormat")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(
                                            "U.u",
                                            function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call("%F", ZVal.divide(timestamp, 1000))
                                                    .value())
                                    .value(),
                            "setTimezone",
                            Carbon.class,
                            tz));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "timestamp")
        public Object createFromTimestampUTC(RuntimeEnv env, Object... args) {
            Object timestamp = assignParameter(args, 0, false);
            return ZVal.assign(
                    env.createNewWithLateStaticBindings(this, "@" + toStringR(timestamp, env)));
        }

        @ConvertedMethod
        public Object getDays(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Carbon
                                            .classes
                                            .Carbon
                                            .RequestStaticProperties
                                            .class)
                            .days);
        }

        @ConvertedMethod
        public Object getWeekStartsAt(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Carbon
                                            .classes
                                            .Carbon
                                            .RequestStaticProperties
                                            .class)
                            .weekStartsAt);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "day")
        public Object setWeekStartsAt(RuntimeEnv env, Object... args) {
            Object day = assignParameter(args, 0, false);
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Carbon
                                            .classes
                                            .Carbon
                                            .RequestStaticProperties
                                            .class)
                            .weekStartsAt =
                    day;
            return null;
        }

        @ConvertedMethod
        public Object getWeekEndsAt(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Carbon
                                            .classes
                                            .Carbon
                                            .RequestStaticProperties
                                            .class)
                            .weekEndsAt);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "day")
        public Object setWeekEndsAt(RuntimeEnv env, Object... args) {
            Object day = assignParameter(args, 0, false);
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Carbon
                                            .classes
                                            .Carbon
                                            .RequestStaticProperties
                                            .class)
                            .weekEndsAt =
                    day;
            return null;
        }

        @ConvertedMethod
        public Object getWeekendDays(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Carbon
                                            .classes
                                            .Carbon
                                            .RequestStaticProperties
                                            .class)
                            .weekendDays);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "days")
        public Object setWeekendDays(RuntimeEnv env, Object... args) {
            Object days = assignParameter(args, 0, false);
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Carbon
                                            .classes
                                            .Carbon
                                            .RequestStaticProperties
                                            .class)
                            .weekendDays =
                    days;
            return null;
        }

        @ConvertedMethod
        public Object getMidDayAt(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Carbon
                                            .classes
                                            .Carbon
                                            .RequestStaticProperties
                                            .class)
                            .midDayAt);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "hour")
        public Object setMidDayAt(RuntimeEnv env, Object... args) {
            Object hour = assignParameter(args, 0, false);
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Carbon
                                            .classes
                                            .Carbon
                                            .RequestStaticProperties
                                            .class)
                            .midDayAt =
                    hour;
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "testNow",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object setTestNow(RuntimeEnv env, Object... args) {
            Object testNow = assignParameter(args, 0, true);
            if (null == testNow) {
                testNow = ZVal.getNull();
            }
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Carbon
                                            .classes
                                            .Carbon
                                            .RequestStaticProperties
                                            .class)
                            .testNow =
                    function_is_string.f.env(env).call(testNow).getBool()
                            ? StaticMethodUtils.accessUnknownLateStaticMethod(
                                            env, this, Carbon.class)
                                    .method("parse")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(testNow)
                                    .value()
                            : testNow;
            return null;
        }

        @ConvertedMethod
        public Object getTestNow(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Carbon
                                            .classes
                                            .Carbon
                                            .RequestStaticProperties
                                            .class)
                            .testNow);
        }

        @ConvertedMethod
        public Object hasTestNow(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    ZVal.strictNotEqualityCheck(
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                                    .method("getTestNow")
                                    .call()
                                    .value(),
                            "!==",
                            ZVal.getNull()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "time")
        public Object hasRelativeKeywords(RuntimeEnv env, Object... args) {
            Object time = assignParameter(args, 0, false);
            Object date2 = null;
            Object date1 = null;
            if (ZVal.strictEqualityCheck(
                    NamespaceGlobal.strtotime.env(env).call(time).value(), "===", false)) {
                return ZVal.assign(false);
            }

            date1 = new DateTime(env, "2000-01-01T00:00:00Z");
            env.callMethod(date1, "modify", Carbon.class, time);
            date2 = new DateTime(env, "2001-12-25T00:00:00Z");
            env.callMethod(date2, "modify", Carbon.class, time);
            return ZVal.assign(ZVal.notEqualityCheck(date1, date2));
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
                                            .Carbon
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
                                                .Carbon
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
                                            .Carbon
                                            .RequestStaticProperties
                                            .class)
                            .translator);
        }

        @ConvertedMethod
        public Object getTranslator(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
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
                                            .Carbon
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
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                                    .method("translator")
                                    .call()
                                    .value(),
                            "getLocale",
                            Carbon.class));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "locale")
        public Object setLocale(RuntimeEnv env, Object... args) {
            Object locale = assignParameter(args, 0, false);
            return ZVal.assign(
                    ZVal.strictNotEqualityCheck(
                            env.callMethod(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Carbon.class)
                                            .method("translator")
                                            .call()
                                            .value(),
                                    "setLocale",
                                    Carbon.class,
                                    locale),
                            "!==",
                            false));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "utf8")
        public Object setUtf8(RuntimeEnv env, Object... args) {
            Object utf8 = assignParameter(args, 0, false);
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Carbon
                                            .classes
                                            .Carbon
                                            .RequestStaticProperties
                                            .class)
                            .utf8 =
                    utf8;
            return null;
        }

        @ConvertedMethod
        public Object resetToStringFormat(RuntimeEnv env, Object... args) {
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                    .method("setToStringFormat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            ClassConstantUtils.getConstantValueLateStatic(
                                    env, this, "DEFAULT_TO_STRING_FORMAT"))
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "format")
        public Object setToStringFormat(RuntimeEnv env, Object... args) {
            Object format = assignParameter(args, 0, false);
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Carbon
                                            .classes
                                            .Carbon
                                            .RequestStaticProperties
                                            .class)
                            .toStringFormat =
                    format;
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "date")
        @ConvertedParameter(index = 1, name = "format")
        public Object hasFormat(RuntimeEnv env, Object... args) {
            Object date = assignParameter(args, 0, false);
            Object format = assignParameter(args, 1, false);
            Object regex = null;
            Object e = null;
            try {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                        .method("createFromFormat")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(format, date)
                        .value();
                regex =
                        NamespaceGlobal.strtr
                                .env(env)
                                .call(
                                        NamespaceGlobal.preg_quote
                                                .env(env)
                                                .call(format, "/")
                                                .value(),
                                        env.getRequestStaticProperties(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Carbon
                                                                .classes
                                                                .Carbon
                                                                .RequestStaticProperties
                                                                .class)
                                                .regexFormats)
                                .value();
                return ZVal.assign(
                        ZVal.toBool(
                                function_preg_match
                                        .f
                                        .env(env)
                                        .call("/^" + toStringR(regex, env) + "$/", date)
                                        .value()));
            } catch (ConvertedException convertedException95) {
                if (convertedException95.instanceOf(
                        InvalidArgumentException.class, "InvalidArgumentException")) {
                    e = convertedException95.getObject();
                } else {
                    throw convertedException95;
                }
            }

            return ZVal.assign(false);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object fromSerialized(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object instance = null;
            instance = function_unserialize.f.env(env).call(value).value();
            if (!ZVal.isTrue(
                    ZVal.checkInstanceType(
                            instance,
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Carbon
                                    .classes
                                    .Carbon
                                    .class,
                            "Carbon\\Carbon"))) {
                throw ZVal.getException(
                        env, new InvalidArgumentException(env, "Invalid serialized value."));
            }

            return ZVal.assign(instance);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        public Object __set_state(RuntimeEnv env, Object... args) {
            Object array = assignParameter(args, 0, false);
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Carbon.class)
                            .method("instance")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(DateTime.runtimeStaticObject.__set_state(env, array))
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object days =
                ZVal.newArray(
                        new ZPair(CONST_SUNDAY, "Sunday"),
                        new ZPair(CONST_MONDAY, "Monday"),
                        new ZPair(CONST_TUESDAY, "Tuesday"),
                        new ZPair(CONST_WEDNESDAY, "Wednesday"),
                        new ZPair(CONST_THURSDAY, "Thursday"),
                        new ZPair(CONST_FRIDAY, "Friday"),
                        new ZPair(CONST_SATURDAY, "Saturday"));

        public Object PHPIntSize = 8;

        public Object toStringFormat = CONST_DEFAULT_TO_STRING_FORMAT;

        public Object weekStartsAt = CONST_MONDAY;

        public Object weekEndsAt = CONST_SUNDAY;

        public Object weekendDays =
                ZVal.newArray(new ZPair(0, CONST_SATURDAY), new ZPair(1, CONST_SUNDAY));

        public Object midDayAt = 12;

        public Object regexFormats =
                ZVal.newArray(
                        new ZPair("d", "(3[01]|[12][0-9]|0[1-9])"),
                        new ZPair("D", "([a-zA-Z]{3})"),
                        new ZPair("j", "([123][0-9]|[1-9])"),
                        new ZPair("l", "([a-zA-Z]{2,})"),
                        new ZPair("N", "([1-7])"),
                        new ZPair("S", "([a-zA-Z]{2})"),
                        new ZPair("w", "([0-6])"),
                        new ZPair("z", "(36[0-5]|3[0-5][0-9]|[12][0-9]{2}|[1-9]?[0-9])"),
                        new ZPair("W", "(5[012]|[1-4][0-9]|[1-9])"),
                        new ZPair("F", "([a-zA-Z]{2,})"),
                        new ZPair("m", "(1[012]|0[1-9])"),
                        new ZPair("M", "([a-zA-Z]{3})"),
                        new ZPair("n", "(1[012]|[1-9])"),
                        new ZPair("t", "(2[89]|3[01])"),
                        new ZPair("L", "(0|1)"),
                        new ZPair("o", "([1-9][0-9]{0,4})"),
                        new ZPair("Y", "([1-9][0-9]{0,4})"),
                        new ZPair("y", "([0-9]{2})"),
                        new ZPair("a", "(am|pm)"),
                        new ZPair("A", "(AM|PM)"),
                        new ZPair("B", "([0-9]{3})"),
                        new ZPair("g", "(1[012]|[1-9])"),
                        new ZPair("G", "(2[0-3]|1?[0-9])"),
                        new ZPair("h", "(1[012]|0[1-9])"),
                        new ZPair("H", "(2[0-3]|[01][0-9])"),
                        new ZPair("i", "([0-5][0-9])"),
                        new ZPair("s", "([0-5][0-9])"),
                        new ZPair("u", "([0-9]{1,6})"),
                        new ZPair("v", "([0-9]{1,3})"),
                        new ZPair("e", "([a-zA-Z]{1,5})|([a-zA-Z]*\\/[a-zA-Z]*)"),
                        new ZPair("I", "(0|1)"),
                        new ZPair("O", "([\\+\\-](1[012]|0[0-9])[0134][05])"),
                        new ZPair("P", "([\\+\\-](1[012]|0[0-9]):[0134][05])"),
                        new ZPair("T", "([a-zA-Z]{1,5})"),
                        new ZPair("Z", "(-?[1-5]?[0-9]{1,4})"),
                        new ZPair("U", "([0-9]*)"),
                        new ZPair(
                                "c",
                                "(([1-9][0-9]{0,4})\\-(1[012]|0[1-9])\\-(3[01]|[12][0-9]|0[1-9])T(2[0-3]|[01][0-9]):([0-5][0-9]):([0-5][0-9])[\\+\\-](1[012]|0[0-9]):([0134][05]))"),
                        new ZPair(
                                "r",
                                "(([a-zA-Z]{3}), ([123][0-9]|[1-9]) ([a-zA-Z]{3}) ([1-9][0-9]{0,4}) (2[0-3]|[01][0-9]):([0-5][0-9]):([0-5][0-9]) [\\+\\-](1[012]|0[0-9])([0134][05]))"));

        public Object testNow = null;

        public Object translator = null;

        public Object lastErrors = null;

        public Object utf8 = false;

        public Object microsecondsFallback = true;

        public Object monthsOverflow = true;

        public Object yearsOverflow = true;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Carbon\\Carbon")
                    .setLookup(
                            Carbon.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames(
                            "PHPIntSize",
                            "days",
                            "lastErrors",
                            "microsecondsFallback",
                            "midDayAt",
                            "monthsOverflow",
                            "regexFormats",
                            "testNow",
                            "toStringFormat",
                            "translator",
                            "utf8",
                            "weekEndsAt",
                            "weekStartsAt",
                            "weekendDays",
                            "yearsOverflow")
                    .setFilename("vendor/nesbot/carbon/src/Carbon/Carbon.php")
                    .addInterface("DateTimeInterface")
                    .addExtendsClass("DateTime")
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

    private static class Scope36 implements UpdateRuntimeScopeInterface {

        Object instance;
        Object field;
        Object month;
        Object hour;
        Object year;
        Object tz;
        ReferenceContainer range;
        Object fields;
        Object day;
        Object minute;
        Object second;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("instance", this.instance);
            stack.setVariable("field", this.field);
            stack.setVariable("month", this.month);
            stack.setVariable("hour", this.hour);
            stack.setVariable("year", this.year);
            stack.setVariable("tz", this.tz);
            stack.setVariable("range", this.range);
            stack.setVariable("fields", this.fields);
            stack.setVariable("day", this.day);
            stack.setVariable("minute", this.minute);
            stack.setVariable("second", this.second);
        }

        public void updateScope(RuntimeStack stack) {

            this.instance = stack.getVariable("instance");
            this.field = stack.getVariable("field");
            this.month = stack.getVariable("month");
            this.hour = stack.getVariable("hour");
            this.year = stack.getVariable("year");
            this.tz = stack.getVariable("tz");
            this.range = ZVal.getStackReference(stack.getVariable("range"));
            this.fields = stack.getVariable("fields");
            this.day = stack.getVariable("day");
            this.minute = stack.getVariable("minute");
            this.second = stack.getVariable("second");
        }
    }

    private static class Scope37 implements UpdateRuntimeScopeInterface {

        Object instance;
        Object field;
        Object month;
        Object hour;
        Object year;
        Object tz;
        ReferenceContainer range;
        Object fields;
        Object day;
        Object minute;
        Object second;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("instance", this.instance);
            stack.setVariable("field", this.field);
            stack.setVariable("month", this.month);
            stack.setVariable("hour", this.hour);
            stack.setVariable("year", this.year);
            stack.setVariable("tz", this.tz);
            stack.setVariable("range", this.range);
            stack.setVariable("fields", this.fields);
            stack.setVariable("day", this.day);
            stack.setVariable("minute", this.minute);
            stack.setVariable("second", this.second);
        }

        public void updateScope(RuntimeStack stack) {

            this.instance = stack.getVariable("instance");
            this.field = stack.getVariable("field");
            this.month = stack.getVariable("month");
            this.hour = stack.getVariable("hour");
            this.year = stack.getVariable("year");
            this.tz = stack.getVariable("tz");
            this.range = ZVal.getStackReference(stack.getVariable("range"));
            this.fields = stack.getVariable("fields");
            this.day = stack.getVariable("day");
            this.minute = stack.getVariable("minute");
            this.second = stack.getVariable("second");
        }
    }

    private static class Scope38 implements UpdateRuntimeScopeInterface {

        Object instance;
        Object field;
        Object month;
        Object hour;
        Object year;
        Object tz;
        ReferenceContainer range;
        Object fields;
        Object day;
        Object minute;
        Object second;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("instance", this.instance);
            stack.setVariable("field", this.field);
            stack.setVariable("month", this.month);
            stack.setVariable("hour", this.hour);
            stack.setVariable("year", this.year);
            stack.setVariable("tz", this.tz);
            stack.setVariable("range", this.range);
            stack.setVariable("fields", this.fields);
            stack.setVariable("day", this.day);
            stack.setVariable("minute", this.minute);
            stack.setVariable("second", this.second);
        }

        public void updateScope(RuntimeStack stack) {

            this.instance = stack.getVariable("instance");
            this.field = stack.getVariable("field");
            this.month = stack.getVariable("month");
            this.hour = stack.getVariable("hour");
            this.year = stack.getVariable("year");
            this.tz = stack.getVariable("tz");
            this.range = ZVal.getStackReference(stack.getVariable("range"));
            this.fields = stack.getVariable("fields");
            this.day = stack.getVariable("day");
            this.minute = stack.getVariable("minute");
            this.second = stack.getVariable("second");
        }
    }

    private static class Scope39 implements UpdateRuntimeScopeInterface {

        Object instance;
        Object field;
        Object month;
        Object hour;
        Object year;
        Object tz;
        ReferenceContainer range;
        Object fields;
        Object day;
        Object minute;
        Object second;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("instance", this.instance);
            stack.setVariable("field", this.field);
            stack.setVariable("month", this.month);
            stack.setVariable("hour", this.hour);
            stack.setVariable("year", this.year);
            stack.setVariable("tz", this.tz);
            stack.setVariable("range", this.range);
            stack.setVariable("fields", this.fields);
            stack.setVariable("day", this.day);
            stack.setVariable("minute", this.minute);
            stack.setVariable("second", this.second);
        }

        public void updateScope(RuntimeStack stack) {

            this.instance = stack.getVariable("instance");
            this.field = stack.getVariable("field");
            this.month = stack.getVariable("month");
            this.hour = stack.getVariable("hour");
            this.year = stack.getVariable("year");
            this.tz = stack.getVariable("tz");
            this.range = ZVal.getStackReference(stack.getVariable("range"));
            this.fields = stack.getVariable("fields");
            this.day = stack.getVariable("day");
            this.minute = stack.getVariable("minute");
            this.second = stack.getVariable("second");
        }
    }

    private static class Scope40 implements UpdateRuntimeScopeInterface {

        Object instance;
        Object field;
        Object month;
        Object hour;
        Object year;
        Object tz;
        ReferenceContainer range;
        Object fields;
        Object day;
        Object minute;
        Object second;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("instance", this.instance);
            stack.setVariable("field", this.field);
            stack.setVariable("month", this.month);
            stack.setVariable("hour", this.hour);
            stack.setVariable("year", this.year);
            stack.setVariable("tz", this.tz);
            stack.setVariable("range", this.range);
            stack.setVariable("fields", this.fields);
            stack.setVariable("day", this.day);
            stack.setVariable("minute", this.minute);
            stack.setVariable("second", this.second);
        }

        public void updateScope(RuntimeStack stack) {

            this.instance = stack.getVariable("instance");
            this.field = stack.getVariable("field");
            this.month = stack.getVariable("month");
            this.hour = stack.getVariable("hour");
            this.year = stack.getVariable("year");
            this.tz = stack.getVariable("tz");
            this.range = ZVal.getStackReference(stack.getVariable("range"));
            this.fields = stack.getVariable("fields");
            this.day = stack.getVariable("day");
            this.minute = stack.getVariable("minute");
            this.second = stack.getVariable("second");
        }
    }

    private static class Scope41 implements UpdateRuntimeScopeInterface {

        Object instance;
        Object field;
        Object month;
        Object hour;
        Object year;
        Object tz;
        ReferenceContainer range;
        Object fields;
        Object day;
        Object minute;
        Object second;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("instance", this.instance);
            stack.setVariable("field", this.field);
            stack.setVariable("month", this.month);
            stack.setVariable("hour", this.hour);
            stack.setVariable("year", this.year);
            stack.setVariable("tz", this.tz);
            stack.setVariable("range", this.range);
            stack.setVariable("fields", this.fields);
            stack.setVariable("day", this.day);
            stack.setVariable("minute", this.minute);
            stack.setVariable("second", this.second);
        }

        public void updateScope(RuntimeStack stack) {

            this.instance = stack.getVariable("instance");
            this.field = stack.getVariable("field");
            this.month = stack.getVariable("month");
            this.hour = stack.getVariable("hour");
            this.year = stack.getVariable("year");
            this.tz = stack.getVariable("tz");
            this.range = ZVal.getStackReference(stack.getVariable("range"));
            this.fields = stack.getVariable("fields");
            this.day = stack.getVariable("day");
            this.minute = stack.getVariable("minute");
            this.second = stack.getVariable("second");
        }
    }

    private static class Scope42 implements UpdateRuntimeScopeInterface {

        Object instance;
        Object field;
        Object month;
        Object hour;
        Object year;
        Object tz;
        ReferenceContainer range;
        Object fields;
        Object day;
        Object minute;
        Object second;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("instance", this.instance);
            stack.setVariable("field", this.field);
            stack.setVariable("month", this.month);
            stack.setVariable("hour", this.hour);
            stack.setVariable("year", this.year);
            stack.setVariable("tz", this.tz);
            stack.setVariable("range", this.range);
            stack.setVariable("fields", this.fields);
            stack.setVariable("day", this.day);
            stack.setVariable("minute", this.minute);
            stack.setVariable("second", this.second);
        }

        public void updateScope(RuntimeStack stack) {

            this.instance = stack.getVariable("instance");
            this.field = stack.getVariable("field");
            this.month = stack.getVariable("month");
            this.hour = stack.getVariable("hour");
            this.year = stack.getVariable("year");
            this.tz = stack.getVariable("tz");
            this.range = ZVal.getStackReference(stack.getVariable("range"));
            this.fields = stack.getVariable("fields");
            this.day = stack.getVariable("day");
            this.minute = stack.getVariable("minute");
            this.second = stack.getVariable("second");
        }
    }

    private static class Scope43 implements UpdateRuntimeScopeInterface {

        Object instance;
        Object field;
        Object month;
        Object hour;
        Object year;
        Object tz;
        ReferenceContainer range;
        Object fields;
        Object day;
        Object minute;
        Object second;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("instance", this.instance);
            stack.setVariable("field", this.field);
            stack.setVariable("month", this.month);
            stack.setVariable("hour", this.hour);
            stack.setVariable("year", this.year);
            stack.setVariable("tz", this.tz);
            stack.setVariable("range", this.range);
            stack.setVariable("fields", this.fields);
            stack.setVariable("day", this.day);
            stack.setVariable("minute", this.minute);
            stack.setVariable("second", this.second);
        }

        public void updateScope(RuntimeStack stack) {

            this.instance = stack.getVariable("instance");
            this.field = stack.getVariable("field");
            this.month = stack.getVariable("month");
            this.hour = stack.getVariable("hour");
            this.year = stack.getVariable("year");
            this.tz = stack.getVariable("tz");
            this.range = ZVal.getStackReference(stack.getVariable("range"));
            this.fields = stack.getVariable("fields");
            this.day = stack.getVariable("day");
            this.minute = stack.getVariable("minute");
            this.second = stack.getVariable("second");
        }
    }

    private static class Scope44 implements UpdateRuntimeScopeInterface {

        Object instance;
        Object field;
        Object month;
        Object hour;
        Object year;
        Object tz;
        ReferenceContainer range;
        Object fields;
        Object day;
        Object minute;
        Object second;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("instance", this.instance);
            stack.setVariable("field", this.field);
            stack.setVariable("month", this.month);
            stack.setVariable("hour", this.hour);
            stack.setVariable("year", this.year);
            stack.setVariable("tz", this.tz);
            stack.setVariable("range", this.range);
            stack.setVariable("fields", this.fields);
            stack.setVariable("day", this.day);
            stack.setVariable("minute", this.minute);
            stack.setVariable("second", this.second);
        }

        public void updateScope(RuntimeStack stack) {

            this.instance = stack.getVariable("instance");
            this.field = stack.getVariable("field");
            this.month = stack.getVariable("month");
            this.hour = stack.getVariable("hour");
            this.year = stack.getVariable("year");
            this.tz = stack.getVariable("tz");
            this.range = ZVal.getStackReference(stack.getVariable("range"));
            this.fields = stack.getVariable("fields");
            this.day = stack.getVariable("day");
            this.minute = stack.getVariable("minute");
            this.second = stack.getVariable("second");
        }
    }

    private static class Scope45 implements UpdateRuntimeScopeInterface {

        Object month;
        Object hour;
        Object year;
        Object runtimeTempArrayResult116;
        Object _thisVarAlias;
        Object name;
        Object day;
        Object value;
        Object minute;
        Object second;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("month", this.month);
            stack.setVariable("hour", this.hour);
            stack.setVariable("year", this.year);
            stack.setVariable("runtimeTempArrayResult116", this.runtimeTempArrayResult116);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("name", this.name);
            stack.setVariable("day", this.day);
            stack.setVariable("value", this.value);
            stack.setVariable("minute", this.minute);
            stack.setVariable("second", this.second);
        }

        public void updateScope(RuntimeStack stack) {

            this.month = stack.getVariable("month");
            this.hour = stack.getVariable("hour");
            this.year = stack.getVariable("year");
            this.runtimeTempArrayResult116 = stack.getVariable("runtimeTempArrayResult116");
            this._thisVarAlias = stack.getVariable("this");
            this.name = stack.getVariable("name");
            this.day = stack.getVariable("day");
            this.value = stack.getVariable("value");
            this.minute = stack.getVariable("minute");
            this.second = stack.getVariable("second");
        }
    }

    private enum SwitchEnumType41 {
        DYNAMIC_TYPE_122,
        DYNAMIC_TYPE_123,
        DYNAMIC_TYPE_124,
        DYNAMIC_TYPE_125,
        DYNAMIC_TYPE_126,
        DYNAMIC_TYPE_127,
        DYNAMIC_TYPE_128,
        DYNAMIC_TYPE_129,
        DYNAMIC_TYPE_130,
        DYNAMIC_TYPE_131,
        RESERVED_CHARS_995231205_MINUS_null,
        RESERVED_CHARS_286252198_MINUS_null,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType42 {
        STRING_year,
        STRING_month,
        STRING_day,
        STRING_hour,
        STRING_minute,
        STRING_second,
        STRING_timestamp,
        STRING_timezone,
        STRING_tz,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
