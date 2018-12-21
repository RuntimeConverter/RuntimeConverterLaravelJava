package com.project.convertedCode.globalNamespace.namespaces.Psy.functions;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.Configuration;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.Shell;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.RuntimeException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.namespaces.XdgBaseDir.classes.Xdg;
import com.runtimeconverter.runtime.nativeClasses.pdo.PDO;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.Sudo;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.VersionUpdater.classes.GitHubChecker;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/functions.php

*/

public class info extends FunctionBaseRegular {

    public static info f = new info();

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "config",
        typeHint = "Psy\\Configuration",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope176 scope = new Scope176();
        stack.pushScope(scope);
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/psy/psysh/src")
                            .setFile("/vendor/psy/psysh/src/functions.php");
            int runtimeConverterBreakCount;
            PassByReferenceArgs rLastRefArgs;
            scope.config = assignParameter(args, 0, true);
            if (null == scope.config) {
                scope.config = ZVal.getNull();
            }
            scope.checker = null;
            scope.pcntl = new BasicReferenceContainer(null);
            scope.disabledFuncs = null;
            scope.updates = null;
            scope.docs = new BasicReferenceContainer(null);
            scope.updateAvailable = null;
            scope.key = null;
            scope.latest = null;
            scope.info = new BasicReferenceContainer(null);
            scope.readline = new BasicReferenceContainer(null);
            scope.val = null;
            scope.d = null;
            scope.e = null;
            scope.autocomplete = new BasicReferenceContainer(null);
            scope.ternaryExpressionTemp = null;
            scope.history = null;
            scope.home = null;
            scope.lastConfig = new BasicReferenceContainer(null);
            scope.core = new BasicReferenceContainer(null);
            scope.q = null;
            scope.shell = null;
            scope.meta = null;
            scope.xdg = null;
            scope.homePattern = null;
            scope.prettyPath = null;
            scope.db = null;
            scope.lastConfig = env.getInlineStatic(23, null);
            if (ZVal.strictNotEqualityCheck(scope.config, "!==", ZVal.getNull())) {
                scope.lastConfig.setObject(ZVal.assign(scope.config));
                throw new IncludeEventException(null);
            }

