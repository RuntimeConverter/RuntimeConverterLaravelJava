package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Bus.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Queue.classes.Factory;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.ServiceProvider;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Bus.classes.QueueingDispatcher;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Bus/BusServiceProvider.php

*/

public class BusServiceProvider extends ServiceProvider {

    public BusServiceProvider(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.defer = true;
        if (this.getClass() == BusServiceProvider.class) {
            this.__construct(env, args);
        }
    }

    public BusServiceProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object register(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Bus")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Bus/BusServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                BusServiceProvider.class,
                com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Illuminate
                        .namespaces
                        .Bus
                        .classes
                        .Dispatcher
                        .CONST_class,
                new Closure(env, runtimeConverterFunctionClassConstants, "Illuminate\\Bus", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ContextConstants runtimeConverterFunctionClassConstants =
                                new ContextConstants()
                                        .setDir("/vendor/laravel/framework/src/Illuminate/Bus")
                                        .setFile(
                                                "/vendor/laravel/framework/src/Illuminate/Bus/BusServiceProvider.php");
                        Object app = assignParameter(args, 0, false);
                        return ZVal.assign(
                                new com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Illuminate
                                        .namespaces
                                        .Bus
                                        .classes
                                        .Dispatcher(
                                        env,
                                        app,
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Illuminate\\Bus",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            @ConvertedParameter(
                                                index = 0,
                                                name = "connection",
                                                defaultValue = "NULL",
                                                defaultValueType = "constant"
                                            )
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                Object connection = assignParameter(args, 0, true);
                                                if (null == connection) {
                                                    connection = ZVal.getNull();
                                                }
                                                ReferenceContainer app =
                                                        new BasicReferenceContainer(null);
                                                app =
                                                        this.contextReferences
                                                                .getReferenceContainer("app");
                                                return ZVal.assign(
                                                        env.callMethod(
                                                                app.arrayGet(
                                                                        env, Factory.CONST_class),
                                                                "connection",
                                                                BusServiceProvider.class,
                                                                connection));
                                            }
                                        }.use("app", app)));
                    }
                });
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "alias",
                BusServiceProvider.class,
                com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Illuminate
                        .namespaces
                        .Bus
                        .classes
                        .Dispatcher
                        .CONST_class,
                com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Illuminate
                        .namespaces
                        .Contracts
                        .namespaces
                        .Bus
                        .classes
                        .Dispatcher
                        .CONST_class);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "alias",
                BusServiceProvider.class,
                com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Illuminate
                        .namespaces
                        .Bus
                        .classes
                        .Dispatcher
                        .CONST_class,
                QueueingDispatcher.CONST_class);
        return null;
    }

    @ConvertedMethod
    public Object provides(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                0,
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Illuminate
                                        .namespaces
                                        .Bus
                                        .classes
                                        .Dispatcher
                                        .CONST_class),
                        new ZPair(
                                1,
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Illuminate
                                        .namespaces
                                        .Contracts
                                        .namespaces
                                        .Bus
                                        .classes
                                        .Dispatcher
                                        .CONST_class),
                        new ZPair(2, QueueingDispatcher.CONST_class)));
    }

    public static final Object CONST_class = "Illuminate\\Bus\\BusServiceProvider";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ServiceProvider.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Bus\\BusServiceProvider")
                    .setLookup(
                            BusServiceProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "defer", "defer")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Bus/BusServiceProvider.php")
                    .addExtendsClass("Illuminate\\Support\\ServiceProvider")
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
