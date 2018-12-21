package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.classes.Finder;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeInterfaces.SessionHandlerInterface;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Carbon;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Session/FileSessionHandler.php

*/

public class FileSessionHandler extends RuntimeClassBase implements SessionHandlerInterface {

    public Object files = null;

    public Object path = null;

    public Object minutes = null;

    public FileSessionHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FileSessionHandler.class) {
            this.__construct(env, args);
        }
    }

    public FileSessionHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "files", typeHint = "Illuminate\\Filesystem\\Filesystem")
    @ConvertedParameter(index = 1, name = "path")
    @ConvertedParameter(index = 2, name = "minutes")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object files = assignParameter(args, 0, false);
        Object path = assignParameter(args, 1, false);
        Object minutes = assignParameter(args, 2, false);
        this.path = path;
        this.files = files;
        this.minutes = minutes;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "savePath")
    @ConvertedParameter(index = 1, name = "sessionName")
    public Object open(RuntimeEnv env, Object... args) {
        Object savePath = assignParameter(args, 0, false);
        Object sessionName = assignParameter(args, 1, false);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object close(RuntimeEnv env, Object... args) {
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    public Object read(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        Object path = null;
        if (ZVal.isTrue(
                env.callMethod(
                        this.files,
                        "exists",
                        FileSessionHandler.class,
                        path = toStringR(this.path, env) + "/" + toStringR(sessionId, env)))) {
            if (ZVal.isGreaterThanOrEqualTo(
                    NamespaceGlobal.filemtime.env(env).call(path).value(),
                    ">=",
                    env.callMethod(
                            env.callMethod(
                                    Carbon.runtimeStaticObject.now(env),
                                    "subMinutes",
                                    FileSessionHandler.class,
                                    this.minutes),
                            "getTimestamp",
                            FileSessionHandler.class))) {
                return ZVal.assign(
                        env.callMethod(this.files, "get", FileSessionHandler.class, path, true));
            }
        }

        return "";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    @ConvertedParameter(index = 1, name = "data")
    public Object write(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        env.callMethod(
                this.files,
                "put",
                FileSessionHandler.class,
                toStringR(this.path, env) + "/" + toStringR(sessionId, env),
                data,
                true);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    public Object destroy(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        env.callMethod(
                this.files,
                "delete",
                FileSessionHandler.class,
                toStringR(this.path, env) + "/" + toStringR(sessionId, env));
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "lifetime")
    public Object gc(RuntimeEnv env, Object... args) {
        Object lifetime = assignParameter(args, 0, false);
        Object file = null;
        Object files = null;
        files =
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                Finder.runtimeStaticObject.create(env),
                                                "in",
                                                FileSessionHandler.class,
                                                this.path),
                                        "files",
                                        FileSessionHandler.class),
                                "ignoreDotFiles",
                                FileSessionHandler.class,
                                true),
                        "date",
                        FileSessionHandler.class,
                        "<= now - " + toStringR(lifetime, env) + " seconds");
        for (ZPair zpairResult539 : ZVal.getIterable(files, env, true)) {
            file = ZVal.assign(zpairResult539.getValue());
            env.callMethod(
                    this.files,
                    "delete",
                    FileSessionHandler.class,
                    env.callMethod(file, "getRealPath", FileSessionHandler.class));
        }

        return null;
    }

    public static final Object CONST_class = "Illuminate\\Session\\FileSessionHandler";

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
                    .setName("Illuminate\\Session\\FileSessionHandler")
                    .setLookup(
                            FileSessionHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("files", "minutes", "path")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Session/FileSessionHandler.php")
                    .addInterface("SessionHandlerInterface")
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
