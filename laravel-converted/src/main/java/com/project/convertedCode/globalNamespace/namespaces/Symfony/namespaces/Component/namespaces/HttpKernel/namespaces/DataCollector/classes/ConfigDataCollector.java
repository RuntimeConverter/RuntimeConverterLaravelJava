package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DataCollector.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.otherProxyClasses.Locale;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DataCollector.classes.LateDataCollectorInterface;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes.Kernel;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.LinkStub;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DataCollector.classes.DataCollector;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_extension_loaded;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/DataCollector/ConfigDataCollector.php

*/

public class ConfigDataCollector extends DataCollector implements LateDataCollectorInterface {

    public Object kernel = null;

    public Object name = null;

    public Object version = null;

    public Object hasVarDumper = null;

    public ConfigDataCollector(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ConfigDataCollector.class) {
            this.__construct(env, args);
        }
    }

    public ConfigDataCollector(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "name",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "version",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object version = assignParameter(args, 1, true);
        if (null == version) {
            version = ZVal.getNull();
        }
        this.name = name;
        this.version = version;
        this.hasVarDumper = function_class_exists.f.env(env).call(LinkStub.CONST_class).value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "kernel",
        typeHint = "Symfony\\Component\\HttpKernel\\KernelInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setKernel(RuntimeEnv env, Object... args) {
        Object kernel = assignParameter(args, 0, true);
        if (null == kernel) {
            kernel = ZVal.getNull();
        }
        this.kernel = kernel;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(
        index = 1,
        name = "response",
        typeHint = "Symfony\\Component\\HttpFoundation\\Response"
    )
    @ConvertedParameter(
        index = 2,
        name = "exception",
        typeHint = "Exception",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object collect(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object response = assignParameter(args, 1, false);
        Object exception = assignParameter(args, 2, true);
        if (null == exception) {
            exception = ZVal.getNull();
        }
        Object eom = null;
        Object eol = null;
        Object name = null;
        Object bundle = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        toObjectR(this)
                .accessProp(this, env)
                .name("data")
                .set(
                        ZVal.newArray(
                                new ZPair("app_name", this.name),
                                new ZPair("app_version", this.version),
                                new ZPair(
                                        "token",
                                        env.callMethod(
                                                toObjectR(response)
                                                        .accessProp(this, env)
                                                        .name("headers")
                                                        .value(),
                                                "get",
                                                ConfigDataCollector.class,
                                                "X-Debug-Token")),
                                new ZPair("symfony_version", Kernel.CONST_VERSION),
                                new ZPair("symfony_state", "unknown"),
                                new ZPair(
                                        "name",
                                        ZVal.isset(this.kernel)
                                                ? env.callMethod(
                                                        this.kernel,
                                                        "getName",
                                                        ConfigDataCollector.class)
                                                : "n/a"),
                                new ZPair(
                                        "env",
                                        ZVal.isset(this.kernel)
                                                ? env.callMethod(
                                                        this.kernel,
                                                        "getEnvironment",
                                                        ConfigDataCollector.class)
                                                : "n/a"),
                                new ZPair(
                                        "debug",
                                        ZVal.isset(this.kernel)
                                                ? env.callMethod(
                                                        this.kernel,
                                                        "isDebug",
                                                        ConfigDataCollector.class)
                                                : "n/a"),
                                new ZPair("php_version", "7.2.11-dev"),
                                new ZPair("php_architecture", ZVal.multiply(8, 8)),
                                new ZPair(
                                        "php_intl_locale",
                                        ZVal.toBool(
                                                                function_class_exists
                                                                        .f
                                                                        .env(env)
                                                                        .call("Locale", false)
                                                                        .value())
                                                        && ZVal.toBool(
                                                                Locale.runtimeStaticObject
                                                                        .getDefault(env))
                                                ? Locale.runtimeStaticObject.getDefault(env)
                                                : "n/a"),
                                new ZPair(
                                        "php_timezone",
                                        NamespaceGlobal.date_default_timezone_get
                                                .env(env)
                                                .call()
                                                .value()),
                                new ZPair(
                                        "xdebug_enabled",
                                        function_extension_loaded
                                                .f
                                                .env(env)
                                                .call("xdebug")
                                                .value()),
                                new ZPair(
                                        "apcu_enabled",
                                        ZVal.toBool(
                                                        function_extension_loaded
                                                                .f
                                                                .env(env)
                                                                .call("apcu")
                                                                .value())
                                                && ZVal.toBool(
                                                        function_ini_get
                                                                .f
                                                                .env(env)
                                                                .call("apc.enabled")
                                                                .value())),
                                new ZPair(
                                        "zend_opcache_enabled",
                                        ZVal.toBool(
                                                        function_extension_loaded
                                                                .f
                                                                .env(env)
                                                                .call("Zend OPcache")
                                                                .value())
                                                && ZVal.toBool(
                                                        function_ini_get
                                                                .f
                                                                .env(env)
                                                                .call("opcache.enable")
                                                                .value())),
                                new ZPair("bundles", ZVal.newArray()),
                                new ZPair("sapi_name", "cli")));
        if (ZVal.isset(this.kernel)) {
            for (ZPair zpairResult1910 :
                    ZVal.getIterable(
                            env.callMethod(this.kernel, "getBundles", ConfigDataCollector.class),
                            env,
                            false)) {
                name = ZVal.assign(zpairResult1910.getKey());
                bundle = ZVal.assign(zpairResult1910.getValue());
                new ReferenceClassProperty(this, "data", env)
                        .arrayAccess(env, "bundles", name)
                        .set(
                                ZVal.isTrue(this.hasVarDumper)
                                        ? new LinkStub(
                                                env,
                                                env.callMethod(
                                                        bundle,
                                                        "getPath",
                                                        ConfigDataCollector.class))
                                        : env.callMethod(
                                                bundle, "getPath", ConfigDataCollector.class));
            }

            new ReferenceClassProperty(this, "data", env)
                    .arrayAccess(env, "symfony_state")
                    .set(this.determineSymfonyState(env));
            new ReferenceClassProperty(this, "data", env)
                    .arrayAccess(env, "symfony_minor_version")
                    .set(
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "%s.%s",
                                            Kernel.CONST_MAJOR_VERSION, Kernel.CONST_MINOR_VERSION)
                                    .value());
            eom =
                    DateTime.runtimeStaticObject.createFromFormat(
                            env, "m/Y", Kernel.CONST_END_OF_MAINTENANCE);
            eol =
                    DateTime.runtimeStaticObject.createFromFormat(
                            env, "m/Y", Kernel.CONST_END_OF_LIFE);
            new ReferenceClassProperty(this, "data", env)
                    .arrayAccess(env, "symfony_eom")
                    .set(env.callMethod(eom, "format", ConfigDataCollector.class, "F Y"));
            new ReferenceClassProperty(this, "data", env)
                    .arrayAccess(env, "symfony_eol")
                    .set(env.callMethod(eol, "format", ConfigDataCollector.class, "F Y"));
        }

        if (ZVal.toBool(
                        function_preg_match
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                                .call(
                                        "~^(\\d+(?:\\.\\d+)*)(.+)?$~",
                                        new ReferenceClassProperty(this, "data", env)
                                                .arrayGet(env, "php_version"),
                                        matches.getObject())
                                .value())
                && ZVal.toBool(arrayActionR(ArrayAction.ISSET, matches, env, 2))) {
            new ReferenceClassProperty(this, "data", env)
                    .arrayAccess(env, "php_version")
                    .set(matches.arrayGet(env, 1));
            new ReferenceClassProperty(this, "data", env)
                    .arrayAccess(env, "php_version_extra")
                    .set(matches.arrayGet(env, 2));
        }

        return null;
    }

    @ConvertedMethod
    public Object reset(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("data").set(ZVal.newArray());
        return null;
    }

    @ConvertedMethod
    public Object lateCollect(RuntimeEnv env, Object... args) {
        toObjectR(this)
                .accessProp(this, env)
                .name("data")
                .set(
                        env.callMethod(
                                this,
                                "cloneVar",
                                ConfigDataCollector.class,
                                toObjectR(this).accessProp(this, env).name("data").value()));
        return null;
    }

    @ConvertedMethod
    public Object getApplicationName(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ReferenceClassProperty(this, "data", env).arrayGet(env, "app_name"));
    }

    @ConvertedMethod
    public Object getApplicationVersion(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "data", env).arrayGet(env, "app_version"));
    }

    @ConvertedMethod
    public Object getToken(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ReferenceClassProperty(this, "data", env).arrayGet(env, "token"));
    }

    @ConvertedMethod
    public Object getSymfonyVersion(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "data", env).arrayGet(env, "symfony_version"));
    }

    @ConvertedMethod
    public Object getSymfonyState(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "data", env).arrayGet(env, "symfony_state"));
    }

    @ConvertedMethod
    public Object getSymfonyMinorVersion(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "data", env)
                        .arrayGet(env, "symfony_minor_version"));
    }

    @ConvertedMethod
    public Object getSymfonyEom(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "data", env).arrayGet(env, "symfony_eom"));
    }

    @ConvertedMethod
    public Object getSymfonyEol(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "data", env).arrayGet(env, "symfony_eol"));
    }

    @ConvertedMethod
    public Object getPhpVersion(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "data", env).arrayGet(env, "php_version"));
    }

    @ConvertedMethod
    public Object getPhpVersionExtra(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "data", env),
                                env,
                                "php_version_extra")
                        ? new ReferenceClassProperty(this, "data", env)
                                .arrayGet(env, "php_version_extra")
                        : ZVal.getNull());
    }

    @ConvertedMethod
    public Object getPhpArchitecture(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "data", env).arrayGet(env, "php_architecture"));
    }

    @ConvertedMethod
    public Object getPhpIntlLocale(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "data", env).arrayGet(env, "php_intl_locale"));
    }

    @ConvertedMethod
    public Object getPhpTimezone(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "data", env).arrayGet(env, "php_timezone"));
    }

    @ConvertedMethod
    public Object getAppName(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ReferenceClassProperty(this, "data", env).arrayGet(env, "name"));
    }

    @ConvertedMethod
    public Object getEnv(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ReferenceClassProperty(this, "data", env).arrayGet(env, "env"));
    }

    @ConvertedMethod
    public Object isDebug(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ReferenceClassProperty(this, "data", env).arrayGet(env, "debug"));
    }

    @ConvertedMethod
    public Object hasXDebug(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "data", env).arrayGet(env, "xdebug_enabled"));
    }

    @ConvertedMethod
    public Object hasApcu(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "data", env).arrayGet(env, "apcu_enabled"));
    }

    @ConvertedMethod
    public Object hasZendOpcache(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "data", env)
                        .arrayGet(env, "zend_opcache_enabled"));
    }

    @ConvertedMethod
    public Object getBundles(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ReferenceClassProperty(this, "data", env).arrayGet(env, "bundles"));
    }

    @ConvertedMethod
    public Object getSapiName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "data", env).arrayGet(env, "sapi_name"));
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return "config";
    }

    @ConvertedMethod
    private Object determineSymfonyState(RuntimeEnv env, Object... args) {
        Object eom = null;
        Object eol = null;
        Object versionState = null;
        Object now = null;
        now = new DateTime(env);
        eom =
                env.callMethod(
                        DateTime.runtimeStaticObject.createFromFormat(
                                env, "m/Y", Kernel.CONST_END_OF_MAINTENANCE),
                        "modify",
                        ConfigDataCollector.class,
                        "last day of this month");
        eol =
                env.callMethod(
                        DateTime.runtimeStaticObject.createFromFormat(
                                env, "m/Y", Kernel.CONST_END_OF_LIFE),
                        "modify",
                        ConfigDataCollector.class,
                        "last day of this month");
        if (ZVal.isGreaterThan(now, '>', eol)) {
            versionState = "eol";

        } else if (ZVal.isGreaterThan(now, '>', eom)) {
            versionState = "eom";

        } else if (ZVal.strictNotEqualityCheck("", "!==", Kernel.CONST_EXTRA_VERSION)) {
            versionState = "dev";

        } else {
            versionState = "stable";
        }

        return ZVal.assign(versionState);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\DataCollector\\ConfigDataCollector";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends DataCollector.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\DataCollector\\ConfigDataCollector")
                    .setLookup(
                            ConfigDataCollector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "cloner", "data", "hasVarDumper", "kernel", "name", "version")
                    .setFilename("vendor/symfony/http-kernel/DataCollector/ConfigDataCollector.php")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\DataCollector\\LateDataCollectorInterface")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\DataCollector\\DataCollectorInterface")
                    .addInterface("Serializable")
                    .addExtendsClass("Symfony\\Component\\HttpKernel\\DataCollector\\DataCollector")
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
