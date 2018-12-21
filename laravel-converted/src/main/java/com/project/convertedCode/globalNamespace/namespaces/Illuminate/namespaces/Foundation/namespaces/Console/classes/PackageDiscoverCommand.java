package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Console/PackageDiscoverCommand.php

*/

public class PackageDiscoverCommand extends Command {

    public PackageDiscoverCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.signature = "package:discover";
        this.description = "Rebuild the cached package manifest";
        if (this.getClass() == PackageDiscoverCommand.class) {
            this.__construct(env, args);
        }
    }

    public PackageDiscoverCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "manifest",
        typeHint = "Illuminate\\Foundation\\PackageManifest"
    )
    public Object handle(RuntimeEnv env, Object... args) {
        Object manifest = assignParameter(args, 0, false);
        Object _pPackage = null;
        env.callMethod(manifest, "build", PackageDiscoverCommand.class);
        for (ZPair zpairResult408 :
                ZVal.getIterable(
                        function_array_keys
                                .f
                                .env(env)
                                .call(
                                        toObjectR(manifest)
                                                .accessProp(this, env)
                                                .name("manifest")
                                                .value())
                                .value(),
                        env,
                        true)) {
            _pPackage = ZVal.assign(zpairResult408.getValue());
            env.callMethod(
                    this,
                    "line",
                    PackageDiscoverCommand.class,
                    "Discovered Package: <info>" + toStringR(_pPackage, env) + "</info>");
        }

        env.callMethod(
                this,
                "info",
                PackageDiscoverCommand.class,
                "Package manifest generated successfully.");
        return null;
    }

    public static final Object CONST_class =
            "Illuminate\\Foundation\\Console\\PackageDiscoverCommand";

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
                    .setName("Illuminate\\Foundation\\Console\\PackageDiscoverCommand")
                    .setLookup(
                            PackageDiscoverCommand.class,
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
                            "vendor/laravel/framework/src/Illuminate/Foundation/Console/PackageDiscoverCommand.php")
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
