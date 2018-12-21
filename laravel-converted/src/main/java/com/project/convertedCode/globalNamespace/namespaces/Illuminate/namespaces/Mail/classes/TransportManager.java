package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Manager;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.namespaces.Transport.classes.LogTransport;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.namespaces.Transport.classes.SparkPostTransport;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import com.project.convertedCode.globalNamespace.classes.Swift_SendmailTransport;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.namespaces.Transport.classes.MandrillTransport;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.namespaces.Transport.classes.MailgunTransport;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.namespaces.Transport.classes.ArrayTransport;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.namespaces.Transport.classes.SesTransport;
import com.project.convertedCode.globalNamespace.classes.Swift_SmtpTransport;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Psr.namespaces.Log.classes.LoggerInterface;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Mail/TransportManager.php

*/

public class TransportManager extends Manager {

    public TransportManager(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TransportManager.class) {
            this.__construct(env, args);
        }
    }

    public TransportManager(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    protected Object createSmtpDriver(RuntimeEnv env, Object... args) {
        Object transport = null;
        ReferenceContainer config = new BasicReferenceContainer(null);
        config.setObject(
                env.callMethod(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("app").value(),
                                "make",
                                TransportManager.class,
                                "config"),
                        "get",
                        TransportManager.class,
                        "mail"));
        transport =
                new Swift_SmtpTransport(
                        env, config.arrayGet(env, "host"), config.arrayGet(env, "port"));
        if (arrayActionR(ArrayAction.ISSET, config, env, "encryption")) {
            env.callMethod(
                    transport,
                    "setEncryption",
                    TransportManager.class,
                    config.arrayGet(env, "encryption"));
        }

        if (arrayActionR(ArrayAction.ISSET, config, env, "username")) {
            env.callMethod(
                    transport,
                    "setUsername",
                    TransportManager.class,
                    config.arrayGet(env, "username"));
            env.callMethod(
                    transport,
                    "setPassword",
                    TransportManager.class,
                    config.arrayGet(env, "password"));
        }

        if (arrayActionR(ArrayAction.ISSET, config, env, "stream")) {
            env.callMethod(
                    transport,
                    "setStreamOptions",
                    TransportManager.class,
                    config.arrayGet(env, "stream"));
        }

        return ZVal.assign(transport);
    }

    @ConvertedMethod
    protected Object createSendmailDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new Swift_SendmailTransport(
                        env,
                        new ReferenceClassProperty(this, "app", env)
                                .arrayGet(env, "config", "mail", "sendmail")));
    }

    @ConvertedMethod
    protected Object createSesDriver(RuntimeEnv env, Object... args) {
        Object config = null;
        config =
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                env.callMethod(
                                        new ReferenceClassProperty(this, "app", env)
                                                .arrayGet(env, "config"),
                                        "get",
                                        TransportManager.class,
                                        "services.ses",
                                        ZVal.newArray()),
                                ZVal.newArray(
                                        new ZPair("version", "latest"),
                                        new ZPair("service", "email")))
                        .value();
        return ZVal.assign(
                new SesTransport(
                        env,
                        env.createNew(
                                ZVal.resolveClassAlias(env, "SesClient"),
                                this.addSesCredentials(env, config))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object addSesCredentials(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (ZVal.toBool(config.arrayGet(env, "key"))
                && ZVal.toBool(config.arrayGet(env, "secret"))) {
            config.arrayAccess(env, "credentials")
                    .set(
                            Arr.runtimeStaticObject.only(
                                    env,
                                    config.getObject(),
                                    ZVal.arrayFromList("key", "secret", "token")));
        }

        return ZVal.assign(config.getObject());
    }

    @ConvertedMethod
    protected Object createMailDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(new Swift_SendmailTransport(env));
    }

    @ConvertedMethod
    protected Object createMailgunDriver(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(null);
        config.setObject(
                env.callMethod(
                        new ReferenceClassProperty(this, "app", env).arrayGet(env, "config"),
                        "get",
                        TransportManager.class,
                        "services.mailgun",
                        ZVal.newArray()));
        return ZVal.assign(
                new MailgunTransport(
                        env,
                        this.guzzle(env, config.getObject()),
                        config.arrayGet(env, "secret"),
                        config.arrayGet(env, "domain")));
    }

    @ConvertedMethod
    protected Object createMandrillDriver(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(null);
        config.setObject(
                env.callMethod(
                        new ReferenceClassProperty(this, "app", env).arrayGet(env, "config"),
                        "get",
                        TransportManager.class,
                        "services.mandrill",
                        ZVal.newArray()));
        return ZVal.assign(
                new MandrillTransport(
                        env, this.guzzle(env, config.getObject()), config.arrayGet(env, "secret")));
    }

    @ConvertedMethod
    protected Object createSparkPostDriver(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        ReferenceContainer config = new BasicReferenceContainer(null);
        config.setObject(
                env.callMethod(
                        new ReferenceClassProperty(this, "app", env).arrayGet(env, "config"),
                        "get",
                        TransportManager.class,
                        "services.sparkpost",
                        ZVal.newArray()));
        return ZVal.assign(
                new SparkPostTransport(
                        env,
                        this.guzzle(env, config.getObject()),
                        config.arrayGet(env, "secret"),
                        ZVal.isDefined(ternaryExpressionTemp = config.arrayGet(env, "options"))
                                ? ternaryExpressionTemp
                                : ZVal.newArray()));
    }

    @ConvertedMethod
    protected Object createLogDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new LogTransport(
                        env,
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("app").value(),
                                "make",
                                TransportManager.class,
                                LoggerInterface.CONST_class)));
    }

    @ConvertedMethod
    protected Object createArrayDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ArrayTransport(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config")
    protected Object guzzle(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                env.createNew(
                        ZVal.resolveClassAlias(env, "HttpClient"),
                        Arr.runtimeStaticObject.add(
                                env,
                                ZVal.isDefined(
                                                ternaryExpressionTemp =
                                                        config.arrayGet(env, "guzzle"))
                                        ? ternaryExpressionTemp
                                        : ZVal.newArray(),
                                "connect_timeout",
                                60)));
    }

    @ConvertedMethod
    public Object getDefaultDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "app", env)
                        .arrayGet(env, "config", "mail.driver"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object setDefaultDriver(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "app", env)
                .arrayAccess(env, "config", "mail.driver")
                .set(name);
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Mail\\TransportManager";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Manager.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Mail\\TransportManager")
                    .setLookup(
                            TransportManager.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "customCreators", "drivers")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Mail/TransportManager.php")
                    .addExtendsClass("Illuminate\\Support\\Manager")
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
