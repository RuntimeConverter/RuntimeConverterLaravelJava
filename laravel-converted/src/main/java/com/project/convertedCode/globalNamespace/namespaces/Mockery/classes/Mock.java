package com.project.convertedCode.globalNamespace.namespaces.Mockery.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.classes.VerificationExpectation;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_change_key_case;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.classes.Container;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.classes.Undefined;
import com.runtimeconverter.runtime.nativeClasses.exceptions.ReflectionException;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionObject;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.classes.VerificationDirector;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Exception.classes.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.string.function_stripos;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.classes.HigherOrderMessage;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.classes.Mockery;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.classes.MethodCall;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Exception.classes.InvalidOrderException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.classes.MockInterface;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.classes.ExpectsHigherOrderMessage;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Exception.classes.NoMatchingExpectationException;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.classes.ExpectationDirector;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.classes.ReceivedMethodCalls;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.classes.Expectation;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;
import static com.runtimeconverter.runtime.ZVal.assignParameterVarArgs;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Mock.php

*/

public class Mock extends RuntimeClassBase implements MockInterface {

    public Object _mockery_expectations = ZVal.newArray();

    public Object _mockery_expectations_count = 0;

    public Object _mockery_ignoreMissing = false;

    public Object _mockery_deferMissing = false;

    public Object _mockery_verified = false;

    public Object _mockery_name = ZVal.getNull();

    public Object _mockery_allocatedOrder = 0;

    public Object _mockery_currentOrder = 0;

    public Object _mockery_groups = ZVal.newArray();

    public Object _mockery_container = ZVal.getNull();

    public Object _mockery_partial = ZVal.getNull();

    public Object _mockery_disableExpectationMatching = false;

    public Object _mockery_mockableProperties = ZVal.newArray();

    public Object _mockery_mockableMethods = ZVal.newArray();

    public Object _mockery_allowMockingProtectedMethods = false;

    public Object _mockery_receivedMethodCalls = null;

    public Object _mockery_defaultReturnValue = ZVal.getNull();

    public Object _mockery_thrownExceptions = ZVal.newArray();

