package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_error_handler;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Config.classes.FileLocator;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.runtimeconverter.runtime.nativeFunctions.date.function_microtime;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionObject;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_error_handler;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import java.lang.Class;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes.KernelInterface;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.file.function_realpath;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes.HttpKernelInterface;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DependencyInjection.classes.MergeExtensionConfigurationPass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes.RebootableInterface;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_error_reporting;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes.TerminableInterface;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DependencyInjection.classes.AddAnnotatedClassesToCachePass;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/Kernel.php

*/

public abstract class Kernel extends RuntimeClassBase
        implements KernelInterface, RebootableInterface, TerminableInterface {

    public Object bundles = ZVal.newArray();

    public Object container = null;

    public Object rootDir = null;

    public Object environment = null;

    public Object debug = null;

    public Object booted = false;

    public Object name = null;

    public Object startTime = null;

    public Object projectDir = null;

    public Object warmupDir = null;

    public Object requestStackSize = 0;

    public Object resetServices = false;

    public Kernel(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Kernel.class) {
            this.__construct(env, args);
        }
    }

    public Kernel(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "environment", typeHint = "string")
    @ConvertedParameter(index = 1, name = "debug", typeHint = "bool")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object environment = assignParameter(args, 0, false);
        Object debug = assignParameter(args, 1, false);
        this.environment = environment;
        this.debug = debug;
        this.rootDir = this.getRootDir(env);
        this.name = this.getName(env);
        return null;
    }

    @ConvertedMethod
    public Object __clone(RuntimeEnv env, Object... args) {
        this.booted = false;
        this.container = ZVal.getNull();
        this.requestStackSize = 0;
        this.resetServices = false;
        return null;
    }

    @ConvertedMethod
    public Object boot(RuntimeEnv env, Object... args) {
        ReferenceContainer _ENV = new BasicReferenceContainer(null);
        ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
        Object bundle = null;
        if (ZVal.strictEqualityCheck(true, "===", this.booted)) {
            if (ZVal.toBool(!ZVal.isTrue(this.requestStackSize))
                    && ZVal.toBool(this.resetServices)) {
                if (ZVal.isTrue(
                        env.callMethod(this.container, "has", Kernel.class, "services_resetter"))) {
                    env.callMethod(
                            env.callMethod(
                                    this.container, "get", Kernel.class, "services_resetter"),
                            "reset",
                            Kernel.class);
                }

                this.resetServices = false;
                if (ZVal.isTrue(this.debug)) {
                    this.startTime = function_microtime.f.env(env).call(true).value();
                }
            }

            return null;
        }

        if (ZVal.isTrue(this.debug)) {
            this.startTime = function_microtime.f.env(env).call(true).value();
        }

        if (ZVal.toBool(
                        ZVal.toBool(this.debug)
                                && ZVal.toBool(
                                        !arrayActionR(
                                                ArrayAction.ISSET, _ENV, env, "SHELL_VERBOSITY")))
                && ZVal.toBool(!arrayActionR(ArrayAction.ISSET, _SERVER, env, "SHELL_VERBOSITY"))) {
            NamespaceGlobal.putenv.env(env).call("SHELL_VERBOSITY=3");
            _ENV.arrayAccess(env, "SHELL_VERBOSITY").set(3);
            _SERVER.arrayAccess(env, "SHELL_VERBOSITY").set(3);
        }

        this.initializeBundles(env);
        this.initializeContainer(env);
        for (ZPair zpairResult1968 : ZVal.getIterable(this.getBundles(env), env, true)) {
            bundle = ZVal.assign(zpairResult1968.getValue());
            env.callMethod(bundle, "setContainer", Kernel.class, this.container);
            env.callMethod(bundle, "boot", Kernel.class);
        }

        this.booted = true;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "warmupDir")
    public Object reboot(RuntimeEnv env, Object... args) {
        Object warmupDir = assignParameter(args, 0, false);
        this.shutdown(env);
        this.warmupDir = warmupDir;
        this.boot(env);
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
    public Object terminate(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object response = assignParameter(args, 1, false);
        if (ZVal.strictEqualityCheck(false, "===", this.booted)) {
            return null;
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        this.getHttpKernel(env),
                        TerminableInterface.class,
                        "Symfony\\Component\\HttpKernel\\TerminableInterface"))) {
            env.callMethod(this.getHttpKernel(env), "terminate", Kernel.class, request, response);
        }

        return null;
    }

    @ConvertedMethod
    public Object shutdown(RuntimeEnv env, Object... args) {
        Object bundle = null;
        if (ZVal.strictEqualityCheck(false, "===", this.booted)) {
            return null;
        }

        this.booted = false;
        for (ZPair zpairResult1969 : ZVal.getIterable(this.getBundles(env), env, true)) {
            bundle = ZVal.assign(zpairResult1969.getValue());
            env.callMethod(bundle, "shutdown", Kernel.class);
            env.callMethod(bundle, "setContainer", Kernel.class, ZVal.getNull());
        }

        this.container = ZVal.getNull();
        this.requestStackSize = 0;
        this.resetServices = false;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(index = 1, name = "type")
    @ConvertedParameter(
        index = 2,
        name = "catch",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object handle(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = HttpKernelInterface.CONST_MASTER_REQUEST;
        }
        Object _pCatch = assignParameter(args, 2, true);
        if (null == _pCatch) {
            _pCatch = true;
        }
        this.boot(env);
        this.requestStackSize = ZVal.increment(this.requestStackSize);
        this.resetServices = true;
        try {
            return ZVal.assign(
                    env.callMethod(
                            this.getHttpKernel(env),
                            "handle",
                            Kernel.class,
                            request,
                            type,
                            _pCatch));
        } catch (ConvertedException convertedException294) {

            throw convertedException294;
        } finally {
            this.requestStackSize = ZVal.decrement(this.requestStackSize);
        }
    }

    @ConvertedMethod
    protected Object getHttpKernel(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.container, "get", Kernel.class, "http_kernel"));
    }

    @ConvertedMethod
    public Object getBundles(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.bundles);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object getBundle(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        if (!arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "bundles", env), env, name)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Bundle \"%s\" does not exist or it is not enabled. Maybe you forgot to add it in the registerBundles() method of your %s.php file?",
                                            name, function_get_class.f.env(env).call(this).value())
                                    .value()));
        }

        return ZVal.assign(new ReferenceClassProperty(this, "bundles", env).arrayGet(env, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "dir",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "first",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object locateResource(RuntimeEnv env, Object... args) {
        ReferenceContainer name = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object dir = assignParameter(args, 1, true);
        if (null == dir) {
            dir = ZVal.getNull();
        }
        Object first = assignParameter(args, 2, true);
        if (null == first) {
            first = true;
        }
        Object overridePath = null;
        Object path = null;
        Object runtimeTempArrayResult200 = null;
        Object file = null;
        Object resourceBundle = null;
        Object bundleName = null;
        ReferenceContainer files = new BasicReferenceContainer(null);
        Object isResource = null;
        Object bundle = null;
        if (ZVal.strictNotEqualityCheck("@", "!==", name.arrayGet(env, 0))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "A resource name must start with @ (\"%s\" given).",
                                            name.getObject())
                                    .value()));
        }

        if (ZVal.strictNotEqualityCheck(
                false, "!==", function_strpos.f.env(env).call(name.getObject(), "..").value())) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "File name \"%s\" contains invalid characters (..).",
                                            name.getObject())
                                    .value()));
        }

        bundleName = function_substr.f.env(env).call(name.getObject(), 1).value();
        path = "";
        if (ZVal.strictNotEqualityCheck(
                false, "!==", function_strpos.f.env(env).call(bundleName, "/").value())) {
            ZVal.list(
                    runtimeTempArrayResult200 =
                            function_explode.f.env(env).call("/", bundleName, 2).value(),
                    (bundleName = listGet(runtimeTempArrayResult200, 0, env)),
                    (path = listGet(runtimeTempArrayResult200, 1, env)));
        }

        isResource =
                ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        0,
                                        "===",
                                        function_strpos.f.env(env).call(path, "Resources").value()))
                        && ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", dir));
        overridePath = function_substr.f.env(env).call(path, 9).value();
        resourceBundle = ZVal.getNull();
        bundle = this.getBundle(env, bundleName);
        files.setObject(ZVal.newArray());
        if (ZVal.toBool(isResource)
                && ZVal.toBool(
                        function_file_exists
                                .f
                                .env(env)
                                .call(
                                        file =
                                                toStringR(dir, env)
                                                        + "/"
                                                        + toStringR(
                                                                env.callMethod(
                                                                        bundle,
                                                                        "getName",
                                                                        Kernel.class),
                                                                env)
                                                        + toStringR(overridePath, env))
                                .value())) {
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", resourceBundle)) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "\"%s\" resource is hidden by a resource from the \"%s\" derived bundle. Create a \"%s\" file to override the bundle resource.",
                                                file,
                                                resourceBundle,
                                                toStringR(dir, env)
                                                        + "/"
                                                        + toStringR(
                                                                env.callMethod(
                                                                        bundle,
                                                                        "getName",
                                                                        Kernel.class),
                                                                env)
                                                        + toStringR(overridePath, env))
                                        .value()));
            }

            files.arrayAppend(env).set(file);
        }

        if (function_file_exists
                .f
                .env(env)
                .call(
                        file =
                                toStringR(env.callMethod(bundle, "getPath", Kernel.class), env)
                                        + "/"
                                        + toStringR(path, env))
                .getBool()) {
            if (ZVal.toBool(first) && ZVal.toBool(!ZVal.isTrue(isResource))) {
                return ZVal.assign(file);
            }

            files.arrayAppend(env).set(file);
            resourceBundle = env.callMethod(bundle, "getName", Kernel.class);
        }

        if (ZVal.isGreaterThan(function_count.f.env(env).call(files.getObject()).value(), '>', 0)) {
            return ZVal.assign(
                    ZVal.toBool(first) && ZVal.toBool(isResource)
                            ? files.arrayGet(env, 0)
                            : files.getObject());
        }

        throw ZVal.getException(
                env,
                new InvalidArgumentException(
                        env,
                        function_sprintf
                                .f
                                .env(env)
                                .call("Unable to find file \"%s\".", name.getObject())
                                .value()));
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.name)) {
            this.name =
                    function_preg_replace
                            .f
                            .env(env)
                            .call(
                                    "/[^a-zA-Z0-9_]+/",
                                    "",
                                    NamespaceGlobal.basename.env(env).call(this.rootDir).value())
                            .value();
            if (NamespaceGlobal.ctype_digit
                    .env(env)
                    .call(new ReferenceClassProperty(this, "name", env).arrayGet(env, 0))
                    .getBool()) {
                this.name = "_" + toStringR(this.name, env);
            }
        }

        return ZVal.assign(this.name);
    }

    @ConvertedMethod
    public Object getEnvironment(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.environment);
    }

    @ConvertedMethod
    public Object isDebug(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.debug);
    }

    @ConvertedMethod
    public Object getRootDir(RuntimeEnv env, Object... args) {
        Object r = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.rootDir)) {
            r = new ReflectionObject(env, this);
            this.rootDir =
                    function_dirname
                            .f
                            .env(env)
                            .call(env.callMethod(r, "getFileName", Kernel.class))
                            .value();
        }

        return ZVal.assign(this.rootDir);
    }

    @ConvertedMethod
    public Object getProjectDir(RuntimeEnv env, Object... args) {
        Object r = null;
        Object rootDir = null;
        Object dir = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.projectDir)) {
            r = new ReflectionObject(env, this);
            dir =
                    ZVal.assign(
                            rootDir =
                                    function_dirname
                                            .f
                                            .env(env)
                                            .call(env.callMethod(r, "getFileName", Kernel.class))
                                            .value());
            while (!function_file_exists
                    .f
                    .env(env)
                    .call(toStringR(dir, env) + "/composer.json")
                    .getBool()) {
                if (ZVal.strictEqualityCheck(
                        dir, "===", function_dirname.f.env(env).call(dir).value())) {
                    return ZVal.assign(this.projectDir = rootDir);
                }

                dir = function_dirname.f.env(env).call(dir).value();
            }

            this.projectDir = dir;
        }

        return ZVal.assign(this.projectDir);
    }

    @ConvertedMethod
    public Object getContainer(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.container);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "annotatedClasses", typeHint = "array")
    public Object setAnnotatedClassCache(RuntimeEnv env, Object... args) {
        Object annotatedClasses = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        NamespaceGlobal.file_put_contents
                .env(env)
                .call(
                        toStringR(
                                        ZVal.isTrue(ternaryExpressionTemp = this.warmupDir)
                                                ? ternaryExpressionTemp
                                                : this.getCacheDir(env),
                                        env)
                                + "/annotations.map",
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "<?php return %s;",
                                        NamespaceGlobal.var_export
                                                .env(env)
                                                .call(annotatedClasses, true)
                                                .value())
                                .value());
        return null;
    }

    @ConvertedMethod
    public Object getStartTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isTrue(this.debug)
                        ? this.startTime
                        : ZVal.minusSign(function_constant.get(env, "INF")));
    }

    @ConvertedMethod
    public Object getCacheDir(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(this.rootDir, env) + "/cache/" + toStringR(this.environment, env));
    }

    @ConvertedMethod
    public Object getLogDir(RuntimeEnv env, Object... args) {
        return ZVal.assign(toStringR(this.rootDir, env) + "/logs");
    }

    @ConvertedMethod
    public Object getCharset(RuntimeEnv env, Object... args) {
        return "UTF-8";
    }

    @ConvertedMethod
    public Object getAnnotatedClassesToCompile(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    protected Object initializeBundles(RuntimeEnv env, Object... args) {
        Object name = null;
        Object bundle = null;
        this.bundles = ZVal.newArray();
        for (ZPair zpairResult1970 :
                ZVal.getIterable(
                        env.callMethod(this, "registerBundles", Kernel.class), env, true)) {
            bundle = ZVal.assign(zpairResult1970.getValue());
            name = env.callMethod(bundle, "getName", Kernel.class);
            if (arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "bundles", env),
                    env,
                    name)) {
                throw ZVal.getException(
                        env,
                        new LogicException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Trying to register two bundles with the same name \"%s\"",
                                                name)
                                        .value()));
            }

            new ReferenceClassProperty(this, "bundles", env).arrayAccess(env, name).set(bundle);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Symfony\\Component\\DependencyInjection\\ContainerBuilder"
    )
    protected Object build(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    protected Object getContainerClass(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(this.name, env)
                        + toStringR(
                                NamespaceGlobal.ucfirst.env(env).call(this.environment).value(),
                                env)
                        + toStringR(ZVal.isTrue(this.debug) ? "Debug" : "", env)
                        + "ProjectContainer");
    }

    @ConvertedMethod
    protected Object getContainerBaseClass(RuntimeEnv env, Object... args) {
        return "Container";
    }

    @ConvertedMethod
    protected Object initializeContainer(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope68 scope = new Scope68();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/symfony/http-kernel")
                            .setFile("/vendor/symfony/http-kernel/Kernel.php");
            scope.container = null;
            scope.cacheDir = null;
            scope.cache = null;
            scope.e = null;
            scope.oldContainerDir = null;
            scope.ternaryExpressionTemp = null;
            scope.legacyContainer = null;
            scope.errorLevel = null;
            scope.collectedLogs = new BasicReferenceContainer(null);
            scope.legacyContainers = new BasicReferenceContainer(null);
            scope.fresh = null;
            scope._pClass = null;
            scope.previousHandler = new BasicReferenceContainer(null);
            scope.oldContainer = null;
            scope._pClass = this.getContainerClass(env);
            scope.cacheDir =
                    ZVal.assign(
                            ZVal.isTrue(scope.ternaryExpressionTemp = this.warmupDir)
                                    ? scope.ternaryExpressionTemp
                                    : this.getCacheDir(env));
            scope.cache =
                    env.createNew(
                            ZVal.resolveClassAlias(env, "ConfigCache"),
                            toStringR(scope.cacheDir, env)
                                    + "/"
                                    + toStringR(scope._pClass, env)
                                    + ".php",
                            this.debug);
            scope.oldContainer = ZVal.getNull();
            if (ZVal.isTrue(scope.fresh = env.callMethod(scope.cache, "isFresh", Kernel.class))) {
                scope.errorLevel =
                        function_error_reporting
                                .f
                                .env(env)
                                .call(ZVal.toLong(32767) ^ ZVal.toLong(2))
                                .value();
                scope.fresh = ZVal.assign(scope.oldContainer = false);
                try {
                    if (ZVal.toBool(
                                    function_file_exists
                                            .f
                                            .env(env)
                                            .call(
                                                    env.callMethod(
                                                            scope.cache, "getPath", Kernel.class))
                                            .value())
                            && ZVal.toBool(
                                    function_is_object
                                            .f
                                            .env(env)
                                            .call(
                                                    this.container =
                                                            env.include(
                                                                    toStringR(
                                                                            env.callMethod(
                                                                                    scope.cache,
                                                                                    "getPath",
                                                                                    Kernel.class),
                                                                            env),
                                                                    stack,
                                                                    runtimeConverterFunctionClassConstants,
                                                                    false,
                                                                    false))
                                            .value())) {
                        env.callMethod(
                                this.container, "set", Kernel.class, "kernel", scope._thisVarAlias);
                        scope.oldContainer = ZVal.assign(this.container);
                        scope.fresh = true;
                    }

                } catch (ConvertedException convertedException295) {
                    if (convertedException295.instanceOf(Throwable.class, "Throwable")) {
                        scope.e = convertedException295.getObject();
                    } else if (convertedException295.instanceOf(PHPException.class, "Exception")) {
                        scope.e = convertedException295.getObject();
                    } else {
                        throw convertedException295;
                    }
                } finally {
                    function_error_reporting.f.env(env).call(scope.errorLevel);
                }
            }

            if (ZVal.isTrue(scope.fresh)) {
                throw new IncludeEventException(null);
            }

            if (ZVal.isTrue(this.debug)) {
                scope.collectedLogs.setObject(ZVal.newArray());
                scope.previousHandler.setObject(
                        function_defined.f.env(env).call("PHPUNIT_COMPOSER_INSTALL").value());
                scope.previousHandler.setObject(
                        ZVal.assign(
                                ZVal.isTrue(
                                                scope.ternaryExpressionTemp =
                                                        scope.previousHandler.getObject())
                                        ? scope.ternaryExpressionTemp
                                        : function_set_error_handler
                                                .f
                                                .env(env)
                                                .call(
                                                        new Closure(
                                                                env,
                                                                runtimeConverterFunctionClassConstants,
                                                                "Symfony\\Component\\HttpKernel",
                                                                this) {
                                                            @Override
                                                            @ConvertedMethod
                                                            @ConvertedParameter(
                                                                index = 0,
                                                                name = "type"
                                                            )
                                                            @ConvertedParameter(
                                                                index = 1,
                                                                name = "message"
                                                            )
                                                            @ConvertedParameter(
                                                                index = 2,
                                                                name = "file"
                                                            )
                                                            @ConvertedParameter(
                                                                index = 3,
                                                                name = "line"
                                                            )
                                                            public Object run(
                                                                    RuntimeEnv env,
                                                                    Object thisvar,
                                                                    PassByReferenceArgs
                                                                            runtimePassByReferenceArgs,
                                                                    Object... args) {
                                                                int runtimeConverterBreakCount;
                                                                ReferenceContainer type =
                                                                        new BasicReferenceContainer(
                                                                                assignParameter(
                                                                                        args, 0,
                                                                                        false));
                                                                ReferenceContainer message =
                                                                        new BasicReferenceContainer(
                                                                                assignParameter(
                                                                                        args, 1,
                                                                                        false));
                                                                ReferenceContainer file =
                                                                        new BasicReferenceContainer(
                                                                                assignParameter(
                                                                                        args, 2,
                                                                                        false));
                                                                ReferenceContainer line =
                                                                        new BasicReferenceContainer(
                                                                                assignParameter(
                                                                                        args, 3,
                                                                                        false));
                                                                ReferenceContainer backtrace =
                                                                        new BasicReferenceContainer(
                                                                                null);
                                                                ReferenceContainer collectedLogs =
                                                                        new BasicReferenceContainer(
                                                                                null);
                                                                ReferenceContainer i =
                                                                        new BasicReferenceContainer(
                                                                                null);
                                                                ReferenceContainer previousHandler =
                                                                        new BasicReferenceContainer(
                                                                                null);
                                                                collectedLogs =
                                                                        this.contextReferences
                                                                                .getReferenceContainer(
                                                                                        "collectedLogs");
                                                                previousHandler =
                                                                        this.contextReferences
                                                                                .getReferenceContainer(
                                                                                        "previousHandler");
                                                                if (ZVal.toBool(
                                                                                ZVal
                                                                                        .strictNotEqualityCheck(
                                                                                                16384,
                                                                                                "!==",
                                                                                                type
                                                                                                        .getObject()))
                                                                        && ZVal.toBool(
                                                                                ZVal
                                                                                        .strictNotEqualityCheck(
                                                                                                8192,
                                                                                                "!==",
                                                                                                type
                                                                                                        .getObject()))) {
                                                                    return ZVal.assign(
                                                                            ZVal.isTrue(
                                                                                            previousHandler
                                                                                                    .getObject())
                                                                                    ? env.callFunctionDynamic(
                                                                                                    previousHandler
                                                                                                            .getObject(),
                                                                                                    new RuntimeArgsWithReferences()
                                                                                                            .add(
                                                                                                                    0,
                                                                                                                    type)
                                                                                                            .add(
                                                                                                                    1,
                                                                                                                    message)
                                                                                                            .add(
                                                                                                                    2,
                                                                                                                    file)
                                                                                                            .add(
                                                                                                                    3,
                                                                                                                    line),
                                                                                                    type
                                                                                                            .getObject(),
                                                                                                    message
                                                                                                            .getObject(),
                                                                                                    file
                                                                                                            .getObject(),
                                                                                                    line
                                                                                                            .getObject())
                                                                                            .value()
                                                                                    : false);
                                                                }

                                                                if (arrayActionR(
                                                                        ArrayAction.ISSET,
                                                                        collectedLogs,
                                                                        env,
                                                                        message.getObject())) {
                                                                    collectedLogs
                                                                            .arrayAccess(
                                                                                    env,
                                                                                    message
                                                                                            .getObject(),
                                                                                    "count")
                                                                            .set(
                                                                                    ZVal.increment(
                                                                                            collectedLogs
                                                                                                    .arrayGet(
                                                                                                            env,
                                                                                                            message
                                                                                                                    .getObject(),
                                                                                                            "count")));
                                                                    return null;
                                                                }

                                                                backtrace.setObject(
                                                                        NamespaceGlobal
                                                                                .debug_backtrace
                                                                                .env(env)
                                                                                .call(2, 3)
                                                                                .value());
                                                                runtimeConverterBreakCount = 0;
                                                                for (i.setObject(0);
                                                                        arrayActionR(
                                                                                ArrayAction.ISSET,
                                                                                backtrace,
                                                                                env,
                                                                                i.getObject());
                                                                        i.setObject(
                                                                                ZVal.increment(
                                                                                        i
                                                                                                .getObject()))) {
                                                                    if (ZVal.toBool(
                                                                                    ZVal.toBool(
                                                                                                    ZVal
                                                                                                                    .toBool(
                                                                                                                            arrayActionR(
                                                                                                                                    ArrayAction
                                                                                                                                            .ISSET,
                                                                                                                                    backtrace,
                                                                                                                                    env,
                                                                                                                                    i
                                                                                                                                            .getObject(),
                                                                                                                                    "file"))
                                                                                                            && ZVal
                                                                                                                    .toBool(
                                                                                                                            arrayActionR(
                                                                                                                                    ArrayAction
                                                                                                                                            .ISSET,
                                                                                                                                    backtrace,
                                                                                                                                    env,
                                                                                                                                    i
                                                                                                                                            .getObject(),
                                                                                                                                    "line")))
                                                                                            && ZVal
                                                                                                    .toBool(
                                                                                                            ZVal
                                                                                                                    .strictEqualityCheck(
                                                                                                                            backtrace
                                                                                                                                    .arrayGet(
                                                                                                                                            env,
                                                                                                                                            i
                                                                                                                                                    .getObject(),
                                                                                                                                            "line"),
                                                                                                                            "===",
                                                                                                                            line
                                                                                                                                    .getObject())))
                                                                            && ZVal.toBool(
                                                                                    ZVal
                                                                                            .strictEqualityCheck(
                                                                                                    backtrace
                                                                                                            .arrayGet(
                                                                                                                    env,
                                                                                                                    i
                                                                                                                            .getObject(),
                                                                                                                    "file"),
                                                                                                    "===",
                                                                                                    file
                                                                                                            .getObject()))) {
                                                                        backtrace.setObject(
                                                                                function_array_slice
                                                                                        .f
                                                                                        .env(env)
                                                                                        .call(
                                                                                                backtrace
                                                                                                        .getObject(),
                                                                                                ZVal
                                                                                                        .add(
                                                                                                                1,
                                                                                                                i
                                                                                                                        .getObject()))
                                                                                        .value());
                                                                        break;
                                                                    }
                                                                }

                                                                collectedLogs
                                                                        .arrayAccess(
                                                                                env,
                                                                                message.getObject())
                                                                        .set(
                                                                                ZVal.newArray(
                                                                                        new ZPair(
                                                                                                "type",
                                                                                                type
                                                                                                        .getObject()),
                                                                                        new ZPair(
                                                                                                "message",
                                                                                                message
                                                                                                        .getObject()),
                                                                                        new ZPair(
                                                                                                "file",
                                                                                                file
                                                                                                        .getObject()),
                                                                                        new ZPair(
                                                                                                "line",
                                                                                                line
                                                                                                        .getObject()),
                                                                                        new ZPair(
                                                                                                "trace",
                                                                                                backtrace
                                                                                                        .getObject()),
                                                                                        new ZPair(
                                                                                                "count",
                                                                                                1)));
                                                                return null;
                                                            }
                                                        }.useRef(
                                                                        "collectedLogs",
                                                                        scope.collectedLogs)
                                                                .useRef(
                                                                        "previousHandler",
                                                                        scope.previousHandler))
                                                .value()));
            }

            try {
                scope.container = ZVal.getNull();
                scope.container = this.buildContainer(env);
                env.callMethod(scope.container, "compile", Kernel.class);
            } catch (ConvertedException convertedException296) {

                throw convertedException296;
            } finally {
                if (ZVal.toBool(this.debug)
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        true, "!==", scope.previousHandler.getObject()))) {
                    function_restore_error_handler.f.env(env).call();
                    NamespaceGlobal.file_put_contents
                            .env(env)
                            .call(
                                    toStringR(scope.cacheDir, env)
                                            + "/"
                                            + toStringR(scope._pClass, env)
                                            + "Deprecations.log",
                                    function_serialize
                                            .f
                                            .env(env)
                                            .call(
                                                    function_array_values
                                                            .f
                                                            .env(env)
                                                            .call(scope.collectedLogs.getObject())
                                                            .value())
                                            .value());
                    NamespaceGlobal.file_put_contents
                            .env(env)
                            .call(
                                    toStringR(scope.cacheDir, env)
                                            + "/"
                                            + toStringR(scope._pClass, env)
                                            + "Compiler.log",
                                    ZVal.strictNotEqualityCheck(
                                                    ZVal.getNull(), "!==", scope.container)
                                            ? NamespaceGlobal.implode
                                                    .env(env)
                                                    .call(
                                                            "\n",
                                                            env.callMethod(
                                                                    env.callMethod(
                                                                            scope.container,
                                                                            "getCompiler",
                                                                            Kernel.class),
                                                                    "getLog",
                                                                    Kernel.class))
                                                    .value()
                                            : "");
                }
            }

            if (ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", scope.oldContainer))
                    && ZVal.toBool(
                            function_file_exists
                                    .f
                                    .env(env)
                                    .call(env.callMethod(scope.cache, "getPath", Kernel.class))
                                    .value())) {
                scope.errorLevel =
                        function_error_reporting
                                .f
                                .env(env)
                                .call(ZVal.toLong(32767) ^ ZVal.toLong(2))
                                .value();
                try {
                    scope.oldContainer =
                            ZVal.assign(
                                    env.include(
                                            toStringR(
                                                    env.callMethod(
                                                            scope.cache, "getPath", Kernel.class),
                                                    env),
                                            stack,
                                            runtimeConverterFunctionClassConstants,
                                            false,
                                            false));
                } catch (ConvertedException convertedException297) {
                    if (convertedException297.instanceOf(Throwable.class, "Throwable")) {
                        scope.e = convertedException297.getObject();
                    } else if (convertedException297.instanceOf(PHPException.class, "Exception")) {
                        scope.e = convertedException297.getObject();
                    } else {
                        throw convertedException297;
                    }
                } finally {
                    function_error_reporting.f.env(env).call(scope.errorLevel);
                }
            }

            scope.oldContainer =
                    ZVal.assign(
                            function_is_object.f.env(env).call(scope.oldContainer).getBool()
                                    ? new ReflectionClass(env, scope.oldContainer)
                                    : false);
            this.dumpContainer(
                    env,
                    scope.cache,
                    scope.container,
                    scope._pClass,
                    this.getContainerBaseClass(env));
            this.container =
                    env.include(
                            toStringR(env.callMethod(scope.cache, "getPath", Kernel.class), env),
                            stack,
                            runtimeConverterFunctionClassConstants,
                            true,
                            false);
            env.callMethod(this.container, "set", Kernel.class, "kernel", scope._thisVarAlias);
            if (ZVal.toBool(scope.oldContainer)
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    function_get_class.f.env(env).call(this.container).value(),
                                    "!==",
                                    toObjectR(scope.oldContainer)
                                            .accessProp(this, env)
                                            .name("name")
                                            .value()))) {
                scope.legacyContainers = env.getInlineStatic(29, ZVal.newArray());
                scope.oldContainerDir =
                        function_dirname
                                .f
                                .env(env)
                                .call(
                                        env.callMethod(
                                                scope.oldContainer, "getFileName", Kernel.class))
                                .value();
                scope.legacyContainers
                        .arrayAccess(env, toStringR(scope.oldContainerDir, env) + ".legacy")
                        .set(true);
                for (ZPair zpairResult1971 :
                        ZVal.getIterable(
                                NamespaceGlobal.glob
                                        .env(env)
                                        .call(
                                                toStringR(
                                                                function_dirname
                                                                        .f
                                                                        .env(env)
                                                                        .call(scope.oldContainerDir)
                                                                        .value(),
                                                                env)
                                                        + toStringR("/", env)
                                                        + "*.legacy")
                                        .value(),
                                env,
                                true)) {
                    scope.legacyContainer = ZVal.assign(zpairResult1971.getValue());
                    if (ZVal.toBool(
                                    !arrayActionR(
                                            ArrayAction.ISSET,
                                            scope.legacyContainers,
                                            env,
                                            scope.legacyContainer))
                            && ZVal.toBool(
                                    NamespaceGlobal.unlink
                                            .env(env)
                                            .call(scope.legacyContainer)
                                            .value())) {
                        env.callMethod(
                                env.createNew(ZVal.resolveClassAlias(env, "Filesystem")),
                                "remove",
                                Kernel.class,
                                function_substr
                                        .f
                                        .env(env)
                                        .call(scope.legacyContainer, 0, -7)
                                        .value());
                    }
                }

                NamespaceGlobal.touch
                        .env(env)
                        .call(toStringR(scope.oldContainerDir, env) + ".legacy");
            }

            if (ZVal.isTrue(env.callMethod(this.container, "has", Kernel.class, "cache_warmer"))) {
                env.callMethod(
                        env.callMethod(this.container, "get", Kernel.class, "cache_warmer"),
                        "warmUp",
                        Kernel.class,
                        env.callMethod(
                                this.container, "getParameter", Kernel.class, "kernel.cache_dir"));
            }

            throw new IncludeEventException(null);
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    protected Object getKernelParameters(RuntimeEnv env, Object... args) {
        Object cacheDir = null;
        ReferenceContainer bundles = new BasicReferenceContainer(null);
        ReferenceContainer bundlesMetadata = new BasicReferenceContainer(null);
        Object name = null;
        Object ternaryExpressionTemp = null;
        Object bundle = null;
        bundles.setObject(ZVal.newArray());
        bundlesMetadata.setObject(ZVal.newArray());
        for (ZPair zpairResult1972 : ZVal.getIterable(this.bundles, env, false)) {
            name = ZVal.assign(zpairResult1972.getKey());
            bundle = ZVal.assign(zpairResult1972.getValue());
            bundles.arrayAccess(env, name).set(function_get_class.f.env(env).call(bundle).value());
            bundlesMetadata
                    .arrayAccess(env, name)
                    .set(
                            ZVal.newArray(
                                    new ZPair(
                                            "path",
                                            env.callMethod(bundle, "getPath", Kernel.class)),
                                    new ZPair(
                                            "namespace",
                                            env.callMethod(bundle, "getNamespace", Kernel.class))));
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "kernel.root_dir",
                                ZVal.isTrue(
                                                ternaryExpressionTemp =
                                                        function_realpath
                                                                .f
                                                                .env(env)
                                                                .call(this.rootDir)
                                                                .value())
                                        ? ternaryExpressionTemp
                                        : this.rootDir),
                        new ZPair(
                                "kernel.project_dir",
                                ZVal.isTrue(
                                                ternaryExpressionTemp =
                                                        function_realpath
                                                                .f
                                                                .env(env)
                                                                .call(this.getProjectDir(env))
                                                                .value())
                                        ? ternaryExpressionTemp
                                        : this.getProjectDir(env)),
                        new ZPair("kernel.environment", this.environment),
                        new ZPair("kernel.debug", this.debug),
                        new ZPair("kernel.name", this.name),
                        new ZPair(
                                "kernel.cache_dir",
                                ZVal.isTrue(
                                                ternaryExpressionTemp =
                                                        function_realpath
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        cacheDir =
                                                                                ZVal.assign(
                                                                                        ZVal.isTrue(
                                                                                                        ternaryExpressionTemp =
                                                                                                                this
                                                                                                                        .warmupDir)
                                                                                                ? ternaryExpressionTemp
                                                                                                : this
                                                                                                        .getCacheDir(
                                                                                                                env)))
                                                                .value())
                                        ? ternaryExpressionTemp
                                        : cacheDir),
                        new ZPair(
                                "kernel.logs_dir",
                                ZVal.isTrue(
                                                ternaryExpressionTemp =
                                                        function_realpath
                                                                .f
                                                                .env(env)
                                                                .call(this.getLogDir(env))
                                                                .value())
                                        ? ternaryExpressionTemp
                                        : this.getLogDir(env)),
                        new ZPair("kernel.bundles", bundles.getObject()),
                        new ZPair("kernel.bundles_metadata", bundlesMetadata.getObject()),
                        new ZPair("kernel.charset", this.getCharset(env)),
                        new ZPair("kernel.container_class", this.getContainerClass(env))));
    }

    @ConvertedMethod
    protected Object buildContainer(RuntimeEnv env, Object... args) {
        Object container = null;
        Object name = null;
        Object ternaryExpressionTemp = null;
        Object dir = null;
        Object cont = null;
        for (ZPair zpairResult1973 :
                ZVal.getIterable(
                        ZVal.newArray(
                                new ZPair(
                                        "cache",
                                        ZVal.isTrue(ternaryExpressionTemp = this.warmupDir)
                                                ? ternaryExpressionTemp
                                                : this.getCacheDir(env)),
                                new ZPair("logs", this.getLogDir(env))),
                        env,
                        false)) {
            name = ZVal.assign(zpairResult1973.getKey());
            dir = ZVal.assign(zpairResult1973.getValue());
            if (!function_is_dir.f.env(env).call(dir).getBool()) {
                if (ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        false,
                                        "===",
                                        NamespaceGlobal.mkdir
                                                .env(env)
                                                .call(dir, 511, true)
                                                .value()))
                        && ZVal.toBool(!function_is_dir.f.env(env).call(dir).getBool())) {
                    throw ZVal.getException(
                            env,
                            new RuntimeException(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "Unable to create the %s directory (%s)\n",
                                                    name, dir)
                                            .value()));
                }

            } else if (!NamespaceGlobal.is_writable.env(env).call(dir).getBool()) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Unable to write in the %s directory (%s)\n",
                                                name, dir)
                                        .value()));
            }
        }

        container = this.getContainerBuilder(env);
        env.callMethod(container, "addObjectResource", Kernel.class, this);
        this.prepareContainer(env, container);
        if (ZVal.strictNotEqualityCheck(
                ZVal.getNull(),
                "!==",
                cont =
                        env.callMethod(
                                this,
                                "registerContainerConfiguration",
                                Kernel.class,
                                this.getContainerLoader(env, container)))) {
            env.callMethod(container, "merge", Kernel.class, cont);
        }

        env.callMethod(
                container,
                "addCompilerPass",
                Kernel.class,
                new AddAnnotatedClassesToCachePass(env, this));
        return ZVal.assign(container);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Symfony\\Component\\DependencyInjection\\ContainerBuilder"
    )
    protected Object prepareContainer(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        ReferenceContainer extensions = new BasicReferenceContainer(null);
        Object extension = null;
        Object bundle = null;
        extensions.setObject(ZVal.newArray());
        for (ZPair zpairResult1974 : ZVal.getIterable(this.bundles, env, true)) {
            bundle = ZVal.assign(zpairResult1974.getValue());
            if (ZVal.isTrue(
                    extension = env.callMethod(bundle, "getContainerExtension", Kernel.class))) {
                env.callMethod(container, "registerExtension", Kernel.class, extension);
            }

            if (ZVal.isTrue(this.debug)) {
                env.callMethod(container, "addObjectResource", Kernel.class, bundle);
            }
        }

        for (ZPair zpairResult1975 : ZVal.getIterable(this.bundles, env, true)) {
            bundle = ZVal.assign(zpairResult1975.getValue());
            env.callMethod(bundle, "build", Kernel.class, container);
        }

        this.build(env, container);
        for (ZPair zpairResult1976 :
                ZVal.getIterable(
                        env.callMethod(container, "getExtensions", Kernel.class), env, true)) {
            extension = ZVal.assign(zpairResult1976.getValue());
            extensions.arrayAppend(env).set(env.callMethod(extension, "getAlias", Kernel.class));
        }

        env.callMethod(
                env.callMethod(container, "getCompilerPassConfig", Kernel.class),
                "setMergePass",
                Kernel.class,
                new MergeExtensionConfigurationPass(env, extensions.getObject()));
        return null;
    }

    @ConvertedMethod
    protected Object getContainerBuilder(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object container = null;
        container = env.createNew(ZVal.resolveClassAlias(env, "ContainerBuilder"));
        env.callMethod(
                env.callMethod(container, "getParameterBag", Kernel.class),
                rLastRefArgs =
                        new RuntimeArgsWithReferences()
                                .add(0, handleReturnReference(this.getKernelParameters(env))),
                "add",
                Kernel.class,
                rLastRefArgs.get(0));
        if (ZVal.isTrue(ZVal.checkInstanceType(this, (Class) null, "CompilerPassInterface", env))) {
            env.callMethod(
                    container,
                    "addCompilerPass",
                    Kernel.class,
                    this,
                    ClassConstantUtils.getConstantValueByClass(
                            env,
                            ZVal.resolveClassAlias(env, "PassConfig"),
                            "TYPE_BEFORE_OPTIMIZATION"),
                    -10000);
        }

        if (ZVal.toBool(
                        function_class_exists
                                .f
                                .env(env)
                                .call("ProxyManager\\Configuration")
                                .value())
                && ZVal.toBool(
                        function_class_exists
                                .f
                                .env(env)
                                .call(
                                        "Symfony\\Bridge\\ProxyManager\\LazyProxy\\Instantiator\\RuntimeInstantiator")
                                .value())) {
            env.callMethod(
                    container,
                    "setProxyInstantiator",
                    Kernel.class,
                    env.createNew(ZVal.resolveClassAlias(env, "RuntimeInstantiator")));
        }

        return ZVal.assign(container);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "cache",
        typeHint = "Symfony\\Component\\Config\\ConfigCache"
    )
    @ConvertedParameter(
        index = 1,
        name = "container",
        typeHint = "Symfony\\Component\\DependencyInjection\\ContainerBuilder"
    )
    @ConvertedParameter(index = 2, name = "class")
    @ConvertedParameter(index = 3, name = "baseClass")
    protected Object dumpContainer(RuntimeEnv env, Object... args) {
        Object cache = assignParameter(args, 0, false);
        Object container = assignParameter(args, 1, false);
        Object _pClass = assignParameter(args, 2, false);
        Object baseClass = assignParameter(args, 3, false);
        Object file = null;
        Object code = null;
        Object dumper = null;
        Object rootCode = null;
        Object dir = null;
        Object fs = null;
        Object content = null;
        dumper = env.createNew(ZVal.resolveClassAlias(env, "PhpDumper"), container);
        if (ZVal.toBool(
                        function_class_exists
                                .f
                                .env(env)
                                .call("ProxyManager\\Configuration")
                                .value())
                && ZVal.toBool(
                        function_class_exists
                                .f
                                .env(env)
                                .call(
                                        "Symfony\\Bridge\\ProxyManager\\LazyProxy\\PhpDumper\\ProxyDumper")
                                .value())) {
            env.callMethod(
                    dumper,
                    "setProxyDumper",
                    Kernel.class,
                    env.createNew(ZVal.resolveClassAlias(env, "ProxyDumper")));
        }

        content =
                env.callMethod(
                        dumper,
                        "dump",
                        Kernel.class,
                        ZVal.newArray(
                                new ZPair("class", _pClass),
                                new ZPair("base_class", baseClass),
                                new ZPair("file", env.callMethod(cache, "getPath", Kernel.class)),
                                new ZPair("as_files", true),
                                new ZPair("debug", this.debug),
                                new ZPair(
                                        "build_time",
                                        ZVal.isTrue(
                                                        env.callMethod(
                                                                container,
                                                                "hasParameter",
                                                                Kernel.class,
                                                                "kernel.container_build_time"))
                                                ? env.callMethod(
                                                        container,
                                                        "getParameter",
                                                        Kernel.class,
                                                        "kernel.container_build_time")
                                                : NamespaceGlobal.time.env(env).call().value())));
        rootCode = function_array_pop.f.env(env).call(content).value();
        dir =
                toStringR(
                                function_dirname
                                        .f
                                        .env(env)
                                        .call(env.callMethod(cache, "getPath", Kernel.class))
                                        .value(),
                                env)
                        + "/";
        fs = env.createNew(ZVal.resolveClassAlias(env, "Filesystem"));
        for (ZPair zpairResult1977 : ZVal.getIterable(content, env, false)) {
            file = ZVal.assign(zpairResult1977.getKey());
            code = ZVal.assign(zpairResult1977.getValue());
            env.callMethod(
                    fs, "dumpFile", Kernel.class, toStringR(dir, env) + toStringR(file, env), code);
            NamespaceGlobal.chmod
                    .env(env)
                    .call(
                            toStringR(dir, env) + toStringR(file, env),
                            ZVal.toLong(438)
                                    & ZVal.toLong(
                                            ~ZVal.toLong(
                                                    NamespaceGlobal.umask.env(env).call().value())))
                    .value();
        }

        NamespaceGlobal.unlink
                .env(env)
                .call(
                        toStringR(
                                        function_dirname
                                                .f
                                                .env(env)
                                                .call(toStringR(dir, env) + toStringR(file, env))
                                                .value(),
                                        env)
                                + ".legacy")
                .value();
        env.callMethod(
                cache,
                "write",
                Kernel.class,
                rootCode,
                env.callMethod(container, "getResources", Kernel.class));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Symfony\\Component\\DependencyInjection\\ContainerInterface"
    )
    protected Object getContainerLoader(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        Object resolver = null;
        Object locator = null;
        locator = new FileLocator(env, this);
        resolver =
                env.createNew(
                        ZVal.resolveClassAlias(env, "LoaderResolver"),
                        ZVal.newArray(
                                new ZPair(
                                        0,
                                        env.createNew(
                                                ZVal.resolveClassAlias(env, "XmlFileLoader"),
                                                container,
                                                locator)),
                                new ZPair(
                                        1,
                                        env.createNew(
                                                ZVal.resolveClassAlias(env, "YamlFileLoader"),
                                                container,
                                                locator)),
                                new ZPair(
                                        2,
                                        env.createNew(
                                                ZVal.resolveClassAlias(env, "IniFileLoader"),
                                                container,
                                                locator)),
                                new ZPair(
                                        3,
                                        env.createNew(
                                                ZVal.resolveClassAlias(env, "PhpFileLoader"),
                                                container,
                                                locator)),
                                new ZPair(
                                        4,
                                        env.createNew(
                                                ZVal.resolveClassAlias(env, "GlobFileLoader"),
                                                container,
                                                locator)),
                                new ZPair(
                                        5,
                                        env.createNew(
                                                ZVal.resolveClassAlias(env, "DirectoryLoader"),
                                                container,
                                                locator)),
                                new ZPair(
                                        6,
                                        env.createNew(
                                                ZVal.resolveClassAlias(env, "ClosureLoader"),
                                                container))));
        return ZVal.assign(
                env.createNew(ZVal.resolveClassAlias(env, "DelegatingLoader"), resolver));
    }

    @ConvertedMethod
    public Object serialize(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_serialize
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair(0, this.environment), new ZPair(1, this.debug)))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    public Object unserialize(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        Object environment = null;
        Object runtimeTempArrayResult201 = null;
        Object debug = null;
        ZVal.list(
                runtimeTempArrayResult201 =
                        function_unserialize
                                .f
                                .env(env)
                                .call(data, ZVal.newArray(new ZPair("allowed_classes", false)))
                                .value(),
                (environment = listGet(runtimeTempArrayResult201, 0, env)),
                (debug = listGet(runtimeTempArrayResult201, 1, env)));
        this.__construct(env, environment, debug);
        return null;
    }

    public static final Object CONST_VERSION = "4.1.1";

    public static final Object CONST_VERSION_ID = 40101;

    public static final Object CONST_MAJOR_VERSION = 4;

    public static final Object CONST_MINOR_VERSION = 1;

    public static final Object CONST_RELEASE_VERSION = 1;

    public static final Object CONST_EXTRA_VERSION = "";

    public static final Object CONST_END_OF_MAINTENANCE = "01/2019";

    public static final Object CONST_END_OF_LIFE = "07/2019";

    public static final Object CONST_class = "Symfony\\Component\\HttpKernel\\Kernel";

    @ConvertedMethod()
    public abstract Object registerBundles(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object registerContainerConfiguration(RuntimeEnv env, Object... args);

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "source")
        public Object stripComments(RuntimeEnv env, Object... args) {
            int runtimeConverterContinueCount;
            Object source = assignParameter(args, 0, false);
            Object output = null;
            Object rawChunk = null;
            ReferenceContainer i = new BasicReferenceContainer(null);
            ReferenceContainer tokens = new BasicReferenceContainer(null);
            Object ignoreSpace = null;
            ReferenceContainer token = new BasicReferenceContainer(null);
            if (!function_function_exists.f.env(env).call("token_get_all").getBool()) {
                return ZVal.assign(source);
            }

            rawChunk = "";
            output = "";
            tokens.setObject(NamespaceGlobal.token_get_all.env(env).call(source).value());
            ignoreSpace = false;
            runtimeConverterContinueCount = 0;
            for (i.setObject(0);
                    arrayActionR(ArrayAction.ISSET, tokens, env, i.getObject());
                    i.setObject(ZVal.increment(i.getObject()))) {
                token.setObject(ZVal.assign(tokens.arrayGet(env, i.getObject())));
                if (ZVal.toBool(!arrayActionR(ArrayAction.ISSET, token, env, 1))
                        || ZVal.toBool(ZVal.strictEqualityCheck("b\"", "===", token.getObject()))) {
                    rawChunk = toStringR(rawChunk, env) + toStringR(token.getObject(), env);

                } else if (ZVal.strictEqualityCheck(383, "===", token.arrayGet(env, 0))) {
                    output =
                            toStringR(output, env)
                                    + toStringR(rawChunk, env)
                                    + toStringR(token.arrayGet(env, 1), env);
                    runtimeConverterContinueCount = 0;
                    do {
                        token.setObject(ZVal.assign(tokens.arrayGet(env, ZVal.preIncrement(i))));
                        output =
                                toStringR(output, env)
                                        + toStringR(
                                                ZVal.toBool(
                                                                        arrayActionR(
                                                                                ArrayAction.ISSET,
                                                                                token,
                                                                                env,
                                                                                1))
                                                                && ZVal.toBool(
                                                                        ZVal.strictNotEqualityCheck(
                                                                                "b\"",
                                                                                "!==",
                                                                                token.getObject()))
                                                        ? token.arrayGet(env, 1)
                                                        : token.getObject(),
                                                env);

                    } while (ZVal.strictNotEqualityCheck(384, "!==", token.arrayGet(env, 0)));

                    rawChunk = "";

                } else if (ZVal.strictEqualityCheck(382, "===", token.arrayGet(env, 0))) {
                    if (ZVal.isTrue(ignoreSpace)) {
                        ignoreSpace = false;
                        continue;
                    }

                    rawChunk =
                            toStringR(rawChunk, env)
                                    + toStringR(
                                            function_preg_replace
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            ZVal.arrayFromList("/\\n{2,}/S"),
                                                            "\n",
                                                            token.arrayGet(env, 1))
                                                    .value(),
                                            env);

                } else if (function_in_array
                        .f
                        .env(env)
                        .call(
                                token.arrayGet(env, 0),
                                ZVal.newArray(new ZPair(0, 377), new ZPair(1, 378)))
                        .getBool()) {
                    ignoreSpace = true;

                } else {
                    rawChunk = toStringR(rawChunk, env) + toStringR(token.arrayGet(env, 1), env);
                    if (ZVal.strictEqualityCheck(379, "===", token.arrayGet(env, 0))) {
                        ignoreSpace = true;
                    }
                }
            }

            output = toStringR(output, env) + toStringR(rawChunk, env);
            tokens.setObject(null);
            rawChunk = null;
            NamespaceGlobal.gc_mem_caches.env(env).call();
            return ZVal.assign(output);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\Kernel")
                    .setLookup(
                            Kernel.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "booted",
                            "bundles",
                            "container",
                            "debug",
                            "environment",
                            "name",
                            "projectDir",
                            "requestStackSize",
                            "resetServices",
                            "rootDir",
                            "startTime",
                            "warmupDir")
                    .setFilename("vendor/symfony/http-kernel/Kernel.php")
                    .addInterface("Symfony\\Component\\HttpKernel\\KernelInterface")
                    .addInterface("Symfony\\Component\\HttpKernel\\HttpKernelInterface")
                    .addInterface("Serializable")
                    .addInterface("Symfony\\Component\\HttpKernel\\RebootableInterface")
                    .addInterface("Symfony\\Component\\HttpKernel\\TerminableInterface")
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

    private static class Scope66 implements UpdateRuntimeScopeInterface {

        Object container;
        Object cacheDir;
        Object cache;
        Object e;
        Object oldContainerDir;
        Object _thisVarAlias;
        Object ternaryExpressionTemp;
        Object legacyContainer;
        Object errorLevel;
        ReferenceContainer collectedLogs;
        ReferenceContainer legacyContainers;
        Object fresh;
        Object _pClass;
        ReferenceContainer previousHandler;
        Object oldContainer;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("container", this.container);
            stack.setVariable("cacheDir", this.cacheDir);
            stack.setVariable("cache", this.cache);
            stack.setVariable("e", this.e);
            stack.setVariable("oldContainerDir", this.oldContainerDir);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("ternaryExpressionTemp", this.ternaryExpressionTemp);
            stack.setVariable("legacyContainer", this.legacyContainer);
            stack.setVariable("errorLevel", this.errorLevel);
            stack.setVariable("collectedLogs", this.collectedLogs);
            stack.setVariable("legacyContainers", this.legacyContainers);
            stack.setVariable("fresh", this.fresh);
            stack.setVariable("class", this._pClass);
            stack.setVariable("previousHandler", this.previousHandler);
            stack.setVariable("oldContainer", this.oldContainer);
        }

        public void updateScope(RuntimeStack stack) {

            this.container = stack.getVariable("container");
            this.cacheDir = stack.getVariable("cacheDir");
            this.cache = stack.getVariable("cache");
            this.e = stack.getVariable("e");
            this.oldContainerDir = stack.getVariable("oldContainerDir");
            this._thisVarAlias = stack.getVariable("this");
            this.ternaryExpressionTemp = stack.getVariable("ternaryExpressionTemp");
            this.legacyContainer = stack.getVariable("legacyContainer");
            this.errorLevel = stack.getVariable("errorLevel");
            this.collectedLogs = ZVal.getStackReference(stack.getVariable("collectedLogs"));
            this.legacyContainers = ZVal.getStackReference(stack.getVariable("legacyContainers"));
            this.fresh = stack.getVariable("fresh");
            this._pClass = stack.getVariable("class");
            this.previousHandler = ZVal.getStackReference(stack.getVariable("previousHandler"));
            this.oldContainer = stack.getVariable("oldContainer");
        }
    }

    private static class Scope67 implements UpdateRuntimeScopeInterface {

        Object container;
        Object cacheDir;
        Object cache;
        Object e;
        Object oldContainerDir;
        Object _thisVarAlias;
        Object ternaryExpressionTemp;
        Object legacyContainer;
        Object errorLevel;
        ReferenceContainer collectedLogs;
        ReferenceContainer legacyContainers;
        Object fresh;
        Object _pClass;
        ReferenceContainer previousHandler;
        Object oldContainer;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("container", this.container);
            stack.setVariable("cacheDir", this.cacheDir);
            stack.setVariable("cache", this.cache);
            stack.setVariable("e", this.e);
            stack.setVariable("oldContainerDir", this.oldContainerDir);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("ternaryExpressionTemp", this.ternaryExpressionTemp);
            stack.setVariable("legacyContainer", this.legacyContainer);
            stack.setVariable("errorLevel", this.errorLevel);
            stack.setVariable("collectedLogs", this.collectedLogs);
            stack.setVariable("legacyContainers", this.legacyContainers);
            stack.setVariable("fresh", this.fresh);
            stack.setVariable("class", this._pClass);
            stack.setVariable("previousHandler", this.previousHandler);
            stack.setVariable("oldContainer", this.oldContainer);
        }

        public void updateScope(RuntimeStack stack) {

            this.container = stack.getVariable("container");
            this.cacheDir = stack.getVariable("cacheDir");
            this.cache = stack.getVariable("cache");
            this.e = stack.getVariable("e");
            this.oldContainerDir = stack.getVariable("oldContainerDir");
            this._thisVarAlias = stack.getVariable("this");
            this.ternaryExpressionTemp = stack.getVariable("ternaryExpressionTemp");
            this.legacyContainer = stack.getVariable("legacyContainer");
            this.errorLevel = stack.getVariable("errorLevel");
            this.collectedLogs = ZVal.getStackReference(stack.getVariable("collectedLogs"));
            this.legacyContainers = ZVal.getStackReference(stack.getVariable("legacyContainers"));
            this.fresh = stack.getVariable("fresh");
            this._pClass = stack.getVariable("class");
            this.previousHandler = ZVal.getStackReference(stack.getVariable("previousHandler"));
            this.oldContainer = stack.getVariable("oldContainer");
        }
    }

    private static class Scope68 implements UpdateRuntimeScopeInterface {

        Object container;
        Object cacheDir;
        Object cache;
        Object e;
        Object oldContainerDir;
        Object _thisVarAlias;
        Object ternaryExpressionTemp;
        Object legacyContainer;
        Object errorLevel;
        ReferenceContainer collectedLogs;
        ReferenceContainer legacyContainers;
        Object fresh;
        Object _pClass;
        ReferenceContainer previousHandler;
        Object oldContainer;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("container", this.container);
            stack.setVariable("cacheDir", this.cacheDir);
            stack.setVariable("cache", this.cache);
            stack.setVariable("e", this.e);
            stack.setVariable("oldContainerDir", this.oldContainerDir);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("ternaryExpressionTemp", this.ternaryExpressionTemp);
            stack.setVariable("legacyContainer", this.legacyContainer);
            stack.setVariable("errorLevel", this.errorLevel);
            stack.setVariable("collectedLogs", this.collectedLogs);
            stack.setVariable("legacyContainers", this.legacyContainers);
            stack.setVariable("fresh", this.fresh);
            stack.setVariable("class", this._pClass);
            stack.setVariable("previousHandler", this.previousHandler);
            stack.setVariable("oldContainer", this.oldContainer);
        }

        public void updateScope(RuntimeStack stack) {

            this.container = stack.getVariable("container");
            this.cacheDir = stack.getVariable("cacheDir");
            this.cache = stack.getVariable("cache");
            this.e = stack.getVariable("e");
            this.oldContainerDir = stack.getVariable("oldContainerDir");
            this._thisVarAlias = stack.getVariable("this");
            this.ternaryExpressionTemp = stack.getVariable("ternaryExpressionTemp");
            this.legacyContainer = stack.getVariable("legacyContainer");
            this.errorLevel = stack.getVariable("errorLevel");
            this.collectedLogs = ZVal.getStackReference(stack.getVariable("collectedLogs"));
            this.legacyContainers = ZVal.getStackReference(stack.getVariable("legacyContainers"));
            this.fresh = stack.getVariable("fresh");
            this._pClass = stack.getVariable("class");
            this.previousHandler = ZVal.getStackReference(stack.getVariable("previousHandler"));
            this.oldContainer = stack.getVariable("oldContainer");
        }
    }
}
