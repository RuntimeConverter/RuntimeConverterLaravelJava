package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.TextUI.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.namespaces.Filter.classes.IncludeGroupFilterIterator;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.AfterLastTestHook;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Configuration;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.StandardTestSuiteLoader;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Printer;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.TestHook;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.Comparator;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Environment.classes.Runtime;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestSuite;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Error.classes.Notice;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.Version;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Test;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestListener;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.TestSuiteSorter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.TextUI.classes.ResultPrinter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.TestDox.classes.HtmlResultPrinter;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.classes.Clover;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestResult;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.namespaces.Filter.classes.NameFilterIterator;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.TestDox.classes.TextResultPrinter;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.CodeCoverage;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Error.classes.Warning;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.namespaces.Filter.classes.Factory;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.BaseTestRunner;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Error.classes.Deprecated;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.Log.classes.JUnit;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.Log.classes.TeamCity;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.classes.PHP;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.TestDox.classes.XmlResultPrinter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.Hook;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.BeforeFirstTestHook;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.nativeFunctions.array.function_range;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.classes.Text;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.TestListenerAdapter;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.Filter;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.namespaces.Filter.classes.ExcludeGroupFilterIterator;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.classes.Crap4j;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/TextUI/TestRunner.php

*/

public class TestRunner extends BaseTestRunner {

    public Object codeCoverageFilter = null;

    public Object loader = null;

    public Object printer = null;

    public Object runtime = null;

    public Object messagePrinted = false;

    public Object extensions = ZVal.newArray();

