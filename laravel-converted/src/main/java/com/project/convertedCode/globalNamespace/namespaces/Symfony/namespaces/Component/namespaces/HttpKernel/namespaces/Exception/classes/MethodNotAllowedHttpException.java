package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Exception.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Exception.classes.HttpException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/Exception/MethodNotAllowedHttpException.php

*/

public class MethodNotAllowedHttpException extends HttpException {

    public MethodNotAllowedHttpException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MethodNotAllowedHttpException.class) {
            this.__construct(env, args);
        }
    }

    public MethodNotAllowedHttpException(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "allow", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "message",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "previous",
        typeHint = "Exception",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 3, name = "code", defaultValue = "0", defaultValueType = "number")
    @ConvertedParameter(
        index = 4,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object allow = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, true);
        if (null == message) {
            message = ZVal.getNull();
        }
        Object previous = assignParameter(args, 2, true);
        if (null == previous) {
            previous = ZVal.getNull();
        }
        Object code = assignParameter(args, 3, true);
        if (null == code) {
            code = 0;
        }
        ReferenceContainer headers = new BasicReferenceContainer(assignParameter(args, 4, true));
        if (null == headers.getObject()) {
            headers.setObject(ZVal.newArray());
        }
        headers.arrayAccess(env, "Allow")
                .set(
                        NamespaceGlobal.strtoupper
                                .env(env)
                                .call(NamespaceGlobal.implode.env(env).call(", ", allow).value())
                                .value());
        super.__construct(env, 405, message, previous, headers.getObject(), code);
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\Exception\\MethodNotAllowedHttpException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends HttpException.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\HttpKernel\\Exception\\MethodNotAllowedHttpException")
                    .setLookup(
                            MethodNotAllowedHttpException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("headers", "statusCode")
                    .setFilename(
                            "vendor/symfony/http-kernel/Exception/MethodNotAllowedHttpException.php")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\Exception\\HttpExceptionInterface")
                    .addInterface("Throwable")
                    .addExtendsClass("Symfony\\Component\\HttpKernel\\Exception\\HttpException")
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
