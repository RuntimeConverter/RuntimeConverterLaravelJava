package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.project.convertedCode.globalNamespace.classes.Swift_Attachment;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.classes.Swift_Image;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Mail/Message.php

*/

public class Message extends RuntimeClassBase {

    public Object swift = null;

    public Object embeddedFiles = ZVal.newArray();

    public Message(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Message.class) {
            this.__construct(env, args);
        }
    }

    public Message(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "swift")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object swift = assignParameter(args, 0, false);
        this.swift = swift;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object from(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        env.callMethod(this.swift, "setFrom", Message.class, address, name);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object sender(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        env.callMethod(this.swift, "setSender", Message.class, address, name);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    public Object returnPath(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        env.callMethod(this.swift, "setReturnPath", Message.class, address);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "override",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object to(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object override = assignParameter(args, 2, true);
        if (null == override) {
            override = false;
        }
        if (ZVal.isTrue(override)) {
            env.callMethod(this.swift, "setTo", Message.class, address, name);
            return ZVal.assign(this);
        }

        return ZVal.assign(this.addAddresses(env, address, name, "To"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "override",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object cc(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object override = assignParameter(args, 2, true);
        if (null == override) {
            override = false;
        }
        if (ZVal.isTrue(override)) {
            env.callMethod(this.swift, "setCc", Message.class, address, name);
            return ZVal.assign(this);
        }

        return ZVal.assign(this.addAddresses(env, address, name, "Cc"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "override",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object bcc(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object override = assignParameter(args, 2, true);
        if (null == override) {
            override = false;
        }
        if (ZVal.isTrue(override)) {
            env.callMethod(this.swift, "setBcc", Message.class, address, name);
            return ZVal.assign(this);
        }

        return ZVal.assign(this.addAddresses(env, address, name, "Bcc"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object replyTo(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        return ZVal.assign(this.addAddresses(env, address, name, "ReplyTo"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(index = 2, name = "type")
    protected Object addAddresses(RuntimeEnv env, Object... args) {
        ReferenceContainer address = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer name = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object type = assignParameter(args, 2, false);
        if (function_is_array.f.env(env).call(address.getObject()).getBool()) {
            env.callMethod(
                    this.swift,
                    new RuntimeArgsWithReferences().add(0, address).add(1, name),
                    toStringR("set" + toStringR(type, env), env),
                    Message.class,
                    address.getObject(),
                    name.getObject());

        } else {
            env.callMethod(
                    this.swift,
                    new RuntimeArgsWithReferences().add(0, address).add(1, name),
                    toStringR("add" + toStringR(type, env), env),
                    Message.class,
                    address.getObject(),
                    name.getObject());
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "subject")
    public Object subject(RuntimeEnv env, Object... args) {
        Object subject = assignParameter(args, 0, false);
        env.callMethod(this.swift, "setSubject", Message.class, subject);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    public Object priority(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, false);
        env.callMethod(this.swift, "setPriority", Message.class, level);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    @ConvertedParameter(
        index = 1,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object attach(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        Object options = assignParameter(args, 1, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object attachment = null;
        attachment = this.createAttachmentFromPath(env, file);
        return ZVal.assign(this.prepAttachment(env, attachment, options));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    protected Object createAttachmentFromPath(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        return ZVal.assign(Swift_Attachment.runtimeStaticObject.fromPath(env, file));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(
        index = 2,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object attachData(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        Object options = assignParameter(args, 2, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object attachment = null;
        attachment = this.createAttachmentFromData(env, data, name);
        return ZVal.assign(this.prepAttachment(env, attachment, options));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    @ConvertedParameter(index = 1, name = "name")
    protected Object createAttachmentFromData(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        return ZVal.assign(new Swift_Attachment(env, data, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    public Object embed(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "embeddedFiles", env),
                env,
                file)) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "embeddedFiles", env).arrayGet(env, file));
        }

        return ZVal.assign(
                new ReferenceClassProperty(this, "embeddedFiles", env)
                        .arrayAccess(env, file)
                        .set(
                                env.callMethod(
                                        this.swift,
                                        "embed",
                                        Message.class,
                                        Swift_Image.runtimeStaticObject.fromPath(env, file))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(
        index = 2,
        name = "contentType",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object embedData(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        Object contentType = assignParameter(args, 2, true);
        if (null == contentType) {
            contentType = ZVal.getNull();
        }
        Object image = null;
        image = new Swift_Image(env, data, name, contentType);
        return ZVal.assign(env.callMethod(this.swift, "embed", Message.class, image));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attachment")
    @ConvertedParameter(index = 1, name = "options", defaultValue = "", defaultValueType = "array")
    protected Object prepAttachment(RuntimeEnv env, Object... args) {
        Object attachment = assignParameter(args, 0, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        if (arrayActionR(ArrayAction.ISSET, options, env, "mime")) {
            env.callMethod(
                    attachment, "setContentType", Message.class, options.arrayGet(env, "mime"));
        }

        if (arrayActionR(ArrayAction.ISSET, options, env, "as")) {
            env.callMethod(attachment, "setFilename", Message.class, options.arrayGet(env, "as"));
        }

        env.callMethod(this.swift, "attach", Message.class, attachment);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getSwiftMessage(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.swift);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        Object callable = null;
        callable = ZVal.newArray(new ZPair(0, this.swift), new ZPair(1, method));
        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(callable, parameters)
                        .value());
    }

    public static final Object CONST_class = "Illuminate\\Mail\\Message";

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
                    .setName("Illuminate\\Mail\\Message")
                    .setLookup(
                            Message.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("embeddedFiles", "swift")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Mail/Message.php")
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
