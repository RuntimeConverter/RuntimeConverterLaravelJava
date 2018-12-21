package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.classes;

import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reduce;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.classes.UndefinedTargetClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.classes.DefinedTargetClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.classes.Exception;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Generator/MockConfiguration.php

*/

public class MockConfiguration extends RuntimeClassBase {

    public Object targetClass = null;

    public Object targetClassName = null;

    public Object targetInterfaces = ZVal.newArray();

    public Object targetInterfaceNames = ZVal.newArray();

    public Object targetTraits = ZVal.newArray();

    public Object targetTraitNames = ZVal.newArray();

    public Object targetObject = null;

    public Object name = null;

    public Object blackListedMethods = ZVal.newArray();

    public Object whiteListedMethods = ZVal.newArray();

    public Object instanceMock = false;

    public Object parameterOverrides = ZVal.newArray();

    public Object allMethods = null;

    public Object mockOriginalDestructor = false;

    public Object constantsMap = ZVal.newArray();

    public MockConfiguration(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MockConfiguration.class) {
            this.__construct(env, args);
        }
    }

    public MockConfiguration(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "targets",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 1,
        name = "blackListedMethods",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "whiteListedMethods",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 3,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "instanceMock",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "parameterOverrides",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 6,
        name = "mockOriginalDestructor",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 7,
        name = "constantsMap",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object targets = assignParameter(args, 0, true);
        if (null == targets) {
            targets = ZVal.newArray();
        }
        Object blackListedMethods = assignParameter(args, 1, true);
        if (null == blackListedMethods) {
            blackListedMethods = ZVal.newArray();
        }
        Object whiteListedMethods = assignParameter(args, 2, true);
        if (null == whiteListedMethods) {
            whiteListedMethods = ZVal.newArray();
        }
        Object name = assignParameter(args, 3, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object instanceMock = assignParameter(args, 4, true);
        if (null == instanceMock) {
            instanceMock = false;
        }
        Object parameterOverrides = assignParameter(args, 5, true);
        if (null == parameterOverrides) {
            parameterOverrides = ZVal.newArray();
        }
        Object mockOriginalDestructor = assignParameter(args, 6, true);
        if (null == mockOriginalDestructor) {
            mockOriginalDestructor = false;
        }
        Object constantsMap = assignParameter(args, 7, true);
        if (null == constantsMap) {
            constantsMap = ZVal.newArray();
        }
        this.addTargets(env, targets);
        this.blackListedMethods = blackListedMethods;
        this.whiteListedMethods = whiteListedMethods;
        this.name = name;
        this.instanceMock = instanceMock;
        this.parameterOverrides = parameterOverrides;
        this.mockOriginalDestructor = mockOriginalDestructor;
        this.constantsMap = constantsMap;
        return null;
    }

    @ConvertedMethod
    public Object getHash(RuntimeEnv env, Object... args) {
        Object vars = null;
        vars =
                ZVal.newArray(
                        new ZPair("targetClassName", this.targetClassName),
                        new ZPair("targetInterfaceNames", this.targetInterfaceNames),
                        new ZPair("targetTraitNames", this.targetTraitNames),
                        new ZPair("name", this.name),
                        new ZPair("blackListedMethods", this.blackListedMethods),
                        new ZPair("whiteListedMethod", this.whiteListedMethods),
                        new ZPair("instanceMock", this.instanceMock),
                        new ZPair("parameterOverrides", this.parameterOverrides),
                        new ZPair("mockOriginalDestructor", this.mockOriginalDestructor));
        return ZVal.assign(
                NamespaceGlobal.md5
                        .env(env)
                        .call(function_serialize.f.env(env).call(vars).value())
                        .value());
    }

    @ConvertedMethod
    public Object getMethodsToMock(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/mockery/mockery/library/Mockery/Generator")
                        .setFile(
                                "/vendor/mockery/mockery/library/Mockery/Generator/MockConfiguration.php");
        Object method = null;
        ReferenceContainer methods = new BasicReferenceContainer(null);
        Object blacklist = null;
        Object whitelist = null;
        Object key = null;
        methods.setObject(this.getAllMethods(env));
        for (ZPair zpairResult699 : ZVal.getIterable(methods.getObject(), env, false)) {
            key = ZVal.assign(zpairResult699.getKey());
            method = ZVal.assign(zpairResult699.getValue());
            if (ZVal.isTrue(env.callMethod(method, "isFinal", MockConfiguration.class))) {
                arrayActionR(ArrayAction.UNSET, methods, env, key);
            }
        }

        if (function_count.f.env(env).call(this.getWhiteListedMethods(env)).getBool()) {
            whitelist =
                    function_array_map
                            .f
                            .env(env)
                            .call("strtolower", this.getWhiteListedMethods(env))
                            .value();
            methods.setObject(
                    function_array_filter
                            .f
                            .env(env)
                            .call(
                                    methods.getObject(),
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Mockery\\Generator",
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
                                            Object whitelist = null;
                                            whitelist =
                                                    this.contextReferences.getCapturedValue(
                                                            "whitelist");
                                            return ZVal.assign(
                                                    ZVal.toBool(
                                                                    env.callMethod(
                                                                            method,
                                                                            "isAbstract",
                                                                            MockConfiguration
                                                                                    .class))
                                                            || ZVal.toBool(
                                                                    function_in_array
                                                                            .f
                                                                            .env(env)
                                                                            .call(
                                                                                    NamespaceGlobal
                                                                                            .strtolower
                                                                                            .env(
                                                                                                    env)
                                                                                            .call(
                                                                                                    env
                                                                                                            .callMethod(
                                                                                                                    method,
                                                                                                                    "getName",
                                                                                                                    MockConfiguration
                                                                                                                            .class))
                                                                                            .value(),
                                                                                    whitelist)
                                                                            .value()));
                                        }
                                    }.use("whitelist", whitelist))
                            .value());
            return ZVal.assign(methods.getObject());
        }

        if (function_count.f.env(env).call(this.getBlackListedMethods(env)).getBool()) {
            blacklist =
                    function_array_map
                            .f
                            .env(env)
                            .call("strtolower", this.getBlackListedMethods(env))
                            .value();
            methods.setObject(
                    function_array_filter
                            .f
                            .env(env)
                            .call(
                                    methods.getObject(),
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Mockery\\Generator",
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
                                            Object blacklist = null;
                                            blacklist =
                                                    this.contextReferences.getCapturedValue(
                                                            "blacklist");
                                            return ZVal.assign(
                                                    !function_in_array
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    NamespaceGlobal.strtolower
                                                                            .env(env)
                                                                            .call(
                                                                                    env.callMethod(
                                                                                            method,
                                                                                            "getName",
                                                                                            MockConfiguration
                                                                                                    .class))
                                                                            .value(),
                                                                    blacklist)
                                                            .getBool());
                                        }
                                    }.use("blacklist", blacklist))
                            .value());
        }

        if (ZVal.toBool(
                        ZVal.toBool(this.getTargetClass(env))
                                && ZVal.toBool(
                                        env.callMethod(
                                                this.getTargetClass(env),
                                                "implementsInterface",
                                                MockConfiguration.class,
                                                "Serializable")))
                && ZVal.toBool(
                        env.callMethod(
                                this.getTargetClass(env),
                                "hasInternalAncestor",
                                MockConfiguration.class))) {
            methods.setObject(
                    function_array_filter
                            .f
                            .env(env)
                            .call(
                                    methods.getObject(),
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Mockery\\Generator",
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
                                                    ZVal.strictNotEqualityCheck(
                                                            env.callMethod(
                                                                    method,
                                                                    "getName",
                                                                    MockConfiguration.class),
                                                            "!==",
                                                            "unserialize"));
                                        }
                                    })
                            .value());
        }

        return ZVal.assign(function_array_values.f.env(env).call(methods.getObject()).value());
    }

    @ConvertedMethod
    public Object requiresCallTypeHintRemoval(RuntimeEnv env, Object... args) {
        Object method = null;
        ReferenceContainer params = new BasicReferenceContainer(null);
        for (ZPair zpairResult700 : ZVal.getIterable(this.getAllMethods(env), env, true)) {
            method = ZVal.assign(zpairResult700.getValue());
            if (ZVal.strictEqualityCheck(
                    "__call", "===", env.callMethod(method, "getName", MockConfiguration.class))) {
                params.setObject(env.callMethod(method, "getParameters", MockConfiguration.class));
                return ZVal.assign(
                        !ZVal.isTrue(
                                env.callMethod(
                                        params.arrayGet(env, 1),
                                        "isArray",
                                        MockConfiguration.class)));
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object requiresCallStaticTypeHintRemoval(RuntimeEnv env, Object... args) {
        Object method = null;
        ReferenceContainer params = new BasicReferenceContainer(null);
        for (ZPair zpairResult701 : ZVal.getIterable(this.getAllMethods(env), env, true)) {
            method = ZVal.assign(zpairResult701.getValue());
            if (ZVal.strictEqualityCheck(
                    "__callStatic",
                    "===",
                    env.callMethod(method, "getName", MockConfiguration.class))) {
                params.setObject(env.callMethod(method, "getParameters", MockConfiguration.class));
                return ZVal.assign(
                        !ZVal.isTrue(
                                env.callMethod(
                                        params.arrayGet(env, 1),
                                        "isArray",
                                        MockConfiguration.class)));
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className")
    public Object rename(RuntimeEnv env, Object... args) {
        Object className = assignParameter(args, 0, false);
        ReferenceContainer targets = new BasicReferenceContainer(null);
        targets.setObject(ZVal.newArray());
        if (ZVal.isTrue(this.targetClassName)) {
            targets.arrayAppend(env).set(this.targetClassName);
        }

        if (ZVal.isTrue(this.targetInterfaceNames)) {
            targets.setObject(
                    function_array_merge
                            .f
                            .env(env)
                            .call(targets.getObject(), this.targetInterfaceNames)
                            .value());
        }

        if (ZVal.isTrue(this.targetTraitNames)) {
            targets.setObject(
                    function_array_merge
                            .f
                            .env(env)
                            .call(targets.getObject(), this.targetTraitNames)
                            .value());
        }

        if (ZVal.isTrue(this.targetObject)) {
            targets.arrayAppend(env).set(this.targetObject);
        }

        return ZVal.assign(
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Mockery
                        .namespaces
                        .Generator
                        .classes
                        .MockConfiguration(
                        env,
                        targets.getObject(),
                        this.blackListedMethods,
                        this.whiteListedMethods,
                        className,
                        this.instanceMock,
                        this.parameterOverrides,
                        this.mockOriginalDestructor,
                        this.constantsMap));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "target")
    protected Object addTarget(RuntimeEnv env, Object... args) {
        ReferenceContainer target = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (function_is_object.f.env(env).call(target.getObject()).getBool()) {
            this.setTargetObject(env, target.getObject());
            this.setTargetClassName(
                    env, function_get_class.f.env(env).call(target.getObject()).value());
            return ZVal.assign(this);
        }

        if (ZVal.strictNotEqualityCheck(target.arrayGet(env, 0), "!==", "\\")) {
            target.setObject("\\" + toStringR(target.getObject(), env));
        }

        if (function_class_exists.f.env(env).call(target.getObject()).getBool()) {
            this.setTargetClassName(env, target.getObject());
            return ZVal.assign(this);
        }

        if (NamespaceGlobal.interface_exists.env(env).call(target.getObject()).getBool()) {
            this.addTargetInterfaceName(env, target.getObject());
            return ZVal.assign(this);
        }

        if (NamespaceGlobal.trait_exists.env(env).call(target.getObject()).getBool()) {
            this.addTargetTraitName(env, target.getObject());
            return ZVal.assign(this);
        }

        if (ZVal.isTrue(this.getTargetClassName(env))) {
            this.addTargetInterfaceName(env, target.getObject());
            return ZVal.assign(this);
        }

        this.setTargetClassName(env, target.getObject());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "interfaces")
    protected Object addTargets(RuntimeEnv env, Object... args) {
        Object interfaces = assignParameter(args, 0, false);
        Object _pInterface = null;
        for (ZPair zpairResult702 : ZVal.getIterable(interfaces, env, true)) {
            _pInterface = ZVal.assign(zpairResult702.getValue());
            this.addTarget(env, _pInterface);
        }

        return null;
    }

    @ConvertedMethod
    public Object getTargetClassName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.targetClassName);
    }

    @ConvertedMethod
    public Object getTargetClass(RuntimeEnv env, Object... args) {
        Object dtc = null;
        if (ZVal.isTrue(this.targetClass)) {
            return ZVal.assign(this.targetClass);
        }

        if (!ZVal.isTrue(this.targetClassName)) {
            return ZVal.assign(ZVal.getNull());
        }

        if (function_class_exists.f.env(env).call(this.targetClassName).getBool()) {
            dtc = DefinedTargetClass.runtimeStaticObject.factory(env, this.targetClassName);
            if (ZVal.toBool(ZVal.equalityCheck(this.getTargetObject(env), false))
                    && ZVal.toBool(env.callMethod(dtc, "isFinal", MockConfiguration.class))) {
                throw ZVal.getException(
                        env,
                        new Exception(
                                env,
                                "The class "
                                        + toStringR(this.targetClassName, env)
                                        + " is marked final and its methods"
                                        + " cannot be replaced. Classes marked final can be passed in"
                                        + " to \\Mockery::mock() as instantiated objects to create a"
                                        + " partial mock, but only if the mock is not subject to type"
                                        + " hinting checks."));
            }

            this.targetClass = dtc;

        } else {
            this.targetClass =
                    UndefinedTargetClass.runtimeStaticObject.factory(env, this.targetClassName);
        }

        return ZVal.assign(this.targetClass);
    }

    @ConvertedMethod
    public Object getTargetTraits(RuntimeEnv env, Object... args) {
        Object targetTrait = null;
        if (!ZVal.isEmpty(this.targetTraits)) {
            return ZVal.assign(this.targetTraits);
        }

        for (ZPair zpairResult703 : ZVal.getIterable(this.targetTraitNames, env, true)) {
            targetTrait = ZVal.assign(zpairResult703.getValue());
            new ReferenceClassProperty(this, "targetTraits", env)
                    .arrayAppend(env)
                    .set(DefinedTargetClass.runtimeStaticObject.factory(env, targetTrait));
        }

        this.targetTraits = function_array_unique.f.env(env).call(this.targetTraits).value();
        return ZVal.assign(this.targetTraits);
    }

    @ConvertedMethod
    public Object getTargetInterfaces(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object dtc = null;
        Object traversableFound = null;
        Object targetInterface = null;
        ReferenceContainer extendedInterfaces = new BasicReferenceContainer(null);
        Object _pInterface = null;
        Object iteratorShiftedToFront = null;
        if (!ZVal.isEmpty(this.targetInterfaces)) {
            return ZVal.assign(this.targetInterfaces);
        }

        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult704 : ZVal.getIterable(this.targetInterfaceNames, env, true)) {
            targetInterface = ZVal.assign(zpairResult704.getValue());
            if (!NamespaceGlobal.interface_exists.env(env).call(targetInterface).getBool()) {
                new ReferenceClassProperty(this, "targetInterfaces", env)
                        .arrayAppend(env)
                        .set(
                                UndefinedTargetClass.runtimeStaticObject.factory(
                                        env, targetInterface));
                return null;
            }

            dtc = DefinedTargetClass.runtimeStaticObject.factory(env, targetInterface);
            extendedInterfaces.setObject(
                    function_array_keys
                            .f
                            .env(env)
                            .call(env.callMethod(dtc, "getInterfaces", MockConfiguration.class))
                            .value());
            extendedInterfaces.arrayAppend(env).set(targetInterface);
            traversableFound = false;
            iteratorShiftedToFront = false;
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult705 :
                    ZVal.getIterable(extendedInterfaces.getObject(), env, true)) {
                _pInterface = ZVal.assign(zpairResult705.getValue());
                if (ZVal.toBool(!ZVal.isTrue(traversableFound))
                        && ZVal.toBool(
                                function_preg_match
                                        .f
                                        .env(env)
                                        .call("/^\\?Iterator(|Aggregate)$/i", _pInterface)
                                        .value())) {
                    break;
                }

                if (function_preg_match
                        .f
                        .env(env)
                        .call("/^\\\\?IteratorAggregate$/i", _pInterface)
                        .getBool()) {
                    new ReferenceClassProperty(this, "targetInterfaces", env)
                            .arrayAppend(env)
                            .set(
                                    DefinedTargetClass.runtimeStaticObject.factory(
                                            env, "\\IteratorAggregate"));
                    iteratorShiftedToFront = true;

                } else if (function_preg_match
                        .f
                        .env(env)
                        .call("/^\\\\?Iterator$/i", _pInterface)
                        .getBool()) {
                    new ReferenceClassProperty(this, "targetInterfaces", env)
                            .arrayAppend(env)
                            .set(DefinedTargetClass.runtimeStaticObject.factory(env, "\\Iterator"));
                    iteratorShiftedToFront = true;

                } else if (function_preg_match
                        .f
                        .env(env)
                        .call("/^\\\\?Traversable$/i", _pInterface)
                        .getBool()) {
                    traversableFound = true;
                }
            }

            if (ZVal.toBool(traversableFound)
                    && ZVal.toBool(!ZVal.isTrue(iteratorShiftedToFront))) {
                new ReferenceClassProperty(this, "targetInterfaces", env)
                        .arrayAppend(env)
                        .set(
                                DefinedTargetClass.runtimeStaticObject.factory(
                                        env, "\\IteratorAggregate"));
            }

            if (!function_preg_match
                    .f
                    .env(env)
                    .call("/^\\\\?Traversable$/i", targetInterface)
                    .getBool()) {
                new ReferenceClassProperty(this, "targetInterfaces", env).arrayAppend(env).set(dtc);
            }
        }

        this.targetInterfaces =
                function_array_unique.f.env(env).call(this.targetInterfaces).value();
        return ZVal.assign(this.targetInterfaces);
    }

    @ConvertedMethod
    public Object getTargetObject(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.targetObject);
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.name);
    }

    @ConvertedMethod
    public Object generateName(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/mockery/mockery/library/Mockery/Generator")
                        .setFile(
                                "/vendor/mockery/mockery/library/Mockery/Generator/MockConfiguration.php");
        Object name = null;
        name =
                "Mockery_"
                        + toStringR(
                                ZVal.postIncrement(
                                        env.getRequestStaticPropertiesReference(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Mockery
                                                        .namespaces
                                                        .Generator
                                                        .classes
                                                        .MockConfiguration
                                                        .RequestStaticProperties
                                                        .class,
                                                "mockCounter")),
                                env);
        if (ZVal.isTrue(this.getTargetObject(env))) {
            name =
                    toStringR(name, env)
                            + "_"
                            + toStringR(
                                    function_str_replace
                                            .f
                                            .env(env)
                                            .call(
                                                    "\\",
                                                    "_",
                                                    function_get_class
                                                            .f
                                                            .env(env)
                                                            .call(this.getTargetObject(env))
                                                            .value())
                                            .value(),
                                    env);
        }

        if (ZVal.isTrue(this.getTargetClass(env))) {
            name =
                    toStringR(name, env)
                            + "_"
                            + toStringR(
                                    function_str_replace
                                            .f
                                            .env(env)
                                            .call(
                                                    "\\",
                                                    "_",
                                                    env.callMethod(
                                                            this.getTargetClass(env),
                                                            "getName",
                                                            MockConfiguration.class))
                                            .value(),
                                    env);
        }

        if (ZVal.isTrue(this.getTargetInterfaces(env))) {
            name =
                    toStringR(name, env)
                            + toStringR(
                                    function_array_reduce
                                            .f
                                            .env(env)
                                            .call(
                                                    this.getTargetInterfaces(env),
                                                    new Closure(
                                                            env,
                                                            runtimeConverterFunctionClassConstants,
                                                            "Mockery\\Generator",
                                                            this) {
                                                        @Override
                                                        @ConvertedMethod
                                                        @ConvertedParameter(
                                                            index = 0,
                                                            name = "tmpname"
                                                        )
                                                        @ConvertedParameter(index = 1, name = "i")
                                                        public Object run(
                                                                RuntimeEnv env,
                                                                Object thisvar,
                                                                PassByReferenceArgs
                                                                        runtimePassByReferenceArgs,
                                                                Object... args) {
                                                            Object tmpname =
                                                                    assignParameter(args, 0, false);
                                                            Object i =
                                                                    assignParameter(args, 1, false);
                                                            tmpname =
                                                                    toStringR(tmpname, env)
                                                                            + "_"
                                                                            + toStringR(
                                                                                    function_str_replace
                                                                                            .f
                                                                                            .env(
                                                                                                    env)
                                                                                            .call(
                                                                                                    "\\",
                                                                                                    "_",
                                                                                                    env
                                                                                                            .callMethod(
                                                                                                                    i,
                                                                                                                    "getName",
                                                                                                                    MockConfiguration
                                                                                                                            .class))
                                                                                            .value(),
                                                                                    env);
                                                            return ZVal.assign(tmpname);
                                                        }
                                                    },
                                                    "")
                                            .value(),
                                    env);
        }

        return ZVal.assign(name);
    }

    @ConvertedMethod
    public Object getShortName(RuntimeEnv env, Object... args) {
        Object parts = null;
        parts = function_explode.f.env(env).call("\\", this.getName(env)).value();
        return ZVal.assign(function_array_pop.f.env(env).call(parts).value());
    }

    @ConvertedMethod
    public Object getNamespaceName(RuntimeEnv env, Object... args) {
        Object parts = null;
        parts = function_explode.f.env(env).call("\\", this.getName(env)).value();
        function_array_pop.f.env(env).call(parts);
        if (function_count.f.env(env).call(parts).getBool()) {
            return ZVal.assign(NamespaceGlobal.implode.env(env).call("\\", parts).value());
        }

        return "";
    }

    @ConvertedMethod
    public Object getBlackListedMethods(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.blackListedMethods);
    }

    @ConvertedMethod
    public Object getWhiteListedMethods(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.whiteListedMethods);
    }

    @ConvertedMethod
    public Object isInstanceMock(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.instanceMock);
    }

    @ConvertedMethod
    public Object getParameterOverrides(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.parameterOverrides);
    }

    @ConvertedMethod
    public Object isMockOriginalDestructor(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.mockOriginalDestructor);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "targetClassName")
    protected Object setTargetClassName(RuntimeEnv env, Object... args) {
        Object targetClassName = assignParameter(args, 0, false);
        this.targetClassName = targetClassName;
        return null;
    }

    @ConvertedMethod
    protected Object getAllMethods(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/mockery/mockery/library/Mockery/Generator")
                        .setFile(
                                "/vendor/mockery/mockery/library/Mockery/Generator/MockConfiguration.php");
        ReferenceContainer names = new BasicReferenceContainer(null);
        Object method = null;
        ReferenceContainer methods = new BasicReferenceContainer(null);
        ReferenceContainer classes = new BasicReferenceContainer(null);
        Object trait = null;
        Object _pClass = null;
        if (ZVal.isTrue(this.allMethods)) {
            return ZVal.assign(this.allMethods);
        }

        classes.setObject(this.getTargetInterfaces(env));
        if (ZVal.isTrue(this.getTargetClass(env))) {
            classes.arrayAppend(env).set(this.getTargetClass(env));
        }

        methods.setObject(ZVal.newArray());
        for (ZPair zpairResult706 : ZVal.getIterable(classes.getObject(), env, true)) {
            _pClass = ZVal.assign(zpairResult706.getValue());
            methods.setObject(
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    methods.getObject(),
                                    env.callMethod(_pClass, "getMethods", MockConfiguration.class))
                            .value());
        }

        for (ZPair zpairResult707 : ZVal.getIterable(this.getTargetTraits(env), env, true)) {
            trait = ZVal.assign(zpairResult707.getValue());
            for (ZPair zpairResult708 :
                    ZVal.getIterable(
                            env.callMethod(trait, "getMethods", MockConfiguration.class),
                            env,
                            true)) {
                method = ZVal.assign(zpairResult708.getValue());
                if (ZVal.isTrue(env.callMethod(method, "isAbstract", MockConfiguration.class))) {
                    methods.arrayAppend(env).set(method);
                }
            }
        }

        names.setObject(ZVal.newArray());
        methods.setObject(
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                methods.getObject(),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Mockery\\Generator",
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
                                        ReferenceContainer names =
                                                new BasicReferenceContainer(null);
                                        names =
                                                this.contextReferences.getReferenceContainer(
                                                        "names");
                                        if (function_in_array
                                                .f
                                                .env(env)
                                                .call(
                                                        env.callMethod(
                                                                method,
                                                                "getName",
                                                                MockConfiguration.class),
                                                        names.getObject())
                                                .getBool()) {
                                            return ZVal.assign(false);
                                        }

                                        names.arrayAppend(env)
                                                .set(
                                                        env.callMethod(
                                                                method,
                                                                "getName",
                                                                MockConfiguration.class));
                                        return ZVal.assign(true);
                                    }
                                }.useRef("names", names))
                        .value());
        return ZVal.assign(this.allMethods = methods.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "targetInterface")
    protected Object addTargetInterfaceName(RuntimeEnv env, Object... args) {
        Object targetInterface = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "targetInterfaceNames", env)
                .arrayAppend(env)
                .set(targetInterface);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "targetTraitName")
    protected Object addTargetTraitName(RuntimeEnv env, Object... args) {
        Object targetTraitName = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "targetTraitNames", env)
                .arrayAppend(env)
                .set(targetTraitName);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "object")
    protected Object setTargetObject(RuntimeEnv env, Object... args) {
        Object _object = assignParameter(args, 0, false);
        this.targetObject = _object;
        return null;
    }

    @ConvertedMethod
    public Object getConstantsMap(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.constantsMap);
    }

    public static final Object CONST_class = "Mockery\\Generator\\MockConfiguration";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object mockCounter = 0;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Mockery\\Generator\\MockConfiguration")
                    .setLookup(
                            MockConfiguration.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "allMethods",
                            "blackListedMethods",
                            "constantsMap",
                            "instanceMock",
                            "mockOriginalDestructor",
                            "name",
                            "parameterOverrides",
                            "targetClass",
                            "targetClassName",
                            "targetInterfaceNames",
                            "targetInterfaces",
                            "targetObject",
                            "targetTraitNames",
                            "targetTraits",
                            "whiteListedMethods")
                    .setStaticPropertyNames("mockCounter")
                    .setFilename(
                            "vendor/mockery/mockery/library/Mockery/Generator/MockConfiguration.php")
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
