package com.project.convertedCode.globalNamespace.namespaces.Psy.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.DeprecatedException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.classes.AutoCompleter;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_file;
import com.runtimeconverter.runtime.nativeClasses.pdo.PDOException;
import com.runtimeconverter.runtime.references.ReadOnlyReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Output.classes.ShellOutput;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.runtimeconverter.runtime.RuntimeStack;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.ConfigPaths;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.VersionUpdater.classes.GitHubChecker;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Readline.classes.HoaConsole;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Output.classes.OutputPager;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.file.function_getcwd;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Readline.classes.GNUReadline;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.RuntimeException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeClasses.pdo.PDO;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.VersionUpdater.classes.Checker;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.CodeCleaner;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Readline.classes.Libedit;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.VarDumper.classes.Presenter;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.VersionUpdater.classes.IntervalChecker;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.VersionUpdater.classes.NoopChecker;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Configuration.php

*/

public class Configuration extends RuntimeClassBase {

    public Object defaultIncludes = null;

    public Object configDir = null;

    public Object dataDir = null;

    public Object runtimeDir = null;

    public Object configFile = null;

    public Object historyFile = null;

    public Object historySize = null;

    public Object eraseDuplicates = null;

    public Object manualDbFile = null;

    public Object hasReadline = null;

    public Object useReadline = null;

    public Object useBracketedPaste = null;

    public Object hasPcntl = null;

    public Object usePcntl = null;

    public Object newCommands = ZVal.newArray();

    public Object requireSemicolons = false;

    public Object useUnicode = null;

    public Object useTabCompletion = null;

    public Object newMatchers = ZVal.newArray();

    public Object errorLoggingLevel = 32767;

    public Object warnOnMultipleConfigs = false;

    public Object colorMode = null;

    public Object updateCheck = null;

    public Object startupMessage = null;

    public Object forceArrayIndexes = false;

    public Object readline = null;

    public Object output = null;

    public Object shell = null;

    public Object cleaner = null;

    public Object pager = null;

    public Object manualDb = null;

    public Object presenter = null;

    public Object autoCompleter = null;

    public Object checker = null;

    public Object prompt = null;

