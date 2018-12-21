package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Swift_Transport_SendmailTransport;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
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

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/SendmailTransport.php

*/

public class Swift_SendmailTransport extends Swift_Transport_SendmailTransport {

    public Swift_SendmailTransport(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_SendmailTransport.class) {
            this.__construct(env, args);
        }
    }

    public Swift_SendmailTransport(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, true);
        if (null == command) {
            command = "/usr/sbin/sendmail -bs";
        }
        function_call_user_func_array
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                .call(
                        ZVal.newArray(
                                new ZPair(0, this),
                                new ZPair(1, "Swift_Transport_SendmailTransport::__construct")),
                        env.callMethod(
                                Swift_DependencyContainer.runtimeStaticObject.getInstance(env),
                                "createDependenciesFor",
                                Swift_SendmailTransport.class,
                                "transport.sendmail"));
        env.callMethod(this, "setCommand", Swift_SendmailTransport.class, command);
        return null;
    }

    public static final Object CONST_class = "Swift_SendmailTransport";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends Swift_Transport_SendmailTransport.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_SendmailTransport")
                    .setLookup(
                            Swift_SendmailTransport.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "addressEncoder",
                            "buffer",
                            "domain",
                            "eventDispatcher",
                            "params",
                            "pipeline",
                            "pipelining",
                            "sourceIp",
                            "started")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/SendmailTransport.php")
                    .addInterface("Swift_Transport")
                    .addExtendsClass("Swift_Transport_SendmailTransport")
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