            scope.xdg = new Xdg(env);
            scope.home =
                    function_rtrim
                            .f
                            .env(env)
                            .call(
                                    function_str_replace
                                            .f
                                            .env(env)
                                            .call(
                                                    "\\",
                                                    "/",
                                                    env.callMethod(
                                                            scope.xdg, "getHomeDir", info.class))
                                            .value(),
                                    "/")
                            .value();
            scope.homePattern =
                    "#^"
                            + toStringR(
                                    NamespaceGlobal.preg_quote
                                            .env(env)
                                            .call(scope.home, "#")
                                            .value(),
                                    env)
                            + "/#";
            scope.prettyPath =
                    new Closure(env, runtimeConverterFunctionClassConstants, "Psy", this) {
                        @Override
                        @ConvertedMethod
                        @ConvertedParameter(index = 0, name = "path")
                        public Object run(
                                RuntimeEnv env,
                                Object thisvar,
                                PassByReferenceArgs runtimePassByReferenceArgs,
                                Object... args) {
                            Object path = assignParameter(args, 0, false);
                            Object homePattern = null;
                            homePattern = this.contextReferences.getCapturedValue("homePattern");
                            if (function_is_string.f.env(env).call(path).getBool()) {
                                return ZVal.assign(
                                        function_preg_replace
                                                .f
                                                .env(env)
                                                .call(homePattern, "~/", path)
                                                .value());

                            } else {
                                return ZVal.assign(path);
                            }
                        }
                    }.use("homePattern", scope.homePattern);
            scope.config =
                    ZVal.assign(
                            ZVal.isTrue(scope.ternaryExpressionTemp = scope.lastConfig.getObject())
                                    ? scope.ternaryExpressionTemp
                                    : new Configuration(env));
            scope.core.setObject(
                    ZVal.newArray(
                            new ZPair("PsySH version", Shell.CONST_VERSION),
                            new ZPair("PHP version", "7.2.11-dev"),
                            new ZPair("OS", "Linux"),
                            new ZPair(
                                    "default includes",
                                    env.callMethod(scope.config, "getDefaultIncludes", info.class)),
                            new ZPair(
                                    "require semicolons",
                                    env.callMethod(scope.config, "requireSemicolons", info.class)),
                            new ZPair(
                                    "error logging level",
                                    env.callMethod(scope.config, "errorLoggingLevel", info.class)),
                            new ZPair(
                                    "config file",
                                    ZVal.newArray(
                                            new ZPair(
                                                    "default config file",
                                                    env.callFunctionDynamic(
                                                                    scope.prettyPath,
                                                                    rLastRefArgs =
                                                                            new RuntimeArgsWithReferences()
                                                                                    .add(
                                                                                            0,
                                                                                            handleReturnReference(
                                                                                                    env
                                                                                                            .callMethod(
                                                                                                                    scope.config,
                                                                                                                    "getConfigFile",
                                                                                                                    info.class))),
                                                                    rLastRefArgs.get(0))
                                                            .value()),
                                            new ZPair(
                                                    "local config file",
                                                    env.callFunctionDynamic(
                                                                    scope.prettyPath,
                                                                    rLastRefArgs =
                                                                            new RuntimeArgsWithReferences()
                                                                                    .add(
                                                                                            0,
                                                                                            handleReturnReference(
                                                                                                    env
                                                                                                            .callMethod(
                                                                                                                    scope.config,
                                                                                                                    "getLocalConfigFile",
                                                                                                                    info.class))),
                                                                    rLastRefArgs.get(0))
                                                            .value()),
                                            new ZPair(
                                                    "PSYSH_CONFIG env",
                                                    env.callFunctionDynamic(
                                                                    scope.prettyPath,
                                                                    rLastRefArgs =
                                                                            new RuntimeArgsWithReferences()
                                                                                    .add(
                                                                                            0,
                                                                                            handleReturnReference(
                                                                                                    NamespaceGlobal
                                                                                                            .getenv
                                                                                                            .env(
                                                                                                                    env)
                                                                                                            .call(
                                                                                                                    "PSYSH_CONFIG")
                                                                                                            .value())),
                                                                    rLastRefArgs.get(0))
                                                            .value())))));
            scope.checker = new GitHubChecker(env);
            scope.updateAvailable = ZVal.getNull();
            scope.latest = ZVal.getNull();
            try {
                scope.updateAvailable =
                        !ZVal.isTrue(env.callMethod(scope.checker, "isLatest", info.class));
                scope.latest = env.callMethod(scope.checker, "getLatest", info.class);
            } catch (ConvertedException convertedException208) {
                if (convertedException208.instanceOf(PHPException.class, "Exception")) {
                    scope.e = convertedException208.getObject();
                } else {
                    throw convertedException208;
                }
            }

