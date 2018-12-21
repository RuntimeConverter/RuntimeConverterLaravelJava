package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Filesystem.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Adapter.classes.Ftp;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Filesystem.classes.Factory;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.Filesystem;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.FilesystemInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Adapter.classes.Local;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Filesystem.classes.FilesystemAdapter;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Filesystem.classes.Cache;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Filesystem/FilesystemManager.php

*/

public class FilesystemManager extends RuntimeClassBase implements Factory {

    public Object app = null;

    public Object disks = ZVal.newArray();

    public Object customCreators = ZVal.newArray();

    public FilesystemManager(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FilesystemManager.class) {
            this.__construct(env, args);
        }
    }

    public FilesystemManager(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "app")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object app = assignParameter(args, 0, false);
        this.app = app;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object drive(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        return ZVal.assign(this.disk(env, name));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object disk(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        name =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = name)
                                ? ternaryExpressionTemp
                                : this.getDefaultDriver(env));
        return ZVal.assign(
                new ReferenceClassProperty(this, "disks", env)
                        .arrayAccess(env, name)
                        .set(this.get(env, name)));
    }

    @ConvertedMethod
    public Object cloud(RuntimeEnv env, Object... args) {
        Object name = null;
        name = this.getDefaultCloudDriver(env);
        return ZVal.assign(
                new ReferenceClassProperty(this, "disks", env)
                        .arrayAccess(env, name)
                        .set(this.get(env, name)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object get(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        new ReferenceClassProperty(this, "disks", env)
                                                .arrayGet(env, name))
                        ? ternaryExpressionTemp
                        : this.resolve(env, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object resolve(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object driverMethod = null;
        ReferenceContainer config = new BasicReferenceContainer(null);
        config.setObject(this.getConfig(env, name));
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "customCreators", env),
                env,
                config.arrayGet(env, "driver"))) {
            return ZVal.assign(this.callCustomCreator(env, config.getObject()));
        }

        driverMethod =
                "create"
                        + toStringR(
                                NamespaceGlobal.ucfirst
                                        .env(env)
                                        .call(config.arrayGet(env, "driver"))
                                        .value(),
                                env)
                        + "Driver";
        if (function_method_exists.f.env(env).call(this, driverMethod).getBool()) {
            return ZVal.assign(
                    env.callMethod(
                            this,
                            new RuntimeArgsWithReferences().add(0, config),
                            toStringR(driverMethod, env),
                            FilesystemManager.class,
                            config.getObject()));

        } else {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Driver ["
                                    + toStringR(config.arrayGet(env, "driver"), env)
                                    + "] is not supported."));
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object callCustomCreator(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object driver = null;
        driver =
                env.callFunctionDynamic(
                                new ReferenceClassProperty(this, "customCreators", env)
                                        .arrayGet(env, config.arrayGet(env, "driver")),
                                new RuntimeArgsWithReferences()
                                        .add(0, new ReferenceClassProperty(this, "app", env))
                                        .add(1, config),
                                this.app,
                                config.getObject())
                        .value();
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        driver,
                        FilesystemInterface.class,
                        "League\\Flysystem\\FilesystemInterface"))) {
            return ZVal.assign(this.adapt(env, driver));
        }

        return ZVal.assign(driver);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    public Object createLocalDriver(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object permissions = null;
        Object ternaryExpressionTemp = null;
        Object links = null;
        permissions =
                ZVal.assign(
                        ZVal.isDefined(ternaryExpressionTemp = config.arrayGet(env, "permissions"))
                                ? ternaryExpressionTemp
                                : ZVal.newArray());
        links =
                ZVal.assign(
                        ZVal.strictEqualityCheck(
                                        ZVal.isDefined(
                                                        ternaryExpressionTemp =
                                                                config.arrayGet(env, "links"))
                                                ? ternaryExpressionTemp
                                                : ZVal.getNull(),
                                        "===",
                                        "skip")
                                ? Local.CONST_SKIP_LINKS
                                : Local.CONST_DISALLOW_LINKS);
        return ZVal.assign(
                this.adapt(
                        env,
                        this.createFlysystem(
                                env,
                                new Local(env, config.arrayGet(env, "root"), 2, links, permissions),
                                config.getObject())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    public Object createFtpDriver(RuntimeEnv env, Object... args) {
        Object config = assignParameter(args, 0, false);
        return ZVal.assign(
                this.adapt(env, this.createFlysystem(env, new Ftp(env, config), config)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    public Object createSftpDriver(RuntimeEnv env, Object... args) {
        Object config = assignParameter(args, 0, false);
        return ZVal.assign(
                this.adapt(
                        env,
                        this.createFlysystem(
                                env,
                                env.createNew(ZVal.resolveClassAlias(env, "SftpAdapter"), config),
                                config)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    public Object createS3Driver(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object root = null;
        Object options = null;
        Object ternaryExpressionTemp = null;
        ReferenceContainer s3Config = new BasicReferenceContainer(null);
        s3Config.setObject(this.formatS3Config(env, config.getObject()));
        root =
                ZVal.assign(
                        ZVal.isDefined(ternaryExpressionTemp = s3Config.arrayGet(env, "root"))
                                ? ternaryExpressionTemp
                                : ZVal.getNull());
        options =
                ZVal.assign(
                        ZVal.isDefined(ternaryExpressionTemp = config.arrayGet(env, "options"))
                                ? ternaryExpressionTemp
                                : ZVal.newArray());
        return ZVal.assign(
                this.adapt(
                        env,
                        this.createFlysystem(
                                env,
                                env.createNew(
                                        ZVal.resolveClassAlias(env, "S3Adapter"),
                                        env.createNew(
                                                ZVal.resolveClassAlias(env, "S3Client"),
                                                s3Config.getObject()),
                                        s3Config.arrayGet(env, "bucket"),
                                        root,
                                        options),
                                config.getObject())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object formatS3Config(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        config.setObject(
                ZAssignment.add(
                        "+=", config.getObject(), ZVal.newArray(new ZPair("version", "latest"))));
        if (ZVal.toBool(config.arrayGet(env, "key"))
                && ZVal.toBool(config.arrayGet(env, "secret"))) {
            config.arrayAccess(env, "credentials")
                    .set(
                            Arr.runtimeStaticObject.only(
                                    env,
                                    config.getObject(),
                                    ZVal.arrayFromList("key", "secret", "token")));
        }

        return ZVal.assign(config.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    public Object createRackspaceDriver(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object root = null;
        Object client = null;
        Object ternaryExpressionTemp = null;
        client =
                env.createNew(
                        ZVal.resolveClassAlias(env, "Rackspace"),
                        config.arrayGet(env, "endpoint"),
                        ZVal.newArray(
                                new ZPair("username", config.arrayGet(env, "username")),
                                new ZPair("apiKey", config.arrayGet(env, "key"))),
                        ZVal.isDefined(ternaryExpressionTemp = config.arrayGet(env, "options"))
                                ? ternaryExpressionTemp
                                : ZVal.newArray());
        root =
                ZVal.assign(
                        ZVal.isDefined(ternaryExpressionTemp = config.arrayGet(env, "root"))
                                ? ternaryExpressionTemp
                                : ZVal.getNull());
        return ZVal.assign(
                this.adapt(
                        env,
                        this.createFlysystem(
                                env,
                                env.createNew(
                                        ZVal.resolveClassAlias(env, "RackspaceAdapter"),
                                        this.getRackspaceContainer(env, client, config.getObject()),
                                        root),
                                config.getObject())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "client", typeHint = "OpenCloud\\Rackspace")
    @ConvertedParameter(index = 1, name = "config", typeHint = "array")
    protected Object getRackspaceContainer(RuntimeEnv env, Object... args) {
        Object client = assignParameter(args, 0, false);
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object urlType = null;
        Object ternaryExpressionTemp = null;
        Object store = null;
        urlType =
                ZVal.assign(
                        ZVal.isDefined(ternaryExpressionTemp = config.arrayGet(env, "url_type"))
                                ? ternaryExpressionTemp
                                : ZVal.getNull());
        store =
                env.callMethod(
                        client,
                        "objectStoreService",
                        FilesystemManager.class,
                        "cloudFiles",
                        config.arrayGet(env, "region"),
                        urlType);
        return ZVal.assign(
                env.callMethod(
                        store,
                        "getContainer",
                        FilesystemManager.class,
                        config.arrayGet(env, "container")));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "adapter",
        typeHint = "League\\Flysystem\\AdapterInterface"
    )
    @ConvertedParameter(index = 1, name = "config", typeHint = "array")
    protected Object createFlysystem(RuntimeEnv env, Object... args) {
        Object adapter = assignParameter(args, 0, false);
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object cache = null;
        cache =
                Arr.runtimeStaticObject.pull(
                        env,
                        new RuntimeArgsWithReferences().add(0, config),
                        config.getObject(),
                        "cache");
        config.setObject(
                Arr.runtimeStaticObject.only(
                        env,
                        config.getObject(),
                        ZVal.arrayFromList("visibility", "disable_asserts", "url")));
        if (ZVal.isTrue(cache)) {
            adapter =
                    env.createNew(
                            ZVal.resolveClassAlias(env, "CachedAdapter"),
                            adapter,
                            this.createCacheStore(env, cache));
        }

        return ZVal.assign(
                new Filesystem(
                        env,
                        adapter,
                        ZVal.isGreaterThan(
                                        function_count.f.env(env).call(config.getObject()).value(),
                                        '>',
                                        0)
                                ? config.getObject()
                                : ZVal.getNull()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config")
    protected Object createCacheStore(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object ternaryExpressionTemp = null;
        if (ZVal.strictEqualityCheck(config.getObject(), "===", true)) {
            return ZVal.assign(env.createNew(ZVal.resolveClassAlias(env, "MemoryStore")));
        }

        return ZVal.assign(
                new Cache(
                        env,
                        env.callMethod(
                                new ReferenceClassProperty(this, "app", env).arrayGet(env, "cache"),
                                "store",
                                FilesystemManager.class,
                                config.arrayGet(env, "store")),
                        ZVal.isDefined(ternaryExpressionTemp = config.arrayGet(env, "prefix"))
                                ? ternaryExpressionTemp
                                : "flysystem",
                        ZVal.isDefined(ternaryExpressionTemp = config.arrayGet(env, "expire"))
                                ? ternaryExpressionTemp
                                : ZVal.getNull()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "filesystem",
        typeHint = "League\\Flysystem\\FilesystemInterface"
    )
    protected Object adapt(RuntimeEnv env, Object... args) {
        Object filesystem = assignParameter(args, 0, false);
        return ZVal.assign(new FilesystemAdapter(env, filesystem));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "disk")
    public Object set(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object disk = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "disks", env).arrayAccess(env, name).set(disk);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object getConfig(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                new ReferenceClassProperty(this, "app", env)
                        .arrayGet(env, "config", "filesystems.disks." + toStringR(name, env)));
    }

    @ConvertedMethod
    public Object getDefaultDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "app", env)
                        .arrayGet(env, "config", "filesystems.default"));
    }

    @ConvertedMethod
    public Object getDefaultCloudDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "app", env)
                        .arrayGet(env, "config", "filesystems.cloud"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "disk")
    public Object forgetDisk(RuntimeEnv env, Object... args) {
        Object disk = assignParameter(args, 0, false);
        Object diskName = null;
        for (ZPair zpairResult386 : ZVal.getIterable(rToArrayCast(disk), env, true)) {
            diskName = ZVal.assign(zpairResult386.getValue());
            arrayActionR(
                    ArrayAction.UNSET,
                    new ReferenceClassProperty(this, "disks", env),
                    env,
                    diskName);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "driver")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "Closure")
    public Object extend(RuntimeEnv env, Object... args) {
        Object driver = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "customCreators", env)
                .arrayAccess(env, driver)
                .set(callback);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        this.disk(env),
                        new RuntimeArgsWithReferences(),
                        toStringR(method, env),
                        FilesystemManager.class,
                        PackedVaradicArgs.unpack(new PackedVaradicArgs(parameters))));
    }

    public static final Object CONST_class = "Illuminate\\Filesystem\\FilesystemManager";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Filesystem\\FilesystemManager")
                    .setLookup(
                            FilesystemManager.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "customCreators", "disks")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Filesystem/FilesystemManager.php")
                    .addInterface("Illuminate\\Contracts\\Filesystem\\Factory")
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
