package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Console.namespaces.Migrations.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Console/Migrations/BaseCommand.php

*/

public class BaseCommand extends Command {

    public BaseCommand(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == BaseCommand.class) {
            this.__construct(env, args);
        }
    }

    public BaseCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    protected Object getMigrationPaths(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Database/Console/Migrations")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Console/Migrations/BaseCommand.php");
        if (ZVal.toBool(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("input").value(),
                                "hasOption",
                                BaseCommand.class,
                                "path"))
                && ZVal.toBool(env.callMethod(this, "option", BaseCommand.class, "path"))) {
            return ZVal.assign(
                    env.callMethod(
                            env.callMethod(
                                    collect.f
                                            .env(env)
                                            .call(
                                                    env.callMethod(
                                                            this,
                                                            "option",
                                                            BaseCommand.class,
                                                            "path"))
                                            .value(),
                                    "map",
                                    BaseCommand.class,
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Illuminate\\Database\\Console\\Migrations",
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
                                            return ZVal.assign(
                                                    !ZVal.isTrue(
                                                                    BaseCommand.this.usingRealPath(
                                                                            env))
                                                            ? toStringR(
                                                                            env.callMethod(
                                                                                    toObjectR(
                                                                                                    _closureThisVar)
                                                                                            .accessProp(
                                                                                                    this,
                                                                                                    env)
                                                                                            .name(
                                                                                                    "laravel")
                                                                                            .value(),
                                                                                    "basePath",
                                                                                    BaseCommand
                                                                                            .class),
                                                                            env)
                                                                    + "/"
                                                                    + toStringR(path, env)
                                                            : path);
                                        }
                                    }),
                            "all",
                            BaseCommand.class));
        }

        return ZVal.assign(
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("migrator")
                                                .value(),
                                        "paths",
                                        BaseCommand.class),
                                ZVal.newArray(new ZPair(0, this.getMigrationPath(env))))
                        .value());
    }

    @ConvertedMethod
    protected Object usingRealPath(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(
                                env.callMethod(
                                        toObjectR(this).accessProp(this, env).name("input").value(),
                                        "hasOption",
                                        BaseCommand.class,
                                        "realpath"))
                        && ZVal.toBool(
                                env.callMethod(this, "option", BaseCommand.class, "realpath")));
    }

    @ConvertedMethod
    protected Object getMigrationPath(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("laravel")
                                                .value(),
                                        "databasePath",
                                        BaseCommand.class),
                                env)
                        + toStringR("/", env)
                        + "migrations");
    }

    public static final Object CONST_class =
            "Illuminate\\Database\\Console\\Migrations\\BaseCommand";

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
                    .setName("Illuminate\\Database\\Console\\Migrations\\BaseCommand")
                    .setLookup(
                            BaseCommand.class,
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
                            "synopsis",
                            "usages",
                            "verbosity",
                            "verbosityMap")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Console/Migrations/BaseCommand.php")
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