            scope.updates =
                    ZVal.newArray(
                            new ZPair("update available", scope.updateAvailable),
                            new ZPair("latest release version", scope.latest),
                            new ZPair(
                                    "update check interval",
                                    env.callMethod(scope.config, "getUpdateCheck", info.class)),
                            new ZPair(
                                    "update cache file",
                                    env.callFunctionDynamic(
                                                    scope.prettyPath,
                                                    rLastRefArgs =
                                                            new RuntimeArgsWithReferences()
                                                                    .add(
                                                                            0,
                                                                            handleReturnReference(
                                                                                    env.callMethod(
                                                                                            scope.config,
                                                                                            "getUpdateCheckCacheFile",
                                                                                            info.class))),
                                                    rLastRefArgs.get(0))
                                            .value()));
            if (ZVal.isTrue(env.callMethod(scope.config, "hasReadline", info.class))) {
                scope.info.setObject(NamespaceGlobal.readline_info.env(env).call().value());
                scope.readline.setObject(
                        ZVal.newArray(
                                new ZPair("readline available", true),
                                new ZPair(
                                        "readline enabled",
                                        env.callMethod(scope.config, "useReadline", info.class)),
                                new ZPair(
                                        "readline service",
                                        function_get_class
                                                .f
                                                .env(env)
                                                .call(
                                                        env.callMethod(
                                                                scope.config,
                                                                "getReadline",
                                                                info.class))
                                                .value())));
                if (arrayActionR(ArrayAction.ISSET, scope.info, env, "library_version")) {
                    scope.readline
                            .arrayAccess(env, "readline library")
                            .set(scope.info.arrayGet(env, "library_version"));
                }

                if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, scope.info, env, "readline_name"))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        scope.info.arrayGet(env, "readline_name"), "!==", ""))) {
                    scope.readline
                            .arrayAccess(env, "readline name")
                            .set(scope.info.arrayGet(env, "readline_name"));
                }

            } else {
                scope.readline.setObject(ZVal.newArray(new ZPair("readline available", false)));
            }

            scope.pcntl.setObject(
                    ZVal.newArray(
                            new ZPair(
                                    "pcntl available",
                                    function_function_exists
                                            .f
                                            .env(env)
                                            .call("pcntl_signal")
                                            .value()),
                            new ZPair(
                                    "posix available",
                                    function_function_exists
                                            .f
                                            .env(env)
                                            .call("posix_getpid")
                                            .value())));
            scope.disabledFuncs =
                    function_array_map
                            .f
                            .env(env)
                            .call(
                                    "trim",
                                    function_explode
                                            .f
                                            .env(env)
                                            .call(
                                                    ",",
                                                    function_ini_get
                                                            .f
                                                            .env(env)
                                                            .call("disable_functions")
                                                            .value())
                                            .value())
                            .value();
            if (ZVal.toBool(
                            function_in_array
                                    .f
                                    .env(env)
                                    .call("pcntl_signal", scope.disabledFuncs)
                                    .value())
                    || ZVal.toBool(
                            function_in_array
                                    .f
                                    .env(env)
                                    .call("pcntl_fork", scope.disabledFuncs)
                                    .value())) {
                scope.pcntl.arrayAccess(env, "pcntl disabled").set(true);
            }

            scope.history =
                    ZVal.newArray(
                            new ZPair(
                                    "history file",
                                    env.callFunctionDynamic(
                                                    scope.prettyPath,
                                                    rLastRefArgs =
                                                            new RuntimeArgsWithReferences()
                                                                    .add(
                                                                            0,
                                                                            handleReturnReference(
                                                                                    env.callMethod(
                                                                                            scope.config,
                                                                                            "getHistoryFile",
                                                                                            info.class))),
                                                    rLastRefArgs.get(0))
                                            .value()),
                            new ZPair(
                                    "history size",
                                    env.callMethod(scope.config, "getHistorySize", info.class)),
                            new ZPair(
                                    "erase duplicates",
                                    env.callMethod(
                                            scope.config, "getEraseDuplicates", info.class)));
            scope.docs.setObject(
                    ZVal.newArray(
                            new ZPair(
                                    "manual db file",
                                    env.callFunctionDynamic(
                                                    scope.prettyPath,
                                                    rLastRefArgs =
                                                            new RuntimeArgsWithReferences()
                                                                    .add(
                                                                            0,
                                                                            handleReturnReference(
                                                                                    env.callMethod(
                                                                                            scope.config,
                                                                                            "getManualDbFile",
                                                                                            info.class))),
                                                    rLastRefArgs.get(0))
                                            .value()),
                            new ZPair("sqlite available", true)));
            try {
                if (ZVal.isTrue(
                        scope.db = env.callMethod(scope.config, "getManualDb", info.class))) {
                    if (ZVal.isTrue(
                            scope.q =
                                    env.callMethod(
                                            scope.db,
                                            "query",
                                            info.class,
                                            "SELECT * FROM meta;"))) {
                        env.callMethod(scope.q, "setFetchMode", info.class, 12);
                        scope.meta = env.callMethod(scope.q, "fetchAll", info.class);
                        runtimeConverterBreakCount = 0;
                        for (ZPair zpairResult1427 : ZVal.getIterable(scope.meta, env, false)) {
                            scope.key = ZVal.assign(zpairResult1427.getKey());
                            scope.val = ZVal.assign(zpairResult1427.getValue());
                            switch (toStringR(scope.key)) {
                                case "built_at":
                                    scope.d = new DateTime(env, "@" + toStringR(scope.val, env));
                                    scope.val =
                                            env.callMethod(
                                                    scope.d,
                                                    "format",
                                                    info.class,
                                                    "D, d M Y H:i:s O");
                                    break;
                            }
                            ;
                            scope.key =
                                    "db "
                                            + toStringR(
                                                    function_str_replace
                                                            .f
                                                            .env(env)
                                                            .call("_", " ", scope.key)
                                                            .value(),
                                                    env);
                            scope.docs.arrayAccess(env, scope.key).set(scope.val);
                        }

                    } else {
                        scope.docs.arrayAccess(env, "db schema").set("0.1.0");
                    }
                }

            } catch (ConvertedException convertedException209) {
                if (convertedException209.instanceOf(
                        RuntimeException.class, "Psy\\Exception\\RuntimeException")) {
                    scope.e = convertedException209.getObject();
                    if (ZVal.strictEqualityCheck(
                            env.callMethod(scope.e, "getMessage", info.class),
                            "===",
                            "SQLite PDO driver not found")) {
                        scope.docs.arrayAccess(env, "sqlite available").set(false);

                    } else {
                        throw ZVal.getException(env, scope.e);
                    }

                } else {
                    throw convertedException209;
                }
            }

            scope.autocomplete.setObject(
                    ZVal.newArray(
                            new ZPair(
                                    "tab completion enabled",
                                    env.callMethod(scope.config, "useTabCompletion", info.class)),
                            new ZPair(
                                    "custom matchers",
                                    function_array_map
                                            .f
                                            .env(env)
                                            .call(
                                                    "get_class",
                                                    env.callMethod(
                                                            scope.config,
                                                            "getTabCompletionMatchers",
                                                            info.class))
                                            .value()),
                            new ZPair(
                                    "bracketed paste",
                                    env.callMethod(
                                            scope.config, "useBracketedPaste", info.class))));
            if (ZVal.isTrue(
                    scope.shell =
                            Sudo.runtimeStaticObject.fetchProperty(env, scope.config, "shell"))) {
                scope.core
                        .arrayAccess(env, "loop listeners")
                        .set(
                                function_array_map
                                        .f
                                        .env(env)
                                        .call(
                                                "get_class",
                                                Sudo.runtimeStaticObject.fetchProperty(
                                                        env, scope.shell, "loopListeners"))
                                        .value());
                scope.core
                        .arrayAccess(env, "commands")
                        .set(
                                function_array_map
                                        .f
                                        .env(env)
                                        .call(
                                                "get_class",
                                                env.callMethod(scope.shell, "all", info.class))
                                        .value());
                scope.autocomplete
                        .arrayAccess(env, "custom matchers")
                        .set(
                                function_array_map
                                        .f
                                        .env(env)
                                        .call(
                                                "get_class",
                                                Sudo.runtimeStaticObject.fetchProperty(
                                                        env, scope.shell, "matchers"))
                                        .value());
            }

            throw new IncludeEventException(
                    ZVal.assign(
                            function_array_merge
                                    .f
                                    .env(env)
                                    .call(
                                            scope.core.getObject(),
                                            function_compact
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            stack,
                                                            "updates",
                                                            "pcntl",
                                                            "readline",
                                                            "history",
                                                            "docs",
                                                            "autocomplete")
                                                    .value())
                                    .value()));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    private static class Scope176 implements UpdateRuntimeScopeInterface {

        Object checker;
        ReferenceContainer pcntl;
        Object disabledFuncs;
        Object updates;
        ReferenceContainer docs;
        Object updateAvailable;
        Object key;
        Object latest;
        ReferenceContainer info;
        ReferenceContainer readline;
        Object val;
        Object d;
        Object e;
        ReferenceContainer autocomplete;
        Object ternaryExpressionTemp;
        Object history;
        Object home;
        ReferenceContainer lastConfig;
        ReferenceContainer core;
        Object q;
        Object shell;
        Object meta;
        Object xdg;
        Object config;
        Object homePattern;
        Object prettyPath;
        Object db;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("checker", this.checker);
            stack.setVariable("pcntl", this.pcntl);
            stack.setVariable("disabledFuncs", this.disabledFuncs);
            stack.setVariable("updates", this.updates);
            stack.setVariable("docs", this.docs);
            stack.setVariable("updateAvailable", this.updateAvailable);
            stack.setVariable("key", this.key);
            stack.setVariable("latest", this.latest);
            stack.setVariable("info", this.info);
            stack.setVariable("readline", this.readline);
            stack.setVariable("val", this.val);
            stack.setVariable("d", this.d);
            stack.setVariable("e", this.e);
            stack.setVariable("autocomplete", this.autocomplete);
            stack.setVariable("ternaryExpressionTemp", this.ternaryExpressionTemp);
            stack.setVariable("history", this.history);
            stack.setVariable("home", this.home);
            stack.setVariable("lastConfig", this.lastConfig);
            stack.setVariable("core", this.core);
            stack.setVariable("q", this.q);
            stack.setVariable("shell", this.shell);
            stack.setVariable("meta", this.meta);
            stack.setVariable("xdg", this.xdg);
            stack.setVariable("config", this.config);
            stack.setVariable("homePattern", this.homePattern);
            stack.setVariable("prettyPath", this.prettyPath);
            stack.setVariable("db", this.db);
        }

        public void updateScope(RuntimeStack stack) {

            this.checker = stack.getVariable("checker");
            this.pcntl = ZVal.getStackReference(stack.getVariable("pcntl"));
            this.disabledFuncs = stack.getVariable("disabledFuncs");
            this.updates = stack.getVariable("updates");
            this.docs = ZVal.getStackReference(stack.getVariable("docs"));
            this.updateAvailable = stack.getVariable("updateAvailable");
            this.key = stack.getVariable("key");
            this.latest = stack.getVariable("latest");
            this.info = ZVal.getStackReference(stack.getVariable("info"));
            this.readline = ZVal.getStackReference(stack.getVariable("readline"));
            this.val = stack.getVariable("val");
            this.d = stack.getVariable("d");
            this.e = stack.getVariable("e");
            this.autocomplete = ZVal.getStackReference(stack.getVariable("autocomplete"));
            this.ternaryExpressionTemp = stack.getVariable("ternaryExpressionTemp");
            this.history = stack.getVariable("history");
            this.home = stack.getVariable("home");
            this.lastConfig = ZVal.getStackReference(stack.getVariable("lastConfig"));
            this.core = ZVal.getStackReference(stack.getVariable("core"));
            this.q = stack.getVariable("q");
            this.shell = stack.getVariable("shell");
            this.meta = stack.getVariable("meta");
            this.xdg = stack.getVariable("xdg");
            this.config = stack.getVariable("config");
            this.homePattern = stack.getVariable("homePattern");
            this.prettyPath = stack.getVariable("prettyPath");
            this.db = stack.getVariable("db");
        }
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/psy/psysh/src")
                .setFile("/vendor/psy/psysh/src/functions.php");
    }
}
