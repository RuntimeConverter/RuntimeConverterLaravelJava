package com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.classes.UuidFactory;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.classes.UuidInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Exception.classes.UnsupportedOperationException;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/ramsey/uuid/src/Uuid.php

*/

public class Uuid extends RuntimeClassBase implements UuidInterface {

    public Object codec = null;

    public Object fields =
            ZVal.newArray(
                    new ZPair("time_low", "00000000"),
                    new ZPair("time_mid", "0000"),
                    new ZPair("time_hi_and_version", "0000"),
                    new ZPair("clock_seq_hi_and_reserved", "00"),
                    new ZPair("clock_seq_low", "00"),
                    new ZPair("node", "000000000000"));

    public Object converter = null;

    public Uuid(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Uuid.class) {
            this.__construct(env, args);
        }
    }

    public Uuid(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fields", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "converter",
        typeHint = "Ramsey\\Uuid\\Converter\\NumberConverterInterface"
    )
    @ConvertedParameter(index = 2, name = "codec", typeHint = "Ramsey\\Uuid\\Codec\\CodecInterface")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object fields = assignParameter(args, 0, false);
        Object converter = assignParameter(args, 1, false);
        Object codec = assignParameter(args, 2, false);
        this.fields = fields;
        this.codec = codec;
        this.converter = converter;
        return null;
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.toString(env));
    }

    @ConvertedMethod
    public Object jsonSerialize(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.toString(env));
    }

    @ConvertedMethod
    public Object serialize(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.toString(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "serialized")
    public Object unserialize(RuntimeEnv env, Object... args) {
        Object serialized = assignParameter(args, 0, false);
        Object uuid = null;
        uuid = runtimeStaticObject.fromString(env, serialized);
        this.codec = toObjectR(uuid).accessProp(this, env).name("codec").value();
        this.converter = toObjectR(uuid).accessProp(this, env).name("converter").value();
        this.fields = toObjectR(uuid).accessProp(this, env).name("fields").value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other", typeHint = "Ramsey\\Uuid\\UuidInterface")
    public Object compareTo(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, false);
        Object comparison = null;
        comparison = 0;
        if (ZVal.isLessThan(
                this.getMostSignificantBitsHex(env),
                '<',
                env.callMethod(other, "getMostSignificantBitsHex", Uuid.class))) {
            comparison = -1;

        } else if (ZVal.isGreaterThan(
                this.getMostSignificantBitsHex(env),
                '>',
                env.callMethod(other, "getMostSignificantBitsHex", Uuid.class))) {
            comparison = 1;

        } else if (ZVal.isLessThan(
                this.getLeastSignificantBitsHex(env),
                '<',
                env.callMethod(other, "getLeastSignificantBitsHex", Uuid.class))) {
            comparison = -1;

        } else if (ZVal.isGreaterThan(
                this.getLeastSignificantBitsHex(env),
                '>',
                env.callMethod(other, "getLeastSignificantBitsHex", Uuid.class))) {
            comparison = 1;
        }

        return ZVal.assign(comparison);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    public Object equals(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, false);
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        other, UuidInterface.class, "Ramsey\\Uuid\\UuidInterface"))) {
            return ZVal.assign(false);
        }

        return ZVal.assign(ZVal.equalityCheck(this.compareTo(env, other), 0));
    }

    @ConvertedMethod
    public Object getBytes(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.codec, "encodeBinary", Uuid.class, this));
    }

    @ConvertedMethod
    public Object getClockSeqHiAndReserved(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                NamespaceGlobal.hexdec
                        .env(env)
                        .call(this.getClockSeqHiAndReservedHex(env))
                        .value());
    }

    @ConvertedMethod
    public Object getClockSeqHiAndReservedHex(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "fields", env)
                        .arrayGet(env, "clock_seq_hi_and_reserved"));
    }

    @ConvertedMethod
    public Object getClockSeqLow(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                NamespaceGlobal.hexdec.env(env).call(this.getClockSeqLowHex(env)).value());
    }

    @ConvertedMethod
    public Object getClockSeqLowHex(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "fields", env).arrayGet(env, "clock_seq_low"));
    }

    @ConvertedMethod
    public Object getClockSequence(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toLong(
                                ZVal.toLong(
                                                ZVal.toLong(this.getClockSeqHiAndReserved(env))
                                                        & ZVal.toLong(63))
                                        << ZVal.toLong(8))
                        | ZVal.toLong(this.getClockSeqLow(env)));
    }

    @ConvertedMethod
    public Object getClockSequenceHex(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_sprintf.f.env(env).call("%04x", this.getClockSequence(env)).value());
    }

    @ConvertedMethod
    public Object getNumberConverter(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.converter);
    }

    @ConvertedMethod
    public Object getDateTime(RuntimeEnv env, Object... args) {
        Object unixTime = null;
        if (ZVal.notEqualityCheck(this.getVersion(env), 1)) {
            throw ZVal.getException(
                    env, new UnsupportedOperationException(env, "Not a time-based UUID"));
        }

        unixTime =
                ZVal.divide(ZVal.subtract(this.getTimestamp(env), 122192928000000000L), 10000000.0);
        unixTime = NamespaceGlobal.number_format.env(env).call(unixTime, 0, "", "").value();
        return ZVal.assign(new DateTime(env, "@" + toStringR(unixTime, env)));
    }

    @ConvertedMethod
    public Object getFields(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("time_low", this.getTimeLow(env)),
                        new ZPair("time_mid", this.getTimeMid(env)),
                        new ZPair("time_hi_and_version", this.getTimeHiAndVersion(env)),
                        new ZPair("clock_seq_hi_and_reserved", this.getClockSeqHiAndReserved(env)),
                        new ZPair("clock_seq_low", this.getClockSeqLow(env)),
                        new ZPair("node", this.getNode(env))));
    }

    @ConvertedMethod
    public Object getFieldsHex(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.fields);
    }

    @ConvertedMethod
    public Object getHex(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_str_replace.f.env(env).call("-", "", this.toString(env)).value());
    }

    @ConvertedMethod
    public Object getInteger(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.converter, "fromHex", Uuid.class, this.getHex(env)));
    }

    @ConvertedMethod
    public Object getLeastSignificantBits(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this.converter,
                        "fromHex",
                        Uuid.class,
                        this.getLeastSignificantBitsHex(env)));
    }

    @ConvertedMethod
    public Object getLeastSignificantBitsHex(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%02s%02s%012s",
                                new ReferenceClassProperty(this, "fields", env)
                                        .arrayGet(env, "clock_seq_hi_and_reserved"),
                                new ReferenceClassProperty(this, "fields", env)
                                        .arrayGet(env, "clock_seq_low"),
                                new ReferenceClassProperty(this, "fields", env)
                                        .arrayGet(env, "node"))
                        .value());
    }

    @ConvertedMethod
    public Object getMostSignificantBits(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this.converter,
                        "fromHex",
                        Uuid.class,
                        this.getMostSignificantBitsHex(env)));
    }

    @ConvertedMethod
    public Object getMostSignificantBitsHex(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%08s%04s%04s",
                                new ReferenceClassProperty(this, "fields", env)
                                        .arrayGet(env, "time_low"),
                                new ReferenceClassProperty(this, "fields", env)
                                        .arrayGet(env, "time_mid"),
                                new ReferenceClassProperty(this, "fields", env)
                                        .arrayGet(env, "time_hi_and_version"))
                        .value());
    }

    @ConvertedMethod
    public Object getNode(RuntimeEnv env, Object... args) {
        return ZVal.assign(NamespaceGlobal.hexdec.env(env).call(this.getNodeHex(env)).value());
    }

    @ConvertedMethod
    public Object getNodeHex(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ReferenceClassProperty(this, "fields", env).arrayGet(env, "node"));
    }

    @ConvertedMethod
    public Object getTimeHiAndVersion(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                NamespaceGlobal.hexdec.env(env).call(this.getTimeHiAndVersionHex(env)).value());
    }

    @ConvertedMethod
    public Object getTimeHiAndVersionHex(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "fields", env)
                        .arrayGet(env, "time_hi_and_version"));
    }

    @ConvertedMethod
    public Object getTimeLow(RuntimeEnv env, Object... args) {
        return ZVal.assign(NamespaceGlobal.hexdec.env(env).call(this.getTimeLowHex(env)).value());
    }

    @ConvertedMethod
    public Object getTimeLowHex(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "fields", env).arrayGet(env, "time_low"));
    }

    @ConvertedMethod
    public Object getTimeMid(RuntimeEnv env, Object... args) {
        return ZVal.assign(NamespaceGlobal.hexdec.env(env).call(this.getTimeMidHex(env)).value());
    }

    @ConvertedMethod
    public Object getTimeMidHex(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "fields", env).arrayGet(env, "time_mid"));
    }

    @ConvertedMethod
    public Object getTimestamp(RuntimeEnv env, Object... args) {
        if (ZVal.notEqualityCheck(this.getVersion(env), 1)) {
            throw ZVal.getException(
                    env, new UnsupportedOperationException(env, "Not a time-based UUID"));
        }

        return ZVal.assign(NamespaceGlobal.hexdec.env(env).call(this.getTimestampHex(env)).value());
    }

    @ConvertedMethod
    public Object getTimestampHex(RuntimeEnv env, Object... args) {
        if (ZVal.notEqualityCheck(this.getVersion(env), 1)) {
            throw ZVal.getException(
                    env, new UnsupportedOperationException(env, "Not a time-based UUID"));
        }

        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%03x%04s%08s",
                                ZVal.toLong(this.getTimeHiAndVersion(env)) & ZVal.toLong(4095),
                                new ReferenceClassProperty(this, "fields", env)
                                        .arrayGet(env, "time_mid"),
                                new ReferenceClassProperty(this, "fields", env)
                                        .arrayGet(env, "time_low"))
                        .value());
    }

    @ConvertedMethod
    public Object getUrn(RuntimeEnv env, Object... args) {
        return ZVal.assign("urn:uuid:" + toStringR(this.toString(env), env));
    }

    @ConvertedMethod
    public Object getVariant(RuntimeEnv env, Object... args) {
        Object clockSeq = null;
        Object variant = null;
        clockSeq = this.getClockSeqHiAndReserved(env);
        if (ZVal.strictEqualityCheck(0, "===", ZVal.toLong(clockSeq) & ZVal.toLong(128))) {
            variant = ZVal.assign(CONST_RESERVED_NCS);

        } else if (ZVal.strictEqualityCheck(0, "===", ZVal.toLong(clockSeq) & ZVal.toLong(64))) {
            variant = ZVal.assign(CONST_RFC_4122);

        } else if (ZVal.strictEqualityCheck(0, "===", ZVal.toLong(clockSeq) & ZVal.toLong(32))) {
            variant = ZVal.assign(CONST_RESERVED_MICROSOFT);

        } else {
            variant = ZVal.assign(CONST_RESERVED_FUTURE);
        }

        return ZVal.assign(variant);
    }

    @ConvertedMethod
    public Object getVersion(RuntimeEnv env, Object... args) {
        if (ZVal.equalityCheck(this.getVariant(env), CONST_RFC_4122)) {
            return ZVal.assign(
                    ZVal.toLong(
                            ZVal.toLong(
                                            ZVal.toLong(this.getTimeHiAndVersion(env))
                                                    >> ZVal.toLong(12))
                                    & ZVal.toLong(15)));
        }

        return ZVal.assign(ZVal.getNull());
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.codec, "encode", Uuid.class, this));
    }

    public static final Object CONST_NAMESPACE_DNS = "6ba7b810-9dad-11d1-80b4-00c04fd430c8";

    public static final Object CONST_NAMESPACE_URL = "6ba7b811-9dad-11d1-80b4-00c04fd430c8";

    public static final Object CONST_NAMESPACE_OID = "6ba7b812-9dad-11d1-80b4-00c04fd430c8";

    public static final Object CONST_NAMESPACE_X500 = "6ba7b814-9dad-11d1-80b4-00c04fd430c8";

    public static final Object CONST_NIL = "00000000-0000-0000-0000-000000000000";

    public static final Object CONST_RESERVED_NCS = 0;

    public static final Object CONST_RFC_4122 = 2;

    public static final Object CONST_RESERVED_MICROSOFT = 6;

    public static final Object CONST_RESERVED_FUTURE = 7;

    public static final Object CONST_VALID_PATTERN =
            "^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{12}$";

    public static final Object CONST_UUID_TYPE_TIME = 1;

    public static final Object CONST_UUID_TYPE_IDENTIFIER = 2;

    public static final Object CONST_UUID_TYPE_HASH_MD5 = 3;

    public static final Object CONST_UUID_TYPE_RANDOM = 4;

    public static final Object CONST_UUID_TYPE_HASH_SHA1 = 5;

    public static final Object CONST_class = "Ramsey\\Uuid\\Uuid";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object getFactory(RuntimeEnv env, Object... args) {
            if (!ZVal.isTrue(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Ramsey
                                            .namespaces
                                            .Uuid
                                            .classes
                                            .Uuid
                                            .RequestStaticProperties
                                            .class)
                            .factory)) {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Ramsey
                                                .namespaces
                                                .Uuid
                                                .classes
                                                .Uuid
                                                .RequestStaticProperties
                                                .class)
                                .factory =
                        new UuidFactory(env);
            }

            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Ramsey
                                            .namespaces
                                            .Uuid
                                            .classes
                                            .Uuid
                                            .RequestStaticProperties
                                            .class)
                            .factory);
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "factory",
            typeHint = "Ramsey\\Uuid\\UuidFactoryInterface"
        )
        public Object setFactory(RuntimeEnv env, Object... args) {
            Object factory = assignParameter(args, 0, false);
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Ramsey
                                            .namespaces
                                            .Uuid
                                            .classes
                                            .Uuid
                                            .RequestStaticProperties
                                            .class)
                            .factory =
                    factory;
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "bytes")
        public Object fromBytes(RuntimeEnv env, Object... args) {
            Object bytes = assignParameter(args, 0, false);
            return ZVal.assign(
                    env.callMethod(
                            runtimeStaticObject.getFactory(env), "fromBytes", Uuid.class, bytes));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        public Object fromString(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            return ZVal.assign(
                    env.callMethod(
                            runtimeStaticObject.getFactory(env), "fromString", Uuid.class, name));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "integer")
        public Object fromInteger(RuntimeEnv env, Object... args) {
            Object integer = assignParameter(args, 0, false);
            return ZVal.assign(
                    env.callMethod(
                            runtimeStaticObject.getFactory(env),
                            "fromInteger",
                            Uuid.class,
                            integer));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "uuid")
        public Object isValid(RuntimeEnv env, Object... args) {
            Object uuid = assignParameter(args, 0, false);
            uuid =
                    function_str_replace
                            .f
                            .env(env)
                            .call(ZVal.arrayFromList("urn:", "uuid:", "{", "}"), "", uuid)
                            .value();
            if (ZVal.equalityCheck(uuid, CONST_NIL)) {
                return ZVal.assign(true);
            }

            if (!function_preg_match
                    .f
                    .env(env)
                    .call("/" + toStringR(CONST_VALID_PATTERN, env) + "/", uuid)
                    .getBool()) {
                return ZVal.assign(false);
            }

            return ZVal.assign(true);
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
            return ZVal.assign(
                    env.callMethod(
                            runtimeStaticObject.getFactory(env),
                            "uuid1",
                            Uuid.class,
                            node,
                            clockSeq));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "ns")
        @ConvertedParameter(index = 1, name = "name")
        public Object uuid3(RuntimeEnv env, Object... args) {
            Object ns = assignParameter(args, 0, false);
            Object name = assignParameter(args, 1, false);
            return ZVal.assign(
                    env.callMethod(
                            runtimeStaticObject.getFactory(env), "uuid3", Uuid.class, ns, name));
        }

        @ConvertedMethod
        public Object uuid4(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    env.callMethod(runtimeStaticObject.getFactory(env), "uuid4", Uuid.class));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "ns")
        @ConvertedParameter(index = 1, name = "name")
        public Object uuid5(RuntimeEnv env, Object... args) {
            Object ns = assignParameter(args, 0, false);
            Object name = assignParameter(args, 1, false);
            return ZVal.assign(
                    env.callMethod(
                            runtimeStaticObject.getFactory(env), "uuid5", Uuid.class, ns, name));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object factory = ZVal.getNull();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Ramsey\\Uuid\\Uuid")
                    .setLookup(
                            Uuid.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("codec", "converter", "fields")
                    .setStaticPropertyNames("factory")
                    .setFilename("vendor/ramsey/uuid/src/Uuid.php")
                    .addInterface("Ramsey\\Uuid\\UuidInterface")
                    .addInterface("JsonSerializable")
                    .addInterface("Serializable")
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
