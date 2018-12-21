package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Swift_CharacterStream;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fread;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_flip;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_splice;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fwrite;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/CharacterStream/ArrayCharacterStream.php

*/

public class Swift_CharacterStream_ArrayCharacterStream extends RuntimeClassBase
        implements Swift_CharacterStream {

    public Object charReader = null;

    public Object charReaderFactory = null;

    public Object charset = null;

    public Object array = ZVal.newArray();

    public Object array_size = ZVal.newArray();

    public Object offset = 0;

    public Swift_CharacterStream_ArrayCharacterStream(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_CharacterStream_ArrayCharacterStream.class) {
            this.__construct(env, args);
        }
    }

    public Swift_CharacterStream_ArrayCharacterStream(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "factory", typeHint = "Swift_CharacterReaderFactory")
    @ConvertedParameter(index = 1, name = "charset")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object factory = assignParameter(args, 0, false);
        Object charset = assignParameter(args, 1, false);
        runtimeStaticObject.initializeMaps(env);
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
    @ConvertedParameter(index = 0, name = "os", typeHint = "Swift_OutputByteStream")
    public Object importByteStream(RuntimeEnv env, Object... args) {
        Object os = assignParameter(args, 0, false);
        ReferenceContainer c = new BasicReferenceContainer(null);
        Object len = null;
        Object size = null;
        Object startLength = null;
        Object need = null;
        ReferenceContainer bytes = new BasicReferenceContainer(null);
        ReferenceContainer i = new BasicReferenceContainer(null);
        if (!ZVal.isset(this.charReader)) {
            this.charReader =
                    env.callMethod(
                            this.charReaderFactory,
                            "getReaderFor",
                            Swift_CharacterStream_ArrayCharacterStream.class,
                            this.charset);
        }

        startLength =
                env.callMethod(
                        this.charReader,
                        "getInitialByteSize",
                        Swift_CharacterStream_ArrayCharacterStream.class);
        while (ZVal.strictNotEqualityCheck(
                false,
                "!==",
                bytes.setObject(
                        env.callMethod(
                                os,
                                "read",
                                Swift_CharacterStream_ArrayCharacterStream.class,
                                startLength)))) {
            c.setObject(ZVal.newArray());
            for (i.setObject(0), len = function_strlen.f.env(env).call(bytes.getObject()).value();
                    ZVal.isLessThan(i.getObject(), '<', len);
                    i.setObject(ZVal.increment(i.getObject()))) {
                c.arrayAppend(env)
                        .set(
                                env.getRequestStaticPropertiesReference(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .classes
                                                        .Swift_CharacterStream_ArrayCharacterStream
                                                        .RequestStaticProperties
                                                        .class,
                                                "byteMap")
                                        .arrayGet(env, bytes.arrayGet(env, i.getObject())));
            }

            size = function_count.f.env(env).call(c.getObject()).value();
            need =
                    env.callMethod(
                            this.charReader,
                            "validateByteSequence",
                            Swift_CharacterStream_ArrayCharacterStream.class,
                            c.getObject(),
                            size);
            if (ZVal.toBool(ZVal.isGreaterThan(need, '>', 0))
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    false,
                                    "!==",
                                    bytes.setObject(
                                            env.callMethod(
                                                    os,
                                                    "read",
                                                    Swift_CharacterStream_ArrayCharacterStream
                                                            .class,
                                                    need))))) {
                for (i.setObject(0),
                                len = function_strlen.f.env(env).call(bytes.getObject()).value();
                        ZVal.isLessThan(i.getObject(), '<', len);
                        i.setObject(ZVal.increment(i.getObject()))) {
                    c.arrayAppend(env)
                            .set(
                                    env.getRequestStaticPropertiesReference(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .classes
                                                            .Swift_CharacterStream_ArrayCharacterStream
                                                            .RequestStaticProperties
                                                            .class,
                                                    "byteMap")
                                            .arrayGet(env, bytes.arrayGet(env, i.getObject())));
                }
            }

            new ReferenceClassProperty(this, "array", env).arrayAppend(env).set(c.getObject());
            this.array_size = ZVal.increment(this.array_size);
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
        Object array = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object end = null;
        ReferenceContainer arrays = new BasicReferenceContainer(null);
        Object chars = null;
        if (ZVal.equalityCheck(this.offset, this.array_size)) {
            return ZVal.assign(false);
        }

        arrays.setObject(ZVal.newArray());
        end = ZVal.add(length, this.offset);
        runtimeConverterBreakCount = 0;
        for (i.setObject(ZVal.assign(this.offset));
                ZVal.isLessThan(i.getObject(), '<', end);
                i.setObject(ZVal.increment(i.getObject()))) {
            if (!arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "array", env),
                    env,
                    i.getObject())) {
                break;
            }

            arrays.arrayAppend(env)
                    .set(
                            new ReferenceClassProperty(this, "array", env)
                                    .arrayGet(env, i.getObject()));
        }

        this.offset = ZAssignment.add("+=", this.offset, ZVal.subtract(i.getObject(), this.offset));
        chars = false;
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult1499 : ZVal.getIterable(arrays.getObject(), env, true)) {
            array = ZVal.assign(zpairResult1499.getValue());
            chars =
                    toStringR(chars, env)
                            + toStringR(
                                    NamespaceGlobal.implode
                                            .env(env)
                                            .call(
                                                    "",
                                                    function_array_map
                                                            .f
                                                            .env(env)
                                                            .call("chr", array)
                                                            .value())
                                            .value(),
                                    env);
        }

        return ZVal.assign(chars);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "length")
    public Object readBytes(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object length = assignParameter(args, 0, false);
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object end = null;
        ReferenceContainer arrays = new BasicReferenceContainer(null);
        if (ZVal.equalityCheck(this.offset, this.array_size)) {
            return ZVal.assign(false);
        }

        arrays.setObject(ZVal.newArray());
        end = ZVal.add(length, this.offset);
        runtimeConverterBreakCount = 0;
        for (i.setObject(ZVal.assign(this.offset));
                ZVal.isLessThan(i.getObject(), '<', end);
                i.setObject(ZVal.increment(i.getObject()))) {
            if (!arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "array", env),
                    env,
                    i.getObject())) {
                break;
            }

            arrays.arrayAppend(env)
                    .set(
                            new ReferenceClassProperty(this, "array", env)
                                    .arrayGet(env, i.getObject()));
        }

        this.offset = ZAssignment.add("+=", this.offset, ZVal.subtract(i.getObject(), this.offset));
        return ZVal.assign(
                function_array_merge
                        .f
                        .env(env)
                        .call(PackedVaradicArgs.unpack(new PackedVaradicArgs(arrays.getObject())))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "chars")
    public Object write(RuntimeEnv env, Object... args) {
        Object chars = assignParameter(args, 0, false);
        Object _pNew = null;
        Object need = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object fp = null;
        Object buf = null;
        Object has_datas = null;
        ReferenceContainer size = new BasicReferenceContainer(null);
        Object startLength = null;
        ReferenceContainer bytes = new BasicReferenceContainer(null);
        Object buf_len = null;
        ReferenceContainer buffer = new BasicReferenceContainer(null);
        ReferenceContainer buf_pos = new BasicReferenceContainer(null);
        if (!ZVal.isset(this.charReader)) {
            this.charReader =
                    env.callMethod(
                            this.charReaderFactory,
                            "getReaderFor",
                            Swift_CharacterStream_ArrayCharacterStream.class,
                            this.charset);
        }

        startLength =
                env.callMethod(
                        this.charReader,
                        "getInitialByteSize",
                        Swift_CharacterStream_ArrayCharacterStream.class);
        fp = function_fopen.f.env(env).call("php://memory", "w+b").value();
        function_fwrite.f.env(env).call(fp, chars);
        chars = null;
        NamespaceGlobal.fseek.env(env).call(fp, 0, 0);
        buffer.setObject(ZVal.arrayFromList(0));
        buf_pos.setObject(1);
        buf_len = 1;
        has_datas = true;
        do {
            bytes.setObject(ZVal.newArray());
            if (ZVal.isLessThan(ZVal.subtract(buf_len, buf_pos.getObject()), '<', startLength)) {
                buf =
                        function_array_splice
                                .f
                                .env(env)
                                .call(buffer.getObject(), buf_pos.getObject())
                                .value();
                _pNew = this.reloadBuffer(env, fp, 100);
                if (ZVal.isTrue(_pNew)) {
                    buffer.setObject(function_array_merge.f.env(env).call(buf, _pNew).value());
                    buf_len = function_count.f.env(env).call(buffer.getObject()).value();
                    buf_pos.setObject(0);

                } else {
                    has_datas = false;
                }
            }

            if (ZVal.isGreaterThan(ZVal.subtract(buf_len, buf_pos.getObject()), '>', 0)) {
                size.setObject(0);
                for (i.setObject(0);
                        ZVal.toBool(ZVal.isLessThan(i.getObject(), '<', startLength))
                                && ZVal.toBool(
                                        arrayActionR(
                                                ArrayAction.ISSET,
                                                buffer,
                                                env,
                                                buf_pos.getObject()));
                        i.setObject(ZVal.increment(i.getObject()))) {
                    size.setObject(ZVal.increment(size.getObject()));
                    bytes.arrayAppend(env).set(buffer.arrayGet(env, ZVal.postIncrement(buf_pos)));
                }

                need =
                        env.callMethod(
                                this.charReader,
                                "validateByteSequence",
                                Swift_CharacterStream_ArrayCharacterStream.class,
                                bytes.getObject(),
                                size.getObject());
                if (ZVal.isGreaterThan(need, '>', 0)) {
                    if (ZVal.isLessThan(ZVal.subtract(buf_len, buf_pos.getObject()), '<', need)) {
                        _pNew = this.reloadBuffer(env, fp, need);
                        if (ZVal.isTrue(_pNew)) {
                            buffer.setObject(
                                    function_array_merge
                                            .f
                                            .env(env)
                                            .call(buffer.getObject(), _pNew)
                                            .value());
                            buf_len = function_count.f.env(env).call(buffer.getObject()).value();
                        }
                    }

                    for (i.setObject(0);
                            ZVal.toBool(ZVal.isLessThan(i.getObject(), '<', need))
                                    && ZVal.toBool(
                                            arrayActionR(
                                                    ArrayAction.ISSET,
                                                    buffer,
                                                    env,
                                                    buf_pos.getObject()));
                            i.setObject(ZVal.increment(i.getObject()))) {
                        bytes.arrayAppend(env)
                                .set(buffer.arrayGet(env, ZVal.postIncrement(buf_pos)));
                    }
                }

                new ReferenceClassProperty(this, "array", env)
                        .arrayAppend(env)
                        .set(bytes.getObject());
                this.array_size = ZVal.increment(this.array_size);
            }

        } while (ZVal.isTrue(has_datas));

        function_fclose.f.env(env).call(fp);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "charOffset")
    public Object setPointer(RuntimeEnv env, Object... args) {
        Object charOffset = assignParameter(args, 0, false);
        if (ZVal.isGreaterThan(charOffset, '>', this.array_size)) {
            charOffset = ZVal.assign(this.array_size);

        } else if (ZVal.isLessThan(charOffset, '<', 0)) {
            charOffset = 0;
        }

        this.offset = charOffset;
        return null;
    }

    @ConvertedMethod
    public Object flushContents(RuntimeEnv env, Object... args) {
        this.offset = 0;
        this.array = ZVal.newArray();
        this.array_size = 0;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fp")
    @ConvertedParameter(index = 1, name = "len")
    private Object reloadBuffer(RuntimeEnv env, Object... args) {
        Object fp = assignParameter(args, 0, false);
        Object len = assignParameter(args, 1, false);
        ReferenceContainer buf = new BasicReferenceContainer(null);
        ReferenceContainer bytes = new BasicReferenceContainer(null);
        ReferenceContainer i = new BasicReferenceContainer(null);
        if (ZVal.toBool(!NamespaceGlobal.feof.env(env).call(fp).getBool())
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                false,
                                "!==",
                                bytes.setObject(
                                        function_fread.f.env(env).call(fp, len).value())))) {
            buf.setObject(ZVal.newArray());
            for (i.setObject(0), len = function_strlen.f.env(env).call(bytes.getObject()).value();
                    ZVal.isLessThan(i.getObject(), '<', len);
                    i.setObject(ZVal.increment(i.getObject()))) {
                buf.arrayAppend(env)
                        .set(
                                env.getRequestStaticPropertiesReference(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .classes
                                                        .Swift_CharacterStream_ArrayCharacterStream
                                                        .RequestStaticProperties
                                                        .class,
                                                "byteMap")
                                        .arrayGet(env, bytes.arrayGet(env, i.getObject())));
            }

            return ZVal.assign(buf.getObject());
        }

        return ZVal.assign(false);
    }

    public static final Object CONST_class = "Swift_CharacterStream_ArrayCharacterStream";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        private Object initializeMaps(RuntimeEnv env, Object... args) {
            ReferenceContainer _pByte = new BasicReferenceContainer(null);
            if (!ZVal.isset(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .classes
                                            .Swift_CharacterStream_ArrayCharacterStream
                                            .RequestStaticProperties
                                            .class)
                            .charMap)) {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .classes
                                                .Swift_CharacterStream_ArrayCharacterStream
                                                .RequestStaticProperties
                                                .class)
                                .charMap =
                        ZVal.newArray();
                for (_pByte.setObject(0);
                        ZVal.isLessThan(_pByte.getObject(), '<', 256);
                        _pByte.setObject(ZVal.increment(_pByte.getObject()))) {
                    env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .classes
                                            .Swift_CharacterStream_ArrayCharacterStream
                                            .RequestStaticProperties
                                            .class,
                                    "charMap")
                            .arrayAccess(env, _pByte.getObject())
                            .set(NamespaceGlobal.chr.env(env).call(_pByte.getObject()).value());
                }

                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .classes
                                                .Swift_CharacterStream_ArrayCharacterStream
                                                .RequestStaticProperties
                                                .class)
                                .byteMap =
                        function_array_flip
                                .f
                                .env(env)
                                .call(
                                        env.getRequestStaticProperties(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .classes
                                                                .Swift_CharacterStream_ArrayCharacterStream
                                                                .RequestStaticProperties
                                                                .class)
                                                .charMap)
                                .value();
            }

            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object charMap = null;

        public Object byteMap = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_CharacterStream_ArrayCharacterStream")
                    .setLookup(
                            Swift_CharacterStream_ArrayCharacterStream.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "array",
                            "array_size",
                            "charReader",
                            "charReaderFactory",
                            "charset",
                            "offset")
                    .setStaticPropertyNames("byteMap", "charMap")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/CharacterStream/ArrayCharacterStream.php")
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
}
