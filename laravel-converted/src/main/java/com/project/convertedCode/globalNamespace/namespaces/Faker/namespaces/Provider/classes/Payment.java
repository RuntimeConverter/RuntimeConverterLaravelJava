package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Calculator.classes.Iban;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Calculator.classes.Luhn;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes.Base;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/Payment.php

*/

public class Payment extends Base {

    public Payment(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Payment.class) {
            this.__construct(env, args);
        }
    }

    public Payment(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "valid",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object creditCardExpirationDate(RuntimeEnv env, Object... args) {
        Object valid = assignParameter(args, 0, true);
        if (null == valid) {
            valid = true;
        }
        if (ZVal.isTrue(valid)) {
            return ZVal.assign(
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("generator").value(),
                            "dateTimeBetween",
                            Payment.class,
                            "now",
                            "36 months"));
        }

        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "dateTimeBetween",
                        Payment.class,
                        "-36 months",
                        "36 months"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "valid",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "expirationDateFormat",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object creditCardExpirationDateString(RuntimeEnv env, Object... args) {
        Object valid = assignParameter(args, 0, true);
        if (null == valid) {
            valid = true;
        }
        Object expirationDateFormat = assignParameter(args, 1, true);
        if (null == expirationDateFormat) {
            expirationDateFormat = ZVal.getNull();
        }
        return ZVal.assign(
                env.callMethod(
                        this.creditCardExpirationDate(env, valid),
                        "format",
                        Payment.class,
                        function_is_null.f.env(env).call(expirationDateFormat).getBool()
                                ? env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Faker
                                                        .namespaces
                                                        .Provider
                                                        .classes
                                                        .Payment
                                                        .RequestStaticProperties
                                                        .class)
                                        .expirationDateFormat
                                : expirationDateFormat));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "valid",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object creditCardDetails(RuntimeEnv env, Object... args) {
        Object valid = assignParameter(args, 0, true);
        if (null == valid) {
            valid = true;
        }
        ReferenceContainer type = new BasicReferenceContainer(null);
        type.setObject(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Payment.class)
                        .method("creditCardType")
                        .call()
                        .value());
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("type", type.getObject()),
                        new ZPair(
                                "number",
                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, Payment.class)
                                        .method("creditCardNumber")
                                        .addReferenceArgs(
                                                new RuntimeArgsWithReferences().add(0, type))
                                        .call(type.getObject())
                                        .value()),
                        new ZPair(
                                "name",
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("generator")
                                                .value(),
                                        "name",
                                        Payment.class)),
                        new ZPair(
                                "expirationDate",
                                this.creditCardExpirationDateString(env, valid))));
    }

    public static final Object CONST_class = "Faker\\Provider\\Payment";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Base.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object creditCardType(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Payment.class)
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
                                                            .Payment
                                                            .RequestStaticProperties
                                                            .class)
                                            .cardVendors)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "type",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 1,
            name = "formatted",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        @ConvertedParameter(index = 2, name = "separator")
        public Object creditCardNumber(RuntimeEnv env, Object... args) {
            Object type = assignParameter(args, 0, true);
            if (null == type) {
                type = ZVal.getNull();
            }
            Object formatted = assignParameter(args, 1, true);
            if (null == formatted) {
                formatted = false;
            }
            Object separator = assignParameter(args, 2, true);
            if (null == separator) {
                separator = "-";
            }
            Object number = null;
            Object p1 = null;
            Object p2 = null;
            Object p3 = null;
            Object p4 = null;
            Object mask = null;
            if (function_is_null.f.env(env).call(type).getBool()) {
                type =
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Payment.class)
                                .method("creditCardType")
                                .call()
                                .value();
            }

            mask =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Payment.class)
                            .method("randomElement")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    env.getRequestStaticPropertiesReference(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Faker
                                                            .namespaces
                                                            .Provider
                                                            .classes
                                                            .Payment
                                                            .RequestStaticProperties
                                                            .class,
                                                    "cardParams")
                                            .arrayGet(env, type))
                            .value();
            number =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Payment.class)
                            .method("numerify")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(mask)
                            .value();
            number =
                    toStringR(number, env)
                            + toStringR(
                                    Luhn.runtimeStaticObject.computeCheckDigit(env, number), env);
            if (ZVal.isTrue(formatted)) {
                p1 = function_substr.f.env(env).call(number, 0, 4).value();
                p2 = function_substr.f.env(env).call(number, 4, 4).value();
                p3 = function_substr.f.env(env).call(number, 8, 4).value();
                p4 = function_substr.f.env(env).call(number, 12).value();
                number =
                        toStringR(p1, env)
                                + toStringR(separator, env)
                                + toStringR(p2, env)
                                + toStringR(separator, env)
                                + toStringR(p3, env)
                                + toStringR(separator, env)
                                + toStringR(p4, env);
            }

            return ZVal.assign(number);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "countryCode")
        @ConvertedParameter(index = 1, name = "prefix")
        @ConvertedParameter(
            index = 2,
            name = "length",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object iban(RuntimeEnv env, Object... args) {
            int runtimeConverterBreakCount;
            Object countryCode = assignParameter(args, 0, false);
            Object prefix = assignParameter(args, 1, true);
            if (null == prefix) {
                prefix = "";
            }
            Object length = assignParameter(args, 2, true);
            if (null == length) {
                length = ZVal.getNull();
            }
            Object item = null;
            Object part = null;
            Object format = null;
            Object expandedFormat = null;
            Object result = null;
            Object runtimeTempArrayResult6 = null;
            Object groupCount = null;
            Object runtimeTempArrayResult5 = null;
            Object checksum = null;
            Object _pClass = null;
            countryCode =
                    ZVal.assign(
                            function_is_null.f.env(env).call(countryCode).getBool()
                                    ? runtimeStaticObject.randomKey(
                                            env,
                                            env.getRequestStaticProperties(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .Faker
                                                                    .namespaces
                                                                    .Provider
                                                                    .classes
                                                                    .Payment
                                                                    .RequestStaticProperties
                                                                    .class)
                                                    .ibanFormats)
                                    : NamespaceGlobal.strtoupper
                                            .env(env)
                                            .call(countryCode)
                                            .value());
            format =
                    ZVal.assign(
                            !arrayActionR(
                                            ArrayAction.ISSET,
                                            env.getRequestStaticPropertiesReference(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Faker
                                                            .namespaces
                                                            .Provider
                                                            .classes
                                                            .Payment
                                                            .RequestStaticProperties
                                                            .class,
                                                    "ibanFormats"),
                                            env,
                                            countryCode)
                                    ? ZVal.getNull()
                                    : env.getRequestStaticPropertiesReference(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Faker
                                                            .namespaces
                                                            .Provider
                                                            .classes
                                                            .Payment
                                                            .RequestStaticProperties
                                                            .class,
                                                    "ibanFormats")
                                            .arrayGet(env, countryCode));
            if (ZVal.strictEqualityCheck(length, "===", ZVal.getNull())) {
                if (ZVal.strictEqualityCheck(format, "===", ZVal.getNull())) {
                    length = 24;

                } else {
                    length = 0;
                    runtimeConverterBreakCount = 0;
                    for (ZPair zpairResult107 : ZVal.getIterable(format, env, true)) {
                        part = ZVal.assign(zpairResult107.getValue());
                        ZVal.list(
                                runtimeTempArrayResult5 = part,
                                (_pClass = listGet(runtimeTempArrayResult5, 0, env)),
                                (groupCount = listGet(runtimeTempArrayResult5, 1, env)));
                        length = ZAssignment.add("+=", length, groupCount);
                    }
                }
            }

            if (ZVal.strictEqualityCheck(format, "===", ZVal.getNull())) {
                format =
                        ZVal.newArray(
                                new ZPair(
                                        0, ZVal.newArray(new ZPair(0, "n"), new ZPair(1, length))));
            }

            expandedFormat = "";
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult108 : ZVal.getIterable(format, env, true)) {
                item = ZVal.assign(zpairResult108.getValue());
                ZVal.list(
                        runtimeTempArrayResult6 = item,
                        (_pClass = listGet(runtimeTempArrayResult6, 0, env)),
                        (length = listGet(runtimeTempArrayResult6, 1, env)));
                expandedFormat =
                        toStringR(expandedFormat, env)
                                + toStringR(
                                        function_str_repeat
                                                .f
                                                .env(env)
                                                .call(_pClass, length)
                                                .value(),
                                        env);
            }

            result = ZVal.assign(prefix);
            expandedFormat =
                    function_substr
                            .f
                            .env(env)
                            .call(expandedFormat, function_strlen.f.env(env).call(result).value())
                            .value();
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult109 :
                    ZVal.getIterable(
                            NamespaceGlobal.str_split.env(env).call(expandedFormat).value(),
                            env,
                            true)) {
                _pClass = ZVal.assign(zpairResult109.getValue());
                SwitchEnumType10 switchVariable10 =
                        ZVal.getEnum(
                                _pClass,
                                SwitchEnumType10.DEFAULT_CASE,
                                SwitchEnumType10.STRING_c,
                                "c",
                                SwitchEnumType10.STRING_a,
                                "a",
                                SwitchEnumType10.STRING_n,
                                "n");
                switch (switchVariable10) {
                    case DEFAULT_CASE:
                    case STRING_c:
                        result =
                                toStringR(result, env)
                                        + toStringR(
                                                ZVal.isLessThanOrEqualTo(
                                                                NamespaceGlobal.mt_rand
                                                                        .env(env)
                                                                        .call(0, 100)
                                                                        .value(),
                                                                "<=",
                                                                50)
                                                        ? StaticMethodUtils
                                                                .accessUnknownLateStaticMethod(
                                                                        env, this, Payment.class)
                                                                .method("randomDigit")
                                                                .call()
                                                                .value()
                                                        : NamespaceGlobal.strtoupper
                                                                .env(env)
                                                                .call(
                                                                        StaticMethodUtils
                                                                                .accessUnknownLateStaticMethod(
                                                                                        env,
                                                                                        this,
                                                                                        Payment
                                                                                                .class)
                                                                                .method(
                                                                                        "randomLetter")
                                                                                .call()
                                                                                .value())
                                                                .value(),
                                                env);
                        break;
                    case STRING_a:
                        result =
                                toStringR(result, env)
                                        + toStringR(
                                                NamespaceGlobal.strtoupper
                                                        .env(env)
                                                        .call(
                                                                StaticMethodUtils
                                                                        .accessUnknownLateStaticMethod(
                                                                                env,
                                                                                this,
                                                                                Payment.class)
                                                                        .method("randomLetter")
                                                                        .call()
                                                                        .value())
                                                        .value(),
                                                env);
                        break;
                    case STRING_n:
                        result =
                                toStringR(result, env)
                                        + toStringR(
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Payment.class)
                                                        .method("randomDigit")
                                                        .call()
                                                        .value(),
                                                env);
                        break;
                }
                ;
            }

            checksum =
                    Iban.runtimeStaticObject.checksum(
                            env, toStringR(countryCode, env) + "00" + toStringR(result, env));
            return ZVal.assign(
                    toStringR(countryCode, env)
                            + toStringR(checksum, env)
                            + toStringR(result, env));
        }

        @ConvertedMethod
        public Object swiftBicNumber(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    runtimeStaticObject.regexify(
                            env, "^([A-Z]){4}([A-Z]){2}([0-9A-Z]){2}([0-9A-Z]{3})?$"));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object expirationDateFormat = "m/y";

        public Object cardVendors =
                ZVal.arrayFromList(
                        "Visa",
                        "Visa",
                        "Visa",
                        "Visa",
                        "Visa",
                        "MasterCard",
                        "MasterCard",
                        "MasterCard",
                        "MasterCard",
                        "MasterCard",
                        "American Express",
                        "Discover Card");

        public Object cardParams =
                ZVal.newArray(
                        new ZPair(
                                "Visa",
                                ZVal.arrayFromList(
                                        "4539########",
                                        "4539###########",
                                        "4556########",
                                        "4556###########",
                                        "4916########",
                                        "4916###########",
                                        "4532########",
                                        "4532###########",
                                        "4929########",
                                        "4929###########",
                                        "40240071####",
                                        "40240071#######",
                                        "4485########",
                                        "4485###########",
                                        "4716########",
                                        "4716###########",
                                        "4###########",
                                        "4##############")),
                        new ZPair(
                                "MasterCard",
                                ZVal.arrayFromList(
                                        "2221###########",
                                        "23#############",
                                        "24#############",
                                        "25#############",
                                        "26#############",
                                        "2720###########",
                                        "51#############",
                                        "52#############",
                                        "53#############",
                                        "54#############",
                                        "55#############")),
                        new ZPair(
                                "American Express",
                                ZVal.arrayFromList("34############", "37############")),
                        new ZPair("Discover Card", ZVal.arrayFromList("6011###########")));

        public Object ibanFormats =
                ZVal.newArray(
                        new ZPair(
                                "AD",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 4)),
                                        new ZPair(1, ZVal.arrayFromList("n", 4)),
                                        new ZPair(2, ZVal.arrayFromList("c", 12)))),
                        new ZPair(
                                "AE",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 3)),
                                        new ZPair(1, ZVal.arrayFromList("n", 16)))),
                        new ZPair(
                                "AL",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 8)),
                                        new ZPair(1, ZVal.arrayFromList("c", 16)))),
                        new ZPair(
                                "AT",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 5)),
                                        new ZPair(1, ZVal.arrayFromList("n", 11)))),
                        new ZPair(
                                "AZ",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("a", 4)),
                                        new ZPair(1, ZVal.arrayFromList("c", 20)))),
                        new ZPair(
                                "BA",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 3)),
                                        new ZPair(1, ZVal.arrayFromList("n", 3)),
                                        new ZPair(2, ZVal.arrayFromList("n", 8)),
                                        new ZPair(3, ZVal.arrayFromList("n", 2)))),
                        new ZPair(
                                "BE",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 3)),
                                        new ZPair(1, ZVal.arrayFromList("n", 7)),
                                        new ZPair(2, ZVal.arrayFromList("n", 2)))),
                        new ZPair(
                                "BG",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("a", 4)),
                                        new ZPair(1, ZVal.arrayFromList("n", 4)),
                                        new ZPair(2, ZVal.arrayFromList("n", 2)),
                                        new ZPair(3, ZVal.arrayFromList("c", 8)))),
                        new ZPair(
                                "BH",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("a", 4)),
                                        new ZPair(1, ZVal.arrayFromList("c", 14)))),
                        new ZPair(
                                "BR",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 8)),
                                        new ZPair(1, ZVal.arrayFromList("n", 5)),
                                        new ZPair(2, ZVal.arrayFromList("n", 10)),
                                        new ZPair(3, ZVal.arrayFromList("a", 1)),
                                        new ZPair(4, ZVal.arrayFromList("c", 1)))),
                        new ZPair(
                                "CH",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 5)),
                                        new ZPair(1, ZVal.arrayFromList("c", 12)))),
                        new ZPair(
                                "CR",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 3)),
                                        new ZPair(1, ZVal.arrayFromList("n", 14)))),
                        new ZPair(
                                "CY",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 3)),
                                        new ZPair(1, ZVal.arrayFromList("n", 5)),
                                        new ZPair(2, ZVal.arrayFromList("c", 16)))),
                        new ZPair(
                                "CZ",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 4)),
                                        new ZPair(1, ZVal.arrayFromList("n", 6)),
                                        new ZPair(2, ZVal.arrayFromList("n", 10)))),
                        new ZPair(
                                "DE",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 8)),
                                        new ZPair(1, ZVal.arrayFromList("n", 10)))),
                        new ZPair(
                                "DK",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 4)),
                                        new ZPair(1, ZVal.arrayFromList("n", 9)),
                                        new ZPair(2, ZVal.arrayFromList("n", 1)))),
                        new ZPair(
                                "DO",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("c", 4)),
                                        new ZPair(1, ZVal.arrayFromList("n", 20)))),
                        new ZPair(
                                "EE",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 2)),
                                        new ZPair(1, ZVal.arrayFromList("n", 2)),
                                        new ZPair(2, ZVal.arrayFromList("n", 11)),
                                        new ZPair(3, ZVal.arrayFromList("n", 1)))),
                        new ZPair(
                                "ES",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 4)),
                                        new ZPair(1, ZVal.arrayFromList("n", 4)),
                                        new ZPair(2, ZVal.arrayFromList("n", 1)),
                                        new ZPair(3, ZVal.arrayFromList("n", 1)),
                                        new ZPair(4, ZVal.arrayFromList("n", 10)))),
                        new ZPair(
                                "FI",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 6)),
                                        new ZPair(1, ZVal.arrayFromList("n", 7)),
                                        new ZPair(2, ZVal.arrayFromList("n", 1)))),
                        new ZPair(
                                "FR",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 5)),
                                        new ZPair(1, ZVal.arrayFromList("n", 5)),
                                        new ZPair(2, ZVal.arrayFromList("c", 11)),
                                        new ZPair(3, ZVal.arrayFromList("n", 2)))),
                        new ZPair(
                                "GB",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("a", 4)),
                                        new ZPair(1, ZVal.arrayFromList("n", 6)),
                                        new ZPair(2, ZVal.arrayFromList("n", 8)))),
                        new ZPair(
                                "GE",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("a", 2)),
                                        new ZPair(1, ZVal.arrayFromList("n", 16)))),
                        new ZPair(
                                "GI",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("a", 4)),
                                        new ZPair(1, ZVal.arrayFromList("c", 15)))),
                        new ZPair(
                                "GR",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 3)),
                                        new ZPair(1, ZVal.arrayFromList("n", 4)),
                                        new ZPair(2, ZVal.arrayFromList("c", 16)))),
                        new ZPair(
                                "GT",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("c", 4)),
                                        new ZPair(1, ZVal.arrayFromList("c", 20)))),
                        new ZPair(
                                "HR",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 7)),
                                        new ZPair(1, ZVal.arrayFromList("n", 10)))),
                        new ZPair(
                                "HU",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 3)),
                                        new ZPair(1, ZVal.arrayFromList("n", 4)),
                                        new ZPair(2, ZVal.arrayFromList("n", 1)),
                                        new ZPair(3, ZVal.arrayFromList("n", 15)),
                                        new ZPair(4, ZVal.arrayFromList("n", 1)))),
                        new ZPair(
                                "IE",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("a", 4)),
                                        new ZPair(1, ZVal.arrayFromList("n", 6)),
                                        new ZPair(2, ZVal.arrayFromList("n", 8)))),
                        new ZPair(
                                "IL",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 3)),
                                        new ZPair(1, ZVal.arrayFromList("n", 3)),
                                        new ZPair(2, ZVal.arrayFromList("n", 13)))),
                        new ZPair(
                                "IS",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 4)),
                                        new ZPair(1, ZVal.arrayFromList("n", 2)),
                                        new ZPair(2, ZVal.arrayFromList("n", 6)),
                                        new ZPair(3, ZVal.arrayFromList("n", 10)))),
                        new ZPair(
                                "IT",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("a", 1)),
                                        new ZPair(1, ZVal.arrayFromList("n", 5)),
                                        new ZPair(2, ZVal.arrayFromList("n", 5)),
                                        new ZPair(3, ZVal.arrayFromList("c", 12)))),
                        new ZPair(
                                "KW",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("a", 4)),
                                        new ZPair(1, ZVal.arrayFromList("n", 22)))),
                        new ZPair(
                                "KZ",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 3)),
                                        new ZPair(1, ZVal.arrayFromList("c", 13)))),
                        new ZPair(
                                "LB",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 4)),
                                        new ZPair(1, ZVal.arrayFromList("c", 20)))),
                        new ZPair(
                                "LI",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 5)),
                                        new ZPair(1, ZVal.arrayFromList("c", 12)))),
                        new ZPair(
                                "LT",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 5)),
                                        new ZPair(1, ZVal.arrayFromList("n", 11)))),
                        new ZPair(
                                "LU",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 3)),
                                        new ZPair(1, ZVal.arrayFromList("c", 13)))),
                        new ZPair(
                                "LV",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("a", 4)),
                                        new ZPair(1, ZVal.arrayFromList("c", 13)))),
                        new ZPair(
                                "MC",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 5)),
                                        new ZPair(1, ZVal.arrayFromList("n", 5)),
                                        new ZPair(2, ZVal.arrayFromList("c", 11)),
                                        new ZPair(3, ZVal.arrayFromList("n", 2)))),
                        new ZPair(
                                "MD",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("c", 2)),
                                        new ZPair(1, ZVal.arrayFromList("c", 18)))),
                        new ZPair(
                                "ME",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 3)),
                                        new ZPair(1, ZVal.arrayFromList("n", 13)),
                                        new ZPair(2, ZVal.arrayFromList("n", 2)))),
                        new ZPair(
                                "MK",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 3)),
                                        new ZPair(1, ZVal.arrayFromList("c", 10)),
                                        new ZPair(2, ZVal.arrayFromList("n", 2)))),
                        new ZPair(
                                "MR",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 5)),
                                        new ZPair(1, ZVal.arrayFromList("n", 5)),
                                        new ZPair(2, ZVal.arrayFromList("n", 11)),
                                        new ZPair(3, ZVal.arrayFromList("n", 2)))),
                        new ZPair(
                                "MT",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("a", 4)),
                                        new ZPair(1, ZVal.arrayFromList("n", 5)),
                                        new ZPair(2, ZVal.arrayFromList("c", 18)))),
                        new ZPair(
                                "MU",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("a", 4)),
                                        new ZPair(1, ZVal.arrayFromList("n", 2)),
                                        new ZPair(2, ZVal.arrayFromList("n", 2)),
                                        new ZPair(3, ZVal.arrayFromList("n", 12)),
                                        new ZPair(4, ZVal.arrayFromList("n", 3)),
                                        new ZPair(5, ZVal.arrayFromList("a", 3)))),
                        new ZPair(
                                "NL",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("a", 4)),
                                        new ZPair(1, ZVal.arrayFromList("n", 10)))),
                        new ZPair(
                                "NO",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 4)),
                                        new ZPair(1, ZVal.arrayFromList("n", 6)),
                                        new ZPair(2, ZVal.arrayFromList("n", 1)))),
                        new ZPair(
                                "PK",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("a", 4)),
                                        new ZPair(1, ZVal.arrayFromList("c", 16)))),
                        new ZPair(
                                "PL",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 8)),
                                        new ZPair(1, ZVal.arrayFromList("n", 16)))),
                        new ZPair(
                                "PS",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("a", 4)),
                                        new ZPair(1, ZVal.arrayFromList("c", 21)))),
                        new ZPair(
                                "PT",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 4)),
                                        new ZPair(1, ZVal.arrayFromList("n", 4)),
                                        new ZPair(2, ZVal.arrayFromList("n", 11)),
                                        new ZPair(3, ZVal.arrayFromList("n", 2)))),
                        new ZPair(
                                "RO",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("a", 4)),
                                        new ZPair(1, ZVal.arrayFromList("c", 16)))),
                        new ZPair(
                                "RS",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 3)),
                                        new ZPair(1, ZVal.arrayFromList("n", 13)),
                                        new ZPair(2, ZVal.arrayFromList("n", 2)))),
                        new ZPair(
                                "SA",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 2)),
                                        new ZPair(1, ZVal.arrayFromList("c", 18)))),
                        new ZPair(
                                "SE",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 3)),
                                        new ZPair(1, ZVal.arrayFromList("n", 16)),
                                        new ZPair(2, ZVal.arrayFromList("n", 1)))),
                        new ZPair(
                                "SI",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 5)),
                                        new ZPair(1, ZVal.arrayFromList("n", 8)),
                                        new ZPair(2, ZVal.arrayFromList("n", 2)))),
                        new ZPair(
                                "SK",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 4)),
                                        new ZPair(1, ZVal.arrayFromList("n", 6)),
                                        new ZPair(2, ZVal.arrayFromList("n", 10)))),
                        new ZPair(
                                "SM",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("a", 1)),
                                        new ZPair(1, ZVal.arrayFromList("n", 5)),
                                        new ZPair(2, ZVal.arrayFromList("n", 5)),
                                        new ZPair(3, ZVal.arrayFromList("c", 12)))),
                        new ZPair(
                                "TN",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 2)),
                                        new ZPair(1, ZVal.arrayFromList("n", 3)),
                                        new ZPair(2, ZVal.arrayFromList("n", 13)),
                                        new ZPair(3, ZVal.arrayFromList("n", 2)))),
                        new ZPair(
                                "TR",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("n", 5)),
                                        new ZPair(1, ZVal.arrayFromList("n", 1)),
                                        new ZPair(2, ZVal.arrayFromList("c", 16)))),
                        new ZPair(
                                "VG",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.arrayFromList("a", 4)),
                                        new ZPair(1, ZVal.arrayFromList("n", 16)))));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\Payment")
                    .setLookup(
                            Payment.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "cardParams", "cardVendors", "expirationDateFormat", "ibanFormats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/Payment.php")
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

    private enum SwitchEnumType10 {
        STRING_c,
        STRING_a,
        STRING_n,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
