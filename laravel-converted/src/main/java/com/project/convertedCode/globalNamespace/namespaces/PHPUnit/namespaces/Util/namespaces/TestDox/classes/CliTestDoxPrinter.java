package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.TestDox.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestSuite;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.PhptTestCase;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.TextUI.classes.ResultPrinter;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.TestDox.classes.TestResult;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Timer.classes.Timer;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.TestDox.classes.NamePrettifier;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/TestDox/CliTestDoxPrinter.php

*/

public class CliTestDoxPrinter extends ResultPrinter {

    public Object currentTestResult = null;

    public Object previousTestResult = null;

    public Object nonSuccessfulTestResults = ZVal.newArray();

    public Object prettifier = null;

    public CliTestDoxPrinter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CliTestDoxPrinter.class) {
            this.__construct(env, args);
        }
    }

    public CliTestDoxPrinter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "out",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "verbose",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 2, name = "colors")
    @ConvertedParameter(
        index = 3,
        name = "debug",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "numberOfColumns",
        defaultValue = "80",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 5,
        name = "reverse",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object out = assignParameter(args, 0, true);
        if (null == out) {
            out = ZVal.getNull();
        }
        Object verbose = assignParameter(args, 1, true);
        if (null == verbose) {
            verbose = false;
        }
        Object colors = assignParameter(args, 2, true);
        if (null == colors) {
            colors = CONST_COLOR_DEFAULT;
        }
        Object debug = assignParameter(args, 3, true);
        if (null == debug) {
            debug = false;
        }
        Object numberOfColumns = assignParameter(args, 4, true);
        if (null == numberOfColumns) {
            numberOfColumns = 80;
        }
        Object reverse = assignParameter(args, 5, true);
        if (null == reverse) {
            reverse = false;
        }
        super.__construct(env, out, verbose, colors, debug, numberOfColumns, reverse);
        this.prettifier = new NamePrettifier(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    public Object startTest(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/phpunit/phpunit/src/Util/TestDox")
                        .setFile("/vendor/phpunit/phpunit/src/Util/TestDox/CliTestDoxPrinter.php");
        Object test = assignParameter(args, 0, false);
        Object testMethod = null;
        ReferenceContainer annotations = new BasicReferenceContainer(null);
        Object className = null;
        Object _pClass = null;
        if (ZVal.toBool(
                        ZVal.toBool(
                                        !ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        test,
                                                        TestCase.class,
                                                        "PHPUnit\\Framework\\TestCase")))
                                && ZVal.toBool(
                                        !ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        test,
                                                        PhptTestCase.class,
                                                        "PHPUnit\\Runner\\PhptTestCase"))))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        test, TestSuite.class, "PHPUnit\\Framework\\TestSuite")))) {
            return null;
        }

        _pClass = function_get_class.f.env(env).call(test).value();
        if (ZVal.isTrue(
                ZVal.checkInstanceType(test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
            annotations.setObject(env.callMethod(test, "getAnnotations", CliTestDoxPrinter.class));
            if (arrayActionR(ArrayAction.ISSET, annotations, env, "class", "testdox", 0)) {
                className = ZVal.assign(annotations.arrayGet(env, "class", "testdox", 0));

            } else {
                className =
                        env.callMethod(
                                this.prettifier,
                                "prettifyTestClass",
                                CliTestDoxPrinter.class,
                                _pClass);
            }

            if (arrayActionR(ArrayAction.ISSET, annotations, env, "method", "testdox", 0)) {
                testMethod = ZVal.assign(annotations.arrayGet(env, "method", "testdox", 0));

            } else {
                testMethod =
                        env.callMethod(
                                this.prettifier,
                                "prettifyTestMethod",
                                CliTestDoxPrinter.class,
                                env.callMethod(test, "getName", CliTestDoxPrinter.class, false));
            }

            testMethod =
                    toStringR(testMethod, env)
                            + toStringR(
                                    function_substr
                                            .f
                                            .env(env)
                                            .call(
                                                    env.callMethod(
                                                            test,
                                                            "getDataSetAsString",
                                                            CliTestDoxPrinter.class,
                                                            false),
                                                    5)
                                            .value(),
                                    env);

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(test, TestSuite.class, "PHPUnit\\Framework\\TestSuite"))) {
            className = env.callMethod(test, "getName", CliTestDoxPrinter.class);
            testMethod =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "Error bootstapping suite (most likely in %s::setUpBeforeClass)",
                                    env.callMethod(test, "getName", CliTestDoxPrinter.class))
                            .value();

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        test, PhptTestCase.class, "PHPUnit\\Runner\\PhptTestCase"))) {
            className = ZVal.assign(_pClass);
            testMethod = env.callMethod(test, "getName", CliTestDoxPrinter.class);
        }

        this.currentTestResult =
                new TestResult(
                        env,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "PHPUnit\\Util\\TestDox",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "color", typeHint = "string")
                            @ConvertedParameter(index = 1, name = "buffer", typeHint = "string")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                Object color = assignParameter(args, 0, false);
                                Object buffer = assignParameter(args, 1, false);
                                return ZVal.assign(
                                        env.callMethod(
                                                _closureThisVar,
                                                "formatWithColor",
                                                CliTestDoxPrinter.class,
                                                color,
                                                buffer));
                            }
                        },
                        className,
                        testMethod);
        super.startTest(env, test);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "time", typeHint = "float")
    public Object endTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object time = assignParameter(args, 1, false);
        if (ZVal.toBool(
                        ZVal.toBool(
                                        !ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        test,
                                                        TestCase.class,
                                                        "PHPUnit\\Framework\\TestCase")))
                                && ZVal.toBool(
                                        !ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        test,
                                                        PhptTestCase.class,
                                                        "PHPUnit\\Runner\\PhptTestCase"))))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        test, TestSuite.class, "PHPUnit\\Framework\\TestSuite")))) {
            return null;
        }

        super.endTest(env, test, time);
        env.callMethod(this.currentTestResult, "setRuntime", CliTestDoxPrinter.class, time);
        env.callMethod(
                this,
                "write",
                CliTestDoxPrinter.class,
                env.callMethod(
                        this.currentTestResult,
                        "toString",
                        CliTestDoxPrinter.class,
                        this.previousTestResult,
                        toObjectR(this).accessProp(this, env).name("verbose").value()));
        this.previousTestResult = this.currentTestResult;
        if (!ZVal.isTrue(
                env.callMethod(
                        this.currentTestResult, "isTestSuccessful", CliTestDoxPrinter.class))) {
            new ReferenceClassProperty(this, "nonSuccessfulTestResults", env)
                    .arrayAppend(env)
                    .set(this.currentTestResult);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "t", typeHint = "Throwable")
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object addError(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object t = assignParameter(args, 1, false);
        Object time = assignParameter(args, 2, false);
        env.callMethod(
                this.currentTestResult,
                "fail",
                CliTestDoxPrinter.class,
                env.callMethod(
                        this, "formatWithColor", CliTestDoxPrinter.class, "fg-yellow", "\u2718"),
                toStringR(t, env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "e", typeHint = "PHPUnit\\Framework\\Warning")
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object addWarning(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object e = assignParameter(args, 1, false);
        Object time = assignParameter(args, 2, false);
        env.callMethod(
                this.currentTestResult,
                "fail",
                CliTestDoxPrinter.class,
                env.callMethod(
                        this, "formatWithColor", CliTestDoxPrinter.class, "fg-yellow", "\u2718"),
                toStringR(e, env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(
        index = 1,
        name = "e",
        typeHint = "PHPUnit\\Framework\\AssertionFailedError"
    )
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object addFailure(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object e = assignParameter(args, 1, false);
        Object time = assignParameter(args, 2, false);
        env.callMethod(
                this.currentTestResult,
                "fail",
                CliTestDoxPrinter.class,
                env.callMethod(
                        this, "formatWithColor", CliTestDoxPrinter.class, "fg-red", "\u2718"),
                toStringR(e, env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "t", typeHint = "Throwable")
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object addIncompleteTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object t = assignParameter(args, 1, false);
        Object time = assignParameter(args, 2, false);
        env.callMethod(
                this.currentTestResult,
                "fail",
                CliTestDoxPrinter.class,
                env.callMethod(
                        this, "formatWithColor", CliTestDoxPrinter.class, "fg-yellow", "\u2205"),
                toStringR(t, env),
                true);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "t", typeHint = "Throwable")
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object addRiskyTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object t = assignParameter(args, 1, false);
        Object time = assignParameter(args, 2, false);
        env.callMethod(
                this.currentTestResult,
                "fail",
                CliTestDoxPrinter.class,
                env.callMethod(
                        this, "formatWithColor", CliTestDoxPrinter.class, "fg-yellow", "\u2622"),
                toStringR(t, env),
                true);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "t", typeHint = "Throwable")
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object addSkippedTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object t = assignParameter(args, 1, false);
        Object time = assignParameter(args, 2, false);
        env.callMethod(
                this.currentTestResult,
                "fail",
                CliTestDoxPrinter.class,
                env.callMethod(
                        this, "formatWithColor", CliTestDoxPrinter.class, "fg-yellow", "\u2192"),
                toStringR(t, env),
                true);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "progress", typeHint = "string")
    public Object writeProgress(RuntimeEnv env, Object... args) {
        Object progress = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    public Object flush(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "result", typeHint = "PHPUnit\\Framework\\TestResult")
    public Object printResult(RuntimeEnv env, Object... args) {
        Object result = assignParameter(args, 0, false);
        this.printHeader(env);
        this.printNonSuccessfulTestsSummary(
                env, env.callMethod(result, "count", CliTestDoxPrinter.class));
        env.callMethod(this, "printFooter", CliTestDoxPrinter.class, result);
        return null;
    }

    @ConvertedMethod
    protected Object printHeader(RuntimeEnv env, Object... args) {
        env.callMethod(
                this,
                "write",
                CliTestDoxPrinter.class,
                "\n" + toStringR(Timer.runtimeStaticObject.resourceUsage(env), env) + "\n\n");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "numberOfExecutedTests", typeHint = "int")
    private Object printNonSuccessfulTestsSummary(RuntimeEnv env, Object... args) {
        Object numberOfExecutedTests = assignParameter(args, 0, false);
        Object previousTestResult = null;
        Object testResult = null;
        Object numberOfNonSuccessfulTests = null;
        numberOfNonSuccessfulTests =
                function_count.f.env(env).call(this.nonSuccessfulTestResults).value();
        if (ZVal.strictEqualityCheck(numberOfNonSuccessfulTests, "===", 0)) {
            return null;
        }

        if (ZVal.isGreaterThanOrEqualTo(
                ZVal.divide(numberOfNonSuccessfulTests, numberOfExecutedTests), ">=", 0.7)) {
            return null;
        }

        env.callMethod(
                this, "write", CliTestDoxPrinter.class, "Summary of non-successful tests:\n\n");
        previousTestResult = ZVal.getNull();
        for (ZPair zpairResult1325 : ZVal.getIterable(this.nonSuccessfulTestResults, env, true)) {
            testResult = ZVal.assign(zpairResult1325.getValue());
            env.callMethod(
                    this,
                    "write",
                    CliTestDoxPrinter.class,
                    env.callMethod(
                            testResult,
                            "toString",
                            CliTestDoxPrinter.class,
                            previousTestResult,
                            toObjectR(this).accessProp(this, env).name("verbose").value()));
            previousTestResult = ZVal.assign(testResult);
        }

        return null;
    }

    public static final Object CONST_class = "PHPUnit\\Util\\TestDox\\CliTestDoxPrinter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ResultPrinter.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\TestDox\\CliTestDoxPrinter")
                    .setLookup(
                            CliTestDoxPrinter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "autoFlush",
                            "colors",
                            "column",
                            "currentTestResult",
                            "debug",
                            "defectListPrinted",
                            "lastTestFailed",
                            "maxColumn",
                            "nonSuccessfulTestResults",
                            "numAssertions",
                            "numTests",
                            "numTestsRun",
                            "numTestsWidth",
                            "numberOfColumns",
                            "out",
                            "outTarget",
                            "prettifier",
                            "previousTestResult",
                            "reverse",
                            "verbose")
                    .setFilename("vendor/phpunit/phpunit/src/Util/TestDox/CliTestDoxPrinter.php")
                    .addInterface("PHPUnit\\Framework\\TestListener")
                    .addExtendsClass("PHPUnit\\TextUI\\ResultPrinter")
                    .addExtendsClass("PHPUnit\\Util\\Printer")
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
