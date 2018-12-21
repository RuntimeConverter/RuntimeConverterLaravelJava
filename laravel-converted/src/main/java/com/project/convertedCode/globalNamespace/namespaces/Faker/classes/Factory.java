package com.project.convertedCode.globalNamespace.namespaces.Faker.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Faker.classes.Generator;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Factory.php

*/

public class Factory extends RuntimeClassBase {

    public Factory(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Factory(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_DEFAULT_LOCALE = "en_US";

    public static final Object CONST_class = "Faker\\Factory";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "locale")
        public Object create(RuntimeEnv env, Object... args) {
            Object locale = assignParameter(args, 0, true);
            if (null == locale) {
                locale = CONST_DEFAULT_LOCALE;
            }
            Object providerClassName = null;
            Object provider = null;
            Object generator = null;
            generator = new Generator(env);
            for (ZPair zpairResult67 :
                    ZVal.getIterable(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Faker
                                                    .classes
                                                    .Factory
                                                    .RequestStaticProperties
                                                    .class)
                                    .defaultProviders,
                            env,
                            true)) {
                provider = ZVal.assign(zpairResult67.getValue());
                providerClassName = runtimeStaticObject.getProviderClassname(env, provider, locale);
                env.callMethod(
                        generator,
                        "addProvider",
                        Factory.class,
                        env.createNew(providerClassName, generator));
            }

            return ZVal.assign(generator);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "provider")
        @ConvertedParameter(index = 1, name = "locale")
        protected Object getProviderClassname(RuntimeEnv env, Object... args) {
            Object provider = assignParameter(args, 0, false);
            Object locale = assignParameter(args, 1, true);
            if (null == locale) {
                locale = "";
            }
            Object providerClass = null;
            if (ZVal.isTrue(
                    providerClass =
                            runtimeStaticObject.findProviderClassname(env, provider, locale))) {
                return ZVal.assign(providerClass);
            }

            if (ZVal.isTrue(
                    providerClass =
                            runtimeStaticObject.findProviderClassname(
                                    env,
                                    provider,
                                    ClassConstantUtils.getConstantValueLateStatic(
                                            env, this, "DEFAULT_LOCALE")))) {
                return ZVal.assign(providerClass);
            }

            if (ZVal.isTrue(
                    providerClass = runtimeStaticObject.findProviderClassname(env, provider))) {
                return ZVal.assign(providerClass);
            }

            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Unable to find provider \"%s\" with locale \"%s\"",
                                            provider, locale)
                                    .value()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "provider")
        @ConvertedParameter(index = 1, name = "locale")
        protected Object findProviderClassname(RuntimeEnv env, Object... args) {
            Object provider = assignParameter(args, 0, false);
            Object locale = assignParameter(args, 1, true);
            if (null == locale) {
                locale = "";
            }
            Object providerClass = null;
            providerClass =
                    "Faker\\"
                            + toStringR(
                                    ZVal.isTrue(locale)
                                            ? function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call("Provider\\%s\\%s", locale, provider)
                                                    .value()
                                            : function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call("Provider\\%s", provider)
                                                    .value(),
                                    env);
            if (function_class_exists.f.env(env).call(providerClass, true).getBool()) {
                return ZVal.assign(providerClass);
            }

            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object defaultProviders =
                ZVal.arrayFromList(
                        "Address",
                        "Barcode",
                        "Biased",
                        "Color",
                        "Company",
                        "DateTime",
                        "File",
                        "HtmlLorem",
                        "Image",
                        "Internet",
                        "Lorem",
                        "Miscellaneous",
                        "Payment",
                        "Person",
                        "PhoneNumber",
                        "Text",
                        "UserAgent",
                        "Uuid");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Factory")
                    .setLookup(
                            Factory.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("defaultProviders")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Factory.php")
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
