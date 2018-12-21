package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.namespaces.Transport.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.namespaces.Transport.classes.Transport;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Mail/Transport/LogTransport.php

*/

public class LogTransport extends Transport {

    public Object logger = null;

    public LogTransport(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == LogTransport.class) {
            this.__construct(env, args);
        }
    }

    public LogTransport(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "logger", typeHint = "Psr\\Log\\LoggerInterface")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object logger = assignParameter(args, 0, false);
        this.logger = logger;
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
        env.callMethod(this, "beforeSendPerformed", LogTransport.class, message);
        env.callMethod(
                this.logger, "debug", LogTransport.class, this.getMimeEntityString(env, message));
        env.callMethod(this, "sendPerformed", LogTransport.class, message);
        return ZVal.assign(env.callMethod(this, "numberOfRecipients", LogTransport.class, message));
    }

    public Object send(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "entity", typeHint = "Swift_Mime_SimpleMimeEntity")
    protected Object getMimeEntityString(RuntimeEnv env, Object... args) {
        Object entity = assignParameter(args, 0, false);
        Object string = null;
        Object children = null;
        string =
                toStringR(
                                toStringR(
                                        env.callMethod(entity, "getHeaders", LogTransport.class),
                                        env),
                                env)
                        + toStringR("\n", env)
                        + toStringR(env.callMethod(entity, "getBody", LogTransport.class), env);
        for (ZPair zpairResult489 :
                ZVal.getIterable(
                        env.callMethod(entity, "getChildren", LogTransport.class), env, true)) {
            children = ZVal.assign(zpairResult489.getValue());
            string =
                    toStringR(string, env)
                            + toStringR("\n", env)
                            + toStringR("\n", env)
                            + toStringR(this.getMimeEntityString(env, children), env);
        }

        return ZVal.assign(string);
    }

    public static final Object CONST_class = "Illuminate\\Mail\\Transport\\LogTransport";

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
                    .setName("Illuminate\\Mail\\Transport\\LogTransport")
                    .setLookup(
                            LogTransport.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("logger", "plugins")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Mail/Transport/LogTransport.php")
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
}
