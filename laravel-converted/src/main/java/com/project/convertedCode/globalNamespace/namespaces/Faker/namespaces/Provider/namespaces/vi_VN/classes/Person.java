package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.vi_VN.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/vi_VN/Person.php

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
    @ConvertedParameter(
        index = 0,
        name = "gender",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object middleName(RuntimeEnv env, Object... args) {
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
                            .method("middleNameMale")
                            .call()
                            .value());

        } else if (ZVal.strictEqualityCheck(
                gender,
                "===",
                ClassConstantUtils.getConstantValueLateStatic(env, this, "GENDER_FEMALE"))) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
                            .method("middleNameFemale")
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
                                                                        .namespaces
                                                                        .vi_VN
                                                                        .classes
                                                                        .Person
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "middleNameFormat")))
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
                                                                .vi_VN
                                                                .classes
                                                                .Person
                                                                .RequestStaticProperties
                                                                .class)
                                                .middleNameFormat)
                                .value()));
    }

    public static final Object CONST_class = "Faker\\Provider\\vi_VN\\Person";

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

        @ConvertedMethod
        public Object middleNameMale(RuntimeEnv env, Object... args) {
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
                                                            .namespaces
                                                            .vi_VN
                                                            .classes
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .middleNameMale)
                            .value());
        }

        @ConvertedMethod
        public Object middleNameFemale(RuntimeEnv env, Object... args) {
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
                                                            .namespaces
                                                            .vi_VN
                                                            .classes
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .middleNameFemale)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object maleNameFormats =
                ZVal.arrayFromList(
                        "{{lastName}} {{firstNameMale}}",
                        "{{titleMale}}. {{lastName}} {{firstNameMale}}",
                        "{{lastName}} {{middleNameMale}} {{firstNameMale}}",
                        "{{titleMale}}. {{lastName}} {{middleNameMale}} {{firstNameMale}}");

        public Object femaleNameFormats =
                ZVal.arrayFromList(
                        "{{lastName}} {{firstNameFemale}}",
                        "{{titleFemale}}. {{lastName}} {{firstNameFemale}}",
                        "{{lastName}} {{middleNameFemale}} {{firstNameFemale}}",
                        "{{titleFemale}}. {{lastName}} {{middleNameFemale}} {{firstNameFemale}}");

        public Object middleNameFormat =
                ZVal.arrayFromList("{{firstNameMale}}", "{{firstNameFemale}}");

        public Object firstNameMale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "An",
                                    "Anh",
                                    "B\u00E0o",
                                    "B\u00ECnh",
                                    "B\u1EA1ch",
                                    "B\u1EA3o",
                                    "B\u1EAFc",
                                    "B\u1EB1ng",
                                    "B\u1ED5ng",
                                    "B\u1EEDu",
                                    "Ca",
                                    "Canh",
                                    "Chi\u1EBFn",
                                    "Chi\u1EC3u",
                                    "Ch\u00E2u",
                                    "Ch\u00EDnh",
                                    "Ch\u01B0\u01A1ng",
                                    "Ch\u01B0\u1EDFng",
                                    "Ch\u1EA5n",
                                    "C\u00F4ng",
                                    "C\u01A1",
                                    "C\u01B0\u01A1ng",
                                    "C\u01B0\u1EDDng",
                                    "C\u1EA3nh",
                                    "C\u1EA7n",
                                    "C\u1EA9n",
                                    "Danh",
                                    "Di",
                                    "Dinh",
                                    "Di\u1EC7p",
                                    "Di\u1EC7u",
                                    "Du",
                                    "Duy",
                                    "Du\u1EC7",
                                    "D\u00E2n",
                                    "D\u0169ng",
                                    "D\u01B0\u01A1ng",
                                    "D\u1EE5ng",
                                    "Giang",
                                    "Gi\u00E1c",
                                    "Gi\u00E1p",
                                    "Hi\u00EAn",
                                    "Hi\u1EBFu",
                                    "Hi\u1EC1n",
                                    "Hi\u1EC3n",
                                    "Hi\u1EC7p",
                                    "Hoa",
                                    "Ho\u00E0i",
                                    "Ho\u00E0n",
                                    "Ho\u00E0ng",
                                    "Ho\u00E1n",
                                    "Huy",
                                    "Huynh",
                                    "Hu\u1EA5n",
                                    "Hu\u1EF3nh",
                                    "H\u00E0",
                                    "H\u00E0nh",
                                    "H\u00E0o",
                                    "H\u00F2a",
                                    "H\u00F9ng",
                                    "H\u01B0ng",
                                    "H\u1EA1nh",
                                    "H\u1EA3i",
                                    "H\u1EA3o",
                                    "H\u1EADu",
                                    "H\u1ECDc",
                                    "H\u1ED3ng",
                                    "H\u1ED9i",
                                    "H\u1EE3p",
                                    "H\u1EEFu",
                                    "H\u1EF7",
                                    "Kha",
                                    "Khang",
                                    "Khanh",
                                    "Khi\u00EAm",
                                    "Khi\u1EBFu",
                                    "Khoa",
                                    "Kho\u00E1t",
                                    "Kh\u00E1nh",
                                    "Kh\u00F4i",
                                    "Kh\u01B0\u01A1ng",
                                    "Kh\u1EA3i",
                                    "Kim",
                                    "Ki\u00EAn",
                                    "Ki\u1EBFm",
                                    "Ki\u1EC7n",
                                    "Ki\u1EC7t",
                                    "K\u00EDnh",
                                    "K\u1EF3",
                                    "K\u1EF7",
                                    "Lai",
                                    "Lam",
                                    "Linh",
                                    "Li\u00EAm",
                                    "Long",
                                    "Lu\u1EADn",
                                    "Lu\u1EADt",
                                    "L\u00E2m",
                                    "L\u00E2n",
                                    "L\u00FD",
                                    "L\u0129nh",
                                    "L\u01B0\u01A1ng",
                                    "L\u1EA1c",
                                    "L\u1EADp",
                                    "L\u1EC5",
                                    "L\u1ED9",
                                    "L\u1ED9c",
                                    "L\u1EF1c",
                                    "Minh",
                                    "M\u1EA1nh",
                                    "M\u1EABn",
                                    "M\u1EF9",
                                    "Nam",
                                    "Nghi\u00EAm",
                                    "Nghi\u1EC7p",
                                    "Ngh\u0129a",
                                    "Ngh\u1ECB",
                                    "Nguy\u00EAn",
                                    "Ng\u00E2n",
                                    "Ng\u00F4n",
                                    "Ng\u1EA1n",
                                    "Ng\u1ECDc",
                                    "Nhi\u00EAn",
                                    "Nhu",
                                    "Nhu\u1EADn",
                                    "Nh\u00E2n",
                                    "Nh\u00E3",
                                    "Nh\u01B0\u1EE3ng",
                                    "Nh\u1EA1n",
                                    "Nh\u1EADt",
                                    "Ninh",
                                    "Phi",
                                    "Phong",
                                    "Ph\u00E1p",
                                    "Ph\u00E1t",
                                    "Ph\u00FA",
                                    "Ph\u00FAc",
                                    "Ph\u01B0\u01A1ng",
                                    "Ph\u01B0\u1EDBc",
                                    "Ph\u1EE5ng",
                                    "Quang",
                                    "Quy\u1EBFt",
                                    "Quy\u1EC1n",
                                    "Qu\u00E2n",
                                    "Qu\u00FD",
                                    "Qu\u1EA3ng",
                                    "Qu\u1EBF",
                                    "Qu\u1ED1c",
                                    "Qu\u1EF3nh",
                                    "Sang",
                                    "Sinh",
                                    "Si\u00EAu",
                                    "S\u00E1ng",
                                    "S\u00E2m",
                                    "S\u0129",
                                    "S\u01A1n",
                                    "S\u1EED",
                                    "S\u1EF9",
                                    "Thanh",
                                    "Thi\u00EAn",
                                    "Thi\u1EC7n",
                                    "Thu\u1EADn",
                                    "Th\u00E0nh",
                                    "Th\u00E1i",
                                    "Th\u00F4ng",
                                    "Th\u00FAc",
                                    "Th\u1EA1c",
                                    "Th\u1EA1ch",
                                    "Th\u1EAFng",
                                    "Th\u1EC3",
                                    "Th\u1ECBnh",
                                    "Th\u1ECD",
                                    "Th\u1ED1ng",
                                    "Th\u1EDDi",
                                    "Th\u1EE5y",
                                    "Th\u1EE7y",
                                    "Th\u1EF1c",
                                    "Ti\u1EBFn",
                                    "Ti\u1EBFp",
                                    "Ti\u1EC1n",
                                    "Ti\u1EC3n",
                                    "To\u00E0n",
                                    "To\u1EA1i",
                                    "To\u1EA3n",
                                    "Trang",
                                    "Tri\u1EBFt",
                                    "Tri\u1EC1u",
                                    "Tri\u1EC7u",
                                    "Trung",
                                    "Tr\u00E1c",
                                    "Tr\u00E1ng",
                                    "Tr\u00E2n",
                                    "Tr\u00ECnh",
                                    "Tr\u00ED",
                                    "Tr\u00FAc",
                                    "Tr\u01B0\u1EDDng",
                                    "Tr\u01B0\u1EDFng",
                                    "Tr\u1EA1ch",
                                    "Tr\u1ECDng",
                                    "Tr\u1EE5",
                                    "Tr\u1EF1c",
                                    "Tuy\u1EC1n",
                                    "Tu\u1EA5n",
                                    "Tu\u1EC7",
                                    "T\u00E0i",
                                    "T\u00E2m",
                                    "T\u00E2n",
                                    "T\u00EDn",
                                    "T\u00F9ng",
                                    "T\u00FA",
                                    "T\u01B0\u1EDDng",
                                    "T\u1EA5n",
                                    "T\u1EE5",
                                    "T\u1EEB",
                                    "Uy",
                                    "Vinh",
                                    "Vi\u00EAn",
                                    "Vi\u1EC7t",
                                    "Vu",
                                    "V\u00F5",
                                    "V\u0103n",
                                    "V\u0129",
                                    "V\u0129nh",
                                    "V\u0169",
                                    "V\u01B0\u01A1ng",
                                    "V\u01B0\u1EE3ng",
                                    "V\u1ECBnh",
                                    "V\u1EF9",
                                    "Xu\u00E2n",
                                    "Y\u00EAn",
                                    "\u00C1n",
                                    "\u00C2n",
                                    "\u0110an",
                                    "\u0110i\u1EC1n",
                                    "\u0110i\u1EC7p",
                                    "\u0110o\u00E0n",
                                    "\u0110\u00ECnh",
                                    "\u0110\u00F4n",
                                    "\u0110\u0103ng",
                                    "\u0110\u1EA1i",
                                    "\u0110\u1EA1o",
                                    "\u0110\u1EA1t",
                                    "\u0110\u1ECBnh",
                                    "\u0110\u1ED3ng",
                                    "\u0110\u1ED9",
                                    "\u0110\u1EE9c",
                                    "\u0110\u1EE9c",
                                    "\u1EA8n");
                        });

        public Object middleNameMale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "An",
                                    "Anh",
                                    "B\u00E1",
                                    "B\u00E1ch",
                                    "B\u00ECnh",
                                    "B\u00EDch",
                                    "B\u1EA3o",
                                    "B\u1EB1ng",
                                    "B\u1EEDu",
                                    "B\u1EEFu",
                                    "Cao",
                                    "Chi\u00EAu",
                                    "Chi\u1EBFn",
                                    "Chung",
                                    "Chu\u1EA9n",
                                    "Ch\u00E1nh",
                                    "Ch\u00ED",
                                    "Ch\u00EDnh",
                                    "Ch\u1EA5n",
                                    "Ch\u1EBF",
                                    "C\u00E1t",
                                    "C\u00F4ng",
                                    "C\u01B0\u01A1ng",
                                    "C\u01B0\u1EDDng",
                                    "C\u1EA3nh",
                                    "Danh",
                                    "Duy",
                                    "D\u00E2n",
                                    "D\u0169ng",
                                    "D\u01B0\u01A1ng",
                                    "Gia",
                                    "Giang",
                                    "Hi\u1EBFu",
                                    "Hi\u1EC1n",
                                    "Hi\u1EC3u",
                                    "Hi\u1EC7p",
                                    "Ho\u00E0i",
                                    "Ho\u00E0n",
                                    "Ho\u00E0ng",
                                    "Huy",
                                    "Hu\u00E2n",
                                    "H\u00E0",
                                    "H\u00E0o",
                                    "H\u00E1n",
                                    "H\u00F2a",
                                    "H\u00F9ng",
                                    "H\u01B0ng",
                                    "H\u01B0\u1EDBng",
                                    "H\u1EA1nh",
                                    "H\u1EA1o",
                                    "H\u1EA3i",
                                    "H\u1ED3",
                                    "H\u1ED3ng",
                                    "H\u1EEFu",
                                    "Khai",
                                    "Khang",
                                    "Khoa",
                                    "Khuy\u1EBFn",
                                    "Kh\u00E1nh",
                                    "Kh\u00F4i",
                                    "Kh\u01B0\u01A1ng",
                                    "Kh\u1EA3i",
                                    "Kh\u1EAFc",
                                    "Kh\u1EDFi",
                                    "Kim",
                                    "Ki\u00EAn",
                                    "Ki\u1EBFn",
                                    "Ki\u1EC7t",
                                    "K\u1EF3",
                                    "Lam",
                                    "Li\u00EAn",
                                    "Long",
                                    "L\u00E2m",
                                    "L\u01B0\u01A1ng",
                                    "L\u1EA1c",
                                    "L\u1EADp",
                                    "Minh",
                                    "M\u1EA1nh",
                                    "M\u1ED9ng",
                                    "Nam",
                                    "Ngh\u0129a",
                                    "Ngh\u1ECB",
                                    "Nguy\u00EAn",
                                    "Nguy\u1EC5n",
                                    "Ng\u1ECDc",
                                    "Nh\u00E2n",
                                    "Nh\u01B0",
                                    "Nh\u1EA5t",
                                    "Nh\u1EADt",
                                    "Ni\u1EC7m",
                                    "Phi",
                                    "Phong",
                                    "Ph\u00FA",
                                    "Ph\u00FAc",
                                    "Ph\u01B0\u01A1ng",
                                    "Ph\u01B0\u1EDBc",
                                    "Ph\u01B0\u1EE3ng",
                                    "Ph\u1EE5c",
                                    "Ph\u1EE5ng",
                                    "Quang",
                                    "Quy\u1EBFt",
                                    "Qu\u00E2n",
                                    "Qu\u00FD",
                                    "Qu\u1EA3ng",
                                    "Qu\u1ED1c",
                                    "Song",
                                    "S\u0129",
                                    "S\u01A1n",
                                    "S\u1EF9",
                                    "T\u00E0i",
                                    "T\u1EA1",
                                    "\u00C2n",
                                    "\u0110an",
                                    "\u0110inh",
                                    "\u0110o\u00E0n",
                                    "\u0110\u00ECnh",
                                    "\u0110\u00F4ng",
                                    "\u0110\u0103ng",
                                    "\u0110\u1EA1i",
                                    "\u0110\u1EA1t",
                                    "\u0110\u1EAFc",
                                    "\u0110\u1ECBnh",
                                    "\u0110\u1ED3ng",
                                    "\u0110\u1EE9c",
                                    "\u0110\u0103ng",
                                    "\u0110\u1EE9c");
                        });

        public Object firstNameFemale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "An",
                                    "Anh",
                                    "B\u00ECnh",
                                    "B\u00EDch",
                                    "B\u0103ng",
                                    "B\u1EA1ch",
                                    "B\u1EA3o",
                                    "Ca",
                                    "Chi",
                                    "Chinh",
                                    "Chi\u00EAu",
                                    "Chung",
                                    "Ch\u00E2u",
                                    "C\u00E1t",
                                    "C\u00FAc",
                                    "C\u01B0\u01A1ng",
                                    "C\u1EA7m",
                                    "Dao",
                                    "Di",
                                    "Di\u1EC5m",
                                    "Di\u1EC7p",
                                    "Di\u1EC7u",
                                    "Du",
                                    "Dung",
                                    "Duy\u00EAn",
                                    "D\u00E2n",
                                    "D\u01B0\u01A1ng",
                                    "Giang",
                                    "Giao",
                                    "Hi\u1EBFu",
                                    "Hi\u1EC1n",
                                    "Hi\u1EC7p",
                                    "Hoa",
                                    "Hoan",
                                    "Ho\u00E0i",
                                    "Ho\u00E0n",
                                    "Huy\u1EC1n",
                                    "Hu\u1EC7",
                                    "H\u00E0",
                                    "H\u00E2n",
                                    "H\u00F2a",
                                    "H\u01B0\u01A1ng",
                                    "H\u01B0\u1EDDng",
                                    "H\u1EA1",
                                    "H\u1EA1nh",
                                    "H\u1EA3i",
                                    "H\u1EA3o",
                                    "H\u1EADu",
                                    "H\u1EB1ng",
                                    "H\u1ED3ng",
                                    "H\u1EE3p",
                                    "Khai",
                                    "Khanh",
                                    "Khuy\u00EAn",
                                    "Khu\u00EA",
                                    "Kh\u00E1nh",
                                    "Kh\u00EA",
                                    "Kh\u00F4i",
                                    "Kim",
                                    "Ki\u1EC1u",
                                    "Lam",
                                    "Lan",
                                    "Linh",
                                    "Li\u00EAn",
                                    "Li\u1EC5u",
                                    "Loan",
                                    "Ly",
                                    "L\u00E2m",
                                    "L\u00FD",
                                    "L\u1EC5",
                                    "L\u1EC7",
                                    "L\u1ED9c",
                                    "L\u1EE3i",
                                    "Mai",
                                    "Mi",
                                    "Minh",
                                    "Mi\u00EAn",
                                    "My",
                                    "M\u1EABn",
                                    "M\u1EF9",
                                    "Nga",
                                    "Nghi",
                                    "Nguy\u00EAn",
                                    "Nguy\u1EC7t",
                                    "Ng\u00E0",
                                    "Ng\u00E2n",
                                    "Ng\u00F4n",
                                    "Ng\u1ECDc",
                                    "Nhi",
                                    "Nhi\u00EAn",
                                    "Nhung",
                                    "Nh\u00E0n",
                                    "Nh\u00E2n",
                                    "Nh\u00E3",
                                    "Nh\u01B0",
                                    "N\u01B0\u01A1ng",
                                    "N\u1EEF",
                                    "Oanh",
                                    "Phi",
                                    "Phong",
                                    "Ph\u00FAc",
                                    "Ph\u01B0\u01A1ng",
                                    "Ph\u01B0\u1EDBc",
                                    "Ph\u01B0\u1EE3ng",
                                    "Ph\u1EE5ng",
                                    "Quy\u00EAn",
                                    "Qu\u00E2n",
                                    "Qu\u1EBF",
                                    "Qu\u1EF3nh",
                                    "Sa",
                                    "San",
                                    "Sinh",
                                    "S\u01B0\u01A1ng",
                                    "Thanh",
                                    "Th\u1EA3o",
                                    "Thi",
                                    "Thi\u00EAn",
                                    "Thi\u1EC7n",
                                    "Thoa",
                                    "Tho\u1EA1i",
                                    "Thu",
                                    "Thu\u1EA7n",
                                    "Thu\u1EADn",
                                    "Thy",
                                    "Th\u00EAu",
                                    "Th\u00F9y",
                                    "Th\u00FAy",
                                    "Th\u01A1",
                                    "Th\u01B0",
                                    "Th\u01B0\u01A1ng",
                                    "Th\u01B0\u1EDDng",
                                    "Th\u1EA3o",
                                    "Th\u1EAFm",
                                    "Th\u1EE5c",
                                    "Th\u1EE7y",
                                    "Ti\u00EAn",
                                    "Trang",
                                    "Trinh",
                                    "Trung",
                                    "Tr\u00E0",
                                    "Tr\u00E2m",
                                    "Tr\u00E2n",
                                    "Tr\u00FAc",
                                    "Tr\u1EA7m",
                                    "Tuy\u1EBFn",
                                    "Tuy\u1EBFt",
                                    "Tuy\u1EC1n",
                                    "Tu\u1EC7",
                                    "Ty",
                                    "T\u00E2m",
                                    "T\u00FA",
                                    "Uy\u00EAn",
                                    "Uy\u1EC3n",
                                    "Vi",
                                    "Vi\u1EC7t",
                                    "Vy",
                                    "V\u00E2n",
                                    "V\u0169",
                                    "V\u1ECDng",
                                    "V\u1EF9",
                                    "Xuy\u1EBFn",
                                    "Xu\u00E2n",
                                    "Y\u00EAn",
                                    "Y\u1EBFn",
                                    "\u00C1i",
                                    "\u00C1nh",
                                    "\u00C2n",
                                    "\u0110an",
                                    "\u0110i\u1EC7p",
                                    "\u0110oan",
                                    "\u0110\u00E0i",
                                    "\u0110\u00E0n",
                                    "\u0110\u00E0o",
                                    "\u0110\u00ECnh",
                                    "\u0110\u01B0\u1EDDng",
                                    "\u0110an",
                                    "\u00DD");
                        });

        public Object middleNameFemale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "An",
                                    "Anh",
                                    "Ban",
                                    "B\u00EDch",
                                    "B\u0103ng",
                                    "B\u1EA1ch",
                                    "B\u1EA3o",
                                    "B\u1ED9i",
                                    "Cam",
                                    "Chi",
                                    "Chi\u00EAu",
                                    "C\u00E1t",
                                    "C\u1EA9m",
                                    "Di",
                                    "Di\u00EAn",
                                    "Di\u1EC5m",
                                    "Di\u1EC7p",
                                    "Di\u1EC7u",
                                    "Duy",
                                    "Duy\u00EAn",
                                    "D\u00E3",
                                    "D\u1EA1",
                                    "Gia",
                                    "Giang",
                                    "Giao",
                                    "Gi\u00E1ng",
                                    "Hi\u1EBFu",
                                    "Hi\u1EC1n",
                                    "Hi\u1EC3u",
                                    "Hoa",
                                    "Ho\u00E0i",
                                    "Ho\u00E0n",
                                    "Ho\u00E0ng",
                                    "Huy\u1EC1n",
                                    "Hu\u1EC7",
                                    "Hu\u1EF3nh",
                                    "H\u00E0",
                                    "H\u00E0m",
                                    "H\u01B0\u01A1ng",
                                    "H\u1EA1",
                                    "H\u1EA1c",
                                    "H\u1EA1nh",
                                    "H\u1EA3i",
                                    "H\u1EA3o",
                                    "H\u1EB1ng",
                                    "H\u1ECDa",
                                    "H\u1ED3",
                                    "H\u1ED3ng",
                                    "Khi\u1EBFt",
                                    "Khu\u00EA",
                                    "Kh\u00E1nh",
                                    "Kh\u00FAc",
                                    "Kh\u1EA3",
                                    "Kh\u1EA3i",
                                    "Kim",
                                    "Ki\u1EBFt",
                                    "Ki\u1EC1u",
                                    "K\u1EF3",
                                    "Lam",
                                    "Lan",
                                    "Linh",
                                    "Li\u00EAn",
                                    "Li\u1EC5u",
                                    "Loan",
                                    "Ly",
                                    "L\u00E2m",
                                    "L\u00EA",
                                    "L\u01B0u",
                                    "L\u1EC7",
                                    "L\u1ED9c",
                                    "L\u1EE5c",
                                    "Mai",
                                    "Minh",
                                    "M\u1EADu",
                                    "M\u1ED9c",
                                    "M\u1ED9ng",
                                    "M\u1EF9",
                                    "Nghi",
                                    "Nguy\u00EAn",
                                    "Nguy\u1EBFt",
                                    "Nguy\u1EC7t",
                                    "Ng\u00E2n",
                                    "Ng\u1ECDc",
                                    "Nhan",
                                    "Nh\u00E3",
                                    "Nh\u01B0",
                                    "Nh\u1EA5t",
                                    "Nh\u1EADt",
                                    "Oanh",
                                    "Phi",
                                    "Phong",
                                    "Ph\u01B0\u01A1ng",
                                    "Ph\u01B0\u1EDBc",
                                    "Ph\u01B0\u1EE3ng",
                                    "Ph\u1EE5ng",
                                    "Qu\u1EBF",
                                    "Qu\u1EF3nh",
                                    "Sao",
                                    "Song",
                                    "S\u00F4ng",
                                    "S\u01A1n",
                                    "S\u01B0\u01A1ng",
                                    "Thanh",
                                    "Thi",
                                    "Thi\u00EAn",
                                    "Thi\u1EBFu",
                                    "Thi\u1EC1u",
                                    "Thi\u1EC7n",
                                    "Thu",
                                    "Thu\u1EA7n",
                                    "Thy",
                                    "Th\u00E1i",
                                    "Th\u00F9y",
                                    "Th\u00FAy",
                                    "Th\u01A1",
                                    "Th\u01B0",
                                    "Th\u01B0\u01A1ng",
                                    "Th\u1EA1ch",
                                    "Th\u1EA3o",
                                    "Th\u1EE5c",
                                    "Th\u1EE5y",
                                    "Th\u1EE7y",
                                    "Ti\u00EAn",
                                    "Ti\u1EC3u",
                                    "Trang",
                                    "Tri\u1EC1u",
                                    "Tri\u1EC7u",
                                    "Tr\u00E0",
                                    "Tr\u00E2m",
                                    "Tr\u00E2n",
                                    "Tr\u00FAc",
                                    "Tr\u1EA7m",
                                    "Tuy\u1EBFt",
                                    "Tu\u1EC7",
                                    "T\u00E2m",
                                    "T\u00F9ng",
                                    "T\u00F9y",
                                    "T\u00FA",
                                    "T\u00FAy",
                                    "T\u01B0\u1EDDng",
                                    "T\u1ECBnh",
                                    "T\u1ED1",
                                    "T\u1EEB",
                                    "Uy\u00EAn",
                                    "Uy\u1EC3n",
                                    "Vi",
                                    "Vi\u1EC7t",
                                    "Vy",
                                    "V\u00E0ng",
                                    "V\u00E0nh",
                                    "V\u00E2n",
                                    "V\u0169",
                                    "Xuy\u1EBFn",
                                    "Xu\u00E2n",
                                    "Y\u00EAn",
                                    "Y\u1EBFn",
                                    "\u00C1i",
                                    "\u00C1nh",
                                    "\u0110an",
                                    "\u0110inh",
                                    "\u0110oan",
                                    "\u0110\u00E0i",
                                    "\u0110\u00F4ng",
                                    "\u0110\u1ED3ng",
                                    "\u0110an",
                                    "\u0110oan",
                                    "\u00DD");
                        });

        public Object lastName =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "An",
                                    "\u00C1nh",
                                    "\u00C2n",
                                    "\u00C2u",
                                    "\u1EA4u",
                                    "Bi\u1EC7n",
                                    "B\u00E0ng",
                                    "B\u00E0nh",
                                    "B\u00E1",
                                    "B\u00EC",
                                    "B\u00ECnh",
                                    "B\u00F9i",
                                    "B\u1EA1c",
                                    "B\u1EA1ch",
                                    "B\u1EA3o",
                                    "B\u1EBF",
                                    "B\u1ED3",
                                    "B\u1EEDu",
                                    "Ca",
                                    "Cam",
                                    "Cao",
                                    "Chi\u00EAm",
                                    "Chu",
                                    "Chung",
                                    "Ch\u00E2u",
                                    "Ch\u01B0\u01A1ng",
                                    "Ch\u1EBF",
                                    "Ch\u1EED",
                                    "Cung",
                                    "C\u00E1i",
                                    "C\u00E1t",
                                    "C\u00F9",
                                    "C\u1EA5n",
                                    "C\u1EA7m",
                                    "C\u1ED5",
                                    "C\u1EF1",
                                    "Danh",
                                    "Di\u00EAm",
                                    "Di\u1EC7p",
                                    "Do\u00E3n",
                                    "D\u00E3",
                                    "D\u01B0",
                                    "D\u01B0\u01A1ng",
                                    "\u0110an",
                                    "\u0110\u00E0m",
                                    "\u0110\u00E0o",
                                    "\u0110\u00E1i",
                                    "\u0110\u1EB7ng",
                                    "\u0110\u1EADu",
                                    "\u0110inh",
                                    "\u0110i\u1EC1n",
                                    "\u0110o\u00E0n",
                                    "\u0110\u00F4n",
                                    "\u0110\u1ED3ng",
                                    "\u0110\u1ED5ng",
                                    "\u0110\u1ED7",
                                    "\u0110\u1EDBi",
                                    "\u0110\u01B0\u1EDDng",
                                    "Giang",
                                    "Giao",
                                    "Gi\u00E1p",
                                    "Gi\u1EA3",
                                    "Hoa",
                                    "Ho\u00E0ng",
                                    "Hu\u1EF3nh",
                                    "Hy",
                                    "H\u00E0",
                                    "H\u00E0n",
                                    "H\u00E0ng",
                                    "H\u00E1n",
                                    "H\u00ECnh",
                                    "H\u00F9ng",
                                    "H\u1EA1",
                                    "H\u1ED3",
                                    "H\u1ED3ng",
                                    "H\u1EE9a",
                                    "Kha",
                                    "Khoa",
                                    "Khu",
                                    "Khu\u1EA5t",
                                    "Kh\u00E2u",
                                    "Kh\u00FAc",
                                    "Kh\u01B0u",
                                    "Kh\u01B0\u01A1ng",
                                    "Kh\u1ED5ng",
                                    "Kim",
                                    "Ki\u1EC1u",
                                    "La",
                                    "Li\u1EC5u",
                                    "L\u00E2m",
                                    "L\u00E3",
                                    "L\u00EA",
                                    "L\u00F2",
                                    "L\u00F4",
                                    "L\u00FD",
                                    "L\u01B0",
                                    "L\u01B0u",
                                    "L\u01B0\u01A1ng",
                                    "L\u1EA1c",
                                    "L\u1EA1i",
                                    "L\u1EC1u",
                                    "L\u1EE1",
                                    "L\u1EE5c",
                                    "L\u1EEF",
                                    "L\u1EF3",
                                    "Ma",
                                    "Mai",
                                    "Mang",
                                    "M\u00E2u",
                                    "M\u00E3",
                                    "M\u1EA1c",
                                    "M\u1EA1ch",
                                    "M\u1EABn",
                                    "M\u1ED9c",
                                    "Nghi\u00EAm",
                                    "Ngh\u1ECB",
                                    "Nguy\u1EC5n",
                                    "Ng\u00E2n",
                                    "Ng\u00F4",
                                    "Ng\u1EE5y",
                                    "Nhi\u1EC7m",
                                    "Nh\u00E2m",
                                    "Nh\u1EADm",
                                    "Nh\u1EEF",
                                    "Ninh",
                                    "N\u00F4ng",
                                    "Ong",
                                    "\u00D4ng",
                                    "Phan",
                                    "Phi",
                                    "Ph\u00ED",
                                    "Ph\u00F3",
                                    "Ph\u00F9ng",
                                    "Ph\u01B0\u01A1ng",
                                    "Ph\u1EA1m",
                                    "Qu\u00E1ch",
                                    "Qu\u1EA3n",
                                    "S\u01A1n",
                                    "S\u1EED",
                                    "Thi",
                                    "Thi\u1EC1u",
                                    "Th\u00E0o",
                                    "Th\u00E1i",
                                    "Th\u00E2n",
                                    "Th\u00F4i",
                                    "Th\u1EA1ch",
                                    "Th\u1EADp",
                                    "Th\u1ECBnh",
                                    "Ti\u00EAu",
                                    "Ti\u1EBFp",
                                    "Trang",
                                    "Tri\u1EC7u",
                                    "Tr\u00E0",
                                    "Tr\u00E1c",
                                    "Tr\u00ECnh",
                                    "Tr\u01B0ng",
                                    "Tr\u01B0\u01A1ng",
                                    "Tr\u1EA7n",
                                    "Tr\u1ECBnh",
                                    "Ty",
                                    "T\u00E0o",
                                    "T\u00F2ng",
                                    "T\u00F4",
                                    "T\u00F4n",
                                    "T\u00F4ng",
                                    "T\u0103ng",
                                    "T\u1EA1",
                                    "T\u1ED1ng",
                                    "T\u1EEB",
                                    "Ung",
                                    "U\u00F4ng",
                                    "Vi",
                                    "Vi\u00EAn",
                                    "V\u00F5",
                                    "V\u0103n",
                                    "V\u0169",
                                    "V\u01B0\u01A1ng",
                                    "V\u1EEB",
                                    "Xa",
                                    "Y\u00EAn");
                        });

        public Object titleMale =
                ZVal.arrayFromList("C\u1EE5", "\u00D4ng", "B\u00E1c", "Ch\u00FA", "Anh", "Em");

        public Object titleFemale =
                ZVal.arrayFromList("C\u1EE5", "B\u00E0", "B\u00E1c", "C\u00F4", "Ch\u1ECB", "Em");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\vi_VN\\Person")
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
                            "middleNameFemale",
                            "middleNameFormat",
                            "middleNameMale",
                            "titleFemale",
                            "titleMale")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/vi_VN/Person.php")
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
