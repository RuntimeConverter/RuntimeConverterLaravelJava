package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Validation.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Validation.classes.Factory;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.ServiceProvider;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Validation.classes.DatabasePresenceVerifier;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Validation/ValidationServiceProvider.php

*/

public class ValidationServiceProvider extends ServiceProvider {

    public ValidationServiceProvider(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.defer = true;
        if (this.getClass() == ValidationServiceProvider.class) {
            this.__construct(env, args);
        }
    }

    public ValidationServiceProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object register(RuntimeEnv env, Object... args) {
        this.registerPresenceVerifier(env);
        this.registerValidationFactory(env);
        return null;
    }

    @ConvertedMethod
    protected Object registerValidationFactory(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Validation")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Validation/ValidationServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                ValidationServiceProvider.class,
                "validator",
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Validation",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ReferenceContainer app =
                                new BasicReferenceContainer(assignParameter(args, 0, false));
                        Object validator = null;
                        validator =
                                new Factory(env, app.arrayGet(env, "translator"), app.getObject());
                        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, app, env, "db"))
                                && ZVal.toBool(
                                        arrayActionR(
                                                ArrayAction.ISSET,
                                                app,
                                                env,
                                                "validation.presence"))) {
                            env.callMethod(
                                    validator,
                                    "setPresenceVerifier",
                                    ValidationServiceProvider.class,
                                    app.arrayGet(env, "validation.presence"));
                        }

                        return ZVal.assign(validator);
                    }
                });
        return null;
    }

    @ConvertedMethod
    protected Object registerPresenceVerifier(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Validation")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Validation/ValidationServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                ValidationServiceProvider.class,
                "validation.presence",
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Validation",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ReferenceContainer app =
                                new BasicReferenceContainer(assignParameter(args, 0, false));
                        return ZVal.assign(
                                new DatabasePresenceVerifier(env, app.arrayGet(env, "db")));
                    }
                });
        return null;
    }

    @ConvertedMethod
    public Object provides(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.arrayFromList("validator", "validation.presence"));
    }

    public static final Object CONST_class = "Illuminate\\Validation\\ValidationServiceProvider";

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
                    .setName("Illuminate\\Validation\\ValidationServiceProvider")
                    .setLookup(
                            ValidationServiceProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "defer", "defer")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Validation/ValidationServiceProvider.php")
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
