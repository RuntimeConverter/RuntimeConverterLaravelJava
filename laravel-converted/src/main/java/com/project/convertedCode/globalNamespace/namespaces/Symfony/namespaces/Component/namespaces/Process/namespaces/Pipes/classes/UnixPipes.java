package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.namespaces.Pipes.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.classes.Process;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_error_handler;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fread;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.namespaces.Pipes.classes.AbstractPipes;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_search;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_error_handler;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/process/Pipes/UnixPipes.php

*/

public class UnixPipes extends AbstractPipes {

    public Object ttyMode = null;

    public Object ptyMode = null;

    public Object haveReadSupport = null;

    public UnixPipes(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == UnixPipes.class) {
            this.__construct(env, args);
        }
    }

    public UnixPipes(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ttyMode")
    @ConvertedParameter(index = 1, name = "ptyMode", typeHint = "bool")
    @ConvertedParameter(index = 2, name = "input")
    @ConvertedParameter(index = 3, name = "haveReadSupport", typeHint = "bool")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object ttyMode = assignParameter(args, 0, false);
        Object ptyMode = assignParameter(args, 1, false);
        Object input = assignParameter(args, 2, false);
        Object haveReadSupport = assignParameter(args, 3, false);
        this.ttyMode = ttyMode;
        this.ptyMode = ptyMode;
        this.haveReadSupport = haveReadSupport;
        super.__construct(env, input);
        return null;
    }

    @ConvertedMethod
    public Object __destruct(RuntimeEnv env, Object... args) {
        env.callMethod(this, "close", UnixPipes.class);
        return null;
    }

    @ConvertedMethod
    public Object getDescriptors(RuntimeEnv env, Object... args) {
        Object nullstream = null;
        if (!ZVal.isTrue(this.haveReadSupport)) {
            nullstream = function_fopen.f.env(env).call("/dev/null", "c").value();
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(0, ZVal.arrayFromList("pipe", "r")),
                            new ZPair(1, nullstream),
                            new ZPair(2, nullstream)));
        }

        if (ZVal.isTrue(this.ttyMode)) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(0, ZVal.arrayFromList("file", "/dev/tty", "r")),
                            new ZPair(1, ZVal.arrayFromList("file", "/dev/tty", "w")),
                            new ZPair(2, ZVal.arrayFromList("file", "/dev/tty", "w"))));
        }

        if (ZVal.toBool(this.ptyMode)
                && ZVal.toBool(Process.runtimeStaticObject.isPtySupported(env))) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(0, ZVal.arrayFromList("pty")),
                            new ZPair(1, ZVal.arrayFromList("pty")),
                            new ZPair(2, ZVal.arrayFromList("pty"))));
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(0, ZVal.arrayFromList("pipe", "r")),
                        new ZPair(1, ZVal.arrayFromList("pipe", "w")),
                        new ZPair(2, ZVal.arrayFromList("pipe", "w"))));
    }

    @ConvertedMethod
    public Object getFiles(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "blocking")
    @ConvertedParameter(
        index = 1,
        name = "close",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object readAndWrite(RuntimeEnv env, Object... args) {
        Object blocking = assignParameter(args, 0, false);
        Object close = assignParameter(args, 1, true);
        if (null == close) {
            close = false;
        }
        ReferenceContainer r = new BasicReferenceContainer(null);
        ReferenceContainer read = new BasicReferenceContainer(null);
        ReferenceContainer data = new BasicReferenceContainer(null);
        ReferenceContainer e = new BasicReferenceContainer(null);
        ReferenceContainer w = new BasicReferenceContainer(null);
        Object pipe = null;
        Object type = null;
        env.callMethod(this, "unblock", UnixPipes.class);
        w.setObject(env.callMethod(this, "write", UnixPipes.class));
        read.setObject(ZVal.assign(e.setObject(ZVal.newArray())));
        r.setObject(ZVal.assign(toObjectR(this).accessProp(this, env).name("pipes").value()));
        arrayActionR(ArrayAction.UNSET, r, env, 0);
        function_set_error_handler
                .f
                .env(env)
                .call(ZVal.newArray(new ZPair(0, this), new ZPair(1, "handleError")));
        if (ZVal.toBool(ZVal.toBool(r.getObject()) || ZVal.toBool(w.getObject()))
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                false,
                                "===",
                                NamespaceGlobal.stream_select
                                        .env(env)
                                        .addReferenceArgs(
                                                new RuntimeArgsWithReferences()
                                                        .add(0, r)
                                                        .add(1, w)
                                                        .add(2, e))
                                        .call(
                                                r.getObject(),
                                                w.getObject(),
                                                e.getObject(),
                                                0,
                                                ZVal.isTrue(blocking)
                                                        ? ZVal.multiply(
                                                                Process.CONST_TIMEOUT_PRECISION,
                                                                1000000.0)
                                                        : 0)
                                        .value()))) {
            function_restore_error_handler.f.env(env).call();
            if (!ZVal.isTrue(
                    env.callMethod(this, "hasSystemCallBeenInterrupted", UnixPipes.class))) {
                toObjectR(this).accessProp(this, env).name("pipes").set(ZVal.newArray());
            }

            return ZVal.assign(read.getObject());
        }

        function_restore_error_handler.f.env(env).call();
        for (ZPair zpairResult1998 : ZVal.getIterable(r.getObject(), env, true)) {
            pipe = ZVal.assign(zpairResult1998.getValue());
            read.arrayAccess(
                            env,
                            type =
                                    function_array_search
                                            .f
                                            .env(env)
                                            .call(
                                                    pipe,
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("pipes")
                                                            .value(),
                                                    true)
                                            .value())
                    .set("");
            do {
                data.setObject(function_fread.f.env(env).call(pipe, CONST_CHUNK_SIZE).value());
                read.arrayAccess(env, type)
                        .set(
                                toStringR(read.arrayGet(env, type), env)
                                        + toStringR(data.getObject(), env));

            } while (ZVal.toBool(arrayActionR(ArrayAction.ISSET, data, env, 0))
                    && ZVal.toBool(
                            ZVal.toBool(close)
                                    || ZVal.toBool(
                                            arrayActionR(
                                                    ArrayAction.ISSET,
                                                    data,
                                                    env,
                                                    ZVal.subtract(CONST_CHUNK_SIZE, 1)))));

            if (!arrayActionR(ArrayAction.ISSET, read, env, type, 0)) {
                arrayActionR(ArrayAction.UNSET, read, env, type);
            }

            if (ZVal.toBool(close)
                    && ZVal.toBool(NamespaceGlobal.feof.env(env).call(pipe).value())) {
                function_fclose.f.env(env).call(pipe);
                arrayActionR(
                        ArrayAction.UNSET,
                        new ReferenceClassProperty(this, "pipes", env),
                        env,
                        type);
            }
        }

        return ZVal.assign(read.getObject());
    }

    @ConvertedMethod
    public Object haveReadSupport(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.haveReadSupport);
    }

    @ConvertedMethod
    public Object areOpen(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(toObjectR(this).accessProp(this, env).name("pipes").value()));
    }

    public static final Object CONST_class = "Symfony\\Component\\Process\\Pipes\\UnixPipes";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractPipes.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Process\\Pipes\\UnixPipes")
                    .setLookup(
                            UnixPipes.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "blocked",
                            "haveReadSupport",
                            "input",
                            "inputBuffer",
                            "lastError",
                            "pipes",
                            "ptyMode",
                            "ttyMode")
                    .setFilename("vendor/symfony/process/Pipes/UnixPipes.php")
                    .addInterface("Symfony\\Component\\Process\\Pipes\\PipesInterface")
                    .addExtendsClass("Symfony\\Component\\Process\\Pipes\\AbstractPipes")
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
