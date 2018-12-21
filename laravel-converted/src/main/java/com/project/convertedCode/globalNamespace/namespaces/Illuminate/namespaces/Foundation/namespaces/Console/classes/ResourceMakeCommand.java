package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.GeneratorCommand;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Console/ResourceMakeCommand.php

*/

public class ResourceMakeCommand extends GeneratorCommand {

    public ResourceMakeCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.name = "make:resource";
        this.description = "Create a new resource";
        this.type = "Resource";
        if (this.getClass() == ResourceMakeCommand.class) {
            this.__construct(env, args);
        }
    }

    public ResourceMakeCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.collection(env))) {
            this.type = "Resource collection";
        }

        super.handle(env);
        return null;
    }

    @ConvertedMethod
    protected Object getStub(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isTrue(this.collection(env))
                        ? toStringR(
                                        env.addRootFilesystemPrefix(
                                                "/vendor/laravel/framework/src/Illuminate/Foundation/Console"),
                                        env)
                                + "/stubs/resource-collection.stub"
                        : toStringR(
                                        env.addRootFilesystemPrefix(
                                                "/vendor/laravel/framework/src/Illuminate/Foundation/Console"),
                                        env)
                                + "/stubs/resource.stub");
    }

    @ConvertedMethod
    protected Object collection(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(env.callMethod(this, "option", ResourceMakeCommand.class, "collection"))
                        || ZVal.toBool(
                                Str.runtimeStaticObject.endsWith(
                                        env,
                                        env.callMethod(
                                                this,
                                                "argument",
                                                ResourceMakeCommand.class,
                                                "name"),
                                        "Collection")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rootNamespace")
    protected Object getDefaultNamespace(RuntimeEnv env, Object... args) {
        Object rootNamespace = assignParameter(args, 0, false);
        return ZVal.assign(toStringR(rootNamespace, env) + "\\Http\\Resources");
    }

    @ConvertedMethod
    protected Object getOptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                0,
                                ZVal.newArray(
                                        new ZPair(0, "collection"),
                                        new ZPair(1, "c"),
                                        new ZPair(2, InputOption.CONST_VALUE_NONE),
                                        new ZPair(3, "Create a resource collection.")))));
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Console\\ResourceMakeCommand";

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
                    .setName("Illuminate\\Foundation\\Console\\ResourceMakeCommand")
                    .setLookup(
                            ResourceMakeCommand.class,
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
                            "vendor/laravel/framework/src/Illuminate/Foundation/Console/ResourceMakeCommand.php")
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
