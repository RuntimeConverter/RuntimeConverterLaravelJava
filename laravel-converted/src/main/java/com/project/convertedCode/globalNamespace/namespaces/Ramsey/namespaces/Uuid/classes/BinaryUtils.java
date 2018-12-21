package com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.ZAssignment;
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

 vendor/ramsey/uuid/src/BinaryUtils.php

*/

public class BinaryUtils extends RuntimeClassBase {

    public BinaryUtils(RuntimeEnv env, Object... args) {
        super(env);
    }

    public BinaryUtils(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Ramsey\\Uuid\\BinaryUtils";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "clockSeqHi")
        public Object applyVariant(RuntimeEnv env, Object... args) {
            Object clockSeqHi = assignParameter(args, 0, false);
            clockSeqHi = ZVal.toLong(clockSeqHi) & ZVal.toLong(63);
            clockSeqHi = ZAssignment.and("&=", clockSeqHi, ~ZVal.toLong(192));
            clockSeqHi = ZAssignment.or("|=", clockSeqHi, 128);
            return ZVal.assign(clockSeqHi);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "timeHi")
        @ConvertedParameter(index = 1, name = "version")
        public Object applyVersion(RuntimeEnv env, Object... args) {
            Object timeHi = assignParameter(args, 0, false);
            Object version = assignParameter(args, 1, false);
            timeHi =
                    ZVal.toLong(NamespaceGlobal.hexdec.env(env).call(timeHi).value())
                            & ZVal.toLong(4095);
            timeHi = ZAssignment.and("&=", timeHi, ~ZVal.toLong(61440));
            timeHi = ZAssignment.or("|=", timeHi, ZVal.toLong(version) << ZVal.toLong(12));
            return ZVal.assign(timeHi);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Ramsey\\Uuid\\BinaryUtils")
                    .setLookup(
                            BinaryUtils.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/ramsey/uuid/src/BinaryUtils.php")
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
