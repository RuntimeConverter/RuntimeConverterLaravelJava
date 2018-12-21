package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Adapter.namespaces.Phpunit.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.classes.Mockery;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Adapter/Phpunit/MockeryTestCase.php

*/

public abstract class MockeryTestCase extends TestCase {

    public Object mockeryOpen = null;

    public MockeryTestCase(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MockeryTestCase.class) {
            this.__construct(env, args);
        }
    }

    public MockeryTestCase(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    protected Object assertPostConditions(RuntimeEnv env, Object... args) {
        this.addMockeryExpectationsToAssertionCount(env);
        this.checkMockeryExceptions(env);
        this.closeMockery(env);
        super.assertPostConditions(env);
        return null;
    }

    @ConvertedMethod
    protected Object addMockeryExpectationsToAssertionCount(RuntimeEnv env, Object... args) {
        env.callMethod(
                this,
                "addToAssertionCount",
                MockeryTestCase.class,
                env.callMethod(
                        Mockery.runtimeStaticObject.getContainer(env),
                        "mockery_getExpectationCount",
                        MockeryTestCase.class));
        return null;
    }

    @ConvertedMethod
    protected Object checkMockeryExceptions(RuntimeEnv env, Object... args) {
        Object e = null;
        if (!function_method_exists.f.env(env).call(this, "markAsRisky").getBool()) {
            return null;
        }

        for (ZPair zpairResult2383 :
                ZVal.getIterable(
                        env.callMethod(
                                Mockery.runtimeStaticObject.getContainer(env),
                                "mockery_thrownExceptions",
                                MockeryTestCase.class),
                        env,
                        true)) {
            e = ZVal.assign(zpairResult2383.getValue());
            if (!ZVal.isTrue(env.callMethod(e, "dismissed", MockeryTestCase.class))) {
                env.callMethod(this, "markAsRisky", MockeryTestCase.class);
            }
        }

        return null;
    }

    @ConvertedMethod
    protected Object closeMockery(RuntimeEnv env, Object... args) {
        Mockery.runtimeStaticObject.close(env);
        this.mockeryOpen = false;
        return null;
    }

    @ConvertedMethod
    protected Object startMockery(RuntimeEnv env, Object... args) {
        this.mockeryOpen = true;
        return null;
    }

    @ConvertedMethod
    protected Object purgeMockeryContainer(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.mockeryOpen)) {
            Mockery.runtimeStaticObject.close(env);
        }

        return null;
    }

    public static final Object CONST_class = "Mockery\\Adapter\\Phpunit\\MockeryTestCase";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends TestCase.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Mockery\\Adapter\\Phpunit\\MockeryTestCase")
                    .setLookup(
                            MockeryTestCase.class,
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
                            "mockeryOpen",
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
                    .setFilename(
                            "vendor/mockery/mockery/library/Mockery/Adapter/Phpunit/MockeryTestCase.php")
                    .addInterface("PHPUnit\\Framework\\Test")
                    .addInterface("Countable")
                    .addInterface("PHPUnit\\Framework\\SelfDescribing")
                    .addTrait("Mockery\\Adapter\\Phpunit\\MockeryPHPUnitIntegration")
                    .addExtendsClass("PHPUnit\\Framework\\TestCase")
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
