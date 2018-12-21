package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.functions.public_path;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.functions.base_path;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.classes.PhpExecutableFinder;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.ProcessUtils;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.file.function_chdir;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Console/ServeCommand.php

*/

public class ServeCommand extends Command {

    public ServeCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.name = "serve";
        this.description = "Serve the application on the PHP development server";
        if (this.getClass() == ServeCommand.class) {
            this.__construct(env, args);
        }
    }

    public ServeCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        ReferenceContainer status = new BasicReferenceContainer(null);
        function_chdir.f.env(env).call(public_path.f.env(env).call().value());
        env.callMethod(
                this,
                "line",
                ServeCommand.class,
                "<info>Laravel development server started:</info> <http://"
                        + toStringR(this.host(env), env)
                        + ":"
                        + toStringR(this.port(env), env)
                        + ">");
        NamespaceGlobal.passthru
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(1, status))
                .call(this.serverCommand(env), status.getObject());
        return ZVal.assign(status.getObject());
    }

    @ConvertedMethod
    protected Object serverCommand(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%s -S %s:%s %s",
                                ProcessUtils.runtimeStaticObject.escapeArgument(
                                        env,
                                        env.callMethod(
                                                new PhpExecutableFinder(env),
                                                "find",
                                                ServeCommand.class,
                                                false)),
                                this.host(env),
                                this.port(env),
                                ProcessUtils.runtimeStaticObject.escapeArgument(
                                        env, base_path.f.env(env).call("server.php").value()))
                        .value());
    }

    @ConvertedMethod
    protected Object host(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("input").value(),
                        "getOption",
                        ServeCommand.class,
                        "host"));
    }

    @ConvertedMethod
    protected Object port(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("input").value(),
                        "getOption",
                        ServeCommand.class,
                        "port"));
    }

    @ConvertedMethod
    protected Object getOptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                0,
                                ZVal.newArray(
                                        new ZPair(0, "host"),
                                        new ZPair(1, ZVal.getNull()),
                                        new ZPair(2, InputOption.CONST_VALUE_OPTIONAL),
                                        new ZPair(
                                                3, "The host address to serve the application on."),
                                        new ZPair(4, "127.0.0.1"))),
                        new ZPair(
                                1,
                                ZVal.newArray(
                                        new ZPair(0, "port"),
                                        new ZPair(1, ZVal.getNull()),
                                        new ZPair(2, InputOption.CONST_VALUE_OPTIONAL),
                                        new ZPair(3, "The port to serve the application on."),
                                        new ZPair(4, 8000)))));
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Console\\ServeCommand";

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
                    .setName("Illuminate\\Foundation\\Console\\ServeCommand")
                    .setLookup(
                            ServeCommand.class,
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
                            "name",
                            "output",
                            "processTitle",
                            "signature",
                            "synopsis",
                            "usages",
                            "verbosity",
                            "verbosityMap")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Console/ServeCommand.php")
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
