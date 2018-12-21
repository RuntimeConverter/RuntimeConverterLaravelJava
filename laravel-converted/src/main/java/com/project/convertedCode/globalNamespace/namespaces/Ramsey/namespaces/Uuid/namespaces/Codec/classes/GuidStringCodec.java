package com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Codec.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
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
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/ramsey/uuid/src/Codec/GuidStringCodec.php

*/

public class GuidStringCodec extends StringCodec {

    public GuidStringCodec(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == GuidStringCodec.class) {
            this.__construct(env, args);
        }
    }

    public GuidStringCodec(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uuid", typeHint = "Ramsey\\Uuid\\UuidInterface")
    public Object encode(RuntimeEnv env, Object... args) {
        Object uuid = assignParameter(args, 0, false);
        ReferenceContainer components = new BasicReferenceContainer(null);
        components.setObject(
                function_array_values
                        .f
                        .env(env)
                        .call(env.callMethod(uuid, "getFieldsHex", GuidStringCodec.class))
                        .value());
        env.callMethod(
                this,
                new RuntimeArgsWithReferences().add(0, components),
                "swapFields",
                GuidStringCodec.class,
                components.getObject());
        return ZVal.assign(
                NamespaceGlobal.vsprintf
                        .env(env)
                        .call("%08s-%04s-%04s-%02s%02s-%012s", components.getObject())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uuid", typeHint = "Ramsey\\Uuid\\UuidInterface")
    public Object encodeBinary(RuntimeEnv env, Object... args) {
        Object uuid = assignParameter(args, 0, false);
        Object components = null;
        components =
                function_array_values
                        .f
                        .env(env)
                        .call(env.callMethod(uuid, "getFieldsHex", GuidStringCodec.class))
                        .value();
        return ZVal.assign(
                NamespaceGlobal.hex2bin
                        .env(env)
                        .call(NamespaceGlobal.implode.env(env).call("", components).value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "encodedUuid")
    public Object decode(RuntimeEnv env, Object... args) {
        Object encodedUuid = assignParameter(args, 0, false);
        ReferenceContainer components = new BasicReferenceContainer(null);
        components.setObject(
                env.callMethod(this, "extractComponents", GuidStringCodec.class, encodedUuid));
        env.callMethod(
                this,
                new RuntimeArgsWithReferences().add(0, components),
                "swapFields",
                GuidStringCodec.class,
                components.getObject());
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this, "getBuilder", GuidStringCodec.class),
                        "build",
                        GuidStringCodec.class,
                        this,
                        env.callMethod(
                                this, "getFields", GuidStringCodec.class, components.getObject())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bytes")
    public Object decodeBytes(RuntimeEnv env, Object... args) {
        Object bytes = assignParameter(args, 0, false);
        return ZVal.assign(super.decode(env, NamespaceGlobal.bin2hex.env(env).call(bytes).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "components", typeHint = "array")
    protected Object swapFields(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer components =
                assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        ReferenceContainer hex = new BasicReferenceContainer(null);
        hex.setObject(
                NamespaceGlobal.unpack
                        .env(env)
                        .call(
                                "H*",
                                NamespaceGlobal.pack
                                        .env(env)
                                        .call(
                                                "L",
                                                NamespaceGlobal.hexdec
                                                        .env(env)
                                                        .call(components.arrayGet(env, 0))
                                                        .value())
                                        .value())
                        .value());
        components.arrayAccess(env, 0).set(hex.arrayGet(env, 1));
        hex.setObject(
                NamespaceGlobal.unpack
                        .env(env)
                        .call(
                                "H*",
                                NamespaceGlobal.pack
                                        .env(env)
                                        .call(
                                                "S",
                                                NamespaceGlobal.hexdec
                                                        .env(env)
                                                        .call(components.arrayGet(env, 1))
                                                        .value())
                                        .value())
                        .value());
        components.arrayAccess(env, 1).set(hex.arrayGet(env, 1));
        hex.setObject(
                NamespaceGlobal.unpack
                        .env(env)
                        .call(
                                "H*",
                                NamespaceGlobal.pack
                                        .env(env)
                                        .call(
                                                "S",
                                                NamespaceGlobal.hexdec
                                                        .env(env)
                                                        .call(components.arrayGet(env, 2))
                                                        .value())
                                        .value())
                        .value());
        components.arrayAccess(env, 2).set(hex.arrayGet(env, 1));
        return null;
    }

    public Object swapFields(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    public static final Object CONST_class = "Ramsey\\Uuid\\Codec\\GuidStringCodec";

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
                    .setName("Ramsey\\Uuid\\Codec\\GuidStringCodec")
                    .setLookup(
                            GuidStringCodec.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("builder")
                    .setFilename("vendor/ramsey/uuid/src/Codec/GuidStringCodec.php")
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
