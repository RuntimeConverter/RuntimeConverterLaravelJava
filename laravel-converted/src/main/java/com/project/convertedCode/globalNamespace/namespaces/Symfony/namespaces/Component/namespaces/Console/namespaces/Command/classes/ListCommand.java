package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Command.classes;

import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputDefinition;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputArgument;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes.DescriptorHelper;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Command.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Command/ListCommand.php

*/

public class ListCommand extends Command {

    public ListCommand(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ListCommand.class) {
            this.__construct(env, args);
        }
    }

    public ListCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    protected Object configure(RuntimeEnv env, Object... args) {
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(this, "setName", ListCommand.class, "list"),
                                "setDefinition",
                                ListCommand.class,
                                this.createDefinition(env)),
                        "setDescription",
                        ListCommand.class,
                        "Lists commands"),
                "setHelp",
                ListCommand.class,
                "The <info>%command.name%</info> command lists all commands:\n\n  <info>php %command.full_name%</info>\n\nYou can also display the commands for a specific namespace:\n\n  <info>php %command.full_name% test</info>\n\nYou can also output the information in other formats by using the <comment>--format</comment> option:\n\n  <info>php %command.full_name% --format=xml</info>\n\nIt's also possible to get raw list of commands (useful for embedding command runner):\n\n  <info>php %command.full_name% --raw</info>");
        return null;
    }

    @ConvertedMethod
    public Object getNativeDefinition(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.createDefinition(env));
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
        Object input = assignParameter(args, 0, false);
        Object output = assignParameter(args, 1, false);
        Object helper = null;
        helper = new DescriptorHelper(env);
        env.callMethod(
                helper,
                "describe",
                ListCommand.class,
                output,
                env.callMethod(this, "getApplication", ListCommand.class),
                ZVal.newArray(
                        new ZPair(
                                "format",
                                env.callMethod(input, "getOption", ListCommand.class, "format")),
                        new ZPair(
                                "raw_text",
                                env.callMethod(input, "getOption", ListCommand.class, "raw")),
                        new ZPair(
                                "namespace",
                                env.callMethod(
                                        input, "getArgument", ListCommand.class, "namespace"))));
        return null;
    }

    @ConvertedMethod
    private Object createDefinition(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new InputDefinition(
                        env,
                        ZVal.newArray(
                                new ZPair(
                                        0,
                                        new InputArgument(
                                                env,
                                                "namespace",
                                                InputArgument.CONST_OPTIONAL,
                                                "The namespace name")),
                                new ZPair(
                                        1,
                                        new InputOption(
                                                env,
                                                "raw",
                                                ZVal.getNull(),
                                                InputOption.CONST_VALUE_NONE,
                                                "To output raw command list")),
                                new ZPair(
                                        2,
                                        new InputOption(
                                                env,
                                                "format",
                                                ZVal.getNull(),
                                                InputOption.CONST_VALUE_REQUIRED,
                                                "The output format (txt, xml, json, or md)",
                                                "txt")))));
    }

    public static final Object CONST_class = "Symfony\\Component\\Console\\Command\\ListCommand";

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
                    .setName("Symfony\\Component\\Console\\Command\\ListCommand")
                    .setLookup(
                            ListCommand.class,
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
                            "help",
                            "helperSet",
                            "hidden",
                            "ignoreValidationErrors",
                            "name",
                            "processTitle",
                            "synopsis",
                            "usages")
                    .setFilename("vendor/symfony/console/Command/ListCommand.php")
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
