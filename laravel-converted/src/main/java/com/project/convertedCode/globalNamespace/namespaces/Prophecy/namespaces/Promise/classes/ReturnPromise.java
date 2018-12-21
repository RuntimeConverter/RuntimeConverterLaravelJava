package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Promise.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Promise.classes.PromiseInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Promise/ReturnPromise.php

*/

public class ReturnPromise extends RuntimeClassBase implements PromiseInterface {

    public Object returnValues = ZVal.newArray();

    public ReturnPromise(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ReturnPromise.class) {
            this.__construct(env, args);
        }
    }

    public ReturnPromise(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "returnValues", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object returnValues = assignParameter(args, 0, false);
        this.returnValues = returnValues;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args", typeHint = "array")
    @ConvertedParameter(index = 1, name = "object", typeHint = "Prophecy\\Prophecy\\ObjectProphecy")
    @ConvertedParameter(index = 2, name = "method", typeHint = "Prophecy\\Prophecy\\MethodProphecy")
    public Object execute(RuntimeEnv env, Object... args) {
        Object ___args = assignParameter(args, 0, false);
        Object _object = assignParameter(args, 1, false);
        Object method = assignParameter(args, 2, false);
        Object value = null;
        value = function_array_shift.f.env(env).call(this.returnValues).value();
        if (!function_count.f.env(env).call(this.returnValues).getBool()) {
            new ReferenceClassProperty(this, "returnValues", env).arrayAppend(env).set(value);
        }

        return ZVal.assign(value);
    }

    public static final Object CONST_class = "Prophecy\\Promise\\ReturnPromise";

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
                    .setName("Prophecy\\Promise\\ReturnPromise")
                    .setLookup(
                            ReturnPromise.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("returnValues")
                    .setFilename("vendor/phpspec/prophecy/src/Prophecy/Promise/ReturnPromise.php")
                    .addInterface("Prophecy\\Promise\\PromiseInterface")
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
