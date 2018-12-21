package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.Response;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/StreamedResponse.php

*/

public class StreamedResponse extends Response {

    public Object callback = null;

    public Object streamed = null;

    public Object headersSent = null;

    public StreamedResponse(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == StreamedResponse.class) {
            this.__construct(env, args);
        }
    }

    public StreamedResponse(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "callback",
        typeHint = "callable",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "status",
        typeHint = "int",
        defaultValue = "200",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 2,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object status = assignParameter(args, 1, true);
        if (null == status) {
            status = 200;
        }
        Object headers = assignParameter(args, 2, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        super.__construct(env, ZVal.getNull(), status, headers);
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", callback)) {
            this.setCallback(env, callback);
        }

        this.streamed = false;
        this.headersSent = false;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "callable")
    public Object setCallback(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        this.callback = callback;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object sendHeaders(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.headersSent)) {
            return ZVal.assign(this);
        }

        this.headersSent = true;
        return ZVal.assign(super.sendHeaders(env));
    }

    @ConvertedMethod
    public Object sendContent(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.streamed)) {
            return ZVal.assign(this);
        }

        this.streamed = true;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.callback)) {
            throw ZVal.getException(
                    env, new LogicException(env, "The Response callback must not be null."));
        }

        function_call_user_func
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                .call(this.callback);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content")
    public Object setContent(RuntimeEnv env, Object... args) {
        Object content = assignParameter(args, 0, false);
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", content)) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env, "The content cannot be set on a StreamedResponse instance."));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getContent(RuntimeEnv env, Object... args) {
        return ZVal.assign(false);
    }

    public static final Object CONST_class = "Symfony\\Component\\HttpFoundation\\StreamedResponse";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Response.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "callback",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 1,
            name = "status",
            defaultValue = "200",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 2,
            name = "headers",
            defaultValue = "",
            defaultValueType = "array"
        )
        public Object create(RuntimeEnv env, Object... args) {
            Object callback = assignParameter(args, 0, true);
            if (null == callback) {
                callback = ZVal.getNull();
            }
            Object status = assignParameter(args, 1, true);
            if (null == status) {
                status = 200;
            }
            Object headers = assignParameter(args, 2, true);
            if (null == headers) {
                headers = ZVal.newArray();
            }
            return ZVal.assign(
                    env.createNewWithLateStaticBindings(this, callback, status, headers));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpFoundation\\StreamedResponse")
                    .setLookup(
                            StreamedResponse.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "callback",
                            "charset",
                            "content",
                            "headers",
                            "headersSent",
                            "statusCode",
                            "statusText",
                            "streamed",
                            "version")
                    .setFilename("vendor/symfony/http-foundation/StreamedResponse.php")
                    .addExtendsClass("Symfony\\Component\\HttpFoundation\\Response")
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
