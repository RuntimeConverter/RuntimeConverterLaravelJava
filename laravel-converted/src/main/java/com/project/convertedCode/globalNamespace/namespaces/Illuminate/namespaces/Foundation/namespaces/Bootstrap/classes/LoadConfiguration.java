package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Bootstrap.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_ksort;
import com.runtimeconverter.runtime.nativeFunctions.file.function_realpath;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.classes.Finder;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.RuntimeStack;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Config.classes.Repository;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Bootstrap/LoadConfiguration.php

*/

public class LoadConfiguration extends RuntimeClassBase {

    public LoadConfiguration(RuntimeEnv env, Object... args) {
        super(env);
    }

    public LoadConfiguration(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "app",
        typeHint = "Illuminate\\Contracts\\Foundation\\Application"
    )
    public Object bootstrap(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope19 scope = new Scope19();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Bootstrap")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Foundation/Bootstrap/LoadConfiguration.php");
            scope.app = assignParameter(args, 0, false);
            scope.cached = null;
            scope.items = null;
            scope.loadedFromCache = null;
            scope.config = null;
            scope.items = ZVal.newArray();
            if (function_file_exists
                    .f
                    .env(env)
                    .call(
                            scope.cached =
                                    env.callMethod(
                                            scope.app,
                                            "getCachedConfigPath",
                                            LoadConfiguration.class))
                    .getBool()) {
                scope.items =
                        ZVal.assign(
                                env.include(
                                        toStringR(scope.cached, env),
                                        stack,
                                        runtimeConverterFunctionClassConstants,
                                        true,
                                        false));
                scope.loadedFromCache = true;
            }

            env.callMethod(
                    scope.app,
                    "instance",
                    LoadConfiguration.class,
                    "config",
                    scope.config = new Repository(env, scope.items));
            if (!ZVal.isset(scope.loadedFromCache)) {
                this.loadConfigurationFiles(env, scope.app, scope.config);
            }

