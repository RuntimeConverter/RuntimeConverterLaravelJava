package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.GeneratorCommand;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.functions.resource_path;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Console/MailMakeCommand.php

*/

public class MailMakeCommand extends GeneratorCommand {

    public MailMakeCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.name = "make:mail";
        this.description = "Create a new email class";
        this.type = "Mail";
        if (this.getClass() == MailMakeCommand.class) {
            this.__construct(env, args);
        }
    }

    public MailMakeCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        if (ZVal.toBool(ZVal.strictEqualityCheck(super.handle(env), "===", false))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(this, "option", MailMakeCommand.class, "force")))) {
            return null;
        }

        if (ZVal.isTrue(env.callMethod(this, "option", MailMakeCommand.class, "markdown"))) {
            this.writeMarkdownTemplate(env);
        }

        return null;
    }

    @ConvertedMethod
    protected Object writeMarkdownTemplate(RuntimeEnv env, Object... args) {
        Object path = null;
        path =
                toStringR(
                                resource_path
                                        .f
                                        .env(env)
                                        .call(
                                                "views/"
                                                        + toStringR(
                                                                function_str_replace
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                ".",
                                                                                "/",
                                                                                env.callMethod(
                                                                                        this,
                                                                                        "option",
                                                                                        MailMakeCommand
                                                                                                .class,
                                                                                        "markdown"))
                                                                        .value(),
                                                                env))
                                        .value(),
                                env)
                        + ".blade.php";
        if (!ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("files").value(),
                        "isDirectory",
                        MailMakeCommand.class,
                        function_dirname.f.env(env).call(path).value()))) {
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("files").value(),
                    "makeDirectory",
                    MailMakeCommand.class,
                    function_dirname.f.env(env).call(path).value(),
                    493,
                    true);
        }

        env.callMethod(
                toObjectR(this).accessProp(this, env).name("files").value(),
                "put",
                MailMakeCommand.class,
                path,
                function_file_get_contents
                        .f
                        .env(env)
                        .call(
                                toStringR(
                                                env.addRootFilesystemPrefix(
                                                        "/vendor/laravel/framework/src/Illuminate/Foundation/Console"),
                                                env)
                                        + "/stubs/markdown.stub")
                        .value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object buildClass(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object _pClass = null;
        _pClass = super.buildClass(env, name);
        if (ZVal.isTrue(env.callMethod(this, "option", MailMakeCommand.class, "markdown"))) {
            _pClass =
                    function_str_replace
                            .f
                            .env(env)
                            .call(
                                    "DummyView",
                                    env.callMethod(
                                            this, "option", MailMakeCommand.class, "markdown"),
                                    _pClass)
                            .value();
        }

        return ZVal.assign(_pClass);
    }

    @ConvertedMethod
    protected Object getStub(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isTrue(env.callMethod(this, "option", MailMakeCommand.class, "markdown"))
                        ? toStringR(
                                        env.addRootFilesystemPrefix(
                                                "/vendor/laravel/framework/src/Illuminate/Foundation/Console"),
                                        env)
                                + "/stubs/markdown-mail.stub"
                        : toStringR(
                                        env.addRootFilesystemPrefix(
                                                "/vendor/laravel/framework/src/Illuminate/Foundation/Console"),
                                        env)
                                + "/stubs/mail.stub");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rootNamespace")
    protected Object getDefaultNamespace(RuntimeEnv env, Object... args) {
        Object rootNamespace = assignParameter(args, 0, false);
        return ZVal.assign(toStringR(rootNamespace, env) + "\\Mail");
    }

    @ConvertedMethod
    protected Object getOptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                0,
                                ZVal.newArray(
                                        new ZPair(0, "force"),
                                        new ZPair(1, "f"),
                                        new ZPair(2, InputOption.CONST_VALUE_NONE),
                                        new ZPair(
                                                3,
                                                "Create the class even if the mailable already exists."))),
                        new ZPair(
                                1,
                                ZVal.newArray(
                                        new ZPair(0, "markdown"),
                                        new ZPair(1, "m"),
                                        new ZPair(2, InputOption.CONST_VALUE_OPTIONAL),
                                        new ZPair(
                                                3,
                                                "Create a new Markdown template for the mailable.")))));
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Console\\MailMakeCommand";

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
                    .setName("Illuminate\\Foundation\\Console\\MailMakeCommand")
                    .setLookup(
                            MailMakeCommand.class,
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
                            "vendor/laravel/framework/src/Illuminate/Foundation/Console/MailMakeCommand.php")
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
