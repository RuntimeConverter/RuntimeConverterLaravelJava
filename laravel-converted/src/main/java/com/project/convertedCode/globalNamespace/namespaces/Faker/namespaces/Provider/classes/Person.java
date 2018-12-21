package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes.Base;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/Person.php

*/

public class Person extends Base {

    public Person(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Person.class) {
            this.__construct(env, args);
        }
    }

    public Person(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "gender",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object name(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object gender = assignParameter(args, 0, true);
        if (null == gender) {
            gender = ZVal.getNull();
        }
        Object format = null;
        if (ZVal.strictEqualityCheck(
                gender,
                "===",
                ClassConstantUtils.getConstantValueLateStatic(env, this, "GENDER_MALE"))) {
            format =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
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
                                                                    .classes
                                                                    .Person
                                                                    .RequestStaticProperties
                                                                    .class,
                                                            "maleNameFormats")))
                            .call(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Faker
                                                            .namespaces
                                                            .Provider
                                                            .classes
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .maleNameFormats)
                            .value();

        } else if (ZVal.strictEqualityCheck(
                gender,
                "===",
                ClassConstantUtils.getConstantValueLateStatic(env, this, "GENDER_FEMALE"))) {
            format =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
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
                                                                    .classes
                                                                    .Person
                                                                    .RequestStaticProperties
                                                                    .class,
                                                            "femaleNameFormats")))
                            .call(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Faker
                                                            .namespaces
                                                            .Provider
                                                            .classes
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .femaleNameFormats)
                            .value();

        } else {
            format =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
                            .method("randomElement")
                            .addReferenceArgs(
                                    rLastRefArgs =
                                            new RuntimeArgsWithReferences()
                                                    .add(
                                                            0,
                                                            handleReturnReference(
                                                                    function_array_merge
                                                                            .f
                                                                            .env(env)
                                                                            .call(
                                                                                    env
                                                                                            .getRequestStaticProperties(
                                                                                                    com.project
                                                                                                            .convertedCode
                                                                                                            .globalNamespace
                                                                                                            .namespaces
                                                                                                            .Faker
                                                                                                            .namespaces
                                                                                                            .Provider
                                                                                                            .classes
                                                                                                            .Person
                                                                                                            .RequestStaticProperties
                                                                                                            .class)
                                                                                            .maleNameFormats,
                                                                                    env
                                                                                            .getRequestStaticProperties(
                                                                                                    com.project
                                                                                                            .convertedCode
                                                                                                            .globalNamespace
                                                                                                            .namespaces
                                                                                                            .Faker
                                                                                                            .namespaces
                                                                                                            .Provider
                                                                                                            .classes
                                                                                                            .Person
                                                                                                            .RequestStaticProperties
                                                                                                            .class)
                                                                                            .femaleNameFormats)
                                                                            .value())))
                            .call(rLastRefArgs.get(0))
                            .value();
        }

        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        Person.class,
                        format));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "gender",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object firstName(RuntimeEnv env, Object... args) {
        Object gender = assignParameter(args, 0, true);
        if (null == gender) {
            gender = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(
                gender,
                "===",
                ClassConstantUtils.getConstantValueLateStatic(env, this, "GENDER_MALE"))) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
                            .method("firstNameMale")
                            .call()
                            .value());

        } else if (ZVal.strictEqualityCheck(
                gender,
                "===",
                ClassConstantUtils.getConstantValueLateStatic(env, this, "GENDER_FEMALE"))) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
                            .method("firstNameFemale")
                            .call()
                            .value());
        }

        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        Person.class,
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
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
                                                                        .classes
                                                                        .Person
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "firstNameFormat")))
                                .call(
                                        env.getRequestStaticProperties(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Faker
                                                                .namespaces
                                                                .Provider
                                                                .classes
                                                                .Person
                                                                .RequestStaticProperties
                                                                .class)
                                                .firstNameFormat)
                                .value()));
    }

    @ConvertedMethod
    public Object lastName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
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
                                                                .classes
                                                                .Person
                                                                .RequestStaticProperties
                                                                .class,
                                                        "lastName")))
                        .call(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Faker
                                                        .namespaces
                                                        .Provider
                                                        .classes
                                                        .Person
                                                        .RequestStaticProperties
                                                        .class)
                                        .lastName)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "gender",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object title(RuntimeEnv env, Object... args) {
        Object gender = assignParameter(args, 0, true);
        if (null == gender) {
            gender = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(
                gender,
                "===",
                ClassConstantUtils.getConstantValueLateStatic(env, this, "GENDER_MALE"))) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
                            .method("titleMale")
                            .call()
                            .value());

        } else if (ZVal.strictEqualityCheck(
                gender,
                "===",
                ClassConstantUtils.getConstantValueLateStatic(env, this, "GENDER_FEMALE"))) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
                            .method("titleFemale")
                            .call()
                            .value());
        }

        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        Person.class,
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
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
                                                                        .classes
                                                                        .Person
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "titleFormat")))
                                .call(
                                        env.getRequestStaticProperties(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Faker
                                                                .namespaces
                                                                .Provider
                                                                .classes
                                                                .Person
                                                                .RequestStaticProperties
                                                                .class)
                                                .titleFormat)
                                .value()));
    }

    public static final Object CONST_GENDER_MALE = "male";

    public static final Object CONST_GENDER_FEMALE = "female";

    public static final Object CONST_class = "Faker\\Provider\\Person";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Base.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object firstNameMale(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
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
                                                            .classes
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .firstNameMale)
                            .value());
        }

        @ConvertedMethod
        public Object firstNameFemale(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
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
                                                            .classes
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .firstNameFemale)
                            .value());
        }

        @ConvertedMethod
        public Object titleMale(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
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
                                                            .classes
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .titleMale)
                            .value());
        }

        @ConvertedMethod
        public Object titleFemale(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
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
                                                            .classes
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .titleFemale)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object titleFormat = ZVal.arrayFromList("{{titleMale}}", "{{titleFemale}}");

        public Object firstNameFormat =
                ZVal.arrayFromList("{{firstNameMale}}", "{{firstNameFemale}}");

        public Object maleNameFormats = ZVal.arrayFromList("{{firstNameMale}} {{lastName}}");

        public Object femaleNameFormats = ZVal.arrayFromList("{{firstNameFemale}} {{lastName}}");

        public Object firstNameMale = ZVal.arrayFromList("John");

        public Object firstNameFemale = ZVal.arrayFromList("Jane");

        public Object lastName = ZVal.arrayFromList("Doe");

        public Object titleMale = ZVal.arrayFromList("Mr.", "Dr.", "Prof.");

        public Object titleFemale = ZVal.arrayFromList("Mrs.", "Ms.", "Miss", "Dr.", "Prof.");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\Person")
                    .setLookup(
                            Person.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "femaleNameFormats",
                            "firstNameFemale",
                            "firstNameFormat",
                            "firstNameMale",
                            "lastName",
                            "maleNameFormats",
                            "titleFemale",
                            "titleFormat",
                            "titleMale")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/Person.php")
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
