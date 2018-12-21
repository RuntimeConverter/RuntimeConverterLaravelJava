package com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Warning.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/egulias/email-validator/EmailValidator/Warning/Warning.php

*/

public abstract class Warning extends RuntimeClassBase {

    public Object message = null;

    public Object rfcNumber = null;

    public Warning(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Warning(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object message(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.message);
    }

    @ConvertedMethod
    public Object code(RuntimeEnv env, Object... args) {
        return ZVal.assign(CONST_CODE);
    }

    @ConvertedMethod
    public Object RFCNumber(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.rfcNumber);
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(this.message(env), env)
                        + " rfc: "
                        + toStringR(this.rfcNumber, env)
                        + "interal code: "
                        + toStringR(
                                ClassConstantUtils.getConstantValueLateStatic(env, this, "CODE"),
                                env));
    }

    public static final Object CONST_CODE = 0;

    public static final Object CONST_class = "Egulias\\EmailValidator\\Warning\\Warning";

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
                    .setName("Egulias\\EmailValidator\\Warning\\Warning")
                    .setLookup(
                            Warning.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("message", "rfcNumber")
                    .setFilename(
                            "vendor/egulias/email-validator/EmailValidator/Warning/Warning.php")
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
