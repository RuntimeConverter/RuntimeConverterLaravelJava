package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.pt_BR.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.pt_BR.functions.check_digit;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/pt_BR/Company.php

*/

public class Company
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .Company {

    public Company(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Company.class) {
            this.__construct(env, args);
        }
    }

    public Company(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "formatted",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object cnpj(RuntimeEnv env, Object... args) {
        Object formatted = assignParameter(args, 0, true);
        if (null == formatted) {
            formatted = true;
        }
        Object n = null;
        n =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "numerify",
                        Company.class,
                        "########0001");
        n = toStringR(n, env) + toStringR(check_digit.f.env(env).call(n).value(), env);
        n = toStringR(n, env) + toStringR(check_digit.f.env(env).call(n).value(), env);
        return ZVal.assign(
                ZVal.isTrue(formatted)
                        ? NamespaceGlobal.vsprintf
                                .env(env)
                                .call(
                                        "%d%d.%d%d%d.%d%d%d/%d%d%d%d-%d%d",
                                        NamespaceGlobal.str_split.env(env).call(n).value())
                                .value()
                        : n);
    }

    public static final Object CONST_class = "Faker\\Provider\\pt_BR\\Company";

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
                    .Company
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object formats =
                ZVal.arrayFromList(
                        "{{lastName}} {{companySuffix}}",
                        "{{lastName}}-{{lastName}}",
                        "{{lastName}} e {{lastName}}",
                        "{{lastName}} e {{lastName}} {{companySuffix}}",
                        "{{lastName}} Comercial Ltda.");

        public Object companySuffix =
                ZVal.arrayFromList("e Filhos", "e Associados", "Ltda.", "S.A.");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\pt_BR\\Company")
                    .setLookup(
                            Company.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("companySuffix", "formats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/pt_BR/Company.php")
                    .addExtendsClass("Faker\\Provider\\Company")
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
