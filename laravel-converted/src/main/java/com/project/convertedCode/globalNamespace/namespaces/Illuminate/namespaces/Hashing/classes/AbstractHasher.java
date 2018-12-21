package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Hashing.classes;

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
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Hashing/AbstractHasher.php

*/

public abstract class AbstractHasher extends RuntimeClassBase {

    public AbstractHasher(RuntimeEnv env, Object... args) {
        super(env);
    }

    public AbstractHasher(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "hashedValue")
    public Object info(RuntimeEnv env, Object... args) {
        Object hashedValue = assignParameter(args, 0, false);
        return ZVal.assign(NamespaceGlobal.password_get_info.env(env).call(hashedValue).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(index = 1, name = "hashedValue")
    @ConvertedParameter(
        index = 2,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object check(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object hashedValue = assignParameter(args, 1, false);
        Object options = assignParameter(args, 2, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        if (ZVal.strictEqualityCheck(
                function_strlen.f.env(env).call(hashedValue).value(), "===", 0)) {
            return ZVal.assign(false);
        }

        return ZVal.assign(
                NamespaceGlobal.password_verify.env(env).call(value, hashedValue).value());
    }

    public static final Object CONST_class = "Illuminate\\Hashing\\AbstractHasher";

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
                    .setName("Illuminate\\Hashing\\AbstractHasher")
                    .setLookup(
                            AbstractHasher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Hashing/AbstractHasher.php")
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
