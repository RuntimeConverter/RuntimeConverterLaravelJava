package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Command.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.RecursiveDirectoryIterator;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.FilesystemIterator;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fread;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.RuntimeException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.arrays.RuntimeIterable;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_file;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.spl.files.SplFileInfo;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.RecursiveIteratorIterator;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMDocument;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_walk;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Command.classes.Command;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Style.classes.SymfonyStyle;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/Command/XliffLintCommand.php

*/

public class XliffLintCommand extends Command {

    public Object format = null;

    public Object displayCorrectFiles = null;

    public Object directoryIteratorProvider = null;

    public Object isReadableProvider = null;

    public XliffLintCommand(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == XliffLintCommand.class) {
            this.__construct(env, args);
        }
    }

    public XliffLintCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "name",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "directoryIteratorProvider",
        typeHint = "callable",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "isReadableProvider",
        typeHint = "callable",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object directoryIteratorProvider = assignParameter(args, 1, true);
        if (null == directoryIteratorProvider) {
            directoryIteratorProvider = ZVal.getNull();
        }
        Object isReadableProvider = assignParameter(args, 2, true);
        if (null == isReadableProvider) {
            isReadableProvider = ZVal.getNull();
        }
        super.__construct(env, name);
        this.directoryIteratorProvider = directoryIteratorProvider;
        this.isReadableProvider = isReadableProvider;
        return null;
    }

    @ConvertedMethod
    protected Object configure(RuntimeEnv env, Object... args) {
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        this,
                                        "setDescription",
                                        XliffLintCommand.class,
                                        "Lints a XLIFF file and outputs encountered errors"),
                                "addArgument",
                                XliffLintCommand.class,
                                "filename",
                                ZVal.getNull(),
                                "A file or a directory or STDIN"),
                        "addOption",
                        XliffLintCommand.class,
                        "format",
                        ZVal.getNull(),
                        InputOption.CONST_VALUE_REQUIRED,
                        "The output format",
                        "txt"),
                "setHelp",
                XliffLintCommand.class,
                "The <info>%command.name%</info> command lints a XLIFF file and outputs to STDOUT\nthe first encountered syntax error.\n\nYou can validates XLIFF contents passed from STDIN:\n\n  <info>cat filename | php %command.full_name%</info>\n\nYou can also validate the syntax of a file:\n\n  <info>php %command.full_name% filename</info>\n\nOr of a whole directory:\n\n  <info>php %command.full_name% dirname</info>\n  <info>php %command.full_name% dirname --format=json</info>\n");
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
        Object stdin = null;
        Object filename = null;
        Object file = null;
        ReferenceContainer filesInfo = new BasicReferenceContainer(null);
        Object io = null;
        io = new SymfonyStyle(env, input, output);
        filename = env.callMethod(input, "getArgument", XliffLintCommand.class, "filename");
        this.format = env.callMethod(input, "getOption", XliffLintCommand.class, "format");
        this.displayCorrectFiles = env.callMethod(output, "isVerbose", XliffLintCommand.class);
        if (!ZVal.isTrue(filename)) {
            if (!ZVal.isTrue(stdin = this.getStdin(env))) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env, "Please provide a filename or pipe file content to STDIN."));
            }

            return ZVal.assign(
                    this.display(env, io, ZVal.newArray(new ZPair(0, this.validate(env, stdin)))));
        }

        if (!ZVal.isTrue(this.isReadable(env, filename))) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("File or directory \"%s\" is not readable.", filename)
                                    .value()));
        }

        filesInfo.setObject(ZVal.newArray());
        for (ZPair zpairResult2104 : ZVal.getIterable(this.getFiles(env, filename), env, true)) {
            file = ZVal.assign(zpairResult2104.getValue());
            filesInfo
                    .arrayAppend(env)
                    .set(
                            this.validate(
                                    env,
                                    function_file_get_contents.f.env(env).call(file).value(),
                                    file));
        }

        return ZVal.assign(this.display(env, io, filesInfo.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content")
    @ConvertedParameter(
        index = 1,
        name = "file",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    private Object validate(RuntimeEnv env, Object... args) {
        Object content = assignParameter(args, 0, false);
        Object file = assignParameter(args, 1, true);
        if (null == file) {
            file = ZVal.getNull();
        }
        Object xmlError = null;
        Object targetLanguage = null;
        Object document = null;
        Object ternaryExpressionTemp = null;
        Object expectedFileExtension = null;
        ReferenceContainer errors = new BasicReferenceContainer(null);
        Object realFileExtension = null;
        errors.setObject(ZVal.newArray());
        if (ZVal.strictEqualityCheck("", "===", function_trim.f.env(env).call(content).value())) {
            return ZVal.assign(ZVal.newArray(new ZPair("file", file), new ZPair("valid", true)));
        }

        NamespaceGlobal.libxml_use_internal_errors.env(env).call(true);
        document = new DOMDocument(env);
        env.callMethod(document, "loadXML", XliffLintCommand.class, content);
        if (ZVal.strictNotEqualityCheck(
                ZVal.getNull(),
                "!==",
                targetLanguage = this.getTargetLanguageFromFile(env, document))) {
            expectedFileExtension =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "%s.xlf",
                                    function_str_replace
                                            .f
                                            .env(env)
                                            .call("-", "_", targetLanguage)
                                            .value())
                            .value();
            realFileExtension =
                    ZVal.assign(
                            ZVal.isDefined(
                                            ternaryExpressionTemp =
                                                    handleReturnReference(
                                                                    function_explode
                                                                            .f
                                                                            .env(env)
                                                                            .call(
                                                                                    ".",
                                                                                    NamespaceGlobal
                                                                                            .basename
                                                                                            .env(
                                                                                                    env)
                                                                                            .call(
                                                                                                    file)
                                                                                            .value(),
                                                                                    2)
                                                                            .value())
                                                            .arrayGet(env, 1))
                                    ? ternaryExpressionTemp
                                    : "");
            if (ZVal.strictNotEqualityCheck(expectedFileExtension, "!==", realFileExtension)) {
                errors.arrayAppend(env)
                        .set(
                                ZVal.newArray(
                                        new ZPair("line", -1),
                                        new ZPair("column", -1),
                                        new ZPair(
                                                "message",
                                                function_sprintf
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "There is a mismatch between the file extension (\"%s\") and the \"%s\" value used in the \"target-language\" attribute of the file.",
                                                                realFileExtension, targetLanguage)
                                                        .value())));
            }
        }

        env.callMethod(
                document,
                "schemaValidate",
                XliffLintCommand.class,
                toStringR(env.addRootFilesystemPrefix("/vendor/symfony/translation/Command"), env)
                        + "/../Resources/schemas/xliff-core-1.2-strict.xsd");
        for (ZPair zpairResult2105 :
                ZVal.getIterable(
                        NamespaceGlobal.libxml_get_errors.env(env).call().value(), env, true)) {
            xmlError = ZVal.assign(zpairResult2105.getValue());
            errors.arrayAppend(env)
                    .set(
                            ZVal.newArray(
                                    new ZPair(
                                            "line",
                                            toObjectR(xmlError)
                                                    .accessProp(this, env)
                                                    .name("line")
                                                    .value()),
                                    new ZPair(
                                            "column",
                                            toObjectR(xmlError)
                                                    .accessProp(this, env)
                                                    .name("column")
                                                    .value()),
                                    new ZPair(
                                            "message",
                                            function_trim
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            toObjectR(xmlError)
                                                                    .accessProp(this, env)
                                                                    .name("message")
                                                                    .value())
                                                    .value())));
        }

        NamespaceGlobal.libxml_clear_errors.env(env).call();
        NamespaceGlobal.libxml_use_internal_errors.env(env).call(false);
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("file", file),
                        new ZPair(
                                "valid",
                                ZVal.strictEqualityCheck(
                                        0,
                                        "===",
                                        function_count
                                                .f
                                                .env(env)
                                                .call(errors.getObject())
                                                .value())),
                        new ZPair("messages", errors.getObject())));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "io",
        typeHint = "Symfony\\Component\\Console\\Style\\SymfonyStyle"
    )
    @ConvertedParameter(index = 1, name = "files", typeHint = "array")
    private Object display(RuntimeEnv env, Object... args) {
        Object io = assignParameter(args, 0, false);
        Object files = assignParameter(args, 1, false);
        SwitchEnumType137 switchVariable137 =
                ZVal.getEnum(
                        this.format,
                        SwitchEnumType137.DEFAULT_CASE,
                        SwitchEnumType137.STRING_txt,
                        "txt",
                        SwitchEnumType137.STRING_json,
                        "json");
        switch (switchVariable137) {
            case STRING_txt:
                return ZVal.assign(this.displayTxt(env, io, files));
            case STRING_json:
                return ZVal.assign(this.displayJson(env, io, files));
            case DEFAULT_CASE:
                throw ZVal.getException(
                        env,
                        env.createNew(
                                ZVal.resolveClassAlias(env, "InvalidArgumentException"),
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("The format \"%s\" is not supported.", this.format)
                                        .value()));
        }
        ;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "io",
        typeHint = "Symfony\\Component\\Console\\Style\\SymfonyStyle"
    )
    @ConvertedParameter(index = 1, name = "filesInfo", typeHint = "array")
    private Object displayTxt(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/translation/Command")
                        .setFile("/vendor/symfony/translation/Command/XliffLintCommand.php");
        Object io = assignParameter(args, 0, false);
        Object filesInfo = assignParameter(args, 1, false);
        ReferenceContainer erroredFiles = new BasicReferenceContainer(null);
        Object countFiles = null;
        ReferenceContainer info = new BasicReferenceContainer(null);
        countFiles = function_count.f.env(env).call(filesInfo).value();
        erroredFiles.setObject(0);
        for (ZPair zpairResult2106 : ZVal.getIterable(filesInfo, env, true)) {
            info.setObject(ZVal.assign(zpairResult2106.getValue()));
            if (ZVal.toBool(info.arrayGet(env, "valid")) && ZVal.toBool(this.displayCorrectFiles)) {
                env.callMethod(
                        io,
                        "comment",
                        XliffLintCommand.class,
                        "<info>OK</info>"
                                + toStringR(
                                        ZVal.isTrue(info.arrayGet(env, "file"))
                                                ? function_sprintf
                                                        .f
                                                        .env(env)
                                                        .call(" in %s", info.arrayGet(env, "file"))
                                                        .value()
                                                : "",
                                        env));

            } else if (!ZVal.isTrue(info.arrayGet(env, "valid"))) {
                erroredFiles.setObject(ZVal.increment(erroredFiles.getObject()));
                env.callMethod(
                        io,
                        "text",
                        XliffLintCommand.class,
                        "<error> ERROR </error>"
                                + toStringR(
                                        ZVal.isTrue(info.arrayGet(env, "file"))
                                                ? function_sprintf
                                                        .f
                                                        .env(env)
                                                        .call(" in %s", info.arrayGet(env, "file"))
                                                        .value()
                                                : "",
                                        env));
                env.callMethod(
                        io,
                        "listing",
                        XliffLintCommand.class,
                        function_array_map
                                .f
                                .env(env)
                                .call(
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Symfony\\Component\\Translation\\Command",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            @ConvertedParameter(index = 0, name = "error")
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                ReferenceContainer error =
                                                        new BasicReferenceContainer(
                                                                assignParameter(args, 0, false));
                                                return ZVal.assign(
                                                        ZVal.strictEqualityCheck(
                                                                        -1,
                                                                        "===",
                                                                        error.arrayGet(env, "line"))
                                                                ? error.arrayGet(env, "message")
                                                                : function_sprintf
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                "Line %d, Column %d: %s",
                                                                                error.arrayGet(
                                                                                        env,
                                                                                        "line"),
                                                                                error.arrayGet(
                                                                                        env,
                                                                                        "column"),
                                                                                error.arrayGet(
                                                                                        env,
                                                                                        "message"))
                                                                        .value());
                                            }
                                        },
                                        info.arrayGet(env, "messages"))
                                .value());
            }
        }

        if (ZVal.strictEqualityCheck(0, "===", erroredFiles.getObject())) {
            env.callMethod(
                    io,
                    "success",
                    XliffLintCommand.class,
                    function_sprintf
                            .f
                            .env(env)
                            .call("All %d XLIFF files contain valid syntax.", countFiles)
                            .value());

        } else {
            env.callMethod(
                    io,
                    "warning",
                    XliffLintCommand.class,
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "%d XLIFF files have valid syntax and %d contain errors.",
                                    ZVal.subtract(countFiles, erroredFiles.getObject()),
                                    erroredFiles.getObject())
                            .value());
        }

        return ZVal.assign(NamespaceGlobal.min.env(env).call(erroredFiles.getObject(), 1).value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "io",
        typeHint = "Symfony\\Component\\Console\\Style\\SymfonyStyle"
    )
    @ConvertedParameter(index = 1, name = "filesInfo", typeHint = "array")
    private Object displayJson(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/translation/Command")
                        .setFile("/vendor/symfony/translation/Command/XliffLintCommand.php");
        Object io = assignParameter(args, 0, false);
        Object filesInfo = assignParameter(args, 1, false);
        ReferenceContainer errors = new BasicReferenceContainer(null);
        errors.setObject(0);
        function_array_walk
                .f
                .env(env)
                .call(
                        filesInfo,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Symfony\\Component\\Translation\\Command",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "v")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                ReferenceContainer v =
                                        assignParameterRef(
                                                runtimePassByReferenceArgs, args, 0, false);
                                ReferenceContainer errors = new BasicReferenceContainer(null);
                                errors = this.contextReferences.getReferenceContainer("errors");
                                v.arrayAccess(env, "file")
                                        .set(toStringR(v.arrayGet(env, "file"), env));
                                if (!ZVal.isTrue(v.arrayGet(env, "valid"))) {
                                    errors.setObject(ZVal.increment(errors.getObject()));
                                }

                                return null;
                            }
                        }.useRef("errors", errors));
        env.callMethod(
                io,
                "writeln",
                XliffLintCommand.class,
                NamespaceGlobal.json_encode
                        .env(env)
                        .call(filesInfo, ZVal.toLong(128) | ZVal.toLong(64))
                        .value());
        return ZVal.assign(NamespaceGlobal.min.env(env).call(errors.getObject(), 1).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fileOrDirectory")
    private Object getFiles(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        RuntimeIterable runtimeConverterYieldVariable = new RuntimeIterable(env);
        Object fileOrDirectory = assignParameter(args, 0, false);
        Object file = null;
        if (function_is_file.f.env(env).call(fileOrDirectory).getBool()) {
            runtimeConverterYieldVariable.add(new SplFileInfo(env, fileOrDirectory));
            return null;
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult2107 :
                ZVal.getIterable(this.getDirectoryIterator(env, fileOrDirectory), env, true)) {
            file = ZVal.assign(zpairResult2107.getValue());
            if (!function_in_array
                    .f
                    .env(env)
                    .call(
                            env.callMethod(file, "getExtension", XliffLintCommand.class),
                            ZVal.arrayFromList("xlf", "xliff"))
                    .getBool()) {
                continue;
            }

            runtimeConverterYieldVariable.add(file);
        }

        return runtimeConverterYieldVariable;
    }

    @ConvertedMethod
    private Object getStdin(RuntimeEnv env, Object... args) {
        Object inputs = null;
        if (ZVal.strictNotEqualityCheck(
                0,
                "!==",
                NamespaceGlobal.ftell.env(env).call(function_constant.get(env, "STDIN")).value())) {
            return null;
        }

        inputs = "";
        while (!NamespaceGlobal.feof.env(env).call(function_constant.get(env, "STDIN")).getBool()) {
            inputs =
                    toStringR(inputs, env)
                            + toStringR(
                                    function_fread
                                            .f
                                            .env(env)
                                            .call(function_constant.get(env, "STDIN"), 1024)
                                            .value(),
                                    env);
        }

        return ZVal.assign(inputs);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory")
    private Object getDirectoryIterator(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/translation/Command")
                        .setFile("/vendor/symfony/translation/Command/XliffLintCommand.php");
        ReferenceContainer directory = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object _pDefault = null;
        _pDefault =
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Symfony\\Component\\Translation\\Command",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "directory")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object directory = assignParameter(args, 0, false);
                        return ZVal.assign(
                                new RecursiveIteratorIterator(
                                        env,
                                        new RecursiveDirectoryIterator(
                                                env,
                                                directory,
                                                ZVal.toLong(4096) | ZVal.toLong(512)),
                                        0));
                    }
                };
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.directoryIteratorProvider)) {
            return ZVal.assign(
                    function_call_user_func
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(this.directoryIteratorProvider, directory.getObject(), _pDefault)
                            .value());
        }

        return ZVal.assign(
                env.callFunctionDynamic(
                                _pDefault,
                                new RuntimeArgsWithReferences().add(0, directory),
                                directory.getObject())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fileOrDirectory")
    private Object isReadable(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/translation/Command")
                        .setFile("/vendor/symfony/translation/Command/XliffLintCommand.php");
        ReferenceContainer fileOrDirectory =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        Object _pDefault = null;
        _pDefault =
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Symfony\\Component\\Translation\\Command",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "fileOrDirectory")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object fileOrDirectory = assignParameter(args, 0, false);
                        return ZVal.assign(
                                NamespaceGlobal.is_readable.env(env).call(fileOrDirectory).value());
                    }
                };
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.isReadableProvider)) {
            return ZVal.assign(
                    function_call_user_func
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(this.isReadableProvider, fileOrDirectory.getObject(), _pDefault)
                            .value());
        }

        return ZVal.assign(
                env.callFunctionDynamic(
                                _pDefault,
                                new RuntimeArgsWithReferences().add(0, fileOrDirectory),
                                fileOrDirectory.getObject())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "xliffContents", typeHint = "DOMDocument")
    private Object getTargetLanguageFromFile(RuntimeEnv env, Object... args) {
        Object xliffContents = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        Object attribute = null;
        for (ZPair zpairResult2108 :
                ZVal.getIterable(
                        ZVal.isDefined(
                                        ternaryExpressionTemp =
                                                toObjectR(
                                                                handleReturnReference(
                                                                                env.callMethod(
                                                                                        xliffContents,
                                                                                        "getElementsByTagName",
                                                                                        XliffLintCommand
                                                                                                .class,
                                                                                        "file"))
                                                                        .arrayGet(env, 0))
                                                        .accessProp(this, env)
                                                        .name("attributes")
                                                        .value())
                                ? ternaryExpressionTemp
                                : ZVal.newArray(),
                        env,
                        true)) {
            attribute = ZVal.assign(zpairResult2108.getValue());
            if (ZVal.strictEqualityCheck(
                    "target-language",
                    "===",
                    toObjectR(attribute).accessProp(this, env).name("nodeName").value())) {
                return ZVal.assign(
                        toObjectR(attribute).accessProp(this, env).name("nodeValue").value());
            }
        }

        return ZVal.assign(ZVal.getNull());
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\Command\\XliffLintCommand";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Command.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object defaultName = "lint:xliff";
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Translation\\Command\\XliffLintCommand")
                    .setLookup(
                            XliffLintCommand.class,
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
                            "directoryIteratorProvider",
                            "displayCorrectFiles",
                            "format",
                            "help",
                            "helperSet",
                            "hidden",
                            "ignoreValidationErrors",
                            "isReadableProvider",
                            "name",
                            "processTitle",
                            "synopsis",
                            "usages")
                    .setStaticPropertyNames("defaultName")
                    .setFilename("vendor/symfony/translation/Command/XliffLintCommand.php")
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

    private enum SwitchEnumType137 {
        STRING_txt,
        STRING_json,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
