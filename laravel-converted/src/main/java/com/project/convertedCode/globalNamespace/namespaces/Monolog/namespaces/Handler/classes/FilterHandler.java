package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.HandlerInterface;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_flip;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractHandler;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/FilterHandler.php

*/

public class FilterHandler extends AbstractHandler {

    public Object handler = null;

    public Object acceptedLevels = null;

    public FilterHandler(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.bubble = null;
        if (this.getClass() == FilterHandler.class) {
            this.__construct(env, args);
        }
    }

    public FilterHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "handler")
    @ConvertedParameter(index = 1, name = "minLevelOrList")
    @ConvertedParameter(index = 2, name = "maxLevel")
    @ConvertedParameter(
        index = 3,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object handler = assignParameter(args, 0, false);
        Object minLevelOrList = assignParameter(args, 1, true);
        if (null == minLevelOrList) {
            minLevelOrList = Logger.CONST_DEBUG;
        }
        Object maxLevel = assignParameter(args, 2, true);
        if (null == maxLevel) {
            maxLevel = Logger.CONST_EMERGENCY;
        }
        Object bubble = assignParameter(args, 3, true);
        if (null == bubble) {
            bubble = true;
        }
        this.handler = handler;
        this.bubble = bubble;
        this.setAcceptedLevels(env, minLevelOrList, maxLevel);
        if (ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        this.handler,
                                        HandlerInterface.class,
                                        "Monolog\\Handler\\HandlerInterface")))
                && ZVal.toBool(!function_is_callable.f.env(env).call(this.handler).getBool())) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            "The given handler ("
                                    + toStringR(
                                            NamespaceGlobal.json_encode
                                                    .env(env)
                                                    .call(this.handler)
                                                    .value(),
                                            env)
                                    + ") is not a callable nor a Monolog\\Handler\\HandlerInterface object"));
        }

        return null;
    }

    @ConvertedMethod
    public Object getAcceptedLevels(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_array_flip.f.env(env).call(this.acceptedLevels).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "minLevelOrList")
    @ConvertedParameter(index = 1, name = "maxLevel")
    public Object setAcceptedLevels(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/monolog/monolog/src/Monolog/Handler")
                        .setFile("/vendor/monolog/monolog/src/Monolog/Handler/FilterHandler.php");
        Object minLevelOrList = assignParameter(args, 0, true);
        if (null == minLevelOrList) {
            minLevelOrList = Logger.CONST_DEBUG;
        }
        Object maxLevel = assignParameter(args, 1, true);
        if (null == maxLevel) {
            maxLevel = Logger.CONST_EMERGENCY;
        }
        Object acceptedLevels = null;
        if (function_is_array.f.env(env).call(minLevelOrList).getBool()) {
            acceptedLevels =
                    function_array_map
                            .f
                            .env(env)
                            .call("Monolog\\Logger::toMonologLevel", minLevelOrList)
                            .value();

        } else {
            minLevelOrList = Logger.runtimeStaticObject.toMonologLevel(env, minLevelOrList);
            maxLevel = Logger.runtimeStaticObject.toMonologLevel(env, maxLevel);
            acceptedLevels =
                    function_array_values
                            .f
                            .env(env)
                            .call(
                                    function_array_filter
                                            .f
                                            .env(env)
                                            .call(
                                                    Logger.runtimeStaticObject.getLevels(env),
                                                    new Closure(
                                                            env,
                                                            runtimeConverterFunctionClassConstants,
                                                            "Monolog\\Handler",
                                                            this) {
                                                        @Override
                                                        @ConvertedMethod
                                                        @ConvertedParameter(
                                                            index = 0,
                                                            name = "level"
                                                        )
                                                        public Object run(
                                                                RuntimeEnv env,
                                                                Object thisvar,
                                                                PassByReferenceArgs
                                                                        runtimePassByReferenceArgs,
                                                                Object... args) {
                                                            Object level =
                                                                    assignParameter(args, 0, false);
                                                            Object maxLevel = null;
                                                            Object minLevelOrList = null;
                                                            maxLevel =
                                                                    this.contextReferences
                                                                            .getCapturedValue(
                                                                                    "maxLevel");
                                                            minLevelOrList =
                                                                    this.contextReferences
                                                                            .getCapturedValue(
                                                                                    "minLevelOrList");
                                                            return ZVal.assign(
                                                                    ZVal.toBool(
                                                                                    ZVal
                                                                                            .isGreaterThanOrEqualTo(
                                                                                                    level,
                                                                                                    ">=",
                                                                                                    minLevelOrList))
                                                                            && ZVal.toBool(
                                                                                    ZVal
                                                                                            .isLessThanOrEqualTo(
                                                                                                    level,
                                                                                                    "<=",
                                                                                                    maxLevel)));
                                                        }
                                                    }.use("maxLevel", maxLevel)
                                                            .use("minLevelOrList", minLevelOrList))
                                            .value())
                            .value();
        }

        this.acceptedLevels = function_array_flip.f.env(env).call(acceptedLevels).value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object isHandling(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "acceptedLevels", env),
                        env,
                        record.arrayGet(env, "level")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object handle(RuntimeEnv env, Object... args) {
        Object record = assignParameter(args, 0, false);
        Object processor = null;
        if (!ZVal.isTrue(this.isHandling(env, record))) {
            return ZVal.assign(false);
        }

        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        this.handler,
                        HandlerInterface.class,
                        "Monolog\\Handler\\HandlerInterface"))) {
            this.handler =
                    function_call_user_func
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(this.handler, record, this)
                            .value();
            if (!ZVal.isTrue(
                    ZVal.checkInstanceType(
                            this.handler,
                            HandlerInterface.class,
                            "Monolog\\Handler\\HandlerInterface"))) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env, "The factory callable should return a HandlerInterface"));
            }
        }

        if (toObjectR(this).accessProp(this, env).name("processors").getBool()) {
            for (ZPair zpairResult774 :
                    ZVal.getIterable(
                            toObjectR(this).accessProp(this, env).name("processors").value(),
                            env,
                            true)) {
                processor = ZVal.assign(zpairResult774.getValue());
                record =
                        function_call_user_func
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(processor, record)
                                .value();
            }
        }

        env.callMethod(this.handler, "handle", FilterHandler.class, record);
        return ZVal.assign(ZVal.strictEqualityCheck(false, "===", this.bubble));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "records", typeHint = "array")
    public Object handleBatch(RuntimeEnv env, Object... args) {
        Object records = assignParameter(args, 0, false);
        ReferenceContainer filtered = new BasicReferenceContainer(null);
        Object record = null;
        filtered.setObject(ZVal.newArray());
        for (ZPair zpairResult775 : ZVal.getIterable(records, env, true)) {
            record = ZVal.assign(zpairResult775.getValue());
            if (ZVal.isTrue(this.isHandling(env, record))) {
                filtered.arrayAppend(env).set(record);
            }
        }

        env.callMethod(this.handler, "handleBatch", FilterHandler.class, filtered.getObject());
        return null;
    }

    public static final Object CONST_class = "Monolog\\Handler\\FilterHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractHandler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Handler\\FilterHandler")
                    .setLookup(
                            FilterHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "acceptedLevels",
                            "bubble",
                            "bubble",
                            "formatter",
                            "handler",
                            "level",
                            "processors")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/FilterHandler.php")
                    .addInterface("Monolog\\Handler\\HandlerInterface")
                    .addExtendsClass("Monolog\\Handler\\AbstractHandler")
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
