package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SelfDescribing;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.IteratorAggregate;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Assert;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SkippedTestCase;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.PhptTestCase;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestSuiteIterator;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestResult;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_declared_classes;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.DataProviderTestSuite;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.FileLoader;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.InvalidArgumentHelper;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.BaseTestRunner;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.IncompleteTestCase;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeInterfaces.Iterator;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SkippedTestSuiteError;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.WarningTestCase;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.IncompleteTestError;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_bool;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SkippedTestError;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/TestSuite.php

*/

public class TestSuite extends RuntimeClassBase
        implements com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .PHPUnit
                        .namespaces
                        .Framework
                        .classes
                        .Test,
                SelfDescribing,
                IteratorAggregate {

    public Object backupGlobals = null;

    public Object backupStaticAttributes = null;

    public Object runTestInSeparateProcess = false;

    public Object name = "";

    public Object groups = ZVal.newArray();

    public Object tests = ZVal.newArray();

    public Object numTests = -1;

    public Object testCase = false;

    public Object foundClasses = ZVal.newArray();

    public Object cachedNumTests = null;

    public Object beStrictAboutChangesToGlobalState = null;

    public Object iteratorFilter = null;

    public Object declaredClasses = null;

    public TestSuite(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TestSuite.class) {
            this.__construct(env, args);
        }
    }

    public TestSuite(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "theClass")
    @ConvertedParameter(index = 1, name = "name")
    public Object __construct(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object theClass = assignParameter(args, 0, true);
        if (null == theClass) {
            theClass = "";
        }
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = "";
        }
        Object method = null;
        Object argumentsValid = null;
        Object constructor = null;
        this.declaredClasses = function_get_declared_classes.f.env(env).call().value();
        argumentsValid = false;
        if (ZVal.toBool(function_is_object.f.env(env).call(theClass).value())
                && ZVal.toBool(
                        ZVal.checkInstanceType(
                                theClass, ReflectionClass.class, "ReflectionClass"))) {
            argumentsValid = true;

        } else if (ZVal.toBool(
                        ZVal.toBool(function_is_string.f.env(env).call(theClass).value())
                                && ZVal.toBool(ZVal.strictNotEqualityCheck(theClass, "!==", "")))
                && ZVal.toBool(function_class_exists.f.env(env).call(theClass, false).value())) {
            argumentsValid = true;
            if (ZVal.equalityCheck(name, "")) {
                name = ZVal.assign(theClass);
            }

            theClass = new ReflectionClass(env, theClass);

        } else if (function_is_string.f.env(env).call(theClass).getBool()) {
            this.setName(env, theClass);
            return null;
        }

        if (!ZVal.isTrue(argumentsValid)) {
            throw ZVal.getException(env, new Exception(env));
        }

        if (!ZVal.isTrue(
                env.callMethod(theClass, "isSubclassOf", TestSuite.class, TestCase.CONST_class))) {
            throw ZVal.getException(
                    env,
                    new Exception(
                            env,
                            "Class \""
                                    + toStringR(
                                            toObjectR(theClass)
                                                    .accessProp(this, env)
                                                    .name("name")
                                                    .value(),
                                            env)
                                    + "\" does not extend PHPUnit\\Framework\\TestCase."));
        }

        if (ZVal.notEqualityCheck(name, "")) {
            this.setName(env, name);

        } else {
            this.setName(env, env.callMethod(theClass, "getName", TestSuite.class));
        }

        constructor = env.callMethod(theClass, "getConstructor", TestSuite.class);
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(constructor, "!==", ZVal.getNull()))
                && ZVal.toBool(
                        !ZVal.isTrue(env.callMethod(constructor, "isPublic", TestSuite.class)))) {
            this.addTest(
                    env,
                    runtimeStaticObject.warning(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Class \"%s\" has no public constructor.",
                                            env.callMethod(theClass, "getName", TestSuite.class))
                                    .value()));
            return null;
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1200 :
                ZVal.getIterable(
                        env.callMethod(theClass, "getMethods", TestSuite.class), env, true)) {
            method = ZVal.assign(zpairResult1200.getValue());
            if (ZVal.strictEqualityCheck(
                    env.callMethod(
                            env.callMethod(method, "getDeclaringClass", TestSuite.class),
                            "getName",
                            TestSuite.class),
                    "===",
                    Assert.CONST_class)) {
                continue;
            }

            if (ZVal.strictEqualityCheck(
                    env.callMethod(
                            env.callMethod(method, "getDeclaringClass", TestSuite.class),
                            "getName",
                            TestSuite.class),
                    "===",
                    TestCase.CONST_class)) {
                continue;
            }

            this.addTestMethod(env, theClass, method);
        }

        if (ZVal.isEmpty(this.tests)) {
            this.addTest(
                    env,
                    runtimeStaticObject.warning(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "No tests found in class \"%s\".",
                                            env.callMethod(theClass, "getName", TestSuite.class))
                                    .value()));
        }

        this.testCase = true;
        return null;
    }

    @ConvertedMethod
    protected Object setUp(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    protected Object tearDown(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getName(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "groups", defaultValue = "", defaultValueType = "array")
    public Object addTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object groups = assignParameter(args, 1, true);
        if (null == groups) {
            groups = ZVal.newArray();
        }
        Object _pClass = null;
        Object group = null;
        _pClass = new ReflectionClass(env, test);
        if (!ZVal.isTrue(env.callMethod(_pClass, "isAbstract", TestSuite.class))) {
            new ReferenceClassProperty(this, "tests", env).arrayAppend(env).set(test);
            this.numTests = -1;
            if (ZVal.toBool(
                            ZVal.checkInstanceType(
                                    test,
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .PHPUnit
                                            .namespaces
                                            .Framework
                                            .classes
                                            .TestSuite
                                            .class,
                                    "PHPUnit\\Framework\\TestSuite"))
                    && ZVal.toBool(ZVal.isEmpty(groups))) {
                groups = env.callMethod(test, "getGroups", TestSuite.class);
            }

            if (ZVal.isEmpty(groups)) {
                groups = ZVal.arrayFromList("default");
            }

            for (ZPair zpairResult1201 : ZVal.getIterable(groups, env, true)) {
                group = ZVal.assign(zpairResult1201.getValue());
                if (!arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "groups", env),
                        env,
                        group)) {
                    new ReferenceClassProperty(this, "groups", env)
                            .arrayAccess(env, group)
                            .set(ZVal.newArray(new ZPair(0, test)));

                } else {
                    new ReferenceClassProperty(this, "groups", env)
                            .arrayAppend(env, group)
                            .set(test);
                }
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
                env.callMethod(test, "setGroups", TestSuite.class, groups);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "testClass")
    public Object addTestSuite(RuntimeEnv env, Object... args) {
        Object testClass = assignParameter(args, 0, false);
        Object method = null;
        Object suiteMethod = null;
        if (ZVal.toBool(function_is_string.f.env(env).call(testClass).value())
                && ZVal.toBool(function_class_exists.f.env(env).call(testClass).value())) {
            testClass = new ReflectionClass(env, testClass);
        }

        if (!function_is_object.f.env(env).call(testClass).getBool()) {
            throw ZVal.getException(
                    env,
                    InvalidArgumentHelper.runtimeStaticObject.factory(
                            env, 1, "class name or object"));
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        testClass,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PHPUnit
                                .namespaces
                                .Framework
                                .classes
                                .TestSuite
                                .class,
                        "PHPUnit\\Framework\\TestSuite"))) {
            this.addTest(env, testClass);

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(testClass, ReflectionClass.class, "ReflectionClass"))) {
            suiteMethod = false;
            if (ZVal.toBool(!ZVal.isTrue(env.callMethod(testClass, "isAbstract", TestSuite.class)))
                    && ZVal.toBool(
                            env.callMethod(
                                    testClass,
                                    "hasMethod",
                                    TestSuite.class,
                                    BaseTestRunner.CONST_SUITE_METHODNAME))) {
                method =
                        env.callMethod(
                                testClass,
                                "getMethod",
                                TestSuite.class,
                                BaseTestRunner.CONST_SUITE_METHODNAME);
                if (ZVal.isTrue(env.callMethod(method, "isStatic", TestSuite.class))) {
                    this.addTest(
                            env,
                            env.callMethod(
                                    method,
                                    "invoke",
                                    TestSuite.class,
                                    ZVal.getNull(),
                                    env.callMethod(testClass, "getName", TestSuite.class)));
                    suiteMethod = true;
                }
            }

            if (ZVal.toBool(
                            ZVal.toBool(!ZVal.isTrue(suiteMethod))
                                    && ZVal.toBool(
                                            !ZVal.isTrue(
                                                    env.callMethod(
                                                            testClass,
                                                            "isAbstract",
                                                            TestSuite.class))))
                    && ZVal.toBool(
                            env.callMethod(
                                    testClass,
                                    "isSubclassOf",
                                    TestSuite.class,
                                    TestCase.CONST_class))) {
                this.addTest(
                        env,
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PHPUnit
                                .namespaces
                                .Framework
                                .classes
                                .TestSuite(env, testClass));
            }

        } else {
            throw ZVal.getException(env, new Exception(env));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filename", typeHint = "string")
    public Object addTestFile(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        Object filename = assignParameter(args, 0, false);
        Object shortNameRegEx = null;
        Object newClasses = null;
        Object method = null;
        Object i = null;
        Object className = null;
        Object shortName = null;
        Object _pClass = null;
        if (ZVal.toBool(function_file_exists.f.env(env).call(filename).value())
                && ZVal.toBool(
                        ZVal.equalityCheck(
                                function_substr.f.env(env).call(filename, -5).value(), ".phpt"))) {
            this.addTest(env, new PhptTestCase(env, filename));
            return null;
        }

        filename = FileLoader.runtimeStaticObject.checkAndLoad(env, filename);
        newClasses =
                function_array_diff
                        .f
                        .env(env)
                        .call(
                                function_get_declared_classes.f.env(env).call().value(),
                                this.declaredClasses)
                        .value();
        if (!ZVal.isEmpty(newClasses)) {
            this.foundClasses =
                    function_array_merge.f.env(env).call(newClasses, this.foundClasses).value();
            this.declaredClasses = function_get_declared_classes.f.env(env).call().value();
        }

        shortName = NamespaceGlobal.basename.env(env).call(filename, ".php").value();
        shortNameRegEx =
                "/(?:^|_|\\\\)"
                        + toStringR(
                                NamespaceGlobal.preg_quote.env(env).call(shortName, "/").value(),
                                env)
                        + "$/";
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1202 : ZVal.getIterable(this.foundClasses, env, false)) {
            i = ZVal.assign(zpairResult1202.getKey());
            className = ZVal.assign(zpairResult1202.getValue());
            if (function_preg_match.f.env(env).call(shortNameRegEx, className).getBool()) {
                _pClass = new ReflectionClass(env, className);
                if (ZVal.equalityCheck(
                        env.callMethod(_pClass, "getFileName", TestSuite.class), filename)) {
                    newClasses = ZVal.newArray(new ZPair(0, className));
                    arrayActionR(
                            ArrayAction.UNSET,
                            new ReferenceClassProperty(this, "foundClasses", env),
                            env,
                            i);
                    break;
                }
            }
        }

        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1203 : ZVal.getIterable(newClasses, env, true)) {
            className = ZVal.assign(zpairResult1203.getValue());
            _pClass = new ReflectionClass(env, className);
            if (ZVal.strictEqualityCheck(
                    function_dirname
                            .f
                            .env(env)
                            .call(env.callMethod(_pClass, "getFileName", TestSuite.class))
                            .value(),
                    "===",
                    env.addRootFilesystemPrefix("/vendor/phpunit/phpunit/src/Framework"))) {
                continue;
            }

            if (!ZVal.isTrue(env.callMethod(_pClass, "isAbstract", TestSuite.class))) {
                if (ZVal.isTrue(
                        env.callMethod(
                                _pClass,
                                "hasMethod",
                                TestSuite.class,
                                BaseTestRunner.CONST_SUITE_METHODNAME))) {
                    method =
                            env.callMethod(
                                    _pClass,
                                    "getMethod",
                                    TestSuite.class,
                                    BaseTestRunner.CONST_SUITE_METHODNAME);
                    if (ZVal.isTrue(env.callMethod(method, "isStatic", TestSuite.class))) {
                        this.addTest(
                                env,
                                env.callMethod(
                                        method,
                                        "invoke",
                                        TestSuite.class,
                                        ZVal.getNull(),
                                        className));
                    }

                } else if (ZVal.isTrue(
                        env.callMethod(
                                _pClass,
                                "implementsInterface",
                                TestSuite.class,
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .PHPUnit
                                        .namespaces
                                        .Framework
                                        .classes
                                        .Test
                                        .CONST_class))) {
                    this.addTestSuite(env, _pClass);
                }
            }
        }

        this.numTests = -1;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fileNames")
    public Object addTestFiles(RuntimeEnv env, Object... args) {
        Object fileNames = assignParameter(args, 0, false);
        Object filename = null;
        if (!ZVal.toBool(function_is_array.f.env(env).call(fileNames).value())
                || ZVal.toBool(
                        ZVal.toBool(function_is_object.f.env(env).call(fileNames).value())
                                && ZVal.toBool(
                                        ZVal.checkInstanceType(
                                                fileNames, Iterator.class, "Iterator")))) {
            throw ZVal.getException(
                    env,
                    InvalidArgumentHelper.runtimeStaticObject.factory(env, 1, "array or iterator"));
        }

        for (ZPair zpairResult1204 : ZVal.getIterable(fileNames, env, true)) {
            filename = ZVal.assign(zpairResult1204.getValue());
            this.addTestFile(env, toStringR(filename, env));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "preferCache",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object count(RuntimeEnv env, Object... args) {
        Object preferCache = assignParameter(args, 0, true);
        if (null == preferCache) {
            preferCache = false;
        }
        Object numTests = null;
        Object test = null;
        if (ZVal.toBool(preferCache)
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(this.cachedNumTests, "!==", ZVal.getNull()))) {
            return ZVal.assign(this.cachedNumTests);
        }

        numTests = 0;
        for (ZPair zpairResult1205 : ZVal.getIterable(this, env, true)) {
            test = ZVal.assign(zpairResult1205.getValue());
            numTests =
                    ZAssignment.add("+=", numTests, function_count.f.env(env).call(test).value());
        }

        this.cachedNumTests = numTests;
        return ZVal.assign(numTests);
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.name);
    }

    @ConvertedMethod
    public Object getGroups(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_array_keys.f.env(env).call(this.groups).value());
    }

    @ConvertedMethod
    public Object getGroupDetails(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.groups);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "groups", typeHint = "array")
    public Object setGroupDetails(RuntimeEnv env, Object... args) {
        Object groups = assignParameter(args, 0, false);
        this.groups = groups;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "result",
        typeHint = "PHPUnit\\Framework\\TestResult",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object run(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object result = assignParameter(args, 0, true);
        if (null == result) {
            result = ZVal.getNull();
        }
        Object missingRequirements = null;
        Object numTests = null;
        Object t = null;
        Object test = null;
        Object e = null;
        Object _t = null;
        Object beforeClassMethod = null;
        ReferenceContainer hookMethods = new BasicReferenceContainer(null);
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object afterClassMethod = null;
        if (ZVal.strictEqualityCheck(result, "===", ZVal.getNull())) {
            result = this.createResult(env);
        }

        if (ZVal.equalityCheck(function_count.f.env(env).call(this).value(), 0)) {
            return ZVal.assign(result);
        }

        hookMethods.setObject(
                com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes
                        .Test.runtimeStaticObject.getHookMethods(env, this.name));
        env.callMethod(result, "startTestSuite", TestSuite.class, this);
        try {
            this.setUp(env);
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult1206 :
                    ZVal.getIterable(hookMethods.arrayGet(env, "beforeClass"), env, true)) {
                beforeClassMethod = ZVal.assign(zpairResult1206.getValue());
                if (ZVal.toBool(
                                ZVal.toBool(ZVal.strictEqualityCheck(this.testCase, "===", true))
                                        && ZVal.toBool(
                                                function_class_exists
                                                        .f
                                                        .env(env)
                                                        .call(this.name, false)
                                                        .value()))
                        && ZVal.toBool(
                                function_method_exists
                                        .f
                                        .env(env)
                                        .call(this.name, beforeClassMethod)
                                        .value())) {
                    if (ZVal.isTrue(
                            missingRequirements =
                                    com.project.convertedCode.globalNamespace.namespaces.PHPUnit
                                            .namespaces.Util.classes.Test.runtimeStaticObject
                                            .getMissingRequirements(
                                                    env, this.name, beforeClassMethod))) {
                        this.markTestSuiteSkipped(
                                env,
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call("\n", missingRequirements)
                                        .value());
                    }

                    function_call_user_func
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    ZVal.newArray(
                                            new ZPair(0, this.name),
                                            new ZPair(1, beforeClassMethod)));
                }
            }

        } catch (ConvertedException convertedException149) {
            if (convertedException149.instanceOf(
                    SkippedTestSuiteError.class, "PHPUnit\\Framework\\SkippedTestSuiteError")) {
                e = convertedException149.getObject();
                numTests = function_count.f.env(env).call(this).value();
                runtimeConverterBreakCount = 0;
                for (i.setObject(0);
                        ZVal.isLessThan(i.getObject(), '<', numTests);
                        i.setObject(ZVal.increment(i.getObject()))) {
                    env.callMethod(result, "startTest", TestSuite.class, this);
                    env.callMethod(result, "addFailure", TestSuite.class, this, e, 0);
                    env.callMethod(result, "endTest", TestSuite.class, this, 0);
                }

                this.tearDown(env);
                env.callMethod(result, "endTestSuite", TestSuite.class, this);
                return ZVal.assign(result);
            } else if (convertedException149.instanceOf(Throwable.class, "Throwable")) {
                _t = convertedException149.getObject();
                t = ZVal.assign(_t);
            } else if (convertedException149.instanceOf(
                    Exception.class, "PHPUnit\\Framework\\Exception")) {
                _t = convertedException149.getObject();
                t = ZVal.assign(_t);
            } else {
                throw convertedException149;
            }
        }

        if (ZVal.isset(t)) {
            numTests = function_count.f.env(env).call(this).value();
            runtimeConverterBreakCount = 0;
            for (i.setObject(0);
                    ZVal.isLessThan(i.getObject(), '<', numTests);
                    i.setObject(ZVal.increment(i.getObject()))) {
                if (ZVal.isTrue(env.callMethod(result, "shouldStop", TestSuite.class))) {
                    break;
                }

                env.callMethod(result, "startTest", TestSuite.class, this);
                env.callMethod(result, "addError", TestSuite.class, this, t, 0);
                env.callMethod(result, "endTest", TestSuite.class, this, 0);
            }

            this.tearDown(env);
            env.callMethod(result, "endTestSuite", TestSuite.class, this);
            return ZVal.assign(result);
        }

        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult1207 : ZVal.getIterable(this, env, true)) {
            test = ZVal.assign(zpairResult1207.getValue());
            if (ZVal.isTrue(env.callMethod(result, "shouldStop", TestSuite.class))) {
                break;
            }

            if (ZVal.toBool(
                            ZVal.checkInstanceType(
                                    test, TestCase.class, "PHPUnit\\Framework\\TestCase"))
                    || ZVal.toBool(
                            ZVal.checkInstanceType(
                                    test,
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .PHPUnit
                                            .namespaces
                                            .Framework
                                            .classes
                                            .TestSuite
                                            .class,
                                    "PHPUnit\\Framework\\TestSuite"))) {
                env.callMethod(
                        test,
                        "setBeStrictAboutChangesToGlobalState",
                        TestSuite.class,
                        this.beStrictAboutChangesToGlobalState);
                env.callMethod(test, "setBackupGlobals", TestSuite.class, this.backupGlobals);
                env.callMethod(
                        test,
                        "setBackupStaticAttributes",
                        TestSuite.class,
                        this.backupStaticAttributes);
                env.callMethod(
                        test,
                        "setRunTestInSeparateProcess",
                        TestSuite.class,
                        this.runTestInSeparateProcess);
            }

            env.callMethod(test, "run", TestSuite.class, result);
        }

        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult1208 :
                ZVal.getIterable(hookMethods.arrayGet(env, "afterClass"), env, true)) {
            afterClassMethod = ZVal.assign(zpairResult1208.getValue());
            if (ZVal.toBool(
                            ZVal.toBool(ZVal.strictEqualityCheck(this.testCase, "===", true))
                                    && ZVal.toBool(
                                            function_class_exists
                                                    .f
                                                    .env(env)
                                                    .call(this.name, false)
                                                    .value()))
                    && ZVal.toBool(
                            function_method_exists
                                    .f
                                    .env(env)
                                    .call(this.name, afterClassMethod)
                                    .value())) {
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(
                                ZVal.newArray(
                                        new ZPair(0, this.name), new ZPair(1, afterClassMethod)));
            }
        }

        this.tearDown(env);
        env.callMethod(result, "endTestSuite", TestSuite.class, this);
        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "runTestInSeparateProcess", typeHint = "bool")
    public Object setRunTestInSeparateProcess(RuntimeEnv env, Object... args) {
        Object runTestInSeparateProcess = assignParameter(args, 0, false);
        this.runTestInSeparateProcess = runTestInSeparateProcess;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    public Object setName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        this.name = name;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "index", typeHint = "int")
    public Object testAt(RuntimeEnv env, Object... args) {
        Object index = assignParameter(args, 0, false);
        if (arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "tests", env), env, index)) {
            return ZVal.assign(new ReferenceClassProperty(this, "tests", env).arrayGet(env, index));
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object tests(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.tests);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tests", typeHint = "array")
    public Object setTests(RuntimeEnv env, Object... args) {
        Object tests = assignParameter(args, 0, false);
        this.tests = tests;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    public Object markTestSuiteSkipped(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, true);
        if (null == message) {
            message = "";
        }
        throw ZVal.getException(env, new SkippedTestSuiteError(env, message));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "beStrictAboutChangesToGlobalState")
    public Object setBeStrictAboutChangesToGlobalState(RuntimeEnv env, Object... args) {
        Object beStrictAboutChangesToGlobalState = assignParameter(args, 0, false);
        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                ZVal.getNull(), "===", this.beStrictAboutChangesToGlobalState))
                && ZVal.toBool(
                        function_is_bool
                                .f
                                .env(env)
                                .call(beStrictAboutChangesToGlobalState)
                                .value())) {
            this.beStrictAboutChangesToGlobalState = beStrictAboutChangesToGlobalState;
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "backupGlobals")
    public Object setBackupGlobals(RuntimeEnv env, Object... args) {
        Object backupGlobals = assignParameter(args, 0, false);
        if (ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.backupGlobals))
                && ZVal.toBool(function_is_bool.f.env(env).call(backupGlobals).value())) {
            this.backupGlobals = backupGlobals;
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "backupStaticAttributes")
    public Object setBackupStaticAttributes(RuntimeEnv env, Object... args) {
        Object backupStaticAttributes = assignParameter(args, 0, false);
        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                ZVal.getNull(), "===", this.backupStaticAttributes))
                && ZVal.toBool(function_is_bool.f.env(env).call(backupStaticAttributes).value())) {
            this.backupStaticAttributes = backupStaticAttributes;
        }

        return null;
    }

    @ConvertedMethod
    public Object getIterator(RuntimeEnv env, Object... args) {
        Object iterator = null;
        iterator = new TestSuiteIterator(env, this);
        if (ZVal.strictNotEqualityCheck(this.iteratorFilter, "!==", ZVal.getNull())) {
            iterator =
                    env.callMethod(this.iteratorFilter, "factory", TestSuite.class, iterator, this);
        }

        return ZVal.assign(iterator);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filter", typeHint = "PHPUnit\\Runner\\Filter\\Factory")
    public Object injectFilter(RuntimeEnv env, Object... args) {
        Object filter = assignParameter(args, 0, false);
        Object test = null;
        this.iteratorFilter = filter;
        for (ZPair zpairResult1209 : ZVal.getIterable(this, env, true)) {
            test = ZVal.assign(zpairResult1209.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            test,
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .PHPUnit
                                    .namespaces
                                    .Framework
                                    .classes
                                    .TestSuite
                                    .class,
                            "PHPUnit\\Framework\\TestSuite"))) {
                env.callMethod(test, "injectFilter", TestSuite.class, filter);
            }
        }

        return null;
    }

    @ConvertedMethod
    protected Object createResult(RuntimeEnv env, Object... args) {
        return ZVal.assign(new TestResult(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class", typeHint = "ReflectionClass")
    @ConvertedParameter(index = 1, name = "method", typeHint = "ReflectionMethod")
    protected Object addTestMethod(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object method = assignParameter(args, 1, false);
        Object test = null;
        Object name = null;
        if (!ZVal.isTrue(env.callMethod(this, "isTestMethod", TestSuite.class, method))) {
            return null;
        }

        name = env.callMethod(method, "getName", TestSuite.class);
        if (!ZVal.isTrue(env.callMethod(method, "isPublic", TestSuite.class))) {
            this.addTest(
                    env,
                    runtimeStaticObject.warning(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Test method \"%s\" in test class \"%s\" is not public.",
                                            name,
                                            env.callMethod(_pClass, "getName", TestSuite.class))
                                    .value()));
            return null;
        }

        test = runtimeStaticObject.createTest(env, _pClass, name);
        if (ZVal.toBool(
                        ZVal.checkInstanceType(
                                test, TestCase.class, "PHPUnit\\Framework\\TestCase"))
                || ZVal.toBool(
                        ZVal.checkInstanceType(
                                test,
                                DataProviderTestSuite.class,
                                "PHPUnit\\Framework\\DataProviderTestSuite"))) {
            env.callMethod(
                    test,
                    "setDependencies",
                    TestSuite.class,
                    com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util
                            .classes.Test.runtimeStaticObject.getDependencies(
                            env, env.callMethod(_pClass, "getName", TestSuite.class), name));
        }

        this.addTest(
                env,
                test,
                com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes
                        .Test.runtimeStaticObject.getGroups(
                        env, env.callMethod(_pClass, "getName", TestSuite.class), name));
        return null;
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\TestSuite";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "theClass", typeHint = "ReflectionClass")
        @ConvertedParameter(index = 1, name = "name")
        public Object createTest(RuntimeEnv env, Object... args) {
            Object theClass = assignParameter(args, 0, false);
            Object name = assignParameter(args, 1, false);
            Object _data = null;
            Object _test = null;
            Object test = null;
            Object data = null;
            Object runTestInSeparateProcess = null;
            Object e = null;
            Object constructor = null;
            Object groups = null;
            Object className = null;
            Object message = null;
            ReferenceContainer backupSettings = new BasicReferenceContainer(null);
            Object _dataName = null;
            Object _message = null;
            Object t = null;
            Object _t = null;
            Object preserveGlobalState = null;
            Object runClassInSeparateProcess = null;
            Object parameters = null;
            className = env.callMethod(theClass, "getName", TestSuite.class);
            if (!ZVal.isTrue(env.callMethod(theClass, "isInstantiable", TestSuite.class))) {
                return ZVal.assign(
                        runtimeStaticObject.warning(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("Cannot instantiate class \"%s\".", className)
                                        .value()));
            }

            backupSettings.setObject(
                    com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util
                            .classes.Test.runtimeStaticObject.getBackupSettings(
                            env, className, name));
            preserveGlobalState =
                    com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util
                            .classes.Test.runtimeStaticObject.getPreserveGlobalStateSettings(
                            env, className, name);
            runTestInSeparateProcess =
                    com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util
                            .classes.Test.runtimeStaticObject.getProcessIsolationSettings(
                            env, className, name);
            runClassInSeparateProcess =
                    com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util
                            .classes.Test.runtimeStaticObject.getClassProcessIsolationSettings(
                            env, className, name);
            constructor = env.callMethod(theClass, "getConstructor", TestSuite.class);
            if (ZVal.strictNotEqualityCheck(constructor, "!==", ZVal.getNull())) {
                parameters = env.callMethod(constructor, "getParameters", TestSuite.class);
                if (ZVal.isLessThan(function_count.f.env(env).call(parameters).value(), '<', 2)) {
                    test = env.createNew(className);

                } else {
                    try {
                        data =
                                com.project.convertedCode.globalNamespace.namespaces.PHPUnit
                                        .namespaces.Util.classes.Test.runtimeStaticObject
                                        .getProvidedData(env, className, name);
                    } catch (ConvertedException convertedException150) {
                        if (convertedException150.instanceOf(
                                IncompleteTestError.class,
                                "PHPUnit\\Framework\\IncompleteTestError")) {
                            e = convertedException150.getObject();
                            message =
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "Test for %s::%s marked incomplete by data provider",
                                                    className, name)
                                            .value();
                            _message = env.callMethod(e, "getMessage", TestSuite.class);
                            if (!ZVal.isEmpty(_message)) {
                                message = toStringR(message, env) + "\n" + toStringR(_message, env);
                            }

                            data =
                                    runtimeStaticObject.incompleteTest(
                                            env, className, name, message);
                        } else if (convertedException150.instanceOf(
                                SkippedTestError.class, "PHPUnit\\Framework\\SkippedTestError")) {
                            e = convertedException150.getObject();
                            message =
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "Test for %s::%s skipped by data provider",
                                                    className, name)
                                            .value();
                            _message = env.callMethod(e, "getMessage", TestSuite.class);
                            if (!ZVal.isEmpty(_message)) {
                                message = toStringR(message, env) + "\n" + toStringR(_message, env);
                            }

                            data = runtimeStaticObject.skipTest(env, className, name, message);
                        } else if (convertedException150.instanceOf(Throwable.class, "Throwable")) {
                            _t = convertedException150.getObject();
                            t = ZVal.assign(_t);
                        } else if (convertedException150.instanceOf(
                                Exception.class, "PHPUnit\\Framework\\Exception")) {
                            _t = convertedException150.getObject();
                            t = ZVal.assign(_t);
                        } else {
                            throw convertedException150;
                        }
                    }

                    if (ZVal.isset(t)) {
                        message =
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "The data provider specified for %s::%s is invalid.",
                                                className, name)
                                        .value();
                        _message = env.callMethod(t, "getMessage", TestSuite.class);
                        if (!ZVal.isEmpty(_message)) {
                            message = toStringR(message, env) + "\n" + toStringR(_message, env);
                        }

                        data = runtimeStaticObject.warning(env, message);
                    }

                    if (ZVal.isset(data)) {
                        test =
                                new DataProviderTestSuite(
                                        env,
                                        toStringR(className, env) + "::" + toStringR(name, env));
                        if (ZVal.isEmpty(data)) {
                            data =
                                    runtimeStaticObject.warning(
                                            env,
                                            function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            "No tests found in suite \"%s\".",
                                                            env.callMethod(
                                                                    test,
                                                                    "getName",
                                                                    TestSuite.class))
                                                    .value());
                        }

                        groups =
                                com.project.convertedCode.globalNamespace.namespaces.PHPUnit
                                        .namespaces.Util.classes.Test.runtimeStaticObject.getGroups(
                                        env, className, name);
                        if (ZVal.toBool(
                                        ZVal.toBool(
                                                        ZVal.checkInstanceType(
                                                                data,
                                                                WarningTestCase.class,
                                                                "PHPUnit\\Framework\\WarningTestCase"))
                                                || ZVal.toBool(
                                                        ZVal.checkInstanceType(
                                                                data,
                                                                SkippedTestCase.class,
                                                                "PHPUnit\\Framework\\SkippedTestCase")))
                                || ZVal.toBool(
                                        ZVal.checkInstanceType(
                                                data,
                                                IncompleteTestCase.class,
                                                "PHPUnit\\Framework\\IncompleteTestCase"))) {
                            env.callMethod(test, "addTest", TestSuite.class, data, groups);

                        } else {
                            for (ZPair zpairResult1199 : ZVal.getIterable(data, env, false)) {
                                _dataName = ZVal.assign(zpairResult1199.getKey());
                                _data = ZVal.assign(zpairResult1199.getValue());
                                _test = env.createNew(className, name, _data, _dataName);
                                if (ZVal.isTrue(runTestInSeparateProcess)) {
                                    env.callMethod(
                                            _test,
                                            "setRunTestInSeparateProcess",
                                            TestSuite.class,
                                            true);
                                    if (ZVal.strictNotEqualityCheck(
                                            preserveGlobalState, "!==", ZVal.getNull())) {
                                        env.callMethod(
                                                _test,
                                                "setPreserveGlobalState",
                                                TestSuite.class,
                                                preserveGlobalState);
                                    }
                                }

                                if (ZVal.isTrue(runClassInSeparateProcess)) {
                                    env.callMethod(
                                            _test,
                                            "setRunClassInSeparateProcess",
                                            TestSuite.class,
                                            true);
                                    if (ZVal.strictNotEqualityCheck(
                                            preserveGlobalState, "!==", ZVal.getNull())) {
                                        env.callMethod(
                                                _test,
                                                "setPreserveGlobalState",
                                                TestSuite.class,
                                                preserveGlobalState);
                                    }
                                }

                                if (ZVal.strictNotEqualityCheck(
                                        backupSettings.arrayGet(env, "backupGlobals"),
                                        "!==",
                                        ZVal.getNull())) {
                                    env.callMethod(
                                            _test,
                                            "setBackupGlobals",
                                            TestSuite.class,
                                            backupSettings.arrayGet(env, "backupGlobals"));
                                }

                                if (ZVal.strictNotEqualityCheck(
                                        backupSettings.arrayGet(env, "backupStaticAttributes"),
                                        "!==",
                                        ZVal.getNull())) {
                                    env.callMethod(
                                            _test,
                                            "setBackupStaticAttributes",
                                            TestSuite.class,
                                            backupSettings.arrayGet(env, "backupStaticAttributes"));
                                }

                                env.callMethod(test, "addTest", TestSuite.class, _test, groups);
                            }
                        }

                    } else {
                        test = env.createNew(className);
                    }
                }
            }

            if (!ZVal.isset(test)) {
                throw ZVal.getException(env, new Exception(env, "No valid test provided."));
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
                env.callMethod(test, "setName", TestSuite.class, name);
                if (ZVal.isTrue(runTestInSeparateProcess)) {
                    env.callMethod(test, "setRunTestInSeparateProcess", TestSuite.class, true);
                    if (ZVal.strictNotEqualityCheck(preserveGlobalState, "!==", ZVal.getNull())) {
                        env.callMethod(
                                test,
                                "setPreserveGlobalState",
                                TestSuite.class,
                                preserveGlobalState);
                    }
                }

                if (ZVal.isTrue(runClassInSeparateProcess)) {
                    env.callMethod(test, "setRunClassInSeparateProcess", TestSuite.class, true);
                    if (ZVal.strictNotEqualityCheck(preserveGlobalState, "!==", ZVal.getNull())) {
                        env.callMethod(
                                test,
                                "setPreserveGlobalState",
                                TestSuite.class,
                                preserveGlobalState);
                    }
                }

                if (ZVal.strictNotEqualityCheck(
                        backupSettings.arrayGet(env, "backupGlobals"), "!==", ZVal.getNull())) {
                    env.callMethod(
                            test,
                            "setBackupGlobals",
                            TestSuite.class,
                            backupSettings.arrayGet(env, "backupGlobals"));
                }

                if (ZVal.strictNotEqualityCheck(
                        backupSettings.arrayGet(env, "backupStaticAttributes"),
                        "!==",
                        ZVal.getNull())) {
                    env.callMethod(
                            test,
                            "setBackupStaticAttributes",
                            TestSuite.class,
                            backupSettings.arrayGet(env, "backupStaticAttributes"));
                }
            }

            return ZVal.assign(test);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "method", typeHint = "ReflectionMethod")
        public Object isTestMethod(RuntimeEnv env, Object... args) {
            Object method = assignParameter(args, 0, false);
            ReferenceContainer annotations = new BasicReferenceContainer(null);
            if (ZVal.strictEqualityCheck(
                    function_strpos
                            .f
                            .env(env)
                            .call(
                                    toObjectR(method).accessProp(this, env).name("name").value(),
                                    "test")
                            .value(),
                    "===",
                    0)) {
                return ZVal.assign(true);
            }

            annotations.setObject(
                    com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util
                            .classes.Test.runtimeStaticObject.parseAnnotations(
                            env, env.callMethod(method, "getDocComment", TestSuite.class)));
            return ZVal.assign(arrayActionR(ArrayAction.ISSET, annotations, env, "test"));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "message")
        protected Object warning(RuntimeEnv env, Object... args) {
            Object message = assignParameter(args, 0, false);
            return ZVal.assign(new WarningTestCase(env, message));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "class")
        @ConvertedParameter(index = 1, name = "methodName")
        @ConvertedParameter(index = 2, name = "message")
        protected Object skipTest(RuntimeEnv env, Object... args) {
            Object _pClass = assignParameter(args, 0, false);
            Object methodName = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, false);
            return ZVal.assign(new SkippedTestCase(env, _pClass, methodName, message));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "class")
        @ConvertedParameter(index = 1, name = "methodName")
        @ConvertedParameter(index = 2, name = "message")
        protected Object incompleteTest(RuntimeEnv env, Object... args) {
            Object _pClass = assignParameter(args, 0, false);
            Object methodName = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, false);
            return ZVal.assign(new IncompleteTestCase(env, _pClass, methodName, message));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\TestSuite")
                    .setLookup(
                            TestSuite.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "backupGlobals",
                            "backupStaticAttributes",
                            "beStrictAboutChangesToGlobalState",
                            "cachedNumTests",
                            "declaredClasses",
                            "foundClasses",
                            "groups",
                            "iteratorFilter",
                            "name",
                            "numTests",
                            "runTestInSeparateProcess",
                            "testCase",
                            "tests")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/TestSuite.php")
                    .addInterface("PHPUnit\\Framework\\Test")
                    .addInterface("Countable")
                    .addInterface("PHPUnit\\Framework\\SelfDescribing")
                    .addInterface("IteratorAggregate")
                    .addInterface("Traversable")
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
