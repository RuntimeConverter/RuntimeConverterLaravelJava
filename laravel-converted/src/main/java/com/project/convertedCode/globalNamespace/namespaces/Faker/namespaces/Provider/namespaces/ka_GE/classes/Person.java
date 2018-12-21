package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.ka_GE.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/ka_GE/Person.php

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

    public static final Object CONST_class = "Faker\\Provider\\ka_GE\\Person";

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

        public Object maleNameFormats = ZVal.arrayFromList("{{firstNameMale}} {{lastName}}");

        public Object femaleNameFormats = ZVal.arrayFromList("{{firstNameFemale}} {{lastName}}");

        public Object firstNameMale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u10D2\u10D8\u10DD\u10E0\u10D2\u10D8",
                                    "\u10D3\u10D0\u10D5\u10D8\u10D7\u10D8",
                                    "\u10D6\u10E3\u10E0\u10D0\u10D1\u10D8",
                                    "\u10D0\u10DA\u10D4\u10E5\u10E1\u10D0\u10DC\u10D3\u10E0\u10D4",
                                    "\u10D8\u10E0\u10D0\u10D9\u10DA\u10D8",
                                    "\u10DA\u10D4\u10D5\u10D0\u10DC\u10D8",
                                    "\u10D2\u10DD\u10E9\u10D0",
                                    "\u10DB\u10D0\u10DB\u10E3\u10D9\u10D0",
                                    "\u10D6\u10D0\u10D6\u10D0",
                                    "\u10D2\u10D8\u10D5\u10D8",
                                    "\u10D0\u10D5\u10D7\u10D0\u10DC\u10D3\u10D8\u10DA",
                                    "\u10DB\u10D8\u10EE\u10D4\u10D8\u10DA\u10D8",
                                    "\u10D2\u10D4\u10DA\u10D0",
                                    "\u10D7\u10D0\u10DB\u10D0\u10D6\u10D8",
                                    "\u10DA\u10D0\u10E8\u10D0",
                                    "\u10E8\u10DD\u10D7\u10D0",
                                    "\u10D7\u10D4\u10D8\u10DB\u10E3\u10E0\u10D0\u10D6\u10D8",
                                    "\u10E8\u10D0\u10DA\u10D5\u10D0",
                                    "\u10D2\u10E3\u10E0\u10D0\u10DB\u10D8",
                                    "\u10DC\u10D8\u10D9\u10DD\u10DA\u10DD\u10D6\u10D8",
                                    "\u10DC\u10DD\u10D3\u10D0\u10E0\u10D8",
                                    "\u10D5\u10DA\u10D0\u10D3\u10D8\u10DB\u10D4\u10E0\u10D8",
                                    "\u10D5\u10D0\u10DF\u10D0",
                                    "\u10DB\u10D4\u10E0\u10D0\u10D1\u10D8",
                                    "\u10D7\u10D4\u10DC\u10D2\u10D8\u10D6\u10D8",
                                    "\u10D2\u10D8\u10D0",
                                    "\u10D1\u10D0\u10D3\u10E0\u10D8",
                                    "\u10D9\u10DD\u10D1\u10D0",
                                    "\u10D5\u10D0\u10EE\u10E2\u10D0\u10DC\u10D2\u10D8",
                                    "\u10D8\u10D5\u10D0\u10DC\u10D4",
                                    "\u10DB\u10D0\u10DA\u10EE\u10D0\u10D6\u10D8",
                                    "\u10DC\u10E3\u10D2\u10D6\u10D0\u10E0\u10D8",
                                    "\u10D0\u10DB\u10D8\u10E0\u10D0\u10DC\u10D8",
                                    "\u10DE\u10D0\u10D0\u10E2\u10D0",
                                    "\u10E1\u10D4\u10E0\u10D2\u10DD",
                                    "\u10DD\u10D7\u10D0\u10E0\u10D8",
                                    "\u10E0\u10D4\u10D5\u10D0\u10D6\u10D8",
                                    "\u10D0\u10D9\u10D0\u10D9\u10D8",
                                    "\u10E2\u10D0\u10E0\u10D8\u10D4\u10DA\u10D8",
                                    "\u10DB\u10D0\u10D3\u10DD\u10DC\u10D0",
                                    "\u10D3\u10D8\u10DB\u10D8\u10E2\u10E0\u10D8",
                                    "\u10D8\u10E3\u10E0\u10D8",
                                    "\u10D7\u10D4\u10DB\u10E3\u10E0\u10D8",
                                    "\u10D9\u10D0\u10EE\u10D0\u10D1\u10D4\u10E0\u10D8",
                                    "\u10D6\u10D5\u10D8\u10D0\u10D3\u10D8",
                                    "\u10D4\u10DA\u10D2\u10E3\u10EF\u10D0",
                                    "\u10EF\u10D4\u10DB\u10D0\u10DA\u10D8",
                                    "\u10D8\u10DD\u10E1\u10D4\u10D1\u10D8",
                                    "\u10E0\u10D0\u10DB\u10D0\u10D6\u10D8",
                                    "\u10D1\u10D4\u10E5\u10D0",
                                    "\u10E0\u10DD\u10DB\u10D0\u10DC\u10D8",
                                    "\u10D9\u10D0\u10EE\u10D0",
                                    "\u10D7\u10DD\u10E0\u10DC\u10D8\u10D9\u10D4",
                                    "\u10D1\u10D4\u10E1\u10D8\u10D9\u10D8",
                                    "\u10D0\u10E0\u10E9\u10D8\u10DA\u10D8",
                                    "\u10D0\u10DA\u10D4\u10E5\u10E1\u10D8",
                                    "\u10EE\u10D5\u10D8\u10E9\u10D0",
                                    "\u10D9\u10DD\u10DC\u10E1\u10E2\u10D0\u10DC\u10E2\u10D8\u10DC\u10D4",
                                    "\u10D0\u10DC\u10D6\u10DD\u10E0\u10D8",
                                    "\u10D5\u10D0\u10E1\u10D8\u10DA\u10D8",
                                    "\u10E1\u10E3\u10DA\u10D8\u10D9\u10DD",
                                    "\u10D5\u10D0\u10DA\u10D4\u10E0\u10D8",
                                    "\u10E0\u10D4\u10D6\u10DD",
                                    "\u10D6\u10D0\u10E3\u10E0\u10D8",
                                    "\u10DC\u10D8\u10D9\u10D0",
                                    "\u10D3\u10DD\u10D3\u10DD",
                                    "\u10DD\u10DB\u10D0\u10E0\u10D8",
                                    "\u10DB\u10E3\u10E0\u10DB\u10D0\u10DC\u10D8",
                                    "\u10E1\u10DD\u10E1\u10DD",
                                    "\u10D2\u10E0\u10D8\u10D2\u10DD\u10DA\u10D8",
                                    "\u10D2\u10D4\u10DC\u10D0\u10D3\u10D8",
                                    "\u10D0\u10D5\u10D7\u10D0\u10DC\u10D3\u10D8\u10DA\u10D8",
                                    "\u10D4\u10DB\u10D6\u10D0\u10E0\u10D8",
                                    "\u10EF\u10E3\u10DB\u10D1\u10D4\u10E0\u10D8",
                                    "\u10D2\u10D8\u10D2\u10D0",
                                    "\u10D2\u10DD\u10D3\u10D4\u10E0\u10EB\u10D8");
                        });

        public Object firstNameFemale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u10DC\u10D8\u10DC\u10DD",
                                    "\u10DB\u10D0\u10D8\u10D0",
                                    "\u10D7\u10D0\u10DB\u10D0\u10E0\u10D8",
                                    "\u10DC\u10D0\u10DC\u10D0",
                                    "\u10DB\u10D0\u10DC\u10D0\u10DC\u10D0",
                                    "\u10DC\u10D0\u10D7\u10D4\u10DA\u10D0",
                                    "\u10DC\u10D0\u10D7\u10D8\u10D0",
                                    "\u10DB\u10D0\u10E0\u10D8\u10DC\u10D4",
                                    "\u10E5\u10D4\u10D7\u10D4\u10D5\u10D0\u10DC",
                                    "\u10EE\u10D0\u10D7\u10E3\u10DC\u10D0",
                                    "\u10DB\u10D0\u10E0\u10D8\u10DC\u10D0",
                                    "\u10DA\u10D0\u10DA\u10D8",
                                    "\u10DA\u10D8\u10D0\u10DC\u10D0",
                                    "\u10DB\u10D6\u10D8\u10D0",
                                    "\u10DA\u10D8\u10D0",
                                    "\u10D4\u10D9\u10D0\u10E2\u10D4\u10E0\u10D8\u10DC\u10D4",
                                    "\u10D0\u10DC\u10D0",
                                    "\u10DB\u10D0\u10E0\u10D8\u10D0\u10DB\u10D8",
                                    "\u10D8\u10E0\u10DB\u10D0",
                                    "\u10DA\u10D4\u10D8\u10DA\u10D0",
                                    "\u10DC\u10D0\u10DC\u10E3\u10DA\u10D8",
                                    "\u10DB\u10D4\u10E0\u10D8",
                                    "\u10DA\u10D4\u10DA\u10D0",
                                    "\u10D7\u10D4\u10D0",
                                    "\u10E1\u10DD\u10E4\u10D8\u10DD",
                                    "\u10D8\u10DC\u10D2\u10D0",
                                    "\u10D4\u10D7\u10D4\u10E0\u10D8",
                                    "\u10DC\u10DD\u10DC\u10D0",
                                    "\u10D7\u10D4\u10DD\u10DC\u10D0",
                                    "\u10E8\u10DD\u10E0\u10D4\u10DC\u10D0",
                                    "\u10DB\u10D0\u10E7\u10D5\u10D0\u10DA\u10D0",
                                    "\u10EA\u10D8\u10D0\u10DA\u10D0",
                                    "\u10DA\u10D0\u10DB\u10D0\u10E0\u10D0",
                                    "\u10DB\u10D0\u10D9\u10D0",
                                    "\u10D7\u10D8\u10DC\u10D0",
                                    "\u10DC\u10D4\u10DA\u10D8",
                                    "\u10E0\u10E3\u10E1\u10E3\u10D3\u10D0\u10DC\u10D8",
                                    "\u10D3\u10D0\u10DA\u10D8",
                                    "\u10D4\u10DA\u10D4\u10DC\u10D4",
                                    "\u10D7\u10D8\u10DC\u10D0\u10D7\u10D8\u10DC\u10D8",
                                    "\u10DC\u10D0\u10E2\u10DD",
                                    "\u10DC\u10D0\u10E2\u10D0\u10DA\u10D8\u10D0",
                                    "\u10D8\u10D0",
                                    "\u10DF\u10E3\u10DF\u10E3\u10DC\u10D0",
                                    "\u10DC\u10E3\u10DC\u10E3",
                                    "\u10DA\u10D8\u10DA\u10D8",
                                    "\u10DC\u10D8\u10DC\u10D0",
                                    "\u10D3\u10D0\u10E0\u10D4\u10EF\u10D0\u10DC\u10D8",
                                    "\u10D8\u10D6\u10DD\u10DA\u10D3\u10D0",
                                    "\u10D8\u10E0\u10D8\u10DC\u10D0",
                                    "\u10E1\u10D0\u10DA\u10DD\u10DB\u10D4",
                                    "\u10DC\u10D0\u10DC\u10D8",
                                    "\u10E1\u10D5\u10D4\u10E2\u10DA\u10D0\u10DC\u10D0",
                                    "\u10D8\u10DA\u10D8\u10D0",
                                    "\u10D2\u10E3\u10DA\u10DC\u10D0\u10E0\u10D0",
                                    "\u10D4\u10D9\u10D0",
                                    "\u10D8\u10E0\u10D8\u10DC\u10D4",
                                    "\u10DC\u10D0\u10D6\u10D8",
                                    "\u10D7\u10D0\u10DB\u10D0\u10E0\u10D0",
                                    "\u10EA\u10D8\u10EA\u10D8\u10DC\u10DD",
                                    "\u10E5\u10D4\u10D7\u10D4\u10D5\u10D0\u10DC\u10D8",
                                    "\u10D5\u10D4\u10DC\u10D4\u10E0\u10D0",
                                    "\u10D7\u10D0\u10DB\u10D8\u10DA\u10D0",
                                    "\u10DC\u10D0\u10D8\u10E0\u10D0",
                                    "\u10E1\u10DD\u10E4\u10D8\u10D9\u10DD",
                                    "\u10EA\u10D8\u10E1\u10D0\u10DC\u10D0",
                                    "\u10D4\u10DA\u10D8\u10E1\u10DD",
                                    "\u10D6\u10D0\u10D8\u10E0\u10D0",
                                    "\u10EA\u10D8\u10E3\u10E0\u10D8",
                                    "\u10D3\u10D8\u10D0\u10DC\u10D0",
                                    "\u10D4\u10DA\u10D4\u10DC\u10D0",
                                    "\u10D8\u10D0\u10DB\u10D6\u10D4",
                                    "\u10E0\u10DD\u10D6\u10D0",
                                    "\u10DB\u10D4\u10D3\u10D4\u10D0",
                                    "\u10EA\u10D8\u10E0\u10D0",
                                    "\u10D6\u10DD\u10D8\u10D0",
                                    "\u10E1\u10E3\u10DA\u10D8\u10D9\u10DD",
                                    "\u10DA\u10D4\u10DC\u10D0",
                                    "\u10D5\u10D4\u10E0\u10D0",
                                    "\u10DA\u10E3\u10D8\u10D6\u10D0",
                                    "\u10DA\u10D0\u10E0\u10D8\u10E1\u10D0",
                                    "\u10D1\u10D4\u10DA\u10D0",
                                    "\u10DC\u10DD\u10E0\u10D0",
                                    "\u10D3\u10DD\u10D3\u10DD",
                                    "\u10D5\u10D0\u10DA\u10D4\u10DC\u10E2\u10D8\u10DC\u10D0",
                                    "\u10E5\u10D4\u10D7\u10DD",
                                    "\u10D6\u10D8\u10DC\u10D0",
                                    "\u10E2\u10D0\u10E2\u10D8\u10D0\u10DC\u10D0",
                                    "\u10DB\u10D0\u10E0\u10D8\u10D0",
                                    "\u10DB\u10D0\u10D2\u10E3\u10DA\u10D8",
                                    "\u10D7\u10D0\u10DB\u10D7\u10D0",
                                    "\u10DC\u10D0\u10D6\u10D8\u10D9\u10DD",
                                    "\u10EE\u10D0\u10E2\u10D8\u10D0",
                                    "\u10DB\u10D0\u10E0\u10D8\u10D9\u10D0",
                                    "\u10D4\u10DA\u10D6\u10D0",
                                    "\u10D0\u10DC\u10DC\u10D0",
                                    "\u10D2\u10D5\u10D0\u10DC\u10EA\u10D0",
                                    "\u10D2\u10D0\u10DA\u10D8\u10DC\u10D0",
                                    "\u10EF\u10E3\u10DA\u10D8\u10D4\u10E2\u10D0");
                        });

        public Object lastName =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u10D0\u10D1\u10D0\u10E8\u10D8\u10EB\u10D4",
                                    "\u10D0\u10D1\u10D4\u10E1\u10D0\u10EB\u10D4",
                                    "\u10D0\u10D1\u10E0\u10D0\u10DB\u10D8\u10E8\u10D5\u10D8\u10DA\u10D8",
                                    "\u10D0\u10D1\u10E3\u10DA\u10D0\u10EB\u10D4",
                                    "\u10D0\u10DA\u10D8\u10D4\u10D5\u10D0",
                                    "\u10D0\u10DA\u10D8\u10D4\u10D5\u10D8",
                                    "\u10D0\u10E1\u10D0\u10D7\u10D8\u10D0\u10DC\u10D8",
                                    "\u10D0\u10E4\u10EA\u10D8\u10D0\u10E3\u10E0\u10D8",
                                    "\u10D0\u10EE\u10D0\u10DA\u10D0\u10D8\u10D0",
                                    "\u10D0\u10EE\u10D5\u10DA\u10D4\u10D3\u10D8\u10D0\u10DC\u10D8",
                                    "\u10D0\u10EE\u10DB\u10D4\u10D3\u10DD\u10D5\u10D0",
                                    "\u10D0\u10EE\u10DB\u10D4\u10D3\u10DD\u10D5\u10D8",
                                    "\u10D1\u10D0\u10D8\u10E0\u10D0\u10DB\u10DD\u10D5\u10D0",
                                    "\u10D1\u10D0\u10D8\u10E0\u10D0\u10DB\u10DD\u10D5\u10D8",
                                    "\u10D1\u10D0\u10E0\u10D0\u10DB\u10D8\u10EB\u10D4",
                                    "\u10D1\u10D0\u10E0\u10D1\u10D0\u10E5\u10D0\u10EB\u10D4",
                                    "\u10D1\u10D0\u10E5\u10E0\u10D0\u10EB\u10D4",
                                    "\u10D1\u10D0\u10EE\u10E2\u10D0\u10EB\u10D4",
                                    "\u10D1\u10D4\u10E0\u10D0\u10EB\u10D4",
                                    "\u10D1\u10D4\u10E0\u10D8\u10E8\u10D5\u10D8\u10DA\u10D8",
                                    "\u10D1\u10D4\u10E0\u10D8\u10EB\u10D4",
                                    "\u10D1\u10D4\u10E0\u10E3\u10D0\u10E8\u10D5\u10D8\u10DA\u10D8",
                                    "\u10D1\u10D4\u10E5\u10D0\u10E3\u10E0\u10D8",
                                    "\u10D1\u10D8\u10EC\u10D0\u10EB\u10D4",
                                    "\u10D1\u10DA\u10D8\u10D0\u10EB\u10D4",
                                    "\u10D1\u10DD\u10DA\u10E5\u10D5\u10D0\u10EB\u10D4",
                                    "\u10D1\u10DD\u10ED\u10DD\u10E0\u10D8\u10E8\u10D5\u10D8\u10DA\u10D8",
                                    "\u10D1\u10E0\u10D4\u10D2\u10D5\u10D0\u10EB\u10D4",
                                    "\u10D2\u10D0\u10D1\u10E3\u10DC\u10D8\u10D0",
                                    "\u10D2\u10D0\u10D2\u10DC\u10D8\u10EB\u10D4",
                                    "\u10D2\u10D0\u10D2\u10E3\u10D0",
                                    "\u10D2\u10D0\u10E1\u10D0\u10DC\u10DD\u10D5\u10D0",
                                    "\u10D2\u10D0\u10E1\u10D0\u10DC\u10DD\u10D5\u10D8",
                                    "\u10D2\u10D0\u10E4\u10E0\u10D8\u10DC\u10D3\u10D0\u10E8\u10D5\u10D8\u10DA\u10D8",
                                    "\u10D2\u10D0\u10E9\u10D4\u10E9\u10D8\u10DA\u10D0\u10EB\u10D4",
                                    "\u10D2\u10D4\u10DA\u10D0\u10E8\u10D5\u10D8\u10DA\u10D8",
                                    "\u10D2\u10D8\u10D2\u10D0\u10E3\u10E0\u10D8",
                                    "\u10D2\u10D8\u10DD\u10E0\u10D2\u10D0\u10EB\u10D4",
                                    "\u10D2\u10DD\u10D2\u10D0\u10DA\u10D0\u10EB\u10D4",
                                    "\u10D2\u10DD\u10D2\u10D8\u10D0",
                                    "\u10D2\u10DD\u10D2\u10D8\u10D0\u10E8\u10D5\u10D8\u10DA\u10D8",
                                    "\u10D2\u10DD\u10D2\u10D8\u10E2\u10D8\u10EB\u10D4",
                                    "\u10D2\u10DD\u10D2\u10DD\u10DA\u10D0\u10EB\u10D4",
                                    "\u10D2\u10DD\u10D2\u10DD\u10EE\u10D8\u10D0",
                                    "\u10D2\u10DD\u10D2\u10E3\u10D0\u10EB\u10D4",
                                    "\u10D2\u10DD\u10E0\u10D2\u10D0\u10EB\u10D4",
                                    "\u10D2\u10E0\u10D8\u10D2\u10D0\u10DA\u10D0\u10E8\u10D5\u10D8\u10DA\u10D8",
                                    "\u10D2\u10E3\u10E0\u10D2\u10D4\u10DC\u10D8\u10EB\u10D4",
                                    "\u10D2\u10E3\u10E1\u10D4\u10D8\u10DC\u10DD\u10D5\u10D0",
                                    "\u10D2\u10E3\u10E1\u10D4\u10D8\u10DC\u10DD\u10D5\u10D8",
                                    "\u10D3\u10D0\u10D5\u10D8\u10D7\u10D0\u10E8\u10D5\u10D8\u10DA\u10D8",
                                    "\u10D3\u10D0\u10D5\u10D8\u10D7\u10D0\u10EB\u10D4",
                                    "\u10D3\u10D0\u10DC\u10D4\u10DA\u10D8\u10D0",
                                    "\u10D3\u10D4\u10D5\u10D0\u10EB\u10D4",
                                    "\u10D3\u10D5\u10D0\u10DA\u10D8",
                                    "\u10D3\u10D5\u10D0\u10DA\u10D8\u10E8\u10D5\u10D8\u10DA\u10D8",
                                    "\u10D3\u10D8\u10D0\u10E1\u10D0\u10DB\u10D8\u10EB\u10D4",
                                    "\u10D3\u10DD\u10DA\u10D8\u10EB\u10D4",
                                    "\u10D3\u10E3\u10DB\u10D1\u10D0\u10EB\u10D4",
                                    "\u10D5\u10D0\u10E8\u10D0\u10D9\u10D8\u10EB\u10D4",
                                    "\u10D6\u10DD\u10D8\u10EB\u10D4",
                                    "\u10D7\u10D0\u10D5\u10D0\u10EB\u10D4",
                                    "\u10D7\u10D4\u10D5\u10D6\u10D0\u10EB\u10D4",
                                    "\u10D7\u10DD\u10D3\u10E3\u10D0",
                                    "\u10D7\u10E3\u10E0\u10DB\u10D0\u10DC\u10D8\u10EB\u10D4",
                                    "\u10D8\u10E0\u10D4\u10DB\u10D0\u10EB\u10D4",
                                    "\u10D8\u10E1\u10DB\u10D0\u10D8\u10DA\u10DD\u10D5\u10D0",
                                    "\u10D8\u10E1\u10DB\u10D0\u10D8\u10DA\u10DD\u10D5\u10D8",
                                    "\u10D9\u10D0\u10D9\u10D0\u10D1\u10D0\u10EB\u10D4",
                                    "\u10D9\u10D0\u10DA\u10D0\u10DC\u10D3\u10D0\u10EB\u10D4",
                                    "\u10D9\u10D0\u10DC\u10D3\u10D4\u10DA\u10D0\u10D9\u10D8",
                                    "\u10D9\u10D0\u10DE\u10D0\u10DC\u10D0\u10EB\u10D4",
                                    "\u10D9\u10D0\u10EE\u10D8\u10EB\u10D4",
                                    "\u10D9\u10D4\u10E0\u10D4\u10E1\u10D4\u10DA\u10D8\u10EB\u10D4",
                                    "\u10D9\u10D5\u10D0\u10E0\u10D0\u10EA\u10EE\u10D4\u10DA\u10D8\u10D0",
                                    "\u10D9\u10D8\u10D9\u10D0\u10D1\u10D8\u10EB\u10D4",
                                    "\u10D9\u10D8\u10D9\u10DC\u10D0\u10EB\u10D4",
                                    "\u10D9\u10D8\u10DA\u10D0\u10EB\u10D4",
                                    "\u10D9\u10DD\u10D1\u10D0\u10EE\u10D8\u10EB\u10D4",
                                    "\u10D9\u10DD\u10DC\u10EA\u10D4\u10DA\u10D8\u10EB\u10D4",
                                    "\u10D9\u10DD\u10DE\u10D0\u10DA\u10D8\u10D0\u10DC\u10D8",
                                    "\u10D9\u10E3\u10DE\u10D0\u10E2\u10D0\u10EB\u10D4",
                                    "\u10D9\u10E3\u10E0\u10E2\u10D0\u10DC\u10D8\u10EB\u10D4",
                                    "\u10DA\u10D0\u10D1\u10D0\u10EB\u10D4",
                                    "\u10DA\u10D4\u10DF\u10D0\u10D5\u10D0",
                                    "\u10DA\u10D8\u10DE\u10D0\u10E0\u10E2\u10D4\u10DA\u10D8\u10D0\u10DC\u10D8",
                                    "\u10DA\u10DD\u10D1\u10DF\u10D0\u10DC\u10D8\u10EB\u10D4",
                                    "\u10DA\u10DD\u10DB\u10D7\u10D0\u10EB\u10D4",
                                    "\u10DA\u10DD\u10DB\u10D8\u10EB\u10D4",
                                    "\u10DA\u10DD\u10DB\u10E1\u10D0\u10EB\u10D4",
                                    "\u10DA\u10DD\u10E0\u10D7\u10E5\u10D8\u10E4\u10D0\u10DC\u10D8\u10EB\u10D4",
                                    "\u10DB\u10D0\u10D8\u10E1\u10E3\u10E0\u10D0\u10EB\u10D4",
                                    "\u10DB\u10D0\u10DB\u10D4\u10D3\u10DD\u10D5\u10D0",
                                    "\u10DB\u10D0\u10DB\u10D4\u10D3\u10DD\u10D5\u10D8",
                                    "\u10DB\u10D0\u10DB\u10E3\u10DA\u10D0\u10E8\u10D5\u10D8\u10DA\u10D8",
                                    "\u10DB\u10D0\u10E6\u10DA\u10D0\u10D9\u10D4\u10DA\u10D8\u10EB\u10D4",
                                    "\u10DB\u10D0\u10E6\u10E0\u10D0\u10EB\u10D4",
                                    "\u10DB\u10D0\u10ED\u10D0\u10D5\u10D0\u10E0\u10D8\u10D0\u10DC\u10D8",
                                    "\u10DB\u10D0\u10ED\u10D0\u10E0\u10D0\u10E8\u10D5\u10D8\u10DA\u10D8",
                                    "\u10DB\u10D0\u10EE\u10D0\u10E0\u10D0\u10E8\u10D5\u10D8\u10DA\u10D8",
                                    "\u10DB\u10D0\u10EE\u10D0\u10E0\u10D0\u10EB\u10D4",
                                    "\u10DB\u10D2\u10D4\u10DA\u10D0\u10EB\u10D4",
                                    "\u10DB\u10D4\u10D2\u10E0\u10D4\u10DA\u10D8\u10E8\u10D5\u10D8\u10DA\u10D8",
                                    "\u10DB\u10D4\u10DA\u10D0\u10EB\u10D4",
                                    "\u10DB\u10D4\u10E1\u10EE\u10D8",
                                    "\u10DB\u10D4\u10E2\u10E0\u10D4\u10D5\u10D4\u10DA\u10D8",
                                    "\u10DB\u10D8\u10E5\u10D0\u10D5\u10D0",
                                    "\u10DB\u10D8\u10E5\u10D0\u10EB\u10D4",
                                    "\u10DB\u10D8\u10E5\u10D4\u10DA\u10D0\u10EB\u10D4",
                                    "\u10DB\u10DD\u10D3\u10D4\u10D1\u10D0\u10EB\u10D4",
                                    "\u10DB\u10DF\u10D0\u10D5\u10D0\u10DC\u10D0\u10EB\u10D4",
                                    "\u10DB\u10E3\u10DB\u10DA\u10D0\u10EB\u10D4",
                                    "\u10DB\u10E3\u10E1\u10D0\u10D4\u10D5\u10D8",
                                    "\u10DB\u10E6\u10D4\u10D1\u10E0\u10D8\u10E8\u10D5\u10D8\u10DA\u10D8",
                                    "\u10DB\u10ED\u10D4\u10D3\u10DA\u10D8\u10E8\u10D5\u10D8\u10DA\u10D8",
                                    "\u10DB\u10ED\u10D4\u10D3\u10DA\u10D8\u10EB\u10D4",
                                    "\u10DC\u10D0\u10D3\u10D8\u10E0\u10D0\u10E8\u10D5\u10D8\u10DA\u10D8",
                                    "\u10DC\u10D0\u10D3\u10D8\u10E0\u10D0\u10EB\u10D4",
                                    "\u10DC\u10D0\u10D9\u10D0\u10E8\u10D8\u10EB\u10D4",
                                    "\u10DC\u10D0\u10EA\u10D5\u10DA\u10D8\u10E8\u10D5\u10D8\u10DA\u10D8",
                                    "\u10DC\u10D0\u10ED\u10E7\u10D4\u10D1\u10D8\u10D0",
                                    "\u10DC\u10DD\u10D6\u10D0\u10EB\u10D4",
                                    "\u10DD\u10DC\u10D8\u10D0\u10DC\u10D8",
                                    "\u10DD\u10E5\u10E0\u10DD\u10DE\u10D8\u10E0\u10D8\u10EB\u10D4",
                                    "\u10DE\u10D4\u10E2\u10E0\u10D8\u10D0\u10E8\u10D5\u10D8\u10DA\u10D8",
                                    "\u10DF\u10D5\u10D0\u10DC\u10D8\u10D0",
                                    "\u10DF\u10DD\u10E0\u10DF\u10DD\u10DA\u10D8\u10D0\u10DC\u10D8",
                                    "\u10DF\u10E6\u10D4\u10DC\u10E2\u10D8",
                                    "\u10E0\u10D0\u10D6\u10DB\u10D0\u10EB\u10D4",
                                    "\u10E0\u10D0\u10DB\u10D8\u10E8\u10D5\u10D8\u10DA\u10D8",
                                    "\u10E0\u10D4\u10EE\u10D5\u10D8\u10D0\u10E8\u10D5\u10D8\u10DA\u10D8",
                                    "\u10E0\u10DD\u10D1\u10D0\u10E5\u10D8\u10EB\u10D4",
                                    "\u10E0\u10E3\u10EE\u10D0\u10EB\u10D4",
                                    "\u10E1\u10D0\u10DB\u10EE\u10D0\u10E0\u10D0\u10EB\u10D4",
                                    "\u10E1\u10D0\u10E0\u10D0\u10DA\u10D8\u10EB\u10D4",
                                    "\u10E1\u10D0\u10E0\u10E5\u10D8\u10E1\u10D8\u10D0\u10DC\u10D8",
                                    "\u10E1\u10D5\u10D0\u10DC\u10D8\u10EB\u10D4",
                                    "\u10E1\u10D8\u10E0\u10D0\u10EB\u10D4",
                                    "\u10E1\u10D8\u10ED\u10D8\u10DC\u10D0\u10D5\u10D0",
                                    "\u10E1\u10D8\u10EE\u10D0\u10E0\u10E3\u10DA\u10D8\u10EB\u10D4",
                                    "\u10E1\u10E3\u10E0\u10DB\u10D0\u10DC\u10D8\u10EB\u10D4",
                                    "\u10E2\u10D0\u10D1\u10D0\u10E2\u10D0\u10EB\u10D4",
                                    "\u10E2\u10D0\u10DA\u10D0\u10EE\u10D0\u10EB\u10D4",
                                    "\u10E2\u10E7\u10D4\u10E8\u10D4\u10DA\u10D0\u10E8\u10D5\u10D8\u10DA\u10D8",
                                    "\u10E4\u10D4\u10D8\u10E5\u10E0\u10D8\u10E8\u10D5\u10D8\u10DA\u10D8",
                                    "\u10E4\u10D4\u10E0\u10D0\u10EB\u10D4",
                                    "\u10E4\u10D8\u10E4\u10D8\u10D0",
                                    "\u10E4\u10E3\u10E2\u10D9\u10D0\u10E0\u10D0\u10EB\u10D4",
                                    "\u10E4\u10EE\u10D0\u10D9\u10D0\u10EB\u10D4",
                                    "\u10E5\u10D0\u10D5\u10D7\u10D0\u10E0\u10D0\u10EB\u10D4",
                                    "\u10E5\u10D0\u10D7\u10D0\u10DB\u10D0\u10EB\u10D4",
                                    "\u10E5\u10D0\u10E0\u10D3\u10D0\u10D5\u10D0",
                                    "\u10E5\u10D0\u10E0\u10D7\u10D5\u10D4\u10DA\u10D8\u10E8\u10D5\u10D8\u10DA\u10D8",
                                    "\u10E5\u10D0\u10EF\u10D0\u10D8\u10D0",
                                    "\u10E5\u10D8\u10E0\u10D8\u10D0",
                                    "\u10E5\u10DD\u10D1\u10D0\u10DA\u10D8\u10D0",
                                    "\u10E6\u10D5\u10D8\u10DC\u10D8\u10D0\u10E8\u10D5\u10D8\u10DA\u10D8",
                                    "\u10E6\u10DA\u10DD\u10DC\u10E2\u10D8",
                                    "\u10E6\u10DD\u10DC\u10E6\u10D0\u10EB\u10D4",
                                    "\u10E7\u10E3\u10E0\u10D0\u10E8\u10D5\u10D8\u10DA\u10D8",
                                    "\u10E8\u10D0\u10D5\u10D0\u10EB\u10D4",
                                    "\u10E8\u10D0\u10D8\u10DC\u10D8\u10EB\u10D4",
                                    "\u10E8\u10D0\u10DA\u10D0\u10DB\u10D1\u10D4\u10E0\u10D8\u10EB\u10D4",
                                    "\u10E8\u10D4\u10DC\u10D2\u10D4\u10DA\u10D8\u10D0",
                                    "\u10E8\u10DD\u10DC\u10D8\u10D0",
                                    "\u10E8\u10E3\u10D1\u10D8\u10D7\u10D8\u10EB\u10D4",
                                    "\u10E9\u10D0\u10D3\u10E3\u10DC\u10D4\u10DA\u10D8",
                                    "\u10E9\u10D8\u10E5\u10DD\u10D5\u10D0\u10DC\u10D8",
                                    "\u10E9\u10D8\u10EE\u10DA\u10D0\u10EB\u10D4",
                                    "\u10E9\u10E3\u10D1\u10D8\u10DC\u10D8\u10EB\u10D4",
                                    "\u10E9\u10EE\u10D0\u10D8\u10EB\u10D4",
                                    "\u10E9\u10EE\u10D4\u10D8\u10EB\u10D4",
                                    "\u10E9\u10EE\u10D8\u10D9\u10D5\u10D0\u10EB\u10D4",
                                    "\u10EA\u10D4\u10E0\u10EA\u10D5\u10D0\u10EB\u10D4",
                                    "\u10EA\u10D4\u10EA\u10EE\u10DA\u10D0\u10EB\u10D4",
                                    "\u10EA\u10D8\u10DC\u10EA\u10D0\u10EB\u10D4",
                                    "\u10EA\u10E3\u10EA\u10E5\u10D8\u10E0\u10D8\u10EB\u10D4",
                                    "\u10EC\u10D4\u10E0\u10D4\u10D7\u10D4\u10DA\u10D8",
                                    "\u10EC\u10D8\u10D9\u10DA\u10D0\u10E3\u10E0\u10D8",
                                    "\u10EC\u10E3\u10DA\u10D0\u10D8\u10D0",
                                    "\u10EC\u10E3\u10E0\u10EC\u10E3\u10DB\u10D8\u10D0",
                                    "\u10ED\u10D0\u10DC\u10E2\u10E3\u10E0\u10D8\u10D0",
                                    "\u10ED\u10D4\u10DA\u10D8\u10EB\u10D4",
                                    "\u10ED\u10D8\u10E6\u10DA\u10D0\u10EB\u10D4",
                                    "\u10ED\u10D9\u10D0\u10D3\u10E3\u10D0",
                                    "\u10ED\u10E3\u10DB\u10D1\u10E3\u10E0\u10D8\u10EB\u10D4",
                                    "\u10EE\u10D0\u10E0\u10D0\u10D8\u10E8\u10D5\u10D8\u10DA\u10D8",
                                    "\u10EE\u10D0\u10E9\u10D8\u10EB\u10D4",
                                    "\u10EE\u10D5\u10D4\u10D3\u10D4\u10DA\u10D8\u10EB\u10D4",
                                    "\u10EE\u10E3\u10E0\u10EA\u10D8\u10DA\u10D0\u10D5\u10D0",
                                    "\u10EE\u10E3\u10E0\u10EA\u10D8\u10EB\u10D4",
                                    "\u10EE\u10E3\u10EA\u10D8\u10E8\u10D5\u10D8\u10DA\u10D8",
                                    "\u10EF\u10D0\u10D5\u10D0\u10EE\u10D8\u10E8\u10D5\u10D8\u10DA\u10D8",
                                    "\u10EF\u10D0\u10DA\u10D0\u10E6\u10DD\u10DC\u10D8\u10D0",
                                    "\u10EF\u10D0\u10DC\u10D0\u10E8\u10D8\u10D0",
                                    "\u10EF\u10D0\u10DC\u10D4\u10DA\u10D8\u10EB\u10D4",
                                    "\u10EF\u10D0\u10E4\u10D0\u10E0\u10D8\u10EB\u10D4",
                                    "\u10EF\u10D8\u10DC\u10ED\u10D0\u10E0\u10D0\u10EB\u10D4",
                                    "\u10EF\u10D8\u10E5\u10D8\u10D0",
                                    "\u10EF\u10DD\u10EE\u10D0\u10EB\u10D4",
                                    "\u10EF\u10DD\u10EF\u10E3\u10D0");
                        });

        public Object titleMale =
                ZVal.arrayFromList(
                        "\u10D1\u10DC.", "\u10D3\u10DD\u10E5.", "\u10DE\u10E0\u10DD\u10E4.");

        public Object titleFemale =
                ZVal.arrayFromList(
                        "\u10E5\u10DC.", "\u10D3\u10DD\u10E5.", "\u10DE\u10E0\u10DD\u10E4.");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\ka_GE\\Person")
                    .setLookup(
                            Person.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "femaleNameFormats",
                            "firstNameFemale",
                            "firstNameMale",
                            "lastName",
                            "maleNameFormats",
                            "titleFemale",
                            "titleMale")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/ka_GE/Person.php")
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
