package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.Log.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestFailure;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Printer;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SelfDescribing;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestListener;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.ReflectionException;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMDocument;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Filter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_bool;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Xml;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.ExceptionWrapper;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/Log/JUnit.php

*/

public class JUnit extends Printer implements TestListener {

    public Object document = null;

    public Object root = null;

    public Object reportUselessTests = false;

    public Object writeDocument = true;

    public Object testSuites = ZVal.newArray();

    public Object testSuiteTests = ZVal.arrayFromList(0);

    public Object testSuiteAssertions = ZVal.arrayFromList(0);

    public Object testSuiteErrors = ZVal.arrayFromList(0);

    public Object testSuiteFailures = ZVal.arrayFromList(0);

    public Object testSuiteSkipped = ZVal.arrayFromList(0);

    public Object testSuiteTimes = ZVal.arrayFromList(0);

    public Object testSuiteLevel = 0;

    public Object currentTestCase = null;

    public JUnit(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == JUnit.class) {
            this.__construct(env, args);
        }
    }

    public JUnit(NoConstructor n) {
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
        name = "reportUselessTests",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object out = assignParameter(args, 0, true);
        if (null == out) {
            out = ZVal.getNull();
        }
        Object reportUselessTests = assignParameter(args, 1, true);
        if (null == reportUselessTests) {
            reportUselessTests = false;
        }
        this.document = new DOMDocument(env, "1.0", "UTF-8");
        toObjectR(this.document).accessProp(this, env).name("formatOutput").set(true);
        this.root = env.callMethod(this.document, "createElement", JUnit.class, "testsuites");
        env.callMethod(this.document, "appendChild", JUnit.class, this.root);
        super.__construct(env, out);
        this.reportUselessTests = reportUselessTests;
        return null;
    }

    @ConvertedMethod
    public Object flush(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(this.writeDocument, "===", true)) {
            env.callMethod(this, "write", JUnit.class, this.getXML(env));
        }

        super.flush(env);
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
        this.doAddFault(env, test, t, time, "error");
        new ReferenceClassProperty(this, "testSuiteErrors", env)
                .arrayAccess(env, this.testSuiteLevel)
                .set(
                        ZVal.increment(
                                new ReferenceClassProperty(this, "testSuiteErrors", env)
                                        .arrayGet(env, this.testSuiteLevel)));
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
        this.doAddFault(env, test, e, time, "warning");
        new ReferenceClassProperty(this, "testSuiteFailures", env)
                .arrayAccess(env, this.testSuiteLevel)
                .set(
                        ZVal.increment(
                                new ReferenceClassProperty(this, "testSuiteFailures", env)
                                        .arrayGet(env, this.testSuiteLevel)));
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
        this.doAddFault(env, test, e, time, "failure");
        new ReferenceClassProperty(this, "testSuiteFailures", env)
                .arrayAccess(env, this.testSuiteLevel)
                .set(
                        ZVal.increment(
                                new ReferenceClassProperty(this, "testSuiteFailures", env)
                                        .arrayGet(env, this.testSuiteLevel)));
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
        this.doAddSkipped(env, test);
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
        Object error = null;
        if (ZVal.toBool(!ZVal.isTrue(this.reportUselessTests))
                || ZVal.toBool(
                        ZVal.strictEqualityCheck(this.currentTestCase, "===", ZVal.getNull()))) {
            return null;
        }

        error =
                env.callMethod(
                        this.document,
                        "createElement",
                        JUnit.class,
                        "error",
                        Xml.runtimeStaticObject.prepareString(
                                env,
                                "Risky Test\n"
                                        + toStringR(
                                                Filter.runtimeStaticObject.getFilteredStacktrace(
                                                        env, t),
                                                env)));
        env.callMethod(
                error,
                "setAttribute",
                JUnit.class,
                "type",
                function_get_class.f.env(env).call(t).value());
        env.callMethod(this.currentTestCase, "appendChild", JUnit.class, error);
        new ReferenceClassProperty(this, "testSuiteErrors", env)
                .arrayAccess(env, this.testSuiteLevel)
                .set(
                        ZVal.increment(
                                new ReferenceClassProperty(this, "testSuiteErrors", env)
                                        .arrayGet(env, this.testSuiteLevel)));
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
        this.doAddSkipped(env, test);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    public Object startTestSuite(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, false);
        Object e = null;
        Object testSuite = null;
        Object _pClass = null;
        testSuite = env.callMethod(this.document, "createElement", JUnit.class, "testsuite");
        env.callMethod(
                testSuite,
                "setAttribute",
                JUnit.class,
                "name",
                env.callMethod(suite, "getName", JUnit.class));
        if (function_class_exists
                .f
                .env(env)
                .call(env.callMethod(suite, "getName", JUnit.class), false)
                .getBool()) {
            try {
                _pClass = new ReflectionClass(env, env.callMethod(suite, "getName", JUnit.class));
                env.callMethod(
                        testSuite,
                        "setAttribute",
                        JUnit.class,
                        "file",
                        env.callMethod(_pClass, "getFileName", JUnit.class));
            } catch (ConvertedException convertedException166) {
                if (convertedException166.instanceOf(
                        ReflectionException.class, "ReflectionException")) {
                    e = convertedException166.getObject();
                } else {
                    throw convertedException166;
                }
            }
        }

        if (ZVal.isGreaterThan(this.testSuiteLevel, '>', 0)) {
            env.callMethod(
                    new ReferenceClassProperty(this, "testSuites", env)
                            .arrayGet(env, this.testSuiteLevel),
                    "appendChild",
                    JUnit.class,
                    testSuite);

        } else {
            env.callMethod(this.root, "appendChild", JUnit.class, testSuite);
        }

        this.testSuiteLevel = ZVal.increment(this.testSuiteLevel);
        new ReferenceClassProperty(this, "testSuites", env)
                .arrayAccess(env, this.testSuiteLevel)
                .set(testSuite);
        new ReferenceClassProperty(this, "testSuiteTests", env)
                .arrayAccess(env, this.testSuiteLevel)
                .set(0);
        new ReferenceClassProperty(this, "testSuiteAssertions", env)
                .arrayAccess(env, this.testSuiteLevel)
                .set(0);
        new ReferenceClassProperty(this, "testSuiteErrors", env)
                .arrayAccess(env, this.testSuiteLevel)
                .set(0);
        new ReferenceClassProperty(this, "testSuiteFailures", env)
                .arrayAccess(env, this.testSuiteLevel)
                .set(0);
        new ReferenceClassProperty(this, "testSuiteSkipped", env)
                .arrayAccess(env, this.testSuiteLevel)
                .set(0);
        new ReferenceClassProperty(this, "testSuiteTimes", env)
                .arrayAccess(env, this.testSuiteLevel)
                .set(0);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    public Object endTestSuite(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, false);
        env.callMethod(
                new ReferenceClassProperty(this, "testSuites", env)
                        .arrayGet(env, this.testSuiteLevel),
                "setAttribute",
                JUnit.class,
                "tests",
                new ReferenceClassProperty(this, "testSuiteTests", env)
                        .arrayGet(env, this.testSuiteLevel));
        env.callMethod(
                new ReferenceClassProperty(this, "testSuites", env)
                        .arrayGet(env, this.testSuiteLevel),
                "setAttribute",
                JUnit.class,
                "assertions",
                new ReferenceClassProperty(this, "testSuiteAssertions", env)
                        .arrayGet(env, this.testSuiteLevel));
        env.callMethod(
                new ReferenceClassProperty(this, "testSuites", env)
                        .arrayGet(env, this.testSuiteLevel),
                "setAttribute",
                JUnit.class,
                "errors",
                new ReferenceClassProperty(this, "testSuiteErrors", env)
                        .arrayGet(env, this.testSuiteLevel));
        env.callMethod(
                new ReferenceClassProperty(this, "testSuites", env)
                        .arrayGet(env, this.testSuiteLevel),
                "setAttribute",
                JUnit.class,
                "failures",
                new ReferenceClassProperty(this, "testSuiteFailures", env)
                        .arrayGet(env, this.testSuiteLevel));
        env.callMethod(
                new ReferenceClassProperty(this, "testSuites", env)
                        .arrayGet(env, this.testSuiteLevel),
                "setAttribute",
                JUnit.class,
                "skipped",
                new ReferenceClassProperty(this, "testSuiteSkipped", env)
                        .arrayGet(env, this.testSuiteLevel));
        env.callMethod(
                new ReferenceClassProperty(this, "testSuites", env)
                        .arrayGet(env, this.testSuiteLevel),
                "setAttribute",
                JUnit.class,
                "time",
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%F",
                                new ReferenceClassProperty(this, "testSuiteTimes", env)
                                        .arrayGet(env, this.testSuiteLevel))
                        .value());
        if (ZVal.isGreaterThan(this.testSuiteLevel, '>', 1)) {
            new ReferenceClassProperty(this, "testSuiteTests", env)
                    .arrayAccess(env, ZVal.subtract(this.testSuiteLevel, 1))
                    .set(
                            ZAssignment.add(
                                    "+=",
                                    new ReferenceClassProperty(this, "testSuiteTests", env)
                                            .arrayGet(env, ZVal.subtract(this.testSuiteLevel, 1)),
                                    new ReferenceClassProperty(this, "testSuiteTests", env)
                                            .arrayGet(env, this.testSuiteLevel)));
            new ReferenceClassProperty(this, "testSuiteAssertions", env)
                    .arrayAccess(env, ZVal.subtract(this.testSuiteLevel, 1))
                    .set(
                            ZAssignment.add(
                                    "+=",
                                    new ReferenceClassProperty(this, "testSuiteAssertions", env)
                                            .arrayGet(env, ZVal.subtract(this.testSuiteLevel, 1)),
                                    new ReferenceClassProperty(this, "testSuiteAssertions", env)
                                            .arrayGet(env, this.testSuiteLevel)));
            new ReferenceClassProperty(this, "testSuiteErrors", env)
                    .arrayAccess(env, ZVal.subtract(this.testSuiteLevel, 1))
                    .set(
                            ZAssignment.add(
                                    "+=",
                                    new ReferenceClassProperty(this, "testSuiteErrors", env)
                                            .arrayGet(env, ZVal.subtract(this.testSuiteLevel, 1)),
                                    new ReferenceClassProperty(this, "testSuiteErrors", env)
                                            .arrayGet(env, this.testSuiteLevel)));
            new ReferenceClassProperty(this, "testSuiteFailures", env)
                    .arrayAccess(env, ZVal.subtract(this.testSuiteLevel, 1))
                    .set(
                            ZAssignment.add(
                                    "+=",
                                    new ReferenceClassProperty(this, "testSuiteFailures", env)
                                            .arrayGet(env, ZVal.subtract(this.testSuiteLevel, 1)),
                                    new ReferenceClassProperty(this, "testSuiteFailures", env)
                                            .arrayGet(env, this.testSuiteLevel)));
            new ReferenceClassProperty(this, "testSuiteSkipped", env)
                    .arrayAccess(env, ZVal.subtract(this.testSuiteLevel, 1))
                    .set(
                            ZAssignment.add(
                                    "+=",
                                    new ReferenceClassProperty(this, "testSuiteSkipped", env)
                                            .arrayGet(env, ZVal.subtract(this.testSuiteLevel, 1)),
                                    new ReferenceClassProperty(this, "testSuiteSkipped", env)
                                            .arrayGet(env, this.testSuiteLevel)));
            new ReferenceClassProperty(this, "testSuiteTimes", env)
                    .arrayAccess(env, ZVal.subtract(this.testSuiteLevel, 1))
                    .set(
                            ZAssignment.add(
                                    "+=",
                                    new ReferenceClassProperty(this, "testSuiteTimes", env)
                                            .arrayGet(env, ZVal.subtract(this.testSuiteLevel, 1)),
                                    new ReferenceClassProperty(this, "testSuiteTimes", env)
                                            .arrayGet(env, this.testSuiteLevel)));
        }

        this.testSuiteLevel = ZVal.decrement(this.testSuiteLevel);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    public Object startTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object method = null;
        Object methodName = null;
        Object _pClass = null;
        Object testCase = null;
        testCase = env.callMethod(this.document, "createElement", JUnit.class, "testcase");
        env.callMethod(
                testCase,
                "setAttribute",
                JUnit.class,
                "name",
                env.callMethod(test, "getName", JUnit.class));
        if (ZVal.isTrue(
                ZVal.checkInstanceType(test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
            _pClass = new ReflectionClass(env, test);
            methodName =
                    env.callMethod(
                            test,
                            "getName",
                            JUnit.class,
                            !ZVal.isTrue(env.callMethod(test, "usesDataProvider", JUnit.class)));
            if (ZVal.isTrue(env.callMethod(_pClass, "hasMethod", JUnit.class, methodName))) {
                method = env.callMethod(_pClass, "getMethod", JUnit.class, methodName);
                env.callMethod(
                        testCase,
                        "setAttribute",
                        JUnit.class,
                        "class",
                        env.callMethod(_pClass, "getName", JUnit.class));
                env.callMethod(
                        testCase,
                        "setAttribute",
                        JUnit.class,
                        "classname",
                        function_str_replace
                                .f
                                .env(env)
                                .call("\\", ".", env.callMethod(_pClass, "getName", JUnit.class))
                                .value());
                env.callMethod(
                        testCase,
                        "setAttribute",
                        JUnit.class,
                        "file",
                        env.callMethod(_pClass, "getFileName", JUnit.class));
                env.callMethod(
                        testCase,
                        "setAttribute",
                        JUnit.class,
                        "line",
                        env.callMethod(method, "getStartLine", JUnit.class));
            }
        }

        this.currentTestCase = testCase;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "time", typeHint = "float")
    public Object endTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object time = assignParameter(args, 1, false);
        Object systemOut = null;
        Object numAssertions = null;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
            numAssertions = env.callMethod(test, "getNumAssertions", JUnit.class);
            new ReferenceClassProperty(this, "testSuiteAssertions", env)
                    .arrayAccess(env, this.testSuiteLevel)
                    .set(
                            ZAssignment.add(
                                    "+=",
                                    new ReferenceClassProperty(this, "testSuiteAssertions", env)
                                            .arrayGet(env, this.testSuiteLevel),
                                    numAssertions));
            env.callMethod(
                    this.currentTestCase, "setAttribute", JUnit.class, "assertions", numAssertions);
        }

        env.callMethod(
                this.currentTestCase,
                "setAttribute",
                JUnit.class,
                "time",
                function_sprintf.f.env(env).call("%F", time).value());
        env.callMethod(
                new ReferenceClassProperty(this, "testSuites", env)
                        .arrayGet(env, this.testSuiteLevel),
                "appendChild",
                JUnit.class,
                this.currentTestCase);
        new ReferenceClassProperty(this, "testSuiteTests", env)
                .arrayAccess(env, this.testSuiteLevel)
                .set(
                        ZVal.increment(
                                new ReferenceClassProperty(this, "testSuiteTests", env)
                                        .arrayGet(env, this.testSuiteLevel)));
        new ReferenceClassProperty(this, "testSuiteTimes", env)
                .arrayAccess(env, this.testSuiteLevel)
                .set(
                        ZAssignment.add(
                                "+=",
                                new ReferenceClassProperty(this, "testSuiteTimes", env)
                                        .arrayGet(env, this.testSuiteLevel),
                                time));
        if (ZVal.toBool(function_method_exists.f.env(env).call(test, "hasOutput").value())
                && ZVal.toBool(env.callMethod(test, "hasOutput", JUnit.class))) {
            systemOut =
                    env.callMethod(
                            this.document,
                            "createElement",
                            JUnit.class,
                            "system-out",
                            Xml.runtimeStaticObject.prepareString(
                                    env, env.callMethod(test, "getActualOutput", JUnit.class)));
            env.callMethod(this.currentTestCase, "appendChild", JUnit.class, systemOut);
        }

        this.currentTestCase = ZVal.getNull();
        return null;
    }

    @ConvertedMethod
    public Object getXML(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.document, "saveXML", JUnit.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag")
    public Object setWriteDocument(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, false);
        if (function_is_bool.f.env(env).call(flag).getBool()) {
            this.writeDocument = flag;
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "t", typeHint = "Throwable")
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    @ConvertedParameter(index = 3, name = "type")
    private Object doAddFault(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object t = assignParameter(args, 1, false);
        Object time = assignParameter(args, 2, false);
        Object type = assignParameter(args, 3, false);
        Object fault = null;
        Object buffer = null;
        if (ZVal.strictEqualityCheck(this.currentTestCase, "===", ZVal.getNull())) {
            return null;
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        test, SelfDescribing.class, "PHPUnit\\Framework\\SelfDescribing"))) {
            buffer = toStringR(env.callMethod(test, "toString", JUnit.class), env) + "\n";

        } else {
            buffer = "";
        }

        buffer =
                toStringR(buffer, env)
                        + toStringR(TestFailure.runtimeStaticObject.exceptionToString(env, t), env)
                        + "\n"
                        + toStringR(Filter.runtimeStaticObject.getFilteredStacktrace(env, t), env);
        fault =
                env.callMethod(
                        this.document,
                        "createElement",
                        JUnit.class,
                        type,
                        Xml.runtimeStaticObject.prepareString(env, buffer));
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        t, ExceptionWrapper.class, "PHPUnit\\Framework\\ExceptionWrapper"))) {
            env.callMethod(
                    fault,
                    "setAttribute",
                    JUnit.class,
                    "type",
                    env.callMethod(t, "getClassName", JUnit.class));

        } else {
            env.callMethod(
                    fault,
                    "setAttribute",
                    JUnit.class,
                    "type",
                    function_get_class.f.env(env).call(t).value());
        }

        env.callMethod(this.currentTestCase, "appendChild", JUnit.class, fault);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    private Object doAddSkipped(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object skipped = null;
        if (ZVal.strictEqualityCheck(this.currentTestCase, "===", ZVal.getNull())) {
            return null;
        }

        skipped = env.callMethod(this.document, "createElement", JUnit.class, "skipped");
        env.callMethod(this.currentTestCase, "appendChild", JUnit.class, skipped);
        new ReferenceClassProperty(this, "testSuiteSkipped", env)
                .arrayAccess(env, this.testSuiteLevel)
                .set(
                        ZVal.increment(
                                new ReferenceClassProperty(this, "testSuiteSkipped", env)
                                        .arrayGet(env, this.testSuiteLevel)));
        return null;
    }

    public static final Object CONST_class = "PHPUnit\\Util\\Log\\JUnit";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Printer.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\Log\\JUnit")
                    .setLookup(
                            JUnit.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "autoFlush",
                            "currentTestCase",
                            "document",
                            "out",
                            "outTarget",
                            "reportUselessTests",
                            "root",
                            "testSuiteAssertions",
                            "testSuiteErrors",
                            "testSuiteFailures",
                            "testSuiteLevel",
                            "testSuiteSkipped",
                            "testSuiteTests",
                            "testSuiteTimes",
                            "testSuites",
                            "writeDocument")
                    .setFilename("vendor/phpunit/phpunit/src/Util/Log/JUnit.php")
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
