package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Descriptor.classes;

import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reduce;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
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
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Descriptor.classes.ApplicationDescription;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Descriptor.classes.Descriptor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Descriptor/MarkdownDescriptor.php

*/

public class MarkdownDescriptor extends Descriptor {

    public MarkdownDescriptor(RuntimeEnv env, Object... args) {
        super(env);
    }

    public MarkdownDescriptor(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    @ConvertedParameter(index = 1, name = "object")
    @ConvertedParameter(
        index = 2,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object describe(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        Object _object = assignParameter(args, 1, false);
        Object options = assignParameter(args, 2, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object decorated = null;
        decorated = env.callMethod(output, "isDecorated", MarkdownDescriptor.class);
        env.callMethod(output, "setDecorated", MarkdownDescriptor.class, false);
        super.describe(env, output, _object, options);
        env.callMethod(output, "setDecorated", MarkdownDescriptor.class, decorated);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content")
    @ConvertedParameter(
        index = 1,
        name = "decorated",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    protected Object write(RuntimeEnv env, Object... args) {
        Object content = assignParameter(args, 0, false);
        Object decorated = assignParameter(args, 1, true);
        if (null == decorated) {
            decorated = true;
        }
        super.write(env, content, decorated);
        return null;
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
        Object options = assignParameter(args, 1, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object ternaryExpressionTemp = null;
        this.write(
                env,
                "#### `"
                        + toStringR(
                                ZVal.isTrue(
                                                ternaryExpressionTemp =
                                                        env.callMethod(
                                                                argument,
                                                                "getName",
                                                                MarkdownDescriptor.class))
                                        ? ternaryExpressionTemp
                                        : "<none>",
                                env)
                        + "`\n\n"
                        + toStringR(
                                ZVal.isTrue(
                                                env.callMethod(
                                                        argument,
                                                        "getDescription",
                                                        MarkdownDescriptor.class))
                                        ? toStringR(
                                                        function_preg_replace
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        "/\\s*[\\r\\n]\\s*/",
                                                                        "\n",
                                                                        env.callMethod(
                                                                                argument,
                                                                                "getDescription",
                                                                                MarkdownDescriptor
                                                                                        .class))
                                                                .value(),
                                                        env)
                                                + "\n\n"
                                        : "",
                                env)
                        + "* Is required: "
                        + toStringR(
                                ZVal.isTrue(
                                                env.callMethod(
                                                        argument,
                                                        "isRequired",
                                                        MarkdownDescriptor.class))
                                        ? "yes"
                                        : "no",
                                env)
                        + "\n"
                        + "* Is array: "
                        + toStringR(
                                ZVal.isTrue(
                                                env.callMethod(
                                                        argument,
                                                        "isArray",
                                                        MarkdownDescriptor.class))
                                        ? "yes"
                                        : "no",
                                env)
                        + "\n"
                        + "* Default: `"
                        + toStringR(
                                function_str_replace
                                        .f
                                        .env(env)
                                        .call(
                                                "\n",
                                                "",
                                                NamespaceGlobal.var_export
                                                        .env(env)
                                                        .call(
                                                                env.callMethod(
                                                                        argument,
                                                                        "getDefault",
                                                                        MarkdownDescriptor.class),
                                                                true)
                                                        .value())
                                        .value(),
                                env)
                        + "`");
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
        Object options = assignParameter(args, 1, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object name = null;
        name = "--" + toStringR(env.callMethod(option, "getName", MarkdownDescriptor.class), env);
        if (ZVal.isTrue(env.callMethod(option, "getShortcut", MarkdownDescriptor.class))) {
            name =
                    toStringR(name, env)
                            + "|-"
                            + toStringR(
                                    function_str_replace
                                            .f
                                            .env(env)
                                            .call(
                                                    "|",
                                                    "|-",
                                                    env.callMethod(
                                                            option,
                                                            "getShortcut",
                                                            MarkdownDescriptor.class))
                                            .value(),
                                    env)
                            + "";
        }

        this.write(
                env,
                "#### `"
                        + toStringR(name, env)
                        + "`"
                        + "\n\n"
                        + toStringR(
                                ZVal.isTrue(
                                                env.callMethod(
                                                        option,
                                                        "getDescription",
                                                        MarkdownDescriptor.class))
                                        ? toStringR(
                                                        function_preg_replace
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        "/\\s*[\\r\\n]\\s*/",
                                                                        "\n",
                                                                        env.callMethod(
                                                                                option,
                                                                                "getDescription",
                                                                                MarkdownDescriptor
                                                                                        .class))
                                                                .value(),
                                                        env)
                                                + "\n\n"
                                        : "",
                                env)
                        + "* Accept value: "
                        + toStringR(
                                ZVal.isTrue(
                                                env.callMethod(
                                                        option,
                                                        "acceptValue",
                                                        MarkdownDescriptor.class))
                                        ? "yes"
                                        : "no",
                                env)
                        + "\n"
                        + "* Is value required: "
                        + toStringR(
                                ZVal.isTrue(
                                                env.callMethod(
                                                        option,
                                                        "isValueRequired",
                                                        MarkdownDescriptor.class))
                                        ? "yes"
                                        : "no",
                                env)
                        + "\n"
                        + "* Is multiple: "
                        + toStringR(
                                ZVal.isTrue(
                                                env.callMethod(
                                                        option,
                                                        "isArray",
                                                        MarkdownDescriptor.class))
                                        ? "yes"
                                        : "no",
                                env)
                        + "\n"
                        + "* Default: `"
                        + toStringR(
                                function_str_replace
                                        .f
                                        .env(env)
                                        .call(
                                                "\n",
                                                "",
                                                NamespaceGlobal.var_export
                                                        .env(env)
                                                        .call(
                                                                env.callMethod(
                                                                        option,
                                                                        "getDefault",
                                                                        MarkdownDescriptor.class),
                                                                true)
                                                        .value())
                                        .value(),
                                env)
                        + "`");
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
        Object definition = assignParameter(args, 0, false);
        Object options = assignParameter(args, 1, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object argument = null;
        Object showArguments = null;
        Object option = null;
        if (ZVal.isTrue(
                showArguments =
                        ZVal.isGreaterThan(
                                function_count
                                        .f
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        definition,
                                                        "getArguments",
                                                        MarkdownDescriptor.class))
                                        .value(),
                                '>',
                                0))) {
            this.write(env, "### Arguments");
            for (ZPair zpairResult1655 :
                    ZVal.getIterable(
                            env.callMethod(definition, "getArguments", MarkdownDescriptor.class),
                            env,
                            true)) {
                argument = ZVal.assign(zpairResult1655.getValue());
                this.write(env, "\n\n");
                this.write(env, this.describeInputArgument(env, argument));
            }
        }

        if (ZVal.isGreaterThan(
                function_count
                        .f
                        .env(env)
                        .call(env.callMethod(definition, "getOptions", MarkdownDescriptor.class))
                        .value(),
                '>',
                0)) {
            if (ZVal.isTrue(showArguments)) {
                this.write(env, "\n\n");
            }

            this.write(env, "### Options");
            for (ZPair zpairResult1656 :
                    ZVal.getIterable(
                            env.callMethod(definition, "getOptions", MarkdownDescriptor.class),
                            env,
                            true)) {
                option = ZVal.assign(zpairResult1656.getValue());
                this.write(env, "\n\n");
                this.write(env, this.describeInputOption(env, option));
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
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/console/Descriptor")
                        .setFile("/vendor/symfony/console/Descriptor/MarkdownDescriptor.php");
        Object command = assignParameter(args, 0, false);
        Object options = assignParameter(args, 1, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object help = null;
        env.callMethod(command, "getSynopsis", MarkdownDescriptor.class);
        env.callMethod(command, "mergeApplicationDefinition", MarkdownDescriptor.class, false);
        this.write(
                env,
                "`"
                        + toStringR(
                                env.callMethod(command, "getName", MarkdownDescriptor.class), env)
                        + "`\n"
                        + toStringR(
                                function_str_repeat
                                        .f
                                        .env(env)
                                        .call(
                                                "-",
                                                ZVal.add(
                                                        Helper.runtimeStaticObject.strlen(
                                                                env,
                                                                env.callMethod(
                                                                        command,
                                                                        "getName",
                                                                        MarkdownDescriptor.class)),
                                                        2))
                                        .value(),
                                env)
                        + "\n\n"
                        + toStringR(
                                ZVal.isTrue(
                                                env.callMethod(
                                                        command,
                                                        "getDescription",
                                                        MarkdownDescriptor.class))
                                        ? toStringR(
                                                        env.callMethod(
                                                                command,
                                                                "getDescription",
                                                                MarkdownDescriptor.class),
                                                        env)
                                                + "\n\n"
                                        : "",
                                env)
                        + "### Usage"
                        + "\n\n"
                        + toStringR(
                                function_array_reduce
                                        .f
                                        .env(env)
                                        .call(
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
                                                                                        MarkdownDescriptor
                                                                                                .class))),
                                                                env.callMethod(
                                                                        command,
                                                                        "getAliases",
                                                                        MarkdownDescriptor.class),
                                                                env.callMethod(
                                                                        command,
                                                                        "getUsages",
                                                                        MarkdownDescriptor.class))
                                                        .value(),
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Symfony\\Component\\Console\\Descriptor",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(index = 0, name = "carry")
                                                    @ConvertedParameter(index = 1, name = "usage")
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object carry =
                                                                assignParameter(args, 0, false);
                                                        Object usage =
                                                                assignParameter(args, 1, false);
                                                        return ZVal.assign(
                                                                toStringR(carry, env)
                                                                        + "* `"
                                                                        + toStringR(usage, env)
                                                                        + "`"
                                                                        + "\n");
                                                    }
                                                })
                                        .value(),
                                env));
        if (ZVal.isTrue(
                help = env.callMethod(command, "getProcessedHelp", MarkdownDescriptor.class))) {
            this.write(env, "\n");
            this.write(env, help);
        }

        if (ZVal.isTrue(env.callMethod(command, "getNativeDefinition", MarkdownDescriptor.class))) {
            this.write(env, "\n\n");
            this.describeInputDefinition(
                    env, env.callMethod(command, "getNativeDefinition", MarkdownDescriptor.class));
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
                        .setFile("/vendor/symfony/console/Descriptor/MarkdownDescriptor.php");
        Object application = assignParameter(args, 0, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        Object describedNamespace = null;
        ReferenceContainer namespace = new BasicReferenceContainer(null);
        Object description = null;
        Object title = null;
        Object command = null;
        describedNamespace =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, options, env, "namespace")
                                ? options.arrayGet(env, "namespace")
                                : ZVal.getNull());
        description = new ApplicationDescription(env, application, describedNamespace);
        title = this.getApplicationTitle(env, application);
        this.write(
                env,
                toStringR(title, env)
                        + "\n"
                        + toStringR(
                                function_str_repeat
                                        .f
                                        .env(env)
                                        .call("=", Helper.runtimeStaticObject.strlen(env, title))
                                        .value(),
                                env));
        for (ZPair zpairResult1657 :
                ZVal.getIterable(
                        env.callMethod(description, "getNamespaces", MarkdownDescriptor.class),
                        env,
                        true)) {
            namespace.setObject(ZVal.assign(zpairResult1657.getValue()));
            if (ZVal.strictNotEqualityCheck(
                    ApplicationDescription.CONST_GLOBAL_NAMESPACE,
                    "!==",
                    namespace.arrayGet(env, "id"))) {
                this.write(env, "\n\n");
                this.write(env, "**" + toStringR(namespace.arrayGet(env, "id"), env) + ":**");
            }

            this.write(env, "\n\n");
            this.write(
                    env,
                    NamespaceGlobal.implode
                            .env(env)
                            .call(
                                    "\n",
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
                                                            index = 0,
                                                            name = "commandName"
                                                        )
                                                        public Object run(
                                                                RuntimeEnv env,
                                                                Object thisvar,
                                                                PassByReferenceArgs
                                                                        runtimePassByReferenceArgs,
                                                                Object... args) {
                                                            Object commandName =
                                                                    assignParameter(args, 0, false);
                                                            Object description = null;
                                                            description =
                                                                    this.contextReferences
                                                                            .getCapturedValue(
                                                                                    "description");
                                                            return ZVal.assign(
                                                                    function_sprintf
                                                                            .f
                                                                            .env(env)
                                                                            .call(
                                                                                    "* [`%s`](#%s)",
                                                                                    commandName,
                                                                                    function_str_replace
                                                                                            .f
                                                                                            .env(
                                                                                                    env)
                                                                                            .call(
                                                                                                    ":",
                                                                                                    "",
                                                                                                    env
                                                                                                            .callMethod(
                                                                                                                    env
                                                                                                                            .callMethod(
                                                                                                                                    description,
                                                                                                                                    "getCommand",
                                                                                                                                    MarkdownDescriptor
                                                                                                                                            .class,
                                                                                                                                    commandName),
                                                                                                                    "getName",
                                                                                                                    MarkdownDescriptor
                                                                                                                            .class))
                                                                                            .value())
                                                                            .value());
                                                        }
                                                    }.use("description", description),
                                                    namespace.arrayGet(env, "commands"))
                                            .value())
                            .value());
        }

        for (ZPair zpairResult1658 :
                ZVal.getIterable(
                        env.callMethod(description, "getCommands", MarkdownDescriptor.class),
                        env,
                        true)) {
            command = ZVal.assign(zpairResult1658.getValue());
            this.write(env, "\n\n");
            this.write(env, this.describeCommand(env, command));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "application",
        typeHint = "Symfony\\Component\\Console\\Application"
    )
    private Object getApplicationTitle(RuntimeEnv env, Object... args) {
        Object application = assignParameter(args, 0, false);
        if (ZVal.strictNotEqualityCheck(
                "UNKNOWN",
                "!==",
                env.callMethod(application, "getName", MarkdownDescriptor.class))) {
            if (ZVal.strictNotEqualityCheck(
                    "UNKNOWN",
                    "!==",
                    env.callMethod(application, "getVersion", MarkdownDescriptor.class))) {
                return ZVal.assign(
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "%s %s",
                                        env.callMethod(
                                                application, "getName", MarkdownDescriptor.class),
                                        env.callMethod(
                                                application,
                                                "getVersion",
                                                MarkdownDescriptor.class))
                                .value());
            }

            return ZVal.assign(env.callMethod(application, "getName", MarkdownDescriptor.class));
        }

        return "Console Tool";
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Console\\Descriptor\\MarkdownDescriptor";

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
                    .setName("Symfony\\Component\\Console\\Descriptor\\MarkdownDescriptor")
                    .setLookup(
                            MarkdownDescriptor.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("output")
                    .setFilename("vendor/symfony/console/Descriptor/MarkdownDescriptor.php")
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
