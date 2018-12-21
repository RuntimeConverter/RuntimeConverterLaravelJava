package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Descriptor.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Descriptor.classes.ApplicationDescription;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Descriptor.classes.Descriptor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Descriptor/JsonDescriptor.php

*/

public class JsonDescriptor extends Descriptor {

    public JsonDescriptor(RuntimeEnv env, Object... args) {
        super(env);
    }

    public JsonDescriptor(NoConstructor n) {
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
        Object options = assignParameter(args, 1, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        this.writeData(env, this.getInputArgumentData(env, argument), options);
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
        this.writeData(env, this.getInputOptionData(env, option), options);
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
        this.writeData(env, this.getInputDefinitionData(env, definition), options);
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
        this.writeData(env, this.getCommandData(env, command), options);
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
        Object application = assignParameter(args, 0, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        ReferenceContainer data = new BasicReferenceContainer(null);
        Object describedNamespace = null;
        Object description = null;
        ReferenceContainer commands = new BasicReferenceContainer(null);
        Object command = null;
        describedNamespace =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, options, env, "namespace")
                                ? options.arrayGet(env, "namespace")
                                : ZVal.getNull());
        description = new ApplicationDescription(env, application, describedNamespace, true);
        commands.setObject(ZVal.newArray());
        for (ZPair zpairResult1652 :
                ZVal.getIterable(
                        env.callMethod(description, "getCommands", JsonDescriptor.class),
                        env,
                        true)) {
            command = ZVal.assign(zpairResult1652.getValue());
            commands.arrayAppend(env).set(this.getCommandData(env, command));
        }

        data.setObject(ZVal.newArray());
        if (ZVal.strictNotEqualityCheck(
                "UNKNOWN", "!==", env.callMethod(application, "getName", JsonDescriptor.class))) {
            data.arrayAccess(env, "application", "name")
                    .set(env.callMethod(application, "getName", JsonDescriptor.class));
            if (ZVal.strictNotEqualityCheck(
                    "UNKNOWN",
                    "!==",
                    env.callMethod(application, "getVersion", JsonDescriptor.class))) {
                data.arrayAccess(env, "application", "version")
                        .set(env.callMethod(application, "getVersion", JsonDescriptor.class));
            }
        }

        data.arrayAccess(env, "commands").set(commands.getObject());
        if (ZVal.isTrue(describedNamespace)) {
            data.arrayAccess(env, "namespace").set(describedNamespace);

        } else {
            data.arrayAccess(env, "namespaces")
                    .set(
                            function_array_values
                                    .f
                                    .env(env)
                                    .call(
                                            env.callMethod(
                                                    description,
                                                    "getNamespaces",
                                                    JsonDescriptor.class))
                                    .value());
        }

        this.writeData(env, data.getObject(), options.getObject());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    @ConvertedParameter(index = 1, name = "options", typeHint = "array")
    private Object writeData(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 1, false));
        env.callMethod(
                this,
                "write",
                JsonDescriptor.class,
                NamespaceGlobal.json_encode
                        .env(env)
                        .call(
                                data,
                                arrayActionR(ArrayAction.ISSET, options, env, "json_encoding")
                                        ? options.arrayGet(env, "json_encoding")
                                        : 0)
                        .value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "argument",
        typeHint = "Symfony\\Component\\Console\\Input\\InputArgument"
    )
    private Object getInputArgumentData(RuntimeEnv env, Object... args) {
        Object argument = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "name", env.callMethod(argument, "getName", JsonDescriptor.class)),
                        new ZPair(
                                "is_required",
                                env.callMethod(argument, "isRequired", JsonDescriptor.class)),
                        new ZPair(
                                "is_array",
                                env.callMethod(argument, "isArray", JsonDescriptor.class)),
                        new ZPair(
                                "description",
                                function_preg_replace
                                        .f
                                        .env(env)
                                        .call(
                                                "/\\s*[\\r\\n]\\s*/",
                                                " ",
                                                env.callMethod(
                                                        argument,
                                                        "getDescription",
                                                        JsonDescriptor.class))
                                        .value()),
                        new ZPair(
                                "default",
                                ZVal.strictEqualityCheck(
                                                function_constant.get(env, "INF"),
                                                "===",
                                                env.callMethod(
                                                        argument,
                                                        "getDefault",
                                                        JsonDescriptor.class))
                                        ? "INF"
                                        : env.callMethod(
                                                argument, "getDefault", JsonDescriptor.class))));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "option",
        typeHint = "Symfony\\Component\\Console\\Input\\InputOption"
    )
    private Object getInputOptionData(RuntimeEnv env, Object... args) {
        Object option = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "name",
                                "--"
                                        + toStringR(
                                                env.callMethod(
                                                        option, "getName", JsonDescriptor.class),
                                                env)),
                        new ZPair(
                                "shortcut",
                                ZVal.isTrue(
                                                env.callMethod(
                                                        option,
                                                        "getShortcut",
                                                        JsonDescriptor.class))
                                        ? "-"
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
                                                                                JsonDescriptor
                                                                                        .class))
                                                                .value(),
                                                        env)
                                        : ""),
                        new ZPair(
                                "accept_value",
                                env.callMethod(option, "acceptValue", JsonDescriptor.class)),
                        new ZPair(
                                "is_value_required",
                                env.callMethod(option, "isValueRequired", JsonDescriptor.class)),
                        new ZPair(
                                "is_multiple",
                                env.callMethod(option, "isArray", JsonDescriptor.class)),
                        new ZPair(
                                "description",
                                function_preg_replace
                                        .f
                                        .env(env)
                                        .call(
                                                "/\\s*[\\r\\n]\\s*/",
                                                " ",
                                                env.callMethod(
                                                        option,
                                                        "getDescription",
                                                        JsonDescriptor.class))
                                        .value()),
                        new ZPair(
                                "default",
                                ZVal.strictEqualityCheck(
                                                function_constant.get(env, "INF"),
                                                "===",
                                                env.callMethod(
                                                        option, "getDefault", JsonDescriptor.class))
                                        ? "INF"
                                        : env.callMethod(
                                                option, "getDefault", JsonDescriptor.class))));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "definition",
        typeHint = "Symfony\\Component\\Console\\Input\\InputDefinition"
    )
    private Object getInputDefinitionData(RuntimeEnv env, Object... args) {
        Object definition = assignParameter(args, 0, false);
        Object argument = null;
        ReferenceContainer inputArguments = new BasicReferenceContainer(null);
        ReferenceContainer inputOptions = new BasicReferenceContainer(null);
        Object name = null;
        Object option = null;
        inputArguments.setObject(ZVal.newArray());
        for (ZPair zpairResult1653 :
                ZVal.getIterable(
                        env.callMethod(definition, "getArguments", JsonDescriptor.class),
                        env,
                        false)) {
            name = ZVal.assign(zpairResult1653.getKey());
            argument = ZVal.assign(zpairResult1653.getValue());
            inputArguments.arrayAccess(env, name).set(this.getInputArgumentData(env, argument));
        }

        inputOptions.setObject(ZVal.newArray());
        for (ZPair zpairResult1654 :
                ZVal.getIterable(
                        env.callMethod(definition, "getOptions", JsonDescriptor.class),
                        env,
                        false)) {
            name = ZVal.assign(zpairResult1654.getKey());
            option = ZVal.assign(zpairResult1654.getValue());
            inputOptions.arrayAccess(env, name).set(this.getInputOptionData(env, option));
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("arguments", inputArguments.getObject()),
                        new ZPair("options", inputOptions.getObject())));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "command",
        typeHint = "Symfony\\Component\\Console\\Command\\Command"
    )
    private Object getCommandData(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        env.callMethod(command, "getSynopsis", JsonDescriptor.class);
        env.callMethod(command, "mergeApplicationDefinition", JsonDescriptor.class, false);
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("name", env.callMethod(command, "getName", JsonDescriptor.class)),
                        new ZPair(
                                "usage",
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
                                                                        JsonDescriptor.class))),
                                                env.callMethod(
                                                        command, "getUsages", JsonDescriptor.class),
                                                env.callMethod(
                                                        command,
                                                        "getAliases",
                                                        JsonDescriptor.class))
                                        .value()),
                        new ZPair(
                                "description",
                                env.callMethod(command, "getDescription", JsonDescriptor.class)),
                        new ZPair(
                                "help",
                                env.callMethod(command, "getProcessedHelp", JsonDescriptor.class)),
                        new ZPair(
                                "definition",
                                this.getInputDefinitionData(
                                        env,
                                        env.callMethod(
                                                command,
                                                "getNativeDefinition",
                                                JsonDescriptor.class))),
                        new ZPair(
                                "hidden",
                                env.callMethod(command, "isHidden", JsonDescriptor.class))));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Console\\Descriptor\\JsonDescriptor";

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
                    .setName("Symfony\\Component\\Console\\Descriptor\\JsonDescriptor")
                    .setLookup(
                            JsonDescriptor.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("output")
                    .setFilename("vendor/symfony/console/Descriptor/JsonDescriptor.php")
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
