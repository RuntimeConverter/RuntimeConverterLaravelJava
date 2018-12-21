package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputArgument;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import java.lang.Class;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Command/HelpCommand.php

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
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(this, "setName", HelpCommand.class, "help"),
                                        "setAliases",
                                        HelpCommand.class,
                                        ZVal.arrayFromList("?")),
                                "setDefinition",
                                HelpCommand.class,
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                new InputArgument(
                                                        env,
                                                        "command_name",
                                                        InputArgument.CONST_OPTIONAL,
                                                        "The command name.",
                                                        ZVal.getNull())))),
                        "setDescription",
                        HelpCommand.class,
                        "Show a list of commands. Type `help [foo]` for information about [foo]."),
                "setHelp",
                HelpCommand.class,
                "My. How meta.");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
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
        int runtimeConverterContinueCount;
        Object input = assignParameter(args, 0, false);
        Object output = assignParameter(args, 1, false);
        Object aliases = null;
        Object name = null;
        Object commands = null;
        Object table = null;
        Object command = null;
        if (ZVal.strictNotEqualityCheck(this.command, "!==", ZVal.getNull())) {
            env.callMethod(
                    output,
                    "page",
                    HelpCommand.class,
                    env.callMethod(this.command, "asText", HelpCommand.class));
            this.command = ZVal.getNull();

        } else if (ZVal.isTrue(
                name = env.callMethod(input, "getArgument", HelpCommand.class, "command_name"))) {
            env.callMethod(
                    output,
                    "page",
                    HelpCommand.class,
                    env.callMethod(
                            env.callMethod(
                                    env.callMethod(this, "getApplication", HelpCommand.class),
                                    "get",
                                    HelpCommand.class,
                                    name),
                            "asText",
                            HelpCommand.class));

        } else {
            commands =
                    env.callMethod(
                            env.callMethod(this, "getApplication", HelpCommand.class),
                            "all",
                            HelpCommand.class);
            table = env.callMethod(this, "getTable", HelpCommand.class, output);
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1358 : ZVal.getIterable(commands, env, false)) {
                name = ZVal.assign(zpairResult1358.getKey());
                command = ZVal.assign(zpairResult1358.getValue());
                if (ZVal.strictNotEqualityCheck(
                        name, "!==", env.callMethod(command, "getName", HelpCommand.class))) {
                    continue;
                }

                if (ZVal.isTrue(env.callMethod(command, "getAliases", HelpCommand.class))) {
                    aliases =
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "<comment>Aliases:</comment> %s",
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call(
                                                            ", ",
                                                            env.callMethod(
                                                                    command,
                                                                    "getAliases",
                                                                    HelpCommand.class))
                                                    .value())
                                    .value();

                } else {
                    aliases = "";
                }

                env.callMethod(
                        table,
                        "addRow",
                        HelpCommand.class,
                        ZVal.newArray(
                                new ZPair(
                                        0,
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call("<info>%s</info>", name)
                                                .value()),
                                new ZPair(
                                        1,
                                        env.callMethod(
                                                command, "getDescription", HelpCommand.class)),
                                new ZPair(2, aliases)));
            }

            env.callMethod(output, "startPaging", HelpCommand.class);
            if (ZVal.isTrue(ZVal.checkInstanceType(table, (Class) null, "TableHelper", env))) {
                env.callMethod(table, "render", HelpCommand.class, output);

            } else {
                env.callMethod(table, "render", HelpCommand.class);
            }

            env.callMethod(output, "stopPaging", HelpCommand.class);
        }

        return null;
    }

    public static final Object CONST_class = "Psy\\Command\\HelpCommand";

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
                    .setName("Psy\\Command\\HelpCommand")
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
                    .setFilename("vendor/psy/psysh/src/Command/HelpCommand.php")
                    .addExtendsClass("Psy\\Command\\Command")
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
