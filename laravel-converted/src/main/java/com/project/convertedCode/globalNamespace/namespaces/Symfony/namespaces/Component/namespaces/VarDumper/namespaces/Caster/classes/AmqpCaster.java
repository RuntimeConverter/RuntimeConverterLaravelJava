package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.Caster;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.ConstStub;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Caster/AmqpCaster.php

*/

public class AmqpCaster extends RuntimeClassBase {

    public AmqpCaster(RuntimeEnv env, Object... args) {
        super(env);
    }

    public AmqpCaster(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Symfony\\Component\\VarDumper\\Caster\\AmqpCaster";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "c", typeHint = "AMQPConnection")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castConnection(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object prefix = null;
            Object timeout = null;
            prefix = ZVal.assign(Caster.CONST_PREFIX_VIRTUAL);
            a.setObject(
                    ZAssignment.add(
                            "+=",
                            a.getObject(),
                            ZVal.newArray(
                                    new ZPair(
                                            toStringR(prefix, env) + "is_connected",
                                            env.callMethod(c, "isConnected", AmqpCaster.class)))));
            if (arrayActionR(ArrayAction.ISSET, a, env, "\u0000AMQPConnection\u0000login")) {
                return ZVal.assign(a.getObject());
            }

            if (function_method_exists.f.env(env).call(c, "getReadTimeout").getBool()) {
                timeout = env.callMethod(c, "getReadTimeout", AmqpCaster.class);

            } else {
                timeout = env.callMethod(c, "getTimeout", AmqpCaster.class);
            }

            a.setObject(
                    ZAssignment.add(
                            "+=",
                            a.getObject(),
                            ZVal.newArray(
                                    new ZPair(
                                            toStringR(prefix, env) + "is_connected",
                                            env.callMethod(c, "isConnected", AmqpCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "login",
                                            env.callMethod(c, "getLogin", AmqpCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "password",
                                            env.callMethod(c, "getPassword", AmqpCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "host",
                                            env.callMethod(c, "getHost", AmqpCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "vhost",
                                            env.callMethod(c, "getVhost", AmqpCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "port",
                                            env.callMethod(c, "getPort", AmqpCaster.class)),
                                    new ZPair(toStringR(prefix, env) + "read_timeout", timeout))));
            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "c", typeHint = "AMQPChannel")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castChannel(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object prefix = null;
            prefix = ZVal.assign(Caster.CONST_PREFIX_VIRTUAL);
            a.setObject(
                    ZAssignment.add(
                            "+=",
                            a.getObject(),
                            ZVal.newArray(
                                    new ZPair(
                                            toStringR(prefix, env) + "is_connected",
                                            env.callMethod(c, "isConnected", AmqpCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "channel_id",
                                            env.callMethod(c, "getChannelId", AmqpCaster.class)))));
            if (arrayActionR(ArrayAction.ISSET, a, env, "\u0000AMQPChannel\u0000connection")) {
                return ZVal.assign(a.getObject());
            }

            a.setObject(
                    ZAssignment.add(
                            "+=",
                            a.getObject(),
                            ZVal.newArray(
                                    new ZPair(
                                            toStringR(prefix, env) + "connection",
                                            env.callMethod(c, "getConnection", AmqpCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "prefetch_size",
                                            env.callMethod(c, "getPrefetchSize", AmqpCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "prefetch_count",
                                            env.callMethod(
                                                    c, "getPrefetchCount", AmqpCaster.class)))));
            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "c", typeHint = "AMQPQueue")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castQueue(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object prefix = null;
            prefix = ZVal.assign(Caster.CONST_PREFIX_VIRTUAL);
            a.setObject(
                    ZAssignment.add(
                            "+=",
                            a.getObject(),
                            ZVal.newArray(
                                    new ZPair(
                                            toStringR(prefix, env) + "flags",
                                            runtimeStaticObject.extractFlags(
                                                    env,
                                                    env.callMethod(
                                                            c, "getFlags", AmqpCaster.class))))));
            if (arrayActionR(ArrayAction.ISSET, a, env, "\u0000AMQPQueue\u0000name")) {
                return ZVal.assign(a.getObject());
            }

            a.setObject(
                    ZAssignment.add(
                            "+=",
                            a.getObject(),
                            ZVal.newArray(
                                    new ZPair(
                                            toStringR(prefix, env) + "connection",
                                            env.callMethod(c, "getConnection", AmqpCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "channel",
                                            env.callMethod(c, "getChannel", AmqpCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "name",
                                            env.callMethod(c, "getName", AmqpCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "arguments",
                                            env.callMethod(c, "getArguments", AmqpCaster.class)))));
            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "c", typeHint = "AMQPExchange")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castExchange(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object prefix = null;
            Object type = null;
            prefix = ZVal.assign(Caster.CONST_PREFIX_VIRTUAL);
            a.setObject(
                    ZAssignment.add(
                            "+=",
                            a.getObject(),
                            ZVal.newArray(
                                    new ZPair(
                                            toStringR(prefix, env) + "flags",
                                            runtimeStaticObject.extractFlags(
                                                    env,
                                                    env.callMethod(
                                                            c, "getFlags", AmqpCaster.class))))));
            type =
                    ZVal.assign(
                            arrayActionR(
                                            ArrayAction.ISSET,
                                            env.getRequestStaticPropertiesReference(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Symfony
                                                            .namespaces
                                                            .Component
                                                            .namespaces
                                                            .VarDumper
                                                            .namespaces
                                                            .Caster
                                                            .classes
                                                            .AmqpCaster
                                                            .RequestStaticProperties
                                                            .class,
                                                    "exchangeTypes"),
                                            env,
                                            env.callMethod(c, "getType", AmqpCaster.class))
                                    ? new ConstStub(
                                            env,
                                            env.getRequestStaticPropertiesReference(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .Symfony
                                                                    .namespaces
                                                                    .Component
                                                                    .namespaces
                                                                    .VarDumper
                                                                    .namespaces
                                                                    .Caster
                                                                    .classes
                                                                    .AmqpCaster
                                                                    .RequestStaticProperties
                                                                    .class,
                                                            "exchangeTypes")
                                                    .arrayGet(
                                                            env,
                                                            env.callMethod(
                                                                    c,
                                                                    "getType",
                                                                    AmqpCaster.class)),
                                            env.callMethod(c, "getType", AmqpCaster.class))
                                    : env.callMethod(c, "getType", AmqpCaster.class));
            if (arrayActionR(ArrayAction.ISSET, a, env, "\u0000AMQPExchange\u0000name")) {
                a.arrayAccess(env, "\u0000AMQPExchange\u0000type").set(type);
                return ZVal.assign(a.getObject());
            }

            a.setObject(
                    ZAssignment.add(
                            "+=",
                            a.getObject(),
                            ZVal.newArray(
                                    new ZPair(
                                            toStringR(prefix, env) + "connection",
                                            env.callMethod(c, "getConnection", AmqpCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "channel",
                                            env.callMethod(c, "getChannel", AmqpCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "name",
                                            env.callMethod(c, "getName", AmqpCaster.class)),
                                    new ZPair(toStringR(prefix, env) + "type", type),
                                    new ZPair(
                                            toStringR(prefix, env) + "arguments",
                                            env.callMethod(c, "getArguments", AmqpCaster.class)))));
            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "c", typeHint = "AMQPEnvelope")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        @ConvertedParameter(
            index = 4,
            name = "filter",
            defaultValue = "0",
            defaultValueType = "number"
        )
        public Object castEnvelope(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object filter = assignParameter(args, 4, true);
            if (null == filter) {
                filter = 0;
            }
            Object deliveryMode = null;
            Object prefix = null;
            prefix = ZVal.assign(Caster.CONST_PREFIX_VIRTUAL);
            deliveryMode =
                    new ConstStub(
                            env,
                            toStringR(env.callMethod(c, "getDeliveryMode", AmqpCaster.class), env)
                                    + toStringR(
                                            ZVal.strictEqualityCheck(
                                                            2,
                                                            "===",
                                                            env.callMethod(
                                                                    c,
                                                                    "getDeliveryMode",
                                                                    AmqpCaster.class))
                                                    ? " (persistent)"
                                                    : " (non-persistent)",
                                            env),
                            env.callMethod(c, "getDeliveryMode", AmqpCaster.class));
            if (arrayActionR(ArrayAction.ISSET, a, env, "\u0000AMQPEnvelope\u0000body")) {
                a.arrayAccess(env, "\u0000AMQPEnvelope\u0000delivery_mode").set(deliveryMode);
                return ZVal.assign(a.getObject());
            }

            if (!ZVal.isTrue(ZVal.toLong(filter) & ZVal.toLong(Caster.CONST_EXCLUDE_VERBOSE))) {
                a.setObject(
                        ZAssignment.add(
                                "+=",
                                a.getObject(),
                                ZVal.newArray(
                                        new ZPair(
                                                toStringR(prefix, env) + "body",
                                                env.callMethod(c, "getBody", AmqpCaster.class)))));
            }

            a.setObject(
                    ZAssignment.add(
                            "+=",
                            a.getObject(),
                            ZVal.newArray(
                                    new ZPair(
                                            toStringR(prefix, env) + "delivery_tag",
                                            env.callMethod(c, "getDeliveryTag", AmqpCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "is_redelivery",
                                            env.callMethod(c, "isRedelivery", AmqpCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "exchange_name",
                                            env.callMethod(c, "getExchangeName", AmqpCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "routing_key",
                                            env.callMethod(c, "getRoutingKey", AmqpCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "content_type",
                                            env.callMethod(c, "getContentType", AmqpCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "content_encoding",
                                            env.callMethod(
                                                    c, "getContentEncoding", AmqpCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "headers",
                                            env.callMethod(c, "getHeaders", AmqpCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "delivery_mode", deliveryMode),
                                    new ZPair(
                                            toStringR(prefix, env) + "priority",
                                            env.callMethod(c, "getPriority", AmqpCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "correlation_id",
                                            env.callMethod(
                                                    c, "getCorrelationId", AmqpCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "reply_to",
                                            env.callMethod(c, "getReplyTo", AmqpCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "expiration",
                                            env.callMethod(c, "getExpiration", AmqpCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "message_id",
                                            env.callMethod(c, "getMessageId", AmqpCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "timestamp",
                                            env.callMethod(c, "getTimeStamp", AmqpCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "type",
                                            env.callMethod(c, "getType", AmqpCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "user_id",
                                            env.callMethod(c, "getUserId", AmqpCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "app_id",
                                            env.callMethod(c, "getAppId", AmqpCaster.class)))));
            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "flags")
        private Object extractFlags(RuntimeEnv env, Object... args) {
            Object flags = assignParameter(args, 0, false);
            Object name = null;
            Object value = null;
            ReferenceContainer flagsArray = new BasicReferenceContainer(null);
            flagsArray.setObject(ZVal.newArray());
            for (ZPair zpairResult2174 :
                    ZVal.getIterable(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Symfony
                                                    .namespaces
                                                    .Component
                                                    .namespaces
                                                    .VarDumper
                                                    .namespaces
                                                    .Caster
                                                    .classes
                                                    .AmqpCaster
                                                    .RequestStaticProperties
                                                    .class)
                                    .flags,
                            env,
                            false)) {
                value = ZVal.assign(zpairResult2174.getKey());
                name = ZVal.assign(zpairResult2174.getValue());
                if (ZVal.isTrue(ZVal.toLong(flags) & ZVal.toLong(value))) {
                    flagsArray.arrayAppend(env).set(name);
                }
            }

            if (!ZVal.isTrue(flagsArray.getObject())) {
                flagsArray.setObject(ZVal.arrayFromList("AMQP_NOPARAM"));
            }

            return ZVal.assign(
                    new ConstStub(
                            env,
                            NamespaceGlobal.implode
                                    .env(env)
                                    .call("|", flagsArray.getObject())
                                    .value(),
                            flags));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object flags =
                ZVal.newArray(
                        new ZPair("AMQP_DURABLE constant was not found", "AMQP_DURABLE"),
                        new ZPair("AMQP_PASSIVE constant was not found", "AMQP_PASSIVE"),
                        new ZPair("AMQP_EXCLUSIVE constant was not found", "AMQP_EXCLUSIVE"),
                        new ZPair("AMQP_AUTODELETE constant was not found", "AMQP_AUTODELETE"),
                        new ZPair("AMQP_INTERNAL constant was not found", "AMQP_INTERNAL"),
                        new ZPair("AMQP_NOLOCAL constant was not found", "AMQP_NOLOCAL"),
                        new ZPair("AMQP_AUTOACK constant was not found", "AMQP_AUTOACK"),
                        new ZPair("AMQP_IFEMPTY constant was not found", "AMQP_IFEMPTY"),
                        new ZPair("AMQP_IFUNUSED constant was not found", "AMQP_IFUNUSED"),
                        new ZPair("AMQP_MANDATORY constant was not found", "AMQP_MANDATORY"),
                        new ZPair("AMQP_IMMEDIATE constant was not found", "AMQP_IMMEDIATE"),
                        new ZPair("AMQP_MULTIPLE constant was not found", "AMQP_MULTIPLE"),
                        new ZPair("AMQP_NOWAIT constant was not found", "AMQP_NOWAIT"),
                        new ZPair("AMQP_REQUEUE constant was not found", "AMQP_REQUEUE"));

        public Object exchangeTypes =
                ZVal.newArray(
                        new ZPair(
                                "AMQP_EX_TYPE_DIRECT constant was not found",
                                "AMQP_EX_TYPE_DIRECT"),
                        new ZPair(
                                "AMQP_EX_TYPE_FANOUT constant was not found",
                                "AMQP_EX_TYPE_FANOUT"),
                        new ZPair(
                                "AMQP_EX_TYPE_TOPIC constant was not found", "AMQP_EX_TYPE_TOPIC"),
                        new ZPair(
                                "AMQP_EX_TYPE_HEADERS constant was not found",
                                "AMQP_EX_TYPE_HEADERS"));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\VarDumper\\Caster\\AmqpCaster")
                    .setLookup(
                            AmqpCaster.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("exchangeTypes", "flags")
                    .setFilename("vendor/symfony/var-dumper/Caster/AmqpCaster.php")
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
