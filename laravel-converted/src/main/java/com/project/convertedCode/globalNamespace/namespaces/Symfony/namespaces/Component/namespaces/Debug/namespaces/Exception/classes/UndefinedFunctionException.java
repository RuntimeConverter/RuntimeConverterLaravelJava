package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.Exception.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.Exception.classes.FatalErrorException;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/debug/Exception/UndefinedFunctionException.php

*/

public class UndefinedFunctionException extends FatalErrorException {

    public UndefinedFunctionException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == UndefinedFunctionException.class) {
            this.__construct(env, args);
        }
    }

    public UndefinedFunctionException(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "string")
    @ConvertedParameter(index = 1, name = "previous", typeHint = "ErrorException")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object previous = assignParameter(args, 1, false);
        super.__construct(
                env,
                message,
                env.callMethod(previous, "getCode", UndefinedFunctionException.class),
                env.callMethod(previous, "getSeverity", UndefinedFunctionException.class),
                env.callMethod(previous, "getFile", UndefinedFunctionException.class),
                env.callMethod(previous, "getLine", UndefinedFunctionException.class),
                ZVal.getNull(),
                true,
                ZVal.getNull(),
                env.callMethod(previous, "getPrevious", UndefinedFunctionException.class));
        env.callMethod(
                this,
                "setTrace",
                UndefinedFunctionException.class,
                env.callMethod(previous, "getTrace", UndefinedFunctionException.class));
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Debug\\Exception\\UndefinedFunctionException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends FatalErrorException.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Debug\\Exception\\UndefinedFunctionException")
                    .setLookup(
                            UndefinedFunctionException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/debug/Exception/UndefinedFunctionException.php")
                    .addInterface("Throwable")
                    .addExtendsClass("Symfony\\Component\\Debug\\Exception\\FatalErrorException")
                    .addExtendsClass("ErrorException")
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
