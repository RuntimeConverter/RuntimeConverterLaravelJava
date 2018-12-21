package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Timer.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.math.function_round;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_memory_get_peak_usage;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Timer.classes.RuntimeException;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.date.function_microtime;
import com.runtimeconverter.runtime.nativeFunctions.math.function_floor;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-timer/src/Timer.php

*/

public final class Timer extends RuntimeClassBase {

    public Timer(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Timer(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "SebastianBergmann\\Timer\\Timer";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object start(RuntimeEnv env, Object... args) {
            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .SebastianBergmann
                                    .namespaces
                                    .Timer
                                    .classes
                                    .Timer
                                    .RequestStaticProperties
                                    .class,
                            "startTimes")
                    .arrayAppend(env)
                    .set(function_microtime.f.env(env).call(true).value());
            return null;
        }

        @ConvertedMethod
        public Object stop(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    ZVal.subtract(
                            function_microtime.f.env(env).call(true).value(),
                            function_array_pop
                                    .f
                                    .env(env)
                                    .call(
                                            env.getRequestStaticProperties(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .SebastianBergmann
                                                                    .namespaces
                                                                    .Timer
                                                                    .classes
                                                                    .Timer
                                                                    .RequestStaticProperties
                                                                    .class)
                                                    .startTimes)
                                    .value()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "time", typeHint = "float")
        public Object secondsToTimeString(RuntimeEnv env, Object... args) {
            Object time = assignParameter(args, 0, false);
            Object unit = null;
            Object ms = null;
            Object value = null;
            ms = function_round.f.env(env).call(ZVal.multiply(time, 1000)).value();
            for (ZPair zpairResult1118 :
                    ZVal.getIterable(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .SebastianBergmann
                                                    .namespaces
                                                    .Timer
                                                    .classes
                                                    .Timer
                                                    .RequestStaticProperties
                                                    .class)
                                    .times,
                            env,
                            false)) {
                unit = ZVal.assign(zpairResult1118.getKey());
                value = ZVal.assign(zpairResult1118.getValue());
                if (ZVal.isGreaterThanOrEqualTo(ms, ">=", value)) {
                    time =
                            ZVal.divide(
                                    function_floor
                                            .f
                                            .env(env)
                                            .call(ZVal.multiply(ZVal.divide(ms, value), 100.0))
                                            .value(),
                                    100.0);
                    return ZVal.assign(
                            toStringR(time, env)
                                    + " "
                                    + toStringR(
                                            ZVal.equalityCheck(time, 1)
                                                    ? unit
                                                    : toStringR(unit, env) + "s",
                                            env));
                }
            }

            return ZVal.assign(toStringR(ms, env) + " ms");
        }

        @ConvertedMethod
        public Object timeSinceStartOfRequest(RuntimeEnv env, Object... args) {
            ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
            Object startOfRequest = null;
            if (arrayActionR(ArrayAction.ISSET, _SERVER, env, "REQUEST_TIME_FLOAT")) {
                startOfRequest = ZVal.assign(_SERVER.arrayGet(env, "REQUEST_TIME_FLOAT"));

            } else if (arrayActionR(ArrayAction.ISSET, _SERVER, env, "REQUEST_TIME")) {
                startOfRequest = ZVal.assign(_SERVER.arrayGet(env, "REQUEST_TIME"));

            } else {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env, "Cannot determine time at which the request started"));
            }

            return ZVal.assign(
                    runtimeStaticObject.secondsToTimeString(
                            env,
                            ZVal.subtract(
                                    function_microtime.f.env(env).call(true).value(),
                                    startOfRequest)));
        }

        @ConvertedMethod
        public Object resourceUsage(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "Time: %s, Memory: %4.2fMB",
                                    runtimeStaticObject.timeSinceStartOfRequest(env),
                                    ZVal.divide(
                                            function_memory_get_peak_usage
                                                    .f
                                                    .env(env)
                                                    .call(true)
                                                    .value(),
                                            1048576))
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object times =
                ZVal.newArray(
                        new ZPair("hour", 3600000),
                        new ZPair("minute", 60000),
                        new ZPair("second", 1000));

        public Object startTimes = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Timer\\Timer")
                    .setLookup(
                            Timer.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("startTimes", "times")
                    .setFilename("vendor/phpunit/php-timer/src/Timer.php")
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
