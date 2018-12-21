package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.ExecutionLoop.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.string.function_stripos;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.BreakException;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.ExecutionLoop.classes.AbstractListener;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.Context;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fwrite;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_error_get_last;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/ExecutionLoop/ProcessForker.php

*/

public class ProcessForker extends AbstractListener {

    public Object savegame = null;

    public Object up = null;

    public ProcessForker(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ProcessForker(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "shell", typeHint = "Psy\\Shell")
    public Object beforeRun(RuntimeEnv env, Object... args) {
        Object shell = assignParameter(args, 0, false);
        Object msg = null;
        ReferenceContainer read = new BasicReferenceContainer(null);
        ReferenceContainer err = new BasicReferenceContainer(null);
        Object pid = null;
        Object down = null;
        Object n = null;
        Object content = null;
        ReferenceContainer except = new BasicReferenceContainer(null);
        Object up = null;
        Object runtimeTempArrayResult155 = null;
        ReferenceContainer write = new BasicReferenceContainer(null);
        ZVal.list(
                runtimeTempArrayResult155 =
                        NamespaceGlobal.stream_socket_pair.env(env).call(1, 1, 0).value(),
                (up = listGet(runtimeTempArrayResult155, 0, env)),
                (down = listGet(runtimeTempArrayResult155, 1, env)));
        if (!ZVal.isTrue(up)) {
            throw ZVal.getException(env, new RuntimeException(env, "Unable to create socket pair"));
        }

        pid =
                com.runtimeconverter.runtime.ZVal.functionNotFound("pcntl_fork")
                        .env(env)
                        .call()
                        .value();
        if (ZVal.isLessThan(pid, '<', 0)) {
            throw ZVal.getException(
                    env, new RuntimeException(env, "Unable to start execution loop"));

        } else if (ZVal.isGreaterThan(pid, '>', 0)) {
            function_fclose.f.env(env).call(up);
            read.setObject(ZVal.newArray(new ZPair(0, down)));
            write.setObject(ZVal.getNull());
            except.setObject(ZVal.getNull());
            do {
                n =
                        NamespaceGlobal.stream_select
                                .env(env)
                                .addReferenceArgs(
                                        new RuntimeArgsWithReferences()
                                                .add(0, read)
                                                .add(1, write)
                                                .add(2, except))
                                .call(
                                        read.getObject(),
                                        write.getObject(),
                                        except.getObject(),
                                        ZVal.getNull())
                                .value();
                if (ZVal.strictEqualityCheck(n, "===", 0)) {
                    throw ZVal.getException(
                            env,
                            new RuntimeException(
                                    env, "Process timed out waiting for execution loop"));
                }

                if (ZVal.strictEqualityCheck(n, "===", false)) {
                    err.setObject(function_error_get_last.f.env(env).call().value());
                    if (ZVal.toBool(!arrayActionR(ArrayAction.ISSET, err, env, "message"))
                            || ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            function_stripos
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            err.arrayGet(env, "message"),
                                                            "interrupted system call")
                                                    .value(),
                                            "===",
                                            false))) {
                        msg =
                                ZVal.assign(
                                        ZVal.isTrue(err.arrayGet(env, "message"))
                                                ? function_sprintf
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "Error waiting for execution loop: %s",
                                                                err.arrayGet(env, "message"))
                                                        .value()
                                                : "Error waiting for execution loop");
                        throw ZVal.getException(env, new RuntimeException(env, msg));
                    }
                }

            } while (ZVal.isLessThan(n, '<', 1));

            content = NamespaceGlobal.stream_get_contents.env(env).call(down).value();
            function_fclose.f.env(env).call(down);
            if (ZVal.isTrue(content)) {
                env.callMethod(
                        shell,
                        "setScopeVariables",
                        ProcessForker.class,
                        function_unserialize.f.env(env).call(content).value());
            }

            throw ZVal.getException(env, new BreakException(env, "Exiting main thread"));
        }

        if (function_function_exists.f.env(env).call("setproctitle").getBool()) {
            com.runtimeconverter.runtime.ZVal.functionNotFound("setproctitle")
                    .env(env)
                    .call("psysh (loop)");
        }

        function_fclose.f.env(env).call(down);
        this.up = up;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "shell", typeHint = "Psy\\Shell")
    public Object beforeLoop(RuntimeEnv env, Object... args) {
        Object shell = assignParameter(args, 0, false);
        this.createSavegame(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "shell", typeHint = "Psy\\Shell")
    public Object afterLoop(RuntimeEnv env, Object... args) {
        Object shell = assignParameter(args, 0, false);
        if (ZVal.isset(this.savegame)) {
            NamespaceGlobal.posix_kill
                    .env(env)
                    .call(this.savegame, function_constant.get(env, "SIGKILL"));
            com.runtimeconverter.runtime.ZVal.functionNotFound("pcntl_signal_dispatch")
                    .env(env)
                    .call();
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "shell", typeHint = "Psy\\Shell")
    public Object afterRun(RuntimeEnv env, Object... args) {
        Object shell = assignParameter(args, 0, false);
        if (ZVal.isset(this.up)) {
            function_fwrite
                    .f
                    .env(env)
                    .call(
                            this.up,
                            this.serializeReturn(
                                    env,
                                    env.callMethod(
                                            shell,
                                            "getScopeVariables",
                                            ProcessForker.class,
                                            false)));
            function_fclose.f.env(env).call(this.up);
            NamespaceGlobal.posix_kill
                    .env(env)
                    .call(
                            NamespaceGlobal.posix_getpid.env(env).call().value(),
                            function_constant.get(env, "SIGKILL"));
        }

        return null;
    }

    @ConvertedMethod
    private Object createSavegame(RuntimeEnv env, Object... args) {
        Object pid = null;
        Object status = null;
        this.savegame = NamespaceGlobal.posix_getpid.env(env).call().value();
        pid =
                com.runtimeconverter.runtime.ZVal.functionNotFound("pcntl_fork")
                        .env(env)
                        .call()
                        .value();
        if (ZVal.isLessThan(pid, '<', 0)) {
            throw ZVal.getException(
                    env, new RuntimeException(env, "Unable to create savegame fork"));

        } else if (ZVal.isGreaterThan(pid, '>', 0)) {
            com.runtimeconverter.runtime.ZVal.functionNotFound("pcntl_waitpid")
                    .env(env)
                    .call(pid, status);
            if (!com.runtimeconverter.runtime.ZVal.functionNotFound("pcntl_wexitstatus")
                    .env(env)
                    .call(status)
                    .getBool()) {
                NamespaceGlobal.posix_kill
                        .env(env)
                        .call(
                                NamespaceGlobal.posix_getpid.env(env).call().value(),
                                function_constant.get(env, "SIGKILL"));
            }

            this.createSavegame(env);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "return", typeHint = "array")
    private Object serializeReturn(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object _pReturn = assignParameter(args, 0, false);
        Object e = null;
        ReferenceContainer serializable = new BasicReferenceContainer(null);
        Object value = null;
        Object key = null;
        serializable.setObject(ZVal.newArray());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1395 : ZVal.getIterable(_pReturn, env, false)) {
            key = ZVal.assign(zpairResult1395.getKey());
            value = ZVal.assign(zpairResult1395.getValue());
            if (ZVal.isTrue(Context.runtimeStaticObject.isSpecialVariableName(env, key))) {
                continue;
            }

            if (ZVal.toBool(function_is_resource.f.env(env).call(value).value())
                    || ZVal.toBool(ZVal.checkInstanceType(value, Closure.class, "Closure"))) {
                continue;
            }

            try {
                function_serialize.f.env(env).call(value).value();
                serializable.arrayAccess(env, key).set(value);
            } catch (ConvertedException convertedException189) {
                if (convertedException189.instanceOf(Throwable.class, "Throwable")) {
                    e = convertedException189.getObject();
                } else if (convertedException189.instanceOf(PHPException.class, "Exception")) {
                    e = convertedException189.getObject();
                } else {
                    throw convertedException189;
                }
            }
        }

        return ZVal.assign(function_serialize.f.env(env).call(serializable.getObject()).value());
    }

    public static final Object CONST_class = "Psy\\ExecutionLoop\\ProcessForker";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractListener.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object isSupported(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    ZVal.toBool(function_function_exists.f.env(env).call("pcntl_signal").value())
                            && ZVal.toBool(
                                    function_function_exists
                                            .f
                                            .env(env)
                                            .call("posix_getpid")
                                            .value()));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\ExecutionLoop\\ProcessForker")
                    .setLookup(
                            ProcessForker.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("savegame", "up")
                    .setFilename("vendor/psy/psysh/src/ExecutionLoop/ProcessForker.php")
                    .addInterface("Psy\\ExecutionLoop\\Listener")
                    .addExtendsClass("Psy\\ExecutionLoop\\AbstractListener")
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
