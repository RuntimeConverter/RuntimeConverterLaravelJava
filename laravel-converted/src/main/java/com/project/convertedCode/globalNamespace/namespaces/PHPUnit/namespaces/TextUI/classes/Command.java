package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.TextUI.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Configuration;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.runtimeconverter.runtime.nativeFunctions.stream.function_stream_resolve_include_path;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.StandardTestSuiteLoader;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Printer;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestSuite;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Test;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.PhptTestCase;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_file;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestListener;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.TextTestListRenderer;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.TextUI.classes.ResultPrinter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.TestSuiteSorter;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.TextUI.classes.TestRunner;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_set;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.FileLoader;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeFunctions.array.function_sort;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.FileIterator.classes.Facade;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.ConfigurationGenerator;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.TestDox.classes.CliTestDoxPrinter;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.file.function_realpath;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.file.function_getcwd;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Getopt;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.Log.classes.TeamCity;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Filesystem;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.TestSuiteLoader;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.ApplicationName;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.XmlTestListRenderer;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_extension_loaded;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.ManifestLoader;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/TextUI/Command.php

*/

public class Command extends RuntimeClassBase {

    public Object arguments =
            ZVal.newArray(
                    new ZPair("listGroups", false),
                    new ZPair("listSuites", false),
                    new ZPair("listTests", false),
                    new ZPair("listTestsXml", false),
                    new ZPair("loader", ZVal.getNull()),
                    new ZPair("useDefaultConfiguration", true),
                    new ZPair("loadedExtensions", ZVal.newArray()),
                    new ZPair("notLoadedExtensions", ZVal.newArray()));

    public Object options = ZVal.newArray();

    public Object longOptions =
            ZVal.newArray(
                    new ZPair("atleast-version=", ZVal.getNull()),
                    new ZPair("bootstrap=", ZVal.getNull()),
                    new ZPair("check-version", ZVal.getNull()),
                    new ZPair("colors==", ZVal.getNull()),
                    new ZPair("columns=", ZVal.getNull()),
                    new ZPair("configuration=", ZVal.getNull()),
                    new ZPair("coverage-clover=", ZVal.getNull()),
                    new ZPair("coverage-crap4j=", ZVal.getNull()),
                    new ZPair("coverage-html=", ZVal.getNull()),
                    new ZPair("coverage-php=", ZVal.getNull()),
                    new ZPair("coverage-text==", ZVal.getNull()),
                    new ZPair("coverage-xml=", ZVal.getNull()),
                    new ZPair("debug", ZVal.getNull()),
                    new ZPair("disallow-test-output", ZVal.getNull()),
                    new ZPair("disallow-resource-usage", ZVal.getNull()),
                    new ZPair("disallow-todo-tests", ZVal.getNull()),
                    new ZPair("enforce-time-limit", ZVal.getNull()),
                    new ZPair("exclude-group=", ZVal.getNull()),
                    new ZPair("filter=", ZVal.getNull()),
                    new ZPair("generate-configuration", ZVal.getNull()),
                    new ZPair("globals-backup", ZVal.getNull()),
                    new ZPair("group=", ZVal.getNull()),
                    new ZPair("help", ZVal.getNull()),
                    new ZPair("resolve-dependencies", ZVal.getNull()),
                    new ZPair("ignore-dependencies", ZVal.getNull()),
                    new ZPair("include-path=", ZVal.getNull()),
                    new ZPair("list-groups", ZVal.getNull()),
                    new ZPair("list-suites", ZVal.getNull()),
                    new ZPair("list-tests", ZVal.getNull()),
                    new ZPair("list-tests-xml=", ZVal.getNull()),
                    new ZPair("loader=", ZVal.getNull()),
                    new ZPair("log-junit=", ZVal.getNull()),
                    new ZPair("log-teamcity=", ZVal.getNull()),
                    new ZPair("no-configuration", ZVal.getNull()),
                    new ZPair("no-coverage", ZVal.getNull()),
                    new ZPair("no-logging", ZVal.getNull()),
                    new ZPair("no-extensions", ZVal.getNull()),
                    new ZPair("printer=", ZVal.getNull()),
                    new ZPair("process-isolation", ZVal.getNull()),
                    new ZPair("repeat=", ZVal.getNull()),
                    new ZPair("dont-report-useless-tests", ZVal.getNull()),
                    new ZPair("random-order", ZVal.getNull()),
                    new ZPair("random-order-seed=", ZVal.getNull()),
                    new ZPair("reverse-order", ZVal.getNull()),
                    new ZPair("reverse-list", ZVal.getNull()),
                    new ZPair("static-backup", ZVal.getNull()),
                    new ZPair("stderr", ZVal.getNull()),
                    new ZPair("stop-on-error", ZVal.getNull()),
                    new ZPair("stop-on-failure", ZVal.getNull()),
                    new ZPair("stop-on-warning", ZVal.getNull()),
                    new ZPair("stop-on-incomplete", ZVal.getNull()),
                    new ZPair("stop-on-risky", ZVal.getNull()),
                    new ZPair("stop-on-skipped", ZVal.getNull()),
                    new ZPair("fail-on-warning", ZVal.getNull()),
                    new ZPair("fail-on-risky", ZVal.getNull()),
                    new ZPair("strict-coverage", ZVal.getNull()),
                    new ZPair("disable-coverage-ignore", ZVal.getNull()),
                    new ZPair("strict-global-state", ZVal.getNull()),
                    new ZPair("teamcity", ZVal.getNull()),
                    new ZPair("testdox", ZVal.getNull()),
                    new ZPair("testdox-group=", ZVal.getNull()),
                    new ZPair("testdox-exclude-group=", ZVal.getNull()),
                    new ZPair("testdox-html=", ZVal.getNull()),
                    new ZPair("testdox-text=", ZVal.getNull()),
                    new ZPair("testdox-xml=", ZVal.getNull()),
                    new ZPair("test-suffix=", ZVal.getNull()),
                    new ZPair("testsuite=", ZVal.getNull()),
                    new ZPair("verbose", ZVal.getNull()),
                    new ZPair("version", ZVal.getNull()),
                    new ZPair("whitelist=", ZVal.getNull()));

    public Object versionStringPrinted = false;

    public Command(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Command(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "argv", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "exit",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object run(RuntimeEnv env, Object... args) {
        Object argv = assignParameter(args, 0, false);
        Object exit = assignParameter(args, 1, true);
        if (null == exit) {
            exit = true;
        }
        Object result = null;
        Object suite = null;
        Object e = null;
        Object runner = null;
        Object _pReturn = null;
        this.handleArguments(env, argv);
        runner = this.createRunner(env);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        new ReferenceClassProperty(this, "arguments", env).arrayGet(env, "test"),
                        Test.class,
                        "PHPUnit\\Framework\\Test"))) {
            suite =
                    ZVal.assign(
                            new ReferenceClassProperty(this, "arguments", env)
                                    .arrayGet(env, "test"));

        } else {
            suite =
                    env.callMethod(
                            runner,
                            "getTest",
                            Command.class,
                            new ReferenceClassProperty(this, "arguments", env)
                                    .arrayGet(env, "test"),
                            new ReferenceClassProperty(this, "arguments", env)
                                    .arrayGet(env, "testFile"),
                            new ReferenceClassProperty(this, "arguments", env)
                                    .arrayGet(env, "testSuffixes"));
        }

        if (ZVal.isTrue(
                new ReferenceClassProperty(this, "arguments", env).arrayGet(env, "listGroups"))) {
            return ZVal.assign(this.handleListGroups(env, suite, exit));
        }

        if (ZVal.isTrue(
                new ReferenceClassProperty(this, "arguments", env).arrayGet(env, "listSuites"))) {
            return ZVal.assign(this.handleListSuites(env, exit));
        }

        if (ZVal.isTrue(
                new ReferenceClassProperty(this, "arguments", env).arrayGet(env, "listTests"))) {
            return ZVal.assign(this.handleListTests(env, suite, exit));
        }

        if (ZVal.isTrue(
                new ReferenceClassProperty(this, "arguments", env).arrayGet(env, "listTestsXml"))) {
            return ZVal.assign(
                    this.handleListTestsXml(
                            env,
                            suite,
                            new ReferenceClassProperty(this, "arguments", env)
                                    .arrayGet(env, "listTestsXml"),
                            exit));
        }

