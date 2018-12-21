package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Psr.namespaces.Log.classes.AbstractLogger;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/debug/BufferingLogger.php

*/

public class BufferingLogger extends AbstractLogger {

    public Object logs = ZVal.newArray();

    public BufferingLogger(RuntimeEnv env, Object... args) {
        super(env);
    }

    public BufferingLogger(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    @ConvertedParameter(index = 1, name = "message")
    @ConvertedParameter(
        index = 2,
        name = "context",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object log(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, false);
        Object context = assignParameter(args, 2, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        new ReferenceClassProperty(this, "logs", env)
                .arrayAppend(env)
                .set(
                        ZVal.newArray(
                                new ZPair(0, level), new ZPair(1, message), new ZPair(2, context)));
        return null;
    }

    @ConvertedMethod
    public Object cleanLogs(RuntimeEnv env, Object... args) {
        Object logs = null;
        logs = ZVal.assign(this.logs);
        this.logs = ZVal.newArray();
        return ZVal.assign(logs);
    }

    public static final Object CONST_class = "Symfony\\Component\\Debug\\BufferingLogger";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractLogger.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Debug\\BufferingLogger")
                    .setLookup(
                            BufferingLogger.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("logs")
                    .setFilename("vendor/symfony/debug/BufferingLogger.php")
                    .addInterface("Psr\\Log\\LoggerInterface")
                    .addExtendsClass("Psr\\Log\\AbstractLogger")
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
