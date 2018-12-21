package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.GlobalState.classes.Restorer;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Assert;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.ObjectEnumerator.classes.Enumerator;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.PhptTestCase;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.GlobalState;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.GlobalState.classes.Blacklist;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.AssertionFailedError;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeClasses.exceptions.ReflectionException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.IncompleteTest;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestResult;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_end_clean;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.InvokedAtIndex;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Stub.classes.ConsecutiveCalls;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.GlobalState.classes.Snapshot;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Stub.classes.ReturnValueMap;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Stub.classes.ReturnSelf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.Generator;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Warning;
import com.project.convertedCode.globalNamespace.classes.Text_Template;
import com.runtimeconverter.runtime.nativeFunctions.file.function_clearstatcache;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_flip;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.InvokedCount;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.file.function_getcwd;
import com.runtimeconverter.runtime.nativeFunctions.file.function_chdir;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_start;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.InvokedAtLeastOnce;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.PHP.classes.AbstractPhpProcess;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.ExceptionMessage;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.InvokedAtMostCount;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.classes.Prophet;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_include_path;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Exporter.classes.Exporter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SelfDescribing;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.AnyInvokedCount;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes.Differ;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SkippedTestCase;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Stub.classes.ReturnStub;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.MockBuilder;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionObject;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_set;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.ExceptionMessageRegularExpression;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.ExceptionCode;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.RiskyTestError;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Stub.classes.ReturnCallback;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.Factory;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.BaseTestRunner;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prediction.classes.PredictionException;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.WarningTestCase;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Stub.classes.ReturnArgument;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_get_contents;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_get_level;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.classes.DeepCopy;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SkippedTest;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.InvokedAtLeastCount;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.MockObject;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SkippedTestError;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;
import static com.runtimeconverter.runtime.ZVal.assignParameterVarArgs;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/TestCase.php

*/

