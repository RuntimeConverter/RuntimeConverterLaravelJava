package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prediction.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prediction.classes.PredictionException;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Exception/Prediction/AggregateException.php

*/

public class AggregateException extends RuntimeException implements PredictionException {

    public Object exceptions = ZVal.newArray();

    public Object objectProphecy = null;

    public AggregateException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AggregateException.class) {
            this.__construct(env, args);
        }
    }

    public AggregateException(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "exception",
        typeHint = "Prophecy\\Exception\\Prediction\\PredictionException"
    )
    public Object append(RuntimeEnv env, Object... args) {
        Object exception = assignParameter(args, 0, false);
        Object message = null;
        message = env.callMethod(exception, "getMessage", AggregateException.class);
        message =
                "  "
                        + toStringR(
                                NamespaceGlobal.strtr
                                        .env(env)
                                        .call(message, ZVal.newArray(new ZPair("\n", "\n  ")))
                                        .value(),
                                env)
                        + "\n";
        toObjectR(this)
                .accessProp(this, env)
                .name("message")
                .set(
                        function_rtrim
                                .f
                                .env(env)
                                .call(
                                        toStringR(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("message")
                                                                .value(),
                                                        env)
                                                + toStringR(message, env))
                                .value());
        new ReferenceClassProperty(this, "exceptions", env).arrayAppend(env).set(exception);
        return null;
    }

    @ConvertedMethod
    public Object getExceptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.exceptions);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "objectProphecy",
        typeHint = "Prophecy\\Prophecy\\ObjectProphecy"
    )
    public Object setObjectProphecy(RuntimeEnv env, Object... args) {
        Object objectProphecy = assignParameter(args, 0, false);
        this.objectProphecy = objectProphecy;
        return null;
    }

    @ConvertedMethod
    public Object getObjectProphecy(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.objectProphecy);
    }

    public static final Object CONST_class = "Prophecy\\Exception\\Prediction\\AggregateException";

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
                    .setName("Prophecy\\Exception\\Prediction\\AggregateException")
                    .setLookup(
                            AggregateException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("exceptions", "objectProphecy")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Exception/Prediction/AggregateException.php")
                    .addInterface("Prophecy\\Exception\\Prediction\\PredictionException")
                    .addInterface("Prophecy\\Exception\\Exception")
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
