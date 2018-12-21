package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes;

import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Jsonable;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Arrayable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.MessageProvider;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeInterfaces.JsonSerializable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge_recursive;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/MessageBag.php

*/

public class MessageBag extends RuntimeClassBase
        implements Arrayable,
                Countable,
                Jsonable,
                JsonSerializable,
                com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Illuminate
                        .namespaces
                        .Contracts
                        .namespaces
                        .Support
                        .classes
                        .MessageBag,
                MessageProvider {

    public Object messages = ZVal.newArray();

    public Object format = ":message";

    public MessageBag(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MessageBag.class) {
            this.__construct(env, args);
        }
    }

    public MessageBag(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "messages",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object messages = assignParameter(args, 0, true);
        if (null == messages) {
            messages = ZVal.newArray();
        }
        Object value = null;
        Object key = null;
        for (ZPair zpairResult576 : ZVal.getIterable(messages, env, false)) {
            key = ZVal.assign(zpairResult576.getKey());
            value = ZVal.assign(zpairResult576.getValue());
            new ReferenceClassProperty(this, "messages", env)
                    .arrayAccess(env, key)
                    .set(
                            ZVal.isTrue(
                                            ZVal.checkInstanceType(
                                                    value,
                                                    Arrayable.class,
                                                    "Illuminate\\Contracts\\Support\\Arrayable"))
                                    ? env.callMethod(value, "toArray", MessageBag.class)
                                    : rToArrayCast(value));
        }

        return null;
    }

    @ConvertedMethod
    public Object keys(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_array_keys.f.env(env).call(this.messages).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "message")
    public Object add(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, false);
        if (ZVal.isTrue(this.isUnique(env, key, message))) {
            new ReferenceClassProperty(this, "messages", env).arrayAppend(env, key).set(message);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "message")
    protected Object isUnique(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, false);
        ReferenceContainer messages = new BasicReferenceContainer(null);
        messages.setObject(ZVal.assign(rToArrayCast(this.messages)));
        return ZVal.assign(
                ZVal.toBool(!arrayActionR(ArrayAction.ISSET, messages, env, key))
                        || ZVal.toBool(
                                !function_in_array
                                        .f
                                        .env(env)
                                        .call(message, messages.arrayGet(env, key))
                                        .getBool()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messages")
    public Object merge(RuntimeEnv env, Object... args) {
        Object messages = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        messages,
                        MessageProvider.class,
                        "Illuminate\\Contracts\\Support\\MessageProvider"))) {
            messages =
                    env.callMethod(
                            env.callMethod(messages, "getMessageBag", MessageBag.class),
                            "getMessages",
                            MessageBag.class);
        }

        this.messages =
                function_array_merge_recursive.f.env(env).call(this.messages, messages).value();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object has(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object keys = null;
        if (function_is_null.f.env(env).call(key).getBool()) {
            return ZVal.assign(this.any(env));
        }

        keys =
                ZVal.assign(
                        function_is_array.f.env(env).call(key).getBool()
                                ? key
                                : function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value());
        for (ZPair zpairResult577 : ZVal.getIterable(keys, env, true)) {
            key = ZVal.assign(zpairResult577.getValue());
            if (ZVal.strictEqualityCheck(this.first(env, key), "===", "")) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys", defaultValue = "", defaultValueType = "array")
    public Object hasAny(RuntimeEnv env, Object... args) {
        Object keys = assignParameter(args, 0, true);
        if (null == keys) {
            keys = ZVal.newArray();
        }
        Object key = null;
        keys =
                ZVal.assign(
                        function_is_array.f.env(env).call(keys).getBool()
                                ? keys
                                : function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value());
        for (ZPair zpairResult578 : ZVal.getIterable(keys, env, true)) {
            key = ZVal.assign(zpairResult578.getValue());
            if (ZVal.isTrue(this.has(env, key))) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "key",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "format",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object first(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, true);
        if (null == key) {
            key = ZVal.getNull();
        }
        Object format = assignParameter(args, 1, true);
        if (null == format) {
            format = ZVal.getNull();
        }
        Object firstMessage = null;
        Object messages = null;
        messages =
                ZVal.assign(
                        function_is_null.f.env(env).call(key).getBool()
                                ? this.all(env, format)
                                : this.get(env, key, format));
        firstMessage = Arr.runtimeStaticObject.first(env, messages, ZVal.getNull(), "");
        return ZVal.assign(
                function_is_array.f.env(env).call(firstMessage).getBool()
                        ? Arr.runtimeStaticObject.first(env, firstMessage)
                        : firstMessage);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "format",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object get(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object format = assignParameter(args, 1, true);
        if (null == format) {
            format = ZVal.getNull();
        }
        if (function_array_key_exists.f.env(env).call(key, this.messages).getBool()) {
            return ZVal.assign(
                    this.transform(
                            env,
                            new ReferenceClassProperty(this, "messages", env).arrayGet(env, key),
                            this.checkFormat(env, format),
                            key));
        }

        if (ZVal.isTrue(Str.runtimeStaticObject.contains(env, key, "*"))) {
            return ZVal.assign(this.getMessagesForWildcardKey(env, key, format));
        }

        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "format")
    protected Object getMessagesForWildcardKey(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Support/MessageBag.php");
        Object key = assignParameter(args, 0, false);
        Object format = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        collect.f.env(env).call(this.messages).value(),
                                        "filter",
                                        MessageBag.class,
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Illuminate\\Support",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            @ConvertedParameter(index = 0, name = "messages")
                                            @ConvertedParameter(index = 1, name = "messageKey")
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                Object messages = assignParameter(args, 0, false);
                                                Object messageKey = assignParameter(args, 1, false);
                                                Object key = null;
                                                key =
                                                        this.contextReferences.getCapturedValue(
                                                                "key");
                                                return ZVal.assign(
                                                        Str.runtimeStaticObject.is(
                                                                env, key, messageKey));
                                            }
                                        }.use("key", key)),
                                "map",
                                MessageBag.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Support",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "messages")
                                    @ConvertedParameter(index = 1, name = "messageKey")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object messages = assignParameter(args, 0, false);
                                        Object messageKey = assignParameter(args, 1, false);
                                        Object format = null;
                                        format = this.contextReferences.getCapturedValue("format");
                                        return ZVal.assign(
                                                MessageBag.this.transform(
                                                        env,
                                                        messages,
                                                        MessageBag.this.checkFormat(env, format),
                                                        messageKey));
                                    }
                                }.use("format", format)),
                        "all",
                        MessageBag.class));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "format",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object all(RuntimeEnv env, Object... args) {
        Object format = assignParameter(args, 0, true);
        if (null == format) {
            format = ZVal.getNull();
        }
        Object all = null;
        Object messages = null;
        Object key = null;
        format = this.checkFormat(env, format);
        all = ZVal.newArray();
        for (ZPair zpairResult579 : ZVal.getIterable(this.messages, env, false)) {
            key = ZVal.assign(zpairResult579.getKey());
            messages = ZVal.assign(zpairResult579.getValue());
            all =
                    function_array_merge
                            .f
                            .env(env)
                            .call(all, this.transform(env, messages, format, key))
                            .value();
        }

        return ZVal.assign(all);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "format",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object unique(RuntimeEnv env, Object... args) {
        Object format = assignParameter(args, 0, true);
        if (null == format) {
            format = ZVal.getNull();
        }
        return ZVal.assign(function_array_unique.f.env(env).call(this.all(env, format)).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messages")
    @ConvertedParameter(index = 1, name = "format")
    @ConvertedParameter(index = 2, name = "messageKey")
    protected Object transform(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Support/MessageBag.php");
        Object messages = assignParameter(args, 0, false);
        Object format = assignParameter(args, 1, false);
        Object messageKey = assignParameter(args, 2, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                collect.f.env(env).call(rToArrayCast(messages)).value(),
                                "map",
                                MessageBag.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Support",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "message")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object message = assignParameter(args, 0, false);
                                        Object messageKey = null;
                                        Object format = null;
                                        messageKey =
                                                this.contextReferences.getCapturedValue(
                                                        "messageKey");
                                        format = this.contextReferences.getCapturedValue("format");
                                        return ZVal.assign(
                                                function_str_replace
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                ZVal.arrayFromList(
                                                                        ":message", ":key"),
                                                                ZVal.newArray(
                                                                        new ZPair(0, message),
                                                                        new ZPair(1, messageKey)),
                                                                format)
                                                        .value());
                                    }
                                }.use("messageKey", messageKey).use("format", format)),
                        "all",
                        MessageBag.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "format")
    protected Object checkFormat(RuntimeEnv env, Object... args) {
        Object format = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isTrue(ternaryExpressionTemp = format) ? ternaryExpressionTemp : this.format);
    }

    @ConvertedMethod
    public Object messages(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.messages);
    }

    @ConvertedMethod
    public Object getMessages(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.messages(env));
    }

    @ConvertedMethod
    public Object getMessageBag(RuntimeEnv env, Object... args) {
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getFormat(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.format);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "format")
    public Object setFormat(RuntimeEnv env, Object... args) {
        Object format = assignParameter(args, 0, true);
        if (null == format) {
            format = ":message";
        }
        this.format = format;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object isEmpty(RuntimeEnv env, Object... args) {
        return ZVal.assign(!ZVal.isTrue(this.any(env)));
    }

    @ConvertedMethod
    public Object isNotEmpty(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.any(env));
    }

    @ConvertedMethod
    public Object any(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.isGreaterThan(this.count(env), '>', 0));
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.subtract(
                        function_count.f.env(env).call(this.messages, 1).value(),
                        function_count.f.env(env).call(this.messages).value()));
    }

    @ConvertedMethod
    public Object toArray(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getMessages(env));
    }

    @ConvertedMethod
    public Object jsonSerialize(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.toArray(env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "options",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object toJson(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, true);
        if (null == options) {
            options = 0;
        }
        return ZVal.assign(
                NamespaceGlobal.json_encode
                        .env(env)
                        .call(this.jsonSerialize(env), options)
                        .value());
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.toJson(env));
    }

    public static final Object CONST_class = "Illuminate\\Support\\MessageBag";

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
                    .setName("Illuminate\\Support\\MessageBag")
                    .setLookup(
                            MessageBag.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("format", "messages")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Support/MessageBag.php")
                    .addInterface("Illuminate\\Contracts\\Support\\Arrayable")
                    .addInterface("Countable")
                    .addInterface("Illuminate\\Contracts\\Support\\Jsonable")
                    .addInterface("JsonSerializable")
                    .addInterface("Illuminate\\Contracts\\Support\\MessageBag")
                    .addInterface("Illuminate\\Contracts\\Support\\MessageProvider")
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
