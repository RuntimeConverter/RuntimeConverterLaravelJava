package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.zh_CN.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/zh_CN/Internet.php

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

    public static final Object CONST_class = "Faker\\Provider\\zh_CN\\Internet";

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
                        "gmail.com",
                        "yahoo.com",
                        "hotmail.com",
                        "126.com",
                        "163.com",
                        "qq.com",
                        "sohu.com",
                        "sina.com");

        public Object tld =
                ZVal.arrayFromList(
                        "com", "com", "com", "com", "com", "com", "biz", "info", "net", "org", "cn",
                        "com.cn", "edu.cn", "net.cn", "biz.cn", "gov.cn", "org.cn");

        public Object userNameFormats =
                ZVal.arrayFromList(
                        "{{word}}.{{word}}", "{{word}}_{{word}}", "{{word}}##", "?{{word}}");

        public Object emailFormats = ZVal.arrayFromList("{{userName}}@{{freeEmailDomain}}");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\zh_CN\\Internet")
                    .setLookup(
                            Internet.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "emailFormats", "freeEmailDomain", "tld", "userNameFormats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/zh_CN/Internet.php")
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
