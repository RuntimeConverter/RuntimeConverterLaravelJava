package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes;

import com.runtimeconverter.runtime.nativeClasses.exceptions.ReflectionException;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.FileIterator.classes.Facade;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.StandardTestSuiteLoader;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestSuite;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_file;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Runner/BaseTestRunner.php

*/

public abstract class BaseTestRunner extends RuntimeClassBase {

    public BaseTestRunner(RuntimeEnv env, Object... args) {
        super(env);
    }

    public BaseTestRunner(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getLoader(RuntimeEnv env, Object... args) {
        return ZVal.assign(new StandardTestSuiteLoader(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suiteClassName", typeHint = "string")
    @ConvertedParameter(index = 1, name = "suiteClassFile", typeHint = "string")
    @ConvertedParameter(index = 2, name = "suffixes")
    public Object getTest(RuntimeEnv env, Object... args) {
        Object suiteClassName = assignParameter(args, 0, false);
        Object suiteClassFile = assignParameter(args, 1, true);
        if (null == suiteClassFile) {
            suiteClassFile = "";
        }
        Object suffixes = assignParameter(args, 2, true);
        if (null == suffixes) {
            suffixes = "";
        }
        Object suite = null;
        Object test = null;
        Object e = null;
        Object facade = null;
        Object files = null;
        Object testClass = null;
        Object suiteMethod = null;
        if (ZVal.toBool(
                        ZVal.toBool(function_is_dir.f.env(env).call(suiteClassName).value())
                                && ZVal.toBool(
                                        !function_is_file
                                                .f
                                                .env(env)
                                                .call(toStringR(suiteClassName, env) + ".php")
                                                .getBool()))
                && ZVal.toBool(ZVal.isEmpty(suiteClassFile))) {
            facade = new Facade(env);
            files =
                    env.callMethod(
                            facade,
                            "getFilesAsArray",
                            BaseTestRunner.class,
                            suiteClassName,
                            suffixes);
            suite = new TestSuite(env, suiteClassName);
            env.callMethod(suite, "addTestFiles", BaseTestRunner.class, files);
            return ZVal.assign(suite);
        }

        try {
            testClass = this.loadSuiteClass(env, suiteClassName, suiteClassFile);
        } catch (ConvertedException convertedException151) {
            if (convertedException151.instanceOf(
                    Exception.class, "PHPUnit\\Framework\\Exception")) {
                e = convertedException151.getObject();
                env.callMethod(
                        this,
                        "runFailed",
                        BaseTestRunner.class,
                        env.callMethod(e, "getMessage", BaseTestRunner.class));
                return ZVal.assign(ZVal.getNull());
            } else {
                throw convertedException151;
            }
        }

        try {
            suiteMethod =
                    env.callMethod(
                            testClass, "getMethod", BaseTestRunner.class, CONST_SUITE_METHODNAME);
            if (!ZVal.isTrue(env.callMethod(suiteMethod, "isStatic", BaseTestRunner.class))) {
                env.callMethod(
                        this, "runFailed", BaseTestRunner.class, "suite() method must be static.");
                return ZVal.assign(ZVal.getNull());
            }

            try {
                test =
                        env.callMethod(
                                suiteMethod,
                                "invoke",
                                BaseTestRunner.class,
                                ZVal.getNull(),
                                env.callMethod(testClass, "getName", BaseTestRunner.class));
            } catch (ConvertedException convertedException152) {
                if (convertedException152.instanceOf(
                        ReflectionException.class, "ReflectionException")) {
                    e = convertedException152.getObject();
                    env.callMethod(
                            this,
                            "runFailed",
                            BaseTestRunner.class,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Failed to invoke suite() method.\n%s",
                                            env.callMethod(e, "getMessage", BaseTestRunner.class))
                                    .value());
                    return ZVal.assign(ZVal.getNull());
                } else {
                    throw convertedException152;
                }
            }

        } catch (ConvertedException convertedException153) {
            if (convertedException153.instanceOf(
                    ReflectionException.class, "ReflectionException")) {
                e = convertedException153.getObject();
                try {
                    test = new TestSuite(env, testClass);
                } catch (ConvertedException convertedException154) {
                    if (convertedException154.instanceOf(
                            Exception.class, "PHPUnit\\Framework\\Exception")) {
                        e = convertedException154.getObject();
                        test = new TestSuite(env);
                        env.callMethod(test, "setName", BaseTestRunner.class, suiteClassName);
                    } else {
                        throw convertedException154;
                    }
                }

            } else {
                throw convertedException153;
            }
        }

        this.clearStatus(env);
        return ZVal.assign(test);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suiteClassName", typeHint = "string")
    @ConvertedParameter(index = 1, name = "suiteClassFile", typeHint = "string")
    protected Object loadSuiteClass(RuntimeEnv env, Object... args) {
        Object suiteClassName = assignParameter(args, 0, false);
        Object suiteClassFile = assignParameter(args, 1, true);
        if (null == suiteClassFile) {
            suiteClassFile = "";
        }
        Object loader = null;
        loader = this.getLoader(env);
        return ZVal.assign(
                env.callMethod(
                        loader, "load", BaseTestRunner.class, suiteClassName, suiteClassFile));
    }

    @ConvertedMethod
    protected Object clearStatus(RuntimeEnv env, Object... args) {
        return null;
    }

    public static final Object CONST_STATUS_UNKNOWN = -1;

    public static final Object CONST_STATUS_PASSED = 0;

    public static final Object CONST_STATUS_SKIPPED = 1;

    public static final Object CONST_STATUS_INCOMPLETE = 2;

    public static final Object CONST_STATUS_FAILURE = 3;

    public static final Object CONST_STATUS_ERROR = 4;

    public static final Object CONST_STATUS_RISKY = 5;

    public static final Object CONST_STATUS_WARNING = 6;

    public static final Object CONST_SUITE_METHODNAME = "suite";

    public static final Object CONST_class = "PHPUnit\\Runner\\BaseTestRunner";

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
                    .setName("PHPUnit\\Runner\\BaseTestRunner")
                    .setLookup(
                            BaseTestRunner.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/phpunit/src/Runner/BaseTestRunner.php")
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
