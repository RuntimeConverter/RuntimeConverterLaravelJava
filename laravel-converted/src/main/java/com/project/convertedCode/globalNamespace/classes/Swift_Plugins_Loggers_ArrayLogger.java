package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Swift_Plugins_Logger;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/Loggers/ArrayLogger.php

*/

public class Swift_Plugins_Loggers_ArrayLogger extends RuntimeClassBase
        implements Swift_Plugins_Logger {

    public Object log = ZVal.newArray();

    public Object size = 0;

    public Swift_Plugins_Loggers_ArrayLogger(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Plugins_Loggers_ArrayLogger.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Plugins_Loggers_ArrayLogger(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "size", defaultValue = "50", defaultValueType = "number")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object size = assignParameter(args, 0, true);
        if (null == size) {
            size = 50;
        }
        this.size = size;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "entry")
    public Object add(RuntimeEnv env, Object... args) {
        Object entry = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "log", env).arrayAppend(env).set(entry);
        while (ZVal.isGreaterThan(
                function_count.f.env(env).call(this.log).value(), '>', this.size)) {
            function_array_shift.f.env(env).call(this.log);
        }

        return null;
    }

    @ConvertedMethod
    public Object clear(RuntimeEnv env, Object... args) {
        this.log = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    public Object dump(RuntimeEnv env, Object... args) {
        return ZVal.assign(NamespaceGlobal.implode.env(env).call("\n", this.log).value());
    }

    public static final Object CONST_class = "Swift_Plugins_Loggers_ArrayLogger";

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
                    .setName("Swift_Plugins_Loggers_ArrayLogger")
                    .setLookup(
                            Swift_Plugins_Loggers_ArrayLogger.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("log", "size")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/Loggers/ArrayLogger.php")
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
