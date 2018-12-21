package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.classes.Swift_Filterable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.classes.Swift_InputByteStream;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/ByteStream/AbstractFilterableInputStream.php

*/

public abstract class Swift_ByteStream_AbstractFilterableInputStream extends RuntimeClassBase
        implements Swift_InputByteStream, Swift_Filterable {

    public Object sequence = 0;

    public Object filters = ZVal.newArray();

    public Object writeBuffer = "";

    public Object mirrors = ZVal.newArray();

    public Swift_ByteStream_AbstractFilterableInputStream(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Swift_ByteStream_AbstractFilterableInputStream(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filter", typeHint = "Swift_StreamFilter")
    @ConvertedParameter(index = 1, name = "key")
    public Object addFilter(RuntimeEnv env, Object... args) {
        Object filter = assignParameter(args, 0, false);
        Object key = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "filters", env).arrayAccess(env, key).set(filter);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object removeFilter(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        arrayActionR(ArrayAction.UNSET, new ReferenceClassProperty(this, "filters", env), env, key);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bytes")
    public Object write(RuntimeEnv env, Object... args) {
        Object bytes = assignParameter(args, 0, false);
        Object filter = null;
        this.writeBuffer = toStringR(this.writeBuffer, env) + toStringR(bytes, env);
        for (ZPair zpairResult1489 : ZVal.getIterable(this.filters, env, true)) {
            filter = ZVal.assign(zpairResult1489.getValue());
            if (ZVal.isTrue(
                    env.callMethod(
                            filter,
                            "shouldBuffer",
                            Swift_ByteStream_AbstractFilterableInputStream.class,
                            this.writeBuffer))) {
                return null;
            }
        }

        this.doWrite(env, this.writeBuffer);
        return ZVal.assign(this.sequence = ZVal.increment(this.sequence));
    }

    @ConvertedMethod
    public Object commit(RuntimeEnv env, Object... args) {
        this.doWrite(env, this.writeBuffer);
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
        for (ZPair zpairResult1490 : ZVal.getIterable(this.mirrors, env, false)) {
            k = ZVal.assign(zpairResult1490.getKey());
            stream = ZVal.assign(zpairResult1490.getValue());
            if (ZVal.strictEqualityCheck(is, "===", stream)) {
                if (ZVal.strictNotEqualityCheck("", "!==", this.writeBuffer)) {
                    env.callMethod(
                            stream,
                            "write",
                            Swift_ByteStream_AbstractFilterableInputStream.class,
                            this.writeBuffer);
                }

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
    public Object flushBuffers(RuntimeEnv env, Object... args) {
        Object stream = null;
        if (ZVal.strictNotEqualityCheck("", "!==", this.writeBuffer)) {
            this.doWrite(env, this.writeBuffer);
        }

        env.callMethod(this, "flush", Swift_ByteStream_AbstractFilterableInputStream.class);
        for (ZPair zpairResult1491 : ZVal.getIterable(this.mirrors, env, true)) {
            stream = ZVal.assign(zpairResult1491.getValue());
            env.callMethod(
                    stream, "flushBuffers", Swift_ByteStream_AbstractFilterableInputStream.class);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bytes")
    private Object filter(RuntimeEnv env, Object... args) {
        Object bytes = assignParameter(args, 0, false);
        Object filter = null;
        for (ZPair zpairResult1492 : ZVal.getIterable(this.filters, env, true)) {
            filter = ZVal.assign(zpairResult1492.getValue());
            bytes =
                    env.callMethod(
                            filter,
                            "filter",
                            Swift_ByteStream_AbstractFilterableInputStream.class,
                            bytes);
        }

        return ZVal.assign(bytes);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bytes")
    private Object doWrite(RuntimeEnv env, Object... args) {
        Object bytes = assignParameter(args, 0, false);
        Object stream = null;
        env.callMethod(
                this,
                "doCommit",
                Swift_ByteStream_AbstractFilterableInputStream.class,
                this.filter(env, bytes));
        for (ZPair zpairResult1493 : ZVal.getIterable(this.mirrors, env, true)) {
            stream = ZVal.assign(zpairResult1493.getValue());
            env.callMethod(
                    stream, "write", Swift_ByteStream_AbstractFilterableInputStream.class, bytes);
        }

        this.writeBuffer = "";
        return null;
    }

    public static final Object CONST_class = "Swift_ByteStream_AbstractFilterableInputStream";

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
                    .setName("Swift_ByteStream_AbstractFilterableInputStream")
                    .setLookup(
                            Swift_ByteStream_AbstractFilterableInputStream.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("filters", "mirrors", "sequence", "writeBuffer")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/ByteStream/AbstractFilterableInputStream.php")
                    .addInterface("Swift_InputByteStream")
                    .addInterface("Swift_Filterable")
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
