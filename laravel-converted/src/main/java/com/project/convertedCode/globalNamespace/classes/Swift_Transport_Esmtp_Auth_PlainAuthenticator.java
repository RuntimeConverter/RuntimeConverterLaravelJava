package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.classes.Swift_TransportException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Swift_Transport_Esmtp_Authenticator;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/Esmtp/Auth/PlainAuthenticator.php

*/

public class Swift_Transport_Esmtp_Auth_PlainAuthenticator extends RuntimeClassBase
        implements Swift_Transport_Esmtp_Authenticator {

    public Swift_Transport_Esmtp_Auth_PlainAuthenticator(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Swift_Transport_Esmtp_Auth_PlainAuthenticator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getAuthKeyword(RuntimeEnv env, Object... args) {
        return "PLAIN";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "agent", typeHint = "Swift_Transport_SmtpAgent")
    @ConvertedParameter(index = 1, name = "username")
    @ConvertedParameter(index = 2, name = "password")
    public Object authenticate(RuntimeEnv env, Object... args) {
        Object agent = assignParameter(args, 0, false);
        Object username = assignParameter(args, 1, false);
        Object password = assignParameter(args, 2, false);
        Object e = null;
        Object message = null;
        try {
            message =
                    NamespaceGlobal.base64_encode
                            .env(env)
                            .call(
                                    toStringR(username, env)
                                            + toStringR(
                                                    NamespaceGlobal.chr.env(env).call(0).value(),
                                                    env)
                                            + toStringR(username, env)
                                            + toStringR(
                                                    NamespaceGlobal.chr.env(env).call(0).value(),
                                                    env)
                                            + toStringR(password, env))
                            .value();
            env.callMethod(
                    agent,
                    "executeCommand",
                    Swift_Transport_Esmtp_Auth_PlainAuthenticator.class,
                    function_sprintf.f.env(env).call("AUTH PLAIN %s\r\n", message).value(),
                    ZVal.arrayFromList(235));
            return ZVal.assign(true);
        } catch (ConvertedException convertedException229) {
            if (convertedException229.instanceOf(
                    Swift_TransportException.class, "Swift_TransportException")) {
                e = convertedException229.getObject();
                env.callMethod(
                        agent,
                        "executeCommand",
                        Swift_Transport_Esmtp_Auth_PlainAuthenticator.class,
                        "RSET\r\n",
                        ZVal.arrayFromList(250));
                throw ZVal.getException(env, e);
            } else {
                throw convertedException229;
            }
        }
    }

    public static final Object CONST_class = "Swift_Transport_Esmtp_Auth_PlainAuthenticator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Transport_Esmtp_Auth_PlainAuthenticator")
                    .setLookup(
                            Swift_Transport_Esmtp_Auth_PlainAuthenticator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/Esmtp/Auth/PlainAuthenticator.php")
                    .addInterface("Swift_Transport_Esmtp_Authenticator")
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
