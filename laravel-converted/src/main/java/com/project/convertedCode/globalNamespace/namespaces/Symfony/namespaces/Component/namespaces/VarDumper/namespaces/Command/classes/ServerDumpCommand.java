package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Command.classes;

import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Dumper.classes.CliDumper;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Command.namespaces.Descriptor.classes.CliDescriptor;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Command.namespaces.Descriptor.classes.HtmlDescriptor;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Dumper.classes.HtmlDumper;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Command.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Style.classes.SymfonyStyle;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Command/ServerDumpCommand.php

*/

public class ServerDumpCommand extends Command {

    public Object server = null;

    public Object descriptors = null;

    public ServerDumpCommand(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ServerDumpCommand.class) {
            this.__construct(env, args);
        }
    }

    public ServerDumpCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "server",
        typeHint = "Symfony\\Component\\VarDumper\\Server\\DumpServer"
    )
    @ConvertedParameter(
        index = 1,
        name = "descriptors",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object server = assignParameter(args, 0, false);
        Object descriptors = assignParameter(args, 1, true);
        if (null == descriptors) {
            descriptors = ZVal.newArray();
        }
        this.server = server;
        this.descriptors =
                ZVal.add(
                        descriptors,
                        ZVal.newArray(
                                new ZPair("cli", new CliDescriptor(env, new CliDumper(env))),
                                new ZPair("html", new HtmlDescriptor(env, new HtmlDumper(env)))));
        super.__construct(env);
        return null;
    }

    @ConvertedMethod
    protected Object configure(RuntimeEnv env, Object... args) {
        Object availableFormats = null;
        availableFormats =
                NamespaceGlobal.implode
                        .env(env)
                        .call(", ", function_array_keys.f.env(env).call(this.descriptors).value())
                        .value();
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                this,
                                "addOption",
                                ServerDumpCommand.class,
                                "format",
                                ZVal.getNull(),
                                InputOption.CONST_VALUE_REQUIRED,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("The output format (%s)", availableFormats)
                                        .value(),
                                "cli"),
                        "setDescription",
                        ServerDumpCommand.class,
                        "Starts a dump server that collects and displays dumps in a single place"),
                "setHelp",
                ServerDumpCommand.class,
                "<info>%command.name%</info> starts a dump server that collects and displays\ndumps in a single place for debugging you application:\n\n  <info>php %command.full_name%</info>\n\nYou can consult dumped data in HTML format in your browser by providing the <comment>--format=html</comment> option\nand redirecting the output to a file:\n\n  <info>php %command.full_name% --format=\"html\" > dump.html</info>\n");
        return null;
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
    protected Object execute(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/var-dumper/Command")
                        .setFile("/vendor/symfony/var-dumper/Command/ServerDumpCommand.php");
        Object input = assignParameter(args, 0, false);
        Object output = assignParameter(args, 1, false);
        Object io = null;
        Object errorIo = null;
        Object format = null;
        Object ternaryExpressionTemp = null;
        Object descriptor = null;
        io = new SymfonyStyle(env, input, output);
        format = env.callMethod(input, "getOption", ServerDumpCommand.class, "format");
        if (!ZVal.isTrue(
                descriptor =
                        ZVal.assign(
                                ZVal.isDefined(
                                                ternaryExpressionTemp =
                                                        new ReferenceClassProperty(
                                                                        this, "descriptors", env)
                                                                .arrayGet(env, format))
                                        ? ternaryExpressionTemp
                                        : ZVal.getNull()))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Unsupported format \"%s\".", format)
                                    .value()));
        }

        errorIo = env.callMethod(io, "getErrorStyle", ServerDumpCommand.class);
        env.callMethod(errorIo, "title", ServerDumpCommand.class, "Symfony Var Dumper Server");
        env.callMethod(this.server, "start", ServerDumpCommand.class);
        env.callMethod(
                errorIo,
                "success",
                ServerDumpCommand.class,
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "Server listening on %s",
                                env.callMethod(this.server, "getHost", ServerDumpCommand.class))
                        .value());
        env.callMethod(
                errorIo, "comment", ServerDumpCommand.class, "Quit the server with CONTROL-C.");
        env.callMethod(
                this.server,
                "listen",
                ServerDumpCommand.class,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Symfony\\Component\\VarDumper\\Command",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(
                        index = 0,
                        name = "data",
                        typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Data"
                    )
                    @ConvertedParameter(index = 1, name = "context", typeHint = "array")
                    @ConvertedParameter(index = 2, name = "clientId", typeHint = "int")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object data = assignParameter(args, 0, false);
                        Object context = assignParameter(args, 1, false);
                        Object clientId = assignParameter(args, 2, false);
                        Object io = null;
                        Object descriptor = null;
                        io = this.contextReferences.getCapturedValue("io");
                        descriptor = this.contextReferences.getCapturedValue("descriptor");
                        env.callMethod(
                                descriptor,
                                "describe",
                                ServerDumpCommand.class,
                                io,
                                data,
                                context,
                                clientId);
                        return null;
                    }
                }.use("io", io).use("descriptor", descriptor));
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\VarDumper\\Command\\ServerDumpCommand";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Command.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object defaultName = "server:dump";
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\VarDumper\\Command\\ServerDumpCommand")
                    .setLookup(
                            ServerDumpCommand.class,
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
                            "descriptors",
                            "help",
                            "helperSet",
                            "hidden",
                            "ignoreValidationErrors",
                            "name",
                            "processTitle",
                            "server",
                            "synopsis",
                            "usages")
                    .setStaticPropertyNames("defaultName")
                    .setFilename("vendor/symfony/var-dumper/Command/ServerDumpCommand.php")
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
