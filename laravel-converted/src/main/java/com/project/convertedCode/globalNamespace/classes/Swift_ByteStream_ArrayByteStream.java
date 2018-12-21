package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.classes.Swift_InputByteStream;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.classes.Swift_OutputByteStream;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/ByteStream/ArrayByteStream.php

*/

public class Swift_ByteStream_ArrayByteStream extends RuntimeClassBase
        implements Swift_InputByteStream, Swift_OutputByteStream {

    public Object array = ZVal.newArray();

    public Object arraySize = 0;

    public Object offset = 0;

    public Object mirrors = ZVal.newArray();

    public Swift_ByteStream_ArrayByteStream(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_ByteStream_ArrayByteStream.class) {
            this.__construct(env, args);
        }
    }

    public Swift_ByteStream_ArrayByteStream(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "stack",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object stack = assignParameter(args, 0, true);
        if (null == stack) {
            stack = ZVal.getNull();
        }
        if (function_is_array.f.env(env).call(stack).getBool()) {
            this.array = stack;
            this.arraySize = function_count.f.env(env).call(stack).value();

        } else if (function_is_string.f.env(env).call(stack).getBool()) {
            this.write(env, stack);

        } else {
            this.array = ZVal.newArray();
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "length")
    public Object read(RuntimeEnv env, Object... args) {
        Object length = assignParameter(args, 0, false);
        Object ret = null;
        Object end = null;
        if (ZVal.equalityCheck(this.offset, this.arraySize)) {
            return ZVal.assign(false);
        }

        end = ZVal.add(length, this.offset);
        end = ZVal.assign(ZVal.isLessThan(this.arraySize, '<', end) ? this.arraySize : end);
        ret = "";
        for (; ZVal.isLessThan(this.offset, '<', end); this.offset = ZVal.increment(this.offset)) {
            ret =
                    toStringR(ret, env)
                            + toStringR(
                                    new ReferenceClassProperty(this, "array", env)
                                            .arrayGet(env, this.offset),
                                    env);
        }

        return ZVal.assign(ret);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bytes")
    public Object write(RuntimeEnv env, Object... args) {
        Object bytes = assignParameter(args, 0, false);
        Object stream = null;
        Object to_add = null;
        Object value = null;
        to_add = NamespaceGlobal.str_split.env(env).call(bytes).value();
        for (ZPair zpairResult1494 : ZVal.getIterable(to_add, env, true)) {
            value = ZVal.assign(zpairResult1494.getValue());
            new ReferenceClassProperty(this, "array", env).arrayAppend(env).set(value);
        }

        this.arraySize = function_count.f.env(env).call(this.array).value();
        for (ZPair zpairResult1495 : ZVal.getIterable(this.mirrors, env, true)) {
            stream = ZVal.assign(zpairResult1495.getValue());
            env.callMethod(stream, "write", Swift_ByteStream_ArrayByteStream.class, bytes);
        }

        return null;
    }

    @ConvertedMethod
    public Object commit(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "is", typeHint = "Swift_InputByteStream")
    public Object bind(RuntimeEnv env, Object... args) {
        Object is = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "mirrors", env).arrayAppend(env).set(is);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "is", typeHint = "Swift_InputByteStream")
    public Object unbind(RuntimeEnv env, Object... args) {
        Object is = assignParameter(args, 0, false);
        Object stream = null;
        Object k = null;
        for (ZPair zpairResult1496 : ZVal.getIterable(this.mirrors, env, false)) {
            k = ZVal.assign(zpairResult1496.getKey());
            stream = ZVal.assign(zpairResult1496.getValue());
            if (ZVal.strictEqualityCheck(is, "===", stream)) {
                arrayActionR(
                        ArrayAction.UNSET,
                        new ReferenceClassProperty(this, "mirrors", env),
                        env,
                        k);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "byteOffset")
    public Object setReadPointer(RuntimeEnv env, Object... args) {
        Object byteOffset = assignParameter(args, 0, false);
        if (ZVal.isGreaterThan(byteOffset, '>', this.arraySize)) {
            byteOffset = ZVal.assign(this.arraySize);

        } else if (ZVal.isLessThan(byteOffset, '<', 0)) {
            byteOffset = 0;
        }

        this.offset = byteOffset;
        return null;
    }

    @ConvertedMethod
    public Object flushBuffers(RuntimeEnv env, Object... args) {
        Object stream = null;
        this.offset = 0;
        this.array = ZVal.newArray();
        this.arraySize = 0;
        for (ZPair zpairResult1497 : ZVal.getIterable(this.mirrors, env, true)) {
            stream = ZVal.assign(zpairResult1497.getValue());
            env.callMethod(stream, "flushBuffers", Swift_ByteStream_ArrayByteStream.class);
        }

        return null;
    }

    public static final Object CONST_class = "Swift_ByteStream_ArrayByteStream";

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
                    .setName("Swift_ByteStream_ArrayByteStream")
                    .setLookup(
                            Swift_ByteStream_ArrayByteStream.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("array", "arraySize", "mirrors", "offset")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/ByteStream/ArrayByteStream.php")
                    .addInterface("Swift_InputByteStream")
                    .addInterface("Swift_OutputByteStream")
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
