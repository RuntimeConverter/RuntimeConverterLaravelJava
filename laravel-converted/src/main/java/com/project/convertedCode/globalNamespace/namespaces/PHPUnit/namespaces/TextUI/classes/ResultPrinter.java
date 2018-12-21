package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.TextUI.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reverse;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.InvalidArgumentHelper;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Printer;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Test;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.PhptTestCase;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Environment.classes.Console;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestListener;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Timer.classes.Timer;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.math.function_floor;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/TextUI/ResultPrinter.php

*/

public class ResultPrinter extends Printer implements TestListener {

    public Object column = 0;

    public Object maxColumn = null;

    public Object lastTestFailed = false;

    public Object numAssertions = 0;

    public Object numTests = -1;

    public Object numTestsRun = 0;

    public Object numTestsWidth = null;

    public Object colors = false;

    public Object debug = false;

    public Object verbose = false;

    public Object numberOfColumns = null;

    public Object reverse = null;

    public Object defectListPrinted = false;

    public ResultPrinter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ResultPrinter.class) {
            this.__construct(env, args);
        }
    }

    public ResultPrinter(NoConstructor n) {
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
        Object console = null;
        Object maxNumberOfColumns = null;
        super.__construct(env, out);
        if (!function_in_array.f.env(env).call(colors, CONST_AVAILABLE_COLORS, true).getBool()) {
            throw ZVal.getException(
                    env,
                    InvalidArgumentHelper.runtimeStaticObject.factory(
                            env,
                            3,
                            NamespaceGlobal.vsprintf
                                    .env(env)
                                    .call(
                                            "value from \"%s\", \"%s\" or \"%s\"",
                                            CONST_AVAILABLE_COLORS)
                                    .value()));
        }

        if (ZVal.toBool(!function_is_int.f.env(env).call(numberOfColumns).getBool())
                && ZVal.toBool(ZVal.strictNotEqualityCheck(numberOfColumns, "!==", "max"))) {
            throw ZVal.getException(
                    env,
                    InvalidArgumentHelper.runtimeStaticObject.factory(
                            env, 5, "integer or \"max\""));
        }

        console = new Console(env);
        maxNumberOfColumns = env.callMethod(console, "getNumberOfColumns", ResultPrinter.class);
        if (ZVal.toBool(ZVal.strictEqualityCheck(numberOfColumns, "===", "max"))
                || ZVal.toBool(
                        ZVal.toBool(ZVal.strictNotEqualityCheck(numberOfColumns, "!==", 80))
                                && ZVal.toBool(
                                        ZVal.isGreaterThan(
                                                numberOfColumns, '>', maxNumberOfColumns)))) {
            numberOfColumns = ZVal.assign(maxNumberOfColumns);
        }

        this.numberOfColumns = numberOfColumns;
        this.verbose = verbose;
        this.debug = debug;
        this.reverse = reverse;
        if (ZVal.toBool(ZVal.strictEqualityCheck(colors, "===", CONST_COLOR_AUTO))
                && ZVal.toBool(env.callMethod(console, "hasColorSupport", ResultPrinter.class))) {
            this.colors = true;

        } else {
            this.colors = ZVal.strictEqualityCheck(CONST_COLOR_ALWAYS, "===", colors);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "result", typeHint = "PHPUnit\\Framework\\TestResult")
    public Object printResult(RuntimeEnv env, Object... args) {
        Object result = assignParameter(args, 0, false);
        this.printHeader(env);
        this.printErrors(env, result);
        this.printWarnings(env, result);
        this.printFailures(env, result);
        this.printRisky(env, result);
        if (ZVal.isTrue(this.verbose)) {
            this.printIncompletes(env, result);
            this.printSkipped(env, result);
        }

        this.printFooter(env, result);
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
        this.writeProgressWithColor(env, "fg-red, bold", "E");
        this.lastTestFailed = true;
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
        this.writeProgressWithColor(env, "bg-red, fg-white", "F");
        this.lastTestFailed = true;
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
        this.writeProgressWithColor(env, "fg-yellow, bold", "W");
        this.lastTestFailed = true;
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
        this.writeProgressWithColor(env, "fg-yellow, bold", "I");
        this.lastTestFailed = true;
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
        this.writeProgressWithColor(env, "fg-yellow, bold", "R");
        this.lastTestFailed = true;
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
        this.writeProgressWithColor(env, "fg-cyan, bold", "S");
        this.lastTestFailed = true;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    public Object startTestSuite(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, false);
        if (ZVal.equalityCheck(this.numTests, -1)) {
            this.numTests = function_count.f.env(env).call(suite).value();
            this.numTestsWidth =
                    function_strlen.f.env(env).call(toStringR(this.numTests, env)).value();
            this.maxColumn =
                    ZVal.subtract(
                            ZVal.subtract(
                                    this.numberOfColumns,
                                    function_strlen.f.env(env).call("  /  (XXX%)").value()),
                            ZVal.multiply(2, this.numTestsWidth));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    public Object endTestSuite(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    public Object startTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.debug)) {
            env.callMethod(
                    this,
                    "write",
                    ResultPrinter.class,
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "Test '%s' started\n",
                                    Test.runtimeStaticObject.describeAsString(env, test))
                            .value());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "time", typeHint = "float")
    public Object endTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object time = assignParameter(args, 1, false);
        if (ZVal.isTrue(this.debug)) {
            env.callMethod(
                    this,
                    "write",
                    ResultPrinter.class,
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "Test '%s' ended\n",
                                    Test.runtimeStaticObject.describeAsString(env, test))
                            .value());
        }

        if (!ZVal.isTrue(this.lastTestFailed)) {
            this.writeProgress(env, ".");
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
            this.numAssertions =
                    ZAssignment.add(
                            "+=",
                            this.numAssertions,
                            env.callMethod(test, "getNumAssertions", ResultPrinter.class));

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        test, PhptTestCase.class, "PHPUnit\\Runner\\PhptTestCase"))) {
            this.numAssertions = ZVal.increment(this.numAssertions);
        }

        this.lastTestFailed = false;
        if (ZVal.toBool(
                        ZVal.checkInstanceType(
                                test, TestCase.class, "PHPUnit\\Framework\\TestCase"))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        test, "hasExpectationOnOutput", ResultPrinter.class)))) {
            env.callMethod(
                    this,
                    "write",
                    ResultPrinter.class,
                    env.callMethod(test, "getActualOutput", ResultPrinter.class));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "defects", typeHint = "array")
    @ConvertedParameter(index = 1, name = "type", typeHint = "string")
    protected Object printDefects(RuntimeEnv env, Object... args) {
        Object defects = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, false);
        Object defect = null;
        Object count = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        count = function_count.f.env(env).call(defects).value();
        if (ZVal.equalityCheck(count, 0)) {
            return null;
        }

        if (ZVal.isTrue(this.defectListPrinted)) {
            env.callMethod(this, "write", ResultPrinter.class, "\n--\n\n");
        }

        env.callMethod(
                this,
                "write",
                ResultPrinter.class,
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "There %s %d %s%s:\n",
                                ZVal.equalityCheck(count, 1) ? "was" : "were",
                                count,
                                type,
                                ZVal.equalityCheck(count, 1) ? "" : "s")
                        .value());
        i.setObject(1);
        if (ZVal.isTrue(this.reverse)) {
            defects = function_array_reverse.f.env(env).call(defects).value();
        }

        for (ZPair zpairResult1238 : ZVal.getIterable(defects, env, true)) {
            defect = ZVal.assign(zpairResult1238.getValue());
            this.printDefect(env, defect, ZVal.postIncrement(i));
        }

        this.defectListPrinted = true;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "defect", typeHint = "PHPUnit\\Framework\\TestFailure")
    @ConvertedParameter(index = 1, name = "count", typeHint = "int")
    protected Object printDefect(RuntimeEnv env, Object... args) {
        Object defect = assignParameter(args, 0, false);
        Object count = assignParameter(args, 1, false);
        this.printDefectHeader(env, defect, count);
        this.printDefectTrace(env, defect);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "defect", typeHint = "PHPUnit\\Framework\\TestFailure")
    @ConvertedParameter(index = 1, name = "count", typeHint = "int")
    protected Object printDefectHeader(RuntimeEnv env, Object... args) {
        Object defect = assignParameter(args, 0, false);
        Object count = assignParameter(args, 1, false);
        env.callMethod(
                this,
                "write",
                ResultPrinter.class,
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "\n%d) %s\n",
                                count, env.callMethod(defect, "getTestName", ResultPrinter.class))
                        .value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "defect", typeHint = "PHPUnit\\Framework\\TestFailure")
    protected Object printDefectTrace(RuntimeEnv env, Object... args) {
        Object defect = assignParameter(args, 0, false);
        Object e = null;
        e = env.callMethod(defect, "thrownException", ResultPrinter.class);
        env.callMethod(this, "write", ResultPrinter.class, toStringR(e, env));
        while (ZVal.isTrue(e = env.callMethod(e, "getPrevious", ResultPrinter.class))) {
            env.callMethod(this, "write", ResultPrinter.class, "\nCaused by\n" + toStringR(e, env));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "result", typeHint = "PHPUnit\\Framework\\TestResult")
    protected Object printErrors(RuntimeEnv env, Object... args) {
        Object result = assignParameter(args, 0, false);
        this.printDefects(env, env.callMethod(result, "errors", ResultPrinter.class), "error");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "result", typeHint = "PHPUnit\\Framework\\TestResult")
    protected Object printFailures(RuntimeEnv env, Object... args) {
        Object result = assignParameter(args, 0, false);
        this.printDefects(env, env.callMethod(result, "failures", ResultPrinter.class), "failure");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "result", typeHint = "PHPUnit\\Framework\\TestResult")
    protected Object printWarnings(RuntimeEnv env, Object... args) {
        Object result = assignParameter(args, 0, false);
        this.printDefects(env, env.callMethod(result, "warnings", ResultPrinter.class), "warning");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "result", typeHint = "PHPUnit\\Framework\\TestResult")
    protected Object printIncompletes(RuntimeEnv env, Object... args) {
        Object result = assignParameter(args, 0, false);
        this.printDefects(
                env,
                env.callMethod(result, "notImplemented", ResultPrinter.class),
                "incomplete test");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "result", typeHint = "PHPUnit\\Framework\\TestResult")
    protected Object printRisky(RuntimeEnv env, Object... args) {
        Object result = assignParameter(args, 0, false);
        this.printDefects(env, env.callMethod(result, "risky", ResultPrinter.class), "risky test");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "result", typeHint = "PHPUnit\\Framework\\TestResult")
    protected Object printSkipped(RuntimeEnv env, Object... args) {
        Object result = assignParameter(args, 0, false);
        this.printDefects(
                env, env.callMethod(result, "skipped", ResultPrinter.class), "skipped test");
        return null;
    }

    @ConvertedMethod
    protected Object printHeader(RuntimeEnv env, Object... args) {
        env.callMethod(
                this,
                "write",
                ResultPrinter.class,
                "\n\n" + toStringR(Timer.runtimeStaticObject.resourceUsage(env), env) + "\n\n");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "result", typeHint = "PHPUnit\\Framework\\TestResult")
    protected Object printFooter(RuntimeEnv env, Object... args) {
        Object result = assignParameter(args, 0, false);
        Object color = null;
        if (ZVal.strictEqualityCheck(function_count.f.env(env).call(result).value(), "===", 0)) {
            this.writeWithColor(env, "fg-black, bg-yellow", "No tests executed!");
            return null;
        }

        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.toBool(
                                                        env.callMethod(
                                                                result,
                                                                "wasSuccessful",
                                                                ResultPrinter.class))
                                                && ZVal.toBool(
                                                        env.callMethod(
                                                                result,
                                                                "allHarmless",
                                                                ResultPrinter.class)))
                                && ZVal.toBool(
                                        env.callMethod(
                                                result,
                                                "allCompletelyImplemented",
                                                ResultPrinter.class)))
                && ZVal.toBool(env.callMethod(result, "noneSkipped", ResultPrinter.class))) {
            this.writeWithColor(
                    env,
                    "fg-black, bg-green",
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "OK (%d test%s, %d assertion%s)",
                                    function_count.f.env(env).call(result).value(),
                                    ZVal.equalityCheck(
                                                    function_count.f.env(env).call(result).value(),
                                                    1)
                                            ? ""
                                            : "s",
                                    this.numAssertions,
                                    ZVal.equalityCheck(this.numAssertions, 1) ? "" : "s")
                            .value());

        } else {
            if (ZVal.isTrue(env.callMethod(result, "wasSuccessful", ResultPrinter.class))) {
                color = "fg-black, bg-yellow";
                if (ZVal.toBool(this.verbose)
                        || ZVal.toBool(
                                !ZVal.isTrue(
                                        env.callMethod(
                                                result, "allHarmless", ResultPrinter.class)))) {
                    env.callMethod(this, "write", ResultPrinter.class, "\n");
                }

                this.writeWithColor(env, color, "OK, but incomplete, skipped, or risky tests!");

            } else {
                env.callMethod(this, "write", ResultPrinter.class, "\n");
                if (ZVal.isTrue(env.callMethod(result, "errorCount", ResultPrinter.class))) {
                    color = "fg-white, bg-red";
                    this.writeWithColor(env, color, "ERRORS!");

                } else if (ZVal.isTrue(
                        env.callMethod(result, "failureCount", ResultPrinter.class))) {
                    color = "fg-white, bg-red";
                    this.writeWithColor(env, color, "FAILURES!");

                } else if (ZVal.isTrue(
                        env.callMethod(result, "warningCount", ResultPrinter.class))) {
                    color = "fg-black, bg-yellow";
                    this.writeWithColor(env, color, "WARNINGS!");
                }
            }

            this.writeCountString(
                    env, function_count.f.env(env).call(result).value(), "Tests", color, true);
            this.writeCountString(env, this.numAssertions, "Assertions", color, true);
            this.writeCountString(
                    env,
                    env.callMethod(result, "errorCount", ResultPrinter.class),
                    "Errors",
                    color);
            this.writeCountString(
                    env,
                    env.callMethod(result, "failureCount", ResultPrinter.class),
                    "Failures",
                    color);
            this.writeCountString(
                    env,
                    env.callMethod(result, "warningCount", ResultPrinter.class),
                    "Warnings",
                    color);
            this.writeCountString(
                    env,
                    env.callMethod(result, "skippedCount", ResultPrinter.class),
                    "Skipped",
                    color);
            this.writeCountString(
                    env,
                    env.callMethod(result, "notImplementedCount", ResultPrinter.class),
                    "Incomplete",
                    color);
            this.writeCountString(
                    env, env.callMethod(result, "riskyCount", ResultPrinter.class), "Risky", color);
            this.writeWithColor(env, color, ".");
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "progress", typeHint = "string")
    protected Object writeProgress(RuntimeEnv env, Object... args) {
        Object progress = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.debug)) {
            return null;
        }

        env.callMethod(this, "write", ResultPrinter.class, progress);
        this.column = ZVal.increment(this.column);
        this.numTestsRun = ZVal.increment(this.numTestsRun);
        if (ZVal.toBool(ZVal.equalityCheck(this.column, this.maxColumn))
                || ZVal.toBool(ZVal.equalityCheck(this.numTestsRun, this.numTests))) {
            if (ZVal.equalityCheck(this.numTestsRun, this.numTests)) {
                env.callMethod(
                        this,
                        "write",
                        ResultPrinter.class,
                        function_str_repeat
                                .f
                                .env(env)
                                .call(" ", ZVal.subtract(this.maxColumn, this.column))
                                .value());
            }

            env.callMethod(
                    this,
                    "write",
                    ResultPrinter.class,
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    " %"
                                            + toStringR(this.numTestsWidth, env)
                                            + "d / %"
                                            + toStringR(this.numTestsWidth, env)
                                            + "d (%3s%%)",
                                    this.numTestsRun,
                                    this.numTests,
                                    function_floor
                                            .f
                                            .env(env)
                                            .call(
                                                    ZVal.multiply(
                                                            ZVal.divide(
                                                                    this.numTestsRun,
                                                                    this.numTests),
                                                            100))
                                            .value())
                            .value());
            if (ZVal.equalityCheck(this.column, this.maxColumn)) {
                this.writeNewLine(env);
            }
        }

        return null;
    }

    @ConvertedMethod
    protected Object writeNewLine(RuntimeEnv env, Object... args) {
        this.column = 0;
        env.callMethod(this, "write", ResultPrinter.class, "\n");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "color", typeHint = "string")
    @ConvertedParameter(index = 1, name = "buffer", typeHint = "string")
    protected Object formatWithColor(RuntimeEnv env, Object... args) {
        Object color = assignParameter(args, 0, false);
        Object buffer = assignParameter(args, 1, false);
        Object codes = null;
        Object padding = null;
        Object code = null;
        Object line = null;
        ReferenceContainer styledLines = new BasicReferenceContainer(null);
        ReferenceContainer styles = new BasicReferenceContainer(null);
        Object style = null;
        Object lines = null;
        if (!ZVal.isTrue(this.colors)) {
            return ZVal.assign(buffer);
        }

        codes =
                function_array_map
                        .f
                        .env(env)
                        .call("\\trim", function_explode.f.env(env).call(",", color).value())
                        .value();
        lines = function_explode.f.env(env).call("\n", buffer).value();
        padding =
                NamespaceGlobal.max
                        .env(env)
                        .call(function_array_map.f.env(env).call("\\strlen", lines).value())
                        .value();
        styles.setObject(ZVal.newArray());
        for (ZPair zpairResult1239 : ZVal.getIterable(codes, env, true)) {
            code = ZVal.assign(zpairResult1239.getValue());
            styles.arrayAppend(env)
                    .set(
                            env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .PHPUnit
                                                    .namespaces
                                                    .TextUI
                                                    .classes
                                                    .ResultPrinter
                                                    .RequestStaticProperties
                                                    .class,
                                            "ansiCodes")
                                    .arrayGet(env, code));
        }

        style =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "\u001B[%sm",
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(";", styles.getObject())
                                        .value())
                        .value();
        styledLines.setObject(ZVal.newArray());
        for (ZPair zpairResult1240 : ZVal.getIterable(lines, env, true)) {
            line = ZVal.assign(zpairResult1240.getValue());
            styledLines
                    .arrayAppend(env)
                    .set(
                            toStringR(style, env)
                                    + toStringR(
                                            NamespaceGlobal.str_pad
                                                    .env(env)
                                                    .call(line, padding)
                                                    .value(),
                                            env)
                                    + "\u001B[0m");
        }

        return ZVal.assign(
                NamespaceGlobal.implode.env(env).call("\n", styledLines.getObject()).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "color", typeHint = "string")
    @ConvertedParameter(index = 1, name = "buffer", typeHint = "string")
    @ConvertedParameter(
        index = 2,
        name = "lf",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    protected Object writeWithColor(RuntimeEnv env, Object... args) {
        Object color = assignParameter(args, 0, false);
        Object buffer = assignParameter(args, 1, false);
        Object lf = assignParameter(args, 2, true);
        if (null == lf) {
            lf = true;
        }
        env.callMethod(
                this, "write", ResultPrinter.class, this.formatWithColor(env, color, buffer));
        if (ZVal.isTrue(lf)) {
            env.callMethod(this, "write", ResultPrinter.class, "\n");
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "color", typeHint = "string")
    @ConvertedParameter(index = 1, name = "buffer", typeHint = "string")
    protected Object writeProgressWithColor(RuntimeEnv env, Object... args) {
        Object color = assignParameter(args, 0, false);
        Object buffer = assignParameter(args, 1, false);
        buffer = this.formatWithColor(env, color, buffer);
        this.writeProgress(env, buffer);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "count", typeHint = "int")
    @ConvertedParameter(index = 1, name = "name", typeHint = "string")
    @ConvertedParameter(index = 2, name = "color", typeHint = "string")
    @ConvertedParameter(
        index = 3,
        name = "always",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    private Object writeCountString(RuntimeEnv env, Object... args) {
        Object count = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        Object color = assignParameter(args, 2, false);
        Object always = assignParameter(args, 3, true);
        if (null == always) {
            always = false;
        }
        ReferenceContainer first = new BasicReferenceContainer(null);
        first = env.getInlineStatic(21, true);
        if (ZVal.toBool(always) || ZVal.toBool(ZVal.isGreaterThan(count, '>', 0))) {
            this.writeWithColor(
                    env,
                    color,
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "%s%s: %d",
                                    !ZVal.isTrue(first.getObject()) ? ", " : "", name, count)
                            .value(),
                    false);
            first.setObject(false);
        }

        return null;
    }

    public static final Object CONST_EVENT_TEST_START = 0;

    public static final Object CONST_EVENT_TEST_END = 1;

    public static final Object CONST_EVENT_TESTSUITE_START = 2;

    public static final Object CONST_EVENT_TESTSUITE_END = 3;

    public static final Object CONST_COLOR_NEVER = "never";

    public static final Object CONST_COLOR_AUTO = "auto";

    public static final Object CONST_COLOR_ALWAYS = "always";

    public static final Object CONST_COLOR_DEFAULT = CONST_COLOR_NEVER;

    public static final Object CONST_AVAILABLE_COLORS =
            ZVal.newArray(
                    new ZPair(0, CONST_COLOR_NEVER),
                    new ZPair(1, CONST_COLOR_AUTO),
                    new ZPair(2, CONST_COLOR_ALWAYS));

    public static final Object CONST_class = "PHPUnit\\TextUI\\ResultPrinter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Printer.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object ansiCodes =
                ZVal.newArray(
                        new ZPair("bold", 1),
                        new ZPair("fg-black", 30),
                        new ZPair("fg-red", 31),
                        new ZPair("fg-green", 32),
                        new ZPair("fg-yellow", 33),
                        new ZPair("fg-blue", 34),
                        new ZPair("fg-magenta", 35),
                        new ZPair("fg-cyan", 36),
                        new ZPair("fg-white", 37),
                        new ZPair("bg-black", 40),
                        new ZPair("bg-red", 41),
                        new ZPair("bg-green", 42),
                        new ZPair("bg-yellow", 43),
                        new ZPair("bg-blue", 44),
                        new ZPair("bg-magenta", 45),
                        new ZPair("bg-cyan", 46),
                        new ZPair("bg-white", 47));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\TextUI\\ResultPrinter")
                    .setLookup(
                            ResultPrinter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "autoFlush",
                            "colors",
                            "column",
                            "debug",
                            "defectListPrinted",
                            "lastTestFailed",
                            "maxColumn",
                            "numAssertions",
                            "numTests",
                            "numTestsRun",
                            "numTestsWidth",
                            "numberOfColumns",
                            "out",
                            "outTarget",
                            "reverse",
                            "verbose")
                    .setStaticPropertyNames("ansiCodes")
                    .setFilename("vendor/phpunit/phpunit/src/TextUI/ResultPrinter.php")
                    .addInterface("PHPUnit\\Framework\\TestListener")
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
