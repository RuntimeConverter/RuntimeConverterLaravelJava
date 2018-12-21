package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.classes.Mockery;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.classes.MockInterface;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/Facades/Facade.php

*/

public abstract class Facade extends RuntimeClassBase {

    public Facade(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Facade(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Illuminate\\Support\\Facades\\Facade";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object spy(RuntimeEnv env, Object... args) {
            Object _pClass = null;
            if (!ZVal.isTrue(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Facade.class)
                            .method("isMock")
                            .call()
                            .value())) {
                _pClass =
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Facade.class)
                                .method("getMockableClass")
                                .call()
                                .value();
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Facade.class)
                        .method("swap")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                ZVal.isTrue(_pClass)
                                        ? Mockery.runtimeStaticObject.spy(env, _pClass)
                                        : Mockery.runtimeStaticObject.spy(env))
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        public Object shouldReceive(RuntimeEnv env, Object... args) {
            Object name = null;
            Object mock = null;
            name =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Facade.class)
                            .method("getFacadeAccessor")
                            .call()
                            .value();
            mock =
                    ZVal.assign(
                            ZVal.isTrue(
                                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                                            env, this, Facade.class)
                                                    .method("isMock")
                                                    .call()
                                                    .value())
                                    ? env.getRequestStaticPropertiesReference(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Illuminate
                                                            .namespaces
                                                            .Support
                                                            .namespaces
                                                            .Facades
                                                            .classes
                                                            .Facade
                                                            .RequestStaticProperties
                                                            .class,
                                                    "resolvedInstance")
                                            .arrayGet(env, name)
                                    : StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Facade.class)
                                            .method("createFreshMockInstance")
                                            .call()
                                            .value());
            return ZVal.assign(
                    env.callMethod(
                            mock,
                            "shouldReceive",
                            Facade.class,
                            PackedVaradicArgs.unpack(
                                    new PackedVaradicArgs(
                                            function_func_get_args
                                                    .f
                                                    .env(env)
                                                    .addReferenceArgs(
                                                            new RuntimeArgsWithInfo(args, this))
                                                    .call()
                                                    .value()))));
        }

        @ConvertedMethod
        protected Object createFreshMockInstance(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Support/Facades")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Support/Facades/Facade.php");
            return ZVal.assign(
                    tap.f
                            .env(env)
                            .call(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Facade.class)
                                            .method("createMock")
                                            .call()
                                            .value(),
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Illuminate\\Support\\Facades",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(index = 0, name = "mock")
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            ReferenceContainer mock =
                                                    new BasicReferenceContainer(
                                                            assignParameter(args, 0, false));
                                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                                            env,
                                                            Facade.RuntimeStaticCompanion.this,
                                                            Facade.class)
                                                    .method("swap")
                                                    .addReferenceArgs(
                                                            new RuntimeArgsWithReferences()
                                                                    .add(0, mock))
                                                    .call(mock.getObject())
                                                    .value();
                                            env.callMethod(
                                                    mock.getObject(),
                                                    "shouldAllowMockingProtectedMethods",
                                                    Facade.class);
                                            return null;
                                        }
                                    })
                            .value());
        }

        @ConvertedMethod
        protected Object createMock(RuntimeEnv env, Object... args) {
            Object _pClass = null;
            _pClass =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Facade.class)
                            .method("getMockableClass")
                            .call()
                            .value();
            return ZVal.assign(
                    ZVal.isTrue(_pClass)
                            ? Mockery.runtimeStaticObject.mock(env, _pClass)
                            : Mockery.runtimeStaticObject.mock(env));
        }

        @ConvertedMethod
        protected Object isMock(RuntimeEnv env, Object... args) {
            Object name = null;
            name =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Facade.class)
                            .method("getFacadeAccessor")
                            .call()
                            .value();
            return ZVal.assign(
                    ZVal.toBool(
                                    arrayActionR(
                                            ArrayAction.ISSET,
                                            env.getRequestStaticPropertiesReference(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Illuminate
                                                            .namespaces
                                                            .Support
                                                            .namespaces
                                                            .Facades
                                                            .classes
                                                            .Facade
                                                            .RequestStaticProperties
                                                            .class,
                                                    "resolvedInstance"),
                                            env,
                                            name))
                            && ZVal.toBool(
                                    ZVal.checkInstanceType(
                                            env.getRequestStaticPropertiesReference(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .Illuminate
                                                                    .namespaces
                                                                    .Support
                                                                    .namespaces
                                                                    .Facades
                                                                    .classes
                                                                    .Facade
                                                                    .RequestStaticProperties
                                                                    .class,
                                                            "resolvedInstance")
                                                    .arrayGet(env, name),
                                            MockInterface.class,
                                            "Mockery\\MockInterface")));
        }

        @ConvertedMethod
        protected Object getMockableClass(RuntimeEnv env, Object... args) {
            Object root = null;
            if (ZVal.isTrue(
                    root =
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Facade.class)
                                    .method("getFacadeRoot")
                                    .call()
                                    .value())) {
                return ZVal.assign(function_get_class.f.env(env).call(root).value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "instance")
        public Object swap(RuntimeEnv env, Object... args) {
            Object instance = assignParameter(args, 0, false);
            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Illuminate
                                    .namespaces
                                    .Support
                                    .namespaces
                                    .Facades
                                    .classes
                                    .Facade
                                    .RequestStaticProperties
                                    .class,
                            "resolvedInstance")
                    .arrayAccess(
                            env,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Facade.class)
                                    .method("getFacadeAccessor")
                                    .call()
                                    .value())
                    .set(instance);
            if (ZVal.isset(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Support
                                            .namespaces
                                            .Facades
                                            .classes
                                            .Facade
                                            .RequestStaticProperties
                                            .class)
                            .app)) {
                env.callMethod(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Support
                                                .namespaces
                                                .Facades
                                                .classes
                                                .Facade
                                                .RequestStaticProperties
                                                .class)
                                .app,
                        "instance",
                        Facade.class,
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Facade.class)
                                .method("getFacadeAccessor")
                                .call()
                                .value(),
                        instance);
            }

            return null;
        }

        @ConvertedMethod
        public Object getFacadeRoot(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Facade.class)
                            .method("resolveFacadeInstance")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Facade.class)
                                            .method("getFacadeAccessor")
                                            .call()
                                            .value())
                            .value());
        }

        @ConvertedMethod
        protected Object getFacadeAccessor(RuntimeEnv env, Object... args) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env, "Facade does not implement getFacadeAccessor method."));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        protected Object resolveFacadeInstance(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            if (function_is_object.f.env(env).call(name).getBool()) {
                return ZVal.assign(name);
            }

            if (arrayActionR(
                    ArrayAction.ISSET,
                    env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Illuminate
                                    .namespaces
                                    .Support
                                    .namespaces
                                    .Facades
                                    .classes
                                    .Facade
                                    .RequestStaticProperties
                                    .class,
                            "resolvedInstance"),
                    env,
                    name)) {
                return ZVal.assign(
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Support
                                                .namespaces
                                                .Facades
                                                .classes
                                                .Facade
                                                .RequestStaticProperties
                                                .class,
                                        "resolvedInstance")
                                .arrayGet(env, name));
            }

            return ZVal.assign(
                    env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Support
                                            .namespaces
                                            .Facades
                                            .classes
                                            .Facade
                                            .RequestStaticProperties
                                            .class,
                                    "resolvedInstance")
                            .arrayAccess(env, name)
                            .set(
                                    env.getRequestStaticPropertiesReference(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Illuminate
                                                            .namespaces
                                                            .Support
                                                            .namespaces
                                                            .Facades
                                                            .classes
                                                            .Facade
                                                            .RequestStaticProperties
                                                            .class,
                                                    "app")
                                            .arrayGet(env, name)));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        public Object clearResolvedInstance(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            arrayActionR(
                    ArrayAction.UNSET,
                    env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Illuminate
                                    .namespaces
                                    .Support
                                    .namespaces
                                    .Facades
                                    .classes
                                    .Facade
                                    .RequestStaticProperties
                                    .class,
                            "resolvedInstance"),
                    env,
                    name);
            return null;
        }

        @ConvertedMethod
        public Object clearResolvedInstances(RuntimeEnv env, Object... args) {
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Support
                                            .namespaces
                                            .Facades
                                            .classes
                                            .Facade
                                            .RequestStaticProperties
                                            .class)
                            .resolvedInstance =
                    ZVal.newArray();
            return null;
        }

        @ConvertedMethod
        public Object getFacadeApplication(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Support
                                            .namespaces
                                            .Facades
                                            .classes
                                            .Facade
                                            .RequestStaticProperties
                                            .class)
                            .app);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "app")
        public Object setFacadeApplication(RuntimeEnv env, Object... args) {
            Object app = assignParameter(args, 0, false);
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Support
                                            .namespaces
                                            .Facades
                                            .classes
                                            .Facade
                                            .RequestStaticProperties
                                            .class)
                            .app =
                    app;
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "method")
        @ConvertedParameter(index = 1, name = "args")
        public Object __callStatic(RuntimeEnv env, Object... args) {
            Object method = assignParameter(args, 0, false);
            Object ___args = assignParameter(args, 1, false);
            Object instance = null;
            instance =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Facade.class)
                            .method("getFacadeRoot")
                            .call()
                            .value();
            if (!ZVal.isTrue(instance)) {
                throw ZVal.getException(
                        env, new RuntimeException(env, "A facade root has not been set."));
            }

            return ZVal.assign(
                    env.callMethod(
                            instance,
                            new RuntimeArgsWithReferences(),
                            toStringR(method, env),
                            Facade.class,
                            PackedVaradicArgs.unpack(new PackedVaradicArgs(___args))));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object app = null;

        public Object resolvedInstance = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Support\\Facades\\Facade")
                    .setLookup(
                            Facade.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("app", "resolvedInstance")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Support/Facades/Facade.php")
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
