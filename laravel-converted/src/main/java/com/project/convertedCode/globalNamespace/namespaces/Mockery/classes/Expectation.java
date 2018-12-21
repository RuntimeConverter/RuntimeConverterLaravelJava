package com.project.convertedCode.globalNamespace.namespaces.Mockery.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes.ArgumentListMatcher;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes.MultiArgumentClosure;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes.NoArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.classes.Mock;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.classes.Undefined;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_reset;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.nativeFunctions.array.function_current;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import java.lang.Class;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes.AnyArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.Matcher;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.classes.Mockery;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes.MatcherAbstract;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes.AndAnyOtherArgs;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.classes.Exception;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_a;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.classes.ExpectationInterface;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;
import static com.runtimeconverter.runtime.ZVal.assignParameterVarArgs;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Expectation.php

*/

public class Expectation extends RuntimeClassBase implements ExpectationInterface {

    public Object _mock = ZVal.getNull();

    public Object _name = ZVal.getNull();

    public Object _because = ZVal.getNull();

    public Object _expectedArgs = ZVal.newArray();

    public Object _countValidators = ZVal.newArray();

    public Object _countValidatorClass = "Mockery\\CountValidator\\Exact";

    public Object _actualCount = 0;

    public Object _returnValue = ZVal.getNull();

    public Object _returnQueue = ZVal.newArray();

    public Object _closureQueue = ZVal.newArray();

    public Object _setQueue = ZVal.newArray();

    public Object _orderNumber = ZVal.getNull();

    public Object _globalOrderNumber = ZVal.getNull();

    public Object _throw = false;

    public Object _globally = false;

    public Object _passthru = false;

