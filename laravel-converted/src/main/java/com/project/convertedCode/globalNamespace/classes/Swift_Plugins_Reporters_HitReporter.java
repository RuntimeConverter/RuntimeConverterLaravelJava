package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Swift_Plugins_Reporter;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/Reporters/HitReporter.php

*/

public class Swift_Plugins_Reporters_HitReporter extends RuntimeClassBase
        implements Swift_Plugins_Reporter {

    public Object failures = ZVal.newArray();

    public Object failures_cache = ZVal.newArray();

    public Swift_Plugins_Reporters_HitReporter(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Swift_Plugins_Reporters_HitReporter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "Swift_Mime_SimpleMessage")
    @ConvertedParameter(index = 1, name = "address")
    @ConvertedParameter(index = 2, name = "result")
    public Object notify(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object address = assignParameter(args, 1, false);
        Object result = assignParameter(args, 2, false);
        if (ZVal.toBool(ZVal.equalityCheck(CONST_RESULT_FAIL, result))
                && ZVal.toBool(
                        !arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "failures_cache", env),
                                env,
                                address))) {
            new ReferenceClassProperty(this, "failures", env).arrayAppend(env).set(address);
            new ReferenceClassProperty(this, "failures_cache", env)
                    .arrayAccess(env, address)
                    .set(true);
        }

        return null;
    }

    @ConvertedMethod
    public Object getFailedRecipients(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.failures);
    }

    @ConvertedMethod
    public Object clear(RuntimeEnv env, Object... args) {
        this.failures = this.failures_cache = ZVal.newArray();
        return null;
    }

    public static final Object CONST_class = "Swift_Plugins_Reporters_HitReporter";

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
                    .setName("Swift_Plugins_Reporters_HitReporter")
                    .setLookup(
                            Swift_Plugins_Reporters_HitReporter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("failures", "failures_cache")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/Reporters/HitReporter.php")
                    .addInterface("Swift_Plugins_Reporter")
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
