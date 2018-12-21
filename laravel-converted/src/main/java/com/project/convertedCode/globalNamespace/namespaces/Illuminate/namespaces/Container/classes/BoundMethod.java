package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Container.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionFunction;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Container/BoundMethod.php

*/

public class BoundMethod extends RuntimeClassBase {

    public BoundMethod(RuntimeEnv env, Object... args) {
        super(env);
    }

    public BoundMethod(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Illuminate\\Container\\BoundMethod";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "container")
        @ConvertedParameter(index = 1, name = "callback")
        @ConvertedParameter(
            index = 2,
            name = "parameters",
            typeHint = "array",
            defaultValue = "",
            defaultValueType = "array"
        )
        @ConvertedParameter(
            index = 3,
            name = "defaultMethod",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object call(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Container")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Container/BoundMethod.php");
            Object container = assignParameter(args, 0, false);
            Object callback = assignParameter(args, 1, false);
            Object parameters = assignParameter(args, 2, true);
            if (null == parameters) {
                parameters = ZVal.newArray();
            }
            Object defaultMethod = assignParameter(args, 3, true);
            if (null == defaultMethod) {
                defaultMethod = ZVal.getNull();
            }
            if (ZVal.toBool(
                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                            env, this, BoundMethod.class)
                                    .method("isCallableWithAtSign")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(callback)
                                    .value())
                    || ZVal.toBool(defaultMethod)) {
                return ZVal.assign(
                        StaticMethodUtils.accessUnknownLateStaticMethod(
                                        env, this, BoundMethod.class)
                                .method("callClass")
                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                .call(container, callback, parameters, defaultMethod)
                                .value());
            }

            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, BoundMethod.class)
                            .method("callBoundMethod")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    container,
                                    callback,
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Illuminate\\Container",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            ReferenceContainer container =
                                                    new BasicReferenceContainer(null);
                                            ReferenceContainer callback =
                                                    new BasicReferenceContainer(null);
                                            ReferenceContainer parameters =
                                                    new BasicReferenceContainer(null);
                                            container =
                                                    this.contextReferences.getReferenceContainer(
                                                            "container");
                                            callback =
                                                    this.contextReferences.getReferenceContainer(
                                                            "callback");
                                            parameters =
                                                    this.contextReferences.getReferenceContainer(
                                                            "parameters");
                                            return ZVal.assign(
                                                    function_call_user_func_array
                                                            .f
                                                            .env(env)
                                                            .addReferenceArgs(
                                                                    new RuntimeArgsWithInfo(
                                                                            args, this))
                                                            .call(
                                                                    callback.getObject(),
                                                                    StaticMethodUtils
                                                                            .accessUnknownLateStaticMethod(
                                                                                    env,
                                                                                    BoundMethod
                                                                                            .RuntimeStaticCompanion
                                                                                            .this,
                                                                                    BoundMethod
                                                                                            .class)
                                                                            .method(
                                                                                    "getMethodDependencies")
                                                                            .addReferenceArgs(
                                                                                    new RuntimeArgsWithReferences()
                                                                                            .add(
                                                                                                    0,
                                                                                                    container)
                                                                                            .add(
                                                                                                    1,
                                                                                                    callback)
                                                                                            .add(
                                                                                                    2,
                                                                                                    parameters))
                                                                            .call(
                                                                                    container
                                                                                            .getObject(),
                                                                                    callback
                                                                                            .getObject(),
                                                                                    parameters
                                                                                            .getObject())
                                                                            .value())
                                                            .value());
                                        }
                                    }.use("container", container)
                                            .use("callback", callback)
                                            .use("parameters", parameters))
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "container")
        @ConvertedParameter(index = 1, name = "target")
        @ConvertedParameter(
            index = 2,
            name = "parameters",
            typeHint = "array",
            defaultValue = "",
            defaultValueType = "array"
        )
        @ConvertedParameter(
            index = 3,
            name = "defaultMethod",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        protected Object callClass(RuntimeEnv env, Object... args) {
            Object container = assignParameter(args, 0, false);
            Object target = assignParameter(args, 1, false);
            Object parameters = assignParameter(args, 2, true);
            if (null == parameters) {
                parameters = ZVal.newArray();
            }
            Object defaultMethod = assignParameter(args, 3, true);
            if (null == defaultMethod) {
                defaultMethod = ZVal.getNull();
            }
            Object method = null;
            ReferenceContainer segments = new BasicReferenceContainer(null);
            segments.setObject(function_explode.f.env(env).call("@", target).value());
            method =
                    ZVal.assign(
                            ZVal.equalityCheck(
                                            function_count
                                                    .f
                                                    .env(env)
                                                    .call(segments.getObject())
                                                    .value(),
                                            2)
                                    ? segments.arrayGet(env, 1)
                                    : defaultMethod);
            if (function_is_null.f.env(env).call(method).getBool()) {
                throw ZVal.getException(
                        env, new InvalidArgumentException(env, "Method not provided."));
            }

            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, BoundMethod.class)
                            .method("call")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    container,
                                    ZVal.newArray(
                                            new ZPair(
                                                    0,
                                                    env.callMethod(
                                                            container,
                                                            "make",
                                                            BoundMethod.class,
                                                            segments.arrayGet(env, 0))),
                                            new ZPair(1, method)),
                                    parameters)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "container")
        @ConvertedParameter(index = 1, name = "callback")
        @ConvertedParameter(index = 2, name = "default")
        protected Object callBoundMethod(RuntimeEnv env, Object... args) {
            Object container = assignParameter(args, 0, false);
            ReferenceContainer callback =
                    new BasicReferenceContainer(assignParameter(args, 1, false));
            Object _pDefault = assignParameter(args, 2, false);
            Object method = null;
            if (!function_is_array.f.env(env).call(callback.getObject()).getBool()) {
                return ZVal.assign(
                        ZVal.isTrue(ZVal.checkInstanceType(_pDefault, Closure.class, "Closure"))
                                ? env.callFunctionDynamic(
                                                _pDefault, new RuntimeArgsWithReferences())
                                        .value()
                                : _pDefault);
            }

            method =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, BoundMethod.class)
                            .method("normalizeMethod")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(callback.getObject())
                            .value();
            if (ZVal.isTrue(
                    env.callMethod(container, "hasMethodBinding", BoundMethod.class, method))) {
                return ZVal.assign(
                        env.callMethod(
                                container,
                                "callMethodBinding",
                                BoundMethod.class,
                                method,
                                callback.arrayGet(env, 0)));
            }

            return ZVal.assign(
                    ZVal.isTrue(ZVal.checkInstanceType(_pDefault, Closure.class, "Closure"))
                            ? env.callFunctionDynamic(_pDefault, new RuntimeArgsWithReferences())
                                    .value()
                            : _pDefault);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "callback")
        protected Object normalizeMethod(RuntimeEnv env, Object... args) {
            ReferenceContainer callback =
                    new BasicReferenceContainer(assignParameter(args, 0, false));
            Object _pClass = null;
            _pClass =
                    ZVal.assign(
                            function_is_string.f.env(env).call(callback.arrayGet(env, 0)).getBool()
                                    ? callback.arrayGet(env, 0)
                                    : function_get_class
                                            .f
                                            .env(env)
                                            .call(callback.arrayGet(env, 0))
                                            .value());
            return ZVal.assign(
                    toStringR(_pClass, env) + "@" + toStringR(callback.arrayGet(env, 1), env));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "container")
        @ConvertedParameter(index = 1, name = "callback")
        @ConvertedParameter(
            index = 2,
            name = "parameters",
            typeHint = "array",
            defaultValue = "",
            defaultValueType = "array"
        )
        protected Object getMethodDependencies(RuntimeEnv env, Object... args) {
            Object container = assignParameter(args, 0, false);
            Object callback = assignParameter(args, 1, false);
            ReferenceContainer parameters =
                    new BasicReferenceContainer(assignParameter(args, 2, true));
            if (null == parameters.getObject()) {
                parameters.setObject(ZVal.newArray());
            }
            Object parameter = null;
            ReferenceContainer dependencies = new BasicReferenceContainer(null);
            dependencies.setObject(ZVal.newArray());
            for (ZPair zpairResult232 :
                    ZVal.getIterable(
                            env.callMethod(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, BoundMethod.class)
                                            .method("getCallReflector")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(callback)
                                            .value(),
                                    "getParameters",
                                    BoundMethod.class),
                            env,
                            true)) {
                parameter = ZVal.assign(zpairResult232.getValue());
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, BoundMethod.class)
                        .method("addDependencyForCallParameter")
                        .addReferenceArgs(
                                new RuntimeArgsWithReferences()
                                        .add(2, parameters)
                                        .add(3, dependencies))
                        .call(
                                container,
                                parameter,
                                parameters.getObject(),
                                dependencies.getObject())
                        .value();
            }

            return ZVal.assign(
                    function_array_merge
                            .f
                            .env(env)
                            .call(dependencies.getObject(), parameters.getObject())
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "callback")
        protected Object getCallReflector(RuntimeEnv env, Object... args) {
            ReferenceContainer callback =
                    new BasicReferenceContainer(assignParameter(args, 0, false));
            if (ZVal.toBool(function_is_string.f.env(env).call(callback.getObject()).value())
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    function_strpos
                                            .f
                                            .env(env)
                                            .call(callback.getObject(), "::")
                                            .value(),
                                    "!==",
                                    false))) {
                callback.setObject(
                        function_explode.f.env(env).call("::", callback.getObject()).value());
            }

            return ZVal.assign(
                    function_is_array.f.env(env).call(callback.getObject()).getBool()
                            ? new ReflectionMethod(
                                    env, callback.arrayGet(env, 0), callback.arrayGet(env, 1))
                            : new ReflectionFunction(env, callback.getObject()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "container")
        @ConvertedParameter(index = 1, name = "parameter")
        @ConvertedParameter(index = 2, name = "parameters", typeHint = "array")
        @ConvertedParameter(index = 3, name = "dependencies")
        protected Object addDependencyForCallParameter(
                RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
            Object container = assignParameter(args, 0, false);
            Object parameter = assignParameter(args, 1, false);
            ReferenceContainer parameters =
                    assignParameterRef(runtimePassByReferenceArgs, args, 2, false);
            ReferenceContainer dependencies =
                    assignParameterRef(runtimePassByReferenceArgs, args, 3, false);
            if (function_array_key_exists
                    .f
                    .env(env)
                    .call(
                            toObjectR(parameter).accessProp(this, env).name("name").value(),
                            parameters.getObject())
                    .getBool()) {
                dependencies
                        .arrayAppend(env)
                        .set(
                                parameters.arrayGet(
                                        env,
                                        toObjectR(parameter)
                                                .accessProp(this, env)
                                                .name("name")
                                                .value()));
                arrayActionR(
                        ArrayAction.UNSET,
                        parameters,
                        env,
                        toObjectR(parameter).accessProp(this, env).name("name").value());

            } else if (ZVal.toBool(env.callMethod(parameter, "getClass", BoundMethod.class))
                    && ZVal.toBool(
                            function_array_key_exists
                                    .f
                                    .env(env)
                                    .call(
                                            toObjectR(
                                                            env.callMethod(
                                                                    parameter,
                                                                    "getClass",
                                                                    BoundMethod.class))
                                                    .accessProp(this, env)
                                                    .name("name")
                                                    .value(),
                                            parameters.getObject())
                                    .value())) {
                dependencies
                        .arrayAppend(env)
                        .set(
                                parameters.arrayGet(
                                        env,
                                        toObjectR(
                                                        env.callMethod(
                                                                parameter,
                                                                "getClass",
                                                                BoundMethod.class))
                                                .accessProp(this, env)
                                                .name("name")
                                                .value()));
                arrayActionR(
                        ArrayAction.UNSET,
                        parameters,
                        env,
                        toObjectR(env.callMethod(parameter, "getClass", BoundMethod.class))
                                .accessProp(this, env)
                                .name("name")
                                .value());

            } else if (ZVal.isTrue(env.callMethod(parameter, "getClass", BoundMethod.class))) {
                dependencies
                        .arrayAppend(env)
                        .set(
                                env.callMethod(
                                        container,
                                        "make",
                                        BoundMethod.class,
                                        toObjectR(
                                                        env.callMethod(
                                                                parameter,
                                                                "getClass",
                                                                BoundMethod.class))
                                                .accessProp(this, env)
                                                .name("name")
                                                .value()));

            } else if (ZVal.isTrue(
                    env.callMethod(parameter, "isDefaultValueAvailable", BoundMethod.class))) {
                dependencies
                        .arrayAppend(env)
                        .set(env.callMethod(parameter, "getDefaultValue", BoundMethod.class));
            }

            return null;
        }

        public Object addDependencyForCallParameter(RuntimeEnv env, Object... args) {
            throw new TemporaryStubFunctionException();
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "callback")
        protected Object isCallableWithAtSign(RuntimeEnv env, Object... args) {
            Object callback = assignParameter(args, 0, false);
            return ZVal.assign(
                    ZVal.toBool(function_is_string.f.env(env).call(callback).value())
                            && ZVal.toBool(
                                    ZVal.strictNotEqualityCheck(
                                            function_strpos.f.env(env).call(callback, "@").value(),
                                            "!==",
                                            false)));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Container\\BoundMethod")
                    .setLookup(
                            BoundMethod.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Container/BoundMethod.php")
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
