package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Command.classes;

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

 vendor/symfony/console/Command/HelpCommand.php

*/

public class HelpCommand extends Command {

    public Object command = null;

    public HelpCommand(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == HelpCommand.class) {
            this.__construct(env, args);
        }
    }

    public HelpCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    protected Object configure(RuntimeEnv env, Object... args) {
        env.callMethod(this, "ignoreValidationErrors", HelpCommand.class);
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(this, "setName", HelpCommand.class, "help"),
                                "setDefinition",
                                HelpCommand.class,
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                new InputArgument(
                                                        env,
                                                        "command_name",
                                                        InputArgument.CONST_OPTIONAL,
                                                        "The command name",
                                                        "help")),
                                        new ZPair(
                                                1,
                                                new InputOption(
                                                        env,
                                                        "format",
                                                        ZVal.getNull(),
                                                        InputOption.CONST_VALUE_REQUIRED,
                                                        "The output format (txt, xml, json, or md)",
                                                        "txt")),
                                        new ZPair(
                                                2,
                                                new InputOption(
                                                        env,
                                                        "raw",
                                                        ZVal.getNull(),
                                                        InputOption.CONST_VALUE_NONE,
                                                        "To output raw command help")))),
                        "setDescription",
                        HelpCommand.class,
                        "Displays help for a command"),
                "setHelp",
                HelpCommand.class,
                "The <info>%command.name%</info> command displays help for a given command:\n\n  <info>php %command.full_name% list</info>\n\nYou can also output the help in other formats by using the <comment>--format</comment> option:\n\n  <info>php %command.full_name% --format=xml list</info>\n\nTo display the list of available commands, please use the <info>list</info> command.");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "command",
        typeHint = "Symfony\\Component\\Console\\Command\\Command"
    )
    public Object setCommand(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        this.command = command;
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
        Object input = assignParameter(args, 0, false);
        Object output = assignParameter(args, 1, false);
        Object helper = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.command)) {
            this.command =
                    env.callMethod(
                            env.callMethod(this, "getApplication", HelpCommand.class),
                            "find",
                            HelpCommand.class,
                            env.callMethod(
                                    input, "getArgument", HelpCommand.class, "command_name"));
        }

        helper = new DescriptorHelper(env);
        env.callMethod(
                helper,
                "describe",
                HelpCommand.class,
                output,
                this.command,
                ZVal.newArray(
                        new ZPair(
                                "format",
                                env.callMethod(input, "getOption", HelpCommand.class, "format")),
                        new ZPair(
                                "raw_text",
                                env.callMethod(input, "getOption", HelpCommand.class, "raw"))));
        this.command = ZVal.getNull();
        return null;
    }

    public static final Object CONST_class = "Symfony\\Component\\Console\\Command\\HelpCommand";

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
                    .setName("Symfony\\Component\\Console\\Command\\HelpCommand")
                    .setLookup(
                            HelpCommand.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "aliases",
                            "application",
                            "applicationDefinitionMerged",
                            "applicationDefinitionMergedWithArgs",
                            "code",
                            "command",
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
                    .setFilename("vendor/symfony/console/Command/HelpCommand.php")
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
