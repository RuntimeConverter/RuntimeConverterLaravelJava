package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.Shell;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes.TableStyle;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes.Table;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Command/Command.php

*/

public abstract class Command
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Symfony
                .namespaces
                .Component
                .namespaces
                .Console
                .namespaces
                .Command
                .classes
                .Command {

    public Command(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Command.class) {
            this.__construct(env, args);
        }
    }

    public Command(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "application",
        typeHint = "Symfony\\Component\\Console\\Application",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setApplication(RuntimeEnv env, Object... args) {
        Object application = assignParameter(args, 0, true);
        if (null == application) {
            application = ZVal.getNull();
        }
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(application, "!==", ZVal.getNull()))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(application, Shell.class, "Psy\\Shell")))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "PsySH Commands require an instance of Psy\\Shell"));
        }

        return ZVal.assign(super.setApplication(env, application));
    }

    @ConvertedMethod
    public Object asText(RuntimeEnv env, Object... args) {
        Object help = null;
        ReferenceContainer messages = new BasicReferenceContainer(null);
        messages.setObject(
                ZVal.newArray(
                        new ZPair(0, "<comment>Usage:</comment>"),
                        new ZPair(
                                1,
                                " "
                                        + toStringR(
                                                env.callMethod(this, "getSynopsis", Command.class),
                                                env)),
                        new ZPair(2, "")));
        if (ZVal.isTrue(env.callMethod(this, "getAliases", Command.class))) {
            messages.arrayAppend(env).set(this.aliasesAsText(env));
        }

        if (ZVal.isTrue(this.getArguments(env))) {
            messages.arrayAppend(env).set(this.argumentsAsText(env));
        }

        if (ZVal.isTrue(this.getOptions(env))) {
            messages.arrayAppend(env).set(this.optionsAsText(env));
        }

        if (ZVal.isTrue(help = env.callMethod(this, "getProcessedHelp", Command.class))) {
            messages.arrayAppend(env).set("<comment>Help:</comment>");
            messages.arrayAppend(env)
                    .set(
                            " "
                                    + toStringR(
                                            function_str_replace
                                                    .f
                                                    .env(env)
                                                    .call("\n", "\n ", help)
                                                    .value(),
                                            env)
                                    + "\n");
        }

        return ZVal.assign(
                NamespaceGlobal.implode.env(env).call("\n", messages.getObject()).value());
    }

    @ConvertedMethod
    private Object getArguments(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/psy/psysh/src/Command")
                        .setFile("/vendor/psy/psysh/src/Command/Command.php");
        Object hidden = null;
        hidden = this.getHiddenArguments(env);
        return ZVal.assign(
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                env.callMethod(
                                        env.callMethod(this, "getNativeDefinition", Command.class),
                                        "getArguments",
                                        Command.class),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Psy\\Command",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "argument")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object argument = assignParameter(args, 0, false);
                                        Object hidden = null;
                                        hidden = this.contextReferences.getCapturedValue("hidden");
                                        return ZVal.assign(
                                                !function_in_array
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                env.callMethod(
                                                                        argument,
                                                                        "getName",
                                                                        Command.class),
                                                                hidden)
                                                        .getBool());
                                    }
                                }.use("hidden", hidden))
                        .value());
    }

    @ConvertedMethod
    protected Object getHiddenArguments(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.arrayFromList("command"));
    }

    @ConvertedMethod
    private Object getOptions(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/psy/psysh/src/Command")
                        .setFile("/vendor/psy/psysh/src/Command/Command.php");
        Object hidden = null;
        hidden = this.getHiddenOptions(env);
        return ZVal.assign(
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                env.callMethod(
                                        env.callMethod(this, "getNativeDefinition", Command.class),
                                        "getOptions",
                                        Command.class),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Psy\\Command",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "option")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object option = assignParameter(args, 0, false);
                                        Object hidden = null;
                                        hidden = this.contextReferences.getCapturedValue("hidden");
                                        return ZVal.assign(
                                                !function_in_array
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                env.callMethod(
                                                                        option,
                                                                        "getName",
                                                                        Command.class),
                                                                hidden)
                                                        .getBool());
                                    }
                                }.use("hidden", hidden))
                        .value());
    }

    @ConvertedMethod
    protected Object getHiddenOptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.arrayFromList("verbose"));
    }

    @ConvertedMethod
    private Object aliasesAsText(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                "<comment>Aliases:</comment> <info>"
                        + toStringR(
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(
                                                ", ",
                                                env.callMethod(this, "getAliases", Command.class))
                                        .value(),
                                env)
                        + "</info>"
                        + toStringR("\n", env));
    }

    @ConvertedMethod
    private Object argumentsAsText(RuntimeEnv env, Object... args) {
        Object _pDefault = null;
        Object argument = null;
        Object max = null;
        ReferenceContainer messages = new BasicReferenceContainer(null);
        Object description = null;
        Object arguments = null;
        max = this.getMaxWidth(env);
        messages.setObject(ZVal.newArray());
        arguments = this.getArguments(env);
        if (!ZVal.isEmpty(arguments)) {
            messages.arrayAppend(env).set("<comment>Arguments:</comment>");
            for (ZPair zpairResult1354 : ZVal.getIterable(arguments, env, true)) {
                argument = ZVal.assign(zpairResult1354.getValue());
                if (ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        ZVal.getNull(),
                                        "!==",
                                        env.callMethod(argument, "getDefault", Command.class)))
                        && ZVal.toBool(
                                ZVal.toBool(
                                                !function_is_array
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                env.callMethod(
                                                                        argument,
                                                                        "getDefault",
                                                                        Command.class))
                                                        .getBool())
                                        || ZVal.toBool(
                                                function_count
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                env.callMethod(
                                                                        argument,
                                                                        "getDefault",
                                                                        Command.class))
                                                        .value()))) {
                    _pDefault =
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "<comment> (default: %s)</comment>",
                                            this.formatDefaultValue(
                                                    env,
                                                    env.callMethod(
                                                            argument, "getDefault", Command.class)))
                                    .value();

                } else {
                    _pDefault = "";
                }

                description =
                        function_str_replace
                                .f
                                .env(env)
                                .call(
                                        "\n",
                                        "\n"
                                                + toStringR(
                                                        NamespaceGlobal.str_pad
                                                                .env(env)
                                                                .call("", ZVal.add(max, 2), " ")
                                                                .value(),
                                                        env),
                                        env.callMethod(argument, "getDescription", Command.class))
                                .value();
                messages.arrayAppend(env)
                        .set(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                " <info>%-" + toStringR(max, env) + "s</info> %s%s",
                                                env.callMethod(argument, "getName", Command.class),
                                                description,
                                                _pDefault)
                                        .value());
            }

            messages.arrayAppend(env).set("");
        }

        return ZVal.assign(
                NamespaceGlobal.implode.env(env).call("\n", messages.getObject()).value());
    }

    @ConvertedMethod
    private Object optionsAsText(RuntimeEnv env, Object... args) {
        Object optionMax = null;
        Object _pDefault = null;
        Object max = null;
        Object options = null;
        Object multiple = null;
        ReferenceContainer messages = new BasicReferenceContainer(null);
        Object description = null;
        Object option = null;
        max = this.getMaxWidth(env);
        messages.setObject(ZVal.newArray());
        options = this.getOptions(env);
        if (ZVal.isTrue(options)) {
            messages.arrayAppend(env).set("<comment>Options:</comment>");
            for (ZPair zpairResult1355 : ZVal.getIterable(options, env, true)) {
                option = ZVal.assign(zpairResult1355.getValue());
                if (ZVal.toBool(
                                ZVal.toBool(env.callMethod(option, "acceptValue", Command.class))
                                        && ZVal.toBool(
                                                ZVal.strictNotEqualityCheck(
                                                        ZVal.getNull(),
                                                        "!==",
                                                        env.callMethod(
                                                                option,
                                                                "getDefault",
                                                                Command.class))))
                        && ZVal.toBool(
                                ZVal.toBool(
                                                !function_is_array
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                env.callMethod(
                                                                        option,
                                                                        "getDefault",
                                                                        Command.class))
                                                        .getBool())
                                        || ZVal.toBool(
                                                function_count
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                env.callMethod(
                                                                        option,
                                                                        "getDefault",
                                                                        Command.class))
                                                        .value()))) {
                    _pDefault =
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "<comment> (default: %s)</comment>",
                                            this.formatDefaultValue(
                                                    env,
                                                    env.callMethod(
                                                            option, "getDefault", Command.class)))
                                    .value();

                } else {
                    _pDefault = "";
                }

                multiple =
                        ZVal.assign(
                                ZVal.isTrue(env.callMethod(option, "isArray", Command.class))
                                        ? "<comment> (multiple values allowed)</comment>"
                                        : "");
                description =
                        function_str_replace
                                .f
                                .env(env)
                                .call(
                                        "\n",
                                        "\n"
                                                + toStringR(
                                                        NamespaceGlobal.str_pad
                                                                .env(env)
                                                                .call("", ZVal.add(max, 2), " ")
                                                                .value(),
                                                        env),
                                        env.callMethod(option, "getDescription", Command.class))
                                .value();
                optionMax =
                        ZVal.subtract(
                                ZVal.subtract(
                                        max,
                                        function_strlen
                                                .f
                                                .env(env)
                                                .call(
                                                        env.callMethod(
                                                                option, "getName", Command.class))
                                                .value()),
                                2);
                messages.arrayAppend(env)
                        .set(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                " <info>%s</info> %-"
                                                        + toStringR(optionMax, env)
                                                        + "s%s%s%s",
                                                "--"
                                                        + toStringR(
                                                                env.callMethod(
                                                                        option,
                                                                        "getName",
                                                                        Command.class),
                                                                env),
                                                ZVal.isTrue(
                                                                env.callMethod(
                                                                        option,
                                                                        "getShortcut",
                                                                        Command.class))
                                                        ? function_sprintf
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        "(-%s) ",
                                                                        env.callMethod(
                                                                                option,
                                                                                "getShortcut",
                                                                                Command.class))
                                                                .value()
                                                        : "",
                                                description,
                                                _pDefault,
                                                multiple)
                                        .value());
            }

            messages.arrayAppend(env).set("");
        }

        return ZVal.assign(
                NamespaceGlobal.implode.env(env).call("\n", messages.getObject()).value());
    }

    @ConvertedMethod
    private Object getMaxWidth(RuntimeEnv env, Object... args) {
        Object argument = null;
        Object nameLength = null;
        ReferenceContainer max = new BasicReferenceContainer(null);
        Object option = null;
        max.setObject(0);
        for (ZPair zpairResult1356 : ZVal.getIterable(this.getOptions(env), env, true)) {
            option = ZVal.assign(zpairResult1356.getValue());
            nameLength =
                    ZVal.add(
                            function_strlen
                                    .f
                                    .env(env)
                                    .call(env.callMethod(option, "getName", Command.class))
                                    .value(),
                            2);
            if (ZVal.isTrue(env.callMethod(option, "getShortcut", Command.class))) {
                nameLength =
                        ZAssignment.add(
                                "+=",
                                nameLength,
                                ZVal.add(
                                        function_strlen
                                                .f
                                                .env(env)
                                                .call(
                                                        env.callMethod(
                                                                option,
                                                                "getShortcut",
                                                                Command.class))
                                                .value(),
                                        3));
            }

            max.setObject(NamespaceGlobal.max.env(env).call(max.getObject(), nameLength).value());
        }

        for (ZPair zpairResult1357 : ZVal.getIterable(this.getArguments(env), env, true)) {
            argument = ZVal.assign(zpairResult1357.getValue());
            max.setObject(
                    NamespaceGlobal.max
                            .env(env)
                            .call(
                                    max.getObject(),
                                    function_strlen
                                            .f
                                            .env(env)
                                            .call(
                                                    env.callMethod(
                                                            argument, "getName", Command.class))
                                            .value())
                            .value());
        }

        return ZVal.assign(max.setObject(ZVal.increment(max.getObject())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "default")
    private Object formatDefaultValue(RuntimeEnv env, Object... args) {
        Object _pDefault = assignParameter(args, 0, false);
        if (ZVal.toBool(function_is_array.f.env(env).call(_pDefault).value())
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                _pDefault,
                                "===",
                                function_array_values.f.env(env).call(_pDefault).value()))) {
            return ZVal.assign(
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "array('%s')",
                                    NamespaceGlobal.implode
                                            .env(env)
                                            .call("', '", _pDefault)
                                            .value())
                            .value());
        }

        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                "\n",
                                "",
                                NamespaceGlobal.var_export.env(env).call(_pDefault, true).value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    protected Object getTable(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        Object style = null;
        Object table = null;
        if (!function_class_exists
                .f
                .env(env)
                .call("Symfony\\Component\\Console\\Helper\\Table")
                .getBool()) {
            return ZVal.assign(this.getTableHelper(env));
        }

        style = new TableStyle(env);
        env.callMethod(
                env.callMethod(
                        env.callMethod(style, "setVerticalBorderChar", Command.class, " "),
                        "setHorizontalBorderChar",
                        Command.class,
                        ""),
                "setCrossingChar",
                Command.class,
                "");
        table = new Table(env, output);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(table, "setRows", Command.class, ZVal.newArray()),
                        "setStyle",
                        Command.class,
                        style));
    }

    @ConvertedMethod
    protected Object getTableHelper(RuntimeEnv env, Object... args) {
        Object table = null;
        table =
                env.callMethod(
                        env.callMethod(
                                env.callMethod(this, "getApplication", Command.class),
                                "getHelperSet",
                                Command.class),
                        "get",
                        Command.class,
                        "table");
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                table, "setRows", Command.class, ZVal.newArray()),
                                        "setLayout",
                                        Command.class,
                                        ClassConstantUtils.getConstantValueByClass(
                                                env,
                                                ZVal.resolveClassAlias(env, "TableHelper"),
                                                "LAYOUT_BORDERLESS")),
                                "setHorizontalBorderChar",
                                Command.class,
                                ""),
                        "setCrossingChar",
                        Command.class,
                        ""));
    }

    public static final Object CONST_class = "Psy\\Command\\Command";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Symfony
                    .namespaces
                    .Component
                    .namespaces
                    .Console
                    .namespaces
                    .Command
                    .classes
                    .Command
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Command\\Command")
                    .setLookup(
                            Command.class,
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
                    .setFilename("vendor/psy/psysh/src/Command/Command.php")
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
