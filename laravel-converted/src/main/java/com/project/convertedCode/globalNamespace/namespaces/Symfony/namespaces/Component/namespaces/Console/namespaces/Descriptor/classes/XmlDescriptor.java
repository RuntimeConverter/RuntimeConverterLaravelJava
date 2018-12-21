package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Descriptor.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMDocument;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Descriptor.classes.ApplicationDescription;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_bool;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Descriptor.classes.Descriptor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Descriptor/XmlDescriptor.php

*/

public class XmlDescriptor extends Descriptor {

    public XmlDescriptor(RuntimeEnv env, Object... args) {
        super(env);
    }

    public XmlDescriptor(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "definition",
        typeHint = "Symfony\\Component\\Console\\Input\\InputDefinition"
    )
    public Object getInputDefinitionDocument(RuntimeEnv env, Object... args) {
        Object definition = assignParameter(args, 0, false);
        Object definitionXML = null;
        Object argument = null;
        Object dom = null;
        Object optionsXML = null;
        Object argumentsXML = null;
        Object option = null;
        dom = new DOMDocument(env, "1.0", "UTF-8");
        env.callMethod(
                dom,
                "appendChild",
                XmlDescriptor.class,
                definitionXML =
                        env.callMethod(dom, "createElement", XmlDescriptor.class, "definition"));
        env.callMethod(
                definitionXML,
                "appendChild",
                XmlDescriptor.class,
                argumentsXML =
                        env.callMethod(dom, "createElement", XmlDescriptor.class, "arguments"));
        for (ZPair zpairResult1672 :
                ZVal.getIterable(
                        env.callMethod(definition, "getArguments", XmlDescriptor.class),
                        env,
                        true)) {
            argument = ZVal.assign(zpairResult1672.getValue());
            this.appendDocument(env, argumentsXML, this.getInputArgumentDocument(env, argument));
        }

        env.callMethod(
                definitionXML,
                "appendChild",
                XmlDescriptor.class,
                optionsXML = env.callMethod(dom, "createElement", XmlDescriptor.class, "options"));
        for (ZPair zpairResult1673 :
                ZVal.getIterable(
                        env.callMethod(definition, "getOptions", XmlDescriptor.class), env, true)) {
            option = ZVal.assign(zpairResult1673.getValue());
            this.appendDocument(env, optionsXML, this.getInputOptionDocument(env, option));
        }

        return ZVal.assign(dom);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "command",
        typeHint = "Symfony\\Component\\Console\\Command\\Command"
    )
    public Object getCommandDocument(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        Object descriptionXML = null;
        Object commandXML = null;
        Object helpXML = null;
        Object definitionXML = null;
        Object dom = null;
        Object usagesXML = null;
        Object usage = null;
        dom = new DOMDocument(env, "1.0", "UTF-8");
        env.callMethod(
                dom,
                "appendChild",
                XmlDescriptor.class,
                commandXML = env.callMethod(dom, "createElement", XmlDescriptor.class, "command"));
        env.callMethod(command, "getSynopsis", XmlDescriptor.class);
        env.callMethod(command, "mergeApplicationDefinition", XmlDescriptor.class, false);
        env.callMethod(
                commandXML,
                "setAttribute",
                XmlDescriptor.class,
                "id",
                env.callMethod(command, "getName", XmlDescriptor.class));
        env.callMethod(
                commandXML,
                "setAttribute",
                XmlDescriptor.class,
                "name",
                env.callMethod(command, "getName", XmlDescriptor.class));
        env.callMethod(
                commandXML,
                "setAttribute",
                XmlDescriptor.class,
                "hidden",
                ZVal.isTrue(env.callMethod(command, "isHidden", XmlDescriptor.class)) ? 1 : 0);
        env.callMethod(
                commandXML,
                "appendChild",
                XmlDescriptor.class,
                usagesXML = env.callMethod(dom, "createElement", XmlDescriptor.class, "usages"));
        for (ZPair zpairResult1674 :
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
                                                                XmlDescriptor.class))),
                                        env.callMethod(command, "getAliases", XmlDescriptor.class),
                                        env.callMethod(command, "getUsages", XmlDescriptor.class))
                                .value(),
                        env,
                        true)) {
            usage = ZVal.assign(zpairResult1674.getValue());
            env.callMethod(
                    usagesXML,
                    "appendChild",
                    XmlDescriptor.class,
                    env.callMethod(dom, "createElement", XmlDescriptor.class, "usage", usage));
        }

        env.callMethod(
                commandXML,
                "appendChild",
                XmlDescriptor.class,
                descriptionXML =
                        env.callMethod(dom, "createElement", XmlDescriptor.class, "description"));
        env.callMethod(
                descriptionXML,
                "appendChild",
                XmlDescriptor.class,
                env.callMethod(
                        dom,
                        "createTextNode",
                        XmlDescriptor.class,
                        function_str_replace
                                .f
                                .env(env)
                                .call(
                                        "\n",
                                        "\n ",
                                        env.callMethod(
                                                command, "getDescription", XmlDescriptor.class))
                                .value()));
        env.callMethod(
                commandXML,
                "appendChild",
                XmlDescriptor.class,
                helpXML = env.callMethod(dom, "createElement", XmlDescriptor.class, "help"));
        env.callMethod(
                helpXML,
                "appendChild",
                XmlDescriptor.class,
                env.callMethod(
                        dom,
                        "createTextNode",
                        XmlDescriptor.class,
                        function_str_replace
                                .f
                                .env(env)
                                .call(
                                        "\n",
                                        "\n ",
                                        env.callMethod(
                                                command, "getProcessedHelp", XmlDescriptor.class))
                                .value()));
        definitionXML =
                this.getInputDefinitionDocument(
                        env, env.callMethod(command, "getNativeDefinition", XmlDescriptor.class));
        this.appendDocument(
                env,
                commandXML,
                env.callMethod(
                        env.callMethod(
                                definitionXML,
                                "getElementsByTagName",
                                XmlDescriptor.class,
                                "definition"),
                        "item",
                        XmlDescriptor.class,
                        0));
        return ZVal.assign(dom);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "application",
        typeHint = "Symfony\\Component\\Console\\Application"
    )
    @ConvertedParameter(
        index = 1,
        name = "namespace",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getApplicationDocument(RuntimeEnv env, Object... args) {
        Object application = assignParameter(args, 0, false);
        Object namespace = assignParameter(args, 1, true);
        if (null == namespace) {
            namespace = ZVal.getNull();
        }
        Object dom = null;
        Object namespaceArrayXML = null;
        Object description = null;
        ReferenceContainer namespaceDescription = new BasicReferenceContainer(null);
        Object command = null;
        Object commandXML = null;
        Object rootXml = null;
        Object namespacesXML = null;
        Object name = null;
        Object commandsXML = null;
        dom = new DOMDocument(env, "1.0", "UTF-8");
        env.callMethod(
                dom,
                "appendChild",
                XmlDescriptor.class,
                rootXml = env.callMethod(dom, "createElement", XmlDescriptor.class, "symfony"));
        if (ZVal.strictNotEqualityCheck(
                "UNKNOWN", "!==", env.callMethod(application, "getName", XmlDescriptor.class))) {
            env.callMethod(
                    rootXml,
                    "setAttribute",
                    XmlDescriptor.class,
                    "name",
                    env.callMethod(application, "getName", XmlDescriptor.class));
            if (ZVal.strictNotEqualityCheck(
                    "UNKNOWN",
                    "!==",
                    env.callMethod(application, "getVersion", XmlDescriptor.class))) {
                env.callMethod(
                        rootXml,
                        "setAttribute",
                        XmlDescriptor.class,
                        "version",
                        env.callMethod(application, "getVersion", XmlDescriptor.class));
            }
        }

        env.callMethod(
                rootXml,
                "appendChild",
                XmlDescriptor.class,
                commandsXML =
                        env.callMethod(dom, "createElement", XmlDescriptor.class, "commands"));
        description = new ApplicationDescription(env, application, namespace, true);
        if (ZVal.isTrue(namespace)) {
            env.callMethod(
                    commandsXML, "setAttribute", XmlDescriptor.class, "namespace", namespace);
        }

        for (ZPair zpairResult1675 :
                ZVal.getIterable(
                        env.callMethod(description, "getCommands", XmlDescriptor.class),
                        env,
                        true)) {
            command = ZVal.assign(zpairResult1675.getValue());
            this.appendDocument(env, commandsXML, this.getCommandDocument(env, command));
        }

        if (!ZVal.isTrue(namespace)) {
            env.callMethod(
                    rootXml,
                    "appendChild",
                    XmlDescriptor.class,
                    namespacesXML =
                            env.callMethod(
                                    dom, "createElement", XmlDescriptor.class, "namespaces"));
            for (ZPair zpairResult1676 :
                    ZVal.getIterable(
                            env.callMethod(description, "getNamespaces", XmlDescriptor.class),
                            env,
                            true)) {
                namespaceDescription.setObject(ZVal.assign(zpairResult1676.getValue()));
                env.callMethod(
                        namespacesXML,
                        "appendChild",
                        XmlDescriptor.class,
                        namespaceArrayXML =
                                env.callMethod(
                                        dom, "createElement", XmlDescriptor.class, "namespace"));
                env.callMethod(
                        namespaceArrayXML,
                        "setAttribute",
                        XmlDescriptor.class,
                        "id",
                        namespaceDescription.arrayGet(env, "id"));
                for (ZPair zpairResult1677 :
                        ZVal.getIterable(
                                namespaceDescription.arrayGet(env, "commands"), env, true)) {
                    name = ZVal.assign(zpairResult1677.getValue());
                    env.callMethod(
                            namespaceArrayXML,
                            "appendChild",
                            XmlDescriptor.class,
                            commandXML =
                                    env.callMethod(
                                            dom, "createElement", XmlDescriptor.class, "command"));
                    env.callMethod(
                            commandXML,
                            "appendChild",
                            XmlDescriptor.class,
                            env.callMethod(dom, "createTextNode", XmlDescriptor.class, name));
                }
            }
        }

        return ZVal.assign(dom);
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
        this.writeDocument(env, this.getInputArgumentDocument(env, argument));
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
        this.writeDocument(env, this.getInputOptionDocument(env, option));
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
        this.writeDocument(env, this.getInputDefinitionDocument(env, definition));
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
        this.writeDocument(env, this.getCommandDocument(env, command));
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
        this.writeDocument(
                env,
                this.getApplicationDocument(
                        env,
                        application,
                        arrayActionR(ArrayAction.ISSET, options, env, "namespace")
                                ? options.arrayGet(env, "namespace")
                                : ZVal.getNull()));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parentNode", typeHint = "DOMNode")
    @ConvertedParameter(index = 1, name = "importedParent", typeHint = "DOMNode")
    private Object appendDocument(RuntimeEnv env, Object... args) {
        Object parentNode = assignParameter(args, 0, false);
        Object importedParent = assignParameter(args, 1, false);
        Object childNode = null;
        for (ZPair zpairResult1678 :
                ZVal.getIterable(
                        toObjectR(importedParent).accessProp(this, env).name("childNodes").value(),
                        env,
                        true)) {
            childNode = ZVal.assign(zpairResult1678.getValue());
            env.callMethod(
                    parentNode,
                    "appendChild",
                    XmlDescriptor.class,
                    env.callMethod(
                            toObjectR(parentNode)
                                    .accessProp(this, env)
                                    .name("ownerDocument")
                                    .value(),
                            "importNode",
                            XmlDescriptor.class,
                            childNode,
                            true));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dom", typeHint = "DOMDocument")
    private Object writeDocument(RuntimeEnv env, Object... args) {
        Object dom = assignParameter(args, 0, false);
        toObjectR(dom).accessProp(this, env).name("formatOutput").set(true);
        env.callMethod(
                this,
                "write",
                XmlDescriptor.class,
                env.callMethod(dom, "saveXML", XmlDescriptor.class));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "argument",
        typeHint = "Symfony\\Component\\Console\\Input\\InputArgument"
    )
    private Object getInputArgumentDocument(RuntimeEnv env, Object... args) {
        Object argument = assignParameter(args, 0, false);
        Object descriptionXML = null;
        Object _pDefault = null;
        Object dom = null;
        Object defaults = null;
        Object defaultXML = null;
        Object defaultsXML = null;
        Object objectXML = null;
        dom = new DOMDocument(env, "1.0", "UTF-8");
        env.callMethod(
                dom,
                "appendChild",
                XmlDescriptor.class,
                objectXML = env.callMethod(dom, "createElement", XmlDescriptor.class, "argument"));
        env.callMethod(
                objectXML,
                "setAttribute",
                XmlDescriptor.class,
                "name",
                env.callMethod(argument, "getName", XmlDescriptor.class));
        env.callMethod(
                objectXML,
                "setAttribute",
                XmlDescriptor.class,
                "is_required",
                ZVal.isTrue(env.callMethod(argument, "isRequired", XmlDescriptor.class)) ? 1 : 0);
        env.callMethod(
                objectXML,
                "setAttribute",
                XmlDescriptor.class,
                "is_array",
                ZVal.isTrue(env.callMethod(argument, "isArray", XmlDescriptor.class)) ? 1 : 0);
        env.callMethod(
                objectXML,
                "appendChild",
                XmlDescriptor.class,
                descriptionXML =
                        env.callMethod(dom, "createElement", XmlDescriptor.class, "description"));
        env.callMethod(
                descriptionXML,
                "appendChild",
                XmlDescriptor.class,
                env.callMethod(
                        dom,
                        "createTextNode",
                        XmlDescriptor.class,
                        env.callMethod(argument, "getDescription", XmlDescriptor.class)));
        env.callMethod(
                objectXML,
                "appendChild",
                XmlDescriptor.class,
                defaultsXML =
                        env.callMethod(dom, "createElement", XmlDescriptor.class, "defaults"));
        defaults =
                ZVal.assign(
                        function_is_array
                                        .f
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        argument,
                                                        "getDefault",
                                                        XmlDescriptor.class))
                                        .getBool()
                                ? env.callMethod(argument, "getDefault", XmlDescriptor.class)
                                : function_is_bool
                                                .f
                                                .env(env)
                                                .call(
                                                        env.callMethod(
                                                                argument,
                                                                "getDefault",
                                                                XmlDescriptor.class))
                                                .getBool()
                                        ? ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        NamespaceGlobal.var_export
                                                                .env(env)
                                                                .call(
                                                                        env.callMethod(
                                                                                argument,
                                                                                "getDefault",
                                                                                XmlDescriptor
                                                                                        .class),
                                                                        true)
                                                                .value()))
                                        : ZVal.isTrue(
                                                        env.callMethod(
                                                                argument,
                                                                "getDefault",
                                                                XmlDescriptor.class))
                                                ? ZVal.newArray(
                                                        new ZPair(
                                                                0,
                                                                env.callMethod(
                                                                        argument,
                                                                        "getDefault",
                                                                        XmlDescriptor.class)))
                                                : ZVal.newArray());
        for (ZPair zpairResult1679 : ZVal.getIterable(defaults, env, true)) {
            _pDefault = ZVal.assign(zpairResult1679.getValue());
            env.callMethod(
                    defaultsXML,
                    "appendChild",
                    XmlDescriptor.class,
                    defaultXML =
                            env.callMethod(dom, "createElement", XmlDescriptor.class, "default"));
            env.callMethod(
                    defaultXML,
                    "appendChild",
                    XmlDescriptor.class,
                    env.callMethod(dom, "createTextNode", XmlDescriptor.class, _pDefault));
        }

        return ZVal.assign(dom);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "option",
        typeHint = "Symfony\\Component\\Console\\Input\\InputOption"
    )
    private Object getInputOptionDocument(RuntimeEnv env, Object... args) {
        Object option = assignParameter(args, 0, false);
        Object descriptionXML = null;
        Object _pDefault = null;
        Object dom = null;
        Object defaults = null;
        Object pos = null;
        Object defaultXML = null;
        Object defaultsXML = null;
        Object objectXML = null;
        dom = new DOMDocument(env, "1.0", "UTF-8");
        env.callMethod(
                dom,
                "appendChild",
                XmlDescriptor.class,
                objectXML = env.callMethod(dom, "createElement", XmlDescriptor.class, "option"));
        env.callMethod(
                objectXML,
                "setAttribute",
                XmlDescriptor.class,
                "name",
                "--" + toStringR(env.callMethod(option, "getName", XmlDescriptor.class), env));
        pos =
                function_strpos
                        .f
                        .env(env)
                        .call(env.callMethod(option, "getShortcut", XmlDescriptor.class), "|")
                        .value();
        if (ZVal.strictNotEqualityCheck(false, "!==", pos)) {
            env.callMethod(
                    objectXML,
                    "setAttribute",
                    XmlDescriptor.class,
                    "shortcut",
                    "-"
                            + toStringR(
                                    function_substr
                                            .f
                                            .env(env)
                                            .call(
                                                    env.callMethod(
                                                            option,
                                                            "getShortcut",
                                                            XmlDescriptor.class),
                                                    0,
                                                    pos)
                                            .value(),
                                    env));
            env.callMethod(
                    objectXML,
                    "setAttribute",
                    XmlDescriptor.class,
                    "shortcuts",
                    "-"
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
                                                            XmlDescriptor.class))
                                            .value(),
                                    env));

        } else {
            env.callMethod(
                    objectXML,
                    "setAttribute",
                    XmlDescriptor.class,
                    "shortcut",
                    ZVal.isTrue(env.callMethod(option, "getShortcut", XmlDescriptor.class))
                            ? "-"
                                    + toStringR(
                                            env.callMethod(
                                                    option, "getShortcut", XmlDescriptor.class),
                                            env)
                            : "");
        }

        env.callMethod(
                objectXML,
                "setAttribute",
                XmlDescriptor.class,
                "accept_value",
                ZVal.isTrue(env.callMethod(option, "acceptValue", XmlDescriptor.class)) ? 1 : 0);
        env.callMethod(
                objectXML,
                "setAttribute",
                XmlDescriptor.class,
                "is_value_required",
                ZVal.isTrue(env.callMethod(option, "isValueRequired", XmlDescriptor.class))
                        ? 1
                        : 0);
        env.callMethod(
                objectXML,
                "setAttribute",
                XmlDescriptor.class,
                "is_multiple",
                ZVal.isTrue(env.callMethod(option, "isArray", XmlDescriptor.class)) ? 1 : 0);
        env.callMethod(
                objectXML,
                "appendChild",
                XmlDescriptor.class,
                descriptionXML =
                        env.callMethod(dom, "createElement", XmlDescriptor.class, "description"));
        env.callMethod(
                descriptionXML,
                "appendChild",
                XmlDescriptor.class,
                env.callMethod(
                        dom,
                        "createTextNode",
                        XmlDescriptor.class,
                        env.callMethod(option, "getDescription", XmlDescriptor.class)));
        if (ZVal.isTrue(env.callMethod(option, "acceptValue", XmlDescriptor.class))) {
            defaults =
                    ZVal.assign(
                            function_is_array
                                            .f
                                            .env(env)
                                            .call(
                                                    env.callMethod(
                                                            option,
                                                            "getDefault",
                                                            XmlDescriptor.class))
                                            .getBool()
                                    ? env.callMethod(option, "getDefault", XmlDescriptor.class)
                                    : function_is_bool
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            env.callMethod(
                                                                    option,
                                                                    "getDefault",
                                                                    XmlDescriptor.class))
                                                    .getBool()
                                            ? ZVal.newArray(
                                                    new ZPair(
                                                            0,
                                                            NamespaceGlobal.var_export
                                                                    .env(env)
                                                                    .call(
                                                                            env.callMethod(
                                                                                    option,
                                                                                    "getDefault",
                                                                                    XmlDescriptor
                                                                                            .class),
                                                                            true)
                                                                    .value()))
                                            : ZVal.isTrue(
                                                            env.callMethod(
                                                                    option,
                                                                    "getDefault",
                                                                    XmlDescriptor.class))
                                                    ? ZVal.newArray(
                                                            new ZPair(
                                                                    0,
                                                                    env.callMethod(
                                                                            option,
                                                                            "getDefault",
                                                                            XmlDescriptor.class)))
                                                    : ZVal.newArray());
            env.callMethod(
                    objectXML,
                    "appendChild",
                    XmlDescriptor.class,
                    defaultsXML =
                            env.callMethod(dom, "createElement", XmlDescriptor.class, "defaults"));
            if (!ZVal.isEmpty(defaults)) {
                for (ZPair zpairResult1680 : ZVal.getIterable(defaults, env, true)) {
                    _pDefault = ZVal.assign(zpairResult1680.getValue());
                    env.callMethod(
                            defaultsXML,
                            "appendChild",
                            XmlDescriptor.class,
                            defaultXML =
                                    env.callMethod(
                                            dom, "createElement", XmlDescriptor.class, "default"));
                    env.callMethod(
                            defaultXML,
                            "appendChild",
                            XmlDescriptor.class,
                            env.callMethod(dom, "createTextNode", XmlDescriptor.class, _pDefault));
                }
            }
        }

        return ZVal.assign(dom);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Console\\Descriptor\\XmlDescriptor";

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
                    .setName("Symfony\\Component\\Console\\Descriptor\\XmlDescriptor")
                    .setLookup(
                            XmlDescriptor.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("output")
                    .setFilename("vendor/symfony/console/Descriptor/XmlDescriptor.php")
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
