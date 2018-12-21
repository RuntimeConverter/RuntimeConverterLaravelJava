package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.classes.Swift_Events_SendListener;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/MessageLogger.php

*/

public class Swift_Plugins_MessageLogger extends RuntimeClassBase
        implements Swift_Events_SendListener {

    public Object messages = null;

    public Swift_Plugins_MessageLogger(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Plugins_MessageLogger.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Plugins_MessageLogger(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        this.messages = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    public Object getMessages(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.messages);
    }

    @ConvertedMethod
    public Object countMessages(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_count.f.env(env).call(this.messages).value());
    }

    @ConvertedMethod
    public Object clear(RuntimeEnv env, Object... args) {
        this.messages = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "evt", typeHint = "Swift_Events_SendEvent")
    public Object beforeSendPerformed(RuntimeEnv env, Object... args) {
        Object evt = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "messages", env)
                .arrayAppend(env)
                .set(
                        ((RuntimeClassInterface)
                                        env.callMethod(
                                                evt,
                                                "getMessage",
                                                Swift_Plugins_MessageLogger.class))
                                .phpClone(env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "evt", typeHint = "Swift_Events_SendEvent")
    public Object sendPerformed(RuntimeEnv env, Object... args) {
        Object evt = assignParameter(args, 0, false);
        return null;
    }

    public static final Object CONST_class = "Swift_Plugins_MessageLogger";

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
                    .setName("Swift_Plugins_MessageLogger")
                    .setLookup(
                            Swift_Plugins_MessageLogger.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("messages")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/MessageLogger.php")
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
