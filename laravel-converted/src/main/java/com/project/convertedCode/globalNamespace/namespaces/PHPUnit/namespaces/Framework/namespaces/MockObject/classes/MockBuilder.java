package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes;

import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.Generator;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/MockObject/MockBuilder.php

*/

public class MockBuilder extends RuntimeClassBase {

    public Object testCase = null;

    public Object type = null;

    public Object methods = ZVal.newArray();

    public Object methodsExcept = ZVal.newArray();

    public Object mockClassName = "";

    public Object constructorArgs = ZVal.newArray();

    public Object originalConstructor = true;

    public Object originalClone = true;

    public Object autoload = true;

    public Object cloneArguments = false;

    public Object callOriginalMethods = false;

    public Object proxyTarget = null;

    public Object allowMockingUnknownTypes = true;

    public Object returnValueGeneration = true;

    public Object generator = null;

    public MockBuilder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MockBuilder.class) {
            this.__construct(env, args);
        }
    }

    public MockBuilder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "testCase", typeHint = "PHPUnit\\Framework\\TestCase")
    @ConvertedParameter(index = 1, name = "type")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object testCase = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, false);
        this.testCase = testCase;
        this.type = type;
        this.generator = new Generator(env);
        return null;
    }

    @ConvertedMethod
    public Object getMock(RuntimeEnv env, Object... args) {
        Object _object = null;
        _object =
                env.callMethod(
                        this.generator,
                        "getMock",
                        MockBuilder.class,
                        this.type,
                        this.methods,
                        this.constructorArgs,
                        this.mockClassName,
                        this.originalConstructor,
                        this.originalClone,
                        this.autoload,
                        this.cloneArguments,
                        this.callOriginalMethods,
                        this.proxyTarget,
                        this.allowMockingUnknownTypes,
                        this.returnValueGeneration);
        env.callMethod(this.testCase, "registerMockObject", MockBuilder.class, _object);
        return ZVal.assign(_object);
    }

    @ConvertedMethod
    public Object getMockForAbstractClass(RuntimeEnv env, Object... args) {
        Object _object = null;
        _object =
                env.callMethod(
                        this.generator,
                        "getMockForAbstractClass",
                        MockBuilder.class,
                        this.type,
                        this.constructorArgs,
                        this.mockClassName,
                        this.originalConstructor,
                        this.originalClone,
                        this.autoload,
                        this.methods,
                        this.cloneArguments);
        env.callMethod(this.testCase, "registerMockObject", MockBuilder.class, _object);
        return ZVal.assign(_object);
    }

    @ConvertedMethod
    public Object getMockForTrait(RuntimeEnv env, Object... args) {
        Object _object = null;
        _object =
                env.callMethod(
                        this.generator,
                        "getMockForTrait",
                        MockBuilder.class,
                        this.type,
                        this.constructorArgs,
                        this.mockClassName,
                        this.originalConstructor,
                        this.originalClone,
                        this.autoload,
                        this.methods,
                        this.cloneArguments);
        env.callMethod(this.testCase, "registerMockObject", MockBuilder.class, _object);
        return ZVal.assign(_object);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "methods",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setMethods(RuntimeEnv env, Object... args) {
        Object methods = assignParameter(args, 0, true);
        if (null == methods) {
            methods = ZVal.getNull();
        }
        this.methods = methods;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "methods",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object setMethodsExcept(RuntimeEnv env, Object... args) {
        Object methods = assignParameter(args, 0, true);
        if (null == methods) {
            methods = ZVal.newArray();
        }
        this.methodsExcept = methods;
        this.setMethods(
                env,
                function_array_diff
                        .f
                        .env(env)
                        .call(
                                env.callMethod(
                                        this.generator,
                                        "getClassMethods",
                                        MockBuilder.class,
                                        this.type),
                                this.methodsExcept)
                        .value());
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args", typeHint = "array")
    public Object setConstructorArgs(RuntimeEnv env, Object... args) {
        Object ___args = assignParameter(args, 0, false);
        this.constructorArgs = ___args;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object setMockClassName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        this.mockClassName = name;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object disableOriginalConstructor(RuntimeEnv env, Object... args) {
        this.originalConstructor = false;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object enableOriginalConstructor(RuntimeEnv env, Object... args) {
        this.originalConstructor = true;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object disableOriginalClone(RuntimeEnv env, Object... args) {
        this.originalClone = false;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object enableOriginalClone(RuntimeEnv env, Object... args) {
        this.originalClone = true;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object disableAutoload(RuntimeEnv env, Object... args) {
        this.autoload = false;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object enableAutoload(RuntimeEnv env, Object... args) {
        this.autoload = true;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object disableArgumentCloning(RuntimeEnv env, Object... args) {
        this.cloneArguments = false;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object enableArgumentCloning(RuntimeEnv env, Object... args) {
        this.cloneArguments = true;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object enableProxyingToOriginalMethods(RuntimeEnv env, Object... args) {
        this.callOriginalMethods = true;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object disableProxyingToOriginalMethods(RuntimeEnv env, Object... args) {
        this.callOriginalMethods = false;
        this.proxyTarget = ZVal.getNull();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "object")
    public Object setProxyTarget(RuntimeEnv env, Object... args) {
        Object _object = assignParameter(args, 0, false);
        this.proxyTarget = _object;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object allowMockingUnknownTypes(RuntimeEnv env, Object... args) {
        this.allowMockingUnknownTypes = true;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object disallowMockingUnknownTypes(RuntimeEnv env, Object... args) {
        this.allowMockingUnknownTypes = false;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object enableAutoReturnValueGeneration(RuntimeEnv env, Object... args) {
        this.returnValueGeneration = true;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object disableAutoReturnValueGeneration(RuntimeEnv env, Object... args) {
        this.returnValueGeneration = false;
        return ZVal.assign(this);
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\MockObject\\MockBuilder";

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
                    .setName("PHPUnit\\Framework\\MockObject\\MockBuilder")
                    .setLookup(
                            MockBuilder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "allowMockingUnknownTypes",
                            "autoload",
                            "callOriginalMethods",
                            "cloneArguments",
                            "constructorArgs",
                            "generator",
                            "methods",
                            "methodsExcept",
                            "mockClassName",
                            "originalClone",
                            "originalConstructor",
                            "proxyTarget",
                            "returnValueGeneration",
                            "testCase",
                            "type")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/MockObject/MockBuilder.php")
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
