package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.OutputInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Formatter.classes.OutputFormatter;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Output/NullOutput.php

*/

public class NullOutput extends RuntimeClassBase implements OutputInterface {

    public NullOutput(RuntimeEnv env, Object... args) {
        super(env);
    }

    public NullOutput(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "formatter",
        typeHint = "Symfony\\Component\\Console\\Formatter\\OutputFormatterInterface"
    )
    public Object setFormatter(RuntimeEnv env, Object... args) {
        Object formatter = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    public Object getFormatter(RuntimeEnv env, Object... args) {
        return ZVal.assign(new OutputFormatter(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "decorated")
    public Object setDecorated(RuntimeEnv env, Object... args) {
        Object decorated = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    public Object isDecorated(RuntimeEnv env, Object... args) {
        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    public Object setVerbosity(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    public Object getVerbosity(RuntimeEnv env, Object... args) {
        return ZVal.assign(CONST_VERBOSITY_QUIET);
    }

    @ConvertedMethod
    public Object isQuiet(RuntimeEnv env, Object... args) {
        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object isVerbose(RuntimeEnv env, Object... args) {
        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object isVeryVerbose(RuntimeEnv env, Object... args) {
        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object isDebug(RuntimeEnv env, Object... args) {
        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messages")
    @ConvertedParameter(index = 1, name = "options")
    public Object writeln(RuntimeEnv env, Object... args) {
        Object messages = assignParameter(args, 0, false);
        Object options = assignParameter(args, 1, true);
        if (null == options) {
            options = CONST_OUTPUT_NORMAL;
        }
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messages")
    @ConvertedParameter(
        index = 1,
        name = "newline",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 2, name = "options")
    public Object write(RuntimeEnv env, Object... args) {
        Object messages = assignParameter(args, 0, false);
        Object newline = assignParameter(args, 1, true);
        if (null == newline) {
            newline = false;
        }
        Object options = assignParameter(args, 2, true);
        if (null == options) {
            options = CONST_OUTPUT_NORMAL;
        }
        return null;
    }

    public static final Object CONST_class = "Symfony\\Component\\Console\\Output\\NullOutput";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Output\\NullOutput")
                    .setLookup(
                            NullOutput.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/console/Output/NullOutput.php")
                    .addInterface("Symfony\\Component\\Console\\Output\\OutputInterface")
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
