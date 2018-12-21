package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.TestDox.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Printer;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.BaseTestRunner;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Test;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.TestDox.classes.NamePrettifier;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestListener;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.WarningTestCase;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/TestDox/ResultPrinter.php

*/

public abstract class ResultPrinter extends Printer implements TestListener {

    public Object prettifier = null;

    public Object testClass = "";

    public Object testStatus = null;

    public Object tests = ZVal.newArray();

    public Object successful = 0;

    public Object warned = 0;

    public Object failed = 0;

    public Object risky = 0;

    public Object skipped = 0;

    public Object incomplete = 0;

    public Object currentTestClassPrettified = null;

    public Object currentTestMethodPrettified = null;

    public Object groups = null;

    public Object excludeGroups = null;

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
        name = "groups",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "excludeGroups",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object out = assignParameter(args, 0, true);
        if (null == out) {
            out = ZVal.getNull();
        }
        Object groups = assignParameter(args, 1, true);
        if (null == groups) {
            groups = ZVal.newArray();
        }
        Object excludeGroups = assignParameter(args, 2, true);
        if (null == excludeGroups) {
            excludeGroups = ZVal.newArray();
        }
        super.__construct(env, out);
        this.groups = groups;
        this.excludeGroups = excludeGroups;
        this.prettifier = new NamePrettifier(env);
        this.startRun(env);
        return null;
    }

    @ConvertedMethod
    public Object flush(RuntimeEnv env, Object... args) {
        this.doEndClass(env);
        this.endRun(env);
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
        if (!ZVal.isTrue(this.isOfInterest(env, test))) {
            return null;
        }

        this.testStatus = BaseTestRunner.CONST_STATUS_ERROR;
        this.failed = ZVal.increment(this.failed);
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
        if (!ZVal.isTrue(this.isOfInterest(env, test))) {
            return null;
        }

        this.testStatus = BaseTestRunner.CONST_STATUS_WARNING;
        this.warned = ZVal.increment(this.warned);
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
        if (!ZVal.isTrue(this.isOfInterest(env, test))) {
            return null;
        }

        this.testStatus = BaseTestRunner.CONST_STATUS_FAILURE;
        this.failed = ZVal.increment(this.failed);
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
        if (!ZVal.isTrue(this.isOfInterest(env, test))) {
            return null;
        }

        this.testStatus = BaseTestRunner.CONST_STATUS_INCOMPLETE;
        this.incomplete = ZVal.increment(this.incomplete);
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
        if (!ZVal.isTrue(this.isOfInterest(env, test))) {
            return null;
        }

        this.testStatus = BaseTestRunner.CONST_STATUS_RISKY;
        this.risky = ZVal.increment(this.risky);
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
        if (!ZVal.isTrue(this.isOfInterest(env, test))) {
            return null;
        }

        this.testStatus = BaseTestRunner.CONST_STATUS_SKIPPED;
        this.skipped = ZVal.increment(this.skipped);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    public Object startTestSuite(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, false);
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
        ReferenceContainer annotations = new BasicReferenceContainer(null);
        Object _pClass = null;
        ReferenceContainer classAnnotations = new BasicReferenceContainer(null);
        if (!ZVal.isTrue(this.isOfInterest(env, test))) {
            return null;
        }

        _pClass = function_get_class.f.env(env).call(test).value();
        if (ZVal.strictNotEqualityCheck(this.testClass, "!==", _pClass)) {
            if (ZVal.strictNotEqualityCheck(this.testClass, "!==", "")) {
                this.doEndClass(env);
            }

            classAnnotations.setObject(
                    Test.runtimeStaticObject.parseTestMethodAnnotations(env, _pClass));
            if (arrayActionR(ArrayAction.ISSET, classAnnotations, env, "class", "testdox", 0)) {
                this.currentTestClassPrettified =
                        classAnnotations.arrayGet(env, "class", "testdox", 0);

            } else {
                this.currentTestClassPrettified =
                        env.callMethod(
                                this.prettifier, "prettifyTestClass", ResultPrinter.class, _pClass);
            }

            this.startClass(env, _pClass);
            this.testClass = _pClass;
            this.tests = ZVal.newArray();
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
            annotations.setObject(env.callMethod(test, "getAnnotations", ResultPrinter.class));
            if (arrayActionR(ArrayAction.ISSET, annotations, env, "method", "testdox", 0)) {
                this.currentTestMethodPrettified =
                        annotations.arrayGet(env, "method", "testdox", 0);

            } else {
                this.currentTestMethodPrettified =
                        env.callMethod(
                                this.prettifier,
                                "prettifyTestMethod",
                                ResultPrinter.class,
                                env.callMethod(test, "getName", ResultPrinter.class, false));
            }

            if (ZVal.isTrue(env.callMethod(test, "usesDataProvider", ResultPrinter.class))) {
                this.currentTestMethodPrettified =
                        toStringR(this.currentTestMethodPrettified, env)
                                + " "
                                + toStringR(
                                        env.callMethod(
                                                test, "dataDescription", ResultPrinter.class),
                                        env);
            }
        }

        this.testStatus = BaseTestRunner.CONST_STATUS_PASSED;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "time", typeHint = "float")
    public Object endTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object time = assignParameter(args, 1, false);
        if (!ZVal.isTrue(this.isOfInterest(env, test))) {
            return null;
        }

        new ReferenceClassProperty(this, "tests", env)
                .arrayAppend(env)
                .set(
                        ZVal.newArray(
                                new ZPair(0, this.currentTestMethodPrettified),
                                new ZPair(1, this.testStatus)));
        this.currentTestClassPrettified = ZVal.getNull();
        this.currentTestMethodPrettified = ZVal.getNull();
        return null;
    }

    @ConvertedMethod
    protected Object doEndClass(RuntimeEnv env, Object... args) {
        ReferenceContainer test = new BasicReferenceContainer(null);
        for (ZPair zpairResult1326 : ZVal.getIterable(this.tests, env, true)) {
            test.setObject(ZVal.assign(zpairResult1326.getValue()));
            this.onTest(
                    env,
                    test.arrayGet(env, 0),
                    ZVal.strictEqualityCheck(
                            test.arrayGet(env, 1), "===", BaseTestRunner.CONST_STATUS_PASSED));
        }

        this.endClass(env, this.testClass);
        return null;
    }

    @ConvertedMethod
    protected Object startRun(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    protected Object startClass(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "success",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    protected Object onTest(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object success = assignParameter(args, 1, true);
        if (null == success) {
            success = true;
        }
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    protected Object endClass(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    protected Object endRun(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    private Object isOfInterest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object group = null;
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
            return ZVal.assign(false);
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        test, WarningTestCase.class, "PHPUnit\\Framework\\WarningTestCase"))) {
            return ZVal.assign(false);
        }

        if (!ZVal.isEmpty(this.groups)) {
            for (ZPair zpairResult1327 :
                    ZVal.getIterable(
                            env.callMethod(test, "getGroups", ResultPrinter.class), env, true)) {
                group = ZVal.assign(zpairResult1327.getValue());
                if (function_in_array.f.env(env).call(group, this.groups).getBool()) {
                    return ZVal.assign(true);
                }
            }

            return ZVal.assign(false);
        }

        if (!ZVal.isEmpty(this.excludeGroups)) {
            for (ZPair zpairResult1328 :
                    ZVal.getIterable(
                            env.callMethod(test, "getGroups", ResultPrinter.class), env, true)) {
                group = ZVal.assign(zpairResult1328.getValue());
                if (function_in_array.f.env(env).call(group, this.excludeGroups).getBool()) {
                    return ZVal.assign(false);
                }
            }

            return ZVal.assign(true);
        }

        return ZVal.assign(true);
    }

    public static final Object CONST_class = "PHPUnit\\Util\\TestDox\\ResultPrinter";

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
                    .setName("PHPUnit\\Util\\TestDox\\ResultPrinter")
                    .setLookup(
                            ResultPrinter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "autoFlush",
                            "currentTestClassPrettified",
                            "currentTestMethodPrettified",
                            "excludeGroups",
                            "failed",
                            "groups",
                            "incomplete",
                            "out",
                            "outTarget",
                            "prettifier",
                            "risky",
                            "skipped",
                            "successful",
                            "testClass",
                            "testStatus",
                            "tests",
                            "warned")
                    .setFilename("vendor/phpunit/phpunit/src/Util/TestDox/ResultPrinter.php")
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
