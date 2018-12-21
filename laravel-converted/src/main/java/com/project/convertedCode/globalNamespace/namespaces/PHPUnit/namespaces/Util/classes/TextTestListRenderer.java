package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes;

import com.runtimeconverter.runtime.nativeClasses.spl.iterators.RecursiveIteratorIterator;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.PhptTestCase;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/TextTestListRenderer.php

*/

public final class TextTestListRenderer extends RuntimeClassBase {

    public TextTestListRenderer(RuntimeEnv env, Object... args) {
        super(env);
    }

    public TextTestListRenderer(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    public Object render(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object suite = assignParameter(args, 0, false);
        Object test = null;
        Object name = null;
        Object buffer = null;
        buffer = "Available test(s):" + toStringR("\n", env);
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1330 :
                ZVal.getIterable(
                        new RecursiveIteratorIterator(
                                env,
                                env.callMethod(suite, "getIterator", TextTestListRenderer.class)),
                        env,
                        true)) {
            test = ZVal.assign(zpairResult1330.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
                name =
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "%s::%s",
                                        function_get_class.f.env(env).call(test).value(),
                                        function_str_replace
                                                .f
                                                .env(env)
                                                .call(
                                                        " with data set ",
                                                        "",
                                                        env.callMethod(
                                                                test,
                                                                "getName",
                                                                TextTestListRenderer.class))
                                                .value())
                                .value();

            } else if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            test, PhptTestCase.class, "PHPUnit\\Runner\\PhptTestCase"))) {
                name = env.callMethod(test, "getName", TextTestListRenderer.class);

            } else {
                continue;
            }

            buffer =
                    toStringR(buffer, env)
                            + toStringR(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(" - %s" + toStringR("\n", env), name)
                                            .value(),
                                    env);
        }

        return ZVal.assign(buffer);
    }

    public static final Object CONST_class = "PHPUnit\\Util\\TextTestListRenderer";

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
                    .setName("PHPUnit\\Util\\TextTestListRenderer")
                    .setLookup(
                            TextTestListRenderer.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/phpunit/src/Util/TextTestListRenderer.php")
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
