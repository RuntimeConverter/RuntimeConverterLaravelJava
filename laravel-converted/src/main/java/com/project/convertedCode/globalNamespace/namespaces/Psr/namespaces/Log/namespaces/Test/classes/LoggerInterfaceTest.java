package com.project.convertedCode.globalNamespace.namespaces.Psr.namespaces.Log.namespaces.Test.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Psr.namespaces.Log.classes.LogLevel;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.project.convertedCode.globalNamespace.namespaces.Psr.namespaces.Log.namespaces.Test.classes.DummyTest;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psr/log/Psr/Log/Test/LoggerInterfaceTest.php

*/

public abstract class LoggerInterfaceTest extends RuntimeClassBase {

    public LoggerInterfaceTest(RuntimeEnv env, Object... args) {
        super(env);
    }

    public LoggerInterfaceTest(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object testImplements(RuntimeEnv env, Object... args) {
        env.callMethod(
                this,
                "assertInstanceOf",
                LoggerInterfaceTest.class,
                "Psr\\Log\\LoggerInterface",
                env.callMethod(this, "getLogger", LoggerInterfaceTest.class));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    @ConvertedParameter(index = 1, name = "message")
    public Object testLogsAtAllLevels(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, false);
        ReferenceContainer message = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object logger = null;
        Object expected = null;
        logger = env.callMethod(this, "getLogger", LoggerInterfaceTest.class);
        env.callMethod(
                logger,
                new RuntimeArgsWithReferences().add(0, message),
                toStringR(level, env),
                LoggerInterfaceTest.class,
                message.getObject(),
                ZVal.newArray(new ZPair("user", "Bob")));
        env.callMethod(
                logger,
                "log",
                LoggerInterfaceTest.class,
                level,
                message.getObject(),
                ZVal.newArray(new ZPair("user", "Bob")));
        expected =
                ZVal.newArray(
                        new ZPair(
                                0,
                                toStringR(level, env)
                                        + " message of level "
                                        + toStringR(level, env)
                                        + " with context: Bob"),
                        new ZPair(
                                1,
                                toStringR(level, env)
                                        + " message of level "
                                        + toStringR(level, env)
                                        + " with context: Bob"));
        env.callMethod(
                this,
                "assertEquals",
                LoggerInterfaceTest.class,
                expected,
                env.callMethod(this, "getLogs", LoggerInterfaceTest.class));
        return null;
    }

    @ConvertedMethod
    public Object provideLevelsAndMessages(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                LogLevel.CONST_EMERGENCY,
                                ZVal.newArray(
                                        new ZPair(0, LogLevel.CONST_EMERGENCY),
                                        new ZPair(
                                                1,
                                                "message of level emergency with context: {user}"))),
                        new ZPair(
                                LogLevel.CONST_ALERT,
                                ZVal.newArray(
                                        new ZPair(0, LogLevel.CONST_ALERT),
                                        new ZPair(
                                                1, "message of level alert with context: {user}"))),
                        new ZPair(
                                LogLevel.CONST_CRITICAL,
                                ZVal.newArray(
                                        new ZPair(0, LogLevel.CONST_CRITICAL),
                                        new ZPair(
                                                1,
                                                "message of level critical with context: {user}"))),
                        new ZPair(
                                LogLevel.CONST_ERROR,
                                ZVal.newArray(
                                        new ZPair(0, LogLevel.CONST_ERROR),
                                        new ZPair(
                                                1, "message of level error with context: {user}"))),
                        new ZPair(
                                LogLevel.CONST_WARNING,
                                ZVal.newArray(
                                        new ZPair(0, LogLevel.CONST_WARNING),
                                        new ZPair(
                                                1,
                                                "message of level warning with context: {user}"))),
                        new ZPair(
                                LogLevel.CONST_NOTICE,
                                ZVal.newArray(
                                        new ZPair(0, LogLevel.CONST_NOTICE),
                                        new ZPair(
                                                1,
                                                "message of level notice with context: {user}"))),
                        new ZPair(
                                LogLevel.CONST_INFO,
                                ZVal.newArray(
                                        new ZPair(0, LogLevel.CONST_INFO),
                                        new ZPair(
                                                1, "message of level info with context: {user}"))),
                        new ZPair(
                                LogLevel.CONST_DEBUG,
                                ZVal.newArray(
                                        new ZPair(0, LogLevel.CONST_DEBUG),
                                        new ZPair(
                                                1,
                                                "message of level debug with context: {user}")))));
    }

    @ConvertedMethod
    public Object testThrowsOnInvalidLevel(RuntimeEnv env, Object... args) {
        Object logger = null;
        logger = env.callMethod(this, "getLogger", LoggerInterfaceTest.class);
        env.callMethod(logger, "log", LoggerInterfaceTest.class, "invalid level", "Foo");
        return null;
    }

    @ConvertedMethod
    public Object testContextReplacement(RuntimeEnv env, Object... args) {
        Object logger = null;
        Object expected = null;
        logger = env.callMethod(this, "getLogger", LoggerInterfaceTest.class);
        env.callMethod(
                logger,
                "info",
                LoggerInterfaceTest.class,
                "{Message {nothing} {user} {foo.bar} a}",
                ZVal.newArray(new ZPair("user", "Bob"), new ZPair("foo.bar", "Bar")));
        expected = ZVal.arrayFromList("info {Message {nothing} Bob Bar a}");
        env.callMethod(
                this,
                "assertEquals",
                LoggerInterfaceTest.class,
                expected,
                env.callMethod(this, "getLogs", LoggerInterfaceTest.class));
        return null;
    }

    @ConvertedMethod
    public Object testObjectCastToString(RuntimeEnv env, Object... args) {
        Object dummy = null;
        Object expected = null;
        if (function_method_exists.f.env(env).call(this, "createPartialMock").getBool()) {
            dummy =
                    env.callMethod(
                            this,
                            "createPartialMock",
                            LoggerInterfaceTest.class,
                            "Psr\\Log\\Test\\DummyTest",
                            ZVal.arrayFromList("__toString"));

        } else {
            dummy =
                    env.callMethod(
                            this,
                            "getMock",
                            LoggerInterfaceTest.class,
                            "Psr\\Log\\Test\\DummyTest",
                            ZVal.arrayFromList("__toString"));
        }

        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                dummy,
                                "expects",
                                LoggerInterfaceTest.class,
                                env.callMethod(this, "once", LoggerInterfaceTest.class)),
                        "method",
                        LoggerInterfaceTest.class,
                        "__toString"),
                "will",
                LoggerInterfaceTest.class,
                env.callMethod(this, "returnValue", LoggerInterfaceTest.class, "DUMMY"));
        env.callMethod(
                env.callMethod(this, "getLogger", LoggerInterfaceTest.class),
                "warning",
                LoggerInterfaceTest.class,
                dummy);
        expected = ZVal.arrayFromList("warning DUMMY");
        env.callMethod(
                this,
                "assertEquals",
                LoggerInterfaceTest.class,
                expected,
                env.callMethod(this, "getLogs", LoggerInterfaceTest.class));
        return null;
    }

    @ConvertedMethod
    public Object testContextCanContainAnything(RuntimeEnv env, Object... args) {
        Object expected = null;
        Object context = null;
        context =
                ZVal.newArray(
                        new ZPair("bool", true),
                        new ZPair("null", ZVal.getNull()),
                        new ZPair("string", "Foo"),
                        new ZPair("int", 0),
                        new ZPair("float", 0.5),
                        new ZPair(
                                "nested",
                                ZVal.newArray(new ZPair("with object", new DummyTest(env)))),
                        new ZPair("object", new DateTime(env)),
                        new ZPair(
                                "resource",
                                function_fopen.f.env(env).call("php://memory", "r").value()));
        env.callMethod(
                env.callMethod(this, "getLogger", LoggerInterfaceTest.class),
                "warning",
                LoggerInterfaceTest.class,
                "Crazy context data",
                context);
        expected = ZVal.arrayFromList("warning Crazy context data");
        env.callMethod(
                this,
                "assertEquals",
                LoggerInterfaceTest.class,
                expected,
                env.callMethod(this, "getLogs", LoggerInterfaceTest.class));
        return null;
    }

    @ConvertedMethod
    public Object testContextExceptionKeyCanBeExceptionOrOtherValues(
            RuntimeEnv env, Object... args) {
        Object logger = null;
        Object expected = null;
        logger = env.callMethod(this, "getLogger", LoggerInterfaceTest.class);
        env.callMethod(
                logger,
                "warning",
                LoggerInterfaceTest.class,
                "Random message",
                ZVal.newArray(new ZPair("exception", "oops")));
        env.callMethod(
                logger,
                "critical",
                LoggerInterfaceTest.class,
                "Uncaught Exception!",
                ZVal.newArray(new ZPair("exception", new LogicException(env, "Fail"))));
        expected = ZVal.arrayFromList("warning Random message", "critical Uncaught Exception!");
        env.callMethod(
                this,
                "assertEquals",
                LoggerInterfaceTest.class,
                expected,
                env.callMethod(this, "getLogs", LoggerInterfaceTest.class));
        return null;
    }

    public static final Object CONST_class = "Psr\\Log\\Test\\LoggerInterfaceTest";

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
                    .setName("Psr\\Log\\Test\\LoggerInterfaceTest")
                    .setLookup(
                            LoggerInterfaceTest.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/psr/log/Psr/Log/Test/LoggerInterfaceTest.php")
                    .addExtendsClass("PHPUnit_Framework_TestCase")
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
