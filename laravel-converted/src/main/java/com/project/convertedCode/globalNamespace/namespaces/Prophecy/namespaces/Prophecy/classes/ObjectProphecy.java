package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prophecy.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Comparator.classes.Factory;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prediction.classes.PredictionException;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prophecy.classes.MethodProphecyException;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prophecy.classes.Revealer;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prophecy.classes.ProphecySubjectInterface;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prediction.classes.AggregateException;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.classes.ArgumentsWildcard;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prophecy.classes.ObjectProphecyException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Call.classes.CallCenter;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prophecy.classes.ProphecyInterface;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ComparisonFailure;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prophecy.classes.MethodProphecy;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Prophecy/ObjectProphecy.php

*/

public class ObjectProphecy extends RuntimeClassBase implements ProphecyInterface {

    public Object lazyDouble = null;

    public Object callCenter = null;

    public Object revealer = null;

    public Object comparatorFactory = null;

    public Object methodProphecies = ZVal.newArray();

    public ObjectProphecy(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ObjectProphecy.class) {
            this.__construct(env, args);
        }
    }

    public ObjectProphecy(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "lazyDouble", typeHint = "Prophecy\\Doubler\\LazyDouble")
    @ConvertedParameter(
        index = 1,
        name = "callCenter",
        typeHint = "Prophecy\\Call\\CallCenter",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "revealer",
        typeHint = "Prophecy\\Prophecy\\RevealerInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "comparatorFactory",
        typeHint = "Prophecy\\Comparator\\Factory",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object lazyDouble = assignParameter(args, 0, false);
        Object callCenter = assignParameter(args, 1, true);
        if (null == callCenter) {
            callCenter = ZVal.getNull();
        }
        Object revealer = assignParameter(args, 2, true);
        if (null == revealer) {
            revealer = ZVal.getNull();
        }
        Object comparatorFactory = assignParameter(args, 3, true);
        if (null == comparatorFactory) {
            comparatorFactory = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.lazyDouble = lazyDouble;
        this.callCenter =
                ZVal.isTrue(ternaryExpressionTemp = callCenter)
                        ? ternaryExpressionTemp
                        : new CallCenter(env);
        this.revealer =
                ZVal.isTrue(ternaryExpressionTemp = revealer)
                        ? ternaryExpressionTemp
                        : new Revealer(env);
        this.comparatorFactory =
                ZVal.isTrue(ternaryExpressionTemp = comparatorFactory)
                        ? ternaryExpressionTemp
                        : Factory.runtimeStaticObject.getInstance(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    public Object willExtend(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        env.callMethod(this.lazyDouble, "setParentClass", ObjectProphecy.class, _pClass);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "interface")
    public Object willImplement(RuntimeEnv env, Object... args) {
        Object _pInterface = assignParameter(args, 0, false);
        env.callMethod(this.lazyDouble, "addInterface", ObjectProphecy.class, _pInterface);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "arguments",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object willBeConstructedWith(RuntimeEnv env, Object... args) {
        Object arguments = assignParameter(args, 0, true);
        if (null == arguments) {
            arguments = ZVal.getNull();
        }
        env.callMethod(this.lazyDouble, "setArguments", ObjectProphecy.class, arguments);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object reveal(RuntimeEnv env, Object... args) {
        Object _pDouble = null;
        _pDouble = env.callMethod(this.lazyDouble, "getInstance", ObjectProphecy.class);
        if (ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", _pDouble))
                || ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        _pDouble,
                                        ProphecySubjectInterface.class,
                                        "Prophecy\\Prophecy\\ProphecySubjectInterface")))) {
            throw ZVal.getException(
                    env,
                    new ObjectProphecyException(
                            env,
                            "Generated double must implement ProphecySubjectInterface, but it does not.\n"
                                    + "It seems you have wrongly configured doubler without required ClassPatch.",
                            this));
        }

        env.callMethod(_pDouble, "setProphecy", ObjectProphecy.class, this);
        return ZVal.assign(_pDouble);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "methodProphecy",
        typeHint = "Prophecy\\Prophecy\\MethodProphecy"
    )
    public Object addMethodProphecy(RuntimeEnv env, Object... args) {
        Object methodProphecy = assignParameter(args, 0, false);
        Object argumentsWildcard = null;
        Object methodName = null;
        argumentsWildcard =
                env.callMethod(methodProphecy, "getArgumentsWildcard", ObjectProphecy.class);
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", argumentsWildcard)) {
            throw ZVal.getException(
                    env,
                    new MethodProphecyException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Can not add prophecy for a method `%s::%s()`\n"
                                                    + "as you did not specify arguments wildcard for it.",
                                            function_get_class
                                                    .f
                                                    .env(env)
                                                    .call(this.reveal(env))
                                                    .value(),
                                            env.callMethod(
                                                    methodProphecy,
                                                    "getMethodName",
                                                    ObjectProphecy.class))
                                    .value(),
                            methodProphecy));
        }

        methodName = env.callMethod(methodProphecy, "getMethodName", ObjectProphecy.class);
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "methodProphecies", env),
                env,
                methodName)) {
            new ReferenceClassProperty(this, "methodProphecies", env)
                    .arrayAccess(env, methodName)
                    .set(ZVal.newArray());
        }

        new ReferenceClassProperty(this, "methodProphecies", env)
                .arrayAppend(env, methodName)
                .set(methodProphecy);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "methodName",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getMethodProphecies(RuntimeEnv env, Object... args) {
        Object methodName = assignParameter(args, 0, true);
        if (null == methodName) {
            methodName = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", methodName)) {
            return ZVal.assign(this.methodProphecies);
        }

        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "methodProphecies", env),
                env,
                methodName)) {
            return ZVal.assign(ZVal.newArray());
        }

        return ZVal.assign(
                new ReferenceClassProperty(this, "methodProphecies", env)
                        .arrayGet(env, methodName));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methodName")
    @ConvertedParameter(index = 1, name = "arguments", typeHint = "array")
    public Object makeProphecyMethodCall(RuntimeEnv env, Object... args) {
        Object methodName = assignParameter(args, 0, false);
        Object arguments = assignParameter(args, 1, false);
        Object _pReturn = null;
        arguments = env.callMethod(this.revealer, "reveal", ObjectProphecy.class, arguments);
        _pReturn =
                env.callMethod(
                        this.callCenter,
                        "makeCall",
                        ObjectProphecy.class,
                        this,
                        methodName,
                        arguments);
        return ZVal.assign(env.callMethod(this.revealer, "reveal", ObjectProphecy.class, _pReturn));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methodName")
    @ConvertedParameter(
        index = 1,
        name = "wildcard",
        typeHint = "Prophecy\\Argument\\ArgumentsWildcard"
    )
    public Object findProphecyMethodCalls(RuntimeEnv env, Object... args) {
        Object methodName = assignParameter(args, 0, false);
        Object wildcard = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        this.callCenter, "findCalls", ObjectProphecy.class, methodName, wildcard));
    }

    @ConvertedMethod
    public Object checkProphecyMethodsPredictions(RuntimeEnv env, Object... args) {
        Object exception = null;
        Object e = null;
        Object prophecy = null;
        Object prophecies = null;
        exception =
                new AggregateException(
                        env,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "%s:\n",
                                        function_get_class
                                                .f
                                                .env(env)
                                                .call(this.reveal(env))
                                                .value())
                                .value());
        env.callMethod(exception, "setObjectProphecy", ObjectProphecy.class, this);
        for (ZPair zpairResult965 : ZVal.getIterable(this.methodProphecies, env, true)) {
            prophecies = ZVal.assign(zpairResult965.getValue());
            for (ZPair zpairResult966 : ZVal.getIterable(prophecies, env, true)) {
                prophecy = ZVal.assign(zpairResult966.getValue());
                try {
                    env.callMethod(prophecy, "checkPrediction", ObjectProphecy.class);
                } catch (ConvertedException convertedException120) {
                    if (convertedException120.instanceOf(
                            PredictionException.class,
                            "Prophecy\\Exception\\Prediction\\PredictionException")) {
                        e = convertedException120.getObject();
                        env.callMethod(exception, "append", ObjectProphecy.class, e);
                    } else {
                        throw convertedException120;
                    }
                }
            }
        }

        if (function_count
                .f
                .env(env)
                .call(env.callMethod(exception, "getExceptions", ObjectProphecy.class))
                .getBool()) {
            throw ZVal.getException(env, exception);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methodName")
    @ConvertedParameter(index = 1, name = "arguments", typeHint = "array")
    public Object __call(RuntimeEnv env, Object... args) {
        Object methodName = assignParameter(args, 0, false);
        Object arguments = assignParameter(args, 1, false);
        Object argumentsWildcard = null;
        Object comparator = null;
        Object failure = null;
        Object prophecy = null;
        arguments =
                new ArgumentsWildcard(
                        env,
                        env.callMethod(this.revealer, "reveal", ObjectProphecy.class, arguments));
        for (ZPair zpairResult967 :
                ZVal.getIterable(this.getMethodProphecies(env, methodName), env, true)) {
            prophecy = ZVal.assign(zpairResult967.getValue());
            argumentsWildcard =
                    env.callMethod(prophecy, "getArgumentsWildcard", ObjectProphecy.class);
            comparator =
                    env.callMethod(
                            this.comparatorFactory,
                            "getComparatorFor",
                            ObjectProphecy.class,
                            argumentsWildcard,
                            arguments);
            try {
                env.callMethod(
                        comparator,
                        "assertEquals",
                        ObjectProphecy.class,
                        argumentsWildcard,
                        arguments);
                return ZVal.assign(prophecy);
            } catch (ConvertedException convertedException121) {
                if (convertedException121.instanceOf(
                        ComparisonFailure.class,
                        "SebastianBergmann\\Comparator\\ComparisonFailure")) {
                    failure = convertedException121.getObject();
                } else {
                    throw convertedException121;
                }
            }
        }

        return ZVal.assign(new MethodProphecy(env, this, methodName, arguments));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object __get(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(toObjectR(this.reveal(env)).accessProp(this, env).name(name).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "value")
    public Object __set(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        toObjectR(this.reveal(env))
                .accessProp(this, env)
                .name(name)
                .set(env.callMethod(this.revealer, "reveal", ObjectProphecy.class, value));
        return null;
    }

    public static final Object CONST_class = "Prophecy\\Prophecy\\ObjectProphecy";

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
                    .setName("Prophecy\\Prophecy\\ObjectProphecy")
                    .setLookup(
                            ObjectProphecy.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "callCenter",
                            "comparatorFactory",
                            "lazyDouble",
                            "methodProphecies",
                            "revealer")
                    .setFilename("vendor/phpspec/prophecy/src/Prophecy/Prophecy/ObjectProphecy.php")
                    .addInterface("Prophecy\\Prophecy\\ProphecyInterface")
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
