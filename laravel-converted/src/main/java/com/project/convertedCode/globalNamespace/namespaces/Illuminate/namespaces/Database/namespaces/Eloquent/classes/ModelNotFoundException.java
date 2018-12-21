package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Eloquent/ModelNotFoundException.php

*/

public class ModelNotFoundException extends RuntimeException {

    public Object model = null;

    public Object ids = null;

    public ModelNotFoundException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ModelNotFoundException.class) {
            this.__construct(env, args);
        }
    }

    public ModelNotFoundException(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "model")
    @ConvertedParameter(index = 1, name = "ids", defaultValue = "", defaultValueType = "array")
    public Object setModel(RuntimeEnv env, Object... args) {
        Object model = assignParameter(args, 0, false);
        Object ids = assignParameter(args, 1, true);
        if (null == ids) {
            ids = ZVal.newArray();
        }
        this.model = model;
        this.ids = Arr.runtimeStaticObject.wrap(env, ids);
        toObjectR(this)
                .accessProp(this, env)
                .name("message")
                .set("No query results for model [" + toStringR(model, env) + "]");
        if (ZVal.isGreaterThan(function_count.f.env(env).call(this.ids).value(), '>', 0)) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("message")
                    .set(
                            toStringR(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("message")
                                                    .value(),
                                            env)
                                    + " "
                                    + toStringR(
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call(", ", this.ids)
                                                    .value(),
                                            env));

        } else {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("message")
                    .set(
                            toStringR(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("message")
                                                    .value(),
                                            env)
                                    + ".");
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getModel(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.model);
    }

    @ConvertedMethod
    public Object getIds(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.ids);
    }

    public static final Object CONST_class =
            "Illuminate\\Database\\Eloquent\\ModelNotFoundException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends RuntimeException.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Eloquent\\ModelNotFoundException")
                    .setLookup(
                            ModelNotFoundException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("ids", "model")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Eloquent/ModelNotFoundException.php")
                    .addInterface("Throwable")
                    .addExtendsClass("RuntimeException")
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
