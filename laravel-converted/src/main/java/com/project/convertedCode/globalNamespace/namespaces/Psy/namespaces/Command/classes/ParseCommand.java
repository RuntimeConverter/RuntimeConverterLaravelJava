package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.ParserFactory;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Input.classes.CodeArgument;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.Error;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.Caster;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes.Command;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.ContextAware;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.VarDumper.classes.PresenterAware;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Command/ParseCommand.php

*/

public class ParseCommand extends Command implements ContextAware, PresenterAware {

    public Object context = null;

    public Object presenter = null;

    public Object parserFactory = null;

    public Object parsers = null;

    public ParseCommand(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ParseCommand.class) {
            this.__construct(env, args);
        }
    }

    public ParseCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        this.parserFactory = new ParserFactory(env);
        this.parsers = ZVal.newArray();
        super.__construct(env, name);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "context", typeHint = "Psy\\Context")
    public Object setContext(RuntimeEnv env, Object... args) {
        Object context = assignParameter(args, 0, false);
        this.context = context;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "presenter", typeHint = "Psy\\VarDumper\\Presenter")
    public Object setPresenter(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/psy/psysh/src/Command")
                        .setFile("/vendor/psy/psysh/src/Command/ParseCommand.php");
        Object presenter = assignParameter(args, 0, false);
        this.presenter = ((RuntimeClassInterface) presenter).phpClone(env);
        env.callMethod(
                this.presenter,
                "addCasters",
                ParseCommand.class,
                ZVal.newArray(
                        new ZPair(
                                "PhpParser\\Node",
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Psy\\Command",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(
                                        index = 0,
                                        name = "node",
                                        typeHint = "PhpParser\\Node"
                                    )
                                    @ConvertedParameter(index = 1, name = "a", typeHint = "array")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object node = assignParameter(args, 0, false);
                                        ReferenceContainer a =
                                                new BasicReferenceContainer(
                                                        assignParameter(args, 1, false));
                                        Object name = null;
                                        a.setObject(
                                                ZVal.newArray(
                                                        new ZPair(
                                                                toStringR(
                                                                                Caster
                                                                                        .CONST_PREFIX_VIRTUAL,
                                                                                env)
                                                                        + "type",
                                                                env.callMethod(
                                                                        node,
                                                                        "getType",
                                                                        ParseCommand.class)),
                                                        new ZPair(
                                                                toStringR(
                                                                                Caster
                                                                                        .CONST_PREFIX_VIRTUAL,
                                                                                env)
                                                                        + "attributes",
                                                                env.callMethod(
                                                                        node,
                                                                        "getAttributes",
                                                                        ParseCommand.class))));
                                        for (ZPair zpairResult1384 :
                                                ZVal.getIterable(
                                                        env.callMethod(
                                                                node,
                                                                "getSubNodeNames",
                                                                ParseCommand.class),
                                                        env,
                                                        true)) {
                                            name = ZVal.assign(zpairResult1384.getValue());
                                            a.arrayAccess(
                                                            env,
                                                            toStringR(
                                                                            Caster
                                                                                    .CONST_PREFIX_VIRTUAL,
                                                                            env)
                                                                    + toStringR(name, env))
                                                    .set(
                                                            toObjectR(node)
                                                                    .accessProp(this, env)
                                                                    .name(name)
                                                                    .value());
                                        }

                                        return ZVal.assign(a.getObject());
                                    }
                                })));
        return null;
    }

    @ConvertedMethod
    protected Object configure(RuntimeEnv env, Object... args) {
        Object msg = null;
        Object defaultKind = null;
        ReferenceContainer definition = new BasicReferenceContainer(null);
        definition.setObject(
                ZVal.newArray(
                        new ZPair(
                                0,
                                new CodeArgument(
                                        env,
                                        "code",
                                        CodeArgument.CONST_REQUIRED,
                                        "PHP code to parse.")),
                        new ZPair(
                                1,
                                new InputOption(
                                        env,
                                        "depth",
                                        "",
                                        InputOption.CONST_VALUE_REQUIRED,
                                        "Depth to parse.",
                                        10))));
        if (ZVal.isTrue(
                env.callMethod(this.parserFactory, "hasKindsSupport", ParseCommand.class))) {
            msg =
                    "One of PhpParser\\ParserFactory constants: "
                            + toStringR(
                                    NamespaceGlobal.implode
                                            .env(env)
                                            .call(
                                                    ", ",
                                                    ParserFactory.runtimeStaticObject
                                                            .getPossibleKinds(env))
                                            .value(),
                                    env)
                            + " (default is based on current interpreter's version).";
            defaultKind = env.callMethod(this.parserFactory, "getDefaultKind", ParseCommand.class);
            definition
                    .arrayAppend(env)
                    .set(
                            new InputOption(
                                    env,
                                    "kind",
                                    "",
                                    InputOption.CONST_VALUE_REQUIRED,
                                    msg,
                                    defaultKind));
        }

        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(this, "setName", ParseCommand.class, "parse"),
                                "setDefinition",
                                ParseCommand.class,
                                definition.getObject()),
                        "setDescription",
                        ParseCommand.class,
                        "Parse PHP code and show the abstract syntax tree."),
                "setHelp",
                ParseCommand.class,
                "Parse PHP code and show the abstract syntax tree.\n\nThis command is used in the development of PsySH. Given a string of PHP code,\nit pretty-prints the PHP Parser parse tree.\n\nSee https://github.com/nikic/PHP-Parser\n\nIt prolly won't be super useful for most of you, but it's here if you want to play.");
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
        Object code = null;
        Object depth = null;
        Object nodes = null;
        Object parserKind = null;
        code = env.callMethod(input, "getArgument", ParseCommand.class, "code");
        if (ZVal.strictEqualityCheck(
                function_strpos.f.env(env).call("<?", code).value(), "===", false)) {
            code = "<?php " + toStringR(code, env);
        }

        parserKind =
                ZVal.assign(
                        ZVal.isTrue(
                                        env.callMethod(
                                                this.parserFactory,
                                                "hasKindsSupport",
                                                ParseCommand.class))
                                ? env.callMethod(input, "getOption", ParseCommand.class, "kind")
                                : ZVal.getNull());
        depth = env.callMethod(input, "getOption", ParseCommand.class, "depth");
        nodes = this.parse(env, this.getParser(env, parserKind), code);
        env.callMethod(
                output,
                "page",
                ParseCommand.class,
                env.callMethod(this.presenter, "present", ParseCommand.class, nodes, depth));
        env.callMethod(this.context, "setReturnValue", ParseCommand.class, nodes);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parser", typeHint = "PhpParser\\Parser")
    @ConvertedParameter(index = 1, name = "code")
    private Object parse(RuntimeEnv env, Object... args) {
        Object parser = assignParameter(args, 0, false);
        Object code = assignParameter(args, 1, false);
        Object e = null;
        try {
            return ZVal.assign(env.callMethod(parser, "parse", ParseCommand.class, code));
        } catch (ConvertedException convertedException177) {
            if (convertedException177.instanceOf(Error.class, "PhpParser\\Error")) {
                e = convertedException177.getObject();
                if (ZVal.strictEqualityCheck(
                        function_strpos
                                .f
                                .env(env)
                                .call(
                                        env.callMethod(e, "getMessage", ParseCommand.class),
                                        "unexpected EOF")
                                .value(),
                        "===",
                        false)) {
                    throw ZVal.getException(env, e);
                }

                return ZVal.assign(
                        env.callMethod(
                                parser, "parse", ParseCommand.class, toStringR(code, env) + ";"));
            } else {
                throw convertedException177;
            }
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "kind",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    private Object getParser(RuntimeEnv env, Object... args) {
        Object kind = assignParameter(args, 0, true);
        if (null == kind) {
            kind = ZVal.getNull();
        }
        if (!function_array_key_exists.f.env(env).call(kind, this.parsers).getBool()) {
            new ReferenceClassProperty(this, "parsers", env)
                    .arrayAccess(env, kind)
                    .set(
                            env.callMethod(
                                    this.parserFactory, "createParser", ParseCommand.class, kind));
        }

        return ZVal.assign(new ReferenceClassProperty(this, "parsers", env).arrayGet(env, kind));
    }

    public static final Object CONST_class = "Psy\\Command\\ParseCommand";

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
                    .setName("Psy\\Command\\ParseCommand")
                    .setLookup(
                            ParseCommand.class,
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
                            "parserFactory",
                            "parsers",
                            "presenter",
                            "processTitle",
                            "synopsis",
                            "usages")
                    .setFilename("vendor/psy/psysh/src/Command/ParseCommand.php")
                    .addInterface("Psy\\ContextAware")
                    .addInterface("Psy\\VarDumper\\PresenterAware")
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
