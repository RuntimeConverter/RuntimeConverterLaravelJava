package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Swift_Transport_EsmtpTransport;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Swift_DependencyContainer;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/SmtpTransport.php

*/

public class Swift_SmtpTransport extends Swift_Transport_EsmtpTransport {

    public Swift_SmtpTransport(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_SmtpTransport.class) {
            this.__construct(env, args);
        }
    }

    public Swift_SmtpTransport(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "host")
    @ConvertedParameter(index = 1, name = "port", defaultValue = "25", defaultValueType = "number")
    @ConvertedParameter(
        index = 2,
        name = "security",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object host = assignParameter(args, 0, true);
        if (null == host) {
            host = "localhost";
        }
        Object port = assignParameter(args, 1, true);
        if (null == port) {
            port = 25;
        }
        Object security = assignParameter(args, 2, true);
        if (null == security) {
            security = ZVal.getNull();
        }
        function_call_user_func_array
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                .call(
                        ZVal.newArray(
                                new ZPair(0, this),
                                new ZPair(1, "Swift_Transport_EsmtpTransport::__construct")),
                        env.callMethod(
                                Swift_DependencyContainer.runtimeStaticObject.getInstance(env),
                                "createDependenciesFor",
                                Swift_SmtpTransport.class,
                                "transport.smtp"));
        env.callMethod(this, "setHost", Swift_SmtpTransport.class, host);
        env.callMethod(this, "setPort", Swift_SmtpTransport.class, port);
        env.callMethod(this, "setEncryption", Swift_SmtpTransport.class, security);
        return null;
    }

    public static final Object CONST_class = "Swift_SmtpTransport";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends Swift_Transport_EsmtpTransport.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_SmtpTransport")
                    .setLookup(
                            Swift_SmtpTransport.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "addressEncoder",
                            "buffer",
                            "capabilities",
                            "domain",
                            "eventDispatcher",
                            "handlers",
                            "params",
                            "pipeline",
                            "pipelining",
                            "sourceIp",
                            "started")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/SmtpTransport.php")
                    .addInterface("Swift_Transport_SmtpAgent")
                    .addInterface("Swift_Transport")
                    .addExtendsClass("Swift_Transport_EsmtpTransport")
                    .addExtendsClass("Swift_Transport_AbstractSmtpTransport")
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
