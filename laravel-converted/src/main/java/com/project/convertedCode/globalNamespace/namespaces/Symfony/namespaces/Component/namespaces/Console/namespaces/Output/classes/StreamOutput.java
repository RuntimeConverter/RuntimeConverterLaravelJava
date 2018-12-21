package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.RuntimeException;
import com.project.convertedCode.globalNamespace.functions.sapi_windows_vt100_support;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fwrite;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.Output;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Output/StreamOutput.php

*/

public class StreamOutput extends Output {

    public Object stream = null;

    public StreamOutput(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == StreamOutput.class) {
            this.__construct(env, args);
        }
    }

    public StreamOutput(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stream")
    @ConvertedParameter(index = 1, name = "verbosity", typeHint = "int")
    @ConvertedParameter(
        index = 2,
        name = "decorated",
        typeHint = "bool",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "formatter",
        typeHint = "Symfony\\Component\\Console\\Formatter\\OutputFormatterInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object stream = assignParameter(args, 0, false);
        Object verbosity = assignParameter(args, 1, true);
        if (null == verbosity) {
            verbosity = CONST_VERBOSITY_NORMAL;
        }
        Object decorated = assignParameter(args, 2, true);
        if (null == decorated) {
            decorated = ZVal.getNull();
        }
        Object formatter = assignParameter(args, 3, true);
        if (null == formatter) {
            formatter = ZVal.getNull();
        }
        if (ZVal.toBool(!function_is_resource.f.env(env).call(stream).getBool())
                || ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                "stream",
                                "!==",
                                NamespaceGlobal.get_resource_type.env(env).call(stream).value()))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "The StreamOutput class needs a stream as its first argument."));
        }

        this.stream = stream;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", decorated)) {
            decorated = this.hasColorSupport(env);
        }

        super.__construct(env, verbosity, decorated, formatter);
        return null;
    }

    @ConvertedMethod
    public Object getStream(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.stream);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "newline")
    protected Object doWrite(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object newline = assignParameter(args, 1, false);
        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                false,
                                "===",
                                function_fwrite.f.env(env).call(this.stream, message).value()))
                || ZVal.toBool(
                        ZVal.toBool(newline)
                                && ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                false,
                                                "===",
                                                function_fwrite
                                                        .f
                                                        .env(env)
                                                        .call(this.stream, "\n")
                                                        .value())))) {
            throw ZVal.getException(env, new RuntimeException(env, "Unable to write output."));
        }

        NamespaceGlobal.fflush.env(env).call(this.stream);
        return null;
    }

    @ConvertedMethod
    protected Object hasColorSupport(RuntimeEnv env, Object... args) {
        ReferenceContainer stat = new BasicReferenceContainer(null);
        if (ZVal.strictEqualityCheck("/", "===", "\\")) {
            return ZVal.assign(
                    ZVal.toBool(
                                    ZVal.toBool(
                                                    ZVal.toBool(
                                                                    ZVal.toBool(
                                                                                    function_function_exists
                                                                                            .f
                                                                                            .env(
                                                                                                    env)
                                                                                            .call(
                                                                                                    "sapi_windows_vt100_support")
                                                                                            .value())
                                                                            && ZVal.toBool(
                                                                                    sapi_windows_vt100_support
                                                                                            .f
                                                                                            .env(
                                                                                                    env)
                                                                                            .call(
                                                                                                    this
                                                                                                            .stream)
                                                                                            .value()))
                                                            || ZVal.toBool(
                                                                    ZVal.strictNotEqualityCheck(
                                                                            false,
                                                                            "!==",
                                                                            NamespaceGlobal.getenv
                                                                                    .env(env)
                                                                                    .call("ANSICON")
                                                                                    .value())))
                                            || ZVal.toBool(
                                                    ZVal.strictEqualityCheck(
                                                            "ON",
                                                            "===",
                                                            NamespaceGlobal.getenv
                                                                    .env(env)
                                                                    .call("ConEmuANSI")
                                                                    .value())))
                            || ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            "xterm",
                                            "===",
                                            NamespaceGlobal.getenv.env(env).call("TERM").value())));
        }

        if (function_function_exists.f.env(env).call("stream_isatty").getBool()) {
            return ZVal.assign(NamespaceGlobal.stream_isatty.env(env).call(this.stream).value());
        }

        if (function_function_exists.f.env(env).call("posix_isatty").getBool()) {
            return ZVal.assign(NamespaceGlobal.posix_isatty.env(env).call(this.stream).value());
        }

        stat.setObject(NamespaceGlobal.fstat.env(env).call(this.stream).value());
        return ZVal.assign(
                ZVal.isTrue(stat.getObject())
                        ? ZVal.strictEqualityCheck(
                                8192,
                                "===",
                                ZVal.toLong(stat.arrayGet(env, "mode")) & ZVal.toLong(61440))
                        : false);
    }

    public static final Object CONST_class = "Symfony\\Component\\Console\\Output\\StreamOutput";

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
                    .setName("Symfony\\Component\\Console\\Output\\StreamOutput")
                    .setLookup(
                            StreamOutput.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("formatter", "stream", "verbosity")
                    .setFilename("vendor/symfony/console/Output/StreamOutput.php")
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
