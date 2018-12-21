package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.namespaces.Pipes.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.classes.Process;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_error_handler;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.namespaces.Pipes.classes.AbstractPipes;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.namespaces.Exception.classes.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_error_handler;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/process/Pipes/WindowsPipes.php

*/

public class WindowsPipes extends AbstractPipes {

    public Object files = ZVal.newArray();

    public Object fileHandles = ZVal.newArray();

    public Object readBytes =
            ZVal.newArray(new ZPair(Process.CONST_STDOUT, 0), new ZPair(Process.CONST_STDERR, 0));

    public Object haveReadSupport = null;

    public WindowsPipes(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == WindowsPipes.class) {
            this.__construct(env, args);
        }
    }

    public WindowsPipes(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "input")
    @ConvertedParameter(index = 1, name = "haveReadSupport", typeHint = "bool")
    public Object __construct(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/process/Pipes")
                        .setFile("/vendor/symfony/process/Pipes/WindowsPipes.php");
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        Object input = assignParameter(args, 0, false);
        Object haveReadSupport = assignParameter(args, 1, false);
        ReferenceContainer lastError = new BasicReferenceContainer(null);
        Object h = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object error = null;
        Object tmpDir = null;
        Object file = null;
        Object name = null;
        Object pipe = null;
        Object pipes = null;
        Object tmpCheck = null;
        this.haveReadSupport = haveReadSupport;
        if (ZVal.isTrue(this.haveReadSupport)) {
            pipes =
                    ZVal.newArray(
                            new ZPair(Process.CONST_STDOUT, Process.CONST_OUT),
                            new ZPair(Process.CONST_STDERR, Process.CONST_ERR));
            tmpCheck = false;
            tmpDir = NamespaceGlobal.sys_get_temp_dir.env(env).call().value();
            lastError.setObject("unknown reason");
            function_set_error_handler
                    .f
                    .env(env)
                    .call(
                            new Closure(
                                    env,
                                    runtimeConverterFunctionClassConstants,
                                    "Symfony\\Component\\Process\\Pipes",
                                    this) {
                                @Override
                                @ConvertedMethod
                                @ConvertedParameter(index = 0, name = "type")
                                @ConvertedParameter(index = 1, name = "msg")
                                public Object run(
                                        RuntimeEnv env,
                                        Object thisvar,
                                        PassByReferenceArgs runtimePassByReferenceArgs,
                                        Object... args) {
                                    Object type = assignParameter(args, 0, false);
                                    Object msg = assignParameter(args, 1, false);
                                    ReferenceContainer lastError =
                                            new BasicReferenceContainer(null);
                                    lastError =
                                            this.contextReferences.getReferenceContainer(
                                                    "lastError");
                                    lastError.setObject(ZVal.assign(msg));
                                    return null;
                                }
                            }.useRef("lastError", lastError));
            runtimeConverterBreakCount = 0;
            runtimeConverterContinueCount = 0;
            for (i.setObject(0); ZVal.isTrue(true); i.setObject(ZVal.increment(i.getObject()))) {
                runtimeConverterBreakCount = 0;
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1999 : ZVal.getIterable(pipes, env, false)) {
                    pipe = ZVal.assign(zpairResult1999.getKey());
                    name = ZVal.assign(zpairResult1999.getValue());
                    file =
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("%s\\sf_proc_%02X.%s", tmpDir, i.getObject(), name)
                                    .value();
                    if (ZVal.toBool(function_file_exists.f.env(env).call(file).value())
                            && ZVal.toBool(!NamespaceGlobal.unlink.env(env).call(file).getBool())) {
                        runtimeConverterContinueCount = 2;
                        runtimeConverterContinueCount--;
                        continue;
                    }

                    h = function_fopen.f.env(env).call(file, "xb").value();
                    if (!ZVal.isTrue(h)) {
                        error = ZVal.assign(lastError.getObject());
                        if (ZVal.toBool(tmpCheck)
                                || ZVal.toBool(
                                        tmpCheck =
                                                NamespaceGlobal.unlink
                                                        .env(env)
                                                        .call(
                                                                NamespaceGlobal.tempnam
                                                                        .env(env)
                                                                        .call(false, "sf_check_")
                                                                        .value())
                                                        .value())) {
                            continue;
                        }

                        function_restore_error_handler.f.env(env).call();
                        throw ZVal.getException(
                                env,
                                new RuntimeException(
                                        env,
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "A temporary file could not be opened to write the process output: %s",
                                                        error)
                                                .value()));
                    }

                    if (ZVal.toBool(!ZVal.isTrue(h))
                            || ZVal.toBool(
                                    !ZVal.isTrue(
                                            new ReferenceClassProperty(this, "fileHandles", env)
                                                    .arrayAccess(env, pipe)
                                                    .set(
                                                            function_fopen
                                                                    .f
                                                                    .env(env)
                                                                    .call(file, "rb")
                                                                    .value())))) {
                        runtimeConverterContinueCount = 2;
                        runtimeConverterContinueCount--;
                        continue;
                    }

                    if (arrayActionR(
                            ArrayAction.ISSET,
                            new ReferenceClassProperty(this, "files", env),
                            env,
                            pipe)) {
                        NamespaceGlobal.unlink
                                .env(env)
                                .call(
                                        new ReferenceClassProperty(this, "files", env)
                                                .arrayGet(env, pipe));
                    }

                    new ReferenceClassProperty(this, "files", env).arrayAccess(env, pipe).set(file);
                }

                break;
            }

            function_restore_error_handler.f.env(env).call();
        }

        super.__construct(env, input);
        return null;
    }

    @ConvertedMethod
    public Object __destruct(RuntimeEnv env, Object... args) {
        this.close(env);
        this.removeFiles(env);
        return null;
    }

    @ConvertedMethod
    public Object getDescriptors(RuntimeEnv env, Object... args) {
        Object nullstream = null;
        if (!ZVal.isTrue(this.haveReadSupport)) {
            nullstream = function_fopen.f.env(env).call("NUL", "c").value();
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(0, ZVal.arrayFromList("pipe", "r")),
                            new ZPair(1, nullstream),
                            new ZPair(2, nullstream)));
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(0, ZVal.arrayFromList("pipe", "r")),
                        new ZPair(1, ZVal.arrayFromList("file", "NUL", "w")),
                        new ZPair(2, ZVal.arrayFromList("file", "NUL", "w"))));
    }

    @ConvertedMethod
    public Object getFiles(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.files);
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
        Object fileHandle = null;
        ReferenceContainer e = new BasicReferenceContainer(null);
        ReferenceContainer w = new BasicReferenceContainer(null);
        Object type = null;
        env.callMethod(this, "unblock", WindowsPipes.class);
        w.setObject(env.callMethod(this, "write", WindowsPipes.class));
        read.setObject(ZVal.assign(r.setObject(ZVal.assign(e.setObject(ZVal.newArray())))));
        if (ZVal.isTrue(blocking)) {
            if (ZVal.isTrue(w.getObject())) {
                NamespaceGlobal.stream_select
                        .env(env)
                        .addReferenceArgs(
                                new RuntimeArgsWithReferences().add(0, r).add(1, w).add(2, e))
                        .call(
                                r.getObject(),
                                w.getObject(),
                                e.getObject(),
                                0,
                                ZVal.multiply(Process.CONST_TIMEOUT_PRECISION, 1000000.0))
                        .value();

            } else if (ZVal.isTrue(this.fileHandles)) {
                NamespaceGlobal.usleep
                        .env(env)
                        .call(ZVal.multiply(Process.CONST_TIMEOUT_PRECISION, 1000000.0));
            }
        }

        for (ZPair zpairResult2000 : ZVal.getIterable(this.fileHandles, env, false)) {
            type = ZVal.assign(zpairResult2000.getKey());
            fileHandle = ZVal.assign(zpairResult2000.getValue());
            data.setObject(
                    NamespaceGlobal.stream_get_contents
                            .env(env)
                            .call(
                                    fileHandle,
                                    -1,
                                    new ReferenceClassProperty(this, "readBytes", env)
                                            .arrayGet(env, type))
                            .value());
            if (arrayActionR(ArrayAction.ISSET, data, env, 0)) {
                new ReferenceClassProperty(this, "readBytes", env)
                        .arrayAccess(env, type)
                        .set(
                                ZAssignment.add(
                                        "+=",
                                        new ReferenceClassProperty(this, "readBytes", env)
                                                .arrayGet(env, type),
                                        function_strlen.f.env(env).call(data.getObject()).value()));
                read.arrayAccess(env, type).set(data.getObject());
            }

            if (ZVal.isTrue(close)) {
                function_fclose.f.env(env).call(fileHandle);
                arrayActionR(
                        ArrayAction.UNSET,
                        new ReferenceClassProperty(this, "fileHandles", env),
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
                ZVal.toBool(toObjectR(this).accessProp(this, env).name("pipes").value())
                        && ZVal.toBool(this.fileHandles));
    }

    @ConvertedMethod
    public Object close(RuntimeEnv env, Object... args) {
        Object handle = null;
        super.close(env);
        for (ZPair zpairResult2001 : ZVal.getIterable(this.fileHandles, env, true)) {
            handle = ZVal.assign(zpairResult2001.getValue());
            function_fclose.f.env(env).call(handle);
        }

        this.fileHandles = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    private Object removeFiles(RuntimeEnv env, Object... args) {
        Object filename = null;
        for (ZPair zpairResult2002 : ZVal.getIterable(this.files, env, true)) {
            filename = ZVal.assign(zpairResult2002.getValue());
            if (function_file_exists.f.env(env).call(filename).getBool()) {
                NamespaceGlobal.unlink.env(env).call(filename).value();
            }
        }

        this.files = ZVal.newArray();
        return null;
    }

    public static final Object CONST_class = "Symfony\\Component\\Process\\Pipes\\WindowsPipes";

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
                    .setName("Symfony\\Component\\Process\\Pipes\\WindowsPipes")
                    .setLookup(
                            WindowsPipes.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "blocked",
                            "fileHandles",
                            "files",
                            "haveReadSupport",
                            "input",
                            "inputBuffer",
                            "lastError",
                            "pipes",
                            "readBytes")
                    .setFilename("vendor/symfony/process/Pipes/WindowsPipes.php")
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
