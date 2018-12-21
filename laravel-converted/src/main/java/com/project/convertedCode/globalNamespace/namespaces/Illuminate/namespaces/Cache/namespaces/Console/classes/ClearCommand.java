package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.namespaces.Console.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputArgument;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Command;
import com.project.convertedCode.globalNamespace.functions.storage_path;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Cache/Console/ClearCommand.php

*/

public class ClearCommand extends Command {

    public Object cache = null;

    public Object files = null;

    public ClearCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.name = "cache:clear";
        this.description = "Flush the application cache";
        if (this.getClass() == ClearCommand.class) {
            this.__construct(env, args);
        }
    }

    public ClearCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "cache", typeHint = "Illuminate\\Cache\\CacheManager")
    @ConvertedParameter(index = 1, name = "files", typeHint = "Illuminate\\Filesystem\\Filesystem")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object cache = assignParameter(args, 0, false);
        Object files = assignParameter(args, 1, false);
        super.__construct(env);
        this.cache = cache;
        this.files = files;
        return null;
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        env.callMethod(
                new ReferenceClassProperty(this, "laravel", env).arrayGet(env, "events"),
                "fire",
                ClearCommand.class,
                "cache:clearing",
                ZVal.newArray(
                        new ZPair(0, env.callMethod(this, "argument", ClearCommand.class, "store")),
                        new ZPair(1, this.tags(env))));
        env.callMethod(this.cache(env), "flush", ClearCommand.class);
        this.flushFacades(env);
        env.callMethod(
                new ReferenceClassProperty(this, "laravel", env).arrayGet(env, "events"),
                "fire",
                ClearCommand.class,
                "cache:cleared",
                ZVal.newArray(
                        new ZPair(0, env.callMethod(this, "argument", ClearCommand.class, "store")),
                        new ZPair(1, this.tags(env))));
        env.callMethod(this, "info", ClearCommand.class, "Application cache cleared!");
        return null;
    }

    @ConvertedMethod
    public Object flushFacades(RuntimeEnv env, Object... args) {
        Object file = null;
        Object storagePath = null;
        if (!ZVal.isTrue(
                env.callMethod(
                        this.files,
                        "exists",
                        ClearCommand.class,
                        storagePath = storage_path.f.env(env).call("framework/cache").value()))) {
            return null;
        }

        for (ZPair zpairResult203 :
                ZVal.getIterable(
                        env.callMethod(this.files, "files", ClearCommand.class, storagePath),
                        env,
                        true)) {
            file = ZVal.assign(zpairResult203.getValue());
            if (function_preg_match.f.env(env).call("/facade-.*\\.php$/", file).getBool()) {
                env.callMethod(this.files, "delete", ClearCommand.class, file);
            }
        }

        return null;
    }

    @ConvertedMethod
    protected Object cache(RuntimeEnv env, Object... args) {
        Object cache = null;
        cache =
                env.callMethod(
                        this.cache,
                        "store",
                        ClearCommand.class,
                        env.callMethod(this, "argument", ClearCommand.class, "store"));
        return ZVal.assign(
                ZVal.isEmpty(this.tags(env))
                        ? cache
                        : env.callMethod(cache, "tags", ClearCommand.class, this.tags(env)));
    }

    @ConvertedMethod
    protected Object tags(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                function_explode
                                        .f
                                        .env(env)
                                        .call(
                                                ",",
                                                env.callMethod(
                                                        this, "option", ClearCommand.class, "tags"))
                                        .value())
                        .value());
    }

    @ConvertedMethod
    protected Object getArguments(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                0,
                                ZVal.newArray(
                                        new ZPair(0, "store"),
                                        new ZPair(1, InputArgument.CONST_OPTIONAL),
                                        new ZPair(
                                                2,
                                                "The name of the store you would like to clear.")))));
    }

    @ConvertedMethod
    protected Object getOptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                0,
                                ZVal.newArray(
                                        new ZPair(0, "tags"),
                                        new ZPair(1, ZVal.getNull()),
                                        new ZPair(2, InputOption.CONST_VALUE_OPTIONAL),
                                        new ZPair(3, "The cache tags you would like to clear."),
                                        new ZPair(4, ZVal.getNull())))));
    }

    public static final Object CONST_class = "Illuminate\\Cache\\Console\\ClearCommand";

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
                    .setName("Illuminate\\Cache\\Console\\ClearCommand")
                    .setLookup(
                            ClearCommand.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "aliases",
                            "application",
                            "applicationDefinitionMerged",
                            "applicationDefinitionMergedWithArgs",
                            "cache",
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
                            "vendor/laravel/framework/src/Illuminate/Cache/Console/ClearCommand.php")
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
