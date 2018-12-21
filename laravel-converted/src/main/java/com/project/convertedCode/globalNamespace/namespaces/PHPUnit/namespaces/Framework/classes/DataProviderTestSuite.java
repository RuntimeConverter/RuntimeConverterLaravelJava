package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestSuite;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/DataProviderTestSuite.php

*/

public class DataProviderTestSuite extends TestSuite {

    public Object dependencies = ZVal.newArray();

    public DataProviderTestSuite(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DataProviderTestSuite.class) {
            this.__construct(env, args);
        }
    }

    public DataProviderTestSuite(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dependencies", typeHint = "array")
    public Object setDependencies(RuntimeEnv env, Object... args) {
        Object dependencies = assignParameter(args, 0, false);
        Object test = null;
        this.dependencies = dependencies;
        for (ZPair zpairResult1138 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("tests").value(), env, true)) {
            test = ZVal.assign(zpairResult1138.getValue());
            env.callMethod(test, "setDependencies", DataProviderTestSuite.class, dependencies);
        }

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

    public static final Object CONST_class = "PHPUnit\\Framework\\DataProviderTestSuite";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends TestSuite.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\DataProviderTestSuite")
                    .setLookup(
                            DataProviderTestSuite.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "backupGlobals",
                            "backupStaticAttributes",
                            "beStrictAboutChangesToGlobalState",
                            "cachedNumTests",
                            "declaredClasses",
                            "dependencies",
                            "foundClasses",
                            "groups",
                            "iteratorFilter",
                            "name",
                            "numTests",
                            "runTestInSeparateProcess",
                            "testCase",
                            "tests")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/DataProviderTestSuite.php")
                    .addInterface("PHPUnit\\Framework\\Test")
                    .addInterface("Countable")
                    .addInterface("PHPUnit\\Framework\\SelfDescribing")
                    .addInterface("IteratorAggregate")
                    .addInterface("Traversable")
                    .addExtendsClass("PHPUnit\\Framework\\TestSuite")
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
