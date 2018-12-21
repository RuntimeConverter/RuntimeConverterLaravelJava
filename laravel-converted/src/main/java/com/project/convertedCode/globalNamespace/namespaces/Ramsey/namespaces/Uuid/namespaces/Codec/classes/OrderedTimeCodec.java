package com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Codec.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Codec.classes.StringCodec;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/ramsey/uuid/src/Codec/OrderedTimeCodec.php

*/

public class OrderedTimeCodec extends StringCodec {

    public OrderedTimeCodec(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == OrderedTimeCodec.class) {
            this.__construct(env, args);
        }
    }

    public OrderedTimeCodec(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uuid", typeHint = "Ramsey\\Uuid\\UuidInterface")
    public Object encodeBinary(RuntimeEnv env, Object... args) {
        Object uuid = assignParameter(args, 0, false);
        Object optimized = null;
        ReferenceContainer fields = new BasicReferenceContainer(null);
        fields.setObject(env.callMethod(uuid, "getFieldsHex", OrderedTimeCodec.class));
        optimized =
                ZVal.newArray(
                        new ZPair(0, fields.arrayGet(env, "time_hi_and_version")),
                        new ZPair(1, fields.arrayGet(env, "time_mid")),
                        new ZPair(2, fields.arrayGet(env, "time_low")),
                        new ZPair(3, fields.arrayGet(env, "clock_seq_hi_and_reserved")),
                        new ZPair(4, fields.arrayGet(env, "clock_seq_low")),
                        new ZPair(5, fields.arrayGet(env, "node")));
        return ZVal.assign(
                NamespaceGlobal.hex2bin
                        .env(env)
                        .call(NamespaceGlobal.implode.env(env).call("", optimized).value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bytes")
    public Object decodeBytes(RuntimeEnv env, Object... args) {
        Object bytes = assignParameter(args, 0, false);
        Object hex = null;
        if (ZVal.strictNotEqualityCheck(
                function_strlen.f.env(env).call(bytes).value(), "!==", 16)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "$bytes string should contain 16 characters."));
        }

        hex =
                ZVal.assign(
                        handleReturnReference(
                                        NamespaceGlobal.unpack.env(env).call("H*", bytes).value())
                                .arrayGet(env, 1));
        hex =
                toStringR(function_substr.f.env(env).call(hex, 8, 4).value(), env)
                        + toStringR(function_substr.f.env(env).call(hex, 12, 4).value(), env)
                        + toStringR(function_substr.f.env(env).call(hex, 4, 4).value(), env)
                        + toStringR(function_substr.f.env(env).call(hex, 0, 4).value(), env)
                        + toStringR(function_substr.f.env(env).call(hex, 16).value(), env);
        return ZVal.assign(env.callMethod(this, "decode", OrderedTimeCodec.class, hex));
    }

    public static final Object CONST_class = "Ramsey\\Uuid\\Codec\\OrderedTimeCodec";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StringCodec.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Ramsey\\Uuid\\Codec\\OrderedTimeCodec")
                    .setLookup(
                            OrderedTimeCodec.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("builder")
                    .setFilename("vendor/ramsey/uuid/src/Codec/OrderedTimeCodec.php")
                    .addInterface("Ramsey\\Uuid\\Codec\\CodecInterface")
                    .addExtendsClass("Ramsey\\Uuid\\Codec\\StringCodec")
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
