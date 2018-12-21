package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.namespaces.Transport.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.functions.object_get;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import com.runtimeconverter.runtime.RuntimeStack;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.namespaces.Transport.classes.Transport;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Mail/Transport/SparkPostTransport.php

*/

public class SparkPostTransport extends Transport {

    public Object client = null;

    public Object key = null;

    public Object options = ZVal.newArray();

    public SparkPostTransport(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SparkPostTransport.class) {
            this.__construct(env, args);
        }
    }

    public SparkPostTransport(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "client", typeHint = "GuzzleHttp\\ClientInterface")
    @ConvertedParameter(index = 1, name = "key")
    @ConvertedParameter(index = 2, name = "options", defaultValue = "", defaultValueType = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object client = assignParameter(args, 0, false);
        Object key = assignParameter(args, 1, false);
        Object options = assignParameter(args, 2, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        this.key = key;
        this.client = client;
        this.options = options;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "Swift_Mime_SimpleMessage")
    @ConvertedParameter(
        index = 1,
        name = "failedRecipients",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object send(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        Object message = assignParameter(args, 0, false);
        ReferenceContainer failedRecipients =
                assignParameterRef(runtimePassByReferenceArgs, args, 1, true);
        if (null == failedRecipients.getObject()) {
            failedRecipients.setObject(ZVal.getNull());
        }
        Object recipients = null;
        Object response = null;
        env.callMethod(this, "beforeSendPerformed", SparkPostTransport.class, message);
        recipients = this.getRecipients(env, message);
        env.callMethod(message, "setBcc", SparkPostTransport.class, ZVal.newArray());
        response =
                env.callMethod(
                        this.client,
                        "post",
                        SparkPostTransport.class,
                        this.getEndpoint(env),
                        ZVal.newArray(
                                new ZPair(
                                        "headers",
                                        ZVal.newArray(new ZPair("Authorization", this.key))),
                                new ZPair(
                                        "json",
                                        function_array_merge
                                                .f
                                                .env(env)
                                                .call(
                                                        ZVal.newArray(
                                                                new ZPair("recipients", recipients),
                                                                new ZPair(
                                                                        "content",
                                                                        ZVal.newArray(
                                                                                new ZPair(
                                                                                        "email_rfc822",
                                                                                        env
                                                                                                .callMethod(
                                                                                                        message,
                                                                                                        "toString",
                                                                                                        SparkPostTransport
                                                                                                                .class))))),
                                                        this.options)
                                                .value())));
        env.callMethod(
                env.callMethod(message, "getHeaders", SparkPostTransport.class),
                "addTextHeader",
                SparkPostTransport.class,
                "X-SparkPost-Transmission-ID",
                this.getTransmissionId(env, response));
        env.callMethod(this, "sendPerformed", SparkPostTransport.class, message);
        return ZVal.assign(
                env.callMethod(this, "numberOfRecipients", SparkPostTransport.class, message));
    }

    public Object send(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "Swift_Mime_SimpleMessage")
    protected Object getRecipients(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope149 scope = new Scope149();
        stack.pushScope(scope);
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Mail/Transport")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Mail/Transport/SparkPostTransport.php");
            scope.message = assignParameter(args, 0, false);
            scope.recipients = new BasicReferenceContainer(null);
            scope.name = null;
            scope.email = null;
            scope.recipients.setObject(ZVal.newArray());
            for (ZPair zpairResult490 :
                    ZVal.getIterable(
                            rToArrayCast(
                                    env.callMethod(
                                            scope.message, "getTo", SparkPostTransport.class)),
                            env,
                            false)) {
                scope.email = ZVal.assign(zpairResult490.getKey());
                scope.name = ZVal.assign(zpairResult490.getValue());
                scope.recipients
                        .arrayAppend(env)
                        .set(
                                ZVal.newArray(
                                        new ZPair(
                                                "address",
                                                function_compact
                                                        .f
                                                        .env(env)
                                                        .call(stack, "name", "email")
                                                        .value())));
            }

            for (ZPair zpairResult491 :
                    ZVal.getIterable(
                            rToArrayCast(
                                    env.callMethod(
                                            scope.message, "getCc", SparkPostTransport.class)),
                            env,
                            false)) {
                scope.email = ZVal.assign(zpairResult491.getKey());
                scope.name = ZVal.assign(zpairResult491.getValue());
                scope.recipients
                        .arrayAppend(env)
                        .set(
                                ZVal.newArray(
                                        new ZPair(
                                                "address",
                                                function_compact
                                                        .f
                                                        .env(env)
                                                        .call(stack, "name", "email")
                                                        .value())));
            }

            for (ZPair zpairResult492 :
                    ZVal.getIterable(
                            rToArrayCast(
                                    env.callMethod(
                                            scope.message, "getBcc", SparkPostTransport.class)),
                            env,
                            false)) {
                scope.email = ZVal.assign(zpairResult492.getKey());
                scope.name = ZVal.assign(zpairResult492.getValue());
                scope.recipients
                        .arrayAppend(env)
                        .set(
                                ZVal.newArray(
                                        new ZPair(
                                                "address",
                                                function_compact
                                                        .f
                                                        .env(env)
                                                        .call(stack, "name", "email")
                                                        .value())));
            }

            throw new IncludeEventException(ZVal.assign(scope.recipients.getObject()));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "response")
    protected Object getTransmissionId(RuntimeEnv env, Object... args) {
        Object response = assignParameter(args, 0, false);
        return ZVal.assign(
                object_get
                        .f
                        .env(env)
                        .call(
                                NamespaceGlobal.json_decode
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        env.callMethod(
                                                                response,
                                                                "getBody",
                                                                SparkPostTransport.class),
                                                        "getContents",
                                                        SparkPostTransport.class))
                                        .value(),
                                "results.id")
                        .value());
    }

    @ConvertedMethod
    public Object getKey(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.key);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object setKey(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(this.key = key);
    }

    @ConvertedMethod
    public Object getEndpoint(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        handleReturnReference(this.getOptions(env))
                                                .arrayGet(env, "endpoint"))
                        ? ternaryExpressionTemp
                        : "https://api.sparkpost.com/api/v1/transmissions");
    }

    @ConvertedMethod
    public Object getOptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.options);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options", typeHint = "array")
    public Object setOptions(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, false);
        return ZVal.assign(this.options = options);
    }

    public static final Object CONST_class = "Illuminate\\Mail\\Transport\\SparkPostTransport";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Transport.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Mail\\Transport\\SparkPostTransport")
                    .setLookup(
                            SparkPostTransport.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("client", "key", "options", "plugins")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Mail/Transport/SparkPostTransport.php")
                    .addInterface("Swift_Transport")
                    .addExtendsClass("Illuminate\\Mail\\Transport\\Transport")
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

    private static class Scope147 implements UpdateRuntimeScopeInterface {

        ReferenceContainer recipients;
        Object name;
        Object message;
        Object email;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("recipients", this.recipients);
            stack.setVariable("name", this.name);
            stack.setVariable("message", this.message);
            stack.setVariable("email", this.email);
        }

        public void updateScope(RuntimeStack stack) {

            this.recipients = ZVal.getStackReference(stack.getVariable("recipients"));
            this.name = stack.getVariable("name");
            this.message = stack.getVariable("message");
            this.email = stack.getVariable("email");
        }
    }

    private static class Scope148 implements UpdateRuntimeScopeInterface {

        ReferenceContainer recipients;
        Object name;
        Object message;
        Object email;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("recipients", this.recipients);
            stack.setVariable("name", this.name);
            stack.setVariable("message", this.message);
            stack.setVariable("email", this.email);
        }

        public void updateScope(RuntimeStack stack) {

            this.recipients = ZVal.getStackReference(stack.getVariable("recipients"));
            this.name = stack.getVariable("name");
            this.message = stack.getVariable("message");
            this.email = stack.getVariable("email");
        }
    }

    private static class Scope149 implements UpdateRuntimeScopeInterface {

        ReferenceContainer recipients;
        Object name;
        Object message;
        Object email;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("recipients", this.recipients);
            stack.setVariable("name", this.name);
            stack.setVariable("message", this.message);
            stack.setVariable("email", this.email);
        }

        public void updateScope(RuntimeStack stack) {

            this.recipients = ZVal.getStackReference(stack.getVariable("recipients"));
            this.name = stack.getVariable("name");
            this.message = stack.getVariable("message");
            this.email = stack.getVariable("email");
        }
    }
}