    public TestRunner(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TestRunner.class) {
            this.__construct(env, args);
        }
    }

    public TestRunner(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "loader",
        typeHint = "PHPUnit\\Runner\\TestSuiteLoader",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "filter",
        typeHint = "SebastianBergmann\\CodeCoverage\\Filter",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object loader = assignParameter(args, 0, true);
        if (null == loader) {
            loader = ZVal.getNull();
        }
        Object filter = assignParameter(args, 1, true);
        if (null == filter) {
            filter = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(filter, "===", ZVal.getNull())) {
            filter = new Filter(env);
        }

        this.codeCoverageFilter = filter;
        this.loader = loader;
        this.runtime = new Runtime(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "exit",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object doRun(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, false);
        ReferenceContainer arguments = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == arguments.getObject()) {
            arguments.setObject(ZVal.newArray());
        }
        Object exit = assignParameter(args, 2, true);
        if (null == exit) {
            exit = true;
        }
        Object msg = null;
        ReferenceContainer extension = new BasicReferenceContainer(null);
        Object sorter = null;
        Object line = null;
        Object listener = null;
        ReferenceContainer dir = new BasicReferenceContainer(null);
        Object colors = null;
        Object result = null;
        ReferenceContainer GLOBALS = new GlobalVariableReference(env, "GLOBALS");
        Object file = null;
        Object whitelistFromOption = null;
        Object codeCoverage = null;
        Object outputStream = null;
        Object listenerNeeded = null;
        Object _pClass = null;
        Object _suite = null;
        Object printerClass = null;
        Object e = null;
        Object runtime = null;
        ReferenceContainer codeCoverageReports = new BasicReferenceContainer(null);
        Object processor = null;
        Object step = null;
        Object writer = null;
        ReferenceContainer filterConfiguration = new BasicReferenceContainer(null);
        Object errors = null;
        Object whitelistFromConfigurationFile = null;
        if (arrayActionR(ArrayAction.ISSET, arguments, env, "configuration")) {
            GLOBALS.arrayAccess(env, "__PHPUNIT_CONFIGURATION_FILE")
                    .set(arguments.arrayGet(env, "configuration"));
        }

        env.callMethod(
                this,
                new RuntimeArgsWithReferences().add(0, arguments),
                "handleConfiguration",
                TestRunner.class,
                arguments.getObject());
        this.processSuiteFilters(env, suite, arguments.getObject());
        if (arrayActionR(ArrayAction.ISSET, arguments, env, "bootstrap")) {
            GLOBALS.arrayAccess(env, "__PHPUNIT_BOOTSTRAP")
                    .set(arguments.arrayGet(env, "bootstrap"));
        }

        if (ZVal.strictEqualityCheck(arguments.arrayGet(env, "backupGlobals"), "===", true)) {
            env.callMethod(suite, "setBackupGlobals", TestRunner.class, true);
        }

        if (ZVal.strictEqualityCheck(
                arguments.arrayGet(env, "backupStaticAttributes"), "===", true)) {
            env.callMethod(suite, "setBackupStaticAttributes", TestRunner.class, true);
        }

        if (ZVal.strictEqualityCheck(
                arguments.arrayGet(env, "beStrictAboutChangesToGlobalState"), "===", true)) {
            env.callMethod(suite, "setBeStrictAboutChangesToGlobalState", TestRunner.class, true);
        }

        if (ZVal.strictEqualityCheck(
                arguments.arrayGet(env, "executionOrder"),
                "===",
                TestSuiteSorter.CONST_ORDER_RANDOMIZED)) {
            NamespaceGlobal.mt_srand.env(env).call(arguments.arrayGet(env, "randomOrderSeed"));
        }

        if (ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                arguments.arrayGet(env, "executionOrder"),
                                "!==",
                                TestSuiteSorter.CONST_ORDER_DEFAULT))
                || ZVal.toBool(arguments.arrayGet(env, "resolveDependencies"))) {
            sorter = new TestSuiteSorter(env);
            env.callMethod(
                    sorter,
                    "reorderTestsInSuite",
                    TestRunner.class,
                    suite,
                    arguments.arrayGet(env, "executionOrder"),
                    arguments.arrayGet(env, "resolveDependencies"));
            sorter = null;
        }

        if (ZVal.toBool(function_is_int.f.env(env).call(arguments.arrayGet(env, "repeat")).value())
                && ZVal.toBool(ZVal.isGreaterThan(arguments.arrayGet(env, "repeat"), '>', 0))) {
            _suite = new TestSuite(env);
            for (ZPair zpairResult1241 :
                    ZVal.getIterable(
                            function_range
                                    .f
                                    .env(env)
                                    .call(1, arguments.arrayGet(env, "repeat"))
                                    .value(),
                            env,
                            true)) {
                step = ZVal.assign(zpairResult1241.getValue());
                env.callMethod(_suite, "addTest", TestRunner.class, suite);
            }

            suite = ZVal.assign(_suite);
            _suite = null;
        }

        result = this.createTestResult(env);
        listener = new TestListenerAdapter(env);
        listenerNeeded = false;
        for (ZPair zpairResult1242 : ZVal.getIterable(this.extensions, env, true)) {
            extension.setObject(ZVal.assign(zpairResult1242.getValue()));
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            extension.getObject(), TestHook.class, "PHPUnit\\Runner\\TestHook"))) {
                env.callMethod(
                        listener,
                        new RuntimeArgsWithReferences().add(0, extension),
                        "add",
                        TestRunner.class,
                        extension.getObject());
                listenerNeeded = true;
            }
        }

        if (ZVal.isTrue(listenerNeeded)) {
            env.callMethod(result, "addListener", TestRunner.class, listener);
        }

        listener = null;
        listenerNeeded = null;
        if (!ZVal.isTrue(arguments.arrayGet(env, "convertErrorsToExceptions"))) {
            env.callMethod(result, "convertErrorsToExceptions", TestRunner.class, false);
        }

        if (!ZVal.isTrue(arguments.arrayGet(env, "convertDeprecationsToExceptions"))) {
            env.getRequestStaticProperties(Deprecated.RequestStaticProperties.class).enabled =
                    false;
        }

        if (!ZVal.isTrue(arguments.arrayGet(env, "convertNoticesToExceptions"))) {
            env.getRequestStaticProperties(Notice.RequestStaticProperties.class).enabled = false;
        }

        if (!ZVal.isTrue(arguments.arrayGet(env, "convertWarningsToExceptions"))) {
            env.getRequestStaticProperties(Warning.RequestStaticProperties.class).enabled = false;
        }

        if (ZVal.isTrue(arguments.arrayGet(env, "stopOnError"))) {
            env.callMethod(result, "stopOnError", TestRunner.class, true);
        }

        if (ZVal.isTrue(arguments.arrayGet(env, "stopOnFailure"))) {
            env.callMethod(result, "stopOnFailure", TestRunner.class, true);
        }

        if (ZVal.isTrue(arguments.arrayGet(env, "stopOnWarning"))) {
            env.callMethod(result, "stopOnWarning", TestRunner.class, true);
        }

        if (ZVal.isTrue(arguments.arrayGet(env, "stopOnIncomplete"))) {
            env.callMethod(result, "stopOnIncomplete", TestRunner.class, true);
        }

        if (ZVal.isTrue(arguments.arrayGet(env, "stopOnRisky"))) {
            env.callMethod(result, "stopOnRisky", TestRunner.class, true);
        }

        if (ZVal.isTrue(arguments.arrayGet(env, "stopOnSkipped"))) {
            env.callMethod(result, "stopOnSkipped", TestRunner.class, true);
        }

        if (ZVal.isTrue(
                arguments.arrayGet(env, "registerMockObjectsFromTestArgumentsRecursively"))) {
            env.callMethod(
                    result,
                    "setRegisterMockObjectsFromTestArgumentsRecursively",
                    TestRunner.class,
                    true);
        }

        if (ZVal.strictEqualityCheck(this.printer, "===", ZVal.getNull())) {
            if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, arguments, env, "printer"))
                    && ZVal.toBool(
                            ZVal.checkInstanceType(
                                    arguments.arrayGet(env, "printer"),
                                    Printer.class,
                                    "PHPUnit\\Util\\Printer"))) {
                this.printer = arguments.arrayGet(env, "printer");

            } else {
                printerClass = ZVal.assign(ResultPrinter.CONST_class);
                if (ZVal.toBool(
                                ZVal.toBool(
                                                arrayActionR(
                                                        ArrayAction.ISSET,
                                                        arguments,
                                                        env,
                                                        "printer"))
                                        && ZVal.toBool(
                                                function_is_string
                                                        .f
                                                        .env(env)
                                                        .call(arguments.arrayGet(env, "printer"))
                                                        .value()))
                        && ZVal.toBool(
                                function_class_exists
                                        .f
                                        .env(env)
                                        .call(arguments.arrayGet(env, "printer"), false)
                                        .value())) {
                    _pClass = new ReflectionClass(env, arguments.arrayGet(env, "printer"));
                    if (ZVal.isTrue(
                            env.callMethod(
                                    _pClass,
                                    "isSubclassOf",
                                    TestRunner.class,
                                    ResultPrinter.CONST_class))) {
                        printerClass = ZVal.assign(arguments.arrayGet(env, "printer"));
                    }
                }

                this.printer =
                        env.createNew(
                                printerClass,
                                ZVal.toBool(
                                                        arrayActionR(
                                                                ArrayAction.ISSET,
                                                                arguments,
                                                                env,
                                                                "stderr"))
                                                && ZVal.toBool(
                                                        ZVal.strictEqualityCheck(
                                                                arguments.arrayGet(env, "stderr"),
                                                                "===",
                                                                true))
                                        ? "php://stderr"
                                        : ZVal.getNull(),
                                arguments.arrayGet(env, "verbose"),
                                arguments.arrayGet(env, "colors"),
                                arguments.arrayGet(env, "debug"),
                                arguments.arrayGet(env, "columns"),
                                arguments.arrayGet(env, "reverseList"));
            }
        }

        env.callMethod(
                this.printer,
                "write",
                TestRunner.class,
                toStringR(Version.runtimeStaticObject.getVersionString(env), env) + "\n");
        env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .PHPUnit
                                        .namespaces
                                        .TextUI
                                        .classes
                                        .TestRunner
                                        .RequestStaticProperties
                                        .class)
                        .versionStringPrinted =
                true;
        if (ZVal.isTrue(arguments.arrayGet(env, "verbose"))) {
            runtime = env.callMethod(this.runtime, "getNameWithVersion", TestRunner.class);
            if (ZVal.isTrue(env.callMethod(this.runtime, "hasXdebug", TestRunner.class))) {
                runtime =
                        toStringR(runtime, env)
                                + toStringR(
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        " with Xdebug %s",
                                                        NamespaceGlobal.phpversion
                                                                .env(env)
                                                                .call("xdebug")
                                                                .value())
                                                .value(),
                                        env);
            }

            this.writeMessage(env, "Runtime", runtime);
            if (ZVal.strictEqualityCheck(
                    arguments.arrayGet(env, "executionOrder"),
                    "===",
                    TestSuiteSorter.CONST_ORDER_RANDOMIZED)) {
                this.writeMessage(env, "Random seed", arguments.arrayGet(env, "randomOrderSeed"));
            }

            if (arrayActionR(ArrayAction.ISSET, arguments, env, "configuration")) {
                this.writeMessage(
                        env,
                        "Configuration",
                        env.callMethod(
                                arguments.arrayGet(env, "configuration"),
                                "getFilename",
                                TestRunner.class));
            }

            for (ZPair zpairResult1243 :
                    ZVal.getIterable(arguments.arrayGet(env, "loadedExtensions"), env, true)) {
                extension.setObject(ZVal.assign(zpairResult1243.getValue()));
                this.writeMessage(env, "Extension", extension.getObject());
            }

            for (ZPair zpairResult1244 :
                    ZVal.getIterable(arguments.arrayGet(env, "notLoadedExtensions"), env, true)) {
                extension.setObject(ZVal.assign(zpairResult1244.getValue()));
                this.writeMessage(env, "Extension", extension.getObject());
            }
        }

        if (ZVal.isTrue(env.callMethod(this.runtime, "discardsComments", TestRunner.class))) {
            this.writeMessage(
                    env, "Warning", "opcache.save_comments=0 set; annotations will not work");
        }

        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, arguments, env, "configuration"))
                && ZVal.toBool(
                        env.callMethod(
                                arguments.arrayGet(env, "configuration"),
                                "hasValidationErrors",
                                TestRunner.class))) {
            this.write(
                    env,
                    "\n  Warning - The configuration file did not pass validation!\n  The following problems have been detected:\n");
            for (ZPair zpairResult1245 :
                    ZVal.getIterable(
                            env.callMethod(
                                    arguments.arrayGet(env, "configuration"),
                                    "getValidationErrors",
                                    TestRunner.class),
                            env,
                            false)) {
                line = ZVal.assign(zpairResult1245.getKey());
                errors = ZVal.assign(zpairResult1245.getValue());
                this.write(env, function_sprintf.f.env(env).call("\n  Line %d:\n", line).value());
                for (ZPair zpairResult1246 : ZVal.getIterable(errors, env, true)) {
                    msg = ZVal.assign(zpairResult1246.getValue());
                    this.write(env, function_sprintf.f.env(env).call("  - %s\n", msg).value());
                }
            }

            this.write(env, "\n  Test results may not be as expected.\n\n");
        }

        for (ZPair zpairResult1247 :
                ZVal.getIterable(arguments.arrayGet(env, "listeners"), env, true)) {
            listener = ZVal.assign(zpairResult1247.getValue());
            env.callMethod(result, "addListener", TestRunner.class, listener);
        }

        env.callMethod(result, "addListener", TestRunner.class, this.printer);
        codeCoverageReports.setObject(0);
        if (!arrayActionR(ArrayAction.ISSET, arguments, env, "noLogging")) {
            if (arrayActionR(ArrayAction.ISSET, arguments, env, "testdoxHTMLFile")) {
                env.callMethod(
                        result,
                        "addListener",
                        TestRunner.class,
                        new HtmlResultPrinter(
                                env,
                                arguments.arrayGet(env, "testdoxHTMLFile"),
                                arguments.arrayGet(env, "testdoxGroups"),
                                arguments.arrayGet(env, "testdoxExcludeGroups")));
            }

            if (arrayActionR(ArrayAction.ISSET, arguments, env, "testdoxTextFile")) {
                env.callMethod(
                        result,
                        "addListener",
                        TestRunner.class,
                        new TextResultPrinter(
                                env,
                                arguments.arrayGet(env, "testdoxTextFile"),
                                arguments.arrayGet(env, "testdoxGroups"),
                                arguments.arrayGet(env, "testdoxExcludeGroups")));
            }

            if (arrayActionR(ArrayAction.ISSET, arguments, env, "testdoxXMLFile")) {
                env.callMethod(
                        result,
                        "addListener",
                        TestRunner.class,
                        new XmlResultPrinter(env, arguments.arrayGet(env, "testdoxXMLFile")));
            }

            if (arrayActionR(ArrayAction.ISSET, arguments, env, "teamcityLogfile")) {
                env.callMethod(
                        result,
                        "addListener",
                        TestRunner.class,
                        new TeamCity(env, arguments.arrayGet(env, "teamcityLogfile")));
            }

            if (arrayActionR(ArrayAction.ISSET, arguments, env, "junitLogfile")) {
                env.callMethod(
                        result,
                        "addListener",
                        TestRunner.class,
                        new JUnit(
                                env,
                                arguments.arrayGet(env, "junitLogfile"),
                                arguments.arrayGet(env, "reportUselessTests")));
            }

            if (arrayActionR(ArrayAction.ISSET, arguments, env, "coverageClover")) {
                codeCoverageReports.setObject(ZVal.increment(codeCoverageReports.getObject()));
            }

            if (arrayActionR(ArrayAction.ISSET, arguments, env, "coverageCrap4J")) {
                codeCoverageReports.setObject(ZVal.increment(codeCoverageReports.getObject()));
            }

            if (arrayActionR(ArrayAction.ISSET, arguments, env, "coverageHtml")) {
                codeCoverageReports.setObject(ZVal.increment(codeCoverageReports.getObject()));
            }

            if (arrayActionR(ArrayAction.ISSET, arguments, env, "coveragePHP")) {
                codeCoverageReports.setObject(ZVal.increment(codeCoverageReports.getObject()));
            }

            if (arrayActionR(ArrayAction.ISSET, arguments, env, "coverageText")) {
                codeCoverageReports.setObject(ZVal.increment(codeCoverageReports.getObject()));
            }

            if (arrayActionR(ArrayAction.ISSET, arguments, env, "coverageXml")) {
                codeCoverageReports.setObject(ZVal.increment(codeCoverageReports.getObject()));
            }
        }

        if (arrayActionR(ArrayAction.ISSET, arguments, env, "noCoverage")) {
            codeCoverageReports.setObject(0);
        }

        if (ZVal.toBool(ZVal.isGreaterThan(codeCoverageReports.getObject(), '>', 0))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        this.runtime,
                                        "canCollectCodeCoverage",
                                        TestRunner.class)))) {
            this.writeMessage(env, "Error", "No code coverage driver is available");
            codeCoverageReports.setObject(0);
        }

        if (ZVal.isGreaterThan(codeCoverageReports.getObject(), '>', 0)) {
            codeCoverage = new CodeCoverage(env, ZVal.getNull(), this.codeCoverageFilter);
            env.callMethod(
                    codeCoverage,
                    "setUnintentionallyCoveredSubclassesWhitelist",
                    TestRunner.class,
                    ZVal.newArray(new ZPair(0, Comparator.CONST_class)));
            env.callMethod(
                    codeCoverage,
                    "setCheckForUnintentionallyCoveredCode",
                    TestRunner.class,
                    arguments.arrayGet(env, "strictCoverage"));
            env.callMethod(
                    codeCoverage,
                    "setCheckForMissingCoversAnnotation",
                    TestRunner.class,
                    arguments.arrayGet(env, "strictCoverage"));
            if (arrayActionR(ArrayAction.ISSET, arguments, env, "forceCoversAnnotation")) {
                env.callMethod(
                        codeCoverage,
                        "setForceCoversAnnotation",
                        TestRunner.class,
                        arguments.arrayGet(env, "forceCoversAnnotation"));
            }

            if (arrayActionR(
                    ArrayAction.ISSET,
                    arguments,
                    env,
                    "ignoreDeprecatedCodeUnitsFromCodeCoverage")) {
                env.callMethod(
                        codeCoverage,
                        "setIgnoreDeprecatedCode",
                        TestRunner.class,
                        arguments.arrayGet(env, "ignoreDeprecatedCodeUnitsFromCodeCoverage"));
            }

            if (arrayActionR(ArrayAction.ISSET, arguments, env, "disableCodeCoverageIgnore")) {
                env.callMethod(codeCoverage, "setDisableIgnoredLines", TestRunner.class, true);
            }

            whitelistFromConfigurationFile = false;
            whitelistFromOption = false;
            if (arrayActionR(ArrayAction.ISSET, arguments, env, "whitelist")) {
                env.callMethod(
                        this.codeCoverageFilter,
                        "addDirectoryToWhitelist",
                        TestRunner.class,
                        arguments.arrayGet(env, "whitelist"));
                whitelistFromOption = true;
            }

            if (arrayActionR(ArrayAction.ISSET, arguments, env, "configuration")) {
                filterConfiguration.setObject(
                        env.callMethod(
                                arguments.arrayGet(env, "configuration"),
                                "getFilterConfiguration",
                                TestRunner.class));
                if (!arrayActionR(ArrayAction.EMPTY, filterConfiguration, env, "whitelist")) {
                    whitelistFromConfigurationFile = true;
                }

                if (!arrayActionR(ArrayAction.EMPTY, filterConfiguration, env, "whitelist")) {
                    env.callMethod(
                            codeCoverage,
                            "setAddUncoveredFilesFromWhitelist",
                            TestRunner.class,
                            filterConfiguration.arrayGet(
                                    env, "whitelist", "addUncoveredFilesFromWhitelist"));
                    env.callMethod(
                            codeCoverage,
                            "setProcessUncoveredFilesFromWhitelist",
                            TestRunner.class,
                            filterConfiguration.arrayGet(
                                    env, "whitelist", "processUncoveredFilesFromWhitelist"));
                    for (ZPair zpairResult1248 :
                            ZVal.getIterable(
                                    filterConfiguration.arrayGet(
                                            env, "whitelist", "include", "directory"),
                                    env,
                                    true)) {
                        dir.setObject(ZVal.assign(zpairResult1248.getValue()));
                        env.callMethod(
                                this.codeCoverageFilter,
                                "addDirectoryToWhitelist",
                                TestRunner.class,
                                dir.arrayGet(env, "path"),
                                dir.arrayGet(env, "suffix"),
                                dir.arrayGet(env, "prefix"));
                    }

                    for (ZPair zpairResult1249 :
                            ZVal.getIterable(
                                    filterConfiguration.arrayGet(
                                            env, "whitelist", "include", "file"),
                                    env,
                                    true)) {
                        file = ZVal.assign(zpairResult1249.getValue());
                        env.callMethod(
                                this.codeCoverageFilter,
                                "addFileToWhitelist",
                                TestRunner.class,
                                file);
                    }

                    for (ZPair zpairResult1250 :
                            ZVal.getIterable(
                                    filterConfiguration.arrayGet(
                                            env, "whitelist", "exclude", "directory"),
                                    env,
                                    true)) {
                        dir.setObject(ZVal.assign(zpairResult1250.getValue()));
                        env.callMethod(
                                this.codeCoverageFilter,
                                "removeDirectoryFromWhitelist",
                                TestRunner.class,
                                dir.arrayGet(env, "path"),
                                dir.arrayGet(env, "suffix"),
                                dir.arrayGet(env, "prefix"));
                    }

                    for (ZPair zpairResult1251 :
                            ZVal.getIterable(
                                    filterConfiguration.arrayGet(
                                            env, "whitelist", "exclude", "file"),
                                    env,
                                    true)) {
                        file = ZVal.assign(zpairResult1251.getValue());
                        env.callMethod(
                                this.codeCoverageFilter,
                                "removeFileFromWhitelist",
                                TestRunner.class,
                                file);
                    }
                }
            }

            if (!ZVal.isTrue(
                    env.callMethod(this.codeCoverageFilter, "hasWhitelist", TestRunner.class))) {
                if (ZVal.toBool(!ZVal.isTrue(whitelistFromConfigurationFile))
                        && ZVal.toBool(!ZVal.isTrue(whitelistFromOption))) {
                    this.writeMessage(
                            env,
                            "Error",
                            "No whitelist is configured, no code coverage will be generated.");

                } else {
                    this.writeMessage(
                            env,
                            "Error",
                            "Incorrect whitelist config, no code coverage will be generated.");
                }

                codeCoverageReports.setObject(0);
                codeCoverage = null;
            }
        }

        env.callMethod(this.printer, "write", TestRunner.class, "\n");
        if (ZVal.isset(codeCoverage)) {
            env.callMethod(result, "setCodeCoverage", TestRunner.class, codeCoverage);
            if (ZVal.toBool(ZVal.isGreaterThan(codeCoverageReports.getObject(), '>', 1))
                    && ZVal.toBool(
                            arrayActionR(ArrayAction.ISSET, arguments, env, "cacheTokens"))) {
                env.callMethod(
                        codeCoverage,
                        "setCacheTokens",
                        TestRunner.class,
                        arguments.arrayGet(env, "cacheTokens"));
            }
        }

        env.callMethod(
                result,
                "beStrictAboutTestsThatDoNotTestAnything",
                TestRunner.class,
                arguments.arrayGet(env, "reportUselessTests"));
        env.callMethod(
                result,
                "beStrictAboutOutputDuringTests",
                TestRunner.class,
                arguments.arrayGet(env, "disallowTestOutput"));
        env.callMethod(
                result,
                "beStrictAboutTodoAnnotatedTests",
                TestRunner.class,
                arguments.arrayGet(env, "disallowTodoAnnotatedTests"));
        env.callMethod(
                result,
                "beStrictAboutResourceUsageDuringSmallTests",
                TestRunner.class,
                arguments.arrayGet(env, "beStrictAboutResourceUsageDuringSmallTests"));
        env.callMethod(
                result,
                "enforceTimeLimit",
                TestRunner.class,
                arguments.arrayGet(env, "enforceTimeLimit"));
        env.callMethod(
                result,
                "setTimeoutForSmallTests",
                TestRunner.class,
                arguments.arrayGet(env, "timeoutForSmallTests"));
        env.callMethod(
                result,
                "setTimeoutForMediumTests",
                TestRunner.class,
                arguments.arrayGet(env, "timeoutForMediumTests"));
        env.callMethod(
                result,
                "setTimeoutForLargeTests",
                TestRunner.class,
                arguments.arrayGet(env, "timeoutForLargeTests"));
        if (ZVal.isTrue(
                ZVal.checkInstanceType(suite, TestSuite.class, "PHPUnit\\Framework\\TestSuite"))) {
            env.callMethod(
                    suite,
                    "setRunTestInSeparateProcess",
                    TestRunner.class,
                    arguments.arrayGet(env, "processIsolation"));
        }

        for (ZPair zpairResult1252 : ZVal.getIterable(this.extensions, env, true)) {
            extension.setObject(ZVal.assign(zpairResult1252.getValue()));
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            extension.getObject(),
                            BeforeFirstTestHook.class,
                            "PHPUnit\\Runner\\BeforeFirstTestHook"))) {
                env.callMethod(extension.getObject(), "executeBeforeFirstTest", TestRunner.class);
            }
        }

        env.callMethod(suite, "run", TestRunner.class, result);
        for (ZPair zpairResult1253 : ZVal.getIterable(this.extensions, env, true)) {
            extension.setObject(ZVal.assign(zpairResult1253.getValue()));
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            extension.getObject(),
                            AfterLastTestHook.class,
                            "PHPUnit\\Runner\\AfterLastTestHook"))) {
                env.callMethod(extension.getObject(), "executeAfterLastTest", TestRunner.class);
            }
        }

        env.callMethod(result, "flushListeners", TestRunner.class);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        this.printer, ResultPrinter.class, "PHPUnit\\TextUI\\ResultPrinter"))) {
            env.callMethod(this.printer, "printResult", TestRunner.class, result);
        }

        if (ZVal.isset(codeCoverage)) {
            if (arrayActionR(ArrayAction.ISSET, arguments, env, "coverageClover")) {
                env.callMethod(
                        this.printer,
                        "write",
                        TestRunner.class,
                        "\nGenerating code coverage report in Clover XML format ...");
                try {
                    writer = new Clover(env);
                    env.callMethod(
                            writer,
                            "process",
                            TestRunner.class,
                            codeCoverage,
                            arguments.arrayGet(env, "coverageClover"));
                    env.callMethod(this.printer, "write", TestRunner.class, " done\n");
                    writer = null;
                } catch (ConvertedException convertedException161) {
                    if (convertedException161.instanceOf(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .SebastianBergmann
                                    .namespaces
                                    .CodeCoverage
                                    .classes
                                    .Exception
                                    .class,
                            "SebastianBergmann\\CodeCoverage\\Exception")) {
                        e = convertedException161.getObject();
                        env.callMethod(
                                this.printer,
                                "write",
                                TestRunner.class,
                                " failed\n"
                                        + toStringR(
                                                env.callMethod(e, "getMessage", TestRunner.class),
                                                env)
                                        + "\n");
                    } else {
                        throw convertedException161;
                    }
                }
            }

            if (arrayActionR(ArrayAction.ISSET, arguments, env, "coverageCrap4J")) {
                env.callMethod(
                        this.printer,
                        "write",
                        TestRunner.class,
                        "\nGenerating Crap4J report XML file ...");
                try {
                    writer = new Crap4j(env, arguments.arrayGet(env, "crap4jThreshold"));
                    env.callMethod(
                            writer,
                            "process",
                            TestRunner.class,
                            codeCoverage,
                            arguments.arrayGet(env, "coverageCrap4J"));
                    env.callMethod(this.printer, "write", TestRunner.class, " done\n");
                    writer = null;
                } catch (ConvertedException convertedException162) {
                    if (convertedException162.instanceOf(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .SebastianBergmann
                                    .namespaces
                                    .CodeCoverage
                                    .classes
                                    .Exception
                                    .class,
                            "SebastianBergmann\\CodeCoverage\\Exception")) {
                        e = convertedException162.getObject();
                        env.callMethod(
                                this.printer,
                                "write",
                                TestRunner.class,
                                " failed\n"
                                        + toStringR(
                                                env.callMethod(e, "getMessage", TestRunner.class),
                                                env)
                                        + "\n");
                    } else {
                        throw convertedException162;
                    }
                }
            }

            if (arrayActionR(ArrayAction.ISSET, arguments, env, "coverageHtml")) {
                env.callMethod(
                        this.printer,
                        "write",
                        TestRunner.class,
                        "\nGenerating code coverage report in HTML format ...");
                try {
                    writer =
                            new com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .SebastianBergmann
                                    .namespaces
                                    .CodeCoverage
                                    .namespaces
                                    .Report
                                    .namespaces
                                    .Html
                                    .classes
                                    .Facade(
                                    env,
                                    arguments.arrayGet(env, "reportLowUpperBound"),
                                    arguments.arrayGet(env, "reportHighLowerBound"),
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    " and <a href=\"https://phpunit.de/\">PHPUnit %s</a>",
                                                    Version.runtimeStaticObject.id(env))
                                            .value());
                    env.callMethod(
                            writer,
                            "process",
                            TestRunner.class,
                            codeCoverage,
                            arguments.arrayGet(env, "coverageHtml"));
                    env.callMethod(this.printer, "write", TestRunner.class, " done\n");
                    writer = null;
                } catch (ConvertedException convertedException163) {
                    if (convertedException163.instanceOf(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .SebastianBergmann
                                    .namespaces
                                    .CodeCoverage
                                    .classes
                                    .Exception
                                    .class,
                            "SebastianBergmann\\CodeCoverage\\Exception")) {
                        e = convertedException163.getObject();
                        env.callMethod(
                                this.printer,
                                "write",
                                TestRunner.class,
                                " failed\n"
                                        + toStringR(
                                                env.callMethod(e, "getMessage", TestRunner.class),
                                                env)
                                        + "\n");
                    } else {
                        throw convertedException163;
                    }
                }
            }

            if (arrayActionR(ArrayAction.ISSET, arguments, env, "coveragePHP")) {
                env.callMethod(
                        this.printer,
                        "write",
                        TestRunner.class,
                        "\nGenerating code coverage report in PHP format ...");
                try {
                    writer = new PHP(env);
                    env.callMethod(
                            writer,
                            "process",
                            TestRunner.class,
                            codeCoverage,
                            arguments.arrayGet(env, "coveragePHP"));
                    env.callMethod(this.printer, "write", TestRunner.class, " done\n");
                    writer = null;
                } catch (ConvertedException convertedException164) {
                    if (convertedException164.instanceOf(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .SebastianBergmann
                                    .namespaces
                                    .CodeCoverage
                                    .classes
                                    .Exception
                                    .class,
                            "SebastianBergmann\\CodeCoverage\\Exception")) {
                        e = convertedException164.getObject();
                        env.callMethod(
                                this.printer,
                                "write",
                                TestRunner.class,
                                " failed\n"
                                        + toStringR(
                                                env.callMethod(e, "getMessage", TestRunner.class),
                                                env)
                                        + "\n");
                    } else {
                        throw convertedException164;
                    }
                }
            }

            if (arrayActionR(ArrayAction.ISSET, arguments, env, "coverageText")) {
                if (ZVal.equalityCheck(arguments.arrayGet(env, "coverageText"), "php://stdout")) {
                    outputStream = ZVal.assign(this.printer);
                    colors =
                            ZVal.toBool(arguments.arrayGet(env, "colors"))
                                    && ZVal.toBool(
                                            ZVal.notEqualityCheck(
                                                    arguments.arrayGet(env, "colors"),
                                                    ResultPrinter.CONST_COLOR_NEVER));

                } else {
                    outputStream = new Printer(env, arguments.arrayGet(env, "coverageText"));
                    colors = false;
                }

                processor =
                        new Text(
                                env,
                                arguments.arrayGet(env, "reportLowUpperBound"),
                                arguments.arrayGet(env, "reportHighLowerBound"),
                                arguments.arrayGet(env, "coverageTextShowUncoveredFiles"),
                                arguments.arrayGet(env, "coverageTextShowOnlySummary"));
                env.callMethod(
                        outputStream,
                        "write",
                        TestRunner.class,
                        env.callMethod(
                                processor, "process", TestRunner.class, codeCoverage, colors));
            }

            if (arrayActionR(ArrayAction.ISSET, arguments, env, "coverageXml")) {
                env.callMethod(
                        this.printer,
                        "write",
                        TestRunner.class,
                        "\nGenerating code coverage report in PHPUnit XML format ...");
                try {
                    writer =
                            new com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .SebastianBergmann
                                    .namespaces
                                    .CodeCoverage
                                    .namespaces
                                    .Report
                                    .namespaces
                                    .Xml
                                    .classes
                                    .Facade(env, Version.runtimeStaticObject.id(env));
                    env.callMethod(
                            writer,
                            "process",
                            TestRunner.class,
                            codeCoverage,
                            arguments.arrayGet(env, "coverageXml"));
                    env.callMethod(this.printer, "write", TestRunner.class, " done\n");
                    writer = null;
                } catch (ConvertedException convertedException165) {
                    if (convertedException165.instanceOf(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .SebastianBergmann
                                    .namespaces
                                    .CodeCoverage
                                    .classes
                                    .Exception
                                    .class,
                            "SebastianBergmann\\CodeCoverage\\Exception")) {
                        e = convertedException165.getObject();
                        env.callMethod(
                                this.printer,
                                "write",
                                TestRunner.class,
                                " failed\n"
                                        + toStringR(
                                                env.callMethod(e, "getMessage", TestRunner.class),
                                                env)
                                        + "\n");
                    } else {
                        throw convertedException165;
                    }
                }
            }
        }

        if (ZVal.isTrue(exit)) {
            if (ZVal.isTrue(env.callMethod(result, "wasSuccessful", TestRunner.class))) {
                if (ZVal.toBool(arguments.arrayGet(env, "failOnRisky"))
                        && ZVal.toBool(
                                !ZVal.isTrue(
                                        env.callMethod(result, "allHarmless", TestRunner.class)))) {
                    env.exit(CONST_FAILURE_EXIT);
                }

                if (ZVal.toBool(arguments.arrayGet(env, "failOnWarning"))
                        && ZVal.toBool(
                                ZVal.isGreaterThan(
                                        env.callMethod(result, "warningCount", TestRunner.class),
                                        '>',
                                        0))) {
                    env.exit(CONST_FAILURE_EXIT);
                }

                env.exit(CONST_SUCCESS_EXIT);
            }

            if (ZVal.isGreaterThan(
                    env.callMethod(result, "errorCount", TestRunner.class), '>', 0)) {
                env.exit(CONST_EXCEPTION_EXIT);
            }

            if (ZVal.isGreaterThan(
                    env.callMethod(result, "failureCount", TestRunner.class), '>', 0)) {
                env.exit(CONST_FAILURE_EXIT);
            }
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "resultPrinter",
        typeHint = "PHPUnit\\TextUI\\ResultPrinter"
    )
    public Object setPrinter(RuntimeEnv env, Object... args) {
        Object resultPrinter = assignParameter(args, 0, false);
        this.printer = resultPrinter;
        return null;
    }

    @ConvertedMethod
    public Object getLoader(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(this.loader, "===", ZVal.getNull())) {
            this.loader = new StandardTestSuiteLoader(env);
        }

        return ZVal.assign(this.loader);
    }

    @ConvertedMethod
    protected Object createTestResult(RuntimeEnv env, Object... args) {
        return ZVal.assign(new TestResult(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "string")
    protected Object runFailed(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        this.write(env, toStringR(message, env) + toStringR("\n", env));
        env.exit(CONST_FAILURE_EXIT);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "buffer", typeHint = "string")
    protected Object write(RuntimeEnv env, Object... args) {
        Object buffer = assignParameter(args, 0, false);
        if (ZVal.toBool(ZVal.notEqualityCheck("cli", "cli"))
                && ZVal.toBool(ZVal.notEqualityCheck("cli", "phpdbg"))) {
            buffer = NamespaceGlobal.htmlspecialchars.env(env).call(buffer).value();
        }

        if (ZVal.strictNotEqualityCheck(this.printer, "!==", ZVal.getNull())) {
            env.callMethod(this.printer, "write", TestRunner.class, buffer);

        } else {
            env.echo(buffer);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "arguments", typeHint = "array")
    protected Object handleConfiguration(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope52 scope = new Scope52();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/phpunit/phpunit/src/TextUI")
                            .setFile("/vendor/phpunit/phpunit/src/TextUI/TestRunner.php");
            scope.arguments = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
            scope.extensionClass = null;
            scope.phpunitConfiguration = new BasicReferenceContainer(null);
            scope.extension = new BasicReferenceContainer(null);
            scope.testdoxGroupConfiguration = new BasicReferenceContainer(null);
            scope.listener = new BasicReferenceContainer(null);
            scope.groupCliArgs = null;
            scope.ternaryExpressionTemp = null;
            scope.listenerClass = null;
            scope.loggingConfiguration = new BasicReferenceContainer(null);
            scope.groupConfiguration = new BasicReferenceContainer(null);
            if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, scope.arguments, env, "configuration"))
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    ZVal.checkInstanceType(
                                            scope.arguments.arrayGet(env, "configuration"),
                                            Configuration.class,
                                            "PHPUnit\\Util\\Configuration")))) {
                scope.arguments
                        .arrayAccess(env, "configuration")
                        .set(
                                Configuration.runtimeStaticObject.getInstance(
                                        env, scope.arguments.arrayGet(env, "configuration")));
            }

            scope.arguments
                    .arrayAccess(env, "debug")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(env, "debug"))
                                    ? scope.ternaryExpressionTemp
                                    : false);
            scope.arguments
                    .arrayAccess(env, "filter")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(env, "filter"))
                                    ? scope.ternaryExpressionTemp
                                    : false);
            scope.arguments
                    .arrayAccess(env, "listeners")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(env, "listeners"))
                                    ? scope.ternaryExpressionTemp
                                    : ZVal.newArray());
            if (arrayActionR(ArrayAction.ISSET, scope.arguments, env, "configuration")) {
                env.callMethod(
                        scope.arguments.arrayGet(env, "configuration"),
                        "handlePHPConfiguration",
                        TestRunner.class);
                scope.phpunitConfiguration.setObject(
                        env.callMethod(
                                scope.arguments.arrayGet(env, "configuration"),
                                "getPHPUnitConfiguration",
                                TestRunner.class));
                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "backupGlobals"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "backupGlobals"))) {
                    scope.arguments
                            .arrayAccess(env, "backupGlobals")
                            .set(scope.phpunitConfiguration.arrayGet(env, "backupGlobals"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "backupStaticAttributes"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "backupStaticAttributes"))) {
                    scope.arguments
                            .arrayAccess(env, "backupStaticAttributes")
                            .set(
                                    scope.phpunitConfiguration.arrayGet(
                                            env, "backupStaticAttributes"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "beStrictAboutChangesToGlobalState"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "beStrictAboutChangesToGlobalState"))) {
                    scope.arguments
                            .arrayAccess(env, "beStrictAboutChangesToGlobalState")
                            .set(
                                    scope.phpunitConfiguration.arrayGet(
                                            env, "beStrictAboutChangesToGlobalState"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "bootstrap"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET, scope.arguments, env, "bootstrap"))) {
                    scope.arguments
                            .arrayAccess(env, "bootstrap")
                            .set(scope.phpunitConfiguration.arrayGet(env, "bootstrap"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "cacheTokens"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET, scope.arguments, env, "cacheTokens"))) {
                    scope.arguments
                            .arrayAccess(env, "cacheTokens")
                            .set(scope.phpunitConfiguration.arrayGet(env, "cacheTokens"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "colors"))
                        && ZVal.toBool(
                                !arrayActionR(ArrayAction.ISSET, scope.arguments, env, "colors"))) {
                    scope.arguments
                            .arrayAccess(env, "colors")
                            .set(scope.phpunitConfiguration.arrayGet(env, "colors"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "convertDeprecationsToExceptions"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "convertDeprecationsToExceptions"))) {
                    scope.arguments
                            .arrayAccess(env, "convertDeprecationsToExceptions")
                            .set(
                                    scope.phpunitConfiguration.arrayGet(
                                            env, "convertDeprecationsToExceptions"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "convertErrorsToExceptions"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "convertErrorsToExceptions"))) {
                    scope.arguments
                            .arrayAccess(env, "convertErrorsToExceptions")
                            .set(
                                    scope.phpunitConfiguration.arrayGet(
                                            env, "convertErrorsToExceptions"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "convertNoticesToExceptions"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "convertNoticesToExceptions"))) {
                    scope.arguments
                            .arrayAccess(env, "convertNoticesToExceptions")
                            .set(
                                    scope.phpunitConfiguration.arrayGet(
                                            env, "convertNoticesToExceptions"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "convertWarningsToExceptions"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "convertWarningsToExceptions"))) {
                    scope.arguments
                            .arrayAccess(env, "convertWarningsToExceptions")
                            .set(
                                    scope.phpunitConfiguration.arrayGet(
                                            env, "convertWarningsToExceptions"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "processIsolation"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "processIsolation"))) {
                    scope.arguments
                            .arrayAccess(env, "processIsolation")
                            .set(scope.phpunitConfiguration.arrayGet(env, "processIsolation"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "stopOnError"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET, scope.arguments, env, "stopOnError"))) {
                    scope.arguments
                            .arrayAccess(env, "stopOnError")
                            .set(scope.phpunitConfiguration.arrayGet(env, "stopOnError"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "stopOnFailure"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "stopOnFailure"))) {
                    scope.arguments
                            .arrayAccess(env, "stopOnFailure")
                            .set(scope.phpunitConfiguration.arrayGet(env, "stopOnFailure"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "stopOnWarning"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "stopOnWarning"))) {
                    scope.arguments
                            .arrayAccess(env, "stopOnWarning")
                            .set(scope.phpunitConfiguration.arrayGet(env, "stopOnWarning"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "stopOnIncomplete"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "stopOnIncomplete"))) {
                    scope.arguments
                            .arrayAccess(env, "stopOnIncomplete")
                            .set(scope.phpunitConfiguration.arrayGet(env, "stopOnIncomplete"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "stopOnRisky"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET, scope.arguments, env, "stopOnRisky"))) {
                    scope.arguments
                            .arrayAccess(env, "stopOnRisky")
                            .set(scope.phpunitConfiguration.arrayGet(env, "stopOnRisky"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "stopOnSkipped"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "stopOnSkipped"))) {
                    scope.arguments
                            .arrayAccess(env, "stopOnSkipped")
                            .set(scope.phpunitConfiguration.arrayGet(env, "stopOnSkipped"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "failOnWarning"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "failOnWarning"))) {
                    scope.arguments
                            .arrayAccess(env, "failOnWarning")
                            .set(scope.phpunitConfiguration.arrayGet(env, "failOnWarning"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "failOnRisky"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET, scope.arguments, env, "failOnRisky"))) {
                    scope.arguments
                            .arrayAccess(env, "failOnRisky")
                            .set(scope.phpunitConfiguration.arrayGet(env, "failOnRisky"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "timeoutForSmallTests"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "timeoutForSmallTests"))) {
                    scope.arguments
                            .arrayAccess(env, "timeoutForSmallTests")
                            .set(scope.phpunitConfiguration.arrayGet(env, "timeoutForSmallTests"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "timeoutForMediumTests"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "timeoutForMediumTests"))) {
                    scope.arguments
                            .arrayAccess(env, "timeoutForMediumTests")
                            .set(scope.phpunitConfiguration.arrayGet(env, "timeoutForMediumTests"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "timeoutForLargeTests"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "timeoutForLargeTests"))) {
                    scope.arguments
                            .arrayAccess(env, "timeoutForLargeTests")
                            .set(scope.phpunitConfiguration.arrayGet(env, "timeoutForLargeTests"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "reportUselessTests"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "reportUselessTests"))) {
                    scope.arguments
                            .arrayAccess(env, "reportUselessTests")
                            .set(scope.phpunitConfiguration.arrayGet(env, "reportUselessTests"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "strictCoverage"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "strictCoverage"))) {
                    scope.arguments
                            .arrayAccess(env, "strictCoverage")
                            .set(scope.phpunitConfiguration.arrayGet(env, "strictCoverage"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "ignoreDeprecatedCodeUnitsFromCodeCoverage"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "ignoreDeprecatedCodeUnitsFromCodeCoverage"))) {
                    scope.arguments
                            .arrayAccess(env, "ignoreDeprecatedCodeUnitsFromCodeCoverage")
                            .set(
                                    scope.phpunitConfiguration.arrayGet(
                                            env, "ignoreDeprecatedCodeUnitsFromCodeCoverage"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "disallowTestOutput"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "disallowTestOutput"))) {
                    scope.arguments
                            .arrayAccess(env, "disallowTestOutput")
                            .set(scope.phpunitConfiguration.arrayGet(env, "disallowTestOutput"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "enforceTimeLimit"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "enforceTimeLimit"))) {
                    scope.arguments
                            .arrayAccess(env, "enforceTimeLimit")
                            .set(scope.phpunitConfiguration.arrayGet(env, "enforceTimeLimit"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "disallowTodoAnnotatedTests"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "disallowTodoAnnotatedTests"))) {
                    scope.arguments
                            .arrayAccess(env, "disallowTodoAnnotatedTests")
                            .set(
                                    scope.phpunitConfiguration.arrayGet(
                                            env, "disallowTodoAnnotatedTests"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "beStrictAboutResourceUsageDuringSmallTests"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "beStrictAboutResourceUsageDuringSmallTests"))) {
                    scope.arguments
                            .arrayAccess(env, "beStrictAboutResourceUsageDuringSmallTests")
                            .set(
                                    scope.phpunitConfiguration.arrayGet(
                                            env, "beStrictAboutResourceUsageDuringSmallTests"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "verbose"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET, scope.arguments, env, "verbose"))) {
                    scope.arguments
                            .arrayAccess(env, "verbose")
                            .set(scope.phpunitConfiguration.arrayGet(env, "verbose"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "reverseDefectList"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET, scope.arguments, env, "reverseList"))) {
                    scope.arguments
                            .arrayAccess(env, "reverseList")
                            .set(scope.phpunitConfiguration.arrayGet(env, "reverseDefectList"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "forceCoversAnnotation"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "forceCoversAnnotation"))) {
                    scope.arguments
                            .arrayAccess(env, "forceCoversAnnotation")
                            .set(scope.phpunitConfiguration.arrayGet(env, "forceCoversAnnotation"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "disableCodeCoverageIgnore"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "disableCodeCoverageIgnore"))) {
                    scope.arguments
                            .arrayAccess(env, "disableCodeCoverageIgnore")
                            .set(
                                    scope.phpunitConfiguration.arrayGet(
                                            env, "disableCodeCoverageIgnore"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "registerMockObjectsFromTestArgumentsRecursively"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "registerMockObjectsFromTestArgumentsRecursively"))) {
                    scope.arguments
                            .arrayAccess(env, "registerMockObjectsFromTestArgumentsRecursively")
                            .set(
                                    scope.phpunitConfiguration.arrayGet(
                                            env,
                                            "registerMockObjectsFromTestArgumentsRecursively"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "executionOrder"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "executionOrder"))) {
                    scope.arguments
                            .arrayAccess(env, "executionOrder")
                            .set(scope.phpunitConfiguration.arrayGet(env, "executionOrder"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.phpunitConfiguration,
                                        env,
                                        "resolveDependencies"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "resolveDependencies"))) {
                    scope.arguments
                            .arrayAccess(env, "resolveDependencies")
                            .set(scope.phpunitConfiguration.arrayGet(env, "resolveDependencies"));
                }

                scope.groupCliArgs = ZVal.newArray();
                if (!arrayActionR(ArrayAction.EMPTY, scope.arguments, env, "groups")) {
                    scope.groupCliArgs = ZVal.assign(scope.arguments.arrayGet(env, "groups"));
                }

                scope.groupConfiguration.setObject(
                        env.callMethod(
                                scope.arguments.arrayGet(env, "configuration"),
                                "getGroupConfiguration",
                                TestRunner.class));
                if (ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.EMPTY,
                                        scope.groupConfiguration,
                                        env,
                                        "include"))
                        && ZVal.toBool(
                                !arrayActionR(ArrayAction.ISSET, scope.arguments, env, "groups"))) {
                    scope.arguments
                            .arrayAccess(env, "groups")
                            .set(scope.groupConfiguration.arrayGet(env, "include"));
                }

                if (ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.EMPTY,
                                        scope.groupConfiguration,
                                        env,
                                        "exclude"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "excludeGroups"))) {
                    scope.arguments
                            .arrayAccess(env, "excludeGroups")
                            .set(
                                    function_array_diff
                                            .f
                                            .env(env)
                                            .call(
                                                    scope.groupConfiguration.arrayGet(
                                                            env, "exclude"),
                                                    scope.groupCliArgs)
                                            .value());
                }

                for (ZPair zpairResult1254 :
                        ZVal.getIterable(
                                env.callMethod(
                                        scope.arguments.arrayGet(env, "configuration"),
                                        "getExtensionConfiguration",
                                        TestRunner.class),
                                env,
                                true)) {
                    scope.extension.setObject(ZVal.assign(zpairResult1254.getValue()));
                    if (ZVal.toBool(
                                    !function_class_exists
                                            .f
                                            .env(env)
                                            .call(scope.extension.arrayGet(env, "class"), false)
                                            .getBool())
                            && ZVal.toBool(
                                    ZVal.strictNotEqualityCheck(
                                            scope.extension.arrayGet(env, "file"), "!==", ""))) {
                        env.include(
                                toStringR(scope.extension.arrayGet(env, "file"), env),
                                stack,
                                runtimeConverterFunctionClassConstants,
                                true,
                                true);
                    }

                    if (!function_class_exists
                            .f
                            .env(env)
                            .call(scope.extension.arrayGet(env, "class"))
                            .getBool()) {
                        throw ZVal.getException(
                                env,
                                new com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .PHPUnit
                                        .namespaces
                                        .Framework
                                        .classes
                                        .Exception(
                                        env,
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "Class \"%s\" does not exist",
                                                        scope.extension.arrayGet(env, "class"))
                                                .value()));
                    }

                    scope.extensionClass =
                            new ReflectionClass(env, scope.extension.arrayGet(env, "class"));
                    if (!ZVal.isTrue(
                            env.callMethod(
                                    scope.extensionClass,
                                    "implementsInterface",
                                    TestRunner.class,
                                    Hook.CONST_class))) {
                        throw ZVal.getException(
                                env,
                                new com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .PHPUnit
                                        .namespaces
                                        .Framework
                                        .classes
                                        .Exception(
                                        env,
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "Class \"%s\" does not implement a PHPUnit\\Runner\\Hook interface",
                                                        scope.extension.arrayGet(env, "class"))
                                                .value()));
                    }

                    if (ZVal.equalityCheck(
                            function_count
                                    .f
                                    .env(env)
                                    .call(scope.extension.arrayGet(env, "arguments"))
                                    .value(),
                            0)) {
                        new ReferenceClassProperty(scope._thisVarAlias, "extensions", env)
                                .arrayAppend(env)
                                .set(
                                        env.callMethod(
                                                scope.extensionClass,
                                                "newInstance",
                                                TestRunner.class));

                    } else {
                        new ReferenceClassProperty(scope._thisVarAlias, "extensions", env)
                                .arrayAppend(env)
                                .set(
                                        env.callMethod(
                                                scope.extensionClass,
                                                "newInstanceArgs",
                                                TestRunner.class,
                                                scope.extension.arrayGet(env, "arguments")));
                    }
                }

                for (ZPair zpairResult1255 :
                        ZVal.getIterable(
                                env.callMethod(
                                        scope.arguments.arrayGet(env, "configuration"),
                                        "getListenerConfiguration",
                                        TestRunner.class),
                                env,
                                true)) {
                    scope.listener.setObject(ZVal.assign(zpairResult1255.getValue()));
                    if (ZVal.toBool(
                                    !function_class_exists
                                            .f
                                            .env(env)
                                            .call(scope.listener.arrayGet(env, "class"), false)
                                            .getBool())
                            && ZVal.toBool(
                                    ZVal.strictNotEqualityCheck(
                                            scope.listener.arrayGet(env, "file"), "!==", ""))) {
                        env.include(
                                toStringR(scope.listener.arrayGet(env, "file"), env),
                                stack,
                                runtimeConverterFunctionClassConstants,
                                true,
                                true);
                    }

                    if (!function_class_exists
                            .f
                            .env(env)
                            .call(scope.listener.arrayGet(env, "class"))
                            .getBool()) {
                        throw ZVal.getException(
                                env,
                                new com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .PHPUnit
                                        .namespaces
                                        .Framework
                                        .classes
                                        .Exception(
                                        env,
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "Class \"%s\" does not exist",
                                                        scope.listener.arrayGet(env, "class"))
                                                .value()));
                    }

                    scope.listenerClass =
                            new ReflectionClass(env, scope.listener.arrayGet(env, "class"));
                    if (!ZVal.isTrue(
                            env.callMethod(
                                    scope.listenerClass,
                                    "implementsInterface",
                                    TestRunner.class,
                                    TestListener.CONST_class))) {
                        throw ZVal.getException(
                                env,
                                new com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .PHPUnit
                                        .namespaces
                                        .Framework
                                        .classes
                                        .Exception(
                                        env,
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "Class \"%s\" does not implement the PHPUnit\\Framework\\TestListener interface",
                                                        scope.listener.arrayGet(env, "class"))
                                                .value()));
                    }

                    if (ZVal.equalityCheck(
                            function_count
                                    .f
                                    .env(env)
                                    .call(scope.listener.arrayGet(env, "arguments"))
                                    .value(),
                            0)) {
                        scope.listener.setObject(
                                env.createNew(scope.listener.arrayGet(env, "class")));

                    } else {
                        scope.listener.setObject(
                                env.callMethod(
                                        scope.listenerClass,
                                        "newInstanceArgs",
                                        TestRunner.class,
                                        scope.listener.arrayGet(env, "arguments")));
                    }

                    scope.arguments.arrayAppend(env, "listeners").set(scope.listener.getObject());
                }

                scope.loggingConfiguration.setObject(
                        env.callMethod(
                                scope.arguments.arrayGet(env, "configuration"),
                                "getLoggingConfiguration",
                                TestRunner.class));
                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.loggingConfiguration,
                                        env,
                                        "coverage-clover"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "coverageClover"))) {
                    scope.arguments
                            .arrayAccess(env, "coverageClover")
                            .set(scope.loggingConfiguration.arrayGet(env, "coverage-clover"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.loggingConfiguration,
                                        env,
                                        "coverage-crap4j"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "coverageCrap4J"))) {
                    scope.arguments
                            .arrayAccess(env, "coverageCrap4J")
                            .set(scope.loggingConfiguration.arrayGet(env, "coverage-crap4j"));
                    if (ZVal.toBool(
                                    arrayActionR(
                                            ArrayAction.ISSET,
                                            scope.loggingConfiguration,
                                            env,
                                            "crap4jThreshold"))
                            && ZVal.toBool(
                                    !arrayActionR(
                                            ArrayAction.ISSET,
                                            scope.arguments,
                                            env,
                                            "crap4jThreshold"))) {
                        scope.arguments
                                .arrayAccess(env, "crap4jThreshold")
                                .set(scope.loggingConfiguration.arrayGet(env, "crap4jThreshold"));
                    }
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.loggingConfiguration,
                                        env,
                                        "coverage-html"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET, scope.arguments, env, "coverageHtml"))) {
                    if (ZVal.toBool(
                                    arrayActionR(
                                            ArrayAction.ISSET,
                                            scope.loggingConfiguration,
                                            env,
                                            "lowUpperBound"))
                            && ZVal.toBool(
                                    !arrayActionR(
                                            ArrayAction.ISSET,
                                            scope.arguments,
                                            env,
                                            "reportLowUpperBound"))) {
                        scope.arguments
                                .arrayAccess(env, "reportLowUpperBound")
                                .set(scope.loggingConfiguration.arrayGet(env, "lowUpperBound"));
                    }

                    if (ZVal.toBool(
                                    arrayActionR(
                                            ArrayAction.ISSET,
                                            scope.loggingConfiguration,
                                            env,
                                            "highLowerBound"))
                            && ZVal.toBool(
                                    !arrayActionR(
                                            ArrayAction.ISSET,
                                            scope.arguments,
                                            env,
                                            "reportHighLowerBound"))) {
                        scope.arguments
                                .arrayAccess(env, "reportHighLowerBound")
                                .set(scope.loggingConfiguration.arrayGet(env, "highLowerBound"));
                    }

                    scope.arguments
                            .arrayAccess(env, "coverageHtml")
                            .set(scope.loggingConfiguration.arrayGet(env, "coverage-html"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.loggingConfiguration,
                                        env,
                                        "coverage-php"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET, scope.arguments, env, "coveragePHP"))) {
                    scope.arguments
                            .arrayAccess(env, "coveragePHP")
                            .set(scope.loggingConfiguration.arrayGet(env, "coverage-php"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.loggingConfiguration,
                                        env,
                                        "coverage-text"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET, scope.arguments, env, "coverageText"))) {
                    scope.arguments
                            .arrayAccess(env, "coverageText")
                            .set(scope.loggingConfiguration.arrayGet(env, "coverage-text"));
                    if (arrayActionR(
                            ArrayAction.ISSET,
                            scope.loggingConfiguration,
                            env,
                            "coverageTextShowUncoveredFiles")) {
                        scope.arguments
                                .arrayAccess(env, "coverageTextShowUncoveredFiles")
                                .set(
                                        scope.loggingConfiguration.arrayGet(
                                                env, "coverageTextShowUncoveredFiles"));

                    } else {
                        scope.arguments
                                .arrayAccess(env, "coverageTextShowUncoveredFiles")
                                .set(false);
                    }

                    if (arrayActionR(
                            ArrayAction.ISSET,
                            scope.loggingConfiguration,
                            env,
                            "coverageTextShowOnlySummary")) {
                        scope.arguments
                                .arrayAccess(env, "coverageTextShowOnlySummary")
                                .set(
                                        scope.loggingConfiguration.arrayGet(
                                                env, "coverageTextShowOnlySummary"));

                    } else {
                        scope.arguments.arrayAccess(env, "coverageTextShowOnlySummary").set(false);
                    }
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.loggingConfiguration,
                                        env,
                                        "coverage-xml"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET, scope.arguments, env, "coverageXml"))) {
                    scope.arguments
                            .arrayAccess(env, "coverageXml")
                            .set(scope.loggingConfiguration.arrayGet(env, "coverage-xml"));
                }

                if (arrayActionR(ArrayAction.ISSET, scope.loggingConfiguration, env, "plain")) {
                    scope.arguments
                            .arrayAppend(env, "listeners")
                            .set(
                                    new ResultPrinter(
                                            env,
                                            scope.loggingConfiguration.arrayGet(env, "plain"),
                                            true));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.loggingConfiguration,
                                        env,
                                        "teamcity"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "teamcityLogfile"))) {
                    scope.arguments
                            .arrayAccess(env, "teamcityLogfile")
                            .set(scope.loggingConfiguration.arrayGet(env, "teamcity"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.loggingConfiguration,
                                        env,
                                        "junit"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET, scope.arguments, env, "junitLogfile"))) {
                    scope.arguments
                            .arrayAccess(env, "junitLogfile")
                            .set(scope.loggingConfiguration.arrayGet(env, "junit"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.loggingConfiguration,
                                        env,
                                        "testdox-html"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "testdoxHTMLFile"))) {
                    scope.arguments
                            .arrayAccess(env, "testdoxHTMLFile")
                            .set(scope.loggingConfiguration.arrayGet(env, "testdox-html"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.loggingConfiguration,
                                        env,
                                        "testdox-text"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "testdoxTextFile"))) {
                    scope.arguments
                            .arrayAccess(env, "testdoxTextFile")
                            .set(scope.loggingConfiguration.arrayGet(env, "testdox-text"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.loggingConfiguration,
                                        env,
                                        "testdox-xml"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "testdoxXMLFile"))) {
                    scope.arguments
                            .arrayAccess(env, "testdoxXMLFile")
                            .set(scope.loggingConfiguration.arrayGet(env, "testdox-xml"));
                }

                scope.testdoxGroupConfiguration.setObject(
                        env.callMethod(
                                scope.arguments.arrayGet(env, "configuration"),
                                "getTestdoxGroupConfiguration",
                                TestRunner.class));
                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.testdoxGroupConfiguration,
                                        env,
                                        "include"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "testdoxGroups"))) {
                    scope.arguments
                            .arrayAccess(env, "testdoxGroups")
                            .set(scope.testdoxGroupConfiguration.arrayGet(env, "include"));
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.testdoxGroupConfiguration,
                                        env,
                                        "exclude"))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        scope.arguments,
                                        env,
                                        "testdoxExcludeGroups"))) {
                    scope.arguments
                            .arrayAccess(env, "testdoxExcludeGroups")
                            .set(scope.testdoxGroupConfiguration.arrayGet(env, "exclude"));
                }
            }

            scope.arguments
                    .arrayAccess(env, "addUncoveredFilesFromWhitelist")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(
                                                            env, "addUncoveredFilesFromWhitelist"))
                                    ? scope.ternaryExpressionTemp
                                    : true);
            scope.arguments
                    .arrayAccess(env, "backupGlobals")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(env, "backupGlobals"))
                                    ? scope.ternaryExpressionTemp
                                    : ZVal.getNull());
            scope.arguments
                    .arrayAccess(env, "backupStaticAttributes")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(
                                                            env, "backupStaticAttributes"))
                                    ? scope.ternaryExpressionTemp
                                    : ZVal.getNull());
            scope.arguments
                    .arrayAccess(env, "beStrictAboutChangesToGlobalState")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(
                                                            env,
                                                            "beStrictAboutChangesToGlobalState"))
                                    ? scope.ternaryExpressionTemp
                                    : ZVal.getNull());
            scope.arguments
                    .arrayAccess(env, "beStrictAboutResourceUsageDuringSmallTests")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(
                                                            env,
                                                            "beStrictAboutResourceUsageDuringSmallTests"))
                                    ? scope.ternaryExpressionTemp
                                    : false);
            scope.arguments
                    .arrayAccess(env, "cacheTokens")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(env, "cacheTokens"))
                                    ? scope.ternaryExpressionTemp
                                    : false);
            scope.arguments
                    .arrayAccess(env, "colors")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(env, "colors"))
                                    ? scope.ternaryExpressionTemp
                                    : ResultPrinter.CONST_COLOR_DEFAULT);
            scope.arguments
                    .arrayAccess(env, "columns")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(env, "columns"))
                                    ? scope.ternaryExpressionTemp
                                    : 80);
            scope.arguments
                    .arrayAccess(env, "convertDeprecationsToExceptions")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(
                                                            env, "convertDeprecationsToExceptions"))
                                    ? scope.ternaryExpressionTemp
                                    : true);
            scope.arguments
                    .arrayAccess(env, "convertErrorsToExceptions")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(
                                                            env, "convertErrorsToExceptions"))
                                    ? scope.ternaryExpressionTemp
                                    : true);
            scope.arguments
                    .arrayAccess(env, "convertNoticesToExceptions")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(
                                                            env, "convertNoticesToExceptions"))
                                    ? scope.ternaryExpressionTemp
                                    : true);
            scope.arguments
                    .arrayAccess(env, "convertWarningsToExceptions")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(
                                                            env, "convertWarningsToExceptions"))
                                    ? scope.ternaryExpressionTemp
                                    : true);
            scope.arguments
                    .arrayAccess(env, "crap4jThreshold")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(
                                                            env, "crap4jThreshold"))
                                    ? scope.ternaryExpressionTemp
                                    : 30);
            scope.arguments
                    .arrayAccess(env, "disallowTestOutput")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(
                                                            env, "disallowTestOutput"))
                                    ? scope.ternaryExpressionTemp
                                    : false);
            scope.arguments
                    .arrayAccess(env, "disallowTodoAnnotatedTests")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(
                                                            env, "disallowTodoAnnotatedTests"))
                                    ? scope.ternaryExpressionTemp
                                    : false);
            scope.arguments
                    .arrayAccess(env, "enforceTimeLimit")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(
                                                            env, "enforceTimeLimit"))
                                    ? scope.ternaryExpressionTemp
                                    : false);
            scope.arguments
                    .arrayAccess(env, "excludeGroups")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(env, "excludeGroups"))
                                    ? scope.ternaryExpressionTemp
                                    : ZVal.newArray());
            scope.arguments
                    .arrayAccess(env, "failOnRisky")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(env, "failOnRisky"))
                                    ? scope.ternaryExpressionTemp
                                    : false);
            scope.arguments
                    .arrayAccess(env, "failOnWarning")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(env, "failOnWarning"))
                                    ? scope.ternaryExpressionTemp
                                    : false);
            scope.arguments
                    .arrayAccess(env, "groups")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(env, "groups"))
                                    ? scope.ternaryExpressionTemp
                                    : ZVal.newArray());
            scope.arguments
                    .arrayAccess(env, "processIsolation")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(
                                                            env, "processIsolation"))
                                    ? scope.ternaryExpressionTemp
                                    : false);
            scope.arguments
                    .arrayAccess(env, "processUncoveredFilesFromWhitelist")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(
                                                            env,
                                                            "processUncoveredFilesFromWhitelist"))
                                    ? scope.ternaryExpressionTemp
                                    : false);
            scope.arguments
                    .arrayAccess(env, "randomOrderSeed")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(
                                                            env, "randomOrderSeed"))
                                    ? scope.ternaryExpressionTemp
                                    : NamespaceGlobal.time.env(env).call().value());
            scope.arguments
                    .arrayAccess(env, "registerMockObjectsFromTestArgumentsRecursively")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(
                                                            env,
                                                            "registerMockObjectsFromTestArgumentsRecursively"))
                                    ? scope.ternaryExpressionTemp
                                    : false);
            scope.arguments
                    .arrayAccess(env, "repeat")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(env, "repeat"))
                                    ? scope.ternaryExpressionTemp
                                    : false);
            scope.arguments
                    .arrayAccess(env, "reportHighLowerBound")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(
                                                            env, "reportHighLowerBound"))
                                    ? scope.ternaryExpressionTemp
                                    : 90);
            scope.arguments
                    .arrayAccess(env, "reportLowUpperBound")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(
                                                            env, "reportLowUpperBound"))
                                    ? scope.ternaryExpressionTemp
                                    : 50);
            scope.arguments
                    .arrayAccess(env, "reportUselessTests")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(
                                                            env, "reportUselessTests"))
                                    ? scope.ternaryExpressionTemp
                                    : true);
            scope.arguments
                    .arrayAccess(env, "reverseList")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(env, "reverseList"))
                                    ? scope.ternaryExpressionTemp
                                    : false);
            scope.arguments
                    .arrayAccess(env, "executionOrder")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(env, "executionOrder"))
                                    ? scope.ternaryExpressionTemp
                                    : TestSuiteSorter.CONST_ORDER_DEFAULT);
            scope.arguments
                    .arrayAccess(env, "resolveDependencies")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(
                                                            env, "resolveDependencies"))
                                    ? scope.ternaryExpressionTemp
                                    : false);
            scope.arguments
                    .arrayAccess(env, "stopOnError")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(env, "stopOnError"))
                                    ? scope.ternaryExpressionTemp
                                    : false);
            scope.arguments
                    .arrayAccess(env, "stopOnFailure")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(env, "stopOnFailure"))
                                    ? scope.ternaryExpressionTemp
                                    : false);
            scope.arguments
                    .arrayAccess(env, "stopOnIncomplete")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(
                                                            env, "stopOnIncomplete"))
                                    ? scope.ternaryExpressionTemp
                                    : false);
            scope.arguments
                    .arrayAccess(env, "stopOnRisky")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(env, "stopOnRisky"))
                                    ? scope.ternaryExpressionTemp
                                    : false);
            scope.arguments
                    .arrayAccess(env, "stopOnSkipped")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(env, "stopOnSkipped"))
                                    ? scope.ternaryExpressionTemp
                                    : false);
            scope.arguments
                    .arrayAccess(env, "stopOnWarning")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(env, "stopOnWarning"))
                                    ? scope.ternaryExpressionTemp
                                    : false);
            scope.arguments
                    .arrayAccess(env, "strictCoverage")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(env, "strictCoverage"))
                                    ? scope.ternaryExpressionTemp
                                    : false);
            scope.arguments
                    .arrayAccess(env, "testdoxExcludeGroups")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(
                                                            env, "testdoxExcludeGroups"))
                                    ? scope.ternaryExpressionTemp
                                    : ZVal.newArray());
            scope.arguments
                    .arrayAccess(env, "testdoxGroups")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(env, "testdoxGroups"))
                                    ? scope.ternaryExpressionTemp
                                    : ZVal.newArray());
            scope.arguments
                    .arrayAccess(env, "timeoutForLargeTests")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(
                                                            env, "timeoutForLargeTests"))
                                    ? scope.ternaryExpressionTemp
                                    : 60);
            scope.arguments
                    .arrayAccess(env, "timeoutForMediumTests")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(
                                                            env, "timeoutForMediumTests"))
                                    ? scope.ternaryExpressionTemp
                                    : 10);
            scope.arguments
                    .arrayAccess(env, "timeoutForSmallTests")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(
                                                            env, "timeoutForSmallTests"))
                                    ? scope.ternaryExpressionTemp
                                    : 1);
            scope.arguments
                    .arrayAccess(env, "verbose")
                    .set(
                            ZVal.isDefined(
                                            scope.ternaryExpressionTemp =
                                                    scope.arguments.arrayGet(env, "verbose"))
                                    ? scope.ternaryExpressionTemp
                                    : false);
            throw new IncludeEventException(null);
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    public Object handleConfiguration(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    @ConvertedParameter(index = 1, name = "arguments", typeHint = "array")
    private Object processSuiteFilters(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, false);
        ReferenceContainer arguments = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object filterFactory = null;
        if (ZVal.toBool(
                        ZVal.toBool(!ZVal.isTrue(arguments.arrayGet(env, "filter")))
                                && ZVal.toBool(
                                        arrayActionR(ArrayAction.EMPTY, arguments, env, "groups")))
                && ZVal.toBool(arrayActionR(ArrayAction.EMPTY, arguments, env, "excludeGroups"))) {
            return null;
        }

        filterFactory = new Factory(env);
        if (!arrayActionR(ArrayAction.EMPTY, arguments, env, "excludeGroups")) {
            env.callMethod(
                    filterFactory,
                    "addFilter",
                    TestRunner.class,
                    new ReflectionClass(env, ExcludeGroupFilterIterator.CONST_class),
                    arguments.arrayGet(env, "excludeGroups"));
        }

        if (!arrayActionR(ArrayAction.EMPTY, arguments, env, "groups")) {
            env.callMethod(
                    filterFactory,
                    "addFilter",
                    TestRunner.class,
                    new ReflectionClass(env, IncludeGroupFilterIterator.CONST_class),
                    arguments.arrayGet(env, "groups"));
        }

        if (ZVal.isTrue(arguments.arrayGet(env, "filter"))) {
            env.callMethod(
                    filterFactory,
                    "addFilter",
                    TestRunner.class,
                    new ReflectionClass(env, NameFilterIterator.CONST_class),
                    arguments.arrayGet(env, "filter"));
        }

        env.callMethod(suite, "injectFilter", TestRunner.class, filterFactory);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type", typeHint = "string")
    @ConvertedParameter(index = 1, name = "message", typeHint = "string")
    private Object writeMessage(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, false);
        if (!ZVal.isTrue(this.messagePrinted)) {
            this.write(env, "\n");
        }

        this.write(
                env,
                function_sprintf
                        .f
                        .env(env)
                        .call("%-15s%s\n", toStringR(type, env) + ":", message)
                        .value());
        this.messagePrinted = true;
        return null;
    }

    public static final Object CONST_SUCCESS_EXIT = 0;

    public static final Object CONST_FAILURE_EXIT = 1;

    public static final Object CONST_EXCEPTION_EXIT = 2;

    public static final Object CONST_class = "PHPUnit\\TextUI\\TestRunner";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends BaseTestRunner.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "test")
        @ConvertedParameter(
            index = 1,
            name = "arguments",
            typeHint = "array",
            defaultValue = "",
            defaultValueType = "array"
        )
        @ConvertedParameter(
            index = 2,
            name = "exit",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        public Object run(RuntimeEnv env, Object... args) {
            Object test = assignParameter(args, 0, false);
            Object arguments = assignParameter(args, 1, true);
            if (null == arguments) {
                arguments = ZVal.newArray();
            }
            Object exit = assignParameter(args, 2, true);
            if (null == exit) {
                exit = true;
            }
            Object aTestRunner = null;
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(test, ReflectionClass.class, "ReflectionClass"))) {
                test = new TestSuite(env, test);
            }

            if (ZVal.isTrue(ZVal.checkInstanceType(test, Test.class, "PHPUnit\\Framework\\Test"))) {
                aTestRunner =
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PHPUnit
                                .namespaces
                                .TextUI
                                .classes
                                .TestRunner(env);
                return ZVal.assign(
                        env.callMethod(
                                aTestRunner, "doRun", TestRunner.class, test, arguments, exit));
            }

            throw ZVal.getException(
                    env,
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .PHPUnit
                            .namespaces
                            .Framework
                            .classes
                            .Exception(env, "No test case or test suite found."));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object versionStringPrinted = false;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\TextUI\\TestRunner")
                    .setLookup(
                            TestRunner.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "codeCoverageFilter",
                            "extensions",
                            "loader",
                            "messagePrinted",
                            "printer",
                            "runtime")
                    .setStaticPropertyNames("versionStringPrinted")
                    .setFilename("vendor/phpunit/phpunit/src/TextUI/TestRunner.php")
                    .addExtendsClass("PHPUnit\\Runner\\BaseTestRunner")
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

    private static class Scope51 implements UpdateRuntimeScopeInterface {

        Object extensionClass;
        ReferenceContainer phpunitConfiguration;
        ReferenceContainer extension;
        ReferenceContainer testdoxGroupConfiguration;
        Object _thisVarAlias;
        ReferenceContainer listener;
        Object groupCliArgs;
        ReferenceContainer arguments;
        Object ternaryExpressionTemp;
        Object listenerClass;
        ReferenceContainer loggingConfiguration;
        ReferenceContainer groupConfiguration;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("extensionClass", this.extensionClass);
            stack.setVariable("phpunitConfiguration", this.phpunitConfiguration);
            stack.setVariable("extension", this.extension);
            stack.setVariable("testdoxGroupConfiguration", this.testdoxGroupConfiguration);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("listener", this.listener);
            stack.setVariable("groupCliArgs", this.groupCliArgs);
            stack.setVariable("arguments", this.arguments);
            stack.setVariable("ternaryExpressionTemp", this.ternaryExpressionTemp);
            stack.setVariable("listenerClass", this.listenerClass);
            stack.setVariable("loggingConfiguration", this.loggingConfiguration);
            stack.setVariable("groupConfiguration", this.groupConfiguration);
        }

        public void updateScope(RuntimeStack stack) {

            this.extensionClass = stack.getVariable("extensionClass");
            this.phpunitConfiguration =
                    ZVal.getStackReference(stack.getVariable("phpunitConfiguration"));
            this.extension = ZVal.getStackReference(stack.getVariable("extension"));
            this.testdoxGroupConfiguration =
                    ZVal.getStackReference(stack.getVariable("testdoxGroupConfiguration"));
            this._thisVarAlias = stack.getVariable("this");
            this.listener = ZVal.getStackReference(stack.getVariable("listener"));
            this.groupCliArgs = stack.getVariable("groupCliArgs");
            this.arguments = ZVal.getStackReference(stack.getVariable("arguments"));
            this.ternaryExpressionTemp = stack.getVariable("ternaryExpressionTemp");
            this.listenerClass = stack.getVariable("listenerClass");
            this.loggingConfiguration =
                    ZVal.getStackReference(stack.getVariable("loggingConfiguration"));
            this.groupConfiguration =
                    ZVal.getStackReference(stack.getVariable("groupConfiguration"));
        }
    }

    private static class Scope52 implements UpdateRuntimeScopeInterface {

        Object extensionClass;
        ReferenceContainer phpunitConfiguration;
        ReferenceContainer extension;
        ReferenceContainer testdoxGroupConfiguration;
        Object _thisVarAlias;
        ReferenceContainer listener;
        Object groupCliArgs;
        ReferenceContainer arguments;
        Object ternaryExpressionTemp;
        Object listenerClass;
        ReferenceContainer loggingConfiguration;
        ReferenceContainer groupConfiguration;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("extensionClass", this.extensionClass);
            stack.setVariable("phpunitConfiguration", this.phpunitConfiguration);
            stack.setVariable("extension", this.extension);
            stack.setVariable("testdoxGroupConfiguration", this.testdoxGroupConfiguration);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("listener", this.listener);
            stack.setVariable("groupCliArgs", this.groupCliArgs);
            stack.setVariable("arguments", this.arguments);
            stack.setVariable("ternaryExpressionTemp", this.ternaryExpressionTemp);
            stack.setVariable("listenerClass", this.listenerClass);
            stack.setVariable("loggingConfiguration", this.loggingConfiguration);
            stack.setVariable("groupConfiguration", this.groupConfiguration);
        }

        public void updateScope(RuntimeStack stack) {

            this.extensionClass = stack.getVariable("extensionClass");
            this.phpunitConfiguration =
                    ZVal.getStackReference(stack.getVariable("phpunitConfiguration"));
            this.extension = ZVal.getStackReference(stack.getVariable("extension"));
            this.testdoxGroupConfiguration =
                    ZVal.getStackReference(stack.getVariable("testdoxGroupConfiguration"));
            this._thisVarAlias = stack.getVariable("this");
            this.listener = ZVal.getStackReference(stack.getVariable("listener"));
            this.groupCliArgs = stack.getVariable("groupCliArgs");
            this.arguments = ZVal.getStackReference(stack.getVariable("arguments"));
            this.ternaryExpressionTemp = stack.getVariable("ternaryExpressionTemp");
            this.listenerClass = stack.getVariable("listenerClass");
            this.loggingConfiguration =
                    ZVal.getStackReference(stack.getVariable("loggingConfiguration"));
            this.groupConfiguration =
                    ZVal.getStackReference(stack.getVariable("groupConfiguration"));
        }
    }
}
