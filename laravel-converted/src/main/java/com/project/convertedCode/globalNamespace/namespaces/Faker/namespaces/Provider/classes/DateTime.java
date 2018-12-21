package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeClasses.date.DateInterval;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes.Base;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeZone;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/DateTime.php

*/

public class DateTime extends Base {

    public DateTime(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DateTime.class) {
            this.__construct(env, args);
        }
    }

    public DateTime(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Faker\\Provider\\DateTime";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Base.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "max")
        protected Object getMaxTimestamp(RuntimeEnv env, Object... args) {
            Object max = assignParameter(args, 0, true);
            if (null == max) {
                max = "now";
            }
            if (function_is_numeric.f.env(env).call(max).getBool()) {
                return ZVal.assign(ZVal.toLong(max));
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            max,
                            com.runtimeconverter.runtime.nativeClasses.date.DateTime.class,
                            "DateTime"))) {
                return ZVal.assign(env.callMethod(max, "getTimestamp", DateTime.class));
            }

            return ZVal.assign(
                    NamespaceGlobal.strtotime
                            .env(env)
                            .call(ZVal.isEmpty(max) ? "now" : max)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "max")
        public Object unixTime(RuntimeEnv env, Object... args) {
            Object max = assignParameter(args, 0, true);
            if (null == max) {
                max = "now";
            }
            return ZVal.assign(
                    NamespaceGlobal.mt_rand
                            .env(env)
                            .call(
                                    0,
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, DateTime.class)
                                            .method("getMaxTimestamp")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(max)
                                            .value())
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "max")
        @ConvertedParameter(
            index = 1,
            name = "timezone",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object dateTime(RuntimeEnv env, Object... args) {
            Object max = assignParameter(args, 0, true);
            if (null == max) {
                max = "now";
            }
            Object timezone = assignParameter(args, 1, true);
            if (null == timezone) {
                timezone = ZVal.getNull();
            }
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, DateTime.class)
                            .method("setTimezone")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    new com.runtimeconverter.runtime.nativeClasses.date.DateTime(
                                            env,
                                            "@"
                                                    + toStringR(
                                                            StaticMethodUtils
                                                                    .accessUnknownLateStaticMethod(
                                                                            env,
                                                                            this,
                                                                            DateTime.class)
                                                                    .method("unixTime")
                                                                    .addReferenceArgs(
                                                                            new RuntimeArgsWithReferences())
                                                                    .call(max)
                                                                    .value(),
                                                            env)),
                                    ZVal.strictEqualityCheck(ZVal.getNull(), "===", timezone)
                                            ? NamespaceGlobal.date_default_timezone_get
                                                    .env(env)
                                                    .call()
                                                    .value()
                                            : timezone)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "max")
        @ConvertedParameter(
            index = 1,
            name = "timezone",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object dateTimeAD(RuntimeEnv env, Object... args) {
            Object max = assignParameter(args, 0, true);
            if (null == max) {
                max = "now";
            }
            Object timezone = assignParameter(args, 1, true);
            if (null == timezone) {
                timezone = ZVal.getNull();
            }
            Object min = null;
            min =
                    ZVal.assign(
                            ZVal.isGreaterThan(8, '>', 4)
                                    ? -62135597361L
                                    : ZVal.minusSign(9223372036854775807L));
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, DateTime.class)
                            .method("setTimezone")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    new com.runtimeconverter.runtime.nativeClasses.date.DateTime(
                                            env,
                                            "@"
                                                    + toStringR(
                                                            NamespaceGlobal.mt_rand
                                                                    .env(env)
                                                                    .call(
                                                                            min,
                                                                            StaticMethodUtils
                                                                                    .accessUnknownLateStaticMethod(
                                                                                            env,
                                                                                            this,
                                                                                            DateTime
                                                                                                    .class)
                                                                                    .method(
                                                                                            "getMaxTimestamp")
                                                                                    .addReferenceArgs(
                                                                                            new RuntimeArgsWithReferences())
                                                                                    .call(max)
                                                                                    .value())
                                                                    .value(),
                                                            env)),
                                    ZVal.strictEqualityCheck(ZVal.getNull(), "===", timezone)
                                            ? NamespaceGlobal.date_default_timezone_get
                                                    .env(env)
                                                    .call()
                                                    .value()
                                            : timezone)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "max")
        public Object iso8601(RuntimeEnv env, Object... args) {
            Object max = assignParameter(args, 0, true);
            if (null == max) {
                max = "now";
            }
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, DateTime.class)
                            .method("date")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call("Y-m-d\\TH:i:sO", max)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "format")
        @ConvertedParameter(index = 1, name = "max")
        public Object date(RuntimeEnv env, Object... args) {
            Object format = assignParameter(args, 0, true);
            if (null == format) {
                format = "Y-m-d";
            }
            Object max = assignParameter(args, 1, true);
            if (null == max) {
                max = "now";
            }
            return ZVal.assign(
                    env.callMethod(
                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                            env, this, DateTime.class)
                                    .method("dateTime")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(max)
                                    .value(),
                            "format",
                            DateTime.class,
                            format));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "format")
        @ConvertedParameter(index = 1, name = "max")
        public Object time(RuntimeEnv env, Object... args) {
            Object format = assignParameter(args, 0, true);
            if (null == format) {
                format = "H:i:s";
            }
            Object max = assignParameter(args, 1, true);
            if (null == max) {
                max = "now";
            }
            return ZVal.assign(
                    env.callMethod(
                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                            env, this, DateTime.class)
                                    .method("dateTime")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(max)
                                    .value(),
                            "format",
                            DateTime.class,
                            format));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "startDate")
        @ConvertedParameter(index = 1, name = "endDate")
        @ConvertedParameter(
            index = 2,
            name = "timezone",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object dateTimeBetween(RuntimeEnv env, Object... args) {
            Object startDate = assignParameter(args, 0, true);
            if (null == startDate) {
                startDate = "-30 years";
            }
            Object endDate = assignParameter(args, 1, true);
            if (null == endDate) {
                endDate = "now";
            }
            Object timezone = assignParameter(args, 2, true);
            if (null == timezone) {
                timezone = ZVal.getNull();
            }
            Object endTimestamp = null;
            Object startTimestamp = null;
            Object timestamp = null;
            startTimestamp =
                    ZVal.assign(
                            ZVal.isTrue(
                                            ZVal.checkInstanceType(
                                                    startDate,
                                                    com.runtimeconverter
                                                            .runtime
                                                            .nativeClasses
                                                            .date
                                                            .DateTime
                                                            .class,
                                                    "DateTime"))
                                    ? env.callMethod(startDate, "getTimestamp", DateTime.class)
                                    : NamespaceGlobal.strtotime.env(env).call(startDate).value());
            endTimestamp =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, DateTime.class)
                            .method("getMaxTimestamp")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(endDate)
                            .value();
            if (ZVal.isGreaterThan(startTimestamp, '>', endTimestamp)) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env, "Start date must be anterior to end date."));
            }

            timestamp = NamespaceGlobal.mt_rand.env(env).call(startTimestamp, endTimestamp).value();
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, DateTime.class)
                            .method("setTimezone")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    new com.runtimeconverter.runtime.nativeClasses.date.DateTime(
                                            env, "@" + toStringR(timestamp, env)),
                                    ZVal.strictEqualityCheck(ZVal.getNull(), "===", timezone)
                                            ? NamespaceGlobal.date_default_timezone_get
                                                    .env(env)
                                                    .call()
                                                    .value()
                                            : timezone)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "date")
        @ConvertedParameter(index = 1, name = "interval")
        @ConvertedParameter(
            index = 2,
            name = "timezone",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object dateTimeInInterval(RuntimeEnv env, Object... args) {
            Object date = assignParameter(args, 0, true);
            if (null == date) {
                date = "-30 years";
            }
            Object interval = assignParameter(args, 1, true);
            if (null == interval) {
                interval = "+5 days";
            }
            Object timezone = assignParameter(args, 2, true);
            if (null == timezone) {
                timezone = ZVal.getNull();
            }
            ReferenceContainer intervalObject = new BasicReferenceContainer(null);
            Object datetime = null;
            Object otherDatetime = null;
            Object end = null;
            Object begin = null;
            intervalObject.setObject(
                    DateInterval.runtimeStaticObject.createFromDateString(env, interval));
            datetime =
                    ZVal.assign(
                            ZVal.isTrue(
                                            ZVal.checkInstanceType(
                                                    date,
                                                    com.runtimeconverter
                                                            .runtime
                                                            .nativeClasses
                                                            .date
                                                            .DateTime
                                                            .class,
                                                    "DateTime"))
                                    ? date
                                    : new com.runtimeconverter.runtime.nativeClasses.date.DateTime(
                                            env, date));
            otherDatetime = ZVal.assign(((RuntimeClassInterface) datetime).phpClone(env));
            env.callMethod(
                    otherDatetime,
                    new RuntimeArgsWithReferences().add(0, intervalObject),
                    "add",
                    DateTime.class,
                    intervalObject.getObject());
            begin =
                    ZVal.assign(
                            ZVal.isGreaterThan(datetime, '>', otherDatetime)
                                    ? otherDatetime
                                    : datetime);
            end =
                    ZVal.assign(
                            ZVal.strictEqualityCheck(datetime, "===", begin)
                                    ? otherDatetime
                                    : datetime);
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, DateTime.class)
                            .method("dateTimeBetween")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    begin,
                                    end,
                                    ZVal.strictEqualityCheck(ZVal.getNull(), "===", timezone)
                                            ? NamespaceGlobal.date_default_timezone_get
                                                    .env(env)
                                                    .call()
                                                    .value()
                                            : timezone)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "max")
        @ConvertedParameter(
            index = 1,
            name = "timezone",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object dateTimeThisCentury(RuntimeEnv env, Object... args) {
            Object max = assignParameter(args, 0, true);
            if (null == max) {
                max = "now";
            }
            Object timezone = assignParameter(args, 1, true);
            if (null == timezone) {
                timezone = ZVal.getNull();
            }
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, DateTime.class)
                            .method("dateTimeBetween")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call("-100 year", max, timezone)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "max")
        @ConvertedParameter(
            index = 1,
            name = "timezone",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object dateTimeThisDecade(RuntimeEnv env, Object... args) {
            Object max = assignParameter(args, 0, true);
            if (null == max) {
                max = "now";
            }
            Object timezone = assignParameter(args, 1, true);
            if (null == timezone) {
                timezone = ZVal.getNull();
            }
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, DateTime.class)
                            .method("dateTimeBetween")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call("-10 year", max, timezone)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "max")
        @ConvertedParameter(
            index = 1,
            name = "timezone",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object dateTimeThisYear(RuntimeEnv env, Object... args) {
            Object max = assignParameter(args, 0, true);
            if (null == max) {
                max = "now";
            }
            Object timezone = assignParameter(args, 1, true);
            if (null == timezone) {
                timezone = ZVal.getNull();
            }
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, DateTime.class)
                            .method("dateTimeBetween")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call("-1 year", max, timezone)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "max")
        @ConvertedParameter(
            index = 1,
            name = "timezone",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object dateTimeThisMonth(RuntimeEnv env, Object... args) {
            Object max = assignParameter(args, 0, true);
            if (null == max) {
                max = "now";
            }
            Object timezone = assignParameter(args, 1, true);
            if (null == timezone) {
                timezone = ZVal.getNull();
            }
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, DateTime.class)
                            .method("dateTimeBetween")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call("-1 month", max, timezone)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "max")
        public Object amPm(RuntimeEnv env, Object... args) {
            Object max = assignParameter(args, 0, true);
            if (null == max) {
                max = "now";
            }
            return ZVal.assign(
                    env.callMethod(
                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                            env, this, DateTime.class)
                                    .method("dateTime")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(max)
                                    .value(),
                            "format",
                            DateTime.class,
                            "a"));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "max")
        public Object dayOfMonth(RuntimeEnv env, Object... args) {
            Object max = assignParameter(args, 0, true);
            if (null == max) {
                max = "now";
            }
            return ZVal.assign(
                    env.callMethod(
                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                            env, this, DateTime.class)
                                    .method("dateTime")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(max)
                                    .value(),
                            "format",
                            DateTime.class,
                            "d"));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "max")
        public Object dayOfWeek(RuntimeEnv env, Object... args) {
            Object max = assignParameter(args, 0, true);
            if (null == max) {
                max = "now";
            }
            return ZVal.assign(
                    env.callMethod(
                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                            env, this, DateTime.class)
                                    .method("dateTime")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(max)
                                    .value(),
                            "format",
                            DateTime.class,
                            "l"));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "max")
        public Object month(RuntimeEnv env, Object... args) {
            Object max = assignParameter(args, 0, true);
            if (null == max) {
                max = "now";
            }
            return ZVal.assign(
                    env.callMethod(
                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                            env, this, DateTime.class)
                                    .method("dateTime")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(max)
                                    .value(),
                            "format",
                            DateTime.class,
                            "m"));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "max")
        public Object monthName(RuntimeEnv env, Object... args) {
            Object max = assignParameter(args, 0, true);
            if (null == max) {
                max = "now";
            }
            return ZVal.assign(
                    env.callMethod(
                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                            env, this, DateTime.class)
                                    .method("dateTime")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(max)
                                    .value(),
                            "format",
                            DateTime.class,
                            "F"));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "max")
        public Object year(RuntimeEnv env, Object... args) {
            Object max = assignParameter(args, 0, true);
            if (null == max) {
                max = "now";
            }
            return ZVal.assign(
                    env.callMethod(
                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                            env, this, DateTime.class)
                                    .method("dateTime")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(max)
                                    .value(),
                            "format",
                            DateTime.class,
                            "Y"));
        }

        @ConvertedMethod
        public Object century(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, DateTime.class)
                            .method("randomElement")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Faker
                                                            .namespaces
                                                            .Provider
                                                            .classes
                                                            .DateTime
                                                            .RequestStaticProperties
                                                            .class)
                                            .century)
                            .value());
        }

        @ConvertedMethod
        public Object timezone(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, DateTime.class)
                            .method("randomElement")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(DateTimeZone.runtimeStaticObject.listIdentifiers(env))
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "dt", typeHint = "DateTime")
        @ConvertedParameter(index = 1, name = "timezone")
        private Object setTimezone(RuntimeEnv env, Object... args) {
            Object dt = assignParameter(args, 0, false);
            Object timezone = assignParameter(args, 1, false);
            return ZVal.assign(
                    env.callMethod(
                            dt, "setTimezone", DateTime.class, new DateTimeZone(env, timezone)));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object century =
                ZVal.arrayFromList(
                        "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII",
                        "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\DateTime")
                    .setLookup(
                            DateTime.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("century")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/DateTime.php")
                    .addExtendsClass("Faker\\Provider\\Base")
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
