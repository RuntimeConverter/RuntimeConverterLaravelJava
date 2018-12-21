package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Output.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Output.classes.PassthruPager;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Output.classes.OutputPager;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Formatter.classes.OutputFormatterStyle;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.ConsoleOutput;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ReadOnlyReferenceContainer;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Output.classes.ProcOutputPager;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Output/ShellOutput.php

*/

public class ShellOutput extends ConsoleOutput {

    public Object paging = 0;

    public Object pager = null;

    public ShellOutput(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ShellOutput.class) {
            this.__construct(env, args);
        }
    }

    public ShellOutput(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "verbosity")
    @ConvertedParameter(
        index = 1,
        name = "decorated",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "formatter",
        typeHint = "Symfony\\Component\\Console\\Formatter\\OutputFormatterInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "pager",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object verbosity = assignParameter(args, 0, true);
        if (null == verbosity) {
            verbosity = CONST_VERBOSITY_NORMAL;
        }
        Object decorated = assignParameter(args, 1, true);
        if (null == decorated) {
            decorated = ZVal.getNull();
        }
        Object formatter = assignParameter(args, 2, true);
        if (null == formatter) {
            formatter = ZVal.getNull();
        }
        Object pager = assignParameter(args, 3, true);
        if (null == pager) {
            pager = ZVal.getNull();
        }
        super.__construct(env, verbosity, decorated, formatter);
        this.initFormatters(env);
        if (ZVal.strictEqualityCheck(pager, "===", ZVal.getNull())) {
            this.pager = new PassthruPager(env, this);

        } else if (function_is_string.f.env(env).call(pager).getBool()) {
            this.pager = new ProcOutputPager(env, this, pager);

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(pager, OutputPager.class, "Psy\\Output\\OutputPager"))) {
            this.pager = pager;

        } else {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Unexpected pager parameter: " + toStringR(pager, env)));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messages")
    @ConvertedParameter(index = 1, name = "type", defaultValue = "0", defaultValueType = "number")
    public Object page(RuntimeEnv env, Object... args) {
        Object messages = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = 0;
        }
        if (function_is_string.f.env(env).call(messages).getBool()) {
            messages = ZVal.assign(rToArrayCast(messages));
        }

        if (ZVal.toBool(!function_is_array.f.env(env).call(messages).getBool())
                && ZVal.toBool(!function_is_callable.f.env(env).call(messages).getBool())) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Paged output requires a string, array or callback"));
        }

        this.startPaging(env);
        if (function_is_callable.f.env(env).call(messages).getBool()) {
            env.callFunctionDynamic(
                    messages,
                    new RuntimeArgsWithReferences().add(0, new ReadOnlyReferenceContainer(this)),
                    this);

        } else {
            this.write(env, messages, true, type);
        }

        this.stopPaging(env);
        return null;
    }

    @ConvertedMethod
    public Object startPaging(RuntimeEnv env, Object... args) {
        this.paging = ZVal.increment(this.paging);
        return null;
    }

    @ConvertedMethod
    public Object stopPaging(RuntimeEnv env, Object... args) {
        this.paging = ZVal.decrement(this.paging);
        this.closePager(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messages")
    @ConvertedParameter(
        index = 1,
        name = "newline",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 2, name = "type", defaultValue = "0", defaultValueType = "number")
    public Object write(RuntimeEnv env, Object... args) {
        ReferenceContainer messages = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object newline = assignParameter(args, 1, true);
        if (null == newline) {
            newline = false;
        }
        Object type = assignParameter(args, 2, true);
        if (null == type) {
            type = 0;
        }
        Object template = null;
        Object pad = null;
        Object line = null;
        Object i = null;
        if (ZVal.strictEqualityCheck(
                env.callMethod(this, "getVerbosity", ShellOutput.class),
                "===",
                CONST_VERBOSITY_QUIET)) {
            return null;
        }

        messages.setObject(ZVal.assign(rToArrayCast(messages.getObject())));
        if (ZVal.isTrue(ZVal.toLong(type) & ZVal.toLong(CONST_NUMBER_LINES))) {
            pad =
                    function_strlen
                            .f
                            .env(env)
                            .call(
                                    toStringR(
                                            function_count
                                                    .f
                                                    .env(env)
                                                    .call(messages.getObject())
                                                    .value(),
                                            env))
                            .value();
            template =
                    ZVal.assign(
                            ZVal.isTrue(env.callMethod(this, "isDecorated", ShellOutput.class))
                                    ? "<aside>%" + toStringR(pad, env) + "s</aside>: %s"
                                    : "%" + toStringR(pad, env) + "s: %s");
            if (ZVal.isTrue(ZVal.toLong(type) & ZVal.toLong(CONST_OUTPUT_RAW))) {
                messages.setObject(
                        function_array_map
                                .f
                                .env(env)
                                .call(
                                        ZVal.arrayFromList(
                                                "Symfony\\Component\\Console\\Formatter\\OutputFormatter",
                                                "escape"),
                                        messages.getObject())
                                .value());
            }

            for (ZPair zpairResult1406 : ZVal.getIterable(messages.getObject(), env, false)) {
                i = ZVal.assign(zpairResult1406.getKey());
                line = ZVal.assign(zpairResult1406.getValue());
                messages.arrayAccess(env, i)
                        .set(function_sprintf.f.env(env).call(template, i, line).value());
            }

            type =
                    ZVal.toLong(ZVal.toLong(type) & ZVal.toLong(~ZVal.toLong(CONST_NUMBER_LINES)))
                            & ZVal.toLong(~ZVal.toLong(CONST_OUTPUT_RAW));
        }

        super.write(env, messages.getObject(), newline, type);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "newline")
    public Object doWrite(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object newline = assignParameter(args, 1, false);
        if (ZVal.isGreaterThan(this.paging, '>', 0)) {
            env.callMethod(this.pager, "doWrite", ShellOutput.class, message, newline);

        } else {
            super.doWrite(env, message, newline);
        }

        return null;
    }

    @ConvertedMethod
    private Object closePager(RuntimeEnv env, Object... args) {
        if (ZVal.isLessThanOrEqualTo(this.paging, "<=", 0)) {
            env.callMethod(this.pager, "close", ShellOutput.class);
        }

        return null;
    }

    @ConvertedMethod
    private Object initFormatters(RuntimeEnv env, Object... args) {
        Object formatter = null;
        formatter = env.callMethod(this, "getFormatter", ShellOutput.class);
        env.callMethod(
                formatter,
                "setStyle",
                ShellOutput.class,
                "warning",
                new OutputFormatterStyle(env, "black", "yellow"));
        env.callMethod(
                formatter,
                "setStyle",
                ShellOutput.class,
                "error",
                new OutputFormatterStyle(env, "black", "red", ZVal.arrayFromList("bold")));
        env.callMethod(
                formatter,
                "setStyle",
                ShellOutput.class,
                "aside",
                new OutputFormatterStyle(env, "blue"));
        env.callMethod(
                formatter,
                "setStyle",
                ShellOutput.class,
                "strong",
                new OutputFormatterStyle(
                        env, ZVal.getNull(), ZVal.getNull(), ZVal.arrayFromList("bold")));
        env.callMethod(
                formatter,
                "setStyle",
                ShellOutput.class,
                "return",
                new OutputFormatterStyle(env, "cyan"));
        env.callMethod(
                formatter,
                "setStyle",
                ShellOutput.class,
                "urgent",
                new OutputFormatterStyle(env, "red"));
        env.callMethod(
                formatter,
                "setStyle",
                ShellOutput.class,
                "hidden",
                new OutputFormatterStyle(env, "black"));
        env.callMethod(
                formatter,
                "setStyle",
                ShellOutput.class,
                "public",
                new OutputFormatterStyle(
                        env, ZVal.getNull(), ZVal.getNull(), ZVal.arrayFromList("bold")));
        env.callMethod(
                formatter,
                "setStyle",
                ShellOutput.class,
                "protected",
                new OutputFormatterStyle(env, "yellow"));
        env.callMethod(
                formatter,
                "setStyle",
                ShellOutput.class,
                "private",
                new OutputFormatterStyle(env, "red"));
        env.callMethod(
                formatter,
                "setStyle",
                ShellOutput.class,
                "global",
                new OutputFormatterStyle(env, "cyan", ZVal.getNull(), ZVal.arrayFromList("bold")));
        env.callMethod(
                formatter,
                "setStyle",
                ShellOutput.class,
                "const",
                new OutputFormatterStyle(env, "cyan"));
        env.callMethod(
                formatter,
                "setStyle",
                ShellOutput.class,
                "class",
                new OutputFormatterStyle(
                        env, "blue", ZVal.getNull(), ZVal.arrayFromList("underscore")));
        env.callMethod(
                formatter,
                "setStyle",
                ShellOutput.class,
                "function",
                new OutputFormatterStyle(env, ZVal.getNull()));
        env.callMethod(
                formatter,
                "setStyle",
                ShellOutput.class,
                "default",
                new OutputFormatterStyle(env, ZVal.getNull()));
        env.callMethod(
                formatter,
                "setStyle",
                ShellOutput.class,
                "number",
                new OutputFormatterStyle(env, "magenta"));
        env.callMethod(
                formatter,
                "setStyle",
                ShellOutput.class,
                "string",
                new OutputFormatterStyle(env, "green"));
        env.callMethod(
                formatter,
                "setStyle",
                ShellOutput.class,
                "bool",
                new OutputFormatterStyle(env, "cyan"));
        env.callMethod(
                formatter,
                "setStyle",
                ShellOutput.class,
                "keyword",
                new OutputFormatterStyle(env, "yellow"));
        env.callMethod(
                formatter,
                "setStyle",
                ShellOutput.class,
                "comment",
                new OutputFormatterStyle(env, "blue"));
        env.callMethod(
                formatter,
                "setStyle",
                ShellOutput.class,
                "object",
                new OutputFormatterStyle(env, "blue"));
        env.callMethod(
                formatter,
                "setStyle",
                ShellOutput.class,
                "resource",
                new OutputFormatterStyle(env, "yellow"));
        return null;
    }

    public static final Object CONST_NUMBER_LINES = 128;

    public static final Object CONST_class = "Psy\\Output\\ShellOutput";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ConsoleOutput.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Output\\ShellOutput")
                    .setLookup(
                            ShellOutput.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "consoleSectionOutputs",
                            "formatter",
                            "pager",
                            "paging",
                            "stderr",
                            "stream",
                            "verbosity")
                    .setFilename("vendor/psy/psysh/src/Output/ShellOutput.php")
                    .addInterface("Symfony\\Component\\Console\\Output\\ConsoleOutputInterface")
                    .addInterface("Symfony\\Component\\Console\\Output\\OutputInterface")
                    .addExtendsClass("Symfony\\Component\\Console\\Output\\ConsoleOutput")
                    .addExtendsClass("Symfony\\Component\\Console\\Output\\StreamOutput")
                    .addExtendsClass("Symfony\\Component\\Console\\Output\\Output")
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
