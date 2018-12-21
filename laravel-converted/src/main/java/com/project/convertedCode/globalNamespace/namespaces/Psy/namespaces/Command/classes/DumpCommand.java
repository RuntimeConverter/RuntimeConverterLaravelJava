package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionObject;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes.ReflectingCommand;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.VarDumper.classes.Presenter;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.VarDumper.classes.PresenterAware;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Input.classes.CodeArgument;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Command/DumpCommand.php

*/

public class DumpCommand extends ReflectingCommand implements PresenterAware {

    public Object presenter = null;

    public DumpCommand(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DumpCommand.class) {
            this.__construct(env, args);
        }
    }

    public DumpCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "presenter", typeHint = "Psy\\VarDumper\\Presenter")
    public Object setPresenter(RuntimeEnv env, Object... args) {
        Object presenter = assignParameter(args, 0, false);
        this.presenter = presenter;
        return null;
    }

    @ConvertedMethod
    protected Object configure(RuntimeEnv env, Object... args) {
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(this, "setName", DumpCommand.class, "dump"),
                                "setDefinition",
                                DumpCommand.class,
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                new CodeArgument(
                                                        env,
                                                        "target",
                                                        CodeArgument.CONST_REQUIRED,
                                                        "A target object or primitive to dump.")),
                                        new ZPair(
                                                1,
                                                new InputOption(
                                                        env,
                                                        "depth",
                                                        "",
                                                        InputOption.CONST_VALUE_REQUIRED,
                                                        "Depth to parse.",
                                                        10)),
                                        new ZPair(
                                                2,
                                                new InputOption(
                                                        env,
                                                        "all",
                                                        "a",
                                                        InputOption.CONST_VALUE_NONE,
                                                        "Include private and protected methods and properties.")))),
                        "setDescription",
                        DumpCommand.class,
                        "Dump an object or primitive."),
                "setHelp",
                DumpCommand.class,
                "Dump an object or primitive.\n\nThis is like var_dump but <strong>way</strong> awesomer.\n\ne.g.\n<return>>>> dump $_</return>\n<return>>>> dump $someVar</return>\n<return>>>> dump $stuff->getAll()</return>");
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
        Object depth = null;
        Object target = null;
        depth = env.callMethod(input, "getOption", DumpCommand.class, "depth");
        target =
                env.callMethod(
                        this,
                        "resolveCode",
                        DumpCommand.class,
                        env.callMethod(input, "getArgument", DumpCommand.class, "target"));
        env.callMethod(
                output,
                "page",
                DumpCommand.class,
                env.callMethod(
                        this.presenter,
                        "present",
                        DumpCommand.class,
                        target,
                        depth,
                        ZVal.isTrue(env.callMethod(input, "getOption", DumpCommand.class, "all"))
                                ? Presenter.CONST_VERBOSE
                                : 0));
        if (function_is_object.f.env(env).call(target).getBool()) {
            env.callMethod(
                    this,
                    "setCommandScopeVariables",
                    DumpCommand.class,
                    new ReflectionObject(env, target));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object resolveTarget(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        NamespaceGlobal.trigger_error
                .env(env)
                .call("`resolveTarget` is deprecated; use `resolveCode` instead.", 16384)
                .value();
        return ZVal.assign(env.callMethod(this, "resolveCode", DumpCommand.class, name));
    }

    public static final Object CONST_class = "Psy\\Command\\DumpCommand";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ReflectingCommand.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Command\\DumpCommand")
                    .setLookup(
                            DumpCommand.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "aliases",
                            "application",
                            "applicationDefinitionMerged",
                            "applicationDefinitionMergedWithArgs",
                            "code",
                            "context",
                            "definition",
                            "description",
                            "help",
                            "helperSet",
                            "hidden",
                            "ignoreValidationErrors",
                            "name",
                            "presenter",
                            "processTitle",
                            "synopsis",
                            "usages")
                    .setFilename("vendor/psy/psysh/src/Command/DumpCommand.php")
                    .addInterface("Psy\\VarDumper\\PresenterAware")
                    .addInterface("Psy\\ContextAware")
                    .addExtendsClass("Psy\\Command\\ReflectingCommand")
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
