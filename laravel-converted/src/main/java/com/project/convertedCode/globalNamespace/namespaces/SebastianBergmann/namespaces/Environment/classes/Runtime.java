package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Environment.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_extension_loaded;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/environment/src/Runtime.php

*/

public final class Runtime extends RuntimeClassBase {

    public Runtime(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Runtime(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object canCollectCodeCoverage(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(this.hasXdebug(env)) || ZVal.toBool(this.hasPHPDBGCodeCoverage(env)));
    }

    @ConvertedMethod
    public Object discardsComments(RuntimeEnv env, Object... args) {
        if (ZVal.toBool(function_extension_loaded.f.env(env).call("Zend Optimizer+").value())
                && ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                function_ini_get
                                                        .f
                                                        .env(env)
                                                        .call("zend_optimizerplus.save_comments")
                                                        .value(),
                                                "===",
                                                "0"))
                                || ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                function_ini_get
                                                        .f
                                                        .env(env)
                                                        .call("opcache.save_comments")
                                                        .value(),
                                                "===",
                                                "0")))) {
            return ZVal.assign(true);
        }

        if (ZVal.toBool(function_extension_loaded.f.env(env).call("Zend OPcache").value())
                && ZVal.toBool(
                        ZVal.equalityCheck(
                                function_ini_get.f.env(env).call("opcache.save_comments").value(),
                                0))) {
            return ZVal.assign(true);
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object getBinary(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object binary = null;
        Object possibleBinaryLocations = null;
        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .SebastianBergmann
                                                        .namespaces
                                                        .Environment
                                                        .classes
                                                        .Runtime
                                                        .RequestStaticProperties
                                                        .class)
                                        .binary,
                                "===",
                                ZVal.getNull()))
                && ZVal.toBool(this.isHHVM(env))) {
            if (ZVal.strictEqualityCheck(
                    env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .SebastianBergmann
                                                    .namespaces
                                                    .Environment
                                                    .classes
                                                    .Runtime
                                                    .RequestStaticProperties
                                                    .class)
                                    .binary =
                            NamespaceGlobal.getenv.env(env).call("PHP_BINARY").value(),
                    "===",
                    false)) {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .SebastianBergmann
                                                .namespaces
                                                .Environment
                                                .classes
                                                .Runtime
                                                .RequestStaticProperties
                                                .class)
                                .binary =
                        "/var/runtimeConverter/php-install-release/bin/php";
            }

            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .SebastianBergmann
                                            .namespaces
                                            .Environment
                                            .classes
                                            .Runtime
                                            .RequestStaticProperties
                                            .class)
                            .binary =
                    toStringR(
                                    NamespaceGlobal.escapeshellarg
                                            .env(env)
                                            .call(
                                                    env.getRequestStaticProperties(
                                                                    com.project
                                                                            .convertedCode
                                                                            .globalNamespace
                                                                            .namespaces
                                                                            .SebastianBergmann
                                                                            .namespaces
                                                                            .Environment
                                                                            .classes
                                                                            .Runtime
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .binary)
                                            .value(),
                                    env)
                            + " --php"
                            + " -d hhvm.php7.all=1";
        }

        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .SebastianBergmann
                                                        .namespaces
                                                        .Environment
                                                        .classes
                                                        .Runtime
                                                        .RequestStaticProperties
                                                        .class)
                                        .binary,
                                "===",
                                ZVal.getNull()))
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                "/var/runtimeConverter/php-install-release/bin/php", "!==", ""))) {
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .SebastianBergmann
                                            .namespaces
                                            .Environment
                                            .classes
                                            .Runtime
                                            .RequestStaticProperties
                                            .class)
                            .binary =
                    NamespaceGlobal.escapeshellarg
                            .env(env)
                            .call("/var/runtimeConverter/php-install-release/bin/php")
                            .value();
        }

        if (ZVal.strictEqualityCheck(
                env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .SebastianBergmann
                                        .namespaces
                                        .Environment
                                        .classes
                                        .Runtime
                                        .RequestStaticProperties
                                        .class)
                        .binary,
                "===",
                ZVal.getNull())) {
            possibleBinaryLocations =
                    ZVal.newArray(
                            new ZPair(
                                    0,
                                    toStringR("/var/runtimeConverter/php-install-release/bin", env)
                                            + "/php"),
                            new ZPair(
                                    1,
                                    toStringR("/var/runtimeConverter/php-install-release/bin", env)
                                            + "/php-cli.exe"),
                            new ZPair(
                                    2,
                                    toStringR("/var/runtimeConverter/php-install-release/bin", env)
                                            + "/php.exe"));
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult1453 : ZVal.getIterable(possibleBinaryLocations, env, true)) {
                binary = ZVal.assign(zpairResult1453.getValue());
                if (NamespaceGlobal.is_readable.env(env).call(binary).getBool()) {
                    env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .SebastianBergmann
                                                    .namespaces
                                                    .Environment
                                                    .classes
                                                    .Runtime
                                                    .RequestStaticProperties
                                                    .class)
                                    .binary =
                            NamespaceGlobal.escapeshellarg.env(env).call(binary).value();
                    break;
                }
            }
        }

        if (ZVal.strictEqualityCheck(
                env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .SebastianBergmann
                                        .namespaces
                                        .Environment
                                        .classes
                                        .Runtime
                                        .RequestStaticProperties
                                        .class)
                        .binary,
                "===",
                ZVal.getNull())) {
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .SebastianBergmann
                                            .namespaces
                                            .Environment
                                            .classes
                                            .Runtime
                                            .RequestStaticProperties
                                            .class)
                            .binary =
                    "php";
        }

        return ZVal.assign(
                env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .SebastianBergmann
                                        .namespaces
                                        .Environment
                                        .classes
                                        .Runtime
                                        .RequestStaticProperties
                                        .class)
                        .binary);
    }

    @ConvertedMethod
    public Object getNameWithVersion(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(this.getName(env), env) + " " + toStringR(this.getVersion(env), env));
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.isHHVM(env))) {
            return "HHVM";
        }

        if (ZVal.isTrue(this.isPHPDBG(env))) {
            return "PHPDBG";
        }

        return "PHP";
    }

    @ConvertedMethod
    public Object getVendorUrl(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.isHHVM(env))) {
            return "http://hhvm.com/";
        }

        return "https://secure.php.net/";
    }

    @ConvertedMethod
    public Object getVersion(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.isHHVM(env))) {
            return ZVal.assign(function_constant.get(env, "HHVM_VERSION"));
        }

        return ZVal.assign("7.2.11-dev");
    }

    @ConvertedMethod
    public Object hasXdebug(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(ZVal.toBool(this.isPHP(env)) || ZVal.toBool(this.isHHVM(env)))
                        && ZVal.toBool(
                                function_extension_loaded.f.env(env).call("xdebug").value()));
    }

    @ConvertedMethod
    public Object isHHVM(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_defined.f.env(env).call("HHVM_VERSION").value());
    }

    @ConvertedMethod
    public Object isPHP(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(!ZVal.isTrue(this.isHHVM(env)))
                        && ZVal.toBool(!ZVal.isTrue(this.isPHPDBG(env))));
    }

    @ConvertedMethod
    public Object isPHPDBG(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(ZVal.strictEqualityCheck("cli", "===", "phpdbg"))
                        && ZVal.toBool(!ZVal.isTrue(this.isHHVM(env))));
    }

    @ConvertedMethod
    public Object hasPHPDBGCodeCoverage(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.isPHPDBG(env));
    }

    public static final Object CONST_class = "SebastianBergmann\\Environment\\Runtime";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object binary = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Environment\\Runtime")
                    .setLookup(
                            Runtime.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("binary")
                    .setFilename("vendor/sebastian/environment/src/Runtime.php")
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
