package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.en_US.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/en_US/PhoneNumber.php

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
    public Object tollFreeAreaCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                runtimeStaticObject.randomElement(
                        env,
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Faker
                                                .namespaces
                                                .Provider
                                                .namespaces
                                                .en_US
                                                .classes
                                                .PhoneNumber
                                                .RequestStaticProperties
                                                .class)
                                .tollFreeAreaCodes));
    }

    @ConvertedMethod
    public Object tollFreePhoneNumber(RuntimeEnv env, Object... args) {
        Object format = null;
        format =
                runtimeStaticObject.randomElement(
                        env,
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Faker
                                                .namespaces
                                                .Provider
                                                .namespaces
                                                .en_US
                                                .classes
                                                .PhoneNumber
                                                .RequestStaticProperties
                                                .class)
                                .tollFreeFormats);
        return ZVal.assign(
                runtimeStaticObject.numerify(
                        env,
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("generator").value(),
                                "parse",
                                PhoneNumber.class,
                                format)));
    }

    public static final Object CONST_class = "Faker\\Provider\\en_US\\PhoneNumber";

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
            ReferenceContainer digits = new BasicReferenceContainer(null);
            digits.arrayAppend(env).set(runtimeStaticObject.numberBetween(env, 2, 9));
            digits.arrayAppend(env).set(runtimeStaticObject.randomDigit(env));
            digits.arrayAppend(env)
                    .set(runtimeStaticObject.randomDigitNot(env, digits.arrayGet(env, 1)));
            return ZVal.assign(NamespaceGlobal.join.env(env).call("", digits.getObject()).value());
        }

        @ConvertedMethod
        public Object exchangeCode(RuntimeEnv env, Object... args) {
            ReferenceContainer digits = new BasicReferenceContainer(null);
            digits.arrayAppend(env).set(runtimeStaticObject.numberBetween(env, 2, 9));
            digits.arrayAppend(env).set(runtimeStaticObject.randomDigit(env));
            if (ZVal.strictEqualityCheck(digits.arrayGet(env, 1), "===", 1)) {
                digits.arrayAppend(env).set(runtimeStaticObject.randomDigitNot(env, 1));

            } else {
                digits.arrayAppend(env).set(runtimeStaticObject.randomDigit(env));
            }

            return ZVal.assign(NamespaceGlobal.join.env(env).call("", digits.getObject()).value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object formats =
                ZVal.arrayFromList(
                        "+1-{{areaCode}}-{{exchangeCode}}-####",
                        "+1 ({{areaCode}}) {{exchangeCode}}-####",
                        "+1-{{areaCode}}-{{exchangeCode}}-####",
                        "+1.{{areaCode}}.{{exchangeCode}}.####",
                        "+1{{areaCode}}{{exchangeCode}}####",
                        "{{areaCode}}-{{exchangeCode}}-####",
                        "({{areaCode}}) {{exchangeCode}}-####",
                        "1-{{areaCode}}-{{exchangeCode}}-####",
                        "{{areaCode}}.{{exchangeCode}}.####",
                        "{{areaCode}}-{{exchangeCode}}-####",
                        "({{areaCode}}) {{exchangeCode}}-####",
                        "1-{{areaCode}}-{{exchangeCode}}-####",
                        "{{areaCode}}.{{exchangeCode}}.####",
                        "{{areaCode}}-{{exchangeCode}}-#### x###",
                        "({{areaCode}}) {{exchangeCode}}-#### x###",
                        "1-{{areaCode}}-{{exchangeCode}}-#### x###",
                        "{{areaCode}}.{{exchangeCode}}.#### x###",
                        "{{areaCode}}-{{exchangeCode}}-#### x####",
                        "({{areaCode}}) {{exchangeCode}}-#### x####",
                        "1-{{areaCode}}-{{exchangeCode}}-#### x####",
                        "{{areaCode}}.{{exchangeCode}}.#### x####",
                        "{{areaCode}}-{{exchangeCode}}-#### x#####",
                        "({{areaCode}}) {{exchangeCode}}-#### x#####",
                        "1-{{areaCode}}-{{exchangeCode}}-#### x#####",
                        "{{areaCode}}.{{exchangeCode}}.#### x#####");

        public Object tollFreeAreaCodes = ZVal.arrayFromList(800, 844, 855, 866, 877, 888);

        public Object tollFreeFormats =
                ZVal.arrayFromList(
                        "{{tollFreeAreaCode}}-{{exchangeCode}}-####",
                        "({{tollFreeAreaCode}}) {{exchangeCode}}-####",
                        "1-{{tollFreeAreaCode}}-{{exchangeCode}}-####",
                        "{{tollFreeAreaCode}}.{{exchangeCode}}.####");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\en_US\\PhoneNumber")
                    .setLookup(
                            PhoneNumber.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("formats", "tollFreeAreaCodes", "tollFreeFormats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/en_US/PhoneNumber.php")
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
