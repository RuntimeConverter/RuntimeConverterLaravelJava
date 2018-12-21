package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.PHP.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fread;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.PHP.classes.AbstractPhpProcess;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fwrite;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/PHP/DefaultPhpProcess.php

*/

public class DefaultPhpProcess extends AbstractPhpProcess {

    public Object tempFile = null;

    public DefaultPhpProcess(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DefaultPhpProcess.class) {
            this.__construct(env, args);
        }
    }

    public DefaultPhpProcess(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "settings",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object runJob(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        Object settings = assignParameter(args, 1, true);
        if (null == settings) {
            settings = ZVal.newArray();
        }
        if (ZVal.toBool(this.useTemporaryFile(env))
                || ZVal.toBool(toObjectR(this).accessProp(this, env).name("stdin").value())) {
            if (ZVal.toBool(
                            !ZVal.isTrue(
                                    this.tempFile =
                                            NamespaceGlobal.tempnam
                                                    .env(env)
                                                    .call(
                                                            NamespaceGlobal.sys_get_temp_dir
                                                                    .env(env)
                                                                    .call()
                                                                    .value(),
                                                            "PHPUnit")
                                                    .value()))
                    || ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    NamespaceGlobal.file_put_contents
                                            .env(env)
                                            .call(this.tempFile, job)
                                            .value(),
                                    "===",
                                    false))) {
                throw ZVal.getException(env, new Exception(env, "Unable to write temporary file"));
            }

            job = ZVal.assign(toObjectR(this).accessProp(this, env).name("stdin").value());
        }

        return ZVal.assign(this.runProcess(env, job, settings));
    }

    @ConvertedMethod
    protected Object getHandles(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job", typeHint = "string")
    @ConvertedParameter(index = 1, name = "settings", typeHint = "array")
    protected Object runProcess(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object job = assignParameter(args, 0, false);
        Object settings = assignParameter(args, 1, false);
        ReferenceContainer handles = new BasicReferenceContainer(null);
        Object process = null;
        Object envVar = null;
        Object stdout = null;
        ReferenceContainer e = new BasicReferenceContainer(null);
        Object line = null;
        ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
        Object origPipe = null;
        Object pipeOffset = null;
        Object i = null;
        Object ternaryExpressionTemp = null;
        ReferenceContainer ___env = new BasicReferenceContainer(null);
        Object envKey = null;
        Object stderr = null;
        Object pipeSpec = null;
        Object n = null;
        ReferenceContainer r = new BasicReferenceContainer(null);
        ReferenceContainer w = new BasicReferenceContainer(null);
        Object pipe = null;
        ReferenceContainer pipes = new BasicReferenceContainer(null);
        handles.setObject(this.getHandles(env));
        ___env.setObject(ZVal.getNull());
        if (toObjectR(this).accessProp(this, env).name("env").getBool()) {
            ___env.setObject(
                    ZVal.assign(
                            ZVal.isDefined(ternaryExpressionTemp = _SERVER.getObject())
                                    ? ternaryExpressionTemp
                                    : ZVal.newArray()));
            arrayActionR(ArrayAction.UNSET, ___env, env, "argv");
            arrayActionR(ArrayAction.UNSET, ___env, env, "argc");
            ___env.setObject(
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    ___env.getObject(),
                                    toObjectR(this).accessProp(this, env).name("env").value())
                            .value());
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult1297 : ZVal.getIterable(___env.getObject(), env, false)) {
                envKey = ZVal.assign(zpairResult1297.getKey());
                envVar = ZVal.assign(zpairResult1297.getValue());
                if (function_is_array.f.env(env).call(envVar).getBool()) {
                    arrayActionR(ArrayAction.UNSET, ___env, env, envKey);
                }
            }
        }

        pipeSpec =
                ZVal.newArray(
                        new ZPair(
                                0,
                                ZVal.isDefined(ternaryExpressionTemp = handles.arrayGet(env, 0))
                                        ? ternaryExpressionTemp
                                        : ZVal.arrayFromList("pipe", "r")),
                        new ZPair(
                                1,
                                ZVal.isDefined(ternaryExpressionTemp = handles.arrayGet(env, 1))
                                        ? ternaryExpressionTemp
                                        : ZVal.arrayFromList("pipe", "w")),
                        new ZPair(
                                2,
                                ZVal.isDefined(ternaryExpressionTemp = handles.arrayGet(env, 2))
                                        ? ternaryExpressionTemp
                                        : ZVal.arrayFromList("pipe", "w")));
        process =
                NamespaceGlobal.proc_open
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(2, pipes))
                        .call(
                                env.callMethod(
                                        this,
                                        "getCommand",
                                        DefaultPhpProcess.class,
                                        settings,
                                        this.tempFile),
                                pipeSpec,
                                pipes.getObject(),
                                ZVal.getNull(),
                                ___env.getObject())
                        .value();
        if (!function_is_resource.f.env(env).call(process).getBool()) {
            throw ZVal.getException(env, new Exception(env, "Unable to spawn worker process"));
        }

        if (ZVal.isTrue(job)) {
            this.process(env, pipes.arrayGet(env, 0), job);
        }

        function_fclose.f.env(env).call(pipes.arrayGet(env, 0));
        stderr = ZVal.assign(stdout = "");
        if (toObjectR(this).accessProp(this, env).name("timeout").getBool()) {
            arrayActionR(ArrayAction.UNSET, pipes, env, 0);
            runtimeConverterBreakCount = 0;
            while (ZVal.isTrue(true)) {
                r.setObject(ZVal.assign(pipes.getObject()));
                w.setObject(ZVal.getNull());
                e.setObject(ZVal.getNull());
                n =
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
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("timeout")
                                                .value())
                                .value();
                if (ZVal.strictEqualityCheck(n, "===", false)) {
                    break;
                }

                if (ZVal.strictEqualityCheck(n, "===", 0)) {
                    NamespaceGlobal.proc_terminate.env(env).call(process, 9);
                    throw ZVal.getException(
                            env,
                            new Exception(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "Job execution aborted after %d seconds",
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("timeout")
                                                            .value())
                                            .value()));
                }

                if (ZVal.isGreaterThan(n, '>', 0)) {
                    runtimeConverterBreakCount = 0;
                    for (ZPair zpairResult1298 : ZVal.getIterable(r.getObject(), env, true)) {
                        pipe = ZVal.assign(zpairResult1298.getValue());
                        pipeOffset = 0;
                        runtimeConverterBreakCount = 0;
                        for (ZPair zpairResult1299 :
                                ZVal.getIterable(pipes.getObject(), env, false)) {
                            i = ZVal.assign(zpairResult1299.getKey());
                            origPipe = ZVal.assign(zpairResult1299.getValue());
                            if (ZVal.strictEqualityCheck(pipe, "===", origPipe)) {
                                pipeOffset = ZVal.assign(i);
                                break;
                            }
                        }

                        if (!ZVal.isTrue(pipeOffset)) {
                            break;
                        }

                        line = function_fread.f.env(env).call(pipe, 8192).value();
                        if (ZVal.strictEqualityCheck(line, "===", "")) {
                            function_fclose.f.env(env).call(pipes.arrayGet(env, pipeOffset));
                            arrayActionR(ArrayAction.UNSET, pipes, env, pipeOffset);

                        } else {
                            if (ZVal.strictEqualityCheck(pipeOffset, "===", 1)) {
                                stdout = toStringR(stdout, env) + toStringR(line, env);

                            } else {
                                stderr = toStringR(stderr, env) + toStringR(line, env);
                            }
                        }
                    }

                    if (ZVal.isEmpty(pipes.getObject())) {
                        break;
                    }
                }
            }

        } else {
            if (arrayActionR(ArrayAction.ISSET, pipes, env, 1)) {
                stdout =
                        NamespaceGlobal.stream_get_contents
                                .env(env)
                                .call(pipes.arrayGet(env, 1))
                                .value();
                function_fclose.f.env(env).call(pipes.arrayGet(env, 1));
            }

            if (arrayActionR(ArrayAction.ISSET, pipes, env, 2)) {
                stderr =
                        NamespaceGlobal.stream_get_contents
                                .env(env)
                                .call(pipes.arrayGet(env, 2))
                                .value();
                function_fclose.f.env(env).call(pipes.arrayGet(env, 2));
            }
        }

        if (arrayActionR(ArrayAction.ISSET, handles, env, 1)) {
            NamespaceGlobal.rewind.env(env).call(handles.arrayGet(env, 1));
            stdout =
                    NamespaceGlobal.stream_get_contents
                            .env(env)
                            .call(handles.arrayGet(env, 1))
                            .value();
            function_fclose.f.env(env).call(handles.arrayGet(env, 1));
        }

        if (arrayActionR(ArrayAction.ISSET, handles, env, 2)) {
            NamespaceGlobal.rewind.env(env).call(handles.arrayGet(env, 2));
            stderr =
                    NamespaceGlobal.stream_get_contents
                            .env(env)
                            .call(handles.arrayGet(env, 2))
                            .value();
            function_fclose.f.env(env).call(handles.arrayGet(env, 2));
        }

        NamespaceGlobal.proc_close.env(env).call(process);
        this.cleanup(env);
        return ZVal.assign(ZVal.newArray(new ZPair("stdout", stdout), new ZPair("stderr", stderr)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pipe")
    @ConvertedParameter(index = 1, name = "job", typeHint = "string")
    protected Object process(RuntimeEnv env, Object... args) {
        Object pipe = assignParameter(args, 0, false);
        Object job = assignParameter(args, 1, false);
        function_fwrite.f.env(env).call(pipe, job);
        return null;
    }

    @ConvertedMethod
    protected Object cleanup(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.tempFile)) {
            NamespaceGlobal.unlink.env(env).call(this.tempFile);
        }

        return null;
    }

    @ConvertedMethod
    protected Object useTemporaryFile(RuntimeEnv env, Object... args) {
        return ZVal.assign(false);
    }

    public static final Object CONST_class = "PHPUnit\\Util\\PHP\\DefaultPhpProcess";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractPhpProcess.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\PHP\\DefaultPhpProcess")
                    .setLookup(
                            DefaultPhpProcess.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "args",
                            "env",
                            "runtime",
                            "stderrRedirection",
                            "stdin",
                            "tempFile",
                            "timeout")
                    .setFilename("vendor/phpunit/phpunit/src/Util/PHP/DefaultPhpProcess.php")
                    .addExtendsClass("PHPUnit\\Util\\PHP\\AbstractPhpProcess")
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
