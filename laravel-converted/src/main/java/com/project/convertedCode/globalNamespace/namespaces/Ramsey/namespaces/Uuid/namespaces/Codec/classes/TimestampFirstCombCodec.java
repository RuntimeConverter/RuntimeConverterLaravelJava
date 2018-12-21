package com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Codec.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Codec.classes.StringCodec;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/ramsey/uuid/src/Codec/TimestampFirstCombCodec.php

*/

public class TimestampFirstCombCodec extends StringCodec {

    public TimestampFirstCombCodec(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TimestampFirstCombCodec.class) {
            this.__construct(env, args);
        }
    }

    public TimestampFirstCombCodec(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uuid", typeHint = "Ramsey\\Uuid\\UuidInterface")
    public Object encode(RuntimeEnv env, Object... args) {
        Object uuid = assignParameter(args, 0, false);
        ReferenceContainer sixPieceComponents = new BasicReferenceContainer(null);
        sixPieceComponents.setObject(
                function_array_values
                        .f
                        .env(env)
                        .call(env.callMethod(uuid, "getFieldsHex", TimestampFirstCombCodec.class))
                        .value());
        env.callMethod(
                this,
                new RuntimeArgsWithReferences().add(0, sixPieceComponents),
                "swapTimestampAndRandomBits",
                TimestampFirstCombCodec.class,
                sixPieceComponents.getObject());
        return ZVal.assign(
                NamespaceGlobal.vsprintf
                        .env(env)
                        .call("%08s-%04s-%04s-%02s%02s-%012s", sixPieceComponents.getObject())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uuid", typeHint = "Ramsey\\Uuid\\UuidInterface")
    public Object encodeBinary(RuntimeEnv env, Object... args) {
        Object uuid = assignParameter(args, 0, false);
        Object stringEncoding = null;
        stringEncoding = this.encode(env, uuid);
        return ZVal.assign(
                NamespaceGlobal.hex2bin
                        .env(env)
                        .call(function_str_replace.f.env(env).call("-", "", stringEncoding).value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "encodedUuid")
    public Object decode(RuntimeEnv env, Object... args) {
        Object encodedUuid = assignParameter(args, 0, false);
        ReferenceContainer fivePieceComponents = new BasicReferenceContainer(null);
        fivePieceComponents.setObject(
                env.callMethod(
                        this, "extractComponents", TimestampFirstCombCodec.class, encodedUuid));
        env.callMethod(
                this,
                new RuntimeArgsWithReferences().add(0, fivePieceComponents),
                "swapTimestampAndRandomBits",
                TimestampFirstCombCodec.class,
                fivePieceComponents.getObject());
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this, "getBuilder", TimestampFirstCombCodec.class),
                        "build",
                        TimestampFirstCombCodec.class,
                        this,
                        env.callMethod(
                                this,
                                "getFields",
                                TimestampFirstCombCodec.class,
                                fivePieceComponents.getObject())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bytes")
    public Object decodeBytes(RuntimeEnv env, Object... args) {
        Object bytes = assignParameter(args, 0, false);
        return ZVal.assign(this.decode(env, NamespaceGlobal.bin2hex.env(env).call(bytes).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "components", typeHint = "array")
    protected Object swapTimestampAndRandomBits(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer components =
                assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        Object last48Bits = null;
        last48Bits = ZVal.assign(components.arrayGet(env, 4));
        if (ZVal.equalityCheck(function_count.f.env(env).call(components.getObject()).value(), 6)) {
            last48Bits = ZVal.assign(components.arrayGet(env, 5));
            components
                    .arrayAccess(env, 5)
                    .set(
                            toStringR(components.arrayGet(env, 0), env)
                                    + toStringR(components.arrayGet(env, 1), env));

        } else {
            components
                    .arrayAccess(env, 4)
                    .set(
                            toStringR(components.arrayGet(env, 0), env)
                                    + toStringR(components.arrayGet(env, 1), env));
        }

        components
                .arrayAccess(env, 0)
                .set(function_substr.f.env(env).call(last48Bits, 0, 8).value());
        components
                .arrayAccess(env, 1)
                .set(function_substr.f.env(env).call(last48Bits, 8, 4).value());
        return null;
    }

    public Object swapTimestampAndRandomBits(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    public static final Object CONST_class = "Ramsey\\Uuid\\Codec\\TimestampFirstCombCodec";

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
                    .setName("Ramsey\\Uuid\\Codec\\TimestampFirstCombCodec")
                    .setLookup(
                            TimestampFirstCombCodec.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("builder")
                    .setFilename("vendor/ramsey/uuid/src/Codec/TimestampFirstCombCodec.php")
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
