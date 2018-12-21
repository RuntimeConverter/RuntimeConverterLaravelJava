package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/ConfigurationGenerator.php

*/

public final class ConfigurationGenerator extends RuntimeClassBase {

    public ConfigurationGenerator(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ConfigurationGenerator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "phpunitVersion", typeHint = "string")
    @ConvertedParameter(index = 1, name = "bootstrapScript", typeHint = "string")
    @ConvertedParameter(index = 2, name = "testsDirectory", typeHint = "string")
    @ConvertedParameter(index = 3, name = "srcDirectory", typeHint = "string")
    public Object generateDefaultConfiguration(RuntimeEnv env, Object... args) {
        Object phpunitVersion = assignParameter(args, 0, false);
        Object bootstrapScript = assignParameter(args, 1, false);
        Object testsDirectory = assignParameter(args, 2, false);
        Object srcDirectory = assignParameter(args, 3, false);
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                ZVal.arrayFromList(
                                        "{phpunit_version}",
                                        "{bootstrap_script}",
                                        "{tests_directory}",
                                        "{src_directory}"),
                                ZVal.newArray(
                                        new ZPair(0, phpunitVersion),
                                        new ZPair(1, bootstrapScript),
                                        new ZPair(2, testsDirectory),
                                        new ZPair(3, srcDirectory)),
                                CONST_TEMPLATE)
                        .value());
    }

    public static final Object CONST_TEMPLATE =
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<phpunit xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n         xsi:noNamespaceSchemaLocation=\"https://schema.phpunit.de/{phpunit_version}/phpunit.xsd\"\n         bootstrap=\"{bootstrap_script}\"\n         forceCoversAnnotation=\"true\"\n         beStrictAboutCoversAnnotation=\"true\"\n         beStrictAboutOutputDuringTests=\"true\"\n         beStrictAboutTodoAnnotatedTests=\"true\"\n         verbose=\"true\">\n    <testsuites>\n        <testsuite name=\"default\">\n            <directory suffix=\"Test.php\">{tests_directory}</directory>\n        </testsuite>\n    </testsuites>\n\n    <filter>\n        <whitelist processUncoveredFilesFromWhitelist=\"true\">\n            <directory suffix=\".php\">{src_directory}</directory>\n        </whitelist>\n    </filter>\n</phpunit>\n";

    public static final Object CONST_class = "PHPUnit\\Util\\ConfigurationGenerator";

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
                    .setName("PHPUnit\\Util\\ConfigurationGenerator")
                    .setLookup(
                            ConfigurationGenerator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/phpunit/src/Util/ConfigurationGenerator.php")
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
