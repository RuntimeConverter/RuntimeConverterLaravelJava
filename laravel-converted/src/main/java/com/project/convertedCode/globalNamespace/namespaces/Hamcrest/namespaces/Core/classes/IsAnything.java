package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.BaseMatcher;
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

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Core/IsAnything.php

*/

public class IsAnything extends BaseMatcher {

    public Object _message = null;

    public IsAnything(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IsAnything.class) {
            this.__construct(env, args);
        }
    }

    public IsAnything(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, true);
        if (null == message) {
            message = "ANYTHING";
        }
        this._message = message;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    public Object matches(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "description", typeHint = "Hamcrest\\Description")
    public Object describeTo(RuntimeEnv env, Object... args) {
        Object description = assignParameter(args, 0, false);
        env.callMethod(description, "appendText", IsAnything.class, this._message);
        return null;
    }

    public static final Object CONST_class = "Hamcrest\\Core\\IsAnything";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends BaseMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "description")
        public Object anything(RuntimeEnv env, Object... args) {
            Object description = assignParameter(args, 0, true);
            if (null == description) {
                description = "ANYTHING";
            }
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Hamcrest
                            .namespaces
                            .Core
                            .classes
                            .IsAnything(env, description));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Core\\IsAnything")
                    .setLookup(
                            IsAnything.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_message")
                    .setFilename(
                            "vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Core/IsAnything.php")
                    .addInterface("Hamcrest\\Matcher")
                    .addInterface("Hamcrest\\SelfDescribing")
                    .addExtendsClass("Hamcrest\\BaseMatcher")
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
