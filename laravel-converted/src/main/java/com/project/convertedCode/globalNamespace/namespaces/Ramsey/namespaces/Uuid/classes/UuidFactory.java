package com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.classes.BinaryUtils;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.classes.UuidInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.classes.FeatureSet;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.classes.UuidFactoryInterface;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/ramsey/uuid/src/UuidFactory.php

*/

public class UuidFactory extends RuntimeClassBase implements UuidFactoryInterface {

    public Object codec = ZVal.getNull();

    public Object nodeProvider = ZVal.getNull();

    public Object numberConverter = ZVal.getNull();

    public Object randomGenerator = ZVal.getNull();

    public Object timeGenerator = ZVal.getNull();

    public Object uuidBuilder = ZVal.getNull();

    public UuidFactory(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == UuidFactory.class) {
            this.__construct(env, args);
        }
    }

    public UuidFactory(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "features",
        typeHint = "Ramsey\\Uuid\\FeatureSet",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object features = assignParameter(args, 0, true);
        if (null == features) {
            features = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        features =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = features)
                                ? ternaryExpressionTemp
                                : new FeatureSet(env));
        this.codec = env.callMethod(features, "getCodec", UuidFactory.class);
        this.nodeProvider = env.callMethod(features, "getNodeProvider", UuidFactory.class);
        this.numberConverter = env.callMethod(features, "getNumberConverter", UuidFactory.class);
        this.randomGenerator = env.callMethod(features, "getRandomGenerator", UuidFactory.class);
        this.timeGenerator = env.callMethod(features, "getTimeGenerator", UuidFactory.class);
        this.uuidBuilder = env.callMethod(features, "getBuilder", UuidFactory.class);
        return null;
    }

    @ConvertedMethod
    public Object getCodec(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.codec);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "codec", typeHint = "Ramsey\\Uuid\\Codec\\CodecInterface")
    public Object setCodec(RuntimeEnv env, Object... args) {
        Object codec = assignParameter(args, 0, false);
        this.codec = codec;
        return null;
    }

    @ConvertedMethod
    public Object getNodeProvider(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.nodeProvider);
    }

    @ConvertedMethod
    public Object getRandomGenerator(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.randomGenerator);
    }

    @ConvertedMethod
    public Object getTimeGenerator(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.timeGenerator);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "generator",
        typeHint = "Ramsey\\Uuid\\Generator\\TimeGeneratorInterface"
    )
    public Object setTimeGenerator(RuntimeEnv env, Object... args) {
        Object generator = assignParameter(args, 0, false);
        this.timeGenerator = generator;
        return null;
    }

    @ConvertedMethod
    public Object getNumberConverter(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.numberConverter);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "generator",
        typeHint = "Ramsey\\Uuid\\Generator\\RandomGeneratorInterface"
    )
    public Object setRandomGenerator(RuntimeEnv env, Object... args) {
        Object generator = assignParameter(args, 0, false);
        this.randomGenerator = generator;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "converter",
        typeHint = "Ramsey\\Uuid\\Converter\\NumberConverterInterface"
    )
    public Object setNumberConverter(RuntimeEnv env, Object... args) {
        Object converter = assignParameter(args, 0, false);
        this.numberConverter = converter;
        return null;
    }

    @ConvertedMethod
    public Object getUuidBuilder(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.uuidBuilder);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "builder",
        typeHint = "Ramsey\\Uuid\\Builder\\UuidBuilderInterface"
    )
    public Object setUuidBuilder(RuntimeEnv env, Object... args) {
        Object builder = assignParameter(args, 0, false);
        this.uuidBuilder = builder;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bytes")
    public Object fromBytes(RuntimeEnv env, Object... args) {
        Object bytes = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this.codec, "decodeBytes", UuidFactory.class, bytes));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uuid")
    public Object fromString(RuntimeEnv env, Object... args) {
        Object uuid = assignParameter(args, 0, false);
        uuid = NamespaceGlobal.strtolower.env(env).call(uuid).value();
        return ZVal.assign(env.callMethod(this.codec, "decode", UuidFactory.class, uuid));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "integer")
    public Object fromInteger(RuntimeEnv env, Object... args) {
        Object integer = assignParameter(args, 0, false);
        Object hex = null;
        hex = env.callMethod(this.numberConverter, "toHex", UuidFactory.class, integer);
        hex = NamespaceGlobal.str_pad.env(env).call(hex, 32, "0", 0).value();
        return ZVal.assign(this.fromString(env, hex));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "clockSeq",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object uuid1(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, true);
        if (null == node) {
            node = ZVal.getNull();
        }
        Object clockSeq = assignParameter(args, 1, true);
        if (null == clockSeq) {
            clockSeq = ZVal.getNull();
        }
        Object bytes = null;
        Object hex = null;
        bytes = env.callMethod(this.timeGenerator, "generate", UuidFactory.class, node, clockSeq);
        hex = NamespaceGlobal.bin2hex.env(env).call(bytes).value();
        return ZVal.assign(this.uuidFromHashedName(env, hex, 1));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ns")
    @ConvertedParameter(index = 1, name = "name")
    public Object uuid3(RuntimeEnv env, Object... args) {
        Object ns = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        return ZVal.assign(this.uuidFromNsAndName(env, ns, name, 3, "md5"));
    }

    @ConvertedMethod
    public Object uuid4(RuntimeEnv env, Object... args) {
        Object bytes = null;
        Object hex = null;
        bytes = env.callMethod(this.randomGenerator, "generate", UuidFactory.class, 16);
        hex = NamespaceGlobal.bin2hex.env(env).call(bytes).value();
        return ZVal.assign(this.uuidFromHashedName(env, hex, 4));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ns")
    @ConvertedParameter(index = 1, name = "name")
    public Object uuid5(RuntimeEnv env, Object... args) {
        Object ns = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        return ZVal.assign(this.uuidFromNsAndName(env, ns, name, 5, "sha1"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fields", typeHint = "array")
    public Object uuid(RuntimeEnv env, Object... args) {
        Object fields = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(this.uuidBuilder, "build", UuidFactory.class, this.codec, fields));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ns")
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(index = 2, name = "version")
    @ConvertedParameter(index = 3, name = "hashFunction")
    protected Object uuidFromNsAndName(RuntimeEnv env, Object... args) {
        Object ns = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        Object version = assignParameter(args, 2, false);
        Object hashFunction = assignParameter(args, 3, false);
        Object hash = null;
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(ns, UuidInterface.class, "Ramsey\\Uuid\\UuidInterface"))) {
            ns = env.callMethod(this.codec, "decode", UuidFactory.class, ns);
        }

        hash =
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(
                                hashFunction,
                                toStringR(env.callMethod(ns, "getBytes", UuidFactory.class), env)
                                        + toStringR(name, env))
                        .value();
        return ZVal.assign(this.uuidFromHashedName(env, hash, version));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "hash")
    @ConvertedParameter(index = 1, name = "version")
    protected Object uuidFromHashedName(RuntimeEnv env, Object... args) {
        Object hash = assignParameter(args, 0, false);
        Object version = assignParameter(args, 1, false);
        Object timeHi = null;
        Object clockSeqHi = null;
        Object fields = null;
        timeHi =
                BinaryUtils.runtimeStaticObject.applyVersion(
                        env, function_substr.f.env(env).call(hash, 12, 4).value(), version);
        clockSeqHi =
                BinaryUtils.runtimeStaticObject.applyVariant(
                        env,
                        NamespaceGlobal.hexdec
                                .env(env)
                                .call(function_substr.f.env(env).call(hash, 16, 2).value())
                                .value());
        fields =
                ZVal.newArray(
                        new ZPair("time_low", function_substr.f.env(env).call(hash, 0, 8).value()),
                        new ZPair("time_mid", function_substr.f.env(env).call(hash, 8, 4).value()),
                        new ZPair(
                                "time_hi_and_version",
                                NamespaceGlobal.str_pad
                                        .env(env)
                                        .call(
                                                NamespaceGlobal.dechex
                                                        .env(env)
                                                        .call(timeHi)
                                                        .value(),
                                                4,
                                                "0",
                                                0)
                                        .value()),
                        new ZPair(
                                "clock_seq_hi_and_reserved",
                                NamespaceGlobal.str_pad
                                        .env(env)
                                        .call(
                                                NamespaceGlobal.dechex
                                                        .env(env)
                                                        .call(clockSeqHi)
                                                        .value(),
                                                2,
                                                "0",
                                                0)
                                        .value()),
                        new ZPair(
                                "clock_seq_low",
                                function_substr.f.env(env).call(hash, 18, 2).value()),
                        new ZPair("node", function_substr.f.env(env).call(hash, 20, 12).value()));
        return ZVal.assign(this.uuid(env, fields));
    }

    public static final Object CONST_class = "Ramsey\\Uuid\\UuidFactory";

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
                    .setName("Ramsey\\Uuid\\UuidFactory")
                    .setLookup(
                            UuidFactory.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "codec",
                            "nodeProvider",
                            "numberConverter",
                            "randomGenerator",
                            "timeGenerator",
                            "uuidBuilder")
                    .setFilename("vendor/ramsey/uuid/src/UuidFactory.php")
                    .addInterface("Ramsey\\Uuid\\UuidFactoryInterface")
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
