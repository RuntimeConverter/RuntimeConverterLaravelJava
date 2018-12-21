package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.namespaces.ListCommand.classes.PropertyEnumerator;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.namespaces.ListCommand.classes.ConstantEnumerator;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Formatter.classes.OutputFormatter;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes.ReflectingCommand;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Input.classes.CodeArgument;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.namespaces.ListCommand.classes.FunctionEnumerator;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.namespaces.ListCommand.classes.MethodEnumerator;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Input.classes.FilterOptions;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.namespaces.ListCommand.classes.ClassEnumerator;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.namespaces.ListCommand.classes.VariableEnumerator;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.namespaces.ListCommand.classes.ClassConstantEnumerator;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.namespaces.ListCommand.classes.GlobalVariableEnumerator;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import java.lang.Class;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.VarDumper.classes.PresenterAware;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Command/ListCommand.php

*/

public class ListCommand extends ReflectingCommand implements PresenterAware {

    public Object presenter = null;

    public Object enumerators = null;

    public ListCommand(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ListCommand.class) {
            this.__construct(env, args);
        }
    }

    public ListCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "presenter", typeHint = "Psy\\VarDumper\\Presenter")
    public Object setPresenter(RuntimeEnv env, Object... args) {
        Object presenter = assignParameter(args, 0, false);
        this.presenter = presenter;
        return null;
    }

    @ConvertedMethod
    protected Object configure(RuntimeEnv env, Object... args) {
        Object runtimeTempArrayResult147 = null;
        Object invert = null;
        Object grep = null;
        Object insensitive = null;
        ZVal.list(
                runtimeTempArrayResult147 = FilterOptions.runtimeStaticObject.getOptions(env),
                (grep = listGet(runtimeTempArrayResult147, 0, env)),
                (insensitive = listGet(runtimeTempArrayResult147, 1, env)),
                (invert = listGet(runtimeTempArrayResult147, 2, env)));
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(this, "setName", ListCommand.class, "ls"),
                                        "setAliases",
                                        ListCommand.class,
                                        ZVal.arrayFromList("list", "dir")),
                                "setDefinition",
                                ListCommand.class,
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                new CodeArgument(
                                                        env,
                                                        "target",
                                                        CodeArgument.CONST_OPTIONAL,
                                                        "A target class or object to list.")),
                                        new ZPair(
                                                1,
                                                new InputOption(
                                                        env,
                                                        "vars",
                                                        "",
                                                        InputOption.CONST_VALUE_NONE,
                                                        "Display variables.")),
                                        new ZPair(
                                                2,
                                                new InputOption(
                                                        env,
                                                        "constants",
                                                        "c",
                                                        InputOption.CONST_VALUE_NONE,
                                                        "Display defined constants.")),
                                        new ZPair(
                                                3,
                                                new InputOption(
                                                        env,
                                                        "functions",
                                                        "f",
                                                        InputOption.CONST_VALUE_NONE,
                                                        "Display defined functions.")),
                                        new ZPair(
                                                4,
                                                new InputOption(
                                                        env,
                                                        "classes",
                                                        "k",
                                                        InputOption.CONST_VALUE_NONE,
                                                        "Display declared classes.")),
                                        new ZPair(
                                                5,
                                                new InputOption(
                                                        env,
                                                        "interfaces",
                                                        "I",
                                                        InputOption.CONST_VALUE_NONE,
                                                        "Display declared interfaces.")),
                                        new ZPair(
                                                6,
                                                new InputOption(
                                                        env,
                                                        "traits",
                                                        "t",
                                                        InputOption.CONST_VALUE_NONE,
                                                        "Display declared traits.")),
                                        new ZPair(
                                                7,
                                                new InputOption(
                                                        env,
                                                        "no-inherit",
                                                        "",
                                                        InputOption.CONST_VALUE_NONE,
                                                        "Exclude inherited methods, properties and constants.")),
                                        new ZPair(
                                                8,
                                                new InputOption(
                                                        env,
                                                        "properties",
                                                        "p",
                                                        InputOption.CONST_VALUE_NONE,
                                                        "Display class or object properties (public properties by default).")),
                                        new ZPair(
                                                9,
                                                new InputOption(
                                                        env,
                                                        "methods",
                                                        "m",
                                                        InputOption.CONST_VALUE_NONE,
                                                        "Display class or object methods (public methods by default).")),
                                        new ZPair(10, grep),
                                        new ZPair(11, insensitive),
                                        new ZPair(12, invert),
                                        new ZPair(
                                                13,
                                                new InputOption(
                                                        env,
                                                        "globals",
                                                        "g",
                                                        InputOption.CONST_VALUE_NONE,
                                                        "Include global variables.")),
                                        new ZPair(
                                                14,
                                                new InputOption(
                                                        env,
                                                        "internal",
                                                        "n",
                                                        InputOption.CONST_VALUE_NONE,
                                                        "Limit to internal functions and classes.")),
                                        new ZPair(
                                                15,
                                                new InputOption(
                                                        env,
                                                        "user",
                                                        "u",
                                                        InputOption.CONST_VALUE_NONE,
                                                        "Limit to user-defined constants, functions and classes.")),
                                        new ZPair(
                                                16,
                                                new InputOption(
                                                        env,
                                                        "category",
                                                        "C",
                                                        InputOption.CONST_VALUE_REQUIRED,
                                                        "Limit to constants in a specific category (e.g. \"date\").")),
                                        new ZPair(
                                                17,
                                                new InputOption(
                                                        env,
                                                        "all",
                                                        "a",
                                                        InputOption.CONST_VALUE_NONE,
                                                        "Include private and protected methods and properties.")),
                                        new ZPair(
                                                18,
                                                new InputOption(
                                                        env,
                                                        "long",
                                                        "l",
                                                        InputOption.CONST_VALUE_NONE,
                                                        "List in long format: includes class names and method signatures.")))),
                        "setDescription",
                        ListCommand.class,
                        "List local, instance or class variables, methods and constants."),
                "setHelp",
                ListCommand.class,
                "List variables, constants, classes, interfaces, traits, functions, methods,\nand properties.\n\nCalled without options, this will return a list of variables currently in scope.\n\nIf a target object is provided, list properties, constants and methods of that\ntarget. If a class, interface or trait name is passed instead, list constants\nand methods on that class.\n\ne.g.\n<return>>>> ls</return>\n<return>>>> ls $foo</return>\n<return>>>> ls -k --grep mongo -i</return>\n<return>>>> ls -al ReflectionClass</return>\n<return>>>> ls --constants --category date</return>\n<return>>>> ls -l --functions --grep /^array_.*/</return>\n<return>>>> ls -l --properties new DateTime()</return>");
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
        PassByReferenceArgs rLastRefArgs;
        Object input = assignParameter(args, 0, false);
        ReferenceContainer output = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object runtimeTempArrayResult148 = null;
        Object method = null;
        Object reflector = null;
        Object enumerator = null;
        Object target = null;
        this.validateInput(env, input);
        this.initEnumerators(env);
        method =
                ZVal.assign(
                        ZVal.isTrue(env.callMethod(input, "getOption", ListCommand.class, "long"))
                                ? "writeLong"
                                : "write");
        if (ZVal.isTrue(
                target = env.callMethod(input, "getArgument", ListCommand.class, "target"))) {
            ZVal.list(
                    runtimeTempArrayResult148 =
                            env.callMethod(
                                    this, "getTargetAndReflector", ListCommand.class, target),
                    (target = listGet(runtimeTempArrayResult148, 0, env)),
                    (reflector = listGet(runtimeTempArrayResult148, 1, env)));

        } else {
            reflector = ZVal.getNull();
        }

        if (ZVal.isTrue(env.callMethod(input, "getOption", ListCommand.class, "long"))) {
            env.callMethod(output.getObject(), "startPaging", ListCommand.class);
        }

        for (ZPair zpairResult1361 : ZVal.getIterable(this.enumerators, env, true)) {
            enumerator = ZVal.assign(zpairResult1361.getValue());
            env.callMethod(
                    this,
                    rLastRefArgs =
                            new RuntimeArgsWithReferences()
                                    .add(0, output)
                                    .add(
                                            1,
                                            handleReturnReference(
                                                    env.callMethod(
                                                            enumerator,
                                                            "enumerate",
                                                            ListCommand.class,
                                                            input,
                                                            reflector,
                                                            target))),
                    toStringR(method, env),
                    ListCommand.class,
                    output.getObject(),
                    rLastRefArgs.get(1));
        }

        if (ZVal.isTrue(env.callMethod(input, "getOption", ListCommand.class, "long"))) {
            env.callMethod(output.getObject(), "stopPaging", ListCommand.class);
        }

        if (ZVal.strictNotEqualityCheck(reflector, "!==", ZVal.getNull())) {
            env.callMethod(this, "setCommandScopeVariables", ListCommand.class, reflector);
        }

        return null;
    }

    @ConvertedMethod
    protected Object initEnumerators(RuntimeEnv env, Object... args) {
        Object mgr = null;
        if (!ZVal.isset(this.enumerators)) {
            mgr = ZVal.assign(this.presenter);
            this.enumerators =
                    ZVal.newArray(
                            new ZPair(0, new ClassConstantEnumerator(env, mgr)),
                            new ZPair(1, new ClassEnumerator(env, mgr)),
                            new ZPair(2, new ConstantEnumerator(env, mgr)),
                            new ZPair(3, new FunctionEnumerator(env, mgr)),
                            new ZPair(4, new GlobalVariableEnumerator(env, mgr)),
                            new ZPair(5, new PropertyEnumerator(env, mgr)),
                            new ZPair(6, new MethodEnumerator(env, mgr)),
                            new ZPair(
                                    7,
                                    new VariableEnumerator(
                                            env,
                                            mgr,
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("context")
                                                    .value())));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "result",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object write(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        Object result = assignParameter(args, 1, true);
        if (null == result) {
            result = ZVal.getNull();
        }
        Object names = null;
        Object label = null;
        Object items = null;
        if (ZVal.strictEqualityCheck(result, "===", ZVal.getNull())) {
            return null;
        }

        for (ZPair zpairResult1362 : ZVal.getIterable(result, env, false)) {
            label = ZVal.assign(zpairResult1362.getKey());
            items = ZVal.assign(zpairResult1362.getValue());
            names =
                    function_array_map
                            .f
                            .env(env)
                            .call(
                                    ZVal.newArray(
                                            new ZPair(0, this), new ZPair(1, "formatItemName")),
                                    items)
                            .value();
            env.callMethod(
                    output,
                    "writeln",
                    ListCommand.class,
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "<strong>%s</strong>: %s",
                                    label,
                                    NamespaceGlobal.implode.env(env).call(", ", names).value())
                            .value());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "result",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object writeLong(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        Object result = assignParameter(args, 1, true);
        if (null == result) {
            result = ZVal.getNull();
        }
        ReferenceContainer item = new BasicReferenceContainer(null);
        Object label = null;
        Object items = null;
        Object table = null;
        if (ZVal.strictEqualityCheck(result, "===", ZVal.getNull())) {
            return null;
        }

        table = env.callMethod(this, "getTable", ListCommand.class, output);
        for (ZPair zpairResult1363 : ZVal.getIterable(result, env, false)) {
            label = ZVal.assign(zpairResult1363.getKey());
            items = ZVal.assign(zpairResult1363.getValue());
            env.callMethod(output, "writeln", ListCommand.class, "");
            env.callMethod(
                    output,
                    "writeln",
                    ListCommand.class,
                    function_sprintf.f.env(env).call("<strong>%s:</strong>", label).value());
            env.callMethod(table, "setRows", ListCommand.class, ZVal.newArray());
            for (ZPair zpairResult1364 : ZVal.getIterable(items, env, true)) {
                item.setObject(ZVal.assign(zpairResult1364.getValue()));
                env.callMethod(
                        table,
                        "addRow",
                        ListCommand.class,
                        ZVal.newArray(
                                new ZPair(0, this.formatItemName(env, item.getObject())),
                                new ZPair(1, item.arrayGet(env, "value"))));
            }

            if (ZVal.isTrue(ZVal.checkInstanceType(table, (Class) null, "TableHelper", env))) {
                env.callMethod(table, "render", ListCommand.class, output);

            } else {
                env.callMethod(table, "render", ListCommand.class);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    private Object formatItemName(RuntimeEnv env, Object... args) {
        ReferenceContainer item = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "<%s>%s</%s>",
                                item.arrayGet(env, "style"),
                                OutputFormatter.runtimeStaticObject.escape(
                                        env, item.arrayGet(env, "name")),
                                item.arrayGet(env, "style"))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "input",
        typeHint = "Symfony\\Component\\Console\\Input\\InputInterface"
    )
    private Object validateInput(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object option = null;
        if (!ZVal.isTrue(env.callMethod(input, "getArgument", ListCommand.class, "target"))) {
            for (ZPair zpairResult1365 :
                    ZVal.getIterable(
                            ZVal.arrayFromList("properties", "methods", "no-inherit"), env, true)) {
                option = ZVal.assign(zpairResult1365.getValue());
                if (ZVal.isTrue(env.callMethod(input, "getOption", ListCommand.class, option))) {
                    throw ZVal.getException(
                            env,
                            new RuntimeException(
                                    env,
                                    "--"
                                            + toStringR(option, env)
                                            + " does not make sense without a specified target"));
                }
            }

            for (ZPair zpairResult1366 :
                    ZVal.getIterable(
                            ZVal.arrayFromList(
                                    "globals",
                                    "vars",
                                    "constants",
                                    "functions",
                                    "classes",
                                    "interfaces",
                                    "traits"),
                            env,
                            true)) {
                option = ZVal.assign(zpairResult1366.getValue());
                if (ZVal.isTrue(env.callMethod(input, "getOption", ListCommand.class, option))) {
                    return null;
                }
            }

            env.callMethod(input, "setOption", ListCommand.class, "vars", true);

        } else {
            for (ZPair zpairResult1367 :
                    ZVal.getIterable(
                            ZVal.arrayFromList(
                                    "vars",
                                    "globals",
                                    "functions",
                                    "classes",
                                    "interfaces",
                                    "traits"),
                            env,
                            true)) {
                option = ZVal.assign(zpairResult1367.getValue());
                if (ZVal.isTrue(env.callMethod(input, "getOption", ListCommand.class, option))) {
                    throw ZVal.getException(
                            env,
                            new RuntimeException(
                                    env,
                                    "--"
                                            + toStringR(option, env)
                                            + " does not make sense with a specified target"));
                }
            }

            for (ZPair zpairResult1368 :
                    ZVal.getIterable(
                            ZVal.arrayFromList("constants", "properties", "methods"), env, true)) {
                option = ZVal.assign(zpairResult1368.getValue());
                if (ZVal.isTrue(env.callMethod(input, "getOption", ListCommand.class, option))) {
                    return null;
                }
            }

            env.callMethod(input, "setOption", ListCommand.class, "constants", true);
            env.callMethod(input, "setOption", ListCommand.class, "properties", true);
            env.callMethod(input, "setOption", ListCommand.class, "methods", true);
        }

        return null;
    }

    public static final Object CONST_class = "Psy\\Command\\ListCommand";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ReflectingCommand.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Command\\ListCommand")
                    .setLookup(
                            ListCommand.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "aliases",
                            "application",
                            "applicationDefinitionMerged",
                            "applicationDefinitionMergedWithArgs",
                            "code",
                            "context",
                            "definition",
                            "description",
                            "enumerators",
                            "help",
                            "helperSet",
                            "hidden",
                            "ignoreValidationErrors",
                            "name",
                            "presenter",
                            "processTitle",
                            "synopsis",
                            "usages")
                    .setFilename("vendor/psy/psysh/src/Command/ListCommand.php")
                    .addInterface("Psy\\VarDumper\\PresenterAware")
                    .addInterface("Psy\\ContextAware")
                    .addExtendsClass("Psy\\Command\\ReflectingCommand")
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