    public Mock(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Mock(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Mockery\\Container",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "partialObject",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object mockery_init(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, true);
        if (null == container) {
            container = ZVal.getNull();
        }
        Object partialObject = assignParameter(args, 1, true);
        if (null == partialObject) {
            partialObject = ZVal.getNull();
        }
        Object method = null;
        if (function_is_null.f.env(env).call(container).getBool()) {
            container = new Container(env);
        }

        this._mockery_container = container;
        if (!function_is_null.f.env(env).call(partialObject).getBool()) {
            this._mockery_partial = partialObject;
        }

        if (!ZVal.isTrue(
                env.callMethod(
                        Mockery.runtimeStaticObject.getConfiguration(env),
                        "mockingNonExistentMethodsAllowed",
                        Mock.class))) {
            for (ZPair zpairResult727 : ZVal.getIterable(this.mockery_getMethods(env), env, true)) {
                method = ZVal.assign(zpairResult727.getValue());
                if (ZVal.toBool(env.callMethod(method, "isPublic", Mock.class))
                        && ZVal.toBool(
                                !ZVal.isTrue(env.callMethod(method, "isStatic", Mock.class)))) {
                    new ReferenceClassProperty(this, "_mockery_mockableMethods", env)
                            .arrayAppend(env)
                            .set(env.callMethod(method, "getName", Mock.class));
                }
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methodNames")
    public Object shouldReceive(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/mockery/mockery/library/Mockery")
                        .setFile("/vendor/mockery/mockery/library/Mockery/Mock.php");
        Object methodNames = assignParameterVarArgs(args, 0);
        Object allowMockingProtectedMethods = null;
        Object lastExpectation = null;
        Object method = null;
        Object self = null;
        if (ZVal.strictEqualityCheck(
                function_count.f.env(env).call(methodNames).value(), "===", 0)) {
            return ZVal.assign(new HigherOrderMessage(env, this, "shouldReceive"));
        }

        for (ZPair zpairResult728 : ZVal.getIterable(methodNames, env, true)) {
            method = ZVal.assign(zpairResult728.getValue());
            if (ZVal.equalityCheck("", method)) {
                throw ZVal.getException(
                        env, new InvalidArgumentException(env, "Received empty method name"));
            }
        }

        self = ZVal.assign(this);
        allowMockingProtectedMethods = ZVal.assign(this._mockery_allowMockingProtectedMethods);
        lastExpectation =
                Mockery.runtimeStaticObject.parseShouldReturnArgs(
                        env,
                        this,
                        methodNames,
                        new Closure(env, runtimeConverterFunctionClassConstants, "Mockery", this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "method")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object method = assignParameter(args, 0, false);
                                Object allowMockingProtectedMethods = null;
                                Object director = null;
                                Object self = null;
                                Object rm = null;
                                Object expectation = null;
                                allowMockingProtectedMethods =
                                        this.contextReferences.getCapturedValue(
                                                "allowMockingProtectedMethods");
                                self = this.contextReferences.getCapturedValue("self");
                                rm = env.callMethod(self, "mockery_getMethod", Mock.class, method);
                                if (ZVal.isTrue(rm)) {
                                    if (ZVal.isTrue(env.callMethod(rm, "isPrivate", Mock.class))) {
                                        throw ZVal.getException(
                                                env,
                                                new InvalidArgumentException(
                                                        env,
                                                        toStringR(method, env)
                                                                + "() cannot be mocked as it is a private method"));
                                    }

                                    if (ZVal.toBool(!ZVal.isTrue(allowMockingProtectedMethods))
                                            && ZVal.toBool(
                                                    env.callMethod(
                                                            rm, "isProtected", Mock.class))) {
                                        throw ZVal.getException(
                                                env,
                                                new InvalidArgumentException(
                                                        env,
                                                        toStringR(method, env)
                                                                + "() cannot be mocked as it is a protected method and mocking protected methods is not enabled for the currently used mock object. Use shouldAllowMockingProtectedMethods() to enable mocking of protected methods."));
                                    }
                                }

                                director =
                                        env.callMethod(
                                                self,
                                                "mockery_getExpectationsFor",
                                                Mock.class,
                                                method);
                                if (!ZVal.isTrue(director)) {
                                    director = new ExpectationDirector(env, method, self);
                                    env.callMethod(
                                            self,
                                            "mockery_setExpectationsFor",
                                            Mock.class,
                                            method,
                                            director);
                                }

                                expectation = new Expectation(env, self, method);
                                env.callMethod(director, "addExpectation", Mock.class, expectation);
                                return ZVal.assign(expectation);
                            }
                        }.use("allowMockingProtectedMethods", allowMockingProtectedMethods)
                                .use("self", self));
        return ZVal.assign(lastExpectation);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "something",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object allows(RuntimeEnv env, Object... args) {
        Object something = assignParameter(args, 0, true);
        if (null == something) {
            something = ZVal.newArray();
        }
        Object returnValue = null;
        Object method = null;
        if (function_is_string.f.env(env).call(something).getBool()) {
            return ZVal.assign(this.shouldReceive(env, something));
        }

        if (ZVal.isEmpty(something)) {
            return ZVal.assign(this.shouldReceive(env));
        }

        for (ZPair zpairResult729 : ZVal.getIterable(something, env, false)) {
            method = ZVal.assign(zpairResult729.getKey());
            returnValue = ZVal.assign(zpairResult729.getValue());
            env.callMethod(this.shouldReceive(env, method), "andReturn", Mock.class, returnValue);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "something",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object expects(RuntimeEnv env, Object... args) {
        Object something = assignParameter(args, 0, true);
        if (null == something) {
            something = ZVal.getNull();
        }
        if (function_is_string.f.env(env).call(something).getBool()) {
            return ZVal.assign(
                    env.callMethod(this.shouldReceive(env, something), "once", Mock.class));
        }

        return ZVal.assign(new ExpectsHigherOrderMessage(env, this));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methodNames")
    public Object shouldNotReceive(RuntimeEnv env, Object... args) {
        Object methodNames = assignParameterVarArgs(args, 0);
        Object expectation = null;
        if (ZVal.strictEqualityCheck(
                function_count.f.env(env).call(methodNames).value(), "===", 0)) {
            return ZVal.assign(new HigherOrderMessage(env, this, "shouldNotReceive"));
        }

        expectation =
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(
                                ZVal.newArray(new ZPair(0, this), new ZPair(1, "shouldReceive")),
                                methodNames)
                        .value();
        env.callMethod(expectation, "never", Mock.class);
        return ZVal.assign(expectation);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    public Object shouldAllowMockingMethod(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "_mockery_mockableMethods", env)
                .arrayAppend(env)
                .set(method);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "returnValue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object shouldIgnoreMissing(RuntimeEnv env, Object... args) {
        Object returnValue = assignParameter(args, 0, true);
        if (null == returnValue) {
            returnValue = ZVal.getNull();
        }
        this._mockery_ignoreMissing = true;
        this._mockery_defaultReturnValue = returnValue;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object asUndefined(RuntimeEnv env, Object... args) {
        this._mockery_ignoreMissing = true;
        this._mockery_defaultReturnValue = new Undefined(env);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object shouldAllowMockingProtectedMethods(RuntimeEnv env, Object... args) {
        this._mockery_allowMockingProtectedMethods = true;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object shouldDeferMissing(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.makePartial(env));
    }

    @ConvertedMethod
    public Object makePartial(RuntimeEnv env, Object... args) {
        this._mockery_deferMissing = true;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object byDefault(RuntimeEnv env, Object... args) {
        Object director = null;
        Object exps = null;
        Object exp = null;
        for (ZPair zpairResult730 : ZVal.getIterable(this._mockery_expectations, env, true)) {
            director = ZVal.assign(zpairResult730.getValue());
            exps = env.callMethod(director, "getExpectations", Mock.class);
            for (ZPair zpairResult731 : ZVal.getIterable(exps, env, true)) {
                exp = ZVal.assign(zpairResult731.getValue());
                env.callMethod(exp, "byDefault", Mock.class);
            }
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "args", typeHint = "array")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object ___args = assignParameter(args, 1, false);
        return ZVal.assign(this._mockery_handleMethodCall(env, method, ___args));
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.__call(env, "__toString", ZVal.newArray()));
    }

    @ConvertedMethod
    public Object mockery_verify(RuntimeEnv env, Object... args) {
        Object director = null;
        if (ZVal.isTrue(this._mockery_verified)) {
            return null;
        }

        if (ZVal.toBool(
                        ZVal.isset(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("_mockery_ignoreVerification")
                                        .value()))
                && ZVal.toBool(
                        ZVal.equalityCheck(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("_mockery_ignoreVerification")
                                        .value(),
                                true))) {
            return null;
        }

        this._mockery_verified = true;
        for (ZPair zpairResult732 : ZVal.getIterable(this._mockery_expectations, env, true)) {
            director = ZVal.assign(zpairResult732.getValue());
            env.callMethod(director, "verify", Mock.class);
        }

        return null;
    }

    @ConvertedMethod
    public Object mockery_thrownExceptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._mockery_thrownExceptions);
    }

    @ConvertedMethod
    public Object mockery_teardown(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    public Object mockery_allocateOrder(RuntimeEnv env, Object... args) {
        this._mockery_allocatedOrder = ZAssignment.add("+=", this._mockery_allocatedOrder, 1);
        return ZVal.assign(this._mockery_allocatedOrder);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "group")
    @ConvertedParameter(index = 1, name = "order")
    public Object mockery_setGroup(RuntimeEnv env, Object... args) {
        Object group = assignParameter(args, 0, false);
        Object order = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "_mockery_groups", env).arrayAccess(env, group).set(order);
        return null;
    }

    @ConvertedMethod
    public Object mockery_getGroups(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._mockery_groups);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "order")
    public Object mockery_setCurrentOrder(RuntimeEnv env, Object... args) {
        Object order = assignParameter(args, 0, false);
        this._mockery_currentOrder = order;
        return ZVal.assign(this._mockery_currentOrder);
    }

    @ConvertedMethod
    public Object mockery_getCurrentOrder(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._mockery_currentOrder);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "order")
    public Object mockery_validateOrder(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object order = assignParameter(args, 1, false);
        Object exception = null;
        if (ZVal.isLessThan(order, '<', this._mockery_currentOrder)) {
            exception =
                    new InvalidOrderException(
                            env,
                            "Method "
                                    + toStringR("Mock", env)
                                    + "::"
                                    + toStringR(method, env)
                                    + "()"
                                    + " called out of order: expected order "
                                    + toStringR(order, env)
                                    + ", was "
                                    + toStringR(this._mockery_currentOrder, env));
            env.callMethod(
                    env.callMethod(
                            env.callMethod(
                                    env.callMethod(exception, "setMock", Mock.class, this),
                                    "setMethodName",
                                    Mock.class,
                                    method),
                            "setExpectedOrder",
                            Mock.class,
                            order),
                    "setActualOrder",
                    Mock.class,
                    this._mockery_currentOrder);
            throw ZVal.getException(env, exception);
        }

        this.mockery_setCurrentOrder(env, order);
        return null;
    }

    @ConvertedMethod
    public Object mockery_getExpectationCount(RuntimeEnv env, Object... args) {
        Object director = null;
        Object count = null;
        count = ZVal.assign(this._mockery_expectations_count);
        for (ZPair zpairResult733 : ZVal.getIterable(this._mockery_expectations, env, true)) {
            director = ZVal.assign(zpairResult733.getValue());
            count =
                    ZAssignment.add(
                            "+=",
                            count,
                            env.callMethod(director, "getExpectationCount", Mock.class));
        }

        return ZVal.assign(count);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "director", typeHint = "Mockery\\ExpectationDirector")
    public Object mockery_setExpectationsFor(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object director = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "_mockery_expectations", env)
                .arrayAccess(env, method)
                .set(director);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    public Object mockery_getExpectationsFor(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "_mockery_expectations", env),
                env,
                method)) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "_mockery_expectations", env)
                            .arrayGet(env, method));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "args", typeHint = "array")
    public Object mockery_findExpectation(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object ___args = assignParameter(args, 1, false);
        Object director = null;
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "_mockery_expectations", env),
                env,
                method)) {
            return ZVal.assign(ZVal.getNull());
        }

        director =
                ZVal.assign(
                        new ReferenceClassProperty(this, "_mockery_expectations", env)
                                .arrayGet(env, method));
        return ZVal.assign(env.callMethod(director, "findExpectation", Mock.class, ___args));
    }

    @ConvertedMethod
    public Object mockery_getContainer(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._mockery_container);
    }

    @ConvertedMethod
    public Object mockery_getName(RuntimeEnv env, Object... args) {
        return ZVal.assign("Mock");
    }

    @ConvertedMethod
    public Object mockery_getMockableProperties(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._mockery_mockableProperties);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object __isset(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                false,
                                "===",
                                function_stripos.f.env(env).call(name, "_mockery_").value()))
                && ZVal.toBool(
                        function_method_exists
                                .f
                                .env(env)
                                .call(
                                        NamespaceGlobal.get_parent_class
                                                .env(env)
                                                .call(this)
                                                .value(),
                                        "__isset")
                                .value())) {
            return ZVal.assign(
                    ZVal.throwRuntimeException(
                            "Uncaught Error: Cannot access parent:: when current class scope has no parent"));
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object mockery_getExpectations(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._mockery_expectations);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "args", typeHint = "array")
    public Object mockery_callSubjectMethod(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object ___args = assignParameter(args, 1, false);
        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call("parent::" + toStringR(name, env), ___args)
                        .value());
    }

    @ConvertedMethod
    public Object mockery_getMockableMethods(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._mockery_mockableMethods);
    }

    @ConvertedMethod
    public Object mockery_isAnonymous(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/mockery/mockery/library/Mockery")
                        .setFile("/vendor/mockery/mockery/library/Mockery/Mock.php");
        Object interfaces = null;
        Object onlyImplementsMock = null;
        Object rfc = null;
        rfc = new ReflectionClass(env, this);
        interfaces =
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                env.callMethod(rfc, "getInterfaces", Mock.class),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Mockery",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "i")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object i = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                ZVal.strictNotEqualityCheck(
                                                        env.callMethod(i, "getName", Mock.class),
                                                        "!==",
                                                        "Stringish"));
                                    }
                                })
                        .value();
        onlyImplementsMock =
                ZVal.equalityCheck(1, function_count.f.env(env).call(interfaces).value());
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        false,
                                        "===",
                                        env.callMethod(rfc, "getParentClass", Mock.class)))
                        && ZVal.toBool(onlyImplementsMock));
    }

    @ConvertedMethod
    public Object __wakeup(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    public Object __destruct(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object mockery_getMethod(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object method = null;
        for (ZPair zpairResult734 : ZVal.getIterable(this.mockery_getMethods(env), env, true)) {
            method = ZVal.assign(zpairResult734.getValue());
            if (ZVal.equalityCheck(env.callMethod(method, "getName", Mock.class), name)) {
                return ZVal.assign(method);
            }
        }

        return ZVal.assign(ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object mockery_returnValueForMethod(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/mockery/mockery/library/Mockery")
                        .setFile("/vendor/mockery/mockery/library/Mockery/Mock.php");
        Object name = assignParameter(args, 0, false);
        Object generator = null;
        Object rm = null;
        Object type = null;
        Object returnType = null;
        if (ZVal.isLessThan(
                NamespaceGlobal.version_compare.env(env).call("7.2.11-dev", "7.0.0-dev").value(),
                '<',
                0)) {
            return null;
        }

        rm = this.mockery_getMethod(env, name);
        if (ZVal.toBool(!ZVal.isTrue(rm))
                || ZVal.toBool(!ZVal.isTrue(env.callMethod(rm, "hasReturnType", Mock.class)))) {
            return null;
        }

        returnType = env.callMethod(rm, "getReturnType", Mock.class);
        if (ZVal.isTrue(env.callMethod(returnType, "allowsNull", Mock.class))) {
            return ZVal.assign(ZVal.getNull());
        }

        type = ZVal.assign(toStringR(returnType, env));
        SwitchEnumType35 switchVariable35 =
                ZVal.getEnum(
                        type,
                        SwitchEnumType35.DEFAULT_CASE,
                        SwitchEnumType35.STRING_,
                        "",
                        SwitchEnumType35.STRING_string,
                        "string",
                        SwitchEnumType35.STRING_int,
                        "int",
                        SwitchEnumType35.STRING_float,
                        "float",
                        SwitchEnumType35.STRING_bool,
                        "bool",
                        SwitchEnumType35.STRING_array,
                        "array",
                        SwitchEnumType35.STRING_callable,
                        "callable",
                        SwitchEnumType35.STRING_Closure,
                        "Closure",
                        SwitchEnumType35.STRING_Traversable,
                        "Traversable",
                        SwitchEnumType35.STRING_Generator,
                        "Generator",
                        SwitchEnumType35.STRING_self,
                        "self",
                        SwitchEnumType35.STRING_void,
                        "void",
                        SwitchEnumType35.STRING_object,
                        "object");
        switch (switchVariable35) {
            case STRING_:
                return null;
            case STRING_string:
                return "";
            case STRING_int:
                return 0;
            case STRING_float:
                return 0.0;
            case STRING_bool:
                return ZVal.assign(false);
            case STRING_array:
                return ZVal.assign(ZVal.newArray());
            case STRING_callable:
            case STRING_Closure:
                return ZVal.assign(
                        new Closure(env, runtimeConverterFunctionClassConstants, "Mockery", this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                return null;
                            }
                        });
            case STRING_Traversable:
            case STRING_Generator:
                generator =
                        ZVal.assign(
                                com.runtimeconverter.runtime.ZVal.notImplemented(
                                        "Eval Statement is not supported"));
                return ZVal.assign(
                        env.callFunctionDynamic(generator, new RuntimeArgsWithReferences())
                                .value());
            case STRING_self:
                return ZVal.assign(
                        Mockery.runtimeStaticObject.mock(
                                env,
                                env.callMethod(
                                        env.callMethod(rm, "getDeclaringClass", Mock.class),
                                        "getName",
                                        Mock.class)));
            case STRING_void:
                return ZVal.assign(ZVal.getNull());
            case STRING_object:
                if (ZVal.isGreaterThanOrEqualTo(
                        NamespaceGlobal.version_compare
                                .env(env)
                                .call("7.2.11-dev", "7.2.0-dev")
                                .value(),
                        ">=",
                        0)) {
                    return ZVal.assign(Mockery.runtimeStaticObject.mock(env));
                }

            case DEFAULT_CASE:
                return ZVal.assign(Mockery.runtimeStaticObject.mock(env, type));
        }
        ;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "method",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "args",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object shouldHaveReceived(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, true);
        if (null == method) {
            method = ZVal.getNull();
        }
        Object ___args = assignParameter(args, 1, true);
        if (null == ___args) {
            ___args = ZVal.getNull();
        }
        Object director = null;
        Object expectation = null;
        if (ZVal.strictEqualityCheck(method, "===", ZVal.getNull())) {
            return ZVal.assign(new HigherOrderMessage(env, this, "shouldHaveReceived"));
        }

        expectation = new VerificationExpectation(env, this, method);
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", ___args)) {
            env.callMethod(expectation, "withArgs", Mock.class, ___args);
        }

        env.callMethod(env.callMethod(expectation, "atLeast", Mock.class), "once", Mock.class);
        director =
                new VerificationDirector(
                        env, this._mockery_getReceivedMethodCalls(env), expectation);
        this._mockery_expectations_count = ZVal.increment(this._mockery_expectations_count);
        env.callMethod(director, "verify", Mock.class);
        return ZVal.assign(director);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "method",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "args",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object shouldNotHaveReceived(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, true);
        if (null == method) {
            method = ZVal.getNull();
        }
        Object ___args = assignParameter(args, 1, true);
        if (null == ___args) {
            ___args = ZVal.getNull();
        }
        Object director = null;
        Object expectation = null;
        if (ZVal.strictEqualityCheck(method, "===", ZVal.getNull())) {
            return ZVal.assign(new HigherOrderMessage(env, this, "shouldNotHaveReceived"));
        }

        expectation = new VerificationExpectation(env, this, method);
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", ___args)) {
            env.callMethod(expectation, "withArgs", Mock.class, ___args);
        }

        env.callMethod(expectation, "never", Mock.class);
        director =
                new VerificationDirector(
                        env, this._mockery_getReceivedMethodCalls(env), expectation);
        this._mockery_expectations_count = ZVal.increment(this._mockery_expectations_count);
        env.callMethod(director, "verify", Mock.class);
        return ZVal.assign(ZVal.getNull());
    }

    @ConvertedMethod
    protected Object _mockery_getReceivedMethodCalls(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isTrue(ternaryExpressionTemp = this._mockery_receivedMethodCalls)
                        ? ternaryExpressionTemp
                        : (this._mockery_receivedMethodCalls = new ReceivedMethodCalls(env)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    protected Object _mockery_findExpectedMethodHandler(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        ReferenceContainer lowerCasedMockeryExpectations = new BasicReferenceContainer(null);
        Object lowerCasedMethod = null;
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "_mockery_expectations", env),
                env,
                method)) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "_mockery_expectations", env)
                            .arrayGet(env, method));
        }

        lowerCasedMockeryExpectations.setObject(
                function_array_change_key_case
                        .f
                        .env(env)
                        .call(this._mockery_expectations, 0)
                        .value());
        lowerCasedMethod = NamespaceGlobal.strtolower.env(env).call(method).value();
        if (arrayActionR(ArrayAction.ISSET, lowerCasedMockeryExpectations, env, lowerCasedMethod)) {
            return ZVal.assign(lowerCasedMockeryExpectations.arrayGet(env, lowerCasedMethod));
        }

        return ZVal.assign(ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "args", typeHint = "array")
    protected Object _mockery_handleMethodCall(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object ___args = assignParameter(args, 1, false);
        Object handler = null;
        Object re = null;
        Object bmce = null;
        Object e = null;
        Object rm = null;
        Object message = null;
        Object prototype = null;
        env.callMethod(
                this._mockery_getReceivedMethodCalls(env),
                "push",
                Mock.class,
                new MethodCall(env, method, ___args));
        rm = this.mockery_getMethod(env, method);
        if (ZVal.toBool(
                        ZVal.toBool(rm)
                                && ZVal.toBool(env.callMethod(rm, "isProtected", Mock.class)))
                && ZVal.toBool(!ZVal.isTrue(this._mockery_allowMockingProtectedMethods))) {
            if (ZVal.isTrue(env.callMethod(rm, "isAbstract", Mock.class))) {
                return null;
            }

            try {
                prototype = env.callMethod(rm, "getPrototype", Mock.class);
                if (ZVal.isTrue(env.callMethod(prototype, "isAbstract", Mock.class))) {
                    return null;
                }

            } catch (ConvertedException convertedException86) {
                if (convertedException86.instanceOf(
                        ReflectionException.class, "ReflectionException")) {
                    re = convertedException86.getObject();
                } else {
                    throw convertedException86;
                }
            }

            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call("parent::" + toStringR(method, env), ___args)
                            .value());
        }

        handler = this._mockery_findExpectedMethodHandler(env, method);
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(handler, "!==", ZVal.getNull()))
                && ZVal.toBool(!ZVal.isTrue(this._mockery_disableExpectationMatching))) {
            try {
                return ZVal.assign(env.callMethod(handler, "call", Mock.class, ___args));
            } catch (ConvertedException convertedException87) {
                if (convertedException87.instanceOf(
                        NoMatchingExpectationException.class,
                        "Mockery\\Exception\\NoMatchingExpectationException")) {
                    e = convertedException87.getObject();
                    if (ZVal.toBool(!ZVal.isTrue(this._mockery_ignoreMissing))
                            && ZVal.toBool(!ZVal.isTrue(this._mockery_deferMissing))) {
                        throw ZVal.getException(env, e);
                    }

                } else {
                    throw convertedException87;
                }
            }
        }

        if (ZVal.toBool(!function_is_null.f.env(env).call(this._mockery_partial).getBool())
                && ZVal.toBool(
                        function_method_exists
                                .f
                                .env(env)
                                .call(this._mockery_partial, method)
                                .value())) {
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    ZVal.newArray(
                                            new ZPair(0, this._mockery_partial),
                                            new ZPair(1, method)),
                                    ___args)
                            .value());

        } else if (ZVal.toBool(
                        ZVal.toBool(this._mockery_deferMissing)
                                && ZVal.toBool(
                                        function_is_callable
                                                .f
                                                .env(env)
                                                .call("parent::" + toStringR(method, env))
                                                .value()))
                && ZVal.toBool(
                        ZVal.toBool(!ZVal.isTrue(this.hasMethodOverloadingInParentClass(env)))
                                || ZVal.toBool(
                                        function_method_exists
                                                .f
                                                .env(env)
                                                .call(
                                                        NamespaceGlobal.get_parent_class
                                                                .env(env)
                                                                .call(this)
                                                                .value(),
                                                        method)
                                                .value()))) {
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call("parent::" + toStringR(method, env), ___args)
                            .value());

        } else if (ZVal.equalityCheck(method, "__toString")) {
            return ZVal.assign(
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "%s#%s",
                                    "Mock",
                                    NamespaceGlobal.spl_object_hash.env(env).call(this).value())
                            .value());

        } else if (ZVal.isTrue(this._mockery_ignoreMissing)) {
            if (ZVal.toBool(
                            env.callMethod(
                                    Mockery.runtimeStaticObject.getConfiguration(env),
                                    "mockingNonExistentMethodsAllowed",
                                    Mock.class))
                    || ZVal.toBool(
                            ZVal.toBool(
                                            function_method_exists
                                                    .f
                                                    .env(env)
                                                    .call(this._mockery_partial, method)
                                                    .value())
                                    || ZVal.toBool(
                                            function_is_callable
                                                    .f
                                                    .env(env)
                                                    .call("parent::" + toStringR(method, env))
                                                    .value()))) {
                if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                this._mockery_defaultReturnValue,
                                Undefined.class,
                                "Mockery\\Undefined"))) {
                    return ZVal.assign(
                            function_call_user_func_array
                                    .f
                                    .env(env)
                                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                    .call(
                                            ZVal.newArray(
                                                    new ZPair(0, this._mockery_defaultReturnValue),
                                                    new ZPair(1, method)),
                                            ___args)
                                    .value());

                } else if (ZVal.strictEqualityCheck(
                        ZVal.getNull(), "===", this._mockery_defaultReturnValue)) {
                    return ZVal.assign(this.mockery_returnValueForMethod(env, method));
                }

                return ZVal.assign(this._mockery_defaultReturnValue);
            }
        }

        message =
                "Method "
                        + toStringR("Mock", env)
                        + "::"
                        + toStringR(method, env)
                        + "() does not exist on this mock object";
        if (!function_is_null.f.env(env).call(rm).getBool()) {
            message =
                    "Received "
                            + toStringR("Mock", env)
                            + "::"
                            + toStringR(method, env)
                            + "(), but no expectations were specified";
        }

        bmce = new BadMethodCallException(env, message);
        new ReferenceClassProperty(this, "_mockery_thrownExceptions", env)
                .arrayAppend(env)
                .set(bmce);
        throw ZVal.getException(env, bmce);
    }

    @ConvertedMethod
    protected Object mockery_getMethods(RuntimeEnv env, Object... args) {
        Object reflected = null;
        if (ZVal.toBool(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Mockery
                                                .classes
                                                .Mock
                                                .RequestStaticProperties
                                                .class)
                                ._mockery_methods)
                && ZVal.toBool(
                        env.callMethod(
                                Mockery.runtimeStaticObject.getConfiguration(env),
                                "reflectionCacheEnabled",
                                Mock.class))) {
            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Mockery
                                            .classes
                                            .Mock
                                            .RequestStaticProperties
                                            .class)
                            ._mockery_methods);
        }

        if (ZVal.isset(this._mockery_partial)) {
            reflected = new ReflectionObject(env, this._mockery_partial);

        } else {
            reflected = new ReflectionClass(env, this);
        }

        return ZVal.assign(
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Mockery
                                                .classes
                                                .Mock
                                                .RequestStaticProperties
                                                .class)
                                ._mockery_methods =
                        env.callMethod(reflected, "getMethods", Mock.class));
    }

    @ConvertedMethod
    private Object hasMethodOverloadingInParentClass(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_is_callable
                        .f
                        .env(env)
                        .call("parent::aFunctionNameThatNoOneWouldEverUseInRealLife12345")
                        .value());
    }

    @ConvertedMethod
    private Object getNonPublicMethods(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/mockery/mockery/library/Mockery")
                        .setFile("/vendor/mockery/mockery/library/Mockery/Mock.php");
        return ZVal.assign(
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Mockery",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "method")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object method = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                env.callMethod(method, "getName", Mock.class));
                                    }
                                },
                                function_array_filter
                                        .f
                                        .env(env)
                                        .call(
                                                this.mockery_getMethods(env),
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Mockery",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(index = 0, name = "method")
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object method =
                                                                assignParameter(args, 0, false);
                                                        return ZVal.assign(
                                                                !ZVal.isTrue(
                                                                        env.callMethod(
                                                                                method,
                                                                                "isPublic",
                                                                                Mock.class)));
                                                    }
                                                })
                                        .value())
                        .value());
    }

    public static final Object CONST_class = "Mockery\\Mock";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "method")
        @ConvertedParameter(index = 1, name = "args", typeHint = "array")
        public Object __callStatic(RuntimeEnv env, Object... args) {
            Object method = assignParameter(args, 0, false);
            Object ___args = assignParameter(args, 1, false);
            return ZVal.assign(
                    runtimeStaticObject._mockery_handleStaticMethodCall(env, method, ___args));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "method")
        @ConvertedParameter(index = 1, name = "args", typeHint = "array")
        protected Object _mockery_handleStaticMethodCall(RuntimeEnv env, Object... args) {
            Object method = assignParameter(args, 0, false);
            Object ___args = assignParameter(args, 1, false);
            Object associatedRealObject = null;
            Object e = null;
            associatedRealObject = Mockery.runtimeStaticObject.fetchMock(env, "Mock");
            try {
                return ZVal.assign(
                        env.callMethod(
                                associatedRealObject, "__call", Mock.class, method, ___args));
            } catch (ConvertedException convertedException88) {
                if (convertedException88.instanceOf(
                        BadMethodCallException.class,
                        "Mockery\\Exception\\BadMethodCallException")) {
                    e = convertedException88.getObject();
                    throw ZVal.getException(
                            env,
                            new BadMethodCallException(
                                    env,
                                    "Static method "
                                            + toStringR(
                                                    env.callMethod(
                                                            associatedRealObject,
                                                            "mockery_getName",
                                                            Mock.class),
                                                    env)
                                            + "::"
                                            + toStringR(method, env)
                                            + "() does not exist on this mock object",
                                    ZVal.getNull(),
                                    e));
                } else {
                    throw convertedException88;
                }
            }
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object _mockery_methods = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Mockery\\Mock")
                    .setLookup(
                            Mock.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "_mockery_allocatedOrder",
                            "_mockery_allowMockingProtectedMethods",
                            "_mockery_container",
                            "_mockery_currentOrder",
                            "_mockery_defaultReturnValue",
                            "_mockery_deferMissing",
                            "_mockery_disableExpectationMatching",
                            "_mockery_expectations",
                            "_mockery_expectations_count",
                            "_mockery_groups",
                            "_mockery_ignoreMissing",
                            "_mockery_mockableMethods",
                            "_mockery_mockableProperties",
                            "_mockery_name",
                            "_mockery_partial",
                            "_mockery_receivedMethodCalls",
                            "_mockery_thrownExceptions",
                            "_mockery_verified")
                    .setStaticPropertyNames("_mockery_methods")
                    .setFilename("vendor/mockery/mockery/library/Mockery/Mock.php")
                    .addInterface("Mockery\\MockInterface")
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

    private enum SwitchEnumType35 {
        STRING_,
        STRING_string,
        STRING_int,
        STRING_float,
        STRING_bool,
        STRING_array,
        STRING_callable,
        STRING_Closure,
        STRING_Traversable,
        STRING_Generator,
        STRING_self,
        STRING_void,
        STRING_object,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
