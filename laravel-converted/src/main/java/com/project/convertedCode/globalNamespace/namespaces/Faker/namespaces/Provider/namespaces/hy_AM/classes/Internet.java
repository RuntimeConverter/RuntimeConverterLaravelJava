package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.hy_AM.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/hy_AM/Internet.php

*/

public class Internet
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .Internet {

    public Internet(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Internet.class) {
            this.__construct(env, args);
        }
    }

    public Internet(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Faker\\Provider\\hy_AM\\Internet";

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
                    .Internet
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object freeEmailDomain =
                ZVal.arrayFromList(
                        "gmail.com", "yahoo.com", "hotmail.com", "yandex.ru", "mail.ru", "mail.am");

        public Object tld =
                ZVal.arrayFromList(
                        "com", "com", "am", "am", "am", "net", "org", "ru", "am", "am", "am");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\hy_AM\\Internet")
                    .setLookup(
                            Internet.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("freeEmailDomain", "tld")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/hy_AM/Internet.php")
                    .addExtendsClass("Faker\\Provider\\Internet")
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
