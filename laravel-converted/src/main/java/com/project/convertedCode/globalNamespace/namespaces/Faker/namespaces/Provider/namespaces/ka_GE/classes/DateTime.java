package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.ka_GE.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/ka_GE/DateTime.php

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

    public static final Object CONST_class = "Faker\\Provider\\ka_GE\\DateTime";

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
        public Object dayOfWeek(RuntimeEnv env, Object... args) {
            Object max = assignParameter(args, 0, true);
            if (null == max) {
                max = "now";
            }
            Object week = null;
            ReferenceContainer map = new BasicReferenceContainer(null);
            map.setObject(
                    ZVal.newArray(
                            new ZPair("Sunday", "\u10D9\u10D5\u10D8\u10E0\u10D0"),
                            new ZPair("Monday", "\u10DD\u10E0\u10E8\u10D0\u10D1\u10D0\u10D7\u10D8"),
                            new ZPair(
                                    "Tuesday",
                                    "\u10E1\u10D0\u10DB\u10E8\u10D0\u10D1\u10D0\u10D7\u10D8"),
                            new ZPair(
                                    "Wednesday",
                                    "\u10DD\u10D7\u10EE\u10E8\u10D0\u10D1\u10D0\u10D7\u10D8"),
                            new ZPair(
                                    "Thursday",
                                    "\u10EE\u10E3\u10D7\u10E8\u10D0\u10D1\u10D0\u10D7\u10D8"),
                            new ZPair(
                                    "Friday",
                                    "\u10DE\u10D0\u10E0\u10D0\u10E1\u10D9\u10D4\u10D5\u10D8"),
                            new ZPair("Saturday", "\u10E8\u10D0\u10D1\u10D0\u10D7\u10D8")));
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
                            new ZPair("January", "\u10D8\u10D0\u10DC\u10D5\u10D0\u10E0\u10D8"),
                            new ZPair(
                                    "February",
                                    "\u10D7\u10D4\u10D1\u10D4\u10E0\u10D5\u10D0\u10DA\u10D8"),
                            new ZPair("March", "\u10DB\u10D0\u10E0\u10E2\u10D8"),
                            new ZPair("April", "\u10D0\u10DE\u10E0\u10D8\u10DA\u10D8"),
                            new ZPair("May", "\u10DB\u10D0\u10D8\u10E1\u10D8"),
                            new ZPair("June", "\u10D8\u10D5\u10DC\u10D8\u10E1\u10D8"),
                            new ZPair("July", "\u10D8\u10D5\u10DA\u10D8\u10E1\u10D8"),
                            new ZPair("August", "\u10D0\u10D2\u10D5\u10D8\u10E1\u10E2\u10DD"),
                            new ZPair(
                                    "September",
                                    "\u10E1\u10D4\u10E5\u10E2\u10D4\u10DB\u10D1\u10D4\u10E0\u10D8"),
                            new ZPair(
                                    "October",
                                    "\u10DD\u10E5\u10E2\u10DD\u10DB\u10D1\u10D4\u10E0\u10D8"),
                            new ZPair(
                                    "November", "\u10DC\u10DD\u10D4\u10DB\u10D1\u10D4\u10E0\u10D8"),
                            new ZPair(
                                    "December",
                                    "\u10D3\u10D4\u10D9\u10D4\u10DB\u10D1\u10D4\u10E0\u10D8")));
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
                    .setName("Faker\\Provider\\ka_GE\\DateTime")
                    .setLookup(
                            DateTime.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/ka_GE/DateTime.php")
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