        arrayActionR(
                ArrayAction.UNSET, new ReferenceClassProperty(this, "arguments", env), env, "test");
        arrayActionR(
                ArrayAction.UNSET,
                new ReferenceClassProperty(this, "arguments", env),
                env,
                "testFile");
        try {
            result = env.callMethod(runner, "doRun", Command.class, suite, this.arguments, exit);
        } catch (ConvertedException convertedException156) {
            if (convertedException156.instanceOf(
                    com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .PHPUnit
                            .namespaces
                            .Framework
                            .classes
                            .Exception
                            .class,
                    "PHPUnit\\Framework\\Exception")) {
                e = convertedException156.getObject();
                env.echo(
                        toStringR(env.callMethod(e, "getMessage", Command.class), env)
                                + toStringR("\n", env));
            } else {
                throw convertedException156;
            }
        }

        _pReturn = ZVal.assign(TestRunner.CONST_FAILURE_EXIT);
        if (ZVal.toBool(ZVal.isset(result))
                && ZVal.toBool(env.callMethod(result, "wasSuccessful", Command.class))) {
            _pReturn = ZVal.assign(TestRunner.CONST_SUCCESS_EXIT);

        } else if (ZVal.toBool(!ZVal.isset(result))
                || ZVal.toBool(
                        ZVal.isGreaterThan(
                                env.callMethod(result, "errorCount", Command.class), '>', 0))) {
            _pReturn = ZVal.assign(TestRunner.CONST_EXCEPTION_EXIT);
        }

        if (ZVal.isTrue(exit)) {
            env.exit(_pReturn);
        }

