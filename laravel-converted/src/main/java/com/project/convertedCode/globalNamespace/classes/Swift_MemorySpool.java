package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.classes.Swift_TransportException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Swift_Spool;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/MemorySpool.php

*/

public class Swift_MemorySpool extends RuntimeClassBase implements Swift_Spool {

    public Object messages = ZVal.newArray();

    public Object flushRetries = 3;

    public Swift_MemorySpool(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Swift_MemorySpool(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object isStarted(RuntimeEnv env, Object... args) {
        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object start(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    public Object stop(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "retries")
    public Object setFlushRetries(RuntimeEnv env, Object... args) {
        Object retries = assignParameter(args, 0, false);
        this.flushRetries = retries;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "Swift_Mime_SimpleMessage")
    public Object queueMessage(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "messages", env)
                .arrayAppend(env)
                .set(((RuntimeClassInterface) message).phpClone(env));
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "transport", typeHint = "Swift_Transport")
    @ConvertedParameter(
        index = 1,
        name = "failedRecipients",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object flushQueue(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        Object transport = assignParameter(args, 0, false);
        ReferenceContainer failedRecipients =
                assignParameterRef(runtimePassByReferenceArgs, args, 1, true);
        if (null == failedRecipients.getObject()) {
            failedRecipients.setObject(ZVal.getNull());
        }
        Object exception = null;
        ReferenceContainer retries = new BasicReferenceContainer(null);
        Object count = null;
        Object message = null;
        if (!ZVal.isTrue(this.messages)) {
            return 0;
        }

        if (!ZVal.isTrue(env.callMethod(transport, "isStarted", Swift_MemorySpool.class))) {
            env.callMethod(transport, "start", Swift_MemorySpool.class);
        }

        count = 0;
        retries.setObject(ZVal.assign(this.flushRetries));
        while (ZVal.isTrue(ZVal.postDecrement(retries))) {
            try {
                while (ZVal.isTrue(
                        message = function_array_pop.f.env(env).call(this.messages).value())) {
                    count =
                            ZAssignment.add(
                                    "+=",
                                    count,
                                    env.callMethod(
                                            transport,
                                            new RuntimeArgsWithReferences()
                                                    .add(1, failedRecipients),
                                            "send",
                                            Swift_MemorySpool.class,
                                            message,
                                            failedRecipients.getObject()));
                }

            } catch (ConvertedException convertedException215) {
                if (convertedException215.instanceOf(
                        Swift_TransportException.class, "Swift_TransportException")) {
                    exception = convertedException215.getObject();
                    if (ZVal.isTrue(retries.getObject())) {
                        function_array_unshift.f.env(env).call(this.messages, message);
                        NamespaceGlobal.usleep.env(env).call(500000);

                    } else {
                        throw ZVal.getException(env, exception);
                    }

                } else {
                    throw convertedException215;
                }
            }
        }

        return ZVal.assign(count);
    }

    public Object flushQueue(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    public static final Object CONST_class = "Swift_MemorySpool";

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
                    .setName("Swift_MemorySpool")
                    .setLookup(
                            Swift_MemorySpool.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("flushRetries", "messages")
                    .setFilename("vendor/swiftmailer/swiftmailer/lib/classes/Swift/MemorySpool.php")
                    .addInterface("Swift_Spool")
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
