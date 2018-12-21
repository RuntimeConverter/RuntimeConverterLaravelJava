package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.tr_TR.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/tr_TR/DateTime.php

*/

public class DateTime
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .DateTime {

    public DateTime(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DateTime.class) {
            this.__construct(env, args);
        }
    }

    public DateTime(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Faker\\Provider\\tr_TR\\DateTime";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Faker
                    .namespaces
                    .Provider
                    .classes
                    .DateTime
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "max")
        public Object amPm(RuntimeEnv env, Object... args) {
            Object max = assignParameter(args, 0, true);
            if (null == max) {
                max = "now";
            }
            return ZVal.assign(
                    ZVal.strictEqualityCheck(
                                    env.callMethod(
                                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                                            env, this, DateTime.class)
                                                    .method("dateTime")
                                                    .addReferenceArgs(
                                                            new RuntimeArgsWithReferences())
                                                    .call(max)
                                                    .value(),
                                            "format",
                                            DateTime.class,
                                            "a"),
                                    "===",
                                    "am")
                            ? "\u00F6\u00F6"
                            : "\u00F6s");
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "max")
        public Object dayOfWeek(RuntimeEnv env, Object... args) {
            Object max = assignParameter(args, 0, true);
            if (null == max) {
                max = "now";
            }
            Object week = null;
            ReferenceContainer map = new BasicReferenceContainer(null);
            map.setObject(
                    ZVal.newArray(
                            new ZPair("Sunday", "Pazar"),
                            new ZPair("Monday", "Pazartesi"),
                            new ZPair("Tuesday", "Sal\u0131"),
                            new ZPair("Wednesday", "\u00C7ar\u015Famba"),
                            new ZPair("Thursday", "Per\u015Fembe"),
                            new ZPair("Friday", "Cuma"),
                            new ZPair("Saturday", "Cumartesi")));
            week =
                    env.callMethod(
                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                            env, this, DateTime.class)
                                    .method("dateTime")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(max)
                                    .value(),
                            "format",
                            DateTime.class,
                            "l");
            return ZVal.assign(
                    arrayActionR(ArrayAction.ISSET, map, env, week)
                            ? map.arrayGet(env, week)
                            : week);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "max")
        public Object monthName(RuntimeEnv env, Object... args) {
            Object max = assignParameter(args, 0, true);
            if (null == max) {
                max = "now";
            }
            Object month = null;
            ReferenceContainer map = new BasicReferenceContainer(null);
            map.setObject(
                    ZVal.newArray(
                            new ZPair("January", "Ocak"),
                            new ZPair("February", "\u015Eubat"),
                            new ZPair("March", "Mart"),
                            new ZPair("April", "Nisan"),
                            new ZPair("May", "May\u0131s"),
                            new ZPair("June", "Haziran"),
                            new ZPair("July", "Temmuz"),
                            new ZPair("August", "A\u011Fustos"),
                            new ZPair("September", "Eyl\u00FCl"),
                            new ZPair("October", "Ekim"),
                            new ZPair("November", "Kas\u0131m"),
                            new ZPair("December", "Aral\u0131k")));
            month =
                    env.callMethod(
                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                            env, this, DateTime.class)
                                    .method("dateTime")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(max)
                                    .value(),
                            "format",
                            DateTime.class,
                            "F");
            return ZVal.assign(
                    arrayActionR(ArrayAction.ISSET, map, env, month)
                            ? map.arrayGet(env, month)
                            : month);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\tr_TR\\DateTime")
                    .setLookup(
                            DateTime.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/tr_TR/DateTime.php")
                    .addExtendsClass("Faker\\Provider\\DateTime")
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
