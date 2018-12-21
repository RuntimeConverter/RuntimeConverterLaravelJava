package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.NodeTraverser;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.Error;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.PrettyPrinter.classes.Standard;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.ParserFactory;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes.Command;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Input.classes.CodeArgument;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Sudo.classes.SudoVisitor;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Command/SudoCommand.php

*/

public class SudoCommand extends Command {

    public Object readline = null;

    public Object parser = null;

    public Object traverser = null;

    public Object printer = null;

    public SudoCommand(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SudoCommand.class) {
            this.__construct(env, args);
        }
    }

    public SudoCommand(NoConstructor n) {
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
        this.parser = env.callMethod(parserFactory, "createParser", SudoCommand.class);
        this.traverser = new NodeTraverser(env);
        env.callMethod(this.traverser, "addVisitor", SudoCommand.class, new SudoVisitor(env));
        this.printer = new Standard(env);
        super.__construct(env, name);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "readline", typeHint = "Psy\\Readline\\Readline")
    public Object setReadline(RuntimeEnv env, Object... args) {
        Object readline = assignParameter(args, 0, false);
        this.readline = readline;
        return null;
    }

    @ConvertedMethod
    protected Object configure(RuntimeEnv env, Object... args) {
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(this, "setName", SudoCommand.class, "sudo"),
                                "setDefinition",
                                SudoCommand.class,
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                new CodeArgument(
                                                        env,
                                                        "code",
                                                        CodeArgument.CONST_REQUIRED,
                                                        "Code to execute.")))),
                        "setDescription",
                        SudoCommand.class,
                        "Evaluate PHP code, bypassing visibility restrictions."),
                "setHelp",
                SudoCommand.class,
                "Evaluate PHP code, bypassing visibility restrictions.\n\ne.g.\n<return>>>> $sekret->whisper(\"hi\")</return>\n<return>PHP error:  Call to private method Sekret::whisper() from context '' on line 1</return>\n\n<return>>>> sudo $sekret->whisper(\"hi\")</return>\n<return>=> \"hi\"</return>\n\n<return>>>> $sekret->word</return>\n<return>PHP error:  Cannot access private property Sekret::$word on line 1</return>\n\n<return>>>> sudo $sekret->word</return>\n<return>=> \"hi\"</return>\n\n<return>>>> $sekret->word = \"please\"</return>\n<return>PHP error:  Cannot access private property Sekret::$word on line 1</return>\n\n<return>>>> sudo $sekret->word = \"please\"</return>\n<return>=> \"please\"</return>");
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
        Object nodes = null;
        Object shell = null;
        ReferenceContainer history = new BasicReferenceContainer(null);
        Object sudoCode = null;
        code = env.callMethod(input, "getArgument", SudoCommand.class, "code");
        if (ZVal.strictEqualityCheck(code, "===", "!!")) {
            history.setObject(env.callMethod(this.readline, "listHistory", SudoCommand.class));
            if (ZVal.isLessThan(
                    function_count.f.env(env).call(history.getObject()).value(), '<', 2)) {
                throw ZVal.getException(
                        env, new InvalidArgumentException(env, "No previous command to replay"));
            }

            code =
                    ZVal.assign(
                            history.arrayGet(
                                    env,
                                    ZVal.subtract(
                                            function_count
                                                    .f
                                                    .env(env)
                                                    .call(history.getObject())
                                                    .value(),
                                            2)));
        }

        if (ZVal.strictEqualityCheck(
                function_strpos.f.env(env).call("<?", code).value(), "===", false)) {
            code = "<?php " + toStringR(code, env);
        }

        nodes =
                env.callMethod(
                        this.traverser, "traverse", SudoCommand.class, this.parse(env, code));
        sudoCode = env.callMethod(this.printer, "prettyPrint", SudoCommand.class, nodes);
        shell = env.callMethod(this, "getApplication", SudoCommand.class);
        env.callMethod(
                shell,
                "addCode",
                SudoCommand.class,
                sudoCode,
                !ZVal.isTrue(env.callMethod(shell, "hasCode", SudoCommand.class)));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    private Object parse(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        Object e = null;
        try {
            return ZVal.assign(env.callMethod(this.parser, "parse", SudoCommand.class, code));
        } catch (ConvertedException convertedException182) {
            if (convertedException182.instanceOf(Error.class, "PhpParser\\Error")) {
                e = convertedException182.getObject();
                if (ZVal.strictEqualityCheck(
                        function_strpos
                                .f
                                .env(env)
                                .call(
                                        env.callMethod(e, "getMessage", SudoCommand.class),
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
                                SudoCommand.class,
                                toStringR(code, env) + ";"));
            } else {
                throw convertedException182;
            }
        }
    }

    public static final Object CONST_class = "Psy\\Command\\SudoCommand";

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
                    .setName("Psy\\Command\\SudoCommand")
                    .setLookup(
                            SudoCommand.class,
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
                            "parser",
                            "printer",
                            "processTitle",
                            "readline",
                            "synopsis",
                            "traverser",
                            "usages")
                    .setFilename("vendor/psy/psysh/src/Command/SudoCommand.php")
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
