package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.UnexpectedValueException;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Routing/RouteAction.php

*/

public class RouteAction extends RuntimeClassBase {

    public RouteAction(RuntimeEnv env, Object... args) {
        super(env);
    }

    public RouteAction(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Illuminate\\Routing\\RouteAction";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "uri")
        @ConvertedParameter(index = 1, name = "action")
        public Object parse(RuntimeEnv env, Object... args) {
            Object uri = assignParameter(args, 0, false);
            ReferenceContainer action =
                    new BasicReferenceContainer(assignParameter(args, 1, false));
            if (function_is_null.f.env(env).call(action.getObject()).getBool()) {
                return ZVal.assign(
                        StaticMethodUtils.accessUnknownLateStaticMethod(
                                        env, this, RouteAction.class)
                                .method("missingAction")
                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                .call(uri)
                                .value());
            }

            if (function_is_callable.f.env(env).call(action.getObject()).getBool()) {
                return ZVal.assign(
                        !function_is_array.f.env(env).call(action.getObject()).getBool()
                                ? ZVal.newArray(new ZPair("uses", action.getObject()))
                                : ZVal.newArray(
                                        new ZPair(
                                                "uses",
                                                toStringR(action.arrayGet(env, 0), env)
                                                        + "@"
                                                        + toStringR(action.arrayGet(env, 1), env)),
                                        new ZPair(
                                                "controller",
                                                toStringR(action.arrayGet(env, 0), env)
                                                        + "@"
                                                        + toStringR(
                                                                action.arrayGet(env, 1), env))));

            } else if (!arrayActionR(ArrayAction.ISSET, action, env, "uses")) {
                action.arrayAccess(env, "uses")
                        .set(
                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, RouteAction.class)
                                        .method("findCallable")
                                        .addReferenceArgs(new RuntimeArgsWithReferences())
                                        .call(action.getObject())
                                        .value());
            }

            if (ZVal.toBool(
                            function_is_string
                                    .f
                                    .env(env)
                                    .call(action.arrayGet(env, "uses"))
                                    .value())
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    Str.runtimeStaticObject.contains(
                                            env, action.arrayGet(env, "uses"), "@")))) {
                action.arrayAccess(env, "uses")
                        .set(
                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, RouteAction.class)
                                        .method("makeInvokable")
                                        .addReferenceArgs(new RuntimeArgsWithReferences())
                                        .call(action.arrayGet(env, "uses"))
                                        .value());
            }

            return ZVal.assign(action.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "uri")
        protected Object missingAction(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Routing/RouteAction.php");
            Object uri = assignParameter(args, 0, false);
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    "uses",
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Illuminate\\Routing",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            Object uri = null;
                                            uri = this.contextReferences.getCapturedValue("uri");
                                            throw ZVal.getException(
                                                    env,
                                                    new LogicException(
                                                            env,
                                                            "Route for ["
                                                                    + toStringR(uri, env)
                                                                    + "] has no action."));
                                        }
                                    }.use("uri", uri))));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "action", typeHint = "array")
        protected Object findCallable(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Routing/RouteAction.php");
            Object action = assignParameter(args, 0, false);
            return ZVal.assign(
                    Arr.runtimeStaticObject.first(
                            env,
                            action,
                            new Closure(
                                    env,
                                    runtimeConverterFunctionClassConstants,
                                    "Illuminate\\Routing",
                                    this) {
                                @Override
                                @ConvertedMethod
                                @ConvertedParameter(index = 0, name = "value")
                                @ConvertedParameter(index = 1, name = "key")
                                public Object run(
                                        RuntimeEnv env,
                                        Object thisvar,
                                        PassByReferenceArgs runtimePassByReferenceArgs,
                                        Object... args) {
                                    Object value = assignParameter(args, 0, false);
                                    Object key = assignParameter(args, 1, false);
                                    return ZVal.assign(
                                            ZVal.toBool(
                                                            function_is_callable
                                                                    .f
                                                                    .env(env)
                                                                    .call(value)
                                                                    .value())
                                                    && ZVal.toBool(
                                                            function_is_numeric
                                                                    .f
                                                                    .env(env)
                                                                    .call(key)
                                                                    .value()));
                                }
                            }));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "action")
        protected Object makeInvokable(RuntimeEnv env, Object... args) {
            Object action = assignParameter(args, 0, false);
            if (!function_method_exists.f.env(env).call(action, "__invoke").getBool()) {
                throw ZVal.getException(
                        env,
                        new UnexpectedValueException(
                                env, "Invalid route action: [" + toStringR(action, env) + "]."));
            }

            return ZVal.assign(toStringR(action, env) + "@__invoke");
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Routing\\RouteAction")
                    .setLookup(
                            RouteAction.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/laravel/framework/src/Illuminate/Routing/RouteAction.php")
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