        return ZVal.assign(_pReturn);
    }

    @ConvertedMethod
    protected Object createRunner(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new TestRunner(
                        env,
                        new ReferenceClassProperty(this, "arguments", env)
                                .arrayGet(env, "loader")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "argv", typeHint = "array")
    protected Object handleArguments(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object argv = assignParameter(args, 0, false);
        Object handler = null;
        ReferenceContainer phpunitConfiguration = new BasicReferenceContainer(null);
        Object testsDirectory = null;
        Object test = null;
        ReferenceContainer ini = new BasicReferenceContainer(null);
        Object src = null;
        Object configuration = null;
        Object testSuite = null;
        Object generator = null;
        Object includePath = null;
        Object ternaryExpressionTemp = null;
        Object bootstrapScript = null;
        Object file = null;
        Object t = null;
        Object configurationFile = null;
        Object optionName = null;
        ReferenceContainer option = new BasicReferenceContainer(null);
        try {
            this.options =
                    Getopt.runtimeStaticObject.getopt(
                            env,
                            argv,
                            "d:c:hv",
                            function_array_keys.f.env(env).call(this.longOptions).value());
        } catch (ConvertedException convertedException157) {
            if (convertedException157.instanceOf(
                    com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .PHPUnit
                            .namespaces
                            .Framework
                            .classes
                            .Exception
                            .class,
                    "PHPUnit\\Framework\\Exception")) {
                t = convertedException157.getObject();
                this.exitWithErrorMessage(env, env.callMethod(t, "getMessage", Command.class));
            } else {
                throw convertedException157;
            }
        }

        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult1234 :
                ZVal.getIterable(
                        new ReferenceClassProperty(this, "options", env).arrayGet(env, 0),
                        env,
                        true)) {
            option.setObject(ZVal.assign(zpairResult1234.getValue()));
            SwitchEnumType66 switchVariable66 =
                    ZVal.getEnum(
                            option.arrayGet(env, 0),
                            SwitchEnumType66.DEFAULT_CASE,
                            SwitchEnumType66.STRING___colors,
                            "--colors",
                            SwitchEnumType66.STRING___bootstrap,
                            "--bootstrap",
                            SwitchEnumType66.STRING___columns,
                            "--columns",
                            SwitchEnumType66.STRING_c,
                            "c",
                            SwitchEnumType66.STRING___configuration,
                            "--configuration",
                            SwitchEnumType66.STRING___coverage_clover,
                            "--coverage-clover",
                            SwitchEnumType66.STRING___coverage_crap4j,
                            "--coverage-crap4j",
                            SwitchEnumType66.STRING___coverage_html,
                            "--coverage-html",
                            SwitchEnumType66.STRING___coverage_php,
                            "--coverage-php",
                            SwitchEnumType66.STRING___coverage_text,
                            "--coverage-text",
                            SwitchEnumType66.STRING___coverage_xml,
                            "--coverage-xml",
                            SwitchEnumType66.STRING_d,
                            "d",
                            SwitchEnumType66.STRING___debug,
                            "--debug",
                            SwitchEnumType66.STRING_h,
                            "h",
                            SwitchEnumType66.STRING___help,
                            "--help",
                            SwitchEnumType66.STRING___filter,
                            "--filter",
                            SwitchEnumType66.STRING___testsuite,
                            "--testsuite",
                            SwitchEnumType66.STRING___generate_configuration,
                            "--generate-configuration",
                            SwitchEnumType66.STRING___group,
                            "--group",
                            SwitchEnumType66.STRING___exclude_group,
                            "--exclude-group",
                            SwitchEnumType66.STRING___test_suffix,
                            "--test-suffix",
                            SwitchEnumType66.STRING___include_path,
                            "--include-path",
                            SwitchEnumType66.STRING___list_groups,
                            "--list-groups",
                            SwitchEnumType66.STRING___list_suites,
                            "--list-suites",
                            SwitchEnumType66.STRING___list_tests,
                            "--list-tests",
                            SwitchEnumType66.STRING___list_tests_xml,
                            "--list-tests-xml",
                            SwitchEnumType66.STRING___printer,
                            "--printer",
                            SwitchEnumType66.STRING___loader,
                            "--loader",
                            SwitchEnumType66.STRING___log_junit,
                            "--log-junit",
                            SwitchEnumType66.STRING___log_teamcity,
                            "--log-teamcity",
                            SwitchEnumType66.STRING___process_isolation,
                            "--process-isolation",
                            SwitchEnumType66.STRING___repeat,
                            "--repeat",
                            SwitchEnumType66.STRING___stderr,
                            "--stderr",
                            SwitchEnumType66.STRING___stop_on_error,
                            "--stop-on-error",
                            SwitchEnumType66.STRING___stop_on_failure,
                            "--stop-on-failure",
                            SwitchEnumType66.STRING___stop_on_warning,
                            "--stop-on-warning",
                            SwitchEnumType66.STRING___stop_on_incomplete,
                            "--stop-on-incomplete",
                            SwitchEnumType66.STRING___stop_on_risky,
                            "--stop-on-risky",
                            SwitchEnumType66.STRING___stop_on_skipped,
                            "--stop-on-skipped",
                            SwitchEnumType66.STRING___fail_on_warning,
                            "--fail-on-warning",
                            SwitchEnumType66.STRING___fail_on_risky,
                            "--fail-on-risky",
                            SwitchEnumType66.STRING___teamcity,
                            "--teamcity",
                            SwitchEnumType66.STRING___testdox,
                            "--testdox",
                            SwitchEnumType66.STRING___testdox_group,
                            "--testdox-group",
                            SwitchEnumType66.STRING___testdox_exclude_group,
                            "--testdox-exclude-group",
                            SwitchEnumType66.STRING___testdox_html,
                            "--testdox-html",
                            SwitchEnumType66.STRING___testdox_text,
                            "--testdox-text",
                            SwitchEnumType66.STRING___testdox_xml,
                            "--testdox-xml",
                            SwitchEnumType66.STRING___no_configuration,
                            "--no-configuration",
                            SwitchEnumType66.STRING___no_extensions,
                            "--no-extensions",
                            SwitchEnumType66.STRING___no_coverage,
                            "--no-coverage",
                            SwitchEnumType66.STRING___no_logging,
                            "--no-logging",
                            SwitchEnumType66.STRING___globals_backup,
                            "--globals-backup",
                            SwitchEnumType66.STRING___static_backup,
                            "--static-backup",
                            SwitchEnumType66.STRING_v,
                            "v",
                            SwitchEnumType66.STRING___verbose,
                            "--verbose",
                            SwitchEnumType66.STRING___atleast_version,
                            "--atleast-version",
                            SwitchEnumType66.STRING___version,
                            "--version",
                            SwitchEnumType66.STRING___dont_report_useless_tests,
                            "--dont-report-useless-tests",
                            SwitchEnumType66.STRING___strict_coverage,
                            "--strict-coverage",
                            SwitchEnumType66.STRING___disable_coverage_ignore,
                            "--disable-coverage-ignore",
                            SwitchEnumType66.STRING___strict_global_state,
                            "--strict-global-state",
                            SwitchEnumType66.STRING___disallow_test_output,
                            "--disallow-test-output",
                            SwitchEnumType66.STRING___disallow_resource_usage,
                            "--disallow-resource-usage",
                            SwitchEnumType66.STRING___enforce_time_limit,
                            "--enforce-time-limit",
                            SwitchEnumType66.STRING___disallow_todo_tests,
                            "--disallow-todo-tests",
                            SwitchEnumType66.STRING___reverse_list,
                            "--reverse-list",
                            SwitchEnumType66.STRING___check_version,
                            "--check-version",
                            SwitchEnumType66.STRING___whitelist,
                            "--whitelist",
                            SwitchEnumType66.STRING___random_order,
                            "--random-order",
                            SwitchEnumType66.STRING___random_order_seed,
                            "--random-order-seed",
                            SwitchEnumType66.STRING___resolve_dependencies,
                            "--resolve-dependencies",
                            SwitchEnumType66.STRING___ignore_dependencies,
                            "--ignore-dependencies",
                            SwitchEnumType66.STRING___reverse_order,
                            "--reverse-order");
            switch (switchVariable66) {
                case STRING___colors:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "colors")
                            .set(
                                    ZVal.isTrue(ternaryExpressionTemp = option.arrayGet(env, 1))
                                            ? ternaryExpressionTemp
                                            : ResultPrinter.CONST_COLOR_AUTO);
                    break;
                case STRING___bootstrap:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "bootstrap")
                            .set(option.arrayGet(env, 1));
                    break;
                case STRING___columns:
                    if (function_is_numeric.f.env(env).call(option.arrayGet(env, 1)).getBool()) {
                        new ReferenceClassProperty(this, "arguments", env)
                                .arrayAccess(env, "columns")
                                .set(ZVal.toLong(option.arrayGet(env, 1)));

                    } else if (ZVal.strictEqualityCheck(option.arrayGet(env, 1), "===", "max")) {
                        new ReferenceClassProperty(this, "arguments", env)
                                .arrayAccess(env, "columns")
                                .set("max");
                    }

                    break;
                case STRING_c:
                case STRING___configuration:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "configuration")
                            .set(option.arrayGet(env, 1));
                    break;
                case STRING___coverage_clover:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "coverageClover")
                            .set(option.arrayGet(env, 1));
                    break;
                case STRING___coverage_crap4j:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "coverageCrap4J")
                            .set(option.arrayGet(env, 1));
                    break;
                case STRING___coverage_html:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "coverageHtml")
                            .set(option.arrayGet(env, 1));
                    break;
                case STRING___coverage_php:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "coveragePHP")
                            .set(option.arrayGet(env, 1));
                    break;
                case STRING___coverage_text:
                    if (ZVal.strictEqualityCheck(option.arrayGet(env, 1), "===", ZVal.getNull())) {
                        option.arrayAccess(env, 1).set("php://stdout");
                    }

                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "coverageText")
                            .set(option.arrayGet(env, 1));
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "coverageTextShowUncoveredFiles")
                            .set(false);
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "coverageTextShowOnlySummary")
                            .set(false);
                    break;
                case STRING___coverage_xml:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "coverageXml")
                            .set(option.arrayGet(env, 1));
                    break;
                case STRING_d:
                    ini.setObject(
                            function_explode.f.env(env).call("=", option.arrayGet(env, 1)).value());
                    if (arrayActionR(ArrayAction.ISSET, ini, env, 0)) {
                        if (arrayActionR(ArrayAction.ISSET, ini, env, 1)) {
                            function_ini_set
                                    .f
                                    .env(env)
                                    .call(ini.arrayGet(env, 0), ini.arrayGet(env, 1));

                        } else {
                            function_ini_set.f.env(env).call(ini.arrayGet(env, 0), true);
                        }
                    }

                    break;
                case STRING___debug:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "debug")
                            .set(true);
                    break;
                case STRING_h:
                case STRING___help:
                    this.showHelp(env);
                    env.exit(TestRunner.CONST_SUCCESS_EXIT);
                    break;
                case STRING___filter:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "filter")
                            .set(option.arrayGet(env, 1));
                    break;
                case STRING___testsuite:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "testsuite")
                            .set(option.arrayGet(env, 1));
                    break;
                case STRING___generate_configuration:
                    this.printVersionString(env);
                    env.echo(
                            "Generating phpunit.xml in "
                                    + toStringR(function_getcwd.f.env(env).call().value(), env)
                                    + toStringR("\n", env)
                                    + toStringR("\n", env));
                    env.echo(
                            "Bootstrap script (relative to path shown above; default: vendor/autoload.php): ");
                    bootstrapScript =
                            function_trim
                                    .f
                                    .env(env)
                                    .call(
                                            NamespaceGlobal.fgets
                                                    .env(env)
                                                    .call(function_constant.get(env, "STDIN"))
                                                    .value())
                                    .value();
                    env.echo("Tests directory (relative to path shown above; default: tests): ");
                    testsDirectory =
                            function_trim
                                    .f
                                    .env(env)
                                    .call(
                                            NamespaceGlobal.fgets
                                                    .env(env)
                                                    .call(function_constant.get(env, "STDIN"))
                                                    .value())
                                    .value();
                    env.echo("Source directory (relative to path shown above; default: src): ");
                    src =
                            function_trim
                                    .f
                                    .env(env)
                                    .call(
                                            NamespaceGlobal.fgets
                                                    .env(env)
                                                    .call(function_constant.get(env, "STDIN"))
                                                    .value())
                                    .value();
                    if (ZVal.strictEqualityCheck(bootstrapScript, "===", "")) {
                        bootstrapScript = "vendor/autoload.php";
                    }

                    if (ZVal.strictEqualityCheck(testsDirectory, "===", "")) {
                        testsDirectory = "tests";
                    }

                    if (ZVal.strictEqualityCheck(src, "===", "")) {
                        src = "src";
                    }

                    generator = new ConfigurationGenerator(env);
                    NamespaceGlobal.file_put_contents
                            .env(env)
                            .call(
                                    "phpunit.xml",
                                    env.callMethod(
                                            generator,
                                            "generateDefaultConfiguration",
                                            Command.class,
                                            com.project.convertedCode.globalNamespace.namespaces
                                                    .PHPUnit.namespaces.Runner.classes.Version
                                                    .runtimeStaticObject.series(env),
                                            bootstrapScript,
                                            testsDirectory,
                                            src));
                    env.echo(
                            toStringR("\n", env)
                                    + "Generated phpunit.xml in "
                                    + toStringR(function_getcwd.f.env(env).call().value(), env)
                                    + toStringR("\n", env));
                    env.exit(TestRunner.CONST_SUCCESS_EXIT);
                    break;
                case STRING___group:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "groups")
                            .set(
                                    function_explode
                                            .f
                                            .env(env)
                                            .call(",", option.arrayGet(env, 1))
                                            .value());
                    break;
                case STRING___exclude_group:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "excludeGroups")
                            .set(
                                    function_explode
                                            .f
                                            .env(env)
                                            .call(",", option.arrayGet(env, 1))
                                            .value());
                    break;
                case STRING___test_suffix:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "testSuffixes")
                            .set(
                                    function_explode
                                            .f
                                            .env(env)
                                            .call(",", option.arrayGet(env, 1))
                                            .value());
                    break;
                case STRING___include_path:
                    includePath = ZVal.assign(option.arrayGet(env, 1));
                    break;
                case STRING___list_groups:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "listGroups")
                            .set(true);
                    break;
                case STRING___list_suites:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "listSuites")
                            .set(true);
                    break;
                case STRING___list_tests:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "listTests")
                            .set(true);
                    break;
                case STRING___list_tests_xml:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "listTestsXml")
                            .set(option.arrayGet(env, 1));
                    break;
                case STRING___printer:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "printer")
                            .set(option.arrayGet(env, 1));
                    break;
                case STRING___loader:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "loader")
                            .set(option.arrayGet(env, 1));
                    break;
                case STRING___log_junit:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "junitLogfile")
                            .set(option.arrayGet(env, 1));
                    break;
                case STRING___log_teamcity:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "teamcityLogfile")
                            .set(option.arrayGet(env, 1));
                    break;
                case STRING___process_isolation:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "processIsolation")
                            .set(true);
                    break;
                case STRING___repeat:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "repeat")
                            .set(ZVal.toLong(option.arrayGet(env, 1)));
                    break;
                case STRING___stderr:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "stderr")
                            .set(true);
                    break;
                case STRING___stop_on_error:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "stopOnError")
                            .set(true);
                    break;
                case STRING___stop_on_failure:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "stopOnFailure")
                            .set(true);
                    break;
                case STRING___stop_on_warning:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "stopOnWarning")
                            .set(true);
                    break;
                case STRING___stop_on_incomplete:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "stopOnIncomplete")
                            .set(true);
                    break;
                case STRING___stop_on_risky:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "stopOnRisky")
                            .set(true);
                    break;
                case STRING___stop_on_skipped:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "stopOnSkipped")
                            .set(true);
                    break;
                case STRING___fail_on_warning:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "failOnWarning")
                            .set(true);
                    break;
                case STRING___fail_on_risky:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "failOnRisky")
                            .set(true);
                    break;
                case STRING___teamcity:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "printer")
                            .set(TeamCity.CONST_class);
                    break;
                case STRING___testdox:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "printer")
                            .set(CliTestDoxPrinter.CONST_class);
                    break;
                case STRING___testdox_group:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "testdoxGroups")
                            .set(
                                    function_explode
                                            .f
                                            .env(env)
                                            .call(",", option.arrayGet(env, 1))
                                            .value());
                    break;
                case STRING___testdox_exclude_group:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "testdoxExcludeGroups")
                            .set(
                                    function_explode
                                            .f
                                            .env(env)
                                            .call(",", option.arrayGet(env, 1))
                                            .value());
                    break;
                case STRING___testdox_html:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "testdoxHTMLFile")
                            .set(option.arrayGet(env, 1));
                    break;
                case STRING___testdox_text:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "testdoxTextFile")
                            .set(option.arrayGet(env, 1));
                    break;
                case STRING___testdox_xml:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "testdoxXMLFile")
                            .set(option.arrayGet(env, 1));
                    break;
                case STRING___no_configuration:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "useDefaultConfiguration")
                            .set(false);
                    break;
                case STRING___no_extensions:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "noExtensions")
                            .set(true);
                    break;
                case STRING___no_coverage:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "noCoverage")
                            .set(true);
                    break;
                case STRING___no_logging:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "noLogging")
                            .set(true);
                    break;
                case STRING___globals_backup:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "backupGlobals")
                            .set(true);
                    break;
                case STRING___static_backup:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "backupStaticAttributes")
                            .set(true);
                    break;
                case STRING_v:
                case STRING___verbose:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "verbose")
                            .set(true);
                    break;
                case STRING___atleast_version:
                    if (NamespaceGlobal.version_compare
                            .env(env)
                            .call(
                                    com.project.convertedCode.globalNamespace.namespaces.PHPUnit
                                            .namespaces.Runner.classes.Version.runtimeStaticObject
                                            .id(env),
                                    option.arrayGet(env, 1),
                                    ">=")
                            .getBool()) {
                        env.exit(TestRunner.CONST_SUCCESS_EXIT);
                    }

                    env.exit(TestRunner.CONST_FAILURE_EXIT);
                    break;
                case STRING___version:
                    this.printVersionString(env);
                    env.exit(TestRunner.CONST_SUCCESS_EXIT);
                    break;
                case STRING___dont_report_useless_tests:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "reportUselessTests")
                            .set(false);
                    break;
                case STRING___strict_coverage:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "strictCoverage")
                            .set(true);
                    break;
                case STRING___disable_coverage_ignore:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "disableCodeCoverageIgnore")
                            .set(true);
                    break;
                case STRING___strict_global_state:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "beStrictAboutChangesToGlobalState")
                            .set(true);
                    break;
                case STRING___disallow_test_output:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "disallowTestOutput")
                            .set(true);
                    break;
                case STRING___disallow_resource_usage:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "beStrictAboutResourceUsageDuringSmallTests")
                            .set(true);
                    break;
                case STRING___enforce_time_limit:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "enforceTimeLimit")
                            .set(true);
                    break;
                case STRING___disallow_todo_tests:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "disallowTodoAnnotatedTests")
                            .set(true);
                    break;
                case STRING___reverse_list:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "reverseList")
                            .set(true);
                    break;
                case STRING___check_version:
                    this.handleVersionCheck(env);
                    break;
                case STRING___whitelist:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "whitelist")
                            .set(option.arrayGet(env, 1));
                    break;
                case STRING___random_order:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "executionOrder")
                            .set(TestSuiteSorter.CONST_ORDER_RANDOMIZED);
                    break;
                case STRING___random_order_seed:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "randomOrderSeed")
                            .set(ZVal.toLong(option.arrayGet(env, 1)));
                    break;
                case STRING___resolve_dependencies:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "resolveDependencies")
                            .set(true);
                    break;
                case STRING___ignore_dependencies:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "resolveDependencies")
                            .set(false);
                    break;
                case STRING___reverse_order:
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "executionOrder")
                            .set(TestSuiteSorter.CONST_ORDER_REVERSED);
                    break;
                case DEFAULT_CASE:
                    optionName =
                            function_str_replace
                                    .f
                                    .env(env)
                                    .call("--", "", option.arrayGet(env, 0))
                                    .value();
                    handler = ZVal.getNull();
                    if (arrayActionR(
                            ArrayAction.ISSET,
                            new ReferenceClassProperty(this, "longOptions", env),
                            env,
                            optionName)) {
                        handler =
                                ZVal.assign(
                                        new ReferenceClassProperty(this, "longOptions", env)
                                                .arrayGet(env, optionName));

                    } else if (arrayActionR(
                            ArrayAction.ISSET,
                            new ReferenceClassProperty(this, "longOptions", env),
                            env,
                            toStringR(optionName, env) + "=")) {
                        handler =
                                ZVal.assign(
                                        new ReferenceClassProperty(this, "longOptions", env)
                                                .arrayGet(env, toStringR(optionName, env) + "="));
                    }

                    if (ZVal.toBool(ZVal.isset(handler))
                            && ZVal.toBool(
                                    function_is_callable
                                            .f
                                            .env(env)
                                            .call(
                                                    ZVal.newArray(
                                                            new ZPair(0, this),
                                                            new ZPair(1, handler)))
                                            .value())) {
                        env.callMethod(
                                this,
                                new RuntimeArgsWithReferences()
                                        .add(0, new ArrayDimensionReference(option.getObject(), 1)),
                                toStringR(handler, env),
                                Command.class,
                                option.arrayGet(env, 1));
                    }
            }
            ;
        }

        this.handleCustomTestSuite(env);
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "arguments", env),
                env,
                "test")) {
            if (arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "options", env),
                    env,
                    1,
                    0)) {
                new ReferenceClassProperty(this, "arguments", env)
                        .arrayAccess(env, "test")
                        .set(new ReferenceClassProperty(this, "options", env).arrayGet(env, 1, 0));
            }

            if (arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "options", env),
                    env,
                    1,
                    1)) {
                new ReferenceClassProperty(this, "arguments", env)
                        .arrayAccess(env, "testFile")
                        .set(
                                function_realpath
                                        .f
                                        .env(env)
                                        .call(
                                                new ReferenceClassProperty(this, "options", env)
                                                        .arrayGet(env, 1, 1))
                                        .value());

            } else {
                new ReferenceClassProperty(this, "arguments", env)
                        .arrayAccess(env, "testFile")
                        .set("");
            }

            if (ZVal.toBool(
                            ZVal.toBool(
                                            arrayActionR(
                                                    ArrayAction.ISSET,
                                                    new ReferenceClassProperty(
                                                            this, "arguments", env),
                                                    env,
                                                    "test"))
                                    && ZVal.toBool(
                                            function_is_file
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            new ReferenceClassProperty(
                                                                            this, "arguments", env)
                                                                    .arrayGet(env, "test"))
                                                    .value()))
                    && ZVal.toBool(
                            ZVal.notEqualityCheck(
                                    function_substr
                                            .f
                                            .env(env)
                                            .call(
                                                    new ReferenceClassProperty(
                                                                    this, "arguments", env)
                                                            .arrayGet(env, "test"),
                                                    -5,
                                                    5)
                                            .value(),
                                    ".phpt"))) {
                new ReferenceClassProperty(this, "arguments", env)
                        .arrayAccess(env, "testFile")
                        .set(
                                function_realpath
                                        .f
                                        .env(env)
                                        .call(
                                                new ReferenceClassProperty(this, "arguments", env)
                                                        .arrayGet(env, "test"))
                                        .value());
                new ReferenceClassProperty(this, "arguments", env)
                        .arrayAccess(env, "test")
                        .set(
                                function_substr
                                        .f
                                        .env(env)
                                        .call(
                                                new ReferenceClassProperty(this, "arguments", env)
                                                        .arrayGet(env, "test"),
                                                0,
                                                NamespaceGlobal.strrpos
                                                        .env(env)
                                                        .call(
                                                                new ReferenceClassProperty(
                                                                                this,
                                                                                "arguments",
                                                                                env)
                                                                        .arrayGet(env, "test"),
                                                                ".")
                                                        .value())
                                        .value());
            }
        }

        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "arguments", env),
                env,
                "testSuffixes")) {
            new ReferenceClassProperty(this, "arguments", env)
                    .arrayAccess(env, "testSuffixes")
                    .set(ZVal.arrayFromList("Test.php", ".phpt"));
        }

        if (ZVal.isset(includePath)) {
            function_ini_set
                    .f
                    .env(env)
                    .call(
                            "include_path",
                            toStringR(includePath, env)
                                    + toStringR(":", env)
                                    + toStringR(
                                            function_ini_get
                                                    .f
                                                    .env(env)
                                                    .call("include_path")
                                                    .value(),
                                            env));
        }

        if (ZVal.strictNotEqualityCheck(
                new ReferenceClassProperty(this, "arguments", env).arrayGet(env, "loader"),
                "!==",
                ZVal.getNull())) {
            new ReferenceClassProperty(this, "arguments", env)
                    .arrayAccess(env, "loader")
                    .set(
                            this.handleLoader(
                                    env,
                                    new ReferenceClassProperty(this, "arguments", env)
                                            .arrayGet(env, "loader")));
        }

        if (ZVal.toBool(
                        arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "arguments", env),
                                env,
                                "configuration"))
                && ZVal.toBool(
                        function_is_dir
                                .f
                                .env(env)
                                .call(
                                        new ReferenceClassProperty(this, "arguments", env)
                                                .arrayGet(env, "configuration"))
                                .value())) {
            configurationFile =
                    toStringR(
                                    new ReferenceClassProperty(this, "arguments", env)
                                            .arrayGet(env, "configuration"),
                                    env)
                            + "/phpunit.xml";
            if (function_file_exists.f.env(env).call(configurationFile).getBool()) {
                new ReferenceClassProperty(this, "arguments", env)
                        .arrayAccess(env, "configuration")
                        .set(function_realpath.f.env(env).call(configurationFile).value());

            } else if (function_file_exists
                    .f
                    .env(env)
                    .call(toStringR(configurationFile, env) + ".dist")
                    .getBool()) {
                new ReferenceClassProperty(this, "arguments", env)
                        .arrayAccess(env, "configuration")
                        .set(
                                function_realpath
                                        .f
                                        .env(env)
                                        .call(toStringR(configurationFile, env) + ".dist")
                                        .value());
            }

        } else if (ZVal.toBool(
                        !arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "arguments", env),
                                env,
                                "configuration"))
                && ZVal.toBool(
                        new ReferenceClassProperty(this, "arguments", env)
                                .arrayGet(env, "useDefaultConfiguration"))) {
            if (function_file_exists.f.env(env).call("phpunit.xml").getBool()) {
                new ReferenceClassProperty(this, "arguments", env)
                        .arrayAccess(env, "configuration")
                        .set(function_realpath.f.env(env).call("phpunit.xml").value());

            } else if (function_file_exists.f.env(env).call("phpunit.xml.dist").getBool()) {
                new ReferenceClassProperty(this, "arguments", env)
                        .arrayAccess(env, "configuration")
                        .set(function_realpath.f.env(env).call("phpunit.xml.dist").value());
            }
        }

        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "arguments", env),
                env,
                "configuration")) {
            try {
                configuration =
                        Configuration.runtimeStaticObject.getInstance(
                                env,
                                new ReferenceClassProperty(this, "arguments", env)
                                        .arrayGet(env, "configuration"));
            } catch (ConvertedException convertedException158) {
                if (convertedException158.instanceOf(Throwable.class, "Throwable")) {
                    t = convertedException158.getObject();
                    env.echo(
                            toStringR(env.callMethod(t, "getMessage", Command.class), env)
                                    + toStringR("\n", env));
                    env.exit(TestRunner.CONST_FAILURE_EXIT);
                } else {
                    throw convertedException158;
                }
            }

            phpunitConfiguration.setObject(
                    env.callMethod(configuration, "getPHPUnitConfiguration", Command.class));
            env.callMethod(configuration, "handlePHPConfiguration", Command.class);
            if (arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "arguments", env),
                    env,
                    "bootstrap")) {
                this.handleBootstrap(
                        env,
                        new ReferenceClassProperty(this, "arguments", env)
                                .arrayGet(env, "bootstrap"));

            } else if (arrayActionR(ArrayAction.ISSET, phpunitConfiguration, env, "bootstrap")) {
                this.handleBootstrap(env, phpunitConfiguration.arrayGet(env, "bootstrap"));
            }

            if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, phpunitConfiguration, env, "stderr"))
                    && ZVal.toBool(
                            !arrayActionR(
                                    ArrayAction.ISSET,
                                    new ReferenceClassProperty(this, "arguments", env),
                                    env,
                                    "stderr"))) {
                new ReferenceClassProperty(this, "arguments", env)
                        .arrayAccess(env, "stderr")
                        .set(phpunitConfiguration.arrayGet(env, "stderr"));
            }

            if (ZVal.toBool(
                            ZVal.toBool(
                                            arrayActionR(
                                                    ArrayAction.ISSET,
                                                    phpunitConfiguration,
                                                    env,
                                                    "extensionsDirectory"))
                                    && ZVal.toBool(
                                            !arrayActionR(
                                                    ArrayAction.ISSET,
                                                    new ReferenceClassProperty(
                                                            this, "arguments", env),
                                                    env,
                                                    "noExtensions")))
                    && ZVal.toBool(function_extension_loaded.f.env(env).call("phar").value())) {
                this.handleExtensions(
                        env, phpunitConfiguration.arrayGet(env, "extensionsDirectory"));
            }

            if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, phpunitConfiguration, env, "columns"))
                    && ZVal.toBool(
                            !arrayActionR(
                                    ArrayAction.ISSET,
                                    new ReferenceClassProperty(this, "arguments", env),
                                    env,
                                    "columns"))) {
                new ReferenceClassProperty(this, "arguments", env)
                        .arrayAccess(env, "columns")
                        .set(phpunitConfiguration.arrayGet(env, "columns"));
            }

            if (ZVal.toBool(
                            !arrayActionR(
                                    ArrayAction.ISSET,
                                    new ReferenceClassProperty(this, "arguments", env),
                                    env,
                                    "printer"))
                    && ZVal.toBool(
                            arrayActionR(
                                    ArrayAction.ISSET,
                                    phpunitConfiguration,
                                    env,
                                    "printerClass"))) {
                if (arrayActionR(ArrayAction.ISSET, phpunitConfiguration, env, "printerFile")) {
                    file = ZVal.assign(phpunitConfiguration.arrayGet(env, "printerFile"));

                } else {
                    file = "";
                }

                new ReferenceClassProperty(this, "arguments", env)
                        .arrayAccess(env, "printer")
                        .set(
                                this.handlePrinter(
                                        env,
                                        phpunitConfiguration.arrayGet(env, "printerClass"),
                                        file));
            }

            if (arrayActionR(
                    ArrayAction.ISSET, phpunitConfiguration, env, "testSuiteLoaderClass")) {
                if (arrayActionR(
                        ArrayAction.ISSET, phpunitConfiguration, env, "testSuiteLoaderFile")) {
                    file = ZVal.assign(phpunitConfiguration.arrayGet(env, "testSuiteLoaderFile"));

                } else {
                    file = "";
                }

                new ReferenceClassProperty(this, "arguments", env)
                        .arrayAccess(env, "loader")
                        .set(
                                this.handleLoader(
                                        env,
                                        phpunitConfiguration.arrayGet(env, "testSuiteLoaderClass"),
                                        file));
            }

            if (ZVal.toBool(
                            !arrayActionR(
                                    ArrayAction.ISSET,
                                    new ReferenceClassProperty(this, "arguments", env),
                                    env,
                                    "testsuite"))
                    && ZVal.toBool(
                            arrayActionR(
                                    ArrayAction.ISSET,
                                    phpunitConfiguration,
                                    env,
                                    "defaultTestSuite"))) {
                new ReferenceClassProperty(this, "arguments", env)
                        .arrayAccess(env, "testsuite")
                        .set(phpunitConfiguration.arrayGet(env, "defaultTestSuite"));
            }

            if (!arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "arguments", env),
                    env,
                    "test")) {
                testSuite =
                        env.callMethod(
                                configuration,
                                "getTestSuiteConfiguration",
                                Command.class,
                                ZVal.isDefined(
                                                ternaryExpressionTemp =
                                                        new ReferenceClassProperty(
                                                                        this, "arguments", env)
                                                                .arrayGet(env, "testsuite"))
                                        ? ternaryExpressionTemp
                                        : "");
                if (ZVal.strictNotEqualityCheck(testSuite, "!==", ZVal.getNull())) {
                    new ReferenceClassProperty(this, "arguments", env)
                            .arrayAccess(env, "test")
                            .set(testSuite);
                }
            }

        } else if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "arguments", env),
                env,
                "bootstrap")) {
            this.handleBootstrap(
                    env,
                    new ReferenceClassProperty(this, "arguments", env).arrayGet(env, "bootstrap"));
        }

        if (ZVal.toBool(
                        arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "arguments", env),
                                env,
                                "printer"))
                && ZVal.toBool(
                        function_is_string
                                .f
                                .env(env)
                                .call(
                                        new ReferenceClassProperty(this, "arguments", env)
                                                .arrayGet(env, "printer"))
                                .value())) {
            new ReferenceClassProperty(this, "arguments", env)
                    .arrayAccess(env, "printer")
                    .set(
                            this.handlePrinter(
                                    env,
                                    new ReferenceClassProperty(this, "arguments", env)
                                            .arrayGet(env, "printer")));
        }

        if (ZVal.toBool(
                        ZVal.toBool(
                                        arrayActionR(
                                                ArrayAction.ISSET,
                                                new ReferenceClassProperty(this, "arguments", env),
                                                env,
                                                "test"))
                                && ZVal.toBool(
                                        function_is_string
                                                .f
                                                .env(env)
                                                .call(
                                                        new ReferenceClassProperty(
                                                                        this, "arguments", env)
                                                                .arrayGet(env, "test"))
                                                .value()))
                && ZVal.toBool(
                        ZVal.equalityCheck(
                                function_substr
                                        .f
                                        .env(env)
                                        .call(
                                                new ReferenceClassProperty(this, "arguments", env)
                                                        .arrayGet(env, "test"),
                                                -5,
                                                5)
                                        .value(),
                                ".phpt"))) {
            test =
                    new PhptTestCase(
                            env,
                            new ReferenceClassProperty(this, "arguments", env)
                                    .arrayGet(env, "test"));
            new ReferenceClassProperty(this, "arguments", env)
                    .arrayAccess(env, "test")
                    .set(new TestSuite(env));
            env.callMethod(
                    new ReferenceClassProperty(this, "arguments", env).arrayGet(env, "test"),
                    "addTest",
                    Command.class,
                    test);
        }

        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "arguments", env),
                env,
                "test")) {
            this.showHelp(env);
            env.exit(TestRunner.CONST_EXCEPTION_EXIT);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "loaderClass", typeHint = "string")
    @ConvertedParameter(index = 1, name = "loaderFile", typeHint = "string")
    protected Object handleLoader(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope48 scope = new Scope48();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/phpunit/phpunit/src/TextUI")
                            .setFile("/vendor/phpunit/phpunit/src/TextUI/Command.php");
            scope.loaderClass = assignParameter(args, 0, false);
            scope.loaderFile = assignParameter(args, 1, true);
            if (null == scope.loaderFile) {
                scope.loaderFile = "";
            }
            scope._pClass = null;
            if (!function_class_exists.f.env(env).call(scope.loaderClass, false).getBool()) {
                if (ZVal.equalityCheck(scope.loaderFile, "")) {
                    scope.loaderFile =
                            Filesystem.runtimeStaticObject.classNameToFilename(
                                    env, scope.loaderClass);
                }

                scope.loaderFile =
                        function_stream_resolve_include_path
                                .f
                                .env(env)
                                .call(scope.loaderFile)
                                .value();
                if (ZVal.isTrue(scope.loaderFile)) {
                    env.include(
                            toStringR(scope.loaderFile, env),
                            stack,
                            runtimeConverterFunctionClassConstants,
                            true,
                            false);
                }
            }

            if (function_class_exists.f.env(env).call(scope.loaderClass, false).getBool()) {
                scope._pClass = new ReflectionClass(env, scope.loaderClass);
                if (ZVal.toBool(
                                env.callMethod(
                                        scope._pClass,
                                        "implementsInterface",
                                        Command.class,
                                        TestSuiteLoader.CONST_class))
                        && ZVal.toBool(
                                env.callMethod(scope._pClass, "isInstantiable", Command.class))) {
                    throw new IncludeEventException(
                            ZVal.assign(
                                    env.callMethod(scope._pClass, "newInstance", Command.class)));
                }
            }

            if (ZVal.equalityCheck(scope.loaderClass, StandardTestSuiteLoader.CONST_class)) {
                throw new IncludeEventException(ZVal.assign(ZVal.getNull()));
            }

            this.exitWithErrorMessage(
                    env,
                    function_sprintf
                            .f
                            .env(env)
                            .call("Could not use \"%s\" as loader.", scope.loaderClass)
                            .value());
            throw new IncludeEventException(ZVal.assign(ZVal.getNull()));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "printerClass", typeHint = "string")
    @ConvertedParameter(index = 1, name = "printerFile", typeHint = "string")
    protected Object handlePrinter(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope49 scope = new Scope49();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/phpunit/phpunit/src/TextUI")
                            .setFile("/vendor/phpunit/phpunit/src/TextUI/Command.php");
            scope.printerClass = assignParameter(args, 0, false);
            scope.printerFile = assignParameter(args, 1, true);
            if (null == scope.printerFile) {
                scope.printerFile = "";
            }
            scope.outputStream = null;
            scope._pClass = null;
            if (!function_class_exists.f.env(env).call(scope.printerClass, false).getBool()) {
                if (ZVal.equalityCheck(scope.printerFile, "")) {
                    scope.printerFile =
                            Filesystem.runtimeStaticObject.classNameToFilename(
                                    env, scope.printerClass);
                }

                scope.printerFile =
                        function_stream_resolve_include_path
                                .f
                                .env(env)
                                .call(scope.printerFile)
                                .value();
                if (ZVal.isTrue(scope.printerFile)) {
                    env.include(
                            toStringR(scope.printerFile, env),
                            stack,
                            runtimeConverterFunctionClassConstants,
                            true,
                            false);
                }
            }

            if (!function_class_exists.f.env(env).call(scope.printerClass).getBool()) {
                this.exitWithErrorMessage(
                        env,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "Could not use \"%s\" as printer: class does not exist",
                                        scope.printerClass)
                                .value());
            }

            scope._pClass = new ReflectionClass(env, scope.printerClass);
            if (!ZVal.isTrue(
                    env.callMethod(
                            scope._pClass,
                            "implementsInterface",
                            Command.class,
                            TestListener.CONST_class))) {
                this.exitWithErrorMessage(
                        env,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "Could not use \"%s\" as printer: class does not implement %s",
                                        scope.printerClass, TestListener.CONST_class)
                                .value());
            }

            if (!ZVal.isTrue(
                    env.callMethod(
                            scope._pClass, "isSubclassOf", Command.class, Printer.CONST_class))) {
                this.exitWithErrorMessage(
                        env,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "Could not use \"%s\" as printer: class does not extend %s",
                                        scope.printerClass, Printer.CONST_class)
                                .value());
            }

            if (!ZVal.isTrue(env.callMethod(scope._pClass, "isInstantiable", Command.class))) {
                this.exitWithErrorMessage(
                        env,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "Could not use \"%s\" as printer: class cannot be instantiated",
                                        scope.printerClass)
                                .value());
            }

            if (ZVal.isTrue(
                    env.callMethod(
                            scope._pClass,
                            "isSubclassOf",
                            Command.class,
                            ResultPrinter.CONST_class))) {
                throw new IncludeEventException(ZVal.assign(scope.printerClass));
            }

            scope.outputStream =
                    ZVal.assign(
                            arrayActionR(
                                            ArrayAction.ISSET,
                                            new ReferenceClassProperty(
                                                    scope._thisVarAlias, "arguments", env),
                                            env,
                                            "stderr")
                                    ? "php://stderr"
                                    : ZVal.getNull());
            throw new IncludeEventException(
                    ZVal.assign(
                            env.callMethod(
                                    scope._pClass,
                                    "newInstance",
                                    Command.class,
                                    scope.outputStream)));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filename", typeHint = "string")
    protected Object handleBootstrap(RuntimeEnv env, Object... args) {
        Object filename = assignParameter(args, 0, false);
        Object e = null;
        try {
            FileLoader.runtimeStaticObject.checkAndLoad(env, filename);
        } catch (ConvertedException convertedException159) {
            if (convertedException159.instanceOf(
                    com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .PHPUnit
                            .namespaces
                            .Framework
                            .classes
                            .Exception
                            .class,
                    "PHPUnit\\Framework\\Exception")) {
                e = convertedException159.getObject();
                this.exitWithErrorMessage(env, env.callMethod(e, "getMessage", Command.class));
            } else {
                throw convertedException159;
            }
        }

        return null;
    }

    @ConvertedMethod
    protected Object handleVersionCheck(RuntimeEnv env, Object... args) {
        Object latestVersion = null;
        Object isOutdated = null;
        this.printVersionString(env);
        latestVersion =
                function_file_get_contents
                        .f
                        .env(env)
                        .call("https://phar.phpunit.de/latest-version-of/phpunit")
                        .value();
        isOutdated =
                NamespaceGlobal.version_compare
                        .env(env)
                        .call(
                                latestVersion,
                                com.project.convertedCode.globalNamespace.namespaces.PHPUnit
                                        .namespaces.Runner.classes.Version.runtimeStaticObject.id(
                                        env),
                                ">")
                        .value();
        if (ZVal.isTrue(isOutdated)) {
            NamespaceGlobal.printf
                    .env(env)
                    .call(
                            "You are not using the latest version of PHPUnit."
                                    + toStringR("\n", env)
                                    + "The latest version is PHPUnit %s."
                                    + toStringR("\n", env),
                            latestVersion);

        } else {
            env.echo("You are using the latest version of PHPUnit." + toStringR("\n", env));
        }

        env.exit(TestRunner.CONST_SUCCESS_EXIT);
        return null;
    }

    @ConvertedMethod
    protected Object showHelp(RuntimeEnv env, Object... args) {
        this.printVersionString(env);
        env.echo(ZVal.getResourceAsString("stringLiterals/stringLiteral2545.txt"));
        return null;
    }

    @ConvertedMethod
    protected Object handleCustomTestSuite(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    private Object printVersionString(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.versionStringPrinted)) {
            return null;
        }

        env.echo(
                toStringR(
                                com.project.convertedCode.globalNamespace.namespaces.PHPUnit
                                        .namespaces.Runner.classes.Version.runtimeStaticObject
                                        .getVersionString(env),
                                env)
                        + toStringR("\n", env)
                        + toStringR("\n", env));
        this.versionStringPrinted = true;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "string")
    private Object exitWithErrorMessage(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        this.printVersionString(env);
        env.echo(toStringR(message, env) + toStringR("\n", env));
        env.exit(TestRunner.CONST_FAILURE_EXIT);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory", typeHint = "string")
    private Object handleExtensions(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope50 scope = new Scope50();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/phpunit/phpunit/src/TextUI")
                            .setFile("/vendor/phpunit/phpunit/src/TextUI/Command.php");
            int runtimeConverterContinueCount;
            scope.directory = assignParameter(args, 0, false);
            scope.file = null;
            scope.e = null;
            scope.manifest = null;
            scope.facade = null;
            scope.version = null;
            scope.applicationName = null;
            scope.facade = new Facade(env);
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1235 :
                    ZVal.getIterable(
                            env.callMethod(
                                    scope.facade,
                                    "getFilesAsArray",
                                    Command.class,
                                    scope.directory,
                                    ".phar"),
                            env,
                            true)) {
                scope.file = ZVal.assign(zpairResult1235.getValue());
                if (!function_file_exists
                        .f
                        .env(env)
                        .call("phar://" + toStringR(scope.file, env) + "/manifest.xml")
                        .getBool()) {
                    new ReferenceClassProperty(scope._thisVarAlias, "arguments", env)
                            .arrayAppend(env, "notLoadedExtensions")
                            .set(toStringR(scope.file, env) + " is not an extension for PHPUnit");
                    continue;
                }

                try {
                    scope.applicationName = new ApplicationName(env, "phpunit/phpunit");
                    scope.version =
                            new com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .PharIo
                                    .namespaces
                                    .Version
                                    .classes
                                    .Version(
                                    env,
                                    com.project.convertedCode.globalNamespace.namespaces.PHPUnit
                                            .namespaces.Runner.classes.Version.runtimeStaticObject
                                            .series(env));
                    scope.manifest =
                            ManifestLoader.runtimeStaticObject.fromFile(
                                    env, "phar://" + toStringR(scope.file, env) + "/manifest.xml");
                    if (!ZVal.isTrue(
                            env.callMethod(
                                    scope.manifest,
                                    "isExtensionFor",
                                    Command.class,
                                    scope.applicationName))) {
                        new ReferenceClassProperty(scope._thisVarAlias, "arguments", env)
                                .arrayAppend(env, "notLoadedExtensions")
                                .set(
                                        toStringR(scope.file, env)
                                                + " is not an extension for PHPUnit");
                        continue;
                    }

                    if (!ZVal.isTrue(
                            env.callMethod(
                                    scope.manifest,
                                    "isExtensionFor",
                                    Command.class,
                                    scope.applicationName,
                                    scope.version))) {
                        new ReferenceClassProperty(scope._thisVarAlias, "arguments", env)
                                .arrayAppend(env, "notLoadedExtensions")
                                .set(
                                        toStringR(scope.file, env)
                                                + " is not compatible with this version of PHPUnit");
                        continue;
                    }

                } catch (ConvertedException convertedException160) {
                    if (convertedException160.instanceOf(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .PharIo
                                    .namespaces
                                    .Manifest
                                    .classes
                                    .Exception
                                    .class,
                            "PharIo\\Manifest\\Exception")) {
                        scope.e = convertedException160.getObject();
                        new ReferenceClassProperty(scope._thisVarAlias, "arguments", env)
                                .arrayAppend(env, "notLoadedExtensions")
                                .set(
                                        toStringR(scope.file, env)
                                                + ": "
                                                + toStringR(
                                                        env.callMethod(
                                                                scope.e,
                                                                "getMessage",
                                                                Command.class),
                                                        env));
                        continue;
                    } else {
                        throw convertedException160;
                    }
                }

                env.include(
                        toStringR(scope.file, env),
                        stack,
                        runtimeConverterFunctionClassConstants,
                        true,
                        false);
                new ReferenceClassProperty(scope._thisVarAlias, "arguments", env)
                        .arrayAppend(env, "loadedExtensions")
                        .set(
                                toStringR(
                                                env.callMethod(
                                                        scope.manifest, "getName", Command.class),
                                                env)
                                        + " "
                                        + toStringR(
                                                env.callMethod(
                                                        env.callMethod(
                                                                scope.manifest,
                                                                "getVersion",
                                                                Command.class),
                                                        "getVersionString",
                                                        Command.class),
                                                env));
            }

            throw new IncludeEventException(null);
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    @ConvertedParameter(index = 1, name = "exit", typeHint = "bool")
    private Object handleListGroups(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, false);
        Object exit = assignParameter(args, 1, false);
        Object groups = null;
        Object group = null;
        this.printVersionString(env);
        env.echo("Available test group(s):" + toStringR("\n", env));
        groups = env.callMethod(suite, "getGroups", Command.class);
        function_sort.f.env(env).call(groups);
        for (ZPair zpairResult1236 : ZVal.getIterable(groups, env, true)) {
            group = ZVal.assign(zpairResult1236.getValue());
            NamespaceGlobal.printf.env(env).call(" - %s" + toStringR("\n", env), group);
        }

        if (ZVal.isTrue(exit)) {
            env.exit(TestRunner.CONST_SUCCESS_EXIT);
        }

        return ZVal.assign(TestRunner.CONST_SUCCESS_EXIT);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exit", typeHint = "bool")
    private Object handleListSuites(RuntimeEnv env, Object... args) {
        Object exit = assignParameter(args, 0, false);
        Object configuration = null;
        Object suiteNames = null;
        Object suiteName = null;
        this.printVersionString(env);
        env.echo("Available test suite(s):" + toStringR("\n", env));
        configuration =
                Configuration.runtimeStaticObject.getInstance(
                        env,
                        new ReferenceClassProperty(this, "arguments", env)
                                .arrayGet(env, "configuration"));
        suiteNames = env.callMethod(configuration, "getTestSuiteNames", Command.class);
        for (ZPair zpairResult1237 : ZVal.getIterable(suiteNames, env, true)) {
            suiteName = ZVal.assign(zpairResult1237.getValue());
            NamespaceGlobal.printf.env(env).call(" - %s" + toStringR("\n", env), suiteName);
        }

        if (ZVal.isTrue(exit)) {
            env.exit(TestRunner.CONST_SUCCESS_EXIT);
        }

        return ZVal.assign(TestRunner.CONST_SUCCESS_EXIT);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    @ConvertedParameter(index = 1, name = "exit", typeHint = "bool")
    private Object handleListTests(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, false);
        Object exit = assignParameter(args, 1, false);
        Object renderer = null;
        this.printVersionString(env);
        renderer = new TextTestListRenderer(env);
        env.echo(env.callMethod(renderer, "render", Command.class, suite));
        if (ZVal.isTrue(exit)) {
            env.exit(TestRunner.CONST_SUCCESS_EXIT);
        }

        return ZVal.assign(TestRunner.CONST_SUCCESS_EXIT);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    @ConvertedParameter(index = 1, name = "target", typeHint = "string")
    @ConvertedParameter(index = 2, name = "exit", typeHint = "bool")
    private Object handleListTestsXml(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, false);
        Object target = assignParameter(args, 1, false);
        Object exit = assignParameter(args, 2, false);
        Object renderer = null;
        this.printVersionString(env);
        renderer = new XmlTestListRenderer(env);
        NamespaceGlobal.file_put_contents
                .env(env)
                .call(target, env.callMethod(renderer, "render", Command.class, suite));
        NamespaceGlobal.printf
                .env(env)
                .call(
                        "Wrote list of tests that would have been run to %s" + toStringR("\n", env),
                        target);
        if (ZVal.isTrue(exit)) {
            env.exit(TestRunner.CONST_SUCCESS_EXIT);
        }

        return ZVal.assign(TestRunner.CONST_SUCCESS_EXIT);
    }

    public static final Object CONST_class = "PHPUnit\\TextUI\\Command";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "exit",
            typeHint = "bool",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        public Object main(RuntimeEnv env, Object... args) {
            Object exit = assignParameter(args, 0, true);
            if (null == exit) {
                exit = true;
            }
            ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
            Object command = null;
            command = env.createNewWithLateStaticBindings(this);
            return ZVal.assign(
                    env.callMethod(
                            command, "run", Command.class, _SERVER.arrayGet(env, "argv"), exit));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\TextUI\\Command")
                    .setLookup(
                            Command.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "arguments", "longOptions", "options", "versionStringPrinted")
                    .setFilename("vendor/phpunit/phpunit/src/TextUI/Command.php")
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

    private static class Scope48 implements UpdateRuntimeScopeInterface {

        Object loaderClass;
        Object loaderFile;
        Object _thisVarAlias;
        Object _pClass;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("loaderClass", this.loaderClass);
            stack.setVariable("loaderFile", this.loaderFile);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("class", this._pClass);
        }

        public void updateScope(RuntimeStack stack) {

            this.loaderClass = stack.getVariable("loaderClass");
            this.loaderFile = stack.getVariable("loaderFile");
            this._thisVarAlias = stack.getVariable("this");
            this._pClass = stack.getVariable("class");
        }
    }

    private static class Scope49 implements UpdateRuntimeScopeInterface {

        Object printerClass;
        Object _thisVarAlias;
        Object outputStream;
        Object _pClass;
        Object printerFile;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("printerClass", this.printerClass);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("outputStream", this.outputStream);
            stack.setVariable("class", this._pClass);
            stack.setVariable("printerFile", this.printerFile);
        }

        public void updateScope(RuntimeStack stack) {

            this.printerClass = stack.getVariable("printerClass");
            this._thisVarAlias = stack.getVariable("this");
            this.outputStream = stack.getVariable("outputStream");
            this._pClass = stack.getVariable("class");
            this.printerFile = stack.getVariable("printerFile");
        }
    }

    private static class Scope50 implements UpdateRuntimeScopeInterface {

        Object file;
        Object e;
        Object manifest;
        Object _thisVarAlias;
        Object facade;
        Object version;
        Object directory;
        Object applicationName;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("file", this.file);
            stack.setVariable("e", this.e);
            stack.setVariable("manifest", this.manifest);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("facade", this.facade);
            stack.setVariable("version", this.version);
            stack.setVariable("directory", this.directory);
            stack.setVariable("applicationName", this.applicationName);
        }

        public void updateScope(RuntimeStack stack) {

            this.file = stack.getVariable("file");
            this.e = stack.getVariable("e");
            this.manifest = stack.getVariable("manifest");
            this._thisVarAlias = stack.getVariable("this");
            this.facade = stack.getVariable("facade");
            this.version = stack.getVariable("version");
            this.directory = stack.getVariable("directory");
            this.applicationName = stack.getVariable("applicationName");
        }
    }

    private enum SwitchEnumType66 {
        STRING___colors,
        STRING___bootstrap,
        STRING___columns,
        STRING_c,
        STRING___configuration,
        STRING___coverage_clover,
        STRING___coverage_crap4j,
        STRING___coverage_html,
        STRING___coverage_php,
        STRING___coverage_text,
        STRING___coverage_xml,
        STRING_d,
        STRING___debug,
        STRING_h,
        STRING___help,
        STRING___filter,
        STRING___testsuite,
        STRING___generate_configuration,
        STRING___group,
        STRING___exclude_group,
        STRING___test_suffix,
        STRING___include_path,
        STRING___list_groups,
        STRING___list_suites,
        STRING___list_tests,
        STRING___list_tests_xml,
        STRING___printer,
        STRING___loader,
        STRING___log_junit,
        STRING___log_teamcity,
        STRING___process_isolation,
        STRING___repeat,
        STRING___stderr,
        STRING___stop_on_error,
        STRING___stop_on_failure,
        STRING___stop_on_warning,
        STRING___stop_on_incomplete,
        STRING___stop_on_risky,
        STRING___stop_on_skipped,
        STRING___fail_on_warning,
        STRING___fail_on_risky,
        STRING___teamcity,
        STRING___testdox,
        STRING___testdox_group,
        STRING___testdox_exclude_group,
        STRING___testdox_html,
        STRING___testdox_text,
        STRING___testdox_xml,
        STRING___no_configuration,
        STRING___no_extensions,
        STRING___no_coverage,
        STRING___no_logging,
        STRING___globals_backup,
        STRING___static_backup,
        STRING_v,
        STRING___verbose,
        STRING___atleast_version,
        STRING___version,
        STRING___dont_report_useless_tests,
        STRING___strict_coverage,
        STRING___disable_coverage_ignore,
        STRING___strict_global_state,
        STRING___disallow_test_output,
        STRING___disallow_resource_usage,
        STRING___enforce_time_limit,
        STRING___disallow_todo_tests,
        STRING___reverse_list,
        STRING___check_version,
        STRING___whitelist,
        STRING___random_order,
        STRING___random_order_seed,
        STRING___resolve_dependencies,
        STRING___ignore_dependencies,
        STRING___reverse_order,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
