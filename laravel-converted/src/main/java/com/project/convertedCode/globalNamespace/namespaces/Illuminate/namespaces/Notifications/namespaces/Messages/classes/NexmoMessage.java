package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.namespaces.Messages.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Notifications/Messages/NexmoMessage.php

*/

public class NexmoMessage extends RuntimeClassBase {

    public Object content = null;

    public Object from = null;

    public Object type = "text";

    public NexmoMessage(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == NexmoMessage.class) {
            this.__construct(env, args);
        }
    }

    public NexmoMessage(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object content = assignParameter(args, 0, true);
        if (null == content) {
            content = "";
        }
        this.content = content;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content")
    public Object content(RuntimeEnv env, Object... args) {
        Object content = assignParameter(args, 0, false);
        this.content = content;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "from")
    public Object from(RuntimeEnv env, Object... args) {
        Object from = assignParameter(args, 0, false);
        this.from = from;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object unicode(RuntimeEnv env, Object... args) {
        this.type = "unicode";
        return ZVal.assign(this);
    }

    public static final Object CONST_class = "Illuminate\\Notifications\\Messages\\NexmoMessage";

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
                    .setName("Illuminate\\Notifications\\Messages\\NexmoMessage")
                    .setLookup(
                            NexmoMessage.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("content", "from", "type")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Notifications/Messages/NexmoMessage.php")
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
