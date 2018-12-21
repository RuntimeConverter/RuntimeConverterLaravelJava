package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.TestDox.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/TestDox/TestResult.php

*/

public final class TestResult extends RuntimeClassBase {

    public Object colorize = null;

    public Object testClass = null;

    public Object testMethod = null;

    public Object testSuccesful = null;

    public Object symbol = null;

    public Object additionalInformation = null;

    public Object additionalInformationVerbose = null;

    public Object runtime = null;

    public TestResult(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TestResult.class) {
            this.__construct(env, args);
        }
    }

    public TestResult(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "colorize", typeHint = "callable")
    @ConvertedParameter(index = 1, name = "testClass", typeHint = "string")
    @ConvertedParameter(index = 2, name = "testMethod", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object colorize = assignParameter(args, 0, false);
        Object testClass = assignParameter(args, 1, false);
        Object testMethod = assignParameter(args, 2, false);
        this.colorize = colorize;
        this.testClass = testClass;
        this.testMethod = testMethod;
        this.testSuccesful = true;
        this.symbol =
                env.callFunctionDynamic(
                                this.colorize,
                                new RuntimeArgsWithReferences(),
                                "fg-green",
                                "\u2714")
                        .value();
        this.additionalInformation = "";
        return null;
    }

    @ConvertedMethod
    public Object isTestSuccessful(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.testSuccesful);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "symbol", typeHint = "string")
    @ConvertedParameter(index = 1, name = "additionalInformation", typeHint = "string")
    @ConvertedParameter(
        index = 2,
        name = "additionalInformationVerbose",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object fail(RuntimeEnv env, Object... args) {
        Object symbol = assignParameter(args, 0, false);
        Object additionalInformation = assignParameter(args, 1, false);
        Object additionalInformationVerbose = assignParameter(args, 2, true);
        if (null == additionalInformationVerbose) {
            additionalInformationVerbose = false;
        }
        this.testSuccesful = false;
        this.symbol = symbol;
        this.additionalInformation = additionalInformation;
        this.additionalInformationVerbose = additionalInformationVerbose;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "runtime", typeHint = "float")
    public Object setRuntime(RuntimeEnv env, Object... args) {
        Object runtime = assignParameter(args, 0, false);
        this.runtime = runtime;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "previousTestResult")
    @ConvertedParameter(
        index = 1,
        name = "verbose",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object toString(RuntimeEnv env, Object... args) {
        Object previousTestResult = assignParameter(args, 0, false);
        Object verbose = assignParameter(args, 1, true);
        if (null == verbose) {
            verbose = false;
        }
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%s%s %s %s%s\n%s",
                                ZVal.toBool(previousTestResult)
                                                && ZVal.toBool(
                                                        env.callMethod(
                                                                previousTestResult,
                                                                "additionalInformationPrintable",
                                                                TestResult.class,
                                                                verbose))
                                        ? "\n"
                                        : "",
                                this.getClassNameHeader(
                                        env,
                                        ZVal.isTrue(previousTestResult)
                                                ? toObjectR(previousTestResult)
                                                        .accessProp(this, env)
                                                        .name("testClass")
                                                        .value()
                                                : ZVal.getNull()),
                                this.symbol,
                                this.testMethod,
                                ZVal.isTrue(verbose)
                                        ? " " + toStringR(this.getFormattedRuntime(env), env)
                                        : "",
                                this.getFormattedAdditionalInformation(env, verbose))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "previousTestClass")
    private Object getClassNameHeader(RuntimeEnv env, Object... args) {
        Object previousTestClass = assignParameter(args, 0, false);
        Object className = null;
        className = "";
        if (ZVal.strictNotEqualityCheck(this.testClass, "!==", previousTestClass)) {
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", previousTestClass)) {
                className = "\n";
            }

            className =
                    toStringR(className, env)
                            + toStringR(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call("%s\n", this.testClass)
                                            .value(),
                                    env);
        }

        return ZVal.assign(className);
    }

    @ConvertedMethod
    private Object getFormattedRuntime(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        if (ZVal.isGreaterThan(this.runtime, '>', 5)) {
            return ZVal.assign(
                    env.callFunctionDynamic(
                                    this.colorize,
                                    rLastRefArgs =
                                            new RuntimeArgsWithReferences()
                                                    .add(
                                                            1,
                                                            handleReturnReference(
                                                                    function_sprintf
                                                                            .f
                                                                            .env(env)
                                                                            .call(
                                                                                    "[%.2f ms]",
                                                                                    ZVal.multiply(
                                                                                            this
                                                                                                    .runtime,
                                                                                            1000))
                                                                            .value())),
                                    "fg-red",
                                    rLastRefArgs.get(1))
                            .value());
        }

        if (ZVal.isGreaterThan(this.runtime, '>', 1)) {
            return ZVal.assign(
                    env.callFunctionDynamic(
                                    this.colorize,
                                    rLastRefArgs =
                                            new RuntimeArgsWithReferences()
                                                    .add(
                                                            1,
                                                            handleReturnReference(
                                                                    function_sprintf
                                                                            .f
                                                                            .env(env)
                                                                            .call(
                                                                                    "[%.2f ms]",
                                                                                    ZVal.multiply(
                                                                                            this
                                                                                                    .runtime,
                                                                                            1000))
                                                                            .value())),
                                    "fg-yellow",
                                    rLastRefArgs.get(1))
                            .value());
        }

        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call("[%.2f ms]", ZVal.multiply(this.runtime, 1000))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "verbose")
    private Object getFormattedAdditionalInformation(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/phpunit/phpunit/src/Util/TestDox")
                        .setFile("/vendor/phpunit/phpunit/src/Util/TestDox/TestResult.php");
        Object verbose = assignParameter(args, 0, false);
        if (!ZVal.isTrue(this.additionalInformationPrintable(env, verbose))) {
            return "";
        }

        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "   \u2502\n%s\n",
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(
                                                "\n",
                                                function_array_map
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                new Closure(
                                                                        env,
                                                                        runtimeConverterFunctionClassConstants,
                                                                        "PHPUnit\\Util\\TestDox",
                                                                        this) {
                                                                    @Override
                                                                    @ConvertedMethod
                                                                    @ConvertedParameter(
                                                                        index = 0,
                                                                        name = "text",
                                                                        typeHint = "string"
                                                                    )
                                                                    public Object run(
                                                                            RuntimeEnv env,
                                                                            Object thisvar,
                                                                            PassByReferenceArgs
                                                                                    runtimePassByReferenceArgs,
                                                                            Object... args) {
                                                                        Object text =
                                                                                assignParameter(
                                                                                        args, 0,
                                                                                        false);
                                                                        return ZVal.assign(
                                                                                function_sprintf
                                                                                        .f
                                                                                        .env(env)
                                                                                        .call(
                                                                                                "   \u2502 %s",
                                                                                                text)
                                                                                        .value());
                                                                    }
                                                                },
                                                                function_explode
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                "\n",
                                                                                this
                                                                                        .additionalInformation)
                                                                        .value())
                                                        .value())
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "verbose", typeHint = "bool")
    private Object additionalInformationPrintable(RuntimeEnv env, Object... args) {
        Object verbose = assignParameter(args, 0, false);
        if (ZVal.strictEqualityCheck(this.additionalInformation, "===", "")) {
            return ZVal.assign(false);
        }

        if (ZVal.toBool(this.additionalInformationVerbose) && ZVal.toBool(!ZVal.isTrue(verbose))) {
            return ZVal.assign(false);
        }

        return ZVal.assign(true);
    }

    public static final Object CONST_class = "PHPUnit\\Util\\TestDox\\TestResult";

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
                    .setName("PHPUnit\\Util\\TestDox\\TestResult")
                    .setLookup(
                            TestResult.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "additionalInformation",
                            "additionalInformationVerbose",
                            "colorize",
                            "runtime",
                            "symbol",
                            "testClass",
                            "testMethod",
                            "testSuccesful")
                    .setFilename("vendor/phpunit/phpunit/src/Util/TestDox/TestResult.php")
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
