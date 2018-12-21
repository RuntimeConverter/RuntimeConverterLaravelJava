package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes.Base;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/Internet.php

*/

public class Internet extends Base {

    public Internet(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Internet.class) {
            this.__construct(env, args);
        }
    }

    public Internet(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object email(RuntimeEnv env, Object... args) {
        Object format = null;
        format =
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Internet.class)
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
                                                                .Internet
                                                                .RequestStaticProperties
                                                                .class,
                                                        "emailFormats")))
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
                                                        .Internet
                                                        .RequestStaticProperties
                                                        .class)
                                        .emailFormats)
                        .value();
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        Internet.class,
                        format));
    }

    @ConvertedMethod
    public final Object safeEmail(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_preg_replace
                        .f
                        .env(env)
                        .call(
                                "/\\s/u",
                                "",
                                toStringR(this.userName(env), env)
                                        + "@"
                                        + toStringR(
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Internet.class)
                                                        .method("safeEmailDomain")
                                                        .call()
                                                        .value(),
                                                env))
                        .value());
    }

    @ConvertedMethod
    public Object freeEmail(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_preg_replace
                        .f
                        .env(env)
                        .call(
                                "/\\s/u",
                                "",
                                toStringR(this.userName(env), env)
                                        + "@"
                                        + toStringR(
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Internet.class)
                                                        .method("freeEmailDomain")
                                                        .call()
                                                        .value(),
                                                env))
                        .value());
    }

    @ConvertedMethod
    public Object companyEmail(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_preg_replace
                        .f
                        .env(env)
                        .call(
                                "/\\s/u",
                                "",
                                toStringR(this.userName(env), env)
                                        + "@"
                                        + toStringR(this.domainName(env), env))
                        .value());
    }

    @ConvertedMethod
    public Object userName(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object format = null;
        ReferenceContainer username = new BasicReferenceContainer(null);
        format =
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Internet.class)
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
                                                                .Internet
                                                                .RequestStaticProperties
                                                                .class,
                                                        "userNameFormats")))
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
                                                        .Internet
                                                        .RequestStaticProperties
                                                        .class)
                                        .userNameFormats)
                        .value();
        username.setObject(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Internet.class)
                        .method("bothify")
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
                                                                        Internet.class,
                                                                        format))))
                        .call(rLastRefArgs.get(0))
                        .value());
        username.setObject(
                NamespaceGlobal.strtolower
                        .env(env)
                        .call(
                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, Internet.class)
                                        .method("transliterate")
                                        .addReferenceArgs(
                                                new RuntimeArgsWithReferences().add(0, username))
                                        .call(username.getObject())
                                        .value())
                        .value());
        if (ZVal.strictEqualityCheck(
                function_trim.f.env(env).call(username.getObject(), "._").value(), "===", "")) {
            throw ZVal.getException(
                    env,
                    new PHPException(
                            env,
                            "userName failed with the selected locale. Try a different locale or activate the \"intl\" PHP extension."));
        }

        username.setObject(
                function_str_replace.f.env(env).call("..", ".", username.getObject()).value());
        username.setObject(function_rtrim.f.env(env).call(username.getObject(), ".").value());
        return ZVal.assign(username.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "minLength",
        defaultValue = "6",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 1,
        name = "maxLength",
        defaultValue = "20",
        defaultValueType = "number"
    )
    public Object password(RuntimeEnv env, Object... args) {
        Object minLength = assignParameter(args, 0, true);
        if (null == minLength) {
            minLength = 6;
        }
        Object maxLength = assignParameter(args, 1, true);
        if (null == maxLength) {
            maxLength = 20;
        }
        Object pattern = null;
        pattern =
                function_str_repeat
                        .f
                        .env(env)
                        .call(
                                "*",
                                env.callMethod(
                                        this,
                                        "numberBetween",
                                        Internet.class,
                                        minLength,
                                        maxLength))
                        .value();
        return ZVal.assign(env.callMethod(this, "asciify", Internet.class, pattern));
    }

    @ConvertedMethod
    public Object domainName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(this.domainWord(env), env) + "." + toStringR(this.tld(env), env));
    }

    @ConvertedMethod
    public Object domainWord(RuntimeEnv env, Object... args) {
        ReferenceContainer lastName = new BasicReferenceContainer(null);
        lastName.setObject(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "format",
                        Internet.class,
                        "lastName"));
        lastName.setObject(
                NamespaceGlobal.strtolower
                        .env(env)
                        .call(
                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, Internet.class)
                                        .method("transliterate")
                                        .addReferenceArgs(
                                                new RuntimeArgsWithReferences().add(0, lastName))
                                        .call(lastName.getObject())
                                        .value())
                        .value());
        if (ZVal.strictEqualityCheck(
                function_trim.f.env(env).call(lastName.getObject(), "._").value(), "===", "")) {
            throw ZVal.getException(
                    env,
                    new PHPException(
                            env,
                            "domainWord failed with the selected locale. Try a different locale or activate the \"intl\" PHP extension."));
        }

        lastName.setObject(function_rtrim.f.env(env).call(lastName.getObject(), ".").value());
        return ZVal.assign(lastName.getObject());
    }

    @ConvertedMethod
    public Object tld(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Internet.class)
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
                                                                .Internet
                                                                .RequestStaticProperties
                                                                .class,
                                                        "tld")))
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
                                                        .Internet
                                                        .RequestStaticProperties
                                                        .class)
                                        .tld)
                        .value());
    }

    @ConvertedMethod
    public Object url(RuntimeEnv env, Object... args) {
        Object format = null;
        format =
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Internet.class)
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
                                                                .Internet
                                                                .RequestStaticProperties
                                                                .class,
                                                        "urlFormats")))
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
                                                        .Internet
                                                        .RequestStaticProperties
                                                        .class)
                                        .urlFormats)
                        .value();
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        Internet.class,
                        format));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "nbWords",
        defaultValue = "6",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 1,
        name = "variableNbWords",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object slug(RuntimeEnv env, Object... args) {
        Object nbWords = assignParameter(args, 0, true);
        if (null == nbWords) {
            nbWords = 6;
        }
        Object variableNbWords = assignParameter(args, 1, true);
        if (null == variableNbWords) {
            variableNbWords = true;
        }
        Object words = null;
        if (ZVal.isLessThanOrEqualTo(nbWords, "<=", 0)) {
            return "";
        }

        if (ZVal.isTrue(variableNbWords)) {
            nbWords =
                    ZVal.add(
                            ZVal.toLong(
                                    ZVal.divide(
                                            ZVal.multiply(
                                                    nbWords,
                                                    NamespaceGlobal.mt_rand
                                                            .env(env)
                                                            .call(60, 140)
                                                            .value()),
                                            100)),
                            1);
        }

        words =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "words",
                        Internet.class,
                        nbWords);
        return ZVal.assign(NamespaceGlobal.join.env(env).call(words, "-").value());
    }

    @ConvertedMethod
    public Object ipv4(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                NamespaceGlobal.long2ip
                        .env(env)
                        .call(
                                ZVal.equalityCheck(
                                                NamespaceGlobal.mt_rand.env(env).call(0, 1).value(),
                                                0)
                                        ? NamespaceGlobal.mt_rand
                                                .env(env)
                                                .call(-2147483648L, -2)
                                                .value()
                                        : NamespaceGlobal.mt_rand
                                                .env(env)
                                                .call(16777216, 2147483647L)
                                                .value())
                        .value());
    }

    @ConvertedMethod
    public Object ipv6(RuntimeEnv env, Object... args) {
        ReferenceContainer res = new BasicReferenceContainer(null);
        ReferenceContainer i = new BasicReferenceContainer(null);
        res.setObject(ZVal.newArray());
        for (i.setObject(0);
                ZVal.isLessThan(i.getObject(), '<', 8);
                i.setObject(ZVal.increment(i.getObject()))) {
            res.arrayAppend(env)
                    .set(
                            NamespaceGlobal.dechex
                                    .env(env)
                                    .call(NamespaceGlobal.mt_rand.env(env).call(0, "65535").value())
                                    .value());
        }

        return ZVal.assign(NamespaceGlobal.join.env(env).call(":", res.getObject()).value());
    }

    public static final Object CONST_class = "Faker\\Provider\\Internet";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Base.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object freeEmailDomain(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Internet.class)
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
                                                            .Internet
                                                            .RequestStaticProperties
                                                            .class)
                                            .freeEmailDomain)
                            .value());
        }

        @ConvertedMethod
        public final Object safeEmailDomain(RuntimeEnv env, Object... args) {
            Object domains = null;
            domains = ZVal.arrayFromList("example.com", "example.org", "example.net");
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Internet.class)
                            .method("randomElement")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(domains)
                            .value());
        }

        @ConvertedMethod
        public Object localIpv4(RuntimeEnv env, Object... args) {
            if (ZVal.strictEqualityCheck(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Internet.class)
                            .method("numberBetween")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(0, 1)
                            .value(),
                    "===",
                    0)) {
                return ZVal.assign(
                        NamespaceGlobal.long2ip
                                .env(env)
                                .call(
                                        StaticMethodUtils.accessUnknownLateStaticMethod(
                                                        env, this, Internet.class)
                                                .method("numberBetween")
                                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                                .call(
                                                        NamespaceGlobal.ip2long
                                                                .env(env)
                                                                .call("10.0.0.0")
                                                                .value(),
                                                        NamespaceGlobal.ip2long
                                                                .env(env)
                                                                .call("10.255.255.255")
                                                                .value())
                                                .value())
                                .value());
            }

            return ZVal.assign(
                    NamespaceGlobal.long2ip
                            .env(env)
                            .call(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Internet.class)
                                            .method("numberBetween")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(
                                                    NamespaceGlobal.ip2long
                                                            .env(env)
                                                            .call("192.168.0.0")
                                                            .value(),
                                                    NamespaceGlobal.ip2long
                                                            .env(env)
                                                            .call("192.168.255.255")
                                                            .value())
                                            .value())
                            .value());
        }

        @ConvertedMethod
        public Object macAddress(RuntimeEnv env, Object... args) {
            ReferenceContainer i = new BasicReferenceContainer(null);
            ReferenceContainer mac = new BasicReferenceContainer(null);
            for (i.setObject(0);
                    ZVal.isLessThan(i.getObject(), '<', 6);
                    i.setObject(ZVal.increment(i.getObject()))) {
                mac.arrayAppend(env)
                        .set(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "%02X",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Internet.class)
                                                        .method("numberBetween")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(0, 255)
                                                        .value())
                                        .value());
            }

            mac.setObject(NamespaceGlobal.implode.env(env).call(":", mac.getObject()).value());
            return ZVal.assign(mac.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "string")
        protected Object transliterate(RuntimeEnv env, Object... args) {
            Object string = assignParameter(args, 0, false);
            Object transString = null;
            Object transId = null;
            Object transliterator = null;
            if (ZVal.strictEqualityCheck(
                    0,
                    "===",
                    function_preg_match.f.env(env).call("/[^A-Za-z0-9_.]/", string).value())) {
                return ZVal.assign(string);
            }

            transId = "Any-Latin; Latin-ASCII; NFD; [:Nonspacing Mark:] Remove; NFC;";
            if (ZVal.toBool(function_class_exists.f.env(env).call("Transliterator").value())
                    && ZVal.toBool(
                            transliterator =
                                    StaticMethodUtils.getStaticBaseClass(
                                                    ZVal.resolveClassAlias(env, "Transliterator"),
                                                    env)
                                            .callUnknownStaticMethod(
                                                    env,
                                                    "create",
                                                    new RuntimeArgsWithReferences(),
                                                    transId))) {
                transString =
                        env.callMethod(transliterator, "transliterate", Internet.class, string);

            } else {
                transString =
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Internet.class)
                                .method("toAscii")
                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                .call(string)
                                .value();
            }

            return ZVal.assign(
                    function_preg_replace
                            .f
                            .env(env)
                            .call("/[^A-Za-z0-9_.]/u", "", transString)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "string")
        protected Object toAscii(RuntimeEnv env, Object... args) {
            Object string = assignParameter(args, 0, false);
            ReferenceContainer arrayFrom = new BasicReferenceContainer(null);
            Object transliterationTable = null;
            ReferenceContainer arrayTo = new BasicReferenceContainer(null);
            arrayFrom = env.getInlineStatic(4, null);
            arrayTo = env.getInlineStatic(5, null);
            if (ZVal.isEmpty(arrayFrom.getObject())) {
                transliterationTable =
                        ZVal.mergeArrayFromLambdaExpression(
                                624, /* Due to excessive array size and Java limitations, array initialization has been split into multiple lambdas. */
                                (array) -> {
                                    array.addWithZPairNoCopy(new ZPair("\u0132", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u00D6", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u0152", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u00DC", "U"));
                                    array.addWithZPairNoCopy(new ZPair("\u00E4", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u00E6", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u0133", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u00F6", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u0153", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u00FC", "u"));
                                    array.addWithZPairNoCopy(new ZPair("\u00DF", "s"));
                                    array.addWithZPairNoCopy(new ZPair("\u017F", "s"));
                                    array.addWithZPairNoCopy(new ZPair("\u00C0", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u00C1", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u00C2", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u00C3", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u00C4", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u00C5", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u00C6", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u0100", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u0104", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u0102", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u00C7", "C"));
                                    array.addWithZPairNoCopy(new ZPair("\u0106", "C"));
                                    array.addWithZPairNoCopy(new ZPair("\u010C", "C"));
                                    array.addWithZPairNoCopy(new ZPair("\u0108", "C"));
                                    array.addWithZPairNoCopy(new ZPair("\u010A", "C"));
                                    array.addWithZPairNoCopy(new ZPair("\u010E", "D"));
                                    array.addWithZPairNoCopy(new ZPair("\u0110", "D"));
                                    array.addWithZPairNoCopy(new ZPair("\u00C8", "E"));
                                    array.addWithZPairNoCopy(new ZPair("\u00C9", "E"));
                                    array.addWithZPairNoCopy(new ZPair("\u00CA", "E"));
                                    array.addWithZPairNoCopy(new ZPair("\u00CB", "E"));
                                    array.addWithZPairNoCopy(new ZPair("\u0112", "E"));
                                    array.addWithZPairNoCopy(new ZPair("\u0118", "E"));
                                    array.addWithZPairNoCopy(new ZPair("\u011A", "E"));
                                    array.addWithZPairNoCopy(new ZPair("\u0114", "E"));
                                    array.addWithZPairNoCopy(new ZPair("\u0116", "E"));
                                    array.addWithZPairNoCopy(new ZPair("\u011C", "G"));
                                    array.addWithZPairNoCopy(new ZPair("\u011E", "G"));
                                    array.addWithZPairNoCopy(new ZPair("\u0120", "G"));
                                    array.addWithZPairNoCopy(new ZPair("\u0122", "G"));
                                    array.addWithZPairNoCopy(new ZPair("\u0124", "H"));
                                    array.addWithZPairNoCopy(new ZPair("\u0126", "H"));
                                    array.addWithZPairNoCopy(new ZPair("\u00CC", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u00CD", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u00CE", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u00CF", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u012A", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u0128", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u012C", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u012E", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u0130", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u0134", "J"));
                                    array.addWithZPairNoCopy(new ZPair("\u0136", "K"));
                                    array.addWithZPairNoCopy(new ZPair("\u013D", "K"));
                                    array.addWithZPairNoCopy(new ZPair("\u0139", "K"));
                                    array.addWithZPairNoCopy(new ZPair("\u013B", "K"));
                                    array.addWithZPairNoCopy(new ZPair("\u013F", "K"));
                                    array.addWithZPairNoCopy(new ZPair("\u0141", "L"));
                                    array.addWithZPairNoCopy(new ZPair("\u00D1", "N"));
                                    array.addWithZPairNoCopy(new ZPair("\u0143", "N"));
                                    array.addWithZPairNoCopy(new ZPair("\u0147", "N"));
                                    array.addWithZPairNoCopy(new ZPair("\u0145", "N"));
                                    array.addWithZPairNoCopy(new ZPair("\u014A", "N"));
                                    array.addWithZPairNoCopy(new ZPair("\u00D2", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u00D3", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u00D4", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u00D5", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u00D8", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u014C", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u0150", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u014E", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u0154", "R"));
                                    array.addWithZPairNoCopy(new ZPair("\u0158", "R"));
                                    array.addWithZPairNoCopy(new ZPair("\u0156", "R"));
                                    array.addWithZPairNoCopy(new ZPair("\u015A", "S"));
                                    array.addWithZPairNoCopy(new ZPair("\u015E", "S"));
                                    array.addWithZPairNoCopy(new ZPair("\u015C", "S"));
                                    array.addWithZPairNoCopy(new ZPair("\u0218", "S"));
                                    array.addWithZPairNoCopy(new ZPair("\u0160", "S"));
                                    array.addWithZPairNoCopy(new ZPair("\u0164", "T"));
                                    array.addWithZPairNoCopy(new ZPair("\u0162", "T"));
                                    array.addWithZPairNoCopy(new ZPair("\u0166", "T"));
                                    array.addWithZPairNoCopy(new ZPair("\u021A", "T"));
                                    array.addWithZPairNoCopy(new ZPair("\u00D9", "U"));
                                    array.addWithZPairNoCopy(new ZPair("\u00DA", "U"));
                                    array.addWithZPairNoCopy(new ZPair("\u00DB", "U"));
                                    array.addWithZPairNoCopy(new ZPair("\u016A", "U"));
                                    array.addWithZPairNoCopy(new ZPair("\u016E", "U"));
                                    array.addWithZPairNoCopy(new ZPair("\u0170", "U"));
                                    array.addWithZPairNoCopy(new ZPair("\u016C", "U"));
                                    array.addWithZPairNoCopy(new ZPair("\u0168", "U"));
                                    array.addWithZPairNoCopy(new ZPair("\u0172", "U"));
                                    array.addWithZPairNoCopy(new ZPair("\u0174", "W"));
                                    array.addWithZPairNoCopy(new ZPair("\u0176", "Y"));
                                    array.addWithZPairNoCopy(new ZPair("\u0178", "Y"));
                                    array.addWithZPairNoCopy(new ZPair("\u00DD", "Y"));
                                    array.addWithZPairNoCopy(new ZPair("\u0179", "Z"));
                                    array.addWithZPairNoCopy(new ZPair("\u017B", "Z"));
                                    array.addWithZPairNoCopy(new ZPair("\u017D", "Z"));
                                    array.addWithZPairNoCopy(new ZPair("\u00E0", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u00E1", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u00E2", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u00E3", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u0101", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u0105", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u0103", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u00E5", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u00E7", "c"));
                                    array.addWithZPairNoCopy(new ZPair("\u0107", "c"));
                                    array.addWithZPairNoCopy(new ZPair("\u010D", "c"));
                                    array.addWithZPairNoCopy(new ZPair("\u0109", "c"));
                                    array.addWithZPairNoCopy(new ZPair("\u010B", "c"));
                                    array.addWithZPairNoCopy(new ZPair("\u010F", "d"));
                                    array.addWithZPairNoCopy(new ZPair("\u0111", "d"));
                                    array.addWithZPairNoCopy(new ZPair("\u00E8", "e"));
                                    array.addWithZPairNoCopy(new ZPair("\u00E9", "e"));
                                    array.addWithZPairNoCopy(new ZPair("\u00EA", "e"));
                                    array.addWithZPairNoCopy(new ZPair("\u00EB", "e"));
                                    array.addWithZPairNoCopy(new ZPair("\u0113", "e"));
                                    array.addWithZPairNoCopy(new ZPair("\u0119", "e"));
                                    array.addWithZPairNoCopy(new ZPair("\u011B", "e"));
                                    array.addWithZPairNoCopy(new ZPair("\u0115", "e"));
                                    array.addWithZPairNoCopy(new ZPair("\u0117", "e"));
                                    array.addWithZPairNoCopy(new ZPair("\u0192", "f"));
                                    array.addWithZPairNoCopy(new ZPair("\u011D", "g"));
                                    array.addWithZPairNoCopy(new ZPair("\u011F", "g"));
                                    array.addWithZPairNoCopy(new ZPair("\u0121", "g"));
                                    array.addWithZPairNoCopy(new ZPair("\u0123", "g"));
                                    array.addWithZPairNoCopy(new ZPair("\u0125", "h"));
                                    array.addWithZPairNoCopy(new ZPair("\u0127", "h"));
                                    array.addWithZPairNoCopy(new ZPair("\u00EC", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u00ED", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u00EE", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u00EF", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u012B", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u0129", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u012D", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u012F", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u0131", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u0135", "j"));
                                    array.addWithZPairNoCopy(new ZPair("\u0137", "k"));
                                    array.addWithZPairNoCopy(new ZPair("\u0138", "k"));
                                    array.addWithZPairNoCopy(new ZPair("\u0142", "l"));
                                    array.addWithZPairNoCopy(new ZPair("\u013E", "l"));
                                    array.addWithZPairNoCopy(new ZPair("\u013A", "l"));
                                    array.addWithZPairNoCopy(new ZPair("\u013C", "l"));
                                    array.addWithZPairNoCopy(new ZPair("\u0140", "l"));
                                    array.addWithZPairNoCopy(new ZPair("\u00F1", "n"));
                                    array.addWithZPairNoCopy(new ZPair("\u0144", "n"));
                                    array.addWithZPairNoCopy(new ZPair("\u0148", "n"));
                                    array.addWithZPairNoCopy(new ZPair("\u0146", "n"));
                                    array.addWithZPairNoCopy(new ZPair("\u0149", "n"));
                                    array.addWithZPairNoCopy(new ZPair("\u014B", "n"));
                                    array.addWithZPairNoCopy(new ZPair("\u00F2", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u00F3", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u00F4", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u00F5", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u00F8", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u014D", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u0151", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u014F", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u0155", "r"));
                                    array.addWithZPairNoCopy(new ZPair("\u0159", "r"));
                                    array.addWithZPairNoCopy(new ZPair("\u0157", "r"));
                                    array.addWithZPairNoCopy(new ZPair("\u015B", "s"));
                                    array.addWithZPairNoCopy(new ZPair("\u0161", "s"));
                                    array.addWithZPairNoCopy(new ZPair("\u0165", "t"));
                                    array.addWithZPairNoCopy(new ZPair("\u00F9", "u"));
                                    array.addWithZPairNoCopy(new ZPair("\u00FA", "u"));
                                    array.addWithZPairNoCopy(new ZPair("\u00FB", "u"));
                                    array.addWithZPairNoCopy(new ZPair("\u016B", "u"));
                                    array.addWithZPairNoCopy(new ZPair("\u016F", "u"));
                                    array.addWithZPairNoCopy(new ZPair("\u0171", "u"));
                                    array.addWithZPairNoCopy(new ZPair("\u016D", "u"));
                                    array.addWithZPairNoCopy(new ZPair("\u0169", "u"));
                                    array.addWithZPairNoCopy(new ZPair("\u0173", "u"));
                                    array.addWithZPairNoCopy(new ZPair("\u0175", "w"));
                                    array.addWithZPairNoCopy(new ZPair("\u00FF", "y"));
                                    array.addWithZPairNoCopy(new ZPair("\u00FD", "y"));
                                    array.addWithZPairNoCopy(new ZPair("\u0177", "y"));
                                    array.addWithZPairNoCopy(new ZPair("\u017C", "z"));
                                    array.addWithZPairNoCopy(new ZPair("\u017A", "z"));
                                    array.addWithZPairNoCopy(new ZPair("\u017E", "z"));
                                    array.addWithZPairNoCopy(new ZPair("\u0391", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u0386", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F08", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F09", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F0A", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F0B", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F0C", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F0D", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F0E", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F0F", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F88", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F89", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F8A", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F8B", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F8C", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F8D", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F8E", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F8F", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FB8", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FB9", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FBA", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FBC", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u0392", "B"));
                                    array.addWithZPairNoCopy(new ZPair("\u0393", "G"));
                                    array.addWithZPairNoCopy(new ZPair("\u0394", "D"));
                                    array.addWithZPairNoCopy(new ZPair("\u0395", "E"));
                                    array.addWithZPairNoCopy(new ZPair("\u0388", "E"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F18", "E"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F19", "E"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F1A", "E"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F1B", "E"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F1C", "E"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F1D", "E"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FC8", "E"));
                                    array.addWithZPairNoCopy(new ZPair("\u0396", "Z"));
                                    array.addWithZPairNoCopy(new ZPair("\u0397", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u0389", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F28", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F29", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F2A", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F2B", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F2C", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F2D", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F2E", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F2F", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F98", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F99", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F9A", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F9B", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F9C", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F9D", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F9E", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F9F", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FCA", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FCC", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u0398", "T"));
                                    array.addWithZPairNoCopy(new ZPair("\u0399", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u038A", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u03AA", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F38", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F39", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F3A", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F3B", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F3C", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F3D", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F3E", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F3F", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FD8", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FD9", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FDA", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u039A", "K"));
                                    array.addWithZPairNoCopy(new ZPair("\u039B", "L"));
                                    array.addWithZPairNoCopy(new ZPair("\u039C", "M"));
                                    array.addWithZPairNoCopy(new ZPair("\u039D", "N"));
                                    array.addWithZPairNoCopy(new ZPair("\u039E", "K"));
                                    array.addWithZPairNoCopy(new ZPair("\u039F", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u038C", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F48", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F49", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F4A", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F4B", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F4C", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F4D", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FF8", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u03A0", "P"));
                                    array.addWithZPairNoCopy(new ZPair("\u03A1", "R"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FEC", "R"));
                                    array.addWithZPairNoCopy(new ZPair("\u03A3", "S"));
                                    array.addWithZPairNoCopy(new ZPair("\u03A4", "T"));
                                    array.addWithZPairNoCopy(new ZPair("\u03A5", "Y"));
                                    array.addWithZPairNoCopy(new ZPair("\u038E", "Y"));
                                    array.addWithZPairNoCopy(new ZPair("\u03AB", "Y"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F59", "Y"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F5B", "Y"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F5D", "Y"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F5F", "Y"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FE8", "Y"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FE9", "Y"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FEA", "Y"));
                                    array.addWithZPairNoCopy(new ZPair("\u03A6", "F"));
                                    array.addWithZPairNoCopy(new ZPair("\u03A7", "X"));
                                    array.addWithZPairNoCopy(new ZPair("\u03A8", "P"));
                                    array.addWithZPairNoCopy(new ZPair("\u03A9", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u038F", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F68", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F69", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F6A", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F6B", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F6C", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F6D", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F6E", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F6F", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FA8", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FA9", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FAA", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FAB", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FAC", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FAD", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FAE", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FAF", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FFA", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FFC", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u03B1", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u03AC", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F00", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F01", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F02", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F03", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F04", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F05", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F06", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F07", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F80", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F81", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F82", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F83", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F84", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F85", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F86", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F87", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F70", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FB0", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FB1", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FB2", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FB3", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FB4", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FB6", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FB7", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u03B2", "b"));
                                    array.addWithZPairNoCopy(new ZPair("\u03B3", "g"));
                                    array.addWithZPairNoCopy(new ZPair("\u03B4", "d"));
                                    array.addWithZPairNoCopy(new ZPair("\u03B5", "e"));
                                    array.addWithZPairNoCopy(new ZPair("\u03AD", "e"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F10", "e"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F11", "e"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F12", "e"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F13", "e"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F14", "e"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F15", "e"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F72", "e"));
                                    array.addWithZPairNoCopy(new ZPair("\u03B6", "z"));
                                    array.addWithZPairNoCopy(new ZPair("\u03B7", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u03AE", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F20", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F21", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F22", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F23", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F24", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F25", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F26", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F27", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F90", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F91", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F92", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F93", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F94", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F95", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F96", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F97", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F74", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FC2", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FC3", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FC4", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FC6", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FC7", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u03B8", "t"));
                                    array.addWithZPairNoCopy(new ZPair("\u03B9", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u03AF", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u03CA", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u0390", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F30", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F31", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F32", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F33", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F34", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F35", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F36", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F37", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F76", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FD0", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FD1", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FD2", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FD6", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FD7", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u03BA", "k"));
                                    array.addWithZPairNoCopy(new ZPair("\u03BB", "l"));
                                    array.addWithZPairNoCopy(new ZPair("\u03BC", "m"));
                                    array.addWithZPairNoCopy(new ZPair("\u03BD", "n"));
                                    array.addWithZPairNoCopy(new ZPair("\u03BE", "k"));
                                    array.addWithZPairNoCopy(new ZPair("\u03BF", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u03CC", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F40", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F41", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F42", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F43", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F44", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F45", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F78", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u03C0", "p"));
                                    array.addWithZPairNoCopy(new ZPair("\u03C1", "r"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FE4", "r"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FE5", "r"));
                                    array.addWithZPairNoCopy(new ZPair("\u03C3", "s"));
                                    array.addWithZPairNoCopy(new ZPair("\u03C2", "s"));
                                    array.addWithZPairNoCopy(new ZPair("\u03C4", "t"));
                                    array.addWithZPairNoCopy(new ZPair("\u03C5", "y"));
                                    array.addWithZPairNoCopy(new ZPair("\u03CD", "y"));
                                    array.addWithZPairNoCopy(new ZPair("\u03CB", "y"));
                                    array.addWithZPairNoCopy(new ZPair("\u03B0", "y"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F50", "y"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F51", "y"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F52", "y"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F53", "y"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F54", "y"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F55", "y"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F56", "y"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F57", "y"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F7A", "y"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FE0", "y"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FE1", "y"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FE2", "y"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FE6", "y"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FE7", "y"));
                                    array.addWithZPairNoCopy(new ZPair("\u03C6", "f"));
                                    array.addWithZPairNoCopy(new ZPair("\u03C7", "x"));
                                    array.addWithZPairNoCopy(new ZPair("\u03C8", "p"));
                                    array.addWithZPairNoCopy(new ZPair("\u03C9", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u03CE", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F60", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F61", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F62", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F63", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F64", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F65", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F66", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F67", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FA0", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FA1", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FA2", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FA3", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FA4", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FA5", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FA6", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FA7", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u1F7C", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FF2", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FF3", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FF4", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FF6", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u1FF7", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u0410", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u0411", "B"));
                                    array.addWithZPairNoCopy(new ZPair("\u0412", "V"));
                                    array.addWithZPairNoCopy(new ZPair("\u0413", "G"));
                                    array.addWithZPairNoCopy(new ZPair("\u0414", "D"));
                                    array.addWithZPairNoCopy(new ZPair("\u0415", "E"));
                                    array.addWithZPairNoCopy(new ZPair("\u0401", "E"));
                                    array.addWithZPairNoCopy(new ZPair("\u0416", "Z"));
                                    array.addWithZPairNoCopy(new ZPair("\u0417", "Z"));
                                    array.addWithZPairNoCopy(new ZPair("\u0418", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u0419", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u041A", "K"));
                                    array.addWithZPairNoCopy(new ZPair("\u041B", "L"));
                                    array.addWithZPairNoCopy(new ZPair("\u041C", "M"));
                                    array.addWithZPairNoCopy(new ZPair("\u041D", "N"));
                                    array.addWithZPairNoCopy(new ZPair("\u041E", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u041F", "P"));
                                    array.addWithZPairNoCopy(new ZPair("\u0420", "R"));
                                    array.addWithZPairNoCopy(new ZPair("\u0421", "S"));
                                    array.addWithZPairNoCopy(new ZPair("\u0422", "T"));
                                    array.addWithZPairNoCopy(new ZPair("\u0423", "U"));
                                    array.addWithZPairNoCopy(new ZPair("\u0424", "F"));
                                    array.addWithZPairNoCopy(new ZPair("\u0425", "K"));
                                    array.addWithZPairNoCopy(new ZPair("\u0426", "T"));
                                    array.addWithZPairNoCopy(new ZPair("\u0427", "C"));
                                    array.addWithZPairNoCopy(new ZPair("\u0428", "S"));
                                    array.addWithZPairNoCopy(new ZPair("\u0429", "S"));
                                    array.addWithZPairNoCopy(new ZPair("\u042B", "Y"));
                                    array.addWithZPairNoCopy(new ZPair("\u042D", "E"));
                                    array.addWithZPairNoCopy(new ZPair("\u042E", "Y"));
                                    array.addWithZPairNoCopy(new ZPair("\u042F", "Y"));
                                    array.addWithZPairNoCopy(new ZPair("\u0430", "A"));
                                    array.addWithZPairNoCopy(new ZPair("\u0431", "B"));
                                    array.addWithZPairNoCopy(new ZPair("\u0432", "V"));
                                    array.addWithZPairNoCopy(new ZPair("\u0433", "G"));
                                    array.addWithZPairNoCopy(new ZPair("\u0434", "D"));
                                    array.addWithZPairNoCopy(new ZPair("\u0435", "E"));
                                    array.addWithZPairNoCopy(new ZPair("\u0451", "E"));
                                    array.addWithZPairNoCopy(new ZPair("\u0436", "Z"));
                                    array.addWithZPairNoCopy(new ZPair("\u0437", "Z"));
                                    array.addWithZPairNoCopy(new ZPair("\u0438", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u0439", "I"));
                                    array.addWithZPairNoCopy(new ZPair("\u043A", "K"));
                                    array.addWithZPairNoCopy(new ZPair("\u043B", "L"));
                                    array.addWithZPairNoCopy(new ZPair("\u043C", "M"));
                                },
                                (array) -> {
                                    array.addWithZPairNoCopy(new ZPair("\u043D", "N"));
                                    array.addWithZPairNoCopy(new ZPair("\u043E", "O"));
                                    array.addWithZPairNoCopy(new ZPair("\u043F", "P"));
                                    array.addWithZPairNoCopy(new ZPair("\u0440", "R"));
                                    array.addWithZPairNoCopy(new ZPair("\u0441", "S"));
                                    array.addWithZPairNoCopy(new ZPair("\u0442", "T"));
                                    array.addWithZPairNoCopy(new ZPair("\u0443", "U"));
                                    array.addWithZPairNoCopy(new ZPair("\u0444", "F"));
                                    array.addWithZPairNoCopy(new ZPair("\u0445", "K"));
                                    array.addWithZPairNoCopy(new ZPair("\u0446", "T"));
                                    array.addWithZPairNoCopy(new ZPair("\u0447", "C"));
                                    array.addWithZPairNoCopy(new ZPair("\u0448", "S"));
                                    array.addWithZPairNoCopy(new ZPair("\u0449", "S"));
                                    array.addWithZPairNoCopy(new ZPair("\u044B", "Y"));
                                    array.addWithZPairNoCopy(new ZPair("\u044D", "E"));
                                    array.addWithZPairNoCopy(new ZPair("\u044E", "Y"));
                                    array.addWithZPairNoCopy(new ZPair("\u044F", "Y"));
                                    array.addWithZPairNoCopy(new ZPair("\u00F0", "d"));
                                    array.addWithZPairNoCopy(new ZPair("\u00D0", "D"));
                                    array.addWithZPairNoCopy(new ZPair("\u00FE", "t"));
                                    array.addWithZPairNoCopy(new ZPair("\u00DE", "T"));
                                    array.addWithZPairNoCopy(new ZPair("\u10D0", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u10D1", "b"));
                                    array.addWithZPairNoCopy(new ZPair("\u10D2", "g"));
                                    array.addWithZPairNoCopy(new ZPair("\u10D3", "d"));
                                    array.addWithZPairNoCopy(new ZPair("\u10D4", "e"));
                                    array.addWithZPairNoCopy(new ZPair("\u10D5", "v"));
                                    array.addWithZPairNoCopy(new ZPair("\u10D6", "z"));
                                    array.addWithZPairNoCopy(new ZPair("\u10D7", "t"));
                                    array.addWithZPairNoCopy(new ZPair("\u10D8", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u10D9", "k"));
                                    array.addWithZPairNoCopy(new ZPair("\u10DA", "l"));
                                    array.addWithZPairNoCopy(new ZPair("\u10DB", "m"));
                                    array.addWithZPairNoCopy(new ZPair("\u10DC", "n"));
                                    array.addWithZPairNoCopy(new ZPair("\u10DD", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u10DE", "p"));
                                    array.addWithZPairNoCopy(new ZPair("\u10DF", "z"));
                                    array.addWithZPairNoCopy(new ZPair("\u10E0", "r"));
                                    array.addWithZPairNoCopy(new ZPair("\u10E1", "s"));
                                    array.addWithZPairNoCopy(new ZPair("\u10E2", "t"));
                                    array.addWithZPairNoCopy(new ZPair("\u10E3", "u"));
                                    array.addWithZPairNoCopy(new ZPair("\u10E4", "p"));
                                    array.addWithZPairNoCopy(new ZPair("\u10E5", "k"));
                                    array.addWithZPairNoCopy(new ZPair("\u10E6", "g"));
                                    array.addWithZPairNoCopy(new ZPair("\u10E7", "q"));
                                    array.addWithZPairNoCopy(new ZPair("\u10E8", "s"));
                                    array.addWithZPairNoCopy(new ZPair("\u10E9", "c"));
                                    array.addWithZPairNoCopy(new ZPair("\u10EA", "t"));
                                    array.addWithZPairNoCopy(new ZPair("\u10EB", "d"));
                                    array.addWithZPairNoCopy(new ZPair("\u10EC", "t"));
                                    array.addWithZPairNoCopy(new ZPair("\u10ED", "c"));
                                    array.addWithZPairNoCopy(new ZPair("\u10EE", "k"));
                                    array.addWithZPairNoCopy(new ZPair("\u10EF", "j"));
                                    array.addWithZPairNoCopy(new ZPair("\u10F0", "h"));
                                    array.addWithZPairNoCopy(new ZPair("\u0163", "t"));
                                    array.addWithZPairNoCopy(new ZPair("\u02BC", "'"));
                                    array.addWithZPairNoCopy(new ZPair("\u0327", ""));
                                    array.addWithZPairNoCopy(new ZPair("\u1E29", "h"));
                                    array.addWithZPairNoCopy(new ZPair("\u2018", "'"));
                                    array.addWithZPairNoCopy(new ZPair("\u2019", "'"));
                                    array.addWithZPairNoCopy(new ZPair("\u1EEB", "u"));
                                    array.addWithZPairNoCopy(new ZPair("/", ""));
                                    array.addWithZPairNoCopy(new ZPair("\u1EBF", "e"));
                                    array.addWithZPairNoCopy(new ZPair("\u1EA3", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u1ECB", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1EAD", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u1EC7", "e"));
                                    array.addWithZPairNoCopy(new ZPair("\u1EC9", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u1ED3", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u1EC1", "e"));
                                    array.addWithZPairNoCopy(new ZPair("\u01A1", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u1EA1", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u1EB5", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u01B0", "u"));
                                    array.addWithZPairNoCopy(new ZPair("\u1EB1", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u1EA7", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u1E11", "d"));
                                    array.addWithZPairNoCopy(new ZPair("\u1E28", "H"));
                                    array.addWithZPairNoCopy(new ZPair("\u1E10", "D"));
                                    array.addWithZPairNoCopy(new ZPair("\u0219", "s"));
                                    array.addWithZPairNoCopy(new ZPair("\u021B", "t"));
                                    array.addWithZPairNoCopy(new ZPair("\u1ED9", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u1EAF", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u015F", "s"));
                                    array.addWithZPairNoCopy(new ZPair("'", ""));
                                    array.addWithZPairNoCopy(new ZPair("\u0578\u0582", "u"));
                                    array.addWithZPairNoCopy(new ZPair("\u0561", "a"));
                                    array.addWithZPairNoCopy(new ZPair("\u0562", "b"));
                                    array.addWithZPairNoCopy(new ZPair("\u0563", "g"));
                                    array.addWithZPairNoCopy(new ZPair("\u0564", "d"));
                                    array.addWithZPairNoCopy(new ZPair("\u0565", "e"));
                                    array.addWithZPairNoCopy(new ZPair("\u0566", "z"));
                                    array.addWithZPairNoCopy(new ZPair("\u0567", "e"));
                                    array.addWithZPairNoCopy(new ZPair("\u0568", "y"));
                                    array.addWithZPairNoCopy(new ZPair("\u0569", "t"));
                                    array.addWithZPairNoCopy(new ZPair("\u056A", "zh"));
                                    array.addWithZPairNoCopy(new ZPair("\u056B", "i"));
                                    array.addWithZPairNoCopy(new ZPair("\u056C", "l"));
                                    array.addWithZPairNoCopy(new ZPair("\u056D", "kh"));
                                    array.addWithZPairNoCopy(new ZPair("\u056E", "ts"));
                                    array.addWithZPairNoCopy(new ZPair("\u056F", "k"));
                                    array.addWithZPairNoCopy(new ZPair("\u0570", "h"));
                                    array.addWithZPairNoCopy(new ZPair("\u0571", "dz"));
                                    array.addWithZPairNoCopy(new ZPair("\u0572", "gh"));
                                    array.addWithZPairNoCopy(new ZPair("\u0573", "ch"));
                                    array.addWithZPairNoCopy(new ZPair("\u0574", "m"));
                                    array.addWithZPairNoCopy(new ZPair("\u0575", "y"));
                                    array.addWithZPairNoCopy(new ZPair("\u0576", "n"));
                                    array.addWithZPairNoCopy(new ZPair("\u0577", "sh"));
                                    array.addWithZPairNoCopy(new ZPair("\u0578", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u0579", "ch"));
                                    array.addWithZPairNoCopy(new ZPair("\u057A", "p"));
                                    array.addWithZPairNoCopy(new ZPair("\u057B", "j"));
                                    array.addWithZPairNoCopy(new ZPair("\u057C", "r"));
                                    array.addWithZPairNoCopy(new ZPair("\u057D", "s"));
                                    array.addWithZPairNoCopy(new ZPair("\u057E", "v"));
                                    array.addWithZPairNoCopy(new ZPair("\u057F", "t"));
                                    array.addWithZPairNoCopy(new ZPair("\u0580", "r"));
                                    array.addWithZPairNoCopy(new ZPair("\u0581", "ts"));
                                    array.addWithZPairNoCopy(new ZPair("\u0583", "p"));
                                    array.addWithZPairNoCopy(new ZPair("\u0584", "q"));
                                    array.addWithZPairNoCopy(new ZPair("\u0587", "ev"));
                                    array.addWithZPairNoCopy(new ZPair("\u0585", "o"));
                                    array.addWithZPairNoCopy(new ZPair("\u0586", "f"));
                                });
                arrayFrom.setObject(
                        function_array_keys.f.env(env).call(transliterationTable).value());
                arrayTo.setObject(
                        function_array_values.f.env(env).call(transliterationTable).value());
            }

            return ZVal.assign(
                    function_str_replace
                            .f
                            .env(env)
                            .call(arrayFrom.getObject(), arrayTo.getObject(), string)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object freeEmailDomain = ZVal.arrayFromList("gmail.com", "yahoo.com", "hotmail.com");

        public Object tld =
                ZVal.arrayFromList(
                        "com", "com", "com", "com", "com", "com", "biz", "info", "net", "org");

        public Object userNameFormats =
                ZVal.arrayFromList(
                        "{{lastName}}.{{firstName}}",
                        "{{firstName}}.{{lastName}}",
                        "{{firstName}}##",
                        "?{{lastName}}");

        public Object emailFormats =
                ZVal.arrayFromList(
                        "{{userName}}@{{domainName}}", "{{userName}}@{{freeEmailDomain}}");

        public Object urlFormats =
                ZVal.arrayFromList(
                        "http://www.{{domainName}}/",
                        "http://{{domainName}}/",
                        "http://www.{{domainName}}/{{slug}}",
                        "http://www.{{domainName}}/{{slug}}",
                        "https://www.{{domainName}}/{{slug}}",
                        "http://www.{{domainName}}/{{slug}}.html",
                        "http://{{domainName}}/{{slug}}",
                        "http://{{domainName}}/{{slug}}",
                        "http://{{domainName}}/{{slug}}.html",
                        "https://{{domainName}}/{{slug}}.html");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\Internet")
                    .setLookup(
                            Internet.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "emailFormats",
                            "freeEmailDomain",
                            "tld",
                            "urlFormats",
                            "userNameFormats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/Internet.php")
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
