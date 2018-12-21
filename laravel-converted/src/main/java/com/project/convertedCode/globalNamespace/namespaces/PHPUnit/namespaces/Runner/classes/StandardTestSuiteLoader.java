package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.file.function_realpath;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Filesystem;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.TestSuiteLoader;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_declared_classes;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.Exception;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.FileLoader;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Runner/StandardTestSuiteLoader.php

*/

public class StandardTestSuiteLoader extends RuntimeClassBase implements TestSuiteLoader {

    public StandardTestSuiteLoader(RuntimeEnv env, Object... args) {
        super(env);
    }

    public StandardTestSuiteLoader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suiteClassName", typeHint = "string")
    @ConvertedParameter(index = 1, name = "suiteClassFile", typeHint = "string")
    public Object load(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object suiteClassName = assignParameter(args, 0, false);
        Object suiteClassFile = assignParameter(args, 1, true);
        if (null == suiteClassFile) {
            suiteClassFile = "";
        }
        Object loadedClass = null;
        Object classFile = null;
        Object filename = null;
        Object offset = null;
        Object method = null;
        Object loadedClasses = null;
        Object testCaseClass = null;
        Object _pClass = null;
        suiteClassName = function_str_replace.f.env(env).call(".php", "", suiteClassName).value();
        if (ZVal.isEmpty(suiteClassFile)) {
            suiteClassFile =
                    Filesystem.runtimeStaticObject.classNameToFilename(env, suiteClassName);
        }

        if (!function_class_exists.f.env(env).call(suiteClassName, false).getBool()) {
            loadedClasses = function_get_declared_classes.f.env(env).call().value();
            filename = FileLoader.runtimeStaticObject.checkAndLoad(env, suiteClassFile);
            loadedClasses =
                    function_array_values
                            .f
                            .env(env)
                            .call(
                                    function_array_diff
                                            .f
                                            .env(env)
                                            .call(
                                                    function_get_declared_classes
                                                            .f
                                                            .env(env)
                                                            .call()
                                                            .value(),
                                                    loadedClasses)
                                            .value())
                            .value();
        }

        if (ZVal.toBool(!function_class_exists.f.env(env).call(suiteClassName, false).getBool())
                && ZVal.toBool(!ZVal.isEmpty(loadedClasses))) {
            offset = ZVal.subtract(0, function_strlen.f.env(env).call(suiteClassName).value());
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult1231 : ZVal.getIterable(loadedClasses, env, true)) {
                loadedClass = ZVal.assign(zpairResult1231.getValue());
                _pClass = new ReflectionClass(env, loadedClass);
                if (ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        function_substr
                                                .f
                                                .env(env)
                                                .call(loadedClass, offset)
                                                .value(),
                                        "===",
                                        suiteClassName))
                        && ZVal.toBool(
                                ZVal.equalityCheck(
                                        env.callMethod(
                                                _pClass,
                                                "getFileName",
                                                StandardTestSuiteLoader.class),
                                        filename))) {
                    suiteClassName = ZVal.assign(loadedClass);
                    break;
                }
            }
        }

        if (ZVal.toBool(!function_class_exists.f.env(env).call(suiteClassName, false).getBool())
                && ZVal.toBool(!ZVal.isEmpty(loadedClasses))) {
            testCaseClass = ZVal.assign(TestCase.CONST_class);
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult1232 : ZVal.getIterable(loadedClasses, env, true)) {
                loadedClass = ZVal.assign(zpairResult1232.getValue());
                _pClass = new ReflectionClass(env, loadedClass);
                classFile = env.callMethod(_pClass, "getFileName", StandardTestSuiteLoader.class);
                if (ZVal.toBool(
                                env.callMethod(
                                        _pClass,
                                        "isSubclassOf",
                                        StandardTestSuiteLoader.class,
                                        testCaseClass))
                        && ZVal.toBool(
                                !ZVal.isTrue(
                                        env.callMethod(
                                                _pClass,
                                                "isAbstract",
                                                StandardTestSuiteLoader.class)))) {
                    suiteClassName = ZVal.assign(loadedClass);
                    testCaseClass = ZVal.assign(loadedClass);
                    if (ZVal.equalityCheck(
                            classFile, function_realpath.f.env(env).call(suiteClassFile).value())) {
                        break;
                    }
                }

                if (ZVal.isTrue(
                        env.callMethod(
                                _pClass, "hasMethod", StandardTestSuiteLoader.class, "suite"))) {
                    method =
                            env.callMethod(
                                    _pClass, "getMethod", StandardTestSuiteLoader.class, "suite");
                    if (ZVal.toBool(
                                    ZVal.toBool(
                                                    !ZVal.isTrue(
                                                            env.callMethod(
                                                                    method,
                                                                    "isAbstract",
                                                                    StandardTestSuiteLoader.class)))
                                            && ZVal.toBool(
                                                    env.callMethod(
                                                            method,
                                                            "isPublic",
                                                            StandardTestSuiteLoader.class)))
                            && ZVal.toBool(
                                    env.callMethod(
                                            method, "isStatic", StandardTestSuiteLoader.class))) {
                        suiteClassName = ZVal.assign(loadedClass);
                        if (ZVal.equalityCheck(
                                classFile,
                                function_realpath.f.env(env).call(suiteClassFile).value())) {
                            break;
                        }
                    }
                }
            }
        }

        if (function_class_exists.f.env(env).call(suiteClassName, false).getBool()) {
            _pClass = new ReflectionClass(env, suiteClassName);
            if (ZVal.equalityCheck(
                    env.callMethod(_pClass, "getFileName", StandardTestSuiteLoader.class),
                    function_realpath.f.env(env).call(suiteClassFile).value())) {
                return ZVal.assign(_pClass);
            }
        }

        throw ZVal.getException(
                env,
                new Exception(
                        env,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "Class '%s' could not be found in '%s'.",
                                        suiteClassName, suiteClassFile)
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "aClass", typeHint = "ReflectionClass")
    public Object reload(RuntimeEnv env, Object... args) {
        Object aClass = assignParameter(args, 0, false);
        return ZVal.assign(aClass);
    }

    public static final Object CONST_class = "PHPUnit\\Runner\\StandardTestSuiteLoader";

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
                    .setName("PHPUnit\\Runner\\StandardTestSuiteLoader")
                    .setLookup(
                            StandardTestSuiteLoader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/phpunit/src/Runner/StandardTestSuiteLoader.php")
                    .addInterface("PHPUnit\\Runner\\TestSuiteLoader")
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
