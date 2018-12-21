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

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Core/IsSame.php

*/

public class IsSame extends BaseMatcher {

    public Object _object = null;

    public IsSame(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IsSame.class) {
            this.__construct(env, args);
        }
    }

    public IsSame(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "object")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object _object = assignParameter(args, 0, false);
        this._object = _object;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "object")
    public Object matches(RuntimeEnv env, Object... args) {
        Object _object = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(ZVal.strictEqualityCheck(_object, "===", this._object))
                        && ZVal.toBool(ZVal.strictEqualityCheck(this._object, "===", _object)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "description", typeHint = "Hamcrest\\Description")
    public Object describeTo(RuntimeEnv env, Object... args) {
        Object description = assignParameter(args, 0, false);
        env.callMethod(
                env.callMethod(
                        env.callMethod(description, "appendText", IsSame.class, "sameInstance("),
                        "appendValue",
                        IsSame.class,
                        this._object),
                "appendText",
                IsSame.class,
                ")");
        return null;
    }

    public static final Object CONST_class = "Hamcrest\\Core\\IsSame";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends BaseMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "object")
        public Object sameInstance(RuntimeEnv env, Object... args) {
            Object _object = assignParameter(args, 0, false);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Hamcrest
                            .namespaces
                            .Core
                            .classes
                            .IsSame(env, _object));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Core\\IsSame")
                    .setLookup(
                            IsSame.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_object")
                    .setFilename("vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Core/IsSame.php")
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
