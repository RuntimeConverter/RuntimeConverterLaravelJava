package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.RiskyTest;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_error_handler;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Printer;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Assert;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Test;
import com.runtimeconverter.runtime.nativeClasses.errors.AssertionError;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Blacklist;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.AssertionFailedError;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.UnintentionallyCoveredCodeError;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.ErrorHandler;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.ResourceOperations.classes.ResourceOperations;
import com.runtimeconverter.runtime.exceptions.missingDefinitions.ClassNotFoundDuringConversion;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.IncompleteTest;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.UnintentionallyCoveredCodeException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.OutputError;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_error_handler;
import com.runtimeconverter.runtime.nativeClasses.errors.PHPError;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.ExceptionWrapper;
import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.RiskyTestError;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Warning;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestFailure;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.InvalidCoversTargetException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.WarningTestCase;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SkippedTest;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_extension_loaded;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Timer.classes.Timer;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.IncompleteTestError;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SkippedTestError;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/TestResult.php

*/

public class TestResult extends RuntimeClassBase implements Countable {

    public Object passed = ZVal.newArray();

    public Object errors = ZVal.newArray();

    public Object failures = ZVal.newArray();

    public Object warnings = ZVal.newArray();

    public Object notImplemented = ZVal.newArray();

    public Object risky = ZVal.newArray();

    public Object skipped = ZVal.newArray();

    public Object listeners = ZVal.newArray();

    public Object runTests = 0;

    public Object time = 0;

    public Object topTestSuite = null;

    public Object codeCoverage = null;

    public Object convertErrorsToExceptions = true;

    public Object stop = false;

    public Object stopOnError = false;

    public Object stopOnFailure = false;

    public Object stopOnWarning = false;

    public Object beStrictAboutTestsThatDoNotTestAnything = true;

    public Object beStrictAboutOutputDuringTests = false;

    public Object beStrictAboutTodoAnnotatedTests = false;

    public Object beStrictAboutResourceUsageDuringSmallTests = false;

    public Object enforceTimeLimit = false;

    public Object timeoutForSmallTests = 1;

    public Object timeoutForMediumTests = 10;

    public Object timeoutForLargeTests = 60;

    public Object stopOnRisky = false;

    public Object stopOnIncomplete = false;

    public Object stopOnSkipped = false;

    public Object lastTestFailed = false;

    public Object registerMockObjectsFromTestArgumentsRecursively = false;

    public TestResult(RuntimeEnv env, Object... args) {
        super(env);
    }

