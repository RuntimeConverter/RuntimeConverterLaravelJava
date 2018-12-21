package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/Manager.php

*/

public abstract class Manager extends RuntimeClassBase {

    public Object app = null;

    public Object customCreators = ZVal.newArray();

    public Object drivers = ZVal.newArray();

    public Manager(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Manager.class) {
            this.__construct(env, args);
        }
    }

    public Manager(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "app")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object app = assignParameter(args, 0, false);
        this.app = app;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "driver",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object driver(RuntimeEnv env, Object... args) {
        Object driver = assignParameter(args, 0, true);
        if (null == driver) {
            driver = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        driver =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = driver)
                                ? ternaryExpressionTemp
                                : env.callMethod(this, "getDefaultDriver", Manager.class));
        if (function_is_null.f.env(env).call(driver).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Unable to resolve NULL driver for [%s].",
                                            ClassConstantUtils.getConstantValueLateStatic(
                                                    env, this, "class"))
                                    .value()));
        }

        if (!arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "drivers", env), env, driver)) {
            new ReferenceClassProperty(this, "drivers", env)
                    .arrayAccess(env, driver)
                    .set(this.createDriver(env, driver));
        }

        return ZVal.assign(new ReferenceClassProperty(this, "drivers", env).arrayGet(env, driver));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "driver")
    protected Object createDriver(RuntimeEnv env, Object... args) {
        Object driver = assignParameter(args, 0, false);
        Object method = null;
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "customCreators", env),
                env,
                driver)) {
            return ZVal.assign(this.callCustomCreator(env, driver));

        } else {
            method =
                    "create"
                            + toStringR(Str.runtimeStaticObject.studly(env, driver), env)
                            + "Driver";
            if (function_method_exists.f.env(env).call(this, method).getBool()) {
                return ZVal.assign(env.callMethod(this, toStringR(method, env), Manager.class));
            }
        }

        throw ZVal.getException(
                env,
                new InvalidArgumentException(
                        env, "Driver [" + toStringR(driver, env) + "] not supported."));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "driver")
    protected Object callCustomCreator(RuntimeEnv env, Object... args) {
        Object driver = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callFunctionDynamic(
                                new ReferenceClassProperty(this, "customCreators", env)
                                        .arrayGet(env, driver),
                                new RuntimeArgsWithReferences()
                                        .add(0, new ReferenceClassProperty(this, "app", env)),
                                this.app)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "driver")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "Closure")
    public Object extend(RuntimeEnv env, Object... args) {
        Object driver = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "customCreators", env)
                .arrayAccess(env, driver)
                .set(callback);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getDrivers(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.drivers);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        this.driver(env),
                        new RuntimeArgsWithReferences(),
                        toStringR(method, env),
                        Manager.class,
                        PackedVaradicArgs.unpack(new PackedVaradicArgs(parameters))));
    }

    public static final Object CONST_class = "Illuminate\\Support\\Manager";

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
                    .setName("Illuminate\\Support\\Manager")
                    .setLookup(
                            Manager.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "customCreators", "drivers")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Support/Manager.php")
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
