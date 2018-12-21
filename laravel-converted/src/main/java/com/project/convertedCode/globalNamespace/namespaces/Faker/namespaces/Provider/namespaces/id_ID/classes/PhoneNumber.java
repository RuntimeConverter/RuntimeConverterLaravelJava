package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.id_ID.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/id_ID/PhoneNumber.php

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

    public static final Object CONST_class = "Faker\\Provider\\id_ID\\PhoneNumber";

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
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object formats =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "02# #### ###",
                                    "02## #### ###",
                                    "03## #### ###",
                                    "04## #### ###",
                                    "05## #### ###",
                                    "06## #### ###",
                                    "07## #### ###",
                                    "09## #### ###",
                                    "02# #### ####",
                                    "02## #### ####",
                                    "03## #### ####",
                                    "04## #### ####",
                                    "05## #### ####",
                                    "06## #### ####",
                                    "07## #### ####",
                                    "09## #### ####",
                                    "08## ### ###",
                                    "08## #### ###",
                                    "08## #### ####",
                                    "(+62) 8## ### ###",
                                    "(+62) 2# #### ###",
                                    "(+62) 2## #### ###",
                                    "(+62) 3## #### ###",
                                    "(+62) 4## #### ###",
                                    "(+62) 5## #### ###",
                                    "(+62) 6## #### ###",
                                    "(+62) 7## #### ###",
                                    "(+62) 8## #### ###",
                                    "(+62) 9## #### ###",
                                    "(+62) 2# #### ####",
                                    "(+62) 2## #### ####",
                                    "(+62) 3## #### ####",
                                    "(+62) 4## #### ####",
                                    "(+62) 5## #### ####",
                                    "(+62) 6## #### ####",
                                    "(+62) 7## #### ####",
                                    "(+62) 8## #### ####",
                                    "(+62) 9## #### ####");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\id_ID\\PhoneNumber")
                    .setLookup(
                            PhoneNumber.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("formats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/id_ID/PhoneNumber.php")
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