    public Expectation(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Expectation.class) {
            this.__construct(env, args);
        }
    }

    public Expectation(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mock", typeHint = "Mockery\\MockInterface")
    @ConvertedParameter(index = 1, name = "name")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object mock = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        this._mock = mock;
        this._name = name;
        this.withAnyArgs(env);
        return null;
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                Mockery.runtimeStaticObject.formatArgs(env, this._name, this._expectedArgs));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args", typeHint = "array")
    public Object verifyCall(RuntimeEnv env, Object... args) {
        Object ___args = assignParameter(args, 0, false);
        Object _pReturn = null;
        this.validateOrder(env);
        this._actualCount = ZVal.increment(this._actualCount);
        if (ZVal.strictEqualityCheck(true, "===", this._passthru)) {
            return ZVal.assign(
                    env.callMethod(
                            this._mock,
                            "mockery_callSubjectMethod",
                            Expectation.class,
                            this._name,
                            ___args));
        }

        _pReturn = this._getReturnValue(env, ___args);
        this.throwAsNecessary(env, _pReturn);
        this._setValues(env);
        return ZVal.assign(_pReturn);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "return")
    private Object throwAsNecessary(RuntimeEnv env, Object... args) {
        Object _pReturn = assignParameter(args, 0, false);
        Object type = null;
        if (!ZVal.isTrue(this._throw)) {
            return null;
        }

        type =
                ZVal.assign(
                        ZVal.isGreaterThanOrEqualTo(
                                        NamespaceGlobal.version_compare
                                                .env(env)
                                                .call("7.2.11-dev", "7.0.0")
                                                .value(),
                                        ">=",
                                        0)
                                ? "\\Throwable"
                                : "\\Exception");
        if (ZVal.isTrue(ZVal.checkInstanceTypeMatch(_pReturn, type))) {
            throw ZVal.getException(env, _pReturn);
        }

        return null;
    }

    @ConvertedMethod
    protected Object _setValues(RuntimeEnv env, Object... args) {
        Object container = null;
        ReferenceContainer values = new BasicReferenceContainer(null);
        Object name = null;
        Object mockClass = null;
        Object mock = null;
        Object mocks = null;
        Object value = null;
        mockClass = function_get_class.f.env(env).call(this._mock).value();
        container = env.callMethod(this._mock, "mockery_getContainer", Expectation.class);
        mocks = env.callMethod(container, "getMocks", Expectation.class);
        for (ZPair zpairResult689 : ZVal.getIterable(this._setQueue, env, false)) {
            name = ZVal.assign(zpairResult689.getKey());
            values = zpairResult689;
            if (ZVal.isGreaterThan(
                    function_count.f.env(env).call(values.getObject()).value(), '>', 0)) {
                value = function_array_shift.f.env(env).call(values.getObject()).value();
                for (ZPair zpairResult690 : ZVal.getIterable(mocks, env, true)) {
                    mock = ZVal.assign(zpairResult690.getValue());
                    if (function_is_a.f.env(env).call(mock, mockClass).getBool()) {
                        toObjectR(mock).accessProp(this, env).name(name).set(value);
                    }
                }
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args", typeHint = "array")
    protected Object _getReturnValue(RuntimeEnv env, Object... args) {
        Object ___args = assignParameter(args, 0, false);
        if (ZVal.isGreaterThan(
                function_count.f.env(env).call(this._closureQueue).value(), '>', 1)) {
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    function_array_shift
                                            .f
                                            .env(env)
                                            .call(this._closureQueue)
                                            .value(),
                                    ___args)
                            .value());

        } else if (ZVal.isGreaterThan(
                function_count.f.env(env).call(this._closureQueue).value(), '>', 0)) {
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    function_current.f.env(env).call(this._closureQueue).value(),
                                    ___args)
                            .value());

        } else if (ZVal.isGreaterThan(
                function_count.f.env(env).call(this._returnQueue).value(), '>', 1)) {
            return ZVal.assign(function_array_shift.f.env(env).call(this._returnQueue).value());

        } else if (ZVal.isGreaterThan(
                function_count.f.env(env).call(this._returnQueue).value(), '>', 0)) {
            return ZVal.assign(function_current.f.env(env).call(this._returnQueue).value());
        }

        return ZVal.assign(
                env.callMethod(
                        this._mock, "mockery_returnValueForMethod", Expectation.class, this._name));
    }

    @ConvertedMethod
    public Object isEligible(RuntimeEnv env, Object... args) {
        Object validator = null;
        for (ZPair zpairResult691 : ZVal.getIterable(this._countValidators, env, true)) {
            validator = ZVal.assign(zpairResult691.getValue());
            if (!ZVal.isTrue(
                    env.callMethod(
                            validator, "isEligible", Expectation.class, this._actualCount))) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object isCallCountConstrained(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isGreaterThan(
                        function_count.f.env(env).call(this._countValidators).value(), '>', 0));
    }

    @ConvertedMethod
    public Object validateOrder(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this._orderNumber)) {
            env.callMethod(
                    this._mock,
                    "mockery_validateOrder",
                    Expectation.class,
                    toStringR(this, env),
                    this._orderNumber,
                    this._mock);
        }

        if (ZVal.isTrue(this._globalOrderNumber)) {
            env.callMethod(
                    env.callMethod(this._mock, "mockery_getContainer", Expectation.class),
                    "mockery_validateOrder",
                    Expectation.class,
                    toStringR(this, env),
                    this._globalOrderNumber,
                    this._mock);
        }

        return null;
    }

    @ConvertedMethod
    public Object verify(RuntimeEnv env, Object... args) {
        Object validator = null;
        for (ZPair zpairResult692 : ZVal.getIterable(this._countValidators, env, true)) {
            validator = ZVal.assign(zpairResult692.getValue());
            env.callMethod(
                    validator,
                    new RuntimeArgsWithReferences()
                            .add(0, new ReferenceClassProperty(this, "_actualCount", env)),
                    "validate",
                    Expectation.class,
                    this._actualCount);
        }

        return null;
    }

    @ConvertedMethod
    private Object isArgumentListMatcher(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        function_count.f.env(env).call(this._expectedArgs).value(),
                                        "===",
                                        1))
                        && ZVal.toBool(
                                ZVal.checkInstanceType(
                                        new ReferenceClassProperty(this, "_expectedArgs", env)
                                                .arrayGet(env, 0),
                                        ArgumentListMatcher.class,
                                        "Mockery\\Matcher\\ArgumentListMatcher")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expectedArg")
    private Object isAndAnyOtherArgumentsMatcher(RuntimeEnv env, Object... args) {
        Object expectedArg = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.checkInstanceType(
                        expectedArg, AndAnyOtherArgs.class, "Mockery\\Matcher\\AndAnyOtherArgs"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args", typeHint = "array")
    public Object matchArgs(RuntimeEnv env, Object... args) {
        ReferenceContainer ___args = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object argCount = null;
        Object lastExpectedArgument = null;
        Object argCountToSkipMatching = null;
        if (ZVal.isTrue(this.isArgumentListMatcher(env))) {
            return ZVal.assign(
                    env.callMethod(
                            this,
                            new RuntimeArgsWithReferences().add(1, ___args),
                            "_matchArg",
                            Expectation.class,
                            new ReferenceClassProperty(this, "_expectedArgs", env).arrayGet(env, 0),
                            ___args.getObject()));
        }

        argCount = function_count.f.env(env).call(___args.getObject()).value();
        if (ZVal.strictNotEqualityCheck(
                argCount,
                "!==",
                function_count.f.env(env).call(rToArrayCast(this._expectedArgs)).value())) {
            lastExpectedArgument = function_end.f.env(env).call(this._expectedArgs).value();
            function_reset.f.env(env).call(this._expectedArgs);
            if (ZVal.isTrue(this.isAndAnyOtherArgumentsMatcher(env, lastExpectedArgument))) {
                argCountToSkipMatching =
                        ZVal.subtract(
                                argCount,
                                function_count.f.env(env).call(this._expectedArgs).value());
                ___args.setObject(
                        function_array_slice
                                .f
                                .env(env)
                                .call(___args.getObject(), 0, argCountToSkipMatching)
                                .value());
                return ZVal.assign(this._matchArgs(env, ___args.getObject()));
            }

            return ZVal.assign(false);
        }

        return ZVal.assign(this._matchArgs(env, ___args.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args")
    protected Object _matchArgs(RuntimeEnv env, Object... args) {
        ReferenceContainer ___args = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer param = new BasicReferenceContainer(null);
        Object argCount = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        argCount = function_count.f.env(env).call(___args.getObject()).value();
        for (i.setObject(0);
                ZVal.isLessThan(i.getObject(), '<', argCount);
                i.setObject(ZVal.increment(i.getObject()))) {
            param = new ArrayDimensionReference(___args.getObject(), i.getObject());
            if (!ZVal.isTrue(
                    env.callMethod(
                            this,
                            new RuntimeArgsWithReferences().add(1, param),
                            "_matchArg",
                            Expectation.class,
                            new ReferenceClassProperty(this, "_expectedArgs", env)
                                    .arrayGet(env, i.getObject()),
                            param.getObject()))) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expected")
    @ConvertedParameter(index = 1, name = "actual")
    protected Object _matchArg(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        Object expected = assignParameter(args, 0, false);
        ReferenceContainer actual = assignParameterRef(runtimePassByReferenceArgs, args, 1, false);
        Object result = null;
        if (ZVal.strictEqualityCheck(expected, "===", actual.getObject())) {
            return ZVal.assign(true);
        }

        if (ZVal.toBool(
                        ZVal.toBool(!function_is_object.f.env(env).call(expected).getBool())
                                && ZVal.toBool(
                                        !function_is_object
                                                .f
                                                .env(env)
                                                .call(actual.getObject())
                                                .getBool()))
                && ZVal.toBool(ZVal.equalityCheck(expected, actual.getObject()))) {
            return ZVal.assign(true);
        }

        if (ZVal.toBool(function_is_string.f.env(env).call(expected).value())
                && ZVal.toBool(function_is_object.f.env(env).call(actual.getObject()).value())) {
            result = ZVal.assign(ZVal.checkInstanceTypeMatch(actual.getObject(), expected));
            if (ZVal.isTrue(result)) {
                return ZVal.assign(true);
            }
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        expected, MatcherAbstract.class, "Mockery\\Matcher\\MatcherAbstract"))) {
            return ZVal.assign(
                    env.callMethod(
                            expected,
                            new RuntimeArgsWithReferences().add(0, actual),
                            "match",
                            Expectation.class,
                            actual.getObject()));
        }

        if (ZVal.toBool(ZVal.checkInstanceType(expected, Matcher.class, "Hamcrest\\Matcher"))
                || ZVal.toBool(
                        ZVal.checkInstanceType(expected, (Class) null, "Hamcrest_Matcher", env))) {
            return ZVal.assign(
                    env.callMethod(expected, "matches", Expectation.class, actual.getObject()));
        }

        return ZVal.assign(false);
    }

    public Object _matchArg(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args")
    public Object with(RuntimeEnv env, Object... args) {
        Object ___args = assignParameterVarArgs(args, 0);
        return ZVal.assign(this.withArgs(env, ___args));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "arguments", typeHint = "array")
    private Object withArgsInArray(RuntimeEnv env, Object... args) {
        Object arguments = assignParameter(args, 0, false);
        if (ZVal.isEmpty(arguments)) {
            return ZVal.assign(this.withNoArgs(env));
        }

        this._expectedArgs = arguments;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "closure", typeHint = "Closure")
    private Object withArgsMatchedByClosure(RuntimeEnv env, Object... args) {
        Object closure = assignParameter(args, 0, false);
        this._expectedArgs = ZVal.newArray(new ZPair(0, new MultiArgumentClosure(env, closure)));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "argsOrClosure")
    public Object withArgs(RuntimeEnv env, Object... args) {
        Object argsOrClosure = assignParameter(args, 0, false);
        if (function_is_array.f.env(env).call(argsOrClosure).getBool()) {
            this.withArgsInArray(env, argsOrClosure);

        } else if (ZVal.isTrue(ZVal.checkInstanceType(argsOrClosure, Closure.class, "Closure"))) {
            this.withArgsMatchedByClosure(env, argsOrClosure);

        } else {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Call to %s with an invalid argument (%s), only array and "
                                                    + "closure are allowed",
                                            "Expectation::withArgs", argsOrClosure)
                                    .value()));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object withNoArgs(RuntimeEnv env, Object... args) {
        this._expectedArgs = ZVal.newArray(new ZPair(0, new NoArgs(env)));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object withAnyArgs(RuntimeEnv env, Object... args) {
        this._expectedArgs = ZVal.newArray(new ZPair(0, new AnyArgs(env)));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args")
    public Object andReturn(RuntimeEnv env, Object... args) {
        Object ___args = assignParameterVarArgs(args, 0);
        this._returnQueue = ___args;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args")
    public Object andReturns(RuntimeEnv env, Object... args) {
        Object ___args = assignParameterVarArgs(args, 0);
        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(ZVal.newArray(new ZPair(0, this), new ZPair(1, "andReturn")), ___args)
                        .value());
    }

    @ConvertedMethod
    public Object andReturnSelf(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.andReturn(env, this._mock));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values", typeHint = "array")
    public Object andReturnValues(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, false);
        function_call_user_func_array
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                .call(ZVal.newArray(new ZPair(0, this), new ZPair(1, "andReturn")), values);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args")
    public Object andReturnUsing(RuntimeEnv env, Object... args) {
        Object ___args = assignParameterVarArgs(args, 0);
        this._closureQueue = ___args;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object andReturnUndefined(RuntimeEnv env, Object... args) {
        this.andReturn(env, new Undefined(env));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object andReturnNull(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.andReturn(env, ZVal.getNull()));
    }

    @ConvertedMethod
    public Object andReturnFalse(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.andReturn(env, false));
    }

    @ConvertedMethod
    public Object andReturnTrue(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.andReturn(env, true));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exception")
    @ConvertedParameter(index = 1, name = "message")
    @ConvertedParameter(index = 2, name = "code", defaultValue = "0", defaultValueType = "number")
    @ConvertedParameter(
        index = 3,
        name = "previous",
        typeHint = "Exception",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object andThrow(RuntimeEnv env, Object... args) {
        Object exception = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, true);
        if (null == message) {
            message = "";
        }
        Object code = assignParameter(args, 2, true);
        if (null == code) {
            code = 0;
        }
        Object previous = assignParameter(args, 3, true);
        if (null == previous) {
            previous = ZVal.getNull();
        }
        this._throw = true;
        if (function_is_object.f.env(env).call(exception).getBool()) {
            this.andReturn(env, exception);

        } else {
            this.andReturn(env, env.createNew(exception, message, code, previous));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exception")
    @ConvertedParameter(index = 1, name = "message")
    @ConvertedParameter(index = 2, name = "code", defaultValue = "0", defaultValueType = "number")
    @ConvertedParameter(
        index = 3,
        name = "previous",
        typeHint = "Exception",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object andThrows(RuntimeEnv env, Object... args) {
        Object exception = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, true);
        if (null == message) {
            message = "";
        }
        Object code = assignParameter(args, 2, true);
        if (null == code) {
            code = 0;
        }
        Object previous = assignParameter(args, 3, true);
        if (null == previous) {
            previous = ZVal.getNull();
        }
        return ZVal.assign(this.andThrow(env, exception, message, code, previous));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exceptions", typeHint = "array")
    public Object andThrowExceptions(RuntimeEnv env, Object... args) {
        Object exceptions = assignParameter(args, 0, false);
        Object exception = null;
        this._throw = true;
        for (ZPair zpairResult693 : ZVal.getIterable(exceptions, env, true)) {
            exception = ZVal.assign(zpairResult693.getValue());
            if (!function_is_object.f.env(env).call(exception).getBool()) {
                throw ZVal.getException(
                        env,
                        new Exception(
                                env,
                                "You must pass an array of exception objects to andThrowExceptions"));
            }
        }

        return ZVal.assign(this.andReturnValues(env, exceptions));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "values")
    public Object andSet(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object values = assignParameterVarArgs(args, 1);
        new ReferenceClassProperty(this, "_setQueue", env).arrayAccess(env, name).set(values);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "value")
    public Object set(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(
                                ZVal.newArray(new ZPair(0, this), new ZPair(1, "andSet")),
                                function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value())
                        .value());
    }

    @ConvertedMethod
    public Object zeroOrMoreTimes(RuntimeEnv env, Object... args) {
        env.callMethod(this.atLeast(env), "never", Expectation.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "limit",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object times(RuntimeEnv env, Object... args) {
        Object limit = assignParameter(args, 0, true);
        if (null == limit) {
            limit = ZVal.getNull();
        }
        if (function_is_null.f.env(env).call(limit).getBool()) {
            return ZVal.assign(this);
        }

        if (!function_is_int.f.env(env).call(limit).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "The passed Times limit should be an integer value"));
        }

        new ReferenceClassProperty(this, "_countValidators", env)
                .arrayAccess(env, this._countValidatorClass)
                .set(env.createNew(this._countValidatorClass, this, limit));
        this._countValidatorClass = "Mockery\\CountValidator\\Exact";
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object never(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.times(env, 0));
    }

    @ConvertedMethod
    public Object once(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.times(env, 1));
    }

    @ConvertedMethod
    public Object twice(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.times(env, 2));
    }

    @ConvertedMethod
    public Object atLeast(RuntimeEnv env, Object... args) {
        this._countValidatorClass = "Mockery\\CountValidator\\AtLeast";
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object atMost(RuntimeEnv env, Object... args) {
        this._countValidatorClass = "Mockery\\CountValidator\\AtMost";
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "minimum")
    @ConvertedParameter(index = 1, name = "maximum")
    public Object between(RuntimeEnv env, Object... args) {
        Object minimum = assignParameter(args, 0, false);
        Object maximum = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        this.atLeast(env), "times", Expectation.class, minimum),
                                "atMost",
                                Expectation.class),
                        "times",
                        Expectation.class,
                        maximum));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    public Object because(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        this._because = message;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "group",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object ordered(RuntimeEnv env, Object... args) {
        Object group = assignParameter(args, 0, true);
        if (null == group) {
            group = ZVal.getNull();
        }
        if (ZVal.isTrue(this._globally)) {
            this._globalOrderNumber =
                    this._defineOrdered(
                            env,
                            group,
                            env.callMethod(this._mock, "mockery_getContainer", Expectation.class));

        } else {
            this._orderNumber = this._defineOrdered(env, group, this._mock);
        }

        this._globally = false;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object globally(RuntimeEnv env, Object... args) {
        this._globally = true;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "group")
    @ConvertedParameter(index = 1, name = "ordering")
    protected Object _defineOrdered(RuntimeEnv env, Object... args) {
        Object group = assignParameter(args, 0, false);
        Object ordering = assignParameter(args, 1, false);
        Object result = null;
        ReferenceContainer groups = new BasicReferenceContainer(null);
        groups.setObject(env.callMethod(ordering, "mockery_getGroups", Expectation.class));
        if (function_is_null.f.env(env).call(group).getBool()) {
            result = env.callMethod(ordering, "mockery_allocateOrder", Expectation.class);

        } else if (arrayActionR(ArrayAction.ISSET, groups, env, group)) {
            result = ZVal.assign(groups.arrayGet(env, group));

        } else {
            result = env.callMethod(ordering, "mockery_allocateOrder", Expectation.class);
            env.callMethod(ordering, "mockery_setGroup", Expectation.class, group, result);
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    public Object getOrderNumber(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._orderNumber);
    }

    @ConvertedMethod
    public Object byDefault(RuntimeEnv env, Object... args) {
        Object director = null;
        director =
                env.callMethod(
                        this._mock, "mockery_getExpectationsFor", Expectation.class, this._name);
        if (!ZVal.isEmpty(director)) {
            env.callMethod(director, "makeExpectationDefault", Expectation.class, this);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getMock(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._mock);
    }

    @ConvertedMethod
    public Object passthru(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(ZVal.checkInstanceType(this._mock, Mock.class, "Mockery\\Mock"))) {
            throw ZVal.getException(
                    env,
                    new Exception(
                            env,
                            "Mock Objects not created from a loaded/existing class are "
                                    + "incapable of passing method calls through to a parent class"));
        }

        this._passthru = true;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object __clone(RuntimeEnv env, Object... args) {
        Object countValidators = null;
        Object validator = null;
        ReferenceContainer newValidators = new BasicReferenceContainer(null);
        newValidators.setObject(ZVal.newArray());
        countValidators = ZVal.assign(this._countValidators);
        for (ZPair zpairResult694 : ZVal.getIterable(countValidators, env, true)) {
            validator = ZVal.assign(zpairResult694.getValue());
            newValidators.arrayAppend(env).set(((RuntimeClassInterface) validator).phpClone(env));
        }

        this._countValidators = newValidators.getObject();
        return null;
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._name);
    }

    @ConvertedMethod
    public Object getExceptionMessage(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._because);
    }

    public static final Object CONST_class = "Mockery\\Expectation";

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
                    .setName("Mockery\\Expectation")
                    .setLookup(
                            Expectation.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "_actualCount",
                            "_because",
                            "_closureQueue",
                            "_countValidatorClass",
                            "_countValidators",
                            "_expectedArgs",
                            "_globalOrderNumber",
                            "_globally",
                            "_mock",
                            "_name",
                            "_orderNumber",
                            "_passthru",
                            "_returnQueue",
                            "_returnValue",
                            "_setQueue",
                            "_throw")
                    .setFilename("vendor/mockery/mockery/library/Mockery/Expectation.php")
                    .addInterface("Mockery\\ExpectationInterface")
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
