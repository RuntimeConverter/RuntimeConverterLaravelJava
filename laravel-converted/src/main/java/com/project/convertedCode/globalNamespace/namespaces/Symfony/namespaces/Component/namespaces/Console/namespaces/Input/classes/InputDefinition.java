package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Input/InputDefinition.php

*/

public class InputDefinition extends RuntimeClassBase {

    public Object arguments = null;

    public Object requiredCount = null;

    public Object hasAnArrayArgument = false;

    public Object hasOptional = null;

    public Object options = null;

    public Object shortcuts = null;

    public InputDefinition(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == InputDefinition.class) {
            this.__construct(env, args);
        }
    }

    public InputDefinition(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "definition",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object definition = assignParameter(args, 0, true);
        if (null == definition) {
            definition = ZVal.newArray();
        }
        this.setDefinition(env, definition);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "definition", typeHint = "array")
    public Object setDefinition(RuntimeEnv env, Object... args) {
        Object definition = assignParameter(args, 0, false);
        Object item = null;
        ReferenceContainer options = new BasicReferenceContainer(null);
        ReferenceContainer arguments = new BasicReferenceContainer(null);
        arguments.setObject(ZVal.newArray());
        options.setObject(ZVal.newArray());
        for (ZPair zpairResult1729 : ZVal.getIterable(definition, env, true)) {
            item = ZVal.assign(zpairResult1729.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            item,
                            InputOption.class,
                            "Symfony\\Component\\Console\\Input\\InputOption"))) {
                options.arrayAppend(env).set(item);

            } else {
                arguments.arrayAppend(env).set(item);
            }
        }

        this.setArguments(env, arguments.getObject());
        this.setOptions(env, options.getObject());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "arguments",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object setArguments(RuntimeEnv env, Object... args) {
        Object arguments = assignParameter(args, 0, true);
        if (null == arguments) {
            arguments = ZVal.newArray();
        }
        this.arguments = ZVal.newArray();
        this.requiredCount = 0;
        this.hasOptional = false;
        this.hasAnArrayArgument = false;
        this.addArguments(env, arguments);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "arguments",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object addArguments(RuntimeEnv env, Object... args) {
        Object arguments = assignParameter(args, 0, true);
        if (null == arguments) {
            arguments = ZVal.newArray();
        }
        Object argument = null;
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", arguments)) {
            for (ZPair zpairResult1730 : ZVal.getIterable(arguments, env, true)) {
                argument = ZVal.assign(zpairResult1730.getValue());
                this.addArgument(env, argument);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "argument",
        typeHint = "Symfony\\Component\\Console\\Input\\InputArgument"
    )
    public Object addArgument(RuntimeEnv env, Object... args) {
        Object argument = assignParameter(args, 0, false);
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "arguments", env),
                env,
                env.callMethod(argument, "getName", InputDefinition.class))) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "An argument with name \"%s\" already exists.",
                                            env.callMethod(
                                                    argument, "getName", InputDefinition.class))
                                    .value()));
        }

        if (ZVal.isTrue(this.hasAnArrayArgument)) {
            throw ZVal.getException(
                    env,
                    new LogicException(env, "Cannot add an argument after an array argument."));
        }

        if (ZVal.toBool(env.callMethod(argument, "isRequired", InputDefinition.class))
                && ZVal.toBool(this.hasOptional)) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env, "Cannot add a required argument after an optional one."));
        }

        if (ZVal.isTrue(env.callMethod(argument, "isArray", InputDefinition.class))) {
            this.hasAnArrayArgument = true;
        }

        if (ZVal.isTrue(env.callMethod(argument, "isRequired", InputDefinition.class))) {
            this.requiredCount = ZVal.increment(this.requiredCount);

        } else {
            this.hasOptional = true;
        }

        new ReferenceClassProperty(this, "arguments", env)
                .arrayAccess(env, env.callMethod(argument, "getName", InputDefinition.class))
                .set(argument);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object getArgument(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        ReferenceContainer arguments = new BasicReferenceContainer(null);
        if (!ZVal.isTrue(this.hasArgument(env, name))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("The \"%s\" argument does not exist.", name)
                                    .value()));
        }

        arguments.setObject(
                ZVal.assign(
                        function_is_int.f.env(env).call(name).getBool()
                                ? function_array_values.f.env(env).call(this.arguments).value()
                                : this.arguments));
        return ZVal.assign(arguments.arrayGet(env, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object hasArgument(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        ReferenceContainer arguments = new BasicReferenceContainer(null);
        arguments.setObject(
                ZVal.assign(
                        function_is_int.f.env(env).call(name).getBool()
                                ? function_array_values.f.env(env).call(this.arguments).value()
                                : this.arguments));
        return ZVal.assign(arrayActionR(ArrayAction.ISSET, arguments, env, name));
    }

    @ConvertedMethod
    public Object getArguments(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.arguments);
    }

    @ConvertedMethod
    public Object getArgumentCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isTrue(this.hasAnArrayArgument)
                        ? 9223372036854775807L
                        : function_count.f.env(env).call(this.arguments).value());
    }

    @ConvertedMethod
    public Object getArgumentRequiredCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.requiredCount);
    }

    @ConvertedMethod
    public Object getArgumentDefaults(RuntimeEnv env, Object... args) {
        Object argument = null;
        ReferenceContainer values = new BasicReferenceContainer(null);
        values.setObject(ZVal.newArray());
        for (ZPair zpairResult1731 : ZVal.getIterable(this.arguments, env, true)) {
            argument = ZVal.assign(zpairResult1731.getValue());
            values.arrayAccess(env, env.callMethod(argument, "getName", InputDefinition.class))
                    .set(env.callMethod(argument, "getDefault", InputDefinition.class));
        }

        return ZVal.assign(values.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options", defaultValue = "", defaultValueType = "array")
    public Object setOptions(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        this.options = ZVal.newArray();
        this.shortcuts = ZVal.newArray();
        this.addOptions(env, options);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options", defaultValue = "", defaultValueType = "array")
    public Object addOptions(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object option = null;
        for (ZPair zpairResult1732 : ZVal.getIterable(options, env, true)) {
            option = ZVal.assign(zpairResult1732.getValue());
            this.addOption(env, option);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "option",
        typeHint = "Symfony\\Component\\Console\\Input\\InputOption"
    )
    public Object addOption(RuntimeEnv env, Object... args) {
        Object option = assignParameter(args, 0, false);
        Object shortcut = null;
        if (ZVal.toBool(
                        arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "options", env),
                                env,
                                env.callMethod(option, "getName", InputDefinition.class)))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        option,
                                        "equals",
                                        InputDefinition.class,
                                        new ReferenceClassProperty(this, "options", env)
                                                .arrayGet(
                                                        env,
                                                        env.callMethod(
                                                                option,
                                                                "getName",
                                                                InputDefinition.class)))))) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "An option named \"%s\" already exists.",
                                            env.callMethod(
                                                    option, "getName", InputDefinition.class))
                                    .value()));
        }

        if (ZVal.isTrue(env.callMethod(option, "getShortcut", InputDefinition.class))) {
            for (ZPair zpairResult1733 :
                    ZVal.getIterable(
                            function_explode
                                    .f
                                    .env(env)
                                    .call(
                                            "|",
                                            env.callMethod(
                                                    option, "getShortcut", InputDefinition.class))
                                    .value(),
                            env,
                            true)) {
                shortcut = ZVal.assign(zpairResult1733.getValue());
                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        new ReferenceClassProperty(this, "shortcuts", env),
                                        env,
                                        shortcut))
                        && ZVal.toBool(
                                !ZVal.isTrue(
                                        env.callMethod(
                                                option,
                                                "equals",
                                                InputDefinition.class,
                                                new ReferenceClassProperty(this, "options", env)
                                                        .arrayGet(
                                                                env,
                                                                new ReferenceClassProperty(
                                                                                this,
                                                                                "shortcuts",
                                                                                env)
                                                                        .arrayGet(
                                                                                env,
                                                                                shortcut)))))) {
                    throw ZVal.getException(
                            env,
                            new LogicException(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "An option with shortcut \"%s\" already exists.",
                                                    shortcut)
                                            .value()));
                }
            }
        }

        new ReferenceClassProperty(this, "options", env)
                .arrayAccess(env, env.callMethod(option, "getName", InputDefinition.class))
                .set(option);
        if (ZVal.isTrue(env.callMethod(option, "getShortcut", InputDefinition.class))) {
            for (ZPair zpairResult1734 :
                    ZVal.getIterable(
                            function_explode
                                    .f
                                    .env(env)
                                    .call(
                                            "|",
                                            env.callMethod(
                                                    option, "getShortcut", InputDefinition.class))
                                    .value(),
                            env,
                            true)) {
                shortcut = ZVal.assign(zpairResult1734.getValue());
                new ReferenceClassProperty(this, "shortcuts", env)
                        .arrayAccess(env, shortcut)
                        .set(env.callMethod(option, "getName", InputDefinition.class));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object getOption(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        if (!ZVal.isTrue(this.hasOption(env, name))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("The \"--%s\" option does not exist.", name)
                                    .value()));
        }

        return ZVal.assign(new ReferenceClassProperty(this, "options", env).arrayGet(env, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object hasOption(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "options", env),
                        env,
                        name));
    }

    @ConvertedMethod
    public Object getOptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.options);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object hasShortcut(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "shortcuts", env),
                        env,
                        name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "shortcut")
    public Object getOptionForShortcut(RuntimeEnv env, Object... args) {
        Object shortcut = assignParameter(args, 0, false);
        return ZVal.assign(this.getOption(env, this.shortcutToName(env, shortcut)));
    }

    @ConvertedMethod
    public Object getOptionDefaults(RuntimeEnv env, Object... args) {
        ReferenceContainer values = new BasicReferenceContainer(null);
        Object option = null;
        values.setObject(ZVal.newArray());
        for (ZPair zpairResult1735 : ZVal.getIterable(this.options, env, true)) {
            option = ZVal.assign(zpairResult1735.getValue());
            values.arrayAccess(env, env.callMethod(option, "getName", InputDefinition.class))
                    .set(env.callMethod(option, "getDefault", InputDefinition.class));
        }

        return ZVal.assign(values.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "shortcut")
    private Object shortcutToName(RuntimeEnv env, Object... args) {
        Object shortcut = assignParameter(args, 0, false);
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "shortcuts", env),
                env,
                shortcut)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("The \"-%s\" option does not exist.", shortcut)
                                    .value()));
        }

        return ZVal.assign(
                new ReferenceClassProperty(this, "shortcuts", env).arrayGet(env, shortcut));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "short",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object getSynopsis(RuntimeEnv env, Object... args) {
        Object _pShort = assignParameter(args, 0, true);
        if (null == _pShort) {
            _pShort = false;
        }
        Object argument = null;
        Object shortcut = null;
        Object tail = null;
        ReferenceContainer elements = new BasicReferenceContainer(null);
        Object value = null;
        Object option = null;
        Object element = null;
        elements.setObject(ZVal.newArray());
        if (ZVal.toBool(_pShort) && ZVal.toBool(this.getOptions(env))) {
            elements.arrayAppend(env).set("[options]");

        } else if (!ZVal.isTrue(_pShort)) {
            for (ZPair zpairResult1736 : ZVal.getIterable(this.getOptions(env), env, true)) {
                option = ZVal.assign(zpairResult1736.getValue());
                value = "";
                if (ZVal.isTrue(env.callMethod(option, "acceptValue", InputDefinition.class))) {
                    value =
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            " %s%s%s",
                                            ZVal.isTrue(
                                                            env.callMethod(
                                                                    option,
                                                                    "isValueOptional",
                                                                    InputDefinition.class))
                                                    ? "["
                                                    : "",
                                            NamespaceGlobal.strtoupper
                                                    .env(env)
                                                    .call(
                                                            env.callMethod(
                                                                    option,
                                                                    "getName",
                                                                    InputDefinition.class))
                                                    .value(),
                                            ZVal.isTrue(
                                                            env.callMethod(
                                                                    option,
                                                                    "isValueOptional",
                                                                    InputDefinition.class))
                                                    ? "]"
                                                    : "")
                                    .value();
                }

                shortcut =
                        ZVal.assign(
                                ZVal.isTrue(
                                                env.callMethod(
                                                        option,
                                                        "getShortcut",
                                                        InputDefinition.class))
                                        ? function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "-%s|",
                                                        env.callMethod(
                                                                option,
                                                                "getShortcut",
                                                                InputDefinition.class))
                                                .value()
                                        : "");
                elements.arrayAppend(env)
                        .set(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "[%s--%s%s]",
                                                shortcut,
                                                env.callMethod(
                                                        option, "getName", InputDefinition.class),
                                                value)
                                        .value());
            }
        }

        if (ZVal.toBool(function_count.f.env(env).call(elements.getObject()).value())
                && ZVal.toBool(this.getArguments(env))) {
            elements.arrayAppend(env).set("[--]");
        }

        tail = "";
        for (ZPair zpairResult1737 : ZVal.getIterable(this.getArguments(env), env, true)) {
            argument = ZVal.assign(zpairResult1737.getValue());
            element =
                    "<"
                            + toStringR(
                                    env.callMethod(argument, "getName", InputDefinition.class), env)
                            + ">";
            if (ZVal.isTrue(env.callMethod(argument, "isArray", InputDefinition.class))) {
                element = toStringR(element, env) + "...";
            }

            if (!ZVal.isTrue(env.callMethod(argument, "isRequired", InputDefinition.class))) {
                element = "[" + toStringR(element, env);
                tail = toStringR(tail, env) + "]";
            }

            elements.arrayAppend(env).set(element);
        }

        return ZVal.assign(
                toStringR(
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(" ", elements.getObject())
                                        .value(),
                                env)
                        + toStringR(tail, env));
    }

    public static final Object CONST_class = "Symfony\\Component\\Console\\Input\\InputDefinition";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Input\\InputDefinition")
                    .setLookup(
                            InputDefinition.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "arguments",
                            "hasAnArrayArgument",
                            "hasOptional",
                            "options",
                            "requiredCount",
                            "shortcuts")
                    .setFilename("vendor/symfony/console/Input/InputDefinition.php")
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