    public TestResult(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "listener", typeHint = "PHPUnit\\Framework\\TestListener")
    public Object addListener(RuntimeEnv env, Object... args) {
        Object listener = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "listeners", env).arrayAppend(env).set(listener);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "listener", typeHint = "PHPUnit\\Framework\\TestListener")
    public Object removeListener(RuntimeEnv env, Object... args) {
        Object listener = assignParameter(args, 0, false);
        Object _listener = null;
        Object key = null;
        for (ZPair zpairResult1189 : ZVal.getIterable(this.listeners, env, false)) {
            key = ZVal.assign(zpairResult1189.getKey());
            _listener = ZVal.assign(zpairResult1189.getValue());
            if (ZVal.strictEqualityCheck(listener, "===", _listener)) {
                arrayActionR(
                        ArrayAction.UNSET,
                        new ReferenceClassProperty(this, "listeners", env),
                        env,
                        key);
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object flushListeners(RuntimeEnv env, Object... args) {
        Object listener = null;
        for (ZPair zpairResult1190 : ZVal.getIterable(this.listeners, env, true)) {
            listener = ZVal.assign(zpairResult1190.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(listener, Printer.class, "PHPUnit\\Util\\Printer"))) {
                env.callMethod(listener, "flush", TestResult.class);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "t", typeHint = "Throwable")
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object addError(RuntimeEnv env, Object... args) {
        ReferenceContainer test = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer t = new BasicReferenceContainer(assignParameter(args, 1, false));
        ReferenceContainer time = new BasicReferenceContainer(assignParameter(args, 2, false));
        Object notifyMethod = null;
        Object listener = null;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        t.getObject(), RiskyTest.class, "PHPUnit\\Framework\\RiskyTest"))) {
            new ReferenceClassProperty(this, "risky", env)
                    .arrayAppend(env)
                    .set(new TestFailure(env, test.getObject(), t.getObject()));
            notifyMethod = "addRiskyTest";
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            test.getObject(), TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
                env.callMethod(test.getObject(), "markAsRisky", TestResult.class);
            }

            if (ZVal.isTrue(this.stopOnRisky)) {
                this.stop(env);
            }

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        t.getObject(),
                        IncompleteTest.class,
                        "PHPUnit\\Framework\\IncompleteTest"))) {
            new ReferenceClassProperty(this, "notImplemented", env)
                    .arrayAppend(env)
                    .set(new TestFailure(env, test.getObject(), t.getObject()));
            notifyMethod = "addIncompleteTest";
            if (ZVal.isTrue(this.stopOnIncomplete)) {
                this.stop(env);
            }

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        t.getObject(), SkippedTest.class, "PHPUnit\\Framework\\SkippedTest"))) {
            new ReferenceClassProperty(this, "skipped", env)
                    .arrayAppend(env)
                    .set(new TestFailure(env, test.getObject(), t.getObject()));
            notifyMethod = "addSkippedTest";
            if (ZVal.isTrue(this.stopOnSkipped)) {
                this.stop(env);
            }

        } else {
            new ReferenceClassProperty(this, "errors", env)
                    .arrayAppend(env)
                    .set(new TestFailure(env, test.getObject(), t.getObject()));
            notifyMethod = "addError";
            if (ZVal.toBool(this.stopOnError) || ZVal.toBool(this.stopOnFailure)) {
                this.stop(env);
            }
        }

        if (ZVal.isTrue(ZVal.checkInstanceType(t.getObject(), PHPError.class, "Error"))) {
            t.setObject(new ExceptionWrapper(env, t.getObject()));
        }

        for (ZPair zpairResult1191 : ZVal.getIterable(this.listeners, env, true)) {
            listener = ZVal.assign(zpairResult1191.getValue());
            env.callMethod(
                    listener,
                    new RuntimeArgsWithReferences().add(0, test).add(1, t).add(2, time),
                    toStringR(notifyMethod, env),
                    TestResult.class,
                    test.getObject(),
                    t.getObject(),
                    time.getObject());
        }

        this.lastTestFailed = true;
        this.time = ZAssignment.add("+=", this.time, time.getObject());
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
        Object listener = null;
        if (ZVal.isTrue(this.stopOnWarning)) {
            this.stop(env);
        }

        new ReferenceClassProperty(this, "warnings", env)
                .arrayAppend(env)
                .set(new TestFailure(env, test, e));
        for (ZPair zpairResult1192 : ZVal.getIterable(this.listeners, env, true)) {
            listener = ZVal.assign(zpairResult1192.getValue());
            env.callMethod(listener, "addWarning", TestResult.class, test, e, time);
        }

        this.time = ZAssignment.add("+=", this.time, time);
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
        ReferenceContainer test = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer e = new BasicReferenceContainer(assignParameter(args, 1, false));
        ReferenceContainer time = new BasicReferenceContainer(assignParameter(args, 2, false));
        Object notifyMethod = null;
        Object listener = null;
        if (ZVal.toBool(
                        ZVal.checkInstanceType(
                                e.getObject(), RiskyTest.class, "PHPUnit\\Framework\\RiskyTest"))
                || ZVal.toBool(
                        ZVal.checkInstanceType(
                                e.getObject(),
                                OutputError.class,
                                "PHPUnit\\Framework\\OutputError"))) {
            new ReferenceClassProperty(this, "risky", env)
                    .arrayAppend(env)
                    .set(new TestFailure(env, test.getObject(), e.getObject()));
            notifyMethod = "addRiskyTest";
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            test.getObject(), TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
                env.callMethod(test.getObject(), "markAsRisky", TestResult.class);
            }

            if (ZVal.isTrue(this.stopOnRisky)) {
                this.stop(env);
            }

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        e.getObject(),
                        IncompleteTest.class,
                        "PHPUnit\\Framework\\IncompleteTest"))) {
            new ReferenceClassProperty(this, "notImplemented", env)
                    .arrayAppend(env)
                    .set(new TestFailure(env, test.getObject(), e.getObject()));
            notifyMethod = "addIncompleteTest";
            if (ZVal.isTrue(this.stopOnIncomplete)) {
                this.stop(env);
            }

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        e.getObject(), SkippedTest.class, "PHPUnit\\Framework\\SkippedTest"))) {
            new ReferenceClassProperty(this, "skipped", env)
                    .arrayAppend(env)
                    .set(new TestFailure(env, test.getObject(), e.getObject()));
            notifyMethod = "addSkippedTest";
            if (ZVal.isTrue(this.stopOnSkipped)) {
                this.stop(env);
            }

        } else {
            new ReferenceClassProperty(this, "failures", env)
                    .arrayAppend(env)
                    .set(new TestFailure(env, test.getObject(), e.getObject()));
            notifyMethod = "addFailure";
            if (ZVal.isTrue(this.stopOnFailure)) {
                this.stop(env);
            }
        }

        for (ZPair zpairResult1193 : ZVal.getIterable(this.listeners, env, true)) {
            listener = ZVal.assign(zpairResult1193.getValue());
            env.callMethod(
                    listener,
                    new RuntimeArgsWithReferences().add(0, test).add(1, e).add(2, time),
                    toStringR(notifyMethod, env),
                    TestResult.class,
                    test.getObject(),
                    e.getObject(),
                    time.getObject());
        }

        this.lastTestFailed = true;
        this.time = ZAssignment.add("+=", this.time, time.getObject());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    public Object startTestSuite(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, false);
        Object listener = null;
        if (ZVal.strictEqualityCheck(this.topTestSuite, "===", ZVal.getNull())) {
            this.topTestSuite = suite;
        }

        for (ZPair zpairResult1194 : ZVal.getIterable(this.listeners, env, true)) {
            listener = ZVal.assign(zpairResult1194.getValue());
            env.callMethod(listener, "startTestSuite", TestResult.class, suite);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    public Object endTestSuite(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, false);
        Object listener = null;
        for (ZPair zpairResult1195 : ZVal.getIterable(this.listeners, env, true)) {
            listener = ZVal.assign(zpairResult1195.getValue());
            env.callMethod(listener, "endTestSuite", TestResult.class, suite);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    public Object startTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object listener = null;
        this.lastTestFailed = false;
        this.runTests =
                ZAssignment.add("+=", this.runTests, function_count.f.env(env).call(test).value());
        for (ZPair zpairResult1196 : ZVal.getIterable(this.listeners, env, true)) {
            listener = ZVal.assign(zpairResult1196.getValue());
            env.callMethod(listener, "startTest", TestResult.class, test);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "time", typeHint = "float")
    public Object endTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object time = assignParameter(args, 1, false);
        Object listener = null;
        Object _pClass = null;
        Object key = null;
        for (ZPair zpairResult1197 : ZVal.getIterable(this.listeners, env, true)) {
            listener = ZVal.assign(zpairResult1197.getValue());
            env.callMethod(listener, "endTest", TestResult.class, test, time);
        }

        if (ZVal.toBool(!ZVal.isTrue(this.lastTestFailed))
                && ZVal.toBool(
                        ZVal.checkInstanceType(
                                test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
            _pClass = function_get_class.f.env(env).call(test).value();
            key =
                    toStringR(_pClass, env)
                            + "::"
                            + toStringR(env.callMethod(test, "getName", TestResult.class), env);
            new ReferenceClassProperty(this, "passed", env)
                    .arrayAccess(env, key)
                    .set(
                            ZVal.newArray(
                                    new ZPair(
                                            "result",
                                            env.callMethod(test, "getResult", TestResult.class)),
                                    new ZPair(
                                            "size",
                                            Test.runtimeStaticObject.getSize(
                                                    env,
                                                    _pClass,
                                                    env.callMethod(
                                                            test,
                                                            "getName",
                                                            TestResult.class,
                                                            false)))));
            this.time = ZAssignment.add("+=", this.time, time);
        }

        return null;
    }

    @ConvertedMethod
    public Object allHarmless(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.equalityCheck(this.riskyCount(env), 0));
    }

    @ConvertedMethod
    public Object riskyCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_count.f.env(env).call(this.risky).value());
    }

    @ConvertedMethod
    public Object allCompletelyImplemented(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.equalityCheck(this.notImplementedCount(env), 0));
    }

    @ConvertedMethod
    public Object notImplementedCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_count.f.env(env).call(this.notImplemented).value());
    }

    @ConvertedMethod
    public Object risky(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.risky);
    }

    @ConvertedMethod
    public Object notImplemented(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.notImplemented);
    }

    @ConvertedMethod
    public Object noneSkipped(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.equalityCheck(this.skippedCount(env), 0));
    }

    @ConvertedMethod
    public Object skippedCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_count.f.env(env).call(this.skipped).value());
    }

    @ConvertedMethod
    public Object skipped(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.skipped);
    }

    @ConvertedMethod
    public Object errorCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_count.f.env(env).call(this.errors).value());
    }

    @ConvertedMethod
    public Object errors(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.errors);
    }

    @ConvertedMethod
    public Object failureCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_count.f.env(env).call(this.failures).value());
    }

    @ConvertedMethod
    public Object failures(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.failures);
    }

    @ConvertedMethod
    public Object warningCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_count.f.env(env).call(this.warnings).value());
    }

    @ConvertedMethod
    public Object warnings(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.warnings);
    }

    @ConvertedMethod
    public Object passed(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.passed);
    }

    @ConvertedMethod
    public Object topTestSuite(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.topTestSuite);
    }

    @ConvertedMethod
    public Object getCollectCodeCoverageInformation(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.strictNotEqualityCheck(this.codeCoverage, "!==", ZVal.getNull()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    public Object run(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object test = assignParameter(args, 0, false);
        Object errorHandlerSet = null;
        Object functions = null;
        Object cce = null;
        ReferenceContainer annotations = new BasicReferenceContainer(null);
        Object coversNothing = null;
        Object error = null;
        Object skipped = null;
        Object incomplete = null;
        Object linesToBeCovered = null;
        Object monitorFunctions = null;
        ReferenceContainer function = new BasicReferenceContainer(null);
        Object warning = null;
        Object _timeout = null;
        Object e = null;
        Object blacklist = null;
        Object invoker = null;
        Object oldErrorHandler = null;
        Object failure = null;
        Object linesToBeUsed = null;
        Object collectCodeCoverage = null;
        Object time = null;
        Object risky = null;
        Object append = null;
        ReferenceContainer frame = new BasicReferenceContainer(null);
        Assert.runtimeStaticObject.resetCount(env);
        coversNothing = false;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
            env.callMethod(
                    test,
                    "setRegisterMockObjectsFromTestArgumentsRecursively",
                    TestResult.class,
                    this.registerMockObjectsFromTestArgumentsRecursively);
            annotations.setObject(env.callMethod(test, "getAnnotations", TestResult.class));
            if (ZVal.toBool(
                            arrayActionR(
                                    ArrayAction.ISSET, annotations, env, "class", "coversNothing"))
                    || ZVal.toBool(
                            arrayActionR(
                                    ArrayAction.ISSET,
                                    annotations,
                                    env,
                                    "method",
                                    "coversNothing"))) {
                coversNothing = true;
            }
        }

        error = false;
        failure = false;
        warning = false;
        incomplete = false;
        risky = false;
        skipped = false;
        this.startTest(env, test);
        errorHandlerSet = false;
        if (ZVal.isTrue(this.convertErrorsToExceptions)) {
            oldErrorHandler =
                    function_set_error_handler
                            .f
                            .env(env)
                            .call(
                                    ZVal.newArray(
                                            new ZPair(0, ErrorHandler.CONST_class),
                                            new ZPair(1, "handleError")),
                                    ZVal.toLong(32767) | ZVal.toLong(2048))
                            .value();
            if (ZVal.strictEqualityCheck(oldErrorHandler, "===", ZVal.getNull())) {
                errorHandlerSet = true;

            } else {
                function_restore_error_handler.f.env(env).call();
            }
        }

        collectCodeCoverage =
                ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.strictNotEqualityCheck(
                                                        this.codeCoverage, "!==", ZVal.getNull()))
                                        && ZVal.toBool(
                                                !ZVal.isTrue(
                                                        ZVal.checkInstanceType(
                                                                test,
                                                                WarningTestCase.class,
                                                                "PHPUnit\\Framework\\WarningTestCase"))))
                        && ZVal.toBool(!ZVal.isTrue(coversNothing));
        if (ZVal.isTrue(collectCodeCoverage)) {
            env.callMethod(this.codeCoverage, "start", TestResult.class, test);
        }

        monitorFunctions =
                ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                this
                                                                        .beStrictAboutResourceUsageDuringSmallTests)
                                                        && ZVal.toBool(
                                                                !ZVal.isTrue(
                                                                        ZVal.checkInstanceType(
                                                                                test,
                                                                                WarningTestCase
                                                                                        .class,
                                                                                "PHPUnit\\Framework\\WarningTestCase"))))
                                        && ZVal.toBool(
                                                ZVal.equalityCheck(
                                                        env.callMethod(
                                                                test, "getSize", TestResult.class),
                                                        Test.CONST_SMALL)))
                        && ZVal.toBool(
                                function_function_exists
                                        .f
                                        .env(env)
                                        .call("xdebug_start_function_monitor")
                                        .value());
        if (ZVal.isTrue(monitorFunctions)) {
            com.runtimeconverter.runtime.ZVal.functionNotFound(
                            "___error23423346_namespace_function_not_found__(identifier:xdebug_start_function_monitor)_(namespace:\\)(source:xdebug_start_function_monitor)______")
                    .env(env)
                    .call(ResourceOperations.runtimeStaticObject.getFunctions(env));
        }

        Timer.runtimeStaticObject.start(env);
        try {
            if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.toBool(
                                                            ZVal.toBool(
                                                                            !ZVal.isTrue(
                                                                                    ZVal
                                                                                            .checkInstanceType(
                                                                                                    test,
                                                                                                    WarningTestCase
                                                                                                            .class,
                                                                                                    "PHPUnit\\Framework\\WarningTestCase")))
                                                                    && ZVal.toBool(
                                                                            ZVal.notEqualityCheck(
                                                                                    env.callMethod(
                                                                                            test,
                                                                                            "getSize",
                                                                                            TestResult
                                                                                                    .class),
                                                                                    Test
                                                                                            .CONST_UNKNOWN)))
                                                    && ZVal.toBool(this.enforceTimeLimit))
                                    && ZVal.toBool(
                                            function_extension_loaded
                                                    .f
                                                    .env(env)
                                                    .call("pcntl")
                                                    .value()))
                    && ZVal.toBool(
                            function_class_exists
                                    .f
                                    .env(env)
                                    .call("SebastianBergmann\\Invoker\\Invoker")
                                    .value())) {
                SwitchEnumType65 switchVariable65 =
                        ZVal.getEnum(
                                env.callMethod(test, "getSize", TestResult.class),
                                SwitchEnumType65.DEFAULT_CASE,
                                SwitchEnumType65.DYNAMIC_TYPE_247,
                                Test.CONST_SMALL,
                                SwitchEnumType65.DYNAMIC_TYPE_248,
                                Test.CONST_MEDIUM,
                                SwitchEnumType65.DYNAMIC_TYPE_249,
                                Test.CONST_LARGE);
                switch (switchVariable65) {
                    case DYNAMIC_TYPE_247:
                        _timeout = ZVal.assign(this.timeoutForSmallTests);
                        break;
                    case DYNAMIC_TYPE_248:
                        _timeout = ZVal.assign(this.timeoutForMediumTests);
                        break;
                    case DYNAMIC_TYPE_249:
                        _timeout = ZVal.assign(this.timeoutForLargeTests);
                        break;
                }
                ;
                invoker = env.createNew(ZVal.resolveClassAlias(env, "Invoker"));
                env.callMethod(
                        invoker,
                        "invoke",
                        TestResult.class,
                        ZVal.newArray(new ZPair(0, test), new ZPair(1, "runBare")),
                        ZVal.newArray(),
                        _timeout);

            } else {
                env.callMethod(test, "runBare", TestResult.class);
            }

        } catch (ConvertedException convertedException146) {
            if (ClassNotFoundDuringConversion.missingClassInCatchBlock("TimeoutException")) {
                e = convertedException146.getObject();
                this.addFailure(
                        env,
                        test,
                        new RiskyTestError(env, env.callMethod(e, "getMessage", TestResult.class)),
                        _timeout);
                risky = true;
            } else if (convertedException146.instanceOf(
                    com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .PHPUnit
                            .namespaces
                            .Framework
                            .namespaces
                            .MockObject
                            .classes
                            .Exception
                            .class,
                    "PHPUnit\\Framework\\MockObject\\Exception")) {
                e = convertedException146.getObject();
                e = new Warning(env, env.callMethod(e, "getMessage", TestResult.class));
                warning = true;
            } else if (convertedException146.instanceOf(
                    AssertionFailedError.class, "PHPUnit\\Framework\\AssertionFailedError")) {
                e = convertedException146.getObject();
                failure = true;
                if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                e, RiskyTestError.class, "PHPUnit\\Framework\\RiskyTestError"))) {
                    risky = true;

                } else if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                e,
                                IncompleteTestError.class,
                                "PHPUnit\\Framework\\IncompleteTestError"))) {
                    incomplete = true;

                } else if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                e,
                                SkippedTestError.class,
                                "PHPUnit\\Framework\\SkippedTestError"))) {
                    skipped = true;
                }

            } else if (convertedException146.instanceOf(AssertionError.class, "AssertionError")) {
                e = convertedException146.getObject();
                env.callMethod(test, "addToAssertionCount", TestResult.class, 1);
                failure = true;
                frame.setObject(
                        ZVal.assign(
                                handleReturnReference(
                                                env.callMethod(e, "getTrace", TestResult.class))
                                        .arrayGet(env, 0)));
                e =
                        new AssertionFailedError(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "%s in %s:%s",
                                                env.callMethod(e, "getMessage", TestResult.class),
                                                frame.arrayGet(env, "file"),
                                                frame.arrayGet(env, "line"))
                                        .value());
            } else if (convertedException146.instanceOf(
                    Warning.class, "PHPUnit\\Framework\\Warning")) {
                e = convertedException146.getObject();
                warning = true;
            } else if (convertedException146.instanceOf(
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
                e = convertedException146.getObject();
                error = true;
            } else if (convertedException146.instanceOf(Throwable.class, "Throwable")) {
                e = convertedException146.getObject();
                e = new ExceptionWrapper(env, e);
                error = true;
            } else {
                throw convertedException146;
            }
        }

        time = Timer.runtimeStaticObject.stop(env);
        env.callMethod(
                test,
                "addToAssertionCount",
                TestResult.class,
                Assert.runtimeStaticObject.getCount(env));
        if (ZVal.isTrue(monitorFunctions)) {
            blacklist = new Blacklist(env);
            functions =
                    com.runtimeconverter.runtime.ZVal.functionNotFound(
                                    "___error23423346_namespace_function_not_found__(identifier:xdebug_get_monitored_functions)_(namespace:\\)(source:xdebug_get_monitored_functions)______")
                            .env(env)
                            .call()
                            .value();
            com.runtimeconverter.runtime.ZVal.functionNotFound(
                            "___error23423346_namespace_function_not_found__(identifier:xdebug_stop_function_monitor)_(namespace:\\)(source:xdebug_stop_function_monitor)______")
                    .env(env)
                    .call();
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult1198 : ZVal.getIterable(functions, env, true)) {
                function.setObject(ZVal.assign(zpairResult1198.getValue()));
                if (!ZVal.isTrue(
                        env.callMethod(
                                blacklist,
                                "isBlacklisted",
                                TestResult.class,
                                function.arrayGet(env, "filename")))) {
                    this.addFailure(
                            env,
                            test,
                            new RiskyTestError(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "%s() used in %s:%s",
                                                    function.arrayGet(env, "function"),
                                                    function.arrayGet(env, "filename"),
                                                    function.arrayGet(env, "lineno"))
                                            .value()),
                            time);
                }
            }
        }

        if (ZVal.toBool(this.beStrictAboutTestsThatDoNotTestAnything)
                && ZVal.toBool(
                        ZVal.equalityCheck(
                                env.callMethod(test, "getNumAssertions", TestResult.class), 0))) {
            risky = true;
        }

        if (ZVal.isTrue(collectCodeCoverage)) {
            append =
                    ZVal.toBool(
                                    ZVal.toBool(!ZVal.isTrue(risky))
                                            && ZVal.toBool(!ZVal.isTrue(incomplete)))
                            && ZVal.toBool(!ZVal.isTrue(skipped));
            linesToBeCovered = ZVal.newArray();
            linesToBeUsed = ZVal.newArray();
            if (ZVal.toBool(append)
                    && ZVal.toBool(
                            ZVal.checkInstanceType(
                                    test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
                try {
                    linesToBeCovered =
                            Test.runtimeStaticObject.getLinesToBeCovered(
                                    env,
                                    function_get_class.f.env(env).call(test).value(),
                                    env.callMethod(test, "getName", TestResult.class, false));
                    linesToBeUsed =
                            Test.runtimeStaticObject.getLinesToBeUsed(
                                    env,
                                    function_get_class.f.env(env).call(test).value(),
                                    env.callMethod(test, "getName", TestResult.class, false));
                } catch (ConvertedException convertedException147) {
                    if (convertedException147.instanceOf(
                            InvalidCoversTargetException.class,
                            "PHPUnit\\Framework\\InvalidCoversTargetException")) {
                        cce = convertedException147.getObject();
                        this.addWarning(
                                env,
                                test,
                                new Warning(
                                        env, env.callMethod(cce, "getMessage", TestResult.class)),
                                time);
                    } else {
                        throw convertedException147;
                    }
                }
            }

            try {
                env.callMethod(
                        this.codeCoverage,
                        "stop",
                        TestResult.class,
                        append,
                        linesToBeCovered,
                        linesToBeUsed);
            } catch (ConvertedException convertedException148) {
                if (convertedException148.instanceOf(
                        UnintentionallyCoveredCodeException.class,
                        "SebastianBergmann\\CodeCoverage\\UnintentionallyCoveredCodeException")) {
                    cce = convertedException148.getObject();
                    this.addFailure(
                            env,
                            test,
                            new UnintentionallyCoveredCodeError(
                                    env,
                                    "This test executed code that is not listed as code to be covered or used:"
                                            + toStringR("\n", env)
                                            + toStringR(
                                                    env.callMethod(
                                                            cce, "getMessage", TestResult.class),
                                                    env)),
                            time);
                } else if (convertedException148.instanceOf(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .SebastianBergmann
                                .namespaces
                                .CodeCoverage
                                .classes
                                .CoveredCodeNotExecutedException
                                .class,
                        "SebastianBergmann\\CodeCoverage\\CoveredCodeNotExecutedException")) {
                    cce = convertedException148.getObject();
                    this.addFailure(
                            env,
                            test,
                            new com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .PHPUnit
                                    .namespaces
                                    .Framework
                                    .classes
                                    .CoveredCodeNotExecutedException(
                                    env,
                                    "This test did not execute all the code that is listed as code to be covered:"
                                            + toStringR("\n", env)
                                            + toStringR(
                                                    env.callMethod(
                                                            cce, "getMessage", TestResult.class),
                                                    env)),
                            time);
                } else if (convertedException148.instanceOf(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .SebastianBergmann
                                .namespaces
                                .CodeCoverage
                                .classes
                                .MissingCoversAnnotationException
                                .class,
                        "SebastianBergmann\\CodeCoverage\\MissingCoversAnnotationException")) {
                    cce = convertedException148.getObject();
                    if (ZVal.strictNotEqualityCheck(linesToBeCovered, "!==", false)) {
                        this.addFailure(
                                env,
                                test,
                                new com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .PHPUnit
                                        .namespaces
                                        .Framework
                                        .classes
                                        .MissingCoversAnnotationException(
                                        env,
                                        "This test does not have a @covers annotation but is expected to have one"),
                                time);
                    }

                } else if (convertedException148.instanceOf(
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
                    cce = convertedException148.getObject();
                    error = true;
                    if (!ZVal.isset(e)) {
                        e = ZVal.assign(cce);
                    }

                } else {
                    throw convertedException148;
                }
            }
        }

        if (ZVal.strictEqualityCheck(errorHandlerSet, "===", true)) {
            function_restore_error_handler.f.env(env).call();
        }

        if (ZVal.strictEqualityCheck(error, "===", true)) {
            this.addError(env, test, e, time);

        } else if (ZVal.strictEqualityCheck(failure, "===", true)) {
            this.addFailure(env, test, e, time);

        } else if (ZVal.strictEqualityCheck(warning, "===", true)) {
            this.addWarning(env, test, e, time);

        } else if (ZVal.toBool(
                        ZVal.toBool(this.beStrictAboutTestsThatDoNotTestAnything)
                                && ZVal.toBool(
                                        !ZVal.isTrue(
                                                env.callMethod(
                                                        test,
                                                        "doesNotPerformAssertions",
                                                        TestResult.class))))
                && ZVal.toBool(
                        ZVal.equalityCheck(
                                env.callMethod(test, "getNumAssertions", TestResult.class), 0))) {
            this.addFailure(
                    env,
                    test,
                    new RiskyTestError(env, "This test did not perform any assertions"),
                    time);

        } else if (ZVal.toBool(
                        ZVal.toBool(this.beStrictAboutTestsThatDoNotTestAnything)
                                && ZVal.toBool(
                                        env.callMethod(
                                                test,
                                                "doesNotPerformAssertions",
                                                TestResult.class)))
                && ZVal.toBool(
                        ZVal.isGreaterThan(
                                env.callMethod(test, "getNumAssertions", TestResult.class),
                                '>',
                                0))) {
            this.addFailure(
                    env,
                    test,
                    new RiskyTestError(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "This test is annotated with \"@doesNotPerformAssertions\" but performed %d assertions",
                                            env.callMethod(
                                                    test, "getNumAssertions", TestResult.class))
                                    .value()),
                    time);

        } else if (ZVal.toBool(this.beStrictAboutOutputDuringTests)
                && ZVal.toBool(env.callMethod(test, "hasOutput", TestResult.class))) {
            this.addFailure(
                    env,
                    test,
                    new OutputError(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "This test printed output: %s",
                                            env.callMethod(
                                                    test, "getActualOutput", TestResult.class))
                                    .value()),
                    time);

        } else if (ZVal.toBool(this.beStrictAboutTodoAnnotatedTests)
                && ZVal.toBool(
                        ZVal.checkInstanceType(
                                test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
            annotations.setObject(env.callMethod(test, "getAnnotations", TestResult.class));
            if (arrayActionR(ArrayAction.ISSET, annotations, env, "method", "todo")) {
                this.addFailure(
                        env,
                        test,
                        new RiskyTestError(env, "Test method is annotated with @todo"),
                        time);
            }
        }

        this.endTest(env, test, time);
        return null;
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.runTests);
    }

    @ConvertedMethod
    public Object shouldStop(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.stop);
    }

    @ConvertedMethod
    public Object stop(RuntimeEnv env, Object... args) {
        this.stop = true;
        return null;
    }

    @ConvertedMethod
    public Object getCodeCoverage(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.codeCoverage);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "codeCoverage",
        typeHint = "SebastianBergmann\\CodeCoverage\\CodeCoverage"
    )
    public Object setCodeCoverage(RuntimeEnv env, Object... args) {
        Object codeCoverage = assignParameter(args, 0, false);
        this.codeCoverage = codeCoverage;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object convertErrorsToExceptions(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, false);
        this.convertErrorsToExceptions = flag;
        return null;
    }

    @ConvertedMethod
    public Object getConvertErrorsToExceptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.convertErrorsToExceptions);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object stopOnError(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, false);
        this.stopOnError = flag;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object stopOnFailure(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, false);
        this.stopOnFailure = flag;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object stopOnWarning(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, false);
        this.stopOnWarning = flag;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object beStrictAboutTestsThatDoNotTestAnything(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, false);
        this.beStrictAboutTestsThatDoNotTestAnything = flag;
        return null;
    }

    @ConvertedMethod
    public Object isStrictAboutTestsThatDoNotTestAnything(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.beStrictAboutTestsThatDoNotTestAnything);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object beStrictAboutOutputDuringTests(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, false);
        this.beStrictAboutOutputDuringTests = flag;
        return null;
    }

    @ConvertedMethod
    public Object isStrictAboutOutputDuringTests(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.beStrictAboutOutputDuringTests);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object beStrictAboutResourceUsageDuringSmallTests(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, false);
        this.beStrictAboutResourceUsageDuringSmallTests = flag;
        return null;
    }

    @ConvertedMethod
    public Object isStrictAboutResourceUsageDuringSmallTests(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.beStrictAboutResourceUsageDuringSmallTests);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object enforceTimeLimit(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, false);
        this.enforceTimeLimit = flag;
        return null;
    }

    @ConvertedMethod
    public Object enforcesTimeLimit(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.enforceTimeLimit);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object beStrictAboutTodoAnnotatedTests(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, false);
        this.beStrictAboutTodoAnnotatedTests = flag;
        return null;
    }

    @ConvertedMethod
    public Object isStrictAboutTodoAnnotatedTests(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.beStrictAboutTodoAnnotatedTests);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object stopOnRisky(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, false);
        this.stopOnRisky = flag;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object stopOnIncomplete(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, false);
        this.stopOnIncomplete = flag;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object stopOnSkipped(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, false);
        this.stopOnSkipped = flag;
        return null;
    }

    @ConvertedMethod
    public Object time(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.time);
    }

    @ConvertedMethod
    public Object wasSuccessful(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(ZVal.isEmpty(this.errors))
                                        && ZVal.toBool(ZVal.isEmpty(this.failures)))
                        && ZVal.toBool(ZVal.isEmpty(this.warnings)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "timeout", typeHint = "int")
    public Object setTimeoutForSmallTests(RuntimeEnv env, Object... args) {
        Object timeout = assignParameter(args, 0, false);
        this.timeoutForSmallTests = timeout;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "timeout", typeHint = "int")
    public Object setTimeoutForMediumTests(RuntimeEnv env, Object... args) {
        Object timeout = assignParameter(args, 0, false);
        this.timeoutForMediumTests = timeout;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "timeout", typeHint = "int")
    public Object setTimeoutForLargeTests(RuntimeEnv env, Object... args) {
        Object timeout = assignParameter(args, 0, false);
        this.timeoutForLargeTests = timeout;
        return null;
    }

    @ConvertedMethod
    public Object getTimeoutForLargeTests(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.timeoutForLargeTests);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object setRegisterMockObjectsFromTestArgumentsRecursively(
            RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, false);
        this.registerMockObjectsFromTestArgumentsRecursively = flag;
        return null;
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\TestResult";

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
                    .setName("PHPUnit\\Framework\\TestResult")
                    .setLookup(
                            TestResult.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "beStrictAboutOutputDuringTests",
                            "beStrictAboutResourceUsageDuringSmallTests",
                            "beStrictAboutTestsThatDoNotTestAnything",
                            "beStrictAboutTodoAnnotatedTests",
                            "codeCoverage",
                            "convertErrorsToExceptions",
                            "enforceTimeLimit",
                            "errors",
                            "failures",
                            "lastTestFailed",
                            "listeners",
                            "notImplemented",
                            "passed",
                            "registerMockObjectsFromTestArgumentsRecursively",
                            "risky",
                            "runTests",
                            "skipped",
                            "stop",
                            "stopOnError",
                            "stopOnFailure",
                            "stopOnIncomplete",
                            "stopOnRisky",
                            "stopOnSkipped",
                            "stopOnWarning",
                            "time",
                            "timeoutForLargeTests",
                            "timeoutForMediumTests",
                            "timeoutForSmallTests",
                            "topTestSuite",
                            "warnings")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/TestResult.php")
                    .addInterface("Countable")
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

    private enum SwitchEnumType65 {
        DYNAMIC_TYPE_247,
        DYNAMIC_TYPE_248,
        DYNAMIC_TYPE_249,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
