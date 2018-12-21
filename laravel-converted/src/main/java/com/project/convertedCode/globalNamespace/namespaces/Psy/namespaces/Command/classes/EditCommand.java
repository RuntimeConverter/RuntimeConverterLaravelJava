package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.UnexpectedValueException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputArgument;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.ContextAware;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Command/EditCommand.php

*/

public class EditCommand extends Command implements ContextAware {

    public Object runtimeDir = "";

    public Object context = null;

    public EditCommand(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == EditCommand.class) {
            this.__construct(env, args);
        }
    }

    public EditCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "runtimeDir")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object runtimeDir = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        super.__construct(env, name);
        this.runtimeDir = runtimeDir;
        return null;
    }

    @ConvertedMethod
    protected Object configure(RuntimeEnv env, Object... args) {
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(this, "setName", EditCommand.class, "edit"),
                                "setDefinition",
                                EditCommand.class,
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                new InputArgument(
                                                        env,
                                                        "file",
                                                        InputArgument.CONST_OPTIONAL,
                                                        "The file to open for editing. If this is not given, edits a temporary file.",
                                                        ZVal.getNull())),
                                        new ZPair(
                                                1,
                                                new InputOption(
                                                        env,
                                                        "exec",
                                                        "e",
                                                        InputOption.CONST_VALUE_NONE,
                                                        "Execute the file content after editing. This is the default when a file name argument is not given.",
                                                        ZVal.getNull())),
                                        new ZPair(
                                                2,
                                                new InputOption(
                                                        env,
                                                        "no-exec",
                                                        "E",
                                                        InputOption.CONST_VALUE_NONE,
                                                        "Do not execute the file content after editing. This is the default when a file name argument is given.",
                                                        ZVal.getNull())))),
                        "setDescription",
                        EditCommand.class,
                        "Open an external editor. Afterwards, get produced code in input buffer."),
                "setHelp",
                EditCommand.class,
                "Set the EDITOR environment variable to something you'd like to use.");
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
        Object filePath = null;
        Object shouldRemoveFile = null;
        Object execute = null;
        Object editedContent = null;
        if (ZVal.toBool(env.callMethod(input, "getOption", EditCommand.class, "exec"))
                && ZVal.toBool(env.callMethod(input, "getOption", EditCommand.class, "no-exec"))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "The --exec and --no-exec flags are mutually exclusive"));
        }

        filePath =
                this.extractFilePath(
                        env, env.callMethod(input, "getArgument", EditCommand.class, "file"));
        execute =
                this.shouldExecuteFile(
                        env,
                        env.callMethod(input, "getOption", EditCommand.class, "exec"),
                        env.callMethod(input, "getOption", EditCommand.class, "no-exec"),
                        filePath);
        shouldRemoveFile = false;
        if (ZVal.strictEqualityCheck(filePath, "===", ZVal.getNull())) {
            filePath =
                    NamespaceGlobal.tempnam
                            .env(env)
                            .call(this.runtimeDir, "psysh-edit-command")
                            .value();
            shouldRemoveFile = true;
        }

        editedContent = this.editFile(env, filePath, shouldRemoveFile);
        if (ZVal.isTrue(execute)) {
            env.callMethod(
                    env.callMethod(this, "getApplication", EditCommand.class),
                    "addInput",
                    EditCommand.class,
                    editedContent);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "execOption")
    @ConvertedParameter(index = 1, name = "noExecOption")
    @ConvertedParameter(index = 2, name = "filePath")
    private Object shouldExecuteFile(RuntimeEnv env, Object... args) {
        Object execOption = assignParameter(args, 0, false);
        Object noExecOption = assignParameter(args, 1, false);
        Object filePath = assignParameter(args, 2, false);
        if (ZVal.isTrue(execOption)) {
            return ZVal.assign(true);
        }

        if (ZVal.isTrue(noExecOption)) {
            return ZVal.assign(false);
        }

        return ZVal.assign(ZVal.strictEqualityCheck(filePath, "===", ZVal.getNull()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fileArgument")
    private Object extractFilePath(RuntimeEnv env, Object... args) {
        ReferenceContainer fileArgument =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                fileArgument.getObject(), "!==", ZVal.getNull()))
                                && ZVal.toBool(
                                        ZVal.isGreaterThan(
                                                function_strlen
                                                        .f
                                                        .env(env)
                                                        .call(fileArgument.getObject())
                                                        .value(),
                                                '>',
                                                0)))
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(fileArgument.arrayGet(env, 0), "===", "$"))) {
            fileArgument.setObject(
                    env.callMethod(
                            this.context,
                            "get",
                            EditCommand.class,
                            function_preg_replace
                                    .f
                                    .env(env)
                                    .call("/^\\$/", "", fileArgument.getObject())
                                    .value()));
        }

        return ZVal.assign(fileArgument.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filePath")
    @ConvertedParameter(index = 1, name = "shouldRemoveFile")
    private Object editFile(RuntimeEnv env, Object... args) {
        Object filePath = assignParameter(args, 0, false);
        Object shouldRemoveFile = assignParameter(args, 1, false);
        Object proc = null;
        Object escapedFilePath = null;
        Object ternaryExpressionTemp = null;
        ReferenceContainer pipes = new BasicReferenceContainer(null);
        Object editedContent = null;
        escapedFilePath = NamespaceGlobal.escapeshellarg.env(env).call(filePath).value();
        pipes.setObject(ZVal.newArray());
        proc =
                NamespaceGlobal.proc_open
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(2, pipes))
                        .call(
                                toStringR(
                                                ZVal.isTrue(
                                                                ternaryExpressionTemp =
                                                                        NamespaceGlobal.getenv
                                                                                .env(env)
                                                                                .call("EDITOR")
                                                                                .value())
                                                        ? ternaryExpressionTemp
                                                        : "nano",
                                                env)
                                        + toStringR(" " + toStringR(escapedFilePath, env), env),
                                ZVal.newArray(
                                        new ZPair(0, function_constant.get(env, "STDIN")),
                                        new ZPair(1, function_constant.get(env, "STDOUT")),
                                        new ZPair(2, function_constant.get(env, "STDERR"))),
                                pipes.getObject())
                        .value();
        NamespaceGlobal.proc_close.env(env).call(proc);
        editedContent = function_file_get_contents.f.env(env).call(filePath).value();
        if (ZVal.isTrue(shouldRemoveFile)) {
            NamespaceGlobal.unlink.env(env).call(filePath).value();
        }

        if (ZVal.strictEqualityCheck(editedContent, "===", false)) {
            throw ZVal.getException(
                    env,
                    new UnexpectedValueException(
                            env, "Reading " + toStringR(filePath, env) + " returned false"));
        }

        return ZVal.assign(editedContent);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "context", typeHint = "Psy\\Context")
    public Object setContext(RuntimeEnv env, Object... args) {
        Object context = assignParameter(args, 0, false);
        this.context = context;
        return null;
    }

    public static final Object CONST_class = "Psy\\Command\\EditCommand";

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
                    .setName("Psy\\Command\\EditCommand")
                    .setLookup(
                            EditCommand.class,
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
                            "processTitle",
                            "runtimeDir",
                            "synopsis",
                            "usages")
                    .setFilename("vendor/psy/psysh/src/Command/EditCommand.php")
                    .addInterface("Psy\\ContextAware")
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
