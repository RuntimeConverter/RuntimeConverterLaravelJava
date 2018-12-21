package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.pt_BR.classes;

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
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/pt_BR/PhoneNumber.php

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
    public Object phoneNumber(RuntimeEnv env, Object... args) {
        Object method = null;
        method =
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, PhoneNumber.class)
                        .method("randomElement")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(ZVal.arrayFromList("cellphoneNumber", "landlineNumber"))
                        .value();
        return ZVal.assign(
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call("static::" + toStringR(method, env), true)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\pt_BR\\PhoneNumber";

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
            return ZVal.assign(
                    toStringR(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, PhoneNumber.class)
                                            .method("randomDigitNotNull")
                                            .call()
                                            .value(),
                                    env)
                            + toStringR(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, PhoneNumber.class)
                                            .method("randomDigitNotNull")
                                            .call()
                                            .value(),
                                    env));
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "formatted",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        public Object cellphone(RuntimeEnv env, Object... args) {
            Object formatted = assignParameter(args, 0, true);
            if (null == formatted) {
                formatted = true;
            }
            Object number = null;
            number =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, PhoneNumber.class)
                            .method("numerify")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, PhoneNumber.class)
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
                                                                            .pt_BR
                                                                            .classes
                                                                            .PhoneNumber
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .cellphoneFormats)
                                            .value())
                            .value();
            if (!ZVal.isTrue(formatted)) {
                number =
                        NamespaceGlobal.strtr
                                .env(env)
                                .call(number, ZVal.newArray(new ZPair("-", "")))
                                .value();
            }

            return ZVal.assign(number);
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "formatted",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        public Object landline(RuntimeEnv env, Object... args) {
            Object formatted = assignParameter(args, 0, true);
            if (null == formatted) {
                formatted = true;
            }
            Object number = null;
            number =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, PhoneNumber.class)
                            .method("numerify")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, PhoneNumber.class)
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
                                                                            .pt_BR
                                                                            .classes
                                                                            .PhoneNumber
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .landlineFormats)
                                            .value())
                            .value();
            if (!ZVal.isTrue(formatted)) {
                number =
                        NamespaceGlobal.strtr
                                .env(env)
                                .call(number, ZVal.newArray(new ZPair("-", "")))
                                .value();
            }

            return ZVal.assign(number);
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "formatted",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        public Object phone(RuntimeEnv env, Object... args) {
            Object formatted = assignParameter(args, 0, true);
            if (null == formatted) {
                formatted = true;
            }
            ReferenceContainer options = new BasicReferenceContainer(null);
            options.setObject(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, PhoneNumber.class)
                            .method("randomElement")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    ZVal.newArray(
                                            new ZPair(
                                                    0,
                                                    ZVal.newArray(
                                                            new ZPair(0, "cellphone"),
                                                            new ZPair(1, false))),
                                            new ZPair(
                                                    1,
                                                    ZVal.newArray(
                                                            new ZPair(0, "cellphone"),
                                                            new ZPair(1, true))),
                                            new ZPair(
                                                    2,
                                                    ZVal.newArray(
                                                            new ZPair(0, "landline"),
                                                            new ZPair(1, ZVal.getNull())))))
                            .value());
            return ZVal.assign(
                    function_call_user_func
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    "static::" + toStringR(options.arrayGet(env, 0), env),
                                    formatted,
                                    options.arrayGet(env, 1))
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "type")
        @ConvertedParameter(
            index = 1,
            name = "formatted",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        protected Object anyPhoneNumber(RuntimeEnv env, Object... args) {
            Object type = assignParameter(args, 0, false);
            Object formatted = assignParameter(args, 1, true);
            if (null == formatted) {
                formatted = true;
            }
            Object area = null;
            Object number = null;
            area =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, PhoneNumber.class)
                            .method("areaCode")
                            .call()
                            .value();
            number =
                    ZVal.assign(
                            ZVal.equalityCheck(type, "cellphone")
                                    ? StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, PhoneNumber.class)
                                            .method("cellphone")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(formatted)
                                            .value()
                                    : StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, PhoneNumber.class)
                                            .method("landline")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(formatted)
                                            .value());
            return ZVal.assign(
                    ZVal.isTrue(formatted)
                            ? "(" + toStringR(area, env) + ") " + toStringR(number, env)
                            : toStringR(area, env) + toStringR(number, env));
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "formatted",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        public Object cellphoneNumber(RuntimeEnv env, Object... args) {
            Object formatted = assignParameter(args, 0, true);
            if (null == formatted) {
                formatted = true;
            }
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, PhoneNumber.class)
                            .method("anyPhoneNumber")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call("cellphone", formatted)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "formatted",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        public Object landlineNumber(RuntimeEnv env, Object... args) {
            Object formatted = assignParameter(args, 0, true);
            if (null == formatted) {
                formatted = true;
            }
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, PhoneNumber.class)
                            .method("anyPhoneNumber")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call("landline", formatted)
                            .value());
        }

        @ConvertedMethod
        public Object phoneNumberCleared(RuntimeEnv env, Object... args) {
            Object method = null;
            method =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, PhoneNumber.class)
                            .method("randomElement")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(ZVal.arrayFromList("cellphoneNumber", "landlineNumber"))
                            .value();
            return ZVal.assign(
                    function_call_user_func
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call("static::" + toStringR(method, env), false)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object landlineFormats = ZVal.arrayFromList("2###-####", "3###-####");

        public Object cellphoneFormats = ZVal.arrayFromList("9####-####");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\pt_BR\\PhoneNumber")
                    .setLookup(
                            PhoneNumber.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("cellphoneFormats", "landlineFormats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/pt_BR/PhoneNumber.php")
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
