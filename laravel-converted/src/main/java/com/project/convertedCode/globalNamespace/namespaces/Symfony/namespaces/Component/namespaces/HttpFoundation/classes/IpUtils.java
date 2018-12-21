package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.filter.function_filter_var;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_extension_loaded;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/IpUtils.php

*/

public class IpUtils extends RuntimeClassBase {

    public IpUtils(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IpUtils.class) {
            this.__construct(env, args);
        }
    }

    public IpUtils(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    private Object __construct(RuntimeEnv env, Object... args) {
        return null;
    }

    public static final Object CONST_class = "Symfony\\Component\\HttpFoundation\\IpUtils";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "requestIp")
        @ConvertedParameter(index = 1, name = "ips")
        public Object checkIp(RuntimeEnv env, Object... args) {
            ReferenceContainer requestIp =
                    new BasicReferenceContainer(assignParameter(args, 0, false));
            Object ips = assignParameter(args, 1, false);
            Object method = null;
            ReferenceContainer ip = new BasicReferenceContainer(null);
            if (!function_is_array.f.env(env).call(ips).getBool()) {
                ips = ZVal.newArray(new ZPair(0, ips));
            }

            method =
                    ZVal.assign(
                            ZVal.isGreaterThan(
                                            NamespaceGlobal.substr_count
                                                    .env(env)
                                                    .call(requestIp.getObject(), ":")
                                                    .value(),
                                            '>',
                                            1)
                                    ? "checkIp6"
                                    : "checkIp4");
            for (ZPair zpairResult1859 : ZVal.getIterable(ips, env, true)) {
                ip.setObject(ZVal.assign(zpairResult1859.getValue()));
                if (ZVal.isTrue(
                        com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces
                                .Component.namespaces.HttpFoundation.classes.IpUtils
                                .runtimeStaticObject.callUnknownStaticMethod(
                                env,
                                method,
                                new RuntimeArgsWithReferences().add(0, requestIp).add(1, ip),
                                requestIp.getObject(),
                                ip.getObject()))) {
                    return ZVal.assign(true);
                }
            }

            return ZVal.assign(false);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "requestIp")
        @ConvertedParameter(index = 1, name = "ip")
        public Object checkIp4(RuntimeEnv env, Object... args) {
            Object requestIp = assignParameter(args, 0, false);
            Object ip = assignParameter(args, 1, false);
            Object address = null;
            Object runtimeTempArrayResult189 = null;
            Object cacheKey = null;
            Object netmask = null;
            cacheKey = toStringR(requestIp, env) + "-" + toStringR(ip, env);
            if (arrayActionR(
                    ArrayAction.ISSET,
                    env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Symfony
                                    .namespaces
                                    .Component
                                    .namespaces
                                    .HttpFoundation
                                    .classes
                                    .IpUtils
                                    .RequestStaticProperties
                                    .class,
                            "checkedIps"),
                    env,
                    cacheKey)) {
                return ZVal.assign(
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .HttpFoundation
                                                .classes
                                                .IpUtils
                                                .RequestStaticProperties
                                                .class,
                                        "checkedIps")
                                .arrayGet(env, cacheKey));
            }

            if (!function_filter_var.f.env(env).call(requestIp, 275, 1048576).getBool()) {
                return ZVal.assign(
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .HttpFoundation
                                                .classes
                                                .IpUtils
                                                .RequestStaticProperties
                                                .class,
                                        "checkedIps")
                                .arrayAccess(env, cacheKey)
                                .set(false));
            }

            if (ZVal.strictNotEqualityCheck(
                    false, "!==", function_strpos.f.env(env).call(ip, "/").value())) {
                ZVal.list(
                        runtimeTempArrayResult189 =
                                function_explode.f.env(env).call("/", ip, 2).value(),
                        (address = listGet(runtimeTempArrayResult189, 0, env)),
                        (netmask = listGet(runtimeTempArrayResult189, 1, env)));
                if (ZVal.strictEqualityCheck("0", "===", netmask)) {
                    return ZVal.assign(
                            env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Symfony
                                                    .namespaces
                                                    .Component
                                                    .namespaces
                                                    .HttpFoundation
                                                    .classes
                                                    .IpUtils
                                                    .RequestStaticProperties
                                                    .class,
                                            "checkedIps")
                                    .arrayAccess(env, cacheKey)
                                    .set(
                                            function_filter_var
                                                    .f
                                                    .env(env)
                                                    .call(address, 275, 1048576)
                                                    .value()));
                }

                if (ZVal.toBool(ZVal.isLessThan(netmask, '<', 0))
                        || ZVal.toBool(ZVal.isGreaterThan(netmask, '>', 32))) {
                    return ZVal.assign(
                            env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Symfony
                                                    .namespaces
                                                    .Component
                                                    .namespaces
                                                    .HttpFoundation
                                                    .classes
                                                    .IpUtils
                                                    .RequestStaticProperties
                                                    .class,
                                            "checkedIps")
                                    .arrayAccess(env, cacheKey)
                                    .set(false));
                }

            } else {
                address = ZVal.assign(ip);
                netmask = 32;
            }

            if (ZVal.strictEqualityCheck(
                    false, "===", NamespaceGlobal.ip2long.env(env).call(address).value())) {
                return ZVal.assign(
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .HttpFoundation
                                                .classes
                                                .IpUtils
                                                .RequestStaticProperties
                                                .class,
                                        "checkedIps")
                                .arrayAccess(env, cacheKey)
                                .set(false));
            }

            return ZVal.assign(
                    env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .HttpFoundation
                                            .classes
                                            .IpUtils
                                            .RequestStaticProperties
                                            .class,
                                    "checkedIps")
                            .arrayAccess(env, cacheKey)
                            .set(
                                    ZVal.strictEqualityCheck(
                                            0,
                                            "===",
                                            NamespaceGlobal.substr_compare
                                                    .env(env)
                                                    .call(
                                                            function_sprintf
                                                                    .f
                                                                    .env(env)
                                                                    .call(
                                                                            "%032b",
                                                                            NamespaceGlobal.ip2long
                                                                                    .env(env)
                                                                                    .call(requestIp)
                                                                                    .value())
                                                                    .value(),
                                                            function_sprintf
                                                                    .f
                                                                    .env(env)
                                                                    .call(
                                                                            "%032b",
                                                                            NamespaceGlobal.ip2long
                                                                                    .env(env)
                                                                                    .call(address)
                                                                                    .value())
                                                                    .value(),
                                                            0,
                                                            netmask)
                                                    .value())));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "requestIp")
        @ConvertedParameter(index = 1, name = "ip")
        public Object checkIp6(RuntimeEnv env, Object... args) {
            Object requestIp = assignParameter(args, 0, false);
            Object ip = assignParameter(args, 1, false);
            Object address = null;
            Object cacheKey = null;
            ReferenceContainer bytesTest = new BasicReferenceContainer(null);
            Object netmask = null;
            Object runtimeTempArrayResult190 = null;
            Object left = null;
            ReferenceContainer i = new BasicReferenceContainer(null);
            Object ceil = null;
            ReferenceContainer bytesAddr = new BasicReferenceContainer(null);
            Object mask = null;
            cacheKey = toStringR(requestIp, env) + "-" + toStringR(ip, env);
            if (arrayActionR(
                    ArrayAction.ISSET,
                    env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Symfony
                                    .namespaces
                                    .Component
                                    .namespaces
                                    .HttpFoundation
                                    .classes
                                    .IpUtils
                                    .RequestStaticProperties
                                    .class,
                            "checkedIps"),
                    env,
                    cacheKey)) {
                return ZVal.assign(
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .HttpFoundation
                                                .classes
                                                .IpUtils
                                                .RequestStaticProperties
                                                .class,
                                        "checkedIps")
                                .arrayGet(env, cacheKey));
            }

            if (!ZVal.toBool(
                            ZVal.toBool(
                                            function_extension_loaded
                                                    .f
                                                    .env(env)
                                                    .call("sockets")
                                                    .value())
                                    && ZVal.toBool(
                                            function_defined.f.env(env).call("AF_INET6").value()))
                    || ZVal.toBool(NamespaceGlobal.inet_pton.env(env).call("::1").value())) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                "Unable to check Ipv6. Check that PHP was not compiled with option \"disable-ipv6\"."));
            }

            if (ZVal.strictNotEqualityCheck(
                    false, "!==", function_strpos.f.env(env).call(ip, "/").value())) {
                ZVal.list(
                        runtimeTempArrayResult190 =
                                function_explode.f.env(env).call("/", ip, 2).value(),
                        (address = listGet(runtimeTempArrayResult190, 0, env)),
                        (netmask = listGet(runtimeTempArrayResult190, 1, env)));
                if (ZVal.strictEqualityCheck("0", "===", netmask)) {
                    return ZVal.assign(
                            ZVal.toBool(
                                    NamespaceGlobal.unpack
                                            .env(env)
                                            .call(
                                                    "n*",
                                                    NamespaceGlobal.inet_pton
                                                            .env(env)
                                                            .call(address)
                                                            .value())
                                            .value()));
                }

                if (ZVal.toBool(ZVal.isLessThan(netmask, '<', 1))
                        || ZVal.toBool(ZVal.isGreaterThan(netmask, '>', 128))) {
                    return ZVal.assign(
                            env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Symfony
                                                    .namespaces
                                                    .Component
                                                    .namespaces
                                                    .HttpFoundation
                                                    .classes
                                                    .IpUtils
                                                    .RequestStaticProperties
                                                    .class,
                                            "checkedIps")
                                    .arrayAccess(env, cacheKey)
                                    .set(false));
                }

            } else {
                address = ZVal.assign(ip);
                netmask = 128;
            }

            bytesAddr.setObject(
                    NamespaceGlobal.unpack
                            .env(env)
                            .call("n*", NamespaceGlobal.inet_pton.env(env).call(address).value())
                            .value());
            bytesTest.setObject(
                    NamespaceGlobal.unpack
                            .env(env)
                            .call("n*", NamespaceGlobal.inet_pton.env(env).call(requestIp).value())
                            .value());
            if (ZVal.toBool(!ZVal.isTrue(bytesAddr.getObject()))
                    || ZVal.toBool(!ZVal.isTrue(bytesTest.getObject()))) {
                return ZVal.assign(
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .HttpFoundation
                                                .classes
                                                .IpUtils
                                                .RequestStaticProperties
                                                .class,
                                        "checkedIps")
                                .arrayAccess(env, cacheKey)
                                .set(false));
            }

            for (i.setObject(1),
                            ceil =
                                    NamespaceGlobal.ceil
                                            .env(env)
                                            .call(ZVal.divide(netmask, 16))
                                            .value();
                    ZVal.isLessThanOrEqualTo(i.getObject(), "<=", ceil);
                    i.setObject(ZVal.increment(i.getObject()))) {
                left = ZVal.subtract(netmask, ZVal.multiply(16, ZVal.subtract(i.getObject(), 1)));
                left = ZVal.assign(ZVal.isLessThanOrEqualTo(left, "<=", 16) ? left : 16);
                mask =
                        ZVal.toLong(~ZVal.toLong(ZVal.toLong(65535) >> ZVal.toLong(left)))
                                & ZVal.toLong(65535);
                if (ZVal.notEqualityCheck(
                        ZVal.toLong(bytesAddr.arrayGet(env, i.getObject())) & ZVal.toLong(mask),
                        ZVal.toLong(bytesTest.arrayGet(env, i.getObject())) & ZVal.toLong(mask))) {
                    return ZVal.assign(
                            env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Symfony
                                                    .namespaces
                                                    .Component
                                                    .namespaces
                                                    .HttpFoundation
                                                    .classes
                                                    .IpUtils
                                                    .RequestStaticProperties
                                                    .class,
                                            "checkedIps")
                                    .arrayAccess(env, cacheKey)
                                    .set(false));
                }
            }

            return ZVal.assign(
                    env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .HttpFoundation
                                            .classes
                                            .IpUtils
                                            .RequestStaticProperties
                                            .class,
                                    "checkedIps")
                            .arrayAccess(env, cacheKey)
                            .set(true));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object checkedIps = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpFoundation\\IpUtils")
                    .setLookup(
                            IpUtils.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("checkedIps")
                    .setFilename("vendor/symfony/http-foundation/IpUtils.php")
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
