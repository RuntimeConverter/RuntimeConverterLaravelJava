package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Swift_Plugins_Logger;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/Loggers/EchoLogger.php

*/

public class Swift_Plugins_Loggers_EchoLogger extends RuntimeClassBase
        implements Swift_Plugins_Logger {

    public Object isHtml = null;

    public Swift_Plugins_Loggers_EchoLogger(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Plugins_Loggers_EchoLogger.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Plugins_Loggers_EchoLogger(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "isHtml",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object isHtml = assignParameter(args, 0, true);
        if (null == isHtml) {
            isHtml = true;
        }
        this.isHtml = isHtml;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "entry")
    public Object add(RuntimeEnv env, Object... args) {
        Object entry = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.isHtml)) {
            NamespaceGlobal.printf
                    .env(env)
                    .call(
                            "%s%s%s",
                            NamespaceGlobal.htmlspecialchars.env(env).call(entry, 3).value(),
                            "<br />",
                            "\n");

        } else {
            NamespaceGlobal.printf.env(env).call("%s%s", entry, "\n");
        }

        return null;
    }

    @ConvertedMethod
    public Object clear(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    public Object dump(RuntimeEnv env, Object... args) {
        return null;
    }

    public static final Object CONST_class = "Swift_Plugins_Loggers_EchoLogger";

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
                    .setName("Swift_Plugins_Loggers_EchoLogger")
                    .setLookup(
                            Swift_Plugins_Loggers_EchoLogger.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("isHtml")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/Loggers/EchoLogger.php")
                    .addInterface("Swift_Plugins_Logger")
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
