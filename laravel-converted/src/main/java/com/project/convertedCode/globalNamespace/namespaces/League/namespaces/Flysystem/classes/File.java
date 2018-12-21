package com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.Handler;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/league/flysystem/src/File.php

*/

public class File extends Handler {

    public File(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == File.class) {
            this.__construct(env, args);
        }
    }

    public File(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object exists(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("filesystem").value(),
                        "has",
                        File.class,
                        toObjectR(this).accessProp(this, env).name("path").value()));
    }

    @ConvertedMethod
    public Object read(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("filesystem").value(),
                        "read",
                        File.class,
                        toObjectR(this).accessProp(this, env).name("path").value()));
    }

    @ConvertedMethod
    public Object readStream(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("filesystem").value(),
                        "readStream",
                        File.class,
                        toObjectR(this).accessProp(this, env).name("path").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content")
    public Object write(RuntimeEnv env, Object... args) {
        Object content = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("filesystem").value(),
                        "write",
                        File.class,
                        toObjectR(this).accessProp(this, env).name("path").value(),
                        content));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    public Object writeStream(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("filesystem").value(),
                        "writeStream",
                        File.class,
                        toObjectR(this).accessProp(this, env).name("path").value(),
                        resource));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content")
    public Object update(RuntimeEnv env, Object... args) {
        Object content = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("filesystem").value(),
                        "update",
                        File.class,
                        toObjectR(this).accessProp(this, env).name("path").value(),
                        content));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    public Object updateStream(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("filesystem").value(),
                        "updateStream",
                        File.class,
                        toObjectR(this).accessProp(this, env).name("path").value(),
                        resource));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content")
    public Object put(RuntimeEnv env, Object... args) {
        Object content = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("filesystem").value(),
                        "put",
                        File.class,
                        toObjectR(this).accessProp(this, env).name("path").value(),
                        content));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    public Object putStream(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("filesystem").value(),
                        "putStream",
                        File.class,
                        toObjectR(this).accessProp(this, env).name("path").value(),
                        resource));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "newpath")
    public Object rename(RuntimeEnv env, Object... args) {
        Object newpath = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("filesystem").value(),
                        "rename",
                        File.class,
                        toObjectR(this).accessProp(this, env).name("path").value(),
                        newpath))) {
            toObjectR(this).accessProp(this, env).name("path").set(newpath);
            return ZVal.assign(true);
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "newpath")
    public Object copy(RuntimeEnv env, Object... args) {
        Object newpath = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("filesystem").value(),
                        "copy",
                        File.class,
                        toObjectR(this).accessProp(this, env).name("path").value(),
                        newpath))) {
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .League
                            .namespaces
                            .Flysystem
                            .classes
                            .File(
                            env,
                            toObjectR(this).accessProp(this, env).name("filesystem").value(),
                            newpath));
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object getTimestamp(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("filesystem").value(),
                        "getTimestamp",
                        File.class,
                        toObjectR(this).accessProp(this, env).name("path").value()));
    }

    @ConvertedMethod
    public Object getMimetype(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("filesystem").value(),
                        "getMimetype",
                        File.class,
                        toObjectR(this).accessProp(this, env).name("path").value()));
    }

    @ConvertedMethod
    public Object getVisibility(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("filesystem").value(),
                        "getVisibility",
                        File.class,
                        toObjectR(this).accessProp(this, env).name("path").value()));
    }

    @ConvertedMethod
    public Object getMetadata(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("filesystem").value(),
                        "getMetadata",
                        File.class,
                        toObjectR(this).accessProp(this, env).name("path").value()));
    }

    @ConvertedMethod
    public Object getSize(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("filesystem").value(),
                        "getSize",
                        File.class,
                        toObjectR(this).accessProp(this, env).name("path").value()));
    }

    @ConvertedMethod
    public Object delete(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("filesystem").value(),
                        "delete",
                        File.class,
                        toObjectR(this).accessProp(this, env).name("path").value()));
    }

    public static final Object CONST_class = "League\\Flysystem\\File";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Handler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("League\\Flysystem\\File")
                    .setLookup(
                            File.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("filesystem", "path")
                    .setFilename("vendor/league/flysystem/src/File.php")
                    .addExtendsClass("League\\Flysystem\\Handler")
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
