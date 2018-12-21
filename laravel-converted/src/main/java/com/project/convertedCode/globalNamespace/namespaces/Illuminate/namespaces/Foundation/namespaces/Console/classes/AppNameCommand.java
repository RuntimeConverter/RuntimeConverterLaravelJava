package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.functions.database_path;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.classes.Finder;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.functions.base_path;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputArgument;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Console/AppNameCommand.php

*/

public class AppNameCommand extends Command {

    public Object composer = null;

    public Object files = null;

    public Object currentRoot = null;

    public AppNameCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.name = "app:name";
        this.description = "Set the application namespace";
        if (this.getClass() == AppNameCommand.class) {
            this.__construct(env, args);
        }
    }

    public AppNameCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "composer", typeHint = "Illuminate\\Support\\Composer")
    @ConvertedParameter(index = 1, name = "files", typeHint = "Illuminate\\Filesystem\\Filesystem")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object composer = assignParameter(args, 0, false);
        Object files = assignParameter(args, 1, false);
        super.__construct(env);
        this.files = files;
        this.composer = composer;
        return null;
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        this.currentRoot =
                function_trim
                        .f
                        .env(env)
                        .call(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("laravel")
                                                .value(),
                                        "getNamespace",
                                        AppNameCommand.class),
                                "\\")
                        .value();
        this.setAppDirectoryNamespace(env);
        this.setBootstrapNamespaces(env);
        this.setConfigNamespaces(env);
        this.setComposerNamespace(env);
        this.setDatabaseFactoryNamespaces(env);
        env.callMethod(this, "info", AppNameCommand.class, "Application namespace set!");
        env.callMethod(this.composer, "dumpAutoloads", AppNameCommand.class);
        env.callMethod(this, "call", AppNameCommand.class, "clear-compiled");
        return null;
    }

    @ConvertedMethod
    protected Object setAppDirectoryNamespace(RuntimeEnv env, Object... args) {
        Object file = null;
        Object files = null;
        files =
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        Finder.runtimeStaticObject.create(env),
                                        "in",
                                        AppNameCommand.class,
                                        new ReferenceClassProperty(this, "laravel", env)
                                                .arrayGet(env, "path")),
                                new RuntimeArgsWithReferences()
                                        .add(
                                                0,
                                                new ReferenceClassProperty(
                                                        this, "currentRoot", env)),
                                "contains",
                                AppNameCommand.class,
                                this.currentRoot),
                        "name",
                        AppNameCommand.class,
                        "*.php");
        for (ZPair zpairResult401 : ZVal.getIterable(files, env, true)) {
            file = ZVal.assign(zpairResult401.getValue());
            this.replaceNamespace(env, env.callMethod(file, "getRealPath", AppNameCommand.class));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    protected Object replaceNamespace(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object search = null;
        Object replace = null;
        search =
                ZVal.newArray(
                        new ZPair(0, "namespace " + toStringR(this.currentRoot, env) + ";"),
                        new ZPair(1, toStringR(this.currentRoot, env) + "\\"));
        replace =
                ZVal.newArray(
                        new ZPair(
                                0,
                                "namespace "
                                        + toStringR(
                                                env.callMethod(
                                                        this,
                                                        "argument",
                                                        AppNameCommand.class,
                                                        "name"),
                                                env)
                                        + ";"),
                        new ZPair(
                                1,
                                toStringR(
                                                env.callMethod(
                                                        this,
                                                        "argument",
                                                        AppNameCommand.class,
                                                        "name"),
                                                env)
                                        + "\\"));
        this.replaceIn(env, path, search, replace);
        return null;
    }

    @ConvertedMethod
    protected Object setBootstrapNamespaces(RuntimeEnv env, Object... args) {
        Object search = null;
        Object replace = null;
        search =
                ZVal.newArray(
                        new ZPair(0, toStringR(this.currentRoot, env) + "\\Http"),
                        new ZPair(1, toStringR(this.currentRoot, env) + "\\Console"),
                        new ZPair(2, toStringR(this.currentRoot, env) + "\\Exceptions"));
        replace =
                ZVal.newArray(
                        new ZPair(
                                0,
                                toStringR(
                                                env.callMethod(
                                                        this,
                                                        "argument",
                                                        AppNameCommand.class,
                                                        "name"),
                                                env)
                                        + "\\Http"),
                        new ZPair(
                                1,
                                toStringR(
                                                env.callMethod(
                                                        this,
                                                        "argument",
                                                        AppNameCommand.class,
                                                        "name"),
                                                env)
                                        + "\\Console"),
                        new ZPair(
                                2,
                                toStringR(
                                                env.callMethod(
                                                        this,
                                                        "argument",
                                                        AppNameCommand.class,
                                                        "name"),
                                                env)
                                        + "\\Exceptions"));
        this.replaceIn(env, this.getBootstrapPath(env), search, replace);
        return null;
    }

    @ConvertedMethod
    protected Object setConfigNamespaces(RuntimeEnv env, Object... args) {
        this.setAppConfigNamespaces(env);
        this.setAuthConfigNamespace(env);
        this.setServicesConfigNamespace(env);
        return null;
    }

    @ConvertedMethod
    protected Object setAppConfigNamespaces(RuntimeEnv env, Object... args) {
        Object search = null;
        Object replace = null;
        search =
                ZVal.newArray(
                        new ZPair(0, toStringR(this.currentRoot, env) + "\\Providers"),
                        new ZPair(1, toStringR(this.currentRoot, env) + "\\Http\\Controllers\\"));
        replace =
                ZVal.newArray(
                        new ZPair(
                                0,
                                toStringR(
                                                env.callMethod(
                                                        this,
                                                        "argument",
                                                        AppNameCommand.class,
                                                        "name"),
                                                env)
                                        + "\\Providers"),
                        new ZPair(
                                1,
                                toStringR(
                                                env.callMethod(
                                                        this,
                                                        "argument",
                                                        AppNameCommand.class,
                                                        "name"),
                                                env)
                                        + "\\Http\\Controllers\\"));
        this.replaceIn(env, this.getConfigPath(env, "app"), search, replace);
        return null;
    }

    @ConvertedMethod
    protected Object setAuthConfigNamespace(RuntimeEnv env, Object... args) {
        this.replaceIn(
                env,
                this.getConfigPath(env, "auth"),
                toStringR(this.currentRoot, env) + "\\User",
                toStringR(env.callMethod(this, "argument", AppNameCommand.class, "name"), env)
                        + "\\User");
        return null;
    }

    @ConvertedMethod
    protected Object setServicesConfigNamespace(RuntimeEnv env, Object... args) {
        this.replaceIn(
                env,
                this.getConfigPath(env, "services"),
                toStringR(this.currentRoot, env) + "\\User",
                toStringR(env.callMethod(this, "argument", AppNameCommand.class, "name"), env)
                        + "\\User");
        return null;
    }

    @ConvertedMethod
    protected Object setComposerNamespace(RuntimeEnv env, Object... args) {
        this.replaceIn(
                env,
                this.getComposerPath(env),
                toStringR(
                                function_str_replace
                                        .f
                                        .env(env)
                                        .call("\\", "\\\\", this.currentRoot)
                                        .value(),
                                env)
                        + "\\\\",
                toStringR(
                                function_str_replace
                                        .f
                                        .env(env)
                                        .call(
                                                "\\",
                                                "\\\\",
                                                env.callMethod(
                                                        this,
                                                        "argument",
                                                        AppNameCommand.class,
                                                        "name"))
                                        .value(),
                                env)
                        + "\\\\");
        return null;
    }

    @ConvertedMethod
    protected Object setDatabaseFactoryNamespaces(RuntimeEnv env, Object... args) {
        Object file = null;
        Object files = null;
        files =
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        Finder.runtimeStaticObject.create(env),
                                        "in",
                                        AppNameCommand.class,
                                        database_path.f.env(env).call("factories").value()),
                                new RuntimeArgsWithReferences()
                                        .add(
                                                0,
                                                new ReferenceClassProperty(
                                                        this, "currentRoot", env)),
                                "contains",
                                AppNameCommand.class,
                                this.currentRoot),
                        "name",
                        AppNameCommand.class,
                        "*.php");
        for (ZPair zpairResult402 : ZVal.getIterable(files, env, true)) {
            file = ZVal.assign(zpairResult402.getValue());
            this.replaceIn(
                    env,
                    env.callMethod(file, "getRealPath", AppNameCommand.class),
                    this.currentRoot,
                    env.callMethod(this, "argument", AppNameCommand.class, "name"));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "search")
    @ConvertedParameter(index = 2, name = "replace")
    protected Object replaceIn(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object search = assignParameter(args, 1, false);
        Object replace = assignParameter(args, 2, false);
        if (ZVal.isTrue(env.callMethod(this.files, "exists", AppNameCommand.class, path))) {
            env.callMethod(
                    this.files,
                    "put",
                    AppNameCommand.class,
                    path,
                    function_str_replace
                            .f
                            .env(env)
                            .call(
                                    search,
                                    replace,
                                    env.callMethod(this.files, "get", AppNameCommand.class, path))
                            .value());
        }

        return null;
    }

    @ConvertedMethod
    protected Object getBootstrapPath(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("laravel")
                                                .value(),
                                        "bootstrapPath",
                                        AppNameCommand.class),
                                env)
                        + "/app.php");
    }

    @ConvertedMethod
    protected Object getComposerPath(RuntimeEnv env, Object... args) {
        return ZVal.assign(base_path.f.env(env).call("composer.json").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object getConfigPath(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(
                                new ReferenceClassProperty(this, "laravel", env)
                                        .arrayGet(env, "path.config"),
                                env)
                        + "/"
                        + toStringR(name, env)
                        + ".php");
    }

    @ConvertedMethod
    protected Object getArguments(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                0,
                                ZVal.newArray(
                                        new ZPair(0, "name"),
                                        new ZPair(1, InputArgument.CONST_REQUIRED),
                                        new ZPair(2, "The desired namespace.")))));
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Console\\AppNameCommand";

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
                    .setName("Illuminate\\Foundation\\Console\\AppNameCommand")
                    .setLookup(
                            AppNameCommand.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "aliases",
                            "application",
                            "applicationDefinitionMerged",
                            "applicationDefinitionMergedWithArgs",
                            "code",
                            "composer",
                            "currentRoot",
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
                            "vendor/laravel/framework/src/Illuminate/Foundation/Console/AppNameCommand.php")
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
}
