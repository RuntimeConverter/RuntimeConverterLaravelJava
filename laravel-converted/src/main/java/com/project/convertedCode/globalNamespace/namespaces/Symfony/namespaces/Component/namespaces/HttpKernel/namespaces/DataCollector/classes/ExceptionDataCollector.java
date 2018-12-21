package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DataCollector.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DataCollector.classes.DataCollector;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.Exception.classes.FlattenException;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/DataCollector/ExceptionDataCollector.php

*/

public class ExceptionDataCollector extends DataCollector {

    public ExceptionDataCollector(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ExceptionDataCollector(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(
        index = 1,
        name = "response",
        typeHint = "Symfony\\Component\\HttpFoundation\\Response"
    )
    @ConvertedParameter(
        index = 2,
        name = "exception",
        typeHint = "Exception",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object collect(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object response = assignParameter(args, 1, false);
        Object exception = assignParameter(args, 2, true);
        if (null == exception) {
            exception = ZVal.getNull();
        }
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", exception)) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("data")
                    .set(
                            ZVal.newArray(
                                    new ZPair(
                                            "exception",
                                            FlattenException.runtimeStaticObject.create(
                                                    env, exception))));
        }

        return null;
    }

    @ConvertedMethod
    public Object reset(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("data").set(ZVal.newArray());
        return null;
    }

    @ConvertedMethod
    public Object hasException(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "data", env),
                        env,
                        "exception"));
    }

    @ConvertedMethod
    public Object getException(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "data", env).arrayGet(env, "exception"));
    }

    @ConvertedMethod
    public Object getMessage(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        new ReferenceClassProperty(this, "data", env).arrayGet(env, "exception"),
                        "getMessage",
                        ExceptionDataCollector.class));
    }

    @ConvertedMethod
    public Object getCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        new ReferenceClassProperty(this, "data", env).arrayGet(env, "exception"),
                        "getCode",
                        ExceptionDataCollector.class));
    }

    @ConvertedMethod
    public Object getStatusCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        new ReferenceClassProperty(this, "data", env).arrayGet(env, "exception"),
                        "getStatusCode",
                        ExceptionDataCollector.class));
    }

    @ConvertedMethod
    public Object getTrace(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        new ReferenceClassProperty(this, "data", env).arrayGet(env, "exception"),
                        "getTrace",
                        ExceptionDataCollector.class));
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return "exception";
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\DataCollector\\ExceptionDataCollector";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends DataCollector.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\HttpKernel\\DataCollector\\ExceptionDataCollector")
                    .setLookup(
                            ExceptionDataCollector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("cloner", "data")
                    .setFilename(
                            "vendor/symfony/http-kernel/DataCollector/ExceptionDataCollector.php")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\DataCollector\\DataCollectorInterface")
                    .addInterface("Serializable")
                    .addExtendsClass("Symfony\\Component\\HttpKernel\\DataCollector\\DataCollector")
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
