package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.GeneratorCommand;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Console/ExceptionMakeCommand.php

*/

public class ExceptionMakeCommand extends GeneratorCommand {

    public ExceptionMakeCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.name = "make:exception";
        this.description = "Create a new custom exception class";
        this.type = "Exception";
        if (this.getClass() == ExceptionMakeCommand.class) {
            this.__construct(env, args);
        }
    }

    public ExceptionMakeCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    protected Object getStub(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(env.callMethod(this, "option", ExceptionMakeCommand.class, "render"))) {
            return ZVal.assign(
                    ZVal.isTrue(
                                    env.callMethod(
                                            this, "option", ExceptionMakeCommand.class, "report"))
                            ? toStringR(
                                            env.addRootFilesystemPrefix(
                                                    "/vendor/laravel/framework/src/Illuminate/Foundation/Console"),
                                            env)
                                    + "/stubs/exception-render-report.stub"
                            : toStringR(
                                            env.addRootFilesystemPrefix(
                                                    "/vendor/laravel/framework/src/Illuminate/Foundation/Console"),
                                            env)
                                    + "/stubs/exception-render.stub");
        }

        return ZVal.assign(
                ZVal.isTrue(env.callMethod(this, "option", ExceptionMakeCommand.class, "report"))
                        ? toStringR(
                                        env.addRootFilesystemPrefix(
                                                "/vendor/laravel/framework/src/Illuminate/Foundation/Console"),
                                        env)
                                + "/stubs/exception-report.stub"
                        : toStringR(
                                        env.addRootFilesystemPrefix(
                                                "/vendor/laravel/framework/src/Illuminate/Foundation/Console"),
                                        env)
                                + "/stubs/exception.stub");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rawName")
    protected Object alreadyExists(RuntimeEnv env, Object... args) {
        Object rawName = assignParameter(args, 0, false);
        return ZVal.assign(
                function_class_exists
                        .f
                        .env(env)
                        .call(
                                toStringR(
                                                env.callMethod(
                                                        this,
                                                        "rootNamespace",
                                                        ExceptionMakeCommand.class),
                                                env)
                                        + "Exceptions\\"
                                        + toStringR(rawName, env))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rootNamespace")
    protected Object getDefaultNamespace(RuntimeEnv env, Object... args) {
        Object rootNamespace = assignParameter(args, 0, false);
        return ZVal.assign(toStringR(rootNamespace, env) + "\\Exceptions");
    }

    @ConvertedMethod
    protected Object getOptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                0,
                                ZVal.newArray(
                                        new ZPair(0, "render"),
                                        new ZPair(1, ZVal.getNull()),
                                        new ZPair(2, InputOption.CONST_VALUE_NONE),
                                        new ZPair(
                                                3,
                                                "Create the exception with an empty render method."))),
                        new ZPair(
                                1,
                                ZVal.newArray(
                                        new ZPair(0, "report"),
                                        new ZPair(1, ZVal.getNull()),
                                        new ZPair(2, InputOption.CONST_VALUE_NONE),
                                        new ZPair(
                                                3,
                                                "Create the exception with an empty report method.")))));
    }

    public static final Object CONST_class =
            "Illuminate\\Foundation\\Console\\ExceptionMakeCommand";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends GeneratorCommand.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Foundation\\Console\\ExceptionMakeCommand")
                    .setLookup(
                            ExceptionMakeCommand.class,
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
                            "type",
                            "type",
                            "usages",
                            "verbosity",
                            "verbosityMap")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Console/ExceptionMakeCommand.php")
                    .addExtendsClass("Illuminate\\Console\\GeneratorCommand")
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
