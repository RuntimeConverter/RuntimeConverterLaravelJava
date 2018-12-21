package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.classes.Swift_TransportException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Swift_Transport_Esmtp_Authenticator;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/Esmtp/Auth/CramMd5Authenticator.php

*/

public class Swift_Transport_Esmtp_Auth_CramMd5Authenticator extends RuntimeClassBase
        implements Swift_Transport_Esmtp_Authenticator {

    public Swift_Transport_Esmtp_Auth_CramMd5Authenticator(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Swift_Transport_Esmtp_Auth_CramMd5Authenticator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getAuthKeyword(RuntimeEnv env, Object... args) {
        return "CRAM-MD5";
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
        Object challenge = null;
        Object message = null;
        try {
            challenge =
                    env.callMethod(
                            agent,
                            "executeCommand",
                            Swift_Transport_Esmtp_Auth_CramMd5Authenticator.class,
                            "AUTH CRAM-MD5\r\n",
                            ZVal.arrayFromList(334));
            challenge =
                    NamespaceGlobal.base64_decode
                            .env(env)
                            .call(function_substr.f.env(env).call(challenge, 4).value())
                            .value();
            message =
                    NamespaceGlobal.base64_encode
                            .env(env)
                            .call(
                                    toStringR(username, env)
                                            + " "
                                            + toStringR(
                                                    this.getResponse(env, password, challenge),
                                                    env))
                            .value();
            env.callMethod(
                    agent,
                    "executeCommand",
                    Swift_Transport_Esmtp_Auth_CramMd5Authenticator.class,
                    function_sprintf.f.env(env).call("%s\r\n", message).value(),
                    ZVal.arrayFromList(235));
            return ZVal.assign(true);
        } catch (ConvertedException convertedException226) {
            if (convertedException226.instanceOf(
                    Swift_TransportException.class, "Swift_TransportException")) {
                e = convertedException226.getObject();
                env.callMethod(
                        agent,
                        "executeCommand",
                        Swift_Transport_Esmtp_Auth_CramMd5Authenticator.class,
                        "RSET\r\n",
                        ZVal.arrayFromList(250));
                throw ZVal.getException(env, e);
            } else {
                throw convertedException226;
            }
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "secret")
    @ConvertedParameter(index = 1, name = "challenge")
    private Object getResponse(RuntimeEnv env, Object... args) {
        Object secret = assignParameter(args, 0, false);
        Object challenge = assignParameter(args, 1, false);
        Object digest = null;
        Object k_ipad = null;
        Object k_opad = null;
        Object inner = null;
        if (ZVal.isGreaterThan(function_strlen.f.env(env).call(secret).value(), '>', 64)) {
            secret =
                    NamespaceGlobal.pack
                            .env(env)
                            .call("H32", NamespaceGlobal.md5.env(env).call(secret).value())
                            .value();
        }

        if (ZVal.isLessThan(function_strlen.f.env(env).call(secret).value(), '<', 64)) {
            secret =
                    NamespaceGlobal.str_pad
                            .env(env)
                            .call(secret, 64, NamespaceGlobal.chr.env(env).call(0).value())
                            .value();
        }

        k_ipad =
                ZVal.toLong(function_substr.f.env(env).call(secret, 0, 64).value())
                        ^ ZVal.toLong(
                                function_str_repeat
                                        .f
                                        .env(env)
                                        .call(NamespaceGlobal.chr.env(env).call(54).value(), 64)
                                        .value());
        k_opad =
                ZVal.toLong(function_substr.f.env(env).call(secret, 0, 64).value())
                        ^ ZVal.toLong(
                                function_str_repeat
                                        .f
                                        .env(env)
                                        .call(NamespaceGlobal.chr.env(env).call(92).value(), 64)
                                        .value());
        inner =
                NamespaceGlobal.pack
                        .env(env)
                        .call(
                                "H32",
                                NamespaceGlobal.md5
                                        .env(env)
                                        .call(toStringR(k_ipad, env) + toStringR(challenge, env))
                                        .value())
                        .value();
        digest =
                NamespaceGlobal.md5
                        .env(env)
                        .call(toStringR(k_opad, env) + toStringR(inner, env))
                        .value();
        return ZVal.assign(digest);
    }

    public static final Object CONST_class = "Swift_Transport_Esmtp_Auth_CramMd5Authenticator";

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
                    .setName("Swift_Transport_Esmtp_Auth_CramMd5Authenticator")
                    .setLookup(
                            Swift_Transport_Esmtp_Auth_CramMd5Authenticator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/Esmtp/Auth/CramMd5Authenticator.php")
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
