package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.en_ZA.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/en_ZA/PhoneNumber.php

*/

public class PhoneNumber
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .PhoneNumber {

    public PhoneNumber(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PhoneNumber.class) {
            this.__construct(env, args);
        }
    }

    public PhoneNumber(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object mobileNumber(RuntimeEnv env, Object... args) {
        Object format = null;
        format =
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, PhoneNumber.class)
                        .method("randomElement")
                        .addReferenceArgs(
                                new RuntimeArgsWithReferences()
                                        .add(
                                                0,
                                                env.getRequestStaticPropertiesReference(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Faker
                                                                .namespaces
                                                                .Provider
                                                                .namespaces
                                                                .en_ZA
                                                                .classes
                                                                .PhoneNumber
                                                                .RequestStaticProperties
                                                                .class,
                                                        "cellphoneFormats")))
                        .call(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Faker
                                                        .namespaces
                                                        .Provider
                                                        .namespaces
                                                        .en_ZA
                                                        .classes
                                                        .PhoneNumber
                                                        .RequestStaticProperties
                                                        .class)
                                        .cellphoneFormats)
                        .value();
        return ZVal.assign(
                runtimeStaticObject.numerify(
                        env,
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("generator").value(),
                                "parse",
                                PhoneNumber.class,
                                format)));
    }

    @ConvertedMethod
    public Object tollFreeNumber(RuntimeEnv env, Object... args) {
        Object format = null;
        format =
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, PhoneNumber.class)
                        .method("randomElement")
                        .addReferenceArgs(
                                new RuntimeArgsWithReferences()
                                        .add(
                                                0,
                                                env.getRequestStaticPropertiesReference(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Faker
                                                                .namespaces
                                                                .Provider
                                                                .namespaces
                                                                .en_ZA
                                                                .classes
                                                                .PhoneNumber
                                                                .RequestStaticProperties
                                                                .class,
                                                        "specialFormats")))
                        .call(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Faker
                                                        .namespaces
                                                        .Provider
                                                        .namespaces
                                                        .en_ZA
                                                        .classes
                                                        .PhoneNumber
                                                        .RequestStaticProperties
                                                        .class)
                                        .specialFormats)
                        .value();
        return ZVal.assign(
                runtimeStaticObject.numerify(
                        env,
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("generator").value(),
                                "parse",
                                PhoneNumber.class,
                                format)));
    }

    public static final Object CONST_class = "Faker\\Provider\\en_ZA\\PhoneNumber";

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
                    .PhoneNumber
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object areaCode(RuntimeEnv env, Object... args) {
            int runtimeConverterBreakCount;
            Object number = null;
            ReferenceContainer digits = new BasicReferenceContainer(null);
            digits.arrayAppend(env).set(runtimeStaticObject.numberBetween(env, 1, 5));
            switch (ZVal.toInt(digits.arrayGet(env, 0))) {
                case 1:
                    digits.arrayAppend(env).set(runtimeStaticObject.numberBetween(env, 1, 8));
                    break;
                case 2:
                    number = runtimeStaticObject.numberBetween(env, 1, 8);
                    digits.arrayAppend(env)
                            .set(
                                    function_in_array
                                                    .f
                                                    .env(env)
                                                    .call(number, ZVal.arrayFromList(5, 6))
                                                    .getBool()
                                            ? ZVal.add(number, 2)
                                            : number);
                    break;
                case 3:
                    number = runtimeStaticObject.numberBetween(env, 1, 8);
                    digits.arrayAppend(env)
                            .set(
                                    function_in_array
                                                    .f
                                                    .env(env)
                                                    .call(number, ZVal.arrayFromList(7, 8))
                                                    .getBool()
                                            ? ZVal.subtract(number, 2)
                                            : number);
                    break;
                case 4:
                    digits.arrayAppend(env).set(runtimeStaticObject.numberBetween(env, 1, 9));
                    break;
                case 5:
                    number = runtimeStaticObject.numberBetween(env, 1, 8);
                    digits.arrayAppend(env)
                            .set(
                                    function_in_array
                                                    .f
                                                    .env(env)
                                                    .call(number, ZVal.arrayFromList(2, 5))
                                                    .getBool()
                                            ? ZVal.add(number, 2)
                                            : number);
                    break;
            }
            ;
            return ZVal.assign(
                    NamespaceGlobal.implode.env(env).call("", digits.getObject()).value());
        }

        @ConvertedMethod
        public Object cellphoneCode(RuntimeEnv env, Object... args) {
            int runtimeConverterBreakCount;
            Object number = null;
            ReferenceContainer digits = new BasicReferenceContainer(null);
            digits.arrayAppend(env).set(runtimeStaticObject.numberBetween(env, 6, 8));
            switch (ZVal.toInt(digits.arrayGet(env, 0))) {
                case 6:
                    digits.arrayAppend(env).set(runtimeStaticObject.numberBetween(env, 0, 2));
                    break;
                case 7:
                    number = runtimeStaticObject.numberBetween(env, 1, 9);
                    digits.arrayAppend(env)
                            .set(
                                    function_in_array
                                                    .f
                                                    .env(env)
                                                    .call(number, ZVal.arrayFromList(5, 7))
                                                    .getBool()
                                            ? ZVal.add(number, 1)
                                            : number);
                    break;
                case 8:
                    digits.arrayAppend(env).set(runtimeStaticObject.numberBetween(env, 1, 9));
                    break;
            }
            ;
            return ZVal.assign(
                    NamespaceGlobal.implode.env(env).call("", digits.getObject()).value());
        }

        @ConvertedMethod
        public Object specialCode(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, PhoneNumber.class)
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
                                                            .namespaces
                                                            .en_ZA
                                                            .classes
                                                            .PhoneNumber
                                                            .RequestStaticProperties
                                                            .class)
                                            .tollFreeAreaCodes)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object formats =
                ZVal.arrayFromList(
                        "+27({{areaCode}})#######",
                        "+27{{areaCode}}#######",
                        "0{{areaCode}}#######",
                        "0{{areaCode}} ### ####",
                        "0{{areaCode}}-###-####");

        public Object cellphoneFormats =
                ZVal.arrayFromList(
                        "+27{{cellphoneCode}}#######",
                        "0{{cellphoneCode}}#######",
                        "0{{cellphoneCode}} ### ####",
                        "0{{cellphoneCode}}-###-####");

        public Object specialFormats =
                ZVal.arrayFromList(
                        "{{specialCode}}#######",
                        "{{specialCode}} ### ####",
                        "{{specialCode}}-###-####",
                        "({{specialCode}})###-####");

        public Object tollFreeAreaCodes = ZVal.arrayFromList("0800", "0860", "0861", "0862");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\en_ZA\\PhoneNumber")
                    .setLookup(
                            PhoneNumber.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "cellphoneFormats", "formats", "specialFormats", "tollFreeAreaCodes")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/en_ZA/PhoneNumber.php")
                    .addExtendsClass("Faker\\Provider\\PhoneNumber")
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
