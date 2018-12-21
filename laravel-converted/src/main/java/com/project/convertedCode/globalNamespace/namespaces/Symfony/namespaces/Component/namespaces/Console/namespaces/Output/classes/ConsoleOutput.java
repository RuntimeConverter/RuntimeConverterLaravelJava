package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.ConsoleSectionOutput;
import com.runtimeconverter.runtime.nativeFunctions.string.function_stripos;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.StreamOutput;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.ConsoleOutputInterface;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Output/ConsoleOutput.php

*/

public class ConsoleOutput extends StreamOutput implements ConsoleOutputInterface {

    public Object stderr = null;

    public Object consoleSectionOutputs = ZVal.newArray();

    public ConsoleOutput(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ConsoleOutput.class) {
            this.__construct(env, args);
        }
    }

    public ConsoleOutput(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "verbosity", typeHint = "int")
    @ConvertedParameter(
        index = 1,
        name = "decorated",
        typeHint = "bool",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "formatter",
        typeHint = "Symfony\\Component\\Console\\Formatter\\OutputFormatterInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object verbosity = assignParameter(args, 0, true);
        if (null == verbosity) {
            verbosity = CONST_VERBOSITY_NORMAL;
        }
        Object decorated = assignParameter(args, 1, true);
        if (null == decorated) {
            decorated = ZVal.getNull();
        }
        Object formatter = assignParameter(args, 2, true);
        if (null == formatter) {
            formatter = ZVal.getNull();
        }
        Object actualDecorated = null;
        super.__construct(env, this.openOutputStream(env), verbosity, decorated, formatter);
        actualDecorated = env.callMethod(this, "isDecorated", ConsoleOutput.class);
        this.stderr =
                new StreamOutput(
                        env,
                        this.openErrorStream(env),
                        verbosity,
                        decorated,
                        env.callMethod(this, "getFormatter", ConsoleOutput.class));
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", decorated)) {
            this.setDecorated(
                    env,
                    ZVal.toBool(actualDecorated)
                            && ZVal.toBool(
                                    env.callMethod(
                                            this.stderr, "isDecorated", ConsoleOutput.class)));
        }

        return null;
    }

    @ConvertedMethod
    public Object section(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ConsoleSectionOutput(
                        env,
                        env.callMethod(this, "getStream", ConsoleOutput.class),
                        this.consoleSectionOutputs,
                        env.callMethod(this, "getVerbosity", ConsoleOutput.class),
                        env.callMethod(this, "isDecorated", ConsoleOutput.class),
                        env.callMethod(this, "getFormatter", ConsoleOutput.class)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "decorated")
    public Object setDecorated(RuntimeEnv env, Object... args) {
        Object decorated = assignParameter(args, 0, false);
        super.setDecorated(env, decorated);
        env.callMethod(this.stderr, "setDecorated", ConsoleOutput.class, decorated);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "formatter",
        typeHint = "Symfony\\Component\\Console\\Formatter\\OutputFormatterInterface"
    )
    public Object setFormatter(RuntimeEnv env, Object... args) {
        Object formatter = assignParameter(args, 0, false);
        super.setFormatter(env, formatter);
        env.callMethod(this.stderr, "setFormatter", ConsoleOutput.class, formatter);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    public Object setVerbosity(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, false);
        super.setVerbosity(env, level);
        env.callMethod(this.stderr, "setVerbosity", ConsoleOutput.class, level);
        return null;
    }

    @ConvertedMethod
    public Object getErrorOutput(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.stderr);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "error",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    public Object setErrorOutput(RuntimeEnv env, Object... args) {
        Object error = assignParameter(args, 0, false);
        this.stderr = error;
        return null;
    }

    @ConvertedMethod
    protected Object hasStdoutSupport(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.strictEqualityCheck(false, "===", this.isRunningOS400(env)));
    }

    @ConvertedMethod
    protected Object hasStderrSupport(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.strictEqualityCheck(false, "===", this.isRunningOS400(env)));
    }

    @ConvertedMethod
    private Object isRunningOS400(RuntimeEnv env, Object... args) {
        Object checks = null;
        checks =
                ZVal.newArray(
                        new ZPair(
                                0,
                                function_function_exists.f.env(env).call("php_uname").getBool()
                                        ? NamespaceGlobal.php_uname.env(env).call("s").value()
                                        : ""),
                        new ZPair(1, NamespaceGlobal.getenv.env(env).call("OSTYPE").value()),
                        new ZPair(2, "Linux"));
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        false,
                        "!==",
                        function_stripos
                                .f
                                .env(env)
                                .call(
                                        NamespaceGlobal.implode.env(env).call(";", checks).value(),
                                        "OS400")
                                .value()));
    }

    @ConvertedMethod
    private Object openOutputStream(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        if (!ZVal.isTrue(this.hasStdoutSupport(env))) {
            return ZVal.assign(function_fopen.f.env(env).call("php://output", "w").value());
        }

        return ZVal.assign(
                ZVal.isTrue(
                                ternaryExpressionTemp =
                                        function_fopen.f.env(env).call("php://stdout", "w").value())
                        ? ternaryExpressionTemp
                        : function_fopen.f.env(env).call("php://output", "w").value());
    }

    @ConvertedMethod
    private Object openErrorStream(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_fopen
                        .f
                        .env(env)
                        .call(
                                ZVal.isTrue(this.hasStderrSupport(env))
                                        ? "php://stderr"
                                        : "php://output",
                                "w")
                        .value());
    }

    public static final Object CONST_class = "Symfony\\Component\\Console\\Output\\ConsoleOutput";

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
                    .setName("Symfony\\Component\\Console\\Output\\ConsoleOutput")
                    .setLookup(
                            ConsoleOutput.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "consoleSectionOutputs", "formatter", "stderr", "stream", "verbosity")
                    .setFilename("vendor/symfony/console/Output/ConsoleOutput.php")
                    .addInterface("Symfony\\Component\\Console\\Output\\ConsoleOutputInterface")
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
