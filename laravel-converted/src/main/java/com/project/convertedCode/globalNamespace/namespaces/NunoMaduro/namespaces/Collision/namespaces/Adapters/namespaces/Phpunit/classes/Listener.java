package com.project.convertedCode.globalNamespace.namespaces.NunoMaduro.namespaces.Collision.namespaces.Adapters.namespaces.Phpunit.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionObject;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.ConsoleOutput;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.ArgvInput;
import com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Exception.classes.Inspector;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.classes.Application;
import com.project.convertedCode.globalNamespace.namespaces.NunoMaduro.namespaces.Collision.classes.Writer;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nunomaduro/collision/src/Adapters/Phpunit/Listener.php

*/

public class Listener extends RuntimeClassBase
        implements com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .NunoMaduro
                .namespaces
                .Collision
                .namespaces
                .Contracts
                .namespaces
                .Adapters
                .namespaces
                .Phpunit
                .classes
                .Listener {

    public Object writer = null;

    public Object exceptionFound = null;

    public Listener(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Listener.class) {
            this.__construct(env, args);
        }
    }

    public Listener(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "writer",
        typeHint = "NunoMaduro\\Collision\\Contracts\\Writer",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object writer = assignParameter(args, 0, true);
        if (null == writer) {
            writer = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.writer =
                ZVal.isTrue(ternaryExpressionTemp = writer)
                        ? ternaryExpressionTemp
                        : this.buildWriter(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "t", typeHint = "Throwable")
    public Object render(RuntimeEnv env, Object... args) {
        Object t = assignParameter(args, 0, false);
        Object inspector = null;
        inspector = new Inspector(env, t);
        env.callMethod(this.writer, "write", Listener.class, inspector);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "t", typeHint = "Throwable")
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object addError(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object t = assignParameter(args, 1, false);
        Object time = assignParameter(args, 2, false);
        if (ZVal.strictEqualityCheck(this.exceptionFound, "===", ZVal.getNull())) {
            this.exceptionFound = t;
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "t", typeHint = "PHPUnit\\Framework\\Warning")
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object addWarning(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object t = assignParameter(args, 1, false);
        Object time = assignParameter(args, 2, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(
        index = 1,
        name = "t",
        typeHint = "PHPUnit\\Framework\\AssertionFailedError"
    )
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object addFailure(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object t = assignParameter(args, 1, false);
        Object time = assignParameter(args, 2, false);
        env.callMethod(
                env.callMethod(
                        this.writer,
                        "ignoreFilesIn",
                        Listener.class,
                        ZVal.arrayFromList("/vendor/")),
                "showTrace",
                Listener.class,
                false);
        if (ZVal.strictEqualityCheck(this.exceptionFound, "===", ZVal.getNull())) {
            this.exceptionFound = t;
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "t", typeHint = "Throwable")
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object addIncompleteTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object t = assignParameter(args, 1, false);
        Object time = assignParameter(args, 2, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "t", typeHint = "Throwable")
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object addRiskyTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object t = assignParameter(args, 1, false);
        Object time = assignParameter(args, 2, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "t", typeHint = "Throwable")
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object addSkippedTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object t = assignParameter(args, 1, false);
        Object time = assignParameter(args, 2, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    public Object startTestSuite(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    public Object endTestSuite(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    public Object startTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "time", typeHint = "float")
    public Object endTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object time = assignParameter(args, 1, false);
        return null;
    }

    @ConvertedMethod
    public Object __destruct(RuntimeEnv env, Object... args) {
        if (ZVal.strictNotEqualityCheck(this.exceptionFound, "!==", ZVal.getNull())) {
            this.render(env, this.exceptionFound);
        }

        return null;
    }

    @ConvertedMethod
    protected Object buildWriter(RuntimeEnv env, Object... args) {
        Object output = null;
        Object application = null;
        Object method = null;
        Object reflector = null;
        Object writer = null;
        writer = new Writer(env);
        application = new Application(env);
        reflector = new ReflectionObject(env, application);
        method = env.callMethod(reflector, "getMethod", Listener.class, "configureIO");
        env.callMethod(method, "setAccessible", Listener.class, true);
        env.callMethod(
                method,
                "invoke",
                Listener.class,
                application,
                new ArgvInput(env),
                output = new ConsoleOutput(env));
        return ZVal.assign(env.callMethod(writer, "setOutput", Listener.class, output));
    }

    public static final Object CONST_class = "NunoMaduro\\Collision\\Adapters\\Phpunit\\Listener";

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
                    .setName("NunoMaduro\\Collision\\Adapters\\Phpunit\\Listener")
                    .setLookup(
                            Listener.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("exceptionFound", "writer")
                    .setFilename("vendor/nunomaduro/collision/src/Adapters/Phpunit/Listener.php")
                    .addInterface("NunoMaduro\\Collision\\Contracts\\Adapters\\Phpunit\\Listener")
                    .addInterface("PHPUnit\\Framework\\TestListener")
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
