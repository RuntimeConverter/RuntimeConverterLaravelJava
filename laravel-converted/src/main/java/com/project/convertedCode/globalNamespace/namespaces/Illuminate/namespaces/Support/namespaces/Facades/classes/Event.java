package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Facade;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Testing.namespaces.Fakes.classes.EventFake;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.Model;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/Facades/Event.php

*/

public class Event extends Facade {

    public Event(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Event(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Illuminate\\Support\\Facades\\Event";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Facade.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "eventsToFake",
            defaultValue = "",
            defaultValueType = "array"
        )
        public Object fake(RuntimeEnv env, Object... args) {
            Object eventsToFake = assignParameter(args, 0, true);
            if (null == eventsToFake) {
                eventsToFake = ZVal.newArray();
            }
            Object fake = null;
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Event.class)
                    .method("swap")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            fake =
                                    new EventFake(
                                            env,
                                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                                            env, this, Event.class)
                                                    .method("getFacadeRoot")
                                                    .call()
                                                    .value(),
                                            eventsToFake))
                    .value();
            Model.runtimeStaticObject.setEventDispatcher(env, fake);
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "callable", typeHint = "callable")
        @ConvertedParameter(
            index = 1,
            name = "eventsToFake",
            typeHint = "array",
            defaultValue = "",
            defaultValueType = "array"
        )
        public Object fakeFor(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Support/Facades")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Support/Facades/Event.php");
            Object callable = assignParameter(args, 0, false);
            Object eventsToFake = assignParameter(args, 1, true);
            if (null == eventsToFake) {
                eventsToFake = ZVal.newArray();
            }
            Object originalDispatcher = null;
            originalDispatcher =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Event.class)
                            .method("getFacadeRoot")
                            .call()
                            .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Event.class)
                    .method("fake")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(eventsToFake)
                    .value();
            return ZVal.assign(
                    tap.f
                            .env(env)
                            .call(
                                    env.callFunctionDynamic(
                                                    callable, new RuntimeArgsWithReferences())
                                            .value(),
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Illuminate\\Support\\Facades",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            ReferenceContainer originalDispatcher =
                                                    new BasicReferenceContainer(null);
                                            originalDispatcher =
                                                    this.contextReferences.getReferenceContainer(
                                                            "originalDispatcher");
                                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                                            env,
                                                            Event.RuntimeStaticCompanion.this,
                                                            Event.class)
                                                    .method("swap")
                                                    .addReferenceArgs(
                                                            new RuntimeArgsWithReferences()
                                                                    .add(0, originalDispatcher))
                                                    .call(originalDispatcher.getObject())
                                                    .value();
                                            Model.runtimeStaticObject.setEventDispatcher(
                                                    env, originalDispatcher.getObject());
                                            return null;
                                        }
                                    }.use("originalDispatcher", originalDispatcher))
                            .value());
        }

        @ConvertedMethod
        protected Object getFacadeAccessor(RuntimeEnv env, Object... args) {
            return "events";
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Support\\Facades\\Event")
                    .setLookup(
                            Event.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Support/Facades/Event.php")
                    .addExtendsClass("Illuminate\\Support\\Facades\\Facade")
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
