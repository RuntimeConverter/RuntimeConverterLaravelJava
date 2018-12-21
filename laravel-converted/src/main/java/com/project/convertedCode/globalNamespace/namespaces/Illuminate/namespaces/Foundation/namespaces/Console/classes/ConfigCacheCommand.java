package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.RuntimeStack;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Console.classes.Kernel;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Console/ConfigCacheCommand.php

*/

public class ConfigCacheCommand extends Command {

    public Object files = null;

    public ConfigCacheCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.name = "config:cache";
        this.description = "Create a cache file for faster configuration loading";
        if (this.getClass() == ConfigCacheCommand.class) {
            this.__construct(env, args);
        }
    }

    public ConfigCacheCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "files", typeHint = "Illuminate\\Filesystem\\Filesystem")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object files = assignParameter(args, 0, false);
        super.__construct(env);
        this.files = files;
        return null;
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope24 scope = new Scope24();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Console")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Foundation/Console/ConfigCacheCommand.php");
            scope.e = null;
            scope.configPath = null;
            scope.config = null;
            env.callMethod(scope._thisVarAlias, "call", ConfigCacheCommand.class, "config:clear");
            scope.config = this.getFreshConfiguration(env);
            scope.configPath =
                    env.callMethod(
                            toObjectR(scope._thisVarAlias)
                                    .accessProp(this, env)
                                    .name("laravel")
                                    .value(),
                            "getCachedConfigPath",
                            ConfigCacheCommand.class);
            env.callMethod(
                    this.files,
                    "put",
                    ConfigCacheCommand.class,
                    scope.configPath,
                    "<?php return "
                            + toStringR(
                                    NamespaceGlobal.var_export
                                            .env(env)
                                            .call(scope.config, true)
                                            .value(),
                                    env)
                            + ";"
                            + toStringR("\n", env));
            try {
                env.include(
                        toStringR(scope.configPath, env),
                        stack,
                        runtimeConverterFunctionClassConstants,
                        true,
                        false);
            } catch (ConvertedException convertedException38) {
                if (convertedException38.instanceOf(Throwable.class, "Throwable")) {
                    scope.e = convertedException38.getObject();
                    env.callMethod(
                            this.files, "delete", ConfigCacheCommand.class, scope.configPath);
                    throw ZVal.getException(
                            env,
                            new LogicException(
                                    env,
                                    "Your configuration files are not serializable.",
                                    0,
                                    scope.e));
                } else {
                    throw convertedException38;
                }
            }

            env.callMethod(
                    scope._thisVarAlias,
                    "info",
                    ConfigCacheCommand.class,
                    "Configuration cached successfully!");
            throw new IncludeEventException(null);
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    protected Object getFreshConfiguration(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope25 scope = new Scope25();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Console")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Foundation/Console/ConfigCacheCommand.php");
            scope.app = new BasicReferenceContainer(null);
            scope.app.setObject(
                    ZVal.assign(
                            env.include(
                                    toStringR(
                                                    env.callMethod(
                                                            toObjectR(scope._thisVarAlias)
                                                                    .accessProp(this, env)
                                                                    .name("laravel")
                                                                    .value(),
                                                            "bootstrapPath",
                                                            ConfigCacheCommand.class),
                                                    env)
                                            + "/app.php",
                                    stack,
                                    runtimeConverterFunctionClassConstants,
                                    true,
                                    false)));
            env.callMethod(
                    env.callMethod(
                            scope.app.getObject(),
                            "make",
                            ConfigCacheCommand.class,
                            Kernel.CONST_class),
                    "bootstrap",
                    ConfigCacheCommand.class);
            throw new IncludeEventException(
                    ZVal.assign(
                            env.callMethod(
                                    scope.app.arrayGet(env, "config"),
                                    "all",
                                    ConfigCacheCommand.class)));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Console\\ConfigCacheCommand";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Command.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Foundation\\Console\\ConfigCacheCommand")
                    .setLookup(
                            ConfigCacheCommand.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "aliases",
                            "application",
                            "applicationDefinitionMerged",
                            "applicationDefinitionMergedWithArgs",
                            "code",
                            "definition",
                            "description",
                            "description",
                            "description",
                            "files",
                            "help",
                            "helperSet",
                            "hidden",
                            "hidden",
                            "ignoreValidationErrors",
                            "input",
                            "laravel",
                            "name",
                            "name",
                            "name",
                            "output",
                            "processTitle",
                            "signature",
                            "synopsis",
                            "usages",
                            "verbosity",
                            "verbosityMap")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Console/ConfigCacheCommand.php")
                    .addExtendsClass("Illuminate\\Console\\Command")
                    .addExtendsClass("Symfony\\Component\\Console\\Command\\Command")
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

    private static class Scope24 implements UpdateRuntimeScopeInterface {

        Object e;
        Object _thisVarAlias;
        Object configPath;
        Object config;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("e", this.e);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("configPath", this.configPath);
            stack.setVariable("config", this.config);
        }

        public void updateScope(RuntimeStack stack) {

            this.e = stack.getVariable("e");
            this._thisVarAlias = stack.getVariable("this");
            this.configPath = stack.getVariable("configPath");
            this.config = stack.getVariable("config");
        }
    }

    private static class Scope25 implements UpdateRuntimeScopeInterface {

        ReferenceContainer app;
        Object _thisVarAlias;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("app", this.app);
            stack.setVariable("this", this._thisVarAlias);
        }

        public void updateScope(RuntimeStack stack) {

            this.app = ZVal.getStackReference(stack.getVariable("app"));
            this._thisVarAlias = stack.getVariable("this");
        }
    }
}
