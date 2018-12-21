package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.classes.Swift_Transport_EsmtpHandler;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.classes.Swift_TransportException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/Esmtp/AuthHandler.php

*/

public class Swift_Transport_Esmtp_AuthHandler extends RuntimeClassBase
        implements Swift_Transport_EsmtpHandler {

    public Object authenticators = ZVal.newArray();

    public Object username = null;

    public Object password = null;

    public Object auth_mode = null;

    public Object esmtpParams = ZVal.newArray();

    public Swift_Transport_Esmtp_AuthHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Transport_Esmtp_AuthHandler.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Transport_Esmtp_AuthHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "authenticators", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object authenticators = assignParameter(args, 0, false);
        this.setAuthenticators(env, authenticators);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "authenticators", typeHint = "array")
    public Object setAuthenticators(RuntimeEnv env, Object... args) {
        Object authenticators = assignParameter(args, 0, false);
        this.authenticators = authenticators;
        return null;
    }

    @ConvertedMethod
    public Object getAuthenticators(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.authenticators);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "username")
    public Object setUsername(RuntimeEnv env, Object... args) {
        Object username = assignParameter(args, 0, false);
        this.username = username;
        return null;
    }

    @ConvertedMethod
    public Object getUsername(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.username);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "password")
    public Object setPassword(RuntimeEnv env, Object... args) {
        Object password = assignParameter(args, 0, false);
        this.password = password;
        return null;
    }

    @ConvertedMethod
    public Object getPassword(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.password);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mode")
    public Object setAuthMode(RuntimeEnv env, Object... args) {
        Object mode = assignParameter(args, 0, false);
        this.auth_mode = mode;
        return null;
    }

    @ConvertedMethod
    public Object getAuthMode(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.auth_mode);
    }

    @ConvertedMethod
    public Object getHandledKeyword(RuntimeEnv env, Object... args) {
        return "AUTH";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters", typeHint = "array")
    public Object setKeywordParams(RuntimeEnv env, Object... args) {
        Object parameters = assignParameter(args, 0, false);
        this.esmtpParams = parameters;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "agent", typeHint = "Swift_Transport_SmtpAgent")
    public Object afterEhlo(RuntimeEnv env, Object... args) {
        Object agent = assignParameter(args, 0, false);
        Object e = null;
        ReferenceContainer count = new BasicReferenceContainer(null);
        Object message = null;
        ReferenceContainer error = new BasicReferenceContainer(null);
        Object authenticator = null;
        ReferenceContainer errors = new BasicReferenceContainer(null);
        if (ZVal.isTrue(this.username)) {
            count.setObject(0);
            errors.setObject(ZVal.newArray());
            for (ZPair zpairResult1603 :
                    ZVal.getIterable(this.getAuthenticatorsForAgent(env), env, true)) {
                authenticator = ZVal.assign(zpairResult1603.getValue());
                if (function_in_array
                        .f
                        .env(env)
                        .call(
                                NamespaceGlobal.strtolower
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        authenticator,
                                                        "getAuthKeyword",
                                                        Swift_Transport_Esmtp_AuthHandler.class))
                                        .value(),
                                function_array_map
                                        .f
                                        .env(env)
                                        .call("strtolower", this.esmtpParams)
                                        .value())
                        .getBool()) {
                    count.setObject(ZVal.increment(count.getObject()));
                    try {
                        if (ZVal.isTrue(
                                env.callMethod(
                                        authenticator,
                                        "authenticate",
                                        Swift_Transport_Esmtp_AuthHandler.class,
                                        agent,
                                        this.username,
                                        this.password))) {
                            return null;
                        }

                    } catch (ConvertedException convertedException231) {
                        if (convertedException231.instanceOf(
                                Swift_TransportException.class, "Swift_TransportException")) {
                            e = convertedException231.getObject();
                            errors.arrayAppend(env)
                                    .set(
                                            ZVal.newArray(
                                                    new ZPair(
                                                            0,
                                                            env.callMethod(
                                                                    authenticator,
                                                                    "getAuthKeyword",
                                                                    Swift_Transport_Esmtp_AuthHandler
                                                                            .class)),
                                                    new ZPair(1, e)));
                        } else {
                            throw convertedException231;
                        }
                    }
                }
            }

            message =
                    "Failed to authenticate on SMTP server with username \""
                            + toStringR(this.username, env)
                            + "\" using "
                            + toStringR(count.getObject(), env)
                            + " possible authenticators.";
            for (ZPair zpairResult1604 : ZVal.getIterable(errors.getObject(), env, true)) {
                error.setObject(ZVal.assign(zpairResult1604.getValue()));
                message =
                        toStringR(message, env)
                                + " Authenticator "
                                + toStringR(error.arrayGet(env, 0), env)
                                + " returned "
                                + toStringR(error.arrayGet(env, 1), env)
                                + ".";
            }

            throw ZVal.getException(env, new Swift_TransportException(env, message));
        }

        return null;
    }

    @ConvertedMethod
    public Object getMailParams(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    public Object getRcptParams(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "agent", typeHint = "Swift_Transport_SmtpAgent")
    @ConvertedParameter(index = 1, name = "command")
    @ConvertedParameter(index = 2, name = "codes", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 3,
        name = "failedRecipients",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "stop",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object onCommand(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        Object agent = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        Object codes = assignParameter(args, 2, true);
        if (null == codes) {
            codes = ZVal.newArray();
        }
        ReferenceContainer failedRecipients =
                assignParameterRef(runtimePassByReferenceArgs, args, 3, true);
        if (null == failedRecipients.getObject()) {
            failedRecipients.setObject(ZVal.getNull());
        }
        ReferenceContainer stop = assignParameterRef(runtimePassByReferenceArgs, args, 4, true);
        if (null == stop.getObject()) {
            stop.setObject(false);
        }
        return null;
    }

    public Object onCommand(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "esmtpKeyword")
    public Object getPriorityOver(RuntimeEnv env, Object... args) {
        Object esmtpKeyword = assignParameter(args, 0, false);
        return 0;
    }

    @ConvertedMethod
    public Object exposeMixinMethods(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.arrayFromList(
                        "setUsername",
                        "getUsername",
                        "setPassword",
                        "getPassword",
                        "setAuthMode",
                        "getAuthMode"));
    }

    @ConvertedMethod
    public Object resetState(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    protected Object getAuthenticatorsForAgent(RuntimeEnv env, Object... args) {
        Object mode = null;
        Object authenticator = null;
        if (!ZVal.isTrue(mode = NamespaceGlobal.strtolower.env(env).call(this.auth_mode).value())) {
            return ZVal.assign(this.authenticators);
        }

        for (ZPair zpairResult1605 : ZVal.getIterable(this.authenticators, env, true)) {
            authenticator = ZVal.assign(zpairResult1605.getValue());
            if (ZVal.equalityCheck(
                    NamespaceGlobal.strtolower
                            .env(env)
                            .call(
                                    env.callMethod(
                                            authenticator,
                                            "getAuthKeyword",
                                            Swift_Transport_Esmtp_AuthHandler.class))
                            .value(),
                    mode)) {
                return ZVal.assign(ZVal.newArray(new ZPair(0, authenticator)));
            }
        }

        throw ZVal.getException(
                env,
                new Swift_TransportException(
                        env, "Auth mode " + toStringR(mode, env) + " is invalid"));
    }

    public static final Object CONST_class = "Swift_Transport_Esmtp_AuthHandler";

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
                    .setName("Swift_Transport_Esmtp_AuthHandler")
                    .setLookup(
                            Swift_Transport_Esmtp_AuthHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "auth_mode", "authenticators", "esmtpParams", "password", "username")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/Esmtp/AuthHandler.php")
                    .addInterface("Swift_Transport_EsmtpHandler")
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
