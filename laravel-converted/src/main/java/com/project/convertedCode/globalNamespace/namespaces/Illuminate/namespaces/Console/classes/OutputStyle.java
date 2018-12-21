package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Style.classes.SymfonyStyle;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Console/OutputStyle.php

*/

public class OutputStyle extends SymfonyStyle {

    public OutputStyle(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.output = null;
        if (this.getClass() == OutputStyle.class) {
            this.__construct(env, args);
        }
    }

    public OutputStyle(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "input",
        typeHint = "Symfony\\Component\\Console\\Input\\InputInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object output = assignParameter(args, 1, false);
        this.output = output;
        super.__construct(env, input, output);
        return null;
    }

    @ConvertedMethod
    public Object isQuiet(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.output, "isQuiet", OutputStyle.class));
    }

    @ConvertedMethod
    public Object isVerbose(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.output, "isVerbose", OutputStyle.class));
    }

    @ConvertedMethod
    public Object isVeryVerbose(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.output, "isVeryVerbose", OutputStyle.class));
    }

    @ConvertedMethod
    public Object isDebug(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.output, "isDebug", OutputStyle.class));
    }

    public static final Object CONST_class = "Illuminate\\Console\\OutputStyle";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends SymfonyStyle.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Console\\OutputStyle")
                    .setLookup(
                            OutputStyle.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bufferedOutput",
                            "input",
                            "lineLength",
                            "output",
                            "output",
                            "progressBar",
                            "questionHelper")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Console/OutputStyle.php")
                    .addInterface("Symfony\\Component\\Console\\Output\\OutputInterface")
                    .addInterface("Symfony\\Component\\Console\\Style\\StyleInterface")
                    .addExtendsClass("Symfony\\Component\\Console\\Style\\SymfonyStyle")
                    .addExtendsClass("Symfony\\Component\\Console\\Style\\OutputStyle")
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
