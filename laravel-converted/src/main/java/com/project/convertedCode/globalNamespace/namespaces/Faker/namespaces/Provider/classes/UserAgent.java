package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes.Base;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.date.function_date;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/UserAgent.php

*/

public class UserAgent extends Base {

    public UserAgent(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == UserAgent.class) {
            this.__construct(env, args);
        }
    }

    public UserAgent(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Faker\\Provider\\UserAgent";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Base.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object macProcessor(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, UserAgent.class)
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
                                                            .UserAgent
                                                            .RequestStaticProperties
                                                            .class)
                                            .macProcessor)
                            .value());
        }

        @ConvertedMethod
        public Object linuxProcessor(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, UserAgent.class)
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
                                                            .UserAgent
                                                            .RequestStaticProperties
                                                            .class)
                                            .linuxProcessor)
                            .value());
        }

        @ConvertedMethod
        public Object userAgent(RuntimeEnv env, Object... args) {
            Object userAgentName = null;
            userAgentName =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, UserAgent.class)
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
                                                            .UserAgent
                                                            .RequestStaticProperties
                                                            .class)
                                            .userAgents)
                            .value();
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, UserAgent.class)
                            .method(userAgentName)
                            .call()
                            .value());
        }

        @ConvertedMethod
        public Object chrome(RuntimeEnv env, Object... args) {
            Object saf = null;
            Object platforms = null;
            saf =
                    toStringR(NamespaceGlobal.mt_rand.env(env).call(531, 536).value(), env)
                            + toStringR(NamespaceGlobal.mt_rand.env(env).call(0, 2).value(), env);
            platforms =
                    ZVal.newArray(
                            new ZPair(
                                    0,
                                    "("
                                            + toStringR(
                                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                    env, this, UserAgent.class)
                                                            .method("linuxPlatformToken")
                                                            .call()
                                                            .value(),
                                                    env)
                                            + toStringR(
                                                    ") AppleWebKit/"
                                                            + toStringR(saf, env)
                                                            + " (KHTML, like Gecko) Chrome/",
                                                    env)
                                            + toStringR(
                                                    NamespaceGlobal.mt_rand
                                                            .env(env)
                                                            .call(36, 40)
                                                            .value(),
                                                    env)
                                            + ".0."
                                            + toStringR(
                                                    NamespaceGlobal.mt_rand
                                                            .env(env)
                                                            .call(800, 899)
                                                            .value(),
                                                    env)
                                            + toStringR(
                                                    ".0 Mobile Safari/" + toStringR(saf, env),
                                                    env)),
                            new ZPair(
                                    1,
                                    "("
                                            + toStringR(
                                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                    env, this, UserAgent.class)
                                                            .method("windowsPlatformToken")
                                                            .call()
                                                            .value(),
                                                    env)
                                            + toStringR(
                                                    ") AppleWebKit/"
                                                            + toStringR(saf, env)
                                                            + " (KHTML, like Gecko) Chrome/",
                                                    env)
                                            + toStringR(
                                                    NamespaceGlobal.mt_rand
                                                            .env(env)
                                                            .call(36, 40)
                                                            .value(),
                                                    env)
                                            + ".0."
                                            + toStringR(
                                                    NamespaceGlobal.mt_rand
                                                            .env(env)
                                                            .call(800, 899)
                                                            .value(),
                                                    env)
                                            + toStringR(
                                                    ".0 Mobile Safari/" + toStringR(saf, env),
                                                    env)),
                            new ZPair(
                                    2,
                                    "("
                                            + toStringR(
                                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                    env, this, UserAgent.class)
                                                            .method("macPlatformToken")
                                                            .call()
                                                            .value(),
                                                    env)
                                            + toStringR(
                                                    ") AppleWebKit/"
                                                            + toStringR(saf, env)
                                                            + " (KHTML, like Gecko) Chrome/",
                                                    env)
                                            + toStringR(
                                                    NamespaceGlobal.mt_rand
                                                            .env(env)
                                                            .call(36, 40)
                                                            .value(),
                                                    env)
                                            + ".0."
                                            + toStringR(
                                                    NamespaceGlobal.mt_rand
                                                            .env(env)
                                                            .call(800, 899)
                                                            .value(),
                                                    env)
                                            + toStringR(
                                                    ".0 Mobile Safari/" + toStringR(saf, env),
                                                    env)));
            return ZVal.assign(
                    "Mozilla/5.0 "
                            + toStringR(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, UserAgent.class)
                                            .method("randomElement")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(platforms)
                                            .value(),
                                    env));
        }

        @ConvertedMethod
        public Object firefox(RuntimeEnv env, Object... args) {
            Object ver = null;
            Object platforms = null;
            ver =
                    "Gecko/"
                            + toStringR(
                                    function_date
                                            .f
                                            .env(env)
                                            .call(
                                                    "Ymd",
                                                    NamespaceGlobal.mt_rand
                                                            .env(env)
                                                            .call(
                                                                    NamespaceGlobal.strtotime
                                                                            .env(env)
                                                                            .call("2010-1-1")
                                                                            .value(),
                                                                    NamespaceGlobal.time
                                                                            .env(env)
                                                                            .call()
                                                                            .value())
                                                            .value())
                                            .value(),
                                    env)
                            + " Firefox/"
                            + toStringR(NamespaceGlobal.mt_rand.env(env).call(35, 37).value(), env)
                            + ".0";
            platforms =
                    ZVal.newArray(
                            new ZPair(
                                    0,
                                    "("
                                            + toStringR(
                                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                    env, this, UserAgent.class)
                                                            .method("windowsPlatformToken")
                                                            .call()
                                                            .value(),
                                                    env)
                                            + "; "
                                            + toStringR(
                                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                    env, this, UserAgent.class)
                                                            .method("randomElement")
                                                            .addReferenceArgs(
                                                                    new RuntimeArgsWithReferences())
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
                                                                                            .UserAgent
                                                                                            .RequestStaticProperties
                                                                                            .class)
                                                                            .lang)
                                                            .value(),
                                                    env)
                                            + "; rv:1.9."
                                            + toStringR(
                                                    NamespaceGlobal.mt_rand
                                                            .env(env)
                                                            .call(0, 2)
                                                            .value(),
                                                    env)
                                            + ".20) "
                                            + toStringR(ver, env)),
                            new ZPair(
                                    1,
                                    "("
                                            + toStringR(
                                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                    env, this, UserAgent.class)
                                                            .method("linuxPlatformToken")
                                                            .call()
                                                            .value(),
                                                    env)
                                            + "; rv:"
                                            + toStringR(
                                                    NamespaceGlobal.mt_rand
                                                            .env(env)
                                                            .call(5, 7)
                                                            .value(),
                                                    env)
                                            + ".0) "
                                            + toStringR(ver, env)),
                            new ZPair(
                                    2,
                                    "("
                                            + toStringR(
                                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                    env, this, UserAgent.class)
                                                            .method("macPlatformToken")
                                                            .call()
                                                            .value(),
                                                    env)
                                            + " rv:"
                                            + toStringR(
                                                    NamespaceGlobal.mt_rand
                                                            .env(env)
                                                            .call(2, 6)
                                                            .value(),
                                                    env)
                                            + ".0) "
                                            + toStringR(ver, env)));
            return ZVal.assign(
                    "Mozilla/5.0 "
                            + toStringR(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, UserAgent.class)
                                            .method("randomElement")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(platforms)
                                            .value(),
                                    env));
        }

        @ConvertedMethod
        public Object safari(RuntimeEnv env, Object... args) {
            Object ver = null;
            Object mobileDevices = null;
            Object saf = null;
            Object platforms = null;
            saf =
                    toStringR(NamespaceGlobal.mt_rand.env(env).call(531, 535).value(), env)
                            + "."
                            + toStringR(NamespaceGlobal.mt_rand.env(env).call(1, 50).value(), env)
                            + "."
                            + toStringR(NamespaceGlobal.mt_rand.env(env).call(1, 7).value(), env);
            if (ZVal.equalityCheck(NamespaceGlobal.mt_rand.env(env).call(0, 1).value(), 0)) {
                ver =
                        toStringR(NamespaceGlobal.mt_rand.env(env).call(4, 5).value(), env)
                                + "."
                                + toStringR(
                                        NamespaceGlobal.mt_rand.env(env).call(0, 1).value(), env);

            } else {
                ver =
                        toStringR(NamespaceGlobal.mt_rand.env(env).call(4, 5).value(), env)
                                + ".0."
                                + toStringR(
                                        NamespaceGlobal.mt_rand.env(env).call(1, 5).value(), env);
            }

            mobileDevices = ZVal.arrayFromList("iPhone; CPU iPhone OS", "iPad; CPU OS");
            platforms =
                    ZVal.newArray(
                            new ZPair(
                                    0,
                                    "(Windows; U; "
                                            + toStringR(
                                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                    env, this, UserAgent.class)
                                                            .method("windowsPlatformToken")
                                                            .call()
                                                            .value(),
                                                    env)
                                            + toStringR(
                                                    ") AppleWebKit/"
                                                            + toStringR(saf, env)
                                                            + " (KHTML, like Gecko) Version/"
                                                            + toStringR(ver, env)
                                                            + " Safari/"
                                                            + toStringR(saf, env),
                                                    env)),
                            new ZPair(
                                    1,
                                    "("
                                            + toStringR(
                                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                    env, this, UserAgent.class)
                                                            .method("macPlatformToken")
                                                            .call()
                                                            .value(),
                                                    env)
                                            + " rv:"
                                            + toStringR(
                                                    NamespaceGlobal.mt_rand
                                                            .env(env)
                                                            .call(2, 6)
                                                            .value(),
                                                    env)
                                            + ".0; "
                                            + toStringR(
                                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                    env, this, UserAgent.class)
                                                            .method("randomElement")
                                                            .addReferenceArgs(
                                                                    new RuntimeArgsWithReferences())
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
                                                                                            .UserAgent
                                                                                            .RequestStaticProperties
                                                                                            .class)
                                                                            .lang)
                                                            .value(),
                                                    env)
                                            + toStringR(
                                                    ") AppleWebKit/"
                                                            + toStringR(saf, env)
                                                            + " (KHTML, like Gecko) Version/"
                                                            + toStringR(ver, env)
                                                            + " Safari/"
                                                            + toStringR(saf, env),
                                                    env)),
                            new ZPair(
                                    2,
                                    "("
                                            + toStringR(
                                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                    env, this, UserAgent.class)
                                                            .method("randomElement")
                                                            .addReferenceArgs(
                                                                    new RuntimeArgsWithReferences())
                                                            .call(mobileDevices)
                                                            .value(),
                                                    env)
                                            + " "
                                            + toStringR(
                                                    NamespaceGlobal.mt_rand
                                                            .env(env)
                                                            .call(7, 8)
                                                            .value(),
                                                    env)
                                            + "_"
                                            + toStringR(
                                                    NamespaceGlobal.mt_rand
                                                            .env(env)
                                                            .call(0, 2)
                                                            .value(),
                                                    env)
                                            + "_"
                                            + toStringR(
                                                    NamespaceGlobal.mt_rand
                                                            .env(env)
                                                            .call(1, 2)
                                                            .value(),
                                                    env)
                                            + " like Mac OS X; "
                                            + toStringR(
                                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                    env, this, UserAgent.class)
                                                            .method("randomElement")
                                                            .addReferenceArgs(
                                                                    new RuntimeArgsWithReferences())
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
                                                                                            .UserAgent
                                                                                            .RequestStaticProperties
                                                                                            .class)
                                                                            .lang)
                                                            .value(),
                                                    env)
                                            + toStringR(
                                                    ") AppleWebKit/"
                                                            + toStringR(saf, env)
                                                            + " (KHTML, like Gecko) Version/",
                                                    env)
                                            + toStringR(
                                                    NamespaceGlobal.mt_rand
                                                            .env(env)
                                                            .call(3, 4)
                                                            .value(),
                                                    env)
                                            + ".0.5 Mobile/8B"
                                            + toStringR(
                                                    NamespaceGlobal.mt_rand
                                                            .env(env)
                                                            .call(111, 119)
                                                            .value(),
                                                    env)
                                            + toStringR(" Safari/6" + toStringR(saf, env), env)));
            return ZVal.assign(
                    "Mozilla/5.0 "
                            + toStringR(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, UserAgent.class)
                                            .method("randomElement")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(platforms)
                                            .value(),
                                    env));
        }

        @ConvertedMethod
        public Object opera(RuntimeEnv env, Object... args) {
            Object platforms = null;
            platforms =
                    ZVal.newArray(
                            new ZPair(
                                    0,
                                    "("
                                            + toStringR(
                                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                    env, this, UserAgent.class)
                                                            .method("linuxPlatformToken")
                                                            .call()
                                                            .value(),
                                                    env)
                                            + "; "
                                            + toStringR(
                                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                    env, this, UserAgent.class)
                                                            .method("randomElement")
                                                            .addReferenceArgs(
                                                                    new RuntimeArgsWithReferences())
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
                                                                                            .UserAgent
                                                                                            .RequestStaticProperties
                                                                                            .class)
                                                                            .lang)
                                                            .value(),
                                                    env)
                                            + ") Presto/2."
                                            + toStringR(
                                                    NamespaceGlobal.mt_rand
                                                            .env(env)
                                                            .call(8, 12)
                                                            .value(),
                                                    env)
                                            + "."
                                            + toStringR(
                                                    NamespaceGlobal.mt_rand
                                                            .env(env)
                                                            .call(160, 355)
                                                            .value(),
                                                    env)
                                            + " Version/"
                                            + toStringR(
                                                    NamespaceGlobal.mt_rand
                                                            .env(env)
                                                            .call(10, 12)
                                                            .value(),
                                                    env)
                                            + ".00"),
                            new ZPair(
                                    1,
                                    "("
                                            + toStringR(
                                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                    env, this, UserAgent.class)
                                                            .method("windowsPlatformToken")
                                                            .call()
                                                            .value(),
                                                    env)
                                            + "; "
                                            + toStringR(
                                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                    env, this, UserAgent.class)
                                                            .method("randomElement")
                                                            .addReferenceArgs(
                                                                    new RuntimeArgsWithReferences())
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
                                                                                            .UserAgent
                                                                                            .RequestStaticProperties
                                                                                            .class)
                                                                            .lang)
                                                            .value(),
                                                    env)
                                            + ") Presto/2."
                                            + toStringR(
                                                    NamespaceGlobal.mt_rand
                                                            .env(env)
                                                            .call(8, 12)
                                                            .value(),
                                                    env)
                                            + "."
                                            + toStringR(
                                                    NamespaceGlobal.mt_rand
                                                            .env(env)
                                                            .call(160, 355)
                                                            .value(),
                                                    env)
                                            + " Version/"
                                            + toStringR(
                                                    NamespaceGlobal.mt_rand
                                                            .env(env)
                                                            .call(10, 12)
                                                            .value(),
                                                    env)
                                            + ".00"));
            return ZVal.assign(
                    "Opera/"
                            + toStringR(NamespaceGlobal.mt_rand.env(env).call(8, 9).value(), env)
                            + "."
                            + toStringR(NamespaceGlobal.mt_rand.env(env).call(10, 99).value(), env)
                            + " "
                            + toStringR(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, UserAgent.class)
                                            .method("randomElement")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(platforms)
                                            .value(),
                                    env));
        }

        @ConvertedMethod
        public Object internetExplorer(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    "Mozilla/5.0 (compatible; MSIE "
                            + toStringR(NamespaceGlobal.mt_rand.env(env).call(5, 11).value(), env)
                            + ".0; "
                            + toStringR(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, UserAgent.class)
                                            .method("windowsPlatformToken")
                                            .call()
                                            .value(),
                                    env)
                            + "; Trident/"
                            + toStringR(NamespaceGlobal.mt_rand.env(env).call(3, 5).value(), env)
                            + "."
                            + toStringR(NamespaceGlobal.mt_rand.env(env).call(0, 1).value(), env)
                            + ")");
        }

        @ConvertedMethod
        public Object windowsPlatformToken(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, UserAgent.class)
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
                                                            .UserAgent
                                                            .RequestStaticProperties
                                                            .class)
                                            .windowsPlatformTokens)
                            .value());
        }

        @ConvertedMethod
        public Object macPlatformToken(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    "Macintosh; "
                            + toStringR(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, UserAgent.class)
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
                                                                            .UserAgent
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .macProcessor)
                                            .value(),
                                    env)
                            + " Mac OS X 10_"
                            + toStringR(NamespaceGlobal.mt_rand.env(env).call(5, 8).value(), env)
                            + "_"
                            + toStringR(NamespaceGlobal.mt_rand.env(env).call(0, 9).value(), env));
        }

        @ConvertedMethod
        public Object linuxPlatformToken(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    "X11; Linux "
                            + toStringR(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, UserAgent.class)
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
                                                                            .UserAgent
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .linuxProcessor)
                                            .value(),
                                    env));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object userAgents =
                ZVal.arrayFromList("firefox", "chrome", "internetExplorer", "opera", "safari");

        public Object windowsPlatformTokens =
                ZVal.arrayFromList(
                        "Windows NT 6.2",
                        "Windows NT 6.1",
                        "Windows NT 6.0",
                        "Windows NT 5.2",
                        "Windows NT 5.1",
                        "Windows NT 5.01",
                        "Windows NT 5.0",
                        "Windows NT 4.0",
                        "Windows 98; Win 9x 4.90",
                        "Windows 98",
                        "Windows 95",
                        "Windows CE");

        public Object linuxProcessor = ZVal.arrayFromList("i686", "x86_64");

        public Object macProcessor = ZVal.arrayFromList("Intel", "PPC", "U; Intel", "U; PPC");

        public Object lang = ZVal.arrayFromList("en-US", "sl-SI");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\UserAgent")
                    .setLookup(
                            UserAgent.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "lang",
                            "linuxProcessor",
                            "macProcessor",
                            "userAgents",
                            "windowsPlatformTokens")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/UserAgent.php")
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
