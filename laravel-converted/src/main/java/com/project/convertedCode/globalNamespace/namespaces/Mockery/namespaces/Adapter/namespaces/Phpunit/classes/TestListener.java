package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Adapter.namespaces.Phpunit.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.ExpectationFailedException;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.BaseTestRunner;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.classes.Mockery;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Blacklist;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Adapter/Phpunit/TestListener.php

*/

public class TestListener extends RuntimeClassBase {

    public TestListener(RuntimeEnv env, Object... args) {
        super(env);
    }

    public TestListener(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "time")
    public Object endTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object time = assignParameter(args, 1, false);
        Object result = null;
        Object e = null;
        Object _underscoreIdentifier = null;
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
            return null;
        }

        if (ZVal.strictNotEqualityCheck(
                env.callMethod(test, "getStatus", TestListener.class),
                "!==",
                BaseTestRunner.CONST_STATUS_PASSED)) {
            return null;
        }

        try {
            Mockery.runtimeStaticObject.self(env);
        } catch (ConvertedException convertedException80) {
            if (convertedException80.instanceOf(LogicException.class, "LogicException")) {
                _underscoreIdentifier = convertedException80.getObject();
                return null;
            } else {
                throw convertedException80;
            }
        }

        e =
                new ExpectationFailedException(
                        env,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "Mockery's expectations have not been verified. Make sure that \\Mockery::close() is called at the end of the test. Consider using %s\\MockeryPHPUnitIntegration or extending %s\\MockeryTestCase.",
                                        "Mockery\\Adapter\\Phpunit", "Mockery\\Adapter\\Phpunit")
                                .value());
        result = env.callMethod(test, "getTestResultObject", TestListener.class);
        env.callMethod(result, "addFailure", TestListener.class, test, e, time);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    public Object startTestSuite(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, false);
        env.getRequestStaticPropertiesReference(
                        Blacklist.RequestStaticProperties.class, "blacklistedClassNames")
                .arrayAccess(env, Mockery.CONST_class)
                .set(1);
        StaticMethodUtils.getStaticBaseClass(ZVal.resolveClassAlias(env, "parent"), env)
                .callUnknownStaticMethod(
                        env, "startTestSuite", new RuntimeArgsWithReferences(), suite);
        return null;
    }

    public static final Object CONST_class = "Mockery\\Adapter\\Phpunit\\TestListener";

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
                    .setName("Mockery\\Adapter\\Phpunit\\TestListener")
                    .setLookup(
                            TestListener.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/mockery/mockery/library/Mockery/Adapter/Phpunit/TestListener.php")
                    .addExtendsClass("PHPUnit\\Framework\\BaseTestListener")
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
