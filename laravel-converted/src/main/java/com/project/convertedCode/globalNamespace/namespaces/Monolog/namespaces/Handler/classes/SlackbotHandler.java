package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.namespaces.Curl.classes.Util;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractProcessingHandler;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/SlackbotHandler.php

*/

public class SlackbotHandler extends AbstractProcessingHandler {

    public Object slackTeam = null;

    public Object token = null;

    public Object channel = null;

    public SlackbotHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SlackbotHandler.class) {
            this.__construct(env, args);
        }
    }

    public SlackbotHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "slackTeam")
    @ConvertedParameter(index = 1, name = "token")
    @ConvertedParameter(index = 2, name = "channel")
    @ConvertedParameter(index = 3, name = "level")
    @ConvertedParameter(
        index = 4,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object slackTeam = assignParameter(args, 0, false);
        Object token = assignParameter(args, 1, false);
        Object channel = assignParameter(args, 2, false);
        Object level = assignParameter(args, 3, true);
        if (null == level) {
            level = Logger.CONST_CRITICAL;
        }
        Object bubble = assignParameter(args, 4, true);
        if (null == bubble) {
            bubble = true;
        }
        super.__construct(env, level, bubble);
        this.slackTeam = slackTeam;
        this.token = token;
        this.channel = channel;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object write(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object ch = null;
        Object slackbotUrl = null;
        slackbotUrl =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "https://%s.slack.com/services/hooks/slackbot?token=%s&channel=%s",
                                this.slackTeam, this.token, this.channel)
                        .value();
        ch = NamespaceGlobal.curl_init.env(env).call().value();
        NamespaceGlobal.curl_setopt.env(env).call(ch, 10002, slackbotUrl);
        NamespaceGlobal.curl_setopt.env(env).call(ch, 47, true);
        NamespaceGlobal.curl_setopt.env(env).call(ch, 19913, true);
        NamespaceGlobal.curl_setopt.env(env).call(ch, 10015, record.arrayGet(env, "message"));
        Util.runtimeStaticObject.execute(env, ch);
        return null;
    }

    public static final Object CONST_class = "Monolog\\Handler\\SlackbotHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends AbstractProcessingHandler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Handler\\SlackbotHandler")
                    .setLookup(
                            SlackbotHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bubble",
                            "channel",
                            "formatter",
                            "level",
                            "processors",
                            "slackTeam",
                            "token")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/SlackbotHandler.php")
                    .addInterface("Monolog\\Handler\\HandlerInterface")
                    .addExtendsClass("Monolog\\Handler\\AbstractProcessingHandler")
                    .addExtendsClass("Monolog\\Handler\\AbstractHandler")
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
