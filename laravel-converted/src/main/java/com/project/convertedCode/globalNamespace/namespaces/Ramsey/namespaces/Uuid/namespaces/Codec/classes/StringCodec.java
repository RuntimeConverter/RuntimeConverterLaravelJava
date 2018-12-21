package com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Codec.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Exception.classes.InvalidUuidStringException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Codec.classes.CodecInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.classes.Uuid;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/ramsey/uuid/src/Codec/StringCodec.php

*/

public class StringCodec extends RuntimeClassBase implements CodecInterface {

    public Object builder = null;

    public StringCodec(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == StringCodec.class) {
            this.__construct(env, args);
        }
    }

    public StringCodec(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "builder",
        typeHint = "Ramsey\\Uuid\\Builder\\UuidBuilderInterface"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object builder = assignParameter(args, 0, false);
        this.builder = builder;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uuid", typeHint = "Ramsey\\Uuid\\UuidInterface")
    public Object encode(RuntimeEnv env, Object... args) {
        Object uuid = assignParameter(args, 0, false);
        Object fields = null;
        fields =
                function_array_values
                        .f
                        .env(env)
                        .call(env.callMethod(uuid, "getFieldsHex", StringCodec.class))
                        .value();
        return ZVal.assign(
                NamespaceGlobal.vsprintf
                        .env(env)
                        .call("%08s-%04s-%04s-%02s%02s-%012s", fields)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uuid", typeHint = "Ramsey\\Uuid\\UuidInterface")
    public Object encodeBinary(RuntimeEnv env, Object... args) {
        Object uuid = assignParameter(args, 0, false);
        return ZVal.assign(
                NamespaceGlobal.hex2bin
                        .env(env)
                        .call(env.callMethod(uuid, "getHex", StringCodec.class))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "encodedUuid")
    public Object decode(RuntimeEnv env, Object... args) {
        Object encodedUuid = assignParameter(args, 0, false);
        Object components = null;
        Object fields = null;
        components = this.extractComponents(env, encodedUuid);
        fields = this.getFields(env, components);
        return ZVal.assign(env.callMethod(this.builder, "build", StringCodec.class, this, fields));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bytes")
    public Object decodeBytes(RuntimeEnv env, Object... args) {
        Object bytes = assignParameter(args, 0, false);
        ReferenceContainer hexUuid = new BasicReferenceContainer(null);
        if (ZVal.strictNotEqualityCheck(
                function_strlen.f.env(env).call(bytes).value(), "!==", 16)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "$bytes string should contain 16 characters."));
        }

        hexUuid.setObject(NamespaceGlobal.unpack.env(env).call("H*", bytes).value());
        return ZVal.assign(this.decode(env, hexUuid.arrayGet(env, 1)));
    }

    @ConvertedMethod
    protected Object getBuilder(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.builder);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "encodedUuid")
    protected Object extractComponents(RuntimeEnv env, Object... args) {
        Object encodedUuid = assignParameter(args, 0, false);
        Object components = null;
        Object nameParsed = null;
        nameParsed =
                function_str_replace
                        .f
                        .env(env)
                        .call(ZVal.arrayFromList("urn:", "uuid:", "{", "}", "-"), "", encodedUuid)
                        .value();
        components =
                ZVal.newArray(
                        new ZPair(0, function_substr.f.env(env).call(nameParsed, 0, 8).value()),
                        new ZPair(1, function_substr.f.env(env).call(nameParsed, 8, 4).value()),
                        new ZPair(2, function_substr.f.env(env).call(nameParsed, 12, 4).value()),
                        new ZPair(3, function_substr.f.env(env).call(nameParsed, 16, 4).value()),
                        new ZPair(4, function_substr.f.env(env).call(nameParsed, 20).value()));
        nameParsed = NamespaceGlobal.implode.env(env).call("-", components).value();
        if (!ZVal.isTrue(Uuid.runtimeStaticObject.isValid(env, nameParsed))) {
            throw ZVal.getException(
                    env,
                    new InvalidUuidStringException(
                            env, "Invalid UUID string: " + toStringR(encodedUuid, env)));
        }

        return ZVal.assign(components);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "components", typeHint = "array")
    protected Object getFields(RuntimeEnv env, Object... args) {
        ReferenceContainer components =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "time_low",
                                NamespaceGlobal.str_pad
                                        .env(env)
                                        .call(components.arrayGet(env, 0), 8, "0", 0)
                                        .value()),
                        new ZPair(
                                "time_mid",
                                NamespaceGlobal.str_pad
                                        .env(env)
                                        .call(components.arrayGet(env, 1), 4, "0", 0)
                                        .value()),
                        new ZPair(
                                "time_hi_and_version",
                                NamespaceGlobal.str_pad
                                        .env(env)
                                        .call(components.arrayGet(env, 2), 4, "0", 0)
                                        .value()),
                        new ZPair(
                                "clock_seq_hi_and_reserved",
                                NamespaceGlobal.str_pad
                                        .env(env)
                                        .call(
                                                function_substr
                                                        .f
                                                        .env(env)
                                                        .call(components.arrayGet(env, 3), 0, 2)
                                                        .value(),
                                                2,
                                                "0",
                                                0)
                                        .value()),
                        new ZPair(
                                "clock_seq_low",
                                NamespaceGlobal.str_pad
                                        .env(env)
                                        .call(
                                                function_substr
                                                        .f
                                                        .env(env)
                                                        .call(components.arrayGet(env, 3), 2)
                                                        .value(),
                                                2,
                                                "0",
                                                0)
                                        .value()),
                        new ZPair(
                                "node",
                                NamespaceGlobal.str_pad
                                        .env(env)
                                        .call(components.arrayGet(env, 4), 12, "0", 0)
                                        .value())));
    }

    public static final Object CONST_class = "Ramsey\\Uuid\\Codec\\StringCodec";

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
                    .setName("Ramsey\\Uuid\\Codec\\StringCodec")
                    .setLookup(
                            StringCodec.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("builder")
                    .setFilename("vendor/ramsey/uuid/src/Codec/StringCodec.php")
                    .addInterface("Ramsey\\Uuid\\Codec\\CodecInterface")
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
