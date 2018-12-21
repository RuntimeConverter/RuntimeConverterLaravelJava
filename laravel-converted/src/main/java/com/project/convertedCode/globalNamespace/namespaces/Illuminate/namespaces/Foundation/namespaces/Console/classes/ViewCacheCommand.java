package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.classes.Finder;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Console/ViewCacheCommand.php

*/

public class ViewCacheCommand extends Command {

    public ViewCacheCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.signature = "view:cache";
        this.description = "Compile all of the application's Blade templates";
        if (this.getClass() == ViewCacheCommand.class) {
            this.__construct(env, args);
        }
    }

    public ViewCacheCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Console")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Console/ViewCacheCommand.php");
        env.callMethod(
                this.paths(env),
                "each",
                ViewCacheCommand.class,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Foundation\\Console",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "path")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object path = assignParameter(args, 0, false);
                        ViewCacheCommand.this.compileViews(
                                env,
                                ViewCacheCommand.this.bladeFilesIn(
                                        env, ZVal.newArray(new ZPair(0, path))));
                        return null;
                    }
                });
        env.callMethod(
                this, "info", ViewCacheCommand.class, "Blade templates cached successfully!");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "views", typeHint = "Illuminate\\Support\\Collection")
    protected Object compileViews(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Console")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Console/ViewCacheCommand.php");
        Object views = assignParameter(args, 0, false);
        Object compiler = null;
        compiler =
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        new ReferenceClassProperty(this, "laravel", env)
                                                .arrayGet(env, "view"),
                                        "getEngineResolver",
                                        ViewCacheCommand.class),
                                "resolve",
                                ViewCacheCommand.class,
                                "blade"),
                        "getCompiler",
                        ViewCacheCommand.class);
        env.callMethod(
                views,
                "map",
                ViewCacheCommand.class,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Foundation\\Console",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(
                        index = 0,
                        name = "file",
                        typeHint = "Symfony\\Component\\Finder\\SplFileInfo"
                    )
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object file = assignParameter(args, 0, false);
                        Object compiler = null;
                        compiler = this.contextReferences.getCapturedValue("compiler");
                        env.callMethod(
                                compiler,
                                "compile",
                                ViewCacheCommand.class,
                                env.callMethod(file, "getRealPath", ViewCacheCommand.class));
                        return null;
                    }
                }.use("compiler", compiler));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "paths", typeHint = "array")
    protected Object bladeFilesIn(RuntimeEnv env, Object... args) {
        Object paths = assignParameter(args, 0, false);
        return ZVal.assign(
                collect.f
                        .env(env)
                        .call(
                                env.callMethod(
                                        env.callMethod(
                                                env.callMethod(
                                                        env.callMethod(
                                                                Finder.runtimeStaticObject.create(
                                                                        env),
                                                                "in",
                                                                ViewCacheCommand.class,
                                                                paths),
                                                        "exclude",
                                                        ViewCacheCommand.class,
                                                        "vendor"),
                                                "name",
                                                ViewCacheCommand.class,
                                                "*.blade.php"),
                                        "files",
                                        ViewCacheCommand.class))
                        .value());
    }

    @ConvertedMethod
    protected Object paths(RuntimeEnv env, Object... args) {
        Object finder = null;
        finder =
                env.callMethod(
                        new ReferenceClassProperty(this, "laravel", env).arrayGet(env, "view"),
                        "getFinder",
                        ViewCacheCommand.class);
        return ZVal.assign(
                env.callMethod(
                        collect.f
                                .env(env)
                                .call(env.callMethod(finder, "getPaths", ViewCacheCommand.class))
                                .value(),
                        "merge",
                        ViewCacheCommand.class,
                        env.callMethod(
                                collect.f
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        finder, "getHints", ViewCacheCommand.class))
                                        .value(),
                                "flatten",
                                ViewCacheCommand.class)));
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Console\\ViewCacheCommand";

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
                    .setName("Illuminate\\Foundation\\Console\\ViewCacheCommand")
                    .setLookup(
                            ViewCacheCommand.class,
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
                            "help",
                            "helperSet",
                            "hidden",
                            "hidden",
                            "ignoreValidationErrors",
                            "input",
                            "laravel",
                            "name",
                            "name",
                            "output",
                            "processTitle",
                            "signature",
                            "signature",
                            "synopsis",
                            "usages",
                            "verbosity",
                            "verbosityMap")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Console/ViewCacheCommand.php")
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
