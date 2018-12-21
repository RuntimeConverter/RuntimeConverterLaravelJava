package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.Output;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Output/BufferedOutput.php

*/

public class BufferedOutput extends Output {

    public Object buffer = "";

    public BufferedOutput(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == BufferedOutput.class) {
            this.__construct(env, args);
        }
    }

    public BufferedOutput(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object fetch(RuntimeEnv env, Object... args) {
        Object content = null;
        content = ZVal.assign(this.buffer);
        this.buffer = "";
        return ZVal.assign(content);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "newline")
    protected Object doWrite(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object newline = assignParameter(args, 1, false);
        this.buffer = toStringR(this.buffer, env) + toStringR(message, env);
        if (ZVal.isTrue(newline)) {
            this.buffer = toStringR(this.buffer, env) + toStringR("\n", env);
        }

        return null;
    }

    public static final Object CONST_class = "Symfony\\Component\\Console\\Output\\BufferedOutput";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Output.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Output\\BufferedOutput")
                    .setLookup(
                            BufferedOutput.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("buffer", "formatter", "verbosity")
                    .setFilename("vendor/symfony/console/Output/BufferedOutput.php")
                    .addInterface("Symfony\\Component\\Console\\Output\\OutputInterface")
                    .addExtendsClass("Symfony\\Component\\Console\\Output\\Output")
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
