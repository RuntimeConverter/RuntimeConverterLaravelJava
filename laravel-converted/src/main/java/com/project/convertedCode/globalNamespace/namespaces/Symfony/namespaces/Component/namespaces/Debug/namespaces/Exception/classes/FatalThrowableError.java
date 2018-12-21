package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.Exception.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.Exception.classes.FatalErrorException;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeClasses.errors.TypeError;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeClasses.errors.ParseError;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.errors.ErrorException;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/debug/Exception/FatalThrowableError.php

*/

public class FatalThrowableError extends FatalErrorException {

    public Object originalClassName = null;

    public FatalThrowableError(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FatalThrowableError.class) {
            this.__construct(env, args);
        }
    }

    public FatalThrowableError(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Throwable")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        Object severity = null;
        this.originalClassName = function_get_class.f.env(env).call(e).value();
        if (ZVal.isTrue(ZVal.checkInstanceType(e, ParseError.class, "ParseError"))) {
            severity = 4;

        } else if (ZVal.isTrue(ZVal.checkInstanceType(e, TypeError.class, "TypeError"))) {
            severity = 4096;

        } else {
            severity = 1;
        }

        StaticMethodUtils.callNonStaticMethodStatically(
                env,
                ErrorException.class,
                "__construct",
                env.callMethod(e, "getMessage", FatalThrowableError.class),
                env.callMethod(e, "getCode", FatalThrowableError.class),
                severity,
                env.callMethod(e, "getFile", FatalThrowableError.class),
                env.callMethod(e, "getLine", FatalThrowableError.class),
                env.callMethod(e, "getPrevious", FatalThrowableError.class));
        env.callMethod(
                this,
                "setTrace",
                FatalThrowableError.class,
                env.callMethod(e, "getTrace", FatalThrowableError.class));
        return null;
    }

    @ConvertedMethod
    public Object getOriginalClassName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.originalClassName);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Debug\\Exception\\FatalThrowableError";

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
                    .setName("Symfony\\Component\\Debug\\Exception\\FatalThrowableError")
                    .setLookup(
                            FatalThrowableError.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("originalClassName")
                    .setFilename("vendor/symfony/debug/Exception/FatalThrowableError.php")
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
