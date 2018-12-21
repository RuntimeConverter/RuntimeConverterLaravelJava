package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Swift_Transport_SpoolTransport;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Swift_DependencyContainer;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/SpoolTransport.php

*/

public class Swift_SpoolTransport extends Swift_Transport_SpoolTransport {

    public Swift_SpoolTransport(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_SpoolTransport.class) {
            this.__construct(env, args);
        }
    }

    public Swift_SpoolTransport(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "spool", typeHint = "Swift_Spool")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object spool = assignParameter(args, 0, false);
        ReferenceContainer arguments = new BasicReferenceContainer(null);
        arguments.setObject(
                env.callMethod(
                        Swift_DependencyContainer.runtimeStaticObject.getInstance(env),
                        "createDependenciesFor",
                        Swift_SpoolTransport.class,
                        "transport.spool"));
        arguments.arrayAppend(env).set(spool);
        function_call_user_func_array
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                .call(
                        ZVal.newArray(
                                new ZPair(0, this),
                                new ZPair(1, "Swift_Transport_SpoolTransport::__construct")),
                        arguments.getObject());
        return null;
    }

    public static final Object CONST_class = "Swift_SpoolTransport";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends Swift_Transport_SpoolTransport.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_SpoolTransport")
                    .setLookup(
                            Swift_SpoolTransport.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("eventDispatcher", "spool")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/SpoolTransport.php")
                    .addInterface("Swift_Transport")
                    .addExtendsClass("Swift_Transport_SpoolTransport")
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
