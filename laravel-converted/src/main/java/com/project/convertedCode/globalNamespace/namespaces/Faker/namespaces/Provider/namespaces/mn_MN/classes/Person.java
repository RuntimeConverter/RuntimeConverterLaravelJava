package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.mn_MN.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/mn_MN/Person.php

*/

public class Person
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .Person {

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
    public Object idNumber(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
                        .method("numerify")
                        .addReferenceArgs(
                                rLastRefArgs =
                                        new RuntimeArgsWithReferences()
                                                .add(
                                                        0,
                                                        handleReturnReference(
                                                                env.callMethod(
                                                                        toObjectR(this)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("generator")
                                                                                .value(),
                                                                        "parse",
                                                                        Person.class,
                                                                        env
                                                                                .getRequestStaticProperties(
                                                                                        com.project
                                                                                                .convertedCode
                                                                                                .globalNamespace
                                                                                                .namespaces
                                                                                                .Faker
                                                                                                .namespaces
                                                                                                .Provider
                                                                                                .namespaces
                                                                                                .mn_MN
                                                                                                .classes
                                                                                                .Person
                                                                                                .RequestStaticProperties
                                                                                                .class)
                                                                                .idNumberFormat))))
                        .call(rLastRefArgs.get(0))
                        .value());
    }

    @ConvertedMethod
    public Object alphabet(RuntimeEnv env, Object... args) {
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
                                                                .namespaces
                                                                .mn_MN
                                                                .classes
                                                                .Person
                                                                .RequestStaticProperties
                                                                .class,
                                                        "alphabet")))
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
                                                        .mn_MN
                                                        .classes
                                                        .Person
                                                        .RequestStaticProperties
                                                        .class)
                                        .alphabet)
                        .value());
    }

    @ConvertedMethod
    public Object namePrefix(RuntimeEnv env, Object... args) {
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
                                                                .namespaces
                                                                .mn_MN
                                                                .classes
                                                                .Person
                                                                .RequestStaticProperties
                                                                .class,
                                                        "namePrefix")))
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
                                                        .mn_MN
                                                        .classes
                                                        .Person
                                                        .RequestStaticProperties
                                                        .class)
                                        .namePrefix)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\mn_MN\\Person";

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
                    .Person
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object firstNameMale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u0410\u0433\u044C-\u041E\u0434",
                                    "\u0410\u0434\u0430\u0440\u0445\u0438\u0434\u0430\u0439",
                                    "\u0410\u0434\u0445\u0438\u0440\u0430\u0433",
                                    "\u0410\u0436\u0430\u0439",
                                    "\u0410\u0437-\u041E\u0440\u0433\u0438\u043B",
                                    "\u0410\u043B\u0430\u0433-\u041D\u0430\u044F\u0430",
                                    "\u0410\u043B\u0430\u0445\u0443\u0448-\u0434\u0438\u0433\u0438\u0442\u0445\u0443\u0440\u0438",
                                    "\u0410\u043B\u0434\u0438\u044D\u0440",
                                    "\u0410\u043B\u0442\u0430\u043D\u043D\u0430\u0440",
                                    "\u0410\u043B\u0445\u0443\u0439",
                                    "\u0410\u043B\u0447\u0438",
                                    "\u0410\u043B\u0447\u0438\u0434\u0430\u0439",
                                    "\u0410\u043C\u0430\u043B",
                                    "\u0410\u043C\u0431\u0430\u0433\u0430\u0439",
                                    "\u0410\u043C\u0438\u043D-\u042D\u0440\u0434\u044D\u043D\u044D",
                                    "\u0410\u043D\u0445\u043B\u0430\u043D",
                                    "\u0410\u0440\u0430\u0447\u0438\u0430\u043D",
                                    "\u0410\u0440\u0433\u0430\u0441\u0443\u043D",
                                    "\u0410\u0440\u0438\u043D",
                                    "\u0410\u0440\u0443\u043B\u0430\u0434",
                                    "\u0410\u0440\u0445\u0430\u0439 \u0425\u0430\u0441\u0430\u0440",
                                    "\u0410\u0443\u0447\u0443",
                                    "\u0410\u0447\u0438\u0433-\u0427\u0438\u0440\u04AF\u043D",
                                    "\u0410\u0447\u0438\u0433-\u0428\u0438\u0440\u04AF\u043D",
                                    "\u0410\u0448\u0430-\u0445\u0430\u043C\u0431\u0443",
                                    "\u0411\u0430\u0430\u0440\u044C\u0434\u0430\u0439",
                                    "\u0411\u0430\u0433\u0443-\u0427\u043E\u0440\u0445\u0438",
                                    "\u0411\u0430\u0439\u0448\u0438\u043D\u0445\u043E\u0440",
                                    "\u0411\u0430\u043B\u0430",
                                    "\u0411\u0430\u043B\u0430-\u0427\u044D\u0440\u0431\u0438",
                                    "\u0411\u0430\u043B\u0445\u0430\u0447\u0438",
                                    "\u0411\u0430\u0440\u0443\u043B\u0430",
                                    "\u0411\u0430\u0440\u0443\u043B\u0430\u0434\u0430\u0439",
                                    "\u0411\u0430\u0445\u0430\u0436\u0438",
                                    "\u0411\u0430\u044F\u0440\u043C\u0430\u0433\u043D\u0430\u0439",
                                    "\u0411\u043E\u0434\u043E\u043D\u0447\u0430\u0440",
                                    "\u0411\u043E\u0440\u0436\u0438\u0433\u0438\u0434\u0430\u0439",
                                    "\u0411\u043E\u0440\u043E\u043B\u0434\u0430\u0439",
                                    "\u0411\u043E\u0440\u043E\u043B\u0434\u0430\u0439\u0441\u0443\u044F\u043B\u0431\u0438",
                                    "\u0411\u0443\u0436\u0438\u0440",
                                    "\u0411\u0443\u0439\u0440\u0430\u0433",
                                    "\u0411\u0443\u043B\u0443\u0433\u0430\u043D",
                                    "\u0411\u0443\u0440\u044C\u0431\u0443\u043B\u0447\u0438\u0440\u0443",
                                    "\u0411\u0443\u0442\u0443",
                                    "\u0411\u0443\u0445\u0430-\u0422\u04E9\u043C\u04E9\u0440",
                                    "\u0411\u0443\u0445\u0430\u0442\u0430\u0439",
                                    "\u0411\u0443\u0445\u0430\u0442\u0443",
                                    "\u0411\u0443\u0447\u0430\u0440\u0430\u043D",
                                    "\u0411\u044D\u0441\u04AF\u0434\u044D\u0439",
                                    "\u0411\u04AF\u043B\u0442\u044D\u0447\u04AF",
                                    "\u0411\u04AF\u0440\u0438",
                                    "\u0411\u04AF\u0440\u0438-\u0411\u04E9\u0445\u04E9",
                                    "\u0411\u04AF\u0440\u0438\u0431\u04E9\u0445",
                                    "\u0411\u04AF\u0445\u044D\u0434\u044D\u0439",
                                    "\u0411\u04E9\u0433\u044D\u043D",
                                    "\u0413\u0438\u043B\u04AF\u0433\u044D\u0442\u044D\u0439",
                                    "\u0413\u044D\u043D\u0438\u0433\u044D\u0434\u044D\u0439",
                                    "\u0413\u04AF\u043D\u0433\u0443\u0430",
                                    "\u0413\u04AF\u0440-\u0425\u0430\u043D",
                                    "\u0413\u04AF\u0447\u04AF\u0433\u04AF\u0440",
                                    "\u0413\u04AF\u0447\u04AF\u0434",
                                    "\u0414\u0430\u0439\u0440",
                                    "\u0414\u0430\u0439\u0440-\u04AE\u0441\u04AF\u043D",
                                    "\u0414\u0430\u043B\u0434\u0443\u0440\u0445\u0430\u043D",
                                    "\u0414\u0430\u043C\u0430\u0447\u0430",
                                    "\u0414\u0430\u0440\u0431\u0430\u0439",
                                    "\u0414\u0430\u0440\u0438\u0434\u0430\u0439",
                                    "\u0414\u0430\u0443\u043D",
                                    "\u0414\u043E\u0431\u0443",
                                    "\u0414\u043E\u0433\u043E\u043B\u0434\u0430\u0439",
                                    "\u0414\u043E\u0433\u043E\u043B\u0445\u0443",
                                    "\u0414\u043E\u0434\u0430\u0439",
                                    "\u0414\u043E\u0440\u0438\u0431\u04E9\u0445\u04E9",
                                    "\u0414\u0443\u0432\u0430",
                                    "\u0414\u044D\u0433\u044D\u0439",
                                    "\u0414\u044D\u0439-\u0421\u044D\u0446\u044D\u043D",
                                    "\u0414\u04E9\u0440\u0431\u0443\u0439",
                                    "\u0414\u04E9\u0440\u0431\u044D\u0439",
                                    "\u0415\u0433\u04AF",
                                    "\u0415\u0434\u0438-\u0422\u043E\u0431\u043B\u0443\u0433",
                                    "\u0415\u0441\u04AF\u043D\u0445\u044D\u0439",
                                    "\u0415\u0445\u044D\u0439-\u0425\u043E\u043D\u0442\u0430\u0433\u0430\u0440",
                                    "\u0416\u0430\u0436\u0438\u0440\u0430\u0434\u0430\u0439",
                                    "\u0416\u0430\u043B\u0430\u043B\u0434\u0438\u043D",
                                    "\u0416\u0430\u043B\u0438",
                                    "\u0416\u0430\u043B\u0438\u0431\u0443\u0445\u0430",
                                    "\u0416\u0430\u043B\u043C\u0430\u043D",
                                    "\u0416\u0430\u0440\u0447\u0438\u0443\u0434\u0430\u0439",
                                    "\u0416\u0430\u0442\u0430\u0439",
                                    "\u0416\u0430\u0443\u0440\u044C\u0434\u0430\u0439",
                                    "\u0416\u0430\u0445\u0430-\u0425\u0430\u043C\u0431\u0443",
                                    "\u0416\u0430\u0445\u0430\u0445\u0430\u043C\u0431\u0443",
                                    "\u0416\u0438\u0431\u0433\u044D",
                                    "\u0416\u0438\u0431\u044D\u0433\u044D",
                                    "\u0416\u0438\u0434\u0430\u0439",
                                    "\u0416\u0438\u0434\u044D\u0440",
                                    "\u0416\u0438\u0445\u04AF\u0440",
                                    "\u0416\u0443\u0431\u0445\u0430\u043D",
                                    "\u0416\u0443\u043D\u0441\u043E",
                                    "\u0416\u044D\u0433\u044D\u0439",
                                    "\u0416\u044D\u0445\u04AF",
                                    "\u0416\u044D\u04AF\u043D",
                                    "\u0416\u04AF\u0440\u0447\u0438\u0434\u044D\u0439",
                                    "\u0417\u043E\u0447\u0438",
                                    "\u0417\u04AF\u0442\u0433\u044D\u043B\u0431\u04E9\u0445",
                                    "\u0418\u0432\u0433\u044D\u044D\u043B",
                                    "\u0418\u0434\u0443\u0445\u0430\u0434\u0430\u0439",
                                    "\u0418\u0434\u04AF\u04AF\u0434",
                                    "\u0418\u043B\u0430\u0445\u0443",
                                    "\u0418\u043B\u0443\u0433\u0430\u0439",
                                    "\u0418\u043D\u0430\u043B",
                                    "\u0418\u043D\u0430\u043B\u0447",
                                    "\u0418\u043D\u0430\u043D\u0447\u0430",
                                    "\u0418\u0442\u04AF\u0440\u0433\u044D\u043D",
                                    "\u0418\u0445-\u041D\u044D\u04AF\u0440\u0438\u043D",
                                    "\u0418\u0445-\u0427\u044D\u0440\u044D\u043D",
                                    "\u0418\u0445\u043D\u04AF\u0434\u044D\u043D",
                                    "\u0418\u0445\u0447\u0438\u0440\u044D\u043D",
                                    "\u041A\u0438\u0448\u043B\u0438\u0433",
                                    "\u041B\u0430\u0431\u043B\u0430\u0445",
                                    "\u041C\u0430\u043D\u0433\u0430\u0439",
                                    "\u041C\u0430\u043D\u0433\u0443\u0434\u0430\u0439",
                                    "\u041C\u0430\u0441\u0445\u0443\u0434",
                                    "\u041C\u043E\u043B\u043E\u0440",
                                    "\u041C\u043E\u043B\u043E\u0440 \u044D\u0440\u0434\u044D\u043D\u044D",
                                    "\u041C\u043E\u0440\u0438\u0447\u0438",
                                    "\u041C\u043E\u0440\u043E\u0445\u0430",
                                    "\u041C\u0443\u043B\u0445\u0430\u043B\u0445\u0443",
                                    "\u041C\u0443\u0445\u0443\u043B\u0430\u0439 \u0431\u0443\u044E\u0443 \u041C\u0443\u0445\u0443\u043B\u0438",
                                    "\u041C\u044D\u0433\u044D\u0442\u04AF",
                                    "\u041C\u044D\u0433\u04AF\u0436\u0438\u043D",
                                    "\u041C\u044D\u043B\u0438\u0433",
                                    "\u041C\u044D\u043D\u0433\u0438\u0442\u04AF",
                                    "\u041C\u044D\u043D\u043B\u0438\u0433",
                                    "\u041C\u044D\u043D\u044D\u043D",
                                    "\u041C\u04AF\u0433\u044D",
                                    "\u041C\u04AF\u043B\u0445\u044D-\u0442\u043E\u0442\u0430\u0433",
                                    "\u041C\u04AF\u043D\u0442\u04AF\u04AF\u0440",
                                    "\u041C\u04E9\u0447\u0438",
                                    "\u041D\u0430\u0440\u0438\u0439\u043D-\u0433\u044D\u0433\u044D\u044D\u043D",
                                    "\u041D\u0430\u0440\u0438\u043D\u0442\u043E\u043E\u0440\u0438\u043B",
                                    "\u041D\u0430\u0445\u0443",
                                    "\u041D\u043E\u0451\u0433\u0438\u0434\u0430\u0439",
                                    "\u041D\u044D\u04AF\u0434\u044D\u0439\u043D \u0426\u0430\u0433\u0430\u0430\u043D",
                                    "\u041E\u0433\u0434\u0430",
                                    "\u041E\u0433\u043E\u0442\u043E\u0440",
                                    "\u041E\u043B\u0430\u0440",
                                    "\u041E\u043B\u0434\u0445\u0430\u0440",
                                    "\u041E\u043D\u0433\u0443\u0443\u0434",
                                    "\u041E\u0440\u043E\u043D\u0430\u0440",
                                    "\u041E\u0440\u043E\u043D\u0430\u0440\u0442\u0430\u0439",
                                    "\u041E\u0445\u0438\u043D\u0431\u0430\u0440\u0445\u0430\u0433",
                                    "\u04E8\u043B\u044D\u0431\u044D\u0433",
                                    "\u04E8\u043D\u0433\u04AF\u0440",
                                    "\u04E8\u044D\u043B\u044D\u043D",
                                    "\u0421\u0430\u043B\u044C-\u0425\u0430\u0447\u0430\u0443",
                                    "\u0421\u0430\u0440\u0433\u0430\u0439",
                                    "\u0421\u0430\u0447\u0430-\u0411\u044D\u0445\u0438",
                                    "\u0421\u0430\u0447\u0443\u0443\u0440",
                                    "\u0421\u043E\u0440\u0445\u0430\u0442\u0443",
                                    "\u0421\u043E\u0440\u0445\u043E\u043D\u0448\u0430\u0440",
                                    "\u0421\u043E\u0445\u043E-\u0421\u044D\u0446\u044D\u043D",
                                    "\u0421\u044D\u043C\u0441\u044D\u0447\u04AF\u043B\u044D",
                                    "\u0421\u044D\u0446\u044D-\u0414\u043E\u043C\u043E\u0433",
                                    "\u0421\u044D\u0447\u0438\u04AF\u0440",
                                    "\u0421\u044D\u0447\u044D-\u0411\u044D\u0445\u0438",
                                    "\u0421\u04AF\u0431\u044D\u0445\u044D\u0439",
                                    "\u0421\u04AF\u0439\u0445\u044D\u0442\u04AF",
                                    "\u0421\u04AF\u0445\u044D\u0445\u044D\u0439",
                                    "\u0421\u04AF\u0445\u044D\u0445\u044D\u0439-\u0416\u0430\u0443\u043D",
                                    "\u0421\u04AF\u0445\u044D\u0445\u044D\u0439-\u0416\u044D\u04AF\u043D",
                                    "\u0421\u04E9\u043D\u0438\u0434",
                                    "\u0422\u0430\u0439-\u0422\u04E9\u043C\u04E9\u0440",
                                    "\u0422\u0430\u0439\u0447\u0430\u0440",
                                    "\u0422\u0430\u0439\u0447\u0438\u0443\u0434\u0430\u0439",
                                    "\u0422\u0430\u0439\u0447\u0443",
                                    "\u0422\u0430\u043C\u0430\u0447\u0430",
                                    "\u0422\u0430\u043C\u0438\u0440",
                                    "\u0422\u0430\u0440\u0433\u0443\u0434\u0430\u0439",
                                    "\u0422\u0430\u0442\u0430\u0442\u0443\u043D\u0433\u0430",
                                    "\u0422\u043E\u0431\u0443\u0445\u0430",
                                    "\u0422\u043E\u0433\u043E\u0447\u0430\u0440",
                                    "\u0422\u043E\u0433\u0442\u043E\u0430",
                                    "\u0422\u043E\u0433\u0443\u0447\u0430\u0440",
                                    "\u0422\u043E\u0434\u043E\u0439\u043D-\u0413\u044D\u0440\u0442\u0438",
                                    "\u0422\u043E\u0434\u0441\u0430\u0445\u0430",
                                    "\u0422\u043E\u043B\u0443\u043D",
                                    "\u0422\u043E\u0440\u0431\u0438\u0442\u0430\u0448",
                                    "\u0422\u043E\u0440\u0433\u043E\u043B\u0436\u0438\u043D",
                                    "\u0422\u043E\u0440\u043E\u0439\u043D \u043E\u0442\u0447\u0438\u0433\u043E\u043D",
                                    "\u0422\u0443\u0433\u0443\u0434\u0430\u0439",
                                    "\u0422\u0443\u043D\u0431\u0438\u043D\u0430\u0439",
                                    "\u0422\u0443\u043D\u0445\u0443\u0439\u0434\u0430\u0439",
                                    "\u0422\u0443\u0441\u0430\u0445",
                                    "\u0422\u0443\u0445\u0443",
                                    "\u0422\u044D\u0432 \u0442\u044D\u043D\u0433\u044D\u0440",
                                    "\u0422\u044D\u043B\u044D\u0433\u044D\u0442\u04AF",
                                    "\u0422\u044D\u043C\u04AF\u0436\u0438\u043D-\u04AE\u0433\u044D",
                                    "\u0422\u044D\u043C\u04AF\u0436\u0438\u043D\u04AF\u0433\u044D",
                                    "\u0422\u044D\u0440\u0445\u044D\u0433",
                                    "\u0422\u04AF\u0433\u044D",
                                    "\u0422\u04AF\u0433\u044D-\u041C\u0430\u0445\u0430",
                                    "\u0423\u0434\u0443\u0442\u0430\u0439",
                                    "\u0423\u0439\u0433\u0443\u0440\u0442\u0430\u0439",
                                    "\u0423\u0440\u0443\u0443\u0434\u0430\u0439",
                                    "\u0423\u0441\u0443\u043D",
                                    "\u0423\u0445\u0443\u043D\u0430",
                                    "\u04AE\u0433\u044D",
                                    "\u04AE\u0433\u044D\u043B\u044D\u043D",
                                    "\u04AE\u043D\u0433\u04AF\u0440",
                                    "\u0425\u0430\u0430\u0442\u0430\u0439 \u0414\u0430\u0440\u043C\u0430\u043B\u0430",
                                    "\u0425\u0430\u0431\u0438\u0447",
                                    "\u0425\u0430\u0431\u0442\u0443\u0440\u0445\u0430\u0441",
                                    "\u0425\u0430\u0434\u0438\u0433\u0438",
                                    "\u0425\u0430\u0439\u0434\u0443",
                                    "\u0425\u0430\u043B\u0436\u0430",
                                    "\u0425\u0430\u043B\u0438\u0443\u0434\u0430\u0440",
                                    "\u0425\u0430\u043D-\u042D\u0440\u0434\u044D\u043D\u044D",
                                    "\u0425\u0430\u043D\u0433\u0438\u0430\u0434\u0430\u0439",
                                    "\u0425\u0430\u043D\u0445\u0430\u0440\u0445\u0430\u043D",
                                    "\u0425\u0430\u0440-\u0425\u0430\u0434\u0430\u0430\u043D",
                                    "\u0425\u0430\u0440\u0430\u0443\u0434\u0430\u0440",
                                    "\u0425\u0430\u0440\u0430\u0447\u0430\u0440",
                                    "\u0425\u0430\u0440\u0445\u0430\u0439",
                                    "\u0425\u0430\u0440\u0445\u0430\u043B\u0437\u0430\u043D",
                                    "\u0425\u0430\u0440\u0445\u0438\u0440\u04AF\u0433\u044D",
                                    "\u0425\u0430\u0440\u0447\u0443",
                                    "\u0425\u0430\u0443\u0440\u0430\u043D",
                                    "\u0425\u0430\u0447\u0438-\u0425\u04AF\u043B\u04AF\u0433",
                                    "\u0425\u0430\u0447\u0438\u0443",
                                    "\u0425\u0430\u0447\u0438\u0443\u043D",
                                    "\u0425\u0430\u0447\u0443\u043B\u0430",
                                    "\u0425\u0430\u0448\u0438",
                                    "\u0425\u0430\u0448\u0438\u043D",
                                    "\u0425\u0438\u043D\u0433\u0438\u0430\u0434\u0430\u0439",
                                    "\u0425\u0438\u0440\u0430\u0442\u0430\u0439",
                                    "\u0425\u0438\u0440\u0438\u043B\u0442\u0443\u0433",
                                    "\u0425\u0438\u0440\u043C\u0430\u0443",
                                    "\u0425\u0438\u0448\u0438\u043B\u0438\u0433",
                                    "\u0425\u043E\u0434\u0443\u043D",
                                    "\u0426\u0430\u0433\u0430\u0430\u043D\u0433\u0443\u0430",
                                    "\u0427\u0430\u043D\u0430\u0439",
                                    "\u0427\u0430\u0443\u0436\u0438\u043D",
                                    "\u0427\u0430\u0443\u0440\u0445\u0430\u043D",
                                    "\u0427\u0430\u0445\u0443\u0440\u0445\u0430\u043D",
                                    "\u0427\u0438\u0433\u0443",
                                    "\u0427\u0438\u043B\u0433\u0443\u0442\u0430\u0439",
                                    "\u0427\u0438\u043B\u044D\u0433\u044D\u0440\u0431\u04E9\u0445",
                                    "\u0427\u0438\u043B\u044D\u0433\u04AF\u0442\u044D\u043D-\u0422\u0430\u0445\u0438",
                                    "\u0427\u0438\u043B\u044D\u0434\u04AF",
                                    "\u0427\u0438\u043D\u0431\u0430\u0439",
                                    "\u0427\u0438\u0440\u0445\u0430\u0439",
                                    "\u0427\u0438\u0440\u0445\u0438\u0442\u044D\u0439",
                                    "\u0427\u0438\u0445\u0430\u0440\u0430\u0439",
                                    "\u0427\u0438\u0445\u0438\u0442\u0430\u0439",
                                    "\u0427\u043E\u0440\u043C\u0430\u0433\u0430\u043D",
                                    "\u0427\u043E\u0451\u0433 \u0426\u0430\u0433\u0430\u0430\u043D",
                                    "\u0427\u0443\u0443 \u043C\u044D\u0440\u0433\u044D\u043D",
                                    "\u0427\u04AF\u043B\u0433\u044D\u0434\u044D\u0439",
                                    "\u0428\u0438\u0436\u0443\u0443\u0434\u0430\u0439",
                                    "\u0428\u0438\u043D\u0447",
                                    "\u0428\u0438\u043D\u044D\u0441\u043E\u0447\u0438",
                                    "\u0428\u0438\u0440\u0430\u0445\u0443\u043B",
                                    "\u042D\u0434\u0438",
                                    "\u042D\u043B\u0436\u0433\u044D\u0434\u044D\u0439",
                                    "\u042D\u043B\u0445\u0443\u0434\u0443\u0440",
                                    "\u042D\u0440\u0445\u0445\u0430\u0440",
                                    "\u042D\u0445\u043B\u044D\u043B\u0441\u0430\u0439\u0445\u0430\u043D",
                                    "\u042E-\u0425\u0443\u043D\u0430\u043D",
                                    "\u042E\u0440\u04AF\u0445\u0430\u043D",
                                    "\u042F\u0434\u0438\u0440",
                                    "\u042F\u043B\u0430\u0432\u0430\u0447",
                                    "\u042F\u043B\u0431\u0430\u0433");
                        });

        public Object firstNameFemale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u0410\u0433\u044C-\u041E\u0434",
                                    "\u0410\u043B\u0430\u0433\u0430\u0431\u044D\u0445",
                                    "\u0410\u043B\u0430\u043B\u0442\u0443\u043D",
                                    "\u0410\u043B\u0430\u0445\u0447\u0438\u0442",
                                    "\u0410\u043C\u0438\u043D-\u042D\u0440\u0434\u044D\u043D\u044D",
                                    "\u0410\u043D\u0445\u043B\u0430\u043D",
                                    "\u0411\u0430\u0440\u0433\u0443\u0436\u0438\u043D-\u0413\u0443\u0430",
                                    "\u0411\u0430\u044F\u0440\u043C\u0430\u0433\u043D\u0430\u0439",
                                    "\u0411\u043E\u0440\u043E\u0433\u0447\u0438\u043D-\u0413\u0443\u0430",
                                    "\u0413\u04AF\u0440\u0431\u044D\u0441\u04AF",
                                    "\u0414\u04E9\u0440\u0433\u044D\u043D\u044D",
                                    "\u0418\u0431\u0430\u0433\u0430",
                                    "\u0418\u0432\u0433\u044D\u044D\u043B",
                                    "\u041C\u0430\u0430\u044F\u0430\u0434\u044D\u044D\u0432\u0438\u0439",
                                    "\u041C\u043E\u043B\u043E",
                                    "\u041C\u043E\u043D\u0433\u043E\u043B\u0436\u0438\u043D-\u0413\u0443\u0430",
                                    "\u041E\u043B\u0443\u0439\u0445\u0430\u043D",
                                    "\u041E\u0440\u0431\u0430\u0439",
                                    "\u04E8\u044D\u043B\u04AF\u043D-\u04AE\u0436\u0438\u043D",
                                    "\u0421\u0430\u0440\u0433\u0430\u0439",
                                    "\u0421\u043E\u0440\u0445\u0430\u0433\u0442\u0430\u043D",
                                    "\u0421\u043E\u0445\u0430\u0442\u0430\u0439",
                                    "\u0421\u043E\u0447\u0438\u0433\u044D\u043B",
                                    "\u0422\u0430\u043C\u0438\u0440",
                                    "\u0422\u0443\u0445\u0430\u0439",
                                    "\u0423\u0436\u0430\u0443\u0440-\u04AE\u0436\u0438\u043D",
                                    "\u0425\u043E\u0436\u0438\u043D\u0431\u044D\u0445",
                                    "\u0425\u043E\u0440\u0438\u0436\u0438\u043D",
                                    "\u0425\u0443\u0430\u0433\u0447\u0438\u043D",
                                    "\u0425\u0443\u0442\u0443\u0433\u0442\u0430\u0439",
                                    "\u0425\u0443\u0443\u0440\u0447\u0438\u043D",
                                    "\u0426\u043E\u0442\u0430\u043D",
                                    "\u0427\u0430\u0430\u043B\u0443\u043D",
                                    "\u0427\u0430\u0443\u0440\u0431\u044D\u0445",
                                    "\u0427\u044D\u0447\u044D\u0439\u0445\u044D\u043D",
                                    "\u042D\u0431\u044D\u0445\u044D\u0439");
                        });

        public Object namePrefix =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u0410", "\u0411", "\u0412", "\u0413", "\u0414", "\u0415",
                                    "\u0401", "\u0416", "\u0417", "\u0418", "\u041A", "\u041B",
                                    "\u041C", "\u041D", "\u041E", "\u04E8", "\u041F", "\u0420",
                                    "\u0421", "\u0422", "\u0423", "\u04AE", "\u0424", "\u0425",
                                    "\u0426", "\u0427", "\u0428", "\u042D", "\u042E", "\u042F");
                        });

        public Object alphabet =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u0410", "\u041B", "\u0425", "\u0411", "\u041C", "\u0426",
                                    "\u0412", "\u041D", "\u0427", "\u0413", "\u041E", "\u0428",
                                    "\u0414", "\u04E8", "\u0429", "\u0415", "\u041F", "\u042A",
                                    "\u0401", "\u0420", "\u042B", "\u0416", "\u0421", "\u042C",
                                    "\u0417", "\u0422", "\u042D", "\u0418", "\u0423", "\u042E",
                                    "\u0419", "\u04AE", "\u042F", "\u041A", "\u0424");
                        });

        public Object maleNameFormats = ZVal.arrayFromList("{{namePrefix}}.{{firstNameMale}}");

        public Object femaleNameFormats = ZVal.arrayFromList("{{namePrefix}}.{{firstNameFemale}}");

        public Object idNumberFormat = "{{alphabet}}{{alphabet}}########";
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\mn_MN\\Person")
                    .setLookup(
                            Person.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "alphabet",
                            "femaleNameFormats",
                            "firstNameFemale",
                            "firstNameMale",
                            "idNumberFormat",
                            "maleNameFormats",
                            "namePrefix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/mn_MN/Person.php")
                    .addExtendsClass("Faker\\Provider\\Person")
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