    public Configuration(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Configuration.class) {
            this.__construct(env, args);
        }
    }

    public Configuration(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "config",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, true));
        if (null == config.getObject()) {
            config.setObject(ZVal.newArray());
        }
        Object msg = null;
        Object configFile = null;
        this.setColorMode(env, CONST_COLOR_MODE_AUTO);
        if (arrayActionR(ArrayAction.ISSET, config, env, "configFile")) {
            this.configFile = config.arrayGet(env, "configFile");

        } else if (ZVal.isTrue(
                configFile = NamespaceGlobal.getenv.env(env).call("PSYSH_CONFIG").value())) {
            this.configFile = configFile;
        }

        if (arrayActionR(ArrayAction.ISSET, config, env, "baseDir")) {
            msg =
                    "The 'baseDir' configuration option is deprecated; "
                            + "please specify 'configDir' and 'dataDir' options instead";
            throw ZVal.getException(env, new DeprecatedException(env, msg));
        }

        arrayActionR(ArrayAction.UNSET, config, env, "configFile");
        arrayActionR(ArrayAction.UNSET, config, env, "baseDir");
        this.loadConfig(env, config.getObject());
        this.init(env);
        return null;
    }

    @ConvertedMethod
    public Object init(RuntimeEnv env, Object... args) {
        Object configFile = null;
        Object localConfig = null;
        this.hasReadline = function_function_exists.f.env(env).call("readline").value();
        this.hasPcntl =
                ZVal.toBool(function_function_exists.f.env(env).call("pcntl_signal").value())
                        && ZVal.toBool(
                                function_function_exists.f.env(env).call("posix_getpid").value());
        if (ZVal.isTrue(configFile = this.getConfigFile(env))) {
            this.loadConfigFile(env, configFile);
        }

        if (ZVal.toBool(!ZVal.isTrue(this.configFile))
                && ZVal.toBool(localConfig = this.getLocalConfigFile(env))) {
            this.loadConfigFile(env, localConfig);
        }

        return null;
    }

    @ConvertedMethod
    public Object getConfigFile(RuntimeEnv env, Object... args) {
        Object msg = null;
        ReferenceContainer files = new BasicReferenceContainer(null);
        if (ZVal.isset(this.configFile)) {
            return ZVal.assign(this.configFile);
        }

        files.setObject(
                ConfigPaths.runtimeStaticObject.getConfigFiles(
                        env, ZVal.arrayFromList("config.php", "rc.php"), this.configDir));
        if (!ZVal.isEmpty(files.getObject())) {
            if (ZVal.toBool(this.warnOnMultipleConfigs)
                    && ZVal.toBool(
                            ZVal.isGreaterThan(
                                    function_count.f.env(env).call(files.getObject()).value(),
                                    '>',
                                    1))) {
                msg =
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "Multiple configuration files found: %s. Using %s",
                                        NamespaceGlobal.implode
                                                .env(env)
                                                .call(files.getObject(), ", ")
                                                .value(),
                                        files.arrayGet(env, 0))
                                .value();
                NamespaceGlobal.trigger_error.env(env).call(msg, 1024);
            }

            return ZVal.assign(files.arrayGet(env, 0));
        }

        return null;
    }

    @ConvertedMethod
    public Object getLocalConfigFile(RuntimeEnv env, Object... args) {
        Object localConfig = null;
        localConfig = toStringR(function_getcwd.f.env(env).call().value(), env) + "/.psysh.php";
        if (ZVal.isTrue(function_is_file.f.env(env).call(localConfig).value())) {
            return ZVal.assign(localConfig);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options", typeHint = "array")
    public Object loadConfig(RuntimeEnv env, Object... args) {
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object msg = null;
        Object method = null;
        Object option = null;
        for (ZPair zpairResult1389 :
                ZVal.getIterable(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Psy
                                                .classes
                                                .Configuration
                                                .RequestStaticProperties
                                                .class)
                                .AVAILABLE_OPTIONS,
                        env,
                        true)) {
            option = ZVal.assign(zpairResult1389.getValue());
            if (arrayActionR(ArrayAction.ISSET, options, env, option)) {
                method =
                        "set"
                                + toStringR(
                                        NamespaceGlobal.ucfirst.env(env).call(option).value(), env);
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences()
                                .add(0, new ArrayDimensionReference(options.getObject(), option)),
                        toStringR(method, env),
                        Configuration.class,
                        options.arrayGet(env, option));
            }
        }

        if (arrayActionR(ArrayAction.ISSET, options, env, "tabCompletion")) {
            msg = "`tabCompletion` is deprecated; use `useTabCompletion` instead.";
            NamespaceGlobal.trigger_error.env(env).call(msg, 16384).value();
            this.setUseTabCompletion(env, options.arrayGet(env, "tabCompletion"));
        }

        for (ZPair zpairResult1390 :
                ZVal.getIterable(
                        ZVal.arrayFromList("commands", "matchers", "casters"), env, true)) {
            option = ZVal.assign(zpairResult1390.getValue());
            if (arrayActionR(ArrayAction.ISSET, options, env, option)) {
                method =
                        "add"
                                + toStringR(
                                        NamespaceGlobal.ucfirst.env(env).call(option).value(), env);
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences()
                                .add(0, new ArrayDimensionReference(options.getObject(), option)),
                        toStringR(method, env),
                        Configuration.class,
                        options.arrayGet(env, option));
            }
        }

        if (arrayActionR(ArrayAction.ISSET, options, env, "tabCompletionMatchers")) {
            msg = "`tabCompletionMatchers` is deprecated; use `matchers` instead.";
            NamespaceGlobal.trigger_error.env(env).call(msg, 16384).value();
            this.addMatchers(env, options.arrayGet(env, "tabCompletionMatchers"));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    public Object loadConfigFile(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/psy/psysh/src")
                        .setFile("/vendor/psy/psysh/src/Configuration.php");
        Object file = assignParameter(args, 0, false);
        Object result = null;
        Object load = null;
        Object __psysh_config_file__ = null;
        __psysh_config_file__ = ZVal.assign(file);
        load =
                new Closure(env, runtimeConverterFunctionClassConstants, "Psy", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "config")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ContextConstants runtimeConverterFunctionClassConstants =
                                new ContextConstants()
                                        .setDir("/vendor/psy/psysh/src")
                                        .setFile("/vendor/psy/psysh/src/Configuration.php");
                        RuntimeStack stack = new RuntimeStack();
                        stack.setupGlobals(env);
                        Scope54 scope = new Scope54();
                        stack.pushScope(scope);
                        scope._thisVarAlias = this;
                        try {
                            Object _closureThisVar = this.getClosureThisVar();
                            scope.config = assignParameter(args, 0, false);
                            scope.result = null;
                            scope.__psysh_config_file__ = null;
                            scope.__psysh_config_file__ =
                                    this.contextReferences.getCapturedValue(
                                            "__psysh_config_file__");
                            scope.result =
                                    ZVal.assign(
                                            env.include(
                                                    toStringR(scope.__psysh_config_file__, env),
                                                    stack,
                                                    runtimeConverterFunctionClassConstants,
                                                    true,
                                                    false));
                            if (ZVal.strictNotEqualityCheck(scope.result, "!==", 1)) {
                                throw new IncludeEventException(ZVal.assign(scope.result));
                            }

                            throw new IncludeEventException(null);
                        } catch (IncludeEventException runtimeConverterIncludeException) {
                            return runtimeConverterIncludeException.returnValue;
                        }
                    }
                }.use("__psysh_config_file__", __psysh_config_file__);
        result =
                env.callFunctionDynamic(
                                load,
                                new RuntimeArgsWithReferences()
                                        .add(0, new ReadOnlyReferenceContainer(this)),
                                this)
                        .value();
        if (!ZVal.isEmpty(result)) {
            if (function_is_array.f.env(env).call(result).getBool()) {
                this.loadConfig(env, result);

            } else {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env, "Psy Shell configuration must return an array of options"));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "includes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object setDefaultIncludes(RuntimeEnv env, Object... args) {
        Object includes = assignParameter(args, 0, true);
        if (null == includes) {
            includes = ZVal.newArray();
        }
        this.defaultIncludes = includes;
        return null;
    }

    @ConvertedMethod
    public Object getDefaultIncludes(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isTrue(ternaryExpressionTemp = this.defaultIncludes)
                        ? ternaryExpressionTemp
                        : ZVal.newArray());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dir")
    public Object setConfigDir(RuntimeEnv env, Object... args) {
        Object dir = assignParameter(args, 0, false);
        this.configDir = toStringR(dir, env);
        return null;
    }

    @ConvertedMethod
    public Object getConfigDir(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.configDir);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dir")
    public Object setDataDir(RuntimeEnv env, Object... args) {
        Object dir = assignParameter(args, 0, false);
        this.dataDir = toStringR(dir, env);
        return null;
    }

    @ConvertedMethod
    public Object getDataDir(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.dataDir);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dir")
    public Object setRuntimeDir(RuntimeEnv env, Object... args) {
        Object dir = assignParameter(args, 0, false);
        this.runtimeDir = toStringR(dir, env);
        return null;
    }

    @ConvertedMethod
    public Object getRuntimeDir(RuntimeEnv env, Object... args) {
        if (!ZVal.isset(this.runtimeDir)) {
            this.runtimeDir = ConfigPaths.runtimeStaticObject.getRuntimeDir(env);
        }

        if (!function_is_dir.f.env(env).call(this.runtimeDir).getBool()) {
            NamespaceGlobal.mkdir.env(env).call(this.runtimeDir, 448, true);
        }

        return ZVal.assign(this.runtimeDir);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    public Object setHistoryFile(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        this.historyFile = ConfigPaths.runtimeStaticObject.touchFileWithMkdir(env, file);
        return null;
    }

    @ConvertedMethod
    public Object getHistoryFile(RuntimeEnv env, Object... args) {
        Object msg = null;
        ReferenceContainer files = new BasicReferenceContainer(null);
        Object ternaryExpressionTemp = null;
        Object dir = null;
        if (ZVal.isset(this.historyFile)) {
            return ZVal.assign(this.historyFile);
        }

        files.setObject(
                ConfigPaths.runtimeStaticObject.getConfigFiles(
                        env, ZVal.arrayFromList("psysh_history", "history"), this.configDir));
        if (!ZVal.isEmpty(files.getObject())) {
            if (ZVal.toBool(this.warnOnMultipleConfigs)
                    && ZVal.toBool(
                            ZVal.isGreaterThan(
                                    function_count.f.env(env).call(files.getObject()).value(),
                                    '>',
                                    1))) {
                msg =
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "Multiple history files found: %s. Using %s",
                                        NamespaceGlobal.implode
                                                .env(env)
                                                .call(files.getObject(), ", ")
                                                .value(),
                                        files.arrayGet(env, 0))
                                .value();
                NamespaceGlobal.trigger_error.env(env).call(msg, 1024);
            }

            this.setHistoryFile(env, files.arrayGet(env, 0));

        } else {
            dir =
                    ZVal.assign(
                            ZVal.isTrue(ternaryExpressionTemp = this.configDir)
                                    ? ternaryExpressionTemp
                                    : ConfigPaths.runtimeStaticObject.getCurrentConfigDir(env));
            this.setHistoryFile(env, toStringR(dir, env) + "/psysh_history");
        }

        return ZVal.assign(this.historyFile);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object setHistorySize(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        this.historySize = ZVal.toLong(value);
        return null;
    }

    @ConvertedMethod
    public Object getHistorySize(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.historySize);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object setEraseDuplicates(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        this.eraseDuplicates = ZVal.toBool(value);
        return null;
    }

    @ConvertedMethod
    public Object getEraseDuplicates(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.eraseDuplicates);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(index = 1, name = "pid")
    public Object getTempFile(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        Object pid = assignParameter(args, 1, false);
        return ZVal.assign(
                NamespaceGlobal.tempnam
                        .env(env)
                        .call(
                                this.getRuntimeDir(env),
                                toStringR(type, env) + "_" + toStringR(pid, env) + "_")
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(index = 1, name = "pid")
    public Object getPipe(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        Object pid = assignParameter(args, 1, false);
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call("%s/%s_%s", this.getRuntimeDir(env), type, pid)
                        .value());
    }

    @ConvertedMethod
    public Object hasReadline(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.hasReadline);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "useReadline")
    public Object setUseReadline(RuntimeEnv env, Object... args) {
        Object useReadline = assignParameter(args, 0, false);
        this.useReadline = ZVal.toBool(useReadline);
        return null;
    }

    @ConvertedMethod
    public Object useReadline(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isset(this.useReadline)
                        ? ZVal.toBool(this.hasReadline) && ZVal.toBool(this.useReadline)
                        : this.hasReadline);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "readline", typeHint = "Psy\\Readline\\Readline")
    public Object setReadline(RuntimeEnv env, Object... args) {
        Object readline = assignParameter(args, 0, false);
        this.readline = readline;
        return null;
    }

    @ConvertedMethod
    public Object getReadline(RuntimeEnv env, Object... args) {
        Object className = null;
        if (!ZVal.isset(this.readline)) {
            className = this.getReadlineClass(env);
            this.readline =
                    env.createNew(
                            className,
                            this.getHistoryFile(env),
                            this.getHistorySize(env),
                            this.getEraseDuplicates(env));
        }

        return ZVal.assign(this.readline);
    }

    @ConvertedMethod
    private Object getReadlineClass(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.useReadline(env))) {
            if (ZVal.isTrue(GNUReadline.runtimeStaticObject.isSupported(env))) {
                return "Psy\\Readline\\GNUReadline";

            } else if (ZVal.isTrue(Libedit.runtimeStaticObject.isSupported(env))) {
                return "Psy\\Readline\\Libedit";

            } else if (ZVal.isTrue(HoaConsole.runtimeStaticObject.isSupported(env))) {
                return "Psy\\Readline\\HoaConsole";
            }
        }

        return "Psy\\Readline\\Transient";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "useBracketedPaste")
    public Object setUseBracketedPaste(RuntimeEnv env, Object... args) {
        Object useBracketedPaste = assignParameter(args, 0, false);
        this.useBracketedPaste = ZVal.toBool(useBracketedPaste);
        return null;
    }

    @ConvertedMethod
    public Object useBracketedPaste(RuntimeEnv env, Object... args) {
        Object supported = null;
        supported =
                ZVal.strictEqualityCheck(
                        this.getReadlineClass(env), "===", "Psy\\Readline\\GNUReadline");
        return ZVal.assign(ZVal.toBool(supported) && ZVal.toBool(this.useBracketedPaste));
    }

    @ConvertedMethod
    public Object hasPcntl(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.hasPcntl);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "usePcntl")
    public Object setUsePcntl(RuntimeEnv env, Object... args) {
        Object usePcntl = assignParameter(args, 0, false);
        this.usePcntl = ZVal.toBool(usePcntl);
        return null;
    }

    @ConvertedMethod
    public Object usePcntl(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isset(this.usePcntl)
                        ? ZVal.toBool(this.hasPcntl) && ZVal.toBool(this.usePcntl)
                        : this.hasPcntl);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "requireSemicolons")
    public Object setRequireSemicolons(RuntimeEnv env, Object... args) {
        Object requireSemicolons = assignParameter(args, 0, false);
        this.requireSemicolons = ZVal.toBool(requireSemicolons);
        return null;
    }

    @ConvertedMethod
    public Object requireSemicolons(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.requireSemicolons);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "useUnicode")
    public Object setUseUnicode(RuntimeEnv env, Object... args) {
        Object useUnicode = assignParameter(args, 0, false);
        this.useUnicode = ZVal.toBool(useUnicode);
        return null;
    }

    @ConvertedMethod
    public Object useUnicode(RuntimeEnv env, Object... args) {
        if (ZVal.isset(this.useUnicode)) {
            return ZVal.assign(this.useUnicode);
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "errorLoggingLevel")
    public Object setErrorLoggingLevel(RuntimeEnv env, Object... args) {
        Object errorLoggingLevel = assignParameter(args, 0, false);
        this.errorLoggingLevel =
                ZVal.toLong(ZVal.toLong(32767) | ZVal.toLong(2048))
                        & ZVal.toLong(errorLoggingLevel);
        return null;
    }

    @ConvertedMethod
    public Object errorLoggingLevel(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.errorLoggingLevel);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "cleaner", typeHint = "Psy\\CodeCleaner")
    public Object setCodeCleaner(RuntimeEnv env, Object... args) {
        Object cleaner = assignParameter(args, 0, false);
        this.cleaner = cleaner;
        return null;
    }

    @ConvertedMethod
    public Object getCodeCleaner(RuntimeEnv env, Object... args) {
        if (!ZVal.isset(this.cleaner)) {
            this.cleaner = new CodeCleaner(env);
        }

        return ZVal.assign(this.cleaner);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "useTabCompletion")
    public Object setUseTabCompletion(RuntimeEnv env, Object... args) {
        Object useTabCompletion = assignParameter(args, 0, false);
        this.useTabCompletion = ZVal.toBool(useTabCompletion);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "useTabCompletion")
    public Object setTabCompletion(RuntimeEnv env, Object... args) {
        Object useTabCompletion = assignParameter(args, 0, false);
        this.setUseTabCompletion(env, useTabCompletion);
        return null;
    }

    @ConvertedMethod
    public Object useTabCompletion(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isset(this.useTabCompletion)
                        ? ZVal.toBool(this.hasReadline) && ZVal.toBool(this.useTabCompletion)
                        : this.hasReadline);
    }

    @ConvertedMethod
    public Object getTabCompletion(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.useTabCompletion(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "output", typeHint = "Psy\\Output\\ShellOutput")
    public Object setOutput(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        this.output = output;
        return null;
    }

    @ConvertedMethod
    public Object getOutput(RuntimeEnv env, Object... args) {
        if (!ZVal.isset(this.output)) {
            this.output =
                    new ShellOutput(
                            env,
                            ShellOutput.CONST_VERBOSITY_NORMAL,
                            this.getOutputDecorated(env),
                            ZVal.getNull(),
                            this.getPager(env));
        }

        return ZVal.assign(this.output);
    }

    @ConvertedMethod
    public Object getOutputDecorated(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(this.colorMode(env), "===", CONST_COLOR_MODE_AUTO)) {
            return null;

        } else if (ZVal.strictEqualityCheck(this.colorMode(env), "===", CONST_COLOR_MODE_FORCED)) {
            return ZVal.assign(true);

        } else if (ZVal.strictEqualityCheck(
                this.colorMode(env), "===", CONST_COLOR_MODE_DISABLED)) {
            return ZVal.assign(false);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pager")
    public Object setPager(RuntimeEnv env, Object... args) {
        Object pager = assignParameter(args, 0, false);
        if (ZVal.toBool(
                        ZVal.toBool(pager)
                                && ZVal.toBool(
                                        !function_is_string.f.env(env).call(pager).getBool()))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        pager, OutputPager.class, "Psy\\Output\\OutputPager")))) {
            throw ZVal.getException(
                    env, new InvalidArgumentException(env, "Unexpected pager instance"));
        }

        this.pager = pager;
        return null;
    }

    @ConvertedMethod
    public Object getPager(RuntimeEnv env, Object... args) {
        Object pager = null;
        Object less = null;
        if (ZVal.toBool(!ZVal.isset(this.pager)) && ZVal.toBool(this.usePcntl(env))) {
            if (ZVal.isTrue(pager = function_ini_get.f.env(env).call("cli.pager").value())) {
                this.pager = pager;

            } else if (ZVal.isTrue(
                    less = NamespaceGlobal.exec.env(env).call("which less 2>/dev/null").value())) {
                this.pager = toStringR(less, env) + " -R -S -F -X";
            }
        }

        return ZVal.assign(this.pager);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "autoCompleter",
        typeHint = "Psy\\TabCompletion\\AutoCompleter"
    )
    public Object setAutoCompleter(RuntimeEnv env, Object... args) {
        Object autoCompleter = assignParameter(args, 0, false);
        this.autoCompleter = autoCompleter;
        return null;
    }

    @ConvertedMethod
    public Object getAutoCompleter(RuntimeEnv env, Object... args) {
        if (!ZVal.isset(this.autoCompleter)) {
            this.autoCompleter = new AutoCompleter(env);
        }

        return ZVal.assign(this.autoCompleter);
    }

    @ConvertedMethod
    public Object getTabCompletionMatchers(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "matchers", typeHint = "array")
    public Object addMatchers(RuntimeEnv env, Object... args) {
        Object matchers = assignParameter(args, 0, false);
        this.newMatchers = function_array_merge.f.env(env).call(this.newMatchers, matchers).value();
        if (ZVal.isset(this.shell)) {
            this.doAddMatchers(env);
        }

        return null;
    }

    @ConvertedMethod
    private Object doAddMatchers(RuntimeEnv env, Object... args) {
        if (!ZVal.isEmpty(this.newMatchers)) {
            env.callMethod(this.shell, "addMatchers", Configuration.class, this.newMatchers);
            this.newMatchers = ZVal.newArray();
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "matchers", typeHint = "array")
    public Object addTabCompletionMatchers(RuntimeEnv env, Object... args) {
        Object matchers = assignParameter(args, 0, false);
        this.addMatchers(env, matchers);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "commands", typeHint = "array")
    public Object addCommands(RuntimeEnv env, Object... args) {
        Object commands = assignParameter(args, 0, false);
        this.newCommands = function_array_merge.f.env(env).call(this.newCommands, commands).value();
        if (ZVal.isset(this.shell)) {
            this.doAddCommands(env);
        }

        return null;
    }

    @ConvertedMethod
    private Object doAddCommands(RuntimeEnv env, Object... args) {
        if (!ZVal.isEmpty(this.newCommands)) {
            env.callMethod(this.shell, "addCommands", Configuration.class, this.newCommands);
            this.newCommands = ZVal.newArray();
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "shell", typeHint = "Psy\\Shell")
    public Object setShell(RuntimeEnv env, Object... args) {
        Object shell = assignParameter(args, 0, false);
        this.shell = shell;
        this.doAddCommands(env);
        this.doAddMatchers(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filename")
    public Object setManualDbFile(RuntimeEnv env, Object... args) {
        Object filename = assignParameter(args, 0, false);
        this.manualDbFile = toStringR(filename, env);
        return null;
    }

    @ConvertedMethod
    public Object getManualDbFile(RuntimeEnv env, Object... args) {
        Object msg = null;
        ReferenceContainer files = new BasicReferenceContainer(null);
        if (ZVal.isset(this.manualDbFile)) {
            return ZVal.assign(this.manualDbFile);
        }

        files.setObject(
                ConfigPaths.runtimeStaticObject.getDataFiles(
                        env, ZVal.arrayFromList("php_manual.sqlite"), this.dataDir));
        if (!ZVal.isEmpty(files.getObject())) {
            if (ZVal.toBool(this.warnOnMultipleConfigs)
                    && ZVal.toBool(
                            ZVal.isGreaterThan(
                                    function_count.f.env(env).call(files.getObject()).value(),
                                    '>',
                                    1))) {
                msg =
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "Multiple manual database files found: %s. Using %s",
                                        NamespaceGlobal.implode
                                                .env(env)
                                                .call(files.getObject(), ", ")
                                                .value(),
                                        files.arrayGet(env, 0))
                                .value();
                NamespaceGlobal.trigger_error.env(env).call(msg, 1024);
            }

            return ZVal.assign(this.manualDbFile = files.arrayGet(env, 0));
        }

        return null;
    }

    @ConvertedMethod
    public Object getManualDb(RuntimeEnv env, Object... args) {
        Object dbFile = null;
        Object e = null;
        if (!ZVal.isset(this.manualDb)) {
            dbFile = this.getManualDbFile(env);
            if (function_is_file.f.env(env).call(dbFile).getBool()) {
                try {
                    this.manualDb = new PDO(env, "sqlite:" + toStringR(dbFile, env));
                } catch (ConvertedException convertedException186) {
                    if (convertedException186.instanceOf(PDOException.class, "PDOException")) {
                        e = convertedException186.getObject();
                        if (ZVal.strictEqualityCheck(
                                env.callMethod(e, "getMessage", Configuration.class),
                                "===",
                                "could not find driver")) {
                            throw ZVal.getException(
                                    env,
                                    new RuntimeException(env, "SQLite PDO driver not found", 0, e));

                        } else {
                            throw ZVal.getException(env, e);
                        }

                    } else {
                        throw convertedException186;
                    }
                }
            }
        }

        return ZVal.assign(this.manualDb);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "casters", typeHint = "array")
    public Object addCasters(RuntimeEnv env, Object... args) {
        Object casters = assignParameter(args, 0, false);
        env.callMethod(this.getPresenter(env), "addCasters", Configuration.class, casters);
        return null;
    }

    @ConvertedMethod
    public Object getPresenter(RuntimeEnv env, Object... args) {
        if (!ZVal.isset(this.presenter)) {
            this.presenter =
                    new Presenter(
                            env,
                            env.callMethod(
                                    this.getOutput(env), "getFormatter", Configuration.class),
                            this.forceArrayIndexes(env));
        }

        return ZVal.assign(this.presenter);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "warnOnMultipleConfigs")
    public Object setWarnOnMultipleConfigs(RuntimeEnv env, Object... args) {
        Object warnOnMultipleConfigs = assignParameter(args, 0, false);
        this.warnOnMultipleConfigs = ZVal.toBool(warnOnMultipleConfigs);
        return null;
    }

    @ConvertedMethod
    public Object warnOnMultipleConfigs(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.warnOnMultipleConfigs);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "colorMode")
    public Object setColorMode(RuntimeEnv env, Object... args) {
        Object colorMode = assignParameter(args, 0, false);
        Object validColorModes = null;
        validColorModes =
                ZVal.newArray(
                        new ZPair(0, CONST_COLOR_MODE_AUTO),
                        new ZPair(1, CONST_COLOR_MODE_FORCED),
                        new ZPair(2, CONST_COLOR_MODE_DISABLED));
        if (function_in_array.f.env(env).call(colorMode, validColorModes).getBool()) {
            this.colorMode = colorMode;

        } else {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "invalid color mode: " + toStringR(colorMode, env)));
        }

        return null;
    }

    @ConvertedMethod
    public Object colorMode(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.colorMode);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "checker", typeHint = "Psy\\VersionUpdater\\Checker")
    public Object setChecker(RuntimeEnv env, Object... args) {
        Object checker = assignParameter(args, 0, false);
        this.checker = checker;
        return null;
    }

    @ConvertedMethod
    public Object getChecker(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object interval = null;
        Object checkFile = null;
        if (!ZVal.isset(this.checker)) {
            interval = this.getUpdateCheck(env);
            SwitchEnumType75 switchVariable75 =
                    ZVal.getEnum(
                            interval,
                            SwitchEnumType75.DEFAULT_CASE,
                            SwitchEnumType75.DYNAMIC_TYPE_266,
                            Checker.CONST_ALWAYS,
                            SwitchEnumType75.DYNAMIC_TYPE_267,
                            Checker.CONST_DAILY,
                            SwitchEnumType75.DYNAMIC_TYPE_268,
                            Checker.CONST_WEEKLY,
                            SwitchEnumType75.DYNAMIC_TYPE_269,
                            Checker.CONST_MONTHLY,
                            SwitchEnumType75.DYNAMIC_TYPE_270,
                            Checker.CONST_NEVER);
            switch (switchVariable75) {
                case DYNAMIC_TYPE_266:
                    this.checker = new GitHubChecker(env);
                    break;
                case DYNAMIC_TYPE_267:
                case DYNAMIC_TYPE_268:
                case DYNAMIC_TYPE_269:
                    checkFile = this.getUpdateCheckCacheFile(env);
                    if (ZVal.strictEqualityCheck(checkFile, "===", false)) {
                        this.checker = new NoopChecker(env);

                    } else {
                        this.checker = new IntervalChecker(env, checkFile, interval);
                    }

                    break;
                case DYNAMIC_TYPE_270:
                    this.checker = new NoopChecker(env);
                    break;
            }
            ;
        }

        return ZVal.assign(this.checker);
    }

    @ConvertedMethod
    public Object getUpdateCheck(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.isset(this.updateCheck) ? this.updateCheck : Checker.CONST_WEEKLY);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "interval")
    public Object setUpdateCheck(RuntimeEnv env, Object... args) {
        Object interval = assignParameter(args, 0, false);
        Object validIntervals = null;
        validIntervals =
                ZVal.newArray(
                        new ZPair(0, Checker.CONST_ALWAYS),
                        new ZPair(1, Checker.CONST_DAILY),
                        new ZPair(2, Checker.CONST_WEEKLY),
                        new ZPair(3, Checker.CONST_MONTHLY),
                        new ZPair(4, Checker.CONST_NEVER));
        if (!function_in_array.f.env(env).call(interval, validIntervals).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "invalid update check interval: " + toStringR(interval, env)));
        }

        this.updateCheck = interval;
        return null;
    }

    @ConvertedMethod
    public Object getUpdateCheckCacheFile(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        Object dir = null;
        dir =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = this.configDir)
                                ? ternaryExpressionTemp
                                : ConfigPaths.runtimeStaticObject.getCurrentConfigDir(env));
        return ZVal.assign(
                ConfigPaths.runtimeStaticObject.touchFileWithMkdir(
                        env, toStringR(dir, env) + "/update_check.json"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    public Object setStartupMessage(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        this.startupMessage = message;
        return null;
    }

    @ConvertedMethod
    public Object getStartupMessage(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.startupMessage);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prompt")
    public Object setPrompt(RuntimeEnv env, Object... args) {
        Object prompt = assignParameter(args, 0, false);
        this.prompt = prompt;
        return null;
    }

    @ConvertedMethod
    public Object getPrompt(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.prompt);
    }

    @ConvertedMethod
    public Object forceArrayIndexes(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.forceArrayIndexes);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "forceArrayIndexes")
    public Object setForceArrayIndexes(RuntimeEnv env, Object... args) {
        Object forceArrayIndexes = assignParameter(args, 0, false);
        this.forceArrayIndexes = forceArrayIndexes;
        return null;
    }

    public static final Object CONST_COLOR_MODE_AUTO = "auto";

    public static final Object CONST_COLOR_MODE_FORCED = "forced";

    public static final Object CONST_COLOR_MODE_DISABLED = "disabled";

    public static final Object CONST_class = "Psy\\Configuration";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object AVAILABLE_OPTIONS =
                ZVal.arrayFromList(
                        "codeCleaner",
                        "colorMode",
                        "configDir",
                        "dataDir",
                        "defaultIncludes",
                        "eraseDuplicates",
                        "errorLoggingLevel",
                        "forceArrayIndexes",
                        "historySize",
                        "manualDbFile",
                        "pager",
                        "prompt",
                        "requireSemicolons",
                        "runtimeDir",
                        "startupMessage",
                        "updateCheck",
                        "useBracketedPaste",
                        "usePcntl",
                        "useReadline",
                        "useTabCompletion",
                        "useUnicode",
                        "warnOnMultipleConfigs");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Configuration")
                    .setLookup(
                            Configuration.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "autoCompleter",
                            "checker",
                            "cleaner",
                            "colorMode",
                            "configDir",
                            "configFile",
                            "dataDir",
                            "defaultIncludes",
                            "eraseDuplicates",
                            "errorLoggingLevel",
                            "forceArrayIndexes",
                            "hasPcntl",
                            "hasReadline",
                            "historyFile",
                            "historySize",
                            "manualDb",
                            "manualDbFile",
                            "newCommands",
                            "newMatchers",
                            "output",
                            "pager",
                            "presenter",
                            "prompt",
                            "readline",
                            "requireSemicolons",
                            "runtimeDir",
                            "shell",
                            "startupMessage",
                            "updateCheck",
                            "useBracketedPaste",
                            "usePcntl",
                            "useReadline",
                            "useTabCompletion",
                            "useUnicode",
                            "warnOnMultipleConfigs")
                    .setStaticPropertyNames("AVAILABLE_OPTIONS")
                    .setFilename("vendor/psy/psysh/src/Configuration.php")
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

    private static class Scope54 implements UpdateRuntimeScopeInterface {

        Object result;
        Object __psysh_config_file__;
        Object _thisVarAlias;
        Object config;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("result", this.result);
            stack.setVariable("__psysh_config_file__", this.__psysh_config_file__);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("config", this.config);
        }

        public void updateScope(RuntimeStack stack) {

            this.result = stack.getVariable("result");
            this.__psysh_config_file__ = stack.getVariable("__psysh_config_file__");
            this._thisVarAlias = stack.getVariable("this");
            this.config = stack.getVariable("config");
        }
    }

    private enum SwitchEnumType75 {
        DYNAMIC_TYPE_266,
        DYNAMIC_TYPE_267,
        DYNAMIC_TYPE_268,
        DYNAMIC_TYPE_269,
        DYNAMIC_TYPE_270,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
