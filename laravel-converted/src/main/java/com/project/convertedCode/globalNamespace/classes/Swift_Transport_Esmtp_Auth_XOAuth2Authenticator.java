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
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/Esmtp/Auth/XOAuth2Authenticator.php

*/

public class Swift_Transport_Esmtp_Auth_XOAuth2Authenticator extends RuntimeClassBase
        implements Swift_Transport_Esmtp_Authenticator {

    public Swift_Transport_Esmtp_Auth_XOAuth2Authenticator(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Swift_Transport_Esmtp_Auth_XOAuth2Authenticator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getAuthKeyword(RuntimeEnv env, Object... args) {
        return "XOAUTH2";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "agent", typeHint = "Swift_Transport_SmtpAgent")
    @ConvertedParameter(index = 1, name = "email")
    @ConvertedParameter(index = 2, name = "token")
    public Object authenticate(RuntimeEnv env, Object... args) {
        Object agent = assignParameter(args, 0, false);
        Object email = assignParameter(args, 1, false);
        Object token = assignParameter(args, 2, false);
        Object e = null;
        Object param = null;
        try {
            param = this.constructXOAuth2Params(env, email, token);
            env.callMethod(
                    agent,
                    "executeCommand",
                    Swift_Transport_Esmtp_Auth_XOAuth2Authenticator.class,
                    "AUTH XOAUTH2 " + toStringR(param, env) + "\r\n",
                    ZVal.arrayFromList(235));
            return ZVal.assign(true);
        } catch (ConvertedException convertedException230) {
            if (convertedException230.instanceOf(
                    Swift_TransportException.class, "Swift_TransportException")) {
                e = convertedException230.getObject();
                env.callMethod(
                        agent,
                        "executeCommand",
                        Swift_Transport_Esmtp_Auth_XOAuth2Authenticator.class,
                        "RSET\r\n",
                        ZVal.arrayFromList(250));
                throw ZVal.getException(env, e);
            } else {
                throw convertedException230;
            }
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "email")
    @ConvertedParameter(index = 1, name = "token")
    protected Object constructXOAuth2Params(RuntimeEnv env, Object... args) {
        Object email = assignParameter(args, 0, false);
        Object token = assignParameter(args, 1, false);
        return ZVal.assign(
                NamespaceGlobal.base64_encode
                        .env(env)
                        .call(
                                "user="
                                        + toStringR(email, env)
                                        + "\u0001auth=Bearer "
                                        + toStringR(token, env)
                                        + "\u0001\u0001")
                        .value());
    }

    public static final Object CONST_class = "Swift_Transport_Esmtp_Auth_XOAuth2Authenticator";

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
                    .setName("Swift_Transport_Esmtp_Auth_XOAuth2Authenticator")
                    .setLookup(
                            Swift_Transport_Esmtp_Auth_XOAuth2Authenticator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/Esmtp/Auth/XOAuth2Authenticator.php")
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
