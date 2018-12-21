package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Swift_Plugins_Decorator_Replacements;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sscanf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.project.convertedCode.globalNamespace.classes.Swift_Events_SendListener;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/DecoratorPlugin.php

*/

public class Swift_Plugins_DecoratorPlugin extends RuntimeClassBase
        implements Swift_Events_SendListener, Swift_Plugins_Decorator_Replacements {

    public Object replacements = null;

    public Object originalBody = null;

    public Object originalHeaders = ZVal.newArray();

    public Object originalChildBodies = ZVal.newArray();

    public Object lastMessage = null;

    public Swift_Plugins_DecoratorPlugin(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Plugins_DecoratorPlugin.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Plugins_DecoratorPlugin(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "replacements")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object replacements = assignParameter(args, 0, false);
        this.setReplacements(env, replacements);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "replacements")
    public Object setReplacements(RuntimeEnv env, Object... args) {
        Object replacements = assignParameter(args, 0, false);
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        replacements,
                        Swift_Plugins_Decorator_Replacements.class,
                        "Swift_Plugins_Decorator_Replacements"))) {
            this.replacements = rToArrayCast(replacements);

        } else {
            this.replacements = replacements;
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "evt", typeHint = "Swift_Events_SendEvent")
    public Object beforeSendPerformed(RuntimeEnv env, Object... args) {
        Object evt = assignParameter(args, 0, false);
        ReferenceContainer count1 = new BasicReferenceContainer(null);
        ReferenceContainer count2 = new BasicReferenceContainer(null);
        Object address = null;
        Object replace = null;
        ReferenceContainer count = new BasicReferenceContainer(null);
        Object message = null;
        Object body = null;
        Object type = null;
        Object search = null;
        ReferenceContainer bodyReplaced = new BasicReferenceContainer(null);
        Object children = null;
        Object header = null;
        Object runtimeTempArrayResult160 = null;
        Object to = null;
        Object replacements = null;
        Object value = null;
        Object key = null;
        Object child = null;
        message = env.callMethod(evt, "getMessage", Swift_Plugins_DecoratorPlugin.class);
        this.restoreMessage(env, message);
        to =
                function_array_keys
                        .f
                        .env(env)
                        .call(env.callMethod(message, "getTo", Swift_Plugins_DecoratorPlugin.class))
                        .value();
        address = function_array_shift.f.env(env).call(to).value();
        if (ZVal.isTrue(replacements = this.getReplacementsFor(env, address))) {
            body = env.callMethod(message, "getBody", Swift_Plugins_DecoratorPlugin.class);
            search = function_array_keys.f.env(env).call(replacements).value();
            replace = function_array_values.f.env(env).call(replacements).value();
            bodyReplaced.setObject(
                    function_str_replace.f.env(env).call(search, replace, body).value());
            if (ZVal.notEqualityCheck(body, bodyReplaced.getObject())) {
                this.originalBody = body;
                env.callMethod(
                        message,
                        "setBody",
                        Swift_Plugins_DecoratorPlugin.class,
                        bodyReplaced.getObject());
            }

            for (ZPair zpairResult1566 :
                    ZVal.getIterable(
                            env.callMethod(
                                    env.callMethod(
                                            message,
                                            "getHeaders",
                                            Swift_Plugins_DecoratorPlugin.class),
                                    "getAll",
                                    Swift_Plugins_DecoratorPlugin.class),
                            env,
                            true)) {
                header = ZVal.assign(zpairResult1566.getValue());
                body =
                        env.callMethod(
                                header, "getFieldBodyModel", Swift_Plugins_DecoratorPlugin.class);
                count.setObject(0);
                if (function_is_array.f.env(env).call(body).getBool()) {
                    bodyReplaced.setObject(ZVal.newArray());
                    for (ZPair zpairResult1567 : ZVal.getIterable(body, env, false)) {
                        key = ZVal.assign(zpairResult1567.getKey());
                        value = ZVal.assign(zpairResult1567.getValue());
                        count1.setObject(0);
                        count2.setObject(0);
                        key =
                                ZVal.assign(
                                        function_is_string.f.env(env).call(key).getBool()
                                                ? function_str_replace
                                                        .f
                                                        .env(env)
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences()
                                                                        .add(3, count1))
                                                        .call(
                                                                search,
                                                                replace,
                                                                key,
                                                                count1.getObject())
                                                        .value()
                                                : key);
                        value =
                                ZVal.assign(
                                        function_is_string.f.env(env).call(value).getBool()
                                                ? function_str_replace
                                                        .f
                                                        .env(env)
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences()
                                                                        .add(3, count2))
                                                        .call(
                                                                search,
                                                                replace,
                                                                value,
                                                                count2.getObject())
                                                        .value()
                                                : value);
                        bodyReplaced.arrayAccess(env, key).set(value);
                        if (ZVal.toBool(!ZVal.isTrue(count.getObject()))
                                && ZVal.toBool(
                                        ZVal.toBool(count1.getObject())
                                                || ZVal.toBool(count2.getObject()))) {
                            count.setObject(1);
                        }
                    }

                } else if (function_is_string.f.env(env).call(body).getBool()) {
                    bodyReplaced.setObject(
                            function_str_replace
                                    .f
                                    .env(env)
                                    .addReferenceArgs(new RuntimeArgsWithReferences().add(3, count))
                                    .call(search, replace, body, count.getObject())
                                    .value());
                }

                if (ZVal.isTrue(count.getObject())) {
                    new ReferenceClassProperty(this, "originalHeaders", env)
                            .arrayAccess(
                                    env,
                                    env.callMethod(
                                            header,
                                            "getFieldName",
                                            Swift_Plugins_DecoratorPlugin.class))
                            .set(body);
                    env.callMethod(
                            header,
                            "setFieldBodyModel",
                            Swift_Plugins_DecoratorPlugin.class,
                            bodyReplaced.getObject());
                }
            }

            children =
                    ZVal.assign(
                            rToArrayCast(
                                    env.callMethod(
                                            message,
                                            "getChildren",
                                            Swift_Plugins_DecoratorPlugin.class)));
            for (ZPair zpairResult1568 : ZVal.getIterable(children, env, true)) {
                child = ZVal.assign(zpairResult1568.getValue());
                ZVal.list(
                        runtimeTempArrayResult160 =
                                function_sscanf
                                        .f
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        child,
                                                        "getContentType",
                                                        Swift_Plugins_DecoratorPlugin.class),
                                                "%[^/]/%s")
                                        .value(),
                        (type = listGet(runtimeTempArrayResult160, 0, env)));
                if (ZVal.equalityCheck("text", type)) {
                    body = env.callMethod(child, "getBody", Swift_Plugins_DecoratorPlugin.class);
                    bodyReplaced.setObject(
                            function_str_replace.f.env(env).call(search, replace, body).value());
                    if (ZVal.notEqualityCheck(body, bodyReplaced.getObject())) {
                        env.callMethod(
                                child,
                                "setBody",
                                Swift_Plugins_DecoratorPlugin.class,
                                bodyReplaced.getObject());
                        new ReferenceClassProperty(this, "originalChildBodies", env)
                                .arrayAccess(
                                        env,
                                        env.callMethod(
                                                child,
                                                "getId",
                                                Swift_Plugins_DecoratorPlugin.class))
                                .set(body);
                    }
                }
            }

            this.lastMessage = message;
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    public Object getReplacementsFor(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        this.replacements,
                        Swift_Plugins_Decorator_Replacements.class,
                        "Swift_Plugins_Decorator_Replacements"))) {
            return ZVal.assign(
                    env.callMethod(
                            this.replacements,
                            "getReplacementsFor",
                            Swift_Plugins_DecoratorPlugin.class,
                            address));
        }

        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        new ReferenceClassProperty(this, "replacements", env)
                                                .arrayGet(env, address))
                        ? ternaryExpressionTemp
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "evt", typeHint = "Swift_Events_SendEvent")
    public Object sendPerformed(RuntimeEnv env, Object... args) {
        Object evt = assignParameter(args, 0, false);
        this.restoreMessage(
                env, env.callMethod(evt, "getMessage", Swift_Plugins_DecoratorPlugin.class));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "Swift_Mime_SimpleMessage")
    private Object restoreMessage(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object children = null;
        Object header = null;
        Object id = null;
        Object child = null;
        if (ZVal.strictEqualityCheck(this.lastMessage, "===", message)) {
            if (ZVal.isset(this.originalBody)) {
                env.callMethod(
                        message, "setBody", Swift_Plugins_DecoratorPlugin.class, this.originalBody);
                this.originalBody = ZVal.getNull();
            }

            if (!ZVal.isEmpty(this.originalHeaders)) {
                for (ZPair zpairResult1569 :
                        ZVal.getIterable(
                                env.callMethod(
                                        env.callMethod(
                                                message,
                                                "getHeaders",
                                                Swift_Plugins_DecoratorPlugin.class),
                                        "getAll",
                                        Swift_Plugins_DecoratorPlugin.class),
                                env,
                                true)) {
                    header = ZVal.assign(zpairResult1569.getValue());
                    if (function_array_key_exists
                            .f
                            .env(env)
                            .call(
                                    env.callMethod(
                                            header,
                                            "getFieldName",
                                            Swift_Plugins_DecoratorPlugin.class),
                                    this.originalHeaders)
                            .getBool()) {
                        env.callMethod(
                                header,
                                "setFieldBodyModel",
                                Swift_Plugins_DecoratorPlugin.class,
                                new ReferenceClassProperty(this, "originalHeaders", env)
                                        .arrayGet(
                                                env,
                                                env.callMethod(
                                                        header,
                                                        "getFieldName",
                                                        Swift_Plugins_DecoratorPlugin.class)));
                    }
                }

                this.originalHeaders = ZVal.newArray();
            }

            if (!ZVal.isEmpty(this.originalChildBodies)) {
                children =
                        ZVal.assign(
                                rToArrayCast(
                                        env.callMethod(
                                                message,
                                                "getChildren",
                                                Swift_Plugins_DecoratorPlugin.class)));
                for (ZPair zpairResult1570 : ZVal.getIterable(children, env, true)) {
                    child = ZVal.assign(zpairResult1570.getValue());
                    id = env.callMethod(child, "getId", Swift_Plugins_DecoratorPlugin.class);
                    if (function_array_key_exists
                            .f
                            .env(env)
                            .call(id, this.originalChildBodies)
                            .getBool()) {
                        env.callMethod(
                                child,
                                "setBody",
                                Swift_Plugins_DecoratorPlugin.class,
                                new ReferenceClassProperty(this, "originalChildBodies", env)
                                        .arrayGet(env, id));
                    }
                }

                this.originalChildBodies = ZVal.newArray();
            }

            this.lastMessage = ZVal.getNull();
        }

        return null;
    }

    public static final Object CONST_class = "Swift_Plugins_DecoratorPlugin";

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
                    .setName("Swift_Plugins_DecoratorPlugin")
                    .setLookup(
                            Swift_Plugins_DecoratorPlugin.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "lastMessage",
                            "originalBody",
                            "originalChildBodies",
                            "originalHeaders",
                            "replacements")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/DecoratorPlugin.php")
                    .addInterface("Swift_Events_SendListener")
                    .addInterface("Swift_Events_EventListener")
                    .addInterface("Swift_Plugins_Decorator_Replacements")
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
