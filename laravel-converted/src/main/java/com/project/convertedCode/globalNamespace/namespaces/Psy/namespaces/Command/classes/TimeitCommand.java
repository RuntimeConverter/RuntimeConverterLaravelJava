package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.PrettyPrinter.classes.Standard;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.ParserFactory;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_sum;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Input.classes.CodeArgument;
import com.runtimeconverter.runtime.nativeFunctions.date.function_microtime;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import com.runtimeconverter.runtime.nativeFunctions.array.function_rsort;
import com.runtimeconverter.runtime.nativeFunctions.math.function_round;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.NodeTraverser;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.Error;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.namespaces.TimeitCommand.classes.TimeitVisitor;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes.Command;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Command/TimeitCommand.php

*/

public class TimeitCommand extends Command {

    public Object parser = null;

    public Object traverser = null;

    public Object printer = null;

    public TimeitCommand(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TimeitCommand.class) {
            this.__construct(env, args);
        }
    }

    public TimeitCommand(NoConstructor n) {
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
        this.parser = env.callMethod(parserFactory, "createParser", TimeitCommand.class);
        this.traverser = new NodeTraverser(env);
        env.callMethod(this.traverser, "addVisitor", TimeitCommand.class, new TimeitVisitor(env));
        this.printer = new Standard(env);
        super.__construct(env, name);
        return null;
    }

    @ConvertedMethod
    protected Object configure(RuntimeEnv env, Object... args) {
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(this, "setName", TimeitCommand.class, "timeit"),
                                "setDefinition",
                                TimeitCommand.class,
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                new InputOption(
                                                        env,
                                                        "num",
                                                        "n",
                                                        InputOption.CONST_VALUE_REQUIRED,
                                                        "Number of iterations.")),
                                        new ZPair(
                                                1,
                                                new CodeArgument(
                                                        env,
                                                        "code",
                                                        CodeArgument.CONST_REQUIRED,
                                                        "Code to execute.")))),
                        "setDescription",
                        TimeitCommand.class,
                        "Profiles with a timer."),
                "setHelp",
                TimeitCommand.class,
                "Time profiling for functions and commands.\n\ne.g.\n<return>>>> timeit sleep(1)</return>\n<return>>>> timeit -n1000 $closure()</return>");
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
        Object instrumentedCode = null;
        Object code = null;
        Object num = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object ternaryExpressionTemp = null;
        ReferenceContainer times = new BasicReferenceContainer(null);
        Object total = null;
        Object median = null;
        Object shell = null;
        Object _underscoreIdentifier = null;
        code = env.callMethod(input, "getArgument", TimeitCommand.class, "code");
        num =
                ZVal.assign(
                        ZVal.isTrue(
                                        ternaryExpressionTemp =
                                                env.callMethod(
                                                        input,
                                                        "getOption",
                                                        TimeitCommand.class,
                                                        "num"))
                                ? ternaryExpressionTemp
                                : 1);
        shell = env.callMethod(this, "getApplication", TimeitCommand.class);
        instrumentedCode = this.instrumentCode(env, code);
        env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Psy
                                        .namespaces
                                        .Command
                                        .classes
                                        .TimeitCommand
                                        .RequestStaticProperties
                                        .class)
                        .times =
                ZVal.newArray();
        for (i.setObject(0);
                ZVal.isLessThan(i.getObject(), '<', num);
                i.setObject(ZVal.increment(i.getObject()))) {
            _underscoreIdentifier =
                    env.callMethod(shell, "execute", TimeitCommand.class, instrumentedCode);
            this.ensureEndMarked(env);
        }

        env.callMethod(shell, "writeReturnValue", TimeitCommand.class, _underscoreIdentifier);
        times.setObject(
                ZVal.assign(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Psy
                                                .namespaces
                                                .Command
                                                .classes
                                                .TimeitCommand
                                                .RequestStaticProperties
                                                .class)
                                .times));
        env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Psy
                                        .namespaces
                                        .Command
                                        .classes
                                        .TimeitCommand
                                        .RequestStaticProperties
                                        .class)
                        .times =
                ZVal.newArray();
        if (ZVal.strictEqualityCheck(num, "===", 1)) {
            env.callMethod(
                    output,
                    "writeln",
                    TimeitCommand.class,
                    function_sprintf
                            .f
                            .env(env)
                            .call(CONST_RESULT_MSG, times.arrayGet(env, 0))
                            .value());

        } else {
            total = function_array_sum.f.env(env).call(times.getObject()).value();
            function_rsort.f.env(env).call(times.getObject());
            median =
                    ZVal.assign(
                            times.arrayGet(
                                    env,
                                    function_round.f.env(env).call(ZVal.divide(num, 2)).value()));
            env.callMethod(
                    output,
                    "writeln",
                    TimeitCommand.class,
                    function_sprintf
                            .f
                            .env(env)
                            .call(CONST_AVG_RESULT_MSG, ZVal.divide(total, num), median, total)
                            .value());
        }

        return null;
    }

    @ConvertedMethod
    private Object ensureEndMarked(RuntimeEnv env, Object... args) {
        if (ZVal.strictNotEqualityCheck(
                env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Psy
                                        .namespaces
                                        .Command
                                        .classes
                                        .TimeitCommand
                                        .RequestStaticProperties
                                        .class)
                        .start,
                "!==",
                ZVal.getNull())) {
            runtimeStaticObject.markEnd(env);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    private Object instrumentCode(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this.printer,
                        "prettyPrint",
                        TimeitCommand.class,
                        env.callMethod(
                                this.traverser,
                                "traverse",
                                TimeitCommand.class,
                                this.parse(env, code))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    private Object parse(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        Object e = null;
        code = "<?php " + toStringR(code, env);
        try {
            return ZVal.assign(env.callMethod(this.parser, "parse", TimeitCommand.class, code));
        } catch (ConvertedException convertedException184) {
            if (convertedException184.instanceOf(Error.class, "PhpParser\\Error")) {
                e = convertedException184.getObject();
                if (ZVal.strictEqualityCheck(
                        function_strpos
                                .f
                                .env(env)
                                .call(
                                        env.callMethod(e, "getMessage", TimeitCommand.class),
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
                                TimeitCommand.class,
                                toStringR(code, env) + ";"));
            } else {
                throw convertedException184;
            }
        }
    }

    public static final Object CONST_RESULT_MSG =
            "<info>Command took %.6f seconds to complete.</info>";

    public static final Object CONST_AVG_RESULT_MSG =
            "<info>Command took %.6f seconds on average (%.6f median; %.6f total) to complete.</info>";

    public static final Object CONST_class = "Psy\\Command\\TimeitCommand";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Command.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object markStart(RuntimeEnv env, Object... args) {
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Psy
                                            .namespaces
                                            .Command
                                            .classes
                                            .TimeitCommand
                                            .RequestStaticProperties
                                            .class)
                            .start =
                    function_microtime.f.env(env).call(true).value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "ret",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object markEnd(RuntimeEnv env, Object... args) {
            Object ret = assignParameter(args, 0, true);
            if (null == ret) {
                ret = ZVal.getNull();
            }
            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Psy
                                    .namespaces
                                    .Command
                                    .classes
                                    .TimeitCommand
                                    .RequestStaticProperties
                                    .class,
                            "times")
                    .arrayAppend(env)
                    .set(
                            ZVal.subtract(
                                    function_microtime.f.env(env).call(true).value(),
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Psy
                                                            .namespaces
                                                            .Command
                                                            .classes
                                                            .TimeitCommand
                                                            .RequestStaticProperties
                                                            .class)
                                            .start));
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Psy
                                            .namespaces
                                            .Command
                                            .classes
                                            .TimeitCommand
                                            .RequestStaticProperties
                                            .class)
                            .start =
                    ZVal.getNull();
            return ZVal.assign(ret);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object start = ZVal.getNull();

        public Object times = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Command\\TimeitCommand")
                    .setLookup(
                            TimeitCommand.class,
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
                            "synopsis",
                            "traverser",
                            "usages")
                    .setStaticPropertyNames("start", "times")
                    .setFilename("vendor/psy/psysh/src/Command/TimeitCommand.php")
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
