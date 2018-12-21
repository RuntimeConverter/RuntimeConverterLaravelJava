package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Descriptor.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputDefinition;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Formatter.classes.OutputFormatter;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes.Helper;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeFunctions.array.function_reset;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Descriptor.classes.ApplicationDescription;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_intersect;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Command.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Descriptor.classes.Descriptor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Descriptor/TextDescriptor.php

*/

public class TextDescriptor extends Descriptor {

    public TextDescriptor(RuntimeEnv env, Object... args) {
        super(env);
    }

    public TextDescriptor(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "argument",
        typeHint = "Symfony\\Component\\Console\\Input\\InputArgument"
    )
    @ConvertedParameter(
        index = 1,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    protected Object describeInputArgument(RuntimeEnv env, Object... args) {
        Object argument = assignParameter(args, 0, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        Object _pDefault = null;
        Object totalWidth = null;
        Object spacingWidth = null;
        if (ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                ZVal.getNull(),
                                "!==",
                                env.callMethod(argument, "getDefault", TextDescriptor.class)))
                && ZVal.toBool(
                        ZVal.toBool(
                                        !function_is_array
                                                .f
                                                .env(env)
                                                .call(
                                                        env.callMethod(
                                                                argument,
                                                                "getDefault",
                                                                TextDescriptor.class))
                                                .getBool())
                                || ZVal.toBool(
                                        function_count
                                                .f
                                                .env(env)
                                                .call(
                                                        env.callMethod(
                                                                argument,
                                                                "getDefault",
                                                                TextDescriptor.class))
                                                .value()))) {
            _pDefault =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "<comment> [default: %s]</comment>",
                                    this.formatDefaultValue(
                                            env,
                                            env.callMethod(
                                                    argument, "getDefault", TextDescriptor.class)))
                            .value();

        } else {
            _pDefault = "";
        }

