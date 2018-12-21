package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.zh_CN.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/zh_CN/DateTime.php

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

    public static final Object CONST_class = "Faker\\Provider\\zh_CN\\DateTime";

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
                            ? "\u4E0A\u5348"
                            : "\u4E0B\u5348");
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
                            new ZPair("Sunday", "\u661F\u671F\u65E5"),
                            new ZPair("Monday", "\u661F\u671F\u4E00"),
                            new ZPair("Tuesday", "\u661F\u671F\u4E8C"),
                            new ZPair("Wednesday", "\u661F\u671F\u4E09"),
                            new ZPair("Thursday", "\u661F\u671F\u56DB"),
                            new ZPair("Friday", "\u661F\u671F\u4E94"),
                            new ZPair("Saturday", "\u661F\u671F\u516D")));
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
                            new ZPair("January", "\u4E00\u6708"),
                            new ZPair("February", "\u4E8C\u6708"),
                            new ZPair("March", "\u4E09\u6708"),
                            new ZPair("April", "\u56DB\u6708"),
                            new ZPair("May", "\u4E94\u6708"),
                            new ZPair("June", "\u516D\u6708"),
                            new ZPair("July", "\u4E03\u6708"),
                            new ZPair("August", "\u516B\u6708"),
                            new ZPair("September", "\u4E5D\u6708"),
                            new ZPair("October", "\u5341\u6708"),
                            new ZPair("November", "\u5341\u4E00\u6708"),
                            new ZPair("December", "\u5341\u4E8C\u6708")));
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
                    .setName("Faker\\Provider\\zh_CN\\DateTime")
                    .setLookup(
                            DateTime.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/zh_CN/DateTime.php")
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
