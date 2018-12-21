package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prophecy.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Promise.classes.PromiseInterface;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prediction.classes.CallPrediction;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prophecy.classes.MethodProphecyException;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prediction.classes.CallbackPrediction;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.classes.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prediction.classes.NoCallsPrediction;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Promise.classes.CallbackPromise;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prediction.classes.PredictionInterface;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.classes.ArgumentsWildcard;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Promise.classes.ReturnPromise;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Promise.classes.ReturnArgumentPromise;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prediction.classes.CallTimesPrediction;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Promise.classes.ThrowPromise;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Doubler.classes.MethodNotFoundException;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.classes.Prophet;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Prophecy/MethodProphecy.php

*/

public class MethodProphecy extends RuntimeClassBase {

    public Object objectProphecy = null;

    public Object methodName = null;

    public Object argumentsWildcard = null;

    public Object promise = null;

    public Object prediction = null;

    public Object checkedPredictions = ZVal.newArray();

    public Object bound = false;

    public Object voidReturnType = false;

    public MethodProphecy(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MethodProphecy.class) {
            this.__construct(env, args);
        }
    }

    public MethodProphecy(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "objectProphecy",
        typeHint = "Prophecy\\Prophecy\\ObjectProphecy"
    )
    @ConvertedParameter(index = 1, name = "methodName")
    @ConvertedParameter(
        index = 2,
        name = "arguments",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/phpspec/prophecy/src/Prophecy/Prophecy")
                        .setFile(
                                "/vendor/phpspec/prophecy/src/Prophecy/Prophecy/MethodProphecy.php");
        Object objectProphecy = assignParameter(args, 0, false);
        Object methodName = assignParameter(args, 1, false);
        Object arguments = assignParameter(args, 2, true);
        if (null == arguments) {
            arguments = ZVal.getNull();
        }
        Object _pDouble = null;
        Object type = null;
        Object reflectedMethod = null;
        _pDouble = env.callMethod(objectProphecy, "reveal", MethodProphecy.class);
        if (!function_method_exists.f.env(env).call(_pDouble, methodName).getBool()) {
            throw ZVal.getException(
                    env,
                    new MethodNotFoundException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Method `%s::%s()` is not defined.",
                                            function_get_class.f.env(env).call(_pDouble).value(),
                                            methodName)
                                    .value(),
                            function_get_class.f.env(env).call(_pDouble).value(),
                            methodName,
                            arguments));
        }

        this.objectProphecy = objectProphecy;
        this.methodName = methodName;
        reflectedMethod = new ReflectionMethod(env, _pDouble, methodName);
        if (ZVal.isTrue(env.callMethod(reflectedMethod, "isFinal", MethodProphecy.class))) {
            throw ZVal.getException(
                    env,
                    new MethodProphecyException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Can not add prophecy for a method `%s::%s()`\n"
                                                    + "as it is a final method.",
                                            function_get_class.f.env(env).call(_pDouble).value(),
                                            methodName)
                                    .value(),
                            this));
        }

        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", arguments)) {
            this.withArguments(env, arguments);
        }

        if (ZVal.toBool(
                        NamespaceGlobal.version_compare
                                .env(env)
                                .call("7.2.11-dev", "7.0", ">=")
                                .value())
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                true,
                                "===",
                                env.callMethod(
                                        reflectedMethod, "hasReturnType", MethodProphecy.class)))) {
            type =
                    ZVal.assign(
                            toStringR(
                                    env.callMethod(
                                            reflectedMethod, "getReturnType", MethodProphecy.class),
                                    env));
            if (ZVal.strictEqualityCheck("void", "===", type)) {
                this.voidReturnType = true;
                return null;
            }

            this.will(
                    env,
                    new Closure(
                            env,
                            runtimeConverterFunctionClassConstants,
                            "Prophecy\\Prophecy",
                            this) {
                        @Override
                        @ConvertedMethod
                        public Object run(
                                RuntimeEnv env,
                                Object thisvar,
                                PassByReferenceArgs runtimePassByReferenceArgs,
                                Object... args) {
                            ContextConstants runtimeConverterFunctionClassConstants =
                                    new ContextConstants()
                                            .setDir(
                                                    "/vendor/phpspec/prophecy/src/Prophecy/Prophecy")
                                            .setFile(
                                                    "/vendor/phpspec/prophecy/src/Prophecy/Prophecy/MethodProphecy.php");
                            Object prophet = null;
                            Object generator = null;
                            Object type = null;
                            type = this.contextReferences.getCapturedValue("type");
                            SwitchEnumType54 switchVariable54 =
                                    ZVal.getEnum(
                                            type,
                                            SwitchEnumType54.DEFAULT_CASE,
                                            SwitchEnumType54.STRING_string,
                                            "string",
                                            SwitchEnumType54.STRING_float,
                                            "float",
                                            SwitchEnumType54.STRING_int,
                                            "int",
                                            SwitchEnumType54.STRING_bool,
                                            "bool",
                                            SwitchEnumType54.STRING_array,
                                            "array",
                                            SwitchEnumType54.STRING_callable,
                                            "callable",
                                            SwitchEnumType54.STRING_Closure,
                                            "Closure",
                                            SwitchEnumType54.STRING_Traversable,
                                            "Traversable",
                                            SwitchEnumType54.STRING_Generator,
                                            "Generator");
                            switch (switchVariable54) {
                                case STRING_string:
                                    return "";
                                case STRING_float:
                                    return 0.0;
                                case STRING_int:
                                    return 0;
                                case STRING_bool:
                                    return ZVal.assign(false);
                                case STRING_array:
                                    return ZVal.assign(ZVal.newArray());
                                case STRING_callable:
                                case STRING_Closure:
                                    return ZVal.assign(
                                            new Closure(
                                                    env,
                                                    runtimeConverterFunctionClassConstants,
                                                    "Prophecy\\Prophecy",
                                                    this) {
                                                @Override
                                                @ConvertedMethod
                                                public Object run(
                                                        RuntimeEnv env,
                                                        Object thisvar,
                                                        PassByReferenceArgs
                                                                runtimePassByReferenceArgs,
                                                        Object... args) {
                                                    return null;
                                                }
                                            });
                                case STRING_Traversable:
                                case STRING_Generator:
                                    generator =
                                            ZVal.assign(
                                                    com.runtimeconverter.runtime.ZVal
                                                            .notImplemented(
                                                                    "Eval Statement is not supported"));
                                    return ZVal.assign(
                                            env.callFunctionDynamic(
                                                            generator,
                                                            new RuntimeArgsWithReferences())
                                                    .value());
                                case DEFAULT_CASE:
                                    prophet = new Prophet(env);
                                    return ZVal.assign(
                                            env.callMethod(
                                                    env.callMethod(
                                                            prophet,
                                                            "prophesize",
                                                            MethodProphecy.class,
                                                            type),
                                                    "reveal",
                                                    MethodProphecy.class));
                            }
                            ;
                            return null;
                        }
                    }.use("type", type));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "arguments")
    public Object withArguments(RuntimeEnv env, Object... args) {
        Object arguments = assignParameter(args, 0, false);
        if (function_is_array.f.env(env).call(arguments).getBool()) {
            arguments = new ArgumentsWildcard(env, arguments);
        }

        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        arguments,
                        ArgumentsWildcard.class,
                        "Prophecy\\Argument\\ArgumentsWildcard"))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Either an array or an instance of ArgumentsWildcard expected as\n"
                                                    + "a `MethodProphecy::withArguments()` argument, but got %s.",
                                            NamespaceGlobal.gettype
                                                    .env(env)
                                                    .call(arguments)
                                                    .value())
                                    .value()));
        }

        this.argumentsWildcard = arguments;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "promise")
    public Object will(RuntimeEnv env, Object... args) {
        Object promise = assignParameter(args, 0, false);
        if (function_is_callable.f.env(env).call(promise).getBool()) {
            promise = new CallbackPromise(env, promise);
        }

        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        promise, PromiseInterface.class, "Prophecy\\Promise\\PromiseInterface"))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Expected callable or instance of PromiseInterface, but got %s.",
                                            NamespaceGlobal.gettype.env(env).call(promise).value())
                                    .value()));
        }

        this.bindToObjectProphecy(env);
        this.promise = promise;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object willReturn(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.voidReturnType)) {
            throw ZVal.getException(
                    env,
                    new MethodProphecyException(
                            env,
                            "The method \""
                                    + toStringR(this.methodName, env)
                                    + "\" has a void return type, and so cannot return anything",
                            this));
        }

        return ZVal.assign(
                this.will(
                        env,
                        new ReturnPromise(
                                env,
                                function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "index", defaultValue = "0", defaultValueType = "number")
    public Object willReturnArgument(RuntimeEnv env, Object... args) {
        Object index = assignParameter(args, 0, true);
        if (null == index) {
            index = 0;
        }
        if (ZVal.isTrue(this.voidReturnType)) {
            throw ZVal.getException(
                    env,
                    new MethodProphecyException(
                            env,
                            "The method \""
                                    + toStringR(this.methodName, env)
                                    + "\" has a void return type",
                            this));
        }

        return ZVal.assign(this.will(env, new ReturnArgumentPromise(env, index)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exception")
    public Object willThrow(RuntimeEnv env, Object... args) {
        Object exception = assignParameter(args, 0, false);
        return ZVal.assign(this.will(env, new ThrowPromise(env, exception)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prediction")
    public Object should(RuntimeEnv env, Object... args) {
        Object prediction = assignParameter(args, 0, false);
        if (function_is_callable.f.env(env).call(prediction).getBool()) {
            prediction = new CallbackPrediction(env, prediction);
        }

        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        prediction,
                        PredictionInterface.class,
                        "Prophecy\\Prediction\\PredictionInterface"))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Expected callable or instance of PredictionInterface, but got %s.",
                                            NamespaceGlobal.gettype
                                                    .env(env)
                                                    .call(prediction)
                                                    .value())
                                    .value()));
        }

        this.bindToObjectProphecy(env);
        this.prediction = prediction;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object shouldBeCalled(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.should(env, new CallPrediction(env)));
    }

    @ConvertedMethod
    public Object shouldNotBeCalled(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.should(env, new NoCallsPrediction(env)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "count")
    public Object shouldBeCalledTimes(RuntimeEnv env, Object... args) {
        Object count = assignParameter(args, 0, false);
        return ZVal.assign(this.should(env, new CallTimesPrediction(env, count)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prediction")
    public Object shouldHave(RuntimeEnv env, Object... args) {
        Object prediction = assignParameter(args, 0, false);
        Object calls = null;
        Object e = null;
        if (function_is_callable.f.env(env).call(prediction).getBool()) {
            prediction = new CallbackPrediction(env, prediction);
        }

        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        prediction,
                        PredictionInterface.class,
                        "Prophecy\\Prediction\\PredictionInterface"))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Expected callable or instance of PredictionInterface, but got %s.",
                                            NamespaceGlobal.gettype
                                                    .env(env)
                                                    .call(prediction)
                                                    .value())
                                    .value()));
        }

        if (ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.promise))
                && ZVal.toBool(!ZVal.isTrue(this.voidReturnType))) {
            this.willReturn(env);
        }

        calls =
                env.callMethod(
                        this.getObjectProphecy(env),
                        "findProphecyMethodCalls",
                        MethodProphecy.class,
                        this.getMethodName(env),
                        this.getArgumentsWildcard(env));
        try {
            env.callMethod(
                    prediction,
                    "check",
                    MethodProphecy.class,
                    calls,
                    this.getObjectProphecy(env),
                    this);
            new ReferenceClassProperty(this, "checkedPredictions", env)
                    .arrayAppend(env)
                    .set(prediction);
        } catch (ConvertedException convertedException119) {
            if (convertedException119.instanceOf(PHPException.class, "Exception")) {
                e = convertedException119.getObject();
                new ReferenceClassProperty(this, "checkedPredictions", env)
                        .arrayAppend(env)
                        .set(prediction);
                throw ZVal.getException(env, e);
            } else {
                throw convertedException119;
            }
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object shouldHaveBeenCalled(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.shouldHave(env, new CallPrediction(env)));
    }

    @ConvertedMethod
    public Object shouldNotHaveBeenCalled(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.shouldHave(env, new NoCallsPrediction(env)));
    }

    @ConvertedMethod
    public Object shouldNotBeenCalled(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.shouldNotHaveBeenCalled(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "count")
    public Object shouldHaveBeenCalledTimes(RuntimeEnv env, Object... args) {
        Object count = assignParameter(args, 0, false);
        return ZVal.assign(this.shouldHave(env, new CallTimesPrediction(env, count)));
    }

    @ConvertedMethod
    public Object checkPrediction(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.prediction)) {
            return null;
        }

        this.shouldHave(env, this.prediction);
        return null;
    }

    @ConvertedMethod
    public Object getPromise(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.promise);
    }

    @ConvertedMethod
    public Object getPrediction(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.prediction);
    }

    @ConvertedMethod
    public Object getCheckedPredictions(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.checkedPredictions);
    }

    @ConvertedMethod
    public Object getObjectProphecy(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.objectProphecy);
    }

    @ConvertedMethod
    public Object getMethodName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.methodName);
    }

    @ConvertedMethod
    public Object getArgumentsWildcard(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.argumentsWildcard);
    }

    @ConvertedMethod
    public Object hasReturnVoid(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.voidReturnType);
    }

    @ConvertedMethod
    private Object bindToObjectProphecy(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.bound)) {
            return null;
        }

        env.callMethod(
                this.getObjectProphecy(env), "addMethodProphecy", MethodProphecy.class, this);
        this.bound = true;
        return null;
    }

    public static final Object CONST_class = "Prophecy\\Prophecy\\MethodProphecy";

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
                    .setName("Prophecy\\Prophecy\\MethodProphecy")
                    .setLookup(
                            MethodProphecy.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "argumentsWildcard",
                            "bound",
                            "checkedPredictions",
                            "methodName",
                            "objectProphecy",
                            "prediction",
                            "promise",
                            "voidReturnType")
                    .setFilename("vendor/phpspec/prophecy/src/Prophecy/Prophecy/MethodProphecy.php")
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

    private enum SwitchEnumType54 {
        STRING_string,
        STRING_float,
        STRING_int,
        STRING_bool,
        STRING_array,
        STRING_callable,
        STRING_Closure,
        STRING_Traversable,
        STRING_Generator,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
