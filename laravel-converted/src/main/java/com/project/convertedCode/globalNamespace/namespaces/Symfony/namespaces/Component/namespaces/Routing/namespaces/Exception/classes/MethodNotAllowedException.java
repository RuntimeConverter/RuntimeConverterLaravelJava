package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Exception.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Exception.classes.ExceptionInterface;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/routing/Exception/MethodNotAllowedException.php

*/

public class MethodNotAllowedException extends RuntimeException implements ExceptionInterface {

    public Object allowedMethods = ZVal.newArray();

    public MethodNotAllowedException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MethodNotAllowedException.class) {
            this.__construct(env, args);
        }
    }

    public MethodNotAllowedException(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "allowedMethods", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "message",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "code",
        typeHint = "int",
        defaultValue = "0",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 3,
        name = "previous",
        typeHint = "Exception",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object allowedMethods = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, true);
        if (null == message) {
            message = ZVal.getNull();
        }
        Object code = assignParameter(args, 2, true);
        if (null == code) {
            code = 0;
        }
        Object previous = assignParameter(args, 3, true);
        if (null == previous) {
            previous = ZVal.getNull();
        }
        this.allowedMethods =
                function_array_map.f.env(env).call("strtoupper", allowedMethods).value();
        super.__construct(env, message, code, previous);
        return null;
    }

    @ConvertedMethod
    public Object getAllowedMethods(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.allowedMethods);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Routing\\Exception\\MethodNotAllowedException";

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
                    .setName("Symfony\\Component\\Routing\\Exception\\MethodNotAllowedException")
                    .setLookup(
                            MethodNotAllowedException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("allowedMethods")
                    .setFilename("vendor/symfony/routing/Exception/MethodNotAllowedException.php")
                    .addInterface("Symfony\\Component\\Routing\\Exception\\ExceptionInterface")
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