        totalWidth =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, options, env, "total_width")
                                ? options.arrayGet(env, "total_width")
                                : Helper.runtimeStaticObject.strlen(
                                        env,
                                        env.callMethod(argument, "getName", TextDescriptor.class)));
        spacingWidth =
                ZVal.subtract(
                        totalWidth,
                        function_strlen
                                .f
                                .env(env)
                                .call(env.callMethod(argument, "getName", TextDescriptor.class))
                                .value());
        this.writeText(
                env,
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "  <info>%s</info>  %s%s%s",
                                env.callMethod(argument, "getName", TextDescriptor.class),
                                function_str_repeat.f.env(env).call(" ", spacingWidth).value(),
                                function_preg_replace
                                        .f
                                        .env(env)
                                        .call(
                                                "/\\s*[\\r\\n]\\s*/",
                                                "\n"
                                                        + toStringR(
                                                                function_str_repeat
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                " ",
                                                                                ZVal.add(
                                                                                        totalWidth,
                                                                                        4))
                                                                        .value(),
                                                                env),
                                                env.callMethod(
                                                        argument,
                                                        "getDescription",
                                                        TextDescriptor.class))
                                        .value(),
                                _pDefault)
                        .value(),
                options.getObject());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "option",
        typeHint = "Symfony\\Component\\Console\\Input\\InputOption"
    )
    @ConvertedParameter(
        index = 1,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    protected Object describeInputOption(RuntimeEnv env, Object... args) {
        Object option = assignParameter(args, 0, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        Object _pDefault = null;
        Object synopsis = null;
        Object totalWidth = null;
        Object value = null;
        Object spacingWidth = null;
        if (ZVal.toBool(
                        ZVal.toBool(env.callMethod(option, "acceptValue", TextDescriptor.class))
                                && ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                ZVal.getNull(),
                                                "!==",
                                                env.callMethod(
                                                        option,
                                                        "getDefault",
                                                        TextDescriptor.class))))
                && ZVal.toBool(
                        ZVal.toBool(
                                        !function_is_array
                                                .f
                                                .env(env)
                                                .call(
                                                        env.callMethod(
                                                                option,
                                                                "getDefault",
                                                                TextDescriptor.class))
                                                .getBool())
                                || ZVal.toBool(
                                        function_count
                                                .f
                                                .env(env)
                                                .call(
                                                        env.callMethod(
                                                                option,
                                                                "getDefault",
                                                                TextDescriptor.class))
                                                .value()))) {
            _pDefault =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "<comment> [default: %s]</comment>",
                                    this.formatDefaultValue(
                                            env,
                                            env.callMethod(
                                                    option, "getDefault", TextDescriptor.class)))
                            .value();

        } else {
            _pDefault = "";
        }

        value = "";
        if (ZVal.isTrue(env.callMethod(option, "acceptValue", TextDescriptor.class))) {
            value =
                    "="
                            + toStringR(
                                    NamespaceGlobal.strtoupper
                                            .env(env)
                                            .call(
                                                    env.callMethod(
                                                            option,
                                                            "getName",
                                                            TextDescriptor.class))
                                            .value(),
                                    env);
            if (ZVal.isTrue(env.callMethod(option, "isValueOptional", TextDescriptor.class))) {
                value = "[" + toStringR(value, env) + "]";
            }
        }

        totalWidth =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, options, env, "total_width")
                                ? options.arrayGet(env, "total_width")
                                : this.calculateTotalWidthForOptions(
                                        env, ZVal.newArray(new ZPair(0, option))));
        synopsis =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%s%s",
                                ZVal.isTrue(
                                                env.callMethod(
                                                        option,
                                                        "getShortcut",
                                                        TextDescriptor.class))
                                        ? function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "-%s, ",
                                                        env.callMethod(
                                                                option,
                                                                "getShortcut",
                                                                TextDescriptor.class))
                                                .value()
                                        : "    ",
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "--%s%s",
                                                env.callMethod(
                                                        option, "getName", TextDescriptor.class),
                                                value)
                                        .value())
                        .value();
        spacingWidth = ZVal.subtract(totalWidth, Helper.runtimeStaticObject.strlen(env, synopsis));
        this.writeText(
                env,
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "  <info>%s</info>  %s%s%s%s",
                                synopsis,
                                function_str_repeat.f.env(env).call(" ", spacingWidth).value(),
                                function_preg_replace
                                        .f
                                        .env(env)
                                        .call(
                                                "/\\s*[\\r\\n]\\s*/",
                                                "\n"
                                                        + toStringR(
                                                                function_str_repeat
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                " ",
                                                                                ZVal.add(
                                                                                        totalWidth,
                                                                                        4))
                                                                        .value(),
                                                                env),
                                                env.callMethod(
                                                        option,
                                                        "getDescription",
                                                        TextDescriptor.class))
                                        .value(),
                                _pDefault,
                                ZVal.isTrue(env.callMethod(option, "isArray", TextDescriptor.class))
                                        ? "<comment> (multiple values allowed)</comment>"
                                        : "")
                        .value(),
                options.getObject());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "definition",
        typeHint = "Symfony\\Component\\Console\\Input\\InputDefinition"
    )
    @ConvertedParameter(
        index = 1,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    protected Object describeInputDefinition(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object definition = assignParameter(args, 0, false);
        Object options = assignParameter(args, 1, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object argument = null;
        ReferenceContainer laterOptions = new BasicReferenceContainer(null);
        Object totalWidth = null;
        Object option = null;
        totalWidth =
                this.calculateTotalWidthForOptions(
                        env, env.callMethod(definition, "getOptions", TextDescriptor.class));
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1659 :
                ZVal.getIterable(
                        env.callMethod(definition, "getArguments", TextDescriptor.class),
                        env,
                        true)) {
            argument = ZVal.assign(zpairResult1659.getValue());
            totalWidth =
                    NamespaceGlobal.max
                            .env(env)
                            .call(
                                    totalWidth,
                                    Helper.runtimeStaticObject.strlen(
                                            env,
                                            env.callMethod(
                                                    argument, "getName", TextDescriptor.class)))
                            .value();
        }

        if (ZVal.isTrue(env.callMethod(definition, "getArguments", TextDescriptor.class))) {
            this.writeText(env, "<comment>Arguments:</comment>", options);
            this.writeText(env, "\n");
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1660 :
                    ZVal.getIterable(
                            env.callMethod(definition, "getArguments", TextDescriptor.class),
                            env,
                            true)) {
                argument = ZVal.assign(zpairResult1660.getValue());
                this.describeInputArgument(
                        env,
                        argument,
                        function_array_merge
                                .f
                                .env(env)
                                .call(options, ZVal.newArray(new ZPair("total_width", totalWidth)))
                                .value());
                this.writeText(env, "\n");
            }
        }

        if (ZVal.toBool(env.callMethod(definition, "getArguments", TextDescriptor.class))
                && ZVal.toBool(env.callMethod(definition, "getOptions", TextDescriptor.class))) {
            this.writeText(env, "\n");
        }

        if (ZVal.isTrue(env.callMethod(definition, "getOptions", TextDescriptor.class))) {
            laterOptions.setObject(ZVal.newArray());
            this.writeText(env, "<comment>Options:</comment>", options);
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1661 :
                    ZVal.getIterable(
                            env.callMethod(definition, "getOptions", TextDescriptor.class),
                            env,
                            true)) {
                option = ZVal.assign(zpairResult1661.getValue());
                if (ZVal.isGreaterThan(
                        function_strlen
                                .f
                                .env(env)
                                .call(env.callMethod(option, "getShortcut", TextDescriptor.class))
                                .value(),
                        '>',
                        1)) {
                    laterOptions.arrayAppend(env).set(option);
                    continue;
                }

                this.writeText(env, "\n");
                this.describeInputOption(
                        env,
                        option,
                        function_array_merge
                                .f
                                .env(env)
                                .call(options, ZVal.newArray(new ZPair("total_width", totalWidth)))
                                .value());
            }

            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1662 : ZVal.getIterable(laterOptions.getObject(), env, true)) {
                option = ZVal.assign(zpairResult1662.getValue());
                this.writeText(env, "\n");
                this.describeInputOption(
                        env,
                        option,
                        function_array_merge
                                .f
                                .env(env)
                                .call(options, ZVal.newArray(new ZPair("total_width", totalWidth)))
                                .value());
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "command",
        typeHint = "Symfony\\Component\\Console\\Command\\Command"
    )
    @ConvertedParameter(
        index = 1,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    protected Object describeCommand(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        Object options = assignParameter(args, 1, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object help = null;
        Object usage = null;
        Object description = null;
        Object definition = null;
        env.callMethod(command, "getSynopsis", TextDescriptor.class, true);
        env.callMethod(command, "getSynopsis", TextDescriptor.class, false);
        env.callMethod(command, "mergeApplicationDefinition", TextDescriptor.class, false);
        if (ZVal.isTrue(
                description = env.callMethod(command, "getDescription", TextDescriptor.class))) {
            this.writeText(env, "<comment>Description:</comment>", options);
            this.writeText(env, "\n");
            this.writeText(env, "  " + toStringR(description, env));
            this.writeText(env, "\n\n");
        }

        this.writeText(env, "<comment>Usage:</comment>", options);
        for (ZPair zpairResult1663 :
                ZVal.getIterable(
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        env.callMethod(
                                                                command,
                                                                "getSynopsis",
                                                                TextDescriptor.class,
                                                                true))),
                                        env.callMethod(command, "getAliases", TextDescriptor.class),
                                        env.callMethod(command, "getUsages", TextDescriptor.class))
                                .value(),
                        env,
                        true)) {
            usage = ZVal.assign(zpairResult1663.getValue());
            this.writeText(env, "\n");
            this.writeText(
                    env,
                    "  " + toStringR(OutputFormatter.runtimeStaticObject.escape(env, usage), env),
                    options);
        }

        this.writeText(env, "\n");
        definition = env.callMethod(command, "getNativeDefinition", TextDescriptor.class);
        if (ZVal.toBool(env.callMethod(definition, "getOptions", TextDescriptor.class))
                || ZVal.toBool(env.callMethod(definition, "getArguments", TextDescriptor.class))) {
            this.writeText(env, "\n");
            this.describeInputDefinition(env, definition, options);
            this.writeText(env, "\n");
        }

        help = env.callMethod(command, "getProcessedHelp", TextDescriptor.class);
        if (ZVal.toBool(help)
                && ZVal.toBool(ZVal.strictNotEqualityCheck(help, "!==", description))) {
            this.writeText(env, "\n");
            this.writeText(env, "<comment>Help:</comment>", options);
            this.writeText(env, "\n");
            this.writeText(
                    env,
                    "  "
                            + toStringR(
                                    function_str_replace
                                            .f
                                            .env(env)
                                            .call("\n", "\n  ", help)
                                            .value(),
                                    env),
                    options);
            this.writeText(env, "\n");
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "application",
        typeHint = "Symfony\\Component\\Console\\Application"
    )
    @ConvertedParameter(
        index = 1,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    protected Object describeApplication(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/console/Descriptor")
                        .setFile("/vendor/symfony/console/Descriptor/TextDescriptor.php");
        int runtimeConverterContinueCount;
        Object application = assignParameter(args, 0, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        Object describedNamespace = null;
        Object description = null;
        Object commandAliases = null;
        Object command = null;
        Object spacingWidth = null;
        Object help = null;
        Object width = null;
        Object name = null;
        ReferenceContainer namespace = new BasicReferenceContainer(null);
        ReferenceContainer commands = new BasicReferenceContainer(null);
        Object namespaces = null;
        ReferenceContainer describedNamespaceInfo = new BasicReferenceContainer(null);
        describedNamespace =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, options, env, "namespace")
                                ? options.arrayGet(env, "namespace")
                                : ZVal.getNull());
        description = new ApplicationDescription(env, application, describedNamespace);
        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, options, env, "raw_text"))
                && ZVal.toBool(options.arrayGet(env, "raw_text"))) {
            width =
                    this.getColumnWidth(
                            env, env.callMethod(description, "getCommands", TextDescriptor.class));
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1664 :
                    ZVal.getIterable(
                            env.callMethod(description, "getCommands", TextDescriptor.class),
                            env,
                            true)) {
                command = ZVal.assign(zpairResult1664.getValue());
                this.writeText(
                        env,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "%-" + toStringR(width, env) + "s %s",
                                        env.callMethod(command, "getName", TextDescriptor.class),
                                        env.callMethod(
                                                command, "getDescription", TextDescriptor.class))
                                .value(),
                        options.getObject());
                this.writeText(env, "\n");
            }

        } else {
            if (ZVal.notEqualityCheck(
                    "", help = env.callMethod(application, "getHelp", TextDescriptor.class))) {
                this.writeText(env, toStringR(help, env) + "\n\n", options.getObject());
            }

            this.writeText(env, "<comment>Usage:</comment>\n", options.getObject());
            this.writeText(env, "  command [options] [arguments]\n\n", options.getObject());
            this.describeInputDefinition(
                    env,
                    new InputDefinition(
                            env,
                            env.callMethod(
                                    env.callMethod(
                                            application, "getDefinition", TextDescriptor.class),
                                    "getOptions",
                                    TextDescriptor.class)),
                    options.getObject());
            this.writeText(env, "\n");
            this.writeText(env, "\n");
            commands.setObject(env.callMethod(description, "getCommands", TextDescriptor.class));
            namespaces = env.callMethod(description, "getNamespaces", TextDescriptor.class);
            if (ZVal.toBool(describedNamespace) && ZVal.toBool(namespaces)) {
                describedNamespaceInfo.setObject(
                        function_reset.f.env(env).call(namespaces).value());
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1665 :
                        ZVal.getIterable(
                                describedNamespaceInfo.arrayGet(env, "commands"), env, true)) {
                    name = ZVal.assign(zpairResult1665.getValue());
                    commands.arrayAccess(env, name)
                            .set(
                                    env.callMethod(
                                            description, "getCommand", TextDescriptor.class, name));
                }
            }

            width =
                    this.getColumnWidth(
                            env,
                            function_array_merge
                                    .f
                                    .env(env)
                                    .call(
                                            PackedVaradicArgs.unpack(
                                                    new PackedVaradicArgs(
                                                            function_array_values
                                                                    .f
                                                                    .env(env)
                                                                    .call(
                                                                            function_array_map
                                                                                    .f
                                                                                    .env(env)
                                                                                    .call(
                                                                                            new Closure(
                                                                                                    env,
                                                                                                    runtimeConverterFunctionClassConstants,
                                                                                                    "Symfony\\Component\\Console\\Descriptor",
                                                                                                    this) {
                                                                                                @Override
                                                                                                @ConvertedMethod
                                                                                                @ConvertedParameter(
                                                                                                    index =
                                                                                                            0,
                                                                                                    name =
                                                                                                            "namespace"
                                                                                                )
                                                                                                public
                                                                                                Object
                                                                                                        run(
                                                                                                                RuntimeEnv
                                                                                                                        env,
                                                                                                                Object
                                                                                                                        thisvar,
                                                                                                                PassByReferenceArgs
                                                                                                                        runtimePassByReferenceArgs,
                                                                                                                Object...
                                                                                                                        args) {
                                                                                                    ReferenceContainer
                                                                                                            namespace =
                                                                                                                    new BasicReferenceContainer(
                                                                                                                            assignParameter(
                                                                                                                                    args,
                                                                                                                                    0,
                                                                                                                                    false));
                                                                                                    Object
                                                                                                            commands =
                                                                                                                    null;
                                                                                                    commands =
                                                                                                            this
                                                                                                                    .contextReferences
                                                                                                                    .getCapturedValue(
                                                                                                                            "commands");
                                                                                                    return ZVal
                                                                                                            .assign(
                                                                                                                    function_array_intersect
                                                                                                                            .f
                                                                                                                            .env(
                                                                                                                                    env)
                                                                                                                            .call(
                                                                                                                                    namespace
                                                                                                                                            .arrayGet(
                                                                                                                                                    env,
                                                                                                                                                    "commands"),
                                                                                                                                    function_array_keys
                                                                                                                                            .f
                                                                                                                                            .env(
                                                                                                                                                    env)
                                                                                                                                            .call(
                                                                                                                                                    commands)
                                                                                                                                            .value())
                                                                                                                            .value());
                                                                                                }
                                                                                            }.use(
                                                                                                    "commands",
                                                                                                    commands),
                                                                                            namespaces)
                                                                                    .value())
                                                                    .value())))
                                    .value());
            if (ZVal.isTrue(describedNamespace)) {
                this.writeText(
                        env,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "<comment>Available commands for the \"%s\" namespace:</comment>",
                                        describedNamespace)
                                .value(),
                        options.getObject());

            } else {
                this.writeText(env, "<comment>Available commands:</comment>", options.getObject());
            }

            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1666 : ZVal.getIterable(namespaces, env, true)) {
                namespace.setObject(ZVal.assign(zpairResult1666.getValue()));
                namespace
                        .arrayAccess(env, "commands")
                        .set(
                                function_array_filter
                                        .f
                                        .env(env)
                                        .call(
                                                namespace.arrayGet(env, "commands"),
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Symfony\\Component\\Console\\Descriptor",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(index = 0, name = "name")
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object name =
                                                                assignParameter(args, 0, false);
                                                        ReferenceContainer commands =
                                                                new BasicReferenceContainer(null);
                                                        commands =
                                                                this.contextReferences
                                                                        .getReferenceContainer(
                                                                                "commands");
                                                        return ZVal.assign(
                                                                arrayActionR(
                                                                        ArrayAction.ISSET,
                                                                        commands,
                                                                        env,
                                                                        name));
                                                    }
                                                }.use("commands", commands))
                                        .value());
                if (!ZVal.isTrue(namespace.arrayGet(env, "commands"))) {
                    continue;
                }

                if (ZVal.toBool(!ZVal.isTrue(describedNamespace))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        ApplicationDescription.CONST_GLOBAL_NAMESPACE,
                                        "!==",
                                        namespace.arrayGet(env, "id")))) {
                    this.writeText(env, "\n");
                    this.writeText(
                            env,
                            " <comment>"
                                    + toStringR(namespace.arrayGet(env, "id"), env)
                                    + "</comment>",
                            options.getObject());
                }

                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1667 :
                        ZVal.getIterable(namespace.arrayGet(env, "commands"), env, true)) {
                    name = ZVal.assign(zpairResult1667.getValue());
                    this.writeText(env, "\n");
                    spacingWidth =
                            ZVal.subtract(width, Helper.runtimeStaticObject.strlen(env, name));
                    command = ZVal.assign(commands.arrayGet(env, name));
                    commandAliases =
                            ZVal.assign(
                                    ZVal.strictEqualityCheck(
                                                    name,
                                                    "===",
                                                    env.callMethod(
                                                            command,
                                                            "getName",
                                                            TextDescriptor.class))
                                            ? this.getCommandAliasesText(env, command)
                                            : "");
                    this.writeText(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "  <info>%s</info>%s%s",
                                            name,
                                            function_str_repeat
                                                    .f
                                                    .env(env)
                                                    .call(" ", spacingWidth)
                                                    .value(),
                                            toStringR(commandAliases, env)
                                                    + toStringR(
                                                            env.callMethod(
                                                                    command,
                                                                    "getDescription",
                                                                    TextDescriptor.class),
                                                            env))
                                    .value(),
                            options.getObject());
                }
            }

            this.writeText(env, "\n");
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content")
    @ConvertedParameter(
        index = 1,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    private Object writeText(RuntimeEnv env, Object... args) {
        Object content = assignParameter(args, 0, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        env.callMethod(
                this,
                "write",
                TextDescriptor.class,
                ZVal.toBool(arrayActionR(ArrayAction.ISSET, options, env, "raw_text"))
                                && ZVal.toBool(options.arrayGet(env, "raw_text"))
                        ? NamespaceGlobal.strip_tags.env(env).call(content).value()
                        : content,
                arrayActionR(ArrayAction.ISSET, options, env, "raw_output")
                        ? !ZVal.isTrue(options.arrayGet(env, "raw_output"))
                        : true);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "command",
        typeHint = "Symfony\\Component\\Console\\Command\\Command"
    )
    private Object getCommandAliasesText(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        Object aliases = null;
        Object text = null;
        text = "";
        aliases = env.callMethod(command, "getAliases", TextDescriptor.class);
        if (ZVal.isTrue(aliases)) {
            text =
                    "["
                            + toStringR(
                                    NamespaceGlobal.implode.env(env).call("|", aliases).value(),
                                    env)
                            + "] ";
        }

        return ZVal.assign(text);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "default")
    private Object formatDefaultValue(RuntimeEnv env, Object... args) {
        ReferenceContainer _pDefault = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object value = null;
        Object key = null;
        if (ZVal.strictEqualityCheck(
                function_constant.get(env, "INF"), "===", _pDefault.getObject())) {
            return "INF";
        }

        if (function_is_string.f.env(env).call(_pDefault.getObject()).getBool()) {
            _pDefault.setObject(
                    OutputFormatter.runtimeStaticObject.escape(env, _pDefault.getObject()));

        } else if (function_is_array.f.env(env).call(_pDefault.getObject()).getBool()) {
            for (ZPair zpairResult1668 : ZVal.getIterable(_pDefault.getObject(), env, false)) {
                key = ZVal.assign(zpairResult1668.getKey());
                value = ZVal.assign(zpairResult1668.getValue());
                if (function_is_string.f.env(env).call(value).getBool()) {
                    _pDefault
                            .arrayAccess(env, key)
                            .set(OutputFormatter.runtimeStaticObject.escape(env, value));
                }
            }
        }

        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                "\\\\",
                                "\\",
                                NamespaceGlobal.json_encode
                                        .env(env)
                                        .call(
                                                _pDefault.getObject(),
                                                ZVal.toLong(64) | ZVal.toLong(256))
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "commands", typeHint = "array")
    private Object getColumnWidth(RuntimeEnv env, Object... args) {
        Object commands = assignParameter(args, 0, false);
        Object alias = null;
        ReferenceContainer widths = new BasicReferenceContainer(null);
        Object command = null;
        widths.setObject(ZVal.newArray());
        for (ZPair zpairResult1669 : ZVal.getIterable(commands, env, true)) {
            command = ZVal.assign(zpairResult1669.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            command,
                            Command.class,
                            "Symfony\\Component\\Console\\Command\\Command"))) {
                widths.arrayAppend(env)
                        .set(
                                Helper.runtimeStaticObject.strlen(
                                        env,
                                        env.callMethod(command, "getName", TextDescriptor.class)));
                for (ZPair zpairResult1670 :
                        ZVal.getIterable(
                                env.callMethod(command, "getAliases", TextDescriptor.class),
                                env,
                                true)) {
                    alias = ZVal.assign(zpairResult1670.getValue());
                    widths.arrayAppend(env).set(Helper.runtimeStaticObject.strlen(env, alias));
                }

            } else {
                widths.arrayAppend(env).set(Helper.runtimeStaticObject.strlen(env, command));
            }
        }

        return ZVal.assign(
                ZVal.isTrue(widths.getObject())
                        ? ZVal.add(NamespaceGlobal.max.env(env).call(widths.getObject()).value(), 2)
                        : 0);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options", typeHint = "array")
    private Object calculateTotalWidthForOptions(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, false);
        Object nameLength = null;
        Object valueLength = null;
        Object totalWidth = null;
        Object option = null;
        totalWidth = 0;
        for (ZPair zpairResult1671 : ZVal.getIterable(options, env, true)) {
            option = ZVal.assign(zpairResult1671.getValue());
            nameLength =
                    ZVal.add(
                            ZVal.add(
                                    ZVal.add(
                                            1,
                                            NamespaceGlobal.max
                                                    .env(env)
                                                    .call(
                                                            Helper.runtimeStaticObject.strlen(
                                                                    env,
                                                                    env.callMethod(
                                                                            option,
                                                                            "getShortcut",
                                                                            TextDescriptor.class)),
                                                            1)
                                                    .value()),
                                    4),
                            Helper.runtimeStaticObject.strlen(
                                    env, env.callMethod(option, "getName", TextDescriptor.class)));
            if (ZVal.isTrue(env.callMethod(option, "acceptValue", TextDescriptor.class))) {
                valueLength =
                        ZVal.add(
                                1,
                                Helper.runtimeStaticObject.strlen(
                                        env,
                                        env.callMethod(option, "getName", TextDescriptor.class)));
                valueLength =
                        ZAssignment.add(
                                "+=",
                                valueLength,
                                ZVal.isTrue(
                                                env.callMethod(
                                                        option,
                                                        "isValueOptional",
                                                        TextDescriptor.class))
                                        ? 2
                                        : 0);
                nameLength = ZAssignment.add("+=", nameLength, valueLength);
            }

            totalWidth = NamespaceGlobal.max.env(env).call(totalWidth, nameLength).value();
        }

        return ZVal.assign(totalWidth);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Console\\Descriptor\\TextDescriptor";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Descriptor.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Descriptor\\TextDescriptor")
                    .setLookup(
                            TextDescriptor.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("output")
                    .setFilename("vendor/symfony/console/Descriptor/TextDescriptor.php")
                    .addInterface("Symfony\\Component\\Console\\Descriptor\\DescriptorInterface")
                    .addExtendsClass("Symfony\\Component\\Console\\Descriptor\\Descriptor")
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
