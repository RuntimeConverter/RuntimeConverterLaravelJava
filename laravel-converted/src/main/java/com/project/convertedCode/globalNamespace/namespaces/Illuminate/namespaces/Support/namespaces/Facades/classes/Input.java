package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes;

import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Facade;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/Facades/Input.php

*/

public class Input extends Facade {

    public Input(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Input(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Illuminate\\Support\\Facades\\Input";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Facade.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "key",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 1,
            name = "default",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object get(RuntimeEnv env, Object... args) {
            Object key = assignParameter(args, 0, true);
            if (null == key) {
                key = ZVal.getNull();
            }
            Object _pDefault = assignParameter(args, 1, true);
            if (null == _pDefault) {
                _pDefault = ZVal.getNull();
            }
            return ZVal.assign(
                    env.callMethod(
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
                                                    .Input
                                                    .RequestStaticProperties
                                                    .class,
                                            "app")
                                    .arrayGet(env, "request"),
                            "input",
                            Input.class,
                            key,
                            _pDefault));
        }

        @ConvertedMethod
        protected Object getFacadeAccessor(RuntimeEnv env, Object... args) {
            return "request";
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Support\\Facades\\Input")
                    .setLookup(
                            Input.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Support/Facades/Input.php")
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
