package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Scalar.classes.String_;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Variable;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.PrettyPrinter.classes.Standard;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.ParserFactory;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Input.classes.CodeArgument;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Throw_;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Name.classes.FullyQualified;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.Error;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes.Command;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.ContextAware;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Arg;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.StaticCall;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.New_;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Command/ThrowUpCommand.php

*/

public class ThrowUpCommand extends Command implements ContextAware {

    public Object parser = null;

    public Object printer = null;

    public Object context = null;

    public ThrowUpCommand(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ThrowUpCommand.class) {
            this.__construct(env, args);
        }
    }

    public ThrowUpCommand(NoConstructor n) {
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
        Object parserFactory = null;
        parserFactory = new ParserFactory(env);
        this.parser = env.callMethod(parserFactory, "createParser", ThrowUpCommand.class);
        this.printer = new Standard(env);
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
    protected Object configure(RuntimeEnv env, Object... args) {
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(this, "setName", ThrowUpCommand.class, "throw-up"),
                                "setDefinition",
                                ThrowUpCommand.class,
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                new CodeArgument(
                                                        env,
                                                        "exception",
                                                        CodeArgument.CONST_OPTIONAL,
                                                        "Exception or Error to throw.")))),
                        "setDescription",
                        ThrowUpCommand.class,
                        "Throw an exception or error out of the Psy Shell."),
                "setHelp",
                ThrowUpCommand.class,
                "Throws an exception or error out of the current the Psy Shell instance.\n\nBy default it throws the most recent exception.\n\ne.g.\n<return>>>> throw-up</return>\n<return>>>> throw-up $e</return>\n<return>>>> throw-up new Exception('WHEEEEEE!')</return>\n<return>>>> throw-up \"bye!\"</return>");
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
        Object ___args = null;
        Object shell = null;
        Object throwCode = null;
        Object throwStmt = null;
        ___args =
                this.prepareArgs(
                        env,
                        env.callMethod(input, "getArgument", ThrowUpCommand.class, "exception"));
        throwStmt =
                new Throw_(
                        env,
                        new StaticCall(
                                env,
                                new FullyQualified(env, CONST_THROW_CLASS),
                                "fromThrowable",
                                ___args));
        throwCode =
                env.callMethod(
                        this.printer,
                        "prettyPrint",
                        ThrowUpCommand.class,
                        ZVal.newArray(new ZPair(0, throwStmt)));
        shell = env.callMethod(this, "getApplication", ThrowUpCommand.class);
        env.callMethod(
                shell,
                "addCode",
                ThrowUpCommand.class,
                throwCode,
                !ZVal.isTrue(env.callMethod(shell, "hasCode", ThrowUpCommand.class)));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "code",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    private Object prepareArgs(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, true);
        if (null == code) {
            code = ZVal.getNull();
        }
        Object ___args = null;
        Object node = null;
        ReferenceContainer nodes = new BasicReferenceContainer(null);
        Object expr = null;
        if (!ZVal.isTrue(code)) {
            return ZVal.assign(ZVal.newArray(new ZPair(0, new Arg(env, new Variable(env, "_e")))));
        }

        if (ZVal.strictEqualityCheck(
                function_strpos.f.env(env).call("<?", code).value(), "===", false)) {
            code = "<?php " + toStringR(code, env);
        }

        nodes.setObject(this.parse(env, code));
        if (ZVal.strictNotEqualityCheck(
                function_count.f.env(env).call(nodes.getObject()).value(), "!==", 1)) {
            throw ZVal.getException(
                    env, new InvalidArgumentException(env, "No idea how to throw this"));
        }

        node = ZVal.assign(nodes.arrayGet(env, 0));
        expr =
                ZVal.assign(
                        ZVal.isset(toObjectR(node).accessProp(this, env).name("expr").value())
                                ? toObjectR(node).accessProp(this, env).name("expr").value()
                                : node);
        ___args =
                ZVal.newArray(
                        new ZPair(
                                0,
                                new Arg(
                                        env,
                                        expr,
                                        false,
                                        false,
                                        env.callMethod(
                                                node, "getAttributes", ThrowUpCommand.class))));
        if (ZVal.isTrue(
                ZVal.checkInstanceType(expr, String_.class, "PhpParser\\Node\\Scalar\\String_"))) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    0,
                                    new New_(env, new FullyQualified(env, "Exception"), ___args))));
        }

        return ZVal.assign(___args);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    private Object parse(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        Object e = null;
        try {
            return ZVal.assign(env.callMethod(this.parser, "parse", ThrowUpCommand.class, code));
        } catch (ConvertedException convertedException183) {
            if (convertedException183.instanceOf(Error.class, "PhpParser\\Error")) {
                e = convertedException183.getObject();
                if (ZVal.strictEqualityCheck(
                        function_strpos
                                .f
                                .env(env)
                                .call(
                                        env.callMethod(e, "getMessage", ThrowUpCommand.class),
                                        "unexpected EOF")
                                .value(),
                        "===",
                        false)) {
                    throw ZVal.getException(env, e);
                }

                return ZVal.assign(
                        env.callMethod(
                                this.parser,
                                "parse",
                                ThrowUpCommand.class,
                                toStringR(code, env) + ";"));
            } else {
                throw convertedException183;
            }
        }
    }

    public static final Object CONST_THROW_CLASS = "Psy\\Exception\\ThrowUpException";

    public static final Object CONST_class = "Psy\\Command\\ThrowUpCommand";

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
                    .setName("Psy\\Command\\ThrowUpCommand")
                    .setLookup(
                            ThrowUpCommand.class,
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
                            "parser",
                            "printer",
                            "processTitle",
                            "synopsis",
                            "usages")
                    .setFilename("vendor/psy/psysh/src/Command/ThrowUpCommand.php")
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
