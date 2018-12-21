package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.namespaces.Messages.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.namespaces.Messages.classes.SimpleMessage;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import com.runtimeconverter.runtime.RuntimeStack;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Notifications/Messages/MailMessage.php

*/

public class MailMessage extends SimpleMessage {

    public Object view = null;

    public Object viewData = ZVal.newArray();

    public Object markdown = "notifications::email";

    public Object from = ZVal.newArray();

    public Object replyTo = ZVal.newArray();

    public Object cc = ZVal.newArray();

    public Object bcc = ZVal.newArray();

    public Object attachments = ZVal.newArray();

    public Object rawAttachments = ZVal.newArray();

    public Object priority = null;

    public MailMessage(RuntimeEnv env, Object... args) {
        super(env);
    }

    public MailMessage(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "view")
    @ConvertedParameter(
        index = 1,
        name = "data",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object view(RuntimeEnv env, Object... args) {
        Object view = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        this.view = view;
        this.viewData = data;
        this.markdown = ZVal.getNull();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "view")
    @ConvertedParameter(
        index = 1,
        name = "data",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object markdown(RuntimeEnv env, Object... args) {
        Object view = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        this.markdown = view;
        this.viewData = data;
        this.view = ZVal.getNull();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "template")
    public Object template(RuntimeEnv env, Object... args) {
        Object template = assignParameter(args, 0, false);
        this.markdown = template;
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
    public Object from(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        this.from = ZVal.newArray(new ZPair(0, address), new ZPair(1, name));
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
    public Object replyTo(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        new ReferenceClassProperty(this, "replyTo", env)
                .arrayAppend(env)
                .set(ZVal.newArray(new ZPair(0, address), new ZPair(1, name)));
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
    public Object cc(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        new ReferenceClassProperty(this, "cc", env)
                .arrayAppend(env)
                .set(ZVal.newArray(new ZPair(0, address), new ZPair(1, name)));
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
    public Object bcc(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        new ReferenceClassProperty(this, "bcc", env)
                .arrayAppend(env)
                .set(ZVal.newArray(new ZPair(0, address), new ZPair(1, name)));
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
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope150 scope = new Scope150();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir(
                                    "/vendor/laravel/framework/src/Illuminate/Notifications/Messages")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Notifications/Messages/MailMessage.php");
            scope.file = assignParameter(args, 0, false);
            scope.options = assignParameter(args, 1, true);
            if (null == scope.options) {
                scope.options = ZVal.newArray();
            }
            new ReferenceClassProperty(scope._thisVarAlias, "attachments", env)
                    .arrayAppend(env)
                    .set(function_compact.f.env(env).call(stack, "file", "options").value());
            throw new IncludeEventException(ZVal.assign(scope._thisVarAlias));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
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
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope151 scope = new Scope151();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir(
                                    "/vendor/laravel/framework/src/Illuminate/Notifications/Messages")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Notifications/Messages/MailMessage.php");
            scope.data = assignParameter(args, 0, false);
            scope.name = assignParameter(args, 1, false);
            scope.options = assignParameter(args, 2, true);
            if (null == scope.options) {
                scope.options = ZVal.newArray();
            }
            new ReferenceClassProperty(scope._thisVarAlias, "rawAttachments", env)
                    .arrayAppend(env)
                    .set(
                            function_compact
                                    .f
                                    .env(env)
                                    .call(stack, "data", "name", "options")
                                    .value());
            throw new IncludeEventException(ZVal.assign(scope._thisVarAlias));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    public Object priority(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, false);
        this.priority = level;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object data(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_array_merge
                        .f
                        .env(env)
                        .call(env.callMethod(this, "toArray", MailMessage.class), this.viewData)
                        .value());
    }

    public static final Object CONST_class = "Illuminate\\Notifications\\Messages\\MailMessage";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends SimpleMessage.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Notifications\\Messages\\MailMessage")
                    .setLookup(
                            MailMessage.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "actionText",
                            "actionUrl",
                            "attachments",
                            "bcc",
                            "cc",
                            "from",
                            "greeting",
                            "introLines",
                            "level",
                            "markdown",
                            "outroLines",
                            "priority",
                            "rawAttachments",
                            "replyTo",
                            "salutation",
                            "subject",
                            "view",
                            "viewData")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Notifications/Messages/MailMessage.php")
                    .addExtendsClass("Illuminate\\Notifications\\Messages\\SimpleMessage")
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

    private static class Scope150 implements UpdateRuntimeScopeInterface {

        Object file;
        Object _thisVarAlias;
        Object options;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("file", this.file);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("options", this.options);
        }

        public void updateScope(RuntimeStack stack) {

            this.file = stack.getVariable("file");
            this._thisVarAlias = stack.getVariable("this");
            this.options = stack.getVariable("options");
        }
    }

    private static class Scope151 implements UpdateRuntimeScopeInterface {

        Object data;
        Object _thisVarAlias;
        Object name;
        Object options;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("data", this.data);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("name", this.name);
            stack.setVariable("options", this.options);
        }

        public void updateScope(RuntimeStack stack) {

            this.data = stack.getVariable("data");
            this._thisVarAlias = stack.getVariable("this");
            this.name = stack.getVariable("name");
            this.options = stack.getVariable("options");
        }
    }
}
