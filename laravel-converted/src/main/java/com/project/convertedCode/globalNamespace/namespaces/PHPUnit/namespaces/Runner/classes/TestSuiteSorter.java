package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes;

import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reduce;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reverse;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_splice;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestSuite;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_shuffle;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.Exception;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_intersect;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.DataProviderTestSuite;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Runner/TestSuiteSorter.php

*/

public final class TestSuiteSorter extends RuntimeClassBase {

    public TestSuiteSorter(RuntimeEnv env, Object... args) {
        super(env);
    }

    public TestSuiteSorter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "order", typeHint = "int")
    @ConvertedParameter(index = 2, name = "resolveDependencies", typeHint = "bool")
    public Object reorderTestsInSuite(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, false);
        Object order = assignParameter(args, 1, false);
        Object resolveDependencies = assignParameter(args, 2, false);
        Object _suite = null;
        if (ZVal.toBool(
                        ZVal.toBool(ZVal.strictNotEqualityCheck(order, "!==", CONST_ORDER_DEFAULT))
                                && ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                order, "!==", CONST_ORDER_REVERSED)))
                && ZVal.toBool(ZVal.strictNotEqualityCheck(order, "!==", CONST_ORDER_RANDOMIZED))) {
            throw ZVal.getException(
                    env,
                    new Exception(
                            env,
                            "$order must be one of TestSuiteSorter::ORDER_DEFAULT, TestSuiteSorter::ORDER_REVERSED, or TestSuiteSorter::ORDER_RANDOMIZED"));
        }

        if (ZVal.toBool(
                        ZVal.checkInstanceType(
                                suite, TestSuite.class, "PHPUnit\\Framework\\TestSuite"))
                && ZVal.toBool(
                        !ZVal.isEmpty(env.callMethod(suite, "tests", TestSuiteSorter.class)))) {
            for (ZPair zpairResult1233 : ZVal.getIterable(suite, env, true)) {
                _suite = ZVal.assign(zpairResult1233.getValue());
                this.reorderTestsInSuite(env, _suite, order, resolveDependencies);
            }

            this.sort(env, suite, order, resolveDependencies);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    @ConvertedParameter(index = 1, name = "order", typeHint = "int")
    @ConvertedParameter(index = 2, name = "resolveDependencies", typeHint = "bool")
    private Object sort(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, false);
        Object order = assignParameter(args, 1, false);
        Object resolveDependencies = assignParameter(args, 2, false);
        if (ZVal.isEmpty(env.callMethod(suite, "tests", TestSuiteSorter.class))) {
            return null;
        }

        if (ZVal.strictEqualityCheck(order, "===", CONST_ORDER_REVERSED)) {
            env.callMethod(
                    suite,
                    "setTests",
                    TestSuiteSorter.class,
                    this.reverse(env, env.callMethod(suite, "tests", TestSuiteSorter.class)));

        } else if (ZVal.strictEqualityCheck(order, "===", CONST_ORDER_RANDOMIZED)) {
            env.callMethod(
                    suite,
                    "setTests",
                    TestSuiteSorter.class,
                    this.randomize(env, env.callMethod(suite, "tests", TestSuiteSorter.class)));
        }

        if (ZVal.toBool(
                        ZVal.toBool(resolveDependencies)
                                && ZVal.toBool(
                                        !ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        suite,
                                                        DataProviderTestSuite.class,
                                                        "PHPUnit\\Framework\\DataProviderTestSuite"))))
                && ZVal.toBool(this.suiteOnlyContainsTests(env, suite))) {
            env.callMethod(
                    suite,
                    "setTests",
                    TestSuiteSorter.class,
                    this.resolveDependencies(
                            env, env.callMethod(suite, "tests", TestSuiteSorter.class)));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    private Object suiteOnlyContainsTests(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/phpunit/phpunit/src/Runner")
                        .setFile("/vendor/phpunit/phpunit/src/Runner/TestSuiteSorter.php");
        Object suite = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_reduce
                        .f
                        .env(env)
                        .call(
                                env.callMethod(suite, "tests", TestSuiteSorter.class),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "PHPUnit\\Runner",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "carry")
                                    @ConvertedParameter(index = 1, name = "test")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object carry = assignParameter(args, 0, false);
                                        Object test = assignParameter(args, 1, false);
                                        return ZVal.assign(
                                                ZVal.toBool(carry)
                                                        && ZVal.toBool(
                                                                ZVal.toBool(
                                                                                ZVal
                                                                                        .checkInstanceType(
                                                                                                test,
                                                                                                TestCase
                                                                                                        .class,
                                                                                                "PHPUnit\\Framework\\TestCase"))
                                                                        || ZVal.toBool(
                                                                                ZVal
                                                                                        .checkInstanceType(
                                                                                                test,
                                                                                                DataProviderTestSuite
                                                                                                        .class,
                                                                                                "PHPUnit\\Framework\\DataProviderTestSuite"))));
                                    }
                                },
                                true)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tests", typeHint = "array")
    private Object reverse(RuntimeEnv env, Object... args) {
        Object tests = assignParameter(args, 0, false);
        return ZVal.assign(function_array_reverse.f.env(env).call(tests).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tests", typeHint = "array")
    private Object randomize(RuntimeEnv env, Object... args) {
        Object tests = assignParameter(args, 0, false);
        function_shuffle.f.env(env).call(tests);
        return ZVal.assign(tests);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tests", typeHint = "array")
    private Object resolveDependencies(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/phpunit/phpunit/src/Runner")
                        .setFile("/vendor/phpunit/phpunit/src/Runner/TestSuiteSorter.php");
        ReferenceContainer tests = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object todoNames = null;
        Object newTestOrder = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        newTestOrder = ZVal.newArray();
        i.setObject(0);
        do {
            todoNames =
                    function_array_map
                            .f
                            .env(env)
                            .call(
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "PHPUnit\\Runner",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(index = 0, name = "test")
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            Object _closureThisVar = this.getClosureThisVar();
                                            Object test = assignParameter(args, 0, false);
                                            return ZVal.assign(
                                                    TestSuiteSorter.this.getNormalizedTestName(
                                                            env, test));
                                        }
                                    },
                                    tests.getObject())
                            .value();
            if (ZVal.toBool(
                            !ZVal.isTrue(
                                    env.callMethod(
                                            tests.arrayGet(env, i.getObject()),
                                            "hasDependencies",
                                            TestSuiteSorter.class)))
                    || ZVal.toBool(
                            ZVal.isEmpty(
                                    function_array_intersect
                                            .f
                                            .env(env)
                                            .call(
                                                    this.getNormalizedDependencyNames(
                                                            env,
                                                            tests.arrayGet(env, i.getObject())),
                                                    todoNames)
                                            .value()))) {
                newTestOrder =
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        newTestOrder,
                                        function_array_splice
                                                .f
                                                .env(env)
                                                .call(tests.getObject(), i.getObject(), 1)
                                                .value())
                                .value();
                i.setObject(0);

            } else {
                i.setObject(ZVal.increment(i.getObject()));
            }

        } while (ZVal.toBool(!ZVal.isEmpty(tests.getObject()))
                && ZVal.toBool(
                        ZVal.isLessThan(
                                i.getObject(),
                                '<',
                                function_count.f.env(env).call(tests.getObject()).value())));

        return ZVal.assign(
                function_array_merge.f.env(env).call(newTestOrder, tests.getObject()).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test")
    private Object getNormalizedTestName(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        if (ZVal.strictNotEqualityCheck(
                function_strpos
                        .f
                        .env(env)
                        .call(env.callMethod(test, "getName", TestSuiteSorter.class), "::")
                        .value(),
                "!==",
                false)) {
            return ZVal.assign(env.callMethod(test, "getName", TestSuiteSorter.class));
        }

        return ZVal.assign(
                toStringR(function_get_class.f.env(env).call(test).value(), env)
                        + "::"
                        + toStringR(env.callMethod(test, "getName", TestSuiteSorter.class), env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test")
    private Object getNormalizedDependencyNames(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/phpunit/phpunit/src/Runner")
                        .setFile("/vendor/phpunit/phpunit/src/Runner/TestSuiteSorter.php");
        Object test = assignParameter(args, 0, false);
        Object names = null;
        Object testClass = null;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        test,
                        DataProviderTestSuite.class,
                        "PHPUnit\\Framework\\DataProviderTestSuite"))) {
            testClass =
                    function_substr
                            .f
                            .env(env)
                            .call(
                                    env.callMethod(test, "getName", TestSuiteSorter.class),
                                    0,
                                    function_strpos
                                            .f
                                            .env(env)
                                            .call(
                                                    env.callMethod(
                                                            test, "getName", TestSuiteSorter.class),
                                                    "::")
                                            .value())
                            .value();

        } else {
            testClass = function_get_class.f.env(env).call(test).value();
        }

        names =
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "PHPUnit\\Runner",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "name")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object name = assignParameter(args, 0, false);
                                        Object testClass = null;
                                        testClass =
                                                this.contextReferences.getCapturedValue(
                                                        "testClass");
                                        return ZVal.assign(
                                                ZVal.strictEqualityCheck(
                                                                function_strpos
                                                                        .f
                                                                        .env(env)
                                                                        .call(name, "::")
                                                                        .value(),
                                                                "===",
                                                                false)
                                                        ? toStringR(testClass, env)
                                                                + "::"
                                                                + toStringR(name, env)
                                                        : name);
                                    }
                                }.use("testClass", testClass),
                                env.callMethod(test, "getDependencies", TestSuiteSorter.class))
                        .value();
        return ZVal.assign(names);
    }

    public static final Object CONST_ORDER_DEFAULT = 0;

    public static final Object CONST_ORDER_RANDOMIZED = 1;

    public static final Object CONST_ORDER_REVERSED = 2;

    public static final Object CONST_class = "PHPUnit\\Runner\\TestSuiteSorter";

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
                    .setName("PHPUnit\\Runner\\TestSuiteSorter")
                    .setLookup(
                            TestSuiteSorter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/phpunit/src/Runner/TestSuiteSorter.php")
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
