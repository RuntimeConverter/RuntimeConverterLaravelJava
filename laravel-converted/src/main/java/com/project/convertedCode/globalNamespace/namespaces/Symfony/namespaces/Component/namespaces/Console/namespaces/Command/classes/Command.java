package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Command.classes;

import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputDefinition;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.ExceptionInterface;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.OutputInterface;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionProperty;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionFunction;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeInterfaces.Traversable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputArgument;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Command/Command.php

*/

public class Command extends RuntimeClassBase {

    public Object application = null;

    public Object name = null;

    public Object processTitle = null;

    public Object aliases = ZVal.newArray();

    public Object definition = null;

    public Object hidden = false;

    public Object help = null;

    public Object description = null;

    public Object ignoreValidationErrors = false;

    public Object applicationDefinitionMerged = false;

    public Object applicationDefinitionMergedWithArgs = false;

    public Object code = null;

    public Object synopsis = ZVal.newArray();

    public Object usages = ZVal.newArray();

    public Object helperSet = null;

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
        name = "name",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        this.definition = new InputDefinition(env);
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", name))
                || ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                ZVal.getNull(),
                                "!==",
                                name =
                                        StaticMethodUtils.accessUnknownLateStaticMethod(
                                                        env, this, Command.class)
                                                .method("getDefaultName")
                                                .call()
                                                .value()))) {
            this.setName(env, name);
        }

        this.configure(env);
        return null;
    }

    @ConvertedMethod
    public Object ignoreValidationErrors(RuntimeEnv env, Object... args) {
        this.ignoreValidationErrors = true;
        return null;
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
        this.application = application;
        if (ZVal.isTrue(application)) {
            this.setHelperSet(env, env.callMethod(application, "getHelperSet", Command.class));

        } else {
            this.helperSet = ZVal.getNull();
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "helperSet",
        typeHint = "Symfony\\Component\\Console\\Helper\\HelperSet"
    )
    public Object setHelperSet(RuntimeEnv env, Object... args) {
        Object helperSet = assignParameter(args, 0, false);
        this.helperSet = helperSet;
        return null;
    }

    @ConvertedMethod
    public Object getHelperSet(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.helperSet);
    }

    @ConvertedMethod
    public Object getApplication(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.application);
    }

    @ConvertedMethod
    public Object isEnabled(RuntimeEnv env, Object... args) {
        return ZVal.assign(true);
    }

    @ConvertedMethod
    protected Object configure(RuntimeEnv env, Object... args) {
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
        throw ZVal.getException(
                env,
                new LogicException(
                        env,
                        "You must override the execute() method in the concrete command class."));
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
    protected Object interact(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object output = assignParameter(args, 1, false);
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
    protected Object initialize(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object output = assignParameter(args, 1, false);
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
    public Object run(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object output = assignParameter(args, 1, false);
        Object e = null;
        Object statusCode = null;
        this.getSynopsis(env, true);
        this.getSynopsis(env, false);
        this.mergeApplicationDefinition(env);
        try {
            env.callMethod(input, "bind", Command.class, this.definition);
        } catch (ConvertedException convertedException242) {
            if (convertedException242.instanceOf(
                    ExceptionInterface.class,
                    "Symfony\\Component\\Console\\Exception\\ExceptionInterface")) {
                e = convertedException242.getObject();
                if (!ZVal.isTrue(this.ignoreValidationErrors)) {
                    throw ZVal.getException(env, e);
                }

            } else {
                throw convertedException242;
            }
        }

        this.initialize(env, input, output);
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.processTitle)) {
            if (function_function_exists.f.env(env).call("cli_set_process_title").getBool()) {
                if (!ZVal.isTrue(
                        NamespaceGlobal.cli_set_process_title
                                .env(env)
                                .call(this.processTitle)
                                .value())) {
                    if (ZVal.strictEqualityCheck("Darwin", "===", "Linux")) {
                        env.callMethod(
                                output,
                                "writeln",
                                Command.class,
                                "<comment>Running \"cli_get_process_title\" as an unprivileged user is not supported on MacOS.</comment>");

                    } else {
                        NamespaceGlobal.cli_set_process_title.env(env).call(this.processTitle);
                    }
                }

            } else if (function_function_exists.f.env(env).call("setproctitle").getBool()) {
                com.runtimeconverter.runtime.ZVal.functionNotFound("setproctitle")
                        .env(env)
                        .call(this.processTitle);

            } else if (ZVal.strictEqualityCheck(
                    OutputInterface.CONST_VERBOSITY_VERY_VERBOSE,
                    "===",
                    env.callMethod(output, "getVerbosity", Command.class))) {
                env.callMethod(
                        output,
                        "writeln",
                        Command.class,
                        "<comment>Install the proctitle PECL to be able to change the process title.</comment>");
            }
        }

        if (ZVal.isTrue(env.callMethod(input, "isInteractive", Command.class))) {
            this.interact(env, input, output);
        }

        if (ZVal.toBool(env.callMethod(input, "hasArgument", Command.class, "command"))
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                ZVal.getNull(),
                                "===",
                                env.callMethod(input, "getArgument", Command.class, "command")))) {
            env.callMethod(input, "setArgument", Command.class, "command", this.getName(env));
        }

        env.callMethod(input, "validate", Command.class);
        if (ZVal.isTrue(this.code)) {
            statusCode =
                    function_call_user_func
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(this.code, input, output)
                            .value();

        } else {
            statusCode = this.execute(env, input, output);
        }

        return ZVal.assign(
                function_is_numeric.f.env(env).call(statusCode).getBool()
                        ? ZVal.toLong(statusCode)
                        : 0);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code", typeHint = "callable")
    public Object setCode(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        Object r = null;
        if (ZVal.isTrue(ZVal.checkInstanceType(code, Closure.class, "Closure"))) {
            r = new ReflectionFunction(env, code);
            if (ZVal.strictEqualityCheck(
                    ZVal.getNull(), "===", env.callMethod(r, "getClosureThis", Command.class))) {
                code = Closure.runtimeStaticObject.bind(env, code, this);
            }
        }

        this.code = code;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "mergeArgs",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object mergeApplicationDefinition(RuntimeEnv env, Object... args) {
        Object mergeArgs = assignParameter(args, 0, true);
        if (null == mergeArgs) {
            mergeArgs = true;
        }
        Object currentArguments = null;
        if (ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.application))
                || ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                true, "===", this.applicationDefinitionMerged))
                                && ZVal.toBool(
                                        ZVal.toBool(this.applicationDefinitionMergedWithArgs)
                                                || ZVal.toBool(!ZVal.isTrue(mergeArgs))))) {
            return null;
        }

        env.callMethod(
                this.definition,
                "addOptions",
                Command.class,
                env.callMethod(
                        env.callMethod(this.application, "getDefinition", Command.class),
                        "getOptions",
                        Command.class));
        if (ZVal.isTrue(mergeArgs)) {
            currentArguments = env.callMethod(this.definition, "getArguments", Command.class);
            env.callMethod(
                    this.definition,
                    "setArguments",
                    Command.class,
                    env.callMethod(
                            env.callMethod(this.application, "getDefinition", Command.class),
                            "getArguments",
                            Command.class));
            env.callMethod(this.definition, "addArguments", Command.class, currentArguments);
        }

        this.applicationDefinitionMerged = true;
        if (ZVal.isTrue(mergeArgs)) {
            this.applicationDefinitionMergedWithArgs = true;
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "definition")
    public Object setDefinition(RuntimeEnv env, Object... args) {
        Object definition = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        definition,
                        InputDefinition.class,
                        "Symfony\\Component\\Console\\Input\\InputDefinition"))) {
            this.definition = definition;

        } else {
            env.callMethod(this.definition, "setDefinition", Command.class, definition);
        }

        this.applicationDefinitionMerged = false;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getDefinition(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.definition);
    }

    @ConvertedMethod
    public Object getNativeDefinition(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getDefinition(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "mode",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 2, name = "description")
    @ConvertedParameter(
        index = 3,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object addArgument(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object mode = assignParameter(args, 1, true);
        if (null == mode) {
            mode = ZVal.getNull();
        }
        Object description = assignParameter(args, 2, true);
        if (null == description) {
            description = "";
        }
        Object _pDefault = assignParameter(args, 3, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        env.callMethod(
                this.definition,
                "addArgument",
                Command.class,
                new InputArgument(env, name, mode, description, _pDefault));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "shortcut",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "mode",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 3, name = "description")
    @ConvertedParameter(
        index = 4,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object addOption(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object shortcut = assignParameter(args, 1, true);
        if (null == shortcut) {
            shortcut = ZVal.getNull();
        }
        Object mode = assignParameter(args, 2, true);
        if (null == mode) {
            mode = ZVal.getNull();
        }
        Object description = assignParameter(args, 3, true);
        if (null == description) {
            description = "";
        }
        Object _pDefault = assignParameter(args, 4, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        env.callMethod(
                this.definition,
                "addOption",
                Command.class,
                new InputOption(env, name, shortcut, mode, description, _pDefault));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object setName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        this.validateName(env, name);
        this.name = name;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "title")
    public Object setProcessTitle(RuntimeEnv env, Object... args) {
        Object title = assignParameter(args, 0, false);
        this.processTitle = title;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.name);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "hidden")
    public Object setHidden(RuntimeEnv env, Object... args) {
        Object hidden = assignParameter(args, 0, false);
        this.hidden = ZVal.toBool(hidden);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object isHidden(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.hidden);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "description")
    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = assignParameter(args, 0, false);
        this.description = description;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.description);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "help")
    public Object setHelp(RuntimeEnv env, Object... args) {
        Object help = assignParameter(args, 0, false);
        this.help = help;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getHelp(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.help);
    }

    @ConvertedMethod
    public Object getProcessedHelp(RuntimeEnv env, Object... args) {
        ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
        Object name = null;
        Object placeholders = null;
        Object ternaryExpressionTemp = null;
        Object replacements = null;
        name = ZVal.assign(this.name);
        placeholders = ZVal.arrayFromList("%command.name%", "%command.full_name%");
        replacements =
                ZVal.newArray(
                        new ZPair(0, name),
                        new ZPair(
                                1,
                                toStringR(_SERVER.arrayGet(env, "PHP_SELF"), env)
                                        + " "
                                        + toStringR(name, env)));
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                placeholders,
                                replacements,
                                ZVal.isTrue(ternaryExpressionTemp = this.getHelp(env))
                                        ? ternaryExpressionTemp
                                        : this.getDescription(env))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "aliases")
    public Object setAliases(RuntimeEnv env, Object... args) {
        Object aliases = assignParameter(args, 0, false);
        Object alias = null;
        if (ZVal.toBool(!function_is_array.f.env(env).call(aliases).getBool())
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        aliases, Traversable.class, "Traversable")))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "$aliases must be an array or an instance of \\Traversable"));
        }

        for (ZPair zpairResult1645 : ZVal.getIterable(aliases, env, true)) {
            alias = ZVal.assign(zpairResult1645.getValue());
            this.validateName(env, alias);
        }

        this.aliases = aliases;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getAliases(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.aliases);
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
        Object key = null;
        key = ZVal.assign(ZVal.isTrue(_pShort) ? "short" : "long");
        if (!arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "synopsis", env), env, key)) {
            new ReferenceClassProperty(this, "synopsis", env)
                    .arrayAccess(env, key)
                    .set(
                            function_trim
                                    .f
                                    .env(env)
                                    .call(
                                            function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            "%s %s",
                                                            this.name,
                                                            env.callMethod(
                                                                    this.definition,
                                                                    "getSynopsis",
                                                                    Command.class,
                                                                    _pShort))
                                                    .value())
                                    .value());
        }

        return ZVal.assign(new ReferenceClassProperty(this, "synopsis", env).arrayGet(env, key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "usage")
    public Object addUsage(RuntimeEnv env, Object... args) {
        Object usage = assignParameter(args, 0, false);
        if (ZVal.strictNotEqualityCheck(
                0, "!==", function_strpos.f.env(env).call(usage, this.name).value())) {
            usage = function_sprintf.f.env(env).call("%s %s", this.name, usage).value();
        }

        new ReferenceClassProperty(this, "usages", env).arrayAppend(env).set(usage);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getUsages(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.usages);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object getHelper(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.helperSet)) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Cannot retrieve helper \"%s\" because there is no HelperSet defined. Did you forget to add your command to the application or to set the application on the command using the setApplication() method? You can also set the HelperSet directly using the setHelperSet() method.",
                                            name)
                                    .value()));
        }

        return ZVal.assign(env.callMethod(this.helperSet, "get", Command.class, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    private Object validateName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        if (!function_preg_match.f.env(env).call("/^[^\\:]++(\\:[^\\:]++)*$/", name).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Command name \"%s\" is invalid.", name)
                                    .value()));
        }

        return null;
    }

    public static final Object CONST_class = "Symfony\\Component\\Console\\Command\\Command";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object getDefaultName(RuntimeEnv env, Object... args) {
            Object r = null;
            Object _pClass = null;
            _pClass = NamespaceGlobal.get_called_class.env(env).call().value();
            r = new ReflectionProperty(env, _pClass, "defaultName");
            return ZVal.assign(
                    ZVal.strictEqualityCheck(
                                    _pClass,
                                    "===",
                                    toObjectR(r).accessProp(this, env).name("class").value())
                            ? env.getRequestStaticProperties(
                                            com.project
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
                                                    .RequestStaticProperties
                                                    .class)
                                    .defaultName
                            : ZVal.getNull());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object defaultName = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Command\\Command")
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
                    .setStaticPropertyNames("defaultName")
                    .setFilename("vendor/symfony/console/Command/Command.php")
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