            env.callMethod(
                    scope.app,
                    "detectEnvironment",
                    LoadConfiguration.class,
                    new Closure(
                            env,
                            runtimeConverterFunctionClassConstants,
                            "Illuminate\\Foundation\\Bootstrap",
                            this) {
                        @Override
                        @ConvertedMethod
                        public Object run(
                                RuntimeEnv env,
                                Object thisvar,
                                PassByReferenceArgs runtimePassByReferenceArgs,
                                Object... args) {
                            Object config = null;
                            config = this.contextReferences.getCapturedValue("config");
                            return ZVal.assign(
                                    env.callMethod(
                                            config,
                                            "get",
                                            LoadConfiguration.class,
                                            "app.env",
                                            "production"));
                        }
                    }.use("config", scope.config));
            NamespaceGlobal.date_default_timezone_set
                    .env(env)
                    .call(
                            env.callMethod(
                                    scope.config,
                                    "get",
                                    LoadConfiguration.class,
                                    "app.timezone",
                                    "UTC"));
            NamespaceGlobal.mb_internal_encoding.env(env).call("UTF-8");
            throw new IncludeEventException(null);
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "app",
        typeHint = "Illuminate\\Contracts\\Foundation\\Application"
    )
    @ConvertedParameter(
        index = 1,
        name = "repository",
        typeHint = "Illuminate\\Contracts\\Config\\Repository"
    )
    protected Object loadConfigurationFiles(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope20 scope = new Scope20();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Bootstrap")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Foundation/Bootstrap/LoadConfiguration.php");
            scope.app = assignParameter(args, 0, false);
            scope.repository = assignParameter(args, 1, false);
            scope.path = null;
            scope.files = new BasicReferenceContainer(null);
            scope.key = null;
            scope.files.setObject(this.getConfigurationFiles(env, scope.app));
            if (!arrayActionR(ArrayAction.ISSET, scope.files, env, "app")) {
                throw ZVal.getException(
                        env,
                        new PHPException(env, "Unable to load the \"app\" configuration file."));
            }

            for (ZPair zpairResult399 : ZVal.getIterable(scope.files.getObject(), env, false)) {
                scope.key = ZVal.assign(zpairResult399.getKey());
                scope.path = ZVal.assign(zpairResult399.getValue());
                env.callMethod(
                        scope.repository,
                        "set",
                        LoadConfiguration.class,
                        scope.key,
                        env.include(
                                toStringR(scope.path, env),
                                stack,
                                runtimeConverterFunctionClassConstants,
                                true,
                                false));
            }

            throw new IncludeEventException(null);
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "app",
        typeHint = "Illuminate\\Contracts\\Foundation\\Application"
    )
    protected Object getConfigurationFiles(RuntimeEnv env, Object... args) {
        Object app = assignParameter(args, 0, false);
        Object file = null;
        ReferenceContainer files = new BasicReferenceContainer(null);
        Object configPath = null;
        Object directory = null;
        files.setObject(ZVal.newArray());
        configPath =
                function_realpath
                        .f
                        .env(env)
                        .call(env.callMethod(app, "configPath", LoadConfiguration.class))
                        .value();
        for (ZPair zpairResult400 :
                ZVal.getIterable(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                Finder.runtimeStaticObject.create(env),
                                                "files",
                                                LoadConfiguration.class),
                                        "name",
                                        LoadConfiguration.class,
                                        "*.php"),
                                "in",
                                LoadConfiguration.class,
                                configPath),
                        env,
                        true)) {
            file = ZVal.assign(zpairResult400.getValue());
            directory = this.getNestedDirectory(env, file, configPath);
            files.arrayAccess(
                            env,
                            toStringR(directory, env)
                                    + toStringR(
                                            NamespaceGlobal.basename
                                                    .env(env)
                                                    .call(
                                                            env.callMethod(
                                                                    file,
                                                                    "getRealPath",
                                                                    LoadConfiguration.class),
                                                            ".php")
                                                    .value(),
                                            env))
                    .set(env.callMethod(file, "getRealPath", LoadConfiguration.class));
        }

        function_ksort.f.env(env).call(files.getObject(), 6);
        return ZVal.assign(files.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file", typeHint = "SplFileInfo")
    @ConvertedParameter(index = 1, name = "configPath")
    protected Object getNestedDirectory(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        Object configPath = assignParameter(args, 1, false);
        Object directory = null;
        Object nested = null;
        directory = env.callMethod(file, "getPath", LoadConfiguration.class);
        if (ZVal.isTrue(
                nested =
                        function_trim
                                .f
                                .env(env)
                                .call(
                                        function_str_replace
                                                .f
                                                .env(env)
                                                .call(configPath, "", directory)
                                                .value(),
                                        "/")
                                .value())) {
            nested =
                    toStringR(function_str_replace.f.env(env).call("/", ".", nested).value(), env)
                            + ".";
        }

        return ZVal.assign(nested);
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Bootstrap\\LoadConfiguration";

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
                    .setName("Illuminate\\Foundation\\Bootstrap\\LoadConfiguration")
                    .setLookup(
                            LoadConfiguration.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Bootstrap/LoadConfiguration.php")
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

    private static class Scope19 implements UpdateRuntimeScopeInterface {

        Object app;
        Object cached;
        Object _thisVarAlias;
        Object items;
        Object loadedFromCache;
        Object config;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("app", this.app);
            stack.setVariable("cached", this.cached);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("items", this.items);
            stack.setVariable("loadedFromCache", this.loadedFromCache);
            stack.setVariable("config", this.config);
        }

        public void updateScope(RuntimeStack stack) {

            this.app = stack.getVariable("app");
            this.cached = stack.getVariable("cached");
            this._thisVarAlias = stack.getVariable("this");
            this.items = stack.getVariable("items");
            this.loadedFromCache = stack.getVariable("loadedFromCache");
            this.config = stack.getVariable("config");
        }
    }

    private static class Scope20 implements UpdateRuntimeScopeInterface {

        Object app;
        Object path;
        Object _thisVarAlias;
        ReferenceContainer files;
        Object repository;
        Object key;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("app", this.app);
            stack.setVariable("path", this.path);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("files", this.files);
            stack.setVariable("repository", this.repository);
            stack.setVariable("key", this.key);
        }

        public void updateScope(RuntimeStack stack) {

            this.app = stack.getVariable("app");
            this.path = stack.getVariable("path");
            this._thisVarAlias = stack.getVariable("this");
            this.files = ZVal.getStackReference(stack.getVariable("files"));
            this.repository = stack.getVariable("repository");
            this.key = stack.getVariable("key");
        }
    }
}
