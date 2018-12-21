package com.project.convertedCode.globalNamespace.namespaces.Mockery.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.classes.Instantiator;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.classes.MockConfigurationBuilder;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_reset;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_current;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.classes.Mockery;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Exception.classes.InvalidOrderException;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Exception.classes.RuntimeException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.nativeFunctions.array.function_range;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.classes.Exception;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;
import static com.runtimeconverter.runtime.ZVal.assignParameterVarArgs;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Container.php

*/

public class Container extends RuntimeClassBase {

    public Object _mocks = ZVal.newArray();

    public Object _allocatedOrder = 0;

    public Object _currentOrder = 0;

    public Object _groups = ZVal.newArray();

    public Object _generator = null;

    public Object _loader = null;

    public Object _namedMocks = ZVal.newArray();

    public Container(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Container.class) {
            this.__construct(env, args);
        }
    }

    public Container(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "generator",
        typeHint = "Mockery\\Generator\\Generator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "loader",
        typeHint = "Mockery\\Loader\\Loader",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object generator = assignParameter(args, 0, true);
        if (null == generator) {
            generator = ZVal.getNull();
        }
        Object loader = assignParameter(args, 1, true);
        if (null == loader) {
            loader = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this._generator =
                ZVal.isTrue(ternaryExpressionTemp = generator)
                        ? ternaryExpressionTemp
                        : Mockery.runtimeStaticObject.getDefaultGenerator(env);
        this._loader =
                ZVal.isTrue(ternaryExpressionTemp = loader)
                        ? ternaryExpressionTemp
                        : Mockery.runtimeStaticObject.getDefaultLoader(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args")
    public Object mock(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        ReferenceContainer ___args = new BasicReferenceContainer(assignParameterVarArgs(args, 0));
        Object attemptAutoload = null;
        Object interfaces = null;
        Object finalArg = null;
        Object def = null;
        Object constructorArgs = null;
        Object blocks = null;
        Object k = null;
        Object rfc = null;
        Object expectationClosure = null;
        Object partialMethods = null;
        Object quickdefs = null;
        ReferenceContainer arg = new BasicReferenceContainer(null);
        Object builder = null;
        Object name = null;
        ReferenceContainer parts = new BasicReferenceContainer(null);
        ReferenceContainer mock = new BasicReferenceContainer(null);
        Object _pClass = null;
        Object partial = null;
        Object config = null;
        expectationClosure = ZVal.getNull();
        quickdefs = ZVal.newArray();
        constructorArgs = ZVal.getNull();
        blocks = ZVal.newArray();
        _pClass = ZVal.getNull();
        if (ZVal.isGreaterThan(
                function_count.f.env(env).call(___args.getObject()).value(), '>', 1)) {
            finalArg = function_end.f.env(env).call(___args.getObject()).value();
            function_reset.f.env(env).call(___args.getObject());
            if (ZVal.toBool(function_is_callable.f.env(env).call(finalArg).value())
                    && ZVal.toBool(function_is_object.f.env(env).call(finalArg).value())) {
                expectationClosure =
                        function_array_pop.f.env(env).call(___args.getObject()).value();
            }
        }

        builder = new MockConfigurationBuilder(env);
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult684 : ZVal.getIterable(___args.getObject(), env, false)) {
            k = ZVal.assign(zpairResult684.getKey());
            arg.setObject(ZVal.assign(zpairResult684.getValue()));
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            arg.getObject(),
                            MockConfigurationBuilder.class,
                            "Mockery\\Generator\\MockConfigurationBuilder"))) {
                builder = ZVal.assign(arg.getObject());
                arrayActionR(ArrayAction.UNSET, ___args, env, k);
            }
        }

        function_reset.f.env(env).call(___args.getObject());
        env.callMethod(
                builder,
                "setParameterOverrides",
                Container.class,
                env.callMethod(
                        Mockery.runtimeStaticObject.getConfiguration(env),
                        "getInternalClassMethodParamMaps",
                        Container.class));
        env.callMethod(
                builder,
                "setConstantsMap",
                Container.class,
                env.callMethod(
                        Mockery.runtimeStaticObject.getConfiguration(env),
                        "getConstantsMap",
                        Container.class));
        runtimeConverterContinueCount = 0;
        while (ZVal.isGreaterThan(
                function_count.f.env(env).call(___args.getObject()).value(), '>', 0)) {
            arg.setObject(function_current.f.env(env).call(___args.getObject()).value());
            if (ZVal.toBool(
                            ZVal.toBool(function_is_string.f.env(env).call(arg.getObject()).value())
                                    && ZVal.toBool(
                                            function_strpos
                                                    .f
                                                    .env(env)
                                                    .call(arg.getObject(), ",")
                                                    .value()))
                    && ZVal.toBool(
                            !function_strpos.f.env(env).call(arg.getObject(), "]").getBool())) {
                interfaces =
                        function_explode
                                .f
                                .env(env)
                                .call(
                                        ",",
                                        function_str_replace
                                                .f
                                                .env(env)
                                                .call(" ", "", arg.getObject())
                                                .value())
                                .value();
                env.callMethod(builder, "addTargets", Container.class, interfaces);
                function_array_shift.f.env(env).call(___args.getObject());
                continue;

            } else if (ZVal.toBool(function_is_string.f.env(env).call(arg.getObject()).value())
                    && ZVal.toBool(
                            ZVal.equalityCheck(
                                    function_substr.f.env(env).call(arg.getObject(), 0, 6).value(),
                                    "alias:"))) {
                name = function_array_shift.f.env(env).call(___args.getObject()).value();
                name = function_str_replace.f.env(env).call("alias:", "", name).value();
                env.callMethod(builder, "addTarget", Container.class, "stdClass");
                env.callMethod(builder, "setName", Container.class, name);
                continue;

            } else if (ZVal.toBool(function_is_string.f.env(env).call(arg.getObject()).value())
                    && ZVal.toBool(
                            ZVal.equalityCheck(
                                    function_substr.f.env(env).call(arg.getObject(), 0, 9).value(),
                                    "overload:"))) {
                name = function_array_shift.f.env(env).call(___args.getObject()).value();
                name = function_str_replace.f.env(env).call("overload:", "", name).value();
                env.callMethod(builder, "setInstanceMock", Container.class, true);
                env.callMethod(builder, "addTarget", Container.class, "stdClass");
                env.callMethod(builder, "setName", Container.class, name);
                continue;

            } else if (ZVal.toBool(function_is_string.f.env(env).call(arg.getObject()).value())
                    && ZVal.toBool(
                            ZVal.equalityCheck(
                                    function_substr
                                            .f
                                            .env(env)
                                            .call(
                                                    arg.getObject(),
                                                    ZVal.subtract(
                                                            function_strlen
                                                                    .f
                                                                    .env(env)
                                                                    .call(arg.getObject())
                                                                    .value(),
                                                            1),
                                                    1)
                                            .value(),
                                    "]"))) {
                parts.setObject(function_explode.f.env(env).call("[", arg.getObject()).value());
                if (ZVal.toBool(
                                !function_class_exists
                                        .f
                                        .env(env)
                                        .call(parts.arrayGet(env, 0), true)
                                        .getBool())
                        && ZVal.toBool(
                                !NamespaceGlobal.interface_exists
                                        .env(env)
                                        .call(parts.arrayGet(env, 0), true)
                                        .getBool())) {
                    throw ZVal.getException(
                            env,
                            new Exception(
                                    env,
                                    "Can only create a partial mock from"
                                            + " an existing class or interface"));
                }

                _pClass = ZVal.assign(parts.arrayGet(env, 0));
                parts.arrayAccess(env, 1)
                        .set(
                                function_str_replace
                                        .f
                                        .env(env)
                                        .call(" ", "", parts.arrayGet(env, 1))
                                        .value());
                partialMethods =
                        function_explode
                                .f
                                .env(env)
                                .call(
                                        ",",
                                        NamespaceGlobal.strtolower
                                                .env(env)
                                                .call(
                                                        function_rtrim
                                                                .f
                                                                .env(env)
                                                                .call(parts.arrayGet(env, 1), "]")
                                                                .value())
                                                .value())
                                .value();
                env.callMethod(builder, "addTarget", Container.class, _pClass);
                env.callMethod(builder, "setWhiteListedMethods", Container.class, partialMethods);
                function_array_shift.f.env(env).call(___args.getObject());
                continue;

            } else if (ZVal.toBool(function_is_string.f.env(env).call(arg.getObject()).value())
                    && ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.toBool(
                                                            function_class_exists
                                                                    .f
                                                                    .env(env)
                                                                    .call(arg.getObject(), true)
                                                                    .value())
                                                    || ZVal.toBool(
                                                            NamespaceGlobal.interface_exists
                                                                    .env(env)
                                                                    .call(arg.getObject(), true)
                                                                    .value()))
                                    || ZVal.toBool(
                                            NamespaceGlobal.trait_exists
                                                    .env(env)
                                                    .call(arg.getObject(), true)
                                                    .value()))) {
                _pClass = function_array_shift.f.env(env).call(___args.getObject()).value();
                env.callMethod(builder, "addTarget", Container.class, _pClass);
                continue;

            } else if (ZVal.toBool(
                            ZVal.toBool(function_is_string.f.env(env).call(arg.getObject()).value())
                                    && ZVal.toBool(
                                            !ZVal.isTrue(
                                                    env.callMethod(
                                                            Mockery.runtimeStaticObject
                                                                    .getConfiguration(env),
                                                            "mockingNonExistentMethodsAllowed",
                                                            Container.class))))
                    && ZVal.toBool(
                            ZVal.toBool(
                                            !function_class_exists
                                                    .f
                                                    .env(env)
                                                    .call(arg.getObject(), true)
                                                    .getBool())
                                    && ZVal.toBool(
                                            !NamespaceGlobal.interface_exists
                                                    .env(env)
                                                    .call(arg.getObject(), true)
                                                    .getBool()))) {
                throw ZVal.getException(
                        env,
                        new Exception(
                                env,
                                "Mockery can't find '"
                                        + toStringR(arg.getObject(), env)
                                        + "' so can't mock it"));

            } else if (function_is_string.f.env(env).call(arg.getObject()).getBool()) {
                if (!ZVal.isTrue(this.isValidClassName(env, arg.getObject()))) {
                    throw ZVal.getException(
                            env, new Exception(env, "Class name contains invalid characters"));
                }

                _pClass = function_array_shift.f.env(env).call(___args.getObject()).value();
                env.callMethod(builder, "addTarget", Container.class, _pClass);
                continue;

            } else if (function_is_object.f.env(env).call(arg.getObject()).getBool()) {
                partial = function_array_shift.f.env(env).call(___args.getObject()).value();
                env.callMethod(builder, "addTarget", Container.class, partial);
                continue;

            } else if (ZVal.toBool(
                            ZVal.toBool(function_is_array.f.env(env).call(arg.getObject()).value())
                                    && ZVal.toBool(!ZVal.isEmpty(arg.getObject())))
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    function_array_keys.f.env(env).call(arg.getObject()).value(),
                                    "!==",
                                    function_range
                                            .f
                                            .env(env)
                                            .call(
                                                    0,
                                                    ZVal.subtract(
                                                            function_count
                                                                    .f
                                                                    .env(env)
                                                                    .call(arg.getObject())
                                                                    .value(),
                                                            1))
                                            .value()))) {
                if (function_array_key_exists
                        .f
                        .env(env)
                        .call(CONST_BLOCKS, arg.getObject())
                        .getBool()) {
                    blocks = ZVal.assign(arg.arrayGet(env, CONST_BLOCKS));
                }

                arrayActionR(ArrayAction.UNSET, arg, env, CONST_BLOCKS);
                quickdefs = function_array_shift.f.env(env).call(___args.getObject()).value();
                continue;

            } else if (function_is_array.f.env(env).call(arg.getObject()).getBool()) {
                constructorArgs = function_array_shift.f.env(env).call(___args.getObject()).value();
                continue;
            }

            throw ZVal.getException(
                    env,
                    new Exception(
                            env,
                            "Unable to parse arguments sent to "
                                    + toStringR(
                                            function_get_class.f.env(env).call(this).value(), env)
                                    + "::mock()"));
        }

        env.callMethod(builder, "addBlackListedMethods", Container.class, blocks);
        if (ZVal.toBool(function_defined.f.env(env).call("HHVM_VERSION").value())
                && ZVal.toBool(
                        ZVal.toBool(ZVal.strictEqualityCheck(_pClass, "===", "Exception"))
                                || ZVal.toBool(
                                        NamespaceGlobal.is_subclass_of
                                                .env(env)
                                                .call(_pClass, "Exception")
                                                .value()))) {
            env.callMethod(builder, "addBlackListedMethod", Container.class, "setTraceOptions");
            env.callMethod(builder, "addBlackListedMethod", Container.class, "getTraceOptions");
        }

        if (!function_is_null.f.env(env).call(constructorArgs).getBool()) {
            env.callMethod(builder, "addBlackListedMethod", Container.class, "__construct");

        } else {
            env.callMethod(builder, "setMockOriginalDestructor", Container.class, true);
        }

        if (ZVal.toBool(!ZVal.isEmpty(partialMethods))
                && ZVal.toBool(ZVal.strictEqualityCheck(constructorArgs, "===", ZVal.getNull()))) {
            constructorArgs = ZVal.newArray();
        }

        config = env.callMethod(builder, "getMockConfiguration", Container.class);
        this.checkForNamedMockClashes(env, config);
        def = env.callMethod(this.getGenerator(env), "generate", Container.class, config);
        if (function_class_exists
                .f
                .env(env)
                .call(env.callMethod(def, "getClassName", Container.class), attemptAutoload = false)
                .getBool()) {
            rfc = new ReflectionClass(env, env.callMethod(def, "getClassName", Container.class));
            if (!ZVal.isTrue(
                    env.callMethod(
                            rfc,
                            "implementsInterface",
                            Container.class,
                            "Mockery\\MockInterface"))) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                "Could not load mock "
                                        + toStringR(
                                                env.callMethod(
                                                        def, "getClassName", Container.class),
                                                env)
                                        + ", class already exists"));
            }
        }

        env.callMethod(this.getLoader(env), "load", Container.class, def);
        mock.setObject(
                this._getInstance(
                        env,
                        env.callMethod(def, "getClassName", Container.class),
                        constructorArgs));
        env.callMethod(
                mock.getObject(),
                "mockery_init",
                Container.class,
                this,
                env.callMethod(config, "getTargetObject", Container.class));
        if (!ZVal.isEmpty(quickdefs)) {
            env.callMethod(
                    env.callMethod(mock.getObject(), "shouldReceive", Container.class, quickdefs),
                    "byDefault",
                    Container.class);
        }

        if (!ZVal.isEmpty(expectationClosure)) {
            env.callFunctionDynamic(
                    expectationClosure,
                    new RuntimeArgsWithReferences().add(0, mock),
                    mock.getObject());
        }

        this.rememberMock(env, mock.getObject());
        return ZVal.assign(mock.getObject());
    }

    @ConvertedMethod
    public Object instanceMock(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    public Object getLoader(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._loader);
    }

    @ConvertedMethod
    public Object getGenerator(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._generator);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parent")
    public Object getKeyOfDemeterMockFor(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object parent = assignParameter(args, 1, false);
        ReferenceContainer res = new BasicReferenceContainer(null);
        Object keys = null;
        Object match = null;
        keys = function_array_keys.f.env(env).call(this._mocks).value();
        match =
                NamespaceGlobal.preg_grep
                        .env(env)
                        .call(
                                "/__demeter_"
                                        + toStringR(
                                                NamespaceGlobal.md5.env(env).call(parent).value(),
                                                env)
                                        + toStringR("_" + toStringR(method, env) + "$/", env),
                                keys)
                        .value();
        if (ZVal.equalityCheck(function_count.f.env(env).call(match).value(), 1)) {
            res.setObject(function_array_values.f.env(env).call(match).value());
            if (ZVal.isGreaterThan(
                    function_count.f.env(env).call(res.getObject()).value(), '>', 0)) {
                return ZVal.assign(res.arrayGet(env, 0));
            }
        }

        return ZVal.assign(ZVal.getNull());
    }

    @ConvertedMethod
    public Object getMocks(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._mocks);
    }

    @ConvertedMethod
    public Object mockery_teardown(RuntimeEnv env, Object... args) {
        Object e = null;
        try {
            this.mockery_verify(env);
        } catch (ConvertedException convertedException81) {
            if (convertedException81.instanceOf(PHPException.class, "Exception")) {
                e = convertedException81.getObject();
                this.mockery_close(env);
                throw ZVal.getException(env, e);
            } else {
                throw convertedException81;
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object mockery_verify(RuntimeEnv env, Object... args) {
        Object mock = null;
        for (ZPair zpairResult685 : ZVal.getIterable(this._mocks, env, true)) {
            mock = ZVal.assign(zpairResult685.getValue());
            env.callMethod(mock, "mockery_verify", Container.class);
        }

        return null;
    }

    @ConvertedMethod
    public Object mockery_thrownExceptions(RuntimeEnv env, Object... args) {
        Object e = null;
        Object mock = null;
        e = ZVal.newArray();
        for (ZPair zpairResult686 : ZVal.getIterable(this._mocks, env, true)) {
            mock = ZVal.assign(zpairResult686.getValue());
            e =
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    e,
                                    env.callMethod(
                                            mock, "mockery_thrownExceptions", Container.class))
                            .value();
        }

        return ZVal.assign(e);
    }

    @ConvertedMethod
    public Object mockery_close(RuntimeEnv env, Object... args) {
        Object mock = null;
        for (ZPair zpairResult687 : ZVal.getIterable(this._mocks, env, true)) {
            mock = ZVal.assign(zpairResult687.getValue());
            env.callMethod(mock, "mockery_teardown", Container.class);
        }

        this._mocks = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    public Object mockery_allocateOrder(RuntimeEnv env, Object... args) {
        this._allocatedOrder = ZAssignment.add("+=", this._allocatedOrder, 1);
        return ZVal.assign(this._allocatedOrder);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "group")
    @ConvertedParameter(index = 1, name = "order")
    public Object mockery_setGroup(RuntimeEnv env, Object... args) {
        Object group = assignParameter(args, 0, false);
        Object order = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "_groups", env).arrayAccess(env, group).set(order);
        return null;
    }

    @ConvertedMethod
    public Object mockery_getGroups(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._groups);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "order")
    public Object mockery_setCurrentOrder(RuntimeEnv env, Object... args) {
        Object order = assignParameter(args, 0, false);
        this._currentOrder = order;
        return ZVal.assign(this._currentOrder);
    }

    @ConvertedMethod
    public Object mockery_getCurrentOrder(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._currentOrder);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "order")
    @ConvertedParameter(index = 2, name = "mock", typeHint = "Mockery\\MockInterface")
    public Object mockery_validateOrder(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object order = assignParameter(args, 1, false);
        Object mock = assignParameter(args, 2, false);
        Object exception = null;
        if (ZVal.isLessThan(order, '<', this._currentOrder)) {
            exception =
                    new InvalidOrderException(
                            env,
                            "Method "
                                    + toStringR(method, env)
                                    + " called out of order: expected order "
                                    + toStringR(order, env)
                                    + ", was "
                                    + toStringR(this._currentOrder, env));
            env.callMethod(
                    env.callMethod(
                            env.callMethod(
                                    env.callMethod(exception, "setMock", Container.class, mock),
                                    "setMethodName",
                                    Container.class,
                                    method),
                            "setExpectedOrder",
                            Container.class,
                            order),
                    "setActualOrder",
                    Container.class,
                    this._currentOrder);
            throw ZVal.getException(env, exception);
        }

        this.mockery_setCurrentOrder(env, order);
        return null;
    }

    @ConvertedMethod
    public Object mockery_getExpectationCount(RuntimeEnv env, Object... args) {
        Object count = null;
        Object mock = null;
        count = 0;
        for (ZPair zpairResult688 : ZVal.getIterable(this._mocks, env, true)) {
            mock = ZVal.assign(zpairResult688.getValue());
            count =
                    ZAssignment.add(
                            "+=",
                            count,
                            env.callMethod(mock, "mockery_getExpectationCount", Container.class));
        }

        return ZVal.assign(count);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mock", typeHint = "Mockery\\MockInterface")
    public Object rememberMock(RuntimeEnv env, Object... args) {
        Object mock = assignParameter(args, 0, false);
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "_mocks", env),
                env,
                function_get_class.f.env(env).call(mock).value())) {
            new ReferenceClassProperty(this, "_mocks", env)
                    .arrayAccess(env, function_get_class.f.env(env).call(mock).value())
                    .set(mock);

        } else {
            new ReferenceClassProperty(this, "_mocks", env).arrayAppend(env).set(mock);
        }

        return ZVal.assign(mock);
    }

    @ConvertedMethod
    public Object self(RuntimeEnv env, Object... args) {
        Object index = null;
        ReferenceContainer mocks = new BasicReferenceContainer(null);
        mocks.setObject(function_array_values.f.env(env).call(this._mocks).value());
        index = ZVal.subtract(function_count.f.env(env).call(mocks.getObject()).value(), 1);
        return ZVal.assign(mocks.arrayGet(env, index));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reference")
    public Object fetchMock(RuntimeEnv env, Object... args) {
        Object reference = assignParameter(args, 0, false);
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "_mocks", env),
                env,
                reference)) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "_mocks", env).arrayGet(env, reference));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mockName")
    @ConvertedParameter(
        index = 1,
        name = "constructorArgs",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object _getInstance(RuntimeEnv env, Object... args) {
        Object mockName = assignParameter(args, 0, false);
        Object constructorArgs = assignParameter(args, 1, true);
        if (null == constructorArgs) {
            constructorArgs = ZVal.getNull();
        }
        Object r = null;
        Object instance = null;
        Object ex = null;
        Object internalMockName = null;
        Object instantiator = null;
        if (ZVal.strictNotEqualityCheck(constructorArgs, "!==", ZVal.getNull())) {
            r = new ReflectionClass(env, mockName);
            return ZVal.assign(
                    env.callMethod(r, "newInstanceArgs", Container.class, constructorArgs));
        }

        try {
            instantiator = new Instantiator(env);
            instance = env.callMethod(instantiator, "instantiate", Container.class, mockName);
        } catch (ConvertedException convertedException82) {
            if (convertedException82.instanceOf(PHPException.class, "Exception")) {
                ex = convertedException82.getObject();
                internalMockName = toStringR(mockName, env) + "_Internal";
                if (!function_class_exists.f.env(env).call(internalMockName).getBool()) {
                    com.runtimeconverter.runtime.ZVal.notImplemented(
                            "Eval Statement is not supported");
                }

                instance = env.createNew(internalMockName);
            } else {
                throw convertedException82;
            }
        }

        return ZVal.assign(instance);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config")
    protected Object checkForNamedMockClashes(RuntimeEnv env, Object... args) {
        Object config = assignParameter(args, 0, false);
        Object name = null;
        Object hash = null;
        name = env.callMethod(config, "getName", Container.class);
        if (!ZVal.isTrue(name)) {
            return null;
        }

        hash = env.callMethod(config, "getHash", Container.class);
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "_namedMocks", env),
                env,
                name)) {
            if (ZVal.strictNotEqualityCheck(
                    hash,
                    "!==",
                    new ReferenceClassProperty(this, "_namedMocks", env).arrayGet(env, name))) {
                throw ZVal.getException(
                        env,
                        new Exception(
                                env,
                                "The mock named '"
                                        + toStringR(name, env)
                                        + "' has been already defined with a different mock configuration"));
            }
        }

        new ReferenceClassProperty(this, "_namedMocks", env).arrayAccess(env, name).set(hash);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className")
    public Object isValidClassName(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/mockery/mockery/library/Mockery")
                        .setFile("/vendor/mockery/mockery/library/Mockery/Container.php");
        Object className = assignParameter(args, 0, false);
        Object pos = null;
        Object invalidNames = null;
        pos = function_strpos.f.env(env).call(className, "\\").value();
        if (ZVal.strictEqualityCheck(pos, "===", 0)) {
            className = function_substr.f.env(env).call(className, 1).value();
        }

        invalidNames =
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                function_explode.f.env(env).call("\\", className).value(),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Mockery",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "name")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object name = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                !function_preg_match
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "/^[a-zA-Z_\\x7f-\\xff][a-zA-Z0-9_\\x7f-\\xff]*$/",
                                                                name)
                                                        .getBool());
                                    }
                                })
                        .value();
        return ZVal.isEmpty(invalidNames);
    }

    public static final Object CONST_BLOCKS = Mockery.CONST_BLOCKS;

    public static final Object CONST_class = "Mockery\\Container";

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
                    .setName("Mockery\\Container")
                    .setLookup(
                            Container.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "_allocatedOrder",
                            "_currentOrder",
                            "_generator",
                            "_groups",
                            "_loader",
                            "_mocks",
                            "_namedMocks")
                    .setFilename("vendor/mockery/mockery/library/Mockery/Container.php")
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