public abstract class TestCase extends Assert
        implements com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .PHPUnit
                        .namespaces
                        .Framework
                        .classes
                        .Test,
                SelfDescribing {

    public Object backupGlobals = null;

    public Object backupGlobalsBlacklist = ZVal.newArray();

    public Object backupStaticAttributes = null;

    public Object backupStaticAttributesBlacklist = ZVal.newArray();

    public Object runTestInSeparateProcess = null;

    public Object preserveGlobalState = true;

    public Object runClassInSeparateProcess = null;

    public Object inIsolation = false;

    public Object data = null;

    public Object dataName = null;

    public Object useErrorHandler = null;

    public Object expectedException = null;

    public Object expectedExceptionMessage = null;

    public Object expectedExceptionMessageRegExp = null;

    public Object expectedExceptionCode = null;

    public Object name = null;

    public Object dependencies = ZVal.newArray();

    public Object dependencyInput = ZVal.newArray();

    public Object iniSettings = ZVal.newArray();

    public Object locale = ZVal.newArray();

    public Object mockObjects = ZVal.newArray();

    public Object mockObjectGenerator = null;

    public Object status = BaseTestRunner.CONST_STATUS_UNKNOWN;

    public Object statusMessage = "";

    public Object numAssertions = 0;

    public Object result = null;

    public Object testResult = null;

    public Object output = "";

    public Object outputExpectedRegex = null;

    public Object outputExpectedString = null;

    public Object outputCallback = false;

    public Object outputBufferingActive = false;

    public Object outputBufferingLevel = null;

    public Object snapshot = null;

    public Object prophet = null;

    public Object beStrictAboutChangesToGlobalState = false;

    public Object registerMockObjectsFromTestArgumentsRecursively = false;

    public Object warnings = ZVal.newArray();

    public Object groups = ZVal.newArray();

    public Object doesNotPerformAssertions = false;

    public Object customComparators = ZVal.newArray();

    public TestCase(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TestCase.class) {
            this.__construct(env, args);
        }
    }

    public TestCase(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "data",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 2, name = "dataName")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        Object dataName = assignParameter(args, 2, true);
        if (null == dataName) {
            dataName = "";
        }
        if (ZVal.strictNotEqualityCheck(name, "!==", ZVal.getNull())) {
            this.setName(env, name);
        }

        this.data = data;
        this.dataName = dataName;
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
        Object buffer = null;
        Object _pClass = null;
        _pClass = new ReflectionClass(env, this);
        buffer =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%s::%s",
                                toObjectR(_pClass).accessProp(this, env).name("name").value(),
                                this.getName(env, false))
                        .value();
        return ZVal.assign(toStringR(buffer, env) + toStringR(this.getDataSetAsString(env), env));
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        return 1;
    }

    @ConvertedMethod
    public Object getGroups(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.groups);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "groups", typeHint = "array")
    public Object setGroups(RuntimeEnv env, Object... args) {
        Object groups = assignParameter(args, 0, false);
        this.groups = groups;
        return null;
    }

    @ConvertedMethod
    public Object getAnnotations(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes
                        .Test.runtimeStaticObject.parseTestMethodAnnotations(
                        env, function_get_class.f.env(env).call(this).value(), this.name));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "withDataSet",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object getName(RuntimeEnv env, Object... args) {
        Object withDataSet = assignParameter(args, 0, true);
        if (null == withDataSet) {
            withDataSet = true;
        }
        if (ZVal.isTrue(withDataSet)) {
            return ZVal.assign(
                    toStringR(this.name, env)
                            + toStringR(this.getDataSetAsString(env, false), env));
        }

        return ZVal.assign(this.name);
    }

    @ConvertedMethod
    public Object getSize(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes
                        .Test.runtimeStaticObject.getSize(
                        env,
                        function_get_class.f.env(env).call(this).value(),
                        this.getName(env, false)));
    }

    @ConvertedMethod
    public Object hasSize(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        this.getSize(env),
                        "!==",
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PHPUnit
                                .namespaces
                                .Util
                                .classes
                                .Test
                                .CONST_UNKNOWN));
    }

    @ConvertedMethod
    public Object isSmall(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        this.getSize(env),
                        "===",
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PHPUnit
                                .namespaces
                                .Util
                                .classes
                                .Test
                                .CONST_SMALL));
    }

    @ConvertedMethod
    public Object isMedium(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        this.getSize(env),
                        "===",
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PHPUnit
                                .namespaces
                                .Util
                                .classes
                                .Test
                                .CONST_MEDIUM));
    }

    @ConvertedMethod
    public Object isLarge(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        this.getSize(env),
                        "===",
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PHPUnit
                                .namespaces
                                .Util
                                .classes
                                .Test
                                .CONST_LARGE));
    }

    @ConvertedMethod
    public Object getActualOutput(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.outputBufferingActive)) {
            return ZVal.assign(this.output);
        }

        return ZVal.assign(function_ob_get_contents.f.env(env).call().value());
    }

    @ConvertedMethod
    public Object hasOutput(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(this.output, "===", "")) {
            return ZVal.assign(false);
        }

        if (ZVal.isTrue(this.hasExpectationOnOutput(env))) {
            return ZVal.assign(false);
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object doesNotPerformAssertions(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.doesNotPerformAssertions);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expectedRegex", typeHint = "string")
    public Object expectOutputRegex(RuntimeEnv env, Object... args) {
        Object expectedRegex = assignParameter(args, 0, false);
        this.outputExpectedRegex = expectedRegex;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expectedString", typeHint = "string")
    public Object expectOutputString(RuntimeEnv env, Object... args) {
        Object expectedString = assignParameter(args, 0, false);
        this.outputExpectedString = expectedString;
        return null;
    }

    @ConvertedMethod
    public Object hasExpectationOnOutput(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(function_is_string.f.env(env).call(this.outputExpectedString).value())
                        || ZVal.toBool(
                                function_is_string
                                        .f
                                        .env(env)
                                        .call(this.outputExpectedRegex)
                                        .value()));
    }

    @ConvertedMethod
    public Object getExpectedException(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.expectedException);
    }

    @ConvertedMethod
    public Object getExpectedExceptionCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.expectedExceptionCode);
    }

    @ConvertedMethod
    public Object getExpectedExceptionMessage(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.expectedExceptionMessage);
    }

    @ConvertedMethod
    public Object getExpectedExceptionMessageRegExp(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.expectedExceptionMessageRegExp);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exception", typeHint = "string")
    public Object expectException(RuntimeEnv env, Object... args) {
        Object exception = assignParameter(args, 0, false);
        this.expectedException = exception;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    public Object expectExceptionCode(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        this.expectedExceptionCode = code;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "string")
    public Object expectExceptionMessage(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        this.expectedExceptionMessage = message;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messageRegExp", typeHint = "string")
    public Object expectExceptionMessageRegExp(RuntimeEnv env, Object... args) {
        Object messageRegExp = assignParameter(args, 0, false);
        this.expectedExceptionMessageRegExp = messageRegExp;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exception", typeHint = "Exception")
    public Object expectExceptionObject(RuntimeEnv env, Object... args) {
        Object exception = assignParameter(args, 0, false);
        this.expectException(env, function_get_class.f.env(env).call(exception).value());
        this.expectExceptionMessage(env, env.callMethod(exception, "getMessage", TestCase.class));
        this.expectExceptionCode(env, env.callMethod(exception, "getCode", TestCase.class));
        return null;
    }

    @ConvertedMethod
    public Object expectNotToPerformAssertions(RuntimeEnv env, Object... args) {
        this.doesNotPerformAssertions = true;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object setRegisterMockObjectsFromTestArgumentsRecursively(
            RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, false);
        this.registerMockObjectsFromTestArgumentsRecursively = flag;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "useErrorHandler", typeHint = "bool")
    public Object setUseErrorHandler(RuntimeEnv env, Object... args) {
        Object useErrorHandler = assignParameter(args, 0, false);
        this.useErrorHandler = useErrorHandler;
        return null;
    }

    @ConvertedMethod
    public Object getStatus(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.status);
    }

    @ConvertedMethod
    public Object markAsRisky(RuntimeEnv env, Object... args) {
        this.status = BaseTestRunner.CONST_STATUS_RISKY;
        return null;
    }

    @ConvertedMethod
    public Object getStatusMessage(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.statusMessage);
    }

    @ConvertedMethod
    public Object hasFailed(RuntimeEnv env, Object... args) {
        Object status = null;
        status = this.getStatus(env);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        status, "===", BaseTestRunner.CONST_STATUS_FAILURE))
                        || ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        status, "===", BaseTestRunner.CONST_STATUS_ERROR)));
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
        Object result = assignParameter(args, 0, true);
        if (null == result) {
            result = ZVal.getNull();
        }
        Object template = null;
        Object enforcesTimeLimit = null;
        Object data = null;
        Object globals = null;
        Object isStrictAboutTestsThatDoNotTestAnything = null;
        Object includePath = null;
        Object dataName = null;
        Object runEntireClass = null;
        ReferenceContainer GLOBALS = new GlobalVariableReference(env, "GLOBALS");
        Object isStrictAboutResourceUsageDuringSmallTests = null;
        Object configurationFilePath = null;
        Object codeCoverageFilter = null;
        Object includedFiles = null;
        Object constants = null;
        Object _pClass = null;
        Object isStrictAboutOutputDuringTests = null;
        Object phar = null;
        Object coverage = null;
        Object oldErrorHandlerSetting = null;
        ReferenceContainer var = new BasicReferenceContainer(null);
        Object ternaryExpressionTemp = null;
        Object iniSettings = null;
        Object dependencyInput = null;
        Object php = null;
        Object isStrictAboutTodoAnnotatedTests = null;
        Object composerAutoload = null;
        if (ZVal.strictEqualityCheck(result, "===", ZVal.getNull())) {
            result = this.createResult(env);
        }

        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        this, WarningTestCase.class, "PHPUnit\\Framework\\WarningTestCase"))) {
            this.setTestResultObject(env, result);
            this.setUseErrorHandlerFromAnnotation(env);
        }

        if (ZVal.strictNotEqualityCheck(this.useErrorHandler, "!==", ZVal.getNull())) {
            oldErrorHandlerSetting =
                    env.callMethod(result, "getConvertErrorsToExceptions", TestCase.class);
            env.callMethod(
                    result, "convertErrorsToExceptions", TestCase.class, this.useErrorHandler);
        }

        if (ZVal.toBool(
                        ZVal.toBool(
                                        !ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        this,
                                                        WarningTestCase.class,
                                                        "PHPUnit\\Framework\\WarningTestCase")))
                                && ZVal.toBool(
                                        !ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        this,
                                                        SkippedTestCase.class,
                                                        "PHPUnit\\Framework\\SkippedTestCase"))))
                && ZVal.toBool(!ZVal.isTrue(this.handleDependencies(env)))) {
            return ZVal.assign(result);
        }

        runEntireClass =
                ZVal.toBool(this.runClassInSeparateProcess)
                        && ZVal.toBool(!ZVal.isTrue(this.runTestInSeparateProcess));
        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.toBool(
                                                        ZVal.strictEqualityCheck(
                                                                this.runTestInSeparateProcess,
                                                                "===",
                                                                true))
                                                || ZVal.toBool(
                                                        ZVal.strictEqualityCheck(
                                                                this.runClassInSeparateProcess,
                                                                "===",
                                                                true)))
                                && ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(this.inIsolation, "!==", true)))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        this,
                                        PhptTestCase.class,
                                        "PHPUnit\\Runner\\PhptTestCase")))) {
            _pClass = new ReflectionClass(env, this);
            if (ZVal.isTrue(runEntireClass)) {
                template =
                        new Text_Template(
                                env,
                                toStringR(
                                                env.addRootFilesystemPrefix(
                                                        "/vendor/phpunit/phpunit/src/Framework"),
                                                env)
                                        + "/../Util/PHP/Template/TestCaseClass.tpl");

            } else {
                template =
                        new Text_Template(
                                env,
                                toStringR(
                                                env.addRootFilesystemPrefix(
                                                        "/vendor/phpunit/phpunit/src/Framework"),
                                                env)
                                        + "/../Util/PHP/Template/TestCaseMethod.tpl");
            }

            if (ZVal.isTrue(this.preserveGlobalState)) {
                constants = GlobalState.runtimeStaticObject.getConstantsAsString(env);
                globals = GlobalState.runtimeStaticObject.getGlobalsAsString(env);
                includedFiles = GlobalState.runtimeStaticObject.getIncludedFilesAsString(env);
                iniSettings = GlobalState.runtimeStaticObject.getIniSettingsAsString(env);

            } else {
                constants = "";
                if (!arrayActionR(ArrayAction.EMPTY, GLOBALS, env, "__PHPUNIT_BOOTSTRAP")) {
                    globals =
                            "$GLOBALS['__PHPUNIT_BOOTSTRAP'] = "
                                    + toStringR(
                                            NamespaceGlobal.var_export
                                                    .env(env)
                                                    .call(
                                                            GLOBALS.arrayGet(
                                                                    env, "__PHPUNIT_BOOTSTRAP"),
                                                            true)
                                                    .value(),
                                            env)
                                    + ";\n";

                } else {
                    globals = "";
                }

                includedFiles = "";
                iniSettings = "";
            }

            coverage =
                    ZVal.assign(
                            ZVal.isTrue(
                                            env.callMethod(
                                                    result,
                                                    "getCollectCodeCoverageInformation",
                                                    TestCase.class))
                                    ? "true"
                                    : "false");
            isStrictAboutTestsThatDoNotTestAnything =
                    ZVal.assign(
                            ZVal.isTrue(
                                            env.callMethod(
                                                    result,
                                                    "isStrictAboutTestsThatDoNotTestAnything",
                                                    TestCase.class))
                                    ? "true"
                                    : "false");
            isStrictAboutOutputDuringTests =
                    ZVal.assign(
                            ZVal.isTrue(
                                            env.callMethod(
                                                    result,
                                                    "isStrictAboutOutputDuringTests",
                                                    TestCase.class))
                                    ? "true"
                                    : "false");
            enforcesTimeLimit =
                    ZVal.assign(
                            ZVal.isTrue(env.callMethod(result, "enforcesTimeLimit", TestCase.class))
                                    ? "true"
                                    : "false");
            isStrictAboutTodoAnnotatedTests =
                    ZVal.assign(
                            ZVal.isTrue(
                                            env.callMethod(
                                                    result,
                                                    "isStrictAboutTodoAnnotatedTests",
                                                    TestCase.class))
                                    ? "true"
                                    : "false");
            isStrictAboutResourceUsageDuringSmallTests =
                    ZVal.assign(
                            ZVal.isTrue(
                                            env.callMethod(
                                                    result,
                                                    "isStrictAboutResourceUsageDuringSmallTests",
                                                    TestCase.class))
                                    ? "true"
                                    : "false");
            if (function_defined.f.env(env).call("PHPUNIT_COMPOSER_INSTALL").getBool()) {
                composerAutoload =
                        NamespaceGlobal.var_export
                                .env(env)
                                .call(function_constant.get(env, "PHPUNIT_COMPOSER_INSTALL"), true)
                                .value();

            } else {
                composerAutoload = "''";
            }

            if (function_defined.f.env(env).call("__PHPUNIT_PHAR__").getBool()) {
                phar =
                        NamespaceGlobal.var_export
                                .env(env)
                                .call(function_constant.get(env, "__PHPUNIT_PHAR__"), true)
                                .value();

            } else {
                phar = "''";
            }

            if (ZVal.isTrue(env.callMethod(result, "getCodeCoverage", TestCase.class))) {
                codeCoverageFilter =
                        env.callMethod(
                                env.callMethod(result, "getCodeCoverage", TestCase.class),
                                "filter",
                                TestCase.class);

            } else {
                codeCoverageFilter = ZVal.getNull();
            }

            data =
                    NamespaceGlobal.var_export
                            .env(env)
                            .call(function_serialize.f.env(env).call(this.data).value(), true)
                            .value();
            dataName = NamespaceGlobal.var_export.env(env).call(this.dataName, true).value();
            dependencyInput =
                    NamespaceGlobal.var_export
                            .env(env)
                            .call(
                                    function_serialize
                                            .f
                                            .env(env)
                                            .call(this.dependencyInput)
                                            .value(),
                                    true)
                            .value();
            includePath =
                    NamespaceGlobal.var_export
                            .env(env)
                            .call(function_get_include_path.f.env(env).call().value(), true)
                            .value();
            codeCoverageFilter =
                    NamespaceGlobal.var_export
                            .env(env)
                            .call(
                                    function_serialize.f.env(env).call(codeCoverageFilter).value(),
                                    true)
                            .value();
            data = "'." + toStringR(data, env) + ".'";
            dataName = "'.(" + toStringR(dataName, env) + ").'";
            dependencyInput = "'." + toStringR(dependencyInput, env) + ".'";
            includePath = "'." + toStringR(includePath, env) + ".'";
            codeCoverageFilter = "'." + toStringR(codeCoverageFilter, env) + ".'";
            configurationFilePath =
                    ZVal.assign(
                            ZVal.isDefined(
                                            ternaryExpressionTemp =
                                                    GLOBALS.arrayGet(
                                                            env, "__PHPUNIT_CONFIGURATION_FILE"))
                                    ? ternaryExpressionTemp
                                    : "");
            var.setObject(
                    ZVal.newArray(
                            new ZPair("composerAutoload", composerAutoload),
                            new ZPair("phar", phar),
                            new ZPair(
                                    "filename",
                                    env.callMethod(_pClass, "getFileName", TestCase.class)),
                            new ZPair(
                                    "className",
                                    env.callMethod(_pClass, "getName", TestCase.class)),
                            new ZPair("collectCodeCoverageInformation", coverage),
                            new ZPair("data", data),
                            new ZPair("dataName", dataName),
                            new ZPair("dependencyInput", dependencyInput),
                            new ZPair("constants", constants),
                            new ZPair("globals", globals),
                            new ZPair("include_path", includePath),
                            new ZPair("included_files", includedFiles),
                            new ZPair("iniSettings", iniSettings),
                            new ZPair(
                                    "isStrictAboutTestsThatDoNotTestAnything",
                                    isStrictAboutTestsThatDoNotTestAnything),
                            new ZPair(
                                    "isStrictAboutOutputDuringTests",
                                    isStrictAboutOutputDuringTests),
                            new ZPair("enforcesTimeLimit", enforcesTimeLimit),
                            new ZPair(
                                    "isStrictAboutTodoAnnotatedTests",
                                    isStrictAboutTodoAnnotatedTests),
                            new ZPair(
                                    "isStrictAboutResourceUsageDuringSmallTests",
                                    isStrictAboutResourceUsageDuringSmallTests),
                            new ZPair("codeCoverageFilter", codeCoverageFilter),
                            new ZPair("configurationFilePath", configurationFilePath),
                            new ZPair("name", this.getName(env, false))));
            if (!ZVal.isTrue(runEntireClass)) {
                var.arrayAccess(env, "methodName").set(this.name);
            }

            env.callMethod(template, "setVar", TestCase.class, var.getObject());
            php = AbstractPhpProcess.runtimeStaticObject.factory(env);
            env.callMethod(
                    php,
                    "runTestJob",
                    TestCase.class,
                    env.callMethod(template, "render", TestCase.class),
                    this,
                    result);

        } else {
            env.callMethod(result, "run", TestCase.class, this);
        }

        if (ZVal.isset(oldErrorHandlerSetting)) {
            env.callMethod(
                    result, "convertErrorsToExceptions", TestCase.class, oldErrorHandlerSetting);
        }

        this.result = ZVal.getNull();
        return ZVal.assign(result);
    }

    @ConvertedMethod
    public Object runBare(RuntimeEnv env, Object... args) {
        Object method = null;
        Object e = null;
        Object hasMetRequirements = null;
        Object _e = null;
        ReferenceContainer hookMethods = new BasicReferenceContainer(null);
        Object currentWorkingDirectory = null;
        this.numAssertions = 0;
        this.snapshotGlobalState(env);
        this.startOutputBuffering(env);
        function_clearstatcache.f.env(env).call();
        currentWorkingDirectory = function_getcwd.f.env(env).call().value();
        hookMethods.setObject(
                com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes
                        .Test.runtimeStaticObject.getHookMethods(
                        env, function_get_class.f.env(env).call(this).value()));
        hasMetRequirements = false;
        try {
            this.checkRequirements(env);
            hasMetRequirements = true;
            if (ZVal.isTrue(this.inIsolation)) {
                for (ZPair zpairResult1169 :
                        ZVal.getIterable(hookMethods.arrayGet(env, "beforeClass"), env, true)) {
                    method = ZVal.assign(zpairResult1169.getValue());
                    env.callMethod(this, toStringR(method, env), TestCase.class);
                }
            }

            this.setExpectedExceptionFromAnnotation(env);
            this.setDoesNotPerformAssertionsFromAnnotation(env);
            for (ZPair zpairResult1170 :
                    ZVal.getIterable(hookMethods.arrayGet(env, "before"), env, true)) {
                method = ZVal.assign(zpairResult1170.getValue());
                env.callMethod(this, toStringR(method, env), TestCase.class);
            }

            this.assertPreConditions(env);
            this.testResult = this.runTest(env);
            this.verifyMockObjects(env);
            this.assertPostConditions(env);
            if (!ZVal.isEmpty(this.warnings)) {
                throw ZVal.getException(
                        env,
                        new Warning(
                                env,
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(
                                                "\n",
                                                function_array_unique
                                                        .f
                                                        .env(env)
                                                        .call(this.warnings)
                                                        .value())
                                        .value()));
            }

            this.status = BaseTestRunner.CONST_STATUS_PASSED;
        } catch (ConvertedException convertedException137) {
            if (convertedException137.instanceOf(
                    IncompleteTest.class, "PHPUnit\\Framework\\IncompleteTest")) {
                e = convertedException137.getObject();
                this.status = BaseTestRunner.CONST_STATUS_INCOMPLETE;
                this.statusMessage = env.callMethod(e, "getMessage", TestCase.class);
            } else if (convertedException137.instanceOf(
                    SkippedTest.class, "PHPUnit\\Framework\\SkippedTest")) {
                e = convertedException137.getObject();
                this.status = BaseTestRunner.CONST_STATUS_SKIPPED;
                this.statusMessage = env.callMethod(e, "getMessage", TestCase.class);
            } else if (convertedException137.instanceOf(
                    Warning.class, "PHPUnit\\Framework\\Warning")) {
                e = convertedException137.getObject();
                this.status = BaseTestRunner.CONST_STATUS_WARNING;
                this.statusMessage = env.callMethod(e, "getMessage", TestCase.class);
            } else if (convertedException137.instanceOf(
                    AssertionFailedError.class, "PHPUnit\\Framework\\AssertionFailedError")) {
                e = convertedException137.getObject();
                this.status = BaseTestRunner.CONST_STATUS_FAILURE;
                this.statusMessage = env.callMethod(e, "getMessage", TestCase.class);
            } else if (convertedException137.instanceOf(
                    PredictionException.class,
                    "Prophecy\\Exception\\Prediction\\PredictionException")) {
                e = convertedException137.getObject();
                this.status = BaseTestRunner.CONST_STATUS_FAILURE;
                this.statusMessage = env.callMethod(e, "getMessage", TestCase.class);
            } else if (convertedException137.instanceOf(Throwable.class, "Throwable")) {
                _e = convertedException137.getObject();
                e = ZVal.assign(_e);
                this.status = BaseTestRunner.CONST_STATUS_ERROR;
                this.statusMessage = env.callMethod(_e, "getMessage", TestCase.class);
            } else {
                throw convertedException137;
            }
        }

        this.mockObjects = ZVal.newArray();
        this.prophet = ZVal.getNull();
        try {
            if (ZVal.isTrue(hasMetRequirements)) {
                for (ZPair zpairResult1171 :
                        ZVal.getIterable(hookMethods.arrayGet(env, "after"), env, true)) {
                    method = ZVal.assign(zpairResult1171.getValue());
                    env.callMethod(this, toStringR(method, env), TestCase.class);
                }

                if (ZVal.isTrue(this.inIsolation)) {
                    for (ZPair zpairResult1172 :
                            ZVal.getIterable(hookMethods.arrayGet(env, "afterClass"), env, true)) {
                        method = ZVal.assign(zpairResult1172.getValue());
                        env.callMethod(this, toStringR(method, env), TestCase.class);
                    }
                }
            }

        } catch (ConvertedException convertedException138) {
            if (convertedException138.instanceOf(Throwable.class, "Throwable")) {
                _e = convertedException138.getObject();
                if (!ZVal.isset(e)) {
                    e = ZVal.assign(_e);
                }

            } else {
                throw convertedException138;
            }
        }

        try {
            this.stopOutputBuffering(env);
        } catch (ConvertedException convertedException139) {
            if (convertedException139.instanceOf(
                    RiskyTestError.class, "PHPUnit\\Framework\\RiskyTestError")) {
                _e = convertedException139.getObject();
                if (!ZVal.isset(e)) {
                    e = ZVal.assign(_e);
                }

            } else {
                throw convertedException139;
            }
        }

        if (ZVal.isset(_e)) {
            this.status = BaseTestRunner.CONST_STATUS_ERROR;
            this.statusMessage = env.callMethod(_e, "getMessage", TestCase.class);
        }

        function_clearstatcache.f.env(env).call();
        if (ZVal.notEqualityCheck(
                currentWorkingDirectory, function_getcwd.f.env(env).call().value())) {
            function_chdir.f.env(env).call(currentWorkingDirectory);
        }

        this.restoreGlobalState(env);
        this.unregisterCustomComparators(env);
        this.cleanupIniSettings(env);
        this.cleanupLocaleSettings(env);
        if (!ZVal.isset(e)) {
            try {
                if (ZVal.strictNotEqualityCheck(this.outputExpectedRegex, "!==", ZVal.getNull())) {
                    env.callMethod(
                            this,
                            "assertRegExp",
                            TestCase.class,
                            this.outputExpectedRegex,
                            this.output);

                } else if (ZVal.strictNotEqualityCheck(
                        this.outputExpectedString, "!==", ZVal.getNull())) {
                    env.callMethod(
                            this,
                            "assertEquals",
                            TestCase.class,
                            this.outputExpectedString,
                            this.output);
                }

            } catch (ConvertedException convertedException140) {
                if (convertedException140.instanceOf(Throwable.class, "Throwable")) {
                    _e = convertedException140.getObject();
                    e = ZVal.assign(_e);
                } else {
                    throw convertedException140;
                }
            }
        }

        if (ZVal.isset(e)) {
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            e,
                            PredictionException.class,
                            "Prophecy\\Exception\\Prediction\\PredictionException"))) {
                e = new AssertionFailedError(env, env.callMethod(e, "getMessage", TestCase.class));
            }

            this.onNotSuccessfulTest(env, e);
        }

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
    @ConvertedParameter(index = 0, name = "dependencies", typeHint = "array")
    public Object setDependencies(RuntimeEnv env, Object... args) {
        Object dependencies = assignParameter(args, 0, false);
        this.dependencies = dependencies;
        return null;
    }

    @ConvertedMethod
    public Object getDependencies(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.dependencies);
    }

    @ConvertedMethod
    public Object hasDependencies(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isGreaterThan(
                        function_count.f.env(env).call(this.dependencies).value(), '>', 0));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dependencyInput", typeHint = "array")
    public Object setDependencyInput(RuntimeEnv env, Object... args) {
        Object dependencyInput = assignParameter(args, 0, false);
        this.dependencyInput = dependencyInput;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "beStrictAboutChangesToGlobalState")
    public Object setBeStrictAboutChangesToGlobalState(RuntimeEnv env, Object... args) {
        Object beStrictAboutChangesToGlobalState = assignParameter(args, 0, false);
        this.beStrictAboutChangesToGlobalState = beStrictAboutChangesToGlobalState;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "backupGlobals")
    public Object setBackupGlobals(RuntimeEnv env, Object... args) {
        Object backupGlobals = assignParameter(args, 0, false);
        if (ZVal.toBool(ZVal.strictEqualityCheck(this.backupGlobals, "===", ZVal.getNull()))
                && ZVal.toBool(ZVal.strictNotEqualityCheck(backupGlobals, "!==", ZVal.getNull()))) {
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
                                this.backupStaticAttributes, "===", ZVal.getNull()))
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                backupStaticAttributes, "!==", ZVal.getNull()))) {
            this.backupStaticAttributes = backupStaticAttributes;
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "runTestInSeparateProcess", typeHint = "bool")
    public Object setRunTestInSeparateProcess(RuntimeEnv env, Object... args) {
        Object runTestInSeparateProcess = assignParameter(args, 0, false);
        if (ZVal.strictEqualityCheck(this.runTestInSeparateProcess, "===", ZVal.getNull())) {
            this.runTestInSeparateProcess = runTestInSeparateProcess;
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "runClassInSeparateProcess", typeHint = "bool")
    public Object setRunClassInSeparateProcess(RuntimeEnv env, Object... args) {
        Object runClassInSeparateProcess = assignParameter(args, 0, false);
        if (ZVal.strictEqualityCheck(this.runClassInSeparateProcess, "===", ZVal.getNull())) {
            this.runClassInSeparateProcess = runClassInSeparateProcess;
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "preserveGlobalState", typeHint = "bool")
    public Object setPreserveGlobalState(RuntimeEnv env, Object... args) {
        Object preserveGlobalState = assignParameter(args, 0, false);
        this.preserveGlobalState = preserveGlobalState;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "inIsolation", typeHint = "bool")
    public Object setInIsolation(RuntimeEnv env, Object... args) {
        Object inIsolation = assignParameter(args, 0, false);
        this.inIsolation = inIsolation;
        return null;
    }

    @ConvertedMethod
    public Object isInIsolation(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.inIsolation);
    }

    @ConvertedMethod
    public Object getResult(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.testResult);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "result")
    public Object setResult(RuntimeEnv env, Object... args) {
        Object result = assignParameter(args, 0, false);
        this.testResult = result;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "callable")
    public Object setOutputCallback(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        this.outputCallback = callback;
        return null;
    }

    @ConvertedMethod
    public Object getTestResultObject(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "result", typeHint = "PHPUnit\\Framework\\TestResult")
    public Object setTestResultObject(RuntimeEnv env, Object... args) {
        Object result = assignParameter(args, 0, false);
        this.result = result;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "mockObject",
        typeHint = "PHPUnit\\Framework\\MockObject\\MockObject"
    )
    public Object registerMockObject(RuntimeEnv env, Object... args) {
        Object mockObject = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "mockObjects", env).arrayAppend(env).set(mockObject);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className")
    public Object getMockBuilder(RuntimeEnv env, Object... args) {
        Object className = assignParameter(args, 0, false);
        return ZVal.assign(new MockBuilder(env, this, className));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "count", typeHint = "int")
    public Object addToAssertionCount(RuntimeEnv env, Object... args) {
        Object count = assignParameter(args, 0, false);
        this.numAssertions = ZAssignment.add("+=", this.numAssertions, count);
        return null;
    }

    @ConvertedMethod
    public Object getNumAssertions(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.numAssertions);
    }

    @ConvertedMethod
    public Object usesDataProvider(RuntimeEnv env, Object... args) {
        return ZVal.assign(!ZVal.isEmpty(this.data));
    }

    @ConvertedMethod
    public Object dataDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_is_string.f.env(env).call(this.dataName).getBool() ? this.dataName : "");
    }

    @ConvertedMethod
    public Object dataName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.dataName);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "comparator",
        typeHint = "SebastianBergmann\\Comparator\\Comparator"
    )
    public Object registerComparator(RuntimeEnv env, Object... args) {
        Object comparator = assignParameter(args, 0, false);
        env.callMethod(
                Factory.runtimeStaticObject.getInstance(env),
                "register",
                TestCase.class,
                comparator);
        new ReferenceClassProperty(this, "customComparators", env).arrayAppend(env).set(comparator);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "includeData",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object getDataSetAsString(RuntimeEnv env, Object... args) {
        Object includeData = assignParameter(args, 0, true);
        if (null == includeData) {
            includeData = true;
        }
        Object exporter = null;
        Object buffer = null;
        buffer = "";
        if (!ZVal.isEmpty(this.data)) {
            if (function_is_int.f.env(env).call(this.dataName).getBool()) {
                buffer =
                        toStringR(buffer, env)
                                + toStringR(
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(" with data set #%d", this.dataName)
                                                .value(),
                                        env);

            } else {
                buffer =
                        toStringR(buffer, env)
                                + toStringR(
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(" with data set \"%s\"", this.dataName)
                                                .value(),
                                        env);
            }

            exporter = new Exporter(env);
            if (ZVal.isTrue(includeData)) {
                buffer =
                        toStringR(buffer, env)
                                + toStringR(
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        " (%s)",
                                                        env.callMethod(
                                                                exporter,
                                                                new RuntimeArgsWithReferences()
                                                                        .add(
                                                                                0,
                                                                                new ReferenceClassProperty(
                                                                                        this,
                                                                                        "data",
                                                                                        env)),
                                                                "shortenedRecursiveExport",
                                                                TestCase.class,
                                                                this.data))
                                                .value(),
                                        env);
            }
        }

        return ZVal.assign(buffer);
    }

    @ConvertedMethod
    protected Object runTest(RuntimeEnv env, Object... args) {
        Object exception = null;
        Object testArguments = null;
        Object t = null;
        Object testResult = null;
        if (ZVal.strictEqualityCheck(this.name, "===", ZVal.getNull())) {
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
                            env, "PHPUnit\\Framework\\TestCase::$name must not be null."));
        }

        testArguments =
                function_array_merge.f.env(env).call(this.data, this.dependencyInput).value();
        env.callMethod(this, "registerMockObjectsFromTestArguments", TestCase.class, testArguments);
        try {
            testResult =
                    env.callMethod(
                            this,
                            new RuntimeArgsWithReferences(),
                            toStringR(this.name, env),
                            TestCase.class,
                            PackedVaradicArgs.unpack(
                                    new PackedVaradicArgs(
                                            function_array_values
                                                    .f
                                                    .env(env)
                                                    .call(testArguments)
                                                    .value())));
        } catch (ConvertedException convertedException141) {
            if (convertedException141.instanceOf(Throwable.class, "Throwable")) {
                t = convertedException141.getObject();
                exception = ZVal.assign(t);
            } else {
                throw convertedException141;
            }
        }

        if (ZVal.isset(exception)) {
            if (ZVal.isTrue(this.checkExceptionExpectations(env, exception))) {
                if (ZVal.strictNotEqualityCheck(this.expectedException, "!==", ZVal.getNull())) {
                    env.callMethod(
                            this,
                            "assertThat",
                            TestCase.class,
                            exception,
                            new com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .PHPUnit
                                    .namespaces
                                    .Framework
                                    .namespaces
                                    .Constraint
                                    .classes
                                    .Exception(env, this.expectedException));
                }

                if (ZVal.strictNotEqualityCheck(
                        this.expectedExceptionMessage, "!==", ZVal.getNull())) {
                    env.callMethod(
                            this,
                            "assertThat",
                            TestCase.class,
                            exception,
                            new ExceptionMessage(env, this.expectedExceptionMessage));
                }

                if (ZVal.strictNotEqualityCheck(
                        this.expectedExceptionMessageRegExp, "!==", ZVal.getNull())) {
                    env.callMethod(
                            this,
                            "assertThat",
                            TestCase.class,
                            exception,
                            new ExceptionMessageRegularExpression(
                                    env, this.expectedExceptionMessageRegExp));
                }

                if (ZVal.strictNotEqualityCheck(
                        this.expectedExceptionCode, "!==", ZVal.getNull())) {
                    env.callMethod(
                            this,
                            "assertThat",
                            TestCase.class,
                            exception,
                            new ExceptionCode(env, this.expectedExceptionCode));
                }

                return null;
            }

            throw ZVal.getException(env, exception);
        }

        if (ZVal.strictNotEqualityCheck(this.expectedException, "!==", ZVal.getNull())) {
            env.callMethod(
                    this,
                    "assertThat",
                    TestCase.class,
                    ZVal.getNull(),
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .PHPUnit
                            .namespaces
                            .Framework
                            .namespaces
                            .Constraint
                            .classes
                            .Exception(env, this.expectedException));

        } else if (ZVal.strictNotEqualityCheck(
                this.expectedExceptionMessage, "!==", ZVal.getNull())) {
            this.numAssertions = ZVal.increment(this.numAssertions);
            throw ZVal.getException(
                    env,
                    new AssertionFailedError(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Failed asserting that exception with message \"%s\" is thrown",
                                            this.expectedExceptionMessage)
                                    .value()));

        } else if (ZVal.strictNotEqualityCheck(
                this.expectedExceptionMessageRegExp, "!==", ZVal.getNull())) {
            this.numAssertions = ZVal.increment(this.numAssertions);
            throw ZVal.getException(
                    env,
                    new AssertionFailedError(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Failed asserting that exception with message matching \"%s\" is thrown",
                                            this.expectedExceptionMessageRegExp)
                                    .value()));

        } else if (ZVal.strictNotEqualityCheck(this.expectedExceptionCode, "!==", ZVal.getNull())) {
            this.numAssertions = ZVal.increment(this.numAssertions);
            throw ZVal.getException(
                    env,
                    new AssertionFailedError(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Failed asserting that exception with code \"%s\" is thrown",
                                            this.expectedExceptionCode)
                                    .value()));
        }

        return ZVal.assign(testResult);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "varName", typeHint = "string")
    @ConvertedParameter(index = 1, name = "newValue")
    protected Object iniSet(RuntimeEnv env, Object... args) {
        Object varName = assignParameter(args, 0, false);
        Object newValue = assignParameter(args, 1, false);
        Object currentValue = null;
        currentValue = function_ini_set.f.env(env).call(varName, newValue).value();
        if (ZVal.strictNotEqualityCheck(currentValue, "!==", false)) {
            new ReferenceClassProperty(this, "iniSettings", env)
                    .arrayAccess(env, varName)
                    .set(currentValue);

        } else {
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
                                            "INI setting \"%s\" could not be set to \"%s\".",
                                            varName, newValue)
                                    .value()));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args")
    protected Object setLocale(RuntimeEnv env, Object... args) {
        Object ___args = assignParameterVarArgs(args, 0);
        Object result = null;
        ReferenceContainer categories = new BasicReferenceContainer(null);
        Object category = null;
        Object locale = null;
        Object runtimeTempArrayResult141 = null;
        if (ZVal.isLessThan(function_count.f.env(env).call(___args).value(), '<', 2)) {
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
                            .Exception(env));
        }

        ZVal.list(
                runtimeTempArrayResult141 = ___args,
                (category = listGet(runtimeTempArrayResult141, 0, env)),
                (locale = listGet(runtimeTempArrayResult141, 1, env)));
        if (function_defined.f.env(env).call("LC_MESSAGES").getBool()) {
            categories.arrayAppend(env).set(5);
        }

        if (!function_in_array.f.env(env).call(category, CONST_LOCALE_CATEGORIES, true).getBool()) {
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
                            .Exception(env));
        }

        if (ZVal.toBool(!function_is_array.f.env(env).call(locale).getBool())
                && ZVal.toBool(!function_is_string.f.env(env).call(locale).getBool())) {
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
                            .Exception(env));
        }

        new ReferenceClassProperty(this, "locale", env)
                .arrayAccess(env, category)
                .set(NamespaceGlobal.setlocale.env(env).call(category, 0).value());
        result =
                NamespaceGlobal.setlocale
                        .env(env)
                        .call(PackedVaradicArgs.unpack(new PackedVaradicArgs(___args)))
                        .value();
        if (ZVal.strictEqualityCheck(result, "===", false)) {
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
                            "The locale functionality is not implemented on your platform, "
                                    + "the specified locale does not exist or the category name is "
                                    + "invalid."));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "originalClassName")
    protected Object createMock(RuntimeEnv env, Object... args) {
        Object originalClassName = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                env.callMethod(
                                                        this.getMockBuilder(env, originalClassName),
                                                        "disableOriginalConstructor",
                                                        TestCase.class),
                                                "disableOriginalClone",
                                                TestCase.class),
                                        "disableArgumentCloning",
                                        TestCase.class),
                                "disallowMockingUnknownTypes",
                                TestCase.class),
                        "getMock",
                        TestCase.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "originalClassName")
    @ConvertedParameter(index = 1, name = "configuration", typeHint = "array")
    protected Object createConfiguredMock(RuntimeEnv env, Object... args) {
        Object originalClassName = assignParameter(args, 0, false);
        Object configuration = assignParameter(args, 1, false);
        Object method = null;
        Object _pReturn = null;
        Object o = null;
        o = this.createMock(env, originalClassName);
        for (ZPair zpairResult1173 : ZVal.getIterable(configuration, env, false)) {
            method = ZVal.assign(zpairResult1173.getKey());
            _pReturn = ZVal.assign(zpairResult1173.getValue());
            env.callMethod(
                    env.callMethod(o, "method", TestCase.class, method),
                    "willReturn",
                    TestCase.class,
                    _pReturn);
        }

        return ZVal.assign(o);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "originalClassName")
    @ConvertedParameter(index = 1, name = "methods", typeHint = "array")
    protected Object createPartialMock(RuntimeEnv env, Object... args) {
        Object originalClassName = assignParameter(args, 0, false);
        Object methods = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                env.callMethod(
                                                        env.callMethod(
                                                                this.getMockBuilder(
                                                                        env, originalClassName),
                                                                "disableOriginalConstructor",
                                                                TestCase.class),
                                                        "disableOriginalClone",
                                                        TestCase.class),
                                                "disableArgumentCloning",
                                                TestCase.class),
                                        "disallowMockingUnknownTypes",
                                        TestCase.class),
                                "setMethods",
                                TestCase.class,
                                ZVal.isEmpty(methods) ? ZVal.getNull() : methods),
                        "getMock",
                        TestCase.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "originalClassName", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "constructorArguments",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    protected Object createTestProxy(RuntimeEnv env, Object... args) {
        Object originalClassName = assignParameter(args, 0, false);
        Object constructorArguments = assignParameter(args, 1, true);
        if (null == constructorArguments) {
            constructorArguments = ZVal.newArray();
        }
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        this.getMockBuilder(env, originalClassName),
                                        "setConstructorArgs",
                                        TestCase.class,
                                        constructorArguments),
                                "enableProxyingToOriginalMethods",
                                TestCase.class),
                        "getMock",
                        TestCase.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "originalClassName")
    @ConvertedParameter(index = 1, name = "methods", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 2,
        name = "arguments",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 3, name = "mockClassName")
    @ConvertedParameter(
        index = 4,
        name = "callOriginalConstructor",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "callOriginalClone",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "callAutoload",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 7,
        name = "cloneArguments",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object getMockClass(RuntimeEnv env, Object... args) {
        Object originalClassName = assignParameter(args, 0, false);
        Object methods = assignParameter(args, 1, true);
        if (null == methods) {
            methods = ZVal.newArray();
        }
        Object arguments = assignParameter(args, 2, true);
        if (null == arguments) {
            arguments = ZVal.newArray();
        }
        Object mockClassName = assignParameter(args, 3, true);
        if (null == mockClassName) {
            mockClassName = "";
        }
        Object callOriginalConstructor = assignParameter(args, 4, true);
        if (null == callOriginalConstructor) {
            callOriginalConstructor = false;
        }
        Object callOriginalClone = assignParameter(args, 5, true);
        if (null == callOriginalClone) {
            callOriginalClone = true;
        }
        Object callAutoload = assignParameter(args, 6, true);
        if (null == callAutoload) {
            callAutoload = true;
        }
        Object cloneArguments = assignParameter(args, 7, true);
        if (null == cloneArguments) {
            cloneArguments = false;
        }
        Object mock = null;
        mock =
                env.callMethod(
                        this.getMockObjectGenerator(env),
                        "getMock",
                        TestCase.class,
                        originalClassName,
                        methods,
                        arguments,
                        mockClassName,
                        callOriginalConstructor,
                        callOriginalClone,
                        callAutoload,
                        cloneArguments);
        return ZVal.assign(function_get_class.f.env(env).call(mock).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "originalClassName")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 2, name = "mockClassName")
    @ConvertedParameter(
        index = 3,
        name = "callOriginalConstructor",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "callOriginalClone",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "callAutoload",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "mockedMethods",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 7,
        name = "cloneArguments",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object getMockForAbstractClass(RuntimeEnv env, Object... args) {
        Object originalClassName = assignParameter(args, 0, false);
        Object arguments = assignParameter(args, 1, true);
        if (null == arguments) {
            arguments = ZVal.newArray();
        }
        Object mockClassName = assignParameter(args, 2, true);
        if (null == mockClassName) {
            mockClassName = "";
        }
        Object callOriginalConstructor = assignParameter(args, 3, true);
        if (null == callOriginalConstructor) {
            callOriginalConstructor = true;
        }
        Object callOriginalClone = assignParameter(args, 4, true);
        if (null == callOriginalClone) {
            callOriginalClone = true;
        }
        Object callAutoload = assignParameter(args, 5, true);
        if (null == callAutoload) {
            callAutoload = true;
        }
        Object mockedMethods = assignParameter(args, 6, true);
        if (null == mockedMethods) {
            mockedMethods = ZVal.newArray();
        }
        Object cloneArguments = assignParameter(args, 7, true);
        if (null == cloneArguments) {
            cloneArguments = false;
        }
        Object mockObject = null;
        mockObject =
                env.callMethod(
                        this.getMockObjectGenerator(env),
                        "getMockForAbstractClass",
                        TestCase.class,
                        originalClassName,
                        arguments,
                        mockClassName,
                        callOriginalConstructor,
                        callOriginalClone,
                        callAutoload,
                        mockedMethods,
                        cloneArguments);
        this.registerMockObject(env, mockObject);
        return ZVal.assign(mockObject);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "wsdlFile")
    @ConvertedParameter(index = 1, name = "originalClassName")
    @ConvertedParameter(index = 2, name = "mockClassName")
    @ConvertedParameter(
        index = 3,
        name = "methods",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 4,
        name = "callOriginalConstructor",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    protected Object getMockFromWsdl(RuntimeEnv env, Object... args) {
        Object wsdlFile = assignParameter(args, 0, false);
        Object originalClassName = assignParameter(args, 1, true);
        if (null == originalClassName) {
            originalClassName = "";
        }
        Object mockClassName = assignParameter(args, 2, true);
        if (null == mockClassName) {
            mockClassName = "";
        }
        Object methods = assignParameter(args, 3, true);
        if (null == methods) {
            methods = ZVal.newArray();
        }
        Object callOriginalConstructor = assignParameter(args, 4, true);
        if (null == callOriginalConstructor) {
            callOriginalConstructor = true;
        }
        Object options = assignParameter(args, 5, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object mockObject = null;
        if (ZVal.strictEqualityCheck(originalClassName, "===", "")) {
            originalClassName =
                    NamespaceGlobal.pathinfo
                            .env(env)
                            .call(
                                    NamespaceGlobal.basename
                                            .env(env)
                                            .call(
                                                    handleReturnReference(
                                                                    NamespaceGlobal.parse_url
                                                                            .env(env)
                                                                            .call(wsdlFile)
                                                                            .value())
                                                            .arrayGet(env, "path"))
                                            .value(),
                                    8)
                            .value();
        }

        if (!function_class_exists.f.env(env).call(originalClassName).getBool()) {
            com.runtimeconverter.runtime.ZVal.notImplemented("Eval Statement is not supported");
        }

        mockObject =
                env.callMethod(
                        this.getMockObjectGenerator(env),
                        "getMock",
                        TestCase.class,
                        originalClassName,
                        methods,
                        ZVal.newArray(new ZPair(0, ""), new ZPair(1, options)),
                        mockClassName,
                        callOriginalConstructor,
                        false,
                        false);
        this.registerMockObject(env, mockObject);
        return ZVal.assign(mockObject);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "traitName")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 2, name = "mockClassName")
    @ConvertedParameter(
        index = 3,
        name = "callOriginalConstructor",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "callOriginalClone",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "callAutoload",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "mockedMethods",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 7,
        name = "cloneArguments",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object getMockForTrait(RuntimeEnv env, Object... args) {
        Object traitName = assignParameter(args, 0, false);
        Object arguments = assignParameter(args, 1, true);
        if (null == arguments) {
            arguments = ZVal.newArray();
        }
        Object mockClassName = assignParameter(args, 2, true);
        if (null == mockClassName) {
            mockClassName = "";
        }
        Object callOriginalConstructor = assignParameter(args, 3, true);
        if (null == callOriginalConstructor) {
            callOriginalConstructor = true;
        }
        Object callOriginalClone = assignParameter(args, 4, true);
        if (null == callOriginalClone) {
            callOriginalClone = true;
        }
        Object callAutoload = assignParameter(args, 5, true);
        if (null == callAutoload) {
            callAutoload = true;
        }
        Object mockedMethods = assignParameter(args, 6, true);
        if (null == mockedMethods) {
            mockedMethods = ZVal.newArray();
        }
        Object cloneArguments = assignParameter(args, 7, true);
        if (null == cloneArguments) {
            cloneArguments = false;
        }
        Object mockObject = null;
        mockObject =
                env.callMethod(
                        this.getMockObjectGenerator(env),
                        "getMockForTrait",
                        TestCase.class,
                        traitName,
                        arguments,
                        mockClassName,
                        callOriginalConstructor,
                        callOriginalClone,
                        callAutoload,
                        mockedMethods,
                        cloneArguments);
        this.registerMockObject(env, mockObject);
        return ZVal.assign(mockObject);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "traitName")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 2, name = "traitClassName")
    @ConvertedParameter(
        index = 3,
        name = "callOriginalConstructor",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "callOriginalClone",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "callAutoload",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    protected Object getObjectForTrait(RuntimeEnv env, Object... args) {
        Object traitName = assignParameter(args, 0, false);
        Object arguments = assignParameter(args, 1, true);
        if (null == arguments) {
            arguments = ZVal.newArray();
        }
        Object traitClassName = assignParameter(args, 2, true);
        if (null == traitClassName) {
            traitClassName = "";
        }
        Object callOriginalConstructor = assignParameter(args, 3, true);
        if (null == callOriginalConstructor) {
            callOriginalConstructor = true;
        }
        Object callOriginalClone = assignParameter(args, 4, true);
        if (null == callOriginalClone) {
            callOriginalClone = true;
        }
        Object callAutoload = assignParameter(args, 5, true);
        if (null == callAutoload) {
            callAutoload = true;
        }
        return ZVal.assign(
                env.callMethod(
                        this.getMockObjectGenerator(env),
                        "getObjectForTrait",
                        TestCase.class,
                        traitName,
                        arguments,
                        traitClassName,
                        callOriginalConstructor,
                        callOriginalClone,
                        callAutoload));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "classOrInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object prophesize(RuntimeEnv env, Object... args) {
        Object classOrInterface = assignParameter(args, 0, true);
        if (null == classOrInterface) {
            classOrInterface = ZVal.getNull();
        }
        return ZVal.assign(
                env.callMethod(
                        this.getProphet(env), "prophesize", TestCase.class, classOrInterface));
    }

    @ConvertedMethod
    protected Object getProvidedData(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.data);
    }

    @ConvertedMethod
    protected Object createResult(RuntimeEnv env, Object... args) {
        return ZVal.assign(new TestResult(env));
    }

    @ConvertedMethod
    protected Object assertPreConditions(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    protected Object assertPostConditions(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "t", typeHint = "Throwable")
    protected Object onNotSuccessfulTest(RuntimeEnv env, Object... args) {
        Object t = assignParameter(args, 0, false);
        throw ZVal.getException(env, t);
    }

    @ConvertedMethod
    private Object setExpectedExceptionFromAnnotation(RuntimeEnv env, Object... args) {
        Object e = null;
        ReferenceContainer expectedException = new BasicReferenceContainer(null);
        try {
            expectedException.setObject(
                    com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util
                            .classes.Test.runtimeStaticObject.getExpectedException(
                            env, function_get_class.f.env(env).call(this).value(), this.name));
            if (ZVal.strictNotEqualityCheck(expectedException.getObject(), "!==", false)) {
                this.expectException(env, expectedException.arrayGet(env, "class"));
                if (ZVal.strictNotEqualityCheck(
                        expectedException.arrayGet(env, "code"), "!==", ZVal.getNull())) {
                    this.expectExceptionCode(env, expectedException.arrayGet(env, "code"));
                }

                if (ZVal.strictNotEqualityCheck(
                        expectedException.arrayGet(env, "message"), "!==", "")) {
                    this.expectExceptionMessage(env, expectedException.arrayGet(env, "message"));

                } else if (ZVal.strictNotEqualityCheck(
                        expectedException.arrayGet(env, "message_regex"), "!==", "")) {
                    this.expectExceptionMessageRegExp(
                            env, expectedException.arrayGet(env, "message_regex"));
                }
            }

        } catch (ConvertedException convertedException142) {
            if (convertedException142.instanceOf(
                    ReflectionException.class, "ReflectionException")) {
                e = convertedException142.getObject();
            } else {
                throw convertedException142;
            }
        }

        return null;
    }

    @ConvertedMethod
    private Object setUseErrorHandlerFromAnnotation(RuntimeEnv env, Object... args) {
        Object e = null;
        Object useErrorHandler = null;
        try {
            useErrorHandler =
                    com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util
                            .classes.Test.runtimeStaticObject.getErrorHandlerSettings(
                            env, function_get_class.f.env(env).call(this).value(), this.name);
            if (ZVal.strictNotEqualityCheck(useErrorHandler, "!==", ZVal.getNull())) {
                this.setUseErrorHandler(env, useErrorHandler);
            }

        } catch (ConvertedException convertedException143) {
            if (convertedException143.instanceOf(
                    ReflectionException.class, "ReflectionException")) {
                e = convertedException143.getObject();
            } else {
                throw convertedException143;
            }
        }

        return null;
    }

    @ConvertedMethod
    private Object checkRequirements(RuntimeEnv env, Object... args) {
        Object missingRequirements = null;
        if (ZVal.toBool(!ZVal.isTrue(this.name))
                || ZVal.toBool(
                        !function_method_exists.f.env(env).call(this, this.name).getBool())) {
            return null;
        }

        missingRequirements =
                com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes
                        .Test.runtimeStaticObject.getMissingRequirements(
                        env, function_get_class.f.env(env).call(this).value(), this.name);
        if (!ZVal.isEmpty(missingRequirements)) {
            env.callMethod(
                    this,
                    "markTestSkipped",
                    TestCase.class,
                    NamespaceGlobal.implode.env(env).call("\n", missingRequirements).value());
        }

        return null;
    }

    @ConvertedMethod
    private Object verifyMockObjects(RuntimeEnv env, Object... args) {
        Object methodProphecy = null;
        Object t = null;
        Object methodProphecies = null;
        Object objectProphecy = null;
        Object mockObject = null;
        for (ZPair zpairResult1174 : ZVal.getIterable(this.mockObjects, env, true)) {
            mockObject = ZVal.assign(zpairResult1174.getValue());
            if (ZVal.isTrue(env.callMethod(mockObject, "__phpunit_hasMatchers", TestCase.class))) {
                this.numAssertions = ZVal.increment(this.numAssertions);
            }

            env.callMethod(
                    mockObject,
                    "__phpunit_verify",
                    TestCase.class,
                    this.shouldInvocationMockerBeReset(env, mockObject));
        }

        if (ZVal.strictNotEqualityCheck(this.prophet, "!==", ZVal.getNull())) {
            try {
                env.callMethod(this.prophet, "checkPredictions", TestCase.class);
            } catch (ConvertedException convertedException144) {
                if (convertedException144.instanceOf(Throwable.class, "Throwable")) {
                    t = convertedException144.getObject();
                } else {
                    throw convertedException144;
                }
            }

            for (ZPair zpairResult1175 :
                    ZVal.getIterable(
                            env.callMethod(this.prophet, "getProphecies", TestCase.class),
                            env,
                            true)) {
                objectProphecy = ZVal.assign(zpairResult1175.getValue());
                for (ZPair zpairResult1176 :
                        ZVal.getIterable(
                                env.callMethod(
                                        objectProphecy, "getMethodProphecies", TestCase.class),
                                env,
                                true)) {
                    methodProphecies = ZVal.assign(zpairResult1176.getValue());
                    for (ZPair zpairResult1177 : ZVal.getIterable(methodProphecies, env, true)) {
                        methodProphecy = ZVal.assign(zpairResult1177.getValue());
                        this.numAssertions =
                                ZAssignment.add(
                                        "+=",
                                        this.numAssertions,
                                        function_count
                                                .f
                                                .env(env)
                                                .call(
                                                        env.callMethod(
                                                                methodProphecy,
                                                                "getCheckedPredictions",
                                                                TestCase.class))
                                                .value());
                    }
                }
            }

            if (ZVal.isset(t)) {
                throw ZVal.getException(env, t);
            }
        }

        return null;
    }

    @ConvertedMethod
    private Object handleDependencies(RuntimeEnv env, Object... args) {
        Object numKeys = null;
        ReferenceContainer passedKeys = new BasicReferenceContainer(null);
        Object pos = null;
        Object dependency = null;
        Object shallowClone = null;
        Object deepClone = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object className = null;
        ReferenceContainer passed = new BasicReferenceContainer(null);
        Object deepCopy = null;
        if (ZVal.toBool(!ZVal.isEmpty(this.dependencies))
                && ZVal.toBool(!ZVal.isTrue(this.inIsolation))) {
            className = function_get_class.f.env(env).call(this).value();
            passed.setObject(env.callMethod(this.result, "passed", TestCase.class));
            passedKeys.setObject(function_array_keys.f.env(env).call(passed.getObject()).value());
            numKeys = function_count.f.env(env).call(passedKeys.getObject()).value();
            for (i.setObject(0);
                    ZVal.isLessThan(i.getObject(), '<', numKeys);
                    i.setObject(ZVal.increment(i.getObject()))) {
                pos =
                        function_strpos
                                .f
                                .env(env)
                                .call(passedKeys.arrayGet(env, i.getObject()), " with data set")
                                .value();
                if (ZVal.strictNotEqualityCheck(pos, "!==", false)) {
                    passedKeys
                            .arrayAccess(env, i.getObject())
                            .set(
                                    function_substr
                                            .f
                                            .env(env)
                                            .call(passedKeys.arrayGet(env, i.getObject()), 0, pos)
                                            .value());
                }
            }

            passedKeys.setObject(
                    function_array_flip
                            .f
                            .env(env)
                            .call(
                                    function_array_unique
                                            .f
                                            .env(env)
                                            .call(passedKeys.getObject())
                                            .value())
                            .value());
            for (ZPair zpairResult1178 : ZVal.getIterable(this.dependencies, env, true)) {
                dependency = ZVal.assign(zpairResult1178.getValue());
                deepClone = false;
                shallowClone = false;
                if (ZVal.strictEqualityCheck(
                        function_strpos.f.env(env).call(dependency, "clone ").value(), "===", 0)) {
                    deepClone = true;
                    dependency =
                            function_substr
                                    .f
                                    .env(env)
                                    .call(
                                            dependency,
                                            function_strlen.f.env(env).call("clone ").value())
                                    .value();

                } else if (ZVal.strictEqualityCheck(
                        function_strpos.f.env(env).call(dependency, "!clone ").value(), "===", 0)) {
                    deepClone = false;
                    dependency =
                            function_substr
                                    .f
                                    .env(env)
                                    .call(
                                            dependency,
                                            function_strlen.f.env(env).call("!clone ").value())
                                    .value();
                }

                if (ZVal.strictEqualityCheck(
                        function_strpos.f.env(env).call(dependency, "shallowClone ").value(),
                        "===",
                        0)) {
                    shallowClone = true;
                    dependency =
                            function_substr
                                    .f
                                    .env(env)
                                    .call(
                                            dependency,
                                            function_strlen
                                                    .f
                                                    .env(env)
                                                    .call("shallowClone ")
                                                    .value())
                                    .value();

                } else if (ZVal.strictEqualityCheck(
                        function_strpos.f.env(env).call(dependency, "!shallowClone ").value(),
                        "===",
                        0)) {
                    shallowClone = false;
                    dependency =
                            function_substr
                                    .f
                                    .env(env)
                                    .call(
                                            dependency,
                                            function_strlen
                                                    .f
                                                    .env(env)
                                                    .call("!shallowClone ")
                                                    .value())
                                    .value();
                }

                if (ZVal.strictEqualityCheck(
                        function_strpos.f.env(env).call(dependency, "::").value(), "===", false)) {
                    dependency = toStringR(className, env) + "::" + toStringR(dependency, env);
                }

                if (!arrayActionR(ArrayAction.ISSET, passedKeys, env, dependency)) {
                    env.callMethod(this.result, "startTest", TestCase.class, this);
                    env.callMethod(
                            this.result,
                            "addError",
                            TestCase.class,
                            this,
                            new SkippedTestError(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "This test depends on \"%s\" to pass.",
                                                    dependency)
                                            .value()),
                            0);
                    env.callMethod(this.result, "endTest", TestCase.class, this, 0);
                    return ZVal.assign(false);
                }

                if (arrayActionR(ArrayAction.ISSET, passed, env, dependency)) {
                    if (ZVal.toBool(
                                    ZVal.toBool(
                                                    ZVal.notEqualityCheck(
                                                            passed.arrayGet(
                                                                    env, dependency, "size"),
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .PHPUnit
                                                                    .namespaces
                                                                    .Util
                                                                    .classes
                                                                    .Test
                                                                    .CONST_UNKNOWN))
                                            && ZVal.toBool(
                                                    ZVal.notEqualityCheck(
                                                            this.getSize(env),
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .PHPUnit
                                                                    .namespaces
                                                                    .Util
                                                                    .classes
                                                                    .Test
                                                                    .CONST_UNKNOWN)))
                            && ZVal.toBool(
                                    ZVal.isGreaterThan(
                                            passed.arrayGet(env, dependency, "size"),
                                            '>',
                                            this.getSize(env)))) {
                        env.callMethod(
                                this.result,
                                "addError",
                                TestCase.class,
                                this,
                                new SkippedTestError(
                                        env,
                                        "This test depends on a test that is larger than itself."),
                                0);
                        return ZVal.assign(false);
                    }

                    if (ZVal.isTrue(deepClone)) {
                        deepCopy = new DeepCopy(env);
                        env.callMethod(deepCopy, "skipUncloneable", TestCase.class, false);
                        new ReferenceClassProperty(this, "dependencyInput", env)
                                .arrayAccess(env, dependency)
                                .set(
                                        env.callMethod(
                                                deepCopy,
                                                "copy",
                                                TestCase.class,
                                                passed.arrayGet(env, dependency, "result")));

                    } else if (ZVal.isTrue(shallowClone)) {
                        new ReferenceClassProperty(this, "dependencyInput", env)
                                .arrayAccess(env, dependency)
                                .set(
                                        ((RuntimeClassInterface)
                                                        passed.arrayGet(env, dependency, "result"))
                                                .phpClone(env));

                    } else {
                        new ReferenceClassProperty(this, "dependencyInput", env)
                                .arrayAccess(env, dependency)
                                .set(passed.arrayGet(env, dependency, "result"));
                    }

                } else {
                    new ReferenceClassProperty(this, "dependencyInput", env)
                            .arrayAccess(env, dependency)
                            .set(ZVal.getNull());
                }
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    private Object getMockObjectGenerator(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(this.mockObjectGenerator, "===", ZVal.getNull())) {
            this.mockObjectGenerator = new Generator(env);
        }

        return ZVal.assign(this.mockObjectGenerator);
    }

    @ConvertedMethod
    private Object startOutputBuffering(RuntimeEnv env, Object... args) {
        function_ob_start.f.env(env).call();
        this.outputBufferingActive = true;
        this.outputBufferingLevel = function_ob_get_level.f.env(env).call().value();
        return null;
    }

    @ConvertedMethod
    private Object stopOutputBuffering(RuntimeEnv env, Object... args) {
        if (ZVal.strictNotEqualityCheck(
                function_ob_get_level.f.env(env).call().value(),
                "!==",
                this.outputBufferingLevel)) {
            while (ZVal.isGreaterThanOrEqualTo(
                    function_ob_get_level.f.env(env).call().value(),
                    ">=",
                    this.outputBufferingLevel)) {
                function_ob_end_clean.f.env(env).call();
            }

            throw ZVal.getException(
                    env,
                    new RiskyTestError(
                            env,
                            "Test code or tested code did not (only) close its own output buffers"));
        }

        this.output = function_ob_get_contents.f.env(env).call().value();
        if (ZVal.strictNotEqualityCheck(this.outputCallback, "!==", false)) {
            this.output =
                    toStringR(
                            function_call_user_func
                                    .f
                                    .env(env)
                                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                    .call(this.outputCallback, this.output)
                                    .value(),
                            env);
        }

        function_ob_end_clean.f.env(env).call();
        this.outputBufferingActive = false;
        this.outputBufferingLevel = function_ob_get_level.f.env(env).call().value();
        return null;
    }

    @ConvertedMethod
    private Object snapshotGlobalState(RuntimeEnv env, Object... args) {
        if (ZVal.toBool(ZVal.toBool(this.runTestInSeparateProcess) || ZVal.toBool(this.inIsolation))
                || ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                !ZVal.isTrue(this.backupGlobals), "===", true))
                                && ZVal.toBool(!ZVal.isTrue(this.backupStaticAttributes)))) {
            return null;
        }

        this.snapshot =
                this.createGlobalStateSnapshot(
                        env, ZVal.strictEqualityCheck(this.backupGlobals, "===", true));
        return null;
    }

    @ConvertedMethod
    private Object restoreGlobalState(RuntimeEnv env, Object... args) {
        Object rte = null;
        Object restorer = null;
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        this.snapshot,
                        Snapshot.class,
                        "SebastianBergmann\\GlobalState\\Snapshot"))) {
            return null;
        }

        if (ZVal.isTrue(this.beStrictAboutChangesToGlobalState)) {
            try {
                this.compareGlobalStateSnapshots(
                        env,
                        this.snapshot,
                        this.createGlobalStateSnapshot(
                                env, ZVal.strictEqualityCheck(this.backupGlobals, "===", true)));
            } catch (ConvertedException convertedException145) {
                if (convertedException145.instanceOf(
                        RiskyTestError.class, "PHPUnit\\Framework\\RiskyTestError")) {
                    rte = convertedException145.getObject();
                } else {
                    throw convertedException145;
                }
            }
        }

        restorer = new Restorer(env);
        if (ZVal.strictEqualityCheck(this.backupGlobals, "===", true)) {
            env.callMethod(restorer, "restoreGlobalVariables", TestCase.class, this.snapshot);
        }

        if (ZVal.isTrue(this.backupStaticAttributes)) {
            env.callMethod(restorer, "restoreStaticAttributes", TestCase.class, this.snapshot);
        }

        this.snapshot = ZVal.getNull();
        if (ZVal.isset(rte)) {
            throw ZVal.getException(env, rte);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "backupGlobals", typeHint = "bool")
    private Object createGlobalStateSnapshot(RuntimeEnv env, Object... args) {
        Object backupGlobals = assignParameter(args, 0, false);
        Object globalVariable = null;
        Object blacklist = null;
        Object attributes = null;
        Object attribute = null;
        Object _pClass = null;
        blacklist = new Blacklist(env);
        for (ZPair zpairResult1179 : ZVal.getIterable(this.backupGlobalsBlacklist, env, true)) {
            globalVariable = ZVal.assign(zpairResult1179.getValue());
            env.callMethod(blacklist, "addGlobalVariable", TestCase.class, globalVariable);
        }

        if (!function_defined.f.env(env).call("PHPUNIT_TESTSUITE").getBool()) {
            env.callMethod(blacklist, "addClassNamePrefix", TestCase.class, "PHPUnit");
            env.callMethod(
                    blacklist,
                    "addClassNamePrefix",
                    TestCase.class,
                    "SebastianBergmann\\CodeCoverage");
            env.callMethod(
                    blacklist,
                    "addClassNamePrefix",
                    TestCase.class,
                    "SebastianBergmann\\FileIterator");
            env.callMethod(
                    blacklist, "addClassNamePrefix", TestCase.class, "SebastianBergmann\\Invoker");
            env.callMethod(
                    blacklist, "addClassNamePrefix", TestCase.class, "SebastianBergmann\\Timer");
            env.callMethod(blacklist, "addClassNamePrefix", TestCase.class, "PHP_Token");
            env.callMethod(blacklist, "addClassNamePrefix", TestCase.class, "Symfony");
            env.callMethod(blacklist, "addClassNamePrefix", TestCase.class, "Text_Template");
            env.callMethod(
                    blacklist, "addClassNamePrefix", TestCase.class, "Doctrine\\Instantiator");
            env.callMethod(blacklist, "addClassNamePrefix", TestCase.class, "Prophecy");
            for (ZPair zpairResult1180 :
                    ZVal.getIterable(this.backupStaticAttributesBlacklist, env, false)) {
                _pClass = ZVal.assign(zpairResult1180.getKey());
                attributes = ZVal.assign(zpairResult1180.getValue());
                for (ZPair zpairResult1181 : ZVal.getIterable(attributes, env, true)) {
                    attribute = ZVal.assign(zpairResult1181.getValue());
                    env.callMethod(
                            blacklist, "addStaticAttribute", TestCase.class, _pClass, attribute);
                }
            }
        }

        return ZVal.assign(
                new Snapshot(
                        env,
                        blacklist,
                        backupGlobals,
                        ZVal.toBool(this.backupStaticAttributes),
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "before",
        typeHint = "SebastianBergmann\\GlobalState\\Snapshot"
    )
    @ConvertedParameter(
        index = 1,
        name = "after",
        typeHint = "SebastianBergmann\\GlobalState\\Snapshot"
    )
    private Object compareGlobalStateSnapshots(RuntimeEnv env, Object... args) {
        Object before = assignParameter(args, 0, false);
        Object after = assignParameter(args, 1, false);
        Object backupGlobals = null;
        backupGlobals =
                ZVal.toBool(ZVal.strictEqualityCheck(this.backupGlobals, "===", ZVal.getNull()))
                        || ZVal.toBool(ZVal.strictEqualityCheck(this.backupGlobals, "===", true));
        if (ZVal.isTrue(backupGlobals)) {
            this.compareGlobalStateSnapshotPart(
                    env,
                    env.callMethod(before, "globalVariables", TestCase.class),
                    env.callMethod(after, "globalVariables", TestCase.class),
                    "--- Global variables before the test\n+++ Global variables after the test\n");
            this.compareGlobalStateSnapshotPart(
                    env,
                    env.callMethod(before, "superGlobalVariables", TestCase.class),
                    env.callMethod(after, "superGlobalVariables", TestCase.class),
                    "--- Super-global variables before the test\n+++ Super-global variables after the test\n");
        }

        if (ZVal.isTrue(this.backupStaticAttributes)) {
            this.compareGlobalStateSnapshotPart(
                    env,
                    env.callMethod(before, "staticAttributes", TestCase.class),
                    env.callMethod(after, "staticAttributes", TestCase.class),
                    "--- Static attributes before the test\n+++ Static attributes after the test\n");
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "before", typeHint = "array")
    @ConvertedParameter(index = 1, name = "after", typeHint = "array")
    @ConvertedParameter(index = 2, name = "header", typeHint = "string")
    private Object compareGlobalStateSnapshotPart(RuntimeEnv env, Object... args) {
        Object before = assignParameter(args, 0, false);
        Object after = assignParameter(args, 1, false);
        Object header = assignParameter(args, 2, false);
        Object exporter = null;
        Object diff = null;
        Object differ = null;
        if (ZVal.notEqualityCheck(before, after)) {
            differ = new Differ(env, header);
            exporter = new Exporter(env);
            diff =
                    env.callMethod(
                            differ,
                            "diff",
                            TestCase.class,
                            env.callMethod(exporter, "export", TestCase.class, before),
                            env.callMethod(exporter, "export", TestCase.class, after));
            throw ZVal.getException(env, new RiskyTestError(env, diff));
        }

        return null;
    }

    @ConvertedMethod
    private Object getProphet(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(this.prophet, "===", ZVal.getNull())) {
            this.prophet = new Prophet(env);
        }

        return ZVal.assign(this.prophet);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "mock",
        typeHint = "PHPUnit\\Framework\\MockObject\\MockObject"
    )
    private Object shouldInvocationMockerBeReset(RuntimeEnv env, Object... args) {
        Object mock = assignParameter(args, 0, false);
        Object enumerator = null;
        Object _object = null;
        enumerator = new Enumerator(env);
        for (ZPair zpairResult1182 :
                ZVal.getIterable(
                        env.callMethod(
                                enumerator, "enumerate", TestCase.class, this.dependencyInput),
                        env,
                        true)) {
            _object = ZVal.assign(zpairResult1182.getValue());
            if (ZVal.strictEqualityCheck(mock, "===", _object)) {
                return ZVal.assign(false);
            }
        }

        if (ZVal.toBool(!function_is_array.f.env(env).call(this.testResult).getBool())
                && ZVal.toBool(!function_is_object.f.env(env).call(this.testResult).getBool())) {
            return ZVal.assign(true);
        }

        for (ZPair zpairResult1183 :
                ZVal.getIterable(
                        env.callMethod(enumerator, "enumerate", TestCase.class, this.testResult),
                        env,
                        true)) {
            _object = ZVal.assign(zpairResult1183.getValue());
            if (ZVal.strictEqualityCheck(mock, "===", _object)) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "testArguments", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "visited",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    private Object registerMockObjectsFromTestArguments(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        Object testArguments = assignParameter(args, 0, false);
        ReferenceContainer visited = assignParameterRef(runtimePassByReferenceArgs, args, 1, true);
        if (null == visited.getObject()) {
            visited.setObject(ZVal.newArray());
        }
        Object enumerator = null;
        Object testArgument = null;
        Object _object = null;
        if (ZVal.isTrue(this.registerMockObjectsFromTestArgumentsRecursively)) {
            enumerator = new Enumerator(env);
            for (ZPair zpairResult1184 :
                    ZVal.getIterable(
                            env.callMethod(enumerator, "enumerate", TestCase.class, testArguments),
                            env,
                            true)) {
                _object = ZVal.assign(zpairResult1184.getValue());
                if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                _object,
                                MockObject.class,
                                "PHPUnit\\Framework\\MockObject\\MockObject"))) {
                    this.registerMockObject(env, _object);
                }
            }

        } else {
            for (ZPair zpairResult1185 : ZVal.getIterable(testArguments, env, true)) {
                testArgument = ZVal.assign(zpairResult1185.getValue());
                if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                testArgument,
                                MockObject.class,
                                "PHPUnit\\Framework\\MockObject\\MockObject"))) {
                    if (ZVal.isTrue(this.isCloneable(env, testArgument))) {
                        testArgument =
                                ZVal.assign(((RuntimeClassInterface) testArgument).phpClone(env));
                    }

                    this.registerMockObject(env, testArgument);

                } else if (ZVal.toBool(function_is_array.f.env(env).call(testArgument).value())
                        && ZVal.toBool(
                                !function_in_array
                                        .f
                                        .env(env)
                                        .call(testArgument, visited.getObject(), true)
                                        .getBool())) {
                    visited.arrayAppend(env).set(testArgument);
                    env.callMethod(
                            this,
                            new RuntimeArgsWithReferences().add(1, visited),
                            "registerMockObjectsFromTestArguments",
                            TestCase.class,
                            testArgument,
                            visited.getObject());
                }
            }
        }

        return null;
    }

    public Object registerMockObjectsFromTestArguments(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    private Object setDoesNotPerformAssertionsFromAnnotation(RuntimeEnv env, Object... args) {
        ReferenceContainer annotations = new BasicReferenceContainer(null);
        annotations.setObject(this.getAnnotations(env));
        if (arrayActionR(
                ArrayAction.ISSET, annotations, env, "method", "doesNotPerformAssertions")) {
            this.doesNotPerformAssertions = true;
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "testArgument",
        typeHint = "PHPUnit\\Framework\\MockObject\\MockObject"
    )
    private Object isCloneable(RuntimeEnv env, Object... args) {
        Object testArgument = assignParameter(args, 0, false);
        Object reflector = null;
        reflector = new ReflectionObject(env, testArgument);
        if (!ZVal.isTrue(env.callMethod(reflector, "isCloneable", TestCase.class))) {
            return ZVal.assign(false);
        }

        if (ZVal.toBool(env.callMethod(reflector, "hasMethod", TestCase.class, "__clone"))
                && ZVal.toBool(
                        env.callMethod(
                                env.callMethod(reflector, "getMethod", TestCase.class, "__clone"),
                                "isPublic",
                                TestCase.class))) {
            return ZVal.assign(true);
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    private Object unregisterCustomComparators(RuntimeEnv env, Object... args) {
        Object factory = null;
        Object comparator = null;
        factory = Factory.runtimeStaticObject.getInstance(env);
        for (ZPair zpairResult1186 : ZVal.getIterable(this.customComparators, env, true)) {
            comparator = ZVal.assign(zpairResult1186.getValue());
            env.callMethod(factory, "unregister", TestCase.class, comparator);
        }

        this.customComparators = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    private Object cleanupIniSettings(RuntimeEnv env, Object... args) {
        Object varName = null;
        Object oldValue = null;
        for (ZPair zpairResult1187 : ZVal.getIterable(this.iniSettings, env, false)) {
            varName = ZVal.assign(zpairResult1187.getKey());
            oldValue = ZVal.assign(zpairResult1187.getValue());
            function_ini_set.f.env(env).call(varName, oldValue);
        }

        this.iniSettings = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    private Object cleanupLocaleSettings(RuntimeEnv env, Object... args) {
        Object category = null;
        Object locale = null;
        for (ZPair zpairResult1188 : ZVal.getIterable(this.locale, env, false)) {
            category = ZVal.assign(zpairResult1188.getKey());
            locale = ZVal.assign(zpairResult1188.getValue());
            NamespaceGlobal.setlocale.env(env).call(category, locale);
        }

        this.locale = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "throwable", typeHint = "Throwable")
    private Object checkExceptionExpectations(RuntimeEnv env, Object... args) {
        Object throwable = assignParameter(args, 0, false);
        Object result = null;
        Object reflector = null;
        result = false;
        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.toBool(
                                                        ZVal.strictNotEqualityCheck(
                                                                this.expectedException,
                                                                "!==",
                                                                ZVal.getNull()))
                                                || ZVal.toBool(
                                                        ZVal.strictNotEqualityCheck(
                                                                this.expectedExceptionCode,
                                                                "!==",
                                                                ZVal.getNull())))
                                || ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                this.expectedExceptionMessage,
                                                "!==",
                                                ZVal.getNull())))
                || ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                this.expectedExceptionMessageRegExp, "!==", ZVal.getNull()))) {
            result = true;
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        throwable,
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
                        "PHPUnit\\Framework\\Exception"))) {
            result = false;
        }

        if (function_is_string.f.env(env).call(this.expectedException).getBool()) {
            reflector = new ReflectionClass(env, this.expectedException);
            if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    this.expectedException,
                                                    "===",
                                                    "PHPUnit\\Framework\\Exception"))
                                    || ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    this.expectedException,
                                                    "===",
                                                    "\\PHPUnit\\Framework\\Exception")))
                    || ZVal.toBool(
                            env.callMethod(
                                    reflector,
                                    "isSubclassOf",
                                    TestCase.class,
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .PHPUnit
                                            .namespaces
                                            .Framework
                                            .classes
                                            .Exception
                                            .CONST_class))) {
                result = true;
            }
        }

        return ZVal.assign(result);
    }

    public static final Object CONST_LOCALE_CATEGORIES =
            ZVal.newArray(
                    new ZPair(0, 6),
                    new ZPair(1, 3),
                    new ZPair(2, 0),
                    new ZPair(3, 4),
                    new ZPair(4, 1),
                    new ZPair(5, 2));

    public static final Object CONST_class = "PHPUnit\\Framework\\TestCase";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Assert.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object any(RuntimeEnv env, Object... args) {
            return ZVal.assign(new AnyInvokedCount(env));
        }

        @ConvertedMethod
        public Object never(RuntimeEnv env, Object... args) {
            return ZVal.assign(new InvokedCount(env, 0));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "requiredInvocations", typeHint = "int")
        public Object atLeast(RuntimeEnv env, Object... args) {
            Object requiredInvocations = assignParameter(args, 0, false);
            return ZVal.assign(new InvokedAtLeastCount(env, requiredInvocations));
        }

        @ConvertedMethod
        public Object atLeastOnce(RuntimeEnv env, Object... args) {
            return ZVal.assign(new InvokedAtLeastOnce(env));
        }

        @ConvertedMethod
        public Object once(RuntimeEnv env, Object... args) {
            return ZVal.assign(new InvokedCount(env, 1));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "count", typeHint = "int")
        public Object exactly(RuntimeEnv env, Object... args) {
            Object count = assignParameter(args, 0, false);
            return ZVal.assign(new InvokedCount(env, count));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "allowedInvocations", typeHint = "int")
        public Object atMost(RuntimeEnv env, Object... args) {
            Object allowedInvocations = assignParameter(args, 0, false);
            return ZVal.assign(new InvokedAtMostCount(env, allowedInvocations));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "index", typeHint = "int")
        public Object at(RuntimeEnv env, Object... args) {
            Object index = assignParameter(args, 0, false);
            return ZVal.assign(new InvokedAtIndex(env, index));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object returnValue(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            return ZVal.assign(new ReturnStub(env, value));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "valueMap", typeHint = "array")
        public Object returnValueMap(RuntimeEnv env, Object... args) {
            Object valueMap = assignParameter(args, 0, false);
            return ZVal.assign(new ReturnValueMap(env, valueMap));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "argumentIndex", typeHint = "int")
        public Object returnArgument(RuntimeEnv env, Object... args) {
            Object argumentIndex = assignParameter(args, 0, false);
            return ZVal.assign(new ReturnArgument(env, argumentIndex));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "callback")
        public Object returnCallback(RuntimeEnv env, Object... args) {
            Object callback = assignParameter(args, 0, false);
            return ZVal.assign(new ReturnCallback(env, callback));
        }

        @ConvertedMethod
        public Object returnSelf(RuntimeEnv env, Object... args) {
            return ZVal.assign(new ReturnSelf(env));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "exception", typeHint = "Throwable")
        public Object throwException(RuntimeEnv env, Object... args) {
            Object exception = assignParameter(args, 0, false);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .PHPUnit
                            .namespaces
                            .Framework
                            .namespaces
                            .MockObject
                            .namespaces
                            .Stub
                            .classes
                            .Exception(env, exception));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "args")
        public Object onConsecutiveCalls(RuntimeEnv env, Object... args) {
            Object ___args = assignParameterVarArgs(args, 0);
            return ZVal.assign(new ConsecutiveCalls(env, ___args));
        }

        @ConvertedMethod
        public Object setUpBeforeClass(RuntimeEnv env, Object... args) {
            return null;
        }

        @ConvertedMethod
        public Object tearDownAfterClass(RuntimeEnv env, Object... args) {
            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\TestCase")
                    .setLookup(
                            TestCase.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "backupGlobals",
                            "backupGlobalsBlacklist",
                            "backupStaticAttributes",
                            "backupStaticAttributesBlacklist",
                            "beStrictAboutChangesToGlobalState",
                            "customComparators",
                            "data",
                            "dataName",
                            "dependencies",
                            "dependencyInput",
                            "doesNotPerformAssertions",
                            "expectedException",
                            "expectedExceptionCode",
                            "expectedExceptionMessage",
                            "expectedExceptionMessageRegExp",
                            "groups",
                            "inIsolation",
                            "iniSettings",
                            "locale",
                            "mockObjectGenerator",
                            "mockObjects",
                            "name",
                            "numAssertions",
                            "output",
                            "outputBufferingActive",
                            "outputBufferingLevel",
                            "outputCallback",
                            "outputExpectedRegex",
                            "outputExpectedString",
                            "preserveGlobalState",
                            "prophet",
                            "registerMockObjectsFromTestArgumentsRecursively",
                            "result",
                            "runClassInSeparateProcess",
                            "runTestInSeparateProcess",
                            "snapshot",
                            "status",
                            "statusMessage",
                            "testResult",
                            "useErrorHandler",
                            "warnings")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/TestCase.php")
                    .addInterface("PHPUnit\\Framework\\Test")
                    .addInterface("Countable")
                    .addInterface("PHPUnit\\Framework\\SelfDescribing")
                    .addExtendsClass("PHPUnit\\Framework\\Assert")
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
