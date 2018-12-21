package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes.Type;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/type-resolver/src/Types/Object_.php

*/

public final class Object_ extends RuntimeClassBase implements Type {

    public Object fqsen = null;

    public Object_(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Object_.class) {
            this.__construct(env, args);
        }
    }

    public Object_(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "fqsen",
        typeHint = "phpDocumentor\\Reflection\\Fqsen",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object fqsen = assignParameter(args, 0, true);
        if (null == fqsen) {
            fqsen = ZVal.getNull();
        }
        if (ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                function_strpos
                                        .f
                                        .env(env)
                                        .call(toStringR(fqsen, env), "::")
                                        .value(),
                                "!==",
                                false))
                || ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                function_strpos
                                        .f
                                        .env(env)
                                        .call(toStringR(fqsen, env), "()")
                                        .value(),
                                "!==",
                                false))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Object types can only refer to a class, interface or trait but a method, function, constant or "
                                    + "property was received: "
                                    + toStringR(toStringR(fqsen, env), env)));
        }

        this.fqsen = fqsen;
        return null;
    }

    @ConvertedMethod
    public Object getFqsen(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.fqsen);
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.fqsen)) {
            return ZVal.assign(toStringR(this.fqsen, env));
        }

        return "object";
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\Types\\Object_";

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
                    .setName("phpDocumentor\\Reflection\\Types\\Object_")
                    .setLookup(
                            Object_.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("fqsen")
                    .setFilename("vendor/phpdocumentor/type-resolver/src/Types/Object_.php")
                    .addInterface("phpDocumentor\\Reflection\\Type")
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
