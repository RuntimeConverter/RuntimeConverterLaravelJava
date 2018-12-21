package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Output.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Output.classes.OutputPager;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.StreamOutput;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Output/PassthruPager.php

*/

public class PassthruPager extends StreamOutput implements OutputPager {

    public PassthruPager(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PassthruPager.class) {
            this.__construct(env, args);
        }
    }

    public PassthruPager(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\StreamOutput"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        super.__construct(env, env.callMethod(output, "getStream", PassthruPager.class));
        return null;
    }

    @ConvertedMethod
    public Object close(RuntimeEnv env, Object... args) {
        return null;
    }

    public static final Object CONST_class = "Psy\\Output\\PassthruPager";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StreamOutput.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Output\\PassthruPager")
                    .setLookup(
                            PassthruPager.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("formatter", "stream", "verbosity")
                    .setFilename("vendor/psy/psysh/src/Output/PassthruPager.php")
                    .addInterface("Psy\\Output\\OutputPager")
                    .addInterface("Symfony\\Component\\Console\\Output\\OutputInterface")
                    .addExtendsClass("Symfony\\Component\\Console\\Output\\StreamOutput")
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
