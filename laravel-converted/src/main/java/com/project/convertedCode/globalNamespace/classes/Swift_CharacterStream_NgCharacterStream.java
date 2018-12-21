package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Swift_CharacterStream;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.classes.Swift_CharacterReader;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/CharacterStream/NgCharacterStream.php

*/

public class Swift_CharacterStream_NgCharacterStream extends RuntimeClassBase
        implements Swift_CharacterStream {

    public Object charReader = null;

    public Object charReaderFactory = null;

    public Object charset = null;

    public Object datas = "";

    public Object datasSize = 0;

    public Object map = null;

    public Object mapType = 0;

    public Object charCount = 0;

    public Object currentPos = 0;

    public Swift_CharacterStream_NgCharacterStream(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_CharacterStream_NgCharacterStream.class) {
            this.__construct(env, args);
        }
    }

    public Swift_CharacterStream_NgCharacterStream(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "factory", typeHint = "Swift_CharacterReaderFactory")
    @ConvertedParameter(index = 1, name = "charset")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object factory = assignParameter(args, 0, false);
        Object charset = assignParameter(args, 1, false);
        this.setCharacterReaderFactory(env, factory);
        this.setCharacterSet(env, charset);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "charset")
    public Object setCharacterSet(RuntimeEnv env, Object... args) {
        Object charset = assignParameter(args, 0, false);
        this.charset = charset;
        this.charReader = ZVal.getNull();
        this.mapType = 0;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "factory", typeHint = "Swift_CharacterReaderFactory")
    public Object setCharacterReaderFactory(RuntimeEnv env, Object... args) {
        Object factory = assignParameter(args, 0, false);
        this.charReaderFactory = factory;
        return null;
    }

    @ConvertedMethod
    public Object flushContents(RuntimeEnv env, Object... args) {
        this.datas = ZVal.getNull();
        this.map = ZVal.getNull();
        this.charCount = 0;
        this.currentPos = 0;
        this.datasSize = 0;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "os", typeHint = "Swift_OutputByteStream")
    public Object importByteStream(RuntimeEnv env, Object... args) {
        Object os = assignParameter(args, 0, false);
        Object read = null;
        Object blocks = null;
        this.flushContents(env);
        blocks = 512;
        env.callMethod(os, "setReadPointer", Swift_CharacterStream_NgCharacterStream.class, 0);
        while (ZVal.strictNotEqualityCheck(
                false,
                "!==",
                read =
                        env.callMethod(
                                os,
                                "read",
                                Swift_CharacterStream_NgCharacterStream.class,
                                blocks))) {
            this.write(env, read);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    public Object importString(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        this.flushContents(env);
        this.write(env, string);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "length")
    public Object read(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object length = assignParameter(args, 0, false);
        Object ret = null;
        Object len = null;
        Object start = null;
        Object end = null;
        Object to = null;
        if (ZVal.isGreaterThanOrEqualTo(this.currentPos, ">=", this.charCount)) {
            return ZVal.assign(false);
        }

        ret = false;
        length =
                ZVal.assign(
                        ZVal.isGreaterThan(ZVal.add(this.currentPos, length), '>', this.charCount)
                                ? ZVal.subtract(this.charCount, this.currentPos)
                                : length);
        SwitchEnumType95 switchVariable95 =
                ZVal.getEnum(
                        this.mapType,
                        SwitchEnumType95.DEFAULT_CASE,
                        SwitchEnumType95.DYNAMIC_TYPE_331,
                        Swift_CharacterReader.CONST_MAP_TYPE_FIXED_LEN,
                        SwitchEnumType95.DYNAMIC_TYPE_332,
                        Swift_CharacterReader.CONST_MAP_TYPE_INVALID,
                        SwitchEnumType95.DYNAMIC_TYPE_333,
                        Swift_CharacterReader.CONST_MAP_TYPE_POSITIONS);
        switch (switchVariable95) {
            case DYNAMIC_TYPE_331:
                len = ZVal.multiply(length, this.map);
                ret =
                        function_substr
                                .f
                                .env(env)
                                .call(this.datas, ZVal.multiply(this.currentPos, this.map), len)
                                .value();
                this.currentPos = ZAssignment.add("+=", this.currentPos, length);
                break;
            case DYNAMIC_TYPE_332:
                ret = "";
                runtimeConverterBreakCount = 0;
                for (;
                        ZVal.isLessThan(this.currentPos, '<', length);
                        this.currentPos = ZVal.increment(this.currentPos)) {
                    if (arrayActionR(
                            ArrayAction.ISSET,
                            new ReferenceClassProperty(this, "map", env),
                            env,
                            this.currentPos)) {
                        ret = toStringR(ret, env) + "?";

                    } else {
                        ret =
                                toStringR(ret, env)
                                        + toStringR(
                                                new ReferenceClassProperty(this, "datas", env)
                                                        .arrayGet(env, this.currentPos),
                                                env);
                    }
                }

                break;
            case DYNAMIC_TYPE_333:
                end = ZVal.add(this.currentPos, length);
                end =
                        ZVal.assign(
                                ZVal.isGreaterThan(end, '>', this.charCount)
                                        ? this.charCount
                                        : end);
                ret = "";
                start = 0;
                if (ZVal.isGreaterThan(this.currentPos, '>', 0)) {
                    start =
                            ZVal.assign(
                                    new ReferenceClassProperty(this, "map", env)
                                            .arrayGet(env, "p", ZVal.subtract(this.currentPos, 1)));
                }

                to = ZVal.assign(start);
                runtimeConverterBreakCount = 0;
                for (;
                        ZVal.isLessThan(this.currentPos, '<', end);
                        this.currentPos = ZVal.increment(this.currentPos)) {
                    if (arrayActionR(
                            ArrayAction.ISSET,
                            new ReferenceClassProperty(this, "map", env),
                            env,
                            "i",
                            this.currentPos)) {
                        ret =
                                toStringR(ret, env)
                                        + toStringR(
                                                function_substr
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                this.datas,
                                                                start,
                                                                ZVal.subtract(to, start))
                                                        .value(),
                                                env)
                                        + "?";
                        start =
                                ZVal.assign(
                                        new ReferenceClassProperty(this, "map", env)
                                                .arrayGet(env, "p", this.currentPos));

                    } else {
                        to =
                                ZVal.assign(
                                        new ReferenceClassProperty(this, "map", env)
                                                .arrayGet(env, "p", this.currentPos));
                    }
                }

                ret =
                        toStringR(ret, env)
                                + toStringR(
                                        function_substr
                                                .f
                                                .env(env)
                                                .call(this.datas, start, ZVal.subtract(to, start))
                                                .value(),
                                        env);
                break;
        }
        ;
        return ZVal.assign(ret);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "length")
    public Object readBytes(RuntimeEnv env, Object... args) {
        Object length = assignParameter(args, 0, false);
        Object ret = null;
        Object read = null;
        read = this.read(env, length);
        if (ZVal.strictNotEqualityCheck(false, "!==", read)) {
            ret =
                    function_array_map
                            .f
                            .env(env)
                            .call("ord", NamespaceGlobal.str_split.env(env).call(read, 1).value())
                            .value();
            return ZVal.assign(ret);
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "charOffset")
    public Object setPointer(RuntimeEnv env, Object... args) {
        Object charOffset = assignParameter(args, 0, false);
        if (ZVal.isLessThan(this.charCount, '<', charOffset)) {
            charOffset = ZVal.assign(this.charCount);
        }

        this.currentPos = charOffset;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "chars")
    public Object write(RuntimeEnv env, Object... args) {
        Object chars = assignParameter(args, 0, false);
        ReferenceContainer ignored = new BasicReferenceContainer(null);
        if (!ZVal.isset(this.charReader)) {
            this.charReader =
                    env.callMethod(
                            this.charReaderFactory,
                            "getReaderFor",
                            Swift_CharacterStream_NgCharacterStream.class,
                            this.charset);
            this.map = ZVal.newArray();
            this.mapType =
                    env.callMethod(
                            this.charReader,
                            "getMapType",
                            Swift_CharacterStream_NgCharacterStream.class);
        }

        ignored.setObject("");
        this.datas = toStringR(this.datas, env) + toStringR(chars, env);
        this.charCount =
                ZAssignment.add(
                        "+=",
                        this.charCount,
                        env.callMethod(
                                this.charReader,
                                new RuntimeArgsWithReferences()
                                        .add(2, new ReferenceClassProperty(this, "map", env))
                                        .add(3, ignored),
                                "getCharPositions",
                                Swift_CharacterStream_NgCharacterStream.class,
                                function_substr.f.env(env).call(this.datas, this.datasSize).value(),
                                this.datasSize,
                                this.map,
                                ignored.getObject()));
        if (ZVal.strictNotEqualityCheck(false, "!==", ignored.getObject())) {
            this.datasSize =
                    ZVal.subtract(
                            function_strlen.f.env(env).call(this.datas).value(),
                            function_strlen.f.env(env).call(ignored.getObject()).value());

        } else {
            this.datasSize = function_strlen.f.env(env).call(this.datas).value();
        }

        return null;
    }

    public static final Object CONST_class = "Swift_CharacterStream_NgCharacterStream";

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
                    .setName("Swift_CharacterStream_NgCharacterStream")
                    .setLookup(
                            Swift_CharacterStream_NgCharacterStream.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "charCount",
                            "charReader",
                            "charReaderFactory",
                            "charset",
                            "currentPos",
                            "datas",
                            "datasSize",
                            "map",
                            "mapType")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/CharacterStream/NgCharacterStream.php")
                    .addInterface("Swift_CharacterStream")
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

    private enum SwitchEnumType95 {
        DYNAMIC_TYPE_331,
        DYNAMIC_TYPE_332,
        DYNAMIC_TYPE_333,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
