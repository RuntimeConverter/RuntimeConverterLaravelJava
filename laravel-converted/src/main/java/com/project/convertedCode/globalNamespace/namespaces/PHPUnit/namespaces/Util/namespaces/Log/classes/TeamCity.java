package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.Log.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.runtimeconverter.runtime.nativeFunctions.string.function_stripos;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.ExpectationFailedException;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestFailure;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_scalar;
import com.runtimeconverter.runtime.nativeFunctions.math.function_round;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.TextUI.classes.ResultPrinter;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Filter;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_bool;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ComparisonFailure;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.ExceptionWrapper;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/Log/TeamCity.php

*/

public class TeamCity extends ResultPrinter {

    public Object isSummaryTestCountPrinted = false;

    public Object startedTestName = null;

    public Object flowId = null;

    public TeamCity(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TeamCity.class) {
            this.__construct(env, args);
        }
    }

    public TeamCity(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "result", typeHint = "PHPUnit\\Framework\\TestResult")
    public Object printResult(RuntimeEnv env, Object... args) {
        Object result = assignParameter(args, 0, false);
        env.callMethod(this, "printHeader", TeamCity.class);
        env.callMethod(this, "printFooter", TeamCity.class, result);
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
        this.printEvent(
                env,
                "testFailed",
                ZVal.newArray(
                        new ZPair("name", env.callMethod(test, "getName", TeamCity.class)),
                        new ZPair("message", runtimeStaticObject.getMessage(env, t)),
                        new ZPair("details", runtimeStaticObject.getDetails(env, t))));
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
        this.printEvent(
                env,
                "testFailed",
                ZVal.newArray(
                        new ZPair("name", env.callMethod(test, "getName", TeamCity.class)),
                        new ZPair("message", runtimeStaticObject.getMessage(env, e)),
                        new ZPair("details", runtimeStaticObject.getDetails(env, e))));
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
        Object comparisonFailure = null;
        Object actualString = null;
        ReferenceContainer parameters = new BasicReferenceContainer(null);
        Object expectedString = null;
        parameters.setObject(
                ZVal.newArray(
                        new ZPair("name", env.callMethod(test, "getName", TeamCity.class)),
                        new ZPair("message", runtimeStaticObject.getMessage(env, e)),
                        new ZPair("details", runtimeStaticObject.getDetails(env, e))));
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        e,
                        ExpectationFailedException.class,
                        "PHPUnit\\Framework\\ExpectationFailedException"))) {
            comparisonFailure = env.callMethod(e, "getComparisonFailure", TeamCity.class);
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            comparisonFailure,
                            ComparisonFailure.class,
                            "SebastianBergmann\\Comparator\\ComparisonFailure"))) {
                expectedString =
                        env.callMethod(comparisonFailure, "getExpectedAsString", TeamCity.class);
                if (ZVal.toBool(ZVal.strictEqualityCheck(expectedString, "===", ZVal.getNull()))
                        || ZVal.toBool(ZVal.isEmpty(expectedString))) {
                    expectedString =
                            runtimeStaticObject.getPrimitiveValueAsString(
                                    env,
                                    env.callMethod(
                                            comparisonFailure, "getExpected", TeamCity.class));
                }

                actualString =
                        env.callMethod(comparisonFailure, "getActualAsString", TeamCity.class);
                if (ZVal.toBool(ZVal.strictEqualityCheck(actualString, "===", ZVal.getNull()))
                        || ZVal.toBool(ZVal.isEmpty(actualString))) {
                    actualString =
                            runtimeStaticObject.getPrimitiveValueAsString(
                                    env,
                                    env.callMethod(comparisonFailure, "getActual", TeamCity.class));
                }

                if (ZVal.toBool(ZVal.strictNotEqualityCheck(actualString, "!==", ZVal.getNull()))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        expectedString, "!==", ZVal.getNull()))) {
                    parameters.arrayAccess(env, "type").set("comparisonFailure");
                    parameters.arrayAccess(env, "actual").set(actualString);
                    parameters.arrayAccess(env, "expected").set(expectedString);
                }
            }
        }

        this.printEvent(env, "testFailed", parameters.getObject());
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
        this.printIgnoredTest(env, env.callMethod(test, "getName", TeamCity.class), t);
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
        this.addError(env, test, t, time);
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
        Object testName = null;
        testName = env.callMethod(test, "getName", TeamCity.class);
        if (ZVal.strictNotEqualityCheck(this.startedTestName, "!==", testName)) {
            this.startTest(env, test);
            this.printIgnoredTest(env, testName, t);
            this.endTest(env, test, time);

        } else {
            this.printIgnoredTest(env, testName, t);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "testName")
    @ConvertedParameter(index = 1, name = "t", typeHint = "Throwable")
    public Object printIgnoredTest(RuntimeEnv env, Object... args) {
        Object testName = assignParameter(args, 0, false);
        Object t = assignParameter(args, 1, false);
        this.printEvent(
                env,
                "testIgnored",
                ZVal.newArray(
                        new ZPair("name", testName),
                        new ZPair("message", runtimeStaticObject.getMessage(env, t)),
                        new ZPair("details", runtimeStaticObject.getDetails(env, t))));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    public Object startTestSuite(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, false);
        Object fileName = null;
        ReferenceContainer split = new BasicReferenceContainer(null);
        ReferenceContainer parameters = new BasicReferenceContainer(null);
        Object suiteName = null;
        if (ZVal.strictEqualityCheck(
                function_stripos
                        .f
                        .env(env)
                        .call(
                                function_ini_get.f.env(env).call("disable_functions").value(),
                                "getmypid")
                        .value(),
                "===",
                false)) {
            this.flowId = NamespaceGlobal.getmypid.env(env).call().value();

        } else {
            this.flowId = false;
        }

        if (!ZVal.isTrue(this.isSummaryTestCountPrinted)) {
            this.isSummaryTestCountPrinted = true;
            this.printEvent(
                    env,
                    "testCount",
                    ZVal.newArray(
                            new ZPair("count", function_count.f.env(env).call(suite).value())));
        }

        suiteName = env.callMethod(suite, "getName", TeamCity.class);
        if (ZVal.isEmpty(suiteName)) {
            return null;
        }

        parameters.setObject(ZVal.newArray(new ZPair("name", suiteName)));
        if (function_class_exists.f.env(env).call(suiteName, false).getBool()) {
            fileName = runtimeStaticObject.getFileName(env, suiteName);
            parameters
                    .arrayAccess(env, "locationHint")
                    .set(
                            "php_qn://"
                                    + toStringR(fileName, env)
                                    + "::\\"
                                    + toStringR(suiteName, env));

        } else {
            split.setObject(function_explode.f.env(env).call("::", suiteName).value());
            if (ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    function_count.f.env(env).call(split.getObject()).value(),
                                    "===",
                                    2))
                    && ZVal.toBool(
                            function_method_exists
                                    .f
                                    .env(env)
                                    .call(split.arrayGet(env, 0), split.arrayGet(env, 1))
                                    .value())) {
                fileName = runtimeStaticObject.getFileName(env, split.arrayGet(env, 0));
                parameters
                        .arrayAccess(env, "locationHint")
                        .set(
                                "php_qn://"
                                        + toStringR(fileName, env)
                                        + "::\\"
                                        + toStringR(suiteName, env));
                parameters.arrayAccess(env, "name").set(split.arrayGet(env, 1));
            }
        }

        this.printEvent(env, "testSuiteStarted", parameters.getObject());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    public Object endTestSuite(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, false);
        ReferenceContainer split = new BasicReferenceContainer(null);
        ReferenceContainer parameters = new BasicReferenceContainer(null);
        Object suiteName = null;
        suiteName = env.callMethod(suite, "getName", TeamCity.class);
        if (ZVal.isEmpty(suiteName)) {
            return null;
        }

        parameters.setObject(ZVal.newArray(new ZPair("name", suiteName)));
        if (!function_class_exists.f.env(env).call(suiteName, false).getBool()) {
            split.setObject(function_explode.f.env(env).call("::", suiteName).value());
            if (ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    function_count.f.env(env).call(split.getObject()).value(),
                                    "===",
                                    2))
                    && ZVal.toBool(
                            function_method_exists
                                    .f
                                    .env(env)
                                    .call(split.arrayGet(env, 0), split.arrayGet(env, 1))
                                    .value())) {
                parameters.arrayAccess(env, "name").set(split.arrayGet(env, 1));
            }
        }

        this.printEvent(env, "testSuiteFinished", parameters.getObject());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    public Object startTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object fileName = null;
        Object className = null;
        ReferenceContainer params = new BasicReferenceContainer(null);
        Object testName = null;
        testName = env.callMethod(test, "getName", TeamCity.class);
        this.startedTestName = testName;
        params.setObject(ZVal.newArray(new ZPair("name", testName)));
        if (ZVal.isTrue(
                ZVal.checkInstanceType(test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
            className = function_get_class.f.env(env).call(test).value();
            fileName = runtimeStaticObject.getFileName(env, className);
            params.arrayAccess(env, "locationHint")
                    .set(
                            "php_qn://"
                                    + toStringR(fileName, env)
                                    + "::\\"
                                    + toStringR(className, env)
                                    + "::"
                                    + toStringR(testName, env));
        }

        this.printEvent(env, "testStarted", params.getObject());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "time", typeHint = "float")
    public Object endTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object time = assignParameter(args, 1, false);
        super.endTest(env, test, time);
        this.printEvent(
                env,
                "testFinished",
                ZVal.newArray(
                        new ZPair("name", env.callMethod(test, "getName", TeamCity.class)),
                        new ZPair(
                                "duration",
                                ZVal.toLong(
                                        ZVal.multiply(
                                                function_round.f.env(env).call(time, 2).value(),
                                                1000)))));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "progress", typeHint = "string")
    protected Object writeProgress(RuntimeEnv env, Object... args) {
        Object progress = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "eventName")
    @ConvertedParameter(index = 1, name = "params", defaultValue = "", defaultValueType = "array")
    private Object printEvent(RuntimeEnv env, Object... args) {
        Object eventName = assignParameter(args, 0, false);
        ReferenceContainer params = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == params.getObject()) {
            params.setObject(ZVal.newArray());
        }
        Object escapedValue = null;
        Object value = null;
        Object key = null;
        env.callMethod(this, "write", TeamCity.class, "\n##teamcity[" + toStringR(eventName, env));
        if (ZVal.isTrue(this.flowId)) {
            params.arrayAccess(env, "flowId").set(this.flowId);
        }

        for (ZPair zpairResult1294 : ZVal.getIterable(params.getObject(), env, false)) {
            key = ZVal.assign(zpairResult1294.getKey());
            value = ZVal.assign(zpairResult1294.getValue());
            escapedValue = runtimeStaticObject.escapeValue(env, value);
            env.callMethod(
                    this,
                    "write",
                    TeamCity.class,
                    " " + toStringR(key, env) + "='" + toStringR(escapedValue, env) + "'");
        }

        env.callMethod(this, "write", TeamCity.class, "]\n");
        return null;
    }

    public static final Object CONST_class = "PHPUnit\\Util\\Log\\TeamCity";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ResultPrinter.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "t", typeHint = "Throwable")
        private Object getMessage(RuntimeEnv env, Object... args) {
            Object t = assignParameter(args, 0, false);
            Object message = null;
            message = "";
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            t, ExceptionWrapper.class, "PHPUnit\\Framework\\ExceptionWrapper"))) {
                if (ZVal.strictNotEqualityCheck(
                        env.callMethod(t, "getClassName", TeamCity.class), "!==", "")) {
                    message =
                            toStringR(message, env)
                                    + toStringR(
                                            env.callMethod(t, "getClassName", TeamCity.class), env);
                }

                if (ZVal.toBool(ZVal.strictNotEqualityCheck(message, "!==", ""))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        env.callMethod(t, "getMessage", TeamCity.class),
                                        "!==",
                                        ""))) {
                    message = toStringR(message, env) + " : ";
                }
            }

            return ZVal.assign(
                    toStringR(message, env)
                            + toStringR(env.callMethod(t, "getMessage", TeamCity.class), env));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "t", typeHint = "Throwable")
        private Object getDetails(RuntimeEnv env, Object... args) {
            Object t = assignParameter(args, 0, false);
            Object previous = null;
            Object stackTrace = null;
            stackTrace = Filter.runtimeStaticObject.getFilteredStacktrace(env, t);
            previous =
                    ZVal.assign(
                            ZVal.isTrue(
                                            ZVal.checkInstanceType(
                                                    t,
                                                    ExceptionWrapper.class,
                                                    "PHPUnit\\Framework\\ExceptionWrapper"))
                                    ? env.callMethod(t, "getPreviousWrapped", TeamCity.class)
                                    : env.callMethod(t, "getPrevious", TeamCity.class));
            while (ZVal.isTrue(previous)) {
                stackTrace =
                        toStringR(stackTrace, env)
                                + "\nCaused by\n"
                                + toStringR(
                                        TestFailure.runtimeStaticObject.exceptionToString(
                                                env, previous),
                                        env)
                                + "\n"
                                + toStringR(
                                        Filter.runtimeStaticObject.getFilteredStacktrace(
                                                env, previous),
                                        env);
                previous =
                        ZVal.assign(
                                ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        previous,
                                                        ExceptionWrapper.class,
                                                        "PHPUnit\\Framework\\ExceptionWrapper"))
                                        ? env.callMethod(
                                                previous, "getPreviousWrapped", TeamCity.class)
                                        : env.callMethod(previous, "getPrevious", TeamCity.class));
            }

            return ZVal.assign(
                    " "
                            + toStringR(
                                    function_str_replace
                                            .f
                                            .env(env)
                                            .call("\n", "\n ", stackTrace)
                                            .value(),
                                    env));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        private Object getPrimitiveValueAsString(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            if (ZVal.strictEqualityCheck(value, "===", ZVal.getNull())) {
                return "null";
            }

            if (function_is_bool.f.env(env).call(value).getBool()) {
                return ZVal.assign(ZVal.strictEqualityCheck(value, "===", true) ? "true" : "false");
            }

            if (function_is_scalar.f.env(env).call(value).getBool()) {
                return ZVal.assign(NamespaceGlobal.print_r.env(env).call(value, true).value());
            }

            return ZVal.assign(ZVal.getNull());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "text", typeHint = "string")
        private Object escapeValue(RuntimeEnv env, Object... args) {
            Object text = assignParameter(args, 0, false);
            return ZVal.assign(
                    function_str_replace
                            .f
                            .env(env)
                            .call(
                                    ZVal.arrayFromList("|", "'", "\n", "\r", "]", "["),
                                    ZVal.arrayFromList("||", "|'", "|n", "|r", "|]", "|["),
                                    text)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className")
        private Object getFileName(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, false);
            Object reflectionClass = null;
            reflectionClass = new ReflectionClass(env, className);
            return ZVal.assign(env.callMethod(reflectionClass, "getFileName", TeamCity.class));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\Log\\TeamCity")
                    .setLookup(
                            TeamCity.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "autoFlush",
                            "colors",
                            "column",
                            "debug",
                            "defectListPrinted",
                            "flowId",
                            "isSummaryTestCountPrinted",
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
                            "startedTestName",
                            "verbose")
                    .setFilename("vendor/phpunit/phpunit/src/Util/Log/TeamCity.php")
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
