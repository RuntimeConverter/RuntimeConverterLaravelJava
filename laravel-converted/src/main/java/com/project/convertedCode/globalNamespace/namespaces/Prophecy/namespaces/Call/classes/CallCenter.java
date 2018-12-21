package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Call.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prophecy.classes.MethodProphecyException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Util.classes.StringUtil;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.array.function_usort;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Call.classes.Call;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Call.classes.UnexpectedCallException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Call/CallCenter.php

*/

public class CallCenter extends RuntimeClassBase {

    public Object util = null;

    public Object recordedCalls = ZVal.newArray();

    public CallCenter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CallCenter.class) {
            this.__construct(env, args);
        }
    }

    public CallCenter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "util",
        typeHint = "Prophecy\\Util\\StringUtil",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object util = assignParameter(args, 0, true);
        if (null == util) {
            util = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.util =
                ZVal.isTrue(ternaryExpressionTemp = util)
                        ? ternaryExpressionTemp
                        : new StringUtil(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "prophecy",
        typeHint = "Prophecy\\Prophecy\\ObjectProphecy"
    )
    @ConvertedParameter(index = 1, name = "methodName")
    @ConvertedParameter(index = 2, name = "arguments", typeHint = "array")
    public Object makeCall(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/phpspec/prophecy/src/Prophecy/Call")
                        .setFile("/vendor/phpspec/prophecy/src/Prophecy/Call/CallCenter.php");
        Object prophecy = assignParameter(args, 0, false);
        Object methodName = assignParameter(args, 1, false);
        Object arguments = assignParameter(args, 2, false);
        Object exception = null;
        Object returnValue = null;
        ReferenceContainer backtrace = new BasicReferenceContainer(null);
        Object e = null;
        Object line = null;
        Object promise = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        Object score = null;
        Object file = null;
        Object methodProphecy = null;
        if (ZVal.isGreaterThanOrEqualTo(70211, ">=", 50400)) {
            backtrace.setObject(NamespaceGlobal.debug_backtrace.env(env).call(2, 3).value());

        } else if (function_defined.f.env(env).call("DEBUG_BACKTRACE_IGNORE_ARGS").getBool()) {
            backtrace.setObject(NamespaceGlobal.debug_backtrace.env(env).call(2).value());

        } else {
            backtrace.setObject(NamespaceGlobal.debug_backtrace.env(env).call().value());
        }

        file = ZVal.assign(line = ZVal.getNull());
        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, backtrace, env, 2))
                && ZVal.toBool(arrayActionR(ArrayAction.ISSET, backtrace, env, 2, "file"))) {
            file = ZVal.assign(backtrace.arrayGet(env, 2, "file"));
            line = ZVal.assign(backtrace.arrayGet(env, 2, "line"));
        }

        if (ZVal.toBool(ZVal.strictEqualityCheck("__destruct", "===", methodName))
                || ZVal.toBool(
                        ZVal.equalityCheck(
                                0,
                                function_count
                                        .f
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        prophecy,
                                                        "getMethodProphecies",
                                                        CallCenter.class))
                                        .value()))) {
            new ReferenceClassProperty(this, "recordedCalls", env)
                    .arrayAppend(env)
                    .set(
                            new Call(
                                    env,
                                    methodName,
                                    arguments,
                                    ZVal.getNull(),
                                    ZVal.getNull(),
                                    file,
                                    line));
            return ZVal.assign(ZVal.getNull());
        }

        matches.setObject(ZVal.newArray());
        for (ZPair zpairResult945 :
                ZVal.getIterable(
                        env.callMethod(
                                prophecy, "getMethodProphecies", CallCenter.class, methodName),
                        env,
                        true)) {
            methodProphecy = ZVal.assign(zpairResult945.getValue());
            if (ZVal.isLessThan(
                    0,
                    '<',
                    score =
                            env.callMethod(
                                    env.callMethod(
                                            methodProphecy,
                                            "getArgumentsWildcard",
                                            CallCenter.class),
                                    "scoreArguments",
                                    CallCenter.class,
                                    arguments))) {
                matches.arrayAppend(env)
                        .set(ZVal.newArray(new ZPair(0, score), new ZPair(1, methodProphecy)));
            }
        }

        if (!function_count.f.env(env).call(matches.getObject()).getBool()) {
            throw ZVal.getException(
                    env, this.createUnexpectedCallException(env, prophecy, methodName, arguments));
        }

        function_usort
                .f
                .env(env)
                .call(
                        matches.getObject(),
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Prophecy\\Call",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "match1")
                            @ConvertedParameter(index = 1, name = "match2")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                ReferenceContainer match1 =
                                        new BasicReferenceContainer(
                                                assignParameter(args, 0, false));
                                ReferenceContainer match2 =
                                        new BasicReferenceContainer(
                                                assignParameter(args, 1, false));
                                return ZVal.assign(
                                        ZVal.subtract(
                                                match2.arrayGet(env, 0), match1.arrayGet(env, 0)));
                            }
                        })
                .value();
        methodProphecy = ZVal.assign(matches.arrayGet(env, 0, 1));
        returnValue = ZVal.getNull();
        exception = ZVal.getNull();
        if (ZVal.isTrue(promise = env.callMethod(methodProphecy, "getPromise", CallCenter.class))) {
            try {
                returnValue =
                        env.callMethod(
                                promise,
                                "execute",
                                CallCenter.class,
                                arguments,
                                prophecy,
                                methodProphecy);
            } catch (ConvertedException convertedException116) {
                if (convertedException116.instanceOf(PHPException.class, "Exception")) {
                    e = convertedException116.getObject();
                    exception = ZVal.assign(e);
                } else {
                    throw convertedException116;
                }
            }
        }

        if (ZVal.toBool(env.callMethod(methodProphecy, "hasReturnVoid", CallCenter.class))
                && ZVal.toBool(ZVal.strictNotEqualityCheck(returnValue, "!==", ZVal.getNull()))) {
            throw ZVal.getException(
                    env,
                    new MethodProphecyException(
                            env,
                            "The method \""
                                    + toStringR(methodName, env)
                                    + "\" has a void return type, but the promise returned a value",
                            methodProphecy));
        }

        new ReferenceClassProperty(this, "recordedCalls", env)
                .arrayAppend(env)
                .set(new Call(env, methodName, arguments, returnValue, exception, file, line));
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", exception)) {
            throw ZVal.getException(env, exception);
        }

        return ZVal.assign(returnValue);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methodName")
    @ConvertedParameter(
        index = 1,
        name = "wildcard",
        typeHint = "Prophecy\\Argument\\ArgumentsWildcard"
    )
    public Object findCalls(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/phpspec/prophecy/src/Prophecy/Call")
                        .setFile("/vendor/phpspec/prophecy/src/Prophecy/Call/CallCenter.php");
        Object methodName = assignParameter(args, 0, false);
        Object wildcard = assignParameter(args, 1, false);
        return ZVal.assign(
                function_array_values
                        .f
                        .env(env)
                        .call(
                                function_array_filter
                                        .f
                                        .env(env)
                                        .call(
                                                this.recordedCalls,
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Prophecy\\Call",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(
                                                        index = 0,
                                                        name = "call",
                                                        typeHint = "Prophecy\\Call\\Call"
                                                    )
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object call =
                                                                assignParameter(args, 0, false);
                                                        Object methodName = null;
                                                        Object wildcard = null;
                                                        methodName =
                                                                this.contextReferences
                                                                        .getCapturedValue(
                                                                                "methodName");
                                                        wildcard =
                                                                this.contextReferences
                                                                        .getCapturedValue(
                                                                                "wildcard");
                                                        return ZVal.assign(
                                                                ZVal.toBool(
                                                                                ZVal
                                                                                        .strictEqualityCheck(
                                                                                                methodName,
                                                                                                "===",
                                                                                                env
                                                                                                        .callMethod(
                                                                                                                call,
                                                                                                                "getMethodName",
                                                                                                                CallCenter
                                                                                                                        .class)))
                                                                        && ZVal.toBool(
                                                                                ZVal.isLessThan(
                                                                                        0,
                                                                                        '<',
                                                                                        env
                                                                                                .callMethod(
                                                                                                        wildcard,
                                                                                                        "scoreArguments",
                                                                                                        CallCenter
                                                                                                                .class,
                                                                                                        env
                                                                                                                .callMethod(
                                                                                                                        call,
                                                                                                                        "getArguments",
                                                                                                                        CallCenter
                                                                                                                                .class)))));
                                                    }
                                                }.use("methodName", methodName)
                                                        .use("wildcard", wildcard))
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "prophecy",
        typeHint = "Prophecy\\Prophecy\\ObjectProphecy"
    )
    @ConvertedParameter(index = 1, name = "methodName")
    @ConvertedParameter(index = 2, name = "arguments", typeHint = "array")
    private Object createUnexpectedCallException(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/phpspec/prophecy/src/Prophecy/Call")
                        .setFile("/vendor/phpspec/prophecy/src/Prophecy/Call/CallCenter.php");
        Object prophecy = assignParameter(args, 0, false);
        Object methodName = assignParameter(args, 1, false);
        Object arguments = assignParameter(args, 2, false);
        Object classname = null;
        Object expected = null;
        Object argstring = null;
        classname =
                function_get_class
                        .f
                        .env(env)
                        .call(env.callMethod(prophecy, "reveal", CallCenter.class))
                        .value();
        argstring =
                NamespaceGlobal.implode
                        .env(env)
                        .call(
                                ", ",
                                function_array_map
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.newArray(
                                                        new ZPair(0, this.util),
                                                        new ZPair(1, "stringify")),
                                                arguments)
                                        .value())
                        .value();
        expected =
                NamespaceGlobal.implode
                        .env(env)
                        .call(
                                "\n",
                                function_array_map
                                        .f
                                        .env(env)
                                        .call(
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Prophecy\\Call",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(
                                                        index = 0,
                                                        name = "methodProphecy",
                                                        typeHint =
                                                                "Prophecy\\Prophecy\\MethodProphecy"
                                                    )
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object methodProphecy =
                                                                assignParameter(args, 0, false);
                                                        return ZVal.assign(
                                                                function_sprintf
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                "  - %s(%s)",
                                                                                env.callMethod(
                                                                                        methodProphecy,
                                                                                        "getMethodName",
                                                                                        CallCenter
                                                                                                .class),
                                                                                env.callMethod(
                                                                                        methodProphecy,
                                                                                        "getArgumentsWildcard",
                                                                                        CallCenter
                                                                                                .class))
                                                                        .value());
                                                    }
                                                },
                                                function_call_user_func_array
                                                        .f
                                                        .env(env)
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithInfo(args, this))
                                                        .call(
                                                                "array_merge",
                                                                env.callMethod(
                                                                        prophecy,
                                                                        "getMethodProphecies",
                                                                        CallCenter.class))
                                                        .value())
                                        .value())
                        .value();
        return ZVal.assign(
                new UnexpectedCallException(
                        env,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "Method call:\n"
                                                + "  - %s(%s)\n"
                                                + "on %s was not expected, expected calls were:\n%s",
                                        methodName, argstring, classname, expected)
                                .value(),
                        prophecy,
                        methodName,
                        arguments));
    }

    public static final Object CONST_class = "Prophecy\\Call\\CallCenter";

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
                    .setName("Prophecy\\Call\\CallCenter")
                    .setLookup(
                            CallCenter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("recordedCalls", "util")
                    .setFilename("vendor/phpspec/prophecy/src/Prophecy/Call/CallCenter.php")
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
