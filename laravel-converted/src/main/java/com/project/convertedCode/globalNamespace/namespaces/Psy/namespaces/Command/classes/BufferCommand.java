package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes;

import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Output.classes.ShellOutput;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Command/BufferCommand.php

*/

public class BufferCommand extends Command {

    public BufferCommand(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == BufferCommand.class) {
            this.__construct(env, args);
        }
    }

    public BufferCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    protected Object configure(RuntimeEnv env, Object... args) {
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                this, "setName", BufferCommand.class, "buffer"),
                                        "setAliases",
                                        BufferCommand.class,
                                        ZVal.arrayFromList("buf")),
                                "setDefinition",
                                BufferCommand.class,
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                new InputOption(
                                                        env,
                                                        "clear",
                                                        "",
                                                        InputOption.CONST_VALUE_NONE,
                                                        "Clear the current buffer.")))),
                        "setDescription",
                        BufferCommand.class,
                        "Show (or clear) the contents of the code input buffer."),
                "setHelp",
                BufferCommand.class,
                "Show the contents of the code buffer for the current multi-line expression.\n\nOptionally, clear the buffer by passing the <info>--clear</info> option.");
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
        Object buf = null;
        buf =
                env.callMethod(
                        env.callMethod(this, "getApplication", BufferCommand.class),
                        "getCodeBuffer",
                        BufferCommand.class);
        if (ZVal.isTrue(env.callMethod(input, "getOption", BufferCommand.class, "clear"))) {
            env.callMethod(
                    env.callMethod(this, "getApplication", BufferCommand.class),
                    "resetCodeBuffer",
                    BufferCommand.class);
            env.callMethod(
                    output,
                    "writeln",
                    BufferCommand.class,
                    this.formatLines(env, buf, "urgent"),
                    ShellOutput.CONST_NUMBER_LINES);

        } else {
            env.callMethod(
                    output,
                    "writeln",
                    BufferCommand.class,
                    this.formatLines(env, buf),
                    ShellOutput.CONST_NUMBER_LINES);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "lines", typeHint = "array")
    @ConvertedParameter(index = 1, name = "type")
    protected Object formatLines(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/psy/psysh/src/Command")
                        .setFile("/vendor/psy/psysh/src/Command/BufferCommand.php");
        Object lines = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = "return";
        }
        Object template = null;
        template = function_sprintf.f.env(env).call("<%s>%%s</%s>", type, type).value();
        return ZVal.assign(
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Psy\\Command",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "line")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object line = assignParameter(args, 0, false);
                                        Object template = null;
                                        template =
                                                this.contextReferences.getCapturedValue("template");
                                        return ZVal.assign(
                                                function_sprintf
                                                        .f
                                                        .env(env)
                                                        .call(template, line)
                                                        .value());
                                    }
                                }.use("template", template),
                                lines)
                        .value());
    }

    public static final Object CONST_class = "Psy\\Command\\BufferCommand";

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
                    .setName("Psy\\Command\\BufferCommand")
                    .setLookup(
                            BufferCommand.class,
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
                    .setFilename("vendor/psy/psysh/src/Command/BufferCommand.php")
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
