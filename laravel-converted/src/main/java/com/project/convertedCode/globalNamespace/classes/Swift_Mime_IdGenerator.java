package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Swift_IdGenerator;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.functions.random_bytes;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/IdGenerator.php

*/

public class Swift_Mime_IdGenerator extends RuntimeClassBase implements Swift_IdGenerator {

    public Swift_Mime_IdGenerator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Mime_IdGenerator.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Mime_IdGenerator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "idRight")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object idRight = assignParameter(args, 0, false);
        toObjectR(this).accessProp(this, env).name("idRight").set(idRight);
        return null;
    }

    @ConvertedMethod
    public Object getIdRight(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("idRight").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "idRight")
    public Object setIdRight(RuntimeEnv env, Object... args) {
        Object idRight = assignParameter(args, 0, false);
        toObjectR(this).accessProp(this, env).name("idRight").set(idRight);
        return null;
    }

    @ConvertedMethod
    public Object generateId(RuntimeEnv env, Object... args) {
        Object idLeft = null;
        idLeft =
                NamespaceGlobal.bin2hex
                        .env(env)
                        .call(random_bytes.f.env(env).call(16).value())
                        .value();
        return ZVal.assign(
                toStringR(idLeft, env)
                        + "@"
                        + toStringR(
                                toObjectR(this).accessProp(this, env).name("idRight").value(),
                                env));
    }

    public static final Object CONST_class = "Swift_Mime_IdGenerator";

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
                    .setName("Swift_Mime_IdGenerator")
                    .setLookup(
                            Swift_Mime_IdGenerator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/IdGenerator.php")
                    .addInterface("Swift_IdGenerator")
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
