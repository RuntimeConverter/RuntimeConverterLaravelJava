package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.nativeClasses.date.DateTimeImmutable;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_MimePart;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sscanf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/SimpleMessage.php

*/

public class Swift_Mime_SimpleMessage extends Swift_Mime_MimePart {

    public Swift_Mime_SimpleMessage(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Mime_SimpleMessage.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Mime_SimpleMessage(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "headers", typeHint = "Swift_Mime_SimpleHeaderSet")
    @ConvertedParameter(index = 1, name = "encoder", typeHint = "Swift_Mime_ContentEncoder")
    @ConvertedParameter(index = 2, name = "cache", typeHint = "Swift_KeyCache")
    @ConvertedParameter(index = 3, name = "idGenerator", typeHint = "Swift_IdGenerator")
    @ConvertedParameter(
        index = 4,
        name = "charset",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object headers = assignParameter(args, 0, false);
        Object encoder = assignParameter(args, 1, false);
        Object cache = assignParameter(args, 2, false);
        Object idGenerator = assignParameter(args, 3, false);
        Object charset = assignParameter(args, 4, true);
        if (null == charset) {
            charset = ZVal.getNull();
        }
        super.__construct(env, headers, encoder, cache, idGenerator, charset);
        env.callMethod(
                env.callMethod(this, "getHeaders", Swift_Mime_SimpleMessage.class),
                "defineOrdering",
                Swift_Mime_SimpleMessage.class,
                ZVal.arrayFromList(
                        "Return-Path",
                        "Received",
                        "DKIM-Signature",
                        "DomainKey-Signature",
                        "Sender",
                        "Message-ID",
                        "Date",
                        "Subject",
                        "From",
                        "Reply-To",
                        "To",
                        "Cc",
                        "Bcc",
                        "MIME-Version",
                        "Content-Type",
                        "Content-Transfer-Encoding"));
        env.callMethod(
                env.callMethod(this, "getHeaders", Swift_Mime_SimpleMessage.class),
                "setAlwaysDisplayed",
                Swift_Mime_SimpleMessage.class,
                ZVal.arrayFromList("Date", "Message-ID", "From"));
        env.callMethod(
                env.callMethod(this, "getHeaders", Swift_Mime_SimpleMessage.class),
                "addTextHeader",
                Swift_Mime_SimpleMessage.class,
                "MIME-Version",
                "1.0");
        this.setDate(env, new DateTimeImmutable(env));
        env.callMethod(
                this,
                "setId",
                Swift_Mime_SimpleMessage.class,
                env.callMethod(this, "getId", Swift_Mime_SimpleMessage.class));
        env.callMethod(
                env.callMethod(this, "getHeaders", Swift_Mime_SimpleMessage.class),
                "addMailboxHeader",
                Swift_Mime_SimpleMessage.class,
                "From");
        return null;
    }

    @ConvertedMethod
    public Object getNestingLevel(RuntimeEnv env, Object... args) {
        return ZVal.assign(CONST_LEVEL_TOP);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "subject")
    public Object setSubject(RuntimeEnv env, Object... args) {
        Object subject = assignParameter(args, 0, false);
        if (!ZVal.isTrue(
                env.callMethod(
                        this,
                        "setHeaderFieldModel",
                        Swift_Mime_SimpleMessage.class,
                        "Subject",
                        subject))) {
            env.callMethod(
                    env.callMethod(this, "getHeaders", Swift_Mime_SimpleMessage.class),
                    "addTextHeader",
                    Swift_Mime_SimpleMessage.class,
                    "Subject",
                    subject);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getSubject(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this, "getHeaderFieldModel", Swift_Mime_SimpleMessage.class, "Subject"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dateTime", typeHint = "DateTimeInterface")
    public Object setDate(RuntimeEnv env, Object... args) {
        Object dateTime = assignParameter(args, 0, false);
        if (!ZVal.isTrue(
                env.callMethod(
                        this,
                        "setHeaderFieldModel",
                        Swift_Mime_SimpleMessage.class,
                        "Date",
                        dateTime))) {
            env.callMethod(
                    env.callMethod(this, "getHeaders", Swift_Mime_SimpleMessage.class),
                    "addDateHeader",
                    Swift_Mime_SimpleMessage.class,
                    "Date",
                    dateTime);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getDate(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this, "getHeaderFieldModel", Swift_Mime_SimpleMessage.class, "Date"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    public Object setReturnPath(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        if (!ZVal.isTrue(
                env.callMethod(
                        this,
                        "setHeaderFieldModel",
                        Swift_Mime_SimpleMessage.class,
                        "Return-Path",
                        address))) {
            env.callMethod(
                    env.callMethod(this, "getHeaders", Swift_Mime_SimpleMessage.class),
                    "addPathHeader",
                    Swift_Mime_SimpleMessage.class,
                    "Return-Path",
                    address);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getReturnPath(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this,
                        "getHeaderFieldModel",
                        Swift_Mime_SimpleMessage.class,
                        "Return-Path"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setSender(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        if (ZVal.toBool(!function_is_array.f.env(env).call(address).getBool())
                && ZVal.toBool(ZVal.isset(name))) {
            address = ZVal.newArray(new ZPair(address, name));
        }

        if (!ZVal.isTrue(
                env.callMethod(
                        this,
                        "setHeaderFieldModel",
                        Swift_Mime_SimpleMessage.class,
                        "Sender",
                        rToArrayCast(address)))) {
            env.callMethod(
                    env.callMethod(this, "getHeaders", Swift_Mime_SimpleMessage.class),
                    "addMailboxHeader",
                    Swift_Mime_SimpleMessage.class,
                    "Sender",
                    rToArrayCast(address));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getSender(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this, "getHeaderFieldModel", Swift_Mime_SimpleMessage.class, "Sender"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object addFrom(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        ReferenceContainer current = new BasicReferenceContainer(null);
        current.setObject(this.getFrom(env));
        current.arrayAccess(env, address).set(name);
        return ZVal.assign(this.setFrom(env, current.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "addresses")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setFrom(RuntimeEnv env, Object... args) {
        Object addresses = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        if (ZVal.toBool(!function_is_array.f.env(env).call(addresses).getBool())
                && ZVal.toBool(ZVal.isset(name))) {
            addresses = ZVal.newArray(new ZPair(addresses, name));
        }

        if (!ZVal.isTrue(
                env.callMethod(
                        this,
                        "setHeaderFieldModel",
                        Swift_Mime_SimpleMessage.class,
                        "From",
                        rToArrayCast(addresses)))) {
            env.callMethod(
                    env.callMethod(this, "getHeaders", Swift_Mime_SimpleMessage.class),
                    "addMailboxHeader",
                    Swift_Mime_SimpleMessage.class,
                    "From",
                    rToArrayCast(addresses));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getFrom(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this, "getHeaderFieldModel", Swift_Mime_SimpleMessage.class, "From"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object addReplyTo(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        ReferenceContainer current = new BasicReferenceContainer(null);
        current.setObject(this.getReplyTo(env));
        current.arrayAccess(env, address).set(name);
        return ZVal.assign(this.setReplyTo(env, current.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "addresses")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setReplyTo(RuntimeEnv env, Object... args) {
        Object addresses = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        if (ZVal.toBool(!function_is_array.f.env(env).call(addresses).getBool())
                && ZVal.toBool(ZVal.isset(name))) {
            addresses = ZVal.newArray(new ZPair(addresses, name));
        }

        if (!ZVal.isTrue(
                env.callMethod(
                        this,
                        "setHeaderFieldModel",
                        Swift_Mime_SimpleMessage.class,
                        "Reply-To",
                        rToArrayCast(addresses)))) {
            env.callMethod(
                    env.callMethod(this, "getHeaders", Swift_Mime_SimpleMessage.class),
                    "addMailboxHeader",
                    Swift_Mime_SimpleMessage.class,
                    "Reply-To",
                    rToArrayCast(addresses));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getReplyTo(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this, "getHeaderFieldModel", Swift_Mime_SimpleMessage.class, "Reply-To"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object addTo(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        ReferenceContainer current = new BasicReferenceContainer(null);
        current.setObject(this.getTo(env));
        current.arrayAccess(env, address).set(name);
        return ZVal.assign(this.setTo(env, current.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "addresses")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setTo(RuntimeEnv env, Object... args) {
        Object addresses = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        if (ZVal.toBool(!function_is_array.f.env(env).call(addresses).getBool())
                && ZVal.toBool(ZVal.isset(name))) {
            addresses = ZVal.newArray(new ZPair(addresses, name));
        }

        if (!ZVal.isTrue(
                env.callMethod(
                        this,
                        "setHeaderFieldModel",
                        Swift_Mime_SimpleMessage.class,
                        "To",
                        rToArrayCast(addresses)))) {
            env.callMethod(
                    env.callMethod(this, "getHeaders", Swift_Mime_SimpleMessage.class),
                    "addMailboxHeader",
                    Swift_Mime_SimpleMessage.class,
                    "To",
                    rToArrayCast(addresses));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getTo(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(this, "getHeaderFieldModel", Swift_Mime_SimpleMessage.class, "To"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object addCc(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        ReferenceContainer current = new BasicReferenceContainer(null);
        current.setObject(this.getCc(env));
        current.arrayAccess(env, address).set(name);
        return ZVal.assign(this.setCc(env, current.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "addresses")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setCc(RuntimeEnv env, Object... args) {
        Object addresses = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        if (ZVal.toBool(!function_is_array.f.env(env).call(addresses).getBool())
                && ZVal.toBool(ZVal.isset(name))) {
            addresses = ZVal.newArray(new ZPair(addresses, name));
        }

        if (!ZVal.isTrue(
                env.callMethod(
                        this,
                        "setHeaderFieldModel",
                        Swift_Mime_SimpleMessage.class,
                        "Cc",
                        rToArrayCast(addresses)))) {
            env.callMethod(
                    env.callMethod(this, "getHeaders", Swift_Mime_SimpleMessage.class),
                    "addMailboxHeader",
                    Swift_Mime_SimpleMessage.class,
                    "Cc",
                    rToArrayCast(addresses));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getCc(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(this, "getHeaderFieldModel", Swift_Mime_SimpleMessage.class, "Cc"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object addBcc(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        ReferenceContainer current = new BasicReferenceContainer(null);
        current.setObject(this.getBcc(env));
        current.arrayAccess(env, address).set(name);
        return ZVal.assign(this.setBcc(env, current.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "addresses")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setBcc(RuntimeEnv env, Object... args) {
        Object addresses = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        if (ZVal.toBool(!function_is_array.f.env(env).call(addresses).getBool())
                && ZVal.toBool(ZVal.isset(name))) {
            addresses = ZVal.newArray(new ZPair(addresses, name));
        }

        if (!ZVal.isTrue(
                env.callMethod(
                        this,
                        "setHeaderFieldModel",
                        Swift_Mime_SimpleMessage.class,
                        "Bcc",
                        rToArrayCast(addresses)))) {
            env.callMethod(
                    env.callMethod(this, "getHeaders", Swift_Mime_SimpleMessage.class),
                    "addMailboxHeader",
                    Swift_Mime_SimpleMessage.class,
                    "Bcc",
                    rToArrayCast(addresses));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getBcc(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(this, "getHeaderFieldModel", Swift_Mime_SimpleMessage.class, "Bcc"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "priority")
    public Object setPriority(RuntimeEnv env, Object... args) {
        Object priority = assignParameter(args, 0, false);
        Object pMapKeys = null;
        ReferenceContainer priorityMap = new BasicReferenceContainer(null);
        priorityMap.setObject(
                ZVal.newArray(
                        new ZPair(CONST_PRIORITY_HIGHEST, "Highest"),
                        new ZPair(CONST_PRIORITY_HIGH, "High"),
                        new ZPair(CONST_PRIORITY_NORMAL, "Normal"),
                        new ZPair(CONST_PRIORITY_LOW, "Low"),
                        new ZPair(CONST_PRIORITY_LOWEST, "Lowest")));
        pMapKeys = function_array_keys.f.env(env).call(priorityMap.getObject()).value();
        if (ZVal.isGreaterThan(
                priority, '>', NamespaceGlobal.max.env(env).call(pMapKeys).value())) {
            priority = NamespaceGlobal.max.env(env).call(pMapKeys).value();

        } else if (ZVal.isLessThan(
                priority, '<', NamespaceGlobal.min.env(env).call(pMapKeys).value())) {
            priority = NamespaceGlobal.min.env(env).call(pMapKeys).value();
        }

        if (!ZVal.isTrue(
                env.callMethod(
                        this,
                        "setHeaderFieldModel",
                        Swift_Mime_SimpleMessage.class,
                        "X-Priority",
                        function_sprintf
                                .f
                                .env(env)
                                .call("%d (%s)", priority, priorityMap.arrayGet(env, priority))
                                .value()))) {
            env.callMethod(
                    env.callMethod(this, "getHeaders", Swift_Mime_SimpleMessage.class),
                    "addTextHeader",
                    Swift_Mime_SimpleMessage.class,
                    "X-Priority",
                    function_sprintf
                            .f
                            .env(env)
                            .call("%d (%s)", priority, priorityMap.arrayGet(env, priority))
                            .value());
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getPriority(RuntimeEnv env, Object... args) {
        Object runtimeTempArrayResult159 = null;
        Object ternaryExpressionTemp = null;
        Object priority = null;
        ZVal.list(
                runtimeTempArrayResult159 =
                        function_sscanf
                                .f
                                .env(env)
                                .call(
                                        env.callMethod(
                                                this,
                                                "getHeaderFieldModel",
                                                Swift_Mime_SimpleMessage.class,
                                                "X-Priority"),
                                        "%[1-5]")
                                .value(),
                (priority = listGet(runtimeTempArrayResult159, 0, env)));
        return ZVal.assign(
                ZVal.isDefined(ternaryExpressionTemp = priority) ? ternaryExpressionTemp : 3);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "addresses")
    public Object setReadReceiptTo(RuntimeEnv env, Object... args) {
        Object addresses = assignParameter(args, 0, false);
        if (!ZVal.isTrue(
                env.callMethod(
                        this,
                        "setHeaderFieldModel",
                        Swift_Mime_SimpleMessage.class,
                        "Disposition-Notification-To",
                        addresses))) {
            env.callMethod(
                    env.callMethod(this, "getHeaders", Swift_Mime_SimpleMessage.class),
                    "addMailboxHeader",
                    Swift_Mime_SimpleMessage.class,
                    "Disposition-Notification-To",
                    addresses);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getReadReceiptTo(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this,
                        "getHeaderFieldModel",
                        Swift_Mime_SimpleMessage.class,
                        "Disposition-Notification-To"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "entity", typeHint = "Swift_Mime_SimpleMimeEntity")
    public Object attach(RuntimeEnv env, Object... args) {
        Object entity = assignParameter(args, 0, false);
        env.callMethod(
                this,
                "setChildren",
                Swift_Mime_SimpleMessage.class,
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                env.callMethod(this, "getChildren", Swift_Mime_SimpleMessage.class),
                                ZVal.newArray(new ZPair(0, entity)))
                        .value());
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "entity", typeHint = "Swift_Mime_SimpleMimeEntity")
    public Object detach(RuntimeEnv env, Object... args) {
        Object entity = assignParameter(args, 0, false);
        ReferenceContainer newChildren = new BasicReferenceContainer(null);
        Object child = null;
        newChildren.setObject(ZVal.newArray());
        for (ZPair zpairResult1550 :
                ZVal.getIterable(
                        env.callMethod(this, "getChildren", Swift_Mime_SimpleMessage.class),
                        env,
                        true)) {
            child = ZVal.assign(zpairResult1550.getValue());
            if (ZVal.strictNotEqualityCheck(entity, "!==", child)) {
                newChildren.arrayAppend(env).set(child);
            }
        }

        env.callMethod(
                this, "setChildren", Swift_Mime_SimpleMessage.class, newChildren.getObject());
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "entity", typeHint = "Swift_Mime_SimpleMimeEntity")
    public Object embed(RuntimeEnv env, Object... args) {
        Object entity = assignParameter(args, 0, false);
        this.attach(env, entity);
        return ZVal.assign(
                "cid:"
                        + toStringR(
                                env.callMethod(entity, "getId", Swift_Mime_SimpleMessage.class),
                                env));
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        Object string = null;
        Object children = null;
        if (ZVal.toBool(
                        ZVal.isGreaterThan(
                                function_count
                                        .f
                                        .env(env)
                                        .call(
                                                children =
                                                        env.callMethod(
                                                                this,
                                                                "getChildren",
                                                                Swift_Mime_SimpleMessage.class))
                                        .value(),
                                '>',
                                0))
                && ZVal.toBool(
                        ZVal.notEqualityCheck(
                                "",
                                env.callMethod(this, "getBody", Swift_Mime_SimpleMessage.class)))) {
            env.callMethod(
                    this,
                    "setChildren",
                    Swift_Mime_SimpleMessage.class,
                    function_array_merge
                            .f
                            .env(env)
                            .call(ZVal.newArray(new ZPair(0, this.becomeMimePart(env))), children)
                            .value());
            string = super.toString(env);
            env.callMethod(this, "setChildren", Swift_Mime_SimpleMessage.class, children);

        } else {
            string = super.toString(env);
        }

        return ZVal.assign(string);
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.toString(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "is", typeHint = "Swift_InputByteStream")
    public Object toByteStream(RuntimeEnv env, Object... args) {
        Object is = assignParameter(args, 0, false);
        Object children = null;
        if (ZVal.toBool(
                        ZVal.isGreaterThan(
                                function_count
                                        .f
                                        .env(env)
                                        .call(
                                                children =
                                                        env.callMethod(
                                                                this,
                                                                "getChildren",
                                                                Swift_Mime_SimpleMessage.class))
                                        .value(),
                                '>',
                                0))
                && ZVal.toBool(
                        ZVal.notEqualityCheck(
                                "",
                                env.callMethod(this, "getBody", Swift_Mime_SimpleMessage.class)))) {
            env.callMethod(
                    this,
                    "setChildren",
                    Swift_Mime_SimpleMessage.class,
                    function_array_merge
                            .f
                            .env(env)
                            .call(ZVal.newArray(new ZPair(0, this.becomeMimePart(env))), children)
                            .value());
            super.toByteStream(env, is);
            env.callMethod(this, "setChildren", Swift_Mime_SimpleMessage.class, children);

        } else {
            super.toByteStream(env, is);
        }

        return null;
    }

    @ConvertedMethod
    protected Object getIdField(RuntimeEnv env, Object... args) {
        return "Message-ID";
    }

    @ConvertedMethod
    protected Object becomeMimePart(RuntimeEnv env, Object... args) {
        Object part = null;
        part =
                new Swift_Mime_MimePart(
                        env,
                        env.callMethod(
                                env.callMethod(this, "getHeaders", Swift_Mime_SimpleMessage.class),
                                "newInstance",
                                Swift_Mime_SimpleMessage.class),
                        env.callMethod(this, "getEncoder", Swift_Mime_SimpleMessage.class),
                        env.callMethod(this, "getCache", Swift_Mime_SimpleMessage.class),
                        env.callMethod(this, "getIdGenerator", Swift_Mime_SimpleMessage.class),
                        toObjectR(this).accessProp(this, env).name("userCharset").value());
        env.callMethod(
                part,
                "setContentType",
                Swift_Mime_SimpleMessage.class,
                toObjectR(this).accessProp(this, env).name("userContentType").value());
        env.callMethod(
                part,
                "setBody",
                Swift_Mime_SimpleMessage.class,
                env.callMethod(this, "getBody", Swift_Mime_SimpleMessage.class));
        env.callMethod(
                part,
                "setFormat",
                Swift_Mime_SimpleMessage.class,
                toObjectR(this).accessProp(this, env).name("userFormat").value());
        env.callMethod(
                part,
                "setDelSp",
                Swift_Mime_SimpleMessage.class,
                toObjectR(this).accessProp(this, env).name("userDelSp").value());
        env.callMethod(
                part,
                "setNestingLevel",
                Swift_Mime_SimpleMessage.class,
                this.getTopNestingLevel(env));
        return ZVal.assign(part);
    }

    @ConvertedMethod
    private Object getTopNestingLevel(RuntimeEnv env, Object... args) {
        Object highestLevel = null;
        Object childLevel = null;
        Object child = null;
        highestLevel = this.getNestingLevel(env);
        for (ZPair zpairResult1551 :
                ZVal.getIterable(
                        env.callMethod(this, "getChildren", Swift_Mime_SimpleMessage.class),
                        env,
                        true)) {
            child = ZVal.assign(zpairResult1551.getValue());
            childLevel = env.callMethod(child, "getNestingLevel", Swift_Mime_SimpleMessage.class);
            if (ZVal.isLessThan(highestLevel, '<', childLevel)) {
                highestLevel = ZVal.assign(childLevel);
            }
        }

        return ZVal.assign(highestLevel);
    }

    public static final Object CONST_PRIORITY_HIGHEST = 1;

    public static final Object CONST_PRIORITY_HIGH = 2;

    public static final Object CONST_PRIORITY_NORMAL = 3;

    public static final Object CONST_PRIORITY_LOW = 4;

    public static final Object CONST_PRIORITY_LOWEST = 5;

    public static final Object CONST_class = "Swift_Mime_SimpleMessage";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Swift_Mime_MimePart.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Mime_SimpleMessage")
                    .setLookup(
                            Swift_Mime_SimpleMessage.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "alternativePartOrder",
                            "body",
                            "boundary",
                            "cache",
                            "cacheKey",
                            "children",
                            "compositeRanges",
                            "compoundLevelFilters",
                            "encoder",
                            "headers",
                            "id",
                            "idGenerator",
                            "immediateChildren",
                            "maxLineLength",
                            "nestingLevel",
                            "nestingLevel",
                            "userCharset",
                            "userContentType",
                            "userDelSp",
                            "userFormat")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/SimpleMessage.php")
                    .addInterface("Swift_Mime_CharsetObserver")
                    .addInterface("Swift_Mime_EncodingObserver")
                    .addExtendsClass("Swift_Mime_MimePart")
                    .addExtendsClass("Swift_Mime_SimpleMimeEntity")
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
