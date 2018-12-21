package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.classes.Swift_Events_SendListener;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/RedirectingPlugin.php

*/

public class Swift_Plugins_RedirectingPlugin extends RuntimeClassBase
        implements Swift_Events_SendListener {

    public Object recipient = null;

    public Object whitelist = ZVal.newArray();

    public Swift_Plugins_RedirectingPlugin(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Plugins_RedirectingPlugin.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Plugins_RedirectingPlugin(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "recipient")
    @ConvertedParameter(
        index = 1,
        name = "whitelist",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object recipient = assignParameter(args, 0, false);
        Object whitelist = assignParameter(args, 1, true);
        if (null == whitelist) {
            whitelist = ZVal.newArray();
        }
        this.recipient = recipient;
        this.whitelist = whitelist;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "recipient")
    public Object setRecipient(RuntimeEnv env, Object... args) {
        Object recipient = assignParameter(args, 0, false);
        this.recipient = recipient;
        return null;
    }

    @ConvertedMethod
    public Object getRecipient(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.recipient);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "whitelist", typeHint = "array")
    public Object setWhitelist(RuntimeEnv env, Object... args) {
        Object whitelist = assignParameter(args, 0, false);
        this.whitelist = whitelist;
        return null;
    }

    @ConvertedMethod
    public Object getWhitelist(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.whitelist);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "evt", typeHint = "Swift_Events_SendEvent")
    public Object beforeSendPerformed(RuntimeEnv env, Object... args) {
        Object evt = assignParameter(args, 0, false);
        Object headers = null;
        Object recipient = null;
        Object to = null;
        Object message = null;
        message = env.callMethod(evt, "getMessage", Swift_Plugins_RedirectingPlugin.class);
        headers = env.callMethod(message, "getHeaders", Swift_Plugins_RedirectingPlugin.class);
        if (ZVal.isTrue(
                env.callMethod(headers, "has", Swift_Plugins_RedirectingPlugin.class, "to"))) {
            env.callMethod(
                    headers,
                    "addMailboxHeader",
                    Swift_Plugins_RedirectingPlugin.class,
                    "X-Swift-To",
                    env.callMethod(message, "getTo", Swift_Plugins_RedirectingPlugin.class));
        }

        if (ZVal.isTrue(
                env.callMethod(headers, "has", Swift_Plugins_RedirectingPlugin.class, "cc"))) {
            env.callMethod(
                    headers,
                    "addMailboxHeader",
                    Swift_Plugins_RedirectingPlugin.class,
                    "X-Swift-Cc",
                    env.callMethod(message, "getCc", Swift_Plugins_RedirectingPlugin.class));
        }

        if (ZVal.isTrue(
                env.callMethod(headers, "has", Swift_Plugins_RedirectingPlugin.class, "bcc"))) {
            env.callMethod(
                    headers,
                    "addMailboxHeader",
                    Swift_Plugins_RedirectingPlugin.class,
                    "X-Swift-Bcc",
                    env.callMethod(message, "getBcc", Swift_Plugins_RedirectingPlugin.class));
        }

        this.filterHeaderSet(env, headers, "To");
        this.filterHeaderSet(env, headers, "Cc");
        this.filterHeaderSet(env, headers, "Bcc");
        to = env.callMethod(message, "getTo", Swift_Plugins_RedirectingPlugin.class);
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", to)) {
            to = ZVal.newArray();
        }

        for (ZPair zpairResult1571 : ZVal.getIterable(rToArrayCast(this.recipient), env, true)) {
            recipient = ZVal.assign(zpairResult1571.getValue());
            if (!function_array_key_exists.f.env(env).call(recipient, to).getBool()) {
                env.callMethod(message, "addTo", Swift_Plugins_RedirectingPlugin.class, recipient);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "headerSet", typeHint = "Swift_Mime_SimpleHeaderSet")
    @ConvertedParameter(index = 1, name = "type")
    private Object filterHeaderSet(RuntimeEnv env, Object... args) {
        Object headerSet = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, false);
        Object headers = null;
        for (ZPair zpairResult1572 :
                ZVal.getIterable(
                        env.callMethod(
                                headerSet, "getAll", Swift_Plugins_RedirectingPlugin.class, type),
                        env,
                        true)) {
            headers = ZVal.assign(zpairResult1572.getValue());
            env.callMethod(
                    headers,
                    "setNameAddresses",
                    Swift_Plugins_RedirectingPlugin.class,
                    this.filterNameAddresses(
                            env,
                            env.callMethod(
                                    headers,
                                    "getNameAddresses",
                                    Swift_Plugins_RedirectingPlugin.class)));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "recipients", typeHint = "array")
    private Object filterNameAddresses(RuntimeEnv env, Object... args) {
        Object recipients = assignParameter(args, 0, false);
        Object address = null;
        ReferenceContainer filtered = new BasicReferenceContainer(null);
        Object name = null;
        filtered.setObject(ZVal.newArray());
        for (ZPair zpairResult1573 : ZVal.getIterable(recipients, env, false)) {
            address = ZVal.assign(zpairResult1573.getKey());
            name = ZVal.assign(zpairResult1573.getValue());
            if (ZVal.isTrue(this.isWhitelisted(env, address))) {
                filtered.arrayAccess(env, address).set(name);
            }
        }

        return ZVal.assign(filtered.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "recipient")
    protected Object isWhitelisted(RuntimeEnv env, Object... args) {
        Object recipient = assignParameter(args, 0, false);
        Object pattern = null;
        if (function_in_array.f.env(env).call(recipient, rToArrayCast(this.recipient)).getBool()) {
            return ZVal.assign(true);
        }

        for (ZPair zpairResult1574 : ZVal.getIterable(this.whitelist, env, true)) {
            pattern = ZVal.assign(zpairResult1574.getValue());
            if (function_preg_match.f.env(env).call(pattern, recipient).getBool()) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "evt", typeHint = "Swift_Events_SendEvent")
    public Object sendPerformed(RuntimeEnv env, Object... args) {
        Object evt = assignParameter(args, 0, false);
        this.restoreMessage(
                env, env.callMethod(evt, "getMessage", Swift_Plugins_RedirectingPlugin.class));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "Swift_Mime_SimpleMessage")
    private Object restoreMessage(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object headers = null;
        headers = env.callMethod(message, "getHeaders", Swift_Plugins_RedirectingPlugin.class);
        if (ZVal.isTrue(
                env.callMethod(
                        headers, "has", Swift_Plugins_RedirectingPlugin.class, "X-Swift-To"))) {
            env.callMethod(
                    message,
                    "setTo",
                    Swift_Plugins_RedirectingPlugin.class,
                    env.callMethod(
                            env.callMethod(
                                    headers,
                                    "get",
                                    Swift_Plugins_RedirectingPlugin.class,
                                    "X-Swift-To"),
                            "getNameAddresses",
                            Swift_Plugins_RedirectingPlugin.class));
            env.callMethod(
                    headers, "removeAll", Swift_Plugins_RedirectingPlugin.class, "X-Swift-To");

        } else {
            env.callMethod(message, "setTo", Swift_Plugins_RedirectingPlugin.class, ZVal.getNull());
        }

        if (ZVal.isTrue(
                env.callMethod(
                        headers, "has", Swift_Plugins_RedirectingPlugin.class, "X-Swift-Cc"))) {
            env.callMethod(
                    message,
                    "setCc",
                    Swift_Plugins_RedirectingPlugin.class,
                    env.callMethod(
                            env.callMethod(
                                    headers,
                                    "get",
                                    Swift_Plugins_RedirectingPlugin.class,
                                    "X-Swift-Cc"),
                            "getNameAddresses",
                            Swift_Plugins_RedirectingPlugin.class));
            env.callMethod(
                    headers, "removeAll", Swift_Plugins_RedirectingPlugin.class, "X-Swift-Cc");
        }

        if (ZVal.isTrue(
                env.callMethod(
                        headers, "has", Swift_Plugins_RedirectingPlugin.class, "X-Swift-Bcc"))) {
            env.callMethod(
                    message,
                    "setBcc",
                    Swift_Plugins_RedirectingPlugin.class,
                    env.callMethod(
                            env.callMethod(
                                    headers,
                                    "get",
                                    Swift_Plugins_RedirectingPlugin.class,
                                    "X-Swift-Bcc"),
                            "getNameAddresses",
                            Swift_Plugins_RedirectingPlugin.class));
            env.callMethod(
                    headers, "removeAll", Swift_Plugins_RedirectingPlugin.class, "X-Swift-Bcc");
        }

        return null;
    }

    public static final Object CONST_class = "Swift_Plugins_RedirectingPlugin";

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
                    .setName("Swift_Plugins_RedirectingPlugin")
                    .setLookup(
                            Swift_Plugins_RedirectingPlugin.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("recipient", "whitelist")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/RedirectingPlugin.php")
                    .addInterface("Swift_Events_SendListener")
                    .addInterface("Swift_Events_EventListener")
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
